{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/MaybeReachingVariableUse.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MaybeReachingVariableUse",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses\u003e"
      ],
      "begin_line": 44,
      "end_line": 302,
      "comment": "\n * Computes \"may be\" reaching use for all definitions of each variables.\n *\n * A use of {@code A} in {@code alert(A)} is a \"may be\" reaching use of\n * the definition of {@code A} at {@code A \u003d foo()} if at least one path from\n * the use node reaches that definition and it is the last definition before\n * the use on that path.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "jsScope"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The scope of the function that we are analyzing."
    },
    {
      "type": "field",
      "varNames": [
        "escaped"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.MaybeReachingVariableUse(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 51,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 41)",
        "(line 54,col 5)-(line 54,col 27)",
        "(line 55,col 5)-(line 55,col 37)",
        "(line 59,col 5)-(line 59,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReachingUses",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 85,
      "end_line": 111,
      "comment": "\n   * May use definition lattice representation. It captures a product\n   * lattice for each local (non-escaped) variable. The sub-lattice is\n   * a n + 2 power set element lattice with all the Nodes in the program,\n   * TOP and BOTTOM. This is better explained with an example:\n   *\n   * Consider: A sub-lattice element representing the variable A represented\n   * by { N_4, N_5} where N_x is a Node in the program. This implies at\n   * that particular point in the program the content of A is \"upward exposed\"\n   * at point N_4 and N_5.\n   *\n   * Example:\n   *\n   * A \u003d 1;\n   * ...\n   * N_3:\n   * N_4: print(A);\n   * N_5: y \u003d A;\n   * N_6: A \u003d 1;\n   * N_7: print(A);\n   *\n   * At N_3, reads of A in {N_4, N_5} are said to be upward exposed.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "mayUseMap"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses.ReachingUses()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses.ReachingUses(com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other The constructed object is a replicated copy of this element.\n     ",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 104,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses.hashCode()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 109,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ReachingUsesJoinOp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp\u003ccom.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses\u003e"
      ],
      "begin_line": 120,
      "end_line": 129,
      "comment": "\n   * The join is a simple union because of the \"may be\" nature of the analysis.\n   *\n   * Consider: A \u003d 1; if (x) { A \u003d 2 }; alert(A);\n   *\n   * The read of A \"may be\" exposed to A \u003d 1 in the beginning.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUsesJoinOp.apply(java.util.List\u003ccom.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses\u003e)",
      "begin_line": 121,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 7)-(line 123,col 47)",
        "(line 124,col 7)-(line 126,col 7)",
        "(line 127,col 7)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.isForward()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.createEntryLattice()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.createInitialEstimateLattice()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)",
      "begin_line": 146,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 50)",
        "(line 153,col 5)-(line 153,col 49)",
        "(line 154,col 5)-(line 154,col 45)",
        "(line 156,col 5)-(line 156,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.hasExceptionHandler(com.google.javascript.rhino.Node)",
      "begin_line": 159,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 80)",
        "(line 161,col 5)-(line 165,col 5)",
        "(line 166,col 5)-(line 166,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.computeMayUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses, boolean)",
      "begin_line": 169,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 253,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.addToUseIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)",
      "begin_line": 261,
      "end_line": 269,
      "comment": "\n   * Sets the variable for the given name to the node value in the upward\n   * exposed lattice. Do nothing if the variable name is one of the escaped\n   * variable.\n   ",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 35)",
        "(line 263,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 268,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.removeFromUseIfLocal(java.lang.String, com.google.javascript.jscomp.MaybeReachingVariableUse.ReachingUses)",
      "begin_line": 276,
      "end_line": 284,
      "comment": "\n   * Removes the variable for the given name from the node value in the upward\n   * exposed lattice. Do nothing if the variable name is one of the escaped\n   * variable.\n   ",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 35)",
        "(line 278,col 5)-(line 280,col 5)",
        "(line 281,col 5)-(line 283,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MaybeReachingVariableUse.getUses(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\n   * Gets a list of nodes that may be using the value assigned to {@code name}\n   * in {@code defNode}. {@code defNode} must be one of the control flow graph\n   * nodes.\n   *\n   * @param name name of the variable. It can only be names of local variable\n   *     that are not function parameters, escaped variables or variables\n   *     declared in catch.\n   * @param defNode The list of upward exposed use for the variable.\n   ",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 58)",
        "(line 298,col 5)-(line 298,col 34)",
        "(line 299,col 5)-(line 299,col 54)",
        "(line 300,col 5)-(line 300,col 62)"
      ]
    }
  ]
}