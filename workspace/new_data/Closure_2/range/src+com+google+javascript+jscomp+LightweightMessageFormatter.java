{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/LightweightMessageFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LightweightMessageFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractMessageFormatter"
      ],
      "begin_line": 31,
      "end_line": 182,
      "comment": "\n * Lightweight message formatter. The format of messages this formatter\n * produces is very compact and to the point.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "excerpt"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "excerptFormatter"
      ],
      "begin_line": 33,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter()",
      "begin_line": 39,
      "end_line": 42,
      "comment": "\n   * A constructor for when the client doesn\u0027t care about source information.\n   ",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 16)",
        "(line 41,col 5)-(line 41,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider, com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)",
      "begin_line": 48,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 18)",
        "(line 51,col 5)-(line 51,col 39)",
        "(line 52,col 5)-(line 52,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.formatError(com.google.javascript.jscomp.JSError)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(com.google.javascript.jscomp.JSError)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.format(com.google.javascript.jscomp.JSError, boolean)",
      "begin_line": 69,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 47)",
        "(line 72,col 5)-(line 74,col 74)",
        "(line 77,col 5)-(line 77,col 42)",
        "(line 78,col 5)-(line 85,col 5)",
        "(line 87,col 5)-(line 87,col 76)",
        "(line 88,col 5)-(line 88,col 20)",
        "(line 90,col 5)-(line 90,col 32)",
        "(line 91,col 5)-(line 91,col 19)",
        "(line 92,col 5)-(line 112,col 5)",
        "(line 113,col 5)-(line 113,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineNumberingFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter"
      ],
      "begin_line": 123,
      "end_line": 181,
      "comment": "\n   * Formats a region by appending line numbers in front, e.g.\n   * \u003cpre\u003e   9| if (foo) {\n   *   10|   alert(\u0027bar\u0027);\n   *   11| }\u003c/pre\u003e\n   * and return line excerpt without any modification.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter.formatLine(java.lang.String, int)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 7)-(line 126,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter.formatRegion(com.google.javascript.jscomp.Region)",
      "begin_line": 129,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 133,col 7)",
        "(line 134,col 7)-(line 134,col 46)",
        "(line 135,col 7)-(line 137,col 7)",
        "(line 140,col 7)-(line 141,col 20)",
        "(line 144,col 7)-(line 144,col 67)",
        "(line 145,col 7)-(line 145,col 20)",
        "(line 146,col 7)-(line 146,col 42)",
        "(line 147,col 7)-(line 147,col 55)",
        "(line 148,col 7)-(line 178,col 7)",
        "(line 179,col 7)-(line 179,col 32)"
      ]
    }
  ]
}