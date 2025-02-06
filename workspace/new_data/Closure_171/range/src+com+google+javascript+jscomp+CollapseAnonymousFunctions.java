{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CollapseAnonymousFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollapseAnonymousFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 38,
      "end_line": 119,
      "comment": "\n * Collapses anonymous function expressions into named function declarations,\n * i.e. the following:\n *\n * \u003cpre\u003e\n * var f \u003d function()\n * \u003cpre\u003e\n *\n * becomes:\n *\n * \u003cpre\u003efunction f()\u003c/pre\u003e\n *\n * This reduces the generated code size but changes the semantics because f\n * will be defined before its definition is reached.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CollapseAnonymousFunctions.CollapseAnonymousFunctions(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 77)",
        "(line 43,col 5)-(line 43,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseAnonymousFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 51,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseAnonymousFunctions.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 52,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 54,col 7)-(line 56,col 7)",
        "(line 64,col 7)-(line 64,col 44)",
        "(line 65,col 7)-(line 70,col 7)",
        "(line 74,col 7)-(line 74,col 48)",
        "(line 75,col 7)-(line 75,col 36)",
        "(line 76,col 7)-(line 76,col 40)",
        "(line 77,col 7)-(line 93,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseAnonymousFunctions.Callback.isRecursiveFunction(com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 97,col 7)-(line 97,col 43)",
        "(line 98,col 7)-(line 100,col 7)",
        "(line 101,col 7)-(line 101,col 33)",
        "(line 102,col 7)-(line 102,col 33)",
        "(line 103,col 7)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseAnonymousFunctions.Callback.containsName(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 109,col 7)",
        "(line 111,col 7)-(line 115,col 7)",
        "(line 116,col 7)-(line 116,col 19)"
      ]
    }
  ]
}