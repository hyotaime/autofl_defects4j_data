{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapGeneratorV3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapGeneratorV3",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGenerator"
      ],
      "begin_line": 40,
      "end_line": 793,
      "comment": "\n * Collects information mapping the generated (compiled) source back to\n * its original source for debugging purposes.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNMAPPED"
      ],
      "begin_line": 42,
      "end_line": 42,
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
      "comment": "\n   * A map of source names to source name index\n   "
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
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.reset()",
      "begin_line": 94,
      "end_line": 104,
      "comment": "\n   * {@inheritDoc}\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 21)",
        "(line 97,col 5)-(line 97,col 23)",
        "(line 98,col 5)-(line 98,col 26)",
        "(line 99,col 5)-(line 99,col 28)",
        "(line 100,col 5)-(line 100,col 26)",
        "(line 101,col 5)-(line 101,col 29)",
        "(line 102,col 5)-(line 102,col 44)",
        "(line 103,col 5)-(line 103,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.validate(boolean)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n   * @param validate Whether to perform (potentially costly) validation on the\n   * generated source map.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.setWrapperPrefix(java.lang.String)",
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
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.setStartingPosition(int, int)",
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
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.addMapping(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 162,
      "end_line": 226,
      "comment": "\n   * Adds a mapping for the given node.  Mappings must be added in order.\n   * @param startPosition The position on the starting line\n   * @param endPosition The position on the ending line.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 171,col 5)",
        "(line 173,col 5)-(line 173,col 47)",
        "(line 174,col 5)-(line 174,col 43)",
        "(line 176,col 5)-(line 201,col 5)",
        "(line 204,col 5)-(line 204,col 36)",
        "(line 205,col 5)-(line 205,col 36)",
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
      "type": "class_interface",
      "name": "ConsumerEntryVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor"
      ],
      "begin_line": 228,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.ConsumerEntryVisitor.visit(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 230,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 235,col 7)-(line 236,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.mergeMapSection(int, int, java.lang.String)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 242,col 6)-(line 242,col 39)",
        "(line 243,col 6)-(line 243,col 61)",
        "(line 244,col 6)-(line 244,col 39)",
        "(line 245,col 6)-(line 245,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendTo(java.lang.Appendable, java.lang.String)",
      "begin_line": 274,
      "end_line": 306,
      "comment": "\n   * Writes out the source map in the following format (line numbers are for\n   * reference only and are not part of the format):\n   *\n   * 1.  {\n   * 2.    version: 3,\n   * 3.    file: \"out.js\",\n   * 4.    lineCount: 2,\n   * 5.    sourceRoot: \"\",\n   * 6.    sources: [\"foo.js\", \"bar.js\"],\n   * 7.    names: [\"src\", \"maps\", \"are\", \"fun\"],\n   * 8.    mappings: \"a;;abcde,abcd,a;\"\n   * 9.  }\n   *\n   * Line 1: The entire file is a single JSON object\n   * Line 2: File revision (always the first entry in the object)\n   * Line 3: The name of the file that this source map is associated with.\n   * Line 4: The number of lines represented in the source map.\n   * Line 5: An optional source root, useful for relocating source files on a\n   *     server or removing repeated prefix values in the \"sources\" entry.\n   * Line 6: A list of sources used by the \"mappings\" entry relative to the\n   *     sourceRoot.\n   * Line 7: A list of symbol names used by the \"mapping\" entry.  This list\n   *     may be incomplete.\n   * Line 8: The mappings field.\n   ",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 33)",
        "(line 279,col 5)-(line 279,col 22)",
        "(line 280,col 5)-(line 280,col 42)",
        "(line 281,col 5)-(line 281,col 49)",
        "(line 282,col 5)-(line 282,col 63)",
        "(line 285,col 5)-(line 285,col 38)",
        "(line 287,col 5)-(line 287,col 47)",
        "(line 289,col 5)-(line 289,col 24)",
        "(line 292,col 5)-(line 292,col 37)",
        "(line 293,col 5)-(line 293,col 20)",
        "(line 294,col 5)-(line 294,col 26)",
        "(line 295,col 5)-(line 295,col 20)",
        "(line 296,col 5)-(line 296,col 24)",
        "(line 299,col 5)-(line 299,col 35)",
        "(line 300,col 5)-(line 300,col 20)",
        "(line 301,col 5)-(line 301,col 26)",
        "(line 302,col 5)-(line 302,col 20)",
        "(line 303,col 5)-(line 303,col 24)",
        "(line 305,col 5)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.addSourceNameMap(java.lang.Appendable)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n   * Writes the source name map to \u0027out\u0027.\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.addSymbolNameMap(java.lang.Appendable)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n   * Writes the source name map to \u0027out\u0027.\n   ",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.addNameMap(java.lang.Appendable, java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e)",
      "begin_line": 322,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 14)",
        "(line 325,col 5)-(line 332,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.escapeString(java.lang.String)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n   * Escapes the given string for JSON.\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFirstField(java.lang.Appendable, java.lang.String, java.lang.CharSequence)",
      "begin_line": 344,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 347,col 21)",
        "(line 348,col 5)-(line 348,col 21)",
        "(line 349,col 5)-(line 349,col 21)",
        "(line 350,col 5)-(line 350,col 20)",
        "(line 351,col 5)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(java.lang.Appendable, java.lang.String, java.lang.CharSequence)",
      "begin_line": 354,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 22)",
        "(line 358,col 5)-(line 358,col 21)",
        "(line 359,col 5)-(line 359,col 21)",
        "(line 360,col 5)-(line 360,col 21)",
        "(line 361,col 5)-(line 361,col 20)",
        "(line 362,col 5)-(line 362,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldStart(java.lang.Appendable, java.lang.String)",
      "begin_line": 365,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldEnd(java.lang.Appendable)",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.prepMappings()",
      "begin_line": 378,
      "end_line": 395,
      "comment": "\n   * Assigns sequential ids to used mappings, and returns the last line mapped.\n   ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 62)",
        "(line 383,col 5)-(line 383,col 15)",
        "(line 384,col 5)-(line 384,col 20)",
        "(line 385,col 5)-(line 391,col 5)",
        "(line 394,col 5)-(line 394,col 46)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Mapping",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 401,
      "end_line": 441,
      "comment": "\n   * A mapping from a given position in an input source file to a given position\n   * in the generated code.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": "\n     * A unique ID for this mapping for record keeping purposes.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sourceFile"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": "\n     * The source file index.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalPosition"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": "\n     * The position of the code in the input source file. Both\n     * the line number and the character index are indexed by\n     * 1 for legacy reasons via the Rhino Node class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startPosition"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": "\n     * The starting position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "endPosition"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": "\n     * The ending position of the code in the generated source\n     * file which this mapping represents. Indexed by 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originalName"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": "\n     * The original name of the token found at the position\n     * represented by this mapping (if any).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "used"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": "\n     * Whether the mapping is actually used by the source map.\n     "
    },
    {
      "type": "class_interface",
      "name": "UsedMappingCheck",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor"
      ],
      "begin_line": 446,
      "end_line": 457,
      "comment": "\n   * Mark any visited mapping as \"used\".\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.UsedMappingCheck.visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, int, int, int, int)",
      "begin_line": 450,
      "end_line": 456,
      "comment": "\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 453,col 7)-(line 455,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 459,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor.visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, int, int, int, int)",
      "begin_line": 469,
      "end_line": 470,
      "comment": "\n     * @param m The mapping for the current code segment. null if the segment\n     *     is unmapped.\n     * @param line The starting line for this code segment.\n     * @param col The starting column for this code segment.\n     * @param endLine The ending line\n     * @param endCol The ending column\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MappingTraversal",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 477,
      "end_line": 597,
      "comment": "\n   * Walk the mappings and visit each segment of the mappings, unmapped\n   * segments are visited with a null mapping, unused mapping are not visited.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 479,
      "end_line": 479,
      "comment": " The last line and column written"
    },
    {
      "type": "field",
      "varNames": [
        "col"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.MappingTraversal()",
      "begin_line": 482,
      "end_line": 483,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.traverse(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor)",
      "begin_line": 486,
      "end_line": 515,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 490,col 7)-(line 490,col 55)",
        "(line 491,col 7)-(line 507,col 7)",
        "(line 511,col 7)-(line 514,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.getAdjustedLine(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * @return The line adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 521,col 7)-(line 521,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.getAdjustedCol(com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 527,
      "end_line": 533,
      "comment": "\n     * @return The column adjusted for the prefix position.\n     ",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 32)",
        "(line 529,col 7)-(line 529,col 33)",
        "(line 531,col 7)-(line 532,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.isOverlapped(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping)",
      "begin_line": 538,
      "end_line": 546,
      "comment": "\n     * @return Whether m1 ends before m2 starts.\n     ",
      "child_ranges": [
        "(line 540,col 7)-(line 540,col 40)",
        "(line 541,col 7)-(line 541,col 42)",
        "(line 542,col 7)-(line 542,col 42)",
        "(line 543,col 7)-(line 543,col 44)",
        "(line 545,col 7)-(line 545,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.maybeVisit(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping)",
      "begin_line": 552,
      "end_line": 560,
      "comment": "\n     * Write any needed entries from the current position to the end of the\n     * provided mapping.\n     ",
      "child_ranges": [
        "(line 553,col 7)-(line 553,col 52)",
        "(line 554,col 7)-(line 554,col 50)",
        "(line 557,col 7)-(line 559,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.maybeVisitParent(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping)",
      "begin_line": 565,
      "end_line": 574,
      "comment": "\n     * Write any needed entries to complete the provided mapping.\n     ",
      "child_ranges": [
        "(line 567,col 7)-(line 567,col 54)",
        "(line 568,col 7)-(line 568,col 52)",
        "(line 570,col 7)-(line 570,col 66)",
        "(line 571,col 7)-(line 573,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal.visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, int, int)",
      "begin_line": 580,
      "end_line": 596,
      "comment": "\n     * Write any entries needed between the current position the next position\n     * and update the current position.\n     ",
      "child_ranges": [
        "(line 583,col 7)-(line 583,col 49)",
        "(line 584,col 7)-(line 584,col 65)",
        "(line 586,col 7)-(line 590,col 7)",
        "(line 592,col 7)-(line 592,col 47)",
        "(line 594,col 7)-(line 594,col 22)",
        "(line 595,col 7)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.appendIndexMapTo(java.lang.Appendable, java.lang.String, java.util.List\u003ccom.google.debugging.sourcemap.SourceMapSection\u003e)",
      "begin_line": 608,
      "end_line": 644,
      "comment": "\n   * Appends the index source map to the given buffer.\n   *\n   * @param out The stream to which the map will be appended.\n   * @param name The name of the generated source file that this source map\n   *   represents.\n   * @param sections An ordered list of map sections to include in the index.\n   * @throws IOException\n   ",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 22)",
        "(line 614,col 5)-(line 614,col 42)",
        "(line 615,col 5)-(line 615,col 49)",
        "(line 618,col 5)-(line 618,col 38)",
        "(line 619,col 5)-(line 619,col 22)",
        "(line 620,col 5)-(line 620,col 25)",
        "(line 621,col 5)-(line 638,col 5)",
        "(line 640,col 5)-(line 640,col 22)",
        "(line 641,col 5)-(line 641,col 24)",
        "(line 643,col 5)-(line 643,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.offsetValue(int, int)",
      "begin_line": 646,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 647,col 5)-(line 647,col 44)",
        "(line 648,col 5)-(line 648,col 22)",
        "(line 649,col 5)-(line 649,col 56)",
        "(line 650,col 5)-(line 650,col 55)",
        "(line 651,col 5)-(line 651,col 22)",
        "(line 652,col 5)-(line 652,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.getSourceId(java.lang.String)",
      "begin_line": 655,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 656,col 5)-(line 665,col 5)",
        "(line 666,col 5)-(line 666,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.getNameId(java.lang.String)",
      "begin_line": 669,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 670,col 5)-(line 670,col 26)",
        "(line 671,col 5)-(line 671,col 52)",
        "(line 672,col 5)-(line 677,col 5)",
        "(line 678,col 5)-(line 678,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineMapper",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor"
      ],
      "begin_line": 681,
      "end_line": 791,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 683,
      "end_line": 683,
      "comment": " The destination."
    },
    {
      "type": "field",
      "varNames": [
        "previousLine"
      ],
      "begin_line": 685,
      "end_line": 685,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousColumn"
      ],
      "begin_line": 686,
      "end_line": 686,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSourceFileId"
      ],
      "begin_line": 689,
      "end_line": 689,
      "comment": " Previous values used for storing relative ids."
    },
    {
      "type": "field",
      "varNames": [
        "previousSourceLine"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSourceColumn"
      ],
      "begin_line": 691,
      "end_line": 691,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousNameId"
      ],
      "begin_line": 692,
      "end_line": 692,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.LineMapper(java.lang.Appendable)",
      "begin_line": 694,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 695,col 7)-(line 695,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, int, int, int, int)",
      "begin_line": 701,
      "end_line": 726,
      "comment": "\n     * As each segment is visited write out the appropriate line mapping.\n     ",
      "child_ranges": [
        "(line 705,col 7)-(line 707,col 7)",
        "(line 709,col 7)-(line 716,col 7)",
        "(line 718,col 7)-(line 725,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.writeEntry(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping, int)",
      "begin_line": 734,
      "end_line": 760,
      "comment": "\n     * Writes an entry for the given column (of the generated text) and\n     * associated mapping.\n     * The values are stored as relative to the last seen values for each\n     * field and encoded as Base64VLQs.\n     ",
      "child_ranges": [
        "(line 736,col 7)-(line 736,col 53)",
        "(line 737,col 7)-(line 737,col 30)",
        "(line 738,col 7)-(line 759,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.appendLineMappings()",
      "begin_line": 763,
      "end_line": 771,
      "comment": " Append the line mapping entries.",
      "child_ranges": [
        "(line 765,col 7)-(line 765,col 21)",
        "(line 767,col 7)-(line 767,col 46)",
        "(line 770,col 7)-(line 770,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.openLine(boolean)",
      "begin_line": 776,
      "end_line": 780,
      "comment": "\n     * Begin the entry for a new line.\n     ",
      "child_ranges": [
        "(line 777,col 7)-(line 779,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.closeLine(boolean)",
      "begin_line": 785,
      "end_line": 790,
      "comment": "\n     * End the entry for a line.\n     ",
      "child_ranges": [
        "(line 786,col 7)-(line 786,col 22)",
        "(line 787,col 7)-(line 789,col 7)"
      ]
    }
  ]
}