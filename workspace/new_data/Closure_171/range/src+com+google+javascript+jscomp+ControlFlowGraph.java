{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ControlFlowGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ControlFlowGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedDirectedGraph\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e"
      ],
      "begin_line": 32,
      "end_line": 215,
      "comment": "\n * Control flow graph.\n *\n *\n * @param \u003cN\u003e The instruction type of the control flow graph.\n "
    },
    {
      "type": "field",
      "varNames": [
        "implicitReturn"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n   * A special node marked by the node value key null to a singleton\n   * \"return\" when control is transferred outside of the current control flow\n   * graph.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.ControlFlowGraph(N, boolean, boolean)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "\n   * Constructor.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 44)",
        "(line 50,col 5)-(line 50,col 51)",
        "(line 51,col 5)-(line 51,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.getImplicitReturn()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n   * Gets the implicit return node.\n   *\n   * @return Return node.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.getEntry()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n   * Gets the entry point of the control flow graph. In general, this should be\n   * the beginning of the global script or beginning of a function.\n   *\n   * @return The entry point.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.isImplicitReturn(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n   * Checks whether node is the implicit return.\n   *\n   * @param node Node.\n   * @return True if the node is the implicit return.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.connectToImplicitReturn(N, com.google.javascript.jscomp.ControlFlowGraph.Branch)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n   * Connects the node to the explicit return.\n   *\n   * @param srcValue Node.\n   * @param edgeValue Edge.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.getOptionalNodeComparator(boolean)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n   * Gets a comparator for the nodes. The default implementation returns\n   * {@code null}. See {@link ControlFlowGraph#getOptionalNodeComparator}.\n   * @param isForward Whether the comparator sorts the nodes in the direction of\n   *    the flow.\n   * @return a comparator or null (in particular, if not overridden)\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.Branch.isConditional()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractCfgNodeTraversalCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 143,
      "end_line": 153,
      "comment": "\n   * Abstract callback to visit a control flow graph node without going into\n   * subtrees of the node that are also represented by other\n   * control flow graph nodes.\n   *\n   * \u003cp\u003eFor example, traversing an IF node as root will visit the two subtrees\n   * pointed by the {@link ControlFlowGraph.Branch#ON_TRUE} and\n   * {@link ControlFlowGraph.Branch#ON_FALSE} edges.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 148,col 7)-(line 150,col 7)",
        "(line 151,col 7)-(line 151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.isEnteringNewCfgNode(com.google.javascript.rhino.Node)",
      "begin_line": 159,
      "end_line": 205,
      "comment": "\n   * @return True if n should be represented by a new CFG node in the control\n   * flow graph.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 32)",
        "(line 161,col 5)-(line 204,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlFlowGraph.toString()",
      "begin_line": 207,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 24)",
        "(line 210,col 5)-(line 212,col 5)",
        "(line 213,col 5)-(line 213,col 13)"
      ]
    }
  ]
}