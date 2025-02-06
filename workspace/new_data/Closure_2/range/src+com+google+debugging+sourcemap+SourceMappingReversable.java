{
  "filepath": "/tmp/Closure-2b/src/com/google/debugging/sourcemap/SourceMappingReversable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMappingReversable",
      "is_interface": true,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapping"
      ],
      "begin_line": 27,
      "end_line": 46,
      "comment": "\n * A SourceMappingReversable is a SourceMapping that can provide the reverse\n * (source --\u003e target) source mapping.\n "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMappingReversable.getOriginalSources()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n   * @return the collection of original sources in this source mapping\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMappingReversable.getReverseMapping(java.lang.String, int, int)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n   * Given a source file, line, and column, return the reverse mapping (source --\u003e target).\n   * A collection is returned as in some cases (like a function being inlined), one source line\n   * may map to more then one target location. An empty collection is returned if there were\n   * no matches.\n   * @param originalFile the source file\n   * @param line the source line\n   * @param column the source column\n   * @return the reverse mapping (source --\u003e target)\n   ",
      "child_ranges": []
    }
  ]
}