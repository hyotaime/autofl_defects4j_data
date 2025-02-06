{
  "filepath": "/tmp/Closure-2b/src/com/google/debugging/sourcemap/SourceMapGeneratorV2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapGeneratorV2",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGenerator"
      ],
      "begin_line": 39,
      "end_line": 888,
      "comment": "\n * Collects information mapping the generated (compiled) source back to\n * its original source for debugging purposes.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "validate"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "UNMAPPED"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n   * A pre-order traversal ordered list of mappings stored in this map.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFileMap"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": "\n   * A map of source names to source name index\n   "
    },
    {
      "type": "field",
      "varNames": [
        "originalNameMap"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n   * A map of symbol names to symbol name index\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastSourceFile"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n   * Cache of the last mappings source name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastSourceFileIndex"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * Cache of the last mappings source name index.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastMapping"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n   * For validation store the last mapping added.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "offsetPosition"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n   * The position that the current source map is offset in the\n   * buffer being used to generated the compiled source file.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "prefixPosition"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * The position that the current source map is offset in the\n   * generated the compiled source file by the addition of a\n   * an output wrapper prefix.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.reset()",
      "begin_line": 93,
      "end_line": 103,
      "comment": "\n   * {@inheritDoc}\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 21)",
        "(line 96,col 5)-(line 96,col 23)",
        "(line 97,col 5)-(line 97,col 26)",
        "(line 98,col 5)-(line 98,col 28)",
        "(line 99,col 5)-(line 99,col 26)",
        "(line 100,col 5)-(line 100,col 29)",
        "(line 101,col 5)-(line 101,col 44)",
        "(line 102,col 5)-(line 102,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.validate(boolean)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n   * @param validate Whether to perform (potentially costly) validation on the\n   * generated source map.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.setWrapperPrefix(java.lang.String)",
      "begin_line": 122,
      "end_line": 138,
      "comment": "\n   * Sets the prefix used for wrapping the generated source file before\n   * it is written. This ensures that the source map is adjusted for the\n   * change in character offsets.\n   *\n   * @param prefix The prefix that is added before the generated source code.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 23)",
        "(line 126,col 5)-(line 126,col 24)",
        "(line 128,col 5)-(line 135,col 5)",
        "(line 137,col 5)-(line 137,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.setStartingPosition(int, int)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n   * Sets the source code that exists in the buffer for which the\n   * generated code is being generated. This ensures that the source map\n   * accurately reflects the fact that the source is being appended to\n   * an existing buffer and as such, does not start at line 0, position 0\n   * but rather some other line and position.\n   *\n   * @param offsetLine The index of the current line being printed.\n   * @param offsetIndex The column index of the current character being printed.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 46)",
        "(line 153,col 5)-(line 153,col 47)",
        "(line 154,col 5)-(line 154,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.addMapping(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 162,
      "end_line": 226,
      "comment": "\n   * Adds a mapping for the given node.  Mappings must be added in order.\n   * @param startPosition The position on the starting line\n   * @param endPosition The position on the ending line.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 171,col 5)",
        "(line 173,col 5)-(line 173,col 47)",
        "(line 174,col 5)-(line 174,col 43)",
        "(line 176,col 5)-(line 201,col 5)",
        "(line 204,col 5)-(line 204,col 36)",
        "(line 205,col 5)-(line 205,col 49)",
        "(line 206,col 5)-(line 206,col 51)",
        "(line 207,col 5)-(line 207,col 38)",
        "(line 208,col 5)-(line 208,col 42)",
        "(line 209,col 5)-(line 209,col 38)",
        "(line 212,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 224,col 26)",
        "(line 225,col 5)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendTo(java.lang.Appendable, java.lang.String)",
      "begin_line": 272,
      "end_line": 311,
      "comment": "\n   * Writes out the source map in the following format (line numbers are for\n   * reference only and are not part of the format):\n   *\n   * 1.  {\n   * 2.    version: 2,\n   * 3.    file: \"out.js\"\n   * 4.    lineCount: 2\n   * 5.    lineMaps: [\n   * 6.        \"ABAAA\",\n   * 7.        \"ABAA\"\n   * 8.     ],\n   * 9.    sourceRoot: \"\",\n   * 10.   sources: [\"foo.js\", \"bar.js\"],\n   * 11.   names: [\"src\", \"maps\", \"are\", \"fun\"],\n   * 12.   mappings: [\n   * 13.       [1, 1, 2, 4],\n   * 14.       [2, 1, 2, \"yack\"],\n   * 15.   ],\n   * 16.  }\n   *\n   * Line 1: The entire file is a single JSON object\n   * Line 2: File revision (always the first entry in the object)\n   * Line 3: The name of the file that this source map is associated with.\n   * Line 4: The number of lines represented in the source map.\n   * Line 5: \"lineMaps\" field is a JSON array, where each entry represents a\n   *     line in the generated text.\n   * Line 6: A line entry, representing a series of line segments, where each\n   *     segment encodes an mappings-id and repetition count.\n   * Line 9: An optional source root, useful for relocating source files on a\n   *     server or removing repeated prefix values in the \"sources\" entry.\n   * Line 10: A list of sources used by the \"mappings\" entry relative to the\n   *     sourceRoot.\n   * Line 11: A list of symbol names used by the \"mapping\" entry.  This list\n   *     may be incomplete.\n   * Line 12: The mappings field.\n   * Line 13: Each entry represent a block of text in the original source, and\n   *     consists four fields:\n   *     The source file name\n   *     The line in the source file the text begins\n   *     The column in the line that the text begins\n   *     An optional name (from the original source) that this entry represents.\n   *     This can either be an string or index into the \"names\" field.\n   ",
      "child_ranges": [
        "(line 274,col 5)-(line 274,col 33)",
        "(line 277,col 5)-(line 277,col 22)",
        "(line 278,col 5)-(line 278,col 42)",
        "(line 279,col 5)-(line 279,col 49)",
        "(line 280,col 5)-(line 280,col 63)",
        "(line 283,col 5)-(line 283,col 38)",
        "(line 284,col 5)-(line 284,col 20)",
        "(line 285,col 5)-(line 285,col 47)",
        "(line 286,col 5)-(line 286,col 20)",
        "(line 287,col 5)-(line 287,col 24)",
        "(line 290,col 5)-(line 290,col 38)",
        "(line 291,col 5)-(line 291,col 20)",
        "(line 292,col 5)-(line 292,col 46)",
        "(line 293,col 5)-(line 293,col 20)",
        "(line 294,col 5)-(line 294,col 24)",
        "(line 297,col 5)-(line 297,col 37)",
        "(line 298,col 5)-(line 298,col 20)",
        "(line 299,col 5)-(line 299,col 26)",
        "(line 300,col 5)-(line 300,col 20)",
        "(line 301,col 5)-(line 301,col 24)",
        "(line 304,col 5)-(line 304,col 35)",
        "(line 305,col 5)-(line 305,col 20)",
        "(line 306,col 5)-(line 306,col 28)",
        "(line 307,col 5)-(line 307,col 20)",
        "(line 308,col 5)-(line 308,col 24)",
        "(line 310,col 5)-(line 310,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.addSourceNameMap(java.lang.Appendable)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n   * Writes the source name map to \u0027out\u0027.\n   ",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.addOriginalNameMap(java.lang.Appendable)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n   * Writes the original name map to \u0027out\u0027.\n   ",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.addMap(java.lang.Appendable, java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e)",
      "begin_line": 330,
      "end_line": 341,
      "comment": "\n   * Writes the source name map to \u0027out\u0027.\n   ",
      "child_ranges": [
        "(line 332,col 5)-(line 332,col 14)",
        "(line 333,col 5)-(line 340,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.escapeString(java.lang.String)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n   * Escapes the given string for JSON.\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFirstField(java.lang.Appendable, java.lang.String, java.lang.CharSequence)",
      "begin_line": 352,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 21)",
        "(line 356,col 5)-(line 356,col 21)",
        "(line 357,col 5)-(line 357,col 21)",
        "(line 358,col 5)-(line 358,col 20)",
        "(line 359,col 5)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(java.lang.Appendable, java.lang.String, java.lang.CharSequence)",
      "begin_line": 362,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 22)",
        "(line 366,col 5)-(line 366,col 21)",
        "(line 367,col 5)-(line 367,col 21)",
        "(line 368,col 5)-(line 368,col 21)",
        "(line 369,col 5)-(line 369,col 20)",
        "(line 370,col 5)-(line 370,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldStart(java.lang.Appendable, java.lang.String)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldEnd(java.lang.Appendable)",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.prepMappings()",
      "begin_line": 386,
      "end_line": 403,
      "comment": "\n   * Assigns sequential ids to used mappings, and returns the last line mapped.\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 62)",
        "(line 391,col 5)-(line 391,col 15)",
        "(line 392,col 5)-(line 392,col 20)",
        "(line 393,col 5)-(line 399,col 5)",
        "(line 402,col 5)-(line 402,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.getSourceId(java.lang.String)",
      "begin_line": 410,
      "end_line": 422,
      "comment": "\n   * Pools source names.\n   * @param sourceName The source location to index.\n   * @return The id to represent the source name in the output.\n   ",
      "child_ranges": [
        "(line 411,col 5)-(line 420,col 5)",
        "(line 421,col 5)-(line 421,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.getNameId(java.lang.String)",
      "begin_line": 429,
      "end_line": 439,
      "comment": "\n   * Pools symbol names\n   * @param symbolName The symbol name to index.\n   * @return The id to represent the symbol name in the output.\n   ",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 26)",
        "(line 431,col 5)-(line 431,col 52)",
        "(line 432,col 5)-(line 437,col 5)",
        "(line 438,col 5)-(line 438,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 445,
      "end_line": 485,
      "comment": "\n   * A mapping from a given position in an input source file to a given position\n   * in the generated code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": "\n     * A unique ID for this mapping for record keeping purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 454,
      "end_line": 454,
      "comment": "\n     * The source file index.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalPosition"
      ],
      "begin_line": 461,
      "end_line": 461,
      "comment": "\n     * The position of the code in the input source file. Both\n     * the line number and the character index are indexed by\n     * 1 for legacy reasons via the Rhino Node class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startPosition"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": "\n     * The starting position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endPosition"
      ],
      "begin_line": 473,
      "end_line": 473,
      "comment": "\n     * The ending position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": "\n     * The original name of the token found at the position\n     * represented by this mapping (if any).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": "\n     * Whether the mapping is actually used by the source map.\n     "
    },
    {
      "type": "class_interface",
      "name": "MappingWriter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 487,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastLine"
      ],
      "begin_line": 491,
      "end_line": 491,
      "comment": "\n     * Cache of escaped source file name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastLineString"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingWriter.appendMappingTo(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, java.lang.Appendable)",
      "begin_line": 497,
      "end_line": 521,
      "comment": "\n     * Appends the mapping to the given buffer.\n     ",
      "child_ranges": [
        "(line 499,col 7)-(line 499,col 22)",
        "(line 501,col 7)-(line 501,col 47)",
        "(line 502,col 7)-(line 502,col 22)",
        "(line 504,col 7)-(line 504,col 46)",
        "(line 505,col 7)-(line 507,col 7)",
        "(line 508,col 7)-(line 508,col 40)",
        "(line 510,col 7)-(line 510,col 28)",
        "(line 512,col 7)-(line 512,col 22)",
        "(line 513,col 7)-(line 513,col 65)",
        "(line 515,col 7)-(line 518,col 7)",
        "(line 520,col 7)-(line 520,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingWriter.appendMappings(java.lang.Appendable)",
      "begin_line": 526,
      "end_line": 532,
      "comment": "\n     * Add used mappings to the supplied Appendable.\n     ",
      "child_ranges": [
        "(line 527,col 7)-(line 531,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineMapper",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor"
      ],
      "begin_line": 535,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": " The destination."
    },
    {
      "type": "field",
      "varNames": [
        "lastId"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": " Whether the current line has had a value written yet."
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.LineMapper(java.lang.Appendable)",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 7)-(line 543,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, int, int, int, int)",
      "begin_line": 549,
      "end_line": 567,
      "comment": "\n     * As each segment is visited write out the appropriate line mapping.\n     ",
      "child_ranges": [
        "(line 553,col 7)-(line 553,col 45)",
        "(line 555,col 7)-(line 566,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.appendLineMappings()",
      "begin_line": 570,
      "end_line": 578,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 572,col 7)-(line 572,col 17)",
        "(line 574,col 7)-(line 574,col 46)",
        "(line 577,col 7)-(line 577,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.openLine()",
      "begin_line": 583,
      "end_line": 587,
      "comment": "\n     * Begin the entry for a new line.\n     ",
      "child_ranges": [
        "(line 584,col 7)-(line 584,col 23)",
        "(line 586,col 7)-(line 586,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.closeLine(boolean)",
      "begin_line": 592,
      "end_line": 598,
      "comment": "\n     * End the entry for a line.\n     ",
      "child_ranges": [
        "(line 593,col 7)-(line 597,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.closeEntry(int, int)",
      "begin_line": 600,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 601,col 7)-(line 603,col 7)",
        "(line 605,col 7)-(line 605,col 45)",
        "(line 606,col 7)-(line 606,col 55)",
        "(line 608,col 7)-(line 614,col 7)",
        "(line 616,col 7)-(line 616,col 21)",
        "(line 617,col 7)-(line 617,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineMapEncoder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 621,
      "end_line": 725,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.encodeEntry(java.lang.Appendable, int, int, int)",
      "begin_line": 634,
      "end_line": 671,
      "comment": "\n     * The source map line map is consists of a series of entries each\n     * representing a map entry and a repetition count of that entry.\n     *\n     * @param out The entry destination.\n     * @param id  The id for the entry.\n     * @param lastId The previous id written, used to generate a relative\n     *     map id.\n     * @param reps The number of times the id is repeated in the map.\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 41)",
        "(line 637,col 7)-(line 637,col 68)",
        "(line 638,col 7)-(line 638,col 74)",
        "(line 640,col 7)-(line 640,col 76)",
        "(line 653,col 7)-(line 669,col 7)",
        "(line 670,col 7)-(line 670,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingId(int, int, int)",
      "begin_line": 679,
      "end_line": 683,
      "comment": "\n     * @param idLength the length relative id, when encoded in as a base64\n     *     value. @see #getRelativeMappingIdLength\n     * @return A value relative to the the lastId.  Negative value are\n     * represented as a two-complement value.\n     ",
      "child_ranges": [
        "(line 680,col 7)-(line 680,col 37)",
        "(line 681,col 7)-(line 681,col 35)",
        "(line 682,col 7)-(line 682,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingIdLength(int, int)",
      "begin_line": 688,
      "end_line": 699,
      "comment": "\n     * @return The length of the base64 number needed to include the id.\n     ",
      "child_ranges": [
        "(line 689,col 7)-(line 689,col 64)",
        "(line 690,col 7)-(line 690,col 38)",
        "(line 691,col 7)-(line 691,col 77)",
        "(line 692,col 7)-(line 692,col 21)",
        "(line 693,col 7)-(line 693,col 20)",
        "(line 694,col 7)-(line 697,col 7)",
        "(line 698,col 7)-(line 698,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(int, int)",
      "begin_line": 705,
      "end_line": 724,
      "comment": "\n     * @return return the base64 number encoding the provided value,\n     *    padded if necessary to create a number with the given minimum length.\n     ",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 19)",
        "(line 707,col 7)-(line 707,col 33)",
        "(line 708,col 7)-(line 712,col 26)",
        "(line 714,col 7)-(line 714,col 49)",
        "(line 716,col 7)-(line 719,col 7)",
        "(line 720,col 7)-(line 722,col 7)",
        "(line 723,col 7)-(line 723,col 27)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UsedMappingCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor"
      ],
      "begin_line": 730,
      "end_line": 741,
      "comment": "\n   * Mark any visited mapping as \"used\".\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.UsedMappingCheck.visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, int, int, int, int)",
      "begin_line": 734,
      "end_line": 740,
      "comment": "\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 737,col 7)-(line 739,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 743,
      "end_line": 755,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor.visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, int, int, int, int)",
      "begin_line": 753,
      "end_line": 754,
      "comment": "\n     * @param m The mapping for the current code segment. null if the segment\n     *     is unmapped.\n     * @param line The starting line for this code segment.\n     * @param col The starting column for this code segment.\n     * @param endLine The ending line\n     * @param endCol The ending column\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MappingTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 761,
      "end_line": 881,
      "comment": "\n   * Walk the mappings and visit each segment of the mappings, unmapped\n   * segments are visited with a null mapping, unused mapping are not visited.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 763,
      "end_line": 763,
      "comment": " The last line and column written"
    },
    {
      "type": "field",
      "varNames": [
        "col"
      ],
      "begin_line": 764,
      "end_line": 764,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.MappingTraversal()",
      "begin_line": 766,
      "end_line": 767,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.traverse(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor)",
      "begin_line": 770,
      "end_line": 799,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 774,col 7)-(line 774,col 55)",
        "(line 775,col 7)-(line 791,col 7)",
        "(line 795,col 7)-(line 798,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.getAdjustedLine(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 804,
      "end_line": 806,
      "comment": "\n     * @return The line adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 805,col 7)-(line 805,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.getAdjustedCol(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 811,
      "end_line": 817,
      "comment": "\n     * @return The column adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 812,col 7)-(line 812,col 32)",
        "(line 813,col 7)-(line 813,col 33)",
        "(line 815,col 7)-(line 816,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.isOverlapped(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping)",
      "begin_line": 822,
      "end_line": 830,
      "comment": "\n     * @return Whether m1 ends before m2 starts.\n     ",
      "child_ranges": [
        "(line 824,col 7)-(line 824,col 40)",
        "(line 825,col 7)-(line 825,col 42)",
        "(line 826,col 7)-(line 826,col 42)",
        "(line 827,col 7)-(line 827,col 44)",
        "(line 829,col 7)-(line 829,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.maybeVisit(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping)",
      "begin_line": 836,
      "end_line": 844,
      "comment": "\n     * Write any needed entries from the current position to the end of the\n     * provided mapping.\n     ",
      "child_ranges": [
        "(line 837,col 7)-(line 837,col 52)",
        "(line 838,col 7)-(line 838,col 50)",
        "(line 841,col 7)-(line 843,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.maybeVisitParent(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping)",
      "begin_line": 849,
      "end_line": 858,
      "comment": "\n     * Write any needed entries to complete the provided mapping.\n     ",
      "child_ranges": [
        "(line 851,col 7)-(line 851,col 54)",
        "(line 852,col 7)-(line 852,col 52)",
        "(line 854,col 7)-(line 854,col 66)",
        "(line 855,col 7)-(line 857,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal.visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping, int, int)",
      "begin_line": 864,
      "end_line": 880,
      "comment": "\n     * Write any entries needed between the current position the next position\n     * and update the current position.\n     ",
      "child_ranges": [
        "(line 867,col 7)-(line 867,col 49)",
        "(line 868,col 7)-(line 868,col 65)",
        "(line 870,col 7)-(line 874,col 7)",
        "(line 876,col 7)-(line 876,col 47)",
        "(line 878,col 7)-(line 878,col 22)",
        "(line 879,col 7)-(line 879,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV2.appendIndexMapTo(java.lang.Appendable, java.lang.String, java.util.List\u003ccom.google.debugging.sourcemap.SourceMapSection\u003e)",
      "begin_line": 883,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 886,col 5)-(line 886,col 46)"
      ]
    }
  ]
}