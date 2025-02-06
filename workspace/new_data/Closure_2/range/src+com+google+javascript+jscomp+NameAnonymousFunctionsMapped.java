{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameAnonymousFunctionsMapped.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameAnonymousFunctionsMapped",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 43,
      "end_line": 144,
      "comment": "\n * Gives anonymous function names that are optimized to be small and provides a\n * mapping back to the original names. This makes it way easier to debug because\n * debuggers and stack traces use the function names. So if you have\n *\n * goog.string.htmlEscape \u003d function(str) {\n * }\n *\n * It will become\n *\n * goog.string.htmlEscape \u003d function $qv(str) {\n * }\n *\n * And there will be mapping from $qv to goog.string.htmlEscape\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PREFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PREFIX_STRING"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousMap"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameMap"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namedCount"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesUsed"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.NameAnonymousFunctionsMapped(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 59,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 29)",
        "(line 62,col 5)-(line 65,col 43)",
        "(line 66,col 5)-(line 66,col 74)",
        "(line 67,col 5)-(line 67,col 35)",
        "(line 68,col 5)-(line 68,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 71,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 74,col 71)",
        "(line 75,col 5)-(line 75,col 59)",
        "(line 76,col 5)-(line 77,col 30)",
        "(line 78,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappedFunctionNamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer"
      ],
      "begin_line": 89,
      "end_line": 134,
      "comment": "\n   * Names anonymous functions. The function names don\u0027t have to be globally\n   * unique or even locally unique. We make them somewhat unique because of a\n   * bug in IE (and there may be other bugs we haven\u0027t found). See unit test for\n   * more info.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "DELIMITER"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 102,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 47)",
        "(line 108,col 7)-(line 108,col 46)",
        "(line 109,col 7)-(line 109,col 36)",
        "(line 110,col 7)-(line 110,col 19)",
        "(line 111,col 7)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer.getAlternateName(java.lang.String)",
      "begin_line": 114,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 115,col 7)-(line 115,col 43)",
        "(line 116,col 7)-(line 126,col 7)",
        "(line 127,col 7)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameAnonymousFunctionsMapped.getFunctionMap()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n   * Gets the function renaming map (the \"answer key\").\n   *\n   * @return A mapping from original names to new names\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 59)"
      ]
    }
  ]
}