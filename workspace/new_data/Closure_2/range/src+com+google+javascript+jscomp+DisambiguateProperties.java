{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DisambiguateProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisambiguateProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 78,
      "end_line": 1115,
      "comment": "\n * DisambiguateProperties renames properties to disambiguate between unrelated\n * fields with the same name. Two properties are considered related if they\n * share a definition on their prototype chains, or if they are potentially\n * referenced together via union types.\n *\n * \u003cp\u003e Renamimg only occurs if there are two or more distinct properties with\n * the same name.\n *\n * \u003cp\u003e This pass allows other passes, such as inlining and code removal to take\n * advantage of type information implicitly.\n *\n * \u003cpre\u003e\n *   Foo.a;\n *   Bar.a;\n * \u003c/pre\u003e\n *\n * \u003cp\u003e will become\n *\n * \u003cpre\u003e\n *   Foo.a$Foo;\n *   Bar.a$Bar;\n * \u003c/pre\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_INVALDIATION_WARNINGS_PER_PROPERTY"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " that we tell the user to fix per-property."
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 83,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Warnings",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 86,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INVALIDATION"
      ],
      "begin_line": 88,
      "end_line": 91,
      "comment": " TODO(user): {1} and {2} are not exactly useful for most people."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeSystem"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidationMap"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * Map of a type to all the related errors that invalidated the type\n   * for disambiguation. It has be Object because of the generic nature of\n   * this pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "propertiesToErrorFor"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n   * In practice any large code base will have thousands and thousands of\n   * type invalidations, which makes reporting all of the errors useless.\n   * However, certain properties are worth specifically guarding because of the\n   * large amount of code that can be removed as dead code. This list contains\n   * the properties (eg: \"toString\") that we care about; if any of these\n   * properties is invalidated it causes an error.\n   "
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 114,
      "end_line": 274,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The name of the property. "
    },
    {
      "type": "field",
      "varNames": [
        "types"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " All types on which the field exists, grouped together if related. "
    },
    {
      "type": "field",
      "varNames": [
        "typesToSkip"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * A set of types for which renaming this field should be skipped. This\n     * list is first filled by fields defined in the externs file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "skipRenaming"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * If true, do not rename any instance of this field, as it has been\n     * referenced from an unknown type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "renameNodes"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Set of nodes for this field that need renaming. "
    },
    {
      "type": "field",
      "varNames": [
        "rootTypes"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Map from node to the highest type in the prototype chain containing the\n     * field for that node. In the case of a union, the type is the highest type\n     * of one of the types in the union.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.Property(java.lang.String)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 7)-(line 144,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.getTypes()",
      "begin_line": 148,
      "end_line": 153,
      "comment": " Returns the types on which this field is referenced. ",
      "child_ranges": [
        "(line 149,col 7)-(line 151,col 7)",
        "(line 152,col 7)-(line 152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.addType(T, T, T)",
      "begin_line": 160,
      "end_line": 178,
      "comment": "\n     * Record that this property is referenced from this type.\n     * @return true if the type was recorded for this property, else false,\n     *     which would happen if the type was invalidating.\n     ",
      "child_ranges": [
        "(line 161,col 7)-(line 161,col 80)",
        "(line 162,col 7)-(line 177,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.addTypeToSkip(T)",
      "begin_line": 181,
      "end_line": 186,
      "comment": " Records the given type as one to skip for this property. ",
      "child_ranges": [
        "(line 182,col 7)-(line 185,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.expandTypesToSkip()",
      "begin_line": 189,
      "end_line": 226,
      "comment": " Invalidates any types related to invalid types. ",
      "child_ranges": [
        "(line 192,col 7)-(line 225,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.shouldRename()",
      "begin_line": 229,
      "end_line": 232,
      "comment": " Returns true if any instance of this property should be renamed. ",
      "child_ranges": [
        "(line 230,col 7)-(line 231,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.shouldRename(T)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns true if this property should be renamed on this type.\n     * expandTypesToSkip() should be called before this, if anything has been\n     * added to the typesToSkip list.\n     ",
      "child_ranges": [
        "(line 240,col 7)-(line 240,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.invalidate()",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * Invalidates a field from renaming.  Used for field references on an\n     * object with unknown type.\n     ",
      "child_ranges": [
        "(line 248,col 7)-(line 248,col 38)",
        "(line 249,col 7)-(line 249,col 26)",
        "(line 250,col 7)-(line 250,col 19)",
        "(line 251,col 7)-(line 251,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.scheduleRenaming(com.google.javascript.rhino.Node, T)",
      "begin_line": 263,
      "end_line": 273,
      "comment": "\n     * Schedule the node to potentially be renamed.\n     * @param node the node to rename\n     * @param type the highest type in the prototype chain for which the\n     *     property is defined\n     * @return True if type was accepted without invalidation or if the property\n     *     was already invalidated.  False if this property was invalidated this\n     *     time.\n     ",
      "child_ranges": [
        "(line 264,col 7)-(line 271,col 7)",
        "(line 272,col 7)-(line 272,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 281,col 5)-(line 282,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 285,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 290,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.DisambiguateProperties(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.DisambiguateProperties.TypeSystem\u003cT\u003e, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 297,
      "end_line": 307,
      "comment": "\n   * This constructor should only be called by one of the helper functions\n   * above for either the JSType system, or the concrete type system.\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 29)",
        "(line 300,col 5)-(line 300,col 33)",
        "(line 301,col 5)-(line 301,col 53)",
        "(line 302,col 5)-(line 306,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 309,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 312,col 67)",
        "(line 313,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 318,col 53)",
        "(line 319,col 5)-(line 319,col 74)",
        "(line 320,col 5)-(line 320,col 75)",
        "(line 321,col 5)-(line 321,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.recordInvalidationError(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 327,col 5)",
        "(line 328,col 5)-(line 330,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 336,
      "end_line": 354,
      "comment": "\n   * Invalidates the given type, so that no properties on it will be renamed.\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 47)",
        "(line 338,col 5)-(line 353,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getProperty(java.lang.String)",
      "begin_line": 358,
      "end_line": 363,
      "comment": " Returns the property for the given name, creating it if necessary. ",
      "child_ranges": [
        "(line 359,col 5)-(line 361,col 5)",
        "(line 362,col 5)-(line 362,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(java.lang.String, T)",
      "begin_line": 366,
      "end_line": 368,
      "comment": " Public for testing. ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractScopingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 371,
      "end_line": 398,
      "comment": " Tracks the current type system scope while traversing. "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 372,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 375,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 377,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 380,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 382,col 7)-(line 386,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 7)-(line 391,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.getScope()",
      "begin_line": 395,
      "end_line": 397,
      "comment": " Returns the current scope at this point in the file. ",
      "child_ranges": [
        "(line 396,col 7)-(line 396,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindExternProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback"
      ],
      "begin_line": 404,
      "end_line": 426,
      "comment": "\n   * Finds all properties defined in the externs file and sets them as\n   * ineligible for renaming from the type on which they are defined.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindExternProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 405,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 407,col 7)-(line 424,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindRenameableProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback"
      ],
      "begin_line": 432,
      "end_line": 566,
      "comment": "\n   * Traverses the tree, building a map from field names to Nodes for all\n   * fields that can be renamed.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 433,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 435,col 7)-(line 439,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.handleGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 445,
      "end_line": 481,
      "comment": "\n     * Processes a GETPROP node.\n     ",
      "child_ranges": [
        "(line 446,col 7)-(line 446,col 49)",
        "(line 447,col 7)-(line 447,col 71)",
        "(line 449,col 7)-(line 449,col 40)",
        "(line 450,col 7)-(line 480,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.handleObjectLit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 486,
      "end_line": 509,
      "comment": "\n     * Processes a OBJECTLIT node.\n     ",
      "child_ranges": [
        "(line 487,col 7)-(line 487,col 37)",
        "(line 488,col 7)-(line 508,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.printErrorLocations(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 511,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 512,col 7)-(line 514,col 7)",
        "(line 516,col 7)-(line 521,col 7)",
        "(line 523,col 7)-(line 530,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.processProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.DisambiguateProperties.Property, T, T)",
      "begin_line": 540,
      "end_line": 565,
      "comment": "\n     * Processes a property, adding it to the list of properties to rename.\n     * @return a representative type for the property reference, which will be\n     *   the highest type on the prototype chain of the provided type.  In the\n     *   case of a union type, it will be the highest type on the prototype\n     *   chain of one of the members of the union.\n     ",
      "child_ranges": [
        "(line 542,col 7)-(line 542,col 59)",
        "(line 543,col 7)-(line 545,col 7)",
        "(line 547,col 7)-(line 547,col 70)",
        "(line 548,col 7)-(line 564,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.renameProperties()",
      "begin_line": 569,
      "end_line": 605,
      "comment": " Renames all properties with references on more than one type. ",
      "child_ranges": [
        "(line 570,col 5)-(line 571,col 50)",
        "(line 573,col 5)-(line 598,col 5)",
        "(line 599,col 5)-(line 600,col 49)",
        "(line 601,col 5)-(line 604,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(com.google.javascript.jscomp.graph.UnionFind\u003cT\u003e, java.lang.String)",
      "begin_line": 611,
      "end_line": 635,
      "comment": "\n   * Chooses a name to use for renaming in each equivalence class and maps\n   * each type in that class to it.\n   ",
      "child_ranges": [
        "(line 612,col 5)-(line 612,col 45)",
        "(line 613,col 5)-(line 633,col 5)",
        "(line 634,col 5)-(line 634,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting()",
      "begin_line": 638,
      "end_line": 651,
      "comment": " Returns a map from field name to types for which it will be renamed. ",
      "child_ranges": [
        "(line 639,col 5)-(line 639,col 64)",
        "(line 640,col 5)-(line 649,col 5)",
        "(line 650,col 5)-(line 650,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeSystem",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 654,
      "end_line": 729,
      "comment": " Interface for providing the type information needed by this pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getRootScope()",
      "begin_line": 659,
      "end_line": 659,
      "comment": " Returns the top-most scope used by the type system (if any). ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 662,
      "end_line": 662,
      "comment": " Returns the new scope started at the given function node. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003cT\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 672,
      "end_line": 672,
      "comment": "\n     * Returns the type of the given node.\n     * @param prop Only types with this property need to be returned. In general\n     *     with type tightening, this will require no special processing, but in\n     *     the case of an unknown JSType, we might need to add in the native\n     *     types since we don\u0027t track them, but only if they have the given\n     *     property.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.isInvalidatingType(T)",
      "begin_line": 680,
      "end_line": 680,
      "comment": "\n     * Returns true if a field reference on this type will invalidate all\n     * references to that field as candidates for renaming. This is true if the\n     * type is unknown or all-inclusive, as variables with such a type could be\n     * references to any object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 686,
      "end_line": 686,
      "comment": "\n     * Informs the given type system that a type is invalidating due to a type\n     * mismatch found during type checking.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypesToSkipForType(T)",
      "begin_line": 693,
      "end_line": 693,
      "comment": "\n     * Returns a set of types that should be skipped given the given type.\n     * This is necessary for interfaces when using JSTypes, as all super\n     * interfaces must also be skipped.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.isTypeToSkip(T)",
      "begin_line": 699,
      "end_line": 699,
      "comment": "\n     * Determines whether the given type is one whose properties should not be\n     * considered for renaming.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.restrictByNotNullOrUndefined(T)",
      "begin_line": 702,
      "end_line": 702,
      "comment": " Remove null and undefined from the options in the given type. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypeAlternatives(T)",
      "begin_line": 709,
      "end_line": 709,
      "comment": "\n     * Returns the alternatives if this is a type that represents multiple\n     * types, and null if not. Union and interface types can correspond to\n     * multiple other types.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypeWithProperty(java.lang.String, T)",
      "begin_line": 715,
      "end_line": 715,
      "comment": "\n     * Returns the type in the chain from the given type that contains the given\n     * field or null if it is not found anywhere.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getInstanceFromPrototype(T)",
      "begin_line": 721,
      "end_line": 721,
      "comment": "\n     * Returns the type of the instance of which this is the prototype or null\n     * if this is not a function prototype.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.recordInterfaces(T, T, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 727,
      "end_line": 728,
      "comment": "\n     * Records that this property could be referenced from any interface that\n     * this type, or any type in its superclass chain, implements.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "JSTypeSystem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem\u003ccom.google.javascript.rhino.jstype.JSType\u003e"
      ],
      "begin_line": 732,
      "end_line": 941,
      "comment": " Implementation of TypeSystem using JSTypes. "
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 733,
      "end_line": 733,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 734,
      "end_line": 734,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.JSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 736,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 737,col 7)-(line 737,col 44)",
        "(line 738,col 7)-(line 746,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 750,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 751,col 7)-(line 751,col 38)",
        "(line 752,col 7)-(line 752,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getRootScope()",
      "begin_line": 755,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 755,col 59)-(line 755,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 757,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 758,col 7)-(line 758,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 761,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 763,col 7)-(line 765,col 7)",
        "(line 766,col 7)-(line 766,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.isInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 769,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 770,col 7)-(line 773,col 7)",
        "(line 775,col 7)-(line 775,col 49)",
        "(line 776,col 7)-(line 776,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypesToSkipForType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 779,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 780,col 7)-(line 780,col 49)",
        "(line 781,col 7)-(line 790,col 7)",
        "(line 791,col 7)-(line 791,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypesToSkipForTypeNonUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 794,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 795,col 7)-(line 795,col 44)",
        "(line 796,col 7)-(line 796,col 29)",
        "(line 797,col 7)-(line 806,col 7)",
        "(line 807,col 7)-(line 807,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.isTypeToSkip(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 810,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 811,col 7)-(line 811,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.restrictByNotNullOrUndefined(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 814,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 815,col 7)-(line 815,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypeAlternatives(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 818,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 819,col 7)-(line 835,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypeWithProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 838,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 839,col 7)-(line 841,col 7)",
        "(line 843,col 7)-(line 846,col 7)",
        "(line 848,col 7)-(line 854,col 7)",
        "(line 857,col 7)-(line 859,col 7)",
        "(line 864,col 7)-(line 864,col 34)",
        "(line 865,col 7)-(line 865,col 49)",
        "(line 866,col 7)-(line 880,col 7)",
        "(line 884,col 7)-(line 893,col 7)",
        "(line 894,col 7)-(line 894,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getInstanceFromPrototype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 897,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 898,col 7)-(line 904,col 7)",
        "(line 905,col 7)-(line 905,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.recordInterfaces(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 908,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 911,col 7)-(line 911,col 49)",
        "(line 912,col 7)-(line 939,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteTypeSystem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 944,
      "end_line": 1114,
      "comment": " Implementation of TypeSystem using concrete types. "
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 945,
      "end_line": 945,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextUniqueId"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 947,
      "end_line": 947,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 948,
      "end_line": 948,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeTypes"
      ],
      "begin_line": 952,
      "end_line": 956,
      "comment": " thus need to be added in if an unknown type is encountered."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.ConcreteTypeSystem(com.google.javascript.jscomp.TightenTypes, com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 958,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 959,col 7)-(line 959,col 19)",
        "(line 960,col 7)-(line 960,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 963,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 964,col 7)-(line 964,col 38)",
        "(line 965,col 7)-(line 965,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getRootScope()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 969,col 7)-(line 969,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 972,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 973,col 7)-(line 973,col 63)",
        "(line 974,col 7)-(line 975,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 978,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 981,col 7)-(line 987,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 995,
      "end_line": 1012,
      "comment": "\n     * Add concrete types for autoboxing types if necessary. The concrete type\n     * system does not track native types, like string, so add them if they are\n     * present in the JSType for the node.\n     ",
      "child_ranges": [
        "(line 997,col 7)-(line 997,col 39)",
        "(line 998,col 7)-(line 1009,col 7)",
        "(line 1011,col 7)-(line 1011,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 1014,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1016,col 7)-(line 1016,col 53)",
        "(line 1017,col 7)-(line 1025,col 7)",
        "(line 1027,col 7)-(line 1032,col 7)",
        "(line 1034,col 7)-(line 1034,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.isInvalidatingType(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1037,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 7)-(line 1042,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypesToSkipForType(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 7)-(line 1047,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.isTypeToSkip(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1050,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1052,col 7)-(line 1054,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.restrictByNotNullOrUndefined(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1057,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 7)-(line 1060,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypeAlternatives(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1063,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 7)-(line 1069,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypeWithProperty(java.lang.String, com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1072,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 7)-(line 1095,col 7)",
        "(line 1096,col 7)-(line 1096,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getInstanceFromPrototype(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1099,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 7)-(line 1105,col 7)",
        "(line 1106,col 7)-(line 1106,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.recordInterfaces(com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 1109,
      "end_line": 1113,
      "comment": "",
      "child_ranges": []
    }
  ]
}