{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/MarkNoSideEffectCalls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MarkNoSideEffectCalls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 40,
      "end_line": 202,
      "comment": "\n * Set the NoSideEffects property for function and constructor calls\n * that refer to functions that are known to have no side effects.\n * Current implementation relies on @nosideeffects annotations at\n * function definition sites; eventually we should traverse function\n * bodies to determine if they have side effects.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_NO_SIDE_EFFECT_ANNOTATION"
      ],
      "begin_line": 41,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noSideEffectFunctionNames"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " has a @nosideeffects annotation."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.MarkNoSideEffectCalls(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 29)",
        "(line 54,col 5)-(line 54,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 76)",
        "(line 60,col 5)-(line 60,col 37)",
        "(line 64,col 5)-(line 65,col 66)",
        "(line 66,col 5)-(line 67,col 64)",
        "(line 69,col 5)-(line 70,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.definitionTypeContainsFunctionType(com.google.javascript.jscomp.DefinitionsRemover.Definition)",
      "begin_line": 77,
      "end_line": 98,
      "comment": "\n   * Determines if the type of the value of the RHS expression can\n   * be a function node.\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 31)",
        "(line 79,col 5)-(line 81,col 5)",
        "(line 83,col 5)-(line 97,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.hasNoSideEffectsAnnotation(com.google.javascript.rhino.Node)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n   * Get the value of the @nosideeffects annotation stored in the\n   * doc info.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 44)",
        "(line 106,col 5)-(line 106,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherNoSideEffectFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 112,
      "end_line": 160,
      "comment": "\n   * Gather function nodes that have @nosideeffects annotations.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.GatherNoSideEffectFunctions.GatherNoSideEffectFunctions(boolean)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 7)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.GatherNoSideEffectFunctions.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 119,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 121,col 7)-(line 123,col 7)",
        "(line 125,col 7)-(line 158,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetNoSideEffectCallProperty",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 166,
      "end_line": 201,
      "comment": "\n   * Set the no side effects property for CALL and NEW nodes that\n   * refer to function names that are known to have no side effects.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "defFinder"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.SetNoSideEffectCallProperty.SetNoSideEffectCallProperty(com.google.javascript.jscomp.SimpleDefinitionFinder)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 170,col 7)-(line 170,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.MarkNoSideEffectCalls.SetNoSideEffectCallProperty.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 173,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 175,col 7)-(line 177,col 7)",
        "(line 179,col 7)-(line 180,col 69)",
        "(line 181,col 7)-(line 183,col 7)",
        "(line 185,col 7)-(line 185,col 36)",
        "(line 186,col 7)-(line 195,col 7)",
        "(line 197,col 7)-(line 199,col 7)"
      ]
    }
  ]
}