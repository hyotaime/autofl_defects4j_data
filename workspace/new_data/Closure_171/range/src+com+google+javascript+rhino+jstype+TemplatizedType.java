{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/TemplatizedType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TemplatizedType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ProxyObjectType"
      ],
      "begin_line": 51,
      "end_line": 178,
      "comment": "\n * An object type with declared template types, such as\n * \u003ccode\u003eArray.\u003cstring\u003e\u003c/code\u003e.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateTypes"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacer"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.TemplatizedType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.ObjectType, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 57,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 61,col 24)",
        "(line 65,col 5)-(line 66,col 66)",
        "(line 67,col 5)-(line 67,col 68)",
        "(line 68,col 5)-(line 70,col 5)",
        "(line 71,col 5)-(line 71,col 41)",
        "(line 73,col 5)-(line 73,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.toStringHelper(boolean)",
      "begin_line": 76,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 61)",
        "(line 80,col 5)-(line 82,col 5)",
        "(line 84,col 5)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.visit(com.google.javascript.rhino.jstype.Visitor\u003cT\u003e)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.visit(com.google.javascript.rhino.jstype.RelationshipVisitor\u003cT\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.toMaybeTemplatizedType()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.getTemplateTypes()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.getPropertyType(java.lang.String)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 56)",
        "(line 109,col 5)-(line 109,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.isSubtype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.wrapsSameRawType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 120,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.wrapsRawType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.getGreatestSubtypeHelper(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 131,
      "end_line": 160,
      "comment": "\n   * Computes the greatest subtype of two related templatized types.\n   * @return The greatest subtype.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 40)",
        "(line 134,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 148,col 60)",
        "(line 149,col 5)-(line 149,col 37)",
        "(line 151,col 5)-(line 154,col 5)",
        "(line 159,col 5)-(line 159,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.getTemplateTypeMap()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.hasAnyTemplateTypesInternal()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.TemplatizedType.getReferencedType()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n   * @return The referenced ObjectType wrapped by this TemplatizedType.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 42)"
      ]
    }
  ]
}