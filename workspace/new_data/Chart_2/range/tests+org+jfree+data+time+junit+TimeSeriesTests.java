{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/time/junit/TimeSeriesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.data.event.SeriesChangeListener"
      ],
      "begin_line": 84,
      "end_line": 1115,
      "comment": "\n * A collection of test cases for the {@link TimeSeries} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesA"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesB"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesC"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "gotSeriesChangeEvent"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " A flag that indicates whether or not a change event was fired. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.suite()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.TimeSeriesTests(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.setUp()",
      "begin_line": 119,
      "end_line": 154,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 50)",
        "(line 135,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.seriesChanged(org.jfree.data.event.SeriesChangeEvent)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Sets the flag to indicate that a {@link SeriesChangeEvent} has been\n     * received.\n     *\n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone()",
      "begin_line": 169,
      "end_line": 212,
      "comment": "\n     * Check that cloning works.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 58)",
        "(line 173,col 9)-(line 173,col 80)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 65)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone2()",
      "begin_line": 217,
      "end_line": 236,
      "comment": "\n     * Another test of the clone() method.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 34)",
        "(line 232,col 9)-(line 232,col 46)",
        "(line 233,col 9)-(line 233,col 35)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 235,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddValue()",
      "begin_line": 241,
      "end_line": 253,
      "comment": "\n     * Add a value to series A for 1999.  It should be added at index 0.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 56)",
        "(line 251,col 9)-(line 251,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetValue()",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\n     * Tests the retrieval of values.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 27)",
        "(line 262,col 9)-(line 262,col 70)",
        "(line 263,col 9)-(line 263,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete()",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * Tests the deletion of values.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 34)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 273,col 61)",
        "(line 274,col 9)-(line 274,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete2()",
      "begin_line": 280,
      "end_line": 305,
      "comment": "\n     * Basic tests for the delete() method.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 49)",
        "(line 282,col 9)-(line 282,col 38)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 285,col 35)",
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 287,col 34)",
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 43)",
        "(line 290,col 9)-(line 290,col 56)",
        "(line 293,col 9)-(line 293,col 42)",
        "(line 294,col 9)-(line 294,col 34)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 298,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete3()",
      "begin_line": 310,
      "end_line": 324,
      "comment": "\n     * Some checks for the delete(int, int) method.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 45)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 313,col 9)-(line 313,col 36)",
        "(line 314,col 9)-(line 314,col 36)",
        "(line 315,col 9)-(line 315,col 36)",
        "(line 316,col 9)-(line 316,col 36)",
        "(line 317,col 9)-(line 317,col 36)",
        "(line 318,col 9)-(line 318,col 24)",
        "(line 319,col 9)-(line 319,col 43)",
        "(line 320,col 9)-(line 320,col 58)",
        "(line 321,col 9)-(line 321,col 58)",
        "(line 322,col 9)-(line 322,col 49)",
        "(line 323,col 9)-(line 323,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete_RegularTimePeriod()",
      "begin_line": 330,
      "end_line": 340,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count and a new value is added.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 45)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 36)",
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 36)",
        "(line 336,col 9)-(line 336,col 34)",
        "(line 337,col 9)-(line 337,col 34)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 339,col 9)-(line 339,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSerialization()",
      "begin_line": 345,
      "end_line": 367,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 49)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 38)",
        "(line 349,col 9)-(line 349,col 37)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 29)",
        "(line 353,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals()",
      "begin_line": 372,
      "end_line": 409,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 56)",
        "(line 374,col 9)-(line 374,col 56)",
        "(line 375,col 9)-(line 375,col 35)",
        "(line 376,col 9)-(line 376,col 30)",
        "(line 378,col 9)-(line 378,col 35)",
        "(line 379,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 380,col 29)",
        "(line 382,col 9)-(line 382,col 41)",
        "(line 383,col 9)-(line 383,col 41)",
        "(line 384,col 9)-(line 384,col 26)",
        "(line 385,col 9)-(line 385,col 26)",
        "(line 386,col 9)-(line 386,col 35)",
        "(line 387,col 9)-(line 387,col 30)",
        "(line 389,col 9)-(line 389,col 26)",
        "(line 390,col 9)-(line 390,col 26)",
        "(line 391,col 9)-(line 391,col 35)",
        "(line 392,col 9)-(line 392,col 29)",
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 35)",
        "(line 396,col 9)-(line 396,col 30)",
        "(line 398,col 9)-(line 398,col 36)",
        "(line 399,col 9)-(line 399,col 35)",
        "(line 400,col 9)-(line 400,col 29)",
        "(line 402,col 9)-(line 402,col 34)",
        "(line 403,col 9)-(line 403,col 35)",
        "(line 404,col 9)-(line 404,col 30)",
        "(line 406,col 9)-(line 406,col 34)",
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals2()",
      "begin_line": 415,
      "end_line": 419,
      "comment": "\n     * Tests a specific bug report where null arguments in the constructor\n     * cause the equals() method to fail.  Fixed for 0.9.21.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 61)",
        "(line 417,col 9)-(line 417,col 61)",
        "(line 418,col 9)-(line 418,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy1()",
      "begin_line": 425,
      "end_line": 513,
      "comment": "\n     * Some tests to ensure that the createCopy(RegularTimePeriod,\n     * RegularTimePeriod) method is functioning correctly.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 53)",
        "(line 428,col 9)-(line 428,col 66)",
        "(line 429,col 9)-(line 429,col 67)",
        "(line 430,col 9)-(line 430,col 63)",
        "(line 431,col 9)-(line 431,col 67)",
        "(line 432,col 9)-(line 432,col 67)",
        "(line 434,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy2()",
      "begin_line": 519,
      "end_line": 589,
      "comment": "\n     * Some tests to ensure that the createCopy(int, int) method is\n     * functioning correctly.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 53)",
        "(line 522,col 9)-(line 522,col 66)",
        "(line 523,col 9)-(line 523,col 67)",
        "(line 524,col 9)-(line 524,col 63)",
        "(line 525,col 9)-(line 525,col 67)",
        "(line 526,col 9)-(line 526,col 67)",
        "(line 528,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 556,col 29)",
        "(line 557,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 25)",
        "(line 569,col 9)-(line 569,col 21)",
        "(line 570,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 25)",
        "(line 581,col 9)-(line 581,col 56)",
        "(line 582,col 9)-(line 588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy3()",
      "begin_line": 597,
      "end_line": 612,
      "comment": "\n     * Checks that the min and max y values are updated correctly when copying\n     * a subset.\n     *\n     * @throws java.lang.CloneNotSupportedException\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 45)",
        "(line 599,col 9)-(line 599,col 38)",
        "(line 600,col 9)-(line 600,col 38)",
        "(line 601,col 9)-(line 601,col 38)",
        "(line 602,col 9)-(line 602,col 51)",
        "(line 603,col 9)-(line 603,col 51)",
        "(line 605,col 9)-(line 605,col 44)",
        "(line 606,col 9)-(line 606,col 51)",
        "(line 607,col 9)-(line 607,col 51)",
        "(line 609,col 9)-(line 609,col 44)",
        "(line 610,col 9)-(line 610,col 51)",
        "(line 611,col 9)-(line 611,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSetMaximumItemCount()",
      "begin_line": 618,
      "end_line": 633,
      "comment": "\n     * Test the setMaximumItemCount() method to ensure that it removes items\n     * from the series if necessary.\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 45)",
        "(line 620,col 9)-(line 620,col 38)",
        "(line 621,col 9)-(line 621,col 38)",
        "(line 622,col 9)-(line 622,col 37)",
        "(line 623,col 9)-(line 623,col 38)",
        "(line 624,col 9)-(line 624,col 38)",
        "(line 625,col 9)-(line 625,col 43)",
        "(line 627,col 9)-(line 627,col 34)",
        "(line 628,col 9)-(line 628,col 43)",
        "(line 629,col 9)-(line 629,col 52)",
        "(line 630,col 9)-(line 630,col 60)",
        "(line 631,col 9)-(line 631,col 51)",
        "(line 632,col 9)-(line 632,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate()",
      "begin_line": 638,
      "end_line": 649,
      "comment": "\n     * Some checks for the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 45)",
        "(line 640,col 9)-(line 640,col 34)",
        "(line 641,col 9)-(line 641,col 46)",
        "(line 642,col 9)-(line 642,col 43)",
        "(line 643,col 9)-(line 643,col 46)",
        "(line 644,col 9)-(line 644,col 43)",
        "(line 645,col 9)-(line 645,col 46)",
        "(line 646,col 9)-(line 646,col 43)",
        "(line 647,col 9)-(line 647,col 46)",
        "(line 648,col 9)-(line 648,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate2()",
      "begin_line": 654,
      "end_line": 663,
      "comment": "\n     * Test the add branch of the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 45)",
        "(line 656,col 9)-(line 656,col 34)",
        "(line 657,col 9)-(line 657,col 44)",
        "(line 658,col 9)-(line 658,col 44)",
        "(line 659,col 9)-(line 659,col 44)",
        "(line 660,col 9)-(line 660,col 43)",
        "(line 661,col 9)-(line 661,col 49)",
        "(line 662,col 9)-(line 662,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate3()",
      "begin_line": 669,
      "end_line": 682,
      "comment": "\n     * Test that the addOrUpdate() method won\u0027t allow multiple time period\n     * classes.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 45)",
        "(line 671,col 9)-(line 671,col 44)",
        "(line 672,col 9)-(line 672,col 58)",
        "(line 674,col 9)-(line 674,col 29)",
        "(line 675,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate4()",
      "begin_line": 687,
      "end_line": 706,
      "comment": "\n     * Some more checks for the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 44)",
        "(line 689,col 9)-(line 689,col 79)",
        "(line 690,col 9)-(line 690,col 32)",
        "(line 691,col 9)-(line 691,col 58)",
        "(line 692,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 693,col 67)",
        "(line 696,col 9)-(line 696,col 35)",
        "(line 697,col 9)-(line 697,col 67)",
        "(line 699,col 9)-(line 699,col 80)",
        "(line 700,col 9)-(line 700,col 43)",
        "(line 701,col 9)-(line 701,col 32)",
        "(line 702,col 9)-(line 702,col 69)",
        "(line 704,col 9)-(line 704,col 28)",
        "(line 705,col 9)-(line 705,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1075255()",
      "begin_line": 711,
      "end_line": 724,
      "comment": "\n     * A test for the bug report 1075255.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 48)",
        "(line 713,col 9)-(line 713,col 46)",
        "(line 714,col 9)-(line 714,col 50)",
        "(line 715,col 9)-(line 715,col 47)",
        "(line 716,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1832432()",
      "begin_line": 729,
      "end_line": 745,
      "comment": "\n     * A test for bug 1832432.\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 49)",
        "(line 731,col 9)-(line 731,col 29)",
        "(line 732,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 29)",
        "(line 739,col 9)-(line 739,col 51)",
        "(line 740,col 9)-(line 740,col 34)",
        "(line 743,col 9)-(line 743,col 43)",
        "(line 744,col 9)-(line 744,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetIndex()",
      "begin_line": 750,
      "end_line": 765,
      "comment": "\n     * Some checks for the getIndex() method.\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 53)",
        "(line 752,col 9)-(line 752,col 62)",
        "(line 754,col 9)-(line 754,col 45)",
        "(line 755,col 9)-(line 755,col 61)",
        "(line 756,col 9)-(line 756,col 63)",
        "(line 757,col 9)-(line 757,col 62)",
        "(line 759,col 9)-(line 759,col 45)",
        "(line 760,col 9)-(line 760,col 63)",
        "(line 761,col 9)-(line 761,col 61)",
        "(line 762,col 9)-(line 762,col 62)",
        "(line 763,col 9)-(line 763,col 61)",
        "(line 764,col 9)-(line 764,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem1()",
      "begin_line": 770,
      "end_line": 803,
      "comment": "\n     * Some checks for the getDataItem(int) method.\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 48)",
        "(line 774,col 9)-(line 774,col 29)",
        "(line 775,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 781,col 25)",
        "(line 783,col 9)-(line 783,col 42)",
        "(line 784,col 9)-(line 784,col 56)",
        "(line 785,col 9)-(line 785,col 55)",
        "(line 786,col 9)-(line 786,col 21)",
        "(line 787,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 25)",
        "(line 795,col 9)-(line 795,col 21)",
        "(line 796,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem2()",
      "begin_line": 808,
      "end_line": 821,
      "comment": "\n     * Some checks for the getDataItem(RegularTimePeriod) method.\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 48)",
        "(line 810,col 9)-(line 810,col 55)",
        "(line 813,col 9)-(line 813,col 29)",
        "(line 814,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems()",
      "begin_line": 826,
      "end_line": 858,
      "comment": "\n     * Some checks for the removeAgedItems() method.\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 58)",
        "(line 828,col 9)-(line 828,col 39)",
        "(line 829,col 9)-(line 829,col 65)",
        "(line 830,col 9)-(line 830,col 70)",
        "(line 831,col 9)-(line 831,col 42)",
        "(line 834,col 9)-(line 834,col 37)",
        "(line 835,col 9)-(line 835,col 47)",
        "(line 836,col 9)-(line 836,col 47)",
        "(line 839,col 9)-(line 839,col 40)",
        "(line 840,col 9)-(line 840,col 36)",
        "(line 841,col 9)-(line 841,col 42)",
        "(line 842,col 9)-(line 842,col 37)",
        "(line 843,col 9)-(line 843,col 47)",
        "(line 844,col 9)-(line 844,col 47)",
        "(line 847,col 9)-(line 847,col 37)",
        "(line 848,col 9)-(line 848,col 40)",
        "(line 849,col 9)-(line 849,col 42)",
        "(line 850,col 9)-(line 850,col 36)",
        "(line 851,col 9)-(line 851,col 47)",
        "(line 852,col 9)-(line 852,col 57)",
        "(line 853,col 9)-(line 853,col 47)",
        "(line 854,col 9)-(line 854,col 36)",
        "(line 855,col 9)-(line 855,col 47)",
        "(line 856,col 9)-(line 856,col 57)",
        "(line 857,col 9)-(line 857,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems2()",
      "begin_line": 863,
      "end_line": 901,
      "comment": "\n     * Some checks for the removeAgedItems(long, boolean) method.\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 36)",
        "(line 865,col 9)-(line 865,col 58)",
        "(line 866,col 9)-(line 866,col 39)",
        "(line 867,col 9)-(line 867,col 65)",
        "(line 868,col 9)-(line 868,col 70)",
        "(line 869,col 9)-(line 869,col 42)",
        "(line 872,col 9)-(line 872,col 44)",
        "(line 873,col 9)-(line 873,col 47)",
        "(line 874,col 9)-(line 874,col 47)",
        "(line 877,col 9)-(line 877,col 40)",
        "(line 878,col 9)-(line 878,col 36)",
        "(line 879,col 9)-(line 879,col 42)",
        "(line 880,col 9)-(line 880,col 76)",
        "(line 881,col 9)-(line 881,col 47)",
        "(line 882,col 9)-(line 882,col 47)",
        "(line 883,col 9)-(line 883,col 44)",
        "(line 884,col 9)-(line 884,col 47)",
        "(line 885,col 9)-(line 885,col 46)",
        "(line 888,col 9)-(line 888,col 36)",
        "(line 889,col 9)-(line 889,col 40)",
        "(line 890,col 9)-(line 890,col 40)",
        "(line 891,col 9)-(line 891,col 47)",
        "(line 892,col 9)-(line 892,col 42)",
        "(line 893,col 9)-(line 893,col 47)",
        "(line 895,col 9)-(line 895,col 76)",
        "(line 896,col 9)-(line 896,col 47)",
        "(line 897,col 9)-(line 897,col 47)",
        "(line 898,col 9)-(line 898,col 44)",
        "(line 899,col 9)-(line 899,col 47)",
        "(line 900,col 9)-(line 900,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems3()",
      "begin_line": 907,
      "end_line": 917,
      "comment": "\n     * Calling removeAgedItems() on an empty series should not throw any\n     * exception.\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 46)",
        "(line 909,col 9)-(line 909,col 28)",
        "(line 910,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems4()",
      "begin_line": 923,
      "end_line": 933,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count.\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 45)",
        "(line 925,col 9)-(line 925,col 32)",
        "(line 926,col 9)-(line 926,col 36)",
        "(line 927,col 9)-(line 927,col 36)",
        "(line 928,col 9)-(line 928,col 36)",
        "(line 929,col 9)-(line 929,col 36)",
        "(line 930,col 9)-(line 930,col 43)",
        "(line 931,col 9)-(line 931,col 49)",
        "(line 932,col 9)-(line 932,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems5()",
      "begin_line": 939,
      "end_line": 950,
      "comment": "\n     * Check that the item bounds are determined correctly after a call to\n     * removeAgedItems().\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 45)",
        "(line 941,col 9)-(line 941,col 32)",
        "(line 942,col 9)-(line 942,col 36)",
        "(line 943,col 9)-(line 943,col 36)",
        "(line 944,col 9)-(line 944,col 36)",
        "(line 945,col 9)-(line 945,col 36)",
        "(line 946,col 9)-(line 946,col 72)",
        "(line 947,col 9)-(line 947,col 43)",
        "(line 948,col 9)-(line 948,col 49)",
        "(line 949,col 9)-(line 949,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testHashCode()",
      "begin_line": 955,
      "end_line": 980,
      "comment": "\n     * Some simple checks for the hashCode() method.\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 47)",
        "(line 957,col 9)-(line 957,col 47)",
        "(line 958,col 9)-(line 958,col 29)",
        "(line 959,col 9)-(line 959,col 51)",
        "(line 961,col 9)-(line 961,col 43)",
        "(line 962,col 9)-(line 962,col 43)",
        "(line 963,col 9)-(line 963,col 29)",
        "(line 964,col 9)-(line 964,col 51)",
        "(line 966,col 9)-(line 966,col 42)",
        "(line 967,col 9)-(line 967,col 42)",
        "(line 968,col 9)-(line 968,col 29)",
        "(line 969,col 9)-(line 969,col 51)",
        "(line 971,col 9)-(line 971,col 43)",
        "(line 972,col 9)-(line 972,col 43)",
        "(line 973,col 9)-(line 973,col 29)",
        "(line 974,col 9)-(line 974,col 51)",
        "(line 976,col 9)-(line 976,col 41)",
        "(line 977,col 9)-(line 977,col 41)",
        "(line 978,col 9)-(line 978,col 29)",
        "(line 979,col 9)-(line 979,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1864222()",
      "begin_line": 985,
      "end_line": 997,
      "comment": "\n     * Test for bug report 1864222.\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 43)",
        "(line 987,col 9)-(line 987,col 39)",
        "(line 988,col 9)-(line 988,col 39)",
        "(line 989,col 9)-(line 989,col 28)",
        "(line 990,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetMinY()",
      "begin_line": 1004,
      "end_line": 1025,
      "comment": "\n     * Some checks for the getMinY() method.\n     ",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 45)",
        "(line 1006,col 9)-(line 1006,col 47)",
        "(line 1008,col 9)-(line 1008,col 36)",
        "(line 1009,col 9)-(line 1009,col 49)",
        "(line 1011,col 9)-(line 1011,col 36)",
        "(line 1012,col 9)-(line 1012,col 49)",
        "(line 1014,col 9)-(line 1014,col 37)",
        "(line 1015,col 9)-(line 1015,col 49)",
        "(line 1017,col 9)-(line 1017,col 37)",
        "(line 1018,col 9)-(line 1018,col 50)",
        "(line 1020,col 9)-(line 1020,col 37)",
        "(line 1021,col 9)-(line 1021,col 50)",
        "(line 1023,col 9)-(line 1023,col 45)",
        "(line 1024,col 9)-(line 1024,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetMaxY()",
      "begin_line": 1030,
      "end_line": 1051,
      "comment": "\n     * Some checks for the getMaxY() method.\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 45)",
        "(line 1032,col 9)-(line 1032,col 47)",
        "(line 1034,col 9)-(line 1034,col 36)",
        "(line 1035,col 9)-(line 1035,col 49)",
        "(line 1037,col 9)-(line 1037,col 36)",
        "(line 1038,col 9)-(line 1038,col 49)",
        "(line 1040,col 9)-(line 1040,col 37)",
        "(line 1041,col 9)-(line 1041,col 50)",
        "(line 1043,col 9)-(line 1043,col 37)",
        "(line 1044,col 9)-(line 1044,col 50)",
        "(line 1046,col 9)-(line 1046,col 37)",
        "(line 1047,col 9)-(line 1047,col 50)",
        "(line 1049,col 9)-(line 1049,col 45)",
        "(line 1050,col 9)-(line 1050,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClear()",
      "begin_line": 1056,
      "end_line": 1067,
      "comment": "\n     * A test for the clear method.\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 45)",
        "(line 1058,col 9)-(line 1058,col 36)",
        "(line 1059,col 9)-(line 1059,col 36)",
        "(line 1061,col 9)-(line 1061,col 43)",
        "(line 1063,col 9)-(line 1063,col 19)",
        "(line 1064,col 9)-(line 1064,col 43)",
        "(line 1065,col 9)-(line 1065,col 47)",
        "(line 1066,col 9)-(line 1066,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAdd()",
      "begin_line": 1073,
      "end_line": 1082,
      "comment": "\n     * Check that the item bounds are determined correctly when there is a\n     * maximum item count and a new value is added.\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 45)",
        "(line 1075,col 9)-(line 1075,col 34)",
        "(line 1076,col 9)-(line 1076,col 36)",
        "(line 1077,col 9)-(line 1077,col 36)",
        "(line 1078,col 9)-(line 1078,col 36)",
        "(line 1079,col 9)-(line 1079,col 43)",
        "(line 1080,col 9)-(line 1080,col 49)",
        "(line 1081,col 9)-(line 1081,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testUpdate_RegularTimePeriod()",
      "begin_line": 1087,
      "end_line": 1100,
      "comment": "\n     * Some checks for the update(RegularTimePeriod...method).\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 45)",
        "(line 1089,col 9)-(line 1089,col 36)",
        "(line 1090,col 9)-(line 1090,col 36)",
        "(line 1091,col 9)-(line 1091,col 36)",
        "(line 1092,col 9)-(line 1092,col 51)",
        "(line 1093,col 9)-(line 1093,col 49)",
        "(line 1094,col 9)-(line 1094,col 51)",
        "(line 1095,col 9)-(line 1095,col 49)",
        "(line 1096,col 9)-(line 1096,col 40)",
        "(line 1097,col 9)-(line 1097,col 49)",
        "(line 1098,col 9)-(line 1098,col 40)",
        "(line 1099,col 9)-(line 1099,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAdd_TimeSeriesDataItem()",
      "begin_line": 1106,
      "end_line": 1113,
      "comment": "\n     * Create a TimeSeriesDataItem, add it to a TimeSeries.  Now, modifying\n     * the original TimeSeriesDataItem should NOT affect the TimeSeries.\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 78)",
        "(line 1108,col 9)-(line 1108,col 49)",
        "(line 1109,col 9)-(line 1109,col 25)",
        "(line 1110,col 9)-(line 1110,col 55)",
        "(line 1111,col 9)-(line 1111,col 40)",
        "(line 1112,col 9)-(line 1112,col 56)"
      ]
    }
  ]
}