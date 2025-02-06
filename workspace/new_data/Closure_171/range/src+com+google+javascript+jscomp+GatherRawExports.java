{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GatherRawExports.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GatherRawExports",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 32,
      "end_line": 83,
      "comment": "\n * External references of the form: \"window[\u0027xx\u0027]\" indicate names that must\n * be reserved when variable renaming to avoid conflicts.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_THIS_NAMES"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportedVariables"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherRawExports.GatherRawExports(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 74)",
        "(line 48,col 5)-(line 48,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 31)",
        "(line 54,col 5)-(line 62,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.isGlobalThisObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 65,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 76,col 5)",
        "(line 77,col 5)-(line 77,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.getExportedVariableNames()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 29)"
      ]
    }
  ]
}