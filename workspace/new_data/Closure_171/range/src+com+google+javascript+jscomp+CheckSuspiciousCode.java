{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/CheckSuspiciousCode.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CheckSuspiciousCode",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback"
      ],
      "begin_line": 37,
      "end_line": 108,
      "comment": "\n * Checks for common errors, such as misplaced semicolons:\n * \u003cpre\u003e\n * if (x); act_now();\n * \u003c/pre\u003e\n *  or comparison against NaN:\n * \u003cpre\u003e\n * if (x \u003d\u003d\u003d NaN) act();\n * \u003c/pre\u003e\n * and generates warnings.\n *\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "SUSPICIOUS_SEMICOLON"
      ],
      "begin_line": 39,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SUSPICIOUS_COMPARISON_WITH_NAN"
      ],
      "begin_line": 43,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.CheckSuspiciousCode()",
      "begin_line": 48,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 32)",
        "(line 54,col 5)-(line 54,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.checkMissingSemicolon(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 57,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 58,col 5)-(line 72,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.reportIfWasEmpty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 46)",
        "(line 81,col 5)-(line 84,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.checkNaN(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 87,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 99,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CheckSuspiciousCode.reportIfNaN(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 106,col 5)"
      ]
    }
  ]
}