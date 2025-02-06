{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/FilePosition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FilePosition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 49,
      "comment": "\n * Represents a position in a source file.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "line"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "column"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.FilePosition.FilePosition(int, int)",
      "begin_line": 27,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 28,col 5)-(line 28,col 21)",
        "(line 29,col 5)-(line 29,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.FilePosition.getLine()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n   * Returns the line number of this position.\n   * Note: The v1 and v2 source maps use a line number with the first line\n   * being 1, whereas the v3 source map corrects this and uses a first line\n   * number of 0 to be consistent with the column representation.\n   ",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.FilePosition.getColumn()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n   * @return the character index on the line\n   * of this position, with the first column being 0.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 18)"
      ]
    }
  ]
}