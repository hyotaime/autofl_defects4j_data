{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeSubstituteAlternateSyntaxTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeSubstituteAlternateSyntaxTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 24,
      "end_line": 496,
      "comment": "\n * Tests for {@link PeepholeSubstituteAlternateSyntax} in isolation.\n * Tests for the interaction of multiple peephole passes are in\n * PeepholeIntegrationTest.\n "
    },
    {
      "type": "field",
      "varNames": [
        "FOLD_CONSTANTS_TEST_EXTERNS"
      ],
      "begin_line": 29,
      "end_line": 32,
      "comment": " testFoldLiteralArrayConstructors() and testFoldRegExp...()"
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.PeepholeSubstituteAlternateSyntaxTest(boolean)",
      "begin_line": 37,
      "end_line": 39,
      "comment": " TODO(user): Remove this when we no longer need to do string comparison.",
      "child_ranges": [
        "(line 38,col 5)-(line 38,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.PeepholeSubstituteAlternateSyntaxTest()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 5)-(line 42,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.setUp()",
      "begin_line": 45,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 16)",
        "(line 48,col 5)-(line 48,col 18)",
        "(line 49,col 5)-(line 49,col 32)",
        "(line 50,col 5)-(line 50,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 53,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 56,col 63)",
        "(line 57,col 5)-(line 57,col 46)",
        "(line 58,col 5)-(line 58,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.getNumRepetitions()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.foldSame(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.assertResultString(java.lang.String, java.lang.String, boolean)",
      "begin_line": 80,
      "end_line": 91,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 81,col 5)-(line 82,col 59)",
        "(line 84,col 5)-(line 88,col 5)",
        "(line 90,col 5)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldRegExpConstructor()",
      "begin_line": 93,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 22)",
        "(line 97,col 5)-(line 97,col 62)",
        "(line 99,col 5)-(line 99,col 66)",
        "(line 100,col 5)-(line 100,col 72)",
        "(line 102,col 5)-(line 103,col 77)",
        "(line 105,col 5)-(line 105,col 62)",
        "(line 106,col 5)-(line 106,col 62)",
        "(line 107,col 5)-(line 107,col 63)",
        "(line 109,col 5)-(line 109,col 60)",
        "(line 110,col 5)-(line 110,col 59)",
        "(line 111,col 5)-(line 111,col 59)",
        "(line 112,col 5)-(line 112,col 65)",
        "(line 113,col 5)-(line 113,col 59)",
        "(line 114,col 5)-(line 114,col 59)",
        "(line 115,col 5)-(line 115,col 59)",
        "(line 119,col 5)-(line 119,col 27)",
        "(line 120,col 5)-(line 122,col 5)",
        "(line 123,col 5)-(line 123,col 51)",
        "(line 127,col 5)-(line 127,col 23)",
        "(line 129,col 5)-(line 129,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testVersionSpecificRegExpQuirks()",
      "begin_line": 132,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 22)",
        "(line 136,col 5)-(line 136,col 29)",
        "(line 137,col 5)-(line 138,col 41)",
        "(line 139,col 5)-(line 140,col 42)",
        "(line 142,col 5)-(line 142,col 28)",
        "(line 143,col 5)-(line 144,col 27)",
        "(line 147,col 5)-(line 147,col 29)",
        "(line 148,col 5)-(line 148,col 67)",
        "(line 149,col 5)-(line 149,col 65)",
        "(line 151,col 5)-(line 151,col 28)",
        "(line 152,col 5)-(line 152,col 71)",
        "(line 153,col 5)-(line 153,col 59)",
        "(line 154,col 5)-(line 154,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldRegExpConstructorStringCompare()",
      "begin_line": 157,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testContainsUnicodeEscape()",
      "begin_line": 163,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 164,col 77)",
        "(line 165,col 5)-(line 165,col 80)",
        "(line 166,col 5)-(line 167,col 19)",
        "(line 168,col 5)-(line 169,col 20)",
        "(line 170,col 5)-(line 171,col 79)",
        "(line 172,col 5)-(line 173,col 25)",
        "(line 174,col 5)-(line 175,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLiteralObjectConstructors()",
      "begin_line": 178,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 22)",
        "(line 182,col 5)-(line 182,col 39)",
        "(line 183,col 5)-(line 183,col 41)",
        "(line 184,col 5)-(line 184,col 37)",
        "(line 186,col 5)-(line 186,col 23)",
        "(line 188,col 5)-(line 188,col 31)",
        "(line 189,col 5)-(line 189,col 33)",
        "(line 190,col 5)-(line 190,col 29)",
        "(line 192,col 5)-(line 192,col 22)",
        "(line 195,col 5)-(line 196,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldLiteralArrayConstructors()",
      "begin_line": 199,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 200,col 22)",
        "(line 203,col 5)-(line 203,col 36)",
        "(line 204,col 5)-(line 204,col 38)",
        "(line 205,col 5)-(line 205,col 34)",
        "(line 208,col 5)-(line 208,col 39)",
        "(line 209,col 5)-(line 209,col 35)",
        "(line 210,col 5)-(line 210,col 48)",
        "(line 211,col 5)-(line 211,col 44)",
        "(line 214,col 5)-(line 214,col 45)",
        "(line 215,col 5)-(line 215,col 41)",
        "(line 216,col 5)-(line 216,col 45)",
        "(line 217,col 5)-(line 217,col 41)",
        "(line 218,col 5)-(line 218,col 53)",
        "(line 219,col 5)-(line 219,col 49)",
        "(line 222,col 5)-(line 222,col 58)",
        "(line 223,col 5)-(line 223,col 54)",
        "(line 224,col 5)-(line 225,col 48)",
        "(line 226,col 5)-(line 227,col 48)",
        "(line 228,col 5)-(line 228,col 75)",
        "(line 229,col 5)-(line 229,col 71)",
        "(line 230,col 5)-(line 231,col 42)",
        "(line 232,col 5)-(line 233,col 42)",
        "(line 235,col 5)-(line 235,col 23)",
        "(line 237,col 5)-(line 237,col 30)",
        "(line 238,col 5)-(line 238,col 32)",
        "(line 239,col 5)-(line 239,col 28)",
        "(line 241,col 5)-(line 241,col 33)",
        "(line 242,col 5)-(line 242,col 29)",
        "(line 243,col 5)-(line 243,col 37)",
        "(line 244,col 5)-(line 244,col 33)",
        "(line 245,col 5)-(line 245,col 33)",
        "(line 246,col 5)-(line 246,col 29)",
        "(line 247,col 5)-(line 247,col 37)",
        "(line 248,col 5)-(line 248,col 33)",
        "(line 250,col 5)-(line 250,col 42)",
        "(line 251,col 5)-(line 251,col 38)",
        "(line 252,col 5)-(line 252,col 61)",
        "(line 253,col 5)-(line 253,col 57)",
        "(line 254,col 5)-(line 254,col 53)",
        "(line 255,col 5)-(line 255,col 49)",
        "(line 256,col 5)-(line 257,col 63)",
        "(line 258,col 5)-(line 259,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldStandardConstructors()",
      "begin_line": 262,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 263,col 5)-(line 263,col 29)",
        "(line 264,col 5)-(line 264,col 40)",
        "(line 265,col 5)-(line 265,col 38)",
        "(line 266,col 5)-(line 266,col 38)",
        "(line 267,col 5)-(line 267,col 39)",
        "(line 269,col 5)-(line 269,col 22)",
        "(line 271,col 5)-(line 271,col 59)",
        "(line 272,col 5)-(line 272,col 57)",
        "(line 273,col 5)-(line 273,col 61)",
        "(line 274,col 5)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldTrueFalse()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 31)",
        "(line 279,col 5)-(line 279,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testFoldReturnResult()",
      "begin_line": 282,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 283,col 5)-(line 283,col 41)",
        "(line 284,col 5)-(line 284,col 43)",
        "(line 285,col 5)-(line 286,col 33)",
        "(line 287,col 5)-(line 287,col 49)",
        "(line 288,col 5)-(line 289,col 33)",
        "(line 290,col 5)-(line 291,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testUndefined()",
      "begin_line": 294,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 34)",
        "(line 296,col 5)-(line 296,col 67)",
        "(line 297,col 5)-(line 297,col 27)",
        "(line 298,col 5)-(line 298,col 46)",
        "(line 299,col 5)-(line 301,col 61)",
        "(line 302,col 5)-(line 302,col 41)",
        "(line 303,col 5)-(line 303,col 43)",
        "(line 304,col 5)-(line 304,col 41)",
        "(line 305,col 5)-(line 305,col 29)",
        "(line 306,col 5)-(line 306,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSplitCommaExpressions()",
      "begin_line": 309,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 17)",
        "(line 312,col 5)-(line 312,col 40)",
        "(line 313,col 5)-(line 313,col 37)",
        "(line 314,col 5)-(line 314,col 33)",
        "(line 317,col 5)-(line 317,col 26)",
        "(line 319,col 5)-(line 319,col 39)",
        "(line 320,col 5)-(line 320,col 42)",
        "(line 321,col 5)-(line 321,col 61)",
        "(line 322,col 5)-(line 322,col 57)",
        "(line 323,col 5)-(line 323,col 38)",
        "(line 324,col 5)-(line 324,col 27)",
        "(line 325,col 5)-(line 325,col 63)",
        "(line 326,col 5)-(line 326,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma1()",
      "begin_line": 329,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 17)",
        "(line 331,col 5)-(line 331,col 25)",
        "(line 332,col 5)-(line 332,col 16)",
        "(line 333,col 5)-(line 333,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma2()",
      "begin_line": 336,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 17)",
        "(line 338,col 5)-(line 338,col 29)",
        "(line 339,col 5)-(line 339,col 16)",
        "(line 340,col 5)-(line 340,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma3()",
      "begin_line": 343,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 344,col 5)-(line 344,col 17)",
        "(line 345,col 5)-(line 345,col 39)",
        "(line 346,col 5)-(line 346,col 16)",
        "(line 347,col 5)-(line 347,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma4()",
      "begin_line": 350,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 17)",
        "(line 352,col 5)-(line 352,col 32)",
        "(line 353,col 5)-(line 353,col 16)",
        "(line 354,col 5)-(line 354,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testComma5()",
      "begin_line": 357,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 17)",
        "(line 359,col 5)-(line 359,col 37)",
        "(line 360,col 5)-(line 360,col 16)",
        "(line 361,col 5)-(line 361,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testStringArraySplitting()",
      "begin_line": 364,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 40)",
        "(line 366,col 5)-(line 366,col 44)",
        "(line 367,col 5)-(line 368,col 37)",
        "(line 369,col 5)-(line 370,col 44)",
        "(line 371,col 5)-(line 372,col 37)",
        "(line 373,col 5)-(line 374,col 46)",
        "(line 375,col 5)-(line 376,col 44)",
        "(line 377,col 5)-(line 378,col 44)",
        "(line 379,col 5)-(line 380,col 44)",
        "(line 383,col 5)-(line 383,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall1()",
      "begin_line": 386,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 36)",
        "(line 388,col 5)-(line 388,col 44)",
        "(line 389,col 5)-(line 389,col 48)",
        "(line 391,col 5)-(line 391,col 38)",
        "(line 392,col 5)-(line 392,col 47)",
        "(line 393,col 5)-(line 393,col 51)",
        "(line 395,col 5)-(line 395,col 39)",
        "(line 396,col 5)-(line 396,col 42)",
        "(line 397,col 5)-(line 397,col 46)",
        "(line 399,col 5)-(line 399,col 41)",
        "(line 400,col 5)-(line 400,col 45)",
        "(line 401,col 5)-(line 401,col 49)",
        "(line 403,col 5)-(line 403,col 60)",
        "(line 404,col 5)-(line 404,col 67)",
        "(line 405,col 5)-(line 405,col 71)",
        "(line 407,col 5)-(line 407,col 62)",
        "(line 408,col 5)-(line 408,col 70)",
        "(line 409,col 5)-(line 409,col 74)",
        "(line 412,col 5)-(line 412,col 29)",
        "(line 413,col 5)-(line 413,col 30)",
        "(line 414,col 5)-(line 414,col 30)",
        "(line 415,col 5)-(line 415,col 31)",
        "(line 418,col 5)-(line 418,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall2()",
      "begin_line": 421,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 422,col 5)-(line 422,col 36)",
        "(line 423,col 5)-(line 423,col 44)",
        "(line 424,col 5)-(line 424,col 48)",
        "(line 426,col 5)-(line 426,col 38)",
        "(line 427,col 5)-(line 427,col 47)",
        "(line 428,col 5)-(line 428,col 51)",
        "(line 430,col 5)-(line 430,col 39)",
        "(line 431,col 5)-(line 431,col 42)",
        "(line 432,col 5)-(line 432,col 46)",
        "(line 434,col 5)-(line 434,col 41)",
        "(line 435,col 5)-(line 435,col 45)",
        "(line 436,col 5)-(line 436,col 49)",
        "(line 439,col 5)-(line 439,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testBindToCall3()",
      "begin_line": 442,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 449,col 5)-(line 449,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.testSimpleFunctionCall()",
      "begin_line": 452,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 50)",
        "(line 454,col 5)-(line 454,col 60)",
        "(line 455,col 5)-(line 455,col 48)",
        "(line 456,col 5)-(line 456,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StringCompareTestCase",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 459,
      "end_line": 495,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.StringCompareTestCase()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 462,col 7)-(line 462,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 465,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 469,col 58)",
        "(line 470,col 7)-(line 470,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntaxTest.StringCompareTestCase.testBindToCall3()",
      "begin_line": 473,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 474,col 7)-(line 474,col 46)",
        "(line 475,col 7)-(line 475,col 50)",
        "(line 477,col 7)-(line 477,col 48)",
        "(line 478,col 7)-(line 478,col 53)",
        "(line 480,col 7)-(line 480,col 49)",
        "(line 481,col 7)-(line 481,col 52)",
        "(line 483,col 7)-(line 483,col 51)",
        "(line 484,col 7)-(line 484,col 55)",
        "(line 487,col 7)-(line 487,col 31)",
        "(line 488,col 7)-(line 488,col 32)",
        "(line 489,col 7)-(line 489,col 32)",
        "(line 490,col 7)-(line 490,col 33)",
        "(line 493,col 7)-(line 493,col 41)"
      ]
    }
  ]
}