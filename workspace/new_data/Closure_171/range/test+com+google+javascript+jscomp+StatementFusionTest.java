{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/StatementFusionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatementFusionTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 162,
      "comment": "\n * Unit tests for {@link StatementFusion}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "favorsCommas"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.setUp()",
      "begin_line": 27,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 29,col 5)-(line 29,col 18)",
        "(line 30,col 5)-(line 30,col 32)",
        "(line 31,col 5)-(line 31,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 34,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 38,col 55)",
        "(line 40,col 5)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNothingToDo()",
      "begin_line": 43,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 17)",
        "(line 45,col 5)-(line 45,col 18)",
        "(line 46,col 5)-(line 46,col 20)",
        "(line 47,col 5)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockWithStatements()",
      "begin_line": 50,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 27)",
        "(line 52,col 5)-(line 52,col 40)",
        "(line 53,col 5)-(line 53,col 47)",
        "(line 54,col 5)-(line 54,col 47)",
        "(line 55,col 5)-(line 55,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockIntoIf()",
      "begin_line": 58,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 43)",
        "(line 60,col 5)-(line 60,col 59)",
        "(line 61,col 5)-(line 61,col 47)",
        "(line 62,col 5)-(line 62,col 51)",
        "(line 65,col 5)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockReturn()",
      "begin_line": 68,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 45)",
        "(line 70,col 5)-(line 70,col 49)",
        "(line 73,col 5)-(line 73,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldBlockThrow()",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 43)",
        "(line 78,col 5)-(line 78,col 47)",
        "(line 79,col 5)-(line 79,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFoldSwitch()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFuseIntoForIn()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 55)",
        "(line 88,col 5)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFuseIntoVanillaFor()",
      "begin_line": 91,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 48)",
        "(line 93,col 5)-(line 93,col 51)",
        "(line 94,col 5)-(line 94,col 55)",
        "(line 95,col 5)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFuseIntoLabel()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 67)",
        "(line 100,col 5)-(line 100,col 60)",
        "(line 101,col 5)-(line 101,col 66)",
        "(line 102,col 5)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFuseIntoBlock()",
      "begin_line": 105,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 43)",
        "(line 107,col 5)-(line 108,col 53)",
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFuseIntoWhile()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFuseIntoDo()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFavorComma1()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 24)",
        "(line 123,col 5)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFavorComma2()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 24)",
        "(line 128,col 5)-(line 128,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFavorComma3()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 24)",
        "(line 133,col 5)-(line 133,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFavorComma4()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 24)",
        "(line 138,col 5)-(line 138,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testFavorComma5()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 24)",
        "(line 143,col 5)-(line 143,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoGlobalSchopeChanges()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.testNoFunctionBlockChanges()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.fuse(java.lang.String, java.lang.String)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 156,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusionTest.fuseSame(java.lang.String)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 21)"
      ]
    }
  ]
}