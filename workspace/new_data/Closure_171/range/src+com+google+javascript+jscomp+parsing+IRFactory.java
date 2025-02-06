{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/IRFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IRFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 81,
      "end_line": 1501,
      "comment": "\n * IRFactory transforms the new AST to the old AST.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "GETTER_ERROR_MESSAGE"
      ],
      "begin_line": 83,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SETTER_ERROR_MESSAGE"
      ],
      "begin_line": 88,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUSPICIOUS_COMMENT_WARNING"
      ],
      "begin_line": 93,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MISPLACED_TYPE_ANNOTATION"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceString"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "config"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorReporter"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformDispatcher"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALLOWED_DIRECTIVES"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES5_RESERVED_KEYWORDS"
      ],
      "begin_line": 110,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ES5_STRICT_RESERVED_KEYWORDS"
      ],
      "begin_line": 114,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reservedKeywords"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parsedComments"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rootNodeJsDocHolder"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " and stored in JSDocInfo for placeholder node."
    },
    {
      "type": "field",
      "varNames": [
        "fileLevelJsDocBuilder"
      ],
      "begin_line": 127,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileOverviewInfo"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "templateNode"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " memory footprint associated with these."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.IRFactory(java.lang.String, com.google.javascript.rhino.jstype.StaticSourceFile, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter)",
      "begin_line": 137,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 37)",
        "(line 142,col 5)-(line 142,col 33)",
        "(line 145,col 5)-(line 145,col 71)",
        "(line 147,col 5)-(line 147,col 25)",
        "(line 148,col 5)-(line 148,col 39)",
        "(line 149,col 5)-(line 149,col 57)",
        "(line 151,col 5)-(line 151,col 45)",
        "(line 153,col 5)-(line 166,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.createTemplateNode()",
      "begin_line": 172,
      "end_line": 177,
      "comment": " This reduces the cost of these properties to O(nodes) to O(files).",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 47)",
        "(line 175,col 5)-(line 175,col 49)",
        "(line 176,col 5)-(line 176,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformTree(com.google.javascript.rhino.head.ast.AstRoot, com.google.javascript.rhino.jstype.StaticSourceFile, java.lang.String, com.google.javascript.jscomp.parsing.Config, com.google.javascript.rhino.head.ErrorReporter)",
      "begin_line": 179,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 185,col 31)",
        "(line 186,col 5)-(line 186,col 44)",
        "(line 188,col 5)-(line 197,col 5)",
        "(line 199,col 5)-(line 199,col 43)",
        "(line 201,col 5)-(line 201,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.setFileOverviewJsDoc(com.google.javascript.rhino.Node)",
      "begin_line": 204,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 65)",
        "(line 209,col 5)-(line 212,col 5)",
        "(line 214,col 5)-(line 221,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformBlock(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 224,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 34)",
        "(line 226,col 5)-(line 237,col 5)",
        "(line 238,col 5)-(line 238,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.handleBlockComment(com.google.javascript.rhino.head.ast.Comment)",
      "begin_line": 244,
      "end_line": 253,
      "comment": "\n   * Check to see if the given block comment looks like it should be JSDoc.\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 38)",
        "(line 246,col 5)-(line 252,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser)",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\n   * @return true if the jsDocParser represents a fileoverview.\n   ",
      "child_ranges": [
        "(line 260,col 5)-(line 263,col 5)",
        "(line 264,col 5)-(line 264,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)",
      "begin_line": 267,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 73)",
        "(line 269,col 5)-(line 269,col 32)",
        "(line 270,col 5)-(line 270,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.handleJsDoc(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)",
      "begin_line": 273,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 42)",
        "(line 275,col 5)-(line 285,col 5)",
        "(line 286,col 5)-(line 286,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.validateTypeAnnotations(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 289,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 290,col 5)-(line 347,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.isPropAccess(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 352,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.isExprStmt(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 357,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transform(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 360,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 38)",
        "(line 362,col 5)-(line 362,col 52)",
        "(line 363,col 5)-(line 366,col 5)",
        "(line 367,col 5)-(line 367,col 32)",
        "(line 368,col 5)-(line 368,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.maybeInjectCastNode(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 371,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 376,col 5)",
        "(line 377,col 5)-(line 377,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformParameter(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 390,
      "end_line": 401,
      "comment": "\n   * Parameter NAMEs are special, because they can have inline type docs\n   * attached.\n   *\n   * function f(/** string \u0026#42;/ x) {}\n   * annotates \u0027x\u0027 as a string.\n   *\n   * @see \u003ca href\u003d\"http://code.google.com/p/jsdoc-toolkit/wiki/InlineDocs\"\u003e\n   *   Using Inline Doc Comments\u003c/a\u003e\n   ",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 38)",
        "(line 392,col 5)-(line 392,col 42)",
        "(line 393,col 5)-(line 398,col 5)",
        "(line 399,col 5)-(line 399,col 32)",
        "(line 400,col 5)-(line 400,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(com.google.javascript.rhino.head.ast.Name)",
      "begin_line": 403,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 404,col 5)-(line 404,col 62)",
        "(line 405,col 5)-(line 405,col 52)",
        "(line 406,col 5)-(line 408,col 5)",
        "(line 409,col 5)-(line 409,col 32)",
        "(line 410,col 5)-(line 410,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformNumberAsString(com.google.javascript.rhino.head.ast.NumberLiteral)",
      "begin_line": 413,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 73)",
        "(line 415,col 5)-(line 415,col 59)",
        "(line 416,col 5)-(line 418,col 5)",
        "(line 419,col 5)-(line 419,col 39)",
        "(line 420,col 5)-(line 420,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.getStringValue(double)",
      "begin_line": 423,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 424,col 34)",
        "(line 427,col 5)-(line 431,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 434,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 444,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)",
      "begin_line": 458,
      "end_line": 478,
      "comment": "\n   * Creates a JsDocInfoParser and parses the JsDoc string.\n   *\n   * Used both for handling individual JSDoc comments and for handling\n   * file-level JSDoc comments (@fileoverview and @license).\n   *\n   * @param node The JsDoc Comment node to parse.\n   * @param irNode\n   * @return A JsDocInfoParser. Will contain either fileoverview JsDoc, or\n   *     normal JsDoc, or no JsDoc (if the method parses to the wrong level).\n   ",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 37)",
        "(line 460,col 5)-(line 460,col 34)",
        "(line 461,col 5)-(line 461,col 46)",
        "(line 464,col 5)-(line 464,col 28)",
        "(line 465,col 5)-(line 473,col 25)",
        "(line 474,col 5)-(line 474,col 64)",
        "(line 475,col 5)-(line 475,col 59)",
        "(line 476,col 5)-(line 476,col 24)",
        "(line 477,col 5)-(line 477,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.parseInlineTypeDoc(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)",
      "begin_line": 483,
      "end_line": 500,
      "comment": "\n   * Parses inline type info.\n   ",
      "child_ranges": [
        "(line 484,col 5)-(line 484,col 37)",
        "(line 485,col 5)-(line 485,col 34)",
        "(line 486,col 5)-(line 486,col 46)",
        "(line 489,col 5)-(line 489,col 28)",
        "(line 490,col 5)-(line 498,col 25)",
        "(line 499,col 5)-(line 499,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 503,
      "end_line": 507,
      "comment": " Set the length on the node if we\u0027re in IDE mode.",
      "child_ranges": [
        "(line 504,col 5)-(line 506,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.position2charno(int)",
      "begin_line": 509,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 510,col 5)-(line 510,col 61)",
        "(line 511,col 5)-(line 516,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.justTransform(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformDispatcher",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.parsing.TypeSafeDispatcher\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 523,
      "end_line": 1289,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processGeneric(com.google.javascript.rhino.head.Node)",
      "begin_line": 524,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 526,col 7)-(line 526,col 59)",
        "(line 527,col 7)-(line 529,col 7)",
        "(line 530,col 7)-(line 530,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.transformAsString(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 542,
      "end_line": 555,
      "comment": "\n     * Transforms the given node and then sets its type to Token.STRING if it\n     * was Token.NAME. If its type was already Token.STRING, then quotes it.\n     * Used for properties, as the old AST uses String tokens, while the new one\n     * uses Name tokens for unquoted strings. For example, in\n     * var o \u003d {\u0027a\u0027 : 1, b: 2};\n     * the string \u0027a\u0027 is quoted, while the name b is turned into a string, but\n     * unquoted.\n     ",
      "child_ranges": [
        "(line 543,col 7)-(line 543,col 15)",
        "(line 544,col 7)-(line 552,col 7)",
        "(line 553,col 7)-(line 553,col 47)",
        "(line 554,col 7)-(line 554,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processArrayLiteral(com.google.javascript.rhino.head.ast.ArrayLiteral)",
      "begin_line": 557,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 559,col 7)-(line 561,col 7)",
        "(line 563,col 7)-(line 563,col 42)",
        "(line 564,col 7)-(line 567,col 7)",
        "(line 568,col 7)-(line 568,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processAssignment(com.google.javascript.rhino.head.ast.Assignment)",
      "begin_line": 571,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 573,col 59)",
        "(line 574,col 7)-(line 574,col 43)",
        "(line 575,col 7)-(line 580,col 7)",
        "(line 581,col 7)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processAstRoot(com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 584,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 40)",
        "(line 587,col 7)-(line 589,col 7)",
        "(line 590,col 7)-(line 590,col 28)",
        "(line 591,col 7)-(line 591,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.parseDirectives(com.google.javascript.rhino.Node)",
      "begin_line": 603,
      "end_line": 618,
      "comment": "\n     * Parse the directives, encode them in the AST, and remove their nodes.\n     *\n     * For information on ES5 directives, see section 14.1 of\n     * ECMA-262, Edition 5.\n     *\n     * It would be nice if Rhino would eventually take care of this for\n     * us, but right now their directive-processing is a one-off.\n     ",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 36)",
        "(line 606,col 7)-(line 613,col 7)",
        "(line 615,col 7)-(line 617,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.isDirective(com.google.javascript.rhino.Node)",
      "begin_line": 620,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 621,col 7)-(line 623,col 7)",
        "(line 624,col 7)-(line 624,col 30)",
        "(line 625,col 7)-(line 627,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processBlock(com.google.javascript.rhino.head.ast.Block)",
      "begin_line": 630,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processBreakStatement(com.google.javascript.rhino.head.ast.BreakStatement)",
      "begin_line": 635,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 39)",
        "(line 638,col 7)-(line 643,col 7)",
        "(line 644,col 7)-(line 644,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processCatchClause(com.google.javascript.rhino.head.ast.CatchClause)",
      "begin_line": 647,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 49)",
        "(line 650,col 7)-(line 650,col 60)",
        "(line 651,col 7)-(line 656,col 7)",
        "(line 657,col 7)-(line 657,col 64)",
        "(line 658,col 7)-(line 658,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processConditionalExpression(com.google.javascript.rhino.head.ast.ConditionalExpression)",
      "begin_line": 661,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 663,col 7)-(line 667,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processContinueStatement(com.google.javascript.rhino.head.ast.ContinueStatement)",
      "begin_line": 670,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 672,col 7)-(line 672,col 42)",
        "(line 673,col 7)-(line 678,col 7)",
        "(line 679,col 7)-(line 679,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processDoLoop(com.google.javascript.rhino.head.ast.DoLoop)",
      "begin_line": 682,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 684,col 7)-(line 687,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processElementGet(com.google.javascript.rhino.head.ast.ElementGet)",
      "begin_line": 690,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 692,col 7)-(line 695,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processEmptyExpression(com.google.javascript.rhino.head.ast.EmptyExpression)",
      "begin_line": 698,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 700,col 7)-(line 700,col 39)",
        "(line 701,col 7)-(line 701,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processEmptyStatement(com.google.javascript.rhino.head.ast.EmptyStatement)",
      "begin_line": 704,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 39)",
        "(line 707,col 7)-(line 707,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processExpressionStatement(com.google.javascript.rhino.head.ast.ExpressionStatement)",
      "begin_line": 710,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 712,col 7)-(line 712,col 71)",
        "(line 713,col 7)-(line 713,col 68)",
        "(line 714,col 7)-(line 714,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processForInLoop(com.google.javascript.rhino.head.ast.ForInLoop)",
      "begin_line": 717,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 719,col 7)-(line 727,col 7)",
        "(line 728,col 7)-(line 732,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processForLoop(com.google.javascript.rhino.head.ast.ForLoop)",
      "begin_line": 735,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 737,col 7)-(line 741,col 46)",
        "(line 742,col 7)-(line 742,col 62)",
        "(line 743,col 7)-(line 743,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processFunctionCall(com.google.javascript.rhino.head.ast.FunctionCall)",
      "begin_line": 746,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 748,col 7)-(line 749,col 60)",
        "(line 750,col 7)-(line 752,col 7)",
        "(line 754,col 7)-(line 754,col 55)",
        "(line 755,col 7)-(line 755,col 55)",
        "(line 756,col 7)-(line 756,col 41)",
        "(line 757,col 7)-(line 757,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processFunctionNode(com.google.javascript.rhino.head.ast.FunctionNode)",
      "begin_line": 760,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 762,col 7)-(line 762,col 49)",
        "(line 763,col 7)-(line 763,col 40)",
        "(line 764,col 7)-(line 778,col 7)",
        "(line 779,col 7)-(line 779,col 42)",
        "(line 780,col 7)-(line 780,col 37)",
        "(line 781,col 7)-(line 792,col 7)",
        "(line 794,col 7)-(line 794,col 35)",
        "(line 795,col 7)-(line 795,col 42)",
        "(line 802,col 7)-(line 802,col 51)",
        "(line 803,col 7)-(line 807,col 7)",
        "(line 808,col 7)-(line 809,col 45)",
        "(line 811,col 7)-(line 811,col 50)",
        "(line 812,col 7)-(line 828,col 7)",
        "(line 829,col 7)-(line 829,col 30)",
        "(line 831,col 7)-(line 831,col 56)",
        "(line 832,col 7)-(line 838,col 7)",
        "(line 839,col 7)-(line 839,col 32)",
        "(line 840,col 7)-(line 840,col 36)",
        "(line 841,col 6)-(line 841,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processIfStatement(com.google.javascript.rhino.head.ast.IfStatement)",
      "begin_line": 844,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 846,col 7)-(line 846,col 36)",
        "(line 847,col 7)-(line 847,col 67)",
        "(line 848,col 7)-(line 848,col 71)",
        "(line 849,col 7)-(line 851,col 7)",
        "(line 852,col 7)-(line 852,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processInfixExpression(com.google.javascript.rhino.head.ast.InfixExpression)",
      "begin_line": 855,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 857,col 7)-(line 860,col 42)",
        "(line 861,col 7)-(line 861,col 40)",
        "(line 862,col 7)-(line 862,col 67)",
        "(line 863,col 7)-(line 863,col 38)",
        "(line 864,col 7)-(line 864,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processKeywordLiteral(com.google.javascript.rhino.head.ast.KeywordLiteral)",
      "begin_line": 867,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 869,col 7)-(line 869,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processLabel(com.google.javascript.rhino.head.ast.Label)",
      "begin_line": 872,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processLabeledStatement(com.google.javascript.rhino.head.ast.LabeledStatement)",
      "begin_line": 877,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 879,col 39)",
        "(line 880,col 7)-(line 880,col 23)",
        "(line 881,col 7)-(line 881,col 22)",
        "(line 882,col 7)-(line 897,col 7)",
        "(line 898,col 7)-(line 898,col 67)",
        "(line 899,col 7)-(line 899,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processName(com.google.javascript.rhino.head.ast.Name)",
      "begin_line": 902,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 7)-(line 904,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processName(com.google.javascript.rhino.head.ast.Name, boolean)",
      "begin_line": 907,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 908,col 7)-(line 918,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.isReservedKeyword(java.lang.String)",
      "begin_line": 924,
      "end_line": 926,
      "comment": "\n     * @return Whether the\n     ",
      "child_ranges": [
        "(line 925,col 7)-(line 925,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processNewExpression(com.google.javascript.rhino.head.ast.NewExpression)",
      "begin_line": 928,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 930,col 7)-(line 932,col 43)",
        "(line 933,col 7)-(line 935,col 7)",
        "(line 936,col 7)-(line 936,col 43)",
        "(line 937,col 7)-(line 937,col 70)",
        "(line 938,col 7)-(line 938,col 41)",
        "(line 939,col 7)-(line 939,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processNumberLiteral(com.google.javascript.rhino.head.ast.NumberLiteral)",
      "begin_line": 942,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 944,col 7)-(line 944,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processObjectLiteral(com.google.javascript.rhino.head.ast.ObjectLiteral)",
      "begin_line": 947,
      "end_line": 986,
      "comment": "",
      "child_ranges": [
        "(line 949,col 7)-(line 951,col 7)",
        "(line 953,col 7)-(line 953,col 43)",
        "(line 954,col 7)-(line 984,col 7)",
        "(line 985,col 7)-(line 985,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.getFnParamNode(com.google.javascript.rhino.Node)",
      "begin_line": 992,
      "end_line": 996,
      "comment": "\n     * @param fnNode The function.\n     * @return The Node containing the Function parameters.\n     ",
      "child_ranges": [
        "(line 994,col 6)-(line 994,col 54)",
        "(line 995,col 6)-(line 995,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processObjectProperty(com.google.javascript.rhino.head.ast.ObjectProperty)",
      "begin_line": 998,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 7)-(line 1000,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processParenthesizedExpression(com.google.javascript.rhino.head.ast.ParenthesizedExpression)",
      "begin_line": 1003,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 7)-(line 1005,col 54)",
        "(line 1006,col 7)-(line 1006,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processPropertyGet(com.google.javascript.rhino.head.ast.PropertyGet)",
      "begin_line": 1009,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 7)-(line 1011,col 54)",
        "(line 1012,col 7)-(line 1013,col 78)",
        "(line 1014,col 7)-(line 1014,col 47)",
        "(line 1015,col 7)-(line 1015,col 47)",
        "(line 1016,col 7)-(line 1016,col 43)",
        "(line 1017,col 7)-(line 1017,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processRegExpLiteral(com.google.javascript.rhino.head.ast.RegExpLiteral)",
      "begin_line": 1020,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 7)-(line 1022,col 69)",
        "(line 1024,col 7)-(line 1024,col 59)",
        "(line 1025,col 7)-(line 1025,col 57)",
        "(line 1026,col 7)-(line 1026,col 59)",
        "(line 1027,col 7)-(line 1027,col 44)",
        "(line 1028,col 7)-(line 1034,col 7)",
        "(line 1035,col 7)-(line 1035,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processReturnStatement(com.google.javascript.rhino.head.ast.ReturnStatement)",
      "begin_line": 1038,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 7)-(line 1040,col 40)",
        "(line 1041,col 7)-(line 1043,col 7)",
        "(line 1044,col 7)-(line 1044,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processScope(com.google.javascript.rhino.head.ast.Scope)",
      "begin_line": 1047,
      "end_line": 1050,
      "comment": "",
      "child_ranges": [
        "(line 1049,col 7)-(line 1049,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processStringLiteral(com.google.javascript.rhino.head.ast.StringLiteral)",
      "begin_line": 1052,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 7)-(line 1054,col 44)",
        "(line 1055,col 7)-(line 1055,col 36)",
        "(line 1056,col 7)-(line 1077,col 7)",
        "(line 1078,col 7)-(line 1078,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processSwitchCase(com.google.javascript.rhino.head.ast.SwitchCase)",
      "begin_line": 1081,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1083,col 7)-(line 1083,col 16)",
        "(line 1084,col 7)-(line 1089,col 7)",
        "(line 1090,col 7)-(line 1090,col 40)",
        "(line 1091,col 7)-(line 1091,col 60)",
        "(line 1092,col 7)-(line 1092,col 44)",
        "(line 1093,col 7)-(line 1093,col 71)",
        "(line 1094,col 7)-(line 1094,col 42)",
        "(line 1095,col 7)-(line 1099,col 7)",
        "(line 1100,col 7)-(line 1100,col 33)",
        "(line 1101,col 7)-(line 1101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processSwitchStatement(com.google.javascript.rhino.head.ast.SwitchStatement)",
      "begin_line": 1104,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 7)-(line 1107,col 52)",
        "(line 1108,col 7)-(line 1110,col 7)",
        "(line 1111,col 7)-(line 1111,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processThrowStatement(com.google.javascript.rhino.head.ast.ThrowStatement)",
      "begin_line": 1114,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 7)-(line 1117,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processTryStatement(com.google.javascript.rhino.head.ast.TryStatement)",
      "begin_line": 1120,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 7)-(line 1123,col 55)",
        "(line 1124,col 7)-(line 1124,col 40)",
        "(line 1125,col 7)-(line 1125,col 30)",
        "(line 1127,col 7)-(line 1136,col 7)",
        "(line 1137,col 7)-(line 1137,col 33)",
        "(line 1139,col 7)-(line 1139,col 61)",
        "(line 1140,col 7)-(line 1142,col 7)",
        "(line 1147,col 7)-(line 1150,col 7)",
        "(line 1152,col 7)-(line 1152,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processUnaryExpression(com.google.javascript.rhino.head.ast.UnaryExpression)",
      "begin_line": 1155,
      "end_line": 1191,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 7)-(line 1157,col 56)",
        "(line 1158,col 7)-(line 1158,col 54)",
        "(line 1159,col 7)-(line 1190,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.validAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 1193,
      "end_line": 1202,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 7)-(line 1200,col 7)",
        "(line 1201,col 7)-(line 1201,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processVariableDeclaration(com.google.javascript.rhino.head.ast.VariableDeclaration)",
      "begin_line": 1204,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 7)-(line 1209,col 7)",
        "(line 1211,col 7)-(line 1211,col 37)",
        "(line 1212,col 7)-(line 1214,col 7)",
        "(line 1215,col 7)-(line 1215,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processVariableInitializer(com.google.javascript.rhino.head.ast.VariableInitializer)",
      "begin_line": 1218,
      "end_line": 1226,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 7)-(line 1220,col 57)",
        "(line 1221,col 7)-(line 1224,col 7)",
        "(line 1225,col 7)-(line 1225,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processWhileLoop(com.google.javascript.rhino.head.ast.WhileLoop)",
      "begin_line": 1228,
      "end_line": 1234,
      "comment": "",
      "child_ranges": [
        "(line 1230,col 7)-(line 1233,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processWithStatement(com.google.javascript.rhino.head.ast.WithStatement)",
      "begin_line": 1236,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 7)-(line 1241,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processIllegalToken(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1244,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1246,col 7)-(line 1251,col 35)",
        "(line 1252,col 7)-(line 1252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportDestructuringAssign(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1255,
      "end_line": 1260,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 7)-(line 1259,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportGetter(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1262,
      "end_line": 1267,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 7)-(line 1266,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportSetter(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1269,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1270,col 7)-(line 1273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportGetterParam(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1276,
      "end_line": 1281,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 7)-(line 1280,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportSetterParam(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1283,
      "end_line": 1288,
      "comment": "",
      "child_ranges": [
        "(line 1284,col 7)-(line 1287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(int)",
      "begin_line": 1291,
      "end_line": 1471,
      "comment": "",
      "child_ranges": [
        "(line 1292,col 5)-(line 1467,col 5)",
        "(line 1470,col 5)-(line 1470,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int)",
      "begin_line": 1474,
      "end_line": 1476,
      "comment": " Simple helper to create nodes and set the initial node properties.",
      "child_ranges": [
        "(line 1475,col 5)-(line 1475,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node)",
      "begin_line": 1478,
      "end_line": 1480,
      "comment": "",
      "child_ranges": [
        "(line 1479,col 5)-(line 1479,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1482,
      "end_line": 1484,
      "comment": "",
      "child_ranges": [
        "(line 1483,col 5)-(line 1483,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1486,
      "end_line": 1488,
      "comment": "",
      "child_ranges": [
        "(line 1487,col 5)-(line 1487,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newStringNode(java.lang.String)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "",
      "child_ranges": [
        "(line 1491,col 5)-(line 1491,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newStringNode(int, java.lang.String)",
      "begin_line": 1494,
      "end_line": 1496,
      "comment": "",
      "child_ranges": [
        "(line 1495,col 5)-(line 1495,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNumberNode(java.lang.Double)",
      "begin_line": 1498,
      "end_line": 1500,
      "comment": "",
      "child_ranges": [
        "(line 1499,col 5)-(line 1499,col 57)"
      ]
    }
  ]
}