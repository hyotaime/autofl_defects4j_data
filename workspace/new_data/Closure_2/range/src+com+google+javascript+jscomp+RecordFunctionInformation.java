{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/RecordFunctionInformation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RecordFunctionInformation",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 29,
      "end_line": 132,
      "comment": "\n * Records information about functions and modules.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionNames"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mapBuilder"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n   * Protocol buffer builder.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.RecordFunctionInformation(com.google.javascript.jscomp.Compiler, com.google.javascript.jscomp.FunctionNames)",
      "begin_line": 46,
      "end_line": 52,
      "comment": "\n   * Creates a record function information compiler pass.\n   *\n   * @param compiler       The JSCompiler\n   * @param functionNames  Assigned function identifiers.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 29)",
        "(line 49,col 5)-(line 49,col 49)",
        "(line 50,col 5)-(line 50,col 39)",
        "(line 51,col 5)-(line 51,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.getMap()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n   * Returns the built-out map.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 61,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 49)",
        "(line 65,col 5)-(line 79,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.Anonymous-e14e4974-8293-4777-973a-06a529b0765d.compare(com.google.javascript.jscomp.JSModule, com.google.javascript.jscomp.JSModule)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 11)-(line 72,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 86,col 5)",
        "(line 88,col 5)-(line 88,col 44)",
        "(line 89,col 5)-(line 92,col 5)",
        "(line 94,col 5)-(line 94,col 49)",
        "(line 95,col 5)-(line 95,col 36)",
        "(line 96,col 5)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.RecordFunctionInformation.addModuleInformation(com.google.javascript.jscomp.JSModule)",
      "begin_line": 117,
      "end_line": 131,
      "comment": "\n   * Record a module\u0027s compiled source.  The view of the source we get\n   * from function sources alone is not complete; it doesn\u0027t contain\n   * assignments and function calls in the global scope which are\n   * crucial to understanding how the application works.\n   *\n   * This version of the source is also written out to js_output_file,\n   * module_output_path_prefix or other places.  Duplicating it here\n   * simplifies the process of writing tools that combine and present\n   * module and function for debugging purposes.\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 16)",
        "(line 119,col 5)-(line 119,col 18)",
        "(line 120,col 5)-(line 126,col 5)",
        "(line 128,col 5)-(line 130,col 44)"
      ]
    }
  ]
}