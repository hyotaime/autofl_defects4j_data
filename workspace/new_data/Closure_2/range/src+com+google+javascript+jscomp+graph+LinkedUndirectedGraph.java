{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/LinkedUndirectedGraph.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedUndirectedGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.UndiGraph\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph"
      ],
      "begin_line": 39,
      "end_line": 487,
      "comment": "\n * An undirected graph using linked list within nodes to store edge\n * information.\n *\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.newSubGraph()",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createWithoutAnnotations()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createWithNodeAnnotations()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createWithEdgeAnnotations()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.create()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "useNodeAnnotations"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useEdgeAnnotations"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraph(boolean, boolean)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 49)",
        "(line 71,col 5)-(line 71,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.connect(N, E, N)",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 66)",
        "(line 77,col 5)-(line 77,col 68)",
        "(line 78,col 5)-(line 81,col 66)",
        "(line 82,col 5)-(line 82,col 37)",
        "(line 83,col 5)-(line 83,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.disconnect(N, N)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 66)",
        "(line 89,col 5)-(line 89,col 68)",
        "(line 90,col 5)-(line 94,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createUndirectedGraphNode(N)",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 64)",
        "(line 101,col 5)-(line 106,col 5)",
        "(line 107,col 5)-(line 107,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNeighborNodes(N)",
      "begin_line": 110,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 62)",
        "(line 113,col 5)-(line 113,col 58)",
        "(line 114,col 5)-(line 117,col 5)",
        "(line 118,col 5)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNeighborNodesIterator(N)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 62)",
        "(line 124,col 5)-(line 124,col 75)",
        "(line 125,col 5)-(line 125,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphEdges(N, N)",
      "begin_line": 128,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 47)",
        "(line 132,col 5)-(line 134,col 5)",
        "(line 135,col 5)-(line 135,col 47)",
        "(line 136,col 5)-(line 138,col 5)",
        "(line 139,col 5)-(line 139,col 59)",
        "(line 140,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphNode(N)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphNodes()",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createNode(N)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getEdges(N, N)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 167,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getFirstEdge(N, N)",
      "begin_line": 170,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 51)",
        "(line 173,col 5)-(line 173,col 51)",
        "(line 174,col 5)-(line 178,col 5)",
        "(line 179,col 5)-(line 179,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNode(N)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, N)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, E, N)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, com.google.common.base.Predicate\u003cE\u003e, N)",
      "begin_line": 197,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 47)",
        "(line 199,col 5)-(line 201,col 5)",
        "(line 202,col 5)-(line 202,col 47)",
        "(line 203,col 5)-(line 205,col 5)",
        "(line 206,col 5)-(line 213,col 5)",
        "(line 214,col 5)-(line 214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getGraphvizEdges()",
      "begin_line": 217,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 55)",
        "(line 220,col 5)-(line 226,col 5)",
        "(line 227,col 5)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getName()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getGraphvizNodes()",
      "begin_line": 235,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 238,col 53)",
        "(line 239,col 5)-(line 241,col 5)",
        "(line 242,col 5)-(line 242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isDirected()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNodes()",
      "begin_line": 250,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getEdges()",
      "begin_line": 255,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 56)",
        "(line 259,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 266,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNodeDegree(N)",
      "begin_line": 269,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 62)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 275,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedUndirectedGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode"
      ],
      "begin_line": 282,
      "end_line": 364,
      "comment": "\n   * An undirected graph node that stores outgoing edges and incoming edges as\n   * an list within the node itself.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "neighborList"
      ],
      "begin_line": 285,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.LinkedUndirectedGraphNode(N)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getNeighborEdges()",
      "begin_line": 293,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 7)-(line 295,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getNeighborEdgesIterator()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 7)-(line 300,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getAnnotation()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 306,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 309,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 312,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getValue()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 317,col 7)-(line 317,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getColor()",
      "begin_line": 320,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 7)-(line 322,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getId()",
      "begin_line": 325,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getLabel()",
      "begin_line": 330,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 332,col 7)-(line 332,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.neighborIterator()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 336,col 7)-(line 336,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NeighborIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e\u003e"
      ],
      "begin_line": 339,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edgeIterator"
      ],
      "begin_line": 341,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.hasNext()",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.next()",
      "begin_line": 349,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.remove()",
      "begin_line": 359,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedUndirectedGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode\u003cN, E\u003e"
      ],
      "begin_line": 369,
      "end_line": 388,
      "comment": "\n   * An undirected graph node with annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.AnnotatedLinkedUndirectedGraphNode(N)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 7)-(line 375,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.getAnnotation()",
      "begin_line": 378,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 7)-(line 381,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 7)-(line 386,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedUndirectedGraphEdge",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge\u003cN, E\u003e",
        "com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge"
      ],
      "begin_line": 393,
      "end_line": 460,
      "comment": "\n   * An undirected graph edge that stores two nodes at each edge.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodeA"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeB"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.LinkedUndirectedGraphEdge(com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e)",
      "begin_line": 400,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 402,col 7)-(line 402,col 29)",
        "(line 403,col 7)-(line 403,col 25)",
        "(line 404,col 7)-(line 404,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getValue()",
      "begin_line": 407,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 409,col 7)-(line 409,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNodeA()",
      "begin_line": 412,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 7)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNodeB()",
      "begin_line": 417,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 7)-(line 419,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getAnnotation()",
      "begin_line": 422,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 424,col 7)-(line 425,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 430,col 7)-(line 431,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getColor()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 436,col 7)-(line 436,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getLabel()",
      "begin_line": 439,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 7)-(line 441,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNode1Id()",
      "begin_line": 444,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 447,col 7)-(line 447,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNode2Id()",
      "begin_line": 450,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 7)-(line 453,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.toString()",
      "begin_line": 456,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 7)-(line 458,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedUndirectedGraphEdge",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge\u003cN, E\u003e"
      ],
      "begin_line": 465,
      "end_line": 486,
      "comment": "\n   * An annotated undirected graph edge..\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.AnnotatedLinkedUndirectedGraphEdge(com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e)",
      "begin_line": 470,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 7)-(line 473,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.getAnnotation()",
      "begin_line": 476,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 479,col 7)-(line 479,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 482,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 484,col 7)-(line 484,col 24)"
      ]
    }
  ]
}