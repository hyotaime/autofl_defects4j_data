{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckProvides.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckProvides",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 31,
      "end_line": 133,
      "comment": "\n * Insures \u0027@constructor X\u0027 has a \u0027goog.provide(\"X\")\u0027 .\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkLevel"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_PROVIDE_WARNING"
      ],
      "begin_line": 36,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvides(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 29)",
        "(line 42,col 5)-(line 42,col 33)",
        "(line 43,col 5)-(line 43,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 54,col 52)",
        "(line 55,col 5)-(line 55,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CheckProvidesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 58,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ctors"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.CheckProvidesCallback(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 7)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 82,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visitFunctionNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 86,col 23)",
        "(line 87,col 7)-(line 87,col 45)",
        "(line 88,col 7)-(line 96,col 7)",
        "(line 97,col 7)-(line 105,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visitScriptNode()",
      "begin_line": 108,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 128,col 7)",
        "(line 129,col 7)-(line 129,col 23)",
        "(line 130,col 7)-(line 130,col 20)"
      ]
    }
  ]
}