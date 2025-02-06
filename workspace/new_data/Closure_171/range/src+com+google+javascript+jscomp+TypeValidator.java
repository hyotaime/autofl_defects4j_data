{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TypeValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeValidator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 842,
      "comment": "\n * A central reporter for all type violations: places where the programmer\n * has annotated a variable (or property) with one type, but has assigned\n * another type to it.\n *\n * Also doubles as a central repository for all type violations, so that\n * type-based optimizations (like AmbiguateProperties) can be fault-tolerant.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allValueTypes"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldReport"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nullOrUndefined"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mismatches"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " allowed, that doesn\u0027t mean we should invalidate all Cakes."
    },
    {
      "type": "field",
      "varNames": [
        "FOUND_REQUIRED"
      ],
      "begin_line": 74,
      "end_line": 77,
      "comment": " User warnings"
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_CAST"
      ],
      "begin_line": 79,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_MISMATCH_WARNING"
      ],
      "begin_line": 85,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_EXTENDS_TAG_WARNING"
      ],
      "begin_line": 90,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUP_VAR_DECLARATION"
      ],
      "begin_line": 95,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_PROPERTY_MISMATCH"
      ],
      "begin_line": 100,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_METHOD_NOT_IMPLEMENTED"
      ],
      "begin_line": 107,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_INTERFACE_PROPERTY_MISMATCH"
      ],
      "begin_line": 112,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_TYPEOF_VALUE"
      ],
      "begin_line": 120,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_PROPERTY_ACCESS"
      ],
      "begin_line": 123,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_DIAGNOSTICS"
      ],
      "begin_line": 127,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeValidator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 29)",
        "(line 140,col 5)-(line 140,col 51)",
        "(line 141,col 5)-(line 142,col 70)",
        "(line 143,col 5)-(line 144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getMismatches()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n   * Gets a list of type violations.\n   *\n   * For each violation, one element is the expected type and the other is\n   * the type that is actually found. Order is not significant.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.setShouldReport(boolean)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n   * Expect the type to be an object, or a type convertible to object. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   * @return True if there was no warning, false if there was a mismatch.\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 180,col 5)",
        "(line 181,col 5)-(line 181,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n   * Expect the type to be an object. Unlike expectObject, a type convertible\n   * to object is not acceptable.\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 191,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectAnyObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "\n   * Expect the type to contain an object sometimes. If the expectation is\n   * not met, issue a warning at the provided node\u0027s source code position.\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 57)",
        "(line 200,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n   * Expect the type to be a string, or a type convertible to string. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 213,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 221,
      "end_line": 225,
      "comment": "\n   * Expect the type to be a number, or a type convertible to number. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 224,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 232,
      "end_line": 236,
      "comment": "\n   * Expect the type to be a valid operand to a bitwise operator. This includes\n   * numbers, any type convertible to a number, or any other primitive type\n   * (undefined|null|boolean|string).\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 235,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\n   * Expect the type to be a number or string, or a type convertible to a number\n   * or string. If the expectation is not met, issue a warning at the provided\n   * node\u0027s source code position.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 247,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 257,
      "end_line": 283,
      "comment": "\n   * Expect the type to be anything but the null or void type. If the\n   * expectation is not met, issue a warning at the provided node\u0027s\n   * source code position. Note that a union type that includes the\n   * void type and at least one other type meets the expectation.\n   * @return Whether the expectation was met.\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 281,col 5)",
        "(line 282,col 5)-(line 282,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 285,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 292,col 5)",
        "(line 293,col 5)-(line 293,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 300,
      "end_line": 313,
      "comment": "\n   * Expect that the type of a switch condition matches the type of its\n   * case condition.\n   ",
      "child_ranges": [
        "(line 306,col 5)-(line 312,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 325,
      "end_line": 353,
      "comment": "\n   * Expect that the first type can be addressed with GETELEM syntax,\n   * and that the second type is the right type for an index into the\n   * first type.\n   *\n   * @param t The node traversal.\n   * @param n The GETELEM node to issue warnings on.\n   * @param objType The type of the left side of the GETELEM.\n   * @param indexType The type inside the brackets of the GETELEM.\n   ",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 44)",
        "(line 328,col 5)-(line 328,col 38)",
        "(line 329,col 5)-(line 332,col 5)",
        "(line 333,col 5)-(line 352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 367,
      "end_line": 390,
      "comment": "\n   * Expect that the first type can be assigned to a symbol of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param rightType The type on the RHS of the assign.\n   * @param leftType The type of the symbol on the LHS of the assign.\n   * @param owner The owner of the property being assigned to.\n   * @param propName The name of the property being assigned to.\n   * @return True if the types matched, false otherwise.\n   ",
      "child_ranges": [
        "(line 370,col 5)-(line 388,col 5)",
        "(line 389,col 5)-(line 389,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 403,
      "end_line": 410,
      "comment": "\n   * Expect that the first type can be assigned to a symbol of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param rightType The type on the RHS of the assign.\n   * @param leftType The type of the symbol on the LHS of the assign.\n   * @param msg An extra message for the mismatch warning, if necessary.\n   * @return True if the types matched, false otherwise.\n   ",
      "child_ranges": [
        "(line 405,col 5)-(line 408,col 5)",
        "(line 409,col 5)-(line 409,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)",
      "begin_line": 423,
      "end_line": 432,
      "comment": "\n   * Expect that the type of an argument matches the type of the parameter\n   * that it\u0027s fulfilling.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param argType The type of the argument.\n   * @param paramType The type of the parameter.\n   * @param callNode The call node, to help with the warning message.\n   * @param ordinal The argument ordinal, to help with the warning message.\n   ",
      "child_ranges": [
        "(line 425,col 5)-(line 431,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\n   * Expect that the first type can override a property of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param overridingType The overriding type.\n   * @param hiddenType The type of the property being overridden.\n   * @param propertyName The name of the property, for use in the\n   *     warning message.\n   * @param ownerType The type of the owner of the property, for use\n   *     in the warning message.\n   ",
      "child_ranges": [
        "(line 449,col 5)-(line 454,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 465,
      "end_line": 488,
      "comment": "\n   * Expect that the first type is the direct superclass of the second type.\n   *\n   * @param t The node traversal.\n   * @param n The node where warnings should point to.\n   * @param superObject The expected super instance type.\n   * @param subObject The sub instance type.\n   ",
      "child_ranges": [
        "(line 467,col 5)-(line 467,col 54)",
        "(line 468,col 5)-(line 468,col 64)",
        "(line 469,col 5)-(line 470,col 76)",
        "(line 471,col 5)-(line 487,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 499,
      "end_line": 504,
      "comment": "\n   * Expect that the first type can be cast to the second type. The first type\n   * must have some relationship with the second.\n   *\n   * @param t The node traversal.\n   * @param n The node where warnings should point.\n   * @param type The type being cast from.\n   * @param castType The type being cast to.\n   ",
      "child_ranges": [
        "(line 500,col 5)-(line 503,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 520,
      "end_line": 580,
      "comment": "\n   * Expect that the given variable has not been declared with a type.\n   *\n   * @param sourceName The name of the source file we\u0027re in.\n   * @param n The node where warnings should point to.\n   * @param parent The parent of {@code n}.\n   * @param var The variable that we\u0027re checking.\n   * @param variableName The name of the variable.\n   * @param newType The type being applied to the variable. Mostly just here\n   *     for the benefit of the warning.\n   * @return The variable we end up with. Most of the time, this will just\n   *     be {@code var}, but in some rare cases we will need to declare\n   *     a new var with new source info.\n   ",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 21)",
        "(line 523,col 5)-(line 523,col 30)",
        "(line 524,col 5)-(line 532,col 5)",
        "(line 534,col 5)-(line 534,col 35)",
        "(line 539,col 5)-(line 577,col 5)",
        "(line 579,col 5)-(line 579,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 586,
      "end_line": 597,
      "comment": "\n   * Expect that all properties on interfaces that this type implements are\n   * implemented and correctly typed.\n   ",
      "child_ranges": [
        "(line 588,col 5)-(line 588,col 49)",
        "(line 589,col 5)-(line 596,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 603,
      "end_line": 645,
      "comment": "\n   * Expect that the property in an interface that this type implements is\n   * implemented and correctly typed.\n   ",
      "child_ranges": [
        "(line 605,col 5)-(line 605,col 57)",
        "(line 606,col 5)-(line 644,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 650,
      "end_line": 653,
      "comment": "\n   * Report a type mismatch\n   ",
      "child_ranges": [
        "(line 652,col 5)-(line 652,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 655,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 5)-(line 657,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(java.lang.String, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 660,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 662,col 5)-(line 664,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.registerMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 667,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 670,col 5)-(line 670,col 49)",
        "(line 671,col 5)-(line 671,col 55)",
        "(line 672,col 5)-(line 674,col 5)",
        "(line 676,col 5)-(line 676,col 61)",
        "(line 677,col 5)-(line 690,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 693,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 695,col 5)-(line 698,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.formatFoundRequired(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 704,
      "end_line": 707,
      "comment": "\n   * Formats a found/required error message.\n   ",
      "child_ranges": [
        "(line 706,col 5)-(line 706,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 720,
      "end_line": 770,
      "comment": "\n   * Given a node, get a human-readable name for the type of that node so\n   * that will be easy for the programmer to find the original declaration.\n   *\n   * For example, if SubFoo\u0027s property \"bar\" might have the human-readable\n   * name \"Foo.prototype.bar\".\n   *\n   * @param n The node.\n   * @param dereference If true, the type of the node will be dereferenced\n   *     to an Object type, if possible.\n   ",
      "child_ranges": [
        "(line 724,col 5)-(line 747,col 5)",
        "(line 749,col 5)-(line 749,col 31)",
        "(line 750,col 5)-(line 755,col 5)",
        "(line 757,col 5)-(line 757,col 48)",
        "(line 758,col 5)-(line 769,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 776,
      "end_line": 787,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 777,col 5)-(line 777,col 34)",
        "(line 778,col 5)-(line 786,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 790,col 5)-(line 790,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 793,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 794,col 5)-(line 796,col 5)",
        "(line 797,col 5)-(line 797,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeMismatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 807,
      "end_line": 841,
      "comment": "\n   * Signals that the first type and the second type have been\n   * used interchangeably.\n   *\n   * Type-based optimizations should take this into account\n   * so that they don\u0027t wreck code with type warnings.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeA"
      ],
      "begin_line": 808,
      "end_line": 808,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeB"
      ],
      "begin_line": 809,
      "end_line": 809,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "src"
      ],
      "begin_line": 810,
      "end_line": 810,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.TypeMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 817,
      "end_line": 821,
      "comment": "\n     * It\u0027s the responsibility of the class that creates the\n     * {@code TypeMismatch} to ensure that {@code a} and {@code b} are\n     * non-matching types.\n     ",
      "child_ranges": [
        "(line 818,col 7)-(line 818,col 21)",
        "(line 819,col 7)-(line 819,col 21)",
        "(line 820,col 7)-(line 820,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.equals(java.lang.Object)",
      "begin_line": 823,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 824,col 7)-(line 830,col 7)",
        "(line 831,col 7)-(line 831,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.hashCode()",
      "begin_line": 834,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 835,col 7)-(line 835,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.toString()",
      "begin_line": 838,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 839,col 7)-(line 839,col 46)"
      ]
    }
  ]
}