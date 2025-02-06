{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SourceExcerptProvider.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceExcerptProvider",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 93,
      "comment": "\n * A source excerpt provider is responsible for building source code excerpt\n * of specific locations, such as a specific line or a region around a\n * given line number.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.get(com.google.javascript.jscomp.SourceExcerptProvider, java.lang.String, int, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)",
      "begin_line": 33,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 37,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.get(com.google.javascript.jscomp.SourceExcerptProvider, java.lang.String, int, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt.get(com.google.javascript.jscomp.SourceExcerptProvider, java.lang.String, int, com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter)",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Get a source excerpt string based on the type of the source excerpt.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.getSourceLine(java.lang.String, int)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Get the line indicated by the line number. This call will return only the\n   * specific line.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file\n   * @return the line indicated, or {@code null} if it does not exist\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.getSourceRegion(java.lang.String, int)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n   * Get a region around the indicated line number. The exact definition of a\n   * region is implementation specific, but it must contain the line indicated\n   * by the line number. A region must not start or end by a carriage return.\n   *\n   * @param lineNumber the line number, 1 being the first line of the file\n   * @return the region around the line number indicated, or \u003ccode\u003enull\u003c/null\u003e\n   * if it does not exist\n   ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ExcerptFormatter",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 92,
      "comment": "\n   * A excerpt formatter is responsible of formatting source excerpts.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter.formatLine(java.lang.String, int)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Format a line excerpt.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter.formatRegion(com.google.javascript.jscomp.Region)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Format a region excerpt.\n     ",
      "child_ranges": []
    }
  ]
}