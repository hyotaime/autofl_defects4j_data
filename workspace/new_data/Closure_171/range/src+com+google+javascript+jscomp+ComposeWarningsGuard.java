{
  "filepath": "/tmp/Closure-171b/src/com/google/javascript/jscomp/ComposeWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComposeWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 39,
      "end_line": 181,
      "comment": "\n * WarningsGuard that represents just a chain of other guards. For example we\n * could have following chain\n * 1) all warnings outside of /foo/ should be suppressed\n * 2) errors with key JSC_BAR should be marked as warning\n * 3) the rest should be reported as error\n *\n * This class is designed for such behavior.\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfAddition"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The order that the guards were added in."
    },
    {
      "type": "field",
      "varNames": [
        "numberOfAdds"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "guardComparator"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "demoteErrors"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "GuardComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003ccom.google.javascript.jscomp.WarningsGuard\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfAddition"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.GuardComparator.GuardComparator(java.util.Map\u003ccom.google.javascript.jscomp.WarningsGuard, java.lang.Integer\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 7)-(line 57,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.GuardComparator.compare(com.google.javascript.jscomp.WarningsGuard, com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 60,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 62,col 7)-(line 62,col 59)",
        "(line 63,col 7)-(line 65,col 7)",
        "(line 69,col 7)-(line 70,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "guards"
      ],
      "begin_line": 75,
      "end_line": 76,
      "comment": " The order that the guards are applied in."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.ComposeWarningsGuard(java.util.List\u003ccom.google.javascript.jscomp.WarningsGuard\u003e)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.ComposeWarningsGuard(com.google.javascript.jscomp.WarningsGuard...)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.addGuard(com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 86,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 100,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.addGuards(java.lang.Iterable\u003ccom.google.javascript.jscomp.WarningsGuard\u003e)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 106,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 109,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.disables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 123,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 138,col 5)",
        "(line 140,col 5)-(line 140,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.enables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 147,
      "end_line": 158,
      "comment": "\n   * Determines whether this guard will \"elevate\" the status of any disabled\n   * diagnostic type in the group to a warning or an error.\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 155,col 5)",
        "(line 157,col 5)-(line 157,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.getGuards()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.makeEmergencyFailSafeGuard()",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\n   * Make a warnings guard that\u0027s the same as this one but with\n   * all escalating guards turned down.\n   ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 64)",
        "(line 170,col 5)-(line 170,col 34)",
        "(line 171,col 5)-(line 173,col 5)",
        "(line 174,col 5)-(line 174,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.toString()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 40)"
      ]
    }
  ]
}