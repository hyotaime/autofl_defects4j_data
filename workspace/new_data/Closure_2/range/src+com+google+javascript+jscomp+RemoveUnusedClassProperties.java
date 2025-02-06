{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RemoveUnusedClassProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RemoveUnusedClassProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 38,
      "end_line": 146,
      "comment": "\n * Look for internal properties set using \"this\" but never read.  Explicitly\n * ignored is the possibility that these properties\n * may be indirectly referenced using \"for-in\" or \"Object.keys\".  This is the\n * same assumption used with RemoveUnusedPrototypeProperties but is by slightly\n * wider in scope.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inExterns"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "candidates"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.RemoveUnusedClassProperties(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 63)",
        "(line 52,col 5)-(line 52,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.removeUnused()",
      "begin_line": 55,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 75,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 82,col 5)",
        "(line 83,col 5)-(line 83,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 86,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 88,col 6)-(line 115,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RemoveUnusedClassProperties.isPinningPropertyUse(com.google.javascript.rhino.Node)",
      "begin_line": 121,
      "end_line": 145,
      "comment": "\n   * @return Whether the property is used in a way that prevents its removal.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 32)",
        "(line 129,col 5)-(line 143,col 5)",
        "(line 144,col 5)-(line 144,col 16)"
      ]
    }
  ]
}