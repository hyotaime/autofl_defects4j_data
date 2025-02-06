{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/StrictModeCheck.java",
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
      "end_line": 260,
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
        "BAD_FUNCTION_DECLARATION"
      ],
      "begin_line": 75,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noVarCheck"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noCajaChecks"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.StrictModeCheck(com.google.javascript.jscomp.AbstractCompiler, boolean, boolean)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 29)",
        "(line 91,col 5)-(line 91,col 33)",
        "(line 92,col 5)-(line 92,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 59)",
        "(line 98,col 5)-(line 98,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 101,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkFunctionUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 120,
      "end_line": 124,
      "comment": " Checks that the function is used legally. ",
      "child_ranges": [
        "(line 121,col 5)-(line 123,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.isDeclaration(com.google.javascript.rhino.Node)",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n   * Determines if the given name is a declaration, which can be a declaration\n   * of a variable, function, or argument.\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkNameUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 146,
      "end_line": 163,
      "comment": " Checks that the given name is used legally. ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 47)",
        "(line 148,col 5)-(line 154,col 5)",
        "(line 156,col 5)-(line 162,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkAssignment(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 166,
      "end_line": 178,
      "comment": " Checks that an assignment is not to the \"arguments\" object. ",
      "child_ranges": [
        "(line 167,col 5)-(line 177,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkDelete(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 181,
      "end_line": 188,
      "comment": " Checks that variables, functions, and arguments are not deleted. ",
      "child_ranges": [
        "(line 182,col 5)-(line 187,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkObjectLiteral(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 191,
      "end_line": 217,
      "comment": " Checks that object literal keys are valid. ",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 44)",
        "(line 193,col 5)-(line 193,col 44)",
        "(line 194,col 5)-(line 216,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.checkLabel(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 220,
      "end_line": 226,
      "comment": " Checks that label names are valid. ",
      "child_ranges": [
        "(line 221,col 5)-(line 225,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NonExternChecks",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 229,
      "end_line": 259,
      "comment": " Checks that are performed on non-extern code only. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 230,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 231,col 7)-(line 235,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.checkDeclaration(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 239,
      "end_line": 249,
      "comment": " Checks for illegal declarations. ",
      "child_ranges": [
        "(line 240,col 7)-(line 248,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.StrictModeCheck.NonExternChecks.checkProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 252,
      "end_line": 258,
      "comment": " Checks for illegal property accesses. ",
      "child_ranges": [
        "(line 253,col 7)-(line 257,col 7)"
      ]
    }
  ]
}