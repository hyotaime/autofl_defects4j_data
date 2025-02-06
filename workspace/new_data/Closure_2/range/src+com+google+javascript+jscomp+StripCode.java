{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/StripCode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StripCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 44,
      "end_line": 608,
      "comment": "\n * A pass for stripping a list of provided JavaScript object types.\n *\n * The stripping strategy is as follows:\n *   - Provide: 1) a list of types that should be stripped, and 2) a list of\n *     suffixes of field/variable names that should be stripped.\n *   - Remove declarations of variables that are initialized using static\n *     methods of strip types (e.g. var x \u003d goog.debug.Logger.getLogger(...);).\n *   - Remove all references to variables that are stripped.\n *   - Remove all object literal keys with strip names.\n *   - Remove all assignments to 1) field names that are strip names and\n *     2) qualified names that begin with strip types.\n *   - Remove all statements containing calls to static methods of strip types.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " recording which field names are assigned to debug types in each JS input."
    },
    {
      "type": "field",
      "varNames": [
        "stripTypes"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripNameSuffixes"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripTypePrefixes"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripNamePrefixes"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varsToRemove"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRIP_TYPE_INHERIT_ERROR"
      ],
      "begin_line": 55,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRIP_ASSIGNMENT_ERROR"
      ],
      "begin_line": 59,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StripCode.StripCode(com.google.javascript.jscomp.AbstractCompiler, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 68,
      "end_line": 80,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The compiler\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 29)",
        "(line 75,col 5)-(line 75,col 50)",
        "(line 76,col 5)-(line 76,col 64)",
        "(line 77,col 5)-(line 77,col 64)",
        "(line 78,col 5)-(line 78,col 64)",
        "(line 79,col 5)-(line 79,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.enableTweakStripping()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n   * Enables stripping of goog.tweak functions.\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strip",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 99,
      "end_line": 607,
      "comment": "\n   * A callback that strips debug code from a JavaScript parse tree.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 101,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 139,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.removeVarDeclarationsByNameOrRvalue(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 151,
      "end_line": 170,
      "comment": "\n     * Removes declarations of any variables whose names are strip names or\n     * whose whose r-values are static method calls on strip types. Builds a set\n     * of removed variables so that all references to them can be removed.\n     *\n     * @param t The traversal\n     * @param n A VAR node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 153,col 7)-(line 164,col 7)",
        "(line 165,col 7)-(line 169,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeRemoveReferenceToRemovedVariable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 179,
      "end_line": 241,
      "comment": "\n     * Removes a reference if it is a reference to a removed variable.\n     *\n     * @param t The traversal\n     * @param n A NAME node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 181,col 7)-(line 240,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.replaceHighestNestedCallWithNull(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 274,
      "comment": "\n     * Use a while loop to get up out of any nested calls. For example,\n     * if we have just detected that we need to remove the a.b() call\n     * in a.b().c().d(), we\u0027ll have to remove all of the calls, and it\n     * will take a few iterations through this loop to get up to d().\n     ",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 29)",
        "(line 251,col 7)-(line 251,col 32)",
        "(line 252,col 7)-(line 272,col 7)",
        "(line 273,col 7)-(line 273,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeEliminateAssignmentByLvalueName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 285,
      "end_line": 305,
      "comment": "\n     * Eliminates an assignment if the l-value is:\n     *  - A field name that\u0027s a strip name\n     *  - A qualified name that begins with a strip type\n     *\n     * @param t The traversal\n     * @param n An ASSIGN node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 38)",
        "(line 291,col 7)-(line 304,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeEliminateExpressionByName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 319,
      "end_line": 334,
      "comment": "\n     * Eliminates an expression if it refers to:\n     *  - A field name that\u0027s a strip name\n     *  - A qualified name that begins with a strip type\n     * This gets rid of construct like:\n     *  a.prototype.logger; (used instead of a.prototype.logger \u003d null;)\n     * This expression is not an assignment and so will not be caught by\n     * maybeEliminateAssignmentByLvalueName.\n     * @param t The traversal\n     * @param n An EXPR_RESULT node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 323,col 7)-(line 323,col 42)",
        "(line 324,col 7)-(line 333,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeRemoveCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 344,
      "end_line": 351,
      "comment": "\n     * Removes a method call if {@link #isMethodOrCtorCallThatTriggersRemoval}\n     * indicates that it should be removed.\n     *\n     * @param t The traversal\n     * @param n A CALL node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 348,col 7)-(line 350,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.eliminateKeysWithStripNamesFromObjLit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 360,
      "end_line": 378,
      "comment": "\n     * Eliminates any object literal keys in an object literal declaration that\n     * have strip names.\n     *\n     * @param t The traversal\n     * @param n An OBJLIT node\n     ",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 35)",
        "(line 367,col 7)-(line 377,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isCallWhoseReturnValueShouldBeStripped(com.google.javascript.rhino.Node)",
      "begin_line": 393,
      "end_line": 400,
      "comment": "\n     * Gets whether a node is a CALL node whose return value should be\n     * stripped. A call\u0027s return value should be stripped if the function\n     * getting called is a static method in a class that gets stripped. For\n     * example, if \"goog.debug.Logger\" is a strip name, then this function\n     * returns true for a call such as \"goog.debug.Logger.getLogger(...)\".  It\n     * may also simply be a function that is getting stripped.  For example,\n     * if \"getLogger\" is a strip name, but not \"goog.debug.Logger\", this will\n     * still return true.\n     *\n     * @param n A node (typically a CALL node)\n     * @return Whether the call\u0027s return value should be stripped\n     ",
      "child_ranges": [
        "(line 394,col 7)-(line 399,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.qualifiedNameBeginsWithStripType(com.google.javascript.rhino.Node)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n     * Gets whether a qualified name begins with a strip name. The names\n     * \"goog.debug\", \"goog.debug.Logger\", and \"goog.debug.Logger.Level\" are\n     * examples of strip names that would result in this function returning\n     * true for a node representing the name \"goog.debug.Logger.Level\".\n     *\n     * @param n A node (typically a NAME or GETPROP node)\n     * @return Whether the name begins with a strip name\n     ",
      "child_ranges": [
        "(line 412,col 7)-(line 412,col 41)",
        "(line 413,col 7)-(line 413,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.qualifiedNameBeginsWithStripType(java.lang.String)",
      "begin_line": 425,
      "end_line": 439,
      "comment": "\n     * Gets whether a qualified name begins with a strip name. The names\n     * \"goog.debug\", \"goog.debug.Logger\", and \"goog.debug.Logger.Level\" are\n     * examples of strip names that would result in this function returning\n     * true for a node representing the name \"goog.debug.Logger.Level\".\n     *\n     * @param name A qualified class name\n     * @return Whether the name begins with a strip name\n     ",
      "child_ranges": [
        "(line 426,col 7)-(line 437,col 7)",
        "(line 438,col 7)-(line 438,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isReferenceToRemovedVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 454,
      "comment": "\n     * Determines whether a NAME node represents a reference to a variable that\n     * has been removed.\n     *\n     * @param t The traversal\n     * @param n A NAME node\n     * @return Whether the variable was removed\n     ",
      "child_ranges": [
        "(line 450,col 7)-(line 450,col 34)",
        "(line 451,col 7)-(line 451,col 33)",
        "(line 452,col 7)-(line 452,col 41)",
        "(line 453,col 7)-(line 453,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isMethodOrCtorCallThatTriggersRemoval(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 467,
      "end_line": 503,
      "comment": "\n     * Gets whether a CALL node triggers statement removal, based on the name\n     * of the object whose method is being called, or the name of the method.\n     * Checks whether the name begins with a strip type, ends with a field name\n     * that\u0027s a strip name, or belongs to the set of global class-defining\n     * functions (e.g. goog.inherits).\n     *\n     * @param t The traversal\n     * @param n A CALL node\n     * @return Whether the node triggers statement removal\n     ",
      "child_ranges": [
        "(line 477,col 7)-(line 477,col 40)",
        "(line 478,col 7)-(line 484,col 7)",
        "(line 486,col 7)-(line 496,col 7)",
        "(line 498,col 7)-(line 498,col 45)",
        "(line 499,col 7)-(line 502,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.nameEndsWithFieldNameToStrip(com.google.javascript.rhino.Node)",
      "begin_line": 513,
      "end_line": 520,
      "comment": "\n     * Gets whether a name ends with a field name that should be stripped. For\n     * example, this function would return true when passed \"this.logger\" or\n     * \"a.b.c.myLogger\" if \"logger\" is a strip name.\n     *\n     * @param n A node (typically a GETPROP node)\n     * @return Whether the name ends with a field name that should be stripped\n     ",
      "child_ranges": [
        "(line 514,col 7)-(line 518,col 7)",
        "(line 519,col 7)-(line 519,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.actsOnStripType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 532,
      "end_line": 551,
      "comment": "\n     * Determines whether the given node helps to define a\n     * strip type. For example, goog.inherits(stripType, Object)\n     * would be such a call.\n     *\n     * Also reports an error if a non-strip type inherits from a strip type.\n     *\n     * @param t The current traversal\n     * @param callNode The CALL node\n     ",
      "child_ranges": [
        "(line 533,col 7)-(line 534,col 75)",
        "(line 535,col 7)-(line 548,col 7)",
        "(line 550,col 7)-(line 550,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isStripName(java.lang.String)",
      "begin_line": 560,
      "end_line": 584,
      "comment": "\n     * Gets whether a JavaScript identifier is the name of a variable or\n     * property that should be stripped.\n     *\n     * @param name A JavaScript identifier\n     * @return Whether {@code name} is a name that triggers removal\n     ",
      "child_ranges": [
        "(line 561,col 7)-(line 564,col 7)",
        "(line 566,col 7)-(line 568,col 7)",
        "(line 570,col 7)-(line 570,col 41)",
        "(line 571,col 7)-(line 575,col 7)",
        "(line 577,col 7)-(line 581,col 7)",
        "(line 583,col 7)-(line 583,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.replaceWithNull(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Replaces a node with a NULL node. This is useful where a value is\n     * expected.\n     *\n     * @param n A node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 594,col 7)-(line 594,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.replaceWithEmpty(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Replaces a node with an EMPTY node. This is useful where a statement is\n     * expected.\n     *\n     * @param n A node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 38)"
      ]
    }
  ]
}