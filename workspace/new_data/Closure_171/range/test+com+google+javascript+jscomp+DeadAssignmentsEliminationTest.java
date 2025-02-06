{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/DeadAssignmentsEliminationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeadAssignmentsEliminationTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 534,
      "comment": "\n * Tests for {@link DeadAssignmentsElimination}.\n *\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.DeadAssignmentsEliminationTest()",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 5)-(line 28,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.setUp()",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 36,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 44,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.Anonymous-89261888-6402-4048-a8af-aee809f148a2.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 42,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.getNumRepetitions()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testSimple()",
      "begin_line": 52,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 41)",
        "(line 54,col 5)-(line 54,col 45)",
        "(line 55,col 5)-(line 55,col 50)",
        "(line 56,col 5)-(line 56,col 59)",
        "(line 59,col 5)-(line 59,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testLoops()",
      "begin_line": 62,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 45)",
        "(line 64,col 5)-(line 64,col 61)",
        "(line 65,col 5)-(line 66,col 45)",
        "(line 67,col 5)-(line 68,col 43)",
        "(line 69,col 5)-(line 70,col 47)",
        "(line 71,col 5)-(line 72,col 47)",
        "(line 73,col 5)-(line 74,col 45)",
        "(line 75,col 5)-(line 76,col 40)",
        "(line 77,col 5)-(line 77,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testMultiPaths()",
      "begin_line": 80,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 57)",
        "(line 82,col 5)-(line 82,col 77)",
        "(line 83,col 5)-(line 83,col 62)",
        "(line 84,col 5)-(line 85,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testUsedAsConditions()",
      "begin_line": 88,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 59)",
        "(line 90,col 5)-(line 90,col 53)",
        "(line 91,col 5)-(line 91,col 63)",
        "(line 92,col 5)-(line 92,col 66)",
        "(line 93,col 5)-(line 93,col 61)",
        "(line 94,col 5)-(line 94,col 65)",
        "(line 95,col 5)-(line 95,col 48)",
        "(line 97,col 5)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testUsedAsConditionsInSwitchStatements()",
      "begin_line": 101,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 60)",
        "(line 103,col 5)-(line 104,col 44)",
        "(line 106,col 5)-(line 106,col 79)",
        "(line 108,col 5)-(line 109,col 74)",
        "(line 110,col 5)-(line 111,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentInReturn()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 58)",
        "(line 116,col 5)-(line 116,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentSamples()",
      "begin_line": 119,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 29)",
        "(line 122,col 5)-(line 122,col 53)",
        "(line 123,col 5)-(line 123,col 45)",
        "(line 124,col 5)-(line 124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentInArgs()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 55)",
        "(line 129,col 5)-(line 129,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignAndReadInCondition()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n   * BUG #1358904\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 56)",
        "(line 137,col 5)-(line 138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testParameters()",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 143,col 39)",
        "(line 144,col 5)-(line 144,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testErrorHandling()",
      "begin_line": 147,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 55)",
        "(line 149,col 5)-(line 150,col 41)",
        "(line 151,col 5)-(line 152,col 44)",
        "(line 153,col 5)-(line 153,col 63)",
        "(line 154,col 5)-(line 154,col 63)",
        "(line 155,col 5)-(line 156,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testDeadVarDeclarations()",
      "begin_line": 159,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 27)",
        "(line 162,col 5)-(line 162,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testGlobal()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testInnerFunctions()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 172,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testInnerFunctions2()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testSelfReAssignment()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testSelfIncrement()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentOp()",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentOpUsedAsLhs()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentOpUsedAsCondition()",
      "begin_line": 198,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 200,col 43)",
        "(line 202,col 5)-(line 203,col 49)",
        "(line 206,col 5)-(line 206,col 52)",
        "(line 208,col 5)-(line 208,col 38)",
        "(line 209,col 5)-(line 209,col 38)",
        "(line 210,col 5)-(line 210,col 41)",
        "(line 211,col 5)-(line 211,col 61)",
        "(line 213,col 5)-(line 213,col 38)",
        "(line 214,col 5)-(line 214,col 38)",
        "(line 215,col 5)-(line 215,col 41)",
        "(line 216,col 5)-(line 216,col 61)",
        "(line 218,col 5)-(line 218,col 58)",
        "(line 219,col 5)-(line 219,col 58)",
        "(line 220,col 5)-(line 220,col 66)",
        "(line 221,col 5)-(line 221,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testDeadIncrement()",
      "begin_line": 224,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 47)",
        "(line 227,col 5)-(line 227,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testDeadButAlivePartiallyWithinTheExpression()",
      "begin_line": 230,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 232,col 53)",
        "(line 233,col 5)-(line 234,col 63)",
        "(line 235,col 5)-(line 236,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testMutipleDeadAssignmentsButAlivePartiallyWithinTheExpression()",
      "begin_line": 239,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 243,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testDeadPartiallyWithinTheExpression()",
      "begin_line": 247,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentChain()",
      "begin_line": 253,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 255,col 35)",
        "(line 256,col 5)-(line 257,col 65)",
        "(line 258,col 5)-(line 259,col 69)",
        "(line 260,col 5)-(line 261,col 69)",
        "(line 262,col 5)-(line 263,col 77)",
        "(line 264,col 5)-(line 264,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignmentOpChain()",
      "begin_line": 267,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 269,col 47)",
        "(line 270,col 5)-(line 271,col 67)",
        "(line 272,col 5)-(line 273,col 67)",
        "(line 274,col 5)-(line 275,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIncDecInSubExpressions()",
      "begin_line": 278,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 39)",
        "(line 280,col 5)-(line 280,col 39)",
        "(line 281,col 5)-(line 281,col 39)",
        "(line 282,col 5)-(line 282,col 39)",
        "(line 284,col 5)-(line 284,col 46)",
        "(line 285,col 5)-(line 285,col 46)",
        "(line 286,col 5)-(line 286,col 46)",
        "(line 287,col 5)-(line 287,col 46)",
        "(line 289,col 5)-(line 289,col 43)",
        "(line 290,col 5)-(line 290,col 43)",
        "(line 292,col 5)-(line 292,col 43)",
        "(line 293,col 5)-(line 293,col 43)",
        "(line 295,col 5)-(line 295,col 43)",
        "(line 296,col 5)-(line 296,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testNestedReassignments()",
      "begin_line": 299,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 49)",
        "(line 301,col 5)-(line 301,col 52)",
        "(line 304,col 5)-(line 304,col 49)",
        "(line 305,col 5)-(line 305,col 49)",
        "(line 307,col 5)-(line 307,col 59)",
        "(line 308,col 5)-(line 308,col 64)",
        "(line 309,col 5)-(line 309,col 57)",
        "(line 310,col 5)-(line 310,col 57)",
        "(line 313,col 5)-(line 313,col 59)",
        "(line 314,col 5)-(line 314,col 64)",
        "(line 315,col 5)-(line 316,col 31)",
        "(line 317,col 5)-(line 318,col 31)",
        "(line 320,col 5)-(line 320,col 54)",
        "(line 321,col 5)-(line 321,col 55)",
        "(line 324,col 5)-(line 324,col 64)",
        "(line 325,col 5)-(line 325,col 71)",
        "(line 326,col 5)-(line 326,col 64)",
        "(line 327,col 5)-(line 327,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIncrementalReassignmentInForLoops()",
      "begin_line": 330,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 37)",
        "(line 332,col 5)-(line 332,col 33)",
        "(line 333,col 5)-(line 333,col 38)",
        "(line 334,col 5)-(line 334,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIdentityAssignments()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.inFunction(java.lang.String)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.inFunction(java.lang.String, java.lang.String)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 347,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testBug8730257()",
      "begin_line": 350,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 361,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testAssignToExtern()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297a()",
      "begin_line": 368,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 369,col 5)-(line 372,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297b()",
      "begin_line": 375,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 383,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297c()",
      "begin_line": 386,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 394,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297d()",
      "begin_line": 397,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 403,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297e()",
      "begin_line": 406,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 412,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297f()",
      "begin_line": 415,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 416,col 5)-(line 421,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297g()",
      "begin_line": 424,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 433,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue297h()",
      "begin_line": 436,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 445,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testInExpression1()",
      "begin_line": 449,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 65)",
        "(line 451,col 5)-(line 451,col 65)",
        "(line 452,col 5)-(line 452,col 73)",
        "(line 453,col 5)-(line 453,col 79)",
        "(line 454,col 5)-(line 454,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testInExpression2()",
      "begin_line": 457,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 462,col 59)",
        "(line 464,col 5)-(line 466,col 25)",
        "(line 468,col 5)-(line 468,col 54)",
        "(line 470,col 5)-(line 472,col 40)",
        "(line 474,col 5)-(line 474,col 56)",
        "(line 476,col 5)-(line 478,col 36)",
        "(line 480,col 5)-(line 480,col 55)",
        "(line 482,col 5)-(line 484,col 43)",
        "(line 488,col 5)-(line 488,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue384a()",
      "begin_line": 491,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 498,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue384b()",
      "begin_line": 501,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 505,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue384c()",
      "begin_line": 508,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 512,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testIssue384d()",
      "begin_line": 515,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 519,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsEliminationTest.testForIn()",
      "begin_line": 522,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 523,col 5)-(line 523,col 55)",
        "(line 524,col 5)-(line 525,col 72)",
        "(line 526,col 5)-(line 527,col 73)",
        "(line 532,col 5)-(line 532,col 68)"
      ]
    }
  ]
}