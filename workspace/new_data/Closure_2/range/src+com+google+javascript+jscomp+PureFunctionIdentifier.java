{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PureFunctionIdentifier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PureFunctionIdentifier",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 64,
      "end_line": 1123,
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
      "end_line": 365,
      "comment": "\n   * Set no side effect property at pure-function call sites.\n   ",
      "child_ranges": [
        "(line 308,col 5)-(line 364,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionAnalyzer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 372,
      "end_line": 735,
      "comment": "\n   * Gather list of functions, functions with @nosideeffects\n   * annotations, call sites, and functions that may mutate variables\n   * not defined in the local scope.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.FunctionAnalyzer(boolean)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 7)-(line 376,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 379,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 391,col 7)",
        "(line 393,col 7)-(line 393,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 396,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 399,col 7)-(line 401,col 7)",
        "(line 403,col 7)-(line 406,col 7)",
        "(line 408,col 7)-(line 410,col 7)",
        "(line 412,col 7)-(line 412,col 64)",
        "(line 413,col 7)-(line 466,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 469,
      "end_line": 472,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 474,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 476,col 7)-(line 478,col 7)",
        "(line 482,col 7)-(line 483,col 52)",
        "(line 484,col 7)-(line 487,col 7)",
        "(line 489,col 7)-(line 509,col 7)",
        "(line 511,col 7)-(line 511,col 42)",
        "(line 512,col 7)-(line 512,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitAssignmentOrUnaryOperator(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 526,
      "end_line": 577,
      "comment": "\n     * Record information about the side effects caused by an\n     * assignment or mutating unary operator.\n     *\n     * If the operation modifies this or taints global state, mark the\n     * enclosing function as having those side effects.\n     * @param op operation being performed.\n     * @param lhs The store location (name or get) being operated on.\n     * @param rhs The right have value, if any.\n     ",
      "child_ranges": [
        "(line 529,col 7)-(line 576,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitCall(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node)",
      "begin_line": 582,
      "end_line": 596,
      "comment": "\n     * Record information about a call site.\n     ",
      "child_ranges": [
        "(line 584,col 7)-(line 587,col 7)",
        "(line 590,col 7)-(line 593,col 7)",
        "(line 595,col 7)-(line 595,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 601,
      "end_line": 667,
      "comment": "\n     * Record function and check for @nosideeffects annotations.\n     ",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 76)",
        "(line 607,col 7)-(line 607,col 78)",
        "(line 608,col 7)-(line 608,col 54)",
        "(line 610,col 7)-(line 623,col 7)",
        "(line 625,col 7)-(line 625,col 68)",
        "(line 626,col 7)-(line 666,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.isLocalValueType(com.google.javascript.rhino.jstype.JSType, boolean)",
      "begin_line": 672,
      "end_line": 679,
      "comment": "\n     * @return Whether the jstype is something known to be a local value.\n     ",
      "child_ranges": [
        "(line 673,col 7)-(line 673,col 41)",
        "(line 674,col 7)-(line 675,col 78)",
        "(line 678,col 7)-(line 678,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.visitThrow(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation)",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Record that the enclosing function throws.\n     ",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.getJSDocInfoForFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 691,
      "end_line": 703,
      "comment": "\n     * Get the doc info associated with the function.\n     ",
      "child_ranges": [
        "(line 693,col 7)-(line 693,col 43)",
        "(line 694,col 7)-(line 702,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasNoSideEffectsAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 709,
      "end_line": 712,
      "comment": "\n     * Get the value of the @nosideeffects annotation stored in the\n     * doc info.\n     ",
      "child_ranges": [
        "(line 710,col 7)-(line 710,col 42)",
        "(line 711,col 7)-(line 711,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasSideEffectsThisAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 718,
      "end_line": 721,
      "comment": "\n     * Get the value of the @modifies{this} annotation stored in the\n     * doc info.\n     ",
      "child_ranges": [
        "(line 719,col 7)-(line 719,col 42)",
        "(line 720,col 7)-(line 720,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionAnalyzer.hasSideEffectsArgumentsAnnotation(com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 727,
      "end_line": 734,
      "comment": "\n     * @returns Whether the @modifies annotation includes \"arguments\"\n     * or any named parameters.\n     ",
      "child_ranges": [
        "(line 728,col 7)-(line 728,col 42)",
        "(line 729,col 7)-(line 729,col 51)",
        "(line 732,col 7)-(line 733,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isIncDec(com.google.javascript.rhino.Node)",
      "begin_line": 737,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 738,col 5)-(line 738,col 27)",
        "(line 739,col 5)-(line 739,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isKnownLocalValue(com.google.javascript.rhino.Node)",
      "begin_line": 746,
      "end_line": 776,
      "comment": "\n   * @return Whether the node is known to be a value that is not a reference\n   *     outside the local scope.\n   ",
      "child_ranges": [
        "(line 748,col 5)-(line 773,col 6)",
        "(line 775,col 5)-(line 775,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Anonymous-019696e8-cc19-4aad-9ef4-be312a835649.apply(com.google.javascript.rhino.Node)",
      "begin_line": 749,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 770,col 9)",
        "(line 771,col 9)-(line 771,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SideEffectPropagationCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback\u003ccom.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 781,
      "end_line": 843,
      "comment": "\n   * Callback that propagates side effect information across call sites.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.SideEffectPropagationCallback.traverseEdge(com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation, com.google.javascript.rhino.Node, com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation)",
      "begin_line": 783,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 787,col 7)-(line 788,col 52)",
        "(line 790,col 7)-(line 790,col 30)",
        "(line 791,col 7)-(line 794,col 7)",
        "(line 796,col 7)-(line 799,col 7)",
        "(line 801,col 7)-(line 839,col 7)",
        "(line 841,col 7)-(line 841,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.getCallThisObject(com.google.javascript.rhino.Node)",
      "begin_line": 854,
      "end_line": 868,
      "comment": "\n   * Analyze a call site and extract the node that will be act as\n   * \"this\" inside the call, which is either the object part of the\n   * qualified function name, the first argument to the call in the\n   * case of \".call\" and \".apply\" or null if object is not specified\n   * in either of those ways.\n   *\n   * @return node that will act as \"this\" for the call.\n   ",
      "child_ranges": [
        "(line 855,col 5)-(line 855,col 47)",
        "(line 856,col 5)-(line 860,col 5)",
        "(line 862,col 5)-(line 862,col 62)",
        "(line 863,col 5)-(line 867,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.isCallOrApply(com.google.javascript.rhino.Node)",
      "begin_line": 870,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 871,col 5)-(line 871,col 47)",
        "(line 872,col 5)-(line 877,col 5)",
        "(line 878,col 5)-(line 878,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionInformation",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 885,
      "end_line": 1076,
      "comment": "\n   * Keeps track of a function\u0027s known side effects by type and the\n   * list of calls that appear in a function\u0027s body.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "extern"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callsInFunctionBody"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blacklisted"
      ],
      "begin_line": 888,
      "end_line": 888,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintedLocals"
      ],
      "begin_line": 889,
      "end_line": 889,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "knownLocals"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pureFunction"
      ],
      "begin_line": 891,
      "end_line": 891,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionThrows"
      ],
      "begin_line": 892,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsGlobalState"
      ],
      "begin_line": 893,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsThis"
      ],
      "begin_line": 894,
      "end_line": 894,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsArguments"
      ],
      "begin_line": 895,
      "end_line": 895,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsUnknown"
      ],
      "begin_line": 896,
      "end_line": 896,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "taintsReturn"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.FunctionInformation(boolean)",
      "begin_line": 899,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 900,col 7)-(line 900,col 27)",
        "(line 901,col 7)-(line 901,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.addTaintedLocalObject(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * @param var\n     ",
      "child_ranges": [
        "(line 908,col 7)-(line 908,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.resetLocalVars()",
      "begin_line": 911,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 912,col 7)-(line 912,col 25)",
        "(line 913,col 7)-(line 913,col 27)",
        "(line 914,col 7)-(line 914,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.blacklistLocal(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * @param var\n     ",
      "child_ranges": [
        "(line 921,col 7)-(line 921,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mayBePure()",
      "begin_line": 927,
      "end_line": 933,
      "comment": "\n     * @returns false if function known to have side effects.\n     ",
      "child_ranges": [
        "(line 928,col 7)-(line 932,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mayHaveSideEffects()",
      "begin_line": 938,
      "end_line": 940,
      "comment": "\n     * @returns false if function known to be pure.\n     ",
      "child_ranges": [
        "(line 939,col 7)-(line 939,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setIsPure()",
      "begin_line": 945,
      "end_line": 948,
      "comment": "\n     * Mark the function as being pure.\n     ",
      "child_ranges": [
        "(line 946,col 7)-(line 946,col 26)",
        "(line 947,col 7)-(line 947,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsGlobalState()",
      "begin_line": 953,
      "end_line": 956,
      "comment": "\n     * Marks the function as having \"modifies globals\" side effects.\n     ",
      "child_ranges": [
        "(line 954,col 7)-(line 954,col 31)",
        "(line 955,col 7)-(line 955,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsThis()",
      "begin_line": 961,
      "end_line": 964,
      "comment": "\n     * Marks the function as having \"modifies this\" side effects.\n     ",
      "child_ranges": [
        "(line 962,col 7)-(line 962,col 24)",
        "(line 963,col 7)-(line 963,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsArguments()",
      "begin_line": 969,
      "end_line": 972,
      "comment": "\n     * Marks the function as having \"modifies arguments\" side effects.\n     ",
      "child_ranges": [
        "(line 970,col 7)-(line 970,col 29)",
        "(line 971,col 7)-(line 971,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setFunctionThrows()",
      "begin_line": 977,
      "end_line": 980,
      "comment": "\n     * Marks the function as having \"throw\" side effects.\n     ",
      "child_ranges": [
        "(line 978,col 7)-(line 978,col 28)",
        "(line 979,col 7)-(line 979,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsUnknown()",
      "begin_line": 986,
      "end_line": 989,
      "comment": "\n     * Marks the function as having \"complex\" side effects that are\n     * not otherwise explicitly tracked.\n     ",
      "child_ranges": [
        "(line 987,col 7)-(line 987,col 27)",
        "(line 988,col 7)-(line 988,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.setTaintsReturn()",
      "begin_line": 994,
      "end_line": 997,
      "comment": "\n     * Marks the function as having non-local return result.\n     ",
      "child_ranges": [
        "(line 995,col 7)-(line 995,col 26)",
        "(line 996,col 7)-(line 996,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mutatesGlobalState()",
      "begin_line": 1003,
      "end_line": 1006,
      "comment": "\n     * Returns true if function mutates global state.\n     ",
      "child_ranges": [
        "(line 1005,col 7)-(line 1005,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.mutatesThis()",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": "\n     * Returns true if function mutates \"this\".\n     ",
      "child_ranges": [
        "(line 1012,col 7)-(line 1012,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.functionThrows()",
      "begin_line": 1018,
      "end_line": 1020,
      "comment": "\n     * Returns true if function has an explicit \"throw\".\n     ",
      "child_ranges": [
        "(line 1019,col 7)-(line 1019,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.checkInvariant()",
      "begin_line": 1026,
      "end_line": 1031,
      "comment": "\n     * Verify internal consistency.  Should be called at the end of\n     * every method that mutates internal state.\n     ",
      "child_ranges": [
        "(line 1027,col 7)-(line 1027,col 62)",
        "(line 1028,col 7)-(line 1030,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.appendCall(com.google.javascript.rhino.Node)",
      "begin_line": 1036,
      "end_line": 1038,
      "comment": "\n     * Add a CALL or NEW node to the list of calls this function makes.\n     ",
      "child_ranges": [
        "(line 1037,col 7)-(line 1037,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.getCallsInFunctionBody()",
      "begin_line": 1043,
      "end_line": 1045,
      "comment": "\n     * Gets the list of CALL and NEW nodes.\n     ",
      "child_ranges": [
        "(line 1044,col 7)-(line 1044,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.FunctionInformation.toString()",
      "begin_line": 1047,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 7)-(line 1049,col 49)",
        "(line 1050,col 7)-(line 1052,col 7)",
        "(line 1054,col 7)-(line 1056,col 7)",
        "(line 1058,col 7)-(line 1060,col 7)",
        "(line 1062,col 7)-(line 1064,col 7)",
        "(line 1066,col 7)-(line 1068,col 7)",
        "(line 1070,col 7)-(line 1072,col 7)",
        "(line 1074,col 7)-(line 1074,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Driver",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1082,
      "end_line": 1122,
      "comment": "\n   * A compiler pass that constructs a reference graph and drives\n   * the PureFunctionIdentifier across it.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1083,
      "end_line": 1083,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reportPath"
      ],
      "begin_line": 1084,
      "end_line": 1084,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useNameReferenceGraph"
      ],
      "begin_line": 1085,
      "end_line": 1085,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Driver.Driver(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean)",
      "begin_line": 1087,
      "end_line": 1092,
      "comment": "",
      "child_ranges": [
        "(line 1089,col 7)-(line 1089,col 31)",
        "(line 1090,col 7)-(line 1090,col 35)",
        "(line 1091,col 7)-(line 1091,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PureFunctionIdentifier.Driver.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1094,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 7)-(line 1096,col 51)",
        "(line 1097,col 7)-(line 1106,col 7)",
        "(line 1108,col 7)-(line 1109,col 67)",
        "(line 1110,col 7)-(line 1110,col 52)",
        "(line 1112,col 7)-(line 1120,col 7)"
      ]
    }
  ]
}