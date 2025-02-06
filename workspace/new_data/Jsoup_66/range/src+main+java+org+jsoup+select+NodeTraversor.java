{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/NodeTraversor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeTraversor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 139,
      "comment": "\n * Depth-first node traversor. Use to iterate through all nodes under and including the specified root node.\n * \u003cp\u003e\n * This implementation does not use recursion, so a deep DOM does not risk blowing the stack.\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "visitor"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.NodeTraversor.NodeTraversor(org.jsoup.select.NodeVisitor)",
      "begin_line": 22,
      "end_line": 24,
      "comment": "\n     * Create a new traversor.\n     * @param visitor a class implementing the {@link NodeVisitor} interface, to be called when visiting each node.\n     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.\n     ",
      "child_ranges": [
        "(line 23,col 9)-(line 23,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.traverse(org.jsoup.nodes.Node)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     * Start a depth-first traverse of the root and all of its descendants.\n     * @param root the root node point to traverse.\n     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.traverse(org.jsoup.select.NodeVisitor, org.jsoup.nodes.Node)",
      "begin_line": 40,
      "end_line": 61,
      "comment": "\n     * Start a depth-first traverse of the root and all of its descendants.\n     * @param visitor Node visitor.\n     * @param root the root node point to traverse.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 25)",
        "(line 42,col 9)-(line 42,col 22)",
        "(line 44,col 9)-(line 60,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.traverse(org.jsoup.select.NodeVisitor, org.jsoup.select.Elements)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "\n     * Start a depth-first traverse of all elements.\n     * @param visitor Node visitor.\n     * @param elements Elements to filter.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 35)",
        "(line 71,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.filter(org.jsoup.select.NodeFilter, org.jsoup.nodes.Node)",
      "begin_line": 81,
      "end_line": 125,
      "comment": "\n     * Start a depth-first filtering of the root and all of its descendants.\n     * @param filter Node visitor.\n     * @param root the root node point to traverse.\n     * @return The filter result of the root node, or {@link FilterResult#STOP}.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 25)",
        "(line 83,col 9)-(line 83,col 22)",
        "(line 85,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.filter(org.jsoup.select.NodeFilter, org.jsoup.select.Elements)",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Start a depth-first filtering of all elements.\n     * @param filter Node filter.\n     * @param elements Elements to filter.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 33)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 137,col 22)"
      ]
    }
  ]
}