{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ant/CompileTask.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompileTask",
      "is_interface": false,
      "parent_types": [
        "org.apache.tools.ant.Task"
      ],
      "begin_line": 61,
      "end_line": 627,
      "comment": "\n * This class implements a simple Ant task to do almost the same as\n * CommandLineRunner.\n *\n * Most of the public methods of this class are entry points for the\n * Ant code to hook into.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningLevel"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debugOptions"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputEncoding"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilationLevel"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "customExternsOnly"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "manageDependencies"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printInputDelimiter"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replaceProperties"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceRecompile"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacePropertiesPrefix"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputFile"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defineParams"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externFileLists"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceFileLists"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourcePaths"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapOutputFile"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.CompileTask()",
      "begin_line": 86,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 63)",
        "(line 88,col 5)-(line 88,col 45)",
        "(line 89,col 5)-(line 89,col 30)",
        "(line 90,col 5)-(line 90,col 66)",
        "(line 91,col 5)-(line 91,col 35)",
        "(line 92,col 5)-(line 92,col 36)",
        "(line 93,col 5)-(line 93,col 29)",
        "(line 94,col 5)-(line 94,col 37)",
        "(line 95,col 5)-(line 95,col 33)",
        "(line 96,col 5)-(line 96,col 35)",
        "(line 97,col 5)-(line 97,col 32)",
        "(line 98,col 5)-(line 98,col 53)",
        "(line 99,col 5)-(line 99,col 46)",
        "(line 100,col 5)-(line 100,col 49)",
        "(line 101,col 5)-(line 101,col 49)",
        "(line 102,col 5)-(line 102,col 45)",
        "(line 103,col 5)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setLanguageIn(java.lang.String)",
      "begin_line": 111,
      "end_line": 122,
      "comment": "\n   * Set the language to which input sources conform.\n   * @param value The name of the language.\n   *     (ECMASCRIPT3, ECMASCRIPT5, ECMASCRIPT5_STRICT).\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 121,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setWarning(java.lang.String)",
      "begin_line": 128,
      "end_line": 139,
      "comment": "\n   * Set the warning level.\n   * @param value The warning level by string name. (default, quiet, verbose).\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 138,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setDebug(boolean)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n   * Enable debugging options.\n   * @param value True if debug mode is enabled.\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setCompilationLevel(java.lang.String)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\n   * Set the compilation level.\n   * @param value The optimization level by string name.\n   *     (whitespace, simple, advanced).\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 164,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setManageDependencies(boolean)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setCustomExternsOnly(boolean)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n   * Use only custom externs.\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setOutput(java.io.File)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n   * Set output file.\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setReplacePropertiesPrefix(java.lang.String)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n   * Set the replacement property prefix.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setReplaceProperties(boolean)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n   * Whether to replace {@code @define} lines with properties\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setEncoding(java.lang.String)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n   * Set input file encoding\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setOutputEncoding(java.lang.String)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n   * Set output file encoding\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setPrettyPrint(boolean)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n   * Set pretty print formatting option\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setPrintInputDelimiter(boolean)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n   * Set print input delimiter formatting option\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setForceRecompile(boolean)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n   * Set force recompile option\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setGenerateExports(boolean)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n   * Set generateExports option\n   ",
      "child_ranges": [
        "(line 238,col 4)-(line 238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addExterns(org.apache.tools.ant.types.FileList)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n   * Sets the externs file.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addWarning(com.google.javascript.jscomp.ant.Warning)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n   * Adds a \u003cwarning/\u003e entry\n   *\n   * Each warning entry must have two attributes, group and level. Group must\n   * contain one of the constants from DiagnosticGroups (e.g.,\n   * \"ACCESS_CONTROLS\"), while level must contain one of the CheckLevel\n   * constants (\"ERROR\", \"WARNING\" or \"OFF\").\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addSources(org.apache.tools.ant.types.FileList)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n   * Sets the source files.\n   ",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addPath(org.apache.tools.ant.types.Path)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n   * Adds a \u003cpath/\u003e entry.\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.execute()",
      "begin_line": 274,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 280,col 40)",
        "(line 282,col 5)-(line 282,col 54)",
        "(line 283,col 5)-(line 283,col 48)",
        "(line 285,col 5)-(line 285,col 49)",
        "(line 286,col 5)-(line 286,col 49)",
        "(line 288,col 5)-(line 306,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.flushSourceMap(com.google.javascript.jscomp.SourceMap)",
      "begin_line": 309,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 316,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createCompilerOptions()",
      "begin_line": 319,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 52)",
        "(line 322,col 5)-(line 322,col 65)",
        "(line 323,col 5)-(line 325,col 5)",
        "(line 327,col 5)-(line 327,col 43)",
        "(line 328,col 5)-(line 328,col 59)",
        "(line 329,col 5)-(line 329,col 51)",
        "(line 331,col 5)-(line 331,col 43)",
        "(line 333,col 5)-(line 333,col 57)",
        "(line 334,col 5)-(line 334,col 61)",
        "(line 336,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 340,col 37)",
        "(line 342,col 5)-(line 351,col 5)",
        "(line 353,col 5)-(line 355,col 5)",
        "(line 357,col 5)-(line 363,col 5)",
        "(line 364,col 5)-(line 364,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createDefine()",
      "begin_line": 371,
      "end_line": 375,
      "comment": "\n   * Creates a new {@code \u003cdefine/\u003e} nested element. Supports name and value\n   * attributes.\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 38)",
        "(line 373,col 5)-(line 373,col 28)",
        "(line 374,col 5)-(line 374,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.convertDefineParameters(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 382,
      "end_line": 391,
      "comment": "\n   * Converts {@code \u003cdefine/\u003e} nested elements into Compiler {@code @define}\n   * replacements. Note: unlike project properties, {@code \u003cdefine/\u003e} elements\n   * do not need to be named starting with the replacement prefix.\n   ",
      "child_ranges": [
        "(line 383,col 5)-(line 390,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.convertPropertiesMap(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 399,
      "end_line": 414,
      "comment": "\n   * Converts project properties beginning with the replacement prefix\n   * into Compiler {@code @define} replacements.\n   *\n   * @param options\n   ",
      "child_ranges": [
        "(line 400,col 5)-(line 401,col 61)",
        "(line 402,col 5)-(line 413,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setDefine(com.google.javascript.jscomp.CompilerOptions, java.lang.String, java.lang.Object)",
      "begin_line": 423,
      "end_line": 456,
      "comment": "\n   * Maps Ant-style values (e.g., from Properties) into expected\n   * Closure {@code @define} literals\n   *\n   * @return True if the {@code @define} replacement succeeded, false if\n   *         the variable\u0027s value could not be mapped properly.\n   ",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 28)",
        "(line 427,col 5)-(line 453,col 5)",
        "(line 455,col 5)-(line 455,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createCompiler(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 458,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 39)",
        "(line 460,col 5)-(line 461,col 57)",
        "(line 462,col 5)-(line 462,col 72)",
        "(line 463,col 5)-(line 463,col 43)",
        "(line 464,col 5)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findExternFiles()",
      "begin_line": 467,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 51)",
        "(line 469,col 5)-(line 471,col 5)",
        "(line 473,col 5)-(line 475,col 5)",
        "(line 477,col 5)-(line 477,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findSourceFiles()",
      "begin_line": 480,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 51)",
        "(line 483,col 5)-(line 485,col 5)",
        "(line 487,col 5)-(line 489,col 5)",
        "(line 491,col 5)-(line 491,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findJavaScriptFiles(org.apache.tools.ant.types.FileList)",
      "begin_line": 498,
      "end_line": 508,
      "comment": "\n   * Translates an Ant file list into the file format that the compiler\n   * expects.\n   ",
      "child_ranges": [
        "(line 499,col 5)-(line 499,col 51)",
        "(line 500,col 5)-(line 500,col 49)",
        "(line 502,col 5)-(line 505,col 5)",
        "(line 507,col 5)-(line 507,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findJavaScriptFiles(org.apache.tools.ant.types.Path)",
      "begin_line": 514,
      "end_line": 523,
      "comment": "\n   * Translates an Ant Path into the file list format that the compiler\n   * expects.\n   ",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 50)",
        "(line 517,col 5)-(line 520,col 5)",
        "(line 522,col 5)-(line 522,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getDefaultExterns()",
      "begin_line": 530,
      "end_line": 536,
      "comment": "\n   * Gets the default externs set.\n   *\n   * Adapted from {@link CommandLineRunner}.\n   ",
      "child_ranges": [
        "(line 531,col 5)-(line 535,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.writeResult(java.lang.String)",
      "begin_line": 538,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 542,col 5)",
        "(line 544,col 5)-(line 552,col 5)",
        "(line 554,col 5)-(line 555,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.isStale()",
      "begin_line": 564,
      "end_line": 572,
      "comment": "\n   * Determine if compilation must actually happen, i.e. if any input file\n   * (extern or source) has changed after the outputFile was last modified.\n   *\n   * @return true if compilation should happen\n   ",
      "child_ranges": [
        "(line 565,col 5)-(line 565,col 45)",
        "(line 566,col 5)-(line 568,col 47)",
        "(line 569,col 5)-(line 569,col 73)",
        "(line 571,col 5)-(line 571,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getLastModifiedTime(java.util.List\u003c?\u003e)",
      "begin_line": 583,
      "end_line": 605,
      "comment": "\n   * Returns the most recent modified timestamp of the file collection.\n   *\n   * Note: this must be combined into one method to account for both\n   * Path and FileList erasure types.\n   *\n   * @param fileLists Collection of FileList or Path\n   * @return Most recent modified timestamp\n   ",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 26)",
        "(line 586,col 5)-(line 602,col 5)",
        "(line 604,col 5)-(line 604,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getLastModifiedTime(java.io.File)",
      "begin_line": 610,
      "end_line": 618,
      "comment": "\n   * Returns the last modified timestamp of the given File.\n   ",
      "child_ranges": [
        "(line 611,col 5)-(line 611,col 48)",
        "(line 614,col 5)-(line 616,col 5)",
        "(line 617,col 5)-(line 617,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setSourceMapFormat(java.lang.String)",
      "begin_line": 620,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 5)-(line 621,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setSourceMapOutputFile(java.io.File)",
      "begin_line": 624,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 51)"
      ]
    }
  ]
}