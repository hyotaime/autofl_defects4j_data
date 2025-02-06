{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/LinkedFlowScope.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinkedFlowScope",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.type.FlowScope"
      ],
      "begin_line": 41,
      "end_line": 495,
      "comment": "\n * A flow scope that tries to store as little symbol information as possible,\n * instead delegating to its parents. Optimized for low memory use.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "cache"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The closest flow scope cache."
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The parent flow scope."
    },
    {
      "type": "field",
      "varNames": [
        "depth"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The distance between this flow scope and the closest flat flow scope."
    },
    {
      "type": "field",
      "varNames": [
        "MAX_DEPTH"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flattened"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A FlatFlowScopeCache equivalent to this scope."
    },
    {
      "type": "field",
      "varNames": [
        "frozen"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " So once a child scope is created, this flow scope may not be modified."
    },
    {
      "type": "field",
      "varNames": [
        "lastSlot"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " linked list of slots."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache, com.google.javascript.jscomp.LinkedFlowScope)",
      "begin_line": 64,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 23)",
        "(line 67,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowScope(com.google.javascript.jscomp.LinkedFlowScope)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getFunctionScope()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Gets the function scope for this flow scope. ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.flowsFromBottom()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " Whether this flows from a bottom scope. ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.createEntryLattice(com.google.javascript.jscomp.Scope)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n   * Creates an entry lattice for the flow.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.inferSlotType(java.lang.String, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 38)",
        "(line 106,col 5)-(line 106,col 58)",
        "(line 107,col 5)-(line 107,col 12)",
        "(line 108,col 5)-(line 108,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.inferQualifiedSlot(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)",
      "begin_line": 111,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 45)",
        "(line 115,col 5)-(line 121,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getRootNode()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getParentScope()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getSlot(java.lang.String)",
      "begin_line": 142,
      "end_line": 153,
      "comment": "\n   * Get the slot for the given symbol.\n   ",
      "child_ranges": [
        "(line 144,col 5)-(line 151,col 5)",
        "(line 152,col 5)-(line 152,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.getOwnSlot(java.lang.String)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope()",
      "begin_line": 160,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 18)",
        "(line 164,col 5)-(line 169,col 5)",
        "(line 171,col 5)-(line 171,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.findUniqueRefinedSlot(com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 179,
      "end_line": 200,
      "comment": "\n   * Iterate through all the linked flow scopes before this one.\n   * If there\u0027s one and only one slot defined between this scope\n   * and the blind scope, return it.\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 37)",
        "(line 183,col 5)-(line 197,col 5)",
        "(line 199,col 5)-(line 199,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.completeScope(com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 207,
      "end_line": 220,
      "comment": "\n   * Look through the given scope, and try to find slots where it doesn\u0027t\n   * have enough type information. Then fill in that type information\n   * with stuff that we\u0027ve inferred in the local flow.\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 38)",
        "(line 210,col 5)-(line 219,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.optimize()",
      "begin_line": 231,
      "end_line": 239,
      "comment": " a findUniqueRefinedSlot on it.",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 28)",
        "(line 234,col 5)-(line 237,col 37)",
        "(line 238,col 5)-(line 238,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlowScopeJoinOp",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JoinOp.BinaryJoinOp\u003ccom.google.javascript.jscomp.type.FlowScope\u003e"
      ],
      "begin_line": 242,
      "end_line": 256,
      "comment": " Join the two FlowScopes. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.FlowScopeJoinOp.apply(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.jscomp.type.FlowScope)",
      "begin_line": 243,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 247,col 7)-(line 247,col 52)",
        "(line 248,col 7)-(line 248,col 52)",
        "(line 249,col 7)-(line 249,col 28)",
        "(line 250,col 7)-(line 250,col 28)",
        "(line 251,col 7)-(line 253,col 7)",
        "(line 254,col 7)-(line 254,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.equals(java.lang.Object)",
      "begin_line": 258,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 260,col 5)-(line 306,col 5)",
        "(line 307,col 5)-(line 307,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.diffSlots(com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e, com.google.javascript.rhino.jstype.StaticSlot\u003ccom.google.javascript.rhino.jstype.JSType\u003e)",
      "begin_line": 314,
      "end_line": 326,
      "comment": "\n   * Determines whether two slots are meaningfully different for the\n   * purposes of data flow analysis.\n   ",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 63)",
        "(line 317,col 5)-(line 317,col 63)",
        "(line 318,col 5)-(line 322,col 5)",
        "(line 325,col 5)-(line 325,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.allFlowSlots()",
      "begin_line": 346,
      "end_line": 362,
      "comment": "\n   * Gets all the symbols that have been defined before this point\n   * in the current flow. Does not return slots that have not changed during\n   * the flow.\n   *\n   * For example, consider the code:\n   * \u003ccode\u003e\n   * var x \u003d 3;\n   * function f() {\n   *   var y \u003d 5;\n   *   y \u003d 6; // FLOW POINT\n   *   var z \u003d y;\n   *   return z;\n   * }\n   * \u003c/code\u003e\n   * A FlowScope at FLOW POINT will return a slot for y, but not\n   * a slot for x or z.\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 62)",
        "(line 348,col 5)-(line 353,col 5)",
        "(line 355,col 5)-(line 359,col 5)",
        "(line 361,col 5)-(line 361,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinkedFlowSlot",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.SimpleSlot"
      ],
      "begin_line": 367,
      "end_line": 374,
      "comment": "\n   * A static slot that can be used in a linked list.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot.LinkedFlowSlot(java.lang.String, com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.LinkedFlowScope.LinkedFlowSlot)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 371,col 7)-(line 371,col 30)",
        "(line 372,col 7)-(line 372,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FlatFlowScopeCache",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 380,
      "end_line": 494,
      "comment": "\n   * A map that tries to cache as much symbol table information\n   * as possible in a map. Optimized for fast lookup.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "functionScope"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " The Scope for the entire function or for the global scope."
    },
    {
      "type": "field",
      "varNames": [
        "linkedEquivalent"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": " The linked flow scope that this cache represents."
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " May not include lazily declared qualified names."
    },
    {
      "type": "field",
      "varNames": [
        "dirtySymbols"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " list for symbols that aren\u0027t defined anywhere nearby."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache.FlatFlowScopeCache(com.google.javascript.jscomp.Scope)",
      "begin_line": 402,
      "end_line": 406,
      "comment": " The cache at the bottom of the lattice.",
      "child_ranges": [
        "(line 403,col 7)-(line 403,col 41)",
        "(line 404,col 7)-(line 404,col 34)",
        "(line 405,col 7)-(line 405,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache.FlatFlowScopeCache(com.google.javascript.jscomp.LinkedFlowScope)",
      "begin_line": 409,
      "end_line": 415,
      "comment": " A cache in the middle of a long scope chain.",
      "child_ranges": [
        "(line 410,col 7)-(line 410,col 52)",
        "(line 412,col 7)-(line 412,col 42)",
        "(line 413,col 7)-(line 413,col 44)",
        "(line 414,col 7)-(line 414,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache.FlatFlowScopeCache(com.google.javascript.jscomp.LinkedFlowScope, com.google.javascript.jscomp.LinkedFlowScope)",
      "begin_line": 418,
      "end_line": 482,
      "comment": " A cache at the join of two scope chains.",
      "child_ranges": [
        "(line 420,col 7)-(line 420,col 30)",
        "(line 424,col 7)-(line 425,col 76)",
        "(line 427,col 7)-(line 427,col 75)",
        "(line 428,col 7)-(line 428,col 75)",
        "(line 430,col 7)-(line 430,col 23)",
        "(line 443,col 7)-(line 443,col 66)",
        "(line 444,col 7)-(line 444,col 42)",
        "(line 446,col 7)-(line 481,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LinkedFlowScope.FlatFlowScopeCache.getSlot(java.lang.String)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * Get the slot for the given symbol.\n     ",
      "child_ranges": [
        "(line 488,col 7)-(line 492,col 7)"
      ]
    }
  ]
}