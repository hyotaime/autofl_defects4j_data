{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/OptimizeParametersTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeParametersTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 620,
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
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 141,col 47)",
        "(line 143,col 5)-(line 147,col 47)",
        "(line 149,col 5)-(line 149,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveTwoOptionalMultiplePossibleDefinition()",
      "begin_line": 152,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 157,col 51)",
        "(line 159,col 5)-(line 163,col 51)",
        "(line 165,col 5)-(line 165,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstructorOptArgsNotRemoved()",
      "begin_line": 168,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 176,col 29)",
        "(line 177,col 5)-(line 177,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMultipleUnknown()",
      "begin_line": 180,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 186,col 18)",
        "(line 188,col 5)-(line 193,col 18)",
        "(line 195,col 5)-(line 195,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testSingleUnknown()",
      "begin_line": 198,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 203,col 18)",
        "(line 205,col 5)-(line 209,col 18)",
        "(line 210,col 5)-(line 210,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveVarArg()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 215,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 225,col 18)",
        "(line 226,col 5)-(line 226,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize2()",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 234,col 20)",
        "(line 235,col 5)-(line 235,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize3()",
      "begin_line": 238,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 243,col 18)",
        "(line 244,col 5)-(line 244,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testAliasMethodsDontGetOptimize4()",
      "begin_line": 247,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 258,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMethodsDefinedInArraysDontGetOptimized()",
      "begin_line": 261,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 264,col 22)",
        "(line 265,col 5)-(line 265,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMethodsDefinedInObjectDontGetOptimized()",
      "begin_line": 268,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 271,col 22)",
        "(line 272,col 5)-(line 272,col 18)",
        "(line 273,col 5)-(line 275,col 25)",
        "(line 276,col 5)-(line 276,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRemoveConstantArgument()",
      "begin_line": 279,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 282,col 58)",
        "(line 285,col 5)-(line 285,col 59)",
        "(line 288,col 5)-(line 289,col 72)",
        "(line 292,col 5)-(line 293,col 55)",
        "(line 296,col 5)-(line 299,col 49)",
        "(line 300,col 5)-(line 303,col 39)",
        "(line 304,col 5)-(line 304,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCanDeleteArgumentsAtAnyPosition()",
      "begin_line": 308,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 313,col 26)",
        "(line 314,col 5)-(line 317,col 20)",
        "(line 318,col 5)-(line 318,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoOptimizationForExternsFunctions()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoOptimizationForGoogExportSymbol()",
      "begin_line": 325,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 327,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNoArgumentRemovalNonEqualNodes()",
      "begin_line": 330,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 59)",
        "(line 332,col 5)-(line 332,col 55)",
        "(line 333,col 5)-(line 333,col 58)",
        "(line 334,col 5)-(line 334,col 69)",
        "(line 335,col 5)-(line 335,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionPassedAsParam()",
      "begin_line": 338,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 344,col 24)",
        "(line 345,col 5)-(line 350,col 24)",
        "(line 352,col 5)-(line 352,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCallIsIgnore()",
      "begin_line": 355,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 359,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testApplyIsIgnore()",
      "begin_line": 362,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 366,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionWithReferenceToArgumentsShouldNotBeOptimize()",
      "begin_line": 369,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 371,col 24)",
        "(line 372,col 5)-(line 372,col 77)",
        "(line 373,col 5)-(line 374,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testFunctionWithTwoNames()",
      "begin_line": 377,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 48)",
        "(line 379,col 5)-(line 379,col 55)",
        "(line 380,col 5)-(line 380,col 56)",
        "(line 381,col 5)-(line 381,col 63)",
        "(line 382,col 5)-(line 382,col 63)",
        "(line 383,col 5)-(line 383,col 63)",
        "(line 384,col 5)-(line 384,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRecursion()",
      "begin_line": 387,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 389,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstantArgumentsToConstructorCanBeOptimized()",
      "begin_line": 392,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 394,col 32)",
        "(line 395,col 5)-(line 396,col 31)",
        "(line 397,col 5)-(line 397,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testOptionalArgumentsToConstructorCanBeOptimized()",
      "begin_line": 400,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 401,col 5)-(line 402,col 31)",
        "(line 403,col 5)-(line 404,col 31)",
        "(line 405,col 5)-(line 405,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testRegexesCanBeInlined()",
      "begin_line": 408,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 409,col 5)-(line 410,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testConstructorUsedAsFunctionCanBeOptimized()",
      "begin_line": 413,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 416,col 18)",
        "(line 417,col 5)-(line 419,col 17)",
        "(line 420,col 5)-(line 420,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeConstructorWhenArgumentsAreNotEqual()",
      "begin_line": 423,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 426,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeArrayElements()",
      "begin_line": 429,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 50)",
        "(line 431,col 5)-(line 431,col 50)",
        "(line 433,col 5)-(line 435,col 24)",
        "(line 437,col 5)-(line 439,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testOptimizeThis()",
      "begin_line": 442,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 447,col 19)",
        "(line 448,col 5)-(line 452,col 18)",
        "(line 453,col 5)-(line 453,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeWhenArgumentsPassedAsParameter()",
      "begin_line": 456,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 51)",
        "(line 458,col 5)-(line 458,col 54)",
        "(line 460,col 5)-(line 461,col 56)",
        "(line 463,col 5)-(line 464,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeGoogExportFunctions()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeJSCompiler_renameProperty()",
      "begin_line": 471,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 472,col 5)-(line 473,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testDoNotOptimizeJSCompiler_ObjectPropertyString()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 478,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues1()",
      "begin_line": 481,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 482,col 5)-(line 483,col 42)",
        "(line 484,col 5)-(line 485,col 44)",
        "(line 486,col 5)-(line 487,col 45)",
        "(line 488,col 5)-(line 489,col 45)",
        "(line 490,col 5)-(line 491,col 50)",
        "(line 492,col 5)-(line 493,col 52)",
        "(line 494,col 5)-(line 495,col 56)",
        "(line 496,col 5)-(line 497,col 55)",
        "(line 499,col 5)-(line 499,col 46)",
        "(line 500,col 5)-(line 500,col 51)",
        "(line 501,col 5)-(line 501,col 54)",
        "(line 502,col 5)-(line 502,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues2()",
      "begin_line": 505,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 506,col 5)-(line 507,col 56)",
        "(line 508,col 5)-(line 509,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues3()",
      "begin_line": 512,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 513,col 5)-(line 519,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues4()",
      "begin_line": 522,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 526,col 5)-(line 529,col 46)",
        "(line 533,col 5)-(line 536,col 42)",
        "(line 540,col 5)-(line 546,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testMutableValues5()",
      "begin_line": 549,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 556,col 32)",
        "(line 558,col 5)-(line 564,col 32)",
        "(line 566,col 5)-(line 569,col 54)",
        "(line 571,col 5)-(line 574,col 50)",
        "(line 576,col 5)-(line 582,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testShadows()",
      "begin_line": 585,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 594,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testCrash()",
      "begin_line": 597,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 598,col 5)-(line 604,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testGlobalCatch()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 5)-(line 608,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNamelessParameter1()",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 612,col 5)-(line 613,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParametersTest.testNamelessParameter2()",
      "begin_line": 616,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 617,col 5)-(line 618,col 39)"
      ]
    }
  ]
}