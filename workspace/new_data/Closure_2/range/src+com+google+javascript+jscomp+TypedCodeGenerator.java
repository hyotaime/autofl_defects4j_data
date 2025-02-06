{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypedCodeGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypedCodeGenerator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeGenerator"
      ],
      "begin_line": 33,
      "end_line": 215,
      "comment": "\n * A code generator that outputs type annotations for functions and\n * constructors.\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.TypedCodeGenerator(com.google.javascript.jscomp.CodeConsumer, com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.add(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodeGenerator.Context)",
      "begin_line": 38,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 32)",
        "(line 41,col 5)-(line 54,col 5)",
        "(line 56,col 5)-(line 56,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getTypeAnnotation(com.google.javascript.rhino.Node)",
      "begin_line": 59,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 54)",
        "(line 62,col 5)-(line 64,col 5)",
        "(line 66,col 5)-(line 66,col 35)",
        "(line 67,col 5)-(line 82,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getFunctionAnnotation(com.google.javascript.rhino.Node)",
      "begin_line": 88,
      "end_line": 180,
      "comment": "\n   * @param fnNode A node for a function for which to generate a type annotation\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 50)",
        "(line 90,col 5)-(line 90,col 50)",
        "(line 92,col 5)-(line 92,col 37)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 98,col 5)-(line 98,col 54)",
        "(line 107,col 5)-(line 123,col 5)",
        "(line 126,col 5)-(line 126,col 45)",
        "(line 127,col 5)-(line 131,col 5)",
        "(line 134,col 5)-(line 172,col 5)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 178,col 5)-(line 178,col 23)",
        "(line 179,col 5)-(line 179,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.appendAnnotation(java.lang.StringBuilder, java.lang.String, java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypedCodeGenerator.getParameterNodeJSDocType(com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 214,
      "comment": "\n   * Creates a JSDoc-suitable String representation the type of a parameter.\n   *\n   * @param parameterNode The parameter node.\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 53)",
        "(line 193,col 5)-(line 193,col 22)",
        "(line 197,col 5)-(line 211,col 5)",
        "(line 213,col 5)-(line 213,col 22)"
      ]
    }
  ]
}