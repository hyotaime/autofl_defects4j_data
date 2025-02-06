{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/InlineObjectLiterals.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineObjectLiterals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 471,
      "comment": "\n * Using the infrastructure provided by {@link ReferenceCollectingCallback},\n * identify variables that are only ever assigned to object literals\n * and that are never used in entirety, and expand the objects into\n * individual variables.\n *\n * Based on the InlineVariables pass\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "VAR_PREFIX"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "safeNameIdSupplier"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InlineObjectLiterals(com.google.javascript.jscomp.AbstractCompiler, com.google.common.base.Supplier\u003cjava.lang.String\u003e)",
      "begin_line": 55,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 29)",
        "(line 59,col 5)-(line 59,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 65,col 42)",
        "(line 66,col 5)-(line 66,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InliningBehavior",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior"
      ],
      "begin_line": 74,
      "end_line": 470,
      "comment": "\n   * Builds up information about nodes in each scope. When exiting the\n   * scope, inspects all variables in that scope, and inlines any\n   * that we can.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "staleVars"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * A list of variables that should not be inlined, because their\n     * reference information is out of sync with the state of the AST.\n     "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.afterExitScope(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)",
      "begin_line": 82,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 84,col 7)-(line 104,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.blacklistVarReferencesInTree(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * If there are any variable references in the given node tree,\n     * blacklist them to prevent the pass from trying to inline the\n     * variable. Any code modifications will have potentially made the\n     * ReferenceCollection invalid.\n     ",
      "child_ranges": [
        "(line 114,col 7)-(line 121,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.Anonymous-6586703c-8ed0-4eca-8cbc-b43c509b5d75.visit(com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 11)-(line 119,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isVarInlineForbidden(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 127,
      "end_line": 143,
      "comment": "\n     * Whether the given variable is forbidden from being inlined.\n     ",
      "child_ranges": [
        "(line 138,col 7)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isInlinableObject(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e)",
      "begin_line": 153,
      "end_line": 254,
      "comment": "\n     * Counts the number of direct (full) references to an object.\n     * Specifically, we check for references of the following type:\n     * \u003cpre\u003e\n     *   x;\n     *   x.fn();\n     * \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 26)",
        "(line 155,col 7)-(line 155,col 54)",
        "(line 156,col 7)-(line 252,col 7)",
        "(line 253,col 7)-(line 253,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.isVarOrAssignExprLhs(com.google.javascript.rhino.Node)",
      "begin_line": 256,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 34)",
        "(line 258,col 7)-(line 261,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.computeVarList(com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 269,
      "end_line": 308,
      "comment": "\n     * Computes a list of ever-referenced keys in the object being\n     * inlined, and returns a mapping of key name -\u003e generated\n     * variable name.\n     ",
      "child_ranges": [
        "(line 271,col 7)-(line 271,col 59)",
        "(line 273,col 7)-(line 305,col 7)",
        "(line 307,col 7)-(line 307,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.fillInitialValues(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e)",
      "begin_line": 315,
      "end_line": 322,
      "comment": "\n     * Populates a map of key names -\u003e initial assigned values. The\n     * object literal these are being pulled from is invalidated as\n     * a result.\n     ",
      "child_ranges": [
        "(line 316,col 7)-(line 316,col 44)",
        "(line 317,col 7)-(line 317,col 53)",
        "(line 318,col 7)-(line 321,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.replaceAssignmentExpression(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 329,
      "end_line": 391,
      "comment": "\n     * Replaces an assignment like x \u003d {...} with t1\u003da,t2\u003db,t3\u003dc,true.\n     * Note that the resulting expression will always evaluate to\n     * true, as would the x \u003d {...} expression.\n     ",
      "child_ranges": [
        "(line 332,col 7)-(line 332,col 46)",
        "(line 333,col 7)-(line 333,col 40)",
        "(line 334,col 7)-(line 334,col 49)",
        "(line 335,col 7)-(line 335,col 50)",
        "(line 336,col 7)-(line 336,col 63)",
        "(line 337,col 7)-(line 347,col 7)",
        "(line 350,col 7)-(line 355,col 7)",
        "(line 357,col 7)-(line 357,col 23)",
        "(line 358,col 7)-(line 380,col 7)",
        "(line 382,col 7)-(line 382,col 37)",
        "(line 383,col 7)-(line 383,col 54)",
        "(line 385,col 7)-(line 390,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineObjectLiterals.InliningBehavior.splitObject(com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.Reference, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 397,
      "end_line": 469,
      "comment": "\n     * Splits up the object literal into individual variables, and\n     * updates all uses.\n     ",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 65)",
        "(line 403,col 7)-(line 403,col 53)",
        "(line 407,col 7)-(line 407,col 17)",
        "(line 408,col 7)-(line 409,col 35)",
        "(line 410,col 7)-(line 417,col 7)",
        "(line 419,col 7)-(line 430,col 7)",
        "(line 432,col 7)-(line 434,col 7)",
        "(line 436,col 7)-(line 468,col 7)"
      ]
    }
  ]
}