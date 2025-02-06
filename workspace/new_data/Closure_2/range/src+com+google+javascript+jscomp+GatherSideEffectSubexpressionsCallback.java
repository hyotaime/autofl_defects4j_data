{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/GatherSideEffectSubexpressionsCallback.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GatherSideEffectSubexpressionsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 38,
      "end_line": 363,
      "comment": "\n * Callback that gathers subexpressions that may have side effects\n * and appends copies of those subexpressions to the replacements\n * list.  In the case of branching subexpressions, it simplifies the\n * subexpression before adding it to the replacement list.\n *\n "
    },
    {
      "type": "class_interface",
      "name": "SideEffectAccumulator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 80,
      "comment": "\n   * Used by GatherSideEffectSubexpressionsCallback to notify client\n   * code about side effect expressions that should be kept.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator.classDefiningCallsHaveSideEffects()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns true if the \"mixin\" and \"inherits\" function calls\n     * should be treated as if they had side effects.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator.keepSubTree(com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Adds subtree to the list of nodes that have side effects.\n     *\n     * @param original - root of the tree.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator.keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Simplifies a subtree whose root node is an AND or OR expression\n     * and adds the resulting subtree to the list of nodes that have\n     * side effects.\n     *\n     * @param original - root of the and/or expression.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator.keepSimplifiedHookExpression(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Simplifies a subtree whose root node is a HOOK expression\n     * and adds the resulting subtree to the list of nodes that have\n     * side effects.\n     *\n     * @param hook - root of the hook expression.\n     * @param thenHasSideEffects - then branch has side effects\n     * @param elseHasSideEffects - else branch has side effects\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GetReplacementSideEffectSubexpressions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator"
      ],
      "begin_line": 89,
      "end_line": 187,
      "comment": "\n   * Populates the provided replacement list by appending copies of\n   * subtrees that have side effects.\n   *\n   * It is OK if this class tears up the original tree, because\n   * we\u0027re going to throw the tree out anyway.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacements"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.GetReplacementSideEffectSubexpressions(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * Creates the accumulator.\n     *\n     * @param compiler - the AbstractCompiler\n     * @param replacements - list to accumulate into\n     ",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 31)",
        "(line 103,col 7)-(line 103,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.classDefiningCallsHaveSideEffects()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.keepSubTree(com.google.javascript.rhino.Node)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 115,col 7)",
        "(line 116,col 7)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node)",
      "begin_line": 119,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 121,col 7)-(line 123,col 74)",
        "(line 124,col 7)-(line 124,col 43)",
        "(line 125,col 7)-(line 125,col 34)",
        "(line 126,col 7)-(line 126,col 63)",
        "(line 127,col 7)-(line 127,col 32)",
        "(line 128,col 7)-(line 128,col 36)",
        "(line 129,col 7)-(line 129,col 47)",
        "(line 130,col 7)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.keepSimplifiedHookExpression(com.google.javascript.rhino.Node, boolean, boolean)",
      "begin_line": 133,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 137,col 7)-(line 138,col 65)",
        "(line 139,col 7)-(line 139,col 44)",
        "(line 140,col 7)-(line 140,col 44)",
        "(line 141,col 7)-(line 141,col 45)",
        "(line 142,col 7)-(line 159,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GetReplacementSideEffectSubexpressions.simplifyShortCircuitBranch(com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 46)",
        "(line 164,col 7)-(line 168,col 76)",
        "(line 170,col 7)-(line 170,col 22)",
        "(line 171,col 7)-(line 177,col 7)",
        "(line 179,col 7)-(line 183,col 7)",
        "(line 185,col 7)-(line 185,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FORBIDDEN_TYPES"
      ],
      "begin_line": 189,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accumulator"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.GatherSideEffectSubexpressionsCallback(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator)",
      "begin_line": 199,
      "end_line": 203,
      "comment": "\n   * @param compiler - AbstractCompiler object\n   * @param accumulator - object that will accumulate roots of\n   *                      subtrees that have side effects.\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 29)",
        "(line 202,col 5)-(line 202,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.isClassDefiningCall(com.google.javascript.rhino.Node)",
      "begin_line": 209,
      "end_line": 213,
      "comment": "\n   * Determines if a call defines a class inheritance or mixing\n   * relation, according to the current coding convention.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 211,col 73)",
        "(line 212,col 5)-(line 212,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 227,
      "end_line": 266,
      "comment": "\n   * Computes the list of subtrees whose root nodes have side effects.\n   *\n   * \u003cp\u003eIf the current subtree\u0027s root has side effects this method should\n   * call accumulator.keepSubTree and return \u0027false\u0027 to add the\n   * subtree to the result list and avoid avoid traversing the nodes children.\n   *\n   * \u003cp\u003eBranching nodes whose then or else branch contain side effects\n   * must be simplified by doing a recursive traversal; this method\n   * should call the appropriate accumulator \u0027keepSimplified\u0027 method\n   * and return \u0027false\u0027 to stop the regular traversal.\n   ",
      "child_ranges": [
        "(line 230,col 5)-(line 234,col 5)",
        "(line 237,col 5)-(line 239,col 5)",
        "(line 242,col 5)-(line 244,col 5)",
        "(line 247,col 5)-(line 249,col 5)",
        "(line 251,col 5)-(line 265,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.processShortCircuitExpression(com.google.javascript.rhino.Node)",
      "begin_line": 273,
      "end_line": 288,
      "comment": "\n   * Processes an AND or OR expression.\n   *\n   * @return true to continue traversal, false otherwise\n   ",
      "child_ranges": [
        "(line 274,col 5)-(line 276,col 68)",
        "(line 280,col 5)-(line 280,col 37)",
        "(line 281,col 5)-(line 281,col 32)",
        "(line 282,col 5)-(line 287,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.processHook(com.google.javascript.rhino.Node)",
      "begin_line": 295,
      "end_line": 313,
      "comment": "\n   * Processes a HOOK expression.\n   *\n   * @return true to continue traversal, false otherwise\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 297,col 63)",
        "(line 299,col 5)-(line 299,col 42)",
        "(line 300,col 5)-(line 300,col 40)",
        "(line 301,col 5)-(line 301,col 41)",
        "(line 302,col 5)-(line 303,col 28)",
        "(line 304,col 5)-(line 305,col 30)",
        "(line 306,col 5)-(line 312,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.processFunctionCall(com.google.javascript.rhino.Node)",
      "begin_line": 320,
      "end_line": 340,
      "comment": "\n   * Processes a CALL expression.\n   *\n   * @return true to continue traversal, false otherwise\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 322,col 63)",
        "(line 326,col 5)-(line 326,col 45)",
        "(line 327,col 5)-(line 332,col 5)",
        "(line 334,col 5)-(line 336,col 5)",
        "(line 338,col 5)-(line 338,col 34)",
        "(line 339,col 5)-(line 339,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.processConstructorCall(com.google.javascript.rhino.Node)",
      "begin_line": 347,
      "end_line": 359,
      "comment": "\n   * Processes a NEW expression.\n   *\n   * @return true to continue traversal, false otherwise\n   ",
      "child_ranges": [
        "(line 348,col 5)-(line 349,col 62)",
        "(line 353,col 5)-(line 355,col 5)",
        "(line 357,col 5)-(line 357,col 34)",
        "(line 358,col 5)-(line 358,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 361,
      "end_line": 362,
      "comment": "",
      "child_ranges": []
    }
  ]
}