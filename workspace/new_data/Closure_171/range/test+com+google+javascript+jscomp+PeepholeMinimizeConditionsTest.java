{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeMinimizeConditionsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeMinimizeConditionsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 27,
      "end_line": 824,
      "comment": "\n * Tests for {@link PeepholeMinimizeConditions} in isolation.\n * Tests for the interaction of multiple peephole passes are in\n * PeepholeIntegrationTest.\n "
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aggressive"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.PeepholeMinimizeConditionsTest(boolean)",
      "begin_line": 33,
      "end_line": 35,
      "comment": " TODO(user): Remove this when we no longer need to do string comparison.",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.PeepholeMinimizeConditionsTest()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.setUp()",
      "begin_line": 41,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 16)",
        "(line 44,col 5)-(line 44,col 22)",
        "(line 45,col 5)-(line 45,col 18)",
        "(line 46,col 5)-(line 46,col 32)",
        "(line 47,col 5)-(line 47,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 53,col 68)",
        "(line 54,col 5)-(line 54,col 46)",
        "(line 55,col 5)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.getNumRepetitions()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.foldSame(java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.assertResultString(java.lang.String, java.lang.String, boolean)",
      "begin_line": 77,
      "end_line": 88,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 78,col 5)-(line 79,col 52)",
        "(line 81,col 5)-(line 85,col 5)",
        "(line 87,col 5)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldOneChildBlocks()",
      "begin_line": 91,
      "end_line": 166,
      "comment": " Check that removing blocks with 1 child works ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 17)",
        "(line 93,col 5)-(line 94,col 36)",
        "(line 95,col 5)-(line 96,col 36)",
        "(line 97,col 5)-(line 98,col 39)",
        "(line 99,col 5)-(line 100,col 32)",
        "(line 101,col 5)-(line 101,col 72)",
        "(line 104,col 5)-(line 104,col 65)",
        "(line 105,col 5)-(line 106,col 40)",
        "(line 109,col 5)-(line 109,col 67)",
        "(line 110,col 5)-(line 110,col 69)",
        "(line 111,col 5)-(line 111,col 69)",
        "(line 112,col 5)-(line 112,col 65)",
        "(line 113,col 5)-(line 113,col 69)",
        "(line 116,col 5)-(line 117,col 67)",
        "(line 120,col 5)-(line 121,col 50)",
        "(line 124,col 5)-(line 125,col 64)",
        "(line 127,col 5)-(line 128,col 47)",
        "(line 131,col 5)-(line 132,col 38)",
        "(line 133,col 5)-(line 134,col 45)",
        "(line 135,col 5)-(line 136,col 43)",
        "(line 137,col 5)-(line 138,col 48)",
        "(line 140,col 5)-(line 141,col 48)",
        "(line 143,col 5)-(line 144,col 47)",
        "(line 146,col 5)-(line 146,col 64)",
        "(line 147,col 5)-(line 148,col 39)",
        "(line 153,col 5)-(line 154,col 50)",
        "(line 155,col 5)-(line 156,col 39)",
        "(line 159,col 5)-(line 160,col 59)",
        "(line 162,col 5)-(line 162,col 55)",
        "(line 163,col 5)-(line 163,col 64)",
        "(line 164,col 5)-(line 165,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldReturns()",
      "begin_line": 169,
      "end_line": 193,
      "comment": " Try to minimize returns ",
      "child_ranges": [
        "(line 170,col 5)-(line 171,col 39)",
        "(line 172,col 5)-(line 173,col 39)",
        "(line 174,col 5)-(line 175,col 44)",
        "(line 176,col 5)-(line 177,col 43)",
        "(line 178,col 5)-(line 179,col 43)",
        "(line 180,col 5)-(line 181,col 49)",
        "(line 183,col 5)-(line 184,col 48)",
        "(line 185,col 5)-(line 186,col 46)",
        "(line 187,col 5)-(line 188,col 43)",
        "(line 189,col 5)-(line 190,col 40)",
        "(line 192,col 5)-(line 192,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testCombineIfs1()",
      "begin_line": 195,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 197,col 47)",
        "(line 198,col 5)-(line 199,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testCombineIfs2()",
      "begin_line": 202,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 62)",
        "(line 206,col 5)-(line 207,col 43)",
        "(line 209,col 5)-(line 210,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testCombineIfs3()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldAssignments()",
      "begin_line": 219,
      "end_line": 237,
      "comment": " Try to minimize assignments ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 70)",
        "(line 221,col 5)-(line 221,col 78)",
        "(line 224,col 5)-(line 224,col 73)",
        "(line 225,col 5)-(line 225,col 73)",
        "(line 226,col 5)-(line 226,col 73)",
        "(line 227,col 5)-(line 227,col 73)",
        "(line 230,col 5)-(line 230,col 46)",
        "(line 233,col 5)-(line 233,col 46)",
        "(line 236,col 5)-(line 236,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveDuplicateStatements()",
      "begin_line": 239,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 241,col 31)",
        "(line 242,col 5)-(line 244,col 48)",
        "(line 245,col 5)-(line 248,col 58)",
        "(line 249,col 5)-(line 251,col 70)",
        "(line 253,col 5)-(line 261,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testNotCond()",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 64)",
        "(line 266,col 5)-(line 266,col 62)",
        "(line 267,col 5)-(line 267,col 66)",
        "(line 268,col 5)-(line 268,col 58)",
        "(line 269,col 5)-(line 270,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testAndParenthesesCount()",
      "begin_line": 273,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 75)",
        "(line 275,col 5)-(line 276,col 39)",
        "(line 277,col 5)-(line 277,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldLogicalOpStringCompare()",
      "begin_line": 280,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldNot()",
      "begin_line": 286,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 55)",
        "(line 288,col 5)-(line 288,col 55)",
        "(line 289,col 5)-(line 289,col 56)",
        "(line 290,col 5)-(line 290,col 56)",
        "(line 292,col 5)-(line 292,col 36)",
        "(line 293,col 5)-(line 293,col 37)",
        "(line 294,col 5)-(line 294,col 36)",
        "(line 295,col 5)-(line 295,col 37)",
        "(line 296,col 5)-(line 296,col 39)",
        "(line 299,col 5)-(line 299,col 43)",
        "(line 301,col 5)-(line 301,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeExprCondition()",
      "begin_line": 304,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 305,col 48)",
        "(line 306,col 5)-(line 306,col 51)",
        "(line 307,col 5)-(line 307,col 51)",
        "(line 308,col 5)-(line 308,col 52)",
        "(line 309,col 5)-(line 309,col 43)",
        "(line 310,col 5)-(line 310,col 42)",
        "(line 311,col 5)-(line 311,col 41)",
        "(line 312,col 5)-(line 312,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeWhileCondition()",
      "begin_line": 315,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 50)",
        "(line 319,col 5)-(line 319,col 47)",
        "(line 320,col 5)-(line 320,col 56)",
        "(line 321,col 5)-(line 321,col 53)",
        "(line 322,col 5)-(line 322,col 58)",
        "(line 323,col 5)-(line 323,col 56)",
        "(line 324,col 5)-(line 324,col 56)",
        "(line 325,col 5)-(line 325,col 56)",
        "(line 326,col 5)-(line 326,col 62)",
        "(line 327,col 5)-(line 327,col 68)",
        "(line 328,col 5)-(line 328,col 39)",
        "(line 329,col 5)-(line 329,col 39)",
        "(line 330,col 5)-(line 330,col 58)",
        "(line 331,col 5)-(line 331,col 49)",
        "(line 332,col 5)-(line 332,col 49)",
        "(line 333,col 5)-(line 333,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorganRemoveLeadingNot()",
      "begin_line": 336,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 57)",
        "(line 338,col 5)-(line 338,col 45)",
        "(line 339,col 5)-(line 339,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan1()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan3()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan5()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan11()",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 356,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan20()",
      "begin_line": 359,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 360,col 5)-(line 361,col 55)",
        "(line 362,col 5)-(line 363,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testPreserveIf()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testNoSwapWithDanglingElse()",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 75)",
        "(line 372,col 5)-(line 372,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeHook()",
      "begin_line": 375,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 377,col 30)",
        "(line 378,col 5)-(line 379,col 38)",
        "(line 380,col 5)-(line 381,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeComma()",
      "begin_line": 384,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 386,col 41)",
        "(line 387,col 5)-(line 388,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeExprResult()",
      "begin_line": 391,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 392,col 5)-(line 392,col 27)",
        "(line 393,col 5)-(line 393,col 48)",
        "(line 394,col 5)-(line 394,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeDemorgan21()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 399,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeAndOr1()",
      "begin_line": 402,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.parseExpr(java.lang.String)",
      "begin_line": 406,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 40)",
        "(line 408,col 5)-(line 408,col 40)",
        "(line 409,col 5)-(line 409,col 45)",
        "(line 410,col 5)-(line 410,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.minimizeCond(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 413,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 38)",
        "(line 415,col 5)-(line 416,col 76)",
        "(line 417,col 5)-(line 417,col 44)",
        "(line 418,col 5)-(line 418,col 44)",
        "(line 420,col 5)-(line 420,col 69)",
        "(line 422,col 5)-(line 422,col 70)",
        "(line 423,col 5)-(line 426,col 5)",
        "(line 427,col 5)-(line 430,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testTryMinimizeCondition1()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testTryMinimizeCondition2()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testTryMinimizeCondition3()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 442,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testTryMinimizeCondition4()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testTryMinimizeCondition5()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeCondDemorgan()",
      "begin_line": 453,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 454,col 5)-(line 456,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeForCondition()",
      "begin_line": 459,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 462,col 5)-(line 462,col 50)",
        "(line 464,col 5)-(line 464,col 51)",
        "(line 467,col 5)-(line 467,col 47)",
        "(line 470,col 5)-(line 470,col 34)",
        "(line 471,col 5)-(line 471,col 35)",
        "(line 472,col 5)-(line 472,col 35)",
        "(line 473,col 5)-(line 473,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testMinimizeCondition_example1()",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldLoopBreakLate()",
      "begin_line": 481,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 482,col 5)-(line 482,col 16)",
        "(line 483,col 5)-(line 483,col 47)",
        "(line 484,col 5)-(line 484,col 46)",
        "(line 485,col 5)-(line 485,col 69)",
        "(line 486,col 5)-(line 486,col 53)",
        "(line 487,col 5)-(line 488,col 43)",
        "(line 489,col 5)-(line 489,col 70)",
        "(line 492,col 5)-(line 492,col 26)",
        "(line 493,col 5)-(line 493,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldLoopBreakEarly()",
      "begin_line": 496,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 17)",
        "(line 498,col 5)-(line 498,col 37)",
        "(line 499,col 5)-(line 499,col 46)",
        "(line 500,col 5)-(line 500,col 47)",
        "(line 501,col 5)-(line 501,col 38)",
        "(line 502,col 5)-(line 502,col 57)",
        "(line 504,col 5)-(line 504,col 38)",
        "(line 505,col 5)-(line 505,col 26)",
        "(line 506,col 5)-(line 506,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldConditionalVarDeclaration()",
      "begin_line": 509,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 50)",
        "(line 511,col 5)-(line 511,col 50)",
        "(line 513,col 5)-(line 513,col 39)",
        "(line 514,col 5)-(line 514,col 42)",
        "(line 516,col 5)-(line 516,col 57)",
        "(line 517,col 5)-(line 517,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testFoldIfWithLowerOperatorsInside()",
      "begin_line": 520,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 521,col 5)-(line 522,col 36)",
        "(line 523,col 5)-(line 524,col 36)",
        "(line 525,col 5)-(line 526,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testSubsituteReturn()",
      "begin_line": 529,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 531,col 5)-(line 532,col 47)",
        "(line 534,col 5)-(line 534,col 55)",
        "(line 536,col 5)-(line 536,col 49)",
        "(line 538,col 5)-(line 539,col 59)",
        "(line 541,col 5)-(line 542,col 59)",
        "(line 544,col 5)-(line 545,col 58)",
        "(line 547,col 5)-(line 548,col 58)",
        "(line 550,col 5)-(line 551,col 69)",
        "(line 555,col 5)-(line 556,col 75)",
        "(line 559,col 5)-(line 560,col 65)",
        "(line 563,col 5)-(line 563,col 67)",
        "(line 565,col 5)-(line 565,col 63)",
        "(line 568,col 5)-(line 569,col 73)",
        "(line 571,col 5)-(line 572,col 78)",
        "(line 576,col 5)-(line 579,col 68)",
        "(line 582,col 5)-(line 584,col 32)",
        "(line 587,col 5)-(line 591,col 11)",
        "(line 593,col 5)-(line 593,col 77)",
        "(line 595,col 5)-(line 597,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testSubsituteBreakForThrow()",
      "begin_line": 600,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 602,col 5)-(line 602,col 57)",
        "(line 604,col 5)-(line 605,col 59)",
        "(line 606,col 5)-(line 606,col 75)",
        "(line 607,col 5)-(line 607,col 76)",
        "(line 609,col 5)-(line 609,col 54)",
        "(line 611,col 5)-(line 611,col 48)",
        "(line 613,col 5)-(line 614,col 57)",
        "(line 616,col 5)-(line 617,col 57)",
        "(line 619,col 5)-(line 619,col 67)",
        "(line 621,col 5)-(line 622,col 69)",
        "(line 624,col 5)-(line 625,col 68)",
        "(line 629,col 5)-(line 630,col 74)",
        "(line 633,col 5)-(line 634,col 64)",
        "(line 637,col 5)-(line 637,col 72)",
        "(line 639,col 5)-(line 639,col 61)",
        "(line 642,col 5)-(line 643,col 71)",
        "(line 645,col 5)-(line 646,col 76)",
        "(line 650,col 5)-(line 653,col 67)",
        "(line 656,col 5)-(line 658,col 31)",
        "(line 661,col 5)-(line 665,col 11)",
        "(line 667,col 5)-(line 667,col 75)",
        "(line 669,col 5)-(line 671,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveDuplicateReturn()",
      "begin_line": 675,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 676,col 5)-(line 677,col 27)",
        "(line 678,col 5)-(line 678,col 43)",
        "(line 679,col 5)-(line 680,col 49)",
        "(line 681,col 5)-(line 682,col 76)",
        "(line 683,col 5)-(line 684,col 66)",
        "(line 687,col 5)-(line 688,col 80)",
        "(line 691,col 5)-(line 692,col 68)",
        "(line 694,col 5)-(line 695,col 60)",
        "(line 697,col 5)-(line 700,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveDuplicateThrow()",
      "begin_line": 703,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 704,col 5)-(line 704,col 42)",
        "(line 705,col 5)-(line 706,col 48)",
        "(line 707,col 5)-(line 708,col 72)",
        "(line 709,col 5)-(line 710,col 75)",
        "(line 711,col 5)-(line 712,col 75)",
        "(line 713,col 5)-(line 714,col 69)",
        "(line 715,col 5)-(line 717,col 72)",
        "(line 720,col 5)-(line 721,col 78)",
        "(line 724,col 5)-(line 725,col 67)",
        "(line 727,col 5)-(line 728,col 59)",
        "(line 730,col 5)-(line 732,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testNestedIfCombine()",
      "begin_line": 735,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 59)",
        "(line 737,col 5)-(line 737,col 67)",
        "(line 738,col 5)-(line 738,col 69)",
        "(line 739,col 5)-(line 739,col 45)",
        "(line 740,col 5)-(line 740,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testIssue291()",
      "begin_line": 743,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 744,col 5)-(line 744,col 64)",
        "(line 745,col 5)-(line 745,col 41)",
        "(line 746,col 5)-(line 746,col 59)",
        "(line 747,col 5)-(line 747,col 61)",
        "(line 748,col 5)-(line 748,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testObjectLiteral()",
      "begin_line": 751,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 752,col 5)-(line 752,col 22)",
        "(line 753,col 5)-(line 753,col 25)",
        "(line 754,col 5)-(line 754,col 28)",
        "(line 755,col 5)-(line 755,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testArrayLiteral()",
      "begin_line": 758,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 759,col 5)-(line 759,col 22)",
        "(line 760,col 5)-(line 760,col 23)",
        "(line 761,col 5)-(line 761,col 23)",
        "(line 762,col 5)-(line 762,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveElseCause()",
      "begin_line": 765,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 766,col 5)-(line 773,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveElseCause1()",
      "begin_line": 776,
      "end_line": 779,
      "comment": "",
      "child_ranges": [
        "(line 777,col 5)-(line 778,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveElseCause2()",
      "begin_line": 781,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 782,col 5)-(line 783,col 54)",
        "(line 784,col 5)-(line 785,col 52)",
        "(line 787,col 5)-(line 787,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveElseCause3()",
      "begin_line": 790,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 791,col 5)-(line 791,col 63)",
        "(line 792,col 5)-(line 792,col 67)",
        "(line 793,col 5)-(line 793,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testRemoveElseCause4()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 5)-(line 797,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditionsTest.testIssue925()",
      "begin_line": 800,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 801,col 5)-(line 807,col 49)",
        "(line 809,col 5)-(line 815,col 33)",
        "(line 817,col 5)-(line 818,col 34)",
        "(line 820,col 5)-(line 821,col 35)"
      ]
    }
  ]
}