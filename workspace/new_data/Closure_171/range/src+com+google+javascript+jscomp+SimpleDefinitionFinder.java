{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SimpleDefinitionFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleDefinitionFinder",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.DefinitionProvider"
      ],
      "begin_line": 46,
      "end_line": 466,
      "comment": "\n * Simple name-based definition gatherer that implements\n * {@link DefinitionProvider}.\n *\n * It treats all variable writes as happening in the global scope and\n * treats all objects as capable of having the same set of properties.\n * The current implementation only handles definitions whose right\n * hand side is an immutable value or function expression.  All\n * complex definitions are treated as unknowns.\n *\n "
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
        "definitionSiteMap"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameDefinitionMultimap"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameUseSiteMultimap"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.SimpleDefinitionFinder(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 52,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 29)",
        "(line 54,col 5)-(line 54,col 53)",
        "(line 55,col 5)-(line 55,col 62)",
        "(line 56,col 5)-(line 56,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionSites()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n   * Returns the collection of definition sites found during traversal.\n   *\n   * @return definition site collection.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionAt(com.google.javascript.rhino.Node)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionForFunction(com.google.javascript.rhino.Node)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 52)",
        "(line 74,col 5)-(line 74,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getDefinitionsReferencedAt(com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 81,col 5)",
        "(line 83,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 45)",
        "(line 91,col 5)-(line 100,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 106,col 66)",
        "(line 107,col 5)-(line 108,col 66)",
        "(line 109,col 5)-(line 110,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getUseSites(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n   * Returns a collection of use sites that may refer to provided\n   * definition.  Returns an empty collection if the definition is not\n   * used anywhere.\n   *\n   * @param definition Definition of interest.\n   * @return use site collection.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 60)",
        "(line 123,col 5)-(line 123,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getSimplifiedName(com.google.javascript.rhino.Node)",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\n   * Extract a name from a node.  In the case of GETPROP nodes,\n   * replace the namespace or object expression with \"this\" for\n   * simplicity and correctness at the expense of inefficiencies due\n   * to higher chances of name collisions.\n   *\n   * TODO(user) revisit.  it would be helpful to at least use fully\n   * qualified names in the case of namespaces.  Might not matter as\n   * much if this pass runs after \"collapsing properties\".\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 146,col 5)",
        "(line 147,col 5)-(line 147,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DefinitionGatheringCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 150,
      "end_line": 270,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.DefinitionGatheringCallback(boolean)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 162,col 7)-(line 164,col 7)",
        "(line 166,col 7)-(line 167,col 60)",
        "(line 168,col 7)-(line 220,col 7)",
        "(line 222,col 7)-(line 260,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.DefinitionGatheringCallback.jsdocContainsDeclarations(com.google.javascript.rhino.Node)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\n     * @return Whether the node has a JSDoc that actually declares something.\n     ",
      "child_ranges": [
        "(line 267,col 7)-(line 267,col 43)",
        "(line 268,col 7)-(line 268,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UseSiteGatheringCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 272,
      "end_line": 289,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.UseSiteGatheringCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 273,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 276,col 7)-(line 276,col 69)",
        "(line 277,col 7)-(line 279,col 7)",
        "(line 281,col 7)-(line 281,col 48)",
        "(line 283,col 7)-(line 283,col 57)",
        "(line 284,col 7)-(line 284,col 39)",
        "(line 285,col 7)-(line 287,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isCallOrNewSite(com.google.javascript.jscomp.UseSite)",
      "begin_line": 295,
      "end_line": 305,
      "comment": "\n   * @param use A use site to check.\n   * @return Whether the use is a call or new.\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 37)",
        "(line 297,col 5)-(line 300,col 5)",
        "(line 304,col 5)-(line 304,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.canModifyDefinition(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 307,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 310,col 5)",
        "(line 316,col 5)-(line 316,col 59)",
        "(line 317,col 5)-(line 319,col 5)",
        "(line 321,col 5)-(line 337,col 5)",
        "(line 339,col 5)-(line 339,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isExported(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 345,
      "end_line": 369,
      "comment": "\n   * @return Whether the definition is directly exported.\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 41)",
        "(line 348,col 5)-(line 350,col 5)",
        "(line 352,col 5)-(line 352,col 23)",
        "(line 353,col 5)-(line 361,col 5)",
        "(line 363,col 5)-(line 363,col 71)",
        "(line 364,col 5)-(line 366,col 5)",
        "(line 368,col 5)-(line 368,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.isSimpleFunctionDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 374,
      "end_line": 411,
      "comment": "\n   * @return Whether the function is defined in a non-aliasing expression.\n   ",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 33)",
        "(line 376,col 5)-(line 376,col 37)",
        "(line 387,col 5)-(line 387,col 75)",
        "(line 388,col 5)-(line 396,col 5)",
        "(line 399,col 5)-(line 401,col 5)",
        "(line 405,col 5)-(line 408,col 5)",
        "(line 410,col 5)-(line 410,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.getNameNodeFromFunctionNode(com.google.javascript.rhino.Node)",
      "begin_line": 416,
      "end_line": 431,
      "comment": "\n   * @return the node defining the name for this function (if any).\n   ",
      "child_ranges": [
        "(line 417,col 5)-(line 417,col 52)",
        "(line 418,col 5)-(line 429,col 5)",
        "(line 430,col 5)-(line 430,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SimpleDefinitionFinder.removeReferences(com.google.javascript.rhino.Node)",
      "begin_line": 437,
      "end_line": 465,
      "comment": "\n   * Traverse a node and its children and remove any references to from\n   * the structures.\n   ",
      "child_ranges": [
        "(line 438,col 5)-(line 460,col 5)",
        "(line 462,col 5)-(line 464,col 5)"
      ]
    }
  ]
}