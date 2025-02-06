{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypeValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeValidator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 830,
      "comment": "\n * A central reporter for all type violations: places where the programmer\n * has annotated a variable (or property) with one type, but has assigned\n * another type to it.\n *\n * Also doubles as a central repository for all type violations, so that\n * type-based optimizations (like AmbiguateProperties) can be fault-tolerant.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeRegistry"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allValueTypes"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldReport"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nullOrUndefined"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mismatches"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " allowed, that doesn\u0027t mean we should invalidate all Cakes."
    },
    {
      "type": "field",
      "varNames": [
        "FOUND_REQUIRED"
      ],
      "begin_line": 72,
      "end_line": 75,
      "comment": " User warnings"
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_CAST"
      ],
      "begin_line": 78,
      "end_line": 82,
      "comment": " TODO(johnlenz): reenable this after after the next release."
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_MISMATCH_WARNING"
      ],
      "begin_line": 84,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_EXTENDS_TAG_WARNING"
      ],
      "begin_line": 89,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUP_VAR_DECLARATION"
      ],
      "begin_line": 94,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_PROPERTY_MISMATCH"
      ],
      "begin_line": 99,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INTERFACE_METHOD_NOT_IMPLEMENTED"
      ],
      "begin_line": 106,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HIDDEN_INTERFACE_PROPERTY_MISMATCH"
      ],
      "begin_line": 111,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_TYPEOF_VALUE"
      ],
      "begin_line": 119,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_PROPERTY_ACCESS"
      ],
      "begin_line": 122,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_DIAGNOSTICS"
      ],
      "begin_line": 126,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeValidator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 137,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 29)",
        "(line 139,col 5)-(line 139,col 51)",
        "(line 140,col 5)-(line 141,col 70)",
        "(line 142,col 5)-(line 143,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getMismatches()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n   * Gets a list of type violations.\n   *\n   * For each violation, one element is the expected type and the other is\n   * the type that is actually found. Order is not significant.\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.setShouldReport(boolean)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectValidTypeofName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\n   * Expect the type to be an object, or a type convertible to object. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   * @return True if there was no warning, false if there was a mismatch.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 179,col 5)",
        "(line 180,col 5)-(line 180,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectActualObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n   * Expect the type to be an object. Unlike expectObject, a type convertible\n   * to object is not acceptable.\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 190,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectAnyObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n   * Expect the type to contain an object sometimes. If the expectation is\n   * not met, issue a warning at the provided node\u0027s source code position.\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 57)",
        "(line 199,col 5)-(line 201,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 209,
      "end_line": 213,
      "comment": "\n   * Expect the type to be a string, or a type convertible to string. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\n   * Expect the type to be a number, or a type convertible to number. If the\n   * expectation is not met, issue a warning at the provided node\u0027s source code\n   * position.\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 223,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectBitwiseable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 231,
      "end_line": 235,
      "comment": "\n   * Expect the type to be a valid operand to a bitwise operator. This includes\n   * numbers, any type convertible to a number, or any other primitive type\n   * (undefined|null|boolean|string).\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 234,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectStringOrNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n   * Expect the type to be a number or string, or a type convertible to a number\n   * or string. If the expectation is not met, issue a warning at the provided\n   * node\u0027s source code position.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 246,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectNotNullOrUndefined(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 256,
      "end_line": 282,
      "comment": "\n   * Expect the type to be anything but the null or void type. If the\n   * expectation is not met, issue a warning at the provided node\u0027s\n   * source code position. Note that a union type that includes the\n   * void type and at least one other type meets the expectation.\n   * @return Whether the expectation was met.\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 281,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.containsForwardDeclaredUnresolvedName(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 284,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 291,col 5)",
        "(line 292,col 5)-(line 292,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectSwitchMatchesCase(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 299,
      "end_line": 312,
      "comment": "\n   * Expect that the type of a switch condition matches the type of its\n   * case condition.\n   ",
      "child_ranges": [
        "(line 305,col 5)-(line 311,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectIndexMatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 324,
      "end_line": 349,
      "comment": "\n   * Expect that the first type can be addressed with GETELEM syntax,\n   * and that the second type is the right type for an index into the\n   * first type.\n   *\n   * @param t The node traversal.\n   * @param n The GETELEM node to issue warnings on.\n   * @param objType The type of the left side of the GETELEM.\n   * @param indexType The type inside the brackets of the GETELEM.\n   ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 44)",
        "(line 327,col 5)-(line 327,col 38)",
        "(line 328,col 5)-(line 331,col 5)",
        "(line 332,col 5)-(line 348,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanAssignToPropertyOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 363,
      "end_line": 386,
      "comment": "\n   * Expect that the first type can be assigned to a symbol of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param rightType The type on the RHS of the assign.\n   * @param leftType The type of the symbol on the LHS of the assign.\n   * @param owner The owner of the property being assigned to.\n   * @param propName The name of the property being assigned to.\n   * @return True if the types matched, false otherwise.\n   ",
      "child_ranges": [
        "(line 366,col 5)-(line 384,col 5)",
        "(line 385,col 5)-(line 385,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanAssignTo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 399,
      "end_line": 406,
      "comment": "\n   * Expect that the first type can be assigned to a symbol of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param rightType The type on the RHS of the assign.\n   * @param leftType The type of the symbol on the LHS of the assign.\n   * @param msg An extra message for the mismatch warning, if necessary.\n   * @return True if the types matched, false otherwise.\n   ",
      "child_ranges": [
        "(line 401,col 5)-(line 404,col 5)",
        "(line 405,col 5)-(line 405,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectArgumentMatchesParameter(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, int)",
      "begin_line": 419,
      "end_line": 428,
      "comment": "\n   * Expect that the type of an argument matches the type of the parameter\n   * that it\u0027s fulfilling.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param argType The type of the argument.\n   * @param paramType The type of the parameter.\n   * @param callNode The call node, to help with the warning message.\n   * @param ordinal The argument ordinal, to help with the warning message.\n   ",
      "child_ranges": [
        "(line 421,col 5)-(line 427,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanOverride(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 443,
      "end_line": 451,
      "comment": "\n   * Expect that the first type can override a property of the second\n   * type.\n   *\n   * @param t The node traversal.\n   * @param n The node to issue warnings on.\n   * @param overridingType The overriding type.\n   * @param hiddenType The type of the property being overridden.\n   * @param propertyName The name of the property, for use in the\n   *     warning message.\n   * @param ownerType The type of the owner of the property, for use\n   *     in the warning message.\n   ",
      "child_ranges": [
        "(line 445,col 5)-(line 450,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectSuperType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 461,
      "end_line": 484,
      "comment": "\n   * Expect that the first type is the direct superclass of the second type.\n   *\n   * @param t The node traversal.\n   * @param n The node where warnings should point to.\n   * @param superObject The expected super instance type.\n   * @param subObject The sub instance type.\n   ",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 54)",
        "(line 464,col 5)-(line 464,col 64)",
        "(line 465,col 5)-(line 466,col 76)",
        "(line 467,col 5)-(line 483,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectCanCast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 495,
      "end_line": 500,
      "comment": "\n   * Expect that the first type can be cast to the second type. The first type\n   * must have some relationship with the second.\n   *\n   * @param t The node traversal.\n   * @param n The node where warnings should point.\n   * @param type The type being cast from.\n   * @param castType The type being cast to.\n   ",
      "child_ranges": [
        "(line 496,col 5)-(line 499,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectUndeclaredVariable(java.lang.String, com.google.javascript.jscomp.CompilerInput, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var, java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 516,
      "end_line": 576,
      "comment": "\n   * Expect that the given variable has not been declared with a type.\n   *\n   * @param sourceName The name of the source file we\u0027re in.\n   * @param n The node where warnings should point to.\n   * @param parent The parent of {@code n}.\n   * @param var The variable that we\u0027re checking.\n   * @param variableName The name of the variable.\n   * @param newType The type being applied to the variable. Mostly just here\n   *     for the benefit of the warning.\n   * @return The variable we end up with. Most of the time, this will just\n   *     be {@code var}, but in some rare cases we will need to declare\n   *     a new var with new source info.\n   ",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 21)",
        "(line 519,col 5)-(line 519,col 30)",
        "(line 520,col 5)-(line 528,col 5)",
        "(line 530,col 5)-(line 530,col 35)",
        "(line 535,col 5)-(line 573,col 5)",
        "(line 575,col 5)-(line 575,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectAllInterfaceProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 582,
      "end_line": 593,
      "comment": "\n   * Expect that all properties on interfaces that this type implements are\n   * implemented and correctly typed.\n   ",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 49)",
        "(line 585,col 5)-(line 592,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.expectInterfaceProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 599,
      "end_line": 633,
      "comment": "\n   * Expect that the property in an interface that this type implements is\n   * implemented and correctly typed.\n   ",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 57)",
        "(line 602,col 5)-(line 632,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 638,
      "end_line": 641,
      "comment": "\n   * Report a type mismatch\n   ",
      "child_ranges": [
        "(line 640,col 5)-(line 640,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 643,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 5)-(line 645,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.mismatch(java.lang.String, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 648,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 650,col 5)-(line 652,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.registerMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 655,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 49)",
        "(line 659,col 5)-(line 659,col 55)",
        "(line 660,col 5)-(line 662,col 5)",
        "(line 664,col 5)-(line 664,col 61)",
        "(line 665,col 5)-(line 678,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.registerIfMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 681,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 683,col 5)-(line 686,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.formatFoundRequired(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 692,
      "end_line": 695,
      "comment": "\n   * Formats a found/required error message.\n   ",
      "child_ranges": [
        "(line 694,col 5)-(line 694,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getReadableJSTypeName(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 708,
      "end_line": 758,
      "comment": "\n   * Given a node, get a human-readable name for the type of that node so\n   * that will be easy for the programmer to find the original declaration.\n   *\n   * For example, if SubFoo\u0027s property \"bar\" might have the human-readable\n   * name \"Foo.prototype.bar\".\n   *\n   * @param n The node.\n   * @param dereference If true, the type of the node will be dereferenced\n   *     to an Object type, if possible.\n   ",
      "child_ranges": [
        "(line 712,col 5)-(line 735,col 5)",
        "(line 737,col 5)-(line 737,col 31)",
        "(line 738,col 5)-(line 743,col 5)",
        "(line 745,col 5)-(line 745,col 48)",
        "(line 746,col 5)-(line 757,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 764,
      "end_line": 775,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 765,col 5)-(line 765,col 34)",
        "(line 766,col 5)-(line 774,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 777,
      "end_line": 779,
      "comment": "",
      "child_ranges": [
        "(line 778,col 5)-(line 778,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.report(com.google.javascript.jscomp.JSError)",
      "begin_line": 781,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 782,col 5)-(line 784,col 5)",
        "(line 785,col 5)-(line 785,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeMismatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 795,
      "end_line": 829,
      "comment": "\n   * Signals that the first type and the second type have been\n   * used interchangeably.\n   *\n   * Type-based optimizations should take this into account\n   * so that they don\u0027t wreck code with type warnings.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "typeA"
      ],
      "begin_line": 796,
      "end_line": 796,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeB"
      ],
      "begin_line": 797,
      "end_line": 797,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "src"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.TypeMismatch(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 805,
      "end_line": 809,
      "comment": "\n     * It\u0027s the responsibility of the class that creates the\n     * {@code TypeMismatch} to ensure that {@code a} and {@code b} are\n     * non-matching types.\n     ",
      "child_ranges": [
        "(line 806,col 7)-(line 806,col 21)",
        "(line 807,col 7)-(line 807,col 21)",
        "(line 808,col 7)-(line 808,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.equals(java.lang.Object)",
      "begin_line": 811,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 812,col 7)-(line 818,col 7)",
        "(line 819,col 7)-(line 819,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.hashCode()",
      "begin_line": 822,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 7)-(line 823,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeValidator.TypeMismatch.toString()",
      "begin_line": 826,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 827,col 7)-(line 827,col 46)"
      ]
    }
  ]
}