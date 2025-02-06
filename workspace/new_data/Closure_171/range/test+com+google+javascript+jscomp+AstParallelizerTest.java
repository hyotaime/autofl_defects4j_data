{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/AstParallelizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstParallelizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 149,
      "comment": "\n * Unit tests for {@link AstParallelizer}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HOLDER"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.testNoSplit()",
      "begin_line": 35,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 27)",
        "(line 37,col 5)-(line 37,col 37)",
        "(line 38,col 5)-(line 38,col 37)",
        "(line 39,col 5)-(line 39,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.testSplitNamedFuntion()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 45,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.testSplitNamedFuntionWithArgs()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 52,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.disable_testSplitAnonFuntion()",
      "begin_line": 57,
      "end_line": 61,
      "comment": " nameless function statements, which does not parse.",
      "child_ranges": [
        "(line 58,col 5)-(line 60,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.disable_testSplitInplaceCall()",
      "begin_line": 65,
      "end_line": 69,
      "comment": " nameless function statements, which does not parse.",
      "child_ranges": [
        "(line 66,col 5)-(line 68,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.disable_testSplitMupltiFuntions()",
      "begin_line": 73,
      "end_line": 83,
      "comment": " nameless function statements, which does not parse.",
      "child_ranges": [
        "(line 74,col 5)-(line 82,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.disable_testInnerFunctions()",
      "begin_line": 87,
      "end_line": 91,
      "comment": " nameless function statements, which does not parse.",
      "child_ranges": [
        "(line 88,col 5)-(line 90,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.testSplitFileLevel()",
      "begin_line": 93,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 58)",
        "(line 95,col 5)-(line 96,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.splitFunctions(java.lang.String, java.lang.String...)",
      "begin_line": 104,
      "end_line": 120,
      "comment": "\n   * Splits at function level with {@link AstParallelizer#split()}, verify the\n   * output matches what is expected and then verify\n   * {@link AstParallelizer#join()} can reverse the whole process.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 39)",
        "(line 106,col 5)-(line 106,col 50)",
        "(line 107,col 5)-(line 107,col 37)",
        "(line 108,col 5)-(line 109,col 72)",
        "(line 110,col 5)-(line 110,col 45)",
        "(line 111,col 5)-(line 111,col 47)",
        "(line 112,col 5)-(line 112,col 14)",
        "(line 113,col 5)-(line 116,col 5)",
        "(line 118,col 5)-(line 118,col 24)",
        "(line 119,col 5)-(line 119,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstParallelizerTest.splitFiles(java.lang.String[])",
      "begin_line": 122,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 39)",
        "(line 124,col 5)-(line 124,col 50)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 130,col 5)-(line 131,col 70)",
        "(line 132,col 5)-(line 132,col 21)",
        "(line 133,col 5)-(line 133,col 39)",
        "(line 134,col 5)-(line 134,col 37)",
        "(line 136,col 5)-(line 137,col 62)",
        "(line 138,col 5)-(line 138,col 45)",
        "(line 139,col 5)-(line 139,col 46)",
        "(line 140,col 5)-(line 140,col 14)",
        "(line 141,col 5)-(line 144,col 5)",
        "(line 146,col 5)-(line 146,col 24)",
        "(line 147,col 5)-(line 147,col 46)"
      ]
    }
  ]
}