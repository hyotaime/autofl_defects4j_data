{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/DiagnosticType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagnosticType",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003ccom.google.javascript.jscomp.DiagnosticType\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 25,
      "end_line": 131,
      "comment": "\n * The type of a compile or analysis error.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n   * The error type. Used as the BugPattern and BugInstance types by\n   * BugBot\u0027s XML\n   "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The default way to format errors "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLevel"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default level "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Reporting level, initially the defaultLevel but may be changed. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.error(java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.ERROR\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.warning(java.lang.String, java.lang.String)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.WARNING\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.disabled(java.lang.String, java.lang.String)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.OFF\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.make(java.lang.String, com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n   * Create a DiagnosticType at a given CheckLevel.\n   *\n   * @param name An identifier\n   * @param level Either CheckLevel.ERROR or CheckLevel.WARNING\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 89,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticType.DiagnosticType(java.lang.String, com.google.javascript.jscomp.CheckLevel, java.text.MessageFormat)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\n   * Create a DiagnosticType. Private to force use of static factory methods.\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 19)",
        "(line 97,col 5)-(line 97,col 30)",
        "(line 98,col 5)-(line 98,col 25)",
        "(line 100,col 5)-(line 100,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.format(java.lang.Object...)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n   * Create a description from the MessageFormat and the arguments.\n   * Used by unit tests.\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.equals(java.lang.Object)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 114,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.hashCode()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.compareTo(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 122,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.toString()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 43)"
      ]
    }
  ]
}