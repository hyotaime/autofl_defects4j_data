{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/OptimizeArgumentsArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeArgumentsArray",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 45,
      "end_line": 298,
      "comment": "\n * Optimization for functions that have {@code var_args} or access the\n * arguments array.\n *\n * \u003cp\u003eExample:\n * \u003cpre\u003e\n * function() { alert(arguments[0] + argument[1]) }\n * \u003c/pre\u003e\n * to:\n * \u003cpre\u003e\n * function(a, b) { alert(a, b) }\n * \u003c/pre\u003e\n *\n * Each newly inserted variable name will be unique very much like the output\n * of the AST found after the {@link Normalize} pass.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " section 10.1.8"
    },
    {
      "type": "field",
      "varNames": [
        "PARAMETER_PREFIX"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": " use this string as prefix unless the caller specify a different prefix."
    },
    {
      "type": "field",
      "varNames": [
        "paramPredix"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The prefix for the newly introduced parameter name."
    },
    {
      "type": "field",
      "varNames": [
        "uniqueId"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " unique integer at the end."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Reference to the compiler object to notify any changes to source code AST."
    },
    {
      "type": "field",
      "varNames": [
        "argumentsAccessStack"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " A stack of arguments access list to the corresponding outer functions."
    },
    {
      "type": "field",
      "varNames": [
        "currentArgumentsAccess"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " This stores a list of argument access in the current scope."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n   * Construct this pass and use {@link #PARAMETER_PREFIX} as the prefix for\n   * all parameter names that it introduces.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.OptimizeArgumentsArray(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n   * @param paramPrefix the prefix to use for all parameter names that this\n   *     pass introduces\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 57)",
        "(line 86,col 5)-(line 86,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 94,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 42)",
        "(line 100,col 5)-(line 100,col 45)",
        "(line 101,col 5)-(line 103,col 5)",
        "(line 107,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 113,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 42)",
        "(line 120,col 5)-(line 122,col 5)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 135,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 149,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 42)",
        "(line 152,col 5)-(line 152,col 37)",
        "(line 160,col 5)-(line 162,col 5)",
        "(line 166,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.tryReplaceArguments(com.google.javascript.jscomp.Scope)",
      "begin_line": 178,
      "end_line": 290,
      "comment": "\n   * Tries to optimize all the arguments array access in this scope by assigning\n   * a name to each element.\n   *\n   * @param scope scope of the function\n   * @return true if any modification has been done to the AST\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 72)",
        "(line 181,col 5)-(line 181,col 59)",
        "(line 185,col 5)-(line 185,col 28)",
        "(line 189,col 5)-(line 189,col 59)",
        "(line 194,col 5)-(line 194,col 45)",
        "(line 198,col 5)-(line 237,col 5)",
        "(line 243,col 5)-(line 243,col 60)",
        "(line 246,col 5)-(line 246,col 49)",
        "(line 250,col 5)-(line 255,col 5)",
        "(line 258,col 5)-(line 287,col 5)",
        "(line 289,col 5)-(line 289,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeArgumentsArray.getNewName()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n   * Generate a unique name for the next parameter.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 36)"
      ]
    }
  ]
}