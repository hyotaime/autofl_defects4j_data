{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PeepholeSubstituteAlternateSyntax.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeSubstituteAlternateSyntax",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 37,
      "end_line": 1725,
      "comment": "\n * A peephole optimization that minimizes code by simplifying conditional\n * expressions, replacing IFs with HOOKs, replacing object constructors\n * with literals, and simplifying returns.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "AND_PRECEDENCE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OR_PRECEDENCE"
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
        "REGEXP_ESCAPER"
      ],
      "begin_line": 43,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_SPLIT_OVERHEAD"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_REGULAR_EXPRESSION_FLAGS"
      ],
      "begin_line": 51,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DONT_TRAVERSE_FUNCTIONS_PREDICATE"
      ],
      "begin_line": 56,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.Anonymous-26ce4c8c-5b90-41fe-9a5e-5c96f94d2ec9.apply(com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 7)-(line 60,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.PeepholeSubstituteAlternateSyntax(boolean)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n   * @param late When late is false, this mean we are currently running before\n   * most of the other optimizations. In this case we would avoid optimizations\n   * that would make the code harder to analyze (such as using string splitting,\n   * merging statements with commas, etc). When this is true, we would\n   * do anything to minimize for size.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 169,
      "comment": "\n   * Tries apply our various peephole minimizations on the passed in node.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryJoinForCondition(com.google.javascript.rhino.Node)",
      "begin_line": 171,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 174,col 5)",
        "(line 176,col 5)-(line 176,col 34)",
        "(line 177,col 5)-(line 177,col 41)",
        "(line 178,col 5)-(line 208,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldSimpleFunctionCall(com.google.javascript.rhino.Node)",
      "begin_line": 211,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 41)",
        "(line 213,col 5)-(line 213,col 40)",
        "(line 214,col 5)-(line 232,col 5)",
        "(line 233,col 5)-(line 233,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldImmediateCallToBoundFunction(com.google.javascript.rhino.Node)",
      "begin_line": 236,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 41)",
        "(line 239,col 5)-(line 239,col 40)",
        "(line 240,col 5)-(line 240,col 78)",
        "(line 241,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 264,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.addParameterAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 272,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.trySplitComma(com.google.javascript.rhino.Node)",
      "begin_line": 275,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 278,col 5)",
        "(line 279,col 5)-(line 279,col 32)",
        "(line 280,col 5)-(line 280,col 34)",
        "(line 281,col 5)-(line 281,col 34)",
        "(line 283,col 5)-(line 300,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReplaceIf(com.google.javascript.rhino.Node)",
      "begin_line": 306,
      "end_line": 377,
      "comment": "\n   * Use \"return x?1:2;\" in place of \"if(x)return 1;return 2;\"\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 375,col 5)",
        "(line 376,col 5)-(line 376,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.statementMustExitParent(com.google.javascript.rhino.Node)",
      "begin_line": 379,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 380,col 5)-(line 394,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReplaceUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 400,
      "end_line": 411,
      "comment": "\n   * Use \"void 0\" in place of \"undefined\"\n   ",
      "child_ranges": [
        "(line 402,col 5)-(line 409,col 5)",
        "(line 410,col 5)-(line 410,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReduceReturn(com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 441,
      "comment": "\n   * Reduce \"return undefined\" or \"return void 0\" to simply \"return\".\n   *\n   * @return The original node, maybe simplified.\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 36)",
        "(line 421,col 5)-(line 438,col 5)",
        "(line 440,col 5)-(line 440,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryReplaceExitWithBreak(com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 505,
      "comment": "\n   * Replace duplicate exits in control structures.  If the node following\n   * the exit node expression has the same effect as exit node, the node can\n   * be replaced or removed.\n   * For example:\n   *   \"while (a) {return f()} return f();\" \u003d\u003d\u003e \"while (a) {break} return f();\"\n   *   \"while (a) {throw \u0027ow\u0027} throw \u0027ow\u0027;\" \u003d\u003d\u003e \"while (a) {break} throw \u0027ow\u0027;\"\n   *\n   * @param n An follow control exit expression (a THROW or RETURN node)\n   * @return The replacement for n, or the original if no change was made.\n   ",
      "child_ranges": [
        "(line 455,col 5)-(line 455,col 36)",
        "(line 459,col 5)-(line 459,col 25)",
        "(line 460,col 5)-(line 466,col 5)",
        "(line 468,col 5)-(line 468,col 69)",
        "(line 479,col 5)-(line 479,col 36)",
        "(line 480,col 5)-(line 480,col 38)",
        "(line 482,col 5)-(line 488,col 5)",
        "(line 490,col 5)-(line 493,col 5)",
        "(line 497,col 5)-(line 502,col 5)",
        "(line 504,col 5)-(line 504,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryRemoveRedundantExit(com.google.javascript.rhino.Node)",
      "begin_line": 517,
      "end_line": 548,
      "comment": "\n   * Remove duplicate exits.  If the node following the exit node expression\n   * has the same effect as exit node, the node can be removed.\n   * For example:\n   *   \"if (a) {return f()} return f();\" \u003d\u003d\u003e \"if (a) {} return f();\"\n   *   \"if (a) {throw \u0027ow\u0027} throw \u0027ow\u0027;\" \u003d\u003d\u003e \"if (a) {} throw \u0027ow\u0027;\"\n   *\n   * @param n An follow control exit expression (a THROW or RETURN node)\n   * @return The replacement for n, or the original if no change was made.\n   ",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 38)",
        "(line 520,col 5)-(line 520,col 59)",
        "(line 524,col 5)-(line 524,col 36)",
        "(line 525,col 5)-(line 525,col 38)",
        "(line 526,col 5)-(line 532,col 5)",
        "(line 534,col 5)-(line 537,col 5)",
        "(line 541,col 5)-(line 545,col 5)",
        "(line 547,col 5)-(line 547,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isPure(com.google.javascript.rhino.Node)",
      "begin_line": 554,
      "end_line": 558,
      "comment": "\n   * @return Whether the expression does not produces and can not be affected\n   * by side-effects.\n   ",
      "child_ranges": [
        "(line 555,col 5)-(line 557,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.skipFinallyNodes(com.google.javascript.rhino.Node)",
      "begin_line": 563,
      "end_line": 568,
      "comment": "\n   * @return n or the node following any following finally nodes.\n   ",
      "child_ranges": [
        "(line 564,col 5)-(line 566,col 5)",
        "(line 567,col 5)-(line 567,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areMatchingExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "\n   * Check whether one exit can be replaced with another. Verify:\n   * 1) They are identical expressions\n   * 2) If an exception is possible that the statements, the original\n   * and the potential replacement are in the same exception handler.\n   ",
      "child_ranges": [
        "(line 577,col 5)-(line 579,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isExceptionPossible(com.google.javascript.rhino.Node)",
      "begin_line": 582,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 584,col 5)-(line 585,col 24)",
        "(line 586,col 5)-(line 588,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.getExceptionHandler(com.google.javascript.rhino.Node)",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 5)-(line 592,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeNot(com.google.javascript.rhino.Node)",
      "begin_line": 600,
      "end_line": 628,
      "comment": "\n   * Try to minimize NOT nodes such as !(x\u003d\u003dy).\n   *\n   * Returns the replacement for n or the original if no change was made\n   ",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 32)",
        "(line 603,col 5)-(line 603,col 38)",
        "(line 605,col 5)-(line 605,col 27)",
        "(line 606,col 5)-(line 622,col 5)",
        "(line 623,col 5)-(line 623,col 44)",
        "(line 624,col 5)-(line 624,col 44)",
        "(line 625,col 5)-(line 625,col 40)",
        "(line 626,col 5)-(line 626,col 23)",
        "(line 627,col 5)-(line 627,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeIf(com.google.javascript.rhino.Node)",
      "begin_line": 636,
      "end_line": 868,
      "comment": "\n   * Try turning IF nodes into smaller HOOKs\n   *\n   * Returns the replacement for n or the original if no replacement was\n   * necessary.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 32)",
        "(line 640,col 5)-(line 640,col 34)",
        "(line 645,col 5)-(line 647,col 5)",
        "(line 649,col 5)-(line 649,col 37)",
        "(line 650,col 5)-(line 650,col 43)",
        "(line 652,col 5)-(line 731,col 5)",
        "(line 736,col 5)-(line 736,col 35)",
        "(line 740,col 5)-(line 746,col 5)",
        "(line 749,col 5)-(line 765,col 5)",
        "(line 767,col 5)-(line 767,col 77)",
        "(line 768,col 5)-(line 768,col 77)",
        "(line 770,col 5)-(line 810,col 5)",
        "(line 812,col 5)-(line 812,col 53)",
        "(line 813,col 5)-(line 813,col 53)",
        "(line 816,col 5)-(line 865,col 5)",
        "(line 867,col 5)-(line 867,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryRemoveRepeatedStatements(com.google.javascript.rhino.Node)",
      "begin_line": 892,
      "end_line": 920,
      "comment": "\n   * Try to remove duplicate statements from IF blocks. For example:\n   *\n   * if (a) {\n   *   x \u003d 1;\n   *   return true;\n   * } else {\n   *   x \u003d 2;\n   *   return true;\n   * }\n   *\n   * becomes:\n   *\n   * if (a) {\n   *   x \u003d 1;\n   * } else {\n   *   x \u003d 2;\n   * }\n   * return true;\n   *\n   * @param n The IF node to examine.\n   ",
      "child_ranges": [
        "(line 893,col 5)-(line 893,col 39)",
        "(line 895,col 5)-(line 895,col 32)",
        "(line 896,col 5)-(line 900,col 5)",
        "(line 902,col 5)-(line 902,col 34)",
        "(line 903,col 5)-(line 903,col 37)",
        "(line 904,col 5)-(line 904,col 44)",
        "(line 905,col 5)-(line 905,col 43)",
        "(line 906,col 5)-(line 906,col 44)",
        "(line 908,col 5)-(line 919,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isFoldableExpressBlock(com.google.javascript.rhino.Node)",
      "begin_line": 926,
      "end_line": 957,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an expression.\n   ",
      "child_ranges": [
        "(line 927,col 5)-(line 954,col 5)",
        "(line 956,col 5)-(line 956,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.getBlockExpression(com.google.javascript.rhino.Node)",
      "begin_line": 962,
      "end_line": 965,
      "comment": "\n   * @return The expression node.\n   ",
      "child_ranges": [
        "(line 963,col 5)-(line 963,col 56)",
        "(line 964,col 5)-(line 964,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isReturnBlock(com.google.javascript.rhino.Node)",
      "begin_line": 971,
      "end_line": 980,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an return with or without an expression.\n   ",
      "child_ranges": [
        "(line 972,col 5)-(line 977,col 5)",
        "(line 979,col 5)-(line 979,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isReturnExpressBlock(com.google.javascript.rhino.Node)",
      "begin_line": 986,
      "end_line": 997,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     an return.\n   ",
      "child_ranges": [
        "(line 987,col 5)-(line 994,col 5)",
        "(line 996,col 5)-(line 996,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isReturnExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1002,
      "end_line": 1007,
      "comment": "\n   * @return Whether the node is a single return statement.\n   ",
      "child_ranges": [
        "(line 1003,col 5)-(line 1005,col 5)",
        "(line 1006,col 5)-(line 1006,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.getBlockReturnExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1012,
      "end_line": 1015,
      "comment": "\n   * @return The expression that is part of the return.\n   ",
      "child_ranges": [
        "(line 1013,col 5)-(line 1013,col 54)",
        "(line 1014,col 5)-(line 1014,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isVarBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1021,
      "end_line": 1032,
      "comment": "\n   * @return Whether the node is a block with a single statement that is\n   *     a VAR declaration of a single variable.\n   ",
      "child_ranges": [
        "(line 1022,col 5)-(line 1029,col 5)",
        "(line 1031,col 5)-(line 1031,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.getBlockVar(com.google.javascript.rhino.Node)",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "\n   * @return The var node.\n   ",
      "child_ranges": [
        "(line 1038,col 5)-(line 1038,col 44)",
        "(line 1039,col 5)-(line 1039,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.consumesDanglingElse(com.google.javascript.rhino.Node)",
      "begin_line": 1047,
      "end_line": 1066,
      "comment": "\n   * Does a statement consume a \u0027dangling else\u0027? A statement consumes\n   * a \u0027dangling else\u0027 if an \u0027else\u0027 token following the statement\n   * would be considered by the parser to be part of the statement.\n   ",
      "child_ranges": [
        "(line 1048,col 5)-(line 1065,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isLowerPrecedenceInExpression(com.google.javascript.rhino.Node, int)",
      "begin_line": 1072,
      "end_line": 1083,
      "comment": "\n   * Does the expression contain an operator with lower precedence than\n   * the argument?\n   ",
      "child_ranges": [
        "(line 1074,col 5)-(line 1079,col 6)",
        "(line 1081,col 5)-(line 1082,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.Anonymous-3869068d-cb69-458f-a232-63461582ea62.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isLowerPrecedence(com.google.javascript.rhino.Node, int)",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "\n   * Whether the node type has lower precedence than \"precedence\"\n   ",
      "child_ranges": [
        "(line 1089,col 5)-(line 1089,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isHigherPrecedence(com.google.javascript.rhino.Node, int)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n   * Whether the node type has higher precedence than \"precedence\"\n   ",
      "child_ranges": [
        "(line 1096,col 5)-(line 1096,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isPropertyAssignmentInExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1101,
      "end_line": 1113,
      "comment": "\n   * Does the expression contain a property assignment?\n   ",
      "child_ranges": [
        "(line 1102,col 5)-(line 1109,col 6)",
        "(line 1111,col 5)-(line 1112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.Anonymous-5c940133-7b3b-4283-b42d-c589e623a553.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1104,
      "end_line": 1108,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 9)-(line 1107,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeCondition(com.google.javascript.rhino.Node)",
      "begin_line": 1129,
      "end_line": 1309,
      "comment": "\n   * Try to minimize conditions expressions, as there are additional\n   * assumptions that can be made when it is known that the final result\n   * is a boolean.\n   *\n   * The following transformations are done recursively:\n   *   !(x||y) --\u003e !x\u0026\u0026!y\n   *   !(x\u0026\u0026y) --\u003e !x||!y\n   *   !!x     --\u003e x\n   * Thus:\n   *   !(x\u0026\u0026!y) --\u003e !x||!!y --\u003e !x||y\n   *\n   *   Returns the replacement for n, or the original if no change was made\n   ",
      "child_ranges": [
        "(line 1130,col 5)-(line 1130,col 32)",
        "(line 1132,col 5)-(line 1308,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.maybeReplaceChildWithNumber(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)",
      "begin_line": 1317,
      "end_line": 1327,
      "comment": "\n   * Replaces a node with a number node if the new number node is not equivalent\n   * to the current node.\n   *\n   * Returns the replacement for n if it was replaced, otherwise returns n.\n   ",
      "child_ranges": [
        "(line 1318,col 5)-(line 1318,col 34)",
        "(line 1319,col 5)-(line 1324,col 5)",
        "(line 1326,col 5)-(line 1326,col 13)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "STANDARD_OBJECT_CONSTRUCTORS"
      ],
      "begin_line": 1329,
      "end_line": 1338,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldStandardConstructors(com.google.javascript.rhino.Node)",
      "begin_line": 1343,
      "end_line": 1361,
      "comment": "\n   * Fold \"new Object()\" to \"Object()\".\n   ",
      "child_ranges": [
        "(line 1344,col 5)-(line 1344,col 40)",
        "(line 1349,col 5)-(line 1358,col 5)",
        "(line 1360,col 5)-(line 1360,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldLiteralConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 1367,
      "end_line": 1415,
      "comment": "\n   * Replaces a new Array or Object node with an object literal, unless the\n   * call to Array or Object is to a local function with the same name.\n   ",
      "child_ranges": [
        "(line 1368,col 5)-(line 1369,col 22)",
        "(line 1371,col 5)-(line 1371,col 49)",
        "(line 1373,col 5)-(line 1373,col 31)",
        "(line 1379,col 5)-(line 1413,col 5)",
        "(line 1414,col 5)-(line 1414,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.isSafeToFoldArrayConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 1426,
      "end_line": 1453,
      "comment": "\n   * Checks if it is safe to fold Array() constructor into []. It can be\n   * obviously done, if the initial constructor has either no arguments or\n   * at least two. The remaining case may be unsafe since Array(number)\n   * actually reserves memory for an empty array which contains number elements.\n   ",
      "child_ranges": [
        "(line 1427,col 5)-(line 1427,col 62)",
        "(line 1429,col 5)-(line 1451,col 5)",
        "(line 1452,col 5)-(line 1452,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryFoldRegularExpressionConstructor(com.google.javascript.rhino.Node)",
      "begin_line": 1455,
      "end_line": 1510,
      "comment": "",
      "child_ranges": [
        "(line 1456,col 5)-(line 1456,col 32)",
        "(line 1457,col 5)-(line 1457,col 41)",
        "(line 1458,col 5)-(line 1458,col 41)",
        "(line 1459,col 5)-(line 1459,col 60)",
        "(line 1461,col 5)-(line 1464,col 5)",
        "(line 1466,col 5)-(line 1507,col 5)",
        "(line 1509,col 5)-(line 1509,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.reduceTrueFalse(com.google.javascript.rhino.Node)",
      "begin_line": 1512,
      "end_line": 1521,
      "comment": "",
      "child_ranges": [
        "(line 1513,col 5)-(line 1519,col 5)",
        "(line 1520,col 5)-(line 1520,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeArrayLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 1523,
      "end_line": 1536,
      "comment": "",
      "child_ranges": [
        "(line 1524,col 5)-(line 1524,col 30)",
        "(line 1525,col 5)-(line 1529,col 5)",
        "(line 1531,col 5)-(line 1535,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.tryMinimizeStringArrayLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 1538,
      "end_line": 1572,
      "comment": "",
      "child_ranges": [
        "(line 1539,col 5)-(line 1541,col 5)",
        "(line 1543,col 5)-(line 1543,col 40)",
        "(line 1545,col 5)-(line 1545,col 57)",
        "(line 1546,col 5)-(line 1548,col 5)",
        "(line 1550,col 5)-(line 1550,col 53)",
        "(line 1551,col 5)-(line 1551,col 16)",
        "(line 1552,col 5)-(line 1554,col 5)",
        "(line 1558,col 5)-(line 1558,col 46)",
        "(line 1559,col 5)-(line 1570,col 5)",
        "(line 1571,col 5)-(line 1571,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.pickDelimiter(java.lang.String[])",
      "begin_line": 1579,
      "end_line": 1603,
      "comment": "\n   * Find a delimiter that does not occur in the given strings\n   * @param strings The strings that must be separated.\n   * @return a delimiter string or null\n   ",
      "child_ranges": [
        "(line 1580,col 5)-(line 1580,col 30)",
        "(line 1581,col 5)-(line 1586,col 5)",
        "(line 1588,col 5)-(line 1590,col 5)",
        "(line 1592,col 5)-(line 1592,col 70)",
        "(line 1593,col 5)-(line 1593,col 14)",
        "(line 1594,col 5)-(line 1601,col 5)",
        "(line 1602,col 5)-(line 1602,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_FLAGS_RE"
      ],
      "begin_line": 1605,
      "end_line": 1605,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areValidRegexpFlags(java.lang.String)",
      "begin_line": 1614,
      "end_line": 1616,
      "comment": "\n   * are the given flags valid regular expression flags?\n   * JavaScript recognizes several suffix flags for regular expressions,\n   * \u0027g\u0027 - global replace, \u0027i\u0027 - case insensitive, \u0027m\u0027 - multi-line.\n   * They are case insensitive, and JavaScript does not recognize the extended\n   * syntax mode, single-line mode, or expression replacement mode from Perl 5.\n   ",
      "child_ranges": [
        "(line 1615,col 5)-(line 1615,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.areSafeFlagsToFold(java.lang.String)",
      "begin_line": 1634,
      "end_line": 1636,
      "comment": "\n   * are the given flags safe to fold?\n   * We don\u0027t fold the regular expression if global (\u0027g\u0027) flag is on,\n   * because in this case it isn\u0027t really a constant: its \u0027lastIndex\u0027\n   * property contains the state of last execution, so replacing\n   * \u0027new RegExp(\u0027foobar\u0027,\u0027g\u0027)\u0027 with \u0027/foobar/g\u0027 may change the behavior of\n   * the program if the RegExp is used inside a loop, for example.\n   * \u003cp\u003e\n   * ECMAScript 5 explicitly disallows pooling of regular expression literals so\n   * in ECMAScript 5, {@code /foo/g} and {@code new RegExp(\u0027foo\u0027, \u0027g\u0027)} are\n   * equivalent.\n   * From section 7.8.5:\n   * \"Then each time the literal is evaluated, a new object is created as if by\n   * the expression new RegExp(Pattern, Flags) where RegExp is the standard\n   * built-in constructor with that name.\"\n   ",
      "child_ranges": [
        "(line 1635,col 5)-(line 1635,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)",
      "begin_line": 1641,
      "end_line": 1706,
      "comment": "\n   * returns a string node that can safely be rendered inside /brackets/.\n   ",
      "child_ranges": [
        "(line 1642,col 5)-(line 1642,col 29)",
        "(line 1644,col 5)-(line 1644,col 28)",
        "(line 1645,col 5)-(line 1645,col 16)",
        "(line 1646,col 5)-(line 1646,col 49)",
        "(line 1647,col 5)-(line 1700,col 5)",
        "(line 1702,col 5)-(line 1702,col 45)",
        "(line 1704,col 5)-(line 1704,col 34)",
        "(line 1705,col 5)-(line 1705,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(java.lang.String)",
      "begin_line": 1712,
      "end_line": 1724,
      "comment": "\n   * true if the JavaScript string would contain a Unicode escape when written\n   * out as the body of a regular expression literal.\n   ",
      "child_ranges": [
        "(line 1713,col 5)-(line 1713,col 48)",
        "(line 1714,col 5)-(line 1722,col 5)",
        "(line 1723,col 5)-(line 1723,col 17)"
      ]
    }
  ]
}