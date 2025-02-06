{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/InlineVariablesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineVariablesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 26,
      "end_line": 1067,
      "comment": "\n * Verifies that valid candidates for inlining are inlined, but\n * that no dangerous inlining occurs.\n *\n * @author kushal@google.com (Kushal Dave)\n "
    },
    {
      "type": "field",
      "varNames": [
        "inlineAllStrings"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inlineLocalsOnly"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.InlineVariablesTest()",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.setUp()",
      "begin_line": 35,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 5)-(line 37,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 40,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 47,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.tearDown()",
      "begin_line": 50,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 29)",
        "(line 53,col 5)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineGlobal()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineExportedName()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineExportedName2()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 68,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotInlineIncrement()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotInlineDecrement()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotInlineIntoLhsOfAssign()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineIntoRhsOfAssign()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineInFunction()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 88,col 5)-(line 89,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineInFunction2()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 99,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineInFunction3()",
      "begin_line": 102,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 108,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineInFunction4()",
      "begin_line": 111,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 116,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineInFunction5()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 125,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAcrossModules()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 131,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitConditional1()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitConditional2()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitConditional3()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitLoop()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitForLoop()",
      "begin_line": 151,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 42)",
        "(line 154,col 5)-(line 154,col 59)",
        "(line 155,col 5)-(line 155,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotEnterSubscope()",
      "begin_line": 158,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 163,col 13)",
        "(line 164,col 5)-(line 168,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotExitTry()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 60)",
        "(line 173,col 5)-(line 173,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotEnterCatch()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotEnterFinally()",
      "begin_line": 180,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 182,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideIfConditional()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 76)",
        "(line 187,col 5)-(line 187,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testOnlyReadAtInitialization()",
      "begin_line": 190,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 40)",
        "(line 192,col 5)-(line 192,col 76)",
        "(line 193,col 5)-(line 193,col 61)",
        "(line 194,col 5)-(line 195,col 42)",
        "(line 196,col 5)-(line 197,col 42)",
        "(line 198,col 5)-(line 198,col 80)",
        "(line 200,col 5)-(line 200,col 50)",
        "(line 201,col 5)-(line 202,col 39)",
        "(line 203,col 5)-(line 204,col 39)",
        "(line 205,col 5)-(line 206,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testImmutableWithSingleReferenceAfterInitialzation()",
      "begin_line": 209,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 32)",
        "(line 211,col 5)-(line 211,col 68)",
        "(line 212,col 5)-(line 212,col 53)",
        "(line 213,col 5)-(line 214,col 38)",
        "(line 215,col 5)-(line 216,col 38)",
        "(line 217,col 5)-(line 217,col 72)",
        "(line 219,col 5)-(line 219,col 42)",
        "(line 220,col 5)-(line 221,col 35)",
        "(line 222,col 5)-(line 223,col 35)",
        "(line 224,col 5)-(line 225,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testSingleReferenceAfterInitialzation()",
      "begin_line": 228,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 229,col 42)",
        "(line 230,col 5)-(line 230,col 55)",
        "(line 231,col 5)-(line 231,col 48)",
        "(line 232,col 5)-(line 232,col 60)",
        "(line 233,col 5)-(line 233,col 59)",
        "(line 234,col 5)-(line 234,col 57)",
        "(line 235,col 5)-(line 235,col 43)",
        "(line 236,col 5)-(line 236,col 57)",
        "(line 237,col 5)-(line 237,col 57)",
        "(line 238,col 5)-(line 238,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideIfBranch()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideAndConditional()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideAndBranch()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideOrBranch()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 5)-(line 254,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideHookBranch()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideHookConditional()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 262,col 5)-(line 263,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideOrBranchInsideIfConditional()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 5)-(line 267,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInsideOrBranchInsideIfConditionalWithConstant()",
      "begin_line": 270,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testCrossFunctionsAsLeftLeaves()",
      "begin_line": 275,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 280,col 77)",
        "(line 281,col 5)-(line 285,col 65)",
        "(line 286,col 5)-(line 288,col 52)",
        "(line 289,col 5)-(line 293,col 56)",
        "(line 294,col 5)-(line 296,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoCrossFunction()",
      "begin_line": 301,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 304,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossReferencingFunction()",
      "begin_line": 307,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 313,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testChainedAssignment()",
      "begin_line": 319,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 320,col 66)",
        "(line 321,col 5)-(line 321,col 66)",
        "(line 322,col 5)-(line 322,col 78)",
        "(line 323,col 5)-(line 323,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testForIn()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 327,col 48)",
        "(line 328,col 5)-(line 328,col 42)",
        "(line 329,col 5)-(line 329,col 55)",
        "(line 330,col 5)-(line 330,col 55)",
        "(line 331,col 5)-(line 331,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoCrossNewVariables()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossFunctionCalls()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossAssignment()",
      "begin_line": 347,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 61)",
        "(line 349,col 5)-(line 349,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossDelete()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossAssignmentPlus()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 357,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossIncrement()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 361,col 5)-(line 361,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoNotCrossConstructor()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testDoCrossVar()",
      "begin_line": 368,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testOverlappingInlines()",
      "begin_line": 373,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 382,col 13)",
        "(line 383,col 5)-(line 390,col 11)",
        "(line 392,col 5)-(line 392,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testOverlappingInlineFunctions()",
      "begin_line": 395,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 401,col 13)",
        "(line 402,col 5)-(line 405,col 11)",
        "(line 407,col 5)-(line 407,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineIntoLoops()",
      "begin_line": 410,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 412,col 38)",
        "(line 413,col 5)-(line 414,col 56)",
        "(line 415,col 5)-(line 415,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineIntoFunction()",
      "begin_line": 418,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 420,col 50)",
        "(line 421,col 5)-(line 421,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineIntoNamedFunction()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineIntoNestedNonHoistedNamedFunctions()",
      "begin_line": 428,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 430,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineIntoNestedNamedFunctions()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineMutatedVariable()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 438,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineImmutableMultipleTimes()",
      "begin_line": 441,
      "end_line": 446,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 443,col 36)",
        "(line 444,col 5)-(line 445,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineStringMultipleTimesIfNotWorthwhile()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineStringMultipleTimesWhenAliasingAllStrings()",
      "begin_line": 452,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 28)",
        "(line 454,col 5)-(line 456,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineBackwards()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineOutOfBranch()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInterferingInlines()",
      "begin_line": 467,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 469,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineIntoTryCatch()",
      "begin_line": 472,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 473,col 5)-(line 479,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineConstants()",
      "begin_line": 484,
      "end_line": 487,
      "comment": " written before they\u0027re read.",
      "child_ranges": [
        "(line 485,col 5)-(line 486,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineStringWhenWorthwhile()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineConstantAlias()",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 495,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineConstantAliasWithAnnotation()",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 499,col 5)-(line 500,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineConstantAliasWithNonConstant()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 504,col 5)-(line 505,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testCascadingInlines()",
      "begin_line": 508,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 511,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineGetpropIntoCall()",
      "begin_line": 514,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 36)",
        "(line 516,col 5)-(line 516,col 42)",
        "(line 517,col 5)-(line 517,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineFunctionDeclaration()",
      "begin_line": 520,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 521,col 5)-(line 522,col 36)",
        "(line 523,col 5)-(line 524,col 43)",
        "(line 525,col 5)-(line 526,col 33)",
        "(line 528,col 5)-(line 528,col 66)",
        "(line 529,col 5)-(line 529,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.test2388531()",
      "begin_line": 532,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 533,col 5)-(line 535,col 37)",
        "(line 536,col 5)-(line 538,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testRecursiveFunction1()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 5)-(line 542,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testRecursiveFunction2()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testUnreferencedBleedingFunction()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 5)-(line 550,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testReferencedBleedingFunction()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 5)-(line 554,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases1()",
      "begin_line": 557,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 558,col 5)-(line 559,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases1b()",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 563,col 5)-(line 564,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases1c()",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 568,col 5)-(line 569,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases1d()",
      "begin_line": 572,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 573,col 5)-(line 574,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases2()",
      "begin_line": 577,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 580,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases2b()",
      "begin_line": 583,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 584,col 5)-(line 586,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases2c()",
      "begin_line": 589,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 592,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliases2d()",
      "begin_line": 595,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 596,col 5)-(line 598,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineAliasesInLoop()",
      "begin_line": 601,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 602,col 5)-(line 618,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliasesInLoop()",
      "begin_line": 621,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 630,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases1()",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 634,col 5)-(line 635,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases1b()",
      "begin_line": 638,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 639,col 5)-(line 640,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases2()",
      "begin_line": 643,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 645,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases2b()",
      "begin_line": 648,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 649,col 5)-(line 650,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases3()",
      "begin_line": 653,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 654,col 5)-(line 657,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases3b()",
      "begin_line": 660,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 661,col 5)-(line 664,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases4()",
      "begin_line": 667,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 668,col 5)-(line 670,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases4b()",
      "begin_line": 673,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 674,col 5)-(line 676,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases5()",
      "begin_line": 679,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 680,col 5)-(line 682,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases5b()",
      "begin_line": 685,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 686,col 5)-(line 688,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases6()",
      "begin_line": 691,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 692,col 5)-(line 694,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases6b()",
      "begin_line": 697,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 698,col 5)-(line 700,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases7()",
      "begin_line": 703,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 704,col 5)-(line 706,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases7b()",
      "begin_line": 709,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 710,col 5)-(line 712,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases8()",
      "begin_line": 715,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 716,col 5)-(line 718,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineAliases8b()",
      "begin_line": 721,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 722,col 5)-(line 724,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testSideEffectOrder()",
      "begin_line": 727,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 729,col 5)-(line 729,col 45)",
        "(line 730,col 5)-(line 732,col 39)",
        "(line 734,col 5)-(line 734,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineParameterAlias1()",
      "begin_line": 737,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 738,col 5)-(line 748,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineParameterAlias2()",
      "begin_line": 751,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 752,col 5)-(line 763,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineFunctionAlias1a()",
      "begin_line": 766,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 767,col 5)-(line 775,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineFunctionAlias1b()",
      "begin_line": 778,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 779,col 5)-(line 787,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineFunctionAlias2a()",
      "begin_line": 790,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 791,col 5)-(line 799,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineFunctionAlias2b()",
      "begin_line": 802,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 803,col 5)-(line 812,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineCatchAlias1()",
      "begin_line": 815,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 816,col 5)-(line 828,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineCatchAlias2()",
      "begin_line": 831,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 832,col 5)-(line 845,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testLocalsOnly1()",
      "begin_line": 848,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 849,col 5)-(line 849,col 28)",
        "(line 850,col 5)-(line 852,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testLocalsOnly2()",
      "begin_line": 855,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 856,col 5)-(line 856,col 28)",
        "(line 857,col 5)-(line 864,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineUndefined1()",
      "begin_line": 867,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 868,col 5)-(line 869,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineUndefined2()",
      "begin_line": 872,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 873,col 5)-(line 873,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineUndefined3()",
      "begin_line": 876,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 877,col 5)-(line 877,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineUndefined4()",
      "begin_line": 880,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 881,col 5)-(line 882,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineUndefined5()",
      "begin_line": 885,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 886,col 5)-(line 887,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue90()",
      "begin_line": 890,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 891,col 5)-(line 892,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testRenamePropertyFunction()",
      "begin_line": 895,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 896,col 5)-(line 897,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testThisAlias()",
      "begin_line": 900,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 901,col 5)-(line 902,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testThisEscapedAlias()",
      "begin_line": 905,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 906,col 5)-(line 907,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testInlineNamedFunction()",
      "begin_line": 910,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 911,col 5)-(line 911,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378ModifiedArguments1()",
      "begin_line": 914,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 915,col 5)-(line 920,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378ModifiedArguments2()",
      "begin_line": 923,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 924,col 5)-(line 930,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378EscapedArguments1()",
      "begin_line": 933,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 934,col 5)-(line 942,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378EscapedArguments2()",
      "begin_line": 945,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 946,col 5)-(line 955,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378EscapedArguments3()",
      "begin_line": 958,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 959,col 5)-(line 966,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378EscapedArguments4()",
      "begin_line": 969,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 970,col 5)-(line 978,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378ArgumentsRead1()",
      "begin_line": 981,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 982,col 5)-(line 991,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testIssue378ArgumentsRead2()",
      "begin_line": 994,
      "end_line": 1011,
      "comment": "",
      "child_ranges": [
        "(line 995,col 5)-(line 1010,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testArgumentsModifiedInOuterFunction()",
      "begin_line": 1013,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 5)-(line 1031,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testArgumentsModifiedInInnerFunction()",
      "begin_line": 1034,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 5)-(line 1052,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testNoInlineRedeclaredExterns()",
      "begin_line": 1055,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 5)-(line 1056,col 37)",
        "(line 1057,col 5)-(line 1057,col 75)",
        "(line 1058,col 5)-(line 1058,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineVariablesTest.testBug6598844()",
      "begin_line": 1061,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 5)-(line 1065,col 77)"
      ]
    }
  ]
}