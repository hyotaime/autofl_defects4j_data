{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeMinimizeConditions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeMinimizeConditions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 38,
      "end_line": 1503,
      "comment": "\n * A peephole optimization that minimizes conditional expressions\n * according to De Morgan\u0027s laws.\n * Also rewrites conditional statements as expressions by replacing them\n * with HOOKs and short-circuit binary operators.\n *\n * Based on PeepholeSubstituteAlternateSyntax\n "
    },
    {
      "type": "field",
      "varNames": [
        "AND_PRECEDENCE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_PRECEDENCE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AGGRESSIVE_MINIMIZE_CONDITIONS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveMinimization"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DONT_TRAVERSE_FUNCTIONS_PREDICATE"
      ],
      "begin_line": 48,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.Anonymous-d368b16a-880d-4f05-929b-f1d82b80aef4.apply(com.google.javascript.rhino.Node)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 7)-(line 52,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.PeepholeMinimizeConditions(boolean)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n   * @param late When late is false, this mean we are currently running before\n   * most of the other optimizations. In this case we would avoid optimizations\n   * that would make the code harder to analyze (such as using string splitting,\n   * merging statements with commas, etc). When this is true, we would\n   * do anything to minimize for size.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.PeepholeMinimizeConditions(boolean, boolean)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 21)",
        "(line 69,col 5)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 125,
      "comment": "\n   * Tries apply our various peephole minimizations on the passed in node.\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 124,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryJoinForCondition(com.google.javascript.rhino.Node)",
      "begin_line": 127,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 130,col 5)",
        "(line 132,col 5)-(line 132,col 34)",
        "(line 133,col 5)-(line 133,col 41)",
        "(line 134,col 5)-(line 164,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryReplaceIf(com.google.javascript.rhino.Node)",
      "begin_line": 170,
      "end_line": 241,
      "comment": "\n   * Use \"return x?1:2;\" in place of \"if(x)return 1;return 2;\"\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 239,col 5)",
        "(line 240,col 5)-(line 240,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.statementMustExitParent(com.google.javascript.rhino.Node)",
      "begin_line": 243,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 258,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryReplaceExitWithBreak(com.google.javascript.rhino.Node)",
      "begin_line": 272,
      "end_line": 323,
      "comment": "\n   * Replace duplicate exits in control structures.  If the node following\n   * the exit node expression has the same effect as exit node, the node can\n   * be replaced or removed.\n   * For example:\n   *   \"while (a) {return f()} return f();\" \u003d\u003d\u003e \"while (a) {break} return f();\"\n   *   \"while (a) {throw \u0027ow\u0027} throw \u0027ow\u0027;\" \u003d\u003d\u003e \"while (a) {break} throw \u0027ow\u0027;\"\n   *\n   * @param n An follow control exit expression (a THROW or RETURN node)\n   * @return The replacement for n, or the original if no change was made.\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 36)",
        "(line 277,col 5)-(line 277,col 25)",
        "(line 278,col 5)-(line 284,col 5)",
        "(line 286,col 5)-(line 286,col 69)",
        "(line 297,col 5)-(line 297,col 36)",
        "(line 298,col 5)-(line 298,col 38)",
        "(line 300,col 5)-(line 306,col 5)",
        "(line 308,col 5)-(line 311,col 5)",
        "(line 315,col 5)-(line 320,col 5)",
        "(line 322,col 5)-(line 322,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryRemoveRedundantExit(com.google.javascript.rhino.Node)",
      "begin_line": 335,
      "end_line": 366,
      "comment": "\n   * Remove duplicate exits.  If the node following the exit node expression\n   * has the same effect as exit node, the node can be removed.\n   * For example:\n   *   \"if (a) {return f()} return f();\" \u003d\u003d\u003e \"if (a) {} return f();\"\n   *   \"if (a) {throw \u0027ow\u0027} throw \u0027ow\u0027;\" \u003d\u003d\u003e \"if (a) {} throw \u0027ow\u0027;\"\n   *\n   * @param n An follow control exit expression (a THROW or RETURN node)\n   * @return The replacement for n, or the original if no change was made.\n   ",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 38)",
        "(line 338,col 5)-(line 338,col 59)",
        "(line 342,col 5)-(line 342,col 36)",
        "(line 343,col 5)-(line 343,col 38)",
        "(line 344,col 5)-(line 350,col 5)",
        "(line 352,col 5)-(line 355,col 5)",
        "(line 359,col 5)-(line 363,col 5)",
        "(line 365,col 5)-(line 365,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isPure(com.google.javascript.rhino.Node)",
      "begin_line": 372,
      "end_line": 376,
      "comment": "\n   * @return Whether the expression does not produces and can not be affected\n   * by side-effects.\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 375,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.skipFinallyNodes(com.google.javascript.rhino.Node)",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\n   * @return n or the node following any following finally nodes.\n   ",
      "child_ranges": [
        "(line 382,col 5)-(line 384,col 5)",
        "(line 385,col 5)-(line 385,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.areMatchingExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 394,
      "end_line": 398,
      "comment": "\n   * Check whether one exit can be replaced with another. Verify:\n   * 1) They are identical expressions\n   * 2) If an exception is possible that the statements, the original\n   * and the potential replacement are in the same exception handler.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 397,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isExceptionPossible(com.google.javascript.rhino.Node)",
      "begin_line": 400,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 403,col 24)",
        "(line 404,col 5)-(line 406,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.getExceptionHandler(com.google.javascript.rhino.Node)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryMinimizeNot(com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 447,
      "comment": "\n   * Try to minimize NOT nodes such as !(x\u003d\u003dy).\n   *\n   * Returns the replacement for n or the original if no change was made\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 43)",
        "(line 420,col 5)-(line 420,col 32)",
        "(line 422,col 5)-(line 422,col 38)",
        "(line 424,col 5)-(line 424,col 27)",
        "(line 425,col 5)-(line 441,col 5)",
        "(line 442,col 5)-(line 442,col 44)",
        "(line 443,col 5)-(line 443,col 44)",
        "(line 444,col 5)-(line 444,col 40)",
        "(line 445,col 5)-(line 445,col 23)",
        "(line 446,col 5)-(line 446,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryMinimizeExprResult(com.google.javascript.rhino.Node)",
      "begin_line": 456,
      "end_line": 473,
      "comment": "\n   * Try to remove leading NOTs from EXPR_RESULTS.\n   *\n   * Returns the replacement for n or the original if no replacement was\n   * necessary.\n   ",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 45)",
        "(line 458,col 5)-(line 458,col 35)",
        "(line 459,col 5)-(line 459,col 49)",
        "(line 460,col 5)-(line 462,col 55)",
        "(line 463,col 5)-(line 464,col 48)",
        "(line 465,col 5)-(line 471,col 5)",
        "(line 472,col 5)-(line 472,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryMinimizeHook(com.google.javascript.rhino.Node)",
      "begin_line": 481,
      "end_line": 501,
      "comment": "\n   * Try flipping HOOKs that have negated conditions.\n   *\n   * Returns the replacement for n or the original if no replacement was\n   * necessary.\n   ",
      "child_ranges": [
        "(line 482,col 5)-(line 482,col 42)",
        "(line 483,col 5)-(line 483,col 35)",
        "(line 484,col 5)-(line 484,col 46)",
        "(line 485,col 5)-(line 487,col 55)",
        "(line 488,col 5)-(line 489,col 48)",
        "(line 490,col 5)-(line 499,col 5)",
        "(line 500,col 5)-(line 500,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryMinimizeIf(com.google.javascript.rhino.Node)",
      "begin_line": 509,
      "end_line": 763,
      "comment": "\n   * Try turning IF nodes into smaller HOOKs\n   *\n   * Returns the replacement for n or the original if no replacement was\n   * necessary.\n   ",
      "child_ranges": [
        "(line 511,col 5)-(line 511,col 32)",
        "(line 513,col 5)-(line 513,col 42)",
        "(line 518,col 5)-(line 520,col 5)",
        "(line 522,col 5)-(line 522,col 45)",
        "(line 523,col 5)-(line 523,col 43)",
        "(line 525,col 5)-(line 525,col 56)",
        "(line 526,col 5)-(line 526,col 46)",
        "(line 528,col 5)-(line 528,col 50)",
        "(line 529,col 5)-(line 529,col 46)",
        "(line 530,col 5)-(line 544,col 5)",
        "(line 545,col 5)-(line 545,col 24)",
        "(line 547,col 5)-(line 623,col 5)",
        "(line 628,col 5)-(line 628,col 35)",
        "(line 632,col 5)-(line 638,col 5)",
        "(line 641,col 5)-(line 657,col 5)",
        "(line 659,col 5)-(line 659,col 77)",
        "(line 660,col 5)-(line 660,col 77)",
        "(line 662,col 5)-(line 704,col 5)",
        "(line 706,col 5)-(line 706,col 53)",
        "(line 707,col 5)-(line 707,col 53)",
        "(line 710,col 5)-(line 759,col 5)",
        "(line 761,col 5)-(line 761,col 44)",
        "(line 762,col 5)-(line 762,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryRemoveRepeatedStatements(com.google.javascript.rhino.Node)",
      "begin_line": 787,
      "end_line": 815,
      "comment": "\n   * Try to remove duplicate statements from IF blocks. For example:\n   *\n   * if (a) {\n   *   x \u003d 1;\n   *   return true;\n   * } else {\n   *   x \u003d 2;\n   *   return true;\n   * }\n   *\n   * becomes:\n   *\n   * if (a) {\n   *   x \u003d 1;\n   * } else {\n   *   x \u003d 2;\n   * }\n   * return true;\n   *\n   * @param n The IF node to examine.\n   ",
      "child_ranges": [
        "(line 788,col 5)-(line 788,col 39)",
        "(line 790,col 5)-(line 790,col 32)",
        "(line 791,col 5)-(line 795,col 5)",
        "(line 797,col 5)-(line 797,col 34)",
        "(line 798,col 5)-(line 798,col 37)",
        "(line 799,col 5)-(line 799,col 44)",
        "(line 800,col 5)-(line 800,col 43)",
        "(line 801,col 5)-(line 801,col 44)",
        "(line 803,col 5)-(line 814,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isFoldableExpressBlock(com.google.javascript.rhino.Node)",
      "begin_line": 821,
      "end_line": 852,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an expression.\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 849,col 5)",
        "(line 851,col 5)-(line 851,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.getBlockExpression(com.google.javascript.rhino.Node)",
      "begin_line": 857,
      "end_line": 860,
      "comment": "\n   * @return The expression node.\n   ",
      "child_ranges": [
        "(line 858,col 5)-(line 858,col 56)",
        "(line 859,col 5)-(line 859,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isReturnBlock(com.google.javascript.rhino.Node)",
      "begin_line": 866,
      "end_line": 875,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an return with or without an expression.\n   ",
      "child_ranges": [
        "(line 867,col 5)-(line 872,col 5)",
        "(line 874,col 5)-(line 874,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isReturnExpressBlock(com.google.javascript.rhino.Node)",
      "begin_line": 881,
      "end_line": 892,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an return.\n   ",
      "child_ranges": [
        "(line 882,col 5)-(line 889,col 5)",
        "(line 891,col 5)-(line 891,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isReturnExpression(com.google.javascript.rhino.Node)",
      "begin_line": 897,
      "end_line": 902,
      "comment": "\n   * @return Whether the node is a single return statement.\n   ",
      "child_ranges": [
        "(line 898,col 5)-(line 900,col 5)",
        "(line 901,col 5)-(line 901,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.getBlockReturnExpression(com.google.javascript.rhino.Node)",
      "begin_line": 907,
      "end_line": 910,
      "comment": "\n   * @return The expression that is part of the return.\n   ",
      "child_ranges": [
        "(line 908,col 5)-(line 908,col 54)",
        "(line 909,col 5)-(line 909,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isVarBlock(com.google.javascript.rhino.Node)",
      "begin_line": 916,
      "end_line": 927,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     a VAR declaration of a single variable.\n   ",
      "child_ranges": [
        "(line 917,col 5)-(line 924,col 5)",
        "(line 926,col 5)-(line 926,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.getBlockVar(com.google.javascript.rhino.Node)",
      "begin_line": 932,
      "end_line": 935,
      "comment": "\n   * @return The var node.\n   ",
      "child_ranges": [
        "(line 933,col 5)-(line 933,col 44)",
        "(line 934,col 5)-(line 934,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.consumesDanglingElse(com.google.javascript.rhino.Node)",
      "begin_line": 942,
      "end_line": 968,
      "comment": "\n   * Does a statement consume a \u0027dangling else\u0027? A statement consumes\n   * a \u0027dangling else\u0027 if an \u0027else\u0027 token following the statement\n   * would be considered by the parser to be part of the statement.\n   ",
      "child_ranges": [
        "(line 943,col 5)-(line 967,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isLowerPrecedence(com.google.javascript.rhino.Node, int)",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\n   * Whether the node type has lower precedence than \"precedence\"\n   ",
      "child_ranges": [
        "(line 974,col 5)-(line 974,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isHigherPrecedence(com.google.javascript.rhino.Node, int)",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\n   * Whether the node type has higher precedence than \"precedence\"\n   ",
      "child_ranges": [
        "(line 981,col 5)-(line 981,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.isPropertyAssignmentInExpression(com.google.javascript.rhino.Node)",
      "begin_line": 987,
      "end_line": 999,
      "comment": "\n   * Does the expression contain a property assignment?\n   ",
      "child_ranges": [
        "(line 988,col 5)-(line 995,col 6)",
        "(line 997,col 5)-(line 998,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.Anonymous-b4d63e16-53b7-470f-8dea-c9a232f6c764.apply(com.google.javascript.rhino.Node)",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 992,col 9)-(line 993,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.tryMinimizeCondition(com.google.javascript.rhino.Node)",
      "begin_line": 1008,
      "end_line": 1019,
      "comment": "\n   * Try to minimize condition expression, as there are additional\n   * assumptions that can be made when it is known that the final result\n   * is a boolean.\n   *\n   * @return The replacement for n, or the original if no change was made.\n   ",
      "child_ranges": [
        "(line 1009,col 5)-(line 1009,col 41)",
        "(line 1010,col 5)-(line 1018,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.replaceNode(com.google.javascript.rhino.Node, com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode)",
      "begin_line": 1021,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 5)-(line 1022,col 34)",
        "(line 1023,col 5)-(line 1023,col 39)",
        "(line 1024,col 5)-(line 1026,col 5)",
        "(line 1027,col 5)-(line 1027,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinimizedCondition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1035,
      "end_line": 1280,
      "comment": " A class that represents a minimized conditional expression.\n   *  Depending on the context, either the original conditional, or the\n   *  negation of the original conditional may be needed, so this class\n   *  provides ways to access minimized versions of both of those ASTs.\n   "
    },
    {
      "type": "class_interface",
      "name": "MeasuredNode",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1036,
      "end_line": 1124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 1037,
      "end_line": 1037,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 1038,
      "end_line": 1038,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "changed"
      ],
      "begin_line": 1039,
      "end_line": 1039,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.MeasuredNode(com.google.javascript.rhino.Node, int, boolean)",
      "begin_line": 1041,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 17)",
        "(line 1043,col 9)-(line 1043,col 21)",
        "(line 1044,col 9)-(line 1044,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.negate()",
      "begin_line": 1047,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 22)",
        "(line 1049,col 9)-(line 1049,col 31)",
        "(line 1050,col 9)-(line 1066,col 9)",
        "(line 1068,col 9)-(line 1068,col 41)",
        "(line 1069,col 9)-(line 1069,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.change()",
      "begin_line": 1072,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 9)-(line 1073,col 28)",
        "(line 1074,col 9)-(line 1074,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.addNot()",
      "begin_line": 1077,
      "end_line": 1081,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 54)",
        "(line 1079,col 9)-(line 1079,col 45)",
        "(line 1080,col 9)-(line 1080,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.estimateCostOneLevel(com.google.javascript.rhino.Node)",
      "begin_line": 1093,
      "end_line": 1106,
      "comment": " Estimate the number of characters in the textual representation of\n       *  the given node and that will be devoted to negation or parentheses.\n       *  Since these are the only characters that flipping a condition\n       *  according to De Morgan\u0027s rule can affect, these are the only ones\n       *  we count.\n       *  Not nodes are counted by the NOT node itself, whereas\n       *  parentheses around an expression are counted by the parent node.\n       *  @param n The node to be checked.\n       *  @return The number of negations and parentheses in the node.\n       ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 21)",
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1098,col 64)",
        "(line 1099,col 9)-(line 1104,col 9)",
        "(line 1105,col 9)-(line 1105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.cloneTree()",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode.addNode(com.google.javascript.rhino.Node, com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode...)",
      "begin_line": 1112,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 21)",
        "(line 1114,col 9)-(line 1114,col 32)",
        "(line 1115,col 9)-(line 1119,col 9)",
        "(line 1120,col 9)-(line 1120,col 45)",
        "(line 1121,col 9)-(line 1121,col 55)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "positive"
      ],
      "begin_line": 1125,
      "end_line": 1125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "negative"
      ],
      "begin_line": 1126,
      "end_line": 1126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MinimizedCondition(com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode, com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode)",
      "begin_line": 1128,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 7)-(line 1129,col 62)",
        "(line 1130,col 7)-(line 1130,col 62)",
        "(line 1131,col 7)-(line 1131,col 19)",
        "(line 1132,col 7)-(line 1132,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.fromConditionNode(com.google.javascript.rhino.Node)",
      "begin_line": 1135,
      "end_line": 1146,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 7)-(line 1145,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.computeMinimizedCondition(com.google.javascript.rhino.Node)",
      "begin_line": 1154,
      "end_line": 1232,
      "comment": " Minimize the condition at the given node.\n     *\n     *  @param n The conditional expression tree to minimize.\n     *   This must be removed from the tree before being passed in connected.\n     *  @return A MinimizedCondition object representing that tree.\n     ",
      "child_ranges": [
        "(line 1155,col 7)-(line 1155,col 57)",
        "(line 1156,col 7)-(line 1231,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.unoptimized(com.google.javascript.rhino.Node)",
      "begin_line": 1241,
      "end_line": 1249,
      "comment": " Return a MeasuredNode of the given condition node, without minimizing\n     * the result.\n    *\n    *  @param n The conditional expression tree to minimize.\n    *   This must be removed from the tree before being passed in connected.\n    *  @return A MinimizedCondition object representing that tree.\n    ",
      "child_ranges": [
        "(line 1242,col 7)-(line 1242,col 57)",
        "(line 1243,col 7)-(line 1243,col 55)",
        "(line 1247,col 7)-(line 1247,col 80)",
        "(line 1248,col 7)-(line 1248,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.getShorterRepresentation(boolean)",
      "begin_line": 1263,
      "end_line": 1270,
      "comment": " Return the shorter representation of the original condition node.\n     *\n     * @param countLeadingNot When this is false, do not count a leading\n     *  NOT in doing the minimization.\n     *  i.e. Prefer the right side in cases such as:\n     *    !x || !y || z  \u003d\u003d\u003e  !(x \u0026\u0026 y \u0026\u0026 !z)\n     *  This is useful in contexts such as IFs or HOOKs where subsequent\n     *  optimizations can efficiently deal with leading NOTs.\n     *\n     *  @return The minimized condition MeasuredNode, with equivalent value\n     *    to that passed to #fromConditionNode().\n     ",
      "child_ranges": [
        "(line 1264,col 6)-(line 1269,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "AST_LENGTH_COMPARATOR"
      ],
      "begin_line": 1272,
      "end_line": 1278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.Anonymous-7ac7a925-9ec4-49ca-a644-61a0794bec3f.compare(com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode, com.google.javascript.jscomp.PeepholeMinimizeConditions.MinimizedCondition.MeasuredNode)",
      "begin_line": 1274,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.performConditionSubstitutions(com.google.javascript.rhino.Node)",
      "begin_line": 1293,
      "end_line": 1401,
      "comment": "\n   * Try to minimize the given condition by applying local substitutions.\n   *\n   * The following types of transformations are performed:\n   *   x || true        --\u003e true\n   *   x \u0026\u0026 true        --\u003e x\n   *   x ? false : true --\u003e !x\n   *   x ? true : y     --\u003e x || y\n   *\n   *   Returns the replacement for n, or the original if no change was made\n   ",
      "child_ranges": [
        "(line 1294,col 5)-(line 1296,col 5)",
        "(line 1298,col 5)-(line 1298,col 32)",
        "(line 1300,col 5)-(line 1400,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.simpleDemorgan(com.google.javascript.rhino.Node)",
      "begin_line": 1407,
      "end_line": 1483,
      "comment": "\n   *  Perform a heuristic-based application of De Morgan\u0027s Laws, trying to\n   *  push NOT nodes further down the AST toward the leaves.\n   ",
      "child_ranges": [
        "(line 1408,col 5)-(line 1408,col 32)",
        "(line 1409,col 5)-(line 1409,col 35)",
        "(line 1410,col 5)-(line 1479,col 5)",
        "(line 1482,col 5)-(line 1482,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeMinimizeConditions.maybeReplaceChildWithNumber(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)",
      "begin_line": 1491,
      "end_line": 1501,
      "comment": "\n   * Replaces a node with a number node if the new number node is not equivalent\n   * to the current node.\n   *\n   * Returns the replacement for n if it was replaced, otherwise returns n.\n   ",
      "child_ranges": [
        "(line 1492,col 5)-(line 1492,col 34)",
        "(line 1493,col 5)-(line 1498,col 5)",
        "(line 1500,col 5)-(line 1500,col 13)"
      ]
    }
  ]
}