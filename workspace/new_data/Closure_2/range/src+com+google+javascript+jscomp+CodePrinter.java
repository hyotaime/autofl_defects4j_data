{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodePrinter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 683,
      "comment": "\n * CodePrinter prints out JS code in either pretty format or compact format.\n *\n * @see CodeGenerator\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LINE_LENGTH_THRESHOLD"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The number of characters after which we insert a line break in the code"
    },
    {
      "type": "class_interface",
      "name": "MappedCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeConsumer"
      ],
      "begin_line": 47,
      "end_line": 217,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allMappings"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createSrcMap"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLengthThreshold"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineIndex"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.MappedCodePrinter(int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 57,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 61,col 7)-(line 61,col 61)",
        "(line 62,col 7)-(line 63,col 28)",
        "(line 64,col 7)-(line 64,col 39)",
        "(line 65,col 7)-(line 65,col 55)",
        "(line 66,col 7)-(line 66,col 70)",
        "(line 67,col 7)-(line 67,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Maintains a mapping from a given node to the position\n     * in the source code at which its generated form was\n     * placed. This position is relative only to the current\n     * run of the CodeConsumer and will be normalized\n     * later on by the SourceMap.\n     *\n     * @see SourceMap\n     "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.startSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 89,
      "end_line": 106,
      "comment": "\n     * Starts the source mapping for the given\n     * node at the current position.\n     ",
      "child_ranges": [
        "(line 91,col 7)-(line 91,col 61)",
        "(line 92,col 7)-(line 92,col 45)",
        "(line 93,col 7)-(line 105,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.endSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n     * Finishes the source mapping for the given\n     * node at the current position.\n     ",
      "child_ranges": [
        "(line 114,col 7)-(line 120,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.generateSourceMap(com.google.javascript.jscomp.SourceMap)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Generates the source map from the given code consumer,\n     * appending the information it saved to the SourceMap\n     * object given.\n     ",
      "child_ranges": [
        "(line 129,col 7)-(line 133,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.reportLineCut(int, int, boolean)",
      "begin_line": 143,
      "end_line": 155,
      "comment": "\n     * Reports to the code consumer that the given line has been cut at the\n     * given position, i.e. a \\n has been inserted there. Or that a cut has\n     * been undone, i.e. a previously inserted \\n has been removed.\n     * All mappings in the source maps after that position will be renormalized\n     * as needed.\n     ",
      "child_ranges": [
        "(line 144,col 7)-(line 154,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.convertPosition(com.google.debugging.sourcemap.FilePosition, int, int, boolean)",
      "begin_line": 172,
      "end_line": 199,
      "comment": "\n     * Converts the given position by normalizing it against the insertion\n     * or removal of a newline at the given line and character position.\n     *\n     * @param position The existing position before the newline was inserted.\n     * @param lineIndex The index of the line at which the newline was inserted.\n     * @param characterPosition The position on the line at which the newline\n     *     was inserted.\n     * @param insertion True if a newline was inserted, false if a newline was\n     *     removed.\n     *\n     * @return The normalized position.\n     * @throws IllegalStateException if an attempt to reverse a line cut is\n     *     made on a previous line rather than the current line.\n     ",
      "child_ranges": [
        "(line 174,col 7)-(line 174,col 44)",
        "(line 175,col 7)-(line 175,col 46)",
        "(line 176,col 7)-(line 198,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCode()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 7)-(line 202,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getLastChar()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 207,col 7)-(line 207,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCurrentCharIndex()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 7)-(line 211,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCurrentLineIndex()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 7)-(line 215,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrettyCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter"
      ],
      "begin_line": 219,
      "end_line": 399,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INDENT"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " The number of characters after which we insert a line break in the code"
    },
    {
      "type": "field",
      "varNames": [
        "indent"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.PrettyCodePrinter(int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * @param lineLengthThreshold The length of a line after which we force\n     *                            a newline when possible.\n     * @param createSourceMap Whether to generate source map data.\n     * @param sourceMapDetailLevel A filter to control which nodes get mapped\n     *     into the source map.\n     ",
      "child_ranges": [
        "(line 237,col 7)-(line 237,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.append(java.lang.String)",
      "begin_line": 243,
      "end_line": 254,
      "comment": "\n     * Appends a string to the code, keeping track of the current line length.\n     ",
      "child_ranges": [
        "(line 246,col 7)-(line 251,col 7)",
        "(line 252,col 7)-(line 252,col 23)",
        "(line 253,col 7)-(line 253,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.startNewLine()",
      "begin_line": 260,
      "end_line": 267,
      "comment": "\n     * Adds a newline to the code, resetting the line length and handling\n     * indenting for pretty printing.\n     ",
      "child_ranges": [
        "(line 262,col 7)-(line 266,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.maybeLineBreak()",
      "begin_line": 269,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 7)-(line 271,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.maybeCutLine()",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * This may start a new line if the current line is longer than the line\n     * length threshold.\n     ",
      "child_ranges": [
        "(line 280,col 7)-(line 282,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endLine()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 287,col 7)-(line 287,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendBlockStart()",
      "begin_line": 290,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 292,col 7)-(line 292,col 19)",
        "(line 293,col 7)-(line 293,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendBlockEnd()",
      "begin_line": 296,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 298,col 7)-(line 298,col 16)",
        "(line 299,col 7)-(line 299,col 15)",
        "(line 300,col 7)-(line 300,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.listSeparator()",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 305,col 7)-(line 305,col 16)",
        "(line 306,col 7)-(line 306,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endFunction(boolean)",
      "begin_line": 309,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 311,col 7)-(line 311,col 42)",
        "(line 312,col 7)-(line 314,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.beginCaseBody()",
      "begin_line": 317,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 319,col 7)-(line 319,col 28)",
        "(line 320,col 7)-(line 320,col 15)",
        "(line 321,col 7)-(line 321,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endCaseBody()",
      "begin_line": 324,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 326,col 7)-(line 326,col 26)",
        "(line 327,col 7)-(line 327,col 15)",
        "(line 328,col 7)-(line 328,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendOp(java.lang.String, boolean)",
      "begin_line": 331,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 333,col 7)-(line 341,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.shouldPreserveExtraBlocks()",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * If the body of a for loop or the then clause of an if statement has\n     * a single statement, should it be wrapped in a block?\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 354,col 7)-(line 354,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.getTryForCatch(com.google.javascript.rhino.Node)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * @return The TRY node for the specified CATCH node.\n     ",
      "child_ranges": [
        "(line 361,col 7)-(line 361,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.breakAfterBlockFor(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 368,
      "end_line": 393,
      "comment": "\n     * @return Whether the a line break should be added after the specified\n     * BLOCK.\n     ",
      "child_ranges": [
        "(line 370,col 7)-(line 370,col 44)",
        "(line 371,col 7)-(line 371,col 34)",
        "(line 372,col 7)-(line 391,col 7)",
        "(line 392,col 7)-(line 392,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endFile()",
      "begin_line": 395,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 7)-(line 397,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CompactCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter"
      ],
      "begin_line": 402,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineBreak"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferLineBreakAtEndOfFile"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineStartPosition"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferredBreakPosition"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevCutPosition"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevLineStartPosition"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.CompactCodePrinter(boolean, boolean, int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n   * @param lineBreak break the lines a bit more aggressively\n   * @param lineLengthThreshold The length of a line after which we force\n   *                            a newline when possible.\n   * @param createSrcMap Whether to gather source position\n   *                            mapping information when printing.\n   * @param sourceMapDetailLevel A filter to control which nodes get mapped into\n   *     the source map.\n   ",
      "child_ranges": [
        "(line 434,col 7)-(line 434,col 69)",
        "(line 435,col 7)-(line 435,col 33)",
        "(line 436,col 7)-(line 436,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.append(java.lang.String)",
      "begin_line": 442,
      "end_line": 446,
      "comment": "\n     * Appends a string to the code, keeping track of the current line length.\n     ",
      "child_ranges": [
        "(line 444,col 7)-(line 444,col 23)",
        "(line 445,col 7)-(line 445,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.startNewLine()",
      "begin_line": 451,
      "end_line": 461,
      "comment": "\n     * Adds a newline to the code, resetting the line length.\n     ",
      "child_ranges": [
        "(line 453,col 7)-(line 460,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.maybeLineBreak()",
      "begin_line": 463,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 465,col 7)-(line 470,col 7)",
        "(line 475,col 7)-(line 475,col 30)",
        "(line 476,col 7)-(line 481,col 7)",
        "(line 482,col 7)-(line 482,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.maybeCutLine()",
      "begin_line": 489,
      "end_line": 506,
      "comment": "\n     * This may start a new line if the current line is longer than the line\n     * length threshold.\n     ",
      "child_ranges": [
        "(line 491,col 7)-(line 505,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.notePreferredLineBreak()",
      "begin_line": 508,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 510,col 7)-(line 510,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.endFile()",
      "begin_line": 513,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 515,col 7)-(line 515,col 22)",
        "(line 516,col 7)-(line 518,col 7)",
        "(line 519,col 7)-(line 540,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 545,
      "end_line": 635,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputTypes"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMap"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagAsStrict"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.Builder(com.google.javascript.rhino.Node)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Sets the root node from which to generate the source code.\n     * @param node The root node.\n     ",
      "child_ranges": [
        "(line 557,col 7)-(line 557,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setCompilerOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 563,
      "end_line": 570,
      "comment": "\n     * Sets the output options from compiler options.\n     ",
      "child_ranges": [
        "(line 564,col 7)-(line 568,col 7)",
        "(line 569,col 7)-(line 569,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setPrettyPrint(boolean)",
      "begin_line": 576,
      "end_line": 579,
      "comment": "\n     * Sets whether pretty printing should be used.\n     * @param prettyPrint If true, pretty printing will be used.\n     ",
      "child_ranges": [
        "(line 577,col 7)-(line 577,col 40)",
        "(line 578,col 7)-(line 578,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setLineBreak(boolean)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "\n     * Sets whether line breaking should be done automatically.\n     * @param lineBreak If true, line breaking is done automatically.\n     ",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 36)",
        "(line 587,col 7)-(line 587,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setOutputTypes(boolean)",
      "begin_line": 594,
      "end_line": 597,
      "comment": "\n     * Sets whether to output closure-style type annotations.\n     * @param outputTypes If true, outputs closure-style type annotations.\n     ",
      "child_ranges": [
        "(line 595,col 7)-(line 595,col 37)",
        "(line 596,col 7)-(line 596,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setSourceMap(com.google.javascript.jscomp.SourceMap)",
      "begin_line": 605,
      "end_line": 608,
      "comment": "\n     * Sets the source map to which to write the metadata about\n     * the generated source code.\n     *\n     * @param sourceMap The source map.\n     ",
      "child_ranges": [
        "(line 606,col 7)-(line 606,col 33)",
        "(line 607,col 7)-(line 607,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setTagAsStrict(boolean)",
      "begin_line": 613,
      "end_line": 616,
      "comment": "\n     * Set whether the output should be tags as ECMASCRIPT 5 Strict.\n     ",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 37)",
        "(line 615,col 7)-(line 615,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.build()",
      "begin_line": 621,
      "end_line": 634,
      "comment": "\n     * Generates the source code and returns it.\n     ",
      "child_ranges": [
        "(line 622,col 7)-(line 625,col 7)",
        "(line 627,col 7)-(line 631,col 31)",
        "(line 633,col 7)-(line 633,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter.Format, com.google.javascript.jscomp.CompilerOptions, com.google.javascript.jscomp.SourceMap, boolean)",
      "begin_line": 646,
      "end_line": 682,
      "comment": "\n   * Converts a tree to JS code\n   ",
      "child_ranges": [
        "(line 648,col 5)-(line 648,col 67)",
        "(line 650,col 5)-(line 650,col 50)",
        "(line 651,col 5)-(line 662,col 42)",
        "(line 663,col 5)-(line 666,col 42)",
        "(line 668,col 5)-(line 670,col 5)",
        "(line 672,col 5)-(line 672,col 17)",
        "(line 673,col 5)-(line 673,col 18)",
        "(line 675,col 5)-(line 675,col 32)",
        "(line 677,col 5)-(line 679,col 5)",
        "(line 681,col 5)-(line 681,col 16)"
      ]
    }
  ]
}