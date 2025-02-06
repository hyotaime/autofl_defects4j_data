{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/UnresolvedTypeExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnresolvedTypeExpression",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.UnknownType"
      ],
      "begin_line": 58,
      "end_line": 83,
      "comment": "\n * An {@code UnresolvedType} is a reference to some type expression.\n * This provides a convenient mechanism for implementing forward\n * references to types; a {@code UnresolvedType} can be used as a\n * placeholder until its reference is resolved.\n *\n * The {@code UnresolvedType} will behave like an opaque unknown type.\n * When its {@code #resolve} method is called, it will return the underlying\n * type. The underlying type can resolve to any JS type.\u003cp\u003e\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeExpr"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.UnresolvedTypeExpression.UnresolvedTypeExpression(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "\n   * Create a named type based on the reference.\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 27)",
        "(line 71,col 5)-(line 71,col 41)",
        "(line 72,col 5)-(line 72,col 29)",
        "(line 73,col 5)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.UnresolvedTypeExpression.resolveInternal(com.google.javascript.rhino.ErrorReporter, com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n   * Resolve the referenced type within the enclosing scope.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 73)"
      ]
    }
  ]
}