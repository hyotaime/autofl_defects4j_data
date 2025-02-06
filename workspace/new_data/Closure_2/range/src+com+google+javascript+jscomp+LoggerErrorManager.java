{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/LoggerErrorManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LoggerErrorManager",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.BasicErrorManager"
      ],
      "begin_line": 30,
      "end_line": 75,
      "comment": "\n * An error manager that logs errors and warnings using a logger in addition to\n * collecting them in memory. Errors are logged at the SEVERE level and warnings\n * are logged at the WARNING level.\n *\n "
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
        "logger"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.LoggerErrorManager(com.google.javascript.jscomp.MessageFormatter, java.util.logging.Logger)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n   * Creates an instance.\n   ",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 31)",
        "(line 39,col 5)-(line 39,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.LoggerErrorManager(java.util.logging.Logger)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n   * Creates an instance with a source-less error formatter.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.LoggerErrorManager.println(com.google.javascript.jscomp.CheckLevel, com.google.javascript.jscomp.JSError)",
      "begin_line": 49,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 58,col 5)"
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