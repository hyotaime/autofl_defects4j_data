{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DefaultPassConfig.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPassConfig",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassConfig"
      ],
      "begin_line": 52,
      "end_line": 2322,
      "comment": " cleaned up."
    },
    {
      "type": "field",
      "varNames": [
        "COMPILED_CONSTANT_NAME"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " For the --mark-as-compiled pass "
    },
    {
      "type": "field",
      "varNames": [
        "CLOSURE_LOCALE_CONSTANT_NAME"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Constant name for Closure\u0027s locale "
    },
    {
      "type": "field",
      "varNames": [
        "TIGHTEN_TYPES_WITHOUT_TYPE_CHECK"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": " Compiler errors when invalid combinations of passes are run."
    },
    {
      "type": "field",
      "varNames": [
        "CANNOT_USE_PROTOTYPE_AND_VAR"
      ],
      "begin_line": 65,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPORT_PATH_IO_ERROR"
      ],
      "begin_line": 70,
      "end_line": 72,
      "comment": " Miscellaneous errors."
    },
    {
      "type": "field",
      "varNames": [
        "NAME_REF_GRAPH_FILE_ERROR"
      ],
      "begin_line": 74,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME_REF_REPORT_FILE_ERROR"
      ],
      "begin_line": 78,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_SYMBOL_NAMESPACE_PATTERN"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceForChecks"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * A global namespace to share across checking passes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n   * A symbol table for registering references that get removed during\n   * preprocessing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypes"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n   * A type-tightener to share across optimization passes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exportedNames"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Names exported by goog.exportSymbol. "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleIdGenerator"
      ],
      "begin_line": 108,
      "end_line": 109,
      "comment": "\n   * Ids for cross-module method stubbing, so that each method has\n   * a unique id.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cssNames"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n   * Keys are arguments passed to getCssName() found during compilation; values\n   * are the number of times the key appeared as an argument to getCssName().\n   "
    },
    {
      "type": "field",
      "varNames": [
        "variableMap"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The variable renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "propertyMap"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The property renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "anonymousFunctionNameMap"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The naming map for anonymous functions "
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Fully qualified function names and globally unique ids "
    },
    {
      "type": "field",
      "varNames": [
        "stringMap"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " String replacement map "
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorMap"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Id generator map "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.DefaultPassConfig(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getIntermediateState()",
      "begin_line": 139,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 146,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 149,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 152,col 40)",
        "(line 153,col 5)-(line 154,col 45)",
        "(line 155,col 5)-(line 155,col 63)",
        "(line 156,col 5)-(line 156,col 41)",
        "(line 157,col 5)-(line 157,col 41)",
        "(line 158,col 5)-(line 158,col 67)",
        "(line 159,col 5)-(line 159,col 37)",
        "(line 160,col 5)-(line 160,col 45)",
        "(line 161,col 5)-(line 161,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getGlobalNamespace()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getPreprocessorSymbolTable()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.maybeInitializePreprocessorSymbolTable(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 172,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 179,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getChecks()",
      "begin_line": 182,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 52)",
        "(line 186,col 5)-(line 186,col 56)",
        "(line 188,col 5)-(line 191,col 5)",
        "(line 193,col 5)-(line 202,col 5)",
        "(line 204,col 5)-(line 206,col 5)",
        "(line 208,col 5)-(line 208,col 33)",
        "(line 210,col 5)-(line 214,col 5)",
        "(line 216,col 5)-(line 219,col 5)",
        "(line 221,col 5)-(line 223,col 5)",
        "(line 225,col 5)-(line 227,col 5)",
        "(line 232,col 5)-(line 234,col 5)",
        "(line 236,col 5)-(line 238,col 5)",
        "(line 240,col 5)-(line 242,col 5)",
        "(line 244,col 5)-(line 246,col 5)",
        "(line 248,col 5)-(line 251,col 5)",
        "(line 253,col 5)-(line 253,col 26)",
        "(line 254,col 5)-(line 256,col 5)",
        "(line 258,col 5)-(line 260,col 5)",
        "(line 263,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 281,col 5)",
        "(line 283,col 5)-(line 286,col 5)",
        "(line 289,col 5)-(line 293,col 5)",
        "(line 295,col 5)-(line 297,col 5)",
        "(line 299,col 5)-(line 301,col 5)",
        "(line 305,col 5)-(line 307,col 5)",
        "(line 313,col 5)-(line 317,col 5)",
        "(line 319,col 5)-(line 321,col 5)",
        "(line 324,col 5)-(line 324,col 31)",
        "(line 326,col 5)-(line 329,col 5)",
        "(line 331,col 5)-(line 334,col 5)",
        "(line 336,col 5)-(line 339,col 5)",
        "(line 341,col 5)-(line 341,col 55)",
        "(line 343,col 5)-(line 343,col 35)",
        "(line 344,col 5)-(line 344,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getOptimizations()",
      "begin_line": 347,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 52)",
        "(line 350,col 5)-(line 350,col 37)",
        "(line 355,col 5)-(line 357,col 5)",
        "(line 359,col 5)-(line 359,col 63)",
        "(line 361,col 5)-(line 363,col 5)",
        "(line 366,col 5)-(line 368,col 5)",
        "(line 372,col 5)-(line 375,col 5)",
        "(line 379,col 5)-(line 381,col 5)",
        "(line 385,col 5)-(line 387,col 5)",
        "(line 390,col 5)-(line 392,col 5)",
        "(line 398,col 5)-(line 400,col 5)",
        "(line 402,col 5)-(line 415,col 5)",
        "(line 417,col 5)-(line 419,col 5)",
        "(line 425,col 5)-(line 425,col 28)",
        "(line 430,col 5)-(line 432,col 5)",
        "(line 434,col 5)-(line 434,col 35)",
        "(line 436,col 5)-(line 439,col 5)",
        "(line 443,col 5)-(line 445,col 5)",
        "(line 455,col 5)-(line 457,col 5)",
        "(line 464,col 5)-(line 466,col 5)",
        "(line 468,col 5)-(line 471,col 5)",
        "(line 473,col 5)-(line 473,col 59)",
        "(line 475,col 5)-(line 492,col 5)",
        "(line 494,col 5)-(line 494,col 45)",
        "(line 496,col 5)-(line 496,col 54)",
        "(line 498,col 5)-(line 500,col 5)",
        "(line 502,col 5)-(line 504,col 5)",
        "(line 506,col 5)-(line 506,col 53)",
        "(line 510,col 5)-(line 513,col 5)",
        "(line 515,col 5)-(line 523,col 5)",
        "(line 527,col 5)-(line 529,col 5)",
        "(line 531,col 5)-(line 533,col 5)",
        "(line 536,col 5)-(line 541,col 5)",
        "(line 543,col 5)-(line 546,col 5)",
        "(line 554,col 5)-(line 559,col 5)",
        "(line 561,col 5)-(line 564,col 5)",
        "(line 566,col 5)-(line 568,col 5)",
        "(line 571,col 5)-(line 573,col 5)",
        "(line 577,col 5)-(line 579,col 5)",
        "(line 585,col 5)-(line 587,col 5)",
        "(line 591,col 5)-(line 593,col 5)",
        "(line 595,col 5)-(line 597,col 5)",
        "(line 599,col 5)-(line 601,col 5)",
        "(line 605,col 5)-(line 605,col 33)",
        "(line 607,col 5)-(line 616,col 5)",
        "(line 618,col 5)-(line 621,col 5)",
        "(line 624,col 5)-(line 624,col 28)",
        "(line 626,col 5)-(line 628,col 5)",
        "(line 630,col 5)-(line 635,col 5)",
        "(line 637,col 5)-(line 639,col 5)",
        "(line 641,col 5)-(line 643,col 5)",
        "(line 646,col 5)-(line 648,col 5)",
        "(line 650,col 5)-(line 652,col 5)",
        "(line 654,col 5)-(line 656,col 5)",
        "(line 658,col 5)-(line 661,col 5)",
        "(line 663,col 5)-(line 663,col 42)",
        "(line 665,col 5)-(line 673,col 5)",
        "(line 676,col 5)-(line 676,col 31)",
        "(line 677,col 5)-(line 677,col 32)",
        "(line 679,col 5)-(line 679,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getMainOptimizationLoop()",
      "begin_line": 683,
      "end_line": 716,
      "comment": " Creates the passes for the main optimization loop. ",
      "child_ranges": [
        "(line 684,col 5)-(line 684,col 52)",
        "(line 685,col 5)-(line 687,col 5)",
        "(line 689,col 5)-(line 689,col 43)",
        "(line 691,col 5)-(line 693,col 5)",
        "(line 695,col 5)-(line 697,col 5)",
        "(line 699,col 5)-(line 701,col 35)",
        "(line 703,col 5)-(line 710,col 5)",
        "(line 711,col 5)-(line 713,col 5)",
        "(line 714,col 5)-(line 714,col 36)",
        "(line 715,col 5)-(line 715,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getCodeRemovingPasses()",
      "begin_line": 719,
      "end_line": 751,
      "comment": " Creates several passes aimed at removing code. ",
      "child_ranges": [
        "(line 720,col 5)-(line 720,col 52)",
        "(line 721,col 5)-(line 723,col 5)",
        "(line 725,col 5)-(line 729,col 5)",
        "(line 731,col 5)-(line 735,col 5)",
        "(line 737,col 5)-(line 739,col 5)",
        "(line 741,col 5)-(line 743,col 5)",
        "(line 745,col 5)-(line 747,col 5)",
        "(line 749,col 5)-(line 749,col 36)",
        "(line 750,col 5)-(line 750,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkSideEffects"
      ],
      "begin_line": 756,
      "end_line": 769,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8203a029-d60c-4bf8-9ead-2028151c5ab1.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 758,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 763,col 7)-(line 764,col 63)",
        "(line 765,col 7)-(line 767,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "stripSideEffectProtection"
      ],
      "begin_line": 774,
      "end_line": 781,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-99b365ae-8ff3-4369-884a-5184059d38a0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 776,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 779,col 7)-(line 779,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "suspiciousCode"
      ],
      "begin_line": 786,
      "end_line": 806,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c6a42a3e-e603-4e04-bb4f-9581ddc3b17c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 788,
      "end_line": 804,
      "comment": "",
      "child_ranges": [
        "(line 790,col 7)-(line 790,col 60)",
        "(line 791,col 7)-(line 793,col 7)",
        "(line 795,col 7)-(line 797,col 7)",
        "(line 799,col 7)-(line 801,col 7)",
        "(line 803,col 7)-(line 803,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.assertAllOneTimePasses(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 809,
      "end_line": 813,
      "comment": " Verify that all the passes are one-time passes. ",
      "child_ranges": [
        "(line 810,col 5)-(line 812,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.assertAllLoopablePasses(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 816,
      "end_line": 820,
      "comment": " Verify that all the passes are multi-run passes. ",
      "child_ranges": [
        "(line 817,col 5)-(line 819,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkControlStructures"
      ],
      "begin_line": 823,
      "end_line": 829,
      "comment": " Checks for validity of the control structures. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5d6a6565-1385-45b1-8bc0-9cd9a964df6b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 825,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 827,col 7)-(line 827,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRequires"
      ],
      "begin_line": 832,
      "end_line": 838,
      "comment": " Checks that all constructed classes are goog.require()d. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ba5e18a1-9fc8-4e08-bcef-c4a79b874f5a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 834,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 836,col 7)-(line 836,col 79)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkProvides"
      ],
      "begin_line": 841,
      "end_line": 847,
      "comment": " Makes sure @constructor is paired with goog.provides(). "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1b800980-ba03-409b-b169-a1d887d5f94f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 843,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 845,col 7)-(line 845,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GENERATE_EXPORTS_ERROR"
      ],
      "begin_line": 849,
      "end_line": 853,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 856,
      "end_line": 869,
      "comment": " Generates exports for @export annotations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-457c0026-080d-477a-9ab9-5b651a2e22f8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 857,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 859,col 7)-(line 859,col 67)",
        "(line 860,col 7)-(line 867,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "exportTestFunctions"
      ],
      "begin_line": 872,
      "end_line": 885,
      "comment": " Generates exports for functions associated with JsUnit. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d0db0a70-4459-46c4-9710-59182e4bd452.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 874,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 876,col 7)-(line 876,col 67)",
        "(line 877,col 7)-(line 883,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gatherRawExports"
      ],
      "begin_line": 888,
      "end_line": 906,
      "comment": " Raw exports processing pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-56a0667f-8b42-45c0-b311-00757e136f3c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 890,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 892,col 7)-(line 893,col 20)",
        "(line 895,col 7)-(line 904,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8860c79d-2fc6-47f2-a629-2db2f597f703.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 896,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 898,col 11)-(line 898,col 38)",
        "(line 899,col 11)-(line 901,col 11)",
        "(line 902,col 11)-(line 902,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closurePrimitives"
      ],
      "begin_line": 909,
      "end_line": 932,
      "comment": " Closure pre-processing pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-04b41988-79e4-440d-b97e-e7a8976365d1.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 912,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 914,col 7)-(line 914,col 55)",
        "(line 915,col 7)-(line 918,col 46)",
        "(line 920,col 7)-(line 930,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5caea289-179e-4a9e-8b51-c0c493fc67e7.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 921,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 923,col 11)-(line 923,col 38)",
        "(line 924,col 11)-(line 924,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-64fbd715-3979-4f23-b907-9282462afa8d.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 926,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 928,col 11)-(line 928,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jqueryAliases"
      ],
      "begin_line": 935,
      "end_line": 940,
      "comment": " Expand jQuery Primitives and Aliases pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cc05d6d0-f302-47b6-8df0-0012f8d2f7b5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 936,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 938,col 7)-(line 938,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessages"
      ],
      "begin_line": 947,
      "end_line": 959,
      "comment": "\n   * The default i18n pass.\n   * A lot of the options are not configurable, because ReplaceMessages\n   * has a lot of legacy logic.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-363add40-7570-43d7-aa71-86c60a324f2c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 948,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 950,col 7)-(line 957,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessagesForChrome"
      ],
      "begin_line": 961,
      "end_line": 972,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-84c0d044-dfab-4d88-96b2-7708a7c2ba05.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 963,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 965,col 7)-(line 970,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureGoogScopeAliases"
      ],
      "begin_line": 975,
      "end_line": 985,
      "comment": " Applies aliases and inlines goog.scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-13de63f5-2047-4612-8673-903dbcc8a760.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 977,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 979,col 7)-(line 979,col 55)",
        "(line 980,col 7)-(line 983,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureRewriteGoogClass"
      ],
      "begin_line": 988,
      "end_line": 994,
      "comment": " Rewrites goog.class "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6424d850-211d-4c95-acb2-558d858d43d7.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 990,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 992,col 7)-(line 992,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureCheckGetCssName"
      ],
      "begin_line": 997,
      "end_line": 1007,
      "comment": " Checks that CSS class names are wrapped in goog.getCssName "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9877faca-4311-4948-9519-67179f0ce6fd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 999,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 7)-(line 1001,col 65)",
        "(line 1002,col 7)-(line 1003,col 77)",
        "(line 1004,col 7)-(line 1005,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureReplaceGetCssName"
      ],
      "begin_line": 1014,
      "end_line": 1034,
      "comment": "\n   * Processes goog.getCssName.  The cssRenamingMap is used to lookup\n   * replacement values for the classnames.  If null, the raw class names are\n   * inlined.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-346b55e8-5299-43ec-a523-78930255608e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1016,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 7)-(line 1032,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3b3f08b2-e12f-4d36-8f91-8d3cd6899aa9.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1019,
      "end_line": 1031,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 11)-(line 1021,col 50)",
        "(line 1022,col 11)-(line 1024,col 11)",
        "(line 1025,col 11)-(line 1028,col 44)",
        "(line 1029,col 11)-(line 1029,col 40)",
        "(line 1030,col 11)-(line 1030,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createSyntheticBlocks"
      ],
      "begin_line": 1040,
      "end_line": 1048,
      "comment": "\n   * Creates synthetic blocks to prevent FoldConstants from moving code\n   * past markers in the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9ee88428-813c-4c34-a31b-ab7cfef90278.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1042,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 7)-(line 1046,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "peepholeOptimizations"
      ],
      "begin_line": 1051,
      "end_line": 1063,
      "comment": " Various peephole optimizations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e67c772e-8bcf-4015-8266-2c491299ac0d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1053,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 7)-(line 1055,col 33)",
        "(line 1056,col 7)-(line 1061,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "latePeepholeOptimizations"
      ],
      "begin_line": 1066,
      "end_line": 1079,
      "comment": " Same as peepholeOptimizations but aggressively merges code together "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-08c6ec94-fe22-4b4b-945a-5150c6082b2d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1068,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1070,col 7)-(line 1070,col 32)",
        "(line 1071,col 7)-(line 1077,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkVars"
      ],
      "begin_line": 1082,
      "end_line": 1088,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8bbfcb92-0651-4a78-9b23-3514db8139bf.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1086,col 7)-(line 1086,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRegExp"
      ],
      "begin_line": 1091,
      "end_line": 1106,
      "comment": " Checks for RegExp references. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b87e049b-63aa-42f1-b93b-6674511751e1.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1093,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1095,col 7)-(line 1095,col 57)",
        "(line 1097,col 7)-(line 1104,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8e8409f8-9b59-495b-bcdf-5416ab6fefc1.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1098,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 11)-(line 1100,col 38)",
        "(line 1101,col 11)-(line 1102,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkVariableReferences"
      ],
      "begin_line": 1109,
      "end_line": 1116,
      "comment": " Checks that references to variables look reasonable. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-de5c9a5e-ed94-434a-8621-61ee2f9189cd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1111,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 7)-(line 1114,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "objectPropertyStringPreprocess"
      ],
      "begin_line": 1119,
      "end_line": 1125,
      "comment": " Pre-process goog.testing.ObjectPropertyString. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cd4d1fc4-10a6-4f6c-af26-4545a3ef2c84.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1121,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1123,col 7)-(line 1123,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "resolveTypes"
      ],
      "begin_line": 1128,
      "end_line": 1134,
      "comment": " Creates a typed scope and adds types to the type registry. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-fa5315ec-af3a-432c-9f24-1e3b2cf1a4c4.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1130,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 7)-(line 1132,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "clearTypedScopePass"
      ],
      "begin_line": 1137,
      "end_line": 1143,
      "comment": " Clears the typed scope when we\u0027re done. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e5fb1d17-a296-4e32-9f51-f15b36ca329b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1139,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1141,col 7)-(line 1141,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inferTypes"
      ],
      "begin_line": 1146,
      "end_line": 1164,
      "comment": " Runs type inference. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bec28920-21c3-4e1f-a914-ed1985f8ff62.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1148,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 7)-(line 1162,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-2a226a0d-d3d8-4a31-97bb-06f6de4219d3.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1151,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1153,col 11)-(line 1153,col 47)",
        "(line 1154,col 11)-(line 1154,col 61)",
        "(line 1156,col 11)-(line 1156,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6fb81c66-d2a0-46f3-87be-696d3830317e.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1158,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 11)-(line 1160,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inferJsDocInfo"
      ],
      "begin_line": 1166,
      "end_line": 1184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b53044a0-2b49-42c1-90de-c6b1bde535ca.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1168,
      "end_line": 1183,
      "comment": "",
      "child_ranges": [
        "(line 1170,col 5)-(line 1182,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-19f96688-41f0-4ed4-8172-16d92b91e61b.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1171,
      "end_line": 1177,
      "comment": "",
      "child_ranges": [
        "(line 1173,col 9)-(line 1173,col 45)",
        "(line 1174,col 9)-(line 1174,col 59)",
        "(line 1176,col 9)-(line 1176,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5d22df80-f3df-4986-bf22-c7c3eb70b008.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1178,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkTypes"
      ],
      "begin_line": 1187,
      "end_line": 1207,
      "comment": " Checks type usage "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-03fb31fc-9314-4f58-b6c7-fbc2d9c3995e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1189,
      "end_line": 1206,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 7)-(line 1205,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ea7fc0e4-bfd0-47a6-9488-b3f1a97ba4d8.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1192,
      "end_line": 1200,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 11)-(line 1194,col 47)",
        "(line 1195,col 11)-(line 1195,col 61)",
        "(line 1197,col 11)-(line 1197,col 52)",
        "(line 1198,col 11)-(line 1198,col 39)",
        "(line 1199,col 11)-(line 1199,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8bcfad22-3ee0-4d35-8a9d-2008f8025b9f.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1201,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1203,col 11)-(line 1203,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkControlFlow"
      ],
      "begin_line": 1213,
      "end_line": 1228,
      "comment": "\n   * Checks possible execution paths of the program for problems: missing return\n   * statements and dead code.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-94b9b9de-d413-4d67-9b68-f521b7fd40bc.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1215,
      "end_line": 1227,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 7)-(line 1217,col 54)",
        "(line 1218,col 7)-(line 1221,col 7)",
        "(line 1222,col 7)-(line 1225,col 7)",
        "(line 1226,col 7)-(line 1226,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkAccessControls"
      ],
      "begin_line": 1231,
      "end_line": 1237,
      "comment": " Checks access controls. Depends on type-inference. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-fbcc0018-e5f8-40ce-9b3d-190e3592a8bd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1233,
      "end_line": 1236,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 7)-(line 1235,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.combineChecks(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.jscomp.NodeTraversal.Callback\u003e)",
      "begin_line": 1240,
      "end_line": 1245,
      "comment": " Executes the given callbacks with a {@link CombinedCompilerPass}. ",
      "child_ranges": [
        "(line 1242,col 5)-(line 1242,col 54)",
        "(line 1243,col 5)-(line 1243,col 73)",
        "(line 1244,col 5)-(line 1244,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalTypeResolver",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 1248,
      "end_line": 1267,
      "comment": " A compiler pass that resolves types in the global scope. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1249,
      "end_line": 1249,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.GlobalTypeResolver(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1251,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1252,col 7)-(line 1252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1255,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 7)-(line 1261,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1263,
      "end_line": 1266,
      "comment": "",
      "child_ranges": [
        "(line 1265,col 7)-(line 1265,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClearTypedScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1270,
      "end_line": 1275,
      "comment": " A compiler pass that clears the global scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.ClearTypedScope.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1271,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1273,col 7)-(line 1273,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalNames"
      ],
      "begin_line": 1278,
      "end_line": 1294,
      "comment": " Checks global name usage. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-40b9c768-98c6-441c-a486-4e81afb8cd6e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1280,
      "end_line": 1293,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 7)-(line 1292,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-dc4a05c8-becc-4b12-b5fd-eb492506b533.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1283,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 11)-(line 1288,col 78)",
        "(line 1289,col 11)-(line 1290,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkStrictMode"
      ],
      "begin_line": 1297,
      "end_line": 1305,
      "comment": " Checks that the code is ES5 or Caja compliant. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7f406c8b-db6f-4217-aba1-19282a7eb356.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1299,
      "end_line": 1304,
      "comment": "",
      "child_ranges": [
        "(line 1301,col 7)-(line 1303,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processTweaks"
      ],
      "begin_line": 1308,
      "end_line": 1320,
      "comment": " Process goog.tweak.getTweak() calls. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ce6067ce-4551-4d09-b640-4bd7738c71a8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1309,
      "end_line": 1319,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 7)-(line 1318,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8ff84030-008f-45c2-beee-b532c2f97fe7.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1312,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1314,col 11)-(line 1316,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processDefines"
      ],
      "begin_line": 1323,
      "end_line": 1337,
      "comment": " Override @define-annotated constants. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1f57143b-adf0-41cc-8dfd-e8a6a656614e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1324,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1326,col 7)-(line 1335,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-2449f4c2-9372-4aa8-a581-e64b2168cdbe.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1327,
      "end_line": 1334,
      "comment": "",
      "child_ranges": [
        "(line 1329,col 11)-(line 1329,col 78)",
        "(line 1330,col 11)-(line 1330,col 63)",
        "(line 1332,col 11)-(line 1333,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "garbageCollectChecks"
      ],
      "begin_line": 1340,
      "end_line": 1358,
      "comment": " Release references to data that is only needed during checks. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-36c74806-60f4-4af3-9336-a5626f0b123b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1342,
      "end_line": 1357,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 7)-(line 1356,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-401b606b-51ea-4dd4-afb5-19bf912d7e77.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1345,
      "end_line": 1350,
      "comment": "",
      "child_ranges": [
        "(line 1349,col 11)-(line 1349,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-2e1f5870-041c-4b60-96c9-a01f30186cf0.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1352,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 11)-(line 1354,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkConsts"
      ],
      "begin_line": 1361,
      "end_line": 1366,
      "comment": " Checks that all constants are not modified "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-977416ac-9d0a-4155-b042-cc2e960c316f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1362,
      "end_line": 1365,
      "comment": "",
      "child_ranges": [
        "(line 1364,col 7)-(line 1364,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "computeFunctionNames"
      ],
      "begin_line": 1369,
      "end_line": 1375,
      "comment": " Computes the names of functions for later analysis. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f0c50204-a338-4d9d-9642-20946af74fe5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1371,
      "end_line": 1374,
      "comment": "",
      "child_ranges": [
        "(line 1373,col 7)-(line 1373,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ignoreCajaProperties"
      ],
      "begin_line": 1378,
      "end_line": 1384,
      "comment": " Skips Caja-private properties in for-in loops "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6a608273-09e3-4883-94ad-c0a03b06f5ef.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1380,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1382,col 7)-(line 1382,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheck"
      ],
      "begin_line": 1387,
      "end_line": 1394,
      "comment": " Inserts run-time type assertions for debugging. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-90b55678-2e6f-421a-a652-50bf8a4b032f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1389,
      "end_line": 1393,
      "comment": "",
      "child_ranges": [
        "(line 1391,col 7)-(line 1392,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceIdGenerators"
      ],
      "begin_line": 1397,
      "end_line": 1412,
      "comment": " Generates unique ids. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7e45387a-7494-41bc-b569-e8aad45c2088.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1399,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 7)-(line 1410,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-52f4de84-f0f9-4509-9b63-77c4b9189b25.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1402,
      "end_line": 1409,
      "comment": "",
      "child_ranges": [
        "(line 1403,col 11)-(line 1406,col 53)",
        "(line 1407,col 11)-(line 1407,col 38)",
        "(line 1408,col 11)-(line 1408,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceStrings"
      ],
      "begin_line": 1415,
      "end_line": 1431,
      "comment": " Replace strings. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-18bf514e-9dd3-4e12-ad74-9dc763062837.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1416,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1418,col 7)-(line 1429,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-991864ce-4ea8-4f4d-b489-f2b9bab9d62a.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1419,
      "end_line": 1428,
      "comment": "",
      "child_ranges": [
        "(line 1420,col 11)-(line 1425,col 46)",
        "(line 1426,col 11)-(line 1426,col 38)",
        "(line 1427,col 11)-(line 1427,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "optimizeArgumentsArray"
      ],
      "begin_line": 1434,
      "end_line": 1440,
      "comment": " Optimizes the \"arguments\" array. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6edf24c6-a960-48e2-8997-13039e61b955.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1436,
      "end_line": 1439,
      "comment": "",
      "child_ranges": [
        "(line 1438,col 7)-(line 1438,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureCodeRemoval"
      ],
      "begin_line": 1443,
      "end_line": 1450,
      "comment": " Remove variables set to goog.abstractMethod. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-84c1008e-7268-47a3-b9c5-1c12a59d93d2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1445,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 7)-(line 1448,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureOptimizePrimitives"
      ],
      "begin_line": 1453,
      "end_line": 1459,
      "comment": " Special case optimizations for closure functions. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5f70a51f-0990-408f-aaef-27f662a76b47.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1455,
      "end_line": 1458,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 7)-(line 1457,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rescopeGlobalSymbols"
      ],
      "begin_line": 1462,
      "end_line": 1468,
      "comment": " Puts global symbols into a single object. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9d78928d-4412-4701-a9a2-5bc36d80b8b2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1464,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1466,col 7)-(line 1466,col 79)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseProperties"
      ],
      "begin_line": 1471,
      "end_line": 1479,
      "comment": " Collapses names in the global scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-0a67630d-ab3a-4b57-a0f0-880127c15c3b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1473,
      "end_line": 1478,
      "comment": "",
      "child_ranges": [
        "(line 1475,col 7)-(line 1477,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseObjectLiterals"
      ],
      "begin_line": 1482,
      "end_line": 1489,
      "comment": " Rewrite properties as variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bd8671b0-e214-4237-9c78-3bbf62c0cae9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1484,
      "end_line": 1488,
      "comment": "",
      "child_ranges": [
        "(line 1486,col 7)-(line 1487,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypesBuilder"
      ],
      "begin_line": 1495,
      "end_line": 1505,
      "comment": "\n   * Try to infer the actual types, which may be narrower\n   * than the declared types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-eaaf3774-6bb9-4049-900f-4126cc8947f5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1497,
      "end_line": 1504,
      "comment": "",
      "child_ranges": [
        "(line 1499,col 7)-(line 1501,col 7)",
        "(line 1502,col 7)-(line 1502,col 48)",
        "(line 1503,col 7)-(line 1503,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "disambiguateProperties"
      ],
      "begin_line": 1508,
      "end_line": 1520,
      "comment": " Devirtualize property names based on type information. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-97c32f83-6079-4d76-a28e-0c02398c342f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1510,
      "end_line": 1519,
      "comment": "",
      "child_ranges": [
        "(line 1512,col 7)-(line 1518,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "chainCalls"
      ],
      "begin_line": 1525,
      "end_line": 1530,
      "comment": "\n   * Chain calls to functions that return this.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-75b1d587-038f-451f-9a5e-74bde25112fb.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1526,
      "end_line": 1529,
      "comment": "",
      "child_ranges": [
        "(line 1528,col 7)-(line 1528,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "devirtualizePrototypeMethods"
      ],
      "begin_line": 1536,
      "end_line": 1542,
      "comment": "\n   * Rewrite instance methods as static methods, to make them easier\n   * to inline.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-63ae337c-ac18-4e83-b3d3-3a0925cc33af.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1538,
      "end_line": 1541,
      "comment": "",
      "child_ranges": [
        "(line 1540,col 7)-(line 1540,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "optimizeCallsAndRemoveUnusedVars"
      ],
      "begin_line": 1548,
      "end_line": 1575,
      "comment": "\n   * Optimizes unused function arguments, unused return values, and inlines\n   * constant parameters. Also runs RemoveUnusedVars.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1ff895e5-afd8-4eb8-8df7-91457530f57d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1550,
      "end_line": 1574,
      "comment": "",
      "child_ranges": [
        "(line 1552,col 7)-(line 1552,col 57)",
        "(line 1553,col 7)-(line 1556,col 7)",
        "(line 1558,col 7)-(line 1561,col 7)",
        "(line 1563,col 7)-(line 1572,col 7)",
        "(line 1573,col 7)-(line 1573,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markPureFunctions"
      ],
      "begin_line": 1581,
      "end_line": 1588,
      "comment": "\n   * Look for function calls that are pure, and annotate them\n   * that way.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d9158772-9b40-4180-92c0-74ccad76db24.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1583,
      "end_line": 1587,
      "comment": "",
      "child_ranges": [
        "(line 1585,col 7)-(line 1586,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffectCalls"
      ],
      "begin_line": 1594,
      "end_line": 1600,
      "comment": "\n   * Look for function calls that have no side effects, and annotate them\n   * that way.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d63988ca-b1ce-4a91-aee2-185d9febe214.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1596,
      "end_line": 1599,
      "comment": "",
      "child_ranges": [
        "(line 1598,col 7)-(line 1598,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineVariables"
      ],
      "begin_line": 1603,
      "end_line": 1625,
      "comment": " Inlines variables heuristically. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a66160e9-8eeb-4b3a-a30e-68117e2af573.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1605,
      "end_line": 1624,
      "comment": "",
      "child_ranges": [
        "(line 1607,col 7)-(line 1623,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineConstants"
      ],
      "begin_line": 1628,
      "end_line": 1635,
      "comment": " Inlines variables that are marked as constants. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e86f7ab0-a141-4048-a245-b6c83b564122.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1630,
      "end_line": 1634,
      "comment": "",
      "child_ranges": [
        "(line 1632,col 7)-(line 1633,col 63)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minimizeExitPoints"
      ],
      "begin_line": 1640,
      "end_line": 1646,
      "comment": "\n   * Perform local control flow optimizations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e3a38b97-7516-44f8-816c-46f3a62f0f35.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1642,
      "end_line": 1645,
      "comment": "",
      "child_ranges": [
        "(line 1644,col 7)-(line 1644,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnreachableCode"
      ],
      "begin_line": 1651,
      "end_line": 1657,
      "comment": "\n   * Use data flow analysis to remove dead branches.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-46a63dd3-46e6-46c6-8f1e-bcbe3ea9e547.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1653,
      "end_line": 1656,
      "comment": "",
      "child_ranges": [
        "(line 1655,col 7)-(line 1655,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypeProperties"
      ],
      "begin_line": 1662,
      "end_line": 1670,
      "comment": "\n   * Remove prototype properties that do not appear to be used.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-82f6ecf1-e54f-45be-b88c-1462614e2767.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1664,
      "end_line": 1669,
      "comment": "",
      "child_ranges": [
        "(line 1666,col 7)-(line 1668,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedClassProperties"
      ],
      "begin_line": 1675,
      "end_line": 1681,
      "comment": "\n   * Remove prototype properties that do not appear to be used.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b938a755-cfc2-4e03-8a3e-bea6813fce89.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1677,
      "end_line": 1680,
      "comment": "",
      "child_ranges": [
        "(line 1679,col 7)-(line 1679,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smartNamePass"
      ],
      "begin_line": 1687,
      "end_line": 1713,
      "comment": "\n   * Process smart name processing - removes unused classes and does referencing\n   * starting with minimum set of names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-86ad2dac-dc28-45d0-be3d-eb2d6c14d204.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1689,
      "end_line": 1712,
      "comment": "",
      "child_ranges": [
        "(line 1691,col 7)-(line 1711,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e5d29ecd-48b1-40dc-ba30-253e3648037b.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1692,
      "end_line": 1710,
      "comment": "",
      "child_ranges": [
        "(line 1694,col 11)-(line 1694,col 62)",
        "(line 1695,col 11)-(line 1695,col 36)",
        "(line 1697,col 11)-(line 1697,col 49)",
        "(line 1698,col 11)-(line 1705,col 11)",
        "(line 1707,col 11)-(line 1709,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smartNamePass2"
      ],
      "begin_line": 1719,
      "end_line": 1731,
      "comment": "\n   * Process smart name processing - removes unused classes and does referencing\n   * starting with minimum set of names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a4d28604-83b9-40eb-ac4d-a3d972ea3abd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1720,
      "end_line": 1730,
      "comment": "",
      "child_ranges": [
        "(line 1722,col 7)-(line 1729,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-19429ed2-5117-4aab-b9a3-375cfb73da50.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1723,
      "end_line": 1728,
      "comment": "",
      "child_ranges": [
        "(line 1725,col 11)-(line 1725,col 62)",
        "(line 1726,col 11)-(line 1726,col 36)",
        "(line 1727,col 11)-(line 1727,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineSimpleMethods"
      ],
      "begin_line": 1734,
      "end_line": 1740,
      "comment": " Inlines simple methods, like getters "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-697eb0c2-ca6b-422c-bf50-7a34c8a7de37.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1736,
      "end_line": 1739,
      "comment": "",
      "child_ranges": [
        "(line 1738,col 7)-(line 1738,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "deadAssignmentsElimination"
      ],
      "begin_line": 1743,
      "end_line": 1749,
      "comment": " Kills dead assignments. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-48dc84a1-f92c-4609-bd29-0edacf5b1272.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1745,
      "end_line": 1748,
      "comment": "",
      "child_ranges": [
        "(line 1747,col 7)-(line 1747,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineFunctions"
      ],
      "begin_line": 1752,
      "end_line": 1767,
      "comment": " Inlines function calls. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b311b79d-ad25-425c-90d8-2217c5ef344c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1754,
      "end_line": 1766,
      "comment": "",
      "child_ranges": [
        "(line 1756,col 7)-(line 1756,col 59)",
        "(line 1757,col 7)-(line 1765,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineProperties"
      ],
      "begin_line": 1770,
      "end_line": 1776,
      "comment": " Inlines constant properties. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ab8d49e0-d9eb-4c99-b2db-5ef726d2daf3.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1772,
      "end_line": 1775,
      "comment": "",
      "child_ranges": [
        "(line 1774,col 7)-(line 1774,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedVars"
      ],
      "begin_line": 1779,
      "end_line": 1793,
      "comment": " Removes variables that are never used. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-4963fb63-77b1-4a74-86bb-2359ba22ea65.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1781,
      "end_line": 1792,
      "comment": "",
      "child_ranges": [
        "(line 1783,col 7)-(line 1784,col 39)",
        "(line 1785,col 7)-(line 1786,col 79)",
        "(line 1787,col 7)-(line 1791,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleCodeMotion"
      ],
      "begin_line": 1798,
      "end_line": 1804,
      "comment": "\n   * Move global symbols to a deeper common module\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6a105b02-d375-4e16-ac85-c04ae8ca74f2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1800,
      "end_line": 1803,
      "comment": "",
      "child_ranges": [
        "(line 1802,col 7)-(line 1802,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleMethodMotion"
      ],
      "begin_line": 1809,
      "end_line": 1819,
      "comment": "\n   * Move methods to a deeper common module\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7f111afe-cfb7-4c31-bb4a-0504a514f903.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1811,
      "end_line": 1818,
      "comment": "",
      "child_ranges": [
        "(line 1813,col 7)-(line 1817,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "specializeInitialModule"
      ],
      "begin_line": 1824,
      "end_line": 1831,
      "comment": "\n   * Specialize the initial module at the cost of later modules\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-231b5d71-e97a-4876-a096-dc0156ef9807.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1826,
      "end_line": 1830,
      "comment": "",
      "child_ranges": [
        "(line 1828,col 7)-(line 1829,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "flowSensitiveInlineVariables"
      ],
      "begin_line": 1834,
      "end_line": 1840,
      "comment": " A data-flow based variable inliner. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-87867ae7-d793-475f-b0b7-b659cccbb3f9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1836,
      "end_line": 1839,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 7)-(line 1838,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coalesceVariableNames"
      ],
      "begin_line": 1843,
      "end_line": 1849,
      "comment": " Uses register-allocation algorithms to use fewer variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c5647177-1c43-41da-bdc7-93760aae8e2c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1845,
      "end_line": 1848,
      "comment": "",
      "child_ranges": [
        "(line 1847,col 7)-(line 1847,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "exploitAssign"
      ],
      "begin_line": 1855,
      "end_line": 1861,
      "comment": "\n   * Some simple, local collapses (e.g., {@code var x; var y;} becomes\n   * {@code var x,y;}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a4cfd0d1-ce8a-4d0a-bd82-6b03bf305a3b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1856,
      "end_line": 1860,
      "comment": "",
      "child_ranges": [
        "(line 1858,col 7)-(line 1859,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseVariableDeclarations"
      ],
      "begin_line": 1867,
      "end_line": 1873,
      "comment": "\n   * Some simple, local collapses (e.g., {@code var x; var y;} becomes\n   * {@code var x,y;}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c6ca42f4-5977-4e07-a6e0-2a0717dcce79.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1869,
      "end_line": 1872,
      "comment": "",
      "child_ranges": [
        "(line 1871,col 7)-(line 1871,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "groupVariableDeclarations"
      ],
      "begin_line": 1878,
      "end_line": 1884,
      "comment": "\n   * Simple global collapses of variable declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e529d781-3e91-424b-9377-c3acf2012de6.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1880,
      "end_line": 1883,
      "comment": "",
      "child_ranges": [
        "(line 1882,col 7)-(line 1882,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extractPrototypeMemberDeclarations"
      ],
      "begin_line": 1889,
      "end_line": 1896,
      "comment": "\n   * Extracts common sub-expressions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-454a6deb-f164-486e-9ad9-3ee917b62c82.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1891,
      "end_line": 1895,
      "comment": "",
      "child_ranges": [
        "(line 1893,col 7)-(line 1894,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rewriteFunctionExpressions"
      ],
      "begin_line": 1899,
      "end_line": 1905,
      "comment": " Rewrites common function definitions to be more compact. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d9b62653-32dc-4906-83b7-78b532ed22ce.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1901,
      "end_line": 1904,
      "comment": "",
      "child_ranges": [
        "(line 1903,col 7)-(line 1903,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseAnonymousFunctions"
      ],
      "begin_line": 1908,
      "end_line": 1914,
      "comment": " Collapses functions to not use the VAR keyword. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d4103a53-da22-437c-a3f8-37c0ca5b92e9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1910,
      "end_line": 1913,
      "comment": "",
      "child_ranges": [
        "(line 1912,col 7)-(line 1912,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moveFunctionDeclarations"
      ],
      "begin_line": 1917,
      "end_line": 1923,
      "comment": " Moves function declarations to the top, to simulate actual hoisting. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-52e4987e-d0ba-47cc-8178-8d92fca18659.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1919,
      "end_line": 1922,
      "comment": "",
      "child_ranges": [
        "(line 1921,col 7)-(line 1921,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameUnmappedAnonymousFunctions"
      ],
      "begin_line": 1925,
      "end_line": 1931,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-0cfd19cb-10d5-4c9b-aa7b-d0c20f982d42.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1927,
      "end_line": 1930,
      "comment": "",
      "child_ranges": [
        "(line 1929,col 7)-(line 1929,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameMappedAnonymousFunctions"
      ],
      "begin_line": 1933,
      "end_line": 1947,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-df18b12f-525f-41a7-8ee4-940456f92c1f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1935,
      "end_line": 1946,
      "comment": "",
      "child_ranges": [
        "(line 1937,col 7)-(line 1945,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bb94f1d1-0382-4b6b-bbfb-1bc92334825e.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1938,
      "end_line": 1944,
      "comment": "",
      "child_ranges": [
        "(line 1939,col 11)-(line 1941,col 69)",
        "(line 1942,col 11)-(line 1942,col 37)",
        "(line 1943,col 11)-(line 1943,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasExternals"
      ],
      "begin_line": 1950,
      "end_line": 1956,
      "comment": " Alias external symbols. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-af7e57fb-7e01-4e16-bc16-091679454986.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1951,
      "end_line": 1955,
      "comment": "",
      "child_ranges": [
        "(line 1953,col 7)-(line 1954,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasStrings"
      ],
      "begin_line": 1962,
      "end_line": 1972,
      "comment": "\n   * Alias string literals with global variables, to avoid creating lots of\n   * transient objects.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1632dbf0-f7ab-455f-a4e3-8818f6ecc5bd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1963,
      "end_line": 1971,
      "comment": "",
      "child_ranges": [
        "(line 1965,col 7)-(line 1970,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasKeywords"
      ],
      "begin_line": 1975,
      "end_line": 1980,
      "comment": " Aliases common keywords (true, false) "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3bc41e1a-447b-496d-b854-57cc9a022f22.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1976,
      "end_line": 1979,
      "comment": "",
      "child_ranges": [
        "(line 1978,col 7)-(line 1978,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "objectPropertyStringPostprocess"
      ],
      "begin_line": 1983,
      "end_line": 1989,
      "comment": " Handling for the ObjectPropertyString primitive. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c1351b39-6725-4496-8e5c-c6769e1d06dc.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1985,
      "end_line": 1988,
      "comment": "",
      "child_ranges": [
        "(line 1987,col 7)-(line 1987,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ambiguateProperties"
      ],
      "begin_line": 1995,
      "end_line": 2002,
      "comment": "\n   * Renames properties so that the two properties that never appear on\n   * the same object get the same name.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b232c4a9-e12f-45dc-8642-773b905735d8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1997,
      "end_line": 2001,
      "comment": "",
      "child_ranges": [
        "(line 1999,col 7)-(line 2000,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markUnnormalized"
      ],
      "begin_line": 2007,
      "end_line": 2017,
      "comment": "\n   * Mark the point at which the normalized AST assumptions no longer hold.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e9a8a1a7-b94f-420f-b9c4-c117d14da4df.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2009,
      "end_line": 2016,
      "comment": "",
      "child_ranges": [
        "(line 2011,col 7)-(line 2015,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-630b1a42-3955-40de-b3e7-3432ba77a44b.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2012,
      "end_line": 2014,
      "comment": "",
      "child_ranges": [
        "(line 2013,col 11)-(line 2013,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "denormalize"
      ],
      "begin_line": 2020,
      "end_line": 2025,
      "comment": " Denormalize the AST for code generation. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1bf487c6-acaf-49fa-934e-a24d3c05d6c8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2021,
      "end_line": 2024,
      "comment": "",
      "child_ranges": [
        "(line 2023,col 7)-(line 2023,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "invertContextualRenaming"
      ],
      "begin_line": 2028,
      "end_line": 2034,
      "comment": " Inverting name normalization. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-44bd493e-0f73-428a-89da-ac5a29fa2b56.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2030,
      "end_line": 2033,
      "comment": "",
      "child_ranges": [
        "(line 2032,col 7)-(line 2032,col 75)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameProperties"
      ],
      "begin_line": 2039,
      "end_line": 2051,
      "comment": "\n   * Renames properties.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-11de4657-8577-4d7b-997f-391a2232a46a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2041,
      "end_line": 2050,
      "comment": "",
      "child_ranges": [
        "(line 2043,col 7)-(line 2043,col 67)",
        "(line 2044,col 7)-(line 2049,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bc7b8546-d31e-476c-be4c-93ff46da01c5.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2045,
      "end_line": 2048,
      "comment": "",
      "child_ranges": [
        "(line 2046,col 11)-(line 2047,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runPropertyRenaming(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableMap, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2053,
      "end_line": 2082,
      "comment": "",
      "child_ranges": [
        "(line 2056,col 5)-(line 2057,col 64)",
        "(line 2058,col 5)-(line 2081,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameVars"
      ],
      "begin_line": 2085,
      "end_line": 2096,
      "comment": " Renames variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f39d2ce0-1daa-40ba-9c52-4f1e8974e09b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2086,
      "end_line": 2095,
      "comment": "",
      "child_ranges": [
        "(line 2088,col 7)-(line 2088,col 67)",
        "(line 2089,col 7)-(line 2094,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ffd547ec-7371-403d-a77f-81325f6fe5be.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2090,
      "end_line": 2093,
      "comment": "",
      "child_ranges": [
        "(line 2091,col 11)-(line 2092,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runVariableRenaming(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableMap, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2098,
      "end_line": 2122,
      "comment": "",
      "child_ranges": [
        "(line 2101,col 5)-(line 2102,col 64)",
        "(line 2103,col 5)-(line 2104,col 77)",
        "(line 2105,col 5)-(line 2105,col 50)",
        "(line 2106,col 5)-(line 2108,col 5)",
        "(line 2109,col 5)-(line 2109,col 57)",
        "(line 2110,col 5)-(line 2119,col 23)",
        "(line 2120,col 5)-(line 2120,col 30)",
        "(line 2121,col 5)-(line 2121,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameLabels"
      ],
      "begin_line": 2125,
      "end_line": 2130,
      "comment": " Renames labels "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-4ead5e51-9bc1-4f29-a9ec-ba64eaf15a7f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2126,
      "end_line": 2129,
      "comment": "",
      "child_ranges": [
        "(line 2128,col 7)-(line 2128,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "convertToDottedProperties"
      ],
      "begin_line": 2133,
      "end_line": 2139,
      "comment": " Convert bracket access to dot access "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5885d101-6f23-4fa6-accf-f00282ef52b2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2135,
      "end_line": 2138,
      "comment": "",
      "child_ranges": [
        "(line 2137,col 7)-(line 2137,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheckAst"
      ],
      "begin_line": 2142,
      "end_line": 2147,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-226fed69-73a9-4532-8327-4c701a583271.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2143,
      "end_line": 2146,
      "comment": "",
      "child_ranges": [
        "(line 2145,col 7)-(line 2145,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheckVars"
      ],
      "begin_line": 2150,
      "end_line": 2155,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d224cf32-2136-4765-a1fe-43b43c77e31a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2151,
      "end_line": 2154,
      "comment": "",
      "child_ranges": [
        "(line 2153,col 7)-(line 2153,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "instrumentFunctions"
      ],
      "begin_line": 2158,
      "end_line": 2180,
      "comment": " Adds instrumentations according to an instrumentation template. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-40be7997-0198-44de-8567-b827f43cb2ea.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2160,
      "end_line": 2179,
      "comment": "",
      "child_ranges": [
        "(line 2162,col 7)-(line 2178,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ac4ae6f2-d36f-4ca4-bf24-7a507f1b51c7.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2163,
      "end_line": 2177,
      "comment": "",
      "child_ranges": [
        "(line 2164,col 11)-(line 2176,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass(java.lang.String)",
      "begin_line": 2185,
      "end_line": 2192,
      "comment": "\n   * Create a no-op pass that can only run once. Used to break up loops.\n   ",
      "child_ranges": [
        "(line 2186,col 5)-(line 2191,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cd249bc8-14e2-4c6b-8957-034da0c3ce81.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2187,
      "end_line": 2190,
      "comment": "",
      "child_ranges": [
        "(line 2189,col 9)-(line 2189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)",
      "begin_line": 2197,
      "end_line": 2205,
      "comment": "\n   * Runs custom passes that are designated to run at a particular time.\n   ",
      "child_ranges": [
        "(line 2199,col 5)-(line 2204,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f0da3b3d-3d82-4b04-a5b7-ff4f55a489f2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2200,
      "end_line": 2203,
      "comment": "",
      "child_ranges": [
        "(line 2202,col 9)-(line 2202,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.isInliningForbidden()",
      "begin_line": 2211,
      "end_line": 2215,
      "comment": "\n   * All inlining is forbidden in heuristic renaming mode, because inlining\n   * will ruin the invariants that it depends on.\n   ",
      "child_ranges": [
        "(line 2212,col 5)-(line 2214,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runInSerial(com.google.javascript.jscomp.CompilerPass...)",
      "begin_line": 2218,
      "end_line": 2220,
      "comment": " Create a compiler pass that runs the given passes in serial. ",
      "child_ranges": [
        "(line 2219,col 5)-(line 2219,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runInSerial(java.util.Collection\u003ccom.google.javascript.jscomp.CompilerPass\u003e)",
      "begin_line": 2223,
      "end_line": 2232,
      "comment": " Create a compiler pass that runs the given passes in serial. ",
      "child_ranges": [
        "(line 2225,col 5)-(line 2231,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-937c5f78-22f4-416c-b71a-8df450e983da.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2226,
      "end_line": 2230,
      "comment": "",
      "child_ranges": [
        "(line 2227,col 9)-(line 2229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 2234,
      "end_line": 2249,
      "comment": "",
      "child_ranges": [
        "(line 2237,col 5)-(line 2237,col 65)",
        "(line 2239,col 5)-(line 2241,col 5)",
        "(line 2243,col 5)-(line 2246,col 5)",
        "(line 2248,col 5)-(line 2248,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printNameReferenceGraph"
      ],
      "begin_line": 2251,
      "end_line": 2274,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3db72876-cd93-4b52-9e3d-ad54a11bb83b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2253,
      "end_line": 2273,
      "comment": "",
      "child_ranges": [
        "(line 2255,col 7)-(line 2272,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ad16c87e-a9f6-4ade-a649-934dea2279ee.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2256,
      "end_line": 2271,
      "comment": "",
      "child_ranges": [
        "(line 2258,col 11)-(line 2259,col 59)",
        "(line 2260,col 11)-(line 2260,col 38)",
        "(line 2261,col 11)-(line 2261,col 64)",
        "(line 2262,col 11)-(line 2270,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printNameReferenceReport"
      ],
      "begin_line": 2276,
      "end_line": 2302,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a11995c0-5045-457b-a43b-09e774b417d7.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2278,
      "end_line": 2301,
      "comment": "",
      "child_ranges": [
        "(line 2280,col 7)-(line 2300,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d6fea521-e9b8-4e97-b68e-cc9658c84825.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2281,
      "end_line": 2299,
      "comment": "",
      "child_ranges": [
        "(line 2283,col 11)-(line 2284,col 59)",
        "(line 2285,col 11)-(line 2285,col 66)",
        "(line 2286,col 11)-(line 2298,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HotSwapPassFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassFactory"
      ],
      "begin_line": 2307,
      "end_line": 2320,
      "comment": "\n   * A pass-factory that is good for {@code HotSwapCompilerPass} passes.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.HotSwapPassFactory(java.lang.String, boolean)",
      "begin_line": 2309,
      "end_line": 2311,
      "comment": "",
      "child_ranges": [
        "(line 2310,col 7)-(line 2310,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2313,
      "end_line": 2314,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.getHotSwapPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2316,
      "end_line": 2319,
      "comment": "",
      "child_ranges": [
        "(line 2318,col 7)-(line 2318,col 35)"
      ]
    }
  ]
}