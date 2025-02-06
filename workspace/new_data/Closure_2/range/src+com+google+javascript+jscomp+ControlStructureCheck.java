{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ControlStructureCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ControlStructureCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 27,
      "end_line": 76,
      "comment": "\n * Check for usage of \u0027with\u0027.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "USE_OF_WITH"
      ],
      "begin_line": 31,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ControlStructureCheck.ControlStructureCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheck.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheck.check(com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 71,
      "comment": "\n   * Reports errors for any invalid use of control structures.\n   *\n   * @param node Current node to check.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 64,col 5)",
        "(line 66,col 5)-(line 70,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ControlStructureCheck.report(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 67)"
      ]
    }
  ]
}