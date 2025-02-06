{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/RecordType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RecordType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 61,
      "end_line": 275,
      "comment": "\n * A record (structural) type.\n *\n * Subtyping: The subtyping of a record type is defined via structural\n * comparison of a record type\u0027s properties. For example, a record\n * type of the form { a : TYPE_1 } is a supertype of a record type\n * of the form { b : TYPE_2, a : TYPE_1 } because B can be assigned to\n * A and matches all constraints. Similarly, a defined type can be assigned\n * to a record type so long as that defined type matches all property\n * constraints of the record type. A record type of the form { a : A, b : B }\n * can be assigned to a record of type { a : A }.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declared"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isFrozen"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.RecordType.RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.RecordType.RecordType(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty\u003e, boolean)",
      "begin_line": 83,
      "end_line": 106,
      "comment": "\n   * Creates a record type.\n   *\n   * @param registry The type registry under which this type lives.\n   * @param properties A map of all the properties of this record type.\n   * @param declared Whether this is a declared or synthesized type.\n   *     A synthesized record type is just used for bookkeeping\n   *     in the type system. A declared record type was actually used in the\n   *     user\u0027s program.\n   * @throws IllegalStateException if the {@code RecordProperty} associated\n   *         with a property is null.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 32)",
        "(line 86,col 5)-(line 86,col 25)",
        "(line 87,col 5)-(line 87,col 29)",
        "(line 89,col 5)-(line 102,col 5)",
        "(line 105,col 5)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.isSynthetic()",
      "begin_line": 109,
      "end_line": 111,
      "comment": " @return Is this synthesized for internal bookkeeping? ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.checkRecordEquivalenceHelper(com.google.javascript.rhino.jstype.RecordType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 113,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 47)",
        "(line 116,col 5)-(line 116,col 64)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 125,col 5)",
        "(line 126,col 5)-(line 126,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.getImplicitPrototype()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 134,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 139,col 5)",
        "(line 141,col 5)-(line 142,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 145,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 173,col 5)",
        "(line 175,col 5)-(line 176,col 37)",
        "(line 177,col 5)-(line 179,col 34)",
        "(line 180,col 5)-(line 201,col 5)",
        "(line 202,col 5)-(line 202,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.toMaybeRecordType()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 210,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 214,col 5)",
        "(line 217,col 5)-(line 220,col 5)",
        "(line 225,col 5)-(line 227,col 5)",
        "(line 229,col 5)-(line 229,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordType.isSubtype(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.RecordType)",
      "begin_line": 233,
      "end_line": 274,
      "comment": " Determines if typeA is a subtype of typeB ",
      "child_ranges": [
        "(line 251,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 16)"
      ]
    }
  ]
}