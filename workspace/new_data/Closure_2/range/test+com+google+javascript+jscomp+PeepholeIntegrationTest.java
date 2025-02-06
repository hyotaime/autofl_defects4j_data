{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/PeepholeIntegrationTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeIntegrationTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 22,
      "end_line": 392,
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
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 53,col 8)",
        "(line 55,col 5)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.getNumRepetitions()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.foldSame(java.lang.String)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 74,
      "end_line": 80,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 72)",
        "(line 77,col 5)-(line 77,col 30)",
        "(line 79,col 5)-(line 79,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testTrueFalse()",
      "begin_line": 82,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 17)",
        "(line 84,col 5)-(line 84,col 25)",
        "(line 85,col 5)-(line 85,col 26)",
        "(line 86,col 5)-(line 86,col 32)",
        "(line 87,col 5)-(line 87,col 31)",
        "(line 88,col 5)-(line 88,col 16)",
        "(line 89,col 5)-(line 89,col 31)",
        "(line 90,col 5)-(line 90,col 32)",
        "(line 91,col 5)-(line 91,col 23)",
        "(line 92,col 5)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldOneChildBlocksIntegration()",
      "begin_line": 96,
      "end_line": 132,
      "comment": " Check that removing blocks with 1 child works ",
      "child_ranges": [
        "(line 97,col 6)-(line 98,col 33)",
        "(line 100,col 6)-(line 101,col 28)",
        "(line 103,col 6)-(line 104,col 62)",
        "(line 107,col 6)-(line 108,col 32)",
        "(line 110,col 6)-(line 111,col 32)",
        "(line 114,col 6)-(line 114,col 30)",
        "(line 116,col 6)-(line 116,col 46)",
        "(line 117,col 6)-(line 117,col 25)",
        "(line 118,col 6)-(line 118,col 74)",
        "(line 120,col 6)-(line 121,col 27)",
        "(line 122,col 6)-(line 123,col 35)",
        "(line 124,col 6)-(line 125,col 32)",
        "(line 126,col 6)-(line 127,col 30)",
        "(line 130,col 6)-(line 130,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldOneChildBlocksStringCompare()",
      "begin_line": 134,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 5)-(line 137,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testNecessaryDanglingElse()",
      "begin_line": 141,
      "end_line": 147,
      "comment": " Test a particularly hairy edge case. ",
      "child_ranges": [
        "(line 145,col 5)-(line 146,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldReturnsIntegration()",
      "begin_line": 150,
      "end_line": 154,
      "comment": " Try to minimize returns ",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1059649()",
      "begin_line": 156,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 59)",
        "(line 161,col 5)-(line 161,col 53)",
        "(line 162,col 5)-(line 162,col 65)",
        "(line 163,col 5)-(line 164,col 49)",
        "(line 165,col 5)-(line 166,col 43)",
        "(line 167,col 5)-(line 167,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testHookIfIntegration()",
      "begin_line": 170,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 172,col 23)",
        "(line 174,col 5)-(line 174,col 35)",
        "(line 175,col 5)-(line 175,col 39)",
        "(line 176,col 5)-(line 176,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testRemoveDuplicateStatementsIntegration()",
      "begin_line": 179,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 183,col 40)",
        "(line 185,col 5)-(line 188,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldLogicalOpIntegration()",
      "begin_line": 191,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 192,col 40)",
        "(line 193,col 5)-(line 193,col 35)",
        "(line 194,col 5)-(line 194,col 34)",
        "(line 195,col 5)-(line 195,col 41)",
        "(line 196,col 5)-(line 196,col 38)",
        "(line 198,col 5)-(line 198,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldBitwiseOpStringCompareIntegration()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testVarLiftingIntegration()",
      "begin_line": 205,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 42)",
        "(line 207,col 5)-(line 207,col 49)",
        "(line 208,col 5)-(line 208,col 41)",
        "(line 209,col 5)-(line 209,col 42)",
        "(line 210,col 5)-(line 210,col 46)",
        "(line 211,col 5)-(line 211,col 45)",
        "(line 212,col 5)-(line 212,col 55)",
        "(line 213,col 5)-(line 213,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1438784()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 217,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessWhileIntegration()",
      "begin_line": 220,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 221,col 5)-(line 221,col 39)",
        "(line 222,col 5)-(line 222,col 51)",
        "(line 223,col 5)-(line 223,col 51)",
        "(line 226,col 5)-(line 226,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessForIntegration()",
      "begin_line": 229,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 39)",
        "(line 231,col 5)-(line 231,col 40)",
        "(line 232,col 5)-(line 232,col 43)",
        "(line 233,col 5)-(line 233,col 44)",
        "(line 234,col 5)-(line 234,col 50)",
        "(line 237,col 5)-(line 237,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldUselessDoIntegration()",
      "begin_line": 240,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 48)",
        "(line 242,col 5)-(line 242,col 49)",
        "(line 243,col 5)-(line 243,col 52)",
        "(line 244,col 5)-(line 244,col 67)",
        "(line 247,col 5)-(line 247,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeWhileConstantConditionIntegration()",
      "begin_line": 250,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 50)",
        "(line 252,col 5)-(line 252,col 47)",
        "(line 253,col 5)-(line 253,col 52)",
        "(line 254,col 5)-(line 254,col 50)",
        "(line 255,col 5)-(line 255,col 46)",
        "(line 256,col 5)-(line 256,col 46)",
        "(line 257,col 5)-(line 257,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeExpr()",
      "begin_line": 260,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 23)",
        "(line 263,col 5)-(line 263,col 25)",
        "(line 264,col 5)-(line 264,col 38)",
        "(line 265,col 5)-(line 265,col 35)",
        "(line 268,col 5)-(line 268,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBug1509085()",
      "begin_line": 271,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 277,col 6)",
        "(line 279,col 5)-(line 279,col 58)",
        "(line 280,col 5)-(line 280,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.Anonymous-be7ffaf9-20ae-4026-aaa7-ee342d9ef765.getNumRepetitions()",
      "begin_line": 273,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBugIssue3()",
      "begin_line": 283,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 284,col 5)-(line 287,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testBugIssue43()",
      "begin_line": 290,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 291,col 5)-(line 293,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldNegativeBug()",
      "begin_line": 296,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testNoNormalizeLabeledExpr()",
      "begin_line": 300,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 26)",
        "(line 302,col 5)-(line 302,col 36)",
        "(line 303,col 5)-(line 303,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit1()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit2()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit3()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testShortCircuit4()",
      "begin_line": 318,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 44)",
        "(line 320,col 5)-(line 320,col 42)",
        "(line 321,col 5)-(line 321,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testMinimizeExprCondition()",
      "begin_line": 324,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 38)",
        "(line 326,col 5)-(line 326,col 42)",
        "(line 327,col 5)-(line 327,col 43)",
        "(line 328,col 5)-(line 328,col 36)",
        "(line 329,col 5)-(line 329,col 46)",
        "(line 330,col 5)-(line 330,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testTrueFalseFolding()",
      "begin_line": 333,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 16)",
        "(line 335,col 5)-(line 335,col 31)",
        "(line 336,col 5)-(line 336,col 32)",
        "(line 337,col 5)-(line 337,col 29)",
        "(line 338,col 5)-(line 338,col 37)",
        "(line 339,col 5)-(line 339,col 40)",
        "(line 340,col 5)-(line 340,col 28)",
        "(line 341,col 5)-(line 341,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testCommaSplitingConstantCondition()",
      "begin_line": 344,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 17)",
        "(line 346,col 5)-(line 346,col 48)",
        "(line 347,col 5)-(line 347,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testAvoidCommaSplitting()",
      "begin_line": 350,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 17)",
        "(line 352,col 5)-(line 352,col 39)",
        "(line 353,col 5)-(line 353,col 16)",
        "(line 354,col 5)-(line 354,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testObjectLiteral()",
      "begin_line": 357,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 21)",
        "(line 359,col 5)-(line 359,col 24)",
        "(line 360,col 5)-(line 360,col 33)",
        "(line 361,col 5)-(line 361,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testArrayLiteral()",
      "begin_line": 364,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 21)",
        "(line 366,col 5)-(line 366,col 22)",
        "(line 367,col 5)-(line 367,col 22)",
        "(line 368,col 5)-(line 368,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldIfs1()",
      "begin_line": 371,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 373,col 47)",
        "(line 374,col 5)-(line 375,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldIfs2()",
      "begin_line": 378,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 379,col 5)-(line 380,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.testFoldHook2()",
      "begin_line": 383,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 384,col 5)-(line 385,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeIntegrationTest.disable_testFoldHook1()",
      "begin_line": 388,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 390,col 37)"
      ]
    }
  ]
}