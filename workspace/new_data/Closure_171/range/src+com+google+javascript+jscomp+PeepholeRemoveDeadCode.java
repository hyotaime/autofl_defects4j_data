{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeRemoveDeadCode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeRemoveDeadCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 33,
      "end_line": 928,
      "comment": "\n * Peephole optimization to remove useless code such as IF\u0027s with false\n * guard conditions, comma operator left hand sides with no side effects, etc.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 40,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 74,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldTry(com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 112,
      "comment": "\n   * Remove try blocks without catch blocks and with empty or not\n   * existent finally blocks.\n   * Or, only leave the finally blocks if try body blocks are empty\n   * @return the replacement node, if changed, or the original if not\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 40)",
        "(line 85,col 5)-(line 85,col 34)",
        "(line 86,col 5)-(line 86,col 37)",
        "(line 87,col 5)-(line 87,col 45)",
        "(line 90,col 5)-(line 96,col 5)",
        "(line 99,col 5)-(line 109,col 5)",
        "(line 111,col 5)-(line 111,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldAssignment(com.google.javascript.rhino.Node)",
      "begin_line": 118,
      "end_line": 131,
      "comment": "\n   * Try removing identity assignments\n   * @return the replacement node, if changed, or the original if not\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 49)",
        "(line 120,col 5)-(line 120,col 40)",
        "(line 121,col 5)-(line 121,col 40)",
        "(line 123,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldExpr(com.google.javascript.rhino.Node)",
      "begin_line": 137,
      "end_line": 152,
      "comment": "\n   * Try folding EXPR_RESULT nodes by removing useless Ops and expressions.\n   * @return the replacement node, if changed, or the original if not\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 67)",
        "(line 139,col 5)-(line 150,col 5)",
        "(line 151,col 5)-(line 151,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.trySimplifyUnusedResult(com.google.javascript.rhino.Node)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n   * General cascading unused operation node removal.\n   * @param n The root of the expression to simplify.\n   * @return The replacement node, or null if the node was is not useful.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.trySimplifyUnusedResult(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 170,
      "end_line": 279,
      "comment": "\n   * General cascading unused operation node removal.\n   * @param n The root of the expression to simplify.\n   * @param removeUnused If true, the node is removed from the AST if\n   *     it is not useful, otherwise it replaced with an EMPTY node.\n   * @return The replacement node, or null if the node was is not useful.\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 20)",
        "(line 174,col 5)-(line 256,col 5)",
        "(line 259,col 5)-(line 276,col 5)",
        "(line 278,col 5)-(line 278,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryOptimizeSwitch(com.google.javascript.rhino.Node)",
      "begin_line": 284,
      "end_line": 365,
      "comment": "\n   * Remove useless switches and cases.\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 43)",
        "(line 287,col 5)-(line 287,col 49)",
        "(line 290,col 5)-(line 353,col 5)",
        "(line 356,col 5)-(line 362,col 5)",
        "(line 364,col 5)-(line 364,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryOptimizeDefaultCase(com.google.javascript.rhino.Node)",
      "begin_line": 371,
      "end_line": 405,
      "comment": "\n   * @return the default case node or null if there is no default case or\n   *     if the default case is removed.\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 43)",
        "(line 374,col 5)-(line 374,col 46)",
        "(line 377,col 5)-(line 403,col 5)",
        "(line 404,col 5)-(line 404,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.removeCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 411,
      "end_line": 415,
      "comment": "\n   * Remove the case from the switch redeclaring any variables declared in it.\n   * @param caseNode The case to remove.\n   ",
      "child_ranges": [
        "(line 412,col 5)-(line 412,col 49)",
        "(line 413,col 5)-(line 413,col 37)",
        "(line 414,col 5)-(line 414,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isUselessCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 422,
      "end_line": 472,
      "comment": "\n   * The function assumes that when checking a CASE node there is no\n   * DEFAULT node in the SWITCH.\n   * @return Whether the CASE or DEFAULT block does anything useful.\n   ",
      "child_ranges": [
        "(line 423,col 5)-(line 424,col 68)",
        "(line 427,col 5)-(line 427,col 43)",
        "(line 428,col 5)-(line 435,col 5)",
        "(line 437,col 5)-(line 437,col 34)",
        "(line 438,col 5)-(line 470,col 5)",
        "(line 471,col 5)-(line 471,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isExit(com.google.javascript.rhino.Node)",
      "begin_line": 477,
      "end_line": 487,
      "comment": "\n   * @return Whether the node is an obvious control flow exit.\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 486,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldComma(com.google.javascript.rhino.Node)",
      "begin_line": 489,
      "end_line": 504,
      "comment": "",
      "child_ranges": [
        "(line 491,col 5)-(line 491,col 32)",
        "(line 492,col 5)-(line 492,col 34)",
        "(line 493,col 5)-(line 493,col 32)",
        "(line 495,col 5)-(line 495,col 41)",
        "(line 496,col 5)-(line 502,col 5)",
        "(line 503,col 5)-(line 503,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryOptimizeBlock(com.google.javascript.rhino.Node)",
      "begin_line": 509,
      "end_line": 536,
      "comment": "\n   * Try removing unneeded block nodes and their useless children\n   ",
      "child_ranges": [
        "(line 511,col 5)-(line 523,col 5)",
        "(line 525,col 5)-(line 527,col 5)",
        "(line 530,col 5)-(line 533,col 5)",
        "(line 535,col 5)-(line 535,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isUnremovableNode(com.google.javascript.rhino.Node)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n   * Some nodes unremovable node don\u0027t have side-effects.\n   ",
      "child_ranges": [
        "(line 542,col 5)-(line 542,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryOptimizeConditionalAfterAssign(com.google.javascript.rhino.Node)",
      "begin_line": 550,
      "end_line": 591,
      "comment": "\n   * Attempt to replace the condition of if or hook immediately that is a\n   * reference to a name that is assigned immediately before.\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 28)",
        "(line 574,col 5)-(line 590,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isSimpleAssignment(com.google.javascript.rhino.Node)",
      "begin_line": 597,
      "end_line": 609,
      "comment": "\n   * @return whether the node is a assignment to a simple name, or simple var\n   * declaration with initialization.\n   ",
      "child_ranges": [
        "(line 600,col 5)-(line 606,col 5)",
        "(line 608,col 5)-(line 608,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.getSimpleAssignmentName(com.google.javascript.rhino.Node)",
      "begin_line": 614,
      "end_line": 622,
      "comment": "\n   * @return The name being assigned to.\n   ",
      "child_ranges": [
        "(line 615,col 5)-(line 615,col 52)",
        "(line 616,col 5)-(line 621,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.getSimpleAssignmentValue(com.google.javascript.rhino.Node)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "\n   * @return The value assigned in the simple assignment\n   ",
      "child_ranges": [
        "(line 628,col 5)-(line 628,col 52)",
        "(line 629,col 5)-(line 629,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isConditionalStatement(com.google.javascript.rhino.Node)",
      "begin_line": 635,
      "end_line": 639,
      "comment": "\n   * @return Whether the node is a conditional statement.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.isExprConditional(com.google.javascript.rhino.Node)",
      "begin_line": 644,
      "end_line": 654,
      "comment": "\n   * @return Whether the node is a rooted with a HOOK, AND, or OR node.\n   ",
      "child_ranges": [
        "(line 645,col 5)-(line 652,col 5)",
        "(line 653,col 5)-(line 653,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.getConditionalStatementCondition(com.google.javascript.rhino.Node)",
      "begin_line": 659,
      "end_line": 666,
      "comment": "\n   * @return The condition of a conditional statement.\n   ",
      "child_ranges": [
        "(line 660,col 5)-(line 665,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldIf(com.google.javascript.rhino.Node)",
      "begin_line": 672,
      "end_line": 771,
      "comment": "\n   * Try folding IF nodes by removing dead branches.\n   * @return the replacement node, if changed, or the original if not\n   ",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 39)",
        "(line 674,col 5)-(line 674,col 32)",
        "(line 675,col 5)-(line 675,col 39)",
        "(line 676,col 5)-(line 676,col 27)",
        "(line 677,col 5)-(line 677,col 34)",
        "(line 678,col 5)-(line 678,col 35)",
        "(line 679,col 5)-(line 679,col 39)",
        "(line 682,col 5)-(line 686,col 5)",
        "(line 689,col 5)-(line 699,col 5)",
        "(line 702,col 5)-(line 716,col 5)",
        "(line 719,col 5)-(line 719,col 66)",
        "(line 720,col 5)-(line 722,col 5)",
        "(line 724,col 5)-(line 738,col 5)",
        "(line 740,col 5)-(line 740,col 49)",
        "(line 741,col 5)-(line 770,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldHook(com.google.javascript.rhino.Node)",
      "begin_line": 777,
      "end_line": 807,
      "comment": "\n   * Try folding HOOK (?:) if the condition results of the condition is known.\n   * @return the replacement node, if changed, or the original if not\n   ",
      "child_ranges": [
        "(line 778,col 5)-(line 778,col 41)",
        "(line 779,col 5)-(line 779,col 32)",
        "(line 780,col 5)-(line 780,col 39)",
        "(line 781,col 5)-(line 781,col 34)",
        "(line 782,col 5)-(line 782,col 35)",
        "(line 783,col 5)-(line 783,col 39)",
        "(line 785,col 5)-(line 785,col 66)",
        "(line 786,col 5)-(line 792,col 5)",
        "(line 795,col 5)-(line 795,col 23)",
        "(line 796,col 5)-(line 796,col 72)",
        "(line 797,col 5)-(line 797,col 21)",
        "(line 798,col 5)-(line 802,col 5)",
        "(line 804,col 5)-(line 804,col 40)",
        "(line 805,col 5)-(line 805,col 23)",
        "(line 806,col 5)-(line 806,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldWhile(com.google.javascript.rhino.Node)",
      "begin_line": 812,
      "end_line": 823,
      "comment": "\n   * Removes WHILEs that always evaluate to false.\n   ",
      "child_ranges": [
        "(line 813,col 5)-(line 813,col 45)",
        "(line 814,col 5)-(line 814,col 51)",
        "(line 815,col 5)-(line 817,col 5)",
        "(line 818,col 5)-(line 818,col 42)",
        "(line 819,col 5)-(line 819,col 43)",
        "(line 820,col 5)-(line 820,col 23)",
        "(line 822,col 5)-(line 822,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldFor(com.google.javascript.rhino.Node)",
      "begin_line": 828,
      "end_line": 866,
      "comment": "\n   * Removes FORs that always evaluate to false.\n   ",
      "child_ranges": [
        "(line 829,col 5)-(line 829,col 43)",
        "(line 831,col 5)-(line 833,col 5)",
        "(line 835,col 5)-(line 835,col 34)",
        "(line 836,col 5)-(line 836,col 31)",
        "(line 837,col 5)-(line 837,col 36)",
        "(line 839,col 5)-(line 841,col 5)",
        "(line 843,col 5)-(line 845,col 5)",
        "(line 848,col 5)-(line 850,col 5)",
        "(line 852,col 5)-(line 854,col 5)",
        "(line 856,col 5)-(line 856,col 42)",
        "(line 857,col 5)-(line 863,col 5)",
        "(line 864,col 5)-(line 864,col 23)",
        "(line 865,col 5)-(line 865,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldDo(com.google.javascript.rhino.Node)",
      "begin_line": 873,
      "end_line": 901,
      "comment": "\n   * Removes DOs that always evaluate to false. This leaves the\n   * statements that were in the loop in a BLOCK node.\n   * The block will be removed in a later pass, if possible.\n   ",
      "child_ranges": [
        "(line 874,col 5)-(line 874,col 42)",
        "(line 876,col 5)-(line 876,col 51)",
        "(line 877,col 5)-(line 879,col 5)",
        "(line 883,col 5)-(line 885,col 5)",
        "(line 887,col 5)-(line 888,col 68)",
        "(line 889,col 5)-(line 889,col 38)",
        "(line 891,col 5)-(line 891,col 33)",
        "(line 892,col 5)-(line 892,col 34)",
        "(line 893,col 5)-(line 897,col 5)",
        "(line 898,col 5)-(line 898,col 23)",
        "(line 900,col 5)-(line 900,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.hasBreakOrContinue(com.google.javascript.rhino.Node)",
      "begin_line": 906,
      "end_line": 916,
      "comment": "\n   *\n   ",
      "child_ranges": [
        "(line 910,col 5)-(line 915,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeRemoveDeadCode.tryFoldForCondition(com.google.javascript.rhino.Node)",
      "begin_line": 921,
      "end_line": 927,
      "comment": "\n   * Remove always true loop conditions.\n   ",
      "child_ranges": [
        "(line 922,col 5)-(line 926,col 5)"
      ]
    }
  ]
}