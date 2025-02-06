{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/BasicErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.ErrorManager"
      ],
      "begin_line": 36,
      "end_line": 190,
      "comment": "\n * \u003cp\u003eA basic error manager that sorts all errors and warnings reported to it to\n * generate a sorted report when the {@link #generateReport()} method\n * is called.\u003c/p\u003e\n *\n * \u003cp\u003eThis error manager does not produce any output, but subclasses can\n * override the {@link #println(CheckLevel, JSError)} method to generate custom\n * output.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errorCount"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "warningCount"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "typedPercent"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 43,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 51,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.generateReport()",
      "begin_line": 54,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 58,col 5)",
        "(line 59,col 5)-(line 59,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Print a message with a trailing new line. This method is called by the\n   * {@link #generateReport()} method when generating messages.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.printSummary()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n   * Print the summary of the compilation - number of errors and warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getErrorCount()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getWarningCount()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getErrors()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getWarnings()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.setTypedPercent(double)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.getTypedPercent()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.toArray(com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 67)",
        "(line 105,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LeveledJSErrorComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel\u003e"
      ],
      "begin_line": 122,
      "end_line": 179,
      "comment": "\n   * \u003cp\u003eComparator of {@link JSError} with an associated {@link CheckLevel}.\n   * The ordering is the standard lexical ordering on the quintuple\n   * (file name, line number, {@link CheckLevel},\n   * character number, description).\u003c/p\u003e\n   *\n   * \u003cp\u003eNote: this comparator imposes orderings that are inconsistent with\n   * {@link JSError#equals(Object)}.\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "P1_LT_P2"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "P1_GT_P2"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator.compare(com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel, com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel)",
      "begin_line": 127,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 130,col 7)-(line 136,col 7)",
        "(line 139,col 7)-(line 141,col 7)",
        "(line 144,col 7)-(line 144,col 43)",
        "(line 145,col 7)-(line 145,col 43)",
        "(line 146,col 7)-(line 155,col 7)",
        "(line 157,col 7)-(line 157,col 40)",
        "(line 158,col 7)-(line 158,col 40)",
        "(line 159,col 7)-(line 165,col 7)",
        "(line 167,col 7)-(line 167,col 41)",
        "(line 168,col 7)-(line 168,col 41)",
        "(line 169,col 7)-(line 175,col 7)",
        "(line 177,col 7)-(line 177,col 66)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ErrorWithLevel",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 181,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "error"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel.ErrorWithLevel(com.google.javascript.jscomp.JSError, com.google.javascript.jscomp.CheckLevel)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 25)",
        "(line 187,col 7)-(line 187,col 25)"
      ]
    }
  ]
}