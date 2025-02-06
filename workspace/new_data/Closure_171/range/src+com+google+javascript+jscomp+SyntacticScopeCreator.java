{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/SyntacticScopeCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SyntacticScopeCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopeCreator"
      ],
      "begin_line": 32,
      "end_line": 286,
      "comment": "\n * \u003cp\u003eThe syntactic scope creator scans the parse tree to create a Scope object\n * containing all the variable declarations in that scope.\u003c/p\u003e\n *\n * \u003cp\u003eThis implementation is not thread-safe.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scope"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputId"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "redeclarationHandler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " scope, but not explicitly declared."
    },
    {
      "type": "field",
      "varNames": [
        "VAR_MULTIPLY_DECLARED_ERROR"
      ],
      "begin_line": 42,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VAR_ARGUMENTS_SHADOWED_ERROR"
      ],
      "begin_line": 47,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n   * Creates a ScopeCreator.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 29)",
        "(line 57,col 5)-(line 57,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.SyntacticScopeCreator(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 29)",
        "(line 63,col 5)-(line 63,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 66,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 19)",
        "(line 69,col 5)-(line 73,col 5)",
        "(line 75,col 5)-(line 75,col 16)",
        "(line 77,col 5)-(line 77,col 19)",
        "(line 78,col 5)-(line 78,col 32)",
        "(line 79,col 5)-(line 79,col 17)",
        "(line 80,col 5)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.scanRoot(com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 117,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.scanVars(com.google.javascript.rhino.Node)",
      "begin_line": 123,
      "end_line": 177,
      "comment": "\n   * Scans and gather variables declarations under a Node\n   ",
      "child_ranges": [
        "(line 124,col 5)-(line 165,col 5)",
        "(line 169,col 5)-(line 176,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RedeclarationHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n   * Interface for injectable duplicate handling.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.RedeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 183,
      "end_line": 184,
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
      "begin_line": 190,
      "end_line": 225,
      "comment": "\n   * The default handler for duplicate declarations.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.DefaultRedeclarationHandler.onRedeclaration(com.google.javascript.jscomp.Scope, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 191,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 194,col 7)-(line 194,col 34)",
        "(line 197,col 7)-(line 223,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.declareVar(com.google.javascript.rhino.Node)",
      "begin_line": 232,
      "end_line": 244,
      "comment": "\n   * Declares a variable.\n   *\n   * @param n The node corresponding to the variable name.\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 41)",
        "(line 235,col 5)-(line 235,col 53)",
        "(line 236,col 5)-(line 236,col 32)",
        "(line 237,col 5)-(line 243,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.hasDuplicateDeclarationSuppression(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 253,
      "end_line": 271,
      "comment": "\n   * @param n The name node to check.\n   * @param origVar The associated Var.\n   * @return Whether duplicated declarations warnings should be suppressed\n   *     for the given node.\n   ",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 41)",
        "(line 255,col 5)-(line 255,col 32)",
        "(line 256,col 5)-(line 256,col 46)",
        "(line 258,col 5)-(line 258,col 38)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 264,col 5)",
        "(line 266,col 5)-(line 266,col 43)",
        "(line 267,col 5)-(line 269,col 5)",
        "(line 270,col 5)-(line 270,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SyntacticScopeCreator.generateUntypedTopScope(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n   * Generates an untyped global scope from the root of AST of compiler (which\n   * includes externs).\n   *\n   * @param compiler The compiler for which the scope is generated.\n   * @return The new untyped global scope generated as a result of this call.\n   ",
      "child_ranges": [
        "(line 281,col 5)-(line 282,col 14)"
      ]
    }
  ]
}