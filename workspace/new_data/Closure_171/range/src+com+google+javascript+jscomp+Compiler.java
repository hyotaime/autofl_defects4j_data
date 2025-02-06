{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/Compiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Compiler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractCompiler"
      ],
      "begin_line": 83,
      "end_line": 2613,
      "comment": "\n * Compiler (and the other classes in this package) does the following:\n * \u003cul\u003e\n * \u003cli\u003eparses JS code\n * \u003cli\u003echecks for undefined variables\n * \u003cli\u003eperforms optimizations such as constant folding and constants inlining\n * \u003cli\u003erenames variables (to short names)\n * \u003cli\u003eoutputs compact JavaScript code\n * \u003c/ul\u003e\n *\n * External variables are declared in \u0027externs\u0027 files. For instance, the file\n * may include definitions for global javascript/browser objects such as\n * window, document.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON_MODULE_NAME"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODULE_DEPENDENCY_ERROR"
      ],
      "begin_line": 86,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_ENTRY_ERROR"
      ],
      "begin_line": 91,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_MODULE_ERROR"
      ],
      "begin_line": 95,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PARSING_PASS_NAME"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Used in PerformanceTracker"
    },
    {
      "type": "field",
      "varNames": [
        "CONFIG_RESOURCE"
      ],
      "begin_line": 102,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The externs inputs"
    },
    {
      "type": "field",
      "varNames": [
        "modules"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The JS source modules"
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " 2 modules, because we use this as a signal for which passes to run."
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The JS source inputs"
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " error manager to which error management is delegated"
    },
    {
      "type": "field",
      "varNames": [
        "warningsGuard"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Warnings guard for filtering warnings."
    },
    {
      "type": "field",
      "varNames": [
        "injectedLibraries"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " the library, so code can be inserted after."
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Parse tree root nodes"
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externAndJsRoot"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputsById"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMap"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The source code map "
    },
    {
      "type": "field",
      "varNames": [
        "externExports"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The externs created from the exports.  "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueNameId"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n   * Ids for function inlining so that each declared name remains\n   * unique.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "hasRegExpGlobalReferences"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n   * Whether to assume there are references to the RegExp Global object\n   * properties.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionInformationMap"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The function information map "
    },
    {
      "type": "field",
      "varNames": [
        "debugLog"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Debugging information "
    },
    {
      "type": "field",
      "varNames": [
        "defaultCodingConvention"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Detects Google-specific coding conventions. "
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserConfig"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "abstractInterpreter"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeValidator"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "phaseOptimizer"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " running, or which functions have been changed by optimizations"
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldErrorReporter"
      ],
      "begin_line": 178,
      "end_line": 179,
      "comment": " The oldErrorReporter exists so we can get errors from the JSTypeRegistry."
    },
    {
      "type": "field",
      "varNames": [
        "defaultErrorReporter"
      ],
      "begin_line": 182,
      "end_line": 183,
      "comment": " This error reporter gets the messages from the current Rhino parser."
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMIZE_LOOP_ERROR"
      ],
      "begin_line": 186,
      "end_line": 188,
      "comment": " Error strings used for reporting JSErrors "
    },
    {
      "type": "field",
      "varNames": [
        "MOTION_ITERATIONS_ERROR"
      ],
      "begin_line": 189,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COMPILER_STACK_SIZE"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " About 2MB"
    },
    {
      "type": "field",
      "varNames": [
        "compilerExecutor"
      ],
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n   * Under JRE 1.6, the JS Compiler overflows the stack when running on some\n   * large or complex JS code. When threads are available, we run all compile\n   * jobs on a separate thread with a larger stack.\n   *\n   * That way, we don\u0027t have to increase the stack size for *every* thread\n   * (which is what -Xss does).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-23b85ef7-d143-4f2a-8006-224c5b9258d3.newThread(java.lang.Runnable)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 7)-(line 208,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "compilerThread"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n   * Use a dedicated compiler thread per Compiler instance.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "useThreads"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " Whether to use threads. "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 226,
      "end_line": 227,
      "comment": "\n   * Logger for the whole com.google.javascript.jscomp domain -\n   * setting configuration for this logger affects all loggers\n   *  in other classes within the compiler.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "outStream"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalRefMap"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progress"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastPassName"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n   * Creates a Compiler that reports errors and warnings to its logger.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler(java.io.PrintStream)",
      "begin_line": 246,
      "end_line": 249,
      "comment": "\n   * Creates a Compiler that reports errors and warnings to an output stream.\n   ",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 35)",
        "(line 248,col 5)-(line 248,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n   * Creates a Compiler that uses a custom error manager.\n   ",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 11)",
        "(line 256,col 5)-(line 256,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setErrorManager(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 264,
      "end_line": 268,
      "comment": "\n   * Sets the error manager.\n   *\n   * @param errorManager the error manager, it cannot be {@code null}\n   ",
      "child_ranges": [
        "(line 265,col 5)-(line 266,col 58)",
        "(line 267,col 5)-(line 267,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createMessageFormatter()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\n   * Creates a message formatter instance corresponding to the value of\n   * {@link CompilerOptions}.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 59)",
        "(line 276,col 5)-(line 276,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 283,
      "end_line": 307,
      "comment": "\n   * Initialize the compiler options. Only necessary if you\u0027re not doing\n   * a normal compile() job.\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 284,col 27)",
        "(line 285,col 5)-(line 295,col 5)",
        "(line 297,col 5)-(line 297,col 33)",
        "(line 300,col 5)-(line 300,col 54)",
        "(line 301,col 5)-(line 303,col 58)",
        "(line 304,col 5)-(line 304,col 43)",
        "(line 306,col 5)-(line 306,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.reconcileOptionsWithGuards()",
      "begin_line": 313,
      "end_line": 352,
      "comment": "\n   * When the CompilerOptions and its WarningsGuard overlap, reconcile\n   * any discrepencies.\n   ",
      "child_ranges": [
        "(line 315,col 5)-(line 327,col 5)",
        "(line 329,col 5)-(line 334,col 5)",
        "(line 336,col 5)-(line 340,col 5)",
        "(line 347,col 5)-(line 351,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\n   * Initializes the instance state needed for a compile job.\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 361,col 5)-(line 362,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(java.util.List\u003cT1\u003e, java.util.List\u003cT2\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 368,
      "end_line": 378,
      "comment": "\n   * Initializes the instance state needed for a compile job.\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 58)",
        "(line 373,col 5)-(line 375,col 5)",
        "(line 377,col 5)-(line 377,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 385,
      "end_line": 390,
      "comment": "\n   * Initializes the instance state needed for a compile job if the sources\n   * are in modules.\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 389,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initModules(java.util.List\u003cT\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 396,
      "end_line": 426,
      "comment": "\n   * Initializes the instance state needed for a compile job if the sources\n   * are in modules.\n   ",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 25)",
        "(line 400,col 5)-(line 400,col 30)",
        "(line 401,col 5)-(line 401,col 30)",
        "(line 403,col 5)-(line 403,col 52)",
        "(line 407,col 5)-(line 407,col 27)",
        "(line 408,col 5)-(line 420,col 5)",
        "(line 422,col 5)-(line 422,col 51)",
        "(line 423,col 5)-(line 423,col 25)",
        "(line 425,col 5)-(line 425,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initBasedOnOptions()",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n   * Do any initialization that is dependent on the compiler options.\n   ",
      "child_ranges": [
        "(line 433,col 5)-(line 436,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.makeCompilerInput(java.util.List\u003cT\u003e, boolean)",
      "begin_line": 439,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 54)",
        "(line 442,col 5)-(line 444,col 5)",
        "(line 445,col 5)-(line 445,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MODULE_LIST_ERROR"
      ],
      "begin_line": 448,
      "end_line": 450,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ROOT_MODULE_ERROR"
      ],
      "begin_line": 452,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.checkFirstModule(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 460,
      "end_line": 468,
      "comment": "\n   * Verifies that at least one module has been provided and that the first one\n   * has at least one source code input.\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 467,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createFillFileName(java.lang.String)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n   * Empty modules get an empty \"fill\" file, so that we can move code into\n   * an empty module.\n   ",
      "child_ranges": [
        "(line 475,col 5)-(line 475,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.fillEmptyModules(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 482,
      "end_line": 489,
      "comment": "\n   * Fill any empty modules with a place holder file. It makes any cross module\n   * motion easier.\n   ",
      "child_ranges": [
        "(line 483,col 5)-(line 488,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.rebuildInputsFromModules()",
      "begin_line": 496,
      "end_line": 499,
      "comment": "\n   * Rebuilds the internal list of inputs by iterating over all modules.\n   * This is necessary if inputs have been added to or removed from a module\n   * after the {@link #init(List, List, CompilerOptions)} call.\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 46)",
        "(line 498,col 5)-(line 498,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getAllInputsFromModules(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 505,
      "end_line": 521,
      "comment": "\n   * Builds a single list of all module inputs. Verifies that it contains no\n   * duplicates.\n   ",
      "child_ranges": [
        "(line 507,col 5)-(line 507,col 54)",
        "(line 508,col 5)-(line 508,col 55)",
        "(line 509,col 5)-(line 519,col 5)",
        "(line 520,col 5)-(line 520,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_INPUT"
      ],
      "begin_line": 523,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_EXTERN_INPUT"
      ],
      "begin_line": 525,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initInputsByIdMap()",
      "begin_line": 533,
      "end_line": 549,
      "comment": "\n   * Creates a map to make looking up an input by name fast. Also checks for\n   * duplicate inputs.\n   ",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 55)",
        "(line 535,col 5)-(line 541,col 5)",
        "(line 542,col 5)-(line 548,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 551,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 6)-(line 553,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 559,
      "end_line": 563,
      "comment": "\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 562,col 6)-(line 562,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 569,
      "end_line": 574,
      "comment": "\n   * @deprecated Convert your arrays to lists and use the list-based\n   *     compileModules method.\n   ",
      "child_ranges": [
        "(line 572,col 6)-(line 573,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 581,
      "end_line": 588,
      "comment": "\n   * Compiles a list of inputs.\n   * @deprecated Convert your arrays to lists and use the list-based compile\n   *     method.\n   ",
      "child_ranges": [
        "(line 585,col 5)-(line 587,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(java.util.List\u003cT1\u003e, java.util.List\u003cT2\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 593,
      "end_line": 609,
      "comment": "\n   * Compiles a list of inputs.\n   ",
      "child_ranges": [
        "(line 596,col 5)-(line 596,col 45)",
        "(line 598,col 5)-(line 608,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 616,
      "end_line": 623,
      "comment": "\n   * Compiles a list of modules.\n   * @deprecated Convert your arrays to lists and use the list-based\n   *     compileModules method.\n   ",
      "child_ranges": [
        "(line 620,col 5)-(line 622,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compileModules(java.util.List\u003cT\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 628,
      "end_line": 644,
      "comment": "\n   * Compiles a list of modules.\n   ",
      "child_ranges": [
        "(line 631,col 5)-(line 631,col 45)",
        "(line 633,col 5)-(line 643,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile()",
      "begin_line": 646,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 647,col 5)-(line 653,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-5420a1e0-96ab-4d60-be8b-4610366d538b.call()",
      "begin_line": 648,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 26)",
        "(line 651,col 9)-(line 651,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.disableThreads()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "\n   * Disable threads. This is for clients that run on AppEngine and\n   * don\u0027t have threads.\n   ",
      "child_ranges": [
        "(line 661,col 5)-(line 661,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runInCompilerThread(java.util.concurrent.Callable\u003cT\u003e)",
      "begin_line": 664,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 666,col 5)-(line 666,col 77)",
        "(line 667,col 5)-(line 667,col 20)",
        "(line 668,col 5)-(line 668,col 51)",
        "(line 669,col 5)-(line 690,col 6)",
        "(line 692,col 5)-(line 694,col 59)",
        "(line 697,col 5)-(line 711,col 5)",
        "(line 714,col 5)-(line 716,col 5)",
        "(line 718,col 5)-(line 718,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-ebcb8409-1877-4168-a4f0-6c18eafe8c78.call()",
      "begin_line": 670,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compileInternal()",
      "begin_line": 721,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 722,col 5)-(line 722,col 27)",
        "(line 723,col 5)-(line 723,col 12)",
        "(line 726,col 5)-(line 726,col 31)",
        "(line 727,col 5)-(line 729,col 5)",
        "(line 731,col 5)-(line 733,col 5)",
        "(line 735,col 5)-(line 739,col 5)",
        "(line 741,col 5)-(line 751,col 5)",
        "(line 753,col 5)-(line 755,col 5)",
        "(line 757,col 5)-(line 759,col 5)",
        "(line 760,col 5)-(line 760,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parse()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 764,col 5)-(line 764,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getPassConfig()",
      "begin_line": 767,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 768,col 5)-(line 770,col 5)",
        "(line 771,col 5)-(line 771,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createPassConfigInternal()",
      "begin_line": 778,
      "end_line": 780,
      "comment": "\n   * Create the passes object. Clients should use setPassConfig instead of\n   * overriding this.\n   ",
      "child_ranges": [
        "(line 779,col 5)-(line 779,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setPassConfig(com.google.javascript.jscomp.PassConfig)",
      "begin_line": 787,
      "end_line": 799,
      "comment": "\n   * @param passes The PassConfig to use with this Compiler.\n   * @throws NullPointerException if passes is null\n   * @throws IllegalStateException if this.passes has already been assigned\n   ",
      "child_ranges": [
        "(line 793,col 5)-(line 793,col 39)",
        "(line 795,col 5)-(line 797,col 5)",
        "(line 798,col 5)-(line 798,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.precheck()",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n   * Carry out any special checks or procedures that need to be done before\n   * proceeding with rest of the compilation process.\n   *\n   * @return true, to continue with compilation\n   ",
      "child_ranges": [
        "(line 808,col 5)-(line 808,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.check()",
      "begin_line": 811,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 812,col 5)-(line 812,col 59)",
        "(line 816,col 5)-(line 817,col 62)",
        "(line 818,col 5)-(line 820,col 5)",
        "(line 821,col 5)-(line 823,col 5)",
        "(line 824,col 5)-(line 824,col 56)",
        "(line 825,col 5)-(line 825,col 48)",
        "(line 826,col 5)-(line 828,col 5)",
        "(line 831,col 5)-(line 833,col 5)",
        "(line 835,col 5)-(line 837,col 5)",
        "(line 839,col 5)-(line 846,col 5)",
        "(line 848,col 5)-(line 848,col 66)",
        "(line 849,col 5)-(line 849,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.externExports()",
      "begin_line": 852,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 853,col 5)-(line 853,col 52)",
        "(line 854,col 5)-(line 854,col 31)",
        "(line 856,col 5)-(line 856,col 57)",
        "(line 857,col 5)-(line 857,col 18)",
        "(line 859,col 5)-(line 859,col 47)",
        "(line 861,col 5)-(line 861,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.process(com.google.javascript.jscomp.CompilerPass)",
      "begin_line": 864,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 866,col 5)-(line 866,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 869,
      "end_line": 875,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-b0e5c63a-22dc-4d4b-b076-14f765d7e54b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 871,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 873,col 7)-(line 873,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.maybeSanityCheck()",
      "begin_line": 877,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 878,col 5)-(line 880,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runSanityCheck()",
      "begin_line": 883,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 884,col 5)-(line 884,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeTryCatchFinally()",
      "begin_line": 890,
      "end_line": 896,
      "comment": "\n   * Removes try/catch/finally statements for easier debugging.\n   ",
      "child_ranges": [
        "(line 891,col 5)-(line 891,col 44)",
        "(line 892,col 5)-(line 892,col 39)",
        "(line 893,col 5)-(line 893,col 48)",
        "(line 894,col 5)-(line 894,col 15)",
        "(line 895,col 5)-(line 895,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.stripCode(java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 902,
      "end_line": 913,
      "comment": "\n   * Strips code for smaller compiled code. This is useful for removing debug\n   * statements to prevent leaking them publicly.\n   ",
      "child_ranges": [
        "(line 904,col 5)-(line 904,col 30)",
        "(line 905,col 5)-(line 905,col 27)",
        "(line 906,col 5)-(line 907,col 46)",
        "(line 908,col 5)-(line 910,col 5)",
        "(line 911,col 5)-(line 911,col 15)",
        "(line 912,col 5)-(line 912,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)",
      "begin_line": 918,
      "end_line": 929,
      "comment": "\n   * Runs custom passes that are designated to run at a particular time.\n   ",
      "child_ranges": [
        "(line 919,col 5)-(line 928,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "currentTracer"
      ],
      "begin_line": 931,
      "end_line": 931,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPassName"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.startPass(java.lang.String)",
      "begin_line": 937,
      "end_line": 941,
      "comment": "\n   * Marks the beginning of a pass.\n   ",
      "child_ranges": [
        "(line 938,col 5)-(line 938,col 52)",
        "(line 939,col 5)-(line 939,col 31)",
        "(line 940,col 5)-(line 940,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.endPass()",
      "begin_line": 946,
      "end_line": 954,
      "comment": "\n   * Marks the end of a pass.\n   ",
      "child_ranges": [
        "(line 947,col 5)-(line 948,col 59)",
        "(line 949,col 5)-(line 949,col 47)",
        "(line 950,col 5)-(line 950,col 27)",
        "(line 951,col 5)-(line 951,col 25)",
        "(line 953,col 5)-(line 953,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newTracer(java.lang.String)",
      "begin_line": 959,
      "end_line": 966,
      "comment": "\n   * Returns a new tracer for the given pass name.\n   ",
      "child_ranges": [
        "(line 960,col 5)-(line 961,col 76)",
        "(line 962,col 5)-(line 964,col 5)",
        "(line 965,col 5)-(line 965,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.stopTracer(com.google.javascript.jscomp.Tracer, java.lang.String)",
      "begin_line": 968,
      "end_line": 973,
      "comment": "",
      "child_ranges": [
        "(line 969,col 5)-(line 969,col 27)",
        "(line 970,col 5)-(line 972,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getResult()",
      "begin_line": 978,
      "end_line": 984,
      "comment": "\n   * Returns the result of the compilation.\n   ",
      "child_ranges": [
        "(line 979,col 5)-(line 979,col 68)",
        "(line 980,col 5)-(line 983,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getMessages()",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n   * Returns an array constructed from errors + temporary warnings.\n   ",
      "child_ranges": [
        "(line 990,col 5)-(line 990,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrors()",
      "begin_line": 996,
      "end_line": 998,
      "comment": "\n   * Returns the array of errors (never null).\n   ",
      "child_ranges": [
        "(line 997,col 5)-(line 997,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getWarnings()",
      "begin_line": 1003,
      "end_line": 1005,
      "comment": "\n   * Returns the array of warnings (never null).\n   ",
      "child_ranges": [
        "(line 1004,col 5)-(line 1004,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getRoot()",
      "begin_line": 1007,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 5)-(line 1009,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.nextUniqueNameId()",
      "begin_line": 1015,
      "end_line": 1017,
      "comment": "\n   * Creates a new id for making unique names.\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1016,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.resetUniqueNameId()",
      "begin_line": 1022,
      "end_line": 1025,
      "comment": "\n   * Resets the unique name id counter\n   ",
      "child_ranges": [
        "(line 1024,col 5)-(line 1024,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getUniqueNameIdSupplier()",
      "begin_line": 1027,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 5)-(line 1029,col 31)",
        "(line 1030,col 5)-(line 1035,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-5d25fa4a-de35-4537-95b2-0b2e0c096bcb.get()",
      "begin_line": 1031,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 9)-(line 1033,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1038,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 5)-(line 1047,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInput(com.google.javascript.rhino.InputId)",
      "begin_line": 1057,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 5)-(line 1059,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeExternInput(com.google.javascript.rhino.InputId)",
      "begin_line": 1066,
      "end_line": 1078,
      "comment": "\n   * Removes an input file from AST.\n   * @param id The id of the input to be removed.\n   ",
      "child_ranges": [
        "(line 1067,col 5)-(line 1067,col 39)",
        "(line 1068,col 5)-(line 1070,col 5)",
        "(line 1071,col 5)-(line 1071,col 91)",
        "(line 1072,col 5)-(line 1072,col 26)",
        "(line 1073,col 5)-(line 1073,col 26)",
        "(line 1074,col 5)-(line 1074,col 39)",
        "(line 1075,col 5)-(line 1077,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newExternInput(java.lang.String)",
      "begin_line": 1080,
      "end_line": 1091,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 5)-(line 1082,col 43)",
        "(line 1083,col 5)-(line 1085,col 5)",
        "(line 1086,col 5)-(line 1086,col 55)",
        "(line 1087,col 5)-(line 1087,col 48)",
        "(line 1088,col 5)-(line 1088,col 54)",
        "(line 1089,col 5)-(line 1089,col 26)",
        "(line 1090,col 5)-(line 1090,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.putCompilerInput(com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 1093,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 5)-(line 1094,col 28)",
        "(line 1095,col 5)-(line 1095,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1099,
      "end_line": 1103,
      "comment": " Add a source input dynamically. Intended for incremental compilation. ",
      "child_ranges": [
        "(line 1100,col 5)-(line 1100,col 34)",
        "(line 1101,col 5)-(line 1101,col 89)",
        "(line 1102,col 5)-(line 1102,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1114,
      "end_line": 1146,
      "comment": "\n   * Replace a source input dynamically. Intended for incremental\n   * re-compilation.\n   *\n   * If the new source input doesn\u0027t parse, then keep the old input\n   * in the AST and return false.\n   *\n   * @return Whether the new AST was attached successfully.\n   ",
      "child_ranges": [
        "(line 1115,col 5)-(line 1115,col 56)",
        "(line 1116,col 5)-(line 1116,col 98)",
        "(line 1117,col 5)-(line 1117,col 40)",
        "(line 1118,col 5)-(line 1120,col 5)",
        "(line 1122,col 5)-(line 1122,col 45)",
        "(line 1123,col 5)-(line 1127,col 5)",
        "(line 1129,col 5)-(line 1129,col 52)",
        "(line 1130,col 5)-(line 1130,col 49)",
        "(line 1132,col 5)-(line 1132,col 43)",
        "(line 1133,col 5)-(line 1136,col 5)",
        "(line 1139,col 5)-(line 1140,col 61)",
        "(line 1141,col 5)-(line 1141,col 66)",
        "(line 1142,col 5)-(line 1142,col 73)",
        "(line 1144,col 5)-(line 1144,col 28)",
        "(line 1145,col 5)-(line 1145,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addNewSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1158,
      "end_line": 1182,
      "comment": "\n   * Add a new source input dynamically. Intended for incremental compilation.\n   * \u003cp\u003e\n   * If the new source input doesn\u0027t parse, it will not be added, and a false\n   * will be returned.\n   *\n   * @param ast the JS Source to add.\n   * @return true if the source was added successfully, false otherwise.\n   * @throws IllegalStateException if an input for this ast already exists.\n   ",
      "child_ranges": [
        "(line 1159,col 5)-(line 1159,col 56)",
        "(line 1160,col 5)-(line 1163,col 5)",
        "(line 1164,col 5)-(line 1164,col 40)",
        "(line 1165,col 5)-(line 1167,col 5)",
        "(line 1169,col 5)-(line 1169,col 53)",
        "(line 1171,col 5)-(line 1171,col 52)",
        "(line 1174,col 5)-(line 1177,col 5)",
        "(line 1179,col 5)-(line 1179,col 49)",
        "(line 1181,col 5)-(line 1181,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getModuleGraph()",
      "begin_line": 1184,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 5)-(line 1186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDegenerateModuleGraph()",
      "begin_line": 1193,
      "end_line": 1195,
      "comment": "\n   * Gets a module graph. This will always return a module graph, even\n   * in the degenerate case when there\u0027s only one module.\n   ",
      "child_ranges": [
        "(line 1194,col 5)-(line 1194,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypeRegistry()",
      "begin_line": 1197,
      "end_line": 1203,
      "comment": "",
      "child_ranges": [
        "(line 1199,col 5)-(line 1201,col 5)",
        "(line 1202,col 5)-(line 1202,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypedScopeCreator()",
      "begin_line": 1205,
      "end_line": 1208,
      "comment": "",
      "child_ranges": [
        "(line 1207,col 5)-(line 1207,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.ensureDefaultPassConfig()",
      "begin_line": 1210,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1212,col 5)-(line 1212,col 60)",
        "(line 1213,col 5)-(line 1214,col 73)",
        "(line 1215,col 5)-(line 1215,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.buildKnownSymbolTable()",
      "begin_line": 1218,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1219,col 5)-(line 1219,col 65)",
        "(line 1221,col 5)-(line 1221,col 68)",
        "(line 1222,col 5)-(line 1227,col 5)",
        "(line 1229,col 5)-(line 1230,col 55)",
        "(line 1231,col 5)-(line 1233,col 5)",
        "(line 1235,col 5)-(line 1237,col 67)",
        "(line 1238,col 5)-(line 1238,col 58)",
        "(line 1239,col 5)-(line 1239,col 45)",
        "(line 1241,col 5)-(line 1242,col 63)",
        "(line 1243,col 5)-(line 1245,col 5)",
        "(line 1247,col 5)-(line 1247,col 42)",
        "(line 1248,col 5)-(line 1248,col 37)",
        "(line 1249,col 5)-(line 1249,col 62)",
        "(line 1250,col 5)-(line 1250,col 63)",
        "(line 1251,col 5)-(line 1251,col 57)",
        "(line 1253,col 5)-(line 1253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTopScope()",
      "begin_line": 1256,
      "end_line": 1259,
      "comment": "",
      "child_ranges": [
        "(line 1258,col 5)-(line 1258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReverseAbstractInterpreter()",
      "begin_line": 1261,
      "end_line": 1275,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 5)-(line 1273,col 5)",
        "(line 1274,col 5)-(line 1274,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypeValidator()",
      "begin_line": 1277,
      "end_line": 1283,
      "comment": "",
      "child_ranges": [
        "(line 1279,col 5)-(line 1281,col 5)",
        "(line 1282,col 5)-(line 1282,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseInputs()",
      "begin_line": 1295,
      "end_line": 1419,
      "comment": "\n   * Parses the externs and main inputs.\n   *\n   * @return A synthetic root node whose two children are the externs root\n   *     and the main root\n   ",
      "child_ranges": [
        "(line 1296,col 5)-(line 1296,col 53)",
        "(line 1300,col 5)-(line 1302,col 5)",
        "(line 1303,col 5)-(line 1305,col 5)",
        "(line 1308,col 5)-(line 1308,col 24)",
        "(line 1309,col 5)-(line 1309,col 37)",
        "(line 1311,col 5)-(line 1311,col 29)",
        "(line 1312,col 5)-(line 1312,col 42)",
        "(line 1314,col 5)-(line 1314,col 52)",
        "(line 1315,col 5)-(line 1315,col 46)",
        "(line 1317,col 5)-(line 1320,col 5)",
        "(line 1322,col 5)-(line 1322,col 49)",
        "(line 1324,col 5)-(line 1418,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hoistExterns(com.google.javascript.rhino.Node)",
      "begin_line": 1424,
      "end_line": 1460,
      "comment": "\n   * Hoists inputs with the @externs annotation into the externs list.\n   ",
      "child_ranges": [
        "(line 1425,col 5)-(line 1425,col 32)",
        "(line 1426,col 5)-(line 1455,col 5)",
        "(line 1457,col 5)-(line 1459,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hoistNoCompileFiles()",
      "begin_line": 1465,
      "end_line": 1485,
      "comment": "\n   * Hoists inputs with the @nocompiler annotation out of the inputs.\n   ",
      "child_ranges": [
        "(line 1466,col 5)-(line 1466,col 32)",
        "(line 1467,col 5)-(line 1480,col 5)",
        "(line 1482,col 5)-(line 1484,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.repartitionInputs()",
      "begin_line": 1487,
      "end_line": 1490,
      "comment": "",
      "child_ranges": [
        "(line 1488,col 5)-(line 1488,col 30)",
        "(line 1489,col 5)-(line 1489,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processAMDAndCommonJSModules()",
      "begin_line": 1497,
      "end_line": 1563,
      "comment": "\n   * Transforms AMD and CJS modules to something closure compiler can\n   * process and creates JSModules and the corresponding dependency tree\n   * on the way.\n   ",
      "child_ranges": [
        "(line 1498,col 5)-(line 1498,col 66)",
        "(line 1499,col 5)-(line 1499,col 74)",
        "(line 1504,col 5)-(line 1523,col 5)",
        "(line 1524,col 5)-(line 1562,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parse(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 1565,
      "end_line": 1569,
      "comment": "",
      "child_ranges": [
        "(line 1566,col 5)-(line 1566,col 35)",
        "(line 1567,col 5)-(line 1567,col 48)",
        "(line 1568,col 5)-(line 1568,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "syntheticCodeId"
      ],
      "begin_line": 1571,
      "end_line": 1571,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseSyntheticCode(java.lang.String)",
      "begin_line": 1573,
      "end_line": 1579,
      "comment": "",
      "child_ranges": [
        "(line 1575,col 5)-(line 1576,col 78)",
        "(line 1577,col 5)-(line 1577,col 48)",
        "(line 1578,col 5)-(line 1578,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newCompilerOptions()",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "\n   * Allow subclasses to override the default CompileOptions object.\n   ",
      "child_ranges": [
        "(line 1585,col 5)-(line 1585,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initCompilerOptionsIfTesting()",
      "begin_line": 1588,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1589,col 5)-(line 1593,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseSyntheticCode(java.lang.String, java.lang.String)",
      "begin_line": 1596,
      "end_line": 1600,
      "comment": "",
      "child_ranges": [
        "(line 1598,col 5)-(line 1598,col 35)",
        "(line 1599,col 5)-(line 1599,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseTestCode(java.lang.String)",
      "begin_line": 1602,
      "end_line": 1612,
      "comment": "",
      "child_ranges": [
        "(line 1604,col 5)-(line 1604,col 35)",
        "(line 1605,col 5)-(line 1606,col 47)",
        "(line 1607,col 5)-(line 1609,col 5)",
        "(line 1610,col 5)-(line 1610,col 48)",
        "(line 1611,col 5)-(line 1611,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDefaultErrorReporter()",
      "begin_line": 1614,
      "end_line": 1617,
      "comment": "",
      "child_ranges": [
        "(line 1616,col 5)-(line 1616,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource()",
      "begin_line": 1626,
      "end_line": 1647,
      "comment": "\n   * Converts the main parse tree back to JS code.\n   ",
      "child_ranges": [
        "(line 1627,col 5)-(line 1646,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-a2a39919-6d1b-4c52-b3e6-a69d8e4f8057.call()",
      "begin_line": 1628,
      "end_line": 1645,
      "comment": "",
      "child_ranges": [
        "(line 1630,col 9)-(line 1630,col 46)",
        "(line 1631,col 9)-(line 1644,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSourceArray()",
      "begin_line": 1652,
      "end_line": 1673,
      "comment": "\n   * Converts the parse tree for each input back to JS code.\n   ",
      "child_ranges": [
        "(line 1653,col 5)-(line 1672,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-1ca8d73a-b173-4392-aec0-c13bf1bf82e0.call()",
      "begin_line": 1654,
      "end_line": 1671,
      "comment": "",
      "child_ranges": [
        "(line 1656,col 9)-(line 1656,col 51)",
        "(line 1657,col 9)-(line 1670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.jscomp.JSModule)",
      "begin_line": 1678,
      "end_line": 1699,
      "comment": "\n   * Converts the parse tree for a module back to JS code.\n   ",
      "child_ranges": [
        "(line 1679,col 5)-(line 1698,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-350b5bb6-59e7-4135-941b-82ee1d1db167.call()",
      "begin_line": 1680,
      "end_line": 1697,
      "comment": "",
      "child_ranges": [
        "(line 1682,col 9)-(line 1682,col 56)",
        "(line 1683,col 9)-(line 1683,col 38)",
        "(line 1684,col 9)-(line 1686,col 9)",
        "(line 1687,col 9)-(line 1687,col 43)",
        "(line 1688,col 9)-(line 1695,col 9)",
        "(line 1696,col 9)-(line 1696,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSourceArray(com.google.javascript.jscomp.JSModule)",
      "begin_line": 1705,
      "end_line": 1731,
      "comment": "\n   * Converts the parse tree for each input in a module back to JS code.\n   ",
      "child_ranges": [
        "(line 1706,col 5)-(line 1730,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-163df498-1b3c-4a04-9150-ade12ec2a6d7.call()",
      "begin_line": 1707,
      "end_line": 1729,
      "comment": "",
      "child_ranges": [
        "(line 1709,col 9)-(line 1709,col 56)",
        "(line 1710,col 9)-(line 1710,col 38)",
        "(line 1711,col 9)-(line 1713,col 9)",
        "(line 1715,col 9)-(line 1715,col 49)",
        "(line 1716,col 9)-(line 1716,col 43)",
        "(line 1717,col 9)-(line 1727,col 9)",
        "(line 1728,col 9)-(line 1728,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.jscomp.Compiler.CodeBuilder, int, com.google.javascript.rhino.Node)",
      "begin_line": 1740,
      "end_line": 1802,
      "comment": "\n   * Writes out JS code from a root node. If printing input delimiters, this\n   * method will attach a comment to the start of the text indicating which\n   * input the output derived from. If there were any preserve annotations\n   * within the root\u0027s source, they will also be printed in a block comment\n   * at the beginning of the output.\n   ",
      "child_ranges": [
        "(line 1743,col 5)-(line 1801,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-1f4f2be5-f326-472f-b48c-3abee1d35570.call()",
      "begin_line": 1744,
      "end_line": 1800,
      "comment": "",
      "child_ranges": [
        "(line 1746,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1771,col 9)",
        "(line 1775,col 9)-(line 1778,col 9)",
        "(line 1782,col 9)-(line 1782,col 66)",
        "(line 1783,col 9)-(line 1798,col 9)",
        "(line 1799,col 9)-(line 1799,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.rhino.Node)",
      "begin_line": 1808,
      "end_line": 1812,
      "comment": "\n   * Generates JavaScript source code for an AST, doesn\u0027t generate source\n   * map info.\n   ",
      "child_ranges": [
        "(line 1810,col 5)-(line 1810,col 35)",
        "(line 1811,col 5)-(line 1811,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SourceMap, boolean)",
      "begin_line": 1817,
      "end_line": 1824,
      "comment": "\n   * Generates JavaScript source code for an AST.\n   ",
      "child_ranges": [
        "(line 1818,col 5)-(line 1818,col 61)",
        "(line 1819,col 5)-(line 1819,col 40)",
        "(line 1820,col 5)-(line 1820,col 36)",
        "(line 1821,col 5)-(line 1822,col 69)",
        "(line 1823,col 5)-(line 1823,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1830,
      "end_line": 1888,
      "comment": "\n   * Stores a buffer of text to which more can be appended.  This is just like a\n   * StringBuilder except that we also track the number of lines.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sb"
      ],
      "begin_line": 1831,
      "end_line": 1831,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineCount"
      ],
      "begin_line": 1832,
      "end_line": 1832,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colCount"
      ],
      "begin_line": 1833,
      "end_line": 1833,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.reset()",
      "begin_line": 1836,
      "end_line": 1838,
      "comment": " Removes all text, but leaves the line count unchanged. ",
      "child_ranges": [
        "(line 1837,col 7)-(line 1837,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.append(java.lang.String)",
      "begin_line": 1841,
      "end_line": 1860,
      "comment": " Appends the given string to the text buffer. ",
      "child_ranges": [
        "(line 1842,col 7)-(line 1842,col 21)",
        "(line 1845,col 7)-(line 1845,col 21)",
        "(line 1846,col 7)-(line 1846,col 28)",
        "(line 1847,col 7)-(line 1850,col 7)",
        "(line 1852,col 7)-(line 1857,col 7)",
        "(line 1859,col 7)-(line 1859,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.toString()",
      "begin_line": 1863,
      "end_line": 1866,
      "comment": " Returns all text in the text buffer. ",
      "child_ranges": [
        "(line 1865,col 7)-(line 1865,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getLength()",
      "begin_line": 1869,
      "end_line": 1871,
      "comment": " Returns the length of the text buffer. ",
      "child_ranges": [
        "(line 1870,col 7)-(line 1870,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getLineIndex()",
      "begin_line": 1874,
      "end_line": 1876,
      "comment": " Returns the (zero-based) index of the last line in the text buffer. ",
      "child_ranges": [
        "(line 1875,col 7)-(line 1875,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getColumnIndex()",
      "begin_line": 1879,
      "end_line": 1881,
      "comment": " Returns the (zero-based) index of the last column in the text buffer. ",
      "child_ranges": [
        "(line 1880,col 7)-(line 1880,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.endsWith(java.lang.String)",
      "begin_line": 1884,
      "end_line": 1887,
      "comment": " Determines whether the text ends with the given suffix. ",
      "child_ranges": [
        "(line 1885,col 7)-(line 1886,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.optimize()",
      "begin_line": 1894,
      "end_line": 1918,
      "comment": "",
      "child_ranges": [
        "(line 1900,col 5)-(line 1900,col 16)",
        "(line 1903,col 5)-(line 1906,col 5)",
        "(line 1908,col 5)-(line 1908,col 61)",
        "(line 1909,col 5)-(line 1911,col 5)",
        "(line 1912,col 5)-(line 1914,col 5)",
        "(line 1915,col 5)-(line 1915,col 63)",
        "(line 1916,col 5)-(line 1916,col 48)",
        "(line 1917,col 5)-(line 1917,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 1920,
      "end_line": 1923,
      "comment": "",
      "child_ranges": [
        "(line 1922,col 5)-(line 1922,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCssRenamingMap()",
      "begin_line": 1925,
      "end_line": 1928,
      "comment": "",
      "child_ranges": [
        "(line 1927,col 5)-(line 1927,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processDefines()",
      "begin_line": 1937,
      "end_line": 1940,
      "comment": "\n   * Reprocesses the current defines over the AST.  This is used by GwtCompiler\n   * to generate N outputs for different targets from the same (checked) AST.\n   * For each target, we apply the target-specific defines by calling\n   * {@code processDefines} and then {@code optimize} to optimize the AST\n   * specifically for that target.\n   ",
      "child_ranges": [
        "(line 1938,col 5)-(line 1939,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isInliningForbidden()",
      "begin_line": 1942,
      "end_line": 1946,
      "comment": "",
      "child_ranges": [
        "(line 1943,col 5)-(line 1945,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.computeCFG()",
      "begin_line": 1949,
      "end_line": 1956,
      "comment": " Control Flow Analysis. ",
      "child_ranges": [
        "(line 1950,col 5)-(line 1950,col 48)",
        "(line 1951,col 5)-(line 1951,col 44)",
        "(line 1952,col 5)-(line 1952,col 73)",
        "(line 1953,col 5)-(line 1953,col 17)",
        "(line 1954,col 5)-(line 1954,col 37)",
        "(line 1955,col 5)-(line 1955,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.normalize()",
      "begin_line": 1958,
      "end_line": 1963,
      "comment": "",
      "child_ranges": [
        "(line 1959,col 5)-(line 1959,col 31)",
        "(line 1960,col 5)-(line 1960,col 27)",
        "(line 1961,col 5)-(line 1961,col 40)",
        "(line 1962,col 5)-(line 1962,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.prepareAst(com.google.javascript.rhino.Node)",
      "begin_line": 1965,
      "end_line": 1969,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 5)-(line 1967,col 45)",
        "(line 1968,col 5)-(line 1968,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.recordFunctionInformation()",
      "begin_line": 1971,
      "end_line": 1980,
      "comment": "",
      "child_ranges": [
        "(line 1972,col 5)-(line 1972,col 50)",
        "(line 1973,col 5)-(line 1973,col 43)",
        "(line 1974,col 5)-(line 1976,col 72)",
        "(line 1977,col 5)-(line 1977,col 36)",
        "(line 1978,col 5)-(line 1978,col 61)",
        "(line 1979,col 5)-(line 1979,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recentChange"
      ],
      "begin_line": 1982,
      "end_line": 1982,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeChangeHandlers"
      ],
      "begin_line": 1983,
      "end_line": 1984,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SYNTHETIC_EXTERNS"
      ],
      "begin_line": 1987,
      "end_line": 1987,
      "comment": " Name of the synthetic input that holds synthesized externs. "
    },
    {
      "type": "field",
      "varNames": [
        "synthesizedExternsInput"
      ],
      "begin_line": 1989,
      "end_line": 1989,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 1991,
      "end_line": 1994,
      "comment": "",
      "child_ranges": [
        "(line 1993,col 5)-(line 1993,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 1996,
      "end_line": 1999,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setScope(com.google.javascript.rhino.Node)",
      "begin_line": 2001,
      "end_line": 2006,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 5)-(line 2005,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getJsRoot()",
      "begin_line": 2008,
      "end_line": 2011,
      "comment": "",
      "child_ranges": [
        "(line 2010,col 5)-(line 2010,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasScopeChanged(com.google.javascript.rhino.Node)",
      "begin_line": 2013,
      "end_line": 2019,
      "comment": "",
      "child_ranges": [
        "(line 2015,col 5)-(line 2017,col 5)",
        "(line 2018,col 5)-(line 2018,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.reportChangeToEnclosingScope(com.google.javascript.rhino.Node)",
      "begin_line": 2021,
      "end_line": 2031,
      "comment": "",
      "child_ranges": [
        "(line 2023,col 5)-(line 2030,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setPhaseOptimizer(com.google.javascript.jscomp.PhaseOptimizer)",
      "begin_line": 2038,
      "end_line": 2041,
      "comment": "\n   * Some tests don\u0027t want to call the compiler \"wholesale,\" they may not want\n   * to call check and/or optimize. With this method, tests can execute custom\n   * optimization loops.\n   ",
      "child_ranges": [
        "(line 2040,col 5)-(line 2040,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.reportCodeChange()",
      "begin_line": 2043,
      "end_line": 2048,
      "comment": "",
      "child_ranges": [
        "(line 2045,col 5)-(line 2047,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCodingConvention()",
      "begin_line": 2050,
      "end_line": 2055,
      "comment": "",
      "child_ranges": [
        "(line 2052,col 5)-(line 2052,col 64)",
        "(line 2053,col 5)-(line 2053,col 75)",
        "(line 2054,col 5)-(line 2054,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isIdeMode()",
      "begin_line": 2057,
      "end_line": 2060,
      "comment": "",
      "child_ranges": [
        "(line 2059,col 5)-(line 2059,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.acceptEcmaScript5()",
      "begin_line": 2062,
      "end_line": 2072,
      "comment": "",
      "child_ranges": [
        "(line 2064,col 5)-(line 2070,col 5)",
        "(line 2071,col 5)-(line 2071,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.languageMode()",
      "begin_line": 2074,
      "end_line": 2076,
      "comment": "",
      "child_ranges": [
        "(line 2075,col 5)-(line 2075,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.acceptConstKeyword()",
      "begin_line": 2078,
      "end_line": 2081,
      "comment": "",
      "child_ranges": [
        "(line 2080,col 5)-(line 2080,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getParserConfig()",
      "begin_line": 2083,
      "end_line": 2108,
      "comment": "",
      "child_ranges": [
        "(line 2085,col 5)-(line 2106,col 5)",
        "(line 2107,col 5)-(line 2107,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled()",
      "begin_line": 2110,
      "end_line": 2113,
      "comment": "",
      "child_ranges": [
        "(line 2112,col 5)-(line 2112,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDiagnosticGroups()",
      "begin_line": 2124,
      "end_line": 2126,
      "comment": "\n   * The warning classes that are available from the command-line, and\n   * are suppressible by the {@code @suppress} annotation.\n   ",
      "child_ranges": [
        "(line 2125,col 5)-(line 2125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 2128,
      "end_line": 2144,
      "comment": "",
      "child_ranges": [
        "(line 2130,col 5)-(line 2130,col 47)",
        "(line 2131,col 5)-(line 2136,col 5)",
        "(line 2138,col 5)-(line 2143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorLevel(com.google.javascript.jscomp.JSError)",
      "begin_line": 2146,
      "end_line": 2150,
      "comment": "",
      "child_ranges": [
        "(line 2148,col 5)-(line 2148,col 40)",
        "(line 2149,col 5)-(line 2149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.throwInternalError(java.lang.String, java.lang.Exception)",
      "begin_line": 2155,
      "end_line": 2166,
      "comment": "\n   * Report an internal error.\n   ",
      "child_ranges": [
        "(line 2157,col 5)-(line 2159,col 48)",
        "(line 2161,col 5)-(line 2161,col 67)",
        "(line 2162,col 5)-(line 2164,col 5)",
        "(line 2165,col 5)-(line 2165,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorCount()",
      "begin_line": 2172,
      "end_line": 2174,
      "comment": "\n   * Gets the number of errors.\n   ",
      "child_ranges": [
        "(line 2173,col 5)-(line 2173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getWarningCount()",
      "begin_line": 2179,
      "end_line": 2181,
      "comment": "\n   * Gets the number of warnings.\n   ",
      "child_ranges": [
        "(line 2180,col 5)-(line 2180,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasHaltingErrors()",
      "begin_line": 2183,
      "end_line": 2186,
      "comment": "",
      "child_ranges": [
        "(line 2185,col 5)-(line 2185,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasErrors()",
      "begin_line": 2197,
      "end_line": 2199,
      "comment": "\n   * Consults the {@link ErrorManager} to see if we\u0027ve encountered errors\n   * that should halt compilation. \u003cp\u003e\n   *\n   * If {@link CompilerOptions#ideMode} is {@code true}, this function\n   * always returns {@code false} without consulting the error manager. The\n   * error manager will continue to be told about new errors and warnings, but\n   * the compiler will complete compilation of all inputs.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 2198,col 5)-(line 2198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addToDebugLog(java.lang.String)",
      "begin_line": 2202,
      "end_line": 2207,
      "comment": " Called from the compiler passes, adds debug info ",
      "child_ranges": [
        "(line 2204,col 5)-(line 2204,col 25)",
        "(line 2205,col 5)-(line 2205,col 26)",
        "(line 2206,col 5)-(line 2206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceFileByName(java.lang.String)",
      "begin_line": 2209,
      "end_line": 2220,
      "comment": "",
      "child_ranges": [
        "(line 2213,col 5)-(line 2218,col 5)",
        "(line 2219,col 5)-(line 2219,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceLine(java.lang.String, int)",
      "begin_line": 2222,
      "end_line": 2232,
      "comment": "",
      "child_ranges": [
        "(line 2224,col 5)-(line 2226,col 5)",
        "(line 2227,col 5)-(line 2227,col 55)",
        "(line 2228,col 5)-(line 2230,col 5)",
        "(line 2231,col 5)-(line 2231,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceRegion(java.lang.String, int)",
      "begin_line": 2234,
      "end_line": 2244,
      "comment": "",
      "child_ranges": [
        "(line 2236,col 5)-(line 2238,col 5)",
        "(line 2239,col 5)-(line 2239,col 55)",
        "(line 2240,col 5)-(line 2242,col 5)",
        "(line 2243,col 5)-(line 2243,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)",
      "begin_line": 2250,
      "end_line": 2265,
      "comment": "",
      "child_ranges": [
        "(line 2252,col 5)-(line 2258,col 5)",
        "(line 2260,col 5)-(line 2260,col 58)",
        "(line 2261,col 5)-(line 2263,col 5)",
        "(line 2264,col 5)-(line 2264,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceMap()",
      "begin_line": 2267,
      "end_line": 2269,
      "comment": "",
      "child_ranges": [
        "(line 2268,col 5)-(line 2268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getVariableMap()",
      "begin_line": 2271,
      "end_line": 2273,
      "comment": "",
      "child_ranges": [
        "(line 2272,col 5)-(line 2272,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getPropertyMap()",
      "begin_line": 2275,
      "end_line": 2277,
      "comment": "",
      "child_ranges": [
        "(line 2276,col 5)-(line 2276,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getOptions()",
      "begin_line": 2279,
      "end_line": 2281,
      "comment": "",
      "child_ranges": [
        "(line 2280,col 5)-(line 2280,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getFunctionalInformationMap()",
      "begin_line": 2283,
      "end_line": 2285,
      "comment": "",
      "child_ranges": [
        "(line 2284,col 5)-(line 2284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setLoggingLevel(java.util.logging.Level)",
      "begin_line": 2290,
      "end_line": 2292,
      "comment": "\n   * Sets the logging level for the com.google.javascript.jscomp package.\n   ",
      "child_ranges": [
        "(line 2291,col 5)-(line 2291,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getAstDotGraph()",
      "begin_line": 2295,
      "end_line": 2303,
      "comment": " Gets the DOT graph of the AST generated at the end of compilation. ",
      "child_ranges": [
        "(line 2296,col 5)-(line 2302,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorManager()",
      "begin_line": 2305,
      "end_line": 2311,
      "comment": "",
      "child_ranges": [
        "(line 2307,col 5)-(line 2309,col 5)",
        "(line 2310,col 5)-(line 2310,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsInOrder()",
      "begin_line": 2313,
      "end_line": 2316,
      "comment": "",
      "child_ranges": [
        "(line 2315,col 5)-(line 2315,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsById()",
      "begin_line": 2321,
      "end_line": 2323,
      "comment": "\n   * Returns an unmodifiable view of the compiler inputs indexed by id.\n   ",
      "child_ranges": [
        "(line 2322,col 5)-(line 2322,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getExternsInOrder()",
      "begin_line": 2328,
      "end_line": 2330,
      "comment": "\n   * Gets the externs in the order in which they are being processed.\n   ",
      "child_ranges": [
        "(line 2329,col 5)-(line 2329,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntermediateState",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 2343,
      "end_line": 2357,
      "comment": "\n   * Stores the internal compiler state just before optimization is performed.\n   * This can be saved and restored in order to efficiently optimize multiple\n   * different output targets without having to perform checking multiple times.\n   *\n   * NOTE: This does not include all parts of the compiler\u0027s internal state. In\n   * particular, SourceFiles and CompilerOptions are not recorded. In\n   * order to recreate a Compiler instance from scratch, you would need to\n   * call {@code init} with the same arguments as in the initial creation before\n   * restoring intermediate state.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2344,
      "end_line": 2344,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 2346,
      "end_line": 2346,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 2347,
      "end_line": 2347,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 2348,
      "end_line": 2348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 2349,
      "end_line": 2349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modules"
      ],
      "begin_line": 2350,
      "end_line": 2350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passConfigState"
      ],
      "begin_line": 2351,
      "end_line": 2351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 2352,
      "end_line": 2352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lifeCycleStage"
      ],
      "begin_line": 2353,
      "end_line": 2353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectedLibraries"
      ],
      "begin_line": 2354,
      "end_line": 2354,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.IntermediateState.IntermediateState()",
      "begin_line": 2356,
      "end_line": 2356,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getState()",
      "begin_line": 2362,
      "end_line": 2375,
      "comment": "\n   * Returns the current internal state, excluding the input files and modules.\n   ",
      "child_ranges": [
        "(line 2363,col 5)-(line 2363,col 54)",
        "(line 2364,col 5)-(line 2364,col 36)",
        "(line 2365,col 5)-(line 2365,col 26)",
        "(line 2366,col 5)-(line 2366,col 28)",
        "(line 2367,col 5)-(line 2367,col 26)",
        "(line 2368,col 5)-(line 2368,col 28)",
        "(line 2369,col 5)-(line 2369,col 67)",
        "(line 2370,col 5)-(line 2370,col 38)",
        "(line 2371,col 5)-(line 2371,col 47)",
        "(line 2372,col 5)-(line 2372,col 71)",
        "(line 2374,col 5)-(line 2374,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setState(com.google.javascript.jscomp.Compiler.IntermediateState)",
      "begin_line": 2381,
      "end_line": 2394,
      "comment": "\n   * Sets the internal state to the capture given.  Note that this assumes that\n   * the input files are already set up.\n   ",
      "child_ranges": [
        "(line 2382,col 5)-(line 2382,col 36)",
        "(line 2383,col 5)-(line 2383,col 26)",
        "(line 2384,col 5)-(line 2384,col 28)",
        "(line 2385,col 5)-(line 2385,col 26)",
        "(line 2386,col 5)-(line 2386,col 28)",
        "(line 2387,col 5)-(line 2387,col 40)",
        "(line 2388,col 5)-(line 2388,col 64)",
        "(line 2389,col 5)-(line 2389,col 38)",
        "(line 2390,col 5)-(line 2390,col 44)",
        "(line 2392,col 5)-(line 2392,col 30)",
        "(line 2393,col 5)-(line 2393,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsForTesting()",
      "begin_line": 2396,
      "end_line": 2399,
      "comment": "",
      "child_ranges": [
        "(line 2398,col 5)-(line 2398,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getExternsForTesting()",
      "begin_line": 2401,
      "end_line": 2404,
      "comment": "",
      "child_ranges": [
        "(line 2403,col 5)-(line 2403,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasRegExpGlobalReferences()",
      "begin_line": 2406,
      "end_line": 2409,
      "comment": "",
      "child_ranges": [
        "(line 2408,col 5)-(line 2408,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setHasRegExpGlobalReferences(boolean)",
      "begin_line": 2411,
      "end_line": 2414,
      "comment": "",
      "child_ranges": [
        "(line 2413,col 5)-(line 2413,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 2416,
      "end_line": 2426,
      "comment": "",
      "child_ranges": [
        "(line 2419,col 5)-(line 2420,col 37)",
        "(line 2421,col 5)-(line 2424,col 5)",
        "(line 2425,col 5)-(line 2425,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getGlobalVarReferences()",
      "begin_line": 2428,
      "end_line": 2431,
      "comment": "",
      "child_ranges": [
        "(line 2430,col 5)-(line 2430,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSynthesizedExternsInput()",
      "begin_line": 2433,
      "end_line": 2439,
      "comment": "",
      "child_ranges": [
        "(line 2435,col 5)-(line 2437,col 5)",
        "(line 2438,col 5)-(line 2438,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getProgress()",
      "begin_line": 2441,
      "end_line": 2444,
      "comment": "",
      "child_ranges": [
        "(line 2443,col 5)-(line 2443,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getLastPassName()",
      "begin_line": 2446,
      "end_line": 2449,
      "comment": "",
      "child_ranges": [
        "(line 2448,col 5)-(line 2448,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setProgress(double, java.lang.String)",
      "begin_line": 2451,
      "end_line": 2459,
      "comment": "",
      "child_ranges": [
        "(line 2453,col 5)-(line 2453,col 33)",
        "(line 2454,col 5)-(line 2458,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.replaceScript(com.google.javascript.jscomp.JsAst)",
      "begin_line": 2468,
      "end_line": 2476,
      "comment": "\n   * Replaces one file in a hot-swap mode. The given JsAst should be made\n   * from a new version of a file that already was present in the last compile\n   * call. If the file is new, this will silently ignored.\n   *\n   * @param ast the ast of the file that is being replaced\n   ",
      "child_ranges": [
        "(line 2469,col 5)-(line 2469,col 58)",
        "(line 2470,col 5)-(line 2472,col 5)",
        "(line 2473,col 5)-(line 2473,col 47)",
        "(line 2475,col 5)-(line 2475,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addNewScript(com.google.javascript.jscomp.JsAst)",
      "begin_line": 2485,
      "end_line": 2496,
      "comment": "\n   * Adds a new Script AST to the compile state. If a script for the same file\n   * already exists the script will not be added, instead a call to\n   * #replaceScript should be used.\n   *\n   * @param ast the ast of the new file\n   ",
      "child_ranges": [
        "(line 2486,col 5)-(line 2488,col 5)",
        "(line 2489,col 5)-(line 2489,col 46)",
        "(line 2490,col 5)-(line 2490,col 39)",
        "(line 2491,col 5)-(line 2491,col 36)",
        "(line 2492,col 5)-(line 2493,col 54)",
        "(line 2495,col 5)-(line 2495,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processNewScript(com.google.javascript.jscomp.JsAst, com.google.javascript.rhino.Node)",
      "begin_line": 2498,
      "end_line": 2511,
      "comment": "",
      "child_ranges": [
        "(line 2499,col 5)-(line 2499,col 35)",
        "(line 2500,col 5)-(line 2500,col 35)",
        "(line 2502,col 5)-(line 2502,col 62)",
        "(line 2505,col 5)-(line 2505,col 79)",
        "(line 2507,col 5)-(line 2507,col 45)",
        "(line 2508,col 5)-(line 2508,col 36)",
        "(line 2510,col 5)-(line 2510,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runHotSwap(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PassConfig)",
      "begin_line": 2516,
      "end_line": 2521,
      "comment": "\n   * Execute the passes from a PassConfig instance over a single replaced file.\n   ",
      "child_ranges": [
        "(line 2518,col 5)-(line 2520,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runHotSwapPass(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PassFactory)",
      "begin_line": 2523,
      "end_line": 2530,
      "comment": "",
      "child_ranges": [
        "(line 2525,col 5)-(line 2525,col 64)",
        "(line 2526,col 5)-(line 2529,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCleanupPassConfig()",
      "begin_line": 2532,
      "end_line": 2534,
      "comment": "",
      "child_ranges": [
        "(line 2533,col 5)-(line 2533,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeSyntheticVarsInput()",
      "begin_line": 2536,
      "end_line": 2539,
      "comment": "",
      "child_ranges": [
        "(line 2537,col 5)-(line 2537,col 51)",
        "(line 2538,col 5)-(line 2538,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.ensureLibraryInjected(java.lang.String)",
      "begin_line": 2541,
      "end_line": 2567,
      "comment": "",
      "child_ranges": [
        "(line 2543,col 5)-(line 2545,col 5)",
        "(line 2548,col 5)-(line 2548,col 49)",
        "(line 2549,col 5)-(line 2551,col 5)",
        "(line 2553,col 5)-(line 2553,col 69)",
        "(line 2554,col 5)-(line 2554,col 49)",
        "(line 2556,col 5)-(line 2556,col 48)",
        "(line 2557,col 5)-(line 2562,col 5)",
        "(line 2563,col 5)-(line 2563,col 23)",
        "(line 2565,col 5)-(line 2565,col 51)",
        "(line 2566,col 5)-(line 2566,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.loadLibraryCode(java.lang.String)",
      "begin_line": 2570,
      "end_line": 2585,
      "comment": " Load a library as a resource ",
      "child_ranges": [
        "(line 2572,col 5)-(line 2572,col 24)",
        "(line 2573,col 5)-(line 2580,col 5)",
        "(line 2582,col 5)-(line 2584,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReleaseVersion()",
      "begin_line": 2588,
      "end_line": 2591,
      "comment": " Returns the compiler version baked into the jar. ",
      "child_ranges": [
        "(line 2589,col 5)-(line 2589,col 70)",
        "(line 2590,col 5)-(line 2590,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReleaseDate()",
      "begin_line": 2594,
      "end_line": 2597,
      "comment": " Returns the compiler date baked into the jar. ",
      "child_ranges": [
        "(line 2595,col 5)-(line 2595,col 70)",
        "(line 2596,col 5)-(line 2596,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setOldParseTree(java.lang.String, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 2602,
      "end_line": 2604,
      "comment": "\n   * {@inheritDoc}\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getOldParseTreeByName(java.lang.String)",
      "begin_line": 2609,
      "end_line": 2612,
      "comment": "\n   * {@inheritDoc}\n   ",
      "child_ranges": [
        "(line 2611,col 5)-(line 2611,col 16)"
      ]
    }
  ]
}