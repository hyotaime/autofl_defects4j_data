{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessClosurePrimitives",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 42,
      "end_line": 1124,
      "comment": "\n * Replaces goog.provide calls, removes goog.require calls, verifies that\n * goog.require has a corresponding goog.provide and some closure specific\n * simplifications.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NULL_ARGUMENT_ERROR"
      ],
      "begin_line": 45,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_OBJECTLIT_ERROR"
      ],
      "begin_line": 49,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_STRING_ERROR"
      ],
      "begin_line": 53,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_ARGUMENT_ERROR"
      ],
      "begin_line": 57,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_STYLE_ERROR"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOO_MANY_ARGUMENTS_ERROR"
      ],
      "begin_line": 65,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_NAMESPACE_ERROR"
      ],
      "begin_line": 69,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_NAMESPACE_ERROR"
      ],
      "begin_line": 73,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_PROVIDE_ERROR"
      ],
      "begin_line": 77,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LATE_PROVIDE_ERROR"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_PROVIDE_ERROR"
      ],
      "begin_line": 85,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMODULE_REQUIRE_ERROR"
      ],
      "begin_line": 89,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR"
      ],
      "begin_line": 94,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_CSS_RENAMING_MAP"
      ],
      "begin_line": 99,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE_CLASS_ERROR"
      ],
      "begin_line": 103,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The root Closure namespace "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "providedNames"
      ],
      "begin_line": 114,
      "end_line": 115,
      "comment": " The goog.provides must be processed in a deterministic order."
    },
    {
      "type": "field",
      "varNames": [
        "unrecognizedRequires"
      ],
      "begin_line": 117,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportedVariables"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiresLevel"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProcessClosurePrimitives(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PreprocessorSymbolTable, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 123,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 29)",
        "(line 127,col 5)-(line 127,col 59)",
        "(line 128,col 5)-(line 128,col 49)",
        "(line 129,col 5)-(line 129,col 39)",
        "(line 132,col 5)-(line 133,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.getExportedVariableNames()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 140,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 53)",
        "(line 144,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 162,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 165,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 172,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 258,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 264,
      "end_line": 304,
      "comment": "\n   * Handles a goog.require call.\n   ",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 34)",
        "(line 266,col 5)-(line 266,col 30)",
        "(line 267,col 5)-(line 303,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 309,
      "end_line": 332,
      "comment": "\n   * Handles a goog.provide call.\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 34)",
        "(line 311,col 5)-(line 311,col 30)",
        "(line 312,col 5)-(line 331,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 338,
      "end_line": 350,
      "comment": "\n   * Handles a typedef definition for a goog.provided name.\n   * @param n EXPR_RESULT node.\n   ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 54)",
        "(line 341,col 5)-(line 349,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 355,
      "end_line": 377,
      "comment": "\n   * Handles a candidate definition for a goog.provided name.\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 376,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 382,
      "end_line": 485,
      "comment": "\n   * Processes the base class call.\n   ",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 36)",
        "(line 411,col 5)-(line 411,col 36)",
        "(line 412,col 5)-(line 415,col 5)",
        "(line 417,col 5)-(line 417,col 59)",
        "(line 418,col 5)-(line 421,col 5)",
        "(line 423,col 5)-(line 423,col 67)",
        "(line 424,col 5)-(line 484,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 491,
      "end_line": 512,
      "comment": "\n   * Returns the qualified name node of the function whose scope we\u0027re in,\n   * or null if it cannot be found.\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 38)",
        "(line 493,col 5)-(line 509,col 5)",
        "(line 511,col 5)-(line 511,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 515,
      "end_line": 518,
      "comment": " Reports an incorrect use of super-method calling. ",
      "child_ranges": [
        "(line 517,col 5)-(line 517,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 525,
      "end_line": 549,
      "comment": "\n   * Processes the output of processed-provide from a previous pass.  This will\n   * update our data structures in the same manner as if the provide had been\n   * processed in this pass.\n   ",
      "child_ranges": [
        "(line 527,col 5)-(line 548,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 558,
      "end_line": 648,
      "comment": "\n   * Processes a call to goog.setCssNameMapping(). Either the argument to\n   * goog.setCssNameMapping() is valid, in which case it will be used to create\n   * a CssRenamingMap for the compiler of this CompilerPass, or it is invalid\n   * and a JSCompiler error will be reported.\n   * @see #visit(NodeTraversal, Node, Node)\n   ",
      "child_ranges": [
        "(line 559,col 5)-(line 559,col 34)",
        "(line 560,col 5)-(line 560,col 30)",
        "(line 561,col 5)-(line 647,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.Anonymous-4d778b83-fdfd-4c6d-9fea-134d6ebbe4f5.get(java.lang.String)",
      "begin_line": 630,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 632,col 11)-(line 636,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.Anonymous-16a1b50e-cd87-4e93-8572-048760b6abf6.getStyle()",
      "begin_line": 639,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 641,col 11)-(line 641,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 657,
      "end_line": 669,
      "comment": "\n   * Verifies that a provide method call has exactly one argument,\n   * and that it\u0027s a string literal and that the contents of the string are\n   * valid JS tokens. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 658,col 5)-(line 660,col 5)",
        "(line 662,col 5)-(line 667,col 5)",
        "(line 668,col 5)-(line 668,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\n   * Verifies that a method call has exactly one argument, and that it\u0027s a\n   * string literal. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 678,col 5)-(line 678,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)",
      "begin_line": 687,
      "end_line": 704,
      "comment": "\n   * Verifies that a method call has exactly one argument, and that it is of the\n   * desired type. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 689,col 5)-(line 689,col 37)",
        "(line 690,col 5)-(line 696,col 5)",
        "(line 697,col 5)-(line 702,col 5)",
        "(line 703,col 5)-(line 703,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 711,
      "end_line": 733,
      "comment": "\n   * Verifies that setCssNameMapping is called with the correct methods.\n   *\n   * @return Whether the arguments checked out okay\n   ",
      "child_ranges": [
        "(line 713,col 5)-(line 713,col 37)",
        "(line 714,col 5)-(line 725,col 5)",
        "(line 726,col 5)-(line 731,col 5)",
        "(line 732,col 5)-(line 732,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 744,
      "end_line": 759,
      "comment": "\n   * Registers ProvidedNames for prefix namespaces if they haven\u0027t\n   * already been defined. The prefix namespaces must be registered in\n   * order from shortest to longest.\n   *\n   * @param ns The namespace whose prefixes may need to be provided.\n   * @param node The EXPR of the provide call.\n   * @param module The current module.\n   ",
      "child_ranges": [
        "(line 746,col 5)-(line 746,col 30)",
        "(line 747,col 5)-(line 758,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProvidedName",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 766,
      "end_line": 1033,
      "comment": "\n   * Information required to replace a goog.provide call later in the traversal.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstNode"
      ],
      "begin_line": 771,
      "end_line": 771,
      "comment": " goog.provided."
    },
    {
      "type": "field",
      "varNames": [
        "firstModule"
      ],
      "begin_line": 772,
      "end_line": 772,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "explicitNode"
      ],
      "begin_line": 776,
      "end_line": 776,
      "comment": " if the namespace is always provided implicitly."
    },
    {
      "type": "field",
      "varNames": [
        "explicitModule"
      ],
      "begin_line": 777,
      "end_line": 777,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "candidateDefinition"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": " The candidate definition."
    },
    {
      "type": "field",
      "varNames": [
        "minimumModule"
      ],
      "begin_line": 783,
      "end_line": 783,
      "comment": " The minimum module where the provide must appear."
    },
    {
      "type": "field",
      "varNames": [
        "replacementNode"
      ],
      "begin_line": 786,
      "end_line": 786,
      "comment": " The replacement declaration."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.ProvidedName(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, boolean)",
      "begin_line": 788,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 790,col 7)-(line 792,col 31)",
        "(line 793,col 7)-(line 793,col 33)",
        "(line 794,col 7)-(line 794,col 28)",
        "(line 795,col 7)-(line 795,col 32)",
        "(line 797,col 7)-(line 797,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.addProvide(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, boolean)",
      "begin_line": 803,
      "end_line": 811,
      "comment": "\n     * Add an implicit or explicit provide.\n     ",
      "child_ranges": [
        "(line 804,col 7)-(line 809,col 7)",
        "(line 810,col 7)-(line 810,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.isExplicitlyProvided()",
      "begin_line": 813,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 814,col 7)-(line 814,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.addDefinition(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 823,
      "end_line": 832,
      "comment": "\n     * Record function declaration, variable declaration or assignment that\n     * refers to the same name as the provide statement.  Give preference to\n     * declarations; if no declaration exists, record a reference to an\n     * assignment so it repurposed later.\n     ",
      "child_ranges": [
        "(line 824,col 7)-(line 826,col 48)",
        "(line 827,col 7)-(line 827,col 56)",
        "(line 828,col 7)-(line 831,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.updateMinimumModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 834,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 835,col 7)-(line 845,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.replace()",
      "begin_line": 855,
      "end_line": 918,
      "comment": "\n     * Replace the provide statement.\n     *\n     * If we\u0027re providing a name with no definition, then create one.\n     * If we\u0027re providing a name with a duplicate definition, then make sure\n     * that definition becomes a declaration.\n     ",
      "child_ranges": [
        "(line 856,col 7)-(line 860,col 7)",
        "(line 864,col 7)-(line 917,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createDeclarationNode()",
      "begin_line": 924,
      "end_line": 930,
      "comment": "\n     * Create the declaration node for this name, without inserting it\n     * into the AST.\n     ",
      "child_ranges": [
        "(line 925,col 7)-(line 929,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.makeVarDeclNode()",
      "begin_line": 936,
      "end_line": 954,
      "comment": "\n     * Creates a simple namespace variable declaration\n     * (e.g. \u003ccode\u003evar foo \u003d {};\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 937,col 7)-(line 937,col 37)",
        "(line 938,col 7)-(line 938,col 53)",
        "(line 940,col 7)-(line 940,col 31)",
        "(line 941,col 7)-(line 941,col 51)",
        "(line 944,col 7)-(line 946,col 7)",
        "(line 947,col 7)-(line 949,col 7)",
        "(line 951,col 7)-(line 951,col 61)",
        "(line 952,col 7)-(line 952,col 26)",
        "(line 953,col 7)-(line 953,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createNamespaceLiteral()",
      "begin_line": 961,
      "end_line": 966,
      "comment": "\n     * There are some special cases where clients of the compiler\n     * do not run TypedScopeCreator after running this pass.\n     * So always give the namespace literal a type.\n     ",
      "child_ranges": [
        "(line 962,col 7)-(line 962,col 35)",
        "(line 963,col 7)-(line 964,col 70)",
        "(line 965,col 7)-(line 965,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.makeAssignmentExprNode()",
      "begin_line": 972,
      "end_line": 987,
      "comment": "\n     * Creates a dotted namespace assignment expression\n     * (e.g. \u003ccode\u003efoo.bar \u003d {};\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 973,col 7)-(line 979,col 41)",
        "(line 980,col 7)-(line 980,col 51)",
        "(line 981,col 7)-(line 983,col 7)",
        "(line 984,col 7)-(line 984,col 61)",
        "(line 985,col 7)-(line 985,col 26)",
        "(line 986,col 7)-(line 986,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createConstantJsDoc()",
      "begin_line": 989,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 990,col 7)-(line 990,col 61)",
        "(line 991,col 7)-(line 991,col 32)",
        "(line 992,col 7)-(line 992,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.setSourceInfo(com.google.javascript.rhino.Node)",
      "begin_line": 998,
      "end_line": 1008,
      "comment": "\n     * Copy source info to the new node.\n     ",
      "child_ranges": [
        "(line 999,col 7)-(line 999,col 54)",
        "(line 1000,col 7)-(line 1000,col 58)",
        "(line 1001,col 7)-(line 1002,col 42)",
        "(line 1003,col 7)-(line 1003,col 57)",
        "(line 1004,col 7)-(line 1007,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.getSourceInfoOffset(com.google.javascript.rhino.Node)",
      "begin_line": 1013,
      "end_line": 1025,
      "comment": "\n     * Get the offset into the provide node where the symbol appears.\n     ",
      "child_ranges": [
        "(line 1014,col 7)-(line 1016,col 7)",
        "(line 1018,col 7)-(line 1018,col 54)",
        "(line 1024,col 7)-(line 1024,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.getProvideStringNode()",
      "begin_line": 1027,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 7)-(line 1031,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(com.google.javascript.rhino.Node)",
      "begin_line": 1038,
      "end_line": 1055,
      "comment": "\n   * @return Whether the node is namespace placeholder.\n   ",
      "child_ranges": [
        "(line 1039,col 5)-(line 1041,col 5)",
        "(line 1043,col 5)-(line 1043,col 22)",
        "(line 1044,col 5)-(line 1050,col 5)",
        "(line 1052,col 5)-(line 1054,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)",
      "begin_line": 1062,
      "end_line": 1097,
      "comment": "\n   * The string in {@code n} is a reference name. Create a synthetic\n   * node for it with all the proper source info, and add it to the symbol\n   * table.\n   ",
      "child_ranges": [
        "(line 1063,col 5)-(line 1065,col 5)",
        "(line 1067,col 5)-(line 1067,col 32)",
        "(line 1068,col 5)-(line 1071,col 14)",
        "(line 1074,col 5)-(line 1074,col 28)",
        "(line 1075,col 5)-(line 1075,col 26)",
        "(line 1077,col 5)-(line 1077,col 24)",
        "(line 1078,col 5)-(line 1091,col 5)",
        "(line 1093,col 5)-(line 1093,col 72)",
        "(line 1094,col 5)-(line 1094,col 52)",
        "(line 1096,col 5)-(line 1096,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(com.google.javascript.rhino.Node)",
      "begin_line": 1102,
      "end_line": 1106,
      "comment": "\n   * Add the given qualified name node to the symbol table.\n   ",
      "child_ranges": [
        "(line 1103,col 5)-(line 1105,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnrecognizedRequire",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1113,
      "end_line": 1123,
      "comment": "\n   * Information required to create a {@code MISSING_PROVIDE_ERROR} warning.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "requireNode"
      ],
      "begin_line": 1114,
      "end_line": 1114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 1115,
      "end_line": 1115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputName"
      ],
      "begin_line": 1116,
      "end_line": 1116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire.UnrecognizedRequire(com.google.javascript.rhino.Node, java.lang.String, java.lang.String)",
      "begin_line": 1118,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 7)-(line 1119,col 37)",
        "(line 1120,col 7)-(line 1120,col 33)",
        "(line 1121,col 7)-(line 1121,col 33)"
      ]
    }
  ]
}