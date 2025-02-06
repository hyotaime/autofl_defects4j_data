{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ReorderConstantExpressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReorderConstantExpressionTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 123,
      "comment": "\n * Unit test for {@ReorderConstantExpression}\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 25,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 27,col 5)-(line 28,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.setUp()",
      "begin_line": 31,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 18)",
        "(line 34,col 5)-(line 34,col 38)",
        "(line 35,col 5)-(line 35,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.testSymmetricOperations()",
      "begin_line": 38,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 20)",
        "(line 40,col 5)-(line 40,col 20)",
        "(line 41,col 5)-(line 41,col 20)",
        "(line 43,col 5)-(line 43,col 20)",
        "(line 44,col 5)-(line 44,col 20)",
        "(line 45,col 5)-(line 45,col 20)",
        "(line 47,col 5)-(line 47,col 21)",
        "(line 48,col 5)-(line 48,col 21)",
        "(line 49,col 5)-(line 49,col 21)",
        "(line 51,col 5)-(line 51,col 21)",
        "(line 52,col 5)-(line 52,col 21)",
        "(line 53,col 5)-(line 53,col 21)",
        "(line 55,col 5)-(line 55,col 19)",
        "(line 56,col 5)-(line 56,col 19)",
        "(line 57,col 5)-(line 57,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.testRelationalOperations()",
      "begin_line": 60,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 24)",
        "(line 62,col 5)-(line 62,col 19)",
        "(line 63,col 5)-(line 63,col 24)",
        "(line 64,col 5)-(line 64,col 19)",
        "(line 66,col 5)-(line 66,col 26)",
        "(line 67,col 5)-(line 67,col 20)",
        "(line 68,col 5)-(line 68,col 26)",
        "(line 69,col 5)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.set1Tests(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.set1Tests(java.lang.String, java.lang.String)",
      "begin_line": 80,
      "end_line": 95,
      "comment": "\n   * This set has a mutable on the right and an Immutable on the left.\n   * Applies for relational and symmetric operations.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 47)",
        "(line 82,col 5)-(line 82,col 51)",
        "(line 83,col 5)-(line 83,col 49)",
        "(line 84,col 5)-(line 84,col 53)",
        "(line 86,col 5)-(line 87,col 43)",
        "(line 88,col 5)-(line 88,col 51)",
        "(line 89,col 5)-(line 89,col 59)",
        "(line 90,col 5)-(line 90,col 59)",
        "(line 92,col 5)-(line 92,col 51)",
        "(line 93,col 5)-(line 94,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.set2Tests(java.lang.String)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n   * This set has a mutable on the right and an Immutable on the left.\n   * Applies only for symmetric operations.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 49)",
        "(line 103,col 5)-(line 103,col 59)",
        "(line 105,col 5)-(line 105,col 33)",
        "(line 106,col 5)-(line 106,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpressionTest.set3Tests(java.lang.String)",
      "begin_line": 112,
      "end_line": 122,
      "comment": "\n   * This set has an the immutable on the left already, or both non-immutable.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 31)",
        "(line 114,col 5)-(line 114,col 33)",
        "(line 115,col 5)-(line 115,col 32)",
        "(line 116,col 5)-(line 116,col 34)",
        "(line 117,col 5)-(line 117,col 34)",
        "(line 119,col 5)-(line 119,col 31)",
        "(line 121,col 5)-(line 121,col 31)"
      ]
    }
  ]
}