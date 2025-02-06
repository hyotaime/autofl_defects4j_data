{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/GatherRawExports.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GatherRawExports",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 31,
      "end_line": 82,
      "comment": "\n * External references of the form: \"window[\u0027xx\u0027]\" indicate names that must\n * be reserved when variable renaming to avoid conflicts.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GLOBAL_THIS_NAMES"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportedVariables"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherRawExports.GatherRawExports(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 74)",
        "(line 47,col 5)-(line 47,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 50,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 31)",
        "(line 53,col 5)-(line 61,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.isGlobalThisObject(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 64,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 75,col 5)",
        "(line 76,col 5)-(line 76,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherRawExports.getExportedVariableNames()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 29)"
      ]
    }
  ]
}