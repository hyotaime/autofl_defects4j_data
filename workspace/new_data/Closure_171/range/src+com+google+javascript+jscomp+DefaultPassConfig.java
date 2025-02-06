{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DefaultPassConfig.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPassConfig",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassConfig"
      ],
      "begin_line": 53,
      "end_line": 2424,
      "comment": " cleaned up."
    },
    {
      "type": "field",
      "varNames": [
        "COMPILED_CONSTANT_NAME"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " For the --mark-as-compiled pass "
    },
    {
      "type": "field",
      "varNames": [
        "CLOSURE_LOCALE_CONSTANT_NAME"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Constant name for Closure\u0027s locale "
    },
    {
      "type": "field",
      "varNames": [
        "TIGHTEN_TYPES_WITHOUT_TYPE_CHECK"
      ],
      "begin_line": 62,
      "end_line": 64,
      "comment": " Compiler errors when invalid combinations of passes are run."
    },
    {
      "type": "field",
      "varNames": [
        "CANNOT_USE_PROTOTYPE_AND_VAR"
      ],
      "begin_line": 66,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REPORT_PATH_IO_ERROR"
      ],
      "begin_line": 71,
      "end_line": 73,
      "comment": " Miscellaneous errors."
    },
    {
      "type": "field",
      "varNames": [
        "NAME_REF_GRAPH_FILE_ERROR"
      ],
      "begin_line": 75,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME_REF_REPORT_FILE_ERROR"
      ],
      "begin_line": 79,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_SYMBOL_NAMESPACE_PATTERN"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaceForChecks"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n   * A global namespace to share across checking passes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n   * A symbol table for registering references that get removed during\n   * preprocessing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypes"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n   * A type-tightener to share across optimization passes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exportedNames"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Names exported by goog.exportSymbol. "
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Shared name generator that remembers character encoding bias "
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleIdGenerator"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": "\n   * Ids for cross-module method stubbing, so that each method has\n   * a unique id.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cssNames"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n   * Keys are arguments passed to getCssName() found during compilation; values\n   * are the number of times the key appeared as an argument to getCssName().\n   "
    },
    {
      "type": "field",
      "varNames": [
        "variableMap"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The variable renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "propertyMap"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The property renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "anonymousFunctionNameMap"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The naming map for anonymous functions "
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Fully qualified function names and globally unique ids "
    },
    {
      "type": "field",
      "varNames": [
        "stringMap"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " String replacement map "
    },
    {
      "type": "field",
      "varNames": [
        "idGeneratorMap"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Id generator map "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.DefaultPassConfig(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getIntermediateState()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 149,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 152,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 155,col 40)",
        "(line 156,col 5)-(line 157,col 45)",
        "(line 158,col 5)-(line 158,col 63)",
        "(line 159,col 5)-(line 159,col 41)",
        "(line 160,col 5)-(line 160,col 41)",
        "(line 161,col 5)-(line 161,col 67)",
        "(line 162,col 5)-(line 162,col 37)",
        "(line 163,col 5)-(line 163,col 45)",
        "(line 164,col 5)-(line 164,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getGlobalNamespace()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getPreprocessorSymbolTable()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getNameGenerator()",
      "begin_line": 175,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 178,col 5)",
        "(line 179,col 5)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.maybeInitializePreprocessorSymbolTable(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 189,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getChecks()",
      "begin_line": 192,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 52)",
        "(line 196,col 5)-(line 196,col 56)",
        "(line 198,col 5)-(line 201,col 5)",
        "(line 203,col 5)-(line 212,col 5)",
        "(line 214,col 5)-(line 216,col 5)",
        "(line 218,col 5)-(line 220,col 5)",
        "(line 222,col 5)-(line 222,col 33)",
        "(line 224,col 5)-(line 228,col 5)",
        "(line 230,col 5)-(line 233,col 5)",
        "(line 235,col 5)-(line 237,col 5)",
        "(line 239,col 5)-(line 241,col 5)",
        "(line 246,col 5)-(line 248,col 5)",
        "(line 250,col 5)-(line 252,col 5)",
        "(line 254,col 5)-(line 256,col 5)",
        "(line 258,col 5)-(line 260,col 5)",
        "(line 262,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 267,col 26)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 277,col 5)-(line 279,col 5)",
        "(line 281,col 5)-(line 295,col 5)",
        "(line 297,col 5)-(line 300,col 5)",
        "(line 303,col 5)-(line 307,col 5)",
        "(line 309,col 5)-(line 312,col 5)",
        "(line 314,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 320,col 5)",
        "(line 324,col 5)-(line 326,col 5)",
        "(line 332,col 5)-(line 336,col 5)",
        "(line 338,col 5)-(line 340,col 5)",
        "(line 343,col 5)-(line 343,col 31)",
        "(line 345,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 353,col 5)",
        "(line 355,col 5)-(line 358,col 5)",
        "(line 360,col 5)-(line 360,col 55)",
        "(line 362,col 5)-(line 362,col 35)",
        "(line 363,col 5)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getOptimizations()",
      "begin_line": 366,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 52)",
        "(line 369,col 5)-(line 369,col 37)",
        "(line 374,col 5)-(line 376,col 5)",
        "(line 378,col 5)-(line 378,col 63)",
        "(line 380,col 5)-(line 382,col 5)",
        "(line 385,col 5)-(line 387,col 5)",
        "(line 391,col 5)-(line 394,col 5)",
        "(line 400,col 5)-(line 402,col 5)",
        "(line 406,col 5)-(line 408,col 5)",
        "(line 412,col 5)-(line 414,col 5)",
        "(line 417,col 5)-(line 419,col 5)",
        "(line 425,col 5)-(line 427,col 5)",
        "(line 429,col 5)-(line 442,col 5)",
        "(line 444,col 5)-(line 446,col 5)",
        "(line 452,col 5)-(line 452,col 28)",
        "(line 457,col 5)-(line 459,col 5)",
        "(line 461,col 5)-(line 461,col 35)",
        "(line 463,col 5)-(line 466,col 5)",
        "(line 470,col 5)-(line 472,col 5)",
        "(line 482,col 5)-(line 484,col 5)",
        "(line 491,col 5)-(line 493,col 5)",
        "(line 495,col 5)-(line 498,col 5)",
        "(line 500,col 5)-(line 500,col 59)",
        "(line 502,col 5)-(line 502,col 45)",
        "(line 504,col 5)-(line 520,col 5)",
        "(line 522,col 5)-(line 522,col 54)",
        "(line 524,col 5)-(line 526,col 5)",
        "(line 528,col 5)-(line 530,col 5)",
        "(line 532,col 5)-(line 532,col 53)",
        "(line 536,col 5)-(line 539,col 5)",
        "(line 541,col 5)-(line 549,col 5)",
        "(line 553,col 5)-(line 555,col 5)",
        "(line 557,col 5)-(line 559,col 5)",
        "(line 562,col 5)-(line 567,col 5)",
        "(line 569,col 5)-(line 572,col 5)",
        "(line 580,col 5)-(line 585,col 5)",
        "(line 587,col 5)-(line 590,col 5)",
        "(line 592,col 5)-(line 594,col 5)",
        "(line 597,col 5)-(line 599,col 5)",
        "(line 603,col 5)-(line 605,col 5)",
        "(line 611,col 5)-(line 613,col 5)",
        "(line 617,col 5)-(line 619,col 5)",
        "(line 621,col 5)-(line 623,col 5)",
        "(line 625,col 5)-(line 627,col 5)",
        "(line 631,col 5)-(line 631,col 33)",
        "(line 633,col 5)-(line 642,col 5)",
        "(line 644,col 5)-(line 647,col 5)",
        "(line 650,col 5)-(line 650,col 28)",
        "(line 652,col 5)-(line 654,col 5)",
        "(line 657,col 5)-(line 659,col 5)",
        "(line 661,col 5)-(line 663,col 5)",
        "(line 665,col 5)-(line 670,col 5)",
        "(line 672,col 5)-(line 674,col 5)",
        "(line 676,col 5)-(line 678,col 5)",
        "(line 681,col 5)-(line 683,col 5)",
        "(line 685,col 5)-(line 687,col 5)",
        "(line 689,col 5)-(line 691,col 5)",
        "(line 693,col 5)-(line 696,col 5)",
        "(line 698,col 5)-(line 698,col 42)",
        "(line 700,col 5)-(line 708,col 5)",
        "(line 711,col 5)-(line 711,col 31)",
        "(line 712,col 5)-(line 712,col 32)",
        "(line 714,col 5)-(line 714,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getMainOptimizationLoop()",
      "begin_line": 718,
      "end_line": 751,
      "comment": " Creates the passes for the main optimization loop. ",
      "child_ranges": [
        "(line 719,col 5)-(line 719,col 52)",
        "(line 720,col 5)-(line 722,col 5)",
        "(line 724,col 5)-(line 724,col 43)",
        "(line 726,col 5)-(line 728,col 5)",
        "(line 730,col 5)-(line 732,col 5)",
        "(line 734,col 5)-(line 736,col 35)",
        "(line 738,col 5)-(line 745,col 5)",
        "(line 746,col 5)-(line 748,col 5)",
        "(line 749,col 5)-(line 749,col 36)",
        "(line 750,col 5)-(line 750,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getCodeRemovingPasses()",
      "begin_line": 754,
      "end_line": 786,
      "comment": " Creates several passes aimed at removing code. ",
      "child_ranges": [
        "(line 755,col 5)-(line 755,col 52)",
        "(line 756,col 5)-(line 758,col 5)",
        "(line 760,col 5)-(line 764,col 5)",
        "(line 766,col 5)-(line 770,col 5)",
        "(line 772,col 5)-(line 774,col 5)",
        "(line 776,col 5)-(line 778,col 5)",
        "(line 780,col 5)-(line 782,col 5)",
        "(line 784,col 5)-(line 784,col 36)",
        "(line 785,col 5)-(line 785,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkSideEffects"
      ],
      "begin_line": 791,
      "end_line": 804,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3527739c-651a-4813-8f04-b022f2cc5547.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 793,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 798,col 7)-(line 799,col 63)",
        "(line 800,col 7)-(line 802,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "stripSideEffectProtection"
      ],
      "begin_line": 809,
      "end_line": 816,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-23b90671-c22f-48e8-b538-e91f5e985b27.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 811,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 7)-(line 814,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "suspiciousCode"
      ],
      "begin_line": 821,
      "end_line": 841,
      "comment": "\n   * Checks for code that is probably wrong (such as stray expressions).\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-40803ac9-bd21-4ff3-8811-958acc845073.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 823,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 825,col 7)-(line 825,col 60)",
        "(line 826,col 7)-(line 828,col 7)",
        "(line 830,col 7)-(line 832,col 7)",
        "(line 834,col 7)-(line 836,col 7)",
        "(line 838,col 7)-(line 838,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.assertAllOneTimePasses(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 844,
      "end_line": 848,
      "comment": " Verify that all the passes are one-time passes. ",
      "child_ranges": [
        "(line 845,col 5)-(line 847,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.assertAllLoopablePasses(java.util.List\u003ccom.google.javascript.jscomp.PassFactory\u003e)",
      "begin_line": 851,
      "end_line": 855,
      "comment": " Verify that all the passes are multi-run passes. ",
      "child_ranges": [
        "(line 852,col 5)-(line 854,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkControlStructures"
      ],
      "begin_line": 858,
      "end_line": 864,
      "comment": " Checks for validity of the control structures. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-58b6d11d-3cb8-4993-b115-87b622e787ac.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 860,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 862,col 7)-(line 862,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRequires"
      ],
      "begin_line": 867,
      "end_line": 873,
      "comment": " Checks that all constructed classes are goog.require()d. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1773a561-3d7f-494c-ad34-db1f80beee56.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 869,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 871,col 7)-(line 871,col 79)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkProvides"
      ],
      "begin_line": 876,
      "end_line": 882,
      "comment": " Makes sure @constructor is paired with goog.provides(). "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ce7cfc40-3777-4926-8dd7-1e84740576c5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 880,col 7)-(line 880,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "GENERATE_EXPORTS_ERROR"
      ],
      "begin_line": 884,
      "end_line": 888,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generateExports"
      ],
      "begin_line": 891,
      "end_line": 904,
      "comment": " Generates exports for @export annotations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bc78084e-c947-4ba0-b682-910a9856a353.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 892,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 894,col 7)-(line 894,col 67)",
        "(line 895,col 7)-(line 902,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "exportTestFunctions"
      ],
      "begin_line": 907,
      "end_line": 920,
      "comment": " Generates exports for functions associated with JsUnit. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-12dc00cb-f1f1-443c-859e-a53f7aa6e087.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 909,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 911,col 7)-(line 911,col 67)",
        "(line 912,col 7)-(line 918,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gatherRawExports"
      ],
      "begin_line": 923,
      "end_line": 941,
      "comment": " Raw exports processing pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-41b9b684-ffd0-4170-aaa1-657bff4d1274.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 925,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 927,col 7)-(line 928,col 20)",
        "(line 930,col 7)-(line 939,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-4207881f-21a5-4353-a2ff-57faffd79571.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 931,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 933,col 11)-(line 933,col 38)",
        "(line 934,col 11)-(line 936,col 11)",
        "(line 937,col 11)-(line 937,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closurePrimitives"
      ],
      "begin_line": 944,
      "end_line": 967,
      "comment": " Closure pre-processing pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ff7d496a-9164-4909-b72a-eb10fb0a0540.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 947,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 949,col 7)-(line 949,col 55)",
        "(line 950,col 7)-(line 953,col 46)",
        "(line 955,col 7)-(line 965,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-af456ea3-3ffe-4bcf-9fc0-5a1f15a4b31e.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 956,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 958,col 11)-(line 958,col 38)",
        "(line 959,col 11)-(line 959,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f54245cd-3a38-4972-8645-d7adcc1d3082.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 961,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 963,col 11)-(line 963,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jqueryAliases"
      ],
      "begin_line": 970,
      "end_line": 975,
      "comment": " Expand jQuery Primitives and Aliases pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-31e7fa96-d5dd-451a-8882-b7251bf661b9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 971,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 973,col 7)-(line 973,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "angularPass"
      ],
      "begin_line": 978,
      "end_line": 984,
      "comment": " Process AngularJS-specific annotations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-31befd72-308d-4f34-8f92-9fec48a4d5dc.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 980,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 982,col 7)-(line 982,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessages"
      ],
      "begin_line": 991,
      "end_line": 1003,
      "comment": "\n   * The default i18n pass.\n   * A lot of the options are not configurable, because ReplaceMessages\n   * has a lot of legacy logic.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-917312fe-d48c-4371-a0ae-3781abc42663.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 992,
      "end_line": 1002,
      "comment": "",
      "child_ranges": [
        "(line 994,col 7)-(line 1001,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceMessagesForChrome"
      ],
      "begin_line": 1005,
      "end_line": 1016,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-dd315f2a-76aa-4887-aad8-635d43cf3558.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1007,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 7)-(line 1014,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureGoogScopeAliases"
      ],
      "begin_line": 1019,
      "end_line": 1029,
      "comment": " Applies aliases and inlines goog.scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7d4832b8-f732-4ce0-a610-faf9b20d5e32.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1021,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 7)-(line 1023,col 55)",
        "(line 1024,col 7)-(line 1027,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureRewriteGoogClass"
      ],
      "begin_line": 1032,
      "end_line": 1038,
      "comment": " Rewrites goog.class "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-10563600-035e-457b-aa02-1d6ff18cd499.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1034,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 7)-(line 1036,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureCheckGetCssName"
      ],
      "begin_line": 1041,
      "end_line": 1051,
      "comment": " Checks that CSS class names are wrapped in goog.getCssName "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-086544a7-c5e5-44b0-a084-6da9a1d91632.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1043,
      "end_line": 1050,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 7)-(line 1045,col 65)",
        "(line 1046,col 7)-(line 1047,col 77)",
        "(line 1048,col 7)-(line 1049,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureReplaceGetCssName"
      ],
      "begin_line": 1058,
      "end_line": 1078,
      "comment": "\n   * Processes goog.getCssName.  The cssRenamingMap is used to lookup\n   * replacement values for the classnames.  If null, the raw class names are\n   * inlined.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f15f82a5-438d-41aa-80e6-a25a3d11ee8f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1060,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 7)-(line 1076,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-626fac4a-4aaf-45d0-b6a0-7cd0e5cbd729.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1063,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 11)-(line 1065,col 50)",
        "(line 1066,col 11)-(line 1068,col 11)",
        "(line 1069,col 11)-(line 1072,col 44)",
        "(line 1073,col 11)-(line 1073,col 40)",
        "(line 1074,col 11)-(line 1074,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "createSyntheticBlocks"
      ],
      "begin_line": 1084,
      "end_line": 1092,
      "comment": "\n   * Creates synthetic blocks to prevent FoldConstants from moving code\n   * past markers in the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-05ee2103-6ebc-4a68-bb8c-e2819402c853.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1086,
      "end_line": 1091,
      "comment": "",
      "child_ranges": [
        "(line 1088,col 7)-(line 1090,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "peepholeOptimizations"
      ],
      "begin_line": 1095,
      "end_line": 1108,
      "comment": " Various peephole optimizations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5734c1a4-43fc-48e6-85dd-ab73dcc2160a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1097,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 7)-(line 1099,col 33)",
        "(line 1100,col 7)-(line 1106,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "latePeepholeOptimizations"
      ],
      "begin_line": 1111,
      "end_line": 1125,
      "comment": " Same as peepholeOptimizations but aggressively merges code together "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e610d036-567d-4cd4-ba57-7e872555e140.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1113,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 7)-(line 1115,col 32)",
        "(line 1116,col 7)-(line 1123,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkVars"
      ],
      "begin_line": 1128,
      "end_line": 1134,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-94daa4f3-349f-4ed8-ada2-bb7e5513aa14.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1130,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 7)-(line 1132,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkRegExp"
      ],
      "begin_line": 1137,
      "end_line": 1152,
      "comment": " Checks for RegExp references. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f8384230-f96e-40eb-9448-4463fdb9fea0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1139,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1141,col 7)-(line 1141,col 57)",
        "(line 1143,col 7)-(line 1150,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8997c951-8159-469d-988a-fd5d27bf9585.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1144,
      "end_line": 1149,
      "comment": "",
      "child_ranges": [
        "(line 1146,col 11)-(line 1146,col 38)",
        "(line 1147,col 11)-(line 1148,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkVariableReferences"
      ],
      "begin_line": 1155,
      "end_line": 1162,
      "comment": " Checks that references to variables look reasonable. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a4045235-ebdf-4841-831d-ccd3c774e9fb.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1157,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 7)-(line 1160,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "objectPropertyStringPreprocess"
      ],
      "begin_line": 1165,
      "end_line": 1171,
      "comment": " Pre-process goog.testing.ObjectPropertyString. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6bd109b7-dd63-4d94-be61-c3b576442c87.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1167,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 7)-(line 1169,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "resolveTypes"
      ],
      "begin_line": 1174,
      "end_line": 1180,
      "comment": " Creates a typed scope and adds types to the type registry. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-00d060da-01ed-463f-af16-0f401339a7bd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1176,
      "end_line": 1179,
      "comment": "",
      "child_ranges": [
        "(line 1178,col 7)-(line 1178,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "clearTypedScopePass"
      ],
      "begin_line": 1183,
      "end_line": 1189,
      "comment": " Clears the typed scope when we\u0027re done. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-998f9f27-8f1e-4666-93fc-267037b2912b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1185,
      "end_line": 1188,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 7)-(line 1187,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inferTypes"
      ],
      "begin_line": 1192,
      "end_line": 1210,
      "comment": " Runs type inference. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d8e5cde0-9b33-4ff3-82d2-5381a18aca32.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1194,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 7)-(line 1208,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f77caf82-dda9-4aa2-9f88-b41f4cc595a1.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1197,
      "end_line": 1203,
      "comment": "",
      "child_ranges": [
        "(line 1199,col 11)-(line 1199,col 47)",
        "(line 1200,col 11)-(line 1200,col 61)",
        "(line 1202,col 11)-(line 1202,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f8389640-da96-41a2-907d-6b4facde0d73.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1204,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 11)-(line 1206,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inferJsDocInfo"
      ],
      "begin_line": 1212,
      "end_line": 1230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6cd032bb-aa03-403d-b79e-84995353608a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1214,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1216,col 5)-(line 1228,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a4c4cc93-c237-45d9-93d7-bfc7b42cb349.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1217,
      "end_line": 1223,
      "comment": "",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 45)",
        "(line 1220,col 9)-(line 1220,col 59)",
        "(line 1222,col 9)-(line 1222,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b7cdde9a-2151-48a6-a0d5-7dc1c7ae12f2.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1224,
      "end_line": 1227,
      "comment": "",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkTypes"
      ],
      "begin_line": 1233,
      "end_line": 1253,
      "comment": " Checks type usage "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6cc618dd-c256-44ad-bab2-73736f3f74b9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1235,
      "end_line": 1252,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 7)-(line 1251,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-08e93997-b491-4232-8b86-4c710b1d0114.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1238,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 11)-(line 1240,col 47)",
        "(line 1241,col 11)-(line 1241,col 61)",
        "(line 1243,col 11)-(line 1243,col 52)",
        "(line 1244,col 11)-(line 1244,col 39)",
        "(line 1245,col 11)-(line 1245,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b378589d-049b-4857-baa3-47be7b53f41f.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1247,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 11)-(line 1249,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkControlFlow"
      ],
      "begin_line": 1259,
      "end_line": 1274,
      "comment": "\n   * Checks possible execution paths of the program for problems: missing return\n   * statements and dead code.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ad6210a8-88d3-4701-9399-5a7055f512a8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1261,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 7)-(line 1263,col 54)",
        "(line 1264,col 7)-(line 1267,col 7)",
        "(line 1268,col 7)-(line 1271,col 7)",
        "(line 1272,col 7)-(line 1272,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkAccessControls"
      ],
      "begin_line": 1277,
      "end_line": 1283,
      "comment": " Checks access controls. Depends on type-inference. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-85e850c1-a1c5-4699-b9b9-e5293a62d426.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1279,
      "end_line": 1282,
      "comment": "",
      "child_ranges": [
        "(line 1281,col 7)-(line 1281,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.combineChecks(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.jscomp.NodeTraversal.Callback\u003e)",
      "begin_line": 1286,
      "end_line": 1291,
      "comment": " Executes the given callbacks with a {@link CombinedCompilerPass}. ",
      "child_ranges": [
        "(line 1288,col 5)-(line 1288,col 54)",
        "(line 1289,col 5)-(line 1289,col 73)",
        "(line 1290,col 5)-(line 1290,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalTypeResolver",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 1294,
      "end_line": 1313,
      "comment": " A compiler pass that resolves types in the global scope. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1295,
      "end_line": 1295,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.GlobalTypeResolver(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1297,
      "end_line": 1299,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 7)-(line 1298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1301,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1303,col 7)-(line 1307,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.GlobalTypeResolver.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1309,
      "end_line": 1312,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 7)-(line 1311,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClearTypedScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1316,
      "end_line": 1321,
      "comment": " A compiler pass that clears the global scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.ClearTypedScope.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1317,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 7)-(line 1319,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkGlobalNames"
      ],
      "begin_line": 1324,
      "end_line": 1340,
      "comment": " Checks global name usage. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-48eb59c0-372c-4a88-bef4-835ae6488e14.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1326,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 7)-(line 1338,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8d694eab-0da3-486c-bd99-d1df851fe6e3.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1329,
      "end_line": 1337,
      "comment": "",
      "child_ranges": [
        "(line 1334,col 11)-(line 1334,col 78)",
        "(line 1335,col 11)-(line 1336,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkStrictMode"
      ],
      "begin_line": 1343,
      "end_line": 1351,
      "comment": " Checks that the code is ES5 or Caja compliant. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3b11829a-f3ee-416b-a4ae-98150964a078.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1345,
      "end_line": 1350,
      "comment": "",
      "child_ranges": [
        "(line 1347,col 7)-(line 1349,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processTweaks"
      ],
      "begin_line": 1354,
      "end_line": 1366,
      "comment": " Process goog.tweak.getTweak() calls. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cb5782ca-823b-4d12-bad8-21c99c265aba.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1355,
      "end_line": 1365,
      "comment": "",
      "child_ranges": [
        "(line 1357,col 7)-(line 1364,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-40368467-b3eb-4092-acb3-4f0dadf238c4.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1358,
      "end_line": 1363,
      "comment": "",
      "child_ranges": [
        "(line 1360,col 11)-(line 1362,col 71)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "processDefines"
      ],
      "begin_line": 1369,
      "end_line": 1383,
      "comment": " Override @define-annotated constants. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6edc8c89-e623-405a-af41-b5142f27501d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1370,
      "end_line": 1382,
      "comment": "",
      "child_ranges": [
        "(line 1372,col 7)-(line 1381,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e54521d2-01c2-4c6a-b1b3-b32145d9efbf.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1373,
      "end_line": 1380,
      "comment": "",
      "child_ranges": [
        "(line 1375,col 11)-(line 1375,col 78)",
        "(line 1376,col 11)-(line 1376,col 63)",
        "(line 1378,col 11)-(line 1379,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "garbageCollectChecks"
      ],
      "begin_line": 1386,
      "end_line": 1404,
      "comment": " Release references to data that is only needed during checks. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a7fac8c2-f593-4576-88d9-3a65e9bbbe23.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1388,
      "end_line": 1403,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 7)-(line 1402,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-88b54c5d-750f-4a04-a45e-4e64ea332c28.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1391,
      "end_line": 1396,
      "comment": "",
      "child_ranges": [
        "(line 1395,col 11)-(line 1395,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d1fd709d-6675-4111-a958-dee4e18c3136.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1398,
      "end_line": 1401,
      "comment": "",
      "child_ranges": [
        "(line 1400,col 11)-(line 1400,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkConsts"
      ],
      "begin_line": 1407,
      "end_line": 1412,
      "comment": " Checks that all constants are not modified "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b7d72f32-6797-48fb-a9eb-777920e67091.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1408,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1410,col 7)-(line 1410,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "checkEventfulObjectDisposal"
      ],
      "begin_line": 1415,
      "end_line": 1422,
      "comment": " Check memory bloat patterns "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e69de82e-c81b-4b0c-9239-e03048ed69dc.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1417,
      "end_line": 1421,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 7)-(line 1420,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "computeFunctionNames"
      ],
      "begin_line": 1425,
      "end_line": 1431,
      "comment": " Computes the names of functions for later analysis. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8416d139-0809-4113-938b-565bcd32ec3b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1427,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1429,col 7)-(line 1429,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ignoreCajaProperties"
      ],
      "begin_line": 1434,
      "end_line": 1440,
      "comment": " Skips Caja-private properties in for-in loops "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-106db689-99a0-40c3-b5dc-85b0ff2138e0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1436,
      "end_line": 1439,
      "comment": "",
      "child_ranges": [
        "(line 1438,col 7)-(line 1438,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "runtimeTypeCheck"
      ],
      "begin_line": 1443,
      "end_line": 1450,
      "comment": " Inserts run-time type assertions for debugging. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a4acdd3d-ad40-4946-bdea-9a35d0ed0179.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1445,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 7)-(line 1448,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceIdGenerators"
      ],
      "begin_line": 1453,
      "end_line": 1468,
      "comment": " Generates unique ids. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f3a42e76-d9e0-4bdf-8c7e-d7891e575d2c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1455,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 7)-(line 1466,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-eb423863-f9b4-4517-aacf-d45e7bcfdd08.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1458,
      "end_line": 1465,
      "comment": "",
      "child_ranges": [
        "(line 1459,col 11)-(line 1462,col 53)",
        "(line 1463,col 11)-(line 1463,col 38)",
        "(line 1464,col 11)-(line 1464,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "replaceStrings"
      ],
      "begin_line": 1471,
      "end_line": 1487,
      "comment": " Replace strings. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7667b78d-fbc0-46d7-9b85-a4d7062cb9f9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1472,
      "end_line": 1486,
      "comment": "",
      "child_ranges": [
        "(line 1474,col 7)-(line 1485,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-68608400-8c6d-466c-81ba-9a43ae226448.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1475,
      "end_line": 1484,
      "comment": "",
      "child_ranges": [
        "(line 1476,col 11)-(line 1481,col 46)",
        "(line 1482,col 11)-(line 1482,col 38)",
        "(line 1483,col 11)-(line 1483,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "optimizeArgumentsArray"
      ],
      "begin_line": 1490,
      "end_line": 1496,
      "comment": " Optimizes the \"arguments\" array. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c76457ef-07ac-43f8-afa2-0f3fdabb1061.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1492,
      "end_line": 1495,
      "comment": "",
      "child_ranges": [
        "(line 1494,col 7)-(line 1494,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureCodeRemoval"
      ],
      "begin_line": 1499,
      "end_line": 1506,
      "comment": " Remove variables set to goog.abstractMethod. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bf057f60-599c-4b3d-9705-7c9c8ae66c9b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1501,
      "end_line": 1505,
      "comment": "",
      "child_ranges": [
        "(line 1503,col 7)-(line 1504,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closureOptimizePrimitives"
      ],
      "begin_line": 1509,
      "end_line": 1515,
      "comment": " Special case optimizations for closure functions. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e6dfc51f-47be-4a2e-a9c7-6f893543333b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1511,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1513,col 7)-(line 1513,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rescopeGlobalSymbols"
      ],
      "begin_line": 1518,
      "end_line": 1524,
      "comment": " Puts global symbols into a single object. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8cde1763-0fb0-4f23-9a61-fd2a1a68cf07.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1520,
      "end_line": 1523,
      "comment": "",
      "child_ranges": [
        "(line 1522,col 7)-(line 1522,col 79)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseProperties"
      ],
      "begin_line": 1527,
      "end_line": 1535,
      "comment": " Collapses names in the global scope. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-166e4832-de5a-4db2-8029-7ab3049ee7c2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1529,
      "end_line": 1534,
      "comment": "",
      "child_ranges": [
        "(line 1531,col 7)-(line 1533,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseObjectLiterals"
      ],
      "begin_line": 1538,
      "end_line": 1545,
      "comment": " Rewrite properties as variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-de1eedce-b09c-4470-a9ed-c5712c286962.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1540,
      "end_line": 1544,
      "comment": "",
      "child_ranges": [
        "(line 1542,col 7)-(line 1543,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tightenTypesBuilder"
      ],
      "begin_line": 1551,
      "end_line": 1561,
      "comment": "\n   * Try to infer the actual types, which may be narrower\n   * than the declared types.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-008e6937-fe86-4670-a6f7-197dc8feff34.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1553,
      "end_line": 1560,
      "comment": "",
      "child_ranges": [
        "(line 1555,col 7)-(line 1557,col 7)",
        "(line 1558,col 7)-(line 1558,col 48)",
        "(line 1559,col 7)-(line 1559,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "disambiguatePrivateProperties"
      ],
      "begin_line": 1564,
      "end_line": 1570,
      "comment": " Disambiguate property names based on the coding convention. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-971780e7-0042-4f3b-9bcd-a331a809284b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1566,
      "end_line": 1569,
      "comment": "",
      "child_ranges": [
        "(line 1568,col 7)-(line 1568,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "disambiguateProperties"
      ],
      "begin_line": 1573,
      "end_line": 1585,
      "comment": " Disambiguate property names based on type information. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bbe62ad0-f566-40f3-85ef-663505c5ac03.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1575,
      "end_line": 1584,
      "comment": "",
      "child_ranges": [
        "(line 1577,col 7)-(line 1583,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "chainCalls"
      ],
      "begin_line": 1590,
      "end_line": 1595,
      "comment": "\n   * Chain calls to functions that return this.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-afce56b3-a723-4c89-83cc-b8d42ae65573.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1591,
      "end_line": 1594,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 7)-(line 1593,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "devirtualizePrototypeMethods"
      ],
      "begin_line": 1601,
      "end_line": 1607,
      "comment": "\n   * Rewrite instance methods as static methods, to make them easier\n   * to inline.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1225ab7e-e1d3-4f49-b1a4-e06a8817571c.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1603,
      "end_line": 1606,
      "comment": "",
      "child_ranges": [
        "(line 1605,col 7)-(line 1605,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "optimizeCallsAndRemoveUnusedVars"
      ],
      "begin_line": 1613,
      "end_line": 1640,
      "comment": "\n   * Optimizes unused function arguments, unused return values, and inlines\n   * constant parameters. Also runs RemoveUnusedVars.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cb71de88-39d6-488a-9186-642a6ca0abd7.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1615,
      "end_line": 1639,
      "comment": "",
      "child_ranges": [
        "(line 1617,col 7)-(line 1617,col 57)",
        "(line 1618,col 7)-(line 1621,col 7)",
        "(line 1623,col 7)-(line 1626,col 7)",
        "(line 1628,col 7)-(line 1637,col 7)",
        "(line 1638,col 7)-(line 1638,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markPureFunctions"
      ],
      "begin_line": 1646,
      "end_line": 1653,
      "comment": "\n   * Look for function calls that are pure, and annotate them\n   * that way.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-048492b3-6825-4654-b43a-c137716a3083.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1648,
      "end_line": 1652,
      "comment": "",
      "child_ranges": [
        "(line 1650,col 7)-(line 1651,col 65)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markNoSideEffectCalls"
      ],
      "begin_line": 1659,
      "end_line": 1665,
      "comment": "\n   * Look for function calls that have no side effects, and annotate them\n   * that way.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-8009816a-dbc7-4d46-98fa-e277db7484a9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1661,
      "end_line": 1664,
      "comment": "",
      "child_ranges": [
        "(line 1663,col 7)-(line 1663,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineVariables"
      ],
      "begin_line": 1668,
      "end_line": 1690,
      "comment": " Inlines variables heuristically. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-a8a7cfca-b8f5-43e3-8543-60f27ea1b862.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1670,
      "end_line": 1689,
      "comment": "",
      "child_ranges": [
        "(line 1672,col 7)-(line 1688,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineConstants"
      ],
      "begin_line": 1693,
      "end_line": 1700,
      "comment": " Inlines variables that are marked as constants. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-0187b0e0-407d-4b28-adc8-445d0ba61017.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1695,
      "end_line": 1699,
      "comment": "",
      "child_ranges": [
        "(line 1697,col 7)-(line 1698,col 63)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minimizeExitPoints"
      ],
      "begin_line": 1705,
      "end_line": 1711,
      "comment": "\n   * Perform local control flow optimizations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-2966acc8-8d0a-4ce6-b3da-13ee5c5c43a8.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1707,
      "end_line": 1710,
      "comment": "",
      "child_ranges": [
        "(line 1709,col 7)-(line 1709,col 46)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnreachableCode"
      ],
      "begin_line": 1716,
      "end_line": 1722,
      "comment": "\n   * Use data flow analysis to remove dead branches.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e75cff95-22eb-483d-aa2c-46d10b47d43a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1718,
      "end_line": 1721,
      "comment": "",
      "child_ranges": [
        "(line 1720,col 7)-(line 1720,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedPrototypeProperties"
      ],
      "begin_line": 1727,
      "end_line": 1735,
      "comment": "\n   * Remove prototype properties that do not appear to be used.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9be82102-3bbb-42cb-88c3-ba30b83ac321.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1729,
      "end_line": 1734,
      "comment": "",
      "child_ranges": [
        "(line 1731,col 7)-(line 1733,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedClassProperties"
      ],
      "begin_line": 1740,
      "end_line": 1746,
      "comment": "\n   * Remove prototype properties that do not appear to be used.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-090ac1a3-461b-4e67-86f2-6097c367e58e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1742,
      "end_line": 1745,
      "comment": "",
      "child_ranges": [
        "(line 1744,col 7)-(line 1744,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smartNamePass"
      ],
      "begin_line": 1752,
      "end_line": 1777,
      "comment": "\n   * Process smart name processing - removes unused classes and does referencing\n   * starting with minimum set of names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5f64e724-9b9d-4770-b4c4-c5f9a34565db.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1753,
      "end_line": 1776,
      "comment": "",
      "child_ranges": [
        "(line 1755,col 7)-(line 1775,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-fc830b7e-656a-45f2-a47a-439e952844d3.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1756,
      "end_line": 1774,
      "comment": "",
      "child_ranges": [
        "(line 1758,col 11)-(line 1758,col 62)",
        "(line 1759,col 11)-(line 1759,col 36)",
        "(line 1761,col 11)-(line 1761,col 49)",
        "(line 1762,col 11)-(line 1769,col 11)",
        "(line 1771,col 11)-(line 1773,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smartNamePass2"
      ],
      "begin_line": 1783,
      "end_line": 1795,
      "comment": "\n   * Process smart name processing - removes unused classes and does referencing\n   * starting with minimum set of names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-3bc80ed1-77df-4f63-af3d-fd44cb15d7f1.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1784,
      "end_line": 1794,
      "comment": "",
      "child_ranges": [
        "(line 1786,col 7)-(line 1793,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-fcedd9d2-a8f0-45ba-8e8d-c264ec8a4861.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1787,
      "end_line": 1792,
      "comment": "",
      "child_ranges": [
        "(line 1789,col 11)-(line 1789,col 62)",
        "(line 1790,col 11)-(line 1790,col 36)",
        "(line 1791,col 11)-(line 1791,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineSimpleMethods"
      ],
      "begin_line": 1798,
      "end_line": 1804,
      "comment": " Inlines simple methods, like getters "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c7cd6bbb-7d5b-4739-8c98-26be1e3d5a9d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1800,
      "end_line": 1803,
      "comment": "",
      "child_ranges": [
        "(line 1802,col 7)-(line 1802,col 47)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "deadAssignmentsElimination"
      ],
      "begin_line": 1807,
      "end_line": 1813,
      "comment": " Kills dead assignments. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-025f62d6-8eeb-4ca4-908d-0970014072d5.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1809,
      "end_line": 1812,
      "comment": "",
      "child_ranges": [
        "(line 1811,col 7)-(line 1811,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineFunctions"
      ],
      "begin_line": 1816,
      "end_line": 1831,
      "comment": " Inlines function calls. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-cfab884f-1a71-4f02-93b6-eb16b6a84411.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1818,
      "end_line": 1830,
      "comment": "",
      "child_ranges": [
        "(line 1820,col 7)-(line 1820,col 59)",
        "(line 1821,col 7)-(line 1829,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "inlineProperties"
      ],
      "begin_line": 1834,
      "end_line": 1840,
      "comment": " Inlines constant properties. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5f4954dd-4312-4526-b408-8bfd025e3e98.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1836,
      "end_line": 1839,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 7)-(line 1838,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "removeUnusedVars"
      ],
      "begin_line": 1843,
      "end_line": 1857,
      "comment": " Removes variables that are never used. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f52f768f-205e-433d-9cd9-d35a4e62cb51.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1845,
      "end_line": 1856,
      "comment": "",
      "child_ranges": [
        "(line 1847,col 7)-(line 1848,col 39)",
        "(line 1849,col 7)-(line 1850,col 79)",
        "(line 1851,col 7)-(line 1855,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleCodeMotion"
      ],
      "begin_line": 1862,
      "end_line": 1868,
      "comment": "\n   * Move global symbols to a deeper common module\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b04fd362-f88a-492a-b00d-347accee5c6d.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1864,
      "end_line": 1867,
      "comment": "",
      "child_ranges": [
        "(line 1866,col 7)-(line 1866,col 76)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleMethodMotion"
      ],
      "begin_line": 1873,
      "end_line": 1883,
      "comment": "\n   * Move methods to a deeper common module\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-41c08c02-f679-47d4-a213-7b194dafdbc2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1875,
      "end_line": 1882,
      "comment": "",
      "child_ranges": [
        "(line 1877,col 7)-(line 1881,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "specializeInitialModule"
      ],
      "begin_line": 1888,
      "end_line": 1895,
      "comment": "\n   * Specialize the initial module at the cost of later modules\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-b36b2e05-9bf0-428f-b065-a4583165c1de.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1890,
      "end_line": 1894,
      "comment": "",
      "child_ranges": [
        "(line 1892,col 7)-(line 1893,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "flowSensitiveInlineVariables"
      ],
      "begin_line": 1898,
      "end_line": 1904,
      "comment": " A data-flow based variable inliner. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-98e6b837-e13a-4aa6-b6b1-88d51809fce2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1900,
      "end_line": 1903,
      "comment": "",
      "child_ranges": [
        "(line 1902,col 7)-(line 1902,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coalesceVariableNames"
      ],
      "begin_line": 1907,
      "end_line": 1913,
      "comment": " Uses register-allocation algorithms to use fewer variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-54c1eca7-6336-4b7c-acab-4de0a338a0cd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1909,
      "end_line": 1912,
      "comment": "",
      "child_ranges": [
        "(line 1911,col 7)-(line 1911,col 78)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "exploitAssign"
      ],
      "begin_line": 1919,
      "end_line": 1925,
      "comment": "\n   * Some simple, local collapses (e.g., {@code var x; var y;} becomes\n   * {@code var x,y;}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-af41cb17-2bdc-4c7f-b684-d4bab66cf2b9.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1920,
      "end_line": 1924,
      "comment": "",
      "child_ranges": [
        "(line 1922,col 7)-(line 1923,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseVariableDeclarations"
      ],
      "begin_line": 1931,
      "end_line": 1937,
      "comment": "\n   * Some simple, local collapses (e.g., {@code var x; var y;} becomes\n   * {@code var x,y;}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-f72282f5-2f63-49eb-9bbd-036d45fcc6de.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1933,
      "end_line": 1936,
      "comment": "",
      "child_ranges": [
        "(line 1935,col 7)-(line 1935,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "groupVariableDeclarations"
      ],
      "begin_line": 1942,
      "end_line": 1948,
      "comment": "\n   * Simple global collapses of variable declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-bb74a56b-fda5-43be-bd1b-1814c38350b1.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1944,
      "end_line": 1947,
      "comment": "",
      "child_ranges": [
        "(line 1946,col 7)-(line 1946,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "extractPrototypeMemberDeclarations"
      ],
      "begin_line": 1953,
      "end_line": 1960,
      "comment": "\n   * Extracts common sub-expressions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-17dfbe69-3342-410e-a68f-605dc8d9ab28.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1955,
      "end_line": 1959,
      "comment": "",
      "child_ranges": [
        "(line 1957,col 7)-(line 1958,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rewriteFunctionExpressions"
      ],
      "begin_line": 1963,
      "end_line": 1969,
      "comment": " Rewrites common function definitions to be more compact. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-6160e456-999f-46a5-a03b-d53ca17f99bb.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1965,
      "end_line": 1968,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 7)-(line 1967,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "collapseAnonymousFunctions"
      ],
      "begin_line": 1972,
      "end_line": 1978,
      "comment": " Collapses functions to not use the VAR keyword. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e644e1c6-b088-444e-939d-f27bd3e1871b.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1974,
      "end_line": 1977,
      "comment": "",
      "child_ranges": [
        "(line 1976,col 7)-(line 1976,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "moveFunctionDeclarations"
      ],
      "begin_line": 1981,
      "end_line": 1987,
      "comment": " Moves function declarations to the top, to simulate actual hoisting. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ffddb0d1-cf27-4a0e-adca-274ac55a61d0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1983,
      "end_line": 1986,
      "comment": "",
      "child_ranges": [
        "(line 1985,col 7)-(line 1985,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameUnmappedAnonymousFunctions"
      ],
      "begin_line": 1989,
      "end_line": 1995,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-56c0f286-3ee4-4146-a373-e182123a1745.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1991,
      "end_line": 1994,
      "comment": "",
      "child_ranges": [
        "(line 1993,col 7)-(line 1993,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nameMappedAnonymousFunctions"
      ],
      "begin_line": 1997,
      "end_line": 2011,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-c675adc5-b170-4316-bd9a-3a7f980c0f25.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1999,
      "end_line": 2010,
      "comment": "",
      "child_ranges": [
        "(line 2001,col 7)-(line 2009,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-96a41b3e-c51f-4ff9-8f8e-3d25baa28d3a.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2002,
      "end_line": 2008,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 11)-(line 2005,col 69)",
        "(line 2006,col 11)-(line 2006,col 37)",
        "(line 2007,col 11)-(line 2007,col 58)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasExternals"
      ],
      "begin_line": 2014,
      "end_line": 2020,
      "comment": " Alias external symbols. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-486c4408-a738-43e2-9f17-326e233377fe.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2015,
      "end_line": 2019,
      "comment": "",
      "child_ranges": [
        "(line 2017,col 7)-(line 2018,col 64)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasStrings"
      ],
      "begin_line": 2026,
      "end_line": 2036,
      "comment": "\n   * Alias string literals with global variables, to avoid creating lots of\n   * transient objects.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d85550e6-be8d-4b35-82e7-622261dd9d5a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2027,
      "end_line": 2035,
      "comment": "",
      "child_ranges": [
        "(line 2029,col 7)-(line 2034,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "aliasKeywords"
      ],
      "begin_line": 2039,
      "end_line": 2044,
      "comment": " Aliases common keywords (true, false) "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-48692ca5-1784-46e5-b2e4-7df3baee0d18.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2040,
      "end_line": 2043,
      "comment": "",
      "child_ranges": [
        "(line 2042,col 7)-(line 2042,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "objectPropertyStringPostprocess"
      ],
      "begin_line": 2047,
      "end_line": 2053,
      "comment": " Handling for the ObjectPropertyString primitive. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e747aa4d-14ad-4222-9ba1-9ca2fd5d0c23.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2049,
      "end_line": 2052,
      "comment": "",
      "child_ranges": [
        "(line 2051,col 7)-(line 2051,col 59)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ambiguateProperties"
      ],
      "begin_line": 2059,
      "end_line": 2066,
      "comment": "\n   * Renames properties so that the two properties that never appear on\n   * the same object get the same name.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-4407cc35-ab94-4ff9-9dae-6953d1e802d0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2061,
      "end_line": 2065,
      "comment": "",
      "child_ranges": [
        "(line 2063,col 7)-(line 2064,col 77)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "markUnnormalized"
      ],
      "begin_line": 2071,
      "end_line": 2081,
      "comment": "\n   * Mark the point at which the normalized AST assumptions no longer hold.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-7e234068-cef6-45cc-98d0-0c2f4614f9e3.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2073,
      "end_line": 2080,
      "comment": "",
      "child_ranges": [
        "(line 2075,col 7)-(line 2079,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-adac6850-d42f-4782-9f43-106f85cbd508.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2076,
      "end_line": 2078,
      "comment": "",
      "child_ranges": [
        "(line 2077,col 11)-(line 2077,col 57)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "denormalize"
      ],
      "begin_line": 2084,
      "end_line": 2089,
      "comment": " Denormalize the AST for code generation. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-56cc2891-9bea-4096-848c-4b51aa3710ce.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2085,
      "end_line": 2088,
      "comment": "",
      "child_ranges": [
        "(line 2087,col 7)-(line 2087,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "invertContextualRenaming"
      ],
      "begin_line": 2092,
      "end_line": 2098,
      "comment": " Inverting name normalization. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-46fcad39-ad36-4661-8004-ec7f0edc67d6.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2094,
      "end_line": 2097,
      "comment": "",
      "child_ranges": [
        "(line 2096,col 7)-(line 2096,col 75)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameProperties"
      ],
      "begin_line": 2103,
      "end_line": 2115,
      "comment": "\n   * Renames properties.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-d8c600e7-bf75-4f19-967a-3d9a78f487b2.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2105,
      "end_line": 2114,
      "comment": "",
      "child_ranges": [
        "(line 2107,col 7)-(line 2107,col 67)",
        "(line 2108,col 7)-(line 2113,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ece3255b-c88d-48bc-a3e5-4e1fe184262d.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2109,
      "end_line": 2112,
      "comment": "",
      "child_ranges": [
        "(line 2110,col 11)-(line 2111,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runPropertyRenaming(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableMap, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2117,
      "end_line": 2146,
      "comment": "",
      "child_ranges": [
        "(line 2120,col 5)-(line 2121,col 64)",
        "(line 2122,col 5)-(line 2145,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameVars"
      ],
      "begin_line": 2149,
      "end_line": 2160,
      "comment": " Renames variables. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-23f32aad-1f77-4710-b3a7-db4f8ca43466.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2150,
      "end_line": 2159,
      "comment": "",
      "child_ranges": [
        "(line 2152,col 7)-(line 2152,col 67)",
        "(line 2153,col 7)-(line 2158,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ef97bd3e-ff5c-477f-88aa-4347f715a459.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2154,
      "end_line": 2157,
      "comment": "",
      "child_ranges": [
        "(line 2155,col 11)-(line 2156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runVariableRenaming(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableMap, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2162,
      "end_line": 2200,
      "comment": "",
      "child_ranges": [
        "(line 2165,col 5)-(line 2166,col 64)",
        "(line 2167,col 5)-(line 2168,col 77)",
        "(line 2169,col 5)-(line 2169,col 50)",
        "(line 2170,col 5)-(line 2172,col 5)",
        "(line 2173,col 5)-(line 2173,col 57)",
        "(line 2174,col 5)-(line 2187,col 5)",
        "(line 2188,col 5)-(line 2197,col 23)",
        "(line 2198,col 5)-(line 2198,col 30)",
        "(line 2199,col 5)-(line 2199,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "gatherCharBias"
      ],
      "begin_line": 2203,
      "end_line": 2211,
      "comment": " Renames labels "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-15b01413-f34b-4d55-b33e-a0902c4967fb.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2204,
      "end_line": 2210,
      "comment": "",
      "child_ranges": [
        "(line 2206,col 7)-(line 2209,col 68)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "renameLabels"
      ],
      "begin_line": 2214,
      "end_line": 2223,
      "comment": " Renames labels "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-68c32c11-1d6e-4696-9e3f-3e353a94abba.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2215,
      "end_line": 2222,
      "comment": "",
      "child_ranges": [
        "(line 2217,col 7)-(line 2221,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "convertToDottedProperties"
      ],
      "begin_line": 2226,
      "end_line": 2232,
      "comment": " Convert bracket access to dot access "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-89fbaaa3-c43a-4078-8b29-1a6f803fb920.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2228,
      "end_line": 2231,
      "comment": "",
      "child_ranges": [
        "(line 2230,col 7)-(line 2230,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheckAst"
      ],
      "begin_line": 2235,
      "end_line": 2240,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-14755430-0438-4222-bada-18cea023369a.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2236,
      "end_line": 2239,
      "comment": "",
      "child_ranges": [
        "(line 2238,col 7)-(line 2238,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheckVars"
      ],
      "begin_line": 2243,
      "end_line": 2248,
      "comment": " Checks that all variables are defined. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e9ead7e1-b5f5-4468-9e5c-3a872392c904.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2244,
      "end_line": 2247,
      "comment": "",
      "child_ranges": [
        "(line 2246,col 7)-(line 2246,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "instrumentFunctions"
      ],
      "begin_line": 2251,
      "end_line": 2273,
      "comment": " Adds instrumentations according to an instrumentation template. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9103d579-b278-4b92-9dfc-e471b8da632e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2253,
      "end_line": 2272,
      "comment": "",
      "child_ranges": [
        "(line 2255,col 7)-(line 2271,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-01f3629d-224d-49b1-88b2-bf1683add1d2.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2256,
      "end_line": 2270,
      "comment": "",
      "child_ranges": [
        "(line 2257,col 11)-(line 2269,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "instrumentMemoryAllocations"
      ],
      "begin_line": 2276,
      "end_line": 2282,
      "comment": " Adds instrumentation for memory allocations. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-dd071766-d2e7-4051-85a8-7d92a7303783.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2278,
      "end_line": 2281,
      "comment": "",
      "child_ranges": [
        "(line 2280,col 11)-(line 2280,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.createEmptyPass(java.lang.String)",
      "begin_line": 2287,
      "end_line": 2294,
      "comment": "\n   * Create a no-op pass that can only run once. Used to break up loops.\n   ",
      "child_ranges": [
        "(line 2288,col 5)-(line 2293,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-e1d74403-283e-497f-a67a-7b1534574446.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2289,
      "end_line": 2292,
      "comment": "",
      "child_ranges": [
        "(line 2291,col 9)-(line 2291,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getCustomPasses(com.google.javascript.jscomp.CustomPassExecutionTime)",
      "begin_line": 2299,
      "end_line": 2307,
      "comment": "\n   * Runs custom passes that are designated to run at a particular time.\n   ",
      "child_ranges": [
        "(line 2301,col 5)-(line 2306,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-4308cd51-4a83-4120-b3f7-951a54c5bdfd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2302,
      "end_line": 2305,
      "comment": "",
      "child_ranges": [
        "(line 2304,col 9)-(line 2304,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.isInliningForbidden()",
      "begin_line": 2313,
      "end_line": 2317,
      "comment": "\n   * All inlining is forbidden in heuristic renaming mode, because inlining\n   * will ruin the invariants that it depends on.\n   ",
      "child_ranges": [
        "(line 2314,col 5)-(line 2316,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runInSerial(com.google.javascript.jscomp.CompilerPass...)",
      "begin_line": 2320,
      "end_line": 2322,
      "comment": " Create a compiler pass that runs the given passes in serial. ",
      "child_ranges": [
        "(line 2321,col 5)-(line 2321,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.runInSerial(java.util.Collection\u003ccom.google.javascript.jscomp.CompilerPass\u003e)",
      "begin_line": 2325,
      "end_line": 2334,
      "comment": " Create a compiler pass that runs the given passes in serial. ",
      "child_ranges": [
        "(line 2327,col 5)-(line 2333,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-1b66c745-598f-4b31-a9e2-91f84adac525.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2328,
      "end_line": 2332,
      "comment": "",
      "child_ranges": [
        "(line 2329,col 9)-(line 2331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.getAdditionalReplacements(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 2336,
      "end_line": 2351,
      "comment": "",
      "child_ranges": [
        "(line 2339,col 5)-(line 2339,col 65)",
        "(line 2341,col 5)-(line 2343,col 5)",
        "(line 2345,col 5)-(line 2348,col 5)",
        "(line 2350,col 5)-(line 2350,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printNameReferenceGraph"
      ],
      "begin_line": 2353,
      "end_line": 2376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-ffa1a9fd-dfd5-49f4-93d7-547706340daf.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2355,
      "end_line": 2375,
      "comment": "",
      "child_ranges": [
        "(line 2357,col 7)-(line 2374,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-5950b938-090f-44bf-b799-79895038c6d8.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2358,
      "end_line": 2373,
      "comment": "",
      "child_ranges": [
        "(line 2360,col 11)-(line 2361,col 59)",
        "(line 2362,col 11)-(line 2362,col 38)",
        "(line 2363,col 11)-(line 2363,col 64)",
        "(line 2364,col 11)-(line 2372,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "printNameReferenceReport"
      ],
      "begin_line": 2378,
      "end_line": 2404,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-50669406-deca-4a37-b56c-64a37b9340ff.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2380,
      "end_line": 2403,
      "comment": "",
      "child_ranges": [
        "(line 2382,col 7)-(line 2402,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.Anonymous-9e37ffe4-bba4-4427-b01f-7f0842b693f2.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2383,
      "end_line": 2401,
      "comment": "",
      "child_ranges": [
        "(line 2385,col 11)-(line 2386,col 59)",
        "(line 2387,col 11)-(line 2387,col 66)",
        "(line 2388,col 11)-(line 2400,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HotSwapPassFactory",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassFactory"
      ],
      "begin_line": 2409,
      "end_line": 2422,
      "comment": "\n   * A pass-factory that is good for {@code HotSwapCompilerPass} passes.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.HotSwapPassFactory(java.lang.String, boolean)",
      "begin_line": 2411,
      "end_line": 2413,
      "comment": "",
      "child_ranges": [
        "(line 2412,col 7)-(line 2412,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2415,
      "end_line": 2416,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DefaultPassConfig.HotSwapPassFactory.getHotSwapPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 2418,
      "end_line": 2421,
      "comment": "",
      "child_ranges": [
        "(line 2420,col 7)-(line 2420,col 35)"
      ]
    }
  ]
}