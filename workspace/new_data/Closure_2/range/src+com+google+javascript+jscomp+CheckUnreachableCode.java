{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckUnreachableCode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckUnreachableCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 33,
      "end_line": 113,
      "comment": "\n * Use {@link ControlFlowGraph} and {@link GraphReachability} to inform user\n * about unreachable code.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNREACHABLE_CODE"
      ],
      "begin_line": 35,
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
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.CheckUnreachableCode(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 29)",
        "(line 43,col 5)-(line 43,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 71)",
        "(line 54,col 5)-(line 72,col 5)",
        "(line 73,col 5)-(line 73,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.initScope(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ReachablePredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.jscomp.graph.GraphReachability.EdgeTuple\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e\u003e"
      ],
      "begin_line": 90,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckUnreachableCode.ReachablePredicate.apply(com.google.javascript.jscomp.graph.GraphReachability.EdgeTuple\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch\u003e)",
      "begin_line": 93,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 33)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 99,col 7)-(line 99,col 42)",
        "(line 100,col 7)-(line 100,col 68)",
        "(line 104,col 7)-(line 109,col 7)",
        "(line 110,col 7)-(line 110,col 18)"
      ]
    }
  ]
}