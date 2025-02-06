{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/FunctionTypeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionTypeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 913,
      "comment": "\n * A builder for FunctionTypes, because FunctionTypes are so\n * ridiculously complex. All methods return {@code this} for ease of use.\n *\n * Right now, this mostly uses JSDocInfo to infer type information about\n * functions. In the long term, developers should extend it to use other\n * signals by overloading the various \"inferXXX\" methods. For example, we\n * might want to use {@code goog.inherits} calls as a signal for inheritance, or\n * {@code return} statements as a signal for return type.\n *\n * NOTE(nicksantos): Organizationally, this feels like it should be in Rhino.\n * But it depends on some coding convention stuff that\u0027s really part\n * of JSCompiler.\n *\n * @author nicksantos@google.com (Nick Santos)\n * @author pascallouis@google.com (Pascal-Louis Perez)\n "
    },
    {
      "type": "field",
      "varNames": [
        "fnName"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorRoot"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contents"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnType"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnTypeInferred"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "implementedInterfaces"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extendedInterfaces"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "baseType"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConstructor"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "makesStructs"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "makesDicts"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isInterface"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parametersNode"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypeNames"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTENDS_WITHOUT_TYPEDEF"
      ],
      "begin_line": 93,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTENDS_NON_OBJECT"
      ],
      "begin_line": 97,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RESOLVED_TAG_EMPTY"
      ],
      "begin_line": 101,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IMPLEMENTS_WITHOUT_CONSTRUCTOR"
      ],
      "begin_line": 105,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_REQUIRED"
      ],
      "begin_line": 110,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_ARGS_MUST_BE_LAST"
      ],
      "begin_line": 114,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OPTIONAL_ARG_AT_END"
      ],
      "begin_line": 118,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTANT_PARAM"
      ],
      "begin_line": 122,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_REDEFINITION"
      ],
      "begin_line": 126,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEMPLATE_TYPE_DUPLICATED"
      ],
      "begin_line": 132,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEMPLATE_TYPE_EXPECTED"
      ],
      "begin_line": 136,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "THIS_TYPE_NON_OBJECT"
      ],
      "begin_line": 140,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ExtendedTypeValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 146,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.ExtendedTypeValidator.apply(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 147,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 52)",
        "(line 150,col 7)-(line 165,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ImplementedTypeValidator",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 169,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.ImplementedTypeValidator.apply(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 170,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 172,col 52)",
        "(line 173,col 7)-(line 188,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionTypeBuilder(java.lang.String, com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 201,
      "end_line": 212,
      "comment": "\n   * @param fnName The function name.\n   * @param compiler The compiler.\n   * @param errorRoot The node to associate with any warning generated by\n   *     this builder.\n   * @param sourceName A source name for associating any warnings that\n   *     we have to emit.\n   * @param scope The syntactic scope.\n   ",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 42)",
        "(line 205,col 5)-(line 205,col 47)",
        "(line 206,col 5)-(line 206,col 59)",
        "(line 207,col 5)-(line 207,col 51)",
        "(line 208,col 5)-(line 208,col 31)",
        "(line 209,col 5)-(line 209,col 33)",
        "(line 210,col 5)-(line 210,col 29)",
        "(line 211,col 5)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.setContents(com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n   * Sets the contents of this function.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferFromOverriddenFunction(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 291,
      "comment": "\n   * Infer the parameter and return types of a function from\n   * the parameter and return types of the function it is overriding.\n   *\n   * @param oldType The function being overridden. Does nothing if this is null.\n   * @param paramsParent The LP node of the function that we\u0027re assigning to.\n   *     If null, that just means we\u0027re not initializing this to a function\n   *     literal.\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 237,col 5)",
        "(line 239,col 5)-(line 239,col 41)",
        "(line 240,col 5)-(line 240,col 56)",
        "(line 241,col 5)-(line 289,col 5)",
        "(line 290,col 5)-(line 290,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferReturnType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 296,
      "end_line": 303,
      "comment": "\n   * Infer the return type from JSDocInfo.\n   ",
      "child_ranges": [
        "(line 297,col 5)-(line 300,col 5)",
        "(line 302,col 5)-(line 302,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferInheritance(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 309,
      "end_line": 370,
      "comment": "\n   * Infer the role of the function (whether it\u0027s a constructor or interface)\n   * and what it inherits from in JSDocInfo.\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 367,col 5)",
        "(line 369,col 5)-(line 369,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 376,
      "end_line": 388,
      "comment": "\n   * Infers the type of {@code this}.\n   * @param type The type of this if the info is missing.\n   ",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 24)",
        "(line 380,col 5)-(line 385,col 5)",
        "(line 387,col 5)-(line 387,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferThisType(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 394,
      "end_line": 408,
      "comment": "\n   * Infers the type of {@code this}.\n   * @param info The JSDocInfo for this function.\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 32)",
        "(line 396,col 5)-(line 402,col 5)",
        "(line 403,col 5)-(line 405,col 5)",
        "(line 407,col 5)-(line 407,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 413,
      "end_line": 421,
      "comment": "\n   * Infer the parameter types from the doc info alone.\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 29)",
        "(line 416,col 5)-(line 418,col 5)",
        "(line 420,col 5)-(line 420,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferParameterTypes(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 427,
      "end_line": 495,
      "comment": "\n   * Infer the parameter types from the list of argument names and\n   * the doc info.\n   ",
      "child_ranges": [
        "(line 429,col 5)-(line 435,col 5)",
        "(line 438,col 5)-(line 438,col 33)",
        "(line 439,col 5)-(line 441,col 5)",
        "(line 443,col 5)-(line 443,col 74)",
        "(line 444,col 5)-(line 444,col 39)",
        "(line 445,col 5)-(line 447,col 50)",
        "(line 448,col 5)-(line 448,col 38)",
        "(line 449,col 5)-(line 449,col 30)",
        "(line 450,col 5)-(line 479,col 5)",
        "(line 482,col 5)-(line 487,col 5)",
        "(line 489,col 5)-(line 491,col 5)",
        "(line 493,col 5)-(line 493,col 37)",
        "(line 494,col 5)-(line 494,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isOptionalParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 500,
      "end_line": 509,
      "comment": "\n   * @return Whether the given param is an optional param.\n   ",
      "child_ranges": [
        "(line 502,col 5)-(line 504,col 5)",
        "(line 506,col 5)-(line 506,col 41)",
        "(line 507,col 5)-(line 508,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isVarArgsParameter(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 515,
      "end_line": 524,
      "comment": "\n   * Determine whether this is a var args parameter.\n   * @return Whether the given param is a var args param.\n   ",
      "child_ranges": [
        "(line 517,col 5)-(line 519,col 5)",
        "(line 521,col 5)-(line 521,col 41)",
        "(line 522,col 5)-(line 523,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.inferTemplateTypeName(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 529,
      "end_line": 535,
      "comment": "\n   * Infer the template type from the doc info.\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 533,col 5)",
        "(line 534,col 5)-(line 534,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.addParameter(com.google.javascript.rhino.jstype.FunctionParamBuilder, com.google.javascript.rhino.jstype.JSType, boolean, boolean, boolean)",
      "begin_line": 547,
      "end_line": 577,
      "comment": "\n   * Add a parameter to the param list.\n   * @param builder A builder.\n   * @param paramType The parameter type.\n   * @param warnedAboutArgList Whether we\u0027ve already warned about arg ordering\n   *     issues (like if optional args appeared before required ones).\n   * @param isOptional Is this an optional parameter?\n   * @param isVarArgs Is this a var args parameter?\n   * @return Whether a warning was emitted.\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 35)",
        "(line 551,col 5)-(line 575,col 5)",
        "(line 576,col 5)-(line 576,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.buildAndRegister()",
      "begin_line": 582,
      "end_line": 644,
      "comment": "\n   * Builds the function type, and puts it in the registry.\n   ",
      "child_ranges": [
        "(line 583,col 5)-(line 600,col 5)",
        "(line 602,col 5)-(line 604,col 5)",
        "(line 606,col 5)-(line 609,col 5)",
        "(line 611,col 5)-(line 611,col 24)",
        "(line 612,col 5)-(line 631,col 5)",
        "(line 633,col 5)-(line 635,col 5)",
        "(line 637,col 5)-(line 639,col 5)",
        "(line 641,col 5)-(line 641,col 42)",
        "(line 643,col 5)-(line 643,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.maybeSetBaseType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 646,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 647,col 5)-(line 649,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.getOrCreateConstructor()",
      "begin_line": 665,
      "end_line": 706,
      "comment": "\n   * Returns a constructor function either by returning it from the\n   * registry if it exists or creating and registering a new type. If\n   * there is already a type, then warn if the existing type is\n   * different than the one we are creating, though still return the\n   * existing function if possible.  The primary purpose of this is\n   * that registering a constructor will fail for all built-in types\n   * that are initialized in {@link JSTypeRegistry}.  We a) want to\n   * make sure that the type information specified in the externs file\n   * matches what is in the registry and b) annotate the externs with\n   * the {@link JSType} from the registry so that there are not two\n   * separate JSType objects for one type.\n   ",
      "child_ranges": [
        "(line 666,col 5)-(line 667,col 76)",
        "(line 668,col 5)-(line 668,col 55)",
        "(line 670,col 5)-(line 674,col 5)",
        "(line 675,col 5)-(line 698,col 5)",
        "(line 700,col 5)-(line 700,col 29)",
        "(line 702,col 5)-(line 704,col 5)",
        "(line 705,col 5)-(line 705,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.reportWarning(com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 708,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 5)-(line 709,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.reportError(com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 712,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 713,col 5)-(line 713,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.isFunctionTypeDeclaration(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 719,
      "end_line": 725,
      "comment": "\n   * Determines whether the given JsDoc info declares a function type.\n   ",
      "child_ranges": [
        "(line 720,col 5)-(line 724,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.getScopeDeclaredIn()",
      "begin_line": 732,
      "end_line": 742,
      "comment": "\n   * The scope that we should declare this function in, if it needs\n   * to be declared in a scope. Notice that TypedScopeCreator takes\n   * care of most scope-declaring.\n   ",
      "child_ranges": [
        "(line 733,col 5)-(line 733,col 39)",
        "(line 734,col 5)-(line 740,col 5)",
        "(line 741,col 5)-(line 741,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.hasMoreTagsToResolve(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 751,
      "end_line": 772,
      "comment": "\n   * Check whether a type is resolvable in the future\n   * If this has a supertype that hasn\u0027t been resolved yet, then we can assume\n   * this type will be OK once the super type resolves.\n   * @param objectType\n   * @return true if objectType is resolvable in the future\n   ",
      "child_ranges": [
        "(line 752,col 5)-(line 752,col 60)",
        "(line 753,col 5)-(line 771,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionContents",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 775,
      "end_line": 796,
      "comment": " Holds data dynamically inferred about functions. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getSourceNode()",
      "begin_line": 777,
      "end_line": 777,
      "comment": " Returns the source node of this function. May be null. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayBeFromExterns()",
      "begin_line": 780,
      "end_line": 780,
      "comment": " Returns if the function may be in externs. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 783,
      "end_line": 783,
      "comment": " Returns if a return of a real value (not undefined) appears. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.mayHaveSingleThrow()",
      "begin_line": 786,
      "end_line": 786,
      "comment": " Returns if this consists of a single throw. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getEscapedVarNames()",
      "begin_line": 789,
      "end_line": 789,
      "comment": " Gets a list of variables in this scope that are escaped. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getEscapedQualifiedNames()",
      "begin_line": 792,
      "end_line": 792,
      "comment": " Gets a list of variables whose properties are escaped. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents.getAssignedNameCounts()",
      "begin_line": 795,
      "end_line": 795,
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
      "begin_line": 798,
      "end_line": 840,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "singleton"
      ],
      "begin_line": 799,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.get()",
      "begin_line": 802,
      "end_line": 804,
      "comment": "",
      "child_ranges": [
        "(line 803,col 7)-(line 803,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getSourceNode()",
      "begin_line": 806,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 808,col 7)-(line 808,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayBeFromExterns()",
      "begin_line": 811,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 813,col 7)-(line 813,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 816,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 818,col 7)-(line 818,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.mayHaveSingleThrow()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 7)-(line 823,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getEscapedVarNames()",
      "begin_line": 826,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 828,col 7)-(line 828,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getEscapedQualifiedNames()",
      "begin_line": 831,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 833,col 7)-(line 833,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents.getAssignedNameCounts()",
      "begin_line": 836,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 838,col 7)-(line 838,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AstFunctionContents",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.FunctionTypeBuilder.FunctionContents"
      ],
      "begin_line": 842,
      "end_line": 912,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasNonEmptyReturns"
      ],
      "begin_line": 844,
      "end_line": 844,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapedVarNames"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escapedQualifiedNames"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignedVarNames"
      ],
      "begin_line": 847,
      "end_line": 847,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.AstFunctionContents(com.google.javascript.rhino.Node)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 850,col 7)-(line 850,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getSourceNode()",
      "begin_line": 853,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 855,col 7)-(line 855,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayBeFromExterns()",
      "begin_line": 858,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 860,col 7)-(line 860,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayHaveNonEmptyReturns()",
      "begin_line": 863,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 865,col 7)-(line 865,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordNonEmptyReturn()",
      "begin_line": 868,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 869,col 7)-(line 869,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.mayHaveSingleThrow()",
      "begin_line": 872,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 36)",
        "(line 875,col 7)-(line 875,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getEscapedVarNames()",
      "begin_line": 878,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 880,col 7)-(line 881,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordEscapedVarName(java.lang.String)",
      "begin_line": 884,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 885,col 7)-(line 887,col 7)",
        "(line 888,col 7)-(line 888,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getEscapedQualifiedNames()",
      "begin_line": 891,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 893,col 7)-(line 894,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordEscapedQualifiedName(java.lang.String)",
      "begin_line": 897,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 898,col 7)-(line 900,col 7)",
        "(line 901,col 7)-(line 901,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.getAssignedNameCounts()",
      "begin_line": 904,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 906,col 7)-(line 906,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents.recordAssignedName(java.lang.String)",
      "begin_line": 909,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 910,col 7)-(line 910,col 33)"
      ]
    }
  ]
}