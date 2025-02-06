{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RescopeGlobalSymbols.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RescopeGlobalSymbols",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 50,
      "end_line": 404,
      "comment": "\n * Finds all references to global symbols and rewrites them to be property\n * accesses to a special object with the same name as the global symbol.\n *\n * Given the name of the global object is NS\n * \u003cpre\u003e var a \u003d 1; function b() { return a }\u003c/pre\u003e\n * becomes\n * \u003cpre\u003e NS.a \u003d 1; NS.b \u003d function b() { return NS.a }\u003c/pre\u003e\n *\n * This allows splitting code into modules that depend on each other\u0027s\n * global symbols, without using polluting JavaScript\u0027s global scope with those\n * symbols.\n *\n * \u003cp\u003eThis compile step requires moveFunctionDeclarations to be turned on\n * to guarantee semantics.\n *\n * \u003cp\u003eFor lots of examples, see the unit test.\n *\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DISAMBIGUATION_SUFFIX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Appended to variables names that conflict with globalSymbolNamespace."
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPECIAL_EXTERNS"
      ],
      "begin_line": 55,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalSymbolNamespace"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addExtern"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crossModuleNames"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeCrossModuleNames"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 29)",
        "(line 73,col 5)-(line 73,col 55)",
        "(line 74,col 5)-(line 74,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.isCrossModuleName(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.addExternForGlobalSymbolNamespace()",
      "begin_line": 86,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 58)",
        "(line 88,col 5)-(line 89,col 46)",
        "(line 90,col 5)-(line 90,col 58)",
        "(line 91,col 5)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 94,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 99,col 5)",
        "(line 105,col 5)-(line 106,col 71)",
        "(line 109,col 5)-(line 109,col 79)",
        "(line 111,col 5)-(line 111,col 71)",
        "(line 114,col 5)-(line 114,col 74)",
        "(line 118,col 5)-(line 119,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteGlobalFunctionStatementsToVarAssignmentsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 132,
      "end_line": 150,
      "comment": "\n   * Rewrites function statements to var statements + assignment.\n   *\n   * \u003cpre\u003efunction test(){}\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003evar test \u003d function (){}\u003c/pre\u003e\n   *\n   * After this traversal, the special case of global function statements\n   * can be ignored.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteGlobalFunctionStatementsToVarAssignmentsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 134,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 148,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindCrossModuleNamesCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 156,
      "end_line": 184,
      "comment": "\n   * Find all global names that are used in more than one module. The following\n   * compiler transformations can ignore the globals that are not.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.FindCrossModuleNamesCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 158,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 160,col 7)-(line 182,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteScopeCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 206,
      "end_line": 299,
      "comment": "\n   * Visits each NAME token and checks whether it refers to a global variable.\n   * If yes, rewrites the name to be a property access on the\n   * \"globalSymbolNamespace\".\n   *\n   * \u003cpre\u003evar a \u003d 1, b \u003d 2, c \u003d 3;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003evar NS.a \u003d 1, NS.b \u003d 2, NS.c \u003d 4\u003c/pre\u003e\n   * (The var token is removed in a later traversal.)\n   *\n   * \u003cpre\u003ea + b\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a + NS.b\u003c/pre\u003e\n   *\n   * \u003cpre\u003ea()\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003e(0,NS.a)()\u003c/pre\u003e\n   * Notice the special syntax here to preserve the *this* semantics in the\n   * function call.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteScopeCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 207,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 209,col 7)-(line 211,col 7)",
        "(line 212,col 7)-(line 212,col 34)",
        "(line 214,col 7)-(line 216,col 7)",
        "(line 217,col 7)-(line 217,col 48)",
        "(line 218,col 7)-(line 220,col 7)",
        "(line 222,col 7)-(line 224,col 7)",
        "(line 229,col 7)-(line 234,col 7)",
        "(line 236,col 7)-(line 238,col 7)",
        "(line 239,col 7)-(line 239,col 40)",
        "(line 241,col 7)-(line 244,col 7)",
        "(line 245,col 7)-(line 245,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteScopeCallback.replaceSymbol(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.CompilerInput)",
      "begin_line": 248,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 37)",
        "(line 250,col 7)-(line 250,col 54)",
        "(line 251,col 7)-(line 271,col 7)",
        "(line 272,col 7)-(line 276,col 39)",
        "(line 277,col 7)-(line 277,col 31)",
        "(line 278,col 7)-(line 285,col 7)",
        "(line 293,col 7)-(line 296,col 7)",
        "(line 297,col 7)-(line 297,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveGlobalVarCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 317,
      "end_line": 374,
      "comment": "\n   * Removes every occurrence of var that declares a global variable.\n   *\n   * \u003cpre\u003evar NS.a \u003d 1, NS.b \u003d 2;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a \u003d 1; NS.b \u003d 2;\u003c/pre\u003e\n   *\n   * \u003cpre\u003efor (var a \u003d 0, b \u003d 0;;)\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003efor (NS.a \u003d 0, NS.b \u003d 0;;)\u003c/pre\u003e\n   *\n   * Declarations without assignments are optimized away:\n   * \u003cpre\u003evar a \u003d 1, b;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a \u003d 1\u003c/pre\u003e\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RemoveGlobalVarCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 319,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 321,col 7)-(line 323,col 7)",
        "(line 325,col 7)-(line 325,col 48)",
        "(line 326,col 7)-(line 326,col 61)",
        "(line 331,col 7)-(line 331,col 29)",
        "(line 332,col 7)-(line 340,col 7)",
        "(line 344,col 7)-(line 346,col 7)",
        "(line 347,col 7)-(line 355,col 7)",
        "(line 356,col 7)-(line 359,col 7)",
        "(line 361,col 7)-(line 361,col 28)",
        "(line 362,col 7)-(line 362,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RemoveGlobalVarCallback.joinOnComma(java.util.List\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 365,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 366,col 7)-(line 366,col 33)",
        "(line 367,col 7)-(line 371,col 7)",
        "(line 372,col 7)-(line 372,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MakeExternsReferenceWindowExplicitly",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 382,
      "end_line": 403,
      "comment": "\n   * Rewrites extern names to be explicit children of window instead of only\n   * implicitly referencing it.\n   * This enables injecting window into a scope and make all global symbol\n   * depend on the injected object.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.MakeExternsReferenceWindowExplicitly.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 385,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 387,col 7)-(line 389,col 7)",
        "(line 390,col 7)-(line 390,col 34)",
        "(line 391,col 7)-(line 394,col 7)",
        "(line 395,col 7)-(line 395,col 48)",
        "(line 396,col 7)-(line 400,col 7)"
      ]
    }
  ]
}