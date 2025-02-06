{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/Property.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 51,
      "end_line": 141,
      "comment": "\n * A property slot of an object.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n   * Property\u0027s name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n   * Property\u0027s type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inferred"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n   * Whether the property\u0027s type is inferred.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "propertyNode"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n   * The node corresponding to this property, e.g., a GETPROP node that\n   * declares this property.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "docInfo"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "  The JSDocInfo for this property. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.Property.Property(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 21)",
        "(line 82,col 5)-(line 82,col 21)",
        "(line 83,col 5)-(line 83,col 29)",
        "(line 84,col 5)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getName()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getNode()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getSourceFile()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getSymbol()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getDeclaration()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getType()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.isTypeInferred()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.isFromExterns()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.setType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.getJSDocInfo()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.setJSDocInfo(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.Property.setNode(com.google.javascript.rhino.Node)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 26)"
      ]
    }
  ]
}