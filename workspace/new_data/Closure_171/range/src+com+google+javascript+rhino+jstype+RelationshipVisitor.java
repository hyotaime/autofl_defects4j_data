{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/RelationshipVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RelationshipVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 109,
      "comment": "\n * A type relationship visitor.\u003cp\u003e\n *\n * This code will calculate a specific value of type {@code T} from\n * two types based on its structure.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseUnknownType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n   * Unknown type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseNoType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n   * Bottom type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseNoObjectType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Bottom Object type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseAllType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n   * All type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseValueType(com.google.javascript.rhino.jstype.ValueType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n   * Value type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n   * Object type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n   * Function type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * Union type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n   * Templatized type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * Template type\u0027s case.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RelationshipVisitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n   * Enum element type\u0027s case.\n   ",
      "child_ranges": []
    }
  ]
}