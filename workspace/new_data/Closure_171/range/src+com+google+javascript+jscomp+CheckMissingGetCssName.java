{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckMissingGetCssName.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckMissingGetCssName",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 126,
      "comment": "\n * Ensures string literals matching certain patterns are only used as\n * goog.getCssName parameters.\n *\n * @author mkretzschmar@google.com (Martin Kretzschmar)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blacklist"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_CSS_NAME_FUNCTION"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_UNIQUE_ID_FUNCTION"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_GETCSSNAME"
      ],
      "begin_line": 39,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.CheckMissingGetCssName(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 44,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 29)",
        "(line 47,col 5)-(line 47,col 23)",
        "(line 48,col 5)-(line 49,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 77,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideGetCssNameCall(com.google.javascript.rhino.Node)",
      "begin_line": 81,
      "end_line": 86,
      "comment": " Returns whether the node is an argument of a goog.getCssName call. ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 32)",
        "(line 83,col 5)-(line 85,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideGetUniqueIdCall(com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\n   * Returns whether the node is an argument of a function that returns\n   * a unique id (the last part of the qualified name matches\n   * GET_UNIQUE_ID_FUNCTION).\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 32)",
        "(line 95,col 5)-(line 96,col 57)",
        "(line 98,col 5)-(line 98,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideAssignmentToIdConstant(com.google.javascript.rhino.Node)",
      "begin_line": 105,
      "end_line": 121,
      "comment": "\n   * Returns whether the node is the right hand side of an assignment or\n   * initialization of a variable named *_ID of *_ID_.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 32)",
        "(line 107,col 5)-(line 120,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.isIdName(java.lang.String)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 55)"
      ]
    }
  ]
}