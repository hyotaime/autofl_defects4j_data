{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ExpandJqueryAliases.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpandJqueryAliases",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 44,
      "end_line": 583,
      "comment": "\n * Replace known jQuery aliases and methods with standard\n * conventions so that the compiler recognizes them. Expected\n * replacements include:\n *  - jQuery.fn -\u003e jQuery.prototype\n *  - jQuery.extend -\u003e expanded into direct object assignments\n *  - jQuery.expandedEach -\u003e expand into direct assignments\n *\n * @author chadkillingsworth@missouristate.edu (Chad Killingsworth)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "convention"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR"
      ],
      "begin_line": 51,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR"
      ],
      "begin_line": 57,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JQUERY_USELESS_EACH_EXPANSION"
      ],
      "begin_line": 62,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JQUERY_EXTEND_NAMES"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "JQUERY_EXPANDED_EACH_NAME"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "peepholePasses"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.ExpandJqueryAliases(com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 75,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 29)",
        "(line 77,col 5)-(line 77,col 53)",
        "(line 82,col 5)-(line 82,col 31)",
        "(line 83,col 5)-(line 88,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExtendCall(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 97,
      "end_line": 115,
      "comment": "\n   * Check that Node n is a call to one of the jQuery.extend methods that we\n   * can expand. Valid calls are single argument calls where the first argument\n   * is an object literal or two argument calls where the first argument\n   * is a name and the second argument is an object literal.\n   ",
      "child_ranges": [
        "(line 99,col 5)-(line 113,col 5)",
        "(line 114,col 5)-(line 114,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExpandedEachCall(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 47)",
        "(line 119,col 5)-(line 122,col 5)",
        "(line 123,col 5)-(line 123,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 126,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 44)",
        "(line 148,col 5)-(line 148,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeReplaceJqueryPrototypeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 151,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 167,col 5)",
        "(line 169,col 5)-(line 169,col 31)",
        "(line 170,col 5)-(line 173,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeExpandJqueryExtendCall(com.google.javascript.rhino.Node)",
      "begin_line": 182,
      "end_line": 263,
      "comment": "\n   * Expand jQuery.extend (and derivative) calls into direct object assignments\n   * Example: jQuery.extend(obj1, {prop1: val1, prop2: val2}) -\u003e\n   *   obj1.prop1 \u003d val1;\n   *   obj1.prop2 \u003d val2;\n   ",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 40)",
        "(line 184,col 5)-(line 184,col 47)",
        "(line 185,col 5)-(line 185,col 46)",
        "(line 186,col 5)-(line 186,col 39)",
        "(line 188,col 5)-(line 197,col 5)",
        "(line 200,col 5)-(line 202,col 5)",
        "(line 206,col 5)-(line 206,col 41)",
        "(line 208,col 5)-(line 213,col 5)",
        "(line 215,col 5)-(line 232,col 5)",
        "(line 237,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 271,
      "end_line": 326,
      "comment": "\n   * Expand a jQuery.expandedEach call\n   *\n   * Expanded jQuery.expandedEach calls will replace the GETELEM nodes of a\n   * property assignment with GETPROP nodes to allow for renaming.\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 49)",
        "(line 274,col 5)-(line 276,col 5)",
        "(line 278,col 5)-(line 278,col 55)",
        "(line 279,col 5)-(line 281,col 5)",
        "(line 285,col 5)-(line 285,col 55)",
        "(line 288,col 5)-(line 288,col 32)",
        "(line 290,col 5)-(line 290,col 49)",
        "(line 294,col 5)-(line 299,col 5)",
        "(line 302,col 5)-(line 302,col 56)",
        "(line 303,col 5)-(line 303,col 58)",
        "(line 305,col 5)-(line 309,col 44)",
        "(line 311,col 5)-(line 315,col 5)",
        "(line 317,col 5)-(line 318,col 48)",
        "(line 320,col 5)-(line 325,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.tryExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 328,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 40)",
        "(line 332,col 5)-(line 332,col 49)",
        "(line 335,col 5)-(line 335,col 50)",
        "(line 337,col 5)-(line 337,col 36)",
        "(line 340,col 5)-(line 340,col 60)",
        "(line 341,col 5)-(line 443,col 5)",
        "(line 444,col 5)-(line 444,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.replaceOriginalJqueryEachCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 447,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 451,col 5)-(line 481,col 5)",
        "(line 482,col 5)-(line 482,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isArrayLitValidForExpansion(com.google.javascript.rhino.Node)",
      "begin_line": 485,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 50)",
        "(line 487,col 5)-(line 492,col 5)",
        "(line 493,col 5)-(line 493,col 16)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindCallbackArgumentReferences",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback",
        "com.google.javascript.jscomp.NodeTraversal.ScopedCallback"
      ],
      "begin_line": 500,
      "end_line": 582,
      "comment": "\n   * Given a jQuery.expandedEach callback function, traverse it and collect any\n   * references to its parameter names.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "keyName"
      ],
      "begin_line": 503,
      "end_line": 503,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueName"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startingScope"
      ],
      "begin_line": 505,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyReferences"
      ],
      "begin_line": 506,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueReferences"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.FindCallbackArgumentReferences(com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, boolean)",
      "begin_line": 509,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 511,col 7)-(line 511,col 58)",
        "(line 513,col 7)-(line 513,col 50)",
        "(line 514,col 7)-(line 514,col 73)",
        "(line 515,col 7)-(line 515,col 50)",
        "(line 516,col 7)-(line 525,col 7)",
        "(line 527,col 7)-(line 527,col 31)",
        "(line 528,col 7)-(line 528,col 35)",
        "(line 532,col 7)-(line 538,col 7)",
        "(line 540,col 7)-(line 540,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.isShadowed(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 543,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 544,col 7)-(line 544,col 39)",
        "(line 545,col 7)-(line 546,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 549,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 552,col 7)-(line 552,col 29)",
        "(line 553,col 7)-(line 555,col 7)",
        "(line 557,col 7)-(line 565,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 573,
      "end_line": 578,
      "comment": "\n     * As we enter each scope, make sure that the scope doesn\u0027t define\n     * a local variable with the same name as our original callback method\n     * parameter names.\n     ",
      "child_ranges": [
        "(line 575,col 7)-(line 577,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 580,
      "end_line": 581,
      "comment": "",
      "child_ranges": []
    }
  ]
}