{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RemoveTryCatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveTryCatch",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 35,
      "end_line": 115,
      "comment": "\n * Removes try catch finally blocks from a parse tree for easier debugging\n * (these statements impact both debugging in IE and sometimes even in FF).\n *\n * This changes the semantics of the code and should not be used in production!\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tryNodesContainingReturnStatements"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.RemoveTryCatch(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 29)",
        "(line 41,col 5)-(line 41,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n   * Do all processing on the root node.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveTryCatchCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 52,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.RemoveTryCatchCode.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 53,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 55,col 7)-(line 112,col 7)"
      ]
    }
  ]
}