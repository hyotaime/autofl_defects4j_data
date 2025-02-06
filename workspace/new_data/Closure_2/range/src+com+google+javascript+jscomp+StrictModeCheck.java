{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/StrictModeCheck.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrictModeCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 37,
      "end_line": 246,
      "comment": "\n * Checks that the code obeys the static restrictions of strict mode:\n * \u003col\u003e\n * \u003cli\u003e No use of \"with\".\n * \u003cli\u003e No deleting variables, functions, or arguments.\n * \u003cli\u003e No re-declarations or assignments of \"eval\" or arguments.\n * \u003cli\u003e No use of \"eval\" (optional check for Caja).\n * \u003c/ol\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNKNOWN_VARIABLE"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EVAL_USE"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EVAL_DECLARATION"
      ],
      "begin_line": 46,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EVAL_ASSIGNMENT"
      ],
      "begin_line": 50,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS_DECLARATION"
      ],
      "begin_line": 54,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARGUMENTS_ASSIGNMENT"
      ],
      "begin_line": 58,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DELETE_VARIABLE"
      ],
      "begin_line": 62,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ILLEGAL_NAME"
      ],
      "begin_line": 67,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUPLICATE_OBJECT_KEY"
      ],
      "begin_line": 71,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noVarCheck"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noCajaChecks"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 29)",
        "(line 86,col 5)-(line 86,col 33)",
        "(line 87,col 5)-(line 87,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 92,col 59)",
        "(line 93,col 5)-(line 93,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 96,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 109,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.isDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 116,
      "end_line": 129,
      "comment": "\n   * Determines if the given name is a declaration, which can be a declaration\n   * of a variable, function, or argument.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 128,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkNameUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 132,
      "end_line": 149,
      "comment": " Checks that the given name is used legally. ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 47)",
        "(line 134,col 5)-(line 140,col 5)",
        "(line 142,col 5)-(line 148,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkAssignment(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 164,
      "comment": " Checks that an assignment is not to the \"arguments\" object. ",
      "child_ranges": [
        "(line 153,col 5)-(line 163,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkDelete(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 167,
      "end_line": 174,
      "comment": " Checks that variables, functions, and arguments are not deleted. ",
      "child_ranges": [
        "(line 168,col 5)-(line 173,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkObjectLiteral(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 177,
      "end_line": 203,
      "comment": " Checks that object literal keys are valid. ",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 44)",
        "(line 179,col 5)-(line 179,col 44)",
        "(line 180,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkLabel(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 206,
      "end_line": 212,
      "comment": " Checks that label names are valid. ",
      "child_ranges": [
        "(line 207,col 5)-(line 211,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NonExternChecks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 215,
      "end_line": 245,
      "comment": " Checks that are performed on non-extern code only. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 216,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 7)-(line 221,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.checkDeclaration(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 225,
      "end_line": 235,
      "comment": " Checks for illegal declarations. ",
      "child_ranges": [
        "(line 226,col 7)-(line 234,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.checkProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 238,
      "end_line": 244,
      "comment": " Checks for illegal property accesses. ",
      "child_ranges": [
        "(line 239,col 7)-(line 243,col 7)"
      ]
    }
  ]
}