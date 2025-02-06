{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/CodeChangeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CodeChangeHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 61,
      "comment": "\n * A simple listener for code change events.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeChangeHandler.reportChange()",
      "begin_line": 29,
      "end_line": 29,
      "comment": " Report a change to the AST. ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "RecentChange",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeChangeHandler"
      ],
      "begin_line": 35,
      "end_line": 50,
      "comment": "\n   * A trivial change handler that just records whether the code\n   * has changed since the last reset.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "hasChanged"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeChangeHandler.RecentChange.reportChange()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 7)-(line 40,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeChangeHandler.RecentChange.hasCodeChanged()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeChangeHandler.RecentChange.reset()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 7)-(line 48,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ForbiddenChange",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CodeChangeHandler"
      ],
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n   * A change handler that throws an exception if any changes are made.\n   "
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange.reportChange()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 64)"
      ]
    }
  ]
}