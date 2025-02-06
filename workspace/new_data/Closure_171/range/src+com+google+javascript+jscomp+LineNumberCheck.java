{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/LineNumberCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineNumberCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 28,
      "end_line": 81,
      "comment": "\n * A simple pass to ensure that all AST nodes have line numbers,\n * an that the line numbers are monotonically increasing.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_LINE_INFO"
      ],
      "begin_line": 30,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiresLineNumbers"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LineNumberCheck.LineNumberCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LineNumberCheck.setCheckSubTree(com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 31)",
        "(line 47,col 5)-(line 47,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LineNumberCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 50,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 32)",
        "(line 54,col 5)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LineNumberCheck.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 63,col 5)",
        "(line 64,col 5)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LineNumberCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 79,col 5)"
      ]
    }
  ]
}