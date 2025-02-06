{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/VariableReferenceCheckTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VariableReferenceCheckTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 217,
      "comment": "\n * Test that warnings are generated in appropriate cases and appropriate\n * cases only by VariableReferenceCheck\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "VARIABLE_RUN"
      ],
      "begin_line": 28,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "enableAmbiguousFunctionCheck"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.getOptions()",
      "begin_line": 33,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 35,col 5)-(line 35,col 49)",
        "(line 36,col 5)-(line 39,col 5)",
        "(line 40,col 5)-(line 40,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 43,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.setUp()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 18)",
        "(line 52,col 5)-(line 52,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectCode()",
      "begin_line": 55,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 80)",
        "(line 57,col 5)-(line 57,col 76)",
        "(line 58,col 5)-(line 58,col 48)",
        "(line 59,col 5)-(line 59,col 34)",
        "(line 60,col 5)-(line 60,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectShadowing()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectRedeclare()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectRecursion()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectCatch()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testRedeclare()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 62)",
        "(line 83,col 5)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testEarlyReference()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testCorrectEarlyReference()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 45)",
        "(line 92,col 5)-(line 92,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testUnreferencedBleedingFunction()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testReferencedBleedingFunction()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testDoubleDeclaration()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testDoubleDeclaration2()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testHoistedFunction1()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 40)",
        "(line 113,col 5)-(line 113,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testHoistedFunction2()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 40)",
        "(line 118,col 5)-(line 118,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 40)",
        "(line 123,col 5)-(line 123,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction2()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 40)",
        "(line 128,col 5)-(line 128,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction3()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 40)",
        "(line 133,col 5)-(line 133,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction4()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 40)",
        "(line 138,col 5)-(line 138,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction5()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 40)",
        "(line 143,col 5)-(line 143,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction6()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 40)",
        "(line 148,col 5)-(line 148,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedFunction7()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 40)",
        "(line 153,col 5)-(line 153,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedRecursiveFunction1()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 40)",
        "(line 158,col 5)-(line 158,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedRecursiveFunction2()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 40)",
        "(line 163,col 5)-(line 163,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNonHoistedRecursiveFunction3()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 40)",
        "(line 168,col 5)-(line 168,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNoWarnInExterns1()",
      "begin_line": 171,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 175,col 49)",
        "(line 176,col 5)-(line 176,col 21)",
        "(line 177,col 5)-(line 177,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.testNoWarnInExterns2()",
      "begin_line": 180,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 182,col 5)-(line 184,col 21)",
        "(line 185,col 5)-(line 185,col 21)",
        "(line 186,col 5)-(line 186,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.assertRedeclare(java.lang.String)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n   * Expects the JS to generate one bad-read error.\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.assertUndeclared(java.lang.String)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n   * Expects the JS to generate one bad-write warning.\n   ",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.assertAmbiguous(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n   * Expects the JS to generate one bad-write warning.\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.VariableReferenceCheckTest.assertNoWarning(java.lang.String)",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n   * Expects the JS to generate no errors or warnings.\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 17)"
      ]
    }
  ]
}