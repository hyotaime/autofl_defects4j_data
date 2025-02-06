{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/CanCastToVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CanCastToVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.RelationshipVisitor\u003cjava.lang.Boolean\u003e"
      ],
      "begin_line": 45,
      "end_line": 182,
      "comment": "\n * A \"can cast to\" relationship visitor.\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseUnknownType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseNoType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseNoObjectType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseAllType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.canCastToUnion(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 67,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 72,col 5)",
        "(line 73,col 5)-(line 73,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.canCastToFunction(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 76,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 83,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.isInterface(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 86,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 45)",
        "(line 88,col 5)-(line 91,col 5)",
        "(line 92,col 5)-(line 92,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.castCastToHelper(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 95,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 117,col 5)",
        "(line 119,col 5)-(line 119,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseValueType(com.google.javascript.rhino.jstype.ValueType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 137,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 28)",
        "(line 140,col 5)-(line 151,col 5)",
        "(line 155,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 161,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 164,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.CanCastToVisitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 61)"
      ]
    }
  ]
}