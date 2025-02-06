{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SpecializationAwareCompilerPass"
      ],
      "begin_line": 55,
      "end_line": 1120,
      "comment": "\n * Inlines functions that are divided into two types: \"direct call node\n * replacement\" (aka \"direct\") and as a block of statements (aka block).\n * Function that can be inlined \"directly\" functions consist of a single\n * return statement, everything else is must be inlined as a \"block\". These\n * functions must meet these general requirements:\n * - it is not recursive\n * - the function does not contain another function -- these may be\n *   intentional to to limit the scope of closures.\n * - function is called only once OR the size of the inline function is smaller\n *   than the call itself.\n * - the function name is not referenced in any other manner\n *\n * \"directly\" inlined functions must meet these additional requirements:\n * - consists of a single return statement\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "fns"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " this needs a major refactor."
    },
    {
      "type": "field",
      "varNames": [
        "anonFns"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "injector"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockFunctionInliningEnabled"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineGlobalFunctions"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalFunctions"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeMinimumCapture"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.InlineFunctions(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 76,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 50)",
        "(line 84,col 5)-(line 84,col 60)",
        "(line 85,col 5)-(line 85,col 29)",
        "(line 87,col 5)-(line 87,col 55)",
        "(line 88,col 5)-(line 88,col 53)",
        "(line 89,col 5)-(line 89,col 69)",
        "(line 90,col 5)-(line 90,col 53)",
        "(line 92,col 5)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.getOrCreateFunctionState(java.lang.String)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 39)",
        "(line 99,col 5)-(line 102,col 5)",
        "(line 103,col 5)-(line 103,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 112,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 74)",
        "(line 116,col 5)-(line 116,col 73)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 121,col 51)",
        "(line 122,col 5)-(line 122,col 49)",
        "(line 123,col 5)-(line 125,col 5)",
        "(line 135,col 5)-(line 135,col 56)",
        "(line 136,col 5)-(line 136,col 40)",
        "(line 138,col 5)-(line 138,col 31)",
        "(line 139,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 142,col 29)",
        "(line 143,col 5)-(line 143,col 34)",
        "(line 144,col 5)-(line 146,col 70)",
        "(line 148,col 5)-(line 148,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindCandidateFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 154,
      "end_line": 236,
      "comment": "\n   * Find functions that might be inlined.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callsSeen"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 165,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 172,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.findNamedFunctions(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 175,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 176,col 7)-(line 179,col 7)",
        "(line 181,col 7)-(line 203,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.findFunctionExpressions(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 212,
      "end_line": 235,
      "comment": "\n     * Find function expressions that are called directly in the form of\n     *   (function(a,b,...){...})(a,b,...)\n     * or\n     *   (function(a,b,...){...}).call(this,a,b, ...)\n     ",
      "child_ranges": [
        "(line 213,col 7)-(line 234,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function, com.google.javascript.jscomp.JSModule)",
      "begin_line": 242,
      "end_line": 308,
      "comment": "\n   * Updates the FunctionState object for the given function. Checks if the\n   * given function matches the criteria for an inlinable function.\n   ",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 31)",
        "(line 244,col 5)-(line 244,col 54)",
        "(line 250,col 5)-(line 307,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.hasLocalNames(com.google.javascript.rhino.Node)",
      "begin_line": 314,
      "end_line": 321,
      "comment": "\n   * @param fnNode The function to inspect.\n   * @return Whether the function has parameters, var, or function declarations.\n   ",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 50)",
        "(line 316,col 5)-(line 320,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.getContainingFunction(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n   * Returns the function the traversal is currently traversing, or null\n   * if in the global scope.\n   ",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)",
      "begin_line": 335,
      "end_line": 361,
      "comment": "\n   * Checks if the given function matches the criteria for an inlinable\n   * function.\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 33)",
        "(line 338,col 5)-(line 346,col 5)",
        "(line 349,col 5)-(line 351,col 5)",
        "(line 354,col 5)-(line 357,col 5)",
        "(line 359,col 5)-(line 359,col 39)",
        "(line 360,col 5)-(line 360,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallVisitorCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n   * @see CallVisitor\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 367,
      "end_line": 368,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "CallVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 374,
      "end_line": 421,
      "comment": "\n   * Visit call sites for functions in functionMap.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anonFunctionMap"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitor.CallVisitor(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState\u003e, java.util.Map\u003ccom.google.javascript.rhino.Node, java.lang.String\u003e, com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback)",
      "begin_line": 380,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 383,col 7)-(line 383,col 29)",
        "(line 384,col 7)-(line 384,col 37)",
        "(line 385,col 7)-(line 385,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitor.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 388,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 390,col 7)-(line 419,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(com.google.javascript.rhino.Node)",
      "begin_line": 427,
      "end_line": 461,
      "comment": "\n   * @return Whether the name is used in a way that might be a candidate\n   *   for inlining.\n   ",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 35)",
        "(line 429,col 5)-(line 429,col 44)",
        "(line 430,col 5)-(line 434,col 5)",
        "(line 436,col 5)-(line 439,col 5)",
        "(line 449,col 5)-(line 459,col 5)",
        "(line 460,col 5)-(line 460,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindCandidatesReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.CallVisitor",
        "com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback"
      ],
      "begin_line": 466,
      "end_line": 589,
      "comment": "\n   * Find references to functions that are inlinable.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.FindCandidatesReferences(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState\u003e, java.util.Map\u003ccom.google.javascript.rhino.Node, java.lang.String\u003e)",
      "begin_line": 469,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 472,col 7)-(line 472,col 32)",
        "(line 473,col 7)-(line 473,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 476,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 478,col 7)-(line 478,col 32)",
        "(line 479,col 7)-(line 481,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 484,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 487,col 7)-(line 487,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.maybeAddReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 490,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 492,col 7)-(line 494,col 7)",
        "(line 496,col 7)-(line 496,col 37)",
        "(line 497,col 7)-(line 498,col 54)",
        "(line 499,col 7)-(line 500,col 41)",
        "(line 501,col 7)-(line 508,col 7)",
        "(line 510,col 7)-(line 514,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.maybeAddReferenceUsingMode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 517,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 521,col 7)-(line 529,col 7)",
        "(line 531,col 7)-(line 534,col 34)",
        "(line 535,col 7)-(line 541,col 7)",
        "(line 543,col 7)-(line 543,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.checkNameUsage(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 549,
      "end_line": 588,
      "comment": "\n     * Find functions that can be inlined.\n     ",
      "child_ranges": [
        "(line 550,col 7)-(line 550,col 43)",
        "(line 552,col 7)-(line 554,col 7)",
        "(line 557,col 7)-(line 557,col 34)",
        "(line 558,col 7)-(line 558,col 39)",
        "(line 559,col 7)-(line 561,col 7)",
        "(line 567,col 7)-(line 574,col 7)",
        "(line 577,col 7)-(line 587,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Inline",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback"
      ],
      "begin_line": 594,
      "end_line": 646,
      "comment": "\n   * Inline functions at the call sites.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "injector"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 596,
      "end_line": 596,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.Inline(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 598,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 600,col 7)-(line 600,col 31)",
        "(line 601,col 7)-(line 601,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 604,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 607,col 67)",
        "(line 608,col 7)-(line 630,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.inlineFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 636,
      "end_line": 645,
      "comment": "\n     * Inline a function into the call site.\n     ",
      "child_ranges": [
        "(line 638,col 7)-(line 638,col 31)",
        "(line 639,col 7)-(line 639,col 35)",
        "(line 640,col 7)-(line 640,col 39)",
        "(line 642,col 7)-(line 642,col 72)",
        "(line 643,col 7)-(line 643,col 41)",
        "(line 644,col 7)-(line 644,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.trimCanidatesNotMeetingMinimumRequirements()",
      "begin_line": 652,
      "end_line": 660,
      "comment": "\n   * Remove entries that aren\u0027t a valid inline candidates, from the list of\n   * encountered names.\n   ",
      "child_ranges": [
        "(line 653,col 4)-(line 653,col 44)",
        "(line 654,col 4)-(line 659,col 4)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost()",
      "begin_line": 665,
      "end_line": 682,
      "comment": "\n   * Remove entries from the list of candidates that can\u0027t be inlined.\n   ",
      "child_ranges": [
        "(line 666,col 5)-(line 666,col 45)",
        "(line 667,col 5)-(line 681,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.mimimizeCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 689,
      "end_line": 703,
      "comment": "\n   * Determines if the function is worth inlining and potentially\n   * trims references that increase the cost.\n   * @return Whether inlining the references lowers the overall cost.\n   ",
      "child_ranges": [
        "(line 690,col 5)-(line 701,col 5)",
        "(line 702,col 5)-(line 702,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 708,
      "end_line": 716,
      "comment": "\n   * @return Whether inlining the function reduces code size.\n   ",
      "child_ranges": [
        "(line 709,col 5)-(line 715,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.resolveInlineConflicts()",
      "begin_line": 735,
      "end_line": 739,
      "comment": "\n   * Size base inlining calculations are thrown off when a function that is\n   * being inlined also contains calls to functions that are slated for\n   * inlining.\n   *\n   * Specifically, a clone of the FUNCTION node tree is used when the function\n   * is inlined. Calls in this new tree are not included in the list of function\n   * references so they won\u0027t be inlined (which is what we want). Here we mark\n   * those functions as non-removable (as they will have new references in the\n   * cloned node trees).\n   *\n   * This prevents a function that would only be inlined because it is\n   * referenced once from being inlined into multiple call sites because\n   * the calling function has been inlined in multiple locations or the\n   * function being removed while there are still references.\n   ",
      "child_ranges": [
        "(line 736,col 5)-(line 738,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 744,
      "end_line": 770,
      "comment": "\n   * @see #resolveInlineConflicts\n   ",
      "child_ranges": [
        "(line 746,col 5)-(line 748,col 5)",
        "(line 750,col 5)-(line 750,col 47)",
        "(line 751,col 5)-(line 751,col 52)",
        "(line 752,col 5)-(line 769,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(com.google.javascript.rhino.Node)",
      "begin_line": 775,
      "end_line": 779,
      "comment": "\n   * This functions that may be called directly.\n   ",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 44)",
        "(line 777,col 5)-(line 777,col 65)",
        "(line 778,col 5)-(line 778,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 784,
      "end_line": 797,
      "comment": "\n   * @see #findCalledFunctions(Node)\n   ",
      "child_ranges": [
        "(line 786,col 5)-(line 786,col 49)",
        "(line 788,col 5)-(line 792,col 5)",
        "(line 794,col 5)-(line 796,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.decomposeExpressions(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 803,
      "end_line": 816,
      "comment": "\n   * For any call-site that needs it, prepare the call-site for inlining\n   * by rewriting the containing expression.\n   ",
      "child_ranges": [
        "(line 804,col 5)-(line 805,col 63)",
        "(line 807,col 5)-(line 815,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions()",
      "begin_line": 821,
      "end_line": 838,
      "comment": "\n   * Removed inlined functions that no longer have any references.\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 837,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 844,
      "end_line": 852,
      "comment": "\n   * Sanity check to verify, that expression rewriting didn\u0027t\n   * make a call inaccessible.\n   ",
      "child_ranges": [
        "(line 845,col 5)-(line 851,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 857,
      "end_line": 1000,
      "comment": "\n   * Use to track the decisions that have been make about a function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeFnNode"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inline"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "remove"
      ],
      "begin_line": 861,
      "end_line": 861,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineDirectly"
      ],
      "begin_line": 862,
      "end_line": 862,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencesThis"
      ],
      "begin_line": 863,
      "end_line": 863,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasInnerFunctions"
      ],
      "begin_line": 864,
      "end_line": 864,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "references"
      ],
      "begin_line": 865,
      "end_line": 865,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 866,
      "end_line": 866,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namesToAlias"
      ],
      "begin_line": 867,
      "end_line": 867,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasExistingFunctionDefinition()",
      "begin_line": 869,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 870,col 7)-(line 870,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setReferencesThis(boolean)",
      "begin_line": 873,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferencesThis()",
      "begin_line": 877,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 878,col 7)-(line 878,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setHasInnerFunctions(boolean)",
      "begin_line": 881,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 882,col 7)-(line 882,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasInnerFunctions()",
      "begin_line": 886,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 887,col 7)-(line 887,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.removeBlockInliningReferences()",
      "begin_line": 890,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 891,col 7)-(line 891,col 41)",
        "(line 892,col 7)-(line 897,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasBlockInliningReferences()",
      "begin_line": 900,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 901,col 7)-(line 905,col 7)",
        "(line 906,col 7)-(line 906,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getFn()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 910,col 7)-(line 910,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setFn(com.google.javascript.jscomp.InlineFunctions.Function)",
      "begin_line": 913,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 914,col 7)-(line 914,col 48)",
        "(line 915,col 7)-(line 915,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getSafeFnNode()",
      "begin_line": 918,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 919,col 7)-(line 919,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setSafeFnNode(com.google.javascript.rhino.Node)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 923,col 7)-(line 923,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canInline()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 927,col 7)-(line 927,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setInline(boolean)",
      "begin_line": 930,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 931,col 7)-(line 931,col 27)",
        "(line 932,col 7)-(line 937,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canRemove()",
      "begin_line": 940,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 941,col 7)-(line 941,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setRemove(boolean)",
      "begin_line": 944,
      "end_line": 946,
      "comment": "",
      "child_ranges": [
        "(line 945,col 7)-(line 945,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canInlineDirectly()",
      "begin_line": 948,
      "end_line": 950,
      "comment": "",
      "child_ranges": [
        "(line 949,col 7)-(line 949,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.inlineDirectly(boolean)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 953,col 7)-(line 953,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasReferences()",
      "begin_line": 956,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 957,col 7)-(line 957,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferencesInternal()",
      "begin_line": 960,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 961,col 7)-(line 963,col 7)",
        "(line 964,col 7)-(line 964,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.addReference(com.google.javascript.jscomp.InlineFunctions.Reference)",
      "begin_line": 967,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 968,col 7)-(line 970,col 7)",
        "(line 971,col 7)-(line 971,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferences()",
      "begin_line": 974,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 975,col 7)-(line 975,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReference(com.google.javascript.rhino.Node)",
      "begin_line": 978,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 979,col 7)-(line 979,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getNamesToAlias()",
      "begin_line": 982,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 983,col 7)-(line 985,col 7)",
        "(line 986,col 7)-(line 986,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setNamesToAlias(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 990,col 7)-(line 990,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 993,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 994,col 7)-(line 994,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getModule()",
      "begin_line": 997,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 998,col 7)-(line 998,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1006,
      "end_line": 1017,
      "comment": "\n   * Interface for dealing with function declarations and function\n   * expressions equally\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getName()",
      "begin_line": 1008,
      "end_line": 1008,
      "comment": " Gets the name of the function ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getFunctionNode()",
      "begin_line": 1011,
      "end_line": 1011,
      "comment": " Gets the function node ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.remove()",
      "begin_line": 1014,
      "end_line": 1014,
      "comment": " Removes itself from the JavaScript ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getDeclaringBlock()",
      "begin_line": 1016,
      "end_line": 1016,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NamedFunction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.Function"
      ],
      "begin_line": 1020,
      "end_line": 1046,
      "comment": " NamedFunction implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 1021,
      "end_line": 1021,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.NamedFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1023,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 7)-(line 1024,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getName()",
      "begin_line": 1027,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 7)-(line 1029,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getFunctionNode()",
      "begin_line": 1032,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 7)-(line 1034,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.remove()",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 7)-(line 1039,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getDeclaringBlock()",
      "begin_line": 1042,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 7)-(line 1044,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionVar",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.Function"
      ],
      "begin_line": 1049,
      "end_line": 1075,
      "comment": " FunctionVar implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "var"
      ],
      "begin_line": 1050,
      "end_line": 1050,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.FunctionVar(com.google.javascript.rhino.Node)",
      "begin_line": 1052,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 7)-(line 1053,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getName()",
      "begin_line": 1056,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 7)-(line 1058,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getFunctionNode()",
      "begin_line": 1061,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 7)-(line 1063,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.remove()",
      "begin_line": 1066,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1068,col 7)-(line 1068,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getDeclaringBlock()",
      "begin_line": 1071,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 7)-(line 1073,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionExpression",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.Function"
      ],
      "begin_line": 1078,
      "end_line": 1109,
      "comment": " FunctionExpression implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 1079,
      "end_line": 1079,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fakeName"
      ],
      "begin_line": 1080,
      "end_line": 1080,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.FunctionExpression(com.google.javascript.rhino.Node, int)",
      "begin_line": 1082,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 7)-(line 1083,col 19)",
        "(line 1086,col 7)-(line 1086,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getName()",
      "begin_line": 1089,
      "end_line": 1092,
      "comment": "",
      "child_ranges": [
        "(line 1091,col 7)-(line 1091,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getFunctionNode()",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 7)-(line 1096,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.remove()",
      "begin_line": 1099,
      "end_line": 1102,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getDeclaringBlock()",
      "begin_line": 1104,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 7)-(line 1106,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionInjector.Reference"
      ],
      "begin_line": 1111,
      "end_line": 1119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiresDecomposition"
      ],
      "begin_line": 1112,
      "end_line": 1112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlined"
      ],
      "begin_line": 1113,
      "end_line": 1113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.FunctionInjector.InliningMode, boolean)",
      "begin_line": 1114,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 7)-(line 1116,col 36)",
        "(line 1117,col 7)-(line 1117,col 45)"
      ]
    }
  ]
}