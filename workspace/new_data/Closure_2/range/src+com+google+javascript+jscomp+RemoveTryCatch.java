{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RemoveTryCatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveTryCatch",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 33,
      "end_line": 114,
      "comment": "\n * Removes try catch finally blocks from a parse tree for easier debugging\n * (these statements impact both debugging in IE and sometimes even in FF).\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tryNodesContainingReturnStatements"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.RemoveTryCatch(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 29)",
        "(line 39,col 5)-(line 39,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n   * Do all processing on the root node.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveTryCatchCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 50,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveTryCatch.RemoveTryCatchCode.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 111,col 7)"
      ]
    }
  ]
}