{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ShadowVariables2Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShadowVariables2Test",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 295,
      "comment": "\n * Unit tests for {@link ShadowVariables2}.\n *\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "generatePseudoNames"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": " Use pseudo names to make test easier to read."
    },
    {
      "type": "field",
      "varNames": [
        "pass"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 29,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 31,col 7)-(line 33,col 61)",
        "(line 34,col 7)-(line 34,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.getNumRepetitions()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 5)-(line 39,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.setUp()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 18)",
        "(line 45,col 5)-(line 45,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.tearDown()",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 21)",
        "(line 51,col 5)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowSimple1()",
      "begin_line": 54,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 56,col 55)",
        "(line 58,col 5)-(line 58,col 31)",
        "(line 60,col 5)-(line 61,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowSimple2()",
      "begin_line": 65,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 67,col 59)",
        "(line 69,col 5)-(line 69,col 31)",
        "(line 71,col 5)-(line 72,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowMostUsedVar()",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\n   * If we have a choice, pick out the most used variable to shadow.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 31)",
        "(line 80,col 5)-(line 84,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testNoShadowReferencedVariables()",
      "begin_line": 87,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 31)",
        "(line 89,col 5)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testNoShadowGlobalVariables()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 31)",
        "(line 99,col 5)-(line 100,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowBleedInFunctionName()",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 31)",
        "(line 105,col 5)-(line 106,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testNoShadowLessPopularName()",
      "begin_line": 109,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 31)",
        "(line 116,col 5)-(line 124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowFunctionName()",
      "begin_line": 127,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 31)",
        "(line 129,col 5)-(line 132,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowLotsOfScopes1()",
      "begin_line": 135,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 31)",
        "(line 137,col 5)-(line 140,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowLotsOfScopes2()",
      "begin_line": 143,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 31)",
        "(line 146,col 5)-(line 149,col 63)",
        "(line 151,col 5)-(line 154,col 66)",
        "(line 156,col 5)-(line 159,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowLotsOfScopes3()",
      "begin_line": 162,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 31)",
        "(line 165,col 5)-(line 168,col 72)",
        "(line 169,col 5)-(line 172,col 72)",
        "(line 173,col 5)-(line 176,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowLotsOfScopes4()",
      "begin_line": 179,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 184,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowLotsOfScopes5()",
      "begin_line": 187,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 31)",
        "(line 189,col 5)-(line 196,col 59)",
        "(line 198,col 5)-(line 205,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowWithShadowAlready()",
      "begin_line": 208,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 212,col 74)",
        "(line 214,col 5)-(line 217,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testShadowBug1()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 31)",
        "(line 222,col 5)-(line 225,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testOptimal()",
      "begin_line": 228,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 231,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testSharingAcrossInnerScopes()",
      "begin_line": 234,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 235,col 5)-(line 236,col 76)",
        "(line 237,col 5)-(line 238,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testExportedLocal1()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 243,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testExportedLocal2()",
      "begin_line": 246,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 248,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testRenameMapHasNoDuplicates()",
      "begin_line": 251,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 253,col 55)",
        "(line 255,col 5)-(line 255,col 43)",
        "(line 256,col 5)-(line 261,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariables2Test.testBug4172539()",
      "begin_line": 264,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 31)",
        "(line 273,col 5)-(line 293,col 14)"
      ]
    }
  ]
}