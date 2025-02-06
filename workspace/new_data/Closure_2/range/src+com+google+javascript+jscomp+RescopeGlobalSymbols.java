{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RescopeGlobalSymbols.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RescopeGlobalSymbols",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 47,
      "end_line": 302,
      "comment": "\n * Finds all references to global symbols and rewrites them to be property\n * accesses to a special object with the same name as the global symbol.\n *\n * Given the name of the global object is NS\n * \u003cpre\u003e var a \u003d 1; function b() { return a }\u003c/pre\u003e\n * becomes\n * \u003cpre\u003e NS.a \u003d 1; NS.b \u003d function b() { return NS.a }\u003c/pre\u003e\n *\n * This allows splitting code into modules that depend on each other\u0027s\n * global symbols, without using polluting JavaScript\u0027s global scope with those\n * symbols.\n *\n * \u003cp\u003eThis compile step requires moveFunctionDeclarations to be turned on\n * to guarantee semantics.\n *\n * \u003cp\u003eFor lots of examples, see the unit test.\n *\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DISAMBIGUATION_SUFFIX"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Appended to variables names that conflict with globalSymbolNamespace."
    },
    {
      "type": "field",
      "varNames": [
        "WINDOW"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SPECIAL_EXTERNS"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalSymbolNamespace"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addExtern"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, boolean)",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 29)",
        "(line 62,col 5)-(line 62,col 55)",
        "(line 63,col 5)-(line 63,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RescopeGlobalSymbols(com.google.javascript.jscomp.AbstractCompiler, java.lang.String)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.addExternForGlobalSymbolNamespace()",
      "begin_line": 71,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 58)",
        "(line 73,col 5)-(line 74,col 46)",
        "(line 75,col 5)-(line 75,col 58)",
        "(line 76,col 5)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 79,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 84,col 5)",
        "(line 90,col 5)-(line 91,col 71)",
        "(line 93,col 5)-(line 93,col 71)",
        "(line 95,col 5)-(line 95,col 74)",
        "(line 99,col 5)-(line 100,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteGlobalFunctionStatementsToVarAssignmentsCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 113,
      "end_line": 131,
      "comment": "\n   * Rewrites function statements to var statements + assignment.\n   *\n   * \u003cpre\u003efunction test(){}\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003evar test \u003d function (){}\u003c/pre\u003e\n   *\n   * After this traversal, the special case of global function statements\n   * can be ignored.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteGlobalFunctionStatementsToVarAssignmentsCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 115,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 129,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RewriteScopeCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 153,
      "end_line": 210,
      "comment": "\n   * Visits each NAME token and checks whether it refers to a global variable.\n   * If yes, rewrites the name to be a property access on the\n   * \"globalSymbolNamespace\".\n   *\n   * \u003cpre\u003evar a \u003d 1, b \u003d 2, c \u003d 3;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003evar NS.a \u003d 1, NS.b \u003d 2, NS.c \u003d 4\u003c/pre\u003e\n   * (The var token is removed in a later traversal.)\n   *\n   * \u003cpre\u003ea + b\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a + NS.b\u003c/pre\u003e\n   *\n   * \u003cpre\u003ea()\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003e(0,NS.a)()\u003c/pre\u003e\n   * Notice the special syntax here to preserve the *this* semantics in the\n   * function call.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteScopeCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 154,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 156,col 7)-(line 158,col 7)",
        "(line 159,col 7)-(line 159,col 34)",
        "(line 161,col 7)-(line 163,col 7)",
        "(line 164,col 7)-(line 164,col 48)",
        "(line 165,col 7)-(line 167,col 7)",
        "(line 169,col 7)-(line 171,col 7)",
        "(line 176,col 7)-(line 180,col 7)",
        "(line 182,col 7)-(line 184,col 7)",
        "(line 185,col 7)-(line 185,col 40)",
        "(line 187,col 7)-(line 190,col 7)",
        "(line 191,col 7)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RewriteScopeCallback.replaceSymbol(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 194,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 195,col 7)-(line 195,col 37)",
        "(line 196,col 7)-(line 198,col 40)",
        "(line 199,col 7)-(line 199,col 31)",
        "(line 200,col 7)-(line 207,col 7)",
        "(line 208,col 7)-(line 208,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RemoveGlobalVarCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback"
      ],
      "begin_line": 228,
      "end_line": 274,
      "comment": "\n   * Removes every occurrence of var that declares a global variable.\n   *\n   * \u003cpre\u003evar NS.a \u003d 1, NS.b \u003d 2;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a \u003d 1; NS.b \u003d 2;\u003c/pre\u003e\n   *\n   * \u003cpre\u003efor (var a \u003d 0, b \u003d 0;;)\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003efor (NS.a \u003d 0, NS.b \u003d 0;;)\u003c/pre\u003e\n   *\n   * Declarations without assignments are optimized away:\n   * \u003cpre\u003evar a \u003d 1, b;\u003c/pre\u003e\n   * becomes\n   * \u003cpre\u003eNS.a \u003d 1\u003c/pre\u003e\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RemoveGlobalVarCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 232,col 7)-(line 234,col 7)",
        "(line 235,col 7)-(line 235,col 48)",
        "(line 236,col 7)-(line 236,col 61)",
        "(line 241,col 7)-(line 246,col 7)",
        "(line 247,col 7)-(line 255,col 7)",
        "(line 256,col 7)-(line 259,col 7)",
        "(line 261,col 7)-(line 261,col 28)",
        "(line 262,col 7)-(line 262,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.RemoveGlobalVarCallback.joinOnComma(java.util.List\u003ccom.google.javascript.rhino.Node\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 265,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 266,col 7)-(line 266,col 33)",
        "(line 267,col 7)-(line 271,col 7)",
        "(line 272,col 7)-(line 272,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MakeExternsReferenceWindowExplicitly",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 282,
      "end_line": 301,
      "comment": "\n   * Rewrites extern names to be explicit children of window instead of only\n   * implicitly referencing it.\n   * This enables injecting window into a scope and make all global symbol\n   * depend on the injected object.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RescopeGlobalSymbols.MakeExternsReferenceWindowExplicitly.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 285,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 289,col 7)",
        "(line 290,col 7)-(line 290,col 34)",
        "(line 291,col 7)-(line 291,col 48)",
        "(line 292,col 7)-(line 298,col 7)"
      ]
    }
  ]
}