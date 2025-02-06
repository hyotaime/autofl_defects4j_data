{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/RenameVarsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameVarsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 29,
      "end_line": 597,
      "comment": "\n * Tests for {@link RenameVars}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previouslyUsedMap"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameVars"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withClosurePass"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localRenamingOnly"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useGoogleCodingConvention"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldShadow"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.getCodingConvention()",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 49,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 52,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 61,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.getNumRepetitions()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.setUp()",
      "begin_line": 69,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 18)",
        "(line 72,col 5)-(line 72,col 75)",
        "(line 73,col 5)-(line 73,col 28)",
        "(line 74,col 5)-(line 74,col 28)",
        "(line 75,col 5)-(line 75,col 30)",
        "(line 76,col 5)-(line 76,col 44)",
        "(line 77,col 5)-(line 77,col 32)",
        "(line 78,col 5)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameSimple()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 85,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameGlobals()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 90,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameLocals()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 95,col 55)",
        "(line 96,col 5)-(line 97,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameRedeclaredGlobals()",
      "begin_line": 100,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 105,col 36)",
        "(line 107,col 5)-(line 107,col 29)",
        "(line 109,col 5)-(line 113,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRecursiveFunctions1()",
      "begin_line": 116,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 122,col 15)",
        "(line 124,col 5)-(line 124,col 29)",
        "(line 126,col 5)-(line 131,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRecursiveFunctions2()",
      "begin_line": 134,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 43)",
        "(line 137,col 5)-(line 142,col 15)",
        "(line 144,col 5)-(line 144,col 29)",
        "(line 146,col 5)-(line 151,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameLocalsClashingWithGlobals()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 156,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameNested()",
      "begin_line": 159,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 161,col 53)",
        "(line 162,col 5)-(line 163,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testBleedingRecursiveFunctions1()",
      "begin_line": 166,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 173,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testBleedingRecursiveFunctions2()",
      "begin_line": 176,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 184,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testBleedingRecursiveFunctions3()",
      "begin_line": 187,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 197,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithExterns1()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 32)",
        "(line 202,col 5)-(line 202,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithExterns2()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 30)",
        "(line 207,col 5)-(line 207,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testDoNotRenameExportedName()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithNameOverlap()",
      "begin_line": 214,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 216,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithPrefix1()",
      "begin_line": 219,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 20)",
        "(line 221,col 5)-(line 222,col 50)",
        "(line 223,col 5)-(line 223,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithPrefix2()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 20)",
        "(line 229,col 5)-(line 230,col 66)",
        "(line 231,col 5)-(line 231,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameWithPrefix3()",
      "begin_line": 234,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 17)",
        "(line 236,col 5)-(line 248,col 20)",
        "(line 249,col 5)-(line 249,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testNamingBasedOnOrderOfOccurrence()",
      "begin_line": 252,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 257,col 11)",
        "(line 258,col 5)-(line 263,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameSimple()",
      "begin_line": 266,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 268,col 44)",
        "(line 269,col 5)-(line 270,col 76)",
        "(line 272,col 5)-(line 273,col 56)",
        "(line 274,col 5)-(line 275,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameGlobals()",
      "begin_line": 278,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 280,col 52)",
        "(line 281,col 5)-(line 283,col 39)",
        "(line 285,col 5)-(line 286,col 77)",
        "(line 287,col 5)-(line 290,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithPointlesslyAnonymousFunctions()",
      "begin_line": 293,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 78)",
        "(line 295,col 5)-(line 297,col 39)",
        "(line 299,col 5)-(line 299,col 78)",
        "(line 300,col 5)-(line 304,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameLocalsClashingWithGlobals()",
      "begin_line": 307,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 309,col 46)",
        "(line 310,col 5)-(line 310,col 52)",
        "(line 311,col 5)-(line 312,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameNested()",
      "begin_line": 315,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 317,col 67)",
        "(line 318,col 5)-(line 320,col 39)",
        "(line 322,col 5)-(line 323,col 79)",
        "(line 324,col 5)-(line 327,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithExterns1()",
      "begin_line": 330,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 32)",
        "(line 332,col 5)-(line 332,col 70)",
        "(line 333,col 5)-(line 333,col 52)",
        "(line 334,col 5)-(line 335,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithExterns2()",
      "begin_line": 338,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 30)",
        "(line 340,col 5)-(line 340,col 56)",
        "(line 341,col 5)-(line 341,col 52)",
        "(line 342,col 5)-(line 342,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithNameOverlap()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 347,col 41)",
        "(line 348,col 5)-(line 348,col 52)",
        "(line 349,col 5)-(line 350,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithAnonymousFunctions()",
      "begin_line": 353,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 78)",
        "(line 355,col 5)-(line 357,col 39)",
        "(line 359,col 5)-(line 359,col 78)",
        "(line 360,col 5)-(line 363,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameSimpleExternsChanges()",
      "begin_line": 366,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 368,col 44)",
        "(line 369,col 5)-(line 370,col 76)",
        "(line 372,col 5)-(line 372,col 78)",
        "(line 373,col 5)-(line 373,col 32)",
        "(line 374,col 5)-(line 377,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameSimpleLocalNameExterned()",
      "begin_line": 380,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 382,col 46)",
        "(line 384,col 5)-(line 384,col 52)",
        "(line 386,col 5)-(line 386,col 30)",
        "(line 387,col 5)-(line 388,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameSimpleGlobalNameExterned()",
      "begin_line": 391,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 392,col 5)-(line 393,col 46)",
        "(line 395,col 5)-(line 395,col 52)",
        "(line 397,col 5)-(line 397,col 32)",
        "(line 398,col 5)-(line 399,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithPrefix1AndUnstableLocalNames()",
      "begin_line": 402,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 20)",
        "(line 404,col 5)-(line 405,col 51)",
        "(line 407,col 5)-(line 407,col 52)",
        "(line 409,col 5)-(line 409,col 20)",
        "(line 410,col 5)-(line 411,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testStableRenameWithPrefix2()",
      "begin_line": 414,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 17)",
        "(line 416,col 5)-(line 428,col 20)",
        "(line 430,col 5)-(line 430,col 52)",
        "(line 432,col 5)-(line 432,col 17)",
        "(line 433,col 5)-(line 447,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testContrivedExampleWhereConsistentRenamingIsWorse()",
      "begin_line": 450,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 452,col 53)",
        "(line 454,col 5)-(line 455,col 64)",
        "(line 457,col 5)-(line 457,col 52)",
        "(line 458,col 5)-(line 459,col 53)",
        "(line 460,col 5)-(line 460,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testExportSimpleSymbolReservesName()",
      "begin_line": 463,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 465,col 46)",
        "(line 466,col 5)-(line 466,col 27)",
        "(line 467,col 5)-(line 468,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testExportComplexSymbolReservesName()",
      "begin_line": 471,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 472,col 5)-(line 473,col 48)",
        "(line 474,col 5)-(line 474,col 27)",
        "(line 475,col 5)-(line 476,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testExportToNonStringDoesntExplode()",
      "begin_line": 479,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 27)",
        "(line 481,col 5)-(line 482,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testDollarSignSuperExport1()",
      "begin_line": 485,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 38)",
        "(line 488,col 5)-(line 489,col 55)",
        "(line 491,col 5)-(line 491,col 30)",
        "(line 492,col 5)-(line 492,col 40)",
        "(line 494,col 5)-(line 494,col 37)",
        "(line 495,col 5)-(line 496,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testDollarSignSuperExport2()",
      "begin_line": 499,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 500,col 5)-(line 500,col 41)",
        "(line 501,col 5)-(line 501,col 33)",
        "(line 503,col 5)-(line 503,col 38)",
        "(line 505,col 5)-(line 508,col 49)",
        "(line 510,col 5)-(line 510,col 30)",
        "(line 511,col 5)-(line 511,col 40)",
        "(line 513,col 5)-(line 513,col 37)",
        "(line 514,col 5)-(line 517,col 45)",
        "(line 519,col 5)-(line 519,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testPseudoNames()",
      "begin_line": 522,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 523,col 5)-(line 523,col 32)",
        "(line 525,col 5)-(line 526,col 40)",
        "(line 528,col 5)-(line 528,col 31)",
        "(line 529,col 5)-(line 530,col 54)",
        "(line 532,col 5)-(line 533,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameMapUsingOldMap(java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 536,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 52)",
        "(line 539,col 5)-(line 539,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameMapUsingOldMap(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 542,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 52)",
        "(line 546,col 5)-(line 546,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameMap(java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.testRenameMap(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 554,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 556,col 5)-(line 556,col 47)",
        "(line 557,col 5)-(line 557,col 56)",
        "(line 558,col 5)-(line 558,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.makeVariableMap(java.lang.String...)",
      "begin_line": 561,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 562,col 5)-(line 562,col 61)",
        "(line 564,col 5)-(line 564,col 76)",
        "(line 565,col 5)-(line 567,col 5)",
        "(line 569,col 5)-(line 569,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.assertVariableMapsEqual(com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 572,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 61)",
        "(line 574,col 5)-(line 574,col 61)",
        "(line 575,col 5)-(line 575,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClosurePassAndRenameVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 578,
      "end_line": 596,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.ClosurePassAndRenameVars.ClosurePassAndRenameVars(com.google.javascript.jscomp.Compiler)",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 7)-(line 582,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVarsTest.ClosurePassAndRenameVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 585,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 587,col 7)-(line 589,col 50)",
        "(line 590,col 7)-(line 590,col 41)",
        "(line 591,col 7)-(line 593,col 50)",
        "(line 594,col 7)-(line 594,col 40)"
      ]
    }
  ]
}