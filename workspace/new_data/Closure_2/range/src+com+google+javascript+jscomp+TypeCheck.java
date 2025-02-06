{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypeCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 55,
      "end_line": 2005,
      "comment": "\n * \u003cp\u003eChecks the types of JS expressions against any declared type\n * information.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNEXPECTED_TOKEN"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_DELETE"
      ],
      "begin_line": 69,
      "end_line": 72,
      "comment": " TODO(nicksantos): delete this"
    },
    {
      "type": "field",
      "varNames": [
        "OVERRIDING_PROTOTYPE_WITH_NON_OBJECT"
      ],
      "begin_line": 79,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DETERMINISTIC_TEST"
      ],
      "begin_line": 84,
      "end_line": 89,
      "comment": " TypedScopeCreator has been merged with the type checker."
    },
    {
      "type": "field",
      "varNames": [
        "DETERMINISTIC_TEST_NO_RESULT"
      ],
      "begin_line": 91,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTENT_ENUM_ELEMENT"
      ],
      "begin_line": 98,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTENT_PROPERTY"
      ],
      "begin_line": 105,
      "end_line": 108,
      "comment": " well-typed externs."
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_CONSTRUCTOR"
      ],
      "begin_line": 110,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BIT_OPERATION"
      ],
      "begin_line": 115,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_CALLABLE"
      ],
      "begin_line": 120,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_NOT_CALLABLE"
      ],
      "begin_line": 125,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_MASKS_VARIABLE"
      ],
      "begin_line": 130,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLE_VAR_DEF"
      ],
      "begin_line": 135,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_DUP"
      ],
      "begin_line": 139,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_NOT_CONSTANT"
      ],
      "begin_line": 142,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_INTERFACE_MEMBER_DECLARATION"
      ],
      "begin_line": 146,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_FUNCTION_NOT_EMPTY"
      ],
      "begin_line": 152,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_EXTENDED_TYPE"
      ],
      "begin_line": 157,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_IMPLEMENTED_TYPE"
      ],
      "begin_line": 162,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_IMPLEMENTED_TYPE"
      ],
      "begin_line": 168,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_SUPERCLASS_PROPERTY"
      ],
      "begin_line": 173,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_INTERFACE_PROPERTY"
      ],
      "begin_line": 179,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_SUPERCLASS_PROPERTY_MISMATCH"
      ],
      "begin_line": 185,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_OVERRIDE"
      ],
      "begin_line": 192,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_METHOD_OVERRIDE"
      ],
      "begin_line": 197,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_EXPR_TYPE"
      ],
      "begin_line": 202,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNRESOLVED_TYPE"
      ],
      "begin_line": 206,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WRONG_ARGUMENT_COUNT"
      ],
      "begin_line": 210,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_IMPLICIT_CAST"
      ],
      "begin_line": 216,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INCOMPATIBLE_EXTENDED_PROPERTY_TYPE"
      ],
      "begin_line": 222,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_THIS_TYPE"
      ],
      "begin_line": 228,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IN_USED_WITH_STRUCT"
      ],
      "begin_line": 233,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_PROPERTY_CREATION"
      ],
      "begin_line": 237,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_OBJLIT_KEY"
      ],
      "begin_line": 242,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_DIAGNOSTICS"
      ],
      "begin_line": 247,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseInterpreter"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "topScope"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeCreator"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingOverride"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportUnknownTypes"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingProperties"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " explicitly turned off."
    },
    {
      "type": "field",
      "varNames": [
        "inferJSDocInfo"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typedCount"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " These fields are used to calculate the percentage of expressions typed."
    },
    {
      "type": "field",
      "varNames": [
        "nullCount"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownCount"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noTypeCheckSection"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " code."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.MemoizedScopeCreator, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 315,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 322,col 29)",
        "(line 323,col 5)-(line 323,col 49)",
        "(line 324,col 5)-(line 324,col 49)",
        "(line 325,col 5)-(line 325,col 37)",
        "(line 326,col 5)-(line 326,col 29)",
        "(line 327,col 5)-(line 327,col 37)",
        "(line 328,col 5)-(line 328,col 55)",
        "(line 329,col 5)-(line 329,col 49)",
        "(line 330,col 5)-(line 330,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 339,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 346,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.reportMissingProperties(boolean)",
      "begin_line": 350,
      "end_line": 353,
      "comment": " Turn on the missing property check. Returns this for easy chaining. ",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 37)",
        "(line 352,col 5)-(line 352,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 362,
      "end_line": 376,
      "comment": "\n   * Main entry point for this phase of processing. This follows the pattern for\n   * JSCompiler phases.\n   *\n   * @param externsRoot The root of the externs parse tree.\n   * @param jsRoot The root of the input parse tree to be checked.\n   ",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 45)",
        "(line 365,col 5)-(line 365,col 41)",
        "(line 367,col 5)-(line 367,col 43)",
        "(line 368,col 5)-(line 368,col 51)",
        "(line 369,col 5)-(line 370,col 67)",
        "(line 372,col 5)-(line 374,col 5)",
        "(line 375,col 5)-(line 375,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 379,
      "end_line": 396,
      "comment": " Main entry point of this phase for testing code. ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 51)",
        "(line 381,col 5)-(line 381,col 47)",
        "(line 383,col 5)-(line 383,col 57)",
        "(line 384,col 5)-(line 384,col 47)",
        "(line 386,col 5)-(line 386,col 77)",
        "(line 387,col 5)-(line 387,col 64)",
        "(line 389,col 5)-(line 390,col 52)",
        "(line 392,col 5)-(line 392,col 43)",
        "(line 393,col 5)-(line 393,col 33)",
        "(line 395,col 5)-(line 395,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.check(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 399,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 400,col 37)",
        "(line 402,col 5)-(line 402,col 70)",
        "(line 403,col 5)-(line 403,col 24)",
        "(line 404,col 5)-(line 404,col 40)",
        "(line 405,col 5)-(line 409,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 413,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 430,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 433,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 437,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 440,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 37)",
        "(line 444,col 5)-(line 463,col 5)",
        "(line 464,col 5)-(line 464,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 477,
      "end_line": 854,
      "comment": "\n   * This is the meat of the type checking.  It is basically one big switch,\n   * with each case representing one type of parse tree node.  The individual\n   * cases are usually pretty straightforward.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of the node n.\n   ",
      "child_ranges": [
        "(line 479,col 5)-(line 479,col 21)",
        "(line 480,col 5)-(line 480,col 31)",
        "(line 481,col 5)-(line 481,col 21)",
        "(line 483,col 5)-(line 483,col 28)",
        "(line 485,col 5)-(line 844,col 5)",
        "(line 847,col 5)-(line 847,col 38)",
        "(line 849,col 5)-(line 851,col 5)",
        "(line 853,col 5)-(line 853,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkTypeofString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 856,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 857,col 5)-(line 861,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 868,
      "end_line": 881,
      "comment": "\n   * Counts the given node in the typed statistics.\n   * @param n a node that should be typed\n   ",
      "child_ranges": [
        "(line 869,col 5)-(line 869,col 32)",
        "(line 870,col 5)-(line 880,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 891,
      "end_line": 1001,
      "comment": "\n   * Visits an assignment \u003ccode\u003elvalue \u003d rvalue\u003c/code\u003e. If the\n   * \u003ccode\u003elvalue\u003c/code\u003e is a prototype modification, we change the schema\n   * of the object type it is referring to.\n   * @param t the traversal\n   * @param assign the assign node\n   * (\u003ccode\u003eassign.isAssign()\u003c/code\u003e is an implicit invariant)\n   ",
      "child_ranges": [
        "(line 892,col 5)-(line 892,col 43)",
        "(line 893,col 5)-(line 893,col 41)",
        "(line 894,col 5)-(line 894,col 40)",
        "(line 897,col 5)-(line 963,col 5)",
        "(line 970,col 5)-(line 970,col 40)",
        "(line 971,col 5)-(line 990,col 5)",
        "(line 993,col 5)-(line 993,col 44)",
        "(line 994,col 5)-(line 994,col 45)",
        "(line 995,col 5)-(line 1000,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1004,
      "end_line": 1017,
      "comment": " Check that we don\u0027t create new properties on structs. ",
      "child_ranges": [
        "(line 1005,col 5)-(line 1016,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1019,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 5)-(line 1047,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1059,
      "end_line": 1128,
      "comment": "\n   * Visits an object literal field definition \u003ccode\u003ekey : value\u003c/code\u003e.\n   *\n   * If the \u003ccode\u003elvalue\u003c/code\u003e is a prototype modification, we change the\n   * schema of the object type it is referring to.\n   *\n   * @param t the traversal\n   * @param key the assign node\n   ",
      "child_ranges": [
        "(line 1063,col 5)-(line 1066,col 5)",
        "(line 1069,col 5)-(line 1073,col 5)",
        "(line 1080,col 5)-(line 1080,col 38)",
        "(line 1081,col 5)-(line 1082,col 32)",
        "(line 1083,col 5)-(line 1085,col 5)",
        "(line 1087,col 5)-(line 1087,col 24)",
        "(line 1091,col 5)-(line 1091,col 36)",
        "(line 1093,col 5)-(line 1093,col 38)",
        "(line 1094,col 5)-(line 1097,col 5)",
        "(line 1099,col 5)-(line 1101,col 50)",
        "(line 1102,col 5)-(line 1106,col 5)",
        "(line 1114,col 5)-(line 1114,col 42)",
        "(line 1115,col 5)-(line 1116,col 51)",
        "(line 1117,col 5)-(line 1127,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 1134,
      "end_line": 1142,
      "comment": "\n   * Returns true if any type in the chain has an implicitCast annotation for\n   * the given property.\n   ",
      "child_ranges": [
        "(line 1135,col 5)-(line 1140,col 5)",
        "(line 1141,col 5)-(line 1141,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1150,
      "end_line": 1268,
      "comment": "\n   * Given a constructor type and a property name, check that the property has\n   * the JSDoc annotation @override iff the property is declared on a\n   * superclass. Several checks regarding inheritance correctness are also\n   * performed.\n   ",
      "child_ranges": [
        "(line 1155,col 5)-(line 1157,col 5)",
        "(line 1159,col 5)-(line 1159,col 66)",
        "(line 1160,col 5)-(line 1161,col 63)",
        "(line 1162,col 5)-(line 1163,col 74)",
        "(line 1166,col 5)-(line 1166,col 46)",
        "(line 1167,col 5)-(line 1167,col 54)",
        "(line 1168,col 5)-(line 1177,col 5)",
        "(line 1178,col 5)-(line 1178,col 65)",
        "(line 1180,col 5)-(line 1180,col 43)",
        "(line 1181,col 5)-(line 1206,col 5)",
        "(line 1208,col 5)-(line 1213,col 5)",
        "(line 1215,col 5)-(line 1216,col 63)",
        "(line 1217,col 5)-(line 1220,col 66)",
        "(line 1221,col 5)-(line 1230,col 5)",
        "(line 1233,col 5)-(line 1267,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1274,
      "end_line": 1296,
      "comment": "\n   * Given a constructor or an interface type, find out whether the unknown\n   * type is a supertype of the current type.\n   ",
      "child_ranges": [
        "(line 1275,col 5)-(line 1275,col 76)",
        "(line 1276,col 5)-(line 1276,col 55)",
        "(line 1280,col 5)-(line 1295,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1304,
      "end_line": 1333,
      "comment": "\n   * Visits an ASSIGN node for cases such as\n   * \u003cpre\u003e\n   * interface.property2.property \u003d ...;\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1307,col 5)-(line 1307,col 42)",
        "(line 1315,col 5)-(line 1316,col 63)",
        "(line 1317,col 5)-(line 1325,col 5)",
        "(line 1327,col 5)-(line 1332,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1344,
      "end_line": 1373,
      "comment": "\n   * Visits a NAME node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of the node n.\n   * @return whether the node is typeable or not\n   ",
      "child_ranges": [
        "(line 1352,col 5)-(line 1352,col 42)",
        "(line 1353,col 5)-(line 1358,col 5)",
        "(line 1360,col 5)-(line 1360,col 32)",
        "(line 1361,col 5)-(line 1370,col 5)",
        "(line 1371,col 5)-(line 1371,col 28)",
        "(line 1372,col 5)-(line 1372,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1383,
      "end_line": 1399,
      "comment": "\n   * Visits a GETPROP node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of \u003ccode\u003en\u003c/code\u003e\n   ",
      "child_ranges": [
        "(line 1388,col 5)-(line 1388,col 37)",
        "(line 1389,col 5)-(line 1389,col 37)",
        "(line 1390,col 5)-(line 1390,col 42)",
        "(line 1392,col 5)-(line 1397,col 5)",
        "(line 1398,col 5)-(line 1398,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1408,
      "end_line": 1436,
      "comment": "\n   * Emit a warning if we can prove that a property cannot possibly be\n   * defined on an object. Note the difference between JS and a strictly\n   * statically typed language: we\u0027re checking if the property\n   * *cannot be defined*, whereas a java compiler would check if the\n   * property *can be undefined*.\n   ",
      "child_ranges": [
        "(line 1414,col 5)-(line 1414,col 35)",
        "(line 1415,col 5)-(line 1435,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1438,
      "end_line": 1447,
      "comment": "",
      "child_ranges": [
        "(line 1440,col 5)-(line 1446,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.isPropertyTest(com.google.javascript.rhino.Node)",
      "begin_line": 1455,
      "end_line": 1481,
      "comment": "\n   * Determines whether this node is testing for the existence of a property.\n   * If true, we will not emit warnings about a missing property.\n   *\n   * @param getProp The GETPROP being tested.\n   ",
      "child_ranges": [
        "(line 1456,col 5)-(line 1456,col 38)",
        "(line 1457,col 5)-(line 1479,col 5)",
        "(line 1480,col 5)-(line 1480,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1490,
      "end_line": 1494,
      "comment": "\n   * Visits a GETELEM node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1491,col 5)-(line 1492,col 73)",
        "(line 1493,col 5)-(line 1493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1503,
      "end_line": 1532,
      "comment": "\n   * Visits a VAR node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1507,col 5)-(line 1507,col 66)",
        "(line 1508,col 5)-(line 1531,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1537,
      "end_line": 1552,
      "comment": "\n   * Visits a NEW node.\n   ",
      "child_ranges": [
        "(line 1538,col 5)-(line 1538,col 41)",
        "(line 1539,col 5)-(line 1539,col 72)",
        "(line 1540,col 5)-(line 1551,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, java.util.HashMap\u003cjava.lang.String, com.google.javascript.rhino.jstype.ObjectType\u003e, java.util.HashMap\u003cjava.lang.String, com.google.javascript.rhino.jstype.ObjectType\u003e, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1566,
      "end_line": 1592,
      "comment": "\n   * Check whether there\u0027s any property conflict for for a particular super\n   * interface\n   * @param t The node traversal object that supplies context\n   * @param n The node being visited\n   * @param functionName The function name being checked\n   * @param properties The property names in the super interfaces that have\n   * been visited\n   * @param currentProperties The property names in the super interface\n   * that have been visited\n   * @param interfaceType The super interface that is being visited\n   ",
      "child_ranges": [
        "(line 1570,col 5)-(line 1570,col 68)",
        "(line 1571,col 5)-(line 1571,col 37)",
        "(line 1574,col 7)-(line 1574,col 65)",
        "(line 1575,col 5)-(line 1587,col 5)",
        "(line 1588,col 5)-(line 1591,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1601,
      "end_line": 1670,
      "comment": "\n   * Visits a {@link Token#FUNCTION} node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1602,col 5)-(line 1602,col 74)",
        "(line 1603,col 5)-(line 1603,col 63)",
        "(line 1604,col 5)-(line 1669,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1679,
      "end_line": 1732,
      "comment": "\n   * Visits a CALL node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1680,col 5)-(line 1680,col 35)",
        "(line 1681,col 5)-(line 1681,col 71)",
        "(line 1683,col 5)-(line 1687,col 5)",
        "(line 1691,col 5)-(line 1727,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitParameterList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1737,
      "end_line": 1771,
      "comment": "\n   * Visits the parameters of a CALL or a NEW node.\n   ",
      "child_ranges": [
        "(line 1739,col 5)-(line 1739,col 58)",
        "(line 1740,col 5)-(line 1740,col 21)",
        "(line 1742,col 5)-(line 1742,col 72)",
        "(line 1743,col 5)-(line 1743,col 20)",
        "(line 1744,col 5)-(line 1744,col 26)",
        "(line 1745,col 5)-(line 1745,col 25)",
        "(line 1746,col 5)-(line 1759,col 5)",
        "(line 1761,col 5)-(line 1761,col 43)",
        "(line 1762,col 5)-(line 1762,col 49)",
        "(line 1763,col 5)-(line 1763,col 49)",
        "(line 1764,col 5)-(line 1770,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1780,
      "end_line": 1808,
      "comment": "\n   * Visits a RETURN node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1781,col 5)-(line 1781,col 56)",
        "(line 1783,col 5)-(line 1807,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(int, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1820,
      "end_line": 1874,
      "comment": "\n   * This function unifies the type checking involved in the core binary\n   * operators and the corresponding assignment operators.  The representation\n   * used internally is such that common code can handle both kinds of\n   * operators easily.\n   *\n   * @param op The operator.\n   * @param t The traversal object, needed to report errors.\n   * @param n The node being checked.\n   ",
      "child_ranges": [
        "(line 1821,col 5)-(line 1821,col 34)",
        "(line 1822,col 5)-(line 1822,col 38)",
        "(line 1823,col 5)-(line 1823,col 34)",
        "(line 1824,col 5)-(line 1824,col 40)",
        "(line 1825,col 5)-(line 1872,col 5)",
        "(line 1873,col 5)-(line 1873,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 1891,
      "end_line": 1908,
      "comment": "\n   * \u003cp\u003eChecks enum aliases.\n   *\n   * \u003cp\u003eWe verify that the enum element type of the enum used\n   * for initialization is a subtype of the enum element type of\n   * the enum the value is being copied in.\u003c/p\u003e\n   *\n   * \u003cp\u003eExample:\u003c/p\u003e\n   * \u003cpre\u003evar myEnum \u003d myOtherEnum;\u003c/pre\u003e\n   *\n   * \u003cp\u003eEnum aliases are irregular, so we need special code for this :(\u003c/p\u003e\n   *\n   * @param value the value used for initialization of the enum\n   ",
      "child_ranges": [
        "(line 1893,col 5)-(line 1895,col 5)",
        "(line 1897,col 5)-(line 1897,col 40)",
        "(line 1898,col 5)-(line 1900,col 5)",
        "(line 1902,col 5)-(line 1902,col 57)",
        "(line 1903,col 5)-(line 1904,col 59)",
        "(line 1905,col 5)-(line 1907,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 1914,
      "end_line": 1925,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 1915,col 5)-(line 1915,col 34)",
        "(line 1916,col 5)-(line 1924,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1937,
      "end_line": 1939,
      "comment": "\n   * Ensure that the given node has a type. If it does not have one,\n   * attach the UNKNOWN_TYPE.\n   ",
      "child_ranges": [
        "(line 1938,col 5)-(line 1938,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "",
      "child_ranges": [
        "(line 1942,col 5)-(line 1942,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1963,
      "end_line": 1991,
      "comment": "\n   * Enforces type casts, and ensures the node is typed.\n   *\n   * A cast in the way that we use it in JSDoc annotations never\n   * alters the generated code and therefore never can induce any runtime\n   * operation. What this means is that a \u0027cast\u0027 is really just a compile\n   * time constraint on the underlying value. In the future, we may add\n   * support for run-time casts for compiled tests.\n   *\n   * To ensure some shred of sanity, we enforce the notion that the\n   * type you are casting to may only meaningfully be a narrower type\n   * than the underlying declared type. We also invalidate optimizations\n   * on bad type casts.\n   *\n   * @param t The traversal object needed to report errors.\n   * @param n The node getting a type assigned to it.\n   * @param type The type to be assigned.\n   ",
      "child_ranges": [
        "(line 1965,col 5)-(line 1967,col 34)",
        "(line 1968,col 5)-(line 1968,col 38)",
        "(line 1969,col 5)-(line 1986,col 5)",
        "(line 1988,col 5)-(line 1990,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getTypedPercent()",
      "begin_line": 1997,
      "end_line": 2000,
      "comment": "\n   * Returns the percentage of nodes typed by the type checker.\n   * @return a number between 0.0 and 100.0\n   ",
      "child_ranges": [
        "(line 1998,col 5)-(line 1998,col 54)",
        "(line 1999,col 5)-(line 1999,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 2002,
      "end_line": 2004,
      "comment": "",
      "child_ranges": [
        "(line 2003,col 5)-(line 2003,col 46)"
      ]
    }
  ]
}