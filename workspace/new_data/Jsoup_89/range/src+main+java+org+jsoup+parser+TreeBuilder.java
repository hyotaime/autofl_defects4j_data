{
  "filepath": "/tmp/Jsoup-89b/src/main/java/org/jsoup/parser/TreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 16,
      "end_line": 94,
      "comment": "\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokeniser"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " current doc we are building into"
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " the stack of open elements"
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": " current base uri, for creating new elements"
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 23,
      "end_line": 23,
      "comment": " currentToken is used only for error tracking."
    },
    {
      "type": "field",
      "varNames": [
        "settings"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " start tag to process"
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.defaultSettings()",
      "begin_line": 28,
      "end_line": 28,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 30,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 65)",
        "(line 32,col 9)-(line 32,col 62)",
        "(line 34,col 9)-(line 34,col 36)",
        "(line 35,col 9)-(line 35,col 27)",
        "(line 36,col 9)-(line 36,col 29)",
        "(line 37,col 9)-(line 37,col 37)",
        "(line 38,col 9)-(line 38,col 44)",
        "(line 39,col 9)-(line 39,col 28)",
        "(line 40,col 9)-(line 40,col 62)",
        "(line 41,col 9)-(line 41,col 36)",
        "(line 42,col 9)-(line 42,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.io.Reader, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 48)",
        "(line 47,col 9)-(line 47,col 20)",
        "(line 48,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parseFragment(java.lang.String, org.jsoup.nodes.Element, java.lang.String, org.jsoup.parser.Parser)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.runParser()",
      "begin_line": 53,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String)",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 78,col 36)",
        "(line 79,col 9)-(line 79,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processEndTag(java.lang.String)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.currentElement()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 92,col 51)"
      ]
    }
  ]
}