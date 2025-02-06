{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapConsumerFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapConsumerFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 82,
      "comment": "\n * Detect and parse the provided source map.\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerFactory.SourceMapConsumerFactory()",
      "begin_line": 29,
      "end_line": 29,
      "comment": " not constructible ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerFactory.parse(java.lang.String)",
      "begin_line": 36,
      "end_line": 39,
      "comment": "\n   * @param contents The string representing the source map file contents.\n   * @return The parsed source map.\n   * @throws SourceMapParseException\n   ",
      "child_ranges": [
        "(line 38,col 6)-(line 38,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerFactory.parse(java.lang.String, com.google.debugging.sourcemap.SourceMapSupplier)",
      "begin_line": 47,
      "end_line": 81,
      "comment": "\n   * @param contents The string representing the source map file contents.\n   * @param supplier A supplier for any referenced maps.\n   * @return The parsed source map.\n   * @throws SourceMapParseException\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 78,col 5)",
        "(line 80,col 5)-(line 80,col 76)"
      ]
    }
  ]
}