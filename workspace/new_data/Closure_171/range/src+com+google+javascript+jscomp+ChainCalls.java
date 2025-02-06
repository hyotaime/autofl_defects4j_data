{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ChainCalls.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChainCalls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 35,
      "end_line": 192,
      "comment": "\n * Chain calls to functions that return this.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "badFunctionNodes"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "goodFunctionNodes"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callSites"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defFinder"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "gatherFunctions"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ChainCalls.ChainCalls(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 47,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 53)",
        "(line 50,col 5)-(line 50,col 37)",
        "(line 52,col 5)-(line 52,col 66)",
        "(line 54,col 5)-(line 60,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "GatherFunctions",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 66,
      "end_line": 97,
      "comment": "\n   * Determines whether a function always returns this.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.GatherFunctions.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 67,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 59)",
        "(line 71,col 7)-(line 79,col 7)",
        "(line 81,col 7)-(line 81,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.GatherFunctions.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.GatherFunctions.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 7)-(line 91,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.GatherFunctions.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "GatherCallSites",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 99,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ChainCalls.GatherCallSites.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 104,
      "end_line": 172,
      "comment": "\n     * If the function call returns this and the next statement has the same\n     * target expression, record the call site.\n     ",
      "child_ranges": [
        "(line 106,col 7)-(line 108,col 7)",
        "(line 110,col 7)-(line 110,col 40)",
        "(line 111,col 7)-(line 113,col 7)",
        "(line 115,col 7)-(line 115,col 50)",
        "(line 116,col 7)-(line 118,col 7)",
        "(line 120,col 7)-(line 120,col 63)",
        "(line 122,col 7)-(line 123,col 60)",
        "(line 124,col 7)-(line 126,col 7)",
        "(line 127,col 7)-(line 141,col 7)",
        "(line 143,col 7)-(line 143,col 34)",
        "(line 144,col 7)-(line 146,col 7)",
        "(line 148,col 7)-(line 148,col 51)",
        "(line 149,col 7)-(line 151,col 7)",
        "(line 153,col 7)-(line 153,col 58)",
        "(line 154,col 7)-(line 156,col 7)",
        "(line 158,col 7)-(line 158,col 71)",
        "(line 159,col 7)-(line 162,col 7)",
        "(line 164,col 7)-(line 166,col 7)",
        "(line 170,col 7)-(line 171,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CallSite",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 176,
      "end_line": 191,
      "comment": " Records a call site to chain. "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callNode"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextGetPropNode"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextGetPropFirstChildNode"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ChainCalls.CallSite.CallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 27)",
        "(line 186,col 7)-(line 186,col 17)",
        "(line 187,col 7)-(line 187,col 31)",
        "(line 188,col 7)-(line 188,col 45)",
        "(line 189,col 7)-(line 189,col 65)"
      ]
    }
  ]
}