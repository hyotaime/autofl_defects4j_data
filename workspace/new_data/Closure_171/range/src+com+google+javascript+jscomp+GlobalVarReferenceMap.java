{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GlobalVarReferenceMap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GlobalVarReferenceMap",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap"
      ],
      "begin_line": 43,
      "end_line": 261,
      "comment": "\n * An implementation for {@code ReferenceMap} that is specific to global scope\n * and can be used in different passes. In other words instead of relying on\n * Var object it relies on the name of the variable. It also supports hot-swap\n * update of reference map for a specific script.\n *\n * @see ReferenceCollectingCallback#exitScope(NodeTraversal)\n *\n * @author bashir@google.com (Bashir Sadjad)\n "
    },
    {
      "type": "field",
      "varNames": [
        "refMap"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputOrder"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarReferenceMap(java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 52,
      "end_line": 63,
      "comment": "\n   * @param inputs The ordered list of all inputs for the compiler.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 35)",
        "(line 54,col 5)-(line 54,col 16)",
        "(line 55,col 5)-(line 58,col 5)",
        "(line 59,col 5)-(line 62,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.getReferences(com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 65,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 69,col 5)",
        "(line 70,col 5)-(line 70,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.resetGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e)",
      "begin_line": 79,
      "end_line": 88,
      "comment": "\n   * Resets global var reference map with the new provide map.\n   *\n   * @param globalRefMap The reference map result of a\n   *     {@link ReferenceCollectingCallback} pass collected from the whole AST.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 31)",
        "(line 82,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.updateGlobalVarReferences(java.util.Map\u003ccom.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection\u003e, com.google.javascript.rhino.Node)",
      "begin_line": 101,
      "end_line": 120,
      "comment": "\n   * Updates the internal reference map based on the provided parameters. If\n   * {@code scriptRoot} is not SCRIPT, it basically replaces the internal map\n   * with the new one, otherwise it replaces all the information associated to\n   * the given script.\n   *\n   * @param refMapPatch The reference map result of a\n   *     {@link ReferenceCollectingCallback} pass which might be collected from\n   *     the whole AST or just a sub-tree associated to a SCRIPT node.\n   * @param root AST sub-tree root on which reference collection was done.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 106,col 5)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 109,col 5)-(line 109,col 40)",
        "(line 113,col 5)-(line 113,col 36)",
        "(line 114,col 5)-(line 119,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.removeScriptReferences(com.google.javascript.rhino.InputId)",
      "begin_line": 122,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 40)",
        "(line 125,col 5)-(line 127,col 5)",
        "(line 130,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.replaceReferences(java.lang.String, com.google.javascript.rhino.InputId, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection)",
      "begin_line": 142,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 61)",
        "(line 145,col 5)-(line 145,col 55)",
        "(line 146,col 5)-(line 146,col 60)",
        "(line 147,col 5)-(line 147,col 34)",
        "(line 148,col 5)-(line 151,col 5)",
        "(line 153,col 5)-(line 154,col 15)",
        "(line 155,col 5)-(line 155,col 44)",
        "(line 156,col 5)-(line 156,col 56)",
        "(line 157,col 5)-(line 157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.findSourceRefRange(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e, com.google.javascript.rhino.InputId)",
      "begin_line": 165,
      "end_line": 189,
      "comment": "\n   * Finds the range of references associated to {@code sourceName}. Note that\n   * even if there is no sourceName references the returned information can be\n   * used to decide where to insert new sourceName refs.\n   ",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 40)",
        "(line 171,col 5)-(line 171,col 24)",
        "(line 172,col 5)-(line 172,col 36)",
        "(line 173,col 5)-(line 173,col 18)",
        "(line 175,col 5)-(line 175,col 83)",
        "(line 176,col 5)-(line 176,col 51)",
        "(line 177,col 5)-(line 187,col 5)",
        "(line 188,col 5)-(line 188,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SourceRefRange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 191,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastBefore"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAfter"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "refList"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.SourceRefRange(java.util.List\u003ccom.google.javascript.jscomp.ReferenceCollectingCallback.Reference\u003e, int, int)",
      "begin_line": 196,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 198,col 7)-(line 198,col 49)",
        "(line 199,col 7)-(line 199,col 61)",
        "(line 200,col 7)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.refsBefore()",
      "begin_line": 204,
      "end_line": 206,
      "comment": " Note that the returned list is backed by {@code refList}! ",
      "child_ranges": [
        "(line 205,col 7)-(line 205,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange.refsAfter()",
      "begin_line": 209,
      "end_line": 211,
      "comment": " Note that the returned list is backed by {@code refList}! ",
      "child_ranges": [
        "(line 210,col 7)-(line 210,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.updateReferencesWithGlobalScope(com.google.javascript.jscomp.Scope)",
      "begin_line": 218,
      "end_line": 231,
      "comment": "\n   * @param globalScope a new Global Scope to replace the scope of references\n   *        with.\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 230,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GlobalVarRefCleanupPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 240,
      "end_line": 260,
      "comment": "\n   * A CleanupPass implementation that will replace references to old Syntactic\n   * Global Scopes generated in previous compile runs with references to the\n   * Global Typed Scope.\n   *\n   * @author tylerg@google.com (Tyler Goodwin)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.GlobalVarRefCleanupPass(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 71)",
        "(line 251,col 7)-(line 253,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GlobalVarReferenceMap.GlobalVarRefCleanupPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "",
      "child_ranges": []
    }
  ]
}