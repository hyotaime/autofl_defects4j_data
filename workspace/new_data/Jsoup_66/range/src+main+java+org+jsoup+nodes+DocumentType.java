{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/nodes/DocumentType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DocumentType",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.nodes.LeafNode"
      ],
      "begin_line": 12,
      "end_line": 109,
      "comment": "\n * A {@code \u003c!DOCTYPE\u003e} node.\n "
    },
    {
      "type": "field",
      "varNames": [
        "PUBLIC_KEY"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": " todo needs a bit of a chunky cleanup. this level of detail isn\u0027t needed"
    },
    {
      "type": "field",
      "varNames": [
        "SYSTEM_KEY"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PUB_SYS_KEY"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " PUBLIC or SYSTEM"
    },
    {
      "type": "field",
      "varNames": [
        "PUBLIC_ID"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SYSTEM_ID"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DocumentType.DocumentType(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 28,
      "end_line": 38,
      "comment": "\n     * Create a new doctype element.\n     * @param name the doctype\u0027s name\n     * @param publicId the doctype\u0027s public ID\n     * @param systemId the doctype\u0027s system ID\n     ",
      "child_ranges": [
        "(line 29,col 9)-(line 29,col 31)",
        "(line 30,col 9)-(line 30,col 35)",
        "(line 31,col 9)-(line 31,col 35)",
        "(line 32,col 9)-(line 32,col 25)",
        "(line 33,col 9)-(line 33,col 34)",
        "(line 34,col 9)-(line 36,col 9)",
        "(line 37,col 9)-(line 37,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DocumentType.DocumentType(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Create a new doctype element.\n     * @param name the doctype\u0027s name\n     * @param publicId the doctype\u0027s public ID\n     * @param systemId the doctype\u0027s system ID\n     * @param baseUri unused\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 34)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.nodes.DocumentType.DocumentType(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "\n     * Create a new doctype element.\n     * @param name the doctype\u0027s name\n     * @param publicId the doctype\u0027s public ID\n     * @param systemId the doctype\u0027s system ID\n     * @param baseUri unused\n     * @deprecated\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DocumentType.setPubSysKey(java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DocumentType.nodeName()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DocumentType.outerHtmlHead(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 83,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 94,col 56)",
        "(line 95,col 9)-(line 96,col 68)",
        "(line 97,col 9)-(line 98,col 68)",
        "(line 99,col 9)-(line 99,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DocumentType.outerHtmlTail(java.lang.Appendable, int, org.jsoup.nodes.Document.OutputSettings)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.nodes.DocumentType.has(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 52)"
      ]
    }
  ]
}