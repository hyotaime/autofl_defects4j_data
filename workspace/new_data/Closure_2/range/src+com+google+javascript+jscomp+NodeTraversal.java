{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NodeTraversal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 690,
      "comment": "\n * NodeTraversal allows an iteration through the nodes in the parse tree,\n * and facilitates the optimizations on the parse tree.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Package protected for tests"
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "curNode"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Contains the current node"
    },
    {
      "type": "field",
      "varNames": [
        "NODE_TRAVERSAL_ERROR"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n   * Stack containing the Scopes that have been created. The Scope objects\n   * are lazily created; so the {@code scopeRoots} stack contains the\n   * Nodes for all Scopes that have not been created yet.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "scopeRoots"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * A stack of scope roots. All scopes that have not been created\n   * are represented in this Deque.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cfgs"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n   * Stack of control flow graphs (CFG). There is one CFG per scope. CFGs\n   * are lazily populated: elements are {@code null} until requested by\n   * {@link #getControlFlowGraph()}. Note that {@link ArrayDeque} does not allow\n   * {@code null} elements, so {@link LinkedList} is used instead.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The current source file name "
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The current input "
    },
    {
      "type": "field",
      "varNames": [
        "scopeCreator"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The scope creator "
    },
    {
      "type": "field",
      "varNames": [
        "scopeCallback"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Possible callback for scope entry and exist *"
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 86,
      "end_line": 106,
      "comment": "\n   * Callback\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.Callback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eVisits a node in pre order (before visiting its children) and decides\n     * whether this node\u0027s children should be traversed. If children are\n     * traversed, they will be visited by\n     * {@link #visit(NodeTraversal, Node, Node)} in post order.\u003c/p\u003e\n     * \u003cp\u003eImplementations can have side effects (e.g. modifying the parse\n     * tree).\u003c/p\u003e\n     * @return whether the children of this node should be visited\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eVisits a node in post order (after its children have been visited).\n     * A node is visited only if all its parents should be traversed\n     * ({@link #shouldTraverse(NodeTraversal, Node, Node)}).\u003c/p\u003e\n     * \u003cp\u003eImplementations can have side effects (e.g. modifying the parse\n     * tree).\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ScopedCallback",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 111,
      "end_line": 124,
      "comment": "\n   * Callback that also knows about scope changes\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.ScopedCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Called immediately after entering a new scope. The new scope can\n     * be accessed through t.getScope()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.ScopedCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 123,
      "end_line": 123,
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
      "begin_line": 129,
      "end_line": 135,
      "comment": "\n   * Abstract callback to visit all nodes in post order.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractScopedCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 140,
      "end_line": 153,
      "comment": "\n   * Abstract scoped callback to visit all nodes in post order.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 7)-(line 145,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 148,
      "end_line": 149,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 151,
      "end_line": 152,
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
      "begin_line": 159,
      "end_line": 168,
      "comment": "\n   * Abstract callback to visit all nodes but not traverse into function\n   * bodies.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 166,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractShallowStatementCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 174,
      "end_line": 182,
      "comment": "\n   * Abstract callback to visit all structure and statement nodes but doesn\u0027t\n   * traverse into functions or expressions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 176,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 179,col 7)-(line 180,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractNodeTypePruningCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 187,
      "end_line": 216,
      "comment": "\n   * Abstract callback to visit a pruned set of nodes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTypes"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "include"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.AbstractNodeTypePruningCallback(java.util.Set\u003cjava.lang.Integer\u003e)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Creates an abstract pruned callback.\n     * @param nodeTypes the nodes to include in the traversal\n     ",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.AbstractNodeTypePruningCallback(java.util.Set\u003cjava.lang.Integer\u003e, boolean)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "\n     * Creates an abstract pruned callback.\n     * @param nodeTypes the nodes to include/exclude in the traversal\n     * @param include whether to include or exclude the nodes in the traversal\n     ",
      "child_ranges": [
        "(line 207,col 7)-(line 207,col 33)",
        "(line 208,col 7)-(line 208,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 211,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.NodeTraversal(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n   * Creates a node traversal using the specified callback interface.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeTraversal.NodeTraversal(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback, com.google.javascript.jscomp.ScopeCreator)",
      "begin_line": 229,
      "end_line": 239,
      "comment": "\n   * Creates a node traversal using the specified callback interface\n   * and the scope creator.\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 23)",
        "(line 232,col 5)-(line 234,col 5)",
        "(line 235,col 5)-(line 235,col 29)",
        "(line 236,col 5)-(line 236,col 24)",
        "(line 237,col 5)-(line 237,col 25)",
        "(line 238,col 5)-(line 238,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(java.lang.Exception)",
      "begin_line": 241,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 54)",
        "(line 249,col 5)-(line 256,col 5)",
        "(line 257,col 5)-(line 257,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.formatNodeContext(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 265,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.rhino.Node)",
      "begin_line": 271,
      "end_line": 282,
      "comment": "\n   * Traverses a parse tree recursively.\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 281,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.rhino.Node...)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 288,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 291,col 5)",
        "(line 293,col 5)-(line 310,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_SOURCE"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.formatNodePosition(com.google.javascript.rhino.Node)",
      "begin_line": 315,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 53)",
        "(line 317,col 5)-(line 319,col 5)",
        "(line 321,col 5)-(line 321,col 35)",
        "(line 322,col 5)-(line 322,col 37)",
        "(line 323,col 5)-(line 323,col 68)",
        "(line 324,col 5)-(line 326,col 5)",
        "(line 327,col 5)-(line 328,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseWithScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 336,
      "end_line": 345,
      "comment": "\n   * Traverses a parse tree recursively with a scope, starting with the given\n   * root. This should only be used in the global scope. Otherwise, use\n   * {@link #traverseAtScope}.\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 43)",
        "(line 339,col 5)-(line 339,col 19)",
        "(line 340,col 5)-(line 340,col 20)",
        "(line 341,col 5)-(line 341,col 19)",
        "(line 342,col 5)-(line 342,col 17)",
        "(line 343,col 5)-(line 343,col 31)",
        "(line 344,col 5)-(line 344,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseAtScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 351,
      "end_line": 372,
      "comment": "\n   * Traverses a parse tree recursively with a scope, starting at that scope\u0027s\n   * root.\n   ",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 29)",
        "(line 353,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseInnerNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 384,
      "end_line": 394,
      "comment": "\n   * Traverses an inner node recursively with a refined scope. An inner node may\n   * be any node with a non {@code null} parent (i.e. all nodes except the\n   * root).\n   *\n   * @param node the node to traverse\n   * @param parent the node\u0027s parent, it may not be {@code null}\n   * @param refinedScope the refined scope of the scope currently at the top of\n   *     the scope stack or in trivial cases that very scope or {@code null}\n   ",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 39)",
        "(line 386,col 5)-(line 393,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getCompiler()",
      "begin_line": 399,
      "end_line": 403,
      "comment": "\n   * Gets the compiler.\n   ",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getLineNumber()",
      "begin_line": 409,
      "end_line": 419,
      "comment": "\n   * Gets the current line number, or zero if it cannot be determined. The line\n   * number is retrieved lazily as a running time optimization.\n   ",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 23)",
        "(line 411,col 5)-(line 417,col 5)",
        "(line 418,col 5)-(line 418,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getSourceName()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n   * Gets the current input source name.\n   *\n   * @return A string that may be empty, but not null\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getInput()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n   * Gets the current input source.\n   ",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getModule()",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n   * Gets the current input module.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 37)",
        "(line 442,col 5)-(line 442,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getCurrentNode()",
      "begin_line": 446,
      "end_line": 448,
      "comment": " Returns the node currently being traversed. ",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverse(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 453,
      "end_line": 457,
      "comment": "\n   * Traverses a node recursively.\n   ",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 54)",
        "(line 456,col 5)-(line 456,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.NodeTraversal.Callback)",
      "begin_line": 462,
      "end_line": 466,
      "comment": "\n   * Traverses a list of node trees.\n   ",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 54)",
        "(line 465,col 5)-(line 465,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseRoots(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NodeTraversal.Callback, com.google.javascript.rhino.Node...)",
      "begin_line": 468,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 470,col 5)-(line 470,col 54)",
        "(line 471,col 5)-(line 471,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseBranch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 477,
      "end_line": 506,
      "comment": "\n   * Traverses a branch.\n   ",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 27)",
        "(line 480,col 5)-(line 483,col 5)",
        "(line 485,col 5)-(line 485,col 16)",
        "(line 486,col 5)-(line 486,col 58)",
        "(line 488,col 5)-(line 502,col 5)",
        "(line 504,col 5)-(line 504,col 16)",
        "(line 505,col 5)-(line 505,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 511,
      "end_line": 546,
      "comment": "\n   * Traverses a function.\n   ",
      "child_ranges": [
        "(line 512,col 5)-(line 512,col 53)",
        "(line 513,col 5)-(line 513,col 45)",
        "(line 515,col 5)-(line 515,col 42)",
        "(line 517,col 5)-(line 518,col 44)",
        "(line 520,col 5)-(line 523,col 5)",
        "(line 525,col 5)-(line 525,col 16)",
        "(line 526,col 5)-(line 526,col 17)",
        "(line 528,col 5)-(line 532,col 5)",
        "(line 534,col 5)-(line 534,col 39)",
        "(line 535,col 5)-(line 535,col 37)",
        "(line 538,col 5)-(line 538,col 28)",
        "(line 541,col 5)-(line 542,col 34)",
        "(line 543,col 5)-(line 543,col 28)",
        "(line 545,col 5)-(line 545,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction()",
      "begin_line": 549,
      "end_line": 560,
      "comment": " Examines the functions stack for the last instance of a function node. ",
      "child_ranges": [
        "(line 551,col 5)-(line 559,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.pushScope(com.google.javascript.rhino.Node)",
      "begin_line": 563,
      "end_line": 570,
      "comment": " Creates a new scope (e.g. when entering a function). ",
      "child_ranges": [
        "(line 564,col 5)-(line 564,col 46)",
        "(line 565,col 5)-(line 565,col 26)",
        "(line 566,col 5)-(line 566,col 20)",
        "(line 567,col 5)-(line 569,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.pushScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 573,
      "end_line": 580,
      "comment": " Creates a new scope (e.g. when entering a function). ",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 46)",
        "(line 575,col 5)-(line 575,col 19)",
        "(line 576,col 5)-(line 576,col 20)",
        "(line 577,col 5)-(line 579,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.popScope()",
      "begin_line": 583,
      "end_line": 593,
      "comment": " Pops back to the previous scope (e.g. when leaving a function). ",
      "child_ranges": [
        "(line 584,col 5)-(line 586,col 5)",
        "(line 587,col 5)-(line 591,col 5)",
        "(line 592,col 5)-(line 592,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScope()",
      "begin_line": 596,
      "end_line": 610,
      "comment": " Gets the current scope. ",
      "child_ranges": [
        "(line 597,col 5)-(line 597,col 58)",
        "(line 598,col 5)-(line 600,col 5)",
        "(line 602,col 5)-(line 602,col 56)",
        "(line 603,col 5)-(line 606,col 5)",
        "(line 607,col 5)-(line 607,col 23)",
        "(line 609,col 5)-(line 609,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getControlFlowGraph()",
      "begin_line": 613,
      "end_line": 621,
      "comment": " Gets the control flow graph for the current JS scope. ",
      "child_ranges": [
        "(line 614,col 5)-(line 619,col 5)",
        "(line 620,col 5)-(line 620,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScopeRoot()",
      "begin_line": 624,
      "end_line": 630,
      "comment": " Returns the current scope\u0027s root. ",
      "child_ranges": [
        "(line 625,col 5)-(line 629,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.inGlobalScope()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n   * Determines whether the traversal is currently in the global scope.\n   ",
      "child_ranges": [
        "(line 636,col 5)-(line 636,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getScopeDepth()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 640,col 5)-(line 640,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.hasScope()",
      "begin_line": 643,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 644,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.report(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 648,
      "end_line": 653,
      "comment": " Reports a diagnostic (error or warning) ",
      "child_ranges": [
        "(line 650,col 5)-(line 651,col 38)",
        "(line 652,col 5)-(line 652,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 656,col 5)-(line 656,col 40)",
        "(line 657,col 5)-(line 657,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getInputId()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 661,col 5)-(line 661,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 671,
      "end_line": 674,
      "comment": "\n   * Creates a JSError during NodeTraversal.\n   *\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.makeError(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n   * Creates a JSError during NodeTraversal.\n   *\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 684,col 5)-(line 684,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeTraversal.getBestSourceFileName(com.google.javascript.rhino.Node)",
      "begin_line": 687,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 688,col 5)-(line 688,col 58)"
      ]
    }
  ]
}