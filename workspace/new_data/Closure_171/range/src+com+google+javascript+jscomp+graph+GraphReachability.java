{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/GraphReachability.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphReachability",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cN, E\u003e"
      ],
      "begin_line": 33,
      "end_line": 101,
      "comment": "\n * Computes all the reachable nodes. Upon execution of {@link #compute(Object)},\n * the graph nodes will be annotated with {@link #REACHABLE} if it is reachable\n * from the specified entry node.\n *\n * @param \u003cN\u003e The type of data that the graph node holds.\n * @param \u003cE\u003e The type of data that the graph edge holds.\n *\n * @see GraphNode#getAnnotation()\n "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " FixedPointGraphTraversal accepts them."
    },
    {
      "type": "field",
      "varNames": [
        "edgePredicate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.GraphReachability(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.GraphReachability(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.GraphReachability.EdgeTuple\u003cN, E\u003e\u003e)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n   * @param graph The graph.\n   * @param edgePredicate Given the predecessor P of the a node S and the edge\n   *      coming from P to S, this predicate should return true if S is\n   *      reachable from P using the edge.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 23)",
        "(line 54,col 5)-(line 54,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.compute(N)",
      "begin_line": 57,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 33)",
        "(line 59,col 5)-(line 59,col 50)",
        "(line 60,col 5)-(line 61,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.recompute(N)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 64)",
        "(line 66,col 5)-(line 66,col 72)",
        "(line 67,col 5)-(line 67,col 42)",
        "(line 68,col 5)-(line 69,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.traverseEdge(N, E, N)",
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 82,col 5)",
        "(line 83,col 5)-(line 83,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "REACHABLE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EdgeTuple",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 91,
      "end_line": 100,
      "comment": "\n   * Represents Source Node, Edge and Destination Node.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceNode"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edge"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destNode"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple.EdgeTuple(N, E, N)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 96,col 7)-(line 96,col 35)",
        "(line 97,col 7)-(line 97,col 23)",
        "(line 98,col 7)-(line 98,col 31)"
      ]
    }
  ]
}