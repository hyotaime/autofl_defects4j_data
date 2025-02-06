{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AliasStrings.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasStrings",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 45,
      "end_line": 456,
      "comment": "\n * A {@link Compiler} pass for aliasing strings. String declarations\n * contribute to garbage collection, which becomes a problem in large\n * applications. Strings that should be aliased occur many times in the code,\n * or occur on codepaths that get executed frequently.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRING_ALIAS_PREFIX"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Prefix for variable names for the aliased strings "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "blacklist"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Regular expression matcher for a blacklisting strings in aliasing."
    },
    {
      "type": "field",
      "varNames": [
        "aliasableStrings"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Strings that can be aliased, or null if all strings except \u0027undefined\u0027\n   * should be aliased\n   "
    },
    {
      "type": "field",
      "varNames": [
        "outputStringUsage"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringInfoMap"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "usedHashedAliases"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleVarParentMap"
      ],
      "begin_line": 77,
      "end_line": 78,
      "comment": "\n   * Map from module to the node in that module that should parent any string\n   * variable declarations that have to be moved into that module\n   "
    },
    {
      "type": "field",
      "varNames": [
        "unitTestHashReductionMask"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " package private.  This value is AND-ed with the hash function to allow\n   * unit tests to reduce the range of hash values to test collision cases "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasStrings.AliasStrings(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.JSModuleGraph, java.util.Set\u003cjava.lang.String\u003e, java.lang.String, boolean)",
      "begin_line": 95,
      "end_line": 109,
      "comment": "\n   * Creates an instance.\n   *\n   * @param compiler The compiler\n   * @param moduleGraph The module graph, or null if there are no modules\n   * @param strings Set of strings to be aliased. If null, all strings except\n   *     \u0027undefined\u0027 will be aliased.\n   * @param blacklistRegex The regex to blacklist words in aliasing strings.\n   * @param outputStringUsage Outputs all strings and the number of times they\n   * were used in the application to the server log.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 36)",
        "(line 103,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 111,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 43)",
        "(line 116,col 5)-(line 116,col 49)",
        "(line 119,col 5)-(line 119,col 32)",
        "(line 122,col 5)-(line 122,col 31)",
        "(line 124,col 5)-(line 126,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.getOrCreateStringInfo(java.lang.String)",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\n   * Looks up the {@link StringInfo} object for a JavaScript string. Creates\n   * it if necessary.\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 48)",
        "(line 195,col 5)-(line 198,col 5)",
        "(line 199,col 5)-(line 199,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.isInThrowExpression(com.google.javascript.rhino.Node)",
      "begin_line": 205,
      "end_line": 230,
      "comment": "\n   * Is the {@link Node} currently within a \u0027throw\u0027 expression?\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 228,col 5)",
        "(line 229,col 5)-(line 229,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.replaceStringsWithAliases()",
      "begin_line": 235,
      "end_line": 246,
      "comment": "\n   * Replace strings with references to alias variables.\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 245,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.addAliasDeclarationNodes()",
      "begin_line": 252,
      "end_line": 268,
      "comment": "\n   * Creates a var declaration for each aliased string. Var declarations are\n   * inserted as close to the first use of the string as possible.\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 267,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.shouldReplaceWithAlias(java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo)",
      "begin_line": 276,
      "end_line": 303,
      "comment": "\n   *  Dictates the policy for replacing a string with an alias.\n   *\n   *  @param str The string literal\n   *  @param info Accumulated information about a string\n   ",
      "child_ranges": [
        "(line 280,col 5)-(line 282,col 5)",
        "(line 295,col 5)-(line 295,col 41)",
        "(line 296,col 5)-(line 296,col 60)",
        "(line 297,col 5)-(line 297,col 27)",
        "(line 299,col 5)-(line 300,col 47)",
        "(line 302,col 5)-(line 302,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.replaceStringWithAliasName(com.google.javascript.jscomp.AliasStrings.StringOccurrence, java.lang.String, com.google.javascript.jscomp.AliasStrings.StringInfo)",
      "begin_line": 308,
      "end_line": 315,
      "comment": "\n   * Replaces a string literal with a reference to the string\u0027s alias variable.\n   ",
      "child_ranges": [
        "(line 311,col 5)-(line 312,col 50)",
        "(line 313,col 5)-(line 313,col 26)",
        "(line 314,col 5)-(line 314,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.outputStringUsage()",
      "begin_line": 320,
      "end_line": 333,
      "comment": "\n   * Outputs a log of all strings used more than once in the code.\n   ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 75)",
        "(line 322,col 5)-(line 330,col 5)",
        "(line 332,col 5)-(line 332,col 31)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringOccurrence",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 340,
      "end_line": 348,
      "comment": "\n   * A class that holds the location of a single JavaScript string literal\n   "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasStrings.StringOccurrence.StringOccurrence(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 345,col 7)-(line 345,col 23)",
        "(line 346,col 7)-(line 346,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 354,
      "end_line": 455,
      "comment": "\n   * A class that holds information about a JavaScript string that might become\n   * aliased.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAliased"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " set to \u0027true\u0027 when reference to alias created"
    },
    {
      "type": "field",
      "varNames": [
        "occurrences"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numOccurrences"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numOccurrencesInfrequentlyExecuted"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleToContainDecl"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parentForNewVarDecl"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "siblingToInsertVarDeclBefore"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasName"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasStrings.StringInfo.StringInfo(int)",
      "begin_line": 369,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 370,col 7)-(line 370,col 19)",
        "(line 371,col 7)-(line 371,col 59)",
        "(line 372,col 7)-(line 372,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.StringInfo.getVariableName(java.lang.String)",
      "begin_line": 376,
      "end_line": 382,
      "comment": " Returns the JS variable name to be substituted for this string. ",
      "child_ranges": [
        "(line 377,col 7)-(line 380,col 7)",
        "(line 381,col 7)-(line 381,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStrings.StringInfo.encodeStringAsIdentifier(java.lang.String, java.lang.String)",
      "begin_line": 403,
      "end_line": 454,
      "comment": "\n     * Returns a legal identifier that uniquely characterizes string \u0027s\u0027.\n     *\n     * We want the identifier to be a function of the string value because that\n     * makes the identifiers stable as the program is changed.\n     *\n     * The digits of a good hash function would be adequate, but for short\n     * strings the following algorithm is easier to work with for unit tests.\n     *\n     * ASCII alphanumerics are mapped to themselves.  Other characters are\n     * mapped to $XXX or $XXX_ where XXX is a variable number of hex digits.\n     * The underscore is inserted as necessary to avoid ambiguity when the\n     * character following is a hex digit. E.g. \u0027\\n1\u0027 maps to \u0027$a_1\u0027,\n     * distinguished by the underscore from \u0027\\u00A1\u0027 which maps to \u0027$a1\u0027.\n     *\n     * If the string is short enough, this is sufficient.  Longer strings are\n     * truncated after encoding an initial prefix and appended with a hash\n     * value.\n     ",
      "child_ranges": [
        "(line 405,col 7)-(line 405,col 30)",
        "(line 406,col 7)-(line 406,col 36)",
        "(line 407,col 7)-(line 407,col 51)",
        "(line 409,col 7)-(line 409,col 45)",
        "(line 410,col 7)-(line 410,col 24)",
        "(line 411,col 7)-(line 411,col 33)",
        "(line 413,col 7)-(line 433,col 7)",
        "(line 435,col 7)-(line 437,col 7)",
        "(line 441,col 7)-(line 441,col 32)",
        "(line 442,col 7)-(line 442,col 33)",
        "(line 443,col 7)-(line 443,col 63)",
        "(line 444,col 7)-(line 444,col 21)",
        "(line 445,col 7)-(line 445,col 40)",
        "(line 446,col 7)-(line 446,col 37)",
        "(line 447,col 7)-(line 452,col 7)",
        "(line 453,col 7)-(line 453,col 21)"
      ]
    }
  ]
}