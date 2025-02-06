{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/OptimizeParameters.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptimizeParameters",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass"
      ],
      "begin_line": 44,
      "end_line": 560,
      "comment": "\n * Optimize function calls and function signatures.\n *\n * \u003cul\u003e\n * \u003cli\u003eRemoves optional parameters if no caller specifies it as argument.\u003c/li\u003e\n * \u003cli\u003eRemoves arguments at call site to function that\n *     ignores the parameter.\u003c/li\u003e\n * \u003cli\u003eInline a parameter if the function is always called with that constant.\n *     \u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removedNodes"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.OptimizeParameters(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 58,col 67)",
        "(line 59,col 5)-(line 59,col 76)",
        "(line 60,col 5)-(line 60,col 37)",
        "(line 61,col 5)-(line 61,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 64,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 72,col 5)",
        "(line 76,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.canChangeSignature(com.google.javascript.jscomp.DefinitionSite, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 85,
      "end_line": 147,
      "comment": "\n   * @return Whether the definitionSite represents a function whose call\n   *      signature can be modified.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 54)",
        "(line 89,col 5)-(line 91,col 5)",
        "(line 96,col 5)-(line 96,col 41)",
        "(line 97,col 5)-(line 101,col 5)",
        "(line 108,col 5)-(line 110,col 5)",
        "(line 113,col 5)-(line 115,col 5)",
        "(line 117,col 5)-(line 117,col 69)",
        "(line 119,col 5)-(line 121,col 5)",
        "(line 123,col 5)-(line 144,col 5)",
        "(line 146,col 5)-(line 146,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.tryEliminateOptionalArgs(com.google.javascript.jscomp.DefinitionSite, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 152,
      "end_line": 171,
      "comment": "\n   * Removes any optional parameters if no callers specifies it as an argument.\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 21)",
        "(line 158,col 5)-(line 158,col 47)",
        "(line 159,col 5)-(line 159,col 69)",
        "(line 160,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 170,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.tryEliminateConstantArgs(com.google.javascript.jscomp.DefinitionSite, com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 184,
      "end_line": 231,
      "comment": "\n   * Eliminate parameters if they are always constant.\n   *\n   * function foo(a, b) {...}\n   * foo(1,2);\n   * foo(1,3)\n   * becomes\n   * function foo(b) { var a \u003d 1 ... }\n   * foo(2);\n   * foo(3);\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 187,col 54)",
        "(line 188,col 5)-(line 188,col 29)",
        "(line 191,col 5)-(line 191,col 47)",
        "(line 192,col 5)-(line 192,col 69)",
        "(line 193,col 5)-(line 193,col 36)",
        "(line 194,col 5)-(line 210,col 5)",
        "(line 212,col 5)-(line 212,col 55)",
        "(line 213,col 5)-(line 215,col 5)",
        "(line 218,col 5)-(line 223,col 5)",
        "(line 227,col 5)-(line 227,col 43)",
        "(line 228,col 5)-(line 230,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.adjustForSideEffects(java.util.List\u003ccom.google.javascript.jscomp.OptimizeParameters.Parameter\u003e)",
      "begin_line": 237,
      "end_line": 275,
      "comment": "\n   * Adjust the parameters to move based on the side-effects seen.\n   * @return Whether there are any movable parameters.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 31)",
        "(line 245,col 5)-(line 245,col 45)",
        "(line 246,col 5)-(line 246,col 48)",
        "(line 247,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.findFixedParameters(java.util.List\u003ccom.google.javascript.jscomp.OptimizeParameters.Parameter\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 281,
      "end_line": 310,
      "comment": "\n   * Determine which parameters use the same expression.\n   * @return Whether any parameter was found that can be updated.\n   ",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 31)",
        "(line 283,col 5)-(line 283,col 18)",
        "(line 284,col 5)-(line 303,col 5)",
        "(line 305,col 5)-(line 307,col 5)",
        "(line 309,col 5)-(line 309,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.buildParameterList(java.util.List\u003ccom.google.javascript.jscomp.OptimizeParameters.Parameter\u003e, com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 315,
      "end_line": 328,
      "comment": "\n   * @return Whether any parameter was movable.\n   ",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 31)",
        "(line 318,col 5)-(line 326,col 5)",
        "(line 327,col 5)-(line 327,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.setParameterSideEffectInfo(com.google.javascript.jscomp.OptimizeParameters.Parameter, com.google.javascript.rhino.Node)",
      "begin_line": 330,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 333,col 5)",
        "(line 335,col 5)-(line 337,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.isMovableValue(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 345,
      "end_line": 380,
      "comment": "\n   * @return Whether the expression can be safely moved to another function\n   *   in another scope.\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 372,col 5)",
        "(line 374,col 5)-(line 378,col 5)",
        "(line 379,col 5)-(line 379,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.optimizeFunctionDefinition(java.util.List\u003ccom.google.javascript.jscomp.OptimizeParameters.Parameter\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 382,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 384,col 5)-(line 390,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.optimizeCallSite(com.google.javascript.jscomp.SimpleDefinitionFinder, java.util.List\u003ccom.google.javascript.jscomp.OptimizeParameters.Parameter\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 393,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 54)",
        "(line 396,col 5)-(line 396,col 73)",
        "(line 397,col 5)-(line 414,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parameter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 421,
      "end_line": 459,
      "comment": "\n   * Simple container class that keeps tracks of a parameter and whether it\n   * should be removed.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "arg"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldRemove"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasSideEffects"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canBeSideEffected"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.Parameter(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 427,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 428,col 7)-(line 428,col 39)",
        "(line 429,col 7)-(line 429,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.getArg()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 433,col 7)-(line 433,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.shouldRemove()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 7)-(line 437,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setShouldRemove(boolean)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 7)-(line 441,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setHasSideEffects(boolean)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 445,col 7)-(line 445,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.hasSideEffects()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 7)-(line 449,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setCanBeSideEffected(boolean)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 453,col 7)-(line 453,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.canBeSideEffected()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.addVariableToFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 467,
      "end_line": 484,
      "comment": "\n   * Adds a variable to the top of a function block.\n   * @param function A function node.\n   * @param varName The name of the variable.\n   * @param value The initial value of the variable.\n   ",
      "child_ranges": [
        "(line 468,col 5)-(line 469,col 36)",
        "(line 471,col 5)-(line 471,col 41)",
        "(line 472,col 5)-(line 473,col 33)",
        "(line 475,col 5)-(line 475,col 56)",
        "(line 476,col 5)-(line 476,col 14)",
        "(line 477,col 5)-(line 481,col 5)",
        "(line 482,col 5)-(line 482,col 32)",
        "(line 483,col 5)-(line 483,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateParamsAfter(com.google.javascript.rhino.Node, int)",
      "begin_line": 490,
      "end_line": 498,
      "comment": "\n   * Removes all formal parameters starting at argIndex.\n   * @return true if a parameter has been removed.\n   ",
      "child_ranges": [
        "(line 491,col 5)-(line 491,col 75)",
        "(line 492,col 5)-(line 495,col 5)",
        "(line 497,col 5)-(line 497,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateParamsAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 500,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 501,col 5)-(line 509,col 5)",
        "(line 510,col 5)-(line 510,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateFunctionParamAt(com.google.javascript.rhino.Node, int)",
      "begin_line": 519,
      "end_line": 530,
      "comment": "\n   * Eliminates the parameter from a function definition.\n   * @param function The function node\n   * @param argIndex The index of the the argument to remove.\n   * @return The Node of the argument removed.\n   ",
      "child_ranges": [
        "(line 520,col 5)-(line 521,col 36)",
        "(line 523,col 5)-(line 524,col 28)",
        "(line 526,col 5)-(line 528,col 5)",
        "(line 529,col 5)-(line 529,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateCallParamAt(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.OptimizeParameters.Parameter, com.google.javascript.rhino.Node, int)",
      "begin_line": 540,
      "end_line": 559,
      "comment": "\n   * Eliminates the parameter from a function call.\n   * @param defFinder\n   * @param p\n   * @param call The function call node\n   * @param argIndex The index of the the argument to remove.\n   * @return The Node of the argument removed.\n   ",
      "child_ranges": [
        "(line 542,col 5)-(line 543,col 67)",
        "(line 545,col 5)-(line 546,col 24)",
        "(line 548,col 5)-(line 557,col 5)",
        "(line 558,col 5)-(line 558,col 24)"
      ]
    }
  ]
}