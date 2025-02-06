{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MakeDeclaredNamesUnique.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MakeDeclaredNamesUnique",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 45,
      "end_line": 638,
      "comment": "\n *  Find all Functions, VARs, and Exception names and make them\n *  unique.  Specifically, it will not modify object properties.\n *  @author johnlenz@google.com (John Lenz)\n *  TODO(johnlenz): Try to merge this with the ScopeCreator.\n "
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the arguments declaration."
    },
    {
      "type": "field",
      "varNames": [
        "nameStack"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Both belong to a scope by themselves."
    },
    {
      "type": "field",
      "varNames": [
        "rootRenamer"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.MakeDeclaredNamesUnique()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.MakeDeclaredNamesUnique(com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.getContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 75,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 44)",
        "(line 78,col 5)-(line 78,col 20)",
        "(line 79,col 5)-(line 89,col 5)",
        "(line 91,col 5)-(line 94,col 5)",
        "(line 95,col 5)-(line 95,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 102,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 105,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 153,col 5)",
        "(line 155,col 5)-(line 155,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 158,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 191,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.getReplacementName(java.lang.String)",
      "begin_line": 198,
      "end_line": 206,
      "comment": "\n   * Walks the stack of name maps and finds the replacement name for the\n   * current scope.\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 205,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.findDeclaredNames(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer)",
      "begin_line": 212,
      "end_line": 229,
      "comment": "\n   * Traverses the current scope and collects declared names.  Does not\n   * decent into functions or add CATCH exceptions.\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 228,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Renamer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 234,
      "end_line": 256,
      "comment": "\n   * Declared names renaming policy interface.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer.addDeclaredName(java.lang.String)",
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * Called when a declared name is found in the local current scope.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer.getReplacementName(java.lang.String)",
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n     * @return A replacement name, null if oldName is unknown or should not\n     * be replaced.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer.stripConstIfReplaced()",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * @return Whether the constant-ness of a name should be removed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer.forChildScope()",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * @return A Renamer for a scope within the scope of the current Renamer.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ContextualRenameInverter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 261,
      "end_line": 417,
      "comment": "\n   * Inverts the transformation by {@link ContextualRenamer}, when possible.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "referencedNames"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " The set of names referenced in the current scope."
    },
    {
      "type": "field",
      "varNames": [
        "referenceStack"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": " Stack reference sets."
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " Name are globally unique initially, so we don\u0027t need a per-scope map."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.ContextualRenameInverter(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(java.lang.String)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 41)",
        "(line 285,col 7)-(line 285,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.indexOfSeparator(java.lang.String)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.containsSeparator(java.lang.String)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 299,
      "end_line": 307,
      "comment": "\n     * Prepare a set for the new scope.\n     ",
      "child_ranges": [
        "(line 301,col 7)-(line 303,col 7)",
        "(line 305,col 7)-(line 305,col 43)",
        "(line 306,col 7)-(line 306,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 313,
      "end_line": 334,
      "comment": "\n     * Rename vars for the current scope, and merge any referenced\n     * names into the parent scope reference set.\n     ",
      "child_ranges": [
        "(line 315,col 7)-(line 317,col 7)",
        "(line 319,col 7)-(line 322,col 7)",
        "(line 326,col 7)-(line 326,col 44)",
        "(line 327,col 7)-(line 327,col 45)",
        "(line 331,col 7)-(line 333,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.handleScopeVar(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 341,
      "end_line": 358,
      "comment": "\n     * For the Var declared in the current scope determine if it is possible\n     * to revert the name to its original form without conflicting with other\n     * values.\n     ",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 33)",
        "(line 343,col 7)-(line 357,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.findReplacementName(java.lang.String)",
      "begin_line": 363,
      "end_line": 372,
      "comment": "\n     * Find a name usable in the local scope.\n     ",
      "child_ranges": [
        "(line 364,col 7)-(line 364,col 45)",
        "(line 365,col 7)-(line 365,col 32)",
        "(line 366,col 7)-(line 366,col 16)",
        "(line 367,col 7)-(line 370,col 7)",
        "(line 371,col 7)-(line 371,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.isValidName(java.lang.String)",
      "begin_line": 377,
      "end_line": 384,
      "comment": "\n     * @return Whether the name is valid to use in the local scope.\n     ",
      "child_ranges": [
        "(line 378,col 7)-(line 382,col 7)",
        "(line 383,col 7)-(line 383,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 386,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 388,col 7)-(line 388,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 391,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 393,col 7)-(line 395,col 7)",
        "(line 397,col 7)-(line 406,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter.addCandidateNameReference(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 409,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 410,col 7)-(line 410,col 43)",
        "(line 411,col 7)-(line 414,col 7)",
        "(line 415,col 7)-(line 415,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ContextualRenamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer"
      ],
      "begin_line": 430,
      "end_line": 504,
      "comment": "\n   * Rename every locally name to be unique, the first encountered declaration\n   * (specifically global names) are left in their original form. Those that are\n   * renamed are made unique by giving them a unique suffix based on\n   * the number of declarations of the name.\n   *\n   * The root ContextualRenamer is assumed to be in GlobalScope.\n   *\n   * Used by the Normalize pass.\n   * @see Normalize\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nameUsage"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "global"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNIQUE_ID_SEPARATOR"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.ContextualRenamer()",
      "begin_line": 437,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 438,col 7)-(line 438,col 25)",
        "(line 439,col 7)-(line 439,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.ContextualRenamer(com.google.common.collect.Multiset\u003cjava.lang.String\u003e)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * Constructor for child scopes.\n     ",
      "child_ranges": [
        "(line 446,col 7)-(line 446,col 26)",
        "(line 447,col 7)-(line 447,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.forChildScope()",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * Create a ContextualRenamer\n     ",
      "child_ranges": [
        "(line 455,col 7)-(line 455,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.addDeclaredName(java.lang.String)",
      "begin_line": 461,
      "end_line": 478,
      "comment": "\n     * Adds a name to the map of names declared in this scope.\n     ",
      "child_ranges": [
        "(line 463,col 7)-(line 477,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.getReplacementName(java.lang.String)",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 482,col 7)-(line 482,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.getUniqueName(java.lang.String, int)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Given a name and the associated id, create a new unique name.\n     ",
      "child_ranges": [
        "(line 489,col 7)-(line 489,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.reserveName(java.lang.String)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 7)-(line 493,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.incrementNameCount(java.lang.String)",
      "begin_line": 496,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 497,col 7)-(line 497,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.stripConstIfReplaced()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 7)-(line 502,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InlineRenamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer"
      ],
      "begin_line": 515,
      "end_line": 582,
      "comment": "\n   * Rename every declared name to be unique. Typically this would be used\n   * when injecting code to insure that names do not conflict with existing\n   * names.\n   *\n   * Used by the FunctionInjector\n   * @see FunctionInjector\n   "
    },
    {
      "type": "field",
      "varNames": [
        "declarations"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "uniqueIdSupplier"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idPrefix"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeConstness"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.InlineRenamer(com.google.javascript.jscomp.CodingConvention, com.google.common.base.Supplier\u003cjava.lang.String\u003e, java.lang.String, boolean)",
      "begin_line": 522,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 527,col 7)-(line 527,col 35)",
        "(line 528,col 7)-(line 528,col 47)",
        "(line 531,col 7)-(line 531,col 55)",
        "(line 532,col 7)-(line 532,col 31)",
        "(line 533,col 7)-(line 533,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.addDeclaredName(java.lang.String)",
      "begin_line": 536,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 538,col 7)-(line 538,col 56)",
        "(line 539,col 7)-(line 541,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.getUniqueName(java.lang.String)",
      "begin_line": 544,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 545,col 7)-(line 547,col 7)",
        "(line 549,col 7)-(line 552,col 7)",
        "(line 554,col 7)-(line 559,col 7)",
        "(line 563,col 7)-(line 564,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.getReplacementName(java.lang.String)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.forChildScope()",
      "begin_line": 572,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 574,col 7)-(line 575,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer.stripConstIfReplaced()",
      "begin_line": 578,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 7)-(line 580,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoilerplateRenamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer"
      ],
      "begin_line": 588,
      "end_line": 606,
      "comment": "\n   * For injecting boilerplate libraries. Leaves global names alone\n   * and renames local names like InlineRenamer.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueIdSupplier"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "idPrefix"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer.BoilerplateRenamer(com.google.javascript.jscomp.CodingConvention, com.google.common.base.Supplier\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 593,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 597,col 7)-(line 597,col 35)",
        "(line 598,col 7)-(line 598,col 47)",
        "(line 599,col 7)-(line 599,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer.forChildScope()",
      "begin_line": 602,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "WhitelistedRenamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer"
      ],
      "begin_line": 609,
      "end_line": 636,
      "comment": " Only rename things that match the whitelist. Wraps another renamer. "
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "whitelist"
      ],
      "begin_line": 611,
      "end_line": 611,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.WhitelistedRenamer.WhitelistedRenamer(com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer, java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 31)",
        "(line 615,col 7)-(line 615,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.WhitelistedRenamer.addDeclaredName(java.lang.String)",
      "begin_line": 618,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 619,col 7)-(line 621,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.WhitelistedRenamer.getReplacementName(java.lang.String)",
      "begin_line": 624,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 625,col 7)-(line 626,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.WhitelistedRenamer.stripConstIfReplaced()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MakeDeclaredNamesUnique.WhitelistedRenamer.forChildScope()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 73)"
      ]
    }
  ]
}