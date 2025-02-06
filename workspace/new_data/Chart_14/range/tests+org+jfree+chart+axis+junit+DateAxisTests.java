{
  "filepath": "/tmp/Chart-14b/tests/org/jfree/chart/axis/junit/DateAxisTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateAxisTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 82,
      "end_line": 1139,
      "comment": "\n * Tests for the {@link DateAxis} class.\n "
    },
    {
      "type": "class_interface",
      "name": "MyDateAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.DateAxis"
      ],
      "begin_line": 84,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.MyDateAxis.MyDateAxis(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n         * Creates a new instance.\n         * \n         * @param label  the label.\n         ",
      "child_ranges": [
        "(line 92,col 13)-(line 92,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.MyDateAxis.previousStandardDate(java.util.Date, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.suite()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.DateAxisTests(java.lang.String)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testEquals()",
      "begin_line": 121,
      "end_line": 153,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 43)",
        "(line 124,col 9)-(line 124,col 43)",
        "(line 125,col 9)-(line 125,col 34)",
        "(line 126,col 9)-(line 126,col 37)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 130,col 9)-(line 130,col 62)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 62)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 136,col 9)-(line 136,col 63)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 138,col 9)-(line 138,col 63)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 142,col 9)-(line 142,col 57)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 57)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 148,col 9)-(line 148,col 75)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 151,col 9)-(line 151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.test1472942()",
      "begin_line": 159,
      "end_line": 169,
      "comment": "\n     * A test for bug report 1472942.  The DateFormat.equals() method is not\n     * checking the range attribute.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 43)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 162,col 34)",
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 35)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testHashCode()",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode. \n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 43)",
        "(line 176,col 9)-(line 176,col 43)",
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testCloning()",
      "begin_line": 186,
      "end_line": 198,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 43)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 29)",
        "(line 196,col 9)-(line 196,col 51)",
        "(line 197,col 9)-(line 197,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testSetRange()",
      "begin_line": 203,
      "end_line": 217,
      "comment": "\n     * Test that the setRange() method works.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 50)",
        "(line 206,col 9)-(line 206,col 51)",
        "(line 207,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 209,col 49)",
        "(line 210,col 9)-(line 210,col 37)",
        "(line 211,col 9)-(line 211,col 30)",
        "(line 213,col 9)-(line 213,col 54)",
        "(line 214,col 9)-(line 214,col 47)",
        "(line 215,col 9)-(line 215,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testSetMaximumDate()",
      "begin_line": 222,
      "end_line": 237,
      "comment": "\n     * Test that the setMaximumDate() method works.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 50)",
        "(line 224,col 9)-(line 224,col 31)",
        "(line 225,col 9)-(line 225,col 34)",
        "(line 226,col 9)-(line 226,col 50)",
        "(line 230,col 9)-(line 230,col 29)",
        "(line 231,col 9)-(line 231,col 45)",
        "(line 232,col 9)-(line 232,col 45)",
        "(line 233,col 9)-(line 233,col 32)",
        "(line 234,col 9)-(line 234,col 32)",
        "(line 235,col 9)-(line 235,col 32)",
        "(line 236,col 9)-(line 236,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testSetMinimumDate()",
      "begin_line": 242,
      "end_line": 255,
      "comment": "\n     * Test that the setMinimumDate() method works.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 50)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 32)",
        "(line 247,col 9)-(line 247,col 32)",
        "(line 248,col 9)-(line 248,col 48)",
        "(line 252,col 9)-(line 252,col 45)",
        "(line 253,col 9)-(line 253,col 32)",
        "(line 254,col 9)-(line 254,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.same(double, double, double)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Tests two doubles for \u0027near enough\u0027 equality.\n     * \n     * @param d1  number 1.\n     * @param d2  number 2.\n     * @param tolerance  maximum tolerance.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testJava2DToValue()",
      "begin_line": 273,
      "end_line": 294,
      "comment": "\n     * Test the translation of Java2D values to data values.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 39)",
        "(line 275,col 9)-(line 275,col 35)",
        "(line 276,col 9)-(line 276,col 80)",
        "(line 277,col 9)-(line 277,col 75)",
        "(line 278,col 9)-(line 278,col 46)",
        "(line 279,col 9)-(line 279,col 76)",
        "(line 280,col 9)-(line 280,col 46)",
        "(line 281,col 9)-(line 281,col 74)",
        "(line 282,col 9)-(line 282,col 42)",
        "(line 283,col 9)-(line 283,col 77)",
        "(line 284,col 9)-(line 284,col 42)",
        "(line 285,col 9)-(line 285,col 31)",
        "(line 286,col 9)-(line 286,col 75)",
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 288,col 76)",
        "(line 289,col 9)-(line 289,col 46)",
        "(line 290,col 9)-(line 290,col 74)",
        "(line 291,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 77)",
        "(line 293,col 9)-(line 293,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testSerialization()",
      "begin_line": 299,
      "end_line": 321,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 27)",
        "(line 304,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 34)",
        "(line 319,col 9)-(line 319,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateYearA()",
      "begin_line": 327,
      "end_line": 394,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 year.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 49)",
        "(line 329,col 9)-(line 329,col 36)",
        "(line 330,col 9)-(line 330,col 36)",
        "(line 333,col 9)-(line 333,col 56)",
        "(line 334,col 9)-(line 334,col 63)",
        "(line 335,col 9)-(line 335,col 57)",
        "(line 336,col 9)-(line 336,col 64)",
        "(line 337,col 9)-(line 337,col 55)",
        "(line 339,col 9)-(line 339,col 56)",
        "(line 341,col 9)-(line 341,col 67)",
        "(line 342,col 9)-(line 342,col 31)",
        "(line 345,col 9)-(line 345,col 61)",
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 348,col 55)",
        "(line 349,col 9)-(line 349,col 39)",
        "(line 350,col 9)-(line 350,col 49)",
        "(line 351,col 9)-(line 351,col 50)",
        "(line 353,col 9)-(line 353,col 31)",
        "(line 354,col 9)-(line 354,col 50)",
        "(line 355,col 9)-(line 355,col 34)",
        "(line 356,col 9)-(line 356,col 49)",
        "(line 357,col 9)-(line 357,col 50)",
        "(line 360,col 9)-(line 360,col 62)",
        "(line 362,col 9)-(line 362,col 31)",
        "(line 363,col 9)-(line 363,col 50)",
        "(line 364,col 9)-(line 364,col 34)",
        "(line 365,col 9)-(line 365,col 49)",
        "(line 366,col 9)-(line 366,col 50)",
        "(line 368,col 9)-(line 368,col 31)",
        "(line 369,col 9)-(line 369,col 50)",
        "(line 370,col 9)-(line 370,col 34)",
        "(line 371,col 9)-(line 371,col 49)",
        "(line 372,col 9)-(line 372,col 50)",
        "(line 374,col 9)-(line 374,col 31)",
        "(line 375,col 9)-(line 375,col 50)",
        "(line 376,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 377,col 49)",
        "(line 378,col 9)-(line 378,col 50)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 383,col 9)-(line 383,col 31)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 385,col 9)-(line 385,col 34)",
        "(line 386,col 9)-(line 386,col 49)",
        "(line 387,col 9)-(line 387,col 50)",
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 390,col 50)",
        "(line 391,col 9)-(line 391,col 34)",
        "(line 392,col 9)-(line 392,col 49)",
        "(line 393,col 9)-(line 393,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateYearB()",
      "begin_line": 400,
      "end_line": 467,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 10 years (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 49)",
        "(line 402,col 9)-(line 402,col 36)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 406,col 9)-(line 406,col 56)",
        "(line 407,col 9)-(line 407,col 63)",
        "(line 408,col 9)-(line 408,col 57)",
        "(line 409,col 9)-(line 409,col 64)",
        "(line 410,col 9)-(line 410,col 55)",
        "(line 412,col 9)-(line 412,col 56)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 415,col 31)",
        "(line 418,col 9)-(line 418,col 61)",
        "(line 420,col 9)-(line 420,col 31)",
        "(line 421,col 9)-(line 421,col 55)",
        "(line 422,col 9)-(line 422,col 39)",
        "(line 423,col 9)-(line 423,col 49)",
        "(line 424,col 9)-(line 424,col 50)",
        "(line 426,col 9)-(line 426,col 31)",
        "(line 427,col 9)-(line 427,col 50)",
        "(line 428,col 9)-(line 428,col 34)",
        "(line 429,col 9)-(line 429,col 49)",
        "(line 430,col 9)-(line 430,col 50)",
        "(line 433,col 9)-(line 433,col 62)",
        "(line 435,col 9)-(line 435,col 31)",
        "(line 436,col 9)-(line 436,col 50)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 438,col 49)",
        "(line 439,col 9)-(line 439,col 50)",
        "(line 441,col 9)-(line 441,col 31)",
        "(line 442,col 9)-(line 442,col 50)",
        "(line 443,col 9)-(line 443,col 34)",
        "(line 444,col 9)-(line 444,col 49)",
        "(line 445,col 9)-(line 445,col 50)",
        "(line 447,col 9)-(line 447,col 31)",
        "(line 448,col 9)-(line 448,col 50)",
        "(line 449,col 9)-(line 449,col 34)",
        "(line 450,col 9)-(line 450,col 49)",
        "(line 451,col 9)-(line 451,col 50)",
        "(line 454,col 9)-(line 454,col 59)",
        "(line 456,col 9)-(line 456,col 31)",
        "(line 457,col 9)-(line 457,col 50)",
        "(line 458,col 9)-(line 458,col 34)",
        "(line 459,col 9)-(line 459,col 49)",
        "(line 460,col 9)-(line 460,col 50)",
        "(line 462,col 9)-(line 462,col 31)",
        "(line 463,col 9)-(line 463,col 50)",
        "(line 464,col 9)-(line 464,col 34)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateMonthA()",
      "begin_line": 473,
      "end_line": 540,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 month.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 50)",
        "(line 475,col 9)-(line 475,col 44)",
        "(line 476,col 9)-(line 476,col 44)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 480,col 9)-(line 480,col 65)",
        "(line 481,col 9)-(line 481,col 59)",
        "(line 482,col 9)-(line 482,col 66)",
        "(line 483,col 9)-(line 483,col 57)",
        "(line 485,col 9)-(line 485,col 58)",
        "(line 487,col 9)-(line 487,col 68)",
        "(line 488,col 9)-(line 488,col 31)",
        "(line 491,col 9)-(line 491,col 61)",
        "(line 493,col 9)-(line 493,col 31)",
        "(line 494,col 9)-(line 494,col 55)",
        "(line 495,col 9)-(line 495,col 39)",
        "(line 496,col 9)-(line 496,col 49)",
        "(line 497,col 9)-(line 497,col 50)",
        "(line 499,col 9)-(line 499,col 31)",
        "(line 500,col 9)-(line 500,col 50)",
        "(line 501,col 9)-(line 501,col 34)",
        "(line 502,col 9)-(line 502,col 49)",
        "(line 503,col 9)-(line 503,col 50)",
        "(line 506,col 9)-(line 506,col 62)",
        "(line 508,col 9)-(line 508,col 31)",
        "(line 509,col 9)-(line 509,col 50)",
        "(line 510,col 9)-(line 510,col 34)",
        "(line 511,col 9)-(line 511,col 49)",
        "(line 512,col 9)-(line 512,col 50)",
        "(line 514,col 9)-(line 514,col 31)",
        "(line 515,col 9)-(line 515,col 50)",
        "(line 516,col 9)-(line 516,col 34)",
        "(line 517,col 9)-(line 517,col 49)",
        "(line 518,col 9)-(line 518,col 50)",
        "(line 520,col 9)-(line 520,col 31)",
        "(line 521,col 9)-(line 521,col 50)",
        "(line 522,col 9)-(line 522,col 34)",
        "(line 523,col 9)-(line 523,col 49)",
        "(line 524,col 9)-(line 524,col 50)",
        "(line 527,col 9)-(line 527,col 59)",
        "(line 529,col 9)-(line 529,col 31)",
        "(line 530,col 9)-(line 530,col 50)",
        "(line 531,col 9)-(line 531,col 34)",
        "(line 532,col 9)-(line 532,col 49)",
        "(line 533,col 9)-(line 533,col 50)",
        "(line 535,col 9)-(line 535,col 31)",
        "(line 536,col 9)-(line 536,col 50)",
        "(line 537,col 9)-(line 537,col 34)",
        "(line 538,col 9)-(line 538,col 49)",
        "(line 539,col 9)-(line 539,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateMonthB()",
      "begin_line": 546,
      "end_line": 613,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 3 months (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 547,col 50)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 552,col 9)-(line 552,col 58)",
        "(line 553,col 9)-(line 553,col 65)",
        "(line 554,col 9)-(line 554,col 59)",
        "(line 555,col 9)-(line 555,col 66)",
        "(line 556,col 9)-(line 556,col 57)",
        "(line 558,col 9)-(line 558,col 58)",
        "(line 560,col 9)-(line 560,col 68)",
        "(line 561,col 9)-(line 561,col 31)",
        "(line 564,col 9)-(line 564,col 61)",
        "(line 566,col 9)-(line 566,col 31)",
        "(line 567,col 9)-(line 567,col 55)",
        "(line 568,col 9)-(line 568,col 39)",
        "(line 569,col 9)-(line 569,col 49)",
        "(line 570,col 9)-(line 570,col 50)",
        "(line 572,col 9)-(line 572,col 31)",
        "(line 573,col 9)-(line 573,col 50)",
        "(line 574,col 9)-(line 574,col 34)",
        "(line 575,col 9)-(line 575,col 49)",
        "(line 576,col 9)-(line 576,col 50)",
        "(line 579,col 9)-(line 579,col 62)",
        "(line 581,col 9)-(line 581,col 31)",
        "(line 582,col 9)-(line 582,col 50)",
        "(line 583,col 9)-(line 583,col 34)",
        "(line 584,col 9)-(line 584,col 49)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 587,col 9)-(line 587,col 31)",
        "(line 588,col 9)-(line 588,col 50)",
        "(line 589,col 9)-(line 589,col 34)",
        "(line 590,col 9)-(line 590,col 49)",
        "(line 591,col 9)-(line 591,col 50)",
        "(line 593,col 9)-(line 593,col 31)",
        "(line 594,col 9)-(line 594,col 50)",
        "(line 595,col 9)-(line 595,col 34)",
        "(line 596,col 9)-(line 596,col 49)",
        "(line 597,col 9)-(line 597,col 50)",
        "(line 600,col 9)-(line 600,col 59)",
        "(line 602,col 9)-(line 602,col 31)",
        "(line 603,col 9)-(line 603,col 50)",
        "(line 604,col 9)-(line 604,col 34)",
        "(line 605,col 9)-(line 605,col 49)",
        "(line 606,col 9)-(line 606,col 50)",
        "(line 608,col 9)-(line 608,col 31)",
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 610,col 34)",
        "(line 611,col 9)-(line 611,col 49)",
        "(line 612,col 9)-(line 612,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateDayA()",
      "begin_line": 619,
      "end_line": 686,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 day.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 48)",
        "(line 621,col 9)-(line 621,col 43)",
        "(line 622,col 9)-(line 622,col 43)",
        "(line 625,col 9)-(line 625,col 59)",
        "(line 626,col 9)-(line 626,col 66)",
        "(line 627,col 9)-(line 627,col 60)",
        "(line 628,col 9)-(line 628,col 67)",
        "(line 629,col 9)-(line 629,col 58)",
        "(line 631,col 9)-(line 631,col 59)",
        "(line 633,col 9)-(line 633,col 66)",
        "(line 634,col 9)-(line 634,col 31)",
        "(line 637,col 9)-(line 637,col 61)",
        "(line 639,col 9)-(line 639,col 31)",
        "(line 640,col 9)-(line 640,col 55)",
        "(line 641,col 9)-(line 641,col 39)",
        "(line 642,col 9)-(line 642,col 49)",
        "(line 643,col 9)-(line 643,col 50)",
        "(line 645,col 9)-(line 645,col 31)",
        "(line 646,col 9)-(line 646,col 50)",
        "(line 647,col 9)-(line 647,col 34)",
        "(line 648,col 9)-(line 648,col 49)",
        "(line 649,col 9)-(line 649,col 50)",
        "(line 652,col 9)-(line 652,col 62)",
        "(line 654,col 9)-(line 654,col 31)",
        "(line 655,col 9)-(line 655,col 50)",
        "(line 656,col 9)-(line 656,col 34)",
        "(line 657,col 9)-(line 657,col 49)",
        "(line 658,col 9)-(line 658,col 50)",
        "(line 660,col 9)-(line 660,col 31)",
        "(line 661,col 9)-(line 661,col 50)",
        "(line 662,col 9)-(line 662,col 34)",
        "(line 663,col 9)-(line 663,col 49)",
        "(line 664,col 9)-(line 664,col 50)",
        "(line 666,col 9)-(line 666,col 31)",
        "(line 667,col 9)-(line 667,col 50)",
        "(line 668,col 9)-(line 668,col 34)",
        "(line 669,col 9)-(line 669,col 49)",
        "(line 670,col 9)-(line 670,col 50)",
        "(line 673,col 9)-(line 673,col 59)",
        "(line 675,col 9)-(line 675,col 31)",
        "(line 676,col 9)-(line 676,col 50)",
        "(line 677,col 9)-(line 677,col 34)",
        "(line 678,col 9)-(line 678,col 49)",
        "(line 679,col 9)-(line 679,col 50)",
        "(line 681,col 9)-(line 681,col 31)",
        "(line 682,col 9)-(line 682,col 50)",
        "(line 683,col 9)-(line 683,col 34)",
        "(line 684,col 9)-(line 684,col 49)",
        "(line 685,col 9)-(line 685,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateDayB()",
      "begin_line": 692,
      "end_line": 759,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 7 days (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 48)",
        "(line 694,col 9)-(line 694,col 43)",
        "(line 695,col 9)-(line 695,col 43)",
        "(line 698,col 9)-(line 698,col 59)",
        "(line 699,col 9)-(line 699,col 66)",
        "(line 700,col 9)-(line 700,col 60)",
        "(line 701,col 9)-(line 701,col 67)",
        "(line 702,col 9)-(line 702,col 58)",
        "(line 704,col 9)-(line 704,col 59)",
        "(line 706,col 9)-(line 706,col 66)",
        "(line 707,col 9)-(line 707,col 31)",
        "(line 710,col 9)-(line 710,col 61)",
        "(line 712,col 9)-(line 712,col 31)",
        "(line 713,col 9)-(line 713,col 55)",
        "(line 714,col 9)-(line 714,col 39)",
        "(line 715,col 9)-(line 715,col 49)",
        "(line 716,col 9)-(line 716,col 50)",
        "(line 718,col 9)-(line 718,col 31)",
        "(line 719,col 9)-(line 719,col 50)",
        "(line 720,col 9)-(line 720,col 34)",
        "(line 721,col 9)-(line 721,col 49)",
        "(line 722,col 9)-(line 722,col 50)",
        "(line 725,col 9)-(line 725,col 62)",
        "(line 727,col 9)-(line 727,col 31)",
        "(line 728,col 9)-(line 728,col 50)",
        "(line 729,col 9)-(line 729,col 34)",
        "(line 730,col 9)-(line 730,col 49)",
        "(line 731,col 9)-(line 731,col 50)",
        "(line 733,col 9)-(line 733,col 31)",
        "(line 734,col 9)-(line 734,col 50)",
        "(line 735,col 9)-(line 735,col 34)",
        "(line 736,col 9)-(line 736,col 49)",
        "(line 737,col 9)-(line 737,col 50)",
        "(line 739,col 9)-(line 739,col 31)",
        "(line 740,col 9)-(line 740,col 50)",
        "(line 741,col 9)-(line 741,col 34)",
        "(line 742,col 9)-(line 742,col 49)",
        "(line 743,col 9)-(line 743,col 50)",
        "(line 746,col 9)-(line 746,col 59)",
        "(line 748,col 9)-(line 748,col 31)",
        "(line 749,col 9)-(line 749,col 50)",
        "(line 750,col 9)-(line 750,col 34)",
        "(line 751,col 9)-(line 751,col 49)",
        "(line 752,col 9)-(line 752,col 50)",
        "(line 754,col 9)-(line 754,col 31)",
        "(line 755,col 9)-(line 755,col 50)",
        "(line 756,col 9)-(line 756,col 34)",
        "(line 757,col 9)-(line 757,col 49)",
        "(line 758,col 9)-(line 758,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateHourA()",
      "begin_line": 765,
      "end_line": 832,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 hour.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 49)",
        "(line 767,col 9)-(line 767,col 43)",
        "(line 768,col 9)-(line 768,col 43)",
        "(line 771,col 9)-(line 771,col 53)",
        "(line 772,col 9)-(line 772,col 60)",
        "(line 773,col 9)-(line 773,col 54)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 775,col 9)-(line 775,col 52)",
        "(line 777,col 9)-(line 777,col 53)",
        "(line 779,col 9)-(line 779,col 67)",
        "(line 780,col 9)-(line 780,col 31)",
        "(line 783,col 9)-(line 783,col 61)",
        "(line 785,col 9)-(line 785,col 31)",
        "(line 786,col 9)-(line 786,col 55)",
        "(line 787,col 9)-(line 787,col 39)",
        "(line 788,col 9)-(line 788,col 49)",
        "(line 789,col 9)-(line 789,col 50)",
        "(line 791,col 9)-(line 791,col 31)",
        "(line 792,col 9)-(line 792,col 50)",
        "(line 793,col 9)-(line 793,col 34)",
        "(line 794,col 9)-(line 794,col 49)",
        "(line 795,col 9)-(line 795,col 50)",
        "(line 798,col 9)-(line 798,col 62)",
        "(line 800,col 9)-(line 800,col 31)",
        "(line 801,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 802,col 34)",
        "(line 803,col 9)-(line 803,col 49)",
        "(line 804,col 9)-(line 804,col 50)",
        "(line 806,col 9)-(line 806,col 31)",
        "(line 807,col 9)-(line 807,col 50)",
        "(line 808,col 9)-(line 808,col 34)",
        "(line 809,col 9)-(line 809,col 49)",
        "(line 810,col 9)-(line 810,col 50)",
        "(line 812,col 9)-(line 812,col 31)",
        "(line 813,col 9)-(line 813,col 50)",
        "(line 814,col 9)-(line 814,col 34)",
        "(line 815,col 9)-(line 815,col 49)",
        "(line 816,col 9)-(line 816,col 50)",
        "(line 819,col 9)-(line 819,col 59)",
        "(line 821,col 9)-(line 821,col 31)",
        "(line 822,col 9)-(line 822,col 50)",
        "(line 823,col 9)-(line 823,col 34)",
        "(line 824,col 9)-(line 824,col 49)",
        "(line 825,col 9)-(line 825,col 50)",
        "(line 827,col 9)-(line 827,col 31)",
        "(line 828,col 9)-(line 828,col 50)",
        "(line 829,col 9)-(line 829,col 34)",
        "(line 830,col 9)-(line 830,col 49)",
        "(line 831,col 9)-(line 831,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateHourB()",
      "begin_line": 838,
      "end_line": 905,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 6 hours (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 49)",
        "(line 840,col 9)-(line 840,col 43)",
        "(line 841,col 9)-(line 841,col 43)",
        "(line 844,col 9)-(line 844,col 53)",
        "(line 845,col 9)-(line 845,col 60)",
        "(line 846,col 9)-(line 846,col 54)",
        "(line 847,col 9)-(line 847,col 61)",
        "(line 848,col 9)-(line 848,col 52)",
        "(line 850,col 9)-(line 850,col 53)",
        "(line 852,col 9)-(line 852,col 67)",
        "(line 853,col 9)-(line 853,col 31)",
        "(line 856,col 9)-(line 856,col 61)",
        "(line 858,col 9)-(line 858,col 31)",
        "(line 859,col 9)-(line 859,col 55)",
        "(line 860,col 9)-(line 860,col 39)",
        "(line 861,col 9)-(line 861,col 49)",
        "(line 862,col 9)-(line 862,col 50)",
        "(line 864,col 9)-(line 864,col 31)",
        "(line 865,col 9)-(line 865,col 50)",
        "(line 866,col 9)-(line 866,col 34)",
        "(line 867,col 9)-(line 867,col 49)",
        "(line 868,col 9)-(line 868,col 50)",
        "(line 871,col 9)-(line 871,col 62)",
        "(line 873,col 9)-(line 873,col 31)",
        "(line 874,col 9)-(line 874,col 50)",
        "(line 875,col 9)-(line 875,col 34)",
        "(line 876,col 9)-(line 876,col 49)",
        "(line 877,col 9)-(line 877,col 50)",
        "(line 879,col 9)-(line 879,col 31)",
        "(line 880,col 9)-(line 880,col 50)",
        "(line 881,col 9)-(line 881,col 34)",
        "(line 882,col 9)-(line 882,col 49)",
        "(line 883,col 9)-(line 883,col 50)",
        "(line 885,col 9)-(line 885,col 31)",
        "(line 886,col 9)-(line 886,col 50)",
        "(line 887,col 9)-(line 887,col 34)",
        "(line 888,col 9)-(line 888,col 49)",
        "(line 889,col 9)-(line 889,col 50)",
        "(line 892,col 9)-(line 892,col 59)",
        "(line 894,col 9)-(line 894,col 31)",
        "(line 895,col 9)-(line 895,col 50)",
        "(line 896,col 9)-(line 896,col 34)",
        "(line 897,col 9)-(line 897,col 49)",
        "(line 898,col 9)-(line 898,col 50)",
        "(line 900,col 9)-(line 900,col 31)",
        "(line 901,col 9)-(line 901,col 50)",
        "(line 902,col 9)-(line 902,col 34)",
        "(line 903,col 9)-(line 903,col 49)",
        "(line 904,col 9)-(line 904,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateSecondA()",
      "begin_line": 911,
      "end_line": 978,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 second.\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 51)",
        "(line 913,col 9)-(line 913,col 55)",
        "(line 914,col 9)-(line 914,col 55)",
        "(line 917,col 9)-(line 917,col 53)",
        "(line 918,col 9)-(line 918,col 59)",
        "(line 919,col 9)-(line 919,col 54)",
        "(line 920,col 9)-(line 920,col 60)",
        "(line 921,col 9)-(line 921,col 52)",
        "(line 923,col 9)-(line 923,col 53)",
        "(line 925,col 9)-(line 925,col 69)",
        "(line 926,col 9)-(line 926,col 31)",
        "(line 929,col 9)-(line 929,col 61)",
        "(line 931,col 9)-(line 931,col 31)",
        "(line 932,col 9)-(line 932,col 55)",
        "(line 933,col 9)-(line 933,col 39)",
        "(line 934,col 9)-(line 934,col 49)",
        "(line 935,col 9)-(line 935,col 50)",
        "(line 937,col 9)-(line 937,col 31)",
        "(line 938,col 9)-(line 938,col 50)",
        "(line 939,col 9)-(line 939,col 34)",
        "(line 940,col 9)-(line 940,col 49)",
        "(line 941,col 9)-(line 941,col 50)",
        "(line 944,col 9)-(line 944,col 62)",
        "(line 946,col 9)-(line 946,col 31)",
        "(line 947,col 9)-(line 947,col 50)",
        "(line 948,col 9)-(line 948,col 34)",
        "(line 949,col 9)-(line 949,col 49)",
        "(line 950,col 9)-(line 950,col 50)",
        "(line 952,col 9)-(line 952,col 31)",
        "(line 953,col 9)-(line 953,col 50)",
        "(line 954,col 9)-(line 954,col 34)",
        "(line 955,col 9)-(line 955,col 49)",
        "(line 956,col 9)-(line 956,col 50)",
        "(line 958,col 9)-(line 958,col 31)",
        "(line 959,col 9)-(line 959,col 50)",
        "(line 960,col 9)-(line 960,col 34)",
        "(line 961,col 9)-(line 961,col 49)",
        "(line 962,col 9)-(line 962,col 50)",
        "(line 965,col 9)-(line 965,col 59)",
        "(line 967,col 9)-(line 967,col 31)",
        "(line 968,col 9)-(line 968,col 50)",
        "(line 969,col 9)-(line 969,col 34)",
        "(line 970,col 9)-(line 970,col 49)",
        "(line 971,col 9)-(line 971,col 50)",
        "(line 973,col 9)-(line 973,col 31)",
        "(line 974,col 9)-(line 974,col 50)",
        "(line 975,col 9)-(line 975,col 34)",
        "(line 976,col 9)-(line 976,col 49)",
        "(line 977,col 9)-(line 977,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateSecondB()",
      "begin_line": 984,
      "end_line": 1051,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 5 seconds (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 51)",
        "(line 986,col 9)-(line 986,col 55)",
        "(line 987,col 9)-(line 987,col 55)",
        "(line 990,col 9)-(line 990,col 53)",
        "(line 991,col 9)-(line 991,col 59)",
        "(line 992,col 9)-(line 992,col 54)",
        "(line 993,col 9)-(line 993,col 60)",
        "(line 994,col 9)-(line 994,col 52)",
        "(line 996,col 9)-(line 996,col 53)",
        "(line 998,col 9)-(line 998,col 69)",
        "(line 999,col 9)-(line 999,col 31)",
        "(line 1002,col 9)-(line 1002,col 61)",
        "(line 1004,col 9)-(line 1004,col 31)",
        "(line 1005,col 9)-(line 1005,col 55)",
        "(line 1006,col 9)-(line 1006,col 39)",
        "(line 1007,col 9)-(line 1007,col 49)",
        "(line 1008,col 9)-(line 1008,col 50)",
        "(line 1010,col 9)-(line 1010,col 31)",
        "(line 1011,col 9)-(line 1011,col 50)",
        "(line 1012,col 9)-(line 1012,col 34)",
        "(line 1013,col 9)-(line 1013,col 49)",
        "(line 1014,col 9)-(line 1014,col 50)",
        "(line 1017,col 9)-(line 1017,col 62)",
        "(line 1019,col 9)-(line 1019,col 31)",
        "(line 1020,col 9)-(line 1020,col 50)",
        "(line 1021,col 9)-(line 1021,col 34)",
        "(line 1022,col 9)-(line 1022,col 49)",
        "(line 1023,col 9)-(line 1023,col 50)",
        "(line 1025,col 9)-(line 1025,col 31)",
        "(line 1026,col 9)-(line 1026,col 50)",
        "(line 1027,col 9)-(line 1027,col 34)",
        "(line 1028,col 9)-(line 1028,col 49)",
        "(line 1029,col 9)-(line 1029,col 50)",
        "(line 1031,col 9)-(line 1031,col 31)",
        "(line 1032,col 9)-(line 1032,col 50)",
        "(line 1033,col 9)-(line 1033,col 34)",
        "(line 1034,col 9)-(line 1034,col 49)",
        "(line 1035,col 9)-(line 1035,col 50)",
        "(line 1038,col 9)-(line 1038,col 59)",
        "(line 1040,col 9)-(line 1040,col 31)",
        "(line 1041,col 9)-(line 1041,col 50)",
        "(line 1042,col 9)-(line 1042,col 34)",
        "(line 1043,col 9)-(line 1043,col 49)",
        "(line 1044,col 9)-(line 1044,col 50)",
        "(line 1046,col 9)-(line 1046,col 31)",
        "(line 1047,col 9)-(line 1047,col 50)",
        "(line 1048,col 9)-(line 1048,col 34)",
        "(line 1049,col 9)-(line 1049,col 49)",
        "(line 1050,col 9)-(line 1050,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateMillisecondA()",
      "begin_line": 1057,
      "end_line": 1094,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 1 millisecond.\n     ",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 56)",
        "(line 1059,col 9)-(line 1059,col 70)",
        "(line 1060,col 9)-(line 1060,col 70)",
        "(line 1062,col 9)-(line 1062,col 53)",
        "(line 1063,col 9)-(line 1063,col 53)",
        "(line 1065,col 9)-(line 1065,col 74)",
        "(line 1066,col 9)-(line 1066,col 31)",
        "(line 1069,col 9)-(line 1069,col 61)",
        "(line 1071,col 9)-(line 1071,col 31)",
        "(line 1072,col 9)-(line 1072,col 55)",
        "(line 1073,col 9)-(line 1073,col 39)",
        "(line 1074,col 9)-(line 1074,col 49)",
        "(line 1075,col 9)-(line 1075,col 50)",
        "(line 1078,col 9)-(line 1078,col 62)",
        "(line 1080,col 9)-(line 1080,col 31)",
        "(line 1081,col 9)-(line 1081,col 50)",
        "(line 1082,col 9)-(line 1082,col 34)",
        "(line 1083,col 9)-(line 1083,col 49)",
        "(line 1084,col 9)-(line 1084,col 50)",
        "(line 1087,col 9)-(line 1087,col 59)",
        "(line 1089,col 9)-(line 1089,col 31)",
        "(line 1090,col 9)-(line 1090,col 50)",
        "(line 1091,col 9)-(line 1091,col 34)",
        "(line 1092,col 9)-(line 1092,col 49)",
        "(line 1093,col 9)-(line 1093,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.DateAxisTests.testPreviousStandardDateMillisecondB()",
      "begin_line": 1100,
      "end_line": 1137,
      "comment": "\n     * A basic check for the testPreviousStandardDate() method when the\n     * tick unit is 10 milliseconds (just for the sake of having a multiple).\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 56)",
        "(line 1102,col 9)-(line 1102,col 70)",
        "(line 1103,col 9)-(line 1103,col 70)",
        "(line 1105,col 9)-(line 1105,col 53)",
        "(line 1106,col 9)-(line 1106,col 53)",
        "(line 1108,col 9)-(line 1108,col 75)",
        "(line 1109,col 9)-(line 1109,col 31)",
        "(line 1112,col 9)-(line 1112,col 61)",
        "(line 1114,col 9)-(line 1114,col 31)",
        "(line 1115,col 9)-(line 1115,col 55)",
        "(line 1116,col 9)-(line 1116,col 39)",
        "(line 1117,col 9)-(line 1117,col 49)",
        "(line 1118,col 9)-(line 1118,col 50)",
        "(line 1121,col 9)-(line 1121,col 62)",
        "(line 1123,col 9)-(line 1123,col 31)",
        "(line 1124,col 9)-(line 1124,col 50)",
        "(line 1125,col 9)-(line 1125,col 34)",
        "(line 1126,col 9)-(line 1126,col 49)",
        "(line 1127,col 9)-(line 1127,col 50)",
        "(line 1130,col 9)-(line 1130,col 59)",
        "(line 1132,col 9)-(line 1132,col 31)",
        "(line 1133,col 9)-(line 1133,col 50)",
        "(line 1134,col 9)-(line 1134,col 34)",
        "(line 1135,col 9)-(line 1135,col 49)",
        "(line 1136,col 9)-(line 1136,col 50)"
      ]
    }
  ]
}