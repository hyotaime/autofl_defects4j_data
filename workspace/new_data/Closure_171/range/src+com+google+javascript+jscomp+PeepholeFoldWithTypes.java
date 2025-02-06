{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PeepholeFoldWithTypes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeFoldWithTypes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 42,
      "end_line": 118,
      "comment": "\n * Performs type-aware peephole optimizations.\n *\n * These peephole optimizations are in their own class because\n * type information may not always be available (such as during pre-processing)\n * or may not be turned on.\n *\n * Currently only Token.TYPEOF is folded -- in the future it may be possible to\n * fold Token.INSTANCEOF as well. Another possibility is folding when\n * non-nullable objects are used in Boolean logic, such as:\n * \"if (x) {\" or \"(!x) ? a : b\" or \"x \u0026\u0026 foo()\"\n *\n * TODO(dcc): Support folding Token.INSTANCEOF and non-nullable objects\n * in Boolean logic.\n *\n * @author dcc@google.com (Devin Coughlin)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldWithTypes.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 51,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldWithTypes.tryFoldTypeof(com.google.javascript.rhino.Node)",
      "begin_line": 74,
      "end_line": 117,
      "comment": "\n   * Folds \"typeof expression\" based on the JSType of \"expression\" if the\n   * expression has no side effects.\n   *\n   * \u003cp\u003eE.g.,\n   * \u003cpre\u003e\n   * var x \u003d 6;\n   * if (typeof(x) \u003d\u003d \"number\") {\n   * }\n   * \u003c/pre\u003e\n   * folds to\n   * \u003cpre\u003e\n   * var x \u003d 6;\n   * if (\"number\" \u003d\u003d \"number\") {\n   * }\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eThis method doesn\u0027t fold literal values -- we leave that to\n   * PeepholeFoldConstants.\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 55)",
        "(line 76,col 5)-(line 76,col 68)",
        "(line 78,col 5)-(line 78,col 51)",
        "(line 82,col 5)-(line 115,col 5)",
        "(line 116,col 5)-(line 116,col 22)"
      ]
    }
  ]
}