{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/StatementFusion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatementFusion",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 34,
      "end_line": 155,
      "comment": "\n * Tries to fuse all the statements in a block into a one statement by using\n * COMMAs.\n *\n * Because COMMAs has the lowest precedence, we never need to insert\n * extra () around. Once we have only one statement in a block, we can then\n * eliminate a pair of {}\u0027s. Further more, we can also fold a single\n * statement IF into \u0026\u0026 or create further opportunities for all the other\n * goodies in {@link PeepholeSubstituteAlternateSyntax}.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 36,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 42,col 5)",
        "(line 43,col 5)-(line 43,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.canFuseIntoOneStatement(com.google.javascript.rhino.Node)",
      "begin_line": 46,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 50,col 5)",
        "(line 53,col 5)-(line 55,col 5)",
        "(line 57,col 5)-(line 57,col 37)",
        "(line 59,col 5)-(line 63,col 5)",
        "(line 67,col 5)-(line 80,col 5)",
        "(line 82,col 5)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseIntoOneStatement(com.google.javascript.rhino.Node)",
      "begin_line": 85,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 40)",
        "(line 89,col 5)-(line 89,col 44)",
        "(line 92,col 5)-(line 95,col 5)",
        "(line 97,col 5)-(line 97,col 50)",
        "(line 98,col 5)-(line 98,col 37)",
        "(line 103,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 122,
      "end_line": 142,
      "comment": " exp1, exp1",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 45)",
        "(line 124,col 5)-(line 124,col 36)",
        "(line 129,col 5)-(line 141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoFirstChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 39)",
        "(line 146,col 5)-(line 146,col 56)",
        "(line 147,col 5)-(line 147,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoSecondChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 59)",
        "(line 152,col 5)-(line 152,col 56)",
        "(line 153,col 5)-(line 153,col 52)"
      ]
    }
  ]
}