{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DiagnosticType.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagnosticType",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003ccom.google.javascript.jscomp.DiagnosticType\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 27,
      "end_line": 133,
      "comment": "\n * The type of a compile or analysis error.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n   * The error type. Used as the BugPattern and BugInstance types by\n   * BugBot\u0027s XML\n   "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The default way to format errors "
    },
    {
      "type": "field",
      "varNames": [
        "defaultLevel"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default level "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Reporting level, initially the defaultLevel but may be changed. "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.error(java.lang.String, java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.ERROR\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.warning(java.lang.String, java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.WARNING\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.disabled(java.lang.String, java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n   * Create a DiagnosticType at level CheckLevel.OFF\n   *\n   * @param name An identifier\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.make(java.lang.String, com.google.javascript.jscomp.CheckLevel, java.lang.String)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n   * Create a DiagnosticType at a given CheckLevel.\n   *\n   * @param name An identifier\n   * @param level Either CheckLevel.ERROR or CheckLevel.WARNING\n   * @param descriptionFormat A format string\n   * @return A new DiagnosticType\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 91,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticType.DiagnosticType(java.lang.String, com.google.javascript.jscomp.CheckLevel, java.text.MessageFormat)",
      "begin_line": 97,
      "end_line": 103,
      "comment": "\n   * Create a DiagnosticType. Private to force use of static factory methods.\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 19)",
        "(line 99,col 5)-(line 99,col 30)",
        "(line 100,col 5)-(line 100,col 25)",
        "(line 102,col 5)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.format(java.lang.Object...)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n   * Create a description from the MessageFormat and the arguments.\n   * Used by unit tests.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.equals(java.lang.Object)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 116,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.hashCode()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.compareTo(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 124,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 126,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticType.toString()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 43)"
      ]
    }
  ]
}