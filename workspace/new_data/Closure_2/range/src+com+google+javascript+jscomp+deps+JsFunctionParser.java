{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/JsFunctionParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsFunctionParser",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.deps.JsFileLineParser"
      ],
      "begin_line": 36,
      "end_line": 151,
      "comment": "\n * A parser that can extract dependency information from a .js file.\n *\n * @author agrieve@google.com (Andrew Grieve)\n * @author ielashi@google.com (Islam El-Ashi)\n "
    },
    {
      "type": "class_interface",
      "name": "SymbolInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionName"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "symbol"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo.SymbolInfo(java.lang.String, java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 7)-(line 43,col 39)",
        "(line 44,col 7)-(line 44,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pattern"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Pattern for matching functions. "
    },
    {
      "type": "field",
      "varNames": [
        "matcher"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Matcher used in the parsing. "
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Symbols parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "functionsToParse"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Functions to parse "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.JsFunctionParser(java.util.Collection\u003cjava.lang.String\u003e, com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 69,
      "end_line": 75,
      "comment": "\n   * Constructor\n   *\n   * @param functions Functions to parse.\n   * @param errorManager Handles parse errors.\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 24)",
        "(line 72,col 5)-(line 72,col 33)",
        "(line 73,col 5)-(line 73,col 36)",
        "(line 74,col 5)-(line 74,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.getPattern(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 83,
      "end_line": 95,
      "comment": "\n   * Constructs a pattern to extract the arguments of the given functions.\n   *\n   * @param functions Functions to parse.\n   * @return A pattern to extract {@code functions}\u0027 arguments.\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 57)",
        "(line 86,col 5)-(line 88,col 5)",
        "(line 91,col 5)-(line 91,col 37)",
        "(line 92,col 5)-(line 92,col 34)",
        "(line 94,col 5)-(line 94,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.parseFile(java.lang.String, java.lang.String)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n   * Parses the given file and returns the dependency information that it\n   * contained.\n   *\n   * @param filePath Path to the file to parse.\n   * @param fileContents The contents to parse.\n   * @return A collection containing all symbols found in the\n   *     file.\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.parseReader(java.lang.String, java.io.Reader)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 35)",
        "(line 115,col 5)-(line 115,col 47)",
        "(line 116,col 5)-(line 116,col 36)",
        "(line 118,col 5)-(line 118,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFunctionParser.parseLine(java.lang.String)",
      "begin_line": 124,
      "end_line": 150,
      "comment": "\n   * Parses a line of JavaScript, extracting dependency information.\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 33)",
        "(line 127,col 5)-(line 127,col 30)",
        "(line 131,col 5)-(line 136,col 5)",
        "(line 138,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 149,col 50)"
      ]
    }
  ]
}