{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CheckUnreachableCodeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckUnreachableCodeTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 25,
      "end_line": 215,
      "comment": "\n * Tests for {@link CheckUnreachableCode}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 26,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 28,col 5)-(line 29,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testCorrectSimple()",
      "begin_line": 32,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 22)",
        "(line 34,col 5)-(line 34,col 26)",
        "(line 35,col 5)-(line 35,col 34)",
        "(line 36,col 5)-(line 36,col 37)",
        "(line 37,col 5)-(line 37,col 56)",
        "(line 38,col 5)-(line 38,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testIncorrectSimple()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 55)",
        "(line 43,col 5)-(line 43,col 60)",
        "(line 44,col 5)-(line 44,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testCorrectIfReturns()",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 51)",
        "(line 49,col 5)-(line 49,col 58)",
        "(line 50,col 5)-(line 50,col 77)",
        "(line 51,col 5)-(line 52,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testInCorrectIfReturns()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 57,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testCorrectSwitchReturn()",
      "begin_line": 60,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 76)",
        "(line 62,col 5)-(line 63,col 64)",
        "(line 64,col 5)-(line 65,col 59)",
        "(line 66,col 5)-(line 67,col 50)",
        "(line 68,col 5)-(line 69,col 58)",
        "(line 70,col 5)-(line 71,col 66)",
        "(line 72,col 5)-(line 73,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testInCorrectSwitchReturn()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 78,col 67)",
        "(line 79,col 5)-(line 80,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testCorrectLoopBreaksAndContinues()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 42)",
        "(line 85,col 5)-(line 85,col 45)",
        "(line 86,col 5)-(line 86,col 41)",
        "(line 87,col 5)-(line 87,col 44)",
        "(line 88,col 5)-(line 88,col 45)",
        "(line 89,col 5)-(line 89,col 48)",
        "(line 90,col 5)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testInCorrectLoopBreaksAndContinues()",
      "begin_line": 93,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 57)",
        "(line 95,col 5)-(line 95,col 61)",
        "(line 96,col 5)-(line 96,col 57)",
        "(line 97,col 5)-(line 97,col 60)",
        "(line 98,col 5)-(line 98,col 61)",
        "(line 99,col 5)-(line 99,col 64)",
        "(line 100,col 5)-(line 100,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testUncheckedWhileInDo()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testUncheckedConditionInFor()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testFunctionDeclaration()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testVarDeclaration()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 60)",
        "(line 119,col 5)-(line 119,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testReachableTryCatchFinally()",
      "begin_line": 122,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 37)",
        "(line 124,col 5)-(line 124,col 47)",
        "(line 125,col 5)-(line 125,col 48)",
        "(line 126,col 5)-(line 126,col 63)",
        "(line 127,col 5)-(line 127,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testUnreachableCatch()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testSpuriousBreak()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testInstanceOfThrowsException()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testFalseCondition()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 39)",
        "(line 145,col 5)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testUnreachableLoop()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testInfiniteLoop()",
      "begin_line": 152,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 47)",
        "(line 156,col 5)-(line 156,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.testSuppression()",
      "begin_line": 159,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 39)",
        "(line 162,col 5)-(line 166,col 25)",
        "(line 168,col 5)-(line 172,col 42)",
        "(line 174,col 5)-(line 178,col 42)",
        "(line 180,col 5)-(line 185,col 44)",
        "(line 187,col 5)-(line 193,col 31)",
        "(line 195,col 5)-(line 201,col 31)",
        "(line 203,col 5)-(line 209,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCodeTest.assertUnreachable(java.lang.String)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 56)"
      ]
    }
  ]
}