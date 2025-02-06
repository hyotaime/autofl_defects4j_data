{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/RecordFunctionInformation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RecordFunctionInformation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 133,
      "comment": "\n * Records information about functions and modules.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapBuilder"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n   * Protocol buffer builder.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.RecordFunctionInformation(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.FunctionNames)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "\n   * Creates a record function information compiler pass.\n   *\n   * @param compiler       The JSCompiler\n   * @param functionNames  Assigned function identifiers.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 29)",
        "(line 50,col 5)-(line 50,col 49)",
        "(line 51,col 5)-(line 51,col 39)",
        "(line 52,col 5)-(line 52,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.getMap()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n   * Returns the built-out map.\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 62,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 49)",
        "(line 66,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.Anonymous-7cd3c8b4-6df5-4b4e-941e-e3e54aec71d4.compare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 11)-(line 73,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 83,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 87,col 5)",
        "(line 89,col 5)-(line 89,col 44)",
        "(line 90,col 5)-(line 93,col 5)",
        "(line 95,col 5)-(line 95,col 49)",
        "(line 96,col 5)-(line 96,col 36)",
        "(line 97,col 5)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.addModuleInformation(com.google.javascript.jscomp.JSModule)",
      "begin_line": 118,
      "end_line": 132,
      "comment": "\n   * Record a module\u0027s compiled source.  The view of the source we get\n   * from function sources alone is not complete; it doesn\u0027t contain\n   * assignments and function calls in the global scope which are\n   * crucial to understanding how the application works.\n   *\n   * This version of the source is also written out to js_output_file,\n   * module_output_path_prefix or other places.  Duplicating it here\n   * simplifies the process of writing tools that combine and present\n   * module and function for debugging purposes.\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 16)",
        "(line 120,col 5)-(line 120,col 18)",
        "(line 121,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 131,col 44)"
      ]
    }
  ]
}