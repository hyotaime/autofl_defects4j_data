{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/NodeIteratorsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeIteratorsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 180,
      "comment": "\n * Tests for NodeIterators.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testBasic()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testNamedFunction()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testNamedFunction2()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 51,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testFunctionExpression()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 56,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testFunctionExpression2()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 62,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtVarRef()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 67,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtVarRef2()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 72,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtVarRef3()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 77,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtSideEffects()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 82,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtSideEffects2()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 87,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtSideEffects3()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtSideEffects4()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltAtSideEffects5()",
      "begin_line": 100,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 102,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testNoHaltReadWhenValueIsImmutable()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 107,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testHaltReadWhenValueHasSideEffects()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 112,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testCatchBlock()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 117,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testIfBranch()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testVarMotionWithCode(java.lang.String, int...)",
      "begin_line": 130,
      "end_line": 136,
      "comment": "\n   * Parses the given code, finds the variable X in the global scope, and runs\n   * the VarMotion iterator. Asserts that the iteration order matches the\n   * tokens given.\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 54)",
        "(line 132,col 5)-(line 134,col 5)",
        "(line 135,col 5)-(line 135,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeIteratorsTest.testVarMotionWithCode(java.lang.String, java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 141,
      "end_line": 179,
      "comment": "\n   * @see #testVarMotionWithCode(String, int ...)\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 48)",
        "(line 146,col 5)-(line 146,col 59)",
        "(line 147,col 5)-(line 149,col 5)",
        "(line 151,col 5)-(line 152,col 55)",
        "(line 154,col 5)-(line 154,col 26)",
        "(line 155,col 5)-(line 163,col 5)",
        "(line 165,col 5)-(line 165,col 70)",
        "(line 167,col 5)-(line 167,col 62)",
        "(line 168,col 5)-(line 168,col 41)",
        "(line 169,col 5)-(line 172,col 33)",
        "(line 173,col 5)-(line 173,col 54)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 178,col 5)-(line 178,col 47)"
      ]
    }
  ]
}