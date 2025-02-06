{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypeInference.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeInference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope\u003e"
      ],
      "begin_line": 64,
      "end_line": 1580,
      "comment": "\n * Type inference within a script node or a function body, using the data-flow\n * analysis framework.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_LITERAL_UNDEFINED_THIS"
      ],
      "begin_line": 68,
      "end_line": 71,
      "comment": " TODO(johnlenz): We no longer make this check, but we should."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseInterpreter"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntacticScope"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionScope"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bottomScope"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertionFunctionsMap"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownType"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For convenience"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.TypeInference(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.jscomp.Scope, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec\u003e)",
      "begin_line": 84,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 54)",
        "(line 89,col 5)-(line 89,col 29)",
        "(line 90,col 5)-(line 90,col 47)",
        "(line 91,col 5)-(line 91,col 49)",
        "(line 92,col 5)-(line 92,col 66)",
        "(line 94,col 5)-(line 94,col 40)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 97,col 5)-(line 97,col 75)",
        "(line 98,col 5)-(line 98,col 55)",
        "(line 102,col 5)-(line 103,col 64)",
        "(line 104,col 5)-(line 112,col 5)",
        "(line 114,col 5)-(line 115,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferArguments(com.google.javascript.jscomp.Scope)",
      "begin_line": 121,
      "end_line": 164,
      "comment": "\n   * Infers all of a function\u0027s arguments if their types aren\u0027t declared.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 52)",
        "(line 123,col 5)-(line 123,col 64)",
        "(line 124,col 5)-(line 124,col 33)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 130,col 5)-(line 131,col 61)",
        "(line 132,col 5)-(line 163,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.createInitialEstimateLattice()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.createEntryLattice()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 176,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 182,col 5)",
        "(line 184,col 5)-(line 184,col 52)",
        "(line 185,col 5)-(line 185,col 33)",
        "(line 186,col 5)-(line 186,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.branchedFlowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 189,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 50)",
        "(line 198,col 5)-(line 198,col 26)",
        "(line 199,col 5)-(line 199,col 40)",
        "(line 200,col 5)-(line 200,col 48)",
        "(line 202,col 5)-(line 202,col 79)",
        "(line 203,col 5)-(line 203,col 80)",
        "(line 204,col 5)-(line 299,col 5)",
        "(line 300,col 5)-(line 300,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 303,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 451,col 5)",
        "(line 454,col 5)-(line 469,col 5)",
        "(line 471,col 5)-(line 471,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseReturn(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 477,
      "end_line": 492,
      "comment": "\n   * Traverse a return value.\n   ",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 39)",
        "(line 480,col 5)-(line 480,col 38)",
        "(line 481,col 5)-(line 490,col 5)",
        "(line 491,col 5)-(line 491,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 498,
      "end_line": 513,
      "comment": "\n   * Any value can be thrown, so it\u0027s really impossible to determine the type\n   * of a CATCH param. Treat it as the UNKNOWN type.\n   ",
      "child_ranges": [
        "(line 499,col 5)-(line 499,col 42)",
        "(line 500,col 5)-(line 500,col 38)",
        "(line 501,col 5)-(line 501,col 16)",
        "(line 504,col 5)-(line 504,col 41)",
        "(line 505,col 5)-(line 509,col 5)",
        "(line 510,col 5)-(line 510,col 42)",
        "(line 511,col 5)-(line 511,col 25)",
        "(line 512,col 5)-(line 512,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 515,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 34)",
        "(line 517,col 5)-(line 517,col 34)",
        "(line 518,col 5)-(line 518,col 39)",
        "(line 520,col 5)-(line 520,col 39)",
        "(line 521,col 5)-(line 521,col 40)",
        "(line 522,col 5)-(line 522,col 27)",
        "(line 524,col 5)-(line 524,col 63)",
        "(line 525,col 5)-(line 525,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 532,
      "end_line": 575,
      "comment": "\n   * Updates the scope according to the result of a type change, like\n   * an assignment or a type cast.\n   ",
      "child_ranges": [
        "(line 534,col 5)-(line 534,col 43)",
        "(line 535,col 5)-(line 574,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 580,
      "end_line": 628,
      "comment": "\n   * Defines a property if the property has not been defined yet.\n   ",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 57)",
        "(line 582,col 5)-(line 582,col 39)",
        "(line 583,col 5)-(line 583,col 37)",
        "(line 584,col 5)-(line 585,col 49)",
        "(line 586,col 5)-(line 627,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(com.google.javascript.rhino.Node)",
      "begin_line": 637,
      "end_line": 643,
      "comment": "\n   * Defines a declared property if it has not been defined yet.\n   *\n   * This handles the case where a property is declared on an object where\n   * the object type is inferred, and so the object type will not\n   * be known in {@code TypedScopeCreator}.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 639,col 75)",
        "(line 640,col 5)-(line 642,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 649,
      "end_line": 668,
      "comment": "\n   * Declares a property on its owner, if necessary.\n   * @return True if a property was declared.\n   ",
      "child_ranges": [
        "(line 651,col 5)-(line 651,col 57)",
        "(line 652,col 5)-(line 652,col 46)",
        "(line 653,col 5)-(line 666,col 5)",
        "(line 667,col 5)-(line 667,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 670,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 671,col 5)-(line 671,col 35)",
        "(line 672,col 5)-(line 672,col 35)",
        "(line 673,col 5)-(line 673,col 32)",
        "(line 674,col 5)-(line 720,col 5)",
        "(line 721,col 5)-(line 721,col 22)",
        "(line 722,col 5)-(line 722,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 726,
      "end_line": 730,
      "comment": " Traverse each element of the array. ",
      "child_ranges": [
        "(line 727,col 5)-(line 727,col 39)",
        "(line 728,col 5)-(line 728,col 43)",
        "(line 729,col 5)-(line 729,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 732,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 733,col 5)-(line 733,col 32)",
        "(line 734,col 5)-(line 734,col 37)",
        "(line 736,col 5)-(line 738,col 5)",
        "(line 746,col 5)-(line 746,col 50)",
        "(line 747,col 5)-(line 749,col 5)",
        "(line 751,col 5)-(line 752,col 48)",
        "(line 753,col 5)-(line 755,col 5)",
        "(line 757,col 5)-(line 758,col 35)",
        "(line 759,col 5)-(line 789,col 5)",
        "(line 790,col 5)-(line 790,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 793,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 794,col 5)-(line 794,col 34)",
        "(line 795,col 5)-(line 795,col 32)",
        "(line 796,col 5)-(line 796,col 39)",
        "(line 798,col 5)-(line 798,col 39)",
        "(line 799,col 5)-(line 799,col 41)",
        "(line 801,col 5)-(line 801,col 30)",
        "(line 802,col 5)-(line 817,col 5)",
        "(line 818,col 5)-(line 818,col 22)",
        "(line 820,col 5)-(line 822,col 5)",
        "(line 824,col 5)-(line 824,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 827,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 828,col 5)-(line 829,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 832,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 833,col 5)-(line 833,col 39)",
        "(line 834,col 5)-(line 834,col 40)",
        "(line 835,col 5)-(line 835,col 38)",
        "(line 838,col 5)-(line 838,col 39)",
        "(line 841,col 5)-(line 843,col 36)",
        "(line 844,col 5)-(line 846,col 37)",
        "(line 849,col 5)-(line 849,col 57)",
        "(line 852,col 5)-(line 852,col 59)",
        "(line 855,col 5)-(line 855,col 43)",
        "(line 856,col 5)-(line 856,col 45)",
        "(line 857,col 5)-(line 861,col 5)",
        "(line 863,col 5)-(line 863,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 866,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 867,col 5)-(line 867,col 39)",
        "(line 869,col 5)-(line 869,col 34)",
        "(line 870,col 5)-(line 870,col 73)",
        "(line 871,col 5)-(line 878,col 5)",
        "(line 880,col 5)-(line 880,col 50)",
        "(line 881,col 5)-(line 881,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)",
      "begin_line": 884,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 886,col 5)-(line 886,col 41)",
        "(line 887,col 5)-(line 887,col 37)",
        "(line 888,col 5)-(line 889,col 59)",
        "(line 890,col 5)-(line 892,col 5)",
        "(line 893,col 5)-(line 893,col 75)",
        "(line 894,col 5)-(line 896,col 5)",
        "(line 897,col 5)-(line 898,col 28)",
        "(line 899,col 5)-(line 899,col 62)",
        "(line 901,col 5)-(line 901,col 20)",
        "(line 903,col 5)-(line 916,col 5)",
        "(line 918,col 5)-(line 918,col 33)",
        "(line 919,col 5)-(line 919,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 922,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 926,col 5)",
        "(line 928,col 5)-(line 928,col 41)",
        "(line 929,col 5)-(line 934,col 5)",
        "(line 935,col 5)-(line 935,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 963,
      "end_line": 970,
      "comment": "\n   * We only do forward type inference. We do not do full backwards\n   * type inference.\n   *\n   * In other words, if we have,\n   * \u003ccode\u003e\n   * var x \u003d f();\n   * g(x);\n   * \u003c/code\u003e\n   * a forward type-inference engine would try to figure out the type\n   * of \"x\" from the return type of \"f\". A backwards type-inference engine\n   * would try to figure out the type of \"x\" from the parameter type of \"g\".\n   *\n   * However, there are a few special syntactic forms where we do some\n   * some half-assed backwards type-inference, because programmers\n   * expect it in this day and age. To take an example from Java,\n   * \u003ccode\u003e\n   * List\u003cString\u003e x \u003d Lists.newArrayList();\n   * \u003c/code\u003e\n   * The Java compiler will be able to infer the generic type of the List\n   * returned by newArrayList().\n   *\n   * In much the same way, we do some special-case backwards inference for\n   * JS. Those cases are enumerated here.\n   ",
      "child_ranges": [
        "(line 964,col 5)-(line 964,col 66)",
        "(line 965,col 5)-(line 967,col 5)",
        "(line 968,col 5)-(line 968,col 38)",
        "(line 969,col 5)-(line 969,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateBind(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 976,
      "end_line": 993,
      "comment": "\n   * When \"bind\" is called on a function, we infer the type of the returned\n   * \"bound\" function by looking at the number of parameters in the call site.\n   ",
      "child_ranges": [
        "(line 977,col 5)-(line 978,col 69)",
        "(line 979,col 5)-(line 981,col 5)",
        "(line 983,col 5)-(line 984,col 62)",
        "(line 985,col 5)-(line 987,col 5)",
        "(line 989,col 5)-(line 992,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 999,
      "end_line": 1028,
      "comment": "\n   * For functions with function parameters, type inference will set the type of\n   * a function literal argument from the function parameter type.\n   ",
      "child_ranges": [
        "(line 1000,col 5)-(line 1000,col 14)",
        "(line 1001,col 5)-(line 1001,col 39)",
        "(line 1002,col 5)-(line 1027,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)",
      "begin_line": 1030,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 5)-(line 1034,col 5)",
        "(line 1036,col 5)-(line 1036,col 72)",
        "(line 1038,col 5)-(line 1038,col 43)",
        "(line 1039,col 5)-(line 1045,col 5)",
        "(line 1047,col 5)-(line 1052,col 5)",
        "(line 1053,col 5)-(line 1053,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1056,
      "end_line": 1108,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 5)-(line 1107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e, java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1110,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 5)-(line 1115,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e, java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1118,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 5)-(line 1136,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.resolvedTemplateType(java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1139,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1141,col 5)-(line 1141,col 40)",
        "(line 1142,col 5)-(line 1149,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TemplateTypeReplacer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ModificationVisitor"
      ],
      "begin_line": 1152,
      "end_line": 1171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacements"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 1154,
      "end_line": 1154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "madeChanges"
      ],
      "begin_line": 1155,
      "end_line": 1155,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.TemplateTypeReplacer.TemplateTypeReplacer(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1157,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 7)-(line 1159,col 22)",
        "(line 1160,col 7)-(line 1160,col 31)",
        "(line 1161,col 7)-(line 1161,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.TemplateTypeReplacer.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 1164,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 7)-(line 1166,col 25)",
        "(line 1167,col 7)-(line 1167,col 50)",
        "(line 1168,col 7)-(line 1169,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1178,
      "end_line": 1202,
      "comment": "\n   * For functions with function(this: T, ...) and T as parameters, type\n   * inference will set the type of this on a function literal argument to the\n   * the actual type of T.\n   ",
      "child_ranges": [
        "(line 1180,col 5)-(line 1182,col 5)",
        "(line 1185,col 5)-(line 1186,col 19)",
        "(line 1190,col 5)-(line 1191,col 28)",
        "(line 1192,col 5)-(line 1192,col 40)",
        "(line 1194,col 5)-(line 1195,col 31)",
        "(line 1196,col 5)-(line 1196,col 50)",
        "(line 1198,col 5)-(line 1198,col 44)",
        "(line 1199,col 5)-(line 1199,col 51)",
        "(line 1201,col 5)-(line 1201,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseNew(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1204,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1205,col 5)-(line 1205,col 39)",
        "(line 1207,col 5)-(line 1207,col 41)",
        "(line 1208,col 5)-(line 1208,col 53)",
        "(line 1209,col 5)-(line 1209,col 23)",
        "(line 1210,col 5)-(line 1227,col 5)",
        "(line 1228,col 5)-(line 1228,col 22)",
        "(line 1229,col 5)-(line 1229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 5)-(line 1233,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1236,
      "end_line": 1241,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 5)-(line 1239,col 5)",
        "(line 1240,col 5)-(line 1240,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseGetElem(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1243,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1244,col 5)-(line 1244,col 39)",
        "(line 1245,col 5)-(line 1246,col 69)",
        "(line 1247,col 5)-(line 1252,col 5)",
        "(line 1253,col 5)-(line 1253,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1256,
      "end_line": 1265,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 5)-(line 1257,col 37)",
        "(line 1258,col 5)-(line 1258,col 37)",
        "(line 1259,col 5)-(line 1259,col 39)",
        "(line 1261,col 5)-(line 1263,col 66)",
        "(line 1264,col 5)-(line 1264,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1281,
      "end_line": 1288,
      "comment": "\n   * Suppose X is an object with inferred properties.\n   * Suppose also that X is used in a way where it would only type-check\n   * correctly if some of those properties are widened.\n   * Then we should be polite and automatically widen X\u0027s properties for him.\n   *\n   * For a concrete example, consider:\n   * param x {{prop: (number|undefined)}}\n   * function f(x) {}\n   * f({});\n   *\n   * If we give the anonymous object an inferred property of (number|undefined),\n   * then this code will type-check appropriately.\n   ",
      "child_ranges": [
        "(line 1283,col 5)-(line 1285,col 5)",
        "(line 1287,col 5)-(line 1287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1294,
      "end_line": 1303,
      "comment": "\n   * If we access a property of a symbol, then that symbol is not\n   * null or undefined.\n   ",
      "child_ranges": [
        "(line 1295,col 5)-(line 1301,col 5)",
        "(line 1302,col 5)-(line 1302,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1305,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1313,col 5)-(line 1313,col 31)",
        "(line 1314,col 5)-(line 1314,col 38)",
        "(line 1317,col 5)-(line 1317,col 48)",
        "(line 1318,col 5)-(line 1318,col 58)",
        "(line 1319,col 5)-(line 1328,col 5)",
        "(line 1330,col 5)-(line 1335,col 5)",
        "(line 1337,col 5)-(line 1344,col 5)",
        "(line 1346,col 5)-(line 1354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1357,
      "end_line": 1359,
      "comment": "",
      "child_ranges": [
        "(line 1358,col 5)-(line 1358,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 1361,
      "end_line": 1423,
      "comment": "",
      "child_ranges": [
        "(line 1363,col 5)-(line 1363,col 34)",
        "(line 1364,col 5)-(line 1364,col 34)",
        "(line 1367,col 5)-(line 1369,col 42)",
        "(line 1370,col 5)-(line 1370,col 39)",
        "(line 1374,col 5)-(line 1377,col 23)",
        "(line 1380,col 5)-(line 1382,col 54)",
        "(line 1383,col 5)-(line 1383,col 41)",
        "(line 1385,col 5)-(line 1385,col 16)",
        "(line 1386,col 5)-(line 1386,col 32)",
        "(line 1387,col 5)-(line 1419,col 5)",
        "(line 1420,col 5)-(line 1420,col 22)",
        "(line 1422,col 5)-(line 1422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1425,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1427,col 5)-(line 1437,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair, com.google.javascript.jscomp.TypeInference.BooleanOutcomePair, boolean)",
      "begin_line": 1445,
      "end_line": 1452,
      "comment": "\n   * Infers the boolean outcome pair that can be taken by a\n   * short-circuiting binary operation ({@code \u0026\u0026} or {@code ||}).\n   * @see #getBooleanOutcomes(BooleanLiteralSet, BooleanLiteralSet, boolean)\n   ",
      "child_ranges": [
        "(line 1447,col 5)-(line 1451,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)",
      "begin_line": 1466,
      "end_line": 1469,
      "comment": "\n   * Infers the boolean literal set that can be taken by a\n   * short-circuiting binary operation ({@code \u0026\u0026} or {@code ||}).\n   * @param left the set of possible {@code ToBoolean} predicate results for\n   *    the expression on the left side of the operator\n   * @param right the set of possible {@code ToBoolean} predicate results for\n   *    the expression on the right side of the operator\n   * @param condition the left side {@code ToBoolean} predicate result that\n   *    causes the right side to get evaluated (i.e. not short-circuited)\n   * @return a set of possible {@code ToBoolean} predicate results for the\n   *    entire expression\n   ",
      "child_ranges": [
        "(line 1468,col 5)-(line 1468,col 77)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanOutcomePair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1477,
      "end_line": 1527,
      "comment": "\n   * When traversing short-circuiting binary operations, we need to keep track\n   * of two sets of boolean literals:\n   * 1. {@code toBooleanOutcomes}: boolean literals as converted from any types,\n   * 2. {@code booleanValues}: boolean literals from just boolean types.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "toBooleanOutcomes"
      ],
      "begin_line": 1478,
      "end_line": 1478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "booleanValues"
      ],
      "begin_line": 1479,
      "end_line": 1479,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leftScope"
      ],
      "begin_line": 1482,
      "end_line": 1482,
      "comment": " The scope if only half of the expression executed, when applicable."
    },
    {
      "type": "field",
      "varNames": [
        "rightScope"
      ],
      "begin_line": 1485,
      "end_line": 1485,
      "comment": " The scope when the whole expression executed."
    },
    {
      "type": "field",
      "varNames": [
        "joinedScope"
      ],
      "begin_line": 1488,
      "end_line": 1488,
      "comment": " The scope when we don\u0027t know how much of the expression is executed."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.BooleanOutcomePair(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1490,
      "end_line": 1497,
      "comment": "",
      "child_ranges": [
        "(line 1493,col 7)-(line 1493,col 49)",
        "(line 1494,col 7)-(line 1494,col 41)",
        "(line 1495,col 7)-(line 1495,col 33)",
        "(line 1496,col 7)-(line 1496,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.getJoinedFlowScope()",
      "begin_line": 1503,
      "end_line": 1512,
      "comment": "\n     * Gets the safe estimated scope without knowing if all of the\n     * subexpressions will be evaluated.\n     ",
      "child_ranges": [
        "(line 1504,col 7)-(line 1510,col 7)",
        "(line 1511,col 7)-(line 1511,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.getOutcomeFlowScope(int, boolean)",
      "begin_line": 1518,
      "end_line": 1526,
      "comment": "\n     * Gets the outcome scope if we do know the outcome of the entire\n     * expression.\n     ",
      "child_ranges": [
        "(line 1519,col 7)-(line 1525,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1529,
      "end_line": 1539,
      "comment": "",
      "child_ranges": [
        "(line 1531,col 5)-(line 1534,col 5)",
        "(line 1535,col 5)-(line 1538,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1541,
      "end_line": 1552,
      "comment": "",
      "child_ranges": [
        "(line 1543,col 5)-(line 1543,col 48)",
        "(line 1544,col 5)-(line 1544,col 42)",
        "(line 1545,col 5)-(line 1547,col 5)",
        "(line 1548,col 5)-(line 1550,col 5)",
        "(line 1551,col 5)-(line 1551,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.isUnflowable(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1554,
      "end_line": 1558,
      "comment": "",
      "child_ranges": [
        "(line 1555,col 5)-(line 1557,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 1564,
      "end_line": 1575,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 1565,col 5)-(line 1565,col 34)",
        "(line 1566,col 5)-(line 1574,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "",
      "child_ranges": [
        "(line 1578,col 5)-(line 1578,col 42)"
      ]
    }
  ]
}