{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeRemoveDeadCodeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeRemoveDeadCodeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 741,
      "comment": "\n * Tests for PeepholeRemoveDeadCodeTest in isolation. Tests for the interaction\n * of multiple peephole passes are in PeepholeIntegrationTest.\n "
    },
    {
      "type": "field",
      "varNames": [
        "MATH"
      ],
      "begin_line": 27,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.PeepholeRemoveDeadCodeTest()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.setUp()",
      "begin_line": 36,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 18)",
        "(line 39,col 5)-(line 39,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 42,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 57,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.Anonymous-34490b20-76c5-444d-a481-380b8288c782.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 49)",
        "(line 49,col 9)-(line 49,col 48)",
        "(line 50,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 54,col 56)",
        "(line 55,col 9)-(line 55,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.getNumRepetitions()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.foldSame(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldBlock()",
      "begin_line": 74,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 31)",
        "(line 76,col 5)-(line 76,col 32)",
        "(line 77,col 5)-(line 77,col 33)",
        "(line 78,col 5)-(line 78,col 44)",
        "(line 79,col 5)-(line 79,col 47)",
        "(line 80,col 5)-(line 80,col 65)",
        "(line 82,col 5)-(line 82,col 23)",
        "(line 83,col 5)-(line 83,col 23)",
        "(line 84,col 5)-(line 84,col 38)",
        "(line 85,col 5)-(line 85,col 59)",
        "(line 86,col 5)-(line 86,col 62)",
        "(line 87,col 5)-(line 88,col 53)",
        "(line 89,col 5)-(line 89,col 38)",
        "(line 92,col 5)-(line 92,col 41)",
        "(line 93,col 5)-(line 93,col 45)",
        "(line 94,col 5)-(line 94,col 57)",
        "(line 95,col 5)-(line 95,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldBlocksWithManyChildren()",
      "begin_line": 99,
      "end_line": 105,
      "comment": " Try to remove spurious blocks with multiple children ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 61)",
        "(line 101,col 5)-(line 102,col 27)",
        "(line 103,col 5)-(line 104,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testIf()",
      "begin_line": 107,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 49)",
        "(line 109,col 5)-(line 109,col 56)",
        "(line 110,col 5)-(line 110,col 60)",
        "(line 111,col 5)-(line 111,col 55)",
        "(line 112,col 5)-(line 112,col 57)",
        "(line 113,col 5)-(line 114,col 22)",
        "(line 115,col 5)-(line 116,col 16)",
        "(line 117,col 5)-(line 118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook()",
      "begin_line": 121,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 36)",
        "(line 123,col 5)-(line 123,col 37)",
        "(line 125,col 5)-(line 125,col 43)",
        "(line 126,col 5)-(line 126,col 43)",
        "(line 128,col 5)-(line 128,col 52)",
        "(line 129,col 5)-(line 129,col 54)",
        "(line 130,col 5)-(line 131,col 45)",
        "(line 132,col 5)-(line 133,col 46)",
        "(line 135,col 5)-(line 135,col 46)",
        "(line 136,col 5)-(line 137,col 27)",
        "(line 139,col 5)-(line 139,col 35)",
        "(line 140,col 5)-(line 140,col 31)",
        "(line 141,col 5)-(line 141,col 32)",
        "(line 143,col 5)-(line 143,col 35)",
        "(line 144,col 5)-(line 144,col 33)",
        "(line 145,col 5)-(line 145,col 34)",
        "(line 147,col 5)-(line 147,col 52)",
        "(line 148,col 5)-(line 148,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testConstantConditionWithSideEffect1()",
      "begin_line": 151,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 43)",
        "(line 153,col 5)-(line 153,col 43)",
        "(line 154,col 5)-(line 154,col 60)",
        "(line 155,col 5)-(line 155,col 55)",
        "(line 156,col 5)-(line 156,col 38)",
        "(line 157,col 5)-(line 157,col 51)",
        "(line 158,col 5)-(line 158,col 36)",
        "(line 159,col 5)-(line 159,col 32)",
        "(line 160,col 5)-(line 160,col 53)",
        "(line 161,col 5)-(line 161,col 41)",
        "(line 162,col 5)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testConstantConditionWithSideEffect2()",
      "begin_line": 165,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 44)",
        "(line 167,col 5)-(line 167,col 46)",
        "(line 168,col 5)-(line 168,col 43)",
        "(line 169,col 5)-(line 169,col 58)",
        "(line 170,col 5)-(line 170,col 41)",
        "(line 171,col 5)-(line 171,col 54)",
        "(line 172,col 5)-(line 172,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testVarLifting()",
      "begin_line": 175,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 35)",
        "(line 177,col 5)-(line 177,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldUselessWhile()",
      "begin_line": 182,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 39)",
        "(line 185,col 5)-(line 185,col 40)",
        "(line 186,col 5)-(line 186,col 43)",
        "(line 188,col 5)-(line 188,col 34)",
        "(line 190,col 5)-(line 190,col 49)",
        "(line 193,col 5)-(line 193,col 49)",
        "(line 195,col 5)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldUselessFor()",
      "begin_line": 198,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 39)",
        "(line 200,col 5)-(line 200,col 40)",
        "(line 201,col 5)-(line 201,col 43)",
        "(line 202,col 5)-(line 202,col 49)",
        "(line 203,col 5)-(line 203,col 30)",
        "(line 204,col 5)-(line 204,col 49)",
        "(line 207,col 5)-(line 207,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldUselessDo()",
      "begin_line": 210,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 48)",
        "(line 212,col 5)-(line 212,col 49)",
        "(line 213,col 5)-(line 213,col 52)",
        "(line 214,col 5)-(line 214,col 67)",
        "(line 215,col 5)-(line 215,col 55)",
        "(line 217,col 5)-(line 217,col 66)",
        "(line 220,col 5)-(line 220,col 49)",
        "(line 221,col 5)-(line 221,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testMinimizeWhileConstantCondition()",
      "begin_line": 224,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 51)",
        "(line 226,col 5)-(line 226,col 31)",
        "(line 227,col 5)-(line 227,col 33)",
        "(line 228,col 5)-(line 228,col 33)",
        "(line 229,col 5)-(line 229,col 34)",
        "(line 230,col 5)-(line 230,col 39)",
        "(line 231,col 5)-(line 231,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldConstantCommaExpressions()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 41)",
        "(line 236,col 5)-(line 236,col 46)",
        "(line 237,col 5)-(line 237,col 33)",
        "(line 238,col 5)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveUselessOps()",
      "begin_line": 242,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 30)",
        "(line 251,col 5)-(line 251,col 47)",
        "(line 252,col 5)-(line 252,col 53)",
        "(line 255,col 5)-(line 255,col 21)",
        "(line 256,col 5)-(line 256,col 42)",
        "(line 260,col 5)-(line 260,col 36)",
        "(line 263,col 5)-(line 263,col 34)",
        "(line 264,col 5)-(line 264,col 35)",
        "(line 266,col 5)-(line 266,col 40)",
        "(line 269,col 5)-(line 269,col 24)",
        "(line 270,col 5)-(line 270,col 40)",
        "(line 271,col 5)-(line 271,col 34)",
        "(line 272,col 5)-(line 272,col 28)",
        "(line 273,col 5)-(line 273,col 33)",
        "(line 275,col 5)-(line 275,col 42)",
        "(line 276,col 5)-(line 276,col 48)",
        "(line 277,col 5)-(line 277,col 70)",
        "(line 280,col 5)-(line 280,col 38)",
        "(line 281,col 5)-(line 281,col 38)",
        "(line 282,col 5)-(line 282,col 44)",
        "(line 284,col 5)-(line 284,col 24)",
        "(line 285,col 5)-(line 285,col 28)",
        "(line 286,col 5)-(line 286,col 31)",
        "(line 287,col 5)-(line 287,col 33)",
        "(line 288,col 5)-(line 288,col 27)",
        "(line 289,col 5)-(line 289,col 26)",
        "(line 291,col 5)-(line 291,col 20)",
        "(line 292,col 5)-(line 292,col 20)",
        "(line 293,col 5)-(line 293,col 20)",
        "(line 294,col 5)-(line 294,col 20)",
        "(line 295,col 5)-(line 295,col 22)",
        "(line 296,col 5)-(line 296,col 23)",
        "(line 299,col 5)-(line 299,col 32)",
        "(line 300,col 5)-(line 300,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testOptimizeSwitch()",
      "begin_line": 303,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 28)",
        "(line 305,col 5)-(line 305,col 37)",
        "(line 306,col 5)-(line 306,col 36)",
        "(line 307,col 5)-(line 307,col 42)",
        "(line 308,col 5)-(line 308,col 53)",
        "(line 309,col 5)-(line 309,col 44)",
        "(line 310,col 5)-(line 310,col 44)",
        "(line 311,col 5)-(line 311,col 57)",
        "(line 312,col 5)-(line 313,col 25)",
        "(line 316,col 5)-(line 316,col 74)",
        "(line 317,col 5)-(line 317,col 57)",
        "(line 318,col 5)-(line 318,col 73)",
        "(line 320,col 5)-(line 321,col 54)",
        "(line 322,col 5)-(line 323,col 37)",
        "(line 324,col 5)-(line 324,col 71)",
        "(line 327,col 5)-(line 327,col 70)",
        "(line 330,col 5)-(line 330,col 50)",
        "(line 331,col 5)-(line 339,col 27)",
        "(line 342,col 5)-(line 342,col 52)",
        "(line 343,col 5)-(line 343,col 58)",
        "(line 344,col 5)-(line 344,col 46)",
        "(line 346,col 5)-(line 354,col 20)",
        "(line 355,col 5)-(line 363,col 12)",
        "(line 364,col 5)-(line 373,col 13)",
        "(line 374,col 5)-(line 379,col 13)",
        "(line 380,col 5)-(line 387,col 13)",
        "(line 388,col 5)-(line 396,col 20)",
        "(line 397,col 5)-(line 415,col 13)",
        "(line 416,col 5)-(line 424,col 20)",
        "(line 425,col 5)-(line 433,col 12)",
        "(line 434,col 5)-(line 444,col 13)",
        "(line 445,col 5)-(line 448,col 13)",
        "(line 449,col 5)-(line 453,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveNumber()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveVarGet1()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveVarGet2()",
      "begin_line": 464,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveNamespaceGet1()",
      "begin_line": 468,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 469,col 5)-(line 469,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveNamespaceGet2()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemovePrototypeGet1()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemovePrototypeGet2()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 482,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveAdd1()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveVar1()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveVar2()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 494,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign1()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign2()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 502,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign3()",
      "begin_line": 505,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 506,col 5)-(line 506,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign4()",
      "begin_line": 509,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign5()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 5)-(line 514,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveAssign6()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall1()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall2()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 526,col 5)-(line 526,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall3()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall4()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall5()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveCall6()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 5)-(line 542,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveThrow1()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveThrow2()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveThrow3()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 5)-(line 554,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveInControlStructure1()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveInControlStructure2()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 5)-(line 562,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveInControlStructure3()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 5)-(line 566,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook1()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook2()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook3()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook4()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 5)-(line 582,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook5()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 5)-(line 586,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook6()",
      "begin_line": 589,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 590,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook7()",
      "begin_line": 596,
      "end_line": 598,
      "comment": " precedents would require them.",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testHook8()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testShortCircuit1()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 605,col 5)-(line 605,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testShortCircuit2()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 5)-(line 609,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testShortCircuit3()",
      "begin_line": 612,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testShortCircuit4()",
      "begin_line": 616,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 5)-(line 617,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testComplex1()",
      "begin_line": 620,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 5)-(line 621,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testComplex2()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 625,col 5)-(line 625,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testComplex3()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testComplex4()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 5)-(line 633,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testComplex5()",
      "begin_line": 636,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveFunctionDeclaration1()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 5)-(line 642,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveFunctionDeclaration2()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 5)-(line 646,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoSimplifyFunctionArgs1()",
      "begin_line": 649,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 650,col 5)-(line 650,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoSimplifyFunctionArgs2()",
      "begin_line": 653,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 5)-(line 654,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoSimplifyFunctionArgs3()",
      "begin_line": 657,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveInherits1()",
      "begin_line": 661,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 662,col 5)-(line 662,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveInherits2()",
      "begin_line": 665,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 666,col 5)-(line 667,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveInherits3()",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 5)-(line 671,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNoRemoveInherits4()",
      "begin_line": 674,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 676,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveFromLabel1()",
      "begin_line": 679,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 5)-(line 680,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testRemoveFromLabel2()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "",
      "child_ranges": [
        "(line 684,col 5)-(line 684,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testCall1()",
      "begin_line": 687,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 688,col 5)-(line 688,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testCall2()",
      "begin_line": 691,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 692,col 5)-(line 692,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNew1()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 696,col 5)-(line 696,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testNew2()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 700,col 5)-(line 700,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testFoldAssign()",
      "begin_line": 703,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 704,col 5)-(line 704,col 20)",
        "(line 705,col 5)-(line 705,col 21)",
        "(line 706,col 5)-(line 706,col 24)",
        "(line 707,col 5)-(line 707,col 24)",
        "(line 708,col 5)-(line 708,col 35)",
        "(line 709,col 5)-(line 709,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testTryCatchFinally()",
      "begin_line": 712,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 713,col 5)-(line 713,col 46)",
        "(line 714,col 5)-(line 714,col 71)",
        "(line 715,col 5)-(line 715,col 53)",
        "(line 716,col 5)-(line 716,col 46)",
        "(line 717,col 5)-(line 718,col 47)",
        "(line 719,col 5)-(line 719,col 40)",
        "(line 720,col 5)-(line 720,col 59)",
        "(line 721,col 5)-(line 721,col 42)",
        "(line 722,col 5)-(line 722,col 72)",
        "(line 723,col 5)-(line 723,col 36)",
        "(line 724,col 5)-(line 724,col 34)",
        "(line 725,col 5)-(line 725,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testObjectLiteral()",
      "begin_line": 728,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 729,col 5)-(line 729,col 21)",
        "(line 730,col 5)-(line 730,col 24)",
        "(line 731,col 5)-(line 731,col 33)",
        "(line 732,col 5)-(line 732,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCodeTest.testArrayLiteral()",
      "begin_line": 735,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 736,col 5)-(line 736,col 21)",
        "(line 737,col 5)-(line 737,col 22)",
        "(line 738,col 5)-(line 738,col 22)",
        "(line 739,col 5)-(line 739,col 31)"
      ]
    }
  ]
}