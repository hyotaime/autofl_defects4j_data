{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AliasKeywords.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasKeywords",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 39,
      "end_line": 465,
      "comment": "\n * \u003cp\u003eReplaces references to aliasable keyword literals (true, false,\n * null) with variables and statements (throw) with functions declared in the\n * global scope. When combined with RenameVars, this pass helps to reduce the\n * number of bytes taken up by references to these keywords by replacing them\n * with references to variables and functions with shorter names.\u003c/p\u003e\n *\n "
    },
    {
      "type": "class_interface",
      "name": "FindAliasableNodes",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 41,
      "end_line": 71,
      "comment": " Callback that finds the nodes that we will alias. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.FindAliasableNodes.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 42,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 35)",
        "(line 45,col 7)-(line 49,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.FindAliasableNodes.visitAliasableNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Find the AliasSpecification associated with the node, and tell\n     * that AliasSpecification about the new node.\n     ",
      "child_ranges": [
        "(line 57,col 7)-(line 57,col 70)",
        "(line 58,col 7)-(line 58,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.FindAliasableNodes.visitNameNode(com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Sanity check that our aliases are not already defined by\n     * someone else.\n     ",
      "child_ranges": [
        "(line 66,col 7)-(line 69,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasSpecification",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 161,
      "comment": "\n   * An AliasSpecification encapsulates all of the logic to find\n   * aliasable nodes and alias those nodes, for a given alias name. Subclasses\n   * fill in template methods, allowing for various kinds of aliasing.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " List of nodes to alias (e.g. all \u0027null\u0027 nodes). "
    },
    {
      "type": "field",
      "varNames": [
        "isAliased"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Have we declared the alias (e.g. did we inject var\n     * $$ALIAS_NULL\u003dnull; into the parse tree)?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "aliasName"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokenId"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.AliasSpecification(java.lang.String, int)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * @param aliasName name being used as alias\n     * @param tokenId type of node being replaced with alias\n     ",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 33)",
        "(line 99,col 7)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.visit(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 7)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.maybeInsertAliasDeclarationIntoParseTree(com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Insert a node that declares our alias into the parse tree, as a\n     * child of the specified var node. Only do so if we haven\u0027t\n     * already and there are enough references to the aliased node to\n     * save bytes.\n     * @return Whether the alias has been inserted.\n     ",
      "child_ranges": [
        "(line 114,col 7)-(line 118,col 7)",
        "(line 119,col 7)-(line 119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.doAlias(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\n     * Update all of the nodes with a reference to the corresponding\n     * alias node.\n     ",
      "child_ranges": [
        "(line 127,col 7)-(line 134,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.getTokenId()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 7)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.getAliasName()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.minOccurrencesRequiredToAlias()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Returns the minimum number of nodes that should be present for aliasing\n     * to take place.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.insertAliasDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Creates a node that defines the alias and attaches it to the parse tree.\n     *\n     * @param codeRoot The root of the script. Functions can be attached here,\n     *     e.g., \u003ccode\u003efunction alias(p){throw p;}\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasSpecification.aliasNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 160,
      "end_line": 160,
      "comment": " Replaces the node n with its alias. ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ThrowAliasSpecification",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AliasKeywords.AliasSpecification"
      ],
      "begin_line": 165,
      "end_line": 193,
      "comment": " TODO(user): Generalize this to work with typeof expressions."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasKeywords.ThrowAliasSpecification.ThrowAliasSpecification(java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 7)-(line 167,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.ThrowAliasSpecification.aliasNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 170,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 174,col 53)",
        "(line 175,col 7)-(line 175,col 68)",
        "(line 176,col 7)-(line 176,col 53)",
        "(line 177,col 7)-(line 177,col 49)",
        "(line 178,col 7)-(line 178,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.ThrowAliasSpecification.insertAliasDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.ThrowAliasSpecification.minOccurrencesRequiredToAlias()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 191,col 7)-(line 191,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.estimateMinOccurrencesRequriedToAlias()",
      "begin_line": 199,
      "end_line": 210,
      "comment": "\n   * Calculates the minimum number of occurrences of throw needed to alias\n   * throw.\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 47)",
        "(line 209,col 5)-(line 209,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.createAliasFunctionNode(java.lang.String)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\n   * Creates a function node that takes a single argument, the object to\n   * throw. The function throws the object.\n   ",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 51)",
        "(line 218,col 5)-(line 222,col 48)"
      ]
    },
    {
      "type": "class_interface",
      "name": "KeywordAliasSpecification",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AliasKeywords.AliasSpecification"
      ],
      "begin_line": 226,
      "end_line": 257,
      "comment": " Aliases literal keywords (e.g., null) with variable names. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification.KeywordAliasSpecification(java.lang.String, int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 228,col 7)-(line 228,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification.minOccurrencesRequiredToAlias()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 233,col 7)-(line 233,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification.aliasNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 236,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 239,col 77)",
        "(line 240,col 7)-(line 240,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification.insertAliasDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 243,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 248,col 7)-(line 248,col 41)",
        "(line 249,col 7)-(line 249,col 42)",
        "(line 250,col 7)-(line 252,col 35)",
        "(line 253,col 7)-(line 253,col 33)",
        "(line 254,col 7)-(line 254,col 35)",
        "(line 255,col 7)-(line 255,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "VoidKeywordAliasSpecification",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AliasKeywords.AliasSpecification"
      ],
      "begin_line": 260,
      "end_line": 299,
      "comment": " Aliases literal keywords (e.g., null) with variable names. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification.VoidKeywordAliasSpecification(java.lang.String, int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification.visit(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 265,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 267,col 7)-(line 267,col 37)",
        "(line 268,col 7)-(line 270,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification.minOccurrencesRequiredToAlias()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 7)-(line 275,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification.aliasNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 281,col 77)",
        "(line 282,col 7)-(line 282,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification.insertAliasDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 285,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 290,col 7)-(line 290,col 41)",
        "(line 291,col 7)-(line 291,col 45)",
        "(line 292,col 7)-(line 294,col 35)",
        "(line 295,col 7)-(line 295,col 33)",
        "(line 296,col 7)-(line 296,col 35)",
        "(line 297,col 7)-(line 297,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ALIAS_NULL"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALIAS_TRUE"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALIAS_FALSE"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALIAS_THROW"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALIAS_VOID"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n   * Don\u0027t alias a keyword unless it\u0027s referenced at least\n   * MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL times. Aliasing a keyword has a\n   * cost (e.g. \u0027var XX\u003dtrue;\u0027 costs 12 bytes). We make up for this\n   * cost by replacing references to the keyword with variables that\n   * have shorter names. If there are only a few references to a\n   * keyword, the cost outweighs the benefit. It is not possible to\n   * determine the exact break-even point without compiling twice\n   * (once with aliasing, another without) and comparing the\n   * post-gzipped size, so we define a minimum number of references\n   * required in order to alias. We choose 6 because the alias cost is\n   * ~7-12 bytes (12 bytes for \u0027var XX\u003dtrue;\u0027, 7 bytes for a\n   * subsequent declaration that does not require its own \u0027var \u0027 or\n   * semicolon, e.g. var XX\u003dtrue,XY\u003dnull;), but each reference saves\n   * 2-3 bytes (2 for true and null, 3 for false). Thus, the break\n   * even point is 3 at best, and 6 at worst. We could use a\n   * CostEstimator to be precise, but requiring a constant number of\n   * occurrences is much simpler, and the added precision of a\n   * CostEstimator would save us \u003c10 bytes for some unlikely edge\n   * cases (e.g. where false is referenced exactly 5 times, but does\n   * not get aliased).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW"
      ],
      "begin_line": 336,
      "end_line": 337,
      "comment": "\n   * Don\u0027t alias throw statements unless throw is used at least\n   * MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW times.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Reference to JS Compiler "
    },
    {
      "type": "field",
      "varNames": [
        "aliasSpecifications"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " List of alias specifications, stored in order which transformations\n   * should be applied. See {@link #createAliasSpecifications}.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "aliasTypes"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Map from rhino nodes to the corresponding AliasSpecification "
    },
    {
      "type": "field",
      "varNames": [
        "aliasNames"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " Set of alias names. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasKeywords.AliasKeywords(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 353,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 29)",
        "(line 355,col 5)-(line 355,col 54)",
        "(line 356,col 5)-(line 356,col 41)",
        "(line 357,col 5)-(line 357,col 41)",
        "(line 358,col 5)-(line 361,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 367,
      "end_line": 381,
      "comment": "\n   * Do all processing on the root node.\n   ",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 69)",
        "(line 372,col 5)-(line 380,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.needsAliases()",
      "begin_line": 383,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 384,col 5)-(line 388,col 5)",
        "(line 390,col 5)-(line 390,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.addAliasNodes(com.google.javascript.rhino.Node)",
      "begin_line": 397,
      "end_line": 409,
      "comment": "\n   * Inject alias nodes into the global scope. e.g.\n   * var $$ALIAS_NULL\u003dnull,$$ALIAS_TRUE\u003dtrue,$$ALIAS_FALSE\u003dfalse;.\n   ",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 32)",
        "(line 400,col 5)-(line 404,col 5)",
        "(line 406,col 5)-(line 408,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.isAliasDefinition(com.google.javascript.rhino.Node)",
      "begin_line": 414,
      "end_line": 429,
      "comment": "\n   * Does the given node define one of our aliases?\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 417,col 5)",
        "(line 419,col 5)-(line 422,col 5)",
        "(line 428,col 5)-(line 428,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.isAliasableType(int)",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\n   * Is this one of the Rhino token types that we\u0027re aliasing?\n   ",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.isAliasName(java.lang.String)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n   * Is this one of our alias names?\n   ",
      "child_ranges": [
        "(line 442,col 5)-(line 442,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywords.createAliasSpecifications()",
      "begin_line": 450,
      "end_line": 464,
      "comment": "\n   * Create the AliasSpecifications, one for each type we\u0027re aliasing. The\n   * order of the elements in the list is significant. Transformations should\n   * be applied in the given order.\n   ",
      "child_ranges": [
        "(line 451,col 5)-(line 451,col 54)",
        "(line 452,col 5)-(line 452,col 67)",
        "(line 453,col 5)-(line 453,col 65)",
        "(line 454,col 5)-(line 454,col 65)",
        "(line 455,col 5)-(line 455,col 69)",
        "(line 462,col 5)-(line 462,col 52)",
        "(line 463,col 5)-(line 463,col 13)"
      ]
    }
  ]
}