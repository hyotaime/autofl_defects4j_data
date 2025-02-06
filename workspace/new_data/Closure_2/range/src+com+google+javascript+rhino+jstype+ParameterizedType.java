{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/ParameterizedType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParameterizedType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ProxyObjectType"
      ],
      "begin_line": 52,
      "end_line": 160,
      "comment": "\n * An object type with a declared default element type, such as\n * \u003ccode\u003eArray.\u003cstring\u003e\u003c/code\u003e.\n *\n * // TODO(user): Define the subtyping relation for parameterized types. Also,\n * take parameterized type into account for equality.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameterType"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.ParameterizedType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 32)",
        "(line 60,col 5)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.getParameterType()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.toStringHelper(boolean)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 57)",
        "(line 71,col 5)-(line 71,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.toMaybeParameterizedType()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.hasAnyTemplateTypesInternal()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.isParameterizeSubtypeOf(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 98,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 112,col 5)",
        "(line 114,col 5)-(line 114,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.wrapsSameRawType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 120,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.wrapsRawType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ParameterizedType.getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 131,
      "end_line": 159,
      "comment": "\n   * Computes the greatest subtype of two related parameterized types.\n   * @return The greatest subtype.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 40)",
        "(line 134,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 148,col 64)",
        "(line 149,col 5)-(line 149,col 37)",
        "(line 151,col 5)-(line 153,col 5)",
        "(line 158,col 5)-(line 158,col 42)"
      ]
    }
  ]
}