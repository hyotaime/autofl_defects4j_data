{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ObjectPropertyStringPreprocess.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectPropertyStringPreprocess",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 40,
      "end_line": 149,
      "comment": "\n * Rewrites \u003ccode\u003enew goog.testing.ObjectPropertyString(foo, \u0027bar\u0027)\u003c/code\u003e to\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, foo.bar)\u003c/code\u003e.\n *\n * These two passes are for use with goog.testing.PropertyReplacer.\n *\n * \u003ccode\u003e\n * var ops \u003d new goog.testing.ObjectPropertyString(foo.prototype, \u0027bar\u0027);\n * propertyReplacer.set(ops,object, ops.propertyString, baz);\n * \u003c/code\u003e\n *\n * @see ObjectPropertyStringPostprocess\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_PROPERTY_STRING"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERN_OBJECT_PROPERTY_STRING"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_NUM_ARGUMENTS_ERROR"
      ],
      "begin_line": 47,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUALIFIED_NAME_EXPECTED_ERROR"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_LITERAL_EXPECTED_ERROR"
      ],
      "begin_line": 57,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.ObjectPropertyStringPreprocess(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 72,col 53)",
        "(line 73,col 5)-(line 73,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.addExternDeclaration(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 41)",
        "(line 78,col 5)-(line 81,col 5)",
        "(line 82,col 5)-(line 82,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 85,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 88,col 7)-(line 94,col 7)",
        "(line 99,col 7)-(line 101,col 7)",
        "(line 103,col 7)-(line 103,col 42)",
        "(line 105,col 7)-(line 108,col 7)",
        "(line 110,col 7)-(line 114,col 7)",
        "(line 116,col 7)-(line 116,col 48)",
        "(line 117,col 7)-(line 122,col 7)",
        "(line 124,col 7)-(line 124,col 52)",
        "(line 125,col 7)-(line 130,col 7)",
        "(line 132,col 7)-(line 135,col 41)",
        "(line 137,col 7)-(line 141,col 42)",
        "(line 143,col 7)-(line 143,col 54)",
        "(line 144,col 7)-(line 144,col 56)",
        "(line 146,col 7)-(line 146,col 34)"
      ]
    }
  ]
}