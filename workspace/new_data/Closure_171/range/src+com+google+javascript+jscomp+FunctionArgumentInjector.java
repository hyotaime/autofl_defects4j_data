{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FunctionArgumentInjector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionArgumentInjector",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 503,
      "comment": "\n * A nifty set of functions to deal with the issues of replacing function\n * parameters with a set of call argument expressions.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "THIS_MARKER"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " identifier can be used, so we use \"this\"."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.FunctionArgumentInjector()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.inject(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n   * With the map provided, replace the names with expression trees.\n   * @param node The root of the node tree within which to perform the\n   *     substitutions.\n   * @param parent The parent root node.\n   * @param replacements The map of names to template node trees with which\n   *     to replace the name Nodes.\n   * @returns The root node or its replacement.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.inject(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e, boolean)",
      "begin_line": 61,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 98,col 5)",
        "(line 100,col 5)-(line 104,col 5)",
        "(line 106,col 5)-(line 106,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionCallParameterMap(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 112,
      "end_line": 149,
      "comment": "\n   * Get a mapping for function parameter names to call arguments.\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 65)",
        "(line 119,col 5)-(line 119,col 51)",
        "(line 120,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 137,col 5)",
        "(line 141,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 148,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.getUniqueAnonymousParameterName(com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n   * Parameter names will be name unique when at a later time.\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n   * Retrieve a set of names that can not be safely substituted in place.\n   * Example:\n   *   function(a) {\n   *     a \u003d 0;\n   *   }\n   * Inlining this without taking precautions would cause the call site value\n   * to be modified (bad).\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 56)",
        "(line 170,col 5)-(line 170,col 48)",
        "(line 171,col 5)-(line 172,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, boolean)",
      "begin_line": 194,
      "end_line": 218,
      "comment": "\n   * Check for uses of the named value that imply a pass-by-value\n   * parameter is expected.  This is used to prevent cases like:\n   *\n   *   function (x) {\n   *     x\u003d2;\n   *     return x;\n   *   }\n   *\n   * We don\u0027t want \"undefined\" to be substituted for \"x\", and get\n   *   undefined\u003d2\n   *\n   * @param n The node in question.\n   * @param parent The parent of the node.\n   * @param names The set of names to check.\n   * @param unsafe The set of names that require aliases.\n   * @param inInnerFunction Whether the inspection is occurring on a inner\n   *     function.\n   ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 48)",
        "(line 198,col 5)-(line 211,col 5)",
        "(line 213,col 5)-(line 215,col 5)",
        "(line 217,col 5)-(line 217,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.canNameValueChange(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\n   * This is similar to NodeUtil.isLValue except that object properties and\n   * array member modification aren\u0027t important (\"o\" in \"o.a \u003d 2\" is still \"o\"\n   * after assignment, where in as \"o \u003d x\", \"o\" is now \"x\").\n   *\n   * This also looks for the redefinition of a name.\n   *   function (x){var x;}\n   *\n   * @param n The NAME node in question.\n   * @param parent The parent of the node.\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 32)",
        "(line 233,col 5)-(line 235,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.maybeAddTempsForCallArguments(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e, java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 245,
      "end_line": 314,
      "comment": "\n   * Updates the set of parameter names in set unsafe to include any\n   * arguments from the call site that require aliases.\n   * @param fnNode The FUNCTION node to be inlined.\n   * @param argMap The argument list for the call to fnNode.\n   * @param namesNeedingTemps The set of names to update.\n   ",
      "child_ranges": [
        "(line 248,col 5)-(line 251,col 5)",
        "(line 253,col 5)-(line 253,col 53)",
        "(line 254,col 5)-(line 254,col 39)",
        "(line 256,col 5)-(line 256,col 45)",
        "(line 260,col 5)-(line 261,col 27)",
        "(line 264,col 5)-(line 313,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.findParametersReferencedAfterSideEffect(java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 325,
      "end_line": 339,
      "comment": "\n   * Boot strap a traversal to look for parameters referenced\n   * after a non-local side-effect.\n   * NOTE: This assumes no-inner functions.\n   * @param parameters The set of parameter names.\n   * @param root The function code block.\n   * @return The subset of parameters referenced after the first\n   *     seen non-local side-effect.\n   ",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 53)",
        "(line 330,col 5)-(line 330,col 35)",
        "(line 332,col 5)-(line 333,col 28)",
        "(line 334,col 5)-(line 337,col 19)",
        "(line 338,col 5)-(line 338,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReferencedAfterSideEffect",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeUtil.Visitor",
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 361,
      "end_line": 467,
      "comment": "\n   * Collect parameter names referenced after a non-local side-effect.\n   *\n   * Assumptions:\n   * - We assume parameters are not modified in the function body\n   * (that is checked separately).\n   * - There are no inner functions (also checked separately).\n   *\n   * As we are trying to replace parameters with there passed in values\n   * we are interested in anything that may affect those value.  So, ignoring\n   * changes to local variables, we look for things that may affect anything\n   * outside the local-state.  Once such a side-effect is seen any following\n   * reference to the function parameters are collected.  These will need\n   * to be assigned to temporaries to prevent changes to their value as would\n   * have happened during the function call.\n   *\n   * To properly handle loop structures all references to the function\n   * parameters are recorded and the decision to keep or throw away those\n   * references is deferred until exiting the loop structure.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "locals"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sideEffectSeen"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersReferenced"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loopsEntered"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.ReferencedAfterSideEffect(java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 7)-(line 370,col 35)",
        "(line 371,col 7)-(line 371,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.getResults()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 7)-(line 375,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.apply(com.google.javascript.rhino.Node)",
      "begin_line": 378,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 381,col 7)-(line 383,col 7)",
        "(line 387,col 7)-(line 388,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.inLoop()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 392,col 7)-(line 392,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.visit(com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 398,col 7)-(line 406,col 7)",
        "(line 408,col 7)-(line 413,col 7)",
        "(line 417,col 7)-(line 427,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.hasNonLocalSideEffect(com.google.javascript.rhino.Node)",
      "begin_line": 433,
      "end_line": 455,
      "comment": "\n     * @return Whether the node may have non-local side-effects.\n     ",
      "child_ranges": [
        "(line 434,col 7)-(line 434,col 33)",
        "(line 435,col 7)-(line 435,col 29)",
        "(line 438,col 7)-(line 452,col 7)",
        "(line 454,col 7)-(line 454,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.ReferencedAfterSideEffect.isLocalName(com.google.javascript.rhino.Node)",
      "begin_line": 460,
      "end_line": 466,
      "comment": "\n     * @return Whether node is a reference to locally declared name.\n     ",
      "child_ranges": [
        "(line 461,col 7)-(line 464,col 7)",
        "(line 465,col 7)-(line 465,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.gatherLocalNames(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 472,
      "end_line": 490,
      "comment": "\n   * Gather any names declared in the local scope.\n   ",
      "child_ranges": [
        "(line 473,col 5)-(line 485,col 5)",
        "(line 487,col 5)-(line 489,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionParameterSet(com.google.javascript.rhino.Node)",
      "begin_line": 495,
      "end_line": 501,
      "comment": "\n   * Get a set of function parameter names.\n   ",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 40)",
        "(line 497,col 5)-(line 499,col 5)",
        "(line 500,col 5)-(line 500,col 15)"
      ]
    }
  ]
}