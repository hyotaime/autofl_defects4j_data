{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/graph/GraphColoring.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphColoring",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 168,
      "comment": "\n * Annotates the graph with a color in a way that no connected node will have\n * the same color. Nodes of the same color cab then be partitioned together and\n * be represented by a super node. This class will merely annotate the nodes\n * with a color using {@link GraphNode#setAnnotation(Annotation)} and provide\n * a node to super node mapping with {@link #getPartitionSuperNode(Object)}. The\n * give graph itself will not be modified.\n *\n * \u003cp\u003eThis algorithm is \u003cb\u003eNOT\u003c/b\u003e deterministic by default. Passes that\n * requires deterministic output should provide a {@code Comparator} in the\n * constructor as a tie-breaker. This tie-break will be used when deciding\n * which node should be colored first when multiple nodes have the same degree.\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "colorToNodeMap"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " color 5 will now use the name \"foo\"."
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.color()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n   * Annotates the graph with {@link Color} objects using\n   * {@link GraphNode#setAnnotation(Annotation)}.\n   *\n   * @return The number of unique colors need.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.getPartitionSuperNode(N)",
      "begin_line": 71,
      "end_line": 82,
      "comment": "\n   * Using the coloring as partitions, finds the node that represents that\n   * partition as the super node. The first to retrieve its partition will\n   * become the super node.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 73,col 64)",
        "(line 74,col 5)-(line 74,col 54)",
        "(line 75,col 5)-(line 75,col 45)",
        "(line 76,col 5)-(line 81,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.getGraph()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Color",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotation"
      ],
      "begin_line": 88,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.Color(int)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 7)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.equals(java.lang.Object)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 97,col 7)-(line 101,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.hashCode()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GreedyGraphColoring",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.GraphColoring\u003cN, E\u003e"
      ],
      "begin_line": 113,
      "end_line": 167,
      "comment": "\n   * Greedily assign nodes with high degree unique colors.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tieBreaker"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 117,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e, java.util.Comparator\u003cN\u003e)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * @param tieBreaker In case of a tie between two nodes of the same degree,\n     *     this comparator will determine which node should be colored first.\n     ",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 19)",
        "(line 127,col 7)-(line 127,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.color()",
      "begin_line": 130,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 35)",
        "(line 133,col 7)-(line 133,col 76)",
        "(line 136,col 7)-(line 144,col 9)",
        "(line 148,col 7)-(line 148,col 20)",
        "(line 149,col 7)-(line 161,col 36)",
        "(line 162,col 7)-(line 163,col 40)",
        "(line 164,col 7)-(line 164,col 27)",
        "(line 165,col 7)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.Anonymous-2fd0205a-fead-4946-b01e-78e308ae4874.compare(com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e)",
      "begin_line": 137,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 11)-(line 140,col 47)",
        "(line 141,col 11)-(line 142,col 72)"
      ]
    }
  ]
}