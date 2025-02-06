{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapSection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapSection",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 105,
      "comment": "\n * A class representing a partial source map.\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": "\n   * A URL for a valid source map file that represents a section of a generate\n   * source file such as when multiple files are concatenated together.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.SourceMapSection(java.lang.String, int, int)",
      "begin_line": 47,
      "end_line": 53,
      "comment": "\n   * @param sectionUrl The URL for the partial source map\n   * @param line The number of lines into the file where the represented section\n   *    starts.\n   * @param column The number of characters into the line where the represented\n   *    section starts.\n   * @deprecated\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 32)",
        "(line 50,col 5)-(line 50,col 28)",
        "(line 51,col 5)-(line 51,col 21)",
        "(line 52,col 5)-(line 52,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.SourceMapSection(com.google.debugging.sourcemap.SourceMapSection.SectionType, java.lang.String, int, int)",
      "begin_line": 55,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 21)",
        "(line 58,col 5)-(line 58,col 23)",
        "(line 59,col 5)-(line 59,col 21)",
        "(line 60,col 5)-(line 60,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.forMap(java.lang.String, int, int)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.forURL(java.lang.String, int, int)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.getSectionType()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.getSectionUrl()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n   * @return the name of the map\n   * @deprecated\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 41)",
        "(line 82,col 5)-(line 82,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.getSectionValue()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n   * @return the value that represents the map for this section.\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.getLine()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n   * @return the starting line for this section\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapSection.getColumn()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n   * @return the column for this section\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 18)"
      ]
    }
  ]
}