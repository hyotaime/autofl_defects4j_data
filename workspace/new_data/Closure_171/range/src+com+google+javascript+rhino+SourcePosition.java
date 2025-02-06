{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/SourcePosition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourcePosition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 141,
      "comment": "\n * Represents a position in some piece of source code, with an associated\n * item of type T found at that position.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "item"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n   * The (well typed) item found at the source position.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "startLineno"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n   * The starting line number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "startCharno"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * The character position on the starting line.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "endLineno"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * The ending line number.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "endCharno"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n   * The character position on the ending line.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.setItem(T)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n   * Sets the item that this source position references.\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.setPositionInformation(int, int, int, int)",
      "begin_line": 83,
      "end_line": 105,
      "comment": "\n   * Sets the position information contained in this source position.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 99,col 5)",
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 31)",
        "(line 104,col 5)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.getItem()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n   * Returns the item found at this source position.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.getStartLine()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n   * Returns the starting line number of this position.\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.getPositionOnStartLine()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n   * Returns the character position on the starting line.\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.getEndLine()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n   * Returns the ending line number of this position.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SourcePosition.getPositionOnEndLine()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n   * Returns the character position on the ending line.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 21)"
      ]
    }
  ]
}