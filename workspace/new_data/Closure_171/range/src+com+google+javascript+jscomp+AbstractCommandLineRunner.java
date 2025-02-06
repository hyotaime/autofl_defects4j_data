{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCommandLineRunner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 2032,
      "comment": "\n * Implementations of AbstractCommandLineRunner translate flags into Java\n * API calls on the Compiler. AbstractCompiler contains common flags and logic\n * to make that happen.\n *\n * This class may be extended and used to create other Java classes\n * that behave the same as running the Compiler from the command line. Example:\n *\n * \u003cpre\u003e\n * class MyCommandLineRunner extends\n *     AbstractCommandLineRunner\u003cMyCompiler, MyOptions\u003e {\n *   MyCommandLineRunner(String[] args) {\n *     super(args);\n *   }\n *\n *   \u0026#064;Override\n *   protected MyOptions createOptions() {\n *     MyOptions options \u003d new MyOptions();\n *     CompilerFlagTranslator.setOptionsFromFlags(options);\n *     addMyCrazyCompilerPassThatOutputsAnExtraFile(options);\n *     return options;\n *   }\n *\n *   \u0026#064;Override\n *   protected MyCompiler createCompiler() {\n *     return new MyCompiler();\n *   }\n *\n *   public static void main(String[] args) {\n *     (new MyCommandLineRunner(args)).run();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_SAME_AS_INPUT_ERROR"
      ],
      "begin_line": 97,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "config"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsOutput"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "err"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputCharset"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputCharset2"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " designed this if I had a time machine."
    },
    {
      "type": "field",
      "varNames": [
        "legacyOutputCharset"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testMode"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsSupplierForTesting"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputsSupplierForTesting"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modulesSupplierForTesting"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exitCodeReceiverForTesting"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootRelativePathsMap"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsedModuleWrappers"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_RUNS_TO_DETERMINE_OPTIMAL_ORDER"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Bookkeeping to measure optimal phase orderings."
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_MARKER"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_MARKER_JS_STRING"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.AbstractCommandLineRunner()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.AbstractCommandLineRunner(java.io.PrintStream, java.io.PrintStream)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 42)",
        "(line 140,col 5)-(line 140,col 52)",
        "(line 141,col 5)-(line 141,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.enableTestMode(com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e\u003e, com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e\u003e, com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e\u003e, com.google.common.base.Function\u003cjava.lang.Integer, java.lang.Boolean\u003e)",
      "begin_line": 154,
      "end_line": 167,
      "comment": "\n   * Put the command line runner into test mode. In test mode,\n   * all outputs will be blackholed.\n   * @param externsSupplier A provider for externs.\n   * @param inputsSupplier A provider for source inputs.\n   * @param modulesSupplier A provider for modules. Only one of inputsSupplier\n   *     and modulesSupplier may be non-null.\n   * @param exitCodeReceiver A receiver for the status code that would\n   *     have been passed to System.exit in non-test mode.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 161,col 58)",
        "(line 162,col 5)-(line 162,col 20)",
        "(line 163,col 5)-(line 163,col 53)",
        "(line 164,col 5)-(line 164,col 51)",
        "(line 165,col 5)-(line 165,col 53)",
        "(line 166,col 5)-(line 166,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.isInTestMode()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n   * Returns whether we\u0027re in test mode.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getCommandLineConfig()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n   * Get the command line config, so that it can be initialized.\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createCompiler()",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n   * Returns the instance of the Compiler to use when {@link #run()} is\n   * called.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createOptions()",
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n   * Returns the instance of the Options to use when {@link #run()} is called.\n   * createCompiler() is called before createOptions(), so getCompiler()\n   * will not return null when createOptions() is called.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getDiagnosticGroups()",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n   * The warning classes that are available from the command-line.\n   ",
      "child_ranges": [
        "(line 200,col 5)-(line 202,col 5)",
        "(line 203,col 5)-(line 203,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createDependencyOptions(boolean, boolean, boolean, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 209,
      "end_line": 241,
      "comment": "\n   * A helper function for creating the dependency options object.\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 239,col 5)",
        "(line 240,col 5)-(line 240,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.setRunOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 249,
      "end_line": 357,
      "comment": "\n   * Sets options based on the configurations set flags API.\n   * Called during the run() run() method.\n   * If you want to ignore the flags API, or interpret flags your own way,\n   * then you should override this method.\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 62)",
        "(line 253,col 5)-(line 257,col 5)",
        "(line 259,col 5)-(line 263,col 5)",
        "(line 265,col 5)-(line 265,col 67)",
        "(line 267,col 5)-(line 267,col 55)",
        "(line 268,col 5)-(line 268,col 65)",
        "(line 270,col 5)-(line 274,col 35)",
        "(line 275,col 5)-(line 277,col 5)",
        "(line 279,col 5)-(line 279,col 43)",
        "(line 280,col 5)-(line 280,col 57)",
        "(line 281,col 5)-(line 281,col 61)",
        "(line 282,col 5)-(line 282,col 36)",
        "(line 284,col 5)-(line 284,col 75)",
        "(line 285,col 5)-(line 285,col 41)",
        "(line 286,col 5)-(line 286,col 37)",
        "(line 288,col 5)-(line 293,col 5)",
        "(line 295,col 5)-(line 298,col 5)",
        "(line 300,col 5)-(line 303,col 5)",
        "(line 305,col 5)-(line 307,col 5)",
        "(line 308,col 5)-(line 308,col 63)",
        "(line 309,col 5)-(line 309,col 53)",
        "(line 311,col 5)-(line 314,col 5)",
        "(line 316,col 5)-(line 319,col 5)",
        "(line 321,col 5)-(line 330,col 5)",
        "(line 332,col 5)-(line 340,col 5)",
        "(line 342,col 5)-(line 350,col 5)",
        "(line 352,col 5)-(line 352,col 59)",
        "(line 353,col 5)-(line 353,col 71)",
        "(line 354,col 5)-(line 354,col 67)",
        "(line 355,col 5)-(line 355,col 71)",
        "(line 356,col 5)-(line 356,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getCompiler()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.run()",
      "begin_line": 367,
      "end_line": 395,
      "comment": "\n   * Runs the Compiler and calls System.exit() with the exit status of the\n   * compiler.\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 19)",
        "(line 369,col 5)-(line 369,col 17)",
        "(line 370,col 5)-(line 380,col 5)",
        "(line 382,col 5)-(line 388,col 5)",
        "(line 390,col 5)-(line 394,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getErrorPrintStream()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n   * Returns the PrintStream for writing errors associated with this\n   * AbstractCommandLineRunner.\n   ",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlagUsageException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 408,
      "end_line": 414,
      "comment": "\n   * An exception thrown when command-line flags are used incorrectly.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException.FlagUsageException(java.lang.String)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 7)-(line 412,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 427,
      "end_line": 456,
      "comment": "\n   * Creates inputs from a list of files.\n   *\n   * Can be overridden by subclasses who want to pull files from different\n   * places.\n   *\n   * @param files A list of filenames\n   * @param allowStdIn Whether \u0027-\u0027 is allowed appear as a filename to represent\n   *        stdin. If true, \u0027-\u0027 is only allowed to appear once.\n   * @return An array of inputs\n   ",
      "child_ranges": [
        "(line 429,col 5)-(line 429,col 70)",
        "(line 430,col 5)-(line 430,col 31)",
        "(line 431,col 5)-(line 454,col 5)",
        "(line 455,col 5)-(line 455,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 461,
      "end_line": 474,
      "comment": "\n   * Creates JS source code inputs from a list of files.\n   ",
      "child_ranges": [
        "(line 463,col 5)-(line 465,col 5)",
        "(line 466,col 5)-(line 468,col 5)",
        "(line 469,col 5)-(line 473,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 479,
      "end_line": 489,
      "comment": "\n   * Creates JS extern inputs from a list of files.\n   ",
      "child_ranges": [
        "(line 481,col 5)-(line 483,col 5)",
        "(line 484,col 5)-(line 488,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 500,
      "end_line": 583,
      "comment": "\n   * Creates module objects from a list of module specifications.\n   *\n   * @param specs A list of module specifications, not null or empty. The spec\n   *        format is: \u003ccode\u003ename:num-js-files[:[dep,...][:]]\u003c/code\u003e. Module\n   *        names must not contain the \u0027:\u0027 character.\n   * @param jsFiles A list of JS file paths, not null\n   * @return An array of module objects\n   ",
      "child_ranges": [
        "(line 503,col 5)-(line 505,col 5)",
        "(line 507,col 5)-(line 507,col 44)",
        "(line 508,col 5)-(line 508,col 47)",
        "(line 509,col 5)-(line 509,col 46)",
        "(line 511,col 5)-(line 511,col 47)",
        "(line 512,col 5)-(line 512,col 28)",
        "(line 514,col 5)-(line 514,col 66)",
        "(line 515,col 5)-(line 575,col 5)",
        "(line 577,col 5)-(line 580,col 5)",
        "(line 582,col 5)-(line 582,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.checkModuleName(java.lang.String)",
      "begin_line": 590,
      "end_line": 595,
      "comment": "\n   * Validates the module name. Can be overridden by subclasses.\n   * @param name The module name\n   * @throws FlagUsageException if the validation fails\n   ",
      "child_ranges": [
        "(line 592,col 5)-(line 594,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 606,
      "end_line": 640,
      "comment": "\n   * Parses module wrapper specifications.\n   *\n   * @param specs A list of module wrapper specifications, not null. The spec\n   *        format is: \u003ccode\u003ename:wrapper\u003c/code\u003e. Wrappers.\n   * @param modules The JS modules whose wrappers are specified\n   * @return A map from module name to module wrapper. Modules with no wrapper\n   *         will have the empty string as their value in this map.\n   ",
      "child_ranges": [
        "(line 608,col 5)-(line 608,col 44)",
        "(line 610,col 5)-(line 611,col 56)",
        "(line 614,col 5)-(line 616,col 5)",
        "(line 618,col 5)-(line 638,col 5)",
        "(line 639,col 5)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getModuleOutputFileName(com.google.javascript.jscomp.JSModule)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 5)-(line 643,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.writeModuleOutput(java.lang.Appendable, com.google.javascript.jscomp.JSModule)",
      "begin_line": 646,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 654,col 5)",
        "(line 656,col 5)-(line 656,col 49)",
        "(line 657,col 5)-(line 657,col 51)",
        "(line 658,col 5)-(line 660,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(java.lang.Appendable, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String, com.google.common.base.Function\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 667,
      "end_line": 700,
      "comment": "\n   * Writes code to an output stream, optionally wrapping it in an arbitrary\n   * wrapper that contains a placeholder where the code should be inserted.\n   ",
      "child_ranges": [
        "(line 671,col 5)-(line 671,col 47)",
        "(line 672,col 5)-(line 699,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath(java.lang.String)",
      "begin_line": 706,
      "end_line": 716,
      "comment": "\n   * Creates any directories necessary to write a file that will have a given\n   * path prefix.\n   ",
      "child_ranges": [
        "(line 707,col 5)-(line 715,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.doRun()",
      "begin_line": 723,
      "end_line": 799,
      "comment": "\n   * Parses command-line arguments and runs the compiler.\n   *\n   * @return system exit status\n   ",
      "child_ranges": [
        "(line 724,col 5)-(line 724,col 63)",
        "(line 726,col 5)-(line 726,col 47)",
        "(line 728,col 5)-(line 728,col 32)",
        "(line 729,col 5)-(line 729,col 32)",
        "(line 731,col 5)-(line 731,col 34)",
        "(line 732,col 5)-(line 732,col 25)",
        "(line 734,col 5)-(line 734,col 27)",
        "(line 736,col 5)-(line 736,col 63)",
        "(line 737,col 5)-(line 737,col 56)",
        "(line 738,col 5)-(line 743,col 5)",
        "(line 745,col 5)-(line 745,col 37)",
        "(line 746,col 5)-(line 746,col 45)",
        "(line 748,col 5)-(line 748,col 42)",
        "(line 749,col 5)-(line 754,col 5)",
        "(line 755,col 5)-(line 773,col 5)",
        "(line 774,col 5)-(line 781,col 5)",
        "(line 783,col 5)-(line 789,col 5)",
        "(line 791,col 5)-(line 791,col 59)",
        "(line 795,col 5)-(line 797,col 5)",
        "(line 798,col 5)-(line 798,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(com.google.javascript.jscomp.Result, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, B)",
      "begin_line": 804,
      "end_line": 877,
      "comment": "\n   * Processes the results of the compile job, and returns an error code.\n   ",
      "child_ranges": [
        "(line 806,col 5)-(line 815,col 5)",
        "(line 817,col 5)-(line 827,col 5)",
        "(line 829,col 5)-(line 838,col 5)",
        "(line 840,col 5)-(line 840,col 59)",
        "(line 842,col 5)-(line 873,col 5)",
        "(line 876,col 5)-(line 876,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getJavascriptEscaper()",
      "begin_line": 879,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 880,col 5)-(line 881,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputSingleBinary()",
      "begin_line": 884,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 885,col 5)-(line 885,col 44)",
        "(line 886,col 5)-(line 886,col 34)",
        "(line 887,col 5)-(line 890,col 5)",
        "(line 892,col 5)-(line 894,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputModuleBinaryAndSourceMaps(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, B)",
      "begin_line": 897,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 900,col 5)-(line 901,col 39)",
        "(line 902,col 5)-(line 902,col 58)",
        "(line 907,col 5)-(line 907,col 25)",
        "(line 909,col 5)-(line 911,col 5)",
        "(line 913,col 5)-(line 937,col 5)",
        "(line 939,col 5)-(line 941,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getInputCharset()",
      "begin_line": 951,
      "end_line": 960,
      "comment": "\n   * Query the flag for the input charset, and return a Charset object\n   * representing the selection.\n   *\n   * @return Charset to use when reading inputs\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 952,col 5)-(line 958,col 5)",
        "(line 959,col 5)-(line 959,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getLegacyOutputCharset()",
      "begin_line": 974,
      "end_line": 983,
      "comment": "\n   * Query the flag for the output charset.\n   *\n   * Let the outputCharset be the same as the input charset... except if\n   * we\u0027re reading in UTF-8 by default.  By tradition, we\u0027ve always\n   * output ASCII to avoid various hiccups with different browsers,\n   * proxies and firewalls.\n   *\n   * @return Name of the charset to use when writing outputs. Guaranteed to\n   *    be a supported charset.\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 975,col 5)-(line 981,col 5)",
        "(line 982,col 5)-(line 982,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getOutputCharset2()",
      "begin_line": 989,
      "end_line": 998,
      "comment": "\n   * Query the flag for the output charset. Defaults to UTF-8.\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 990,col 5)-(line 996,col 5)",
        "(line 997,col 5)-(line 997,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns()",
      "begin_line": 1000,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 5)-(line 1003,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateMapPerModule(B)",
      "begin_line": 1011,
      "end_line": 1014,
      "comment": "\n   * Returns true if and only if a source map file should be generated for each\n   * module, as opposed to one unified map. This is specified by having the\n   * source map pattern include the %outname% variable.\n   ",
      "child_ranges": [
        "(line 1012,col 5)-(line 1013,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream(B, java.lang.String)",
      "begin_line": 1024,
      "end_line": 1038,
      "comment": "\n   * Returns a stream for outputting the generated externs file.\n   *\n   * @param options The options to the Compiler.\n   * @param path The path of the generated JS source file.\n   *\n   * @return The stream or null if no extern-ed exports are being generated.\n   ",
      "child_ranges": [
        "(line 1026,col 5)-(line 1028,col 5)",
        "(line 1030,col 5)-(line 1030,col 46)",
        "(line 1032,col 5)-(line 1035,col 5)",
        "(line 1037,col 5)-(line 1037,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(java.lang.String, com.google.javascript.jscomp.JSModule)",
      "begin_line": 1055,
      "end_line": 1066,
      "comment": "\n   * Expand a file path specified on the command-line.\n   *\n   * Most file paths on the command-line allow an %outname% placeholder.\n   * The placeholder will expand to a different value depending on\n   * the current output mode. There are three scenarios:\n   *\n   * 1) Single JS output, single extra output: sub in jsOutputPath.\n   * 2) Multiple JS output, single extra output: sub in the base module name.\n   * 3) Multiple JS output, multiple extra output: sub in the module output\n   *    file.\n   *\n   * Passing a JSModule to this function automatically triggers case #3.\n   * Otherwise, we\u0027ll use strategy #1 or #2 based on the current output mode.\n   ",
      "child_ranges": [
        "(line 1057,col 5)-(line 1057,col 15)",
        "(line 1058,col 5)-(line 1064,col 5)",
        "(line 1065,col 5)-(line 1065,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(B, com.google.javascript.jscomp.JSModule)",
      "begin_line": 1069,
      "end_line": 1075,
      "comment": " Expansion function for source map. ",
      "child_ranges": [
        "(line 1071,col 5)-(line 1073,col 5)",
        "(line 1074,col 5)-(line 1074,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToLegacyOutputWriter(java.lang.String)",
      "begin_line": 1081,
      "end_line": 1091,
      "comment": "\n   * Converts a file name into a Writer taking in account the output charset.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1083,col 5)-(line 1085,col 5)",
        "(line 1086,col 5)-(line 1088,col 5)",
        "(line 1090,col 5)-(line 1090,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter2(java.lang.String)",
      "begin_line": 1097,
      "end_line": 1106,
      "comment": "\n   * Converts a file name into a Writer taking in account the output charset.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1098,col 5)-(line 1100,col 5)",
        "(line 1101,col 5)-(line 1103,col 5)",
        "(line 1105,col 5)-(line 1105,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(java.lang.String)",
      "begin_line": 1112,
      "end_line": 1118,
      "comment": "\n   * Converts a file name into a Outputstream.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1114,col 5)-(line 1116,col 5)",
        "(line 1117,col 5)-(line 1117,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.streamToLegacyOutputWriter(java.io.OutputStream)",
      "begin_line": 1123,
      "end_line": 1132,
      "comment": "\n   * Create a writer with the legacy output charset.\n   ",
      "child_ranges": [
        "(line 1125,col 5)-(line 1131,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter2(java.io.OutputStream)",
      "begin_line": 1137,
      "end_line": 1145,
      "comment": "\n   * Create a writer with the newer output charset.\n   ",
      "child_ranges": [
        "(line 1138,col 5)-(line 1144,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(B, java.lang.String)",
      "begin_line": 1153,
      "end_line": 1163,
      "comment": "\n   * Outputs the source map found in the compiler to the proper path if one\n   * exists.\n   *\n   * @param options The options to the Compiler.\n   ",
      "child_ranges": [
        "(line 1155,col 5)-(line 1157,col 5)",
        "(line 1159,col 5)-(line 1159,col 56)",
        "(line 1160,col 5)-(line 1160,col 50)",
        "(line 1161,col 5)-(line 1161,col 58)",
        "(line 1162,col 5)-(line 1162,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(java.lang.String)",
      "begin_line": 1171,
      "end_line": 1198,
      "comment": "\n   * Returns the path at which to output map file(s) based on the path at which\n   * the JS binary will be placed.\n   *\n   * @return The path in which to place the generated map file(s).\n   ",
      "child_ranges": [
        "(line 1172,col 5)-(line 1172,col 25)",
        "(line 1174,col 5)-(line 1195,col 5)",
        "(line 1197,col 5)-(line 1197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps()",
      "begin_line": 1204,
      "end_line": 1263,
      "comment": "\n   * Outputs the variable and property name maps for the specified compiler if\n   * the proper FLAGS are set.\n   ",
      "child_ranges": [
        "(line 1207,col 5)-(line 1207,col 40)",
        "(line 1208,col 5)-(line 1208,col 40)",
        "(line 1209,col 5)-(line 1209,col 51)",
        "(line 1212,col 5)-(line 1218,col 5)",
        "(line 1221,col 5)-(line 1228,col 5)",
        "(line 1230,col 5)-(line 1237,col 5)",
        "(line 1240,col 5)-(line 1244,col 5)",
        "(line 1246,col 5)-(line 1250,col 5)",
        "(line 1252,col 5)-(line 1262,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CompilerOptions, boolean)",
      "begin_line": 1273,
      "end_line": 1332,
      "comment": "\n   * Create a map of constant names to constant values from a textual\n   * description of the map.\n   *\n   * @param definitions A list of overriding definitions for defines in\n   *     the form \u003cname\u003e[\u003d\u003cval\u003e], where \u003cval\u003e is a number, boolean, or\n   *     single-quoted string without single quotes.\n   ",
      "child_ranges": [
        "(line 1277,col 5)-(line 1331,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateOutputPerModule(java.lang.String)",
      "begin_line": 1338,
      "end_line": 1341,
      "comment": "\n   * Returns true if and only if a manifest or bundle should be generated\n   * for each module, as opposed to one unified manifest.\n   ",
      "child_ranges": [
        "(line 1339,col 5)-(line 1340,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest()",
      "begin_line": 1343,
      "end_line": 1345,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 5)-(line 1344,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputBundle()",
      "begin_line": 1347,
      "end_line": 1349,
      "comment": "",
      "child_ranges": [
        "(line 1348,col 5)-(line 1348,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifestOrBundle(java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 1355,
      "end_line": 1397,
      "comment": "\n   * Writes the manifest or bundle of all compiler input files that survived\n   * manage_closure_dependencies, if requested.\n   ",
      "child_ranges": [
        "(line 1357,col 5)-(line 1359,col 5)",
        "(line 1361,col 5)-(line 1396,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputModuleGraphJson()",
      "begin_line": 1402,
      "end_line": 1409,
      "comment": "\n   * Creates a file containing the current module graph in JSON serialization.\n   ",
      "child_ranges": [
        "(line 1403,col 5)-(line 1408,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphJsonTo(java.lang.Appendable)",
      "begin_line": 1414,
      "end_line": 1417,
      "comment": "\n   * Prints the current module graph as JSON.\n   ",
      "child_ranges": [
        "(line 1416,col 5)-(line 1416,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphManifestOrBundleTo(com.google.javascript.jscomp.JSModuleGraph, java.lang.Appendable, boolean)",
      "begin_line": 1422,
      "end_line": 1446,
      "comment": "\n   * Prints a set of modules to the manifest or bundle file.\n   ",
      "child_ranges": [
        "(line 1425,col 5)-(line 1425,col 35)",
        "(line 1426,col 5)-(line 1426,col 36)",
        "(line 1427,col 5)-(line 1445,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printManifestTo(java.lang.Iterable\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.lang.Appendable)",
      "begin_line": 1452,
      "end_line": 1462,
      "comment": "\n   * Prints a list of input names (using root-relative paths), delimited by\n   * newlines, to the manifest file.\n   ",
      "child_ranges": [
        "(line 1454,col 5)-(line 1461,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printBundleTo(java.lang.Iterable\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.lang.Appendable)",
      "begin_line": 1468,
      "end_line": 1499,
      "comment": "\n   * Prints all the input contents, starting with a comment that specifies\n   * the input file name (using root-relative paths) before each file.\n   ",
      "child_ranges": [
        "(line 1470,col 5)-(line 1498,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.constructRootRelativePathsMap()",
      "begin_line": 1505,
      "end_line": 1516,
      "comment": "\n   * Construct and return the input root path map. The key is the exec path of\n   * each input file, and the value is the corresponding root relative path.\n   ",
      "child_ranges": [
        "(line 1506,col 5)-(line 1506,col 71)",
        "(line 1507,col 5)-(line 1514,col 5)",
        "(line 1515,col 5)-(line 1515,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CommandLineConfig",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1526,
      "end_line": 2004,
      "comment": "\n   * Configurations for the command line configs. Designed for easy\n   * building, so that we can decouple the flags-parsing library from\n   * the actual configuration options.\n   *\n   * By design, these configurations must match one-to-one with\n   * command-line flags.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "printTree"
      ],
      "begin_line": 1527,
      "end_line": 1527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintTree(boolean)",
      "begin_line": 1530,
      "end_line": 1533,
      "comment": " Prints out the parse tree and exits ",
      "child_ranges": [
        "(line 1531,col 7)-(line 1531,col 33)",
        "(line 1532,col 7)-(line 1532,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printAst"
      ],
      "begin_line": 1535,
      "end_line": 1535,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintAst(boolean)",
      "begin_line": 1541,
      "end_line": 1544,
      "comment": "\n     * Prints a dot file describing the internal abstract syntax tree\n     * and exits\n     ",
      "child_ranges": [
        "(line 1542,col 7)-(line 1542,col 31)",
        "(line 1543,col 7)-(line 1543,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printPassGraph"
      ],
      "begin_line": 1546,
      "end_line": 1546,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintPassGraph(boolean)",
      "begin_line": 1549,
      "end_line": 1552,
      "comment": " Prints a dot file describing the passes that will get run and exits ",
      "child_ranges": [
        "(line 1550,col 7)-(line 1550,col 43)",
        "(line 1551,col 7)-(line 1551,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jscompDevMode"
      ],
      "begin_line": 1554,
      "end_line": 1554,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJscompDevMode(com.google.javascript.jscomp.CompilerOptions.DevMode)",
      "begin_line": 1557,
      "end_line": 1560,
      "comment": " Turns on extra sanity checks ",
      "child_ranges": [
        "(line 1558,col 7)-(line 1558,col 41)",
        "(line 1559,col 7)-(line 1559,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "loggingLevel"
      ],
      "begin_line": 1562,
      "end_line": 1562,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setLoggingLevel(java.lang.String)",
      "begin_line": 1569,
      "end_line": 1572,
      "comment": "\n     * The logging level (standard java.util.logging.Level\n     * values) for Compiler progress. Does not control errors or\n     * warnings for the JavaScript code under compilation\n     ",
      "child_ranges": [
        "(line 1570,col 7)-(line 1570,col 39)",
        "(line 1571,col 7)-(line 1571,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 1574,
      "end_line": 1574,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setExterns(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1579,
      "end_line": 1583,
      "comment": "\n     * The file containing JavaScript externs. You may specify multiple.\n     ",
      "child_ranges": [
        "(line 1580,col 7)-(line 1580,col 27)",
        "(line 1581,col 7)-(line 1581,col 35)",
        "(line 1582,col 7)-(line 1582,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "js"
      ],
      "begin_line": 1585,
      "end_line": 1585,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1590,
      "end_line": 1594,
      "comment": "\n     * The JavaScript filename. You may specify multiple.\n     ",
      "child_ranges": [
        "(line 1591,col 7)-(line 1591,col 22)",
        "(line 1592,col 7)-(line 1592,col 25)",
        "(line 1593,col 7)-(line 1593,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jsOutputFile"
      ],
      "begin_line": 1596,
      "end_line": 1596,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJsOutputFile(java.lang.String)",
      "begin_line": 1601,
      "end_line": 1604,
      "comment": "\n     * Primary output filename. If not specified, output is written to stdout\n     ",
      "child_ranges": [
        "(line 1602,col 7)-(line 1602,col 39)",
        "(line 1603,col 7)-(line 1603,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 1606,
      "end_line": 1606,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModule(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1616,
      "end_line": 1620,
      "comment": "\n     * A JavaScript module specification. The format is\n     * \u003cname\u003e:\u003cnum-js-files\u003e[:[\u003cdep\u003e,...][:]]]. Module names must be\n     * unique. Each dep is the name of a module that this module\n     * depends on. Modules must be listed in dependency order, and JS\n     * source files must be listed in the corresponding order. Where\n     * --module flags occur in relation to --js flags is unimportant\n     ",
      "child_ranges": [
        "(line 1617,col 7)-(line 1617,col 26)",
        "(line 1618,col 7)-(line 1618,col 33)",
        "(line 1619,col 7)-(line 1619,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "variableMapInputFile"
      ],
      "begin_line": 1622,
      "end_line": 1622,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setVariableMapInputFile(java.lang.String)",
      "begin_line": 1628,
      "end_line": 1631,
      "comment": "\n     * File containing the serialized version of the variable renaming\n     * map produced by a previous compilation\n     ",
      "child_ranges": [
        "(line 1629,col 7)-(line 1629,col 55)",
        "(line 1630,col 7)-(line 1630,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapInputFile"
      ],
      "begin_line": 1633,
      "end_line": 1633,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPropertyMapInputFile(java.lang.String)",
      "begin_line": 1639,
      "end_line": 1642,
      "comment": "\n     * File containing the serialized version of the property renaming\n     * map produced by a previous compilation\n     ",
      "child_ranges": [
        "(line 1640,col 7)-(line 1640,col 55)",
        "(line 1641,col 7)-(line 1641,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "variableMapOutputFile"
      ],
      "begin_line": 1644,
      "end_line": 1644,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setVariableMapOutputFile(java.lang.String)",
      "begin_line": 1650,
      "end_line": 1653,
      "comment": "\n     * File where the serialized version of the variable renaming map\n     * produced should be saved\n     ",
      "child_ranges": [
        "(line 1651,col 7)-(line 1651,col 57)",
        "(line 1652,col 7)-(line 1652,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createNameMapFiles"
      ],
      "begin_line": 1655,
      "end_line": 1655,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCreateNameMapFiles(boolean)",
      "begin_line": 1664,
      "end_line": 1667,
      "comment": "\n     * If true, variable renaming and property renaming map\n     * files will be produced as {binary name}_vars_map.out and\n     * {binary name}_props_map.out. Note that this flag cannot be used\n     * in conjunction with either variable_map_output_file or\n     * property_map_output_file\n     ",
      "child_ranges": [
        "(line 1665,col 7)-(line 1665,col 51)",
        "(line 1666,col 7)-(line 1666,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapOutputFile"
      ],
      "begin_line": 1669,
      "end_line": 1669,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPropertyMapOutputFile(java.lang.String)",
      "begin_line": 1675,
      "end_line": 1678,
      "comment": "\n     * File where the serialized version of the property renaming map\n     * produced should be saved\n     ",
      "child_ranges": [
        "(line 1676,col 7)-(line 1676,col 57)",
        "(line 1677,col 7)-(line 1677,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 1680,
      "end_line": 1680,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 1685,
      "end_line": 1688,
      "comment": "\n     * Sets rules and conventions to enforce.\n     ",
      "child_ranges": [
        "(line 1686,col 7)-(line 1686,col 47)",
        "(line 1687,col 7)-(line 1687,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 1690,
      "end_line": 1690,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSummaryDetailLevel(int)",
      "begin_line": 1699,
      "end_line": 1702,
      "comment": "\n     * Controls how detailed the compilation summary is. Values:\n     *  0 (never print summary), 1 (print summary only if there are\n     * errors or warnings), 2 (print summary if type checking is on,\n     * see --check_types), 3 (always print summary). The default level\n     * is 1\n     ",
      "child_ranges": [
        "(line 1700,col 7)-(line 1700,col 51)",
        "(line 1701,col 7)-(line 1701,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputWrapper"
      ],
      "begin_line": 1704,
      "end_line": 1704,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputWrapper(java.lang.String)",
      "begin_line": 1710,
      "end_line": 1713,
      "comment": "\n     * Interpolate output into this string at the place denoted\n     * by the marker token %output%, or %output|jsstring%\n     ",
      "child_ranges": [
        "(line 1711,col 7)-(line 1711,col 41)",
        "(line 1712,col 7)-(line 1712,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moduleWrapper"
      ],
      "begin_line": 1715,
      "end_line": 1715,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModuleWrapper(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1721,
      "end_line": 1725,
      "comment": "\n     * An output wrapper for a JavaScript module (optional). See the flag\n     * description for formatting requirements.\n     ",
      "child_ranges": [
        "(line 1722,col 7)-(line 1722,col 33)",
        "(line 1723,col 7)-(line 1723,col 47)",
        "(line 1724,col 7)-(line 1724,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moduleOutputPathPrefix"
      ],
      "begin_line": 1727,
      "end_line": 1727,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModuleOutputPathPrefix(java.lang.String)",
      "begin_line": 1734,
      "end_line": 1737,
      "comment": "\n     * Prefix for filenames of compiled JS modules.\n     * \u003cmodule-name\u003e.js will be appended to this prefix. Directories\n     * will be created as needed. Use with --module\n     ",
      "child_ranges": [
        "(line 1735,col 7)-(line 1735,col 59)",
        "(line 1736,col 7)-(line 1736,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createSourceMap"
      ],
      "begin_line": 1739,
      "end_line": 1739,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCreateSourceMap(java.lang.String)",
      "begin_line": 1748,
      "end_line": 1751,
      "comment": "\n     * If specified, a source map file mapping the generated\n     * source files back to the original source file will be\n     * output to the specified path. The %outname% placeholder will\n     * expand to the name of the output file that the source map\n     * corresponds to.\n     ",
      "child_ranges": [
        "(line 1749,col 7)-(line 1749,col 45)",
        "(line 1750,col 7)-(line 1750,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 1753,
      "end_line": 1754,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSourceMapDetailLevel(com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 1759,
      "end_line": 1762,
      "comment": "\n     * The detail supplied in the source map file, if generated.\n     ",
      "child_ranges": [
        "(line 1760,col 7)-(line 1760,col 40)",
        "(line 1761,col 7)-(line 1761,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 1764,
      "end_line": 1765,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSourceMapFormat(com.google.javascript.jscomp.SourceMap.Format)",
      "begin_line": 1770,
      "end_line": 1773,
      "comment": "\n     * The detail supplied in the source map file, if generated.\n     ",
      "child_ranges": [
        "(line 1771,col 7)-(line 1771,col 36)",
        "(line 1772,col 7)-(line 1772,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningGuards"
      ],
      "begin_line": 1775,
      "end_line": 1775,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setWarningGuardSpec(com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec)",
      "begin_line": 1780,
      "end_line": 1783,
      "comment": "\n     * Add warning guards.\n     ",
      "child_ranges": [
        "(line 1781,col 7)-(line 1781,col 32)",
        "(line 1782,col 7)-(line 1782,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "define"
      ],
      "begin_line": 1785,
      "end_line": 1785,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setDefine(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1794,
      "end_line": 1798,
      "comment": "\n     * Override the value of a variable annotated @define.\n     * The format is \u003cname\u003e[\u003d\u003cval\u003e], where \u003cname\u003e is the name of a @define\n     * variable and \u003cval\u003e is a boolean, number, or a single-quoted string\n     * that contains no single quotes. If [\u003d\u003cval\u003e] is omitted,\n     * the variable is marked true\n     ",
      "child_ranges": [
        "(line 1795,col 7)-(line 1795,col 26)",
        "(line 1796,col 7)-(line 1796,col 33)",
        "(line 1797,col 7)-(line 1797,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tweak"
      ],
      "begin_line": 1800,
      "end_line": 1800,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTweak(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1808,
      "end_line": 1812,
      "comment": "\n     * Override the default value of a registered tweak. The format is\n     * \u003cname\u003e[\u003d\u003cval\u003e], where \u003cname\u003e is the ID of a tweak and \u003cval\u003e is a boolean,\n     * number, or a single-quoted string that contains no single quotes. If\n     * [\u003d\u003cval\u003e] is omitted, then true is assumed.\n     ",
      "child_ranges": [
        "(line 1809,col 7)-(line 1809,col 25)",
        "(line 1810,col 7)-(line 1810,col 31)",
        "(line 1811,col 7)-(line 1811,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tweakProcessing"
      ],
      "begin_line": 1814,
      "end_line": 1814,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing)",
      "begin_line": 1819,
      "end_line": 1822,
      "comment": "\n     * Sets the kind of processing to do for goog.tweak functions.\n     ",
      "child_ranges": [
        "(line 1820,col 7)-(line 1820,col 45)",
        "(line 1821,col 7)-(line 1821,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 1824,
      "end_line": 1824,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCharset(java.lang.String)",
      "begin_line": 1829,
      "end_line": 1832,
      "comment": "\n     * Input charset for all files.\n     ",
      "child_ranges": [
        "(line 1830,col 7)-(line 1830,col 29)",
        "(line 1831,col 7)-(line 1831,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "manageClosureDependencies"
      ],
      "begin_line": 1834,
      "end_line": 1834,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setManageClosureDependencies(boolean)",
      "begin_line": 1840,
      "end_line": 1843,
      "comment": "\n     * Sets whether to sort files by their goog.provide/require deps,\n     * and prune inputs that are not required.\n     ",
      "child_ranges": [
        "(line 1841,col 7)-(line 1841,col 46)",
        "(line 1842,col 7)-(line 1842,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "onlyClosureDependencies"
      ],
      "begin_line": 1845,
      "end_line": 1845,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOnlyClosureDependencies(boolean)",
      "begin_line": 1852,
      "end_line": 1855,
      "comment": "\n     * Sets whether to sort files by their goog.provide/require deps,\n     * and prune inputs that are not required, and drop all non-closure\n     * files.\n     ",
      "child_ranges": [
        "(line 1853,col 7)-(line 1853,col 44)",
        "(line 1854,col 7)-(line 1854,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureEntryPoints"
      ],
      "begin_line": 1857,
      "end_line": 1857,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setClosureEntryPoints(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1863,
      "end_line": 1867,
      "comment": "\n     * Set closure entry points, which makes the compiler only include\n     * those files and sort them in dependency order.\n     ",
      "child_ranges": [
        "(line 1864,col 7)-(line 1864,col 46)",
        "(line 1865,col 7)-(line 1865,col 44)",
        "(line 1866,col 7)-(line 1866,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputManifests"
      ],
      "begin_line": 1869,
      "end_line": 1869,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputManifest(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1875,
      "end_line": 1884,
      "comment": "\n     * Sets whether to print output manifest files.\n     * Filter out empty file names.\n     ",
      "child_ranges": [
        "(line 1876,col 7)-(line 1876,col 50)",
        "(line 1877,col 7)-(line 1881,col 7)",
        "(line 1882,col 7)-(line 1882,col 72)",
        "(line 1883,col 7)-(line 1883,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputModuleDependencies"
      ],
      "begin_line": 1886,
      "end_line": 1886,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputModuleDependencies(java.lang.String)",
      "begin_line": 1892,
      "end_line": 1896,
      "comment": "\n     * Sets whether a JSON file representing the dependencies between modules\n     * should be created.\n     ",
      "child_ranges": [
        "(line 1894,col 7)-(line 1894,col 63)",
        "(line 1895,col 7)-(line 1895,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputBundles"
      ],
      "begin_line": 1898,
      "end_line": 1898,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputBundle(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1903,
      "end_line": 1906,
      "comment": "\n     * Sets whether to print output bundle files.\n     ",
      "child_ranges": [
        "(line 1904,col 7)-(line 1904,col 41)",
        "(line 1905,col 7)-(line 1905,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 1908,
      "end_line": 1908,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setAcceptConstKeyword(boolean)",
      "begin_line": 1913,
      "end_line": 1916,
      "comment": "\n     * Sets whether to accept usage of \u0027const\u0027 keyword.\n     ",
      "child_ranges": [
        "(line 1914,col 7)-(line 1914,col 51)",
        "(line 1915,col 7)-(line 1915,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 1918,
      "end_line": 1918,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setLanguageIn(java.lang.String)",
      "begin_line": 1924,
      "end_line": 1927,
      "comment": "\n     * Sets whether to accept input files as ECMAScript5 compliant.\n     * Otherwise, input files are treated as ECMAScript3 compliant.\n     ",
      "child_ranges": [
        "(line 1925,col 7)-(line 1925,col 35)",
        "(line 1926,col 7)-(line 1926,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "skipNormalOutputs"
      ],
      "begin_line": 1929,
      "end_line": 1929,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSkipNormalOutputs(boolean)",
      "begin_line": 1934,
      "end_line": 1937,
      "comment": "\n     * Sets whether the normal outputs of compilation should be skipped.\n     ",
      "child_ranges": [
        "(line 1935,col 7)-(line 1935,col 49)",
        "(line 1936,col 7)-(line 1936,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "manifestMaps"
      ],
      "begin_line": 1939,
      "end_line": 1939,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setManifestMaps(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1944,
      "end_line": 1947,
      "comment": "\n     * Sets the execPath:rootRelativePath mappings\n     ",
      "child_ranges": [
        "(line 1945,col 7)-(line 1945,col 39)",
        "(line 1946,col 7)-(line 1946,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "transformAMDToCJSModules"
      ],
      "begin_line": 1950,
      "end_line": 1950,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTransformAMDToCJSModules(boolean)",
      "begin_line": 1955,
      "end_line": 1959,
      "comment": "\n     * Set whether to transform AMD to CommonJS modules.\n     ",
      "child_ranges": [
        "(line 1957,col 7)-(line 1957,col 63)",
        "(line 1958,col 7)-(line 1958,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processCommonJSModules"
      ],
      "begin_line": 1961,
      "end_line": 1961,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setProcessCommonJSModules(boolean)",
      "begin_line": 1966,
      "end_line": 1970,
      "comment": "\n     * Sets whether to process CommonJS modules.\n     ",
      "child_ranges": [
        "(line 1968,col 7)-(line 1968,col 59)",
        "(line 1969,col 7)-(line 1969,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "commonJSModulePathPrefix"
      ],
      "begin_line": 1973,
      "end_line": 1974,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCommonJSModulePathPrefix(java.lang.String)",
      "begin_line": 1979,
      "end_line": 1983,
      "comment": "\n     * Sets the CommonJS module path prefix.\n     ",
      "child_ranges": [
        "(line 1981,col 7)-(line 1981,col 63)",
        "(line 1982,col 7)-(line 1982,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningsWhitelistFile"
      ],
      "begin_line": 1985,
      "end_line": 1985,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setWarningsWhitelistFile(java.lang.String)",
      "begin_line": 1990,
      "end_line": 1993,
      "comment": "\n     * Sets a whitelist file that suppresses warnings.\n     ",
      "child_ranges": [
        "(line 1991,col 7)-(line 1991,col 44)",
        "(line 1992,col 7)-(line 1992,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "angularPass"
      ],
      "begin_line": 1995,
      "end_line": 1995,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setAngularPass(boolean)",
      "begin_line": 2000,
      "end_line": 2003,
      "comment": "\n     * Sets whether to process AngularJS-specific annotations.\n     ",
      "child_ranges": [
        "(line 2001,col 7)-(line 2001,col 37)",
        "(line 2002,col 7)-(line 2002,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardSpec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2010,
      "end_line": 2031,
      "comment": "\n   * A little helper class to make it easier to collect warning types\n   * from --jscomp_error, --jscomp_warning, and --jscomp_off.\n   "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2011,
      "end_line": 2019,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 2012,
      "end_line": 2012,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 2013,
      "end_line": 2013,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.Entry.Entry(com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 2015,
      "end_line": 2018,
      "comment": "",
      "child_ranges": [
        "(line 2016,col 9)-(line 2016,col 27)",
        "(line 2017,col 9)-(line 2017,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 2022,
      "end_line": 2022,
      "comment": " The entries, in the order that they were added."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.add(com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 2024,
      "end_line": 2026,
      "comment": "",
      "child_ranges": [
        "(line 2025,col 7)-(line 2025,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.clear()",
      "begin_line": 2028,
      "end_line": 2030,
      "comment": "",
      "child_ranges": [
        "(line 2029,col 7)-(line 2029,col 22)"
      ]
    }
  ]
}