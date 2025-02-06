{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/helper/W3CDom.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "W3CDom",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 180,
      "comment": "\n * Helper class to transform a {@link org.jsoup.nodes.Document} to a {@link org.w3c.dom.Document org.w3c.dom.Document},\n * for integration with toolsets that use the W3C DOM.\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.fromJsoup(org.jsoup.nodes.Document)",
      "begin_line": 37,
      "end_line": 50,
      "comment": "\n     * Convert a jsoup Document to a W3C Document.\n     * @param in jsoup doc\n     * @return w3c doc\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 29)",
        "(line 39,col 9)-(line 39,col 32)",
        "(line 40,col 9)-(line 49,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "convert(org.jsoup.nodes.Document, Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * Converts a jsoup document into the provided W3C Document. If required, you can set options on the output document\n     * before converting.\n     * @param in jsoup doc\n     * @param out w3c doc\n     * @see org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 46)",
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 64,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "W3CBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.select.NodeVisitor"
      ],
      "begin_line": 70,
      "end_line": 160,
      "comment": "\n     * Implements the conversion by walking the input.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsKey"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlnsPrefix"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespacesStack"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " stack of namespaces, prefix \u003d\u003e urn"
    },
    {
      "type": "field",
      "varNames": [
        "dest"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "W3CBuilder(Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 27)",
        "(line 80,col 13)-(line 80,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.head(org.jsoup.nodes.Node, int)",
      "begin_line": 83,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 72)",
        "(line 85,col 13)-(line 116,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.tail(org.jsoup.nodes.Node, int)",
      "begin_line": 119,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 122,col 13)",
        "(line 123,col 13)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "copyAttributes(org.jsoup.nodes.Node, Element)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Element\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 13)-(line 132,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.W3CDom.W3CBuilder.updateNamespaces(org.jsoup.nodes.Element)",
      "begin_line": 138,
      "end_line": 158,
      "comment": "\n         * Finds any namespaces defined in this element. Returns any tag prefix.\n         ",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 52)",
        "(line 142,col 13)-(line 153,col 13)",
        "(line 156,col 13)-(line 156,col 48)",
        "(line 157,col 13)-(line 157,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "asString(Document)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Document\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 167,
      "end_line": 179,
      "comment": "\n     * Serialize a W3C document to a String.\n     * @param doc Document\n     * @return Document as string\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 178,col 9)"
      ]
    }
  ]
}