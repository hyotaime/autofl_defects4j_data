{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/ScopedAliasesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScopedAliasesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 36,
      "end_line": 711,
      "comment": "\n * Tests for {@link ScopedAliases}\n *\n * @author robbyw@google.com (Robby Walker)\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_START_BLOCK"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOOG_SCOPE_END_BLOCK"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SCOPE_NAMESPACE"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EXTERNS"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformationHandler"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.ScopedAliasesTest()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScoped(java.lang.String, java.lang.String)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedNoChanges(java.lang.String, java.lang.String)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testOneLevel()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 64,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoLevel()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 68,col 5)-(line 69,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTransitive()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 74,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTransitiveInSameVar()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 78,col 5)-(line 79,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testMultipleTransitive()",
      "begin_line": 82,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 83,col 5)-(line 86,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFourLevel()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 90,col 5)-(line 91,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testWorksInClosures()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 95,col 5)-(line 98,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testOverridden()",
      "begin_line": 101,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 58)",
        "(line 107,col 5)-(line 108,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoScopes()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoSymbolsInTwoScopes()",
      "begin_line": 118,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 127,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasOfSymbolInGoogScope()",
      "begin_line": 130,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 140,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionReturnThis()",
      "begin_line": 143,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 147,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionAssignsToVar()",
      "begin_line": 150,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 154,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionThrows()",
      "begin_line": 157,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 161,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testPropertiesNotChanged()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedVar()",
      "begin_line": 168,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 177,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedScopedVar()",
      "begin_line": 180,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 181,col 5)-(line 191,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedScopedVarTwoScopes()",
      "begin_line": 194,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 195,col 5)-(line 208,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUsingObjectLiteralToEscapeScoping()",
      "begin_line": 211,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 217,col 5)-(line 233,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTypes(java.lang.String, java.lang.String)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 237,col 39)",
        "(line 238,col 5)-(line 238,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.verifyTypes()",
      "begin_line": 241,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 242,col 46)",
        "(line 243,col 5)-(line 244,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocType()",
      "begin_line": 247,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 252,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocParameter()",
      "begin_line": 255,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 260,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocExtends()",
      "begin_line": 263,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 268,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocImplements()",
      "begin_line": 271,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 276,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocEnum()",
      "begin_line": 279,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 280,col 5)-(line 284,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocReturn()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 292,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocThis()",
      "begin_line": 295,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 300,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocThrows()",
      "begin_line": 303,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 304,col 5)-(line 308,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocSubType()",
      "begin_line": 311,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 312,col 5)-(line 316,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocTypedef()",
      "begin_line": 319,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 324,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testArrayJsDoc()",
      "begin_line": 327,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 332,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testObjectJsDoc()",
      "begin_line": 335,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 340,col 66)",
        "(line 341,col 5)-(line 345,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUnionJsDoc()",
      "begin_line": 348,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 353,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFunctionJsDoc()",
      "begin_line": 356,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 361,col 72)",
        "(line 362,col 5)-(line 366,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testForwardJsDoc()",
      "begin_line": 369,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 370,col 5)-(line 386,col 76)",
        "(line 387,col 5)-(line 387,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTestTypes()",
      "begin_line": 390,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 399,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNullType()",
      "begin_line": 402,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 403,col 5)-(line 406,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testIssue772()",
      "begin_line": 409,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 414,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFailure(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 422,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFailure(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 5)-(line 426,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedThis()",
      "begin_line": 429,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 430,col 5)-(line 430,col 80)",
        "(line 431,col 5)-(line 432,col 50)",
        "(line 433,col 5)-(line 433,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasRedefinition()",
      "begin_line": 436,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 438,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasNonRedefinition()",
      "begin_line": 441,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 442,col 5)-(line 443,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testCtorAlias()",
      "begin_line": 446,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 456,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasCycle()",
      "begin_line": 459,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 467,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedReturn()",
      "begin_line": 470,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 71)",
        "(line 472,col 5)-(line 473,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedThrow()",
      "begin_line": 476,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUsedImproperly()",
      "begin_line": 480,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 481,col 5)-(line 482,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testBadParameters()",
      "begin_line": 485,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 486,col 5)-(line 486,col 77)",
        "(line 487,col 5)-(line 487,col 79)",
        "(line 488,col 5)-(line 489,col 53)",
        "(line 490,col 5)-(line 491,col 53)",
        "(line 492,col 5)-(line 493,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNonAliasLocal()",
      "begin_line": 496,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 497,col 5)-(line 498,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testOkAliasLocal()",
      "begin_line": 501,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 503,col 57)",
        "(line 504,col 5)-(line 505,col 66)",
        "(line 506,col 5)-(line 507,col 79)",
        "(line 508,col 5)-(line 511,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasReassign()",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 515,col 5)-(line 516,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testMultipleLocals()",
      "begin_line": 519,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 522,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNoGoogScope()",
      "begin_line": 527,
      "end_line": 535,
      "comment": " TODO(tylerg) : update these to EasyMock style tests once available",
      "child_ranges": [
        "(line 528,col 5)-(line 529,col 66)",
        "(line 530,col 5)-(line 530,col 66)",
        "(line 531,col 5)-(line 531,col 32)",
        "(line 532,col 5)-(line 532,col 33)",
        "(line 534,col 5)-(line 534,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordOneAlias()",
      "begin_line": 537,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 540,col 31)",
        "(line 541,col 5)-(line 541,col 78)",
        "(line 543,col 5)-(line 543,col 66)",
        "(line 544,col 5)-(line 544,col 32)",
        "(line 545,col 5)-(line 545,col 37)",
        "(line 547,col 5)-(line 547,col 62)",
        "(line 548,col 5)-(line 549,col 46)",
        "(line 550,col 5)-(line 550,col 38)",
        "(line 551,col 5)-(line 551,col 68)",
        "(line 553,col 5)-(line 553,col 51)",
        "(line 554,col 5)-(line 554,col 65)",
        "(line 555,col 5)-(line 555,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordMultipleAliases()",
      "begin_line": 558,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 559,col 5)-(line 562,col 31)",
        "(line 563,col 5)-(line 564,col 74)",
        "(line 565,col 5)-(line 565,col 66)",
        "(line 566,col 5)-(line 566,col 32)",
        "(line 567,col 5)-(line 567,col 37)",
        "(line 569,col 5)-(line 569,col 62)",
        "(line 570,col 5)-(line 571,col 46)",
        "(line 572,col 5)-(line 572,col 38)",
        "(line 573,col 5)-(line 573,col 68)",
        "(line 575,col 5)-(line 575,col 51)",
        "(line 576,col 5)-(line 576,col 65)",
        "(line 577,col 5)-(line 577,col 64)",
        "(line 578,col 5)-(line 578,col 65)",
        "(line 579,col 5)-(line 579,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordAliasFromMultipleGoogScope()",
      "begin_line": 582,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 583,col 5)-(line 585,col 31)",
        "(line 586,col 5)-(line 589,col 31)",
        "(line 591,col 5)-(line 592,col 75)",
        "(line 594,col 5)-(line 594,col 66)",
        "(line 595,col 5)-(line 595,col 32)",
        "(line 596,col 5)-(line 596,col 37)",
        "(line 599,col 5)-(line 599,col 62)",
        "(line 600,col 5)-(line 601,col 46)",
        "(line 602,col 5)-(line 602,col 38)",
        "(line 604,col 5)-(line 604,col 68)",
        "(line 606,col 5)-(line 606,col 69)",
        "(line 608,col 5)-(line 608,col 51)",
        "(line 609,col 5)-(line 609,col 65)",
        "(line 610,col 5)-(line 610,col 64)",
        "(line 612,col 5)-(line 612,col 56)",
        "(line 613,col 5)-(line 613,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.verifyAliasTransformationPosition(int, int, int, int, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 616,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 618,col 5)-(line 618,col 48)",
        "(line 619,col 5)-(line 619,col 58)",
        "(line 620,col 5)-(line 622,col 37)",
        "(line 623,col 5)-(line 624,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformationHandlerSpy",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler"
      ],
      "begin_line": 632,
      "end_line": 653,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "observedPositions"
      ],
      "begin_line": 635,
      "end_line": 636,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructedAliases"
      ],
      "begin_line": 638,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TransformationHandlerSpy.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 641,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 647,col 7)",
        "(line 648,col 7)-(line 648,col 54)",
        "(line 649,col 7)-(line 649,col 47)",
        "(line 650,col 7)-(line 650,col 34)",
        "(line 651,col 7)-(line 651,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasSpy",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformation"
      ],
      "begin_line": 655,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "observedDefinitions"
      ],
      "begin_line": 656,
      "end_line": 656,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.AliasSpy.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 658,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 660,col 7)-(line 660,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TypeVerifyingPass",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerPass",
        "com.google.javascript.jscomp.NodeTraversal.Callback"
      ],
      "begin_line": 664,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 666,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualTypes"
      ],
      "begin_line": 667,
      "end_line": 667,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.TypeVerifyingPass(com.google.javascript.jscomp.Compiler)",
      "begin_line": 669,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 670,col 7)-(line 670,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 673,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 7)-(line 675,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 678,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 684,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 40)",
        "(line 687,col 7)-(line 708,col 7)"
      ]
    }
  ]
}