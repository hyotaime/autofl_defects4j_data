{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/CommandLineRunnerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLineRunnerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 44,
      "end_line": 1328,
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
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering1()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 42)",
        "(line 132,col 5)-(line 132,col 40)",
        "(line 133,col 5)-(line 133,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering2()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 40)",
        "(line 138,col 5)-(line 138,col 42)",
        "(line 139,col 5)-(line 139,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering3()",
      "begin_line": 142,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 44)",
        "(line 144,col 5)-(line 144,col 40)",
        "(line 145,col 5)-(line 145,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWarningGuardOrdering4()",
      "begin_line": 148,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 40)",
        "(line 150,col 5)-(line 150,col 44)",
        "(line 151,col 5)-(line 151,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOffByDefault()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOnWithAdvancedMode()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 59)",
        "(line 160,col 5)-(line 160,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOnWithErrorFlag()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 42)",
        "(line 165,col 5)-(line 165,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckGlobalThisOff()",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 40)",
        "(line 170,col 5)-(line 170,col 40)",
        "(line 171,col 5)-(line 171,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckingOffByDefault()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 176,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testReflectedMethods()",
      "begin_line": 179,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 59)",
        "(line 181,col 5)-(line 192,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testInlineVariables()",
      "begin_line": 195,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 59)",
        "(line 197,col 5)-(line 208,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypedAdvanced()",
      "begin_line": 211,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 59)",
        "(line 213,col 5)-(line 213,col 45)",
        "(line 214,col 5)-(line 223,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckingOnWithVerbose()",
      "begin_line": 226,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 40)",
        "(line 228,col 5)-(line 228,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeParsingOffByDefault()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeParsingOnWithVerbose()",
      "begin_line": 235,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 40)",
        "(line 237,col 5)-(line 238,col 46)",
        "(line 239,col 5)-(line 240,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckOverride1()",
      "begin_line": 243,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 40)",
        "(line 245,col 5)-(line 245,col 40)",
        "(line 246,col 5)-(line 246,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTypeCheckOverride2()",
      "begin_line": 249,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 250,col 40)",
        "(line 251,col 5)-(line 251,col 62)",
        "(line 253,col 5)-(line 253,col 44)",
        "(line 254,col 5)-(line 255,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOffForDefault()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 259,col 5)-(line 259,col 40)",
        "(line 260,col 5)-(line 260,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOnForVerbose()",
      "begin_line": 263,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 264,col 5)-(line 264,col 40)",
        "(line 265,col 5)-(line 265,col 49)",
        "(line 266,col 5)-(line 266,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOverrideForVerbose()",
      "begin_line": 269,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 270,col 40)",
        "(line 271,col 5)-(line 271,col 43)",
        "(line 272,col 5)-(line 272,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckSymbolsOverrideForQuiet()",
      "begin_line": 275,
      "end_line": 279,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 276,col 38)",
        "(line 277,col 5)-(line 277,col 45)",
        "(line 278,col 5)-(line 278,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties1()",
      "begin_line": 281,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 282,col 5)-(line 282,col 40)",
        "(line 283,col 5)-(line 283,col 49)",
        "(line 284,col 5)-(line 284,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties2()",
      "begin_line": 287,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 40)",
        "(line 289,col 5)-(line 289,col 47)",
        "(line 290,col 5)-(line 290,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCheckUndefinedProperties3()",
      "begin_line": 293,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 40)",
        "(line 295,col 5)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDuplicateParams()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 68)",
        "(line 301,col 5)-(line 301,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag()",
      "begin_line": 304,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 305,col 5)-(line 305,col 29)",
        "(line 306,col 5)-(line 306,col 35)",
        "(line 307,col 5)-(line 307,col 20)",
        "(line 307,col 22)-(line 307,col 37)",
        "(line 308,col 5)-(line 308,col 19)",
        "(line 308,col 21)-(line 308,col 36)",
        "(line 309,col 5)-(line 313,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag2()",
      "begin_line": 316,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 35)",
        "(line 318,col 5)-(line 319,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDefineFlag3()",
      "begin_line": 322,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 36)",
        "(line 324,col 5)-(line 325,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testScriptStrictModeNoWarning()",
      "begin_line": 328,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 5)-(line 329,col 30)",
        "(line 330,col 5)-(line 330,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testFunctionStrictModeNoWarning()",
      "begin_line": 333,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 60)",
        "(line 335,col 5)-(line 336,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testQuietMode()",
      "begin_line": 339,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 40)",
        "(line 341,col 5)-(line 342,col 41)",
        "(line 343,col 5)-(line 343,col 38)",
        "(line 344,col 5)-(line 344,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessClosurePrimitives()",
      "begin_line": 347,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 349,col 33)",
        "(line 350,col 5)-(line 350,col 51)",
        "(line 351,col 5)-(line 351,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGetMsgWiring()",
      "begin_line": 354,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 355,col 5)-(line 358,col 40)",
        "(line 359,col 5)-(line 359,col 59)",
        "(line 360,col 5)-(line 363,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCssNameWiring()",
      "begin_line": 366,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 379,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue70a()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue70b()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue81()",
      "begin_line": 394,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 395,col 59)",
        "(line 396,col 5)-(line 396,col 31)",
        "(line 397,col 5)-(line 398,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue115()",
      "begin_line": 401,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 402,col 57)",
        "(line 403,col 5)-(line 403,col 39)",
        "(line 404,col 5)-(line 404,col 40)",
        "(line 405,col 5)-(line 412,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue297()",
      "begin_line": 415,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 416,col 5)-(line 416,col 57)",
        "(line 417,col 5)-(line 424,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testHiddenSideEffect()",
      "begin_line": 427,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 59)",
        "(line 429,col 5)-(line 430,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue504()",
      "begin_line": 433,
      "end_line": 437,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 59)",
        "(line 435,col 5)-(line 436,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601()",
      "begin_line": 439,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 440,col 5)-(line 440,col 52)",
        "(line 441,col 5)-(line 442,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601b()",
      "begin_line": 445,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 446,col 59)",
        "(line 447,col 5)-(line 448,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue601c()",
      "begin_line": 451,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 452,col 5)-(line 452,col 59)",
        "(line 453,col 5)-(line 454,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testIssue846()",
      "begin_line": 457,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 458,col 5)-(line 458,col 59)",
        "(line 459,col 5)-(line 460,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag1()",
      "begin_line": 463,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 57)",
        "(line 465,col 5)-(line 465,col 30)",
        "(line 466,col 5)-(line 467,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag2()",
      "begin_line": 470,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 471,col 5)-(line 471,col 57)",
        "(line 472,col 5)-(line 472,col 29)",
        "(line 473,col 5)-(line 474,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag3()",
      "begin_line": 477,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 59)",
        "(line 479,col 5)-(line 479,col 38)",
        "(line 480,col 5)-(line 480,col 30)",
        "(line 481,col 5)-(line 484,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDebugFlag4()",
      "begin_line": 487,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 59)",
        "(line 489,col 5)-(line 489,col 38)",
        "(line 490,col 5)-(line 490,col 29)",
        "(line 491,col 5)-(line 494,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testBooleanFlag1()",
      "begin_line": 497,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 498,col 5)-(line 498,col 57)",
        "(line 499,col 5)-(line 499,col 24)",
        "(line 500,col 5)-(line 501,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testBooleanFlag2()",
      "begin_line": 504,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 24)",
        "(line 506,col 5)-(line 506,col 57)",
        "(line 507,col 5)-(line 508,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testHelpFlag()",
      "begin_line": 511,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 512,col 23)",
        "(line 513,col 5)-(line 515,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testExternsLifting1()",
      "begin_line": 518,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 519,col 5)-(line 519,col 52)",
        "(line 520,col 5)-(line 521,col 26)",
        "(line 523,col 5)-(line 523,col 64)",
        "(line 525,col 5)-(line 525,col 70)",
        "(line 526,col 5)-(line 526,col 35)",
        "(line 527,col 5)-(line 527,col 34)",
        "(line 528,col 5)-(line 528,col 41)",
        "(line 530,col 5)-(line 530,col 63)",
        "(line 532,col 5)-(line 532,col 68)",
        "(line 533,col 5)-(line 533,col 37)",
        "(line 534,col 5)-(line 534,col 34)",
        "(line 535,col 5)-(line 535,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testExternsLifting2()",
      "begin_line": 538,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 539,col 40)",
        "(line 540,col 5)-(line 542,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOff()",
      "begin_line": 545,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 52)",
        "(line 547,col 5)-(line 551,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn()",
      "begin_line": 554,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 555,col 5)-(line 562,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn2()",
      "begin_line": 565,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 566,col 5)-(line 574,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingOn3()",
      "begin_line": 577,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 578,col 5)-(line 578,col 51)",
        "(line 579,col 5)-(line 586,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingCircularDeps1()",
      "begin_line": 589,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 590,col 5)-(line 590,col 51)",
        "(line 591,col 5)-(line 596,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceSortingCircularDeps2()",
      "begin_line": 599,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 600,col 5)-(line 600,col 51)",
        "(line 601,col 5)-(line 609,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn1()",
      "begin_line": 612,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 51)",
        "(line 614,col 5)-(line 622,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn2()",
      "begin_line": 625,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 626,col 5)-(line 626,col 47)",
        "(line 627,col 5)-(line 635,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn3()",
      "begin_line": 638,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 639,col 5)-(line 639,col 45)",
        "(line 640,col 5)-(line 647,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn4()",
      "begin_line": 650,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 651,col 5)-(line 651,col 45)",
        "(line 652,col 5)-(line 652,col 43)",
        "(line 653,col 5)-(line 661,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn5()",
      "begin_line": 664,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 665,col 5)-(line 665,col 45)",
        "(line 666,col 5)-(line 671,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn6()",
      "begin_line": 674,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 675,col 5)-(line 675,col 45)",
        "(line 676,col 5)-(line 685,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn7()",
      "begin_line": 688,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 689,col 5)-(line 689,col 51)",
        "(line 690,col 5)-(line 695,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourcePruningOn8()",
      "begin_line": 698,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 699,col 5)-(line 699,col 44)",
        "(line 700,col 5)-(line 700,col 45)",
        "(line 701,col 5)-(line 701,col 40)",
        "(line 702,col 5)-(line 709,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testNoCompile()",
      "begin_line": 712,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 713,col 5)-(line 713,col 40)",
        "(line 714,col 5)-(line 722,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDependencySortingWhitespaceMode()",
      "begin_line": 725,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 726,col 5)-(line 726,col 46)",
        "(line 727,col 5)-(line 727,col 52)",
        "(line 728,col 5)-(line 737,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testForwardDeclareDroppedTypes()",
      "begin_line": 740,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 741,col 5)-(line 741,col 51)",
        "(line 743,col 5)-(line 743,col 40)",
        "(line 744,col 5)-(line 752,col 12)",
        "(line 754,col 5)-(line 762,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOnlyClosureDependenciesEmptyEntryPoints()",
      "begin_line": 765,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 767,col 5)-(line 767,col 47)",
        "(line 769,col 5)-(line 769,col 49)",
        "(line 770,col 5)-(line 777,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOnlyClosureDependenciesOneEntryPoint()",
      "begin_line": 780,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 781,col 5)-(line 781,col 49)",
        "(line 782,col 5)-(line 782,col 43)",
        "(line 783,col 5)-(line 795,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion1()",
      "begin_line": 798,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 799,col 5)-(line 799,col 33)",
        "(line 800,col 5)-(line 800,col 32)",
        "(line 801,col 5)-(line 801,col 50)",
        "(line 802,col 5)-(line 802,col 27)",
        "(line 803,col 5)-(line 805,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion2()",
      "begin_line": 808,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 809,col 5)-(line 809,col 37)",
        "(line 810,col 5)-(line 810,col 50)",
        "(line 811,col 5)-(line 811,col 48)",
        "(line 812,col 5)-(line 812,col 56)",
        "(line 813,col 5)-(line 815,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapExpansion3()",
      "begin_line": 818,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 819,col 5)-(line 819,col 37)",
        "(line 820,col 5)-(line 820,col 50)",
        "(line 821,col 5)-(line 821,col 49)",
        "(line 822,col 5)-(line 822,col 56)",
        "(line 823,col 5)-(line 826,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapFormat1()",
      "begin_line": 829,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 830,col 5)-(line 830,col 33)",
        "(line 831,col 5)-(line 831,col 32)",
        "(line 832,col 5)-(line 832,col 27)",
        "(line 833,col 5)-(line 834,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSourceMapFormat2()",
      "begin_line": 837,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 838,col 5)-(line 838,col 33)",
        "(line 839,col 5)-(line 839,col 32)",
        "(line 840,col 5)-(line 840,col 39)",
        "(line 841,col 5)-(line 841,col 27)",
        "(line 842,col 5)-(line 843,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testModuleWrapperBaseNameExpansion()",
      "begin_line": 846,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 847,col 5)-(line 847,col 37)",
        "(line 848,col 5)-(line 848,col 53)",
        "(line 849,col 5)-(line 852,col 7)",
        "(line 854,col 5)-(line 854,col 48)",
        "(line 855,col 5)-(line 857,col 55)",
        "(line 858,col 5)-(line 858,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testCharSetExpansion()",
      "begin_line": 861,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 862,col 5)-(line 862,col 17)",
        "(line 863,col 5)-(line 863,col 70)",
        "(line 864,col 5)-(line 864,col 32)",
        "(line 865,col 5)-(line 865,col 17)",
        "(line 866,col 5)-(line 866,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testChainModuleManifest()",
      "begin_line": 869,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 870,col 5)-(line 870,col 37)",
        "(line 871,col 5)-(line 872,col 67)",
        "(line 874,col 5)-(line 874,col 48)",
        "(line 875,col 5)-(line 876,col 54)",
        "(line 877,col 5)-(line 889,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testStarModuleManifest()",
      "begin_line": 892,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 893,col 5)-(line 893,col 36)",
        "(line 894,col 5)-(line 895,col 67)",
        "(line 897,col 5)-(line 897,col 48)",
        "(line 898,col 5)-(line 899,col 54)",
        "(line 900,col 5)-(line 912,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOutputModuleGraphJson()",
      "begin_line": 915,
      "end_line": 924,
      "comment": "",
      "child_ranges": [
        "(line 916,col 5)-(line 916,col 36)",
        "(line 917,col 5)-(line 918,col 65)",
        "(line 920,col 5)-(line 920,col 48)",
        "(line 921,col 5)-(line 922,col 48)",
        "(line 923,col 5)-(line 923,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testVersionFlag()",
      "begin_line": 926,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 927,col 5)-(line 927,col 26)",
        "(line 928,col 5)-(line 928,col 17)",
        "(line 929,col 5)-(line 933,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testVersionFlag2()",
      "begin_line": 936,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 937,col 5)-(line 937,col 26)",
        "(line 938,col 5)-(line 938,col 17)",
        "(line 939,col 5)-(line 943,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testPrintAstFlag()",
      "begin_line": 946,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 947,col 5)-(line 947,col 33)",
        "(line 948,col 5)-(line 948,col 17)",
        "(line 949,col 5)-(line 962,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSyntheticExterns()",
      "begin_line": 965,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 966,col 5)-(line 967,col 59)",
        "(line 968,col 5)-(line 969,col 46)",
        "(line 971,col 5)-(line 971,col 47)",
        "(line 972,col 5)-(line 972,col 40)",
        "(line 973,col 5)-(line 974,col 49)",
        "(line 976,col 5)-(line 976,col 47)",
        "(line 977,col 5)-(line 977,col 40)",
        "(line 978,col 5)-(line 979,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGoogAssertStripping()",
      "begin_line": 982,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 983,col 5)-(line 983,col 59)",
        "(line 984,col 5)-(line 985,col 13)",
        "(line 986,col 5)-(line 986,col 24)",
        "(line 987,col 5)-(line 987,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testMissingReturnCheckOnWithVerbose()",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 991,col 5)-(line 991,col 40)",
        "(line 992,col 5)-(line 993,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testGenerateExports()",
      "begin_line": 996,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 997,col 5)-(line 997,col 40)",
        "(line 998,col 5)-(line 1000,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testDepreciationWithVerbose()",
      "begin_line": 1003,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 5)-(line 1004,col 40)",
        "(line 1005,col 5)-(line 1006,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTwoParseErrors()",
      "begin_line": 1009,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 5)-(line 1015,col 7)",
        "(line 1016,col 5)-(line 1016,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES3ByDefault()",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 5)-(line 1020,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5ChecksByDefault()",
      "begin_line": 1023,
      "end_line": 1025,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 5)-(line 1024,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5ChecksInVerbose()",
      "begin_line": 1027,
      "end_line": 1030,
      "comment": "",
      "child_ranges": [
        "(line 1028,col 5)-(line 1028,col 40)",
        "(line 1029,col 5)-(line 1029,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5()",
      "begin_line": 1032,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 5)-(line 1033,col 42)",
        "(line 1034,col 5)-(line 1034,col 53)",
        "(line 1035,col 5)-(line 1035,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5Strict()",
      "begin_line": 1038,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 5)-(line 1039,col 49)",
        "(line 1040,col 5)-(line 1040,col 66)",
        "(line 1041,col 5)-(line 1041,col 52)",
        "(line 1042,col 5)-(line 1042,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5StrictUseStrict()",
      "begin_line": 1045,
      "end_line": 1050,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 5)-(line 1046,col 49)",
        "(line 1047,col 5)-(line 1047,col 69)",
        "(line 1048,col 5)-(line 1048,col 46)",
        "(line 1049,col 5)-(line 1049,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testES5StrictUseStrictMultipleInputs()",
      "begin_line": 1052,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 5)-(line 1053,col 49)",
        "(line 1054,col 5)-(line 1055,col 53)",
        "(line 1056,col 5)-(line 1056,col 46)",
        "(line 1057,col 5)-(line 1057,col 64)",
        "(line 1058,col 5)-(line 1058,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWithKeywordDefault()",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 5)-(line 1062,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testWithKeywordWithEs5ChecksOff()",
      "begin_line": 1065,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 5)-(line 1066,col 39)",
        "(line 1067,col 5)-(line 1067,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testNoSrCFilesWithManifest()",
      "begin_line": 1070,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 5)-(line 1071,col 47)",
        "(line 1072,col 5)-(line 1072,col 42)",
        "(line 1073,col 5)-(line 1073,col 70)",
        "(line 1074,col 5)-(line 1074,col 32)",
        "(line 1075,col 5)-(line 1079,col 5)",
        "(line 1080,col 5)-(line 1081,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTransformAMD()",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": "",
      "child_ranges": [
        "(line 1085,col 5)-(line 1085,col 40)",
        "(line 1086,col 5)-(line 1086,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessCJS()",
      "begin_line": 1089,
      "end_line": 1097,
      "comment": "",
      "child_ranges": [
        "(line 1090,col 5)-(line 1090,col 31)",
        "(line 1091,col 5)-(line 1091,col 44)",
        "(line 1092,col 5)-(line 1092,col 49)",
        "(line 1093,col 5)-(line 1093,col 33)",
        "(line 1094,col 5)-(line 1094,col 53)",
        "(line 1095,col 5)-(line 1095,col 39)",
        "(line 1096,col 5)-(line 1096,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testProcessCJSWithModuleOutput()",
      "begin_line": 1099,
      "end_line": 1109,
      "comment": "",
      "child_ranges": [
        "(line 1100,col 5)-(line 1100,col 31)",
        "(line 1101,col 5)-(line 1101,col 44)",
        "(line 1102,col 5)-(line 1102,col 49)",
        "(line 1103,col 5)-(line 1103,col 30)",
        "(line 1104,col 5)-(line 1104,col 33)",
        "(line 1105,col 5)-(line 1106,col 40)",
        "(line 1108,col 5)-(line 1108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testFormattingSingleQuote()",
      "begin_line": 1111,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 5)-(line 1112,col 28)",
        "(line 1113,col 5)-(line 1113,col 57)",
        "(line 1115,col 5)-(line 1115,col 43)",
        "(line 1116,col 5)-(line 1116,col 28)",
        "(line 1117,col 5)-(line 1117,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testTransformAMDAndProcessCJS()",
      "begin_line": 1120,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 5)-(line 1121,col 31)",
        "(line 1122,col 5)-(line 1122,col 40)",
        "(line 1123,col 5)-(line 1123,col 44)",
        "(line 1124,col 5)-(line 1124,col 49)",
        "(line 1125,col 5)-(line 1125,col 33)",
        "(line 1126,col 5)-(line 1127,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testModuleJSON()",
      "begin_line": 1130,
      "end_line": 1139,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 5)-(line 1131,col 31)",
        "(line 1132,col 5)-(line 1132,col 40)",
        "(line 1133,col 5)-(line 1133,col 44)",
        "(line 1134,col 5)-(line 1134,col 49)",
        "(line 1135,col 5)-(line 1135,col 55)",
        "(line 1136,col 5)-(line 1136,col 33)",
        "(line 1137,col 5)-(line 1138,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testOutputSameAsInput()",
      "begin_line": 1141,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1142,col 5)-(line 1142,col 51)",
        "(line 1143,col 5)-(line 1143,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSame(java.lang.String)",
      "begin_line": 1148,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 5)-(line 1149,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.testSame(java.lang.String[])",
      "begin_line": 1152,
      "end_line": 1154,
      "comment": "",
      "child_ranges": [
        "(line 1153,col 5)-(line 1153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, java.lang.String)",
      "begin_line": 1156,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 5)-(line 1157,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], java.lang.String[])",
      "begin_line": 1164,
      "end_line": 1166,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   ",
      "child_ranges": [
        "(line 1165,col 5)-(line 1165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1174,
      "end_line": 1198,
      "comment": "\n   * Asserts that when compiling with the given compiler options,\n   * {@code original} is transformed into {@code compiled}.\n   * If {@code warning} is non-null, we will also check if the given\n   * warning type was emitted.\n   ",
      "child_ranges": [
        "(line 1176,col 5)-(line 1176,col 42)",
        "(line 1178,col 5)-(line 1186,col 5)",
        "(line 1188,col 5)-(line 1188,col 50)",
        "(line 1189,col 5)-(line 1197,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1203,
      "end_line": 1205,
      "comment": "\n   * Asserts that when compiling, there is an error or warning.\n   ",
      "child_ranges": [
        "(line 1204,col 5)-(line 1204,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1207,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1208,col 5)-(line 1208,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.test(java.lang.String[], com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 1214,
      "end_line": 1233,
      "comment": "\n   * Asserts that when compiling, there is an error or warning.\n   ",
      "child_ranges": [
        "(line 1215,col 5)-(line 1215,col 42)",
        "(line 1216,col 5)-(line 1219,col 72)",
        "(line 1221,col 5)-(line 1221,col 37)",
        "(line 1222,col 5)-(line 1222,col 59)",
        "(line 1224,col 5)-(line 1232,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.createCommandLineRunner(java.lang.String[])",
      "begin_line": 1235,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1236,col 5)-(line 1246,col 5)",
        "(line 1248,col 5)-(line 1250,col 5)",
        "(line 1252,col 5)-(line 1252,col 56)",
        "(line 1253,col 5)-(line 1256,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.compile(java.lang.String[])",
      "begin_line": 1259,
      "end_line": 1297,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 5)-(line 1260,col 65)",
        "(line 1261,col 5)-(line 1261,col 80)",
        "(line 1262,col 5)-(line 1262,col 53)",
        "(line 1263,col 5)-(line 1263,col 52)",
        "(line 1265,col 5)-(line 1281,col 5)",
        "(line 1283,col 5)-(line 1292,col 11)",
        "(line 1293,col 5)-(line 1293,col 17)",
        "(line 1294,col 5)-(line 1294,col 40)",
        "(line 1295,col 5)-(line 1295,col 35)",
        "(line 1296,col 5)-(line 1296,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.Anonymous-d3a39425-13ef-43b0-a870-7d1de2968649.apply(java.lang.Integer)",
      "begin_line": 1288,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1290,col 13)-(line 1290,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.parse(java.lang.String[])",
      "begin_line": 1299,
      "end_line": 1316,
      "comment": "",
      "child_ranges": [
        "(line 1300,col 5)-(line 1300,col 56)",
        "(line 1301,col 5)-(line 1301,col 65)",
        "(line 1302,col 5)-(line 1302,col 48)",
        "(line 1303,col 5)-(line 1303,col 51)",
        "(line 1304,col 5)-(line 1306,col 5)",
        "(line 1307,col 5)-(line 1307,col 52)",
        "(line 1309,col 5)-(line 1309,col 52)",
        "(line 1310,col 5)-(line 1310,col 44)",
        "(line 1311,col 5)-(line 1311,col 38)",
        "(line 1312,col 5)-(line 1312,col 60)",
        "(line 1313,col 5)-(line 1313,col 36)",
        "(line 1314,col 5)-(line 1314,col 32)",
        "(line 1315,col 5)-(line 1315,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.setFilename(int, java.lang.String)",
      "begin_line": 1318,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 5)-(line 1319,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.CommandLineRunnerTest.getFilename(int)",
      "begin_line": 1322,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1323,col 5)-(line 1325,col 5)",
        "(line 1326,col 5)-(line 1326,col 28)"
      ]
    }
  ]
}