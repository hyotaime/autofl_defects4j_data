{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/ArrowType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrowType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.JSType"
      ],
      "begin_line": 53,
      "end_line": 321,
      "comment": "\n * The arrow type is an internal type that models the functional arrow type\n * seen in typical functional programming languages.  It is used solely for\n * separating the management of the arrow type from the complex\n * {@link FunctionType} that models JavaScript\u0027s notion of functions.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnType"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "returnTypeInferred"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Whether the return type is inferred."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.ArrowType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 67,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 20)",
        "(line 71,col 5)-(line 73,col 19)",
        "(line 74,col 5)-(line 75,col 49)",
        "(line 76,col 5)-(line 76,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 79,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 5)",
        "(line 85,col 5)-(line 85,col 39)",
        "(line 91,col 5)-(line 93,col 5)",
        "(line 114,col 5)-(line 114,col 48)",
        "(line 115,col 5)-(line 115,col 53)",
        "(line 116,col 5)-(line 161,col 5)",
        "(line 164,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 170,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.hasEqualParameters(com.google.javascript.rhino.jstype.ArrowType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 177,
      "end_line": 211,
      "comment": "\n   * @return True if our parameter spec is equal to {@code that}\u0027s parameter\n   *     spec.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 48)",
        "(line 179,col 5)-(line 179,col 54)",
        "(line 180,col 5)-(line 207,col 5)",
        "(line 210,col 5)-(line 210,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.checkArrowEquivalenceHelper(com.google.javascript.rhino.jstype.ArrowType, com.google.javascript.rhino.jstype.EquivalenceMethod)",
      "begin_line": 213,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 218,col 5)",
        "(line 219,col 5)-(line 219,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.hashCode()",
      "begin_line": 222,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 21)",
        "(line 225,col 5)-(line 227,col 5)",
        "(line 228,col 5)-(line 230,col 5)",
        "(line 231,col 5)-(line 240,col 5)",
        "(line 241,col 5)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.getLeastSupertype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.getGreatestSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.testForEquality(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 5)-(line 265,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.getPossibleToBooleanOutcomes()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 273,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 51)",
        "(line 276,col 5)-(line 281,col 5)",
        "(line 282,col 5)-(line 282,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.hasUnknownParamsOrReturn()",
      "begin_line": 285,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 294,col 5)",
        "(line 295,col 5)-(line 295,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.toStringHelper(boolean)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.hasAnyTemplateTypesInternal()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 306,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ArrowType.hasTemplatedParameterType()",
      "begin_line": 309,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 318,col 5)",
        "(line 319,col 5)-(line 319,col 17)"
      ]
    }
  ]
}