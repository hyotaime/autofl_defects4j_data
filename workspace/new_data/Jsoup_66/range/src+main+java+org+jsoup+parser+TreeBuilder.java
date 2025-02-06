{
  "filepath": "/tmp/Jsoup-66b/src/main/java/org/jsoup/parser/TreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 90,
      "comment": "\n * @author Jonathan Hedley\n "
    },
    {
      "type": "field",
      "varNames": [
        "reader"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokeniser"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "doc"
      ],
      "begin_line": 17,
      "end_line": 17,
      "comment": " current doc we are building into"
    },
    {
      "type": "field",
      "varNames": [
        "stack"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " the stack of open elements"
    },
    {
      "type": "field",
      "varNames": [
        "baseUri"
      ],
      "begin_line": 19,
      "end_line": 19,
      "comment": " current base uri, for creating new elements"
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 20,
      "end_line": 20,
      "comment": " currentToken is used only for error tracking."
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": " null when not tracking errors"
    },
    {
      "type": "field",
      "varNames": [
        "settings"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": " start tag to process"
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.defaultSettings()",
      "begin_line": 27,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.initialiseParse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 29,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 65)",
        "(line 31,col 9)-(line 31,col 62)",
        "(line 33,col 9)-(line 33,col 36)",
        "(line 34,col 9)-(line 34,col 33)",
        "(line 35,col 9)-(line 35,col 44)",
        "(line 36,col 9)-(line 36,col 29)",
        "(line 37,col 9)-(line 37,col 28)",
        "(line 38,col 9)-(line 38,col 50)",
        "(line 39,col 9)-(line 39,col 36)",
        "(line 40,col 9)-(line 40,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.io.Reader, java.lang.String, org.jsoup.parser.ParseErrorList, org.jsoup.parser.ParseSettings)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 58)",
        "(line 45,col 9)-(line 45,col 20)",
        "(line 46,col 9)-(line 46,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.runParser()",
      "begin_line": 49,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 57,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processStartTag(java.lang.String, org.jsoup.nodes.Attributes)",
      "begin_line": 69,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 22)",
        "(line 74,col 9)-(line 74,col 36)",
        "(line 75,col 9)-(line 75,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.processEndTag(java.lang.String)",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.currentElement()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)",
        "(line 88,col 9)-(line 88,col 51)"
      ]
    }
  ]
}