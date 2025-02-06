{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/XmlDeclaration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlDeclaration",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 11,
      "end_line": 91,
      "comment": "\n * An XML Declaration.\n "
    },
    {
      "type": "field",
      "varNames": [
        "isProcessingInstruction"
      ],
      "begin_line": 13,
      "end_line": 13,
      "comment": " \u003c! if true, \u003c? if false, declaration (and last data char should be ?)"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, boolean)",
      "begin_line": 20,
      "end_line": 24,
      "comment": "\n     * Create a new XML declaration\n     * @param name of declaration\n     * @param isProcessingInstruction is processing instruction\n     ",
      "child_ranges": [
        "(line 21,col 9)-(line 21,col 31)",
        "(line 22,col 9)-(line 22,col 21)",
        "(line 23,col 9)-(line 23,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, java.lang.String, boolean)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Create a new XML declaration\n     * @param name of declaration\n     * @param baseUri Leaf Nodes don\u0027t have base URIs; they inherit from their Element\n     * @param isProcessingInstruction is processing instruction\n     * @see XmlDeclaration#XmlDeclaration(String, boolean)\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.nodeName()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.name()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Get the name of this declaration.\n     * @return name of this declaration.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration()",
      "begin_line": 54,
      "end_line": 62,
      "comment": "\n     * Get the unencoded XML declaration.\n     * @return XML declaration\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 47)",
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration(java.lang.Appendable, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 64,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 78,col 40)",
        "(line 79,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 84,
      "end_line": 85,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.toString()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)"
      ]
    }
  ]
}