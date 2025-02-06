{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/deps/JsFileParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsFileParser",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.deps.JsFileLineParser"
      ],
      "begin_line": 38,
      "end_line": 189,
      "comment": "\n * A parser that can extract goog.require() and goog.provide() dependency\n * information from a .js file.\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_PROVIDE_REQUIRE_PATTERN"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " Pattern for matching goog.provide(*) and goog.require(*). "
    },
    {
      "type": "field",
      "varNames": [
        "BASE_JS_START"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The first non-comment line of base.js "
    },
    {
      "type": "field",
      "varNames": [
        "googMatcher"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Matchers used in the parsing. "
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The info for the file we are currently parsing. "
    },
    {
      "type": "field",
      "varNames": [
        "requires"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileHasProvidesOrRequires"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "includeGoogBase"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Whether to provide/require the root namespace. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.JsFileParser(com.google.javascript.jscomp.ErrorManager)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n   * Constructor\n   *\n   * @param errorManager Handles parse errors.\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.setIncludeGoogBase(boolean)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n   * Sets whether we should create implicit provides and requires of the\n   * root namespace.\n   *\n   * When generating deps files, you do not want this behavior. Deps files\n   * need base.js to run anyway, so they don\u0027t need information about it.\n   *\n   * When generating abstract build graphs, you probably do want this behavior.\n   * It will create an implicit dependency of all files with provides/requires\n   * on base.js.\n   *\n   * @return this for easy chaining.\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 30)",
        "(line 84,col 5)-(line 84,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.parseFile(java.lang.String, java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n   * Parses the given file and returns the dependency information that it\n   * contained.\n   *\n   * @param filePath Path to the file to parse.\n   * @param closureRelativePath Path of the file relative to closure.\n   * @return A DependencyInfo containing all provides/requires found in the\n   *     file.\n   * @throws IOException Thrown if there was an problem reading the given file.\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.parseFile(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n   * Parses the given file and returns the dependency information that it\n   * contained.\n   *\n   * @param filePath Path to the file to parse.\n   * @param closureRelativePath Path of the file relative to closure.\n   * @param fileContents The contents to parse.\n   * @return A DependencyInfo containing all provides/requires found in the\n   *     file.\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 115,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.parseReader(java.lang.String, java.lang.String, java.io.Reader)",
      "begin_line": 118,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 36)",
        "(line 121,col 5)-(line 121,col 36)",
        "(line 122,col 5)-(line 122,col 38)",
        "(line 124,col 5)-(line 124,col 47)",
        "(line 125,col 5)-(line 125,col 36)",
        "(line 127,col 5)-(line 128,col 59)",
        "(line 129,col 5)-(line 129,col 46)",
        "(line 130,col 5)-(line 130,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.deps.JsFileParser.parseLine(java.lang.String)",
      "begin_line": 137,
      "end_line": 188,
      "comment": "\n   * Parses a line of JavaScript, extracting goog.provide and goog.require\n   * information.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 46)",
        "(line 143,col 5)-(line 184,col 5)",
        "(line 186,col 5)-(line 187,col 50)"
      ]
    }
  ]
}