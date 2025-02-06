{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CleanupPasses.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CleanupPasses",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassConfig"
      ],
      "begin_line": 36,
      "end_line": 135,
      "comment": "\n * Provides passes that should be run before hot-swap/incremental builds.\n *\n * @author tylerg@google.com (Tyler Goodwin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CleanupPasses.CleanupPasses(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getChecks()",
      "begin_line": 44,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 52)",
        "(line 47,col 5)-(line 47,col 40)",
        "(line 48,col 5)-(line 48,col 40)",
        "(line 49,col 5)-(line 49,col 47)",
        "(line 50,col 5)-(line 50,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getIntermediateState()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getOptimizations()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "fieldCleanupPassFactory"
      ],
      "begin_line": 68,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-50b87c26-6bcc-4f69-a4d3-81884aea2750.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 11)-(line 73,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "scopeCleanupPassFactory"
      ],
      "begin_line": 77,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-9b405bcd-7df5-46d4-94c8-79853ce3f9a0.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 11)-(line 82,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "globalVarRefCleanupPassFactory"
      ],
      "begin_line": 86,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-3b5004b3-a32d-4ce7-bfdf-15d0a10d274e.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 11)-(line 91,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MemoizedScopeCleanupPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 102,
      "end_line": 134,
      "comment": "\n   * A CleanupPass implementation that will remove stored scopes from the\n   * MemoizedScopeCreator of the compiler instance for a the hot swapped script.\n   * \u003cp\u003e\n   * This pass will also clear out Source Nodes of Function Types declared on\n   * Vars tracked by MemoizedScopeCreator\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.MemoizedScopeCleanupPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 110,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 112,col 7)-(line 112,col 61)",
        "(line 113,col 7)-(line 127,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": []
    }
  ]
}