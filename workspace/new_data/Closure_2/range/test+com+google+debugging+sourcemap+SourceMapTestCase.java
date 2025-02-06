{
  "filepath": "/tmp/Closure-2b/test/com/google/debugging/sourcemap/SourceMapTestCase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceMapTestCase",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 320,
      "comment": "\n * @author johnlenz@google.com (John Lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "validateColumns"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.SourceMapTestCase()",
      "begin_line": 44,
      "end_line": 45,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.disableColumnValidation()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "detailLevel"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "RunResult",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "generatedSource"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMap"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sourceMapFileContent"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "tokenName"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputName"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.Token.Token(java.lang.String, java.lang.String, com.google.debugging.sourcemap.FilePosition)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)",
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.setUp()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.checkSourceMap(java.lang.String, java.lang.String)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n   * Creates a source map for the given JS code and asserts it is\n   * equal to the expected golden map.\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.getSourceMap(com.google.debugging.sourcemap.SourceMapTestCase.RunResult)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 43)",
        "(line 90,col 5)-(line 90,col 46)",
        "(line 91,col 5)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.checkSourceMap(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 45)",
        "(line 97,col 5)-(line 97,col 59)",
        "(line 98,col 5)-(line 98,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.findTokens(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n   * Finds the all the __XX__ tokens in the given JavaScript\n   * string.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 56)",
        "(line 108,col 5)-(line 110,col 5)",
        "(line 112,col 5)-(line 112,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.findTokens(java.lang.String)",
      "begin_line": 119,
      "end_line": 125,
      "comment": "\n   * Finds the all the __XX__ tokens in the given JavaScript\n   * string.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 56)",
        "(line 122,col 5)-(line 122,col 32)",
        "(line 124,col 5)-(line 124,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.findTokens(java.util.Map\u003cjava.lang.String, com.google.debugging.sourcemap.SourceMapTestCase.Token\u003e, java.lang.String, java.lang.String)",
      "begin_line": 131,
      "end_line": 177,
      "comment": "\n   * Finds the all the __XX__ tokens in the given JavaScript\n   * string.\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 24)",
        "(line 135,col 5)-(line 135,col 27)",
        "(line 137,col 5)-(line 174,col 5)",
        "(line 176,col 5)-(line 176,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.getSourceMapFormat()",
      "begin_line": 179,
      "end_line": 179,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.getSourceMapConsumer()",
      "begin_line": 181,
      "end_line": 181,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.compileAndCheck(java.lang.String)",
      "begin_line": 183,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 184,col 34)",
        "(line 185,col 5)-(line 185,col 46)",
        "(line 186,col 5)-(line 186,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.check(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 189,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 71)",
        "(line 193,col 5)-(line 193,col 35)",
        "(line 194,col 5)-(line 194,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.check(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.check(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String, java.lang.String, com.google.debugging.sourcemap.SourceMapSupplier)",
      "begin_line": 203,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 208,col 5)-(line 208,col 67)",
        "(line 212,col 5)-(line 212,col 66)",
        "(line 218,col 5)-(line 218,col 61)",
        "(line 220,col 5)-(line 220,col 25)",
        "(line 221,col 5)-(line 225,col 5)",
        "(line 229,col 5)-(line 268,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.compile(java.lang.String, java.lang.String)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.getCompilerOptions()",
      "begin_line": 275,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 52)",
        "(line 277,col 5)-(line 277,col 60)",
        "(line 278,col 5)-(line 278,col 51)",
        "(line 279,col 5)-(line 279,col 47)",
        "(line 280,col 5)-(line 280,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.debugging.sourcemap.SourceMapTestCase.compile(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 283,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 39)",
        "(line 286,col 5)-(line 286,col 51)",
        "(line 289,col 5)-(line 289,col 27)",
        "(line 291,col 5)-(line 292,col 62)",
        "(line 294,col 5)-(line 298,col 5)",
        "(line 300,col 5)-(line 300,col 63)",
        "(line 302,col 5)-(line 302,col 53)",
        "(line 303,col 5)-(line 303,col 40)",
        "(line 305,col 5)-(line 305,col 43)",
        "(line 306,col 5)-(line 311,col 5)",
        "(line 313,col 5)-(line 313,col 35)",
        "(line 314,col 5)-(line 314,col 32)",
        "(line 315,col 5)-(line 315,col 36)",
        "(line 316,col 5)-(line 316,col 44)",
        "(line 317,col 5)-(line 317,col 14)"
      ]
    }
  ]
}