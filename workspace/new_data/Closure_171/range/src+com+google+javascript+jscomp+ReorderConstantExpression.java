{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ReorderConstantExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ReorderConstantExpression",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 28,
      "end_line": 58,
      "comment": "\n * Reorder constant expression hoping for a better compression.\n * ex. x \u003d\u003d\u003d 0 -\u003e 0 \u003d\u003d\u003d x\n * After reordering, expressions like 0 \u003d\u003d\u003d x and 0 \u003d\u003d\u003d y may have higher\n * compression together than their original counterparts.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ReorderConstantExpression.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 32,
      "end_line": 57,
      "comment": " to follow our naming convention.",
      "child_ranges": [
        "(line 35,col 5)-(line 55,col 5)",
        "(line 56,col 5)-(line 56,col 19)"
      ]
    }
  ]
}