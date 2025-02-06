{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/nodes/XmlDeclaration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlDeclaration",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.Node"
      ],
      "begin_line": 7,
      "end_line": 48,
      "comment": "\n An XML Declaration.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "DECL_KEY"
      ],
      "begin_line": 8,
      "end_line": 8,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isProcessingInstruction"
      ],
      "begin_line": 9,
      "end_line": 9,
      "comment": " \u003c! if true, \u003c? if false, declaration (and last data char should be ?)"
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.XmlDeclaration.XmlDeclaration(java.lang.String, java.lang.String, boolean)",
      "begin_line": 17,
      "end_line": 21,
      "comment": "\n     Create a new XML declaration\n     @param data data\n     @param baseUri base uri\n     @param isProcessingInstruction is processing instruction\n     ",
      "child_ranges": [
        "(line 18,col 9)-(line 18,col 23)",
        "(line 19,col 9)-(line 19,col 39)",
        "(line 20,col 9)-(line 20,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.nodeName()",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.getWholeDeclaration()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "\n     Get the unencoded XML declaration.\n     @return XML declaration\n     ",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 35,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.outerHtmlTail(java.lang.StringBuilder, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.XmlDeclaration.toString()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 27)"
      ]
    }
  ]
}