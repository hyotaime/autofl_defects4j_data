{
  "filepath": "/tmp/Jsoup-8b/src/main/java/org/jsoup/parser/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 13,
      "end_line": 318,
      "comment": "\n Parses HTML into a {@link Document}. Generally best to use one of the  more convenient parse methods in {@link org.jsoup.Jsoup}.\n\n @author Jonathan Hedley, jonathan@hedley.net "
    },
    {
      "type": "field",
      "varNames": [
        "SQ"
      ],
      "begin_line": 14,
      "end_line": 14,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DQ"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "htmlTag"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headTag"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyTag"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "titleTag"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "textareaTag"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tq"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relaxed"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.Parser.Parser(java.lang.String, java.lang.String, boolean)",
      "begin_line": 29,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 31)",
        "(line 31,col 9)-(line 31,col 34)",
        "(line 33,col 9)-(line 33,col 42)",
        "(line 34,col 9)-(line 34,col 34)",
        "(line 35,col 9)-(line 35,col 31)",
        "(line 37,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse(java.lang.String, java.lang.String)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     Parse HTML into a Document.\n     @param html HTML to parse\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return parsed Document\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 57)",
        "(line 54,col 9)-(line 54,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragment(java.lang.String, java.lang.String)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 60)",
        "(line 65,col 9)-(line 65,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseBodyFragmentRelaxed(java.lang.String, java.lang.String)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     Parse a fragment of HTML into the {@code body} of a Document, with relaxed parsing enabled. Relaxed, in this\n     context, means that implicit tags are not automatically created when missing.\n     @param bodyHtml fragment of HTML\n     @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.\n     @return Document, with empty head, and HTML parsed into body\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 60)",
        "(line 77,col 9)-(line 77,col 30)",
        "(line 78,col 9)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parse()",
      "begin_line": 81,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseComment()",
      "begin_line": 100,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 27)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 104,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 106,col 53)",
        "(line 107,col 9)-(line 107,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseXmlDecl()",
      "begin_line": 110,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 24)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 61)",
        "(line 114,col 9)-(line 114,col 38)",
        "(line 116,col 9)-(line 116,col 75)",
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseEndTag()",
      "begin_line": 120,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseStartTag()",
      "begin_line": 132,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 45)",
        "(line 135,col 9)-(line 135,col 106)",
        "(line 137,col 9)-(line 137,col 31)",
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 39)",
        "(line 146,col 9)-(line 146,col 62)",
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 48)",
        "(line 159,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseAttribute()",
      "begin_line": 182,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 184,col 46)",
        "(line 185,col 9)-(line 185,col 26)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 187,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseTextNode()",
      "begin_line": 214,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 26)",
        "(line 217,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.parseCdata()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 32)",
        "(line 229,col 9)-(line 229,col 43)",
        "(line 230,col 9)-(line 230,col 59)",
        "(line 231,col 9)-(line 231,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.addChildToParent(org.jsoup.nodes.Element, boolean)",
      "begin_line": 234,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 66)",
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 237,col 62)",
        "(line 239,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 34)",
        "(line 259,col 9)-(line 260,col 33)",
        "(line 261,col 9)-(line 261,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.stackHasValidParent(org.jsoup.parser.Tag)",
      "begin_line": 264,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 266,col 24)",
        "(line 268,col 9)-(line 269,col 65)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToSuitableContainer(org.jsoup.parser.Tag)",
      "begin_line": 282,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.popStackToClose(org.jsoup.parser.Tag)",
      "begin_line": 292,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 24)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.Parser.last()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 31)"
      ]
    }
  ]
}