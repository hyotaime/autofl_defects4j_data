{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/LiveVariableAnalysisTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LiveVariableAnalysisTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 377,
      "comment": "\n * Tests for {@link LiveVariablesAnalysis}. Test cases are snippets of a\n * function and assertions are made at the instruction labeled with {@code X}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "liveness"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testStraightLine()",
      "begin_line": 36,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 42)",
        "(line 39,col 5)-(line 39,col 41)",
        "(line 40,col 5)-(line 40,col 43)",
        "(line 41,col 5)-(line 41,col 44)",
        "(line 42,col 5)-(line 42,col 48)",
        "(line 43,col 5)-(line 43,col 41)",
        "(line 44,col 5)-(line 44,col 45)",
        "(line 45,col 5)-(line 45,col 44)",
        "(line 46,col 5)-(line 46,col 43)",
        "(line 47,col 5)-(line 47,col 47)",
        "(line 48,col 5)-(line 48,col 48)",
        "(line 49,col 5)-(line 49,col 46)",
        "(line 50,col 5)-(line 50,col 59)",
        "(line 51,col 5)-(line 51,col 52)",
        "(line 52,col 5)-(line 52,col 51)",
        "(line 53,col 5)-(line 53,col 52)",
        "(line 54,col 5)-(line 54,col 45)",
        "(line 55,col 5)-(line 55,col 50)",
        "(line 56,col 5)-(line 56,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testProperties()",
      "begin_line": 59,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 45)",
        "(line 64,col 5)-(line 64,col 50)",
        "(line 65,col 5)-(line 65,col 52)",
        "(line 68,col 5)-(line 68,col 53)",
        "(line 70,col 5)-(line 70,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testConditions()",
      "begin_line": 73,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 48)",
        "(line 76,col 5)-(line 76,col 52)",
        "(line 77,col 5)-(line 77,col 52)",
        "(line 78,col 5)-(line 78,col 55)",
        "(line 79,col 5)-(line 79,col 55)",
        "(line 82,col 5)-(line 82,col 59)",
        "(line 83,col 5)-(line 83,col 62)",
        "(line 86,col 5)-(line 86,col 64)",
        "(line 87,col 5)-(line 87,col 67)",
        "(line 88,col 5)-(line 88,col 62)",
        "(line 89,col 5)-(line 89,col 62)",
        "(line 90,col 5)-(line 90,col 65)",
        "(line 91,col 5)-(line 91,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testArrays()",
      "begin_line": 94,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 43)",
        "(line 96,col 5)-(line 96,col 45)",
        "(line 97,col 5)-(line 97,col 56)",
        "(line 98,col 5)-(line 98,col 50)",
        "(line 99,col 5)-(line 99,col 53)",
        "(line 102,col 5)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testTwoPaths()",
      "begin_line": 105,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 63)",
        "(line 110,col 5)-(line 110,col 63)",
        "(line 111,col 5)-(line 111,col 63)",
        "(line 114,col 5)-(line 114,col 65)",
        "(line 117,col 5)-(line 117,col 66)",
        "(line 120,col 5)-(line 120,col 58)",
        "(line 121,col 5)-(line 121,col 61)",
        "(line 124,col 5)-(line 124,col 55)",
        "(line 125,col 5)-(line 125,col 58)",
        "(line 129,col 5)-(line 129,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testThreePaths()",
      "begin_line": 132,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 68)",
        "(line 134,col 5)-(line 134,col 68)",
        "(line 135,col 5)-(line 135,col 68)",
        "(line 136,col 5)-(line 136,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testHooks()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 50)",
        "(line 145,col 5)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testForLoops()",
      "begin_line": 148,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 68)",
        "(line 151,col 5)-(line 151,col 62)",
        "(line 152,col 5)-(line 152,col 62)",
        "(line 153,col 5)-(line 153,col 60)",
        "(line 156,col 5)-(line 156,col 60)",
        "(line 157,col 5)-(line 157,col 55)",
        "(line 159,col 5)-(line 159,col 56)",
        "(line 166,col 5)-(line 166,col 66)",
        "(line 169,col 5)-(line 169,col 56)",
        "(line 170,col 5)-(line 170,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testNestedLoops()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 62)",
        "(line 175,col 5)-(line 175,col 72)",
        "(line 176,col 5)-(line 176,col 66)",
        "(line 177,col 5)-(line 177,col 66)",
        "(line 178,col 5)-(line 178,col 65)",
        "(line 179,col 5)-(line 180,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testSwitches()",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 52)",
        "(line 185,col 5)-(line 185,col 66)",
        "(line 186,col 5)-(line 186,col 74)",
        "(line 187,col 5)-(line 188,col 76)",
        "(line 190,col 5)-(line 190,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testAssignAndReadInCondition()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 73)",
        "(line 198,col 5)-(line 198,col 60)",
        "(line 199,col 5)-(line 199,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testParam()",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 49)",
        "(line 205,col 5)-(line 205,col 53)",
        "(line 206,col 5)-(line 206,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testExpressionInForIn()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testArgumentsArray()",
      "begin_line": 213,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 44)",
        "(line 217,col 5)-(line 217,col 44)",
        "(line 218,col 5)-(line 218,col 52)",
        "(line 219,col 5)-(line 219,col 52)",
        "(line 220,col 5)-(line 220,col 49)",
        "(line 221,col 5)-(line 221,col 49)",
        "(line 222,col 5)-(line 222,col 48)",
        "(line 223,col 5)-(line 223,col 48)",
        "(line 224,col 5)-(line 224,col 59)",
        "(line 225,col 5)-(line 225,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testTryCatchFinally()",
      "begin_line": 228,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 60)",
        "(line 230,col 5)-(line 230,col 75)",
        "(line 233,col 5)-(line 234,col 56)",
        "(line 235,col 5)-(line 235,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testForInAssignment()",
      "begin_line": 238,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 71)",
        "(line 241,col 5)-(line 241,col 74)",
        "(line 242,col 5)-(line 242,col 71)",
        "(line 243,col 5)-(line 243,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testExceptionThrowingAssignments()",
      "begin_line": 246,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 69)",
        "(line 248,col 5)-(line 248,col 66)",
        "(line 249,col 5)-(line 249,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testInnerFunctions()",
      "begin_line": 252,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 54)",
        "(line 254,col 5)-(line 254,col 52)",
        "(line 255,col 5)-(line 255,col 72)",
        "(line 258,col 5)-(line 258,col 71)",
        "(line 259,col 5)-(line 259,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testEscaped()",
      "begin_line": 262,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 50)",
        "(line 264,col 5)-(line 264,col 60)",
        "(line 265,col 5)-(line 265,col 64)",
        "(line 266,col 5)-(line 266,col 74)",
        "(line 267,col 5)-(line 267,col 43)",
        "(line 268,col 5)-(line 268,col 60)",
        "(line 269,col 5)-(line 269,col 73)",
        "(line 270,col 5)-(line 270,col 54)",
        "(line 271,col 5)-(line 271,col 67)",
        "(line 272,col 5)-(line 272,col 63)",
        "(line 275,col 5)-(line 275,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testEscapedLiveness()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.testBug1449316()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertLiveBeforeX(java.lang.String, java.lang.String)",
      "begin_line": 286,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 287,col 5)-(line 288,col 29)",
        "(line 289,col 5)-(line 289,col 63)",
        "(line 290,col 5)-(line 291,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertLiveAfterX(java.lang.String, java.lang.String)",
      "begin_line": 294,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 296,col 29)",
        "(line 297,col 5)-(line 297,col 73)",
        "(line 298,col 5)-(line 299,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertNotLiveAfterX(java.lang.String, java.lang.String)",
      "begin_line": 302,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 303,col 5)-(line 304,col 29)",
        "(line 305,col 5)-(line 305,col 73)",
        "(line 306,col 5)-(line 307,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertNotLiveBeforeX(java.lang.String, java.lang.String)",
      "begin_line": 310,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 312,col 29)",
        "(line 313,col 5)-(line 313,col 73)",
        "(line 314,col 5)-(line 315,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.getFlowStateAtX(java.lang.String)",
      "begin_line": 318,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 36)",
        "(line 321,col 5)-(line 322,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.getFlowStateAtX(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 325,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 331,col 5)",
        "(line 332,col 5)-(line 338,col 5)",
        "(line 339,col 5)-(line 339,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertEscaped(java.lang.String, java.lang.String)",
      "begin_line": 342,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 347,col 5)",
        "(line 348,col 5)-(line 348,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.assertNotEscaped(java.lang.String, java.lang.String)",
      "begin_line": 351,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariableAnalysisTest.computeLiveness(java.lang.String)",
      "begin_line": 357,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 39)",
        "(line 359,col 5)-(line 359,col 52)",
        "(line 360,col 5)-(line 360,col 62)",
        "(line 361,col 5)-(line 361,col 34)",
        "(line 362,col 5)-(line 362,col 60)",
        "(line 363,col 5)-(line 363,col 60)",
        "(line 364,col 5)-(line 364,col 44)",
        "(line 365,col 5)-(line 365,col 43)",
        "(line 366,col 5)-(line 366,col 46)",
        "(line 367,col 5)-(line 368,col 44)",
        "(line 369,col 5)-(line 369,col 77)",
        "(line 370,col 5)-(line 370,col 25)",
        "(line 371,col 5)-(line 371,col 46)",
        "(line 372,col 5)-(line 373,col 56)",
        "(line 374,col 5)-(line 374,col 23)",
        "(line 375,col 5)-(line 375,col 20)"
      ]
    }
  ]
}