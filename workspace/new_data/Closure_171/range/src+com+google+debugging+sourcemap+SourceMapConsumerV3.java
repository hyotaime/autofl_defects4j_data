{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapConsumerV3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapConsumerV3",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumer",
        "com.google.debugging.sourcemap.SourceMappingReversable"
      ],
      "begin_line": 43,
      "end_line": 724,
      "comment": "\n * Class for parsing version 3 of the SourceMap format, as produced by the\n * Closure Compiler, etc.\n * http://code.google.com/p/closure-compiler/wiki/SourceMaps\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "UNMAPPED"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sources"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "names"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lineCount"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lines"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Slots in the lines list will be null if the line does not have any entries."
    },
    {
      "type": "field",
      "varNames": [
        "reverseSourceMapping"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": " originalFile path \u003d\u003d\u003e original line \u003d\u003d\u003e target mappings "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.SourceMapConsumerV3()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "DefaultSourceMapSupplier",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapSupplier"
      ],
      "begin_line": 60,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier.getSourceMap(java.lang.String)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 7)-(line 63,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.parse(java.lang.String)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.parse(java.lang.String, com.google.debugging.sourcemap.SourceMapSupplier)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 85,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.parse(org.json.JSONObject)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.parse(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)",
      "begin_line": 98,
      "end_line": 130,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.parseMetaMap(org.json.JSONObject, com.google.debugging.sourcemap.SourceMapSupplier)",
      "begin_line": 136,
      "end_line": 203,
      "comment": "\n   * @param sourceMapRoot\n   * @throws SourceMapParseException\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 141,col 5)",
        "(line 143,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getMappingForLine(int, int)",
      "begin_line": 205,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 17)",
        "(line 209,col 5)-(line 209,col 13)",
        "(line 211,col 5)-(line 213,col 5)",
        "(line 215,col 5)-(line 215,col 46)",
        "(line 216,col 5)-(line 216,col 42)",
        "(line 220,col 5)-(line 222,col 5)",
        "(line 224,col 5)-(line 224,col 53)",
        "(line 226,col 5)-(line 226,col 49)",
        "(line 227,col 5)-(line 229,col 5)",
        "(line 231,col 5)-(line 231,col 63)",
        "(line 232,col 5)-(line 232,col 65)",
        "(line 233,col 5)-(line 233,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalSources()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 238,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getReverseMapping(java.lang.String, int, int)",
      "begin_line": 241,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 250,col 5)",
        "(line 252,col 5)-(line 253,col 47)",
        "(line 255,col 5)-(line 266,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getJavaStringArray(org.json.JSONArray)",
      "begin_line": 269,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 29)",
        "(line 271,col 5)-(line 271,col 38)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 275,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MappingBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 278,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_ENTRY_VALUES"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousCol"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSrcId"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSrcLine"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousSrcColumn"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousNameId"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.MappingBuilder(java.lang.String)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 289,col 7)-(line 289,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.build()",
      "begin_line": 292,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 293,col 7)-(line 293,col 46)",
        "(line 294,col 7)-(line 294,col 56)",
        "(line 295,col 7)-(line 327,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.validateEntry(com.google.debugging.sourcemap.SourceMapConsumerV3.Entry)",
      "begin_line": 333,
      "end_line": 339,
      "comment": "\n     * Sanity check the entry.\n     ",
      "child_ranges": [
        "(line 334,col 7)-(line 334,col 49)",
        "(line 335,col 7)-(line 336,col 55)",
        "(line 337,col 7)-(line 338,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.decodeEntry(int[], int)",
      "begin_line": 349,
      "end_line": 406,
      "comment": "\n     * Decodes the next entry, using the previous encountered values to\n     * decode the relative values.\n     *\n     * @param vals An array of integers that represent values in the entry.\n     * @param entryValues The number of entries in the array.\n     * @return The entry object.\n     ",
      "child_ranges": [
        "(line 350,col 7)-(line 350,col 18)",
        "(line 351,col 7)-(line 405,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.tryConsumeToken(char)",
      "begin_line": 408,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 409,col 7)-(line 413,col 7)",
        "(line 414,col 7)-(line 414,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.entryComplete()",
      "begin_line": 417,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 418,col 7)-(line 420,col 7)",
        "(line 422,col 7)-(line 422,col 30)",
        "(line 423,col 7)-(line 423,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.nextValue()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 427,col 7)-(line 427,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.search(java.util.ArrayList\u003ccom.google.debugging.sourcemap.SourceMapConsumerV3.Entry\u003e, int, int, int)",
      "begin_line": 435,
      "end_line": 455,
      "comment": "\n   * Perform a binary search on the array to find a section that covers\n   * the target column.\n   ",
      "child_ranges": [
        "(line 436,col 5)-(line 454,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.compareEntry(java.util.ArrayList\u003ccom.google.debugging.sourcemap.SourceMapConsumerV3.Entry\u003e, int, int)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n   * Compare an array entry\u0027s column value to the target column value.\n   ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getPreviousMapping(int)",
      "begin_line": 468,
      "end_line": 477,
      "comment": "\n   * Returns the mapping entry that proceeds the supplied line or null if no\n   * such entry exists.\n   ",
      "child_ranges": [
        "(line 469,col 5)-(line 474,col 44)",
        "(line 475,col 5)-(line 475,col 53)",
        "(line 476,col 5)-(line 476,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.getOriginalMappingForEntry(com.google.debugging.sourcemap.SourceMapConsumerV3.Entry)",
      "begin_line": 482,
      "end_line": 496,
      "comment": "\n   * Creates an \"OriginalMapping\" object for the given entry object.\n   ",
      "child_ranges": [
        "(line 483,col 5)-(line 495,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.createReverseMapping()",
      "begin_line": 503,
      "end_line": 542,
      "comment": "\n   * Reverse the source map; the created mapping will allow us to quickly go\n   * from a source file and line number to a collection of target\n   * OriginalMappings.\n   ",
      "child_ranges": [
        "(line 504,col 5)-(line 505,col 73)",
        "(line 507,col 5)-(line 541,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringCharIterator",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.Base64VLQ.CharIterator"
      ],
      "begin_line": 548,
      "end_line": 571,
      "comment": "\n   * A implementation of the Base64VLQ CharIterator used for decoding the\n   * mappings encoded in the JSON string.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator.StringCharIterator(java.lang.String)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 554,col 7)-(line 554,col 29)",
        "(line 555,col 7)-(line 555,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator.next()",
      "begin_line": 558,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 7)-(line 560,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator.peek()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 7)-(line 564,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator.hasNext()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 576,
      "end_line": 582,
      "comment": "\n   * Represents a mapping entry in the source map.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry.getGeneratedColumn()",
      "begin_line": 577,
      "end_line": 577,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry.getSourceFileId()",
      "begin_line": 578,
      "end_line": 578,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry.getSourceLine()",
      "begin_line": 579,
      "end_line": 579,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry.getSourceColumn()",
      "begin_line": 580,
      "end_line": 580,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry.getNameId()",
      "begin_line": 581,
      "end_line": 581,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "UnmappedEntry",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumerV3.Entry"
      ],
      "begin_line": 588,
      "end_line": 619,
      "comment": "\n   * This class represents a portion of the generated file, that is not mapped\n   * to a section in the original source.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.UnmappedEntry(int)",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 7)-(line 592,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.getGeneratedColumn()",
      "begin_line": 595,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 597,col 7)-(line 597,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.getSourceFileId()",
      "begin_line": 600,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 602,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.getSourceLine()",
      "begin_line": 605,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.getSourceColumn()",
      "begin_line": 610,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 7)-(line 612,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry.getNameId()",
      "begin_line": 615,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 7)-(line 617,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnnamedEntry",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry"
      ],
      "begin_line": 625,
      "end_line": 656,
      "comment": "\n   * This class represents a portion of the generated file, that is mapped\n   * to a section in the original source.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "srcFile"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "srcLine"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "srcColumn"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry.UnnamedEntry(int, int, int, int)",
      "begin_line": 630,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 631,col 7)-(line 631,col 20)",
        "(line 632,col 7)-(line 632,col 29)",
        "(line 633,col 7)-(line 633,col 29)",
        "(line 634,col 7)-(line 634,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry.getSourceFileId()",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 639,col 7)-(line 639,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry.getSourceLine()",
      "begin_line": 642,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 644,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry.getSourceColumn()",
      "begin_line": 647,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry.getNameId()",
      "begin_line": 652,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 7)-(line 654,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NamedEntry",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry"
      ],
      "begin_line": 662,
      "end_line": 674,
      "comment": "\n   * This class represents a portion of the generated file, that is mapped\n   * to a section in the original source, and is associated with a name.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.NamedEntry.NamedEntry(int, int, int, int, int)",
      "begin_line": 665,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 49)",
        "(line 667,col 7)-(line 667,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.NamedEntry.getNameId()",
      "begin_line": 670,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 672,col 7)-(line 672,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EntryVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 676,
      "end_line": 682,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor.visit(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 677,
      "end_line": 681,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV3.visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor)",
      "begin_line": 684,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 685,col 5)-(line 685,col 28)",
        "(line 686,col 5)-(line 686,col 29)",
        "(line 687,col 5)-(line 687,col 29)",
        "(line 688,col 5)-(line 688,col 44)",
        "(line 689,col 5)-(line 689,col 38)",
        "(line 691,col 5)-(line 691,col 39)",
        "(line 692,col 5)-(line 722,col 5)"
      ]
    }
  ]
}