{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/JSType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1523,
      "comment": "\n * Represents JavaScript value types.\u003cp\u003e\n *\n * Types are split into two separate families: value types and object types.\n *\n * A special {@link UnknownType} exists to represent a wildcard type on which\n * no information can be gathered. In particular, it can assign to everyone,\n * is a subtype of everyone (and everyone is a subtype of it).\u003cp\u003e\n *\n * If you remove the {@link UnknownType}, the set of types in the type system\n * forms a lattice with the {@link #isSubtype} relation defining the partial\n * order of types. All types are united at the top of the lattice by the\n * {@link AllType} and at the bottom by the {@link NoType}.\u003cp\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolved"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolveResult"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateKeys"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templatizedTypes"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inTemplatedCheckVisit"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CAN_CAST_TO_VISITOR"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAME"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_CLASS"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_TYPE"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_TYPE_COMPONENT"
      ],
      "begin_line": 89,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALPHA"
      ],
      "begin_line": 97,
      "end_line": 102,
      "comment": "\n   * Total ordering on types based on their textual representation.\n   * This is used to have a deterministic output of the toString\n   * method of the union type since this output is used in tests.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.Anonymous-9eda71d9-a41c-47bb-be95-7a9493dae815.compare(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 7)-(line 100,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ENUMDECL"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " A flag set on enum definition tree nodes"
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENUMDECL"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.JSType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.JSType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.common.collect.ImmutableList\u003cjava.lang.String\u003e, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 114,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 29)",
        "(line 119,col 5)-(line 119,col 68)",
        "(line 120,col 5)-(line 120,col 77)",
        "(line 121,col 5)-(line 140,col 5)",
        "(line 142,col 5)-(line 142,col 37)",
        "(line 143,col 5)-(line 143,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n   * Utility method for less verbose code.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getJSDocInfo()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n   * Gets the docInfo for this type. By default, documentation cannot be\n   * attached to arbitrary types. This must be overridden for\n   * programmer-defined types.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getDisplayName()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n   * Returns a user meaningful label for the JSType instance.  For example,\n   * Functions and Enums will return their declaration name (if they have one).\n   * Some types will not have a meaningful display name.  Calls to\n   * hasDisplayName() will return true IFF getDisplayName() will return null\n   * or a zero length string.\n   *\n   * @return the display name of the type, or null if one is not available\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasDisplayName()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n   * @return true if the JSType has a user meaningful label.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 42)",
        "(line 180,col 5)-(line 180,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasProperty(java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Checks whether the property pname is present on the object. ",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoType()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoResolvedType()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoObjectType()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEmptyType()",
      "begin_line": 200,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 203,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumberObjectType()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumberValueType()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isFunctionPrototypeType()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " Whether this is the prototype of a function. ",
      "child_ranges": [
        "(line 216,col 5)-(line 216,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStringObjectType()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTheObjectType()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStringValueType()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isString()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n   * Tests whether the type is a string (value or Object).\n   * @return {@code this \u0026lt;: (String, string)}\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 237,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumber()",
      "begin_line": 244,
      "end_line": 247,
      "comment": "\n   * Tests whether the type is a number (value or Object).\n   * @return {@code this \u0026lt;: (Number, number)}\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 246,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isArrayType()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isBooleanObjectType()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isBooleanValueType()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isRegexpType()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isDateType()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNullType()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isVoidType()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isAllType()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isUnknownType()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isCheckedUnknownType()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isUnionType()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStruct()",
      "begin_line": 297,
      "end_line": 316,
      "comment": "\n   * Returns true iff {@code this} can be a {@code struct}.\n   * UnionType overrides the method, assume {@code this} is not a union here.\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 314,col 5)",
        "(line 315,col 5)-(line 315,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isDict()",
      "begin_line": 322,
      "end_line": 341,
      "comment": "\n   * Returns true iff {@code this} can be a {@code dict}.\n   * UnionType overrides the method, assume {@code this} is not a union here.\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 339,col 5)",
        "(line 340,col 5)-(line 340,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeUnionType()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n   * Downcasts this to a UnionType, or returns null if this is not a UnionType.\n   *\n   * Named in honor of Haskell\u0027s Maybe type constructor.\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isGlobalThisType()",
      "begin_line": 353,
      "end_line": 355,
      "comment": " Returns true if this is a global this type. ",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isFunctionType()",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Returns true if toMaybeFunctionType returns a non-null FunctionType. ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType()",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n   * Downcasts this to a FunctionType, or returns null if this is not\n   * a function.\n   *\n   * For the purposes of this function, we define a MaybeFunctionType as any\n   * type in the sub-lattice\n   * { x | LEAST_FUNCTION_TYPE \u003c\u003d x \u003c\u003d GREATEST_FUNCTION_TYPE }\n   * This definition excludes bottom types like NoType and NoObjectType.\n   *\n   * This definition is somewhat arbitrary and axiomatic, but this is the\n   * definition that makes the most sense for the most callers.\n   ",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n   * Null-safe version of toMaybeFunctionType().\n   ",
      "child_ranges": [
        "(line 382,col 5)-(line 382,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEnumElementType()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeEnumElementType()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n   * Downcasts this to an EnumElementType, or returns null if this is not an EnumElementType.\n   ",
      "child_ranges": [
        "(line 393,col 5)-(line 393,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEnumType()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 5)-(line 397,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeEnumType()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n   * Downcasts this to an EnumType, or returns null if this is not an EnumType.\n   ",
      "child_ranges": [
        "(line 404,col 5)-(line 404,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNamedType()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isRecordType()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 5)-(line 412,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeRecordType()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n   * Downcasts this to a RecordType, or returns null if this is not\n   * a RecordType.\n   ",
      "child_ranges": [
        "(line 420,col 5)-(line 420,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isParameterizedType()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n   * Downcasts this to a ParameterizedType, or returns null if this is not\n   * a function.\n   ",
      "child_ranges": [
        "(line 432,col 5)-(line 432,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeParameterizedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n   * Null-safe version of toMaybeParameterizedType().\n   ",
      "child_ranges": [
        "(line 439,col 5)-(line 439,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTemplateType()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 443,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n   * Downcasts this to a TemplateType, or returns null if this is not\n   * a function.\n   ",
      "child_ranges": [
        "(line 451,col 5)-(line 451,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n   * Null-safe version of toMaybeTemplateType().\n   ",
      "child_ranges": [
        "(line 458,col 5)-(line 458,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasAnyTemplateTypes()",
      "begin_line": 461,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 462,col 5)-(line 470,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasAnyTemplateTypesInternal()",
      "begin_line": 473,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 474,col 5)-(line 480,col 5)",
        "(line 481,col 5)-(line 481,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTemplatized()",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\n   * Returns true if this type is templatized; false otherwise.\n   ",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTemplateKeys()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n   * Returns the template keys associated with this type.\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTemplatizedTypes()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 5)-(line 499,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasTemplatizedType(java.lang.String)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n   * Returns true if this type is templatized for the specified key; false\n   * otherwise.\n   ",
      "child_ranges": [
        "(line 507,col 5)-(line 507,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTemplatizedType(java.lang.String)",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\n   * Returns the type associated with a given template key. Will return\n   * the UNKNOWN_TYPE if there is no template type associated with that\n   * template key.\n   ",
      "child_ranges": [
        "(line 516,col 6)-(line 516,col 43)",
        "(line 517,col 6)-(line 519,col 6)",
        "(line 520,col 6)-(line 520,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasEquivalentTemplateTypes(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 527,
      "end_line": 547,
      "comment": "\n   * Determines if the two specified JSTypes have equivalent, invariant\n   * templatized types.\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 529,col 74)",
        "(line 530,col 5)-(line 530,col 74)",
        "(line 531,col 5)-(line 531,col 54)",
        "(line 532,col 5)-(line 532,col 54)",
        "(line 534,col 5)-(line 536,col 5)",
        "(line 538,col 5)-(line 544,col 5)",
        "(line 546,col 5)-(line 546,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isObject()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n   * Tests whether this type is an {@code Object}, or any subtype thereof.\n   * @return {@code this \u0026lt;: Object}\n   ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isConstructor()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is a constructor or a\n   * named type that points to such a type.\n   ",
      "child_ranges": [
        "(line 563,col 5)-(line 563,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNominalType()",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n   * Whether this type is a nominal type (a named instance object or\n   * a named enum).\n   ",
      "child_ranges": [
        "(line 571,col 5)-(line 571,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNominalConstructor()",
      "begin_line": 578,
      "end_line": 596,
      "comment": "\n   * Whether this type is the original constructor of a nominal type.\n   * Does not include structural constructors.\n   ",
      "child_ranges": [
        "(line 579,col 5)-(line 594,col 5)",
        "(line 595,col 5)-(line 595,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInstanceType()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n   * Whether this type is an Instance object of some constructor.\n   * Does not necessarily mean this is an {@link InstanceObjectType}.\n   ",
      "child_ranges": [
        "(line 603,col 5)-(line 603,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInterface()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is an interface or a named\n   * type that points to such a type.\n   ",
      "child_ranges": [
        "(line 611,col 5)-(line 611,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isOrdinaryFunction()",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is an ordinary function or\n   * a named type that points to such a type.\n   ",
      "child_ranges": [
        "(line 619,col 5)-(line 619,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEquivalentTo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n   * Checks if two types are equivalent.\n   ",
      "child_ranges": [
        "(line 626,col 5)-(line 626,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInvariant(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\n   * Checks if two types are invariant.\n   * @see EquivalenceMethod\n   ",
      "child_ranges": [
        "(line 634,col 5)-(line 634,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.differsFrom(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\n   * Whether this type is meaningfully different from {@code that} type for\n   * the purposes of data flow analysis.\n   *\n   * This is a trickier check than pure equality, because it has to properly\n   * handle unknown types. See {@code EquivalenceMethod} for more info.\n   *\n   * @see \u003ca href\u003d\"http://www.youtube.com/watch?v\u003d_RpSv3HjpEw\"\u003eUnknown\n   *     unknowns\u003c/a\u003e\n   ",
      "child_ranges": [
        "(line 648,col 5)-(line 648,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 654,
      "end_line": 742,
      "comment": "\n   * An equivalence visitor.\n   ",
      "child_ranges": [
        "(line 655,col 5)-(line 657,col 5)",
        "(line 659,col 5)-(line 659,col 42)",
        "(line 660,col 5)-(line 660,col 47)",
        "(line 661,col 5)-(line 677,col 5)",
        "(line 679,col 5)-(line 682,col 5)",
        "(line 684,col 5)-(line 687,col 5)",
        "(line 689,col 5)-(line 692,col 5)",
        "(line 694,col 5)-(line 694,col 65)",
        "(line 695,col 5)-(line 695,col 70)",
        "(line 696,col 5)-(line 717,col 5)",
        "(line 719,col 5)-(line 722,col 5)",
        "(line 725,col 5)-(line 729,col 5)",
        "(line 731,col 5)-(line 735,col 5)",
        "(line 741,col 5)-(line 741,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEquivalent(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 744,
      "end_line": 747,
      "comment": "",
      "child_ranges": [
        "(line 745,col 5)-(line 746,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.equals(java.lang.Object)",
      "begin_line": 749,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 751,col 5)-(line 752,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hashCode()",
      "begin_line": 755,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 5)-(line 757,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesInt32Context()",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * \u0027Int32\u0027 context.  This context includes, for example, the operands of a\n   * bitwise or operator.  Since we do not currently support integer types,\n   * this is a synonym for {@code Number}.\n   ",
      "child_ranges": [
        "(line 767,col 5)-(line 767,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesUint32Context()",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * \u0027Uint32\u0027 context.  This context includes the right-hand operand of a shift\n   * operator.\n   ",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesNumberContext()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * numeric context, such as an operand of a multiply operator.\n   ",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesStringContext()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * {@code String} context, such as an operand of a string concat (+) operator.\n   *\n   * All types have at least the potential for converting to {@code String}.\n   * When we add externally defined types, such as a browser OM, we may choose\n   * to add types that do not automatically convert to {@code String}.\n   ",
      "child_ranges": [
        "(line 796,col 5)-(line 796,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesObjectContext()",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n   * This predicate is used to test whether a given type can appear in an\n   * {@code Object} context, such as the expression in a with statement.\n   *\n   * Most types we will encounter, except notably {@code null}, have at least\n   * the potential for converting to {@code Object}.  Host defined objects can\n   * get peculiar.\n   ",
      "child_ranges": [
        "(line 808,col 5)-(line 808,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.findPropertyType(java.lang.String)",
      "begin_line": 821,
      "end_line": 828,
      "comment": "\n   * Coerces this type to an Object type, then gets the type of the property\n   * whose name is given.\n   *\n   * Unlike {@link ObjectType#getPropertyType}, returns null if the property\n   * is not found.\n   *\n   * @return The property\u0027s type. {@code null} if the current type cannot\n   *     have properties, or if the type is not found.\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 822,col 63)",
        "(line 823,col 5)-(line 825,col 5)",
        "(line 827,col 5)-(line 827,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canBeCalled()",
      "begin_line": 836,
      "end_line": 838,
      "comment": "\n   * This predicate is used to test whether a given type can be used as the\n   * \u0027function\u0027 in a function call.\n   *\n   * @return {@code true} if this type might be callable.\n   ",
      "child_ranges": [
        "(line 837,col 5)-(line 837,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canCastTo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\n   * Tests whether values of {@code this} type can be safely assigned\n   * to values of {@code that} type.\u003cp\u003e\n   *\n   * The default implementation verifies that {@code this} is a subtype\n   * of {@code that}.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 848,col 5)-(line 848,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.autoboxesTo()",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\n   * Turn a scalar type to the corresponding object type.\n   *\n   * @return the auto-boxed type or {@code null} if this type is not a scalar.\n   ",
      "child_ranges": [
        "(line 857,col 5)-(line 857,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.unboxesTo()",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n   * Turn an object type to its corresponding scalar type.\n   *\n   * @return the unboxed type or {@code null} if this type does not unbox.\n   ",
      "child_ranges": [
        "(line 866,col 5)-(line 866,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toObjectType()",
      "begin_line": 875,
      "end_line": 877,
      "comment": "\n   * Casts this to an ObjectType, or returns null if this is not an ObjectType.\n   * If this is a scalar type, it will *not* be converted to an object type.\n   * If you want to simulate JS autoboxing or dereferencing, you should use\n   * autoboxesTo() or dereference().\n   ",
      "child_ranges": [
        "(line 876,col 5)-(line 876,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.autobox()",
      "begin_line": 885,
      "end_line": 889,
      "comment": "\n   * Dereference a type for property access.\n   *\n   * Filters null/undefined and autoboxes the resulting type.\n   * Never returns null.\n   ",
      "child_ranges": [
        "(line 886,col 5)-(line 886,col 55)",
        "(line 887,col 5)-(line 887,col 46)",
        "(line 888,col 5)-(line 888,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.dereference()",
      "begin_line": 897,
      "end_line": 899,
      "comment": "\n   * Dereference a type for property access.\n   *\n   * Filters null/undefined, autoboxes the resulting type, and returns it\n   * iff it\u0027s an object.\n   ",
      "child_ranges": [
        "(line 898,col 5)-(line 898,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canTestForEqualityWith(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n   * Tests whether {@code this} and {@code that} are meaningfully\n   * comparable. By meaningfully, we mean compatible types that do not lead\n   * to step 22 of the definition of the Abstract Equality Comparison\n   * Algorithm (11.9.3, page 55\u0026ndash;56) of the ECMA-262 specification.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 908,col 5)-(line 908,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 924,
      "end_line": 926,
      "comment": "\n   * Compares {@code this} and {@code that}.\n   * @return \u003cul\u003e\n   * \u003cli\u003e{@link TernaryValue#TRUE} if the comparison of values of\n   *   {@code this} type and {@code that} always succeed (such as\n   *   {@code undefined} compared to {@code null})\u003c/li\u003e\n   * \u003cli\u003e{@link TernaryValue#FALSE} if the comparison of values of\n   *   {@code this} type and {@code that} always fails (such as\n   *   {@code undefined} compared to {@code number})\u003c/li\u003e\n   * \u003cli\u003e{@link TernaryValue#UNKNOWN} if the comparison can succeed or\n   *   fail depending on the concrete values\u003c/li\u003e\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 925,col 5)-(line 925,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.testForEqualityHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 928,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 929,col 5)-(line 934,col 5)",
        "(line 936,col 5)-(line 936,col 43)",
        "(line 937,col 5)-(line 937,col 43)",
        "(line 938,col 5)-(line 944,col 5)",
        "(line 946,col 5)-(line 961,col 5)",
        "(line 962,col 5)-(line 964,col 5)",
        "(line 965,col 5)-(line 965,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canTestForShallowEqualityWith(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 975,
      "end_line": 987,
      "comment": "\n   * Tests whether {@code this} and {@code that} are meaningfully\n   * comparable using shallow comparison. By meaningfully, we mean compatible\n   * types that are not rejected by step 1 of the definition of the Strict\n   * Equality Comparison Algorithm (11.9.6, page 56\u0026ndash;57) of the\n   * ECMA-262 specification.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 976,col 5)-(line 978,col 5)",
        "(line 980,col 5)-(line 980,col 42)",
        "(line 981,col 5)-(line 986,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNullable()",
      "begin_line": 992,
      "end_line": 994,
      "comment": "\n   * Tests whether this type is nullable.\n   ",
      "child_ranges": [
        "(line 993,col 5)-(line 993,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.collapseUnion()",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n   * Gets the least supertype of this that\u0027s not a union.\n   ",
      "child_ranges": [
        "(line 1000,col 5)-(line 1000,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1015,
      "end_line": 1021,
      "comment": "\n   * Gets the least supertype of {@code this} and {@code that}.\n   * The least supertype is the join (\u0026#8744;) or supremum of both types in the\n   * type lattice.\u003cp\u003e\n   * Examples:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code number \u0026#8744; *} \u003d {@code *}\u003c/li\u003e\n   * \u003cli\u003e{@code number \u0026#8744; Object} \u003d {@code (number, Object)}\u003c/li\u003e\n   * \u003cli\u003e{@code Number \u0026#8744; Object} \u003d {@code Object}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * @return {@code this \u0026#8744; that}\n   ",
      "child_ranges": [
        "(line 1016,col 5)-(line 1019,col 5)",
        "(line 1020,col 5)-(line 1020,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1027,
      "end_line": 1032,
      "comment": "\n   * A generic implementation meant to be used as a helper for common\n   * getLeastSupertype implementations.\n   ",
      "child_ranges": [
        "(line 1028,col 5)-(line 1028,col 62)",
        "(line 1029,col 5)-(line 1031,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1046,
      "end_line": 1048,
      "comment": "\n   * Gets the greatest subtype of {@code this} and {@code that}.\n   * The greatest subtype is the meet (\u0026#8743;) or infimum of both types in the\n   * type lattice.\u003cp\u003e\n   * Examples\n   * \u003cul\u003e\n   * \u003cli\u003e{@code Number \u0026#8743; Any} \u003d {@code Any}\u003c/li\u003e\n   * \u003cli\u003e{@code number \u0026#8743; Object} \u003d {@code Any}\u003c/li\u003e\n   * \u003cli\u003e{@code Number \u0026#8743; Object} \u003d {@code Number}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * @return {@code this \u0026#8744; that}\n   ",
      "child_ranges": [
        "(line 1047,col 5)-(line 1047,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1054,
      "end_line": 1106,
      "comment": "\n   * A generic implementation meant to be used as a helper for common\n   * getGreatestSubtype implementations.\n   ",
      "child_ranges": [
        "(line 1055,col 5)-(line 1088,col 5)",
        "(line 1090,col 5)-(line 1100,col 5)",
        "(line 1102,col 5)-(line 1104,col 5)",
        "(line 1105,col 5)-(line 1105,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1116,
      "end_line": 1143,
      "comment": "\n   * When computing infima, we may get a situation like\n   * inf(Type1, Type2)\n   * where both types are unresolved, so they\u0027re technically\n   * subtypes of one another.\n   *\n   * If this happens, filter them down to NoResolvedType.\n   ",
      "child_ranges": [
        "(line 1117,col 5)-(line 1141,col 5)",
        "(line 1142,col 5)-(line 1142,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getRestrictedTypeGivenToBooleanOutcome(boolean)",
      "begin_line": 1159,
      "end_line": 1170,
      "comment": "\n   * Computes the restricted type of this type knowing that the\n   * {@code ToBoolean} predicate has a specific value. For more information\n   * about the {@code ToBoolean} predicate, see\n   * {@link #getPossibleToBooleanOutcomes}.\n   *\n   * @param outcome the value of the {@code ToBoolean} predicate\n   *\n   * @return the restricted type, or the Any Type if the underlying type could\n   *         not have yielded this ToBoolean value\n   *\n   * TODO(user): Move this method to the SemanticRAI and use the visit\n   * method of types to get the restricted type.\n   ",
      "child_ranges": [
        "(line 1160,col 5)-(line 1162,col 5)",
        "(line 1164,col 5)-(line 1164,col 64)",
        "(line 1165,col 5)-(line 1169,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getPossibleToBooleanOutcomes()",
      "begin_line": 1188,
      "end_line": 1188,
      "comment": "\n   * Computes the set of possible outcomes of the {@code ToBoolean} predicate\n   * for this type. The {@code ToBoolean} predicate is defined by the ECMA-262\n   * standard, 3\u003csup\u003erd\u003c/sup\u003e edition. Its behavior for simple types can be\n   * summarized by the following table:\n   * \u003ctable\u003e\n   * \u003ctr\u003e\u003cth\u003etype\u003c/th\u003e\u003cth\u003eresult\u003c/th\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code undefined}\u003c/td\u003e\u003ctd\u003e{false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code null}\u003c/td\u003e\u003ctd\u003e{false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code boolean}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code number}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code string}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code Object}\u003c/td\u003e\u003ctd\u003e{true}\u003c/td\u003e\u003c/tr\u003e\n   * \u003c/table\u003e\n   * @return the set of boolean literals for this type\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1202,
      "end_line": 1221,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types if equality\n   * is observed. If a value {@code v1} of type {@code null} is equal to a value\n   * {@code v2} of type {@code (undefined,number)}, we can infer that the\n   * type of {@code v1} is {@code null} and the type of {@code v2} is\n   * {@code undefined}.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1204,col 5)-(line 1207,col 5)",
        "(line 1210,col 5)-(line 1217,col 5)",
        "(line 1220,col 5)-(line 1220,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1235,
      "end_line": 1255,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types if inequality\n   * is observed. If a value {@code v1} of type {@code number} is not equal to a\n   * value {@code v2} of type {@code (undefined,number)}, we can infer that the\n   * type of {@code v1} is {@code number} and the type of {@code v2} is\n   * {@code number} as well.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1237,col 5)-(line 1240,col 5)",
        "(line 1243,col 5)-(line 1251,col 5)",
        "(line 1254,col 5)-(line 1254,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderShallowEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1266,
      "end_line": 1269,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types under shallow\n   * equality.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}.\n   ",
      "child_ranges": [
        "(line 1267,col 5)-(line 1267,col 49)",
        "(line 1268,col 5)-(line 1268,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1280,
      "end_line": 1296,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types under\n   * shallow inequality.\n   *\n   * @return A pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1282,col 5)-(line 1285,col 5)",
        "(line 1290,col 5)-(line 1295,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.restrictByNotNullOrUndefined()",
      "begin_line": 1302,
      "end_line": 1304,
      "comment": "\n   * If this is a union type, returns a union type that does not include\n   * the null or undefined type.\n   ",
      "child_ranges": [
        "(line 1303,col 5)-(line 1303,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1332,
      "end_line": 1334,
      "comment": "\n   * Checks whether {@code this} is a subtype of {@code that}.\u003cp\u003e\n   *\n   * Subtyping rules:\n   * \u003cul\u003e\n   * \u003cli\u003e(unknown) \u0026mdash; every type is a subtype of the Unknown type.\u003c/li\u003e\n   * \u003cli\u003e(no) \u0026mdash; the No type is a subtype of every type.\u003c/li\u003e\n   * \u003cli\u003e(no-object) \u0026mdash; the NoObject type is a subtype of every object\n   * type (i.e. subtypes of the Object type).\u003c/li\u003e\n   * \u003cli\u003e(ref) \u0026mdash; a type is a subtype of itself.\u003c/li\u003e\n   * \u003cli\u003e(union-l) \u0026mdash; A union type is a subtype of a type U if all the\n   * union type\u0027s constituents are a subtype of U. Formally\u003cbr\u003e\n   * {@code (T\u003csub\u003e1\u003c/sub\u003e, \u0026hellip;, T\u003csub\u003en\u003c/sub\u003e) \u0026lt;: U} if and only\n   * {@code T\u003csub\u003ek\u003c/sub\u003e \u0026lt;: U} for all {@code k \u0026isin; 1..n}.\u003c/li\u003e\n   * \u003cli\u003e(union-r) \u0026mdash; A type U is a subtype of a union type if it is a\n   * subtype of one of the union type\u0027s constituents. Formally\u003cbr\u003e\n   * {@code U \u0026lt;: (T\u003csub\u003e1\u003c/sub\u003e, \u0026hellip;, T\u003csub\u003en\u003c/sub\u003e)} if and only\n   * if {@code U \u0026lt;: T\u003csub\u003ek\u003c/sub\u003e} for some index {@code k}.\u003c/li\u003e\n   * \u003cli\u003e(objects) \u0026mdash; an Object {@code O\u003csub\u003e1\u003c/sub\u003e} is a subtype\n   * of an object {@code O\u003csub\u003e2\u003c/sub\u003e} if it has more properties\n   * than {@code O\u003csub\u003e2\u003c/sub\u003e} and all common properties are\n   * pairwise subtypes.\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @return {@code this \u0026lt;: that}\n   ",
      "child_ranges": [
        "(line 1333,col 5)-(line 1333,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1340,
      "end_line": 1376,
      "comment": "\n   * A generic implementation meant to be used as a helper for common subtyping\n   * cases.\n   ",
      "child_ranges": [
        "(line 1342,col 5)-(line 1344,col 5)",
        "(line 1346,col 5)-(line 1348,col 5)",
        "(line 1350,col 5)-(line 1352,col 5)",
        "(line 1354,col 5)-(line 1362,col 5)",
        "(line 1365,col 5)-(line 1368,col 5)",
        "(line 1371,col 5)-(line 1374,col 5)",
        "(line 1375,col 5)-(line 1375,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 1383,
      "end_line": 1383,
      "comment": "\n   * Visit this type with the given visitor.\n   * @see com.google.javascript.rhino.jstype.Visitor\n   * @return the value returned by the visitor\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1390,
      "end_line": 1390,
      "comment": "\n   * Visit the types with the given visitor.\n   * @see com.google.javascript.rhino.jstype.RelationshipVisitor\n   * @return the value returned by the visitor\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.forceResolve(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1397,
      "end_line": 1403,
      "comment": "\n   * Force this type to resolve, even if the registry is in a lazy\n   * resolving mode.\n   * @see #resolve\n   ",
      "child_ranges": [
        "(line 1398,col 5)-(line 1398,col 59)",
        "(line 1399,col 5)-(line 1399,col 51)",
        "(line 1400,col 5)-(line 1400,col 38)",
        "(line 1401,col 5)-(line 1401,col 44)",
        "(line 1402,col 5)-(line 1402,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.resolve(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1419,
      "end_line": 1432,
      "comment": "\n   * Resolve this type in the given scope.\n   *\n   * The returned value must be equal to {@code this}, as defined by\n   * {@link #isEquivalentTo}. It may or may not be the same object. This method\n   * may modify the internal state of {@code this}, as long as it does\n   * so in a way that preserves Object equality.\n   *\n   * For efficiency, we should only resolve a type once per compilation job.\n   * For incremental compilations, one compilation job may need the\n   * artifacts from a previous generation, so we will eventually need\n   * a generational flag instead of a boolean one.\n   ",
      "child_ranges": [
        "(line 1420,col 5)-(line 1427,col 5)",
        "(line 1428,col 5)-(line 1428,col 20)",
        "(line 1429,col 5)-(line 1429,col 46)",
        "(line 1430,col 5)-(line 1430,col 57)",
        "(line 1431,col 5)-(line 1431,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1437,
      "end_line": 1437,
      "comment": "\n   * @see #resolve\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1439,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1440,col 5)-(line 1440,col 25)",
        "(line 1441,col 5)-(line 1441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isResolved()",
      "begin_line": 1445,
      "end_line": 1447,
      "comment": " Whether the type has been resolved. ",
      "child_ranges": [
        "(line 1446,col 5)-(line 1446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.clearResolved()",
      "begin_line": 1450,
      "end_line": 1453,
      "comment": " Clears the resolved field. ",
      "child_ranges": [
        "(line 1451,col 5)-(line 1451,col 21)",
        "(line 1452,col 5)-(line 1452,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.safeResolve(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1459,
      "end_line": 1462,
      "comment": "\n   * A null-safe resolve.\n   * @see #resolve\n   ",
      "child_ranges": [
        "(line 1461,col 5)-(line 1461,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.setValidator(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1470,
      "end_line": 1472,
      "comment": "\n   * Certain types have constraints on them at resolution-time.\n   * For example, a type in an {@code @extends} annotation must be an\n   * object. Clients should inject a validator that emits a warning\n   * if the type does not validate, and return false.\n   ",
      "child_ranges": [
        "(line 1471,col 5)-(line 1471,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypePair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1474,
      "end_line": 1482,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeA"
      ],
      "begin_line": 1475,
      "end_line": 1475,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeB"
      ],
      "begin_line": 1476,
      "end_line": 1476,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.TypePair.TypePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1478,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1479,col 7)-(line 1479,col 25)",
        "(line 1480,col 7)-(line 1480,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toString()",
      "begin_line": 1488,
      "end_line": 1491,
      "comment": "\n   * A string representation of this type, suitable for printing\n   * in warnings.\n   ",
      "child_ranges": [
        "(line 1490,col 5)-(line 1490,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toDebugHashCodeString()",
      "begin_line": 1497,
      "end_line": 1499,
      "comment": "\n   * A hash code function for diagnosing complicated issues\n   * around type-identity.\n   ",
      "child_ranges": [
        "(line 1498,col 5)-(line 1498,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toAnnotationString()",
      "begin_line": 1505,
      "end_line": 1507,
      "comment": "\n   * A string representation of this type, suitable for printing\n   * in type annotations at code generation time.\n   ",
      "child_ranges": [
        "(line 1506,col 5)-(line 1506,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toStringHelper(boolean)",
      "begin_line": 1513,
      "end_line": 1513,
      "comment": "\n   * @param forAnnotations Whether this is for use in code generator\n   *     annotations. Otherwise, it\u0027s for warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1522,
      "end_line": 1522,
      "comment": "\n   * Modify this type so that it matches the specified type.\n   *\n   * This is useful for reverse type-inference, where we want to\n   * infer that an object literal matches its constraint (much like\n   * how the java compiler does reverse-inference to figure out generics).\n   ",
      "child_ranges": []
    }
  ]
}