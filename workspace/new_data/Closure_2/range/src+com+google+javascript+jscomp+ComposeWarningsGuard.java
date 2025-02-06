{
  "filepath": "/tmp/Closure-2b/src/com/google/javascript/jscomp/ComposeWarningsGuard.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComposeWarningsGuard",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.WarningsGuard"
      ],
      "begin_line": 40,
      "end_line": 182,
      "comment": "\n * WarningsGuard that represents just a chain of other guards. For example we\n * could have following chain\n * 1) all warnings outside of /foo/ should be suppressed\n * 2) errors with key JSC_BAR should be marked as warning\n * 3) the rest should be reported as error\n *\n * This class is designed for such behavior.\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfAddition"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The order that the guards were added in."
    },
    {
      "type": "field",
      "varNames": [
        "numberOfAdds"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "guardComparator"
      ],
      "begin_line": 48,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "demoteErrors"
      ],
      "begin_line": 50,
      "end_line": 50,
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
      "begin_line": 52,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orderOfAddition"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.GuardComparator.GuardComparator(java.util.Map\u003ccom.google.javascript.jscomp.WarningsGuard, java.lang.Integer\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 7)-(line 58,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.GuardComparator.compare(com.google.javascript.jscomp.WarningsGuard, com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 61,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 63,col 7)-(line 63,col 59)",
        "(line 64,col 7)-(line 66,col 7)",
        "(line 70,col 7)-(line 71,col 44)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "guards"
      ],
      "begin_line": 76,
      "end_line": 77,
      "comment": " The order that the guards are applied in."
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.ComposeWarningsGuard(java.util.List\u003ccom.google.javascript.jscomp.WarningsGuard\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.ComposeWarningsGuard(com.google.javascript.jscomp.WarningsGuard...)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.addGuard(com.google.javascript.jscomp.WarningsGuard)",
      "begin_line": 87,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 101,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.addGuards(java.lang.Iterable\u003ccom.google.javascript.jscomp.WarningsGuard\u003e)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 107,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.level(com.google.javascript.jscomp.JSError)",
      "begin_line": 110,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 120,col 5)",
        "(line 121,col 5)-(line 121,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.disables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 124,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 139,col 5)",
        "(line 141,col 5)-(line 141,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.enables(com.google.javascript.jscomp.DiagnosticGroup)",
      "begin_line": 148,
      "end_line": 159,
      "comment": "\n   * Determines whether this guard will \"elevate\" the status of any disabled\n   * diagnostic type in the group to a warning or an error.\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 156,col 5)",
        "(line 158,col 5)-(line 158,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.getGuards()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.makeEmergencyFailSafeGuard()",
      "begin_line": 169,
      "end_line": 176,
      "comment": "\n   * Make a warnings guard that\u0027s the same as this one but with\n   * all escalating guards turned down.\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 64)",
        "(line 171,col 5)-(line 171,col 34)",
        "(line 172,col 5)-(line 174,col 5)",
        "(line 175,col 5)-(line 175,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ComposeWarningsGuard.toString()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 40)"
      ]
    }
  ]
}