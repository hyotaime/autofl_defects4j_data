{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckDebuggerStatement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckDebuggerStatement",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 55,
      "comment": "\n * {@link CheckDebuggerStatement} checks for the presence of the \"debugger\"\n * statement in JavaScript code. It is appropriate to use this statement while\n * developing JavaScript; however, it is generally undesirable to include it in\n * production code.\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUGGER_STATEMENT_PRESENT"
      ],
      "begin_line": 33,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.CheckDebuggerStatement(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 49,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 53,col 5)"
      ]
    }
  ]
}