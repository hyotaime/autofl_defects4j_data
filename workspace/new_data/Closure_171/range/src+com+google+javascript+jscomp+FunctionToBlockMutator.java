{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FunctionToBlockMutator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionToBlockMutator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 510,
      "comment": "\n * A class to transform the body of a function into a generic block suitable\n * for inlining.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeNameIdSupplier"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.FunctionToBlockMutator(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 29)",
        "(line 50,col 5)-(line 50,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.mutate(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, boolean, boolean)",
      "begin_line": 64,
      "end_line": 115,
      "comment": "\n   * @param fnName The name to use when preparing human readable names.\n   * @param fnNode The function to prepare.\n   * @param callNode The call node that will be replaced.\n   * @param resultName Function results should be assigned to this name.\n   * @param needsDefaultResult Whether the result value must be set.\n   * @param isCallInLoop Whether the function body must be prepared to be\n   *   injected into the body of a loop.\n   * @return A clone of the function body mutated to be suitable for injection\n   *   as a statement into another code block.\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 40)",
        "(line 70,col 5)-(line 70,col 50)",
        "(line 75,col 5)-(line 75,col 58)",
        "(line 79,col 5)-(line 80,col 67)",
        "(line 81,col 5)-(line 83,col 58)",
        "(line 84,col 5)-(line 84,col 38)",
        "(line 85,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 56)",
        "(line 92,col 5)-(line 92,col 32)",
        "(line 94,col 5)-(line 98,col 5)",
        "(line 105,col 5)-(line 107,col 5)",
        "(line 109,col 5)-(line 109,col 55)",
        "(line 110,col 5)-(line 111,col 61)",
        "(line 112,col 5)-(line 112,col 54)",
        "(line 114,col 5)-(line 114,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.rewriteFunctionDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 143,
      "comment": "\n   * @param n The node to inspect\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 137,col 5)",
        "(line 139,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.fixUnitializedVarDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 149,
      "end_line": 170,
      "comment": "\n   *  For all VAR node with uninitialized declarations, set\n   *  the values to be \"undefined\".\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 154,col 5)",
        "(line 157,col 5)-(line 165,col 5)",
        "(line 167,col 5)-(line 169,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.makeLocalNamesUnique(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 177,
      "end_line": 190,
      "comment": "\n   * Fix-up all local names to be unique for this subtree.\n   * @param fnNode A mutable instance of the function to be inlined.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 69)",
        "(line 180,col 5)-(line 186,col 32)",
        "(line 188,col 5)-(line 189,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LabelNameSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Supplier\u003cjava.lang.String\u003e"
      ],
      "begin_line": 192,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idSupplier"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier.LabelNameSupplier(com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 7)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier.get()",
      "begin_line": 199,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.getLabelNameForFunction(java.lang.String)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n   * Create a unique label name.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 73)",
        "(line 210,col 5)-(line 210,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.getUniqueThisName()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n   * Create a unique \"this\" name.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.aliasAndInlineArguments(com.google.javascript.rhino.Node, java.util.LinkedHashMap\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 230,
      "end_line": 300,
      "comment": "\n   * Inlines the arguments within the node tree using the given argument map,\n   * replaces \"unsafe\" names with local aliases.\n   *\n   * The aliases for unsafe require new VAR declarations, so this function\n   * can not be used in for direct CALL node replacement as VAR nodes can not be\n   * created there.\n   *\n   * @return The node or its replacement.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 299,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.replaceReturns(com.google.javascript.rhino.Node, java.lang.String, java.lang.String, boolean)",
      "begin_line": 323,
      "end_line": 369,
      "comment": "\n   *  Convert returns to assignments and breaks, as needed.\n   *  For example, with a labelName of \u0027foo\u0027:\n   *    {\n   *      return a;\n   *    }\n   *  becomes:\n   *    foo: {\n   *      a;\n   *      break foo;\n   *    }\n   *  or\n   *    foo: {\n   *      resultName \u003d a;\n   *      break foo;\n   *    }\n   *\n   * @param resultMustBeSet Whether the result must always be set to a value.\n   * @return The node containing the transformed block, this may be different\n   *     than the passed in node \u0027block\u0027.\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 38)",
        "(line 327,col 5)-(line 327,col 42)",
        "(line 329,col 5)-(line 329,col 22)",
        "(line 331,col 5)-(line 331,col 36)",
        "(line 332,col 5)-(line 333,col 67)",
        "(line 334,col 5)-(line 360,col 5)",
        "(line 364,col 5)-(line 366,col 5)",
        "(line 368,col 5)-(line 368,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.addDummyAssignment(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 379,
      "end_line": 389,
      "comment": "\n   * Example:\n   *   a \u003d (void) 0;\n   ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 48)",
        "(line 383,col 5)-(line 383,col 28)",
        "(line 384,col 5)-(line 384,col 57)",
        "(line 385,col 5)-(line 385,col 68)",
        "(line 386,col 5)-(line 386,col 48)",
        "(line 388,col 5)-(line 388,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.convertLastReturnToStatement(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 399,
      "end_line": 411,
      "comment": "\n   * Replace the \u0027return\u0027 statement with its child expression.\n   *   \"return foo()\" becomes \"foo()\" or \"resultName \u003d foo()\"\n   *   \"return\" is removed or becomes \"resultName \u003d void 0\".\n   *\n   * @param block\n   * @param resultName\n   ",
      "child_ranges": [
        "(line 401,col 5)-(line 401,col 36)",
        "(line 402,col 5)-(line 402,col 48)",
        "(line 403,col 5)-(line 403,col 69)",
        "(line 405,col 5)-(line 410,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.createAssignStatementNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 417,
      "end_line": 423,
      "comment": "\n   * Create a valid statement Node containing an assignment to name of the\n   * given expression.\n   ",
      "child_ranges": [
        "(line 420,col 5)-(line 420,col 34)",
        "(line 421,col 5)-(line 421,col 50)",
        "(line 422,col 5)-(line 422,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.getReplacementReturnStatement(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 434,
      "end_line": 460,
      "comment": "\n   * Replace the \u0027return\u0027 statement with its child expression.\n   * If the result is needed (resultName !\u003d null):\n   *   \"return foo()\" becomes \"resultName \u003d foo()\"\n   *   \"return\" becomes \"resultName \u003d void 0\".\n   * Otherwise:\n   *   \"return foo()\" becomes \"foo()\"\n   *   \"return\", null is returned.\n   ",
      "child_ranges": [
        "(line 436,col 5)-(line 436,col 27)",
        "(line 438,col 5)-(line 438,col 23)",
        "(line 439,col 5)-(line 443,col 5)",
        "(line 445,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 459,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.hasReturnAtExit(com.google.javascript.rhino.Node)",
      "begin_line": 465,
      "end_line": 469,
      "comment": "\n   * @return Whether the given block end with an return statement.\n   ",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionToBlockMutator.replaceReturnWithBreak(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, java.lang.String)",
      "begin_line": 477,
      "end_line": 509,
      "comment": "\n   * Replace the \u0027return\u0027 statement with its child expression.\n   *   \"return foo()\" becomes \"{foo(); break;}\" or\n   *      \"{resultName \u003d foo(); break;}\"\n   *   \"return\" becomes {break;} or \"{resultName \u003d void 0;break;}\".\n   ",
      "child_ranges": [
        "(line 480,col 5)-(line 485,col 5)",
        "(line 487,col 5)-(line 506,col 5)",
        "(line 508,col 5)-(line 508,col 19)"
      ]
    }
  ]
}