{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/JsFileLineParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsFileLineParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 261,
      "comment": "\n * Base class for classes that parse JavaScript sources on a line-by-line basis. Strips comments\n * from files and records all parsing errors.\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "PARSE_WARNING"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PARSE_ERROR"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortcutMode"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ParseException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 50,
      "end_line": 68,
      "comment": "\n   * Thrown by base classes to signify a problem parsing a line.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fatal"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.ParseException.ParseException(java.lang.String, boolean)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Constructor.\n     *\n     * @param message A description of what caused the exception.\n     * @param fatal Whether the exception is recoverable.\n     ",
      "child_ranges": [
        "(line 61,col 7)-(line 61,col 21)",
        "(line 62,col 7)-(line 62,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.ParseException.isFatal()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 7)-(line 66,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "STRING_LITERAL_PATTERN"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": " Pattern for matching JavaScript string literals. "
    },
    {
      "type": "field",
      "varNames": [
        "valueMatcher"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Matcher used in the parsing string literals. "
    },
    {
      "type": "field",
      "varNames": [
        "filePath"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Path of the file currently being parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "lineNum"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The line number of the line currently being parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "errorManager"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Handles error messages. "
    },
    {
      "type": "field",
      "varNames": [
        "parseSucceeded"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Did our parse succeed. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.JsFileLineParser(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n   * Constructor.\n   *\n   * @param errorManager Parse error handler.\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.setShortcutMode(boolean)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n   * In shortcut mode, the file line parser can stop reading early if\n   * it thinks it found enough information.\n   *\n   * For example, many parsers assume that dependency information never\n   * shows up after \"real\" code.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.didParseSucceed()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.doParse(java.lang.String, java.io.Reader)",
      "begin_line": 119,
      "end_line": 196,
      "comment": "\n   * Performs the line-by-line parsing of the given fileContents. This method\n   * strips out JavaScript comments and then uses the abstract parseLine()\n   * method to do the line parsing.\n   *\n   * @param filePath The path to the file being parsed. Used for reporting parse\n   *     exceptions.\n   * @param fileContents A reader for the contents of the file.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 29)",
        "(line 121,col 5)-(line 121,col 26)",
        "(line 123,col 5)-(line 123,col 65)",
        "(line 126,col 5)-(line 126,col 23)",
        "(line 127,col 5)-(line 127,col 16)",
        "(line 128,col 5)-(line 128,col 39)",
        "(line 130,col 5)-(line 195,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.parseLine(java.lang.String)",
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n   * Called for each line of the file being parsed.\n   *\n   * @param line The line to parse.\n   * @return true to keep going, false otherwise.\n   * @throws ParseException Should be thrown to signify a problem with the line.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.parseJsString(java.lang.String)",
      "begin_line": 214,
      "end_line": 220,
      "comment": "\n   * Parses a JS string literal.\n   *\n   * @param jsStringLiteral The literal. Must look like \"asdf\" or \u0027asdf\u0027\n   * @throws ParseException Thrown if there is a string literal that cannot be\n   *     parsed.\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 40)",
        "(line 216,col 5)-(line 218,col 5)",
        "(line 219,col 5)-(line 219,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileLineParser.parseJsStringArray(java.lang.String)",
      "begin_line": 228,
      "end_line": 260,
      "comment": "\n   * Parses a JavaScript array of string literals. (eg: [\u0027a\u0027, \u0027b\u0027, \"c\"]).\n   * @param input A string containing a JavaScript array of string literals.\n   * @return A list of parsed string literals.\n   * @throws ParseException Thrown if there is a syntax error with the input.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 48)",
        "(line 231,col 5)-(line 231,col 40)",
        "(line 232,col 5)-(line 232,col 42)",
        "(line 233,col 5)-(line 235,col 5)",
        "(line 236,col 5)-(line 236,col 67)",
        "(line 238,col 5)-(line 258,col 5)",
        "(line 259,col 5)-(line 259,col 19)"
      ]
    }
  ]
}