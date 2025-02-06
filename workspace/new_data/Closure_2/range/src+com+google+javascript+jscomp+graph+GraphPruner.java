{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/GraphPruner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphPruner",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 100,
      "comment": "\n * Prunes a graph, creating a new graph with nodes removed.\n *\n * If a node is removed from the graph, any paths through that node\n * will be replaced with edges. In other words, if A and B are nodes\n * in the original graph and the pruned graph, then there exists a path\n * from A -\u003e B in the original graph iff there\u0027s a path from A -\u003e B\n * in the pruned graph.\n *\n * We do not make any guarantees about what edges are in the pruned graph.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.GraphPruner(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.prune(com.google.common.base.Predicate\u003cN\u003e)",
      "begin_line": 43,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 60)",
        "(line 48,col 5)-(line 58,col 5)",
        "(line 62,col 5)-(line 63,col 37)",
        "(line 64,col 5)-(line 80,col 5)",
        "(line 82,col 5)-(line 82,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphPruner.cloneGraph(com.google.javascript.jscomp.graph.DiGraph\u003cN, E\u003e)",
      "begin_line": 85,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 70)",
        "(line 88,col 5)-(line 96,col 5)",
        "(line 98,col 5)-(line 98,col 20)"
      ]
    }
  ]
}