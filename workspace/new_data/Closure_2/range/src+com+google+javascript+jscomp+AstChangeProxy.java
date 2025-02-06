{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AstChangeProxy.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AstChangeProxy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 132,
      "comment": "\n * Proxy that provides a high level interface that compiler passes can\n * use to replace or remove sections of the AST.\n *\n "
    },
    {
      "type": "class_interface",
      "name": "ChangeListener",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 44,
      "comment": "\n   * Interface used to notify client code about changes done by\n   * AstChangeProxy.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.ChangeListener.nodeRemoved(com.google.javascript.rhino.Node)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Notifies clients about node removals.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.AstChangeProxy()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.registerListener(com.google.javascript.jscomp.AstChangeProxy.ChangeListener)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n   * Registers a change listener.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.unregisterListener(com.google.javascript.jscomp.AstChangeProxy.ChangeListener)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n   * Unregisters a change listener.\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.notifyOfRemoval(com.google.javascript.rhino.Node)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n   * Notifies listeners about a removal.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 72,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.removeChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n   * Removes a node from the parent\u0027s child list.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 29)",
        "(line 81,col 5)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.replaceWith(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n   * Replaces a node from the parent\u0027s child list.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AstChangeProxy.replaceWith(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 94,
      "end_line": 131,
      "comment": "\n   * Replaces a node with the provided list.\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 74)",
        "(line 97,col 5)-(line 97,col 35)",
        "(line 99,col 5)-(line 102,col 5)",
        "(line 104,col 5)-(line 104,col 38)",
        "(line 106,col 5)-(line 109,col 35)",
        "(line 111,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 130,col 26)"
      ]
    }
  ]
}