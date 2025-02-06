{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/Comment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Comment",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 12,
      "end_line": 85,
      "comment": "\n A comment node.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "COMMENT_KEY"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Comment.Comment(java.lang.String)",
      "begin_line": 19,
      "end_line": 21,
      "comment": "\n     Create a new comment node.\n     @param data The contents of the comment\n     ",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.Comment.Comment(java.lang.String, java.lang.String)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "\n     Create a new comment node.\n     @param data The contents of the comment\n     @param baseUri base URI not used. This is a leaf node.\n     @deprecated\n     ",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.nodeName()",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.getData()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     Get the contents of the comment.\n     @return comment content\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 45,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 47,col 38)",
        "(line 48,col 9)-(line 51,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.toString()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.isXmlDeclaration()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Check if this comment looks like an XML Declaration.\n     * @return true if it looks like, maybe, it\u0027s an XML Declaration.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)",
        "(line 67,col 9)-(line 67,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.Comment.asXmlDeclaration()",
      "begin_line": 74,
      "end_line": 84,
      "comment": "\n     * Attempt to cast this comment to an XML Declaration note.\n     * @return an XML declaration if it could be parsed as one, null otherwise.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 32)",
        "(line 76,col 9)-(line 76,col 115)",
        "(line 77,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 20)"
      ]
    }
  ]
}