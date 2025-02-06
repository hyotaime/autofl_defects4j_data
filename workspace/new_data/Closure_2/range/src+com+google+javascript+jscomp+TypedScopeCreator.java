{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypedScopeCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedScopeCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopeCreator"
      ],
      "begin_line": 97,
      "end_line": 2087,
      "comment": "\n * Creates the symbol table of variables available in the current scope and\n * their types.\n *\n * Scopes created by this class are very different from scopes created\n * by the syntactic scope creator. These scopes have type information, and\n * include some qualified names in addition to variables\n * (like Class.staticMethod).\n *\n * When building scope information, also declares relevant information\n * about types in the type registry.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DELEGATE_PROXY_SUFFIX"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n   * A suffix for naming delegate proxies differently from their base.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MALFORMED_TYPEDEF"
      ],
      "begin_line": 104,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_INITIALIZER"
      ],
      "begin_line": 109,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CTOR_INITIALIZER"
      ],
      "begin_line": 114,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IFACE_INITIALIZER"
      ],
      "begin_line": 119,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_EXPECTED"
      ],
      "begin_line": 124,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_LENDS"
      ],
      "begin_line": 129,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LENDS_ON_NON_OBJECT"
      ],
      "begin_line": 134,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeParsingErrorReporter"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegateProxyPrototypes"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegateCallingConventions"
      ],
      "begin_line": 145,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionAnalysisResults"
      ],
      "begin_line": 149,
      "end_line": 150,
      "comment": " Simple properties inferred about functions."
    },
    {
      "type": "field",
      "varNames": [
        "unknownType"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " For convenience"
    },
    {
      "type": "class_interface",
      "name": "DeferredSetType",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 159,
      "end_line": 177,
      "comment": "\n   * Defer attachment of types to nodes until all type names\n   * have been resolved. Then, we can resolve the type and attach it.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType.DeferredSetType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 163,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 39)",
        "(line 165,col 7)-(line 165,col 39)",
        "(line 166,col 7)-(line 166,col 23)",
        "(line 167,col 7)-(line 167,col 23)",
        "(line 171,col 7)-(line 171,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DeferredSetType.resolve(com.google.javascript.jscomp.Scope)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 175,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.TypedScopeCreator(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 29)",
        "(line 186,col 5)-(line 186,col 49)",
        "(line 187,col 5)-(line 187,col 45)",
        "(line 188,col 5)-(line 188,col 51)",
        "(line 189,col 5)-(line 189,col 68)",
        "(line 190,col 5)-(line 190,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 197,
      "end_line": 255,
      "comment": "\n   * Creates a scope with all types declared. Declares newly discovered types\n   * and type properties in the type registry.\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 26)",
        "(line 203,col 5)-(line 203,col 45)",
        "(line 204,col 5)-(line 229,col 5)",
        "(line 231,col 5)-(line 231,col 43)",
        "(line 232,col 5)-(line 232,col 32)",
        "(line 237,col 5)-(line 247,col 5)",
        "(line 249,col 5)-(line 253,col 5)",
        "(line 254,col 5)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.patchGlobalScope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 264,
      "end_line": 303,
      "comment": "\n   * Patches a given global scope by removing variables previously declared in\n   * a script and re-traversing a new version of that script.\n   *\n   * @param globalScope The global scope generated by {@code createScope}.\n   * @param scriptRoot The script that is modified.\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 52)",
        "(line 268,col 5)-(line 268,col 44)",
        "(line 269,col 5)-(line 269,col 53)",
        "(line 271,col 5)-(line 271,col 59)",
        "(line 272,col 5)-(line 272,col 43)",
        "(line 273,col 5)-(line 277,col 5)",
        "(line 279,col 5)-(line 280,col 70)",
        "(line 287,col 5)-(line 287,col 50)",
        "(line 288,col 5)-(line 288,col 50)",
        "(line 289,col 5)-(line 294,col 5)",
        "(line 295,col 5)-(line 298,col 5)",
        "(line 301,col 5)-(line 301,col 74)",
        "(line 302,col 5)-(line 302,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.createInitialScope(com.google.javascript.rhino.Node)",
      "begin_line": 309,
      "end_line": 339,
      "comment": "\n   * Create the outermost scope. This scope contains native binding such as\n   * {@code Object}, {@code Date}, etc.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 313,col 68)",
        "(line 315,col 5)-(line 315,col 44)",
        "(line 316,col 5)-(line 316,col 54)",
        "(line 317,col 5)-(line 317,col 63)",
        "(line 318,col 5)-(line 318,col 53)",
        "(line 319,col 5)-(line 319,col 54)",
        "(line 320,col 5)-(line 320,col 59)",
        "(line 321,col 5)-(line 321,col 57)",
        "(line 322,col 5)-(line 322,col 62)",
        "(line 323,col 5)-(line 323,col 55)",
        "(line 324,col 5)-(line 324,col 60)",
        "(line 325,col 5)-(line 325,col 64)",
        "(line 326,col 5)-(line 326,col 55)",
        "(line 327,col 5)-(line 327,col 62)",
        "(line 328,col 5)-(line 328,col 61)",
        "(line 329,col 5)-(line 329,col 59)",
        "(line 330,col 5)-(line 330,col 58)",
        "(line 331,col 5)-(line 331,col 54)",
        "(line 336,col 5)-(line 336,col 71)",
        "(line 338,col 5)-(line 338,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeFunctionType(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 341,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 61)",
        "(line 343,col 5)-(line 343,col 72)",
        "(line 344,col 5)-(line 345,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeValueType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.declareNativeType(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiscoverEnumsAndTypedefs",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 357,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.DiscoverEnumsAndTypedefs(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 365,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 367,col 7)-(line 367,col 27)",
        "(line 368,col 7)-(line 388,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.DiscoverEnumsAndTypedefs.identifyNameNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 391,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 393,col 7)-(line 401,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 406,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 409,
      "end_line": 1769,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n     * The scope that we\u0027re building.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "deferredSetTypes"
      ],
      "begin_line": 417,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nonExternFunctions"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": "\n     * Functions that we found in the global scope and not in externs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lentObjectLiterals"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": "\n     * Object literals with a @lends annotation aren\u0027t analyzed until we\n     * reach the root of the statement they\u0027re defined in.\n     *\n     * This ensures that if there are any @lends annotations on the object\n     * literals, the type on the @lends annotation resolves correctly.\n     *\n     * For more information, see\n     * http://code.google.com/p/closure-compiler/issues/detail?id\u003d314\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stubDeclarations"
      ],
      "begin_line": 443,
      "end_line": 444,
      "comment": "\n     * Type-less stubs.\n     *\n     * If at the end of traversal, we still don\u0027t have types for these\n     * stubs, then we should declare UNKNOWN types.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": "\n     * The current source file that we\u0027re in.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": "\n     * The InputId of the current node.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.AbstractScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.setDeferredType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 7)-(line 461,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.resolveTypes()",
      "begin_line": 464,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 466,col 7)-(line 468,col 7)",
        "(line 471,col 7)-(line 471,col 43)",
        "(line 472,col 7)-(line 474,col 7)",
        "(line 478,col 7)-(line 478,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 481,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 483,col 7)-(line 483,col 31)",
        "(line 484,col 7)-(line 488,col 7)",
        "(line 492,col 7)-(line 493,col 71)",
        "(line 495,col 7)-(line 507,col 7)",
        "(line 509,col 7)-(line 509,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 512,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 514,col 7)-(line 514,col 31)",
        "(line 515,col 7)-(line 515,col 31)",
        "(line 517,col 7)-(line 559,col 7)",
        "(line 562,col 7)-(line 568,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.attachLiteralTypes(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 571,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 572,col 7)-(line 613,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineObjectLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 616,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 618,col 7)-(line 618,col 25)",
        "(line 619,col 7)-(line 619,col 48)",
        "(line 620,col 7)-(line 640,col 7)",
        "(line 642,col 7)-(line 642,col 50)",
        "(line 643,col 7)-(line 643,col 54)",
        "(line 644,col 7)-(line 644,col 61)",
        "(line 645,col 7)-(line 645,col 38)",
        "(line 646,col 7)-(line 649,col 7)",
        "(line 651,col 7)-(line 653,col 7)",
        "(line 655,col 7)-(line 655,col 39)",
        "(line 658,col 7)-(line 659,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.processObjectLitProperties(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, boolean)",
      "begin_line": 670,
      "end_line": 700,
      "comment": "\n     * Process an object literal and all the types on it.\n     * @param objLit The OBJECTLIT node.\n     * @param objLitType The type of the OBJECTLIT node. This might be a named\n     *     type, because of the lends annotation.\n     * @param declareOnOwner If true, declare properties on the objLitType as\n     *     well. If false, the caller should take care of this.\n     ",
      "child_ranges": [
        "(line 673,col 7)-(line 699,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getDeclaredTypeInAnnotation(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 708,
      "end_line": 725,
      "comment": "\n     * Returns the type specified in a JSDoc annotation near a GETPROP or NAME.\n     *\n     * Extracts type information from either the {@code @type} tag or from\n     * the {@code @return} and {@code @param} tags.\n     ",
      "child_ranges": [
        "(line 710,col 7)-(line 710,col 27)",
        "(line 711,col 7)-(line 714,col 15)",
        "(line 715,col 7)-(line 723,col 7)",
        "(line 724,col 7)-(line 724,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.assertDefinitionNode(com.google.javascript.rhino.Node, int)",
      "begin_line": 731,
      "end_line": 734,
      "comment": "\n     * Asserts that it\u0027s OK to define this node\u0027s name.\n     * The node should have a source name and be of the specified type.\n     ",
      "child_ranges": [
        "(line 732,col 7)-(line 732,col 51)",
        "(line 733,col 7)-(line 733,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineCatch(com.google.javascript.rhino.Node)",
      "begin_line": 739,
      "end_line": 745,
      "comment": "\n     * Defines a catch parameter.\n     ",
      "child_ranges": [
        "(line 740,col 7)-(line 740,col 43)",
        "(line 741,col 7)-(line 741,col 41)",
        "(line 742,col 7)-(line 744,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineVar(com.google.javascript.rhino.Node)",
      "begin_line": 750,
      "end_line": 765,
      "comment": "\n     * Defines a VAR initialization.\n     ",
      "child_ranges": [
        "(line 751,col 7)-(line 751,col 41)",
        "(line 752,col 7)-(line 752,col 40)",
        "(line 753,col 7)-(line 764,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineFunctionLiteral(com.google.javascript.rhino.Node)",
      "begin_line": 770,
      "end_line": 790,
      "comment": "\n     * Defines a function literal.\n     ",
      "child_ranges": [
        "(line 771,col 7)-(line 771,col 46)",
        "(line 775,col 7)-(line 775,col 46)",
        "(line 776,col 7)-(line 776,col 52)",
        "(line 777,col 7)-(line 777,col 63)",
        "(line 778,col 7)-(line 779,col 69)",
        "(line 782,col 7)-(line 782,col 39)",
        "(line 787,col 7)-(line 789,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineName(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 800,
      "end_line": 810,
      "comment": "\n     * Defines a variable based on the {@link Token#NAME} node passed.\n     * @param name The {@link Token#NAME} node.\n     * @param var The parent of the {@code name} node, which must be a\n     *     {@link Token#VAR} node.\n     * @param info the {@link JSDocInfo} information relating to this\n     *     {@code name} node.\n     ",
      "child_ranges": [
        "(line 801,col 7)-(line 801,col 40)",
        "(line 804,col 7)-(line 804,col 67)",
        "(line 805,col 7)-(line 808,col 7)",
        "(line 809,col 7)-(line 809,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.shouldUseFunctionLiteralType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 819,
      "end_line": 829,
      "comment": "\n     * If a variable is assigned a function literal in the global scope,\n     * make that a declared type (even if there\u0027s no doc info).\n     * There\u0027s only one exception to this rule:\n     * if the return type is inferred, and we\u0027re in a local\n     * scope, we should assume the whole function is inferred.\n     ",
      "child_ranges": [
        "(line 821,col 7)-(line 823,col 7)",
        "(line 824,col 7)-(line 827,col 7)",
        "(line 828,col 7)-(line 828,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.createFunctionTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 853,
      "end_line": 961,
      "comment": "\n     * Creates a new function type, based on the given nodes.\n     *\n     * This handles two cases that are semantically very different, but\n     * are not mutually exclusive:\n     * - A function literal that needs a type attached to it.\n     * - An assignment expression with function-type info in the JsDoc.\n     *\n     * All parameters are optional, and we will do the best we can to create\n     * a function type.\n     *\n     * This function will always create a function type, so only call it if\n     * you\u0027re sure that\u0027s what you want.\n     *\n     * @param rValue The function node.\n     * @param name the function\u0027s name\n     * @param info the {@link JSDocInfo} attached to the function definition\n     * @param lvalueNode The node where this function is being\n     *     assigned. For example, {@code A.prototype.foo \u003d ...} would be used to\n     *     determine that this function is a method of A.prototype. May be\n     *     null to indicate that this is not being assigned to a qualified name.\n     ",
      "child_ranges": [
        "(line 859,col 7)-(line 859,col 39)",
        "(line 862,col 7)-(line 876,col 7)",
        "(line 878,col 7)-(line 957,col 7)",
        "(line 960,col 7)-(line 960,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.findOverriddenFunction(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 966,
      "end_line": 986,
      "comment": "\n     * Find the function that\u0027s being overridden on this type, if any.\n     ",
      "child_ranges": [
        "(line 970,col 7)-(line 970,col 60)",
        "(line 971,col 7)-(line 983,col 7)",
        "(line 985,col 7)-(line 985,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.createEnumTypeFromNodes(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 1005,
      "end_line": 1049,
      "comment": "\n     * Creates a new enum type, based on the given nodes.\n     *\n     * This handles two cases that are semantically very different, but\n     * are not mutually exclusive:\n     * - An object literal that needs an enum type attached to it.\n     * - An assignment expression with an enum tag in the JsDoc.\n     *\n     * This function will always create an enum type, so only call it if\n     * you\u0027re sure that\u0027s what you want.\n     *\n     * @param rValue The node of the enum.\n     * @param name The enum\u0027s name\n     * @param info The {@link JSDocInfo} attached to the enum definition.\n     * @param lValueNode The node where this function is being\n     *     assigned.\n     ",
      "child_ranges": [
        "(line 1007,col 7)-(line 1007,col 39)",
        "(line 1008,col 7)-(line 1008,col 60)",
        "(line 1010,col 7)-(line 1010,col 31)",
        "(line 1011,col 7)-(line 1017,col 7)",
        "(line 1019,col 7)-(line 1042,col 7)",
        "(line 1044,col 7)-(line 1046,col 7)",
        "(line 1048,col 7)-(line 1048,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1059,
      "end_line": 1061,
      "comment": "\n     * Defines a typed variable. The defining node will be annotated with the\n     * variable\u0027s type or {@code null} if its type is inferred.\n     * @param name the defining node. It must be a {@link Token#NAME}.\n     * @param parent the {@code name}\u0027s parent.\n     * @param type the variable\u0027s type. It may be {@code null}, in which case\n     *     the variable\u0027s type will be inferred.\n     ",
      "child_ranges": [
        "(line 1060,col 7)-(line 1060,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 1075,
      "end_line": 1093,
      "comment": "\n     * Defines a typed variable. The defining node will be annotated with the\n     * variable\u0027s type of {@link JSTypeNative#UNKNOWN_TYPE} if its type is\n     * inferred.\n     *\n     * Slots may be any variable or any qualified name in the global scope.\n     *\n     * @param n the defining NAME or GETPROP node.\n     * @param parent the {@code n}\u0027s parent.\n     * @param type the variable\u0027s type. It may be {@code null} if\n     *     {@code inferred} is {@code true}.\n     ",
      "child_ranges": [
        "(line 1076,col 7)-(line 1076,col 60)",
        "(line 1080,col 7)-(line 1091,col 7)",
        "(line 1092,col 7)-(line 1092,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.defineSlot(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 1106,
      "end_line": 1204,
      "comment": "\n     * Defines a symbol in the current scope.\n     *\n     * @param n the defining NAME or GETPROP or object literal key node.\n     * @param parent the {@code n}\u0027s parent.\n     * @param variableName The name that this should be known by.\n     * @param type the variable\u0027s type. It may be {@code null} if\n     *     {@code inferred} is {@code true}.\n     * @param inferred Whether the type is inferred or declared.\n     ",
      "child_ranges": [
        "(line 1108,col 7)-(line 1108,col 59)",
        "(line 1110,col 7)-(line 1110,col 59)",
        "(line 1111,col 7)-(line 1114,col 32)",
        "(line 1119,col 7)-(line 1119,col 37)",
        "(line 1120,col 7)-(line 1129,col 7)",
        "(line 1133,col 7)-(line 1133,col 43)",
        "(line 1134,col 7)-(line 1134,col 24)",
        "(line 1137,col 7)-(line 1137,col 55)",
        "(line 1138,col 7)-(line 1159,col 7)",
        "(line 1162,col 7)-(line 1162,col 61)",
        "(line 1163,col 7)-(line 1177,col 7)",
        "(line 1179,col 7)-(line 1191,col 7)",
        "(line 1193,col 7)-(line 1203,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.finishConstructorDefinition(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.CompilerInput, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1206,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 7)-(line 1210,col 70)",
        "(line 1211,col 7)-(line 1211,col 59)",
        "(line 1221,col 7)-(line 1221,col 31)",
        "(line 1223,col 7)-(line 1223,col 57)",
        "(line 1228,col 7)-(line 1228,col 64)",
        "(line 1229,col 7)-(line 1231,col 7)",
        "(line 1233,col 7)-(line 1238,col 43)",
        "(line 1242,col 7)-(line 1249,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.isQnameRootedInGlobalScope(com.google.javascript.rhino.Node)",
      "begin_line": 1255,
      "end_line": 1258,
      "comment": "\n     * Check if the given node is a property of a name in the global scope.\n     ",
      "child_ranges": [
        "(line 1256,col 7)-(line 1256,col 41)",
        "(line 1257,col 7)-(line 1257,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getQnameRootScope(com.google.javascript.rhino.Node)",
      "begin_line": 1263,
      "end_line": 1272,
      "comment": "\n     * Return the scope for the name of the given node.\n     ",
      "child_ranges": [
        "(line 1264,col 7)-(line 1264,col 53)",
        "(line 1265,col 7)-(line 1270,col 7)",
        "(line 1271,col 7)-(line 1271,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getDeclaredType(java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1283,
      "end_line": 1337,
      "comment": "\n     * Look for a type declaration on a property assignment\n     * (in an ASSIGN or an object literal key).\n     *\n     * @param info The doc info for this property.\n     * @param lValue The l-value node.\n     * @param rValue The node that {@code n} is being initialized to,\n     *     or {@code null} if this is a stub declaration.\n     ",
      "child_ranges": [
        "(line 1285,col 7)-(line 1334,col 7)",
        "(line 1336,col 7)-(line 1336,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getFunctionType(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1339,
      "end_line": 1343,
      "comment": "",
      "child_ranges": [
        "(line 1340,col 7)-(line 1340,col 48)",
        "(line 1341,col 7)-(line 1341,col 56)",
        "(line 1342,col 7)-(line 1342,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.checkForCallingConventionDefiningCalls(com.google.javascript.rhino.Node, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1348,
      "end_line": 1352,
      "comment": "\n     * Look for calls that set a delegate method\u0027s calling convention.\n     ",
      "child_ranges": [
        "(line 1350,col 7)-(line 1351,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.checkForClassDefiningCalls(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1359,
      "end_line": 1431,
      "comment": "\n     * Look for class-defining calls.\n     * Because JS has no \u0027native\u0027 syntax for defining classes,\n     * this is often very coding-convention dependent and business-logic heavy.\n     ",
      "child_ranges": [
        "(line 1361,col 7)-(line 1362,col 54)",
        "(line 1363,col 7)-(line 1389,col 7)",
        "(line 1391,col 7)-(line 1392,col 58)",
        "(line 1393,col 7)-(line 1406,col 7)",
        "(line 1408,col 7)-(line 1409,col 54)",
        "(line 1410,col 7)-(line 1412,col 7)",
        "(line 1414,col 7)-(line 1415,col 51)",
        "(line 1416,col 7)-(line 1430,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.applyDelegateRelationship(com.google.javascript.jscomp.CodingConvention.DelegateRelationship)",
      "begin_line": 1436,
      "end_line": 1472,
      "comment": "\n     * Apply special properties that only apply to delegates.\n     ",
      "child_ranges": [
        "(line 1438,col 7)-(line 1439,col 64)",
        "(line 1440,col 7)-(line 1441,col 67)",
        "(line 1442,col 7)-(line 1443,col 78)",
        "(line 1444,col 7)-(line 1471,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1484,
      "end_line": 1591,
      "comment": "\n     * Declare the symbol for a qualified name in the global scope.\n     *\n     * @param info The doc info for this property.\n     * @param n A top-level GETPROP node (it should not be contained inside\n     *     another GETPROP).\n     * @param parent The parent of {@code n}.\n     * @param rhsValue The node that {@code n} is being initialized to,\n     *     or {@code null} if this is a stub declaration.\n     ",
      "child_ranges": [
        "(line 1486,col 7)-(line 1486,col 41)",
        "(line 1487,col 7)-(line 1487,col 54)",
        "(line 1488,col 7)-(line 1488,col 42)",
        "(line 1489,col 7)-(line 1489,col 53)",
        "(line 1490,col 7)-(line 1490,col 70)",
        "(line 1506,col 7)-(line 1506,col 79)",
        "(line 1507,col 7)-(line 1510,col 7)",
        "(line 1517,col 7)-(line 1543,col 7)",
        "(line 1545,col 7)-(line 1554,col 7)",
        "(line 1556,col 7)-(line 1557,col 47)",
        "(line 1558,col 7)-(line 1590,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.isQualifiedNameInferred(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1620,
      "end_line": 1663,
      "comment": "\n     * Determines whether a qualified name is inferred.\n     * NOTE(nicksantos): Determining whether a property is declared or not\n     * is really really obnoxious.\n     *\n     * The problem is that there are two (equally valid) coding styles:\n     *\n     * (function() {\n     *   /* The authoritative definition of goog.bar. /\n     *   goog.bar \u003d function() {};\n     * })();\n     *\n     * function f() {\n     *   goog.bar();\n     *   /* Reset goog.bar to a no-op. /\n     *   goog.bar \u003d function() {};\n     * }\n     *\n     * In a dynamic language with first-class functions, it\u0027s very difficult\n     * to know which one the user intended without looking at lots of\n     * contextual information (the second example demonstrates a small case\n     * of this, but there are some really pathological cases as well).\n     *\n     * The current algorithm checks if either the declaration has\n     * JsDoc type information, or @const with a known type,\n     * or a function literal with a name we haven\u0027t seen before.\n     ",
      "child_ranges": [
        "(line 1623,col 7)-(line 1625,col 7)",
        "(line 1627,col 7)-(line 1627,col 30)",
        "(line 1628,col 7)-(line 1634,col 7)",
        "(line 1636,col 7)-(line 1661,col 7)",
        "(line 1662,col 7)-(line 1662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.getObjectSlot(java.lang.String)",
      "begin_line": 1670,
      "end_line": 1678,
      "comment": "\n     * Find the ObjectType associated with the given slot.\n     * @param slotName The name of the slot to find the type in.\n     * @return An object type, or null if this slot does not contain an object.\n     ",
      "child_ranges": [
        "(line 1671,col 7)-(line 1671,col 44)",
        "(line 1672,col 7)-(line 1676,col 7)",
        "(line 1677,col 7)-(line 1677,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.resolveStubDeclarations()",
      "begin_line": 1684,
      "end_line": 1713,
      "comment": "\n     * Resolve any stub declarations to unknown types if we could not\n     * find types for them during traversal.\n     ",
      "child_ranges": [
        "(line 1685,col 7)-(line 1712,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 1719,
      "end_line": 1768,
      "comment": "\n     * Collects all declared properties in a function, and\n     * resolves them relative to the global scope.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "thisType"
      ],
      "begin_line": 1721,
      "end_line": 1721,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.CollectProperties(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1723,
      "end_line": 1725,
      "comment": "",
      "child_ranges": [
        "(line 1724,col 9)-(line 1724,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1727,
      "end_line": 1741,
      "comment": "",
      "child_ranges": [
        "(line 1729,col 9)-(line 1740,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder.CollectProperties.maybeCollectMember(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1743,
      "end_line": 1767,
      "comment": "",
      "child_ranges": [
        "(line 1745,col 9)-(line 1745,col 58)",
        "(line 1750,col 9)-(line 1754,col 9)",
        "(line 1756,col 9)-(line 1756,col 51)",
        "(line 1757,col 9)-(line 1757,col 80)",
        "(line 1758,col 9)-(line 1758,col 42)",
        "(line 1759,col 9)-(line 1766,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StubDeclaration",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1774,
      "end_line": 1784,
      "comment": "\n   * A stub declaration without any type information.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 1775,
      "end_line": 1775,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExtern"
      ],
      "begin_line": 1776,
      "end_line": 1776,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ownerName"
      ],
      "begin_line": 1777,
      "end_line": 1777,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.StubDeclaration.StubDeclaration(com.google.javascript.rhino.Node, boolean, java.lang.String)",
      "begin_line": 1779,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1780,col 7)-(line 1780,col 23)",
        "(line 1781,col 7)-(line 1781,col 31)",
        "(line 1782,col 7)-(line 1782,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder"
      ],
      "begin_line": 1790,
      "end_line": 1861,
      "comment": "\n   * A shallow traversal of the global scope to build up all classes,\n   * functions, and methods.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.GlobalScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 1792,
      "end_line": 1794,
      "comment": "",
      "child_ranges": [
        "(line 1793,col 7)-(line 1793,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1804,
      "end_line": 1816,
      "comment": "\n     * Visit a node in the global scope, and add anything it declares to the\n     * global symbol table.\n     *\n     * @param t The current traversal.\n     * @param n The node being visited.\n     * @param parent The parent of n\n     ",
      "child_ranges": [
        "(line 1805,col 7)-(line 1805,col 32)",
        "(line 1807,col 7)-(line 1815,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.maybeDeclareQualifiedName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1818,
      "end_line": 1824,
      "comment": "",
      "child_ranges": [
        "(line 1822,col 7)-(line 1822,col 34)",
        "(line 1823,col 7)-(line 1823,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.GlobalScopeBuilder.checkForTypedef(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 1832,
      "end_line": 1860,
      "comment": "\n     * Handle typedefs.\n     * @param t The current traversal.\n     * @param candidate A qualified name node.\n     * @param info JSDoc comments.\n     ",
      "child_ranges": [
        "(line 1834,col 7)-(line 1836,col 7)",
        "(line 1838,col 7)-(line 1838,col 52)",
        "(line 1839,col 7)-(line 1841,col 7)",
        "(line 1846,col 7)-(line 1846,col 53)",
        "(line 1848,col 7)-(line 1848,col 76)",
        "(line 1849,col 7)-(line 1853,col 7)",
        "(line 1855,col 7)-(line 1855,col 60)",
        "(line 1856,col 7)-(line 1859,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalScopeBuilder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.TypedScopeCreator.AbstractScopeBuilder"
      ],
      "begin_line": 1867,
      "end_line": 1991,
      "comment": "\n   * A shallow traversal of a local scope to find all arguments and\n   * local variables.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.LocalScopeBuilder(com.google.javascript.jscomp.Scope)",
      "begin_line": 1871,
      "end_line": 1873,
      "comment": "\n     * @param scope The scope that we\u0027re building.\n     ",
      "child_ranges": [
        "(line 1872,col 7)-(line 1872,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.build()",
      "begin_line": 1878,
      "end_line": 1899,
      "comment": "\n     * Traverse the scope root and build it.\n     ",
      "child_ranges": [
        "(line 1879,col 7)-(line 1879,col 66)",
        "(line 1881,col 7)-(line 1882,col 58)",
        "(line 1883,col 7)-(line 1898,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1909,
      "end_line": 1918,
      "comment": "\n     * Visit a node in a local scope, and add any local variables or catch\n     * parameters into the local symbol table.\n     *\n     * @param t The node traversal.\n     * @param n The node being visited.\n     * @param parent The parent of n\n     ",
      "child_ranges": [
        "(line 1910,col 7)-(line 1910,col 43)",
        "(line 1912,col 7)-(line 1915,col 7)",
        "(line 1917,col 7)-(line 1917,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.handleFunctionInputs(com.google.javascript.rhino.Node)",
      "begin_line": 1921,
      "end_line": 1940,
      "comment": " Handle bleeding functions and function parameters. ",
      "child_ranges": [
        "(line 1923,col 7)-(line 1923,col 47)",
        "(line 1924,col 7)-(line 1924,col 45)",
        "(line 1925,col 7)-(line 1937,col 7)",
        "(line 1939,col 7)-(line 1939,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.LocalScopeBuilder.declareArguments(com.google.javascript.rhino.Node)",
      "begin_line": 1945,
      "end_line": 1990,
      "comment": "\n     * Declares all of a function\u0027s arguments.\n     ",
      "child_ranges": [
        "(line 1946,col 7)-(line 1946,col 66)",
        "(line 1947,col 7)-(line 1947,col 35)",
        "(line 1949,col 7)-(line 1951,col 7)",
        "(line 1953,col 7)-(line 1953,col 42)",
        "(line 1954,col 7)-(line 1955,col 63)",
        "(line 1956,col 7)-(line 1989,col 7)"
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
      "begin_line": 1997,
      "end_line": 2076,
      "comment": "\n   * Does a first-order function analysis that just looks at simple things\n   * like what variables are escaped, and whether \u0027this\u0027 is used.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1999,
      "end_line": 1999,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 2000,
      "end_line": 2000,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.FirstOrderFunctionAnalyzer(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents\u003e)",
      "begin_line": 2002,
      "end_line": 2006,
      "comment": "",
      "child_ranges": [
        "(line 2004,col 7)-(line 2004,col 31)",
        "(line 2005,col 7)-(line 2005,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2008,
      "end_line": 2015,
      "comment": "",
      "child_ranges": [
        "(line 2009,col 7)-(line 2014,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 2017,
      "end_line": 2022,
      "comment": "",
      "child_ranges": [
        "(line 2018,col 7)-(line 2021,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.FirstOrderFunctionAnalyzer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2024,
      "end_line": 2075,
      "comment": "",
      "child_ranges": [
        "(line 2025,col 7)-(line 2027,col 7)",
        "(line 2029,col 7)-(line 2031,col 7)",
        "(line 2033,col 7)-(line 2043,col 7)",
        "(line 2045,col 7)-(line 2074,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedScopeCreator.getFunctionAnalysisResults(com.google.javascript.rhino.Node)",
      "begin_line": 2078,
      "end_line": 2086,
      "comment": "",
      "child_ranges": [
        "(line 2079,col 5)-(line 2081,col 5)",
        "(line 2085,col 5)-(line 2085,col 42)"
      ]
    }
  ]
}