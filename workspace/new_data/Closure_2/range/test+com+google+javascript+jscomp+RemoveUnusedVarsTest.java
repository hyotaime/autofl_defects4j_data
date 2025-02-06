{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/RemoveUnusedVarsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedVarsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 20,
      "end_line": 764,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeGlobal"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyCallSites"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.RemoveUnusedVarsTest()",
      "begin_line": 26,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 27,col 5)-(line 27,col 33)",
        "(line 28,col 5)-(line 28,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.setUp()",
      "begin_line": 31,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 24)",
        "(line 34,col 5)-(line 34,col 44)",
        "(line 35,col 5)-(line 35,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 42,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveUnusedVars()",
      "begin_line": 45,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 57,col 31)",
        "(line 60,col 5)-(line 61,col 29)",
        "(line 64,col 5)-(line 76,col 20)",
        "(line 79,col 5)-(line 82,col 50)",
        "(line 85,col 5)-(line 86,col 33)",
        "(line 89,col 5)-(line 90,col 36)",
        "(line 93,col 5)-(line 103,col 36)",
        "(line 106,col 5)-(line 107,col 40)",
        "(line 110,col 5)-(line 111,col 61)",
        "(line 114,col 5)-(line 115,col 63)",
        "(line 118,col 5)-(line 132,col 44)",
        "(line 135,col 5)-(line 136,col 46)",
        "(line 139,col 5)-(line 139,col 47)",
        "(line 142,col 5)-(line 143,col 47)",
        "(line 145,col 5)-(line 145,col 35)",
        "(line 146,col 5)-(line 146,col 35)",
        "(line 147,col 5)-(line 147,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionArgRemoval()",
      "begin_line": 150,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 44)",
        "(line 156,col 5)-(line 156,col 55)",
        "(line 157,col 5)-(line 157,col 59)",
        "(line 160,col 5)-(line 161,col 51)",
        "(line 162,col 5)-(line 163,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionArgRemovalFromCallSites()",
      "begin_line": 166,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 32)",
        "(line 170,col 5)-(line 171,col 41)",
        "(line 174,col 5)-(line 174,col 55)",
        "(line 175,col 5)-(line 176,col 48)",
        "(line 179,col 5)-(line 180,col 51)",
        "(line 181,col 5)-(line 182,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionsDeadButEscaped()",
      "begin_line": 185,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 67)",
        "(line 187,col 5)-(line 187,col 60)",
        "(line 188,col 5)-(line 188,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testVarInControlStructure()",
      "begin_line": 191,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 46)",
        "(line 193,col 5)-(line 193,col 67)",
        "(line 194,col 5)-(line 194,col 52)",
        "(line 195,col 5)-(line 195,col 44)",
        "(line 196,col 5)-(line 196,col 56)",
        "(line 197,col 5)-(line 197,col 50)",
        "(line 198,col 5)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRValueHoisting()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 36)",
        "(line 203,col 5)-(line 203,col 47)",
        "(line 205,col 5)-(line 205,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testModule()",
      "begin_line": 208,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 216,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRecursiveFunction1()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRecursiveFunction2()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 225,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionWithName1()",
      "begin_line": 228,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 230,col 35)",
        "(line 232,col 5)-(line 232,col 43)",
        "(line 233,col 5)-(line 233,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionWithName2()",
      "begin_line": 236,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 238,col 30)",
        "(line 240,col 5)-(line 240,col 43)",
        "(line 241,col 5)-(line 241,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveGlobal1()",
      "begin_line": 244,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 25)",
        "(line 246,col 5)-(line 246,col 24)",
        "(line 247,col 5)-(line 247,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveGlobal2()",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 25)",
        "(line 252,col 5)-(line 252,col 24)",
        "(line 253,col 5)-(line 253,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveGlobal3()",
      "begin_line": 256,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 25)",
        "(line 258,col 5)-(line 258,col 24)",
        "(line 259,col 5)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveGlobal4()",
      "begin_line": 263,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 25)",
        "(line 265,col 5)-(line 265,col 24)",
        "(line 266,col 5)-(line 267,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testIssue168a()",
      "begin_line": 270,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 278,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testIssue168b()",
      "begin_line": 281,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 25)",
        "(line 283,col 5)-(line 290,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign1()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign2()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 299,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign3()",
      "begin_line": 302,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 306,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign4()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 311,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign5()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 316,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign5b()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 321,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign6()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign6b()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign7()",
      "begin_line": 332,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 336,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedAssign8()",
      "begin_line": 339,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 343,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign1()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign1b()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign2()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign2b()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign3()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign3b()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 368,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign4()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign5()",
      "begin_line": 375,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 377,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign6()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign7()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign7b()",
      "begin_line": 388,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUnusedPropAssign7c()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 394,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign1()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 399,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign2()",
      "begin_line": 402,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 404,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign3()",
      "begin_line": 407,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 409,col 5)-(line 410,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign4()",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 415,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign5()",
      "begin_line": 418,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 420,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign6()",
      "begin_line": 423,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 425,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign7()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 429,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign8()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 433,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testUsedPropAssign9()",
      "begin_line": 436,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 438,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies1()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 442,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies1b()",
      "begin_line": 445,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 447,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies1c()",
      "begin_line": 450,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 452,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies2()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 5)-(line 456,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies2b()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 461,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDependencies2c()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testGlobalVarReferencesLocalVar()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 5)-(line 469,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testLocalVarReferencesGlobalVar1()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testLocalVarReferencesGlobalVar2()",
      "begin_line": 476,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 478,col 48)",
        "(line 479,col 5)-(line 479,col 32)",
        "(line 480,col 5)-(line 481,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testNestedAssign1()",
      "begin_line": 484,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 485,col 5)-(line 486,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testNestedAssign2()",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 491,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testNestedAssign3()",
      "begin_line": 494,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 495,col 5)-(line 496,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testCallSiteInteraction()",
      "begin_line": 499,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 500,col 5)-(line 500,col 32)",
        "(line 502,col 5)-(line 502,col 45)",
        "(line 503,col 5)-(line 503,col 49)",
        "(line 504,col 5)-(line 505,col 44)",
        "(line 506,col 5)-(line 507,col 48)",
        "(line 509,col 5)-(line 510,col 41)",
        "(line 511,col 5)-(line 512,col 41)",
        "(line 513,col 5)-(line 514,col 45)",
        "(line 518,col 5)-(line 519,col 65)",
        "(line 521,col 5)-(line 522,col 52)",
        "(line 524,col 5)-(line 525,col 52)",
        "(line 527,col 5)-(line 528,col 62)",
        "(line 529,col 5)-(line 530,col 70)",
        "(line 533,col 5)-(line 534,col 55)",
        "(line 536,col 5)-(line 536,col 66)",
        "(line 539,col 5)-(line 540,col 41)",
        "(line 543,col 5)-(line 543,col 55)",
        "(line 546,col 5)-(line 547,col 48)",
        "(line 548,col 5)-(line 549,col 51)",
        "(line 550,col 5)-(line 551,col 49)",
        "(line 555,col 5)-(line 556,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testCallSiteInteraction_contructors()",
      "begin_line": 559,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 560,col 5)-(line 560,col 32)",
        "(line 563,col 5)-(line 570,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testFunctionArgRemovalCausingInconsistency()",
      "begin_line": 573,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 32)",
        "(line 578,col 5)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveUnusedVarsPossibleNpeCase()",
      "begin_line": 586,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 587,col 5)-(line 587,col 32)",
        "(line 588,col 5)-(line 592,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDoNotOptimizeJSCompiler_renameProperty()",
      "begin_line": 595,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 596,col 5)-(line 596,col 32)",
        "(line 599,col 5)-(line 602,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDoNotOptimizeJSCompiler_ObjectPropertyString()",
      "begin_line": 605,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 32)",
        "(line 607,col 5)-(line 610,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testDoNotOptimizeSetters()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 614,col 5)-(line 614,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveSingletonClass1()",
      "begin_line": 617,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 618,col 5)-(line 621,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass1()",
      "begin_line": 624,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 629,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass2()",
      "begin_line": 632,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 633,col 5)-(line 640,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass3()",
      "begin_line": 643,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 646,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass4()",
      "begin_line": 649,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 650,col 5)-(line 655,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass5()",
      "begin_line": 658,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 659,col 5)-(line 668,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass6()",
      "begin_line": 671,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 672,col 5)-(line 683,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass7()",
      "begin_line": 686,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 687,col 5)-(line 692,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass8()",
      "begin_line": 695,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 696,col 5)-(line 700,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass9()",
      "begin_line": 703,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 704,col 5)-(line 707,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass10()",
      "begin_line": 710,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 711,col 5)-(line 717,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass11()",
      "begin_line": 720,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 721,col 5)-(line 725,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testRemoveInheritedClass12()",
      "begin_line": 728,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 729,col 5)-(line 732,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testReflectedMethods()",
      "begin_line": 735,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 32)",
        "(line 737,col 5)-(line 743,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testIssue618_1()",
      "begin_line": 746,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 747,col 5)-(line 747,col 30)",
        "(line 748,col 5)-(line 754,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVarsTest.testIssue618_2()",
      "begin_line": 757,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 758,col 5)-(line 758,col 30)",
        "(line 759,col 5)-(line 762,col 23)"
      ]
    }
  ]
}