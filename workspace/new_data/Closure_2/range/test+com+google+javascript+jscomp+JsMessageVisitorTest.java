{
  "filepath": "/tmp/Closure-2b/test/com/google/javascript/jscomp/JsMessageVisitorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JsMessageVisitorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 586,
      "comment": "\n * Test for {@link JsMessageVisitor}.\n *\n * @author anatol@google.com (Anatol Pomazau)\n "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "messages"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowLegacyMessages"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.setUp()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 5)-(line 46,col 37)",
        "(line 47,col 5)-(line 47,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testJsMessageOnVar()",
      "begin_line": 50,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 51,col 5)-(line 52,col 63)",
        "(line 53,col 5)-(line 53,col 48)",
        "(line 54,col 5)-(line 54,col 37)",
        "(line 56,col 5)-(line 56,col 36)",
        "(line 57,col 5)-(line 57,col 44)",
        "(line 58,col 5)-(line 58,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testJsMessageOnProperty()",
      "begin_line": 61,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 62,col 5)-(line 63,col 63)",
        "(line 64,col 5)-(line 64,col 48)",
        "(line 65,col 5)-(line 65,col 37)",
        "(line 67,col 5)-(line 67,col 36)",
        "(line 68,col 5)-(line 68,col 58)",
        "(line 69,col 5)-(line 69,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testOrphanedJsMessage()",
      "begin_line": 72,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 46)",
        "(line 74,col 5)-(line 74,col 48)",
        "(line 75,col 5)-(line 75,col 37)",
        "(line 77,col 5)-(line 77,col 45)",
        "(line 78,col 5)-(line 78,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testMessageWithoutDescription()",
      "begin_line": 81,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 62)",
        "(line 83,col 5)-(line 83,col 48)",
        "(line 84,col 5)-(line 84,col 37)",
        "(line 86,col 5)-(line 86,col 36)",
        "(line 87,col 5)-(line 87,col 44)",
        "(line 89,col 5)-(line 90,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIncorrectMessageReporting()",
      "begin_line": 93,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 64)",
        "(line 95,col 5)-(line 95,col 46)",
        "(line 96,col 5)-(line 96,col 48)",
        "(line 97,col 5)-(line 97,col 37)",
        "(line 99,col 5)-(line 99,col 58)",
        "(line 100,col 5)-(line 101,col 39)",
        "(line 102,col 5)-(line 104,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testEmptyMessage()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 49)",
        "(line 111,col 5)-(line 111,col 37)",
        "(line 112,col 5)-(line 112,col 36)",
        "(line 113,col 5)-(line 113,col 44)",
        "(line 114,col 5)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testConcatOfStrings()",
      "begin_line": 117,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 74)",
        "(line 120,col 5)-(line 120,col 37)",
        "(line 121,col 5)-(line 121,col 36)",
        "(line 122,col 5)-(line 122,col 47)",
        "(line 123,col 5)-(line 123,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testLegacyFormatDescription()",
      "begin_line": 126,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 127,col 5)-(line 128,col 47)",
        "(line 130,col 5)-(line 130,col 37)",
        "(line 131,col 5)-(line 131,col 36)",
        "(line 132,col 5)-(line 132,col 44)",
        "(line 133,col 5)-(line 133,col 45)",
        "(line 134,col 5)-(line 134,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testLegacyFormatParametizedFunction()",
      "begin_line": 137,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 140,col 16)",
        "(line 142,col 5)-(line 142,col 37)",
        "(line 143,col 5)-(line 143,col 36)",
        "(line 144,col 5)-(line 144,col 44)",
        "(line 145,col 5)-(line 145,col 38)",
        "(line 146,col 5)-(line 146,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testLegacyMessageWithDescAnnotation()",
      "begin_line": 149,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 153,col 67)",
        "(line 155,col 5)-(line 155,col 37)",
        "(line 156,col 5)-(line 156,col 48)",
        "(line 157,col 5)-(line 157,col 36)",
        "(line 158,col 5)-(line 158,col 40)",
        "(line 159,col 5)-(line 159,col 48)",
        "(line 160,col 5)-(line 160,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testLegacyMessageWithDescAnnotationAndHelpVar()",
      "begin_line": 163,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 168,col 75)",
        "(line 170,col 5)-(line 170,col 37)",
        "(line 171,col 5)-(line 171,col 48)",
        "(line 172,col 5)-(line 172,col 36)",
        "(line 173,col 5)-(line 173,col 40)",
        "(line 174,col 5)-(line 174,col 48)",
        "(line 175,col 5)-(line 175,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testClosureMessageWithHelpPostfix()",
      "begin_line": 178,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 179,col 5)-(line 180,col 54)",
        "(line 182,col 5)-(line 182,col 37)",
        "(line 183,col 5)-(line 183,col 36)",
        "(line 184,col 5)-(line 184,col 47)",
        "(line 185,col 5)-(line 185,col 45)",
        "(line 186,col 5)-(line 186,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testClosureMessageWithoutGoogGetmsg()",
      "begin_line": 189,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 190,col 32)",
        "(line 192,col 5)-(line 192,col 64)",
        "(line 194,col 5)-(line 194,col 37)",
        "(line 195,col 5)-(line 195,col 49)",
        "(line 196,col 5)-(line 196,col 44)",
        "(line 197,col 5)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testClosureFormatParametizedFunction()",
      "begin_line": 201,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 202,col 5)-(line 204,col 38)",
        "(line 206,col 5)-(line 206,col 37)",
        "(line 207,col 5)-(line 207,col 36)",
        "(line 208,col 5)-(line 208,col 44)",
        "(line 209,col 5)-(line 209,col 45)",
        "(line 210,col 5)-(line 210,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testHugeMessage()",
      "begin_line": 213,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 214,col 5)-(line 233,col 59)",
        "(line 235,col 5)-(line 235,col 37)",
        "(line 236,col 5)-(line 236,col 36)",
        "(line 237,col 5)-(line 237,col 43)",
        "(line 238,col 5)-(line 238,col 65)",
        "(line 239,col 5)-(line 239,col 31)",
        "(line 240,col 5)-(line 242,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testUnnamedGoogleMessage()",
      "begin_line": 245,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 71)",
        "(line 248,col 5)-(line 248,col 37)",
        "(line 249,col 5)-(line 249,col 36)",
        "(line 250,col 5)-(line 250,col 38)",
        "(line 251,col 5)-(line 251,col 52)",
        "(line 252,col 5)-(line 252,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testEmptyTextMessage()",
      "begin_line": 255,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 256,col 5)-(line 256,col 78)",
        "(line 258,col 5)-(line 258,col 37)",
        "(line 259,col 5)-(line 259,col 48)",
        "(line 260,col 5)-(line 262,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testEmptyTextComplexMessage()",
      "begin_line": 265,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 266,col 5)-(line 267,col 42)",
        "(line 269,col 5)-(line 269,col 37)",
        "(line 270,col 5)-(line 270,col 48)",
        "(line 271,col 5)-(line 273,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testMessageIsNoUnnamed()",
      "begin_line": 276,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 74)",
        "(line 279,col 5)-(line 279,col 37)",
        "(line 280,col 5)-(line 280,col 36)",
        "(line 281,col 5)-(line 281,col 51)",
        "(line 282,col 5)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testMsgVarWithoutAssignment()",
      "begin_line": 285,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 38)",
        "(line 288,col 5)-(line 288,col 49)",
        "(line 289,col 5)-(line 289,col 44)",
        "(line 290,col 5)-(line 290,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testRegularVarWithoutAssignment()",
      "begin_line": 293,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 40)",
        "(line 296,col 5)-(line 296,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.itIsNotImplementedYet_testMsgPropertyWithoutAssignment()",
      "begin_line": 299,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 52)",
        "(line 302,col 5)-(line 302,col 49)",
        "(line 303,col 5)-(line 303,col 44)",
        "(line 304,col 5)-(line 304,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testMsgVarWithIncorrectRightSide()",
      "begin_line": 307,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 42)",
        "(line 310,col 5)-(line 310,col 49)",
        "(line 311,col 5)-(line 311,col 44)",
        "(line 312,col 5)-(line 313,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIncorrectMessage()",
      "begin_line": 316,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 317,col 5)-(line 317,col 62)",
        "(line 319,col 5)-(line 319,col 37)",
        "(line 320,col 5)-(line 320,col 49)",
        "(line 321,col 5)-(line 321,col 44)",
        "(line 322,col 5)-(line 324,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testUnrecognizedFunction()",
      "begin_line": 327,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 328,col 5)-(line 328,col 32)",
        "(line 329,col 5)-(line 329,col 72)",
        "(line 331,col 5)-(line 331,col 37)",
        "(line 332,col 5)-(line 332,col 49)",
        "(line 333,col 5)-(line 333,col 44)",
        "(line 334,col 5)-(line 337,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testExtractPropertyMessage()",
      "begin_line": 340,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 341,col 5)-(line 347,col 56)",
        "(line 349,col 5)-(line 349,col 37)",
        "(line 350,col 5)-(line 350,col 36)",
        "(line 351,col 5)-(line 351,col 44)",
        "(line 352,col 5)-(line 352,col 61)",
        "(line 353,col 5)-(line 353,col 76)",
        "(line 354,col 5)-(line 354,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testAlmostButNotExternalMessage()",
      "begin_line": 357,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 359,col 77)",
        "(line 360,col 5)-(line 360,col 48)",
        "(line 361,col 5)-(line 361,col 37)",
        "(line 362,col 5)-(line 362,col 46)",
        "(line 363,col 5)-(line 363,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testExternalMessage()",
      "begin_line": 366,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 80)",
        "(line 368,col 5)-(line 368,col 48)",
        "(line 369,col 5)-(line 369,col 37)",
        "(line 370,col 5)-(line 370,col 45)",
        "(line 371,col 5)-(line 371,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIsValidMessageNameStrict()",
      "begin_line": 374,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 59)",
        "(line 377,col 5)-(line 377,col 57)",
        "(line 378,col 5)-(line 378,col 52)",
        "(line 379,col 5)-(line 379,col 56)",
        "(line 380,col 5)-(line 380,col 60)",
        "(line 382,col 5)-(line 382,col 58)",
        "(line 383,col 5)-(line 383,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIsValidMessageNameRelax()",
      "begin_line": 386,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 57)",
        "(line 389,col 5)-(line 389,col 58)",
        "(line 390,col 5)-(line 390,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIsValidMessageNameLegacy()",
      "begin_line": 393,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 394,col 5)-(line 394,col 58)",
        "(line 395,col 5)-(line 395,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.theseAreLegacyMessageNames(com.google.javascript.jscomp.JsMessageVisitor)",
      "begin_line": 398,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 399,col 5)-(line 399,col 58)",
        "(line 400,col 5)-(line 400,col 53)",
        "(line 402,col 5)-(line 402,col 58)",
        "(line 403,col 5)-(line 403,col 62)",
        "(line 404,col 5)-(line 404,col 59)",
        "(line 405,col 5)-(line 405,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testUnexistedPlaceholders()",
      "begin_line": 408,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 409,col 5)-(line 409,col 65)",
        "(line 411,col 5)-(line 411,col 37)",
        "(line 412,col 5)-(line 412,col 44)",
        "(line 413,col 5)-(line 413,col 35)",
        "(line 414,col 5)-(line 414,col 30)",
        "(line 415,col 5)-(line 415,col 75)",
        "(line 416,col 5)-(line 417,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testUnusedReferenesAreNotOK()",
      "begin_line": 420,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 421,col 5)-(line 422,col 60)",
        "(line 423,col 5)-(line 423,col 37)",
        "(line 424,col 5)-(line 424,col 44)",
        "(line 425,col 5)-(line 425,col 35)",
        "(line 426,col 5)-(line 426,col 30)",
        "(line 427,col 5)-(line 427,col 75)",
        "(line 428,col 5)-(line 429,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testDuplicatePlaceHoldersAreBad()",
      "begin_line": 432,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 433,col 5)-(line 434,col 48)",
        "(line 436,col 5)-(line 436,col 37)",
        "(line 437,col 5)-(line 437,col 44)",
        "(line 438,col 5)-(line 438,col 35)",
        "(line 439,col 5)-(line 439,col 30)",
        "(line 440,col 5)-(line 440,col 75)",
        "(line 441,col 5)-(line 442,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testDuplicatePlaceholderReferencesAreOk()",
      "begin_line": 445,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 446,col 5)-(line 447,col 45)",
        "(line 449,col 5)-(line 449,col 37)",
        "(line 450,col 5)-(line 450,col 36)",
        "(line 451,col 5)-(line 451,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testCamelcasePlaceholderNamesAreOk()",
      "begin_line": 454,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 455,col 5)-(line 456,col 71)",
        "(line 458,col 5)-(line 458,col 37)",
        "(line 459,col 5)-(line 459,col 36)",
        "(line 460,col 5)-(line 460,col 53)",
        "(line 461,col 5)-(line 461,col 58)",
        "(line 462,col 5)-(line 462,col 43)",
        "(line 463,col 5)-(line 463,col 34)",
        "(line 464,col 5)-(line 465,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testWithNonCamelcasePlaceholderNamesAreNotOk()",
      "begin_line": 468,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 469,col 5)-(line 470,col 73)",
        "(line 472,col 5)-(line 472,col 37)",
        "(line 473,col 5)-(line 473,col 44)",
        "(line 474,col 5)-(line 474,col 35)",
        "(line 475,col 5)-(line 475,col 30)",
        "(line 476,col 5)-(line 476,col 75)",
        "(line 477,col 5)-(line 478,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testUnquotedPlaceholdersAreOk()",
      "begin_line": 481,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 482,col 5)-(line 483,col 76)",
        "(line 485,col 5)-(line 485,col 37)",
        "(line 486,col 5)-(line 486,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testIsLowerCamelCaseWithNumericSuffixes()",
      "begin_line": 489,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 490,col 5)-(line 490,col 60)",
        "(line 491,col 5)-(line 491,col 61)",
        "(line 492,col 5)-(line 492,col 61)",
        "(line 494,col 5)-(line 494,col 64)",
        "(line 495,col 5)-(line 495,col 66)",
        "(line 497,col 5)-(line 497,col 70)",
        "(line 498,col 5)-(line 498,col 72)",
        "(line 499,col 5)-(line 499,col 72)",
        "(line 501,col 5)-(line 501,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testToLowerCamelCaseWithNumericSuffixes()",
      "begin_line": 504,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 505,col 5)-(line 505,col 70)",
        "(line 506,col 5)-(line 506,col 79)",
        "(line 507,col 5)-(line 508,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testDuplicateMessageError()",
      "begin_line": 511,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 514,col 80)",
        "(line 516,col 5)-(line 516,col 48)",
        "(line 517,col 5)-(line 517,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testNoDuplicateErrorOnExternMessage()",
      "begin_line": 520,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 521,col 5)-(line 525,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.testErrorWhenUsingMsgPrefixWithFallback()",
      "begin_line": 528,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 529,col 5)-(line 533,col 80)",
        "(line 534,col 5)-(line 534,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.assertOneError(com.google.javascript.jscomp.DiagnosticType)",
      "begin_line": 537,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 63)",
        "(line 539,col 5)-(line 540,col 37)",
        "(line 541,col 5)-(line 541,col 44)",
        "(line 542,col 5)-(line 542,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.extractMessagesSafely(java.lang.String)",
      "begin_line": 545,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 546,col 5)-(line 546,col 27)",
        "(line 547,col 5)-(line 547,col 44)",
        "(line 548,col 5)-(line 550,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.extractMessages(java.lang.String)",
      "begin_line": 553,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 554,col 5)-(line 554,col 30)",
        "(line 555,col 5)-(line 555,col 46)",
        "(line 556,col 5)-(line 556,col 61)",
        "(line 557,col 5)-(line 557,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectMessages",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessageVisitor"
      ],
      "begin_line": 560,
      "end_line": 572,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.CollectMessages.CollectMessages(com.google.javascript.jscomp.Compiler)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 563,col 7)-(line 564,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.CollectMessages.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 567,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 7)-(line 570,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyJsVisitor",
      "is_interface": false,
      "parent_types": [
        "com.google.javascript.jscomp.JsMessageVisitor"
      ],
      "begin_line": 574,
      "end_line": 585,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.DummyJsVisitor.DummyJsVisitor(com.google.javascript.jscomp.JsMessage.Style)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 7)-(line 577,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "com.google.javascript.jscomp.JsMessageVisitorTest.DummyJsVisitor.processJsMessage(com.google.javascript.jscomp.JsMessage, com.google.javascript.jscomp.JsMessageDefinition)",
      "begin_line": 580,
      "end_line": 584,
      "comment": "",
      "child_ranges": []
    }
  ]
}