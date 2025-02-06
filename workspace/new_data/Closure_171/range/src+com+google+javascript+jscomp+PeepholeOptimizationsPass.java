{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeOptimizationsPass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeOptimizationsPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 115,
      "comment": "\n * A compiler pass to run various peephole optimizations (e.g. constant folding,\n * some useless code removal, some minimizations).\n *\n * @author dcc@google.com (Devin Coughlin)\n * @author acleung@google.com (Alan Leung)(\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "peepholeOptimizations"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Use an array here for faster iteration compared to ImmutableSet"
    },
    {
      "type": "field",
      "varNames": [
        "retraverseOnChange"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepholeOptimizationsPass(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.AbstractPeepholeOptimization...)",
      "begin_line": 43,
      "end_line": 49,
      "comment": "\n   * Creates a peephole optimization pass that runs the given\n   * optimizations.\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 29)",
        "(line 46,col 5)-(line 46,col 47)",
        "(line 47,col 5)-(line 47,col 35)",
        "(line 48,col 5)-(line 48,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.setRetraverseOnChange(boolean)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.getCompiler()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 59,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 39)",
        "(line 62,col 5)-(line 62,col 21)",
        "(line 63,col 5)-(line 74,col 9)",
        "(line 75,col 5)-(line 75,col 19)",
        "(line 76,col 5)-(line 76,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.Anonymous-8a0981da-2667-4d8d-8a9c-a46e9e348174.visit(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 11)-(line 68,col 11)",
        "(line 69,col 11)-(line 72,col 67)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PeepCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 79,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 80,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 82,col 7)-(line 82,col 36)",
        "(line 83,col 7)-(line 83,col 34)",
        "(line 84,col 7)-(line 96,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.beginTraversal()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n   * Make sure that all the optimizations have the current traversal so they\n   * can report errors.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeOptimizationsPass.endTraversal()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 113,col 5)"
      ]
    }
  ]
}