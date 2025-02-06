{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/IntegrationTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntegrationTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 225,
      "comment": "\n * Framework for end-to-end test cases.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTERNS"
      ],
      "begin_line": 36,
      "end_line": 49,
      "comment": " Externs for the test "
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The most recently used compiler."
    },
    {
      "type": "field",
      "varNames": [
        "normalizeResults"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.setUp()",
      "begin_line": 58,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 30)",
        "(line 61,col 5)-(line 61,col 24)",
        "(line 62,col 5)-(line 62,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.testSame(com.google.javascript.jscomp.CompilerOptions, java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.testSame(com.google.javascript.jscomp.CompilerOptions, java.lang.String[])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String, java.lang.String)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String[], java.lang.String[])",
      "begin_line": 86,
      "end_line": 100,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 51)",
        "(line 89,col 5)-(line 92,col 72)",
        "(line 94,col 5)-(line 94,col 50)",
        "(line 95,col 5)-(line 95,col 67)",
        "(line 96,col 5)-(line 96,col 60)",
        "(line 97,col 5)-(line 99,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * there is an error or warning.\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 114,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 126,
      "end_line": 146,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * there is an error or warning.\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 51)",
        "(line 129,col 5)-(line 129,col 49)",
        "(line 130,col 5)-(line 131,col 72)",
        "(line 132,col 5)-(line 136,col 5)",
        "(line 138,col 5)-(line 145,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.test(com.google.javascript.jscomp.CompilerOptions, java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType[])",
      "begin_line": 152,
      "end_line": 165,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * there is an error or warning.\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 51)",
        "(line 155,col 5)-(line 155,col 63)",
        "(line 157,col 5)-(line 164,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.checkUnexpectedErrorsOrWarnings(com.google.javascript.jscomp.Compiler, int)",
      "begin_line": 167,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 77)",
        "(line 170,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.compile(com.google.javascript.jscomp.CompilerOptions, java.lang.String)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.compile(com.google.javascript.jscomp.CompilerOptions, java.lang.String[])",
      "begin_line": 187,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 54)",
        "(line 189,col 5)-(line 189,col 51)",
        "(line 190,col 5)-(line 192,col 5)",
        "(line 193,col 5)-(line 195,col 17)",
        "(line 196,col 5)-(line 196,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.parse(java.lang.String[], com.google.javascript.jscomp.CompilerOptions, boolean)",
      "begin_line": 199,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 201,col 5)-(line 201,col 39)",
        "(line 202,col 5)-(line 202,col 51)",
        "(line 203,col 5)-(line 205,col 5)",
        "(line 206,col 5)-(line 206,col 44)",
        "(line 207,col 5)-(line 207,col 49)",
        "(line 208,col 5)-(line 208,col 38)",
        "(line 209,col 5)-(line 209,col 49)",
        "(line 210,col 5)-(line 210,col 32)",
        "(line 211,col 5)-(line 211,col 39)",
        "(line 213,col 5)-(line 214,col 61)",
        "(line 216,col 5)-(line 218,col 5)",
        "(line 220,col 5)-(line 220,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.IntegrationTestCase.createCompilerOptions()",
      "begin_line": 224,
      "end_line": 224,
      "comment": " Creates a CompilerOptions object with google coding conventions. ",
      "child_ranges": []
    }
  ]
}