{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ExpressionDecomposer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpressionDecomposer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 893,
      "comment": "\n * Methods necessary for partially or full decomposing an expression.  Initially\n * this is intended to expanded the locations were inlining can occur, but has\n * other uses as well.\n *\n * For example:\n *    var x \u003d y() + z();\n *\n * Becomes:\n *    var a \u003d y();\n *    var b \u003d z();\n *    x \u003d a + b;\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeNameIdSupplier"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "knownConstants"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.ExpressionDecomposer(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 58,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 41)",
        "(line 63,col 5)-(line 63,col 51)",
        "(line 64,col 5)-(line 64,col 43)",
        "(line 65,col 5)-(line 65,col 29)",
        "(line 66,col 5)-(line 66,col 49)",
        "(line 67,col 5)-(line 67,col 37)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INTERATIONS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " An arbitrary limit to prevent catch infinite recursion."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.maybeExposeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 90,
      "comment": "\n   * If required, rewrite the statement containing the expression.\n   * @param expression The expression to be exposed.\n   * @see #canExposeExpression\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 14)",
        "(line 81,col 5)-(line 89,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.exposeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n   * Perform any rewriting necessary so that the specified expression\n   * is movable. This is a partial expression decomposition.\n   * @see #canExposeExpression\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 57)",
        "(line 99,col 5)-(line 99,col 53)",
        "(line 100,col 5)-(line 100,col 49)",
        "(line 101,col 5)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.moveExpression(com.google.javascript.rhino.Node)",
      "begin_line": 112,
      "end_line": 129,
      "comment": "\n   * Extract the specified expression from its parent expression.\n   * @see #canExposeExpression\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 45)",
        "(line 114,col 5)-(line 114,col 57)",
        "(line 115,col 5)-(line 115,col 47)",
        "(line 116,col 5)-(line 116,col 59)",
        "(line 117,col 5)-(line 117,col 53)",
        "(line 118,col 5)-(line 118,col 78)",
        "(line 121,col 5)-(line 121,col 51)",
        "(line 122,col 5)-(line 123,col 41)",
        "(line 126,col 5)-(line 126,col 73)",
        "(line 127,col 5)-(line 127,col 75)",
        "(line 128,col 5)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.exposeExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 146,
      "end_line": 235,
      "comment": "\n   * Rewrite the expression such that the sub-expression is in a movable\n   * expression statement while maintaining evaluation order.\n   *\n   * Two types of subexpressions are extracted from the source expression:\n   * 1) subexpressions with side-effects.\n   * 2) conditional expressions, that contain the call, which are transformed\n   * into IF statements.\n   *\n   * The following terms are used:\n   *    expressionRoot: The top-level node before which the any extracted\n   *                    expressions should be placed before.\n   *    nonconditionalExpr: The node that will be extracted either expres.\n   *\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 148,col 39)",
        "(line 150,col 5)-(line 151,col 38)",
        "(line 153,col 5)-(line 153,col 69)",
        "(line 154,col 5)-(line 154,col 56)",
        "(line 155,col 5)-(line 155,col 48)",
        "(line 156,col 5)-(line 156,col 54)",
        "(line 159,col 5)-(line 218,col 5)",
        "(line 225,col 5)-(line 234,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.allowObjectCallDecomposing()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.maybeExternMethod(com.google.javascript.rhino.Node)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n   * @return Whether the node may represent an external method.\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.findNonconditionalParent(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 253,
      "end_line": 270,
      "comment": "\n   * @return \"expression\" or the node closest to \"expression\", that does not\n   * have a conditional ancestor.\n   ",
      "child_ranges": [
        "(line 255,col 6)-(line 255,col 33)",
        "(line 257,col 6)-(line 267,col 6)",
        "(line 269,col 6)-(line 269,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DecompositionState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n   * A simple class to track two things:\n   *   - whether side effects have been seen.\n   *   - the last statement inserted\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sideEffects"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extractBeforeStatement"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.decomposeObjectLiteralKeys(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState)",
      "begin_line": 287,
      "end_line": 294,
      "comment": "\n   * Decompose an object literal.\n   * @param key The object literal key.\n   * @param stopNode A node after which to stop iterating.\n   ",
      "child_ranges": [
        "(line 289,col 5)-(line 291,col 5)",
        "(line 292,col 5)-(line 292,col 63)",
        "(line 293,col 5)-(line 293,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.decomposeSubExpressions(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState)",
      "begin_line": 300,
      "end_line": 325,
      "comment": "\n   * @param n The node with which to start iterating.\n   * @param stopNode A node after which to stop iterating.\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 304,col 5)",
        "(line 307,col 5)-(line 307,col 58)",
        "(line 313,col 5)-(line 314,col 38)",
        "(line 318,col 5)-(line 324,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.extractConditional(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 336,
      "end_line": 406,
      "comment": "\n   *\n   * @param expr The conditional expression to extract.\n   * @param injectionPoint The before which extracted expression, would be\n   *     injected.\n   * @param needResult  Whether the result of the expression is required.\n   * @return The node that contains the logic of the expression after\n   *     extraction.\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 35)",
        "(line 339,col 5)-(line 339,col 41)",
        "(line 342,col 5)-(line 342,col 38)",
        "(line 343,col 5)-(line 343,col 34)",
        "(line 344,col 5)-(line 344,col 36)",
        "(line 347,col 5)-(line 347,col 26)",
        "(line 350,col 5)-(line 350,col 21)",
        "(line 351,col 5)-(line 351,col 44)",
        "(line 352,col 5)-(line 352,col 45)",
        "(line 353,col 5)-(line 377,col 5)",
        "(line 379,col 5)-(line 379,col 16)",
        "(line 380,col 5)-(line 384,col 5)",
        "(line 385,col 5)-(line 385,col 37)",
        "(line 387,col 5)-(line 403,col 5)",
        "(line 405,col 5)-(line 405,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(com.google.javascript.rhino.Node, boolean, java.lang.String)",
      "begin_line": 417,
      "end_line": 426,
      "comment": "\n   * Create an expression tree for an expression.\n   * If the result of the expression is needed, then:\n   *    ASSIGN\n   *       tempName\n   *       expr\n   * otherwise, simply:\n   *       expr\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 425,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.isConstantName(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 431,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.extractExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 440,
      "end_line": 508,
      "comment": "\n   * @param expr The expression to extract.\n   * @param injectionPoint The node before which to added the extracted\n   *     expression.\n   * @return The extract statement node.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 35)",
        "(line 443,col 5)-(line 445,col 42)",
        "(line 447,col 5)-(line 447,col 35)",
        "(line 455,col 5)-(line 464,col 5)",
        "(line 467,col 5)-(line 467,col 49)",
        "(line 468,col 5)-(line 468,col 63)",
        "(line 470,col 5)-(line 470,col 23)",
        "(line 474,col 5)-(line 496,col 5)",
        "(line 499,col 5)-(line 499,col 68)",
        "(line 501,col 5)-(line 501,col 59)",
        "(line 502,col 5)-(line 502,col 69)",
        "(line 504,col 5)-(line 506,col 5)",
        "(line 507,col 5)-(line 507,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.rewriteCallExpression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState)",
      "begin_line": 520,
      "end_line": 569,
      "comment": "\n   * Rewrite the call so \"this\" is preserved.\n   *   a.b(c);\n   * becomes:\n   *   var temp1 \u003d a;\n   *   var temp0 \u003d temp1.b;\n   *   temp0.call(temp1,c);\n   *\n   * @return The replacement node.\n   ",
      "child_ranges": [
        "(line 521,col 5)-(line 521,col 47)",
        "(line 522,col 5)-(line 522,col 38)",
        "(line 523,col 5)-(line 523,col 55)",
        "(line 527,col 5)-(line 528,col 45)",
        "(line 529,col 5)-(line 529,col 46)",
        "(line 533,col 5)-(line 533,col 66)",
        "(line 534,col 5)-(line 534,col 61)",
        "(line 535,col 5)-(line 536,col 67)",
        "(line 537,col 5)-(line 537,col 47)",
        "(line 540,col 5)-(line 540,col 52)",
        "(line 541,col 5)-(line 541,col 55)",
        "(line 551,col 5)-(line 555,col 47)",
        "(line 558,col 5)-(line 558,col 28)",
        "(line 559,col 5)-(line 562,col 5)",
        "(line 565,col 5)-(line 565,col 39)",
        "(line 566,col 5)-(line 566,col 43)",
        "(line 568,col 5)-(line 568,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tempNamePrefix"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resultNamePrefix"
      ],
      "begin_line": 572,
      "end_line": 572,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.setTempNamePrefix(java.lang.String)",
      "begin_line": 577,
      "end_line": 580,
      "comment": "\n   * Allow the temp name to be overridden to make tests more readable.\n   ",
      "child_ranges": [
        "(line 579,col 5)-(line 579,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.getTempValueName()",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\n   * Create a unique temp name.\n   ",
      "child_ranges": [
        "(line 586,col 5)-(line 587,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.setResultNamePrefix(java.lang.String)",
      "begin_line": 593,
      "end_line": 596,
      "comment": "\n   * Allow the temp name to be overridden to make tests more readable.\n   ",
      "child_ranges": [
        "(line 595,col 5)-(line 595,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.getResultValueName()",
      "begin_line": 601,
      "end_line": 604,
      "comment": "\n   * Create a unique name for call results.\n   ",
      "child_ranges": [
        "(line 602,col 5)-(line 603,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.getTempConstantValueName()",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n   * Create a constant unique temp name.\n   ",
      "child_ranges": [
        "(line 610,col 5)-(line 612,col 35)",
        "(line 613,col 5)-(line 613,col 34)",
        "(line 614,col 5)-(line 614,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.findInjectionPoint(com.google.javascript.rhino.Node)",
      "begin_line": 621,
      "end_line": 636,
      "comment": "\n   * @return For the subExpression, find the nearest statement Node before which\n   * it can be inlined.  Null if no such location can be found.\n   ",
      "child_ranges": [
        "(line 622,col 5)-(line 622,col 60)",
        "(line 623,col 5)-(line 623,col 47)",
        "(line 625,col 5)-(line 625,col 41)",
        "(line 627,col 5)-(line 627,col 45)",
        "(line 628,col 5)-(line 631,col 5)",
        "(line 633,col 5)-(line 634,col 63)",
        "(line 635,col 5)-(line 635,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.isConditionalOp(com.google.javascript.rhino.Node)",
      "begin_line": 641,
      "end_line": 650,
      "comment": "\n   * @return Whether the node is a conditional op.\n   ",
      "child_ranges": [
        "(line 642,col 5)-(line 649,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.findExpressionRoot(com.google.javascript.rhino.Node)",
      "begin_line": 657,
      "end_line": 685,
      "comment": "\n   * @return The statement containing the expression. null if subExpression\n   *     is not contain by in by a Node where inlining is known to be possible.\n   *     For example, a WHILE node condition expression.\n   ",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 31)",
        "(line 659,col 5)-(line 682,col 5)",
        "(line 684,col 5)-(line 684,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.canExposeExpression(com.google.javascript.rhino.Node)",
      "begin_line": 712,
      "end_line": 718,
      "comment": "\n   * Determine whether a expression is movable, or can be be made movable be\n   * decomposing the containing expression.\n   *\n   * An subExpression is MOVABLE if it can be replaced with a temporary holding\n   * its results and moved to immediately before the root of the expression.\n   * There are three conditions that must be met for this to occur:\n   * 1) There must be a location to inject a statement for the expression.  For\n   * example, this condition can not be met if the expression is a loop\n   * condition or CASE condition.\n   * 2) If the expression can be affect by side-effects, there can not be a\n   * side-effect between original location and the expression root.\n   * 3) If the expression has side-effects, there can not be any other\n   * expression that can be effected between the original location and the\n   * expression root.\n   *\n   * An expression is DECOMPOSABLE if it can be rewritten so that an\n   * subExpression is MOVABLE.\n   *\n   * An expression is decomposed by moving any other sub-expressions that\n   * preventing an subExpression from being MOVABLE.\n   *\n   * @return Whether This is a call that can be moved to an new point in the\n   * AST to allow it to be inlined.\n   ",
      "child_ranges": [
        "(line 713,col 5)-(line 713,col 60)",
        "(line 714,col 5)-(line 716,col 5)",
        "(line 717,col 5)-(line 717,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.isSubexpressionMovable(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 746,
      "end_line": 836,
      "comment": "\n   * Walk the AST from the call site to the expression root and verify that\n   * the portions of the expression that are evaluated before the call are:\n   * 1) Unaffected by the the side-effects, if any, of the call.\n   * 2) That there are no side-effects, that may influence the call.\n   *\n   * For example, if x has side-effects:\n   *   a \u003d 1 + x();\n   * the call to x can be moved because \"a\" final value of a can not be\n   * influenced by x(), but in:\n   *   a \u003d b + x();\n   * the call to x can not be moved because the value of b may be modified\n   * by the call to x.\n   *\n   * If x is without side-effects in:\n   *   a \u003d b + x();\n   * the call to x can be moved, but in:\n   *   a \u003d (b.foo \u003d c) + x();\n   * the call to x can not be moved because the value of b.foo may be referenced\n   * by x().  Note: this is true even if b is a local variable; the object that\n   * b refers to may have a global alias.\n   *\n   * @return UNDECOMPOSABLE if the expression can not be moved, DECOMPOSABLE if\n   * decomposition is required before the expression can be moved, otherwise\n   * MOVABLE.\n   ",
      "child_ranges": [
        "(line 748,col 5)-(line 748,col 42)",
        "(line 749,col 5)-(line 750,col 33)",
        "(line 752,col 5)-(line 752,col 31)",
        "(line 753,col 5)-(line 832,col 5)",
        "(line 835,col 5)-(line 835,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.isSafeAssign(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 859,
      "end_line": 873,
      "comment": "\n   * It is always safe to inline \"foo()\" for expressions such as\n   *    \"a \u003d b \u003d c \u003d foo();\"\n   * As the assignment is unaffected by side effect of \"foo()\"\n   * and the names assigned-to can not influence the state before\n   * the call to foo.\n   *\n   * It is also safe in cases like where the object is constant:\n   *    CONST_NAME.a \u003d foo()\n   *    CONST_NAME[CONST_VALUE] \u003d foo();\n   *\n   * This is not true of more complex LHS values, such as\n   *     a.x \u003d foo();\n   *     next().x \u003d foo();\n   * in these cases the checks below are necessary.\n   *\n   * @param seenSideEffects If true, check to see if node-tree maybe affected by\n   * side-effects, otherwise if the tree has side-effects. @see\n   * isExpressionTreeUnsafe\n   * @return Whether the assignment is safe from side-effects.\n   ",
      "child_ranges": [
        "(line 860,col 5)-(line 871,col 5)",
        "(line 872,col 5)-(line 872,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpressionDecomposer.isExpressionTreeUnsafe(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 879,
      "end_line": 892,
      "comment": "\n   * @return Whether anything in the expression tree prevents a call from\n   * being moved.\n   ",
      "child_ranges": [
        "(line 881,col 5)-(line 891,col 5)"
      ]
    }
  ]
}