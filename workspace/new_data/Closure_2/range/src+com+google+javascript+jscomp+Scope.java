{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/Scope.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Scope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var\u003e"
      ],
      "begin_line": 54,
      "end_line": 620,
      "comment": "\n * Scope contains information about a variable scope in JavaScript.\n * Scopes can be nested, a scope points back to its parent scope.\n * A Scope contains information about variables defined in that scope.\n * \u003cp\u003e\n * A Scope is also used as a lattice element for flow-sensitive type inference.\n * As a lattice element, a Scope is viewed as a map from names to types. A name\n * not in the map is considered to have the bottom type. The join of two maps m1\n * and m2 is the map of the union of names with {@link JSType#getLeastSupertype}\n * to meet the m1 type and m2 type.\n *\n * @see NodeTraversal\n * @see DataFlowAnalysis\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "vars"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "depth"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNode"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isBottom"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Whether this is a bottom scope for the purposes of type inference. "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DECLARATIVELY_UNBOUND_VARS_WITHOUT_TYPES"
      ],
      "begin_line": 66,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Anonymous-fb9cc395-f74c-4d8e-9511-7e6771d4c7dd.apply(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 68,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 72,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Var",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 77,
      "end_line": 346,
      "comment": " Stores info about a variable "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " name "
    },
    {
      "type": "field",
      "varNames": [
        "nameNode"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Var node "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The variable\u0027s type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "typeInferred"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Whether the variable\u0027s type has been inferred or is declared. An inferred\n     * type may change over time (as more code is discovered), whereas a\n     * declared type is a static contract that must be matched.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Input source "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * The index at which the var is declared. e..g if it\u0027s 0, it\u0027s the first\n     * declared variable in that scope\n     "
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The enclosing scope "
    },
    {
      "type": "field",
      "varNames": [
        "markedEscaped"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " @see #isMarkedEscaped "
    },
    {
      "type": "field",
      "varNames": [
        "markedAssignedExactlyOnce"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " @see #isMarkedAssignedExactlyOnce "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Scope.Var.Var(boolean, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.Scope, int, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 120,
      "end_line": 129,
      "comment": "\n     * Creates a variable.\n     *\n     * @param inferred whether its type is inferred (as opposed to declared)\n     ",
      "child_ranges": [
        "(line 122,col 7)-(line 122,col 23)",
        "(line 123,col 7)-(line 123,col 31)",
        "(line 124,col 7)-(line 124,col 23)",
        "(line 125,col 7)-(line 125,col 25)",
        "(line 126,col 7)-(line 126,col 25)",
        "(line 127,col 7)-(line 127,col 25)",
        "(line 128,col 7)-(line 128,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getName()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Gets the name of the variable.\n     ",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getNode()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Gets the node for the name of the variable.\n     ",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getInput()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 7)-(line 148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getSourceFile()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getSymbol()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 7)-(line 158,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getDeclaration()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 163,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getParentNode()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Gets the parent of the name node.\n     ",
      "child_ranges": [
        "(line 170,col 7)-(line 170,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isBleedingFunction()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Whether this is a bleeding function (an anonymous named function\n     * that bleeds into the inner scope).\n     ",
      "child_ranges": [
        "(line 178,col 7)-(line 178,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getScope()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * Gets the scope where this variable is declared.\n     ",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isGlobal()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns whether this is a global variable.\n     ",
      "child_ranges": [
        "(line 192,col 7)-(line 192,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isLocal()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns whether this is a local variable.\n     ",
      "child_ranges": [
        "(line 199,col 7)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isExtern()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns whether this is defined in an extern file.\n     ",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isConst()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * Returns {@code true} if the variable is declared as a constant,\n     * based on the value reported by {@code NodeUtil}.\n     ",
      "child_ranges": [
        "(line 214,col 7)-(line 214,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isDefine()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Returns {@code true} if the variable is declared as a define.\n     * A variable is a define if it is annotated by {@code @define}.\n     ",
      "child_ranges": [
        "(line 222,col 7)-(line 222,col 38)",
        "(line 223,col 7)-(line 223,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getInitialValue()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 227,col 7)-(line 227,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getType()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * Gets this variable\u0027s type. To know whether this type has been inferred,\n     * see {@code #isTypeInferred()}.\n     ",
      "child_ranges": [
        "(line 236,col 7)-(line 236,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getNameNode()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns the name node that produced this variable.\n     ",
      "child_ranges": [
        "(line 243,col 7)-(line 243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getJSDocInfo()",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * Gets the JSDocInfo for the variable.\n     ",
      "child_ranges": [
        "(line 251,col 7)-(line 251,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.setType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Sets this variable\u0027s type.\n     * @throws IllegalStateException if the variable\u0027s type is not inferred\n     ",
      "child_ranges": [
        "(line 259,col 7)-(line 259,col 49)",
        "(line 260,col 7)-(line 260,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.resolveType(com.google.javascript.rhino.ErrorReporter)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * Resolve this variable\u0027s type.\n     ",
      "child_ranges": [
        "(line 267,col 7)-(line 269,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isTypeInferred()",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Returns whether this variable\u0027s type is inferred. To get the variable\u0027s\n     * type, see {@link #getType()}.\n     ",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.getInputName()",
      "begin_line": 281,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 282,col 7)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isNoShadow()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 38)",
        "(line 290,col 7)-(line 290,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.equals(java.lang.Object)",
      "begin_line": 293,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 296,col 7)",
        "(line 298,col 7)-(line 298,col 33)",
        "(line 299,col 7)-(line 299,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.hashCode()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.toString()",
      "begin_line": 306,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.markEscaped()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Record that this is escaped by an inner scope.\n     *\n     * In other words, it\u0027s assigned in an inner scope so that it\u0027s much harder\n     * to make assertions about its value at a given point.\n     ",
      "child_ranges": [
        "(line 318,col 7)-(line 318,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isMarkedEscaped()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Whether this is escaped by an inner scope.\n     * Notice that not all scope creators record this information.\n     ",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.markAssignedExactlyOnce()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Record that this is assigned exactly once..\n     *\n     * In other words, it\u0027s assigned in an inner scope so that it\u0027s much harder\n     * to make assertions about its value at a given point.\n     ",
      "child_ranges": [
        "(line 336,col 7)-(line 336,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Var.isMarkedAssignedExactlyOnce()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Whether this is assigned exactly once.\n     * Notice that not all scope creators record this information.\n     ",
      "child_ranges": [
        "(line 344,col 7)-(line 344,col 39)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Arguments",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.Scope.Var"
      ],
      "begin_line": 353,
      "end_line": 379,
      "comment": " TODO(johnlenz): Include this the list of Vars for the scope."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Scope.Arguments.Arguments(com.google.javascript.jscomp.Scope)",
      "begin_line": 354,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 355,col 7)-(line 364,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Arguments.equals(java.lang.Object)",
      "begin_line": 367,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 368,col 7)-(line 370,col 7)",
        "(line 372,col 7)-(line 372,col 45)",
        "(line 373,col 7)-(line 373,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.Arguments.hashCode()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 377,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Scope.Scope(com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n   * Creates a Scope given the parent Scope and the root node of the scope.\n   * @param parent  The parent Scope. Cannot be null.\n   * @param rootNode  Typically the FUNCTION node.\n   ",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 39)",
        "(line 388,col 5)-(line 388,col 61)",
        "(line 390,col 5)-(line 390,col 25)",
        "(line 391,col 5)-(line 391,col 29)",
        "(line 392,col 5)-(line 392,col 26)",
        "(line 393,col 5)-(line 393,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.Scope.Scope(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 402,
      "end_line": 407,
      "comment": "\n   * Creates a empty Scope (bottom of the lattice).\n   * @param rootNode Typically a FUNCTION node or the global BLOCK node.\n   * @param isBottom Whether this is the bottom of a lattice. Otherwise,\n   *     it must be a global scope.\n   ",
      "child_ranges": [
        "(line 403,col 5)-(line 403,col 23)",
        "(line 404,col 5)-(line 404,col 29)",
        "(line 405,col 5)-(line 405,col 29)",
        "(line 406,col 5)-(line 406,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.createGlobalScope(com.google.javascript.rhino.Node)",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.createLatticeBottom(com.google.javascript.rhino.Node)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getDepth()",
      "begin_line": 418,
      "end_line": 420,
      "comment": " The depth of the scope. The global scope has depth 0. ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.isBottom()",
      "begin_line": 423,
      "end_line": 425,
      "comment": " Whether this is the bottom of the lattice. ",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getRootNode()",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n   * Gets the container node of the scope. This is typically the FUNCTION\n   * node or the global BLOCK/SCRIPT node.\n   ",
      "child_ranges": [
        "(line 433,col 5)-(line 433,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getParent()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 437,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getGlobalScope()",
      "begin_line": 440,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 24)",
        "(line 442,col 5)-(line 444,col 5)",
        "(line 445,col 5)-(line 445,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getParentScope()",
      "begin_line": 448,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getTypeOfThis()",
      "begin_line": 456,
      "end_line": 469,
      "comment": "\n   * Gets the type of {@code this} in the current scope.\n   ",
      "child_ranges": [
        "(line 458,col 5)-(line 460,col 5)",
        "(line 462,col 5)-(line 462,col 52)",
        "(line 463,col 5)-(line 463,col 43)",
        "(line 464,col 5)-(line 468,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.declare(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n   * Declares a variable whose type is inferred.\n   *\n   * @param name name of the variable\n   * @param nameNode the NAME node declaring the variable\n   * @param type the variable\u0027s type\n   * @param input the input in which this variable is defined.\n   ",
      "child_ranges": [
        "(line 480,col 5)-(line 480,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.declare(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.CompilerInput, boolean)",
      "begin_line": 493,
      "end_line": 503,
      "comment": "\n   * Declares a variable.\n   *\n   * @param name name of the variable\n   * @param nameNode the NAME node declaring the variable\n   * @param type the variable\u0027s type\n   * @param input the input in which this variable is defined.\n   * @param inferred Whether this variable\u0027s type is inferred (as opposed\n   *     to declared).\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 495,col 64)",
        "(line 498,col 5)-(line 498,col 53)",
        "(line 500,col 5)-(line 500,col 80)",
        "(line 501,col 5)-(line 501,col 24)",
        "(line 502,col 5)-(line 502,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.undeclare(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 509,
      "end_line": 513,
      "comment": "\n   * Undeclares a variable, to be used when the compiler optimizes out\n   * a variable and removes it from the scope.\n   ",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 48)",
        "(line 511,col 5)-(line 511,col 56)",
        "(line 512,col 5)-(line 512,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getSlot(java.lang.String)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 5)-(line 517,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getOwnSlot(java.lang.String)",
      "begin_line": 520,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getVar(java.lang.String)",
      "begin_line": 528,
      "end_line": 537,
      "comment": "\n   * Returns the variable, may be null\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 529,col 29)",
        "(line 530,col 5)-(line 536,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getArgumentsVar()",
      "begin_line": 542,
      "end_line": 547,
      "comment": "\n   * Get a unique VAR object to represents \"arguments\" within this scope\n   ",
      "child_ranges": [
        "(line 543,col 5)-(line 545,col 5)",
        "(line 546,col 5)-(line 546,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.isDeclared(java.lang.String, boolean)",
      "begin_line": 552,
      "end_line": 561,
      "comment": "\n   * Returns true if a variable is declared.\n   ",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 23)",
        "(line 554,col 5)-(line 555,col 18)",
        "(line 557,col 5)-(line 559,col 5)",
        "(line 560,col 5)-(line 560,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getVars()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n   * Return an iterator over all of the variables declared in this scope.\n   ",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getVarIterable()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n   * Return an iterable over all of the variables declared in this scope.\n   ",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 5)-(line 579,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getScope(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 5)-(line 584,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getAllSymbols()",
      "begin_line": 587,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 5)-(line 589,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getVarCount()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n   * Returns number of variables in this scope\n   ",
      "child_ranges": [
        "(line 596,col 5)-(line 596,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.isGlobal()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n   * Returns whether this is the global scope.\n   ",
      "child_ranges": [
        "(line 603,col 5)-(line 603,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.isLocal()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n   * Returns whether this is a local scope (i.e. not the global scope).\n   ",
      "child_ranges": [
        "(line 610,col 5)-(line 610,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.Scope.getDeclarativelyUnboundVarsWithoutTypes()",
      "begin_line": 616,
      "end_line": 619,
      "comment": "\n   * Gets all variables declared with \"var\" but without declared types attached.\n   ",
      "child_ranges": [
        "(line 617,col 5)-(line 618,col 61)"
      ]
    }
  ]
}