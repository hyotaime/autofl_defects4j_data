{
  "filepath": "/tmp/Closure-171b/src/com/google/debugging/sourcemap/SourceMapConsumerV2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapConsumerV2",
      "is_interface": false,
      "parent_types": [
        "com.google.debugging.sourcemap.SourceMapConsumer"
      ],
      "begin_line": 37,
      "end_line": 181,
      "comment": "\n * Class for parsing version 2 of the SourceMap format, as produced by the\n * Closure Compiler, etc.\n * @author johnlenz@google.com (John Lenz)\n * @author jschorr@google.com (Joseph Schorr)\n "
    },
    {
      "type": "field",
      "varNames": [
        "characterMap"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n   * The character map for each line. If a line does not have an entry,\n   * then it has not yet been decoded.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "lineMaps"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n   * The undecoded line maps. Will be accessed to decode lines as needed.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "mappings"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n   * Map of Mapping IDs to the actual mapping object.\n   "
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV2.SourceMapConsumerV2()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV2.parse(java.lang.String)",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 66,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV2.parse(org.json.JSONObject)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n   * Parses the given contents containing a source map.\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 77,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV2.parseInternal(org.json.JSONObject)",
      "begin_line": 83,
      "end_line": 142,
      "comment": "\n   * Parses the given contents as version 2 of a SourceMap.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 50)",
        "(line 88,col 5)-(line 90,col 5)",
        "(line 92,col 5)-(line 92,col 50)",
        "(line 93,col 5)-(line 95,col 5)",
        "(line 97,col 5)-(line 97,col 54)",
        "(line 98,col 5)-(line 98,col 54)",
        "(line 99,col 5)-(line 102,col 5)",
        "(line 106,col 5)-(line 106,col 37)",
        "(line 108,col 5)-(line 108,col 62)",
        "(line 109,col 5)-(line 110,col 53)",
        "(line 113,col 5)-(line 113,col 68)",
        "(line 114,col 5)-(line 114,col 57)",
        "(line 116,col 5)-(line 141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapConsumerV2.getMappingForLine(int, int)",
      "begin_line": 144,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 17)",
        "(line 148,col 5)-(line 148,col 18)",
        "(line 150,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 154,col 74)",
        "(line 155,col 5)-(line 155,col 76)",
        "(line 157,col 5)-(line 166,col 5)",
        "(line 168,col 5)-(line 168,col 53)",
        "(line 169,col 5)-(line 171,col 5)",
        "(line 173,col 5)-(line 173,col 37)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 178,col 37)",
        "(line 179,col 5)-(line 179,col 31)"
      ]
    }
  ]
}