{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 103,
      "comment": "\n * Collects information mapping the generated (compiled) source back to\n * its original source for debugging purposes\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.appendTo(java.lang.Appendable, java.lang.String)",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n   * Appends the source map to the given buffer.\n   *\n   * @param out The stream to which the map will be appended.\n   * @param name The name of the generated source file that this source map\n   *   represents.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.appendIndexMapTo(java.lang.Appendable, java.lang.String, java.util.List\u003ccom.google.debugging.sourcemap.SourceMapSection\u003e)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n   * Appends the index source map to the given buffer.\n   *\n   * @param out The stream to which the map will be appended.\n   * @param name The name of the generated source file that this source map\n   *   represents.\n   * @param sections An ordered list of map sections to include in the index.\n   * @throws IOException\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.reset()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n   * Resets the source map for reuse. A reset needs to be called between\n   * each generated output file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.addMapping(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n   * Adds a mapping for the given node.  Mappings must be added in order.\n   * @param sourceName The file name to use in the generate source map\n   *     to represent this source.\n   * @param symbolName The symbol name associated with this position in the\n   *     source map.\n   * @param sourceStartPosition The starting position in the original source for\n   *     represented range outputStartPosition to outputEndPosition in the\n   *     generated file.\n   * @param outputStartPosition The position on the starting line\n   * @param outputEndPosition The position on the ending line.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.setWrapperPrefix(java.lang.String)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n   * Sets the prefix used for wrapping the generated source file before\n   * it is written. This ensures that the source map is adjusted for the\n   * change in character offsets.\n   *\n   * @param prefix The prefix that is added before the generated source code.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.setStartingPosition(int, int)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n   * Sets the source code that exists in the buffer for which the\n   * generated code is being generated. This ensures that the source map\n   * accurately reflects the fact that the source is being appended to\n   * an existing buffer and as such, does not start at line 0, position 0\n   * but rather some other line and position.\n   *\n   * @param offsetLine The index of the current line being printed.\n   * @param offsetIndex The column index of the current character being printed.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapGenerator.validate(boolean)",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n   * Whether to perform additional validation on the source map.\n   * @param validate\n   ",
      "child_ranges": []
    }
  ]
}