{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/DiagnosticGroup.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiagnosticGroup",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 136,
      "comment": "\n * Group a set of related diagnostic types together, so that they can\n * be toggled on and off as one unit.\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "types"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The set of types represented by this group, hashed by key."
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " A human-readable name for the group."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.DiagnosticGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticType...)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n   * Create a group that matches all errors of the given types.\n   ",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 21)",
        "(line 47,col 5)-(line 47,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.DiagnosticGroup(com.google.javascript.jscomp.DiagnosticType...)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n   * Create a group that matches all errors of the given types.\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.DiagnosticGroup(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n   * Create a diagnostic group with no name that only matches the given type.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 21)",
        "(line 62,col 5)-(line 62,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "singletons"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": " DiagnosticGroups with only a single DiagnosticType."
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.forType(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 70,
      "end_line": 75,
      "comment": " Create a diagnostic group that matches only the given type. ",
      "child_ranges": [
        "(line 71,col 5)-(line 73,col 5)",
        "(line 74,col 5)-(line 74,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.DiagnosticGroup(com.google.javascript.jscomp.DiagnosticGroup...)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n   * Create a composite group.\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.DiagnosticGroup(java.lang.String, com.google.javascript.jscomp.DiagnosticGroup...)",
      "begin_line": 87,
      "end_line": 96,
      "comment": "\n   * Create a composite group.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 48)",
        "(line 90,col 5)-(line 92,col 5)",
        "(line 94,col 5)-(line 94,col 21)",
        "(line 95,col 5)-(line 95,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.matches(com.google.javascript.jscomp.JSError)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n   * Returns whether the given error\u0027s type matches a type\n   * in this group.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.matches(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n   * Returns whether the given type matches a type in this group.\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.isSubGroup(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\n   * Returns whether all of the types in the given group are in this group.\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 121,col 5)",
        "(line 122,col 5)-(line 122,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.getTypes()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n   * Returns an iterable over all the types in this group.\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.DiagnosticGroup.toString()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 77)"
      ]
    }
  ]
}