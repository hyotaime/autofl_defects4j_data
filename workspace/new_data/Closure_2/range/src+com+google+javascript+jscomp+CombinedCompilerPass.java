{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CombinedCompilerPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedCompilerPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 48,
      "end_line": 195,
      "comment": "\n * \u003cp\u003eA compiler pass combining multiple {@link Callback}\n * and {@link ScopedCallback} objects. This pass can be used to separate\n * logically different verifications without incurring any additional traversal\n * and CFG generation costs.\u003c/p\u003e\n *\n * \u003cp\u003eDue to this compiler pass\u0027 nature, none of the callbacks may mutate\n * the parse tree.\u003c/p\u003e\n *\n * \u003cp\u003eTODO(user):\n * This combined pass is currently limited in the type of callbacks it can\n * combine due to the difficulty of handling NodeTraversal\u0027s methods that\n * initiate more recursion (e.g., {@link NodeTraversal#traverse(Node)} and\n * {@link NodeTraversal#traverseInnerNode(Node, Node, Scope)}). The\n * {@link NodeTraversal} object passed to the individual callbacks should\n * be instrumented to emulate the correct behavior. For instance,\n * one could create a {@link NodeTraversal} whose\n * {@link NodeTraversal#traverseInnerNode(Node, Node, Scope)} ties\n * back into this compiler pass to give it context about what combined\n * passes are doing.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "callbacks"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The callbacks that this pass combines. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CombinedCompilerPass(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback...)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n   * Creates a combined compiler pass.\n   * @param compiler the compiler\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CombinedCompilerPass(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.jscomp.NodeTraversal.Callback\u003e)",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 29)",
        "(line 67,col 5)-(line 67,col 59)",
        "(line 68,col 5)-(line 70,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.traverse(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.jscomp.NodeTraversal.Callback\u003e)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 79,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallbackWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 92,
      "end_line": 150,
      "comment": "\n   * Maintains information about a callback in order to simulate it being the\n   * exclusive client of the shared {@link NodeTraversal}. In particular, this\n   * class simulates abbreviating the traversal when the wrapped callback\n   * returns false for\n   * {@link Callback#shouldTraverse(NodeTraversal, Node, Node)}.\n   * The callback becomes inactive (i.e., traversal messages are not sent to it)\n   * until the main traversal revisits the node during the post-order visit.\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The callback being wrapped. Never null. "
    },
    {
      "type": "field",
      "varNames": [
        "scopedCallback"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * if (callback instanceof ScopedCallback), then scopedCallback points\n     * to an instance of ScopedCallback, otherwise scopedCallback points to null\n     "
    },
    {
      "type": "field",
      "varNames": [
        "waiting"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The node that {@link Callback#shouldTraverse(NodeTraversal, Node, Node)}\n     * returned false for. The wrapped callback doesn\u0027t receive messages until\n     * after this node is revisited in the post-order traversal.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.CallbackWrapper(com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 108,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 109,col 31)",
        "(line 110,col 7)-(line 114,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.visitOrMaybeActivate(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "\n     * Visits the node unless the wrapped callback is inactive. Activates the\n     * callback if appropriate.\n     ",
      "child_ranges": [
        "(line 122,col 7)-(line 126,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.shouldTraverseIfActive(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 132,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.enterScopeIfActive(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 138,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.exitScopeIfActive(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 144,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper.isActive()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 7)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 166,col 5)",
        "(line 172,col 5)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 179,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CombinedCompilerPass.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 189,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 193,col 5)"
      ]
    }
  ]
}