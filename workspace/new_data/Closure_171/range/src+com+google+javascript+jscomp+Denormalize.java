{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/Denormalize.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Denormalize",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 38,
      "end_line": 151,
      "comment": "\n * The goal with this pass is to reverse the simplifications done in the\n * normalization pass that are not handled by other passes (such as\n * CollapseVariableDeclarations) to avoid making the resulting code larger.\n *\n * Currently this pass only does one thing pushing statements into for-loop\n * initializer. This:\n *   var a \u003d 0; for(;a\u003c0;a++) {}\n * becomes:\n *   for(var a \u003d 0;a\u003c0;a++) {}\n *\n * @author johnlenz@google.com (johnlenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Denormalize.Denormalize(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.maybeCollapseIntoForStatements(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 127,
      "comment": "\n   * Collapse VARs and EXPR_RESULT node into FOR loop initializers where\n   * possible.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 70,col 5)",
        "(line 73,col 5)-(line 75,col 5)",
        "(line 78,col 5)-(line 78,col 35)",
        "(line 79,col 5)-(line 126,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StripConstantAnnotations",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 129,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.StripConstantAnnotations(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 7)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 140,col 7)-(line 140,col 54)",
        "(line 141,col 7)-(line 141,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Denormalize.StripConstantAnnotations.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 7)-(line 148,col 7)"
      ]
    }
  ]
}