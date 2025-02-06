{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/JSModuleTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JSModuleTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 149,
      "comment": "\n * Tests for {@link JSModule}\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "mod1"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mod2"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " depends on mod1"
    },
    {
      "type": "field",
      "varNames": [
        "mod3"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " depends on mod1"
    },
    {
      "type": "field",
      "varNames": [
        "mod4"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " depends on mod2, mod3"
    },
    {
      "type": "field",
      "varNames": [
        "mod5"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " depends on mod1"
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleTest.setUp()",
      "begin_line": 38,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 65)",
        "(line 42,col 5)-(line 42,col 32)",
        "(line 43,col 5)-(line 43,col 32)",
        "(line 45,col 5)-(line 45,col 32)",
        "(line 46,col 5)-(line 46,col 29)",
        "(line 47,col 5)-(line 47,col 32)",
        "(line 49,col 5)-(line 49,col 32)",
        "(line 50,col 5)-(line 50,col 29)",
        "(line 51,col 5)-(line 51,col 32)",
        "(line 53,col 5)-(line 53,col 32)",
        "(line 54,col 5)-(line 54,col 29)",
        "(line 55,col 5)-(line 55,col 29)",
        "(line 56,col 5)-(line 56,col 32)",
        "(line 58,col 5)-(line 58,col 32)",
        "(line 59,col 5)-(line 59,col 29)",
        "(line 60,col 5)-(line 60,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleTest.testDependencies()",
      "begin_line": 63,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 63)",
        "(line 65,col 5)-(line 65,col 67)",
        "(line 66,col 5)-(line 66,col 67)",
        "(line 67,col 5)-(line 67,col 79)",
        "(line 69,col 5)-(line 69,col 74)",
        "(line 70,col 5)-(line 70,col 80)",
        "(line 71,col 5)-(line 71,col 80)",
        "(line 72,col 5)-(line 73,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleTest.testSortInputs()",
      "begin_line": 76,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 79,col 52)",
        "(line 80,col 5)-(line 82,col 52)",
        "(line 83,col 5)-(line 85,col 52)",
        "(line 86,col 5)-(line 88,col 34)",
        "(line 91,col 5)-(line 93,col 34)",
        "(line 94,col 5)-(line 96,col 34)",
        "(line 98,col 5)-(line 100,col 38)",
        "(line 101,col 5)-(line 103,col 38)",
        "(line 104,col 5)-(line 106,col 38)",
        "(line 107,col 5)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleTest.assertSortedInputs(java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e, java.util.List\u003ccom.google.javascript.jscomp.CompilerInput\u003e)",
      "begin_line": 112,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 39)",
        "(line 116,col 5)-(line 119,col 5)",
        "(line 120,col 5)-(line 120,col 49)",
        "(line 121,col 5)-(line 121,col 44)",
        "(line 122,col 5)-(line 122,col 35)",
        "(line 124,col 5)-(line 124,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JSModuleTest.testSortJsModules()",
      "begin_line": 127,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 131,col 56)",
        "(line 132,col 5)-(line 134,col 56)",
        "(line 137,col 5)-(line 139,col 56)",
        "(line 140,col 5)-(line 142,col 56)",
        "(line 145,col 5)-(line 147,col 56)"
      ]
    }
  ]
}