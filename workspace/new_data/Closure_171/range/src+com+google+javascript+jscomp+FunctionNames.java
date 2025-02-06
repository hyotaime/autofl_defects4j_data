{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/FunctionNames.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionNames",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionListExtractor"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionNames(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 29)",
        "(line 57,col 5)-(line 57,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 60,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 66)",
        "(line 63,col 5)-(line 63,col 77)",
        "(line 64,col 5)-(line 65,col 51)",
        "(line 66,col 5)-(line 66,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionNodeList()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionId(com.google.javascript.rhino.Node)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 47)",
        "(line 75,col 5)-(line 79,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.getFunctionName(com.google.javascript.rhino.Node)",
      "begin_line": 82,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 47)",
        "(line 84,col 5)-(line 87,col 5)",
        "(line 89,col 5)-(line 89,col 29)",
        "(line 90,col 5)-(line 92,col 5)",
        "(line 94,col 5)-(line 94,col 32)",
        "(line 95,col 5)-(line 97,col 5)",
        "(line 100,col 5)-(line 100,col 43)",
        "(line 104,col 5)-(line 104,col 40)",
        "(line 106,col 5)-(line 106,col 52)",
        "(line 107,col 5)-(line 107,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 110,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionRecord.FunctionRecord(int, com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 7)-(line 118,col 19)",
        "(line 119,col 7)-(line 119,col 27)",
        "(line 120,col 7)-(line 120,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionListExtractor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 124,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nextId"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionListExtractor.FunctionListExtractor(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord\u003e)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionListExtractor.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 132,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 143,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FunctionExpressionNamer",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer"
      ],
      "begin_line": 147,
      "end_line": 175,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DELIMITER"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "extractor"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "functionMap"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.FunctionExpressionNamer(java.util.Map\u003ccom.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord\u003e)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 7)-(line 155,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.getName(com.google.javascript.rhino.Node)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 7)-(line 160,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.setFunctionName(java.lang.String, com.google.javascript.rhino.Node)",
      "begin_line": 163,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 54)",
        "(line 166,col 7)-(line 166,col 29)",
        "(line 167,col 7)-(line 167,col 36)",
        "(line 168,col 7)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.getCombinedName(java.lang.String, java.lang.String)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 7)-(line 173,col 35)"
      ]
    }
  ]
}