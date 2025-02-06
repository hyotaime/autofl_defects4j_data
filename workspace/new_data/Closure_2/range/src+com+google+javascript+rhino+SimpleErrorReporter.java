{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/rhino/SimpleErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleErrorReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.ErrorReporter"
      ],
      "begin_line": 50,
      "end_line": 106,
      "comment": "\n * A simple {@link ErrorReporter} that collects warnings and errors and makes\n * them accessible via {@link #errors()} and {@link #warnings()}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 54,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 61,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 64,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 71,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.errors()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns the list of errors, or {@code null} if there were none.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.warnings()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the list of warnings, or {@code null} if there were none.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.formatDetailedMessage(java.lang.String, java.lang.String, int, int)",
      "begin_line": 88,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 90,col 7)-(line 90,col 31)",
        "(line 91,col 7)-(line 93,col 7)",
        "(line 94,col 7)-(line 94,col 53)",
        "(line 95,col 7)-(line 95,col 23)",
        "(line 96,col 7)-(line 98,col 7)",
        "(line 99,col 7)-(line 102,col 7)",
        "(line 103,col 7)-(line 103,col 22)",
        "(line 104,col 7)-(line 104,col 28)"
      ]
    }
  ]
}