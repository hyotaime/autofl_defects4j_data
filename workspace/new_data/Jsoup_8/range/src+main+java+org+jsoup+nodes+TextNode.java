{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/TextNode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextNode",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 9,
      "end_line": 155,
      "comment": "\n A text node.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "TEXT_KEY"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": "\n    TextNode is a node, and so by default comes with attributes and children. The attributes are seldom used, but use\n    memory, and the child nodes are never used. So we don\u0027t have them, and override accessors to attributes to create\n    them as needed on the fly.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.TextNode.TextNode(java.lang.String, java.lang.String)",
      "begin_line": 25,
      "end_line": 28,
      "comment": "\n     Create a new TextNode representing the supplied (unencoded) text).\n\n     @param text raw text\n     @param baseUri base uri\n     @see #createFromEncoded(String, String)\n     ",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 31)",
        "(line 27,col 9)-(line 27,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.nodeName()",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Get the text content of this text node.\n     * @return Unencoded, normalised text.\n     * @see TextNode#getWholeText()\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.text(java.lang.String)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Set the text content of this text node.\n     * @param text unencoded text\n     * @return this, for chaining\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.getWholeText()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     Get the (unencoded) text of this text node, including any newlines and spaces present in the original.\n     @return text\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 68)"
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
      "signature": "org.jsoup.nodes.TextNode.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 72,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 59)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 79,col 38)",
        "(line 80,col 9)-(line 80,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.toString()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.createFromEncoded(java.lang.String, java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Create a new TextNode from HTML encoded (aka escaped) data.\n     * @param encodedText Text containing encoded HTML (e.g. \u0026amp;lt;)\n     * @return TextNode containing unencoded data (e.g. \u0026lt;)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 53)",
        "(line 96,col 9)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.normaliseWhitespace(java.lang.String)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 52)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.stripLeadingWhitespace(java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.lastCharIsWhitespace(java.lang.StringBuilder)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.ensureAttributes()",
      "begin_line": 113,
      "end_line": 118,
      "comment": " attribute fiddling. create on first access.",
      "child_ranges": [
        "(line 114,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attr(java.lang.String)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 27)",
        "(line 123,col 9)-(line 123,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attributes()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 27)",
        "(line 129,col 9)-(line 129,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.attr(java.lang.String, java.lang.String)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.hasAttr(java.lang.String)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 27)",
        "(line 141,col 9)-(line 141,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.removeAttr(java.lang.String)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 27)",
        "(line 147,col 9)-(line 147,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.TextNode.absUrl(java.lang.String)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)",
        "(line 153,col 9)-(line 153,col 42)"
      ]
    }
  ]
}