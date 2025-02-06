{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/Compiler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Compiler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractCompiler"
      ],
      "begin_line": 83,
      "end_line": 2552,
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
        "CONFIG_RESOURCE"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The externs inputs"
    },
    {
      "type": "field",
      "varNames": [
        "modules"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The JS source modules"
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " 2 modules, because we use this as a signal for which passes to run."
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The JS source inputs"
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " error manager to which error management is delegated"
    },
    {
      "type": "field",
      "varNames": [
        "warningsGuard"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Warnings guard for filtering warnings."
    },
    {
      "type": "field",
      "varNames": [
        "injectedLibraries"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " the library, so code can be inserted after."
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Parse tree root nodes"
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externAndJsRoot"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputsById"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMap"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The source code map "
    },
    {
      "type": "field",
      "varNames": [
        "externExports"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The externs created from the exports.  "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueNameId"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n   * Ids for function inlining so that each declared name remains\n   * unique.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "hasRegExpGlobalReferences"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n   * Whether to assume there are references to the RegExp Global object\n   * properties.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionInformationMap"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The function information map "
    },
    {
      "type": "field",
      "varNames": [
        "debugLog"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Debugging information "
    },
    {
      "type": "field",
      "varNames": [
        "defaultCodingConvention"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Detects Google-specific coding conventions. "
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserConfig"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "abstractInterpreter"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeValidator"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tracker"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldErrorReporter"
      ],
      "begin_line": 168,
      "end_line": 169,
      "comment": " The oldErrorReporter exists so we can get errors from the JSTypeRegistry."
    },
    {
      "type": "field",
      "varNames": [
        "defaultErrorReporter"
      ],
      "begin_line": 172,
      "end_line": 173,
      "comment": " This error reporter gets the messages from the current Rhino parser."
    },
    {
      "type": "field",
      "varNames": [
        "OPTIMIZE_LOOP_ERROR"
      ],
      "begin_line": 176,
      "end_line": 178,
      "comment": " Error strings used for reporting JSErrors "
    },
    {
      "type": "field",
      "varNames": [
        "MOTION_ITERATIONS_ERROR"
      ],
      "begin_line": 179,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "COMPILER_STACK_SIZE"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " About 2MB"
    },
    {
      "type": "field",
      "varNames": [
        "compilerExecutor"
      ],
      "begin_line": 195,
      "end_line": 200,
      "comment": "\n   * Under JRE 1.6, the JS Compiler overflows the stack when running on some\n   * large or complex JS code. When threads are available, we run all compile\n   * jobs on a separate thread with a larger stack.\n   *\n   * That way, we don\u0027t have to increase the stack size for *every* thread\n   * (which is what -Xss does).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-fa4ba8eb-bcc0-45ce-bf0f-0a1bef2a3eb4.newThread(java.lang.Runnable)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 7)-(line 198,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "compilerThread"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n   * Use a dedicated compiler thread per Compiler instance.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "useThreads"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Whether to use threads. "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 216,
      "end_line": 217,
      "comment": "\n   * Logger for the whole com.google.javascript.jscomp domain -\n   * setting configuration for this logger affects all loggers\n   *  in other classes within the compiler.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "outStream"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalRefMap"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "progress"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastPassName"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n   * Creates a Compiler that reports errors and warnings to its logger.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler(java.io.PrintStream)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n   * Creates n Compiler that reports errors and warnings to an output\n   * stream.\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 35)",
        "(line 239,col 5)-(line 239,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.Compiler(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n   * Creates a Compiler that uses a custom error manager.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 11)",
        "(line 247,col 5)-(line 247,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setErrorManager(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 255,
      "end_line": 259,
      "comment": "\n   * Sets the error manager.\n   *\n   * @param errorManager the error manager, it cannot be {@code null}\n   ",
      "child_ranges": [
        "(line 256,col 5)-(line 257,col 58)",
        "(line 258,col 5)-(line 258,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createMessageFormatter()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n   * Creates a message formatter instance corresponding to the value of\n   * {@link CompilerOptions}.\n   ",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 59)",
        "(line 267,col 5)-(line 267,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 274,
      "end_line": 337,
      "comment": "\n   * Initialize the compiler options. Only necessary if you\u0027re not doing\n   * a normal compile() job.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 27)",
        "(line 276,col 5)-(line 286,col 5)",
        "(line 289,col 5)-(line 301,col 5)",
        "(line 303,col 5)-(line 308,col 5)",
        "(line 310,col 5)-(line 314,col 5)",
        "(line 317,col 5)-(line 317,col 54)",
        "(line 318,col 5)-(line 320,col 58)",
        "(line 321,col 5)-(line 321,col 43)",
        "(line 323,col 5)-(line 323,col 75)",
        "(line 330,col 5)-(line 334,col 5)",
        "(line 336,col 5)-(line 336,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 343,
      "end_line": 348,
      "comment": "\n   * Initializes the instance state needed for a compile job.\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 347,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(java.util.List\u003cT1\u003e, java.util.List\u003cT2\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 353,
      "end_line": 363,
      "comment": "\n   * Initializes the instance state needed for a compile job.\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 58)",
        "(line 358,col 5)-(line 360,col 5)",
        "(line 362,col 5)-(line 362,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.init(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 370,
      "end_line": 375,
      "comment": "\n   * Initializes the instance state needed for a compile job if the sources\n   * are in modules.\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 374,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initModules(java.util.List\u003cT\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 381,
      "end_line": 411,
      "comment": "\n   * Initializes the instance state needed for a compile job if the sources\n   * are in modules.\n   ",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 25)",
        "(line 385,col 5)-(line 385,col 30)",
        "(line 386,col 5)-(line 386,col 30)",
        "(line 388,col 5)-(line 388,col 52)",
        "(line 392,col 5)-(line 392,col 27)",
        "(line 393,col 5)-(line 405,col 5)",
        "(line 407,col 5)-(line 407,col 51)",
        "(line 408,col 5)-(line 408,col 25)",
        "(line 410,col 5)-(line 410,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initBasedOnOptions()",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\n   * Do any initialization that is dependent on the compiler options.\n   ",
      "child_ranges": [
        "(line 418,col 5)-(line 421,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.makeCompilerInput(java.util.List\u003cT\u003e, boolean)",
      "begin_line": 424,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 426,col 5)-(line 426,col 54)",
        "(line 427,col 5)-(line 429,col 5)",
        "(line 430,col 5)-(line 430,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MODULE_LIST_ERROR"
      ],
      "begin_line": 433,
      "end_line": 435,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ROOT_MODULE_ERROR"
      ],
      "begin_line": 437,
      "end_line": 439,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.checkFirstModule(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "\n   * Verifies that at least one module has been provided and that the first one\n   * has at least one source code input.\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 452,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createFillFileName(java.lang.String)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n   * Empty modules get an empty \"fill\" file, so that we can move code into\n   * an empty module.\n   ",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.fillEmptyModules(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 467,
      "end_line": 474,
      "comment": "\n   * Fill any empty modules with a place holder file. It makes any cross module\n   * motion easier.\n   ",
      "child_ranges": [
        "(line 468,col 5)-(line 473,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.rebuildInputsFromModules()",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\n   * Rebuilds the internal list of inputs by iterating over all modules.\n   * This is necessary if inputs have been added to or removed from a module\n   * after the {@link #init(JSSourceFile[], JSModule[], CompilerOptions)} call.\n   ",
      "child_ranges": [
        "(line 482,col 5)-(line 482,col 46)",
        "(line 483,col 5)-(line 483,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getAllInputsFromModules(java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e)",
      "begin_line": 490,
      "end_line": 506,
      "comment": "\n   * Builds a single list of all module inputs. Verifies that it contains no\n   * duplicates.\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 54)",
        "(line 493,col 5)-(line 493,col 55)",
        "(line 494,col 5)-(line 504,col 5)",
        "(line 505,col 5)-(line 505,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_INPUT"
      ],
      "begin_line": 508,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_EXTERN_INPUT"
      ],
      "begin_line": 510,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initInputsByIdMap()",
      "begin_line": 518,
      "end_line": 534,
      "comment": "\n   * Creates a map to make looking up an input by name fast. Also checks for\n   * duplicate inputs.\n   ",
      "child_ranges": [
        "(line 519,col 5)-(line 519,col 55)",
        "(line 520,col 5)-(line 526,col 5)",
        "(line 527,col 5)-(line 533,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 6)-(line 538,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.SourceFile, com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 544,
      "end_line": 548,
      "comment": "\n   * @deprecated Convert your arrays to lists and use the list-based API.\n   ",
      "child_ranges": [
        "(line 547,col 6)-(line 547,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile, com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 554,
      "end_line": 559,
      "comment": "\n   * @deprecated Convert your arrays to lists and use the list-based\n   *     compileModules method.\n   ",
      "child_ranges": [
        "(line 557,col 6)-(line 558,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 566,
      "end_line": 573,
      "comment": "\n   * Compiles a list of inputs.\n   * @deprecated Convert your arrays to lists and use the list-based compile\n   *     method.\n   ",
      "child_ranges": [
        "(line 570,col 5)-(line 572,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(java.util.List\u003cT1\u003e, java.util.List\u003cT2\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 578,
      "end_line": 594,
      "comment": "\n   * Compiles a list of inputs.\n   ",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 45)",
        "(line 583,col 5)-(line 593,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile(com.google.javascript.jscomp.JSSourceFile[], com.google.javascript.jscomp.JSModule[], com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 601,
      "end_line": 608,
      "comment": "\n   * Compiles a list of modules.\n   * @deprecated Convert your arrays to lists and use the list-based\n   *     compileModules method.\n   ",
      "child_ranges": [
        "(line 605,col 5)-(line 607,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compileModules(java.util.List\u003cT\u003e, java.util.List\u003ccom.google.javascript.jscomp.JSModule\u003e, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 613,
      "end_line": 629,
      "comment": "\n   * Compiles a list of modules.\n   ",
      "child_ranges": [
        "(line 616,col 5)-(line 616,col 45)",
        "(line 618,col 5)-(line 628,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compile()",
      "begin_line": 631,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 632,col 5)-(line 638,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-ca05470f-5e81-4e7f-96e0-80574f255125.call()",
      "begin_line": 633,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 636,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.disableThreads()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n   * Disable threads. This is for clients that run on AppEngine and\n   * don\u0027t have threads.\n   ",
      "child_ranges": [
        "(line 646,col 5)-(line 646,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runInCompilerThread(java.util.concurrent.Callable\u003cT\u003e)",
      "begin_line": 649,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 651,col 5)-(line 651,col 77)",
        "(line 652,col 5)-(line 652,col 20)",
        "(line 653,col 5)-(line 653,col 51)",
        "(line 654,col 5)-(line 675,col 6)",
        "(line 677,col 5)-(line 679,col 59)",
        "(line 682,col 5)-(line 696,col 5)",
        "(line 699,col 5)-(line 701,col 5)",
        "(line 703,col 5)-(line 703,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-4bcf2d22-71ba-4d4a-b47f-8430e4179ee8.call()",
      "begin_line": 655,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.compileInternal()",
      "begin_line": 706,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 707,col 5)-(line 707,col 27)",
        "(line 708,col 5)-(line 708,col 12)",
        "(line 711,col 5)-(line 711,col 31)",
        "(line 712,col 5)-(line 714,col 5)",
        "(line 716,col 5)-(line 718,col 5)",
        "(line 720,col 5)-(line 724,col 5)",
        "(line 726,col 5)-(line 741,col 5)",
        "(line 743,col 5)-(line 745,col 5)",
        "(line 747,col 5)-(line 749,col 5)",
        "(line 750,col 5)-(line 750,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parse()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 754,col 5)-(line 754,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getPassConfig()",
      "begin_line": 757,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 758,col 5)-(line 760,col 5)",
        "(line 761,col 5)-(line 761,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.createPassConfigInternal()",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\n   * Create the passes object. Clients should use setPassConfig instead of\n   * overriding this.\n   ",
      "child_ranges": [
        "(line 769,col 5)-(line 769,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setPassConfig(com.google.javascript.jscomp.PassConfig)",
      "begin_line": 777,
      "end_line": 789,
      "comment": "\n   * @param passes The PassConfig to use with this Compiler.\n   * @throws NullPointerException if passes is null\n   * @throws IllegalStateException if this.passes has already been assigned\n   ",
      "child_ranges": [
        "(line 783,col 5)-(line 783,col 39)",
        "(line 785,col 5)-(line 787,col 5)",
        "(line 788,col 5)-(line 788,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.precheck()",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n   * Carry out any special checks or procedures that need to be done before\n   * proceeding with rest of the compilation process.\n   *\n   * @return true, to continue with compilation\n   ",
      "child_ranges": [
        "(line 798,col 5)-(line 798,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.check()",
      "begin_line": 801,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 802,col 5)-(line 802,col 59)",
        "(line 806,col 5)-(line 807,col 62)",
        "(line 808,col 5)-(line 810,col 5)",
        "(line 811,col 5)-(line 811,col 56)",
        "(line 812,col 5)-(line 812,col 48)",
        "(line 813,col 5)-(line 815,col 5)",
        "(line 818,col 5)-(line 820,col 5)",
        "(line 822,col 5)-(line 824,col 5)",
        "(line 826,col 5)-(line 833,col 5)",
        "(line 835,col 5)-(line 835,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.externExports()",
      "begin_line": 838,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 839,col 5)-(line 839,col 52)",
        "(line 840,col 5)-(line 840,col 31)",
        "(line 842,col 5)-(line 842,col 57)",
        "(line 843,col 5)-(line 843,col 18)",
        "(line 845,col 5)-(line 845,col 47)",
        "(line 847,col 5)-(line 847,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.process(com.google.javascript.jscomp.CompilerPass)",
      "begin_line": 850,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 852,col 5)-(line 852,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 855,
      "end_line": 861,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-b9df66cc-1453-4a2a-bfde-5eaebb08115a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 857,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 859,col 7)-(line 859,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.maybeSanityCheck()",
      "begin_line": 863,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 864,col 5)-(line 866,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runSanityCheck()",
      "begin_line": 869,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 870,col 5)-(line 870,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeTryCatchFinally()",
      "begin_line": 876,
      "end_line": 882,
      "comment": "\n   * Removes try/catch/finally statements for easier debugging.\n   ",
      "child_ranges": [
        "(line 877,col 5)-(line 877,col 44)",
        "(line 878,col 5)-(line 878,col 39)",
        "(line 879,col 5)-(line 879,col 48)",
        "(line 880,col 5)-(line 880,col 15)",
        "(line 881,col 5)-(line 881,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.stripCode(java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 888,
      "end_line": 899,
      "comment": "\n   * Strips code for smaller compiled code. This is useful for removing debug\n   * statements to prevent leaking them publicly.\n   ",
      "child_ranges": [
        "(line 890,col 5)-(line 890,col 30)",
        "(line 891,col 5)-(line 891,col 27)",
        "(line 892,col 5)-(line 893,col 46)",
        "(line 894,col 5)-(line 896,col 5)",
        "(line 897,col 5)-(line 897,col 15)",
        "(line 898,col 5)-(line 898,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)",
      "begin_line": 904,
      "end_line": 915,
      "comment": "\n   * Runs custom passes that are designated to run at a particular time.\n   ",
      "child_ranges": [
        "(line 905,col 5)-(line 914,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "currentTracer"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPassName"
      ],
      "begin_line": 918,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.startPass(java.lang.String)",
      "begin_line": 923,
      "end_line": 927,
      "comment": "\n   * Marks the beginning of a pass.\n   ",
      "child_ranges": [
        "(line 924,col 5)-(line 924,col 52)",
        "(line 925,col 5)-(line 925,col 31)",
        "(line 926,col 5)-(line 926,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.endPass()",
      "begin_line": 932,
      "end_line": 941,
      "comment": "\n   * Marks the end of a pass.\n   ",
      "child_ranges": [
        "(line 933,col 5)-(line 934,col 59)",
        "(line 935,col 5)-(line 935,col 47)",
        "(line 936,col 5)-(line 936,col 41)",
        "(line 937,col 5)-(line 937,col 27)",
        "(line 938,col 5)-(line 938,col 25)",
        "(line 940,col 5)-(line 940,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newTracer(java.lang.String)",
      "begin_line": 946,
      "end_line": 953,
      "comment": "\n   * Returns a new tracer for the given pass name.\n   ",
      "child_ranges": [
        "(line 947,col 5)-(line 948,col 76)",
        "(line 949,col 5)-(line 951,col 5)",
        "(line 952,col 5)-(line 952,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.stopTracer(com.google.javascript.jscomp.Tracer, java.lang.String)",
      "begin_line": 955,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 956,col 5)-(line 956,col 27)",
        "(line 957,col 5)-(line 959,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getResult()",
      "begin_line": 965,
      "end_line": 971,
      "comment": "\n   * Returns the result of the compilation.\n   ",
      "child_ranges": [
        "(line 966,col 5)-(line 966,col 68)",
        "(line 967,col 5)-(line 970,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getMessages()",
      "begin_line": 976,
      "end_line": 978,
      "comment": "\n   * Returns an array constructed from errors + temporary warnings.\n   ",
      "child_ranges": [
        "(line 977,col 5)-(line 977,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrors()",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n   * Returns the array of errors (never null).\n   ",
      "child_ranges": [
        "(line 984,col 5)-(line 984,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getWarnings()",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\n   * Returns the array of warnings (never null).\n   ",
      "child_ranges": [
        "(line 991,col 5)-(line 991,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getRoot()",
      "begin_line": 994,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 996,col 5)-(line 996,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.nextUniqueNameId()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\n   * Creates a new id for making unique names.\n   ",
      "child_ranges": [
        "(line 1003,col 5)-(line 1003,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.resetUniqueNameId()",
      "begin_line": 1009,
      "end_line": 1012,
      "comment": "\n   * Resets the unique name id counter\n   ",
      "child_ranges": [
        "(line 1011,col 5)-(line 1011,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getUniqueNameIdSupplier()",
      "begin_line": 1014,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1016,col 5)-(line 1016,col 31)",
        "(line 1017,col 5)-(line 1022,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-12531d7a-1fda-4d82-a805-061ff24cc8bd.get()",
      "begin_line": 1018,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1025,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1027,col 5)-(line 1034,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInput(com.google.javascript.rhino.InputId)",
      "begin_line": 1044,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 5)-(line 1046,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeExternInput(com.google.javascript.rhino.InputId)",
      "begin_line": 1053,
      "end_line": 1065,
      "comment": "\n   * Removes an input file from AST.\n   * @param id The id of the input to be removed.\n   ",
      "child_ranges": [
        "(line 1054,col 5)-(line 1054,col 39)",
        "(line 1055,col 5)-(line 1057,col 5)",
        "(line 1058,col 5)-(line 1058,col 91)",
        "(line 1059,col 5)-(line 1059,col 26)",
        "(line 1060,col 5)-(line 1060,col 26)",
        "(line 1061,col 5)-(line 1061,col 39)",
        "(line 1062,col 5)-(line 1064,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newExternInput(java.lang.String)",
      "begin_line": 1067,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 5)-(line 1069,col 43)",
        "(line 1070,col 5)-(line 1072,col 5)",
        "(line 1073,col 5)-(line 1073,col 55)",
        "(line 1074,col 5)-(line 1074,col 48)",
        "(line 1075,col 5)-(line 1075,col 54)",
        "(line 1076,col 5)-(line 1076,col 26)",
        "(line 1077,col 5)-(line 1077,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.putCompilerInput(com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 1080,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 5)-(line 1081,col 28)",
        "(line 1082,col 5)-(line 1082,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addIncrementalSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1086,
      "end_line": 1090,
      "comment": " Add a source input dynamically. Intended for incremental compilation. ",
      "child_ranges": [
        "(line 1087,col 5)-(line 1087,col 34)",
        "(line 1088,col 5)-(line 1088,col 89)",
        "(line 1089,col 5)-(line 1089,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.replaceIncrementalSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1101,
      "end_line": 1133,
      "comment": "\n   * Replace a source input dynamically. Intended for incremental\n   * re-compilation.\n   *\n   * If the new source input doesn\u0027t parse, then keep the old input\n   * in the AST and return false.\n   *\n   * @return Whether the new AST was attached successfully.\n   ",
      "child_ranges": [
        "(line 1102,col 5)-(line 1102,col 56)",
        "(line 1103,col 5)-(line 1103,col 98)",
        "(line 1104,col 5)-(line 1104,col 40)",
        "(line 1105,col 5)-(line 1107,col 5)",
        "(line 1109,col 5)-(line 1109,col 45)",
        "(line 1110,col 5)-(line 1114,col 5)",
        "(line 1116,col 5)-(line 1116,col 52)",
        "(line 1117,col 5)-(line 1117,col 49)",
        "(line 1119,col 5)-(line 1119,col 43)",
        "(line 1120,col 5)-(line 1123,col 5)",
        "(line 1126,col 5)-(line 1127,col 61)",
        "(line 1128,col 5)-(line 1128,col 66)",
        "(line 1129,col 5)-(line 1129,col 73)",
        "(line 1131,col 5)-(line 1131,col 28)",
        "(line 1132,col 5)-(line 1132,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addNewSourceAst(com.google.javascript.jscomp.JsAst)",
      "begin_line": 1145,
      "end_line": 1169,
      "comment": "\n   * Add a new source input dynamically. Intended for incremental compilation.\n   * \u003cp\u003e\n   * If the new source input doesn\u0027t parse, it will not be added, and a false\n   * will be returned.\n   *\n   * @param ast the JS Source to add.\n   * @return true if the source was added successfully, false otherwise.\n   * @throws IllegalStateException if an input for this ast already exists.\n   ",
      "child_ranges": [
        "(line 1146,col 5)-(line 1146,col 56)",
        "(line 1147,col 5)-(line 1150,col 5)",
        "(line 1151,col 5)-(line 1151,col 40)",
        "(line 1152,col 5)-(line 1154,col 5)",
        "(line 1156,col 5)-(line 1156,col 53)",
        "(line 1158,col 5)-(line 1158,col 52)",
        "(line 1161,col 5)-(line 1164,col 5)",
        "(line 1166,col 5)-(line 1166,col 49)",
        "(line 1168,col 5)-(line 1168,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getModuleGraph()",
      "begin_line": 1171,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1173,col 5)-(line 1173,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDegenerateModuleGraph()",
      "begin_line": 1180,
      "end_line": 1182,
      "comment": "\n   * Gets a module graph. This will always return a module graph, even\n   * in the degenerate case when there\u0027s only one module.\n   ",
      "child_ranges": [
        "(line 1181,col 5)-(line 1181,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypeRegistry()",
      "begin_line": 1184,
      "end_line": 1190,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 5)-(line 1188,col 5)",
        "(line 1189,col 5)-(line 1189,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypedScopeCreator()",
      "begin_line": 1192,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 5)-(line 1194,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.ensureDefaultPassConfig()",
      "begin_line": 1197,
      "end_line": 1203,
      "comment": "",
      "child_ranges": [
        "(line 1199,col 5)-(line 1199,col 60)",
        "(line 1200,col 5)-(line 1201,col 73)",
        "(line 1202,col 5)-(line 1202,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.buildKnownSymbolTable()",
      "begin_line": 1205,
      "end_line": 1241,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 5)-(line 1206,col 65)",
        "(line 1208,col 5)-(line 1208,col 68)",
        "(line 1209,col 5)-(line 1214,col 5)",
        "(line 1216,col 5)-(line 1217,col 55)",
        "(line 1218,col 5)-(line 1220,col 5)",
        "(line 1222,col 5)-(line 1224,col 67)",
        "(line 1225,col 5)-(line 1225,col 58)",
        "(line 1226,col 5)-(line 1226,col 45)",
        "(line 1228,col 5)-(line 1229,col 63)",
        "(line 1230,col 5)-(line 1232,col 5)",
        "(line 1234,col 5)-(line 1234,col 42)",
        "(line 1235,col 5)-(line 1235,col 37)",
        "(line 1236,col 5)-(line 1236,col 62)",
        "(line 1237,col 5)-(line 1237,col 63)",
        "(line 1238,col 5)-(line 1238,col 57)",
        "(line 1240,col 5)-(line 1240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTopScope()",
      "begin_line": 1243,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1245,col 5)-(line 1245,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReverseAbstractInterpreter()",
      "begin_line": 1248,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1250,col 5)-(line 1260,col 5)",
        "(line 1261,col 5)-(line 1261,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getTypeValidator()",
      "begin_line": 1264,
      "end_line": 1270,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 5)-(line 1268,col 5)",
        "(line 1269,col 5)-(line 1269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseInputs()",
      "begin_line": 1282,
      "end_line": 1404,
      "comment": "\n   * Parses the externs and main inputs.\n   *\n   * @return A synthetic root node whose two children are the externs root\n   *     and the main root\n   ",
      "child_ranges": [
        "(line 1283,col 5)-(line 1283,col 53)",
        "(line 1287,col 5)-(line 1289,col 5)",
        "(line 1290,col 5)-(line 1292,col 5)",
        "(line 1295,col 5)-(line 1295,col 24)",
        "(line 1296,col 5)-(line 1296,col 37)",
        "(line 1298,col 5)-(line 1298,col 29)",
        "(line 1299,col 5)-(line 1299,col 42)",
        "(line 1301,col 5)-(line 1301,col 52)",
        "(line 1302,col 5)-(line 1302,col 46)",
        "(line 1304,col 5)-(line 1307,col 5)",
        "(line 1309,col 5)-(line 1309,col 45)",
        "(line 1311,col 5)-(line 1403,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hoistExterns(com.google.javascript.rhino.Node)",
      "begin_line": 1409,
      "end_line": 1445,
      "comment": "\n   * Hoists inputs with the @externs annotation into the externs list.\n   ",
      "child_ranges": [
        "(line 1410,col 5)-(line 1410,col 32)",
        "(line 1411,col 5)-(line 1440,col 5)",
        "(line 1442,col 5)-(line 1444,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hoistNoCompileFiles()",
      "begin_line": 1450,
      "end_line": 1470,
      "comment": "\n   * Hoists inputs with the @nocompiler annotation out of the inputs.\n   ",
      "child_ranges": [
        "(line 1451,col 5)-(line 1451,col 32)",
        "(line 1452,col 5)-(line 1465,col 5)",
        "(line 1467,col 5)-(line 1469,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.repartitionInputs()",
      "begin_line": 1472,
      "end_line": 1475,
      "comment": "",
      "child_ranges": [
        "(line 1473,col 5)-(line 1473,col 30)",
        "(line 1474,col 5)-(line 1474,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processAMDAndCommonJSModules()",
      "begin_line": 1482,
      "end_line": 1548,
      "comment": "\n   * Transforms AMD and CJS modules to something closure compiler can\n   * process and creates JSModules and the corresponding dependency tree\n   * on the way.\n   ",
      "child_ranges": [
        "(line 1483,col 5)-(line 1483,col 66)",
        "(line 1484,col 5)-(line 1484,col 74)",
        "(line 1489,col 5)-(line 1508,col 5)",
        "(line 1509,col 5)-(line 1547,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parse(com.google.javascript.jscomp.SourceFile)",
      "begin_line": 1550,
      "end_line": 1554,
      "comment": "",
      "child_ranges": [
        "(line 1551,col 5)-(line 1551,col 35)",
        "(line 1552,col 5)-(line 1552,col 48)",
        "(line 1553,col 5)-(line 1553,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "syntheticCodeId"
      ],
      "begin_line": 1556,
      "end_line": 1556,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseSyntheticCode(java.lang.String)",
      "begin_line": 1558,
      "end_line": 1564,
      "comment": "",
      "child_ranges": [
        "(line 1560,col 5)-(line 1561,col 78)",
        "(line 1562,col 5)-(line 1562,col 48)",
        "(line 1563,col 5)-(line 1563,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.newCompilerOptions()",
      "begin_line": 1569,
      "end_line": 1571,
      "comment": "\n   * Allow subclasses to override the default CompileOptions object.\n   ",
      "child_ranges": [
        "(line 1570,col 5)-(line 1570,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.initCompilerOptionsIfTesting()",
      "begin_line": 1573,
      "end_line": 1579,
      "comment": "",
      "child_ranges": [
        "(line 1574,col 5)-(line 1578,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseSyntheticCode(java.lang.String, java.lang.String)",
      "begin_line": 1581,
      "end_line": 1585,
      "comment": "",
      "child_ranges": [
        "(line 1583,col 5)-(line 1583,col 35)",
        "(line 1584,col 5)-(line 1584,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.parseTestCode(java.lang.String)",
      "begin_line": 1587,
      "end_line": 1597,
      "comment": "",
      "child_ranges": [
        "(line 1589,col 5)-(line 1589,col 35)",
        "(line 1590,col 5)-(line 1591,col 47)",
        "(line 1592,col 5)-(line 1594,col 5)",
        "(line 1595,col 5)-(line 1595,col 48)",
        "(line 1596,col 5)-(line 1596,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDefaultErrorReporter()",
      "begin_line": 1599,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1601,col 5)-(line 1601,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource()",
      "begin_line": 1611,
      "end_line": 1632,
      "comment": "\n   * Converts the main parse tree back to JS code.\n   ",
      "child_ranges": [
        "(line 1612,col 5)-(line 1631,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-410481e3-b23f-4779-9d75-986de6a03f95.call()",
      "begin_line": 1613,
      "end_line": 1630,
      "comment": "",
      "child_ranges": [
        "(line 1615,col 9)-(line 1615,col 46)",
        "(line 1616,col 9)-(line 1629,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSourceArray()",
      "begin_line": 1637,
      "end_line": 1658,
      "comment": "\n   * Converts the parse tree for each input back to JS code.\n   ",
      "child_ranges": [
        "(line 1638,col 5)-(line 1657,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-35d14782-d52a-4bab-9c85-5bdd79afce6b.call()",
      "begin_line": 1639,
      "end_line": 1656,
      "comment": "",
      "child_ranges": [
        "(line 1641,col 9)-(line 1641,col 51)",
        "(line 1642,col 9)-(line 1655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.jscomp.JSModule)",
      "begin_line": 1663,
      "end_line": 1684,
      "comment": "\n   * Converts the parse tree for a module back to JS code.\n   ",
      "child_ranges": [
        "(line 1664,col 5)-(line 1683,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-e34fb99e-5d5c-4882-a1e6-42dcea8fc9ab.call()",
      "begin_line": 1665,
      "end_line": 1682,
      "comment": "",
      "child_ranges": [
        "(line 1667,col 9)-(line 1667,col 56)",
        "(line 1668,col 9)-(line 1668,col 38)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1672,col 43)",
        "(line 1673,col 9)-(line 1680,col 9)",
        "(line 1681,col 9)-(line 1681,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSourceArray(com.google.javascript.jscomp.JSModule)",
      "begin_line": 1690,
      "end_line": 1716,
      "comment": "\n   * Converts the parse tree for each input in a module back to JS code.\n   ",
      "child_ranges": [
        "(line 1691,col 5)-(line 1715,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-6d2dc489-d4cc-44d8-a67f-585fa8713e7d.call()",
      "begin_line": 1692,
      "end_line": 1714,
      "comment": "",
      "child_ranges": [
        "(line 1694,col 9)-(line 1694,col 56)",
        "(line 1695,col 9)-(line 1695,col 38)",
        "(line 1696,col 9)-(line 1698,col 9)",
        "(line 1700,col 9)-(line 1700,col 49)",
        "(line 1701,col 9)-(line 1701,col 43)",
        "(line 1702,col 9)-(line 1712,col 9)",
        "(line 1713,col 9)-(line 1713,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.jscomp.Compiler.CodeBuilder, int, com.google.javascript.rhino.Node)",
      "begin_line": 1725,
      "end_line": 1787,
      "comment": "\n   * Writes out JS code from a root node. If printing input delimiters, this\n   * method will attach a comment to the start of the text indicating which\n   * input the output derived from. If there were any preserve annotations\n   * within the root\u0027s source, they will also be printed in a block comment\n   * at the beginning of the output.\n   ",
      "child_ranges": [
        "(line 1728,col 5)-(line 1786,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.Anonymous-7f2a92e5-8752-4211-9e5b-e00f37cb0ef8.call()",
      "begin_line": 1729,
      "end_line": 1785,
      "comment": "",
      "child_ranges": [
        "(line 1731,col 9)-(line 1750,col 9)",
        "(line 1751,col 9)-(line 1756,col 9)",
        "(line 1760,col 9)-(line 1763,col 9)",
        "(line 1767,col 9)-(line 1767,col 66)",
        "(line 1768,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1784,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.rhino.Node)",
      "begin_line": 1793,
      "end_line": 1797,
      "comment": "\n   * Generates JavaScript source code for an AST, doesn\u0027t generate source\n   * map info.\n   ",
      "child_ranges": [
        "(line 1795,col 5)-(line 1795,col 35)",
        "(line 1796,col 5)-(line 1796,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.SourceMap, boolean)",
      "begin_line": 1802,
      "end_line": 1809,
      "comment": "\n   * Generates JavaScript source code for an AST.\n   ",
      "child_ranges": [
        "(line 1803,col 5)-(line 1803,col 61)",
        "(line 1804,col 5)-(line 1804,col 40)",
        "(line 1805,col 5)-(line 1805,col 36)",
        "(line 1806,col 5)-(line 1807,col 69)",
        "(line 1808,col 5)-(line 1808,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CodeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1815,
      "end_line": 1873,
      "comment": "\n   * Stores a buffer of text to which more can be appended.  This is just like a\n   * StringBuilder except that we also track the number of lines.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sb"
      ],
      "begin_line": 1816,
      "end_line": 1816,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineCount"
      ],
      "begin_line": 1817,
      "end_line": 1817,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colCount"
      ],
      "begin_line": 1818,
      "end_line": 1818,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.reset()",
      "begin_line": 1821,
      "end_line": 1823,
      "comment": " Removes all text, but leaves the line count unchanged. ",
      "child_ranges": [
        "(line 1822,col 7)-(line 1822,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.append(java.lang.String)",
      "begin_line": 1826,
      "end_line": 1845,
      "comment": " Appends the given string to the text buffer. ",
      "child_ranges": [
        "(line 1827,col 7)-(line 1827,col 21)",
        "(line 1830,col 7)-(line 1830,col 21)",
        "(line 1831,col 7)-(line 1831,col 28)",
        "(line 1832,col 7)-(line 1835,col 7)",
        "(line 1837,col 7)-(line 1842,col 7)",
        "(line 1844,col 7)-(line 1844,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.toString()",
      "begin_line": 1848,
      "end_line": 1851,
      "comment": " Returns all text in the text buffer. ",
      "child_ranges": [
        "(line 1850,col 7)-(line 1850,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getLength()",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": " Returns the length of the text buffer. ",
      "child_ranges": [
        "(line 1855,col 7)-(line 1855,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getLineIndex()",
      "begin_line": 1859,
      "end_line": 1861,
      "comment": " Returns the (zero-based) index of the last line in the text buffer. ",
      "child_ranges": [
        "(line 1860,col 7)-(line 1860,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.getColumnIndex()",
      "begin_line": 1864,
      "end_line": 1866,
      "comment": " Returns the (zero-based) index of the last column in the text buffer. ",
      "child_ranges": [
        "(line 1865,col 7)-(line 1865,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.CodeBuilder.endsWith(java.lang.String)",
      "begin_line": 1869,
      "end_line": 1872,
      "comment": " Determines whether the text ends with the given suffix. ",
      "child_ranges": [
        "(line 1870,col 7)-(line 1871,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.optimize()",
      "begin_line": 1879,
      "end_line": 1893,
      "comment": "",
      "child_ranges": [
        "(line 1885,col 5)-(line 1885,col 16)",
        "(line 1887,col 5)-(line 1887,col 76)",
        "(line 1888,col 5)-(line 1890,col 5)",
        "(line 1891,col 5)-(line 1891,col 63)",
        "(line 1892,col 5)-(line 1892,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 1895,
      "end_line": 1898,
      "comment": "",
      "child_ranges": [
        "(line 1897,col 5)-(line 1897,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCssRenamingMap()",
      "begin_line": 1900,
      "end_line": 1903,
      "comment": "",
      "child_ranges": [
        "(line 1902,col 5)-(line 1902,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processDefines()",
      "begin_line": 1912,
      "end_line": 1915,
      "comment": "\n   * Reprocesses the current defines over the AST.  This is used by GwtCompiler\n   * to generate N outputs for different targets from the same (checked) AST.\n   * For each target, we apply the target-specific defines by calling\n   * {@code processDefines} and then {@code optimize} to optimize the AST\n   * specifically for that target.\n   ",
      "child_ranges": [
        "(line 1913,col 5)-(line 1914,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isInliningForbidden()",
      "begin_line": 1917,
      "end_line": 1921,
      "comment": "",
      "child_ranges": [
        "(line 1918,col 5)-(line 1920,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.computeCFG()",
      "begin_line": 1924,
      "end_line": 1931,
      "comment": " Control Flow Analysis. ",
      "child_ranges": [
        "(line 1925,col 5)-(line 1925,col 48)",
        "(line 1926,col 5)-(line 1926,col 44)",
        "(line 1927,col 5)-(line 1927,col 73)",
        "(line 1928,col 5)-(line 1928,col 17)",
        "(line 1929,col 5)-(line 1929,col 37)",
        "(line 1930,col 5)-(line 1930,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.normalize()",
      "begin_line": 1933,
      "end_line": 1938,
      "comment": "",
      "child_ranges": [
        "(line 1934,col 5)-(line 1934,col 31)",
        "(line 1935,col 5)-(line 1935,col 27)",
        "(line 1936,col 5)-(line 1936,col 40)",
        "(line 1937,col 5)-(line 1937,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.prepareAst(com.google.javascript.rhino.Node)",
      "begin_line": 1940,
      "end_line": 1944,
      "comment": "",
      "child_ranges": [
        "(line 1942,col 5)-(line 1942,col 45)",
        "(line 1943,col 5)-(line 1943,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.recordFunctionInformation()",
      "begin_line": 1946,
      "end_line": 1955,
      "comment": "",
      "child_ranges": [
        "(line 1947,col 5)-(line 1947,col 50)",
        "(line 1948,col 5)-(line 1948,col 43)",
        "(line 1949,col 5)-(line 1951,col 72)",
        "(line 1952,col 5)-(line 1952,col 36)",
        "(line 1953,col 5)-(line 1953,col 61)",
        "(line 1954,col 5)-(line 1954,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recentChange"
      ],
      "begin_line": 1957,
      "end_line": 1958,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeChangeHandlers"
      ],
      "begin_line": 1959,
      "end_line": 1960,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SYNTHETIC_EXTERNS"
      ],
      "begin_line": 1963,
      "end_line": 1963,
      "comment": " Name of the synthetic input that holds synthesized externs. "
    },
    {
      "type": "field",
      "varNames": [
        "synthesizedExternsInput"
      ],
      "begin_line": 1965,
      "end_line": 1965,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 1967,
      "end_line": 1970,
      "comment": "",
      "child_ranges": [
        "(line 1969,col 5)-(line 1969,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeChangeHandler(com.google.javascript.jscomp.CodeChangeHandler)",
      "begin_line": 1972,
      "end_line": 1975,
      "comment": "",
      "child_ranges": [
        "(line 1974,col 5)-(line 1974,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.reportCodeChange()",
      "begin_line": 1982,
      "end_line": 1987,
      "comment": "\n   * All passes should call reportCodeChange() when they alter\n   * the JS tree structure. This is verified by CompilerTestCase.\n   * This allows us to optimize to a fixed point.\n   ",
      "child_ranges": [
        "(line 1984,col 5)-(line 1986,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCodingConvention()",
      "begin_line": 1989,
      "end_line": 1994,
      "comment": "",
      "child_ranges": [
        "(line 1991,col 5)-(line 1991,col 64)",
        "(line 1992,col 5)-(line 1992,col 75)",
        "(line 1993,col 5)-(line 1993,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isIdeMode()",
      "begin_line": 1996,
      "end_line": 1999,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.acceptEcmaScript5()",
      "begin_line": 2001,
      "end_line": 2009,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 5)-(line 2007,col 5)",
        "(line 2008,col 5)-(line 2008,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.languageMode()",
      "begin_line": 2011,
      "end_line": 2013,
      "comment": "",
      "child_ranges": [
        "(line 2012,col 5)-(line 2012,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.acceptConstKeyword()",
      "begin_line": 2015,
      "end_line": 2018,
      "comment": "",
      "child_ranges": [
        "(line 2017,col 5)-(line 2017,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getParserConfig()",
      "begin_line": 2020,
      "end_line": 2045,
      "comment": "",
      "child_ranges": [
        "(line 2022,col 5)-(line 2043,col 5)",
        "(line 2044,col 5)-(line 2044,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.isTypeCheckingEnabled()",
      "begin_line": 2047,
      "end_line": 2050,
      "comment": "",
      "child_ranges": [
        "(line 2049,col 5)-(line 2049,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getDiagnosticGroups()",
      "begin_line": 2061,
      "end_line": 2063,
      "comment": "\n   * The warning classes that are available from the command-line, and\n   * are suppressible by the {@code @suppress} annotation.\n   ",
      "child_ranges": [
        "(line 2062,col 5)-(line 2062,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 2065,
      "end_line": 2081,
      "comment": "",
      "child_ranges": [
        "(line 2067,col 5)-(line 2067,col 47)",
        "(line 2068,col 5)-(line 2073,col 5)",
        "(line 2075,col 5)-(line 2080,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorLevel(com.google.javascript.jscomp.JSError)",
      "begin_line": 2083,
      "end_line": 2087,
      "comment": "",
      "child_ranges": [
        "(line 2085,col 5)-(line 2085,col 40)",
        "(line 2086,col 5)-(line 2086,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.throwInternalError(java.lang.String, java.lang.Exception)",
      "begin_line": 2092,
      "end_line": 2103,
      "comment": "\n   * Report an internal error.\n   ",
      "child_ranges": [
        "(line 2094,col 5)-(line 2096,col 48)",
        "(line 2098,col 5)-(line 2098,col 67)",
        "(line 2099,col 5)-(line 2101,col 5)",
        "(line 2102,col 5)-(line 2102,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorCount()",
      "begin_line": 2109,
      "end_line": 2111,
      "comment": "\n   * Gets the number of errors.\n   ",
      "child_ranges": [
        "(line 2110,col 5)-(line 2110,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getWarningCount()",
      "begin_line": 2116,
      "end_line": 2118,
      "comment": "\n   * Gets the number of warnings.\n   ",
      "child_ranges": [
        "(line 2117,col 5)-(line 2117,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasHaltingErrors()",
      "begin_line": 2120,
      "end_line": 2123,
      "comment": "",
      "child_ranges": [
        "(line 2122,col 5)-(line 2122,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasErrors()",
      "begin_line": 2134,
      "end_line": 2136,
      "comment": "\n   * Consults the {@link ErrorManager} to see if we\u0027ve encountered errors\n   * that should halt compilation. \u003cp\u003e\n   *\n   * If {@link CompilerOptions#ideMode} is {@code true}, this function\n   * always returns {@code false} without consulting the error manager. The\n   * error manager will continue to be told about new errors and warnings, but\n   * the compiler will complete compilation of all inputs.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 2135,col 5)-(line 2135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addToDebugLog(java.lang.String)",
      "begin_line": 2139,
      "end_line": 2144,
      "comment": " Called from the compiler passes, adds debug info ",
      "child_ranges": [
        "(line 2141,col 5)-(line 2141,col 25)",
        "(line 2142,col 5)-(line 2142,col 26)",
        "(line 2143,col 5)-(line 2143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceFileByName(java.lang.String)",
      "begin_line": 2146,
      "end_line": 2157,
      "comment": "",
      "child_ranges": [
        "(line 2150,col 5)-(line 2155,col 5)",
        "(line 2156,col 5)-(line 2156,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceLine(java.lang.String, int)",
      "begin_line": 2159,
      "end_line": 2169,
      "comment": "",
      "child_ranges": [
        "(line 2161,col 5)-(line 2163,col 5)",
        "(line 2164,col 5)-(line 2164,col 55)",
        "(line 2165,col 5)-(line 2167,col 5)",
        "(line 2168,col 5)-(line 2168,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceRegion(java.lang.String, int)",
      "begin_line": 2171,
      "end_line": 2181,
      "comment": "",
      "child_ranges": [
        "(line 2173,col 5)-(line 2175,col 5)",
        "(line 2176,col 5)-(line 2176,col 55)",
        "(line 2177,col 5)-(line 2179,col 5)",
        "(line 2180,col 5)-(line 2180,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getNodeForCodeInsertion(com.google.javascript.jscomp.JSModule)",
      "begin_line": 2187,
      "end_line": 2202,
      "comment": "",
      "child_ranges": [
        "(line 2189,col 5)-(line 2195,col 5)",
        "(line 2197,col 5)-(line 2197,col 58)",
        "(line 2198,col 5)-(line 2200,col 5)",
        "(line 2201,col 5)-(line 2201,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSourceMap()",
      "begin_line": 2204,
      "end_line": 2206,
      "comment": "",
      "child_ranges": [
        "(line 2205,col 5)-(line 2205,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getVariableMap()",
      "begin_line": 2208,
      "end_line": 2210,
      "comment": "",
      "child_ranges": [
        "(line 2209,col 5)-(line 2209,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getPropertyMap()",
      "begin_line": 2212,
      "end_line": 2214,
      "comment": "",
      "child_ranges": [
        "(line 2213,col 5)-(line 2213,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getOptions()",
      "begin_line": 2216,
      "end_line": 2218,
      "comment": "",
      "child_ranges": [
        "(line 2217,col 5)-(line 2217,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getFunctionalInformationMap()",
      "begin_line": 2220,
      "end_line": 2222,
      "comment": "",
      "child_ranges": [
        "(line 2221,col 5)-(line 2221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setLoggingLevel(java.util.logging.Level)",
      "begin_line": 2227,
      "end_line": 2229,
      "comment": "\n   * Sets the logging level for the com.google.javascript.jscomp package.\n   ",
      "child_ranges": [
        "(line 2228,col 5)-(line 2228,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getAstDotGraph()",
      "begin_line": 2232,
      "end_line": 2240,
      "comment": " Gets the DOT graph of the AST generated at the end of compilation. ",
      "child_ranges": [
        "(line 2233,col 5)-(line 2239,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getErrorManager()",
      "begin_line": 2242,
      "end_line": 2248,
      "comment": "",
      "child_ranges": [
        "(line 2244,col 5)-(line 2246,col 5)",
        "(line 2247,col 5)-(line 2247,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsInOrder()",
      "begin_line": 2250,
      "end_line": 2253,
      "comment": "",
      "child_ranges": [
        "(line 2252,col 5)-(line 2252,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsById()",
      "begin_line": 2258,
      "end_line": 2260,
      "comment": "\n   * Returns an unmodifiable view of the compiler inputs indexed by id.\n   ",
      "child_ranges": [
        "(line 2259,col 5)-(line 2259,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getExternsInOrder()",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "\n   * Gets the externs in the order in which they are being processed.\n   ",
      "child_ranges": [
        "(line 2266,col 5)-(line 2266,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntermediateState",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 2280,
      "end_line": 2294,
      "comment": "\n   * Stores the internal compiler state just before optimization is performed.\n   * This can be saved and restored in order to efficiently optimize multiple\n   * different output targets without having to perform checking multiple times.\n   *\n   * NOTE: This does not include all parts of the compiler\u0027s internal state. In\n   * particular, SourceFiles and CompilerOptions are not recorded. In\n   * order to recreate a Compiler instance from scratch, you would need to\n   * call {@code init} with the same arguments as in the initial creation before\n   * restoring intermediate state.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2281,
      "end_line": 2281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 2283,
      "end_line": 2283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsRoot"
      ],
      "begin_line": 2284,
      "end_line": 2284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 2285,
      "end_line": 2285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputs"
      ],
      "begin_line": 2286,
      "end_line": 2286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modules"
      ],
      "begin_line": 2287,
      "end_line": 2287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "passConfigState"
      ],
      "begin_line": 2288,
      "end_line": 2288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 2289,
      "end_line": 2289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lifeCycleStage"
      ],
      "begin_line": 2290,
      "end_line": 2290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injectedLibraries"
      ],
      "begin_line": 2291,
      "end_line": 2291,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Compiler.IntermediateState.IntermediateState()",
      "begin_line": 2293,
      "end_line": 2293,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getState()",
      "begin_line": 2299,
      "end_line": 2312,
      "comment": "\n   * Returns the current internal state, excluding the input files and modules.\n   ",
      "child_ranges": [
        "(line 2300,col 5)-(line 2300,col 54)",
        "(line 2301,col 5)-(line 2301,col 36)",
        "(line 2302,col 5)-(line 2302,col 26)",
        "(line 2303,col 5)-(line 2303,col 28)",
        "(line 2304,col 5)-(line 2304,col 26)",
        "(line 2305,col 5)-(line 2305,col 28)",
        "(line 2306,col 5)-(line 2306,col 67)",
        "(line 2307,col 5)-(line 2307,col 38)",
        "(line 2308,col 5)-(line 2308,col 47)",
        "(line 2309,col 5)-(line 2309,col 71)",
        "(line 2311,col 5)-(line 2311,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setState(com.google.javascript.jscomp.Compiler.IntermediateState)",
      "begin_line": 2318,
      "end_line": 2331,
      "comment": "\n   * Sets the internal state to the capture given.  Note that this assumes that\n   * the input files are already set up.\n   ",
      "child_ranges": [
        "(line 2319,col 5)-(line 2319,col 36)",
        "(line 2320,col 5)-(line 2320,col 26)",
        "(line 2321,col 5)-(line 2321,col 28)",
        "(line 2322,col 5)-(line 2322,col 26)",
        "(line 2323,col 5)-(line 2323,col 28)",
        "(line 2324,col 5)-(line 2324,col 40)",
        "(line 2325,col 5)-(line 2325,col 64)",
        "(line 2326,col 5)-(line 2326,col 38)",
        "(line 2327,col 5)-(line 2327,col 44)",
        "(line 2329,col 5)-(line 2329,col 30)",
        "(line 2330,col 5)-(line 2330,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getInputsForTesting()",
      "begin_line": 2333,
      "end_line": 2336,
      "comment": "",
      "child_ranges": [
        "(line 2335,col 5)-(line 2335,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getExternsForTesting()",
      "begin_line": 2338,
      "end_line": 2341,
      "comment": "",
      "child_ranges": [
        "(line 2340,col 5)-(line 2340,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.hasRegExpGlobalReferences()",
      "begin_line": 2343,
      "end_line": 2346,
      "comment": "",
      "child_ranges": [
        "(line 2345,col 5)-(line 2345,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setHasRegExpGlobalReferences(boolean)",
      "begin_line": 2348,
      "end_line": 2351,
      "comment": "",
      "child_ranges": [
        "(line 2350,col 5)-(line 2350,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 2353,
      "end_line": 2363,
      "comment": "",
      "child_ranges": [
        "(line 2356,col 5)-(line 2357,col 37)",
        "(line 2358,col 5)-(line 2361,col 5)",
        "(line 2362,col 5)-(line 2362,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getGlobalVarReferences()",
      "begin_line": 2365,
      "end_line": 2368,
      "comment": "",
      "child_ranges": [
        "(line 2367,col 5)-(line 2367,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getSynthesizedExternsInput()",
      "begin_line": 2370,
      "end_line": 2376,
      "comment": "",
      "child_ranges": [
        "(line 2372,col 5)-(line 2374,col 5)",
        "(line 2375,col 5)-(line 2375,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getProgress()",
      "begin_line": 2378,
      "end_line": 2381,
      "comment": "",
      "child_ranges": [
        "(line 2380,col 5)-(line 2380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getLastPassName()",
      "begin_line": 2383,
      "end_line": 2386,
      "comment": "",
      "child_ranges": [
        "(line 2385,col 5)-(line 2385,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setProgress(double, java.lang.String)",
      "begin_line": 2388,
      "end_line": 2396,
      "comment": "",
      "child_ranges": [
        "(line 2390,col 5)-(line 2390,col 33)",
        "(line 2391,col 5)-(line 2395,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.replaceScript(com.google.javascript.jscomp.JsAst)",
      "begin_line": 2405,
      "end_line": 2413,
      "comment": "\n   * Replaces one file in a hot-swap mode. The given JsAst should be made\n   * from a new version of a file that already was present in the last compile\n   * call. If the file is new, this will silently ignored.\n   *\n   * @param ast the ast of the file that is being replaced\n   ",
      "child_ranges": [
        "(line 2406,col 5)-(line 2406,col 58)",
        "(line 2407,col 5)-(line 2409,col 5)",
        "(line 2410,col 5)-(line 2410,col 47)",
        "(line 2412,col 5)-(line 2412,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.addNewScript(com.google.javascript.jscomp.JsAst)",
      "begin_line": 2422,
      "end_line": 2433,
      "comment": "\n   * Adds a new Script AST to the compile state. If a script for the same file\n   * already exists the script will not be added, instead a call to\n   * #replaceScript should be used.\n   *\n   * @param ast the ast of the new file\n   ",
      "child_ranges": [
        "(line 2423,col 5)-(line 2425,col 5)",
        "(line 2426,col 5)-(line 2426,col 46)",
        "(line 2427,col 5)-(line 2427,col 39)",
        "(line 2428,col 5)-(line 2428,col 36)",
        "(line 2429,col 5)-(line 2430,col 54)",
        "(line 2432,col 5)-(line 2432,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.processNewScript(com.google.javascript.jscomp.JsAst, com.google.javascript.rhino.Node)",
      "begin_line": 2435,
      "end_line": 2448,
      "comment": "",
      "child_ranges": [
        "(line 2436,col 5)-(line 2436,col 35)",
        "(line 2437,col 5)-(line 2437,col 35)",
        "(line 2439,col 5)-(line 2439,col 62)",
        "(line 2442,col 5)-(line 2442,col 79)",
        "(line 2444,col 5)-(line 2444,col 45)",
        "(line 2445,col 5)-(line 2445,col 36)",
        "(line 2447,col 5)-(line 2447,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runHotSwap(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PassConfig)",
      "begin_line": 2453,
      "end_line": 2458,
      "comment": "\n   * Execute the passes from a PassConfig instance over a single replaced file.\n   ",
      "child_ranges": [
        "(line 2455,col 5)-(line 2457,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.runHotSwapPass(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PassFactory)",
      "begin_line": 2460,
      "end_line": 2467,
      "comment": "",
      "child_ranges": [
        "(line 2462,col 5)-(line 2462,col 64)",
        "(line 2463,col 5)-(line 2466,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getCleanupPassConfig()",
      "begin_line": 2469,
      "end_line": 2471,
      "comment": "",
      "child_ranges": [
        "(line 2470,col 5)-(line 2470,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.removeSyntheticVarsInput()",
      "begin_line": 2473,
      "end_line": 2476,
      "comment": "",
      "child_ranges": [
        "(line 2474,col 5)-(line 2474,col 51)",
        "(line 2475,col 5)-(line 2475,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.ensureLibraryInjected(java.lang.String)",
      "begin_line": 2478,
      "end_line": 2504,
      "comment": "",
      "child_ranges": [
        "(line 2480,col 5)-(line 2482,col 5)",
        "(line 2485,col 5)-(line 2485,col 49)",
        "(line 2486,col 5)-(line 2488,col 5)",
        "(line 2490,col 5)-(line 2490,col 69)",
        "(line 2491,col 5)-(line 2491,col 49)",
        "(line 2493,col 5)-(line 2493,col 48)",
        "(line 2494,col 5)-(line 2499,col 5)",
        "(line 2500,col 5)-(line 2500,col 23)",
        "(line 2502,col 5)-(line 2502,col 51)",
        "(line 2503,col 5)-(line 2503,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.loadLibraryCode(java.lang.String)",
      "begin_line": 2507,
      "end_line": 2522,
      "comment": " Load a library as a resource ",
      "child_ranges": [
        "(line 2509,col 5)-(line 2509,col 24)",
        "(line 2510,col 5)-(line 2517,col 5)",
        "(line 2519,col 5)-(line 2521,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReleaseVersion()",
      "begin_line": 2525,
      "end_line": 2528,
      "comment": " Returns the compiler version baked into the jar. ",
      "child_ranges": [
        "(line 2526,col 5)-(line 2526,col 70)",
        "(line 2527,col 5)-(line 2527,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getReleaseDate()",
      "begin_line": 2531,
      "end_line": 2534,
      "comment": " Returns the compiler date baked into the jar. ",
      "child_ranges": [
        "(line 2532,col 5)-(line 2532,col 70)",
        "(line 2533,col 5)-(line 2533,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.setOldParseTree(java.lang.String, com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 2541,
      "end_line": 2542,
      "comment": "\n   * Stores the old parse tree for a given source file.\n   * @param sourceName\n   * @param oldAst\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Compiler.getOldParseTreeByName(java.lang.String)",
      "begin_line": 2549,
      "end_line": 2551,
      "comment": "\n   * Gets an old format parse tree for a given source file.\n   * @param sourceName\n   * @return\n   ",
      "child_ranges": [
        "(line 2550,col 5)-(line 2550,col 16)"
      ]
    }
  ]
}