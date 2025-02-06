{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InlineFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SpecializationAwareCompilerPass"
      ],
      "begin_line": 53,
      "end_line": 1116,
      "comment": "\n * Inlines functions that are divided into two types: \"direct call node\n * replacement\" (aka \"direct\") and as a block of statements (aka block).\n * Function that can be inlined \"directly\" functions consist of a single\n * return statement, everything else is must be inlined as a \"block\". These\n * functions must meet these general requirements:\n * - it is not recursive\n * - the function does not contain another function -- these may be\n *   intentional to to limit the scope of closures.\n * - function is called only once OR the size of the inline function is smaller\n *   than the call itself.\n * - the function name is not referenced in any other manner\n *\n * \"directly\" inlined functions must meet these additional requirements:\n * - consists of a single return statement\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "fns"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " this needs a major refactor."
    },
    {
      "type": "field",
      "varNames": [
        "anonFns"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
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
        "injector"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blockFunctionInliningEnabled"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineGlobalFunctions"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalFunctions"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeMinimumCapture"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.InlineFunctions(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, boolean, boolean, boolean, boolean, boolean)",
      "begin_line": 74,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 50)",
        "(line 82,col 5)-(line 82,col 60)",
        "(line 83,col 5)-(line 83,col 29)",
        "(line 85,col 5)-(line 85,col 55)",
        "(line 86,col 5)-(line 86,col 53)",
        "(line 87,col 5)-(line 87,col 69)",
        "(line 88,col 5)-(line 88,col 53)",
        "(line 90,col 5)-(line 92,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.getOrCreateFunctionState(java.lang.String)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 39)",
        "(line 97,col 5)-(line 100,col 5)",
        "(line 101,col 5)-(line 101,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 74)",
        "(line 114,col 5)-(line 114,col 73)",
        "(line 115,col 5)-(line 117,col 5)",
        "(line 118,col 5)-(line 119,col 51)",
        "(line 120,col 5)-(line 120,col 49)",
        "(line 121,col 5)-(line 123,col 5)",
        "(line 133,col 5)-(line 133,col 56)",
        "(line 134,col 5)-(line 134,col 40)",
        "(line 136,col 5)-(line 136,col 31)",
        "(line 137,col 5)-(line 139,col 5)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 141,col 5)-(line 141,col 27)",
        "(line 142,col 5)-(line 144,col 70)",
        "(line 146,col 5)-(line 146,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindCandidateFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 152,
      "end_line": 234,
      "comment": "\n   * Find functions that might be inlined.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callsSeen"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 7)-(line 160,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 170,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.findNamedFunctions(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 174,col 7)-(line 177,col 7)",
        "(line 179,col 7)-(line 201,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidateFunctions.findFunctionExpressions(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 233,
      "comment": "\n     * Find function expressions that are called directly in the form of\n     *   (function(a,b,...){...})(a,b,...)\n     * or\n     *   (function(a,b,...){...}).call(this,a,b, ...)\n     ",
      "child_ranges": [
        "(line 211,col 7)-(line 232,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.maybeAddFunction(com.google.javascript.jscomp.InlineFunctions.Function, com.google.javascript.jscomp.JSModule)",
      "begin_line": 240,
      "end_line": 306,
      "comment": "\n   * Updates the FunctionState object for the given function. Checks if the\n   * given function matches the criteria for an inlinable function.\n   ",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 31)",
        "(line 242,col 5)-(line 242,col 54)",
        "(line 248,col 5)-(line 305,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.hasLocalNames(com.google.javascript.rhino.Node)",
      "begin_line": 312,
      "end_line": 319,
      "comment": "\n   * @param fnNode The function to inspect.\n   * @return Whether the function has parameters, var, or function declarations.\n   ",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 50)",
        "(line 314,col 5)-(line 318,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.getContainingFunction(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n   * Returns the function the traversal is currently traversing, or null\n   * if in the global scope.\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.isCandidateFunction(com.google.javascript.jscomp.InlineFunctions.Function)",
      "begin_line": 333,
      "end_line": 359,
      "comment": "\n   * Checks if the given function matches the criteria for an inlinable\n   * function.\n   ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 33)",
        "(line 336,col 5)-(line 344,col 5)",
        "(line 347,col 5)-(line 349,col 5)",
        "(line 352,col 5)-(line 355,col 5)",
        "(line 357,col 5)-(line 357,col 39)",
        "(line 358,col 5)-(line 358,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallVisitorCallback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n   * @see CallVisitor\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 365,
      "end_line": 366,
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
      "begin_line": 372,
      "end_line": 419,
      "comment": "\n   * Visit call sites for functions in functionMap.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "anonFunctionMap"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitor.CallVisitor(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState\u003e, java.util.Map\u003ccom.google.javascript.rhino.Node, java.lang.String\u003e, com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback)",
      "begin_line": 378,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 381,col 7)-(line 381,col 29)",
        "(line 382,col 7)-(line 382,col 37)",
        "(line 383,col 7)-(line 383,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.CallVisitor.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 417,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.isCandidateUsage(com.google.javascript.rhino.Node)",
      "begin_line": 425,
      "end_line": 459,
      "comment": "\n   * @return Whether the name is used in a way that might be a candidate\n   *   for inlining.\n   ",
      "child_ranges": [
        "(line 426,col 5)-(line 426,col 35)",
        "(line 427,col 5)-(line 427,col 44)",
        "(line 428,col 5)-(line 432,col 5)",
        "(line 434,col 5)-(line 437,col 5)",
        "(line 447,col 5)-(line 457,col 5)",
        "(line 458,col 5)-(line 458,col 17)"
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
      "begin_line": 464,
      "end_line": 587,
      "comment": "\n   * Find references to functions that are inlinable.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.FindCandidatesReferences(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.InlineFunctions.FunctionState\u003e, java.util.Map\u003ccom.google.javascript.rhino.Node, java.lang.String\u003e)",
      "begin_line": 467,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 470,col 7)-(line 470,col 32)",
        "(line 471,col 7)-(line 471,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 474,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 476,col 7)-(line 476,col 32)",
        "(line 477,col 7)-(line 479,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 482,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 485,col 7)-(line 485,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.maybeAddReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 488,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 490,col 7)-(line 492,col 7)",
        "(line 494,col 7)-(line 494,col 37)",
        "(line 495,col 7)-(line 496,col 54)",
        "(line 497,col 7)-(line 498,col 41)",
        "(line 499,col 7)-(line 506,col 7)",
        "(line 508,col 7)-(line 512,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.maybeAddReferenceUsingMode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 515,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 519,col 7)-(line 527,col 7)",
        "(line 529,col 7)-(line 532,col 34)",
        "(line 533,col 7)-(line 539,col 7)",
        "(line 541,col 7)-(line 541,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FindCandidatesReferences.checkNameUsage(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 547,
      "end_line": 586,
      "comment": "\n     * Find functions that can be inlined.\n     ",
      "child_ranges": [
        "(line 548,col 7)-(line 548,col 43)",
        "(line 550,col 7)-(line 552,col 7)",
        "(line 555,col 7)-(line 555,col 34)",
        "(line 556,col 7)-(line 556,col 39)",
        "(line 557,col 7)-(line 559,col 7)",
        "(line 565,col 7)-(line 572,col 7)",
        "(line 575,col 7)-(line 585,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Inline",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.CallVisitorCallback"
      ],
      "begin_line": 592,
      "end_line": 644,
      "comment": "\n   * Inline functions at the call sites.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "injector"
      ],
      "begin_line": 593,
      "end_line": 593,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "specializationState"
      ],
      "begin_line": 594,
      "end_line": 594,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.Inline(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.jscomp.SpecializeModule.SpecializationState)",
      "begin_line": 596,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 598,col 7)-(line 598,col 31)",
        "(line 599,col 7)-(line 599,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.visitCallSite(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 602,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 67)",
        "(line 606,col 7)-(line 628,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Inline.inlineFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.InlineFunctions.FunctionState, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 634,
      "end_line": 643,
      "comment": "\n     * Inline a function into the call site.\n     ",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 31)",
        "(line 637,col 7)-(line 637,col 35)",
        "(line 638,col 7)-(line 638,col 39)",
        "(line 640,col 7)-(line 640,col 61)",
        "(line 641,col 7)-(line 641,col 54)",
        "(line 642,col 7)-(line 642,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.trimCanidatesNotMeetingMinimumRequirements()",
      "begin_line": 650,
      "end_line": 658,
      "comment": "\n   * Remove entries that aren\u0027t a valid inline candidates, from the list of\n   * encountered names.\n   ",
      "child_ranges": [
        "(line 651,col 4)-(line 651,col 44)",
        "(line 652,col 4)-(line 657,col 4)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.trimCanidatesUsingOnCost()",
      "begin_line": 663,
      "end_line": 680,
      "comment": "\n   * Remove entries from the list of candidates that can\u0027t be inlined.\n   ",
      "child_ranges": [
        "(line 664,col 5)-(line 664,col 45)",
        "(line 665,col 5)-(line 679,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.mimimizeCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 687,
      "end_line": 701,
      "comment": "\n   * Determines if the function is worth inlining and potentially\n   * trims references that increase the cost.\n   * @return Whether inlining the references lowers the overall cost.\n   ",
      "child_ranges": [
        "(line 688,col 5)-(line 699,col 5)",
        "(line 700,col 5)-(line 700,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.inliningLowersCost(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 706,
      "end_line": 714,
      "comment": "\n   * @return Whether inlining the function reduces code size.\n   ",
      "child_ranges": [
        "(line 707,col 5)-(line 713,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.resolveInlineConflicts()",
      "begin_line": 733,
      "end_line": 737,
      "comment": "\n   * Size base inlining calculations are thrown off when a function that is\n   * being inlined also contains calls to functions that are slated for\n   * inlining.\n   *\n   * Specifically, a clone of the FUNCTION node tree is used when the function\n   * is inlined. Calls in this new tree are not included in the list of function\n   * references so they won\u0027t be inlined (which is what we want). Here we mark\n   * those functions as non-removable (as they will have new references in the\n   * cloned node trees).\n   *\n   * This prevents a function that would only be inlined because it is\n   * referenced once from being inlined into multiple call sites because\n   * the calling function has been inlined in multiple locations or the\n   * function being removed while there are still references.\n   ",
      "child_ranges": [
        "(line 734,col 5)-(line 736,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.resolveInlineConflictsForFunction(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 742,
      "end_line": 768,
      "comment": "\n   * @see #resolveInlineConflicts\n   ",
      "child_ranges": [
        "(line 744,col 5)-(line 746,col 5)",
        "(line 748,col 5)-(line 748,col 47)",
        "(line 749,col 5)-(line 749,col 52)",
        "(line 750,col 5)-(line 767,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(com.google.javascript.rhino.Node)",
      "begin_line": 773,
      "end_line": 777,
      "comment": "\n   * This functions that may be called directly.\n   ",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 44)",
        "(line 775,col 5)-(line 775,col 65)",
        "(line 776,col 5)-(line 776,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.findCalledFunctions(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 782,
      "end_line": 795,
      "comment": "\n   * @see #findCalledFunctions(Node)\n   ",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 49)",
        "(line 786,col 5)-(line 790,col 5)",
        "(line 792,col 5)-(line 794,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.decomposeExpressions()",
      "begin_line": 801,
      "end_line": 811,
      "comment": "\n   * For any call-site that needs it, prepare the call-site for inlining\n   * by rewriting the containing expression.\n   ",
      "child_ranges": [
        "(line 802,col 5)-(line 810,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.removeInlinedFunctions()",
      "begin_line": 816,
      "end_line": 832,
      "comment": "\n   * Removed inlined functions that no longer have any references.\n   ",
      "child_ranges": [
        "(line 817,col 5)-(line 831,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.verifyAllReferencesInlined(com.google.javascript.jscomp.InlineFunctions.FunctionState)",
      "begin_line": 838,
      "end_line": 846,
      "comment": "\n   * Sanity check to verify, that expression rewriting didn\u0027t\n   * make a call inaccessible.\n   ",
      "child_ranges": [
        "(line 839,col 5)-(line 845,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 851,
      "end_line": 994,
      "comment": "\n   * Use to track the decisions that have been make about a function.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 852,
      "end_line": 852,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeFnNode"
      ],
      "begin_line": 853,
      "end_line": 853,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inline"
      ],
      "begin_line": 854,
      "end_line": 854,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "remove"
      ],
      "begin_line": 855,
      "end_line": 855,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineDirectly"
      ],
      "begin_line": 856,
      "end_line": 856,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencesThis"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasInnerFunctions"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "references"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namesToAlias"
      ],
      "begin_line": 861,
      "end_line": 861,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasExistingFunctionDefinition()",
      "begin_line": 863,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 864,col 7)-(line 864,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setReferencesThis(boolean)",
      "begin_line": 867,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 868,col 7)-(line 868,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferencesThis()",
      "begin_line": 871,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 872,col 7)-(line 872,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setHasInnerFunctions(boolean)",
      "begin_line": 875,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 876,col 7)-(line 876,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasInnerFunctions()",
      "begin_line": 880,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 881,col 7)-(line 881,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.removeBlockInliningReferences()",
      "begin_line": 884,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 885,col 7)-(line 885,col 41)",
        "(line 886,col 7)-(line 891,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasBlockInliningReferences()",
      "begin_line": 894,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 895,col 7)-(line 899,col 7)",
        "(line 900,col 7)-(line 900,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getFn()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 7)-(line 904,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setFn(com.google.javascript.jscomp.InlineFunctions.Function)",
      "begin_line": 907,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 908,col 7)-(line 908,col 48)",
        "(line 909,col 7)-(line 909,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getSafeFnNode()",
      "begin_line": 912,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 913,col 7)-(line 913,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setSafeFnNode(com.google.javascript.rhino.Node)",
      "begin_line": 916,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 917,col 7)-(line 917,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canInline()",
      "begin_line": 920,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 921,col 7)-(line 921,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setInline(boolean)",
      "begin_line": 924,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 925,col 7)-(line 925,col 27)",
        "(line 926,col 7)-(line 931,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canRemove()",
      "begin_line": 934,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 935,col 7)-(line 935,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setRemove(boolean)",
      "begin_line": 938,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 939,col 7)-(line 939,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.canInlineDirectly()",
      "begin_line": 942,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 943,col 7)-(line 943,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.inlineDirectly(boolean)",
      "begin_line": 946,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 947,col 7)-(line 947,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.hasReferences()",
      "begin_line": 950,
      "end_line": 952,
      "comment": "",
      "child_ranges": [
        "(line 951,col 7)-(line 951,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferencesInternal()",
      "begin_line": 954,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 955,col 7)-(line 957,col 7)",
        "(line 958,col 7)-(line 958,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.addReference(com.google.javascript.jscomp.InlineFunctions.Reference)",
      "begin_line": 961,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 962,col 7)-(line 964,col 7)",
        "(line 965,col 7)-(line 965,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReferences()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 969,col 7)-(line 969,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getReference(com.google.javascript.rhino.Node)",
      "begin_line": 972,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 973,col 7)-(line 973,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getNamesToAlias()",
      "begin_line": 976,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 977,col 7)-(line 979,col 7)",
        "(line 980,col 7)-(line 980,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setNamesToAlias(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 983,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 984,col 7)-(line 984,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.setModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 988,col 7)-(line 988,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionState.getModule()",
      "begin_line": 991,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 992,col 7)-(line 992,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1000,
      "end_line": 1011,
      "comment": "\n   * Interface for dealing with function declarations and function\n   * expressions equally\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getName()",
      "begin_line": 1002,
      "end_line": 1002,
      "comment": " Gets the name of the function ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getFunctionNode()",
      "begin_line": 1005,
      "end_line": 1005,
      "comment": " Gets the function node ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.remove()",
      "begin_line": 1008,
      "end_line": 1008,
      "comment": " Removes itself from the JavaScript ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Function.getDeclaringBlock()",
      "begin_line": 1010,
      "end_line": 1010,
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
      "begin_line": 1014,
      "end_line": 1041,
      "comment": " NamedFunction implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.NamedFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 7)-(line 1018,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getName()",
      "begin_line": 1021,
      "end_line": 1024,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 7)-(line 1023,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getFunctionNode()",
      "begin_line": 1026,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 7)-(line 1028,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.remove()",
      "begin_line": 1031,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 7)-(line 1033,col 48)",
        "(line 1034,col 7)-(line 1034,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.NamedFunction.getDeclaringBlock()",
      "begin_line": 1037,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 7)-(line 1039,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionVar",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.Function"
      ],
      "begin_line": 1044,
      "end_line": 1071,
      "comment": " FunctionVar implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "var"
      ],
      "begin_line": 1045,
      "end_line": 1045,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.FunctionVar(com.google.javascript.rhino.Node)",
      "begin_line": 1047,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 7)-(line 1048,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getName()",
      "begin_line": 1051,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 7)-(line 1053,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getFunctionNode()",
      "begin_line": 1056,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 7)-(line 1058,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.remove()",
      "begin_line": 1061,
      "end_line": 1065,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 7)-(line 1063,col 49)",
        "(line 1064,col 7)-(line 1064,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionVar.getDeclaringBlock()",
      "begin_line": 1067,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1069,col 7)-(line 1069,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionExpression",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.InlineFunctions.Function"
      ],
      "begin_line": 1074,
      "end_line": 1105,
      "comment": " FunctionExpression implementation of the Function interface "
    },
    {
      "type": "field",
      "varNames": [
        "fn"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fakeName"
      ],
      "begin_line": 1076,
      "end_line": 1076,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.FunctionExpression(com.google.javascript.rhino.Node, int)",
      "begin_line": 1078,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1079,col 7)-(line 1079,col 19)",
        "(line 1082,col 7)-(line 1082,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getName()",
      "begin_line": 1085,
      "end_line": 1088,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 7)-(line 1087,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getFunctionNode()",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 7)-(line 1092,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.remove()",
      "begin_line": 1095,
      "end_line": 1098,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctions.FunctionExpression.getDeclaringBlock()",
      "begin_line": 1100,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1102,col 7)-(line 1102,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionInjector.Reference"
      ],
      "begin_line": 1107,
      "end_line": 1115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiresDecomposition"
      ],
      "begin_line": 1108,
      "end_line": 1108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlined"
      ],
      "begin_line": 1109,
      "end_line": 1109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctions.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.FunctionInjector.InliningMode, boolean)",
      "begin_line": 1110,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 7)-(line 1112,col 36)",
        "(line 1113,col 7)-(line 1113,col 45)"
      ]
    }
  ]
}