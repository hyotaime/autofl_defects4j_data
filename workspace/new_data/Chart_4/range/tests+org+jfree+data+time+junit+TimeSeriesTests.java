{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/data/time/junit/TimeSeriesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.data.general.SeriesChangeListener"
      ],
      "begin_line": 83,
      "end_line": 1098,
      "comment": "\n * A collection of test cases for the {@link TimeSeries} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesA"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesB"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesC"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "gotSeriesChangeEvent"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " A flag that indicates whether or not a change event was fired. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.suite()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.TimeSeriesTests(java.lang.String)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.setUp()",
      "begin_line": 118,
      "end_line": 153,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 50)",
        "(line 134,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 50)",
        "(line 144,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Sets the flag to indicate that a {@link SeriesChangeEvent} has been\n     * received.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone()",
      "begin_line": 168,
      "end_line": 211,
      "comment": "\n     * Check that cloning works.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 58)",
        "(line 172,col 9)-(line 172,col 80)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 65)",
        "(line 196,col 9)-(line 196,col 43)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 38)",
        "(line 202,col 9)-(line 202,col 37)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone2()",
      "begin_line": 216,
      "end_line": 235,
      "comment": "\n     * Another test of the clone() method.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 45)",
        "(line 218,col 9)-(line 218,col 38)",
        "(line 219,col 9)-(line 219,col 37)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 221,col 29)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 34)",
        "(line 231,col 9)-(line 231,col 46)",
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 233,col 46)",
        "(line 234,col 9)-(line 234,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddValue()",
      "begin_line": 240,
      "end_line": 252,
      "comment": "\n     * Add a value to series A for 1999.  It should be added at index 0.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 56)",
        "(line 250,col 9)-(line 250,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetValue()",
      "begin_line": 257,
      "end_line": 264,
      "comment": "\n     * Tests the retrieval of values.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 62)",
        "(line 260,col 9)-(line 260,col 27)",
        "(line 261,col 9)-(line 261,col 70)",
        "(line 262,col 9)-(line 262,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete()",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Tests the deletion of values.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 34)",
        "(line 271,col 9)-(line 271,col 53)",
        "(line 272,col 9)-(line 272,col 61)",
        "(line 273,col 9)-(line 273,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete2()",
      "begin_line": 279,
      "end_line": 304,
      "comment": "\n     * Basic tests for the delete() method.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 281,col 38)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 37)",
        "(line 284,col 9)-(line 284,col 35)",
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 34)",
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 56)",
        "(line 292,col 9)-(line 292,col 42)",
        "(line 293,col 9)-(line 293,col 34)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 297,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete3()",
      "begin_line": 309,
      "end_line": 323,
      "comment": "\n     * Some checks for the delete(int, int) method.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 45)",
        "(line 311,col 9)-(line 311,col 36)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 313,col 9)-(line 313,col 36)",
        "(line 314,col 9)-(line 314,col 36)",
        "(line 315,col 9)-(line 315,col 36)",
        "(line 316,col 9)-(line 316,col 36)",
        "(line 317,col 9)-(line 317,col 24)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 58)",
        "(line 320,col 9)-(line 320,col 58)",
        "(line 321,col 9)-(line 321,col 49)",
        "(line 322,col 9)-(line 322,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete_RegularTimePeriod()",
      "begin_line": 329,
      "end_line": 339,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count and a new value is added.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 45)",
        "(line 331,col 9)-(line 331,col 36)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 36)",
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 34)",
        "(line 336,col 9)-(line 336,col 34)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 338,col 9)-(line 338,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSerialization()",
      "begin_line": 344,
      "end_line": 371,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 49)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 37)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 29)",
        "(line 354,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals()",
      "begin_line": 376,
      "end_line": 413,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 56)",
        "(line 378,col 9)-(line 378,col 56)",
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 30)",
        "(line 382,col 9)-(line 382,col 35)",
        "(line 383,col 9)-(line 383,col 35)",
        "(line 384,col 9)-(line 384,col 29)",
        "(line 386,col 9)-(line 386,col 41)",
        "(line 387,col 9)-(line 387,col 41)",
        "(line 388,col 9)-(line 388,col 26)",
        "(line 389,col 9)-(line 389,col 26)",
        "(line 390,col 9)-(line 390,col 35)",
        "(line 391,col 9)-(line 391,col 30)",
        "(line 393,col 9)-(line 393,col 26)",
        "(line 394,col 9)-(line 394,col 26)",
        "(line 395,col 9)-(line 395,col 35)",
        "(line 396,col 9)-(line 396,col 29)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 35)",
        "(line 400,col 9)-(line 400,col 30)",
        "(line 402,col 9)-(line 402,col 36)",
        "(line 403,col 9)-(line 403,col 35)",
        "(line 404,col 9)-(line 404,col 29)",
        "(line 406,col 9)-(line 406,col 34)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 30)",
        "(line 410,col 9)-(line 410,col 34)",
        "(line 411,col 9)-(line 411,col 35)",
        "(line 412,col 9)-(line 412,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals2()",
      "begin_line": 419,
      "end_line": 423,
      "comment": "\n     * Tests a specific bug report where null arguments in the constructor\n     * cause the equals() method to fail.  Fixed for 0.9.21.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 61)",
        "(line 421,col 9)-(line 421,col 61)",
        "(line 422,col 9)-(line 422,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy1()",
      "begin_line": 429,
      "end_line": 517,
      "comment": "\n     * Some tests to ensure that the createCopy(RegularTimePeriod,\n     * RegularTimePeriod) method is functioning correctly.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 53)",
        "(line 432,col 9)-(line 432,col 66)",
        "(line 433,col 9)-(line 433,col 67)",
        "(line 434,col 9)-(line 434,col 63)",
        "(line 435,col 9)-(line 435,col 67)",
        "(line 436,col 9)-(line 436,col 67)",
        "(line 438,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy2()",
      "begin_line": 523,
      "end_line": 593,
      "comment": "\n     * Some tests to ensure that the createCopy(int, int) method is\n     * functioning correctly.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 53)",
        "(line 526,col 9)-(line 526,col 66)",
        "(line 527,col 9)-(line 527,col 67)",
        "(line 528,col 9)-(line 528,col 63)",
        "(line 529,col 9)-(line 529,col 67)",
        "(line 530,col 9)-(line 530,col 67)",
        "(line 532,col 9)-(line 557,col 9)",
        "(line 560,col 9)-(line 560,col 29)",
        "(line 561,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 25)",
        "(line 573,col 9)-(line 573,col 21)",
        "(line 574,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 25)",
        "(line 585,col 9)-(line 585,col 56)",
        "(line 586,col 9)-(line 592,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSetMaximumItemCount()",
      "begin_line": 600,
      "end_line": 616,
      "comment": "\n     * Test the setMaximumItemCount() method to ensure that it removes items\n     * from the series if necessary.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 45)",
        "(line 603,col 9)-(line 603,col 38)",
        "(line 604,col 9)-(line 604,col 38)",
        "(line 605,col 9)-(line 605,col 37)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 43)",
        "(line 610,col 9)-(line 610,col 34)",
        "(line 611,col 9)-(line 611,col 43)",
        "(line 612,col 9)-(line 612,col 52)",
        "(line 613,col 9)-(line 613,col 60)",
        "(line 614,col 9)-(line 614,col 51)",
        "(line 615,col 9)-(line 615,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate()",
      "begin_line": 621,
      "end_line": 632,
      "comment": "\n     * Some checks for the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 45)",
        "(line 623,col 9)-(line 623,col 34)",
        "(line 624,col 9)-(line 624,col 46)",
        "(line 625,col 9)-(line 625,col 43)",
        "(line 626,col 9)-(line 626,col 46)",
        "(line 627,col 9)-(line 627,col 43)",
        "(line 628,col 9)-(line 628,col 46)",
        "(line 629,col 9)-(line 629,col 43)",
        "(line 630,col 9)-(line 630,col 46)",
        "(line 631,col 9)-(line 631,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate2()",
      "begin_line": 637,
      "end_line": 646,
      "comment": "\n     * Test the add branch of the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 45)",
        "(line 639,col 9)-(line 639,col 34)",
        "(line 640,col 9)-(line 640,col 44)",
        "(line 641,col 9)-(line 641,col 44)",
        "(line 642,col 9)-(line 642,col 44)",
        "(line 643,col 9)-(line 643,col 43)",
        "(line 644,col 9)-(line 644,col 49)",
        "(line 645,col 9)-(line 645,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate3()",
      "begin_line": 652,
      "end_line": 665,
      "comment": "\n     * Test that the addOrUpdate() method won\u0027t allow multiple time period\n     * classes.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 45)",
        "(line 654,col 9)-(line 654,col 44)",
        "(line 655,col 9)-(line 655,col 58)",
        "(line 657,col 9)-(line 657,col 29)",
        "(line 658,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate4()",
      "begin_line": 670,
      "end_line": 689,
      "comment": "\n     * Some more checks for the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 44)",
        "(line 672,col 9)-(line 672,col 79)",
        "(line 673,col 9)-(line 673,col 32)",
        "(line 674,col 9)-(line 674,col 58)",
        "(line 675,col 9)-(line 675,col 64)",
        "(line 676,col 9)-(line 676,col 67)",
        "(line 679,col 9)-(line 679,col 35)",
        "(line 680,col 9)-(line 680,col 67)",
        "(line 682,col 9)-(line 682,col 80)",
        "(line 683,col 9)-(line 683,col 43)",
        "(line 684,col 9)-(line 684,col 32)",
        "(line 685,col 9)-(line 685,col 69)",
        "(line 687,col 9)-(line 687,col 28)",
        "(line 688,col 9)-(line 688,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1075255()",
      "begin_line": 694,
      "end_line": 707,
      "comment": "\n     * A test for the bug report 1075255.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 48)",
        "(line 696,col 9)-(line 696,col 46)",
        "(line 697,col 9)-(line 697,col 50)",
        "(line 698,col 9)-(line 698,col 47)",
        "(line 699,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1832432()",
      "begin_line": 712,
      "end_line": 728,
      "comment": "\n     * A test for bug 1832432.\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 49)",
        "(line 714,col 9)-(line 714,col 29)",
        "(line 715,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 29)",
        "(line 722,col 9)-(line 722,col 51)",
        "(line 723,col 9)-(line 723,col 34)",
        "(line 726,col 9)-(line 726,col 43)",
        "(line 727,col 9)-(line 727,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetIndex()",
      "begin_line": 733,
      "end_line": 748,
      "comment": "\n     * Some checks for the getIndex() method.\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 53)",
        "(line 735,col 9)-(line 735,col 62)",
        "(line 737,col 9)-(line 737,col 45)",
        "(line 738,col 9)-(line 738,col 61)",
        "(line 739,col 9)-(line 739,col 63)",
        "(line 740,col 9)-(line 740,col 62)",
        "(line 742,col 9)-(line 742,col 45)",
        "(line 743,col 9)-(line 743,col 63)",
        "(line 744,col 9)-(line 744,col 61)",
        "(line 745,col 9)-(line 745,col 62)",
        "(line 746,col 9)-(line 746,col 61)",
        "(line 747,col 9)-(line 747,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem1()",
      "begin_line": 753,
      "end_line": 786,
      "comment": "\n     * Some checks for the getDataItem(int) method.\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 48)",
        "(line 757,col 9)-(line 757,col 29)",
        "(line 758,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 25)",
        "(line 766,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 767,col 56)",
        "(line 768,col 9)-(line 768,col 55)",
        "(line 769,col 9)-(line 769,col 21)",
        "(line 770,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 25)",
        "(line 778,col 9)-(line 778,col 21)",
        "(line 779,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem2()",
      "begin_line": 791,
      "end_line": 804,
      "comment": "\n     * Some checks for the getDataItem(RegularTimePeriod) method.\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 48)",
        "(line 793,col 9)-(line 793,col 55)",
        "(line 796,col 9)-(line 796,col 29)",
        "(line 797,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems()",
      "begin_line": 809,
      "end_line": 841,
      "comment": "\n     * Some checks for the removeAgedItems() method.\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 58)",
        "(line 811,col 9)-(line 811,col 39)",
        "(line 812,col 9)-(line 812,col 65)",
        "(line 813,col 9)-(line 813,col 70)",
        "(line 814,col 9)-(line 814,col 42)",
        "(line 817,col 9)-(line 817,col 37)",
        "(line 818,col 9)-(line 818,col 47)",
        "(line 819,col 9)-(line 819,col 47)",
        "(line 822,col 9)-(line 822,col 40)",
        "(line 823,col 9)-(line 823,col 36)",
        "(line 824,col 9)-(line 824,col 42)",
        "(line 825,col 9)-(line 825,col 37)",
        "(line 826,col 9)-(line 826,col 47)",
        "(line 827,col 9)-(line 827,col 47)",
        "(line 830,col 9)-(line 830,col 37)",
        "(line 831,col 9)-(line 831,col 40)",
        "(line 832,col 9)-(line 832,col 42)",
        "(line 833,col 9)-(line 833,col 36)",
        "(line 834,col 9)-(line 834,col 47)",
        "(line 835,col 9)-(line 835,col 57)",
        "(line 836,col 9)-(line 836,col 47)",
        "(line 837,col 9)-(line 837,col 36)",
        "(line 838,col 9)-(line 838,col 47)",
        "(line 839,col 9)-(line 839,col 57)",
        "(line 840,col 9)-(line 840,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems2()",
      "begin_line": 846,
      "end_line": 884,
      "comment": "\n     * Some checks for the removeAgedItems(long, boolean) method.\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 847,col 36)",
        "(line 848,col 9)-(line 848,col 58)",
        "(line 849,col 9)-(line 849,col 39)",
        "(line 850,col 9)-(line 850,col 65)",
        "(line 851,col 9)-(line 851,col 70)",
        "(line 852,col 9)-(line 852,col 42)",
        "(line 855,col 9)-(line 855,col 44)",
        "(line 856,col 9)-(line 856,col 47)",
        "(line 857,col 9)-(line 857,col 47)",
        "(line 860,col 9)-(line 860,col 40)",
        "(line 861,col 9)-(line 861,col 36)",
        "(line 862,col 9)-(line 862,col 42)",
        "(line 863,col 9)-(line 863,col 76)",
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 865,col 47)",
        "(line 866,col 9)-(line 866,col 44)",
        "(line 867,col 9)-(line 867,col 47)",
        "(line 868,col 9)-(line 868,col 46)",
        "(line 871,col 9)-(line 871,col 36)",
        "(line 872,col 9)-(line 872,col 40)",
        "(line 873,col 9)-(line 873,col 40)",
        "(line 874,col 9)-(line 874,col 47)",
        "(line 875,col 9)-(line 875,col 42)",
        "(line 876,col 9)-(line 876,col 47)",
        "(line 878,col 9)-(line 878,col 76)",
        "(line 879,col 9)-(line 879,col 47)",
        "(line 880,col 9)-(line 880,col 47)",
        "(line 881,col 9)-(line 881,col 44)",
        "(line 882,col 9)-(line 882,col 47)",
        "(line 883,col 9)-(line 883,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems3()",
      "begin_line": 890,
      "end_line": 900,
      "comment": "\n     * Calling removeAgedItems() on an empty series should not throw any\n     * exception.\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 46)",
        "(line 892,col 9)-(line 892,col 28)",
        "(line 893,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems4()",
      "begin_line": 906,
      "end_line": 916,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count.\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 45)",
        "(line 908,col 9)-(line 908,col 32)",
        "(line 909,col 9)-(line 909,col 36)",
        "(line 910,col 9)-(line 910,col 36)",
        "(line 911,col 9)-(line 911,col 36)",
        "(line 912,col 9)-(line 912,col 36)",
        "(line 913,col 9)-(line 913,col 43)",
        "(line 914,col 9)-(line 914,col 49)",
        "(line 915,col 9)-(line 915,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems5()",
      "begin_line": 922,
      "end_line": 933,
      "comment": "\n     * Check that the item bounds are determined correctly after a call to\n     * removeAgedItems().\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 45)",
        "(line 924,col 9)-(line 924,col 32)",
        "(line 925,col 9)-(line 925,col 36)",
        "(line 926,col 9)-(line 926,col 36)",
        "(line 927,col 9)-(line 927,col 36)",
        "(line 928,col 9)-(line 928,col 36)",
        "(line 929,col 9)-(line 929,col 72)",
        "(line 930,col 9)-(line 930,col 43)",
        "(line 931,col 9)-(line 931,col 49)",
        "(line 932,col 9)-(line 932,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testHashCode()",
      "begin_line": 938,
      "end_line": 963,
      "comment": "\n     * Some simple checks for the hashCode() method.\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 47)",
        "(line 940,col 9)-(line 940,col 47)",
        "(line 941,col 9)-(line 941,col 29)",
        "(line 942,col 9)-(line 942,col 51)",
        "(line 944,col 9)-(line 944,col 43)",
        "(line 945,col 9)-(line 945,col 43)",
        "(line 946,col 9)-(line 946,col 29)",
        "(line 947,col 9)-(line 947,col 51)",
        "(line 949,col 9)-(line 949,col 42)",
        "(line 950,col 9)-(line 950,col 42)",
        "(line 951,col 9)-(line 951,col 29)",
        "(line 952,col 9)-(line 952,col 51)",
        "(line 954,col 9)-(line 954,col 43)",
        "(line 955,col 9)-(line 955,col 43)",
        "(line 956,col 9)-(line 956,col 29)",
        "(line 957,col 9)-(line 957,col 51)",
        "(line 959,col 9)-(line 959,col 41)",
        "(line 960,col 9)-(line 960,col 41)",
        "(line 961,col 9)-(line 961,col 29)",
        "(line 962,col 9)-(line 962,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1864222()",
      "begin_line": 968,
      "end_line": 980,
      "comment": "\n     * Test for bug report 1864222.\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 43)",
        "(line 970,col 9)-(line 970,col 39)",
        "(line 971,col 9)-(line 971,col 39)",
        "(line 972,col 9)-(line 972,col 28)",
        "(line 973,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetMinY()",
      "begin_line": 987,
      "end_line": 1008,
      "comment": "\n     * Some checks for the getMinY() method.\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 45)",
        "(line 989,col 9)-(line 989,col 47)",
        "(line 991,col 9)-(line 991,col 36)",
        "(line 992,col 9)-(line 992,col 49)",
        "(line 994,col 9)-(line 994,col 36)",
        "(line 995,col 9)-(line 995,col 49)",
        "(line 997,col 9)-(line 997,col 37)",
        "(line 998,col 9)-(line 998,col 49)",
        "(line 1000,col 9)-(line 1000,col 37)",
        "(line 1001,col 9)-(line 1001,col 50)",
        "(line 1003,col 9)-(line 1003,col 37)",
        "(line 1004,col 9)-(line 1004,col 50)",
        "(line 1006,col 9)-(line 1006,col 45)",
        "(line 1007,col 9)-(line 1007,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetMaxY()",
      "begin_line": 1013,
      "end_line": 1034,
      "comment": "\n     * Some checks for the getMaxY() method.\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 45)",
        "(line 1015,col 9)-(line 1015,col 47)",
        "(line 1017,col 9)-(line 1017,col 36)",
        "(line 1018,col 9)-(line 1018,col 49)",
        "(line 1020,col 9)-(line 1020,col 36)",
        "(line 1021,col 9)-(line 1021,col 49)",
        "(line 1023,col 9)-(line 1023,col 37)",
        "(line 1024,col 9)-(line 1024,col 50)",
        "(line 1026,col 9)-(line 1026,col 37)",
        "(line 1027,col 9)-(line 1027,col 50)",
        "(line 1029,col 9)-(line 1029,col 37)",
        "(line 1030,col 9)-(line 1030,col 50)",
        "(line 1032,col 9)-(line 1032,col 45)",
        "(line 1033,col 9)-(line 1033,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClear()",
      "begin_line": 1039,
      "end_line": 1050,
      "comment": "\n     * A test for the clear method.\n     ",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 45)",
        "(line 1041,col 9)-(line 1041,col 36)",
        "(line 1042,col 9)-(line 1042,col 36)",
        "(line 1044,col 9)-(line 1044,col 43)",
        "(line 1046,col 9)-(line 1046,col 19)",
        "(line 1047,col 9)-(line 1047,col 43)",
        "(line 1048,col 9)-(line 1048,col 47)",
        "(line 1049,col 9)-(line 1049,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAdd()",
      "begin_line": 1056,
      "end_line": 1065,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count and a new value is added.\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 45)",
        "(line 1058,col 9)-(line 1058,col 34)",
        "(line 1059,col 9)-(line 1059,col 36)",
        "(line 1060,col 9)-(line 1060,col 36)",
        "(line 1061,col 9)-(line 1061,col 36)",
        "(line 1062,col 9)-(line 1062,col 43)",
        "(line 1063,col 9)-(line 1063,col 49)",
        "(line 1064,col 9)-(line 1064,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testUpdate_RegularTimePeriod()",
      "begin_line": 1070,
      "end_line": 1083,
      "comment": "\n     * Some checks for the update(RegularTimePeriod...method).\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 45)",
        "(line 1072,col 9)-(line 1072,col 36)",
        "(line 1073,col 9)-(line 1073,col 36)",
        "(line 1074,col 9)-(line 1074,col 36)",
        "(line 1075,col 9)-(line 1075,col 51)",
        "(line 1076,col 9)-(line 1076,col 49)",
        "(line 1077,col 9)-(line 1077,col 51)",
        "(line 1078,col 9)-(line 1078,col 49)",
        "(line 1079,col 9)-(line 1079,col 40)",
        "(line 1080,col 9)-(line 1080,col 49)",
        "(line 1081,col 9)-(line 1081,col 40)",
        "(line 1082,col 9)-(line 1082,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAdd_TimeSeriesDataItem()",
      "begin_line": 1089,
      "end_line": 1096,
      "comment": "\n     * Create a TimeSeriesDataItem, add it to a TimeSeries.  Now, modifying\n     * the original TimeSeriesDataItem should NOT affect the TimeSeries.\n     ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1090,col 78)",
        "(line 1091,col 9)-(line 1091,col 49)",
        "(line 1092,col 9)-(line 1092,col 25)",
        "(line 1093,col 9)-(line 1093,col 55)",
        "(line 1094,col 9)-(line 1094,col 40)",
        "(line 1095,col 9)-(line 1095,col 56)"
      ]
    }
  ]
}