{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/InlineSimpleMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineSimpleMethodsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 19,
      "end_line": 304,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.InlineSimpleMethodsTest()",
      "begin_line": 21,
      "end_line": 23,
      "comment": "",
      "child_ranges": [
        "(line 22,col 5)-(line 22,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.setUp()",
      "begin_line": 25,
      "end_line": 29,
      "comment": "",
      "child_ranges": [
        "(line 27,col 5)-(line 27,col 18)",
        "(line 28,col 5)-(line 28,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 31,
      "end_line": 34,
      "comment": "",
      "child_ranges": [
        "(line 33,col 5)-(line 33,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testWithPrefix(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n   * Helper for tests that expects definitions to remain unchanged, such\n   * that {@code definitions+js} is converted to {@code definitions+expected}.\n   ",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSimpleInline1()",
      "begin_line": 44,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 45,col 5)-(line 48,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSimpleInline2()",
      "begin_line": 51,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 55,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSimpleGetterInline1()",
      "begin_line": 58,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 62,col 49)",
        "(line 65,col 5)-(line 67,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSimpleSetterInline1()",
      "begin_line": 70,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 74,col 49)",
        "(line 75,col 5)-(line 77,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSelfInline()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 81,col 5)-(line 84,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testCallWithArgs()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 91,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testCallWithConstArgs()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNestedProperties()",
      "begin_line": 101,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSkipComplexMethods()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 113,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSkipConflictingMethods()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSameNamesDifferentDefinitions()",
      "begin_line": 124,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testSameNamesSameDefinitions()",
      "begin_line": 139,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testConfusingNames()",
      "begin_line": 154,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 158,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testConstantInline()",
      "begin_line": 161,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 165,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testConstantArrayInline()",
      "begin_line": 168,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 172,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testConstantInlineWithSideEffects()",
      "begin_line": 175,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 179,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testEmptyMethodInline()",
      "begin_line": 182,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 186,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testEmptyMethodInlineWithSideEffects()",
      "begin_line": 189,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 193,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testEmptyMethodInlineInAssign1()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 200,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testEmptyMethodInlineInAssign2()",
      "begin_line": 203,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 207,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNormalMethod()",
      "begin_line": 210,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 211,col 5)-(line 214,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNoInlineOfExternMethods1()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNoInlineOfExternMethods2()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 5)-(line 224,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNoInlineOfExternMethods3()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNoInlineOfDangerousProperty()",
      "begin_line": 233,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 236,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testNoWarn()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "   var_args must be last",
      "child_ranges": [
        "(line 243,col 5)-(line 245,col 33)",
        "(line 247,col 5)-(line 249,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testObjectLit()",
      "begin_line": 252,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testObjectLit2()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testObjectLitExtern()",
      "begin_line": 263,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 58)",
        "(line 265,col 5)-(line 265,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testExternFunction()",
      "begin_line": 268,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 51)",
        "(line 270,col 5)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testIssue2508576_1()",
      "begin_line": 275,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 44)",
        "(line 278,col 5)-(line 278,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testIssue2508576_2()",
      "begin_line": 281,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testIssue2508576_3()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testAnonymousGet()",
      "begin_line": 291,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 66)",
        "(line 294,col 5)-(line 294,col 47)",
        "(line 295,col 5)-(line 295,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineSimpleMethodsTest.testAnonymousSet()",
      "begin_line": 298,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 67)",
        "(line 301,col 5)-(line 301,col 48)",
        "(line 302,col 5)-(line 302,col 41)"
      ]
    }
  ]
}