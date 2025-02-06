{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DeadAssignmentsElimination.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DeadAssignmentsElimination",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 40,
      "end_line": 438,
      "comment": "\n * Removes local variable assignments that are useless based on information from\n * {@link LiveVariablesAnalysis}. If there is an assignment to variable\n * {@code x} and {@code x} is dead after this assignment, we know that the\n * current content of {@code x} will not be read and this assignment is useless.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "liveness"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "matchRemovableAssigns"
      ],
      "begin_line": 49,
      "end_line": 57,
      "comment": " will already remove variables that are initialized but unused."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.Anonymous-01ba3e95-9d3a-4ac7-be86-6392c136a581.apply(com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 53,col 7)-(line 55,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.DeadAssignmentsElimination(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 40)",
        "(line 66,col 5)-(line 66,col 37)",
        "(line 67,col 5)-(line 67,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 70,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 31)",
        "(line 76,col 5)-(line 78,col 5)",
        "(line 80,col 5)-(line 83,col 5)",
        "(line 88,col 5)-(line 88,col 51)",
        "(line 89,col 5)-(line 91,col 5)",
        "(line 95,col 5)-(line 98,col 5)",
        "(line 101,col 5)-(line 101,col 57)",
        "(line 102,col 5)-(line 102,col 63)",
        "(line 103,col 5)-(line 103,col 23)",
        "(line 104,col 5)-(line 104,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.tryRemoveDeadAssignments(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 123,
      "end_line": 158,
      "comment": "\n   * Try to remove useless assignments from a control flow graph that has been\n   * annotated with liveness information.\n   *\n   * @param t The node traversal.\n   * @param cfg The control flow graph of the program annotated with liveness\n   *        information.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 76)",
        "(line 127,col 5)-(line 157,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.tryRemoveAssignment(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DataFlowAnalysis.FlowState\u003ccom.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice\u003e)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.tryRemoveAssignment(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DataFlowAnalysis.FlowState\u003ccom.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice\u003e)",
      "begin_line": 175,
      "end_line": 279,
      "comment": "\n   * Determines if any local variables are dead after the instruction {@code n}\n   * and are assigned within the subtree of {@code n}. Removes those assignments\n   * if there are any.\n   *\n   * @param n Target instruction.\n   * @param exprRoot The CFG node where the liveness information in state is\n   *     still correct.\n   * @param state The liveness information at {@code n}.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 32)",
        "(line 180,col 5)-(line 278,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.isVariableStillLiveWithinExpression(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 296,
      "end_line": 344,
      "comment": "\n   * Given a variable, node n in the tree and a sub-tree denoted by exprRoot as\n   * the root, this function returns true if there exists a read of that\n   * variable before a write to that variable that is on the right side of n.\n   *\n   * For example, suppose the node is x \u003d 1:\n   *\n   * y \u003d 1, x \u003d 1; // false, there is no reads at all.\n   * y \u003d 1, x \u003d 1, print(x) // true, there is a read right of n.\n   * y \u003d 1, x \u003d 1, x \u003d 2, print(x) // false, there is a read right of n but\n   *                               // it is after a write.\n   *\n   * @param n The current node we should look at.\n   * @param exprRoot The node\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 342,col 5)",
        "(line 343,col 5)-(line 343,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.isVariableReadBeforeKill(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 358,
      "end_line": 419,
      "comment": "\n   * Give an expression and a variable. It returns READ, if the first\n   * reference of that variable is a read. It returns KILL, if the first\n   * reference of that variable is an assignment. It returns MAY_LIVE otherwise.\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 362,col 5)",
        "(line 364,col 5)-(line 379,col 5)",
        "(line 381,col 5)-(line 416,col 5)",
        "(line 418,col 5)-(line 418,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DeadAssignmentsElimination.checkHookBranchReadBeforeKill(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 421,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 424,col 26)",
        "(line 425,col 5)-(line 426,col 27)",
        "(line 430,col 5)-(line 436,col 5)"
      ]
    }
  ]
}