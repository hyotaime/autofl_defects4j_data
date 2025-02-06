{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DisambiguateProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DisambiguateProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 78,
      "end_line": 1133,
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
      "end_line": 97,
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
        "INVALIDATION_ON_TYPE"
      ],
      "begin_line": 93,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeSystem"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidationMap"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n   * Map of a type to all the related errors that invalidated the type\n   * for disambiguation. It has be Object because of the generic nature of\n   * this pass.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "propertiesToErrorFor"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n   * In practice any large code base will have thousands and thousands of\n   * type invalidations, which makes reporting all of the errors useless.\n   * However, certain properties are worth specifically guarding because of the\n   * large amount of code that can be removed as dead code. This list contains\n   * the properties (eg: \"toString\") that we care about; if any of these\n   * properties is invalidated it causes an error.\n   "
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 119,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The name of the property. "
    },
    {
      "type": "field",
      "varNames": [
        "types"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " All types on which the field exists, grouped together if related. "
    },
    {
      "type": "field",
      "varNames": [
        "typesToSkip"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * A set of types for which renaming this field should be skipped. This\n     * list is first filled by fields defined in the externs file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "skipRenaming"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * If true, do not rename any instance of this field, as it has been\n     * referenced from an unknown type.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "renameNodes"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Set of nodes for this field that need renaming. "
    },
    {
      "type": "field",
      "varNames": [
        "rootTypes"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * Map from node to the highest type in the prototype chain containing the\n     * field for that node. In the case of a union, the type is the highest type\n     * of one of the types in the union.\n     "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.Property(java.lang.String)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 7)-(line 149,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.getTypes()",
      "begin_line": 153,
      "end_line": 158,
      "comment": " Returns the types on which this field is referenced. ",
      "child_ranges": [
        "(line 154,col 7)-(line 156,col 7)",
        "(line 157,col 7)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.addType(T, T, T)",
      "begin_line": 165,
      "end_line": 183,
      "comment": "\n     * Record that this property is referenced from this type.\n     * @return true if the type was recorded for this property, else false,\n     *     which would happen if the type was invalidating.\n     ",
      "child_ranges": [
        "(line 166,col 7)-(line 166,col 80)",
        "(line 167,col 7)-(line 182,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.addTypeToSkip(T)",
      "begin_line": 186,
      "end_line": 191,
      "comment": " Records the given type as one to skip for this property. ",
      "child_ranges": [
        "(line 187,col 7)-(line 190,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.expandTypesToSkip()",
      "begin_line": 194,
      "end_line": 231,
      "comment": " Invalidates any types related to invalid types. ",
      "child_ranges": [
        "(line 197,col 7)-(line 230,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.shouldRename()",
      "begin_line": 234,
      "end_line": 237,
      "comment": " Returns true if any instance of this property should be renamed. ",
      "child_ranges": [
        "(line 235,col 7)-(line 236,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.shouldRename(T)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns true if this property should be renamed on this type.\n     * expandTypesToSkip() should be called before this, if anything has been\n     * added to the typesToSkip list.\n     ",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.invalidate()",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\n     * Invalidates a field from renaming.  Used for field references on an\n     * object with unknown type.\n     ",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 38)",
        "(line 254,col 7)-(line 254,col 26)",
        "(line 255,col 7)-(line 255,col 19)",
        "(line 256,col 7)-(line 256,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.Property.scheduleRenaming(com.google.javascript.rhino.Node, T)",
      "begin_line": 268,
      "end_line": 278,
      "comment": "\n     * Schedule the node to potentially be renamed.\n     * @param node the node to rename\n     * @param type the highest type in the prototype chain for which the\n     *     property is defined\n     * @return True if type was accepted without invalidation or if the property\n     *     was already invalidated.  False if this property was invalidated this\n     *     time.\n     ",
      "child_ranges": [
        "(line 269,col 7)-(line 276,col 7)",
        "(line 277,col 7)-(line 277,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.forJSTypeSystem(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 283,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 287,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.forConcreteTypeSystem(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.TightenTypes, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 290,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 295,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.DisambiguateProperties(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.DisambiguateProperties.TypeSystem\u003cT\u003e, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.CheckLevel\u003e)",
      "begin_line": 302,
      "end_line": 312,
      "comment": "\n   * This constructor should only be called by one of the helper functions\n   * above for either the JSType system, or the concrete type system.\n   ",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 29)",
        "(line 305,col 5)-(line 305,col 33)",
        "(line 306,col 5)-(line 306,col 53)",
        "(line 307,col 5)-(line 311,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 314,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 317,col 67)",
        "(line 318,col 5)-(line 321,col 5)",
        "(line 323,col 5)-(line 323,col 74)",
        "(line 324,col 5)-(line 324,col 75)",
        "(line 325,col 5)-(line 325,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.recordInvalidationError(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 328,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 331,col 5)",
        "(line 332,col 5)-(line 334,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.addInvalidatingType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.JSError)",
      "begin_line": 340,
      "end_line": 358,
      "comment": "\n   * Invalidates the given type, so that no properties on it will be renamed.\n   ",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 47)",
        "(line 342,col 5)-(line 357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getProperty(java.lang.String)",
      "begin_line": 362,
      "end_line": 367,
      "comment": " Returns the property for the given name, creating it if necessary. ",
      "child_ranges": [
        "(line 363,col 5)-(line 365,col 5)",
        "(line 366,col 5)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getTypeWithProperty(java.lang.String, T)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Public for testing. ",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AbstractScopingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 375,
      "end_line": 402,
      "comment": " Tracks the current type system scope while traversing. "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 376,
      "end_line": 377,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 7)-(line 381,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 384,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 386,col 7)-(line 390,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 7)-(line 395,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback.getScope()",
      "begin_line": 399,
      "end_line": 401,
      "comment": " Returns the current scope at this point in the file. ",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindExternProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback"
      ],
      "begin_line": 408,
      "end_line": 430,
      "comment": "\n   * Finds all properties defined in the externs file and sets them as\n   * ineligible for renaming from the type on which they are defined.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindExternProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 409,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 411,col 7)-(line 428,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindRenameableProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.AbstractScopingCallback"
      ],
      "begin_line": 436,
      "end_line": 570,
      "comment": "\n   * Traverses the tree, building a map from field names to Nodes for all\n   * fields that can be renamed.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 437,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 439,col 7)-(line 443,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.handleGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 485,
      "comment": "\n     * Processes a GETPROP node.\n     ",
      "child_ranges": [
        "(line 450,col 7)-(line 450,col 49)",
        "(line 451,col 7)-(line 451,col 71)",
        "(line 453,col 7)-(line 453,col 40)",
        "(line 454,col 7)-(line 484,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.handleObjectLit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 490,
      "end_line": 513,
      "comment": "\n     * Processes a OBJECTLIT node.\n     ",
      "child_ranges": [
        "(line 491,col 7)-(line 491,col 37)",
        "(line 492,col 7)-(line 512,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.printErrorLocations(java.util.List\u003cjava.lang.String\u003e, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 515,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 516,col 7)-(line 518,col 7)",
        "(line 520,col 7)-(line 525,col 7)",
        "(line 527,col 7)-(line 534,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.FindRenameableProperties.processProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.DisambiguateProperties.Property, T, T)",
      "begin_line": 544,
      "end_line": 569,
      "comment": "\n     * Processes a property, adding it to the list of properties to rename.\n     * @return a representative type for the property reference, which will be\n     *   the highest type on the prototype chain of the provided type.  In the\n     *   case of a union type, it will be the highest type on the prototype\n     *   chain of one of the members of the union.\n     ",
      "child_ranges": [
        "(line 546,col 7)-(line 546,col 59)",
        "(line 547,col 7)-(line 549,col 7)",
        "(line 551,col 7)-(line 551,col 70)",
        "(line 552,col 7)-(line 568,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.renameProperties()",
      "begin_line": 573,
      "end_line": 621,
      "comment": " Renames all properties with references on more than one type. ",
      "child_ranges": [
        "(line 574,col 5)-(line 575,col 50)",
        "(line 577,col 5)-(line 577,col 45)",
        "(line 578,col 5)-(line 614,col 5)",
        "(line 615,col 5)-(line 616,col 49)",
        "(line 617,col 5)-(line 620,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.buildPropNames(com.google.javascript.jscomp.graph.UnionFind\u003cT\u003e, java.lang.String)",
      "begin_line": 627,
      "end_line": 651,
      "comment": "\n   * Chooses a name to use for renaming in each equivalence class and maps\n   * each type in that class to it.\n   ",
      "child_ranges": [
        "(line 628,col 5)-(line 628,col 45)",
        "(line 629,col 5)-(line 649,col 5)",
        "(line 650,col 5)-(line 650,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.getRenamedTypesForTesting()",
      "begin_line": 654,
      "end_line": 667,
      "comment": " Returns a map from field name to types for which it will be renamed. ",
      "child_ranges": [
        "(line 655,col 5)-(line 655,col 64)",
        "(line 656,col 5)-(line 665,col 5)",
        "(line 666,col 5)-(line 666,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeSystem",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 670,
      "end_line": 745,
      "comment": " Interface for providing the type information needed by this pass. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getRootScope()",
      "begin_line": 675,
      "end_line": 675,
      "comment": " Returns the top-most scope used by the type system (if any). ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 678,
      "end_line": 678,
      "comment": " Returns the new scope started at the given function node. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003cT\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 688,
      "end_line": 688,
      "comment": "\n     * Returns the type of the given node.\n     * @param prop Only types with this property need to be returned. In general\n     *     with type tightening, this will require no special processing, but in\n     *     the case of an unknown JSType, we might need to add in the native\n     *     types since we don\u0027t track them, but only if they have the given\n     *     property.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.isInvalidatingType(T)",
      "begin_line": 696,
      "end_line": 696,
      "comment": "\n     * Returns true if a field reference on this type will invalidate all\n     * references to that field as candidates for renaming. This is true if the\n     * type is unknown or all-inclusive, as variables with such a type could be\n     * references to any object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 702,
      "end_line": 702,
      "comment": "\n     * Informs the given type system that a type is invalidating due to a type\n     * mismatch found during type checking.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypesToSkipForType(T)",
      "begin_line": 709,
      "end_line": 709,
      "comment": "\n     * Returns a set of types that should be skipped given the given type.\n     * This is necessary for interfaces when using JSTypes, as all super\n     * interfaces must also be skipped.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.isTypeToSkip(T)",
      "begin_line": 715,
      "end_line": 715,
      "comment": "\n     * Determines whether the given type is one whose properties should not be\n     * considered for renaming.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.restrictByNotNullOrUndefined(T)",
      "begin_line": 718,
      "end_line": 718,
      "comment": " Remove null and undefined from the options in the given type. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypeAlternatives(T)",
      "begin_line": 725,
      "end_line": 725,
      "comment": "\n     * Returns the alternatives if this is a type that represents multiple\n     * types, and null if not. Union and interface types can correspond to\n     * multiple other types.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getTypeWithProperty(java.lang.String, T)",
      "begin_line": 731,
      "end_line": 731,
      "comment": "\n     * Returns the type in the chain from the given type that contains the given\n     * field or null if it is not found anywhere.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.getInstanceFromPrototype(T)",
      "begin_line": 737,
      "end_line": 737,
      "comment": "\n     * Returns the type of the instance of which this is the prototype or null\n     * if this is not a function prototype.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem.recordInterfaces(T, T, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 743,
      "end_line": 744,
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
      "begin_line": 748,
      "end_line": 959,
      "comment": " Implementation of TypeSystem using JSTypes. "
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 749,
      "end_line": 749,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 750,
      "end_line": 750,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.JSTypeSystem(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 752,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 753,col 7)-(line 753,col 44)",
        "(line 754,col 7)-(line 762,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 766,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 767,col 7)-(line 767,col 38)",
        "(line 768,col 7)-(line 768,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getRootScope()",
      "begin_line": 771,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 771,col 59)-(line 771,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 773,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 774,col 7)-(line 774,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 777,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 779,col 7)-(line 781,col 7)",
        "(line 782,col 7)-(line 782,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.isInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 785,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 786,col 7)-(line 789,col 7)",
        "(line 791,col 7)-(line 791,col 49)",
        "(line 792,col 7)-(line 792,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypesToSkipForType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 795,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 796,col 7)-(line 796,col 49)",
        "(line 797,col 7)-(line 806,col 7)",
        "(line 807,col 7)-(line 807,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypesToSkipForTypeNonUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 810,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 811,col 7)-(line 811,col 44)",
        "(line 812,col 7)-(line 812,col 29)",
        "(line 813,col 7)-(line 822,col 7)",
        "(line 823,col 7)-(line 823,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.isTypeToSkip(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 826,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 827,col 7)-(line 827,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.restrictByNotNullOrUndefined(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 830,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 831,col 7)-(line 831,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypeAlternatives(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 834,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 835,col 7)-(line 851,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getTypeWithProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 854,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 855,col 7)-(line 857,col 7)",
        "(line 859,col 7)-(line 862,col 7)",
        "(line 864,col 7)-(line 870,col 7)",
        "(line 873,col 7)-(line 875,col 7)",
        "(line 880,col 7)-(line 880,col 34)",
        "(line 881,col 7)-(line 881,col 49)",
        "(line 882,col 7)-(line 896,col 7)",
        "(line 900,col 7)-(line 909,col 7)",
        "(line 910,col 7)-(line 910,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.getInstanceFromPrototype(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 913,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 914,col 7)-(line 920,col 7)",
        "(line 921,col 7)-(line 921,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.JSTypeSystem.recordInterfaces(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 924,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 927,col 7)-(line 927,col 49)",
        "(line 928,col 7)-(line 957,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConcreteTypeSystem",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.DisambiguateProperties.TypeSystem\u003ccom.google.javascript.jscomp.ConcreteType\u003e"
      ],
      "begin_line": 962,
      "end_line": 1132,
      "comment": " Implementation of TypeSystem using concrete types. "
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextUniqueId"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "codingConvention"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nativeTypes"
      ],
      "begin_line": 970,
      "end_line": 974,
      "comment": " thus need to be added in if an unknown type is encountered."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.ConcreteTypeSystem(com.google.javascript.jscomp.TightenTypes, com.google.javascript.jscomp.CodingConvention)",
      "begin_line": 976,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 977,col 7)-(line 977,col 19)",
        "(line 978,col 7)-(line 978,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 981,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 982,col 7)-(line 982,col 38)",
        "(line 983,col 7)-(line 983,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getRootScope()",
      "begin_line": 986,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 987,col 7)-(line 987,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getFunctionScope(com.google.javascript.rhino.Node)",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 991,col 7)-(line 991,col 63)",
        "(line 992,col 7)-(line 993,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getType(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.jscomp.ConcreteType\u003e, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 996,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 999,col 7)-(line 1005,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 1013,
      "end_line": 1030,
      "comment": "\n     * Add concrete types for autoboxing types if necessary. The concrete type\n     * system does not track native types, like string, so add them if they are\n     * present in the JSType for the node.\n     ",
      "child_ranges": [
        "(line 1015,col 7)-(line 1015,col 39)",
        "(line 1016,col 7)-(line 1027,col 7)",
        "(line 1029,col 7)-(line 1029,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.maybeAddAutoboxes(com.google.javascript.jscomp.ConcreteType, com.google.javascript.rhino.jstype.JSType, java.lang.String)",
      "begin_line": 1032,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1034,col 7)-(line 1034,col 53)",
        "(line 1035,col 7)-(line 1043,col 7)",
        "(line 1045,col 7)-(line 1050,col 7)",
        "(line 1052,col 7)-(line 1052,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.isInvalidatingType(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1055,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 7)-(line 1060,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypesToSkipForType(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1063,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 7)-(line 1065,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.isTypeToSkip(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1068,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1070,col 7)-(line 1072,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.restrictByNotNullOrUndefined(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1075,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 7)-(line 1078,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypeAlternatives(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1081,
      "end_line": 1088,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 7)-(line 1087,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getTypeWithProperty(java.lang.String, com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1090,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 7)-(line 1113,col 7)",
        "(line 1114,col 7)-(line 1114,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.getInstanceFromPrototype(com.google.javascript.jscomp.ConcreteType)",
      "begin_line": 1117,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 7)-(line 1123,col 7)",
        "(line 1124,col 7)-(line 1124,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DisambiguateProperties.ConcreteTypeSystem.recordInterfaces(com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.ConcreteType, com.google.javascript.jscomp.DisambiguateProperties.Property)",
      "begin_line": 1127,
      "end_line": 1131,
      "comment": "",
      "child_ranges": []
    }
  ]
}