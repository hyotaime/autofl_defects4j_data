{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TypedCodeGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedCodeGenerator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeGenerator"
      ],
      "begin_line": 36,
      "end_line": 237,
      "comment": "\n * A code generator that outputs type annotations for functions and\n * constructors.\n "
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.TypedCodeGenerator(com.google.javascript.jscomp.CodeConsumer, com.google.javascript.jscomp.CompilerOptions, com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 38,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 29)",
        "(line 41,col 5)-(line 41,col 41)",
        "(line 42,col 5)-(line 42,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 45,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 32)",
        "(line 48,col 5)-(line 61,col 5)",
        "(line 63,col 5)-(line 63,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getTypeAnnotation(com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 54)",
        "(line 69,col 5)-(line 71,col 5)",
        "(line 73,col 5)-(line 73,col 35)",
        "(line 74,col 5)-(line 89,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getFunctionAnnotation(com.google.javascript.rhino.Node)",
      "begin_line": 95,
      "end_line": 202,
      "comment": "\n   * @param fnNode A node for a function for which to generate a type annotation\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 50)",
        "(line 97,col 5)-(line 97,col 37)",
        "(line 99,col 5)-(line 101,col 5)",
        "(line 103,col 5)-(line 103,col 54)",
        "(line 105,col 5)-(line 108,col 5)",
        "(line 110,col 5)-(line 110,col 50)",
        "(line 120,col 5)-(line 136,col 5)",
        "(line 139,col 5)-(line 139,col 45)",
        "(line 140,col 5)-(line 146,col 5)",
        "(line 149,col 5)-(line 187,col 5)",
        "(line 189,col 5)-(line 194,col 5)",
        "(line 196,col 5)-(line 198,col 5)",
        "(line 200,col 5)-(line 200,col 23)",
        "(line 201,col 5)-(line 201,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.appendAnnotation(java.lang.StringBuilder, java.lang.String, java.lang.String)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getParameterNodeJSDocType(com.google.javascript.rhino.Node)",
      "begin_line": 213,
      "end_line": 228,
      "comment": "\n   * Creates a JSDoc-suitable String representation the type of a parameter.\n   *\n   * @param parameterNode The parameter node.\n   ",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 53)",
        "(line 215,col 5)-(line 215,col 22)",
        "(line 217,col 5)-(line 225,col 5)",
        "(line 227,col 5)-(line 227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.restrictByUndefined(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 230,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 234,col 5)",
        "(line 235,col 5)-(line 235,col 16)"
      ]
    }
  ]
}