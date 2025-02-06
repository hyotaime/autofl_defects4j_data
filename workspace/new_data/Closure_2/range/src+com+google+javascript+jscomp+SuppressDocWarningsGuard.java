{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/SuppressDocWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SuppressDocWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 30,
      "end_line": 101,
      "comment": "\n * Filters warnings based on in-code {@code @suppress} annotations.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suppressors"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": " Warnings guards for each suppressible warnings group, indexed by name. "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.SuppressDocWarningsGuard.SuppressDocWarningsGuard(java.util.Map\u003cjava.lang.String, com.google.javascript.jscomp.DiagnosticGroup\u003e)",
      "begin_line": 40,
      "end_line": 49,
      "comment": "\n   * The suppressible groups, indexed by name.\n   ",
      "child_ranges": [
        "(line 41,col 5)-(line 48,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SuppressDocWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 51,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 27)",
        "(line 54,col 5)-(line 91,col 5)",
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.SuppressDocWarningsGuard.getPriority()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 53)"
      ]
    }
  ]
}