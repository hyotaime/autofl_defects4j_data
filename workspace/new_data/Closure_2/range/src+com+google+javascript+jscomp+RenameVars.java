{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RenameVars.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RenameVars",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 46,
      "end_line": 567,
      "comment": "\n * RenameVars renames all the variables names into short names, to reduce code\n * size and also to obfuscate the code.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalNameNodes"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " List of global NAME nodes "
    },
    {
      "type": "field",
      "varNames": [
        "localNameNodes"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " List of local NAME nodes "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoNameMap"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n   * Maps a name node to its pseudo name, null if we are not generating so\n   * there will not no overhead unless we are debugging.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "externNames"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Set of extern variable names "
    },
    {
      "type": "field",
      "varNames": [
        "reservedNames"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Set of reserved variable names "
    },
    {
      "type": "field",
      "varNames": [
        "renameMap"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The renaming map "
    },
    {
      "type": "field",
      "varNames": [
        "prevUsedRenameMap"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The previously used rename map. "
    },
    {
      "type": "field",
      "varNames": [
        "prefix"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The global name prefix "
    },
    {
      "type": "field",
      "varNames": [
        "assignmentCount"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Counter for each assignment "
    },
    {
      "type": "field",
      "varNames": [
        "assignmentLog"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Logs all name assignments "
    },
    {
      "type": "field",
      "varNames": [
        "localBleedingFunctions"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " scope on IE but not on other browsers."
    },
    {
      "type": "field",
      "varNames": [
        "localBleedingFunctionsPerScope"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Assignment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldName"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfOccurrence"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "newName"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Number of times this is referenced"
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.Assignment.Assignment(java.lang.String)",
      "begin_line": 94,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 95,col 7)-(line 95,col 26)",
        "(line 96,col 7)-(line 96,col 26)",
        "(line 97,col 7)-(line 97,col 21)",
        "(line 100,col 7)-(line 100,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Assignment.setNewName(java.lang.String)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Assigns the new name.\n     ",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 53)",
        "(line 108,col 7)-(line 108,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "assignments"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": " Maps an old name to a new name assignment "
    },
    {
      "type": "field",
      "varNames": [
        "localRenamingOnly"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Whether renaming should apply to local variables only. "
    },
    {
      "type": "field",
      "varNames": [
        "preserveFunctionExpressionNames"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n   * Whether function expression names should be preserved. Typically, for\n   * debugging purposes.\n   *\n   * @see NameAnonymousFunctions\n   "
    },
    {
      "type": "field",
      "varNames": [
        "shouldShadow"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedCharacters"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Characters that shouldn\u0027t be used in variable names. "
    },
    {
      "type": "field",
      "varNames": [
        "LOCAL_VAR_PREFIX"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " TODO(user): No longer needs to be public when shadowing doesn\u0027t use it."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.RenameVars(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean, boolean, boolean, boolean, com.google.javascript.jscomp.VariableMap, char[], java.util.Set\u003cjava.lang.String\u003e)",
      "begin_line": 136,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 29)",
        "(line 143,col 5)-(line 143,col 47)",
        "(line 144,col 5)-(line 144,col 47)",
        "(line 145,col 5)-(line 145,col 75)",
        "(line 146,col 5)-(line 150,col 5)",
        "(line 151,col 5)-(line 151,col 47)",
        "(line 152,col 5)-(line 152,col 49)",
        "(line 153,col 5)-(line 153,col 37)",
        "(line 154,col 5)-(line 158,col 5)"
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
      "begin_line": 184,
      "end_line": 292,
      "comment": "\n   * Iterate through the nodes, collect all the NAME nodes that need to be\n   * renamed, and count how many times each variable name is referenced.\n   *\n   * There are 2 passes:\n   * - externs: keep track of the global vars in the externNames_ map.\n   * - source: keep track of all name references in globalNameNodes_, and\n   *   localNameNodes_.\n   *\n   * To get shorter local variable renaming, we rename local variables to a\n   * temporary name \"LOCAL_VAR_PREFIX + index\" where index is the index of the\n   * variable declared in the local scope stack.\n   * e.g.\n   * Foo(fa, fb) {\n   *   var c \u003d function(d, e) { return fa; }\n   * }\n   * The indexes are: fa:0, fb:1, c:2, d:3, e:4\n   *\n   * In that way, local variable names are reused in each global function.\n   * e.g. the final code might look like\n   * function x(a,b) { ... }\n   * function y(a,b,c) { ... }\n   "
    },
    {
      "type": "field",
      "varNames": [
        "isExternsPass_"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.ProcessVars(boolean)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 7)-(line 189,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 192,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 36)",
        "(line 196,col 7)-(line 196,col 48)",
        "(line 197,col 7)-(line 204,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 207,
      "end_line": 208,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 210,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 212,col 7)-(line 214,col 7)",
        "(line 216,col 7)-(line 216,col 34)",
        "(line 219,col 7)-(line 221,col 7)",
        "(line 227,col 7)-(line 227,col 48)",
        "(line 228,col 7)-(line 230,col 38)",
        "(line 233,col 7)-(line 236,col 7)",
        "(line 239,col 7)-(line 243,col 7)",
        "(line 246,col 7)-(line 256,col 7)",
        "(line 258,col 7)-(line 264,col 7)",
        "(line 266,col 7)-(line 268,col 7)",
        "(line 270,col 7)-(line 280,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.ProcessVars.incCount(java.lang.String)",
      "begin_line": 284,
      "end_line": 291,
      "comment": " Increment count of an assignment",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 43)",
        "(line 286,col 7)-(line 289,col 7)",
        "(line 290,col 7)-(line 290,col 16)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "FREQUENCY_COMPARATOR"
      ],
      "begin_line": 298,
      "end_line": 309,
      "comment": "\n   * Sorts Assignment objects by their count, breaking ties by their order of\n   * occurrence in the source to ensure a deterministic total ordering.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Anonymous-340675a2-bcea-49ad-a883-200e5c26eed1.compare(com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.RenameVars.Assignment)",
      "begin_line": 300,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 302,col 7)-(line 304,col 7)",
        "(line 307,col 7)-(line 307,col 60)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ORDER_OF_OCCURRENCE_COMPARATOR"
      ],
      "begin_line": 315,
      "end_line": 321,
      "comment": "\n   * Sorts Assignment objects by the order the variable name first appears in\n   * the source.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.Anonymous-7819fd34-10a1-41e8-bbfc-5d0608c2e43d.compare(com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.RenameVars.Assignment)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 11)-(line 319,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 323,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 40)",
        "(line 328,col 5)-(line 328,col 69)",
        "(line 329,col 5)-(line 329,col 67)",
        "(line 332,col 5)-(line 332,col 38)",
        "(line 335,col 5)-(line 336,col 54)",
        "(line 337,col 5)-(line 337,col 49)",
        "(line 339,col 5)-(line 343,col 5)",
        "(line 346,col 5)-(line 348,col 5)",
        "(line 351,col 5)-(line 351,col 33)",
        "(line 353,col 5)-(line 353,col 28)",
        "(line 356,col 5)-(line 363,col 5)",
        "(line 366,col 5)-(line 366,col 18)",
        "(line 367,col 5)-(line 374,col 5)",
        "(line 376,col 5)-(line 378,col 5)",
        "(line 381,col 5)-(line 381,col 68)",
        "(line 382,col 5)-(line 382,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getNewGlobalName(com.google.javascript.rhino.Node)",
      "begin_line": 385,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 35)",
        "(line 387,col 5)-(line 387,col 44)",
        "(line 388,col 5)-(line 395,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getNewLocalName(com.google.javascript.rhino.Node)",
      "begin_line": 398,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 39)",
        "(line 400,col 5)-(line 400,col 48)",
        "(line 401,col 5)-(line 406,col 5)",
        "(line 407,col 5)-(line 407,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.recordPseudoName(com.google.javascript.rhino.Node)",
      "begin_line": 410,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 413,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap()",
      "begin_line": 421,
      "end_line": 435,
      "comment": "\n   * Runs through the assignments and reuses as many names as possible from the\n   * previously used variable map. Updates reservedNames with the set of names\n   * that were reused.\n   ",
      "child_ranges": [
        "(line 422,col 5)-(line 434,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.assignNames(java.util.Set\u003ccom.google.javascript.jscomp.RenameVars.Assignment\u003e)",
      "begin_line": 440,
      "end_line": 510,
      "comment": "\n   * Determines which new names to substitute for the original names.\n   ",
      "child_ranges": [
        "(line 441,col 5)-(line 442,col 69)",
        "(line 445,col 5)-(line 447,col 51)",
        "(line 450,col 5)-(line 450,col 70)",
        "(line 451,col 5)-(line 451,col 72)",
        "(line 453,col 5)-(line 475,col 5)",
        "(line 491,col 5)-(line 491,col 68)",
        "(line 492,col 5)-(line 509,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment, java.lang.String)",
      "begin_line": 515,
      "end_line": 523,
      "comment": "\n   * Makes a final name assignment.\n   ",
      "child_ranges": [
        "(line 516,col 5)-(line 516,col 26)",
        "(line 519,col 5)-(line 519,col 38)",
        "(line 522,col 5)-(line 522,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getVariableMap()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n   * Gets the variable map.\n   ",
      "child_ranges": [
        "(line 529,col 5)-(line 529,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.okToRenameVar(java.lang.String, boolean)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n   * Determines whether a variable name is okay to rename.\n   ",
      "child_ranges": [
        "(line 536,col 5)-(line 536,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RenameVars.getLocalVarIndex(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 544,
      "end_line": 566,
      "comment": "\n   * Returns the index within the scope stack.\n   * e.g. function Foo(a) { var b; function c(d) { } }\n   * a \u003d 0, b \u003d 1, c \u003d 2, d \u003d 3\n   ",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 22)",
        "(line 546,col 5)-(line 546,col 34)",
        "(line 547,col 5)-(line 549,col 5)",
        "(line 551,col 5)-(line 552,col 43)",
        "(line 554,col 5)-(line 564,col 5)",
        "(line 565,col 5)-(line 565,col 15)"
      ]
    }
  ]
}