{
  "filepath": "/tmp/Closure-2b/src/com/google/debugging/sourcemap/SourceMapConsumerV1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapConsumerV1",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumer"
      ],
      "begin_line": 39,
      "end_line": 601,
      "comment": "\n * Class for parsing and representing a SourceMap, as produced by the\n * Closure Compiler, Caja-Compiler, etc.\n "
    },
    {
      "type": "field",
      "varNames": [
        "LINEMAP_HEADER"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FILEINFO_HEADER"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFINITION_HEADER"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "ParseState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 99,
      "comment": "\n   * Internal class for parsing the SourceMap. Used to maintain parser\n   * state in an easy to use instance.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "contents"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPosition"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState.ParseState(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 7)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState.readLineOrNull()",
      "begin_line": 60,
      "end_line": 71,
      "comment": " Reads a line, returning null at EOF. ",
      "child_ranges": [
        "(line 61,col 7)-(line 63,col 7)",
        "(line 64,col 7)-(line 64,col 58)",
        "(line 65,col 7)-(line 67,col 7)",
        "(line 68,col 7)-(line 68,col 63)",
        "(line 69,col 7)-(line 69,col 34)",
        "(line 70,col 7)-(line 70,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState.readLine()",
      "begin_line": 74,
      "end_line": 80,
      "comment": " Reads a line, throwing a parse exception at EOF. ",
      "child_ranges": [
        "(line 75,col 7)-(line 75,col 37)",
        "(line 76,col 7)-(line 78,col 7)",
        "(line 79,col 7)-(line 79,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState.expectLine(java.lang.String)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n     * Reads a line and throws an parse exception if the line does not\n     * equal the argument.\n     ",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 31)",
        "(line 88,col 7)-(line 90,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState.fail(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Indicates that parsing has failed by throwing a parse exception.\n     ",
      "child_ranges": [
        "(line 97,col 7)-(line 97,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "characterMap"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n   * Mapping from a line number (0-indexed), to a list of mapping IDs, one for\n   * each character on the line. For example, if the array for line 2 is\n   * {@code [4,,,,5,6,,,7]}, then there will be the entry:\n   *\n   * \u003cpre\u003e\n   * 1 \u003d\u003e {4, 4, 4, 4, 5, 6, 6, 6, 7}\n   * \u003c/pre\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n   * Map of Mapping IDs to the actual mapping object.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.parse(java.lang.String)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 49)",
        "(line 123,col 5)-(line 127,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.parseCharacterMap(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState, int, com.google.common.collect.ImmutableList.Builder\u003ccom.google.common.collect.ImmutableList\u003ccom.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment\u003e\u003e)",
      "begin_line": 137,
      "end_line": 202,
      "comment": "\n   * Parses the first section of the source map file that has character\n   * mappings.\n   * @param parser The parser to use\n   * @param lineCount The number of lines in the generated JS\n   * @return The max id found in the file\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 19)",
        "(line 143,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FileName",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 204,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.FileName.FileName(java.lang.String, java.lang.String)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 209,col 7)-(line 209,col 27)",
        "(line 210,col 7)-(line 210,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.splitFileName(com.google.common.collect.Interner\u003cjava.lang.String\u003e, java.lang.String)",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n   * Split the file into a filename/directory pair.\n   *\n   * @param interner The interner to use for interning the strings.\n   * @param input The input to split.\n   * @return The pair of directory, filename.\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 43)",
        "(line 224,col 5)-(line 224,col 68)",
        "(line 225,col 5)-(line 225,col 70)",
        "(line 226,col 5)-(line 226,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.parseFileMappings(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState, int)",
      "begin_line": 236,
      "end_line": 309,
      "comment": "\n   * Parse the file mappings section of the source map file.  This maps the\n   * ids to the filename, line number and column number in the original\n   * files.\n   * @param parser The parser to get the data from.\n   * @param maxID The maximum id found in the character mapping section.\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 62)",
        "(line 241,col 5)-(line 241,col 80)",
        "(line 245,col 5)-(line 245,col 55)",
        "(line 246,col 5)-(line 246,col 52)",
        "(line 247,col 5)-(line 247,col 57)",
        "(line 251,col 5)-(line 251,col 30)",
        "(line 252,col 5)-(line 252,col 22)",
        "(line 253,col 5)-(line 253,col 23)",
        "(line 254,col 5)-(line 254,col 24)",
        "(line 255,col 5)-(line 295,col 5)",
        "(line 296,col 5)-(line 307,col 5)",
        "(line 308,col 5)-(line 308,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.parseInternal(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState)",
      "begin_line": 311,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 43)",
        "(line 316,col 5)-(line 317,col 39)",
        "(line 318,col 5)-(line 319,col 56)",
        "(line 320,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 324,col 48)",
        "(line 325,col 5)-(line 327,col 5)",
        "(line 328,col 5)-(line 329,col 32)",
        "(line 330,col 5)-(line 330,col 74)",
        "(line 331,col 5)-(line 331,col 47)",
        "(line 334,col 5)-(line 334,col 39)",
        "(line 337,col 5)-(line 339,col 5)",
        "(line 342,col 5)-(line 342,col 41)",
        "(line 344,col 5)-(line 344,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.getMappingForLine(int, int)",
      "begin_line": 347,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 77)",
        "(line 351,col 5)-(line 353,col 5)",
        "(line 355,col 5)-(line 355,col 72)",
        "(line 356,col 5)-(line 358,col 5)",
        "(line 360,col 5)-(line 360,col 25)",
        "(line 363,col 5)-(line 363,col 76)",
        "(line 364,col 5)-(line 364,col 66)",
        "(line 365,col 5)-(line 372,col 5)",
        "(line 374,col 5)-(line 376,col 5)",
        "(line 378,col 5)-(line 378,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.binarySearch(int)",
      "begin_line": 387,
      "end_line": 405,
      "comment": "\n   * Do a binary search for the correct mapping array to use.\n   *\n   * @param mapId The mapping array to find\n   * @return The source file mapping to use.\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 18)",
        "(line 389,col 5)-(line 389,col 36)",
        "(line 391,col 5)-(line 402,col 5)",
        "(line 404,col 5)-(line 404,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.getMappingFromId(int)",
      "begin_line": 413,
      "end_line": 420,
      "comment": "\n   * Find the original mapping for the specified mapping id.\n   *\n   * @param mapID The mapID to lookup.\n   * @return The originalMapping protocol buffer for the id.\n   ",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 43)",
        "(line 415,col 5)-(line 417,col 5)",
        "(line 418,col 5)-(line 418,col 44)",
        "(line 419,col 5)-(line 419,col 41)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineFragment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 428,
      "end_line": 465,
      "comment": "\n   * Keeps track of the information about the line in a more compact way.  It\n   * represents a fragment of the line starting at a specific index and then\n   * looks at offsets from that index stored as a byte, this dramatically\n   * reduces the memory usage of this array.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "startIndex"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment.LineFragment(int, byte[])",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Create a new line fragment to store information about.\n     *\n     * @param startIndex The start index for this line.\n     * @param offsets The byte array of offsets to store.\n     ",
      "child_ranges": [
        "(line 439,col 7)-(line 439,col 35)",
        "(line 440,col 7)-(line 440,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment.length()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * The length of columns stored in the line.  One is added because we\n     * store the start index outside of the offsets array.\n     ",
      "child_ranges": [
        "(line 448,col 7)-(line 448,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment.valueAtColumn(int)",
      "begin_line": 457,
      "end_line": 464,
      "comment": "\n     * Find the mapping id at the specified column.\n     *\n     * @param column The column to lookup\n     * @return the value at that point in the column\n     ",
      "child_ranges": [
        "(line 458,col 7)-(line 458,col 46)",
        "(line 459,col 7)-(line 459,col 27)",
        "(line 460,col 7)-(line 462,col 7)",
        "(line 463,col 7)-(line 463,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SourceFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 472,
      "end_line": 600,
      "comment": "\n   * Keeps track of data about the source file itself.  This is contains a list\n   * of line offsets and columns to track down where exactly a line falls into\n   * the data.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMapId"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startLine"
      ],
      "begin_line": 476,
      "end_line": 476,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineOffsets"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 478,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "identifiers"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.SourceFile(java.lang.String, java.lang.String, int, int, byte[], short[], java.lang.String[])",
      "begin_line": 481,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 484,col 7)-(line 484,col 59)",
        "(line 485,col 7)-(line 485,col 49)",
        "(line 486,col 7)-(line 486,col 33)",
        "(line 487,col 7)-(line 487,col 35)",
        "(line 488,col 7)-(line 488,col 65)",
        "(line 489,col 7)-(line 489,col 57)",
        "(line 490,col 7)-(line 490,col 65)",
        "(line 491,col 7)-(line 492,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.SourceFile(int)",
      "begin_line": 495,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 497,col 7)-(line 497,col 35)",
        "(line 499,col 7)-(line 499,col 27)",
        "(line 500,col 7)-(line 500,col 22)",
        "(line 501,col 7)-(line 501,col 25)",
        "(line 502,col 7)-(line 502,col 30)",
        "(line 503,col 7)-(line 503,col 26)",
        "(line 504,col 7)-(line 504,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.getLength()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Returns the number of elements in this source file.\n     ",
      "child_ranges": [
        "(line 511,col 7)-(line 511,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.getStartMapId()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\n     * Returns the number of elements in this source file.\n     ",
      "child_ranges": [
        "(line 518,col 7)-(line 518,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.getOriginalMapping(int)",
      "begin_line": 527,
      "end_line": 539,
      "comment": "\n     * Creates an original mapping from the data.\n     *\n     * @param offset The offset into the array to find the mapping for.\n     * @return A new original mapping object.\n     ",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 38)",
        "(line 530,col 7)-(line 532,col 7)",
        "(line 533,col 7)-(line 537,col 46)",
        "(line 538,col 7)-(line 538,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 544,
      "end_line": 595,
      "comment": "\n     * Builder to make a new SourceFile object.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startMapId"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startLine"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineOffsets"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "identifiers"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setDir(java.lang.String)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 23)",
        "(line 555,col 9)-(line 555,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setFileName(java.lang.String)",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 33)",
        "(line 560,col 9)-(line 560,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setStartMapId(int)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 37)",
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setStartLine(int)",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 35)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setLineOffsets(java.util.List\u003cjava.lang.Byte\u003e)",
      "begin_line": 573,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 54)",
        "(line 575,col 9)-(line 575,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setColumns(java.util.List\u003cjava.lang.Short\u003e)",
      "begin_line": 578,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 47)",
        "(line 580,col 9)-(line 580,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.setIdentifiers(java.util.List\u003cjava.lang.String\u003e)",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 62)",
        "(line 585,col 9)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.build()",
      "begin_line": 591,
      "end_line": 594,
      "comment": "\n       * Creates a new SourceFile from the parameters.\n       ",
      "child_ranges": [
        "(line 592,col 9)-(line 593,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.newBuilder()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 7)-(line 598,col 27)"
      ]
    }
  ]
}