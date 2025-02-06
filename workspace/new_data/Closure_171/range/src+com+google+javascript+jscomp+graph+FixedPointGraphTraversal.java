{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/FixedPointGraphTraversal.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedPointGraphTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 144,
      "comment": "\n * A utility class for doing fixed-point computations. We traverse\n * the edges over the given directed graph until the graph reaches\n * a steady state.\n *\n * @author nicksantos@google.com (Nick Santos)\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_HALTING_ERROR_MSG"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.FixedPointGraphTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cN, E\u003e)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Create a new traversal.\n   * @param callback A callback for updating the state of the graph each\n   *     time an edge is traversed.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cNODE, EDGE\u003e)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n   * Helper method for creating new traversals.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "\n   * Compute a fixed point for the given graph.\n   * @param graph The graph to traverse.\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 37)",
        "(line 70,col 5)-(line 72,col 5)",
        "(line 73,col 5)-(line 73,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, N)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\n   * Compute a fixed point for the given graph, entering from the given node.\n   * @param graph The graph to traverse.\n   * @param entry The node to begin traversing from.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 40)",
        "(line 83,col 5)-(line 83,col 24)",
        "(line 84,col 5)-(line 84,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.computeFixedPoint(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, java.util.Set\u003cN\u003e)",
      "begin_line": 92,
      "end_line": 127,
      "comment": "\n   * Compute a fixed point for the given graph, entering from the given nodes.\n   * @param graph The graph to traverse.\n   * @param entrySet The nodes to begin traversing from.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 23)",
        "(line 94,col 5)-(line 94,col 45)",
        "(line 98,col 5)-(line 98,col 74)",
        "(line 101,col 5)-(line 102,col 32)",
        "(line 103,col 5)-(line 105,col 5)",
        "(line 106,col 5)-(line 123,col 5)",
        "(line 125,col 5)-(line 126,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EdgeCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 143,
      "comment": " Edge callback "
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