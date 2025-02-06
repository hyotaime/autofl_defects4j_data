{
  "filepath": "/tmp/Jsoup-22b/src/main/java/org/jsoup/parser/TreeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TreeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 14,
      "end_line": 60,
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
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.initialiseParse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 23,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 24,col 9)-(line 24,col 65)",
        "(line 25,col 9)-(line 25,col 62)",
        "(line 27,col 9)-(line 27,col 36)",
        "(line 28,col 9)-(line 28,col 44)",
        "(line 29,col 9)-(line 29,col 29)",
        "(line 30,col 9)-(line 30,col 50)",
        "(line 31,col 9)-(line 31,col 53)",
        "(line 32,col 9)-(line 32,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.lang.String, java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.parse(java.lang.String, java.lang.String, org.jsoup.parser.ParseErrorList)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 48)",
        "(line 41,col 9)-(line 41,col 20)",
        "(line 42,col 9)-(line 42,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.runParser()",
      "begin_line": 45,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 52,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.process(org.jsoup.parser.Token)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.TreeBuilder.currentElement()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 31)"
      ]
    }
  ]
}