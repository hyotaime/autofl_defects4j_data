{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/RecordTypeBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RecordTypeBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 116,
      "comment": "\n * A builder for record types.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "isEmpty"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDeclared"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordTypeBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.setSynthesized(boolean)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " See the comments on RecordType about synthetic types. ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.addProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 83,
      "comment": "\n   * Adds a property with the given name and type to the record type.\n   * @param name the name of the new property\n   * @param type the JSType of the new property\n   * @param propertyNode the node that holds this property definition\n   * @return The builder itself for chaining purposes, or null if there\u0027s\n   *          a duplicate.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 20)",
        "(line 78,col 5)-(line 80,col 5)",
        "(line 81,col 5)-(line 81,col 65)",
        "(line 82,col 5)-(line 82,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.build()",
      "begin_line": 89,
      "end_line": 97,
      "comment": "\n   * Creates a record.\n   * @return The record type.\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 93,col 5)",
        "(line 95,col 5)-(line 96,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RecordProperty",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 99,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyNode"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty.RecordProperty(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 104,col 23)",
        "(line 105,col 7)-(line 105,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty.getType()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 109,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty.getPropertyNode()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 26)"
      ]
    }
  ]
}