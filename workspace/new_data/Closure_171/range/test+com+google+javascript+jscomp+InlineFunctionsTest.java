{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/InlineFunctionsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InlineFunctionsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 2365,
      "comment": "\n * Inline function tests.\n * @author johnlenz@google.com (john lenz)\n "
    },
    {
      "type": "field",
      "varNames": [
        "allowGlobalFunctionInlining"
      ],
      "begin_line": 25,
      "end_line": 25,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowBlockInlining"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowExpressionDecomposition"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowFunctionExpressionInlining"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowLocalFunctionInlining"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeStrictThis"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "assumeMinimumCapture"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.InlineFunctionsTest()",
      "begin_line": 33,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 34,col 5)-(line 34,col 27)",
        "(line 35,col 5)-(line 35,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.setUp()",
      "begin_line": 38,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 18)",
        "(line 41,col 5)-(line 41,col 38)",
        "(line 42,col 5)-(line 42,col 39)",
        "(line 43,col 5)-(line 43,col 30)",
        "(line 44,col 5)-(line 44,col 29)",
        "(line 45,col 5)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 48,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 33)",
        "(line 51,col 5)-(line 58,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.getNumRepetitions()",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n   * Returns the number of times the pass should be run before results are\n   * verified.\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineEmptyFunction1()",
      "begin_line": 71,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 75,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineEmptyFunction2()",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 82,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineEmptyFunction3()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineEmptyFunction4()",
      "begin_line": 92,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 96,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineEmptyFunction5()",
      "begin_line": 99,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 31)",
        "(line 103,col 5)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions1()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 111,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions2()",
      "begin_line": 114,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 121,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions3()",
      "begin_line": 124,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 126,col 5)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions4()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 139,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions5()",
      "begin_line": 142,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 147,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions6()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 155,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions7()",
      "begin_line": 158,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions8()",
      "begin_line": 166,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 171,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions9()",
      "begin_line": 174,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 179,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions10()",
      "begin_line": 182,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions11()",
      "begin_line": 192,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 193,col 5)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions12()",
      "begin_line": 198,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 31)",
        "(line 201,col 5)-(line 203,col 21)",
        "(line 204,col 5)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions13()",
      "begin_line": 208,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 210,col 5)-(line 212,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions14()",
      "begin_line": 215,
      "end_line": 222,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 221,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions15a()",
      "begin_line": 224,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 226,col 5)-(line 230,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions15b()",
      "begin_line": 233,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 33)",
        "(line 237,col 5)-(line 242,col 26)",
        "(line 244,col 5)-(line 244,col 32)",
        "(line 246,col 5)-(line 257,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions15c()",
      "begin_line": 260,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 261,col 33)",
        "(line 264,col 5)-(line 269,col 43)",
        "(line 271,col 5)-(line 271,col 32)",
        "(line 274,col 5)-(line 278,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions15d()",
      "begin_line": 282,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 33)",
        "(line 286,col 5)-(line 291,col 43)",
        "(line 293,col 5)-(line 293,col 32)",
        "(line 296,col 5)-(line 309,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions16a()",
      "begin_line": 312,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 33)",
        "(line 315,col 5)-(line 316,col 25)",
        "(line 318,col 5)-(line 318,col 32)",
        "(line 320,col 5)-(line 324,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions16b()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 330,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions17()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions18()",
      "begin_line": 338,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 31)",
        "(line 341,col 5)-(line 344,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions19()",
      "begin_line": 347,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 353,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions20()",
      "begin_line": 356,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 31)",
        "(line 359,col 5)-(line 362,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions21()",
      "begin_line": 365,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 370,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions22()",
      "begin_line": 373,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 384,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions23()",
      "begin_line": 387,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 389,col 5)-(line 399,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions24()",
      "begin_line": 402,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 404,col 5)-(line 404,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions25()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 5)-(line 408,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions26()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 413,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions27()",
      "begin_line": 416,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 417,col 5)-(line 425,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions28()",
      "begin_line": 428,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 440,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions29()",
      "begin_line": 443,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 444,col 5)-(line 457,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions30()",
      "begin_line": 460,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 462,col 5)-(line 463,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctions31()",
      "begin_line": 466,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 470,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInlining1()",
      "begin_line": 473,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 475,col 5)-(line 477,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInlining2()",
      "begin_line": 480,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 485,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInlining3()",
      "begin_line": 488,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 492,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInlining4()",
      "begin_line": 495,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 502,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInliningCosting1()",
      "begin_line": 505,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 515,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInliningCosting2()",
      "begin_line": 518,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 521,col 5)-(line 524,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInliningCosting3()",
      "begin_line": 527,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 529,col 5)-(line 536,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMixedModeInliningCosting4()",
      "begin_line": 539,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 541,col 5)-(line 544,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified1()",
      "begin_line": 547,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 551,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified2()",
      "begin_line": 554,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 555,col 5)-(line 557,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified3()",
      "begin_line": 560,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 562,col 5)-(line 564,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified4()",
      "begin_line": 567,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 569,col 5)-(line 572,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified5()",
      "begin_line": 575,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 577,col 5)-(line 579,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified6()",
      "begin_line": 582,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 583,col 5)-(line 585,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified7()",
      "begin_line": 588,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 593,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified8()",
      "begin_line": 596,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 5)-(line 598,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineIfParametersModified9()",
      "begin_line": 601,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 5)-(line 603,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineNeverPartialSubtitution1()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 607,col 5)-(line 608,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineNeverPartialSubtitution2()",
      "begin_line": 611,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 612,col 5)-(line 613,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineNeverMutateConstants()",
      "begin_line": 616,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 617,col 5)-(line 619,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineNeverOverrideNewValues()",
      "begin_line": 622,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 623,col 5)-(line 625,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineMutableArgsReferencedOnce()",
      "begin_line": 628,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineMutableArgs1()",
      "begin_line": 632,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 633,col 5)-(line 633,col 31)",
        "(line 634,col 5)-(line 634,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineMutableArgs2()",
      "begin_line": 637,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 638,col 5)-(line 638,col 31)",
        "(line 639,col 5)-(line 639,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineMutableArgs3()",
      "begin_line": 642,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 643,col 5)-(line 643,col 31)",
        "(line 644,col 5)-(line 644,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineMutableArgs4()",
      "begin_line": 647,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 648,col 5)-(line 648,col 31)",
        "(line 649,col 5)-(line 649,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineBlockMutableArgs1()",
      "begin_line": 652,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 653,col 5)-(line 655,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineBlockMutableArgs2()",
      "begin_line": 658,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 659,col 5)-(line 661,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineBlockMutableArgs3()",
      "begin_line": 664,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 665,col 5)-(line 667,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineBlockMutableArgs4()",
      "begin_line": 670,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 671,col 5)-(line 673,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables1()",
      "begin_line": 676,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 682,col 5)-(line 688,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables2()",
      "begin_line": 691,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 695,col 5)-(line 701,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables3()",
      "begin_line": 704,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 706,col 5)-(line 712,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables4()",
      "begin_line": 715,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 718,col 5)-(line 724,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables5()",
      "begin_line": 727,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 730,col 5)-(line 730,col 31)",
        "(line 731,col 5)-(line 733,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables6()",
      "begin_line": 736,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 737,col 5)-(line 743,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables7()",
      "begin_line": 746,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 747,col 5)-(line 747,col 33)",
        "(line 748,col 5)-(line 753,col 11)",
        "(line 755,col 5)-(line 755,col 32)",
        "(line 756,col 5)-(line 761,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables8()",
      "begin_line": 764,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 766,col 5)-(line 771,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables9()",
      "begin_line": 774,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 776,col 5)-(line 779,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables10()",
      "begin_line": 782,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 784,col 5)-(line 786,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables11()",
      "begin_line": 789,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 792,col 5)-(line 798,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables12()",
      "begin_line": 801,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 803,col 5)-(line 809,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables13()",
      "begin_line": 812,
      "end_line": 820,
      "comment": "",
      "child_ranges": [
        "(line 814,col 5)-(line 819,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables14()",
      "begin_line": 822,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 824,col 5)-(line 829,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables15()",
      "begin_line": 832,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 834,col 5)-(line 839,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables16()",
      "begin_line": 842,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 843,col 5)-(line 843,col 33)",
        "(line 845,col 5)-(line 850,col 11)",
        "(line 852,col 5)-(line 852,col 32)",
        "(line 854,col 5)-(line 859,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables17()",
      "begin_line": 863,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 864,col 5)-(line 870,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testShadowVariables18()",
      "begin_line": 873,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 874,col 5)-(line 881,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining1()",
      "begin_line": 884,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 885,col 5)-(line 888,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining2()",
      "begin_line": 891,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 894,col 5)-(line 901,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining3()",
      "begin_line": 904,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 906,col 5)-(line 915,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining4()",
      "begin_line": 918,
      "end_line": 926,
      "comment": "",
      "child_ranges": [
        "(line 921,col 5)-(line 925,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining5()",
      "begin_line": 928,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 930,col 5)-(line 936,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining6()",
      "begin_line": 939,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 942,col 5)-(line 948,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining7()",
      "begin_line": 951,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 953,col 5)-(line 957,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining8()",
      "begin_line": 960,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 968,col 5)-(line 968,col 31)",
        "(line 969,col 5)-(line 970,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining9()",
      "begin_line": 973,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 977,col 5)-(line 981,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining10()",
      "begin_line": 984,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 988,col 5)-(line 988,col 31)",
        "(line 989,col 5)-(line 991,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining11()",
      "begin_line": 994,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 996,col 5)-(line 1000,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInlining12()",
      "begin_line": 1003,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 5)-(line 1007,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex1()",
      "begin_line": 1010,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 5)-(line 1014,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex2()",
      "begin_line": 1017,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 5)-(line 1027,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex3()",
      "begin_line": 1030,
      "end_line": 1042,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 5)-(line 1041,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex4()",
      "begin_line": 1044,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 5)-(line 1051,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex5()",
      "begin_line": 1054,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 5)-(line 1062,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex6()",
      "begin_line": 1065,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1068,col 5)-(line 1074,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex7()",
      "begin_line": 1077,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1079,col 5)-(line 1082,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex8()",
      "begin_line": 1085,
      "end_line": 1089,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 5)-(line 1088,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCostBasedInliningComplex9()",
      "begin_line": 1091,
      "end_line": 1095,
      "comment": "",
      "child_ranges": [
        "(line 1092,col 5)-(line 1094,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testDoubleInlining1()",
      "begin_line": 1097,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1098,col 5)-(line 1098,col 31)",
        "(line 1099,col 5)-(line 1102,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testDoubleInlining2()",
      "begin_line": 1105,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 5)-(line 1109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineOfNonGlobalFunction1()",
      "begin_line": 1112,
      "end_line": 1117,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 5)-(line 1116,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineOfNonGlobalFunction2()",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 5)-(line 1123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineOfNonGlobalFunction3()",
      "begin_line": 1126,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 5)-(line 1130,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineOfNonGlobalFunction4()",
      "begin_line": 1133,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 5)-(line 1137,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineMaskedFunction()",
      "begin_line": 1141,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 5)-(line 1146,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testNoInlineNonFunction()",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 5)-(line 1150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineCall()",
      "begin_line": 1153,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 5)-(line 1155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctionWithArgsMismatch1()",
      "begin_line": 1158,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 5)-(line 1160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctionWithArgsMismatch2()",
      "begin_line": 1163,
      "end_line": 1166,
      "comment": "",
      "child_ranges": [
        "(line 1164,col 5)-(line 1165,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctionWithArgsMismatch3()",
      "begin_line": 1168,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 5)-(line 1170,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineFunctionWithArgsMismatch4()",
      "begin_line": 1173,
      "end_line": 1177,
      "comment": "",
      "child_ranges": [
        "(line 1174,col 5)-(line 1176,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testArgumentsWithSideEffectsNeverInlined1()",
      "begin_line": 1179,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1180,col 5)-(line 1180,col 31)",
        "(line 1181,col 5)-(line 1181,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testArgumentsWithSideEffectsNeverInlined2()",
      "begin_line": 1184,
      "end_line": 1187,
      "comment": "",
      "child_ranges": [
        "(line 1185,col 5)-(line 1185,col 31)",
        "(line 1186,col 5)-(line 1186,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testOneSideEffectCallDoesNotRuinOthers()",
      "begin_line": 1189,
      "end_line": 1193,
      "comment": "",
      "child_ranges": [
        "(line 1190,col 5)-(line 1190,col 31)",
        "(line 1191,col 5)-(line 1192,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultNoParamCall1()",
      "begin_line": 1195,
      "end_line": 1198,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 5)-(line 1197,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultNoParamCall2()",
      "begin_line": 1200,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 4)-(line 1203,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultNoParamCall3()",
      "begin_line": 1206,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1212,col 5)-(line 1213,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultWithParamCall1()",
      "begin_line": 1217,
      "end_line": 1220,
      "comment": "",
      "child_ranges": [
        "(line 1218,col 5)-(line 1219,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultWithParamCall2()",
      "begin_line": 1222,
      "end_line": 1225,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 5)-(line 1224,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineNoResultWithParamCall3()",
      "begin_line": 1227,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1228,col 5)-(line 1229,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline1()",
      "begin_line": 1232,
      "end_line": 1237,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 5)-(line 1236,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline2()",
      "begin_line": 1239,
      "end_line": 1244,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 5)-(line 1243,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline3()",
      "begin_line": 1246,
      "end_line": 1251,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 5)-(line 1250,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline4()",
      "begin_line": 1253,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1254,col 5)-(line 1255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline5()",
      "begin_line": 1258,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1259,col 5)-(line 1260,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline6()",
      "begin_line": 1263,
      "end_line": 1266,
      "comment": "",
      "child_ranges": [
        "(line 1264,col 5)-(line 1265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline7()",
      "begin_line": 1268,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1269,col 5)-(line 1273,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInline8()",
      "begin_line": 1276,
      "end_line": 1279,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 5)-(line 1278,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars1()",
      "begin_line": 1281,
      "end_line": 1285,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 5)-(line 1284,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars2()",
      "begin_line": 1287,
      "end_line": 1293,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 5)-(line 1292,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars3()",
      "begin_line": 1295,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1296,col 5)-(line 1300,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars4()",
      "begin_line": 1303,
      "end_line": 1306,
      "comment": "",
      "child_ranges": [
        "(line 1304,col 5)-(line 1305,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars5()",
      "begin_line": 1308,
      "end_line": 1311,
      "comment": "",
      "child_ranges": [
        "(line 1309,col 5)-(line 1310,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars6()",
      "begin_line": 1313,
      "end_line": 1316,
      "comment": "",
      "child_ranges": [
        "(line 1314,col 5)-(line 1315,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars7()",
      "begin_line": 1318,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 5)-(line 1325,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars8()",
      "begin_line": 1328,
      "end_line": 1331,
      "comment": "",
      "child_ranges": [
        "(line 1329,col 5)-(line 1330,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars9()",
      "begin_line": 1333,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1334,col 5)-(line 1335,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars10()",
      "begin_line": 1338,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1339,col 5)-(line 1340,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars11()",
      "begin_line": 1343,
      "end_line": 1346,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 5)-(line 1345,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineVars12()",
      "begin_line": 1348,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1349,col 5)-(line 1350,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineInExpresssions1()",
      "begin_line": 1353,
      "end_line": 1356,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 5)-(line 1355,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineInExpresssions2()",
      "begin_line": 1358,
      "end_line": 1363,
      "comment": "",
      "child_ranges": [
        "(line 1359,col 5)-(line 1362,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineInExpresssions3()",
      "begin_line": 1365,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1366,col 5)-(line 1369,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineInExpresssions4()",
      "begin_line": 1372,
      "end_line": 1377,
      "comment": "",
      "child_ranges": [
        "(line 1373,col 5)-(line 1376,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexInlineInExpresssions5()",
      "begin_line": 1379,
      "end_line": 1385,
      "comment": "",
      "child_ranges": [
        "(line 1380,col 5)-(line 1384,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexNoInline1()",
      "begin_line": 1387,
      "end_line": 1389,
      "comment": "",
      "child_ranges": [
        "(line 1388,col 5)-(line 1388,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexNoInline2()",
      "begin_line": 1391,
      "end_line": 1393,
      "comment": "",
      "child_ranges": [
        "(line 1392,col 5)-(line 1392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexSample()",
      "begin_line": 1395,
      "end_line": 1443,
      "comment": "",
      "child_ranges": [
        "(line 1396,col 5)-(line 1420,col 11)",
        "(line 1422,col 5)-(line 1442,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexSampleNoInline()",
      "begin_line": 1445,
      "end_line": 1465,
      "comment": "",
      "child_ranges": [
        "(line 1446,col 5)-(line 1464,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexNoVarSub()",
      "begin_line": 1468,
      "end_line": 1478,
      "comment": " Test redefinition of parameter name.",
      "child_ranges": [
        "(line 1469,col 5)-(line 1477,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexFunctionWithFunctionDefinition1()",
      "begin_line": 1480,
      "end_line": 1483,
      "comment": "",
      "child_ranges": [
        "(line 1481,col 5)-(line 1482,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexFunctionWithFunctionDefinition2()",
      "begin_line": 1485,
      "end_line": 1496,
      "comment": "",
      "child_ranges": [
        "(line 1486,col 5)-(line 1486,col 33)",
        "(line 1489,col 5)-(line 1489,col 59)",
        "(line 1491,col 5)-(line 1491,col 32)",
        "(line 1493,col 5)-(line 1495,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexFunctionWithFunctionDefinition2a()",
      "begin_line": 1498,
      "end_line": 1510,
      "comment": "",
      "child_ranges": [
        "(line 1499,col 5)-(line 1499,col 33)",
        "(line 1502,col 5)-(line 1503,col 67)",
        "(line 1505,col 5)-(line 1505,col 32)",
        "(line 1507,col 5)-(line 1509,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testComplexFunctionWithFunctionDefinition3()",
      "begin_line": 1512,
      "end_line": 1523,
      "comment": "",
      "child_ranges": [
        "(line 1513,col 5)-(line 1513,col 33)",
        "(line 1516,col 5)-(line 1516,col 67)",
        "(line 1518,col 5)-(line 1518,col 32)",
        "(line 1520,col 5)-(line 1521,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testDecomposePlusEquals()",
      "begin_line": 1525,
      "end_line": 1533,
      "comment": "",
      "child_ranges": [
        "(line 1526,col 5)-(line 1532,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testDecomposeFunctionExpressionInCall()",
      "begin_line": 1535,
      "end_line": 1556,
      "comment": "",
      "child_ranges": [
        "(line 1536,col 5)-(line 1555,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineConstructor1()",
      "begin_line": 1558,
      "end_line": 1561,
      "comment": "",
      "child_ranges": [
        "(line 1559,col 5)-(line 1560,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineConstructor2()",
      "begin_line": 1563,
      "end_line": 1566,
      "comment": "",
      "child_ranges": [
        "(line 1564,col 5)-(line 1565,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineConstructor3()",
      "begin_line": 1568,
      "end_line": 1573,
      "comment": "",
      "child_ranges": [
        "(line 1569,col 5)-(line 1572,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineConstructor4()",
      "begin_line": 1575,
      "end_line": 1580,
      "comment": "",
      "child_ranges": [
        "(line 1576,col 5)-(line 1579,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionInlining1()",
      "begin_line": 1582,
      "end_line": 1585,
      "comment": "",
      "child_ranges": [
        "(line 1583,col 5)-(line 1584,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionInlining2()",
      "begin_line": 1587,
      "end_line": 1590,
      "comment": "",
      "child_ranges": [
        "(line 1588,col 5)-(line 1589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionInlining3()",
      "begin_line": 1592,
      "end_line": 1595,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 5)-(line 1594,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionInlining4()",
      "begin_line": 1597,
      "end_line": 1600,
      "comment": "",
      "child_ranges": [
        "(line 1598,col 5)-(line 1599,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining1()",
      "begin_line": 1602,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1603,col 5)-(line 1604,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining2()",
      "begin_line": 1607,
      "end_line": 1610,
      "comment": "",
      "child_ranges": [
        "(line 1608,col 5)-(line 1609,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining3()",
      "begin_line": 1612,
      "end_line": 1615,
      "comment": "",
      "child_ranges": [
        "(line 1613,col 5)-(line 1614,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining4()",
      "begin_line": 1617,
      "end_line": 1620,
      "comment": "",
      "child_ranges": [
        "(line 1618,col 5)-(line 1619,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining5()",
      "begin_line": 1622,
      "end_line": 1625,
      "comment": "",
      "child_ranges": [
        "(line 1623,col 5)-(line 1624,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining6()",
      "begin_line": 1627,
      "end_line": 1630,
      "comment": "",
      "child_ranges": [
        "(line 1628,col 5)-(line 1629,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining7()",
      "begin_line": 1632,
      "end_line": 1635,
      "comment": "",
      "child_ranges": [
        "(line 1633,col 5)-(line 1634,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining8()",
      "begin_line": 1637,
      "end_line": 1640,
      "comment": "",
      "child_ranges": [
        "(line 1638,col 5)-(line 1639,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining9()",
      "begin_line": 1642,
      "end_line": 1646,
      "comment": "",
      "child_ranges": [
        "(line 1644,col 5)-(line 1645,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining10()",
      "begin_line": 1648,
      "end_line": 1652,
      "comment": "",
      "child_ranges": [
        "(line 1650,col 5)-(line 1651,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining11a()",
      "begin_line": 1654,
      "end_line": 1657,
      "comment": "",
      "child_ranges": [
        "(line 1656,col 5)-(line 1656,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining11b()",
      "begin_line": 1659,
      "end_line": 1673,
      "comment": "",
      "child_ranges": [
        "(line 1660,col 5)-(line 1660,col 33)",
        "(line 1662,col 5)-(line 1662,col 69)",
        "(line 1664,col 5)-(line 1664,col 32)",
        "(line 1665,col 5)-(line 1671,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining11c()",
      "begin_line": 1675,
      "end_line": 1690,
      "comment": "",
      "child_ranges": [
        "(line 1677,col 5)-(line 1677,col 33)",
        "(line 1678,col 5)-(line 1680,col 14)",
        "(line 1682,col 5)-(line 1682,col 32)",
        "(line 1683,col 5)-(line 1689,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining11d()",
      "begin_line": 1692,
      "end_line": 1712,
      "comment": "",
      "child_ranges": [
        "(line 1695,col 5)-(line 1695,col 33)",
        "(line 1696,col 5)-(line 1699,col 14)",
        "(line 1701,col 5)-(line 1701,col 32)",
        "(line 1702,col 5)-(line 1710,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining11e()",
      "begin_line": 1714,
      "end_line": 1732,
      "comment": "",
      "child_ranges": [
        "(line 1717,col 5)-(line 1717,col 33)",
        "(line 1718,col 5)-(line 1721,col 14)",
        "(line 1723,col 5)-(line 1723,col 32)",
        "(line 1724,col 5)-(line 1731,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionCallInlining12()",
      "begin_line": 1734,
      "end_line": 1737,
      "comment": "",
      "child_ranges": [
        "(line 1736,col 5)-(line 1736,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionOmega()",
      "begin_line": 1739,
      "end_line": 1744,
      "comment": "",
      "child_ranges": [
        "(line 1741,col 5)-(line 1743,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining1()",
      "begin_line": 1746,
      "end_line": 1749,
      "comment": "",
      "child_ranges": [
        "(line 1747,col 5)-(line 1748,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining2()",
      "begin_line": 1751,
      "end_line": 1754,
      "comment": "",
      "child_ranges": [
        "(line 1752,col 5)-(line 1753,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining3()",
      "begin_line": 1756,
      "end_line": 1759,
      "comment": "",
      "child_ranges": [
        "(line 1757,col 5)-(line 1758,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining4()",
      "begin_line": 1761,
      "end_line": 1764,
      "comment": "",
      "child_ranges": [
        "(line 1762,col 5)-(line 1763,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining5()",
      "begin_line": 1766,
      "end_line": 1768,
      "comment": "",
      "child_ranges": [
        "(line 1767,col 5)-(line 1767,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInlining6()",
      "begin_line": 1770,
      "end_line": 1772,
      "comment": "",
      "child_ranges": [
        "(line 1771,col 5)-(line 1771,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInliningOnly1()",
      "begin_line": 1774,
      "end_line": 1779,
      "comment": "",
      "child_ranges": [
        "(line 1775,col 5)-(line 1775,col 44)",
        "(line 1776,col 5)-(line 1776,col 42)",
        "(line 1777,col 5)-(line 1777,col 45)",
        "(line 1778,col 5)-(line 1778,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInliningOnly2()",
      "begin_line": 1781,
      "end_line": 1787,
      "comment": "",
      "child_ranges": [
        "(line 1782,col 5)-(line 1782,col 45)",
        "(line 1783,col 5)-(line 1783,col 35)",
        "(line 1785,col 5)-(line 1786,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInliningOnly3()",
      "begin_line": 1789,
      "end_line": 1795,
      "comment": "",
      "child_ranges": [
        "(line 1790,col 5)-(line 1790,col 45)",
        "(line 1791,col 5)-(line 1791,col 35)",
        "(line 1793,col 5)-(line 1794,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLocalFunctionInliningOnly4()",
      "begin_line": 1797,
      "end_line": 1803,
      "comment": "",
      "child_ranges": [
        "(line 1798,col 5)-(line 1798,col 45)",
        "(line 1799,col 5)-(line 1799,col 35)",
        "(line 1801,col 5)-(line 1802,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis1()",
      "begin_line": 1805,
      "end_line": 1817,
      "comment": "",
      "child_ranges": [
        "(line 1806,col 5)-(line 1806,col 29)",
        "(line 1809,col 5)-(line 1809,col 41)",
        "(line 1810,col 5)-(line 1810,col 45)",
        "(line 1812,col 5)-(line 1812,col 28)",
        "(line 1814,col 5)-(line 1814,col 43)",
        "(line 1815,col 5)-(line 1816,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis2()",
      "begin_line": 1819,
      "end_line": 1826,
      "comment": "",
      "child_ranges": [
        "(line 1821,col 5)-(line 1821,col 29)",
        "(line 1822,col 5)-(line 1822,col 51)",
        "(line 1824,col 5)-(line 1824,col 28)",
        "(line 1825,col 5)-(line 1825,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis3()",
      "begin_line": 1828,
      "end_line": 1837,
      "comment": "",
      "child_ranges": [
        "(line 1829,col 5)-(line 1829,col 29)",
        "(line 1832,col 5)-(line 1832,col 43)",
        "(line 1834,col 5)-(line 1834,col 28)",
        "(line 1836,col 5)-(line 1836,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis4()",
      "begin_line": 1839,
      "end_line": 1849,
      "comment": "",
      "child_ranges": [
        "(line 1840,col 5)-(line 1840,col 29)",
        "(line 1843,col 5)-(line 1843,col 46)",
        "(line 1845,col 5)-(line 1845,col 28)",
        "(line 1847,col 5)-(line 1848,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis5()",
      "begin_line": 1851,
      "end_line": 1861,
      "comment": "",
      "child_ranges": [
        "(line 1852,col 5)-(line 1852,col 29)",
        "(line 1855,col 5)-(line 1855,col 44)",
        "(line 1857,col 5)-(line 1857,col 28)",
        "(line 1859,col 5)-(line 1860,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis6()",
      "begin_line": 1863,
      "end_line": 1873,
      "comment": "",
      "child_ranges": [
        "(line 1864,col 5)-(line 1864,col 29)",
        "(line 1867,col 5)-(line 1867,col 50)",
        "(line 1869,col 5)-(line 1869,col 28)",
        "(line 1871,col 5)-(line 1872,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithThis7()",
      "begin_line": 1875,
      "end_line": 1882,
      "comment": "",
      "child_ranges": [
        "(line 1876,col 5)-(line 1876,col 28)",
        "(line 1878,col 5)-(line 1879,col 61)",
        "(line 1880,col 5)-(line 1881,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testFunctionExpressionYCombinator()",
      "begin_line": 1885,
      "end_line": 1954,
      "comment": " http://en.wikipedia.org/wiki/Fixed_point_combinator#Y_combinator",
      "child_ranges": [
        "(line 1886,col 5)-(line 1886,col 33)",
        "(line 1887,col 5)-(line 1909,col 26)",
        "(line 1911,col 5)-(line 1911,col 32)",
        "(line 1912,col 5)-(line 1953,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testRenamePropertyFunction()",
      "begin_line": 1956,
      "end_line": 1959,
      "comment": "",
      "child_ranges": [
        "(line 1957,col 5)-(line 1958,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testReplacePropertyFunction()",
      "begin_line": 1961,
      "end_line": 1972,
      "comment": "",
      "child_ranges": [
        "(line 1964,col 5)-(line 1967,col 30)",
        "(line 1970,col 5)-(line 1971,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineWithClosureContainingThis()",
      "begin_line": 1974,
      "end_line": 1977,
      "comment": "",
      "child_ranges": [
        "(line 1975,col 5)-(line 1976,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testIssue5159924a()",
      "begin_line": 1979,
      "end_line": 1995,
      "comment": "",
      "child_ranges": [
        "(line 1980,col 5)-(line 1994,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testIssue5159924b()",
      "begin_line": 1997,
      "end_line": 2012,
      "comment": "",
      "child_ranges": [
        "(line 1998,col 5)-(line 2011,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testInlineObject()",
      "begin_line": 2014,
      "end_line": 2016,
      "comment": "",
      "child_ranges": [
        "(line 2015,col 5)-(line 2015,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringCompare",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 2018,
      "end_line": 2057,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowGlobalFunctionInlining"
      ],
      "begin_line": 2019,
      "end_line": 2019,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.StringCompare.StringCompare()",
      "begin_line": 2021,
      "end_line": 2025,
      "comment": "",
      "child_ranges": [
        "(line 2022,col 7)-(line 2022,col 23)",
        "(line 2023,col 7)-(line 2023,col 29)",
        "(line 2024,col 7)-(line 2024,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.StringCompare.setUp()",
      "begin_line": 2027,
      "end_line": 2032,
      "comment": "",
      "child_ranges": [
        "(line 2029,col 7)-(line 2029,col 20)",
        "(line 2030,col 7)-(line 2030,col 40)",
        "(line 2031,col 7)-(line 2031,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.StringCompare.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 2034,
      "end_line": 2045,
      "comment": "",
      "child_ranges": [
        "(line 2036,col 7)-(line 2036,col 35)",
        "(line 2037,col 7)-(line 2044,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.StringCompare.testInlineObject()",
      "begin_line": 2047,
      "end_line": 2056,
      "comment": "",
      "child_ranges": [
        "(line 2048,col 7)-(line 2048,col 42)",
        "(line 2054,col 7)-(line 2055,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testBug4944818()",
      "begin_line": 2059,
      "end_line": 2094,
      "comment": "",
      "child_ranges": [
        "(line 2060,col 5)-(line 2093,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testIssue423()",
      "begin_line": 2096,
      "end_line": 2148,
      "comment": "",
      "child_ranges": [
        "(line 2097,col 5)-(line 2097,col 33)",
        "(line 2098,col 5)-(line 2122,col 22)",
        "(line 2124,col 5)-(line 2124,col 32)",
        "(line 2125,col 5)-(line 2147,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testIssue728()",
      "begin_line": 2150,
      "end_line": 2160,
      "comment": "",
      "child_ranges": [
        "(line 2151,col 5)-(line 2151,col 55)",
        "(line 2152,col 5)-(line 2152,col 46)",
        "(line 2153,col 5)-(line 2153,col 47)",
        "(line 2154,col 5)-(line 2157,col 5)",
        "(line 2159,col 5)-(line 2159,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testAnonymous1()",
      "begin_line": 2162,
      "end_line": 2174,
      "comment": "",
      "child_ranges": [
        "(line 2163,col 5)-(line 2163,col 33)",
        "(line 2164,col 5)-(line 2167,col 47)",
        "(line 2169,col 5)-(line 2169,col 32)",
        "(line 2170,col 5)-(line 2173,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testAnonymous2()",
      "begin_line": 2176,
      "end_line": 2178,
      "comment": "",
      "child_ranges": [
        "(line 2177,col 5)-(line 2177,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testAnonymous3()",
      "begin_line": 2180,
      "end_line": 2191,
      "comment": "",
      "child_ranges": [
        "(line 2182,col 5)-(line 2182,col 33)",
        "(line 2183,col 5)-(line 2183,col 69)",
        "(line 2185,col 5)-(line 2185,col 32)",
        "(line 2186,col 5)-(line 2187,col 61)",
        "(line 2189,col 5)-(line 2190,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testLoopWithFunctionWithFunction()",
      "begin_line": 2194,
      "end_line": 2227,
      "comment": "",
      "child_ranges": [
        "(line 2195,col 5)-(line 2195,col 32)",
        "(line 2196,col 5)-(line 2226,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testMethodWithFunctionWithFunction()",
      "begin_line": 2229,
      "end_line": 2253,
      "comment": "",
      "child_ranges": [
        "(line 2230,col 5)-(line 2230,col 32)",
        "(line 2231,col 5)-(line 2252,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCrossModuleInlining1()",
      "begin_line": 2256,
      "end_line": 2270,
      "comment": " Inline a single reference function into deeper modules",
      "child_ranges": [
        "(line 2257,col 5)-(line 2269,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCrossModuleInlining2()",
      "begin_line": 2274,
      "end_line": 2296,
      "comment": " is cheaper than the call itself.",
      "child_ranges": [
        "(line 2275,col 5)-(line 2281,col 14)",
        "(line 2283,col 5)-(line 2295,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.testCrossModuleInlining3()",
      "begin_line": 2300,
      "end_line": 2328,
      "comment": " is cheaper than the call itself.",
      "child_ranges": [
        "(line 2301,col 5)-(line 2309,col 14)",
        "(line 2311,col 5)-(line 2327,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.test6671158()",
      "begin_line": 2330,
      "end_line": 2352,
      "comment": "",
      "child_ranges": [
        "(line 2331,col 5)-(line 2351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.test8609285a()",
      "begin_line": 2354,
      "end_line": 2358,
      "comment": "",
      "child_ranges": [
        "(line 2355,col 4)-(line 2357,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.InlineFunctionsTest.test8609285b()",
      "begin_line": 2360,
      "end_line": 2364,
      "comment": "",
      "child_ranges": [
        "(line 2361,col 5)-(line 2363,col 59)"
      ]
    }
  ]
}