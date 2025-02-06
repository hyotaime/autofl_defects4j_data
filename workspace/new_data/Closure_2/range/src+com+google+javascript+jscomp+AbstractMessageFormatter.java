{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/AbstractMessageFormatter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMessageFormatter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.MessageFormatter"
      ],
      "begin_line": 28,
      "end_line": 87,
      "comment": "\n * Abstract message formatter providing default behavior for implementations\n * of {@link MessageFormatter} needing a {@link SourceExcerptProvider}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "colorize"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.AbstractMessageFormatter(com.google.javascript.jscomp.SourceExcerptProvider)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.setColorize(boolean)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.getSource()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n   * Get the source excerpt provider.\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SUPPORTED_COLOR_TERMINALS"
      ],
      "begin_line": 47,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.termSupportsColor(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 52)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "controlCharacter"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.Color.Color(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.Color.getControlCharacter()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.getLevelName(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 78,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AbstractMessageFormatter.maybeColorize(java.lang.String, com.google.javascript.jscomp.AbstractMessageFormatter.Color)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 31)",
        "(line 84,col 5)-(line 85,col 49)"
      ]
    }
  ]
}