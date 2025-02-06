{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ShadowVariables.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShadowVariables",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 53,
      "end_line": 296,
      "comment": "\n * Tries to compute a list of variables that can shadow a variable in the\n * outer scope.\n *\n * For example:\n *\n * \u003ccode\u003e\n * var a \u003d function() {\n *   var b \u003d getB();\n *   b();\n *   return function(y) {};\n * };\n * \u003c/code\u003e\n *\n * Normally, b would be mapped to variable L0, y would be L1.\n *\n * Instead we are going to make y shadows L0 in hope of using less variables\n * and reusing frequently used local names.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "scopeUpRefMap"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Make sure of scope memorization to minimize scope creation cost."
    },
    {
      "type": "field",
      "varNames": [
        "varToNameUsage"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " in any scope."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varsByFrequency"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " All the information used for renaming."
    },
    {
      "type": "field",
      "varNames": [
        "assignments"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oldPseudoNameMap"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deltaPseudoNameMap"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ShadowVariables.ShadowVariables(com.google.javascript.jscomp.AbstractCompiler, java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.RenameVars.Assignment\u003e, java.util.SortedSet\u003ccom.google.javascript.jscomp.RenameVars.Assignment\u003e, java.util.Map\u003ccom.google.javascript.rhino.Node, java.lang.String\u003e)",
      "begin_line": 96,
      "end_line": 106,
      "comment": "\n   * @param assignments Map of old variable names to its assignment Objects.\n   * @param varsByFrequency Sorted variable assignments by Frequency.\n   * @param pseudoNameMap The current pseudo name map so this pass can update\n   *     it accordingly.\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 29)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 43)",
        "(line 104,col 5)-(line 104,col 42)",
        "(line 105,col 5)-(line 105,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 108,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 70)",
        "(line 120,col 5)-(line 120,col 68)",
        "(line 122,col 5)-(line 124,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherReferenceInfo",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 127,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.GatherReferenceInfo.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 128,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 133,col 7)",
        "(line 139,col 7)-(line 141,col 7)",
        "(line 143,col 7)-(line 143,col 51)",
        "(line 144,col 7)-(line 147,col 7)",
        "(line 149,col 7)-(line 152,col 7)",
        "(line 155,col 7)-(line 160,col 7)",
        "(line 162,col 7)-(line 164,col 7)",
        "(line 167,col 7)-(line 167,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoShadowVariables",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 171,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.DoShadowVariables.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 174,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 176,col 7)-(line 176,col 29)",
        "(line 177,col 7)-(line 179,col 7)",
        "(line 183,col 7)-(line 185,col 7)",
        "(line 187,col 7)-(line 224,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.DoShadowVariables.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 227,
      "end_line": 228,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.DoShadowVariables.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 231,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.DoShadowVariables.findBestShadow(com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 237,
      "end_line": 250,
      "comment": "\n     * @returns An assignment that can be used as a shadow for a local variable\n     *     in the scope defined by curScopeRoot.\n     ",
      "child_ranges": [
        "(line 239,col 7)-(line 248,col 7)",
        "(line 249,col 7)-(line 249,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables.DoShadowVariables.doShadow(com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.RenameVars.Assignment, com.google.javascript.jscomp.Scope.Var)",
      "begin_line": 252,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 253,col 7)-(line 253,col 31)",
        "(line 256,col 7)-(line 256,col 60)",
        "(line 260,col 7)-(line 260,col 39)",
        "(line 261,col 7)-(line 261,col 39)",
        "(line 264,col 7)-(line 264,col 42)",
        "(line 265,col 7)-(line 265,col 42)",
        "(line 268,col 7)-(line 268,col 36)",
        "(line 269,col 7)-(line 269,col 36)",
        "(line 275,col 7)-(line 275,col 48)",
        "(line 276,col 7)-(line 281,col 7)",
        "(line 284,col 7)-(line 293,col 7)"
      ]
    }
  ]
}