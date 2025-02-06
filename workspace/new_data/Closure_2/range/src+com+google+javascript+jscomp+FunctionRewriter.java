{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/FunctionRewriter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionRewriter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 532,
      "comment": "\n * Reduces the size of common function expressions.\n *\n * This pass will rewrite:\n *\n * C.prototype.getA \u003d function() { return this.a_ };\n * C.prototype.setA \u003d function(newValue) { this.a_ \u003d newValue };\n *\n * as:\n *\n * C.prototype.getA \u003d JSCompiler_get(\"a_);\n * C.prototype.setA \u003d JSCompiler_set(\"a_);\n *\n * if by doing so we will save bytes, after the helper functions are\n * added and renaming is done.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SAVINGS_THRESHOLD"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Selected arbitrarily."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.FunctionRewriter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 63,col 69)",
        "(line 65,col 5)-(line 65,col 70)",
        "(line 69,col 5)-(line 70,col 74)",
        "(line 73,col 5)-(line 103,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.parseHelperCode(com.google.javascript.jscomp.FunctionRewriter.Reducer)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n   * Parse helper code needed by a reducer.\n   *\n   * @return Helper code root.  If parse fails, return null.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 113,col 78)",
        "(line 114,col 5)-(line 114,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 119,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reduction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 125,
      "end_line": 151,
      "comment": "\n   * Information needed to apply a reduction.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldChild"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newChild"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reduction.Reduction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 131,col 27)",
        "(line 132,col 7)-(line 132,col 31)",
        "(line 133,col 7)-(line 133,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reduction.apply()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Apply the reduction by replacing the old child with the new child.\n     ",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 46)",
        "(line 141,col 7)-(line 141,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reduction.estimateSavings()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Estimate number of bytes saved by applying this reduction.\n     ",
      "child_ranges": [
        "(line 148,col 7)-(line 149,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReductionGatherer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 158,
      "end_line": 191,
      "comment": "\n   * Gathers a list of reductions to apply later by doing an in-order\n   * AST traversal.  If a suitable reduction is found, stop traversal\n   * in that branch.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reducers"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reductions"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReductionGatherer.ReductionGatherer(java.util.List\u003ccom.google.javascript.jscomp.FunctionRewriter.Reducer\u003e, com.google.common.collect.Multimap\u003ccom.google.javascript.jscomp.FunctionRewriter.Reducer, com.google.javascript.jscomp.FunctionRewriter.Reduction\u003e)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * @param reducers List of reducers to apply during traversal.\n     * @param reductions Reducer -\u003e Reduction multimap,\n     *                   populated during traversal.\n     ",
      "child_ranges": [
        "(line 169,col 7)-(line 169,col 31)",
        "(line 170,col 7)-(line 170,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReductionGatherer.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 177,col 7)-(line 183,col 7)",
        "(line 184,col 7)-(line 184,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReductionGatherer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Reducer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 196,
      "end_line": 224,
      "comment": "\n   * Interface implemented by the strength-reduction optimizers below.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reducer.getHelperSource()",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * @return JS source for helper methods used by this reduction.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * @return root of the reduced subtree if a reduction was applied;\n     *         otherwise returns the node argument.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.Reducer.buildCallNode(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\n     * Builds a method call based on the the given method name,\n     * argument and history.\n     *\n     * @param methodName Method to call.\n     * @param argumentNode Method argument.\n     ",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 62)",
        "(line 218,col 7)-(line 218,col 48)",
        "(line 219,col 7)-(line 221,col 7)",
        "(line 222,col 7)-(line 222,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EmptyFunctionReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.Reducer"
      ],
      "begin_line": 235,
      "end_line": 255,
      "comment": "\n   * Reduces return immutable constant literal methods declarations\n   * with calls to a constant return method factory.\n   *\n   * Example:\n   *   a.prototype.b \u003d function() {}\n   * is reduced to:\n   *   a.prototype.b \u003d emptyFn();\n   "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_METHOD_NAME"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HELPER_SOURCE"
      ],
      "begin_line": 237,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer.getHelperSource()",
      "begin_line": 242,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 247,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 253,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingleReturnStatementReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.Reducer"
      ],
      "begin_line": 261,
      "end_line": 279,
      "comment": "\n   * Base class for reducers that match functions that contain a\n   * single return statement.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer.maybeGetSingleReturnRValue(com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 278,
      "comment": "\n     * @return function return value node if function body contains a\n     * single return statement.  Otherwise, null.\n     ",
      "child_ranges": [
        "(line 268,col 7)-(line 268,col 46)",
        "(line 269,col 7)-(line 271,col 7)",
        "(line 273,col 7)-(line 273,col 44)",
        "(line 274,col 7)-(line 276,col 7)",
        "(line 277,col 7)-(line 277,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentityReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer"
      ],
      "begin_line": 290,
      "end_line": 337,
      "comment": "\n   * Reduces property getter method declarations with calls to a\n   * getter method factory.\n   *\n   * Example:\n   *   a.prototype.b \u003d function(a) {return a}\n   * is reduced to:\n   *   a.prototype.b \u003d getter(a);\n   "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_METHOD_NAME"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HELPER_SOURCE"
      ],
      "begin_line": 292,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.getHelperSource()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 7)-(line 300,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 303,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 307,col 7)",
        "(line 309,col 7)-(line 313,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.isIdentityFunction(com.google.javascript.rhino.Node)",
      "begin_line": 322,
      "end_line": 336,
      "comment": "\n     * Checks if the function matches the pattern:\n     *   function(\u003cvalue\u003e, \u003crest\u003e) {return \u003cvalue\u003e}\n     *\n     * @return Whether the function matches the pattern.\n     ",
      "child_ranges": [
        "(line 323,col 7)-(line 323,col 60)",
        "(line 324,col 7)-(line 324,col 47)",
        "(line 325,col 7)-(line 327,col 7)",
        "(line 329,col 7)-(line 329,col 60)",
        "(line 330,col 7)-(line 334,col 7)",
        "(line 335,col 7)-(line 335,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReturnConstantReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer"
      ],
      "begin_line": 348,
      "end_line": 391,
      "comment": "\n   * Reduces return immutable constant literal methods declarations\n   * with calls to a constant return method factory.\n   *\n   * Example:\n   *   a.prototype.b \u003d function() {return 10}\n   * is reduced to:\n   *   a.prototype.b \u003d returnconst(10);\n   "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_METHOD_NAME"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HELPER_SOURCE"
      ],
      "begin_line": 351,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.getHelperSource()",
      "begin_line": 357,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 7)-(line 359,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 362,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 364,col 7)-(line 366,col 7)",
        "(line 368,col 7)-(line 368,col 42)",
        "(line 369,col 7)-(line 373,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.getValueNode(com.google.javascript.rhino.Node)",
      "begin_line": 383,
      "end_line": 390,
      "comment": "\n     * Checks if the function matches the pattern:\n     *   function(\u003cargs\u003e) {return \u003cimmutable value\u003e}\n     * and returns \u003cimmutable value\u003e if a match is found.\n     *\n     * @return the immutable value node; or null.\n     ",
      "child_ranges": [
        "(line 384,col 7)-(line 384,col 60)",
        "(line 385,col 7)-(line 388,col 7)",
        "(line 389,col 7)-(line 389,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetterReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer"
      ],
      "begin_line": 402,
      "end_line": 450,
      "comment": "\n   * Reduces property getter method declarations with calls to a\n   * getter method factory.\n   *\n   * Example:\n   *   a.prototype.b \u003d function() {return this.b_}\n   * is reduced to:\n   *   a.prototype.b \u003d getter(\"b_\");\n   "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_METHOD_NAME"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HELPER_SOURCE"
      ],
      "begin_line": 404,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.GetterReducer.getHelperSource()",
      "begin_line": 410,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 7)-(line 412,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.GetterReducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 415,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 417,col 7)-(line 419,col 7)",
        "(line 421,col 7)-(line 421,col 47)",
        "(line 422,col 7)-(line 431,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.GetterReducer.getGetPropertyName(com.google.javascript.rhino.Node)",
      "begin_line": 441,
      "end_line": 449,
      "comment": "\n     * Checks if the function matches the pattern:\n     *   function(\u003cargs\u003e) {return this.\u003cname\u003e}\n     * and returns \u003cname\u003e if a match is found.\n     *\n     * @return STRING node that is the RHS of a this property get; or null.\n     ",
      "child_ranges": [
        "(line 442,col 7)-(line 442,col 60)",
        "(line 443,col 7)-(line 447,col 7)",
        "(line 448,col 7)-(line 448,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetterReducer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionRewriter.Reducer"
      ],
      "begin_line": 461,
      "end_line": 531,
      "comment": "\n   * Reduces property setter method declarations with calls to a\n   * setter method factory.\n   *\n   * Example:\n   *   a.prototype.setB \u003d function(value) {this.b_ \u003d value}\n   * reduces to:\n   *   a.prototype.setB \u003d getter(\"b_\");\n   "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORY_METHOD_NAME"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HELPER_SOURCE"
      ],
      "begin_line": 463,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.SetterReducer.getHelperSource()",
      "begin_line": 471,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 473,col 7)-(line 473,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.SetterReducer.reduce(com.google.javascript.rhino.Node)",
      "begin_line": 476,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 478,col 7)-(line 480,col 7)",
        "(line 482,col 7)-(line 482,col 47)",
        "(line 483,col 7)-(line 492,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionRewriter.SetterReducer.getSetPropertyName(com.google.javascript.rhino.Node)",
      "begin_line": 502,
      "end_line": 530,
      "comment": "\n     * Checks if the function matches the pattern:\n     *   function(\u003cvalue\u003e, \u003crest\u003e) {this.\u003cname\u003e \u003d \u003cvalue\u003e}\n     * and returns \u003cname\u003e if a match is found.\n     *\n     * @return STRING node that is the RHS of a this property get; or null.\n     ",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 46)",
        "(line 504,col 7)-(line 506,col 7)",
        "(line 508,col 7)-(line 508,col 60)",
        "(line 509,col 7)-(line 509,col 47)",
        "(line 510,col 7)-(line 512,col 7)",
        "(line 514,col 7)-(line 514,col 44)",
        "(line 515,col 7)-(line 517,col 7)",
        "(line 519,col 7)-(line 519,col 46)",
        "(line 520,col 7)-(line 520,col 40)",
        "(line 521,col 7)-(line 528,col 7)",
        "(line 529,col 7)-(line 529,col 18)"
      ]
    }
  ]
}