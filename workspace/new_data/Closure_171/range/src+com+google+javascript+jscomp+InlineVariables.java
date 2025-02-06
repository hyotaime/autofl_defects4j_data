{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InlineVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineVariables",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 54,
      "end_line": 729,
      "comment": "\n * Using the infrastructure provided by VariableReferencePass, identify\n * variables that are used only once and in a way that is safe to move, and then\n * inline them.\n *\n * This pass has two \"modes.\" One mode only inlines variables declared as\n * constants, for legacy compiler clients. The second mode inlines any\n * variable that we can provably inline. Note that the second mode is a\n * superset of the first mode. We only support the first mode for\n * backwards-compatibility with compiler clients that don\u0027t want\n * --inline_variables.\n *\n * The approach of this pass is similar to {@link CrossModuleCodeMotion}\n *\n * @author kushal@google.com (Kushal Dave)\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineAllStrings"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Inlines all strings, even if they increase the size of the gzipped binary."
    },
    {
      "type": "field",
      "varNames": [
        "identifyConstants"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineVariables.InlineVariables(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.InlineVariables.Mode, boolean)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 29)",
        "(line 78,col 5)-(line 78,col 21)",
        "(line 79,col 5)-(line 79,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 85,col 62)",
        "(line 86,col 5)-(line 86,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.getFilterForMode()",
      "begin_line": 89,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentifyConstants",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.Scope.Var\u003e"
      ],
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n   * Filters variables declared as \"constant\", and declares them in the outer\n   * declaredConstants map.\n   *\n   * In Google coding conventions, this means anything declared with @const\n   * or named in all caps, and initialized to an immutable value.\n   * CheckConsts has already verified that these are truly constants.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.IdentifyConstants.apply(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IdentifyLocals",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.Scope.Var\u003e"
      ],
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n   * Filters non-global variables.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.IdentifyLocals.apply(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasCandidate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 127,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "alias"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "refInfo"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineVariables.AliasCandidate.AliasCandidate(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 132,col 25)",
        "(line 133,col 7)-(line 133,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InliningBehavior",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior"
      ],
      "begin_line": 142,
      "end_line": 728,
      "comment": "\n   * Builds up information about nodes in each scope. When exiting the\n   * scope, inspects all variables in that scope, and inlines any\n   * that we can.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "staleVars"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * A list of variables that should not be inlined, because their\n     * reference information is out of sync with the state of the AST.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aliasCandidates"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Stored possible aliases of variables that never change, with\n     * all the reference info about those variables. Hashed by the NAME\n     * node of the variable being aliased.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 46)",
        "(line 160,col 7)-(line 160,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.collectAliasCandidates(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 167,
      "end_line": 188,
      "comment": "\n     * If any of the variables are well-defined and alias other variables,\n     * mark them as aliasing candidates.\n     ",
      "child_ranges": [
        "(line 169,col 7)-(line 187,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.doInlinesForScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 194,
      "end_line": 222,
      "comment": "\n     * For all variables in this scope, see if they are only used once.\n     * If it looks safe to do so, inline them.\n     ",
      "child_ranges": [
        "(line 196,col 7)-(line 197,col 70)",
        "(line 198,col 7)-(line 221,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.maybeEscapedOrModifiedArguments(com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 224,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 226,col 7)-(line 242,col 7)",
        "(line 243,col 7)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isLValue(com.google.javascript.rhino.Node)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 247,col 7)-(line 247,col 34)",
        "(line 248,col 7)-(line 251,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineNonConstants(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection, boolean)",
      "begin_line": 254,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 53)",
        "(line 258,col 7)-(line 258,col 62)",
        "(line 259,col 7)-(line 259,col 64)",
        "(line 260,col 7)-(line 260,col 60)",
        "(line 262,col 7)-(line 295,col 7)",
        "(line 301,col 7)-(line 322,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.blacklistVarReferencesInTree(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\n     * If there are any variable references in the given node tree, blacklist\n     * them to prevent the pass from trying to inline the variable.\n     ",
      "child_ranges": [
        "(line 330,col 7)-(line 332,col 7)",
        "(line 334,col 7)-(line 336,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isVarInlineForbidden(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 342,
      "end_line": 353,
      "comment": "\n     * Whether the given variable is forbidden from being inlined.\n     ",
      "child_ranges": [
        "(line 349,col 7)-(line 352,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inline(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 359,
      "end_line": 376,
      "comment": "\n     * Do the actual work of inlining a single declaration into a single\n     * reference.\n     ",
      "child_ranges": [
        "(line 360,col 7)-(line 360,col 43)",
        "(line 361,col 7)-(line 361,col 46)",
        "(line 363,col 7)-(line 363,col 76)",
        "(line 364,col 7)-(line 364,col 59)",
        "(line 365,col 7)-(line 365,col 52)",
        "(line 366,col 7)-(line 370,col 7)",
        "(line 372,col 7)-(line 375,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineWellDefinedVariable(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 381,
      "end_line": 388,
      "comment": "\n     * Inline an immutable variable into all of its references.\n     ",
      "child_ranges": [
        "(line 383,col 7)-(line 383,col 37)",
        "(line 384,col 7)-(line 386,col 7)",
        "(line 387,col 7)-(line 387,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineDeclaredConstant(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 393,
      "end_line": 407,
      "comment": "\n     * Inline a declared constant.\n     ",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 28)",
        "(line 398,col 7)-(line 404,col 7)",
        "(line 406,col 7)-(line 406,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.removeDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 412,
      "end_line": 423,
      "comment": "\n     * Remove the given VAR declaration.\n     ",
      "child_ranges": [
        "(line 413,col 7)-(line 413,col 38)",
        "(line 414,col 7)-(line 414,col 47)",
        "(line 416,col 7)-(line 416,col 60)",
        "(line 417,col 7)-(line 417,col 42)",
        "(line 419,col 7)-(line 422,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineValue(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.rhino.Node)",
      "begin_line": 433,
      "end_line": 442,
      "comment": "\n     * Replace the given reference with the given value node.\n     *\n     * @param v The variable that\u0027s referenced.\n     * @param ref The reference to replace.\n     * @param value The node tree to replace it with. This tree should be safe\n     *     to re-parent.\n     ",
      "child_ranges": [
        "(line 434,col 7)-(line 434,col 59)",
        "(line 435,col 7)-(line 440,col 7)",
        "(line 441,col 7)-(line 441,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isInlineableDeclaredConstant(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 448,
      "end_line": 479,
      "comment": "\n     * Determines whether the given variable is declared as a constant\n     * and may be inlined.\n     ",
      "child_ranges": [
        "(line 450,col 7)-(line 452,col 7)",
        "(line 454,col 7)-(line 456,col 7)",
        "(line 458,col 7)-(line 458,col 70)",
        "(line 459,col 7)-(line 461,col 7)",
        "(line 463,col 7)-(line 463,col 43)",
        "(line 464,col 7)-(line 469,col 7)",
        "(line 472,col 7)-(line 474,col 7)",
        "(line 477,col 7)-(line 478,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isStringWorthInlining(com.google.javascript.jscomp.Scope.Var, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 484,
      "end_line": 507,
      "comment": "\n     * Compute whether the given string is worth inlining.\n     ",
      "child_ranges": [
        "(line 485,col 7)-(line 504,col 7)",
        "(line 506,col 7)-(line 506,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canInline(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 513,
      "end_line": 577,
      "comment": "\n     * @return true if the provided reference and declaration can be safely\n     *         inlined according to our criteria\n     ",
      "child_ranges": [
        "(line 517,col 7)-(line 521,col 7)",
        "(line 526,col 7)-(line 529,col 7)",
        "(line 533,col 7)-(line 536,col 7)",
        "(line 547,col 7)-(line 547,col 53)",
        "(line 548,col 7)-(line 548,col 46)",
        "(line 549,col 7)-(line 553,col 7)",
        "(line 555,col 7)-(line 573,col 7)",
        "(line 575,col 7)-(line 576,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canMoveAggressively(com.google.javascript.rhino.Node)",
      "begin_line": 582,
      "end_line": 587,
      "comment": "\n     * If the value is a literal, we can cross more boundaries to inline it.\n     ",
      "child_ranges": [
        "(line 585,col 7)-(line 586,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canMoveModerately(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 594,
      "end_line": 626,
      "comment": "\n     * If the value of a variable is not constant, then it may read or modify\n     * state. Therefore it cannot be moved past anything else that may modify\n     * the value being read or read values that are modified.\n     ",
      "child_ranges": [
        "(line 599,col 7)-(line 599,col 24)",
        "(line 600,col 7)-(line 616,col 7)",
        "(line 617,col 7)-(line 617,col 44)",
        "(line 618,col 7)-(line 623,col 7)",
        "(line 625,col 7)-(line 625,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 631,
      "end_line": 635,
      "comment": "\n     * @return true if the reference is a normal VAR or FUNCTION declaration.\n     ",
      "child_ranges": [
        "(line 632,col 7)-(line 634,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidInitialization(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 640,
      "end_line": 663,
      "comment": "\n     * @return Whether there is a initial value.\n     ",
      "child_ranges": [
        "(line 641,col 7)-(line 655,col 7)",
        "(line 657,col 7)-(line 657,col 49)",
        "(line 658,col 7)-(line 660,col 7)",
        "(line 662,col 7)-(line 662,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidReference(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 668,
      "end_line": 670,
      "comment": "\n     * @return true if the reference is a candidate for inlining\n     ",
      "child_ranges": [
        "(line 669,col 7)-(line 669,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isImmutableAndWellDefinedVariable(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 677,
      "end_line": 727,
      "comment": "\n     * Determines whether the reference collection describes a variable that\n     * is initialized to an immutable value, never modified, and defined before\n     * every reference.\n     ",
      "child_ranges": [
        "(line 679,col 7)-(line 679,col 50)",
        "(line 680,col 7)-(line 680,col 30)",
        "(line 681,col 7)-(line 681,col 40)",
        "(line 682,col 7)-(line 684,col 7)",
        "(line 686,col 7)-(line 686,col 58)",
        "(line 689,col 7)-(line 717,col 7)",
        "(line 719,col 7)-(line 724,col 7)",
        "(line 726,col 7)-(line 726,col 18)"
      ]
    }
  ]
}