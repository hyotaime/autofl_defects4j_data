{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckDebuggerStatement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckDebuggerStatement",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 29,
      "end_line": 54,
      "comment": "\n * {@link CheckDebuggerStatement} checks for the presence of the \"debugger\"\n * statement in JavaScript code. It is appropriate to use this statement while\n * developing JavaScript; however, it is generally undesirable to include it in\n * production code.\n *\n * @author bolinfest@google.com (Michael Bolin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUGGER_STATEMENT_PRESENT"
      ],
      "begin_line": 32,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.CheckDebuggerStatement(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckDebuggerStatement.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 52,col 5)"
      ]
    }
  ]
}