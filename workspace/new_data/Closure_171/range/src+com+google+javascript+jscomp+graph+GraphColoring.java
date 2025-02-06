{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/graph/GraphColoring.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraphColoring",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 166,
      "comment": "\n * Annotates the graph with a color in a way that no connected node will have\n * the same color. Nodes of the same color cab then be partitioned together and\n * be represented by a super node. This class will merely annotate the nodes\n * with a color using {@link GraphNode#setAnnotation(Annotation)} and provide\n * a node to super node mapping with {@link #getPartitionSuperNode(Object)}. The\n * give graph itself will not be modified.\n *\n * \u003cp\u003eThis algorithm is \u003cb\u003eNOT\u003c/b\u003e deterministic by default. Passes that\n * requires deterministic output should provide a {@code Comparator} in the\n * constructor as a tie-breaker. This tie-break will be used when deciding\n * which node should be colored first when multiple nodes have the same degree.\n *\n * @param \u003cN\u003e Value type that the graph node stores.\n * @param \u003cE\u003e Value type that the graph edge stores.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "colorToNodeMap"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " color 5 will now use the name \"foo\"."
    },
    {
      "type": "field",
      "varNames": [
        "graph"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.color()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * Annotates the graph with {@link Color} objects using\n   * {@link GraphNode#setAnnotation(Annotation)}.\n   *\n   * @return The number of unique colors need.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.getPartitionSuperNode(N)",
      "begin_line": 68,
      "end_line": 79,
      "comment": "\n   * Using the coloring as partitions, finds the node that represents that\n   * partition as the super node. The first to retrieve its partition will\n   * become the super node.\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 70,col 64)",
        "(line 71,col 5)-(line 71,col 54)",
        "(line 72,col 5)-(line 72,col 45)",
        "(line 73,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.getGraph()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Color",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.Annotation"
      ],
      "begin_line": 86,
      "end_line": 106,
      "comment": " The color of a node "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.Color(int)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.equals(java.lang.Object)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 99,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.Color.hashCode()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GreedyGraphColoring",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.GraphColoring\u003cN, E\u003e"
      ],
      "begin_line": 111,
      "end_line": 165,
      "comment": "\n   * Greedily assign nodes with high degree unique colors.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tieBreaker"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.GreedyGraphColoring(com.google.javascript.jscomp.graph.AdjacencyGraph\u003cN, E\u003e, java.util.Comparator\u003cN\u003e)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * @param tieBreaker In case of a tie between two nodes of the same degree,\n     *     this comparator will determine which node should be colored first.\n     ",
      "child_ranges": [
        "(line 124,col 7)-(line 124,col 19)",
        "(line 125,col 7)-(line 125,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.color()",
      "begin_line": 128,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 130,col 35)",
        "(line 131,col 7)-(line 131,col 76)",
        "(line 134,col 7)-(line 142,col 9)",
        "(line 146,col 7)-(line 146,col 20)",
        "(line 147,col 7)-(line 159,col 36)",
        "(line 160,col 7)-(line 161,col 40)",
        "(line 162,col 7)-(line 162,col 27)",
        "(line 163,col 7)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring.Anonymous-356c1be8-761b-491e-92c6-03f711695491.compare(com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e, com.google.javascript.jscomp.graph.GraphNode\u003cN, E\u003e)",
      "begin_line": 135,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 137,col 11)-(line 138,col 47)",
        "(line 139,col 11)-(line 140,col 72)"
      ]
    }
  ]
}