{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/LightweightMessageFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LightweightMessageFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.AbstractMessageFormatter"
      ],
      "begin_line": 30,
      "end_line": 181,
      "comment": "\n * Lightweight message formatter. The format of messages this formatter\n * produces is very compact and to the point.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "excerpt"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "excerptFormatter"
      ],
      "begin_line": 32,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n   * A constructor for when the client doesn\u0027t care about source information.\n   ",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 16)",
        "(line 40,col 5)-(line 40,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LightweightMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider, com.google.javascript.jscomp.SourceExcerptProvider.SourceExcerpt)",
      "begin_line": 47,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 18)",
        "(line 50,col 5)-(line 50,col 39)",
        "(line 51,col 5)-(line 51,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.withoutSource()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.formatError(com.google.javascript.jscomp.JSError)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.formatWarning(com.google.javascript.jscomp.JSError)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.format(com.google.javascript.jscomp.JSError, boolean)",
      "begin_line": 68,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 47)",
        "(line 71,col 5)-(line 73,col 74)",
        "(line 76,col 5)-(line 76,col 42)",
        "(line 77,col 5)-(line 84,col 5)",
        "(line 86,col 5)-(line 86,col 76)",
        "(line 87,col 5)-(line 87,col 20)",
        "(line 89,col 5)-(line 89,col 32)",
        "(line 90,col 5)-(line 90,col 19)",
        "(line 91,col 5)-(line 111,col 5)",
        "(line 112,col 5)-(line 112,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LineNumberingFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.SourceExcerptProvider.ExcerptFormatter"
      ],
      "begin_line": 122,
      "end_line": 180,
      "comment": "\n   * Formats a region by appending line numbers in front, e.g.\n   * \u003cpre\u003e   9| if (foo) {\n   *   10|   alert(\u0027bar\u0027);\n   *   11| }\u003c/pre\u003e\n   * and return line excerpt without any modification.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter.formatLine(java.lang.String, int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter.formatRegion(com.google.javascript.jscomp.Region)",
      "begin_line": 128,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 132,col 7)",
        "(line 133,col 7)-(line 133,col 46)",
        "(line 134,col 7)-(line 136,col 7)",
        "(line 139,col 7)-(line 140,col 20)",
        "(line 143,col 7)-(line 143,col 67)",
        "(line 144,col 7)-(line 144,col 20)",
        "(line 145,col 7)-(line 145,col 42)",
        "(line 146,col 7)-(line 146,col 55)",
        "(line 147,col 7)-(line 177,col 7)",
        "(line 178,col 7)-(line 178,col 32)"
      ]
    }
  ]
}