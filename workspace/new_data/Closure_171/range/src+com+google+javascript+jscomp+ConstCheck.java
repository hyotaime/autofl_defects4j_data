{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ConstCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConstCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 33,
      "end_line": 133,
      "comment": "\n * Verifies that constants are only assigned a value once.\n * e.g. var XX \u003d 5;\n * XX \u003d 3;    // error!\n * XX++;      // error!\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONST_REASSIGNED_VALUE_ERROR"
      ],
      "begin_line": 36,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initializedConstants"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConstCheck.ConstCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n   * Creates an instance.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 29)",
        "(line 49,col 5)-(line 49,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConstCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 74)",
        "(line 55,col 5)-(line 55,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConstCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConstCheck.isConstant(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n   * Gets whether a variable is a constant initialized to a literal value at\n   * the point where it is declared.\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConstCheck.reportError(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n   * Reports a reassigned constant error.\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 72)"
      ]
    }
  ]
}