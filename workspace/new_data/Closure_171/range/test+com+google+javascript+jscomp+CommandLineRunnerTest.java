{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/CommandLineRunnerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineRunnerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 1388,
      "comment": "\n * Tests for {@link CommandLineRunner}.\n *\n * @author nicksantos@google.com (Nick Santos)\n "
    },
    {
      "type": "field",
      "varNames": [
        "lastCompiler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastCommandLineRunner"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exitCodes"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "outReader"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "errReader"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "filenames"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastArg"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " For testing args parsing."
    },
    {
      "type": "field",
      "varNames": [
        "useStringComparison"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " If set to true, uses comparison by string instead of by AST."
    },
    {
      "type": "field",
      "varNames": [
        "useModules"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXTERNS"
      ],
      "begin_line": 71,
      "end_line": 106,
      "comment": " Externs for the test "
    },
    {
      "type": "field",
      "varNames": [
        "externs"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.setUp()",
      "begin_line": 110,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 18)",
        "(line 113,col 5)-(line 113,col 30)",
        "(line 114,col 5)-(line 114,col 34)",
        "(line 115,col 5)-(line 115,col 24)",
        "(line 116,col 5)-(line 116,col 19)",
        "(line 117,col 5)-(line 117,col 44)",
        "(line 118,col 5)-(line 118,col 44)",
        "(line 119,col 5)-(line 119,col 32)",
        "(line 120,col 5)-(line 120,col 36)",
        "(line 121,col 5)-(line 121,col 17)",
        "(line 122,col 5)-(line 122,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.tearDown()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testUnknownAnnotation()",
      "begin_line": 130,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 40)",
        "(line 132,col 5)-(line 133,col 50)",
        "(line 135,col 5)-(line 135,col 51)",
        "(line 136,col 5)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering1()",
      "begin_line": 139,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 42)",
        "(line 141,col 5)-(line 141,col 40)",
        "(line 142,col 5)-(line 142,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering2()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 40)",
        "(line 147,col 5)-(line 147,col 42)",
        "(line 148,col 5)-(line 148,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering3()",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 44)",
        "(line 153,col 5)-(line 153,col 40)",
        "(line 154,col 5)-(line 154,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering4()",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 40)",
        "(line 159,col 5)-(line 159,col 44)",
        "(line 160,col 5)-(line 160,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSimpleModeLeavesUnusedParams()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 57)",
        "(line 165,col 5)-(line 165,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testAdvancedModeRemovesUnusedParams()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 59)",
        "(line 170,col 5)-(line 170,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOffByDefault()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOnWithAdvancedMode()",
      "begin_line": 177,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 178,col 59)",
        "(line 179,col 5)-(line 179,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOnWithErrorFlag()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 183,col 5)-(line 183,col 42)",
        "(line 184,col 5)-(line 184,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOff()",
      "begin_line": 187,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 40)",
        "(line 189,col 5)-(line 189,col 40)",
        "(line 190,col 5)-(line 190,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckingOffByDefault()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 194,col 5)-(line 195,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testReflectedMethods()",
      "begin_line": 198,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 59)",
        "(line 200,col 5)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testInlineVariables()",
      "begin_line": 214,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 215,col 5)-(line 215,col 59)",
        "(line 216,col 5)-(line 227,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypedAdvanced()",
      "begin_line": 230,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 59)",
        "(line 232,col 5)-(line 232,col 45)",
        "(line 233,col 5)-(line 242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckingOnWithVerbose()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 40)",
        "(line 247,col 5)-(line 247,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeParsingOffByDefault()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeParsingOnWithVerbose()",
      "begin_line": 254,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 40)",
        "(line 256,col 5)-(line 257,col 46)",
        "(line 258,col 5)-(line 259,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckOverride1()",
      "begin_line": 262,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 40)",
        "(line 264,col 5)-(line 264,col 40)",
        "(line 265,col 5)-(line 265,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckOverride2()",
      "begin_line": 268,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 269,col 5)-(line 269,col 40)",
        "(line 270,col 5)-(line 270,col 62)",
        "(line 272,col 5)-(line 272,col 44)",
        "(line 273,col 5)-(line 274,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOffForDefault()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 40)",
        "(line 279,col 5)-(line 279,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOnForVerbose()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 40)",
        "(line 284,col 5)-(line 284,col 49)",
        "(line 285,col 5)-(line 285,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOverrideForVerbose()",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 289,col 5)-(line 289,col 40)",
        "(line 290,col 5)-(line 290,col 43)",
        "(line 291,col 5)-(line 291,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOverrideForQuiet()",
      "begin_line": 294,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 38)",
        "(line 296,col 5)-(line 296,col 45)",
        "(line 297,col 5)-(line 297,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties1()",
      "begin_line": 300,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 301,col 40)",
        "(line 302,col 5)-(line 302,col 49)",
        "(line 303,col 5)-(line 303,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties2()",
      "begin_line": 306,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 307,col 5)-(line 307,col 40)",
        "(line 308,col 5)-(line 308,col 47)",
        "(line 309,col 5)-(line 309,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties3()",
      "begin_line": 312,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 40)",
        "(line 314,col 5)-(line 315,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDuplicateParams()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 68)",
        "(line 320,col 5)-(line 320,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag()",
      "begin_line": 323,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 324,col 5)-(line 324,col 29)",
        "(line 325,col 5)-(line 325,col 35)",
        "(line 326,col 5)-(line 326,col 20)",
        "(line 326,col 22)-(line 326,col 37)",
        "(line 327,col 5)-(line 327,col 19)",
        "(line 327,col 21)-(line 327,col 36)",
        "(line 328,col 5)-(line 332,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag2()",
      "begin_line": 335,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 35)",
        "(line 337,col 5)-(line 338,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag3()",
      "begin_line": 341,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 36)",
        "(line 343,col 5)-(line 344,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testScriptStrictModeNoWarning()",
      "begin_line": 347,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 30)",
        "(line 349,col 5)-(line 349,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testFunctionStrictModeNoWarning()",
      "begin_line": 352,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 60)",
        "(line 354,col 5)-(line 355,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testQuietMode()",
      "begin_line": 358,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 40)",
        "(line 360,col 5)-(line 361,col 41)",
        "(line 362,col 5)-(line 362,col 38)",
        "(line 363,col 5)-(line 363,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessClosurePrimitives()",
      "begin_line": 366,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 368,col 33)",
        "(line 369,col 5)-(line 369,col 51)",
        "(line 370,col 5)-(line 370,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGetMsgWiring()",
      "begin_line": 373,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 377,col 40)",
        "(line 378,col 5)-(line 378,col 59)",
        "(line 379,col 5)-(line 382,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCssNameWiring()",
      "begin_line": 385,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 386,col 5)-(line 398,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue70a()",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 5)-(line 406,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue70b()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 5)-(line 410,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue81()",
      "begin_line": 413,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 414,col 5)-(line 414,col 59)",
        "(line 415,col 5)-(line 415,col 31)",
        "(line 416,col 5)-(line 417,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue115()",
      "begin_line": 420,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 421,col 57)",
        "(line 422,col 5)-(line 422,col 39)",
        "(line 423,col 5)-(line 423,col 40)",
        "(line 424,col 5)-(line 431,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue297()",
      "begin_line": 434,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 435,col 5)-(line 435,col 57)",
        "(line 436,col 5)-(line 443,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testHiddenSideEffect()",
      "begin_line": 446,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 447,col 5)-(line 447,col 59)",
        "(line 448,col 5)-(line 449,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue504()",
      "begin_line": 452,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 59)",
        "(line 454,col 5)-(line 455,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601()",
      "begin_line": 458,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 459,col 5)-(line 459,col 52)",
        "(line 460,col 5)-(line 461,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601b()",
      "begin_line": 464,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 59)",
        "(line 466,col 5)-(line 467,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601c()",
      "begin_line": 470,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 59)",
        "(line 472,col 5)-(line 473,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue846()",
      "begin_line": 476,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 477,col 5)-(line 477,col 59)",
        "(line 478,col 5)-(line 479,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSideEffectIntegration()",
      "begin_line": 482,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 483,col 5)-(line 483,col 59)",
        "(line 484,col 5)-(line 504,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag1()",
      "begin_line": 507,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 57)",
        "(line 509,col 5)-(line 509,col 30)",
        "(line 510,col 5)-(line 511,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag2()",
      "begin_line": 514,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 57)",
        "(line 516,col 5)-(line 516,col 29)",
        "(line 517,col 5)-(line 518,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag3()",
      "begin_line": 521,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 522,col 5)-(line 522,col 59)",
        "(line 523,col 5)-(line 523,col 38)",
        "(line 524,col 5)-(line 524,col 30)",
        "(line 525,col 5)-(line 528,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag4()",
      "begin_line": 531,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 532,col 5)-(line 532,col 59)",
        "(line 533,col 5)-(line 533,col 38)",
        "(line 534,col 5)-(line 534,col 29)",
        "(line 535,col 5)-(line 538,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testBooleanFlag1()",
      "begin_line": 541,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 542,col 5)-(line 542,col 57)",
        "(line 543,col 5)-(line 543,col 24)",
        "(line 544,col 5)-(line 545,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testBooleanFlag2()",
      "begin_line": 548,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 549,col 5)-(line 549,col 24)",
        "(line 550,col 5)-(line 550,col 57)",
        "(line 551,col 5)-(line 552,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testHelpFlag()",
      "begin_line": 555,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 556,col 5)-(line 556,col 23)",
        "(line 557,col 5)-(line 559,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testExternsLifting1()",
      "begin_line": 562,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 563,col 5)-(line 563,col 52)",
        "(line 564,col 5)-(line 565,col 26)",
        "(line 567,col 5)-(line 567,col 64)",
        "(line 569,col 5)-(line 569,col 70)",
        "(line 570,col 5)-(line 570,col 35)",
        "(line 571,col 5)-(line 571,col 34)",
        "(line 572,col 5)-(line 572,col 41)",
        "(line 574,col 5)-(line 574,col 63)",
        "(line 576,col 5)-(line 576,col 68)",
        "(line 577,col 5)-(line 577,col 37)",
        "(line 578,col 5)-(line 578,col 34)",
        "(line 579,col 5)-(line 579,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testExternsLifting2()",
      "begin_line": 582,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 583,col 5)-(line 583,col 40)",
        "(line 584,col 5)-(line 586,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOff()",
      "begin_line": 589,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 590,col 52)",
        "(line 591,col 5)-(line 595,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn()",
      "begin_line": 598,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 599,col 5)-(line 606,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn2()",
      "begin_line": 609,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 610,col 5)-(line 618,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn3()",
      "begin_line": 621,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 622,col 51)",
        "(line 623,col 5)-(line 630,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingCircularDeps1()",
      "begin_line": 633,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 634,col 5)-(line 634,col 51)",
        "(line 635,col 5)-(line 640,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingCircularDeps2()",
      "begin_line": 643,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 644,col 5)-(line 644,col 51)",
        "(line 645,col 5)-(line 653,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn1()",
      "begin_line": 656,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 657,col 5)-(line 657,col 51)",
        "(line 658,col 5)-(line 666,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn2()",
      "begin_line": 669,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 670,col 5)-(line 670,col 47)",
        "(line 671,col 5)-(line 679,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn3()",
      "begin_line": 682,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 683,col 5)-(line 683,col 45)",
        "(line 684,col 5)-(line 691,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn4()",
      "begin_line": 694,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 695,col 5)-(line 695,col 45)",
        "(line 696,col 5)-(line 696,col 43)",
        "(line 697,col 5)-(line 705,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn5()",
      "begin_line": 708,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 709,col 5)-(line 709,col 45)",
        "(line 710,col 5)-(line 715,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn6()",
      "begin_line": 718,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 719,col 5)-(line 719,col 45)",
        "(line 720,col 5)-(line 729,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn7()",
      "begin_line": 732,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 733,col 5)-(line 733,col 51)",
        "(line 734,col 5)-(line 739,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn8()",
      "begin_line": 742,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 743,col 5)-(line 743,col 44)",
        "(line 744,col 5)-(line 744,col 45)",
        "(line 745,col 5)-(line 745,col 40)",
        "(line 746,col 5)-(line 753,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testModuleEntryPoint()",
      "begin_line": 756,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 757,col 5)-(line 757,col 36)",
        "(line 758,col 5)-(line 758,col 44)",
        "(line 759,col 5)-(line 759,col 43)",
        "(line 760,col 5)-(line 770,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testNoCompile()",
      "begin_line": 773,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 774,col 5)-(line 774,col 40)",
        "(line 775,col 5)-(line 783,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDependencySortingWhitespaceMode()",
      "begin_line": 786,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 787,col 5)-(line 787,col 46)",
        "(line 788,col 5)-(line 788,col 52)",
        "(line 789,col 5)-(line 798,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testForwardDeclareDroppedTypes()",
      "begin_line": 801,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 802,col 5)-(line 802,col 51)",
        "(line 804,col 5)-(line 804,col 40)",
        "(line 805,col 5)-(line 813,col 12)",
        "(line 815,col 5)-(line 823,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOnlyClosureDependenciesEmptyEntryPoints()",
      "begin_line": 826,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 828,col 5)-(line 828,col 47)",
        "(line 830,col 5)-(line 830,col 49)",
        "(line 831,col 5)-(line 838,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOnlyClosureDependenciesOneEntryPoint()",
      "begin_line": 841,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 842,col 5)-(line 842,col 49)",
        "(line 843,col 5)-(line 843,col 43)",
        "(line 844,col 5)-(line 856,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion1()",
      "begin_line": 859,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 860,col 5)-(line 860,col 33)",
        "(line 861,col 5)-(line 861,col 32)",
        "(line 862,col 5)-(line 862,col 50)",
        "(line 863,col 5)-(line 863,col 27)",
        "(line 864,col 5)-(line 866,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion2()",
      "begin_line": 869,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 870,col 5)-(line 870,col 37)",
        "(line 871,col 5)-(line 871,col 50)",
        "(line 872,col 5)-(line 872,col 48)",
        "(line 873,col 5)-(line 873,col 56)",
        "(line 874,col 5)-(line 876,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion3()",
      "begin_line": 879,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 880,col 5)-(line 880,col 37)",
        "(line 881,col 5)-(line 881,col 50)",
        "(line 882,col 5)-(line 882,col 49)",
        "(line 883,col 5)-(line 883,col 56)",
        "(line 884,col 5)-(line 887,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapFormat1()",
      "begin_line": 890,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 891,col 5)-(line 891,col 33)",
        "(line 892,col 5)-(line 892,col 32)",
        "(line 893,col 5)-(line 893,col 27)",
        "(line 894,col 5)-(line 895,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapFormat2()",
      "begin_line": 898,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 899,col 5)-(line 899,col 33)",
        "(line 900,col 5)-(line 900,col 32)",
        "(line 901,col 5)-(line 901,col 39)",
        "(line 902,col 5)-(line 902,col 27)",
        "(line 903,col 5)-(line 904,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testModuleWrapperBaseNameExpansion()",
      "begin_line": 907,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 908,col 5)-(line 908,col 37)",
        "(line 909,col 5)-(line 909,col 53)",
        "(line 910,col 5)-(line 913,col 7)",
        "(line 915,col 5)-(line 915,col 48)",
        "(line 916,col 5)-(line 918,col 55)",
        "(line 919,col 5)-(line 919,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCharSetExpansion()",
      "begin_line": 922,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 923,col 17)",
        "(line 924,col 5)-(line 924,col 70)",
        "(line 925,col 5)-(line 925,col 32)",
        "(line 926,col 5)-(line 926,col 17)",
        "(line 927,col 5)-(line 927,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testChainModuleManifest()",
      "begin_line": 930,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 931,col 5)-(line 931,col 37)",
        "(line 932,col 5)-(line 933,col 67)",
        "(line 935,col 5)-(line 935,col 48)",
        "(line 936,col 5)-(line 937,col 54)",
        "(line 938,col 5)-(line 950,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testStarModuleManifest()",
      "begin_line": 953,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 954,col 5)-(line 954,col 36)",
        "(line 955,col 5)-(line 956,col 67)",
        "(line 958,col 5)-(line 958,col 48)",
        "(line 959,col 5)-(line 960,col 54)",
        "(line 961,col 5)-(line 973,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOutputModuleGraphJson()",
      "begin_line": 976,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 977,col 5)-(line 977,col 36)",
        "(line 978,col 5)-(line 979,col 65)",
        "(line 981,col 5)-(line 981,col 48)",
        "(line 982,col 5)-(line 982,col 58)",
        "(line 983,col 5)-(line 983,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testVersionFlag()",
      "begin_line": 986,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 987,col 5)-(line 987,col 26)",
        "(line 988,col 5)-(line 988,col 17)",
        "(line 989,col 5)-(line 993,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testVersionFlag2()",
      "begin_line": 996,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 997,col 5)-(line 997,col 26)",
        "(line 998,col 5)-(line 998,col 17)",
        "(line 999,col 5)-(line 1003,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testPrintAstFlag()",
      "begin_line": 1006,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 5)-(line 1007,col 33)",
        "(line 1008,col 5)-(line 1008,col 17)",
        "(line 1009,col 5)-(line 1022,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSyntheticExterns()",
      "begin_line": 1025,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 5)-(line 1027,col 59)",
        "(line 1028,col 5)-(line 1029,col 46)",
        "(line 1031,col 5)-(line 1031,col 47)",
        "(line 1032,col 5)-(line 1032,col 40)",
        "(line 1033,col 5)-(line 1034,col 49)",
        "(line 1036,col 5)-(line 1036,col 47)",
        "(line 1037,col 5)-(line 1037,col 40)",
        "(line 1038,col 5)-(line 1039,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGoogAssertStripping()",
      "begin_line": 1042,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 5)-(line 1043,col 59)",
        "(line 1044,col 5)-(line 1045,col 13)",
        "(line 1046,col 5)-(line 1046,col 24)",
        "(line 1047,col 5)-(line 1047,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testMissingReturnCheckOnWithVerbose()",
      "begin_line": 1050,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 5)-(line 1051,col 40)",
        "(line 1052,col 5)-(line 1053,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGenerateExports()",
      "begin_line": 1056,
      "end_line": 1061,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 5)-(line 1057,col 40)",
        "(line 1058,col 5)-(line 1060,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDepreciationWithVerbose()",
      "begin_line": 1063,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 5)-(line 1064,col 40)",
        "(line 1065,col 5)-(line 1066,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTwoParseErrors()",
      "begin_line": 1069,
      "end_line": 1077,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 5)-(line 1075,col 7)",
        "(line 1076,col 5)-(line 1076,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES3ByDefault()",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 5)-(line 1080,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5ChecksByDefault()",
      "begin_line": 1083,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1084,col 5)-(line 1084,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5ChecksInVerbose()",
      "begin_line": 1087,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1088,col 5)-(line 1088,col 40)",
        "(line 1089,col 5)-(line 1089,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5()",
      "begin_line": 1092,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 5)-(line 1093,col 42)",
        "(line 1094,col 5)-(line 1094,col 53)",
        "(line 1095,col 5)-(line 1095,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5Strict()",
      "begin_line": 1098,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 5)-(line 1099,col 49)",
        "(line 1100,col 5)-(line 1100,col 66)",
        "(line 1101,col 5)-(line 1101,col 52)",
        "(line 1102,col 5)-(line 1102,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5StrictUseStrict()",
      "begin_line": 1105,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 5)-(line 1106,col 49)",
        "(line 1107,col 5)-(line 1107,col 69)",
        "(line 1108,col 5)-(line 1108,col 46)",
        "(line 1109,col 5)-(line 1109,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5StrictUseStrictMultipleInputs()",
      "begin_line": 1112,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 5)-(line 1113,col 49)",
        "(line 1114,col 5)-(line 1115,col 53)",
        "(line 1116,col 5)-(line 1116,col 46)",
        "(line 1117,col 5)-(line 1117,col 64)",
        "(line 1118,col 5)-(line 1118,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWithKeywordDefault()",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 5)-(line 1122,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWithKeywordWithEs5ChecksOff()",
      "begin_line": 1125,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 5)-(line 1126,col 39)",
        "(line 1127,col 5)-(line 1127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testNoSrCFilesWithManifest()",
      "begin_line": 1130,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 5)-(line 1131,col 47)",
        "(line 1132,col 5)-(line 1132,col 42)",
        "(line 1133,col 5)-(line 1133,col 70)",
        "(line 1134,col 5)-(line 1134,col 32)",
        "(line 1135,col 5)-(line 1139,col 5)",
        "(line 1140,col 5)-(line 1141,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTransformAMD()",
      "begin_line": 1144,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1145,col 5)-(line 1145,col 40)",
        "(line 1146,col 5)-(line 1146,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessCJS()",
      "begin_line": 1149,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1150,col 5)-(line 1150,col 31)",
        "(line 1151,col 5)-(line 1151,col 44)",
        "(line 1152,col 5)-(line 1152,col 49)",
        "(line 1153,col 5)-(line 1153,col 33)",
        "(line 1154,col 5)-(line 1154,col 53)",
        "(line 1155,col 5)-(line 1155,col 39)",
        "(line 1156,col 5)-(line 1156,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessCJSWithModuleOutput()",
      "begin_line": 1159,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 5)-(line 1160,col 31)",
        "(line 1161,col 5)-(line 1161,col 44)",
        "(line 1162,col 5)-(line 1162,col 49)",
        "(line 1163,col 5)-(line 1163,col 30)",
        "(line 1164,col 5)-(line 1164,col 33)",
        "(line 1165,col 5)-(line 1166,col 40)",
        "(line 1168,col 5)-(line 1168,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testFormattingSingleQuote()",
      "begin_line": 1171,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 5)-(line 1172,col 28)",
        "(line 1173,col 5)-(line 1173,col 57)",
        "(line 1175,col 5)-(line 1175,col 43)",
        "(line 1176,col 5)-(line 1176,col 28)",
        "(line 1177,col 5)-(line 1177,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTransformAMDAndProcessCJS()",
      "begin_line": 1180,
      "end_line": 1188,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 5)-(line 1181,col 31)",
        "(line 1182,col 5)-(line 1182,col 40)",
        "(line 1183,col 5)-(line 1183,col 44)",
        "(line 1184,col 5)-(line 1184,col 49)",
        "(line 1185,col 5)-(line 1185,col 33)",
        "(line 1186,col 5)-(line 1187,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testModuleJSON()",
      "begin_line": 1190,
      "end_line": 1199,
      "comment": "",
      "child_ranges": [
        "(line 1191,col 5)-(line 1191,col 31)",
        "(line 1192,col 5)-(line 1192,col 40)",
        "(line 1193,col 5)-(line 1193,col 44)",
        "(line 1194,col 5)-(line 1194,col 49)",
        "(line 1195,col 5)-(line 1195,col 55)",
        "(line 1196,col 5)-(line 1196,col 33)",
        "(line 1197,col 5)-(line 1198,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOutputSameAsInput()",
      "begin_line": 1201,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1202,col 5)-(line 1202,col 51)",
        "(line 1203,col 5)-(line 1203,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSame(java.lang.String)",
      "begin_line": 1208,
      "end_line": 1210,
      "comment": "",
      "child_ranges": [
        "(line 1209,col 5)-(line 1209,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSame(java.lang.String[])",
      "begin_line": 1212,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1213,col 5)-(line 1213,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, java.lang.String)",
      "begin_line": 1216,
      "end_line": 1218,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 5)-(line 1217,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], java.lang.String[])",
      "begin_line": 1224,
      "end_line": 1226,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   ",
      "child_ranges": [
        "(line 1225,col 5)-(line 1225,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1234,
      "end_line": 1258,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   * If {@code warning} is non-null, we will also check if the given\n   * warning type was emitted.\n   ",
      "child_ranges": [
        "(line 1236,col 5)-(line 1236,col 42)",
        "(line 1238,col 5)-(line 1246,col 5)",
        "(line 1248,col 5)-(line 1248,col 50)",
        "(line 1249,col 5)-(line 1257,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1263,
      "end_line": 1265,
      "comment": "\n   * Asserts that when compiling, there is an error or warning.\n   ",
      "child_ranges": [
        "(line 1264,col 5)-(line 1264,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1267,
      "end_line": 1269,
      "comment": "",
      "child_ranges": [
        "(line 1268,col 5)-(line 1268,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1274,
      "end_line": 1293,
      "comment": "\n   * Asserts that when compiling, there is an error or warning.\n   ",
      "child_ranges": [
        "(line 1275,col 5)-(line 1275,col 42)",
        "(line 1276,col 5)-(line 1279,col 72)",
        "(line 1281,col 5)-(line 1281,col 37)",
        "(line 1282,col 5)-(line 1282,col 59)",
        "(line 1284,col 5)-(line 1292,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.createCommandLineRunner(java.lang.String[])",
      "begin_line": 1295,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1296,col 5)-(line 1306,col 5)",
        "(line 1308,col 5)-(line 1310,col 5)",
        "(line 1312,col 5)-(line 1312,col 56)",
        "(line 1313,col 5)-(line 1316,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.compile(java.lang.String[])",
      "begin_line": 1319,
      "end_line": 1357,
      "comment": "",
      "child_ranges": [
        "(line 1320,col 5)-(line 1320,col 65)",
        "(line 1321,col 5)-(line 1321,col 80)",
        "(line 1322,col 5)-(line 1322,col 53)",
        "(line 1323,col 5)-(line 1323,col 52)",
        "(line 1325,col 5)-(line 1341,col 5)",
        "(line 1343,col 5)-(line 1352,col 11)",
        "(line 1353,col 5)-(line 1353,col 17)",
        "(line 1354,col 5)-(line 1354,col 40)",
        "(line 1355,col 5)-(line 1355,col 35)",
        "(line 1356,col 5)-(line 1356,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.Anonymous-529bc579-eef8-44d8-bfe7-bff5b0e71bfc.apply(java.lang.Integer)",
      "begin_line": 1348,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1350,col 13)-(line 1350,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.parse(java.lang.String[])",
      "begin_line": 1359,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1360,col 5)-(line 1360,col 56)",
        "(line 1361,col 5)-(line 1361,col 65)",
        "(line 1362,col 5)-(line 1362,col 48)",
        "(line 1363,col 5)-(line 1363,col 51)",
        "(line 1364,col 5)-(line 1366,col 5)",
        "(line 1367,col 5)-(line 1367,col 52)",
        "(line 1369,col 5)-(line 1369,col 52)",
        "(line 1370,col 5)-(line 1370,col 44)",
        "(line 1371,col 5)-(line 1371,col 38)",
        "(line 1372,col 5)-(line 1372,col 60)",
        "(line 1373,col 5)-(line 1373,col 36)",
        "(line 1374,col 5)-(line 1374,col 32)",
        "(line 1375,col 5)-(line 1375,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.setFilename(int, java.lang.String)",
      "begin_line": 1378,
      "end_line": 1380,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 5)-(line 1379,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.getFilename(int)",
      "begin_line": 1382,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1383,col 5)-(line 1385,col 5)",
        "(line 1386,col 5)-(line 1386,col 28)"
      ]
    }
  ]
}