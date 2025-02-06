{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/OptimizeArgumentsArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeArgumentsArray",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 44,
      "end_line": 297,
      "comment": "\n * Optimization for functions that have {@code var_args} or access the\n * arguments array.\n *\n * \u003cp\u003eExample:\n * \u003cpre\u003e\n * function() { alert(arguments[0] + argument[1]) }\n * \u003c/pre\u003e\n * to:\n * \u003cpre\u003e\n * function(a, b) { alert(a, b) }\n * \u003c/pre\u003e\n *\n * Each newly inserted variable name will be unique very much like the output\n * of the AST found after the {@link Normalize} pass.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " section 10.1.8"
    },
    {
      "type": "field",
      "varNames": [
        "PARAMETER_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": " use this string as prefix unless the caller specify a different prefix."
    },
    {
      "type": "field",
      "varNames": [
        "paramPredix"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The prefix for the newly introduced parameter name."
    },
    {
      "type": "field",
      "varNames": [
        "uniqueId"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " unique integer at the end."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Reference to the compiler object to notify any changes to source code AST."
    },
    {
      "type": "field",
      "varNames": [
        "argumentsAccessStack"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A stack of arguments access list to the corresponding outer functions."
    },
    {
      "type": "field",
      "varNames": [
        "currentArgumentsAccess"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " This stores a list of argument access in the current scope."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n   * Construct this pass and use {@link #PARAMETER_PREFIX} as the prefix for\n   * all parameter names that it introduces.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n   * @param paramPrefix the prefix to use for all parameter names that this\n   *     pass introduces\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 57)",
        "(line 85,col 5)-(line 85,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 93,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 42)",
        "(line 99,col 5)-(line 99,col 45)",
        "(line 100,col 5)-(line 102,col 5)",
        "(line 106,col 5)-(line 108,col 5)",
        "(line 109,col 5)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 112,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 42)",
        "(line 119,col 5)-(line 121,col 5)",
        "(line 125,col 5)-(line 127,col 5)",
        "(line 134,col 5)-(line 138,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 148,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 42)",
        "(line 151,col 5)-(line 151,col 37)",
        "(line 159,col 5)-(line 161,col 5)",
        "(line 165,col 5)-(line 167,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.tryReplaceArguments(com.google.javascript.jscomp.Scope)",
      "begin_line": 177,
      "end_line": 289,
      "comment": "\n   * Tries to optimize all the arguments array access in this scope by assigning\n   * a name to each element.\n   *\n   * @param scope scope of the function\n   * @return true if any modification has been done to the AST\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 72)",
        "(line 180,col 5)-(line 180,col 59)",
        "(line 184,col 5)-(line 184,col 28)",
        "(line 188,col 5)-(line 188,col 59)",
        "(line 193,col 5)-(line 193,col 45)",
        "(line 197,col 5)-(line 236,col 5)",
        "(line 242,col 5)-(line 242,col 60)",
        "(line 245,col 5)-(line 245,col 49)",
        "(line 249,col 5)-(line 254,col 5)",
        "(line 257,col 5)-(line 286,col 5)",
        "(line 288,col 5)-(line 288,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.getNewName()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n   * Generate a unique name for the next parameter.\n   ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 36)"
      ]
    }
  ]
}