{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CompilerOptions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerOptions",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 41,
      "end_line": 2331,
      "comment": "\n * Compiler options\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "manageClosureDependencies"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": " Unused. For people using reflection to circumvent access control."
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n   * The JavaScript language version accepted.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "languageOut"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * The JavaScript language version that should be produced.\n   * Currently, this is always the same as {@link #languageIn}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n   * Whether the compiler accepts the `const\u0027 keyword.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assumeStrictThis"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Whether the compiler should assume that a function\u0027s \"this\" value\n   * never needs coercion (for example in non-strict \"null\" or \"undefined\" will\n   * be coerced to the global \"this\" and primitives to objects).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ideMode"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n   * Configures the compiler for use as an IDE backend.  In this mode:\n   * \u003cul\u003e\n   *  \u003cli\u003eNo optimization passes will run.\u003c/li\u003e\n   *  \u003cli\u003eThe last time custom passes are invoked is\n   *      {@link CustomPassExecutionTime#BEFORE_OPTIMIZATIONS}\u003c/li\u003e\n   *  \u003cli\u003eThe compiler will always try to process all inputs fully, even\n   *      if it encounters errors.\u003c/li\u003e\n   *  \u003cli\u003eThe compiler may record more information than is strictly\n   *      needed for codegen.\u003c/li\u003e\n   * \u003c/ul\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "saveDataStructures"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inferTypes"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n   * Even if checkTypes is disabled, clients might want to still infer types.\n   * This is mostly used when ideMode is enabled.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "skipAllPasses"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n   * Configures the compiler to skip as many passes as possible.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nameAnonymousFunctionsOnly"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n   * If true, name anonymous functions only. All others passes will be skipped.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "devMode"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n   * Configures the compiler to run expensive sanity checks after\n   * every pass. Only intended for internal development.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "checkDeterminism"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n   * Configures the compiler to log a hash code of the AST after\n   * every pass. Only intended for internal development.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "dependencyOptions"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messageBundle"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Transient so that clients don\u0027t have to implement Serializable."
    },
    {
      "type": "field",
      "varNames": [
        "checkSymbols"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Checks that all symbols are defined "
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveVarCheck"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAggressiveVarCheck(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 148,
      "end_line": 150,
      "comment": " Checks for suspicious variable definitions and undefined variables ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkSuspiciousCode"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Checks for suspicious statements that have no effect "
    },
    {
      "type": "field",
      "varNames": [
        "checkControlStructures"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Checks for invalid control structures "
    },
    {
      "type": "field",
      "varNames": [
        "checkTypes"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Checks types on expressions "
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypes"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTightenTypes(boolean)",
      "begin_line": 164,
      "end_line": 166,
      "comment": " Tightens types based on a global analysis. Experimental. ",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingOverride"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReportMissingOverride(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n   * Flags a warning if a property is missing the @override annotation, but it\n   * overrides a base class property.\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRequires"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Checks for missing goog.require() calls *"
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckRequires(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkProvides"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckProvides(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 188,
      "end_line": 190,
      "comment": " Checks for missing goog.provides() calls *",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalNamesLevel"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckGlobalNamesLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n   * Checks the integrity of references to qualified global names.\n   * (e.g. \"a.b\")\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "brokenClosureRequiresLevel"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setBrokenClosureRequiresLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 205,
      "end_line": 207,
      "comment": " Sets the check level for bad Closure require calls. ",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalThisLevel"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckGlobalThisLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n   * Checks for certain uses of the {@code this} keyword that are considered\n   * unsafe because they are likely to reference the global {@code this}\n   * object unintentionally.\n   *\n   * If this is off, but collapseProperties is on, then the compiler will\n   * usually ignore you and run this check anyways.\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingGetCssNameLevel"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingGetCssNameLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n   * Checks that certain string literals only appear in strings used as\n   * goog.getCssName arguments.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingGetCssNameBlacklist"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n   * Regex of string literals that may only appear in goog.getCssName arguments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "checkCaja"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Checks that the syntactic restrictions of Caja are met. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckCaja(boolean)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extraAnnotationNames"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n   * A set of extra annotation names which are accepted and silently ignored\n   * when encountered in a source file. Defaults to null which has the same\n   * effect as specifying an empty set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "checkEventfulObjectDisposalPolicy"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n   * Check for patterns that are known to cause memory leaks.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckEventfulObjectDisposalPolicy(com.google.javascript.jscomp.CheckEventfulObjectDisposal.DisposalCheckingPolicy)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 52)",
        "(line 263,col 5)-(line 265,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getCheckEventfulObjectDisposalPolicy()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveRenaming"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alternateRenaming"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " triggers RenameVars2."
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveFusion"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " Prefer commas over semicolons when doing statement fusion "
    },
    {
      "type": "field",
      "varNames": [
        "foldConstants"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Folds constants (e.g. (2 + 3) to 5) "
    },
    {
      "type": "field",
      "varNames": [
        "deadAssignmentElimination"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Remove assignments to values that can not be referenced "
    },
    {
      "type": "field",
      "varNames": [
        "inlineConstantVars"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Inlines constants (symbols that are all CAPS) "
    },
    {
      "type": "field",
      "varNames": [
        "inlineFunctions"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Inlines global functions "
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalFunctions"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Inlines functions defined in local scopes "
    },
    {
      "type": "field",
      "varNames": [
        "assumeClosuresOnlyCaptureReferences"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " More aggressive function inlining "
    },
    {
      "type": "field",
      "varNames": [
        "inlineProperties"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " Inlines properties "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleCodeMotion"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Move code to a deeper module "
    },
    {
      "type": "field",
      "varNames": [
        "coalesceVariableNames"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " Merge two variables together as one. "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleMethodMotion"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " Move methods to a deeper module "
    },
    {
      "type": "field",
      "varNames": [
        "inlineGetters"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " Inlines trivial getters "
    },
    {
      "type": "field",
      "varNames": [
        "inlineVariables"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Inlines variables "
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalVariables"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Inlines variables "
    },
    {
      "type": "field",
      "varNames": [
        "flowSensitiveInlineVariables"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Remove this."
    },
    {
      "type": "field",
      "varNames": [
        "smartNameRemoval"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Removes code associated with unused global names "
    },
    {
      "type": "field",
      "varNames": [
        "removeDeadCode"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Removes code that will never execute "
    },
    {
      "type": "field",
      "varNames": [
        "checkUnreachableCode"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckUnreachableCode(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Checks for unreachable code ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingReturn"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingReturn(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 341,
      "end_line": 343,
      "comment": " Checks for missing return statements ",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extractPrototypeMemberDeclarations"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Extracts common prototype member declarations "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypeProperties"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": " Removes unused member prototypes "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypePropertiesInExterns"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Tells AnalyzePrototypeProperties it can remove externed props. "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedClassProperties"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " Removes unused member properties "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedVars"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Removes unused variables "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedLocalVars"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Removes unused variables in local scope. "
    },
    {
      "type": "field",
      "varNames": [
        "aliasExternals"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " Adds variable aliases for externals to reduce code size "
    },
    {
      "type": "field",
      "varNames": [
        "aliasableGlobals"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasableGlobals(java.lang.String)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n   * A comma separated white-list of global names. When {@link #aliasExternals}\n   * is enable, if set to a non-empty string, only externals with these names\n   * will be considered for aliasing.\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "unaliasableGlobals"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setUnaliasableGlobals(java.lang.String)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n   * A comma separated white-list of global names. When {@link #aliasExternals}\n   * is enable, these global names will not be aliased.\n   ",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseVariableDeclarations"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Collapses multiple variable declarations into one "
    },
    {
      "type": "field",
      "varNames": [
        "groupVariableDeclarations"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Group multiple variable declarations into one "
    },
    {
      "type": "field",
      "varNames": [
        "collapseAnonymousFunctions"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": "\n   * Collapses anonymous function declarations into named function\n   * declarations\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasableStrings"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": "\n   * If set to a non-empty set, those strings literals will be aliased to a\n   * single global instance per string, to avoid creating more objects than\n   * necessary.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasStringsBlacklist"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": "\n   * A blacklist in the form of a regular expression to block strings that\n   * contains certain words from being aliased.\n   * If the value is the empty string, no words are blacklisted.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasAllStrings"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": "\n   * Aliases all string literals to global instances, to avoid creating more\n   * objects than necessary (if true, overrides any set of strings passed in\n   * to aliasableStrings)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "outputJsStringUsage"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": " Print string usage as part of the compilation log. "
    },
    {
      "type": "field",
      "varNames": [
        "convertToDottedProperties"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " Converts quoted property accesses to dot syntax (a[\u0027b\u0027] -\u003e a.b) "
    },
    {
      "type": "field",
      "varNames": [
        "rewriteFunctionExpressions"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": " Reduces the size of common function expressions. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeParameters"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": "\n   * Remove unused and constant parameters.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeReturns"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n   * Remove unused return values.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeCalls"
      ],
      "begin_line": 442,
      "end_line": 442,
      "comment": "\n   * Remove unused parameters from call sites.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeArgumentsArray"
      ],
      "begin_line": 447,
      "end_line": 447,
      "comment": "\n   * Provide formal names for elements of arguments array.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "chainCalls"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": " Chains calls to functions that return this. "
    },
    {
      "type": "field",
      "varNames": [
        "variableRenaming"
      ],
      "begin_line": 457,
      "end_line": 457,
      "comment": " Controls which variables get renamed. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyRenaming"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Controls which properties get renamed. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyAffinity"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": " Should we use affinity information when generating property names. "
    },
    {
      "type": "field",
      "varNames": [
        "labelRenaming"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " Controls label renaming. "
    },
    {
      "type": "field",
      "varNames": [
        "reserveRawExports"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": " Reserve property names on the global this object. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowVariables"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": " Should shadow variable names in outer scope. "
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\n   * Generate pseudo names for variables and properties for debugging purposes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "renamePrefix"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": " Specifies a prefix for all globals "
    },
    {
      "type": "field",
      "varNames": [
        "renamePrefixNamespace"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": "\n   * Specifies the name of an object that will be used to store all non-extern\n   * globals.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasKeywords"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": " Aliases true, false, and null to variables with shorter names. "
    },
    {
      "type": "field",
      "varNames": [
        "collapseProperties"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": " Flattens multi-level property names (e.g. a$b \u003d x) "
    },
    {
      "type": "field",
      "varNames": [
        "collapseObjectLiterals"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": " Split object literals into individual variables when possible. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseObjectLiterals(boolean)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapsePropertiesOnExternTypes"
      ],
      "begin_line": 502,
      "end_line": 502,
      "comment": " Flattens multi-level property names on extern types (e.g. String$f \u003d x) "
    },
    {
      "type": "field",
      "varNames": [
        "devirtualizePrototypeMethods"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": "\n   * Devirtualize prototype method by rewriting them to be static calls that\n   * take the this pointer as their first argument\n   "
    },
    {
      "type": "field",
      "varNames": [
        "computeFunctionSideEffects"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": "\n   * Use @nosideeffects annotations, function bodies and name graph\n   * to determine if calls have side effects.  Requires --check_types.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "debugFunctionSideEffectsPath"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": "\n   * Where to save debug report for compute function side effects.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "disambiguatePrivateProperties"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": "\n   * Rename private properties to disambiguate between unrelated fields based on\n   * the coding convention.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "disambiguateProperties"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": "\n   * Rename properties to disambiguate between unrelated fields based on\n   * type information.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ambiguateProperties"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": " Rename unrelated properties to the same name to reduce code size. "
    },
    {
      "type": "field",
      "varNames": [
        "anonymousFunctionNaming"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": " Give anonymous functions names for easier debugging "
    },
    {
      "type": "field",
      "varNames": [
        "inputAnonymousFunctionNamingMap"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": " Input anonymous function renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "inputVariableMap"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": " Input variable renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "inputPropertyMap"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": " Input property renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "exportTestFunctions"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": " Whether to export test functions. "
    },
    {
      "type": "field",
      "varNames": [
        "specializeInitialModule"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSpecializeInitialModule(boolean)",
      "begin_line": 554,
      "end_line": 556,
      "comment": " Specialize the initial module at the cost of later modules ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessagesWithChromeI18n"
      ],
      "begin_line": 566,
      "end_line": 566,
      "comment": "\n   * Replace UI strings with chrome.i18n.getMessage calls.\n   * Used by Chrome extensions/apps.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tcProjectId"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceMessagesWithChromeI18n(boolean, java.lang.String)",
      "begin_line": 569,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 572,col 5)-(line 577,col 5)",
        "(line 579,col 5)-(line 579,col 71)",
        "(line 580,col 5)-(line 580,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheck"
      ],
      "begin_line": 584,
      "end_line": 584,
      "comment": " Inserts run-time type assertions for debugging. "
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheckLogFunction"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": "\n   * A JS function to be used for logging run-time type assertion\n   * failures. It will be passed the warning as a string and the\n   * faulty expression as arguments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": " A CodingConvention to use during the compile. "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreCajaProperties"
      ],
      "begin_line": 596,
      "end_line": 596,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIgnoreCajaProperties(boolean)",
      "begin_line": 599,
      "end_line": 601,
      "comment": " Add code to skip properties that Caja adds to Object.prototype ",
      "child_ranges": [
        "(line 600,col 5)-(line 600,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "syntheticBlockStartMarker"
      ],
      "begin_line": 603,
      "end_line": 603,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntheticBlockEndMarker"
      ],
      "begin_line": 605,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": " Compiling locale "
    },
    {
      "type": "field",
      "varNames": [
        "markAsCompiled"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": " Sets the special \"COMPILED\" value to true "
    },
    {
      "type": "field",
      "varNames": [
        "removeTryCatchFinally"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": " Removes try...catch...finally blocks for easier debugging "
    },
    {
      "type": "field",
      "varNames": [
        "closurePass"
      ],
      "begin_line": 617,
      "end_line": 617,
      "comment": " Processes goog.provide() and goog.require() calls "
    },
    {
      "type": "field",
      "varNames": [
        "jqueryPass"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": " Processes jQuery aliases "
    },
    {
      "type": "field",
      "varNames": [
        "angularPass"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": " Processes AngularJS-specific annotations "
    },
    {
      "type": "field",
      "varNames": [
        "removeAbstractMethods"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": " Remove goog.abstractMethod assignments. "
    },
    {
      "type": "field",
      "varNames": [
        "removeClosureAsserts"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": " Remove goog.asserts calls. "
    },
    {
      "type": "field",
      "varNames": [
        "gatherCssNames"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": " Gather CSS names (requires closurePass) "
    },
    {
      "type": "field",
      "varNames": [
        "stripTypes"
      ],
      "begin_line": 635,
      "end_line": 635,
      "comment": " Names of types to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripNameSuffixes"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": " Name suffixes that determine which variables and properties to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripNamePrefixes"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": " Name prefixes that determine which variables and properties to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripTypePrefixes"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": " Qualified type name prefixes that determine which types to strip "
    },
    {
      "type": "field",
      "varNames": [
        "customPasses"
      ],
      "begin_line": 647,
      "end_line": 648,
      "comment": " Custom passes "
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffectCalls"
      ],
      "begin_line": 651,
      "end_line": 651,
      "comment": " Mark no side effect calls "
    },
    {
      "type": "field",
      "varNames": [
        "defineReplacements"
      ],
      "begin_line": 654,
      "end_line": 654,
      "comment": " Replacements for @defines. Will be Boolean, Numbers, or Strings "
    },
    {
      "type": "field",
      "varNames": [
        "tweakProcessing"
      ],
      "begin_line": 657,
      "end_line": 657,
      "comment": " What kind of processing to do for goog.tweak functions. "
    },
    {
      "type": "field",
      "varNames": [
        "tweakReplacements"
      ],
      "begin_line": 660,
      "end_line": 660,
      "comment": " Replacements for tweaks. Will be Boolean, Numbers, or Strings "
    },
    {
      "type": "field",
      "varNames": [
        "moveFunctionDeclarations"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": " Move top-level function declarations to the top "
    },
    {
      "type": "field",
      "varNames": [
        "instrumentMemoryAllocations"
      ],
      "begin_line": 666,
      "end_line": 666,
      "comment": " Instrument / Intercept memory allocations. "
    },
    {
      "type": "field",
      "varNames": [
        "instrumentationTemplate"
      ],
      "begin_line": 669,
      "end_line": 669,
      "comment": " Instrumentation template to use with #recordFunctionInformation "
    },
    {
      "type": "field",
      "varNames": [
        "appNameStr"
      ],
      "begin_line": 671,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAppNameStr(java.lang.String)",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\n   * App identifier string for use by the instrumentation template\u0027s\n   * app_name_setter. @see #instrumentationTemplate\n   ",
      "child_ranges": [
        "(line 678,col 5)-(line 678,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recordFunctionInformation"
      ],
      "begin_line": 682,
      "end_line": 682,
      "comment": " Record function information "
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 684,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cssRenamingMap"
      ],
      "begin_line": 687,
      "end_line": 687,
      "comment": " Map used in the renaming of CSS class names. "
    },
    {
      "type": "field",
      "varNames": [
        "cssRenamingWhitelist"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": " Whitelist used in the renaming of CSS class names. "
    },
    {
      "type": "field",
      "varNames": [
        "processObjectPropertyString"
      ],
      "begin_line": 693,
      "end_line": 693,
      "comment": " Process instances of goog.testing.ObjectPropertyString. "
    },
    {
      "type": "field",
      "varNames": [
        "replaceIdGenerators"
      ],
      "begin_line": 696,
      "end_line": 696,
      "comment": " true by default for legacy reasons."
    },
    {
      "type": "field",
      "varNames": [
        "idGenerators"
      ],
      "begin_line": 699,
      "end_line": 699,
      "comment": " Id generators to replace. "
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorsMapSerialized"
      ],
      "begin_line": 706,
      "end_line": 706,
      "comment": "\n   * A previous map of ids (serialized to a string by a previous compile).\n   * This will be used as a hint during the ReplaceIdGenerators pass, which\n   * will attempt to reuse the same ids.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsFunctionDescriptions"
      ],
      "begin_line": 709,
      "end_line": 709,
      "comment": " Configuration strings "
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsPlaceholderToken"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsReservedStrings"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": " A list of strings that should not be used as replacements"
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsInputMap"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": " A previous map of replacements to strings."
    },
    {
      "type": "field",
      "varNames": [
        "propertyInvalidationErrors"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": " List of properties that we report invalidation errors for. "
    },
    {
      "type": "field",
      "varNames": [
        "transformAMDToCJSModules"
      ],
      "begin_line": 721,
      "end_line": 721,
      "comment": " Transform AMD to CommonJS modules. "
    },
    {
      "type": "field",
      "varNames": [
        "processCommonJSModules"
      ],
      "begin_line": 724,
      "end_line": 724,
      "comment": " Rewrite CommonJS modules so that they can be concatenated together. "
    },
    {
      "type": "field",
      "varNames": [
        "commonJSModulePathPrefix"
      ],
      "begin_line": 727,
      "end_line": 728,
      "comment": " CommonJS module prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 736,
      "end_line": 736,
      "comment": " Output in pretty indented format "
    },
    {
      "type": "field",
      "varNames": [
        "lineBreak"
      ],
      "begin_line": 739,
      "end_line": 739,
      "comment": " Line break the output a bit more aggressively "
    },
    {
      "type": "field",
      "varNames": [
        "preferLineBreakAtEndOfFile"
      ],
      "begin_line": 742,
      "end_line": 742,
      "comment": " Prefer line breaks at end of file "
    },
    {
      "type": "field",
      "varNames": [
        "printInputDelimiter"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": " Prints a separator comment before each JS script "
    },
    {
      "type": "field",
      "varNames": [
        "inputDelimiter"
      ],
      "begin_line": 748,
      "end_line": 748,
      "comment": " The string to use as the separator for printInputDelimiter "
    },
    {
      "type": "field",
      "varNames": [
        "preferSingleQuotes"
      ],
      "begin_line": 750,
      "end_line": 750,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPreferSingleQuotes(boolean)",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\n   * Normally, when there are an equal number of single and double quotes\n   * in a string, the compiler will use double quotes. Set this to true\n   * to prefer single quotes.\n   ",
      "child_ranges": [
        "(line 758,col 5)-(line 758,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "trustedStrings"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTrustedStrings(boolean)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n   * Some people want to put arbitrary user input into strings, which are then\n   * run through the compiler. These scripts are then put into HTML.\n   * By default, we assume strings are untrusted. If the compiler is run\n   * from the command-line, we assume that strings are trusted.\n   ",
      "child_ranges": [
        "(line 770,col 5)-(line 770,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "reportPath"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReportPath(java.lang.String)",
      "begin_line": 776,
      "end_line": 778,
      "comment": " Where to save a report of global name usage ",
      "child_ranges": [
        "(line 777,col 5)-(line 777,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tracer"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTracerMode()",
      "begin_line": 782,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 783,col 5)-(line 783,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTracerMode(com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 786,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 787,col 5)-(line 787,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "colorizeErrorOutput"
      ],
      "begin_line": 790,
      "end_line": 790,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorFormat"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningsGuard"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 796,
      "end_line": 796,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLengthThreshold"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externExports"
      ],
      "begin_line": 808,
      "end_line": 808,
      "comment": "\n   * Whether the exports should be made available via {@link Result} after\n   * compilation. This is implicitly true if {@link #externExportsPath} is set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "externExportsPath"
      ],
      "begin_line": 811,
      "end_line": 811,
      "comment": " The output path for the created externs file. "
    },
    {
      "type": "field",
      "varNames": [
        "nameReferenceReportPath"
      ],
      "begin_line": 813,
      "end_line": 813,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameReferenceReportPath(java.lang.String)",
      "begin_line": 816,
      "end_line": 818,
      "comment": " Where to save a cross-reference report from the name reference graph ",
      "child_ranges": [
        "(line 817,col 5)-(line 817,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameReferenceGraphPath"
      ],
      "begin_line": 820,
      "end_line": 820,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameReferenceGraphPath(java.lang.String)",
      "begin_line": 823,
      "end_line": 825,
      "comment": " Where to save the name reference graph ",
      "child_ranges": [
        "(line 824,col 5)-(line 824,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapOutputPath"
      ],
      "begin_line": 832,
      "end_line": 832,
      "comment": " The output path for the source map. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 835,
      "end_line": 836,
      "comment": " The detail level for the generated source map. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 839,
      "end_line": 840,
      "comment": " The source map file format "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapLocationMappings"
      ],
      "begin_line": 842,
      "end_line": 843,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputCharset"
      ],
      "begin_line": 849,
      "end_line": 849,
      "comment": "\n   * Charset to use when generating code.  If null, then output ASCII.\n   * This needs to be a string because CompilerOptions is serializable.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "looseTypes"
      ],
      "begin_line": 854,
      "end_line": 854,
      "comment": "\n   * Whether the named objects types included \u0027undefined\u0027 by default.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "protectHiddenSideEffects"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": "\n   * When set, assume that apparently side-effect free code is meaningful.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProtectHiddenSideEffects(boolean)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n   * When enabled, assume that apparently side-effect free code is meaningful.\n   ",
      "child_ranges": [
        "(line 865,col 5)-(line 865,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasHandler"
      ],
      "begin_line": 871,
      "end_line": 871,
      "comment": "\n   * Data holder Alias Transformation information accumulated during a compile.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "errorHandler"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": "\n   * Handler for compiler warnings and errors.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerOptions.CompilerOptions()",
      "begin_line": 884,
      "end_line": 1031,
      "comment": "\n   * Initializes compiler options. All options are disabled by default.\n   *\n   * Command-line frontends to the compiler should set these properties\n   * like a builder.\n   ",
      "child_ranges": [
        "(line 886,col 5)-(line 886,col 42)",
        "(line 889,col 5)-(line 889,col 31)",
        "(line 892,col 5)-(line 892,col 26)",
        "(line 893,col 5)-(line 893,col 39)",
        "(line 894,col 5)-(line 894,col 26)",
        "(line 895,col 5)-(line 895,col 29)",
        "(line 896,col 5)-(line 896,col 25)",
        "(line 897,col 5)-(line 897,col 40)",
        "(line 898,col 5)-(line 898,col 32)",
        "(line 899,col 5)-(line 899,col 35)",
        "(line 900,col 5)-(line 900,col 23)",
        "(line 901,col 5)-(line 901,col 25)",
        "(line 902,col 5)-(line 902,col 43)",
        "(line 903,col 5)-(line 903,col 35)",
        "(line 904,col 5)-(line 904,col 35)",
        "(line 905,col 5)-(line 905,col 43)",
        "(line 906,col 5)-(line 906,col 50)",
        "(line 907,col 5)-(line 907,col 42)",
        "(line 908,col 5)-(line 908,col 42)",
        "(line 909,col 5)-(line 909,col 40)",
        "(line 910,col 5)-(line 910,col 49)",
        "(line 911,col 5)-(line 911,col 43)",
        "(line 912,col 5)-(line 912,col 22)",
        "(line 913,col 5)-(line 913,col 39)",
        "(line 914,col 5)-(line 914,col 23)",
        "(line 915,col 5)-(line 915,col 32)",
        "(line 916,col 5)-(line 916,col 95)",
        "(line 919,col 5)-(line 919,col 31)",
        "(line 920,col 5)-(line 920,col 30)",
        "(line 921,col 5)-(line 921,col 26)",
        "(line 922,col 5)-(line 922,col 34)",
        "(line 923,col 5)-(line 923,col 38)",
        "(line 924,col 5)-(line 924,col 31)",
        "(line 925,col 5)-(line 925,col 28)",
        "(line 926,col 5)-(line 926,col 33)",
        "(line 927,col 5)-(line 927,col 29)",
        "(line 928,col 5)-(line 928,col 48)",
        "(line 929,col 5)-(line 929,col 29)",
        "(line 930,col 5)-(line 930,col 34)",
        "(line 931,col 5)-(line 931,col 36)",
        "(line 932,col 5)-(line 932,col 26)",
        "(line 933,col 5)-(line 933,col 28)",
        "(line 934,col 5)-(line 934,col 33)",
        "(line 935,col 5)-(line 935,col 29)",
        "(line 936,col 5)-(line 936,col 27)",
        "(line 937,col 5)-(line 937,col 47)",
        "(line 938,col 5)-(line 938,col 44)",
        "(line 939,col 5)-(line 939,col 53)",
        "(line 940,col 5)-(line 940,col 40)",
        "(line 941,col 5)-(line 941,col 29)",
        "(line 942,col 5)-(line 942,col 34)",
        "(line 943,col 5)-(line 943,col 27)",
        "(line 944,col 5)-(line 944,col 41)",
        "(line 945,col 5)-(line 945,col 38)",
        "(line 946,col 5)-(line 946,col 39)",
        "(line 947,col 5)-(line 947,col 46)",
        "(line 948,col 5)-(line 948,col 31)",
        "(line 949,col 5)-(line 949,col 28)",
        "(line 950,col 5)-(line 950,col 32)",
        "(line 951,col 5)-(line 951,col 38)",
        "(line 952,col 5)-(line 952,col 39)",
        "(line 953,col 5)-(line 953,col 31)",
        "(line 954,col 5)-(line 954,col 28)",
        "(line 957,col 5)-(line 957,col 50)",
        "(line 958,col 5)-(line 958,col 50)",
        "(line 959,col 5)-(line 959,col 29)",
        "(line 960,col 5)-(line 960,col 26)",
        "(line 961,col 5)-(line 961,col 32)",
        "(line 962,col 5)-(line 962,col 28)",
        "(line 963,col 5)-(line 963,col 24)",
        "(line 964,col 5)-(line 964,col 26)",
        "(line 965,col 5)-(line 965,col 31)",
        "(line 966,col 5)-(line 966,col 44)",
        "(line 967,col 5)-(line 967,col 35)",
        "(line 968,col 5)-(line 968,col 41)",
        "(line 969,col 5)-(line 969,col 35)",
        "(line 970,col 5)-(line 970,col 32)",
        "(line 971,col 5)-(line 971,col 64)",
        "(line 972,col 5)-(line 972,col 32)",
        "(line 975,col 5)-(line 975,col 29)",
        "(line 976,col 5)-(line 976,col 39)",
        "(line 977,col 5)-(line 977,col 33)",
        "(line 978,col 5)-(line 978,col 37)",
        "(line 979,col 5)-(line 979,col 35)",
        "(line 980,col 5)-(line 980,col 18)",
        "(line 981,col 5)-(line 981,col 27)",
        "(line 982,col 5)-(line 982,col 34)",
        "(line 983,col 5)-(line 983,col 24)",
        "(line 984,col 5)-(line 984,col 23)",
        "(line 985,col 5)-(line 985,col 24)",
        "(line 986,col 5)-(line 986,col 33)",
        "(line 987,col 5)-(line 987,col 33)",
        "(line 988,col 5)-(line 988,col 40)",
        "(line 989,col 5)-(line 989,col 47)",
        "(line 990,col 5)-(line 990,col 47)",
        "(line 991,col 5)-(line 991,col 47)",
        "(line 992,col 5)-(line 992,col 24)",
        "(line 993,col 5)-(line 993,col 34)",
        "(line 994,col 5)-(line 994,col 43)",
        "(line 995,col 5)-(line 995,col 42)",
        "(line 996,col 5)-(line 996,col 42)",
        "(line 997,col 5)-(line 997,col 37)",
        "(line 998,col 5)-(line 998,col 20)",
        "(line 999,col 5)-(line 999,col 38)",
        "(line 1000,col 5)-(line 1000,col 28)",
        "(line 1001,col 5)-(line 1001,col 26)",
        "(line 1002,col 5)-(line 1002,col 32)",
        "(line 1003,col 5)-(line 1003,col 40)",
        "(line 1004,col 5)-(line 1004,col 37)",
        "(line 1005,col 5)-(line 1005,col 65)",
        "(line 1006,col 5)-(line 1006,col 40)",
        "(line 1007,col 5)-(line 1007,col 59)",
        "(line 1008,col 5)-(line 1008,col 51)",
        "(line 1011,col 5)-(line 1011,col 35)",
        "(line 1012,col 5)-(line 1012,col 40)",
        "(line 1015,col 5)-(line 1015,col 32)",
        "(line 1016,col 5)-(line 1016,col 24)",
        "(line 1017,col 5)-(line 1017,col 22)",
        "(line 1018,col 5)-(line 1018,col 39)",
        "(line 1019,col 5)-(line 1019,col 22)",
        "(line 1020,col 5)-(line 1020,col 28)",
        "(line 1021,col 5)-(line 1021,col 32)",
        "(line 1022,col 5)-(line 1022,col 41)",
        "(line 1023,col 5)-(line 1023,col 40)",
        "(line 1024,col 5)-(line 1024,col 26)",
        "(line 1025,col 5)-(line 1025,col 35)",
        "(line 1026,col 5)-(line 1026,col 34)",
        "(line 1029,col 5)-(line 1029,col 53)",
        "(line 1030,col 5)-(line 1030,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.isRemoveUnusedClassProperties()",
      "begin_line": 1036,
      "end_line": 1038,
      "comment": "\n   * @return Whether to attempt to remove unused class properties\n   ",
      "child_ranges": [
        "(line 1037,col 5)-(line 1037,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedClassProperties(boolean)",
      "begin_line": 1044,
      "end_line": 1046,
      "comment": "\n   * @param removeUnusedClassProperties Whether to attempt to remove\n   *      unused class properties\n   ",
      "child_ranges": [
        "(line 1045,col 5)-(line 1045,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getDefineReplacements()",
      "begin_line": 1051,
      "end_line": 1053,
      "comment": "\n   * Returns the map of define replacements.\n   ",
      "child_ranges": [
        "(line 1052,col 5)-(line 1052,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTweakReplacements()",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\n   * Returns the map of tweak replacements.\n   ",
      "child_ranges": [
        "(line 1059,col 5)-(line 1059,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getReplacementsHelper(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 1065,
      "end_line": 1083,
      "comment": "\n   * Creates a map of String-\u003eNode from a map of String-\u003eNumber/String/Boolean.\n   ",
      "child_ranges": [
        "(line 1067,col 5)-(line 1067,col 46)",
        "(line 1068,col 5)-(line 1081,col 5)",
        "(line 1082,col 5)-(line 1082,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToBooleanLiteral(java.lang.String, boolean)",
      "begin_line": 1089,
      "end_line": 1091,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS\n   * to a boolean literal.\n   ",
      "child_ranges": [
        "(line 1090,col 5)-(line 1090,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToStringLiteral(java.lang.String, java.lang.String)",
      "begin_line": 1097,
      "end_line": 1099,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * String literal.\n   ",
      "child_ranges": [
        "(line 1098,col 5)-(line 1098,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToNumberLiteral(java.lang.String, int)",
      "begin_line": 1105,
      "end_line": 1107,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1106,col 5)-(line 1106,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToDoubleLiteral(java.lang.String, double)",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1114,col 5)-(line 1114,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToBooleanLiteral(java.lang.String, boolean)",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "\n   * Sets the value of the tweak in JS\n   * to a boolean literal.\n   ",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToStringLiteral(java.lang.String, java.lang.String)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * String literal.\n   ",
      "child_ranges": [
        "(line 1130,col 5)-(line 1130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToNumberLiteral(java.lang.String, int)",
      "begin_line": 1137,
      "end_line": 1139,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1138,col 5)-(line 1138,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToDoubleLiteral(java.lang.String, double)",
      "begin_line": 1145,
      "end_line": 1147,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1146,col 5)-(line 1146,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.skipAllCompilerPasses()",
      "begin_line": 1152,
      "end_line": 1154,
      "comment": "\n   * Skip all possible passes, to make the compiler as fast as possible.\n   ",
      "child_ranges": [
        "(line 1153,col 5)-(line 1153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 1160,
      "end_line": 1162,
      "comment": "\n   * Whether the warnings guard in this Options object enables the given\n   * group of warnings.\n   ",
      "child_ranges": [
        "(line 1161,col 5)-(line 1161,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.disables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 1168,
      "end_line": 1170,
      "comment": "\n   * Whether the warnings guard in this Options object disables the given\n   * group of warnings.\n   ",
      "child_ranges": [
        "(line 1169,col 5)-(line 1169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroup, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "\n   * Configure the given type of warning to the given level.\n   ",
      "child_ranges": [
        "(line 1176,col 5)-(line 1176,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getWarningsGuard()",
      "begin_line": 1179,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1180,col 5)-(line 1180,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.resetWarningsGuard()",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\n   * Reset the warnings guard.\n   ",
      "child_ranges": [
        "(line 1187,col 5)-(line 1187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.useEmergencyFailSafe()",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": "\n   * The emergency fail safe removes all strict and ERROR-escalating\n   * warnings guards.\n   ",
      "child_ranges": [
        "(line 1195,col 5)-(line 1195,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 1201,
      "end_line": 1203,
      "comment": "\n   * Add a guard to the set of warnings guards.\n   ",
      "child_ranges": [
        "(line 1202,col 5)-(line 1202,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamingPolicy(com.google.javascript.jscomp.VariableRenamingPolicy, com.google.javascript.jscomp.PropertyRenamingPolicy)",
      "begin_line": 1210,
      "end_line": 1214,
      "comment": "\n   * Sets the variable and property renaming policies for the compiler,\n   * in a way that clears warnings about the renaming policy being\n   * uninitialized from flags.\n   ",
      "child_ranges": [
        "(line 1212,col 5)-(line 1212,col 46)",
        "(line 1213,col 5)-(line 1213,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyAffinity(boolean)",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 5)-(line 1217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setShadowVariables(boolean)",
      "begin_line": 1221,
      "end_line": 1223,
      "comment": " Should shadow outer scope variable name during renaming. ",
      "child_ranges": [
        "(line 1222,col 5)-(line 1222,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapsePropertiesOnExternTypes(boolean)",
      "begin_line": 1230,
      "end_line": 1232,
      "comment": "\n   * If true, flattens multi-level property names on extern types\n   * (e.g. String$f \u003d x). This should only be used with the typed version of\n   * the externs files.\n   ",
      "child_ranges": [
        "(line 1231,col 5)-(line 1231,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProcessObjectPropertyString(boolean)",
      "begin_line": 1237,
      "end_line": 1239,
      "comment": "\n   * If true, process goog.testing.ObjectPropertyString instances.\n   ",
      "child_ranges": [
        "(line 1238,col 5)-(line 1238,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceIdGenerators(boolean)",
      "begin_line": 1244,
      "end_line": 1246,
      "comment": "\n   * @param replaceIdGenerators the replaceIdGenerators to set\n   ",
      "child_ranges": [
        "(line 1245,col 5)-(line 1245,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdGenerators(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1251,
      "end_line": 1257,
      "comment": "\n   * Sets the id generators to replace.\n   ",
      "child_ranges": [
        "(line 1252,col 5)-(line 1252,col 79)",
        "(line 1253,col 5)-(line 1255,col 5)",
        "(line 1256,col 5)-(line 1256,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "UNIQUE_ID_GENERATOR"
      ],
      "begin_line": 1263,
      "end_line": 1264,
      "comment": "\n   * A renaming map instance to use to signal the use of the \"inconsistent\"\n   * id generator type.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdGenerators(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.RenamingMap\u003e)",
      "begin_line": 1269,
      "end_line": 1271,
      "comment": "\n   * Sets the id generators to replace.\n   ",
      "child_ranges": [
        "(line 1270,col 5)-(line 1270,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdGeneratorsMap(java.lang.String)",
      "begin_line": 1278,
      "end_line": 1280,
      "comment": "\n   * A previous map of ids (serialized to a string by a previous compile).\n   * This will be used as a hint during the ReplaceIdGenerators pass, which\n   * will attempt to reuse the same ids.\n   ",
      "child_ranges": [
        "(line 1279,col 5)-(line 1279,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineFunctions(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1285,
      "end_line": 1302,
      "comment": "\n   * Set the function inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1286,col 5)-(line 1301,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineVariables(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1307,
      "end_line": 1324,
      "comment": "\n   * Set the variable inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1308,col 5)-(line 1323,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineProperties(boolean)",
      "begin_line": 1329,
      "end_line": 1331,
      "comment": "\n   * Set the function inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1330,col 5)-(line 1330,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVariable(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1336,
      "end_line": 1339,
      "comment": "\n   * Set the variable removal policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1338,col 5)-(line 1338,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVariables(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1344,
      "end_line": 1361,
      "comment": "\n   * Set the variable removal policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1345,col 5)-(line 1360,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsConfiguration(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1366,
      "end_line": 1371,
      "comment": "\n   * Sets the functions whose debug strings to replace.\n   ",
      "child_ranges": [
        "(line 1368,col 5)-(line 1368,col 59)",
        "(line 1369,col 5)-(line 1370,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRewriteNewDateGoogNow(boolean)",
      "begin_line": 1373,
      "end_line": 1375,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveAbstractMethods(boolean)",
      "begin_line": 1377,
      "end_line": 1379,
      "comment": "",
      "child_ranges": [
        "(line 1378,col 5)-(line 1378,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveClosureAsserts(boolean)",
      "begin_line": 1381,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1382,col 5)-(line 1382,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameAnonymousFunctionsOnly(boolean)",
      "begin_line": 1388,
      "end_line": 1390,
      "comment": "\n   * If true, name anonymous functions only. All other passes will be skipped.\n   ",
      "child_ranges": [
        "(line 1389,col 5)-(line 1389,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setColorizeErrorOutput(boolean)",
      "begin_line": 1392,
      "end_line": 1394,
      "comment": "",
      "child_ranges": [
        "(line 1393,col 5)-(line 1393,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.shouldColorizeErrorOutput()",
      "begin_line": 1396,
      "end_line": 1398,
      "comment": "",
      "child_ranges": [
        "(line 1397,col 5)-(line 1397,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setChainCalls(boolean)",
      "begin_line": 1403,
      "end_line": 1405,
      "comment": "\n   * If true, chain calls to functions that return this.\n   ",
      "child_ranges": [
        "(line 1404,col 5)-(line 1404,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAcceptConstKeyword(boolean)",
      "begin_line": 1410,
      "end_line": 1412,
      "comment": "\n   * If true, accept `const\u0027 keyword.\n   ",
      "child_ranges": [
        "(line 1411,col 5)-(line 1411,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enableRuntimeTypeCheck(java.lang.String)",
      "begin_line": 1420,
      "end_line": 1423,
      "comment": "\n   * Enable run-time type checking, which adds JS type assertions for debugging.\n   *\n   * @param logFunction A JS function to be used for logging run-time type\n   *     assertion failures.\n   ",
      "child_ranges": [
        "(line 1421,col 5)-(line 1421,col 33)",
        "(line 1422,col 5)-(line 1422,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.disableRuntimeTypeCheck()",
      "begin_line": 1425,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1426,col 5)-(line 1426,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGenerateExports(boolean)",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "",
      "child_ranges": [
        "(line 1430,col 5)-(line 1430,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAngularPass(boolean)",
      "begin_line": 1433,
      "end_line": 1435,
      "comment": "",
      "child_ranges": [
        "(line 1434,col 5)-(line 1434,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "",
      "child_ranges": [
        "(line 1438,col 5)-(line 1438,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getCodingConvention()",
      "begin_line": 1441,
      "end_line": 1443,
      "comment": "",
      "child_ranges": [
        "(line 1442,col 5)-(line 1442,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDependencyOptions(com.google.javascript.jscomp.DependencyOptions)",
      "begin_line": 1449,
      "end_line": 1452,
      "comment": "\n   * Sets dependency options. See the DependencyOptions class for more info.\n   * This supersedes manageClosureDependencies.\n   ",
      "child_ranges": [
        "(line 1450,col 5)-(line 1450,col 40)",
        "(line 1451,col 5)-(line 1451,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setManageClosureDependencies(boolean)",
      "begin_line": 1458,
      "end_line": 1465,
      "comment": "\n   * Sort inputs by their goog.provide/goog.require calls, and prune inputs\n   * whose symbols are not required.\n   ",
      "child_ranges": [
        "(line 1459,col 5)-(line 1460,col 62)",
        "(line 1461,col 5)-(line 1462,col 63)",
        "(line 1463,col 5)-(line 1463,col 48)",
        "(line 1464,col 5)-(line 1464,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setManageClosureDependencies(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1476,
      "end_line": 1480,
      "comment": "\n   * Sort inputs by their goog.provide/goog.require calls.\n   *\n   * @param entryPoints Entry points to the program. Must be goog.provide\u0027d\n   *     symbols. Any goog.provide\u0027d symbols that are not a transitive\n   *     dependency of the entry points will be deleted.\n   *     Files without goog.provides, and their dependencies,\n   *     will always be left in.\n   ",
      "child_ranges": [
        "(line 1477,col 5)-(line 1477,col 44)",
        "(line 1478,col 5)-(line 1478,col 39)",
        "(line 1479,col 5)-(line 1479,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSummaryDetailLevel(int)",
      "begin_line": 1489,
      "end_line": 1491,
      "comment": "\n   * Controls how detailed the compilation summary is. Values:\n   *  0 (never print summary), 1 (print summary only if there are\n   * errors or warnings), 2 (print summary if type checking is on,\n   * see --check_types), 3 (always print summary). The default level\n   * is 1\n   ",
      "child_ranges": [
        "(line 1490,col 5)-(line 1490,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enableExternExports(boolean)",
      "begin_line": 1496,
      "end_line": 1499,
      "comment": "\n   * @deprecated replaced by {@link #setExternExports}\n   ",
      "child_ranges": [
        "(line 1498,col 5)-(line 1498,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExtraAnnotationNames(java.lang.Iterable\u003cjava.lang.String\u003e)",
      "begin_line": 1501,
      "end_line": 1503,
      "comment": "",
      "child_ranges": [
        "(line 1502,col 5)-(line 1502,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.isExternExportsEnabled()",
      "begin_line": 1505,
      "end_line": 1507,
      "comment": "",
      "child_ranges": [
        "(line 1506,col 5)-(line 1506,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOutputCharset(java.lang.String)",
      "begin_line": 1512,
      "end_line": 1514,
      "comment": "\n   * Sets the output charset by name.\n   ",
      "child_ranges": [
        "(line 1513,col 5)-(line 1513,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getOutputCharset()",
      "begin_line": 1519,
      "end_line": 1521,
      "comment": "\n   * Gets the output charset as a rich object.\n   ",
      "child_ranges": [
        "(line 1520,col 5)-(line 1520,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing)",
      "begin_line": 1526,
      "end_line": 1528,
      "comment": "\n   * Sets how goog.tweak calls are processed.\n   ",
      "child_ranges": [
        "(line 1527,col 5)-(line 1527,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTweakProcessing()",
      "begin_line": 1530,
      "end_line": 1532,
      "comment": "",
      "child_ranges": [
        "(line 1531,col 5)-(line 1531,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode)",
      "begin_line": 1537,
      "end_line": 1540,
      "comment": "\n   * Sets how goog.tweak calls are processed.\n   ",
      "child_ranges": [
        "(line 1538,col 5)-(line 1538,col 33)",
        "(line 1539,col 5)-(line 1539,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getLanguageIn()",
      "begin_line": 1542,
      "end_line": 1544,
      "comment": "",
      "child_ranges": [
        "(line 1543,col 5)-(line 1543,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getLanguageOut()",
      "begin_line": 1546,
      "end_line": 1548,
      "comment": "",
      "child_ranges": [
        "(line 1547,col 5)-(line 1547,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLooseTypes(boolean)",
      "begin_line": 1557,
      "end_line": 1559,
      "comment": "\n   * Whether to include \"undefined\" in the default types.\n   *   For example:\n   *     \"{Object}\" is normally \"Object|null\" becomes \"Object|null|undefined\"\n   *     \"{?string}\" is normally \"string|null\" becomes \"string|null|undefined\"\n   * In either case \"!\" annotated types excluded both null and undefined.\n   ",
      "child_ranges": [
        "(line 1558,col 5)-(line 1558,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.clone()",
      "begin_line": 1561,
      "end_line": 1566,
      "comment": "",
      "child_ranges": [
        "(line 1563,col 5)-(line 1563,col 60)",
        "(line 1565,col 5)-(line 1565,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasTransformationHandler(com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)",
      "begin_line": 1568,
      "end_line": 1571,
      "comment": "",
      "child_ranges": [
        "(line 1570,col 5)-(line 1570,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getAliasTransformationHandler()",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "",
      "child_ranges": [
        "(line 1574,col 5)-(line 1574,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setErrorHandler(com.google.javascript.jscomp.ErrorHandler)",
      "begin_line": 1589,
      "end_line": 1591,
      "comment": "\n   * Set a custom handler for warnings and errors.\n   *\n   * This is mostly used for piping the warnings and errors to\n   * a file behind the scenes.\n   *\n   * If you want to filter warnings and errors, you should use a WarningsGuard.\n   *\n   * If you want to change how warnings and errors are reported to the user,\n   * you should set a ErrorManager on the Compiler. An ErrorManager is\n   * intended to summarize the errors for a single compile job.\n   ",
      "child_ranges": [
        "(line 1590,col 5)-(line 1590,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInferTypes(boolean)",
      "begin_line": 1597,
      "end_line": 1599,
      "comment": "\n   * If true, enables type inference. If checkTypes is enabled, this flag has\n   * no effect.\n   ",
      "child_ranges": [
        "(line 1598,col 5)-(line 1598,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getInferTypes()",
      "begin_line": 1605,
      "end_line": 1607,
      "comment": "\n   * Gets the inferTypes flag. Note that if checkTypes is enabled, this flag\n   * is ignored when configuring the compiler.\n   ",
      "child_ranges": [
        "(line 1606,col 5)-(line 1606,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.assumeStrictThis()",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "\n   * @return Whether assumeStrictThis is set.\n   ",
      "child_ranges": [
        "(line 1613,col 5)-(line 1613,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAssumeStrictThis(boolean)",
      "begin_line": 1619,
      "end_line": 1621,
      "comment": "\n   * If true, enables enables additional optimizations.\n   ",
      "child_ranges": [
        "(line 1620,col 5)-(line 1620,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.assumeClosuresOnlyCaptureReferences()",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\n   * @return Whether assumeClosuresOnlyCaptureReferences is set.\n   ",
      "child_ranges": [
        "(line 1627,col 5)-(line 1627,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAssumeClosuresOnlyCaptureReferences(boolean)",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n   * Whether to assume closures capture only what they reference. This allows\n   * more aggressive function inlining.\n   ",
      "child_ranges": [
        "(line 1635,col 5)-(line 1635,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyInvalidationErrors(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 1642,
      "end_line": 1646,
      "comment": "\n   * Sets the list of properties that we report property invalidation errors\n   * for.\n   ",
      "child_ranges": [
        "(line 1644,col 5)-(line 1645,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLanguageOut(com.google.javascript.jscomp.CompilerOptions.LanguageMode)",
      "begin_line": 1648,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1649,col 5)-(line 1649,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdeMode(boolean)",
      "begin_line": 1652,
      "end_line": 1654,
      "comment": "",
      "child_ranges": [
        "(line 1653,col 5)-(line 1653,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSaveDataStructures(boolean)",
      "begin_line": 1660,
      "end_line": 1662,
      "comment": "\n   * Whether to keep internal data structures around after we\u0027re\n   * finished compiling. We do this by default when IDE mode is on.\n   ",
      "child_ranges": [
        "(line 1661,col 5)-(line 1661,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSkipAllPasses(boolean)",
      "begin_line": 1664,
      "end_line": 1666,
      "comment": "",
      "child_ranges": [
        "(line 1665,col 5)-(line 1665,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDevMode(com.google.javascript.jscomp.CompilerOptions.DevMode)",
      "begin_line": 1668,
      "end_line": 1670,
      "comment": "",
      "child_ranges": [
        "(line 1669,col 5)-(line 1669,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckDeterminism(boolean)",
      "begin_line": 1672,
      "end_line": 1674,
      "comment": "",
      "child_ranges": [
        "(line 1673,col 5)-(line 1673,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getCheckDeterminism()",
      "begin_line": 1676,
      "end_line": 1678,
      "comment": "",
      "child_ranges": [
        "(line 1677,col 5)-(line 1677,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMessageBundle(com.google.javascript.jscomp.MessageBundle)",
      "begin_line": 1680,
      "end_line": 1682,
      "comment": "",
      "child_ranges": [
        "(line 1681,col 5)-(line 1681,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckSymbols(boolean)",
      "begin_line": 1684,
      "end_line": 1686,
      "comment": "",
      "child_ranges": [
        "(line 1685,col 5)-(line 1685,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckSuspiciousCode(boolean)",
      "begin_line": 1688,
      "end_line": 1690,
      "comment": "",
      "child_ranges": [
        "(line 1689,col 5)-(line 1689,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckControlStructures(boolean)",
      "begin_line": 1692,
      "end_line": 1694,
      "comment": "",
      "child_ranges": [
        "(line 1693,col 5)-(line 1693,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckTypes(boolean)",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "",
      "child_ranges": [
        "(line 1697,col 5)-(line 1697,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingGetCssNameBlacklist(java.lang.String)",
      "begin_line": 1700,
      "end_line": 1702,
      "comment": "",
      "child_ranges": [
        "(line 1701,col 5)-(line 1701,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAggressiveRenaming(boolean)",
      "begin_line": 1704,
      "end_line": 1706,
      "comment": "",
      "child_ranges": [
        "(line 1705,col 5)-(line 1705,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAlternateRenaming(boolean)",
      "begin_line": 1708,
      "end_line": 1710,
      "comment": "",
      "child_ranges": [
        "(line 1709,col 5)-(line 1709,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setFoldConstants(boolean)",
      "begin_line": 1712,
      "end_line": 1714,
      "comment": "",
      "child_ranges": [
        "(line 1713,col 5)-(line 1713,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDeadAssignmentElimination(boolean)",
      "begin_line": 1716,
      "end_line": 1718,
      "comment": "",
      "child_ranges": [
        "(line 1717,col 5)-(line 1717,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineConstantVars(boolean)",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "",
      "child_ranges": [
        "(line 1721,col 5)-(line 1721,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineFunctions(boolean)",
      "begin_line": 1724,
      "end_line": 1726,
      "comment": "",
      "child_ranges": [
        "(line 1725,col 5)-(line 1725,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineLocalFunctions(boolean)",
      "begin_line": 1728,
      "end_line": 1730,
      "comment": "",
      "child_ranges": [
        "(line 1729,col 5)-(line 1729,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCrossModuleCodeMotion(boolean)",
      "begin_line": 1732,
      "end_line": 1734,
      "comment": "",
      "child_ranges": [
        "(line 1733,col 5)-(line 1733,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCoalesceVariableNames(boolean)",
      "begin_line": 1736,
      "end_line": 1738,
      "comment": "",
      "child_ranges": [
        "(line 1737,col 5)-(line 1737,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCrossModuleMethodMotion(boolean)",
      "begin_line": 1740,
      "end_line": 1742,
      "comment": "",
      "child_ranges": [
        "(line 1741,col 5)-(line 1741,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineGetters(boolean)",
      "begin_line": 1744,
      "end_line": 1746,
      "comment": "",
      "child_ranges": [
        "(line 1745,col 5)-(line 1745,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineVariables(boolean)",
      "begin_line": 1748,
      "end_line": 1750,
      "comment": "",
      "child_ranges": [
        "(line 1749,col 5)-(line 1749,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineLocalVariables(boolean)",
      "begin_line": 1752,
      "end_line": 1754,
      "comment": "",
      "child_ranges": [
        "(line 1753,col 5)-(line 1753,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setFlowSensitiveInlineVariables(boolean)",
      "begin_line": 1756,
      "end_line": 1758,
      "comment": "",
      "child_ranges": [
        "(line 1757,col 5)-(line 1757,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSmartNameRemoval(boolean)",
      "begin_line": 1760,
      "end_line": 1762,
      "comment": "",
      "child_ranges": [
        "(line 1761,col 5)-(line 1761,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveDeadCode(boolean)",
      "begin_line": 1764,
      "end_line": 1766,
      "comment": "",
      "child_ranges": [
        "(line 1765,col 5)-(line 1765,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExtractPrototypeMemberDeclarations(boolean)",
      "begin_line": 1768,
      "end_line": 1770,
      "comment": "",
      "child_ranges": [
        "(line 1769,col 5)-(line 1769,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedPrototypeProperties(boolean)",
      "begin_line": 1772,
      "end_line": 1774,
      "comment": "",
      "child_ranges": [
        "(line 1773,col 5)-(line 1773,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedPrototypePropertiesInExterns(boolean)",
      "begin_line": 1776,
      "end_line": 1779,
      "comment": "",
      "child_ranges": [
        "(line 1778,col 5)-(line 1778,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVars(boolean)",
      "begin_line": 1781,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 5)-(line 1782,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedLocalVars(boolean)",
      "begin_line": 1785,
      "end_line": 1787,
      "comment": "",
      "child_ranges": [
        "(line 1786,col 5)-(line 1786,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasExternals(boolean)",
      "begin_line": 1789,
      "end_line": 1791,
      "comment": "",
      "child_ranges": [
        "(line 1790,col 5)-(line 1790,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseVariableDeclarations(boolean)",
      "begin_line": 1793,
      "end_line": 1795,
      "comment": "",
      "child_ranges": [
        "(line 1794,col 5)-(line 1794,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGroupVariableDeclarations(boolean)",
      "begin_line": 1797,
      "end_line": 1799,
      "comment": "",
      "child_ranges": [
        "(line 1798,col 5)-(line 1798,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseAnonymousFunctions(boolean)",
      "begin_line": 1801,
      "end_line": 1803,
      "comment": "",
      "child_ranges": [
        "(line 1802,col 5)-(line 1802,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasableStrings(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1805,
      "end_line": 1807,
      "comment": "",
      "child_ranges": [
        "(line 1806,col 5)-(line 1806,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasStringsBlacklist(java.lang.String)",
      "begin_line": 1809,
      "end_line": 1811,
      "comment": "",
      "child_ranges": [
        "(line 1810,col 5)-(line 1810,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasAllStrings(boolean)",
      "begin_line": 1813,
      "end_line": 1815,
      "comment": "",
      "child_ranges": [
        "(line 1814,col 5)-(line 1814,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOutputJsStringUsage(boolean)",
      "begin_line": 1817,
      "end_line": 1819,
      "comment": "",
      "child_ranges": [
        "(line 1818,col 5)-(line 1818,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setConvertToDottedProperties(boolean)",
      "begin_line": 1821,
      "end_line": 1823,
      "comment": "",
      "child_ranges": [
        "(line 1822,col 5)-(line 1822,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRewriteFunctionExpressions(boolean)",
      "begin_line": 1825,
      "end_line": 1827,
      "comment": "",
      "child_ranges": [
        "(line 1826,col 5)-(line 1826,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeParameters(boolean)",
      "begin_line": 1829,
      "end_line": 1831,
      "comment": "",
      "child_ranges": [
        "(line 1830,col 5)-(line 1830,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeReturns(boolean)",
      "begin_line": 1833,
      "end_line": 1835,
      "comment": "",
      "child_ranges": [
        "(line 1834,col 5)-(line 1834,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeCalls(boolean)",
      "begin_line": 1837,
      "end_line": 1839,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 5)-(line 1838,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeArgumentsArray(boolean)",
      "begin_line": 1841,
      "end_line": 1843,
      "comment": "",
      "child_ranges": [
        "(line 1842,col 5)-(line 1842,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setVariableRenaming(com.google.javascript.jscomp.VariableRenamingPolicy)",
      "begin_line": 1845,
      "end_line": 1847,
      "comment": "",
      "child_ranges": [
        "(line 1846,col 5)-(line 1846,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyRenaming(com.google.javascript.jscomp.PropertyRenamingPolicy)",
      "begin_line": 1849,
      "end_line": 1851,
      "comment": "",
      "child_ranges": [
        "(line 1850,col 5)-(line 1850,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLabelRenaming(boolean)",
      "begin_line": 1853,
      "end_line": 1855,
      "comment": "",
      "child_ranges": [
        "(line 1854,col 5)-(line 1854,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReserveRawExports(boolean)",
      "begin_line": 1857,
      "end_line": 1859,
      "comment": "",
      "child_ranges": [
        "(line 1858,col 5)-(line 1858,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGeneratePseudoNames(boolean)",
      "begin_line": 1861,
      "end_line": 1863,
      "comment": "",
      "child_ranges": [
        "(line 1862,col 5)-(line 1862,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamePrefix(java.lang.String)",
      "begin_line": 1865,
      "end_line": 1867,
      "comment": "",
      "child_ranges": [
        "(line 1866,col 5)-(line 1866,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamePrefixNamespace(java.lang.String)",
      "begin_line": 1869,
      "end_line": 1871,
      "comment": "",
      "child_ranges": [
        "(line 1870,col 5)-(line 1870,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasKeywords(boolean)",
      "begin_line": 1873,
      "end_line": 1875,
      "comment": "",
      "child_ranges": [
        "(line 1874,col 5)-(line 1874,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseProperties(boolean)",
      "begin_line": 1877,
      "end_line": 1879,
      "comment": "",
      "child_ranges": [
        "(line 1878,col 5)-(line 1878,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDevirtualizePrototypeMethods(boolean)",
      "begin_line": 1881,
      "end_line": 1883,
      "comment": "",
      "child_ranges": [
        "(line 1882,col 5)-(line 1882,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setComputeFunctionSideEffects(boolean)",
      "begin_line": 1885,
      "end_line": 1887,
      "comment": "",
      "child_ranges": [
        "(line 1886,col 5)-(line 1886,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDebugFunctionSideEffectsPath(java.lang.String)",
      "begin_line": 1889,
      "end_line": 1891,
      "comment": "",
      "child_ranges": [
        "(line 1890,col 5)-(line 1890,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.isDisambiguatePrivateProperties()",
      "begin_line": 1896,
      "end_line": 1898,
      "comment": "\n   * @return Whether disambiguate private properties is enabled.\n   ",
      "child_ranges": [
        "(line 1897,col 5)-(line 1897,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDisambiguatePrivateProperties(boolean)",
      "begin_line": 1904,
      "end_line": 1906,
      "comment": "\n   * @param value Whether to enable private property disambiguation based on\n   * the coding convention.\n   ",
      "child_ranges": [
        "(line 1905,col 5)-(line 1905,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDisambiguateProperties(boolean)",
      "begin_line": 1908,
      "end_line": 1910,
      "comment": "",
      "child_ranges": [
        "(line 1909,col 5)-(line 1909,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAmbiguateProperties(boolean)",
      "begin_line": 1912,
      "end_line": 1914,
      "comment": "",
      "child_ranges": [
        "(line 1913,col 5)-(line 1913,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAnonymousFunctionNaming(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy)",
      "begin_line": 1916,
      "end_line": 1919,
      "comment": "",
      "child_ranges": [
        "(line 1918,col 5)-(line 1918,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputAnonymousFunctionNamingMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1921,
      "end_line": 1923,
      "comment": "",
      "child_ranges": [
        "(line 1922,col 5)-(line 1922,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputVariableMapSerialized(byte[])",
      "begin_line": 1925,
      "end_line": 1929,
      "comment": "",
      "child_ranges": [
        "(line 1928,col 5)-(line 1928,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputVariableMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1931,
      "end_line": 1933,
      "comment": "",
      "child_ranges": [
        "(line 1932,col 5)-(line 1932,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputPropertyMapSerialized(byte[])",
      "begin_line": 1935,
      "end_line": 1939,
      "comment": "",
      "child_ranges": [
        "(line 1938,col 5)-(line 1938,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputPropertyMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "",
      "child_ranges": [
        "(line 1942,col 5)-(line 1942,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExportTestFunctions(boolean)",
      "begin_line": 1945,
      "end_line": 1947,
      "comment": "",
      "child_ranges": [
        "(line 1946,col 5)-(line 1946,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRuntimeTypeCheck(boolean)",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "",
      "child_ranges": [
        "(line 1950,col 5)-(line 1950,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRuntimeTypeCheckLogFunction(java.lang.String)",
      "begin_line": 1953,
      "end_line": 1955,
      "comment": "",
      "child_ranges": [
        "(line 1954,col 5)-(line 1954,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSyntheticBlockStartMarker(java.lang.String)",
      "begin_line": 1957,
      "end_line": 1959,
      "comment": "",
      "child_ranges": [
        "(line 1958,col 5)-(line 1958,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSyntheticBlockEndMarker(java.lang.String)",
      "begin_line": 1961,
      "end_line": 1963,
      "comment": "",
      "child_ranges": [
        "(line 1962,col 5)-(line 1962,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLocale(java.lang.String)",
      "begin_line": 1965,
      "end_line": 1967,
      "comment": "",
      "child_ranges": [
        "(line 1966,col 5)-(line 1966,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMarkAsCompiled(boolean)",
      "begin_line": 1969,
      "end_line": 1971,
      "comment": "",
      "child_ranges": [
        "(line 1970,col 5)-(line 1970,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveTryCatchFinally(boolean)",
      "begin_line": 1973,
      "end_line": 1975,
      "comment": "",
      "child_ranges": [
        "(line 1974,col 5)-(line 1974,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setClosurePass(boolean)",
      "begin_line": 1977,
      "end_line": 1979,
      "comment": "",
      "child_ranges": [
        "(line 1978,col 5)-(line 1978,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGatherCssNames(boolean)",
      "begin_line": 1981,
      "end_line": 1983,
      "comment": "",
      "child_ranges": [
        "(line 1982,col 5)-(line 1982,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripTypes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1985,
      "end_line": 1987,
      "comment": "",
      "child_ranges": [
        "(line 1986,col 5)-(line 1986,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripNameSuffixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1989,
      "end_line": 1991,
      "comment": "",
      "child_ranges": [
        "(line 1990,col 5)-(line 1990,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripNamePrefixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1993,
      "end_line": 1995,
      "comment": "",
      "child_ranges": [
        "(line 1994,col 5)-(line 1994,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripTypePrefixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1997,
      "end_line": 1999,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCustomPasses(com.google.common.collect.Multimap\u003ccom.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass\u003e)",
      "begin_line": 2001,
      "end_line": 2003,
      "comment": "",
      "child_ranges": [
        "(line 2002,col 5)-(line 2002,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMarkNoSideEffectCalls(boolean)",
      "begin_line": 2005,
      "end_line": 2007,
      "comment": "",
      "child_ranges": [
        "(line 2006,col 5)-(line 2006,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineReplacements(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 2009,
      "end_line": 2011,
      "comment": "",
      "child_ranges": [
        "(line 2010,col 5)-(line 2010,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakReplacements(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 2013,
      "end_line": 2015,
      "comment": "",
      "child_ranges": [
        "(line 2014,col 5)-(line 2014,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMoveFunctionDeclarations(boolean)",
      "begin_line": 2017,
      "end_line": 2019,
      "comment": "",
      "child_ranges": [
        "(line 2018,col 5)-(line 2018,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInstrumentationTemplate(java.lang.String)",
      "begin_line": 2021,
      "end_line": 2023,
      "comment": "",
      "child_ranges": [
        "(line 2022,col 5)-(line 2022,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRecordFunctionInformation(boolean)",
      "begin_line": 2025,
      "end_line": 2027,
      "comment": "",
      "child_ranges": [
        "(line 2026,col 5)-(line 2026,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 2029,
      "end_line": 2031,
      "comment": "",
      "child_ranges": [
        "(line 2030,col 5)-(line 2030,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCssRenamingWhitelist(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 2033,
      "end_line": 2035,
      "comment": "",
      "child_ranges": [
        "(line 2034,col 5)-(line 2034,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsFunctionDescriptions(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 2037,
      "end_line": 2041,
      "comment": "",
      "child_ranges": [
        "(line 2039,col 5)-(line 2040,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsPlaceholderToken(java.lang.String)",
      "begin_line": 2043,
      "end_line": 2047,
      "comment": "",
      "child_ranges": [
        "(line 2045,col 5)-(line 2046,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsReservedStrings(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 2049,
      "end_line": 2053,
      "comment": "",
      "child_ranges": [
        "(line 2051,col 5)-(line 2052,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsInputMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 2055,
      "end_line": 2057,
      "comment": "",
      "child_ranges": [
        "(line 2056,col 5)-(line 2056,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPrettyPrint(boolean)",
      "begin_line": 2059,
      "end_line": 2061,
      "comment": "",
      "child_ranges": [
        "(line 2060,col 5)-(line 2060,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLineBreak(boolean)",
      "begin_line": 2063,
      "end_line": 2065,
      "comment": "",
      "child_ranges": [
        "(line 2064,col 5)-(line 2064,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPreferLineBreakAtEndOfFile(boolean)",
      "begin_line": 2067,
      "end_line": 2069,
      "comment": "",
      "child_ranges": [
        "(line 2068,col 5)-(line 2068,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPrintInputDelimiter(boolean)",
      "begin_line": 2071,
      "end_line": 2073,
      "comment": "",
      "child_ranges": [
        "(line 2072,col 5)-(line 2072,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputDelimiter(java.lang.String)",
      "begin_line": 2075,
      "end_line": 2077,
      "comment": "",
      "child_ranges": [
        "(line 2076,col 5)-(line 2076,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTracer(com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 2079,
      "end_line": 2081,
      "comment": "",
      "child_ranges": [
        "(line 2080,col 5)-(line 2080,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setErrorFormat(com.google.javascript.jscomp.ErrorFormat)",
      "begin_line": 2083,
      "end_line": 2085,
      "comment": "",
      "child_ranges": [
        "(line 2084,col 5)-(line 2084,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setWarningsGuard(com.google.javascript.jscomp.ComposeWarningsGuard)",
      "begin_line": 2087,
      "end_line": 2089,
      "comment": "",
      "child_ranges": [
        "(line 2088,col 5)-(line 2088,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLineLengthThreshold(int)",
      "begin_line": 2091,
      "end_line": 2093,
      "comment": "",
      "child_ranges": [
        "(line 2092,col 5)-(line 2092,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExternExports(boolean)",
      "begin_line": 2095,
      "end_line": 2097,
      "comment": "",
      "child_ranges": [
        "(line 2096,col 5)-(line 2096,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExternExportsPath(java.lang.String)",
      "begin_line": 2099,
      "end_line": 2101,
      "comment": "",
      "child_ranges": [
        "(line 2100,col 5)-(line 2100,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapOutputPath(java.lang.String)",
      "begin_line": 2103,
      "end_line": 2105,
      "comment": "",
      "child_ranges": [
        "(line 2104,col 5)-(line 2104,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapDetailLevel(com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 2107,
      "end_line": 2109,
      "comment": "",
      "child_ranges": [
        "(line 2108,col 5)-(line 2108,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapFormat(com.google.javascript.jscomp.SourceMap.Format)",
      "begin_line": 2111,
      "end_line": 2113,
      "comment": "",
      "child_ranges": [
        "(line 2112,col 5)-(line 2112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapLocationMappings(java.util.List\u003ccom.google.javascript.jscomp.SourceMap.LocationMapping\u003e)",
      "begin_line": 2115,
      "end_line": 2118,
      "comment": "",
      "child_ranges": [
        "(line 2117,col 5)-(line 2117,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTransformAMDToCJSModules(boolean)",
      "begin_line": 2123,
      "end_line": 2125,
      "comment": "\n   * Activates transformation of AMD to CommonJS modules.\n   ",
      "child_ranges": [
        "(line 2124,col 5)-(line 2124,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProcessCommonJSModules(boolean)",
      "begin_line": 2131,
      "end_line": 2133,
      "comment": "\n   * Rewrites CommonJS modules so that modules can be concatenated together,\n   * by renaming all globals to avoid conflicting with other modules.\n   ",
      "child_ranges": [
        "(line 2132,col 5)-(line 2132,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCommonJSModulePathPrefix(java.lang.String)",
      "begin_line": 2138,
      "end_line": 2140,
      "comment": "\n   * Sets a path prefix for CommonJS modules.\n   ",
      "child_ranges": [
        "(line 2139,col 5)-(line 2139,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getInstrumentMemoryAllocations()",
      "begin_line": 2145,
      "end_line": 2147,
      "comment": "\n   * @return Whether memory allocations are instrumented.\n   ",
      "child_ranges": [
        "(line 2146,col 5)-(line 2146,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInstrumentMemoryAllocations(boolean)",
      "begin_line": 2152,
      "end_line": 2155,
      "comment": "\n   * Sets the option to instrument memory allocations.\n   ",
      "child_ranges": [
        "(line 2154,col 5)-(line 2154,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.LanguageMode.fromString(java.lang.String)",
      "begin_line": 2178,
      "end_line": 2190,
      "comment": "",
      "child_ranges": [
        "(line 2179,col 7)-(line 2188,col 7)",
        "(line 2189,col 7)-(line 2189,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TracerMode.isOn()",
      "begin_line": 2223,
      "end_line": 2225,
      "comment": "",
      "child_ranges": [
        "(line 2224,col 7)-(line 2224,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TweakProcessing.isOn()",
      "begin_line": 2234,
      "end_line": 2236,
      "comment": "",
      "child_ranges": [
        "(line 2235,col 7)-(line 2235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TweakProcessing.shouldStrip()",
      "begin_line": 2238,
      "end_line": 2240,
      "comment": "",
      "child_ranges": [
        "(line 2239,col 7)-(line 2239,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasTransformationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2256,
      "end_line": 2278,
      "comment": "\n   * A Role Specific Interface for JS Compiler that represents a data holder\n   * object which is used to store goog.scope alias code changes to code made\n   * during a compile. There is no guarantee that individual alias changes are\n   * invoked in the order they occur during compilation, so implementations\n   * should not assume any relevance to the order changes arrive.\n   * \u003cp\u003e\n   * Calls to the mutators are expected to resolve very quickly, so\n   * implementations should not perform expensive operations in the mutator\n   * methods.\n   *\n   * @author tylerg@google.com (Tyler Goodwin)\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 2276,
      "end_line": 2277,
      "comment": "\n     * Builds an AliasTransformation implementation and returns it to the\n     * caller.\n     * \u003cp\u003e\n     * Callers are allowed to request multiple AliasTransformation instances for\n     * the same file, though it is expected that the first and last char values\n     * for multiple instances will not overlap.\n     * \u003cp\u003e\n     * This method is expected to have a side-effect of storing off the created\n     * AliasTransformation, which guarantees that invokers of this interface\n     * cannot leak AliasTransformation to this implementation that the\n     * implementor did not create\n     *\n     * @param sourceFile the source file the aliases re contained in.\n     * @param position the region of the source file associated with the\n     *        goog.scope call. The item of the SourcePosition is the returned\n     *        AliasTransformation\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AliasTransformation",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2287,
      "end_line": 2299,
      "comment": "\n   * A Role Specific Interface for the JS Compiler to report aliases used to\n   * change the code during a compile.\n   * \u003cp\u003e\n   * While aliases defined by goog.scope are expected to by only 1 per file, and\n   * the only top-level structure in the file, this is not enforced.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.AliasTransformation.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 2298,
      "end_line": 2298,
      "comment": "\n     * Adds an alias definition to the AliasTransformation instance.\n     * \u003cp\u003e\n     * Last definition for a given alias is kept if an alias is inserted\n     * multiple times (since this is generally the behavior in JavaScript code).\n     *\n     * @param alias the name of the alias.\n     * @param definition the definition of the alias.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NULL_ALIAS_TRANSFORMATION_HANDLER"
      ],
      "begin_line": 2305,
      "end_line": 2306,
      "comment": "\n   * A Null implementation of the CodeChanges interface which performs all\n   * operations as a No-Op\n   "
    },
    {
      "type": "class_interface",
      "name": "NullAliasTransformationHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler",
        "java.io.Serializable"
      ],
      "begin_line": 2308,
      "end_line": 2330,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2310,
      "end_line": 2310,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NULL_ALIAS_TRANSFORMATION"
      ],
      "begin_line": 2312,
      "end_line": 2313,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 2315,
      "end_line": 2320,
      "comment": "",
      "child_ranges": [
        "(line 2318,col 7)-(line 2318,col 50)",
        "(line 2319,col 7)-(line 2319,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NullAliasTransformation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformation",
        "java.io.Serializable"
      ],
      "begin_line": 2322,
      "end_line": 2329,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2324,
      "end_line": 2324,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.NullAliasTransformation.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 2326,
      "end_line": 2328,
      "comment": "",
      "child_ranges": []
    }
  ]
}