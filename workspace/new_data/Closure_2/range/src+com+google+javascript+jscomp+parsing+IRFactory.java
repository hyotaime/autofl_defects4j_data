{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/parsing/IRFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IRFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 81,
      "end_line": 1449,
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
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.validateTypeAnnotations(com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.Node)",
      "begin_line": 289,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 340,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.isPropAccess(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 343,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 345,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.isExprStmt(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 350,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transform(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 353,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 354,col 38)",
        "(line 355,col 5)-(line 355,col 52)",
        "(line 356,col 5)-(line 359,col 5)",
        "(line 360,col 5)-(line 360,col 32)",
        "(line 361,col 5)-(line 361,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.maybeInjectCastNode(com.google.javascript.rhino.head.ast.AstNode, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)",
      "begin_line": 364,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 371,col 5)",
        "(line 372,col 5)-(line 372,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformNameAsString(com.google.javascript.rhino.head.ast.Name)",
      "begin_line": 375,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 62)",
        "(line 377,col 5)-(line 377,col 52)",
        "(line 378,col 5)-(line 380,col 5)",
        "(line 381,col 5)-(line 381,col 32)",
        "(line 382,col 5)-(line 382,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformNumberAsString(com.google.javascript.rhino.head.ast.NumberLiteral)",
      "begin_line": 385,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 73)",
        "(line 387,col 5)-(line 387,col 59)",
        "(line 388,col 5)-(line 390,col 5)",
        "(line 391,col 5)-(line 391,col 39)",
        "(line 392,col 5)-(line 392,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.getStringValue(double)",
      "begin_line": 395,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 396,col 34)",
        "(line 399,col 5)-(line 403,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.setSourceInfo(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 406,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 416,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment, com.google.javascript.rhino.Node)",
      "begin_line": 430,
      "end_line": 450,
      "comment": "\n   * Creates a JsDocInfoParser and parses the JsDoc string.\n   *\n   * Used both for handling individual JSDoc comments and for handling\n   * file-level JSDoc comments (@fileoverview and @license).\n   *\n   * @param node The JsDoc Comment node to parse.\n   * @param irNode\n   * @return A JsDocInfoParser. Will contain either fileoverview JsDoc, or\n   *     normal JsDoc, or no JsDoc (if the method parses to the wrong level).\n   ",
      "child_ranges": [
        "(line 431,col 5)-(line 431,col 37)",
        "(line 432,col 5)-(line 432,col 34)",
        "(line 433,col 5)-(line 433,col 46)",
        "(line 436,col 5)-(line 436,col 28)",
        "(line 437,col 5)-(line 445,col 25)",
        "(line 446,col 5)-(line 446,col 64)",
        "(line 447,col 5)-(line 447,col 59)",
        "(line 448,col 5)-(line 448,col 24)",
        "(line 449,col 5)-(line 449,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.maybeSetLengthFrom(com.google.javascript.rhino.Node, com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 453,
      "end_line": 457,
      "comment": " Set the length on the node if we\u0027re in IDE mode.",
      "child_ranges": [
        "(line 454,col 5)-(line 456,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.position2charno(int)",
      "begin_line": 459,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 61)",
        "(line 461,col 5)-(line 466,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.justTransform(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 5)-(line 470,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformDispatcher",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.parsing.TypeSafeDispatcher\u003ccom.google.javascript.rhino.Node\u003e"
      ],
      "begin_line": 473,
      "end_line": 1237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processGeneric(com.google.javascript.rhino.head.Node)",
      "begin_line": 474,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 476,col 7)-(line 476,col 59)",
        "(line 477,col 7)-(line 479,col 7)",
        "(line 480,col 7)-(line 480,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.transformAsString(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 492,
      "end_line": 505,
      "comment": "\n     * Transforms the given node and then sets its type to Token.STRING if it\n     * was Token.NAME. If its type was already Token.STRING, then quotes it.\n     * Used for properties, as the old AST uses String tokens, while the new one\n     * uses Name tokens for unquoted strings. For example, in\n     * var o \u003d {\u0027a\u0027 : 1, b: 2};\n     * the string \u0027a\u0027 is quoted, while the name b is turned into a string, but\n     * unquoted.\n     ",
      "child_ranges": [
        "(line 493,col 7)-(line 493,col 15)",
        "(line 494,col 7)-(line 502,col 7)",
        "(line 503,col 7)-(line 503,col 47)",
        "(line 504,col 7)-(line 504,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processArrayLiteral(com.google.javascript.rhino.head.ast.ArrayLiteral)",
      "begin_line": 507,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 509,col 7)-(line 511,col 7)",
        "(line 513,col 7)-(line 513,col 42)",
        "(line 514,col 7)-(line 517,col 7)",
        "(line 518,col 7)-(line 518,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processAssignment(com.google.javascript.rhino.head.ast.Assignment)",
      "begin_line": 521,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 523,col 7)-(line 523,col 59)",
        "(line 524,col 7)-(line 524,col 43)",
        "(line 525,col 7)-(line 530,col 7)",
        "(line 531,col 7)-(line 531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processAstRoot(com.google.javascript.rhino.head.ast.AstRoot)",
      "begin_line": 534,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 536,col 7)-(line 536,col 40)",
        "(line 537,col 7)-(line 539,col 7)",
        "(line 540,col 7)-(line 540,col 28)",
        "(line 541,col 7)-(line 541,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.parseDirectives(com.google.javascript.rhino.Node)",
      "begin_line": 553,
      "end_line": 568,
      "comment": "\n     * Parse the directives, encode them in the AST, and remove their nodes.\n     *\n     * For information on ES5 directives, see section 14.1 of\n     * ECMA-262, Edition 5.\n     *\n     * It would be nice if Rhino would eventually take care of this for\n     * us, but right now their directive-processing is a one-off.\n     ",
      "child_ranges": [
        "(line 555,col 7)-(line 555,col 36)",
        "(line 556,col 7)-(line 563,col 7)",
        "(line 565,col 7)-(line 567,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.isDirective(com.google.javascript.rhino.Node)",
      "begin_line": 570,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 571,col 7)-(line 571,col 34)",
        "(line 573,col 7)-(line 573,col 30)",
        "(line 574,col 7)-(line 576,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processBlock(com.google.javascript.rhino.head.ast.Block)",
      "begin_line": 579,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 7)-(line 581,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processBreakStatement(com.google.javascript.rhino.head.ast.BreakStatement)",
      "begin_line": 584,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 39)",
        "(line 587,col 7)-(line 592,col 7)",
        "(line 593,col 7)-(line 593,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processCatchClause(com.google.javascript.rhino.head.ast.CatchClause)",
      "begin_line": 596,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 598,col 7)-(line 598,col 49)",
        "(line 599,col 7)-(line 599,col 60)",
        "(line 600,col 7)-(line 605,col 7)",
        "(line 606,col 7)-(line 606,col 64)",
        "(line 607,col 7)-(line 607,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processConditionalExpression(com.google.javascript.rhino.head.ast.ConditionalExpression)",
      "begin_line": 610,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 612,col 7)-(line 616,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processContinueStatement(com.google.javascript.rhino.head.ast.ContinueStatement)",
      "begin_line": 619,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 621,col 7)-(line 621,col 42)",
        "(line 622,col 7)-(line 627,col 7)",
        "(line 628,col 7)-(line 628,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processDoLoop(com.google.javascript.rhino.head.ast.DoLoop)",
      "begin_line": 631,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 633,col 7)-(line 636,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processElementGet(com.google.javascript.rhino.head.ast.ElementGet)",
      "begin_line": 639,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 641,col 7)-(line 644,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processEmptyExpression(com.google.javascript.rhino.head.ast.EmptyExpression)",
      "begin_line": 647,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 39)",
        "(line 650,col 7)-(line 650,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processEmptyStatement(com.google.javascript.rhino.head.ast.EmptyStatement)",
      "begin_line": 653,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 655,col 7)-(line 655,col 39)",
        "(line 656,col 7)-(line 656,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processExpressionStatement(com.google.javascript.rhino.head.ast.ExpressionStatement)",
      "begin_line": 659,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 661,col 7)-(line 661,col 71)",
        "(line 662,col 7)-(line 662,col 68)",
        "(line 663,col 7)-(line 663,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processForInLoop(com.google.javascript.rhino.head.ast.ForInLoop)",
      "begin_line": 666,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 668,col 7)-(line 676,col 7)",
        "(line 677,col 7)-(line 681,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processForLoop(com.google.javascript.rhino.head.ast.ForLoop)",
      "begin_line": 684,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 690,col 46)",
        "(line 691,col 7)-(line 691,col 62)",
        "(line 692,col 7)-(line 692,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processFunctionCall(com.google.javascript.rhino.head.ast.FunctionCall)",
      "begin_line": 695,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 697,col 7)-(line 698,col 60)",
        "(line 699,col 7)-(line 701,col 7)",
        "(line 703,col 7)-(line 703,col 55)",
        "(line 704,col 7)-(line 704,col 55)",
        "(line 705,col 7)-(line 705,col 41)",
        "(line 706,col 7)-(line 706,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processFunctionNode(com.google.javascript.rhino.head.ast.FunctionNode)",
      "begin_line": 709,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 711,col 7)-(line 711,col 49)",
        "(line 712,col 7)-(line 712,col 40)",
        "(line 713,col 7)-(line 727,col 7)",
        "(line 728,col 7)-(line 728,col 42)",
        "(line 729,col 7)-(line 729,col 37)",
        "(line 730,col 7)-(line 741,col 7)",
        "(line 743,col 7)-(line 743,col 35)",
        "(line 744,col 7)-(line 744,col 42)",
        "(line 751,col 7)-(line 751,col 51)",
        "(line 752,col 7)-(line 756,col 7)",
        "(line 757,col 7)-(line 758,col 45)",
        "(line 760,col 7)-(line 760,col 50)",
        "(line 761,col 7)-(line 777,col 7)",
        "(line 778,col 7)-(line 778,col 30)",
        "(line 780,col 7)-(line 780,col 56)",
        "(line 781,col 7)-(line 787,col 7)",
        "(line 788,col 7)-(line 788,col 32)",
        "(line 789,col 7)-(line 789,col 36)",
        "(line 790,col 6)-(line 790,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processIfStatement(com.google.javascript.rhino.head.ast.IfStatement)",
      "begin_line": 793,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 795,col 7)-(line 795,col 36)",
        "(line 796,col 7)-(line 796,col 67)",
        "(line 797,col 7)-(line 797,col 71)",
        "(line 798,col 7)-(line 800,col 7)",
        "(line 801,col 7)-(line 801,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processInfixExpression(com.google.javascript.rhino.head.ast.InfixExpression)",
      "begin_line": 804,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 806,col 7)-(line 809,col 42)",
        "(line 810,col 7)-(line 810,col 40)",
        "(line 811,col 7)-(line 811,col 67)",
        "(line 812,col 7)-(line 812,col 38)",
        "(line 813,col 7)-(line 813,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processKeywordLiteral(com.google.javascript.rhino.head.ast.KeywordLiteral)",
      "begin_line": 816,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 818,col 7)-(line 818,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processLabel(com.google.javascript.rhino.head.ast.Label)",
      "begin_line": 821,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 823,col 7)-(line 823,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processLabeledStatement(com.google.javascript.rhino.head.ast.LabeledStatement)",
      "begin_line": 826,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 828,col 7)-(line 828,col 39)",
        "(line 829,col 7)-(line 829,col 23)",
        "(line 830,col 7)-(line 830,col 22)",
        "(line 831,col 7)-(line 846,col 7)",
        "(line 847,col 7)-(line 847,col 67)",
        "(line 848,col 7)-(line 848,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processName(com.google.javascript.rhino.head.ast.Name)",
      "begin_line": 851,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 853,col 7)-(line 853,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processName(com.google.javascript.rhino.head.ast.Name, boolean)",
      "begin_line": 856,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 857,col 7)-(line 867,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.isReservedKeyword(java.lang.String)",
      "begin_line": 873,
      "end_line": 875,
      "comment": "\n     * @return Whether the\n     ",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processNewExpression(com.google.javascript.rhino.head.ast.NewExpression)",
      "begin_line": 877,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 881,col 43)",
        "(line 882,col 7)-(line 884,col 7)",
        "(line 885,col 7)-(line 885,col 43)",
        "(line 886,col 7)-(line 886,col 70)",
        "(line 887,col 7)-(line 887,col 41)",
        "(line 888,col 7)-(line 888,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processNumberLiteral(com.google.javascript.rhino.head.ast.NumberLiteral)",
      "begin_line": 891,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 893,col 7)-(line 893,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processObjectLiteral(com.google.javascript.rhino.head.ast.ObjectLiteral)",
      "begin_line": 896,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 898,col 7)-(line 900,col 7)",
        "(line 902,col 7)-(line 902,col 43)",
        "(line 903,col 7)-(line 933,col 7)",
        "(line 934,col 7)-(line 934,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.getFnParamNode(com.google.javascript.rhino.Node)",
      "begin_line": 941,
      "end_line": 945,
      "comment": "\n     * @param fnNode The function.\n     * @return The Node containing the Function parameters.\n     ",
      "child_ranges": [
        "(line 943,col 6)-(line 943,col 54)",
        "(line 944,col 6)-(line 944,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processObjectProperty(com.google.javascript.rhino.head.ast.ObjectProperty)",
      "begin_line": 947,
      "end_line": 950,
      "comment": "",
      "child_ranges": [
        "(line 949,col 7)-(line 949,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processParenthesizedExpression(com.google.javascript.rhino.head.ast.ParenthesizedExpression)",
      "begin_line": 952,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 954,col 7)-(line 954,col 54)",
        "(line 955,col 7)-(line 955,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processPropertyGet(com.google.javascript.rhino.head.ast.PropertyGet)",
      "begin_line": 958,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 960,col 7)-(line 960,col 54)",
        "(line 961,col 7)-(line 962,col 78)",
        "(line 963,col 7)-(line 963,col 47)",
        "(line 964,col 7)-(line 964,col 47)",
        "(line 965,col 7)-(line 965,col 43)",
        "(line 966,col 7)-(line 966,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processRegExpLiteral(com.google.javascript.rhino.head.ast.RegExpLiteral)",
      "begin_line": 969,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 971,col 7)-(line 971,col 69)",
        "(line 973,col 7)-(line 973,col 59)",
        "(line 974,col 7)-(line 974,col 57)",
        "(line 975,col 7)-(line 975,col 59)",
        "(line 976,col 7)-(line 976,col 44)",
        "(line 977,col 7)-(line 983,col 7)",
        "(line 984,col 7)-(line 984,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processReturnStatement(com.google.javascript.rhino.head.ast.ReturnStatement)",
      "begin_line": 987,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 989,col 7)-(line 989,col 40)",
        "(line 990,col 7)-(line 992,col 7)",
        "(line 993,col 7)-(line 993,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processScope(com.google.javascript.rhino.head.ast.Scope)",
      "begin_line": 996,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 998,col 7)-(line 998,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processStringLiteral(com.google.javascript.rhino.head.ast.StringLiteral)",
      "begin_line": 1001,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1003,col 7)-(line 1003,col 44)",
        "(line 1004,col 7)-(line 1004,col 36)",
        "(line 1005,col 7)-(line 1026,col 7)",
        "(line 1027,col 7)-(line 1027,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processSwitchCase(com.google.javascript.rhino.head.ast.SwitchCase)",
      "begin_line": 1030,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 7)-(line 1032,col 16)",
        "(line 1033,col 7)-(line 1038,col 7)",
        "(line 1039,col 7)-(line 1039,col 40)",
        "(line 1040,col 7)-(line 1040,col 60)",
        "(line 1041,col 7)-(line 1041,col 44)",
        "(line 1042,col 7)-(line 1042,col 71)",
        "(line 1043,col 7)-(line 1043,col 42)",
        "(line 1044,col 7)-(line 1048,col 7)",
        "(line 1049,col 7)-(line 1049,col 33)",
        "(line 1050,col 7)-(line 1050,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processSwitchStatement(com.google.javascript.rhino.head.ast.SwitchStatement)",
      "begin_line": 1053,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 7)-(line 1056,col 52)",
        "(line 1057,col 7)-(line 1059,col 7)",
        "(line 1060,col 7)-(line 1060,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processThrowStatement(com.google.javascript.rhino.head.ast.ThrowStatement)",
      "begin_line": 1063,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 7)-(line 1066,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processTryStatement(com.google.javascript.rhino.head.ast.TryStatement)",
      "begin_line": 1069,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 7)-(line 1072,col 55)",
        "(line 1073,col 7)-(line 1073,col 40)",
        "(line 1074,col 7)-(line 1074,col 30)",
        "(line 1076,col 7)-(line 1085,col 7)",
        "(line 1086,col 7)-(line 1086,col 33)",
        "(line 1088,col 7)-(line 1088,col 61)",
        "(line 1089,col 7)-(line 1091,col 7)",
        "(line 1096,col 7)-(line 1099,col 7)",
        "(line 1101,col 7)-(line 1101,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processUnaryExpression(com.google.javascript.rhino.head.ast.UnaryExpression)",
      "begin_line": 1104,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 7)-(line 1106,col 56)",
        "(line 1107,col 7)-(line 1107,col 54)",
        "(line 1108,col 7)-(line 1139,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.validAssignmentTarget(com.google.javascript.rhino.Node)",
      "begin_line": 1142,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1143,col 7)-(line 1148,col 7)",
        "(line 1149,col 7)-(line 1149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processVariableDeclaration(com.google.javascript.rhino.head.ast.VariableDeclaration)",
      "begin_line": 1152,
      "end_line": 1164,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 7)-(line 1157,col 7)",
        "(line 1159,col 7)-(line 1159,col 37)",
        "(line 1160,col 7)-(line 1162,col 7)",
        "(line 1163,col 7)-(line 1163,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processVariableInitializer(com.google.javascript.rhino.head.ast.VariableInitializer)",
      "begin_line": 1166,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1168,col 7)-(line 1168,col 57)",
        "(line 1169,col 7)-(line 1172,col 7)",
        "(line 1173,col 7)-(line 1173,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processWhileLoop(com.google.javascript.rhino.head.ast.WhileLoop)",
      "begin_line": 1176,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1178,col 7)-(line 1181,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processWithStatement(com.google.javascript.rhino.head.ast.WithStatement)",
      "begin_line": 1184,
      "end_line": 1190,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 7)-(line 1189,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.processIllegalToken(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1192,
      "end_line": 1201,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 7)-(line 1199,col 35)",
        "(line 1200,col 7)-(line 1200,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportDestructuringAssign(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1203,
      "end_line": 1208,
      "comment": "",
      "child_ranges": [
        "(line 1204,col 7)-(line 1207,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportGetter(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1210,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1211,col 7)-(line 1214,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportSetter(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1217,
      "end_line": 1222,
      "comment": "",
      "child_ranges": [
        "(line 1218,col 7)-(line 1221,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportGetterParam(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1224,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1225,col 7)-(line 1228,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher.reportSetterParam(com.google.javascript.rhino.head.ast.AstNode)",
      "begin_line": 1231,
      "end_line": 1236,
      "comment": "",
      "child_ranges": [
        "(line 1232,col 7)-(line 1235,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(int)",
      "begin_line": 1239,
      "end_line": 1419,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1415,col 5)",
        "(line 1418,col 5)-(line 1418,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int)",
      "begin_line": 1422,
      "end_line": 1424,
      "comment": " Simple helper to create nodes and set the initial node properties.",
      "child_ranges": [
        "(line 1423,col 5)-(line 1423,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node)",
      "begin_line": 1426,
      "end_line": 1428,
      "comment": "",
      "child_ranges": [
        "(line 1427,col 5)-(line 1427,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "",
      "child_ranges": [
        "(line 1431,col 5)-(line 1431,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNode(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 1434,
      "end_line": 1436,
      "comment": "",
      "child_ranges": [
        "(line 1435,col 5)-(line 1435,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newStringNode(java.lang.String)",
      "begin_line": 1438,
      "end_line": 1440,
      "comment": "",
      "child_ranges": [
        "(line 1439,col 5)-(line 1439,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newStringNode(int, java.lang.String)",
      "begin_line": 1442,
      "end_line": 1444,
      "comment": "",
      "child_ranges": [
        "(line 1443,col 5)-(line 1443,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.IRFactory.newNumberNode(java.lang.Double)",
      "begin_line": 1446,
      "end_line": 1448,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 5)-(line 1447,col 57)"
      ]
    }
  ]
}