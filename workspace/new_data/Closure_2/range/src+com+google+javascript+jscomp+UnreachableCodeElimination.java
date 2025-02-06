{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/UnreachableCodeElimination.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnreachableCodeElimination",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 46,
      "end_line": 260,
      "comment": "\n * Removes dead code from a parse tree. The kinds of dead code that this pass\n * removes are:\n *  - Any code following a return statement, such as the \u003ccode\u003ealert\u003c/code\u003e\n *    call in: \u003ccode\u003eif (x) { return; alert(\u0027unreachable\u0027); }\u003c/code\u003e.\n *  - Statements that have no side effects, such as:\n *    \u003ccode\u003ea.b.MyClass.prototype.propertyName;\u003c/code\u003e or \u003ccode\u003etrue;\u003c/code\u003e.\n *    That first kind of statement sometimes appears intentionally, so that\n *    prototype properties can be annotated using JSDoc without actually\n *    being initialized.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeNoOpStatements"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.UnreachableCodeElimination(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 29)",
        "(line 57,col 5)-(line 57,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 60,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 31)",
        "(line 65,col 5)-(line 65,col 78)",
        "(line 66,col 5)-(line 66,col 43)",
        "(line 67,col 5)-(line 67,col 46)",
        "(line 69,col 5)-(line 70,col 44)",
        "(line 72,col 5)-(line 72,col 36)",
        "(line 73,col 5)-(line 75,col 5)",
        "(line 76,col 5)-(line 77,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EliminationPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 85,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.EliminationPass(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 7)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 91,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 95,col 7)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 100,col 7)-(line 100,col 68)",
        "(line 101,col 7)-(line 103,col 7)",
        "(line 104,col 7)-(line 108,col 7)",
        "(line 110,col 7)-(line 110,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)",
      "begin_line": 131,
      "end_line": 180,
      "comment": "\n     * Tries to remove n if it is an unconditional branch node (break, continue,\n     * or return) and the target of n is the same as the the follow of n.\n     * That is, if removing n preserves the control flow. Also if n targets\n     * another unconditional branch, this function will recursively try to remove\n     * the target branch as well. The reason why we want to cascade this removal\n     * is because we only run this pass once. If we have code such as\n     *\n     * break -\u003e break -\u003e break\n     *\n     * where all 3 breaks are useless, then the order of removal matters. When we\n     * first look at the first break, we see that it branches to the 2nd break.\n     * However, if we remove the last break, the 2nd break becomes useless and\n     * finally the first break becomes useless as well.\n     *\n     * @return The target of this jump. If the target is also useless jump,\n     *     the target of that useless jump recursively.\n     ",
      "child_ranges": [
        "(line 144,col 7)-(line 146,col 7)",
        "(line 148,col 7)-(line 148,col 68)",
        "(line 150,col 7)-(line 152,col 7)",
        "(line 154,col 7)-(line 178,col 7)",
        "(line 179,col 7)-(line 179,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.computeFollowing(com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 183,col 59)",
        "(line 184,col 7)-(line 190,col 7)",
        "(line 191,col 7)-(line 191,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.removeDeadExprStatementSafely(com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 34)",
        "(line 196,col 7)-(line 200,col 7)",
        "(line 204,col 7)-(line 206,col 7)",
        "(line 208,col 7)-(line 229,col 7)",
        "(line 232,col 7)-(line 243,col 7)",
        "(line 245,col 7)-(line 245,col 44)",
        "(line 246,col 7)-(line 246,col 34)",
        "(line 247,col 7)-(line 249,col 7)",
        "(line 251,col 7)-(line 251,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 255,
      "end_line": 256,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 258,
      "end_line": 259,
      "comment": "",
      "child_ranges": []
    }
  ]
}