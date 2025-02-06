{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NodeTraversal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 726,
      "comment": "\n * NodeTraversal allows an iteration through the nodes in the parse tree,\n * and facilitates the optimizations on the parse tree.\n *\n "
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
        "callback"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "curNode"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Contains the current node"
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TRAVERSAL_ERROR"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n   * Stack containing the Scopes that have been created. The Scope objects\n   * are lazily created; so the {@code scopeRoots} stack contains the\n   * Nodes for all Scopes that have not been created yet.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "scopeRoots"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n   * A stack of scope roots. All scopes that have not been created\n   * are represented in this Deque.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cfgs"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Stack of control flow graphs (CFG). There is one CFG per scope. CFGs\n   * are lazily populated: elements are {@code null} until requested by\n   * {@link #getControlFlowGraph()}. Note that {@link ArrayDeque} does not allow\n   * {@code null} elements, so {@link LinkedList} is used instead.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The current source file name "
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The current input "
    },
    {
      "type": "field",
      "varNames": [
        "scopeCreator"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The scope creator "
    },
    {
      "type": "field",
      "varNames": [
        "scopeCallback"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Possible callback for scope entry and exist *"
    },
    {
      "type": "class_interface",
      "name": "FunctionCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 84,
      "comment": " Callback for passes that iterate over a list of functions "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.FunctionCallback.visit(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 89,
      "end_line": 109,
      "comment": "\n   * Callback for tree-based traversals\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.Callback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003eVisits a node in pre order (before visiting its children) and decides\n     * whether this node\u0027s children should be traversed. If children are\n     * traversed, they will be visited by\n     * {@link #visit(NodeTraversal, Node, Node)} in postorder.\u003c/p\u003e\n     * \u003cp\u003eImplementations can have side effects (e.g. modifying the parse\n     * tree).\u003c/p\u003e\n     * @return whether the children of this node should be visited\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003eVisits a node in postorder (after its children have been visited).\n     * A node is visited only if all its parents should be traversed\n     * ({@link #shouldTraverse(NodeTraversal, Node, Node)}).\u003c/p\u003e\n     * \u003cp\u003eImplementations can have side effects (e.g. modifying the parse\n     * tree).\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ScopedCallback",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 114,
      "end_line": 127,
      "comment": "\n   * Callback that also knows about scope changes\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.ScopedCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Called immediately after entering a new scope. The new scope can\n     * be accessed through t.getScope()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.ScopedCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Called immediately before exiting a scope. The ending scope can\n     * be accessed through t.getScope()\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AbstractPostOrderCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n   * Abstract callback to visit all nodes in postorder.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractPreOrderCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 141,
      "end_line": 144,
      "comment": " Abstract callback to visit all nodes in preorder. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractPreOrderCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 143,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AbstractScopedCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 149,
      "end_line": 162,
      "comment": "\n   * Abstract scoped callback to visit all nodes in postorder.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 157,
      "end_line": 158,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 160,
      "end_line": 161,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AbstractShallowCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 168,
      "end_line": 177,
      "comment": "\n   * Abstract callback to visit all nodes but not traverse into function\n   * bodies.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 169,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 175,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractShallowStatementCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n   * Abstract callback to visit all structure and statement nodes but doesn\u0027t\n   * traverse into functions or expressions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 189,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractNodeTypePruningCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 196,
      "end_line": 225,
      "comment": "\n   * Abstract callback to visit a pruned set of nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTypes"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "include"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.AbstractNodeTypePruningCallback(java.util.Set\u003cjava.lang.Integer\u003e)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Creates an abstract pruned callback.\n     * @param nodeTypes the nodes to include in the traversal\n     ",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.AbstractNodeTypePruningCallback(java.util.Set\u003cjava.lang.Integer\u003e, boolean)",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Creates an abstract pruned callback.\n     * @param nodeTypes the nodes to include/exclude in the traversal\n     * @param include whether to include or exclude the nodes in the traversal\n     ",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 33)",
        "(line 217,col 7)-(line 217,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 7)-(line 223,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.NodeTraversal(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n   * Creates a node traversal using the specified callback interface.\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.NodeTraversal(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback, com.google.javascript.jscomp.ScopeCreator)",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n   * Creates a node traversal using the specified callback interface\n   * and the scope creator.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 23)",
        "(line 241,col 5)-(line 243,col 5)",
        "(line 244,col 5)-(line 244,col 29)",
        "(line 245,col 5)-(line 245,col 24)",
        "(line 246,col 5)-(line 246,col 25)",
        "(line 247,col 5)-(line 247,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(java.lang.Exception)",
      "begin_line": 250,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 253,col 54)",
        "(line 258,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 266,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.formatNodeContext(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 274,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.rhino.Node)",
      "begin_line": 280,
      "end_line": 292,
      "comment": "\n   * Traverses a parse tree recursively.\n   ",
      "child_ranges": [
        "(line 281,col 5)-(line 291,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.rhino.Node...)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 298,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 299,col 5)-(line 301,col 5)",
        "(line 303,col 5)-(line 320,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_SOURCE"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.formatNodePosition(com.google.javascript.rhino.Node)",
      "begin_line": 325,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 53)",
        "(line 327,col 5)-(line 329,col 5)",
        "(line 331,col 5)-(line 331,col 35)",
        "(line 332,col 5)-(line 332,col 37)",
        "(line 333,col 5)-(line 333,col 68)",
        "(line 334,col 5)-(line 336,col 5)",
        "(line 337,col 5)-(line 338,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseWithScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 346,
      "end_line": 355,
      "comment": "\n   * Traverses a parse tree recursively with a scope, starting with the given\n   * root. This should only be used in the global scope. Otherwise, use\n   * {@link #traverseAtScope}.\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 43)",
        "(line 349,col 5)-(line 349,col 19)",
        "(line 350,col 5)-(line 350,col 20)",
        "(line 351,col 5)-(line 351,col 19)",
        "(line 352,col 5)-(line 352,col 17)",
        "(line 353,col 5)-(line 353,col 31)",
        "(line 354,col 5)-(line 354,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseAtScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 361,
      "end_line": 382,
      "comment": "\n   * Traverses a parse tree recursively with a scope, starting at that scope\u0027s\n   * root.\n   ",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 29)",
        "(line 363,col 5)-(line 381,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseInnerNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 394,
      "end_line": 404,
      "comment": "\n   * Traverses an inner node recursively with a refined scope. An inner node may\n   * be any node with a non {@code null} parent (i.e. all nodes except the\n   * root).\n   *\n   * @param node the node to traverse\n   * @param parent the node\u0027s parent, it may not be {@code null}\n   * @param refinedScope the refined scope of the scope currently at the top of\n   *     the scope stack or in trivial cases that very scope or {@code null}\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 39)",
        "(line 396,col 5)-(line 403,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getCompiler()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getLineNumber()",
      "begin_line": 414,
      "end_line": 424,
      "comment": "\n   * Gets the current line number, or zero if it cannot be determined. The line\n   * number is retrieved lazily as a running time optimization.\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 23)",
        "(line 416,col 5)-(line 422,col 5)",
        "(line 423,col 5)-(line 423,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getSourceName()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n   * Gets the current input source name.\n   *\n   * @return A string that may be empty, but not null\n   ",
      "child_ranges": [
        "(line 432,col 5)-(line 432,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getInput()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n   * Gets the current input source.\n   ",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getModule()",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n   * Gets the current input module.\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 37)",
        "(line 447,col 5)-(line 447,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getCurrentNode()",
      "begin_line": 451,
      "end_line": 453,
      "comment": " Returns the node currently being traversed. ",
      "child_ranges": [
        "(line 452,col 5)-(line 452,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseChangedFunctions(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.FunctionCallback)",
      "begin_line": 471,
      "end_line": 486,
      "comment": "\n   * Traversal for passes that work only on changed functions.\n   * Suppose a loopable pass P1 uses this traversal.\n   * Then, if a function doesn\u0027t change between two runs of P1, it won\u0027t look at\n   * the function the second time.\n   * (We\u0027re assuming that P1 runs to a fixpoint, o/w we may miss optimizations.)\n   *\n   * Most changes are reported with calls to Compiler.reportCodeChange(), which\n   * doesn\u0027t know which scope changed. We keep track of the current scope by\n   * calling Compiler.setScope inside pushScope and popScope.\n   * The automatic tracking can be wrong in rare cases when a pass changes scope\n   * w/out causing a call to pushScope or popScope. It\u0027s very hard to find the\n   * places where this happens unless a bug is triggered.\n   * Passes that do cross-scope modifications call\n   * Compiler.reportChangeToEnclosingScope(Node n).\n   ",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 43)",
        "(line 474,col 5)-(line 474,col 41)",
        "(line 475,col 5)-(line 475,col 41)",
        "(line 476,col 5)-(line 484,col 9)",
        "(line 485,col 5)-(line 485,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.Anonymous-3a247568-52ef-40fb-8b6e-1463b0cadcd1.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 477,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 479,col 11)-(line 481,col 11)",
        "(line 482,col 11)-(line 482,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 491,
      "end_line": 495,
      "comment": "\n   * Traverses a node recursively.\n   ",
      "child_ranges": [
        "(line 493,col 5)-(line 493,col 54)",
        "(line 494,col 5)-(line 494,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 500,
      "end_line": 504,
      "comment": "\n   * Traverses a list of node trees.\n   ",
      "child_ranges": [
        "(line 502,col 5)-(line 502,col 54)",
        "(line 503,col 5)-(line 503,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback, com.google.javascript.rhino.Node...)",
      "begin_line": 506,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 54)",
        "(line 509,col 5)-(line 509,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 515,
      "end_line": 541,
      "comment": "\n   * Traverses a branch.\n   ",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 27)",
        "(line 517,col 5)-(line 520,col 5)",
        "(line 522,col 5)-(line 522,col 16)",
        "(line 523,col 5)-(line 525,col 5)",
        "(line 527,col 5)-(line 537,col 5)",
        "(line 539,col 5)-(line 539,col 16)",
        "(line 540,col 5)-(line 540,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 544,
      "end_line": 577,
      "comment": " Traverses a function. ",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 53)",
        "(line 546,col 5)-(line 546,col 45)",
        "(line 548,col 5)-(line 548,col 42)",
        "(line 549,col 5)-(line 550,col 44)",
        "(line 552,col 5)-(line 555,col 5)",
        "(line 557,col 5)-(line 557,col 16)",
        "(line 558,col 5)-(line 558,col 17)",
        "(line 560,col 5)-(line 564,col 5)",
        "(line 566,col 5)-(line 566,col 39)",
        "(line 567,col 5)-(line 567,col 37)",
        "(line 570,col 5)-(line 570,col 28)",
        "(line 573,col 5)-(line 573,col 77)",
        "(line 574,col 5)-(line 574,col 28)",
        "(line 576,col 5)-(line 576,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction()",
      "begin_line": 580,
      "end_line": 591,
      "comment": " Examines the functions stack for the last instance of a function node. ",
      "child_ranges": [
        "(line 582,col 5)-(line 590,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.pushScope(com.google.javascript.rhino.Node)",
      "begin_line": 594,
      "end_line": 602,
      "comment": " Creates a new scope (e.g. when entering a function). ",
      "child_ranges": [
        "(line 595,col 5)-(line 595,col 46)",
        "(line 596,col 5)-(line 596,col 28)",
        "(line 597,col 5)-(line 597,col 26)",
        "(line 598,col 5)-(line 598,col 20)",
        "(line 599,col 5)-(line 601,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.pushScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 605,
      "end_line": 613,
      "comment": " Creates a new scope (e.g. when entering a function). ",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 46)",
        "(line 607,col 5)-(line 607,col 39)",
        "(line 608,col 5)-(line 608,col 19)",
        "(line 609,col 5)-(line 609,col 20)",
        "(line 610,col 5)-(line 612,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.popScope()",
      "begin_line": 616,
      "end_line": 629,
      "comment": " Pops back to the previous scope (e.g. when leaving a function). ",
      "child_ranges": [
        "(line 617,col 5)-(line 619,col 5)",
        "(line 620,col 5)-(line 624,col 5)",
        "(line 625,col 5)-(line 625,col 15)",
        "(line 626,col 5)-(line 628,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScope()",
      "begin_line": 632,
      "end_line": 646,
      "comment": " Gets the current scope. ",
      "child_ranges": [
        "(line 633,col 5)-(line 633,col 58)",
        "(line 634,col 5)-(line 636,col 5)",
        "(line 638,col 5)-(line 638,col 56)",
        "(line 639,col 5)-(line 642,col 5)",
        "(line 643,col 5)-(line 643,col 23)",
        "(line 645,col 5)-(line 645,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph()",
      "begin_line": 649,
      "end_line": 657,
      "comment": " Gets the control flow graph for the current JS scope. ",
      "child_ranges": [
        "(line 650,col 5)-(line 655,col 5)",
        "(line 656,col 5)-(line 656,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScopeRoot()",
      "begin_line": 660,
      "end_line": 666,
      "comment": " Returns the current scope\u0027s root. ",
      "child_ranges": [
        "(line 661,col 5)-(line 665,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.inGlobalScope()",
      "begin_line": 671,
      "end_line": 673,
      "comment": "\n   * Determines whether the traversal is currently in the global scope.\n   ",
      "child_ranges": [
        "(line 672,col 5)-(line 672,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScopeDepth()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 5)-(line 676,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.hasScope()",
      "begin_line": 679,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 5)-(line 680,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.report(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 684,
      "end_line": 689,
      "comment": " Reports a diagnostic (error or warning) ",
      "child_ranges": [
        "(line 686,col 5)-(line 687,col 64)",
        "(line 688,col 5)-(line 688,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 691,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 692,col 5)-(line 692,col 40)",
        "(line 693,col 5)-(line 693,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getInputId()",
      "begin_line": 696,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 697,col 5)-(line 697,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 707,
      "end_line": 710,
      "comment": "\n   * Creates a JSError during NodeTraversal.\n   *\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 709,col 5)-(line 709,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n   * Creates a JSError during NodeTraversal.\n   *\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 720,col 5)-(line 720,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getBestSourceFileName(com.google.javascript.rhino.Node)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 5)-(line 724,col 58)"
      ]
    }
  ]
}