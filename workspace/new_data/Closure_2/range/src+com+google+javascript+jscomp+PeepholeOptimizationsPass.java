{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PeepholeOptimizationsPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeOptimizationsPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 32,
      "end_line": 220,
      "comment": "\n * A compiler pass to run various peephole optimizations (e.g. constant folding,\n * some useless code removal, some minimizations).\n *\n * @author dcc@google.com (Devin Coughlin)\n * @author acleung@google.com (Alan Leung)(\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "peepholeOptimizations"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Use an array here for faster iteration compared to ImmutableSet"
    },
    {
      "type": "field",
      "varNames": [
        "traversalState"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " immediately."
    },
    {
      "type": "field",
      "varNames": [
        "retraverseOnChange"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ScopeState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "changed"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "traverseChildScopes"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState.ScopeState()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 7)-(line 49,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState.reset()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 53,col 22)",
        "(line 54,col 7)-(line 54,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StateStack",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentDepth"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack.StateStack()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 7)-(line 63,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack.peek()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 7)-(line 67,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack.push()",
      "begin_line": 70,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 71,col 7)-(line 71,col 21)",
        "(line 72,col 7)-(line 76,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack.pop()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 7)-(line 80,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PeepholeChangeHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeChangeHandler"
      ],
      "begin_line": 84,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepholeChangeHandler.reportChange()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepholeOptimizationsPass(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.AbstractPeepholeOptimization...)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n   * Creates a peephole optimization pass that runs the given\n   * optimizations.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 29)",
        "(line 98,col 5)-(line 98,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.setRetraverseOnChange(boolean)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 41)",
        "(line 103,col 5)-(line 103,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.getCompiler()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 64)",
        "(line 113,col 5)-(line 113,col 39)",
        "(line 114,col 5)-(line 114,col 21)",
        "(line 115,col 5)-(line 115,col 19)",
        "(line 116,col 5)-(line 116,col 19)",
        "(line 117,col 5)-(line 117,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.traverse(com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 129,col 19)",
        "(line 130,col 5)-(line 142,col 37)",
        "(line 144,col 5)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldRetraverse(com.google.javascript.rhino.Node)",
      "begin_line": 147,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 161,col 5)",
        "(line 162,col 5)-(line 162,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.shouldVisit(com.google.javascript.rhino.Node)",
      "begin_line": 165,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 172,col 5)",
        "(line 173,col 5)-(line 173,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.exitNode(com.google.javascript.rhino.Node)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 179,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.visit(com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 34)",
        "(line 184,col 5)-(line 184,col 37)",
        "(line 186,col 5)-(line 202,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal()",
      "begin_line": 209,
      "end_line": 213,
      "comment": "\n   * Make sure that all the optimizations have the current traversal so they\n   * can report errors.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal()",
      "begin_line": 215,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 216,col 5)-(line 218,col 5)"
      ]
    }
  ]
}