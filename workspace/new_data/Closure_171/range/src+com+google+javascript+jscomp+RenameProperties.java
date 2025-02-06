{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RenameProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 68,
      "end_line": 592,
      "comment": "\n * RenameProperties renames properties (including methods) of all JavaScript\n * objects. This includes prototypes, functions, object literals, etc.\n *\n * \u003cp\u003e If provided a VariableMap of previously used names, it tries to reuse\n * those names.\n *\n * \u003cp\u003e To prevent a property from getting renamed you may extern it (add it to\n * your externs file) or put it in quotes.\n *\n * \u003cp\u003e To avoid run-time JavaScript errors, use quotes when accessing properties\n * that are defined using quotes.\n *\n * \u003cpre\u003e\n *   var a \u003d {\u0027myprop\u0027: 0}, b \u003d a[\u0027myprop\u0027];  // correct\n *   var x \u003d {\u0027myprop\u0027: 0}, y \u003d x.myprop;     // incorrect\n * \u003c/pre\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedPropertyMap"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Property renaming map from a previous compilation. "
    },
    {
      "type": "field",
      "varNames": [
        "stringNodesToRename"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callNodeToParentMap"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedCharacters"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "propertyMap"
      ],
      "begin_line": 82,
      "end_line": 83,
      "comment": " Map from property name to Property object"
    },
    {
      "type": "field",
      "varNames": [
        "affinityGraph"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n   * A graph of property affinity information.\n   *\n   * Suppose property X and Y are access in the same function N times.\n   *\n   * The graph would have X -\u003e Y with the edge of N.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "externedNames"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": " Property names that don\u0027t get renamed"
    },
    {
      "type": "field",
      "varNames": [
        "quotedNames"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Names to which properties shouldn\u0027t be renamed, to avoid name conflicts"
    },
    {
      "type": "field",
      "varNames": [
        "FREQUENCY_COMPARATOR"
      ],
      "begin_line": 101,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.Anonymous-18c01d12-8e22-4356-ad68-eb194cc493df.compare(com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.Property)",
      "begin_line": 103,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 120,col 9)",
        "(line 125,col 9)-(line 125,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "RENAME_PROPERTY_FUNCTION_NAME"
      ],
      "begin_line": 137,
      "end_line": 138,
      "comment": "\n   * The name of a special function that this pass replaces. It takes one\n   * argument: a string literal containing one or more dot-separated JS\n   * identifiers. This pass will replace them as though they were JS property\n   * references. Here are two examples:\n   *    JSCompiler_renameProperty(\u0027propertyName\u0027) -\u003e \u0027jYq\u0027\n   *    JSCompiler_renameProperty(\u0027myProp.nestedProp.innerProp\u0027) -\u003e \u0027e4.sW.C$\u0027\n   "
    },
    {
      "type": "field",
      "varNames": [
        "BAD_CALL"
      ],
      "begin_line": 140,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BAD_ARG"
      ],
      "begin_line": 145,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameProperties.RenameProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler\n   * @param affinity Optimize for affinity information.\n   * @param generatePseudoNames Generate pseudo names. e.g foo -\u003e $foo$ instead\n   *        of compact obfuscated names. This is used for debugging.\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameProperties.RenameProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean, com.google.javascript.jscomp.VariableMap)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler.\n   * @param affinity Optimize for affinity information.\n   * @param generatePseudoNames Generate pseudo names. e.g foo -\u003e $foo$ instead\n   *        of compact obfuscated names. This is used for debugging.\n   * @param prevUsedPropertyMap The property renaming map used in a previous\n   *        compilation.\n   ",
      "child_ranges": [
        "(line 175,col 5)-(line 175,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameProperties.RenameProperties(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean, com.google.javascript.jscomp.VariableMap, char[])",
      "begin_line": 190,
      "end_line": 204,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The JSCompiler.\n   * @param affinity Optimize for affinity information.\n   * @param generatePseudoNames Generate pseudo names. e.g foo -\u003e $foo$ instead\n   *        of compact obfuscated names. This is used for debugging.\n   * @param prevUsedPropertyMap The property renaming map used in a previous\n   *        compilation.\n   * @param reservedCharacters If specified these characters won\u0027t be used in\n   *   generated names\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 29)",
        "(line 196,col 5)-(line 196,col 51)",
        "(line 197,col 5)-(line 197,col 51)",
        "(line 198,col 5)-(line 198,col 49)",
        "(line 199,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 74)",
        "(line 210,col 5)-(line 210,col 68)",
        "(line 211,col 5)-(line 211,col 68)",
        "(line 213,col 5)-(line 214,col 71)",
        "(line 215,col 5)-(line 215,col 40)",
        "(line 216,col 5)-(line 216,col 38)",
        "(line 220,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 224,col 55)",
        "(line 225,col 5)-(line 227,col 5)",
        "(line 230,col 5)-(line 230,col 76)",
        "(line 231,col 5)-(line 231,col 45)",
        "(line 232,col 5)-(line 232,col 46)",
        "(line 235,col 5)-(line 235,col 28)",
        "(line 236,col 5)-(line 244,col 5)",
        "(line 247,col 5)-(line 267,col 5)",
        "(line 269,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 273,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.reusePropertyNames(java.util.Set\u003cjava.lang.String\u003e, java.util.Collection\u003ccom.google.javascript.jscomp.RenameProperties.Property\u003e)",
      "begin_line": 283,
      "end_line": 299,
      "comment": "\n   * Runs through the list of properties and renames as many as possible with\n   * names from the previous compilation. Also, updates reservedNames with the\n   * set of reused names.\n   * @param reservedNames Reserved names to use during renaming.\n   * @param allProps Properties to rename.\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 298,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.computeAffinityScores()",
      "begin_line": 311,
      "end_line": 327,
      "comment": "\n   * A X property gets an affinity score:\n   *\n   * score \u003d sum (# of times X appears Y * frequency(Y)) for all Y where\n   *   frequency(Y) \u003e frequency (X).\n   *\n   * This way a property would have a name closer to all high frequency names.\n   * Also two property of the same frequency would have very close names if\n   * they always appear together.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 326,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.generateNames(java.util.Set\u003ccom.google.javascript.jscomp.RenameProperties.Property\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 336,
      "end_line": 351,
      "comment": "\n   * Generates new names for properties.\n   *\n   * @param props Properties to generate new names for\n   * @param reservedNames A set of names to which properties should not be\n   *     renamed\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 338,col 47)",
        "(line 339,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.getPropertyMap()",
      "begin_line": 358,
      "end_line": 366,
      "comment": "\n   * Gets the property renaming map (the \"answer key\").\n   *\n   * @return A mapping from original names to new names\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 70)",
        "(line 360,col 5)-(line 364,col 5)",
        "(line 365,col 5)-(line 365,col 40)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessExterns",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 373,
      "end_line": 393,
      "comment": "\n   * A traversal callback that collects externed property names.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessExterns.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 375,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 391,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 402,
      "end_line": 562,
      "comment": "\n   * A traversal callback that collects property names and counts how\n   * frequently each property name occurs.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "currentHighAffinityProperties"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 407,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 409,col 7)-(line 471,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.maybeMarkCandidate(com.google.javascript.rhino.Node)",
      "begin_line": 480,
      "end_line": 486,
      "comment": "\n     * If a property node is eligible for renaming, stashes a reference to it\n     * and increments the property name\u0027s access count.\n     *\n     * @param n The STRING node for a property\n     ",
      "child_ranges": [
        "(line 481,col 7)-(line 481,col 34)",
        "(line 482,col 7)-(line 485,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.countCallCandidates(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 495,
      "end_line": 511,
      "comment": "\n     * Counts references to property names that occur in a special function\n     * call.\n     *\n     * @param callNode The CALL node for a property\n     * @param t The traversal\n     ",
      "child_ranges": [
        "(line 496,col 7)-(line 496,col 57)",
        "(line 497,col 7)-(line 500,col 7)",
        "(line 502,col 7)-(line 510,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.countPropertyOccurrence(java.lang.String)",
      "begin_line": 518,
      "end_line": 531,
      "comment": "\n     * Increments the occurrence count for a property name.\n     *\n     * @param name The property name\n     ",
      "child_ranges": [
        "(line 519,col 7)-(line 519,col 44)",
        "(line 520,col 7)-(line 526,col 7)",
        "(line 527,col 7)-(line 527,col 28)",
        "(line 528,col 7)-(line 530,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 533,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 537,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.ProcessProperties.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 540,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 542,col 7)-(line 544,col 7)",
        "(line 545,col 7)-(line 560,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Property",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 569,
      "end_line": 578,
      "comment": "\n   * Encapsulates the information needed for renaming a property.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "oldName"
      ],
      "begin_line": 570,
      "end_line": 570,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newName"
      ],
      "begin_line": 571,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numOccurrences"
      ],
      "begin_line": 572,
      "end_line": 572,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "affinityScore"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameProperties.Property.Property(java.lang.String)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 576,col 7)-(line 576,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PropertyAffinity",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 580,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "affinity"
      ],
      "begin_line": 582,
      "end_line": 582,
      "comment": " This will forever be zero if no affinity information was gathered."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameProperties.PropertyAffinity.PropertyAffinity(int)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 7)-(line 585,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameProperties.PropertyAffinity.increase()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 7)-(line 589,col 17)"
      ]
    }
  ]
}