{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FunctionTypeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionTypeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 984,
      "comment": "\n * A builder for FunctionTypes, because FunctionTypes are so\n * ridiculously complex. All methods return {@code this} for ease of use.\n *\n * Right now, this mostly uses JSDocInfo to infer type information about\n * functions. In the long term, developers should extend it to use other\n * signals by overloading the various \"inferXXX\" methods. For example, we\n * might want to use {@code goog.inherits} calls as a signal for inheritance, or\n * {@code return} statements as a signal for return type.\n *\n * NOTE(nicksantos): Organizationally, this feels like it should be in Rhino.\n * But it depends on some coding convention stuff that\u0027s really part\n * of JSCompiler.\n *\n * @author nicksantos@google.com (Nick Santos)\n * @author pascallouis@google.com (Pascal-Louis Perez)\n "
    },
    {
      "type": "field",
      "varNames": [
        "fnName"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorRoot"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contents"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnType"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnTypeInferred"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implementedInterfaces"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extendedInterfaces"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseType"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConstructor"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "makesStructs"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "makesDicts"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isInterface"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersNode"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypeNames"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classTemplateTypeNames"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " list."
    },
    {
      "type": "field",
      "varNames": [
        "EXTENDS_WITHOUT_TYPEDEF"
      ],
      "begin_line": 98,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTENDS_NON_OBJECT"
      ],
      "begin_line": 102,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESOLVED_TAG_EMPTY"
      ],
      "begin_line": 106,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IMPLEMENTS_WITHOUT_CONSTRUCTOR"
      ],
      "begin_line": 110,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_REQUIRED"
      ],
      "begin_line": 115,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_ARGS_MUST_BE_LAST"
      ],
      "begin_line": 119,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIONAL_ARG_AT_END"
      ],
      "begin_line": 123,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTANT_PARAM"
      ],
      "begin_line": 127,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_REDEFINITION"
      ],
      "begin_line": 131,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEMPLATE_TYPE_DUPLICATED"
      ],
      "begin_line": 137,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEMPLATE_TYPE_EXPECTED"
      ],
      "begin_line": 141,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "THIS_TYPE_NON_OBJECT"
      ],
      "begin_line": 145,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SAME_INTERFACE_MULTIPLE_IMPLEMENTS"
      ],
      "begin_line": 151,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ExtendedTypeValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 157,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.ExtendedTypeValidator.apply(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 158,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 160,col 7)-(line 160,col 52)",
        "(line 161,col 7)-(line 176,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImplementedTypeValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 180,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.ImplementedTypeValidator.apply(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 181,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 183,col 52)",
        "(line 184,col 7)-(line 199,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionTypeBuilder(java.lang.String, com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 212,
      "end_line": 223,
      "comment": "\n   * @param fnName The function name.\n   * @param compiler The compiler.\n   * @param errorRoot The node to associate with any warning generated by\n   *     this builder.\n   * @param sourceName A source name for associating any warnings that\n   *     we have to emit.\n   * @param scope The syntactic scope.\n   ",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 42)",
        "(line 216,col 5)-(line 216,col 47)",
        "(line 217,col 5)-(line 217,col 59)",
        "(line 218,col 5)-(line 218,col 51)",
        "(line 219,col 5)-(line 219,col 31)",
        "(line 220,col 5)-(line 220,col 33)",
        "(line 221,col 5)-(line 221,col 29)",
        "(line 222,col 5)-(line 222,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.formatFnName()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " Format the function name for use in warnings. ",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.setContents(com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n   * Sets the contents of this function.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 307,
      "comment": "\n   * Infer the parameter and return types of a function from\n   * the parameter and return types of the function it is overriding.\n   *\n   * @param oldType The function being overridden. Does nothing if this is null.\n   * @param paramsParent The LP node of the function that we\u0027re assigning to.\n   *     If null, that just means we\u0027re not initializing this to a function\n   *     literal.\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 253,col 5)",
        "(line 255,col 5)-(line 255,col 41)",
        "(line 256,col 5)-(line 256,col 56)",
        "(line 257,col 5)-(line 305,col 5)",
        "(line 306,col 5)-(line 306,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 312,
      "end_line": 319,
      "comment": "\n   * Infer the return type from JSDocInfo.\n   ",
      "child_ranges": [
        "(line 313,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 318,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 325,
      "end_line": 416,
      "comment": "\n   * Infer the role of the function (whether it\u0027s a constructor or interface)\n   * and what it inherits from in JSDocInfo.\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 413,col 5)",
        "(line 415,col 5)-(line 415,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 422,
      "end_line": 434,
      "comment": "\n   * Infers the type of {@code this}.\n   * @param type The type of this if the info is missing.\n   ",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 24)",
        "(line 426,col 5)-(line 431,col 5)",
        "(line 433,col 5)-(line 433,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 440,
      "end_line": 454,
      "comment": "\n   * Infers the type of {@code this}.\n   * @param info The JSDocInfo for this function.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 32)",
        "(line 442,col 5)-(line 448,col 5)",
        "(line 449,col 5)-(line 451,col 5)",
        "(line 453,col 5)-(line 453,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 459,
      "end_line": 467,
      "comment": "\n   * Infer the parameter types from the doc info alone.\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 29)",
        "(line 462,col 5)-(line 464,col 5)",
        "(line 466,col 5)-(line 466,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 473,
      "end_line": 543,
      "comment": "\n   * Infer the parameter types from the list of argument names and\n   * the doc info.\n   ",
      "child_ranges": [
        "(line 475,col 5)-(line 481,col 5)",
        "(line 484,col 5)-(line 484,col 33)",
        "(line 485,col 5)-(line 487,col 5)",
        "(line 489,col 5)-(line 489,col 74)",
        "(line 490,col 5)-(line 490,col 39)",
        "(line 491,col 5)-(line 493,col 50)",
        "(line 494,col 5)-(line 494,col 30)",
        "(line 495,col 5)-(line 527,col 5)",
        "(line 530,col 5)-(line 535,col 5)",
        "(line 537,col 5)-(line 539,col 5)",
        "(line 541,col 5)-(line 541,col 37)",
        "(line 542,col 5)-(line 542,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 548,
      "end_line": 557,
      "comment": "\n   * @return Whether the given param is an optional param.\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 552,col 5)",
        "(line 554,col 5)-(line 554,col 41)",
        "(line 555,col 5)-(line 556,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 563,
      "end_line": 572,
      "comment": "\n   * Determine whether this is a var args parameter.\n   * @return Whether the given param is a var args param.\n   ",
      "child_ranges": [
        "(line 565,col 5)-(line 567,col 5)",
        "(line 569,col 5)-(line 569,col 41)",
        "(line 570,col 5)-(line 571,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 577,
      "end_line": 605,
      "comment": "\n   * Infer the template type from the doc info.\n   ",
      "child_ranges": [
        "(line 579,col 5)-(line 587,col 5)",
        "(line 589,col 5)-(line 589,col 57)",
        "(line 590,col 5)-(line 599,col 5)",
        "(line 601,col 5)-(line 603,col 5)",
        "(line 604,col 5)-(line 604,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)",
      "begin_line": 617,
      "end_line": 647,
      "comment": "\n   * Add a parameter to the param list.\n   * @param builder A builder.\n   * @param paramType The parameter type.\n   * @param warnedAboutArgList Whether we\u0027ve already warned about arg ordering\n   *     issues (like if optional args appeared before required ones).\n   * @param isOptional Is this an optional parameter?\n   * @param isVarArgs Is this a var args parameter?\n   * @return Whether a warning was emitted.\n   ",
      "child_ranges": [
        "(line 620,col 5)-(line 620,col 35)",
        "(line 621,col 5)-(line 645,col 5)",
        "(line 646,col 5)-(line 646,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister()",
      "begin_line": 652,
      "end_line": 714,
      "comment": "\n   * Builds the function type, and puts it in the registry.\n   ",
      "child_ranges": [
        "(line 653,col 5)-(line 670,col 5)",
        "(line 672,col 5)-(line 674,col 5)",
        "(line 676,col 5)-(line 679,col 5)",
        "(line 681,col 5)-(line 681,col 24)",
        "(line 682,col 5)-(line 701,col 5)",
        "(line 703,col 5)-(line 705,col 5)",
        "(line 707,col 5)-(line 709,col 5)",
        "(line 711,col 5)-(line 711,col 42)",
        "(line 713,col 5)-(line 713,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 716,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 717,col 5)-(line 719,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor()",
      "begin_line": 735,
      "end_line": 777,
      "comment": "\n   * Returns a constructor function either by returning it from the\n   * registry if it exists or creating and registering a new type. If\n   * there is already a type, then warn if the existing type is\n   * different than the one we are creating, though still return the\n   * existing function if possible.  The primary purpose of this is\n   * that registering a constructor will fail for all built-in types\n   * that are initialized in {@link JSTypeRegistry}.  We a) want to\n   * make sure that the type information specified in the externs file\n   * matches what is in the registry and b) annotate the externs with\n   * the {@link JSType} from the registry so that there are not two\n   * separate JSType objects for one type.\n   ",
      "child_ranges": [
        "(line 736,col 5)-(line 738,col 32)",
        "(line 739,col 5)-(line 739,col 55)",
        "(line 741,col 5)-(line 745,col 5)",
        "(line 746,col 5)-(line 769,col 5)",
        "(line 771,col 5)-(line 771,col 29)",
        "(line 773,col 5)-(line 775,col 5)",
        "(line 776,col 5)-(line 776,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 779,
      "end_line": 781,
      "comment": "",
      "child_ranges": [
        "(line 780,col 5)-(line 780,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.reportError(com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 783,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 790,
      "end_line": 796,
      "comment": "\n   * Determines whether the given JsDoc info declares a function type.\n   ",
      "child_ranges": [
        "(line 791,col 5)-(line 795,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn()",
      "begin_line": 803,
      "end_line": 813,
      "comment": "\n   * The scope that we should declare this function in, if it needs\n   * to be declared in a scope. Notice that TypedScopeCreator takes\n   * care of most scope-declaring.\n   ",
      "child_ranges": [
        "(line 804,col 5)-(line 804,col 39)",
        "(line 805,col 5)-(line 811,col 5)",
        "(line 812,col 5)-(line 812,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 822,
      "end_line": 843,
      "comment": "\n   * Check whether a type is resolvable in the future\n   * If this has a supertype that hasn\u0027t been resolved yet, then we can assume\n   * this type will be OK once the super type resolves.\n   * @param objectType\n   * @return true if objectType is resolvable in the future\n   ",
      "child_ranges": [
        "(line 823,col 5)-(line 823,col 60)",
        "(line 824,col 5)-(line 842,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionContents",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 846,
      "end_line": 867,
      "comment": " Holds data dynamically inferred about functions. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getSourceNode()",
      "begin_line": 848,
      "end_line": 848,
      "comment": " Returns the source node of this function. May be null. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayBeFromExterns()",
      "begin_line": 851,
      "end_line": 851,
      "comment": " Returns if the function may be in externs. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 854,
      "end_line": 854,
      "comment": " Returns if a return of a real value (not undefined) appears. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayHaveSingleThrow()",
      "begin_line": 857,
      "end_line": 857,
      "comment": " Returns if this consists of a single throw. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getEscapedVarNames()",
      "begin_line": 860,
      "end_line": 860,
      "comment": " Gets a list of variables in this scope that are escaped. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getEscapedQualifiedNames()",
      "begin_line": 863,
      "end_line": 863,
      "comment": " Gets a list of variables whose properties are escaped. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getAssignedNameCounts()",
      "begin_line": 866,
      "end_line": 866,
      "comment": " Gets the number of times each variable has been assigned. ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UnknownFunctionContents",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents"
      ],
      "begin_line": 869,
      "end_line": 911,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleton"
      ],
      "begin_line": 870,
      "end_line": 871,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.get()",
      "begin_line": 873,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getSourceNode()",
      "begin_line": 877,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 879,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayBeFromExterns()",
      "begin_line": 882,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 884,col 7)-(line 884,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 887,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 889,col 7)-(line 889,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayHaveSingleThrow()",
      "begin_line": 892,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 894,col 7)-(line 894,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getEscapedVarNames()",
      "begin_line": 897,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 899,col 7)-(line 899,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getEscapedQualifiedNames()",
      "begin_line": 902,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 7)-(line 904,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getAssignedNameCounts()",
      "begin_line": 907,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 909,col 7)-(line 909,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AstFunctionContents",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents"
      ],
      "begin_line": 913,
      "end_line": 983,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 914,
      "end_line": 914,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNonEmptyReturns"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapedVarNames"
      ],
      "begin_line": 916,
      "end_line": 916,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapedQualifiedNames"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignedVarNames"
      ],
      "begin_line": 918,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.AstFunctionContents(com.google.javascript.rhino.Node)",
      "begin_line": 920,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 921,col 7)-(line 921,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getSourceNode()",
      "begin_line": 924,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 926,col 7)-(line 926,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayBeFromExterns()",
      "begin_line": 929,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 931,col 7)-(line 931,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 934,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 936,col 7)-(line 936,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordNonEmptyReturn()",
      "begin_line": 939,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 940,col 7)-(line 940,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayHaveSingleThrow()",
      "begin_line": 943,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 945,col 7)-(line 945,col 36)",
        "(line 946,col 7)-(line 946,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getEscapedVarNames()",
      "begin_line": 949,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 951,col 7)-(line 952,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordEscapedVarName(java.lang.String)",
      "begin_line": 955,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 956,col 7)-(line 958,col 7)",
        "(line 959,col 7)-(line 959,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getEscapedQualifiedNames()",
      "begin_line": 962,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 964,col 7)-(line 965,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordEscapedQualifiedName(java.lang.String)",
      "begin_line": 968,
      "end_line": 973,
      "comment": "",
      "child_ranges": [
        "(line 969,col 7)-(line 971,col 7)",
        "(line 972,col 7)-(line 972,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getAssignedNameCounts()",
      "begin_line": 975,
      "end_line": 978,
      "comment": "",
      "child_ranges": [
        "(line 977,col 7)-(line 977,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordAssignedName(java.lang.String)",
      "begin_line": 980,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 981,col 7)-(line 981,col 33)"
      ]
    }
  ]
}