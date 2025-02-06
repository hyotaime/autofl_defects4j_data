{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AnonymousFunctionNamingCallback.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnonymousFunctionNamingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 33,
      "end_line": 136,
      "comment": "\n * Visitor that performs naming operations on anonymous functions by\n * means of the FunctionNamer interface.  Anonymous functions are\n * named based on context.  For example, the anonymous function on the\n * RHS based on the property at the LHS of the assignment operator.\n *\n * goog.string.htmlEscape \u003d function(str) {\n * }\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "namer"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FunctionNamer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 60,
      "comment": "\n   * Interface used by AnonymousFunctionNamingCallback to set the name\n   * of anonymous functions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Generates a string representation of a node for use by\n     * setFunctionName.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Sets the name of an anonymous function.\n     * @param fnNode The function node to update\n     * @param name The name\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Generate a name by \"concatenating\" the output of multiple calls\n     * to getName.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.AnonymousFunctionNamingCallback(com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 106,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.nameObjectLiteralMethods(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 109,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 134,col 5)"
      ]
    }
  ]
}