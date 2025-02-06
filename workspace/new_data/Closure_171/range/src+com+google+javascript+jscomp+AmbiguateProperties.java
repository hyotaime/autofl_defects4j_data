{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AmbiguateProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AmbiguateProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 76,
      "end_line": 641,
      "comment": "\n * Renames unrelated properties to the same name, using type information.\n * This allows better compression as more properties can be given short names.\n *\n * \u003cp\u003eProperties are considered unrelated if they are never referenced from the\n * same type or from a subtype of each others\u0027 types, thus this pass is only\n * effective if type checking is enabled.\n *\n * Example:\n * \u003ccode\u003e\n *   Foo.fooprop \u003d 0;\n *   Foo.fooprop2 \u003d 0;\n *   Bar.barprop \u003d 0;\n * \u003c/code\u003e\n *\n * becomes:\n *\n * \u003ccode\u003e\n *   Foo.a \u003d 0;\n *   Foo.b \u003d 0;\n *   Bar.a \u003d 0;\n * \u003c/code\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringNodesToRename"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedCharacters"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyMap"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Map from property name to Property object "
    },
    {
      "type": "field",
      "varNames": [
        "externedNames"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Property names that don\u0027t get renamed "
    },
    {
      "type": "field",
      "varNames": [
        "quotedNames"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Names to which properties shouldn\u0027t be renamed, to avoid name conflicts "
    },
    {
      "type": "field",
      "varNames": [
        "renamingMap"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Map from original property name to new name. "
    },
    {
      "type": "field",
      "varNames": [
        "FREQUENCY_COMPARATOR"
      ],
      "begin_line": 101,
      "end_line": 110,
      "comment": "\n   * Sorts Property objects by their count, breaking ties alphabetically to\n   * ensure a deterministic total ordering.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.Anonymous-1175c87c-633d-43f1-901e-0e8ba7537d82.compare(com.google.javascript.jscomp.AmbiguateProperties.Property, com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 105,col 11)-(line 107,col 11)",
        "(line 108,col 11)-(line 108,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "intForType"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " A map from JSType to a unique representative Integer. "
    },
    {
      "type": "field",
      "varNames": [
        "relatedBitsets"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n   * A map from JSType to JSTypeBitSet representing the types related\n   * to the type.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "invalidatingTypes"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " A set of types that invalidate properties from ambiguation. "
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_PREFIX"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n   * Prefix of properties to skip renaming.  These should be renamed in the\n   * RenameProperties pass.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.AmbiguateProperties(com.google.javascript.jscomp.AbstractCompiler, char[])",
      "begin_line": 130,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 74)",
        "(line 133,col 5)-(line 133,col 29)",
        "(line 134,col 5)-(line 134,col 49)",
        "(line 136,col 5)-(line 136,col 50)",
        "(line 137,col 5)-(line 151,col 52)",
        "(line 153,col 5)-(line 156,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.addInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 162,
      "end_line": 175,
      "comment": "\n   * Invalidates the given type, so that no properties on it will be renamed.\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 47)",
        "(line 164,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 170,col 32)",
        "(line 171,col 5)-(line 171,col 47)",
        "(line 172,col 5)-(line 174,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.getRenamingMap()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.getIntForType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 182,
      "end_line": 189,
      "comment": " Returns an integer that uniquely identifies a JSType. ",
      "child_ranges": [
        "(line 183,col 5)-(line 185,col 5)",
        "(line 186,col 5)-(line 186,col 39)",
        "(line 187,col 5)-(line 187,col 33)",
        "(line 188,col 5)-(line 188,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 68)",
        "(line 194,col 5)-(line 194,col 68)",
        "(line 196,col 5)-(line 197,col 71)",
        "(line 198,col 5)-(line 198,col 40)",
        "(line 199,col 5)-(line 199,col 38)",
        "(line 201,col 5)-(line 201,col 36)",
        "(line 202,col 5)-(line 202,col 36)",
        "(line 203,col 5)-(line 203,col 76)",
        "(line 204,col 5)-(line 212,col 5)",
        "(line 214,col 5)-(line 214,col 78)",
        "(line 215,col 5)-(line 216,col 77)",
        "(line 217,col 5)-(line 217,col 47)",
        "(line 219,col 5)-(line 220,col 47)",
        "(line 221,col 5)-(line 221,col 54)",
        "(line 222,col 5)-(line 224,col 5)",
        "(line 225,col 5)-(line 228,col 5)",
        "(line 231,col 5)-(line 241,col 5)",
        "(line 243,col 5)-(line 245,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.getRelatedTypesOnNonUnion(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 248,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 256,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.computeRelatedTypes(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 283,
      "end_line": 322,
      "comment": "\n   * Adds subtypes - and implementors, in the case of interfaces - of the type\n   * to its JSTypeBitSet of related types. Union types are decomposed into their\n   * alternative types.\n   *\n   * \u003cp\u003eThe \u0027is related to\u0027 relationship is best understood graphically. Draw an\n   * arrow from each instance type to the prototype of each of its\n   * subclass. Draw an arrow from each prototype to its instance type. Draw an\n   * arrow from each interface to its implementors. A type is related to another\n   * if there is a directed path in the graph from the type to other. Thus, the\n   * \u0027is related to\u0027 relationship is reflexive and transitive.\n   *\n   * \u003cp\u003eExample with Foo extends Bar which extends Baz and Bar implements I:\n   * \u003cpre\u003e\n   * Foo -\u003e Bar.prototype -\u003e Bar -\u003e Baz.prototype -\u003e Baz\n   *                          ^\n   *                          |\n   *                          I\n   * \u003c/pre\u003e\n   *\n   * \u003cp\u003eNote that we don\u0027t need to correctly handle the relationships between\n   * functions, because the function type is invalidating (i.e. its properties\n   * won\u0027t be ambiguated).\n   ",
      "child_ranges": [
        "(line 284,col 5)-(line 292,col 5)",
        "(line 294,col 5)-(line 297,col 5)",
        "(line 299,col 5)-(line 299,col 63)",
        "(line 300,col 5)-(line 300,col 38)",
        "(line 301,col 5)-(line 301,col 37)",
        "(line 304,col 5)-(line 307,col 5)",
        "(line 310,col 5)-(line 310,col 68)",
        "(line 311,col 5)-(line 315,col 5)",
        "(line 318,col 5)-(line 321,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.addRelatedInstance(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet)",
      "begin_line": 328,
      "end_line": 339,
      "comment": "\n   * Adds the instance of the given constructor, its implicit prototype and all\n   * its related types to the given bit set.\n   ",
      "child_ranges": [
        "(line 333,col 5)-(line 338,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.AdjacencyGraph\u003ccom.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void\u003e"
      ],
      "begin_line": 341,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.PropertyGraph(java.util.Collection\u003ccom.google.javascript.jscomp.AmbiguateProperties.Property\u003e)",
      "begin_line": 344,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 345,col 7)-(line 347,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.getNodes()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 352,col 7)-(line 352,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.getNode(com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 7)-(line 357,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.newSubGraph()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.clearNodeAnnotations()",
      "begin_line": 365,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 367,col 7)-(line 369,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraph.getWeight(com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 372,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 374,col 7)-(line 374,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertySubGraph",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.SubGraph\u003ccom.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void\u003e"
      ],
      "begin_line": 382,
      "end_line": 404,
      "comment": "\n   * A {@link SubGraph} that represents properties. The related types of\n   * the properties are used to efficiently calculate adjacency information.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "relatedTypes"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Types related to properties referenced in this subgraph. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertySubGraph.isIndependentOf(com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Returns true if prop is in an independent set from all properties in this\n     * sub graph.  That is, if none of its related types intersects with the\n     * related types for this sub graph.\n     ",
      "child_ranges": [
        "(line 393,col 7)-(line 393,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertySubGraph.addNode(com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 400,
      "end_line": 403,
      "comment": "\n     * Adds the node to the sub graph, adding all its related types to the\n     * related types for the sub graph.\n     ",
      "child_ranges": [
        "(line 402,col 7)-(line 402,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyGraphNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.graph.GraphNode\u003ccom.google.javascript.jscomp.AmbiguateProperties.Property, java.lang.Void\u003e"
      ],
      "begin_line": 406,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "property"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "annotation"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode.PropertyGraphNode(com.google.javascript.jscomp.AmbiguateProperties.Property)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 7)-(line 411,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode.getValue()",
      "begin_line": 414,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 416,col 7)-(line 416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode.getAnnotation()",
      "begin_line": 419,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 7)-(line 422,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.PropertyGraphNode.setAnnotation(com.google.javascript.jscomp.graph.Annotation)",
      "begin_line": 425,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 7)-(line 427,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExterns",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 432,
      "end_line": 450,
      "comment": " A traversal callback that collects externed property names. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.ProcessExterns.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 433,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 435,col 7)-(line 448,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 453,
      "end_line": 512,
      "comment": " Finds all property references, recording the types on which they occur. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.ProcessProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 456,col 7)-(line 489,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.ProcessProperties.maybeMarkCandidate(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 499,
      "end_line": 505,
      "comment": "\n     * If a property node is eligible for renaming, stashes a reference to it\n     * and increments the property name\u0027s access count.\n     *\n     * @param n The STRING node for a property\n     * @param t The traversal\n     ",
      "child_ranges": [
        "(line 500,col 7)-(line 500,col 34)",
        "(line 501,col 7)-(line 504,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.ProcessProperties.recordProperty(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 507,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 508,col 7)-(line 508,col 40)",
        "(line 509,col 7)-(line 509,col 25)",
        "(line 510,col 7)-(line 510,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.isInvalidatingType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 515,
      "end_line": 535,
      "comment": " Returns true if properties on this type should not be renamed. ",
      "child_ranges": [
        "(line 516,col 5)-(line 526,col 5)",
        "(line 527,col 5)-(line 527,col 47)",
        "(line 528,col 5)-(line 534,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.getProperty(java.lang.String)",
      "begin_line": 537,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 42)",
        "(line 539,col 5)-(line 542,col 5)",
        "(line 543,col 5)-(line 543,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.getJSType(com.google.javascript.rhino.Node)",
      "begin_line": 550,
      "end_line": 562,
      "comment": "\n   * This method gets the JSType from the Node argument and verifies that it is\n   * present.\n   ",
      "child_ranges": [
        "(line 551,col 5)-(line 551,col 34)",
        "(line 552,col 5)-(line 561,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 565,
      "end_line": 612,
      "comment": " Encapsulates the information needed for renaming a property. "
    },
    {
      "type": "field",
      "varNames": [
        "oldName"
      ],
      "begin_line": 566,
      "end_line": 566,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newName"
      ],
      "begin_line": 567,
      "end_line": 567,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numOccurrences"
      ],
      "begin_line": 568,
      "end_line": 568,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skipAmbiguating"
      ],
      "begin_line": 569,
      "end_line": 569,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "relatedTypes"
      ],
      "begin_line": 570,
      "end_line": 570,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.Property.Property(java.lang.String)",
      "begin_line": 572,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 573,col 26)",
        "(line 576,col 7)-(line 578,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.Property.addType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 582,
      "end_line": 599,
      "comment": " Add this type to this property, calculating ",
      "child_ranges": [
        "(line 583,col 7)-(line 585,col 7)",
        "(line 587,col 7)-(line 587,col 23)",
        "(line 589,col 7)-(line 597,col 7)",
        "(line 598,col 7)-(line 598,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.Property.addNonUnionType(com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 601,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 605,col 7)",
        "(line 607,col 7)-(line 610,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JSTypeBitSet",
      "is_interface": false,
      "parent_types": [
        "java.util.BitSet"
      ],
      "begin_line": 615,
      "end_line": 640,
      "comment": " A BitSet that stores type info. Adds pretty-print routines."
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 616,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet.JSTypeBitSet(int)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 619,col 7)-(line 619,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet.JSTypeBitSet()",
      "begin_line": 622,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 623,col 7)-(line 623,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AmbiguateProperties.JSTypeBitSet.toString()",
      "begin_line": 629,
      "end_line": 639,
      "comment": "\n     * Pretty-printing, for diagnostic purposes.\n     ",
      "child_ranges": [
        "(line 631,col 7)-(line 631,col 19)",
        "(line 632,col 7)-(line 632,col 22)",
        "(line 633,col 7)-(line 633,col 48)",
        "(line 634,col 7)-(line 637,col 7)",
        "(line 638,col 7)-(line 638,col 43)"
      ]
    }
  ]
}