{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FunctionInjector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionInjector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 936,
      "comment": "\n * A set of utility functions that replaces CALL with a specified\n * FUNCTION body, replacing and aliasing function parameters as\n * necessary.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeNameIdSupplier"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowDecomposition"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "knownConstants"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeStrictThis"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeMinimumCapture"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionInjector.FunctionInjector(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e, boolean, boolean, boolean)",
      "begin_line": 52,
      "end_line": 65,
      "comment": "\n   * @param allowDecomposition Whether an effort should be made to break down\n   * expressions into simpler expressions to allow functions to be injected\n   * where they would otherwise be disallowed.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 41)",
        "(line 59,col 5)-(line 59,col 51)",
        "(line 60,col 5)-(line 60,col 29)",
        "(line 61,col 5)-(line 61,col 49)",
        "(line 62,col 5)-(line 62,col 49)",
        "(line 63,col 5)-(line 63,col 45)",
        "(line 64,col 5)-(line 64,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 83,
      "end_line": 93,
      "comment": " Holds a reference to the call node of a function call "
    },
    {
      "type": "field",
      "varNames": [
        "callNode"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionInjector.Reference.Reference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 31)",
        "(line 90,col 7)-(line 90,col 27)",
        "(line 91,col 7)-(line 91,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NAME_COST_ESTIMATE"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n   * In order to estimate the cost of lining, we make the assumption that\n   * Identifiers are reduced 2 characters. For the call arguments, the important\n   * thing is that the cost is assumed to be the same in the call and the\n   * function, so the actual length doesn\u0027t matter in most cases.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "COMMA_COST"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The cost of a argument separator (a comma). "
    },
    {
      "type": "field",
      "varNames": [
        "PAREN_COST"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The cost of the parentheses needed to make a call."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.doesFunctionMeetMinimumRequirements(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 119,
      "end_line": 159,
      "comment": "\n   * @param fnName The name of this function. This either the name of the\n   *  variable to which the function is assigned or the name from the FUNCTION\n   *  node.\n   * @param fnNode The FUNCTION node of the function to inspect.\n   * @return Whether the function node meets the minimum requirements for\n   * inlining.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 50)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 135,col 5)-(line 135,col 70)",
        "(line 136,col 5)-(line 136,col 54)",
        "(line 139,col 5)-(line 140,col 57)",
        "(line 143,col 5)-(line 155,col 6)",
        "(line 157,col 5)-(line 158,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.Anonymous-10cbb489-1e2c-4820-9e98-c30582a19fb2.apply(com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.canInlineReferenceToFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.FunctionInjector.InliningMode, boolean, boolean)",
      "begin_line": 173,
      "end_line": 213,
      "comment": "\n   * @param t  The traversal use to reach the call site.\n   * @param callNode The CALL node.\n   * @param fnNode The function to evaluate for inlining.\n   * @param needAliases A set of function parameter names that can not be\n   *     used without aliasing. Returned by getUnsafeParameterNames().\n   * @param mode Inlining mode to be used.\n   * @param referencesThis Whether fnNode contains references to its this\n   *     object.\n   * @param containsFunctions Whether fnNode contains inner functions.\n   * @return Whether the inlining can occur.\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 182,col 5)",
        "(line 188,col 5)-(line 198,col 5)",
        "(line 201,col 5)-(line 205,col 5)",
        "(line 207,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.isSupportedCallType(com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 235,
      "comment": "\n   * Only \".call\" calls and direct calls to functions are supported.\n   * @param callNode The call evaluate.\n   * @return Whether the call is of a type that is supported.\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 232,col 5)",
        "(line 234,col 5)-(line 234,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.inline(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 240,
      "end_line": 249,
      "comment": "\n   * Inline a function into the call site.\n   ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 74)",
        "(line 244,col 5)-(line 248,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.inlineReturnValue(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 256,
      "end_line": 287,
      "comment": "\n   * Inline a function that fulfills the requirements of\n   * canInlineReferenceDirectly into the call site, replacing only the CALL\n   * node.\n   ",
      "child_ranges": [
        "(line 257,col 5)-(line 257,col 39)",
        "(line 258,col 5)-(line 258,col 47)",
        "(line 265,col 5)-(line 267,col 55)",
        "(line 269,col 5)-(line 269,col 23)",
        "(line 270,col 5)-(line 283,col 5)",
        "(line 285,col 5)-(line 285,col 57)",
        "(line 286,col 5)-(line 286,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 326,
      "end_line": 329,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 360,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 58)",
        "(line 365,col 9)-(line 365,col 72)",
        "(line 366,col 9)-(line 366,col 55)",
        "(line 367,col 9)-(line 367,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 377,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 65)",
        "(line 382,col 9)-(line 382,col 72)",
        "(line 383,col 9)-(line 383,col 55)",
        "(line 384,col 9)-(line 384,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.CallSiteType.prepare(com.google.javascript.jscomp.FunctionInjector, com.google.javascript.rhino.Node)",
      "begin_line": 388,
      "end_line": 388,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.classifyCallSite(com.google.javascript.rhino.Node)",
      "begin_line": 394,
      "end_line": 434,
      "comment": "\n   * Determine which, if any, of the supported types the call site is.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 39)",
        "(line 396,col 5)-(line 396,col 42)",
        "(line 399,col 5)-(line 431,col 5)",
        "(line 433,col 5)-(line 433,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.getDecomposer()",
      "begin_line": 436,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 438,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.maybePrepareCall(com.google.javascript.rhino.Node)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n   * If required, rewrite the statement containing the call expression.\n   * @see ExpressionDecomposer#canExposeExpression\n   ",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 59)",
        "(line 447,col 5)-(line 447,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.inlineFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 455,
      "end_line": 536,
      "comment": "\n   * Inline a function which fulfills the requirements of\n   * canInlineReferenceAsStatementBlock into the call site, replacing the\n   * parent expression.\n   ",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 39)",
        "(line 458,col 5)-(line 458,col 42)",
        "(line 462,col 5)-(line 462,col 59)",
        "(line 463,col 5)-(line 463,col 74)",
        "(line 465,col 5)-(line 465,col 59)",
        "(line 470,col 5)-(line 470,col 29)",
        "(line 471,col 5)-(line 471,col 44)",
        "(line 472,col 5)-(line 496,col 5)",
        "(line 498,col 5)-(line 499,col 43)",
        "(line 501,col 5)-(line 503,col 48)",
        "(line 508,col 5)-(line 508,col 52)",
        "(line 509,col 5)-(line 533,col 5)",
        "(line 535,col 5)-(line 535,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.isDirectCallNodeReplacementPossible(com.google.javascript.rhino.Node)",
      "begin_line": 542,
      "end_line": 560,
      "comment": "\n   * Checks if the given function matches the criteria for an inlinable\n   * function, and if so, adds it to our set of inlinable functions.\n   ",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 50)",
        "(line 548,col 5)-(line 557,col 5)",
        "(line 559,col 5)-(line 559,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.canInlineReferenceAsStatementBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 579,
      "end_line": 603,
      "comment": "\n   * Determines whether a function can be inlined at a particular call site.\n   * There are several criteria that the function and reference must hold in\n   * order for the functions to be inlined:\n   * - It must be a simple call, or assignment, or var initialization.\n   * \u003cpre\u003e\n   *    f();\n   *    a \u003d foo();\n   *    var a \u003d foo();\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 59)",
        "(line 582,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 590,col 5)",
        "(line 592,col 5)-(line 595,col 5)",
        "(line 597,col 5)-(line 602,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.callMeetsBlockInliningRequirements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 610,
      "end_line": 675,
      "comment": "\n   * Determines whether a function can be inlined at a particular call site.\n   * - Don\u0027t inline if the calling function contains an inner function and\n   * inlining would introduce new globals.\n   ",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 67)",
        "(line 625,col 5)-(line 628,col 46)",
        "(line 629,col 5)-(line 629,col 32)",
        "(line 630,col 5)-(line 650,col 5)",
        "(line 652,col 5)-(line 654,col 5)",
        "(line 658,col 5)-(line 672,col 5)",
        "(line 674,col 5)-(line 674,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.Anonymous-d4405d01-f2b1-4c35-bbb1-2ff5aafd6be6.apply(com.google.javascript.rhino.Node)",
      "begin_line": 637,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 639,col 11)-(line 641,col 11)",
        "(line 642,col 11)-(line 644,col 11)",
        "(line 645,col 11)-(line 645,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.canInlineReferenceDirectly(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 689,
      "end_line": 747,
      "comment": "\n   * Determines whether a function can be inlined at a particular call site.\n   * There are several criteria that the function and reference must hold in\n   * order for the functions to be inlined:\n   * 1) If a call\u0027s arguments have side effects,\n   * the corresponding argument in the function must only be referenced once.\n   * For instance, this will not be inlined:\n   * \u003cpre\u003e\n   *     function foo(a) { return a + a }\n   *     x \u003d foo(i++);\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 691,col 5)-(line 693,col 5)",
        "(line 695,col 5)-(line 695,col 39)",
        "(line 698,col 5)-(line 698,col 51)",
        "(line 703,col 5)-(line 714,col 5)",
        "(line 717,col 5)-(line 717,col 74)",
        "(line 718,col 5)-(line 744,col 5)",
        "(line 746,col 5)-(line 746,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.inliningLowersCost(com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node, java.util.Collection\u003c? extends com.google.javascript.jscomp.FunctionInjector.Reference\u003e, java.util.Set\u003cjava.lang.String\u003e, boolean, boolean)",
      "begin_line": 753,
      "end_line": 809,
      "comment": "\n   * Determine if inlining the function is likely to reduce the code size.\n   * @param namesToAlias\n   ",
      "child_ranges": [
        "(line 756,col 5)-(line 756,col 37)",
        "(line 757,col 5)-(line 759,col 5)",
        "(line 761,col 5)-(line 761,col 41)",
        "(line 763,col 5)-(line 763,col 59)",
        "(line 764,col 5)-(line 764,col 58)",
        "(line 766,col 5)-(line 781,col 5)",
        "(line 783,col 5)-(line 784,col 37)",
        "(line 792,col 5)-(line 795,col 5)",
        "(line 797,col 5)-(line 797,col 60)",
        "(line 798,col 5)-(line 798,col 52)",
        "(line 800,col 5)-(line 801,col 51)",
        "(line 802,col 5)-(line 803,col 50)",
        "(line 805,col 5)-(line 808,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.doesLowerCost(com.google.javascript.rhino.Node, int, int, int, int, int, boolean)",
      "begin_line": 814,
      "end_line": 842,
      "comment": "\n   * @return Whether inlining will lower cost.\n   ",
      "child_ranges": [
        "(line 825,col 5)-(line 825,col 77)",
        "(line 827,col 5)-(line 835,col 5)",
        "(line 837,col 5)-(line 838,col 40)",
        "(line 839,col 5)-(line 839,col 61)",
        "(line 841,col 5)-(line 841,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.estimateCallCost(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 849,
      "end_line": 867,
      "comment": "\n   * Gets an estimate of the cost in characters of making the function call:\n   * the sum of the identifiers and the separators.\n   * @param referencesThis\n   ",
      "child_ranges": [
        "(line 850,col 5)-(line 850,col 59)",
        "(line 851,col 5)-(line 851,col 43)",
        "(line 853,col 5)-(line 853,col 51)",
        "(line 854,col 5)-(line 856,col 5)",
        "(line 858,col 5)-(line 864,col 5)",
        "(line 866,col 5)-(line 866,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.inlineCostDelta(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.FunctionInjector.InliningMode)",
      "begin_line": 873,
      "end_line": 924,
      "comment": "\n   * @return The difference between the function definition cost and\n   *     inline cost.\n   ",
      "child_ranges": [
        "(line 877,col 5)-(line 877,col 76)",
        "(line 878,col 5)-(line 878,col 59)",
        "(line 879,col 5)-(line 880,col 69)",
        "(line 882,col 5)-(line 882,col 39)",
        "(line 883,col 5)-(line 886,col 5)",
        "(line 888,col 5)-(line 923,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionInjector.setKnownConstants(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 930,
      "end_line": 935,
      "comment": "\n   * Store the names of known constants to be used when classifying call-sites\n   * in expressions.\n   ",
      "child_ranges": [
        "(line 933,col 5)-(line 933,col 60)",
        "(line 934,col 5)-(line 934,col 41)"
      ]
    }
  ]
}