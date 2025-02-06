{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AbstractPeepholeOptimization.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPeepholeOptimization",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 168,
      "comment": "\n * An abstract class whose implementations run peephole optimizations:\n * optimizations that look at a small section of code and either remove\n * that code (if it is not needed) or replaces it with smaller code.\n *\n "
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
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * Given a node to optimize and a traversal, optimize the node. Subclasses\n   * should override to provide their own peephole optimization.\n   *\n   * @param subtree The subtree that will be optimized.\n   * @return The new version of the subtree (or null if the subtree or one of\n   * its parents was removed from the AST). If the subtree has not changed,\n   * this method must return {@code subtree}.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.report(com.google.javascript.jscomp.DiagnosticType, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n   * Helper method for reporting an error to the compiler when applying a\n   * peephole optimization.\n   *\n   * @param diagnostic The error type\n   * @param n The node for which the error should be reported\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 53,col 77)",
        "(line 54,col 5)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.reportCodeChange()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n   * Helper method for telling the compiler that something has changed.\n   * Subclasses must call these if they have changed the AST.\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 41)",
        "(line 63,col 5)-(line 63,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.areNodesEqualForInlining(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "\n   * Are the nodes equal for the purpose of inlining?\n   * If type aware optimizations are on, type equality is checked.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 41)",
        "(line 75,col 5)-(line 75,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.isASTNormalized()",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n   *  Is the current AST normalized? (e.g. has the Normalize pass been run\n   *  and has the Denormalize pass not yet been run?)\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 41)",
        "(line 85,col 5)-(line 85,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.beginTraversal(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n   * Informs the optimization that a traversal will begin.\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.endTraversal(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n   * Informs the optimization that a traversal has completed.\n   * @param compiler The current compiler.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.mayEffectMutableState(com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n   * @return Whether the node may create new mutable state, or change existing\n   * state.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n   * @return Whether the node may have side effects when executed.\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n   * Returns true if the current node\u0027s type implies side effects.\n   *\n   * This is a non-recursive version of the may have side effects\n   * check; used to check wherever the current node\u0027s type is one of\n   * the reason\u0027s why a subtree has side effects.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.isEcmaScript5OrGreater()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n   * @return Whether the source code version is ECMAScript 5 or later.\n   *     Workarounds for quirks in browsers that do not support ES5 can be\n   *     ignored when this is true.\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 139,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.getCodingConvention()",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n   * @return the current coding convention.\n   ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractPeepholeOptimization.validateResult(com.google.javascript.rhino.Node)",
      "begin_line": 153,
      "end_line": 167,
      "comment": "\n   * Check if the specified node is null or is still in the AST.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 165,col 5)",
        "(line 166,col 5)-(line 166,col 13)"
      ]
    }
  ]
}