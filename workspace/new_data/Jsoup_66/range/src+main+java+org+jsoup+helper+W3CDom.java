{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/helper/W3CDom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "W3CDom",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 172,
      "comment": "\n * Helper class to transform a {@link org.jsoup.nodes.Document} to a {@link org.w3c.dom.Document org.w3c.dom.Document},\n * for integration with toolsets that use the W3C DOM.\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.fromJsoup(org.jsoup.nodes.Document)",
      "begin_line": 35,
      "end_line": 48,
      "comment": "\n     * Convert a jsoup Document to a W3C Document.\n     * @param in jsoup doc\n     * @return w3c doc\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 29)",
        "(line 37,col 9)-(line 37,col 32)",
        "(line 38,col 9)-(line 47,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "convert(org.jsoup.nodes.Document, Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * Converts a jsoup document into the provided W3C Document. If required, you can set options on the output document\n     * before converting.\n     * @param in jsoup doc\n     * @param out w3c doc\n     * @see org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 46)",
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 62,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "W3CBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 68,
      "end_line": 152,
      "comment": "\n     * Implements the conversion by walking the input.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsKey"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsPrefix"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespaces"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " prefix \u003d\u003e urn"
    },
    {
      "type": "field",
      "varNames": [
        "dest"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "W3CBuilder(Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.head(org.jsoup.nodes.Node, int)",
      "begin_line": 80,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 109,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 115,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "copyAttributes(org.jsoup.nodes.Node, Element)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Element\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 124,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.updateNamespaces(org.jsoup.nodes.Element)",
      "begin_line": 130,
      "end_line": 150,
      "comment": "\n         * Finds any namespaces defined in this element. Returns any tag prefix.\n         ",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 52)",
        "(line 134,col 13)-(line 145,col 13)",
        "(line 148,col 13)-(line 148,col 48)",
        "(line 149,col 13)-(line 149,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "asString(Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 159,
      "end_line": 171,
      "comment": "\n     * Serialize a W3C document to a String.\n     * @param doc Document\n     * @return Document as string\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 170,col 9)"
      ]
    }
  ]
}