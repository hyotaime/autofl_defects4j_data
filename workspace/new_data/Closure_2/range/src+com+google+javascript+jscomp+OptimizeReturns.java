{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/OptimizeReturns.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeReturns",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 38,
      "end_line": 163,
      "comment": "\n * A compiler pass for optimize function return results.  Currently this\n * pass looks for results that are complete unused and rewrite then to be:\n *   \"return x()\" --\u003e\"x(); return\"\n * , but it can easily be\n * expanded to look for use context to avoid unneeded type coercion:\n *   - \"return x.toString()\" --\u003e \"return x\"\n *   - \"return !!x\" --\u003e \"return x\"\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.OptimizeReturns(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 76)",
        "(line 51,col 5)-(line 51,col 37)",
        "(line 52,col 5)-(line 52,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 55,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 49)",
        "(line 60,col 5)-(line 64,col 5)",
        "(line 66,col 5)-(line 68,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.callResultsMaybeUsed(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.DefinitionSite)",
      "begin_line": 76,
      "end_line": 120,
      "comment": "\n   * Determines if a function result might be used.  A result might be use if:\n   * - Function must is exported.\n   * - The definition is never accessed outside a function call context.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 54)",
        "(line 82,col 5)-(line 82,col 41)",
        "(line 83,col 5)-(line 85,col 5)",
        "(line 89,col 5)-(line 91,col 5)",
        "(line 93,col 5)-(line 95,col 5)",
        "(line 97,col 5)-(line 97,col 69)",
        "(line 98,col 5)-(line 116,col 5)",
        "(line 119,col 5)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.rewriteReturns(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 153,
      "comment": "\n   * For the supplied function node, rewrite all the return expressions so that:\n   *    return foo();\n   * becomes:\n   *    foo(); return;\n   * Useless return will be removed later by the peephole optimization passes.\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 50)",
        "(line 132,col 5)-(line 152,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.Anonymous-7b8b81d2-e1ec-4e83-bb54-955025c424b5.visit(com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 137,col 11)-(line 149,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.isCall(com.google.javascript.jscomp.UseSite)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n   * Determines if the name node acts as the function name in a call expression.\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 26)",
        "(line 160,col 5)-(line 160,col 35)",
        "(line 161,col 5)-(line 161,col 63)"
      ]
    }
  ]
}