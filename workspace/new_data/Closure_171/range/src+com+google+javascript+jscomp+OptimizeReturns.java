{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/OptimizeReturns.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeReturns",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 39,
      "end_line": 164,
      "comment": "\n * A compiler pass for optimize function return results.  Currently this\n * pass looks for results that are complete unused and rewrite then to be:\n *   \"return x()\" --\u003e\"x(); return\"\n * , but it can easily be\n * expanded to look for use context to avoid unneeded type coercion:\n *   - \"return x.toString()\" --\u003e \"return x\"\n *   - \"return !!x\" --\u003e \"return x\"\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.OptimizeReturns(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 76)",
        "(line 52,col 5)-(line 52,col 37)",
        "(line 53,col 5)-(line 53,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 56,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 49)",
        "(line 61,col 5)-(line 65,col 5)",
        "(line 67,col 5)-(line 69,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.callResultsMaybeUsed(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.DefinitionSite)",
      "begin_line": 77,
      "end_line": 121,
      "comment": "\n   * Determines if a function result might be used.  A result might be use if:\n   * - Function must is exported.\n   * - The definition is never accessed outside a function call context.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 54)",
        "(line 83,col 5)-(line 83,col 41)",
        "(line 84,col 5)-(line 86,col 5)",
        "(line 90,col 5)-(line 92,col 5)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 98,col 5)-(line 98,col 69)",
        "(line 99,col 5)-(line 117,col 5)",
        "(line 120,col 5)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.rewriteReturns(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 154,
      "comment": "\n   * For the supplied function node, rewrite all the return expressions so that:\n   *    return foo();\n   * becomes:\n   *    foo(); return;\n   * Useless return will be removed later by the peephole optimization passes.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 50)",
        "(line 133,col 5)-(line 153,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.Anonymous-6063ae24-3059-4df1-94da-172e8615b273.visit(com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 138,col 11)-(line 150,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeReturns.isCall(com.google.javascript.jscomp.UseSite)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\n   * Determines if the name node acts as the function name in a call expression.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 26)",
        "(line 161,col 5)-(line 161,col 35)",
        "(line 162,col 5)-(line 162,col 63)"
      ]
    }
  ]
}