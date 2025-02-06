{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/nodes/XmlDeclaration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlDeclaration",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 12,
      "end_line": 92,
      "comment": "\n * An XML Declaration.\n "
    },
    {
      "type": "field",
      "varNames": [
        "isProcessingInstruction"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " \u003c! if true, \u003c? if false, declaration (and last data char should be ?)"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, boolean)",
      "begin_line": 21,
      "end_line": 25,
      "comment": "\n     * Create a new XML declaration\n     * @param name of declaration\n     * @param isProcessingInstruction is processing instruction\n     ",
      "child_ranges": [
        "(line 22,col 9)-(line 22,col 31)",
        "(line 23,col 9)-(line 23,col 21)",
        "(line 24,col 9)-(line 24,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, java.lang.String, boolean)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Create a new XML declaration\n     * @param name of declaration\n     * @param baseUri Leaf Nodes don\u0027t have base URIs; they inherit from their Element\n     * @param isProcessingInstruction is processing instruction\n     * @see XmlDeclaration#XmlDeclaration(String, boolean)\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.nodeName()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.name()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Get the name of this declaration.\n     * @return name of this declaration.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "\n     * Get the unencoded XML declaration.\n     * @return XML declaration\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 54)",
        "(line 57,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 74,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 78,col 33)",
        "(line 79,col 9)-(line 79,col 40)",
        "(line 80,col 9)-(line 82,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 85,
      "end_line": 86,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.toString()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 27)"
      ]
    }
  ]
}