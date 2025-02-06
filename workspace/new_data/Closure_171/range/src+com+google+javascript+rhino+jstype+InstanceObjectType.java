{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/InstanceObjectType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InstanceObjectType",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.PrototypeObjectType"
      ],
      "begin_line": 49,
      "end_line": 183,
      "comment": "\n * An object type that is an instance of some function constructor.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructor"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.InstanceObjectType(com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.rhino.jstype.FunctionType, boolean)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 80)",
        "(line 61,col 5)-(line 61,col 44)",
        "(line 62,col 5)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getReferenceName()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.hasReferenceName()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getImplicitPrototype()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getConstructor()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.defineProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType, boolean, com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 46)",
        "(line 89,col 5)-(line 91,col 5)",
        "(line 92,col 5)-(line 92,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.toStringHelper(boolean)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 101,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isTheObjectType()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 107,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isInstanceType()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isArrayType()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 118,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isStringObjectType()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 124,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isBooleanObjectType()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 130,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isNumberObjectType()",
      "begin_line": 133,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isDateType()",
      "begin_line": 139,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isRegexpType()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 148,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.isNominalType()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.hashCode()",
      "begin_line": 160,
      "end_line": 167,
      "comment": "\n   * If this is equal to a NamedType object, its hashCode must be equal\n   * to the hashCode of the NamedType object.\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 166,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getCtorImplementedInterfaces()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.InstanceObjectType.getCtorExtendedInterfaces()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 52)"
      ]
    }
  ]
}