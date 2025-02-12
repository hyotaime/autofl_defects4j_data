{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ErrorManager",
      "is_interface": true,
      "parent_types": [
        "com.google.javascript.jscomp.ErrorHandler"
      ],
      "begin_line": 26,
      "end_line": 72,
      "comment": "\n * The error manager is in charge of storing, organizing and displaying\n * errors and warnings generated by the compiler.\n *\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.report(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n   * Reports an error. The errors will be displayed by the\n   * {@link #generateReport()} at the discretion of the implementation.\n   *\n   * @param level the reporting level\n   * @param error the error to report\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.generateReport()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n   * Writes a report to an implementation-specific medium. The compiler calls\n   * this method after any and all {@link #report} calls.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.getErrorCount()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n   * Gets the number of reported errors.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.getWarningCount()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n   * Gets the number of reported warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.getErrors()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n   * Gets all the errors.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.getWarnings()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n   * Gets all the warnings.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.setTypedPercent(double)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n   * Sets the percentage of typed expressions.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ErrorManager.getTypedPercent()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n   * Gets the percentage of typed expressions.\n   ",
      "child_ranges": []
    }
  ]
}