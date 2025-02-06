{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/FunctionRewriterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionRewriterTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 205,
      "comment": "\n * Tests for {@link FunctionRewriter}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "RETURNARG_HELPER"
      ],
      "begin_line": 25,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_HELPER"
      ],
      "begin_line": 29,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SET_HELPER"
      ],
      "begin_line": 33,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_HELPER"
      ],
      "begin_line": 39,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IDENTITY_HELPER"
      ],
      "begin_line": 43,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.setUp()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.getNumRepetitions()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceReturnConst1()",
      "begin_line": 66,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 71)",
        "(line 68,col 5)-(line 68,col 35)",
        "(line 69,col 5)-(line 72,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceReturnConst2()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceReturnConst3()",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 68)",
        "(line 81,col 5)-(line 81,col 35)",
        "(line 82,col 5)-(line 85,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceGetter1()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 70)",
        "(line 90,col 5)-(line 90,col 35)",
        "(line 91,col 5)-(line 94,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceGetter2()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceSetter1()",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 68)",
        "(line 103,col 5)-(line 103,col 35)",
        "(line 104,col 5)-(line 107,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceSetter2()",
      "begin_line": 110,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 72)",
        "(line 112,col 5)-(line 112,col 35)",
        "(line 113,col 5)-(line 116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceSetter3()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceSetter4()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 125,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceEmptyFunction1()",
      "begin_line": 128,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 54)",
        "(line 130,col 5)-(line 130,col 35)",
        "(line 131,col 5)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceEmptyFunction2()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceEmptyFunction3()",
      "begin_line": 141,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 46)",
        "(line 143,col 5)-(line 143,col 35)",
        "(line 144,col 5)-(line 147,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceIdentityFunction1()",
      "begin_line": 152,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 63)",
        "(line 154,col 5)-(line 154,col 35)",
        "(line 155,col 5)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testReplaceIdentityFunction2()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.testIssue538()",
      "begin_line": 165,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 179,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.checkCompilesTo(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 182,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 50)",
        "(line 187,col 5)-(line 187,col 55)",
        "(line 189,col 5)-(line 189,col 39)",
        "(line 191,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriterTest.checkCompilesToSame(java.lang.String, int)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 47)"
      ]
    }
  ]
}