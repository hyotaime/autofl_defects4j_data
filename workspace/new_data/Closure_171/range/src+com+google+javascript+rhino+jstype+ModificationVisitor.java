{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/ModificationVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ModificationVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.Visitor\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 54,
      "end_line": 234,
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
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseTemplatizedType(com.google.javascript.rhino.jstype.TemplatizedType)",
      "begin_line": 150,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 28)",
        "(line 153,col 5)-(line 153,col 57)",
        "(line 154,col 5)-(line 154,col 75)",
        "(line 155,col 5)-(line 157,col 5)",
        "(line 159,col 5)-(line 159,col 68)",
        "(line 160,col 5)-(line 166,col 5)",
        "(line 168,col 5)-(line 170,col 5)",
        "(line 171,col 5)-(line 171,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseUnknownType()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNullType()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseNumberType()",
      "begin_line": 184,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseStringType()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseVoidType()",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseUnionType(com.google.javascript.rhino.jstype.UnionType)",
      "begin_line": 199,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 28)",
        "(line 202,col 5)-(line 202,col 48)",
        "(line 203,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 217,col 5)",
        "(line 219,col 5)-(line 219,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.ModificationVisitor.isNativeFunctionType(com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 37)"
      ]
    }
  ]
}