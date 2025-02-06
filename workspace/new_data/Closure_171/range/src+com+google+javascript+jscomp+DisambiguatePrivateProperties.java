{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DisambiguatePrivateProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisambiguatePrivateProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 24,
      "end_line": 70,
      "comment": "\n * Disambiguate properties by file, when they are private by naming convention.\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileid"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguatePrivateProperties.DisambiguatePrivateProperties(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePrivateProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePrivateProperties.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 40,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 44,col 5)",
        "(line 45,col 5)-(line 45,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePrivateProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 48,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 59,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguatePrivateProperties.maybeRename(com.google.javascript.rhino.Node)",
      "begin_line": 62,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 65)",
        "(line 64,col 5)-(line 64,col 32)",
        "(line 65,col 5)-(line 68,col 5)"
      ]
    }
  ]
}