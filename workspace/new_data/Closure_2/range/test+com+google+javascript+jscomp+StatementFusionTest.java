{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/StatementFusionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatementFusionTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 111,
      "comment": "\n * Unit tests for {@link StatementFusion}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.setUp()",
      "begin_line": 25,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 27,col 5)-(line 27,col 18)",
        "(line 28,col 5)-(line 28,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 31,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 34,col 69)",
        "(line 36,col 5)-(line 36,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNothingToDo()",
      "begin_line": 39,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 17)",
        "(line 41,col 5)-(line 41,col 18)",
        "(line 42,col 5)-(line 42,col 20)",
        "(line 43,col 5)-(line 43,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockWithStatements()",
      "begin_line": 46,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 27)",
        "(line 48,col 5)-(line 48,col 40)",
        "(line 49,col 5)-(line 49,col 47)",
        "(line 50,col 5)-(line 50,col 47)",
        "(line 51,col 5)-(line 51,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockIntoIf()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 43)",
        "(line 56,col 5)-(line 56,col 59)",
        "(line 57,col 5)-(line 57,col 47)",
        "(line 58,col 5)-(line 58,col 51)",
        "(line 61,col 5)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockReturn()",
      "begin_line": 64,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 45)",
        "(line 66,col 5)-(line 66,col 49)",
        "(line 69,col 5)-(line 69,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockThrow()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 43)",
        "(line 74,col 5)-(line 74,col 47)",
        "(line 75,col 5)-(line 75,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldSwitch()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFuseIntoForIn()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 55)",
        "(line 84,col 5)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFuseIntoWhile()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFuseIntoDo()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoGlobalSchopeChanges()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFunctionBlockChanges()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.fuse(java.lang.String, java.lang.String)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.fuseSame(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 21)"
      ]
    }
  ]
}