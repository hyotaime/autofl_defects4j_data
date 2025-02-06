{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FindExportableNodes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FindExportableNodes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 44,
      "end_line": 136,
      "comment": "\n * Records all of the symbols and properties that should be exported.\n *\n * Currently applies to:\n * - function foo() {}\n * - var foo \u003d function() {}\n * - foo.bar \u003d function() {}\n * - var FOO \u003d ...;\n * - foo.BAR \u003d ...;\n *\n * FOO \u003d BAR \u003d 5;\n * and\n * var FOO \u003d BAR \u003d 5;\n * are not supported because the annotation is ambiguous to whether it applies\n * to all the variables or only the first one.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_GLOBAL_ERROR"
      ],
      "begin_line": 46,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exports"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n   * It\u0027s convenient to be able to iterate over exports in the order in which\n   * they are encountered.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.FindExportableNodes(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 29)",
        "(line 61,col 5)-(line 61,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 41)",
        "(line 67,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.getExports()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GenerateNodeContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 113,
      "end_line": 135,
      "comment": "\n   * Context holding the node references required for generating the export\n   * calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "scriptNode"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contextNode"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext.GenerateNodeContext(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 119,col 7)-(line 119,col 23)",
        "(line 120,col 7)-(line 120,col 35)",
        "(line 121,col 7)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext.getNode()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext.getScriptNode()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FindExportableNodes.GenerateNodeContext.getContextNode()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 133,col 25)"
      ]
    }
  ]
}