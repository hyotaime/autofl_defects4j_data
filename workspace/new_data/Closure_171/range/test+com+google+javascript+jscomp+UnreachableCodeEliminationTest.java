{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/UnreachableCodeEliminationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnreachableCodeEliminationTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 432,
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
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 18)",
        "(line 33,col 5)-(line 33,col 31)",
        "(line 34,col 5)-(line 34,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUnreachableCode()",
      "begin_line": 37,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 42,col 35)",
        "(line 45,col 5)-(line 48,col 38)",
        "(line 51,col 5)-(line 52,col 71)",
        "(line 55,col 5)-(line 60,col 36)",
        "(line 63,col 5)-(line 64,col 53)",
        "(line 67,col 5)-(line 68,col 37)",
        "(line 71,col 5)-(line 72,col 70)",
        "(line 75,col 5)-(line 76,col 69)",
        "(line 79,col 5)-(line 83,col 35)",
        "(line 86,col 5)-(line 87,col 70)",
        "(line 90,col 5)-(line 91,col 53)",
        "(line 93,col 5)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessNameStatements()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 19)",
        "(line 99,col 5)-(line 99,col 21)",
        "(line 100,col 5)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessStrings()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testNoRemoveUseStrict()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testNoRemoveUselessNameStatements()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 33)",
        "(line 113,col 5)-(line 113,col 19)",
        "(line 114,col 5)-(line 114,col 21)",
        "(line 115,col 5)-(line 115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveDo()",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 79)",
        "(line 120,col 5)-(line 121,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemoveUselessLiteralValueStatements()",
      "begin_line": 124,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 22)",
        "(line 126,col 5)-(line 126,col 22)",
        "(line 127,col 5)-(line 127,col 26)",
        "(line 128,col 5)-(line 128,col 39)",
        "(line 129,col 5)-(line 129,col 48)",
        "(line 130,col 5)-(line 130,col 37)",
        "(line 131,col 5)-(line 132,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testConditionalDeadCode()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 137,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testSwitchCase()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 60)",
        "(line 143,col 5)-(line 144,col 79)",
        "(line 145,col 5)-(line 146,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testTryCatchFinally()",
      "begin_line": 149,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 46)",
        "(line 151,col 5)-(line 151,col 71)",
        "(line 152,col 5)-(line 152,col 74)",
        "(line 153,col 5)-(line 154,col 58)",
        "(line 155,col 5)-(line 156,col 39)",
        "(line 157,col 5)-(line 157,col 46)",
        "(line 158,col 5)-(line 158,col 43)",
        "(line 159,col 5)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testRemovalRequiresRedeclaration()",
      "begin_line": 163,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 71)",
        "(line 165,col 5)-(line 166,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testAssignPropertyOnCreatedObject()",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 30)",
        "(line 171,col 5)-(line 171,col 27)",
        "(line 172,col 5)-(line 172,col 31)",
        "(line 173,col 5)-(line 173,col 34)",
        "(line 174,col 5)-(line 174,col 35)",
        "(line 176,col 5)-(line 176,col 30)",
        "(line 177,col 5)-(line 177,col 67)",
        "(line 178,col 5)-(line 178,col 70)",
        "(line 179,col 5)-(line 179,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUselessUnconditionalReturn()",
      "begin_line": 182,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 61)",
        "(line 184,col 5)-(line 184,col 73)",
        "(line 185,col 5)-(line 185,col 80)",
        "(line 186,col 5)-(line 187,col 58)",
        "(line 188,col 5)-(line 188,col 44)",
        "(line 190,col 5)-(line 191,col 52)",
        "(line 192,col 5)-(line 192,col 68)",
        "(line 193,col 5)-(line 194,col 55)",
        "(line 195,col 5)-(line 196,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUselessUnconditionalContinue()",
      "begin_line": 199,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 48)",
        "(line 201,col 5)-(line 201,col 48)",
        "(line 203,col 5)-(line 203,col 71)",
        "(line 204,col 5)-(line 205,col 51)",
        "(line 207,col 5)-(line 207,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testUselessUnconditonalBreak()",
      "begin_line": 210,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 71)",
        "(line 212,col 5)-(line 213,col 56)",
        "(line 214,col 5)-(line 215,col 53)",
        "(line 217,col 5)-(line 217,col 77)",
        "(line 218,col 5)-(line 218,col 77)",
        "(line 221,col 5)-(line 222,col 42)",
        "(line 224,col 5)-(line 224,col 71)",
        "(line 225,col 5)-(line 226,col 53)",
        "(line 228,col 5)-(line 229,col 53)",
        "(line 232,col 5)-(line 232,col 39)",
        "(line 233,col 5)-(line 233,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIteratedRemoval()",
      "begin_line": 237,
      "end_line": 263,
      "comment": " These tests all require the analysis to go to a fixpoint in order to pass",
      "child_ranges": [
        "(line 238,col 5)-(line 239,col 57)",
        "(line 241,col 5)-(line 243,col 75)",
        "(line 245,col 5)-(line 252,col 70)",
        "(line 254,col 5)-(line 255,col 30)",
        "(line 257,col 5)-(line 262,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue311()",
      "begin_line": 265,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 285,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428a()",
      "begin_line": 288,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 302,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428b()",
      "begin_line": 305,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 322,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428c()",
      "begin_line": 325,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 342,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_continue()",
      "begin_line": 345,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 359,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_return()",
      "begin_line": 362,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 389,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue4177428_multifinally()",
      "begin_line": 392,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 393,col 5)-(line 403,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue5215541_deadVarDeclar()",
      "begin_line": 406,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 31)",
        "(line 408,col 5)-(line 408,col 41)",
        "(line 409,col 5)-(line 409,col 39)",
        "(line 410,col 5)-(line 410,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testForInLoop()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testDontRemoveBreakInTryFinally()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testDontRemoveBreakInTryFinallySwitch()",
      "begin_line": 421,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 423,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeEliminationTest.testIssue1001()",
      "begin_line": 426,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 428,col 46)",
        "(line 429,col 5)-(line 430,col 46)"
      ]
    }
  ]
}