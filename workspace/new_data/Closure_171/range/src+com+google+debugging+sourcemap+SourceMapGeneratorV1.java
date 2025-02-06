{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapGeneratorV1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapGeneratorV1",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGenerator"
      ],
      "begin_line": 34,
      "end_line": 646,
      "comment": "\n * Collects information mapping the generated (compiled) source back to\n * its original source for debugging purposes.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNMAPPED"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Mapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 83,
      "comment": "\n   * A mapping from a given position in an input source file to a given position\n   * in the generated code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * A unique ID for this mapping for record keeping purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * The input source file.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalPosition"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The position of the code in the input source file. Both\n     * the line number and the character index are indexed by\n     * 1 for legacy reasons via the Rhino Node class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startPosition"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The starting position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endPosition"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * The ending position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The original name of the token found at the position\n     * represented by this mapping (if any).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Whether the mapping is actually used by the source map.\n     "
    },
    {
      "type": "class_interface",
      "name": "MappingWriter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastSourceFile"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Cache of escaped source file name.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastSourceFileEscaped"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastLine"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastLineString"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingWriter.appendMappingTo(com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, java.lang.Appendable)",
      "begin_line": 97,
      "end_line": 131,
      "comment": "\n     * Appends the mapping to the given buffer.\n     ",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 22)",
        "(line 101,col 7)-(line 101,col 39)",
        "(line 103,col 7)-(line 103,col 31)",
        "(line 104,col 7)-(line 107,col 7)",
        "(line 108,col 7)-(line 108,col 48)",
        "(line 110,col 7)-(line 110,col 36)",
        "(line 111,col 7)-(line 111,col 22)",
        "(line 113,col 7)-(line 113,col 46)",
        "(line 114,col 7)-(line 116,col 7)",
        "(line 117,col 7)-(line 117,col 40)",
        "(line 119,col 7)-(line 119,col 28)",
        "(line 121,col 7)-(line 121,col 22)",
        "(line 122,col 7)-(line 123,col 43)",
        "(line 125,col 7)-(line 128,col 7)",
        "(line 130,col 7)-(line 130,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingWriter.appendMappings(java.lang.Appendable)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * Add used mappings to the supplied Appendable.\n     ",
      "child_ranges": [
        "(line 137,col 7)-(line 141,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n   * A pre-order traversal ordered list of mappings stored in this map.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lastMapping"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n   * For validation store the start of the last mapping added.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "offsetPosition"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n   * The position that the current source map is offset in the\n   * buffer being used to generated the compiled source file.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "prefixPosition"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n   * The position that the current source map is offset in the\n   * generated the compiled source file by the addition of a\n   * an output wrapper prefix.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.escapeString(java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n   * Escapes the given string for JSON.\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.addMapping(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 180,
      "end_line": 244,
      "comment": "\n   * Adds a mapping for the given node.  Mappings must be added in order.\n   * @param startPosition The position on the starting line\n   * @param endPosition The position on the ending line.\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 189,col 5)",
        "(line 192,col 5)-(line 192,col 36)",
        "(line 193,col 5)-(line 193,col 36)",
        "(line 194,col 5)-(line 194,col 51)",
        "(line 195,col 5)-(line 195,col 38)",
        "(line 199,col 5)-(line 227,col 5)",
        "(line 230,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 26)",
        "(line 243,col 5)-(line 243,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.setWrapperPrefix(java.lang.String)",
      "begin_line": 253,
      "end_line": 269,
      "comment": "\n   * Sets the prefix used for wrapping the generated source file before\n   * it is output. This ensures that the source map is adjusted as\n   * needed.\n   *\n   * @param prefix The prefix that is added before the generated source code.\n   ",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 23)",
        "(line 257,col 5)-(line 257,col 24)",
        "(line 259,col 5)-(line 266,col 5)",
        "(line 268,col 5)-(line 268,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.setStartingPosition(int, int)",
      "begin_line": 281,
      "end_line": 286,
      "comment": "\n   * Sets the source code that exists in the buffer to which the\n   * generated code is being generated. This ensures that the source map\n   * accurately reflects the fact that the source is being appended to\n   * an existing buffer and as such, does not start at line 0, position 0\n   * but rather some other line and position.\n   *\n   * @param offsetLine The index of the current line being printed.\n   * @param offsetIndex The column index of the current character being printed.\n   ",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 46)",
        "(line 284,col 5)-(line 284,col 47)",
        "(line 285,col 5)-(line 285,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.reset()",
      "begin_line": 291,
      "end_line": 297,
      "comment": "\n   * Resets the source map for reuse for the generation of a new source file.\n   ",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 36)",
        "(line 294,col 5)-(line 294,col 23)",
        "(line 295,col 5)-(line 295,col 44)",
        "(line 296,col 5)-(line 296,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.appendTo(java.lang.Appendable, java.lang.String)",
      "begin_line": 306,
      "end_line": 362,
      "comment": "\n   * Appends the source map in LavaBug format to the given buffer.\n   *\n   * @param out The stream to which the map will be appended.\n   * @param name The name of the generated source file that this source map\n   *   represents.\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 33)",
        "(line 342,col 5)-(line 342,col 56)",
        "(line 343,col 5)-(line 343,col 35)",
        "(line 344,col 5)-(line 344,col 32)",
        "(line 345,col 5)-(line 345,col 44)",
        "(line 346,col 5)-(line 346,col 23)",
        "(line 347,col 5)-(line 347,col 47)",
        "(line 350,col 5)-(line 350,col 52)",
        "(line 354,col 5)-(line 356,col 5)",
        "(line 359,col 5)-(line 359,col 55)",
        "(line 361,col 5)-(line 361,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.prepMappings()",
      "begin_line": 367,
      "end_line": 384,
      "comment": "\n   * Assigns sequential ids to used mappings, and returns the last line mapped.\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 62)",
        "(line 372,col 5)-(line 372,col 15)",
        "(line 373,col 5)-(line 373,col 20)",
        "(line 374,col 5)-(line 380,col 5)",
        "(line 383,col 5)-(line 383,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineMapper",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor"
      ],
      "begin_line": 386,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " The destination."
    },
    {
      "type": "field",
      "varNames": [
        "firstChar"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Whether the current line has had a value written yet."
    },
    {
      "type": "field",
      "varNames": [
        "UNMAPPED_STRING"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastId"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastIdString"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.LineMapper(java.lang.Appendable)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 7)-(line 399,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.visit(com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, int, int, int, int)",
      "begin_line": 405,
      "end_line": 432,
      "comment": "\n     * As each segment is visited write out the appropriate line mapping.\n     ",
      "child_ranges": [
        "(line 409,col 7)-(line 409,col 45)",
        "(line 410,col 7)-(line 415,col 7)",
        "(line 416,col 7)-(line 416,col 37)",
        "(line 418,col 7)-(line 431,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.appendLineMappings()",
      "begin_line": 435,
      "end_line": 443,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 437,col 7)-(line 437,col 17)",
        "(line 439,col 7)-(line 439,col 46)",
        "(line 442,col 7)-(line 442,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.openLine()",
      "begin_line": 448,
      "end_line": 453,
      "comment": "\n     * Begin the entry for a new line.\n     ",
      "child_ranges": [
        "(line 449,col 7)-(line 452,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.closeLine()",
      "begin_line": 458,
      "end_line": 462,
      "comment": "\n     * End the entry for a line.\n     ",
      "child_ranges": [
        "(line 459,col 7)-(line 461,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.LineMapper.addCharEntry(java.lang.String)",
      "begin_line": 468,
      "end_line": 477,
      "comment": "\n     * Add a new char position entry.\n     * @param id The mapping id to record.\n     ",
      "child_ranges": [
        "(line 469,col 7)-(line 476,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UsedMappingCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor"
      ],
      "begin_line": 483,
      "end_line": 494,
      "comment": "\n   * Mark any visited mapping as \"used\".\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.UsedMappingCheck.visit(com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, int, int, int, int)",
      "begin_line": 487,
      "end_line": 493,
      "comment": "\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 490,col 7)-(line 492,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 496,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor.visit(com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, int, int, int, int)",
      "begin_line": 506,
      "end_line": 507,
      "comment": "\n     * @param m The mapping for the current code segment. null if the segment\n     *     is unmapped.\n     * @param line The starting line for this code segment.\n     * @param col The starting column for this code segment.\n     * @param endLine The ending line\n     * @param endCol The ending column\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MappingTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 514,
      "end_line": 634,
      "comment": "\n   * Walk the mappings and visit each segment of the mappings, unmapped\n   * segments are visited with a null mapping, unused mapping are not visited.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": " The last line and column written"
    },
    {
      "type": "field",
      "varNames": [
        "col"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.MappingTraversal()",
      "begin_line": 519,
      "end_line": 520,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.traverse(com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor)",
      "begin_line": 523,
      "end_line": 552,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 527,col 7)-(line 527,col 55)",
        "(line 528,col 7)-(line 544,col 7)",
        "(line 548,col 7)-(line 551,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.getAdjustedLine(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * @return The line adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 558,col 7)-(line 558,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.getAdjustedCol(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 564,
      "end_line": 570,
      "comment": "\n     * @return The column adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 565,col 7)-(line 565,col 32)",
        "(line 566,col 7)-(line 566,col 33)",
        "(line 568,col 7)-(line 569,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.isOverlapped(com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping)",
      "begin_line": 575,
      "end_line": 583,
      "comment": "\n     * @return Whether m1 ends before m2 starts.\n     ",
      "child_ranges": [
        "(line 577,col 7)-(line 577,col 40)",
        "(line 578,col 7)-(line 578,col 42)",
        "(line 579,col 7)-(line 579,col 42)",
        "(line 580,col 7)-(line 580,col 44)",
        "(line 582,col 7)-(line 582,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.maybeVisit(com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping)",
      "begin_line": 589,
      "end_line": 597,
      "comment": "\n     * Write any needed entries from the current position to the end of the\n     * provided mapping.\n     ",
      "child_ranges": [
        "(line 590,col 7)-(line 590,col 52)",
        "(line 591,col 7)-(line 591,col 50)",
        "(line 594,col 7)-(line 596,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.maybeVisitParent(com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping)",
      "begin_line": 602,
      "end_line": 611,
      "comment": "\n     * Write any needed entries to complete the provided mapping.\n     ",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 54)",
        "(line 605,col 7)-(line 605,col 52)",
        "(line 607,col 7)-(line 607,col 66)",
        "(line 608,col 7)-(line 610,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingTraversal.visit(com.google.debugging.sourcemap.SourceMapGeneratorV1.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV1.Mapping, int, int)",
      "begin_line": 617,
      "end_line": 633,
      "comment": "\n     * Write any entries needed between the current position the next position\n     * and update the current position.\n     ",
      "child_ranges": [
        "(line 620,col 7)-(line 620,col 49)",
        "(line 621,col 7)-(line 621,col 65)",
        "(line 623,col 7)-(line 627,col 7)",
        "(line 629,col 7)-(line 629,col 47)",
        "(line 631,col 7)-(line 631,col 22)",
        "(line 632,col 7)-(line 632,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.validate(boolean)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV1.appendIndexMapTo(java.lang.Appendable, java.lang.String, java.util.List\u003ccom.google.debugging.sourcemap.SourceMapSection\u003e)",
      "begin_line": 641,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 644,col 46)"
      ]
    }
  ]
}