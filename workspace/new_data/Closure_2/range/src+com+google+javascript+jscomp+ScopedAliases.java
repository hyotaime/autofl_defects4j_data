{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ScopedAliases.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScopedAliases",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 54,
      "end_line": 484,
      "comment": "\n * Process aliases in goog.scope blocks.\n *\n * goog.scope(function() {\n *   var dom \u003d goog.dom;\n *   var DIV \u003d dom.TagName.DIV;\n *\n *   dom.createElement(DIV);\n * });\n *\n * should become\n *\n * goog.dom.createElement(goog.dom.TagName.DIV);\n *\n * @author robbyw@google.com (Robby Walker)\n "
    },
    {
      "type": "field",
      "varNames": [
        "SCOPING_METHOD_NAME"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Name used to denote an scoped function block used for aliasing. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preprocessorSymbolTable"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformationHandler"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USED_IMPROPERLY"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": " Errors"
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_HAS_BAD_PARAMETERS"
      ],
      "begin_line": 67,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_REFERENCES_THIS"
      ],
      "begin_line": 73,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USES_RETURN"
      ],
      "begin_line": 77,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_USES_THROW"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_ALIAS_REDEFINED"
      ],
      "begin_line": 85,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_NON_ALIAS_LOCAL"
      ],
      "begin_line": 89,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.ScopedAliases(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.PreprocessorSymbolTable, com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 29)",
        "(line 97,col 5)-(line 97,col 59)",
        "(line 98,col 5)-(line 98,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 106,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 42)",
        "(line 109,col 5)-(line 109,col 54)",
        "(line 111,col 5)-(line 144,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasUsage",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 147,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasUsage.applyAlias()",
      "begin_line": 148,
      "end_line": 148,
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
      "begin_line": 151,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasReference"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasDefinition"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedNode.AliasedNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 43)",
        "(line 158,col 7)-(line 158,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedNode.applyAlias()",
      "begin_line": 161,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 163,col 7)-(line 164,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasedTypeNode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopedAliases.AliasUsage"
      ],
      "begin_line": 168,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typeReference"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasDefinition"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasName"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedTypeNode.AliasedTypeNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 175,col 41)",
        "(line 176,col 7)-(line 176,col 45)",
        "(line 177,col 7)-(line 177,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.AliasedTypeNode.applyAlias()",
      "begin_line": 180,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 50)",
        "(line 183,col 7)-(line 184,col 73)",
        "(line 185,col 7)-(line 185,col 63)",
        "(line 186,col 7)-(line 186,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Traversal",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 191,
      "end_line": 483,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasDefinitionsInOrder"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The order of this list determines the order that aliases are applied."
    },
    {
      "type": "field",
      "varNames": [
        "scopeCalls"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliasUsages"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " This map is temporary and cleared for each scope."
    },
    {
      "type": "field",
      "varNames": [
        "forbiddenLocals"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " up warning messages downstream)."
    },
    {
      "type": "field",
      "varNames": [
        "hasNamespaceShadows"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasErrors"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformation"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getAliasDefinitionsInOrder()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 222,col 7)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getAliasUsages()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 226,col 7)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getScopeCalls()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 230,col 7)-(line 230,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.hasErrors()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 234,col 7)-(line 234,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.isCallToScopeMethod(com.google.javascript.rhino.Node)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 7)-(line 239,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 242,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 46)",
        "(line 245,col 7)-(line 249,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 252,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 254,col 7)-(line 256,col 7)",
        "(line 258,col 7)-(line 264,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 269,col 7)-(line 274,col 7)",
        "(line 275,col 7)-(line 275,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.getSourceRegion(com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 24)",
        "(line 280,col 7)-(line 280,col 23)",
        "(line 281,col 7)-(line 284,col 7)",
        "(line 286,col 7)-(line 286,col 72)",
        "(line 287,col 7)-(line 287,col 72)",
        "(line 288,col 7)-(line 289,col 55)",
        "(line 290,col 7)-(line 291,col 58)",
        "(line 292,col 7)-(line 292,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 297,col 7)-(line 297,col 56)",
        "(line 298,col 7)-(line 298,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.findAliases(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 301,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 302,col 7)-(line 302,col 33)",
        "(line 303,col 7)-(line 334,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.findNamespaceShadows(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 338,
      "end_line": 350,
      "comment": " Find out if there are any local shadows of namespaces. ",
      "child_ranges": [
        "(line 339,col 7)-(line 341,col 7)",
        "(line 343,col 7)-(line 343,col 33)",
        "(line 344,col 7)-(line 349,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.renameNamespaceShadows(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 357,
      "end_line": 370,
      "comment": "\n     * Rename any local shadows of namespaces.\n     * This should be a very rare occurrence, so only do this traversal\n     * if we know that we need it.\n     ",
      "child_ranges": [
        "(line 358,col 7)-(line 369,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.validateScopeCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 372,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 373,col 7)-(line 375,col 7)",
        "(line 376,col 7)-(line 378,col 7)",
        "(line 379,col 7)-(line 392,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 395,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 397,col 7)-(line 399,col 7)",
        "(line 401,col 7)-(line 403,col 7)",
        "(line 405,col 7)-(line 405,col 29)",
        "(line 406,col 7)-(line 406,col 26)",
        "(line 407,col 7)-(line 413,col 7)",
        "(line 416,col 7)-(line 436,col 7)",
        "(line 439,col 7)-(line 460,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliases.Traversal.fixTypeNode(com.google.javascript.rhino.Node)",
      "begin_line": 463,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 464,col 7)-(line 476,col 7)",
        "(line 478,col 7)-(line 481,col 7)"
      ]
    }
  ]
}