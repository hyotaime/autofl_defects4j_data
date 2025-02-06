{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/rhino/SimpleErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleErrorReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.rhino.ErrorReporter"
      ],
      "begin_line": 53,
      "end_line": 143,
      "comment": "\n * A simple {@link ErrorReporter} that collects warnings and errors and makes\n * them accessible via {@link #errors()} and {@link #warnings()}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "warnings"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errors"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 57,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.errors()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns the list of errors, or {@code null} if there were none.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.warnings()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Returns the list of warnings, or {@code null} if there were none.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.formatDetailedMessage(java.lang.String, java.lang.String, int)",
      "begin_line": 89,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 91,col 7)-(line 91,col 31)",
        "(line 92,col 7)-(line 94,col 7)",
        "(line 95,col 7)-(line 95,col 53)",
        "(line 96,col 7)-(line 96,col 23)",
        "(line 97,col 7)-(line 99,col 7)",
        "(line 100,col 7)-(line 103,col 7)",
        "(line 104,col 7)-(line 104,col 22)",
        "(line 105,col 7)-(line 105,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.getMessage0(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 7)-(line 109,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.getMessage1(java.lang.String, java.lang.Object)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 7)-(line 113,col 34)",
        "(line 114,col 7)-(line 114,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.rhino.SimpleErrorReporter.getMessage(java.lang.String, java.lang.Object[])",
      "begin_line": 117,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 118,col 7)-(line 119,col 66)",
        "(line 121,col 7)-(line 121,col 42)",
        "(line 124,col 7)-(line 124,col 76)",
        "(line 126,col 7)-(line 126,col 26)",
        "(line 127,col 7)-(line 132,col 7)",
        "(line 139,col 7)-(line 139,col 64)",
        "(line 140,col 7)-(line 140,col 41)"
      ]
    }
  ]
}