{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CoalesceVariableNames.java",
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
      "begin_line": 59,
      "end_line": 444,
      "comment": "\n * Reuse variable names if possible.\n *\n * \u003cp\u003eFor example, from \u003ccode\u003evar x \u003d 1; print(x); var y \u003d 2; print(y); \u003c/code\u003e\n * to \u003ccode\u003evar x \u003d 1; print(x); x \u003d 2; print(x)\u003c/code\u003e. The benefits are\n * slightly shorter code because of the removed \u003ccode\u003evar\u003ccode\u003e declaration,\n * less unique variables in hope for better renaming, and finally better gzip\n * compression.\n *\n * \u003cp\u003eThe pass operates similar to a typical register allocator found in an\n * optimizing compiler by first computing live ranges with\n * {@link LiveVariablesAnalysis} and a variable interference graph. Then it uses\n * graph coloring in {@link GraphColoring} to determine which two variables can\n * be merge together safely.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colorings"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "usePseudoNames"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coloringTieBreaker"
      ],
      "begin_line": 66,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.Anonymous-fce0923b-f989-4e28-878e-1b271675445f.compare(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 7)-(line 70,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CoalesceVariableNames(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n   * @param usePseudoNames For debug purposes, when merging variable foo and bar\n   * to foo, rename both variable to foo_bar.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 75)",
        "(line 81,col 5)-(line 81,col 29)",
        "(line 82,col 5)-(line 82,col 38)",
        "(line 83,col 5)-(line 83,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.shouldOptimizeScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 91,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 98,col 5)",
        "(line 100,col 5)-(line 103,col 5)",
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 108,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 31)",
        "(line 111,col 5)-(line 113,col 5)",
        "(line 115,col 5)-(line 115,col 57)",
        "(line 116,col 5)-(line 117,col 56)",
        "(line 122,col 5)-(line 124,col 5)",
        "(line 125,col 5)-(line 125,col 23)",
        "(line 127,col 5)-(line 129,col 49)",
        "(line 131,col 5)-(line 133,col 32)",
        "(line 135,col 5)-(line 135,col 21)",
        "(line 136,col 5)-(line 136,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 143,col 5)",
        "(line 144,col 5)-(line 144,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 147,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 153,col 5)",
        "(line 154,col 5)-(line 154,col 49)",
        "(line 155,col 5)-(line 155,col 71)",
        "(line 156,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 67)",
        "(line 162,col 5)-(line 209,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.computeVariableNamesInterferenceGraph(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, java.util.Set\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 212,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 215,col 39)",
        "(line 216,col 5)-(line 216,col 31)",
        "(line 219,col 5)-(line 233,col 5)",
        "(line 236,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 304,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CombinedLiveRangeChecker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback"
      ],
      "begin_line": 312,
      "end_line": 342,
      "comment": "\n   * A simple wrapper calls to call two AbstractCfgNodeTraversalCallback\n   * callback during the same traversal.  Both traversals must have the same\n   * \"shouldTraverse\" conditions.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callback1"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback2"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.CombinedLiveRangeChecker(com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker, com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker)",
      "begin_line": 318,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 7)-(line 321,col 33)",
        "(line 322,col 7)-(line 322,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 325,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 330,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.CombinedLiveRangeChecker.connectIfCrossed(com.google.javascript.jscomp.graph.UndiGraph\u003ccom.google.javascript.jscomp.Scope.Var, java.lang.Void\u003e)",
      "begin_line": 333,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 334,col 7)-(line 339,col 7)",
        "(line 340,col 7)-(line 340,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.removeVarDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 348,
      "end_line": 380,
      "comment": "\n   * Tries to remove variable declaration if the variable has been coalesced\n   * with another variable that has already been declared.\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 32)",
        "(line 350,col 5)-(line 350,col 34)",
        "(line 353,col 5)-(line 379,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LiveRangeChecker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ControlFlowGraph.AbstractCfgNodeTraversalCallback"
      ],
      "begin_line": 382,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defFound"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crossed"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.LiveRangeChecker(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 7)-(line 390,col 21)",
        "(line 391,col 7)-(line 391,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.getDef()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.shouldVisit(com.google.javascript.rhino.Node)",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n     * @return Whether any LiveRangeChecker would be interested in the node.\n     ",
      "child_ranges": [
        "(line 402,col 7)-(line 403,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 406,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 408,col 7)-(line 410,col 7)",
        "(line 412,col 7)-(line 414,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isAssignTo(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 417,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 418,col 7)-(line 435,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CoalesceVariableNames.LiveRangeChecker.isReadFrom(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node)",
      "begin_line": 438,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 439,col 7)-(line 441,col 67)"
      ]
    }
  ]
}