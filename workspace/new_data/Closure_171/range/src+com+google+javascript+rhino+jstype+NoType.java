{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/NoType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NoType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.NoObjectType"
      ],
      "begin_line": 61,
      "end_line": 121,
      "comment": "\n * Bottom type, representing the subclass of any value or object.\n *\n * Although JavaScript programmers can\u0027t explicitly denote the bottom type,\n * it comes up in static analysis. For example, if we have:\n * \u003ccode\u003e\n * var x \u003d null;\n * if (x) {\n *   f(x);\n * }\n * \u003c/code\u003e\n * We need to be able to assign {@code x} a type within the {@code f(x)}\n * call. Since it has no possible type, we assign {@code x} the NoType,\n * so that {@code f(x)} is legal no matter what the type of {@code f}\u0027s\n * first argument is.\n *\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Bottom_type\"\u003eBottom types\u003c/a\u003e\n "
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
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.NoType.NoType(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.isNoObjectType()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.isNoType()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.isNullable()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.getPossibleToBooleanOutcomes()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.matchesNumberContext()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.matchesObjectContext()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.matchesStringContext()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.NoType.toStringHelper(boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 41)"
      ]
    }
  ]
}