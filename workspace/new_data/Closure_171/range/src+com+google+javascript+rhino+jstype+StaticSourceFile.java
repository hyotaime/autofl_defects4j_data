{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/jstype/StaticSourceFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StaticSourceFile",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 89,
      "comment": "\n * The {@code StaticSourceFile} contains information about a compiler input.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSourceFile.getName()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n   * The name of the file. Must be unique across all files in the compilation.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSourceFile.isExtern()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n   * Returns whether this is an externs file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSourceFile.getLineOffset(int)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n   * Returns the offset of the given line number relative to the file start.\n   * Line number should be 1-based.\n   *\n   * If the source file doesn\u0027t have line information, it should return\n   * Integer.MIN_VALUE. The negative offsets will make it more obvious\n   * what happened.\n   *\n   * @param lineNumber the line of the input to get the absolute offset of.\n   * @return the absolute offset of the start of the provided line.\n   * @throws IllegalArgumentException if lineno is less than 1 or greater than\n   *         the number of lines in the source.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSourceFile.getLineOfOffset(int)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n   * Gets the 1-based line number of the given source offset.\n   *\n   * @param offset An absolute file offset.\n   * @return The 1-based line number of that offset. The behavior is\n   *     undefined if this offset does not exist in the source file.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.jstype.StaticSourceFile.getColumnOfOffset(int)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n   * Gets the 0-based column number of the given source offset.\n   *\n   * @param offset An absolute file offset.\n   * @return The 0-based column number of that offset. The behavior is\n   *     undefined if this offset does not exist in the source file.\n   ",
      "child_ranges": []
    }
  ]
}