{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/DepsGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DepsGenerator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 435,
      "comment": "\n * Generates deps.js files by scanning JavaScript files for\n * calls to goog.provide(), goog.require() and goog.addDependency().\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 57,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "srcs"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " See the Flags in MakeJsDeps for descriptions of these."
    },
    {
      "type": "field",
      "varNames": [
        "deps"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closurePathAbs"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mergeStrategy"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SAME_FILE_WARNING"
      ],
      "begin_line": 67,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NEVER_PROVIDED_ERROR"
      ],
      "begin_line": 71,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPE_PROVIDES_WARNING"
      ],
      "begin_line": 75,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLE_PROVIDES_ERROR"
      ],
      "begin_line": 79,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPE_REQUIRE_WARNING"
      ],
      "begin_line": 83,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_DEPS_WARNING"
      ],
      "begin_line": 87,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.DepsGenerator(java.util.Collection\u003ccom.google.javascript.jscomp.SourceFile\u003e, java.util.Collection\u003ccom.google.javascript.jscomp.SourceFile\u003e, com.google.javascript.jscomp.deps.DepsGenerator.InclusionStrategy, java.lang.String, com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 94,
      "end_line": 105,
      "comment": "\n   * Creates a new DepsGenerator.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 21)",
        "(line 101,col 5)-(line 101,col 21)",
        "(line 102,col 5)-(line 102,col 39)",
        "(line 103,col 5)-(line 103,col 41)",
        "(line 104,col 5)-(line 104,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.computeDependencyCalls()",
      "begin_line": 113,
      "end_line": 138,
      "comment": "\n   * Performs the parsing inputs and writing of outputs.\n   * @throws IOException Occurs upon an IO error.\n   * @return Returns a String of goog.addDependency calls that will build\n   *     the dependency graph. Returns null if there was an error.\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 61)",
        "(line 116,col 5)-(line 116,col 48)",
        "(line 119,col 5)-(line 119,col 75)",
        "(line 122,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 126,col 47)",
        "(line 129,col 5)-(line 129,col 63)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 135,col 5)-(line 135,col 63)",
        "(line 136,col 5)-(line 136,col 66)",
        "(line 137,col 5)-(line 137,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.cleanUpDuplicatedFiles(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.deps.DependencyInfo\u003e, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.deps.DependencyInfo\u003e)",
      "begin_line": 147,
      "end_line": 162,
      "comment": "\n   * Removes duplicated depsInfo from jsFiles if this info already present in\n   * some of the parsed deps.js\n   *\n   * @param depsFiles DepsInfo from deps.js dependencies\n   * @param jsFiles DepsInfo from some of jsSources\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 68)",
        "(line 150,col 5)-(line 154,col 5)",
        "(line 156,col 5)-(line 161,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.validateDependencies(java.lang.Iterable\u003ccom.google.javascript.jscomp.deps.DependencyInfo\u003e, java.lang.Iterable\u003ccom.google.javascript.jscomp.deps.DependencyInfo\u003e)",
      "begin_line": 175,
      "end_line": 200,
      "comment": "\n   * Reports if there are any dependency problems with the given dependency\n   * information. Reported problems include:\n   *     - A namespace being provided more than once\n   *     - A namespace being required multiple times from within one file\n   *     - A namespace being provided and required in the same file\n   *     - A namespace being required that is never provided\n   * @param preparsedFileDepedencies Dependency information from existing\n   *     deps.js files.\n   * @param parsedFileDependencies Dependency information from parsed .js files.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 64)",
        "(line 180,col 5)-(line 180,col 59)",
        "(line 181,col 5)-(line 181,col 57)",
        "(line 183,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.reportSameFile(java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 202,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 205,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.reportUndefinedNamespace(java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.reportDuplicateProvide(java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo, com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 215,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 225,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.reportDuplicateRequire(java.lang.String, com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 228,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 232,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.reportNoDepsInDepsFile(java.lang.String)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 237,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.addToProvideMap(java.lang.Iterable\u003ccom.google.javascript.jscomp.deps.DependencyInfo\u003e, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.deps.DependencyInfo\u003e)",
      "begin_line": 244,
      "end_line": 255,
      "comment": "\n   * Adds the given DependencyInfos to the given providesMap. Also checks for\n   * and reports duplicate provides.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 254,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.createDepsFileParser()",
      "begin_line": 257,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 65)",
        "(line 259,col 5)-(line 259,col 37)",
        "(line 260,col 5)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.shouldSkipDepsFile(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n   * Returns whether we should ignore dependency info in the given deps file.\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.parseDepsFiles()",
      "begin_line": 274,
      "end_line": 307,
      "comment": "\n   * Parses all deps.js files in the deps list and creates a map of\n   * closure-relative path -\u003e DependencyInfo.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 55)",
        "(line 276,col 5)-(line 276,col 62)",
        "(line 277,col 5)-(line 290,col 5)",
        "(line 295,col 5)-(line 304,col 5)",
        "(line 306,col 5)-(line 306,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.parseSources(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 317,
      "end_line": 342,
      "comment": "\n   * Parses all source files for dependency information.\n   * @param preparsedFiles A set of closure-relative paths.\n   *     Files in this set are not parsed if they are encountered in srcs.\n   * @return Returns a map of closure-relative paths -\u003e DependencyInfo for the\n   *     newly parsed files.\n   * @throws IOException Occurs upon an IO error.\n   ",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 64)",
        "(line 320,col 5)-(line 320,col 59)",
        "(line 322,col 5)-(line 339,col 5)",
        "(line 341,col 5)-(line 341,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.writeDepsContent(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.deps.DependencyInfo\u003e, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.deps.DependencyInfo\u003e, java.io.PrintStream)",
      "begin_line": 350,
      "end_line": 375,
      "comment": "\n   * Creates the content to put into the output deps.js file. If mergeDeps is\n   * true, then all of the dependency information in the providedDeps will be\n   * included in the output.\n   * @throws IOException Occurs upon an IO error.\n   ",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 41)",
        "(line 357,col 5)-(line 374,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.Anonymous-69725e70-918c-40e3-9551-4d3b785c886e.apply(com.google.javascript.jscomp.deps.DependencyInfo)",
      "begin_line": 363,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 15)-(line 365,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.formatPathToDepsFile(java.lang.String)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n   * Format the deps file path so that it can be included in the output file.\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.writeDepInfos(java.io.PrintStream, java.util.Collection\u003ccom.google.javascript.jscomp.deps.DependencyInfo\u003e)",
      "begin_line": 388,
      "end_line": 406,
      "comment": "\n   * Writes goog.addDependency() lines for each DependencyInfo in depInfos.\n   * @throws IOException Occurs upon an IO error.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 405,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.writeJsArray(java.io.PrintStream, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n   * Prints a list of strings formatted as a JavaScript array of string\n   * literals.\n   ",
      "child_ranges": [
        "(line 413,col 5)-(line 419,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.createSourceFilesFromPaths(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 422,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 50)",
        "(line 425,col 5)-(line 427,col 5)",
        "(line 428,col 5)-(line 428,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.DepsGenerator.createSourceFilesFromPaths(java.lang.String...)",
      "begin_line": 431,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 433,col 60)"
      ]
    }
  ]
}