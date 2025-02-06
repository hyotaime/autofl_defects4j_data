{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NodeUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 3268,
      "comment": "\n * NodeUtil contains generally useful AST utilities.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_POSITIVE_INTEGER_NUMBER"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JSC_PROPERTY_NAME_FN"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LARGEST_BASIC_LATIN"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTORS_WITHOUT_SIDE_EFFECTS"
      ],
      "begin_line": 57,
      "end_line": 64,
      "comment": " the set of builtin constructors that don\u0027t have side effects. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.NodeUtil()",
      "begin_line": 67,
      "end_line": 67,
      "comment": " Utility class; do not instantiate.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 115,
      "comment": "\n   * Gets the boolean value of a node that represents a expression. This method\n   * effectively emulates the \u003ccode\u003eBoolean()\u003c/code\u003e JavaScript cast function.\n   * Note: unlike getBooleanValue this function does not return UNKNOWN\n   * for expressions with side-effects.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 114,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 169,
      "comment": "\n   * Gets the boolean value of a node that represents a literal. This method\n   * effectively emulates the \u003ccode\u003eBoolean()\u003c/code\u003e JavaScript cast function\n   * except it return UNKNOWN for known values with side-effects, use\n   * getImpureBooleanValue if you don\u0027t care about side-effects.\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 166,col 5)",
        "(line 168,col 5)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringValue(com.google.javascript.rhino.Node)",
      "begin_line": 176,
      "end_line": 221,
      "comment": "\n   * Gets the value of a node as a String, or null if it cannot be converted.\n   * When it returns a non-null String, this method effectively emulates the\n   * \u003ccode\u003eString()\u003c/code\u003e JavaScript cast function.\n   ",
      "child_ranges": [
        "(line 178,col 5)-(line 219,col 5)",
        "(line 220,col 5)-(line 220,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringValue(double)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 34)",
        "(line 227,col 5)-(line 231,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(com.google.javascript.rhino.Node)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n   * When converting arrays to string using Array.prototype.toString or\n   * Array.prototype.join, the rules for conversion to String are different\n   * than converting each element individually.  Specifically, \"null\" and\n   * \"undefined\" are converted to an empty string.\n   * @param n A node that is a member of an Array.\n   * @return The string representation.\n   ",
      "child_ranges": [
        "(line 243,col 5)-(line 244,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.arrayToString(com.google.javascript.rhino.Node)",
      "begin_line": 247,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 41)",
        "(line 249,col 5)-(line 249,col 47)",
        "(line 250,col 5)-(line 250,col 21)",
        "(line 251,col 5)-(line 251,col 25)",
        "(line 252,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 264,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNumberValue(com.google.javascript.rhino.Node)",
      "begin_line": 272,
      "end_line": 329,
      "comment": "\n   * Gets the value of a node as a Number, or null if it cannot be converted.\n   * When it returns a non-null Double, this method effectively emulates the\n   * \u003ccode\u003eNumber()\u003c/code\u003e JavaScript cast function.\n   ",
      "child_ranges": [
        "(line 273,col 5)-(line 326,col 5)",
        "(line 328,col 5)-(line 328,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringNumberValue(java.lang.String)",
      "begin_line": 331,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 335,col 5)",
        "(line 337,col 5)-(line 337,col 45)",
        "(line 339,col 5)-(line 341,col 5)",
        "(line 343,col 5)-(line 352,col 5)",
        "(line 354,col 5)-(line 360,col 5)",
        "(line 364,col 5)-(line 368,col 5)",
        "(line 370,col 5)-(line 374,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(java.lang.String)",
      "begin_line": 377,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 18)",
        "(line 379,col 5)-(line 379,col 25)",
        "(line 380,col 5)-(line 383,col 5)",
        "(line 384,col 5)-(line 387,col 5)",
        "(line 388,col 5)-(line 388,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(int)",
      "begin_line": 394,
      "end_line": 412,
      "comment": "\n   * Copied from Rhino\u0027s ScriptRuntime\n   ",
      "child_ranges": [
        "(line 395,col 5)-(line 411,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 429,
      "end_line": 448,
      "comment": "\n   * Gets the function\u0027s name. This method recognizes five forms:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code function name() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * In two last cases with named function expressions, the second name is\n   * returned (the variable of qualified name).\n   *\n   * @param n a node whose type is {@link Token#FUNCTION}\n   * @return the function\u0027s name, or {@code null} if it has no name\n   ",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 45)",
        "(line 431,col 5)-(line 431,col 32)",
        "(line 432,col 5)-(line 447,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 465,
      "end_line": 488,
      "comment": "\n   * Gets the function\u0027s name. This method recognizes the forms:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code \u0026#123;\u0027name\u0027: function() ...\u0026#125;}\u003c/li\u003e\n   * \u003cli\u003e{@code \u0026#123;name: function() ...\u0026#125;}\u003c/li\u003e\n   * \u003cli\u003e{@code function name() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @param n a node whose type is {@link Token#FUNCTION}\n   * @return the function\u0027s name, or {@code null} if it has no name\n   ",
      "child_ranges": [
        "(line 466,col 5)-(line 468,col 5)",
        "(line 470,col 5)-(line 470,col 37)",
        "(line 471,col 5)-(line 473,col 5)",
        "(line 476,col 5)-(line 476,col 32)",
        "(line 477,col 5)-(line 485,col 5)",
        "(line 487,col 5)-(line 487,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isImmutableValue(com.google.javascript.rhino.Node)",
      "begin_line": 494,
      "end_line": 518,
      "comment": "\n   * Returns true if this is an immutable value.\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 515,col 5)",
        "(line 517,col 5)-(line 517,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(com.google.javascript.rhino.Node)",
      "begin_line": 523,
      "end_line": 534,
      "comment": "\n   * Returns true if the operator on this node is symmetric\n   ",
      "child_ranges": [
        "(line 524,col 5)-(line 532,col 5)",
        "(line 533,col 5)-(line 533,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isRelationalOperation(com.google.javascript.rhino.Node)",
      "begin_line": 540,
      "end_line": 549,
      "comment": "\n   * Returns true if the operator on this node is relational.\n   * the returned set does not include the equalities.\n   ",
      "child_ranges": [
        "(line 541,col 5)-(line 547,col 5)",
        "(line 548,col 5)-(line 548,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getInverseOperator(int)",
      "begin_line": 555,
      "end_line": 567,
      "comment": "\n   * Returns the inverse of an operator if it is invertible.\n   * ex. \u0027\u003e\u0027 \u003d\u003d\u003e \u0027\u003c\u0027\n   ",
      "child_ranges": [
        "(line 556,col 5)-(line 565,col 5)",
        "(line 566,col 5)-(line 566,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLiteralValue(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 591,
      "end_line": 631,
      "comment": "\n   * Returns true if this is a literal value. We define a literal value\n   * as any node that evaluates to the same thing regardless of when or\n   * where it is evaluated. So /xyz/ and [3, 5] are literals, but\n   * the name a is not.\n   *\n   * Function literals do not meet this definition, because they\n   * lexically capture variables. For example, if you have\n   * \u003ccode\u003e\n   * function() { return a; }\n   * \u003c/code\u003e\n   * If it is evaluated in a different scope, then it\n   * captures a different variable. Even if the function did not read\n   * any captured variables directly, it would still fail this definition,\n   * because it affects the lifecycle of variables in the enclosing scope.\n   *\n   * However, a function literal with respect to a particular scope is\n   * a literal.\n   *\n   * @param includeFunctions If true, all function expressions will be\n   *     treated as literals.\n   ",
      "child_ranges": [
        "(line 592,col 5)-(line 630,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidDefineValue(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 639,
      "end_line": 685,
      "comment": "\n   * Determines whether the given value may be assigned to a define.\n   *\n   * @param val The value being assigned.\n   * @param defines The list of names of existing defines.\n   ",
      "child_ranges": [
        "(line 640,col 5)-(line 683,col 5)",
        "(line 684,col 5)-(line 684,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isEmptyBlock(com.google.javascript.rhino.Node)",
      "begin_line": 692,
      "end_line": 703,
      "comment": "\n   * Returns whether this a BLOCK node with no children.\n   *\n   * @param block The node.\n   ",
      "child_ranges": [
        "(line 693,col 5)-(line 695,col 5)",
        "(line 697,col 5)-(line 701,col 5)",
        "(line 702,col 5)-(line 702,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSimpleOperator(com.google.javascript.rhino.Node)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 706,col 5)-(line 706,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(int)",
      "begin_line": 714,
      "end_line": 750,
      "comment": "\n   * A \"simple\" operator is one whose children are expressions,\n   * has no direct side-effects (unlike \u0027+\u003d\u0027), and has no\n   * conditional aspects (unlike \u0027||\u0027).\n   ",
      "child_ranges": [
        "(line 715,col 5)-(line 749,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.rhino.Node)",
      "begin_line": 758,
      "end_line": 760,
      "comment": "\n   * Creates an EXPR_RESULT.\n   *\n   * @param child The expression itself.\n   * @return Newly created EXPR node with the child as subexpression.\n   ",
      "child_ranges": [
        "(line 759,col 5)-(line 759,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(com.google.javascript.rhino.Node)",
      "begin_line": 768,
      "end_line": 770,
      "comment": "\n   * Returns true if the node may create new mutable state, or change existing\n   * state.\n   *\n   * @see \u003ca href\u003d\"http://www.xkcd.org/326/\"\u003eXKCD Cartoon\u003c/a\u003e\n   ",
      "child_ranges": [
        "(line 769,col 5)-(line 769,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 772,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 773,col 5)-(line 773,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 779,
      "end_line": 781,
      "comment": "\n   * Returns true if the node which may have side effects when executed.\n   ",
      "child_ranges": [
        "(line 780,col 5)-(line 780,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 783,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 784,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 793,
      "end_line": 938,
      "comment": "\n   * Returns true if some node in n\u0027s subtree changes application state.\n   * If {@code checkForNewObjects} is true, we assume that newly created\n   * mutable objects (like object literals) change state. Otherwise, we assume\n   * that they have no side effects.\n   ",
      "child_ranges": [
        "(line 797,col 5)-(line 929,col 5)",
        "(line 931,col 5)-(line 935,col 5)",
        "(line 937,col 5)-(line 937,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\n   * Do calls to this constructor have side effects?\n   *\n   * @param callNode - constructor call node\n   ",
      "child_ranges": [
        "(line 946,col 5)-(line 946,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 949,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 951,col 5)-(line 954,col 5)",
        "(line 956,col 5)-(line 958,col 5)",
        "(line 960,col 5)-(line 960,col 45)",
        "(line 961,col 5)-(line 964,col 5)",
        "(line 966,col 5)-(line 966,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BUILTIN_FUNCTIONS_WITHOUT_SIDEEFFECTS"
      ],
      "begin_line": 972,
      "end_line": 974,
      "comment": " TODO(johnlenz): consider adding an extern annotation for this."
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_METHODS_WITHOUT_SIDEEFFECTS"
      ],
      "begin_line": 975,
      "end_line": 976,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_METHODS"
      ],
      "begin_line": 977,
      "end_line": 978,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_REGEXP_METHODS"
      ],
      "begin_line": 979,
      "end_line": 980,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n   * Returns true if calls to this function have side effects.\n   *\n   * @param callNode - function call node\n   ",
      "child_ranges": [
        "(line 988,col 5)-(line 988,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 998,
      "end_line": 1055,
      "comment": "\n   * Returns true if calls to this function have side effects.\n   *\n   * @param callNode The call node to inspected.\n   * @param compiler A compiler object to provide program state changing\n   *     context information. Can be null.\n   ",
      "child_ranges": [
        "(line 1000,col 5)-(line 1003,col 5)",
        "(line 1005,col 5)-(line 1007,col 5)",
        "(line 1009,col 5)-(line 1009,col 45)",
        "(line 1012,col 5)-(line 1052,col 5)",
        "(line 1054,col 5)-(line 1054,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.callHasLocalResult(com.google.javascript.rhino.Node)",
      "begin_line": 1060,
      "end_line": 1063,
      "comment": "\n   * @return Whether the call has a local result.\n   ",
      "child_ranges": [
        "(line 1061,col 5)-(line 1061,col 41)",
        "(line 1062,col 5)-(line 1062,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newHasLocalResult(com.google.javascript.rhino.Node)",
      "begin_line": 1068,
      "end_line": 1071,
      "comment": "\n   * @return Whether the new has a local result.\n   ",
      "child_ranges": [
        "(line 1069,col 5)-(line 1069,col 40)",
        "(line 1070,col 5)-(line 1070,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "\n   * Returns true if the current node\u0027s type implies side effects.\n   *\n   * This is a non-recursive version of the may have side effects\n   * check; used to check wherever the current node\u0027s type is one of\n   * the reason\u0027s why a subtree has side effects.\n   ",
      "child_ranges": [
        "(line 1081,col 5)-(line 1081,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1084,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1085,col 5)-(line 1087,col 5)",
        "(line 1089,col 5)-(line 1104,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.canBeSideEffected(com.google.javascript.rhino.Node)",
      "begin_line": 1111,
      "end_line": 1114,
      "comment": "\n   * @return Whether the tree can be affected by side-effects or\n   * has side-effects.\n   ",
      "child_ranges": [
        "(line 1112,col 5)-(line 1112,col 50)",
        "(line 1113,col 5)-(line 1113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.canBeSideEffected(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1122,
      "end_line": 1154,
      "comment": "\n   * @param knownConstants A set of names known to be constant value at\n   * node \u0027n\u0027 (such as locals that are last written before n can execute).\n   * @return Whether the tree can be affected by side-effects or\n   * has side-effects.\n   ",
      "child_ranges": [
        "(line 1123,col 5)-(line 1145,col 5)",
        "(line 1147,col 5)-(line 1151,col 5)",
        "(line 1153,col 5)-(line 1153,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.precedence(int)",
      "begin_line": 1173,
      "end_line": 1248,
      "comment": "\n   *  0 comma ,\n   *  1 assignment \u003d +\u003d -\u003d *\u003d /\u003d %\u003d \u003c\u003c\u003d \u003e\u003e\u003d \u003e\u003e\u003e\u003d \u0026\u003d ^\u003d |\u003d\n   *  2 conditional ?:\n   *  3 logical-or ||\n   *  4 logical-and \u0026\u0026\n   *  5 bitwise-or |\n   *  6 bitwise-xor ^\n   *  7 bitwise-and \u0026\n   *  8 equality \u003d\u003d !\u003d\n   *  9 relational \u003c \u003c\u003d \u003e \u003e\u003d\n   * 10 bitwise shift \u003c\u003c \u003e\u003e \u003e\u003e\u003e\n   * 11 addition/subtraction + -\n   * 12 multiply/divide * / %\n   * 13 negation/increment ! ~ - ++ --\n   * 14 call, member () [] .\n   ",
      "child_ranges": [
        "(line 1174,col 5)-(line 1247,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 1250,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 5)-(line 1256,col 5)",
        "(line 1257,col 5)-(line 1257,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 1260,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 5)-(line 1261,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.allResultsMatch(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1268,
      "end_line": 1285,
      "comment": "\n   * Apply the supplied predicate against\n   * all possible result Nodes of the expression.\n   ",
      "child_ranges": [
        "(line 1269,col 5)-(line 1284,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.anyResultsMatch(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1291,
      "end_line": 1308,
      "comment": "\n   * Apply the supplied predicate against\n   * all possible result Nodes of the expression.\n   ",
      "child_ranges": [
        "(line 1292,col 5)-(line 1307,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumbericResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1310,
      "end_line": 1315,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1311,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1313,col 7)-(line 1313,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NUMBERIC_RESULT_PREDICATE"
      ],
      "begin_line": 1317,
      "end_line": 1318,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNumericResult(com.google.javascript.rhino.Node)",
      "begin_line": 1323,
      "end_line": 1325,
      "comment": "\n   * Returns true if the result of node evaluation is always a number\n   ",
      "child_ranges": [
        "(line 1324,col 5)-(line 1324,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1327,
      "end_line": 1361,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 5)-(line 1360,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1363,
      "end_line": 1368,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1364,
      "end_line": 1367,
      "comment": "",
      "child_ranges": [
        "(line 1366,col 7)-(line 1366,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BOOLEAN_RESULT_PREDICATE"
      ],
      "begin_line": 1370,
      "end_line": 1371,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBooleanResult(com.google.javascript.rhino.Node)",
      "begin_line": 1376,
      "end_line": 1378,
      "comment": "\n   * @return Whether the result of node evaluation is always a boolean\n   ",
      "child_ranges": [
        "(line 1377,col 5)-(line 1377,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1380,
      "end_line": 1405,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 5)-(line 1404,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MayBeStringResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1409,
      "end_line": 1414,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1410,
      "end_line": 1413,
      "comment": "",
      "child_ranges": [
        "(line 1412,col 7)-(line 1412,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MAY_BE_STRING_PREDICATE"
      ],
      "begin_line": 1416,
      "end_line": 1417,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeString(com.google.javascript.rhino.Node)",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": "\n   * @returns Whether the results is possibly a string.\n   ",
      "child_ranges": [
        "(line 1423,col 5)-(line 1423,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeString(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 1426,
      "end_line": 1432,
      "comment": "",
      "child_ranges": [
        "(line 1427,col 5)-(line 1431,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1434,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1435,col 5)-(line 1436,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isAssociative(int)",
      "begin_line": 1445,
      "end_line": 1457,
      "comment": "\n   * Returns true if the operator is associative.\n   * e.g. (a * b) * c \u003d a * (b * c)\n   * Note: \"+\" is not associative because it is also the concatenation\n   * for strings. e.g. \"a\" + (1 + 2) is not \"a\" + 1 + 2\n   ",
      "child_ranges": [
        "(line 1446,col 5)-(line 1456,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCommutative(int)",
      "begin_line": 1466,
      "end_line": 1476,
      "comment": "\n   * Returns true if the operator is commutative.\n   * e.g. (a * b) * c \u003d c * (b * a)\n   * Note 1: \"+\" is not commutative because it is also the concatenation\n   * for strings. e.g. \"a\" + (1 + 2) is not \"a\" + 1 + 2\n   * Note 2: only operations on literals and pure functions are commutative.\n   ",
      "child_ranges": [
        "(line 1467,col 5)-(line 1475,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isAssignmentOp(com.google.javascript.rhino.Node)",
      "begin_line": 1478,
      "end_line": 1495,
      "comment": "",
      "child_ranges": [
        "(line 1479,col 5)-(line 1493,col 5)",
        "(line 1494,col 5)-(line 1494,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(com.google.javascript.rhino.Node)",
      "begin_line": 1497,
      "end_line": 1523,
      "comment": "",
      "child_ranges": [
        "(line 1498,col 5)-(line 1521,col 5)",
        "(line 1522,col 5)-(line 1522,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1529,
      "end_line": 1531,
      "comment": "\n   * Determines if the given node contains a function statement or function\n   * expression.\n   ",
      "child_ranges": [
        "(line 1530,col 5)-(line 1530,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.referencesThis(com.google.javascript.rhino.Node)",
      "begin_line": 1536,
      "end_line": 1539,
      "comment": "\n   * Returns true if the shallow scope contains references to \u0027this\u0027 keyword\n   ",
      "child_ranges": [
        "(line 1537,col 5)-(line 1537,col 57)",
        "(line 1538,col 5)-(line 1538,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isGet(com.google.javascript.rhino.Node)",
      "begin_line": 1544,
      "end_line": 1546,
      "comment": "\n   * Is this a GETPROP or GETELEM node?\n   ",
      "child_ranges": [
        "(line 1545,col 5)-(line 1545,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1554,
      "end_line": 1558,
      "comment": "\n   * Is this node the name of a variable being declared?\n   *\n   * @param n The node\n   * @return True if {@code n} is NAME and {@code parent} is VAR\n   ",
      "child_ranges": [
        "(line 1557,col 5)-(line 1557,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getAssignedValue(com.google.javascript.rhino.Node)",
      "begin_line": 1564,
      "end_line": 1574,
      "comment": "\n   * For an assignment or variable declaration get the assigned value.\n   * @return The value node representing the new value.\n   ",
      "child_ranges": [
        "(line 1565,col 5)-(line 1565,col 41)",
        "(line 1566,col 5)-(line 1566,col 32)",
        "(line 1567,col 5)-(line 1573,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExprAssign(com.google.javascript.rhino.Node)",
      "begin_line": 1583,
      "end_line": 1586,
      "comment": "\n   * Is this node an assignment expression statement?\n   *\n   * @param n The node\n   * @return True if {@code n} is EXPR_RESULT and {@code n}\u0027s\n   *     first child is ASSIGN\n   ",
      "child_ranges": [
        "(line 1584,col 5)-(line 1585,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExprCall(com.google.javascript.rhino.Node)",
      "begin_line": 1595,
      "end_line": 1598,
      "comment": "\n   * Is this node a call expression statement?\n   *\n   * @param n The node\n   * @return True if {@code n} is EXPR_RESULT and {@code n}\u0027s\n   *     first child is CALL\n   ",
      "child_ranges": [
        "(line 1596,col 5)-(line 1597,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isForIn(com.google.javascript.rhino.Node)",
      "begin_line": 1603,
      "end_line": 1606,
      "comment": "\n   * @return Whether the node represents a FOR-IN loop.\n   ",
      "child_ranges": [
        "(line 1604,col 5)-(line 1605,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLoopStructure(com.google.javascript.rhino.Node)",
      "begin_line": 1611,
      "end_line": 1620,
      "comment": "\n   * Determines whether the given node is a FOR, DO, or WHILE node.\n   ",
      "child_ranges": [
        "(line 1612,col 5)-(line 1619,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1627,
      "end_line": 1637,
      "comment": "\n   * @param n The node to inspect.\n   * @return If the node, is a FOR, WHILE, or DO, it returns the node for\n   * the code BLOCK, null otherwise.\n   ",
      "child_ranges": [
        "(line 1628,col 5)-(line 1636,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isWithinLoop(com.google.javascript.rhino.Node)",
      "begin_line": 1643,
      "end_line": 1654,
      "comment": "\n   * @return Whether the specified node has a loop parent that\n   * is within the current scope.\n   ",
      "child_ranges": [
        "(line 1644,col 5)-(line 1652,col 5)",
        "(line 1653,col 5)-(line 1653,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isControlStructure(com.google.javascript.rhino.Node)",
      "begin_line": 1659,
      "end_line": 1676,
      "comment": "\n   * Determines whether the given node is a FOR, DO, WHILE, WITH, or IF node.\n   ",
      "child_ranges": [
        "(line 1660,col 5)-(line 1675,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1682,
      "end_line": 1706,
      "comment": "\n   * Determines whether the given node is code node for FOR, DO,\n   * WHILE, WITH, or IF node.\n   ",
      "child_ranges": [
        "(line 1683,col 5)-(line 1705,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getConditionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1713,
      "end_line": 1732,
      "comment": "\n   * Gets the condition of an ON_TRUE / ON_FALSE CFG edge.\n   * @param n a node with an outgoing conditional CFG edge\n   * @return the condition node or null if the condition is not obviously a node\n   ",
      "child_ranges": [
        "(line 1714,col 5)-(line 1730,col 5)",
        "(line 1731,col 5)-(line 1731,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatementBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "\n   * @return Whether the node is of a type that contain other statements.\n   ",
      "child_ranges": [
        "(line 1738,col 5)-(line 1738,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatement(com.google.javascript.rhino.Node)",
      "begin_line": 1744,
      "end_line": 1746,
      "comment": "\n   * @return Whether the node is used as a statement.\n   ",
      "child_ranges": [
        "(line 1745,col 5)-(line 1745,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatementParent(com.google.javascript.rhino.Node)",
      "begin_line": 1748,
      "end_line": 1761,
      "comment": "",
      "child_ranges": [
        "(line 1752,col 5)-(line 1752,col 45)",
        "(line 1753,col 5)-(line 1760,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSwitchCase(com.google.javascript.rhino.Node)",
      "begin_line": 1764,
      "end_line": 1766,
      "comment": " Whether the node is part of a switch statement. ",
      "child_ranges": [
        "(line 1765,col 5)-(line 1765,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isReferenceName(com.google.javascript.rhino.Node)",
      "begin_line": 1772,
      "end_line": 1774,
      "comment": "\n   * @return Whether the name is a reference to a variable, function or\n   *       function parameter (not a label or a empty function expression name).\n   ",
      "child_ranges": [
        "(line 1773,col 5)-(line 1773,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1777,
      "end_line": 1780,
      "comment": " Whether the child node is the FINALLY block of a try. ",
      "child_ranges": [
        "(line 1778,col 5)-(line 1779,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(com.google.javascript.rhino.Node)",
      "begin_line": 1783,
      "end_line": 1787,
      "comment": " Whether the node is a CATCH container BLOCK. ",
      "child_ranges": [
        "(line 1784,col 5)-(line 1784,col 32)",
        "(line 1785,col 5)-(line 1786,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.removeChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1790,
      "end_line": 1843,
      "comment": " Safely remove children while maintaining a valid node structure. ",
      "child_ranges": [
        "(line 1791,col 5)-(line 1842,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.maybeAddFinally(com.google.javascript.rhino.Node)",
      "begin_line": 1848,
      "end_line": 1853,
      "comment": "\n   * Add a finally block if one does not exist.\n   ",
      "child_ranges": [
        "(line 1849,col 5)-(line 1849,col 46)",
        "(line 1850,col 5)-(line 1852,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.tryMergeBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1859,
      "end_line": 1876,
      "comment": "\n   * Merge a block with its parent block.\n   * @return Whether the block was removed.\n   ",
      "child_ranges": [
        "(line 1860,col 5)-(line 1860,col 46)",
        "(line 1861,col 5)-(line 1861,col 36)",
        "(line 1864,col 5)-(line 1875,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCallOrNew(com.google.javascript.rhino.Node)",
      "begin_line": 1882,
      "end_line": 1884,
      "comment": "\n   * @param node A node\n   * @return Whether the call is a NEW or CALL node.\n   ",
      "child_ranges": [
        "(line 1883,col 5)-(line 1883,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionBody(com.google.javascript.rhino.Node)",
      "begin_line": 1889,
      "end_line": 1892,
      "comment": "\n   * Return a BLOCK node for the given FUNCTION node.\n   ",
      "child_ranges": [
        "(line 1890,col 5)-(line 1890,col 49)",
        "(line 1891,col 5)-(line 1891,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1899,
      "end_line": 1901,
      "comment": "\n   * Is this node a function declaration? A function declaration is a function\n   * that has a name that is added to the current scope (i.e. a function that\n   * is not part of a expression; see {@link #isFunctionExpression}).\n   ",
      "child_ranges": [
        "(line 1900,col 5)-(line 1900,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1908,
      "end_line": 1912,
      "comment": "\n   * Is this node a hoisted function declaration? A function declaration in the\n   * scope root is hoisted to the top of the scope.\n   * See {@link #isFunctionDeclaration}).\n   ",
      "child_ranges": [
        "(line 1909,col 5)-(line 1911,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1937,
      "end_line": 1939,
      "comment": "\n   * Is a FUNCTION node an function expression? An function expression is one\n   * that has either no name or a name that is not added to the current scope.\n   *\n   * \u003cp\u003eSome examples of function expressions:\n   * \u003cpre\u003e\n   * (function () {})\n   * (function f() {})()\n   * [ function f() {} ]\n   * var f \u003d function f() {};\n   * for (function f() {};;) {}\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eSome examples of functions that are \u003cem\u003enot\u003c/em\u003e expressions:\n   * \u003cpre\u003e\n   * function f() {}\n   * if (x); else function f() {}\n   * for (;;) { function f() {} }\n   * \u003c/pre\u003e\n   *\n   * @param n A node\n   * @return Whether n is an function used within an expression.\n   ",
      "child_ranges": [
        "(line 1938,col 5)-(line 1938,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBleedingFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 1945,
      "end_line": 1948,
      "comment": "\n   * Returns whether this is a bleeding function (an anonymous named function\n   * that bleeds into the inner scope).\n   ",
      "child_ranges": [
        "(line 1946,col 5)-(line 1947,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1956,
      "end_line": 1958,
      "comment": "\n   * Determines if a node is a function expression that has an empty body.\n   *\n   * @param node a node\n   * @return whether the given node is a function expression that is empty\n   ",
      "child_ranges": [
        "(line 1957,col 5)-(line 1957,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1964,
      "end_line": 1971,
      "comment": "\n   * Determines if a function takes a variable number of arguments by\n   * looking for references to the \"arguments\" var_args object.\n   ",
      "child_ranges": [
        "(line 1966,col 5)-(line 1966,col 55)",
        "(line 1967,col 5)-(line 1970,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 1978,
      "end_line": 1990,
      "comment": "\n   * @return Whether node is a call to methodName.\n   *    a.f(...)\n   *    a[\u0027f\u0027](...)\n   ",
      "child_ranges": [
        "(line 1979,col 5)-(line 1988,col 5)",
        "(line 1989,col 5)-(line 1989,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(com.google.javascript.rhino.Node)",
      "begin_line": 1998,
      "end_line": 2000,
      "comment": "\n   * @return Whether the callNode represents an expression in the form of:\n   *    x.call(...)\n   *    x[\u0027call\u0027](...)\n   ",
      "child_ranges": [
        "(line 1999,col 5)-(line 1999,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(com.google.javascript.rhino.Node)",
      "begin_line": 2007,
      "end_line": 2009,
      "comment": "\n   * @return Whether the callNode represents an expression in the form of:\n   *    x.apply(...)\n   *    x[\u0027apply\u0027](...)\n   ",
      "child_ranges": [
        "(line 2008,col 5)-(line 2008,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2020,
      "end_line": 2023,
      "comment": "\n   * Determines whether this node is strictly on the left hand side of an assign\n   * or var initialization. Notably, this does not include all L-values, only\n   * statements where the node is used only as an L-value.\n   *\n   * @param n The node\n   * @param parent Parent of the node\n   * @return True if n is the left hand of an assign\n   ",
      "child_ranges": [
        "(line 2021,col 5)-(line 2022,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLValue(com.google.javascript.rhino.Node)",
      "begin_line": 2038,
      "end_line": 2053,
      "comment": "\n   * Determines whether this node is used as an L-value. Notice that sometimes\n   * names are used as both L-values and R-values.\n   *\n   * We treat \"var x;\" as a pseudo-L-value, which kind of makes sense if you\n   * treat it as \"assignment to \u0027undefined\u0027 at the top of the scope\". But if\n   * we\u0027re honest with ourselves, it doesn\u0027t make sense, and we only do this\n   * because it makes sense to treat this as syntactically similar to\n   * \"var x \u003d 0;\".\n   *\n   * @param n The node\n   * @return True if n is an L-value.\n   ",
      "child_ranges": [
        "(line 2039,col 5)-(line 2040,col 23)",
        "(line 2041,col 5)-(line 2041,col 32)",
        "(line 2042,col 5)-(line 2044,col 5)",
        "(line 2045,col 5)-(line 2052,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isObjectLitKey(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2062,
      "end_line": 2070,
      "comment": "\n   * Determines whether a node represents an object literal key\n   * (e.g. key1 in {key1: value1, key2: value2}).\n   *\n   * @param node A node\n   * @param parent The node\u0027s parent\n   ",
      "child_ranges": [
        "(line 2063,col 5)-(line 2068,col 5)",
        "(line 2069,col 5)-(line 2069,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(com.google.javascript.rhino.Node)",
      "begin_line": 2077,
      "end_line": 2085,
      "comment": "\n   * Get the name of an object literal key.\n   *\n   * @param key A node\n   ",
      "child_ranges": [
        "(line 2078,col 5)-(line 2083,col 5)",
        "(line 2084,col 5)-(line 2084,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 2091,
      "end_line": 2117,
      "comment": "\n   * @param key A OBJECTLIT key node.\n   * @return The type expected when using the key.\n   ",
      "child_ranges": [
        "(line 2092,col 5)-(line 2115,col 5)",
        "(line 2116,col 5)-(line 2116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(com.google.javascript.rhino.Node)",
      "begin_line": 2125,
      "end_line": 2132,
      "comment": "\n   * Determines whether a node represents an object literal get or set key\n   * (e.g. key1 in {get key1() {}, set key2(a){}).\n   *\n   * @param node A node\n   ",
      "child_ranges": [
        "(line 2126,col 5)-(line 2130,col 5)",
        "(line 2131,col 5)-(line 2131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.opToStr(int)",
      "begin_line": 2142,
      "end_line": 2187,
      "comment": "\n   * Converts an operator\u0027s token value (see {@link Token}) to a string\n   * representation.\n   *\n   * @param operator the operator\u0027s token value to convert\n   * @return the string representation or {@code null} if the token value is\n   * not an operator\n   ",
      "child_ranges": [
        "(line 2143,col 5)-(line 2186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.opToStrNoFail(int)",
      "begin_line": 2197,
      "end_line": 2204,
      "comment": "\n   * Converts an operator\u0027s token value (see {@link Token}) to a string\n   * representation or fails.\n   *\n   * @param operator the operator\u0027s token value to convert\n   * @return the string representation\n   * @throws Error if the token value is not an operator\n   ",
      "child_ranges": [
        "(line 2198,col 5)-(line 2198,col 35)",
        "(line 2199,col 5)-(line 2202,col 5)",
        "(line 2203,col 5)-(line 2203,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsType(com.google.javascript.rhino.Node, int, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2209,
      "end_line": 2213,
      "comment": "\n   * @return true if n or any of its children are of the specified type\n   ",
      "child_ranges": [
        "(line 2212,col 5)-(line 2212,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsType(com.google.javascript.rhino.Node, int)",
      "begin_line": 2218,
      "end_line": 2220,
      "comment": "\n   * @return true if n or any of its children are of the specified type\n   ",
      "child_ranges": [
        "(line 2219,col 5)-(line 2219,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(com.google.javascript.rhino.Node)",
      "begin_line": 2228,
      "end_line": 2243,
      "comment": "\n   * Given a node tree, finds all the VAR declarations in that tree that are\n   * not in an inner scope. Then adds a new VAR node at the top of the current\n   * scope that redeclares them, if necessary.\n   ",
      "child_ranges": [
        "(line 2229,col 5)-(line 2229,col 60)",
        "(line 2230,col 5)-(line 2232,col 5)",
        "(line 2234,col 5)-(line 2234,col 40)",
        "(line 2235,col 5)-(line 2242,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2250,
      "end_line": 2254,
      "comment": "\n   * Copy any annotations that follow a named value.\n   * @param source\n   * @param destination\n   ",
      "child_ranges": [
        "(line 2251,col 5)-(line 2253,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getAddingRoot(com.google.javascript.rhino.Node)",
      "begin_line": 2260,
      "end_line": 2280,
      "comment": "\n   * Gets a Node at the top of the current scope where we can add new var\n   * declarations as children.\n   ",
      "child_ranges": [
        "(line 2261,col 5)-(line 2261,col 27)",
        "(line 2262,col 5)-(line 2262,col 22)",
        "(line 2263,col 5)-(line 2272,col 5)",
        "(line 2275,col 5)-(line 2276,col 31)",
        "(line 2277,col 5)-(line 2278,col 48)",
        "(line 2279,col 5)-(line 2279,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention, java.lang.String)",
      "begin_line": 2288,
      "end_line": 2310,
      "comment": "\n   * Creates a node representing a qualified name.\n   *\n   * @param name A qualified name (e.g. \"foo\" or \"foo.bar.baz\")\n   * @return A NAME or GETPROP node\n   ",
      "child_ranges": [
        "(line 2290,col 5)-(line 2290,col 35)",
        "(line 2291,col 5)-(line 2293,col 5)",
        "(line 2294,col 5)-(line 2294,col 63)",
        "(line 2295,col 5)-(line 2295,col 17)",
        "(line 2296,col 5)-(line 2307,col 27)",
        "(line 2309,col 5)-(line 2309,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2325,
      "end_line": 2331,
      "comment": "\n   * Creates a node representing a qualified name, copying over the source\n   * location information from the basis node and assigning the given original\n   * name to the node.\n   *\n   * @param name A qualified name (e.g. \"foo\" or \"foo.bar.baz\")\n   * @param basisNode The node that represents the name as currently found in\n   *     the AST.\n   * @param originalName The original name of the item being represented by the\n   *     NAME node. Used for debugging information.\n   *\n   * @return A NAME or GETPROP node\n   ",
      "child_ranges": [
        "(line 2328,col 5)-(line 2328,col 55)",
        "(line 2329,col 5)-(line 2329,col 55)",
        "(line 2330,col 5)-(line 2330,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(com.google.javascript.rhino.Node)",
      "begin_line": 2336,
      "end_line": 2344,
      "comment": "\n   * Gets the root node of a qualified name. Must be either NAME or THIS.\n   ",
      "child_ranges": [
        "(line 2337,col 5)-(line 2343,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.setDebugInformation(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2354,
      "end_line": 2358,
      "comment": "\n   * Sets the debug information (source file info and original name)\n   * on the given node.\n   *\n   * @param node The node on which to set the debug information.\n   * @param basisNode The basis node from which to copy the source file info.\n   * @param originalName The original name of the node.\n   ",
      "child_ranges": [
        "(line 2356,col 5)-(line 2356,col 47)",
        "(line 2357,col 5)-(line 2357,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String)",
      "begin_line": 2360,
      "end_line": 2367,
      "comment": "",
      "child_ranges": [
        "(line 2362,col 5)-(line 2362,col 34)",
        "(line 2363,col 5)-(line 2365,col 5)",
        "(line 2366,col 5)-(line 2366,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 2379,
      "end_line": 2381,
      "comment": "\n   * Creates a new node representing an *existing* name, copying over the source\n   * location information from the basis node.\n   *\n   * @param name The name for the new NAME node.\n   * @param srcref The node that represents the name as currently found in\n   *     the AST.\n   *\n   * @return The node created.\n   ",
      "child_ranges": [
        "(line 2380,col 5)-(line 2380,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2396,
      "end_line": 2402,
      "comment": "\n   * Creates a new node representing an *existing* name, copying over the source\n   * location information from the basis node and assigning the given original\n   * name to the node.\n   *\n   * @param name The name for the new NAME node.\n   * @param basisNode The node that represents the name as currently found in\n   *     the AST.\n   * @param originalName The original name of the item being represented by the\n   *     NAME node. Used for debugging information.\n   *\n   * @return The node created.\n   ",
      "child_ranges": [
        "(line 2399,col 5)-(line 2399,col 57)",
        "(line 2400,col 5)-(line 2400,col 59)",
        "(line 2401,col 5)-(line 2401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLatin(java.lang.String)",
      "begin_line": 2417,
      "end_line": 2426,
      "comment": " Test if all characters in the string are in the Basic Latin (aka ASCII)\n   * character set - that they have UTF-16 values equal to or below 0x7f.\n   * This check can find which identifiers with Unicode characters need to be\n   * escaped in order to allow resulting files to be processed by non-Unicode\n   * aware UNIX tools and editors.\n   * *\n   * See http://en.wikipedia.org/wiki/Latin_characters_in_Unicode\n   * for more on Basic Latin.\n   *\n   * @param s The string to be checked for ASCII-goodness.\n   *\n   * @return True if all characters in the string are in Basic Latin set.\n   ",
      "child_ranges": [
        "(line 2418,col 5)-(line 2418,col 25)",
        "(line 2419,col 5)-(line 2424,col 5)",
        "(line 2425,col 5)-(line 2425,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidSimpleName(java.lang.String)",
      "begin_line": 2431,
      "end_line": 2441,
      "comment": "\n   * Determines whether the given name is a valid variable name.\n   ",
      "child_ranges": [
        "(line 2432,col 5)-(line 2440,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(java.lang.String)",
      "begin_line": 2448,
      "end_line": 2459,
      "comment": " so that the results are different for es5 and es3.",
      "child_ranges": [
        "(line 2449,col 5)-(line 2451,col 5)",
        "(line 2452,col 5)-(line 2452,col 39)",
        "(line 2453,col 5)-(line 2457,col 5)",
        "(line 2458,col 5)-(line 2458,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidPropertyName(java.lang.String)",
      "begin_line": 2465,
      "end_line": 2467,
      "comment": "\n   * Determines whether the given name can appear on the right side of\n   * the dot operator. Many properties (like reserved words) cannot.\n   ",
      "child_ranges": [
        "(line 2466,col 5)-(line 2466,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VarCollector",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeUtil.Visitor"
      ],
      "begin_line": 2469,
      "end_line": 2484,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 2470,
      "end_line": 2470,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.VarCollector.visit(com.google.javascript.rhino.Node)",
      "begin_line": 2472,
      "end_line": 2483,
      "comment": "",
      "child_ranges": [
        "(line 2474,col 7)-(line 2482,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(com.google.javascript.rhino.Node)",
      "begin_line": 2489,
      "end_line": 2496,
      "comment": "\n   * Retrieves vars declared in the current node tree, excluding descent scopes.\n   ",
      "child_ranges": [
        "(line 2490,col 5)-(line 2490,col 48)",
        "(line 2491,col 5)-(line 2494,col 28)",
        "(line 2495,col 5)-(line 2495,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 2502,
      "end_line": 2507,
      "comment": "\n   * @return {@code true} if the node an assignment to a prototype property of\n   *     some constructor.\n   ",
      "child_ranges": [
        "(line 2503,col 5)-(line 2505,col 5)",
        "(line 2506,col 5)-(line 2506,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(com.google.javascript.rhino.Node)",
      "begin_line": 2512,
      "end_line": 2519,
      "comment": "\n   * @return Whether the node represents a qualified prototype property.\n   ",
      "child_ranges": [
        "(line 2513,col 5)-(line 2513,col 44)",
        "(line 2514,col 5)-(line 2516,col 5)",
        "(line 2517,col 5)-(line 2517,col 56)",
        "(line 2518,col 5)-(line 2518,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(com.google.javascript.rhino.Node)",
      "begin_line": 2524,
      "end_line": 2534,
      "comment": "\n   * @return The class name part of a qualified prototype name.\n   ",
      "child_ranges": [
        "(line 2525,col 5)-(line 2525,col 21)",
        "(line 2526,col 5)-(line 2532,col 5)",
        "(line 2533,col 5)-(line 2533,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(com.google.javascript.rhino.Node)",
      "begin_line": 2539,
      "end_line": 2544,
      "comment": "\n   * @return The string property name part of a qualified prototype name.\n   ",
      "child_ranges": [
        "(line 2540,col 5)-(line 2540,col 47)",
        "(line 2541,col 5)-(line 2541,col 59)",
        "(line 2542,col 5)-(line 2542,col 63)",
        "(line 2543,col 5)-(line 2543,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newUndefinedNode(com.google.javascript.rhino.Node)",
      "begin_line": 2550,
      "end_line": 2556,
      "comment": "\n   * Create a node for an empty result expression:\n   *   \"void 0\"\n   ",
      "child_ranges": [
        "(line 2551,col 5)-(line 2551,col 42)",
        "(line 2552,col 5)-(line 2554,col 5)",
        "(line 2555,col 5)-(line 2555,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newVarNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 2561,
      "end_line": 2571,
      "comment": "\n   * Create a VAR node containing the given name and initial value expression.\n   ",
      "child_ranges": [
        "(line 2562,col 5)-(line 2562,col 34)",
        "(line 2563,col 5)-(line 2567,col 5)",
        "(line 2568,col 5)-(line 2568,col 49)",
        "(line 2570,col 5)-(line 2570,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNameNode",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2576,
      "end_line": 2587,
      "comment": "\n   * A predicate for matching name nodes with the specified node.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 2577,
      "end_line": 2577,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNameNode.MatchNameNode(java.lang.String)",
      "begin_line": 2579,
      "end_line": 2581,
      "comment": "",
      "child_ranges": [
        "(line 2580,col 7)-(line 2580,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNameNode.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2583,
      "end_line": 2586,
      "comment": "",
      "child_ranges": [
        "(line 2585,col 7)-(line 2585,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNodeType",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2592,
      "end_line": 2603,
      "comment": "\n   * A predicate for matching nodes with the specified type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 2593,
      "end_line": 2593,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNodeType.MatchNodeType(int)",
      "begin_line": 2595,
      "end_line": 2597,
      "comment": "",
      "child_ranges": [
        "(line 2596,col 7)-(line 2596,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNodeType.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2599,
      "end_line": 2602,
      "comment": "",
      "child_ranges": [
        "(line 2601,col 7)-(line 2601,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchDeclaration",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2609,
      "end_line": 2614,
      "comment": "\n   * A predicate for matching var or function declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchDeclaration.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2610,
      "end_line": 2613,
      "comment": "",
      "child_ranges": [
        "(line 2612,col 7)-(line 2612,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNotFunction",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2619,
      "end_line": 2624,
      "comment": "\n   * A predicate for matching anything except function nodes.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNotFunction.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2620,
      "end_line": 2623,
      "comment": "",
      "child_ranges": [
        "(line 2622,col 7)-(line 2622,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MATCH_NOT_FUNCTION"
      ],
      "begin_line": 2626,
      "end_line": 2626,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MatchShallowStatement",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2631,
      "end_line": 2640,
      "comment": "\n   * A predicate for matching statements without exiting the current scope.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchShallowStatement.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2632,
      "end_line": 2639,
      "comment": "",
      "child_ranges": [
        "(line 2634,col 7)-(line 2634,col 34)",
        "(line 2635,col 7)-(line 2638,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(com.google.javascript.rhino.Node, int, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2645,
      "end_line": 2648,
      "comment": "\n   * Finds the number of times a type is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2647,col 5)-(line 2647,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNameReferenced(com.google.javascript.rhino.Node, java.lang.String, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2653,
      "end_line": 2657,
      "comment": "\n   * Whether a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2656,col 5)-(line 2656,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNameReferenced(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2662,
      "end_line": 2664,
      "comment": "\n   * Whether a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2663,col 5)-(line 2663,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2669,
      "end_line": 2672,
      "comment": "\n   * Finds the number of times a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2670,col 5)-(line 2671,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.has(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2677,
      "end_line": 2695,
      "comment": "\n   * @return Whether the predicate is true for the node or any of its children.\n   ",
      "child_ranges": [
        "(line 2680,col 5)-(line 2682,col 5)",
        "(line 2684,col 5)-(line 2686,col 5)",
        "(line 2688,col 5)-(line 2692,col 5)",
        "(line 2694,col 5)-(line 2694,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getCount(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2701,
      "end_line": 2716,
      "comment": "\n   * @return The number of times the the predicate is true for the node\n   * or any of its children.\n   ",
      "child_ranges": [
        "(line 2703,col 5)-(line 2703,col 18)",
        "(line 2705,col 5)-(line 2707,col 5)",
        "(line 2709,col 5)-(line 2713,col 5)",
        "(line 2715,col 5)-(line 2715,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Visitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2722,
      "end_line": 2724,
      "comment": "\n   * Interface for use with the visit method.\n   * @see #visit\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.Visitor.visit(com.google.javascript.rhino.Node)",
      "begin_line": 2723,
      "end_line": 2723,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.visitPreOrder(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeUtil.Visitor, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2730,
      "end_line": 2740,
      "comment": "\n   * A pre-order traversal, calling Visitor.visit for each child matching\n   * the predicate.\n   ",
      "child_ranges": [
        "(line 2733,col 5)-(line 2733,col 24)",
        "(line 2735,col 5)-(line 2739,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.visitPostOrder(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeUtil.Visitor, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2746,
      "end_line": 2756,
      "comment": "\n   * A post-order traversal, calling Visitor.visit for each child matching\n   * the predicate.\n   ",
      "child_ranges": [
        "(line 2749,col 5)-(line 2753,col 5)",
        "(line 2755,col 5)-(line 2755,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.hasFinally(com.google.javascript.rhino.Node)",
      "begin_line": 2761,
      "end_line": 2764,
      "comment": "\n   * @return Whether a TRY node has a finally block.\n   ",
      "child_ranges": [
        "(line 2762,col 5)-(line 2762,col 43)",
        "(line 2763,col 5)-(line 2763,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getCatchBlock(com.google.javascript.rhino.Node)",
      "begin_line": 2770,
      "end_line": 2773,
      "comment": "\n   * @return The BLOCK node containing the CATCH node (if any)\n   * of a TRY.\n   ",
      "child_ranges": [
        "(line 2771,col 5)-(line 2771,col 43)",
        "(line 2772,col 5)-(line 2772,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.hasCatchHandler(com.google.javascript.rhino.Node)",
      "begin_line": 2779,
      "end_line": 2782,
      "comment": "\n   * @return Whether BLOCK (from a TRY node) contains a CATCH.\n   * @see NodeUtil#getCatchBlock\n   ",
      "child_ranges": [
        "(line 2780,col 5)-(line 2780,col 45)",
        "(line 2781,col 5)-(line 2781,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionParameters(com.google.javascript.rhino.Node)",
      "begin_line": 2788,
      "end_line": 2792,
      "comment": "\n    * @param fnNode The function.\n    * @return The Node containing the Function parameters.\n    ",
      "child_ranges": [
        "(line 2790,col 5)-(line 2790,col 53)",
        "(line 2791,col 5)-(line 2791,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isConstantName(com.google.javascript.rhino.Node)",
      "begin_line": 2811,
      "end_line": 2813,
      "comment": "\n   * Returns true if a name node represents a constant variable.\n   *\n   * \u003cp\u003eDetermining whether a variable is constant has three steps:\n   * \u003col\u003e\n   * \u003cli\u003eIn CodingConventionAnnotator, any name that matches the\n   *     {@link CodingConvention#isConstant(String)} is annotated with an\n   *     IS_CONSTANT_NAME property.\n   * \u003cli\u003eThe normalize pass renames any variable with the IS_CONSTANT_NAME\n   *     annotation and that is initialized to a constant value with\n   *     a variable name including $$constant.\n   * \u003cli\u003eReturn true here if the variable includes $$constant in its name.\n   * \u003c/ol\u003e\n   *\n   * @param node A NAME or STRING node\n   * @return True if the variable is constant\n   ",
      "child_ranges": [
        "(line 2812,col 5)-(line 2812,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isConstantByConvention(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2816,
      "end_line": 2827,
      "comment": " Whether the given name is constant by coding convention. ",
      "child_ranges": [
        "(line 2818,col 5)-(line 2818,col 35)",
        "(line 2819,col 5)-(line 2826,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(com.google.javascript.rhino.Node)",
      "begin_line": 2832,
      "end_line": 2847,
      "comment": "\n   * Get the JSDocInfo for a function.\n   ",
      "child_ranges": [
        "(line 2833,col 5)-(line 2833,col 45)",
        "(line 2834,col 5)-(line 2834,col 40)",
        "(line 2835,col 5)-(line 2845,col 5)",
        "(line 2846,col 5)-(line 2846,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 2853,
      "end_line": 2860,
      "comment": "\n   * @param n The node.\n   * @return The source name property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2854,col 5)-(line 2854,col 29)",
        "(line 2855,col 5)-(line 2858,col 5)",
        "(line 2859,col 5)-(line 2859,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getSourceFile(com.google.javascript.rhino.Node)",
      "begin_line": 2866,
      "end_line": 2873,
      "comment": "\n   * @param n The node.\n   * @return The source name property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2867,col 5)-(line 2867,col 39)",
        "(line 2868,col 5)-(line 2871,col 5)",
        "(line 2872,col 5)-(line 2872,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getInputId(com.google.javascript.rhino.Node)",
      "begin_line": 2879,
      "end_line": 2885,
      "comment": "\n   * @param n The node.\n   * @return The InputId property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2880,col 5)-(line 2882,col 5)",
        "(line 2884,col 5)-(line 2884,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newCallNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node...)",
      "begin_line": 2890,
      "end_line": 2898,
      "comment": "\n   * A new CALL node with the \"FREE_CALL\" set based on call target.\n   ",
      "child_ranges": [
        "(line 2891,col 5)-(line 2891,col 44)",
        "(line 2892,col 5)-(line 2892,col 36)",
        "(line 2893,col 5)-(line 2893,col 52)",
        "(line 2894,col 5)-(line 2896,col 5)",
        "(line 2897,col 5)-(line 2897,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(com.google.javascript.rhino.Node)",
      "begin_line": 2904,
      "end_line": 2906,
      "comment": "\n   * @return Whether the node is known to be a value that is not referenced\n   * elsewhere.\n   ",
      "child_ranges": [
        "(line 2905,col 5)-(line 2905,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2913,
      "end_line": 2979,
      "comment": "\n   * @param locals A predicate to apply to unknown local values.\n   * @return Whether the node is known to be a value that is not a reference\n   *     outside the expression scope.\n   ",
      "child_ranges": [
        "(line 2914,col 5)-(line 2978,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNthSibling(com.google.javascript.rhino.Node, int)",
      "begin_line": 2986,
      "end_line": 2993,
      "comment": "\n   * Given the first sibling, this returns the nth\n   * sibling or null if no such sibling exists.\n   * This is like \"getChildAtIndex\" but returns null for non-existent indexes.\n   ",
      "child_ranges": [
        "(line 2987,col 5)-(line 2987,col 25)",
        "(line 2988,col 5)-(line 2991,col 5)",
        "(line 2992,col 5)-(line 2992,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(com.google.javascript.rhino.Node, int)",
      "begin_line": 2999,
      "end_line": 3003,
      "comment": "\n   * Given the function, this returns the nth\n   * argument or null if no such parameter exists.\n   ",
      "child_ranges": [
        "(line 3000,col 5)-(line 3000,col 52)",
        "(line 3001,col 5)-(line 3002,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(com.google.javascript.rhino.Node, int)",
      "begin_line": 3009,
      "end_line": 3013,
      "comment": "\n   * Given the new or call, this returns the nth\n   * argument of the call or null if no such argument exists.\n   ",
      "child_ranges": [
        "(line 3010,col 5)-(line 3010,col 48)",
        "(line 3011,col 5)-(line 3012,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCallOrNewTarget(com.google.javascript.rhino.Node)",
      "begin_line": 3018,
      "end_line": 3023,
      "comment": "\n   * Returns whether this is a target of a call or new.\n   ",
      "child_ranges": [
        "(line 3019,col 5)-(line 3019,col 37)",
        "(line 3020,col 5)-(line 3022,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isToStringMethodCall(com.google.javascript.rhino.Node)",
      "begin_line": 3025,
      "end_line": 3032,
      "comment": "",
      "child_ranges": [
        "(line 3026,col 5)-(line 3026,col 40)",
        "(line 3027,col 5)-(line 3030,col 5)",
        "(line 3031,col 5)-(line 3031,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(com.google.javascript.rhino.Node)",
      "begin_line": 3035,
      "end_line": 3063,
      "comment": " Find the best JSDoc for the given node. ",
      "child_ranges": [
        "(line 3036,col 5)-(line 3036,col 38)",
        "(line 3037,col 5)-(line 3061,col 5)",
        "(line 3062,col 5)-(line 3062,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValue(com.google.javascript.rhino.Node)",
      "begin_line": 3066,
      "end_line": 3087,
      "comment": " Find the l-value that the given r-value is being assigned to. ",
      "child_ranges": [
        "(line 3067,col 5)-(line 3067,col 32)",
        "(line 3068,col 5)-(line 3068,col 61)",
        "(line 3069,col 5)-(line 3085,col 5)",
        "(line 3086,col 5)-(line 3086,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getRValueOfLValue(com.google.javascript.rhino.Node)",
      "begin_line": 3090,
      "end_line": 3101,
      "comment": " Gets the r-value of a node returned by getBestLValue. ",
      "child_ranges": [
        "(line 3091,col 5)-(line 3091,col 32)",
        "(line 3092,col 5)-(line 3099,col 5)",
        "(line 3100,col 5)-(line 3100,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValueOwner(com.google.javascript.rhino.Node)",
      "begin_line": 3104,
      "end_line": 3115,
      "comment": " Get the owner of the given l-value node. ",
      "child_ranges": [
        "(line 3105,col 5)-(line 3107,col 5)",
        "(line 3108,col 5)-(line 3112,col 5)",
        "(line 3114,col 5)-(line 3114,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValueName(com.google.javascript.rhino.Node)",
      "begin_line": 3118,
      "end_line": 3133,
      "comment": " Get the name of the given l-value node. ",
      "child_ranges": [
        "(line 3119,col 5)-(line 3121,col 5)",
        "(line 3122,col 5)-(line 3131,col 5)",
        "(line 3132,col 5)-(line 3132,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(com.google.javascript.rhino.Node)",
      "begin_line": 3138,
      "end_line": 3179,
      "comment": "\n   * @returns false iff the result of the expression is not consumed.\n   ",
      "child_ranges": [
        "(line 3140,col 5)-(line 3140,col 35)",
        "(line 3141,col 5)-(line 3177,col 5)",
        "(line 3178,col 5)-(line 3178,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(com.google.javascript.rhino.Node)",
      "begin_line": 3186,
      "end_line": 3230,
      "comment": "\n   * @param n The expression to check.\n   * @return Whether the expression is unconditionally executed only once in the\n   *     containing execution scope.\n   ",
      "child_ranges": [
        "(line 3187,col 5)-(line 3228,col 42)",
        "(line 3229,col 5)-(line 3229,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.booleanNode(boolean)",
      "begin_line": 3235,
      "end_line": 3237,
      "comment": "\n   * @return An appropriate AST node for the boolean value.\n   ",
      "child_ranges": [
        "(line 3236,col 5)-(line 3236,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.numberNode(double, com.google.javascript.rhino.Node)",
      "begin_line": 3242,
      "end_line": 3257,
      "comment": "\n   * @return An appropriate AST node for the double value.\n   ",
      "child_ranges": [
        "(line 3243,col 5)-(line 3243,col 16)",
        "(line 3244,col 5)-(line 3252,col 5)",
        "(line 3253,col 5)-(line 3255,col 5)",
        "(line 3256,col 5)-(line 3256,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNaN(com.google.javascript.rhino.Node)",
      "begin_line": 3259,
      "end_line": 3267,
      "comment": "",
      "child_ranges": [
        "(line 3260,col 5)-(line 3265,col 5)",
        "(line 3266,col 5)-(line 3266,col 17)"
      ]
    }
  ]
}