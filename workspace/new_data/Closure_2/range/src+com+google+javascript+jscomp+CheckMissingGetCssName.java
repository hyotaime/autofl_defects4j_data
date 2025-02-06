{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckMissingGetCssName.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckMissingGetCssName",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 29,
      "end_line": 122,
      "comment": "\n * Ensures string literals matching certain patterns are only used as\n * goog.getCssName parameters.\n *\n * @author mkretzschmar@google.com (Martin Kretzschmar)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blacklist"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_CSS_NAME_FUNCTION"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GET_UNIQUE_ID_FUNCTION"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_GETCSSNAME"
      ],
      "begin_line": 38,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.CheckMissingGetCssName(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 43,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 29)",
        "(line 46,col 5)-(line 46,col 23)",
        "(line 47,col 5)-(line 48,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 76,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideGetCssNameCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 80,
      "end_line": 84,
      "comment": " Returns whether the node is an argument of a goog.getCssName call. ",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideGetUniqueIdCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n   * Returns whether the node is an argument of a function that returns\n   * a unique id (the last part of the qualified name matches\n   * GET_UNIQUE_ID_FUNCTION).\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 93,col 57)",
        "(line 95,col 5)-(line 95,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.insideAssignmentToIdConstant(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 117,
      "comment": "\n   * Returns whether the node is the right hand side of an assignment or\n   * initialization of a variable named *_ID of *_ID_.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckMissingGetCssName.isIdName(java.lang.String)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 55)"
      ]
    }
  ]
}