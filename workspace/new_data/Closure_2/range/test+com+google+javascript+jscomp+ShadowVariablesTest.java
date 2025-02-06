{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ShadowVariablesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShadowVariablesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 273,
      "comment": "\n * Unit tests for {@link ShadowVariables}.\n *\n *\n "
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
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 27,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 29,col 7)-(line 31,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.getNumRepetitions()",
      "begin_line": 34,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.setUp()",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 18)",
        "(line 42,col 5)-(line 42,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowSimple1()",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 47,col 55)",
        "(line 49,col 5)-(line 49,col 31)",
        "(line 51,col 5)-(line 52,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowSimple2()",
      "begin_line": 56,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 57,col 5)-(line 58,col 59)",
        "(line 60,col 5)-(line 60,col 31)",
        "(line 62,col 5)-(line 63,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowMostUsedVar()",
      "begin_line": 69,
      "end_line": 76,
      "comment": "\n   * If we have a choice, pick out the most used variable to shadow.\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 31)",
        "(line 71,col 5)-(line 75,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testNoShadowReferencedVariables()",
      "begin_line": 78,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 31)",
        "(line 80,col 5)-(line 85,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testNoShadowGlobalVariables()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 31)",
        "(line 90,col 5)-(line 91,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowBleedInFunctionName()",
      "begin_line": 94,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 31)",
        "(line 96,col 5)-(line 97,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testNoShadowLessPopularName()",
      "begin_line": 100,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 31)",
        "(line 107,col 5)-(line 115,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowFunctionName()",
      "begin_line": 118,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 31)",
        "(line 120,col 5)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowLotsOfScopes1()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 31)",
        "(line 128,col 5)-(line 131,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowLotsOfScopes2()",
      "begin_line": 134,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 31)",
        "(line 137,col 5)-(line 140,col 63)",
        "(line 142,col 5)-(line 145,col 66)",
        "(line 147,col 5)-(line 150,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowLotsOfScopes3()",
      "begin_line": 153,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 31)",
        "(line 156,col 5)-(line 159,col 72)",
        "(line 160,col 5)-(line 163,col 72)",
        "(line 164,col 5)-(line 167,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowLotsOfScopes4()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 175,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowLotsOfScopes5()",
      "begin_line": 178,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 31)",
        "(line 180,col 5)-(line 187,col 59)",
        "(line 189,col 5)-(line 196,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowWithShadowAlready()",
      "begin_line": 199,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 203,col 74)",
        "(line 205,col 5)-(line 208,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testShadowBug1()",
      "begin_line": 211,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 31)",
        "(line 213,col 5)-(line 216,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testOptimal()",
      "begin_line": 219,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 222,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testSharingAcrossInnerScopes()",
      "begin_line": 225,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 227,col 76)",
        "(line 228,col 5)-(line 229,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testExportedLocal1()",
      "begin_line": 232,
      "end_line": 235,
      "comment": "",
      "child_ranges": [
        "(line 233,col 5)-(line 234,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testExportedLocal2()",
      "begin_line": 237,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 239,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ShadowVariablesTest.testBug4172539()",
      "begin_line": 242,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 31)",
        "(line 251,col 5)-(line 271,col 14)"
      ]
    }
  ]
}