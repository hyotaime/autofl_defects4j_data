{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GenerateExports.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GenerateExports",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 30,
      "end_line": 157,
      "comment": "\n * Generates goog.exportSymbol/goog.exportProperty for the @export annotation.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROTOTYPE_PROPERTY"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
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
        "exportSymbolFunction"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exportPropertyFunction"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GenerateExports.GenerateExports(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)",
      "begin_line": 46,
      "end_line": 55,
      "comment": "\n   * Creates a new generate exports compiler pass.\n   * @param compiler JS compiler.\n   * @param exportSymbolFunction function used for exporting symbols.\n   * @param exportPropertyFunction function used for exporting property names.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 41)",
        "(line 49,col 5)-(line 49,col 53)",
        "(line 50,col 5)-(line 50,col 55)",
        "(line 52,col 5)-(line 52,col 29)",
        "(line 53,col 5)-(line 53,col 53)",
        "(line 54,col 5)-(line 54,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GenerateExports.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 80)",
        "(line 60,col 5)-(line 60,col 64)",
        "(line 61,col 5)-(line 62,col 22)",
        "(line 64,col 5)-(line 64,col 65)",
        "(line 65,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GenerateExports.annotate(com.google.javascript.rhino.Node)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 144,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GenerateExports.getPropertyName(com.google.javascript.rhino.Node)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n   * Assumes the node type is correct and returns the property name\n   * (not fully qualified).\n   * @param node node\n   * @return property name.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 50)",
        "(line 155,col 5)-(line 155,col 43)"
      ]
    }
  ]
}