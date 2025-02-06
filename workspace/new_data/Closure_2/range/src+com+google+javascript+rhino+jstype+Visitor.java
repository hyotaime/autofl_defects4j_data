{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/Visitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Visitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 133,
      "comment": "\n * A type visitor.\u003cp\u003e\n *\n * This code will calculate a specific value of type {@code T} from a type\n * based on its structure:\n *\n * \u003cpre\u003eJSType type \u003d \u0026hellip;;\n * T value \u003d type.visit(new Visitor\u0026lt;T\u0026gt;() {\n * \u0026nbsp;\u0026nbsp;\u0026hellip;\n * });\u003c/pre\u003e\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseNoType()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n   * Bottom type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Enum element type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseAllType()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n   * All type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseBooleanType()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n   * Boolean value type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseNoObjectType()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Bottom Object type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * Function type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * Object type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseUnknownType()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n   * Unknown type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseNullType()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * Null type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseNumberType()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n   * Number value type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseStringType()",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n   * String value type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseVoidType()",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n   * Void type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n   * Union type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n   * Parameterized type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Visitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n   * Template type\u0027s case.\n   ",
      "child_ranges": []
    }
  ]
}