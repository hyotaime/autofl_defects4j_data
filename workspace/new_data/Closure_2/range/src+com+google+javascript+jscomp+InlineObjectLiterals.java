{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/InlineObjectLiterals.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineObjectLiterals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 48,
      "end_line": 472,
      "comment": "\n * Using the infrastructure provided by {@link ReferenceCollectingCallback},\n * identify variables that are only ever assigned to object literals\n * and that are never used in entirety, and expand the objects into\n * individual variables.\n *\n * Based on the InlineVariables pass\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "VAR_PREFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeNameIdSupplier"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InlineObjectLiterals(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 29)",
        "(line 60,col 5)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 66,col 42)",
        "(line 67,col 5)-(line 67,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InliningBehavior",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior"
      ],
      "begin_line": 75,
      "end_line": 471,
      "comment": "\n   * Builds up information about nodes in each scope. When exiting the\n   * scope, inspects all variables in that scope, and inlines any\n   * that we can.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "staleVars"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * A list of variables that should not be inlined, because their\n     * reference information is out of sync with the state of the AST.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 83,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 85,col 7)-(line 106,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.blacklistVarReferencesInTree(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 115,
      "end_line": 124,
      "comment": "\n     * If there are any variable references in the given node tree,\n     * blacklist them to prevent the pass from trying to inline the\n     * variable. Any code modifications will have potentially made the\n     * ReferenceCollection invalid.\n     ",
      "child_ranges": [
        "(line 116,col 7)-(line 123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.Anonymous-1e0dbb8c-6a0c-4831-b40c-bfc5213544aa.visit(com.google.javascript.rhino.Node)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 11)-(line 121,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isVarInlineForbidden(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 129,
      "end_line": 145,
      "comment": "\n     * Whether the given variable is forbidden from being inlined.\n     ",
      "child_ranges": [
        "(line 140,col 7)-(line 144,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isInlinableObject(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 155,
      "end_line": 256,
      "comment": "\n     * Counts the number of direct (full) references to an object.\n     * Specifically, we check for references of the following type:\n     * \u003cpre\u003e\n     *   x;\n     *   x.fn();\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 26)",
        "(line 157,col 7)-(line 157,col 54)",
        "(line 158,col 7)-(line 254,col 7)",
        "(line 255,col 7)-(line 255,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isVarOrAssignExprLhs(com.google.javascript.rhino.Node)",
      "begin_line": 258,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 34)",
        "(line 260,col 7)-(line 263,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.computeVarList(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 271,
      "end_line": 310,
      "comment": "\n     * Computes a list of ever-referenced keys in the object being\n     * inlined, and returns a mapping of key name -\u003e generated\n     * variable name.\n     ",
      "child_ranges": [
        "(line 273,col 7)-(line 273,col 59)",
        "(line 275,col 7)-(line 307,col 7)",
        "(line 309,col 7)-(line 309,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.fillInitialValues(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e)",
      "begin_line": 317,
      "end_line": 324,
      "comment": "\n     * Populates a map of key names -\u003e initial assigned values. The\n     * object literal these are being pulled from is invalidated as\n     * a result.\n     ",
      "child_ranges": [
        "(line 318,col 7)-(line 318,col 44)",
        "(line 319,col 7)-(line 319,col 53)",
        "(line 320,col 7)-(line 323,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.replaceAssignmentExpression(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 331,
      "end_line": 393,
      "comment": "\n     * Replaces an assignment like x \u003d {...} with t1\u003da,t2\u003db,t3\u003dc,true.\n     * Note that the resulting expression will always evaluate to\n     * true, as would the x \u003d {...} expression.\n     ",
      "child_ranges": [
        "(line 334,col 7)-(line 334,col 46)",
        "(line 335,col 7)-(line 335,col 40)",
        "(line 336,col 7)-(line 336,col 49)",
        "(line 337,col 7)-(line 337,col 50)",
        "(line 338,col 7)-(line 338,col 63)",
        "(line 339,col 7)-(line 349,col 7)",
        "(line 352,col 7)-(line 357,col 7)",
        "(line 359,col 7)-(line 359,col 23)",
        "(line 360,col 7)-(line 382,col 7)",
        "(line 384,col 7)-(line 384,col 37)",
        "(line 385,col 7)-(line 385,col 54)",
        "(line 387,col 7)-(line 392,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.splitObject(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 399,
      "end_line": 470,
      "comment": "\n     * Splits up the object literal into individual variables, and\n     * updates all uses.\n     ",
      "child_ranges": [
        "(line 404,col 7)-(line 404,col 68)",
        "(line 406,col 7)-(line 406,col 53)",
        "(line 410,col 7)-(line 410,col 17)",
        "(line 411,col 7)-(line 412,col 35)",
        "(line 413,col 7)-(line 420,col 7)",
        "(line 422,col 7)-(line 432,col 7)",
        "(line 434,col 7)-(line 436,col 7)",
        "(line 438,col 7)-(line 467,col 7)",
        "(line 469,col 7)-(line 469,col 34)"
      ]
    }
  ]
}