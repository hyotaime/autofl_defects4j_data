{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 18,
      "end_line": 143,
      "comment": "\n * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the\n * document.\n * \u003cp\u003eUsage example: {@code Document xmlDoc \u003d Jsoup.parse(html, baseUrl, Parser.xmlParser());}\u003c/p\u003e\n *\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.defaultSettings()",
      "begin_line": 19,
      "end_line": 21,
      "comment": "",
      "child_ranges": [
        "(line 20,col 9)-(line 20,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.io.Reader, java.lang.String)",
      "begin_line": 23,
      "end_line": 25,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 27,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 31,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 64)",
        "(line 34,col 9)-(line 34,col 23)",
        "(line 35,col 9)-(line 35,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 38,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 69,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 57)",
        "(line 72,col 9)-(line 72,col 98)",
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 83,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 62)",
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 59)",
        "(line 101,col 9)-(line 101,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 138)",
        "(line 106,col 9)-(line 106,col 51)",
        "(line 107,col 9)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 116,
      "end_line": 136,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag tag to close\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 38)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 120,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 128,col 19)",
        "(line 130,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.parseFragment(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 84)",
        "(line 140,col 9)-(line 140,col 20)",
        "(line 141,col 9)-(line 141,col 32)"
      ]
    }
  ]
}