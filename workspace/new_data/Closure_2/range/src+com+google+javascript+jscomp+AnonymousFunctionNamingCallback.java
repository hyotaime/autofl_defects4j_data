{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AnonymousFunctionNamingCallback.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AnonymousFunctionNamingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 34,
      "end_line": 137,
      "comment": "\n * Visitor that performs naming operations on anonymous functions by\n * means of the FunctionNamer interface.  Anonymous functions are\n * named based on context.  For example, the anonymous function on the\n * RHS based on the property at the LHS of the assignment operator.\n *\n * goog.string.htmlEscape \u003d function(str) {\n * }\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "namer"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FunctionNamer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 61,
      "comment": "\n   * Interface used by AnonymousFunctionNamingCallback to set the name\n   * of anonymous functions.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Generates a string representation of a node for use by\n     * setFunctionName.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Sets the name of an anonymous function.\n     * @param fnNode The function node to update\n     * @param name The name\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Generate a name by \"concatenating\" the output of multiple calls\n     * to getName.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.AnonymousFunctionNamingCallback(com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.nameObjectLiteralMethods(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 110,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 135,col 5)"
      ]
    }
  ]
}