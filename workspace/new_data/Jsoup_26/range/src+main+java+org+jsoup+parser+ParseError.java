{
  "filepath": "/tmp/Jsoup-26b/src/main/java/org/jsoup/parser/ParseError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParseError",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 6,
      "end_line": 40,
      "comment": "\n * A Parse Error records an error in the input HTML that occurs in either the tokenisation or the tree building phase.\n "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 7,
      "end_line": 7,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorMsg"
      ],
      "begin_line": 8,
      "end_line": 8,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.ParseError.ParseError(int, java.lang.String)",
      "begin_line": 10,
      "end_line": 13,
      "comment": "",
      "child_ranges": [
        "(line 11,col 9)-(line 11,col 23)",
        "(line 12,col 9)-(line 12,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.parser.ParseError.ParseError(int, java.lang.String, java.lang.Object...)",
      "begin_line": 15,
      "end_line": 18,
      "comment": "",
      "child_ranges": [
        "(line 16,col 9)-(line 16,col 57)",
        "(line 17,col 9)-(line 17,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseError.getErrorMessage()",
      "begin_line": 24,
      "end_line": 26,
      "comment": "\n     * Retrieve the error message.\n     * @return the error message.\n     ",
      "child_ranges": [
        "(line 25,col 9)-(line 25,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseError.getPosition()",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Retrieves the offset of the error.\n     * @return error offset within input\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jsoup.parser.ParseError.toString()",
      "begin_line": 36,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 37)"
      ]
    }
  ]
}