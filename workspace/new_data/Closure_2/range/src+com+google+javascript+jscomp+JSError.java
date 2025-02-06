{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/JSError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSError",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 291,
      "comment": "\n * Compile error description\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " A type of the error "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Description of the error "
    },
    {
      "type": "field",
      "varNames": [
        "sourceName"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Name of the source "
    },
    {
      "type": "field",
      "varNames": [
        "node"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Node where the warning occurred. "
    },
    {
      "type": "field",
      "varNames": [
        "lineNumber"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Line number of the source "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " @deprecated Use #getDefaultLevel "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLevel"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charno"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " character number"
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n   * Creates a JSError with no source information\n   *\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(java.lang.String, int, int, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n   * Creates a JSError at a given source location\n   *\n   * @param sourceName The source file name\n   * @param lineno Line number with source file, or -1 if unknown\n   * @param charno Column number within line, or -1 for whole line.\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(java.lang.String, int, int, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n   * Creates a JSError at a given source location\n   *\n   * @param sourceName The source file name\n   * @param lineno Line number with source file, or -1 if unknown\n   * @param charno Column number within line, or -1 for whole line.\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 102,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n   * Creates a JSError from a file and Node position.\n   *\n   * @param sourceName The source file name\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n   * Creates a JSError from a file and Node position.\n   *\n   * @param n Determines the line and char position and source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.make(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n   * Creates a JSError from a file and Node position.\n   *\n   * @param sourceName The source file name\n   * @param n Determines the line and char position within the source file name\n   * @param type The DiagnosticType\n   * @param arguments Arguments to be incorporated into the message\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 141,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSError.JSError(java.lang.String, com.google.javascript.rhino.Node, int, int, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.jscomp.CheckLevel, java.lang.String...)",
      "begin_line": 152,
      "end_line": 163,
      "comment": "\n   * Creates a JSError at a CheckLevel for a source file location.\n   * Private to avoid any entanglement with code outside of the compiler.\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 21)",
        "(line 156,col 5)-(line 156,col 21)",
        "(line 157,col 5)-(line 157,col 53)",
        "(line 158,col 5)-(line 158,col 29)",
        "(line 159,col 5)-(line 159,col 25)",
        "(line 160,col 5)-(line 160,col 33)",
        "(line 161,col 5)-(line 161,col 59)",
        "(line 162,col 5)-(line 162,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JSError.JSError(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, java.lang.String...)",
      "begin_line": 169,
      "end_line": 176,
      "comment": "\n   * Creates a JSError for a source file location.  Private to avoid\n   * any entanglement with code outside of the compiler.\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getType()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.format(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.MessageFormatter)",
      "begin_line": 187,
      "end_line": 198,
      "comment": "\n   * Format a message at the given level.\n   *\n   * @return the formatted message or {@code null}\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 197,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.toString()",
      "begin_line": 200,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 207,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getCharno()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n   * Get the character number.\n   ",
      "child_ranges": [
        "(line 214,col 5)-(line 214,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getLineNumber()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n   * Get the line number. One-based.\n   ",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getNodeSourceOffset()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n   * @return the offset of the region the Error applies to, or -1 if the offset\n   *         is unknown.\n   ",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getNodeLength()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n   * @return the length of the region the Error applies to, or 0 if the length\n   *         is unknown.\n   ",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.getDefaultLevel()",
      "begin_line": 241,
      "end_line": 243,
      "comment": " The default level, before any of the WarningsGuards are applied. ",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 250,col 5)",
        "(line 251,col 5)-(line 253,col 5)",
        "(line 255,col 5)-(line 255,col 34)",
        "(line 257,col 5)-(line 259,col 5)",
        "(line 260,col 5)-(line 262,col 5)",
        "(line 263,col 5)-(line 265,col 5)",
        "(line 266,col 5)-(line 268,col 5)",
        "(line 269,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 277,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSError.hashCode()",
      "begin_line": 280,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 33)",
        "(line 284,col 5)-(line 284,col 50)",
        "(line 285,col 5)-(line 285,col 76)",
        "(line 286,col 5)-(line 286,col 38)",
        "(line 287,col 5)-(line 287,col 51)",
        "(line 288,col 5)-(line 288,col 34)",
        "(line 289,col 5)-(line 289,col 18)"
      ]
    }
  ]
}