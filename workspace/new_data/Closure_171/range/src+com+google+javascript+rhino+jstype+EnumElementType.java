{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/EnumElementType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumElementType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ObjectType"
      ],
      "begin_line": 51,
      "end_line": 246,
      "comment": "\n * The type of individual elements of an enum type\n * (see {@link EnumType}).\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "primitiveType"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * The primitive type this enum element type wraps. For instance, in\n   * the following code defining the {@code LOCAL_CODES} enum\n   * \u003cpre\u003evar LOCAL_CODES \u003d {A: 3, B: 9, C: 8}\u003c/pre\u003e\n   * the primitive type of the the constants is {@code number}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveObjectType"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The primitive type, if it is an object."
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.EnumElementType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 67,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 20)",
        "(line 70,col 5)-(line 70,col 37)",
        "(line 71,col 5)-(line 71,col 58)",
        "(line 72,col 5)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.getPropertyMap()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 78,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.toMaybeEnumElementType()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.matchesNumberContext()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.matchesStringContext()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.matchesObjectContext()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.canBeCalled()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.isObject()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.isNullable()",
      "begin_line": 122,
      "end_line": 125,
      "comment": "\n   * This predicate determines whether objects of this type can have the null\n   * value, and therefore can appear in contexts where null is expected.\n   *\n   * @return true for everything but Number and Boolean types.\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.isNominalType()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.hashCode()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n   * If this is equal to a NamedType object, its hashCode must be equal\n   * to the hashCode of the NamedType object.\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.toStringHelper(boolean)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 149,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.getReferenceName()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.hasReferenceName()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 162,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.getImplicitPrototype()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.findPropertyType(java.lang.String)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.getConstructor()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 200,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.autoboxesTo()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.getPrimitiveType()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n   * Gets the primitive type of this enum element.\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.meet(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 231,
      "end_line": 238,
      "comment": "\n   * Returns the infimum of a enum element type and another type, or null\n   * if the infimum is empty.\n   *\n   * This can be a little bit weird. For example, suppose you have an enum\n   * of {(string|number)}, and you want the greatest subtype of the enum\n   * and a {number}.\n   *\n   * The infimum is non-empty. But at the same time, we don\u0027t really have\n   * a name for this infimum. It\u0027s equivalent to \"elements of this enum that\n   * are numbers\".\n   *\n   * The best we can do is make up a new type. This is similar to what\n   * we do in UnionType#meet, which kind-of-sort-of makes sense, because\n   * an EnumElementType is a union of instances of a type.\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 66)",
        "(line 233,col 5)-(line 237,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumElementType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 240,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 52)",
        "(line 243,col 5)-(line 243,col 57)",
        "(line 244,col 5)-(line 244,col 16)"
      ]
    }
  ]
}