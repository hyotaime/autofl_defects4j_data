{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/parsing/NullErrorReporter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NullErrorReporter",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 72,
      "comment": "\n * An error reporter which consumes all calls and performs no actions.\n *\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.NullErrorReporter()",
      "begin_line": 26,
      "end_line": 27,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.error(java.lang.String, java.lang.String, int, int)",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.warning(java.lang.String, java.lang.String, int, int)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.forOldRhino()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino()",
      "begin_line": 41,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NewRhinoNullReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.parsing.NullErrorReporter",
        "com.google.javascript.rhino.head.ErrorReporter"
      ],
      "begin_line": 46,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.NewRhinoNullReporter.runtimeError(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 48,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 7)-(line 53,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.NewRhinoNullReporter.error(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 7)-(line 59,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.parsing.NullErrorReporter.NewRhinoNullReporter.warning(java.lang.String, java.lang.String, int, java.lang.String, int)",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 7)-(line 65,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OldRhinoNullReporter",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.parsing.NullErrorReporter",
        "com.google.javascript.rhino.ErrorReporter"
      ],
      "begin_line": 69,
      "end_line": 71,
      "comment": ""
    }
  ]
}