{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/FunctionNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionListExtractor"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionNames(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 29)",
        "(line 56,col 5)-(line 56,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 59,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 66)",
        "(line 62,col 5)-(line 62,col 77)",
        "(line 63,col 5)-(line 64,col 51)",
        "(line 65,col 5)-(line 65,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionNodeList()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionId(com.google.javascript.rhino.Node)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 47)",
        "(line 74,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 81,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 47)",
        "(line 83,col 5)-(line 86,col 5)",
        "(line 88,col 5)-(line 88,col 29)",
        "(line 89,col 5)-(line 91,col 5)",
        "(line 93,col 5)-(line 93,col 32)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 99,col 5)-(line 99,col 43)",
        "(line 103,col 5)-(line 103,col 40)",
        "(line 105,col 5)-(line 105,col 52)",
        "(line 106,col 5)-(line 106,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 109,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionRecord.FunctionRecord(int, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 7)-(line 117,col 19)",
        "(line 118,col 7)-(line 118,col 27)",
        "(line 119,col 7)-(line 119,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionListExtractor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 123,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextId"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionListExtractor.FunctionListExtractor(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord\u003e)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionListExtractor.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 131,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 133,col 7)-(line 142,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionExpressionNamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer"
      ],
      "begin_line": 146,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DELIMITER"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extractor"
      ],
      "begin_line": 149,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.FunctionExpressionNamer(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord\u003e)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 162,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 164,col 7)-(line 164,col 54)",
        "(line 165,col 7)-(line 165,col 29)",
        "(line 166,col 7)-(line 166,col 36)",
        "(line 167,col 7)-(line 167,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 172,col 7)-(line 172,col 35)"
      ]
    }
  ]
}