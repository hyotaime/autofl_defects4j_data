{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PreprocessorSymbolTable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreprocessorSymbolTable",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.StaticScope\u003ccom.google.javascript.rhino.jstype.JSType\u003e",
        "com.google.javascript.rhino.jstype.StaticSymbolTable\u003ccom.google.javascript.rhino.jstype.SimpleSlot, com.google.javascript.jscomp.PreprocessorSymbolTable.Reference\u003e"
      ],
      "begin_line": 39,
      "end_line": 108,
      "comment": "\n * A symbol table for references that are removed by preprocessor passes\n * (like {@code ProcessClosurePrimitives}).\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "symbols"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n   * All preprocessor symbols are globals.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "refs"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.PreprocessorSymbolTable(com.google.javascript.rhino.Node)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getRootNode()",
      "begin_line": 58,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 59,col 31)-(line 59,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getTypeOfThis()",
      "begin_line": 61,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 62,col 35)-(line 62,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getParentScope()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 65,col 49)-(line 65,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getSlot(java.lang.String)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getOwnSlot(java.lang.String)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getReferences(com.google.javascript.rhino.jstype.SimpleSlot)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getAllSymbols()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.getScope(com.google.javascript.rhino.jstype.SimpleSlot)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(com.google.javascript.rhino.Node)",
      "begin_line": 92,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 42)",
        "(line 94,col 5)-(line 94,col 37)",
        "(line 96,col 5)-(line 98,col 5)",
        "(line 100,col 5)-(line 100,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Reference",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.jstype.SimpleReference\u003ccom.google.javascript.rhino.jstype.SimpleSlot\u003e"
      ],
      "begin_line": 103,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PreprocessorSymbolTable.Reference.Reference(com.google.javascript.rhino.jstype.SimpleSlot, com.google.javascript.rhino.Node)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 7)-(line 105,col 26)"
      ]
    }
  ]
}