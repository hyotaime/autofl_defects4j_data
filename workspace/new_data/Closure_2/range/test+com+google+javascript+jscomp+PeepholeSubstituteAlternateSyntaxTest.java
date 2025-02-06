{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/PeepholeSubstituteAlternateSyntaxTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeSubstituteAlternateSyntaxTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 1082,
      "comment": "\n * Tests for {@link PeepholeSubstituteAlternateSyntax} in isolation.\n * Tests for the interaction of multiple peephole passes are in\n * PeepholeIntegrationTest.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FOLD_CONSTANTS_TEST_EXTERNS"
      ],
      "begin_line": 29,
      "end_line": 32,
      "comment": " testFoldLiteralArrayConstructors() and testFoldRegExp...()"
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.PeepholeSubstituteAlternateSyntaxTest(boolean)",
      "begin_line": 37,
      "end_line": 39,
      "comment": " TODO(user): Remove this when we no longer need to do string comparison.",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.PeepholeSubstituteAlternateSyntaxTest()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.setUp()",
      "begin_line": 45,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 16)",
        "(line 48,col 5)-(line 48,col 18)",
        "(line 49,col 5)-(line 49,col 32)",
        "(line 50,col 5)-(line 50,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 53,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 58,col 36)",
        "(line 60,col 5)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.getNumRepetitions()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.foldSame(java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.fold(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.assertResultString(java.lang.String, java.lang.String, boolean)",
      "begin_line": 86,
      "end_line": 97,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 87,col 5)-(line 88,col 59)",
        "(line 90,col 5)-(line 94,col 5)",
        "(line 96,col 5)-(line 96,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldOneChildBlocks()",
      "begin_line": 100,
      "end_line": 175,
      "comment": " Check that removing blocks with 1 child works ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 17)",
        "(line 102,col 5)-(line 103,col 36)",
        "(line 104,col 5)-(line 105,col 36)",
        "(line 106,col 5)-(line 107,col 39)",
        "(line 108,col 5)-(line 109,col 32)",
        "(line 110,col 5)-(line 110,col 72)",
        "(line 113,col 5)-(line 113,col 65)",
        "(line 114,col 5)-(line 115,col 40)",
        "(line 118,col 5)-(line 118,col 67)",
        "(line 119,col 5)-(line 119,col 69)",
        "(line 120,col 5)-(line 120,col 69)",
        "(line 121,col 5)-(line 121,col 65)",
        "(line 122,col 5)-(line 122,col 69)",
        "(line 125,col 5)-(line 126,col 67)",
        "(line 129,col 5)-(line 130,col 50)",
        "(line 133,col 5)-(line 134,col 64)",
        "(line 136,col 5)-(line 137,col 47)",
        "(line 140,col 5)-(line 141,col 38)",
        "(line 142,col 5)-(line 143,col 45)",
        "(line 144,col 5)-(line 145,col 43)",
        "(line 146,col 5)-(line 147,col 48)",
        "(line 149,col 5)-(line 150,col 48)",
        "(line 152,col 5)-(line 153,col 47)",
        "(line 155,col 5)-(line 155,col 64)",
        "(line 156,col 5)-(line 157,col 39)",
        "(line 162,col 5)-(line 163,col 50)",
        "(line 164,col 5)-(line 165,col 39)",
        "(line 168,col 5)-(line 169,col 59)",
        "(line 171,col 5)-(line 171,col 55)",
        "(line 172,col 5)-(line 172,col 64)",
        "(line 173,col 5)-(line 174,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldReturns()",
      "begin_line": 178,
      "end_line": 202,
      "comment": " Try to minimize returns ",
      "child_ranges": [
        "(line 179,col 5)-(line 180,col 39)",
        "(line 181,col 5)-(line 182,col 39)",
        "(line 183,col 5)-(line 184,col 44)",
        "(line 185,col 5)-(line 186,col 43)",
        "(line 187,col 5)-(line 188,col 43)",
        "(line 189,col 5)-(line 190,col 49)",
        "(line 192,col 5)-(line 193,col 48)",
        "(line 194,col 5)-(line 195,col 46)",
        "(line 196,col 5)-(line 197,col 43)",
        "(line 198,col 5)-(line 199,col 40)",
        "(line 201,col 5)-(line 201,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testCombineIfs1()",
      "begin_line": 204,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 206,col 47)",
        "(line 207,col 5)-(line 208,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testCombineIfs2()",
      "begin_line": 211,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 62)",
        "(line 215,col 5)-(line 216,col 43)",
        "(line 218,col 5)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testCombineIfs3()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldAssignments()",
      "begin_line": 228,
      "end_line": 246,
      "comment": " Try to minimize assignments ",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 70)",
        "(line 230,col 5)-(line 230,col 78)",
        "(line 233,col 5)-(line 233,col 73)",
        "(line 234,col 5)-(line 234,col 73)",
        "(line 235,col 5)-(line 235,col 73)",
        "(line 236,col 5)-(line 236,col 73)",
        "(line 239,col 5)-(line 239,col 46)",
        "(line 242,col 5)-(line 242,col 46)",
        "(line 245,col 5)-(line 245,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveDuplicateStatements()",
      "begin_line": 248,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 250,col 31)",
        "(line 251,col 5)-(line 253,col 48)",
        "(line 254,col 5)-(line 257,col 58)",
        "(line 258,col 5)-(line 260,col 66)",
        "(line 262,col 5)-(line 270,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testNotCond()",
      "begin_line": 273,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 64)",
        "(line 275,col 5)-(line 275,col 62)",
        "(line 276,col 5)-(line 276,col 66)",
        "(line 277,col 5)-(line 277,col 58)",
        "(line 278,col 5)-(line 278,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testAndParenthesesCount()",
      "begin_line": 281,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 75)",
        "(line 283,col 5)-(line 284,col 39)",
        "(line 285,col 5)-(line 285,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLogicalOpStringCompare()",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldNot()",
      "begin_line": 294,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 55)",
        "(line 296,col 5)-(line 296,col 55)",
        "(line 297,col 5)-(line 297,col 56)",
        "(line 298,col 5)-(line 298,col 56)",
        "(line 300,col 5)-(line 300,col 36)",
        "(line 301,col 5)-(line 301,col 37)",
        "(line 302,col 5)-(line 302,col 36)",
        "(line 303,col 5)-(line 303,col 37)",
        "(line 304,col 5)-(line 304,col 39)",
        "(line 307,col 5)-(line 307,col 43)",
        "(line 309,col 5)-(line 309,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldRegExpConstructor()",
      "begin_line": 312,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 22)",
        "(line 316,col 5)-(line 316,col 62)",
        "(line 318,col 5)-(line 318,col 66)",
        "(line 319,col 5)-(line 319,col 72)",
        "(line 321,col 5)-(line 322,col 77)",
        "(line 324,col 5)-(line 324,col 62)",
        "(line 325,col 5)-(line 325,col 62)",
        "(line 326,col 5)-(line 326,col 63)",
        "(line 328,col 5)-(line 328,col 60)",
        "(line 329,col 5)-(line 329,col 59)",
        "(line 330,col 5)-(line 330,col 59)",
        "(line 331,col 5)-(line 331,col 65)",
        "(line 332,col 5)-(line 332,col 59)",
        "(line 333,col 5)-(line 333,col 59)",
        "(line 334,col 5)-(line 334,col 59)",
        "(line 338,col 5)-(line 338,col 27)",
        "(line 339,col 5)-(line 339,col 52)",
        "(line 340,col 5)-(line 340,col 51)",
        "(line 344,col 5)-(line 344,col 23)",
        "(line 346,col 5)-(line 346,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testVersionSpecificRegExpQuirks()",
      "begin_line": 349,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 22)",
        "(line 353,col 5)-(line 353,col 29)",
        "(line 354,col 5)-(line 355,col 41)",
        "(line 356,col 5)-(line 357,col 42)",
        "(line 359,col 5)-(line 359,col 28)",
        "(line 360,col 5)-(line 361,col 27)",
        "(line 364,col 5)-(line 364,col 29)",
        "(line 365,col 5)-(line 365,col 67)",
        "(line 366,col 5)-(line 366,col 65)",
        "(line 368,col 5)-(line 368,col 28)",
        "(line 369,col 5)-(line 369,col 71)",
        "(line 370,col 5)-(line 370,col 59)",
        "(line 371,col 5)-(line 371,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldRegExpConstructorStringCompare()",
      "begin_line": 374,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 5)-(line 377,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testContainsUnicodeEscape()",
      "begin_line": 380,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 77)",
        "(line 382,col 5)-(line 382,col 80)",
        "(line 383,col 5)-(line 384,col 19)",
        "(line 385,col 5)-(line 386,col 20)",
        "(line 387,col 5)-(line 388,col 79)",
        "(line 389,col 5)-(line 390,col 25)",
        "(line 391,col 5)-(line 392,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLiteralObjectConstructors()",
      "begin_line": 395,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 22)",
        "(line 399,col 5)-(line 399,col 39)",
        "(line 400,col 5)-(line 400,col 41)",
        "(line 401,col 5)-(line 401,col 37)",
        "(line 403,col 5)-(line 403,col 23)",
        "(line 405,col 5)-(line 405,col 31)",
        "(line 406,col 5)-(line 406,col 33)",
        "(line 407,col 5)-(line 407,col 29)",
        "(line 409,col 5)-(line 409,col 22)",
        "(line 412,col 5)-(line 413,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLiteralArrayConstructors()",
      "begin_line": 416,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 417,col 5)-(line 417,col 22)",
        "(line 420,col 5)-(line 420,col 36)",
        "(line 421,col 5)-(line 421,col 38)",
        "(line 422,col 5)-(line 422,col 34)",
        "(line 425,col 5)-(line 425,col 39)",
        "(line 426,col 5)-(line 426,col 35)",
        "(line 427,col 5)-(line 427,col 48)",
        "(line 428,col 5)-(line 428,col 44)",
        "(line 431,col 5)-(line 431,col 45)",
        "(line 432,col 5)-(line 432,col 41)",
        "(line 433,col 5)-(line 433,col 45)",
        "(line 434,col 5)-(line 434,col 41)",
        "(line 435,col 5)-(line 435,col 53)",
        "(line 436,col 5)-(line 436,col 49)",
        "(line 439,col 5)-(line 439,col 58)",
        "(line 440,col 5)-(line 440,col 54)",
        "(line 441,col 5)-(line 442,col 48)",
        "(line 443,col 5)-(line 444,col 48)",
        "(line 445,col 5)-(line 445,col 75)",
        "(line 446,col 5)-(line 446,col 71)",
        "(line 447,col 5)-(line 448,col 42)",
        "(line 449,col 5)-(line 450,col 42)",
        "(line 452,col 5)-(line 452,col 23)",
        "(line 454,col 5)-(line 454,col 30)",
        "(line 455,col 5)-(line 455,col 32)",
        "(line 456,col 5)-(line 456,col 28)",
        "(line 458,col 5)-(line 458,col 33)",
        "(line 459,col 5)-(line 459,col 29)",
        "(line 460,col 5)-(line 460,col 37)",
        "(line 461,col 5)-(line 461,col 33)",
        "(line 462,col 5)-(line 462,col 33)",
        "(line 463,col 5)-(line 463,col 29)",
        "(line 464,col 5)-(line 464,col 37)",
        "(line 465,col 5)-(line 465,col 33)",
        "(line 467,col 5)-(line 467,col 42)",
        "(line 468,col 5)-(line 468,col 38)",
        "(line 469,col 5)-(line 469,col 61)",
        "(line 470,col 5)-(line 470,col 57)",
        "(line 471,col 5)-(line 471,col 53)",
        "(line 472,col 5)-(line 472,col 49)",
        "(line 473,col 5)-(line 474,col 63)",
        "(line 475,col 5)-(line 476,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testMinimizeExprCondition()",
      "begin_line": 479,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 48)",
        "(line 481,col 5)-(line 481,col 51)",
        "(line 482,col 5)-(line 482,col 51)",
        "(line 483,col 5)-(line 483,col 52)",
        "(line 484,col 5)-(line 484,col 43)",
        "(line 485,col 5)-(line 485,col 42)",
        "(line 486,col 5)-(line 486,col 41)",
        "(line 487,col 5)-(line 487,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testMinimizeWhileCondition()",
      "begin_line": 490,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 50)",
        "(line 494,col 5)-(line 494,col 47)",
        "(line 495,col 5)-(line 495,col 56)",
        "(line 496,col 5)-(line 496,col 53)",
        "(line 497,col 5)-(line 497,col 58)",
        "(line 498,col 5)-(line 498,col 56)",
        "(line 499,col 5)-(line 499,col 56)",
        "(line 500,col 5)-(line 500,col 56)",
        "(line 501,col 5)-(line 501,col 62)",
        "(line 502,col 5)-(line 502,col 68)",
        "(line 503,col 5)-(line 503,col 39)",
        "(line 504,col 5)-(line 504,col 39)",
        "(line 505,col 5)-(line 505,col 58)",
        "(line 506,col 5)-(line 506,col 49)",
        "(line 507,col 5)-(line 507,col 49)",
        "(line 508,col 5)-(line 508,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testMinimizeForCondition()",
      "begin_line": 511,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 50)",
        "(line 516,col 5)-(line 516,col 51)",
        "(line 519,col 5)-(line 519,col 47)",
        "(line 522,col 5)-(line 522,col 34)",
        "(line 523,col 5)-(line 523,col 35)",
        "(line 524,col 5)-(line 524,col 35)",
        "(line 525,col 5)-(line 525,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testMinimizeCondition_example1()",
      "begin_line": 528,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLoopBreakLate()",
      "begin_line": 533,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 16)",
        "(line 535,col 5)-(line 535,col 47)",
        "(line 536,col 5)-(line 536,col 46)",
        "(line 537,col 5)-(line 537,col 69)",
        "(line 538,col 5)-(line 538,col 53)",
        "(line 539,col 5)-(line 540,col 43)",
        "(line 541,col 5)-(line 541,col 70)",
        "(line 544,col 5)-(line 544,col 26)",
        "(line 545,col 5)-(line 545,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLoopBreakEarly()",
      "begin_line": 548,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 549,col 17)",
        "(line 550,col 5)-(line 550,col 37)",
        "(line 551,col 5)-(line 551,col 46)",
        "(line 552,col 5)-(line 552,col 47)",
        "(line 553,col 5)-(line 553,col 38)",
        "(line 554,col 5)-(line 554,col 57)",
        "(line 556,col 5)-(line 556,col 38)",
        "(line 557,col 5)-(line 557,col 26)",
        "(line 558,col 5)-(line 558,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldConditionalVarDeclaration()",
      "begin_line": 561,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 562,col 5)-(line 562,col 50)",
        "(line 563,col 5)-(line 563,col 50)",
        "(line 565,col 5)-(line 565,col 39)",
        "(line 566,col 5)-(line 566,col 42)",
        "(line 568,col 5)-(line 568,col 57)",
        "(line 569,col 5)-(line 569,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldReturnResult()",
      "begin_line": 572,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 67)",
        "(line 574,col 5)-(line 574,col 43)",
        "(line 575,col 5)-(line 576,col 33)",
        "(line 577,col 5)-(line 578,col 27)",
        "(line 579,col 5)-(line 579,col 49)",
        "(line 580,col 5)-(line 581,col 33)",
        "(line 582,col 5)-(line 583,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldStandardConstructors()",
      "begin_line": 586,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 587,col 5)-(line 587,col 29)",
        "(line 588,col 5)-(line 588,col 40)",
        "(line 589,col 5)-(line 589,col 38)",
        "(line 590,col 5)-(line 590,col 38)",
        "(line 591,col 5)-(line 591,col 39)",
        "(line 593,col 5)-(line 593,col 22)",
        "(line 595,col 5)-(line 595,col 59)",
        "(line 596,col 5)-(line 596,col 57)",
        "(line 597,col 5)-(line 597,col 61)",
        "(line 598,col 5)-(line 598,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSubsituteReturn()",
      "begin_line": 601,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 603,col 5)-(line 604,col 47)",
        "(line 606,col 5)-(line 606,col 55)",
        "(line 608,col 5)-(line 608,col 49)",
        "(line 610,col 5)-(line 611,col 59)",
        "(line 613,col 5)-(line 614,col 59)",
        "(line 616,col 5)-(line 617,col 58)",
        "(line 619,col 5)-(line 620,col 58)",
        "(line 622,col 5)-(line 623,col 69)",
        "(line 627,col 5)-(line 628,col 75)",
        "(line 631,col 5)-(line 632,col 65)",
        "(line 635,col 5)-(line 635,col 67)",
        "(line 637,col 5)-(line 637,col 63)",
        "(line 640,col 5)-(line 641,col 73)",
        "(line 643,col 5)-(line 644,col 78)",
        "(line 648,col 5)-(line 651,col 68)",
        "(line 654,col 5)-(line 656,col 32)",
        "(line 659,col 5)-(line 663,col 11)",
        "(line 665,col 5)-(line 665,col 77)",
        "(line 667,col 5)-(line 669,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSubsituteBreakForThrow()",
      "begin_line": 672,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 674,col 5)-(line 674,col 57)",
        "(line 676,col 5)-(line 677,col 59)",
        "(line 678,col 5)-(line 678,col 75)",
        "(line 679,col 5)-(line 679,col 76)",
        "(line 681,col 5)-(line 681,col 54)",
        "(line 683,col 5)-(line 683,col 48)",
        "(line 685,col 5)-(line 686,col 57)",
        "(line 688,col 5)-(line 689,col 57)",
        "(line 691,col 5)-(line 691,col 67)",
        "(line 693,col 5)-(line 694,col 69)",
        "(line 696,col 5)-(line 697,col 68)",
        "(line 701,col 5)-(line 702,col 74)",
        "(line 705,col 5)-(line 706,col 64)",
        "(line 709,col 5)-(line 709,col 72)",
        "(line 711,col 5)-(line 711,col 61)",
        "(line 714,col 5)-(line 715,col 71)",
        "(line 717,col 5)-(line 718,col 76)",
        "(line 722,col 5)-(line 725,col 67)",
        "(line 728,col 5)-(line 730,col 31)",
        "(line 733,col 5)-(line 737,col 11)",
        "(line 739,col 5)-(line 739,col 75)",
        "(line 741,col 5)-(line 743,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveDuplicateReturn()",
      "begin_line": 747,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 748,col 5)-(line 749,col 27)",
        "(line 750,col 5)-(line 750,col 43)",
        "(line 751,col 5)-(line 752,col 49)",
        "(line 753,col 5)-(line 754,col 76)",
        "(line 755,col 5)-(line 756,col 66)",
        "(line 759,col 5)-(line 760,col 80)",
        "(line 763,col 5)-(line 764,col 68)",
        "(line 766,col 5)-(line 767,col 60)",
        "(line 769,col 5)-(line 772,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveDuplicateThrow()",
      "begin_line": 775,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 42)",
        "(line 777,col 5)-(line 778,col 48)",
        "(line 779,col 5)-(line 780,col 72)",
        "(line 781,col 5)-(line 782,col 75)",
        "(line 783,col 5)-(line 784,col 75)",
        "(line 785,col 5)-(line 786,col 69)",
        "(line 787,col 5)-(line 789,col 72)",
        "(line 792,col 5)-(line 793,col 78)",
        "(line 796,col 5)-(line 797,col 67)",
        "(line 799,col 5)-(line 800,col 59)",
        "(line 802,col 5)-(line 804,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testNestedIfCombine()",
      "begin_line": 807,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 808,col 5)-(line 808,col 59)",
        "(line 809,col 5)-(line 809,col 67)",
        "(line 810,col 5)-(line 810,col 69)",
        "(line 811,col 5)-(line 811,col 45)",
        "(line 812,col 5)-(line 812,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldTrueFalse()",
      "begin_line": 815,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 816,col 5)-(line 816,col 31)",
        "(line 817,col 5)-(line 817,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testIssue291()",
      "begin_line": 820,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 821,col 5)-(line 821,col 64)",
        "(line 822,col 5)-(line 822,col 41)",
        "(line 823,col 5)-(line 823,col 59)",
        "(line 824,col 5)-(line 824,col 61)",
        "(line 825,col 5)-(line 825,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testUndefined()",
      "begin_line": 827,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 828,col 5)-(line 828,col 34)",
        "(line 829,col 5)-(line 829,col 67)",
        "(line 830,col 5)-(line 830,col 27)",
        "(line 831,col 5)-(line 831,col 46)",
        "(line 832,col 5)-(line 834,col 61)",
        "(line 835,col 5)-(line 835,col 41)",
        "(line 836,col 5)-(line 836,col 43)",
        "(line 837,col 5)-(line 837,col 41)",
        "(line 838,col 5)-(line 838,col 29)",
        "(line 839,col 5)-(line 839,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSplitCommaExpressions()",
      "begin_line": 842,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 843,col 5)-(line 843,col 17)",
        "(line 845,col 5)-(line 845,col 40)",
        "(line 846,col 5)-(line 846,col 37)",
        "(line 847,col 5)-(line 847,col 33)",
        "(line 850,col 5)-(line 850,col 26)",
        "(line 852,col 5)-(line 852,col 39)",
        "(line 853,col 5)-(line 853,col 42)",
        "(line 854,col 5)-(line 854,col 61)",
        "(line 855,col 5)-(line 855,col 57)",
        "(line 856,col 5)-(line 856,col 38)",
        "(line 857,col 5)-(line 857,col 34)",
        "(line 858,col 5)-(line 858,col 63)",
        "(line 859,col 5)-(line 859,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma1()",
      "begin_line": 862,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 863,col 5)-(line 863,col 17)",
        "(line 864,col 5)-(line 864,col 25)",
        "(line 865,col 5)-(line 865,col 25)",
        "(line 866,col 5)-(line 866,col 16)",
        "(line 867,col 5)-(line 867,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma2()",
      "begin_line": 870,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 17)",
        "(line 872,col 5)-(line 872,col 29)",
        "(line 873,col 5)-(line 873,col 16)",
        "(line 874,col 5)-(line 874,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma3()",
      "begin_line": 877,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 878,col 5)-(line 878,col 17)",
        "(line 879,col 5)-(line 879,col 39)",
        "(line 880,col 5)-(line 880,col 16)",
        "(line 881,col 5)-(line 881,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma4()",
      "begin_line": 884,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 885,col 5)-(line 885,col 17)",
        "(line 886,col 5)-(line 886,col 32)",
        "(line 887,col 5)-(line 887,col 16)",
        "(line 888,col 5)-(line 888,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma5()",
      "begin_line": 891,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 892,col 5)-(line 892,col 17)",
        "(line 893,col 5)-(line 893,col 37)",
        "(line 894,col 5)-(line 894,col 16)",
        "(line 895,col 5)-(line 895,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testObjectLiteral()",
      "begin_line": 898,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 899,col 5)-(line 899,col 22)",
        "(line 900,col 5)-(line 900,col 25)",
        "(line 901,col 5)-(line 901,col 28)",
        "(line 902,col 5)-(line 902,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testArrayLiteral()",
      "begin_line": 905,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 906,col 5)-(line 906,col 22)",
        "(line 907,col 5)-(line 907,col 23)",
        "(line 908,col 5)-(line 908,col 23)",
        "(line 909,col 5)-(line 909,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testStringArraySplitting()",
      "begin_line": 912,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 913,col 5)-(line 913,col 40)",
        "(line 914,col 5)-(line 914,col 44)",
        "(line 915,col 5)-(line 916,col 37)",
        "(line 917,col 5)-(line 918,col 44)",
        "(line 919,col 5)-(line 920,col 37)",
        "(line 921,col 5)-(line 922,col 46)",
        "(line 923,col 5)-(line 924,col 44)",
        "(line 925,col 5)-(line 926,col 44)",
        "(line 927,col 5)-(line 928,col 44)",
        "(line 931,col 5)-(line 931,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveElseCause()",
      "begin_line": 934,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 935,col 5)-(line 942,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveElseCause1()",
      "begin_line": 946,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 947,col 5)-(line 948,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveElseCause2()",
      "begin_line": 951,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 952,col 5)-(line 953,col 54)",
        "(line 954,col 5)-(line 955,col 52)",
        "(line 957,col 5)-(line 957,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveElseCause3()",
      "begin_line": 960,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 961,col 5)-(line 961,col 63)",
        "(line 962,col 5)-(line 962,col 67)",
        "(line 963,col 5)-(line 963,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testRemoveElseCause4()",
      "begin_line": 966,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 967,col 5)-(line 967,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall1()",
      "begin_line": 970,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 971,col 5)-(line 971,col 36)",
        "(line 972,col 5)-(line 972,col 44)",
        "(line 973,col 5)-(line 973,col 48)",
        "(line 975,col 5)-(line 975,col 38)",
        "(line 976,col 5)-(line 976,col 47)",
        "(line 977,col 5)-(line 977,col 51)",
        "(line 979,col 5)-(line 979,col 39)",
        "(line 980,col 5)-(line 980,col 42)",
        "(line 981,col 5)-(line 981,col 46)",
        "(line 983,col 5)-(line 983,col 41)",
        "(line 984,col 5)-(line 984,col 45)",
        "(line 985,col 5)-(line 985,col 49)",
        "(line 987,col 5)-(line 987,col 60)",
        "(line 988,col 5)-(line 988,col 67)",
        "(line 989,col 5)-(line 989,col 71)",
        "(line 991,col 5)-(line 991,col 62)",
        "(line 992,col 5)-(line 992,col 70)",
        "(line 993,col 5)-(line 993,col 74)",
        "(line 996,col 5)-(line 996,col 29)",
        "(line 997,col 5)-(line 997,col 30)",
        "(line 998,col 5)-(line 998,col 30)",
        "(line 999,col 5)-(line 999,col 31)",
        "(line 1002,col 5)-(line 1002,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall2()",
      "begin_line": 1005,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 5)-(line 1006,col 36)",
        "(line 1007,col 5)-(line 1007,col 44)",
        "(line 1008,col 5)-(line 1008,col 48)",
        "(line 1010,col 5)-(line 1010,col 38)",
        "(line 1011,col 5)-(line 1011,col 47)",
        "(line 1012,col 5)-(line 1012,col 51)",
        "(line 1014,col 5)-(line 1014,col 39)",
        "(line 1015,col 5)-(line 1015,col 42)",
        "(line 1016,col 5)-(line 1016,col 46)",
        "(line 1018,col 5)-(line 1018,col 41)",
        "(line 1019,col 5)-(line 1019,col 45)",
        "(line 1020,col 5)-(line 1020,col 49)",
        "(line 1023,col 5)-(line 1023,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall3()",
      "begin_line": 1026,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 5)-(line 1033,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSimpleFunctionCall()",
      "begin_line": 1036,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 5)-(line 1037,col 50)",
        "(line 1038,col 5)-(line 1038,col 60)",
        "(line 1039,col 5)-(line 1039,col 48)",
        "(line 1040,col 5)-(line 1040,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringCompareTestCase",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 1043,
      "end_line": 1081,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.StringCompareTestCase()",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 7)-(line 1046,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 1049,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 7)-(line 1053,col 58)",
        "(line 1054,col 7)-(line 1054,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.testBindToCall3()",
      "begin_line": 1057,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 7)-(line 1058,col 46)",
        "(line 1059,col 7)-(line 1059,col 50)",
        "(line 1061,col 7)-(line 1061,col 48)",
        "(line 1062,col 7)-(line 1062,col 53)",
        "(line 1064,col 7)-(line 1064,col 49)",
        "(line 1065,col 7)-(line 1065,col 52)",
        "(line 1067,col 7)-(line 1067,col 51)",
        "(line 1068,col 7)-(line 1068,col 55)",
        "(line 1071,col 7)-(line 1071,col 31)",
        "(line 1072,col 7)-(line 1072,col 32)",
        "(line 1073,col 7)-(line 1073,col 32)",
        "(line 1074,col 7)-(line 1074,col 33)",
        "(line 1077,col 7)-(line 1077,col 41)"
      ]
    }
  ]
}