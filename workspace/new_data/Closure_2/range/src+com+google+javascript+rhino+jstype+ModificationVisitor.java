{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/jstype/ModificationVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ModificationVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.Visitor\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 54,
      "end_line": 230,
      "comment": "\n * A visitor implementation that enables type substitutions.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.ModificationVisitor(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseEnumElementType(com.google.javascript.rhino.jstype.EnumElementType)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseAllType()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseBooleanType()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNoObjectType()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 87,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 91,col 5)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 98,col 5)-(line 98,col 28)",
        "(line 100,col 5)-(line 100,col 45)",
        "(line 101,col 5)-(line 101,col 64)",
        "(line 102,col 5)-(line 104,col 5)",
        "(line 106,col 5)-(line 106,col 47)",
        "(line 107,col 5)-(line 107,col 50)",
        "(line 108,col 5)-(line 110,col 5)",
        "(line 112,col 5)-(line 112,col 75)",
        "(line 113,col 5)-(line 126,col 5)",
        "(line 128,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.coerseToThisType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseObjectType(com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 145,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 155,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseParameterizedType(com.google.javascript.rhino.jstype.ParameterizedType)",
      "begin_line": 158,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 161,col 54)",
        "(line 162,col 5)-(line 162,col 59)",
        "(line 163,col 5)-(line 166,col 5)",
        "(line 167,col 5)-(line 167,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType()",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNullType()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNumberType()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseStringType()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseVoidType()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 195,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 28)",
        "(line 198,col 5)-(line 198,col 48)",
        "(line 199,col 5)-(line 205,col 5)",
        "(line 207,col 5)-(line 213,col 5)",
        "(line 215,col 5)-(line 215,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.isNativeFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 37)"
      ]
    }
  ]
}