import json
import os
import time
import shutil
import re
import subprocess

JAVA_ANALYZER = "./java_analyzer/target/java-analyzer-1.0-SNAPSHOT-shaded.jar"
SKIP_EXIST = True


class JavaFileParsingError(Exception):
    pass


class D4JEnv:
    def __init__(self, pid, vid, tmp_dir, output_dir):
        self.pid, self.vid = pid, vid
        self.tmp_dir = tmp_dir
        self.output_dir = output_dir

        if not os.path.exists(tmp_dir):
            os.system(f"defects4j checkout -p {pid} -v {vid}b -w {tmp_dir}")

        properties_to_export = [
            "classes.relevant",
            "tests.all",
            "tests.trigger",
            "dir.src.classes",
            "dir.src.tests",
            "dir.bin.classes",
            "cp.compile",
        ]
        for p in properties_to_export:
            if not os.path.exists(os.path.join(tmp_dir, p)):
                os.system(f"cd {tmp_dir} && defects4j export -p {p} -o {p}")

        with open(os.path.join(tmp_dir, "dir.src.classes"), "r") as f:
            self.dir_src_classes = f.read()
        with open(os.path.join(tmp_dir, "dir.src.tests"), "r") as f:
            self.dir_src_tests = f.read()
        with open(os.path.join(tmp_dir, "tests.all"), "r") as f:
            self.all_tests = f.read().splitlines()
        with open(os.path.join(tmp_dir, "tests.trigger"), "r") as f:
            self.triggering_tests = f.read().splitlines()
        with open(os.path.join(tmp_dir, "classes.relevant"), "r") as f:
            self.relevant_classes = [l.strip() for l in f]
        with open(os.path.join(tmp_dir, "dir.bin.classes"), "r") as f:
            self.dir_bin_classes = f.read()
        with open(os.path.join(tmp_dir, "cp.compile"), "r") as f:
            self.cp_compile = f.read()

        self.all_test_classes = []
        for dirpath, subdirs, files in os.walk(
            os.path.join(self.tmp_dir, self.dir_src_tests)
        ):
            for filename in files:
                if not filename.endswith(".java"):
                    continue
                class_name = (
                    os.path.relpath(
                        dirpath, os.path.join(self.tmp_dir, self.dir_src_tests)
                    ).replace("/", ".")
                    + "."
                    + filename[:-5]
                )
                self.all_test_classes.append(class_name)

        assert set(self.all_test_classes).issuperset(
            set([cname.split("$")[0] for cname in self.all_tests])
        )

        if not os.path.exists(output_dir):
            os.mkdir(output_dir)
        if not os.path.exists(os.path.join(output_dir, "range")):
            os.mkdir(os.path.join(output_dir, "range"))
        if not os.path.exists(os.path.join(output_dir, "failing_tests")):
            os.system(f"cd {tmp_dir} && defects4j test")
            shutil.copyfile(
                os.path.join(tmp_dir, "failing_tests"),
                os.path.join(output_dir, "failing_tests"),
            )

        self._full_names_of_rel_classes = None
        self._full_names_of_all_classes = None
        self.new_range_files = set()

    @property
    def full_names_of_rel_classes(self):
        # get the class full name using the relevant class information
        if self._full_names_of_rel_classes is None:
            self._full_names_of_rel_classes = {}
            for rc in self.relevant_classes:
                class_name = rc.split(".")[-1]
                if class_name not in self._full_names_of_rel_classes:
                    self._full_names_of_rel_classes[class_name] = []
                self._full_names_of_rel_classes[class_name].append(rc)
        return self._full_names_of_rel_classes

    @property
    def full_names_of_all_classes(self):
        if self._full_names_of_all_classes is None:
            if not os.path.exists(os.path.join(self.tmp_dir, self.dir_bin_classes)):
                os.system(f"cd {self.tmp_dir} && defects4j compile")

            all_classes = []
            for root, subdirs, files in os.walk(
                os.path.join(self.tmp_dir, self.dir_bin_classes)
            ):
                package = os.path.relpath(
                    root, os.path.join(self.tmp_dir, self.dir_bin_classes)
                ).replace("/", ".")
                for f in files:
                    if f[-6:] == ".class":
                        classname = f[:-6]
                        all_classes.append(package + "." + classname)

            self._full_names_of_all_classes = {}
            for rc in all_classes:
                class_name = rc.split(".")[-1]
                if class_name not in self._full_names_of_all_classes:
                    self._full_names_of_all_classes[class_name] = []
                self._full_names_of_all_classes[class_name].append(rc)
        return self._full_names_of_all_classes

    def measure_coverage_col_time(self, tc):
        start = time.time()
        os.system(f"cd {self.tmp_dir} && defects4j coverage -t {tc}")
        return time.time() - start

    def get_class_full_names(self, simple_name):
        if simple_name in self.full_names_of_rel_classes:
            return self.full_names_of_rel_classes[simple_name]
        else:
            return self.full_names_of_all_classes[simple_name]

    def get_src_path(self, class_name):
        return os.path.join(
            self.dir_src_classes, class_name.replace(".", "/") + ".java"
        )

    def get_package_name(self, src_path):
        assert src_path.endswith(".java")
        return os.path.dirname(os.path.relpath(src_path, self.dir_src_classes)).replace(
            "/", "."
        )

    def get_class_name(self, src_path):
        assert src_path.endswith(".java")
        return os.path.relpath(src_path, self.dir_src_classes)[:-5].replace("/", ".")

    def get_range_path(self, src_path):
        return os.path.join(
            os.path.join(self.output_dir, "range"), src_path.replace("/", "+")
        )

    def analyze_src_file(self, src_path, overwrite=False, verbose=True):
        if not os.path.exists(os.path.join(self.tmp_dir, src_path)):
            return None
        output_path = self.get_range_path(src_path)
        if not os.path.exists(output_path) or (
            overwrite and output_path not in self.new_range_files
        ):
            command = f'java -jar {JAVA_ANALYZER} {os.path.join(self.tmp_dir, src_path)} {output_path} {os.path.join(self.tmp_dir, self.dir_src_classes)} {self.cp_compile.replace(":", " ")}'
            if self.pid == "Mockito":
                command += " /defects4j/framework/projects/lib/junit-4.11.jar"
            if verbose:
                print(command)
            os.system(command)
            if not os.path.exists(output_path):  # error handling
                abs_src_path = os.path.join(self.tmp_dir, src_path)
                original_code = ""
                with open(abs_src_path, "r") as f:
                    original_code = f.read()
                new_code = "\n".join(
                    [
                        l if "sealed" not in l else f"// {l}"
                        for l in original_code.splitlines()
                    ]
                )
                new_code = "\n".join(
                    [
                        l if ".enum" not in l else f"// {l}"
                        for l in original_code.splitlines()
                    ]
                )
                with open(abs_src_path, "w") as f:
                    f.write(new_code)
                if verbose:
                    print("**this is rerun**")
                    print(command)
                os.system(command)  # rerun
                with open(abs_src_path, "w") as f:
                    f.write(original_code)  # restore

        if os.path.exists(output_path):
            self.new_range_files.add(output_path)
            return output_path
        else:
            raise JavaFileParsingError(f"Error while parsing java file: {src_path}")

    def get_method_code(self, src_path, method_name, line_no):
        match = None

        range_path = self.analyze_src_file(src_path)
        if not range_path:
            return None

        with open(range_path, "r") as f:
            data = json.load(f)
            nodes = data["nodes"]

        min_begin_line_diff = None
        for node in nodes:
            if node["type"] not in ["method", "constructor"]:
                continue
            if method_name not in node["signature"]:
                continue
            start_line, end_line = node["begin_line"], node["end_line"]
            begin_line_diff = abs(start_line - int(line_no))
            if min_begin_line_diff is None or begin_line_diff < min_begin_line_diff:
                min_begin_line_diff = begin_line_diff
                match = node

        if match is None:
            return None

        with open(os.path.join(self.tmp_dir, src_path), errors="backslashreplace") as f:
            code_lines = f.read().splitlines()
            snippet = "\n".join(code_lines[match["begin_line"] - 1 : match["end_line"]])

        parent_types = []
        if "@inheritDoc" in match["comment"]:
            for node in nodes:
                if (
                    node["type"] == "class_interface"
                    and node["name"] in match["signature"]
                ):
                    parent_types += [
                        re.match("^[\w\.]+", t).group(0) for t in node["parent_types"]
                    ]

        # signature, snippet, comment, parent class types if comment includes {@inheritDoc} else []
        return (
            match["signature"],
            snippet,
            match["begin_line"],
            match["end_line"],
            match["comment"],
            list(set(parent_types)),
        )

    def get_comment(self, src_path, method_signature):
        comment = None
        parent_types = []

        range_path = self.analyze_src_file(src_path)
        if range_path:
            with open(range_path, "r") as f:
                data = json.load(f)
                nodes = data["nodes"]

            for node in nodes:
                if node["type"] not in ["method", "constructor"]:
                    continue
                if method_signature not in node["signature"]:
                    continue
                comment = node["comment"]
                break

            if comment is None or "@inheritDoc" in comment:
                for node in nodes:
                    if node["type"] == "class_interface" and node["name"] in src_path:
                        parent_types += [
                            re.match("^[\w\.]+", t).group(0)
                            for t in node["parent_types"]
                        ]

        return comment, parent_types

    def get_field_definitions(self, src_path):
        range_path = self.analyze_src_file(src_path)
        package_name = self.get_package_name(src_path)
        if not range_path:
            return None

        with open(range_path, "r") as f:
            data = json.load(f)
            nodes = data["nodes"]

        line_to_class_name = {}
        for node in nodes:
            if node["type"] == "class_interface":
                for lineno in range(node["begin_line"], node["end_line"] + 1):
                    line_to_class_name[lineno] = node["name"]

        with open(os.path.join(self.tmp_dir, src_path), errors="backslashreplace") as f:
            code_lines = f.read().splitlines()

        fields = []
        field_nodes = [n for n in nodes if n["type"] == "field"]
        for node in field_nodes:
            code_snippet = "\n".join(
                code_lines[node["begin_line"] - 1 : node["end_line"]]
            )
            try:
                class_name = package_name + "." + line_to_class_name[node["begin_line"]]
            except Exception as e:
                # probably enum
                class_name = self.get_class_name(src_path)

            for varname in node["varNames"]:
                signature = class_name + "." + varname
                fields.append(
                    {
                        "class_name": class_name,
                        "src_path": src_path,
                        "signature": signature,
                        "snippet": code_snippet,
                        "begin_line": node["begin_line"],
                        "end_line": node["end_line"],
                        "comment": node["comment"],
                    }
                )
        return fields

    def get_path_to_test_class(self, testclass):
        return os.path.join(self.dir_src_tests, testclass.replace(".", "/") + ".java")


def lenient_matching(class_name, class_expr):
    if class_name == class_expr:
        return True
    if class_expr.count(".") > class_name.count("."):
        return False
    return ".".join(class_name.split(".")[-class_expr.count(".") - 1 :]) == class_expr


def get_transitive_childs(child_classes: dict, class_name: str) -> set:
    def _get_childs(cn):
        if cn not in child_classes:
            return set()
        childs = child_classes[cn]
        for c_cn in list(childs):
            childs = childs.union(_get_childs(c_cn))
        return childs

    return _get_childs(class_name)


if __name__ == "__main__":
    target_proj = [
        "Chart",
        "Cli",
        "Closure",
        "Codec",
        "Csv",
        "Gson",
        "JacksonCore",
        "JacksonDatabind",
        "Jsoup",
        "Lang",
        "Math",
        "Mockito",
    ]
    npe_bugs = [
        "Chart_2",
        "Chart_4",
        "Chart_14",
        "Chart_16",
        "Cli_5",
        "Cli_30",
        "Closure_2",
        "Closure_171",
        # "Codec_5", # UnicodeDecodeError: 'utf-8' codec can't decode byte 0xe9 in position 2823: invalid continuation byte
        "Codec_13",
        "Codec_17",
        "Csv_4",
        "Csv_9",
        "Csv_11",
        "Gson_6",
        "Gson_9",
        "Jacksoncore_8",
        "Jacksondatabind_3",
        "Jacksondatabind_13",
        "Jacksondatabind_80",
        "Jacksondatabind_93",
        "Jacksondatabind_95",
        "Jacksondatabind_107",
        "Jsoup_8",
        "Jsoup_22",
        "Jsoup_26",
        "Jsoup_66",
        "Jsoup_89",
        "Lang_20",
        "Lang_33",
        "Lang_39",
        "Lang_47",
        "Lang_57",
        "Math_4",
        "Math_70",
        "Math_79",
        # "Mockito_18", # AssertionError
        "Mockito_38"
    ]

    subjects = []
    for proj in target_proj:
        with open(f"/defects4j/framework/projects/{proj}/active-bugs.csv", "r") as f:
            f.readline()
            vids = [l.split(",")[0] for l in f.readlines()]
        subjects += [f"{proj}_{i}" for i in vids]

    print(subjects)
    for key in subjects:
        if key not in npe_bugs:
            continue
        output_dir = f"./new_data/{key}"
        pid, vid = tuple(key.split("_"))
        if (
            SKIP_EXIST
            and os.path.exists(os.path.join(output_dir, "snippet.json"))
            and os.path.exists(os.path.join(output_dir, "test_snippet.json"))
            and os.path.exists(os.path.join(output_dir, "failing_tests"))
        ):
            continue
        tmp_dir = f"/tmp/{pid}-{vid}b"

        # 1. Cobertura
        # env = D4JEnv(pid, vid, tmp_dir, output_dir)
        # coverage_collection_time = {}
        # for tc in env.triggering_tests:
        #    coverage_collection_time[tc] = env.measure_coverage_col_time(tc)

        # 2. GZoltar
        os.system(f"sh run_gzoltar.sh {pid} {vid} new_data")  # run gzoltar
        with open(
            os.path.join(output_dir, "gzoltar", "coverage_collection_time_ns.txt"), "r"
        ) as f:
            coverage_collection_time = float(f.read()) / (10**9)  # nanoseconds
        print("Coverage collection:", coverage_collection_time)

        env = D4JEnv(pid, vid, tmp_dir, output_dir)

        time_start = time.time()
        test_snippets = []
        test_range_files = {}
        child_classes = {}
        for test_class in env.all_test_classes:
            try:
                test_range_files[test_class] = env.analyze_src_file(
                    env.get_path_to_test_class(test_class), overwrite=True
                )

                parent_types = []
                with open(test_range_files[test_class], "r") as f:
                    range_data = json.load(f)
                class_interface_nodes = [
                    node
                    for node in range_data["nodes"]
                    if node["type"] == "class_interface"
                ]
                for node in class_interface_nodes:
                    for parent_class in node["parent_types"]:
                        for class_name in env.all_test_classes:
                            if class_name != test_class and lenient_matching(
                                class_name, parent_class
                            ):
                                parent_types.append(class_name)
                # update child class dict (parent -> child)
                for parent_class in parent_types:
                    child_classes[parent_class] = child_classes.get(parent_class, set())
                    child_classes[parent_class].add(test_class)

            except JavaFileParsingError as e:
                print(str(e))
                continue
        """
        child_classes = {}
        # trick to always pass the predicate of the while statement in the first iteration
        num_test_range_files = len(test_range_files) - 1
        # collect parent test classes of failed test classes
        while len(test_range_files) > num_test_range_files:
            num_test_range_files = len(test_range_files)
            matching_classes = set()
            for test_class in test_range_files.keys():
                parent_types = []
                with open(test_range_files[test_class], 'r') as f:
                    range_data = json.load(f)
                class_interface_nodes = [node for node in range_data["nodes"] if node["type"] == "class_interface"]
                for node in class_interface_nodes:
                    for parent_class in node["parent_types"]:
                        for class_name in env.all_test_classes:
                            if class_name != test_class and lenient_matching(class_name, parent_class):
                                parent_types.append(class_name)
                # update child class dict (parent -> child)
                for parent_class in parent_types:
                    child_classes[parent_class] = child_classes.get(parent_class, set())
                    child_classes[parent_class].add(test_class)
                # update matching classes
                matching_classes.update(parent_types)
            for class_name in matching_classes:
                if class_name in test_range_files:
                    continue
                print(test_range_files)
                print(class_name)
                test_range_files[class_name] = env.analyze_src_file(env.get_path_to_test_class(class_name), overwrite=False)
        """
        for test_class in test_range_files:
            with open(test_range_files[test_class], "r") as f:
                range_data = json.load(f)
            with open(range_data["filepath"], "r") as f:
                code_lines = f.read().splitlines()
            # save test snippet info
            for node in range_data["nodes"]:
                if node["type"] not in ["constructor", "method"]:
                    continue
                snippet = "\n".join(
                    code_lines[node["begin_line"] - 1 : node["end_line"]]
                )
                test_snippets.append(
                    {
                        "class_name": test_class,
                        "child_classes": list(
                            get_transitive_childs(child_classes, test_class)
                        ),
                        "src_path": env.get_path_to_test_class(test_class),
                        "signature": node["signature"],
                        "snippet": snippet,
                        "begin_line": node["begin_line"],
                        "end_line": node["end_line"],
                        "comment": node["comment"],
                        "child_ranges": node["child_ranges"],
                    }
                )
        with open(os.path.join(output_dir, "test_snippet.json"), "w") as f:
            json.dump(test_snippets, f, indent=4)

        need_comment_resolution = False

        code_range_files = {}
        field_defs = []
        method_snippets = []
        for class_name in sum(env.full_names_of_all_classes.values(), []):
            src_path = env.get_src_path(class_name)

            try:
                range_file = env.analyze_src_file(src_path, overwrite=True)
                if range_file:
                    code_range_files[class_name] = range_file
                else:
                    continue
            except JavaFileParsingError as e:
                parsing_error = str(e)
                continue

            with open(
                os.path.join(env.tmp_dir, src_path), errors="backslashreplace"
            ) as f:
                code_lines = f.read().splitlines()

            with open(code_range_files[class_name], "r") as f:
                range_data = json.load(f)
                nodes = range_data["nodes"]

            for node in nodes:
                if node["type"] not in ["constructor", "method"]:
                    continue

                snippet = "\n".join(
                    code_lines[node["begin_line"] - 1 : node["end_line"]]
                )

                parent_types = []
                if "@inheritDoc" in node["comment"]:
                    for n in nodes:
                        if (
                            n["type"] == "class_interface"
                            and n["name"] in node["signature"]
                        ):
                            parent_types += [
                                re.match("^[\w\.]+", t).group(0)
                                for t in n["parent_types"]
                            ]
                parent_types = list(set(parent_types))
                if parent_types:
                    need_comment_resolution = True

                method_snippets.append(
                    {
                        "src_path": src_path,
                        "class_name": class_name,
                        "signature": node["signature"],
                        "snippet": snippet,
                        "begin_line": node["begin_line"],
                        "end_line": node["end_line"],
                        "comment": node["comment"],
                        "resolved_comments": {
                            pc: "<NOT RESOLVED>" for pc in parent_types
                        },
                    }
                )

            field_defs += env.get_field_definitions(src_path)

        while need_comment_resolution:
            # recursively resolve {@inheritDoc}
            need_comment_resolution = False
            for method in method_snippets:
                if "resolved_comments" not in method:
                    continue
                next_parent_types = set()
                for pc in method["resolved_comments"]:
                    if (
                        method["resolved_comments"][pc] == "<NOT RESOLVED>"
                    ):  # unsolved yet
                        try:
                            comment, parent_types = env.get_comment(
                                env.get_src_path(pc), method["signature"].split(".")[-1]
                            )
                        except JavaFileParsingError as e:
                            comment, parent_types = None, []
                        method["resolved_comments"][pc] = comment
                        next_parent_types.update(parent_types)
                for pc in next_parent_types:
                    if pc not in method["resolved_comments"]:
                        method["resolved_comments"][pc] = "<NOT RESOLVED>"
                        need_comment_resolution = True

        with open(os.path.join(output_dir, "field_snippet.json"), "w") as f:
            json.dump(field_defs, f, indent=4)

        with open(os.path.join(output_dir, "snippet.json"), "w") as f:
            json.dump(method_snippets, f, indent=4)

        snippet_collection_time = time.time() - time_start

        with open(os.path.join(output_dir, "time.json"), "w") as f:
            json.dump(
                {
                    "coverage_collection": coverage_collection_time,
                    "snippet_retrieval": snippet_collection_time,
                },
                f,
                indent=4,
            )
        shutil.rmtree(tmp_dir)

        # break
    # if not os.path.exists("./data/snippet"):
    #     os.mkdir("./data/snippet")

    # for key in sbfl_results:
    #     if os.path.exists(f"./data/{key}/snippet.json"):
    #         shutil.copyfile(f"./data/{key}/snippet.json", f"./data/snippet/{key}.json")
