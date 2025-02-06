{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/DiGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Graph\u003cN, E\u003e"
      ],
      "begin_line": 28,
      "end_line": 132,
      "comment": "\n * A generic directed graph.\n *\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedGraphNodes()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n   * Gets an immutable iterable over all the nodes in the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getOutEdges(N)",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n   * Gets an immutable list of out edges of the given node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getInEdges(N)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n   * Gets an immutable list of in edges of the given node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedPredNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 45,
      "end_line": 46,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedSuccNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 48,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedPredNodes(N)",
      "begin_line": 51,
      "end_line": 52,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedSuccNodes(N)",
      "begin_line": 54,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.createDirectedGraphNode(N)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedGraphNode(N)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.getDirectedGraphEdges(N, N)",
      "begin_line": 61,
      "end_line": 62,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.disconnectInDirection(N, N)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * Disconnects all edges from n1 to n2.\n   *\n   * @param n1 Source node.\n   * @param n2 Destination node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.isConnectedInDirection(N, N)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n   * Checks whether two nodes in the graph are connected via a directed edge.\n   *\n   * @param n1 Node 1.\n   * @param n2 Node 2.\n   * @return \u003ccode\u003etrue\u003c/code\u003e if the graph contains edge from n1 to n2.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.isConnectedInDirection(N, E, N)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n   * Checks whether two nodes in the graph are connected via a directed edge\n   * with the given value.\n   *\n   * @param n1 Node 1.\n   * @param edgeValue edge value tag\n   * @param n2 Node 2.\n   * @return \u003ccode\u003etrue\u003c/code\u003e if the edge exists.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.isConnected(N, N)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.isConnected(N, E, N)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 100,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiGraphNode",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e"
      ],
      "begin_line": 109,
      "end_line": 114,
      "comment": "\n   * A generic directed graph node.\n   *\n   * @param \u003cN\u003e Value type that the graph node stores.\n   * @param \u003cE\u003e Value type that the graph edge stores.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphNode.getOutEdges()",
      "begin_line": 111,
      "end_line": 111,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphNode.getInEdges()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DiGraphEdge",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Graph.GraphEdge\u003cN, E\u003e"
      ],
      "begin_line": 122,
      "end_line": 131,
      "comment": "\n   * A generic directed graph edge.\n   *\n   * @param \u003cN\u003e Value type that the graph node stores.\n   * @param \u003cE\u003e Value type that the graph edge stores.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge.getSource()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge.getDestination()",
      "begin_line": 126,
      "end_line": 126,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge.setSource(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge.setDestination(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 130,
      "end_line": 130,
      "comment": "",
      "child_ranges": []
    }
  ]
}