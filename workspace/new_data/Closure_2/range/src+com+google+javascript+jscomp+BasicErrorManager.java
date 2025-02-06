{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/BasicErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ErrorManager"
      ],
      "begin_line": 37,
      "end_line": 191,
      "comment": "\n * \u003cp\u003eA basic error manager that sorts all errors and warnings reported to it to\n * generate a sorted report when the {@link #generateReport()} method\n * is called.\u003c/p\u003e\n *\n * \u003cp\u003eThis error manager does not produce any output, but subclasses can\n * override the {@link #println(CheckLevel, JSError)} method to generate custom\n * output.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorCount"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningCount"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typedPercent"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 44,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 52,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.generateReport()",
      "begin_line": 55,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 59,col 5)",
        "(line 60,col 5)-(line 60,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n   * Print a message with a trailing new line. This method is called by the\n   * {@link #generateReport()} method when generating messages.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.printSummary()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n   * Print the summary of the compilation - number of errors and warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getErrorCount()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getWarningCount()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getErrors()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getWarnings()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.setTypedPercent(double)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getTypedPercent()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.toArray(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 104,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 67)",
        "(line 106,col 5)-(line 110,col 5)",
        "(line 111,col 5)-(line 111,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LeveledJSErrorComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel\u003e"
      ],
      "begin_line": 123,
      "end_line": 180,
      "comment": "\n   * \u003cp\u003eComparator of {@link JSError} with an associated {@link CheckLevel}.\n   * The ordering is the standard lexical ordering on the quintuple\n   * (file name, line number, {@link CheckLevel},\n   * character number, description).\u003c/p\u003e\n   *\n   * \u003cp\u003eNote: this comparator imposes orderings that are inconsistent with\n   * {@link JSError#equals(Object)}.\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "P1_LT_P2"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "P1_GT_P2"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.compare(com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel, com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel)",
      "begin_line": 128,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 131,col 7)-(line 137,col 7)",
        "(line 140,col 7)-(line 142,col 7)",
        "(line 145,col 7)-(line 145,col 43)",
        "(line 146,col 7)-(line 146,col 43)",
        "(line 147,col 7)-(line 156,col 7)",
        "(line 158,col 7)-(line 158,col 40)",
        "(line 159,col 7)-(line 159,col 40)",
        "(line 160,col 7)-(line 166,col 7)",
        "(line 168,col 7)-(line 168,col 41)",
        "(line 169,col 7)-(line 169,col 41)",
        "(line 170,col 7)-(line 176,col 7)",
        "(line 178,col 7)-(line 178,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ErrorWithLevel",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 182,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "error"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel.ErrorWithLevel(com.google.javascript.jscomp.JSError, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 187,col 7)-(line 187,col 25)",
        "(line 188,col 7)-(line 188,col 25)"
      ]
    }
  ]
}