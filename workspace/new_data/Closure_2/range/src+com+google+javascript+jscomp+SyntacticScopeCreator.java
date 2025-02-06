{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SyntacticScopeCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SyntacticScopeCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopeCreator"
      ],
      "begin_line": 33,
      "end_line": 287,
      "comment": "\n * \u003cp\u003eThe syntactic scope creator scans the parse tree to create a Scope object\n * containing all the variable declarations in that scope.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is not thread-safe.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "redeclarationHandler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " scope, but not explicitly declared."
    },
    {
      "type": "field",
      "varNames": [
        "VAR_MULTIPLY_DECLARED_ERROR"
      ],
      "begin_line": 43,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_ARGUMENTS_SHADOWED_ERROR"
      ],
      "begin_line": 48,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n   * Creates a ScopeCreator.\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 29)",
        "(line 58,col 5)-(line 58,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 29)",
        "(line 64,col 5)-(line 64,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 67,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 19)",
        "(line 70,col 5)-(line 74,col 5)",
        "(line 76,col 5)-(line 76,col 24)",
        "(line 78,col 5)-(line 78,col 19)",
        "(line 79,col 5)-(line 79,col 32)",
        "(line 80,col 5)-(line 80,col 17)",
        "(line 81,col 5)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 84,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 124,
      "end_line": 178,
      "comment": "\n   * Scans and gather variables declarations under a Node\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 166,col 5)",
        "(line 170,col 5)-(line 177,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RedeclarationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n   * Interface for injectable duplicate handling.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 184,
      "end_line": 185,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DefaultRedeclarationHandler",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler"
      ],
      "begin_line": 191,
      "end_line": 226,
      "comment": "\n   * The default handler for duplicate declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.DefaultRedeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 192,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 34)",
        "(line 198,col 7)-(line 224,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 245,
      "comment": "\n   * Declares a variable.\n   *\n   * @param n The node corresponding to the variable name.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 41)",
        "(line 236,col 5)-(line 236,col 53)",
        "(line 237,col 5)-(line 237,col 32)",
        "(line 238,col 5)-(line 244,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.hasDuplicateDeclarationSuppression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 254,
      "end_line": 272,
      "comment": "\n   * @param n The name node to check.\n   * @param origVar The associated Var.\n   * @return Whether duplicated declarations warnings should be suppressed\n   *     for the given node.\n   ",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 41)",
        "(line 256,col 5)-(line 256,col 32)",
        "(line 257,col 5)-(line 257,col 46)",
        "(line 259,col 5)-(line 259,col 38)",
        "(line 260,col 5)-(line 262,col 5)",
        "(line 263,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 267,col 43)",
        "(line 268,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.generateUntypedTopScope(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\n   * Generates an untyped global scope from the root of AST of compiler (which\n   * includes externs).\n   *\n   * @param compiler The compiler for which the scope is generated.\n   * @return The new untyped global scope generated as a result of this call.\n   ",
      "child_ranges": [
        "(line 282,col 5)-(line 283,col 14)"
      ]
    }
  ]
}