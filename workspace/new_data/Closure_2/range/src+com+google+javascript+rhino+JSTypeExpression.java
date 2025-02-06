{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/JSTypeExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSTypeExpression",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 123,
      "comment": "\n * Represents a type expression as a miniature Rhino AST, so that the\n * type expression can be evaluated later.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The root of the AST. "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The source name where the type expression appears. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.JSTypeExpression.JSTypeExpression(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 21)",
        "(line 66,col 5)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\n   * Make the given type expression into an optional type expression,\n   * if possible.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 79,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.isOptionalArg()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n   * @return Whether this expression denotes an optional {@code @param}.\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.isVarArgs()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n   * @return Whether this expression denotes a rest args {@code @param}.\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.evaluate(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n   * Evaluates the type expression into a {@code JSType} object.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 72)",
        "(line 101,col 5)-(line 101,col 25)",
        "(line 102,col 5)-(line 102,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.equals(java.lang.Object)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 108,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.hashCode()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.JSTypeExpression.getRoot()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n   * @return The source for this type expression.  Note that it will not\n   * contain an expression if there\u0027s an @override tag.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 16)"
      ]
    }
  ]
}