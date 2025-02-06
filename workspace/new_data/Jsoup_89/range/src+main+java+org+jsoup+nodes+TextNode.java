{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/TextNode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextNode",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 12,
      "end_line": 148,
      "comment": "\n A text node.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.TextNode.TextNode(java.lang.String)",
      "begin_line": 20,
      "end_line": 22,
      "comment": "\n     Create a new TextNode representing the supplied (unencoded) text).\n\n     @param text raw text\n     @see #createFromEncoded(String)\n     ",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.TextNode.TextNode(java.lang.String, java.lang.String)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     Create a new TextNode representing the supplied (unencoded) text).\n\n     @param text raw text\n     @param baseUri base uri - ignored for this node type\n     @see #createFromEncoded(String, String)\n     @deprecated use {@link TextNode#TextNode(String)}\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.nodeName()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Get the text content of this text node.\n     * @return Unencoded, normalised text.\n     * @see TextNode#getWholeText()\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text(java.lang.String)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Set the text content of this text node.\n     * @param text unencoded text\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)",
        "(line 56,col 9)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.getWholeText()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     Get the (unencoded) text of this text node, including any newlines and spaces present in the original.\n     @return text\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.isBlank()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     Test if this text node is blank -- that is, empty or only whitespace (including newlines).\n     @return true if this document is empty or only whitespace, false if it contains any text content.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.splitText(int)",
      "begin_line": 81,
      "end_line": 94,
      "comment": "\n     * Split this text node into two nodes at the specified string offset. After splitting, this node will contain the\n     * original text up to the offset, and will have a new text node sibling containing the text after the offset.\n     * @param offset string offset point to split node at.\n     * @return the newly created text node containing the text after the offset.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 40)",
        "(line 83,col 9)-(line 83,col 77)",
        "(line 84,col 9)-(line 84,col 109)",
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 45)",
        "(line 88,col 9)-(line 88,col 19)",
        "(line 89,col 9)-(line 89,col 47)",
        "(line 90,col 9)-(line 91,col 61)",
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 98,col 38)",
        "(line 100,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 102,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.toString()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Create a new TextNode from HTML encoded (aka escaped) data.\n     * @param encodedText Text containing encoded HTML (e.g. \u0026amp;lt;)\n     * @param baseUri Base uri\n     * @return TextNode containing unencoded data (e.g. \u0026lt;)\n     * @deprecated use {@link TextNode#createFromEncoded(String)} instead, as LeafNodes don\u0027t carry base URIs.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 53)",
        "(line 121,col 9)-(line 121,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.createFromEncoded(java.lang.String)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * Create a new TextNode from HTML encoded (aka escaped) data.\n     * @param encodedText Text containing encoded HTML (e.g. \u0026amp;lt;)\n     * @return TextNode containing unencoded data (e.g. \u0026lt;)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.normaliseWhitespace(java.lang.String)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.stripLeadingWhitespace(java.lang.String)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.lastCharIsWhitespace(java.lang.StringBuilder)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 69)"
      ]
    }
  ]
}