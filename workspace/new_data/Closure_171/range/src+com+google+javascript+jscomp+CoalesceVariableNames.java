{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CoalesceVariableNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoalesceVariableNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 60,
      "end_line": 445,
      "comment": "\n * Reuse variable names if possible.\n *\n * \u003cp\u003eFor example, from \u003ccode\u003evar x \u003d 1; print(x); var y \u003d 2; print(y); \u003c/code\u003e\n * to \u003ccode\u003evar x \u003d 1; print(x); x \u003d 2; print(x)\u003c/code\u003e. The benefits are\n * slightly shorter code because of the removed \u003ccode\u003evar\u003ccode\u003e declaration,\n * less unique variables in hope for better renaming, and finally better gzip\n * compression.\n *\n * \u003cp\u003eThe pass operates similar to a typical register allocator found in an\n * optimizing compiler by first computing live ranges with\n * {@link LiveVariablesAnalysis} and a variable interference graph. Then it uses\n * graph coloring in {@link GraphColoring} to determine which two variables can\n * be merge together safely.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colorings"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "usePseudoNames"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coloringTieBreaker"
      ],
      "begin_line": 67,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.Anonymous-cc279e8b-fabf-4876-9a98-aa2978b38447.compare(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CoalesceVariableNames(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "\n   * @param usePseudoNames For debug purposes, when merging variable foo and bar\n   * to foo, rename both variable to foo_bar.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 75)",
        "(line 82,col 5)-(line 82,col 29)",
        "(line 83,col 5)-(line 83,col 38)",
        "(line 84,col 5)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.shouldOptimizeScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 92,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 99,col 5)",
        "(line 101,col 5)-(line 104,col 5)",
        "(line 106,col 5)-(line 106,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 109,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 31)",
        "(line 112,col 5)-(line 114,col 5)",
        "(line 116,col 5)-(line 116,col 57)",
        "(line 117,col 5)-(line 118,col 56)",
        "(line 123,col 5)-(line 125,col 5)",
        "(line 126,col 5)-(line 126,col 23)",
        "(line 128,col 5)-(line 130,col 49)",
        "(line 132,col 5)-(line 134,col 32)",
        "(line 136,col 5)-(line 136,col 21)",
        "(line 137,col 5)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 140,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 148,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 154,col 5)",
        "(line 155,col 5)-(line 155,col 49)",
        "(line 156,col 5)-(line 156,col 71)",
        "(line 157,col 5)-(line 160,col 5)",
        "(line 161,col 5)-(line 161,col 67)",
        "(line 163,col 5)-(line 210,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, java.util.Set\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 213,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 216,col 39)",
        "(line 217,col 5)-(line 217,col 31)",
        "(line 220,col 5)-(line 234,col 5)",
        "(line 237,col 5)-(line 304,col 5)",
        "(line 305,col 5)-(line 305,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CombinedLiveRangeChecker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback"
      ],
      "begin_line": 313,
      "end_line": 343,
      "comment": "\n   * A simple wrapper calls to call two AbstractCfgNodeTraversalCallback\n   * callback during the same traversal.  Both traversals must have the same\n   * \"shouldTraverse\" conditions.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callback1"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback2"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.CombinedLiveRangeChecker(com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker, com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker)",
      "begin_line": 319,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 7)-(line 322,col 33)",
        "(line 323,col 7)-(line 323,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 328,col 7)-(line 331,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.connectIfCrossed(com.google.javascript.jscomp.graph.UndiGraph\u003ccom.google.javascript.jscomp.Scope.Var, java.lang.Void\u003e)",
      "begin_line": 334,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 340,col 7)",
        "(line 341,col 7)-(line 341,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 349,
      "end_line": 381,
      "comment": "\n   * Tries to remove variable declaration if the variable has been coalesced\n   * with another variable that has already been declared.\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 32)",
        "(line 351,col 5)-(line 351,col 34)",
        "(line 354,col 5)-(line 380,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LiveRangeChecker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback"
      ],
      "begin_line": 383,
      "end_line": 444,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defFound"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crossed"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.LiveRangeChecker(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 21)",
        "(line 392,col 7)-(line 392,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.getDef()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.shouldVisit(com.google.javascript.rhino.Node)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\n     * @return Whether any LiveRangeChecker would be interested in the node.\n     ",
      "child_ranges": [
        "(line 403,col 7)-(line 404,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 407,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 409,col 7)-(line 411,col 7)",
        "(line 413,col 7)-(line 415,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isAssignTo(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 419,col 7)-(line 436,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isReadFrom(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node)",
      "begin_line": 439,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 440,col 7)-(line 442,col 67)"
      ]
    }
  ]
}