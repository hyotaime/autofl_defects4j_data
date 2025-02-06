{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/GraphPruner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphPruner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 103,
      "comment": "\n * Prunes a graph, creating a new graph with nodes removed.\n *\n * If a node is removed from the graph, any paths through that node\n * will be replaced with edges. In other words, if A and B are nodes\n * in the original graph and the pruned graph, then there exists a path\n * from A -\u003e B in the original graph iff there\u0027s a path from A -\u003e B\n * in the pruned graph.\n *\n * We do not make any guarantees about what edges are in the pruned graph.\n *\n * @param \u003cN\u003e The type of data that the graph node holds.\n * @param \u003cE\u003e The type of data that the graph edge holds.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.GraphPruner(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.prune(com.google.common.base.Predicate\u003cN\u003e)",
      "begin_line": 46,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 60)",
        "(line 51,col 5)-(line 61,col 5)",
        "(line 65,col 5)-(line 66,col 37)",
        "(line 67,col 5)-(line 83,col 5)",
        "(line 85,col 5)-(line 85,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.cloneGraph(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 88,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 70)",
        "(line 91,col 5)-(line 99,col 5)",
        "(line 101,col 5)-(line 101,col 20)"
      ]
    }
  ]
}