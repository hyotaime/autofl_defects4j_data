{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckRequiresForConstructors.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructors",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 38,
      "end_line": 213,
      "comment": "\n * This pass walks the AST to create a Collection of \u0027new\u0027 nodes and\n * \u0027goog.require\u0027 nodes. It reconciles these Collections, creating a\n * warning for each discrepancy.\n *\n "
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
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_REQUIRE_WARNING"
      ],
      "begin_line": 44,
      "end_line": 46,
      "comment": " Warnings"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructors(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 29)",
        "(line 51,col 5)-(line 51,col 59)",
        "(line 52,col 5)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n   * Uses Collections of new and goog.require nodes to create a compiler warning\n   * for each new class name without a corresponding goog.require().\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 67)",
        "(line 62,col 5)-(line 62,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 67)",
        "(line 68,col 5)-(line 69,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.isClassName(java.lang.String)",
      "begin_line": 74,
      "end_line": 78,
      "comment": " character, but is not in all caps).",
      "child_ranges": [
        "(line 75,col 5)-(line 77,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.getOutermostClassName(java.lang.String)",
      "begin_line": 82,
      "end_line": 91,
      "comment": " or null if no part refers to a class.",
      "child_ranges": [
        "(line 83,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructorsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 98,
      "end_line": 212,
      "comment": "\n   * This class \"records\" each constructor and goog.require visited and creates\n   * a warning for each new node without an appropriate goog.require node.\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "constructors"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newNodes"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 7)-(line 106,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 21)",
        "(line 112,col 7)-(line 153,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitScriptNode(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 156,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 49)",
        "(line 158,col 7)-(line 172,col 7)",
        "(line 175,col 7)-(line 175,col 28)",
        "(line 176,col 7)-(line 176,col 28)",
        "(line 177,col 7)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitCallNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 181,col 7)-(line 181,col 78)",
        "(line 182,col 7)-(line 184,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitNewNode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 187,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 41)",
        "(line 191,col 7)-(line 193,col 7)",
        "(line 196,col 7)-(line 196,col 32)",
        "(line 197,col 7)-(line 197,col 76)",
        "(line 201,col 7)-(line 203,col 7)",
        "(line 205,col 7)-(line 205,col 41)",
        "(line 206,col 7)-(line 206,col 48)",
        "(line 207,col 7)-(line 209,col 7)",
        "(line 210,col 7)-(line 210,col 22)"
      ]
    }
  ]
}