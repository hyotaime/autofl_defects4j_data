{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckRequiresForConstructors.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructors",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 37,
      "end_line": 207,
      "comment": "\n * This pass walks the AST to create a Collection of \u0027new\u0027 nodes and\n * \u0027goog.require\u0027 nodes. It reconciles these Collections, creating a\n * warning for each discrepancy.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_REQUIRE_WARNING"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": " Warnings"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructors(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 29)",
        "(line 50,col 5)-(line 50,col 59)",
        "(line 51,col 5)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n   * Uses Collections of new and goog.require nodes to create a compiler warning\n   * for each new class name without a corresponding goog.require().\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 67)",
        "(line 61,col 5)-(line 61,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 67)",
        "(line 67,col 5)-(line 68,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.isClassName(java.lang.String)",
      "begin_line": 73,
      "end_line": 77,
      "comment": " character, but is not in all caps).",
      "child_ranges": [
        "(line 74,col 5)-(line 76,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.getOutermostClassName(java.lang.String)",
      "begin_line": 81,
      "end_line": 90,
      "comment": " or null if no part refers to a class.",
      "child_ranges": [
        "(line 82,col 5)-(line 87,col 5)",
        "(line 89,col 5)-(line 89,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CheckRequiresForConstructorsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 97,
      "end_line": 206,
      "comment": "\n   * This class \"records\" each constructor and goog.require visited and creates\n   * a warning for each new node without an appropriate goog.require node.\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "constructors"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newNodes"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 129,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitScriptNode(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 132,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 49)",
        "(line 134,col 7)-(line 148,col 7)",
        "(line 151,col 7)-(line 151,col 28)",
        "(line 152,col 7)-(line 152,col 28)",
        "(line 153,col 7)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitCallNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 156,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 78)",
        "(line 158,col 7)-(line 160,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.visitNewNode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 41)",
        "(line 167,col 7)-(line 169,col 7)",
        "(line 172,col 7)-(line 172,col 32)",
        "(line 173,col 7)-(line 173,col 76)",
        "(line 177,col 7)-(line 179,col 7)",
        "(line 181,col 7)-(line 181,col 41)",
        "(line 182,col 7)-(line 182,col 48)",
        "(line 183,col 7)-(line 185,col 7)",
        "(line 186,col 7)-(line 186,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckRequiresForConstructors.CheckRequiresForConstructorsCallback.maybeAddConstructor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 189,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 190,col 7)-(line 190,col 67)",
        "(line 191,col 7)-(line 204,col 7)"
      ]
    }
  ]
}