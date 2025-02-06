{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/OptimizeParameters.java",
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
      "end_line": 548,
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
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 400,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parameter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 407,
      "end_line": 445,
      "comment": "\n   * Simple container class that keeps tracks of a parameter and whether it\n   * should be removed.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "arg"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shouldRemove"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasSideEffects"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "canBeSideEffected"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.Parameter(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 413,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 414,col 7)-(line 414,col 39)",
        "(line 415,col 7)-(line 415,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.getArg()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 7)-(line 419,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.shouldRemove()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 7)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setShouldRemove(boolean)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 7)-(line 427,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setHasSideEffects(boolean)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 431,col 7)-(line 431,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.hasSideEffects()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 435,col 7)-(line 435,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.setCanBeSideEffected(boolean)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 439,col 7)-(line 439,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.Parameter.canBeSideEffected()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 443,col 7)-(line 443,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.addVariableToFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 453,
      "end_line": 470,
      "comment": "\n   * Adds a variable to the top of a function block.\n   * @param function A function node.\n   * @param varName The name of the variable.\n   * @param value The initial value of the variable.\n   ",
      "child_ranges": [
        "(line 454,col 5)-(line 455,col 36)",
        "(line 457,col 5)-(line 457,col 41)",
        "(line 458,col 5)-(line 459,col 33)",
        "(line 461,col 5)-(line 461,col 56)",
        "(line 462,col 5)-(line 462,col 14)",
        "(line 463,col 5)-(line 467,col 5)",
        "(line 468,col 5)-(line 468,col 32)",
        "(line 469,col 5)-(line 469,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateParamsAfter(com.google.javascript.rhino.Node, int)",
      "begin_line": 476,
      "end_line": 486,
      "comment": "\n   * Removes all formal parameters starting at argIndex.\n   * @return true if a parameter has been removed.\n   ",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 33)",
        "(line 479,col 5)-(line 479,col 75)",
        "(line 480,col 5)-(line 483,col 5)",
        "(line 485,col 5)-(line 485,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateParamsAfter(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 488,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 489,col 5)-(line 497,col 5)",
        "(line 498,col 5)-(line 498,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateFunctionParamAt(com.google.javascript.rhino.Node, int)",
      "begin_line": 507,
      "end_line": 518,
      "comment": "\n   * Eliminates the parameter from a function definition.\n   * @param function The function node\n   * @param argIndex The index of the the argument to remove.\n   * @return The Node of the argument removed.\n   ",
      "child_ranges": [
        "(line 508,col 5)-(line 509,col 36)",
        "(line 511,col 5)-(line 512,col 28)",
        "(line 514,col 5)-(line 516,col 5)",
        "(line 517,col 5)-(line 517,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.OptimizeParameters.eliminateCallParamAt(com.google.javascript.jscomp.SimpleDefinitionFinder, com.google.javascript.jscomp.OptimizeParameters.Parameter, com.google.javascript.rhino.Node, int)",
      "begin_line": 528,
      "end_line": 547,
      "comment": "\n   * Eliminates the parameter from a function call.\n   * @param defFinder\n   * @param p\n   * @param call The function call node\n   * @param argIndex The index of the the argument to remove.\n   * @return The Node of the argument removed.\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 531,col 67)",
        "(line 533,col 5)-(line 534,col 24)",
        "(line 536,col 5)-(line 545,col 5)",
        "(line 546,col 5)-(line 546,col 24)"
      ]
    }
  ]
}