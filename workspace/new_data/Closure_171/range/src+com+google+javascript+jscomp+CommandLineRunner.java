{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CommandLineRunner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineRunner",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractCommandLineRunner\u003ccom.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CompilerOptions\u003e"
      ],
      "begin_line": 90,
      "end_line": 979,
      "comment": "\n * CommandLineRunner translates flags into Java API calls on the Compiler.\n *\n * This class may be extended and used to create other Java classes\n * that behave the same as running the Compiler from the command line. If you\n * want to run the compiler in-process in Java, you should look at this class\n * for hints on what API calls to make, but you should not use this class\n * directly.\n *\n * Example:\n * \u003cpre\u003e\n * class MyCommandLineRunner extends CommandLineRunner {\n *   MyCommandLineRunner(String[] args) {\n *     super(args);\n *   }\n *\n *   {@code @Override} protected CompilerOptions createOptions() {\n *     CompilerOptions options \u003d super.createOptions();\n *     addMyCrazyCompilerPassThatOutputsAnExtraFile(options);\n *     return options;\n *   }\n *\n *   public static void main(String[] args) {\n *     MyCommandLineRunner runner \u003d new MyCommandLineRunner(args);\n *     if (runner.shouldRunCompiler()) {\n *       runner.run();\n *     } else {\n *       System.exit(-1);\n *     }\n *   }\n * }\n * \u003c/pre\u003e\n *\n * This class is totally not thread-safe.\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "class_interface",
      "name": "GuardLevel",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.GuardLevel.GuardLevel(java.lang.String, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 7)-(line 96,col 23)",
        "(line 97,col 7)-(line 97,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Flags",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 102,
      "end_line": 570,
      "comment": " I don\u0027t really care about unchecked warnings in this class."
    },
    {
      "type": "field",
      "varNames": [
        "guardLevels"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "displayHelp"
      ],
      "begin_line": 106,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printTree"
      ],
      "begin_line": 111,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printAst"
      ],
      "begin_line": 116,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "printPassGraph"
      ],
      "begin_line": 122,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jscompDevMode"
      ],
      "begin_line": 130,
      "end_line": 134,
      "comment": " compiler."
    },
    {
      "type": "field",
      "varNames": [
        "loggingLevel"
      ],
      "begin_line": 136,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 142,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "js"
      ],
      "begin_line": 147,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jsOutputFile"
      ],
      "begin_line": 151,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 156,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variableMapInputFile"
      ],
      "begin_line": 167,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapInputFile"
      ],
      "begin_line": 172,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "variableMapOutputFile"
      ],
      "begin_line": 177,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createNameMapFiles"
      ],
      "begin_line": 182,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyMapOutputFile"
      ],
      "begin_line": 191,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thirdParty"
      ],
      "begin_line": 196,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 202,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputWrapper"
      ],
      "begin_line": 210,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleWrapper"
      ],
      "begin_line": 216,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleOutputPathPrefix"
      ],
      "begin_line": 224,
      "end_line": 228,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createSourceMap"
      ],
      "begin_line": 230,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 238,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "jscompError"
      ],
      "begin_line": 244,
      "end_line": 249,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "jscompWarning"
      ],
      "begin_line": 252,
      "end_line": 257,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "jscompOff"
      ],
      "begin_line": 260,
      "end_line": 265,
      "comment": " Used to define the flag, values are stored by the handler."
    },
    {
      "type": "field",
      "varNames": [
        "define"
      ],
      "begin_line": 267,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 276,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilationLevel"
      ],
      "begin_line": 281,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useTypesForOptimization"
      ],
      "begin_line": 287,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningLevel"
      ],
      "begin_line": 293,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useOnlyCustomExterns"
      ],
      "begin_line": 298,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "debug"
      ],
      "begin_line": 303,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 308,
      "end_line": 311,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "formatting"
      ],
      "begin_line": 313,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "processCommonJsModules"
      ],
      "begin_line": 319,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commonJsPathPrefix"
      ],
      "begin_line": 323,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "commonJsEntryModule"
      ],
      "begin_line": 328,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformAmdModules"
      ],
      "begin_line": 333,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "processClosurePrimitives"
      ],
      "begin_line": 337,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "manageClosureDependencies"
      ],
      "begin_line": 343,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "onlyClosureDependencies"
      ],
      "begin_line": 352,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closureEntryPoint"
      ],
      "begin_line": 360,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "processJqueryPrimitives"
      ],
      "begin_line": 370,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "angularPass"
      ],
      "begin_line": 376,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputManifest"
      ],
      "begin_line": 382,
      "end_line": 389,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputModuleDependencies"
      ],
      "begin_line": 391,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 395,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 399,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 404,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "translationsFile"
      ],
      "begin_line": 409,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "translationsProject"
      ],
      "begin_line": 413,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flagFile"
      ],
      "begin_line": 419,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningsWhitelistFile"
      ],
      "begin_line": 423,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extraAnnotationName"
      ],
      "begin_line": 429,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 433,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.getJsFiles()",
      "begin_line": 455,
      "end_line": 461,
      "comment": "\n     * Users may specify JS inputs via the legacy {@code --js} option, as well\n     * as via additional arguments to the Closure Compiler. For example, it is\n     * convenient to leverage the additional arguments feature when using the\n     * Closure Compiler in combination with {@code find} and {@code xargs}:\n     * \u003cpre\u003e\n     * find MY_JS_SRC_DIR -name \u0027*.js\u0027 \\\n     *     | xargs java -jar compiler.jar --manage_closure_dependencies\n     * \u003c/pre\u003e\n     * The {@code find} command will produce a list of \u0027*.js\u0027 source files in\n     * the {@code MY_JS_SRC_DIR} directory while {@code xargs} will convert them\n     * to a single, space-delimited set of arguments that are appended to the\n     * {@code java} command to run the Compiler.\n     * \u003cp\u003e\n     * Note that it is important to use the\n     * {@code --manage_closure_dependencies} option in this case because the\n     * order produced by {@code find} is unlikely to be sorted correctly with\n     * respect to {@code goog.provide()} and {@code goog.requires()}.\n     ",
      "child_ranges": [
        "(line 456,col 7)-(line 457,col 40)",
        "(line 458,col 7)-(line 458,col 29)",
        "(line 459,col 7)-(line 459,col 36)",
        "(line 460,col 7)-(line 460,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.OptionHandler\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 465,
      "end_line": 507,
      "comment": " It needs to be public because of the crazy reflection that args4j does."
    },
    {
      "type": "field",
      "varNames": [
        "TRUES"
      ],
      "begin_line": 466,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FALSES"
      ],
      "begin_line": 468,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.BooleanOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.Boolean\u003e)",
      "begin_line": 471,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.parseArguments(org.kohsuke.args4j.spi.Parameters)",
      "begin_line": 477,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 28)",
        "(line 480,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.BooleanOptionHandler.getDefaultMetaVariable()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardErrorOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 511,
      "end_line": 518,
      "comment": " of the flags."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardErrorOptionHandler.WarningGuardErrorOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 513,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardWarningOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 520,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardWarningOptionHandler.WarningGuardWarningOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 522,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 525,col 9)-(line 526,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardOffOptionHandler",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.StringOptionHandler"
      ],
      "begin_line": 530,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardOffOptionHandler.WarningGuardOffOptionHandler(org.kohsuke.args4j.CmdLineParser, org.kohsuke.args4j.OptionDef, org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e)",
      "begin_line": 532,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WarningGuardSetter",
      "is_interface": false,
      "parent_types": [
        "org.kohsuke.args4j.spi.Setter\u003cjava.lang.String\u003e"
      ],
      "begin_line": 539,
      "end_line": 561,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.WarningGuardSetter(org.kohsuke.args4j.spi.Setter\u003c? super java.lang.String\u003e, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 543,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 27)",
        "(line 546,col 9)-(line 546,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.isMultiValued()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.getType()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.WarningGuardSetter.addValue(java.lang.String)",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 30)",
        "(line 559,col 9)-(line 559,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.Flags.getWarningGuardSpec()",
      "begin_line": 563,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 564,col 7)-(line 564,col 53)",
        "(line 565,col 7)-(line 567,col 7)",
        "(line 568,col 7)-(line 568,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.FormattingOption.applyToOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 581,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 582,col 7)-(line 594,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConfigValid"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.CommandLineRunner(java.lang.String[])",
      "begin_line": 607,
      "end_line": 610,
      "comment": "\n   * Create a new command-line runner. You should only need to call\n   * the constructor if you\u0027re extending this class. Otherwise, the main\n   * method should instantiate it.\n   ",
      "child_ranges": [
        "(line 608,col 5)-(line 608,col 12)",
        "(line 609,col 5)-(line 609,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.CommandLineRunner(java.lang.String[], java.io.PrintStream, java.io.PrintStream)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 20)",
        "(line 614,col 5)-(line 614,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.tokenizeKeepingQuotedStrings(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 627,
      "end_line": 639,
      "comment": "\n   * Split strings into tokens delimited by whitespace, but treat quoted\n   * strings as single tokens. Non-whitespace characters adjacent to quoted\n   * strings will be returned as part of the token. For example, the string\n   * {@code \"--js\u003d\u0027/home/my project/app.js\u0027\"} would be returned as a single\n   * token.\n   *\n   * @param lines strings to tokenize\n   * @return a list of tokens\n   ",
      "child_ranges": [
        "(line 628,col 5)-(line 628,col 47)",
        "(line 629,col 5)-(line 630,col 72)",
        "(line 632,col 5)-(line 637,col 5)",
        "(line 638,col 5)-(line 638,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.processArgs(java.lang.String[])",
      "begin_line": 641,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 645,col 5)-(line 645,col 64)",
        "(line 646,col 5)-(line 646,col 64)",
        "(line 647,col 5)-(line 647,col 54)",
        "(line 649,col 5)-(line 664,col 5)",
        "(line 666,col 5)-(line 666,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.processFlagFile(java.io.PrintStream)",
      "begin_line": 669,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 671,col 5)-(line 671,col 50)",
        "(line 672,col 5)-(line 673,col 66)",
        "(line 675,col 5)-(line 675,col 24)",
        "(line 676,col 5)-(line 677,col 59)",
        "(line 678,col 5)-(line 678,col 60)",
        "(line 681,col 5)-(line 681,col 70)",
        "(line 682,col 5)-(line 682,col 30)",
        "(line 683,col 5)-(line 683,col 77)",
        "(line 684,col 5)-(line 684,col 39)",
        "(line 687,col 5)-(line 691,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.initConfigFromFlags(java.lang.String[], java.io.PrintStream)",
      "begin_line": 694,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 696,col 5)-(line 696,col 51)",
        "(line 698,col 5)-(line 698,col 52)",
        "(line 699,col 5)-(line 699,col 30)",
        "(line 700,col 5)-(line 700,col 25)",
        "(line 701,col 5)-(line 713,col 5)",
        "(line 715,col 5)-(line 721,col 5)",
        "(line 723,col 5)-(line 733,col 5)",
        "(line 735,col 5)-(line 785,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createOptions()",
      "begin_line": 788,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 790,col 5)-(line 790,col 52)",
        "(line 791,col 5)-(line 795,col 5)",
        "(line 797,col 5)-(line 797,col 63)",
        "(line 799,col 5)-(line 799,col 52)",
        "(line 800,col 5)-(line 800,col 49)",
        "(line 802,col 5)-(line 804,col 5)",
        "(line 806,col 5)-(line 808,col 5)",
        "(line 810,col 5)-(line 812,col 5)",
        "(line 814,col 5)-(line 814,col 45)",
        "(line 815,col 5)-(line 815,col 46)",
        "(line 816,col 5)-(line 818,col 5)",
        "(line 820,col 5)-(line 820,col 57)",
        "(line 822,col 5)-(line 823,col 38)",
        "(line 825,col 5)-(line 825,col 44)",
        "(line 827,col 5)-(line 844,col 5)",
        "(line 846,col 5)-(line 846,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createCompiler()",
      "begin_line": 849,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 851,col 5)-(line 851,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.createExterns()",
      "begin_line": 854,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 857,col 5)-(line 857,col 53)",
        "(line 858,col 5)-(line 864,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTERNS_NAMES"
      ],
      "begin_line": 868,
      "end_line": 919,
      "comment": " The externs expected in externs.zip, in sorted order."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.getDefaultExterns()",
      "begin_line": 925,
      "end_line": 959,
      "comment": "\n   * @return a mutable list\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 926,col 5)-(line 927,col 24)",
        "(line 928,col 5)-(line 931,col 5)",
        "(line 932,col 5)-(line 932,col 38)",
        "(line 934,col 5)-(line 934,col 51)",
        "(line 935,col 5)-(line 935,col 59)",
        "(line 936,col 5)-(line 945,col 5)",
        "(line 947,col 5)-(line 949,col 66)",
        "(line 953,col 5)-(line 953,col 52)",
        "(line 954,col 5)-(line 956,col 5)",
        "(line 958,col 5)-(line 958,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.shouldRunCompiler()",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n   * @return Whether the configuration is valid.\n   ",
      "child_ranges": [
        "(line 965,col 5)-(line 965,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunner.main(java.lang.String[])",
      "begin_line": 971,
      "end_line": 978,
      "comment": "\n   * Runs the Compiler. Exits cleanly in the event of an error.\n   ",
      "child_ranges": [
        "(line 972,col 5)-(line 972,col 59)",
        "(line 973,col 5)-(line 977,col 5)"
      ]
    }
  ]
}