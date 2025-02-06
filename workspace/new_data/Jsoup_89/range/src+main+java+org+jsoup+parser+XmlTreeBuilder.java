{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 24,
      "end_line": 151,
      "comment": "\n * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the\n * document.\n * \u003cp\u003eUsage example: {@code Document xmlDoc \u003d Jsoup.parse(html, baseUrl, Parser.xmlParser());}\u003c/p\u003e\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.defaultSettings()",
      "begin_line": 25,
      "end_line": 27,
      "comment": "",
      "child_ranges": [
        "(line 26,col 9)-(line 26,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 29,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 54)",
        "(line 32,col 9)-(line 32,col 23)",
        "(line 33,col 9)-(line 33,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.io.Reader, java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 44,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 75,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 57)",
        "(line 78,col 9)-(line 78,col 98)",
        "(line 79,col 9)-(line 79,col 23)",
        "(line 80,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 89,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 62)",
        "(line 91,col 9)-(line 91,col 30)",
        "(line 92,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 44)",
        "(line 104,col 9)-(line 104,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 138)",
        "(line 109,col 9)-(line 109,col 51)",
        "(line 110,col 9)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 119,
      "end_line": 139,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag tag to close\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 62)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 123,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 131,col 19)",
        "(line 133,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 74)",
        "(line 144,col 9)-(line 144,col 20)",
        "(line 145,col 9)-(line 145,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 61)"
      ]
    }
  ]
}