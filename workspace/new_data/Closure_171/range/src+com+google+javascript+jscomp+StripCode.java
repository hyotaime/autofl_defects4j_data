{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/StripCode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StripCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 45,
      "end_line": 608,
      "comment": "\n * A pass for stripping a list of provided JavaScript object types.\n *\n * The stripping strategy is as follows:\n *   - Provide: 1) a list of types that should be stripped, and 2) a list of\n *     suffixes of field/variable names that should be stripped.\n *   - Remove declarations of variables that are initialized using static\n *     methods of strip types (e.g. var x \u003d goog.debug.Logger.getLogger(...);).\n *   - Remove all references to variables that are stripped.\n *   - Remove all object literal keys with strip names.\n *   - Remove all assignments to 1) field names that are strip names and\n *     2) qualified names that begin with strip types.\n *   - Remove all statements containing calls to static methods of strip types.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " recording which field names are assigned to debug types in each JS input."
    },
    {
      "type": "field",
      "varNames": [
        "stripTypes"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripNameSuffixes"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripTypePrefixes"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stripNamePrefixes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varsToRemove"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRIP_TYPE_INHERIT_ERROR"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRIP_ASSIGNMENT_ERROR"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StripCode.StripCode(com.google.javascript.jscomp.AbstractCompiler, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 69,
      "end_line": 81,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The compiler\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 29)",
        "(line 76,col 5)-(line 76,col 50)",
        "(line 77,col 5)-(line 77,col 64)",
        "(line 78,col 5)-(line 78,col 64)",
        "(line 79,col 5)-(line 79,col 64)",
        "(line 80,col 5)-(line 80,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.enableTweakStripping()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n   * Enables stripping of goog.tweak functions.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Strip",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 100,
      "end_line": 607,
      "comment": "\n   * A callback that strips debug code from a JavaScript parse tree.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 104,col 7)-(line 140,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.removeVarDeclarationsByNameOrRvalue(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 171,
      "comment": "\n     * Removes declarations of any variables whose names are strip names or\n     * whose whose r-values are static method calls on strip types. Builds a set\n     * of removed variables so that all references to them can be removed.\n     *\n     * @param t The traversal\n     * @param n A VAR node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 154,col 7)-(line 165,col 7)",
        "(line 166,col 7)-(line 170,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeRemoveReferenceToRemovedVariable(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 180,
      "end_line": 242,
      "comment": "\n     * Removes a reference if it is a reference to a removed variable.\n     *\n     * @param t The traversal\n     * @param n A NAME node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 182,col 7)-(line 241,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.replaceHighestNestedCallWithNull(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 250,
      "end_line": 279,
      "comment": "\n     * Use a while loop to get up out of any nested calls. For example,\n     * if we have just detected that we need to remove the a.b() call\n     * in a.b().c().d(), we\u0027ll have to remove all of the calls, and it\n     * will take a few iterations through this loop to get up to d().\n     ",
      "child_ranges": [
        "(line 251,col 7)-(line 251,col 29)",
        "(line 252,col 7)-(line 252,col 32)",
        "(line 253,col 7)-(line 277,col 7)",
        "(line 278,col 7)-(line 278,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeEliminateAssignmentByLvalueName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 290,
      "end_line": 310,
      "comment": "\n     * Eliminates an assignment if the l-value is:\n     *  - A field name that\u0027s a strip name\n     *  - A qualified name that begins with a strip type\n     *\n     * @param t The traversal\n     * @param n An ASSIGN node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 295,col 7)-(line 295,col 38)",
        "(line 296,col 7)-(line 309,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeEliminateExpressionByName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 324,
      "end_line": 339,
      "comment": "\n     * Eliminates an expression if it refers to:\n     *  - A field name that\u0027s a strip name\n     *  - A qualified name that begins with a strip type\n     * This gets rid of construct like:\n     *  a.prototype.logger; (used instead of a.prototype.logger \u003d null;)\n     * This expression is not an assignment and so will not be caught by\n     * maybeEliminateAssignmentByLvalueName.\n     * @param t The traversal\n     * @param n An EXPR_RESULT node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 328,col 7)-(line 328,col 42)",
        "(line 329,col 7)-(line 338,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.maybeRemoveCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * Removes a method call if {@link #isMethodOrCtorCallThatTriggersRemoval}\n     * indicates that it should be removed.\n     *\n     * @param t The traversal\n     * @param n A CALL node\n     * @param parent {@code n}\u0027s parent\n     ",
      "child_ranges": [
        "(line 353,col 7)-(line 355,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.eliminateKeysWithStripNamesFromObjLit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 365,
      "end_line": 382,
      "comment": "\n     * Eliminates any object literal keys in an object literal declaration that\n     * have strip names.\n     *\n     * @param t The traversal\n     * @param n An OBJLIT node\n     ",
      "child_ranges": [
        "(line 371,col 7)-(line 371,col 35)",
        "(line 372,col 7)-(line 381,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isCallWhoseReturnValueShouldBeStripped(com.google.javascript.rhino.Node)",
      "begin_line": 397,
      "end_line": 404,
      "comment": "\n     * Gets whether a node is a CALL node whose return value should be\n     * stripped. A call\u0027s return value should be stripped if the function\n     * getting called is a static method in a class that gets stripped. For\n     * example, if \"goog.debug.Logger\" is a strip name, then this function\n     * returns true for a call such as \"goog.debug.Logger.getLogger(...)\".  It\n     * may also simply be a function that is getting stripped.  For example,\n     * if \"getLogger\" is a strip name, but not \"goog.debug.Logger\", this will\n     * still return true.\n     *\n     * @param n A node (typically a CALL node)\n     * @return Whether the call\u0027s return value should be stripped\n     ",
      "child_ranges": [
        "(line 398,col 7)-(line 403,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.qualifiedNameBeginsWithStripType(com.google.javascript.rhino.Node)",
      "begin_line": 415,
      "end_line": 418,
      "comment": "\n     * Gets whether a qualified name begins with a strip name. The names\n     * \"goog.debug\", \"goog.debug.Logger\", and \"goog.debug.Logger.Level\" are\n     * examples of strip names that would result in this function returning\n     * true for a node representing the name \"goog.debug.Logger.Level\".\n     *\n     * @param n A node (typically a NAME or GETPROP node)\n     * @return Whether the name begins with a strip name\n     ",
      "child_ranges": [
        "(line 416,col 7)-(line 416,col 41)",
        "(line 417,col 7)-(line 417,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.qualifiedNameBeginsWithStripType(java.lang.String)",
      "begin_line": 429,
      "end_line": 443,
      "comment": "\n     * Gets whether a qualified name begins with a strip name. The names\n     * \"goog.debug\", \"goog.debug.Logger\", and \"goog.debug.Logger.Level\" are\n     * examples of strip names that would result in this function returning\n     * true for a node representing the name \"goog.debug.Logger.Level\".\n     *\n     * @param name A qualified class name\n     * @return Whether the name begins with a strip name\n     ",
      "child_ranges": [
        "(line 430,col 7)-(line 441,col 7)",
        "(line 442,col 7)-(line 442,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isReferenceToRemovedVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 453,
      "end_line": 458,
      "comment": "\n     * Determines whether a NAME node represents a reference to a variable that\n     * has been removed.\n     *\n     * @param t The traversal\n     * @param n A NAME node\n     * @return Whether the variable was removed\n     ",
      "child_ranges": [
        "(line 454,col 7)-(line 454,col 34)",
        "(line 455,col 7)-(line 455,col 33)",
        "(line 456,col 7)-(line 456,col 41)",
        "(line 457,col 7)-(line 457,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.isMethodOrCtorCallThatTriggersRemoval(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 471,
      "end_line": 507,
      "comment": "\n     * Gets whether a CALL node triggers statement removal, based on the name\n     * of the object whose method is being called, or the name of the method.\n     * Checks whether the name begins with a strip type, includes a field name\n     * that\u0027s a strip name, or belongs to the set of global class-defining\n     * functions (e.g. goog.inherits).\n     *\n     * @param t The traversal\n     * @param n A CALL node\n     * @return Whether the node triggers statement removal\n     ",
      "child_ranges": [
        "(line 481,col 7)-(line 481,col 40)",
        "(line 482,col 7)-(line 488,col 7)",
        "(line 490,col 7)-(line 500,col 7)",
        "(line 502,col 7)-(line 502,col 45)",
        "(line 503,col 7)-(line 506,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StripCode.Strip.nameIncludesFieldNameToStrip(com.google.javascript.rhino.Node)",
      "begin_line": 513,
      "end_line": 520,
      "comment": "\n     * @return Whether a name includes a field name that should be stripped.\n     * E.g., \"foo.stripMe.bar\", \"(foo.bar).stripMe\", etc.\n     ",
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