{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ant/CompileTask.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompileTask",
      "is_interface": false,
      "parent_types": [
        "org.apache.tools.ant.Task"
      ],
      "begin_line": 57,
      "end_line": 585,
      "comment": "\n * This class implements a simple Ant task to do almost the same as\n * CommandLineRunner.\n *\n * Most of the public methods of this class are entry points for the\n * Ant code to hook into.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningLevel"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debugOptions"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputEncoding"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilationLevel"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "customExternsOnly"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "manageDependencies"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printInputDelimiter"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replaceProperties"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "forceRecompile"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacePropertiesPrefix"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputFile"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defineParams"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externFileLists"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceFileLists"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourcePaths"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.CompileTask()",
      "begin_line": 80,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 63)",
        "(line 82,col 5)-(line 82,col 45)",
        "(line 83,col 5)-(line 83,col 30)",
        "(line 84,col 5)-(line 84,col 66)",
        "(line 85,col 5)-(line 85,col 35)",
        "(line 86,col 5)-(line 86,col 36)",
        "(line 87,col 5)-(line 87,col 29)",
        "(line 88,col 5)-(line 88,col 37)",
        "(line 89,col 5)-(line 89,col 33)",
        "(line 90,col 5)-(line 90,col 35)",
        "(line 91,col 5)-(line 91,col 32)",
        "(line 92,col 5)-(line 92,col 53)",
        "(line 93,col 5)-(line 93,col 46)",
        "(line 94,col 5)-(line 94,col 49)",
        "(line 95,col 5)-(line 95,col 49)",
        "(line 96,col 5)-(line 96,col 45)",
        "(line 97,col 5)-(line 97,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setLanguageIn(java.lang.String)",
      "begin_line": 105,
      "end_line": 116,
      "comment": "\n   * Set the language to which input sources conform.\n   * @param value The name of the language.\n   *     (ECMASCRIPT3, ECMASCRIPT5, ECMASCRIPT5_STRICT).\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 115,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setWarning(java.lang.String)",
      "begin_line": 122,
      "end_line": 133,
      "comment": "\n   * Set the warning level.\n   * @param value The warning level by string name. (default, quiet, verbose).\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 132,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setDebug(boolean)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n   * Enable debugging options.\n   * @param value True if debug mode is enabled.\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setCompilationLevel(java.lang.String)",
      "begin_line": 148,
      "end_line": 159,
      "comment": "\n   * Set the compilation level.\n   * @param value The optimization level by string name.\n   *     (whitespace, simple, advanced).\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 158,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setManageDependencies(boolean)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setCustomExternsOnly(boolean)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n   * Use only custom externs.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setOutput(java.io.File)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n   * Set output file.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setReplacePropertiesPrefix(java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n   * Set the replacement property prefix.\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setReplaceProperties(boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n   * Whether to replace {@code @define} lines with properties\n   ",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setEncoding(java.lang.String)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n   * Set input file encoding\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setOutputEncoding(java.lang.String)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n   * Set output file encoding\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setPrettyPrint(boolean)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n   * Set pretty print formatting option\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setPrintInputDelimiter(boolean)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n   * Set print input delimiter formatting option\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setForceRecompile(boolean)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n   * Set force recompile option\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setGenerateExports(boolean)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n   * Set generateExports option\n   ",
      "child_ranges": [
        "(line 232,col 4)-(line 232,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addExterns(org.apache.tools.ant.types.FileList)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n   * Sets the externs file.\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addWarning(com.google.javascript.jscomp.ant.Warning)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n   * Adds a \u003cwarning/\u003e entry\n   *\n   * Each warning entry must have two attributes, group and level. Group must\n   * contain one of the constants from DiagnosticGroups (e.g.,\n   * \"ACCESS_CONTROLS\"), while level must contain one of the CheckLevel\n   * constants (\"ERROR\", \"WARNING\" or \"OFF\").\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addSources(org.apache.tools.ant.types.FileList)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n   * Sets the source files.\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.addPath(org.apache.tools.ant.types.Path)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n   * Adds a \u003cpath/\u003e entry.\n   ",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.execute()",
      "begin_line": 268,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 272,col 5)",
        "(line 274,col 5)-(line 274,col 40)",
        "(line 276,col 5)-(line 276,col 54)",
        "(line 277,col 5)-(line 277,col 48)",
        "(line 279,col 5)-(line 279,col 49)",
        "(line 280,col 5)-(line 280,col 49)",
        "(line 282,col 5)-(line 294,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createCompilerOptions()",
      "begin_line": 297,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 52)",
        "(line 300,col 5)-(line 300,col 65)",
        "(line 301,col 5)-(line 303,col 5)",
        "(line 305,col 5)-(line 305,col 43)",
        "(line 306,col 5)-(line 306,col 59)",
        "(line 307,col 5)-(line 307,col 51)",
        "(line 309,col 5)-(line 309,col 43)",
        "(line 311,col 5)-(line 311,col 57)",
        "(line 312,col 5)-(line 312,col 61)",
        "(line 314,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 318,col 37)",
        "(line 320,col 5)-(line 329,col 5)",
        "(line 331,col 5)-(line 331,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createDefine()",
      "begin_line": 338,
      "end_line": 342,
      "comment": "\n   * Creates a new {@code \u003cdefine/\u003e} nested element. Supports name and value\n   * attributes.\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 38)",
        "(line 340,col 5)-(line 340,col 28)",
        "(line 341,col 5)-(line 341,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.convertDefineParameters(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 349,
      "end_line": 358,
      "comment": "\n   * Converts {@code \u003cdefine/\u003e} nested elements into Compiler {@code @define}\n   * replacements. Note: unlike project properties, {@code \u003cdefine/\u003e} elements\n   * do not need to be named starting with the replacement prefix.\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.convertPropertiesMap(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 366,
      "end_line": 380,
      "comment": "\n   * Converts project properties beginning with the replacement prefix\n   * into Compiler {@code @define} replacements.\n   *\n   * @param options\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 61)",
        "(line 368,col 5)-(line 379,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.setDefine(com.google.javascript.jscomp.CompilerOptions, java.lang.String, java.lang.Object)",
      "begin_line": 389,
      "end_line": 422,
      "comment": "\n   * Maps Ant-style values (e.g., from Properties) into expected\n   * Closure {@code @define} literals\n   *\n   * @return True if the {@code @define} replacement succeeded, false if\n   *         the variable\u0027s value could not be mapped properly.\n   ",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 28)",
        "(line 393,col 5)-(line 419,col 5)",
        "(line 421,col 5)-(line 421,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.createCompiler(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 424,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 39)",
        "(line 426,col 5)-(line 427,col 57)",
        "(line 428,col 5)-(line 428,col 72)",
        "(line 429,col 5)-(line 429,col 43)",
        "(line 430,col 5)-(line 430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findExternFiles()",
      "begin_line": 433,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 51)",
        "(line 435,col 5)-(line 437,col 5)",
        "(line 439,col 5)-(line 441,col 5)",
        "(line 443,col 5)-(line 443,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findSourceFiles()",
      "begin_line": 446,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 51)",
        "(line 449,col 5)-(line 451,col 5)",
        "(line 453,col 5)-(line 455,col 5)",
        "(line 457,col 5)-(line 457,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findJavaScriptFiles(org.apache.tools.ant.types.FileList)",
      "begin_line": 464,
      "end_line": 474,
      "comment": "\n   * Translates an Ant file list into the file format that the compiler\n   * expects.\n   ",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 51)",
        "(line 466,col 5)-(line 466,col 49)",
        "(line 468,col 5)-(line 471,col 5)",
        "(line 473,col 5)-(line 473,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.findJavaScriptFiles(org.apache.tools.ant.types.Path)",
      "begin_line": 480,
      "end_line": 489,
      "comment": "\n   * Translates an Ant Path into the file list format that the compiler\n   * expects.\n   ",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 50)",
        "(line 483,col 5)-(line 486,col 5)",
        "(line 488,col 5)-(line 488,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getDefaultExterns()",
      "begin_line": 496,
      "end_line": 502,
      "comment": "\n   * Gets the default externs set.\n   *\n   * Adapted from {@link CommandLineRunner}.\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 501,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.writeResult(java.lang.String)",
      "begin_line": 504,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 505,col 5)-(line 508,col 5)",
        "(line 510,col 5)-(line 518,col 5)",
        "(line 520,col 5)-(line 521,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.isStale()",
      "begin_line": 530,
      "end_line": 538,
      "comment": "\n   * Determine if compilation must actually happen, i.e. if any input file\n   * (extern or source) has changed after the outputFile was last modified.\n   *\n   * @return true if compilation should happen\n   ",
      "child_ranges": [
        "(line 531,col 5)-(line 531,col 45)",
        "(line 532,col 5)-(line 534,col 47)",
        "(line 535,col 5)-(line 535,col 73)",
        "(line 537,col 5)-(line 537,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getLastModifiedTime(java.util.List\u003c?\u003e)",
      "begin_line": 549,
      "end_line": 571,
      "comment": "\n   * Returns the most recent modified timestamp of the file collection.\n   *\n   * Note: this must be combined into one method to account for both\n   * Path and FileList erasure types.\n   *\n   * @param fileLists Collection of FileList or Path\n   * @return Most recent modified timestamp\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 26)",
        "(line 552,col 5)-(line 568,col 5)",
        "(line 570,col 5)-(line 570,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ant.CompileTask.getLastModifiedTime(java.io.File)",
      "begin_line": 576,
      "end_line": 584,
      "comment": "\n   * Returns the last modified timestamp of the given File.\n   ",
      "child_ranges": [
        "(line 577,col 5)-(line 577,col 48)",
        "(line 580,col 5)-(line 582,col 5)",
        "(line 583,col 5)-(line 583,col 28)"
      ]
    }
  ]
}