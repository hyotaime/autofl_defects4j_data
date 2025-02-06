{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/GatherCharacterEncodingBias.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GatherCharacterEncodingBias",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 29,
      "end_line": 215,
      "comment": "\n * Gathers character encoding information based on parts of the code\n * that would not be renamed.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "nameGenerator"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
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
        "renameGlobaVars"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "renameProperties"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.GatherCharacterEncodingBias(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NameGenerator, boolean, boolean)",
      "begin_line": 36,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 29)",
        "(line 40,col 5)-(line 40,col 28)",
        "(line 41,col 5)-(line 41,col 44)",
        "(line 42,col 5)-(line 42,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.GatherCharacterEncodingBias(com.google.javascript.jscomp.AbstractCompiler, com.google.javascript.jscomp.NameGenerator, boolean)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 58,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 186,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 189,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 59)",
        "(line 191,col 5)-(line 194,col 5)",
        "(line 195,col 5)-(line 195,col 32)",
        "(line 196,col 5)-(line 196,col 40)",
        "(line 197,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.visitGetProp(com.google.javascript.rhino.Node)",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 62)",
        "(line 204,col 5)-(line 206,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.GatherCharacterEncodingBias.visitGetterSetterDef(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 209,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 33)",
        "(line 211,col 5)-(line 213,col 5)"
      ]
    }
  ]
}