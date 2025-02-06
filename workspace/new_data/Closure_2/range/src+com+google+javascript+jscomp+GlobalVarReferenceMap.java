{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/GlobalVarReferenceMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GlobalVarReferenceMap",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap"
      ],
      "begin_line": 42,
      "end_line": 260,
      "comment": "\n * An implementation for {@code ReferenceMap} that is specific to global scope\n * and can be used in different passes. In other words instead of relying on\n * Var object it relies on the name of the variable. It also supports hot-swap\n * update of reference map for a specific script.\n *\n * @see ReferenceCollectingCallback#exitScope(NodeTraversal)\n *\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "field",
      "varNames": [
        "refMap"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputOrder"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarReferenceMap(java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 51,
      "end_line": 62,
      "comment": "\n   * @param inputs The ordered list of all inputs for the compiler.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 35)",
        "(line 53,col 5)-(line 53,col 16)",
        "(line 54,col 5)-(line 57,col 5)",
        "(line 58,col 5)-(line 61,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 64,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 68,col 5)",
        "(line 69,col 5)-(line 69,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.resetGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e)",
      "begin_line": 78,
      "end_line": 87,
      "comment": "\n   * Resets global var reference map with the new provide map.\n   *\n   * @param globalRefMap The reference map result of a\n   *     {@link ReferenceCollectingCallback} pass collected from the whole AST.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 31)",
        "(line 81,col 5)-(line 86,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 100,
      "end_line": 119,
      "comment": "\n   * Updates the internal reference map based on the provided parameters. If\n   * {@code scriptRoot} is not SCRIPT, it basically replaces the internal map\n   * with the new one, otherwise it replaces all the information associated to\n   * the given script.\n   *\n   * @param refMapPatch The reference map result of a\n   *     {@link ReferenceCollectingCallback} pass which might be collected from\n   *     the whole AST or just a sub-tree associated to a SCRIPT node.\n   * @param root AST sub-tree root on which reference collection was done.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 105,col 5)",
        "(line 107,col 5)-(line 107,col 40)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 112,col 5)-(line 112,col 36)",
        "(line 113,col 5)-(line 118,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.removeScriptReferences(com.google.javascript.rhino.InputId)",
      "begin_line": 121,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 40)",
        "(line 124,col 5)-(line 126,col 5)",
        "(line 129,col 5)-(line 138,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.replaceReferences(java.lang.String, com.google.javascript.rhino.InputId, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 141,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 61)",
        "(line 144,col 5)-(line 144,col 55)",
        "(line 145,col 5)-(line 145,col 60)",
        "(line 146,col 5)-(line 146,col 34)",
        "(line 147,col 5)-(line 150,col 5)",
        "(line 152,col 5)-(line 153,col 15)",
        "(line 154,col 5)-(line 154,col 44)",
        "(line 155,col 5)-(line 155,col 56)",
        "(line 156,col 5)-(line 156,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.findSourceRefRange(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e, com.google.javascript.rhino.InputId)",
      "begin_line": 164,
      "end_line": 188,
      "comment": "\n   * Finds the range of references associated to {@code sourceName}. Note that\n   * even if there is no sourceName references the returned information can be\n   * used to decide where to insert new sourceName refs.\n   ",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 40)",
        "(line 170,col 5)-(line 170,col 24)",
        "(line 171,col 5)-(line 171,col 36)",
        "(line 172,col 5)-(line 172,col 18)",
        "(line 174,col 5)-(line 174,col 83)",
        "(line 175,col 5)-(line 175,col 51)",
        "(line 176,col 5)-(line 186,col 5)",
        "(line 187,col 5)-(line 187,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SourceRefRange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 190,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastBefore"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAfter"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "refList"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.SourceRefRange(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e, int, int)",
      "begin_line": 195,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 197,col 7)-(line 197,col 49)",
        "(line 198,col 7)-(line 198,col 61)",
        "(line 199,col 7)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.refsBefore()",
      "begin_line": 203,
      "end_line": 205,
      "comment": " Note that the returned list is backed by {@code refList}! ",
      "child_ranges": [
        "(line 204,col 7)-(line 204,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.refsAfter()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " Note that the returned list is backed by {@code refList}! ",
      "child_ranges": [
        "(line 209,col 7)-(line 209,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.updateReferencesWithGlobalScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 217,
      "end_line": 230,
      "comment": "\n   * @param globalScope a new Global Scope to replace the scope of references\n   *        with.\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 229,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalVarRefCleanupPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 239,
      "end_line": 259,
      "comment": "\n   * A CleanupPass implementation that will replace references to old Syntactic\n   * Global Scopes generated in previous compile runs with references to the\n   * Global Typed Scope.\n   *\n   * @author tylerg@google.com (Tyler Goodwin)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.GlobalVarRefCleanupPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 7)-(line 244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 249,col 7)-(line 249,col 71)",
        "(line 250,col 7)-(line 252,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": []
    }
  ]
}