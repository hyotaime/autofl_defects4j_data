{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MustBeReachingVariableDef.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MustBeReachingVariableDef",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef\u003e"
      ],
      "begin_line": 45,
      "end_line": 454,
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
      "end_line": 97,
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
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Definition.toString()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Definition.hashCode()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MustDef",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.LatticeElement"
      ],
      "begin_line": 116,
      "end_line": 160,
      "comment": "\n   * Must reaching definition lattice representation. It captures a product\n   * lattice for each local (non-escaped) variable. The sub-lattice is\n   * a n + 2 element lattice with all the {@link Definition} in the program,\n   * TOP and BOTTOM.\n   *\n   * \u003cp\u003eSince this is a Must-Define analysis, BOTTOM represents the case where\n   * there might be more than one reaching definition for the variable.\n   *\n   *\n   *           (TOP)\n   *       /   |   |      \\\n   *     N1    N2  N3 ....Nn\n   *      \\    |   |      /\n   *          (BOTTOM)\n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "reachingDef"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " When a Var \"A\" \u003d \"BOTTOM\", \"A\" maps to null."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 7)-(line 127,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef(java.util.Iterator\u003ccom.google.javascript.jscomp.Scope.Var\u003e)",
      "begin_line": 130,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 131,col 13)",
        "(line 132,col 7)-(line 138,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.MustDef(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other The constructed object is a replicated copy of this element.\n     ",
      "child_ranges": [
        "(line 147,col 7)-(line 147,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.equals(java.lang.Object)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 153,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef.hashCode()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MustDefJoin",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp.BinaryJoinOp\u003ccom.google.javascript.jscomp.MustBeReachingVariableDef.MustDef\u003e"
      ],
      "begin_line": 162,
      "end_line": 204,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.MustDefJoin.apply(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 163,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 37)",
        "(line 166,col 7)-(line 166,col 58)",
        "(line 169,col 7)-(line 192,col 7)",
        "(line 196,col 7)-(line 201,col 7)",
        "(line 202,col 7)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.isForward()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.createEntryLattice()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.createInitialEstimateLattice()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 221,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 40)",
        "(line 229,col 5)-(line 229,col 40)",
        "(line 230,col 5)-(line 230,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.computeMustDef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef, boolean)",
      "begin_line": 238,
      "end_line": 331,
      "comment": "\n   * @param n The node in question.\n   * @param cfgNode The node to add\n   * @param conditional true if the definition is not always executed.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 330,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.addToDefIfLocal(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 340,
      "end_line": 371,
      "comment": "\n   * Set the variable lattice for the given name to the node value in the def\n   * lattice. Do nothing if the variable name is one of the escaped variable.\n   *\n   * @param node The CFG node where the definition should be record to.\n   *     {@code null} if this is a conditional define.\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 35)",
        "(line 346,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 358,col 5)",
        "(line 360,col 5)-(line 370,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.escapeParameters(com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef)",
      "begin_line": 373,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 381,col 5)",
        "(line 384,col 5)-(line 394,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.isParameter(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.computeDependence(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition, com.google.javascript.rhino.Node)",
      "begin_line": 405,
      "end_line": 420,
      "comment": "\n   * Computes all the local variables that rValue reads from and store that\n   * in the def\u0027s depends set.\n   ",
      "child_ranges": [
        "(line 406,col 5)-(line 419,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.Anonymous-b45a124e-d49e-476c-b3eb-31b7aed56a8e.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 408,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.getDef(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 430,
      "end_line": 435,
      "comment": "\n   * Gets the must reaching definition of a given node.\n   *\n   * @param name name of the variable. It can only be names of local variable\n   *     that are not function parameters, escaped variables or variables\n   *     declared in catch.\n   * @param useNode the location of the use where the definition reaches.\n   ",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 59)",
        "(line 432,col 5)-(line 432,col 58)",
        "(line 433,col 5)-(line 433,col 49)",
        "(line 434,col 5)-(line 434,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.getDefNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 43)",
        "(line 439,col 5)-(line 439,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MustBeReachingVariableDef.dependsOnOuterScopeVars(com.google.javascript.jscomp.MustBeReachingVariableDef.Definition)",
      "begin_line": 442,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 445,col 5)",
        "(line 447,col 5)-(line 451,col 5)",
        "(line 452,col 5)-(line 452,col 17)"
      ]
    }
  ]
}