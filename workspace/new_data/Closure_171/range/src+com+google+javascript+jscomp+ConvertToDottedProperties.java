{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ConvertToDottedProperties.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvertToDottedProperties",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 69,
      "comment": "\n * Converts property accesses from quoted string syntax to dot syntax, where\n * possible. Dot syntax is more compact and avoids an object allocation in\n * IE 6.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ConvertToDottedProperties.ConvertToDottedProperties(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConvertToDottedProperties.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 39,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ConvertToDottedProperties.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 67,col 5)"
      ]
    }
  ]
}