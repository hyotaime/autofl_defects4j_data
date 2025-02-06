{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/InstanceObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstanceObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 51,
      "end_line": 194,
      "comment": "\n * An object type that is an instance of some function constructor.\n "
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
        "constructor"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.FunctionType, boolean, com.google.common.collect.ImmutableList\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 64,col 26)",
        "(line 65,col 5)-(line 65,col 44)",
        "(line 66,col 5)-(line 66,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getReferenceName()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.hasReferenceName()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getImplicitPrototype()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getConstructor()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 46)",
        "(line 93,col 5)-(line 95,col 5)",
        "(line 96,col 5)-(line 96,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.toStringHelper(boolean)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 112,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isTheObjectType()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 118,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isInstanceType()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isArrayType()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 129,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isStringObjectType()",
      "begin_line": 132,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isBooleanObjectType()",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 141,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isNumberObjectType()",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 147,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isDateType()",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isRegexpType()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isNominalType()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.hashCode()",
      "begin_line": 171,
      "end_line": 178,
      "comment": "\n   * If this is equal to a NamedType object, its hashCode must be equal\n   * to the hashCode of the NamedType object.\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 177,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getCtorImplementedInterfaces()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getCtorExtendedInterfaces()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 52)"
      ]
    }
  ]
}