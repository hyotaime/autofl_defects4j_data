{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/StatementFusion.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatementFusion",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractPeepholeOptimization"
      ],
      "begin_line": 34,
      "end_line": 258,
      "comment": "\n * Tries to fuse all the statements in a block into a one statement by using\n * COMMAs.\n *\n * Because COMMAs has the lowest precedence, we never need to insert\n * extra () around. Once we have only one statement in a block, we can then\n * eliminate a pair of {}\u0027s. Further more, we can also fold a single\n * statement IF into \u0026\u0026 or create further opportunities for all the other\n * goodies in {@link PeepholeMinimizeConditions}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHOULD_FAVOR_COMMA_OVER_SEMI_COLON"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " to check this assumption if that\u0027s neccessary."
    },
    {
      "type": "field",
      "varNames": [
        "favorsCommaOverSemiColon"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StatementFusion.StatementFusion()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StatementFusion.StatementFusion(boolean)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.optimizeSubtree(com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.tryFuseStatements(com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 70,col 5)",
        "(line 71,col 5)-(line 71,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.tryFuseStatementsAggressively(com.google.javascript.rhino.Node)",
      "begin_line": 74,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 77,col 5)",
        "(line 79,col 5)-(line 79,col 33)",
        "(line 80,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 102,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.canFuseIntoOneStatement(com.google.javascript.rhino.Node)",
      "begin_line": 105,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 109,col 5)",
        "(line 112,col 5)-(line 114,col 5)",
        "(line 116,col 5)-(line 116,col 37)",
        "(line 118,col 5)-(line 122,col 5)",
        "(line 124,col 5)-(line 124,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.isFusableControlStatement(com.google.javascript.rhino.Node)",
      "begin_line": 127,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 150,col 5)",
        "(line 151,col 5)-(line 151,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseIntoOneStatement(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 183,
      "comment": "\n   * Given a block, fuse a list of statements with comma\u0027s.\n   *\n   * @param parent The parent that contains the statements.\n   * @param first The first statement to fuse (inclusive)\n   * @param last The last statement to fuse (exclusive)\n   * @return A single statement that contains all the fused statement as one.\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 166,col 5)",
        "(line 169,col 5)-(line 169,col 46)",
        "(line 171,col 5)-(line 171,col 21)",
        "(line 172,col 5)-(line 177,col 5)",
        "(line 181,col 5)-(line 181,col 36)",
        "(line 182,col 5)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoControlFlowStatement(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 185,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 187,col 5)-(line 188,col 44)",
        "(line 193,col 5)-(line 218,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpressionIntoExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 222,
      "end_line": 245,
      "comment": " exp1, exp1",
      "child_ranges": [
        "(line 223,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 226,col 45)",
        "(line 227,col 5)-(line 227,col 36)",
        "(line 232,col 5)-(line 244,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoFirstChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 39)",
        "(line 249,col 5)-(line 249,col 56)",
        "(line 250,col 5)-(line 250,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StatementFusion.fuseExpresssonIntoSecondChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 59)",
        "(line 255,col 5)-(line 255,col 56)",
        "(line 256,col 5)-(line 256,col 52)"
      ]
    }
  ]
}