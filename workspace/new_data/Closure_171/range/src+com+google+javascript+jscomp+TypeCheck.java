{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TypeCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 58,
      "end_line": 2118,
      "comment": "\n * \u003cp\u003eChecks the types of JS expressions against any declared type\n * information.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNEXPECTED_TOKEN"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OVERRIDING_PROTOTYPE_WITH_NON_OBJECT"
      ],
      "begin_line": 72,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DETERMINISTIC_TEST"
      ],
      "begin_line": 77,
      "end_line": 82,
      "comment": " TypedScopeCreator has been merged with the type checker."
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTENT_ENUM_ELEMENT"
      ],
      "begin_line": 84,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTENT_PROPERTY"
      ],
      "begin_line": 91,
      "end_line": 94,
      "comment": " well-typed externs."
    },
    {
      "type": "field",
      "varNames": [
        "INEXISTENT_PROPERTY_WITH_SUGGESTION"
      ],
      "begin_line": 96,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_CONSTRUCTOR"
      ],
      "begin_line": 101,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BIT_OPERATION"
      ],
      "begin_line": 106,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_CALLABLE"
      ],
      "begin_line": 111,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTOR_NOT_CALLABLE"
      ],
      "begin_line": 116,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_MASKS_VARIABLE"
      ],
      "begin_line": 121,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPLE_VAR_DEF"
      ],
      "begin_line": 126,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_DUP"
      ],
      "begin_line": 130,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENUM_NOT_CONSTANT"
      ],
      "begin_line": 133,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_INTERFACE_MEMBER_DECLARATION"
      ],
      "begin_line": 137,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_FUNCTION_NOT_EMPTY"
      ],
      "begin_line": 143,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_SHAPE_TYPE"
      ],
      "begin_line": 148,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_EXTENDED_TYPE"
      ],
      "begin_line": 153,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONFLICTING_IMPLEMENTED_TYPE"
      ],
      "begin_line": 158,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_IMPLEMENTED_TYPE"
      ],
      "begin_line": 164,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_SUPERCLASS_PROPERTY"
      ],
      "begin_line": 169,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_INTERFACE_PROPERTY"
      ],
      "begin_line": 175,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_SUPERCLASS_PROPERTY_MISMATCH"
      ],
      "begin_line": 181,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_OVERRIDE"
      ],
      "begin_line": 188,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_METHOD_OVERRIDE"
      ],
      "begin_line": 193,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_EXPR_TYPE"
      ],
      "begin_line": 198,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNRESOLVED_TYPE"
      ],
      "begin_line": 202,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WRONG_ARGUMENT_COUNT"
      ],
      "begin_line": 206,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_IMPLICIT_CAST"
      ],
      "begin_line": 212,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INCOMPATIBLE_EXTENDED_PROPERTY_TYPE"
      ],
      "begin_line": 218,
      "end_line": 222,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXPECTED_THIS_TYPE"
      ],
      "begin_line": 224,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "IN_USED_WITH_STRUCT"
      ],
      "begin_line": 229,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_PROPERTY_CREATION"
      ],
      "begin_line": 233,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_OBJLIT_KEY"
      ],
      "begin_line": 238,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_DIAGNOSTICS"
      ],
      "begin_line": 246,
      "end_line": 282,
      "comment": " change DiagnosticGroups.setWarningLevel to not accidentally enable it."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseInterpreter"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "topScope"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeCreator"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingOverride"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportUnknownTypes"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportMissingProperties"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " explicitly turned off."
    },
    {
      "type": "field",
      "varNames": [
        "inferJSDocInfo"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typedCount"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " These fields are used to calculate the percentage of expressions typed."
    },
    {
      "type": "field",
      "varNames": [
        "nullCount"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownCount"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noTypeCheckSection"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " code."
    },
    {
      "type": "field",
      "varNames": [
        "editDistance"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "SuggestionPair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 315,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suggestion"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "distance"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.SuggestionPair.SuggestionPair(java.lang.String, int)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 319,col 35)",
        "(line 320,col 7)-(line 320,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.MemoizedScopeCreator, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 324,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 29)",
        "(line 331,col 5)-(line 331,col 49)",
        "(line 332,col 5)-(line 332,col 49)",
        "(line 333,col 5)-(line 333,col 37)",
        "(line 334,col 5)-(line 334,col 29)",
        "(line 335,col 5)-(line 335,col 37)",
        "(line 336,col 5)-(line 336,col 55)",
        "(line 337,col 5)-(line 338,col 47)",
        "(line 339,col 5)-(line 339,col 55)",
        "(line 341,col 5)-(line 341,col 63)",
        "(line 342,col 5)-(line 349,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 352,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 357,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeCheck.TypeCheck(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 360,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 363,col 5)-(line 364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.reportMissingProperties(boolean)",
      "begin_line": 368,
      "end_line": 371,
      "comment": " Turn on the missing property check. Returns this for easy chaining. ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 37)",
        "(line 370,col 5)-(line 370,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 380,
      "end_line": 394,
      "comment": "\n   * Main entry point for this phase of processing. This follows the pattern for\n   * JSCompiler phases.\n   *\n   * @param externsRoot The root of the externs parse tree.\n   * @param jsRoot The root of the input parse tree to be checked.\n   ",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 45)",
        "(line 383,col 5)-(line 383,col 41)",
        "(line 385,col 5)-(line 385,col 43)",
        "(line 386,col 5)-(line 386,col 51)",
        "(line 387,col 5)-(line 388,col 67)",
        "(line 390,col 5)-(line 392,col 5)",
        "(line 393,col 5)-(line 393,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 397,
      "end_line": 414,
      "comment": " Main entry point of this phase for testing code. ",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 51)",
        "(line 399,col 5)-(line 399,col 47)",
        "(line 401,col 5)-(line 401,col 57)",
        "(line 402,col 5)-(line 402,col 47)",
        "(line 404,col 5)-(line 404,col 77)",
        "(line 405,col 5)-(line 405,col 64)",
        "(line 407,col 5)-(line 408,col 52)",
        "(line 410,col 5)-(line 410,col 43)",
        "(line 411,col 5)-(line 411,col 33)",
        "(line 413,col 5)-(line 413,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.check(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 417,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 37)",
        "(line 420,col 5)-(line 420,col 70)",
        "(line 421,col 5)-(line 421,col 24)",
        "(line 422,col 5)-(line 422,col 40)",
        "(line 423,col 5)-(line 427,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 431,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 432,col 5)-(line 448,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 451,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 455,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 458,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 37)",
        "(line 462,col 5)-(line 481,col 5)",
        "(line 482,col 5)-(line 482,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 495,
      "end_line": 876,
      "comment": "\n   * This is the meat of the type checking.  It is basically one big switch,\n   * with each case representing one type of parse tree node.  The individual\n   * cases are usually pretty straightforward.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of the node n.\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 497,col 21)",
        "(line 498,col 5)-(line 498,col 31)",
        "(line 499,col 5)-(line 499,col 21)",
        "(line 501,col 5)-(line 501,col 28)",
        "(line 503,col 5)-(line 866,col 5)",
        "(line 869,col 5)-(line 869,col 38)",
        "(line 871,col 5)-(line 873,col 5)",
        "(line 875,col 5)-(line 875,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkTypeofString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 878,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 879,col 5)-(line 883,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 890,
      "end_line": 902,
      "comment": "\n   * Counts the given node in the typed statistics.\n   * @param n a node that should be typed\n   ",
      "child_ranges": [
        "(line 891,col 5)-(line 891,col 32)",
        "(line 892,col 5)-(line 901,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 912,
      "end_line": 1021,
      "comment": "\n   * Visits an assignment \u003ccode\u003elvalue \u003d rvalue\u003c/code\u003e. If the\n   * \u003ccode\u003elvalue\u003c/code\u003e is a prototype modification, we change the schema\n   * of the object type it is referring to.\n   * @param t the traversal\n   * @param assign the assign node\n   * (\u003ccode\u003eassign.isAssign()\u003c/code\u003e is an implicit invariant)\n   ",
      "child_ranges": [
        "(line 913,col 5)-(line 913,col 43)",
        "(line 914,col 5)-(line 914,col 41)",
        "(line 915,col 5)-(line 915,col 40)",
        "(line 918,col 5)-(line 984,col 5)",
        "(line 991,col 5)-(line 991,col 40)",
        "(line 992,col 5)-(line 1010,col 5)",
        "(line 1013,col 5)-(line 1013,col 44)",
        "(line 1014,col 5)-(line 1014,col 45)",
        "(line 1015,col 5)-(line 1020,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1030,
      "end_line": 1062,
      "comment": "\n   * After a struct object is created, we can\u0027t add new properties to it, with\n   * one exception. We allow creation of \"static\" properties like\n   * Foo.prototype.bar \u003d baz;\n   * where Foo.prototype is a struct, if the assignment happens at the top level\n   * and the constructor Foo is defined in the same file.\n   ",
      "child_ranges": [
        "(line 1031,col 5)-(line 1061,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1064,
      "end_line": 1093,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 5)-(line 1092,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1104,
      "end_line": 1173,
      "comment": "\n   * Visits an object literal field definition \u003ccode\u003ekey : value\u003c/code\u003e.\n   *\n   * If the \u003ccode\u003elvalue\u003c/code\u003e is a prototype modification, we change the\n   * schema of the object type it is referring to.\n   *\n   * @param t the traversal\n   * @param key the assign node\n   ",
      "child_ranges": [
        "(line 1108,col 5)-(line 1111,col 5)",
        "(line 1114,col 5)-(line 1118,col 5)",
        "(line 1125,col 5)-(line 1125,col 38)",
        "(line 1126,col 5)-(line 1127,col 32)",
        "(line 1128,col 5)-(line 1130,col 5)",
        "(line 1132,col 5)-(line 1132,col 24)",
        "(line 1136,col 5)-(line 1136,col 36)",
        "(line 1138,col 5)-(line 1138,col 38)",
        "(line 1139,col 5)-(line 1142,col 5)",
        "(line 1144,col 5)-(line 1146,col 50)",
        "(line 1147,col 5)-(line 1151,col 5)",
        "(line 1159,col 5)-(line 1159,col 42)",
        "(line 1160,col 5)-(line 1161,col 51)",
        "(line 1162,col 5)-(line 1172,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 1179,
      "end_line": 1187,
      "comment": "\n   * Returns true if any type in the chain has an implicitCast annotation for\n   * the given property.\n   ",
      "child_ranges": [
        "(line 1180,col 5)-(line 1185,col 5)",
        "(line 1186,col 5)-(line 1186,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1195,
      "end_line": 1320,
      "comment": "\n   * Given a constructor type and a property name, check that the property has\n   * the JSDoc annotation @override iff the property is declared on a\n   * superclass. Several checks regarding inheritance correctness are also\n   * performed.\n   ",
      "child_ranges": [
        "(line 1200,col 5)-(line 1202,col 5)",
        "(line 1204,col 5)-(line 1204,col 66)",
        "(line 1205,col 5)-(line 1206,col 63)",
        "(line 1207,col 5)-(line 1208,col 74)",
        "(line 1211,col 5)-(line 1211,col 46)",
        "(line 1212,col 5)-(line 1212,col 54)",
        "(line 1213,col 5)-(line 1222,col 5)",
        "(line 1223,col 5)-(line 1223,col 65)",
        "(line 1225,col 5)-(line 1225,col 43)",
        "(line 1226,col 5)-(line 1251,col 5)",
        "(line 1253,col 5)-(line 1258,col 5)",
        "(line 1260,col 5)-(line 1261,col 63)",
        "(line 1262,col 5)-(line 1265,col 66)",
        "(line 1266,col 5)-(line 1275,col 5)",
        "(line 1278,col 5)-(line 1319,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1326,
      "end_line": 1348,
      "comment": "\n   * Given a constructor or an interface type, find out whether the unknown\n   * type is a supertype of the current type.\n   ",
      "child_ranges": [
        "(line 1327,col 5)-(line 1327,col 76)",
        "(line 1328,col 5)-(line 1328,col 55)",
        "(line 1332,col 5)-(line 1347,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1356,
      "end_line": 1385,
      "comment": "\n   * Visits an ASSIGN node for cases such as\n   * \u003cpre\u003e\n   * interface.property2.property \u003d ...;\n   * \u003c/pre\u003e\n   ",
      "child_ranges": [
        "(line 1359,col 5)-(line 1359,col 42)",
        "(line 1367,col 5)-(line 1368,col 63)",
        "(line 1369,col 5)-(line 1377,col 5)",
        "(line 1379,col 5)-(line 1384,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1396,
      "end_line": 1425,
      "comment": "\n   * Visits a NAME node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of the node n.\n   * @return whether the node is typeable or not\n   ",
      "child_ranges": [
        "(line 1404,col 5)-(line 1404,col 42)",
        "(line 1405,col 5)-(line 1410,col 5)",
        "(line 1412,col 5)-(line 1412,col 32)",
        "(line 1413,col 5)-(line 1422,col 5)",
        "(line 1423,col 5)-(line 1423,col 28)",
        "(line 1424,col 5)-(line 1424,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1435,
      "end_line": 1451,
      "comment": "\n   * Visits a GETPROP node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   * @param parent The parent of \u003ccode\u003en\u003c/code\u003e\n   ",
      "child_ranges": [
        "(line 1440,col 5)-(line 1440,col 37)",
        "(line 1441,col 5)-(line 1441,col 37)",
        "(line 1442,col 5)-(line 1442,col 42)",
        "(line 1444,col 5)-(line 1449,col 5)",
        "(line 1450,col 5)-(line 1450,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1460,
      "end_line": 1488,
      "comment": "\n   * Emit a warning if we can prove that a property cannot possibly be\n   * defined on an object. Note the difference between JS and a strictly\n   * statically typed language: we\u0027re checking if the property\n   * *cannot be defined*, whereas a java compiler would check if the\n   * property *can be undefined*.\n   ",
      "child_ranges": [
        "(line 1466,col 5)-(line 1466,col 35)",
        "(line 1467,col 5)-(line 1487,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1490,
      "end_line": 1508,
      "comment": "",
      "child_ranges": [
        "(line 1492,col 5)-(line 1507,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getClosestPropertySuggestion(com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 1510,
      "end_line": 1563,
      "comment": "",
      "child_ranges": [
        "(line 1512,col 5)-(line 1514,col 5)",
        "(line 1516,col 5)-(line 1516,col 28)",
        "(line 1517,col 5)-(line 1517,col 37)",
        "(line 1518,col 5)-(line 1556,col 5)",
        "(line 1558,col 5)-(line 1560,col 5)",
        "(line 1562,col 5)-(line 1562,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.isPropertyTest(com.google.javascript.rhino.Node)",
      "begin_line": 1571,
      "end_line": 1600,
      "comment": "\n   * Determines whether this node is testing for the existence of a property.\n   * If true, we will not emit warnings about a missing property.\n   *\n   * @param getProp The GETPROP being tested.\n   ",
      "child_ranges": [
        "(line 1572,col 5)-(line 1572,col 38)",
        "(line 1573,col 5)-(line 1598,col 5)",
        "(line 1599,col 5)-(line 1599,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1609,
      "end_line": 1613,
      "comment": "\n   * Visits a GETELEM node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1610,col 5)-(line 1611,col 73)",
        "(line 1612,col 5)-(line 1612,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1622,
      "end_line": 1651,
      "comment": "\n   * Visits a VAR node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1626,col 5)-(line 1626,col 66)",
        "(line 1627,col 5)-(line 1650,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1656,
      "end_line": 1671,
      "comment": "\n   * Visits a NEW node.\n   ",
      "child_ranges": [
        "(line 1657,col 5)-(line 1657,col 41)",
        "(line 1658,col 5)-(line 1658,col 72)",
        "(line 1659,col 5)-(line 1670,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, java.util.HashMap\u003cjava.lang.String, com.google.javascript.rhino.jstype.ObjectType\u003e, java.util.HashMap\u003cjava.lang.String, com.google.javascript.rhino.jstype.ObjectType\u003e, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 1685,
      "end_line": 1715,
      "comment": "\n   * Check whether there\u0027s any property conflict for for a particular super\n   * interface\n   * @param t The node traversal object that supplies context\n   * @param n The node being visited\n   * @param functionName The function name being checked\n   * @param properties The property names in the super interfaces that have\n   * been visited\n   * @param currentProperties The property names in the super interface\n   * that have been visited\n   * @param interfaceType The super interface that is being visited\n   ",
      "child_ranges": [
        "(line 1689,col 5)-(line 1689,col 68)",
        "(line 1690,col 5)-(line 1690,col 37)",
        "(line 1691,col 5)-(line 1697,col 5)",
        "(line 1698,col 5)-(line 1710,col 5)",
        "(line 1711,col 5)-(line 1714,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1724,
      "end_line": 1793,
      "comment": "\n   * Visits a {@link Token#FUNCTION} node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1725,col 5)-(line 1725,col 74)",
        "(line 1726,col 5)-(line 1726,col 63)",
        "(line 1727,col 5)-(line 1792,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1802,
      "end_line": 1854,
      "comment": "\n   * Visits a CALL node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1803,col 5)-(line 1803,col 35)",
        "(line 1804,col 5)-(line 1804,col 71)",
        "(line 1806,col 5)-(line 1810,col 5)",
        "(line 1814,col 5)-(line 1849,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitParameterList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1859,
      "end_line": 1893,
      "comment": "\n   * Visits the parameters of a CALL or a NEW node.\n   ",
      "child_ranges": [
        "(line 1861,col 5)-(line 1861,col 58)",
        "(line 1862,col 5)-(line 1862,col 21)",
        "(line 1864,col 5)-(line 1864,col 72)",
        "(line 1865,col 5)-(line 1865,col 20)",
        "(line 1866,col 5)-(line 1866,col 26)",
        "(line 1867,col 5)-(line 1867,col 25)",
        "(line 1868,col 5)-(line 1881,col 5)",
        "(line 1883,col 5)-(line 1883,col 43)",
        "(line 1884,col 5)-(line 1884,col 49)",
        "(line 1885,col 5)-(line 1885,col 49)",
        "(line 1886,col 5)-(line 1892,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1902,
      "end_line": 1930,
      "comment": "\n   * Visits a RETURN node.\n   *\n   * @param t The node traversal object that supplies context, such as the\n   * scope chain to use in name lookups as well as error reporting.\n   * @param n The node being visited.\n   ",
      "child_ranges": [
        "(line 1903,col 5)-(line 1903,col 56)",
        "(line 1905,col 5)-(line 1929,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(int, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 1942,
      "end_line": 1996,
      "comment": "\n   * This function unifies the type checking involved in the core binary\n   * operators and the corresponding assignment operators.  The representation\n   * used internally is such that common code can handle both kinds of\n   * operators easily.\n   *\n   * @param op The operator.\n   * @param t The traversal object, needed to report errors.\n   * @param n The node being checked.\n   ",
      "child_ranges": [
        "(line 1943,col 5)-(line 1943,col 34)",
        "(line 1944,col 5)-(line 1944,col 38)",
        "(line 1945,col 5)-(line 1945,col 34)",
        "(line 1946,col 5)-(line 1946,col 40)",
        "(line 1947,col 5)-(line 1994,col 5)",
        "(line 1995,col 5)-(line 1995,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 2013,
      "end_line": 2030,
      "comment": "\n   * \u003cp\u003eChecks enum aliases.\n   *\n   * \u003cp\u003eWe verify that the enum element type of the enum used\n   * for initialization is a subtype of the enum element type of\n   * the enum the value is being copied in.\u003c/p\u003e\n   *\n   * \u003cp\u003eExample:\u003c/p\u003e\n   * \u003cpre\u003evar myEnum \u003d myOtherEnum;\u003c/pre\u003e\n   *\n   * \u003cp\u003eEnum aliases are irregular, so we need special code for this :(\u003c/p\u003e\n   *\n   * @param value the value used for initialization of the enum\n   ",
      "child_ranges": [
        "(line 2015,col 5)-(line 2017,col 5)",
        "(line 2019,col 5)-(line 2019,col 40)",
        "(line 2020,col 5)-(line 2022,col 5)",
        "(line 2024,col 5)-(line 2024,col 57)",
        "(line 2025,col 5)-(line 2026,col 59)",
        "(line 2027,col 5)-(line 2029,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 2036,
      "end_line": 2047,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 2037,col 5)-(line 2037,col 34)",
        "(line 2038,col 5)-(line 2046,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 2059,
      "end_line": 2061,
      "comment": "\n   * Ensure that the given node has a type. If it does not have one,\n   * attach the UNKNOWN_TYPE.\n   ",
      "child_ranges": [
        "(line 2060,col 5)-(line 2060,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 2063,
      "end_line": 2065,
      "comment": "",
      "child_ranges": [
        "(line 2064,col 5)-(line 2064,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 2085,
      "end_line": 2104,
      "comment": "\n   * Enforces type casts, and ensures the node is typed.\n   *\n   * A cast in the way that we use it in JSDoc annotations never\n   * alters the generated code and therefore never can induce any runtime\n   * operation. What this means is that a \u0027cast\u0027 is really just a compile\n   * time constraint on the underlying value. In the future, we may add\n   * support for run-time casts for compiled tests.\n   *\n   * To ensure some shred of sanity, we enforce the notion that the\n   * type you are casting to may only meaningfully be a narrower type\n   * than the underlying declared type. We also invalidate optimizations\n   * on bad type casts.\n   *\n   * @param t The traversal object needed to report errors.\n   * @param n The node getting a type assigned to it.\n   * @param type The type to be assigned.\n   ",
      "child_ranges": [
        "(line 2087,col 5)-(line 2089,col 34)",
        "(line 2091,col 5)-(line 2091,col 38)",
        "(line 2092,col 5)-(line 2099,col 5)",
        "(line 2101,col 5)-(line 2103,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getTypedPercent()",
      "begin_line": 2110,
      "end_line": 2113,
      "comment": "\n   * Returns the percentage of nodes typed by the type checker.\n   * @return a number between 0.0 and 100.0\n   ",
      "child_ranges": [
        "(line 2111,col 5)-(line 2111,col 54)",
        "(line 2112,col 5)-(line 2112,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeCheck.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 2115,
      "end_line": 2117,
      "comment": "",
      "child_ranges": [
        "(line 2116,col 5)-(line 2116,col 46)"
      ]
    }
  ]
}