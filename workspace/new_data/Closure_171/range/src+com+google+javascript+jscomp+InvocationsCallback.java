{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InvocationsCallback.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InvocationsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 36,
      "end_line": 69,
      "comment": "\n * Traversal callback that finds method invocations of the form\n *\n * \u003cpre\u003e\n * call\n *   getprop\n *     ...\n *     string\n *   ...\n * \u003c/pre\u003e\n *\n * and invokes a method defined by subclasses for processing these invocations.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InvocationsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 38,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 42,col 5)",
        "(line 44,col 5)-(line 44,col 38)",
        "(line 46,col 5)-(line 48,col 5)",
        "(line 50,col 5)-(line 50,col 55)",
        "(line 53,col 5)-(line 55,col 5)",
        "(line 57,col 5)-(line 57,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InvocationsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 67,
      "end_line": 68,
      "comment": "\n   * Called for each callnode that is a method invocation.\n   *\n   * @param callNode node of type call\n   * @param parent parent of callNode\n   * @param callName name of method invoked by first child of call\n   ",
      "child_ranges": []
    }
  ]
}