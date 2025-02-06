{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/AdjacencyGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdjacencyGraph",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 57,
      "comment": "\n * A minimal graph interface.  Provided is add nodes to the graph, adjacency\n * calculation between a SubGraph and a GraphNode, and adding node annotations.\n *\n * \u003cp\u003eFor a more extensive interface, see {@link Graph}.\n *\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n * @see Graph\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.AdjacencyGraph.getNodes()",
      "begin_line": 34,
      "end_line": 34,
      "comment": " Gets an immutable list of all nodes. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.AdjacencyGraph.getNode(N)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n   * Gets a node from the graph given a value. Values equality are compared\n   * using \u003ccode\u003eObject.equals\u003c/code\u003e.\n   *\n   * @param value The node\u0027s value.\n   * @return The corresponding node in the graph, null if there value has no\n   *         corresponding node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.AdjacencyGraph.newSubGraph()",
      "begin_line": 47,
      "end_line": 47,
      "comment": " Returns an empty SubGraph for this Graph. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.AdjacencyGraph.clearNodeAnnotations()",
      "begin_line": 50,
      "end_line": 50,
      "comment": " Makes each node\u0027s annotation null. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.AdjacencyGraph.getWeight(N)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n   * Returns a weight for the given value to be used in ordering nodes, e.g.\n   * in {@link GraphColoring}.\n   ",
      "child_ranges": []
    }
  ]
}