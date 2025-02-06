{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MemoizedScopeCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MemoizedScopeCreator",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ScopeCreator",
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.Scope.Var\u003e"
      ],
      "begin_line": 46,
      "end_line": 110,
      "comment": "\n * Memoize a scope creator.\n *\n * This allows you to make multiple passes, without worrying about\n * the expense of generating Scope objects over and over again.\n *\n * On the other hand, you also have to be more aware of what your passes\n * are doing. Scopes are memoized stupidly, so if the underlying tree\n * changes, the scope may be out of sync.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "scopes"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "delegate"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.MemoizedScopeCreator(com.google.javascript.jscomp.ScopeCreator)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n   * @param delegate The real source of Scope objects.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.getScope(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.getAllSymbols()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 42)",
        "(line 72,col 5)-(line 74,col 5)",
        "(line 75,col 5)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.createScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 32)",
        "(line 81,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 87,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.getAllMemoizedScopes()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.getScopeIfMemoized(com.google.javascript.rhino.Node)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MemoizedScopeCreator.removeScopesForScript(java.lang.String)",
      "begin_line": 103,
      "end_line": 109,
      "comment": "\n   * Removes all scopes with root nodes from a given script file.\n   *\n   * @param scriptName the name of the script file to remove nodes for.\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 108,col 5)"
      ]
    }
  ]
}