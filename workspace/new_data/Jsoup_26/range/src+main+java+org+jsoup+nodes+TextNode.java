{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/nodes/TextNode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextNode",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 10,
      "end_line": 175,
      "comment": "\n A text node.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_KEY"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": "\n    TextNode is a node, and so by default comes with attributes and children. The attributes are seldom used, but use\n    memory, and the child nodes are never used. So we don\u0027t have them, and override accessors to attributes to create\n    them as needed on the fly.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.TextNode.TextNode(java.lang.String, java.lang.String)",
      "begin_line": 26,
      "end_line": 29,
      "comment": "\n     Create a new TextNode representing the supplied (unencoded) text).\n\n     @param text raw text\n     @param baseUri base uri\n     @see #createFromEncoded(String, String)\n     ",
      "child_ranges": [
        "(line 27,col 9)-(line 27,col 31)",
        "(line 28,col 9)-(line 28,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.nodeName()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Get the text content of this text node.\n     * @return Unencoded, normalised text.\n     * @see TextNode#getWholeText()\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text(java.lang.String)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "\n     * Set the text content of this text node.\n     * @param text unencoded text\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 52,col 43)",
        "(line 53,col 9)-(line 53,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.getWholeText()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     Get the (unencoded) text of this text node, including any newlines and spaces present in the original.\n     @return text\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.isBlank()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     Test if this text node is blank -- that is, empty or only whitespace (including newlines).\n     @return true if this document is empty or only whitespace, false if it contains any text content.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.splitText(int)",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n     * Split this text node into two nodes at the specified string offset. After splitting, this node will contain the\n     * original text up to the offset, and will have a new text node sibling containing the text after the offset.\n     * @param offset string offset point to split node at.\n     * @return the newly created text node containing the text after the offset.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 77)",
        "(line 80,col 9)-(line 80,col 109)",
        "(line 82,col 9)-(line 82,col 58)",
        "(line 83,col 9)-(line 83,col 55)",
        "(line 84,col 9)-(line 84,col 19)",
        "(line 85,col 9)-(line 85,col 63)",
        "(line 86,col 9)-(line 87,col 61)",
        "(line 89,col 9)-(line 89,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 92,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 59)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.toString()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Create a new TextNode from HTML encoded (aka escaped) data.\n     * @param encodedText Text containing encoded HTML (e.g. \u0026amp;lt;)\n     * @return TextNode containing unencoded data (e.g. \u0026lt;)\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.normaliseWhitespace(java.lang.String)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 52)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.stripLeadingWhitespace(java.lang.String)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.lastCharIsWhitespace(java.lang.StringBuilder)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.ensureAttributes()",
      "begin_line": 133,
      "end_line": 138,
      "comment": " attribute fiddling. create on first access.",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attr(java.lang.String)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 27)",
        "(line 143,col 9)-(line 143,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attributes()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attr(java.lang.String, java.lang.String)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.hasAttr(java.lang.String)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 27)",
        "(line 161,col 9)-(line 161,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.removeAttr(java.lang.String)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 27)",
        "(line 167,col 9)-(line 167,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.absUrl(java.lang.String)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 27)",
        "(line 173,col 9)-(line 173,col 42)"
      ]
    }
  ]
}