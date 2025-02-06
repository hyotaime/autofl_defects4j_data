{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RenamePrototypes.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenamePrototypes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 60,
      "end_line": 456,
      "comment": "\n * RenamePrototypes renames custom properties (including methods) of custom\n * prototypes and object literals. Externed property names are never renamed.\n *\n * To ensure that a prototype property or object literal property gets renamed,\n * end it with an underscore.\n *\n * To ensure that a prototype property is not renamed, give it a leading\n * underscore.\n *\n * For custom prototype property names that lack leading and trailing\n * underscores:\n * - To always rename these, use aggressive renaming.\n * - If aggressive renaming is off, we use a heuristic to decide whether to\n *   rename (to avoid most built-in JS methods). We rename if the original name\n *   contains at least one character that is not a lowercase letter.\n *\n * When a property name is used both in a prototype definition and as an object\n * literal key, we rename it only if it satisfies both renaming policies.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aggressiveRenaming"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedCharacters"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedRenameMap"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Previously used prototype renaming map. "
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 146,
      "comment": "\n   * The Property class encapsulates the information needed for renaming\n   * a method or member.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "oldName"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newName"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prototypeCount"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "objLitCount"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "refCount"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Property.Property(java.lang.String)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 7)-(line 81,col 26)",
        "(line 82,col 7)-(line 82,col 26)",
        "(line 83,col 7)-(line 83,col 30)",
        "(line 84,col 7)-(line 84,col 27)",
        "(line 85,col 7)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Property.count()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Property.canRename()",
      "begin_line": 92,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 93,col 7)-(line 95,col 7)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 103,col 7)-(line 103,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Property.canRenamePrototypeProperty()",
      "begin_line": 106,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 110,col 7)",
        "(line 112,col 7)-(line 115,col 7)",
        "(line 117,col 7)-(line 119,col 7)",
        "(line 121,col 7)-(line 127,col 7)",
        "(line 128,col 7)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Property.canRenameObjLitProperty()",
      "begin_line": 131,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 132,col 7)-(line 135,col 7)",
        "(line 137,col 7)-(line 140,col 7)",
        "(line 144,col 7)-(line 144,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FREQUENCY_COMPARATOR"
      ],
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n   * Sorts Property objects by their count, breaking ties alphabetically to\n   * ensure a deterministic total ordering.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.Anonymous-dabb5283-9805-4988-9c62-1b6a765fd413.compare(com.google.javascript.jscomp.RenamePrototypes.Property, com.google.javascript.jscomp.RenamePrototypes.Property)",
      "begin_line": 154,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 157,col 28)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "stringNodes"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Set of String nodes to rename"
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 170,
      "end_line": 171,
      "comment": " Mapping of property names to Property objects"
    },
    {
      "type": "field",
      "varNames": [
        "reservedNames"
      ],
      "begin_line": 174,
      "end_line": 176,
      "comment": " Set of names not to rename. Externed properties/methods are added later."
    },
    {
      "type": "field",
      "varNames": [
        "prototypeObjLits"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Set of OBJLIT nodes that are assigned to prototypes"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.RenamePrototypes(com.google.javascript.jscomp.AbstractCompiler, boolean, char[], com.google.javascript.jscomp.VariableMap)",
      "begin_line": 190,
      "end_line": 197,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler\n   * @param aggressiveRenaming Whether to rename aggressively\n   * @param reservedCharacters If specified these characters won\u0027t be used in\n   *   generated names\n   * @param prevUsedRenameMap The rename map used in the previous compilation\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 29)",
        "(line 194,col 5)-(line 194,col 49)",
        "(line 195,col 5)-(line 195,col 49)",
        "(line 196,col 5)-(line 196,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 267,
      "comment": "\n   * Does property/method renaming.\n   *\n   * @param externs The root of the externs parse tree\n   * @param root The root of the main code parse tree\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 74)",
        "(line 209,col 5)-(line 210,col 60)",
        "(line 211,col 5)-(line 211,col 68)",
        "(line 214,col 5)-(line 215,col 52)",
        "(line 217,col 5)-(line 229,col 5)",
        "(line 232,col 5)-(line 234,col 5)",
        "(line 237,col 5)-(line 238,col 66)",
        "(line 239,col 5)-(line 239,col 46)",
        "(line 240,col 5)-(line 247,col 5)",
        "(line 249,col 5)-(line 249,col 65)",
        "(line 252,col 5)-(line 252,col 28)",
        "(line 253,col 5)-(line 260,col 5)",
        "(line 262,col 5)-(line 264,col 5)",
        "(line 266,col 5)-(line 266,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.reusePrototypeNames(java.util.Set\u003ccom.google.javascript.jscomp.RenamePrototypes.Property\u003e)",
      "begin_line": 275,
      "end_line": 287,
      "comment": "\n   * Runs through the list of properties and tries to rename as many as possible\n   * with names that were used for them in the previous compilation.\n   * {@code reservedNames} is updated with the set of reused names.\n   * @param properties The set of properties to attempt to rename.\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 286,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExternedProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 293,
      "end_line": 306,
      "comment": "\n   * Iterate through the nodes, collect all of the STRING nodes that are\n   * children of GETPROP or GETELEM and mark them as externs.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessExternedProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 295,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 297,col 7)-(line 304,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 315,
      "end_line": 440,
      "comment": "\n   * Iterate through the nodes, collect all of the STRING nodes that are\n   * children of GETPROP, GETELEM, or OBJLIT, and also count the number of\n   * times each STRING is referenced.\n   *\n   * Also collects OBJLIT assignments of prototypes as candidates for renaming.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 317,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 347,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.processPrototypeParent(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 355,
      "end_line": 390,
      "comment": "\n     * Processes the parent of a GETPROP prototype, which can either be\n     * another GETPROP (in the case of Foo.prototype.bar), or can be\n     * an assignment (in the case of Foo.prototype \u003d ...).\n     ",
      "child_ranges": [
        "(line 356,col 7)-(line 389,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.markPrototypePropertyCandidate(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "\n     * Remembers the given String node and increments the property name\u0027s\n     * access count.\n     *\n     * @param n A STRING node\n     * @param input The Input that the node came from\n     ",
      "child_ranges": [
        "(line 400,col 7)-(line 400,col 25)",
        "(line 401,col 7)-(line 401,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.markObjLitPropertyCandidate(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n     * Remembers the given String node and increments the property name\u0027s\n     * access count.\n     *\n     * @param n A STRING node\n     * @param input The Input that the node came from\n     ",
      "child_ranges": [
        "(line 412,col 7)-(line 412,col 25)",
        "(line 413,col 7)-(line 413,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.markPropertyAccessCandidate(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 423,
      "end_line": 426,
      "comment": "\n     * Remembers the given String node and increments the property name\u0027s\n     * access count.\n     *\n     * @param n A STRING node\n     * @param input The Input that the node came from\n     ",
      "child_ranges": [
        "(line 424,col 7)-(line 424,col 25)",
        "(line 425,col 7)-(line 425,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.ProcessProperties.getProperty(java.lang.String)",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\n     * Gets the current property for the given name, creating a new one if\n     * none exists.\n     ",
      "child_ranges": [
        "(line 433,col 7)-(line 433,col 43)",
        "(line 434,col 7)-(line 437,col 7)",
        "(line 438,col 7)-(line 438,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenamePrototypes.getPropertyMap()",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\n   * Gets the property renaming map.\n   *\n   * @return A mapping from original names to new names\n   ",
      "child_ranges": [
        "(line 448,col 5)-(line 448,col 70)",
        "(line 449,col 5)-(line 453,col 5)",
        "(line 454,col 5)-(line 454,col 40)"
      ]
    }
  ]
}