{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeIntegrationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeIntegrationTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 22,
      "end_line": 393,
      "comment": "\n * Tests for the interaction between multiple peephole passes.\n "
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.PeepholeIntegrationTest(boolean)",
      "begin_line": 27,
      "end_line": 29,
      "comment": " TODO(user): Remove this when we no longer need to do string comparison.",
      "child_ranges": [
        "(line 28,col 5)-(line 28,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.PeepholeIntegrationTest()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.setUp()",
      "begin_line": 35,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 18)",
        "(line 38,col 5)-(line 38,col 22)",
        "(line 39,col 5)-(line 39,col 32)",
        "(line 43,col 5)-(line 43,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 46,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 54,col 8)",
        "(line 56,col 5)-(line 56,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.getNumRepetitions()",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.foldSame(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 75,
      "end_line": 81,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 72)",
        "(line 78,col 5)-(line 78,col 30)",
        "(line 80,col 5)-(line 80,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testTrueFalse()",
      "begin_line": 83,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 17)",
        "(line 85,col 5)-(line 85,col 25)",
        "(line 86,col 5)-(line 86,col 26)",
        "(line 87,col 5)-(line 87,col 32)",
        "(line 88,col 5)-(line 88,col 31)",
        "(line 89,col 5)-(line 89,col 16)",
        "(line 90,col 5)-(line 90,col 31)",
        "(line 91,col 5)-(line 91,col 32)",
        "(line 92,col 5)-(line 92,col 23)",
        "(line 93,col 5)-(line 93,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldOneChildBlocksIntegration()",
      "begin_line": 97,
      "end_line": 133,
      "comment": " Check that removing blocks with 1 child works ",
      "child_ranges": [
        "(line 98,col 6)-(line 99,col 33)",
        "(line 101,col 6)-(line 102,col 28)",
        "(line 104,col 6)-(line 105,col 62)",
        "(line 108,col 6)-(line 109,col 32)",
        "(line 111,col 6)-(line 112,col 32)",
        "(line 115,col 6)-(line 115,col 30)",
        "(line 117,col 6)-(line 117,col 46)",
        "(line 118,col 6)-(line 118,col 25)",
        "(line 119,col 6)-(line 119,col 74)",
        "(line 121,col 6)-(line 122,col 27)",
        "(line 123,col 6)-(line 124,col 35)",
        "(line 125,col 6)-(line 126,col 32)",
        "(line 127,col 6)-(line 128,col 30)",
        "(line 131,col 6)-(line 131,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldOneChildBlocksStringCompare()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 138,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testNecessaryDanglingElse()",
      "begin_line": 142,
      "end_line": 148,
      "comment": " Test a particularly hairy edge case. ",
      "child_ranges": [
        "(line 146,col 5)-(line 147,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldReturnsIntegration()",
      "begin_line": 151,
      "end_line": 155,
      "comment": " Try to minimize returns ",
      "child_ranges": [
        "(line 153,col 5)-(line 154,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1059649()",
      "begin_line": 157,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 59)",
        "(line 162,col 5)-(line 162,col 53)",
        "(line 163,col 5)-(line 163,col 65)",
        "(line 164,col 5)-(line 165,col 49)",
        "(line 166,col 5)-(line 167,col 43)",
        "(line 168,col 5)-(line 168,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testHookIfIntegration()",
      "begin_line": 171,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 173,col 23)",
        "(line 175,col 5)-(line 175,col 35)",
        "(line 176,col 5)-(line 176,col 36)",
        "(line 177,col 5)-(line 177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testRemoveDuplicateStatementsIntegration()",
      "begin_line": 180,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 184,col 40)",
        "(line 186,col 5)-(line 189,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldLogicalOpIntegration()",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 193,col 40)",
        "(line 194,col 5)-(line 194,col 35)",
        "(line 195,col 5)-(line 195,col 34)",
        "(line 196,col 5)-(line 196,col 41)",
        "(line 197,col 5)-(line 197,col 38)",
        "(line 199,col 5)-(line 199,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldBitwiseOpStringCompareIntegration()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 203,col 5)-(line 203,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testVarLiftingIntegration()",
      "begin_line": 206,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 42)",
        "(line 208,col 5)-(line 208,col 49)",
        "(line 209,col 5)-(line 209,col 41)",
        "(line 210,col 5)-(line 210,col 42)",
        "(line 211,col 5)-(line 211,col 46)",
        "(line 212,col 5)-(line 212,col 45)",
        "(line 213,col 5)-(line 213,col 55)",
        "(line 214,col 5)-(line 214,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1438784()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 218,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessWhileIntegration()",
      "begin_line": 221,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 39)",
        "(line 223,col 5)-(line 223,col 51)",
        "(line 224,col 5)-(line 224,col 51)",
        "(line 227,col 5)-(line 227,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessForIntegration()",
      "begin_line": 230,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 39)",
        "(line 232,col 5)-(line 232,col 40)",
        "(line 233,col 5)-(line 233,col 43)",
        "(line 234,col 5)-(line 234,col 44)",
        "(line 235,col 5)-(line 235,col 50)",
        "(line 238,col 5)-(line 238,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessDoIntegration()",
      "begin_line": 241,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 48)",
        "(line 243,col 5)-(line 243,col 49)",
        "(line 244,col 5)-(line 244,col 52)",
        "(line 245,col 5)-(line 245,col 67)",
        "(line 248,col 5)-(line 248,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeWhileConstantConditionIntegration()",
      "begin_line": 251,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 50)",
        "(line 253,col 5)-(line 253,col 47)",
        "(line 254,col 5)-(line 254,col 52)",
        "(line 255,col 5)-(line 255,col 50)",
        "(line 256,col 5)-(line 256,col 46)",
        "(line 257,col 5)-(line 257,col 46)",
        "(line 258,col 5)-(line 258,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeExpr()",
      "begin_line": 261,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 262,col 23)",
        "(line 264,col 5)-(line 264,col 25)",
        "(line 265,col 5)-(line 265,col 38)",
        "(line 266,col 5)-(line 266,col 35)",
        "(line 269,col 5)-(line 269,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1509085()",
      "begin_line": 272,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 273,col 5)-(line 278,col 6)",
        "(line 280,col 5)-(line 280,col 58)",
        "(line 281,col 5)-(line 281,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.Anonymous-343185aa-614b-4df8-b1ad-7a215056b7bc.getNumRepetitions()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBugIssue3()",
      "begin_line": 284,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 288,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBugIssue43()",
      "begin_line": 291,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 292,col 5)-(line 294,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldNegativeBug()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testNoNormalizeLabeledExpr()",
      "begin_line": 301,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 26)",
        "(line 303,col 5)-(line 303,col 36)",
        "(line 304,col 5)-(line 304,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit1()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit2()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit3()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit4()",
      "begin_line": 319,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 44)",
        "(line 321,col 5)-(line 321,col 42)",
        "(line 322,col 5)-(line 322,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeExprCondition()",
      "begin_line": 325,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 38)",
        "(line 327,col 5)-(line 327,col 42)",
        "(line 328,col 5)-(line 328,col 43)",
        "(line 329,col 5)-(line 329,col 36)",
        "(line 330,col 5)-(line 330,col 46)",
        "(line 331,col 5)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testTrueFalseFolding()",
      "begin_line": 334,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 16)",
        "(line 336,col 5)-(line 336,col 31)",
        "(line 337,col 5)-(line 337,col 32)",
        "(line 338,col 5)-(line 338,col 29)",
        "(line 339,col 5)-(line 339,col 37)",
        "(line 340,col 5)-(line 340,col 40)",
        "(line 341,col 5)-(line 341,col 28)",
        "(line 342,col 5)-(line 342,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testCommaSplitingConstantCondition()",
      "begin_line": 345,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 17)",
        "(line 347,col 5)-(line 347,col 48)",
        "(line 348,col 5)-(line 348,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testAvoidCommaSplitting()",
      "begin_line": 351,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 17)",
        "(line 353,col 5)-(line 353,col 39)",
        "(line 354,col 5)-(line 354,col 16)",
        "(line 355,col 5)-(line 355,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testObjectLiteral()",
      "begin_line": 358,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 21)",
        "(line 360,col 5)-(line 360,col 24)",
        "(line 361,col 5)-(line 361,col 33)",
        "(line 362,col 5)-(line 362,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testArrayLiteral()",
      "begin_line": 365,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 21)",
        "(line 367,col 5)-(line 367,col 22)",
        "(line 368,col 5)-(line 368,col 22)",
        "(line 369,col 5)-(line 369,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldIfs1()",
      "begin_line": 372,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 374,col 47)",
        "(line 375,col 5)-(line 376,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldIfs2()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 380,col 5)-(line 381,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldHook2()",
      "begin_line": 384,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 385,col 5)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.disable_testFoldHook1()",
      "begin_line": 389,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 390,col 5)-(line 391,col 37)"
      ]
    }
  ]
}