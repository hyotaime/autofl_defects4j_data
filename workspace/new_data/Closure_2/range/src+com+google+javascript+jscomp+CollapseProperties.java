{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CollapseProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollapseProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 74,
      "end_line": 970,
      "comment": "\n * Flattens global objects/namespaces by replacing each \u0027.\u0027 with \u0027$\u0027 in\n * their names. This reduces the number of property lookups the browser has\n * to do and allows the {@link RenameVars} pass to shorten namespaced names.\n * For example, goog.events.handleEvent() -\u003e goog$events$handleEvent() -\u003e Za().\n *\n * \u003cp\u003eIf a global object\u0027s name is assigned to more than once, or if a property\n * is added to the global object in a complex expression, then none of its\n * properties will be collapsed (for safety/correctness).\n *\n * \u003cp\u003eIf, after a global object is declared, it is never referenced except when\n * its properties are read or set, then the object will be removed after its\n * properties have been collapsed.\n *\n * \u003cp\u003eUninitialized variable stubs are created at a global object\u0027s declaration\n * site for any of its properties that are added late in a local scope.\n *\n * \u003cp\u003eIf, after an object is declared, it is referenced directly in a way that\n * might create an alias for it, then none of its properties will be collapsed.\n * This behavior is a safeguard to prevent the values associated with the\n * flattened names from getting out of sync with the object\u0027s actual property\n * values. For example, in the following case, an alias a$b, if created, could\n * easily keep the value 0 even after a.b became 5:\n * \u003ccode\u003e a \u003d {b: 0}; c \u003d a; c.b \u003d 5; \u003c/code\u003e.\n *\n * \u003cp\u003eThis pass doesn\u0027t flatten property accesses of the form: a[b].\n *\n * \u003cp\u003eFor lots of examples, see the unit test.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNSAFE_NAMESPACE_WARNING"
      ],
      "begin_line": 77,
      "end_line": 80,
      "comment": " Warnings"
    },
    {
      "type": "field",
      "varNames": [
        "NAMESPACE_REDEFINED_WARNING"
      ],
      "begin_line": 82,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNSAFE_THIS"
      ],
      "begin_line": 87,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalNames"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Global namespace tree "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Maps names (e.g. \"a.b.c\") to nodes in the global namespace tree "
    },
    {
      "type": "field",
      "varNames": [
        "collapsePropertiesOnExternTypes"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineAliases"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CollapseProperties.CollapseProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler, for reporting code changes\n   * @param collapsePropertiesOnExternTypes if true, will rename user-defined\n   *     static properties on externed typed. E.g. String.foo.\n   * @param inlineAliases Whether we\u0027re allowed to inline local aliases of\n   *     namespaces, etc.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 29)",
        "(line 114,col 5)-(line 114,col 75)",
        "(line 115,col 5)-(line 115,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 118,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 30)",
        "(line 121,col 5)-(line 125,col 5)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 44)",
        "(line 132,col 5)-(line 132,col 22)",
        "(line 134,col 5)-(line 136,col 5)",
        "(line 141,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.inlineAliases(com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 161,
      "end_line": 197,
      "comment": "\n   * For each qualified name N in the global scope, we check if:\n   * (a) No ancestor of N is ever aliased or assigned an unknown value type.\n   *     (If N \u003d \"a.b.c\", \"a\" and \"a.b\" are never aliased).\n   * (b) N has exactly one write, and it lives in the global scope.\n   * (c) N is aliased in a local scope.\n   *\n   * If (a) is true, then GlobalNamespace must know all the writes to N.\n   * If (a) and (b) are true, then N cannot change during the execution of\n   *    a local scope.\n   * If (a) and (b) and (c) are true, then the alias can be inlined if the\n   *    alias obeys the usual rules for how we decide whether a variable is\n   *    inlineable.\n   * @see InlineVariables\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 75)",
        "(line 164,col 5)-(line 196,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.inlineAliasIfPossible(com.google.javascript.jscomp.GlobalNamespace.Ref, com.google.javascript.jscomp.GlobalNamespace)",
      "begin_line": 199,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 46)",
        "(line 205,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.checkNamespaces()",
      "begin_line": 249,
      "end_line": 278,
      "comment": "\n   * Runs through all namespaces (prefixes of classes and enums), and checks if\n   * any of them have been used in an unsafe way.\n   ",
      "child_ranges": [
        "(line 250,col 5)-(line 277,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceAliasing(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\n   * Reports a warning because a namespace was aliased.\n   *\n   * @param nameObj A namespace that is being aliased\n   * @param ref The reference that forced the alias\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 289,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.warnAboutNamespaceRedefinition(com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n   * Reports a warning because a namespace was redefined.\n   *\n   * @param nameObj A namespace that is being redefined\n   * @param ref The reference that set the namespace\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 301,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenReferencesToCollapsibleDescendantNames(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 311,
      "end_line": 326,
      "comment": "\n   * Flattens all references to collapsible properties of a global name except\n   * their initial definitions. Recurses on subnames.\n   *\n   * @param n An object representing a global name\n   * @param alias The flattened name for {@code n}\n   ",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 32)",
        "(line 315,col 5)-(line 325,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenSimpleStubDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 333,
      "end_line": 346,
      "comment": "\n   * Flattens a stub declaration.\n   * This is mostly a hack to support legacy users.\n   ",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 55)",
        "(line 335,col 5)-(line 337,col 28)",
        "(line 338,col 5)-(line 338,col 66)",
        "(line 340,col 5)-(line 341,col 45)",
        "(line 342,col 5)-(line 342,col 39)",
        "(line 343,col 5)-(line 343,col 37)",
        "(line 344,col 5)-(line 344,col 41)",
        "(line 345,col 5)-(line 345,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenReferencesTo(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 356,
      "end_line": 385,
      "comment": "\n   * Flattens all references to a collapsible property of a global name except\n   * its initial definition.\n   *\n   * @param n A global property name (e.g. \"a.b\" or \"a.b.c.d\")\n   * @param alias The flattened name (e.g. \"a$b\" or \"a$b$c$d\")\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 42)",
        "(line 358,col 5)-(line 375,col 5)",
        "(line 380,col 5)-(line 384,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenPrefixes(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, int)",
      "begin_line": 396,
      "end_line": 424,
      "comment": "\n   * Flattens all occurrences of a name as a prefix of subnames beginning\n   * with a particular subname.\n   *\n   * @param n A global property name (e.g. \"a.b.c.d\")\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param depth The difference in depth between the property name and\n   *    the prefix name (e.g. 2)\n   ",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 42)",
        "(line 400,col 5)-(line 400,col 34)",
        "(line 401,col 5)-(line 404,col 5)",
        "(line 406,col 5)-(line 417,col 5)",
        "(line 419,col 5)-(line 423,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenNameRefAtDepth(java.lang.String, com.google.javascript.rhino.Node, int, java.lang.String)",
      "begin_line": 435,
      "end_line": 452,
      "comment": "\n   * Flattens a particular prefix of a single name reference.\n   *\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param n The node corresponding to a subproperty name (e.g. \"a.b.c.d\")\n   * @param depth The difference in depth between the property name and\n   *    the prefix name (e.g. 2)\n   * @param originalName String version of the property name.\n   ",
      "child_ranges": [
        "(line 440,col 5)-(line 440,col 28)",
        "(line 441,col 5)-(line 441,col 68)",
        "(line 442,col 5)-(line 442,col 65)",
        "(line 443,col 5)-(line 443,col 50)",
        "(line 444,col 5)-(line 451,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.flattenNameRef(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 462,
      "end_line": 487,
      "comment": "\n   * Replaces a GETPROP a.b.c with a NAME a$b$c.\n   *\n   * @param alias A flattened prefix name (e.g. \"a$b\")\n   * @param n The GETPROP node corresponding to the original name (e.g. \"a.b\")\n   * @param parent {@code n}\u0027s parent\n   * @param originalName String version of the property name.\n   ",
      "child_ranges": [
        "(line 472,col 5)-(line 473,col 64)",
        "(line 474,col 5)-(line 474,col 56)",
        "(line 475,col 5)-(line 479,col 5)",
        "(line 481,col 5)-(line 481,col 32)",
        "(line 482,col 5)-(line 484,col 5)",
        "(line 485,col 5)-(line 485,col 32)",
        "(line 486,col 5)-(line 486,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.collapseDeclarationOfNameAndDescendants(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String)",
      "begin_line": 497,
      "end_line": 522,
      "comment": "\n   * Collapses definitions of the collapsible properties of a global name.\n   * Recurses on subnames that also represent JavaScript objects with\n   * collapsible properties.\n   *\n   * @param n A node representing a global name\n   * @param alias The flattened name for {@code n}\n   ",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 73)",
        "(line 501,col 5)-(line 503,col 5)",
        "(line 505,col 5)-(line 521,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateSimpleDeclaration(java.lang.String, com.google.javascript.jscomp.GlobalNamespace.Name, com.google.javascript.jscomp.GlobalNamespace.Ref)",
      "begin_line": 535,
      "end_line": 601,
      "comment": "\n   * Updates the initial assignment to a collapsible property at global scope\n   * by changing it to a variable declaration (e.g. a.b \u003d 1 -\u003e var a$b \u003d 1).\n   * The property\u0027s value may either be a primitive or an object literal or\n   * function whose properties aren\u0027t collapsible.\n   *\n   * @param alias The flattened property name (e.g. \"a$b\")\n   * @param refName The name for the reference being updated.\n   * @param ref An object containing information about the assignment getting\n   *     updated\n   ",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 37)",
        "(line 537,col 5)-(line 537,col 39)",
        "(line 538,col 5)-(line 538,col 37)",
        "(line 539,col 5)-(line 539,col 42)",
        "(line 540,col 5)-(line 540,col 52)",
        "(line 542,col 5)-(line 544,col 5)",
        "(line 547,col 5)-(line 549,col 31)",
        "(line 550,col 5)-(line 550,col 68)",
        "(line 552,col 5)-(line 598,col 5)",
        "(line 600,col 5)-(line 600,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclaration(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, boolean)",
      "begin_line": 622,
      "end_line": 649,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name.\n   * This involves flattening the global name (if it\u0027s not just a global\n   * variable name already), collapsing object literal keys into global\n   * variables, declaring stub global variables for properties added later\n   * in a local scope.\n   *\n   * It may seem odd that this function also takes care of declaring stubs\n   * for direct children. The ultimate goal of this function is to eliminate\n   * the global name entirely (when possible), so that \"middlemen\" namespaces\n   * disappear, and to do that we need to make sure that all the direct children\n   * will be collapsed as well.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name for {@code n} (e.g. \"a\", \"a$b$c\")\n   * @param canCollapseChildNames Whether it\u0027s possible to collapse children of\n   *     this name. (This is mostly passed for convenience; it\u0027s equivalent to\n   *     n.canCollapseChildNames()).\n   ",
      "child_ranges": [
        "(line 624,col 5)-(line 624,col 34)",
        "(line 625,col 5)-(line 629,col 5)",
        "(line 631,col 5)-(line 635,col 5)",
        "(line 637,col 5)-(line 648,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtAssignNode(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, boolean)",
      "begin_line": 659,
      "end_line": 725,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at an ASSIGN node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name for {@code n} (e.g. \"a\", \"a$b$c\")\n   ",
      "child_ranges": [
        "(line 665,col 5)-(line 665,col 33)",
        "(line 666,col 5)-(line 666,col 37)",
        "(line 667,col 5)-(line 667,col 39)",
        "(line 668,col 5)-(line 668,col 45)",
        "(line 669,col 5)-(line 669,col 42)",
        "(line 670,col 5)-(line 670,col 44)",
        "(line 671,col 5)-(line 671,col 36)",
        "(line 673,col 5)-(line 707,col 5)",
        "(line 709,col 5)-(line 717,col 5)",
        "(line 719,col 5)-(line 724,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.checkForHosedThisReferences(com.google.javascript.rhino.Node, com.google.javascript.rhino.JSDocInfo, com.google.javascript.jscomp.GlobalNamespace.Name)",
      "begin_line": 731,
      "end_line": 749,
      "comment": "\n   * Warns about any references to \"this\" in the given FUNCTION. The function\n   * is getting collapsed, so the references will change.\n   ",
      "child_ranges": [
        "(line 735,col 5)-(line 748,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.Anonymous-9403ad4f-dfd5-4606-bab4-406f1c09dc2b.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 739,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 741,col 15)-(line 745,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateObjLitOrFunctionDeclarationAtVarNode(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 758,
      "end_line": 796,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at a VAR node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 760,col 5)-(line 762,col 5)",
        "(line 764,col 5)-(line 764,col 33)",
        "(line 765,col 5)-(line 765,col 39)",
        "(line 766,col 5)-(line 766,col 43)",
        "(line 767,col 5)-(line 767,col 40)",
        "(line 768,col 5)-(line 768,col 38)",
        "(line 770,col 5)-(line 770,col 44)",
        "(line 771,col 5)-(line 771,col 23)",
        "(line 773,col 5)-(line 777,col 5)",
        "(line 779,col 5)-(line 779,col 76)",
        "(line 781,col 5)-(line 791,col 5)",
        "(line 793,col 5)-(line 795,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.updateFunctionDeclarationAtFunctionNode(com.google.javascript.jscomp.GlobalNamespace.Name, boolean)",
      "begin_line": 805,
      "end_line": 815,
      "comment": "\n   * Updates the first initialization (a.k.a \"declaration\") of a global name\n   * that occurs at a FUNCTION node. See comment for\n   * {@link #updateObjLitOrFunctionDeclaration}.\n   *\n   * @param n An object representing a global name (e.g. \"a\")\n   ",
      "child_ranges": [
        "(line 807,col 5)-(line 809,col 5)",
        "(line 811,col 5)-(line 811,col 33)",
        "(line 812,col 5)-(line 812,col 41)",
        "(line 813,col 5)-(line 814,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.declareVarsForObjLitValues(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 830,
      "end_line": 916,
      "comment": "\n   * Declares global variables to serve as aliases for the values in an object\n   * literal, optionally removing all of the object literal\u0027s keys and values.\n   *\n   * @param alias The object literal\u0027s flattened name (e.g. \"a$b$c\")\n   * @param objlit The OBJLIT node\n   * @param varNode The VAR node to which new global variables should be added\n   *     as children\n   * @param nameToAddAfter The child of {@code varNode} after which new\n   *     variables should be added (may be null)\n   * @param varParent {@code varNode}\u0027s parent\n   * @return The number of variables added\n   ",
      "child_ranges": [
        "(line 833,col 5)-(line 833,col 20)",
        "(line 834,col 5)-(line 834,col 33)",
        "(line 835,col 5)-(line 835,col 55)",
        "(line 837,col 5)-(line 914,col 5)",
        "(line 915,col 5)-(line 915,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.addStubsForUndeclaredProperties(com.google.javascript.jscomp.GlobalNamespace.Name, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 931,
      "end_line": 959,
      "comment": "\n   * Adds global variable \"stubs\" for any properties of a global name that are\n   * only set in a local scope or read but never set.\n   *\n   * @param n An object representing a global name (e.g. \"a\", \"a.b.c\")\n   * @param alias The flattened name of the object whose properties we are\n   *     adding stubs for (e.g. \"a$b$c\")\n   * @param parent The node to which new global variables should be added\n   *     as children\n   * @param addAfter The child of after which new\n   *     variables should be added (may be null)\n   * @return The number of variables added\n   ",
      "child_ranges": [
        "(line 933,col 5)-(line 933,col 67)",
        "(line 934,col 5)-(line 934,col 67)",
        "(line 935,col 5)-(line 935,col 41)",
        "(line 936,col 5)-(line 936,col 21)",
        "(line 937,col 5)-(line 957,col 5)",
        "(line 958,col 5)-(line 958,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CollapseProperties.appendPropForAlias(java.lang.String, java.lang.String)",
      "begin_line": 961,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 962,col 5)-(line 967,col 5)",
        "(line 968,col 5)-(line 968,col 29)"
      ]
    }
  ]
}