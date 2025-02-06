{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/RenameVars2Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameVars2Test",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 30,
      "end_line": 643,
      "comment": "\n * Tests for {@link RenameVars2}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PREFIX"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previouslyUsedMap"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameVars"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withClosurePass"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localRenamingOnly"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useGoogleCodingConvention"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldShadow"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "withNormalize"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.getCodingConvention()",
      "begin_line": 46,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 52,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 55,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 22)",
        "(line 58,col 5)-(line 65,col 5)",
        "(line 67,col 5)-(line 72,col 5)",
        "(line 74,col 5)-(line 74,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.getNumRepetitions()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.setUp()",
      "begin_line": 82,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 18)",
        "(line 85,col 5)-(line 85,col 75)",
        "(line 86,col 5)-(line 86,col 28)",
        "(line 87,col 5)-(line 87,col 28)",
        "(line 88,col 5)-(line 88,col 26)",
        "(line 89,col 5)-(line 89,col 30)",
        "(line 90,col 5)-(line 90,col 44)",
        "(line 91,col 5)-(line 91,col 32)",
        "(line 92,col 5)-(line 92,col 25)",
        "(line 93,col 5)-(line 93,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameSimple()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 100,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameGlobals()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameLocals()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 110,col 55)",
        "(line 111,col 5)-(line 112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameRedeclaredGlobals()",
      "begin_line": 115,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 120,col 36)",
        "(line 122,col 5)-(line 122,col 29)",
        "(line 124,col 5)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRecursiveFunctions1()",
      "begin_line": 131,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 137,col 15)",
        "(line 139,col 5)-(line 139,col 29)",
        "(line 141,col 5)-(line 146,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRecursiveFunctions2()",
      "begin_line": 149,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 43)",
        "(line 152,col 5)-(line 157,col 15)",
        "(line 159,col 5)-(line 159,col 29)",
        "(line 161,col 5)-(line 166,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameLocalsClashingWithGlobals()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 171,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameNested()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 176,col 53)",
        "(line 177,col 5)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testBleedingRecursiveFunctions1()",
      "begin_line": 181,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 188,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testBleedingRecursiveFunctions2()",
      "begin_line": 191,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 199,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testBleedingRecursiveFunctions3()",
      "begin_line": 202,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 212,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithExterns1()",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 32)",
        "(line 217,col 5)-(line 217,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithExterns2()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 30)",
        "(line 222,col 5)-(line 222,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testDoNotRenameExportedName()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithNameOverlap()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 231,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithPrefix1()",
      "begin_line": 234,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 20)",
        "(line 236,col 5)-(line 237,col 50)",
        "(line 238,col 5)-(line 238,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithPrefix2()",
      "begin_line": 242,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 20)",
        "(line 244,col 5)-(line 245,col 66)",
        "(line 246,col 5)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameWithPrefix3()",
      "begin_line": 249,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 17)",
        "(line 251,col 5)-(line 263,col 20)",
        "(line 264,col 5)-(line 264,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testNamingBasedOnOrderOfOccurrence()",
      "begin_line": 267,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 272,col 11)",
        "(line 273,col 5)-(line 278,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameSimple()",
      "begin_line": 281,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 283,col 44)",
        "(line 284,col 5)-(line 285,col 76)",
        "(line 287,col 5)-(line 288,col 56)",
        "(line 289,col 5)-(line 290,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameGlobals()",
      "begin_line": 293,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 295,col 52)",
        "(line 296,col 5)-(line 298,col 39)",
        "(line 300,col 5)-(line 301,col 77)",
        "(line 302,col 5)-(line 305,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithPointlesslyAnonymousFunctions()",
      "begin_line": 308,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 78)",
        "(line 310,col 5)-(line 312,col 39)",
        "(line 314,col 5)-(line 314,col 78)",
        "(line 315,col 5)-(line 319,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameLocalsClashingWithGlobals()",
      "begin_line": 322,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 324,col 46)",
        "(line 325,col 5)-(line 325,col 52)",
        "(line 326,col 5)-(line 327,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameNested()",
      "begin_line": 330,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 332,col 67)",
        "(line 333,col 5)-(line 335,col 39)",
        "(line 337,col 5)-(line 338,col 79)",
        "(line 339,col 5)-(line 342,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithExterns1()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 32)",
        "(line 347,col 5)-(line 347,col 70)",
        "(line 348,col 5)-(line 348,col 52)",
        "(line 349,col 5)-(line 350,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithExterns2()",
      "begin_line": 353,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 30)",
        "(line 355,col 5)-(line 355,col 56)",
        "(line 356,col 5)-(line 356,col 52)",
        "(line 357,col 5)-(line 357,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithNameOverlap()",
      "begin_line": 360,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 362,col 41)",
        "(line 363,col 5)-(line 363,col 52)",
        "(line 364,col 5)-(line 365,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithAnonymousFunctions()",
      "begin_line": 368,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 78)",
        "(line 370,col 5)-(line 372,col 39)",
        "(line 374,col 5)-(line 374,col 78)",
        "(line 375,col 5)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameSimpleExternsChanges()",
      "begin_line": 381,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 382,col 5)-(line 383,col 44)",
        "(line 384,col 5)-(line 385,col 76)",
        "(line 387,col 5)-(line 387,col 78)",
        "(line 388,col 5)-(line 388,col 32)",
        "(line 389,col 5)-(line 392,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameSimpleLocalNameExterned()",
      "begin_line": 395,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 397,col 46)",
        "(line 399,col 5)-(line 399,col 52)",
        "(line 401,col 5)-(line 401,col 30)",
        "(line 402,col 5)-(line 403,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameSimpleGlobalNameExterned()",
      "begin_line": 406,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 408,col 46)",
        "(line 410,col 5)-(line 410,col 52)",
        "(line 412,col 5)-(line 412,col 32)",
        "(line 413,col 5)-(line 414,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithPrefix1AndUnstableLocalNames()",
      "begin_line": 417,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 20)",
        "(line 419,col 5)-(line 420,col 51)",
        "(line 422,col 5)-(line 422,col 52)",
        "(line 424,col 5)-(line 424,col 20)",
        "(line 425,col 5)-(line 426,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testStableRenameWithPrefix2()",
      "begin_line": 429,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 17)",
        "(line 431,col 5)-(line 443,col 20)",
        "(line 445,col 5)-(line 445,col 52)",
        "(line 447,col 5)-(line 447,col 17)",
        "(line 448,col 5)-(line 462,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testContrivedExampleWhereConsistentRenamingIsWorse()",
      "begin_line": 465,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 466,col 5)-(line 467,col 53)",
        "(line 469,col 5)-(line 470,col 64)",
        "(line 472,col 5)-(line 472,col 52)",
        "(line 473,col 5)-(line 474,col 53)",
        "(line 475,col 5)-(line 475,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testPrevUsedMapWithDuplicates()",
      "begin_line": 478,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 64)",
        "(line 480,col 5)-(line 484,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testExportSimpleSymbolReservesName()",
      "begin_line": 487,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 488,col 5)-(line 489,col 46)",
        "(line 490,col 5)-(line 490,col 27)",
        "(line 491,col 5)-(line 492,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testExportComplexSymbolReservesName()",
      "begin_line": 495,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 496,col 5)-(line 497,col 48)",
        "(line 498,col 5)-(line 498,col 27)",
        "(line 499,col 5)-(line 500,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testExportToNonStringDoesntExplode()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 504,col 5)-(line 504,col 27)",
        "(line 505,col 5)-(line 506,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testDollarSignSuperExport1()",
      "begin_line": 509,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 38)",
        "(line 512,col 5)-(line 513,col 55)",
        "(line 515,col 5)-(line 515,col 30)",
        "(line 516,col 5)-(line 516,col 40)",
        "(line 518,col 5)-(line 518,col 37)",
        "(line 519,col 5)-(line 520,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testDollarSignSuperExport2()",
      "begin_line": 523,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 524,col 5)-(line 524,col 25)",
        "(line 526,col 5)-(line 526,col 38)",
        "(line 528,col 5)-(line 531,col 49)",
        "(line 533,col 5)-(line 533,col 30)",
        "(line 534,col 5)-(line 534,col 40)",
        "(line 536,col 5)-(line 536,col 37)",
        "(line 537,col 5)-(line 540,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testBias()",
      "begin_line": 543,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 72)",
        "(line 545,col 5)-(line 545,col 39)",
        "(line 546,col 5)-(line 546,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testPseudoNames()",
      "begin_line": 549,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 32)",
        "(line 552,col 5)-(line 553,col 40)",
        "(line 555,col 5)-(line 555,col 31)",
        "(line 556,col 5)-(line 557,col 54)",
        "(line 559,col 5)-(line 560,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameMapUsingOldMap(java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 563,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 565,col 5)-(line 565,col 52)",
        "(line 566,col 5)-(line 566,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameMapUsingOldMap(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 569,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 572,col 5)-(line 572,col 52)",
        "(line 573,col 5)-(line 573,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameMap(java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.testRenameMap(java.lang.String, java.lang.String, java.lang.String, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 581,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 583,col 5)-(line 583,col 47)",
        "(line 584,col 5)-(line 584,col 56)",
        "(line 585,col 5)-(line 585,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.makeVariableMap(java.lang.String...)",
      "begin_line": 588,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 61)",
        "(line 591,col 5)-(line 591,col 76)",
        "(line 592,col 5)-(line 594,col 5)",
        "(line 596,col 5)-(line 596,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.assertVariableMapsEqual(com.google.javascript.jscomp.VariableMap, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 599,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 600,col 5)-(line 600,col 61)",
        "(line 601,col 5)-(line 601,col 61)",
        "(line 602,col 5)-(line 602,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClosurePassAndRenameVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 605,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 606,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.ClosurePassAndRenameVars.ClosurePassAndRenameVars(com.google.javascript.jscomp.Compiler)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 7)-(line 609,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.ClosurePassAndRenameVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 612,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 614,col 7)-(line 616,col 50)",
        "(line 617,col 7)-(line 617,col 41)",
        "(line 618,col 7)-(line 620,col 56)",
        "(line 621,col 7)-(line 621,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NormalizePassWrapper",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 625,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wrappedPass"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.NormalizePassWrapper.NormalizePassWrapper(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.CompilerPass)",
      "begin_line": 629,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 631,col 7)-(line 631,col 31)",
        "(line 632,col 7)-(line 632,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars2Test.NormalizePassWrapper.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 635,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 59)",
        "(line 638,col 7)-(line 638,col 39)",
        "(line 640,col 7)-(line 640,col 41)"
      ]
    }
  ]
}