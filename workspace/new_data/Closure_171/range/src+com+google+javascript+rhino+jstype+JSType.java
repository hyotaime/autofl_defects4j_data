{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/JSType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSType",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 1456,
      "comment": "\n * Represents JavaScript value types.\u003cp\u003e\n *\n * Types are split into two separate families: value types and object types.\n *\n * A special {@link UnknownType} exists to represent a wildcard type on which\n * no information can be gathered. In particular, it can assign to everyone,\n * is a subtype of everyone (and everyone is a subtype of it).\u003cp\u003e\n *\n * If you remove the {@link UnknownType}, the set of types in the type system\n * forms a lattice with the {@link #isSubtype} relation defining the partial\n * order of types. All types are united at the top of the lattice by the\n * {@link AllType} and at the bottom by the {@link NoType}.\u003cp\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolved"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "resolveResult"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypeMap"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inTemplatedCheckVisit"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CAN_CAST_TO_VISITOR"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_NAME"
      ],
      "begin_line": 78,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_CLASS"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NOT_A_TYPE"
      ],
      "begin_line": 84,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_TYPE_COMPONENT"
      ],
      "begin_line": 87,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALPHA"
      ],
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n   * Total ordering on types based on their textual representation.\n   * This is used to have a deterministic output of the toString\n   * method of the union type since this output is used in tests.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.Anonymous-2b5ccd92-4c5b-4e10-98b2-5227ba1610db.compare(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ENUMDECL"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " A flag set on enum definition tree nodes"
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENUMDECL"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.JSType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.JSType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 29)",
        "(line 115,col 5)-(line 116,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n   * Utility method for less verbose code.\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getJSDocInfo()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Gets the docInfo for this type. By default, documentation cannot be\n   * attached to arbitrary types. This must be overridden for\n   * programmer-defined types.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getDisplayName()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n   * Returns a user meaningful label for the JSType instance.  For example,\n   * Functions and Enums will return their declaration name (if they have one).\n   * Some types will not have a meaningful display name.  Calls to\n   * hasDisplayName() will return true IFF getDisplayName() will return null\n   * or a zero length string.\n   *\n   * @return the display name of the type, or null if one is not available\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasDisplayName()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n   * @return true if the JSType has a user meaningful label.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 42)",
        "(line 153,col 5)-(line 153,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasProperty(java.lang.String)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n   * Checks whether the property is present on the object.\n   * @param pname The property name.\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoType()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoResolvedType()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNoObjectType()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEmptyType()",
      "begin_line": 176,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 179,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumberObjectType()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumberValueType()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isFunctionPrototypeType()",
      "begin_line": 191,
      "end_line": 193,
      "comment": " Whether this is the prototype of a function. ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStringObjectType()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTheObjectType()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStringValueType()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isString()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n   * Tests whether the type is a string (value or Object).\n   * @return {@code this \u0026lt;: (String, string)}\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 213,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNumber()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n   * Tests whether the type is a number (value or Object).\n   * @return {@code this \u0026lt;: (Number, number)}\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 222,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isArrayType()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 226,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isBooleanObjectType()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isBooleanValueType()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isRegexpType()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isDateType()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNullType()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isVoidType()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isAllType()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isUnknownType()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isCheckedUnknownType()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isUnionType()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isStruct()",
      "begin_line": 273,
      "end_line": 292,
      "comment": "\n   * Returns true iff {@code this} can be a {@code struct}.\n   * UnionType overrides the method, assume {@code this} is not a union here.\n   ",
      "child_ranges": [
        "(line 274,col 5)-(line 290,col 5)",
        "(line 291,col 5)-(line 291,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isDict()",
      "begin_line": 298,
      "end_line": 317,
      "comment": "\n   * Returns true iff {@code this} can be a {@code dict}.\n   * UnionType overrides the method, assume {@code this} is not a union here.\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 315,col 5)",
        "(line 316,col 5)-(line 316,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeUnionType()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n   * Downcasts this to a UnionType, or returns null if this is not a UnionType.\n   *\n   * Named in honor of Haskell\u0027s Maybe type constructor.\n   ",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isGlobalThisType()",
      "begin_line": 329,
      "end_line": 331,
      "comment": " Returns true if this is a global this type. ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isFunctionType()",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Returns true if toMaybeFunctionType returns a non-null FunctionType. ",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n   * Downcasts this to a FunctionType, or returns null if this is not\n   * a function.\n   *\n   * For the purposes of this function, we define a MaybeFunctionType as any\n   * type in the sub-lattice\n   * { x | LEAST_FUNCTION_TYPE \u003c\u003d x \u003c\u003d GREATEST_FUNCTION_TYPE }\n   * This definition excludes bottom types like NoType and NoObjectType.\n   *\n   * This definition is somewhat arbitrary and axiomatic, but this is the\n   * definition that makes the most sense for the most callers.\n   ",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n   * Null-safe version of toMaybeFunctionType().\n   ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEnumElementType()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeEnumElementType()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n   * Downcasts this to an EnumElementType, or returns null if this is not an EnumElementType.\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEnumType()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeEnumType()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n   * Downcasts this to an EnumType, or returns null if this is not an EnumType.\n   ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNamedType()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isRecordType()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeRecordType()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n   * Downcasts this to a RecordType, or returns null if this is not\n   * a RecordType.\n   ",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTemplatizedType()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 400,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplatizedType()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n   * Downcasts this to a TemplatizedType, or returns null if this is not\n   * a function.\n   ",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplatizedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\n   * Null-safe version of toMaybeTemplatizedType().\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isTemplateType()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n   * Downcasts this to a TemplateType, or returns null if this is not\n   * a function.\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toMaybeTemplateType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n   * Null-safe version of toMaybeTemplateType().\n   ",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasAnyTemplateTypes()",
      "begin_line": 437,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 446,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hasAnyTemplateTypesInternal()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTemplateTypeMap()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n   * Returns the template type map associated with this type.\n   ",
      "child_ranges": [
        "(line 457,col 5)-(line 457,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.extendTemplateTypeMap(com.google.javascript.rhino.jstype.TemplateTypeMap)",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n   * Extends the template type map associated with this type, merging in the\n   * keys and values of the specified map.\n   ",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isObject()",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n   * Tests whether this type is an {@code Object}, or any subtype thereof.\n   * @return {@code this \u0026lt;: Object}\n   ",
      "child_ranges": [
        "(line 473,col 5)-(line 473,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isConstructor()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is a constructor or a\n   * named type that points to such a type.\n   ",
      "child_ranges": [
        "(line 481,col 5)-(line 481,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNominalType()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n   * Whether this type is a nominal type (a named instance object or\n   * a named enum).\n   ",
      "child_ranges": [
        "(line 489,col 5)-(line 489,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNominalConstructor()",
      "begin_line": 496,
      "end_line": 514,
      "comment": "\n   * Whether this type is the original constructor of a nominal type.\n   * Does not include structural constructors.\n   ",
      "child_ranges": [
        "(line 497,col 5)-(line 512,col 5)",
        "(line 513,col 5)-(line 513,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInstanceType()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n   * Whether this type is an Instance object of some constructor.\n   * Does not necessarily mean this is an {@link InstanceObjectType}.\n   ",
      "child_ranges": [
        "(line 521,col 5)-(line 521,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInterface()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is an interface or a named\n   * type that points to such a type.\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 529,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isOrdinaryFunction()",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\n   * Whether this type is a {@link FunctionType} that is an ordinary function or\n   * a named type that points to such a type.\n   ",
      "child_ranges": [
        "(line 537,col 5)-(line 537,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEquivalentTo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n   * Checks if two types are equivalent.\n   ",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isInvariant(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "\n   * Checks if two types are invariant.\n   * @see EquivalenceMethod\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.differsFrom(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n   * Whether this type is meaningfully different from {@code that} type for\n   * the purposes of data flow analysis.\n   *\n   * This is a trickier check than pure equality, because it has to properly\n   * handle unknown types. See {@code EquivalenceMethod} for more info.\n   *\n   * @see \u003ca href\u003d\"http://www.youtube.com/watch?v\u003d_RpSv3HjpEw\"\u003eUnknown unknowns\u003c/a\u003e\n   ",
      "child_ranges": [
        "(line 565,col 5)-(line 565,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 571,
      "end_line": 639,
      "comment": "\n   * An equivalence visitor.\n   ",
      "child_ranges": [
        "(line 572,col 5)-(line 574,col 5)",
        "(line 576,col 5)-(line 576,col 42)",
        "(line 577,col 5)-(line 577,col 47)",
        "(line 578,col 5)-(line 594,col 5)",
        "(line 596,col 5)-(line 599,col 5)",
        "(line 601,col 5)-(line 604,col 5)",
        "(line 606,col 5)-(line 609,col 5)",
        "(line 611,col 5)-(line 614,col 5)",
        "(line 616,col 5)-(line 619,col 5)",
        "(line 622,col 5)-(line 626,col 5)",
        "(line 628,col 5)-(line 632,col 5)",
        "(line 638,col 5)-(line 638,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isEquivalent(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 641,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 642,col 5)-(line 643,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.equals(java.lang.Object)",
      "begin_line": 646,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 648,col 5)-(line 649,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.hashCode()",
      "begin_line": 652,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 5)-(line 654,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesInt32Context()",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * \u0027Int32\u0027 context.  This context includes, for example, the operands of a\n   * bitwise or operator.  Since we do not currently support integer types,\n   * this is a synonym for {@code Number}.\n   ",
      "child_ranges": [
        "(line 664,col 5)-(line 664,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesUint32Context()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * \u0027Uint32\u0027 context.  This context includes the right-hand operand of a shift\n   * operator.\n   ",
      "child_ranges": [
        "(line 673,col 5)-(line 673,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesNumberContext()",
      "begin_line": 680,
      "end_line": 682,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * numeric context, such as an operand of a multiply operator.\n   ",
      "child_ranges": [
        "(line 681,col 5)-(line 681,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesStringContext()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\n   * This predicate is used to test whether a given type can appear in a\n   * {@code String} context, such as an operand of a string concat (+) operator.\n   *\n   * All types have at least the potential for converting to {@code String}.\n   * When we add externally defined types, such as a browser OM, we may choose\n   * to add types that do not automatically convert to {@code String}.\n   ",
      "child_ranges": [
        "(line 693,col 5)-(line 693,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchesObjectContext()",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n   * This predicate is used to test whether a given type can appear in an\n   * {@code Object} context, such as the expression in a with statement.\n   *\n   * Most types we will encounter, except notably {@code null}, have at least\n   * the potential for converting to {@code Object}.  Host defined objects can\n   * get peculiar.\n   ",
      "child_ranges": [
        "(line 705,col 5)-(line 705,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.findPropertyType(java.lang.String)",
      "begin_line": 718,
      "end_line": 725,
      "comment": "\n   * Coerces this type to an Object type, then gets the type of the property\n   * whose name is given.\n   *\n   * Unlike {@link ObjectType#getPropertyType}, returns null if the property\n   * is not found.\n   *\n   * @return The property\u0027s type. {@code null} if the current type cannot\n   *     have properties, or if the type is not found.\n   ",
      "child_ranges": [
        "(line 719,col 5)-(line 719,col 63)",
        "(line 720,col 5)-(line 722,col 5)",
        "(line 724,col 5)-(line 724,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canBeCalled()",
      "begin_line": 733,
      "end_line": 735,
      "comment": "\n   * This predicate is used to test whether a given type can be used as the\n   * \u0027function\u0027 in a function call.\n   *\n   * @return {@code true} if this type might be callable.\n   ",
      "child_ranges": [
        "(line 734,col 5)-(line 734,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canCastTo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n   * Tests whether values of {@code this} type can be safely assigned\n   * to values of {@code that} type.\u003cp\u003e\n   *\n   * The default implementation verifies that {@code this} is a subtype\n   * of {@code that}.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 745,col 5)-(line 745,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.autoboxesTo()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n   * Turn a scalar type to the corresponding object type.\n   *\n   * @return the auto-boxed type or {@code null} if this type is not a scalar.\n   ",
      "child_ranges": [
        "(line 754,col 5)-(line 754,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.unboxesTo()",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n   * Turn an object type to its corresponding scalar type.\n   *\n   * @return the unboxed type or {@code null} if this type does not unbox.\n   ",
      "child_ranges": [
        "(line 763,col 5)-(line 763,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toObjectType()",
      "begin_line": 772,
      "end_line": 774,
      "comment": "\n   * Casts this to an ObjectType, or returns null if this is not an ObjectType.\n   * If this is a scalar type, it will *not* be converted to an object type.\n   * If you want to simulate JS autoboxing or dereferencing, you should use\n   * autoboxesTo() or dereference().\n   ",
      "child_ranges": [
        "(line 773,col 5)-(line 773,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.autobox()",
      "begin_line": 782,
      "end_line": 786,
      "comment": "\n   * Dereference a type for property access.\n   *\n   * Filters null/undefined and autoboxes the resulting type.\n   * Never returns null.\n   ",
      "child_ranges": [
        "(line 783,col 5)-(line 783,col 55)",
        "(line 784,col 5)-(line 784,col 46)",
        "(line 785,col 5)-(line 785,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.dereference()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n   * Dereference a type for property access.\n   *\n   * Filters null/undefined, autoboxes the resulting type, and returns it\n   * iff it\u0027s an object.\n   ",
      "child_ranges": [
        "(line 795,col 5)-(line 795,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canTestForEqualityWith(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n   * Tests whether {@code this} and {@code that} are meaningfully\n   * comparable. By meaningfully, we mean compatible types that do not lead\n   * to step 22 of the definition of the Abstract Equality Comparison\n   * Algorithm (11.9.3, page 55\u0026ndash;56) of the ECMA-262 specification.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 805,col 5)-(line 805,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n   * Compares {@code this} and {@code that}.\n   * @return \u003cul\u003e\n   * \u003cli\u003e{@link TernaryValue#TRUE} if the comparison of values of\n   *   {@code this} type and {@code that} always succeed (such as\n   *   {@code undefined} compared to {@code null})\u003c/li\u003e\n   * \u003cli\u003e{@link TernaryValue#FALSE} if the comparison of values of\n   *   {@code this} type and {@code that} always fails (such as\n   *   {@code undefined} compared to {@code number})\u003c/li\u003e\n   * \u003cli\u003e{@link TernaryValue#UNKNOWN} if the comparison can succeed or\n   *   fail depending on the concrete values\u003c/li\u003e\n   * \u003c/ul\u003e\n   ",
      "child_ranges": [
        "(line 822,col 5)-(line 822,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.testForEqualityHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 825,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 826,col 5)-(line 831,col 5)",
        "(line 833,col 5)-(line 833,col 43)",
        "(line 834,col 5)-(line 834,col 43)",
        "(line 835,col 5)-(line 841,col 5)",
        "(line 843,col 5)-(line 858,col 5)",
        "(line 859,col 5)-(line 861,col 5)",
        "(line 862,col 5)-(line 862,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.canTestForShallowEqualityWith(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 872,
      "end_line": 884,
      "comment": "\n   * Tests whether {@code this} and {@code that} are meaningfully\n   * comparable using shallow comparison. By meaningfully, we mean compatible\n   * types that are not rejected by step 1 of the definition of the Strict\n   * Equality Comparison Algorithm (11.9.6, page 56\u0026ndash;57) of the\n   * ECMA-262 specification.\u003cp\u003e\n   ",
      "child_ranges": [
        "(line 873,col 5)-(line 875,col 5)",
        "(line 877,col 5)-(line 877,col 42)",
        "(line 878,col 5)-(line 883,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isNullable()",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\n   * Tests whether this type is nullable.\n   ",
      "child_ranges": [
        "(line 890,col 5)-(line 890,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.collapseUnion()",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\n   * Gets the least supertype of this that\u0027s not a union.\n   ",
      "child_ranges": [
        "(line 897,col 5)-(line 897,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 912,
      "end_line": 918,
      "comment": "\n   * Gets the least supertype of {@code this} and {@code that}.\n   * The least supertype is the join (\u0026#8744;) or supremum of both types in the\n   * type lattice.\u003cp\u003e\n   * Examples:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code number \u0026#8744; *} \u003d {@code *}\u003c/li\u003e\n   * \u003cli\u003e{@code number \u0026#8744; Object} \u003d {@code (number, Object)}\u003c/li\u003e\n   * \u003cli\u003e{@code Number \u0026#8744; Object} \u003d {@code Object}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * @return {@code this \u0026#8744; that}\n   ",
      "child_ranges": [
        "(line 913,col 5)-(line 916,col 5)",
        "(line 917,col 5)-(line 917,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 924,
      "end_line": 929,
      "comment": "\n   * A generic implementation meant to be used as a helper for common\n   * getLeastSupertype implementations.\n   ",
      "child_ranges": [
        "(line 925,col 5)-(line 925,col 62)",
        "(line 926,col 5)-(line 928,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n   * Gets the greatest subtype of {@code this} and {@code that}.\n   * The greatest subtype is the meet (\u0026#8743;) or infimum of both types in the\n   * type lattice.\u003cp\u003e\n   * Examples\n   * \u003cul\u003e\n   * \u003cli\u003e{@code Number \u0026#8743; Any} \u003d {@code Any}\u003c/li\u003e\n   * \u003cli\u003e{@code number \u0026#8743; Object} \u003d {@code Any}\u003c/li\u003e\n   * \u003cli\u003e{@code Number \u0026#8743; Object} \u003d {@code Number}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * @return {@code this \u0026#8744; that}\n   ",
      "child_ranges": [
        "(line 944,col 5)-(line 944,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 951,
      "end_line": 1003,
      "comment": "\n   * A generic implementation meant to be used as a helper for common\n   * getGreatestSubtype implementations.\n   ",
      "child_ranges": [
        "(line 952,col 5)-(line 985,col 5)",
        "(line 987,col 5)-(line 997,col 5)",
        "(line 999,col 5)-(line 1001,col 5)",
        "(line 1002,col 5)-(line 1002,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.filterNoResolvedType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1013,
      "end_line": 1040,
      "comment": "\n   * When computing infima, we may get a situation like\n   * inf(Type1, Type2)\n   * where both types are unresolved, so they\u0027re technically\n   * subtypes of one another.\n   *\n   * If this happens, filter them down to NoResolvedType.\n   ",
      "child_ranges": [
        "(line 1014,col 5)-(line 1038,col 5)",
        "(line 1039,col 5)-(line 1039,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getRestrictedTypeGivenToBooleanOutcome(boolean)",
      "begin_line": 1056,
      "end_line": 1067,
      "comment": "\n   * Computes the restricted type of this type knowing that the\n   * {@code ToBoolean} predicate has a specific value. For more information\n   * about the {@code ToBoolean} predicate, see\n   * {@link #getPossibleToBooleanOutcomes}.\n   *\n   * @param outcome the value of the {@code ToBoolean} predicate\n   *\n   * @return the restricted type, or the Any Type if the underlying type could\n   *         not have yielded this ToBoolean value\n   *\n   * TODO(user): Move this method to the SemanticRAI and use the visit\n   * method of types to get the restricted type.\n   ",
      "child_ranges": [
        "(line 1057,col 5)-(line 1059,col 5)",
        "(line 1061,col 5)-(line 1061,col 64)",
        "(line 1062,col 5)-(line 1066,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getPossibleToBooleanOutcomes()",
      "begin_line": 1085,
      "end_line": 1085,
      "comment": "\n   * Computes the set of possible outcomes of the {@code ToBoolean} predicate\n   * for this type. The {@code ToBoolean} predicate is defined by the ECMA-262\n   * standard, 3\u003csup\u003erd\u003c/sup\u003e edition. Its behavior for simple types can be\n   * summarized by the following table:\n   * \u003ctable\u003e\n   * \u003ctr\u003e\u003cth\u003etype\u003c/th\u003e\u003cth\u003eresult\u003c/th\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code undefined}\u003c/td\u003e\u003ctd\u003e{false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code null}\u003c/td\u003e\u003ctd\u003e{false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code boolean}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code number}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code string}\u003c/td\u003e\u003ctd\u003e{true, false}\u003c/td\u003e\u003c/tr\u003e\n   * \u003ctr\u003e\u003ctd\u003e{@code Object}\u003c/td\u003e\u003ctd\u003e{true}\u003c/td\u003e\u003c/tr\u003e\n   * \u003c/table\u003e\n   * @return the set of boolean literals for this type\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1099,
      "end_line": 1118,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types if equality\n   * is observed. If a value {@code v1} of type {@code null} is equal to a value\n   * {@code v2} of type {@code (undefined,number)}, we can infer that the\n   * type of {@code v1} is {@code null} and the type of {@code v2} is\n   * {@code undefined}.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1101,col 5)-(line 1104,col 5)",
        "(line 1107,col 5)-(line 1114,col 5)",
        "(line 1117,col 5)-(line 1117,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1132,
      "end_line": 1152,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types if inequality\n   * is observed. If a value {@code v1} of type {@code number} is not equal to a\n   * value {@code v2} of type {@code (undefined,number)}, we can infer that the\n   * type of {@code v1} is {@code number} and the type of {@code v2} is\n   * {@code number} as well.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1134,col 5)-(line 1137,col 5)",
        "(line 1140,col 5)-(line 1148,col 5)",
        "(line 1151,col 5)-(line 1151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderShallowEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1163,
      "end_line": 1166,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types under shallow\n   * equality.\n   *\n   * @return a pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}.\n   ",
      "child_ranges": [
        "(line 1164,col 5)-(line 1164,col 49)",
        "(line 1165,col 5)-(line 1165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.getTypesUnderShallowInequality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1177,
      "end_line": 1193,
      "comment": "\n   * Computes the subset of {@code this} and {@code that} types under\n   * shallow inequality.\n   *\n   * @return A pair containing the restricted type of {@code this} as the first\n   *         component and the restricted type of {@code that} as the second\n   *         element. The returned pair is never {@code null} even though its\n   *         components may be {@code null}\n   ",
      "child_ranges": [
        "(line 1179,col 5)-(line 1182,col 5)",
        "(line 1187,col 5)-(line 1192,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.restrictByNotNullOrUndefined()",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\n   * If this is a union type, returns a union type that does not include\n   * the null or undefined type.\n   ",
      "child_ranges": [
        "(line 1200,col 5)-(line 1200,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\n   * Checks whether {@code this} is a subtype of {@code that}.\u003cp\u003e\n   *\n   * Subtyping rules:\n   * \u003cul\u003e\n   * \u003cli\u003e(unknown) \u0026mdash; every type is a subtype of the Unknown type.\u003c/li\u003e\n   * \u003cli\u003e(no) \u0026mdash; the No type is a subtype of every type.\u003c/li\u003e\n   * \u003cli\u003e(no-object) \u0026mdash; the NoObject type is a subtype of every object\n   * type (i.e. subtypes of the Object type).\u003c/li\u003e\n   * \u003cli\u003e(ref) \u0026mdash; a type is a subtype of itself.\u003c/li\u003e\n   * \u003cli\u003e(union-l) \u0026mdash; A union type is a subtype of a type U if all the\n   * union type\u0027s constituents are a subtype of U. Formally\u003cbr\u003e\n   * {@code (T\u003csub\u003e1\u003c/sub\u003e, \u0026hellip;, T\u003csub\u003en\u003c/sub\u003e) \u0026lt;: U} if and only\n   * {@code T\u003csub\u003ek\u003c/sub\u003e \u0026lt;: U} for all {@code k \u0026isin; 1..n}.\u003c/li\u003e\n   * \u003cli\u003e(union-r) \u0026mdash; A type U is a subtype of a union type if it is a\n   * subtype of one of the union type\u0027s constituents. Formally\u003cbr\u003e\n   * {@code U \u0026lt;: (T\u003csub\u003e1\u003c/sub\u003e, \u0026hellip;, T\u003csub\u003en\u003c/sub\u003e)} if and only\n   * if {@code U \u0026lt;: T\u003csub\u003ek\u003c/sub\u003e} for some index {@code k}.\u003c/li\u003e\n   * \u003cli\u003e(objects) \u0026mdash; an Object {@code O\u003csub\u003e1\u003c/sub\u003e} is a subtype\n   * of an object {@code O\u003csub\u003e2\u003c/sub\u003e} if it has more properties\n   * than {@code O\u003csub\u003e2\u003c/sub\u003e} and all common properties are\n   * pairwise subtypes.\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @return {@code this \u0026lt;: that}\n   ",
      "child_ranges": [
        "(line 1230,col 5)-(line 1230,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1237,
      "end_line": 1297,
      "comment": "\n   * A generic implementation meant to be used as a helper for common subtyping\n   * cases.\n   ",
      "child_ranges": [
        "(line 1239,col 5)-(line 1241,col 5)",
        "(line 1243,col 5)-(line 1245,col 5)",
        "(line 1247,col 5)-(line 1249,col 5)",
        "(line 1251,col 5)-(line 1259,col 5)",
        "(line 1263,col 5)-(line 1263,col 67)",
        "(line 1264,col 5)-(line 1264,col 67)",
        "(line 1265,col 5)-(line 1265,col 33)",
        "(line 1266,col 5)-(line 1279,col 5)",
        "(line 1280,col 5)-(line 1282,col 5)",
        "(line 1286,col 5)-(line 1289,col 5)",
        "(line 1292,col 5)-(line 1295,col 5)",
        "(line 1296,col 5)-(line 1296,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isExemptFromTemplateTypeInvariance(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1303,
      "end_line": 1308,
      "comment": "\n   * Determines if the specified type is exempt from standard invariant\n   * templatized typing rules.\n   ",
      "child_ranges": [
        "(line 1304,col 5)-(line 1304,col 45)",
        "(line 1305,col 5)-(line 1307,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 1315,
      "end_line": 1315,
      "comment": "\n   * Visit this type with the given visitor.\n   * @see com.google.javascript.rhino.jstype.Visitor\n   * @return the value returned by the visitor\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1322,
      "end_line": 1322,
      "comment": "\n   * Visit the types with the given visitor.\n   * @see com.google.javascript.rhino.jstype.RelationshipVisitor\n   * @return the value returned by the visitor\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.forceResolve(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1329,
      "end_line": 1335,
      "comment": "\n   * Force this type to resolve, even if the registry is in a lazy\n   * resolving mode.\n   * @see #resolve\n   ",
      "child_ranges": [
        "(line 1330,col 5)-(line 1330,col 59)",
        "(line 1331,col 5)-(line 1331,col 51)",
        "(line 1332,col 5)-(line 1332,col 38)",
        "(line 1333,col 5)-(line 1333,col 44)",
        "(line 1334,col 5)-(line 1334,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.resolve(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1351,
      "end_line": 1364,
      "comment": "\n   * Resolve this type in the given scope.\n   *\n   * The returned value must be equal to {@code this}, as defined by\n   * {@link #isEquivalentTo}. It may or may not be the same object. This method\n   * may modify the internal state of {@code this}, as long as it does\n   * so in a way that preserves Object equality.\n   *\n   * For efficiency, we should only resolve a type once per compilation job.\n   * For incremental compilations, one compilation job may need the\n   * artifacts from a previous generation, so we will eventually need\n   * a generational flag instead of a boolean one.\n   ",
      "child_ranges": [
        "(line 1352,col 5)-(line 1359,col 5)",
        "(line 1360,col 5)-(line 1360,col 20)",
        "(line 1361,col 5)-(line 1361,col 46)",
        "(line 1362,col 5)-(line 1362,col 57)",
        "(line 1363,col 5)-(line 1363,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1369,
      "end_line": 1369,
      "comment": "\n   * @see #resolve\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.setResolvedTypeInternal(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1371,
      "end_line": 1374,
      "comment": "",
      "child_ranges": [
        "(line 1372,col 5)-(line 1372,col 25)",
        "(line 1373,col 5)-(line 1373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.isResolved()",
      "begin_line": 1377,
      "end_line": 1379,
      "comment": " Whether the type has been resolved. ",
      "child_ranges": [
        "(line 1378,col 5)-(line 1378,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.clearResolved()",
      "begin_line": 1382,
      "end_line": 1385,
      "comment": " Clears the resolved field. ",
      "child_ranges": [
        "(line 1383,col 5)-(line 1383,col 21)",
        "(line 1384,col 5)-(line 1384,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.safeResolve(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1391,
      "end_line": 1394,
      "comment": "\n   * A null-safe resolve.\n   * @see #resolve\n   ",
      "child_ranges": [
        "(line 1393,col 5)-(line 1393,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.setValidator(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1402,
      "end_line": 1404,
      "comment": "\n   * Certain types have constraints on them at resolution-time.\n   * For example, a type in an {@code @extends} annotation must be an\n   * object. Clients should inject a validator that emits a warning\n   * if the type does not validate, and return false.\n   ",
      "child_ranges": [
        "(line 1403,col 5)-(line 1403,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypePair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1406,
      "end_line": 1414,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeA"
      ],
      "begin_line": 1407,
      "end_line": 1407,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeB"
      ],
      "begin_line": 1408,
      "end_line": 1408,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.JSType.TypePair.TypePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1410,
      "end_line": 1413,
      "comment": "",
      "child_ranges": [
        "(line 1411,col 7)-(line 1411,col 25)",
        "(line 1412,col 7)-(line 1412,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toString()",
      "begin_line": 1420,
      "end_line": 1423,
      "comment": "\n   * A string representation of this type, suitable for printing\n   * in warnings.\n   ",
      "child_ranges": [
        "(line 1422,col 5)-(line 1422,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toDebugHashCodeString()",
      "begin_line": 1429,
      "end_line": 1431,
      "comment": "\n   * A hash code function for diagnosing complicated issues\n   * around type-identity.\n   ",
      "child_ranges": [
        "(line 1430,col 5)-(line 1430,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toAnnotationString()",
      "begin_line": 1437,
      "end_line": 1439,
      "comment": "\n   * A string representation of this type, suitable for printing\n   * in type annotations at code generation time.\n   ",
      "child_ranges": [
        "(line 1438,col 5)-(line 1438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.toStringHelper(boolean)",
      "begin_line": 1445,
      "end_line": 1445,
      "comment": "\n   * @param forAnnotations Whether this is for use in code generator\n   *     annotations. Otherwise, it\u0027s for warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.JSType.matchConstraint(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1455,
      "end_line": 1455,
      "comment": "\n   * Modify this type so that it matches the specified type.\n   *\n   * This is useful for reverse type-inference, where we want to\n   * infer that an object literal matches its constraint (much like\n   * how the java compiler does reverse-inference to figure out generics).\n   * @param constraint\n   ",
      "child_ranges": []
    }
  ]
}