{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/UnreachableCodeEliminationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnreachableCodeEliminationTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 462,
      "comment": "\n * Test for {@link UnreachableCodeElimination}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "removeNoOpStatements"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 26,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 5)-(line 28,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.setUp()",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 18)",
        "(line 33,col 5)-(line 33,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUnreachableCode()",
      "begin_line": 36,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 41,col 35)",
        "(line 44,col 5)-(line 47,col 38)",
        "(line 50,col 5)-(line 51,col 71)",
        "(line 54,col 5)-(line 59,col 36)",
        "(line 62,col 5)-(line 63,col 53)",
        "(line 66,col 5)-(line 67,col 37)",
        "(line 70,col 5)-(line 71,col 70)",
        "(line 74,col 5)-(line 75,col 69)",
        "(line 78,col 5)-(line 82,col 35)",
        "(line 85,col 5)-(line 86,col 70)",
        "(line 89,col 5)-(line 90,col 53)",
        "(line 92,col 5)-(line 93,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessNameStatements()",
      "begin_line": 96,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 19)",
        "(line 98,col 5)-(line 98,col 21)",
        "(line 99,col 5)-(line 99,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessStrings()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testNoRemoveUseStrict()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testNoRemoveUselessNameStatements()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 33)",
        "(line 112,col 5)-(line 112,col 19)",
        "(line 113,col 5)-(line 113,col 21)",
        "(line 114,col 5)-(line 114,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveDo()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 79)",
        "(line 119,col 5)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessLiteralValueStatements()",
      "begin_line": 123,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 22)",
        "(line 125,col 5)-(line 125,col 22)",
        "(line 126,col 5)-(line 126,col 26)",
        "(line 127,col 5)-(line 127,col 39)",
        "(line 128,col 5)-(line 128,col 48)",
        "(line 129,col 5)-(line 129,col 37)",
        "(line 130,col 5)-(line 131,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testConditionalDeadCode()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 136,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testSwitchCase()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 141,col 60)",
        "(line 142,col 5)-(line 143,col 79)",
        "(line 144,col 5)-(line 145,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testTryCatchFinally()",
      "begin_line": 148,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 46)",
        "(line 150,col 5)-(line 150,col 71)",
        "(line 151,col 5)-(line 151,col 74)",
        "(line 152,col 5)-(line 153,col 58)",
        "(line 154,col 5)-(line 155,col 38)",
        "(line 156,col 5)-(line 156,col 46)",
        "(line 157,col 5)-(line 157,col 43)",
        "(line 158,col 5)-(line 159,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemovalRequiresRedeclaration()",
      "begin_line": 162,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 71)",
        "(line 164,col 5)-(line 165,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testAssignPropertyOnCreatedObject()",
      "begin_line": 168,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 30)",
        "(line 170,col 5)-(line 170,col 27)",
        "(line 171,col 5)-(line 171,col 31)",
        "(line 172,col 5)-(line 172,col 34)",
        "(line 173,col 5)-(line 173,col 35)",
        "(line 175,col 5)-(line 175,col 30)",
        "(line 176,col 5)-(line 176,col 67)",
        "(line 177,col 5)-(line 177,col 70)",
        "(line 178,col 5)-(line 178,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUselessUnconditionalReturn()",
      "begin_line": 181,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 61)",
        "(line 183,col 5)-(line 183,col 73)",
        "(line 184,col 5)-(line 184,col 80)",
        "(line 185,col 5)-(line 186,col 58)",
        "(line 187,col 5)-(line 187,col 44)",
        "(line 189,col 5)-(line 190,col 52)",
        "(line 191,col 5)-(line 191,col 68)",
        "(line 192,col 5)-(line 193,col 55)",
        "(line 194,col 5)-(line 195,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUnlessUnconditionalContinue()",
      "begin_line": 198,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 48)",
        "(line 200,col 5)-(line 200,col 48)",
        "(line 202,col 5)-(line 202,col 71)",
        "(line 203,col 5)-(line 204,col 51)",
        "(line 206,col 5)-(line 206,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUnlessUnconditonalBreak()",
      "begin_line": 209,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 71)",
        "(line 211,col 5)-(line 212,col 56)",
        "(line 213,col 5)-(line 214,col 53)",
        "(line 216,col 5)-(line 216,col 77)",
        "(line 217,col 5)-(line 217,col 77)",
        "(line 220,col 5)-(line 221,col 42)",
        "(line 223,col 5)-(line 223,col 71)",
        "(line 224,col 5)-(line 225,col 53)",
        "(line 227,col 5)-(line 228,col 53)",
        "(line 231,col 5)-(line 231,col 39)",
        "(line 232,col 5)-(line 232,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testCascadedRemovalOfUnlessUnconditonalJumps()",
      "begin_line": 235,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 237,col 64)",
        "(line 239,col 5)-(line 240,col 57)",
        "(line 242,col 5)-(line 244,col 79)",
        "(line 245,col 5)-(line 247,col 72)",
        "(line 249,col 5)-(line 250,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue311()",
      "begin_line": 253,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 273,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428a()",
      "begin_line": 276,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 303,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428b()",
      "begin_line": 306,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 340,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428c()",
      "begin_line": 343,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 376,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_continue()",
      "begin_line": 379,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 380,col 5)-(line 406,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_return()",
      "begin_line": 409,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 435,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_multifinally()",
      "begin_line": 438,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 449,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue5215541_deadVarDeclar()",
      "begin_line": 452,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 31)",
        "(line 454,col 5)-(line 454,col 41)",
        "(line 455,col 5)-(line 455,col 39)",
        "(line 456,col 5)-(line 456,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testForInLoop()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 35)"
      ]
    }
  ]
}