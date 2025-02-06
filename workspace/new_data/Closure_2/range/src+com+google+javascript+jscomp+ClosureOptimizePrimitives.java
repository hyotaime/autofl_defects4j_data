{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ClosureOptimizePrimitives.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClosureOptimizePrimitives",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 34,
      "end_line": 123,
      "comment": "\n * \u003cp\u003eCompiler pass that converts all calls to:\n *   goog.object.create(key1, val1, key2, val2, ...) where all of the keys\n *   are literals into object literals.\u003c/p\u003e\n *\n * @author agrieve@google.com (Andrew Grieve)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Reference to the JS compiler "
    },
    {
      "type": "class_interface",
      "name": "FindObjectCreateCalls",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 42,
      "end_line": 55,
      "comment": "\n   * Identifies all calls to goog.object.create.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "callNodes"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureOptimizePrimitives.FindObjectCreateCalls.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 47,col 7)-(line 53,col 7)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ClosureOptimizePrimitives.ClosureOptimizePrimitives(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n   * @param compiler The AbstractCompiler\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureOptimizePrimitives.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 61)",
        "(line 67,col 5)-(line 67,col 49)",
        "(line 68,col 5)-(line 68,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureOptimizePrimitives.processObjectCreateCalls(java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 75,
      "end_line": 100,
      "comment": "\n   * Converts all of the given call nodes to object literals that are safe to\n   * do so.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ClosureOptimizePrimitives.canOptimizeObjectCreate(com.google.javascript.rhino.Node)",
      "begin_line": 106,
      "end_line": 122,
      "comment": "\n   * Returns whether the given call to goog.object.create can be converted to an\n   * object literal.\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 31)",
        "(line 108,col 5)-(line 120,col 5)",
        "(line 121,col 5)-(line 121,col 16)"
      ]
    }
  ]
}