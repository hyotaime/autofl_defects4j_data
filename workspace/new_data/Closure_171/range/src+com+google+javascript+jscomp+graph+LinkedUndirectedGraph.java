{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/LinkedUndirectedGraph.java",
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
      "end_line": 486,
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
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 58)",
        "(line 113,col 5)-(line 116,col 5)",
        "(line 117,col 5)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNeighborNodesIterator(N)",
      "begin_line": 120,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 62)",
        "(line 123,col 5)-(line 123,col 75)",
        "(line 124,col 5)-(line 124,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphEdges(N, N)",
      "begin_line": 127,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 47)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 134,col 5)-(line 134,col 47)",
        "(line 135,col 5)-(line 137,col 5)",
        "(line 138,col 5)-(line 138,col 59)",
        "(line 139,col 5)-(line 143,col 5)",
        "(line 144,col 5)-(line 144,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphNode(N)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getUndirectedGraphNodes()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 155,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createNode(N)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getEdges(N, N)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 166,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getFirstEdge(N, N)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 51)",
        "(line 172,col 5)-(line 172,col 51)",
        "(line 173,col 5)-(line 177,col 5)",
        "(line 178,col 5)-(line 178,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNode(N)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, N)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, E, N)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isConnected(N, com.google.common.base.Predicate\u003cE\u003e, N)",
      "begin_line": 196,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 47)",
        "(line 198,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 47)",
        "(line 202,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 212,col 5)",
        "(line 213,col 5)-(line 213,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getGraphvizEdges()",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 55)",
        "(line 219,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getName()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getGraphvizNodes()",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 237,col 53)",
        "(line 238,col 5)-(line 240,col 5)",
        "(line 241,col 5)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.isDirected()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNodes()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getEdges()",
      "begin_line": 254,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 56)",
        "(line 258,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.getNodeDegree(N)",
      "begin_line": 268,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 62)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 43)"
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
      "begin_line": 281,
      "end_line": 363,
      "comment": "\n   * An undirected graph node that stores outgoing edges and incoming edges as\n   * an list within the node itself.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "neighborList"
      ],
      "begin_line": 284,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.LinkedUndirectedGraphNode(N)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getNeighborEdges()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getNeighborEdgesIterator()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getAnnotation()",
      "begin_line": 302,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 304,col 7)-(line 305,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 310,col 7)-(line 311,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getValue()",
      "begin_line": 314,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 7)-(line 316,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getColor()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 7)-(line 321,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getId()",
      "begin_line": 324,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.getLabel()",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 7)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.neighborIterator()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NeighborIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003ccom.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e\u003e"
      ],
      "begin_line": 338,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edgeIterator"
      ],
      "begin_line": 340,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.hasNext()",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.next()",
      "begin_line": 348,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 55)",
        "(line 351,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode.NeighborIterator.remove()",
      "begin_line": 358,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedUndirectedGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphNode\u003cN, E\u003e"
      ],
      "begin_line": 368,
      "end_line": 387,
      "comment": "\n   * An undirected graph node with annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.AnnotatedLinkedUndirectedGraphNode(N)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 7)-(line 374,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.getAnnotation()",
      "begin_line": 377,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 7)-(line 380,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 7)-(line 385,col 24)"
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
      "begin_line": 392,
      "end_line": 459,
      "comment": "\n   * An undirected graph edge that stores two nodes at each edge.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodeA"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodeB"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.LinkedUndirectedGraphEdge(com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e)",
      "begin_line": 399,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 29)",
        "(line 402,col 7)-(line 402,col 25)",
        "(line 403,col 7)-(line 403,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getValue()",
      "begin_line": 406,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 7)-(line 408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNodeA()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 7)-(line 413,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNodeB()",
      "begin_line": 416,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 7)-(line 418,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getAnnotation()",
      "begin_line": 421,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 423,col 7)-(line 424,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 427,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 429,col 7)-(line 430,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getColor()",
      "begin_line": 433,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 7)-(line 435,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getLabel()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 440,col 7)-(line 440,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNode1Id()",
      "begin_line": 443,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 446,col 7)-(line 446,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.getNode2Id()",
      "begin_line": 449,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 452,col 7)-(line 452,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge.toString()",
      "begin_line": 455,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnnotatedLinkedUndirectedGraphEdge",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.LinkedUndirectedGraphEdge\u003cN, E\u003e"
      ],
      "begin_line": 464,
      "end_line": 485,
      "comment": "\n   * An annotated undirected graph edge..\n   "
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.AnnotatedLinkedUndirectedGraphEdge(com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e, E, com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode\u003cN, E\u003e)",
      "begin_line": 469,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 472,col 7)-(line 472,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.getAnnotation()",
      "begin_line": 475,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 478,col 7)-(line 478,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.LinkedUndirectedGraph.AnnotatedLinkedUndirectedGraphEdge.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 481,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 483,col 7)-(line 483,col 24)"
      ]
    }
  ]
}