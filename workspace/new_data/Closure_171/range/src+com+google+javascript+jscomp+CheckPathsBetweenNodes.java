{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckPathsBetweenNodes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckPathsBetweenNodes",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 230,
      "comment": "\n * See constructor, {@link #CheckPathsBetweenNodes(DiGraph,\n * DiGraphNode, DiGraphNode, Predicate, Predicate)}, for a\n * description of this algorithm.\n *\n *\n * @param \u003cN\u003e The node type.\n * @param \u003cE\u003e The edge type.\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodePredicate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edgePredicate"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inclusive"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BACK_EDGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " A non-tree edge in the DFS that connects a node to one of its ancestors."
    },
    {
      "type": "field",
      "varNames": [
        "VISITED_EDGE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WHITE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Not yet visited."
    },
    {
      "type": "field",
      "varNames": [
        "GRAY"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Being visited."
    },
    {
      "type": "field",
      "varNames": [
        "BLACK"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Finished visiting."
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.CheckPathsBetweenNodes(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.common.base.Predicate\u003cN\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cN, E\u003e\u003e, boolean)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n   * Given a graph G with nodes A and B, this algorithm determines if all paths\n   * from A to B contain at least one node satisfying a given predicate.\n   *\n   * Note that nodePredicate is not necessarily called for all nodes in G nor is\n   * edgePredicate called for all edges in G.\n   *\n   * @param graph Graph G to analyze.\n   * @param a The node A.\n   * @param b The node B.\n   * @param nodePredicate Predicate which at least one node on each path from an\n   *     A node to B (inclusive) must match.\n   * @param edgePredicate Edges to consider as part of the graph. Edges in\n   *     graph that don\u0027t match edgePredicate will be ignored.\n   * @param inclusive Includes node A and B in the test for the node predicate.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 23)",
        "(line 89,col 5)-(line 89,col 19)",
        "(line 90,col 5)-(line 90,col 17)",
        "(line 91,col 5)-(line 91,col 39)",
        "(line 92,col 5)-(line 92,col 39)",
        "(line 93,col 5)-(line 93,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.CheckPathsBetweenNodes(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.common.base.Predicate\u003cN\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cN, E\u003e\u003e)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n   * Inclusive check.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.allPathsSatisfyPredicate()",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n   * @return true iff all paths contain at least one node that satisfy the\n   *     predicate\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 12)",
        "(line 112,col 5)-(line 112,col 63)",
        "(line 113,col 5)-(line 113,col 15)",
        "(line 114,col 5)-(line 114,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.somePathsSatisfyPredicate()",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n   * @return true iff some paths contain at least one node that satisfy the\n   *     predicate\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 12)",
        "(line 123,col 5)-(line 123,col 64)",
        "(line 124,col 5)-(line 124,col 15)",
        "(line 125,col 5)-(line 125,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.setUp()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 32)",
        "(line 130,col 5)-(line 130,col 32)",
        "(line 131,col 5)-(line 131,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.tearDown()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 31)",
        "(line 136,col 5)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.discoverBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 139,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 26)",
        "(line 141,col 5)-(line 151,col 5)",
        "(line 152,col 5)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.ignoreEdge(com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge\u003cN, E\u003e)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.checkAllPathsWithoutBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 163,
      "end_line": 193,
      "comment": "\n   * Verify that all non-looping paths from {@code a} to {@code b} pass\n   * through at least one node where {@code nodePredicate} is true.\n   ",
      "child_ranges": [
        "(line 165,col 5)-(line 168,col 5)",
        "(line 169,col 5)-(line 171,col 5)",
        "(line 172,col 5)-(line 191,col 5)",
        "(line 192,col 5)-(line 192,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckPathsBetweenNodes.checkSomePathsWithoutBackEdges(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode\u003cN, E\u003e)",
      "begin_line": 199,
      "end_line": 229,
      "comment": "\n   * Verify that some non-looping paths from {@code a} to {@code b} pass\n   * through at least one node where {@code nodePredicate} is true.\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 207,col 5)",
        "(line 208,col 5)-(line 227,col 5)",
        "(line 228,col 5)-(line 228,col 17)"
      ]
    }
  ]
}