{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapLineDecoder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapLineDecoder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 157,
      "comment": "\n * Class for parsing the line maps in SourceMap v2.\n *\n * @author johnlenz@google.com (John Lenz)\n * @author jschorr@google.com (Joseph Schorr)\n "
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLine(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n   * Decodes a line in a character map into a list of mapping IDs.\n   ",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.SourceMapLineDecoder()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLineEntry(java.lang.String, int)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLineEntry(com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser, int)",
      "begin_line": 44,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 22)",
        "(line 49,col 5)-(line 52,col 5)",
        "(line 54,col 5)-(line 54,col 21)",
        "(line 55,col 5)-(line 55,col 17)",
        "(line 56,col 5)-(line 74,col 5)",
        "(line 77,col 5)-(line 77,col 14)",
        "(line 78,col 5)-(line 78,col 18)",
        "(line 81,col 5)-(line 81,col 18)",
        "(line 82,col 5)-(line 85,col 5)",
        "(line 86,col 5)-(line 86,col 65)",
        "(line 87,col 5)-(line 87,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLine(com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser)",
      "begin_line": 90,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 63)",
        "(line 92,col 5)-(line 92,col 19)",
        "(line 93,col 5)-(line 100,col 5)",
        "(line 102,col 5)-(line 102,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.addBase64Digit(char, int)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n   * Build base64 number a digit at a time, most significant digit first.\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.getIdFromRelativeId(int, int, int)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "\n   * @return the id from the relative id.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 33)",
        "(line 118,col 5)-(line 118,col 63)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 124,
      "end_line": 131,
      "comment": "\n   * Simple class for tracking a single entry in a line map.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reps"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry.LineEntry(int, int)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 128,col 7)-(line 128,col 19)",
        "(line 129,col 7)-(line 129,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringParser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 137,
      "end_line": 156,
      "comment": "\n   * A simple class for maintaining the current location\n   * in the input.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser.StringParser(java.lang.String)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 7)-(line 142,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser.next()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 7)-(line 146,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser.peek()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 7)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser.hasNext()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 7)-(line 154,col 43)"
      ]
    }
  ]
}