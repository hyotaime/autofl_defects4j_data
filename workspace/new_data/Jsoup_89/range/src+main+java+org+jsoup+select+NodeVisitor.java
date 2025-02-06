{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/select/NodeVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 31,
      "comment": "\n * Node visitor interface. Provide an implementing class to {@link NodeTraversor} to iterate through nodes.\n * \u003cp\u003e\n * This interface provides two methods, {@code head} and {@code tail}. The head method is called when the node is first\n * seen, and the tail method when all of the node\u0027s children have been visited. As an example, head can be used to\n * create a start tag for a node, and tail to create the end tag.\n * \u003c/p\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeVisitor.head(org.jsoup.nodes.Node, int)",
      "begin_line": 21,
      "end_line": 21,
      "comment": "\n     * Callback for when a node is first visited.\n     *\n     * @param node the node being visited.\n     * @param depth the depth of the node, relative to the root node. E.g., the root node has depth 0, and a child node\n     * of that will have depth 1.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeVisitor.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * Callback for when a node is last visited, after all of its descendants have been visited.\n     *\n     * @param node the node being visited.\n     * @param depth the depth of the node, relative to the root node. E.g., the root node has depth 0, and a child node\n     * of that will have depth 1.\n     ",
      "child_ranges": []
    }
  ]
}