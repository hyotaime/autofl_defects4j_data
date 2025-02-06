{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/AliasKeywordsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AliasKeywordsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 23,
      "end_line": 187,
      "comment": "\n * Tests for {@link AliasKeywords}.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENOUGH_TO_ALIAS_LITERAL"
      ],
      "begin_line": 24,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOO_FEW_TO_ALIAS_LITERAL"
      ],
      "begin_line": 26,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ENOUGH_TO_ALIAS_THROW"
      ],
      "begin_line": 29,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOO_FEW_TO_ALIAS_THROW"
      ],
      "begin_line": 31,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.setUp()",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 36,col 5)-(line 36,col 39)",
        "(line 37,col 5)-(line 37,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.getNumRepetitions()",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.generateCode(java.lang.String, int, java.lang.String)",
      "begin_line": 57,
      "end_line": 66,
      "comment": "\n   * Generate code of the form \u0027if (\u003ckeyword\u003e);\u0027 repeated numReps\n   * times, with prepend prepended.\n   *\n   * For example, generateCode(\"true\", 2, \"var a\u003db;\") generates\n   * \u003ccode\u003evar a\u003db;if (true);if (true);\u003c/code\u003e\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 50)",
        "(line 60,col 5)-(line 64,col 5)",
        "(line 65,col 5)-(line 65,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.generateCode(java.lang.String, int)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.generatePreProcessThrowCode(int, java.lang.String)",
      "begin_line": 72,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 43)",
        "(line 75,col 5)-(line 79,col 5)",
        "(line 80,col 5)-(line 80,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.generatePostProcessThrowCode(int, java.lang.String, java.lang.String)",
      "begin_line": 83,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 43)",
        "(line 86,col 5)-(line 86,col 27)",
        "(line 87,col 5)-(line 87,col 41)",
        "(line 88,col 5)-(line 88,col 65)",
        "(line 89,col 5)-(line 89,col 20)",
        "(line 90,col 5)-(line 95,col 5)",
        "(line 96,col 5)-(line 96,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testDontAlias()",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n   * Don\u0027t generate aliases if the keyword is not referenced enough.\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 61)",
        "(line 104,col 5)-(line 104,col 62)",
        "(line 105,col 5)-(line 105,col 61)",
        "(line 106,col 5)-(line 106,col 63)",
        "(line 107,col 5)-(line 107,col 71)",
        "(line 110,col 5)-(line 110,col 62)",
        "(line 111,col 5)-(line 111,col 62)",
        "(line 112,col 5)-(line 112,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testAlias()",
      "begin_line": 119,
      "end_line": 138,
      "comment": "\n   * Generate aliases if the keyword is referenced \u003e\u003d ENOUGH_TO_ALIAS\n   * times.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 122,col 58)",
        "(line 124,col 5)-(line 126,col 60)",
        "(line 128,col 5)-(line 130,col 58)",
        "(line 132,col 5)-(line 134,col 59)",
        "(line 136,col 5)-(line 137,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testAliasTrueFalseNull()",
      "begin_line": 140,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 47)",
        "(line 142,col 5)-(line 142,col 65)",
        "(line 143,col 5)-(line 143,col 66)",
        "(line 144,col 5)-(line 144,col 65)",
        "(line 145,col 5)-(line 145,col 67)",
        "(line 147,col 5)-(line 147,col 49)",
        "(line 148,col 5)-(line 152,col 45)",
        "(line 153,col 5)-(line 154,col 73)",
        "(line 155,col 5)-(line 156,col 74)",
        "(line 157,col 5)-(line 158,col 73)",
        "(line 159,col 5)-(line 160,col 73)",
        "(line 162,col 5)-(line 162,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testAliasThrowKeywordLiteral()",
      "begin_line": 165,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 166,col 77)",
        "(line 167,col 5)-(line 169,col 36)",
        "(line 170,col 5)-(line 170,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testExistingAliasDefinitionFails()",
      "begin_line": 173,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 181,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.AliasKeywordsTest.testWithNoInputs()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 5)-(line 185,col 30)"
      ]
    }
  ]
}