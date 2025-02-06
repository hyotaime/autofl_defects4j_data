{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/VarCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VarCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.HotSwapCompilerPass"
      ],
      "begin_line": 35,
      "end_line": 279,
      "comment": "\n * Checks that all variables are declared, that file-private variables are\n * accessed only in the file that declares them, and that any var references\n * that cross module boundaries respect declared module dependencies.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_VAR_ERROR"
      ],
      "begin_line": 38,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "VIOLATED_MODULE_DEP_ERROR"
      ],
      "begin_line": 42,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISSING_MODULE_DEP_ERROR"
      ],
      "begin_line": 47,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STRICT_MODULE_DEP_ERROR"
      ],
      "begin_line": 52,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NAME_REFERENCE_IN_EXTERNS_ERROR"
      ],
      "begin_line": 57,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNDEFINED_EXTERN_VAR_ERROR"
      ],
      "begin_line": 62,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "synthesizedExternsRoot"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varsToDeclareInExterns"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " in the normal code."
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sanityCheck"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Whether this is the post-processing sanity check."
    },
    {
      "type": "field",
      "varNames": [
        "strictExternCheck"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Whether extern checks emit error."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VarCheck.VarCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.VarCheck.VarCheck(com.google.javascript.jscomp.AbstractCompiler, boolean)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 29)",
        "(line 88,col 5)-(line 89,col 80)",
        "(line 90,col 5)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 93,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 103,col 59)",
        "(line 104,col 5)-(line 106,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 109,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 52)",
        "(line 112,col 5)-(line 112,col 56)",
        "(line 115,col 5)-(line 116,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 124,col 5)",
        "(line 126,col 5)-(line 126,col 35)",
        "(line 129,col 5)-(line 133,col 5)",
        "(line 137,col 5)-(line 143,col 5)",
        "(line 146,col 5)-(line 146,col 31)",
        "(line 147,col 5)-(line 147,col 42)",
        "(line 148,col 5)-(line 167,col 5)",
        "(line 169,col 5)-(line 169,col 43)",
        "(line 170,col 5)-(line 170,col 39)",
        "(line 171,col 5)-(line 174,col 5)",
        "(line 177,col 5)-(line 177,col 48)",
        "(line 178,col 5)-(line 178,col 46)",
        "(line 179,col 5)-(line 179,col 58)",
        "(line 180,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(java.lang.String)",
      "begin_line": 209,
      "end_line": 226,
      "comment": "\n   * Create a new variable in a synthetic script. This will prevent\n   * subsequent compiler passes from crashing.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 37)",
        "(line 218,col 5)-(line 220,col 5)",
        "(line 222,col 5)-(line 223,col 26)",
        "(line 224,col 5)-(line 224,col 43)",
        "(line 225,col 5)-(line 225,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameRefInExternsCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 232,
      "end_line": 264,
      "comment": "\n   * A check for name references in the externs inputs. These used to prevent\n   * a variable from getting renamed, but no longer have any effect.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.NameRefInExternsCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 233,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 262,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " Lazily create a \"new\" externs input for undeclared variables. ",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot()",
      "begin_line": 272,
      "end_line": 278,
      "comment": " Lazily create a \"new\" externs root for undeclared variables. ",
      "child_ranges": [
        "(line 273,col 5)-(line 276,col 5)",
        "(line 277,col 5)-(line 277,col 34)"
      ]
    }
  ]
}