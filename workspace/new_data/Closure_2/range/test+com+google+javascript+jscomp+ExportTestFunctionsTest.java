{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ExportTestFunctionsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExportTestFunctionsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 22,
      "end_line": 141,
      "comment": "\n * Tests for ExportTestFunctions.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 24,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEST_FUNCTIONS_WITH_NAMES"
      ],
      "begin_line": 28,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.ExportTestFunctionsTest()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.setUp()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.getNumRepetitions()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.testFunctionsAreExported()",
      "begin_line": 55,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 62,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.testBasicTestFunctionsAreExported()",
      "begin_line": 66,
      "end_line": 82,
      "comment": " Helper functions",
      "child_ranges": [
        "(line 67,col 5)-(line 68,col 48)",
        "(line 69,col 5)-(line 70,col 66)",
        "(line 71,col 5)-(line 72,col 78)",
        "(line 73,col 5)-(line 74,col 75)",
        "(line 75,col 5)-(line 77,col 26)",
        "(line 78,col 5)-(line 80,col 57)",
        "(line 81,col 5)-(line 81,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.testFunctionExpressionsAreExported()",
      "begin_line": 93,
      "end_line": 111,
      "comment": "\n   * Make sure this works for global functions declared as function expressions:\n   * \u003cpre\u003e\n   * var testFunctionName \u003d function() {\n   *   // Implementation\n   * };\n   * \u003c/pre\u003e\n   * This format should be supported in addition to function statements.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 95,col 61)",
        "(line 96,col 5)-(line 98,col 47)",
        "(line 99,col 5)-(line 101,col 55)",
        "(line 102,col 5)-(line 104,col 53)",
        "(line 105,col 5)-(line 107,col 62)",
        "(line 108,col 5)-(line 110,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ExportTestFunctionsTest.testFunctionAssignmentsAreExported()",
      "begin_line": 113,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 115,col 57)",
        "(line 117,col 5)-(line 120,col 40)",
        "(line 122,col 5)-(line 125,col 38)",
        "(line 127,col 5)-(line 132,col 38)",
        "(line 134,col 5)-(line 139,col 42)"
      ]
    }
  ]
}