{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/LinkedDirectedGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedDirectedGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph"
      ],
      "begin_line": 42,
      "end_line": 581,
      "comment": "\n * A directed graph using linked list within nodes to store edge information.\n * \u003cp\u003e\n * This implementation favors directed graph operations inherited from \u003ccode\u003e\n * DirectedGraph\u003c/code\u003e.\n * Operations from \u003ccode\u003eGraph\u003c/code\u003e would tends to be slower.\n *\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.newSubGraph()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithNodeAnnotations()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithEdgeAnnotations()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.create()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 53)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "useNodeAnnotations"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useEdgeAnnotations"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraph(boolean, boolean)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 49)",
        "(line 74,col 5)-(line 74,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.connect(N, E, N)",
      "begin_line": 77,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 64)",
        "(line 80,col 5)-(line 80,col 66)",
        "(line 81,col 5)-(line 84,col 64)",
        "(line 85,col 5)-(line 85,col 32)",
        "(line 86,col 5)-(line 86,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.disconnect(N, N)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 34)",
        "(line 92,col 5)-(line 92,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.disconnectInDirection(N, N)",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 64)",
        "(line 98,col 5)-(line 98,col 66)",
        "(line 99,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedGraphNodes()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 108,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedGraphNode(N)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNode(N)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getInEdges(N)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 66)",
        "(line 124,col 5)-(line 124,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getOutEdges(N)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 66)",
        "(line 130,col 5)-(line 130,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.createDirectedGraphNode(N)",
      "begin_line": 133,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 62)",
        "(line 136,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getEdges(N, N)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 73)",
        "(line 150,col 5)-(line 150,col 74)",
        "(line 151,col 5)-(line 151,col 63)",
        "(line 152,col 5)-(line 152,col 76)",
        "(line 153,col 5)-(line 153,col 31)",
        "(line 154,col 5)-(line 154,col 32)",
        "(line 155,col 5)-(line 155,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getFirstEdge(N, N)",
      "begin_line": 158,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 49)",
        "(line 161,col 5)-(line 161,col 49)",
        "(line 162,col 5)-(line 166,col 5)",
        "(line 167,col 5)-(line 171,col 5)",
        "(line 172,col 5)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.createNode(N)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedGraphEdges(N, N)",
      "begin_line": 180,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 49)",
        "(line 183,col 5)-(line 183,col 49)",
        "(line 184,col 5)-(line 184,col 57)",
        "(line 185,col 5)-(line 189,col 5)",
        "(line 190,col 5)-(line 190,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.isConnectedInDirection(N, N)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.isConnectedInDirection(N, E, N)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.isConnectedInDirection(N, com.google.common.base.Predicate\u003cE\u003e, N)",
      "begin_line": 203,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 49)",
        "(line 206,col 5)-(line 206,col 49)",
        "(line 207,col 5)-(line 212,col 5)",
        "(line 214,col 5)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedPredNodes(N)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedSuccNodes(N)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedPredNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 232,col 5)",
        "(line 233,col 5)-(line 233,col 60)",
        "(line 234,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getDirectedSuccNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 240,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 5)-(line 245,col 5)",
        "(line 246,col 5)-(line 246,col 60)",
        "(line 247,col 5)-(line 249,col 5)",
        "(line 250,col 5)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getGraphvizEdges()",
      "begin_line": 253,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 55)",
        "(line 256,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getGraphvizNodes()",
      "begin_line": 264,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 267,col 53)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getName()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.isDirected()",
      "begin_line": 279,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNodes()",
      "begin_line": 284,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNeighborNodes(N)",
      "begin_line": 289,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 57)",
        "(line 292,col 5)-(line 292,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNeighborNodes(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 295,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 56)",
        "(line 297,col 5)-(line 300,col 5)",
        "(line 301,col 5)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNeighborNodesIterator(N)",
      "begin_line": 304,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 58)",
        "(line 307,col 5)-(line 307,col 37)",
        "(line 308,col 5)-(line 308,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getEdges()",
      "begin_line": 311,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 56)",
        "(line 314,col 5)-(line 318,col 5)",
        "(line 319,col 5)-(line 319,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.getNodeDegree(N)",
      "begin_line": 322,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 50)",
        "(line 325,col 5)-(line 325,col 64)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedDirectedGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode"
      ],
      "begin_line": 332,
      "end_line": 424,
      "comment": "\n   * A directed graph node that stores outgoing edges and incoming edges as an\n   * list within the node itself.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inEdgeList"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outEdgeList"
      ],
      "begin_line": 336,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.LinkedDirectedGraphNode(N)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Constructor\n     *\n     * @param nodeValue Node\u0027s value.\n     ",
      "child_ranges": [
        "(line 347,col 7)-(line 347,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getValue()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 7)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getAnnotation()",
      "begin_line": 355,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 357,col 7)-(line 358,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 361,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 363,col 7)-(line 364,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getColor()",
      "begin_line": 367,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 369,col 7)-(line 369,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getId()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 7)-(line 374,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getLabel()",
      "begin_line": 377,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 379,col 7)-(line 379,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.toString()",
      "begin_line": 382,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 7)-(line 384,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getInEdges()",
      "begin_line": 387,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 7)-(line 389,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.getOutEdges()",
      "begin_line": 392,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 394,col 7)-(line 394,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.neighborIterator()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 7)-(line 398,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NeighborIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e\u003e"
      ],
      "begin_line": 401,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.NeighborIterator.hasNext()",
      "begin_line": 406,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.NeighborIterator.next()",
      "begin_line": 411,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 38)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 415,col 49)",
        "(line 416,col 9)-(line 416,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode.NeighborIterator.remove()",
      "begin_line": 419,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedDirectedGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphNode\u003cN, E\u003e"
      ],
      "begin_line": 429,
      "end_line": 451,
      "comment": "\n   * A directed graph node with annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode.AnnotatedLinkedDirectedGraphNode(N)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * @param nodeValue Node\u0027s value.\n     ",
      "child_ranges": [
        "(line 438,col 7)-(line 438,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode.getAnnotation()",
      "begin_line": 441,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 447,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 7)-(line 449,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedDirectedGraphEdge",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge"
      ],
      "begin_line": 457,
      "end_line": 549,
      "comment": "\n   * A directed graph edge that stores the source and destination nodes at each\n   * edge.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceNode"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destNode"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.LinkedDirectedGraphEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 471,
      "end_line": 476,
      "comment": "\n     * Constructor.\n     *\n     * @param edgeValue Edge Value.\n     ",
      "child_ranges": [
        "(line 473,col 7)-(line 473,col 29)",
        "(line 474,col 7)-(line 474,col 35)",
        "(line 475,col 7)-(line 475,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getSource()",
      "begin_line": 478,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 480,col 7)-(line 480,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getDestination()",
      "begin_line": 483,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 485,col 7)-(line 485,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.setDestination(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 488,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 7)-(line 490,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.setSource(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 7)-(line 495,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getValue()",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 7)-(line 500,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getAnnotation()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 505,col 7)-(line 506,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 509,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 511,col 7)-(line 512,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getColor()",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 7)-(line 517,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getLabel()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 7)-(line 522,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getNode1Id()",
      "begin_line": 525,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 527,col 7)-(line 527,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getNode2Id()",
      "begin_line": 530,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.toString()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 537,col 7)-(line 537,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getNodeA()",
      "begin_line": 540,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 7)-(line 542,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge.getNodeB()",
      "begin_line": 545,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 7)-(line 547,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedDirectedGraphEdge",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedDirectedGraph.LinkedDirectedGraphEdge\u003cN, E\u003e"
      ],
      "begin_line": 555,
      "end_line": 580,
      "comment": "\n   * A directed graph edge that stores the source and destination nodes at each\n   * edge.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 558,
      "end_line": 558,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge.AnnotatedLinkedDirectedGraphEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 565,
      "end_line": 568,
      "comment": "\n     * Constructor.\n     *\n     * @param edgeValue Edge Value.\n     ",
      "child_ranges": [
        "(line 567,col 7)-(line 567,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge.getAnnotation()",
      "begin_line": 570,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 573,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedDirectedGraph.AnnotatedLinkedDirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 7)-(line 578,col 24)"
      ]
    }
  ]
}