{
  "filepath": "/tmp/Closure-2b/src/com/google/debugging/sourcemap/Util.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Util",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 149,
      "comment": "\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEX_CHARS"
      ],
      "begin_line": 26,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Util.escapeString(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n   * Escapes the given string to a double quoted (\") JavaScript/JSON string\n   ",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Util.escapeString(java.lang.String, char, java.lang.String, java.lang.String, java.lang.String, java.nio.charset.CharsetEncoder)",
      "begin_line": 38,
      "end_line": 107,
      "comment": " Helper to escape JavaScript string as well as regular expression ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 57)",
        "(line 44,col 5)-(line 44,col 21)",
        "(line 45,col 5)-(line 104,col 5)",
        "(line 105,col 5)-(line 105,col 21)",
        "(line 106,col 5)-(line 106,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Util.appendCharAsHex(java.lang.StringBuilder, char)",
      "begin_line": 112,
      "end_line": 121,
      "comment": "\n   * @see #appendHexJavaScriptRepresentation(Appendable, int)\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 120,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.Util.appendHexJavaScriptRepresentation(java.lang.Appendable, int)",
      "begin_line": 129,
      "end_line": 147,
      "comment": "\n   * Returns a JavaScript representation of the character in a hex escaped\n   * format.\n   * @param out The buffer to which the hex representation should be appended.\n   * @param codePoint The code point to append.\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 141,col 5)",
        "(line 142,col 5)-(line 146,col 44)"
      ]
    }
  ]
}