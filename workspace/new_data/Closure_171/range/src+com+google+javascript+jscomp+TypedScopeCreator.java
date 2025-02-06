{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TypedScopeCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedScopeCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopeCreator"
      ],
      "begin_line": 100,
      "end_line": 2161,
      "comment": "\n * Creates the symbol table of variables available in the current scope and\n * their types.\n *\n * Scopes created by this class are very different from scopes created\n * by the syntactic scope creator. These scopes have type information, and\n * include some qualified names in addition to variables\n * (like Class.staticMethod).\n *\n * When building scope information, also declares relevant information\n * about types in the type registry.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DELEGATE_PROXY_SUFFIX"
      ],
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n   * A suffix for naming delegate proxies differently from their base.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MALFORMED_TYPEDEF"
      ],
      "begin_line": 107,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_INITIALIZER"
      ],
      "begin_line": 112,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CTOR_INITIALIZER"
      ],
      "begin_line": 117,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IFACE_INITIALIZER"
      ],
      "begin_line": 122,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_EXPECTED"
      ],
      "begin_line": 127,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_LENDS"
      ],
      "begin_line": 132,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LENDS_ON_NON_OBJECT"
      ],
      "begin_line": 137,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeParsingErrorReporter"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegateProxyPrototypes"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegateCallingConventions"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionAnalysisResults"
      ],
      "begin_line": 152,
      "end_line": 153,
      "comment": " Simple properties inferred about functions."
    },
    {
      "type": "field",
      "varNames": [
        "unknownType"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " For convenience"
    },
    {
      "type": "class_interface",
      "name": "DeferredSetType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 162,
      "end_line": 180,
      "comment": "\n   * Defer attachment of types to nodes until all type names\n   * have been resolved. Then, we can resolve the type and attach it.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType.DeferredSetType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 166,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 167,col 39)",
        "(line 168,col 7)-(line 168,col 39)",
        "(line 169,col 7)-(line 169,col 23)",
        "(line 170,col 7)-(line 170,col 23)",
        "(line 174,col 7)-(line 174,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType.resolve(com.google.javascript.jscomp.Scope)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 7)-(line 178,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 186,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 29)",
        "(line 189,col 5)-(line 189,col 49)",
        "(line 190,col 5)-(line 190,col 45)",
        "(line 191,col 5)-(line 191,col 51)",
        "(line 192,col 5)-(line 192,col 68)",
        "(line 193,col 5)-(line 193,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 200,
      "end_line": 259,
      "comment": "\n   * Creates a scope with all types declared. Declares newly discovered types\n   * and type properties in the type registry.\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 26)",
        "(line 206,col 5)-(line 206,col 45)",
        "(line 207,col 5)-(line 232,col 5)",
        "(line 234,col 5)-(line 234,col 43)",
        "(line 239,col 5)-(line 249,col 5)",
        "(line 251,col 5)-(line 255,col 5)",
        "(line 257,col 5)-(line 257,col 43)",
        "(line 258,col 5)-(line 258,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 268,
      "end_line": 307,
      "comment": "\n   * Patches a given global scope by removing variables previously declared in\n   * a script and re-traversing a new version of that script.\n   *\n   * @param globalScope The global scope generated by {@code createScope}.\n   * @param scriptRoot The script that is modified.\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 52)",
        "(line 272,col 5)-(line 272,col 44)",
        "(line 273,col 5)-(line 273,col 53)",
        "(line 275,col 5)-(line 275,col 59)",
        "(line 276,col 5)-(line 276,col 43)",
        "(line 277,col 5)-(line 281,col 5)",
        "(line 283,col 5)-(line 284,col 70)",
        "(line 291,col 5)-(line 291,col 50)",
        "(line 292,col 5)-(line 292,col 50)",
        "(line 293,col 5)-(line 298,col 5)",
        "(line 299,col 5)-(line 302,col 5)",
        "(line 305,col 5)-(line 305,col 74)",
        "(line 306,col 5)-(line 306,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(com.google.javascript.rhino.Node)",
      "begin_line": 313,
      "end_line": 343,
      "comment": "\n   * Create the outermost scope. This scope contains native binding such as\n   * {@code Object}, {@code Date}, etc.\n   ",
      "child_ranges": [
        "(line 316,col 5)-(line 317,col 68)",
        "(line 319,col 5)-(line 319,col 44)",
        "(line 320,col 5)-(line 320,col 54)",
        "(line 321,col 5)-(line 321,col 63)",
        "(line 322,col 5)-(line 322,col 53)",
        "(line 323,col 5)-(line 323,col 54)",
        "(line 324,col 5)-(line 324,col 59)",
        "(line 325,col 5)-(line 325,col 57)",
        "(line 326,col 5)-(line 326,col 62)",
        "(line 327,col 5)-(line 327,col 55)",
        "(line 328,col 5)-(line 328,col 60)",
        "(line 329,col 5)-(line 329,col 64)",
        "(line 330,col 5)-(line 330,col 55)",
        "(line 331,col 5)-(line 331,col 62)",
        "(line 332,col 5)-(line 332,col 61)",
        "(line 333,col 5)-(line 333,col 59)",
        "(line 334,col 5)-(line 334,col 58)",
        "(line 335,col 5)-(line 335,col 54)",
        "(line 340,col 5)-(line 340,col 71)",
        "(line 342,col 5)-(line 342,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 345,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 61)",
        "(line 347,col 5)-(line 347,col 72)",
        "(line 348,col 5)-(line 349,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiscoverEnumsAndTypedefs",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 361,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.DiscoverEnumsAndTypedefs(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 369,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 371,col 7)-(line 389,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.identifyNameNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 392,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 394,col 7)-(line 402,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 407,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.Scope.TypeResolver"
      ],
      "begin_line": 410,
      "end_line": 1843,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": "\n     * The scope that we\u0027re building.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "deferredSetTypes"
      ],
      "begin_line": 418,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nonExternFunctions"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": "\n     * Functions that we found in the global scope and not in externs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lentObjectLiterals"
      ],
      "begin_line": 436,
      "end_line": 436,
      "comment": "\n     * Object literals with a @lends annotation aren\u0027t analyzed until we\n     * reach the root of the statement they\u0027re defined in.\n     *\n     * This ensures that if there are any @lends annotations on the object\n     * literals, the type on the @lends annotation resolves correctly.\n     *\n     * For more information, see\n     * http://code.google.com/p/closure-compiler/issues/detail?id\u003d314\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stubDeclarations"
      ],
      "begin_line": 444,
      "end_line": 445,
      "comment": "\n     * Type-less stubs.\n     *\n     * If at the end of traversal, we still don\u0027t have types for these\n     * stubs, then we should declare UNKNOWN types.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 450,
      "end_line": 450,
      "comment": "\n     * The current source file that we\u0027re in.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 455,
      "end_line": 455,
      "comment": "\n     * The InputId of the current node.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.AbstractScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 458,col 7)-(line 458,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.setDeferredType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 7)-(line 462,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.resolveTypes()",
      "begin_line": 465,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 468,col 7)-(line 470,col 7)",
        "(line 473,col 7)-(line 473,col 43)",
        "(line 474,col 7)-(line 476,col 7)",
        "(line 480,col 7)-(line 480,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 483,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 485,col 7)-(line 485,col 31)",
        "(line 486,col 7)-(line 490,col 7)",
        "(line 494,col 7)-(line 495,col 71)",
        "(line 497,col 7)-(line 509,col 7)",
        "(line 511,col 7)-(line 511,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 514,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 516,col 7)-(line 516,col 31)",
        "(line 517,col 7)-(line 517,col 28)",
        "(line 519,col 7)-(line 561,col 7)",
        "(line 564,col 7)-(line 570,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.attachLiteralTypes(com.google.javascript.rhino.Node)",
      "begin_line": 573,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 574,col 7)-(line 615,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineObjectLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 618,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 620,col 7)-(line 620,col 25)",
        "(line 621,col 7)-(line 621,col 48)",
        "(line 622,col 7)-(line 642,col 7)",
        "(line 644,col 7)-(line 644,col 50)",
        "(line 645,col 7)-(line 645,col 54)",
        "(line 646,col 7)-(line 646,col 61)",
        "(line 647,col 7)-(line 647,col 38)",
        "(line 648,col 7)-(line 651,col 7)",
        "(line 653,col 7)-(line 655,col 7)",
        "(line 657,col 7)-(line 657,col 39)",
        "(line 660,col 7)-(line 661,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.processObjectLitProperties(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, boolean)",
      "begin_line": 672,
      "end_line": 700,
      "comment": "\n     * Process an object literal and all the types on it.\n     * @param objLit The OBJECTLIT node.\n     * @param objLitType The type of the OBJECTLIT node. This might be a named\n     *     type, because of the lends annotation.\n     * @param declareOnOwner If true, declare properties on the objLitType as\n     *     well. If false, the caller should take care of this.\n     ",
      "child_ranges": [
        "(line 675,col 7)-(line 699,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getDeclaredTypeInAnnotation(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 708,
      "end_line": 745,
      "comment": "\n     * Returns the type specified in a JSDoc annotation near a GETPROP or NAME.\n     *\n     * Extracts type information from either the {@code @type} tag or from\n     * the {@code @return} and {@code @param} tags.\n     ",
      "child_ranges": [
        "(line 709,col 7)-(line 709,col 27)",
        "(line 710,col 7)-(line 743,col 7)",
        "(line 744,col 7)-(line 744,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.assertDefinitionNode(com.google.javascript.rhino.Node, int)",
      "begin_line": 751,
      "end_line": 754,
      "comment": "\n     * Asserts that it\u0027s OK to define this node\u0027s name.\n     * The node should have a source name and be of the specified type.\n     ",
      "child_ranges": [
        "(line 752,col 7)-(line 752,col 51)",
        "(line 753,col 7)-(line 753,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineCatch(com.google.javascript.rhino.Node)",
      "begin_line": 759,
      "end_line": 765,
      "comment": "\n     * Defines a catch parameter.\n     ",
      "child_ranges": [
        "(line 760,col 7)-(line 760,col 43)",
        "(line 761,col 7)-(line 761,col 41)",
        "(line 762,col 7)-(line 764,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineVar(com.google.javascript.rhino.Node)",
      "begin_line": 770,
      "end_line": 785,
      "comment": "\n     * Defines a VAR initialization.\n     ",
      "child_ranges": [
        "(line 771,col 7)-(line 771,col 41)",
        "(line 772,col 7)-(line 772,col 40)",
        "(line 773,col 7)-(line 784,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineFunctionLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 790,
      "end_line": 810,
      "comment": "\n     * Defines a function literal.\n     ",
      "child_ranges": [
        "(line 791,col 7)-(line 791,col 46)",
        "(line 795,col 7)-(line 795,col 46)",
        "(line 796,col 7)-(line 796,col 52)",
        "(line 797,col 7)-(line 797,col 63)",
        "(line 798,col 7)-(line 799,col 69)",
        "(line 802,col 7)-(line 802,col 39)",
        "(line 807,col 7)-(line 809,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineName(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 820,
      "end_line": 830,
      "comment": "\n     * Defines a variable based on the {@link Token#NAME} node passed.\n     * @param name The {@link Token#NAME} node.\n     * @param var The parent of the {@code name} node, which must be a\n     *     {@link Token#VAR} node.\n     * @param info the {@link JSDocInfo} information relating to this\n     *     {@code name} node.\n     ",
      "child_ranges": [
        "(line 821,col 7)-(line 821,col 40)",
        "(line 824,col 7)-(line 824,col 55)",
        "(line 825,col 7)-(line 828,col 7)",
        "(line 829,col 7)-(line 829,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.shouldUseFunctionLiteralType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 839,
      "end_line": 849,
      "comment": "\n     * If a variable is assigned a function literal in the global scope,\n     * make that a declared type (even if there\u0027s no doc info).\n     * There\u0027s only one exception to this rule:\n     * if the return type is inferred, and we\u0027re in a local\n     * scope, we should assume the whole function is inferred.\n     ",
      "child_ranges": [
        "(line 841,col 7)-(line 843,col 7)",
        "(line 844,col 7)-(line 847,col 7)",
        "(line 848,col 7)-(line 848,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.createFunctionTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 873,
      "end_line": 989,
      "comment": "\n     * Creates a new function type, based on the given nodes.\n     *\n     * This handles two cases that are semantically very different, but\n     * are not mutually exclusive:\n     * - A function literal that needs a type attached to it.\n     * - An assignment expression with function-type info in the JsDoc.\n     *\n     * All parameters are optional, and we will do the best we can to create\n     * a function type.\n     *\n     * This function will always create a function type, so only call it if\n     * you\u0027re sure that\u0027s what you want.\n     *\n     * @param rValue The function node.\n     * @param name the function\u0027s name\n     * @param info the {@link JSDocInfo} attached to the function definition\n     * @param lvalueNode The node where this function is being\n     *     assigned. For example, {@code A.prototype.foo \u003d ...} would be used to\n     *     determine that this function is a method of A.prototype. May be\n     *     null to indicate that this is not being assigned to a qualified name.\n     ",
      "child_ranges": [
        "(line 879,col 7)-(line 879,col 39)",
        "(line 882,col 7)-(line 896,col 7)",
        "(line 898,col 7)-(line 985,col 7)",
        "(line 988,col 7)-(line 988,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getPrototypeOwnerType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 991,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 992,col 7)-(line 994,col 7)",
        "(line 995,col 7)-(line 995,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.findOverriddenFunction(com.google.javascript.rhino.jstype.ObjectType, java.lang.String, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 1001,
      "end_line": 1030,
      "comment": "\n     * Find the function that\u0027s being overridden on this type, if any.\n     ",
      "child_ranges": [
        "(line 1003,col 7)-(line 1003,col 33)",
        "(line 1007,col 7)-(line 1007,col 60)",
        "(line 1008,col 7)-(line 1021,col 7)",
        "(line 1023,col 7)-(line 1027,col 7)",
        "(line 1029,col 7)-(line 1029,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.createEnumTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 1049,
      "end_line": 1093,
      "comment": "\n     * Creates a new enum type, based on the given nodes.\n     *\n     * This handles two cases that are semantically very different, but\n     * are not mutually exclusive:\n     * - An object literal that needs an enum type attached to it.\n     * - An assignment expression with an enum tag in the JsDoc.\n     *\n     * This function will always create an enum type, so only call it if\n     * you\u0027re sure that\u0027s what you want.\n     *\n     * @param rValue The node of the enum.\n     * @param name The enum\u0027s name\n     * @param info The {@link JSDocInfo} attached to the enum definition.\n     * @param lValueNode The node where this function is being\n     *     assigned.\n     ",
      "child_ranges": [
        "(line 1051,col 7)-(line 1051,col 39)",
        "(line 1052,col 7)-(line 1052,col 60)",
        "(line 1054,col 7)-(line 1054,col 31)",
        "(line 1055,col 7)-(line 1061,col 7)",
        "(line 1063,col 7)-(line 1086,col 7)",
        "(line 1088,col 7)-(line 1090,col 7)",
        "(line 1092,col 7)-(line 1092,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1103,
      "end_line": 1105,
      "comment": "\n     * Defines a typed variable. The defining node will be annotated with the\n     * variable\u0027s type or {@code null} if its type is inferred.\n     * @param name the defining node. It must be a {@link Token#NAME}.\n     * @param parent the {@code name}\u0027s parent.\n     * @param type the variable\u0027s type. It may be {@code null}, in which case\n     *     the variable\u0027s type will be inferred.\n     ",
      "child_ranges": [
        "(line 1104,col 7)-(line 1104,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 1119,
      "end_line": 1137,
      "comment": "\n     * Defines a typed variable. The defining node will be annotated with the\n     * variable\u0027s type of {@link JSTypeNative#UNKNOWN_TYPE} if its type is\n     * inferred.\n     *\n     * Slots may be any variable or any qualified name in the global scope.\n     *\n     * @param n the defining NAME or GETPROP node.\n     * @param parent the {@code n}\u0027s parent.\n     * @param type the variable\u0027s type. It may be {@code null} if\n     *     {@code inferred} is {@code true}.\n     ",
      "child_ranges": [
        "(line 1120,col 7)-(line 1120,col 60)",
        "(line 1124,col 7)-(line 1135,col 7)",
        "(line 1136,col 7)-(line 1136,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 1150,
      "end_line": 1247,
      "comment": "\n     * Defines a symbol in the current scope.\n     *\n     * @param n the defining NAME or GETPROP or object literal key node.\n     * @param parent the {@code n}\u0027s parent.\n     * @param variableName The name that this should be known by.\n     * @param type the variable\u0027s type. It may be {@code null} if\n     *     {@code inferred} is {@code true}.\n     * @param inferred Whether the type is inferred or declared.\n     ",
      "child_ranges": [
        "(line 1152,col 7)-(line 1152,col 59)",
        "(line 1154,col 7)-(line 1154,col 59)",
        "(line 1155,col 7)-(line 1158,col 32)",
        "(line 1163,col 7)-(line 1163,col 37)",
        "(line 1164,col 7)-(line 1173,col 7)",
        "(line 1177,col 7)-(line 1177,col 24)",
        "(line 1180,col 7)-(line 1180,col 55)",
        "(line 1181,col 7)-(line 1202,col 7)",
        "(line 1205,col 7)-(line 1205,col 61)",
        "(line 1206,col 7)-(line 1220,col 7)",
        "(line 1222,col 7)-(line 1234,col 7)",
        "(line 1236,col 7)-(line 1246,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.finishConstructorDefinition(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.CompilerInput, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1249,
      "end_line": 1293,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1253,col 70)",
        "(line 1254,col 7)-(line 1254,col 59)",
        "(line 1264,col 7)-(line 1264,col 31)",
        "(line 1266,col 7)-(line 1266,col 57)",
        "(line 1271,col 7)-(line 1271,col 64)",
        "(line 1272,col 7)-(line 1274,col 7)",
        "(line 1276,col 7)-(line 1281,col 43)",
        "(line 1285,col 7)-(line 1292,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.isQnameRootedInGlobalScope(com.google.javascript.rhino.Node)",
      "begin_line": 1298,
      "end_line": 1301,
      "comment": "\n     * Check if the given node is a property of a name in the global scope.\n     ",
      "child_ranges": [
        "(line 1299,col 7)-(line 1299,col 41)",
        "(line 1300,col 7)-(line 1300,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getQnameRootScope(com.google.javascript.rhino.Node)",
      "begin_line": 1306,
      "end_line": 1315,
      "comment": "\n     * Return the scope for the name of the given node.\n     ",
      "child_ranges": [
        "(line 1307,col 7)-(line 1307,col 53)",
        "(line 1308,col 7)-(line 1313,col 7)",
        "(line 1314,col 7)-(line 1314,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getDeclaredType(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1325,
      "end_line": 1378,
      "comment": "\n     * Look for a type declaration on a property assignment\n     * (in an ASSIGN or an object literal key).\n     * @param info The doc info for this property.\n     * @param lValue The l-value node.\n     * @param rValue The node that {@code n} is being initialized to,\n     *     or {@code null} if this is a stub declaration.\n     ",
      "child_ranges": [
        "(line 1327,col 7)-(line 1345,col 7)",
        "(line 1348,col 7)-(line 1375,col 7)",
        "(line 1377,col 7)-(line 1377,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getFunctionType(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1380,
      "end_line": 1384,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 7)-(line 1381,col 48)",
        "(line 1382,col 7)-(line 1382,col 56)",
        "(line 1383,col 7)-(line 1383,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1389,
      "end_line": 1393,
      "comment": "\n     * Look for calls that set a delegate method\u0027s calling convention.\n     ",
      "child_ranges": [
        "(line 1391,col 7)-(line 1392,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.checkForClassDefiningCalls(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1400,
      "end_line": 1473,
      "comment": "\n     * Look for class-defining calls.\n     * Because JS has no \u0027native\u0027 syntax for defining classes,\n     * this is often very coding-convention dependent and business-logic heavy.\n     ",
      "child_ranges": [
        "(line 1401,col 7)-(line 1402,col 54)",
        "(line 1403,col 7)-(line 1429,col 7)",
        "(line 1431,col 7)-(line 1432,col 58)",
        "(line 1433,col 7)-(line 1446,col 7)",
        "(line 1448,col 7)-(line 1449,col 54)",
        "(line 1450,col 7)-(line 1452,col 7)",
        "(line 1454,col 7)-(line 1455,col 51)",
        "(line 1456,col 7)-(line 1472,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.applyDelegateRelationship(com.google.javascript.jscomp.CodingConvention.DelegateRelationship)",
      "begin_line": 1478,
      "end_line": 1514,
      "comment": "\n     * Apply special properties that only apply to delegates.\n     ",
      "child_ranges": [
        "(line 1480,col 7)-(line 1481,col 64)",
        "(line 1482,col 7)-(line 1483,col 67)",
        "(line 1484,col 7)-(line 1485,col 78)",
        "(line 1486,col 7)-(line 1513,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1526,
      "end_line": 1632,
      "comment": "\n     * Declare the symbol for a qualified name in the global scope.\n     *\n     * @param info The doc info for this property.\n     * @param n A top-level GETPROP node (it should not be contained inside\n     *     another GETPROP).\n     * @param parent The parent of {@code n}.\n     * @param rhsValue The node that {@code n} is being initialized to,\n     *     or {@code null} if this is a stub declaration.\n     ",
      "child_ranges": [
        "(line 1528,col 7)-(line 1528,col 41)",
        "(line 1529,col 7)-(line 1529,col 54)",
        "(line 1530,col 7)-(line 1530,col 42)",
        "(line 1531,col 7)-(line 1531,col 53)",
        "(line 1532,col 7)-(line 1532,col 70)",
        "(line 1548,col 7)-(line 1548,col 60)",
        "(line 1549,col 7)-(line 1552,col 7)",
        "(line 1559,col 7)-(line 1584,col 7)",
        "(line 1586,col 7)-(line 1595,col 7)",
        "(line 1597,col 7)-(line 1598,col 47)",
        "(line 1599,col 7)-(line 1631,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.isQualifiedNameInferred(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1661,
      "end_line": 1706,
      "comment": "\n     * Determines whether a qualified name is inferred.\n     * NOTE(nicksantos): Determining whether a property is declared or not\n     * is really really obnoxious.\n     *\n     * The problem is that there are two (equally valid) coding styles:\n     *\n     * (function() {\n     *   /* The authoritative definition of goog.bar. /\n     *   goog.bar \u003d function() {};\n     * })();\n     *\n     * function f() {\n     *   goog.bar();\n     *   /* Reset goog.bar to a no-op. /\n     *   goog.bar \u003d function() {};\n     * }\n     *\n     * In a dynamic language with first-class functions, it\u0027s very difficult\n     * to know which one the user intended without looking at lots of\n     * contextual information (the second example demonstrates a small case\n     * of this, but there are some really pathological cases as well).\n     *\n     * The current algorithm checks if either the declaration has\n     * JsDoc type information, or @const with a known type,\n     * or a function literal with a name we haven\u0027t seen before.\n     ",
      "child_ranges": [
        "(line 1664,col 7)-(line 1666,col 7)",
        "(line 1670,col 7)-(line 1670,col 30)",
        "(line 1671,col 7)-(line 1677,col 7)",
        "(line 1679,col 7)-(line 1704,col 7)",
        "(line 1705,col 7)-(line 1705,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.isConstantSymbol(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 1708,
      "end_line": 1722,
      "comment": "",
      "child_ranges": [
        "(line 1709,col 7)-(line 1711,col 7)",
        "(line 1713,col 7)-(line 1720,col 7)",
        "(line 1721,col 7)-(line 1721,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getObjectSlot(java.lang.String)",
      "begin_line": 1729,
      "end_line": 1737,
      "comment": "\n     * Find the ObjectType associated with the given slot.\n     * @param slotName The name of the slot to find the type in.\n     * @return An object type, or null if this slot does not contain an object.\n     ",
      "child_ranges": [
        "(line 1730,col 7)-(line 1730,col 44)",
        "(line 1731,col 7)-(line 1735,col 7)",
        "(line 1736,col 7)-(line 1736,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.resolveStubDeclarations()",
      "begin_line": 1743,
      "end_line": 1772,
      "comment": "\n     * Resolve any stub declarations to unknown types if we could not\n     * find types for them during traversal.\n     ",
      "child_ranges": [
        "(line 1744,col 7)-(line 1771,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 1778,
      "end_line": 1842,
      "comment": "\n     * Collects all declared properties in a function, and\n     * resolves them relative to the global scope.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 1780,
      "end_line": 1780,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.CollectProperties(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1782,
      "end_line": 1784,
      "comment": "",
      "child_ranges": [
        "(line 1783,col 9)-(line 1783,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1786,
      "end_line": 1800,
      "comment": "",
      "child_ranges": [
        "(line 1788,col 9)-(line 1799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.maybeCollectMember(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1802,
      "end_line": 1841,
      "comment": "",
      "child_ranges": [
        "(line 1804,col 9)-(line 1804,col 58)",
        "(line 1809,col 9)-(line 1813,col 9)",
        "(line 1815,col 9)-(line 1815,col 51)",
        "(line 1819,col 9)-(line 1819,col 56)",
        "(line 1820,col 9)-(line 1824,col 9)",
        "(line 1826,col 9)-(line 1826,col 61)",
        "(line 1828,col 9)-(line 1830,col 9)",
        "(line 1832,col 9)-(line 1832,col 42)",
        "(line 1833,col 9)-(line 1840,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StubDeclaration",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1848,
      "end_line": 1858,
      "comment": "\n   * A stub declaration without any type information.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 1849,
      "end_line": 1849,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExtern"
      ],
      "begin_line": 1850,
      "end_line": 1850,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ownerName"
      ],
      "begin_line": 1851,
      "end_line": 1851,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.StubDeclaration.StubDeclaration(com.google.javascript.rhino.Node, boolean, java.lang.String)",
      "begin_line": 1853,
      "end_line": 1857,
      "comment": "",
      "child_ranges": [
        "(line 1854,col 7)-(line 1854,col 23)",
        "(line 1855,col 7)-(line 1855,col 31)",
        "(line 1856,col 7)-(line 1856,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder"
      ],
      "begin_line": 1864,
      "end_line": 1935,
      "comment": "\n   * A shallow traversal of the global scope to build up all classes,\n   * functions, and methods.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.GlobalScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 1866,
      "end_line": 1868,
      "comment": "",
      "child_ranges": [
        "(line 1867,col 7)-(line 1867,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1878,
      "end_line": 1890,
      "comment": "\n     * Visit a node in the global scope, and add anything it declares to the\n     * global symbol table.\n     *\n     * @param t The current traversal.\n     * @param n The node being visited.\n     * @param parent The parent of n\n     ",
      "child_ranges": [
        "(line 1879,col 7)-(line 1879,col 32)",
        "(line 1881,col 7)-(line 1889,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1892,
      "end_line": 1898,
      "comment": "",
      "child_ranges": [
        "(line 1896,col 7)-(line 1896,col 34)",
        "(line 1897,col 7)-(line 1897,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.checkForTypedef(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1906,
      "end_line": 1934,
      "comment": "\n     * Handle typedefs.\n     * @param t The current traversal.\n     * @param candidate A qualified name node.\n     * @param info JSDoc comments.\n     ",
      "child_ranges": [
        "(line 1908,col 7)-(line 1910,col 7)",
        "(line 1912,col 7)-(line 1912,col 52)",
        "(line 1913,col 7)-(line 1915,col 7)",
        "(line 1920,col 7)-(line 1920,col 53)",
        "(line 1922,col 7)-(line 1922,col 76)",
        "(line 1923,col 7)-(line 1927,col 7)",
        "(line 1929,col 7)-(line 1929,col 60)",
        "(line 1930,col 7)-(line 1933,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder"
      ],
      "begin_line": 1941,
      "end_line": 2065,
      "comment": "\n   * A shallow traversal of a local scope to find all arguments and\n   * local variables.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.LocalScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 1945,
      "end_line": 1947,
      "comment": "\n     * @param scope The scope that we\u0027re building.\n     ",
      "child_ranges": [
        "(line 1946,col 7)-(line 1946,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.build()",
      "begin_line": 1952,
      "end_line": 1973,
      "comment": "\n     * Traverse the scope root and build it.\n     ",
      "child_ranges": [
        "(line 1953,col 7)-(line 1953,col 66)",
        "(line 1955,col 7)-(line 1956,col 58)",
        "(line 1957,col 7)-(line 1972,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1983,
      "end_line": 1993,
      "comment": "\n     * Visit a node in a local scope, and add any local variables or catch\n     * parameters into the local symbol table.\n     *\n     * @param t The node traversal.\n     * @param n The node being visited.\n     * @param parent The parent of n\n     ",
      "child_ranges": [
        "(line 1984,col 7)-(line 1986,col 7)",
        "(line 1987,col 7)-(line 1990,col 7)",
        "(line 1992,col 7)-(line 1992,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.handleFunctionInputs(com.google.javascript.rhino.Node)",
      "begin_line": 1996,
      "end_line": 2015,
      "comment": " Handle bleeding functions and function parameters. ",
      "child_ranges": [
        "(line 1998,col 7)-(line 1998,col 47)",
        "(line 1999,col 7)-(line 1999,col 45)",
        "(line 2000,col 7)-(line 2012,col 7)",
        "(line 2014,col 7)-(line 2014,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.declareArguments(com.google.javascript.rhino.Node)",
      "begin_line": 2020,
      "end_line": 2064,
      "comment": "\n     * Declares all of a function\u0027s arguments.\n     ",
      "child_ranges": [
        "(line 2021,col 7)-(line 2021,col 66)",
        "(line 2022,col 7)-(line 2022,col 35)",
        "(line 2024,col 7)-(line 2026,col 7)",
        "(line 2028,col 7)-(line 2029,col 63)",
        "(line 2030,col 7)-(line 2063,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FirstOrderFunctionAnalyzer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 2071,
      "end_line": 2150,
      "comment": "\n   * Does a first-order function analysis that just looks at simple things\n   * like what variables are escaped, and whether \u0027this\u0027 is used.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 2073,
      "end_line": 2073,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 2074,
      "end_line": 2074,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.FirstOrderFunctionAnalyzer(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents\u003e)",
      "begin_line": 2076,
      "end_line": 2080,
      "comment": "",
      "child_ranges": [
        "(line 2078,col 7)-(line 2078,col 31)",
        "(line 2079,col 7)-(line 2079,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2082,
      "end_line": 2089,
      "comment": "",
      "child_ranges": [
        "(line 2083,col 7)-(line 2088,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 2091,
      "end_line": 2096,
      "comment": "",
      "child_ranges": [
        "(line 2092,col 7)-(line 2095,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2098,
      "end_line": 2149,
      "comment": "",
      "child_ranges": [
        "(line 2099,col 7)-(line 2101,col 7)",
        "(line 2103,col 7)-(line 2105,col 7)",
        "(line 2107,col 7)-(line 2117,col 7)",
        "(line 2119,col 7)-(line 2148,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(com.google.javascript.rhino.Node)",
      "begin_line": 2152,
      "end_line": 2160,
      "comment": "",
      "child_ranges": [
        "(line 2153,col 5)-(line 2155,col 5)",
        "(line 2159,col 5)-(line 2159,col 42)"
      ]
    }
  ]
}