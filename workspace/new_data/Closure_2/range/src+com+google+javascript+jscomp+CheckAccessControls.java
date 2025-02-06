{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CheckAccessControls.java",
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
      "end_line": 679,
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
        "VISIBILITY_MISMATCH"
      ],
      "begin_line": 92,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONST_PROPERTY_REASSIGNED_VALUE"
      ],
      "begin_line": 97,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONST_PROPERTY_DELETED"
      ],
      "begin_line": 102,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deprecatedDepth"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " State about the current traversal."
    },
    {
      "type": "field",
      "varNames": [
        "methodDepth"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentClass"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initializedConstantProperties"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.CheckAccessControls(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 29)",
        "(line 119,col 5)-(line 119,col 49)",
        "(line 120,col 5)-(line 120,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 133,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 146,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 149,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 162,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 169,
      "end_line": 195,
      "comment": "\n   * Gets the type of the class that \"owns\" a method, or null if\n   * we know that its un-owned.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 192,col 5)",
        "(line 194,col 5)-(line 194,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.normalizeClassType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 201,
      "end_line": 213,
      "comment": "\n   * Normalize the type of a constructor, its instance, and its prototype\n   * all down to the same type (the instance type).\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 212,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 235,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 241,
      "end_line": 261,
      "comment": "\n   * Checks the given NEW node to ensure that access restrictions are obeyed.\n   ",
      "child_ranges": [
        "(line 243,col 5)-(line 243,col 32)",
        "(line 245,col 5)-(line 260,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 266,
      "end_line": 288,
      "comment": "\n   * Checks the given NAME node to ensure that access restrictions are obeyed.\n   ",
      "child_ranges": [
        "(line 268,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 55)",
        "(line 274,col 5)-(line 274,col 64)",
        "(line 276,col 5)-(line 287,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 294,
      "end_line": 323,
      "comment": "\n   * Checks the given GETPROP node to ensure that access restrictions are\n   * obeyed.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 298,col 5)",
        "(line 300,col 5)-(line 301,col 68)",
        "(line 302,col 5)-(line 302,col 55)",
        "(line 304,col 5)-(line 322,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 330,
      "end_line": 355,
      "comment": "\n   * Determines whether the given name is visible in the current context.\n   * @param t The current traversal.\n   * @param name The name node.\n   ",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 52)",
        "(line 332,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 362,
      "end_line": 417,
      "comment": "\n   * Determines whether the given property with @const tag got reassigned\n   * @param t The current traversal.\n   * @param getprop The getprop node.\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 38)",
        "(line 366,col 5)-(line 366,col 42)",
        "(line 367,col 5)-(line 371,col 5)",
        "(line 373,col 5)-(line 374,col 72)",
        "(line 375,col 5)-(line 375,col 61)",
        "(line 377,col 5)-(line 377,col 78)",
        "(line 380,col 5)-(line 416,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 424,
      "end_line": 519,
      "comment": "\n   * Determines whether the given property is visible in the current context.\n   * @param t The current traversal.\n   * @param getprop The getprop node.\n   ",
      "child_ranges": [
        "(line 426,col 5)-(line 427,col 74)",
        "(line 428,col 5)-(line 428,col 61)",
        "(line 430,col 5)-(line 518,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n   * Whether the given access of a private constructor is legal.\n   *\n   * For example,\n   * new PrivateCtor_(); // not legal\n   * PrivateCtor_.newInstance(); // legal\n   * x instanceof PrivateCtor_ // legal\n   *\n   * This is a weird special case, because our visibility system is inherited\n   * from Java, and JavaScript has no distinction between classes and\n   * constructors like Java does.\n   *\n   * We may want to revisit this if we decide to make the restrictions tighter.\n   ",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 545,
      "end_line": 566,
      "comment": "\n   * Determines whether a deprecation warning should be emitted.\n   * @param t The current traversal.\n   * @param n The node which we are checking.\n   * @param parent The parent of the node which we are checking.\n   ",
      "child_ranges": [
        "(line 552,col 5)-(line 557,col 5)",
        "(line 560,col 5)-(line 563,col 5)",
        "(line 565,col 5)-(line 565,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 578,
      "end_line": 590,
      "comment": "\n   * Returns whether it\u0027s currently OK to access deprecated names and\n   * properties.\n   *\n   * There are 3 exceptions when we\u0027re allowed to use a deprecated\n   * type or property:\n   * 1) When we\u0027re in a deprecated function.\n   * 2) When we\u0027re in a deprecated class.\n   * 3) When we\u0027re in a static method of a deprecated class.\n   ",
      "child_ranges": [
        "(line 579,col 5)-(line 579,col 38)",
        "(line 580,col 5)-(line 580,col 49)",
        "(line 581,col 5)-(line 589,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 595,
      "end_line": 604,
      "comment": "\n   * Returns whether this is a function node annotated as deprecated.\n   ",
      "child_ranges": [
        "(line 596,col 5)-(line 601,col 5)",
        "(line 603,col 5)-(line 603,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 611,
      "end_line": 631,
      "comment": "\n   * Returns the deprecation reason for the type if it is marked\n   * as being deprecated. Returns empty string if the type is deprecated\n   * but no reason was given. Returns null if the type is not deprecated.\n   ",
      "child_ranges": [
        "(line 612,col 5)-(line 614,col 5)",
        "(line 616,col 5)-(line 616,col 41)",
        "(line 617,col 5)-(line 622,col 5)",
        "(line 623,col 5)-(line 623,col 47)",
        "(line 624,col 5)-(line 629,col 5)",
        "(line 630,col 5)-(line 630,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.isPropertyDeclaredConstant(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 636,
      "end_line": 649,
      "comment": "\n   * Returns if a property is declared constant.\n   ",
      "child_ranges": [
        "(line 638,col 5)-(line 647,col 5)",
        "(line 648,col 5)-(line 648,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)",
      "begin_line": 656,
      "end_line": 671,
      "comment": "\n   * Returns the deprecation reason for the property if it is marked\n   * as being deprecated. Returns empty string if the property is deprecated\n   * but no reason was given. Returns null if the property is not deprecated.\n   ",
      "child_ranges": [
        "(line 658,col 5)-(line 658,col 56)",
        "(line 659,col 5)-(line 665,col 5)",
        "(line 666,col 5)-(line 666,col 59)",
        "(line 667,col 5)-(line 669,col 5)",
        "(line 670,col 5)-(line 670,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckAccessControls.dereference(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\n   * Dereference a type, autoboxing it and filtering out null.\n   ",
      "child_ranges": [
        "(line 677,col 5)-(line 677,col 52)"
      ]
    }
  ]
}