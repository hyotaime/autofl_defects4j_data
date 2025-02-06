{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/Normalize.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Normalize",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 65,
      "end_line": 850,
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
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 48)",
        "(line 90,col 5)-(line 91,col 60)",
        "(line 92,col 5)-(line 98,col 26)",
        "(line 99,col 5)-(line 99,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 43)",
        "(line 105,col 5)-(line 106,col 60)",
        "(line 107,col 5)-(line 109,col 39)",
        "(line 110,col 5)-(line 110,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.reportCodeChange(java.lang.String)",
      "begin_line": 113,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 117,col 5)",
        "(line 118,col 5)-(line 118,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 38)",
        "(line 126,col 5)-(line 130,col 5)",
        "(line 145,col 5)-(line 145,col 47)",
        "(line 146,col 5)-(line 147,col 32)",
        "(line 149,col 5)-(line 149,col 78)",
        "(line 150,col 5)-(line 150,col 66)",
        "(line 151,col 5)-(line 155,col 5)",
        "(line 157,col 5)-(line 159,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindExposeAnnotations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 165,
      "end_line": 187,
      "comment": "\n   * Find all the @expose annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exposedProperties"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.FindExposeAnnotations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 169,col 7)-(line 180,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.FindExposeAnnotations.isMarkedExpose(com.google.javascript.rhino.Node)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 7)-(line 184,col 40)",
        "(line 185,col 7)-(line 185,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteExposedProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 192,
      "end_line": 217,
      "comment": "\n   * Rewrite all exposed properties in [] form.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "exposedProperties"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.RewriteExposedProperties.RewriteExposedProperties(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.RewriteExposedProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 200,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 201,col 7)-(line 215,col 7)"
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
      "begin_line": 222,
      "end_line": 271,
      "comment": "\n   * Propagate constant annotations over the Var graph.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertOnChange"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.PropagateConstantAnnotationsOverVars(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 31)",
        "(line 231,col 7)-(line 231,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 234,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 236,col 7)-(line 236,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.PropagateConstantAnnotationsOverVars.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 239,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 242,col 7)-(line 269,col 7)"
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
      "begin_line": 276,
      "end_line": 348,
      "comment": "\n   * Walk the AST tree and verify that constant names are used consistently.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkUserDeclarations"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.VerifyConstants(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 283,col 7)-(line 283,col 31)",
        "(line 284,col 7)-(line 284,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 287,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 43)",
        "(line 290,col 7)-(line 290,col 53)",
        "(line 291,col 7)-(line 291,col 63)",
        "(line 293,col 7)-(line 294,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "constantMap"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.VerifyConstants.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 299,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 301,col 7)-(line 346,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NormalizeStatements",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 360,
      "end_line": 694,
      "comment": "\n   * Simplify the AST:\n   *   - VAR declarations split, so they represent exactly one child\n   *     declaration.\n   *   - WHILEs are converted to FORs\n   *   - FOR loop are initializers are moved out of the FOR structure\n   *   - LABEL node of children other than LABEL, BLOCK, WHILE, FOR, or DO are\n   *     moved into a block.\n   *   - Add constant annotations based on coding convention.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertOnChange"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.NormalizeStatements(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 365,col 7)-(line 365,col 31)",
        "(line 366,col 7)-(line 366,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.reportCodeChange(java.lang.String)",
      "begin_line": 369,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 370,col 7)-(line 373,col 7)",
        "(line 374,col 7)-(line 374,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 377,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 379,col 7)-(line 379,col 35)",
        "(line 381,col 7)-(line 381,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 384,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 386,col 7)-(line 416,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.annotateConstantsByConvention(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 422,
      "end_line": 452,
      "comment": "\n     * Mark names and properties that are constants by convention.\n     ",
      "child_ranges": [
        "(line 423,col 7)-(line 428,col 30)",
        "(line 433,col 7)-(line 433,col 55)",
        "(line 434,col 7)-(line 436,col 39)",
        "(line 437,col 7)-(line 451,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.normalizeFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Rewrite named unhoisted functions declarations to a known\n     * consistent behavior so we don\u0027t to different logic paths for the same\n     * code. From:\n     *    function f() {}\n     * to:\n     *    var f \u003d function () {};\n     ",
      "child_ranges": [
        "(line 463,col 7)-(line 463,col 47)",
        "(line 464,col 7)-(line 467,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.rewriteFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 486,
      "end_line": 501,
      "comment": "\n     * Rewrite the function declaration from:\n     *   function x() {}\n     *   FUNCTION\n     *     NAME\n     *     LP\n     *     BLOCK\n     * to:\n     *   var x \u003d function() {};\n     *   VAR\n     *     NAME\n     *       FUNCTION\n     *         NAME (w/ empty string)\n     *         LP\n     *         BLOCK\n     ",
      "child_ranges": [
        "(line 488,col 7)-(line 488,col 43)",
        "(line 489,col 7)-(line 489,col 48)",
        "(line 490,col 7)-(line 490,col 46)",
        "(line 493,col 7)-(line 493,col 32)",
        "(line 496,col 7)-(line 496,col 34)",
        "(line 497,col 7)-(line 497,col 34)",
        "(line 498,col 7)-(line 498,col 36)",
        "(line 500,col 7)-(line 500,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.doStatementNormalizations(com.google.javascript.rhino.Node)",
      "begin_line": 506,
      "end_line": 526,
      "comment": "\n     * Do normalizations that introduce new siblings or parents.\n     ",
      "child_ranges": [
        "(line 507,col 7)-(line 509,col 7)",
        "(line 513,col 7)-(line 515,col 7)",
        "(line 519,col 7)-(line 521,col 7)",
        "(line 523,col 7)-(line 525,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.normalizeLabels(com.google.javascript.rhino.Node)",
      "begin_line": 535,
      "end_line": 554,
      "comment": "\n     * Limit the number of special cases where LABELs need to be handled. Only\n     * BLOCK and loops are allowed to be labeled.  Loop labels must remain in\n     * place as the named continues are not allowed for labeled blocks.\n     ",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 47)",
        "(line 538,col 7)-(line 538,col 35)",
        "(line 539,col 7)-(line 553,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.extractForInitializer(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 567,
      "end_line": 614,
      "comment": "\n     * Bring the initializers out of FOR loops.  These need to be placed\n     * before any associated LABEL nodes. This needs to be done from the top\n     * level label first so this is called as a pre-order callback (from\n     * shouldTraverse).\n     *\n     * @param n The node to inspect.\n     * @param before The node to insert the initializer before.\n     * @param beforeParent The parent of the node before which the initializer\n     *     will be inserted.\n     ",
      "child_ranges": [
        "(line 570,col 7)-(line 613,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.splitVarDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 624,
      "end_line": 641,
      "comment": "\n     * Split a var node such as:\n     *   var a, b;\n     * into individual statements:\n     *   var a;\n     *   var b;\n     * @param n The whose children we should inspect.\n     ",
      "child_ranges": [
        "(line 625,col 7)-(line 640,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.moveNamedFunctions(com.google.javascript.rhino.Node)",
      "begin_line": 647,
      "end_line": 679,
      "comment": "\n     * Move all the functions that are valid at the execution of the first\n     * statement of the function to the beginning of the function definition.\n     ",
      "child_ranges": [
        "(line 648,col 7)-(line 649,col 49)",
        "(line 650,col 7)-(line 650,col 27)",
        "(line 651,col 7)-(line 651,col 50)",
        "(line 654,col 7)-(line 657,col 7)",
        "(line 660,col 7)-(line 660,col 34)",
        "(line 661,col 7)-(line 678,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.NormalizeStatements.addToFront(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 686,
      "end_line": 693,
      "comment": "\n     * @param after The child node to insert the newChild after, or null if\n     *     newChild should be added to the front of parent\u0027s child list.\n     * @return The inserted child node.\n     ",
      "child_ranges": [
        "(line 687,col 7)-(line 691,col 7)",
        "(line 692,col 7)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 699,
      "end_line": 705,
      "comment": "\n   * Remove duplicate VAR declarations.\n   ",
      "child_ranges": [
        "(line 700,col 5)-(line 700,col 51)",
        "(line 701,col 5)-(line 702,col 53)",
        "(line 703,col 5)-(line 703,col 73)",
        "(line 704,col 5)-(line 704,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DuplicateDeclarationHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler"
      ],
      "begin_line": 710,
      "end_line": 820,
      "comment": "\n   * ScopeCreator duplicate declaration handler.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "hasOkDuplicateDeclaration"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.DuplicateDeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 719,
      "end_line": 773,
      "comment": "\n     * Remove duplicate VAR declarations encountered discovered during\n     * scope creation.\n     ",
      "child_ranges": [
        "(line 722,col 7)-(line 722,col 43)",
        "(line 723,col 7)-(line 723,col 34)",
        "(line 724,col 7)-(line 724,col 29)",
        "(line 726,col 7)-(line 736,col 7)",
        "(line 739,col 7)-(line 772,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.DuplicateDeclarationHandler.replaceVarWithAssignment(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 791,
      "end_line": 819,
      "comment": "\n     * Remove the parent VAR. There are three cases that need to be handled:\n     *   1) \"var a \u003d b;\" which is replaced with \"a \u003d b\"\n     *   2) \"label:var a;\" which is replaced with \"label:;\". Ideally, the\n     *      label itself would be removed but that is not possible in the\n     *      context in which \"onRedeclaration\" is called.\n     *   3) \"for (var a in b) ...\" which is replaced with \"for (a in b)...\"\n     *      Cases we don\u0027t need to handle are VARs with multiple children,\n     *      which have already been split into separate declarations, so there\n     *      is no need to handle that here, and \"for (var a;;);\", which has\n     *      been moved out of the loop.\n     *      The result of this is that in each case the parent node is replaced\n     *      which is generally dangerous in a traversal but is fine here with\n     *      the scope creator, as the next node of interest is the parent\u0027s\n     *      next sibling.\n     ",
      "child_ranges": [
        "(line 792,col 7)-(line 817,col 7)",
        "(line 818,col 7)-(line 818,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ScopeTicklingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 825,
      "end_line": 849,
      "comment": "\n   * A simple class that causes scope to be created.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 827,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 831,col 7)-(line 831,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 834,
      "end_line": 837,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 839,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 842,col 7)-(line 842,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Normalize.ScopeTicklingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 845,
      "end_line": 848,
      "comment": "",
      "child_ranges": []
    }
  ]
}