{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GlobalNamespace.java",
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
      "end_line": 1345,
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
      "type": "class_interface",
      "name": "AstChange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 177,
      "end_line": 187,
      "comment": "\n   * A simple data class that contains the information necessary to inspect\n   * a node for changes to the global namespace.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.AstChange.AstChange(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 183,col 7)-(line 183,col 27)",
        "(line 184,col 7)-(line 184,col 25)",
        "(line 185,col 7)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.scanNewNodes(java.util.List\u003ccom.google.javascript.jscomp.GlobalNamespace.AstChange\u003e)",
      "begin_line": 194,
      "end_line": 203,
      "comment": "\n   * If the client adds new nodes to the AST, scan these new nodes\n   * to see if they\u0027ve added any references to the global namespace.\n   * @param newNodes New nodes to check.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 62)",
        "(line 197,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.scanFromNode(com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace, com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 210,col 5)",
        "(line 211,col 5)-(line 211,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.process()",
      "begin_line": 217,
      "end_line": 226,
      "comment": "\n   * Builds the namespace lazily.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 221,col 5)",
        "(line 222,col 5)-(line 222,col 22)",
        "(line 224,col 5)-(line 224,col 71)",
        "(line 225,col 5)-(line 225,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalNameReference(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n   * Determines whether a name reference in a particular scope is a global name\n   * reference.\n   *\n   * @param name A variable or property name (e.g. \"a\" or \"a.b.c.d\")\n   * @param s The scope in which the name is referenced\n   * @return Whether the name reference is a global name reference\n   ",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 44)",
        "(line 238,col 5)-(line 238,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.getTopVarName(java.lang.String)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n   * Gets the top variable name from a possibly namespaced name.\n   *\n   * @param name A variable or qualified property name (e.g. \"a\" or \"a.b.c.d\")\n   * @return The top variable name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 42)",
        "(line 249,col 5)-(line 249,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalVarReference(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 260,
      "end_line": 266,
      "comment": "\n   * Determines whether a variable name reference in a particular scope is a\n   * global variable reference.\n   *\n   * @param name A variable name (e.g. \"a\")\n   * @param s The scope in which the name is referenced\n   * @return Whether the name reference is a global variable reference\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 33)",
        "(line 262,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.isGlobalScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n   * Gets whether a scope is the global scope.\n   *\n   * @param s A scope\n   * @return Whether the scope is the global scope\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BuildGlobalNamespace",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 283,
      "end_line": 853,
      "comment": "\n   * Builds a tree representation of the global namespace. Omits prototypes.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.BuildGlobalNamespace()",
      "begin_line": 285,
      "end_line": 286,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 288,
      "end_line": 289,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 292,
      "end_line": 303,
      "comment": " Collect the references in pre-order. ",
      "child_ranges": [
        "(line 296,col 7)-(line 298,col 7)",
        "(line 300,col 7)-(line 300,col 46)",
        "(line 302,col 7)-(line 302,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.collect(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node)",
      "begin_line": 305,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 34)",
        "(line 308,col 7)-(line 308,col 18)",
        "(line 309,col 7)-(line 309,col 28)",
        "(line 310,col 7)-(line 310,col 39)",
        "(line 311,col 7)-(line 311,col 35)",
        "(line 313,col 7)-(line 413,col 7)",
        "(line 416,col 7)-(line 418,col 7)",
        "(line 420,col 7)-(line 428,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getNameForObjLitKey(com.google.javascript.rhino.Node)",
      "begin_line": 447,
      "end_line": 499,
      "comment": "\n     * Gets the fully qualified name corresponding to an object literal key,\n     * as long as it and its prefix property names are valid JavaScript\n     * identifiers. The object literal may be nested inside of other object\n     * literals.\n     *\n     * For example, if called with node {@code n} representing \"z\" in any of\n     * the following expressions, the result would be \"w.x.y.z\":\n     * \u003ccode\u003e var w \u003d {x: {y: {z: 0}}}; \u003c/code\u003e\n     * \u003ccode\u003e w.x \u003d {y: {z: 0}}; \u003c/code\u003e\n     * \u003ccode\u003e w.x.y \u003d {\u0027a\u0027: 0, \u0027z\u0027: 0}; \u003c/code\u003e\n     *\n     * @param n A child of an OBJLIT node\n     * @return The global name, or null if {@code n} doesn\u0027t correspond to the\n     *   key of an object literal that can be named\n     ",
      "child_ranges": [
        "(line 448,col 7)-(line 448,col 34)",
        "(line 449,col 7)-(line 449,col 53)",
        "(line 451,col 7)-(line 451,col 39)",
        "(line 452,col 7)-(line 454,col 7)",
        "(line 456,col 7)-(line 456,col 44)",
        "(line 457,col 7)-(line 457,col 18)",
        "(line 458,col 7)-(line 491,col 7)",
        "(line 492,col 7)-(line 497,col 7)",
        "(line 498,col 7)-(line 498,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getValueType(com.google.javascript.rhino.Node)",
      "begin_line": 507,
      "end_line": 531,
      "comment": "\n     * Gets the type of a value or simple expression.\n     *\n     * @param n An r-value in an assignment or variable declaration (not null)\n     * @return A {@link Name.Type}\n     ",
      "child_ranges": [
        "(line 508,col 7)-(line 529,col 7)",
        "(line 530,col 7)-(line 530,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleSetFromGlobal(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, boolean, com.google.javascript.jscomp.GlobalNamespace.Name.Type)",
      "begin_line": 546,
      "end_line": 570,
      "comment": "\n     * Updates our representation of the global namespace to reflect an\n     * assignment to a global name in global scope.\n     *\n     * @param module the current module\n     * @param scope the current scope\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @param isPropAssign Whether this set corresponds to a property\n     *     assignment of the form \u003ccode\u003ea.b.c \u003d ...;\u003c/code\u003e\n     * @param type The type of the value that the name is being assigned\n     ",
      "child_ranges": [
        "(line 549,col 7)-(line 551,col 7)",
        "(line 553,col 7)-(line 553,col 43)",
        "(line 554,col 7)-(line 554,col 26)",
        "(line 556,col 7)-(line 557,col 34)",
        "(line 558,col 7)-(line 558,col 26)",
        "(line 560,col 7)-(line 569,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.isTypeDeclaration(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 582,
      "end_line": 590,
      "comment": "\n     * Determines whether a set operation is a constructor or enumeration\n     * or interface declaration. The set operation may either be an assignment\n     * to a name, a variable declaration, or an object literal key mapping.\n     *\n     * @param n The node that represents the name being set\n     * @param parent Parent node of {@code n} (an ASSIGN, VAR, or OBJLIT node)\n     * @return Whether the set operation is either a constructor or enum\n     *     declaration\n     ",
      "child_ranges": [
        "(line 583,col 7)-(line 583,col 53)",
        "(line 584,col 7)-(line 584,col 52)",
        "(line 586,col 7)-(line 589,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleSetFromLocal(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 602,
      "end_line": 620,
      "comment": "\n     * Updates our representation of the global namespace to reflect an\n     * assignment to a global name in a local scope.\n     *\n     * @param module The current module\n     * @param scope The current scope\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     ",
      "child_ranges": [
        "(line 604,col 7)-(line 606,col 7)",
        "(line 608,col 7)-(line 608,col 43)",
        "(line 609,col 7)-(line 610,col 59)",
        "(line 611,col 7)-(line 611,col 26)",
        "(line 613,col 7)-(line 619,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleGet(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 632,
      "end_line": 685,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name.\n     *\n     * @param module The current module\n     * @param scope The current scope\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     ",
      "child_ranges": [
        "(line 634,col 7)-(line 636,col 7)",
        "(line 638,col 7)-(line 638,col 42)",
        "(line 639,col 7)-(line 682,col 7)",
        "(line 684,col 7)-(line 684,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.determineGetTypeForHookOrBooleanExpr(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 700,
      "end_line": 743,
      "comment": "\n     * Determines whether the result of a hook (x?y:z) or boolean expression\n     * (x||y) or (x\u0026\u0026y) is assigned to a specific global name.\n     *\n     * @param module The current module\n     * @param scope The current scope\n     * @param parent The parent of the current node in the traversal. This node\n     *     should already be known to be a HOOK, AND, or OR node.\n     * @param name A name that is already known to be global in the current\n     *     scope (e.g. \"a\" or \"a.b.c.d\")\n     * @return The expression\u0027s get type, either {@link Ref.Type#DIRECT_GET} or\n     *     {@link Ref.Type#ALIASING_GET}\n     ",
      "child_ranges": [
        "(line 702,col 7)-(line 702,col 25)",
        "(line 703,col 7)-(line 741,col 7)",
        "(line 742,col 7)-(line 742,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.handleGet(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 756,
      "end_line": 763,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name.\n     *\n     * @param module The current module\n     * @param scope The current scope\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @param type The reference type\n     ",
      "child_ranges": [
        "(line 758,col 7)-(line 758,col 43)",
        "(line 761,col 7)-(line 762,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.maybeHandlePrototypePrefix(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 777,
      "end_line": 815,
      "comment": "\n     * Updates our representation of the global namespace to reflect a read\n     * of a global name\u0027s longest prefix before the \"prototype\" property if the\n     * name includes the \"prototype\" property. Does nothing otherwise.\n     *\n     * @param module The current module\n     * @param scope The current scope\n     * @param n The node currently being visited\n     * @param parent {@code n}\u0027s parent\n     * @param name The global name (e.g. \"a\" or \"a.b.c.d\")\n     * @return Whether the name was handled\n     ",
      "child_ranges": [
        "(line 783,col 7)-(line 783,col 28)",
        "(line 784,col 7)-(line 784,col 20)",
        "(line 785,col 7)-(line 800,col 7)",
        "(line 802,col 7)-(line 806,col 7)",
        "(line 808,col 7)-(line 811,col 7)",
        "(line 813,col 7)-(line 813,col 74)",
        "(line 814,col 7)-(line 814,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.isNestedAssign(com.google.javascript.rhino.Node)",
      "begin_line": 825,
      "end_line": 828,
      "comment": "\n     * Determines whether an assignment is nested (i.e. whether its return\n     * value is used).\n     *\n     * @param parent The parent of the current traversal node (not null)\n     * @return Whether it appears that the return value of the assignment is\n     *     used\n     ",
      "child_ranges": [
        "(line 826,col 7)-(line 827,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.BuildGlobalNamespace.getOrCreateName(java.lang.String)",
      "begin_line": 837,
      "end_line": 852,
      "comment": "\n     * Gets a {@link Name} instance for a global name. Creates it if necessary,\n     * as well as instances for any of its prefixes that are not yet defined.\n     *\n     * @param name A global name (e.g. \"a\", \"a.b.c.d\")\n     * @return The {@link Name} instance for {@code name}\n     ",
      "child_ranges": [
        "(line 838,col 7)-(line 838,col 36)",
        "(line 839,col 7)-(line 850,col 7)",
        "(line 851,col 7)-(line 851,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Name",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 863,
      "end_line": 1164,
      "comment": "\n   * A name defined in global scope (e.g. \"a\" or \"a.b.c.d\"). These form a tree.\n   * As the parse tree traversal proceeds, we\u0027ll discover that some names\n   * correspond to JavaScript objects whose properties we should consider\n   * collapsing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "baseName"
      ],
      "begin_line": 872,
      "end_line": 872,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaration"
      ],
      "begin_line": 877,
      "end_line": 877,
      "comment": " The first global assignment to a name. "
    },
    {
      "type": "field",
      "varNames": [
        "refs"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": " All references to a name. This must contain {@code declaration}. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 882,
      "end_line": 882,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declaredType"
      ],
      "begin_line": 883,
      "end_line": 883,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasDeclaredTypeDescendant"
      ],
      "begin_line": 884,
      "end_line": 884,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalSets"
      ],
      "begin_line": 885,
      "end_line": 885,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "localSets"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasingGets"
      ],
      "begin_line": 887,
      "end_line": 887,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "totalGets"
      ],
      "begin_line": 888,
      "end_line": 888,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callGets"
      ],
      "begin_line": 889,
      "end_line": 889,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deleteProps"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 891,
      "end_line": 891,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "docInfo"
      ],
      "begin_line": 893,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.Name(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 895,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 896,col 7)-(line 896,col 27)",
        "(line 897,col 7)-(line 897,col 27)",
        "(line 898,col 7)-(line 898,col 29)",
        "(line 899,col 7)-(line 899,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addProperty(java.lang.String, boolean)",
      "begin_line": 902,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 903,col 7)-(line 905,col 7)",
        "(line 906,col 7)-(line 906,col 50)",
        "(line 907,col 7)-(line 907,col 22)",
        "(line 908,col 7)-(line 908,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getBaseName()",
      "begin_line": 911,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 912,col 7)-(line 912,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getName()",
      "begin_line": 915,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 917,col 7)-(line 917,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getFullName()",
      "begin_line": 920,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 921,col 7)-(line 921,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getDeclaration()",
      "begin_line": 924,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 926,col 7)-(line 926,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isTypeInferred()",
      "begin_line": 929,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 931,col 7)-(line 931,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getType()",
      "begin_line": 934,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 936,col 7)-(line 936,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addRef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 939,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 940,col 7)-(line 940,col 26)",
        "(line 941,col 7)-(line 969,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.removeRef(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 972,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 973,col 7)-(line 1011,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getRefs()",
      "begin_line": 1014,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 7)-(line 1015,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.addRefInternal(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1018,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 7)-(line 1021,col 7)",
        "(line 1022,col 7)-(line 1022,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canEliminate()",
      "begin_line": 1025,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 7)-(line 1028,col 7)",
        "(line 1030,col 7)-(line 1036,col 7)",
        "(line 1037,col 7)-(line 1037,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isSimpleStubDeclaration()",
      "begin_line": 1040,
      "end_line": 1049,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 7)-(line 1047,col 7)",
        "(line 1048,col 7)-(line 1048,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canCollapse()",
      "begin_line": 1051,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 7)-(line 1055,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isGetOrSetDefinition()",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 7)-(line 1059,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.canCollapseUnannotatedChildNames()",
      "begin_line": 1062,
      "end_line": 1092,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 7)-(line 1066,col 7)",
        "(line 1071,col 7)-(line 1071,col 46)",
        "(line 1072,col 7)-(line 1074,col 7)",
        "(line 1076,col 7)-(line 1078,col 7)",
        "(line 1082,col 7)-(line 1084,col 7)",
        "(line 1087,col 7)-(line 1089,col 7)",
        "(line 1091,col 7)-(line 1091,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.shouldKeepKeys()",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": " Whether this is an object literal that needs to keep its keys. ",
      "child_ranges": [
        "(line 1096,col 7)-(line 1096,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.needsToBeStubbed()",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 7)-(line 1100,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.setDeclaredType()",
      "begin_line": 1103,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 7)-(line 1104,col 26)",
        "(line 1105,col 7)-(line 1108,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isDeclaredType()",
      "begin_line": 1111,
      "end_line": 1113,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 7)-(line 1112,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isNamespace()",
      "begin_line": 1123,
      "end_line": 1125,
      "comment": "\n     * Determines whether this name is a prefix of at least one class or enum\n     * name. Because classes and enums are always collapsed, the namespace will\n     * have different properties in compiled code than in uncompiled code.\n     *\n     * For example, if foo.bar.DomHelper is a class, then foo and foo.bar are\n     * considered namespaces.\n     ",
      "child_ranges": [
        "(line 1124,col 7)-(line 1124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.isSimpleName()",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "\n     * Determines whether this is a simple name (as opposed to a qualified\n     * name).\n     ",
      "child_ranges": [
        "(line 1132,col 7)-(line 1132,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.toString()",
      "begin_line": 1135,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 7)-(line 1138,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getJSDocInfo()",
      "begin_line": 1141,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1143,col 7)-(line 1143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Name.getDocInfoForDeclaration(com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1149,
      "end_line": 1163,
      "comment": "\n     * Tries to get the doc info for a given declaration ref.\n     ",
      "child_ranges": [
        "(line 1150,col 7)-(line 1160,col 7)",
        "(line 1162,col 7)-(line 1162,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Ref",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticReference\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 1172,
      "end_line": 1286,
      "comment": "\n   * A global name reference. Contains references to the relevant parse tree\n   * node and its ancestors that may be affected.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 1186,
      "end_line": 1186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "module"
      ],
      "begin_line": 1187,
      "end_line": 1187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 1188,
      "end_line": 1188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1189,
      "end_line": 1189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 1190,
      "end_line": 1190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 1191,
      "end_line": 1191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preOrderIndex"
      ],
      "begin_line": 1192,
      "end_line": 1192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "twin"
      ],
      "begin_line": 1201,
      "end_line": 1201,
      "comment": "\n     * Certain types of references are actually double-refs. For example,\n     * var a \u003d b \u003d 0;\n     * counts as both a \"set\" of b and an \"alias\" of b.\n     *\n     * We create two Refs for this node, and mark them as twins of each other.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.Scope, com.google.javascript.rhino.Node, com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1206,
      "end_line": 1214,
      "comment": "\n     * Creates a reference at the current node.\n     ",
      "child_ranges": [
        "(line 1207,col 7)-(line 1207,col 23)",
        "(line 1208,col 7)-(line 1208,col 23)",
        "(line 1209,col 7)-(line 1209,col 27)",
        "(line 1210,col 7)-(line 1210,col 47)",
        "(line 1211,col 7)-(line 1211,col 23)",
        "(line 1212,col 7)-(line 1212,col 25)",
        "(line 1213,col 7)-(line 1213,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1216,
      "end_line": 1224,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 7)-(line 1217,col 32)",
        "(line 1218,col 7)-(line 1218,col 32)",
        "(line 1219,col 7)-(line 1219,col 36)",
        "(line 1220,col 7)-(line 1220,col 36)",
        "(line 1221,col 7)-(line 1221,col 23)",
        "(line 1222,col 7)-(line 1222,col 34)",
        "(line 1223,col 7)-(line 1223,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.Ref(com.google.javascript.jscomp.GlobalNamespace.Ref.Type, int)",
      "begin_line": 1226,
      "end_line": 1233,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 7)-(line 1227,col 23)",
        "(line 1228,col 7)-(line 1228,col 25)",
        "(line 1229,col 7)-(line 1229,col 25)",
        "(line 1230,col 7)-(line 1230,col 24)",
        "(line 1231,col 7)-(line 1231,col 23)",
        "(line 1232,col 7)-(line 1232,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getNode()",
      "begin_line": 1235,
      "end_line": 1238,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 7)-(line 1237,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSourceFile()",
      "begin_line": 1240,
      "end_line": 1243,
      "comment": "",
      "child_ranges": [
        "(line 1242,col 7)-(line 1242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSymbol()",
      "begin_line": 1245,
      "end_line": 1248,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 7)-(line 1247,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getModule()",
      "begin_line": 1250,
      "end_line": 1252,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 7)-(line 1251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getSourceName()",
      "begin_line": 1254,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 7)-(line 1255,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.getTwin()",
      "begin_line": 1258,
      "end_line": 1260,
      "comment": "",
      "child_ranges": [
        "(line 1259,col 7)-(line 1259,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.isSet()",
      "begin_line": 1262,
      "end_line": 1264,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 7)-(line 1263,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.markTwins(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 1266,
      "end_line": 1273,
      "comment": "",
      "child_ranges": [
        "(line 1267,col 7)-(line 1270,col 77)",
        "(line 1271,col 7)-(line 1271,col 17)",
        "(line 1272,col 7)-(line 1272,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.cloneAndReclassify(com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 1279,
      "end_line": 1281,
      "comment": "\n     * Create a new ref that is the same as this one, but of\n     * a different class.\n     ",
      "child_ranges": [
        "(line 1280,col 7)-(line 1280,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Ref.createRefForTesting(com.google.javascript.jscomp.GlobalNamespace.Ref.Type)",
      "begin_line": 1283,
      "end_line": 1285,
      "comment": "",
      "child_ranges": [
        "(line 1284,col 7)-(line 1284,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Tracker",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 1296,
      "end_line": 1344,
      "comment": "\n   * An experimental compiler pass for tracking what symbols were added/removed\n   * at each stage of compilation.\n   *\n   * When \"global namespace tracker\" mode is on, we rebuild the global namespace\n   * after each pass, and diff it against the last namespace built.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 1297,
      "end_line": 1297,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 1298,
      "end_line": 1298,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isInterestingSymbol"
      ],
      "begin_line": 1299,
      "end_line": 1299,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSymbolsInTree"
      ],
      "begin_line": 1301,
      "end_line": 1301,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Tracker.Tracker(com.google.javascript.jscomp.AbstractCompiler, java.io.PrintStream, com.google.common.base.Predicate\u003cjava.lang.String\u003e)",
      "begin_line": 1308,
      "end_line": 1313,
      "comment": "\n       @param stream The stream to print logs to.\n     * @param isInterestingSymbol A predicate to determine which symbols\n     *     we care about.\n     ",
      "child_ranges": [
        "(line 1310,col 7)-(line 1310,col 31)",
        "(line 1311,col 7)-(line 1311,col 27)",
        "(line 1312,col 7)-(line 1312,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalNamespace.Tracker.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1315,
      "end_line": 1343,
      "comment": "",
      "child_ranges": [
        "(line 1316,col 7)-(line 1316,col 79)",
        "(line 1318,col 7)-(line 1318,col 53)",
        "(line 1319,col 7)-(line 1323,col 7)",
        "(line 1325,col 7)-(line 1325,col 51)",
        "(line 1326,col 7)-(line 1328,col 7)",
        "(line 1330,col 7)-(line 1334,col 7)",
        "(line 1336,col 7)-(line 1340,col 7)",
        "(line 1342,col 7)-(line 1342,col 45)"
      ]
    }
  ]
}