{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ProcessTweaks.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessTweaks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 50,
      "end_line": 558,
      "comment": "\n * Process goog.tweak primitives. Checks that:\n * \u003cul\u003e\n * \u003cli\u003eparameters to goog.tweak.register* are literals of the correct type.\n * \u003cli\u003ethe parameter to goog.tweak.get* is a string literal.\n * \u003cli\u003eparameters to goog.tweak.overrideDefaultValue are literals of the correct\n *     type.\n * \u003cli\u003etweak IDs passed to goog.tweak.get* and goog.tweak.overrideDefaultValue\n *     correspond to registered tweaks.\n * \u003cli\u003eall calls to goog.tweak.register* and goog.tweak.overrideDefaultValue are\n *     within the top-level context.\n * \u003cli\u003eeach tweak is registered only once.\n * \u003cli\u003ecalls to goog.tweak.overrideDefaultValue occur before the call to the\n *     corresponding goog.tweak.register* function.\n * \u003c/ul\u003e\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripTweaks"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compilerDefaultValueOverrides"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ID_MATCHER"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_TWEAK_WARNING"
      ],
      "begin_line": 60,
      "end_line": 63,
      "comment": " Warnings and Errors."
    },
    {
      "type": "field",
      "varNames": [
        "TWEAK_MULTIPLY_REGISTERED_ERROR"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_LITERAL_TWEAK_ID_ERROR"
      ],
      "begin_line": 70,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_TWEAK_DEFAULT_VALUE_WARNING"
      ],
      "begin_line": 75,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_GLOBAL_TWEAK_INIT_ERROR"
      ],
      "begin_line": 81,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWEAK_OVERRIDE_AFTER_REGISTERED_ERROR"
      ],
      "begin_line": 86,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWEAK_WRONG_GETTER_TYPE_WARNING"
      ],
      "begin_line": 92,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_TWEAK_ID_ERROR"
      ],
      "begin_line": 97,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expectedTypeName"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validNodeTypeA"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validNodeTypeB"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registerFunction"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.TweakFunction(java.lang.String)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 7)-(line 124,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.TweakFunction(java.lang.String, java.lang.String, int)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.TweakFunction(java.lang.String, java.lang.String, int, int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.TweakFunction(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.TweakFunction(java.lang.String, java.lang.String, int, int, com.google.javascript.jscomp.ProcessTweaks.TweakFunction)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 23)",
        "(line 145,col 7)-(line 145,col 47)",
        "(line 146,col 7)-(line 146,col 43)",
        "(line 147,col 7)-(line 147,col 43)",
        "(line 148,col 7)-(line 148,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.isValidNodeType(int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.isCorrectRegisterFunction(com.google.javascript.jscomp.ProcessTweaks.TweakFunction)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 51)",
        "(line 157,col 7)-(line 157,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.isGetterFunction()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.getName()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.getExpectedTypeName()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunction.createDefaultValueNode()",
      "begin_line": 172,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 182,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "TWEAK_FUNCTIONS_MAP"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " A map of function name -\u003e TweakFunction."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.ProcessTweaks(com.google.javascript.jscomp.AbstractCompiler, boolean, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 29)",
        "(line 198,col 5)-(line 198,col 35)",
        "(line 200,col 5)-(line 200,col 59)",
        "(line 201,col 5)-(line 201,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 204,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 53)",
        "(line 207,col 5)-(line 207,col 58)",
        "(line 209,col 5)-(line 209,col 28)",
        "(line 211,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 218,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.replaceGetCompilerOverridesCalls(java.util.List\u003ccom.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall\u003e)",
      "begin_line": 225,
      "end_line": 233,
      "comment": "\n   * Passes the compiler default value overrides to the JS by replacing calls\n   * to goog.tweak.getCompilerOverrids_ with a map of tweak ID-\u003edefault value;\n   ",
      "child_ranges": [
        "(line 227,col 5)-(line 231,col 5)",
        "(line 232,col 5)-(line 232,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.stripAllCalls(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo\u003e)",
      "begin_line": 239,
      "end_line": 266,
      "comment": "\n   * Removes all CALL nodes in the given TweakInfos, replacing calls to getter\n   * functions with the tweak\u0027s default value.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.createCompilerDefaultValueOverridesVarNode(com.google.javascript.rhino.Node)",
      "begin_line": 271,
      "end_line": 283,
      "comment": "\n   * Creates a JS object that holds a map of tweakId -\u003e default value override.\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 64)",
        "(line 274,col 5)-(line 281,col 5)",
        "(line 282,col 5)-(line 282,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.applyCompilerDefaultValueOverrides(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo\u003e)",
      "begin_line": 286,
      "end_line": 305,
      "comment": " Sets the default values of tweaks based on compiler options. ",
      "child_ranges": [
        "(line 288,col 5)-(line 304,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.collectTweaks(com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 321,
      "comment": "\n   * Finds all calls to goog.tweak functions and emits warnings/errors if any\n   * of the calls have issues.\n   * @return A map of {@link TweakInfo} structures, keyed by tweak ID.\n   ",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 45)",
        "(line 314,col 5)-(line 314,col 49)",
        "(line 316,col 5)-(line 316,col 55)",
        "(line 317,col 5)-(line 319,col 5)",
        "(line 320,col 5)-(line 320,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectTweaksResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 323,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tweakInfos"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "getOverridesCalls"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.CollectTweaksResult.CollectTweaksResult(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakInfo\u003e, java.util.List\u003ccom.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall\u003e)",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 329,col 35)",
        "(line 330,col 7)-(line 330,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectTweaks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 337,
      "end_line": 426,
      "comment": "\n   * Processes all calls to goog.tweak functions.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "allTweaks"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "getOverridesCalls"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.CollectTweaks.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 341,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 344,col 7)-(line 346,col 7)",
        "(line 348,col 7)-(line 348,col 61)",
        "(line 349,col 7)-(line 349,col 66)",
        "(line 350,col 7)-(line 352,col 7)",
        "(line 354,col 7)-(line 358,col 7)",
        "(line 361,col 7)-(line 361,col 53)",
        "(line 362,col 7)-(line 365,col 7)",
        "(line 366,col 7)-(line 366,col 47)",
        "(line 369,col 7)-(line 369,col 51)",
        "(line 370,col 7)-(line 373,col 7)",
        "(line 375,col 7)-(line 424,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TweakFunctionCall",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 431,
      "end_line": 453,
      "comment": "\n   * Holds information about a call to a goog.tweak function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tweakFunc"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callNode"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueNode"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall.TweakFunctionCall(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction, com.google.javascript.rhino.Node)",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 7)-(line 439,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall.TweakFunctionCall(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 442,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 35)",
        "(line 445,col 7)-(line 445,col 31)",
        "(line 446,col 7)-(line 446,col 33)",
        "(line 447,col 7)-(line 447,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakFunctionCall.getIdNode()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 7)-(line 451,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TweakInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 458,
      "end_line": 557,
      "comment": "\n   * Stores information about a single tweak.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tweakId"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionCalls"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registerCall"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValueNode"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.TweakInfo(java.lang.String)",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 465,col 7)-(line 465,col 29)",
        "(line 466,col 7)-(line 466,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.emitAllWarnings()",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\n     * If this tweak is registered, then looks for type warnings in default\n     * value parameters and getter functions. If it is not registered, emits an\n     * error for each function call.\n     ",
      "child_ranges": [
        "(line 475,col 7)-(line 479,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.emitAllTypeWarnings()",
      "begin_line": 486,
      "end_line": 509,
      "comment": "\n     * Emits a warning for each default value parameter that has the wrong type\n     * and for each getter function that was used for the wrong type of tweak.\n     ",
      "child_ranges": [
        "(line 487,col 7)-(line 508,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.emitUnknownTweakErrors()",
      "begin_line": 514,
      "end_line": 519,
      "comment": "\n     * Emits an error for each function call that was found.\n     ",
      "child_ranges": [
        "(line 515,col 7)-(line 518,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.addRegisterCall(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 521,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 523,col 7)-(line 524,col 28)",
        "(line 525,col 7)-(line 525,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.addOverrideDefaultValueCall(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 528,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 530,col 7)-(line 531,col 29)",
        "(line 532,col 7)-(line 532,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.addGetterCall(java.lang.String, com.google.javascript.jscomp.ProcessTweaks.TweakFunction, com.google.javascript.rhino.Node)",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 7)-(line 537,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.isRegistered()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 7)-(line 541,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessTweaks.TweakInfo.getDefaultValueNode()",
      "begin_line": 544,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 545,col 7)-(line 545,col 47)",
        "(line 547,col 7)-(line 549,col 7)",
        "(line 551,col 7)-(line 553,col 7)",
        "(line 555,col 7)-(line 555,col 61)"
      ]
    }
  ]
}