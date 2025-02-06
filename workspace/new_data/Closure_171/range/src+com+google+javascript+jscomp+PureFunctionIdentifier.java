{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PureFunctionIdentifier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureFunctionIdentifier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 64,
      "end_line": 1128,
      "comment": "\n * Compiler pass that computes function purity.  A function is pure if\n * it has no outside visible side effects, and the result of the\n * computation does not depend on external factors that are beyond the\n * control of the application; repeated calls to the function should\n * return the same value as long as global state hasn\u0027t changed.\n *\n * Date.now is an example of a function that has no side effects but\n * is not pure.\n *\n *\n * We will prevail, in peace and freedom from fear, and in true\n * health, through the purity and essence of our natural... fluids.\n *                                    - General Turgidson\n "
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_NO_SIDE_EFFECT_ANNOTATION"
      ],
      "begin_line": 65,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_MODIFIES_ANNOTATION"
      ],
      "begin_line": 70,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "definitionProvider"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionSideEffectMap"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Function node -\u003e function side effects map"
    },
    {
      "type": "field",
      "varNames": [
        "allFunctionCalls"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " List of all function call sites; used to iterate in markPureFunctionCalls."
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " fields are null until process is called."
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.PureFunctionIdentifier(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.DefinitionProvider)",
      "begin_line": 89,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 29)",
        "(line 92,col 5)-(line 92,col 49)",
        "(line 93,col 5)-(line 93,col 51)",
        "(line 94,col 5)-(line 94,col 49)",
        "(line 95,col 5)-(line 95,col 24)",
        "(line 96,col 5)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 99,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 106,col 5)",
        "(line 108,col 5)-(line 108,col 25)",
        "(line 109,col 5)-(line 109,col 18)",
        "(line 111,col 5)-(line 111,col 74)",
        "(line 112,col 5)-(line 112,col 72)",
        "(line 114,col 5)-(line 114,col 27)",
        "(line 116,col 5)-(line 116,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.getDebugReport()",
      "begin_line": 124,
      "end_line": 176,
      "comment": "\n   * Compute debug report that includes:\n   *  - List of all pure functions.\n   *  - Reasons we think the remaining functions have side effects.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 40)",
        "(line 126,col 5)-(line 126,col 37)",
        "(line 128,col 5)-(line 128,col 43)",
        "(line 130,col 5)-(line 130,col 62)",
        "(line 131,col 5)-(line 131,col 41)",
        "(line 132,col 5)-(line 132,col 38)",
        "(line 134,col 5)-(line 134,col 35)",
        "(line 135,col 5)-(line 145,col 5)",
        "(line 146,col 5)-(line 146,col 20)",
        "(line 148,col 5)-(line 173,col 5)",
        "(line 175,col 5)-(line 175,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.getCallableDefinitions(com.google.javascript.jscomp.DefinitionProvider, com.google.javascript.rhino.Node)",
      "begin_line": 189,
      "end_line": 244,
      "comment": "\n   * Query the DefinitionProvider for the list of definitions that\n   * correspond to a given qualified name subtree.  Return null if\n   * DefinitionProvider does not contain an entry for a given name,\n   * one or more of the values returned by getDeclarations is not\n   * callable, or the \"name\" node is not a GETPROP or NAME.\n   *\n   * @param definitionProvider The name reference graph\n   * @param name Query node\n   * @return non-empty definition list or null\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 243,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.propagateSideEffects()",
      "begin_line": 252,
      "end_line": 302,
      "comment": "\n   * Propagate side effect information by building a graph based on\n   * call site information stored in FunctionInformation and the\n   * DefinitionProvider and then running GraphReachability to\n   * determine the set of functions that have side effects.\n   ",
      "child_ranges": [
        "(line 254,col 5)-(line 255,col 55)",
        "(line 258,col 5)-(line 260,col 5)",
        "(line 263,col 5)-(line 290,col 5)",
        "(line 293,col 5)-(line 294,col 44)",
        "(line 297,col 5)-(line 301,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.markPureFunctionCalls()",
      "begin_line": 307,
      "end_line": 372,
      "comment": "\n   * Set no side effect property at pure-function call sites.\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionAnalyzer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 379,
      "end_line": 751,
      "comment": "\n   * Gather list of functions, functions with @nosideeffects\n   * annotations, call sites, and functions that may mutate variables\n   * not defined in the local scope.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.FunctionAnalyzer(boolean)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 383,col 7)-(line 383,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 398,col 7)",
        "(line 400,col 7)-(line 400,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 403,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 406,col 7)-(line 408,col 7)",
        "(line 410,col 7)-(line 413,col 7)",
        "(line 415,col 7)-(line 417,col 7)",
        "(line 419,col 7)-(line 419,col 64)",
        "(line 420,col 7)-(line 473,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 481,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 483,col 7)-(line 485,col 7)",
        "(line 489,col 7)-(line 490,col 52)",
        "(line 491,col 7)-(line 494,col 7)",
        "(line 496,col 7)-(line 525,col 7)",
        "(line 527,col 7)-(line 527,col 42)",
        "(line 528,col 7)-(line 528,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitAssignmentOrUnaryOperator(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 542,
      "end_line": 593,
      "comment": "\n     * Record information about the side effects caused by an\n     * assignment or mutating unary operator.\n     *\n     * If the operation modifies this or taints global state, mark the\n     * enclosing function as having those side effects.\n     * @param op operation being performed.\n     * @param lhs The store location (name or get) being operated on.\n     * @param rhs The right have value, if any.\n     ",
      "child_ranges": [
        "(line 545,col 7)-(line 592,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitCall(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node)",
      "begin_line": 598,
      "end_line": 612,
      "comment": "\n     * Record information about a call site.\n     ",
      "child_ranges": [
        "(line 600,col 7)-(line 603,col 7)",
        "(line 606,col 7)-(line 609,col 7)",
        "(line 611,col 7)-(line 611,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 617,
      "end_line": 683,
      "comment": "\n     * Record function and check for @nosideeffects annotations.\n     ",
      "child_ranges": [
        "(line 621,col 7)-(line 621,col 76)",
        "(line 623,col 7)-(line 623,col 78)",
        "(line 624,col 7)-(line 624,col 54)",
        "(line 626,col 7)-(line 639,col 7)",
        "(line 641,col 7)-(line 641,col 68)",
        "(line 642,col 7)-(line 682,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.isLocalValueType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 688,
      "end_line": 695,
      "comment": "\n     * @return Whether the jstype is something known to be a local value.\n     ",
      "child_ranges": [
        "(line 689,col 7)-(line 689,col 41)",
        "(line 690,col 7)-(line 691,col 78)",
        "(line 694,col 7)-(line 694,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitThrow(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * Record that the enclosing function throws.\n     ",
      "child_ranges": [
        "(line 701,col 7)-(line 701,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.getJSDocInfoForFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 707,
      "end_line": 719,
      "comment": "\n     * Get the doc info associated with the function.\n     ",
      "child_ranges": [
        "(line 709,col 7)-(line 709,col 43)",
        "(line 710,col 7)-(line 718,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasNoSideEffectsAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 725,
      "end_line": 728,
      "comment": "\n     * Get the value of the @nosideeffects annotation stored in the\n     * doc info.\n     ",
      "child_ranges": [
        "(line 726,col 7)-(line 726,col 42)",
        "(line 727,col 7)-(line 727,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasSideEffectsThisAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 734,
      "end_line": 737,
      "comment": "\n     * Get the value of the @modifies{this} annotation stored in the\n     * doc info.\n     ",
      "child_ranges": [
        "(line 735,col 7)-(line 735,col 42)",
        "(line 736,col 7)-(line 736,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasSideEffectsArgumentsAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 743,
      "end_line": 750,
      "comment": "\n     * @returns Whether the @modifies annotation includes \"arguments\"\n     * or any named parameters.\n     ",
      "child_ranges": [
        "(line 744,col 7)-(line 744,col 42)",
        "(line 745,col 7)-(line 745,col 51)",
        "(line 748,col 7)-(line 749,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isIncDec(com.google.javascript.rhino.Node)",
      "begin_line": 753,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 754,col 5)-(line 754,col 27)",
        "(line 755,col 5)-(line 755,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isKnownLocalValue(com.google.javascript.rhino.Node)",
      "begin_line": 762,
      "end_line": 792,
      "comment": "\n   * @return Whether the node is known to be a value that is not a reference\n   *     outside the local scope.\n   ",
      "child_ranges": [
        "(line 764,col 5)-(line 789,col 6)",
        "(line 791,col 5)-(line 791,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Anonymous-26a2c99c-4de2-4453-8724-43990fc91612.apply(com.google.javascript.rhino.Node)",
      "begin_line": 765,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SideEffectPropagationCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 797,
      "end_line": 872,
      "comment": "\n   * Callback that propagates side effect information across call sites.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.SideEffectPropagationCallback.traverseEdge(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation)",
      "begin_line": 799,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 803,col 7)-(line 804,col 52)",
        "(line 806,col 7)-(line 806,col 30)",
        "(line 807,col 7)-(line 810,col 7)",
        "(line 812,col 7)-(line 815,col 7)",
        "(line 817,col 7)-(line 823,col 7)",
        "(line 825,col 7)-(line 868,col 7)",
        "(line 870,col 7)-(line 870,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isCallOrApply(com.google.javascript.rhino.Node)",
      "begin_line": 874,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 875,col 5)-(line 876,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 883,
      "end_line": 1081,
      "comment": "\n   * Keeps track of a function\u0027s known side effects by type and the\n   * list of calls that appear in a function\u0027s body.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "extern"
      ],
      "begin_line": 884,
      "end_line": 884,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsInFunctionBody"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blacklisted"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintedLocals"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "knownLocals"
      ],
      "begin_line": 888,
      "end_line": 888,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pureFunction"
      ],
      "begin_line": 889,
      "end_line": 889,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionThrows"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsGlobalState"
      ],
      "begin_line": 891,
      "end_line": 891,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsThis"
      ],
      "begin_line": 892,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsArguments"
      ],
      "begin_line": 893,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsUnknown"
      ],
      "begin_line": 894,
      "end_line": 894,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsReturn"
      ],
      "begin_line": 895,
      "end_line": 895,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.FunctionInformation(boolean)",
      "begin_line": 897,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 898,col 7)-(line 898,col 27)",
        "(line 899,col 7)-(line 899,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.addTaintedLocalObject(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 905,
      "end_line": 907,
      "comment": "\n     * @param var\n     ",
      "child_ranges": [
        "(line 906,col 7)-(line 906,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.resetLocalVars()",
      "begin_line": 909,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 910,col 7)-(line 910,col 25)",
        "(line 911,col 7)-(line 911,col 27)",
        "(line 912,col 7)-(line 912,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.blacklistLocal(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 918,
      "end_line": 920,
      "comment": "\n     * @param var\n     ",
      "child_ranges": [
        "(line 919,col 7)-(line 919,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mayBePure()",
      "begin_line": 925,
      "end_line": 931,
      "comment": "\n     * @returns false if function known to have side effects.\n     ",
      "child_ranges": [
        "(line 926,col 7)-(line 930,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mayHaveSideEffects()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * @returns false if function known to be pure.\n     ",
      "child_ranges": [
        "(line 937,col 7)-(line 937,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setIsPure()",
      "begin_line": 943,
      "end_line": 946,
      "comment": "\n     * Mark the function as being pure.\n     ",
      "child_ranges": [
        "(line 944,col 7)-(line 944,col 26)",
        "(line 945,col 7)-(line 945,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsGlobalState()",
      "begin_line": 951,
      "end_line": 954,
      "comment": "\n     * Marks the function as having \"modifies globals\" side effects.\n     ",
      "child_ranges": [
        "(line 952,col 7)-(line 952,col 31)",
        "(line 953,col 7)-(line 953,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsThis()",
      "begin_line": 959,
      "end_line": 962,
      "comment": "\n     * Marks the function as having \"modifies this\" side effects.\n     ",
      "child_ranges": [
        "(line 960,col 7)-(line 960,col 24)",
        "(line 961,col 7)-(line 961,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsArguments()",
      "begin_line": 967,
      "end_line": 970,
      "comment": "\n     * Marks the function as having \"modifies arguments\" side effects.\n     ",
      "child_ranges": [
        "(line 968,col 7)-(line 968,col 29)",
        "(line 969,col 7)-(line 969,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setFunctionThrows()",
      "begin_line": 975,
      "end_line": 978,
      "comment": "\n     * Marks the function as having \"throw\" side effects.\n     ",
      "child_ranges": [
        "(line 976,col 7)-(line 976,col 28)",
        "(line 977,col 7)-(line 977,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsUnknown()",
      "begin_line": 984,
      "end_line": 987,
      "comment": "\n     * Marks the function as having \"complex\" side effects that are\n     * not otherwise explicitly tracked.\n     ",
      "child_ranges": [
        "(line 985,col 7)-(line 985,col 27)",
        "(line 986,col 7)-(line 986,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsReturn()",
      "begin_line": 992,
      "end_line": 995,
      "comment": "\n     * Marks the function as having non-local return result.\n     ",
      "child_ranges": [
        "(line 993,col 7)-(line 993,col 26)",
        "(line 994,col 7)-(line 994,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mutatesGlobalState()",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "\n     * Returns true if function mutates global state.\n     ",
      "child_ranges": [
        "(line 1002,col 7)-(line 1002,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mutatesArguments()",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\n     * Returns true if function mutates its arguments.\n     ",
      "child_ranges": [
        "(line 1010,col 7)-(line 1010,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mutatesThis()",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n     * Returns true if function mutates \"this\".\n     ",
      "child_ranges": [
        "(line 1017,col 7)-(line 1017,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.functionThrows()",
      "begin_line": 1023,
      "end_line": 1025,
      "comment": "\n     * Returns true if function has an explicit \"throw\".\n     ",
      "child_ranges": [
        "(line 1024,col 7)-(line 1024,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.checkInvariant()",
      "begin_line": 1031,
      "end_line": 1036,
      "comment": "\n     * Verify internal consistency.  Should be called at the end of\n     * every method that mutates internal state.\n     ",
      "child_ranges": [
        "(line 1032,col 7)-(line 1032,col 62)",
        "(line 1033,col 7)-(line 1035,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.appendCall(com.google.javascript.rhino.Node)",
      "begin_line": 1041,
      "end_line": 1043,
      "comment": "\n     * Add a CALL or NEW node to the list of calls this function makes.\n     ",
      "child_ranges": [
        "(line 1042,col 7)-(line 1042,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.getCallsInFunctionBody()",
      "begin_line": 1048,
      "end_line": 1050,
      "comment": "\n     * Gets the list of CALL and NEW nodes.\n     ",
      "child_ranges": [
        "(line 1049,col 7)-(line 1049,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.toString()",
      "begin_line": 1052,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 7)-(line 1054,col 49)",
        "(line 1055,col 7)-(line 1057,col 7)",
        "(line 1059,col 7)-(line 1061,col 7)",
        "(line 1063,col 7)-(line 1065,col 7)",
        "(line 1067,col 7)-(line 1069,col 7)",
        "(line 1071,col 7)-(line 1073,col 7)",
        "(line 1075,col 7)-(line 1077,col 7)",
        "(line 1079,col 7)-(line 1079,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Driver",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1087,
      "end_line": 1127,
      "comment": "\n   * A compiler pass that constructs a reference graph and drives\n   * the PureFunctionIdentifier across it.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1088,
      "end_line": 1088,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportPath"
      ],
      "begin_line": 1089,
      "end_line": 1089,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useNameReferenceGraph"
      ],
      "begin_line": 1090,
      "end_line": 1090,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Driver.Driver(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean)",
      "begin_line": 1092,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 7)-(line 1094,col 31)",
        "(line 1095,col 7)-(line 1095,col 35)",
        "(line 1096,col 7)-(line 1096,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Driver.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1099,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1101,col 7)-(line 1101,col 51)",
        "(line 1102,col 7)-(line 1111,col 7)",
        "(line 1113,col 7)-(line 1114,col 67)",
        "(line 1115,col 7)-(line 1115,col 52)",
        "(line 1117,col 7)-(line 1125,col 7)"
      ]
    }
  ]
}