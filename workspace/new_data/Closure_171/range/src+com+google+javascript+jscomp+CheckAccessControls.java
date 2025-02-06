{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckAccessControls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckAccessControls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 46,
      "end_line": 721,
      "comment": "\n * A compiler pass that checks that the programmer has obeyed all the access\n * control restrictions indicated by JSDoc annotations, like\n * {@code @private} and {@code @deprecated}.\n *\n * Because access control restrictions are attached to type information,\n * it\u0027s important that TypedScopeCreator, TypeInference, and InferJSDocInfo\n * all run before this pass. TypedScopeCreator creates and resolves types,\n * TypeInference propagates those types across the AST, and InferJSDocInfo\n * propagates JSDoc across the types.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_NAME"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_NAME_REASON"
      ],
      "begin_line": 52,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_PROP"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_PROP_REASON"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_CLASS"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPRECATED_CLASS_REASON"
      ],
      "begin_line": 68,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_PRIVATE_GLOBAL_ACCESS"
      ],
      "begin_line": 72,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_PRIVATE_PROPERTY_ACCESS"
      ],
      "begin_line": 77,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_PROTECTED_PROPERTY_ACCESS"
      ],
      "begin_line": 82,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PRIVATE_OVERRIDE"
      ],
      "begin_line": 87,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTEND_FINAL_CLASS"
      ],
      "begin_line": 92,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VISIBILITY_MISMATCH"
      ],
      "begin_line": 97,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONST_PROPERTY_REASSIGNED_VALUE"
      ],
      "begin_line": 102,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONST_PROPERTY_DELETED"
      ],
      "begin_line": 107,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deprecatedDepth"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " State about the current traversal."
    },
    {
      "type": "field",
      "varNames": [
        "methodDepth"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentClass"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initializedConstantProperties"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.CheckAccessControls(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 29)",
        "(line 124,col 5)-(line 124,col 49)",
        "(line 125,col 5)-(line 125,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 138,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 151,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 154,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 156,col 5)-(line 166,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 199,
      "comment": "\n   * Gets the type of the class that \"owns\" a method, or null if\n   * we know that its un-owned.\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 196,col 5)",
        "(line 198,col 5)-(line 198,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.normalizeClassType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 205,
      "end_line": 217,
      "comment": "\n   * Normalize the type of a constructor, its instance, and its prototype\n   * all down to the same type (the instance type).\n   ",
      "child_ranges": [
        "(line 206,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 216,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 219,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 224,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 242,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 268,
      "comment": "\n   * Checks the given NEW node to ensure that access restrictions are obeyed.\n   ",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 32)",
        "(line 252,col 5)-(line 267,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 273,
      "end_line": 295,
      "comment": "\n   * Checks the given NAME node to ensure that access restrictions are obeyed.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 280,col 55)",
        "(line 281,col 5)-(line 281,col 64)",
        "(line 283,col 5)-(line 294,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 301,
      "end_line": 330,
      "comment": "\n   * Checks the given GETPROP node to ensure that access restrictions are\n   * obeyed.\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 305,col 5)",
        "(line 307,col 5)-(line 308,col 68)",
        "(line 309,col 5)-(line 309,col 55)",
        "(line 311,col 5)-(line 329,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 337,
      "end_line": 362,
      "comment": "\n   * Determines whether the given name is visible in the current context.\n   * @param t The current traversal.\n   * @param name The name node.\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 52)",
        "(line 339,col 5)-(line 361,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkFinalClassOverrides(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 367,
      "end_line": 377,
      "comment": "\n   * Checks if a constructor is trying to override a final class.\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 55)",
        "(line 369,col 5)-(line 376,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 384,
      "end_line": 439,
      "comment": "\n   * Determines whether the given property with @const tag got reassigned\n   * @param t The current traversal.\n   * @param getprop The getprop node.\n   ",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 38)",
        "(line 388,col 5)-(line 388,col 42)",
        "(line 389,col 5)-(line 393,col 5)",
        "(line 395,col 5)-(line 396,col 72)",
        "(line 397,col 5)-(line 397,col 61)",
        "(line 399,col 5)-(line 399,col 78)",
        "(line 402,col 5)-(line 438,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 446,
      "end_line": 541,
      "comment": "\n   * Determines whether the given property is visible in the current context.\n   * @param t The current traversal.\n   * @param getprop The getprop node.\n   ",
      "child_ranges": [
        "(line 448,col 5)-(line 449,col 74)",
        "(line 450,col 5)-(line 450,col 61)",
        "(line 452,col 5)-(line 540,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n   * Whether the given access of a private constructor is legal.\n   *\n   * For example,\n   * new PrivateCtor_(); // not legal\n   * PrivateCtor_.newInstance(); // legal\n   * x instanceof PrivateCtor_ // legal\n   *\n   * This is a weird special case, because our visibility system is inherited\n   * from Java, and JavaScript has no distinction between classes and\n   * constructors like Java does.\n   *\n   * We may want to revisit this if we decide to make the restrictions tighter.\n   ",
      "child_ranges": [
        "(line 558,col 5)-(line 558,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 567,
      "end_line": 588,
      "comment": "\n   * Determines whether a deprecation warning should be emitted.\n   * @param t The current traversal.\n   * @param n The node which we are checking.\n   * @param parent The parent of the node which we are checking.\n   ",
      "child_ranges": [
        "(line 574,col 5)-(line 579,col 5)",
        "(line 582,col 5)-(line 585,col 5)",
        "(line 587,col 5)-(line 587,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 600,
      "end_line": 612,
      "comment": "\n   * Returns whether it\u0027s currently OK to access deprecated names and\n   * properties.\n   *\n   * There are 3 exceptions when we\u0027re allowed to use a deprecated\n   * type or property:\n   * 1) When we\u0027re in a deprecated function.\n   * 2) When we\u0027re in a deprecated class.\n   * 3) When we\u0027re in a static method of a deprecated class.\n   ",
      "child_ranges": [
        "(line 601,col 5)-(line 601,col 38)",
        "(line 602,col 5)-(line 602,col 49)",
        "(line 603,col 5)-(line 611,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(com.google.javascript.rhino.Node)",
      "begin_line": 617,
      "end_line": 626,
      "comment": "\n   * Returns whether this is a function node annotated as deprecated.\n   ",
      "child_ranges": [
        "(line 618,col 5)-(line 623,col 5)",
        "(line 625,col 5)-(line 625,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 633,
      "end_line": 653,
      "comment": "\n   * Returns the deprecation reason for the type if it is marked\n   * as being deprecated. Returns empty string if the type is deprecated\n   * but no reason was given. Returns null if the type is not deprecated.\n   ",
      "child_ranges": [
        "(line 634,col 5)-(line 636,col 5)",
        "(line 638,col 5)-(line 638,col 41)",
        "(line 639,col 5)-(line 644,col 5)",
        "(line 645,col 5)-(line 645,col 47)",
        "(line 646,col 5)-(line 651,col 5)",
        "(line 652,col 5)-(line 652,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isPropertyDeclaredConstant(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 658,
      "end_line": 671,
      "comment": "\n   * Returns if a property is declared constant.\n   ",
      "child_ranges": [
        "(line 660,col 5)-(line 669,col 5)",
        "(line 670,col 5)-(line 670,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 678,
      "end_line": 693,
      "comment": "\n   * Returns the deprecation reason for the property if it is marked\n   * as being deprecated. Returns empty string if the property is deprecated\n   * but no reason was given. Returns null if the property is not deprecated.\n   ",
      "child_ranges": [
        "(line 680,col 5)-(line 680,col 56)",
        "(line 681,col 5)-(line 687,col 5)",
        "(line 688,col 5)-(line 688,col 59)",
        "(line 689,col 5)-(line 691,col 5)",
        "(line 692,col 5)-(line 692,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.dereference(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n   * Dereference a type, autoboxing it and filtering out null.\n   ",
      "child_ranges": [
        "(line 699,col 5)-(line 699,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getFinalParentClass(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 705,
      "end_line": 720,
      "comment": "\n   * Returns the super class of the given type that has a constructor.\n   ",
      "child_ranges": [
        "(line 706,col 5)-(line 718,col 5)",
        "(line 719,col 5)-(line 719,col 16)"
      ]
    }
  ]
}