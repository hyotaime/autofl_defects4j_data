{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/ScopedAliasesTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScopedAliasesTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 36,
      "end_line": 667,
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
        "EXTERNS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "transformationHandler"
      ],
      "begin_line": 44,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.ScopedAliasesTest()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScoped(java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedNoChanges(java.lang.String, java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testOneLevel()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 5)-(line 61,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoLevel()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 65,col 5)-(line 66,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTransitive()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 5)-(line 71,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTransitiveInSameVar()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 76,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testMultipleTransitive()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 80,col 5)-(line 83,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFourLevel()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 88,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testWorksInClosures()",
      "begin_line": 91,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 95,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testOverridden()",
      "begin_line": 98,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 102,col 58)",
        "(line 104,col 5)-(line 105,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoScopes()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 112,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTwoSymbolsInTwoScopes()",
      "begin_line": 115,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 124,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasOfSymbolInGoogScope()",
      "begin_line": 127,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 137,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionReturnThis()",
      "begin_line": 140,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 141,col 5)-(line 144,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionAssignsToVar()",
      "begin_line": 147,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 151,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFunctionThrows()",
      "begin_line": 154,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 158,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testPropertiesNotChanged()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedVar()",
      "begin_line": 165,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 174,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedScopedVar()",
      "begin_line": 177,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 188,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testShadowedScopedVarTwoScopes()",
      "begin_line": 191,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 205,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUsingObjectLiteralToEscapeScoping()",
      "begin_line": 208,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 230,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTypes(java.lang.String, java.lang.String)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 39)",
        "(line 235,col 5)-(line 235,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.verifyTypes()",
      "begin_line": 238,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 239,col 5)-(line 239,col 46)",
        "(line 240,col 5)-(line 241,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocType()",
      "begin_line": 244,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 245,col 5)-(line 249,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocParameter()",
      "begin_line": 252,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 253,col 5)-(line 257,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocExtends()",
      "begin_line": 260,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 261,col 5)-(line 265,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocImplements()",
      "begin_line": 268,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 273,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocEnum()",
      "begin_line": 276,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 281,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocReturn()",
      "begin_line": 284,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 289,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocThis()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 293,col 5)-(line 297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocThrows()",
      "begin_line": 300,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 305,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocSubType()",
      "begin_line": 308,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 309,col 5)-(line 313,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testJsDocTypedef()",
      "begin_line": 316,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 321,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testArrayJsDoc()",
      "begin_line": 324,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 329,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testObjectJsDoc()",
      "begin_line": 332,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 337,col 66)",
        "(line 338,col 5)-(line 342,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUnionJsDoc()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 346,col 5)-(line 350,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFunctionJsDoc()",
      "begin_line": 353,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 354,col 5)-(line 358,col 72)",
        "(line 359,col 5)-(line 363,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testForwardJsDoc()",
      "begin_line": 366,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 383,col 76)",
        "(line 384,col 5)-(line 384,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testTestTypes()",
      "begin_line": 387,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 388,col 5)-(line 396,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNullType()",
      "begin_line": 399,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 400,col 5)-(line 403,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testIssue772()",
      "begin_line": 406,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 407,col 5)-(line 411,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testFailure(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedFailure(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 423,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedThis()",
      "begin_line": 426,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 80)",
        "(line 428,col 5)-(line 429,col 50)",
        "(line 430,col 5)-(line 430,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasRedefinition()",
      "begin_line": 433,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 435,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testAliasNonRedefinition()",
      "begin_line": 438,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 439,col 5)-(line 440,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedReturn()",
      "begin_line": 443,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 444,col 5)-(line 444,col 71)",
        "(line 445,col 5)-(line 446,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testScopedThrow()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testUsedImproperly()",
      "begin_line": 453,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 454,col 5)-(line 455,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testBadParameters()",
      "begin_line": 458,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 77)",
        "(line 460,col 5)-(line 460,col 79)",
        "(line 461,col 5)-(line 462,col 53)",
        "(line 463,col 5)-(line 464,col 53)",
        "(line 465,col 5)-(line 466,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNonAliasLocal()",
      "begin_line": 469,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 470,col 5)-(line 470,col 78)",
        "(line 471,col 5)-(line 472,col 50)",
        "(line 473,col 5)-(line 474,col 50)",
        "(line 475,col 5)-(line 476,col 50)",
        "(line 477,col 5)-(line 478,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testNoGoogScope()",
      "begin_line": 483,
      "end_line": 491,
      "comment": " TODO(tylerg) : update these to EasyMock style tests once available",
      "child_ranges": [
        "(line 484,col 5)-(line 485,col 66)",
        "(line 486,col 5)-(line 486,col 66)",
        "(line 487,col 5)-(line 487,col 32)",
        "(line 488,col 5)-(line 488,col 33)",
        "(line 490,col 5)-(line 490,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordOneAlias()",
      "begin_line": 493,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 496,col 31)",
        "(line 497,col 5)-(line 497,col 78)",
        "(line 499,col 5)-(line 499,col 66)",
        "(line 500,col 5)-(line 500,col 32)",
        "(line 501,col 5)-(line 501,col 37)",
        "(line 503,col 5)-(line 503,col 62)",
        "(line 504,col 5)-(line 505,col 46)",
        "(line 506,col 5)-(line 506,col 38)",
        "(line 507,col 5)-(line 507,col 68)",
        "(line 509,col 5)-(line 509,col 51)",
        "(line 510,col 5)-(line 510,col 65)",
        "(line 511,col 5)-(line 511,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordMultipleAliases()",
      "begin_line": 514,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 515,col 5)-(line 518,col 31)",
        "(line 519,col 5)-(line 520,col 74)",
        "(line 521,col 5)-(line 521,col 66)",
        "(line 522,col 5)-(line 522,col 32)",
        "(line 523,col 5)-(line 523,col 37)",
        "(line 525,col 5)-(line 525,col 62)",
        "(line 526,col 5)-(line 527,col 46)",
        "(line 528,col 5)-(line 528,col 38)",
        "(line 529,col 5)-(line 529,col 68)",
        "(line 531,col 5)-(line 531,col 51)",
        "(line 532,col 5)-(line 532,col 65)",
        "(line 533,col 5)-(line 533,col 64)",
        "(line 534,col 5)-(line 534,col 65)",
        "(line 535,col 5)-(line 535,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.testRecordAliasFromMultipleGoogScope()",
      "begin_line": 538,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 541,col 31)",
        "(line 542,col 5)-(line 545,col 31)",
        "(line 547,col 5)-(line 548,col 75)",
        "(line 550,col 5)-(line 550,col 66)",
        "(line 551,col 5)-(line 551,col 32)",
        "(line 552,col 5)-(line 552,col 37)",
        "(line 555,col 5)-(line 555,col 62)",
        "(line 556,col 5)-(line 557,col 46)",
        "(line 558,col 5)-(line 558,col 38)",
        "(line 560,col 5)-(line 560,col 68)",
        "(line 562,col 5)-(line 562,col 69)",
        "(line 564,col 5)-(line 564,col 51)",
        "(line 565,col 5)-(line 565,col 65)",
        "(line 566,col 5)-(line 566,col 64)",
        "(line 568,col 5)-(line 568,col 56)",
        "(line 569,col 5)-(line 569,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.verifyAliasTransformationPosition(int, int, int, int, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 572,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 574,col 5)-(line 574,col 48)",
        "(line 575,col 5)-(line 575,col 58)",
        "(line 576,col 5)-(line 578,col 37)",
        "(line 579,col 5)-(line 580,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 5)-(line 585,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TransformationHandlerSpy",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler"
      ],
      "begin_line": 588,
      "end_line": 609,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "observedPositions"
      ],
      "begin_line": 591,
      "end_line": 592,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "constructedAliases"
      ],
      "begin_line": 594,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TransformationHandlerSpy.logAliasTransformation(java.lang.String, com.google.javascript.rhino.SourcePosition\u003ccom.google.javascript.jscomp.CompilerOptions.AliasTransformation\u003e)",
      "begin_line": 597,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 600,col 7)-(line 603,col 7)",
        "(line 604,col 7)-(line 604,col 54)",
        "(line 605,col 7)-(line 605,col 47)",
        "(line 606,col 7)-(line 606,col 34)",
        "(line 607,col 7)-(line 607,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "AliasSpy",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.CompilerOptions.AliasTransformation"
      ],
      "begin_line": 611,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "observedDefinitions"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.AliasSpy.addAlias(java.lang.String, java.lang.String)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 616,col 7)-(line 616,col 49)"
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
      "begin_line": 620,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 622,
      "end_line": 622,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "actualTypes"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.TypeVerifyingPass(com.google.javascript.jscomp.Compiler)",
      "begin_line": 625,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 7)-(line 626,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 629,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 631,col 7)-(line 631,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 634,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.ScopedAliasesTest.TypeVerifyingPass.visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)",
      "begin_line": 640,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 642,col 40)",
        "(line 643,col 7)-(line 664,col 7)"
      ]
    }
  ]
}