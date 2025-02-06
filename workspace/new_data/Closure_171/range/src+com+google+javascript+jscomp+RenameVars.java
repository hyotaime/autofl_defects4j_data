{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RenameVars.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 595,
      "comment": "\n * RenameVars renames all the variables names into short names, to reduce code\n * size and also to obfuscate the code.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalNameNodes"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " List of global NAME nodes "
    },
    {
      "type": "field",
      "varNames": [
        "localNameNodes"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " List of local NAME nodes "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoNameMap"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n   * Maps a name node to its pseudo name, null if we are not generating so\n   * there will be no overhead unless we are debugging.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "externNames"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Set of extern variable names "
    },
    {
      "type": "field",
      "varNames": [
        "reservedNames"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Set of reserved variable names "
    },
    {
      "type": "field",
      "varNames": [
        "renameMap"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedRenameMap"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The previously used rename map. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The global name prefix "
    },
    {
      "type": "field",
      "varNames": [
        "assignmentCount"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Counter for each assignment "
    },
    {
      "type": "field",
      "varNames": [
        "assignmentLog"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Logs all name assignments "
    },
    {
      "type": "field",
      "varNames": [
        "localBleedingFunctions"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " scope on IE but not on other browsers."
    },
    {
      "type": "field",
      "varNames": [
        "localBleedingFunctionsPerScope"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Assignment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 89,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldName"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfOccurrence"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newName"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Number of times this is referenced"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.Assignment.Assignment(java.lang.String)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 96,col 7)-(line 96,col 26)",
        "(line 97,col 7)-(line 97,col 26)",
        "(line 98,col 7)-(line 98,col 21)",
        "(line 101,col 7)-(line 101,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Assignment.setNewName(java.lang.String)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * Assigns the new name.\n     ",
      "child_ranges": [
        "(line 108,col 7)-(line 108,col 53)",
        "(line 109,col 7)-(line 109,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "assignments"
      ],
      "begin_line": 114,
      "end_line": 115,
      "comment": " Maps an old name to a new name assignment "
    },
    {
      "type": "field",
      "varNames": [
        "localRenamingOnly"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Whether renaming should apply to local variables only. "
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n   * Whether function expression names should be preserved. Typically, for\n   * debugging purposes.\n   *\n   * @see NameAnonymousFunctions\n   "
    },
    {
      "type": "field",
      "varNames": [
        "shouldShadow"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedCharacters"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Characters that shouldn\u0027t be used in variable names. "
    },
    {
      "type": "field",
      "varNames": [
        "LOCAL_VAR_PREFIX"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " TODO(user): No longer needs to be public when shadowing doesn\u0027t use it."
    },
    {
      "type": "field",
      "varNames": [
        "nameGeneratorGiven"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " easier."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.RenameVars(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean, boolean, boolean, boolean, com.google.javascript.jscomp.VariableMap, char[], java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 140,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 148,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.RenameVars(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean, boolean, boolean, boolean, com.google.javascript.jscomp.VariableMap, char[], java.util.Set\u003cjava.lang.String\u003e, com.google.javascript.jscomp.NameGenerator)",
      "begin_line": 151,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 29)",
        "(line 159,col 5)-(line 159,col 47)",
        "(line 160,col 5)-(line 160,col 47)",
        "(line 161,col 5)-(line 161,col 75)",
        "(line 162,col 5)-(line 166,col 5)",
        "(line 167,col 5)-(line 167,col 47)",
        "(line 168,col 5)-(line 168,col 49)",
        "(line 169,col 5)-(line 169,col 37)",
        "(line 170,col 5)-(line 174,col 5)",
        "(line 175,col 5)-(line 175,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 201,
      "end_line": 310,
      "comment": "\n   * Iterate through the nodes, collect all the NAME nodes that need to be\n   * renamed, and count how many times each variable name is referenced.\n   *\n   * There are 2 passes:\n   * - externs: keep track of the global vars in the externNames_ map.\n   * - source: keep track of all name references in globalNameNodes_, and\n   *   localNameNodes_.\n   *\n   * To get shorter local variable renaming, we rename local variables to a\n   * temporary name \"LOCAL_VAR_PREFIX + index\" where index is the index of the\n   * variable declared in the local scope stack.\n   * e.g.\n   * Foo(fa, fb) {\n   *   var c \u003d function(d, e) { return fa; }\n   * }\n   * The indexes are: fa:0, fb:1, c:2, d:3, e:4\n   *\n   * In that way, local variable names are reused in each global function.\n   * e.g. the final code might look like\n   * function x(a,b) { ... }\n   * function y(a,b,c) { ... }\n   "
    },
    {
      "type": "field",
      "varNames": [
        "isExternsPass_"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.ProcessVars(boolean)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 7)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 209,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 211,col 7)-(line 213,col 7)",
        "(line 214,col 7)-(line 214,col 48)",
        "(line 215,col 7)-(line 222,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 225,
      "end_line": 226,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 228,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 232,col 7)",
        "(line 234,col 7)-(line 234,col 34)",
        "(line 237,col 7)-(line 239,col 7)",
        "(line 245,col 7)-(line 245,col 48)",
        "(line 246,col 7)-(line 248,col 38)",
        "(line 251,col 7)-(line 254,col 7)",
        "(line 257,col 7)-(line 261,col 7)",
        "(line 264,col 7)-(line 274,col 7)",
        "(line 276,col 7)-(line 282,col 7)",
        "(line 284,col 7)-(line 286,col 7)",
        "(line 288,col 7)-(line 298,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.incCount(java.lang.String)",
      "begin_line": 302,
      "end_line": 309,
      "comment": " Increment count of an assignment",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 43)",
        "(line 304,col 7)-(line 307,col 7)",
        "(line 308,col 7)-(line 308,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FREQUENCY_COMPARATOR"
      ],
      "begin_line": 316,
      "end_line": 327,
      "comment": "\n   * Sorts Assignment objects by their count, breaking ties by their order of\n   * occurrence in the source to ensure a deterministic total ordering.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Anonymous-d545c76f-1991-4ae5-a207-cfc39bf26480.compare(com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.RenameVars.Assignment)",
      "begin_line": 318,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 322,col 7)",
        "(line 325,col 7)-(line 325,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ORDER_OF_OCCURRENCE_COMPARATOR"
      ],
      "begin_line": 333,
      "end_line": 339,
      "comment": "\n   * Sorts Assignment objects by the order the variable name first appears in\n   * the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Anonymous-93a5387a-cf69-4327-a667-7ec4c143a827.compare(com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.RenameVars.Assignment)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 11)-(line 337,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 341,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 40)",
        "(line 346,col 5)-(line 346,col 69)",
        "(line 347,col 5)-(line 347,col 67)",
        "(line 350,col 5)-(line 350,col 38)",
        "(line 353,col 5)-(line 354,col 54)",
        "(line 355,col 5)-(line 355,col 49)",
        "(line 357,col 5)-(line 361,col 5)",
        "(line 364,col 5)-(line 366,col 5)",
        "(line 369,col 5)-(line 369,col 33)",
        "(line 371,col 5)-(line 371,col 28)",
        "(line 374,col 5)-(line 381,col 5)",
        "(line 384,col 5)-(line 390,col 5)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 397,col 5)-(line 397,col 68)",
        "(line 398,col 5)-(line 398,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getNewGlobalName(com.google.javascript.rhino.Node)",
      "begin_line": 401,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 35)",
        "(line 403,col 5)-(line 403,col 44)",
        "(line 404,col 5)-(line 411,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getNewLocalName(com.google.javascript.rhino.Node)",
      "begin_line": 414,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 39)",
        "(line 416,col 5)-(line 416,col 48)",
        "(line 417,col 5)-(line 422,col 5)",
        "(line 423,col 5)-(line 423,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.recordPseudoName(com.google.javascript.rhino.Node)",
      "begin_line": 426,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 429,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap()",
      "begin_line": 437,
      "end_line": 455,
      "comment": "\n   * Runs through the assignments and reuses as many names as possible from the\n   * previously used variable map. Updates reservedNames with the set of names\n   * that were reused.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 441,col 80)",
        "(line 442,col 5)-(line 454,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.assignNames(java.util.SortedSet\u003ccom.google.javascript.jscomp.RenameVars.Assignment\u003e)",
      "begin_line": 460,
      "end_line": 538,
      "comment": "\n   * Determines which new names to substitute for the original names.\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 45)",
        "(line 462,col 5)-(line 462,col 44)",
        "(line 464,col 5)-(line 475,col 5)",
        "(line 478,col 5)-(line 478,col 70)",
        "(line 479,col 5)-(line 479,col 72)",
        "(line 481,col 5)-(line 503,col 5)",
        "(line 519,col 5)-(line 519,col 68)",
        "(line 520,col 5)-(line 537,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment, java.lang.String)",
      "begin_line": 543,
      "end_line": 551,
      "comment": "\n   * Makes a final name assignment.\n   ",
      "child_ranges": [
        "(line 544,col 5)-(line 544,col 26)",
        "(line 547,col 5)-(line 547,col 38)",
        "(line 550,col 5)-(line 550,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getVariableMap()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n   * Gets the variable map.\n   ",
      "child_ranges": [
        "(line 557,col 5)-(line 557,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.okToRenameVar(java.lang.String, boolean)",
      "begin_line": 563,
      "end_line": 565,
      "comment": "\n   * Determines whether a variable name is okay to rename.\n   ",
      "child_ranges": [
        "(line 564,col 5)-(line 564,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getLocalVarIndex(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 572,
      "end_line": 594,
      "comment": "\n   * Returns the index within the scope stack.\n   * e.g. function Foo(a) { var b; function c(d) { } }\n   * a \u003d 0, b \u003d 1, c \u003d 2, d \u003d 3\n   ",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 22)",
        "(line 574,col 5)-(line 574,col 34)",
        "(line 575,col 5)-(line 577,col 5)",
        "(line 579,col 5)-(line 580,col 43)",
        "(line 582,col 5)-(line 592,col 5)",
        "(line 593,col 5)-(line 593,col 15)"
      ]
    }
  ]
}