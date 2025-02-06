{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ExpandJqueryAliases.java",
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
      "end_line": 590,
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
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 29)",
        "(line 77,col 5)-(line 77,col 53)",
        "(line 82,col 5)-(line 82,col 31)",
        "(line 83,col 5)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExtendCall(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.AbstractCompiler)",
      "begin_line": 98,
      "end_line": 116,
      "comment": "\n   * Check that Node n is a call to one of the jQuery.extend methods that we\n   * can expand. Valid calls are single argument calls where the first argument\n   * is an object literal or two argument calls where the first argument\n   * is a name and the second argument is an object literal.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 114,col 5)",
        "(line 115,col 5)-(line 115,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExpandedEachCall(com.google.javascript.rhino.Node, java.lang.String)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 47)",
        "(line 120,col 5)-(line 123,col 5)",
        "(line 124,col 5)-(line 124,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 127,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 145,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 44)",
        "(line 149,col 5)-(line 149,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeReplaceJqueryPrototypeAlias(com.google.javascript.rhino.Node)",
      "begin_line": 152,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 168,col 5)",
        "(line 170,col 5)-(line 170,col 31)",
        "(line 171,col 5)-(line 174,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeExpandJqueryExtendCall(com.google.javascript.rhino.Node)",
      "begin_line": 183,
      "end_line": 270,
      "comment": "\n   * Expand jQuery.extend (and derivative) calls into direct object assignments\n   * Example: jQuery.extend(obj1, {prop1: val1, prop2: val2}) -\u003e\n   *   obj1.prop1 \u003d val1;\n   *   obj1.prop2 \u003d val2;\n   ",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 40)",
        "(line 185,col 5)-(line 185,col 47)",
        "(line 186,col 5)-(line 186,col 46)",
        "(line 187,col 5)-(line 187,col 39)",
        "(line 189,col 5)-(line 198,col 5)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 207,col 5)-(line 207,col 41)",
        "(line 209,col 5)-(line 214,col 5)",
        "(line 216,col 5)-(line 233,col 5)",
        "(line 238,col 5)-(line 268,col 5)",
        "(line 269,col 5)-(line 269,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.maybeExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 278,
      "end_line": 333,
      "comment": "\n   * Expand a jQuery.expandedEach call\n   *\n   * Expanded jQuery.expandedEach calls will replace the GETELEM nodes of a\n   * property assignment with GETPROP nodes to allow for renaming.\n   ",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 49)",
        "(line 281,col 5)-(line 283,col 5)",
        "(line 285,col 5)-(line 285,col 55)",
        "(line 286,col 5)-(line 288,col 5)",
        "(line 292,col 5)-(line 292,col 55)",
        "(line 295,col 5)-(line 295,col 32)",
        "(line 297,col 5)-(line 297,col 49)",
        "(line 301,col 5)-(line 306,col 5)",
        "(line 309,col 5)-(line 309,col 56)",
        "(line 310,col 5)-(line 310,col 58)",
        "(line 312,col 5)-(line 316,col 44)",
        "(line 318,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 325,col 48)",
        "(line 327,col 5)-(line 332,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.tryExpandJqueryEachCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, java.util.List\u003ccom.google.javascript.rhino.Node\u003e)",
      "begin_line": 335,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 40)",
        "(line 339,col 5)-(line 339,col 49)",
        "(line 342,col 5)-(line 342,col 50)",
        "(line 344,col 5)-(line 344,col 36)",
        "(line 347,col 5)-(line 347,col 60)",
        "(line 348,col 5)-(line 450,col 5)",
        "(line 451,col 5)-(line 451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.replaceOriginalJqueryEachCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 454,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 458,col 5)-(line 488,col 5)",
        "(line 489,col 5)-(line 489,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.isArrayLitValidForExpansion(com.google.javascript.rhino.Node)",
      "begin_line": 492,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 493,col 5)-(line 493,col 50)",
        "(line 494,col 5)-(line 499,col 5)",
        "(line 500,col 5)-(line 500,col 16)"
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
      "begin_line": 507,
      "end_line": 589,
      "comment": "\n   * Given a jQuery.expandedEach callback function, traverse it and collect any\n   * references to its parameter names.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "keyName"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueName"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startingScope"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "keyReferences"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "valueReferences"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.FindCallbackArgumentReferences(com.google.javascript.rhino.Node, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, java.util.List\u003ccom.google.javascript.rhino.Node\u003e, boolean)",
      "begin_line": 516,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 518,col 7)-(line 518,col 58)",
        "(line 520,col 7)-(line 520,col 50)",
        "(line 521,col 7)-(line 521,col 73)",
        "(line 522,col 7)-(line 522,col 50)",
        "(line 523,col 7)-(line 532,col 7)",
        "(line 534,col 7)-(line 534,col 31)",
        "(line 535,col 7)-(line 535,col 35)",
        "(line 539,col 7)-(line 545,col 7)",
        "(line 547,col 7)-(line 547,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.isShadowed(java.lang.String, com.google.javascript.jscomp.Scope)",
      "begin_line": 550,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 551,col 7)-(line 551,col 39)",
        "(line 552,col 7)-(line 553,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 556,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 559,col 7)-(line 559,col 29)",
        "(line 560,col 7)-(line 562,col 7)",
        "(line 564,col 7)-(line 572,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.enterScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 580,
      "end_line": 585,
      "comment": "\n     * As we enter each scope, make sure that the scope doesn\u0027t define\n     * a local variable with the same name as our original callback method\n     * parameter names.\n     ",
      "child_ranges": [
        "(line 582,col 7)-(line 584,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExpandJqueryAliases.FindCallbackArgumentReferences.exitScope(com.google.javascript.jscomp.NodeTraversal)",
      "begin_line": 587,
      "end_line": 588,
      "comment": "",
      "child_ranges": []
    }
  ]
}