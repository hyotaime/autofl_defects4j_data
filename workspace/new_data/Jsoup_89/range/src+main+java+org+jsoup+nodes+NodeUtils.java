{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/NodeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 10,
      "end_line": 27,
      "comment": "\n * Internal helpers for Nodes, to keep the actual node APIs relatively clean. A jsoup internal class, so don\u0027t use it as\n * there is no contract API).\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.NodeUtils.outputSettings(org.jsoup.nodes.Node)",
      "begin_line": 15,
      "end_line": 18,
      "comment": "\n     * Get the output setting for this node,  or if this node has no document (or parent), retrieve the default output\n     * settings\n     ",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 46)",
        "(line 17,col 9)-(line 17,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.NodeUtils.parser(org.jsoup.nodes.Node)",
      "begin_line": 23,
      "end_line": 26,
      "comment": "\n     * Get the parser that was used to make this node, or the default HTML parser if it has no parent.\n     ",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 44)",
        "(line 25,col 9)-(line 25,col 102)"
      ]
    }
  ]
}