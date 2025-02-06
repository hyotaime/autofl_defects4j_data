{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NodeUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 3378,
      "comment": "\n * NodeUtil contains generally useful AST utilities.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_POSITIVE_INTEGER_NUMBER"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JSC_PROPERTY_NAME_FN"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LARGEST_BASIC_LATIN"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONSTRUCTORS_WITHOUT_SIDE_EFFECTS"
      ],
      "begin_line": 58,
      "end_line": 65,
      "comment": " the set of builtin constructors that don\u0027t have side effects. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.NodeUtil()",
      "begin_line": 68,
      "end_line": 68,
      "comment": " Utility class; do not instantiate.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 116,
      "comment": "\n   * Gets the boolean value of a node that represents a expression. This method\n   * effectively emulates the \u003ccode\u003eBoolean()\u003c/code\u003e JavaScript cast function.\n   * Note: unlike getBooleanValue this function does not return UNKNOWN\n   * for expressions with side-effects.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 115,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(com.google.javascript.rhino.Node)",
      "begin_line": 124,
      "end_line": 170,
      "comment": "\n   * Gets the boolean value of a node that represents a literal. This method\n   * effectively emulates the \u003ccode\u003eBoolean()\u003c/code\u003e JavaScript cast function\n   * except it return UNKNOWN for known values with side-effects, use\n   * getImpureBooleanValue if you don\u0027t care about side-effects.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 167,col 5)",
        "(line 169,col 5)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringValue(com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 222,
      "comment": "\n   * Gets the value of a node as a String, or null if it cannot be converted.\n   * When it returns a non-null String, this method effectively emulates the\n   * \u003ccode\u003eString()\u003c/code\u003e JavaScript cast function.\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringValue(double)",
      "begin_line": 224,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 34)",
        "(line 228,col 5)-(line 232,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(com.google.javascript.rhino.Node)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n   * When converting arrays to string using Array.prototype.toString or\n   * Array.prototype.join, the rules for conversion to String are different\n   * than converting each element individually.  Specifically, \"null\" and\n   * \"undefined\" are converted to an empty string.\n   * @param n A node that is a member of an Array.\n   * @return The string representation.\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 245,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.arrayToString(com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 41)",
        "(line 250,col 5)-(line 250,col 47)",
        "(line 251,col 5)-(line 260,col 5)",
        "(line 261,col 5)-(line 261,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNumberValue(com.google.javascript.rhino.Node)",
      "begin_line": 269,
      "end_line": 326,
      "comment": "\n   * Gets the value of a node as a Number, or null if it cannot be converted.\n   * When it returns a non-null Double, this method effectively emulates the\n   * \u003ccode\u003eNumber()\u003c/code\u003e JavaScript cast function.\n   ",
      "child_ranges": [
        "(line 270,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 325,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getStringNumberValue(java.lang.String)",
      "begin_line": 328,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 332,col 5)",
        "(line 334,col 5)-(line 334,col 45)",
        "(line 336,col 5)-(line 338,col 5)",
        "(line 340,col 5)-(line 349,col 5)",
        "(line 351,col 5)-(line 357,col 5)",
        "(line 361,col 5)-(line 365,col 5)",
        "(line 367,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(java.lang.String)",
      "begin_line": 374,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 18)",
        "(line 376,col 5)-(line 376,col 25)",
        "(line 377,col 5)-(line 380,col 5)",
        "(line 381,col 5)-(line 384,col 5)",
        "(line 385,col 5)-(line 385,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(int)",
      "begin_line": 391,
      "end_line": 409,
      "comment": "\n   * Copied from Rhino\u0027s ScriptRuntime\n   ",
      "child_ranges": [
        "(line 392,col 5)-(line 408,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 426,
      "end_line": 445,
      "comment": "\n   * Gets the function\u0027s name. This method recognizes five forms:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code function name() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003c/ul\u003e\n   * In two last cases with named function expressions, the second name is\n   * returned (the variable of qualified name).\n   *\n   * @param n a node whose type is {@link Token#FUNCTION}\n   * @return the function\u0027s name, or {@code null} if it has no name\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 45)",
        "(line 428,col 5)-(line 428,col 32)",
        "(line 429,col 5)-(line 444,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 462,
      "end_line": 485,
      "comment": "\n   * Gets the function\u0027s name. This method recognizes the forms:\n   * \u003cul\u003e\n   * \u003cli\u003e{@code \u0026#123;\u0027name\u0027: function() ...\u0026#125;}\u003c/li\u003e\n   * \u003cli\u003e{@code \u0026#123;name: function() ...\u0026#125;}\u003c/li\u003e\n   * \u003cli\u003e{@code function name() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name \u003d function() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code var name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003cli\u003e{@code qualified.name2 \u003d function name1() ...}\u003c/li\u003e\n   * \u003c/ul\u003e\n   *\n   * @param n a node whose type is {@link Token#FUNCTION}\n   * @return the function\u0027s name, or {@code null} if it has no name\n   ",
      "child_ranges": [
        "(line 463,col 5)-(line 465,col 5)",
        "(line 467,col 5)-(line 467,col 37)",
        "(line 468,col 5)-(line 470,col 5)",
        "(line 473,col 5)-(line 473,col 32)",
        "(line 474,col 5)-(line 482,col 5)",
        "(line 484,col 5)-(line 484,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isImmutableValue(com.google.javascript.rhino.Node)",
      "begin_line": 491,
      "end_line": 515,
      "comment": "\n   * Returns true if this is an immutable value.\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 512,col 5)",
        "(line 514,col 5)-(line 514,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(com.google.javascript.rhino.Node)",
      "begin_line": 520,
      "end_line": 531,
      "comment": "\n   * Returns true if the operator on this node is symmetric\n   ",
      "child_ranges": [
        "(line 521,col 5)-(line 529,col 5)",
        "(line 530,col 5)-(line 530,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isRelationalOperation(com.google.javascript.rhino.Node)",
      "begin_line": 537,
      "end_line": 546,
      "comment": "\n   * Returns true if the operator on this node is relational.\n   * the returned set does not include the equalities.\n   ",
      "child_ranges": [
        "(line 538,col 5)-(line 544,col 5)",
        "(line 545,col 5)-(line 545,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getInverseOperator(int)",
      "begin_line": 552,
      "end_line": 564,
      "comment": "\n   * Returns the inverse of an operator if it is invertible.\n   * ex. \u0027\u003e\u0027 \u003d\u003d\u003e \u0027\u003c\u0027\n   ",
      "child_ranges": [
        "(line 553,col 5)-(line 562,col 5)",
        "(line 563,col 5)-(line 563,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLiteralValue(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 588,
      "end_line": 628,
      "comment": "\n   * Returns true if this is a literal value. We define a literal value\n   * as any node that evaluates to the same thing regardless of when or\n   * where it is evaluated. So /xyz/ and [3, 5] are literals, but\n   * the name a is not.\n   *\n   * Function literals do not meet this definition, because they\n   * lexically capture variables. For example, if you have\n   * \u003ccode\u003e\n   * function() { return a; }\n   * \u003c/code\u003e\n   * If it is evaluated in a different scope, then it\n   * captures a different variable. Even if the function did not read\n   * any captured variables directly, it would still fail this definition,\n   * because it affects the lifecycle of variables in the enclosing scope.\n   *\n   * However, a function literal with respect to a particular scope is\n   * a literal.\n   *\n   * @param includeFunctions If true, all function expressions will be\n   *     treated as literals.\n   ",
      "child_ranges": [
        "(line 589,col 5)-(line 627,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidDefineValue(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 636,
      "end_line": 682,
      "comment": "\n   * Determines whether the given value may be assigned to a define.\n   *\n   * @param val The value being assigned.\n   * @param defines The list of names of existing defines.\n   ",
      "child_ranges": [
        "(line 637,col 5)-(line 680,col 5)",
        "(line 681,col 5)-(line 681,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isEmptyBlock(com.google.javascript.rhino.Node)",
      "begin_line": 689,
      "end_line": 700,
      "comment": "\n   * Returns whether this a BLOCK node with no children.\n   *\n   * @param block The node.\n   ",
      "child_ranges": [
        "(line 690,col 5)-(line 692,col 5)",
        "(line 694,col 5)-(line 698,col 5)",
        "(line 699,col 5)-(line 699,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSimpleOperator(com.google.javascript.rhino.Node)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 703,col 5)-(line 703,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(int)",
      "begin_line": 711,
      "end_line": 747,
      "comment": "\n   * A \"simple\" operator is one whose children are expressions,\n   * has no direct side-effects (unlike \u0027+\u003d\u0027), and has no\n   * conditional aspects (unlike \u0027||\u0027).\n   ",
      "child_ranges": [
        "(line 712,col 5)-(line 746,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.rhino.Node)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\n   * Creates an EXPR_RESULT.\n   *\n   * @param child The expression itself.\n   * @return Newly created EXPR node with the child as subexpression.\n   ",
      "child_ranges": [
        "(line 756,col 5)-(line 756,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(com.google.javascript.rhino.Node)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n   * Returns true if the node may create new mutable state, or change existing\n   * state.\n   *\n   * @see \u003ca href\u003d\"http://www.xkcd.org/326/\"\u003eXKCD Cartoon\u003c/a\u003e\n   ",
      "child_ranges": [
        "(line 766,col 5)-(line 766,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 770,col 5)-(line 770,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n   * Returns true if the node which may have side effects when executed.\n   ",
      "child_ranges": [
        "(line 777,col 5)-(line 777,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 780,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 781,col 5)-(line 781,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 790,
      "end_line": 935,
      "comment": "\n   * Returns true if some node in n\u0027s subtree changes application state.\n   * If {@code checkForNewObjects} is true, we assume that newly created\n   * mutable objects (like object literals) change state. Otherwise, we assume\n   * that they have no side effects.\n   ",
      "child_ranges": [
        "(line 794,col 5)-(line 926,col 5)",
        "(line 928,col 5)-(line 932,col 5)",
        "(line 934,col 5)-(line 934,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n   * Do calls to this constructor have side effects?\n   *\n   * @param callNode - constructor call node\n   ",
      "child_ranges": [
        "(line 943,col 5)-(line 943,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 946,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 948,col 5)-(line 951,col 5)",
        "(line 953,col 5)-(line 955,col 5)",
        "(line 957,col 5)-(line 960,col 5)",
        "(line 962,col 5)-(line 962,col 45)",
        "(line 963,col 5)-(line 966,col 5)",
        "(line 968,col 5)-(line 968,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BUILTIN_FUNCTIONS_WITHOUT_SIDEEFFECTS"
      ],
      "begin_line": 974,
      "end_line": 976,
      "comment": " TODO(johnlenz): consider adding an extern annotation for this."
    },
    {
      "type": "field",
      "varNames": [
        "OBJECT_METHODS_WITHOUT_SIDEEFFECTS"
      ],
      "begin_line": 977,
      "end_line": 978,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "REGEXP_METHODS"
      ],
      "begin_line": 979,
      "end_line": 980,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_REGEXP_METHODS"
      ],
      "begin_line": 981,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n   * Returns true if calls to this function have side effects.\n   *\n   * @param callNode - function call node\n   ",
      "child_ranges": [
        "(line 990,col 5)-(line 990,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1000,
      "end_line": 1062,
      "comment": "\n   * Returns true if calls to this function have side effects.\n   *\n   * @param callNode The call node to inspected.\n   * @param compiler A compiler object to provide program state changing\n   *     context information. Can be null.\n   ",
      "child_ranges": [
        "(line 1002,col 5)-(line 1005,col 5)",
        "(line 1007,col 5)-(line 1009,col 5)",
        "(line 1011,col 5)-(line 1014,col 5)",
        "(line 1016,col 5)-(line 1016,col 45)",
        "(line 1019,col 5)-(line 1059,col 5)",
        "(line 1061,col 5)-(line 1061,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.callHasLocalResult(com.google.javascript.rhino.Node)",
      "begin_line": 1067,
      "end_line": 1070,
      "comment": "\n   * @return Whether the call has a local result.\n   ",
      "child_ranges": [
        "(line 1068,col 5)-(line 1068,col 41)",
        "(line 1069,col 5)-(line 1069,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newHasLocalResult(com.google.javascript.rhino.Node)",
      "begin_line": 1075,
      "end_line": 1078,
      "comment": "\n   * @return Whether the new has a local result.\n   ",
      "child_ranges": [
        "(line 1076,col 5)-(line 1076,col 40)",
        "(line 1077,col 5)-(line 1077,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node)",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\n   * Returns true if the current node\u0027s type implies side effects.\n   *\n   * This is a non-recursive version of the may have side effects\n   * check; used to check wherever the current node\u0027s type is one of\n   * the reason\u0027s why a subtree has side effects.\n   ",
      "child_ranges": [
        "(line 1088,col 5)-(line 1088,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 1091,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 5)-(line 1094,col 5)",
        "(line 1096,col 5)-(line 1111,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.allArgsUnescapedLocal(com.google.javascript.rhino.Node)",
      "begin_line": 1114,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 5)-(line 1120,col 5)",
        "(line 1121,col 5)-(line 1121,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.canBeSideEffected(com.google.javascript.rhino.Node)",
      "begin_line": 1128,
      "end_line": 1131,
      "comment": "\n   * @return Whether the tree can be affected by side-effects or\n   * has side-effects.\n   ",
      "child_ranges": [
        "(line 1129,col 5)-(line 1129,col 50)",
        "(line 1130,col 5)-(line 1130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.canBeSideEffected(com.google.javascript.rhino.Node, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 1139,
      "end_line": 1171,
      "comment": "\n   * @param knownConstants A set of names known to be constant value at\n   * node \u0027n\u0027 (such as locals that are last written before n can execute).\n   * @return Whether the tree can be affected by side-effects or\n   * has side-effects.\n   ",
      "child_ranges": [
        "(line 1140,col 5)-(line 1162,col 5)",
        "(line 1164,col 5)-(line 1168,col 5)",
        "(line 1170,col 5)-(line 1170,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.precedence(int)",
      "begin_line": 1190,
      "end_line": 1197,
      "comment": "\n   *  0 comma ,\n   *  1 assignment \u003d +\u003d -\u003d *\u003d /\u003d %\u003d \u003c\u003c\u003d \u003e\u003e\u003d \u003e\u003e\u003e\u003d \u0026\u003d ^\u003d |\u003d\n   *  2 conditional ?:\n   *  3 logical-or ||\n   *  4 logical-and \u0026\u0026\n   *  5 bitwise-or |\n   *  6 bitwise-xor ^\n   *  7 bitwise-and \u0026\n   *  8 equality \u003d\u003d !\u003d\n   *  9 relational \u003c \u003c\u003d \u003e \u003e\u003d\n   * 10 bitwise shift \u003c\u003c \u003e\u003e \u003e\u003e\u003e\n   * 11 addition/subtraction + -\n   * 12 multiply/divide * / %\n   * 13 negation/increment ! ~ - ++ --\n   * 14 call, member () [] .\n   ",
      "child_ranges": [
        "(line 1191,col 5)-(line 1191,col 49)",
        "(line 1192,col 5)-(line 1194,col 5)",
        "(line 1195,col 5)-(line 1196,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.precedenceWithDefault(int)",
      "begin_line": 1199,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 5)-(line 1273,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 1276,
      "end_line": 1284,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 5)-(line 1282,col 5)",
        "(line 1283,col 5)-(line 1283,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(com.google.javascript.rhino.Node)",
      "begin_line": 1286,
      "end_line": 1288,
      "comment": "",
      "child_ranges": [
        "(line 1287,col 5)-(line 1287,col 40)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "IMMUTABLE_PREDICATE"
      ],
      "begin_line": 1290,
      "end_line": 1295,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.Anonymous-49f79a97-bfe1-4861-987c-23f209b9e03f.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1291,
      "end_line": 1294,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 7)-(line 1293,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isImmutableResult(com.google.javascript.rhino.Node)",
      "begin_line": 1297,
      "end_line": 1299,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 5)-(line 1298,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.allResultsMatch(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1305,
      "end_line": 1322,
      "comment": "\n   * Apply the supplied predicate against\n   * all possible result Nodes of the expression.\n   ",
      "child_ranges": [
        "(line 1306,col 5)-(line 1321,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.anyResultsMatch(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 1328,
      "end_line": 1345,
      "comment": "\n   * Apply the supplied predicate against\n   * all possible result Nodes of the expression.\n   ",
      "child_ranges": [
        "(line 1329,col 5)-(line 1344,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NumbericResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1347,
      "end_line": 1352,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1348,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1350,col 7)-(line 1350,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "NUMBERIC_RESULT_PREDICATE"
      ],
      "begin_line": 1354,
      "end_line": 1355,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNumericResult(com.google.javascript.rhino.Node)",
      "begin_line": 1360,
      "end_line": 1362,
      "comment": "\n   * Returns true if the result of node evaluation is always a number\n   ",
      "child_ranges": [
        "(line 1361,col 5)-(line 1361,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1364,
      "end_line": 1398,
      "comment": "",
      "child_ranges": [
        "(line 1365,col 5)-(line 1397,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BooleanResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1400,
      "end_line": 1405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1401,
      "end_line": 1404,
      "comment": "",
      "child_ranges": [
        "(line 1403,col 7)-(line 1403,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "BOOLEAN_RESULT_PREDICATE"
      ],
      "begin_line": 1407,
      "end_line": 1408,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBooleanResult(com.google.javascript.rhino.Node)",
      "begin_line": 1413,
      "end_line": 1415,
      "comment": "\n   * @return Whether the result of node evaluation is always a boolean\n   ",
      "child_ranges": [
        "(line 1414,col 5)-(line 1414,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1417,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1418,col 5)-(line 1441,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MayBeStringResultPredicate",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 1446,
      "end_line": 1451,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate.apply(com.google.javascript.rhino.Node)",
      "begin_line": 1447,
      "end_line": 1450,
      "comment": "",
      "child_ranges": [
        "(line 1449,col 7)-(line 1449,col 34)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MAY_BE_STRING_PREDICATE"
      ],
      "begin_line": 1453,
      "end_line": 1454,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeString(com.google.javascript.rhino.Node)",
      "begin_line": 1459,
      "end_line": 1461,
      "comment": "\n   * @returns Whether the results is possibly a string.\n   ",
      "child_ranges": [
        "(line 1460,col 5)-(line 1460,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeString(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 1463,
      "end_line": 1469,
      "comment": "",
      "child_ranges": [
        "(line 1464,col 5)-(line 1468,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(com.google.javascript.rhino.Node)",
      "begin_line": 1471,
      "end_line": 1474,
      "comment": "",
      "child_ranges": [
        "(line 1472,col 5)-(line 1473,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isAssociative(int)",
      "begin_line": 1482,
      "end_line": 1494,
      "comment": "\n   * Returns true if the operator is associative.\n   * e.g. (a * b) * c \u003d a * (b * c)\n   * Note: \"+\" is not associative because it is also the concatenation\n   * for strings. e.g. \"a\" + (1 + 2) is not \"a\" + 1 + 2\n   ",
      "child_ranges": [
        "(line 1483,col 5)-(line 1493,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCommutative(int)",
      "begin_line": 1503,
      "end_line": 1513,
      "comment": "\n   * Returns true if the operator is commutative.\n   * e.g. (a * b) * c \u003d c * (b * a)\n   * Note 1: \"+\" is not commutative because it is also the concatenation\n   * for strings. e.g. \"a\" + (1 + 2) is not \"a\" + 1 + 2\n   * Note 2: only operations on literals and pure functions are commutative.\n   ",
      "child_ranges": [
        "(line 1504,col 5)-(line 1512,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isAssignmentOp(com.google.javascript.rhino.Node)",
      "begin_line": 1515,
      "end_line": 1532,
      "comment": "",
      "child_ranges": [
        "(line 1516,col 5)-(line 1530,col 5)",
        "(line 1531,col 5)-(line 1531,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(com.google.javascript.rhino.Node)",
      "begin_line": 1534,
      "end_line": 1560,
      "comment": "",
      "child_ranges": [
        "(line 1535,col 5)-(line 1558,col 5)",
        "(line 1559,col 5)-(line 1559,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsFunction(com.google.javascript.rhino.Node)",
      "begin_line": 1566,
      "end_line": 1568,
      "comment": "\n   * Determines if the given node contains a function statement or function\n   * expression.\n   ",
      "child_ranges": [
        "(line 1567,col 5)-(line 1567,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.referencesThis(com.google.javascript.rhino.Node)",
      "begin_line": 1573,
      "end_line": 1576,
      "comment": "\n   * Returns true if the shallow scope contains references to \u0027this\u0027 keyword\n   ",
      "child_ranges": [
        "(line 1574,col 5)-(line 1574,col 57)",
        "(line 1575,col 5)-(line 1575,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isGet(com.google.javascript.rhino.Node)",
      "begin_line": 1581,
      "end_line": 1583,
      "comment": "\n   * Is this a GETPROP or GETELEM node?\n   ",
      "child_ranges": [
        "(line 1582,col 5)-(line 1582,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1591,
      "end_line": 1595,
      "comment": "\n   * Is this node the name of a variable being declared?\n   *\n   * @param n The node\n   * @return True if {@code n} is NAME and {@code parent} is VAR\n   ",
      "child_ranges": [
        "(line 1594,col 5)-(line 1594,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getAssignedValue(com.google.javascript.rhino.Node)",
      "begin_line": 1601,
      "end_line": 1611,
      "comment": "\n   * For an assignment or variable declaration get the assigned value.\n   * @return The value node representing the new value.\n   ",
      "child_ranges": [
        "(line 1602,col 5)-(line 1602,col 41)",
        "(line 1603,col 5)-(line 1603,col 32)",
        "(line 1604,col 5)-(line 1610,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExprAssign(com.google.javascript.rhino.Node)",
      "begin_line": 1620,
      "end_line": 1623,
      "comment": "\n   * Is this node an assignment expression statement?\n   *\n   * @param n The node\n   * @return True if {@code n} is EXPR_RESULT and {@code n}\u0027s\n   *     first child is ASSIGN\n   ",
      "child_ranges": [
        "(line 1621,col 5)-(line 1622,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExprCall(com.google.javascript.rhino.Node)",
      "begin_line": 1632,
      "end_line": 1635,
      "comment": "\n   * Is this node a call expression statement?\n   *\n   * @param n The node\n   * @return True if {@code n} is EXPR_RESULT and {@code n}\u0027s\n   *     first child is CALL\n   ",
      "child_ranges": [
        "(line 1633,col 5)-(line 1634,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isForIn(com.google.javascript.rhino.Node)",
      "begin_line": 1640,
      "end_line": 1643,
      "comment": "\n   * @return Whether the node represents a FOR-IN loop.\n   ",
      "child_ranges": [
        "(line 1641,col 5)-(line 1642,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLoopStructure(com.google.javascript.rhino.Node)",
      "begin_line": 1648,
      "end_line": 1657,
      "comment": "\n   * Determines whether the given node is a FOR, DO, or WHILE node.\n   ",
      "child_ranges": [
        "(line 1649,col 5)-(line 1656,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1664,
      "end_line": 1674,
      "comment": "\n   * @param n The node to inspect.\n   * @return If the node, is a FOR, WHILE, or DO, it returns the node for\n   * the code BLOCK, null otherwise.\n   ",
      "child_ranges": [
        "(line 1665,col 5)-(line 1673,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isWithinLoop(com.google.javascript.rhino.Node)",
      "begin_line": 1680,
      "end_line": 1691,
      "comment": "\n   * @return Whether the specified node has a loop parent that\n   * is within the current scope.\n   ",
      "child_ranges": [
        "(line 1681,col 5)-(line 1689,col 5)",
        "(line 1690,col 5)-(line 1690,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isControlStructure(com.google.javascript.rhino.Node)",
      "begin_line": 1696,
      "end_line": 1713,
      "comment": "\n   * Determines whether the given node is a FOR, DO, WHILE, WITH, or IF node.\n   ",
      "child_ranges": [
        "(line 1697,col 5)-(line 1712,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1719,
      "end_line": 1743,
      "comment": "\n   * Determines whether the given node is code node for FOR, DO,\n   * WHILE, WITH, or IF node.\n   ",
      "child_ranges": [
        "(line 1720,col 5)-(line 1742,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getConditionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1750,
      "end_line": 1769,
      "comment": "\n   * Gets the condition of an ON_TRUE / ON_FALSE CFG edge.\n   * @param n a node with an outgoing conditional CFG edge\n   * @return the condition node or null if the condition is not obviously a node\n   ",
      "child_ranges": [
        "(line 1751,col 5)-(line 1767,col 5)",
        "(line 1768,col 5)-(line 1768,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatementBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1774,
      "end_line": 1776,
      "comment": "\n   * @return Whether the node is of a type that contain other statements.\n   ",
      "child_ranges": [
        "(line 1775,col 5)-(line 1775,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatement(com.google.javascript.rhino.Node)",
      "begin_line": 1781,
      "end_line": 1783,
      "comment": "\n   * @return Whether the node is used as a statement.\n   ",
      "child_ranges": [
        "(line 1782,col 5)-(line 1782,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isStatementParent(com.google.javascript.rhino.Node)",
      "begin_line": 1785,
      "end_line": 1798,
      "comment": "",
      "child_ranges": [
        "(line 1789,col 5)-(line 1789,col 45)",
        "(line 1790,col 5)-(line 1797,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isSwitchCase(com.google.javascript.rhino.Node)",
      "begin_line": 1801,
      "end_line": 1803,
      "comment": " Whether the node is part of a switch statement. ",
      "child_ranges": [
        "(line 1802,col 5)-(line 1802,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isReferenceName(com.google.javascript.rhino.Node)",
      "begin_line": 1809,
      "end_line": 1811,
      "comment": "\n   * @return Whether the name is a reference to a variable, function or\n   *       function parameter (not a label or a empty function expression name).\n   ",
      "child_ranges": [
        "(line 1810,col 5)-(line 1810,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1814,
      "end_line": 1817,
      "comment": " Whether the child node is the FINALLY block of a try. ",
      "child_ranges": [
        "(line 1815,col 5)-(line 1816,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(com.google.javascript.rhino.Node)",
      "begin_line": 1820,
      "end_line": 1824,
      "comment": " Whether the node is a CATCH container BLOCK. ",
      "child_ranges": [
        "(line 1821,col 5)-(line 1821,col 32)",
        "(line 1822,col 5)-(line 1823,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.removeChild(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1827,
      "end_line": 1880,
      "comment": " Safely remove children while maintaining a valid node structure. ",
      "child_ranges": [
        "(line 1828,col 5)-(line 1879,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.maybeAddFinally(com.google.javascript.rhino.Node)",
      "begin_line": 1885,
      "end_line": 1890,
      "comment": "\n   * Add a finally block if one does not exist.\n   ",
      "child_ranges": [
        "(line 1886,col 5)-(line 1886,col 46)",
        "(line 1887,col 5)-(line 1889,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.tryMergeBlock(com.google.javascript.rhino.Node)",
      "begin_line": 1896,
      "end_line": 1913,
      "comment": "\n   * Merge a block with its parent block.\n   * @return Whether the block was removed.\n   ",
      "child_ranges": [
        "(line 1897,col 5)-(line 1897,col 46)",
        "(line 1898,col 5)-(line 1898,col 36)",
        "(line 1901,col 5)-(line 1912,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCallOrNew(com.google.javascript.rhino.Node)",
      "begin_line": 1919,
      "end_line": 1921,
      "comment": "\n   * @param node A node\n   * @return Whether the call is a NEW or CALL node.\n   ",
      "child_ranges": [
        "(line 1920,col 5)-(line 1920,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionBody(com.google.javascript.rhino.Node)",
      "begin_line": 1926,
      "end_line": 1929,
      "comment": "\n   * Return a BLOCK node for the given FUNCTION node.\n   ",
      "child_ranges": [
        "(line 1927,col 5)-(line 1927,col 49)",
        "(line 1928,col 5)-(line 1928,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1936,
      "end_line": 1938,
      "comment": "\n   * Is this node a function declaration? A function declaration is a function\n   * that has a name that is added to the current scope (i.e. a function that\n   * is not part of a expression; see {@link #isFunctionExpression}).\n   ",
      "child_ranges": [
        "(line 1937,col 5)-(line 1937,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 1945,
      "end_line": 1949,
      "comment": "\n   * Is this node a hoisted function declaration? A function declaration in the\n   * scope root is hoisted to the top of the scope.\n   * See {@link #isFunctionDeclaration}).\n   ",
      "child_ranges": [
        "(line 1946,col 5)-(line 1948,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1974,
      "end_line": 1976,
      "comment": "\n   * Is a FUNCTION node an function expression? An function expression is one\n   * that has either no name or a name that is not added to the current scope.\n   *\n   * \u003cp\u003eSome examples of function expressions:\n   * \u003cpre\u003e\n   * (function () {})\n   * (function f() {})()\n   * [ function f() {} ]\n   * var f \u003d function f() {};\n   * for (function f() {};;) {}\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eSome examples of functions that are \u003cem\u003enot\u003c/em\u003e expressions:\n   * \u003cpre\u003e\n   * function f() {}\n   * if (x); else function f() {}\n   * for (;;) { function f() {} }\n   * \u003c/pre\u003e\n   *\n   * @param n A node\n   * @return Whether n is an function used within an expression.\n   ",
      "child_ranges": [
        "(line 1975,col 5)-(line 1975,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isBleedingFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 1982,
      "end_line": 1985,
      "comment": "\n   * Returns whether this is a bleeding function (an anonymous named function\n   * that bleeds into the inner scope).\n   ",
      "child_ranges": [
        "(line 1983,col 5)-(line 1984,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(com.google.javascript.rhino.Node)",
      "begin_line": 1993,
      "end_line": 1995,
      "comment": "\n   * Determines if a node is a function expression that has an empty body.\n   *\n   * @param node a node\n   * @return whether the given node is a function expression that is empty\n   ",
      "child_ranges": [
        "(line 1994,col 5)-(line 1994,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(com.google.javascript.rhino.Node)",
      "begin_line": 2001,
      "end_line": 2008,
      "comment": "\n   * Determines if a function takes a variable number of arguments by\n   * looking for references to the \"arguments\" var_args object.\n   ",
      "child_ranges": [
        "(line 2003,col 5)-(line 2003,col 55)",
        "(line 2004,col 5)-(line 2007,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2015,
      "end_line": 2027,
      "comment": "\n   * @return Whether node is a call to methodName.\n   *    a.f(...)\n   *    a[\u0027f\u0027](...)\n   ",
      "child_ranges": [
        "(line 2016,col 5)-(line 2025,col 5)",
        "(line 2026,col 5)-(line 2026,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(com.google.javascript.rhino.Node)",
      "begin_line": 2035,
      "end_line": 2037,
      "comment": "\n   * @return Whether the callNode represents an expression in the form of:\n   *    x.call(...)\n   *    x[\u0027call\u0027](...)\n   ",
      "child_ranges": [
        "(line 2036,col 5)-(line 2036,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(com.google.javascript.rhino.Node)",
      "begin_line": 2044,
      "end_line": 2046,
      "comment": "\n   * @return Whether the callNode represents an expression in the form of:\n   *    x.apply(...)\n   *    x[\u0027apply\u0027](...)\n   ",
      "child_ranges": [
        "(line 2045,col 5)-(line 2045,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2057,
      "end_line": 2060,
      "comment": "\n   * Determines whether this node is strictly on the left hand side of an assign\n   * or var initialization. Notably, this does not include all L-values, only\n   * statements where the node is used only as an L-value.\n   *\n   * @param n The node\n   * @param parent Parent of the node\n   * @return True if n is the left hand of an assign\n   ",
      "child_ranges": [
        "(line 2058,col 5)-(line 2059,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLValue(com.google.javascript.rhino.Node)",
      "begin_line": 2075,
      "end_line": 2090,
      "comment": "\n   * Determines whether this node is used as an L-value. Notice that sometimes\n   * names are used as both L-values and R-values.\n   *\n   * We treat \"var x;\" as a pseudo-L-value, which kind of makes sense if you\n   * treat it as \"assignment to \u0027undefined\u0027 at the top of the scope\". But if\n   * we\u0027re honest with ourselves, it doesn\u0027t make sense, and we only do this\n   * because it makes sense to treat this as syntactically similar to\n   * \"var x \u003d 0;\".\n   *\n   * @param n The node\n   * @return True if n is an L-value.\n   ",
      "child_ranges": [
        "(line 2076,col 5)-(line 2077,col 23)",
        "(line 2078,col 5)-(line 2078,col 32)",
        "(line 2079,col 5)-(line 2081,col 5)",
        "(line 2082,col 5)-(line 2089,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isObjectLitKey(com.google.javascript.rhino.Node)",
      "begin_line": 2098,
      "end_line": 2106,
      "comment": "\n   * Determines whether a node represents an object literal key\n   * (e.g. key1 in {key1: value1, key2: value2}).\n   *\n   * @param node A node\n   ",
      "child_ranges": [
        "(line 2099,col 5)-(line 2104,col 5)",
        "(line 2105,col 5)-(line 2105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(com.google.javascript.rhino.Node)",
      "begin_line": 2113,
      "end_line": 2121,
      "comment": "\n   * Get the name of an object literal key.\n   *\n   * @param key A node\n   ",
      "child_ranges": [
        "(line 2114,col 5)-(line 2119,col 5)",
        "(line 2120,col 5)-(line 2120,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 2127,
      "end_line": 2153,
      "comment": "\n   * @param key A OBJECTLIT key node.\n   * @return The type expected when using the key.\n   ",
      "child_ranges": [
        "(line 2128,col 5)-(line 2151,col 5)",
        "(line 2152,col 5)-(line 2152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(com.google.javascript.rhino.Node)",
      "begin_line": 2161,
      "end_line": 2168,
      "comment": "\n   * Determines whether a node represents an object literal get or set key\n   * (e.g. key1 in {get key1() {}, set key2(a){}).\n   *\n   * @param node A node\n   ",
      "child_ranges": [
        "(line 2162,col 5)-(line 2166,col 5)",
        "(line 2167,col 5)-(line 2167,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.opToStr(int)",
      "begin_line": 2178,
      "end_line": 2223,
      "comment": "\n   * Converts an operator\u0027s token value (see {@link Token}) to a string\n   * representation.\n   *\n   * @param operator the operator\u0027s token value to convert\n   * @return the string representation or {@code null} if the token value is\n   * not an operator\n   ",
      "child_ranges": [
        "(line 2179,col 5)-(line 2222,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.opToStrNoFail(int)",
      "begin_line": 2233,
      "end_line": 2240,
      "comment": "\n   * Converts an operator\u0027s token value (see {@link Token}) to a string\n   * representation or fails.\n   *\n   * @param operator the operator\u0027s token value to convert\n   * @return the string representation\n   * @throws Error if the token value is not an operator\n   ",
      "child_ranges": [
        "(line 2234,col 5)-(line 2234,col 35)",
        "(line 2235,col 5)-(line 2238,col 5)",
        "(line 2239,col 5)-(line 2239,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsType(com.google.javascript.rhino.Node, int, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2245,
      "end_line": 2249,
      "comment": "\n   * @return true if n or any of its children are of the specified type\n   ",
      "child_ranges": [
        "(line 2248,col 5)-(line 2248,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.containsType(com.google.javascript.rhino.Node, int)",
      "begin_line": 2254,
      "end_line": 2256,
      "comment": "\n   * @return true if n or any of its children are of the specified type\n   ",
      "child_ranges": [
        "(line 2255,col 5)-(line 2255,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(com.google.javascript.rhino.Node)",
      "begin_line": 2264,
      "end_line": 2279,
      "comment": "\n   * Given a node tree, finds all the VAR declarations in that tree that are\n   * not in an inner scope. Then adds a new VAR node at the top of the current\n   * scope that redeclares them, if necessary.\n   ",
      "child_ranges": [
        "(line 2265,col 5)-(line 2265,col 60)",
        "(line 2266,col 5)-(line 2268,col 5)",
        "(line 2270,col 5)-(line 2270,col 40)",
        "(line 2271,col 5)-(line 2278,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2286,
      "end_line": 2290,
      "comment": "\n   * Copy any annotations that follow a named value.\n   * @param source\n   * @param destination\n   ",
      "child_ranges": [
        "(line 2287,col 5)-(line 2289,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getAddingRoot(com.google.javascript.rhino.Node)",
      "begin_line": 2296,
      "end_line": 2316,
      "comment": "\n   * Gets a Node at the top of the current scope where we can add new var\n   * declarations as children.\n   ",
      "child_ranges": [
        "(line 2297,col 5)-(line 2297,col 27)",
        "(line 2298,col 5)-(line 2298,col 22)",
        "(line 2299,col 5)-(line 2308,col 5)",
        "(line 2311,col 5)-(line 2312,col 31)",
        "(line 2313,col 5)-(line 2314,col 48)",
        "(line 2315,col 5)-(line 2315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention, java.lang.String)",
      "begin_line": 2324,
      "end_line": 2352,
      "comment": "\n   * Creates a node representing a qualified name.\n   *\n   * @param name A qualified name (e.g. \"foo\" or \"foo.bar.baz\")\n   * @return A NAME or GETPROP node\n   ",
      "child_ranges": [
        "(line 2326,col 5)-(line 2326,col 35)",
        "(line 2327,col 5)-(line 2329,col 5)",
        "(line 2330,col 5)-(line 2330,col 14)",
        "(line 2331,col 5)-(line 2331,col 48)",
        "(line 2332,col 5)-(line 2336,col 5)",
        "(line 2337,col 5)-(line 2337,col 17)",
        "(line 2338,col 5)-(line 2349,col 27)",
        "(line 2351,col 5)-(line 2351,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newQualifiedNameNodeDeclaration(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo)",
      "begin_line": 2360,
      "end_line": 2372,
      "comment": "\n   * Creates a node representing a qualified name.\n   *\n   * @param name A qualified name (e.g. \"foo\" or \"foo.bar.baz\")\n   * @return A NAME or GETPROP node\n   ",
      "child_ranges": [
        "(line 2362,col 5)-(line 2362,col 16)",
        "(line 2363,col 5)-(line 2363,col 59)",
        "(line 2364,col 5)-(line 2370,col 5)",
        "(line 2371,col 5)-(line 2371,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2387,
      "end_line": 2393,
      "comment": "\n   * Creates a node representing a qualified name, copying over the source\n   * location information from the basis node and assigning the given original\n   * name to the node.\n   *\n   * @param name A qualified name (e.g. \"foo\" or \"foo.bar.baz\")\n   * @param basisNode The node that represents the name as currently found in\n   *     the AST.\n   * @param originalName The original name of the item being represented by the\n   *     NAME node. Used for debugging information.\n   *\n   * @return A NAME or GETPROP node\n   ",
      "child_ranges": [
        "(line 2390,col 5)-(line 2390,col 55)",
        "(line 2391,col 5)-(line 2391,col 55)",
        "(line 2392,col 5)-(line 2392,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(com.google.javascript.rhino.Node)",
      "begin_line": 2398,
      "end_line": 2406,
      "comment": "\n   * Gets the root node of a qualified name. Must be either NAME or THIS.\n   ",
      "child_ranges": [
        "(line 2399,col 5)-(line 2405,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.setDebugInformation(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2416,
      "end_line": 2420,
      "comment": "\n   * Sets the debug information (source file info and original name)\n   * on the given node.\n   *\n   * @param node The node on which to set the debug information.\n   * @param basisNode The basis node from which to copy the source file info.\n   * @param originalName The original name of the node.\n   ",
      "child_ranges": [
        "(line 2418,col 5)-(line 2418,col 47)",
        "(line 2419,col 5)-(line 2419,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String)",
      "begin_line": 2422,
      "end_line": 2429,
      "comment": "",
      "child_ranges": [
        "(line 2424,col 5)-(line 2424,col 34)",
        "(line 2425,col 5)-(line 2427,col 5)",
        "(line 2428,col 5)-(line 2428,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 2441,
      "end_line": 2443,
      "comment": "\n   * Creates a new node representing an *existing* name, copying over the source\n   * location information from the basis node.\n   *\n   * @param name The name for the new NAME node.\n   * @param srcref The node that represents the name as currently found in\n   *     the AST.\n   *\n   * @return The node created.\n   ",
      "child_ranges": [
        "(line 2442,col 5)-(line 2442,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newName(com.google.javascript.jscomp.CodingConvention, java.lang.String, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2458,
      "end_line": 2464,
      "comment": "\n   * Creates a new node representing an *existing* name, copying over the source\n   * location information from the basis node and assigning the given original\n   * name to the node.\n   *\n   * @param name The name for the new NAME node.\n   * @param basisNode The node that represents the name as currently found in\n   *     the AST.\n   * @param originalName The original name of the item being represented by the\n   *     NAME node. Used for debugging information.\n   *\n   * @return The node created.\n   ",
      "child_ranges": [
        "(line 2461,col 5)-(line 2461,col 57)",
        "(line 2462,col 5)-(line 2462,col 59)",
        "(line 2463,col 5)-(line 2463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isLatin(java.lang.String)",
      "begin_line": 2479,
      "end_line": 2488,
      "comment": " Test if all characters in the string are in the Basic Latin (aka ASCII)\n   * character set - that they have UTF-16 values equal to or below 0x7f.\n   * This check can find which identifiers with Unicode characters need to be\n   * escaped in order to allow resulting files to be processed by non-Unicode\n   * aware UNIX tools and editors.\n   * *\n   * See http://en.wikipedia.org/wiki/Latin_characters_in_Unicode\n   * for more on Basic Latin.\n   *\n   * @param s The string to be checked for ASCII-goodness.\n   *\n   * @return True if all characters in the string are in Basic Latin set.\n   ",
      "child_ranges": [
        "(line 2480,col 5)-(line 2480,col 25)",
        "(line 2481,col 5)-(line 2486,col 5)",
        "(line 2487,col 5)-(line 2487,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidSimpleName(java.lang.String)",
      "begin_line": 2493,
      "end_line": 2503,
      "comment": "\n   * Determines whether the given name is a valid variable name.\n   ",
      "child_ranges": [
        "(line 2494,col 5)-(line 2502,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidQualifiedName(java.lang.String)",
      "begin_line": 2510,
      "end_line": 2521,
      "comment": " so that the results are different for es5 and es3.",
      "child_ranges": [
        "(line 2511,col 5)-(line 2513,col 5)",
        "(line 2514,col 5)-(line 2514,col 39)",
        "(line 2515,col 5)-(line 2519,col 5)",
        "(line 2520,col 5)-(line 2520,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isValidPropertyName(java.lang.String)",
      "begin_line": 2527,
      "end_line": 2529,
      "comment": "\n   * Determines whether the given name can appear on the right side of\n   * the dot operator. Many properties (like reserved words) cannot.\n   ",
      "child_ranges": [
        "(line 2528,col 5)-(line 2528,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VarCollector",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeUtil.Visitor"
      ],
      "begin_line": 2531,
      "end_line": 2546,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 2532,
      "end_line": 2532,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.VarCollector.visit(com.google.javascript.rhino.Node)",
      "begin_line": 2534,
      "end_line": 2545,
      "comment": "",
      "child_ranges": [
        "(line 2536,col 7)-(line 2544,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(com.google.javascript.rhino.Node)",
      "begin_line": 2551,
      "end_line": 2558,
      "comment": "\n   * Retrieves vars declared in the current node tree, excluding descent scopes.\n   ",
      "child_ranges": [
        "(line 2552,col 5)-(line 2552,col 48)",
        "(line 2553,col 5)-(line 2556,col 28)",
        "(line 2557,col 5)-(line 2557,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 2564,
      "end_line": 2567,
      "comment": "\n   * @return {@code true} if the node an assignment to a prototype property of\n   *     some constructor.\n   ",
      "child_ranges": [
        "(line 2565,col 5)-(line 2566,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(com.google.javascript.rhino.Node)",
      "begin_line": 2572,
      "end_line": 2575,
      "comment": "\n   * @return Whether the node represents a qualified prototype property.\n   ",
      "child_ranges": [
        "(line 2573,col 5)-(line 2573,col 44)",
        "(line 2574,col 5)-(line 2574,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(com.google.javascript.rhino.Node)",
      "begin_line": 2580,
      "end_line": 2590,
      "comment": "\n   * @return The class name part of a qualified prototype name.\n   ",
      "child_ranges": [
        "(line 2581,col 5)-(line 2581,col 21)",
        "(line 2582,col 5)-(line 2588,col 5)",
        "(line 2589,col 5)-(line 2589,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(com.google.javascript.rhino.Node)",
      "begin_line": 2595,
      "end_line": 2600,
      "comment": "\n   * @return The string property name part of a qualified prototype name.\n   ",
      "child_ranges": [
        "(line 2596,col 5)-(line 2596,col 47)",
        "(line 2597,col 5)-(line 2597,col 59)",
        "(line 2598,col 5)-(line 2598,col 63)",
        "(line 2599,col 5)-(line 2599,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newUndefinedNode(com.google.javascript.rhino.Node)",
      "begin_line": 2606,
      "end_line": 2612,
      "comment": "\n   * Create a node for an empty result expression:\n   *   \"void 0\"\n   ",
      "child_ranges": [
        "(line 2607,col 5)-(line 2607,col 42)",
        "(line 2608,col 5)-(line 2610,col 5)",
        "(line 2611,col 5)-(line 2611,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newVarNode(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 2617,
      "end_line": 2627,
      "comment": "\n   * Create a VAR node containing the given name and initial value expression.\n   ",
      "child_ranges": [
        "(line 2618,col 5)-(line 2618,col 34)",
        "(line 2619,col 5)-(line 2623,col 5)",
        "(line 2624,col 5)-(line 2624,col 49)",
        "(line 2626,col 5)-(line 2626,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNameNode",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2632,
      "end_line": 2643,
      "comment": "\n   * A predicate for matching name nodes with the specified node.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 2633,
      "end_line": 2633,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNameNode.MatchNameNode(java.lang.String)",
      "begin_line": 2635,
      "end_line": 2637,
      "comment": "",
      "child_ranges": [
        "(line 2636,col 7)-(line 2636,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNameNode.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2639,
      "end_line": 2642,
      "comment": "",
      "child_ranges": [
        "(line 2641,col 7)-(line 2641,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNodeType",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2648,
      "end_line": 2659,
      "comment": "\n   * A predicate for matching nodes with the specified type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 2649,
      "end_line": 2649,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNodeType.MatchNodeType(int)",
      "begin_line": 2651,
      "end_line": 2653,
      "comment": "",
      "child_ranges": [
        "(line 2652,col 7)-(line 2652,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNodeType.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2655,
      "end_line": 2658,
      "comment": "",
      "child_ranges": [
        "(line 2657,col 7)-(line 2657,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchDeclaration",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2665,
      "end_line": 2670,
      "comment": "\n   * A predicate for matching var or function declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchDeclaration.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2666,
      "end_line": 2669,
      "comment": "",
      "child_ranges": [
        "(line 2668,col 7)-(line 2668,col 51)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MatchNotFunction",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2675,
      "end_line": 2680,
      "comment": "\n   * A predicate for matching anything except function nodes.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchNotFunction.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2676,
      "end_line": 2679,
      "comment": "",
      "child_ranges": [
        "(line 2678,col 7)-(line 2678,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MATCH_NOT_FUNCTION"
      ],
      "begin_line": 2682,
      "end_line": 2682,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MatchShallowStatement",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 2687,
      "end_line": 2696,
      "comment": "\n   * A predicate for matching statements without exiting the current scope.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.MatchShallowStatement.apply(com.google.javascript.rhino.Node)",
      "begin_line": 2688,
      "end_line": 2695,
      "comment": "",
      "child_ranges": [
        "(line 2690,col 7)-(line 2690,col 34)",
        "(line 2691,col 7)-(line 2694,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(com.google.javascript.rhino.Node, int, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2701,
      "end_line": 2704,
      "comment": "\n   * Finds the number of times a type is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2703,col 5)-(line 2703,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNameReferenced(com.google.javascript.rhino.Node, java.lang.String, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2709,
      "end_line": 2713,
      "comment": "\n   * Whether a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2712,col 5)-(line 2712,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNameReferenced(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2718,
      "end_line": 2720,
      "comment": "\n   * Whether a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2719,col 5)-(line 2719,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 2725,
      "end_line": 2728,
      "comment": "\n   * Finds the number of times a simple name is referenced within the node tree.\n   ",
      "child_ranges": [
        "(line 2726,col 5)-(line 2727,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.has(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2733,
      "end_line": 2751,
      "comment": "\n   * @return Whether the predicate is true for the node or any of its children.\n   ",
      "child_ranges": [
        "(line 2736,col 5)-(line 2738,col 5)",
        "(line 2740,col 5)-(line 2742,col 5)",
        "(line 2744,col 5)-(line 2748,col 5)",
        "(line 2750,col 5)-(line 2750,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getCount(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2757,
      "end_line": 2772,
      "comment": "\n   * @return The number of times the the predicate is true for the node\n   * or any of its children.\n   ",
      "child_ranges": [
        "(line 2759,col 5)-(line 2759,col 18)",
        "(line 2761,col 5)-(line 2763,col 5)",
        "(line 2765,col 5)-(line 2769,col 5)",
        "(line 2771,col 5)-(line 2771,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Visitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 2778,
      "end_line": 2780,
      "comment": "\n   * Interface for use with the visit method.\n   * @see #visit\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.Visitor.visit(com.google.javascript.rhino.Node)",
      "begin_line": 2779,
      "end_line": 2779,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.visitPreOrder(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeUtil.Visitor, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2786,
      "end_line": 2796,
      "comment": "\n   * A pre-order traversal, calling Visitor.visit for each child matching\n   * the predicate.\n   ",
      "child_ranges": [
        "(line 2789,col 5)-(line 2789,col 24)",
        "(line 2791,col 5)-(line 2795,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.visitPostOrder(com.google.javascript.rhino.Node, com.google.javascript.jscomp.NodeUtil.Visitor, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2802,
      "end_line": 2812,
      "comment": "\n   * A post-order traversal, calling Visitor.visit for each child matching\n   * the predicate.\n   ",
      "child_ranges": [
        "(line 2805,col 5)-(line 2809,col 5)",
        "(line 2811,col 5)-(line 2811,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.hasFinally(com.google.javascript.rhino.Node)",
      "begin_line": 2817,
      "end_line": 2820,
      "comment": "\n   * @return Whether a TRY node has a finally block.\n   ",
      "child_ranges": [
        "(line 2818,col 5)-(line 2818,col 43)",
        "(line 2819,col 5)-(line 2819,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getCatchBlock(com.google.javascript.rhino.Node)",
      "begin_line": 2826,
      "end_line": 2829,
      "comment": "\n   * @return The BLOCK node containing the CATCH node (if any)\n   * of a TRY.\n   ",
      "child_ranges": [
        "(line 2827,col 5)-(line 2827,col 43)",
        "(line 2828,col 5)-(line 2828,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.hasCatchHandler(com.google.javascript.rhino.Node)",
      "begin_line": 2835,
      "end_line": 2838,
      "comment": "\n   * @return Whether BLOCK (from a TRY node) contains a CATCH.\n   * @see NodeUtil#getCatchBlock\n   ",
      "child_ranges": [
        "(line 2836,col 5)-(line 2836,col 45)",
        "(line 2837,col 5)-(line 2837,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionParameters(com.google.javascript.rhino.Node)",
      "begin_line": 2844,
      "end_line": 2848,
      "comment": "\n    * @param fnNode The function.\n    * @return The Node containing the Function parameters.\n    ",
      "child_ranges": [
        "(line 2846,col 5)-(line 2846,col 53)",
        "(line 2847,col 5)-(line 2847,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isConstantName(com.google.javascript.rhino.Node)",
      "begin_line": 2861,
      "end_line": 2863,
      "comment": "\n   * \u003cp\u003eDetermines whether a variable is constant:\n   * \u003col\u003e\n   * \u003cli\u003eIn Normalize, any name that matches the\n   *     {@link CodingConvention#isConstant(String)} is annotated with an\n   *     IS_CONSTANT_NAME property.\n   * \u003c/ol\u003e\n   *\n   * @param node A NAME or STRING node\n   * @return True if a name node represents a constant variable\n   ",
      "child_ranges": [
        "(line 2862,col 5)-(line 2862,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isConstantByConvention(com.google.javascript.jscomp.CodingConvention, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 2866,
      "end_line": 2876,
      "comment": " Whether the given name is constant by coding convention. ",
      "child_ranges": [
        "(line 2868,col 5)-(line 2874,col 5)",
        "(line 2875,col 5)-(line 2875,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(com.google.javascript.rhino.Node)",
      "begin_line": 2881,
      "end_line": 2896,
      "comment": "\n   * Get the JSDocInfo for a function.\n   ",
      "child_ranges": [
        "(line 2882,col 5)-(line 2882,col 45)",
        "(line 2883,col 5)-(line 2883,col 40)",
        "(line 2884,col 5)-(line 2894,col 5)",
        "(line 2895,col 5)-(line 2895,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getSourceName(com.google.javascript.rhino.Node)",
      "begin_line": 2902,
      "end_line": 2909,
      "comment": "\n   * @param n The node.\n   * @return The source name property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2903,col 5)-(line 2903,col 29)",
        "(line 2904,col 5)-(line 2907,col 5)",
        "(line 2908,col 5)-(line 2908,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getSourceFile(com.google.javascript.rhino.Node)",
      "begin_line": 2915,
      "end_line": 2922,
      "comment": "\n   * @param n The node.\n   * @return The source name property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2916,col 5)-(line 2916,col 39)",
        "(line 2917,col 5)-(line 2920,col 5)",
        "(line 2921,col 5)-(line 2921,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getInputId(com.google.javascript.rhino.Node)",
      "begin_line": 2928,
      "end_line": 2934,
      "comment": "\n   * @param n The node.\n   * @return The InputId property on the node or its ancestors.\n   ",
      "child_ranges": [
        "(line 2929,col 5)-(line 2931,col 5)",
        "(line 2933,col 5)-(line 2933,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.newCallNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node...)",
      "begin_line": 2939,
      "end_line": 2947,
      "comment": "\n   * A new CALL node with the \"FREE_CALL\" set based on call target.\n   ",
      "child_ranges": [
        "(line 2940,col 5)-(line 2940,col 44)",
        "(line 2941,col 5)-(line 2941,col 36)",
        "(line 2942,col 5)-(line 2942,col 52)",
        "(line 2943,col 5)-(line 2945,col 5)",
        "(line 2946,col 5)-(line 2946,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(com.google.javascript.rhino.Node)",
      "begin_line": 2953,
      "end_line": 2955,
      "comment": "\n   * @return Whether the node is known to be a value that is not referenced\n   * elsewhere.\n   ",
      "child_ranges": [
        "(line 2954,col 5)-(line 2954,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(com.google.javascript.rhino.Node, com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 2962,
      "end_line": 3028,
      "comment": "\n   * @param locals A predicate to apply to unknown local values.\n   * @return Whether the node is known to be a value that is not a reference\n   *     outside the expression scope.\n   ",
      "child_ranges": [
        "(line 2963,col 5)-(line 3027,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getNthSibling(com.google.javascript.rhino.Node, int)",
      "begin_line": 3035,
      "end_line": 3042,
      "comment": "\n   * Given the first sibling, this returns the nth\n   * sibling or null if no such sibling exists.\n   * This is like \"getChildAtIndex\" but returns null for non-existent indexes.\n   ",
      "child_ranges": [
        "(line 3036,col 5)-(line 3036,col 25)",
        "(line 3037,col 5)-(line 3040,col 5)",
        "(line 3041,col 5)-(line 3041,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(com.google.javascript.rhino.Node, int)",
      "begin_line": 3048,
      "end_line": 3052,
      "comment": "\n   * Given the function, this returns the nth\n   * argument or null if no such parameter exists.\n   ",
      "child_ranges": [
        "(line 3049,col 5)-(line 3049,col 52)",
        "(line 3050,col 5)-(line 3051,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(com.google.javascript.rhino.Node, int)",
      "begin_line": 3058,
      "end_line": 3062,
      "comment": "\n   * Given the new or call, this returns the nth\n   * argument of the call or null if no such argument exists.\n   ",
      "child_ranges": [
        "(line 3059,col 5)-(line 3059,col 48)",
        "(line 3060,col 5)-(line 3061,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isCallOrNewTarget(com.google.javascript.rhino.Node)",
      "begin_line": 3067,
      "end_line": 3072,
      "comment": "\n   * Returns whether this is a target of a call or new.\n   ",
      "child_ranges": [
        "(line 3068,col 5)-(line 3068,col 37)",
        "(line 3069,col 5)-(line 3071,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isToStringMethodCall(com.google.javascript.rhino.Node)",
      "begin_line": 3074,
      "end_line": 3081,
      "comment": "",
      "child_ranges": [
        "(line 3075,col 5)-(line 3075,col 40)",
        "(line 3076,col 5)-(line 3079,col 5)",
        "(line 3080,col 5)-(line 3080,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(com.google.javascript.rhino.Node)",
      "begin_line": 3084,
      "end_line": 3112,
      "comment": " Find the best JSDoc for the given node. ",
      "child_ranges": [
        "(line 3085,col 5)-(line 3085,col 38)",
        "(line 3086,col 5)-(line 3110,col 5)",
        "(line 3111,col 5)-(line 3111,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValue(com.google.javascript.rhino.Node)",
      "begin_line": 3115,
      "end_line": 3136,
      "comment": " Find the l-value that the given r-value is being assigned to. ",
      "child_ranges": [
        "(line 3116,col 5)-(line 3116,col 32)",
        "(line 3117,col 5)-(line 3117,col 61)",
        "(line 3118,col 5)-(line 3134,col 5)",
        "(line 3135,col 5)-(line 3135,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getRValueOfLValue(com.google.javascript.rhino.Node)",
      "begin_line": 3139,
      "end_line": 3150,
      "comment": " Gets the r-value of a node returned by getBestLValue. ",
      "child_ranges": [
        "(line 3140,col 5)-(line 3140,col 32)",
        "(line 3141,col 5)-(line 3148,col 5)",
        "(line 3149,col 5)-(line 3149,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValueOwner(com.google.javascript.rhino.Node)",
      "begin_line": 3153,
      "end_line": 3164,
      "comment": " Get the owner of the given l-value node. ",
      "child_ranges": [
        "(line 3154,col 5)-(line 3156,col 5)",
        "(line 3157,col 5)-(line 3161,col 5)",
        "(line 3163,col 5)-(line 3163,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.getBestLValueName(com.google.javascript.rhino.Node)",
      "begin_line": 3167,
      "end_line": 3182,
      "comment": " Get the name of the given l-value node. ",
      "child_ranges": [
        "(line 3168,col 5)-(line 3170,col 5)",
        "(line 3171,col 5)-(line 3180,col 5)",
        "(line 3181,col 5)-(line 3181,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(com.google.javascript.rhino.Node)",
      "begin_line": 3187,
      "end_line": 3228,
      "comment": "\n   * @returns false iff the result of the expression is not consumed.\n   ",
      "child_ranges": [
        "(line 3189,col 5)-(line 3189,col 35)",
        "(line 3190,col 5)-(line 3226,col 5)",
        "(line 3227,col 5)-(line 3227,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(com.google.javascript.rhino.Node)",
      "begin_line": 3235,
      "end_line": 3279,
      "comment": "\n   * @param n The expression to check.\n   * @return Whether the expression is unconditionally executed only once in the\n   *     containing execution scope.\n   ",
      "child_ranges": [
        "(line 3236,col 5)-(line 3277,col 42)",
        "(line 3278,col 5)-(line 3278,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.booleanNode(boolean)",
      "begin_line": 3284,
      "end_line": 3286,
      "comment": "\n   * @return An appropriate AST node for the boolean value.\n   ",
      "child_ranges": [
        "(line 3285,col 5)-(line 3285,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.numberNode(double, com.google.javascript.rhino.Node)",
      "begin_line": 3291,
      "end_line": 3306,
      "comment": "\n   * @return An appropriate AST node for the double value.\n   ",
      "child_ranges": [
        "(line 3292,col 5)-(line 3292,col 16)",
        "(line 3293,col 5)-(line 3301,col 5)",
        "(line 3302,col 5)-(line 3304,col 5)",
        "(line 3305,col 5)-(line 3305,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.isNaN(com.google.javascript.rhino.Node)",
      "begin_line": 3308,
      "end_line": 3316,
      "comment": "",
      "child_ranges": [
        "(line 3309,col 5)-(line 3314,col 5)",
        "(line 3315,col 5)-(line 3315,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mapMainToClone(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 3322,
      "end_line": 3328,
      "comment": "\n   * Given an AST and its copy, map the root node of each scope of main to the\n   * corresponding root node of clone\n   ",
      "child_ranges": [
        "(line 3323,col 5)-(line 3323,col 57)",
        "(line 3324,col 5)-(line 3324,col 53)",
        "(line 3325,col 5)-(line 3325,col 26)",
        "(line 3326,col 5)-(line 3326,col 34)",
        "(line 3327,col 5)-(line 3327,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.mtocHelper(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 3330,
      "end_line": 3340,
      "comment": "",
      "child_ranges": [
        "(line 3331,col 5)-(line 3333,col 5)",
        "(line 3334,col 5)-(line 3334,col 71)",
        "(line 3335,col 5)-(line 3339,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.verifyScopeChanges(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node, boolean, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 3343,
      "end_line": 3377,
      "comment": " Checks that the scope roots marked as changed have indeed changed ",
      "child_ranges": [
        "(line 3354,col 5)-(line 3354,col 37)",
        "(line 3355,col 5)-(line 3355,col 56)",
        "(line 3356,col 5)-(line 3356,col 32)",
        "(line 3357,col 5)-(line 3361,col 5)",
        "(line 3362,col 5)-(line 3376,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NodeUtil.Anonymous-b510c01d-f0e5-4736-a817-edf7f2b8cea6.visit(com.google.javascript.rhino.Node)",
      "begin_line": 3364,
      "end_line": 3374,
      "comment": "",
      "child_ranges": [
        "(line 3366,col 13)-(line 3373,col 13)"
      ]
    }
  ]
}