{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CommandLineRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineRunner",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractCommandLineRunner\u003ccom.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CompilerOptions\u003e"
      ],
      "begin_line": 90,
      "end_line": 942,
      "comment": "\n * CommandLineRunner translates flags into Java API calls on the Compiler.\n *\n * This class may be extended and used to create other Java classes\n * that behave the same as running the Compiler from the command line. If you\n * want to run the compiler in-process in Java, you should look at this class\n * for hints on what API calls to make, but you should not use this class\n * directly.\n *\n * Example:\n * \u003cpre\u003e\n * class MyCommandLineRunner extends CommandLineRunner {\n *   MyCommandLineRunner(String[] args) {\n *     super(args);\n *   }\n *\n *   {@code @Override} protected CompilerOptions createOptions() {\n *     CompilerOptions options \u003d super.createOptions();\n *     addMyCrazyCompilerPassThatOutputsAnExtraFile(options);\n *     return options;\n *   }\n *\n *   public static void main(String[] args) {\n *     MyCommandLineRunner runner \u003d new MyCommandLineRunner(args);\n *     if (runner.shouldRunCompiler()) {\n *       runner.run();\n *     } else {\n *       System.exit(-1);\n *     }\n *   }\n * }\n * \u003c/pre\u003e\n *\n * This class is totally not thread-safe.\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "class_interface",
      "name": "Flags",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 93,
      "end_line": 543,
      "comment": " I don\u0027t really care about unchecked warnings in this class."
    },
    {
      "type": "field",
      "varNames": [
        "warningGuardSpec"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "display_help"
      ],
      "begin_line": 98,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "print_tree"
      ],
      "begin_line": 103,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "print_ast"
      ],
      "begin_line": 108,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "print_pass_graph"
      ],
      "begin_line": 114,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jscomp_dev_mode"
      ],
      "begin_line": 122,
      "end_line": 126,
      "comment": " compiler."
    },
    {
      "type": "field",
      "varNames": [
        "logging_level"
      ],
      "begin_line": 128,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 134,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "js"
      ],
      "begin_line": 139,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "js_output_file"
      ],
      "begin_line": 143,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 148,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variable_map_input_file"
      ],
      "begin_line": 159,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property_map_input_file"
      ],
      "begin_line": 164,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variable_map_output_file"
      ],
      "begin_line": 169,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "create_name_map_files"
      ],
      "begin_line": 174,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property_map_output_file"
      ],
      "begin_line": 183,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "third_party"
      ],
      "begin_line": 188,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summary_detail_level"
      ],
      "begin_line": 195,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "output_wrapper"
      ],
      "begin_line": 203,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module_wrapper"
      ],
      "begin_line": 209,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module_output_path_prefix"
      ],
      "begin_line": 217,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "create_source_map"
      ],
      "begin_line": 223,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "source_map_format"
      ],
      "begin_line": 231,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jscomp_error"
      ],
      "begin_line": 237,
      "end_line": 242,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "jscomp_warning"
      ],
      "begin_line": 245,
      "end_line": 250,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "jscomp_off"
      ],
      "begin_line": 253,
      "end_line": 258,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "define"
      ],
      "begin_line": 260,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 269,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilation_level"
      ],
      "begin_line": 274,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use_types_for_optimization"
      ],
      "begin_line": 280,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warning_level"
      ],
      "begin_line": 286,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use_only_custom_externs"
      ],
      "begin_line": 291,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 296,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generate_exports"
      ],
      "begin_line": 301,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formatting"
      ],
      "begin_line": 306,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "process_common_js_modules"
      ],
      "begin_line": 312,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "common_js_path_prefix"
      ],
      "begin_line": 316,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "common_js_entry_module"
      ],
      "begin_line": 321,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transform_amd_modules"
      ],
      "begin_line": 326,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "process_closure_primitives"
      ],
      "begin_line": 330,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "manage_closure_dependencies"
      ],
      "begin_line": 336,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "only_closure_dependencies"
      ],
      "begin_line": 345,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closure_entry_point"
      ],
      "begin_line": 353,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "process_jquery_primitives"
      ],
      "begin_line": 363,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "output_manifest"
      ],
      "begin_line": 369,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "output_module_dependencies"
      ],
      "begin_line": 378,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accept_const_keyword"
      ],
      "begin_line": 382,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "language_in"
      ],
      "begin_line": 386,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 391,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "translationsFile"
      ],
      "begin_line": 396,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "translationsProject"
      ],
      "begin_line": 400,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flag_file"
      ],
      "begin_line": 406,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warnings_whitelist_file"
      ],
      "begin_line": 410,
      "end_line": 414,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 416,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.getJsFiles()",
      "begin_line": 438,
      "end_line": 444,
      "comment": "\n     * Users may specify JS inputs via the legacy {@code --js} option, as well\n     * as via additional arguments to the Closure Compiler. For example, it is\n     * convenient to leverage the additional arguments feature when using the\n     * Closure Compiler in combination with {@code find} and {@code xargs}:\n     * \u003cpre\u003e\n     * find MY_JS_SRC_DIR -name \u0027*.js\u0027 \\\n     *     | xargs java -jar compiler.jar --manage_closure_dependencies\n     * \u003c/pre\u003e\n     * The {@code find} command will produce a list of \u0027*.js\u0027 source files in\n     * the {@code MY_JS_SRC_DIR} directory while {@code xargs} will convert them\n     * to a single, space-delimited set of arguments that are appended to the\n     * {@code java} command to run the Compiler.\n     * \u003cp\u003e\n     * Note that it is important to use the\n     * {@code --manage_closure_dependencies} option in this case because the\n     * order produced by {@code find} is unlikely to be sorted correctly with\n     * respect to {@code goog.provide()} and {@code goog.requires()}.\n     ",
      "child_ranges": [
        "(line 439,col 7)-(line 440,col 40)",
        "(line 441,col 7)-(line 441,col 29)",
        "(line 442,col 7)-(line 442,col 36)",
        "(line 443,col 7)-(line 443,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.OptionHandler\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 448,
      "end_line": 488,
      "comment": " It needs to be public because of the crazy reflection that args4j does."
    },
    {
      "type": "field",
      "varNames": [
        "TRUES"
      ],
      "begin_line": 449,
      "end_line": 450,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FALSES"
      ],
      "begin_line": 451,
      "end_line": 452,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.BooleanOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.Boolean\u003e)",
      "begin_line": 454,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.parseArguments(org.kohsuke.args4j.spi.Parameters)",
      "begin_line": 460,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 28)",
        "(line 463,col 9)-(line 465,col 39)",
        "(line 467,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.getDefaultMetaVariable()",
      "begin_line": 484,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardErrorOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 492,
      "end_line": 499,
      "comment": " of the flags."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardErrorOptionHandler.WarningGuardErrorOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 494,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardWarningOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 501,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardWarningOptionHandler.WarningGuardWarningOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 503,
      "end_line": 508,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 507,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardOffOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 511,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardOffOptionHandler.WarningGuardOffOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 513,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardSetter",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.Setter\u003cjava.lang.String\u003e"
      ],
      "begin_line": 520,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.WarningGuardSetter(org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 524,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 27)",
        "(line 527,col 9)-(line 527,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.isMultiValued()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.getType()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.addValue(java.lang.String)",
      "begin_line": 538,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 30)",
        "(line 540,col 9)-(line 540,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.FormattingOption.applyToOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 554,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 555,col 7)-(line 567,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConfigValid"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.CommandLineRunner(java.lang.String[])",
      "begin_line": 580,
      "end_line": 583,
      "comment": "\n   * Create a new command-line runner. You should only need to call\n   * the constructor if you\u0027re extending this class. Otherwise, the main\n   * method should instantiate it.\n   ",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 12)",
        "(line 582,col 5)-(line 582,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.CommandLineRunner(java.lang.String[], java.io.PrintStream, java.io.PrintStream)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 586,col 20)",
        "(line 587,col 5)-(line 587,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.tokenizeKeepingQuotedStrings(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 600,
      "end_line": 612,
      "comment": "\n   * Split strings into tokens delimited by whitespace, but treat quoted\n   * strings as single tokens. Non-whitespace characters adjacent to quoted\n   * strings will be returned as part of the token. For example, the string\n   * {@code \"--js\u003d\u0027/home/my project/app.js\u0027\"} would be returned as a single\n   * token.\n   *\n   * @param lines strings to tokenize\n   * @return a list of tokens\n   ",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 47)",
        "(line 602,col 5)-(line 603,col 72)",
        "(line 605,col 5)-(line 610,col 5)",
        "(line 611,col 5)-(line 611,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.processArgs(java.lang.String[])",
      "begin_line": 614,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 618,col 5)-(line 618,col 64)",
        "(line 619,col 5)-(line 619,col 64)",
        "(line 620,col 5)-(line 620,col 54)",
        "(line 622,col 5)-(line 637,col 5)",
        "(line 639,col 5)-(line 639,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.processFlagFile(java.io.PrintStream)",
      "begin_line": 642,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 644,col 51)",
        "(line 645,col 5)-(line 646,col 66)",
        "(line 648,col 5)-(line 648,col 25)",
        "(line 649,col 5)-(line 650,col 59)",
        "(line 651,col 5)-(line 651,col 60)",
        "(line 652,col 5)-(line 652,col 35)",
        "(line 653,col 5)-(line 653,col 77)",
        "(line 656,col 5)-(line 660,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.initConfigFromFlags(java.lang.String[], java.io.PrintStream)",
      "begin_line": 663,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 665,col 5)-(line 665,col 51)",
        "(line 667,col 5)-(line 667,col 52)",
        "(line 668,col 5)-(line 668,col 35)",
        "(line 669,col 5)-(line 669,col 25)",
        "(line 670,col 5)-(line 682,col 5)",
        "(line 684,col 5)-(line 690,col 5)",
        "(line 692,col 5)-(line 702,col 5)",
        "(line 704,col 5)-(line 753,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createOptions()",
      "begin_line": 756,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 758,col 5)-(line 758,col 52)",
        "(line 759,col 5)-(line 763,col 5)",
        "(line 765,col 5)-(line 765,col 53)",
        "(line 766,col 5)-(line 766,col 49)",
        "(line 768,col 5)-(line 770,col 5)",
        "(line 772,col 5)-(line 774,col 5)",
        "(line 776,col 5)-(line 778,col 5)",
        "(line 780,col 5)-(line 780,col 46)",
        "(line 781,col 5)-(line 781,col 46)",
        "(line 782,col 5)-(line 784,col 5)",
        "(line 786,col 5)-(line 786,col 59)",
        "(line 788,col 5)-(line 789,col 57)",
        "(line 791,col 5)-(line 808,col 5)",
        "(line 810,col 5)-(line 810,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createCompiler()",
      "begin_line": 813,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 815,col 5)-(line 815,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createExterns()",
      "begin_line": 818,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 821,col 53)",
        "(line 822,col 5)-(line 828,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTERNS_NAMES"
      ],
      "begin_line": 832,
      "end_line": 882,
      "comment": " The externs expected in externs.zip, in sorted order."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns()",
      "begin_line": 888,
      "end_line": 922,
      "comment": "\n   * @return a mutable list\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 889,col 5)-(line 890,col 24)",
        "(line 891,col 5)-(line 894,col 5)",
        "(line 895,col 5)-(line 895,col 38)",
        "(line 897,col 5)-(line 897,col 51)",
        "(line 898,col 5)-(line 898,col 59)",
        "(line 899,col 5)-(line 908,col 5)",
        "(line 910,col 5)-(line 912,col 66)",
        "(line 916,col 5)-(line 916,col 52)",
        "(line 917,col 5)-(line 919,col 5)",
        "(line 921,col 5)-(line 921,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.shouldRunCompiler()",
      "begin_line": 927,
      "end_line": 929,
      "comment": "\n   * @return Whether the configuration is valid.\n   ",
      "child_ranges": [
        "(line 928,col 5)-(line 928,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.main(java.lang.String[])",
      "begin_line": 934,
      "end_line": 941,
      "comment": "\n   * Runs the Compiler. Exits cleanly in the event of an error.\n   ",
      "child_ranges": [
        "(line 935,col 5)-(line 935,col 59)",
        "(line 936,col 5)-(line 940,col 5)"
      ]
    }
  ]
}