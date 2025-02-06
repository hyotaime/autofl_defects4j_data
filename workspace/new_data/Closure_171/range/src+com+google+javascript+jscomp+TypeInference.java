{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/TypeInference.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeInference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DataFlowAnalysis.BranchedForwardDataFlowAnalysis\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope\u003e"
      ],
      "begin_line": 65,
      "end_line": 1584,
      "comment": "\n * Type inference within a script node or a function body, using the data-flow\n * analysis framework.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "FUNCTION_LITERAL_UNDEFINED_THIS"
      ],
      "begin_line": 69,
      "end_line": 72,
      "comment": " TODO(johnlenz): We no longer make this check, but we should."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseInterpreter"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "syntacticScope"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionScope"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bottomScope"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertionFunctionsMap"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownType"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For convenience"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.TypeInference(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.ControlFlowGraph\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.jscomp.Scope, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec\u003e)",
      "begin_line": 85,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 54)",
        "(line 90,col 5)-(line 90,col 29)",
        "(line 91,col 5)-(line 91,col 47)",
        "(line 92,col 5)-(line 92,col 49)",
        "(line 93,col 5)-(line 93,col 66)",
        "(line 95,col 5)-(line 95,col 40)",
        "(line 96,col 5)-(line 96,col 34)",
        "(line 98,col 5)-(line 98,col 75)",
        "(line 99,col 5)-(line 99,col 55)",
        "(line 103,col 5)-(line 104,col 64)",
        "(line 105,col 5)-(line 113,col 5)",
        "(line 115,col 5)-(line 116,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferArguments(com.google.javascript.jscomp.Scope)",
      "begin_line": 122,
      "end_line": 165,
      "comment": "\n   * Infers all of a function\u0027s arguments if their types aren\u0027t declared.\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 52)",
        "(line 124,col 5)-(line 124,col 64)",
        "(line 125,col 5)-(line 125,col 33)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 132,col 61)",
        "(line 133,col 5)-(line 164,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.createInitialEstimateLattice()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.createEntryLattice()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 177,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 183,col 5)",
        "(line 185,col 5)-(line 185,col 52)",
        "(line 186,col 5)-(line 186,col 33)",
        "(line 187,col 5)-(line 187,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.branchedFlowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 190,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 50)",
        "(line 199,col 5)-(line 199,col 26)",
        "(line 200,col 5)-(line 200,col 40)",
        "(line 201,col 5)-(line 201,col 48)",
        "(line 203,col 5)-(line 203,col 79)",
        "(line 204,col 5)-(line 204,col 80)",
        "(line 205,col 5)-(line 301,col 5)",
        "(line 302,col 5)-(line 302,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 305,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 457,col 5)",
        "(line 459,col 5)-(line 459,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseReturn(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 465,
      "end_line": 480,
      "comment": "\n   * Traverse a return value.\n   ",
      "child_ranges": [
        "(line 466,col 5)-(line 466,col 39)",
        "(line 468,col 5)-(line 468,col 38)",
        "(line 469,col 5)-(line 478,col 5)",
        "(line 479,col 5)-(line 479,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 486,
      "end_line": 500,
      "comment": "\n   * Any value can be thrown, so it\u0027s really impossible to determine the type\n   * of a CATCH param. Treat it as the UNKNOWN type.\n   ",
      "child_ranges": [
        "(line 487,col 5)-(line 487,col 42)",
        "(line 488,col 5)-(line 488,col 16)",
        "(line 491,col 5)-(line 491,col 41)",
        "(line 492,col 5)-(line 496,col 5)",
        "(line 497,col 5)-(line 497,col 42)",
        "(line 498,col 5)-(line 498,col 25)",
        "(line 499,col 5)-(line 499,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 502,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 503,col 5)-(line 503,col 34)",
        "(line 504,col 5)-(line 504,col 34)",
        "(line 505,col 5)-(line 505,col 39)",
        "(line 507,col 5)-(line 507,col 39)",
        "(line 508,col 5)-(line 508,col 40)",
        "(line 509,col 5)-(line 509,col 27)",
        "(line 511,col 5)-(line 511,col 63)",
        "(line 512,col 5)-(line 512,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 519,
      "end_line": 562,
      "comment": "\n   * Updates the scope according to the result of a type change, like\n   * an assignment or a type cast.\n   ",
      "child_ranges": [
        "(line 521,col 5)-(line 521,col 43)",
        "(line 522,col 5)-(line 561,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 567,
      "end_line": 615,
      "comment": "\n   * Defines a property if the property has not been defined yet.\n   ",
      "child_ranges": [
        "(line 568,col 5)-(line 568,col 57)",
        "(line 569,col 5)-(line 569,col 39)",
        "(line 570,col 5)-(line 570,col 37)",
        "(line 571,col 5)-(line 572,col 49)",
        "(line 573,col 5)-(line 614,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(com.google.javascript.rhino.Node)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n   * Defines a declared property if it has not been defined yet.\n   *\n   * This handles the case where a property is declared on an object where\n   * the object type is inferred, and so the object type will not\n   * be known in {@code TypedScopeCreator}.\n   ",
      "child_ranges": [
        "(line 625,col 5)-(line 626,col 75)",
        "(line 627,col 5)-(line 629,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)",
      "begin_line": 636,
      "end_line": 655,
      "comment": "\n   * Declares a property on its owner, if necessary.\n   * @return True if a property was declared.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 57)",
        "(line 639,col 5)-(line 639,col 46)",
        "(line 640,col 5)-(line 653,col 5)",
        "(line 654,col 5)-(line 654,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 657,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 35)",
        "(line 659,col 5)-(line 659,col 35)",
        "(line 660,col 5)-(line 660,col 32)",
        "(line 661,col 5)-(line 707,col 5)",
        "(line 708,col 5)-(line 708,col 22)",
        "(line 709,col 5)-(line 709,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 713,
      "end_line": 717,
      "comment": " Traverse each element of the array. ",
      "child_ranges": [
        "(line 714,col 5)-(line 714,col 39)",
        "(line 715,col 5)-(line 715,col 43)",
        "(line 716,col 5)-(line 716,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 719,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 720,col 5)-(line 720,col 32)",
        "(line 721,col 5)-(line 721,col 37)",
        "(line 723,col 5)-(line 725,col 5)",
        "(line 730,col 5)-(line 730,col 50)",
        "(line 731,col 5)-(line 733,col 5)",
        "(line 734,col 5)-(line 735,col 48)",
        "(line 736,col 5)-(line 738,col 5)",
        "(line 740,col 5)-(line 741,col 35)",
        "(line 742,col 5)-(line 771,col 5)",
        "(line 772,col 5)-(line 772,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 775,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 776,col 5)-(line 776,col 34)",
        "(line 777,col 5)-(line 777,col 32)",
        "(line 778,col 5)-(line 778,col 39)",
        "(line 780,col 5)-(line 780,col 39)",
        "(line 781,col 5)-(line 781,col 41)",
        "(line 783,col 5)-(line 783,col 30)",
        "(line 784,col 5)-(line 799,col 5)",
        "(line 800,col 5)-(line 800,col 22)",
        "(line 802,col 5)-(line 804,col 5)",
        "(line 806,col 5)-(line 806,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 809,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 810,col 5)-(line 811,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 814,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 815,col 5)-(line 815,col 39)",
        "(line 816,col 5)-(line 816,col 40)",
        "(line 817,col 5)-(line 817,col 38)",
        "(line 820,col 5)-(line 820,col 39)",
        "(line 823,col 5)-(line 825,col 36)",
        "(line 826,col 5)-(line 828,col 37)",
        "(line 831,col 5)-(line 831,col 57)",
        "(line 834,col 5)-(line 834,col 59)",
        "(line 837,col 5)-(line 837,col 43)",
        "(line 838,col 5)-(line 838,col 45)",
        "(line 839,col 5)-(line 843,col 5)",
        "(line 845,col 5)-(line 845,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseCall(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 848,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 849,col 5)-(line 849,col 39)",
        "(line 851,col 5)-(line 851,col 34)",
        "(line 852,col 5)-(line 852,col 73)",
        "(line 853,col 5)-(line 860,col 5)",
        "(line 862,col 5)-(line 862,col 50)",
        "(line 863,col 5)-(line 863,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)",
      "begin_line": 866,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 868,col 5)-(line 868,col 41)",
        "(line 869,col 5)-(line 869,col 37)",
        "(line 870,col 5)-(line 871,col 59)",
        "(line 872,col 5)-(line 874,col 5)",
        "(line 875,col 5)-(line 875,col 75)",
        "(line 876,col 5)-(line 878,col 5)",
        "(line 879,col 5)-(line 880,col 28)",
        "(line 881,col 5)-(line 881,col 62)",
        "(line 883,col 5)-(line 883,col 20)",
        "(line 885,col 5)-(line 898,col 5)",
        "(line 900,col 5)-(line 900,col 33)",
        "(line 901,col 5)-(line 901,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 904,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 905,col 5)-(line 908,col 5)",
        "(line 910,col 5)-(line 910,col 41)",
        "(line 911,col 5)-(line 916,col 5)",
        "(line 917,col 5)-(line 917,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 945,
      "end_line": 952,
      "comment": "\n   * We only do forward type inference. We do not do full backwards\n   * type inference.\n   *\n   * In other words, if we have,\n   * \u003ccode\u003e\n   * var x \u003d f();\n   * g(x);\n   * \u003c/code\u003e\n   * a forward type-inference engine would try to figure out the type\n   * of \"x\" from the return type of \"f\". A backwards type-inference engine\n   * would try to figure out the type of \"x\" from the parameter type of \"g\".\n   *\n   * However, there are a few special syntactic forms where we do some\n   * some half-assed backwards type-inference, because programmers\n   * expect it in this day and age. To take an example from Java,\n   * \u003ccode\u003e\n   * List\u003cString\u003e x \u003d Lists.newArrayList();\n   * \u003c/code\u003e\n   * The Java compiler will be able to infer the generic type of the List\n   * returned by newArrayList().\n   *\n   * In much the same way, we do some special-case backwards inference for\n   * JS. Those cases are enumerated here.\n   ",
      "child_ranges": [
        "(line 946,col 5)-(line 946,col 66)",
        "(line 947,col 5)-(line 949,col 5)",
        "(line 950,col 5)-(line 950,col 38)",
        "(line 951,col 5)-(line 951,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateBind(com.google.javascript.rhino.Node)",
      "begin_line": 958,
      "end_line": 975,
      "comment": "\n   * When \"bind\" is called on a function, we infer the type of the returned\n   * \"bound\" function by looking at the number of parameters in the call site.\n   ",
      "child_ranges": [
        "(line 959,col 5)-(line 960,col 69)",
        "(line 961,col 5)-(line 963,col 5)",
        "(line 965,col 5)-(line 966,col 62)",
        "(line 967,col 5)-(line 969,col 5)",
        "(line 971,col 5)-(line 974,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 981,
      "end_line": 1010,
      "comment": "\n   * For functions with function parameters, type inference will set the type of\n   * a function literal argument from the function parameter type.\n   ",
      "child_ranges": [
        "(line 982,col 5)-(line 982,col 14)",
        "(line 983,col 5)-(line 983,col 39)",
        "(line 984,col 5)-(line 1009,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)",
      "begin_line": 1012,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 5)-(line 1016,col 5)",
        "(line 1018,col 5)-(line 1018,col 72)",
        "(line 1020,col 5)-(line 1020,col 43)",
        "(line 1021,col 5)-(line 1027,col 5)",
        "(line 1029,col 5)-(line 1034,col 5)",
        "(line 1035,col 5)-(line 1035,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1038,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1042,col 5)-(line 1093,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e, java.lang.Iterable\u003ccom.google.javascript.rhino.Node\u003e, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1096,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 5)-(line 1101,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e, java.util.Iterator\u003ccom.google.javascript.rhino.Node\u003e, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1104,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1108,col 5)-(line 1122,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.resolvedTemplateType(java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1125,
      "end_line": 1136,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 5)-(line 1127,col 40)",
        "(line 1128,col 5)-(line 1135,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TemplateTypeReplacer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.ModificationVisitor"
      ],
      "begin_line": 1138,
      "end_line": 1157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "replacements"
      ],
      "begin_line": 1139,
      "end_line": 1139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 1140,
      "end_line": 1140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "madeChanges"
      ],
      "begin_line": 1141,
      "end_line": 1141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.TemplateTypeReplacer.TemplateTypeReplacer(com.google.javascript.rhino.jstype.JSTypeRegistry, java.util.Map\u003ccom.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 1143,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1145,col 7)-(line 1145,col 22)",
        "(line 1146,col 7)-(line 1146,col 31)",
        "(line 1147,col 7)-(line 1147,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.TemplateTypeReplacer.caseTemplateType(com.google.javascript.rhino.jstype.TemplateType)",
      "begin_line": 1150,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 7)-(line 1152,col 25)",
        "(line 1153,col 7)-(line 1153,col 50)",
        "(line 1154,col 7)-(line 1155,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)",
      "begin_line": 1164,
      "end_line": 1188,
      "comment": "\n   * For functions with function(this: T, ...) and T as parameters, type\n   * inference will set the type of this on a function literal argument to the\n   * the actual type of T.\n   ",
      "child_ranges": [
        "(line 1166,col 5)-(line 1168,col 5)",
        "(line 1171,col 5)-(line 1172,col 19)",
        "(line 1176,col 5)-(line 1177,col 28)",
        "(line 1178,col 5)-(line 1178,col 40)",
        "(line 1180,col 5)-(line 1181,col 31)",
        "(line 1182,col 5)-(line 1182,col 50)",
        "(line 1184,col 5)-(line 1184,col 44)",
        "(line 1185,col 5)-(line 1185,col 51)",
        "(line 1187,col 5)-(line 1187,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseNew(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1190,
      "end_line": 1226,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 5)-(line 1191,col 39)",
        "(line 1193,col 5)-(line 1193,col 41)",
        "(line 1194,col 5)-(line 1194,col 53)",
        "(line 1195,col 5)-(line 1195,col 23)",
        "(line 1196,col 5)-(line 1223,col 5)",
        "(line 1224,col 5)-(line 1224,col 22)",
        "(line 1225,col 5)-(line 1225,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1228,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1229,col 5)-(line 1229,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1232,
      "end_line": 1237,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 5)-(line 1235,col 5)",
        "(line 1236,col 5)-(line 1236,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseGetElem(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1239,
      "end_line": 1247,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1240,col 39)",
        "(line 1241,col 5)-(line 1241,col 78)",
        "(line 1242,col 5)-(line 1242,col 56)",
        "(line 1243,col 5)-(line 1245,col 5)",
        "(line 1246,col 5)-(line 1246,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1249,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1250,col 5)-(line 1250,col 37)",
        "(line 1251,col 5)-(line 1251,col 37)",
        "(line 1252,col 5)-(line 1252,col 39)",
        "(line 1254,col 5)-(line 1256,col 66)",
        "(line 1257,col 5)-(line 1257,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1274,
      "end_line": 1281,
      "comment": "\n   * Suppose X is an object with inferred properties.\n   * Suppose also that X is used in a way where it would only type-check\n   * correctly if some of those properties are widened.\n   * Then we should be polite and automatically widen X\u0027s properties for him.\n   *\n   * For a concrete example, consider:\n   * param x {{prop: (number|undefined)}}\n   * function f(x) {}\n   * f({});\n   *\n   * If we give the anonymous object an inferred property of (number|undefined),\n   * then this code will type-check appropriately.\n   ",
      "child_ranges": [
        "(line 1276,col 5)-(line 1278,col 5)",
        "(line 1280,col 5)-(line 1280,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1287,
      "end_line": 1296,
      "comment": "\n   * If we access a property of a symbol, then that symbol is not\n   * null or undefined.\n   ",
      "child_ranges": [
        "(line 1288,col 5)-(line 1294,col 5)",
        "(line 1295,col 5)-(line 1295,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1298,
      "end_line": 1359,
      "comment": "",
      "child_ranges": [
        "(line 1306,col 5)-(line 1306,col 31)",
        "(line 1307,col 5)-(line 1307,col 38)",
        "(line 1310,col 5)-(line 1310,col 48)",
        "(line 1311,col 5)-(line 1311,col 58)",
        "(line 1312,col 5)-(line 1321,col 5)",
        "(line 1323,col 5)-(line 1328,col 5)",
        "(line 1330,col 5)-(line 1339,col 5)",
        "(line 1341,col 5)-(line 1348,col 5)",
        "(line 1350,col 5)-(line 1358,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1361,
      "end_line": 1363,
      "comment": "",
      "child_ranges": [
        "(line 1362,col 5)-(line 1362,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)",
      "begin_line": 1365,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1367,col 5)-(line 1367,col 34)",
        "(line 1368,col 5)-(line 1368,col 34)",
        "(line 1371,col 5)-(line 1373,col 42)",
        "(line 1374,col 5)-(line 1374,col 39)",
        "(line 1378,col 5)-(line 1381,col 23)",
        "(line 1384,col 5)-(line 1386,col 54)",
        "(line 1387,col 5)-(line 1387,col 41)",
        "(line 1389,col 5)-(line 1389,col 16)",
        "(line 1390,col 5)-(line 1390,col 32)",
        "(line 1391,col 5)-(line 1423,col 5)",
        "(line 1424,col 5)-(line 1424,col 22)",
        "(line 1426,col 5)-(line 1426,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1429,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1431,col 5)-(line 1441,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair, com.google.javascript.jscomp.TypeInference.BooleanOutcomePair, boolean)",
      "begin_line": 1449,
      "end_line": 1456,
      "comment": "\n   * Infers the boolean outcome pair that can be taken by a\n   * short-circuiting binary operation ({@code \u0026\u0026} or {@code ||}).\n   * @see #getBooleanOutcomes(BooleanLiteralSet, BooleanLiteralSet, boolean)\n   ",
      "child_ranges": [
        "(line 1451,col 5)-(line 1455,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)",
      "begin_line": 1470,
      "end_line": 1473,
      "comment": "\n   * Infers the boolean literal set that can be taken by a\n   * short-circuiting binary operation ({@code \u0026\u0026} or {@code ||}).\n   * @param left the set of possible {@code ToBoolean} predicate results for\n   *    the expression on the left side of the operator\n   * @param right the set of possible {@code ToBoolean} predicate results for\n   *    the expression on the right side of the operator\n   * @param condition the left side {@code ToBoolean} predicate result that\n   *    causes the right side to get evaluated (i.e. not short-circuited)\n   * @return a set of possible {@code ToBoolean} predicate results for the\n   *    entire expression\n   ",
      "child_ranges": [
        "(line 1472,col 5)-(line 1472,col 77)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanOutcomePair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1481,
      "end_line": 1531,
      "comment": "\n   * When traversing short-circuiting binary operations, we need to keep track\n   * of two sets of boolean literals:\n   * 1. {@code toBooleanOutcomes}: boolean literals as converted from any types,\n   * 2. {@code booleanValues}: boolean literals from just boolean types.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "toBooleanOutcomes"
      ],
      "begin_line": 1482,
      "end_line": 1482,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "booleanValues"
      ],
      "begin_line": 1483,
      "end_line": 1483,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "leftScope"
      ],
      "begin_line": 1486,
      "end_line": 1486,
      "comment": " The scope if only half of the expression executed, when applicable."
    },
    {
      "type": "field",
      "varNames": [
        "rightScope"
      ],
      "begin_line": 1489,
      "end_line": 1489,
      "comment": " The scope when the whole expression executed."
    },
    {
      "type": "field",
      "varNames": [
        "joinedScope"
      ],
      "begin_line": 1492,
      "end_line": 1492,
      "comment": " The scope when we don\u0027t know how much of the expression is executed."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.BooleanOutcomePair(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1494,
      "end_line": 1501,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 7)-(line 1497,col 49)",
        "(line 1498,col 7)-(line 1498,col 41)",
        "(line 1499,col 7)-(line 1499,col 33)",
        "(line 1500,col 7)-(line 1500,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.getJoinedFlowScope()",
      "begin_line": 1507,
      "end_line": 1516,
      "comment": "\n     * Gets the safe estimated scope without knowing if all of the\n     * subexpressions will be evaluated.\n     ",
      "child_ranges": [
        "(line 1508,col 7)-(line 1514,col 7)",
        "(line 1515,col 7)-(line 1515,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.BooleanOutcomePair.getOutcomeFlowScope(int, boolean)",
      "begin_line": 1522,
      "end_line": 1530,
      "comment": "\n     * Gets the outcome scope if we do know the outcome of the entire\n     * expression.\n     ",
      "child_ranges": [
        "(line 1523,col 7)-(line 1529,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 1533,
      "end_line": 1543,
      "comment": "",
      "child_ranges": [
        "(line 1535,col 5)-(line 1538,col 5)",
        "(line 1539,col 5)-(line 1542,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 1545,
      "end_line": 1556,
      "comment": "",
      "child_ranges": [
        "(line 1547,col 5)-(line 1547,col 48)",
        "(line 1548,col 5)-(line 1548,col 42)",
        "(line 1549,col 5)-(line 1551,col 5)",
        "(line 1552,col 5)-(line 1554,col 5)",
        "(line 1555,col 5)-(line 1555,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.isUnflowable(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 1558,
      "end_line": 1562,
      "comment": "",
      "child_ranges": [
        "(line 1559,col 5)-(line 1561,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 1568,
      "end_line": 1579,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 1569,col 5)-(line 1569,col 34)",
        "(line 1570,col 5)-(line 1578,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInference.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)",
      "begin_line": 1581,
      "end_line": 1583,
      "comment": "",
      "child_ranges": [
        "(line 1582,col 5)-(line 1582,col 42)"
      ]
    }
  ]
}