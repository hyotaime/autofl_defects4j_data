{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/select/NodeFilter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeFilter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 58,
      "comment": "\n * Node filter interface. Provide an implementing class to {@link NodeTraversor} to iterate through nodes.\n * \u003cp\u003e\n * This interface provides two methods, {@code head} and {@code tail}. The head method is called when the node is first\n * seen, and the tail method when all of the node\u0027s children have been visited. As an example, head can be used to\n * create a start tag for a node, and tail to create the end tag.\n * \u003c/p\u003e\n * \u003cp\u003e\n * For every node, the filter has to decide whether to\n * \u003cul\u003e\n * \u003cli\u003econtinue ({@link FilterResult#CONTINUE}),\u003c/li\u003e\n * \u003cli\u003eskip all children ({@link FilterResult#SKIP_CHILDREN}),\u003c/li\u003e\n * \u003cli\u003eskip node entirely ({@link FilterResult#SKIP_ENTIRELY}),\u003c/li\u003e\n * \u003cli\u003eremove the subtree ({@link FilterResult#REMOVE}),\u003c/li\u003e\n * \u003cli\u003einterrupt the iteration and return ({@link FilterResult#STOP}).\u003c/li\u003e\n * \u003c/ul\u003e\n * The difference between {@link FilterResult#SKIP_CHILDREN} and {@link FilterResult#SKIP_ENTIRELY} is that the first\n * will invoke {@link NodeFilter#tail(Node, int)} on the node, while the latter will not.\n * Within {@link NodeFilter#tail(Node, int)}, both are equivalent to {@link FilterResult#CONTINUE}.\n * \u003c/p\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Callback for when a node is first visited.\n     * @param node the node being visited.\n     * @param depth the depth of the node, relative to the root node. E.g., the root node has depth 0, and a child node of that will have depth 1.\n     * @return Filter decision\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.select.NodeFilter.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Callback for when a node is last visited, after all of its descendants have been visited.\n     * @param node the node being visited.\n     * @param depth the depth of the node, relative to the root node. E.g., the root node has depth 0, and a child node of that will have depth 1.\n     * @return Filter decision\n     ",
      "child_ranges": []
    }
  ]
}