{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameAnonymousFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameAnonymousFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 36,
      "end_line": 102,
      "comment": "\n * Gives anonymous function names. This makes it way easier to debug because\n * debuggers and stack traces use the function names. So if you have\n *\n * goog.string.htmlEscape \u003d function(str) {\n * }\n *\n * It will become\n *\n * goog.string.htmlEscape \u003d function $goog$string$htmlEscape$(str) {\n * }\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DELIMITER"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namedCount"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesUsed"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.NameAnonymousFunctions(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 54,col 74)",
        "(line 55,col 5)-(line 55,col 59)",
        "(line 56,col 5)-(line 57,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AnonymousFunctionNamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer"
      ],
      "begin_line": 66,
      "end_line": 101,
      "comment": "\n   * Names anonymous functions. The function names don\u0027t have to be globally\n   * unique or even locally unique. We make them somewhat unique because of a\n   * bug in IE (and there may be other bugs we haven\u0027t found). See unit test for\n   * more info.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nameExtractor"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.AnonymousFunctionNamer()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.getLikelyNonConflictingName(java.lang.String)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a likely not conflicting name to make IE happy. See unit test\n     * for more info.\n     ",
      "child_ranges": [
        "(line 79,col 7)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 7)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 47)",
        "(line 90,col 7)-(line 90,col 60)",
        "(line 91,col 7)-(line 91,col 39)",
        "(line 92,col 7)-(line 92,col 34)",
        "(line 93,col 7)-(line 93,col 19)",
        "(line 94,col 7)-(line 94,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 35)"
      ]
    }
  ]
}