{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/EnumType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 56,
      "end_line": 187,
      "comment": "\n * An enum type representing a branded collection of elements. Each element\n * is referenced by its name, and has an {@link EnumElementType} type.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * The object literal or alias which this type represents.\n   * It may be {@code null}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "elementsType"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " the type of the individual elements"
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " the elements\u0027 names (they all have the same type)"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.EnumType.EnumType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n   * Creates an enum type.\n   *\n   * @param name the enum\u0027s name\n   * @param elementsType the base type of the individual elements\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 48)",
        "(line 79,col 5)-(line 79,col 25)",
        "(line 80,col 5)-(line 80,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getSource()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n   * Gets the source node or null if this is an unknown enum.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.toMaybeEnumType()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getImplicitPrototype()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getElements()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n   * Gets the elements defined on this enum.\n   * @return the elements\u0027 names defined on this enum. The returned set is\n   *         immutable.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.defineElement(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n   * Defines a new element on this enum.\n   * @param name the name of the new element\n   * @param definingNode the {@code Node} that defines this new element\n   * @return true iff the new element is added successfully\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 23)",
        "(line 117,col 5)-(line 117,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getElementsType()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n   * Gets the elements\u0027 type.\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 127,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 54)",
        "(line 130,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 133,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.toStringHelper(boolean)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getDisplayName()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.getConstructor()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.matchesNumberContext()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.matchesStringContext()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.matchesObjectContext()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.EnumType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 68)",
        "(line 185,col 5)-(line 185,col 43)"
      ]
    }
  ]
}