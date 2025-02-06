{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RemoveUnusedVars.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass"
      ],
      "begin_line": 69,
      "end_line": 995,
      "comment": "\n * Garbage collection for variable and function definitions. Basically performs\n * a mark-and-sweep type algorithm over the JavaScript parse tree.\n *\n * For each scope:\n * (1) Scan the variable/function declarations at that scope.\n * (2) Traverse the scope for references, marking all referenced variables.\n *     Unlike other compiler passes, this is a pre-order traversal, not a\n *     post-order traversal.\n * (3) If the traversal encounters an assign without other side-effects,\n *     create a continuation. Continue the continuation iff the assigned\n *     variable is referenced.\n * (4) When the traversal completes, remove all unreferenced variables.\n *\n * If it makes it easier, you can think of the continuations of the traversal\n * as a reference graph. Each continuation represents a set of edges, where the\n * source node is a known variable, and the destination nodes are lazily\n * evaluated when the continuation is executed.\n *\n * This algorithm is similar to the algorithm used by {@code SmartNameRemoval}.\n * {@code SmartNameRemoval} maintains an explicit graph of dependencies\n * between global symbols. However, {@code SmartNameRemoval} cannot handle\n * non-trivial edges in the reference graph (\"A is referenced iff both B and C\n * are referenced\"), or local variables. {@code SmartNameRemoval} is also\n * substantially more complicated because it tries to handle namespaces\n * (which is largely unnecessary in the presence of {@code CollapseProperties}.\n *\n * This pass also uses a more complex analysis of assignments, where\n * an assignment to a variable or a property of that variable does not\n * necessarily count as a reference to that variable, unless we can prove\n * that it modifies external state. This is similar to\n * {@code FlowSensitiveInlineVariables}, except that it works for variables\n * used across scopes.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeGlobals"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referenced"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n   * Keep track of variables that we\u0027ve referenced.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "maybeUnreferenced"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * Keep track of variables that might be unreferenced.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "allFunctionScopes"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n   * Keep track of scopes that we\u0027ve traversed.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assignsByVar"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": "\n   * Keep track of assigns to variables that we haven\u0027t referenced.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "assignsByNode"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n   * The assigns, indexed by the NAME node that they assign to.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "classDefiningCalls"
      ],
      "begin_line": 109,
      "end_line": 110,
      "comment": "\n   * Subclass name -\u003e class-defining call EXPR node. (like inherits)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "continuations"
      ],
      "begin_line": 116,
      "end_line": 117,
      "comment": "\n   * Keep track of continuations that are finished iff the variable they\u0027re\n   * indexed by is referenced.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "modifyCallSites"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callSiteOptimizer"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.RemoveUnusedVars(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean, boolean)",
      "begin_line": 123,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 29)",
        "(line 129,col 5)-(line 129,col 59)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 75)",
        "(line 132,col 5)-(line 132,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 139,
      "end_line": 150,
      "comment": "\n   * Traverses the root, removing all unused variables. Multiple traversals\n   * may occur to ensure all unused variables are removed.\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 74)",
        "(line 142,col 5)-(line 142,col 44)",
        "(line 144,col 5)-(line 148,col 5)",
        "(line 149,col 5)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 152,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 158,col 5)",
        "(line 159,col 5)-(line 159,col 44)",
        "(line 160,col 5)-(line 162,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.traverseAndRemoveUnusedReferences(com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "\n   * Traverses a node recursively. Call this once per pass.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 78)",
        "(line 170,col 5)-(line 170,col 36)",
        "(line 172,col 5)-(line 174,col 5)",
        "(line 176,col 5)-(line 176,col 23)",
        "(line 177,col 5)-(line 177,col 29)",
        "(line 178,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.traverseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 192,
      "end_line": 305,
      "comment": "\n   * Traverses everything in the current scope and marks variables that\n   * are referenced.\n   *\n   * During traversal, we identify subtrees that will only be\n   * referenced if their enclosing variables are referenced. Instead of\n   * traversing those subtrees, we create a continuation for them,\n   * and traverse them lazily.\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 27)",
        "(line 194,col 5)-(line 194,col 19)",
        "(line 195,col 5)-(line 300,col 5)",
        "(line 302,col 5)-(line 304,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.isRemovableVar(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 307,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 311,col 5)",
        "(line 314,col 5)-(line 316,col 5)",
        "(line 319,col 5)-(line 321,col 5)",
        "(line 323,col 5)-(line 323,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.traverseFunction(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 334,
      "end_line": 348,
      "comment": "\n   * Traverses a function, which creates a new scope in JavaScript.\n   *\n   * Note that CATCH blocks also create a new scope, but only for the\n   * catch variable. Declarations within the block actually belong to the\n   * enclosing scope. Because we don\u0027t remove catch variables, there\u0027s\n   * no need to treat CATCH blocks differently like we do functions.\n   ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 53)",
        "(line 336,col 5)-(line 336,col 45)",
        "(line 338,col 5)-(line 338,col 39)",
        "(line 339,col 5)-(line 340,col 28)",
        "(line 342,col 5)-(line 343,col 72)",
        "(line 344,col 5)-(line 344,col 35)",
        "(line 346,col 5)-(line 346,col 42)",
        "(line 347,col 5)-(line 347,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.collectMaybeUnreferencedVars(com.google.javascript.jscomp.Scope)",
      "begin_line": 354,
      "end_line": 361,
      "comment": "\n   * For each variable in this scope that we haven\u0027t found a reference\n   * for yet, add it to the list of variables to check later.\n   ",
      "child_ranges": [
        "(line 355,col 5)-(line 360,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope)",
      "begin_line": 369,
      "end_line": 409,
      "comment": "\n   * Removes unreferenced arguments from a function declaration and when\n   * possible the function\u0027s callSites.\n   *\n   * @param fnScope The scope inside the function\n   ",
      "child_ranges": [
        "(line 379,col 5)-(line 381,col 5)",
        "(line 383,col 5)-(line 383,col 42)",
        "(line 385,col 5)-(line 385,col 52)",
        "(line 386,col 5)-(line 389,col 5)",
        "(line 391,col 5)-(line 391,col 48)",
        "(line 392,col 5)-(line 393,col 56)",
        "(line 394,col 5)-(line 408,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.getFunctionArgList(com.google.javascript.rhino.Node)",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n   * @return the LP node containing the function parameters.\n   ",
      "child_ranges": [
        "(line 416,col 5)-(line 416,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallSiteOptimizer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 419,
      "end_line": 701,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defFinder"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toRemove"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "toReplaceWithZero"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.CallSiteOptimizer(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 425,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 428,col 7)-(line 428,col 31)",
        "(line 429,col 7)-(line 429,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.optimize(com.google.javascript.jscomp.Scope, java.util.Set\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 432,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 433,col 7)-(line 433,col 44)",
        "(line 434,col 7)-(line 434,col 54)",
        "(line 435,col 7)-(line 435,col 50)",
        "(line 439,col 7)-(line 439,col 65)",
        "(line 440,col 7)-(line 442,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.applyChanges()",
      "begin_line": 448,
      "end_line": 457,
      "comment": "\n     * Applies optimizations to all previously marked nodes.\n     ",
      "child_ranges": [
        "(line 449,col 7)-(line 452,col 7)",
        "(line 453,col 7)-(line 456,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.markUnreferencedFunctionArgs(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, java.util.Set\u003ccom.google.javascript.jscomp.Scope.Var\u003e, com.google.javascript.rhino.Node, int, boolean)",
      "begin_line": 472,
      "end_line": 510,
      "comment": "\n     * For each unused function parameter, determine if it can be removed\n     * from all the call sites, if so, remove it from the function signature\n     * and the call sites otherwise replace the unused value where possible\n     * with a constant (0).\n     *\n     * @param scope The function scope\n     * @param function The function\n     * @param param The current parameter node in the parameter list.\n     * @param paramIndex The index of the current parameter\n     * @param canChangeSignature Whether function signature can be change.\n     * @return Whether there is a following function parameter.\n     ",
      "child_ranges": [
        "(line 476,col 7)-(line 509,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.canRemoveArgFromCallSites(com.google.javascript.rhino.Node, int)",
      "begin_line": 517,
      "end_line": 535,
      "comment": "\n     * Remove all references to a parameter, otherwise simplify the known\n     * references.\n     * @return Whether all the references were removed.\n     ",
      "child_ranges": [
        "(line 518,col 7)-(line 518,col 62)",
        "(line 521,col 7)-(line 532,col 7)",
        "(line 534,col 7)-(line 534,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.tryRemoveArgFromCallSites(com.google.javascript.rhino.Node, int, boolean)",
      "begin_line": 541,
      "end_line": 565,
      "comment": "\n     * Remove all references to a parameter if possible otherwise simplify the\n     * side-effect free parameters.\n     ",
      "child_ranges": [
        "(line 543,col 7)-(line 543,col 62)",
        "(line 545,col 7)-(line 564,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.tryRemoveAllFollowingArgs(com.google.javascript.rhino.Node, int)",
      "begin_line": 570,
      "end_line": 584,
      "comment": "\n     * Remove all the following parameters without side-effects\n     ",
      "child_ranges": [
        "(line 571,col 7)-(line 571,col 62)",
        "(line 572,col 7)-(line 583,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.getArgumentForCallOrNewOrDotCall(com.google.javascript.jscomp.UseSite, int)",
      "begin_line": 590,
      "end_line": 598,
      "comment": "\n     * Returns the nth argument node given a usage site for a direct function\n     * call or for a func.call() node.\n     ",
      "child_ranges": [
        "(line 592,col 7)-(line 592,col 38)",
        "(line 593,col 7)-(line 593,col 42)",
        "(line 594,col 7)-(line 596,col 7)",
        "(line 597,col 7)-(line 597,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.canModifyCallers(com.google.javascript.rhino.Node)",
      "begin_line": 604,
      "end_line": 623,
      "comment": "\n     * @param function\n     * @return Whether the callers to this function can be modified in any way.\n     ",
      "child_ranges": [
        "(line 605,col 7)-(line 607,col 7)",
        "(line 609,col 7)-(line 609,col 76)",
        "(line 610,col 7)-(line 612,col 7)",
        "(line 614,col 7)-(line 614,col 49)",
        "(line 618,col 7)-(line 620,col 7)",
        "(line 622,col 7)-(line 622,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.isModifiableCallSite(com.google.javascript.jscomp.UseSite)",
      "begin_line": 629,
      "end_line": 632,
      "comment": "\n     * @param site The site to inspect\n     * @return Whether the call site is suitable for modification\n     ",
      "child_ranges": [
        "(line 630,col 7)-(line 631,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.canChangeSignature(com.google.javascript.rhino.Node)",
      "begin_line": 638,
      "end_line": 686,
      "comment": "\n     * @return Whether the definitionSite represents a function whose call\n     *      signature can be modified.\n     ",
      "child_ranges": [
        "(line 639,col 7)-(line 639,col 62)",
        "(line 640,col 7)-(line 640,col 67)",
        "(line 642,col 7)-(line 642,col 55)",
        "(line 644,col 7)-(line 644,col 71)",
        "(line 645,col 7)-(line 683,col 7)",
        "(line 685,col 7)-(line 685,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.CallSiteOptimizer.getFunctionDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 692,
      "end_line": 700,
      "comment": "\n     * @param function\n     * @return the Definition object for the function.\n     ",
      "child_ranges": [
        "(line 693,col 7)-(line 694,col 20)",
        "(line 695,col 7)-(line 695,col 49)",
        "(line 696,col 7)-(line 696,col 56)",
        "(line 697,col 7)-(line 697,col 58)",
        "(line 698,col 7)-(line 698,col 67)",
        "(line 699,col 7)-(line 699,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.interpretAssigns()",
      "begin_line": 723,
      "end_line": 772,
      "comment": "\n   * Look at all the property assigns to all variables.\n   * These may or may not count as references. For example,\n   *\n   * \u003ccode\u003e\n   * var x \u003d {};\n   * x.foo \u003d 3; // not a reference.\n   * var y \u003d foo();\n   * y.foo \u003d 3; // is a reference.\n   * \u003c/code\u003e\n   *\n   * Interpreting assignments could mark a variable as referenced that\n   * wasn\u0027t referenced before, in order to keep it alive. Because we find\n   * references by lazily traversing subtrees, marking a variable as\n   * referenced could trigger new traversals of new subtrees, which could\n   * find new references.\n   *\n   * Therefore, this interpretation needs to be run to a fixed point.\n   ",
      "child_ranges": [
        "(line 724,col 5)-(line 724,col 28)",
        "(line 725,col 5)-(line 771,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.removeAllAssigns(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 777,
      "end_line": 782,
      "comment": "\n   * Remove all assigns to a var.\n   ",
      "child_ranges": [
        "(line 778,col 5)-(line 781,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.markReferencedVar(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 789,
      "end_line": 797,
      "comment": "\n   * Marks a var as referenced, recursing into any values of this var\n   * that we skipped.\n   * @return True if this variable had not been referenced before.\n   ",
      "child_ranges": [
        "(line 790,col 5)-(line 795,col 5)",
        "(line 796,col 5)-(line 796,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.removeUnreferencedVars()",
      "begin_line": 803,
      "end_line": 867,
      "comment": "\n   * Removes any vars in the scope that were not referenced. Removes any\n   * assignments to those variables as well.\n   ",
      "child_ranges": [
        "(line 804,col 5)-(line 866,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Continuation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 874,
      "end_line": 893,
      "comment": "\n   * Our progress in a traversal can be expressed completely as the\n   * current node and scope. The continuation lets us save that\n   * information so that we can continue the traversal later.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 875,
      "end_line": 875,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.Continuation.Continuation(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 879,col 23)",
        "(line 880,col 7)-(line 880,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.Continuation.apply()",
      "begin_line": 883,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 884,col 7)-(line 891,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Assign",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 895,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignNode"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 899,
      "end_line": 899,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isPropertyAssign"
      ],
      "begin_line": 903,
      "end_line": 903,
      "comment": " this is an assign to a property of that variable."
    },
    {
      "type": "field",
      "varNames": [
        "mayHaveSecondarySideEffects"
      ],
      "begin_line": 914,
      "end_line": 914,
      "comment": " way."
    },
    {
      "type": "field",
      "varNames": [
        "maybeAliased"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": " If true, the value may have escaped and any modification is a use."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.Assign.Assign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, boolean)",
      "begin_line": 919,
      "end_line": 930,
      "comment": "",
      "child_ranges": [
        "(line 920,col 7)-(line 920,col 68)",
        "(line 921,col 7)-(line 921,col 35)",
        "(line 922,col 7)-(line 922,col 31)",
        "(line 923,col 7)-(line 923,col 47)",
        "(line 925,col 7)-(line 925,col 70)",
        "(line 926,col 7)-(line 929,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.Assign.maybeCreateAssign(com.google.javascript.rhino.Node)",
      "begin_line": 936,
      "end_line": 962,
      "comment": "\n     * If this is an assign to a variable or its property, return it.\n     * Otherwise, return null.\n     ",
      "child_ranges": [
        "(line 937,col 7)-(line 937,col 68)",
        "(line 944,col 7)-(line 944,col 35)",
        "(line 945,col 7)-(line 945,col 48)",
        "(line 946,col 7)-(line 956,col 7)",
        "(line 958,col 7)-(line 960,col 7)",
        "(line 961,col 7)-(line 961,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedVars.Assign.remove()",
      "begin_line": 967,
      "end_line": 993,
      "comment": "\n     * Replace the current assign with its right hand side.\n     ",
      "child_ranges": [
        "(line 968,col 7)-(line 968,col 43)",
        "(line 969,col 7)-(line 992,col 7)"
      ]
    }
  ]
}