{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FlowSensitiveInlineVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FlowSensitiveInlineVariables",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 58,
      "end_line": 552,
      "comment": "\n * Inline variables when possible. Using the information from\n * {@link MaybeReachingVariableUse} and {@link MustBeReachingVariableDef},\n * this pass attempts to inline a variable by placing the value at the\n * definition where the variable is used. The basic requirements for inlining\n * are the following:\n *\n * \u003cul\u003e\n * \u003cli\u003e There is exactly one reaching definition at the use of that variable\n * \u003c/li\u003e\n * \u003cli\u003e There is exactly one use for that definition of the variable\n * \u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eOther requirements can be found in {@link Candidate#canInline}. Currently\n * this pass does not operate on the global scope due to compilation time.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n   * Implementation:\n   *\n   * This pass first perform a traversal to gather a list of Candidates that\n   * could be inlined using {@link GatherCandiates}.\n   *\n   * The second step involves verifying that each candidate is actually safe\n   * to inline with {@link Candidate#canInline(Scope)} and finally perform\n   * inlining using {@link Candidate#inlineVariable()}.\n   *\n   * The reason for the delayed evaluation of the candidates is because we\n   * need two separate dataflow result.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inlinedNewDependencies"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " scope."
    },
    {
      "type": "field",
      "varNames": [
        "candidates"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reachingDef"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reachingUses"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECT_PREDICATE"
      ],
      "begin_line": 84,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Anonymous-0fb11035-25b4-47f6-aed4-e4db94e573f8.apply(com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.FlowSensitiveInlineVariables(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 122,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 132,col 5)",
        "(line 135,col 5)-(line 135,col 77)",
        "(line 137,col 5)-(line 137,col 60)",
        "(line 138,col 5)-(line 138,col 55)",
        "(line 139,col 5)-(line 139,col 23)",
        "(line 140,col 5)-(line 140,col 77)",
        "(line 141,col 5)-(line 141,col 26)",
        "(line 142,col 5)-(line 142,col 39)",
        "(line 146,col 5)-(line 147,col 41)",
        "(line 150,col 5)-(line 150,col 77)",
        "(line 151,col 5)-(line 151,col 27)",
        "(line 152,col 5)-(line 167,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 170,
      "end_line": 171,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 178,
      "end_line": 185,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GatherCandiates",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 194,
      "end_line": 241,
      "comment": "\n   * Gathers a list of possible candidates for inlining based only on\n   * information from {@link MustBeReachingVariableDef}. The list will be stored\n   * in {@code candidates} and the validity of each inlining Candidate should\n   * be later verified with {@link Candidate#canInline(Scope)} when\n   * {@link MaybeReachingVariableUse} has been performed.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.GatherCandiates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 195,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 72)",
        "(line 198,col 7)-(line 201,col 7)",
        "(line 202,col 7)-(line 202,col 29)",
        "(line 203,col 7)-(line 237,col 8)",
        "(line 239,col 7)-(line 239,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.GatherCandiates.Anonymous-1e4481f2-e4f9-4d3b-b815-0c6b73832412.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 208,col 11)-(line 235,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Candidate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 246,
      "end_line": 510,
      "comment": "\n   * Models the connection between a definition and a use of that definition.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "varName"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Name of the variable."
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " Nodes related to the definition."
    },
    {
      "type": "field",
      "varNames": [
        "defMetadata"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " Nodes related to the use."
    },
    {
      "type": "field",
      "varNames": [
        "useCfgNode"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numUsesWithinCfgNode"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " Number of uses of the variable within the current CFG node."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Candidate(java.lang.String, com.google.javascript.jscomp.MustBeReachingVariableDef.Definition, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 262,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 264,col 7)-(line 264,col 48)",
        "(line 265,col 7)-(line 265,col 29)",
        "(line 266,col 7)-(line 266,col 37)",
        "(line 267,col 7)-(line 267,col 21)",
        "(line 268,col 7)-(line 268,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getDefCfgNode()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.canInline(com.google.javascript.jscomp.Scope)",
      "begin_line": 275,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 277,col 7)-(line 279,col 7)",
        "(line 284,col 7)-(line 288,col 7)",
        "(line 290,col 7)-(line 290,col 37)",
        "(line 291,col 7)-(line 291,col 40)",
        "(line 294,col 7)-(line 296,col 7)",
        "(line 300,col 7)-(line 302,col 7)",
        "(line 307,col 7)-(line 309,col 7)",
        "(line 314,col 7)-(line 316,col 7)",
        "(line 321,col 7)-(line 323,col 7)",
        "(line 330,col 7)-(line 332,col 7)",
        "(line 335,col 7)-(line 337,col 7)",
        "(line 340,col 7)-(line 340,col 77)",
        "(line 342,col 7)-(line 344,col 7)",
        "(line 358,col 7)-(line 388,col 7)",
        "(line 392,col 7)-(line 409,col 7)",
        "(line 411,col 7)-(line 411,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-2c2eb528-b203-48e6-a406-3fb5fc21cf6f.apply(com.google.javascript.rhino.Node)",
      "begin_line": 360,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 362,col 17)-(line 376,col 17)",
        "(line 377,col 17)-(line 377,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-42d8f167-2374-4ffe-8b75-5697177d0f41.apply(com.google.javascript.rhino.Node)",
      "begin_line": 381,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 17)-(line 384,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.inlineVariable()",
      "begin_line": 417,
      "end_line": 438,
      "comment": "\n     * Actual transformation.\n     ",
      "child_ranges": [
        "(line 418,col 7)-(line 418,col 39)",
        "(line 419,col 7)-(line 419,col 39)",
        "(line 420,col 7)-(line 436,col 7)",
        "(line 437,col 7)-(line 437,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 445,
      "end_line": 468,
      "comment": "\n     * Set the def node\n     *\n     * @param n A node that has a corresponding CFG node in the CFG.\n     ",
      "child_ranges": [
        "(line 446,col 7)-(line 466,col 8)",
        "(line 467,col 7)-(line 467,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-1f85dc4c-c4b5-443e-9991-529344d1d598.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 451,col 11)-(line 464,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getNumUseInUseCfgNode(com.google.javascript.rhino.Node)",
      "begin_line": 474,
      "end_line": 509,
      "comment": "\n     * Computes the number of uses of the variable varName and store it in\n     * numUseWithinUseCfgNode.\n     ",
      "child_ranges": [
        "(line 476,col 7)-(line 476,col 31)",
        "(line 477,col 7)-(line 506,col 8)",
        "(line 508,col 7)-(line 508,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-5668ac8f-8191-469f-aca9-b8516d834f8f.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 480,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 482,col 11)-(line 495,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-b05ccdfc-d8ab-4d1d-bfac-dee5842ca102.isAssignChain(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 498,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 499,col 11)-(line 503,col 11)",
        "(line 504,col 11)-(line 504,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 520,
      "end_line": 530,
      "comment": "\n   * Given an expression by its root and sub-expression n, return true if there\n   * the predicate is true for some expression on the right of n.\n   *\n   * Example:\n   *\n   * NotChecked(), NotChecked(), n, Checked(), Checked();\n   ",
      "child_ranges": [
        "(line 522,col 5)-(line 528,col 5)",
        "(line 529,col 5)-(line 529,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 540,
      "end_line": 551,
      "comment": "\n   * Given an expression by its root and sub-expression n, return true if there\n   * the predicate is true for some expression on the left of n.\n   *\n   * Example:\n   *\n   * Checked(), Checked(), n, NotChecked(), NotChecked();\n   ",
      "child_ranges": [
        "(line 542,col 5)-(line 549,col 5)",
        "(line 550,col 5)-(line 550,col 17)"
      ]
    }
  ]
}