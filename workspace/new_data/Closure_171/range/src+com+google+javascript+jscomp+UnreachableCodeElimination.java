{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/UnreachableCodeElimination.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnreachableCodeElimination",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 51,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeNoOpStatements"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codeChanged"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.UnreachableCodeElimination(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 29)",
        "(line 61,col 5)-(line 61,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.Anonymous-f8b500b6-b58c-4270-8e1d-4ce479b88840.visit(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 70,col 11)-(line 71,col 62)",
        "(line 72,col 11)-(line 72,col 34)",
        "(line 73,col 11)-(line 73,col 52)",
        "(line 74,col 11)-(line 75,col 50)",
        "(line 76,col 11)-(line 78,col 11)",
        "(line 79,col 11)-(line 82,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EliminationPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 87,
      "end_line": 258,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.EliminationPass(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 97,col 7)",
        "(line 98,col 7)-(line 98,col 68)",
        "(line 99,col 7)-(line 101,col 7)",
        "(line 102,col 7)-(line 106,col 7)",
        "(line 107,col 7)-(line 107,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 175,
      "comment": "\n     * Tries to remove n if it is an unconditional branch node (break, continue,\n     * or return) and the target of n is the same as the the follow of n.\n     * That is, if removing n preserves the control flow. Also if n targets\n     * another unconditional branch, this function will recursively try to\n     * remove the target branch as well. The reason why we want to cascade this\n     * removal is because we only run this pass once. If we have code such as\n     *\n     * break -\u003e break -\u003e break\n     *\n     * where all 3 breaks are useless, then the order of removal matters. When\n     * we first look at the first break, we see that it branches to the 2nd\n     * break. However, if we remove the last break, the 2nd break becomes\n     * useless and finally the first break becomes useless as well.\n     *\n     * @returns The target of this jump. If the target is also useless jump,\n     *     the target of that useless jump recursively.\n     ",
      "child_ranges": [
        "(line 141,col 7)-(line 143,col 7)",
        "(line 145,col 7)-(line 145,col 68)",
        "(line 147,col 7)-(line 149,col 7)",
        "(line 151,col 7)-(line 174,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.inFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 178,col 7)-(line 184,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.computeFollowing(com.google.javascript.rhino.Node)",
      "begin_line": 187,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 59)",
        "(line 189,col 7)-(line 195,col 7)",
        "(line 196,col 7)-(line 196,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.removeDeadExprStatementSafely(com.google.javascript.rhino.Node)",
      "begin_line": 199,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 200,col 7)-(line 200,col 34)",
        "(line 201,col 7)-(line 204,col 7)",
        "(line 208,col 7)-(line 210,col 7)",
        "(line 212,col 7)-(line 231,col 7)",
        "(line 233,col 7)-(line 244,col 7)",
        "(line 246,col 7)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.UnreachableCodeElimination.EliminationPass.removeNode(com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 25)",
        "(line 251,col 7)-(line 251,col 44)",
        "(line 252,col 7)-(line 252,col 47)",
        "(line 253,col 7)-(line 255,col 7)",
        "(line 256,col 7)-(line 256,col 45)"
      ]
    }
  ]
}