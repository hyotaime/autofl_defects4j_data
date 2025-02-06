{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/AliasStringsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasStringsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 27,
      "end_line": 355,
      "comment": "\n * Tests for {@link AliasStrings}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ALL_STRINGS"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "strings"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "moduleGraph"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashReduction"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.AliasStringsTest()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.setUp()",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 45,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 48,col 78)",
        "(line 49,col 5)-(line 50,col 41)",
        "(line 51,col 5)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testAssignment()",
      "begin_line": 54,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 66)",
        "(line 58,col 5)-(line 58,col 30)",
        "(line 59,col 5)-(line 59,col 68)",
        "(line 62,col 5)-(line 62,col 30)",
        "(line 63,col 5)-(line 63,col 43)",
        "(line 65,col 5)-(line 67,col 56)",
        "(line 69,col 5)-(line 69,col 31)",
        "(line 70,col 5)-(line 70,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testSeveral()",
      "begin_line": 73,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 57)",
        "(line 76,col 5)-(line 83,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testSortedOutput()",
      "begin_line": 86,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 65)",
        "(line 88,col 5)-(line 95,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testObjectLiterals()",
      "begin_line": 98,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 50)",
        "(line 101,col 5)-(line 101,col 49)",
        "(line 104,col 5)-(line 104,col 53)",
        "(line 105,col 5)-(line 106,col 48)",
        "(line 108,col 5)-(line 110,col 76)",
        "(line 112,col 5)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testGetProp()",
      "begin_line": 117,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 45)",
        "(line 120,col 5)-(line 120,col 52)",
        "(line 122,col 5)-(line 123,col 66)",
        "(line 125,col 5)-(line 127,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testFunctionCalls()",
      "begin_line": 130,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 58)",
        "(line 134,col 5)-(line 134,col 26)",
        "(line 135,col 5)-(line 135,col 42)",
        "(line 137,col 5)-(line 139,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testRegularExpressions()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 36)",
        "(line 145,col 5)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testBlackList()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 151,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testLongStableAlias()",
      "begin_line": 154,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 26)",
        "(line 159,col 5)-(line 164,col 48)",
        "(line 168,col 5)-(line 173,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testLongStableAliasHashCollision()",
      "begin_line": 178,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 26)",
        "(line 180,col 5)-(line 180,col 25)",
        "(line 185,col 5)-(line 198,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testStringsThatAreGlobalVarValues()",
      "begin_line": 202,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 26)",
        "(line 205,col 5)-(line 205,col 43)",
        "(line 208,col 5)-(line 208,col 39)",
        "(line 211,col 5)-(line 211,col 41)",
        "(line 214,col 5)-(line 216,col 69)",
        "(line 219,col 5)-(line 219,col 40)",
        "(line 222,col 5)-(line 222,col 49)",
        "(line 226,col 5)-(line 228,col 44)",
        "(line 232,col 5)-(line 234,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testStringsInModules()",
      "begin_line": 238,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 26)",
        "(line 245,col 5)-(line 260,col 63)",
        "(line 262,col 5)-(line 262,col 45)",
        "(line 264,col 5)-(line 292,col 12)",
        "(line 293,col 5)-(line 293,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testStringsInModules2()",
      "begin_line": 296,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 26)",
        "(line 303,col 5)-(line 312,col 20)",
        "(line 314,col 5)-(line 314,col 45)",
        "(line 316,col 5)-(line 328,col 12)",
        "(line 329,col 5)-(line 329,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasStringsTest.testEmptyModules()",
      "begin_line": 333,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 341,col 42)",
        "(line 343,col 5)-(line 343,col 45)",
        "(line 344,col 5)-(line 351,col 42)",
        "(line 353,col 5)-(line 353,col 23)"
      ]
    }
  ]
}