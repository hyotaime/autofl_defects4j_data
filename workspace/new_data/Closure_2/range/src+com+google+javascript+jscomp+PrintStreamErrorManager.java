{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/PrintStreamErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrintStreamErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 32,
      "end_line": 79,
      "comment": "\n * \u003cp\u003eAn error manager that prints errors and warnings to the print stream\n * provided in addition to the functionality of the\n * {@link BasicErrorManager}.\u003c/p\u003e\n *\n * \u003cp\u003eIt collaborates with a {@link SourceExcerptProvider} via a\n * {@link MessageFormatter} to display error messages with source context.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.PrintStreamErrorManager(com.google.javascript.jscomp.MessageFormatter, java.io.PrintStream)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "\n   * Creates an error manager.\n   * @param formatter the message formatter used to format the messages\n   * @param stream the stream on which the errors and warnings should be\n   *     printed. This class does not close the stream\n   ",
      "child_ranges": [
        "(line 45,col 5)-(line 45,col 31)",
        "(line 46,col 5)-(line 46,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.PrintStreamErrorManager(java.io.PrintStream)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n   * Creates an instance with a source-less error formatter.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.setSummaryDetailLevel(int)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.printSummary()",
      "begin_line": 65,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 77,col 5)"
      ]
    }
  ]
}