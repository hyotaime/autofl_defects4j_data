{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AliasExternals.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasExternals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 78,
      "end_line": 781,
      "comment": "\n * \u003cp\u003eAliasExternals provides wrappers and aliases for external globals and\n * properties to that they can be referenced by their full name only once\n * instead of in all use sites.\u003c/p\u003e\n *\n * \u003cp\u003eThe property alias pass creates function wrappers for properties that need\n * to be accessed externally. These function wrappers are then used by all\n * internal calls to the property, and the names will be compressed during the\n * RenamePrototypes step.\u003c/p\u003e\n *\n * \u003cp\u003eProperties that are accessed externally are either system functions\n * (i.e. window.document), or used by JavaScript embedded on a page.\u003c/p\u003e\n *\n * \u003cp\u003eProperties that are r-values are changed to use array notation with\n * a string that has been defined separately and can be compressed\n * i.e. document.window -\u003e document[PROP_window].\u003c/p\u003e\n *\n * \u003cp\u003eProperties that are l-values and can be renamed are renamed to\n * SETPROP_prop. I.e. node.innerHTML \u003d \u0027\u0026lt;div\u0026gt;Hello\u0026lt;/div\u0026gt;\u0027 -\u003e\n * SETPROP_innerHTML(node, \u0027\u0026lt;div\u0026gt;hello\u0026lt;/div\u0026gt;\u0027).\u003c/p\u003e\n *\n * \u003cp\u003eProperties will only be renamed if they are used more than requiredUsage_\n * times, as there is overhead for adding the accessor and mutator functions.\n * This is initialized to DEFAULT_REQUIRED_USAGE (\u003d4), but can be\n * overridden.\u003c/p\u003e\n *\n * \u003cp\u003eCertain usages (increment, decrement) won\u0027t be addressed, as they would\n * require a getprop, setprop, and custom logic, and aren\u0027t worth\n * optimizing.\u003c/p\u003e\n *\n * \u003cp\u003eThe global alias pass creates aliases for global variables and functions\n * that are declared or need to be used externally. These aliases are then used\n * throughout the code, and will be compressed during the RenameVars step.\u003c/p\u003e\n *\n * \u003cp\u003eGlobals are aliased by inserting code like \"var GLOBAL_window \u003d window;\"\n * and then replacing all other uses of \"window\" with \"GLOBAL_window.\"\u003c/p\u003e\n *\n * \u003cp\u003eGlobals that are l-values are not aliased.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_REQUIRED_USAGE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of times a property needs to be accessed in order to alias "
    },
    {
      "type": "field",
      "varNames": [
        "requiredUsage"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of times a property must be referenced in order to be aliased "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_PROP_SIZE"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Minimum property size to be worth renaming "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_PROPERTY_NAME"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n   * The name of the variable used for the \"prototype\" string value. This is\n   * special-cased to make deobfuscated stack traces shorter and more readable\n   * (\"$MyClass$$P$$method$\" rather than \"$MyClass$$$PROP_prototype$method$\").\n   * @see NameAnonymousFunctions\n   "
    },
    {
      "type": "field",
      "varNames": [
        "props"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Map of all properties that we may be renaming "
    },
    {
      "type": "field",
      "varNames": [
        "accessors"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Holds the properties that can be renamed to GETPROP_ "
    },
    {
      "type": "field",
      "varNames": [
        "mutators"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Holds the properties that can be renamed to SETPROP_ "
    },
    {
      "type": "field",
      "varNames": [
        "replacementMap"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": "\n   * Map of node replacements -\n   * Identity map because Node implements equals() but not hashCode()\n   "
    },
    {
      "type": "field",
      "varNames": [
        "globals"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Map of all globals that we may alias "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Reference to JS Compiler "
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Reference to module inputs "
    },
    {
      "type": "field",
      "varNames": [
        "defaultRoot"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Root in parse tree for adding generated nodes "
    },
    {
      "type": "field",
      "varNames": [
        "moduleRoots"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Root in each module for adding generated nodes, if using modules "
    },
    {
      "type": "field",
      "varNames": [
        "unaliasableGlobals"
      ],
      "begin_line": 133,
      "end_line": 145,
      "comment": "\n   * A set of globals that can not be aliased since they may be undefined or\n   * can cause errors\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasableGlobals"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Whitelist of aliasable externs. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasExternals.AliasExternals(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JSModuleGraph)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The Compiler\n   * @param moduleGraph The graph of input modules. May be null. If given, we\u0027ll\n   *     try to push aliased externs into the deepest possible module.\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasExternals.AliasExternals(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JSModuleGraph, java.lang.String, java.lang.String)",
      "begin_line": 173,
      "end_line": 198,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The Compiler\n   * @param moduleGraph The graph of input modules. May be null. If given, we\u0027ll\n   *     try to push aliased externs into the deepest possible module.\n   * @param unaliasableGlobals Comma-separated list of additional globals that\n   *     cannot be aliased since they may be undefined or can cause errors\n   *     (e.g. \"foo,bar\"). May be null or the empty string.\n   * @param aliasableGlobals Comma-separated list of globals that\n   *     can be aliased. If provided, only this list of globals can be aliased.\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 29)",
        "(line 177,col 5)-(line 177,col 35)",
        "(line 179,col 5)-(line 184,col 5)",
        "(line 186,col 5)-(line 189,col 5)",
        "(line 191,col 5)-(line 193,col 5)",
        "(line 195,col 5)-(line 197,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.setRequiredUsage(int)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n   * Sets the number of times a property needs to be referenced in order to\n   * create an alias for it.\n   * @param usage Number of times\n   ",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n   * Do all processing on the root node.\n   ",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 39)",
        "(line 215,col 5)-(line 215,col 53)",
        "(line 217,col 5)-(line 217,col 35)",
        "(line 218,col 5)-(line 218,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.aliasProperties(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 221,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 224,col 68)",
        "(line 225,col 5)-(line 225,col 62)",
        "(line 228,col 5)-(line 228,col 67)",
        "(line 233,col 5)-(line 242,col 5)",
        "(line 244,col 5)-(line 246,col 5)",
        "(line 249,col 5)-(line 251,col 5)",
        "(line 256,col 5)-(line 260,col 5)",
        "(line 262,col 5)-(line 266,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.replaceAccessor(com.google.javascript.rhino.Node)",
      "begin_line": 274,
      "end_line": 299,
      "comment": "\n   * Replaces a GETPROP with array notation, so that\n   * it can be optimized.\n   * I.e. prop.length -\u003e prop[PROP_length] -\u003e prop[a];\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 51)",
        "(line 286,col 5)-(line 286,col 47)",
        "(line 287,col 5)-(line 298,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.replaceMutator(com.google.javascript.rhino.Node)",
      "begin_line": 304,
      "end_line": 346,
      "comment": "\n   * Changes a.prop \u003d b to SETPROP_prop(a, b);\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 51)",
        "(line 322,col 5)-(line 322,col 46)",
        "(line 324,col 5)-(line 324,col 54)",
        "(line 325,col 5)-(line 345,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.replaceNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 356,
      "end_line": 362,
      "comment": "\n   * Utility function to replace a Node with another node.\n   * Keeps track of previous replacements so that if you try to replace\n   * a child of a parent that has changed, it replaces on the new parent\n   * @param parent Parent of node to be replaced\n   * @param before Node to be replaced\n   * @param after Replacement node\n   ",
      "child_ranges": [
        "(line 357,col 5)-(line 359,col 5)",
        "(line 360,col 5)-(line 360,col 39)",
        "(line 361,col 5)-(line 361,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.addAccessorPropName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 373,
      "end_line": 389,
      "comment": "\n   * Adds a string that can be used to reference properties by array []\n   * notation.\n   *\n   * PROP_prototype \u003d \u0027prototype\u0027;\n   *\n   * @param propName Name of property\n   * @param root Root of output tree that function can be added to\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 41)",
        "(line 382,col 5)-(line 383,col 51)",
        "(line 384,col 5)-(line 384,col 44)",
        "(line 385,col 5)-(line 385,col 36)",
        "(line 386,col 5)-(line 386,col 30)",
        "(line 388,col 5)-(line 388,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.addMutatorFunction(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 398,
      "end_line": 432,
      "comment": "\n   * Create set property function in JS. Output will be:\n   * SETPROP_prop(a, b) {a.prop \u003d b;}\n   *\n   * @param propName Name of property\n   * @param root Root of output tree that function can be added to\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 50)",
        "(line 418,col 5)-(line 418,col 58)",
        "(line 419,col 5)-(line 419,col 59)",
        "(line 421,col 5)-(line 428,col 48)",
        "(line 429,col 5)-(line 429,col 33)",
        "(line 431,col 5)-(line 431,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.getAddingRoot(com.google.javascript.jscomp.JSModule)",
      "begin_line": 442,
      "end_line": 457,
      "comment": "\n   * Gets a SCRIPT node for code insertion in {@code m} or, if {@code m} is\n   * empty, in as deep an ancestor module of {@code m} as possible. Returns\n   * {@code this.defaultRoot} if {@code m} is null.\n   *\n   * @param m The module to find a root in (may be null)\n   * @return A root node\n   ",
      "child_ranges": [
        "(line 443,col 5)-(line 454,col 5)",
        "(line 456,col 5)-(line 456,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetAliasableNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 462,
      "end_line": 481,
      "comment": "\n   * Gets the aliasable names from externs.js\n   "
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasExternals.GetAliasableNames.GetAliasableNames(java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 465,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 7)-(line 466,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.GetAliasableNames.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 469,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 471,col 7)-(line 479,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyGatherer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 487,
      "end_line": 549,
      "comment": "\n   * Gets references to all of the replaceable nodes, as well\n   * as counting the usage for each property name.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.PropertyGatherer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 489,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 491,col 7)-(line 505,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.PropertyGatherer.canReplaceWithGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 519,
      "end_line": 531,
      "comment": "\n     * Logic for when a getprop can be replaced.\n     * Can\u0027t alias a call to eval per ECMA-262 spec section 15.1.2.1\n     * Can\u0027t be an assign -\u003e no a.b \u003d c;\n     * Can\u0027t be inc or dec -\u003e no a.b++; or a.b--;\n     * Must be a GETPROP (NODE, A) where A is a reserved name\n     * @param propNameNode Property name node\n     * @param getPropNode GETPROP node\n     * @param parent parent node\n     * @return True if can be replaced\n     ",
      "child_ranges": [
        "(line 521,col 7)-(line 522,col 53)",
        "(line 523,col 7)-(line 524,col 53)",
        "(line 525,col 7)-(line 526,col 27)",
        "(line 527,col 7)-(line 530,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.PropertyGatherer.canReplaceWithSetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 542,
      "end_line": 548,
      "comment": "\n     * Logic for whether a setprop can be replaced.\n     *\n     * True if it is target of assign (i.e. foo \u003d A.B), and B is a reserved name\n     * @param propNameNode Property name node\n     * @param getPropNode GETPROP node\n     * @param parent parent node\n     * @return True if can be replaced\n     ",
      "child_ranges": [
        "(line 544,col 7)-(line 545,col 53)",
        "(line 546,col 7)-(line 547,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.getMutatorFor(java.lang.String)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n   * Gets the mutator name for a property.\n   ",
      "child_ranges": [
        "(line 555,col 5)-(line 555,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.getArrayNotationNameFor(java.lang.String)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n   * Gets the array notation name for a property.\n   ",
      "child_ranges": [
        "(line 562,col 5)-(line 562,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.aliasGlobals(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 565,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 567,col 5)-(line 567,col 64)",
        "(line 570,col 5)-(line 570,col 65)",
        "(line 573,col 5)-(line 586,col 5)",
        "(line 589,col 5)-(line 597,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GetGlobals",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback"
      ],
      "begin_line": 603,
      "end_line": 638,
      "comment": "\n   * Gets the aliasable names from externs.js\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.GetGlobals.getGlobalName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 604,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 620,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.GetGlobals.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 623,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 625,col 7)-(line 636,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalGatherer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 644,
      "end_line": 685,
      "comment": "\n   * Gets references to all of the replaceable nodes, as well as counting the\n   * usage for each global.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.GlobalGatherer.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 645,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 647,col 7)-(line 683,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.replaceGlobalUse(com.google.javascript.rhino.Node)",
      "begin_line": 690,
      "end_line": 702,
      "comment": "\n   * Replace uses of a global with its aliased name.\n   ",
      "child_ranges": [
        "(line 691,col 5)-(line 691,col 46)",
        "(line 692,col 5)-(line 701,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.addGlobalAliasNode(com.google.javascript.jscomp.AliasExternals.Symbol, com.google.javascript.rhino.Node)",
      "begin_line": 712,
      "end_line": 731,
      "comment": "\n   * Adds an alias variable for the global:\n   *\n   * var GLOBAL_window \u003d window;\n   *\n   * @param global Name of global\n   * @param root Root of output tree that function can be added to\n   ",
      "child_ranges": [
        "(line 721,col 5)-(line 721,col 36)",
        "(line 722,col 5)-(line 722,col 44)",
        "(line 723,col 5)-(line 723,col 73)",
        "(line 725,col 5)-(line 725,col 58)",
        "(line 726,col 5)-(line 726,col 48)",
        "(line 727,col 5)-(line 727,col 38)",
        "(line 728,col 5)-(line 728,col 30)",
        "(line 730,col 5)-(line 730,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.newSymbolForGlobalVar(com.google.javascript.rhino.Node)",
      "begin_line": 733,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 734,col 5)-(line 735,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.newSymbolForProperty(java.lang.String)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 739,col 5)-(line 739,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Symbol",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 743,
      "end_line": 780,
      "comment": " Struct to hold information about properties \u0026 usage "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 744,
      "end_line": 744,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessorCount"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mutatorCount"
      ],
      "begin_line": 746,
      "end_line": 746,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasMutator"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasAccessor"
      ],
      "begin_line": 748,
      "end_line": 748,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isConstant"
      ],
      "begin_line": 749,
      "end_line": 749,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deepestModuleAccess"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deepestModuleMutate"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uses"
      ],
      "begin_line": 754,
      "end_line": 754,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasExternals.Symbol.Symbol(java.lang.String, boolean)",
      "begin_line": 756,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 757,col 7)-(line 757,col 23)",
        "(line 758,col 7)-(line 758,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.Symbol.recordAccessor(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 761,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 762,col 7)-(line 762,col 22)",
        "(line 763,col 7)-(line 768,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasExternals.Symbol.recordMutator(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 771,
      "end_line": 779,
      "comment": "",
      "child_ranges": [
        "(line 772,col 7)-(line 772,col 21)",
        "(line 773,col 7)-(line 778,col 7)"
      ]
    }
  ]
}