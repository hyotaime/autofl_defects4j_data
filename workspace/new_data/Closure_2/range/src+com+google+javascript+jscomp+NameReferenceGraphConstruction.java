{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/NameReferenceGraphConstruction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NameReferenceGraphConstruction",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 45,
      "end_line": 634,
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
      "end_line": 554,
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
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 35)",
        "(line 114,col 7)-(line 114,col 37)",
        "(line 118,col 7)-(line 150,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 155,col 7)-(line 157,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 162,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 165,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 168,col 7)-(line 237,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.containsName(com.google.javascript.rhino.Node)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 241,col 7)-(line 243,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.safeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 252,
      "end_line": 277,
      "comment": "\n     * Given a node, this alias all the names in the node that need aliasing.\n     * This is safer than just calling getQualifiedName() because it can return\n     * null it several situations.\n     * @param n node to alias\n     ",
      "child_ranges": [
        "(line 253,col 7)-(line 260,col 7)",
        "(line 262,col 7)-(line 276,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.maybeAliasNamesOnAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 279,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 286,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.defineAndAlias(java.lang.String)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.maybeRecordExport(com.google.javascript.rhino.Node)",
      "begin_line": 293,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 49)",
        "(line 295,col 7)-(line 295,col 42)",
        "(line 296,col 7)-(line 298,col 7)",
        "(line 300,col 7)-(line 300,col 52)",
        "(line 302,col 7)-(line 304,col 7)",
        "(line 308,col 7)-(line 311,col 7)",
        "(line 313,col 7)-(line 315,col 7)",
        "(line 317,col 7)-(line 317,col 38)",
        "(line 318,col 7)-(line 320,col 7)",
        "(line 322,col 7)-(line 322,col 34)",
        "(line 323,col 7)-(line 323,col 44)",
        "(line 325,col 7)-(line 327,col 7)",
        "(line 329,col 7)-(line 329,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isLocalNameReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 335,
      "end_line": 343,
      "comment": "\n     * @return true if n MUST be a local name reference.\n     ",
      "child_ranges": [
        "(line 338,col 7)-(line 341,col 7)",
        "(line 342,col 7)-(line 342,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isStaticNameReference(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 348,
      "end_line": 359,
      "comment": "\n     * @return true if n MUST be a static name reference.\n     ",
      "child_ranges": [
        "(line 349,col 7)-(line 349,col 63)",
        "(line 350,col 7)-(line 352,col 7)",
        "(line 353,col 7)-(line 353,col 42)",
        "(line 354,col 7)-(line 356,col 7)",
        "(line 358,col 7)-(line 358,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.isPrototypeNameReference(com.google.javascript.rhino.Node)",
      "begin_line": 364,
      "end_line": 373,
      "comment": "\n     * @return true if n MUST be a prototype name reference.\n     ",
      "child_ranges": [
        "(line 365,col 7)-(line 367,col 7)",
        "(line 368,col 7)-(line 368,col 47)",
        "(line 369,col 7)-(line 371,col 7)",
        "(line 372,col 7)-(line 372,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordStaticNameDefinition(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 375,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 377,col 7)-(line 381,col 7)",
        "(line 382,col 7)-(line 395,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordPrototypePropDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 402,
      "end_line": 433,
      "comment": "\n     * @param assign The assignment node, null if it is just a \"forward\"\n     *     declaration for recording the rValue\u0027s type.\n     ",
      "child_ranges": [
        "(line 405,col 7)-(line 405,col 74)",
        "(line 406,col 7)-(line 406,col 36)",
        "(line 407,col 7)-(line 407,col 30)",
        "(line 409,col 7)-(line 418,col 7)",
        "(line 420,col 7)-(line 421,col 56)",
        "(line 423,col 7)-(line 424,col 51)",
        "(line 425,col 7)-(line 425,col 75)",
        "(line 426,col 7)-(line 427,col 65)",
        "(line 428,col 7)-(line 430,col 7)",
        "(line 431,col 7)-(line 431,col 34)",
        "(line 432,col 7)-(line 432,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordStaticNameUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 435,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 437,col 7)-(line 446,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordPrototypePropUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 449,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 451,col 7)-(line 451,col 49)",
        "(line 452,col 7)-(line 452,col 40)",
        "(line 453,col 7)-(line 453,col 46)",
        "(line 454,col 7)-(line 454,col 52)",
        "(line 455,col 7)-(line 455,col 66)",
        "(line 458,col 7)-(line 458,col 55)",
        "(line 459,col 7)-(line 459,col 48)",
        "(line 461,col 7)-(line 477,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordSuperClassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 483,
      "end_line": 496,
      "comment": "\n     * Look for the super class implementation up the tree.\n     ",
      "child_ranges": [
        "(line 485,col 7)-(line 485,col 69)",
        "(line 486,col 7)-(line 495,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordSubclassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 502,
      "end_line": 514,
      "comment": "\n     * Conservatively assumes that all subclass implementation of this property\n     * might be called.\n     ",
      "child_ranges": [
        "(line 504,col 7)-(line 508,col 7)",
        "(line 509,col 7)-(line 513,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordUnknownUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 516,
      "end_line": 527,
      "comment": "",
      "child_ranges": [
        "(line 517,col 7)-(line 526,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal.recordClassConstructorOrInterface(java.lang.String, com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 533,
      "end_line": 553,
      "comment": "\n     * Creates the name in the graph if it does not already exist. Also puts all\n     * the properties and prototype properties of this name in the graph.\n     ",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 78)",
        "(line 537,col 7)-(line 537,col 64)",
        "(line 538,col 7)-(line 546,col 7)",
        "(line 547,col 7)-(line 547,col 49)",
        "(line 548,col 7)-(line 551,col 7)",
        "(line 552,col 7)-(line 552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.connectUnknowns()",
      "begin_line": 556,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 557,col 5)-(line 569,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.getType(com.google.javascript.rhino.Node)",
      "begin_line": 575,
      "end_line": 587,
      "comment": "\n   * A helper to retrieve the type of a node.\n   ",
      "child_ranges": [
        "(line 576,col 5)-(line 576,col 32)",
        "(line 577,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 586,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.pushContainingFunction(com.google.javascript.jscomp.NameReferenceGraph.Name)",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\n   * Mark the provided node as the current function that we are analyzing.\n   * and add it to the stack of scopes we are inside.\n   *\n   * @param functionNode node representing current function.\n   ",
      "child_ranges": [
        "(line 596,col 5)-(line 596,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.popContainingFunction()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n   * Remove the top item off the containing function stack, and restore the\n   * previous containing scope to the be the current containing function.\n   ",
      "child_ranges": [
        "(line 604,col 5)-(line 604,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.getNamedContainingFunction()",
      "begin_line": 611,
      "end_line": 623,
      "comment": "\n   * Find the first containing function that\u0027s not an function expression\n   * closure.\n   ",
      "child_ranges": [
        "(line 612,col 5)-(line 612,col 29)",
        "(line 613,col 5)-(line 613,col 12)",
        "(line 614,col 5)-(line 620,col 5)",
        "(line 621,col 5)-(line 621,col 45)",
        "(line 622,col 5)-(line 622,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameUse",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 625,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse.NameUse(com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference)",
      "begin_line": 629,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 23)",
        "(line 631,col 7)-(line 631,col 33)"
      ]
    }
  ]
}