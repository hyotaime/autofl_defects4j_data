{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/FixedPointGraphTraversal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedPointGraphTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 144,
      "comment": "\n * A utility class for doing fixed-point computations. We traverse\n * the edges over the given directed graph until the graph reaches\n * a steady state.\n *\n * @author nicksantos@google.com (Nick Santos)\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_HALTING_ERROR_MSG"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.FixedPointGraphTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cN, E\u003e)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n   * Create a new traversal.\n   * @param callback A callback for updating the state of the graph each\n   *     time an edge is traversed.\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cNODE, EDGE\u003e)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n   * Helper method for creating new traversals.\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n   * Compute a fixed point for the given graph.\n   * @param graph The graph to traverse.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 37)",
        "(line 71,col 5)-(line 73,col 5)",
        "(line 74,col 5)-(line 74,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, N)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n   * Compute a fixed point for the given graph, entering from the given node.\n   * @param graph The graph to traverse.\n   * @param entry The node to begin traversing from.\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 40)",
        "(line 84,col 5)-(line 84,col 24)",
        "(line 85,col 5)-(line 85,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, java.util.Set\u003cN\u003e)",
      "begin_line": 93,
      "end_line": 128,
      "comment": "\n   * Compute a fixed point for the given graph, entering from the given nodes.\n   * @param graph The graph to traverse.\n   * @param entrySet The nodes to begin traversing from.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 23)",
        "(line 95,col 5)-(line 95,col 45)",
        "(line 99,col 5)-(line 99,col 74)",
        "(line 102,col 5)-(line 103,col 32)",
        "(line 104,col 5)-(line 106,col 5)",
        "(line 107,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 127,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EdgeCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback.traverseEdge(Node, Edge, Node)",
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Update the state of the destination node when the given edge\n     * is traversed. For the fixed-point computation to work, only the\n     * destination node may be modified. The source node and the edge must\n     * not be modified.\n     *\n     * @param source The start node.\n     * @param e The edge.\n     * @param destination The end node.\n     * @return Whether the state of the destination node changed.\n     ",
      "child_ranges": []
    }
  ]
}