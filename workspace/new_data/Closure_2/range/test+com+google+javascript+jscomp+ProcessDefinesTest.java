{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ProcessDefinesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ProcessDefinesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 31,
      "end_line": 341,
      "comment": "\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.ProcessDefinesTest()",
      "begin_line": 33,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 31)",
        "(line 38,col 5)-(line 38,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "overrides"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.setUp()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 18)",
        "(line 47,col 5)-(line 47,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.getNumRepetitions()",
      "begin_line": 55,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testWithPrefix(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n   * Helper for tests that expects definitions to remain unchanged, such\n   * that {@code definitions+js} is converted to {@code definitions+expected}.\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testBasicDefine1()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testBasicDefine2()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testBasicDefine3()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineBadType()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 84,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineWithBadValue1()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineWithBadValue2()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineWithDependentValue()",
      "begin_line": 97,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 100,col 41)",
        "(line 101,col 5)-(line 104,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineWithInvalidDependentValue()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverriding1()",
      "begin_line": 115,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 64)",
        "(line 117,col 5)-(line 117,col 66)",
        "(line 118,col 5)-(line 121,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverriding2()",
      "begin_line": 124,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 64)",
        "(line 126,col 5)-(line 126,col 59)",
        "(line 127,col 5)-(line 130,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverriding3()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 64)",
        "(line 135,col 5)-(line 137,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverridingString0()",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 143,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverridingString1()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 149,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverridingString2()",
      "begin_line": 152,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 64)",
        "(line 154,col 5)-(line 156,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverridingString3()",
      "begin_line": 159,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 64)",
        "(line 161,col 5)-(line 163,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testMisspelledOverride()",
      "begin_line": 166,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 167,col 59)",
        "(line 168,col 5)-(line 170,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testCompiledIsKnownDefine()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 52)",
        "(line 175,col 5)-(line 175,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testSimpleReassign1()",
      "begin_line": 178,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testSimpleReassign2()",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 184,col 5)-(line 185,col 28)",
        "(line 187,col 5)-(line 187,col 51)",
        "(line 188,col 5)-(line 188,col 42)",
        "(line 189,col 5)-(line 189,col 36)",
        "(line 190,col 5)-(line 190,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testSimpleReassign3()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDuplicateVar()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 200,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testAssignBeforeDeclaration1()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 204,col 5)-(line 205,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testAssignBeforeDeclaration2()",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 5)-(line 209,col 64)",
        "(line 210,col 5)-(line 213,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testEmptyDeclaration()",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 218,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testReassignAfterCall()",
      "begin_line": 221,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 223,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testReassignAfterRef()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 228,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testReassignWithExpr()",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 233,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testReassignAfterNonGlobalRef()",
      "begin_line": 236,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 240,col 59)",
        "(line 242,col 5)-(line 242,col 51)",
        "(line 243,col 5)-(line 243,col 42)",
        "(line 244,col 5)-(line 244,col 36)",
        "(line 245,col 5)-(line 245,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testReassignAfterRefInConditional()",
      "begin_line": 248,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 252,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testAssignInNonGlobalScope()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 257,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDeclareInNonGlobalScope()",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 262,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testDefineAssignmentInLoop()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 267,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testWithNoDefines()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine1()",
      "begin_line": 274,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 275,col 5)-(line 276,col 42)",
        "(line 278,col 5)-(line 278,col 53)",
        "(line 279,col 5)-(line 279,col 44)",
        "(line 280,col 5)-(line 280,col 38)",
        "(line 281,col 5)-(line 281,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine2a()",
      "begin_line": 284,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 47)",
        "(line 286,col 5)-(line 287,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine2b()",
      "begin_line": 290,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 47)",
        "(line 294,col 5)-(line 296,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine2c()",
      "begin_line": 299,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 47)",
        "(line 303,col 5)-(line 305,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine3()",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 47)",
        "(line 310,col 5)-(line 311,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testNamespacedDefine4()",
      "begin_line": 314,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 47)",
        "(line 316,col 5)-(line 317,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.testOverrideAfterAlias()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 323,col 59)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProcessDefinesWithInjectedNamespace",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass"
      ],
      "begin_line": 326,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.ProcessDefinesWithInjectedNamespace.ProcessDefinesWithInjectedNamespace(com.google.javascript.jscomp.Compiler)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 330,col 7)-(line 330,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ProcessDefinesTest.ProcessDefinesWithInjectedNamespace.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 333,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 52)",
        "(line 336,col 7)-(line 338,col 32)"
      ]
    }
  ]
}