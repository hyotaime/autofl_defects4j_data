{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/GlobalNamespace.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GlobalNamespace",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref\u003e"
      ],
      "begin_line": 51,
      "end_line": 1335,
      "comment": "\n * Builds a global namespace of all the objects and their properties in\n * the global scope. Also builds an index of all the references to those names.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsRoot"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "externsScope"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generated"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPreOrderIndex"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Each reference has an index in post-order.\n   * Notice that some nodes are represented by 2 Ref objects, so\n   * this index is not necessarily unique.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "globalNames"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Global namespace tree "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Maps names (e.g. \"a.b.c\") to nodes in the global namespace tree "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.GlobalNamespace(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n   * Creates an instance that may emit warnings when building the namespace.\n   *\n   * @param compiler The AbstractCompiler, for reporting code changes\n   * @param root The root of the rest of the code to build a namespace for.\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.GlobalNamespace(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n   * Creates an instance that may emit warnings when building the namespace.\n   *\n   * @param compiler The AbstractCompiler, for reporting code changes\n   * @param externsRoot The root of the externs to build a namespace for. If\n   *     this is null, externs and properties defined on extern types will not\n   *     be included in the global namespace.  If non-null, it allows\n   *     user-defined function on extern types to be included in the global\n   *     namespace.  E.g. String.foo.\n   * @param root The root of the rest of the code to build a namespace for.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 29)",
        "(line 98,col 5)-(line 98,col 35)",
        "(line 99,col 5)-(line 99,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.hasExternsRoot()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getRootNode()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getParentScope()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getSlot(java.lang.String)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getOwnSlot(java.lang.String)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 22)",
        "(line 124,col 5)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getTypeOfThis()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getReferences(com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 22)",
        "(line 135,col 5)-(line 135,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getScope(com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getAllSymbols()",
      "begin_line": 143,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 22)",
        "(line 146,col 5)-(line 146,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.ensureGenerated()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 150,col 5)-(line 152,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getNameForest()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n   * Gets a list of the roots of the forest of the global names, where the\n   * roots are the top-level names.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 22)",
        "(line 161,col 5)-(line 161,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getNameIndex()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n   * Gets an index of all the global names, indexed by full qualified name\n   * (as in \"a\", \"a.b.c\", etc.).\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 22)",
        "(line 170,col 5)-(line 170,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(com.google.javascript.jscomp.Scope, java.util.Set\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n   * If the client adds new nodes to the AST, scan these new nodes\n   * to see if they\u0027ve added any references to the global namespace.\n   * @param scope The scope to scan.\n   * @param newNodes New nodes to check.\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 181,col 60)",
        "(line 182,col 5)-(line 182,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NodeFilter",
      "is_interface": false,
      "parent_types": [
        "com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 189,
      "end_line": 213,
      "comment": "\n   * A filter that looks for qualified names that contain one of the nodes\n   * in the given set.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "newNodes"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.NodeFilter.NodeFilter(java.util.Set\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 7)-(line 193,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.NodeFilter.apply(com.google.javascript.rhino.Node)",
      "begin_line": 196,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 198,col 7)-(line 200,col 7)",
        "(line 202,col 7)-(line 202,col 19)",
        "(line 203,col 7)-(line 209,col 7)",
        "(line 211,col 7)-(line 211,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.process()",
      "begin_line": 218,
      "end_line": 227,
      "comment": "\n   * Builds the namespace lazily.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 222,col 5)",
        "(line 223,col 5)-(line 223,col 22)",
        "(line 225,col 5)-(line 225,col 71)",
        "(line 226,col 5)-(line 226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n   * Determines whether a name reference in a particular scope is a global name\n   * reference.\n   *\n   * @param name A variable or property name (e.g. \"a\" or \"a.b.c.d\")\n   * @param s The scope in which the name is referenced\n   * @return Whether the name reference is a global name reference\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 44)",
        "(line 239,col 5)-(line 239,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getTopVarName(java.lang.String)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n   * Gets the top variable name from a possibly namespaced name.\n   *\n   * @param name A variable or qualified property name (e.g. \"a\" or \"a.b.c.d\")\n   * @return The top variable name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 42)",
        "(line 250,col 5)-(line 250,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 261,
      "end_line": 267,
      "comment": "\n   * Determines whether a variable name reference in a particular scope is a\n   * global variable reference.\n   *\n   * @param name A variable name (e.g. \"a\")\n   * @param s The scope in which the name is referenced\n   * @return Whether the name reference is a global variable reference\n   ",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 33)",
        "(line 263,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 266,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n   * Gets whether a scope is the global scope.\n   *\n   * @param s A scope\n   * @return Whether the scope is the global scope\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BuildGlobalNamespace",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 284,
      "end_line": 845,
      "comment": "\n   * Builds a tree representation of the global namespace. Omits prototypes.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodeFilter"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.BuildGlobalNamespace()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.BuildGlobalNamespace(com.google.common.base.Predicate\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Builds a global namespace, but only visits nodes that match the\n     * given filter.\n     ",
      "child_ranges": [
        "(line 297,col 7)-(line 297,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 300,
      "end_line": 301,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 304,
      "end_line": 308,
      "comment": " Collect the references in pre-order. ",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 28)",
        "(line 307,col 7)-(line 307,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.collect(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 310,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 313,col 7)",
        "(line 317,col 7)-(line 319,col 7)",
        "(line 321,col 7)-(line 321,col 18)",
        "(line 322,col 7)-(line 322,col 28)",
        "(line 323,col 7)-(line 323,col 39)",
        "(line 324,col 7)-(line 324,col 35)",
        "(line 326,col 7)-(line 421,col 7)",
        "(line 424,col 7)-(line 424,col 33)",
        "(line 425,col 7)-(line 427,col 7)",
        "(line 429,col 7)-(line 437,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getNameForObjLitKey(com.google.javascript.rhino.Node)",
      "begin_line": 456,
      "end_line": 508,
      "comment": "\n     * Gets the fully qualified name corresponding to an object literal key,\n     * as long as it and its prefix property names are valid JavaScript\n     * identifiers. The object literal may be nested inside of other object\n     * literals.\n     *\n     * For example, if called with node {@code n} representing \"z\" in any of\n     * the following expressions, the result would be \"w.x.y.z\":\n     * \u003ccode\u003e var w \u003d {x: {y: {z: 0}}}; \u003c/code\u003e\n     * \u003ccode\u003e w.x \u003d {y: {z: 0}}; \u003c/code\u003e\n     * \u003ccode\u003e w.x.y \u003d {\u0027a\u0027: 0, \u0027z\u0027: 0}; \u003c/code\u003e\n     *\n     * @param n A child of an OBJLIT node\n     * @return The global name, or null if {@code n} doesn\u0027t correspond to the\n     *   key of an object literal that can be named\n     ",
      "child_ranges": [
        "(line 457,col 7)-(line 457,col 34)",
        "(line 458,col 7)-(line 458,col 53)",
        "(line 460,col 7)-(line 460,col 39)",
        "(line 461,col 7)-(line 463,col 7)",
        "(line 465,col 7)-(line 465,col 44)",
        "(line 466,col 7)-(line 466,col 18)",
        "(line 467,col 7)-(line 500,col 7)",
        "(line 501,col 7)-(line 506,col 7)",
        "(line 507,col 7)-(line 507,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getValueType(com.google.javascript.rhino.Node)",
      "begin_line": 516,
      "end_line": 538,
      "comment": "\n     * Gets the type of a value or simple expression.\n     *\n     * @param n An r-value in an assignment or variable declaration (not null)\n     * @return A {@link Name.Type}\n     ",
      "child_ranges": [
        "(line 517,col 7)-(line 536,col 7)",
        "(line 537,col 7)-(line 537,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleSetFromGlobal(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, boolean, com.google.javascript.jscomp.GlobalNamespace.Name.Type)",
      "begin_line": 552,
      "end_line": 573,
      "comment": "\n     * Updates our representation of the global namespace to reflect an\n     * assignment to a global name in global scope.\n     *\n     * @param t The traversal\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @param isPropAssign Whether this set corresponds to a property\n     *     assignment of the form \u003ccode\u003ea.b.c \u003d ...;\u003c/code\u003e\n     * @param type The type of the value that the name is being assigned\n     ",
      "child_ranges": [
        "(line 554,col 7)-(line 554,col 65)",
        "(line 556,col 7)-(line 556,col 43)",
        "(line 557,col 7)-(line 557,col 26)",
        "(line 559,col 7)-(line 560,col 34)",
        "(line 561,col 7)-(line 561,col 26)",
        "(line 563,col 7)-(line 572,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.isTypeDeclaration(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 585,
      "end_line": 593,
      "comment": "\n     * Determines whether a set operation is a constructor or enumeration\n     * or interface declaration. The set operation may either be an assignment\n     * to a name, a variable declaration, or an object literal key mapping.\n     *\n     * @param n The node that represents the name being set\n     * @param parent Parent node of {@code n} (an ASSIGN, VAR, or OBJLIT node)\n     * @return Whether the set operation is either a constructor or enum\n     *     declaration\n     ",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 53)",
        "(line 587,col 7)-(line 587,col 52)",
        "(line 589,col 7)-(line 592,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleSetFromLocal(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 604,
      "end_line": 620,
      "comment": "\n     * Updates our representation of the global namespace to reflect an\n     * assignment to a global name in a local scope.\n     *\n     * @param t The traversal\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     ",
      "child_ranges": [
        "(line 606,col 7)-(line 606,col 65)",
        "(line 608,col 7)-(line 608,col 43)",
        "(line 609,col 7)-(line 610,col 59)",
        "(line 611,col 7)-(line 611,col 26)",
        "(line 613,col 7)-(line 619,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleGet(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 631,
      "end_line": 681,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name.\n     *\n     * @param t The traversal\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     ",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 65)",
        "(line 634,col 7)-(line 634,col 42)",
        "(line 635,col 7)-(line 678,col 7)",
        "(line 680,col 7)-(line 680,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.determineGetTypeForHookOrBooleanExpr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 695,
      "end_line": 738,
      "comment": "\n     * Determines whether the result of a hook (x?y:z) or boolean expression\n     * (x||y) or (x\u0026\u0026y) is assigned to a specific global name.\n     *\n     * @param t The traversal\n     * @param parent The parent of the current node in the traversal. This node\n     *     should already be known to be a HOOK, AND, or OR node.\n     * @param name A name that is already known to be global in the current\n     *     scope (e.g. \"a\" or \"a.b.c.d\")\n     * @return The expression\u0027s get type, either {@link Ref.Type#DIRECT_GET} or\n     *     {@link Ref.Type#ALIASING_GET}\n     ",
      "child_ranges": [
        "(line 697,col 7)-(line 697,col 25)",
        "(line 698,col 7)-(line 736,col 7)",
        "(line 737,col 7)-(line 737,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleGet(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 750,
      "end_line": 756,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name.\n     *\n     * @param t The current node traversal\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @param type The reference type\n     ",
      "child_ranges": [
        "(line 752,col 7)-(line 752,col 43)",
        "(line 755,col 7)-(line 755,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.maybeHandlePrototypePrefix(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 769,
      "end_line": 807,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name\u0027s longest prefix before the \"prototype\" property if the\n     * name includes the \"prototype\" property. Does nothing otherwise.\n     *\n     * @param t The current node traversal\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @return Whether the name was handled\n     ",
      "child_ranges": [
        "(line 775,col 7)-(line 775,col 28)",
        "(line 776,col 7)-(line 776,col 20)",
        "(line 777,col 7)-(line 792,col 7)",
        "(line 794,col 7)-(line 798,col 7)",
        "(line 800,col 7)-(line 803,col 7)",
        "(line 805,col 7)-(line 805,col 62)",
        "(line 806,col 7)-(line 806,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.isNestedAssign(com.google.javascript.rhino.Node)",
      "begin_line": 817,
      "end_line": 820,
      "comment": "\n     * Determines whether an assignment is nested (i.e. whether its return\n     * value is used).\n     *\n     * @param parent The parent of the current traversal node (not null)\n     * @return Whether it appears that the return value of the assignment is\n     *     used\n     ",
      "child_ranges": [
        "(line 818,col 7)-(line 819,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getOrCreateName(java.lang.String)",
      "begin_line": 829,
      "end_line": 844,
      "comment": "\n     * Gets a {@link Name} instance for a global name. Creates it if necessary,\n     * as well as instances for any of its prefixes that are not yet defined.\n     *\n     * @param name A global name (e.g. \"a\", \"a.b.c.d\")\n     * @return The {@link Name} instance for {@code name}\n     ",
      "child_ranges": [
        "(line 830,col 7)-(line 830,col 36)",
        "(line 831,col 7)-(line 842,col 7)",
        "(line 843,col 7)-(line 843,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Name",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 855,
      "end_line": 1157,
      "comment": "\n   * A name defined in global scope (e.g. \"a\" or \"a.b.c.d\"). These form a tree.\n   * As the parse tree traversal proceeds, we\u0027ll discover that some names\n   * correspond to JavaScript objects whose properties we should consider\n   * collapsing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "baseName"
      ],
      "begin_line": 864,
      "end_line": 864,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 865,
      "end_line": 865,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 866,
      "end_line": 866,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaration"
      ],
      "begin_line": 869,
      "end_line": 869,
      "comment": " The first global assignment to a name. "
    },
    {
      "type": "field",
      "varNames": [
        "refs"
      ],
      "begin_line": 872,
      "end_line": 872,
      "comment": " All references to a name. This must contain {@code declaration}. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaredType"
      ],
      "begin_line": 875,
      "end_line": 875,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasDeclaredTypeDescendant"
      ],
      "begin_line": 876,
      "end_line": 876,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalSets"
      ],
      "begin_line": 877,
      "end_line": 877,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localSets"
      ],
      "begin_line": 878,
      "end_line": 878,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasingGets"
      ],
      "begin_line": 879,
      "end_line": 879,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalGets"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callGets"
      ],
      "begin_line": 881,
      "end_line": 881,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deleteProps"
      ],
      "begin_line": 882,
      "end_line": 882,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 883,
      "end_line": 883,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "docInfo"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.Name(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 887,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 888,col 7)-(line 888,col 27)",
        "(line 889,col 7)-(line 889,col 27)",
        "(line 890,col 7)-(line 890,col 29)",
        "(line 891,col 7)-(line 891,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addProperty(java.lang.String, boolean)",
      "begin_line": 894,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 895,col 7)-(line 897,col 7)",
        "(line 898,col 7)-(line 898,col 50)",
        "(line 899,col 7)-(line 899,col 22)",
        "(line 900,col 7)-(line 900,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getBaseName()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 7)-(line 904,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getName()",
      "begin_line": 907,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 909,col 7)-(line 909,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getFullName()",
      "begin_line": 912,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 913,col 7)-(line 913,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getDeclaration()",
      "begin_line": 916,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 918,col 7)-(line 918,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isTypeInferred()",
      "begin_line": 921,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 923,col 7)-(line 923,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getType()",
      "begin_line": 926,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 928,col 7)-(line 928,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addRef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 931,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 932,col 7)-(line 932,col 26)",
        "(line 933,col 7)-(line 961,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.removeRef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 964,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 965,col 7)-(line 1003,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getRefs()",
      "begin_line": 1006,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 7)-(line 1007,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addRefInternal(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1010,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 7)-(line 1013,col 7)",
        "(line 1014,col 7)-(line 1014,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canEliminate()",
      "begin_line": 1017,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 7)-(line 1020,col 7)",
        "(line 1022,col 7)-(line 1028,col 7)",
        "(line 1029,col 7)-(line 1029,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isSimpleStubDeclaration()",
      "begin_line": 1032,
      "end_line": 1042,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 7)-(line 1040,col 7)",
        "(line 1041,col 7)-(line 1041,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canCollapse()",
      "begin_line": 1044,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 7)-(line 1048,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isGetOrSetDefinition()",
      "begin_line": 1051,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 7)-(line 1052,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canCollapseUnannotatedChildNames()",
      "begin_line": 1055,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 7)-(line 1059,col 7)",
        "(line 1064,col 7)-(line 1064,col 46)",
        "(line 1065,col 7)-(line 1067,col 7)",
        "(line 1069,col 7)-(line 1071,col 7)",
        "(line 1075,col 7)-(line 1077,col 7)",
        "(line 1080,col 7)-(line 1082,col 7)",
        "(line 1084,col 7)-(line 1084,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.shouldKeepKeys()",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": " Whether this is an object literal that needs to keep its keys. ",
      "child_ranges": [
        "(line 1089,col 7)-(line 1089,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.needsToBeStubbed()",
      "begin_line": 1092,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 7)-(line 1093,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.setDeclaredType()",
      "begin_line": 1096,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 7)-(line 1097,col 26)",
        "(line 1098,col 7)-(line 1101,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isDeclaredType()",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 7)-(line 1105,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isNamespace()",
      "begin_line": 1116,
      "end_line": 1118,
      "comment": "\n     * Determines whether this name is a prefix of at least one class or enum\n     * name. Because classes and enums are always collapsed, the namespace will\n     * have different properties in compiled code than in uncompiled code.\n     *\n     * For example, if foo.bar.DomHelper is a class, then foo and foo.bar are\n     * considered namespaces.\n     ",
      "child_ranges": [
        "(line 1117,col 7)-(line 1117,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isSimpleName()",
      "begin_line": 1124,
      "end_line": 1126,
      "comment": "\n     * Determines whether this is a simple name (as opposed to a qualified\n     * name).\n     ",
      "child_ranges": [
        "(line 1125,col 7)-(line 1125,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.toString()",
      "begin_line": 1128,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 7)-(line 1131,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getJSDocInfo()",
      "begin_line": 1134,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 7)-(line 1136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getDocInfoForDeclaration(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1142,
      "end_line": 1156,
      "comment": "\n     * Tries to get the doc info for a given declaration ref.\n     ",
      "child_ranges": [
        "(line 1143,col 7)-(line 1153,col 7)",
        "(line 1155,col 7)-(line 1155,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Ref",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 1165,
      "end_line": 1276,
      "comment": "\n   * A global name reference. Contains references to the relevant parse tree\n   * node and its ancestors that may be affected.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 1176,
      "end_line": 1176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 1177,
      "end_line": 1177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 1178,
      "end_line": 1178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1179,
      "end_line": 1179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1180,
      "end_line": 1180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 1181,
      "end_line": 1181,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preOrderIndex"
      ],
      "begin_line": 1182,
      "end_line": 1182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "twin"
      ],
      "begin_line": 1191,
      "end_line": 1191,
      "comment": "\n     * Certain types of references are actually double-refs. For example,\n     * var a \u003d b \u003d 0;\n     * counts as both a \"set\" of b and an \"alias\" of b.\n     *\n     * We create two Refs for this node, and mark them as twins of each other.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1196,
      "end_line": 1204,
      "comment": "\n     * Creates a reference at the current node.\n     ",
      "child_ranges": [
        "(line 1197,col 7)-(line 1197,col 23)",
        "(line 1198,col 7)-(line 1198,col 23)",
        "(line 1199,col 7)-(line 1199,col 75)",
        "(line 1200,col 7)-(line 1200,col 47)",
        "(line 1201,col 7)-(line 1201,col 23)",
        "(line 1202,col 7)-(line 1202,col 32)",
        "(line 1203,col 7)-(line 1203,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1206,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1207,col 7)-(line 1207,col 32)",
        "(line 1208,col 7)-(line 1208,col 32)",
        "(line 1209,col 7)-(line 1209,col 36)",
        "(line 1210,col 7)-(line 1210,col 36)",
        "(line 1211,col 7)-(line 1211,col 23)",
        "(line 1212,col 7)-(line 1212,col 34)",
        "(line 1213,col 7)-(line 1213,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1216,
      "end_line": 1223,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 7)-(line 1217,col 23)",
        "(line 1218,col 7)-(line 1218,col 25)",
        "(line 1219,col 7)-(line 1219,col 25)",
        "(line 1220,col 7)-(line 1220,col 24)",
        "(line 1221,col 7)-(line 1221,col 23)",
        "(line 1222,col 7)-(line 1222,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getNode()",
      "begin_line": 1225,
      "end_line": 1228,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 7)-(line 1227,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSourceFile()",
      "begin_line": 1230,
      "end_line": 1233,
      "comment": "",
      "child_ranges": [
        "(line 1232,col 7)-(line 1232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSymbol()",
      "begin_line": 1235,
      "end_line": 1238,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 7)-(line 1237,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getModule()",
      "begin_line": 1240,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1241,col 7)-(line 1241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSourceName()",
      "begin_line": 1244,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1245,col 7)-(line 1245,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getTwin()",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 7)-(line 1249,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.isSet()",
      "begin_line": 1252,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1253,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.markTwins(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1256,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 7)-(line 1260,col 77)",
        "(line 1261,col 7)-(line 1261,col 17)",
        "(line 1262,col 7)-(line 1262,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.cloneAndReclassify(com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 1269,
      "end_line": 1271,
      "comment": "\n     * Create a new ref that is the same as this one, but of\n     * a different class.\n     ",
      "child_ranges": [
        "(line 1270,col 7)-(line 1270,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.createRefForTesting(com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 7)-(line 1274,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Tracker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1286,
      "end_line": 1334,
      "comment": "\n   * An experimental compiler pass for tracking what symbols were added/removed\n   * at each stage of compilation.\n   *\n   * When \"global namespace tracker\" mode is on, we rebuild the global namespace\n   * after each pass, and diff it against the last namespace built.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1287,
      "end_line": 1287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 1288,
      "end_line": 1288,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isInterestingSymbol"
      ],
      "begin_line": 1289,
      "end_line": 1289,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSymbolsInTree"
      ],
      "begin_line": 1291,
      "end_line": 1291,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Tracker.Tracker(com.google.javascript.jscomp.AbstractCompiler, java.io.PrintStream, com.google.common.base.Predicate\u003cjava.lang.String\u003e)",
      "begin_line": 1298,
      "end_line": 1303,
      "comment": "\n       @param stream The stream to print logs to.\n     * @param isInterestingSymbol A predicate to determine which symbols\n     *     we care about.\n     ",
      "child_ranges": [
        "(line 1300,col 7)-(line 1300,col 31)",
        "(line 1301,col 7)-(line 1301,col 27)",
        "(line 1302,col 7)-(line 1302,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Tracker.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1305,
      "end_line": 1333,
      "comment": "",
      "child_ranges": [
        "(line 1306,col 7)-(line 1306,col 79)",
        "(line 1308,col 7)-(line 1308,col 53)",
        "(line 1309,col 7)-(line 1313,col 7)",
        "(line 1315,col 7)-(line 1315,col 51)",
        "(line 1316,col 7)-(line 1318,col 7)",
        "(line 1320,col 7)-(line 1324,col 7)",
        "(line 1326,col 7)-(line 1330,col 7)",
        "(line 1332,col 7)-(line 1332,col 45)"
      ]
    }
  ]
}