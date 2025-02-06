{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/LiveVariablesAnalysis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LiveVariablesAnalysis",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice\u003e"
      ],
      "begin_line": 48,
      "end_line": 309,
      "comment": "\n * Compute the \"liveness\" of all local variables. A variable is \"live\" at a\n * point of a program if the value it is currently holding might be read later.\n * Otherwise, the variable is considered \"dead\" if we know for sure that it will\n * no longer be read. Dead variables are candidates for dead assignment\n * elimination and variable name sharing. The worst case safe assumption is to\n * assume that all variables are live. In that case, we will have no opportunity\n * for optimizations. This is especially the case within a TRY block when an\n * assignment is not guaranteed to take place. We bail out by assuming that\n * all variables are live.\n * \u003cp\u003e\n * Due to the possibility of inner functions and closures, certain \"local\"\n * variables can escape the function. These variables will be considered as\n * global and they can be retrieved with {@link #getEscapedLocals()}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_VARIABLES_TO_ANALYZE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "       (# of Ninja Turtles)"
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENT_ARRAY_ALIAS"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LiveVariableJoinOp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp\u003ccom.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice\u003e"
      ],
      "begin_line": 58,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableJoinOp.apply(java.util.List\u003ccom.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice\u003e)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 70)",
        "(line 63,col 7)-(line 65,col 7)",
        "(line 66,col 7)-(line 66,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LiveVariableLattice",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 75,
      "end_line": 115,
      "comment": "\n   * The lattice that stores the liveness of all local variables at a given\n   * point in the program. The whole lattice is the power set of all local\n   * variables and a variable is live if it is in the set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "liveSet"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.LiveVariableLattice(int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * @param numVars Number of all local variables.\n     ",
      "child_ranges": [
        "(line 82,col 7)-(line 82,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.LiveVariableLattice(com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 86,col 7)-(line 86,col 40)",
        "(line 87,col 7)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.equals(java.lang.Object)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 92,col 7)-(line 92,col 40)",
        "(line 93,col 7)-(line 94,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.isLive(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 36)",
        "(line 99,col 7)-(line 99,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.isLive(int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.toString()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice.hashCode()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "jsScope"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The scope of the function that we are analyzing."
    },
    {
      "type": "field",
      "varNames": [
        "escaped"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariablesAnalysis(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 41)",
        "(line 124,col 5)-(line 124,col 27)",
        "(line 125,col 5)-(line 125,col 37)",
        "(line 126,col 5)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.getEscapedLocals()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.getVarIndex(java.lang.String)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.isForward()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.createEntryLattice()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.createInitialEstimateLattice()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.LiveVariablesAnalysis.LiveVariableLattice)",
      "begin_line": 152,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 56)",
        "(line 155,col 5)-(line 155,col 57)",
        "(line 158,col 5)-(line 158,col 32)",
        "(line 159,col 5)-(line 159,col 74)",
        "(line 160,col 5)-(line 164,col 5)",
        "(line 165,col 5)-(line 165,col 49)",
        "(line 166,col 5)-(line 166,col 64)",
        "(line 168,col 5)-(line 168,col 32)",
        "(line 169,col 5)-(line 169,col 27)",
        "(line 170,col 5)-(line 170,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.computeGenKill(com.google.javascript.rhino.Node, java.util.BitSet, java.util.BitSet, boolean)",
      "begin_line": 184,
      "end_line": 275,
      "comment": "\n   * Computes the GEN and KILL set.\n   *\n   * @param n Root node.\n   * @param gen Local variables that are live because of the instruction at\n   *        {@code n} will be added to this set.\n   * @param kill Local variables that are killed because of the instruction at\n   *        {@code n} will be added to this set.\n   * @param conditional {@code true} if any assignments encountered are\n   *        conditionally executed. These assignments might not kill a variable.\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 274,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.addToSetIfLocal(com.google.javascript.rhino.Node, java.util.BitSet)",
      "begin_line": 277,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 44)",
        "(line 279,col 5)-(line 279,col 35)",
        "(line 280,col 5)-(line 282,col 5)",
        "(line 283,col 5)-(line 283,col 35)",
        "(line 284,col 5)-(line 286,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.markAllParametersEscaped()",
      "begin_line": 293,
      "end_line": 298,
      "comment": "\n   * Give up computing liveness of formal parameter by putting all the parameter\n   * names in the escaped set.\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 62)",
        "(line 295,col 5)-(line 297,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LiveVariablesAnalysis.isArgumentsName(com.google.javascript.rhino.Node)",
      "begin_line": 300,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 307,col 5)"
      ]
    }
  ]
}