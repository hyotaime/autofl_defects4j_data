{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CleanupPasses.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CleanupPasses",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.PassConfig"
      ],
      "begin_line": 35,
      "end_line": 134,
      "comment": "\n * Provides passes that should be run before hot-swap/incremental builds.\n *\n * @author tylerg@google.com (Tyler Goodwin)\n "
    },
    {
      "type": "field",
      "varNames": [
        "state"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CleanupPasses.CleanupPasses(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getChecks()",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 52)",
        "(line 46,col 5)-(line 46,col 40)",
        "(line 47,col 5)-(line 47,col 40)",
        "(line 48,col 5)-(line 48,col 47)",
        "(line 49,col 5)-(line 49,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getIntermediateState()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.getOptimizations()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.setIntermediateState(com.google.javascript.jscomp.PassConfig.State)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "fieldCleanupPassFactory"
      ],
      "begin_line": 67,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-548180c3-3b9d-4526-b6f1-71d7d2230b4f.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 11)-(line 72,col 48)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "scopeCleanupPassFactory"
      ],
      "begin_line": 76,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-2996d283-630c-4492-ae43-bcb410785efd.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 11)-(line 81,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "globalVarRefCleanupPassFactory"
      ],
      "begin_line": 85,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.Anonymous-b3e42dc1-07dd-41bf-921a-e3bc43ef94b7.create(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 11)-(line 90,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MemoizedScopeCleanupPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 101,
      "end_line": 133,
      "comment": "\n   * A CleanupPass implementation that will remove stored scopes from the\n   * MemoizedScopeCreator of the compiler instance for a the hot swapped script.\n   * \u003cp\u003e\n   * This pass will also clear out Source Nodes of Function Types declared on\n   * Vars tracked by MemoizedScopeCreator\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.MemoizedScopeCleanupPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 7)-(line 106,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 111,col 7)-(line 111,col 61)",
        "(line 112,col 7)-(line 126,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CleanupPasses.MemoizedScopeCleanupPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": []
    }
  ]
}