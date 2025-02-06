{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ScopedAliases.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScopedAliases",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 72,
      "end_line": 562,
      "comment": "\n * Process aliases in goog.scope blocks.\n *\n * goog.scope(function() {\n *   var dom \u003d goog.dom;\n *   var DIV \u003d dom.TagName.DIV;\n *\n *   dom.createElement(DIV);\n * });\n *\n * should become\n *\n * goog.dom.createElement(goog.dom.TagName.DIV);\n *\n * The advantage of using goog.scope is that the compiler will *guarantee*\n * the anonymous function will be inlined, even if it can\u0027t prove\n * that it\u0027s semantically correct to do so. For example, consider this case:\n *\n * goog.scope(function() {\n *   goog.getBar \u003d function () { return alias; };\n *   ...\n *   var alias \u003d foo.bar;\n * })\n *\n * In theory, the compiler can\u0027t inline \u0027alias\u0027 unless it can prove that\n * goog.getBar is called only after \u0027alias\u0027 is defined.\n *\n * In practice, the compiler will inline \u0027alias\u0027 anyway, at the risk of\n * \u0027fixing\u0027 bad code.\n *\n * @author robbyw@google.com (Robby Walker)\n "
    },
    {
      "type": "field",
      "varNames": [
        "SCOPING_METHOD_NAME"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Name used to denote an scoped function block used for aliasing. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformationHandler"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USED_IMPROPERLY"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": " Errors"
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_HAS_BAD_PARAMETERS"
      ],
      "begin_line": 85,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_REFERENCES_THIS"
      ],
      "begin_line": 91,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USES_RETURN"
      ],
      "begin_line": 95,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USES_THROW"
      ],
      "begin_line": 99,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_ALIAS_REDEFINED"
      ],
      "begin_line": 103,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_ALIAS_CYCLE"
      ],
      "begin_line": 107,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_NON_ALIAS_LOCAL"
      ],
      "begin_line": 111,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopedAliasNames"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.ScopedAliases(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PreprocessorSymbolTable, com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 29)",
        "(line 121,col 5)-(line 121,col 59)",
        "(line 122,col 5)-(line 122,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 42)",
        "(line 133,col 5)-(line 133,col 54)",
        "(line 135,col 5)-(line 187,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasUsage",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 190,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasVar"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasReference"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasUsage.AliasUsage(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 31)",
        "(line 196,col 7)-(line 196,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasUsage.referencesOtherAlias()",
      "begin_line": 200,
      "end_line": 205,
      "comment": " Checks to see if this references another alias. ",
      "child_ranges": [
        "(line 201,col 7)-(line 201,col 56)",
        "(line 202,col 7)-(line 202,col 67)",
        "(line 203,col 7)-(line 203,col 75)",
        "(line 204,col 7)-(line 204,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasUsage.applyAlias()",
      "begin_line": 207,
      "end_line": 207,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "AliasedNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopedAliases.AliasUsage"
      ],
      "begin_line": 210,
      "end_line": 221,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedNode.AliasedNode(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedNode.applyAlias()",
      "begin_line": 215,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 217,col 7)-(line 217,col 56)",
        "(line 218,col 7)-(line 219,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasedTypeNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopedAliases.AliasUsage"
      ],
      "begin_line": 223,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedTypeNode.AliasedTypeNode(com.google.javascript.jscomp.Scope.Var, com.google.javascript.rhino.Node)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 7)-(line 225,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedTypeNode.applyAlias()",
      "begin_line": 228,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 56)",
        "(line 231,col 7)-(line 231,col 44)",
        "(line 232,col 7)-(line 232,col 51)",
        "(line 233,col 7)-(line 234,col 73)",
        "(line 235,col 7)-(line 235,col 63)",
        "(line 236,col 7)-(line 236,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 241,
      "end_line": 561,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasDefinitionsInOrder"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The order of this list determines the order that aliases are applied."
    },
    {
      "type": "field",
      "varNames": [
        "scopeCalls"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasUsages"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " This map is temporary and cleared for each scope."
    },
    {
      "type": "field",
      "varNames": [
        "forbiddenLocals"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " up warning messages downstream)."
    },
    {
      "type": "field",
      "varNames": [
        "hasNamespaceShadows"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasErrors"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformation"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getAliasDefinitionsInOrder()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getAliasUsages()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 7)-(line 276,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getScopeCalls()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.hasErrors()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 7)-(line 284,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.isCallToScopeMethod(com.google.javascript.rhino.Node)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 289,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 292,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 294,col 7)-(line 294,col 46)",
        "(line 295,col 7)-(line 299,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 302,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 304,col 7)-(line 306,col 7)",
        "(line 308,col 7)-(line 314,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 317,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 324,col 7)",
        "(line 325,col 7)-(line 325,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getSourceRegion(com.google.javascript.rhino.Node)",
      "begin_line": 328,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 329,col 7)-(line 329,col 24)",
        "(line 330,col 7)-(line 330,col 23)",
        "(line 331,col 7)-(line 334,col 7)",
        "(line 336,col 7)-(line 336,col 72)",
        "(line 337,col 7)-(line 337,col 72)",
        "(line 338,col 7)-(line 339,col 55)",
        "(line 340,col 7)-(line 341,col 58)",
        "(line 342,col 7)-(line 342,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 345,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 347,col 7)-(line 347,col 56)",
        "(line 348,col 7)-(line 348,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.findAliases(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 351,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 352,col 7)-(line 352,col 33)",
        "(line 353,col 7)-(line 397,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.recordAlias(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 400,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 401,col 7)-(line 401,col 39)",
        "(line 402,col 7)-(line 402,col 34)",
        "(line 404,col 7)-(line 405,col 54)",
        "(line 406,col 7)-(line 406,col 51)",
        "(line 408,col 7)-(line 408,col 49)",
        "(line 409,col 7)-(line 414,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.findNamespaceShadows(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 418,
      "end_line": 430,
      "comment": " Find out if there are any local shadows of namespaces. ",
      "child_ranges": [
        "(line 419,col 7)-(line 421,col 7)",
        "(line 423,col 7)-(line 423,col 33)",
        "(line 424,col 7)-(line 429,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.renameNamespaceShadows(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 437,
      "end_line": 450,
      "comment": "\n     * Rename any local shadows of namespaces.\n     * This should be a very rare occurrence, so only do this traversal\n     * if we know that we need it.\n     ",
      "child_ranges": [
        "(line 438,col 7)-(line 449,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.validateScopeCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 452,
      "end_line": 473,
      "comment": "",
      "child_ranges": [
        "(line 453,col 7)-(line 455,col 7)",
        "(line 456,col 7)-(line 458,col 7)",
        "(line 459,col 7)-(line 472,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 475,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 477,col 7)-(line 479,col 7)",
        "(line 481,col 7)-(line 483,col 7)",
        "(line 485,col 7)-(line 485,col 29)",
        "(line 486,col 7)-(line 486,col 26)",
        "(line 487,col 7)-(line 493,col 7)",
        "(line 496,col 7)-(line 516,col 7)",
        "(line 519,col 7)-(line 539,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.fixTypeNode(com.google.javascript.rhino.Node)",
      "begin_line": 542,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 543,col 7)-(line 554,col 7)",
        "(line 556,col 7)-(line 559,col 7)"
      ]
    }
  ]
}