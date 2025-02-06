{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/GraphReachability.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphReachability",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003cN, E\u003e"
      ],
      "begin_line": 30,
      "end_line": 98,
      "comment": "\n * Computes all the reachable nodes. Upon execution of {@link #compute(Object)},\n * the graph nodes will be annotated with {@link #REACHABLE} if it is reachable\n * from the specified entry node.\n *\n * @see GraphNode#getAnnotation()\n "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " FixedPointGraphTraversal accepts them."
    },
    {
      "type": "field",
      "varNames": [
        "edgePredicate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.GraphReachability(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.GraphReachability(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.GraphReachability.EdgeTuple\u003cN, E\u003e\u003e)",
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n   * @param graph The graph.\n   * @param edgePredicate Given the predecessor P of the a node S and the edge\n   *      coming from P to S, this predicate should return true if S is\n   *      reachable from P using the edge.\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 23)",
        "(line 51,col 5)-(line 51,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.compute(N)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 33)",
        "(line 56,col 5)-(line 56,col 50)",
        "(line 57,col 5)-(line 58,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.recompute(N)",
      "begin_line": 61,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 64)",
        "(line 63,col 5)-(line 63,col 72)",
        "(line 64,col 5)-(line 64,col 42)",
        "(line 65,col 5)-(line 66,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.traverseEdge(N, E, N)",
      "begin_line": 69,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 79,col 5)",
        "(line 80,col 5)-(line 80,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "REACHABLE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "EdgeTuple",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 97,
      "comment": "\n   * Represents Source Node, Edge and Destination Node.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceNode"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "edge"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "destNode"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple.EdgeTuple(N, E, N)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 93,col 35)",
        "(line 94,col 7)-(line 94,col 23)",
        "(line 95,col 7)-(line 95,col 31)"
      ]
    }
  ]
}