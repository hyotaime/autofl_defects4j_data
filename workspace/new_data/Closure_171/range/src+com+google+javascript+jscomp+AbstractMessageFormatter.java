{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/AbstractMessageFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMessageFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MessageFormatter"
      ],
      "begin_line": 27,
      "end_line": 87,
      "comment": "\n * Abstract message formatter providing default behavior for implementations\n * of {@link MessageFormatter} needing a {@link SourceExcerptProvider}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colorize"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.AbstractMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.setColorize(boolean)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.getSource()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n   * Get the source excerpt provider.\n   ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUPPORTED_COLOR_TERMINALS"
      ],
      "begin_line": 46,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.termSupportsColor(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "controlCharacter"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.Color.Color(java.lang.String)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 7)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.Color.getControlCharacter()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 7)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.getLevelName(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 77,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.maybeColorize(java.lang.String, com.google.javascript.jscomp.AbstractMessageFormatter.Color)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 83,col 5)",
        "(line 84,col 5)-(line 85,col 49)"
      ]
    }
  ]
}