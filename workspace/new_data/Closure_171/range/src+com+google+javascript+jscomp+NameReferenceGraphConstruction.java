{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/NameReferenceGraphConstruction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameReferenceGraphConstruction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 45,
      "end_line": 628,
      "comment": "\n * Constructs a name reference graph.\n *\n * @see NameReferenceGraph\n *\n "
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
        "graph"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unknownNameUse"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " to resort to this map."
    },
    {
      "type": "field",
      "varNames": [
        "CONSERVATIVE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Should we continue even if we found a type checker bug."
    },
    {
      "type": "field",
      "varNames": [
        "currentFunctionStack"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " bar(), we connect foo -\u003e bar."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.NameReferenceGraphConstruction(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 29)",
        "(line 68,col 5)-(line 68,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.getNameReferenceGraph()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 64)",
        "(line 81,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 88,col 43)",
        "(line 89,col 5)-(line 90,col 44)",
        "(line 91,col 5)-(line 91,col 44)",
        "(line 92,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 102,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExtern"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.Traversal(boolean)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 31)",
        "(line 108,col 7)-(line 108,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 111,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 35)",
        "(line 114,col 7)-(line 114,col 37)",
        "(line 118,col 7)-(line 147,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 154,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 234,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.containsName(com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 240,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.safeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 249,
      "end_line": 274,
      "comment": "\n     * Given a node, this alias all the names in the node that need aliasing.\n     * This is safer than just calling getQualifiedName() because it can return\n     * null it several situations.\n     * @param n node to alias\n     ",
      "child_ranges": [
        "(line 250,col 7)-(line 257,col 7)",
        "(line 259,col 7)-(line 273,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.maybeAliasNamesOnAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 276,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 277,col 7)-(line 283,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.defineAndAlias(java.lang.String)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.maybeRecordExport(com.google.javascript.rhino.Node)",
      "begin_line": 290,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 291,col 7)-(line 291,col 49)",
        "(line 292,col 7)-(line 292,col 42)",
        "(line 293,col 7)-(line 295,col 7)",
        "(line 297,col 7)-(line 297,col 52)",
        "(line 299,col 7)-(line 301,col 7)",
        "(line 305,col 7)-(line 308,col 7)",
        "(line 310,col 7)-(line 312,col 7)",
        "(line 314,col 7)-(line 314,col 38)",
        "(line 315,col 7)-(line 317,col 7)",
        "(line 319,col 7)-(line 319,col 34)",
        "(line 320,col 7)-(line 320,col 44)",
        "(line 322,col 7)-(line 324,col 7)",
        "(line 326,col 7)-(line 326,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isLocalNameReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 332,
      "end_line": 340,
      "comment": "\n     * @return true if n MUST be a local name reference.\n     ",
      "child_ranges": [
        "(line 335,col 7)-(line 338,col 7)",
        "(line 339,col 7)-(line 339,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isStaticNameReference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 345,
      "end_line": 356,
      "comment": "\n     * @return true if n MUST be a static name reference.\n     ",
      "child_ranges": [
        "(line 346,col 7)-(line 346,col 63)",
        "(line 347,col 7)-(line 349,col 7)",
        "(line 350,col 7)-(line 350,col 42)",
        "(line 351,col 7)-(line 353,col 7)",
        "(line 355,col 7)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isPrototypeNameReference(com.google.javascript.rhino.Node)",
      "begin_line": 361,
      "end_line": 370,
      "comment": "\n     * @return true if n MUST be a prototype name reference.\n     ",
      "child_ranges": [
        "(line 362,col 7)-(line 364,col 7)",
        "(line 365,col 7)-(line 365,col 47)",
        "(line 366,col 7)-(line 368,col 7)",
        "(line 369,col 7)-(line 369,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordStaticNameDefinition(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 372,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 374,col 7)-(line 378,col 7)",
        "(line 379,col 7)-(line 392,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordPrototypePropDefinition(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node)",
      "begin_line": 399,
      "end_line": 429,
      "comment": "\n     * @param assign The assignment node, null if it is just a \"forward\"\n     *     declaration for recording the rValue\u0027s type.\n     ",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 74)",
        "(line 402,col 7)-(line 402,col 36)",
        "(line 403,col 7)-(line 403,col 30)",
        "(line 405,col 7)-(line 414,col 7)",
        "(line 416,col 7)-(line 417,col 44)",
        "(line 419,col 7)-(line 420,col 51)",
        "(line 421,col 7)-(line 421,col 75)",
        "(line 422,col 7)-(line 423,col 65)",
        "(line 424,col 7)-(line 426,col 7)",
        "(line 427,col 7)-(line 427,col 34)",
        "(line 428,col 7)-(line 428,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordStaticNameUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 431,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 433,col 7)-(line 442,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordPrototypePropUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 445,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 446,col 7)-(line 446,col 49)",
        "(line 447,col 7)-(line 447,col 40)",
        "(line 448,col 7)-(line 448,col 46)",
        "(line 449,col 7)-(line 449,col 52)",
        "(line 450,col 7)-(line 450,col 66)",
        "(line 453,col 7)-(line 453,col 55)",
        "(line 454,col 7)-(line 454,col 48)",
        "(line 456,col 7)-(line 472,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordSuperClassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 478,
      "end_line": 491,
      "comment": "\n     * Look for the super class implementation up the tree.\n     ",
      "child_ranges": [
        "(line 480,col 7)-(line 480,col 69)",
        "(line 481,col 7)-(line 490,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordSubclassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 497,
      "end_line": 509,
      "comment": "\n     * Conservatively assumes that all subclass implementation of this property\n     * might be called.\n     ",
      "child_ranges": [
        "(line 499,col 7)-(line 503,col 7)",
        "(line 504,col 7)-(line 508,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordUnknownUse(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 511,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 512,col 7)-(line 521,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordClassConstructorOrInterface(java.lang.String, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 528,
      "end_line": 547,
      "comment": "\n     * Creates the name in the graph if it does not already exist. Also puts all\n     * the properties and prototype properties of this name in the graph.\n     ",
      "child_ranges": [
        "(line 530,col 7)-(line 530,col 78)",
        "(line 531,col 7)-(line 531,col 64)",
        "(line 532,col 7)-(line 540,col 7)",
        "(line 541,col 7)-(line 541,col 49)",
        "(line 542,col 7)-(line 545,col 7)",
        "(line 546,col 7)-(line 546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.connectUnknowns()",
      "begin_line": 550,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 551,col 5)-(line 563,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.getType(com.google.javascript.rhino.Node)",
      "begin_line": 569,
      "end_line": 581,
      "comment": "\n   * A helper to retrieve the type of a node.\n   ",
      "child_ranges": [
        "(line 570,col 5)-(line 570,col 32)",
        "(line 571,col 5)-(line 578,col 5)",
        "(line 580,col 5)-(line 580,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.pushContainingFunction(com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n   * Mark the provided node as the current function that we are analyzing.\n   * and add it to the stack of scopes we are inside.\n   *\n   * @param functionNode node representing current function.\n   ",
      "child_ranges": [
        "(line 590,col 5)-(line 590,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.popContainingFunction()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n   * Remove the top item off the containing function stack, and restore the\n   * previous containing scope to the be the current containing function.\n   ",
      "child_ranges": [
        "(line 598,col 5)-(line 598,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.getNamedContainingFunction()",
      "begin_line": 605,
      "end_line": 617,
      "comment": "\n   * Find the first containing function that\u0027s not an function expression\n   * closure.\n   ",
      "child_ranges": [
        "(line 606,col 5)-(line 606,col 29)",
        "(line 607,col 5)-(line 607,col 12)",
        "(line 608,col 5)-(line 614,col 5)",
        "(line 615,col 5)-(line 615,col 45)",
        "(line 616,col 5)-(line 616,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameUse",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 619,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse.NameUse(com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 623,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 23)",
        "(line 625,col 7)-(line 625,col 33)"
      ]
    }
  ]
}