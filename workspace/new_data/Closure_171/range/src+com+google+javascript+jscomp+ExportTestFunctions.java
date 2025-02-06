{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ExportTestFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExportTestFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 29,
      "end_line": 175,
      "comment": "\n * Generates goog.exportSymbol for test functions, so they can be recognized\n * by the test runner, even if the code is compiled.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_FUNCTIONS_NAME_PATTERN"
      ],
      "begin_line": 31,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportSymbolFunction"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportPropertyFunction"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.ExportTestFunctions(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 46,
      "end_line": 53,
      "comment": "\n   * Creates a new export test functions compiler pass.\n   * @param compiler\n   * @param exportSymbolFunction The function name used to export symbols in JS.\n   * @param exportPropertyFunction The function name used to export properties\n   *     in JS.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 41)",
        "(line 50,col 5)-(line 50,col 29)",
        "(line 51,col 5)-(line 51,col 53)",
        "(line 52,col 5)-(line 52,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ExportTestFunctionsNodes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 55,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.ExportTestFunctionsNodes.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 61,col 7)-(line 63,col 7)",
        "(line 65,col 7)-(line 90,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.ExportTestFunctionsNodes.isVarDeclaredFunction(com.google.javascript.rhino.Node)",
      "begin_line": 104,
      "end_line": 110,
      "comment": "\n     * Whether node corresponds to a function expression declared with var,\n     * which is of the form:\n     * \u003cpre\u003e\n     * var functionName \u003d function() {\n     *   // Implementation\n     * };\n     * \u003c/pre\u003e\n     * This has the AST structure VAR -\u003e NAME -\u003e FUNCTION\n     * @param node\n     ",
      "child_ranges": [
        "(line 105,col 7)-(line 107,col 7)",
        "(line 108,col 7)-(line 108,col 61)",
        "(line 109,col 7)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.exportTestFunctionAsSymbol(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 119,
      "end_line": 138,
      "comment": " Adds exportSymbol(testFunctionName, testFunction);",
      "child_ranges": [
        "(line 122,col 5)-(line 124,col 54)",
        "(line 125,col 5)-(line 125,col 42)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 129,col 5)-(line 129,col 53)",
        "(line 130,col 5)-(line 132,col 51)",
        "(line 134,col 5)-(line 134,col 42)",
        "(line 136,col 5)-(line 136,col 47)",
        "(line 137,col 5)-(line 137,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.exportTestFunctionAsProperty(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 159,
      "comment": " Adds exportProperty() of the test function name on the prototype object",
      "child_ranges": [
        "(line 145,col 5)-(line 146,col 64)",
        "(line 147,col 5)-(line 148,col 53)",
        "(line 149,col 5)-(line 151,col 36)",
        "(line 153,col 5)-(line 154,col 26)",
        "(line 155,col 5)-(line 155,col 52)",
        "(line 157,col 5)-(line 157,col 49)",
        "(line 158,col 5)-(line 158,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctions.isTestFunction(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n   * Whether a function is recognized as a test function. We follow the JsUnit\n   * convention for naming (functions should start with \"test\"), and we also\n   * check if it has no parameters declared.\n   *\n   * @param n The function node\n   * @param functionName The name of the function\n   * @return {@code true} if the function is recognized as a test function.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 173,col 73)"
      ]
    }
  ]
}