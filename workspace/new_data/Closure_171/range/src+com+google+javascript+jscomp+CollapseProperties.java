{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CollapseProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollapseProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 71,
      "end_line": 1120,
      "comment": "\n * Flattens global objects/namespaces by replacing each \u0027.\u0027 with \u0027$\u0027 in\n * their names. This reduces the number of property lookups the browser has\n * to do and allows the {@link RenameVars} pass to shorten namespaced names.\n * For example, goog.events.handleEvent() -\u003e goog$events$handleEvent() -\u003e Za().\n *\n * \u003cp\u003eIf a global object\u0027s name is assigned to more than once, or if a property\n * is added to the global object in a complex expression, then none of its\n * properties will be collapsed (for safety/correctness).\n *\n * \u003cp\u003eIf, after a global object is declared, it is never referenced except when\n * its properties are read or set, then the object will be removed after its\n * properties have been collapsed.\n *\n * \u003cp\u003eUninitialized variable stubs are created at a global object\u0027s declaration\n * site for any of its properties that are added late in a local scope.\n *\n * \u003cp\u003eIf, after an object is declared, it is referenced directly in a way that\n * might create an alias for it, then none of its properties will be collapsed.\n * This behavior is a safeguard to prevent the values associated with the\n * flattened names from getting out of sync with the object\u0027s actual property\n * values. For example, in the following case, an alias a$b, if created, could\n * easily keep the value 0 even after a.b became 5:\n * \u003ccode\u003e a \u003d {b: 0}; c \u003d a; c.b \u003d 5; \u003c/code\u003e.\n *\n * \u003cp\u003eThis pass doesn\u0027t flatten property accesses of the form: a[b].\n *\n * \u003cp\u003eFor lots of examples, see the unit test.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSAFE_NAMESPACE_WARNING"
      ],
      "begin_line": 74,
      "end_line": 77,
      "comment": " Warnings"
    },
    {
      "type": "field",
      "varNames": [
        "NAMESPACE_REDEFINED_WARNING"
      ],
      "begin_line": 79,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNSAFE_THIS"
      ],
      "begin_line": 84,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalNames"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Global namespace tree "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Maps names (e.g. \"a.b.c\") to nodes in the global namespace tree "
    },
    {
      "type": "field",
      "varNames": [
        "collapsePropertiesOnExternTypes"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineAliases"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CollapseProperties.CollapseProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler, for reporting code changes\n   * @param collapsePropertiesOnExternTypes if true, will rename user-defined\n   *     static properties on externed typed. E.g. String.foo.\n   * @param inlineAliases Whether we\u0027re allowed to inline local aliases of\n   *     namespaces, etc.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 29)",
        "(line 111,col 5)-(line 111,col 75)",
        "(line 112,col 5)-(line 112,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 30)",
        "(line 118,col 5)-(line 122,col 5)",
        "(line 124,col 5)-(line 126,col 5)",
        "(line 127,col 5)-(line 127,col 39)",
        "(line 128,col 5)-(line 128,col 44)",
        "(line 129,col 5)-(line 129,col 22)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 138,col 5)-(line 140,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.inlineAliases(com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 161,
      "end_line": 207,
      "comment": "\n   * For each qualified name N in the global scope, we check if:\n   * (a) No ancestor of N is ever aliased or assigned an unknown value type.\n   *     (If N \u003d \"a.b.c\", \"a\" and \"a.b\" are never aliased).\n   * (b) N has exactly one write, and it lives in the global scope.\n   * (c) N is aliased in a local scope.\n   * (d) N is aliased in global scope\n   *\n   * If (a) is true, then GlobalNamespace must know all the writes to N.\n   * If (a) and (b) are true, then N cannot change during the execution of\n   *    a local scope.\n   * If (a) and (b) and (c) are true, then the alias can be inlined if the\n   *    alias obeys the usual rules for how we decide whether a variable is\n   *    inlineable.\n   * If (a) and (b) and (d) are true, then inline the alias if possible (if\n   * it is assigned exactly once unconditionally).\n   * @see InlineVariables\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 75)",
        "(line 165,col 5)-(line 206,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.inlineGlobalAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 218,
      "end_line": 265,
      "comment": "\n   * Attempt to inline an global alias of a global name. This requires that\n   * the name is well defined: assigned unconditionally, assigned exactly once.\n   * It is assumed that, the name for which it is an alias must already\n   * meet these same requirements.\n   *\n   * @param alias The alias to inline\n   * @return Whether the alias was inlined.\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 46)",
        "(line 224,col 5)-(line 262,col 5)",
        "(line 264,col 5)-(line 264,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.rewriteAliasProps(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.rhino.Node, int, java.util.List\u003ccom.google.javascript.jscomp.GlobalNamespace.AstChange\u003e)",
      "begin_line": 273,
      "end_line": 311,
      "comment": "\n   * @param name The Name whose properties references should be updated.\n   * @param value The value to use when rewriting.\n   * @param depth The chain depth.\n   * @param newNodes Expression nodes that have been updated.\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 310,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.isInlinableGlobalAlias(com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 313,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 318,col 5)",
        "(line 321,col 5)-(line 338,col 5)",
        "(line 339,col 5)-(line 339,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 342,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 46)",
        "(line 348,col 5)-(line 384,col 5)",
        "(line 386,col 5)-(line 386,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.getRefModule(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 63)",
        "(line 391,col 5)-(line 391,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.checkNamespaces()",
      "begin_line": 398,
      "end_line": 427,
      "comment": "\n   * Runs through all namespaces (prefixes of classes and enums), and checks if\n   * any of them have been used in an unsafe way.\n   ",
      "child_ranges": [
        "(line 399,col 5)-(line 426,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 435,
      "end_line": 439,
      "comment": "\n   * Reports a warning because a namespace was aliased.\n   *\n   * @param nameObj A namespace that is being aliased\n   * @param ref The reference that forced the alias\n   ",
      "child_ranges": [
        "(line 436,col 5)-(line 438,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 447,
      "end_line": 451,
      "comment": "\n   * Reports a warning because a namespace was redefined.\n   *\n   * @param nameObj A namespace that is being redefined\n   * @param ref The reference that set the namespace\n   ",
      "child_ranges": [
        "(line 448,col 5)-(line 450,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 460,
      "end_line": 477,
      "comment": "\n   * Flattens all references to collapsible properties of a global name except\n   * their initial definitions. Recurses on subnames.\n   *\n   * @param n An object representing a global name\n   * @param alias The flattened name for {@code n}\n   ",
      "child_ranges": [
        "(line 462,col 5)-(line 464,col 5)",
        "(line 466,col 5)-(line 476,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 484,
      "end_line": 497,
      "comment": "\n   * Flattens a stub declaration.\n   * This is mostly a hack to support legacy users.\n   ",
      "child_ranges": [
        "(line 485,col 5)-(line 485,col 55)",
        "(line 486,col 5)-(line 488,col 28)",
        "(line 489,col 5)-(line 489,col 66)",
        "(line 491,col 5)-(line 492,col 45)",
        "(line 493,col 5)-(line 493,col 39)",
        "(line 494,col 5)-(line 494,col 37)",
        "(line 495,col 5)-(line 495,col 41)",
        "(line 496,col 5)-(line 496,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 507,
      "end_line": 536,
      "comment": "\n   * Flattens all references to a collapsible property of a global name except\n   * its initial definition.\n   *\n   * @param n A global property name (e.g. \"a.b\" or \"a.b.c.d\")\n   * @param alias The flattened name (e.g. \"a$b\" or \"a$b$c$d\")\n   ",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 42)",
        "(line 509,col 5)-(line 526,col 5)",
        "(line 531,col 5)-(line 535,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, int)",
      "begin_line": 547,
      "end_line": 575,
      "comment": "\n   * Flattens all occurrences of a name as a prefix of subnames beginning\n   * with a particular subname.\n   *\n   * @param n A global property name (e.g. \"a.b.c.d\")\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param depth The difference in depth between the property name and\n   *    the prefix name (e.g. 2)\n   ",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 42)",
        "(line 551,col 5)-(line 551,col 34)",
        "(line 552,col 5)-(line 555,col 5)",
        "(line 557,col 5)-(line 568,col 5)",
        "(line 570,col 5)-(line 574,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 586,
      "end_line": 603,
      "comment": "\n   * Flattens a particular prefix of a single name reference.\n   *\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param n The node corresponding to a subproperty name (e.g. \"a.b.c.d\")\n   * @param depth The difference in depth between the property name and\n   *    the prefix name (e.g. 2)\n   * @param originalName String version of the property name.\n   ",
      "child_ranges": [
        "(line 591,col 5)-(line 591,col 28)",
        "(line 592,col 5)-(line 592,col 68)",
        "(line 593,col 5)-(line 593,col 50)",
        "(line 594,col 5)-(line 594,col 50)",
        "(line 595,col 5)-(line 602,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenNameRef(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 613,
      "end_line": 638,
      "comment": "\n   * Replaces a GETPROP a.b.c with a NAME a$b$c.\n   *\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param n The GETPROP node corresponding to the original name (e.g. \"a.b\")\n   * @param parent {@code n}\u0027s parent\n   * @param originalName String version of the property name.\n   ",
      "child_ranges": [
        "(line 623,col 5)-(line 624,col 64)",
        "(line 625,col 5)-(line 625,col 56)",
        "(line 626,col 5)-(line 630,col 5)",
        "(line 632,col 5)-(line 632,col 32)",
        "(line 633,col 5)-(line 635,col 5)",
        "(line 636,col 5)-(line 636,col 32)",
        "(line 637,col 5)-(line 637,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 648,
      "end_line": 673,
      "comment": "\n   * Collapses definitions of the collapsible properties of a global name.\n   * Recurses on subnames that also represent JavaScript objects with\n   * collapsible properties.\n   *\n   * @param n A node representing a global name\n   * @param alias The flattened name for {@code n}\n   ",
      "child_ranges": [
        "(line 649,col 5)-(line 649,col 73)",
        "(line 652,col 5)-(line 654,col 5)",
        "(line 656,col 5)-(line 672,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 686,
      "end_line": 751,
      "comment": "\n   * Updates the initial assignment to a collapsible property at global scope\n   * by changing it to a variable declaration (e.g. a.b \u003d 1 -\u003e var a$b \u003d 1).\n   * The property\u0027s value may either be a primitive or an object literal or\n   * function whose properties aren\u0027t collapsible.\n   *\n   * @param alias The flattened property name (e.g. \"a$b\")\n   * @param refName The name for the reference being updated.\n   * @param ref An object containing information about the assignment getting\n   *     updated\n   ",
      "child_ranges": [
        "(line 687,col 5)-(line 687,col 37)",
        "(line 688,col 5)-(line 688,col 39)",
        "(line 689,col 5)-(line 689,col 37)",
        "(line 690,col 5)-(line 690,col 42)",
        "(line 692,col 5)-(line 694,col 5)",
        "(line 697,col 5)-(line 699,col 31)",
        "(line 700,col 5)-(line 700,col 68)",
        "(line 702,col 5)-(line 748,col 5)",
        "(line 750,col 5)-(line 750,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, boolean)",
      "begin_line": 772,
      "end_line": 799,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name.\n   * This involves flattening the global name (if it\u0027s not just a global\n   * variable name already), collapsing object literal keys into global\n   * variables, declaring stub global variables for properties added later\n   * in a local scope.\n   *\n   * It may seem odd that this function also takes care of declaring stubs\n   * for direct children. The ultimate goal of this function is to eliminate\n   * the global name entirely (when possible), so that \"middlemen\" namespaces\n   * disappear, and to do that we need to make sure that all the direct children\n   * will be collapsed as well.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name for {@code n} (e.g. \"a\", \"a$b$c\")\n   * @param canCollapseChildNames Whether it\u0027s possible to collapse children of\n   *     this name. (This is mostly passed for convenience; it\u0027s equivalent to\n   *     n.canCollapseChildNames()).\n   ",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 34)",
        "(line 775,col 5)-(line 779,col 5)",
        "(line 781,col 5)-(line 785,col 5)",
        "(line 787,col 5)-(line 798,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, boolean)",
      "begin_line": 809,
      "end_line": 875,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at an ASSIGN node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name for {@code n} (e.g. \"a\", \"a$b$c\")\n   ",
      "child_ranges": [
        "(line 815,col 5)-(line 815,col 33)",
        "(line 816,col 5)-(line 816,col 37)",
        "(line 817,col 5)-(line 817,col 39)",
        "(line 818,col 5)-(line 818,col 45)",
        "(line 819,col 5)-(line 819,col 42)",
        "(line 820,col 5)-(line 820,col 44)",
        "(line 821,col 5)-(line 821,col 36)",
        "(line 823,col 5)-(line 857,col 5)",
        "(line 859,col 5)-(line 867,col 5)",
        "(line 869,col 5)-(line 874,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 881,
      "end_line": 899,
      "comment": "\n   * Warns about any references to \"this\" in the given FUNCTION. The function\n   * is getting collapsed, so the references will change.\n   ",
      "child_ranges": [
        "(line 885,col 5)-(line 898,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.Anonymous-77f7abd4-924d-46fd-9578-95f01ffffb31.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 889,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 891,col 15)-(line 895,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 908,
      "end_line": 946,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at a VAR node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 910,col 5)-(line 912,col 5)",
        "(line 914,col 5)-(line 914,col 33)",
        "(line 915,col 5)-(line 915,col 39)",
        "(line 916,col 5)-(line 916,col 43)",
        "(line 917,col 5)-(line 917,col 40)",
        "(line 918,col 5)-(line 918,col 38)",
        "(line 920,col 5)-(line 920,col 44)",
        "(line 921,col 5)-(line 921,col 23)",
        "(line 923,col 5)-(line 927,col 5)",
        "(line 929,col 5)-(line 929,col 76)",
        "(line 931,col 5)-(line 941,col 5)",
        "(line 943,col 5)-(line 945,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 955,
      "end_line": 965,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at a FUNCTION node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 957,col 5)-(line 959,col 5)",
        "(line 961,col 5)-(line 961,col 33)",
        "(line 962,col 5)-(line 962,col 41)",
        "(line 963,col 5)-(line 964,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 980,
      "end_line": 1066,
      "comment": "\n   * Declares global variables to serve as aliases for the values in an object\n   * literal, optionally removing all of the object literal\u0027s keys and values.\n   *\n   * @param alias The object literal\u0027s flattened name (e.g. \"a$b$c\")\n   * @param objlit The OBJLIT node\n   * @param varNode The VAR node to which new global variables should be added\n   *     as children\n   * @param nameToAddAfter The child of {@code varNode} after which new\n   *     variables should be added (may be null)\n   * @param varParent {@code varNode}\u0027s parent\n   * @return The number of variables added\n   ",
      "child_ranges": [
        "(line 983,col 5)-(line 983,col 20)",
        "(line 984,col 5)-(line 984,col 33)",
        "(line 985,col 5)-(line 985,col 55)",
        "(line 987,col 5)-(line 1064,col 5)",
        "(line 1065,col 5)-(line 1065,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1081,
      "end_line": 1109,
      "comment": "\n   * Adds global variable \"stubs\" for any properties of a global name that are\n   * only set in a local scope or read but never set.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name of the object whose properties we are\n   *     adding stubs for (e.g. \"a$b$c\")\n   * @param parent The node to which new global variables should be added\n   *     as children\n   * @param addAfter The child of after which new\n   *     variables should be added (may be null)\n   * @return The number of variables added\n   ",
      "child_ranges": [
        "(line 1083,col 5)-(line 1083,col 67)",
        "(line 1084,col 5)-(line 1084,col 67)",
        "(line 1085,col 5)-(line 1085,col 41)",
        "(line 1086,col 5)-(line 1086,col 21)",
        "(line 1087,col 5)-(line 1107,col 5)",
        "(line 1108,col 5)-(line 1108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(java.lang.String, java.lang.String)",
      "begin_line": 1111,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 5)-(line 1117,col 5)",
        "(line 1118,col 5)-(line 1118,col 29)"
      ]
    }
  ]
}