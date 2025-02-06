{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/InlineVariablesConstantsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineVariablesConstantsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 147,
      "comment": "\n * Ensures that the InlineVariables pass in constants-only mode\n * is functionally equivalent to the old InlineVariablesConstants pass.\n "
    },
    {
      "type": "field",
      "varNames": [
        "inlineAllStrings"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.InlineVariablesConstantsTest()",
      "begin_line": 28,
      "end_line": 30,
      "comment": "",
      "child_ranges": [
        "(line 29,col 5)-(line 29,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 32,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 35,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.tearDown()",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineVariablesConstants()",
      "begin_line": 43,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 47)",
        "(line 45,col 5)-(line 45,col 39)",
        "(line 46,col 5)-(line 46,col 44)",
        "(line 47,col 5)-(line 47,col 25)",
        "(line 48,col 5)-(line 48,col 30)",
        "(line 49,col 5)-(line 49,col 61)",
        "(line 50,col 5)-(line 50,col 56)",
        "(line 52,col 5)-(line 53,col 32)",
        "(line 56,col 5)-(line 56,col 28)",
        "(line 59,col 5)-(line 59,col 66)",
        "(line 61,col 5)-(line 62,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testNoInlineArraysOrRegexps()",
      "begin_line": 65,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 40)",
        "(line 67,col 5)-(line 67,col 52)",
        "(line 68,col 5)-(line 68,col 43)",
        "(line 69,col 5)-(line 69,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineVariablesConstantsJsDocStyle()",
      "begin_line": 72,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 60)",
        "(line 74,col 5)-(line 74,col 52)",
        "(line 75,col 5)-(line 75,col 57)",
        "(line 76,col 5)-(line 76,col 39)",
        "(line 77,col 5)-(line 77,col 44)",
        "(line 78,col 5)-(line 78,col 78)",
        "(line 79,col 5)-(line 80,col 41)",
        "(line 81,col 5)-(line 81,col 76)",
        "(line 84,col 5)-(line 84,col 79)",
        "(line 86,col 5)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineConditionallyDefinedConstant1()",
      "begin_line": 90,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 96,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineConditionallyDefinedConstant2()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineConditionallyDefinedConstant3()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 105,col 5)-(line 106,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineDefinedConstant()",
      "begin_line": 109,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 116,col 65)",
        "(line 118,col 5)-(line 124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testInlineVariablesConstantsWithInlineAllStringsOn()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 28)",
        "(line 129,col 5)-(line 130,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testNoInlineWithoutConstDeclaration()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesConstantsTest.testNoInlineAliases()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 61)",
        "(line 145,col 5)-(line 145,col 61)"
      ]
    }
  ]
}