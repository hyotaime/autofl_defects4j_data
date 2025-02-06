{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ObjectPropertyStringPostprocess.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ObjectPropertyStringPostprocess",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 40,
      "end_line": 95,
      "comment": "\n * Rewrites\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, foo.prototype.bar)\u003c/code\u003e\n * to \u003ccode\u003enew JSCompiler_ObjectPropertyString(foo.prototype, \u0027bar\u0027)\u003c/code\u003e\n *\n * Rewrites\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, foo[bar])\u003c/code\u003e\n * to \u003ccode\u003enew JSCompiler_ObjectPropertyString(foo, bar)\u003c/code\u003e\n\n * Rewrites\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, foo$bar$baz)\u003c/code\u003e to\n * \u003ccode\u003enew JSCompiler_ObjectPropertyString(window, \u0027foo$bar$baz\u0027)\u003c/code\u003e\n *\n * @see ObjectPropertyStringPreprocess\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPostprocess.ObjectPropertyStringPostprocess(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPostprocess.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 52,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ObjectPropertyStringPostprocess.Callback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 53,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 55,col 7)-(line 57,col 7)",
        "(line 59,col 7)-(line 59,col 42)",
        "(line 61,col 7)-(line 64,col 7)",
        "(line 66,col 7)-(line 66,col 48)",
        "(line 67,col 7)-(line 67,col 52)",
        "(line 68,col 7)-(line 68,col 56)",
        "(line 69,col 7)-(line 91,col 7)",
        "(line 92,col 7)-(line 92,col 34)"
      ]
    }
  ]
}