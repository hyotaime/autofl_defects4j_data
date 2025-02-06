{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CompilerOptions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompilerOptions",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 40,
      "end_line": 2188,
      "comment": "\n * Compiler options\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "manageClosureDependencies"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " Unused. For people using reflection to circumvent access control."
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "languageIn"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * The JavaScript language version accepted.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "languageOut"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * The JavaScript language version that should be produced.\n   * Currently, this is always the same as {@link #languageIn}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "acceptConstKeyword"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n   * Whether the compiler accepts the `const\u0027 keyword.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assumeStrictThis"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n   * Whether the compiler should assume that a function\u0027s \"this\" value\n   * never needs coercion (for example in non-strict \"null\" or \"undefined\" will\n   * be coerced to the global \"this\" and primitives to objects).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ideMode"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Configures the compiler for use as an IDE backend.  In this mode:\n   * \u003cul\u003e\n   *  \u003cli\u003eNo optimization passes will run.\u003c/li\u003e\n   *  \u003cli\u003eThe last time custom passes are invoked is\n   *      {@link CustomPassExecutionTime#BEFORE_OPTIMIZATIONS}\u003c/li\u003e\n   *  \u003cli\u003eThe compiler will always try to process all inputs fully, even\n   *      if it encounters errors.\u003c/li\u003e\n   *  \u003cli\u003eThe compiler may record more information than is strictly\n   *      needed for codegen.\u003c/li\u003e\n   * \u003c/ul\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "saveDataStructures"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inferTypes"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n   * Even if checkTypes is disabled, clients might want to still infer types.\n   * This is mostly used when ideMode is enabled.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "skipAllPasses"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n   * Configures the compiler to skip as many passes as possible.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nameAnonymousFunctionsOnly"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n   * If true, name anonymous functions only. All others passes will be skipped.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "devMode"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n   * Configures the compiler to run expensive sanity checks after\n   * every pass. Only intended for internal development.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "dependencyOptions"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messageBundle"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Transient so that clients don\u0027t have to implement Serializable."
    },
    {
      "type": "field",
      "varNames": [
        "checkSymbols"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Checks that all symbols are defined "
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveVarCheck"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAggressiveVarCheck(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 139,
      "end_line": 141,
      "comment": " Checks for suspicious variable definitions and undefined variables ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkSuspiciousCode"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Checks for suspicious statements that have no effect "
    },
    {
      "type": "field",
      "varNames": [
        "checkControlStructures"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Checks for invalid control structures "
    },
    {
      "type": "field",
      "varNames": [
        "checkTypes"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Checks types on expressions "
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypes"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTightenTypes(boolean)",
      "begin_line": 155,
      "end_line": 157,
      "comment": " Tightens types based on a global analysis. Experimental. ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingOverride"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReportMissingOverride(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n   * Flags a warning if a property is missing the @override annotation, but it\n   * overrides a base class property.\n   ",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "reportUnknownTypes"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReportUnknownTypes(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 172,
      "end_line": 174,
      "comment": " Flags a warning for every node whose type could not be determined. ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRequires"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Checks for missing goog.require() calls *"
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckRequires(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkProvides"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckProvides(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 186,
      "end_line": 188,
      "comment": " Checks for missing goog.provides() calls *",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalNamesLevel"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckGlobalNamesLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n   * Checks the integrity of references to qualified global names.\n   * (e.g. \"a.b\")\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "brokenClosureRequiresLevel"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setBrokenClosureRequiresLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 203,
      "end_line": 205,
      "comment": " Sets the check level for bad Closure require calls. ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalThisLevel"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckGlobalThisLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n   * Checks for certain uses of the {@code this} keyword that are considered\n   * unsafe because they are likely to reference the global {@code this}\n   * object unintentionally.\n   *\n   * If this is off, but collapseProperties is on, then the compiler will\n   * usually ignore you and run this check anyways.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingGetCssNameLevel"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingGetCssNameLevel(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n   * Checks that certain string literals only appear in strings used as\n   * goog.getCssName arguments.\n   ",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingGetCssNameBlacklist"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n   * Regex of string literals that may only appear in goog.getCssName arguments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "checkCaja"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " Checks that the syntactic restrictions of Caja are met. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckCaja(boolean)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extraAnnotationNames"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n   * A set of extra annotation names which are accepted and silently ignored\n   * when encountered in a source file. Defaults to null which has the same\n   * effect as specifying an empty set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "foldConstants"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " Folds constants (e.g. (2 + 3) to 5) "
    },
    {
      "type": "field",
      "varNames": [
        "deadAssignmentElimination"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Remove assignments to values that can not be referenced "
    },
    {
      "type": "field",
      "varNames": [
        "inlineConstantVars"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " Inlines constants (symbols that are all CAPS) "
    },
    {
      "type": "field",
      "varNames": [
        "inlineFunctions"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " Inlines global functions "
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalFunctions"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " Inlines functions defined in local scopes "
    },
    {
      "type": "field",
      "varNames": [
        "inlineProperties"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Inlines properties "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleCodeMotion"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " Move code to a deeper module "
    },
    {
      "type": "field",
      "varNames": [
        "coalesceVariableNames"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Merge two variables together as one. "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleMethodMotion"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " Move methods to a deeper module "
    },
    {
      "type": "field",
      "varNames": [
        "inlineGetters"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " Inlines trivial getters "
    },
    {
      "type": "field",
      "varNames": [
        "inlineVariables"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " Inlines variables "
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalVariables"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " Inlines variables "
    },
    {
      "type": "field",
      "varNames": [
        "flowSensitiveInlineVariables"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Remove this."
    },
    {
      "type": "field",
      "varNames": [
        "smartNameRemoval"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Removes code associated with unused global names "
    },
    {
      "type": "field",
      "varNames": [
        "removeDeadCode"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Removes code that will never execute "
    },
    {
      "type": "field",
      "varNames": [
        "checkUnreachableCode"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckUnreachableCode(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 303,
      "end_line": 305,
      "comment": " Checks for unreachable code ",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkMissingReturn"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingReturn(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 310,
      "end_line": 312,
      "comment": " Checks for missing return statements ",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extractPrototypeMemberDeclarations"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Extracts common prototype member declarations "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypeProperties"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Removes unused member prototypes "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypePropertiesInExterns"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Tells AnalyzePrototypeProperties it can remove externed props. "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedClassProperties"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Removes unused member properties "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedVars"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Removes unused variables "
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedLocalVars"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Removes unused variables in local scope. "
    },
    {
      "type": "field",
      "varNames": [
        "aliasExternals"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Adds variable aliases for externals to reduce code size "
    },
    {
      "type": "field",
      "varNames": [
        "aliasableGlobals"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasableGlobals(java.lang.String)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n   * A comma separated white-list of global names. When {@link #aliasExternals}\n   * is enable, if set to a non-empty string, only externals with these names\n   * will be considered for aliasing.\n   ",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "unaliasableGlobals"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setUnaliasableGlobals(java.lang.String)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n   * A comma separated white-list of global names. When {@link #aliasExternals}\n   * is enable, these global names will not be aliased.\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseVariableDeclarations"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " Collapses multiple variable declarations into one "
    },
    {
      "type": "field",
      "varNames": [
        "groupVariableDeclarations"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " Group multiple variable declarations into one "
    },
    {
      "type": "field",
      "varNames": [
        "collapseAnonymousFunctions"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": "\n   * Collapses anonymous function declarations into named function\n   * declarations\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasableStrings"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": "\n   * If set to a non-empty set, those strings literals will be aliased to a\n   * single global instance per string, to avoid creating more objects than\n   * necessary.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasStringsBlacklist"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": "\n   * A blacklist in the form of a regular expression to block strings that\n   * contains certain words from being aliased.\n   * If the value is the empty string, no words are blacklisted.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasAllStrings"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": "\n   * Aliases all string literals to global instances, to avoid creating more\n   * objects than necessary (if true, overrides any set of strings passed in\n   * to aliasableStrings)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "outputJsStringUsage"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Print string usage as part of the compilation log. "
    },
    {
      "type": "field",
      "varNames": [
        "convertToDottedProperties"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Converts quoted property accesses to dot syntax (a[\u0027b\u0027] -\u003e a.b) "
    },
    {
      "type": "field",
      "varNames": [
        "rewriteFunctionExpressions"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Reduces the size of common function expressions. "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeParameters"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": "\n   * Remove unused and constant parameters.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeReturns"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": "\n   * Remove unused return values.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeCalls"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": "\n   * Remove unused parameters from call sites.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "optimizeArgumentsArray"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": "\n   * Provide formal names for elements of arguments array.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "chainCalls"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": " Chains calls to functions that return this. "
    },
    {
      "type": "field",
      "varNames": [
        "variableRenaming"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Controls which variables get renamed. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyRenaming"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " Controls which properties get renamed. "
    },
    {
      "type": "field",
      "varNames": [
        "propertyAffinity"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " Should we use affinity information when generating property names. "
    },
    {
      "type": "field",
      "varNames": [
        "labelRenaming"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": " Controls label renaming. "
    },
    {
      "type": "field",
      "varNames": [
        "reserveRawExports"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " Reserve property names on the global this object. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowVariables"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Should shadow variable names in outer scope. "
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": "\n   * Generate pseudo names for variables and properties for debugging purposes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "renamePrefix"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": " Specifies a prefix for all globals "
    },
    {
      "type": "field",
      "varNames": [
        "renamePrefixNamespace"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": "\n   * Specifies the name of an object that will be used to store all non-extern\n   * globals.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasKeywords"
      ],
      "begin_line": 458,
      "end_line": 458,
      "comment": " Aliases true, false, and null to variables with shorter names. "
    },
    {
      "type": "field",
      "varNames": [
        "collapseProperties"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": " Flattens multi-level property names (e.g. a$b \u003d x) "
    },
    {
      "type": "field",
      "varNames": [
        "collapseObjectLiterals"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": " Split object literals into individual variables when possible. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseObjectLiterals(boolean)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 467,col 5)-(line 467,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapsePropertiesOnExternTypes"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": " Flattens multi-level property names on extern types (e.g. String$f \u003d x) "
    },
    {
      "type": "field",
      "varNames": [
        "devirtualizePrototypeMethods"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\n   * Devirtualize prototype method by rewriting them to be static calls that\n   * take the this pointer as their first argument\n   "
    },
    {
      "type": "field",
      "varNames": [
        "computeFunctionSideEffects"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": "\n   * Use @nosideeffects annotations, function bodies and name graph\n   * to determine if calls have side effects.  Requires --check_types.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "debugFunctionSideEffectsPath"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": "\n   * Where to save debug report for compute function side effects.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "disambiguateProperties"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": "\n   * Rename properties to disambiguate between unrelated fields based on\n   * type information.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "ambiguateProperties"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": " Rename unrelated properties to the same name to reduce code size. "
    },
    {
      "type": "field",
      "varNames": [
        "anonymousFunctionNaming"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": " Give anonymous functions names for easier debugging "
    },
    {
      "type": "field",
      "varNames": [
        "inputAnonymousFunctionNamingMap"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": " Input anonymous function renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "inputVariableMap"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": " Input variable renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "inputPropertyMap"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": " Input property renaming map. "
    },
    {
      "type": "field",
      "varNames": [
        "exportTestFunctions"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": " Whether to export test functions. "
    },
    {
      "type": "field",
      "varNames": [
        "specializeInitialModule"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSpecializeInitialModule(boolean)",
      "begin_line": 517,
      "end_line": 519,
      "comment": " Specialize the initial module at the cost of later modules ",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessagesWithChromeI18n"
      ],
      "begin_line": 529,
      "end_line": 529,
      "comment": "\n   * Replace UI strings with chrome.i18n.getMessage calls.\n   * Used by Chrome extensions/apps.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tcProjectId"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceMessagesWithChromeI18n(boolean, java.lang.String)",
      "begin_line": 532,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 535,col 5)-(line 540,col 5)",
        "(line 542,col 5)-(line 542,col 71)",
        "(line 543,col 5)-(line 543,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheck"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": " Inserts run-time type assertions for debugging. "
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheckLogFunction"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": "\n   * A JS function to be used for logging run-time type assertion\n   * failures. It will be passed the warning as a string and the\n   * faulty expression as arguments.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 557,
      "end_line": 557,
      "comment": " A CodingConvention to use during the compile. "
    },
    {
      "type": "field",
      "varNames": [
        "ignoreCajaProperties"
      ],
      "begin_line": 559,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIgnoreCajaProperties(boolean)",
      "begin_line": 562,
      "end_line": 564,
      "comment": " Add code to skip properties that Caja adds to Object.prototype ",
      "child_ranges": [
        "(line 563,col 5)-(line 563,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "syntheticBlockStartMarker"
      ],
      "begin_line": 566,
      "end_line": 566,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntheticBlockEndMarker"
      ],
      "begin_line": 568,
      "end_line": 568,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": " Compiling locale "
    },
    {
      "type": "field",
      "varNames": [
        "markAsCompiled"
      ],
      "begin_line": 574,
      "end_line": 574,
      "comment": " Sets the special \"COMPILED\" value to true "
    },
    {
      "type": "field",
      "varNames": [
        "removeTryCatchFinally"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": " Removes try...catch...finally blocks for easier debugging "
    },
    {
      "type": "field",
      "varNames": [
        "closurePass"
      ],
      "begin_line": 580,
      "end_line": 580,
      "comment": " Processes goog.provide() and goog.require() calls "
    },
    {
      "type": "field",
      "varNames": [
        "jqueryPass"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": " Processes jQuery aliases "
    },
    {
      "type": "field",
      "varNames": [
        "removeAbstractMethods"
      ],
      "begin_line": 586,
      "end_line": 586,
      "comment": " Remove goog.abstractMethod assignments. "
    },
    {
      "type": "field",
      "varNames": [
        "removeClosureAsserts"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": " Remove goog.asserts calls. "
    },
    {
      "type": "field",
      "varNames": [
        "gatherCssNames"
      ],
      "begin_line": 592,
      "end_line": 592,
      "comment": " Gather CSS names (requires closurePass) "
    },
    {
      "type": "field",
      "varNames": [
        "stripTypes"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": " Names of types to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripNameSuffixes"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": " Name suffixes that determine which variables and properties to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripNamePrefixes"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": " Name prefixes that determine which variables and properties to strip "
    },
    {
      "type": "field",
      "varNames": [
        "stripTypePrefixes"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": " Qualified type name prefixes that determine which types to strip "
    },
    {
      "type": "field",
      "varNames": [
        "customPasses"
      ],
      "begin_line": 607,
      "end_line": 608,
      "comment": " Custom passes "
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffectCalls"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": " Mark no side effect calls "
    },
    {
      "type": "field",
      "varNames": [
        "defineReplacements"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": " Replacements for @defines. Will be Boolean, Numbers, or Strings "
    },
    {
      "type": "field",
      "varNames": [
        "tweakProcessing"
      ],
      "begin_line": 617,
      "end_line": 617,
      "comment": " What kind of processing to do for goog.tweak functions. "
    },
    {
      "type": "field",
      "varNames": [
        "tweakReplacements"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": " Replacements for tweaks. Will be Boolean, Numbers, or Strings "
    },
    {
      "type": "field",
      "varNames": [
        "moveFunctionDeclarations"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": " Move top-level function declarations to the top "
    },
    {
      "type": "field",
      "varNames": [
        "instrumentationTemplate"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": " Instrumentation template to use with #recordFunctionInformation "
    },
    {
      "type": "field",
      "varNames": [
        "appNameStr"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAppNameStr(java.lang.String)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n   * App identifier string for use by the instrumentation template\u0027s\n   * app_name_setter. @see #instrumentationTemplate\n   ",
      "child_ranges": [
        "(line 635,col 5)-(line 635,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "recordFunctionInformation"
      ],
      "begin_line": 639,
      "end_line": 639,
      "comment": " Record function information "
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cssRenamingMap"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": " Map used in the renaming of CSS class names. "
    },
    {
      "type": "field",
      "varNames": [
        "cssRenamingWhitelist"
      ],
      "begin_line": 647,
      "end_line": 647,
      "comment": " Whitelist used in the renaming of CSS class names. "
    },
    {
      "type": "field",
      "varNames": [
        "processObjectPropertyString"
      ],
      "begin_line": 650,
      "end_line": 650,
      "comment": " Process instances of goog.testing.ObjectPropertyString. "
    },
    {
      "type": "field",
      "varNames": [
        "replaceIdGenerators"
      ],
      "begin_line": 653,
      "end_line": 653,
      "comment": " true by default for legacy reasons."
    },
    {
      "type": "field",
      "varNames": [
        "idGenerators"
      ],
      "begin_line": 656,
      "end_line": 656,
      "comment": " Id generators to replace. "
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorsMapSerialized"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": "\n   * A previous map of ids (serialized to a string by a previous compile).\n   * This will be used as a hint during the ReplaceIdGenerators pass, which\n   * will attempt to reuse the same ids.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsFunctionDescriptions"
      ],
      "begin_line": 666,
      "end_line": 666,
      "comment": " Configuration strings "
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsPlaceholderToken"
      ],
      "begin_line": 668,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsReservedStrings"
      ],
      "begin_line": 670,
      "end_line": 670,
      "comment": " A list of strings that should not be used as replacements"
    },
    {
      "type": "field",
      "varNames": [
        "replaceStringsInputMap"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": " A previous map of replacements to strings."
    },
    {
      "type": "field",
      "varNames": [
        "propertyInvalidationErrors"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": " List of properties that we report invalidation errors for. "
    },
    {
      "type": "field",
      "varNames": [
        "transformAMDToCJSModules"
      ],
      "begin_line": 678,
      "end_line": 678,
      "comment": " Transform AMD to CommonJS modules. "
    },
    {
      "type": "field",
      "varNames": [
        "processCommonJSModules"
      ],
      "begin_line": 681,
      "end_line": 681,
      "comment": " Rewrite CommonJS modules so that they can be concatenated together. "
    },
    {
      "type": "field",
      "varNames": [
        "commonJSModulePathPrefix"
      ],
      "begin_line": 684,
      "end_line": 685,
      "comment": " CommonJS module prefix. "
    },
    {
      "type": "field",
      "varNames": [
        "prettyPrint"
      ],
      "begin_line": 693,
      "end_line": 693,
      "comment": " Output in pretty indented format "
    },
    {
      "type": "field",
      "varNames": [
        "lineBreak"
      ],
      "begin_line": 696,
      "end_line": 696,
      "comment": " Line break the output a bit more aggressively "
    },
    {
      "type": "field",
      "varNames": [
        "preferLineBreakAtEndOfFile"
      ],
      "begin_line": 699,
      "end_line": 699,
      "comment": " Prefer line breaks at end of file "
    },
    {
      "type": "field",
      "varNames": [
        "printInputDelimiter"
      ],
      "begin_line": 702,
      "end_line": 702,
      "comment": " Prints a separator comment before each JS script "
    },
    {
      "type": "field",
      "varNames": [
        "inputDelimiter"
      ],
      "begin_line": 705,
      "end_line": 705,
      "comment": " The string to use as the separator for printInputDelimiter "
    },
    {
      "type": "field",
      "varNames": [
        "preferSingleQuotes"
      ],
      "begin_line": 707,
      "end_line": 707,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPreferSingleQuotes(boolean)",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n   * Normally, when there are an equal number of single and double quotes\n   * in a string, the compiler will use double quotes. Set this to true\n   * to prefer single quotes.\n   ",
      "child_ranges": [
        "(line 715,col 5)-(line 715,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "trustedStrings"
      ],
      "begin_line": 718,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTrustedStrings(boolean)",
      "begin_line": 726,
      "end_line": 728,
      "comment": "\n   * Some people want to put arbitrary user input into strings, which are then\n   * run through the compiler. These scripts are then put into HTML.\n   * By default, we assume strings are untrusted. If the compiler is run\n   * from the command-line, we assume that strings are trusted.\n   ",
      "child_ranges": [
        "(line 727,col 5)-(line 727,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "reportPath"
      ],
      "begin_line": 730,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReportPath(java.lang.String)",
      "begin_line": 733,
      "end_line": 735,
      "comment": " Where to save a report of global name usage ",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tracer"
      ],
      "begin_line": 737,
      "end_line": 737,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTracerMode()",
      "begin_line": 739,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 740,col 5)-(line 740,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTracerMode(com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 743,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 744,col 5)-(line 744,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "colorizeErrorOutput"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorFormat"
      ],
      "begin_line": 749,
      "end_line": 749,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningsGuard"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 753,
      "end_line": 753,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLengthThreshold"
      ],
      "begin_line": 755,
      "end_line": 755,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externExports"
      ],
      "begin_line": 765,
      "end_line": 765,
      "comment": "\n   * Whether the exports should be made available via {@link Result} after\n   * compilation. This is implicitly true if {@link #externExportsPath} is set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "externExportsPath"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": " The output path for the created externs file. "
    },
    {
      "type": "field",
      "varNames": [
        "nameReferenceReportPath"
      ],
      "begin_line": 770,
      "end_line": 770,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameReferenceReportPath(java.lang.String)",
      "begin_line": 773,
      "end_line": 775,
      "comment": " Where to save a cross-reference report from the name reference graph ",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameReferenceGraphPath"
      ],
      "begin_line": 777,
      "end_line": 777,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameReferenceGraphPath(java.lang.String)",
      "begin_line": 780,
      "end_line": 782,
      "comment": " Where to save the name reference graph ",
      "child_ranges": [
        "(line 781,col 5)-(line 781,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapOutputPath"
      ],
      "begin_line": 789,
      "end_line": 789,
      "comment": " The output path for the source map. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 792,
      "end_line": 793,
      "comment": " The detail level for the generated source map. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFormat"
      ],
      "begin_line": 796,
      "end_line": 797,
      "comment": " The source map file format "
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapLocationMappings"
      ],
      "begin_line": 799,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputCharset"
      ],
      "begin_line": 806,
      "end_line": 806,
      "comment": "\n   * Charset to use when generating code.  If null, then output ASCII.\n   * This needs to be a string because CompilerOptions is serializable.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "looseTypes"
      ],
      "begin_line": 811,
      "end_line": 811,
      "comment": "\n   * Whether the named objects types included \u0027undefined\u0027 by default.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "protectHiddenSideEffects"
      ],
      "begin_line": 816,
      "end_line": 816,
      "comment": "\n   * When set, assume that apparently side-effect free code is meaningful.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProtectHiddenSideEffects(boolean)",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n   * When enabled, assume that apparently side-effect free code is meaningful.\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 822,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasHandler"
      ],
      "begin_line": 828,
      "end_line": 828,
      "comment": "\n   * Data holder Alias Transformation information accumulated during a compile.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "errorHandler"
      ],
      "begin_line": 833,
      "end_line": 833,
      "comment": "\n   * Handler for compiler warnings and errors.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CompilerOptions.CompilerOptions()",
      "begin_line": 841,
      "end_line": 980,
      "comment": "\n   * Initializes compiler options. All options are disabled by default.\n   *\n   * Command-line frontends to the compiler should set these properties\n   * like a builder.\n   ",
      "child_ranges": [
        "(line 843,col 5)-(line 843,col 42)",
        "(line 846,col 5)-(line 846,col 31)",
        "(line 849,col 5)-(line 849,col 26)",
        "(line 850,col 5)-(line 850,col 39)",
        "(line 851,col 5)-(line 851,col 26)",
        "(line 852,col 5)-(line 852,col 25)",
        "(line 853,col 5)-(line 853,col 40)",
        "(line 854,col 5)-(line 854,col 32)",
        "(line 855,col 5)-(line 855,col 35)",
        "(line 856,col 5)-(line 856,col 23)",
        "(line 857,col 5)-(line 857,col 25)",
        "(line 858,col 5)-(line 858,col 43)",
        "(line 859,col 5)-(line 859,col 40)",
        "(line 860,col 5)-(line 860,col 35)",
        "(line 861,col 5)-(line 861,col 35)",
        "(line 862,col 5)-(line 862,col 43)",
        "(line 863,col 5)-(line 863,col 50)",
        "(line 864,col 5)-(line 864,col 42)",
        "(line 865,col 5)-(line 865,col 42)",
        "(line 866,col 5)-(line 866,col 40)",
        "(line 867,col 5)-(line 867,col 49)",
        "(line 868,col 5)-(line 868,col 43)",
        "(line 869,col 5)-(line 869,col 22)",
        "(line 870,col 5)-(line 870,col 39)",
        "(line 871,col 5)-(line 871,col 23)",
        "(line 872,col 5)-(line 872,col 32)",
        "(line 875,col 5)-(line 875,col 26)",
        "(line 876,col 5)-(line 876,col 34)",
        "(line 877,col 5)-(line 877,col 38)",
        "(line 878,col 5)-(line 878,col 31)",
        "(line 879,col 5)-(line 879,col 28)",
        "(line 880,col 5)-(line 880,col 33)",
        "(line 881,col 5)-(line 881,col 29)",
        "(line 882,col 5)-(line 882,col 29)",
        "(line 883,col 5)-(line 883,col 34)",
        "(line 884,col 5)-(line 884,col 36)",
        "(line 885,col 5)-(line 885,col 26)",
        "(line 886,col 5)-(line 886,col 28)",
        "(line 887,col 5)-(line 887,col 33)",
        "(line 888,col 5)-(line 888,col 29)",
        "(line 889,col 5)-(line 889,col 27)",
        "(line 890,col 5)-(line 890,col 47)",
        "(line 891,col 5)-(line 891,col 44)",
        "(line 892,col 5)-(line 892,col 53)",
        "(line 893,col 5)-(line 893,col 40)",
        "(line 894,col 5)-(line 894,col 29)",
        "(line 895,col 5)-(line 895,col 34)",
        "(line 896,col 5)-(line 896,col 27)",
        "(line 897,col 5)-(line 897,col 41)",
        "(line 898,col 5)-(line 898,col 38)",
        "(line 899,col 5)-(line 899,col 39)",
        "(line 900,col 5)-(line 900,col 46)",
        "(line 901,col 5)-(line 901,col 31)",
        "(line 902,col 5)-(line 902,col 28)",
        "(line 903,col 5)-(line 903,col 32)",
        "(line 904,col 5)-(line 904,col 38)",
        "(line 905,col 5)-(line 905,col 39)",
        "(line 906,col 5)-(line 906,col 31)",
        "(line 907,col 5)-(line 907,col 28)",
        "(line 910,col 5)-(line 910,col 50)",
        "(line 911,col 5)-(line 911,col 50)",
        "(line 912,col 5)-(line 912,col 29)",
        "(line 913,col 5)-(line 913,col 26)",
        "(line 914,col 5)-(line 914,col 32)",
        "(line 915,col 5)-(line 915,col 28)",
        "(line 916,col 5)-(line 916,col 24)",
        "(line 917,col 5)-(line 917,col 26)",
        "(line 918,col 5)-(line 918,col 31)",
        "(line 919,col 5)-(line 919,col 44)",
        "(line 920,col 5)-(line 920,col 35)",
        "(line 921,col 5)-(line 921,col 41)",
        "(line 922,col 5)-(line 922,col 35)",
        "(line 923,col 5)-(line 923,col 32)",
        "(line 924,col 5)-(line 924,col 64)",
        "(line 925,col 5)-(line 925,col 32)",
        "(line 928,col 5)-(line 928,col 29)",
        "(line 929,col 5)-(line 929,col 39)",
        "(line 930,col 5)-(line 930,col 33)",
        "(line 931,col 5)-(line 931,col 37)",
        "(line 932,col 5)-(line 932,col 35)",
        "(line 933,col 5)-(line 933,col 18)",
        "(line 934,col 5)-(line 934,col 27)",
        "(line 935,col 5)-(line 935,col 34)",
        "(line 936,col 5)-(line 936,col 24)",
        "(line 937,col 5)-(line 937,col 23)",
        "(line 938,col 5)-(line 938,col 33)",
        "(line 939,col 5)-(line 939,col 33)",
        "(line 940,col 5)-(line 940,col 40)",
        "(line 941,col 5)-(line 941,col 47)",
        "(line 942,col 5)-(line 942,col 47)",
        "(line 943,col 5)-(line 943,col 47)",
        "(line 944,col 5)-(line 944,col 24)",
        "(line 945,col 5)-(line 945,col 34)",
        "(line 946,col 5)-(line 946,col 43)",
        "(line 947,col 5)-(line 947,col 42)",
        "(line 948,col 5)-(line 948,col 42)",
        "(line 949,col 5)-(line 949,col 37)",
        "(line 950,col 5)-(line 950,col 35)",
        "(line 951,col 5)-(line 951,col 20)",
        "(line 952,col 5)-(line 952,col 38)",
        "(line 953,col 5)-(line 953,col 28)",
        "(line 954,col 5)-(line 954,col 26)",
        "(line 955,col 5)-(line 955,col 32)",
        "(line 956,col 5)-(line 956,col 40)",
        "(line 957,col 5)-(line 957,col 42)",
        "(line 958,col 5)-(line 958,col 65)",
        "(line 959,col 5)-(line 959,col 40)",
        "(line 960,col 5)-(line 960,col 59)",
        "(line 961,col 5)-(line 961,col 51)",
        "(line 964,col 5)-(line 964,col 32)",
        "(line 965,col 5)-(line 965,col 24)",
        "(line 966,col 5)-(line 966,col 22)",
        "(line 967,col 5)-(line 967,col 39)",
        "(line 968,col 5)-(line 968,col 22)",
        "(line 969,col 5)-(line 969,col 28)",
        "(line 970,col 5)-(line 970,col 32)",
        "(line 971,col 5)-(line 971,col 41)",
        "(line 972,col 5)-(line 972,col 40)",
        "(line 973,col 5)-(line 973,col 26)",
        "(line 974,col 5)-(line 974,col 35)",
        "(line 975,col 5)-(line 975,col 34)",
        "(line 978,col 5)-(line 978,col 53)",
        "(line 979,col 5)-(line 979,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.isRemoveUnusedClassProperties()",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\n   * @return Whether to attempt to remove unused class properties\n   ",
      "child_ranges": [
        "(line 986,col 5)-(line 986,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedClassProperties(boolean)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "\n   * @param removeUnusedClassProperties Whether to attempt to remove\n   *      unused class properties\n   ",
      "child_ranges": [
        "(line 994,col 5)-(line 994,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getDefineReplacements()",
      "begin_line": 1000,
      "end_line": 1002,
      "comment": "\n   * Returns the map of define replacements.\n   ",
      "child_ranges": [
        "(line 1001,col 5)-(line 1001,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTweakReplacements()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n   * Returns the map of tweak replacements.\n   ",
      "child_ranges": [
        "(line 1008,col 5)-(line 1008,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getReplacementsHelper(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 1014,
      "end_line": 1032,
      "comment": "\n   * Creates a map of String-\u003eNode from a map of String-\u003eNumber/String/Boolean.\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1016,col 46)",
        "(line 1017,col 5)-(line 1030,col 5)",
        "(line 1031,col 5)-(line 1031,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToBooleanLiteral(java.lang.String, boolean)",
      "begin_line": 1038,
      "end_line": 1040,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS\n   * to a boolean literal.\n   ",
      "child_ranges": [
        "(line 1039,col 5)-(line 1039,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToStringLiteral(java.lang.String, java.lang.String)",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * String literal.\n   ",
      "child_ranges": [
        "(line 1047,col 5)-(line 1047,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToNumberLiteral(java.lang.String, int)",
      "begin_line": 1054,
      "end_line": 1056,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1055,col 5)-(line 1055,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineToDoubleLiteral(java.lang.String, double)",
      "begin_line": 1062,
      "end_line": 1064,
      "comment": "\n   * Sets the value of the {@code @define} variable in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1063,col 5)-(line 1063,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToBooleanLiteral(java.lang.String, boolean)",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n   * Sets the value of the tweak in JS\n   * to a boolean literal.\n   ",
      "child_ranges": [
        "(line 1071,col 5)-(line 1071,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToStringLiteral(java.lang.String, java.lang.String)",
      "begin_line": 1078,
      "end_line": 1080,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * String literal.\n   ",
      "child_ranges": [
        "(line 1079,col 5)-(line 1079,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToNumberLiteral(java.lang.String, int)",
      "begin_line": 1086,
      "end_line": 1088,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1087,col 5)-(line 1087,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakToDoubleLiteral(java.lang.String, double)",
      "begin_line": 1094,
      "end_line": 1096,
      "comment": "\n   * Sets the value of the tweak in JS to a\n   * number literal.\n   ",
      "child_ranges": [
        "(line 1095,col 5)-(line 1095,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.skipAllCompilerPasses()",
      "begin_line": 1101,
      "end_line": 1103,
      "comment": "\n   * Skip all possible passes, to make the compiler as fast as possible.\n   ",
      "child_ranges": [
        "(line 1102,col 5)-(line 1102,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 1109,
      "end_line": 1111,
      "comment": "\n   * Whether the warnings guard in this Options object enables the given\n   * group of warnings.\n   ",
      "child_ranges": [
        "(line 1110,col 5)-(line 1110,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.disables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 1117,
      "end_line": 1119,
      "comment": "\n   * Whether the warnings guard in this Options object disables the given\n   * group of warnings.\n   ",
      "child_ranges": [
        "(line 1118,col 5)-(line 1118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setWarningLevel(com.google.javascript.jscomp.DiagnosticGroup, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 1124,
      "end_line": 1126,
      "comment": "\n   * Configure the given type of warning to the given level.\n   ",
      "child_ranges": [
        "(line 1125,col 5)-(line 1125,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getWarningsGuard()",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 5)-(line 1129,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.resetWarningsGuard()",
      "begin_line": 1135,
      "end_line": 1137,
      "comment": "\n   * Reset the warnings guard.\n   ",
      "child_ranges": [
        "(line 1136,col 5)-(line 1136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.useEmergencyFailSafe()",
      "begin_line": 1143,
      "end_line": 1145,
      "comment": "\n   * The emergency fail safe removes all strict and ERROR-escalating\n   * warnings guards.\n   ",
      "child_ranges": [
        "(line 1144,col 5)-(line 1144,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.addWarningsGuard(com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 1150,
      "end_line": 1152,
      "comment": "\n   * Add a guard to the set of warnings guards.\n   ",
      "child_ranges": [
        "(line 1151,col 5)-(line 1151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamingPolicy(com.google.javascript.jscomp.VariableRenamingPolicy, com.google.javascript.jscomp.PropertyRenamingPolicy)",
      "begin_line": 1159,
      "end_line": 1163,
      "comment": "\n   * Sets the variable and property renaming policies for the compiler,\n   * in a way that clears warnings about the renaming policy being\n   * uninitialized from flags.\n   ",
      "child_ranges": [
        "(line 1161,col 5)-(line 1161,col 46)",
        "(line 1162,col 5)-(line 1162,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyAffinity(boolean)",
      "begin_line": 1165,
      "end_line": 1167,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 5)-(line 1166,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setShadowVariables(boolean)",
      "begin_line": 1170,
      "end_line": 1172,
      "comment": " Should shadow outer scope variable name during renaming. ",
      "child_ranges": [
        "(line 1171,col 5)-(line 1171,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapsePropertiesOnExternTypes(boolean)",
      "begin_line": 1179,
      "end_line": 1181,
      "comment": "\n   * If true, flattens multi-level property names on extern types\n   * (e.g. String$f \u003d x). This should only be used with the typed version of\n   * the externs files.\n   ",
      "child_ranges": [
        "(line 1180,col 5)-(line 1180,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProcessObjectPropertyString(boolean)",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\n   * If true, process goog.testing.ObjectPropertyString instances.\n   ",
      "child_ranges": [
        "(line 1187,col 5)-(line 1187,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceIdGenerators(boolean)",
      "begin_line": 1193,
      "end_line": 1195,
      "comment": "\n   * @param replaceIdGenerators the replaceIdGenerators to set\n   ",
      "child_ranges": [
        "(line 1194,col 5)-(line 1194,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdGenerators(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1200,
      "end_line": 1202,
      "comment": "\n   * Sets the id generators to replace.\n   ",
      "child_ranges": [
        "(line 1201,col 5)-(line 1201,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdGeneratorsMap(java.lang.String)",
      "begin_line": 1209,
      "end_line": 1211,
      "comment": "\n   * A previous map of ids (serialized to a string by a previous compile).\n   * This will be used as a hint during the ReplaceIdGenerators pass, which\n   * will attempt to reuse the same ids.\n   ",
      "child_ranges": [
        "(line 1210,col 5)-(line 1210,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineFunctions(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1216,
      "end_line": 1233,
      "comment": "\n   * Set the function inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1217,col 5)-(line 1232,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineVariables(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1238,
      "end_line": 1255,
      "comment": "\n   * Set the variable inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1239,col 5)-(line 1254,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineProperties(boolean)",
      "begin_line": 1260,
      "end_line": 1262,
      "comment": "\n   * Set the function inlining policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1261,col 5)-(line 1261,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVariable(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1267,
      "end_line": 1270,
      "comment": "\n   * Set the variable removal policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1269,col 5)-(line 1269,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVariables(com.google.javascript.jscomp.CompilerOptions.Reach)",
      "begin_line": 1275,
      "end_line": 1292,
      "comment": "\n   * Set the variable removal policy for the compiler.\n   ",
      "child_ranges": [
        "(line 1276,col 5)-(line 1291,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsConfiguration(java.lang.String, java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1297,
      "end_line": 1302,
      "comment": "\n   * Sets the functions whose debug strings to replace.\n   ",
      "child_ranges": [
        "(line 1299,col 5)-(line 1299,col 59)",
        "(line 1300,col 5)-(line 1301,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRewriteNewDateGoogNow(boolean)",
      "begin_line": 1304,
      "end_line": 1306,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveAbstractMethods(boolean)",
      "begin_line": 1308,
      "end_line": 1310,
      "comment": "",
      "child_ranges": [
        "(line 1309,col 5)-(line 1309,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveClosureAsserts(boolean)",
      "begin_line": 1312,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1313,col 5)-(line 1313,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setNameAnonymousFunctionsOnly(boolean)",
      "begin_line": 1319,
      "end_line": 1321,
      "comment": "\n   * If true, name anonymous functions only. All other passes will be skipped.\n   ",
      "child_ranges": [
        "(line 1320,col 5)-(line 1320,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setColorizeErrorOutput(boolean)",
      "begin_line": 1323,
      "end_line": 1325,
      "comment": "",
      "child_ranges": [
        "(line 1324,col 5)-(line 1324,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.shouldColorizeErrorOutput()",
      "begin_line": 1327,
      "end_line": 1329,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 5)-(line 1328,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setChainCalls(boolean)",
      "begin_line": 1334,
      "end_line": 1336,
      "comment": "\n   * If true, chain calls to functions that return this.\n   ",
      "child_ranges": [
        "(line 1335,col 5)-(line 1335,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAcceptConstKeyword(boolean)",
      "begin_line": 1341,
      "end_line": 1343,
      "comment": "\n   * If true, accept `const\u0027 keyword.\n   ",
      "child_ranges": [
        "(line 1342,col 5)-(line 1342,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enableRuntimeTypeCheck(java.lang.String)",
      "begin_line": 1351,
      "end_line": 1354,
      "comment": "\n   * Enable run-time type checking, which adds JS type assertions for debugging.\n   *\n   * @param logFunction A JS function to be used for logging run-time type\n   *     assertion failures.\n   ",
      "child_ranges": [
        "(line 1352,col 5)-(line 1352,col 33)",
        "(line 1353,col 5)-(line 1353,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.disableRuntimeTypeCheck()",
      "begin_line": 1356,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1357,col 5)-(line 1357,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGenerateExports(boolean)",
      "begin_line": 1360,
      "end_line": 1362,
      "comment": "",
      "child_ranges": [
        "(line 1361,col 5)-(line 1361,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCodingConvention(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 1364,
      "end_line": 1366,
      "comment": "",
      "child_ranges": [
        "(line 1365,col 5)-(line 1365,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getCodingConvention()",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 5)-(line 1369,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDependencyOptions(com.google.javascript.jscomp.DependencyOptions)",
      "begin_line": 1376,
      "end_line": 1379,
      "comment": "\n   * Sets dependency options. See the DependencyOptions class for more info.\n   * This supersedes manageClosureDependencies.\n   ",
      "child_ranges": [
        "(line 1377,col 5)-(line 1377,col 40)",
        "(line 1378,col 5)-(line 1378,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setManageClosureDependencies(boolean)",
      "begin_line": 1385,
      "end_line": 1392,
      "comment": "\n   * Sort inputs by their goog.provide/goog.require calls, and prune inputs\n   * whose symbols are not required.\n   ",
      "child_ranges": [
        "(line 1386,col 5)-(line 1387,col 62)",
        "(line 1388,col 5)-(line 1389,col 63)",
        "(line 1390,col 5)-(line 1390,col 48)",
        "(line 1391,col 5)-(line 1391,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setManageClosureDependencies(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1403,
      "end_line": 1407,
      "comment": "\n   * Sort inputs by their goog.provide/goog.require calls.\n   *\n   * @param entryPoints Entry points to the program. Must be goog.provide\u0027d\n   *     symbols. Any goog.provide\u0027d symbols that are not a transitive\n   *     dependency of the entry points will be deleted.\n   *     Files without goog.provides, and their dependencies,\n   *     will always be left in.\n   ",
      "child_ranges": [
        "(line 1404,col 5)-(line 1404,col 44)",
        "(line 1405,col 5)-(line 1405,col 39)",
        "(line 1406,col 5)-(line 1406,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSummaryDetailLevel(int)",
      "begin_line": 1416,
      "end_line": 1418,
      "comment": "\n   * Controls how detailed the compilation summary is. Values:\n   *  0 (never print summary), 1 (print summary only if there are\n   * errors or warnings), 2 (print summary if type checking is on,\n   * see --check_types), 3 (always print summary). The default level\n   * is 1\n   ",
      "child_ranges": [
        "(line 1417,col 5)-(line 1417,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.enableExternExports(boolean)",
      "begin_line": 1423,
      "end_line": 1426,
      "comment": "\n   * @deprecated replaced by {@link #setExternExports}\n   ",
      "child_ranges": [
        "(line 1425,col 5)-(line 1425,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExtraAnnotationNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1428,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1429,col 5)-(line 1429,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.isExternExportsEnabled()",
      "begin_line": 1432,
      "end_line": 1434,
      "comment": "",
      "child_ranges": [
        "(line 1433,col 5)-(line 1433,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOutputCharset(java.lang.String)",
      "begin_line": 1439,
      "end_line": 1441,
      "comment": "\n   * Sets the output charset by name.\n   ",
      "child_ranges": [
        "(line 1440,col 5)-(line 1440,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getOutputCharset()",
      "begin_line": 1446,
      "end_line": 1448,
      "comment": "\n   * Gets the output charset as a rich object.\n   ",
      "child_ranges": [
        "(line 1447,col 5)-(line 1447,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakProcessing(com.google.javascript.jscomp.CompilerOptions.TweakProcessing)",
      "begin_line": 1453,
      "end_line": 1455,
      "comment": "\n   * Sets how goog.tweak calls are processed.\n   ",
      "child_ranges": [
        "(line 1454,col 5)-(line 1454,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getTweakProcessing()",
      "begin_line": 1457,
      "end_line": 1459,
      "comment": "",
      "child_ranges": [
        "(line 1458,col 5)-(line 1458,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLanguageIn(com.google.javascript.jscomp.CompilerOptions.LanguageMode)",
      "begin_line": 1464,
      "end_line": 1467,
      "comment": "\n   * Sets how goog.tweak calls are processed.\n   ",
      "child_ranges": [
        "(line 1465,col 5)-(line 1465,col 33)",
        "(line 1466,col 5)-(line 1466,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getLanguageIn()",
      "begin_line": 1469,
      "end_line": 1471,
      "comment": "",
      "child_ranges": [
        "(line 1470,col 5)-(line 1470,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getLanguageOut()",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "",
      "child_ranges": [
        "(line 1474,col 5)-(line 1474,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLooseTypes(boolean)",
      "begin_line": 1484,
      "end_line": 1486,
      "comment": "\n   * Whether to include \"undefined\" in the default types.\n   *   For example:\n   *     \"{Object}\" is normally \"Object|null\" becomes \"Object|null|undefined\"\n   *     \"{?string}\" is normally \"string|null\" becomes \"string|null|undefined\"\n   * In either case \"!\" annotated types excluded both null and undefined.\n   ",
      "child_ranges": [
        "(line 1485,col 5)-(line 1485,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.clone()",
      "begin_line": 1488,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1490,col 5)-(line 1490,col 60)",
        "(line 1492,col 5)-(line 1492,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasTransformationHandler(com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)",
      "begin_line": 1495,
      "end_line": 1498,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 5)-(line 1497,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getAliasTransformationHandler()",
      "begin_line": 1500,
      "end_line": 1502,
      "comment": "",
      "child_ranges": [
        "(line 1501,col 5)-(line 1501,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setErrorHandler(com.google.javascript.jscomp.ErrorHandler)",
      "begin_line": 1516,
      "end_line": 1518,
      "comment": "\n   * Set a custom handler for warnings and errors.\n   *\n   * This is mostly used for piping the warnings and errors to\n   * a file behind the scenes.\n   *\n   * If you want to filter warnings and errors, you should use a WarningsGuard.\n   *\n   * If you want to change how warnings and errors are reported to the user,\n   * you should set a ErrorManager on the Compiler. An ErrorManager is\n   * intended to summarize the errors for a single compile job.\n   ",
      "child_ranges": [
        "(line 1517,col 5)-(line 1517,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInferTypes(boolean)",
      "begin_line": 1524,
      "end_line": 1526,
      "comment": "\n   * If true, enables type inference. If checkTypes is enabled, this flag has\n   * no effect.\n   ",
      "child_ranges": [
        "(line 1525,col 5)-(line 1525,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.getInferTypes()",
      "begin_line": 1532,
      "end_line": 1534,
      "comment": "\n   * Gets the inferTypes flag. Note that if checkTypes is enabled, this flag\n   * is ignored when configuring the compiler.\n   ",
      "child_ranges": [
        "(line 1533,col 5)-(line 1533,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.assumeStrictThis()",
      "begin_line": 1539,
      "end_line": 1541,
      "comment": "\n   * @return Whether assumeStrictThis is set.\n   ",
      "child_ranges": [
        "(line 1540,col 5)-(line 1540,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAssumeStrictThis(boolean)",
      "begin_line": 1546,
      "end_line": 1548,
      "comment": "\n   * If true, enables enables additional optimizations.\n   ",
      "child_ranges": [
        "(line 1547,col 5)-(line 1547,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyInvalidationErrors(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 1554,
      "end_line": 1558,
      "comment": "\n   * Sets the list of properties that we report property invalidation errors\n   * for.\n   ",
      "child_ranges": [
        "(line 1556,col 5)-(line 1557,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLanguageOut(com.google.javascript.jscomp.CompilerOptions.LanguageMode)",
      "begin_line": 1560,
      "end_line": 1562,
      "comment": "",
      "child_ranges": [
        "(line 1561,col 5)-(line 1561,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setIdeMode(boolean)",
      "begin_line": 1564,
      "end_line": 1566,
      "comment": "",
      "child_ranges": [
        "(line 1565,col 5)-(line 1565,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSaveDataStructures(boolean)",
      "begin_line": 1572,
      "end_line": 1574,
      "comment": "\n   * Whether to keep internal data structures around after we\u0027re\n   * finished compiling. We do this by default when IDE mode is on.\n   ",
      "child_ranges": [
        "(line 1573,col 5)-(line 1573,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSkipAllPasses(boolean)",
      "begin_line": 1576,
      "end_line": 1578,
      "comment": "",
      "child_ranges": [
        "(line 1577,col 5)-(line 1577,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDevMode(com.google.javascript.jscomp.CompilerOptions.DevMode)",
      "begin_line": 1580,
      "end_line": 1582,
      "comment": "",
      "child_ranges": [
        "(line 1581,col 5)-(line 1581,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMessageBundle(com.google.javascript.jscomp.MessageBundle)",
      "begin_line": 1584,
      "end_line": 1586,
      "comment": "",
      "child_ranges": [
        "(line 1585,col 5)-(line 1585,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckSymbols(boolean)",
      "begin_line": 1588,
      "end_line": 1590,
      "comment": "",
      "child_ranges": [
        "(line 1589,col 5)-(line 1589,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckSuspiciousCode(boolean)",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 5)-(line 1593,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckControlStructures(boolean)",
      "begin_line": 1596,
      "end_line": 1598,
      "comment": "",
      "child_ranges": [
        "(line 1597,col 5)-(line 1597,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckTypes(boolean)",
      "begin_line": 1600,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1601,col 5)-(line 1601,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCheckMissingGetCssNameBlacklist(java.lang.String)",
      "begin_line": 1604,
      "end_line": 1606,
      "comment": "",
      "child_ranges": [
        "(line 1605,col 5)-(line 1605,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setFoldConstants(boolean)",
      "begin_line": 1608,
      "end_line": 1610,
      "comment": "",
      "child_ranges": [
        "(line 1609,col 5)-(line 1609,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDeadAssignmentElimination(boolean)",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "",
      "child_ranges": [
        "(line 1613,col 5)-(line 1613,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineConstantVars(boolean)",
      "begin_line": 1616,
      "end_line": 1618,
      "comment": "",
      "child_ranges": [
        "(line 1617,col 5)-(line 1617,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineFunctions(boolean)",
      "begin_line": 1620,
      "end_line": 1622,
      "comment": "",
      "child_ranges": [
        "(line 1621,col 5)-(line 1621,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineLocalFunctions(boolean)",
      "begin_line": 1624,
      "end_line": 1626,
      "comment": "",
      "child_ranges": [
        "(line 1625,col 5)-(line 1625,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCrossModuleCodeMotion(boolean)",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "",
      "child_ranges": [
        "(line 1629,col 5)-(line 1629,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCoalesceVariableNames(boolean)",
      "begin_line": 1632,
      "end_line": 1634,
      "comment": "",
      "child_ranges": [
        "(line 1633,col 5)-(line 1633,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCrossModuleMethodMotion(boolean)",
      "begin_line": 1636,
      "end_line": 1638,
      "comment": "",
      "child_ranges": [
        "(line 1637,col 5)-(line 1637,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineGetters(boolean)",
      "begin_line": 1640,
      "end_line": 1642,
      "comment": "",
      "child_ranges": [
        "(line 1641,col 5)-(line 1641,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineVariables(boolean)",
      "begin_line": 1644,
      "end_line": 1646,
      "comment": "",
      "child_ranges": [
        "(line 1645,col 5)-(line 1645,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInlineLocalVariables(boolean)",
      "begin_line": 1648,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1649,col 5)-(line 1649,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setFlowSensitiveInlineVariables(boolean)",
      "begin_line": 1652,
      "end_line": 1654,
      "comment": "",
      "child_ranges": [
        "(line 1653,col 5)-(line 1653,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSmartNameRemoval(boolean)",
      "begin_line": 1656,
      "end_line": 1658,
      "comment": "",
      "child_ranges": [
        "(line 1657,col 5)-(line 1657,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveDeadCode(boolean)",
      "begin_line": 1660,
      "end_line": 1662,
      "comment": "",
      "child_ranges": [
        "(line 1661,col 5)-(line 1661,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExtractPrototypeMemberDeclarations(boolean)",
      "begin_line": 1664,
      "end_line": 1666,
      "comment": "",
      "child_ranges": [
        "(line 1665,col 5)-(line 1665,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedPrototypeProperties(boolean)",
      "begin_line": 1668,
      "end_line": 1670,
      "comment": "",
      "child_ranges": [
        "(line 1669,col 5)-(line 1669,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedPrototypePropertiesInExterns(boolean)",
      "begin_line": 1672,
      "end_line": 1675,
      "comment": "",
      "child_ranges": [
        "(line 1674,col 5)-(line 1674,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedVars(boolean)",
      "begin_line": 1677,
      "end_line": 1679,
      "comment": "",
      "child_ranges": [
        "(line 1678,col 5)-(line 1678,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveUnusedLocalVars(boolean)",
      "begin_line": 1681,
      "end_line": 1683,
      "comment": "",
      "child_ranges": [
        "(line 1682,col 5)-(line 1682,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasExternals(boolean)",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "",
      "child_ranges": [
        "(line 1686,col 5)-(line 1686,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseVariableDeclarations(boolean)",
      "begin_line": 1689,
      "end_line": 1691,
      "comment": "",
      "child_ranges": [
        "(line 1690,col 5)-(line 1690,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGroupVariableDeclarations(boolean)",
      "begin_line": 1693,
      "end_line": 1695,
      "comment": "",
      "child_ranges": [
        "(line 1694,col 5)-(line 1694,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseAnonymousFunctions(boolean)",
      "begin_line": 1697,
      "end_line": 1699,
      "comment": "",
      "child_ranges": [
        "(line 1698,col 5)-(line 1698,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasableStrings(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1701,
      "end_line": 1703,
      "comment": "",
      "child_ranges": [
        "(line 1702,col 5)-(line 1702,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasStringsBlacklist(java.lang.String)",
      "begin_line": 1705,
      "end_line": 1707,
      "comment": "",
      "child_ranges": [
        "(line 1706,col 5)-(line 1706,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasAllStrings(boolean)",
      "begin_line": 1709,
      "end_line": 1711,
      "comment": "",
      "child_ranges": [
        "(line 1710,col 5)-(line 1710,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOutputJsStringUsage(boolean)",
      "begin_line": 1713,
      "end_line": 1715,
      "comment": "",
      "child_ranges": [
        "(line 1714,col 5)-(line 1714,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setConvertToDottedProperties(boolean)",
      "begin_line": 1717,
      "end_line": 1719,
      "comment": "",
      "child_ranges": [
        "(line 1718,col 5)-(line 1718,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRewriteFunctionExpressions(boolean)",
      "begin_line": 1721,
      "end_line": 1723,
      "comment": "",
      "child_ranges": [
        "(line 1722,col 5)-(line 1722,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeParameters(boolean)",
      "begin_line": 1725,
      "end_line": 1727,
      "comment": "",
      "child_ranges": [
        "(line 1726,col 5)-(line 1726,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeReturns(boolean)",
      "begin_line": 1729,
      "end_line": 1731,
      "comment": "",
      "child_ranges": [
        "(line 1730,col 5)-(line 1730,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeCalls(boolean)",
      "begin_line": 1733,
      "end_line": 1735,
      "comment": "",
      "child_ranges": [
        "(line 1734,col 5)-(line 1734,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setOptimizeArgumentsArray(boolean)",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "",
      "child_ranges": [
        "(line 1738,col 5)-(line 1738,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setVariableRenaming(com.google.javascript.jscomp.VariableRenamingPolicy)",
      "begin_line": 1741,
      "end_line": 1743,
      "comment": "",
      "child_ranges": [
        "(line 1742,col 5)-(line 1742,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPropertyRenaming(com.google.javascript.jscomp.PropertyRenamingPolicy)",
      "begin_line": 1745,
      "end_line": 1747,
      "comment": "",
      "child_ranges": [
        "(line 1746,col 5)-(line 1746,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLabelRenaming(boolean)",
      "begin_line": 1749,
      "end_line": 1751,
      "comment": "",
      "child_ranges": [
        "(line 1750,col 5)-(line 1750,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReserveRawExports(boolean)",
      "begin_line": 1753,
      "end_line": 1755,
      "comment": "",
      "child_ranges": [
        "(line 1754,col 5)-(line 1754,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGeneratePseudoNames(boolean)",
      "begin_line": 1757,
      "end_line": 1759,
      "comment": "",
      "child_ranges": [
        "(line 1758,col 5)-(line 1758,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamePrefix(java.lang.String)",
      "begin_line": 1761,
      "end_line": 1763,
      "comment": "",
      "child_ranges": [
        "(line 1762,col 5)-(line 1762,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRenamePrefixNamespace(java.lang.String)",
      "begin_line": 1765,
      "end_line": 1767,
      "comment": "",
      "child_ranges": [
        "(line 1766,col 5)-(line 1766,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAliasKeywords(boolean)",
      "begin_line": 1769,
      "end_line": 1771,
      "comment": "",
      "child_ranges": [
        "(line 1770,col 5)-(line 1770,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCollapseProperties(boolean)",
      "begin_line": 1773,
      "end_line": 1775,
      "comment": "",
      "child_ranges": [
        "(line 1774,col 5)-(line 1774,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDevirtualizePrototypeMethods(boolean)",
      "begin_line": 1777,
      "end_line": 1779,
      "comment": "",
      "child_ranges": [
        "(line 1778,col 5)-(line 1778,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setComputeFunctionSideEffects(boolean)",
      "begin_line": 1781,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 5)-(line 1782,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDebugFunctionSideEffectsPath(java.lang.String)",
      "begin_line": 1785,
      "end_line": 1787,
      "comment": "",
      "child_ranges": [
        "(line 1786,col 5)-(line 1786,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDisambiguateProperties(boolean)",
      "begin_line": 1789,
      "end_line": 1791,
      "comment": "",
      "child_ranges": [
        "(line 1790,col 5)-(line 1790,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAmbiguateProperties(boolean)",
      "begin_line": 1793,
      "end_line": 1795,
      "comment": "",
      "child_ranges": [
        "(line 1794,col 5)-(line 1794,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setAnonymousFunctionNaming(com.google.javascript.jscomp.AnonymousFunctionNamingPolicy)",
      "begin_line": 1797,
      "end_line": 1800,
      "comment": "",
      "child_ranges": [
        "(line 1799,col 5)-(line 1799,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputAnonymousFunctionNamingMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1802,
      "end_line": 1804,
      "comment": "",
      "child_ranges": [
        "(line 1803,col 5)-(line 1803,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputVariableMapSerialized(byte[])",
      "begin_line": 1806,
      "end_line": 1810,
      "comment": "",
      "child_ranges": [
        "(line 1809,col 5)-(line 1809,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputVariableMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1812,
      "end_line": 1814,
      "comment": "",
      "child_ranges": [
        "(line 1813,col 5)-(line 1813,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputPropertyMapSerialized(byte[])",
      "begin_line": 1816,
      "end_line": 1820,
      "comment": "",
      "child_ranges": [
        "(line 1819,col 5)-(line 1819,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputPropertyMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1822,
      "end_line": 1824,
      "comment": "",
      "child_ranges": [
        "(line 1823,col 5)-(line 1823,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExportTestFunctions(boolean)",
      "begin_line": 1826,
      "end_line": 1828,
      "comment": "",
      "child_ranges": [
        "(line 1827,col 5)-(line 1827,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRuntimeTypeCheck(boolean)",
      "begin_line": 1830,
      "end_line": 1832,
      "comment": "",
      "child_ranges": [
        "(line 1831,col 5)-(line 1831,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRuntimeTypeCheckLogFunction(java.lang.String)",
      "begin_line": 1834,
      "end_line": 1836,
      "comment": "",
      "child_ranges": [
        "(line 1835,col 5)-(line 1835,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSyntheticBlockStartMarker(java.lang.String)",
      "begin_line": 1838,
      "end_line": 1840,
      "comment": "",
      "child_ranges": [
        "(line 1839,col 5)-(line 1839,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSyntheticBlockEndMarker(java.lang.String)",
      "begin_line": 1842,
      "end_line": 1844,
      "comment": "",
      "child_ranges": [
        "(line 1843,col 5)-(line 1843,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLocale(java.lang.String)",
      "begin_line": 1846,
      "end_line": 1848,
      "comment": "",
      "child_ranges": [
        "(line 1847,col 5)-(line 1847,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMarkAsCompiled(boolean)",
      "begin_line": 1850,
      "end_line": 1852,
      "comment": "",
      "child_ranges": [
        "(line 1851,col 5)-(line 1851,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRemoveTryCatchFinally(boolean)",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": "",
      "child_ranges": [
        "(line 1855,col 5)-(line 1855,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setClosurePass(boolean)",
      "begin_line": 1858,
      "end_line": 1860,
      "comment": "",
      "child_ranges": [
        "(line 1859,col 5)-(line 1859,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setGatherCssNames(boolean)",
      "begin_line": 1862,
      "end_line": 1864,
      "comment": "",
      "child_ranges": [
        "(line 1863,col 5)-(line 1863,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripTypes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1866,
      "end_line": 1868,
      "comment": "",
      "child_ranges": [
        "(line 1867,col 5)-(line 1867,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripNameSuffixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1870,
      "end_line": 1872,
      "comment": "",
      "child_ranges": [
        "(line 1871,col 5)-(line 1871,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripNamePrefixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1874,
      "end_line": 1876,
      "comment": "",
      "child_ranges": [
        "(line 1875,col 5)-(line 1875,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setStripTypePrefixes(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1878,
      "end_line": 1880,
      "comment": "",
      "child_ranges": [
        "(line 1879,col 5)-(line 1879,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCustomPasses(com.google.common.collect.Multimap\u003ccom.google.javascript.jscomp.CustomPassExecutionTime, com.google.javascript.jscomp.CompilerPass\u003e)",
      "begin_line": 1882,
      "end_line": 1884,
      "comment": "",
      "child_ranges": [
        "(line 1883,col 5)-(line 1883,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMarkNoSideEffectCalls(boolean)",
      "begin_line": 1886,
      "end_line": 1888,
      "comment": "",
      "child_ranges": [
        "(line 1887,col 5)-(line 1887,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setDefineReplacements(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 1890,
      "end_line": 1892,
      "comment": "",
      "child_ranges": [
        "(line 1891,col 5)-(line 1891,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTweakReplacements(java.util.Map\u003cjava.lang.String, java.lang.Object\u003e)",
      "begin_line": 1894,
      "end_line": 1896,
      "comment": "",
      "child_ranges": [
        "(line 1895,col 5)-(line 1895,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setMoveFunctionDeclarations(boolean)",
      "begin_line": 1898,
      "end_line": 1900,
      "comment": "",
      "child_ranges": [
        "(line 1899,col 5)-(line 1899,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInstrumentationTemplate(java.lang.String)",
      "begin_line": 1902,
      "end_line": 1904,
      "comment": "",
      "child_ranges": [
        "(line 1903,col 5)-(line 1903,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setRecordFunctionInformation(boolean)",
      "begin_line": 1906,
      "end_line": 1908,
      "comment": "",
      "child_ranges": [
        "(line 1907,col 5)-(line 1907,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)",
      "begin_line": 1910,
      "end_line": 1912,
      "comment": "",
      "child_ranges": [
        "(line 1911,col 5)-(line 1911,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCssRenamingWhitelist(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1914,
      "end_line": 1916,
      "comment": "",
      "child_ranges": [
        "(line 1915,col 5)-(line 1915,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsFunctionDescriptions(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 1918,
      "end_line": 1920,
      "comment": "",
      "child_ranges": [
        "(line 1919,col 5)-(line 1919,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsPlaceholderToken(java.lang.String)",
      "begin_line": 1922,
      "end_line": 1924,
      "comment": "",
      "child_ranges": [
        "(line 1923,col 5)-(line 1923,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsReservedStrings(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1926,
      "end_line": 1928,
      "comment": "",
      "child_ranges": [
        "(line 1927,col 5)-(line 1927,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setReplaceStringsInputMap(com.google.javascript.jscomp.VariableMap)",
      "begin_line": 1930,
      "end_line": 1932,
      "comment": "",
      "child_ranges": [
        "(line 1931,col 5)-(line 1931,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPrettyPrint(boolean)",
      "begin_line": 1934,
      "end_line": 1936,
      "comment": "",
      "child_ranges": [
        "(line 1935,col 5)-(line 1935,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLineBreak(boolean)",
      "begin_line": 1938,
      "end_line": 1940,
      "comment": "",
      "child_ranges": [
        "(line 1939,col 5)-(line 1939,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPreferLineBreakAtEndOfFile(boolean)",
      "begin_line": 1942,
      "end_line": 1944,
      "comment": "",
      "child_ranges": [
        "(line 1943,col 5)-(line 1943,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setPrintInputDelimiter(boolean)",
      "begin_line": 1946,
      "end_line": 1948,
      "comment": "",
      "child_ranges": [
        "(line 1947,col 5)-(line 1947,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setInputDelimiter(java.lang.String)",
      "begin_line": 1950,
      "end_line": 1952,
      "comment": "",
      "child_ranges": [
        "(line 1951,col 5)-(line 1951,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTracer(com.google.javascript.jscomp.CompilerOptions.TracerMode)",
      "begin_line": 1954,
      "end_line": 1956,
      "comment": "",
      "child_ranges": [
        "(line 1955,col 5)-(line 1955,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setErrorFormat(com.google.javascript.jscomp.ErrorFormat)",
      "begin_line": 1958,
      "end_line": 1960,
      "comment": "",
      "child_ranges": [
        "(line 1959,col 5)-(line 1959,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setWarningsGuard(com.google.javascript.jscomp.ComposeWarningsGuard)",
      "begin_line": 1962,
      "end_line": 1964,
      "comment": "",
      "child_ranges": [
        "(line 1963,col 5)-(line 1963,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setLineLengthThreshold(int)",
      "begin_line": 1966,
      "end_line": 1968,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 5)-(line 1967,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExternExports(boolean)",
      "begin_line": 1970,
      "end_line": 1972,
      "comment": "",
      "child_ranges": [
        "(line 1971,col 5)-(line 1971,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setExternExportsPath(java.lang.String)",
      "begin_line": 1974,
      "end_line": 1976,
      "comment": "",
      "child_ranges": [
        "(line 1975,col 5)-(line 1975,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapOutputPath(java.lang.String)",
      "begin_line": 1978,
      "end_line": 1980,
      "comment": "",
      "child_ranges": [
        "(line 1979,col 5)-(line 1979,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapDetailLevel(com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 1982,
      "end_line": 1984,
      "comment": "",
      "child_ranges": [
        "(line 1983,col 5)-(line 1983,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapFormat(com.google.javascript.jscomp.SourceMap.Format)",
      "begin_line": 1986,
      "end_line": 1988,
      "comment": "",
      "child_ranges": [
        "(line 1987,col 5)-(line 1987,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setSourceMapLocationMappings(java.util.List\u003ccom.google.javascript.jscomp.SourceMap.LocationMapping\u003e)",
      "begin_line": 1990,
      "end_line": 1992,
      "comment": "",
      "child_ranges": [
        "(line 1991,col 5)-(line 1991,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setTransformAMDToCJSModules(boolean)",
      "begin_line": 1997,
      "end_line": 1999,
      "comment": "\n   * Activates transformation of AMD to CommonJS modules.\n   ",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setProcessCommonJSModules(boolean)",
      "begin_line": 2005,
      "end_line": 2007,
      "comment": "\n   * Rewrites CommonJS modules so that modules can be concatenated together,\n   * by renaming all globals to avoid conflicting with other modules.\n   ",
      "child_ranges": [
        "(line 2006,col 5)-(line 2006,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.setCommonJSModulePathPrefix(java.lang.String)",
      "begin_line": 2012,
      "end_line": 2014,
      "comment": "\n   * Sets a path prefix for CommonJS modules.\n   ",
      "child_ranges": [
        "(line 2013,col 5)-(line 2013,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.LanguageMode.fromString(java.lang.String)",
      "begin_line": 2037,
      "end_line": 2049,
      "comment": "",
      "child_ranges": [
        "(line 2038,col 7)-(line 2047,col 7)",
        "(line 2048,col 7)-(line 2048,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TracerMode.isOn()",
      "begin_line": 2081,
      "end_line": 2083,
      "comment": "",
      "child_ranges": [
        "(line 2082,col 7)-(line 2082,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TweakProcessing.isOn()",
      "begin_line": 2091,
      "end_line": 2093,
      "comment": "",
      "child_ranges": [
        "(line 2092,col 7)-(line 2092,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.TweakProcessing.shouldStrip()",
      "begin_line": 2095,
      "end_line": 2097,
      "comment": "",
      "child_ranges": [
        "(line 2096,col 7)-(line 2096,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasTransformationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2113,
      "end_line": 2135,
      "comment": "\n   * A Role Specific Interface for JS Compiler that represents a data holder\n   * object which is used to store goog.scope alias code changes to code made\n   * during a compile. There is no guarantee that individual alias changes are\n   * invoked in the order they occur during compilation, so implementations\n   * should not assume any relevance to the order changes arrive.\n   * \u003cp\u003e\n   * Calls to the mutators are expected to resolve very quickly, so\n   * implementations should not perform expensive operations in the mutator\n   * methods.\n   *\n   * @author tylerg@google.com (Tyler Goodwin)\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 2133,
      "end_line": 2134,
      "comment": "\n     * Builds an AliasTransformation implementation and returns it to the\n     * caller.\n     * \u003cp\u003e\n     * Callers are allowed to request multiple AliasTransformation instances for\n     * the same file, though it is expected that the first and last char values\n     * for multiple instances will not overlap.\n     * \u003cp\u003e\n     * This method is expected to have a side-effect of storing off the created\n     * AliasTransformation, which guarantees that invokers of this interface\n     * cannot leak AliasTransformation to this implementation that the\n     * implementor did not create\n     *\n     * @param sourceFile the source file the aliases re contained in.\n     * @param position the region of the source file associated with the\n     *        goog.scope call. The item of the SourcePosition is the returned\n     *        AliasTransformation\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AliasTransformation",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2144,
      "end_line": 2156,
      "comment": "\n   * A Role Specific Interface for the JS Compiler to report aliases used to\n   * change the code during a compile.\n   * \u003cp\u003e\n   * While aliases defined by goog.scope are expected to by only 1 per file, and\n   * the only top-level structure in the file, this is not enforced.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.AliasTransformation.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 2155,
      "end_line": 2155,
      "comment": "\n     * Adds an alias definition to the AliasTransformation instance.\n     * \u003cp\u003e\n     * Last definition for a given alias is kept if an alias is inserted\n     * multiple times (since this is generally the behavior in JavaScript code).\n     *\n     * @param alias the name of the alias.\n     * @param definition the definition of the alias.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NULL_ALIAS_TRANSFORMATION_HANDLER"
      ],
      "begin_line": 2162,
      "end_line": 2163,
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
      "begin_line": 2165,
      "end_line": 2187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2167,
      "end_line": 2167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NULL_ALIAS_TRANSFORMATION"
      ],
      "begin_line": 2169,
      "end_line": 2170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 2172,
      "end_line": 2177,
      "comment": "",
      "child_ranges": [
        "(line 2175,col 7)-(line 2175,col 50)",
        "(line 2176,col 7)-(line 2176,col 39)"
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
      "begin_line": 2179,
      "end_line": 2186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2181,
      "end_line": 2181,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CompilerOptions.NullAliasTransformationHandler.NullAliasTransformation.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 2183,
      "end_line": 2185,
      "comment": "",
      "child_ranges": []
    }
  ]
}