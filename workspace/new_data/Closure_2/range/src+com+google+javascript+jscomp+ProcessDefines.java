{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ProcessDefines.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessDefines",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 543,
      "comment": "\n * Process variables annotated as {@code @define}. A define is\n * a special constant that may be overridden by later files and\n * manipulated by the compiler, much like C preprocessor {@code #define}s.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "KNOWN_DEFINES"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": "\n   * Defines in this set will not be flagged with \"unknown define\" warnings.\n   * There are legacy flags that always set these defines, even when they\n   * might not be in the binary.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dominantReplacements"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_DEFINE_WARNING"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": " Warnings"
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_DEFINE_TYPE_ERROR"
      ],
      "begin_line": 68,
      "end_line": 71,
      "comment": " Errors"
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_DEFINE_INIT_ERROR"
      ],
      "begin_line": 73,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NON_GLOBAL_DEFINE_INIT_ERROR"
      ],
      "begin_line": 78,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFINE_NOT_ASSIGNABLE_ERROR"
      ],
      "begin_line": 83,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REASON_DEFINE_NOT_ASSIGNABLE"
      ],
      "begin_line": 88,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefines.ProcessDefines(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, com.google.javascript.rhino.Node\u003e)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n   * Create a pass that overrides define constants.\n   *\n   * TODO(nicksantos): Write a builder to help JSCompiler induce\n   *    {@code replacements} from command-line flags\n   *\n   * @param replacements A hash table of names of defines to their replacements.\n   *   All replacements \u003cb\u003emust\u003c/b\u003e be literals.\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 29)",
        "(line 102,col 5)-(line 102,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.injectNamespace(com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n   * Injects a pre-computed global namespace, so that the same namespace\n   * can be re-used for multiple check passes. Returns {@code this} for\n   * easy chaining.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 31)",
        "(line 112,col 5)-(line 112,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.overrideDefines(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo\u003e)",
      "begin_line": 123,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 28)",
        "(line 125,col 5)-(line 139,col 5)",
        "(line 141,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 145,col 67)",
        "(line 146,col 5)-(line 146,col 54)",
        "(line 147,col 5)-(line 147,col 48)",
        "(line 148,col 5)-(line 150,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.format(java.text.MessageFormat, java.lang.Object...)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.isValidDefineType(com.google.javascript.rhino.JSTypeExpression)",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\n   * Only defines of literal number, string, or boolean are supported.\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 72)",
        "(line 162,col 5)-(line 164,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.collectDefines(com.google.javascript.rhino.Node, com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 172,
      "end_line": 215,
      "comment": "\n   * Finds all defines, and creates a {@link DefineInfo} data structure for\n   * each one.\n   * @return A map of {@link DefineInfo} structures, keyed by name.\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 49)",
        "(line 176,col 5)-(line 210,col 5)",
        "(line 212,col 5)-(line 212,col 67)",
        "(line 213,col 5)-(line 213,col 49)",
        "(line 214,col 5)-(line 214,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectDefines",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 221,
      "end_line": 485,
      "comment": "\n   * Finds all assignments to @defines, and figures out the last value of\n   * the @define.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assignableDefines"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allDefines"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allRefInfo"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lvalueToRemoveLater"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " we\u0027re currently visiting one of the children of the assign."
    },
    {
      "type": "field",
      "varNames": [
        "assignAllowed"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " a define is allowed. Otherwise, it\u0027s not allowed."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.CollectDefines(com.google.javascript.jscomp.AbstractCompiler, java.util.List\u003ccom.google.javascript.jscomp.GlobalNamespace.Name\u003e)",
      "begin_line": 237,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 31)",
        "(line 239,col 7)-(line 239,col 42)",
        "(line 241,col 7)-(line 241,col 44)",
        "(line 242,col 7)-(line 242,col 48)",
        "(line 243,col 7)-(line 243,col 28)",
        "(line 246,col 7)-(line 246,col 37)",
        "(line 247,col 7)-(line 264,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.getAllDefines()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Get a map of {@link DefineInfo} structures, keyed by the name of\n     * the define.\n     ",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 279,
      "end_line": 284,
      "comment": "\n     * Keeps track of whether the traversal is in a conditional branch.\n     * We traverse all nodes of the parse tree.\n     ",
      "child_ranges": [
        "(line 282,col 7)-(line 282,col 40)",
        "(line 283,col 7)-(line 283,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 286,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 42)",
        "(line 289,col 7)-(line 328,col 7)",
        "(line 330,col 7)-(line 335,col 7)",
        "(line 337,col 7)-(line 348,col 7)",
        "(line 350,col 7)-(line 368,col 7)",
        "(line 370,col 7)-(line 370,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.updateAssignAllowedStack(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 380,
      "end_line": 396,
      "comment": "\n     * Determines whether assignment to a define should be allowed\n     * in the subtree of the given node, and if not, records that fact.\n     *\n     * @param n The node whose subtree we\u0027re about to enter or exit.\n     * @param entering True if we\u0027re entering the subtree, false otherwise.\n     ",
      "child_ranges": [
        "(line 381,col 7)-(line 395,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.isAssignAllowed()",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Determines whether assignment to a define should be allowed\n     * at the current point of the traversal.\n     ",
      "child_ranges": [
        "(line 403,col 7)-(line 403,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.processDefineAssignment(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 415,
      "end_line": 445,
      "comment": "\n     * Tracks the given define.\n     *\n     * @param t The current traversal, for context.\n     * @param name The full name for this define.\n     * @param value The value assigned to the define.\n     * @param valueParent The parent node of value.\n     * @return Whether we should remove this assignment from the parse tree.\n     ",
      "child_ranges": [
        "(line 417,col 7)-(line 442,col 7)",
        "(line 444,col 7)-(line 444,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.getValueParent(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 453,
      "end_line": 458,
      "comment": "\n     * Gets the parent node of the value for any assignment to a Name.\n     * For example, in the assignment\n     * {@code var x \u003d 3;}\n     * the parent would be the NAME node.\n     ",
      "child_ranges": [
        "(line 455,col 7)-(line 457,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.setDefineInfoNotAssignable(com.google.javascript.jscomp.ProcessDefines.DefineInfo, com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\n     * Records the fact that because of the current node in the node traversal,\n     * the define can\u0027t ever be assigned again.\n     *\n     * @param info Represents the define variable.\n     * @param t The current traversal.\n     ",
      "child_ranges": [
        "(line 468,col 7)-(line 469,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RefInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 476,
      "end_line": 484,
      "comment": "\n     * A simple data structure for associating a Ref with the name\n     * that it references.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ref"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefines.CollectDefines.RefInfo.RefInfo(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 23)",
        "(line 482,col 9)-(line 482,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefineInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 492,
      "end_line": 542,
      "comment": "\n   * A simple class for storing information about a define.\n   * Gathers the initial value, the last assigned value, and whether\n   * the define can be safely assigned a new value.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "initialValueParent"
      ],
      "begin_line": 493,
      "end_line": 493,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "initialValue"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastValue"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAssignable"
      ],
      "begin_line": 496,
      "end_line": 496,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reasonNotAssignable"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefines.DefineInfo.DefineInfo(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 502,
      "end_line": 507,
      "comment": "\n     * Initializes a define.\n     ",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 51)",
        "(line 504,col 7)-(line 504,col 39)",
        "(line 505,col 7)-(line 505,col 31)",
        "(line 506,col 7)-(line 506,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.DefineInfo.setNotAssignable(java.lang.String)",
      "begin_line": 514,
      "end_line": 517,
      "comment": "\n     * Records the fact that this define can\u0027t be assigned a value anymore.\n     *\n     * @param reason A message describing the reason why it can\u0027t be assigned.\n     ",
      "child_ranges": [
        "(line 515,col 7)-(line 515,col 27)",
        "(line 516,col 7)-(line 516,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.DefineInfo.getReasonWhyNotAssignable()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Gets the reason why a define is not assignable.\n     ",
      "child_ranges": [
        "(line 523,col 7)-(line 523,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.DefineInfo.recordAssignment(com.google.javascript.rhino.Node)",
      "begin_line": 531,
      "end_line": 534,
      "comment": "\n     * Records an assigned value.\n     *\n     * @return False if there was an error.\n     ",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 24)",
        "(line 533,col 7)-(line 533,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefines.DefineInfo.getLastValue()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * Gets the last assigned value.\n     ",
      "child_ranges": [
        "(line 540,col 7)-(line 540,col 23)"
      ]
    }
  ]
}