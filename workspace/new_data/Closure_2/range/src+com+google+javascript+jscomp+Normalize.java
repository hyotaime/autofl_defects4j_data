{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/Normalize.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Normalize",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 65,
      "end_line": 847,
      "comment": " public for ReplaceDebugStringsTest"
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertOnChange"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONVERT_WHILE_TO_FOR"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAKE_LOCAL_NAMES_UNIQUE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CATCH_BLOCK_VAR_ERROR"
      ],
      "begin_line": 72,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.Normalize(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 29)",
        "(line 81,col 5)-(line 81,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 87,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 48)",
        "(line 90,col 5)-(line 91,col 60)",
        "(line 92,col 5)-(line 97,col 26)",
        "(line 98,col 5)-(line 98,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 101,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 43)",
        "(line 104,col 5)-(line 105,col 60)",
        "(line 106,col 5)-(line 108,col 39)",
        "(line 109,col 5)-(line 109,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.reportCodeChange(java.lang.String)",
      "begin_line": 112,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 116,col 5)",
        "(line 117,col 5)-(line 117,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 124,col 38)",
        "(line 125,col 5)-(line 129,col 5)",
        "(line 144,col 5)-(line 144,col 47)",
        "(line 145,col 5)-(line 146,col 32)",
        "(line 148,col 5)-(line 148,col 78)",
        "(line 149,col 5)-(line 149,col 66)",
        "(line 150,col 5)-(line 154,col 5)",
        "(line 156,col 5)-(line 158,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindExposeAnnotations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 164,
      "end_line": 183,
      "comment": "\n   * Find all the @expose annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exposedProperties"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.FindExposeAnnotations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 176,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.FindExposeAnnotations.isMarkedExpose(com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 180,col 7)-(line 180,col 40)",
        "(line 181,col 7)-(line 181,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteExposedProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 188,
      "end_line": 213,
      "comment": "\n   * Rewrite all exposed properties in [] form.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exposedProperties"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.RewriteExposedProperties.RewriteExposedProperties(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 7)-(line 193,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.RewriteExposedProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 196,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 211,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropagateConstantAnnotationsOverVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 218,
      "end_line": 267,
      "comment": "\n   * Propagate constant annotations over the Var graph.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertOnChange"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.PropagateConstantAnnotationsOverVars(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 224,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 226,col 7)-(line 226,col 31)",
        "(line 227,col 7)-(line 227,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 7)-(line 232,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 235,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 265,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VerifyConstants",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 272,
      "end_line": 344,
      "comment": "\n   * Walk the AST tree and verify that constant names are used consistently.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkUserDeclarations"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.VerifyConstants(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 31)",
        "(line 280,col 7)-(line 280,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 283,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 43)",
        "(line 286,col 7)-(line 286,col 53)",
        "(line 287,col 7)-(line 287,col 63)",
        "(line 289,col 7)-(line 290,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "constantMap"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 295,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 297,col 7)-(line 342,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NormalizeStatements",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 356,
      "end_line": 691,
      "comment": "\n   * Simplify the AST:\n   *   - VAR declarations split, so they represent exactly one child\n   *     declaration.\n   *   - WHILEs are converted to FORs\n   *   - FOR loop are initializers are moved out of the FOR structure\n   *   - LABEL node of children other than LABEL, BLOCK, WHILE, FOR, or DO are\n   *     moved into a block.\n   *   - Add constant annotations based on coding convention.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertOnChange"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.NormalizeStatements(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 7)-(line 361,col 31)",
        "(line 362,col 7)-(line 362,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.reportCodeChange(java.lang.String)",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 366,col 7)-(line 369,col 7)",
        "(line 370,col 7)-(line 370,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 373,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 375,col 7)-(line 375,col 46)",
        "(line 377,col 7)-(line 377,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 380,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 382,col 7)-(line 412,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.annotateConstantsByConvention(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 418,
      "end_line": 448,
      "comment": "\n     * Mark names and properties that are constants by convention.\n     ",
      "child_ranges": [
        "(line 419,col 7)-(line 424,col 30)",
        "(line 429,col 7)-(line 429,col 63)",
        "(line 430,col 7)-(line 432,col 39)",
        "(line 433,col 7)-(line 447,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.normalizeFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 458,
      "end_line": 464,
      "comment": "\n     * Rewrite named unhoisted functions declarations to a known\n     * consistent behavior so we don\u0027t to different logic paths for the same\n     * code. From:\n     *    function f() {}\n     * to:\n     *    var f \u003d function () {};\n     ",
      "child_ranges": [
        "(line 459,col 7)-(line 459,col 47)",
        "(line 460,col 7)-(line 463,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.rewriteFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 482,
      "end_line": 497,
      "comment": "\n     * Rewrite the function declaration from:\n     *   function x() {}\n     *   FUNCTION\n     *     NAME\n     *     LP\n     *     BLOCK\n     * to:\n     *   var x \u003d function() {};\n     *   VAR\n     *     NAME\n     *       FUNCTION\n     *         NAME (w/ empty string)\n     *         LP\n     *         BLOCK\n     ",
      "child_ranges": [
        "(line 484,col 7)-(line 484,col 43)",
        "(line 485,col 7)-(line 485,col 48)",
        "(line 486,col 7)-(line 486,col 46)",
        "(line 489,col 7)-(line 489,col 32)",
        "(line 492,col 7)-(line 492,col 34)",
        "(line 493,col 7)-(line 493,col 34)",
        "(line 494,col 7)-(line 494,col 36)",
        "(line 496,col 7)-(line 496,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.doStatementNormalizations(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 502,
      "end_line": 523,
      "comment": "\n     * Do normalizations that introduce new siblings or parents.\n     ",
      "child_ranges": [
        "(line 504,col 7)-(line 506,col 7)",
        "(line 510,col 7)-(line 512,col 7)",
        "(line 516,col 7)-(line 518,col 7)",
        "(line 520,col 7)-(line 522,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.normalizeLabels(com.google.javascript.rhino.Node)",
      "begin_line": 532,
      "end_line": 551,
      "comment": "\n     * Limit the number of special cases where LABELs need to be handled. Only\n     * BLOCK and loops are allowed to be labeled.  Loop labels must remain in\n     * place as the named continues are not allowed for labeled blocks.\n     ",
      "child_ranges": [
        "(line 533,col 7)-(line 533,col 47)",
        "(line 535,col 7)-(line 535,col 35)",
        "(line 536,col 7)-(line 550,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 564,
      "end_line": 611,
      "comment": "\n     * Bring the initializers out of FOR loops.  These need to be placed\n     * before any associated LABEL nodes. This needs to be done from the top\n     * level label first so this is called as a pre-order callback (from\n     * shouldTraverse).\n     *\n     * @param n The node to inspect.\n     * @param before The node to insert the initializer before.\n     * @param beforeParent The parent of the node before which the initializer\n     *     will be inserted.\n     ",
      "child_ranges": [
        "(line 567,col 7)-(line 610,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.splitVarDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 621,
      "end_line": 638,
      "comment": "\n     * Split a var node such as:\n     *   var a, b;\n     * into individual statements:\n     *   var a;\n     *   var b;\n     * @param n The whose children we should inspect.\n     ",
      "child_ranges": [
        "(line 622,col 7)-(line 637,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.moveNamedFunctions(com.google.javascript.rhino.Node)",
      "begin_line": 644,
      "end_line": 676,
      "comment": "\n     * Move all the functions that are valid at the execution of the first\n     * statement of the function to the beginning of the function definition.\n     ",
      "child_ranges": [
        "(line 645,col 7)-(line 646,col 49)",
        "(line 647,col 7)-(line 647,col 27)",
        "(line 648,col 7)-(line 648,col 50)",
        "(line 651,col 7)-(line 654,col 7)",
        "(line 657,col 7)-(line 657,col 34)",
        "(line 658,col 7)-(line 675,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.addToFront(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 683,
      "end_line": 690,
      "comment": "\n     * @param after The child node to insert the newChild after, or null if\n     *     newChild should be added to the front of parent\u0027s child list.\n     * @return The inserted child node.\n     ",
      "child_ranges": [
        "(line 684,col 7)-(line 688,col 7)",
        "(line 689,col 7)-(line 689,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 696,
      "end_line": 702,
      "comment": "\n   * Remove duplicate VAR declarations.\n   ",
      "child_ranges": [
        "(line 697,col 5)-(line 697,col 51)",
        "(line 698,col 5)-(line 699,col 53)",
        "(line 700,col 5)-(line 700,col 73)",
        "(line 701,col 5)-(line 701,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DuplicateDeclarationHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler"
      ],
      "begin_line": 707,
      "end_line": 817,
      "comment": "\n   * ScopeCreator duplicate declaration handler.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "hasOkDuplicateDeclaration"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.DuplicateDeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 716,
      "end_line": 770,
      "comment": "\n     * Remove duplicate VAR declarations encountered discovered during\n     * scope creation.\n     ",
      "child_ranges": [
        "(line 719,col 7)-(line 719,col 43)",
        "(line 720,col 7)-(line 720,col 34)",
        "(line 721,col 7)-(line 721,col 29)",
        "(line 723,col 7)-(line 733,col 7)",
        "(line 736,col 7)-(line 769,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.DuplicateDeclarationHandler.replaceVarWithAssignment(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 788,
      "end_line": 816,
      "comment": "\n     * Remove the parent VAR. There are three cases that need to be handled:\n     *   1) \"var a \u003d b;\" which is replaced with \"a \u003d b\"\n     *   2) \"label:var a;\" which is replaced with \"label:;\". Ideally, the\n     *      label itself would be removed but that is not possible in the\n     *      context in which \"onRedeclaration\" is called.\n     *   3) \"for (var a in b) ...\" which is replaced with \"for (a in b)...\"\n     *      Cases we don\u0027t need to handle are VARs with multiple children,\n     *      which have already been split into separate declarations, so there\n     *      is no need to handle that here, and \"for (var a;;);\", which has\n     *      been moved out of the loop.\n     *      The result of this is that in each case the parent node is replaced\n     *      which is generally dangerous in a traversal but is fine here with\n     *      the scope creator, as the next node of interest is the parent\u0027s\n     *      next sibling.\n     ",
      "child_ranges": [
        "(line 789,col 7)-(line 814,col 7)",
        "(line 815,col 7)-(line 815,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ScopeTicklingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 822,
      "end_line": 846,
      "comment": "\n   * A simple class that causes scope to be created.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 824,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 828,col 7)-(line 828,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 831,
      "end_line": 834,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 836,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 839,col 7)-(line 839,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 842,
      "end_line": 845,
      "comment": "",
      "child_ranges": []
    }
  ]
}