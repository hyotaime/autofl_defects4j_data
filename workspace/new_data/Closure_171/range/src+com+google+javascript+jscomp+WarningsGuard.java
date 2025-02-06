{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/WarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WarningsGuard",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 107,
      "comment": "\n * Class that allows to flexibly manage what to do with a reported\n * warning/error.\n *\n * Guard has several choices:\n *   - return OFF - suppress the warning/error\n *   - return WARNING\n *   - return ERROR report it with high severity\n *   - return null. Does not know what to do with it. Lets the other guard\n *       decide what to do with it.\n *\n * Although the interface is very simple, it allows you easily customize what\n * warnings you are interested in.\n *\n * For example there are could be several implementations:\n *   StrictGuard - {return ERROR}. All warnings should be treat as errors.\n *   SilentGuard - {if (WARNING) return OFF}. Suppress all warnings but still\n *     fail if JS has errors.\n *   WhitelistGuard (if !whitelistErrors.contains(error) return ERROR) return\n *     error if it does not present in the whitelist.\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.WarningsGuard.Priority.Priority(int)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WarningsGuard.Priority.getValue()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n   * Returns a new check level for a given error. OFF - suppress it, ERROR -\n   * report as error. null means that this guard does not know what to do\n   * with the error. Null is extremely helpful when you have a chain of\n   * guards. If current guard returns null, then the next in the chain should\n   * process it.\n   *\n   * @param error a reported error.\n   * @return what level given error should have.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WarningsGuard.getPriority()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n   * The priority in which warnings guards are applied. Lower means the\n   * guard will be applied sooner. Expressed on a scale of 1 to 100.\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WarningsGuard.disables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n   * Returns whether all warnings in the given diagnostic group will be\n   * filtered out. Used to determine which passes to skip.\n   *\n   * @param group A group of DiagnosticTypes.\n   * @return Whether all warnings of these types are disabled by this guard.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.WarningsGuard.enables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n   * Returns whether any of the warnings in the given diagnostic group will be\n   * upgraded to a warning or error.\n   *\n   * @param group A group of DiagnosticTypes.\n   * @return Whether any warnings of these types are enabled by this guard.\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 17)"
      ]
    }
  ]
}