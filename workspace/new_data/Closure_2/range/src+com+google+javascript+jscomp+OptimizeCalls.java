{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/OptimizeCalls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeCalls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 61,
      "comment": "\n * A root pass that container for other passes that should run on\n * with a single call graph (currently a SimpleDefinitionFinder).\n * Expected passes include:\n *   - optimize parameters\n *   - optimize returns\n *   - devirtualize prototype methods\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "passes"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeCalls.OptimizeCalls(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeCalls.addPass(com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 21)",
        "(line 44,col 5)-(line 44,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallGraphCompilerPass",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeCalls.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 59,col 5)"
      ]
    }
  ]
}