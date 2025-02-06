{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/UndiGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UndiGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Graph\u003cN, E\u003e"
      ],
      "begin_line": 29,
      "end_line": 61,
      "comment": "\n * A generic undirected graph.\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.getUndirectedGraphNodes()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n   * Gets an immutable collection of all the nodes in this graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.createUndirectedGraphNode(N)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.getUndirectedGraphNode(N)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.getUndirectedGraphEdges(N, N)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UndiGraphNode",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e"
      ],
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n   * A generic undirected graph node.\n   *\n   * @param \u003cN\u003e Value type that the graph node stores.\n   * @param \u003cE\u003e Value type that the graph edge stores.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode.getNeighborEdges()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode.getNeighborEdgesIterator()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UndiGraphEdge",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Graph.GraphEdge\u003cN, E\u003e"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n   * A generic undirected graph edge.\n   *\n   * @param \u003cN\u003e Value type that the graph node stores.\n   * @param \u003cE\u003e Value type that the graph edge stores.\n   "
    }
  ]
}