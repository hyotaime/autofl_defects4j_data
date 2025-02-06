{
  "filepath": "/tmp/Closure-171b/test/com/google/javascript/jscomp/PeepholeFoldConstantsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeepholeFoldConstantsTest",
      "is_interface": false,
      "parent_types": [
        "CompilerTestCase"
      ],
      "begin_line": 34,
      "end_line": 1301,
      "comment": "\n * Tests for {@link PeepholeFoldConstants} in isolation. Tests for\n * the interaction of multiple peephole passes are in\n * {@link PeepholeIntegrationTest}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "late"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.PeepholeFoldConstantsTest(boolean)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " TODO(user): Remove this when we no longer need to do string comparison.",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.PeepholeFoldConstantsTest()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 5)-(line 44,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.setUp()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 17)",
        "(line 50,col 5)-(line 50,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.getProcessor(com.google.javascript.jscomp.Compiler)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 56,col 43)",
        "(line 57,col 5)-(line 57,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.getNumRepetitions()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.foldSame(java.lang.String)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.fold(java.lang.String, java.lang.String)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.fold(java.lang.String, java.lang.String, com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.assertResultString(java.lang.String, java.lang.String)",
      "begin_line": 80,
      "end_line": 84,
      "comment": " test that needs tell us where a folding is constructing an invalid AST.",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 76)",
        "(line 83,col 5)-(line 83,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUndefinedComparison1()",
      "begin_line": 86,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 43)",
        "(line 88,col 5)-(line 88,col 38)",
        "(line 89,col 5)-(line 89,col 40)",
        "(line 91,col 5)-(line 91,col 36)",
        "(line 92,col 5)-(line 92,col 36)",
        "(line 93,col 5)-(line 93,col 39)",
        "(line 94,col 5)-(line 94,col 39)",
        "(line 95,col 5)-(line 95,col 40)",
        "(line 97,col 5)-(line 97,col 44)",
        "(line 98,col 5)-(line 98,col 40)",
        "(line 99,col 5)-(line 99,col 41)",
        "(line 101,col 5)-(line 101,col 34)",
        "(line 102,col 5)-(line 102,col 31)",
        "(line 104,col 5)-(line 104,col 44)",
        "(line 105,col 5)-(line 105,col 39)",
        "(line 106,col 5)-(line 106,col 41)",
        "(line 108,col 5)-(line 108,col 35)",
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 38)",
        "(line 111,col 5)-(line 111,col 38)",
        "(line 112,col 5)-(line 112,col 39)",
        "(line 114,col 5)-(line 114,col 45)",
        "(line 115,col 5)-(line 115,col 42)",
        "(line 116,col 5)-(line 116,col 39)",
        "(line 118,col 5)-(line 118,col 34)",
        "(line 119,col 5)-(line 119,col 31)",
        "(line 121,col 5)-(line 121,col 43)",
        "(line 122,col 5)-(line 122,col 43)",
        "(line 123,col 5)-(line 123,col 44)",
        "(line 124,col 5)-(line 124,col 44)",
        "(line 126,col 5)-(line 126,col 35)",
        "(line 127,col 5)-(line 127,col 38)",
        "(line 128,col 5)-(line 128,col 39)",
        "(line 129,col 5)-(line 129,col 39)",
        "(line 131,col 5)-(line 131,col 35)",
        "(line 132,col 5)-(line 132,col 38)",
        "(line 133,col 5)-(line 133,col 39)",
        "(line 134,col 5)-(line 134,col 39)",
        "(line 136,col 5)-(line 136,col 38)",
        "(line 137,col 5)-(line 137,col 36)",
        "(line 138,col 5)-(line 138,col 36)",
        "(line 139,col 5)-(line 139,col 39)",
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 40)",
        "(line 142,col 5)-(line 142,col 40)",
        "(line 143,col 5)-(line 143,col 41)",
        "(line 145,col 5)-(line 145,col 38)",
        "(line 146,col 5)-(line 146,col 38)",
        "(line 147,col 5)-(line 147,col 43)",
        "(line 148,col 5)-(line 148,col 43)",
        "(line 149,col 5)-(line 149,col 44)",
        "(line 150,col 5)-(line 150,col 44)",
        "(line 151,col 5)-(line 151,col 39)",
        "(line 152,col 5)-(line 152,col 39)",
        "(line 153,col 5)-(line 153,col 39)",
        "(line 154,col 5)-(line 154,col 39)",
        "(line 155,col 5)-(line 155,col 41)",
        "(line 156,col 5)-(line 156,col 41)",
        "(line 157,col 5)-(line 157,col 49)",
        "(line 158,col 5)-(line 158,col 49)",
        "(line 160,col 5)-(line 160,col 37)",
        "(line 161,col 5)-(line 161,col 37)",
        "(line 162,col 5)-(line 162,col 42)",
        "(line 163,col 5)-(line 163,col 42)",
        "(line 164,col 5)-(line 164,col 43)",
        "(line 165,col 5)-(line 165,col 43)",
        "(line 166,col 5)-(line 166,col 38)",
        "(line 167,col 5)-(line 167,col 38)",
        "(line 168,col 5)-(line 168,col 38)",
        "(line 169,col 5)-(line 169,col 38)",
        "(line 170,col 5)-(line 170,col 40)",
        "(line 171,col 5)-(line 171,col 40)",
        "(line 172,col 5)-(line 172,col 48)",
        "(line 173,col 5)-(line 173,col 48)",
        "(line 175,col 5)-(line 175,col 34)",
        "(line 176,col 5)-(line 176,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUndefinedComparison2()",
      "begin_line": 179,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 39)",
        "(line 181,col 5)-(line 181,col 40)",
        "(line 183,col 5)-(line 183,col 39)",
        "(line 184,col 5)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUndefinedComparison3()",
      "begin_line": 187,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 42)",
        "(line 189,col 5)-(line 189,col 43)",
        "(line 191,col 5)-(line 191,col 42)",
        "(line 192,col 5)-(line 192,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUndefinedComparison4()",
      "begin_line": 195,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 196,col 33)",
        "(line 197,col 5)-(line 197,col 34)",
        "(line 199,col 5)-(line 199,col 36)",
        "(line 200,col 5)-(line 200,col 37)",
        "(line 202,col 5)-(line 202,col 42)",
        "(line 203,col 5)-(line 203,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testNullComparison1()",
      "begin_line": 206,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 38)",
        "(line 208,col 5)-(line 208,col 33)",
        "(line 209,col 5)-(line 209,col 35)",
        "(line 211,col 5)-(line 211,col 31)",
        "(line 212,col 5)-(line 212,col 31)",
        "(line 213,col 5)-(line 213,col 34)",
        "(line 214,col 5)-(line 214,col 34)",
        "(line 215,col 5)-(line 215,col 35)",
        "(line 217,col 5)-(line 217,col 40)",
        "(line 218,col 5)-(line 218,col 34)",
        "(line 219,col 5)-(line 219,col 37)",
        "(line 221,col 5)-(line 221,col 29)",
        "(line 222,col 5)-(line 222,col 26)",
        "(line 224,col 5)-(line 224,col 39)",
        "(line 225,col 5)-(line 225,col 34)",
        "(line 226,col 5)-(line 226,col 36)",
        "(line 228,col 5)-(line 228,col 30)",
        "(line 229,col 5)-(line 229,col 30)",
        "(line 230,col 5)-(line 230,col 33)",
        "(line 231,col 5)-(line 231,col 33)",
        "(line 232,col 5)-(line 232,col 34)",
        "(line 234,col 5)-(line 234,col 39)",
        "(line 235,col 5)-(line 235,col 36)",
        "(line 236,col 5)-(line 236,col 35)",
        "(line 238,col 5)-(line 238,col 29)",
        "(line 239,col 5)-(line 239,col 26)",
        "(line 241,col 5)-(line 241,col 33)",
        "(line 242,col 5)-(line 242,col 33)",
        "(line 243,col 5)-(line 243,col 33)",
        "(line 244,col 5)-(line 244,col 33)",
        "(line 246,col 5)-(line 246,col 25)",
        "(line 247,col 5)-(line 247,col 32)",
        "(line 248,col 5)-(line 248,col 29)",
        "(line 249,col 5)-(line 249,col 33)",
        "(line 251,col 5)-(line 251,col 25)",
        "(line 252,col 5)-(line 252,col 33)",
        "(line 253,col 5)-(line 253,col 29)",
        "(line 254,col 5)-(line 254,col 33)",
        "(line 256,col 5)-(line 256,col 33)",
        "(line 257,col 5)-(line 257,col 31)",
        "(line 258,col 5)-(line 258,col 31)",
        "(line 259,col 5)-(line 259,col 34)",
        "(line 260,col 5)-(line 260,col 34)",
        "(line 261,col 5)-(line 261,col 35)",
        "(line 262,col 5)-(line 262,col 34)",
        "(line 263,col 5)-(line 263,col 37)",
        "(line 265,col 5)-(line 265,col 33)",
        "(line 266,col 5)-(line 266,col 33)",
        "(line 267,col 5)-(line 267,col 38)",
        "(line 268,col 5)-(line 268,col 38)",
        "(line 269,col 5)-(line 269,col 39)",
        "(line 270,col 5)-(line 270,col 39)",
        "(line 271,col 5)-(line 271,col 34)",
        "(line 272,col 5)-(line 272,col 34)",
        "(line 273,col 5)-(line 273,col 34)",
        "(line 274,col 5)-(line 274,col 34)",
        "(line 275,col 5)-(line 275,col 36)",
        "(line 276,col 5)-(line 276,col 36)",
        "(line 277,col 5)-(line 277,col 44)",
        "(line 278,col 5)-(line 278,col 44)",
        "(line 280,col 5)-(line 280,col 32)",
        "(line 281,col 5)-(line 281,col 32)",
        "(line 282,col 5)-(line 282,col 37)",
        "(line 283,col 5)-(line 283,col 37)",
        "(line 284,col 5)-(line 284,col 38)",
        "(line 285,col 5)-(line 285,col 38)",
        "(line 286,col 5)-(line 286,col 33)",
        "(line 287,col 5)-(line 287,col 33)",
        "(line 288,col 5)-(line 288,col 33)",
        "(line 289,col 5)-(line 289,col 33)",
        "(line 290,col 5)-(line 290,col 35)",
        "(line 291,col 5)-(line 291,col 35)",
        "(line 292,col 5)-(line 292,col 43)",
        "(line 293,col 5)-(line 293,col 43)",
        "(line 295,col 5)-(line 295,col 34)",
        "(line 296,col 5)-(line 296,col 34)",
        "(line 297,col 5)-(line 297,col 32)",
        "(line 298,col 5)-(line 298,col 32)",
        "(line 300,col 5)-(line 300,col 29)",
        "(line 301,col 5)-(line 301,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUnaryOps()",
      "begin_line": 304,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 306,col 5)-(line 306,col 23)",
        "(line 307,col 5)-(line 307,col 23)",
        "(line 308,col 5)-(line 308,col 23)",
        "(line 311,col 5)-(line 311,col 31)",
        "(line 312,col 5)-(line 312,col 29)",
        "(line 313,col 5)-(line 313,col 31)",
        "(line 314,col 5)-(line 314,col 33)",
        "(line 315,col 5)-(line 315,col 27)",
        "(line 316,col 5)-(line 316,col 29)",
        "(line 317,col 5)-(line 317,col 39)",
        "(line 318,col 5)-(line 318,col 28)",
        "(line 319,col 5)-(line 319,col 33)",
        "(line 320,col 5)-(line 320,col 25)",
        "(line 321,col 5)-(line 321,col 27)",
        "(line 322,col 5)-(line 322,col 25)",
        "(line 324,col 5)-(line 324,col 27)",
        "(line 325,col 5)-(line 325,col 26)",
        "(line 326,col 5)-(line 326,col 28)",
        "(line 327,col 5)-(line 327,col 25)",
        "(line 328,col 5)-(line 328,col 21)",
        "(line 329,col 5)-(line 329,col 44)",
        "(line 330,col 5)-(line 330,col 24)",
        "(line 331,col 5)-(line 331,col 38)",
        "(line 332,col 5)-(line 332,col 28)",
        "(line 333,col 5)-(line 333,col 26)",
        "(line 334,col 5)-(line 334,col 26)",
        "(line 336,col 5)-(line 337,col 61)",
        "(line 338,col 5)-(line 339,col 61)",
        "(line 340,col 5)-(line 340,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testUnaryOpsStringCompare()",
      "begin_line": 343,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 39)",
        "(line 346,col 5)-(line 346,col 39)",
        "(line 347,col 5)-(line 347,col 39)",
        "(line 348,col 5)-(line 348,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLogicalOp()",
      "begin_line": 351,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 35)",
        "(line 353,col 5)-(line 353,col 33)",
        "(line 355,col 5)-(line 355,col 40)",
        "(line 356,col 5)-(line 356,col 38)",
        "(line 357,col 5)-(line 357,col 36)",
        "(line 358,col 5)-(line 358,col 32)",
        "(line 359,col 5)-(line 359,col 32)",
        "(line 360,col 5)-(line 360,col 36)",
        "(line 363,col 5)-(line 363,col 39)",
        "(line 364,col 5)-(line 364,col 41)",
        "(line 365,col 5)-(line 365,col 33)",
        "(line 366,col 5)-(line 366,col 41)",
        "(line 367,col 5)-(line 367,col 53)",
        "(line 368,col 5)-(line 368,col 53)",
        "(line 369,col 5)-(line 369,col 51)",
        "(line 370,col 5)-(line 370,col 51)",
        "(line 373,col 5)-(line 373,col 39)",
        "(line 374,col 5)-(line 374,col 38)",
        "(line 376,col 5)-(line 376,col 58)",
        "(line 377,col 5)-(line 377,col 60)",
        "(line 378,col 5)-(line 378,col 59)",
        "(line 379,col 5)-(line 379,col 60)",
        "(line 380,col 5)-(line 380,col 60)",
        "(line 381,col 5)-(line 381,col 59)",
        "(line 382,col 5)-(line 382,col 67)",
        "(line 384,col 5)-(line 384,col 28)",
        "(line 385,col 5)-(line 385,col 44)",
        "(line 388,col 5)-(line 388,col 51)",
        "(line 393,col 5)-(line 393,col 43)",
        "(line 394,col 5)-(line 394,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBitwiseOp()",
      "begin_line": 397,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 398,col 5)-(line 398,col 31)",
        "(line 399,col 5)-(line 399,col 31)",
        "(line 400,col 5)-(line 400,col 31)",
        "(line 401,col 5)-(line 401,col 31)",
        "(line 403,col 5)-(line 403,col 31)",
        "(line 404,col 5)-(line 404,col 31)",
        "(line 405,col 5)-(line 405,col 31)",
        "(line 406,col 5)-(line 406,col 31)",
        "(line 408,col 5)-(line 408,col 31)",
        "(line 409,col 5)-(line 409,col 31)",
        "(line 410,col 5)-(line 410,col 31)",
        "(line 411,col 5)-(line 411,col 31)",
        "(line 413,col 5)-(line 413,col 32)",
        "(line 414,col 5)-(line 414,col 32)",
        "(line 415,col 5)-(line 415,col 31)",
        "(line 416,col 5)-(line 416,col 31)",
        "(line 420,col 5)-(line 420,col 33)",
        "(line 421,col 5)-(line 421,col 33)",
        "(line 422,col 5)-(line 422,col 40)",
        "(line 423,col 5)-(line 423,col 40)",
        "(line 426,col 5)-(line 426,col 31)",
        "(line 427,col 5)-(line 427,col 31)",
        "(line 428,col 5)-(line 428,col 33)",
        "(line 429,col 5)-(line 429,col 28)",
        "(line 430,col 5)-(line 430,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBitwiseOp2()",
      "begin_line": 433,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 434,col 5)-(line 434,col 39)",
        "(line 435,col 5)-(line 435,col 39)",
        "(line 436,col 5)-(line 436,col 39)",
        "(line 437,col 5)-(line 437,col 39)",
        "(line 438,col 5)-(line 438,col 39)",
        "(line 439,col 5)-(line 439,col 39)",
        "(line 441,col 5)-(line 441,col 39)",
        "(line 442,col 5)-(line 442,col 39)",
        "(line 443,col 5)-(line 443,col 39)",
        "(line 444,col 5)-(line 444,col 39)",
        "(line 445,col 5)-(line 445,col 39)",
        "(line 446,col 5)-(line 446,col 39)",
        "(line 448,col 5)-(line 448,col 39)",
        "(line 449,col 5)-(line 449,col 39)",
        "(line 450,col 5)-(line 450,col 39)",
        "(line 451,col 5)-(line 451,col 39)",
        "(line 452,col 5)-(line 452,col 39)",
        "(line 453,col 5)-(line 453,col 39)",
        "(line 455,col 5)-(line 455,col 38)",
        "(line 456,col 5)-(line 456,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldingMixTypesLate()",
      "begin_line": 459,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 460,col 5)-(line 460,col 16)",
        "(line 461,col 5)-(line 461,col 34)",
        "(line 462,col 5)-(line 462,col 40)",
        "(line 463,col 5)-(line 463,col 32)",
        "(line 464,col 5)-(line 464,col 32)",
        "(line 465,col 5)-(line 465,col 32)",
        "(line 466,col 5)-(line 466,col 32)",
        "(line 467,col 5)-(line 467,col 32)",
        "(line 469,col 5)-(line 469,col 33)",
        "(line 470,col 5)-(line 470,col 33)",
        "(line 471,col 5)-(line 471,col 45)",
        "(line 472,col 5)-(line 472,col 41)",
        "(line 473,col 5)-(line 473,col 47)",
        "(line 474,col 5)-(line 474,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldingMixTypesEarly()",
      "begin_line": 477,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 478,col 5)-(line 478,col 17)",
        "(line 479,col 5)-(line 479,col 28)",
        "(line 480,col 5)-(line 480,col 40)",
        "(line 481,col 5)-(line 481,col 37)",
        "(line 482,col 5)-(line 482,col 37)",
        "(line 483,col 5)-(line 483,col 37)",
        "(line 484,col 5)-(line 484,col 37)",
        "(line 485,col 5)-(line 485,col 37)",
        "(line 487,col 5)-(line 487,col 33)",
        "(line 488,col 5)-(line 488,col 33)",
        "(line 489,col 5)-(line 489,col 45)",
        "(line 490,col 5)-(line 490,col 41)",
        "(line 491,col 5)-(line 491,col 47)",
        "(line 492,col 5)-(line 492,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldingAdd()",
      "begin_line": 495,
      "end_line": 498,
      "comment": "",
      "child_ranges": [
        "(line 496,col 5)-(line 496,col 35)",
        "(line 497,col 5)-(line 497,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBitwiseOpStringCompare()",
      "begin_line": 500,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 501,col 5)-(line 501,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBitShifts()",
      "begin_line": 505,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 506,col 5)-(line 506,col 32)",
        "(line 507,col 5)-(line 507,col 34)",
        "(line 508,col 5)-(line 508,col 32)",
        "(line 509,col 5)-(line 509,col 32)",
        "(line 510,col 5)-(line 510,col 34)",
        "(line 512,col 5)-(line 512,col 32)",
        "(line 513,col 5)-(line 513,col 34)",
        "(line 514,col 5)-(line 514,col 32)",
        "(line 515,col 5)-(line 515,col 32)",
        "(line 516,col 5)-(line 516,col 32)",
        "(line 517,col 5)-(line 517,col 35)",
        "(line 518,col 5)-(line 518,col 32)",
        "(line 519,col 5)-(line 519,col 32)",
        "(line 520,col 5)-(line 520,col 33)",
        "(line 521,col 5)-(line 521,col 33)",
        "(line 522,col 5)-(line 522,col 33)",
        "(line 524,col 5)-(line 524,col 34)",
        "(line 525,col 5)-(line 525,col 34)",
        "(line 526,col 5)-(line 526,col 34)",
        "(line 527,col 5)-(line 527,col 43)",
        "(line 528,col 5)-(line 528,col 43)",
        "(line 529,col 5)-(line 529,col 43)",
        "(line 531,col 5)-(line 532,col 61)",
        "(line 533,col 5)-(line 534,col 58)",
        "(line 535,col 5)-(line 536,col 58)",
        "(line 537,col 5)-(line 538,col 60)",
        "(line 539,col 5)-(line 540,col 58)",
        "(line 541,col 5)-(line 542,col 58)",
        "(line 543,col 5)-(line 544,col 58)",
        "(line 545,col 5)-(line 546,col 58)",
        "(line 547,col 5)-(line 548,col 58)",
        "(line 549,col 5)-(line 550,col 58)",
        "(line 551,col 5)-(line 552,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBitShiftsStringCompare()",
      "begin_line": 555,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 5)-(line 557,col 46)",
        "(line 558,col 5)-(line 558,col 48)",
        "(line 559,col 5)-(line 559,col 46)",
        "(line 560,col 5)-(line 560,col 46)",
        "(line 561,col 5)-(line 561,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testStringAdd()",
      "begin_line": 564,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 565,col 5)-(line 565,col 44)",
        "(line 566,col 5)-(line 566,col 38)",
        "(line 567,col 5)-(line 567,col 38)",
        "(line 568,col 5)-(line 568,col 38)",
        "(line 569,col 5)-(line 569,col 49)",
        "(line 570,col 5)-(line 570,col 54)",
        "(line 571,col 5)-(line 571,col 56)",
        "(line 572,col 5)-(line 572,col 77)",
        "(line 573,col 5)-(line 573,col 53)",
        "(line 574,col 5)-(line 574,col 52)",
        "(line 575,col 5)-(line 575,col 42)",
        "(line 576,col 5)-(line 576,col 55)",
        "(line 577,col 5)-(line 577,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testIssue821()",
      "begin_line": 580,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 581,col 5)-(line 581,col 62)",
        "(line 582,col 5)-(line 583,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldConstructor()",
      "begin_line": 586,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 587,col 5)-(line 587,col 55)",
        "(line 588,col 5)-(line 588,col 51)",
        "(line 589,col 5)-(line 589,col 57)",
        "(line 590,col 5)-(line 590,col 55)",
        "(line 591,col 5)-(line 591,col 50)",
        "(line 592,col 5)-(line 592,col 50)",
        "(line 593,col 5)-(line 593,col 46)",
        "(line 594,col 5)-(line 594,col 38)",
        "(line 595,col 5)-(line 595,col 36)",
        "(line 596,col 5)-(line 596,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArithmetic()",
      "begin_line": 599,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 600,col 5)-(line 600,col 34)",
        "(line 601,col 5)-(line 601,col 33)",
        "(line 602,col 5)-(line 602,col 37)",
        "(line 603,col 5)-(line 603,col 35)",
        "(line 604,col 5)-(line 604,col 35)",
        "(line 605,col 5)-(line 605,col 35)",
        "(line 606,col 5)-(line 606,col 31)",
        "(line 607,col 5)-(line 607,col 32)",
        "(line 608,col 5)-(line 608,col 33)",
        "(line 609,col 5)-(line 609,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArithmetic2()",
      "begin_line": 612,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 613,col 5)-(line 613,col 32)",
        "(line 614,col 5)-(line 614,col 30)",
        "(line 615,col 5)-(line 615,col 45)",
        "(line 616,col 5)-(line 616,col 35)",
        "(line 617,col 5)-(line 617,col 35)",
        "(line 618,col 5)-(line 618,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArithmetic3()",
      "begin_line": 621,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 622,col 5)-(line 622,col 44)",
        "(line 623,col 5)-(line 623,col 34)",
        "(line 624,col 5)-(line 624,col 41)",
        "(line 625,col 5)-(line 625,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArithmeticInfinity()",
      "begin_line": 628,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 629,col 5)-(line 629,col 41)",
        "(line 630,col 5)-(line 630,col 39)",
        "(line 631,col 5)-(line 631,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArithmeticStringComp()",
      "begin_line": 634,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 636,col 5)-(line 636,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldComparison()",
      "begin_line": 639,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 640,col 5)-(line 640,col 35)",
        "(line 641,col 5)-(line 641,col 36)",
        "(line 642,col 5)-(line 642,col 44)",
        "(line 643,col 5)-(line 643,col 43)",
        "(line 644,col 5)-(line 644,col 39)",
        "(line 645,col 5)-(line 645,col 51)",
        "(line 647,col 5)-(line 647,col 35)",
        "(line 648,col 5)-(line 648,col 43)",
        "(line 649,col 5)-(line 649,col 40)",
        "(line 651,col 5)-(line 651,col 35)",
        "(line 652,col 5)-(line 652,col 35)",
        "(line 653,col 5)-(line 653,col 37)",
        "(line 654,col 5)-(line 654,col 40)",
        "(line 655,col 5)-(line 655,col 35)",
        "(line 656,col 5)-(line 656,col 35)",
        "(line 657,col 5)-(line 657,col 35)",
        "(line 658,col 5)-(line 658,col 35)",
        "(line 659,col 5)-(line 659,col 36)",
        "(line 660,col 5)-(line 660,col 35)",
        "(line 661,col 5)-(line 661,col 37)",
        "(line 663,col 5)-(line 663,col 41)",
        "(line 664,col 5)-(line 664,col 43)",
        "(line 665,col 5)-(line 665,col 43)",
        "(line 666,col 5)-(line 666,col 43)",
        "(line 667,col 5)-(line 667,col 42)",
        "(line 669,col 5)-(line 669,col 27)",
        "(line 670,col 5)-(line 670,col 28)",
        "(line 671,col 5)-(line 671,col 36)",
        "(line 672,col 5)-(line 672,col 35)",
        "(line 673,col 5)-(line 673,col 31)",
        "(line 674,col 5)-(line 674,col 31)",
        "(line 676,col 5)-(line 676,col 27)",
        "(line 677,col 5)-(line 677,col 35)",
        "(line 678,col 5)-(line 678,col 32)",
        "(line 680,col 5)-(line 680,col 27)",
        "(line 681,col 5)-(line 681,col 27)",
        "(line 682,col 5)-(line 682,col 29)",
        "(line 683,col 5)-(line 683,col 32)",
        "(line 684,col 5)-(line 684,col 23)",
        "(line 685,col 5)-(line 685,col 27)",
        "(line 686,col 5)-(line 686,col 27)",
        "(line 687,col 5)-(line 687,col 27)",
        "(line 688,col 5)-(line 688,col 28)",
        "(line 689,col 5)-(line 689,col 27)",
        "(line 690,col 5)-(line 690,col 29)",
        "(line 692,col 5)-(line 692,col 33)",
        "(line 693,col 5)-(line 693,col 35)",
        "(line 694,col 5)-(line 694,col 35)",
        "(line 695,col 5)-(line 695,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldComparison2()",
      "begin_line": 699,
      "end_line": 742,
      "comment": " \u003d\u003d\u003d, !\u003d\u003d comparison tests",
      "child_ranges": [
        "(line 700,col 5)-(line 700,col 36)",
        "(line 701,col 5)-(line 701,col 37)",
        "(line 702,col 5)-(line 702,col 45)",
        "(line 703,col 5)-(line 703,col 44)",
        "(line 704,col 5)-(line 704,col 40)",
        "(line 705,col 5)-(line 705,col 53)",
        "(line 707,col 5)-(line 707,col 36)",
        "(line 708,col 5)-(line 708,col 44)",
        "(line 709,col 5)-(line 709,col 41)",
        "(line 711,col 5)-(line 711,col 37)",
        "(line 713,col 5)-(line 713,col 42)",
        "(line 714,col 5)-(line 714,col 44)",
        "(line 715,col 5)-(line 715,col 44)",
        "(line 716,col 5)-(line 716,col 44)",
        "(line 717,col 5)-(line 717,col 43)",
        "(line 719,col 5)-(line 719,col 28)",
        "(line 720,col 5)-(line 720,col 29)",
        "(line 721,col 5)-(line 721,col 37)",
        "(line 722,col 5)-(line 722,col 36)",
        "(line 723,col 5)-(line 723,col 32)",
        "(line 724,col 5)-(line 724,col 32)",
        "(line 727,col 5)-(line 727,col 26)",
        "(line 728,col 5)-(line 728,col 27)",
        "(line 729,col 5)-(line 729,col 26)",
        "(line 730,col 5)-(line 730,col 27)",
        "(line 732,col 5)-(line 732,col 28)",
        "(line 733,col 5)-(line 733,col 36)",
        "(line 734,col 5)-(line 734,col 33)",
        "(line 736,col 5)-(line 736,col 24)",
        "(line 738,col 5)-(line 738,col 34)",
        "(line 739,col 5)-(line 739,col 36)",
        "(line 740,col 5)-(line 740,col 36)",
        "(line 741,col 5)-(line 741,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldComparison3()",
      "begin_line": 744,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 745,col 5)-(line 745,col 38)",
        "(line 747,col 5)-(line 747,col 37)",
        "(line 748,col 5)-(line 748,col 37)",
        "(line 749,col 5)-(line 749,col 40)",
        "(line 750,col 5)-(line 750,col 38)",
        "(line 751,col 5)-(line 751,col 40)",
        "(line 753,col 5)-(line 753,col 29)",
        "(line 754,col 5)-(line 754,col 32)",
        "(line 755,col 5)-(line 755,col 30)",
        "(line 756,col 5)-(line 756,col 32)",
        "(line 758,col 5)-(line 758,col 38)",
        "(line 759,col 5)-(line 759,col 38)",
        "(line 760,col 5)-(line 760,col 41)",
        "(line 761,col 5)-(line 761,col 39)",
        "(line 762,col 5)-(line 762,col 41)",
        "(line 764,col 5)-(line 764,col 30)",
        "(line 765,col 5)-(line 765,col 33)",
        "(line 766,col 5)-(line 766,col 31)",
        "(line 767,col 5)-(line 767,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldGetElem()",
      "begin_line": 770,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 771,col 5)-(line 771,col 39)",
        "(line 772,col 5)-(line 772,col 38)",
        "(line 773,col 5)-(line 773,col 38)",
        "(line 775,col 5)-(line 776,col 59)",
        "(line 777,col 5)-(line 778,col 57)",
        "(line 779,col 5)-(line 780,col 57)",
        "(line 782,col 5)-(line 782,col 34)",
        "(line 783,col 5)-(line 783,col 43)",
        "(line 784,col 5)-(line 784,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldComplex()",
      "begin_line": 787,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 788,col 5)-(line 788,col 45)",
        "(line 789,col 5)-(line 789,col 63)",
        "(line 790,col 5)-(line 790,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLeft()",
      "begin_line": 793,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 794,col 5)-(line 794,col 29)",
        "(line 795,col 5)-(line 795,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldArrayLength()",
      "begin_line": 798,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 800,col 5)-(line 800,col 35)",
        "(line 801,col 5)-(line 801,col 40)",
        "(line 802,col 5)-(line 802,col 38)",
        "(line 805,col 5)-(line 805,col 38)",
        "(line 808,col 5)-(line 808,col 58)",
        "(line 809,col 5)-(line 809,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldStringLength()",
      "begin_line": 812,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 814,col 5)-(line 814,col 35)",
        "(line 815,col 5)-(line 815,col 38)",
        "(line 818,col 5)-(line 818,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldTypeof()",
      "begin_line": 821,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 822,col 5)-(line 822,col 43)",
        "(line 823,col 5)-(line 823,col 47)",
        "(line 824,col 5)-(line 824,col 47)",
        "(line 825,col 5)-(line 825,col 48)",
        "(line 826,col 5)-(line 826,col 46)",
        "(line 827,col 5)-(line 827,col 54)",
        "(line 828,col 5)-(line 828,col 51)",
        "(line 829,col 5)-(line 829,col 44)",
        "(line 830,col 5)-(line 830,col 45)",
        "(line 831,col 5)-(line 831,col 48)",
        "(line 832,col 5)-(line 832,col 44)",
        "(line 833,col 5)-(line 833,col 55)",
        "(line 835,col 5)-(line 835,col 38)",
        "(line 836,col 5)-(line 836,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldInstanceOf()",
      "begin_line": 839,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 841,col 5)-(line 841,col 42)",
        "(line 842,col 5)-(line 842,col 42)",
        "(line 843,col 5)-(line 843,col 42)",
        "(line 844,col 5)-(line 844,col 42)",
        "(line 845,col 5)-(line 845,col 44)",
        "(line 846,col 5)-(line 846,col 45)",
        "(line 847,col 5)-(line 847,col 42)",
        "(line 848,col 5)-(line 848,col 43)",
        "(line 849,col 5)-(line 849,col 45)",
        "(line 850,col 5)-(line 850,col 44)",
        "(line 851,col 5)-(line 851,col 49)",
        "(line 852,col 5)-(line 852,col 43)",
        "(line 853,col 5)-(line 853,col 48)",
        "(line 856,col 5)-(line 856,col 41)",
        "(line 857,col 5)-(line 857,col 43)",
        "(line 860,col 5)-(line 860,col 44)",
        "(line 862,col 5)-(line 862,col 34)",
        "(line 863,col 5)-(line 863,col 36)",
        "(line 865,col 5)-(line 865,col 54)",
        "(line 868,col 5)-(line 868,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testDivision()",
      "begin_line": 871,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 873,col 5)-(line 873,col 37)",
        "(line 877,col 5)-(line 877,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testAssignOpsLate()",
      "begin_line": 880,
      "end_line": 899,
      "comment": "",
      "child_ranges": [
        "(line 881,col 5)-(line 881,col 16)",
        "(line 882,col 5)-(line 882,col 26)",
        "(line 883,col 5)-(line 883,col 22)",
        "(line 884,col 5)-(line 884,col 26)",
        "(line 885,col 5)-(line 885,col 26)",
        "(line 886,col 5)-(line 886,col 32)",
        "(line 887,col 5)-(line 887,col 40)",
        "(line 889,col 5)-(line 889,col 26)",
        "(line 890,col 5)-(line 890,col 22)",
        "(line 891,col 5)-(line 891,col 26)",
        "(line 892,col 5)-(line 892,col 26)",
        "(line 893,col 5)-(line 893,col 26)",
        "(line 894,col 5)-(line 894,col 26)",
        "(line 895,col 5)-(line 895,col 32)",
        "(line 896,col 5)-(line 896,col 40)",
        "(line 898,col 5)-(line 898,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testAssignOpsEarly()",
      "begin_line": 901,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 902,col 5)-(line 902,col 17)",
        "(line 903,col 5)-(line 903,col 22)",
        "(line 904,col 5)-(line 904,col 22)",
        "(line 905,col 5)-(line 905,col 22)",
        "(line 906,col 5)-(line 906,col 22)",
        "(line 907,col 5)-(line 907,col 26)",
        "(line 908,col 5)-(line 908,col 40)",
        "(line 910,col 5)-(line 910,col 22)",
        "(line 911,col 5)-(line 911,col 22)",
        "(line 912,col 5)-(line 912,col 22)",
        "(line 913,col 5)-(line 913,col 22)",
        "(line 914,col 5)-(line 914,col 22)",
        "(line 915,col 5)-(line 915,col 22)",
        "(line 916,col 5)-(line 916,col 26)",
        "(line 917,col 5)-(line 917,col 40)",
        "(line 919,col 5)-(line 919,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldAdd1()",
      "begin_line": 922,
      "end_line": 927,
      "comment": "",
      "child_ranges": [
        "(line 923,col 5)-(line 923,col 28)",
        "(line 924,col 5)-(line 924,col 27)",
        "(line 925,col 5)-(line 925,col 28)",
        "(line 926,col 5)-(line 926,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLiteralNames()",
      "begin_line": 929,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 930,col 5)-(line 930,col 27)",
        "(line 931,col 5)-(line 931,col 37)",
        "(line 932,col 5)-(line 932,col 32)",
        "(line 933,col 5)-(line 933,col 38)",
        "(line 934,col 5)-(line 934,col 43)",
        "(line 936,col 5)-(line 936,col 37)",
        "(line 937,col 5)-(line 937,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLiteralsTypeMismatches()",
      "begin_line": 940,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 941,col 5)-(line 941,col 33)",
        "(line 942,col 5)-(line 942,col 35)",
        "(line 943,col 5)-(line 943,col 34)",
        "(line 944,col 5)-(line 944,col 35)",
        "(line 947,col 5)-(line 947,col 33)",
        "(line 948,col 5)-(line 948,col 33)",
        "(line 949,col 5)-(line 949,col 33)",
        "(line 950,col 5)-(line 950,col 33)",
        "(line 952,col 5)-(line 952,col 34)",
        "(line 953,col 5)-(line 953,col 34)",
        "(line 954,col 5)-(line 954,col 34)",
        "(line 955,col 5)-(line 955,col 34)",
        "(line 957,col 5)-(line 957,col 33)",
        "(line 958,col 5)-(line 958,col 34)",
        "(line 959,col 5)-(line 959,col 32)",
        "(line 960,col 5)-(line 960,col 33)",
        "(line 962,col 5)-(line 962,col 34)",
        "(line 963,col 5)-(line 963,col 35)",
        "(line 964,col 5)-(line 964,col 33)",
        "(line 965,col 5)-(line 965,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLeftChildConcat()",
      "begin_line": 968,
      "end_line": 973,
      "comment": "",
      "child_ranges": [
        "(line 969,col 5)-(line 969,col 29)",
        "(line 970,col 5)-(line 970,col 42)",
        "(line 972,col 5)-(line 972,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLeftChildOp()",
      "begin_line": 975,
      "end_line": 1001,
      "comment": "",
      "child_ranges": [
        "(line 976,col 5)-(line 976,col 45)",
        "(line 977,col 5)-(line 977,col 33)",
        "(line 978,col 5)-(line 978,col 33)",
        "(line 979,col 5)-(line 979,col 26)",
        "(line 980,col 5)-(line 980,col 26)",
        "(line 981,col 5)-(line 981,col 30)",
        "(line 982,col 5)-(line 982,col 30)",
        "(line 983,col 5)-(line 983,col 34)",
        "(line 984,col 5)-(line 984,col 23)",
        "(line 985,col 5)-(line 985,col 22)",
        "(line 986,col 5)-(line 986,col 24)",
        "(line 987,col 5)-(line 987,col 26)",
        "(line 988,col 5)-(line 988,col 22)",
        "(line 989,col 5)-(line 989,col 24)",
        "(line 990,col 5)-(line 990,col 26)",
        "(line 992,col 5)-(line 992,col 26)",
        "(line 993,col 5)-(line 993,col 29)",
        "(line 994,col 5)-(line 994,col 26)",
        "(line 995,col 5)-(line 995,col 29)",
        "(line 997,col 5)-(line 997,col 24)",
        "(line 998,col 5)-(line 998,col 22)",
        "(line 999,col 5)-(line 999,col 20)",
        "(line 1000,col 5)-(line 1000,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldSimpleArithmeticOp()",
      "begin_line": 1003,
      "end_line": 1015,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 5)-(line 1004,col 22)",
        "(line 1005,col 5)-(line 1005,col 22)",
        "(line 1006,col 5)-(line 1006,col 23)",
        "(line 1007,col 5)-(line 1007,col 23)",
        "(line 1008,col 5)-(line 1008,col 23)",
        "(line 1009,col 5)-(line 1009,col 22)",
        "(line 1010,col 5)-(line 1010,col 22)",
        "(line 1011,col 5)-(line 1011,col 22)",
        "(line 1012,col 5)-(line 1012,col 26)",
        "(line 1014,col 5)-(line 1014,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldLiteralsAsNumbers()",
      "begin_line": 1017,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 5)-(line 1018,col 26)",
        "(line 1019,col 5)-(line 1019,col 34)",
        "(line 1020,col 5)-(line 1020,col 26)",
        "(line 1021,col 5)-(line 1021,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testNotFoldBackToTrueFalse()",
      "begin_line": 1024,
      "end_line": 1036,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 5)-(line 1025,col 17)",
        "(line 1026,col 5)-(line 1026,col 23)",
        "(line 1027,col 5)-(line 1027,col 24)",
        "(line 1028,col 5)-(line 1028,col 24)",
        "(line 1030,col 5)-(line 1030,col 16)",
        "(line 1031,col 5)-(line 1031,col 19)",
        "(line 1032,col 5)-(line 1032,col 19)",
        "(line 1033,col 5)-(line 1033,col 24)",
        "(line 1034,col 5)-(line 1034,col 22)",
        "(line 1035,col 5)-(line 1035,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldBangConstants()",
      "begin_line": 1038,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 5)-(line 1039,col 24)",
        "(line 1040,col 5)-(line 1040,col 24)",
        "(line 1041,col 5)-(line 1041,col 35)",
        "(line 1042,col 5)-(line 1042,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldMixed()",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 5)-(line 1046,col 26)",
        "(line 1047,col 5)-(line 1047,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldVoid()",
      "begin_line": 1050,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 5)-(line 1051,col 23)",
        "(line 1052,col 5)-(line 1052,col 29)",
        "(line 1053,col 5)-(line 1053,col 29)",
        "(line 1054,col 5)-(line 1054,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testObjectLiteral()",
      "begin_line": 1057,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 5)-(line 1058,col 27)",
        "(line 1059,col 5)-(line 1059,col 30)",
        "(line 1060,col 5)-(line 1060,col 29)",
        "(line 1061,col 5)-(line 1061,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testArrayLiteral()",
      "begin_line": 1064,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 5)-(line 1065,col 27)",
        "(line 1066,col 5)-(line 1066,col 28)",
        "(line 1067,col 5)-(line 1067,col 28)",
        "(line 1068,col 5)-(line 1068,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testIssue601()",
      "begin_line": 1071,
      "end_line": 1075,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 5)-(line 1072,col 29)",
        "(line 1073,col 5)-(line 1073,col 29)",
        "(line 1074,col 5)-(line 1074,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldObjectLiteralRef1()",
      "begin_line": 1077,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1079,col 5)-(line 1079,col 46)",
        "(line 1080,col 5)-(line 1080,col 42)",
        "(line 1081,col 5)-(line 1081,col 58)",
        "(line 1084,col 5)-(line 1084,col 30)",
        "(line 1085,col 5)-(line 1085,col 48)",
        "(line 1086,col 5)-(line 1086,col 29)",
        "(line 1087,col 5)-(line 1087,col 29)",
        "(line 1090,col 5)-(line 1090,col 48)",
        "(line 1091,col 5)-(line 1091,col 44)",
        "(line 1092,col 5)-(line 1092,col 45)",
        "(line 1095,col 5)-(line 1095,col 23)",
        "(line 1098,col 5)-(line 1098,col 23)",
        "(line 1099,col 5)-(line 1099,col 34)",
        "(line 1101,col 5)-(line 1101,col 39)",
        "(line 1104,col 5)-(line 1104,col 50)",
        "(line 1106,col 5)-(line 1106,col 62)",
        "(line 1109,col 5)-(line 1110,col 41)",
        "(line 1112,col 5)-(line 1112,col 43)",
        "(line 1113,col 5)-(line 1113,col 48)",
        "(line 1114,col 5)-(line 1114,col 56)",
        "(line 1115,col 5)-(line 1115,col 51)",
        "(line 1117,col 5)-(line 1118,col 39)",
        "(line 1121,col 5)-(line 1121,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testFoldObjectLiteralRef2()",
      "begin_line": 1124,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 5)-(line 1125,col 17)",
        "(line 1126,col 5)-(line 1126,col 48)",
        "(line 1127,col 5)-(line 1127,col 16)",
        "(line 1128,col 5)-(line 1128,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testIEString()",
      "begin_line": 1131,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 5)-(line 1132,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testIssue522()",
      "begin_line": 1135,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 5)-(line 1136,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LITERAL_OPERANDS"
      ],
      "begin_line": 1139,
      "end_line": 1163,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testInvertibleOperators()",
      "begin_line": 1165,
      "end_line": 1211,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 5)-(line 1175,col 17)",
        "(line 1176,col 5)-(line 1176,col 68)",
        "(line 1177,col 5)-(line 1177,col 58)",
        "(line 1178,col 5)-(line 1178,col 71)",
        "(line 1179,col 5)-(line 1179,col 69)",
        "(line 1180,col 5)-(line 1210,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testCommutativeOperators()",
      "begin_line": 1213,
      "end_line": 1240,
      "comment": "",
      "child_ranges": [
        "(line 1214,col 5)-(line 1214,col 16)",
        "(line 1215,col 5)-(line 1224,col 17)",
        "(line 1225,col 5)-(line 1239,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.testConvertToNumberNegativeInf()",
      "begin_line": 1242,
      "end_line": 1244,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 5)-(line 1243,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.join(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1246,
      "end_line": 1248,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 5)-(line 1247,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.assertSameResultsOrUncollapsed(java.lang.String, java.lang.String)",
      "begin_line": 1250,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 5)-(line 1251,col 36)",
        "(line 1252,col 5)-(line 1257,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.assertSameResults(java.lang.String, java.lang.String)",
      "begin_line": 1260,
      "end_line": 1265,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 5)-(line 1264,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.assertNotSameResults(java.lang.String, java.lang.String)",
      "begin_line": 1267,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1268,col 5)-(line 1271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.process(java.lang.String)",
      "begin_line": 1274,
      "end_line": 1276,
      "comment": "",
      "child_ranges": [
        "(line 1275,col 5)-(line 1275,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.print(java.lang.String)",
      "begin_line": 1278,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1279,col 5)-(line 1279,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.PeepholeFoldConstantsTest.printHelper(java.lang.String, boolean)",
      "begin_line": 1282,
      "end_line": 1300,
      "comment": "",
      "child_ranges": [
        "(line 1283,col 5)-(line 1283,col 41)",
        "(line 1284,col 5)-(line 1284,col 43)",
        "(line 1285,col 5)-(line 1288,col 17)",
        "(line 1289,col 5)-(line 1289,col 39)",
        "(line 1290,col 5)-(line 1293,col 22)",
        "(line 1294,col 5)-(line 1294,col 44)",
        "(line 1295,col 5)-(line 1295,col 42)",
        "(line 1296,col 5)-(line 1298,col 5)",
        "(line 1299,col 5)-(line 1299,col 39)"
      ]
    }
  ]
}