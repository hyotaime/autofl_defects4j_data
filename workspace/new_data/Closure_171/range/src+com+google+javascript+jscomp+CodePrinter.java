{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CodePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodePrinter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 692,
      "comment": "\n * CodePrinter prints out JS code in either pretty format or compact format.\n *\n * @see CodeGenerator\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LINE_LENGTH_THRESHOLD"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The number of characters after which we insert a line break in the code"
    },
    {
      "type": "class_interface",
      "name": "MappedCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeConsumer"
      ],
      "begin_line": 48,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allMappings"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createSrcMap"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapDetailLevel"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "code"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLengthThreshold"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineLength"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineIndex"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.MappedCodePrinter(int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 58,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 61)",
        "(line 63,col 7)-(line 64,col 28)",
        "(line 65,col 7)-(line 65,col 39)",
        "(line 66,col 7)-(line 66,col 55)",
        "(line 67,col 7)-(line 67,col 70)",
        "(line 68,col 7)-(line 68,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Maintains a mapping from a given node to the position\n     * in the source code at which its generated form was\n     * placed. This position is relative only to the current\n     * run of the CodeConsumer and will be normalized\n     * later on by the SourceMap.\n     *\n     * @see SourceMap\n     "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.startSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 90,
      "end_line": 107,
      "comment": "\n     * Starts the source mapping for the given\n     * node at the current position.\n     ",
      "child_ranges": [
        "(line 92,col 7)-(line 92,col 61)",
        "(line 93,col 7)-(line 93,col 45)",
        "(line 94,col 7)-(line 106,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.endSourceMapping(com.google.javascript.rhino.Node)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\n     * Finishes the source mapping for the given\n     * node at the current position.\n     ",
      "child_ranges": [
        "(line 115,col 7)-(line 121,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.generateSourceMap(com.google.javascript.jscomp.SourceMap)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\n     * Generates the source map from the given code consumer,\n     * appending the information it saved to the SourceMap\n     * object given.\n     ",
      "child_ranges": [
        "(line 130,col 7)-(line 134,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.reportLineCut(int, int, boolean)",
      "begin_line": 144,
      "end_line": 156,
      "comment": "\n     * Reports to the code consumer that the given line has been cut at the\n     * given position, i.e. a \\n has been inserted there. Or that a cut has\n     * been undone, i.e. a previously inserted \\n has been removed.\n     * All mappings in the source maps after that position will be renormalized\n     * as needed.\n     ",
      "child_ranges": [
        "(line 145,col 7)-(line 155,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.convertPosition(com.google.debugging.sourcemap.FilePosition, int, int, boolean)",
      "begin_line": 173,
      "end_line": 200,
      "comment": "\n     * Converts the given position by normalizing it against the insertion\n     * or removal of a newline at the given line and character position.\n     *\n     * @param position The existing position before the newline was inserted.\n     * @param lineIndex The index of the line at which the newline was inserted.\n     * @param characterPosition The position on the line at which the newline\n     *     was inserted.\n     * @param insertion True if a newline was inserted, false if a newline was\n     *     removed.\n     *\n     * @return The normalized position.\n     * @throws IllegalStateException if an attempt to reverse a line cut is\n     *     made on a previous line rather than the current line.\n     ",
      "child_ranges": [
        "(line 175,col 7)-(line 175,col 44)",
        "(line 176,col 7)-(line 176,col 46)",
        "(line 177,col 7)-(line 199,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCode()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 7)-(line 203,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getLastChar()",
      "begin_line": 206,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 208,col 7)-(line 208,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCurrentCharIndex()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 212,col 7)-(line 212,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter.getCurrentLineIndex()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 216,col 7)-(line 216,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PrettyCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter"
      ],
      "begin_line": 220,
      "end_line": 400,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INDENT"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " The number of characters after which we insert a line break in the code"
    },
    {
      "type": "field",
      "varNames": [
        "indent"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.PrettyCodePrinter(int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\n     * @param lineLengthThreshold The length of a line after which we force\n     *                            a newline when possible.\n     * @param createSourceMap Whether to generate source map data.\n     * @param sourceMapDetailLevel A filter to control which nodes get mapped\n     *     into the source map.\n     ",
      "child_ranges": [
        "(line 238,col 7)-(line 238,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.append(java.lang.String)",
      "begin_line": 244,
      "end_line": 255,
      "comment": "\n     * Appends a string to the code, keeping track of the current line length.\n     ",
      "child_ranges": [
        "(line 247,col 7)-(line 252,col 7)",
        "(line 253,col 7)-(line 253,col 23)",
        "(line 254,col 7)-(line 254,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.startNewLine()",
      "begin_line": 261,
      "end_line": 268,
      "comment": "\n     * Adds a newline to the code, resetting the line length and handling\n     * indenting for pretty printing.\n     ",
      "child_ranges": [
        "(line 263,col 7)-(line 267,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.maybeLineBreak()",
      "begin_line": 270,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 7)-(line 272,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.maybeCutLine()",
      "begin_line": 279,
      "end_line": 284,
      "comment": "\n     * This may start a new line if the current line is longer than the line\n     * length threshold.\n     ",
      "child_ranges": [
        "(line 281,col 7)-(line 283,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endLine()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 7)-(line 288,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendBlockStart()",
      "begin_line": 291,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 19)",
        "(line 294,col 7)-(line 294,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendBlockEnd()",
      "begin_line": 297,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 299,col 7)-(line 299,col 16)",
        "(line 300,col 7)-(line 300,col 15)",
        "(line 301,col 7)-(line 301,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.listSeparator()",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 306,col 7)-(line 306,col 16)",
        "(line 307,col 7)-(line 307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endFunction(boolean)",
      "begin_line": 310,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 312,col 7)-(line 312,col 42)",
        "(line 313,col 7)-(line 315,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.beginCaseBody()",
      "begin_line": 318,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 7)-(line 320,col 28)",
        "(line 321,col 7)-(line 321,col 15)",
        "(line 322,col 7)-(line 322,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endCaseBody()",
      "begin_line": 325,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 327,col 7)-(line 327,col 26)",
        "(line 328,col 7)-(line 328,col 15)",
        "(line 329,col 7)-(line 329,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.appendOp(java.lang.String, boolean)",
      "begin_line": 332,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 334,col 7)-(line 342,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.shouldPreserveExtraBlocks()",
      "begin_line": 350,
      "end_line": 356,
      "comment": "\n     * If the body of a for loop or the then clause of an if statement has\n     * a single statement, should it be wrapped in a block?\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 355,col 7)-(line 355,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.getTryForCatch(com.google.javascript.rhino.Node)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * @return The TRY node for the specified CATCH node.\n     ",
      "child_ranges": [
        "(line 362,col 7)-(line 362,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.breakAfterBlockFor(com.google.javascript.rhino.Node, boolean)",
      "begin_line": 369,
      "end_line": 394,
      "comment": "\n     * @return Whether the a line break should be added after the specified\n     * BLOCK.\n     ",
      "child_ranges": [
        "(line 371,col 7)-(line 371,col 44)",
        "(line 372,col 7)-(line 372,col 34)",
        "(line 373,col 7)-(line 392,col 7)",
        "(line 393,col 7)-(line 393,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.PrettyCodePrinter.endFile()",
      "begin_line": 396,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 398,col 7)-(line 398,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CompactCodePrinter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodePrinter.MappedCodePrinter"
      ],
      "begin_line": 403,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineBreak"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferLineBreakAtEndOfFile"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineStartPosition"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferredBreakPosition"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevCutPosition"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevLineStartPosition"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.CompactCodePrinter(boolean, boolean, int, boolean, com.google.javascript.jscomp.SourceMap.DetailLevel)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\n   * @param lineBreak break the lines a bit more aggressively\n   * @param lineLengthThreshold The length of a line after which we force\n   *                            a newline when possible.\n   * @param createSrcMap Whether to gather source position\n   *                            mapping information when printing.\n   * @param sourceMapDetailLevel A filter to control which nodes get mapped into\n   *     the source map.\n   ",
      "child_ranges": [
        "(line 435,col 7)-(line 435,col 69)",
        "(line 436,col 7)-(line 436,col 33)",
        "(line 437,col 7)-(line 437,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.append(java.lang.String)",
      "begin_line": 443,
      "end_line": 447,
      "comment": "\n     * Appends a string to the code, keeping track of the current line length.\n     ",
      "child_ranges": [
        "(line 445,col 7)-(line 445,col 23)",
        "(line 446,col 7)-(line 446,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.startNewLine()",
      "begin_line": 452,
      "end_line": 462,
      "comment": "\n     * Adds a newline to the code, resetting the line length.\n     ",
      "child_ranges": [
        "(line 454,col 7)-(line 461,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.maybeLineBreak()",
      "begin_line": 464,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 466,col 7)-(line 471,col 7)",
        "(line 476,col 7)-(line 476,col 30)",
        "(line 477,col 7)-(line 482,col 7)",
        "(line 483,col 7)-(line 483,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.maybeCutLine()",
      "begin_line": 490,
      "end_line": 507,
      "comment": "\n     * This may start a new line if the current line is longer than the line\n     * length threshold.\n     ",
      "child_ranges": [
        "(line 492,col 7)-(line 506,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.notePreferredLineBreak()",
      "begin_line": 509,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 511,col 7)-(line 511,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.CompactCodePrinter.endFile()",
      "begin_line": 514,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 516,col 7)-(line 516,col 22)",
        "(line 517,col 7)-(line 519,col 7)",
        "(line 520,col 7)-(line 541,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 546,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outputTypes"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMap"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tagAsStrict"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "registry"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.Builder(com.google.javascript.rhino.Node)",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Sets the root node from which to generate the source code.\n     * @param node The root node.\n     ",
      "child_ranges": [
        "(line 559,col 7)-(line 559,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setCompilerOptions(com.google.javascript.jscomp.CompilerOptions)",
      "begin_line": 565,
      "end_line": 572,
      "comment": "\n     * Sets the output options from compiler options.\n     ",
      "child_ranges": [
        "(line 566,col 7)-(line 570,col 7)",
        "(line 571,col 7)-(line 571,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setTypeRegistry(com.google.javascript.rhino.jstype.JSTypeRegistry)",
      "begin_line": 574,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 575,col 7)-(line 575,col 31)",
        "(line 576,col 7)-(line 576,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setPrettyPrint(boolean)",
      "begin_line": 583,
      "end_line": 586,
      "comment": "\n     * Sets whether pretty printing should be used.\n     * @param prettyPrint If true, pretty printing will be used.\n     ",
      "child_ranges": [
        "(line 584,col 7)-(line 584,col 40)",
        "(line 585,col 7)-(line 585,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setLineBreak(boolean)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "\n     * Sets whether line breaking should be done automatically.\n     * @param lineBreak If true, line breaking is done automatically.\n     ",
      "child_ranges": [
        "(line 593,col 7)-(line 593,col 36)",
        "(line 594,col 7)-(line 594,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setOutputTypes(boolean)",
      "begin_line": 601,
      "end_line": 604,
      "comment": "\n     * Sets whether to output closure-style type annotations.\n     * @param outputTypes If true, outputs closure-style type annotations.\n     ",
      "child_ranges": [
        "(line 602,col 7)-(line 602,col 37)",
        "(line 603,col 7)-(line 603,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setSourceMap(com.google.javascript.jscomp.SourceMap)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\n     * Sets the source map to which to write the metadata about\n     * the generated source code.\n     *\n     * @param sourceMap The source map.\n     ",
      "child_ranges": [
        "(line 613,col 7)-(line 613,col 33)",
        "(line 614,col 7)-(line 614,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.setTagAsStrict(boolean)",
      "begin_line": 620,
      "end_line": 623,
      "comment": "\n     * Set whether the output should be tags as ECMASCRIPT 5 Strict.\n     ",
      "child_ranges": [
        "(line 621,col 7)-(line 621,col 37)",
        "(line 622,col 7)-(line 622,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.Builder.build()",
      "begin_line": 628,
      "end_line": 642,
      "comment": "\n     * Generates the source code and returns it.\n     ",
      "child_ranges": [
        "(line 629,col 7)-(line 632,col 7)",
        "(line 634,col 7)-(line 638,col 31)",
        "(line 640,col 7)-(line 641,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodePrinter.toSource(com.google.javascript.rhino.Node, com.google.javascript.jscomp.CodePrinter.Format, com.google.javascript.jscomp.CompilerOptions, com.google.javascript.rhino.jstype.JSTypeRegistry, com.google.javascript.jscomp.SourceMap, boolean)",
      "begin_line": 654,
      "end_line": 691,
      "comment": "\n   * Converts a tree to JS code\n   ",
      "child_ranges": [
        "(line 657,col 5)-(line 657,col 67)",
        "(line 659,col 5)-(line 659,col 50)",
        "(line 660,col 5)-(line 671,col 42)",
        "(line 672,col 5)-(line 675,col 42)",
        "(line 677,col 5)-(line 679,col 5)",
        "(line 681,col 5)-(line 681,col 17)",
        "(line 682,col 5)-(line 682,col 18)",
        "(line 684,col 5)-(line 684,col 32)",
        "(line 686,col 5)-(line 688,col 5)",
        "(line 690,col 5)-(line 690,col 16)"
      ]
    }
  ]
}