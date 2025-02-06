{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/FlowSensitiveInlineVariables.java",
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
      "begin_line": 60,
      "end_line": 539,
      "comment": "\n * Inline variables when possible. Using the information from\n * {@link MaybeReachingVariableUse} and {@link MustBeReachingVariableDef},\n * this pass attempts to inline a variable by placing the value at the\n * definition where the variable is used. The basic requirements for inlining\n * are the following:\n *\n * \u003cul\u003e\n * \u003cli\u003e There is exactly one reaching definition at the use of that variable\n * \u003c/li\u003e\n * \u003cli\u003e There is exactly one use for that definition of the variable\n * \u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eOther requirements can be found in {@link Candidate#canInline}. Currently\n * this pass does not operate on the global scope due to compilation time.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Implementation:\n   *\n   * This pass first perform a traversal to gather a list of Candidates that\n   * could be inlined using {@link GatherCandiates}.\n   *\n   * The second step involves verifying that each candidate is actually safe\n   * to inline with {@link Candidate#canInline()} and finally perform inlining\n   * using {@link Candidate#inlineVariable()}.\n   *\n   * The reason for the delayed evaluation of the candidates is because we\n   * need two separate dataflow result.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inlinedNewDependencies"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfg"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " scope."
    },
    {
      "type": "field",
      "varNames": [
        "candidates"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reachingDef"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reachingUses"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIDE_EFFECT_PREDICATE"
      ],
      "begin_line": 86,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Anonymous-cebb39a6-09bc-4c44-be5d-697ce30d2e50.apply(com.google.javascript.rhino.Node)",
      "begin_line": 88,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.FlowSensitiveInlineVariables(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 124,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 134,col 5)",
        "(line 137,col 5)-(line 137,col 77)",
        "(line 139,col 5)-(line 139,col 60)",
        "(line 140,col 5)-(line 140,col 55)",
        "(line 141,col 5)-(line 141,col 23)",
        "(line 142,col 5)-(line 142,col 77)",
        "(line 143,col 5)-(line 143,col 26)",
        "(line 144,col 5)-(line 144,col 39)",
        "(line 148,col 5)-(line 149,col 41)",
        "(line 152,col 5)-(line 152,col 77)",
        "(line 153,col 5)-(line 153,col 27)",
        "(line 154,col 5)-(line 169,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 172,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 175,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 187,
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
      "begin_line": 196,
      "end_line": 245,
      "comment": "\n   * Gathers a list of possible candidates for inlining based only on\n   * information from {@link MustBeReachingVariableDef}. The list will be stored\n   * in {@code candidates} and the validity of each inlining Candidate should\n   * be later verified with {@link Candidate#canInline()} when\n   * {@link MaybeReachingVariableUse} has been performed.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.GatherCandiates.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 197,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 199,col 7)-(line 199,col 72)",
        "(line 200,col 7)-(line 203,col 7)",
        "(line 204,col 7)-(line 204,col 59)",
        "(line 205,col 7)-(line 205,col 41)",
        "(line 206,col 7)-(line 206,col 29)",
        "(line 207,col 7)-(line 241,col 8)",
        "(line 243,col 7)-(line 243,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.GatherCandiates.Anonymous-928d64ef-7897-4faf-a18f-6e6237119a52.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 212,col 11)-(line 239,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Candidate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 250,
      "end_line": 497,
      "comment": "\n   * Models the connection between a definition and a use of that definition.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "varName"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " Name of the variable."
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " Nodes related to the definition."
    },
    {
      "type": "field",
      "varNames": [
        "defMetadata"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "use"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " Nodes related to the use."
    },
    {
      "type": "field",
      "varNames": [
        "useCfgNode"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numUseWithinUseCfgNode"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " use in the CFG."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Candidate(java.lang.String, com.google.javascript.jscomp.MustBeReachingVariableDef.Definition, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 269,col 7)-(line 269,col 48)",
        "(line 270,col 7)-(line 270,col 29)",
        "(line 271,col 7)-(line 271,col 37)",
        "(line 272,col 7)-(line 272,col 21)",
        "(line 273,col 7)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getDefCfgNode()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 7)-(line 277,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.canInline(com.google.javascript.jscomp.Scope)",
      "begin_line": 280,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 282,col 7)-(line 284,col 7)",
        "(line 289,col 7)-(line 293,col 7)",
        "(line 295,col 7)-(line 295,col 43)",
        "(line 296,col 7)-(line 296,col 46)",
        "(line 299,col 7)-(line 301,col 7)",
        "(line 305,col 7)-(line 307,col 7)",
        "(line 312,col 7)-(line 314,col 7)",
        "(line 319,col 7)-(line 321,col 7)",
        "(line 326,col 7)-(line 328,col 7)",
        "(line 335,col 7)-(line 337,col 7)",
        "(line 340,col 7)-(line 342,col 7)",
        "(line 345,col 7)-(line 345,col 77)",
        "(line 347,col 7)-(line 349,col 7)",
        "(line 363,col 7)-(line 393,col 7)",
        "(line 397,col 7)-(line 414,col 7)",
        "(line 416,col 7)-(line 416,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-ed5e6778-5cbb-4fbc-8c15-a18aa74da81c.apply(com.google.javascript.rhino.Node)",
      "begin_line": 365,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 367,col 17)-(line 381,col 17)",
        "(line 382,col 17)-(line 382,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-4d2003ab-3333-420c-a6ec-1b7ce0bb361a.apply(com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 389,col 17)-(line 389,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.inlineVariable()",
      "begin_line": 422,
      "end_line": 443,
      "comment": "\n     * Actual transformation.\n     ",
      "child_ranges": [
        "(line 423,col 7)-(line 423,col 39)",
        "(line 424,col 7)-(line 424,col 39)",
        "(line 425,col 7)-(line 441,col 7)",
        "(line 442,col 7)-(line 442,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 450,
      "end_line": 473,
      "comment": "\n     * Set the def node\n     *\n     * @param n A node that has a corresponding CFG node in the CFG.\n     ",
      "child_ranges": [
        "(line 451,col 7)-(line 471,col 8)",
        "(line 472,col 7)-(line 472,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-952abb29-0c37-40c9-8cd6-9d0b7cb7de9c.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 456,col 11)-(line 469,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.getNumUseInUseCfgNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 479,
      "end_line": 496,
      "comment": "\n     * Computes the number of uses of the variable varName and store it in\n     * numUseWithinUseCfgNode.\n     ",
      "child_ranges": [
        "(line 481,col 7)-(line 493,col 8)",
        "(line 495,col 7)-(line 495,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.Candidate.Anonymous-422c1035-c622-4488-9b95-df8930781504.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 484,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 486,col 11)-(line 491,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 507,
      "end_line": 517,
      "comment": "\n   * Given an expression by its root and sub-expression n, return true if there\n   * the predicate is true for some expression on the right of n.\n   *\n   * Example:\n   *\n   * NotChecked(), NotChecked(), n, Checked(), Checked();\n   ",
      "child_ranges": [
        "(line 509,col 5)-(line 515,col 5)",
        "(line 516,col 5)-(line 516,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 527,
      "end_line": 538,
      "comment": "\n   * Given an expression by its root and sub-expression n, return true if there\n   * the predicate is true for some expression on the left of n.\n   *\n   * Example:\n   *\n   * Checked(), Checked(), n, NotChecked(), NotChecked();\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 536,col 5)",
        "(line 537,col 5)-(line 537,col 17)"
      ]
    }
  ]
}