{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/parser/XmlTreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XmlTreeBuilder",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.parser.TreeBuilder"
      ],
      "begin_line": 11,
      "end_line": 111,
      "comment": "\n * @author Jonathan Hedley\n "
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 12,
      "end_line": 16,
      "comment": "",
      "child_ranges": [
        "(line 14,col 9)-(line 14,col 54)",
        "(line 15,col 9)-(line 15,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 18,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 21,col 9)-(line 41,col 9)",
        "(line 42,col 9)-(line 42,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insertNode(org.jsoup.nodes.Node)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.StartTag)",
      "begin_line": 49,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 47)",
        "(line 52,col 9)-(line 52,col 68)",
        "(line 53,col 9)-(line 53,col 23)",
        "(line 54,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Comment)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 71)",
        "(line 66,col 9)-(line 66,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Character)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 68)",
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token.Doctype)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 124)",
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.XmlTreeBuilder.popStackToClose(org.jsoup.parser.Token.EndTag)",
      "begin_line": 85,
      "end_line": 110,
      "comment": "\n     * If the stack contains an element with this tag\u0027s name, pop up the stack to remove the first occurrence. If not\n     * found, skips.\n     *\n     * @param endTag\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)",
        "(line 87,col 9)-(line 87,col 34)",
        "(line 89,col 9)-(line 89,col 58)",
        "(line 90,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 98,col 19)",
        "(line 100,col 9)-(line 100,col 40)",
        "(line 101,col 9)-(line 109,col 9)"
      ]
    }
  ]
}