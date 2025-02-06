{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/select/NodeTraversor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeTraversor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 47,
      "comment": "\n * Depth-first node traversor. Use to iterate through all nodes under and including the specified root node.\n * \u003cp/\u003e\n * This implementation does not use recursion, so a deep DOM does not risk blowing the stack.\n "
    },
    {
      "type": "field",
      "varNames": [
        "visitor"
      ],
      "begin_line": 11,
      "end_line": 11,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.select.NodeTraversor.NodeTraversor(org.jsoup.select.NodeVisitor)",
      "begin_line": 17,
      "end_line": 19,
      "comment": "\n     * Create a new traversor.\n     * @param visitor a class implementing the {@link NodeVisitor} interface, to be called when visiting each node.\n     ",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeTraversor.traverse(org.jsoup.nodes.Node)",
      "begin_line": 25,
      "end_line": 46,
      "comment": "\n     * Start a depth-first traverse of the root and all of its descendants.\n     * @param root the root node point to traverse.\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 25)",
        "(line 27,col 9)-(line 27,col 22)",
        "(line 29,col 9)-(line 45,col 9)"
      ]
    }
  ]
}