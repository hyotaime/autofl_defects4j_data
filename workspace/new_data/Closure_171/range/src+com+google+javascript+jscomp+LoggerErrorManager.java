{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/LoggerErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoggerErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 28,
      "end_line": 75,
      "comment": "\n * An error manager that logs errors and warnings using a logger in addition to\n * collecting them in memory. Errors are logged at the SEVERE level and warnings\n * are logged at the WARNING level.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "formatter"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logger"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.LoggerErrorManager(com.google.javascript.jscomp.MessageFormatter, java.util.logging.Logger)",
      "begin_line": 35,
      "end_line": 38,
      "comment": "\n   * Creates an instance.\n   ",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 31)",
        "(line 37,col 5)-(line 37,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.LoggerErrorManager(java.util.logging.Logger)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n   * Creates an instance with a source-less error formatter.\n   ",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 47,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 58,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.printSummary()",
      "begin_line": 61,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 64,col 35)",
        "(line 65,col 5)-(line 73,col 5)"
      ]
    }
  ]
}