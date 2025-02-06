{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineVariables",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 54,
      "end_line": 735,
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
      "end_line": 734,
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
      "end_line": 379,
      "comment": "\n     * Do the actual work of inlining a single declaration into a single\n     * reference.\n     ",
      "child_ranges": [
        "(line 361,col 7)-(line 361,col 43)",
        "(line 362,col 7)-(line 362,col 46)",
        "(line 364,col 7)-(line 364,col 76)",
        "(line 366,col 7)-(line 366,col 58)",
        "(line 367,col 7)-(line 371,col 7)",
        "(line 374,col 7)-(line 378,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineWellDefinedVariable(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 384,
      "end_line": 391,
      "comment": "\n     * Inline an immutable variable into all of its references.\n     ",
      "child_ranges": [
        "(line 386,col 7)-(line 386,col 37)",
        "(line 387,col 7)-(line 389,col 7)",
        "(line 390,col 7)-(line 390,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineDeclaredConstant(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 396,
      "end_line": 410,
      "comment": "\n     * Inline a declared constant.\n     ",
      "child_ranges": [
        "(line 399,col 7)-(line 399,col 28)",
        "(line 401,col 7)-(line 407,col 7)",
        "(line 409,col 7)-(line 409,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.removeDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 415,
      "end_line": 428,
      "comment": "\n     * Remove the given VAR declaration.\n     ",
      "child_ranges": [
        "(line 416,col 7)-(line 416,col 45)",
        "(line 417,col 7)-(line 417,col 54)",
        "(line 419,col 7)-(line 419,col 49)",
        "(line 422,col 7)-(line 425,col 7)",
        "(line 427,col 7)-(line 427,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.inlineValue(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.rhino.Node)",
      "begin_line": 438,
      "end_line": 448,
      "comment": "\n     * Replace the given reference with the given value node.\n     *\n     * @param v The variable that\u0027s referenced.\n     * @param ref The reference to replace.\n     * @param value The node tree to replace it with. This tree should be safe\n     *     to re-parent.\n     ",
      "child_ranges": [
        "(line 439,col 7)-(line 444,col 7)",
        "(line 446,col 7)-(line 446,col 51)",
        "(line 447,col 7)-(line 447,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isInlineableDeclaredConstant(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 454,
      "end_line": 485,
      "comment": "\n     * Determines whether the given variable is declared as a constant\n     * and may be inlined.\n     ",
      "child_ranges": [
        "(line 456,col 7)-(line 458,col 7)",
        "(line 460,col 7)-(line 462,col 7)",
        "(line 464,col 7)-(line 464,col 70)",
        "(line 465,col 7)-(line 467,col 7)",
        "(line 469,col 7)-(line 469,col 43)",
        "(line 470,col 7)-(line 475,col 7)",
        "(line 478,col 7)-(line 480,col 7)",
        "(line 483,col 7)-(line 484,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isStringWorthInlining(com.google.javascript.jscomp.Scope.Var, java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 490,
      "end_line": 513,
      "comment": "\n     * Compute whether the given string is worth inlining.\n     ",
      "child_ranges": [
        "(line 491,col 7)-(line 510,col 7)",
        "(line 512,col 7)-(line 512,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canInline(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 519,
      "end_line": 583,
      "comment": "\n     * @return true if the provided reference and declaration can be safely\n     *         inlined according to our criteria\n     ",
      "child_ranges": [
        "(line 523,col 7)-(line 527,col 7)",
        "(line 532,col 7)-(line 535,col 7)",
        "(line 539,col 7)-(line 542,col 7)",
        "(line 553,col 7)-(line 553,col 53)",
        "(line 554,col 7)-(line 554,col 46)",
        "(line 555,col 7)-(line 559,col 7)",
        "(line 561,col 7)-(line 579,col 7)",
        "(line 581,col 7)-(line 582,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canMoveAggressively(com.google.javascript.rhino.Node)",
      "begin_line": 588,
      "end_line": 593,
      "comment": "\n     * If the value is a literal, we can cross more boundaries to inline it.\n     ",
      "child_ranges": [
        "(line 591,col 7)-(line 592,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.canMoveModerately(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 600,
      "end_line": 632,
      "comment": "\n     * If the value of a variable is not constant, then it may read or modify\n     * state. Therefore it cannot be moved past anything else that may modify\n     * the value being read or read values that are modified.\n     ",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 24)",
        "(line 606,col 7)-(line 622,col 7)",
        "(line 623,col 7)-(line 623,col 44)",
        "(line 624,col 7)-(line 629,col 7)",
        "(line 631,col 7)-(line 631,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidDeclaration(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 637,
      "end_line": 641,
      "comment": "\n     * @return true if the reference is a normal VAR or FUNCTION declaration.\n     ",
      "child_ranges": [
        "(line 638,col 7)-(line 640,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidInitialization(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 646,
      "end_line": 669,
      "comment": "\n     * @return Whether there is a initial value.\n     ",
      "child_ranges": [
        "(line 647,col 7)-(line 661,col 7)",
        "(line 663,col 7)-(line 663,col 49)",
        "(line 664,col 7)-(line 666,col 7)",
        "(line 668,col 7)-(line 668,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isValidReference(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * @return true if the reference is a candidate for inlining\n     ",
      "child_ranges": [
        "(line 675,col 7)-(line 675,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariables.InliningBehavior.isImmutableAndWellDefinedVariable(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 683,
      "end_line": 733,
      "comment": "\n     * Determines whether the reference collection describes a variable that\n     * is initialized to an immutable value, never modified, and defined before\n     * every reference.\n     ",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 50)",
        "(line 686,col 7)-(line 686,col 30)",
        "(line 687,col 7)-(line 687,col 40)",
        "(line 688,col 7)-(line 690,col 7)",
        "(line 692,col 7)-(line 692,col 58)",
        "(line 695,col 7)-(line 723,col 7)",
        "(line 725,col 7)-(line 730,col 7)",
        "(line 732,col 7)-(line 732,col 18)"
      ]
    }
  ]
}