{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AbstractCommandLineRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCommandLineRunner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 96,
      "end_line": 2102,
      "comment": "\n * Implementations of AbstractCommandLineRunner translate flags into Java\n * API calls on the Compiler. AbstractCompiler contains common flags and logic\n * to make that happen.\n *\n * This class may be extended and used to create other Java classes\n * that behave the same as running the Compiler from the command line. Example:\n *\n * \u003cpre\u003e\n * class MyCommandLineRunner extends\n *     AbstractCommandLineRunner\u003cMyCompiler, MyOptions\u003e {\n *   MyCommandLineRunner(String[] args) {\n *     super(args);\n *   }\n *\n *   \u0026#064;Override\n *   protected MyOptions createOptions() {\n *     MyOptions options \u003d new MyOptions();\n *     CompilerFlagTranslator.setOptionsFromFlags(options);\n *     addMyCrazyCompilerPassThatOutputsAnExtraFile(options);\n *     return options;\n *   }\n *\n *   \u0026#064;Override\n *   protected MyCompiler createCompiler() {\n *     return new MyCompiler();\n *   }\n *\n *   public static void main(String[] args) {\n *     (new MyCommandLineRunner(args)).run();\n *   }\n * }\n * \u003c/pre\u003e\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_SAME_AS_INPUT_ERROR"
      ],
      "begin_line": 98,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "config"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsOutput"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "err"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputCharset"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputCharset2"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " designed this if I had a time machine."
    },
    {
      "type": "field",
      "varNames": [
        "legacyOutputCharset"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testMode"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsSupplierForTesting"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputsSupplierForTesting"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modulesSupplierForTesting"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exitCodeReceiverForTesting"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootRelativePathsMap"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsedModuleWrappers"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_RUNS_TO_DETERMINE_OPTIMAL_ORDER"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Bookkeeping to measure optimal phase orderings."
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_MARKER"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OUTPUT_MARKER_JS_STRING"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runTimeStats"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.AbstractCommandLineRunner()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.AbstractCommandLineRunner(java.io.PrintStream, java.io.PrintStream)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 42)",
        "(line 143,col 5)-(line 143,col 52)",
        "(line 144,col 5)-(line 144,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.enableTestMode(com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e\u003e, com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.SourceFile\u003e\u003e, com.google.common.base.Supplier\u003cjava.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e\u003e, com.google.common.base.Function\u003cjava.lang.Integer, java.lang.Boolean\u003e)",
      "begin_line": 157,
      "end_line": 170,
      "comment": "\n   * Put the command line runner into test mode. In test mode,\n   * all outputs will be blackholed.\n   * @param externsSupplier A provider for externs.\n   * @param inputsSupplier A provider for source inputs.\n   * @param modulesSupplier A provider for modules. Only one of inputsSupplier\n   *     and modulesSupplier may be non-null.\n   * @param exitCodeReceiver A receiver for the status code that would\n   *     have been passed to System.exit in non-test mode.\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 164,col 58)",
        "(line 165,col 5)-(line 165,col 20)",
        "(line 166,col 5)-(line 166,col 53)",
        "(line 167,col 5)-(line 167,col 51)",
        "(line 168,col 5)-(line 168,col 53)",
        "(line 169,col 5)-(line 169,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.isInTestMode()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n   * Returns whether we\u0027re in test mode.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getCommandLineConfig()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n   * Get the command line config, so that it can be initialized.\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createCompiler()",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n   * Returns the instance of the Compiler to use when {@link #run()} is\n   * called.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createOptions()",
      "begin_line": 197,
      "end_line": 197,
      "comment": "\n   * Returns the instance of the Options to use when {@link #run()} is called.\n   * createCompiler() is called before createOptions(), so getCompiler()\n   * will not return null when createOptions() is called.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getDiagnosticGroups()",
      "begin_line": 202,
      "end_line": 207,
      "comment": "\n   * The warning classes that are available from the command-line.\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 205,col 5)",
        "(line 206,col 5)-(line 206,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.initOptionsFromFlags(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 210,
      "end_line": 211,
      "comment": " No longer does anything. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createDependencyOptions(boolean, boolean, boolean, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 216,
      "end_line": 249,
      "comment": "\n   * A helper function for creating the dependency options object.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 247,col 5)",
        "(line 248,col 5)-(line 248,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.setRunOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 257,
      "end_line": 364,
      "comment": "\n   * Sets options based on the configurations set flags API.\n   * Called during the run() run() method.\n   * If you want to ignore the flags API, or interpret flags your own way,\n   * then you should override this method.\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 62)",
        "(line 261,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 67)",
        "(line 275,col 5)-(line 275,col 55)",
        "(line 276,col 5)-(line 276,col 65)",
        "(line 278,col 5)-(line 282,col 35)",
        "(line 283,col 5)-(line 285,col 5)",
        "(line 287,col 5)-(line 287,col 43)",
        "(line 288,col 5)-(line 288,col 57)",
        "(line 289,col 5)-(line 289,col 61)",
        "(line 290,col 5)-(line 290,col 36)",
        "(line 292,col 5)-(line 292,col 75)",
        "(line 293,col 5)-(line 293,col 41)",
        "(line 294,col 5)-(line 294,col 37)",
        "(line 296,col 5)-(line 301,col 5)",
        "(line 303,col 5)-(line 306,col 5)",
        "(line 308,col 5)-(line 311,col 5)",
        "(line 313,col 5)-(line 315,col 5)",
        "(line 316,col 5)-(line 316,col 63)",
        "(line 317,col 5)-(line 317,col 53)",
        "(line 319,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 327,col 5)",
        "(line 329,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 358,col 5)",
        "(line 360,col 5)-(line 360,col 59)",
        "(line 361,col 5)-(line 361,col 71)",
        "(line 362,col 5)-(line 362,col 67)",
        "(line 363,col 5)-(line 363,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getCompiler()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.run()",
      "begin_line": 374,
      "end_line": 412,
      "comment": "\n   * Runs the Compiler and calls System.exit() with the exit status of the\n   * compiler.\n   ",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 19)",
        "(line 376,col 5)-(line 376,col 17)",
        "(line 377,col 5)-(line 380,col 5)",
        "(line 381,col 5)-(line 393,col 5)",
        "(line 395,col 5)-(line 397,col 5)",
        "(line 399,col 5)-(line 405,col 5)",
        "(line 407,col 5)-(line 411,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getErrorPrintStream()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n   * Returns the PrintStream for writing errors associated with this\n   * AbstractCommandLineRunner.\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlagUsageException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 425,
      "end_line": 431,
      "comment": "\n   * An exception thrown when command-line flags are used incorrectly.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException.FlagUsageException(java.lang.String)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 7)-(line 429,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createInputs(java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 444,
      "end_line": 473,
      "comment": "\n   * Creates inputs from a list of files.\n   *\n   * Can be overridden by subclasses who want to pull files from different\n   * places.\n   *\n   * @param files A list of filenames\n   * @param allowStdIn Whether \u0027-\u0027 is allowed appear as a filename to represent\n   *        stdin. If true, \u0027-\u0027 is only allowed to appear once.\n   * @return An array of inputs\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 70)",
        "(line 447,col 5)-(line 447,col 31)",
        "(line 448,col 5)-(line 471,col 5)",
        "(line 472,col 5)-(line 472,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createSourceInputs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 478,
      "end_line": 491,
      "comment": "\n   * Creates JS source code inputs from a list of files.\n   ",
      "child_ranges": [
        "(line 480,col 5)-(line 482,col 5)",
        "(line 483,col 5)-(line 485,col 5)",
        "(line 486,col 5)-(line 490,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createExternInputs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 496,
      "end_line": 506,
      "comment": "\n   * Creates JS extern inputs from a list of files.\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 500,col 5)",
        "(line 501,col 5)-(line 505,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createJsModules(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 517,
      "end_line": 600,
      "comment": "\n   * Creates module objects from a list of module specifications.\n   *\n   * @param specs A list of module specifications, not null or empty. The spec\n   *        format is: \u003ccode\u003ename:num-js-files[:[dep,...][:]]\u003c/code\u003e. Module\n   *        names must not contain the \u0027:\u0027 character.\n   * @param jsFiles A list of JS file paths, not null\n   * @return An array of module objects\n   ",
      "child_ranges": [
        "(line 520,col 5)-(line 522,col 5)",
        "(line 524,col 5)-(line 524,col 44)",
        "(line 525,col 5)-(line 525,col 47)",
        "(line 526,col 5)-(line 526,col 46)",
        "(line 528,col 5)-(line 528,col 47)",
        "(line 529,col 5)-(line 529,col 28)",
        "(line 531,col 5)-(line 531,col 66)",
        "(line 532,col 5)-(line 592,col 5)",
        "(line 594,col 5)-(line 597,col 5)",
        "(line 599,col 5)-(line 599,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.checkModuleName(java.lang.String)",
      "begin_line": 607,
      "end_line": 612,
      "comment": "\n   * Validates the module name. Can be overridden by subclasses.\n   * @param name The module name\n   * @throws FlagUsageException if the validation fails\n   ",
      "child_ranges": [
        "(line 609,col 5)-(line 611,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.parseModuleWrappers(java.util.List\u003cjava.lang.String\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 623,
      "end_line": 657,
      "comment": "\n   * Parses module wrapper specifications.\n   *\n   * @param specs A list of module wrapper specifications, not null. The spec\n   *        format is: \u003ccode\u003ename:wrapper\u003c/code\u003e. Wrappers.\n   * @param modules The JS modules whose wrappers are specified\n   * @return A map from module name to module wrapper. Modules with no wrapper\n   *         will have the empty string as their value in this map.\n   ",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 44)",
        "(line 627,col 5)-(line 628,col 56)",
        "(line 631,col 5)-(line 633,col 5)",
        "(line 635,col 5)-(line 655,col 5)",
        "(line 656,col 5)-(line 656,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getModuleOutputFileName(com.google.javascript.jscomp.JSModule)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 660,col 5)-(line 660,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.writeModuleOutput(java.lang.Appendable, com.google.javascript.jscomp.JSModule)",
      "begin_line": 663,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 666,col 5)-(line 671,col 5)",
        "(line 673,col 5)-(line 673,col 49)",
        "(line 674,col 5)-(line 674,col 51)",
        "(line 675,col 5)-(line 677,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.writeOutput(java.lang.Appendable, com.google.javascript.jscomp.Compiler, java.lang.String, java.lang.String, java.lang.String, com.google.common.base.Function\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 684,
      "end_line": 717,
      "comment": "\n   * Writes code to an output stream, optionally wrapping it in an arbitrary\n   * wrapper that contains a placeholder where the code should be inserted.\n   ",
      "child_ranges": [
        "(line 688,col 5)-(line 688,col 47)",
        "(line 689,col 5)-(line 716,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.maybeCreateDirsForPath(java.lang.String)",
      "begin_line": 723,
      "end_line": 733,
      "comment": "\n   * Creates any directories necessary to write a file that will have a given\n   * path prefix.\n   ",
      "child_ranges": [
        "(line 724,col 5)-(line 732,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.doRun()",
      "begin_line": 740,
      "end_line": 816,
      "comment": "\n   * Parses command-line arguments and runs the compiler.\n   *\n   * @return system exit status\n   ",
      "child_ranges": [
        "(line 741,col 5)-(line 741,col 63)",
        "(line 743,col 5)-(line 743,col 47)",
        "(line 745,col 5)-(line 745,col 32)",
        "(line 746,col 5)-(line 746,col 32)",
        "(line 748,col 5)-(line 748,col 34)",
        "(line 749,col 5)-(line 749,col 25)",
        "(line 751,col 5)-(line 751,col 27)",
        "(line 753,col 5)-(line 753,col 63)",
        "(line 754,col 5)-(line 754,col 56)",
        "(line 755,col 5)-(line 760,col 5)",
        "(line 762,col 5)-(line 762,col 37)",
        "(line 763,col 5)-(line 763,col 45)",
        "(line 765,col 5)-(line 765,col 42)",
        "(line 766,col 5)-(line 771,col 5)",
        "(line 772,col 5)-(line 790,col 5)",
        "(line 791,col 5)-(line 798,col 5)",
        "(line 800,col 5)-(line 806,col 5)",
        "(line 808,col 5)-(line 808,col 59)",
        "(line 812,col 5)-(line 814,col 5)",
        "(line 815,col 5)-(line 815,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.processResults(com.google.javascript.jscomp.Result, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, B)",
      "begin_line": 821,
      "end_line": 898,
      "comment": "\n   * Processes the results of the compile job, and returns an error code.\n   ",
      "child_ranges": [
        "(line 823,col 5)-(line 825,col 5)",
        "(line 827,col 5)-(line 836,col 5)",
        "(line 838,col 5)-(line 848,col 5)",
        "(line 850,col 5)-(line 859,col 5)",
        "(line 861,col 5)-(line 861,col 59)",
        "(line 863,col 5)-(line 894,col 5)",
        "(line 897,col 5)-(line 897,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getJavascriptEscaper()",
      "begin_line": 900,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 901,col 5)-(line 902,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputSingleBinary()",
      "begin_line": 905,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 906,col 5)-(line 906,col 44)",
        "(line 907,col 5)-(line 907,col 34)",
        "(line 908,col 5)-(line 911,col 5)",
        "(line 913,col 5)-(line 915,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputModuleBinaryAndSourceMaps(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, B)",
      "begin_line": 918,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 921,col 5)-(line 922,col 39)",
        "(line 923,col 5)-(line 923,col 58)",
        "(line 928,col 5)-(line 928,col 25)",
        "(line 930,col 5)-(line 932,col 5)",
        "(line 934,col 5)-(line 958,col 5)",
        "(line 960,col 5)-(line 962,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getInputCharset()",
      "begin_line": 972,
      "end_line": 981,
      "comment": "\n   * Query the flag for the input charset, and return a Charset object\n   * representing the selection.\n   *\n   * @return Charset to use when reading inputs\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 973,col 5)-(line 979,col 5)",
        "(line 980,col 5)-(line 980,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getLegacyOutputCharset()",
      "begin_line": 995,
      "end_line": 1004,
      "comment": "\n   * Query the flag for the output charset.\n   *\n   * Let the outputCharset be the same as the input charset... except if\n   * we\u0027re reading in UTF-8 by default.  By tradition, we\u0027ve always\n   * output ASCII to avoid various hiccups with different browsers,\n   * proxies and firewalls.\n   *\n   * @return Name of the charset to use when writing outputs. Guaranteed to\n   *    be a supported charset.\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 996,col 5)-(line 1002,col 5)",
        "(line 1003,col 5)-(line 1003,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getOutputCharset2()",
      "begin_line": 1010,
      "end_line": 1019,
      "comment": "\n   * Query the flag for the output charset. Defaults to UTF-8.\n   * @throws FlagUsageException if flag is not a valid Charset name.\n   ",
      "child_ranges": [
        "(line 1011,col 5)-(line 1017,col 5)",
        "(line 1018,col 5)-(line 1018,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createExterns()",
      "begin_line": 1021,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 5)-(line 1024,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateMapPerModule(B)",
      "begin_line": 1032,
      "end_line": 1035,
      "comment": "\n   * Returns true if and only if a source map file should be generated for each\n   * module, as opposed to one unified map. This is specified by having the\n   * source map pattern include the %outname% variable.\n   ",
      "child_ranges": [
        "(line 1033,col 5)-(line 1034,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.openExternExportsStream(B, java.lang.String)",
      "begin_line": 1045,
      "end_line": 1059,
      "comment": "\n   * Returns a stream for outputting the generated externs file.\n   *\n   * @param options The options to the Compiler.\n   * @param path The path of the generated JS source file.\n   *\n   * @return The stream or null if no extern-ed exports are being generated.\n   ",
      "child_ranges": [
        "(line 1047,col 5)-(line 1049,col 5)",
        "(line 1051,col 5)-(line 1051,col 46)",
        "(line 1053,col 5)-(line 1056,col 5)",
        "(line 1058,col 5)-(line 1058,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.expandCommandLinePath(java.lang.String, com.google.javascript.jscomp.JSModule)",
      "begin_line": 1076,
      "end_line": 1087,
      "comment": "\n   * Expand a file path specified on the command-line.\n   *\n   * Most file paths on the command-line allow an %outname% placeholder.\n   * The placeholder will expand to a different value depending on\n   * the current output mode. There are three scenarios:\n   *\n   * 1) Single JS output, single extra output: sub in jsOutputPath.\n   * 2) Multiple JS output, single extra output: sub in the base module name.\n   * 3) Multiple JS output, multiple extra output: sub in the module output\n   *    file.\n   *\n   * Passing a JSModule to this function automatically triggers case #3.\n   * Otherwise, we\u0027ll use strategy #1 or #2 based on the current output mode.\n   ",
      "child_ranges": [
        "(line 1078,col 5)-(line 1078,col 15)",
        "(line 1079,col 5)-(line 1085,col 5)",
        "(line 1086,col 5)-(line 1086,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.expandSourceMapPath(B, com.google.javascript.jscomp.JSModule)",
      "begin_line": 1090,
      "end_line": 1096,
      "comment": " Expansion function for source map. ",
      "child_ranges": [
        "(line 1092,col 5)-(line 1094,col 5)",
        "(line 1095,col 5)-(line 1095,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToLegacyOutputWriter(java.lang.String)",
      "begin_line": 1102,
      "end_line": 1112,
      "comment": "\n   * Converts a file name into a Writer taking in account the output charset.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1104,col 5)-(line 1106,col 5)",
        "(line 1107,col 5)-(line 1109,col 5)",
        "(line 1111,col 5)-(line 1111,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.fileNameToOutputWriter2(java.lang.String)",
      "begin_line": 1118,
      "end_line": 1127,
      "comment": "\n   * Converts a file name into a Writer taking in account the output charset.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1119,col 5)-(line 1121,col 5)",
        "(line 1122,col 5)-(line 1124,col 5)",
        "(line 1126,col 5)-(line 1126,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.filenameToOutputStream(java.lang.String)",
      "begin_line": 1133,
      "end_line": 1139,
      "comment": "\n   * Converts a file name into a Outputstream.\n   * Returns null if the file name is null.\n   ",
      "child_ranges": [
        "(line 1135,col 5)-(line 1137,col 5)",
        "(line 1138,col 5)-(line 1138,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.streamToLegacyOutputWriter(java.io.OutputStream)",
      "begin_line": 1144,
      "end_line": 1153,
      "comment": "\n   * Create a writer with the legacy output charset.\n   ",
      "child_ranges": [
        "(line 1146,col 5)-(line 1152,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.streamToOutputWriter2(java.io.OutputStream)",
      "begin_line": 1158,
      "end_line": 1166,
      "comment": "\n   * Create a writer with the newer output charset.\n   ",
      "child_ranges": [
        "(line 1159,col 5)-(line 1165,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputSourceMap(B, java.lang.String)",
      "begin_line": 1174,
      "end_line": 1184,
      "comment": "\n   * Outputs the source map found in the compiler to the proper path if one\n   * exists.\n   *\n   * @param options The options to the Compiler.\n   ",
      "child_ranges": [
        "(line 1176,col 5)-(line 1178,col 5)",
        "(line 1180,col 5)-(line 1180,col 56)",
        "(line 1181,col 5)-(line 1181,col 50)",
        "(line 1182,col 5)-(line 1182,col 58)",
        "(line 1183,col 5)-(line 1183,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.getMapPath(java.lang.String)",
      "begin_line": 1192,
      "end_line": 1219,
      "comment": "\n   * Returns the path at which to output map file(s) based on the path at which\n   * the JS binary will be placed.\n   *\n   * @return The path in which to place the generated map file(s).\n   ",
      "child_ranges": [
        "(line 1193,col 5)-(line 1193,col 25)",
        "(line 1195,col 5)-(line 1216,col 5)",
        "(line 1218,col 5)-(line 1218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputNameMaps(B)",
      "begin_line": 1225,
      "end_line": 1284,
      "comment": "\n   * Outputs the variable and property name maps for the specified compiler if\n   * the proper FLAGS are set.\n   ",
      "child_ranges": [
        "(line 1228,col 5)-(line 1228,col 40)",
        "(line 1229,col 5)-(line 1229,col 40)",
        "(line 1230,col 5)-(line 1230,col 51)",
        "(line 1233,col 5)-(line 1239,col 5)",
        "(line 1242,col 5)-(line 1249,col 5)",
        "(line 1251,col 5)-(line 1258,col 5)",
        "(line 1261,col 5)-(line 1265,col 5)",
        "(line 1267,col 5)-(line 1271,col 5)",
        "(line 1273,col 5)-(line 1283,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.createDefineOrTweakReplacements(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CompilerOptions, boolean)",
      "begin_line": 1294,
      "end_line": 1353,
      "comment": "\n   * Create a map of constant names to constant values from a textual\n   * description of the map.\n   *\n   * @param definitions A list of overriding definitions for defines in\n   *     the form \u003cname\u003e[\u003d\u003cval\u003e], where \u003cval\u003e is a number, boolean, or\n   *     single-quoted string without single quotes.\n   ",
      "child_ranges": [
        "(line 1298,col 5)-(line 1352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.shouldGenerateOutputPerModule(java.lang.String)",
      "begin_line": 1359,
      "end_line": 1362,
      "comment": "\n   * Returns true if and only if a manifest or bundle should be generated\n   * for each module, as opposed to one unified manifest.\n   ",
      "child_ranges": [
        "(line 1360,col 5)-(line 1361,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifest()",
      "begin_line": 1364,
      "end_line": 1366,
      "comment": "",
      "child_ranges": [
        "(line 1365,col 5)-(line 1365,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputBundle()",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 5)-(line 1369,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputManifestOrBundle(java.util.List\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 1376,
      "end_line": 1418,
      "comment": "\n   * Writes the manifest or bundle of all compiler input files that survived\n   * manage_closure_dependencies, if requested.\n   ",
      "child_ranges": [
        "(line 1378,col 5)-(line 1380,col 5)",
        "(line 1382,col 5)-(line 1417,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.outputModuleGraphJson()",
      "begin_line": 1423,
      "end_line": 1430,
      "comment": "\n   * Creates a file containing the current module graph in JSON serialization.\n   ",
      "child_ranges": [
        "(line 1424,col 5)-(line 1429,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphJsonTo(com.google.javascript.jscomp.JSModuleGraph, java.lang.Appendable)",
      "begin_line": 1435,
      "end_line": 1439,
      "comment": "\n   * Prints the current module graph as JSON.\n   ",
      "child_ranges": [
        "(line 1438,col 5)-(line 1438,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printModuleGraphManifestOrBundleTo(com.google.javascript.jscomp.JSModuleGraph, java.lang.Appendable, boolean)",
      "begin_line": 1444,
      "end_line": 1468,
      "comment": "\n   * Prints a set of modules to the manifest or bundle file.\n   ",
      "child_ranges": [
        "(line 1447,col 5)-(line 1447,col 35)",
        "(line 1448,col 5)-(line 1448,col 36)",
        "(line 1449,col 5)-(line 1467,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printManifestTo(java.lang.Iterable\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.lang.Appendable)",
      "begin_line": 1474,
      "end_line": 1484,
      "comment": "\n   * Prints a list of input names (using root-relative paths), delimited by\n   * newlines, to the manifest file.\n   ",
      "child_ranges": [
        "(line 1476,col 5)-(line 1483,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.printBundleTo(java.lang.Iterable\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.lang.Appendable)",
      "begin_line": 1490,
      "end_line": 1521,
      "comment": "\n   * Prints all the input contents, starting with a comment that specifies\n   * the input file name (using root-relative paths) before each file.\n   ",
      "child_ranges": [
        "(line 1492,col 5)-(line 1520,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.constructRootRelativePathsMap()",
      "begin_line": 1527,
      "end_line": 1538,
      "comment": "\n   * Construct and return the input root path map. The key is the exec path of\n   * each input file, and the value is the corresponding root relative path.\n   ",
      "child_ranges": [
        "(line 1528,col 5)-(line 1528,col 71)",
        "(line 1529,col 5)-(line 1536,col 5)",
        "(line 1537,col 5)-(line 1537,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RunTimeStats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1540,
      "end_line": 1585,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bestRunTime"
      ],
      "begin_line": 1541,
      "end_line": 1541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "worstRunTime"
      ],
      "begin_line": 1542,
      "end_line": 1542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastStartTime"
      ],
      "begin_line": 1543,
      "end_line": 1543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loopedPassesInBestRun"
      ],
      "begin_line": 1544,
      "end_line": 1544,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.RunTimeStats.recordStartRun()",
      "begin_line": 1549,
      "end_line": 1552,
      "comment": "\n     * Record the start of a run.\n     ",
      "child_ranges": [
        "(line 1550,col 7)-(line 1550,col 49)",
        "(line 1551,col 7)-(line 1551,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.RunTimeStats.recordEndRun()",
      "begin_line": 1557,
      "end_line": 1565,
      "comment": "\n     * Record the end of a run.\n     ",
      "child_ranges": [
        "(line 1558,col 7)-(line 1558,col 48)",
        "(line 1559,col 7)-(line 1559,col 44)",
        "(line 1560,col 7)-(line 1560,col 52)",
        "(line 1561,col 7)-(line 1564,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.RunTimeStats.outputBestPhaseOrdering()",
      "begin_line": 1570,
      "end_line": 1584,
      "comment": "\n     * Print the best phase loop to stderr.\n     ",
      "child_ranges": [
        "(line 1571,col 7)-(line 1583,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CommandLineConfig",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1595,
      "end_line": 2074,
      "comment": "\n   * Configurations for the command line configs. Designed for easy\n   * building, so that we can decouple the flags-parsing library from\n   * the actual configuration options.\n   *\n   * By design, these configurations must match one-to-one with\n   * command-line flags.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "printTree"
      ],
      "begin_line": 1596,
      "end_line": 1596,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintTree(boolean)",
      "begin_line": 1599,
      "end_line": 1602,
      "comment": " Prints out the parse tree and exits ",
      "child_ranges": [
        "(line 1600,col 7)-(line 1600,col 33)",
        "(line 1601,col 7)-(line 1601,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "computePhaseOrdering"
      ],
      "begin_line": 1604,
      "end_line": 1604,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setComputePhaseOrdering(boolean)",
      "begin_line": 1610,
      "end_line": 1613,
      "comment": "\n     * Runs the compile job many times, then prints out the best phase\n     * ordering from this run\n     ",
      "child_ranges": [
        "(line 1611,col 7)-(line 1611,col 55)",
        "(line 1612,col 7)-(line 1612,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printAst"
      ],
      "begin_line": 1615,
      "end_line": 1615,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintAst(boolean)",
      "begin_line": 1621,
      "end_line": 1624,
      "comment": "\n     * Prints a dot file describing the internal abstract syntax tree\n     * and exits\n     ",
      "child_ranges": [
        "(line 1622,col 7)-(line 1622,col 31)",
        "(line 1623,col 7)-(line 1623,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printPassGraph"
      ],
      "begin_line": 1626,
      "end_line": 1626,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPrintPassGraph(boolean)",
      "begin_line": 1629,
      "end_line": 1632,
      "comment": " Prints a dot file describing the passes that will get run and exits ",
      "child_ranges": [
        "(line 1630,col 7)-(line 1630,col 43)",
        "(line 1631,col 7)-(line 1631,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jscompDevMode"
      ],
      "begin_line": 1634,
      "end_line": 1634,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJscompDevMode(com.google.javascript.jscomp.CompilerOptions.DevMode)",
      "begin_line": 1637,
      "end_line": 1640,
      "comment": " Turns on extra sanity checks ",
      "child_ranges": [
        "(line 1638,col 7)-(line 1638,col 41)",
        "(line 1639,col 7)-(line 1639,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "loggingLevel"
      ],
      "begin_line": 1642,
      "end_line": 1642,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setLoggingLevel(java.lang.String)",
      "begin_line": 1649,
      "end_line": 1652,
      "comment": "\n     * The logging level (standard java.util.logging.Level\n     * values) for Compiler progress. Does not control errors or\n     * warnings for the JavaScript code under compilation\n     ",
      "child_ranges": [
        "(line 1650,col 7)-(line 1650,col 39)",
        "(line 1651,col 7)-(line 1651,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 1654,
      "end_line": 1654,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setExterns(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1659,
      "end_line": 1663,
      "comment": "\n     * The file containing JavaScript externs. You may specify multiple.\n     ",
      "child_ranges": [
        "(line 1660,col 7)-(line 1660,col 27)",
        "(line 1661,col 7)-(line 1661,col 35)",
        "(line 1662,col 7)-(line 1662,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "js"
      ],
      "begin_line": 1665,
      "end_line": 1665,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJs(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1670,
      "end_line": 1674,
      "comment": "\n     * The JavaScript filename. You may specify multiple.\n     ",
      "child_ranges": [
        "(line 1671,col 7)-(line 1671,col 22)",
        "(line 1672,col 7)-(line 1672,col 25)",
        "(line 1673,col 7)-(line 1673,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jsOutputFile"
      ],
      "begin_line": 1676,
      "end_line": 1676,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setJsOutputFile(java.lang.String)",
      "begin_line": 1681,
      "end_line": 1684,
      "comment": "\n     * Primary output filename. If not specified, output is written to stdout\n     ",
      "child_ranges": [
        "(line 1682,col 7)-(line 1682,col 39)",
        "(line 1683,col 7)-(line 1683,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 1686,
      "end_line": 1686,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModule(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1696,
      "end_line": 1700,
      "comment": "\n     * A JavaScript module specification. The format is\n     * \u003cname\u003e:\u003cnum-js-files\u003e[:[\u003cdep\u003e,...][:]]]. Module names must be\n     * unique. Each dep is the name of a module that this module\n     * depends on. Modules must be listed in dependency order, and JS\n     * source files must be listed in the corresponding order. Where\n     * --module flags occur in relation to --js flags is unimportant\n     ",
      "child_ranges": [
        "(line 1697,col 7)-(line 1697,col 26)",
        "(line 1698,col 7)-(line 1698,col 33)",
        "(line 1699,col 7)-(line 1699,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "variableMapInputFile"
      ],
      "begin_line": 1702,
      "end_line": 1702,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setVariableMapInputFile(java.lang.String)",
      "begin_line": 1708,
      "end_line": 1711,
      "comment": "\n     * File containing the serialized version of the variable renaming\n     * map produced by a previous compilation\n     ",
      "child_ranges": [
        "(line 1709,col 7)-(line 1709,col 55)",
        "(line 1710,col 7)-(line 1710,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapInputFile"
      ],
      "begin_line": 1713,
      "end_line": 1713,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPropertyMapInputFile(java.lang.String)",
      "begin_line": 1719,
      "end_line": 1722,
      "comment": "\n     * File containing the serialized version of the property renaming\n     * map produced by a previous compilation\n     ",
      "child_ranges": [
        "(line 1720,col 7)-(line 1720,col 55)",
        "(line 1721,col 7)-(line 1721,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "variableMapOutputFile"
      ],
      "begin_line": 1724,
      "end_line": 1724,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setVariableMapOutputFile(java.lang.String)",
      "begin_line": 1730,
      "end_line": 1733,
      "comment": "\n     * File where the serialized version of the variable renaming map\n     * produced should be saved\n     ",
      "child_ranges": [
        "(line 1731,col 7)-(line 1731,col 57)",
        "(line 1732,col 7)-(line 1732,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createNameMapFiles"
      ],
      "begin_line": 1735,
      "end_line": 1735,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCreateNameMapFiles(boolean)",
      "begin_line": 1744,
      "end_line": 1747,
      "comment": "\n     * If true, variable renaming and property renaming map\n     * files will be produced as {binary name}_vars_map.out and\n     * {binary name}_props_map.out. Note that this flag cannot be used\n     * in conjunction with either variable_map_output_file or\n     * property_map_output_file\n     ",
      "child_ranges": [
        "(line 1745,col 7)-(line 1745,col 51)",
        "(line 1746,col 7)-(line 1746,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapOutputFile"
      ],
      "begin_line": 1749,
      "end_line": 1749,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setPropertyMapOutputFile(java.lang.String)",
      "begin_line": 1755,
      "end_line": 1758,
      "comment": "\n     * File where the serialized version of the property renaming map\n     * produced should be saved\n     ",
      "child_ranges": [
        "(line 1756,col 7)-(line 1756,col 57)",
        "(line 1757,col 7)-(line 1757,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 1760,
      "end_line": 1760,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 1765,
      "end_line": 1768,
      "comment": "\n     * Sets rules and conventions to enforce.\n     ",
      "child_ranges": [
        "(line 1766,col 7)-(line 1766,col 47)",
        "(line 1767,col 7)-(line 1767,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 1770,
      "end_line": 1770,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSummaryDetailLevel(int)",
      "begin_line": 1779,
      "end_line": 1782,
      "comment": "\n     * Controls how detailed the compilation summary is. Values:\n     *  0 (never print summary), 1 (print summary only if there are\n     * errors or warnings), 2 (print summary if type checking is on,\n     * see --check_types), 3 (always print summary). The default level\n     * is 1\n     ",
      "child_ranges": [
        "(line 1780,col 7)-(line 1780,col 51)",
        "(line 1781,col 7)-(line 1781,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputWrapper"
      ],
      "begin_line": 1784,
      "end_line": 1784,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputWrapper(java.lang.String)",
      "begin_line": 1790,
      "end_line": 1793,
      "comment": "\n     * Interpolate output into this string at the place denoted\n     * by the marker token %output%, or %output|jsstring%\n     ",
      "child_ranges": [
        "(line 1791,col 7)-(line 1791,col 41)",
        "(line 1792,col 7)-(line 1792,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moduleWrapper"
      ],
      "begin_line": 1795,
      "end_line": 1795,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModuleWrapper(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1801,
      "end_line": 1805,
      "comment": "\n     * An output wrapper for a JavaScript module (optional). See the flag\n     * description for formatting requirements.\n     ",
      "child_ranges": [
        "(line 1802,col 7)-(line 1802,col 33)",
        "(line 1803,col 7)-(line 1803,col 47)",
        "(line 1804,col 7)-(line 1804,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moduleOutputPathPrefix"
      ],
      "begin_line": 1807,
      "end_line": 1807,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setModuleOutputPathPrefix(java.lang.String)",
      "begin_line": 1814,
      "end_line": 1817,
      "comment": "\n     * Prefix for filenames of compiled JS modules.\n     * \u003cmodule-name\u003e.js will be appended to this prefix. Directories\n     * will be created as needed. Use with --module\n     ",
      "child_ranges": [
        "(line 1815,col 7)-(line 1815,col 59)",
        "(line 1816,col 7)-(line 1816,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createSourceMap"
      ],
      "begin_line": 1819,
      "end_line": 1819,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCreateSourceMap(java.lang.String)",
      "begin_line": 1828,
      "end_line": 1831,
      "comment": "\n     * If specified, a source map file mapping the generated\n     * source files back to the original source file will be\n     * output to the specified path. The %outname% placeholder will\n     * expand to the name of the output file that the source map\n     * corresponds to.\n     ",
      "child_ranges": [
        "(line 1829,col 7)-(line 1829,col 45)",
        "(line 1830,col 7)-(line 1830,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 1833,
      "end_line": 1834,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSourceMapDetailLevel(com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 1839,
      "end_line": 1842,
      "comment": "\n     * The detail supplied in the source map file, if generated.\n     ",
      "child_ranges": [
        "(line 1840,col 7)-(line 1840,col 40)",
        "(line 1841,col 7)-(line 1841,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 1844,
      "end_line": 1845,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSourceMapFormat(com.google.javascript.jscomp.SourceMap.Format)",
      "begin_line": 1850,
      "end_line": 1853,
      "comment": "\n     * The detail supplied in the source map file, if generated.\n     ",
      "child_ranges": [
        "(line 1851,col 7)-(line 1851,col 36)",
        "(line 1852,col 7)-(line 1852,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningGuards"
      ],
      "begin_line": 1855,
      "end_line": 1855,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setWarningGuardSpec(com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec)",
      "begin_line": 1860,
      "end_line": 1863,
      "comment": "\n     * Add warning guards.\n     ",
      "child_ranges": [
        "(line 1861,col 7)-(line 1861,col 32)",
        "(line 1862,col 7)-(line 1862,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "define"
      ],
      "begin_line": 1865,
      "end_line": 1865,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setDefine(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1874,
      "end_line": 1878,
      "comment": "\n     * Override the value of a variable annotated @define.\n     * The format is \u003cname\u003e[\u003d\u003cval\u003e], where \u003cname\u003e is the name of a @define\n     * variable and \u003cval\u003e is a boolean, number, or a single-quoted string\n     * that contains no single quotes. If [\u003d\u003cval\u003e] is omitted,\n     * the variable is marked true\n     ",
      "child_ranges": [
        "(line 1875,col 7)-(line 1875,col 26)",
        "(line 1876,col 7)-(line 1876,col 33)",
        "(line 1877,col 7)-(line 1877,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tweak"
      ],
      "begin_line": 1880,
      "end_line": 1880,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTweak(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1888,
      "end_line": 1892,
      "comment": "\n     * Override the default value of a registered tweak. The format is\n     * \u003cname\u003e[\u003d\u003cval\u003e], where \u003cname\u003e is the ID of a tweak and \u003cval\u003e is a boolean,\n     * number, or a single-quoted string that contains no single quotes. If\n     * [\u003d\u003cval\u003e] is omitted, then true is assumed.\n     ",
      "child_ranges": [
        "(line 1889,col 7)-(line 1889,col 25)",
        "(line 1890,col 7)-(line 1890,col 31)",
        "(line 1891,col 7)-(line 1891,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tweakProcessing"
      ],
      "begin_line": 1894,
      "end_line": 1894,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing)",
      "begin_line": 1899,
      "end_line": 1902,
      "comment": "\n     * Sets the kind of processing to do for goog.tweak functions.\n     ",
      "child_ranges": [
        "(line 1900,col 7)-(line 1900,col 45)",
        "(line 1901,col 7)-(line 1901,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 1904,
      "end_line": 1904,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCharset(java.lang.String)",
      "begin_line": 1909,
      "end_line": 1912,
      "comment": "\n     * Input charset for all files.\n     ",
      "child_ranges": [
        "(line 1910,col 7)-(line 1910,col 29)",
        "(line 1911,col 7)-(line 1911,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "manageClosureDependencies"
      ],
      "begin_line": 1914,
      "end_line": 1914,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setManageClosureDependencies(boolean)",
      "begin_line": 1920,
      "end_line": 1923,
      "comment": "\n     * Sets whether to sort files by their goog.provide/require deps,\n     * and prune inputs that are not required.\n     ",
      "child_ranges": [
        "(line 1921,col 7)-(line 1921,col 46)",
        "(line 1922,col 7)-(line 1922,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "onlyClosureDependencies"
      ],
      "begin_line": 1925,
      "end_line": 1925,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOnlyClosureDependencies(boolean)",
      "begin_line": 1932,
      "end_line": 1935,
      "comment": "\n     * Sets whether to sort files by their goog.provide/require deps,\n     * and prune inputs that are not required, and drop all non-closure\n     * files.\n     ",
      "child_ranges": [
        "(line 1933,col 7)-(line 1933,col 44)",
        "(line 1934,col 7)-(line 1934,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureEntryPoints"
      ],
      "begin_line": 1937,
      "end_line": 1937,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setClosureEntryPoints(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1943,
      "end_line": 1947,
      "comment": "\n     * Set closure entry points, which makes the compiler only include\n     * those files and sort them in dependency order.\n     ",
      "child_ranges": [
        "(line 1944,col 7)-(line 1944,col 46)",
        "(line 1945,col 7)-(line 1945,col 44)",
        "(line 1946,col 7)-(line 1946,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputManifests"
      ],
      "begin_line": 1949,
      "end_line": 1949,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputManifest(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1955,
      "end_line": 1964,
      "comment": "\n     * Sets whether to print output manifest files.\n     * Filter out empty file names.\n     ",
      "child_ranges": [
        "(line 1956,col 7)-(line 1956,col 50)",
        "(line 1957,col 7)-(line 1961,col 7)",
        "(line 1962,col 7)-(line 1962,col 72)",
        "(line 1963,col 7)-(line 1963,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputModuleDependencies"
      ],
      "begin_line": 1966,
      "end_line": 1966,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputModuleDependencies(java.lang.String)",
      "begin_line": 1972,
      "end_line": 1976,
      "comment": "\n     * Sets whether a JSON file representing the dependencies between modules\n     * should be created.\n     ",
      "child_ranges": [
        "(line 1974,col 7)-(line 1974,col 63)",
        "(line 1975,col 7)-(line 1975,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "outputBundles"
      ],
      "begin_line": 1978,
      "end_line": 1978,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setOutputBundle(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1983,
      "end_line": 1986,
      "comment": "\n     * Sets whether to print output bundle files.\n     ",
      "child_ranges": [
        "(line 1984,col 7)-(line 1984,col 41)",
        "(line 1985,col 7)-(line 1985,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 1988,
      "end_line": 1988,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setAcceptConstKeyword(boolean)",
      "begin_line": 1993,
      "end_line": 1996,
      "comment": "\n     * Sets whether to accept usage of \u0027const\u0027 keyword.\n     ",
      "child_ranges": [
        "(line 1994,col 7)-(line 1994,col 51)",
        "(line 1995,col 7)-(line 1995,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 1998,
      "end_line": 1998,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setLanguageIn(java.lang.String)",
      "begin_line": 2004,
      "end_line": 2007,
      "comment": "\n     * Sets whether to accept input files as ECMAScript5 compliant.\n     * Otherwise, input files are treated as ECMAScript3 compliant.\n     ",
      "child_ranges": [
        "(line 2005,col 7)-(line 2005,col 35)",
        "(line 2006,col 7)-(line 2006,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "skipNormalOutputs"
      ],
      "begin_line": 2009,
      "end_line": 2009,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setSkipNormalOutputs(boolean)",
      "begin_line": 2014,
      "end_line": 2017,
      "comment": "\n     * Sets whether the normal outputs of compilation should be skipped.\n     ",
      "child_ranges": [
        "(line 2015,col 7)-(line 2015,col 49)",
        "(line 2016,col 7)-(line 2016,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "manifestMaps"
      ],
      "begin_line": 2019,
      "end_line": 2019,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setManifestMaps(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 2024,
      "end_line": 2027,
      "comment": "\n     * Sets the execPath:rootRelativePath mappings\n     ",
      "child_ranges": [
        "(line 2025,col 7)-(line 2025,col 39)",
        "(line 2026,col 7)-(line 2026,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "transformAMDToCJSModules"
      ],
      "begin_line": 2030,
      "end_line": 2030,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setTransformAMDToCJSModules(boolean)",
      "begin_line": 2035,
      "end_line": 2039,
      "comment": "\n     * Set whether to transform AMD to CommonJS modules.\n     ",
      "child_ranges": [
        "(line 2037,col 7)-(line 2037,col 63)",
        "(line 2038,col 7)-(line 2038,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processCommonJSModules"
      ],
      "begin_line": 2041,
      "end_line": 2041,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setProcessCommonJSModules(boolean)",
      "begin_line": 2046,
      "end_line": 2050,
      "comment": "\n     * Sets whether to process CommonJS modules.\n     ",
      "child_ranges": [
        "(line 2048,col 7)-(line 2048,col 59)",
        "(line 2049,col 7)-(line 2049,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "commonJSModulePathPrefix"
      ],
      "begin_line": 2053,
      "end_line": 2054,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setCommonJSModulePathPrefix(java.lang.String)",
      "begin_line": 2059,
      "end_line": 2063,
      "comment": "\n     * Sets the CommonJS module path prefix.\n     ",
      "child_ranges": [
        "(line 2061,col 7)-(line 2061,col 63)",
        "(line 2062,col 7)-(line 2062,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "warningsWhitelistFile"
      ],
      "begin_line": 2065,
      "end_line": 2065,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.CommandLineConfig.setWarningsWhitelistFile(java.lang.String)",
      "begin_line": 2070,
      "end_line": 2073,
      "comment": "\n     * Sets a whitelist file that suppresses warnings.\n     ",
      "child_ranges": [
        "(line 2071,col 7)-(line 2071,col 44)",
        "(line 2072,col 7)-(line 2072,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardSpec",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2080,
      "end_line": 2101,
      "comment": "\n   * A little helper class to make it easier to collect warning types\n   * from --jscomp_error, --jscomp_warning, and --jscomp_off.\n   "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 2081,
      "end_line": 2089,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 2082,
      "end_line": 2082,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 2083,
      "end_line": 2083,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.Entry.Entry(com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 2085,
      "end_line": 2088,
      "comment": "",
      "child_ranges": [
        "(line 2086,col 9)-(line 2086,col 27)",
        "(line 2087,col 9)-(line 2087,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 2092,
      "end_line": 2092,
      "comment": " The entries, in the order that they were added."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.add(com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 2094,
      "end_line": 2096,
      "comment": "",
      "child_ranges": [
        "(line 2095,col 7)-(line 2095,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec.clear()",
      "begin_line": 2098,
      "end_line": 2100,
      "comment": "",
      "child_ranges": [
        "(line 2099,col 7)-(line 2099,col 22)"
      ]
    }
  ]
}