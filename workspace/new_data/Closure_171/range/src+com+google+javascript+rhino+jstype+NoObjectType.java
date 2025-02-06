{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/NoObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NoObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.FunctionType"
      ],
      "begin_line": 63,
      "end_line": 163,
      "comment": "\n * The bottom Object type, representing the subclass of all objects.\n *\n * Although JavaScript programmers can\u0027t explicitly denote the bottom\n * Object type, it comes up in static analysis. For example, if we have:\n * \u003ccode\u003e\n * var x \u003d function() {};\n * if (x instanceof Array) {\n *   f(x);\n * }\n * \u003c/code\u003e\n * We need to be able to assign {@code x} a type within the {@code f(x)}\n * call. It has no possible type, but {@code x} would not be legal if f\n * expected a string. So we assign it the {@code NoObjectType}.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bottom_type\"\u003eBottom types\u003c/a\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.NoObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 69,col 34)",
        "(line 70,col 5)-(line 70,col 45)",
        "(line 71,col 5)-(line 71,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.toMaybeFunctionType()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.isNoObjectType()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.getImplicitPrototype()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.getReferenceName()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.matchesNumberContext()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.matchesObjectContext()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.matchesStringContext()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.hashCode()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.removeProperty(java.lang.String)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.setPropertyJSDocInfo(java.lang.String, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.toStringHelper(boolean)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.getConstructor()",
      "begin_line": 154,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoObjectType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 16)"
      ]
    }
  ]
}