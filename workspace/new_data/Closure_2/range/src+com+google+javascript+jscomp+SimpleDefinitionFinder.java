{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SimpleDefinitionFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleDefinitionFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.DefinitionProvider"
      ],
      "begin_line": 45,
      "end_line": 465,
      "comment": "\n * Simple name-based definition gatherer that implements\n * {@link DefinitionProvider}.\n *\n * It treats all variable writes as happening in the global scope and\n * treats all objects as capable of having the same set of properties.\n * The current implementation only handles definitions whose right\n * hand side is an immutable value or function expression.  All\n * complex definitions are treated as unknowns.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "definitionSiteMap"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameDefinitionMultimap"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameUseSiteMultimap"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.SimpleDefinitionFinder(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 29)",
        "(line 53,col 5)-(line 53,col 53)",
        "(line 54,col 5)-(line 54,col 62)",
        "(line 55,col 5)-(line 55,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionSites()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n   * Returns the collection of definition sites found during traversal.\n   *\n   * @return definition site collection.\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionAt(com.google.javascript.rhino.Node)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionForFunction(com.google.javascript.rhino.Node)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 52)",
        "(line 73,col 5)-(line 73,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(com.google.javascript.rhino.Node)",
      "begin_line": 76,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 80,col 5)",
        "(line 82,col 5)-(line 87,col 5)",
        "(line 89,col 5)-(line 89,col 45)",
        "(line 90,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 66)",
        "(line 106,col 5)-(line 107,col 66)",
        "(line 108,col 5)-(line 109,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getUseSites(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n   * Returns a collection of use sites that may refer to provided\n   * definition.  Returns an empty collection if the definition is not\n   * used anywhere.\n   *\n   * @param definition Definition of interest.\n   * @return use site collection.\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 60)",
        "(line 122,col 5)-(line 122,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(com.google.javascript.rhino.Node)",
      "begin_line": 135,
      "end_line": 147,
      "comment": "\n   * Extract a name from a node.  In the case of GETPROP nodes,\n   * replace the namespace or object expression with \"this\" for\n   * simplicity and correctness at the expense of inefficiencies due\n   * to higher chances of name collisions.\n   *\n   * TODO(user) revisit.  it would be helpful to at least use fully\n   * qualified names in the case of namespaces.  Might not matter as\n   * much if this pass runs after \"collapsing properties\".\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 145,col 5)",
        "(line 146,col 5)-(line 146,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefinitionGatheringCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 149,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.DefinitionGatheringCallback(boolean)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 156,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 161,col 7)-(line 163,col 7)",
        "(line 165,col 7)-(line 166,col 60)",
        "(line 167,col 7)-(line 219,col 7)",
        "(line 221,col 7)-(line 259,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.jsdocContainsDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\n     * @return Whether the node has a JSDoc that actually declares something.\n     ",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 43)",
        "(line 267,col 7)-(line 267,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UseSiteGatheringCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 271,
      "end_line": 288,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.UseSiteGatheringCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 272,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 69)",
        "(line 276,col 7)-(line 278,col 7)",
        "(line 280,col 7)-(line 280,col 48)",
        "(line 282,col 7)-(line 282,col 57)",
        "(line 283,col 7)-(line 283,col 39)",
        "(line 284,col 7)-(line 286,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(com.google.javascript.jscomp.UseSite)",
      "begin_line": 294,
      "end_line": 304,
      "comment": "\n   * @param use A use site to check.\n   * @return Whether the use is a call or new.\n   ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 37)",
        "(line 296,col 5)-(line 299,col 5)",
        "(line 303,col 5)-(line 303,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.canModifyDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 306,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 309,col 5)",
        "(line 315,col 5)-(line 315,col 59)",
        "(line 316,col 5)-(line 318,col 5)",
        "(line 320,col 5)-(line 336,col 5)",
        "(line 338,col 5)-(line 338,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isExported(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 344,
      "end_line": 368,
      "comment": "\n   * @return Whether the definition is directly exported.\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 41)",
        "(line 347,col 5)-(line 349,col 5)",
        "(line 351,col 5)-(line 351,col 23)",
        "(line 352,col 5)-(line 360,col 5)",
        "(line 362,col 5)-(line 362,col 71)",
        "(line 363,col 5)-(line 365,col 5)",
        "(line 367,col 5)-(line 367,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 373,
      "end_line": 410,
      "comment": "\n   * @return Whether the function is defined in a non-aliasing expression.\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 33)",
        "(line 375,col 5)-(line 375,col 37)",
        "(line 386,col 5)-(line 386,col 75)",
        "(line 387,col 5)-(line 395,col 5)",
        "(line 398,col 5)-(line 400,col 5)",
        "(line 404,col 5)-(line 407,col 5)",
        "(line 409,col 5)-(line 409,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getNameNodeFromFunctionNode(com.google.javascript.rhino.Node)",
      "begin_line": 415,
      "end_line": 430,
      "comment": "\n   * @return the node defining the name for this function (if any).\n   ",
      "child_ranges": [
        "(line 416,col 5)-(line 416,col 52)",
        "(line 417,col 5)-(line 428,col 5)",
        "(line 429,col 5)-(line 429,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.removeReferences(com.google.javascript.rhino.Node)",
      "begin_line": 436,
      "end_line": 464,
      "comment": "\n   * Traverse a node and its children and remove any references to from\n   * the structures.\n   ",
      "child_ranges": [
        "(line 437,col 5)-(line 459,col 5)",
        "(line 461,col 5)-(line 463,col 5)"
      ]
    }
  ]
}