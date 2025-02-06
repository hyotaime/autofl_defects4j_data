{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/MustBeReachingVariableDef.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MustBeReachingVariableDef",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef\u003e"
      ],
      "begin_line": 45,
      "end_line": 441,
      "comment": "\n * Computes reaching definition for all use of each variables.\n *\n * A definition of {@code A} in {@code A \u003d foo()} is a reaching definition of\n * the use of {@code A} in {@code alert(A)} if all paths from entry node must\n * reaches that definition and it is the last definition before the use.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "jsScope"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The scope of the function that we are analyzing."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "escaped"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustBeReachingVariableDef(com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 34)",
        "(line 56,col 5)-(line 56,col 27)",
        "(line 57,col 5)-(line 57,col 29)",
        "(line 58,col 5)-(line 58,col 37)",
        "(line 59,col 5)-(line 59,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Definition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 87,
      "comment": "\n   * Abstraction of a local variable definition. It represents the node which\n   * a local variable is defined as well as a set of other local variables that\n   * this definition reads from. For example N: a \u003d b + foo.bar(c). The\n   * definition node will be N, the depending set would be {b,c}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "depends"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownDependencies"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Definition.Definition(com.google.javascript.rhino.Node)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 7)-(line 74,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Definition.equals(java.lang.Object)",
      "begin_line": 77,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 79,col 7)-(line 81,col 7)",
        "(line 82,col 7)-(line 82,col 47)",
        "(line 85,col 7)-(line 85,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MustDef",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 106,
      "end_line": 145,
      "comment": "\n   * Must reaching definition lattice representation. It captures a product\n   * lattice for each local (non-escaped) variable. The sub-lattice is\n   * a n + 2 element lattice with all the {@link Definition} in the program,\n   * TOP and BOTTOM.\n   *\n   * \u003cp\u003eSince this is a Must-Define analysis, BOTTOM represents the case where\n   * there might be more than one reaching definition for the variable.\n   *\n   *\n   *           (TOP)\n   *       /   |   |      \\\n   *     N1    N2  N3 ....Nn\n   *      \\    |   |      /\n   *          (BOTTOM)\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reachingDef"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " When a Var \"A\" \u003d \"BOTTOM\", \"A\" maps to null."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 117,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef(java.util.Iterator\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 120,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 121,col 7)-(line 121,col 13)",
        "(line 122,col 7)-(line 128,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other The constructed object is a replicated copy of this element.\n     ",
      "child_ranges": [
        "(line 137,col 7)-(line 137,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.equals(java.lang.Object)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 143,col 65)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MustDefJoin",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp.BinaryJoinOp\u003ccom.google.javascript.jscomp.MustBeReachingVariableDef.MustDef\u003e"
      ],
      "begin_line": 147,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDefJoin.apply(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 148,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 37)",
        "(line 151,col 7)-(line 151,col 58)",
        "(line 154,col 7)-(line 179,col 7)",
        "(line 183,col 7)-(line 188,col 7)",
        "(line 189,col 7)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.isForward()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.createEntryLattice()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.createInitialEstimateLattice()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 40)",
        "(line 216,col 5)-(line 216,col 40)",
        "(line 217,col 5)-(line 217,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef, boolean)",
      "begin_line": 225,
      "end_line": 318,
      "comment": "\n   * @param n The node in question.\n   * @param cfgNode The node to add\n   * @param conditional true if the definition is not always executed.\n   ",
      "child_ranges": [
        "(line 227,col 5)-(line 317,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 327,
      "end_line": 358,
      "comment": "\n   * Set the variable lattice for the given name to the node value in the def\n   * lattice. Do nothing if the variable name is one of the escaped variable.\n   *\n   * @param node The CFG node where the definition should be record to.\n   *     {@code null} if this is a conditional define.\n   ",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 35)",
        "(line 333,col 5)-(line 335,col 5)",
        "(line 337,col 5)-(line 345,col 5)",
        "(line 347,col 5)-(line 357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 360,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 368,col 5)",
        "(line 371,col 5)-(line 381,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition, com.google.javascript.rhino.Node)",
      "begin_line": 392,
      "end_line": 407,
      "comment": "\n   * Computes all the local variables that rValue reads from and store that\n   * in the def\u0027s depends set.\n   ",
      "child_ranges": [
        "(line 393,col 5)-(line 406,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Anonymous-476f745c-e39e-4540-b738-d35c6faef42a.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 404,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.getDef(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 417,
      "end_line": 422,
      "comment": "\n   * Gets the must reaching definition of a given node.\n   *\n   * @param name name of the variable. It can only be names of local variable\n   *     that are not function parameters, escaped variables or variables\n   *     declared in catch.\n   * @param useNode the location of the use where the definition reaches.\n   ",
      "child_ranges": [
        "(line 418,col 5)-(line 418,col 59)",
        "(line 419,col 5)-(line 419,col 58)",
        "(line 420,col 5)-(line 420,col 49)",
        "(line 421,col 5)-(line 421,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.getDefNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 424,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 43)",
        "(line 426,col 5)-(line 426,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.dependsOnOuterScopeVars(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition)",
      "begin_line": 429,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 432,col 5)",
        "(line 434,col 5)-(line 438,col 5)",
        "(line 439,col 5)-(line 439,col 17)"
      ]
    }
  ]
}