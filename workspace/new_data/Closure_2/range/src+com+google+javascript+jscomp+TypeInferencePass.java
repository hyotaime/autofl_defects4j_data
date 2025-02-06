{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/TypeInferencePass.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeInferencePass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 32,
      "end_line": 157,
      "comment": "\n * A compiler pass to run the type inference analysis.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DATAFLOW_ERROR"
      ],
      "begin_line": 34,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverseInterpreter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "topScope"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scopeCreator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assertionFunctionsMap"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.TypeInferencePass(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.type.ReverseAbstractInterpreter, com.google.javascript.jscomp.Scope, com.google.javascript.jscomp.MemoizedScopeCreator)",
      "begin_line": 44,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 29)",
        "(line 48,col 5)-(line 48,col 49)",
        "(line 49,col 5)-(line 49,col 29)",
        "(line 50,col 5)-(line 50,col 37)",
        "(line 52,col 5)-(line 52,col 46)",
        "(line 53,col 5)-(line 57,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 66,
      "end_line": 74,
      "comment": "\n   * Main entry point for type inference when running over the whole tree.\n   *\n   * @param externsRoot The root of the externs parse tree.\n   * @param jsRoot The root of the input parse tree to be checked.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 43)",
        "(line 69,col 5)-(line 69,col 51)",
        "(line 70,col 5)-(line 71,col 67)",
        "(line 73,col 5)-(line 73,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.inferAllScopes(com.google.javascript.rhino.Node)",
      "begin_line": 77,
      "end_line": 107,
      "comment": " Entry point for type inference when running over part of the tree. ",
      "child_ranges": [
        "(line 101,col 5)-(line 103,col 43)",
        "(line 104,col 5)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.inferScope(com.google.javascript.rhino.Node, com.google.javascript.jscomp.Scope)",
      "begin_line": 109,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 113,col 35)",
        "(line 114,col 5)-(line 122,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FirstScopeBuildingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback"
      ],
      "begin_line": 125,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.FirstScopeBuildingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.FirstScopeBuildingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "SecondScopeBuildingCallback",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback"
      ],
      "begin_line": 137,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.SecondScopeBuildingCallback.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 138,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.SecondScopeBuildingCallback.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.TypeInferencePass.computeCfg(com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 78)",
        "(line 154,col 5)-(line 154,col 25)",
        "(line 155,col 5)-(line 155,col 24)"
      ]
    }
  ]
}