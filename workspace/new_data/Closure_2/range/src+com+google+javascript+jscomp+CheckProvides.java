{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckProvides.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckProvides",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 32,
      "end_line": 133,
      "comment": "\n * Insures \u0027@constructor X\u0027 has a \u0027goog.provide(\"X\")\u0027 .\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "checkLevel"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_PROVIDE_WARNING"
      ],
      "begin_line": 37,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvides(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 29)",
        "(line 43,col 5)-(line 43,col 33)",
        "(line 44,col 5)-(line 44,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 55,col 52)",
        "(line 56,col 5)-(line 56,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CheckProvidesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 59,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "provides"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ctors"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.CheckProvidesCallback(com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 70,col 7)-(line 83,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visitFunctionNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 23)",
        "(line 88,col 7)-(line 88,col 45)",
        "(line 89,col 7)-(line 97,col 7)",
        "(line 98,col 7)-(line 106,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckProvides.CheckProvidesCallback.visitScriptNode(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 110,col 7)-(line 128,col 7)",
        "(line 129,col 7)-(line 129,col 23)",
        "(line 130,col 7)-(line 130,col 20)"
      ]
    }
  ]
}