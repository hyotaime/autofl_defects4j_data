{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ProcessClosurePrimitives.java",
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
      "end_line": 1234,
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
        "INVALID_DEFINE_NAME_ERROR"
      ],
      "begin_line": 89,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_DEFINE_ANNOTATION"
      ],
      "begin_line": 93,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "XMODULE_REQUIRE_ERROR"
      ],
      "begin_line": 97,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR"
      ],
      "begin_line": 102,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_CSS_RENAMING_MAP"
      ],
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BASE_CLASS_ERROR"
      ],
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The root Closure namespace "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "providedNames"
      ],
      "begin_line": 122,
      "end_line": 123,
      "comment": " The goog.provides must be processed in a deterministic order."
    },
    {
      "type": "field",
      "varNames": [
        "unrecognizedRequires"
      ],
      "begin_line": 125,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportedVariables"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "requiresLevel"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defineCalls"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProcessClosurePrimitives(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PreprocessorSymbolTable, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 132,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 29)",
        "(line 136,col 5)-(line 136,col 59)",
        "(line 137,col 5)-(line 137,col 49)",
        "(line 138,col 5)-(line 138,col 39)",
        "(line 141,col 5)-(line 142,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.getExportedVariableNames()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 149,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 53)",
        "(line 153,col 5)-(line 155,col 5)",
        "(line 157,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 175,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 192,
      "comment": "\n   * @param n\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 32)",
        "(line 183,col 5)-(line 183,col 52)",
        "(line 184,col 5)-(line 184,col 51)",
        "(line 185,col 5)-(line 185,col 57)",
        "(line 187,col 5)-(line 188,col 71)",
        "(line 189,col 5)-(line 189,col 53)",
        "(line 190,col 5)-(line 190,col 57)",
        "(line 191,col 5)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 201,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 289,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 295,
      "end_line": 335,
      "comment": "\n   * Handles a goog.require call.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 34)",
        "(line 297,col 5)-(line 297,col 30)",
        "(line 298,col 5)-(line 334,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 340,
      "end_line": 363,
      "comment": "\n   * Handles a goog.provide call.\n   ",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 34)",
        "(line 342,col 5)-(line 342,col 30)",
        "(line 343,col 5)-(line 362,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 368,
      "end_line": 381,
      "comment": "\n   * Handles a goog.define call.\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 34)",
        "(line 370,col 5)-(line 370,col 31)",
        "(line 371,col 5)-(line 380,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 387,
      "end_line": 399,
      "comment": "\n   * Handles a typedef definition for a goog.provided name.\n   * @param n EXPR_RESULT node.\n   ",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 54)",
        "(line 390,col 5)-(line 398,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 404,
      "end_line": 426,
      "comment": "\n   * Handles a candidate definition for a goog.provided name.\n   ",
      "child_ranges": [
        "(line 406,col 5)-(line 425,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 431,
      "end_line": 534,
      "comment": "\n   * Processes the base class call.\n   ",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 36)",
        "(line 460,col 5)-(line 460,col 36)",
        "(line 461,col 5)-(line 464,col 5)",
        "(line 466,col 5)-(line 466,col 59)",
        "(line 467,col 5)-(line 470,col 5)",
        "(line 472,col 5)-(line 472,col 67)",
        "(line 473,col 5)-(line 533,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 540,
      "end_line": 561,
      "comment": "\n   * Returns the qualified name node of the function whose scope we\u0027re in,\n   * or null if it cannot be found.\n   ",
      "child_ranges": [
        "(line 541,col 5)-(line 541,col 38)",
        "(line 542,col 5)-(line 558,col 5)",
        "(line 560,col 5)-(line 560,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 564,
      "end_line": 567,
      "comment": " Reports an incorrect use of super-method calling. ",
      "child_ranges": [
        "(line 566,col 5)-(line 566,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 574,
      "end_line": 598,
      "comment": "\n   * Processes the output of processed-provide from a previous pass.  This will\n   * update our data structures in the same manner as if the provide had been\n   * processed in this pass.\n   ",
      "child_ranges": [
        "(line 576,col 5)-(line 597,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 607,
      "end_line": 699,
      "comment": "\n   * Processes a call to goog.setCssNameMapping(). Either the argument to\n   * goog.setCssNameMapping() is valid, in which case it will be used to create\n   * a CssRenamingMap for the compiler of this CompilerPass, or it is invalid\n   * and a JSCompiler error will be reported.\n   * @see #visit(NodeTraversal, Node, Node)\n   ",
      "child_ranges": [
        "(line 608,col 5)-(line 608,col 34)",
        "(line 609,col 5)-(line 609,col 30)",
        "(line 610,col 5)-(line 698,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.Anonymous-2760358b-a21f-4678-8156-2738290dc628.get(java.lang.String)",
      "begin_line": 681,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 683,col 11)-(line 687,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.Anonymous-ba4bf126-0eac-414b-b11f-c8eb12c25b2a.getStyle()",
      "begin_line": 690,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 692,col 11)-(line 692,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 708,
      "end_line": 720,
      "comment": "\n   * Verifies that a provide method call has exactly one argument,\n   * and that it\u0027s a string literal and that the contents of the string are\n   * valid JS tokens. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 709,col 5)-(line 711,col 5)",
        "(line 713,col 5)-(line 718,col 5)",
        "(line 719,col 5)-(line 719,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 729,
      "end_line": 761,
      "comment": "\n   * Verifies that a provide method call has exactly one argument,\n   * and that it\u0027s a string literal and that the contents of the string are\n   * valid JS tokens. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 20)",
        "(line 735,col 5)-(line 738,col 5)",
        "(line 741,col 5)-(line 741,col 24)",
        "(line 742,col 5)-(line 745,col 5)",
        "(line 747,col 5)-(line 747,col 35)",
        "(line 748,col 5)-(line 753,col 5)",
        "(line 755,col 5)-(line 755,col 57)",
        "(line 756,col 5)-(line 759,col 5)",
        "(line 760,col 5)-(line 760,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 769,
      "end_line": 774,
      "comment": "\n   * Verifies that a method call has exactly one argument, and that it\u0027s a\n   * string literal. Reports a compile error if it doesn\u0027t.\n   *\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 771,col 5)-(line 773,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 779,
      "end_line": 787,
      "comment": "\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 780,col 5)-(line 785,col 5)",
        "(line 786,col 5)-(line 786,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)",
      "begin_line": 792,
      "end_line": 801,
      "comment": "\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 794,col 5)-(line 799,col 5)",
        "(line 800,col 5)-(line 800,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 806,
      "end_line": 814,
      "comment": "\n   * @return Whether the argument checked out okay\n   ",
      "child_ranges": [
        "(line 807,col 5)-(line 812,col 5)",
        "(line 813,col 5)-(line 813,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 821,
      "end_line": 843,
      "comment": "\n   * Verifies that setCssNameMapping is called with the correct methods.\n   *\n   * @return Whether the arguments checked out okay\n   ",
      "child_ranges": [
        "(line 823,col 5)-(line 823,col 37)",
        "(line 824,col 5)-(line 835,col 5)",
        "(line 836,col 5)-(line 841,col 5)",
        "(line 842,col 5)-(line 842,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 854,
      "end_line": 869,
      "comment": "\n   * Registers ProvidedNames for prefix namespaces if they haven\u0027t\n   * already been defined. The prefix namespaces must be registered in\n   * order from shortest to longest.\n   *\n   * @param ns The namespace whose prefixes may need to be provided.\n   * @param node The EXPR of the provide call.\n   * @param module The current module.\n   ",
      "child_ranges": [
        "(line 856,col 5)-(line 856,col 30)",
        "(line 857,col 5)-(line 868,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProvidedName",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 876,
      "end_line": 1143,
      "comment": "\n   * Information required to replace a goog.provide call later in the traversal.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 877,
      "end_line": 877,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstNode"
      ],
      "begin_line": 881,
      "end_line": 881,
      "comment": " goog.provided."
    },
    {
      "type": "field",
      "varNames": [
        "firstModule"
      ],
      "begin_line": 882,
      "end_line": 882,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "explicitNode"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": " if the namespace is always provided implicitly."
    },
    {
      "type": "field",
      "varNames": [
        "explicitModule"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "candidateDefinition"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": " The candidate definition."
    },
    {
      "type": "field",
      "varNames": [
        "minimumModule"
      ],
      "begin_line": 893,
      "end_line": 893,
      "comment": " The minimum module where the provide must appear."
    },
    {
      "type": "field",
      "varNames": [
        "replacementNode"
      ],
      "begin_line": 896,
      "end_line": 896,
      "comment": " The replacement declaration."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.ProvidedName(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, boolean)",
      "begin_line": 898,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 900,col 7)-(line 902,col 31)",
        "(line 903,col 7)-(line 903,col 33)",
        "(line 904,col 7)-(line 904,col 28)",
        "(line 905,col 7)-(line 905,col 32)",
        "(line 907,col 7)-(line 907,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.addProvide(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule, boolean)",
      "begin_line": 913,
      "end_line": 921,
      "comment": "\n     * Add an implicit or explicit provide.\n     ",
      "child_ranges": [
        "(line 914,col 7)-(line 919,col 7)",
        "(line 920,col 7)-(line 920,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.isExplicitlyProvided()",
      "begin_line": 923,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 924,col 7)-(line 924,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.addDefinition(com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)",
      "begin_line": 933,
      "end_line": 942,
      "comment": "\n     * Record function declaration, variable declaration or assignment that\n     * refers to the same name as the provide statement.  Give preference to\n     * declarations; if no declaration exists, record a reference to an\n     * assignment so it repurposed later.\n     ",
      "child_ranges": [
        "(line 934,col 7)-(line 936,col 48)",
        "(line 937,col 7)-(line 937,col 56)",
        "(line 938,col 7)-(line 941,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.updateMinimumModule(com.google.javascript.jscomp.JSModule)",
      "begin_line": 944,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 945,col 7)-(line 955,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.replace()",
      "begin_line": 965,
      "end_line": 1028,
      "comment": "\n     * Replace the provide statement.\n     *\n     * If we\u0027re providing a name with no definition, then create one.\n     * If we\u0027re providing a name with a duplicate definition, then make sure\n     * that definition becomes a declaration.\n     ",
      "child_ranges": [
        "(line 966,col 7)-(line 970,col 7)",
        "(line 974,col 7)-(line 1027,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createDeclarationNode()",
      "begin_line": 1034,
      "end_line": 1040,
      "comment": "\n     * Create the declaration node for this name, without inserting it\n     * into the AST.\n     ",
      "child_ranges": [
        "(line 1035,col 7)-(line 1039,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.makeVarDeclNode()",
      "begin_line": 1046,
      "end_line": 1064,
      "comment": "\n     * Creates a simple namespace variable declaration\n     * (e.g. \u003ccode\u003evar foo \u003d {};\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 1047,col 7)-(line 1047,col 37)",
        "(line 1048,col 7)-(line 1048,col 53)",
        "(line 1050,col 7)-(line 1050,col 31)",
        "(line 1051,col 7)-(line 1051,col 51)",
        "(line 1054,col 7)-(line 1056,col 7)",
        "(line 1057,col 7)-(line 1059,col 7)",
        "(line 1061,col 7)-(line 1061,col 61)",
        "(line 1062,col 7)-(line 1062,col 26)",
        "(line 1063,col 7)-(line 1063,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createNamespaceLiteral()",
      "begin_line": 1071,
      "end_line": 1076,
      "comment": "\n     * There are some special cases where clients of the compiler\n     * do not run TypedScopeCreator after running this pass.\n     * So always give the namespace literal a type.\n     ",
      "child_ranges": [
        "(line 1072,col 7)-(line 1072,col 35)",
        "(line 1073,col 7)-(line 1074,col 70)",
        "(line 1075,col 7)-(line 1075,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.makeAssignmentExprNode()",
      "begin_line": 1082,
      "end_line": 1097,
      "comment": "\n     * Creates a dotted namespace assignment expression\n     * (e.g. \u003ccode\u003efoo.bar \u003d {};\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 1083,col 7)-(line 1089,col 41)",
        "(line 1090,col 7)-(line 1090,col 51)",
        "(line 1091,col 7)-(line 1093,col 7)",
        "(line 1094,col 7)-(line 1094,col 61)",
        "(line 1095,col 7)-(line 1095,col 26)",
        "(line 1096,col 7)-(line 1096,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.createConstantJsDoc()",
      "begin_line": 1099,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 7)-(line 1100,col 61)",
        "(line 1101,col 7)-(line 1101,col 32)",
        "(line 1102,col 7)-(line 1102,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.setSourceInfo(com.google.javascript.rhino.Node)",
      "begin_line": 1108,
      "end_line": 1118,
      "comment": "\n     * Copy source info to the new node.\n     ",
      "child_ranges": [
        "(line 1109,col 7)-(line 1109,col 54)",
        "(line 1110,col 7)-(line 1110,col 58)",
        "(line 1111,col 7)-(line 1112,col 42)",
        "(line 1113,col 7)-(line 1113,col 57)",
        "(line 1114,col 7)-(line 1117,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.getSourceInfoOffset(com.google.javascript.rhino.Node)",
      "begin_line": 1123,
      "end_line": 1135,
      "comment": "\n     * Get the offset into the provide node where the symbol appears.\n     ",
      "child_ranges": [
        "(line 1124,col 7)-(line 1126,col 7)",
        "(line 1128,col 7)-(line 1128,col 54)",
        "(line 1134,col 7)-(line 1134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName.getProvideStringNode()",
      "begin_line": 1137,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 7)-(line 1141,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(com.google.javascript.rhino.Node)",
      "begin_line": 1148,
      "end_line": 1165,
      "comment": "\n   * @return Whether the node is namespace placeholder.\n   ",
      "child_ranges": [
        "(line 1149,col 5)-(line 1151,col 5)",
        "(line 1153,col 5)-(line 1153,col 22)",
        "(line 1154,col 5)-(line 1160,col 5)",
        "(line 1162,col 5)-(line 1164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)",
      "begin_line": 1172,
      "end_line": 1207,
      "comment": "\n   * The string in {@code n} is a reference name. Create a synthetic\n   * node for it with all the proper source info, and add it to the symbol\n   * table.\n   ",
      "child_ranges": [
        "(line 1173,col 5)-(line 1175,col 5)",
        "(line 1177,col 5)-(line 1177,col 32)",
        "(line 1178,col 5)-(line 1181,col 14)",
        "(line 1184,col 5)-(line 1184,col 27)",
        "(line 1185,col 5)-(line 1185,col 25)",
        "(line 1187,col 5)-(line 1187,col 24)",
        "(line 1188,col 5)-(line 1201,col 5)",
        "(line 1203,col 5)-(line 1203,col 71)",
        "(line 1204,col 5)-(line 1204,col 52)",
        "(line 1206,col 5)-(line 1206,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(com.google.javascript.rhino.Node)",
      "begin_line": 1212,
      "end_line": 1216,
      "comment": "\n   * Add the given qualified name node to the symbol table.\n   ",
      "child_ranges": [
        "(line 1213,col 5)-(line 1215,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnrecognizedRequire",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1223,
      "end_line": 1233,
      "comment": "\n   * Information required to create a {@code MISSING_PROVIDE_ERROR} warning.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "requireNode"
      ],
      "begin_line": 1224,
      "end_line": 1224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 1225,
      "end_line": 1225,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputName"
      ],
      "begin_line": 1226,
      "end_line": 1226,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire.UnrecognizedRequire(com.google.javascript.rhino.Node, java.lang.String, java.lang.String)",
      "begin_line": 1228,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1229,col 7)-(line 1229,col 37)",
        "(line 1230,col 7)-(line 1230,col 33)",
        "(line 1231,col 7)-(line 1231,col 33)"
      ]
    }
  ]
}