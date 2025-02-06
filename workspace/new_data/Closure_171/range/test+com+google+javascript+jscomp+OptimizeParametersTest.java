{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/OptimizeParametersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeParametersTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 601,
      "comment": "\n * Tests for {@link OptimizeParameters}\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "",
      "child_ranges": [
        "(line 27,col 5)-(line 27,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.setUp()",
      "begin_line": 30,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 28)",
        "(line 33,col 5)-(line 33,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoRemoval()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 52)",
        "(line 38,col 5)-(line 38,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testSimpleRemoval()",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 43,col 50)",
        "(line 44,col 5)-(line 45,col 54)",
        "(line 46,col 5)-(line 47,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNotAFunction()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalNamedFunction()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDifferentScopes()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 62,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testOptimizeOnlyImmutableValues()",
      "begin_line": 65,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 67,col 54)",
        "(line 68,col 5)-(line 69,col 48)",
        "(line 70,col 5)-(line 71,col 46)",
        "(line 72,col 5)-(line 73,col 49)",
        "(line 75,col 5)-(line 76,col 60)",
        "(line 77,col 5)-(line 78,col 55)",
        "(line 79,col 5)-(line 80,col 52)",
        "(line 81,col 5)-(line 82,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalVarAssignment()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 87,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoOptimizeCall()",
      "begin_line": 90,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 61)",
        "(line 93,col 5)-(line 93,col 65)",
        "(line 94,col 5)-(line 94,col 73)",
        "(line 95,col 5)-(line 95,col 65)",
        "(line 96,col 5)-(line 96,col 73)",
        "(line 98,col 5)-(line 98,col 54)",
        "(line 100,col 5)-(line 100,col 58)",
        "(line 101,col 5)-(line 101,col 65)",
        "(line 102,col 5)-(line 102,col 58)",
        "(line 103,col 5)-(line 103,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoOptimizeApply()",
      "begin_line": 106,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 62)",
        "(line 108,col 5)-(line 108,col 66)",
        "(line 109,col 5)-(line 109,col 74)",
        "(line 110,col 5)-(line 110,col 66)",
        "(line 111,col 5)-(line 111,col 75)",
        "(line 113,col 5)-(line 113,col 55)",
        "(line 114,col 5)-(line 114,col 59)",
        "(line 115,col 5)-(line 115,col 66)",
        "(line 116,col 5)-(line 116,col 59)",
        "(line 117,col 5)-(line 117,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalExpressionAssign()",
      "begin_line": 120,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalOneRequired()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 128,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalMultipleCalls()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 133,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveOneOptionalMultiplePossibleDefinition()",
      "begin_line": 136,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 142,col 47)",
        "(line 143,col 5)-(line 143,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveTwoOptionalMultiplePossibleDefinition()",
      "begin_line": 146,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 152,col 51)",
        "(line 153,col 5)-(line 153,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstructorOptArgsNotRemoved()",
      "begin_line": 156,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 164,col 29)",
        "(line 165,col 5)-(line 165,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMultipleUnknown()",
      "begin_line": 168,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 175,col 18)",
        "(line 176,col 5)-(line 176,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testSingleUnknown()",
      "begin_line": 179,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 184,col 18)",
        "(line 186,col 5)-(line 190,col 18)",
        "(line 191,col 5)-(line 191,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveVarArg()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 196,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize()",
      "begin_line": 199,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 206,col 18)",
        "(line 207,col 5)-(line 207,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize2()",
      "begin_line": 210,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 215,col 20)",
        "(line 216,col 5)-(line 216,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize3()",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 224,col 18)",
        "(line 225,col 5)-(line 225,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize4()",
      "begin_line": 228,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 239,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMethodsDefinedInArraysDontGetOptimized()",
      "begin_line": 242,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 245,col 22)",
        "(line 246,col 5)-(line 246,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMethodsDefinedInObjectDontGetOptimized()",
      "begin_line": 249,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 252,col 22)",
        "(line 253,col 5)-(line 253,col 18)",
        "(line 254,col 5)-(line 256,col 25)",
        "(line 257,col 5)-(line 257,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveConstantArgument()",
      "begin_line": 260,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 263,col 58)",
        "(line 266,col 5)-(line 266,col 59)",
        "(line 269,col 5)-(line 270,col 72)",
        "(line 273,col 5)-(line 274,col 55)",
        "(line 277,col 5)-(line 280,col 49)",
        "(line 281,col 5)-(line 284,col 39)",
        "(line 285,col 5)-(line 285,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCanDeleteArgumentsAtAnyPosition()",
      "begin_line": 289,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 294,col 26)",
        "(line 295,col 5)-(line 298,col 20)",
        "(line 299,col 5)-(line 299,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoOptimizationForExternsFunctions()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoOptimizationForGoogExportSymbol()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 308,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoArgumentRemovalNonEqualNodes()",
      "begin_line": 311,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 59)",
        "(line 313,col 5)-(line 313,col 55)",
        "(line 314,col 5)-(line 314,col 58)",
        "(line 315,col 5)-(line 315,col 69)",
        "(line 316,col 5)-(line 316,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionPassedAsParam()",
      "begin_line": 319,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 325,col 24)",
        "(line 326,col 5)-(line 331,col 24)",
        "(line 333,col 5)-(line 333,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCallIsIgnore()",
      "begin_line": 336,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 340,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testApplyIsIgnore()",
      "begin_line": 343,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 347,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionWithReferenceToArgumentsShouldNotBeOptimize()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 352,col 24)",
        "(line 353,col 5)-(line 353,col 77)",
        "(line 354,col 5)-(line 355,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionWithTwoNames()",
      "begin_line": 358,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 48)",
        "(line 360,col 5)-(line 360,col 55)",
        "(line 361,col 5)-(line 361,col 56)",
        "(line 362,col 5)-(line 362,col 63)",
        "(line 363,col 5)-(line 363,col 63)",
        "(line 364,col 5)-(line 364,col 63)",
        "(line 365,col 5)-(line 365,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRecursion()",
      "begin_line": 368,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 369,col 5)-(line 370,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstantArgumentsToConstructorCanBeOptimized()",
      "begin_line": 373,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 375,col 32)",
        "(line 376,col 5)-(line 377,col 31)",
        "(line 378,col 5)-(line 378,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testOptionalArgumentsToConstructorCanBeOptimized()",
      "begin_line": 381,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 383,col 31)",
        "(line 384,col 5)-(line 385,col 31)",
        "(line 386,col 5)-(line 386,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRegexesCanBeInlined()",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 391,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstructorUsedAsFunctionCanBeOptimized()",
      "begin_line": 394,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 397,col 18)",
        "(line 398,col 5)-(line 400,col 17)",
        "(line 401,col 5)-(line 401,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeConstructorWhenArgumentsAreNotEqual()",
      "begin_line": 404,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 405,col 5)-(line 407,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeArrayElements()",
      "begin_line": 410,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 50)",
        "(line 412,col 5)-(line 412,col 50)",
        "(line 414,col 5)-(line 416,col 24)",
        "(line 418,col 5)-(line 420,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testOptimizeThis()",
      "begin_line": 423,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 428,col 19)",
        "(line 429,col 5)-(line 433,col 18)",
        "(line 434,col 5)-(line 434,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeWhenArgumentsPassedAsParameter()",
      "begin_line": 437,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 51)",
        "(line 439,col 5)-(line 439,col 54)",
        "(line 441,col 5)-(line 442,col 56)",
        "(line 444,col 5)-(line 445,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeGoogExportFunctions()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeJSCompiler_renameProperty()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 454,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeJSCompiler_ObjectPropertyString()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 458,col 5)-(line 459,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues1()",
      "begin_line": 462,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 463,col 5)-(line 464,col 42)",
        "(line 465,col 5)-(line 466,col 44)",
        "(line 467,col 5)-(line 468,col 45)",
        "(line 469,col 5)-(line 470,col 45)",
        "(line 471,col 5)-(line 472,col 50)",
        "(line 473,col 5)-(line 474,col 52)",
        "(line 475,col 5)-(line 476,col 56)",
        "(line 477,col 5)-(line 478,col 55)",
        "(line 480,col 5)-(line 480,col 46)",
        "(line 481,col 5)-(line 481,col 51)",
        "(line 482,col 5)-(line 482,col 54)",
        "(line 483,col 5)-(line 483,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues2()",
      "begin_line": 486,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 487,col 5)-(line 488,col 56)",
        "(line 489,col 5)-(line 490,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues3()",
      "begin_line": 493,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 500,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues4()",
      "begin_line": 503,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 507,col 5)-(line 510,col 46)",
        "(line 514,col 5)-(line 517,col 42)",
        "(line 521,col 5)-(line 527,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues5()",
      "begin_line": 530,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 531,col 5)-(line 537,col 32)",
        "(line 539,col 5)-(line 545,col 32)",
        "(line 547,col 5)-(line 550,col 54)",
        "(line 552,col 5)-(line 555,col 50)",
        "(line 557,col 5)-(line 563,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testShadows()",
      "begin_line": 566,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 567,col 5)-(line 575,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCrash()",
      "begin_line": 578,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 579,col 5)-(line 585,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testGlobalCatch()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNamelessParameter1()",
      "begin_line": 592,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 593,col 5)-(line 594,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNamelessParameter2()",
      "begin_line": 597,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 598,col 5)-(line 599,col 39)"
      ]
    }
  ]
}