{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/PrintStreamErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PrintStreamErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 30,
      "end_line": 77,
      "comment": "\n * \u003cp\u003eAn error manager that prints errors and warnings to the print stream\n * provided in addition to the functionality of the\n * {@link BasicErrorManager}.\u003c/p\u003e\n *\n * \u003cp\u003eIt collaborates with a {@link SourceExcerptProvider} via a\n * {@link MessageFormatter} to display error messages with source context.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "summaryDetailLevel"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.PrintStreamErrorManager(com.google.javascript.jscomp.MessageFormatter, java.io.PrintStream)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n   * Creates an error manager.\n   * @param formatter the message formatter used to format the messages\n   * @param stream the stream on which the errors and warnings should be\n   *     printed. This class does not close the stream\n   ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 31)",
        "(line 44,col 5)-(line 44,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.PrintStreamErrorManager(java.io.PrintStream)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n   * Creates an instance with a source-less error formatter.\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.setSummaryDetailLevel(int)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PrintStreamErrorManager.printSummary()",
      "begin_line": 63,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 75,col 5)"
      ]
    }
  ]
}