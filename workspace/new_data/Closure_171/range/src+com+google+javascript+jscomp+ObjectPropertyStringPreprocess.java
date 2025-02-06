{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ObjectPropertyStringPreprocess.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectPropertyStringPreprocess",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 38,
      "end_line": 147,
      "comment": "\n * Rewrites \u003ccode\u003enew goog.testing.ObjectPropertyString(foo, \u0027bar\u0027)\u003c/code\u003e to\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, foo.bar)\u003c/code\u003e.\n *\n * These two passes are for use with goog.testing.PropertyReplacer.\n *\n * \u003ccode\u003e\n * var ops \u003d new goog.testing.ObjectPropertyString(foo.prototype, \u0027bar\u0027);\n * propertyReplacer.set(ops,object, ops.propertyString, baz);\n * \u003c/code\u003e\n *\n * @see ObjectPropertyStringPostprocess\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_PROPERTY_STRING"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERN_OBJECT_PROPERTY_STRING"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_NUM_ARGUMENTS_ERROR"
      ],
      "begin_line": 45,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QUALIFIED_NAME_EXPECTED_ERROR"
      ],
      "begin_line": 50,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_LITERAL_EXPECTED_ERROR"
      ],
      "begin_line": 55,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.ObjectPropertyStringPreprocess(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 70,col 53)",
        "(line 71,col 5)-(line 71,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.addExternDeclaration(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 74,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 41)",
        "(line 76,col 5)-(line 79,col 5)",
        "(line 80,col 5)-(line 80,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 83,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPreprocess.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 84,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 92,col 7)",
        "(line 97,col 7)-(line 99,col 7)",
        "(line 101,col 7)-(line 101,col 42)",
        "(line 103,col 7)-(line 106,col 7)",
        "(line 108,col 7)-(line 112,col 7)",
        "(line 114,col 7)-(line 114,col 48)",
        "(line 115,col 7)-(line 120,col 7)",
        "(line 122,col 7)-(line 122,col 52)",
        "(line 123,col 7)-(line 128,col 7)",
        "(line 130,col 7)-(line 133,col 41)",
        "(line 135,col 7)-(line 139,col 42)",
        "(line 141,col 7)-(line 141,col 54)",
        "(line 142,col 7)-(line 142,col 56)",
        "(line 144,col 7)-(line 144,col 34)"
      ]
    }
  ]
}