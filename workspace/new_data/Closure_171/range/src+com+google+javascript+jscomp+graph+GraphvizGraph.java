{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/GraphvizGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphvizGraph",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 123,
      "comment": "\n * A graph that can be dumped to a Graphviz DOT file.\n * \u003cp\u003e\n * An object which can be visualized as a graph should implement this interface.\n * The \u003ccode\u003eDotFormatter.toDot\u003c/code\u003e function can be used to get a\n * visualization of the object for debugging purpose.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.getName()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n   * Name of the graph.\n   *\n   * @return Name of the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.isDirected()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n   * Graph type.\n   *\n   * @return True if the graph is a directed graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.getGraphvizNodes()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n   * Retrieve a list of nodes in the graph.\n   *\n   * @return A list of nodes in the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.getGraphvizEdges()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Retrieve a list of edges in the graph.\n   *\n   * @return A list of edges in the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GraphvizNode",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 85,
      "comment": "\n   * A Graphviz node.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode.getId()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Retrieves the unique ID.\n     *\n     * @return A the unique ID of the node.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode.getColor()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Retrieves color of the node.\n     *\n     * @return The color of the node.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode.getLabel()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Retrieves the label of the node.\n     *\n     * @return Label of the node.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GraphvizEdge",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 91,
      "end_line": 122,
      "comment": "\n   * A Graphviz edge.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge.getNode1Id()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Get the first node in the edge. In a directed node, this will be the\n     * source node.\n     *\n     * @return First node in the edge.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge.getNode2Id()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Get the second node in the edge. In a directed node, this will be the\n     * destination node.\n     *\n     * @return First node in the edge.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge.getColor()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Retrieves color of the edge.\n     *\n     * @return The color of the edge.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge.getLabel()",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Retrieves the label of the edge.\n     *\n     * @return Label of the edge.\n     ",
      "child_ranges": []
    }
  ]
}