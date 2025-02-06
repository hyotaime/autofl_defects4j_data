{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/Graph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Graph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e"
      ],
      "begin_line": 57,
      "end_line": 353,
      "comment": "\n * The base generic class for graph-like data structure and algorithms in\n * the compiler.\n * \u003cp\u003e\n * Nodes and edges in the graph can store a piece of data that this graph is\n * used to represent. For example, a variable interference graph might store a\n * variable in the node. This piece of data can be accessed with\n * {@link GraphNode#getValue} and {@link GraphEdge#getValue}.\n * \u003cp\u003e\n * Algorithms and analysis can annotate information on the nodes and edges\n * using {@link GraphNode#getValue} and {@link GraphEdge#getValue}. For example,\n * a graph coloring algorithm can store the color as an annotation. If multiple\n * analyses are required, it is up to the user of the analysis to save the\n * annotated solution between passes.\n * \u003cp\u003e\n * We implemented our own graph data structure (as opposed to using\n * \u003ccode\u003ecom.google.common.graph\u003c/code\u003e) for two reasons. First, aside from\n * the node\u0027s label value, we would like to annotate information on the nodes\n * and edges. Using a map to annotate would introduce too much overhead during\n * fix point analysis. Also, \u003ccode\u003ecom.google.common.graph\u003c/code\u003e does not\n * support labeling of edges. Secondly, not using another external package would\n * limit our dependencies.\n * \u003cp\u003e\n * TODO(user): All functionality for removing nodes and edges.\n *\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "class_interface",
      "name": "AnnotationState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 70,
      "comment": "\n   * Pseudo typedef for a pair of annotations. Record of an object\u0027s\n   * annotation at some state.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "second"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.Graph.AnnotationState.AnnotationState(com.google.javascript.jscomp.graph.Annotatable, com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 7)-(line 67,col 31)",
        "(line 68,col 7)-(line 68,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GraphAnnotationState",
      "is_interface": false,
      "parent_types": [
        "java.util.ArrayList\u003ccom.google.javascript.jscomp.graph.Graph.AnnotationState\u003e"
      ],
      "begin_line": 76,
      "end_line": 82,
      "comment": "\n   * Pseudo typedef for ArrayList\u003cAnnotationState\u003e. Record of a collection of\n   * objects\u0027 annotations at some state.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.Graph.GraphAnnotationState.GraphAnnotationState(int)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 7)-(line 80,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "nodeAnnotationStack"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * Used by {@link #pushNodeAnnotations()} and {@link #popNodeAnnotations()}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "edgeAnnotationStack"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * Used by {@link #pushEdgeAnnotations()} and {@link #popEdgeAnnotations()}.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.connect(N, E, N)",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n   * Connects two nodes in the graph with an edge.\n   *\n   * @param n1 First node.\n   * @param edge The edge.\n   * @param n2 Second node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.disconnect(N, N)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n   * Disconnects two nodes in the graph by removing all edges between them.\n   *\n   * @param n1 First node.\n   * @param n2 Second node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.connectIfNotFound(N, E, N)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n   * Connects two nodes in the graph with an edge if such edge does not already\n   * exists between the nodes.\n   *\n   * @param n1 First node.\n   * @param edge The edge.\n   * @param n2 Second node.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 122,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.createNode(N)",
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n   * Gets a node from the graph given a value. New nodes are created if that\n   * value has not been assigned a graph node. Values equality are compared\n   * using \u003ccode\u003eObject.equals\u003c/code\u003e.\n   *\n   * @param value The node\u0027s value.\n   * @return The corresponding node in the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getNodes()",
      "begin_line": 136,
      "end_line": 137,
      "comment": " Gets an immutable list of all nodes. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getEdges()",
      "begin_line": 140,
      "end_line": 140,
      "comment": " Gets an immutable list of all edges. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getNodeDegree(N)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n   * Gets the degree of a node.\n   *\n   * @param value The node\u0027s value.\n   * @return The degree of the node.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getWeight(N)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getNeighborNodes(N)",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n   * Gets the neighboring nodes.\n   *\n   * @param value The node\u0027s value.\n   * @return A list of neighboring nodes.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getNeighborNodesIterator(N)",
      "begin_line": 163,
      "end_line": 163,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getEdges(N, N)",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n   * Retrieves an edge from the graph.\n   *\n   * @param n1 Node one.\n   * @param n2 Node two.\n   * @return The list of edges between those two values in the graph.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getFirstEdge(N, N)",
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n   * Retrieves any edge from the graph.\n   *\n   * @param n1 Node one.\n   * @param n2 Node two.\n   * @return The first edges between those two values in the graph. null if\n   *    there are none.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.hasNode(N)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n   * Checks whether the node exists in the graph ({@link #createNode(Object)}\n   * has been called with that value).\n   *\n   * @param n Node.\n   * @return \u003ccode\u003etrue\u003c/code\u003e if it exist.\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.isConnected(N, N)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n   * Checks whether two nodes in the graph are connected.\n   *\n   * @param n1 Node 1.\n   * @param n2 Node 2.\n   * @return \u003ccode\u003etrue\u003c/code\u003e if the two nodes are connected.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.isConnected(N, E, N)",
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n   * Checks whether two nodes in the graph are connected by the given\n   * edge type.\n   *\n   * @param n1 Node 1.\n   * @param e The edge type.\n   * @param n2 Node 2.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.getNodeOrFail(N)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\n   * Gets the node of the specified type, or throws an\n   * IllegalArgumentException.\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 30)",
        "(line 221,col 5)-(line 223,col 5)",
        "(line 224,col 5)-(line 224,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.clearNodeAnnotations()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 231,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.clearEdgeAnnotations()",
      "begin_line": 235,
      "end_line": 239,
      "comment": " Makes each edge\u0027s annotation null. ",
      "child_ranges": [
        "(line 236,col 5)-(line 238,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.pushNodeAnnotations()",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\n   * Pushes nodes\u0027 annotation values. Restored with\n   * {@link #popNodeAnnotations()}. Nodes\u0027 annotation values are cleared.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 248,col 5)",
        "(line 249,col 5)-(line 249,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.popNodeAnnotations()",
      "begin_line": 256,
      "end_line": 260,
      "comment": "\n   * Restores nodes\u0027 annotation values to state before last\n   * {@link #pushNodeAnnotations()}.\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 258,col 53)",
        "(line 259,col 5)-(line 259,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.pushEdgeAnnotations()",
      "begin_line": 266,
      "end_line": 271,
      "comment": "\n   * Pushes edges\u0027 annotation values. Restored with\n   * {@link #popEdgeAnnotations()}. Edges\u0027 annotation values are cleared.\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 269,col 5)",
        "(line 270,col 5)-(line 270,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.popEdgeAnnotations()",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\n   * Restores edges\u0027 annotation values to state before last\n   * {@link #pushEdgeAnnotations()}.\n   ",
      "child_ranges": [
        "(line 278,col 5)-(line 279,col 53)",
        "(line 280,col 5)-(line 280,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GraphEdge",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotatable"
      ],
      "begin_line": 289,
      "end_line": 300,
      "comment": "\n   * A generic edge.\n   *\n   * @param \u003cN\u003e Value type that the graph node stores.\n   * @param \u003cE\u003e Value type that the graph edge stores.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.GraphEdge.getValue()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Retrieves the edge\u0027s value.\n     *\n     * @return The value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.GraphEdge.getNodeA()",
      "begin_line": 297,
      "end_line": 297,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.GraphEdge.getNodeB()",
      "begin_line": 299,
      "end_line": 299,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SimpleSubGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.SubGraph\u003cN, E\u003e"
      ],
      "begin_line": 306,
      "end_line": 329,
      "comment": "\n   * A simple implementation of SubGraph that calculates adjacency by iterating\n   * over a node\u0027s neighbors.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.Graph.SimpleSubGraph.SimpleSubGraph(com.google.javascript.jscomp.graph.Graph\u003cN, E\u003e)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.SimpleSubGraph.isIndependentOf(N)",
      "begin_line": 314,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 316,col 7)-(line 316,col 50)",
        "(line 317,col 7)-(line 321,col 7)",
        "(line 322,col 7)-(line 322,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.SimpleSubGraph.addNode(N)",
      "begin_line": 325,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.pushAnnotations(java.util.Deque\u003ccom.google.javascript.jscomp.graph.Graph.GraphAnnotationState\u003e, java.util.Collection\u003c? extends com.google.javascript.jscomp.graph.Annotatable\u003e)",
      "begin_line": 335,
      "end_line": 343,
      "comment": "\n   * Pushes a new list on stack and stores nodes annotations in the new list.\n   * Clears objects\u0027 annotations as well.\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 65)",
        "(line 339,col 5)-(line 342,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.Graph.popAnnotations(java.util.Deque\u003ccom.google.javascript.jscomp.graph.Graph.GraphAnnotationState\u003e)",
      "begin_line": 348,
      "end_line": 352,
      "comment": "\n   * Restores the node annotations on the top of stack and pops stack.\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 351,col 5)"
      ]
    }
  ]
}