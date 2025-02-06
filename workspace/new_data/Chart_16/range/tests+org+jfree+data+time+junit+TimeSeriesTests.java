{
  "filepath": "/tmp/Chart-16b/tests/org/jfree/data/time/junit/TimeSeriesTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeriesTests",
      "is_interface": false,
      "parent_types": [
        "TestCase",
        "org.jfree.data.general.SeriesChangeListener"
      ],
      "begin_line": 79,
      "end_line": 819,
      "comment": "\n * A collection of test cases for the {@link TimeSeries} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesA"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesB"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesC"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " A time series. "
    },
    {
      "type": "field",
      "varNames": [
        "gotSeriesChangeEvent"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " A flag that indicates whether or not a change event was fired. "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.suite()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.TimeSeriesTests(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.setUp()",
      "begin_line": 114,
      "end_line": 149,
      "comment": "\n     * Common test setup.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 62)",
        "(line 117,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 62)",
        "(line 130,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 62)",
        "(line 140,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.seriesChanged(org.jfree.data.general.SeriesChangeEvent)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Sets the flag to indicate that a {@link SeriesChangeEvent} has been \n     * received.\n     * \n     * @param event  the event.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone()",
      "begin_line": 164,
      "end_line": 207,
      "comment": "\n     * Check that cloning works.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 58)",
        "(line 168,col 9)-(line 168,col 80)",
        "(line 169,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 32)",
        "(line 177,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 65)",
        "(line 192,col 9)-(line 192,col 43)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 38)",
        "(line 198,col 9)-(line 198,col 37)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 200,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testClone2()",
      "begin_line": 212,
      "end_line": 231,
      "comment": "\n     * Another test of the clone() method.\n     ",
      "child_ranges": [
        "(line 213,col 6)-(line 213,col 54)",
        "(line 214,col 6)-(line 214,col 35)",
        "(line 215,col 6)-(line 215,col 34)",
        "(line 216,col 6)-(line 216,col 35)",
        "(line 217,col 6)-(line 217,col 26)",
        "(line 218,col 6)-(line 223,col 6)",
        "(line 224,col 6)-(line 224,col 31)",
        "(line 227,col 6)-(line 227,col 43)",
        "(line 228,col 6)-(line 228,col 32)",
        "(line 229,col 6)-(line 229,col 43)",
        "(line 230,col 6)-(line 230,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddValue()",
      "begin_line": 236,
      "end_line": 248,
      "comment": "\n     * Add a value to series A for 1999.  It should be added at index 0.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 56)",
        "(line 246,col 9)-(line 246,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetValue()",
      "begin_line": 253,
      "end_line": 260,
      "comment": "\n     * Tests the retrieval of values.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 62)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 70)",
        "(line 258,col 9)-(line 258,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * Tests the deletion of values.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 267,col 53)",
        "(line 268,col 9)-(line 268,col 61)",
        "(line 269,col 9)-(line 269,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testDelete2()",
      "begin_line": 275,
      "end_line": 300,
      "comment": "\n     * Basic tests for the delete() method.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 61)",
        "(line 277,col 9)-(line 277,col 38)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 279,col 37)",
        "(line 280,col 9)-(line 280,col 35)",
        "(line 281,col 9)-(line 281,col 42)",
        "(line 282,col 9)-(line 282,col 34)",
        "(line 283,col 9)-(line 283,col 46)",
        "(line 284,col 9)-(line 284,col 43)",
        "(line 285,col 9)-(line 285,col 56)",
        "(line 288,col 9)-(line 288,col 42)",
        "(line 289,col 9)-(line 289,col 34)",
        "(line 290,col 9)-(line 290,col 47)",
        "(line 293,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSerialization()",
      "begin_line": 305,
      "end_line": 332,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 61)",
        "(line 308,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 309,col 38)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 311,col 9)-(line 311,col 38)",
        "(line 312,col 9)-(line 312,col 38)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 315,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals()",
      "begin_line": 337,
      "end_line": 374,
      "comment": "\n     * Tests the equals method.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 56)",
        "(line 339,col 9)-(line 339,col 56)",
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 341,col 30)",
        "(line 343,col 9)-(line 343,col 35)",
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 345,col 29)",
        "(line 347,col 9)-(line 347,col 41)",
        "(line 348,col 9)-(line 348,col 41)",
        "(line 349,col 9)-(line 349,col 26)",
        "(line 350,col 9)-(line 350,col 26)",
        "(line 351,col 9)-(line 351,col 35)",
        "(line 352,col 9)-(line 352,col 30)",
        "(line 354,col 9)-(line 354,col 26)",
        "(line 355,col 9)-(line 355,col 26)",
        "(line 356,col 9)-(line 356,col 35)",
        "(line 357,col 9)-(line 357,col 29)",
        "(line 359,col 9)-(line 359,col 36)",
        "(line 360,col 9)-(line 360,col 35)",
        "(line 361,col 9)-(line 361,col 30)",
        "(line 363,col 9)-(line 363,col 36)",
        "(line 364,col 9)-(line 364,col 35)",
        "(line 365,col 9)-(line 365,col 29)",
        "(line 367,col 9)-(line 367,col 34)",
        "(line 368,col 9)-(line 368,col 35)",
        "(line 369,col 9)-(line 369,col 30)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 35)",
        "(line 373,col 9)-(line 373,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testEquals2()",
      "begin_line": 380,
      "end_line": 384,
      "comment": "\n     * Tests a specific bug report where null arguments in the constructor \n     * cause the equals() method to fail.  Fixed for 0.9.21.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 72)",
        "(line 382,col 9)-(line 382,col 72)",
        "(line 383,col 9)-(line 383,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy1()",
      "begin_line": 390,
      "end_line": 478,
      "comment": "\n     * Some tests to ensure that the createCopy(RegularTimePeriod, \n     * RegularTimePeriod) method is functioning correctly.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 66)",
        "(line 393,col 9)-(line 393,col 66)",
        "(line 394,col 9)-(line 394,col 67)",
        "(line 395,col 9)-(line 395,col 63)",
        "(line 396,col 9)-(line 396,col 67)",
        "(line 397,col 9)-(line 397,col 67)",
        "(line 399,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testCreateCopy2()",
      "begin_line": 484,
      "end_line": 554,
      "comment": "\n     * Some tests to ensure that the createCopy(int, int) method is \n     * functioning correctly.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 66)",
        "(line 487,col 9)-(line 487,col 66)",
        "(line 488,col 9)-(line 488,col 67)",
        "(line 489,col 9)-(line 489,col 63)",
        "(line 490,col 9)-(line 490,col 67)",
        "(line 491,col 9)-(line 491,col 67)",
        "(line 493,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 521,col 29)",
        "(line 522,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 25)",
        "(line 534,col 9)-(line 534,col 21)",
        "(line 535,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 25)",
        "(line 546,col 9)-(line 546,col 56)",
        "(line 547,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testSetMaximumItemCount()",
      "begin_line": 561,
      "end_line": 576,
      "comment": "\n     * Test the setMaximumItemCount() method to ensure that it removes items \n     * from the series if necessary.\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 57)",
        "(line 564,col 9)-(line 564,col 38)",
        "(line 565,col 9)-(line 565,col 38)",
        "(line 566,col 9)-(line 566,col 37)",
        "(line 567,col 9)-(line 567,col 38)",
        "(line 568,col 9)-(line 568,col 38)",
        "(line 570,col 9)-(line 570,col 43)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 43)",
        "(line 573,col 9)-(line 573,col 52)",
        "(line 574,col 9)-(line 574,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testAddOrUpdate()",
      "begin_line": 581,
      "end_line": 592,
      "comment": "\n     * Some checks for the addOrUpdate() method.\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 57)",
        "(line 583,col 9)-(line 583,col 34)",
        "(line 584,col 9)-(line 584,col 46)",
        "(line 585,col 9)-(line 585,col 43)",
        "(line 586,col 9)-(line 586,col 46)",
        "(line 587,col 9)-(line 587,col 43)",
        "(line 588,col 9)-(line 588,col 46)",
        "(line 589,col 9)-(line 589,col 43)",
        "(line 590,col 9)-(line 590,col 46)",
        "(line 591,col 9)-(line 591,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1075255()",
      "begin_line": 597,
      "end_line": 610,
      "comment": "\n     * A test for the bug report 1075255.\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 72)",
        "(line 599,col 9)-(line 599,col 46)",
        "(line 600,col 9)-(line 600,col 74)",
        "(line 601,col 9)-(line 601,col 47)",
        "(line 602,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testBug1832432()",
      "begin_line": 615,
      "end_line": 631,
      "comment": " \n     * A test for bug 1832432.\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 29)",
        "(line 618,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 29)",
        "(line 625,col 9)-(line 625,col 51)",
        "(line 626,col 9)-(line 626,col 34)",
        "(line 629,col 9)-(line 629,col 43)",
        "(line 630,col 9)-(line 630,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetIndex()",
      "begin_line": 636,
      "end_line": 651,
      "comment": "\n     * Some checks for the getIndex() method.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 66)",
        "(line 638,col 9)-(line 638,col 62)",
        "(line 640,col 9)-(line 640,col 45)",
        "(line 641,col 9)-(line 641,col 61)",
        "(line 642,col 9)-(line 642,col 63)",
        "(line 643,col 9)-(line 643,col 62)",
        "(line 645,col 9)-(line 645,col 45)",
        "(line 646,col 9)-(line 646,col 63)",
        "(line 647,col 9)-(line 647,col 61)",
        "(line 648,col 9)-(line 648,col 62)",
        "(line 649,col 9)-(line 649,col 61)",
        "(line 650,col 9)-(line 650,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem1()",
      "begin_line": 656,
      "end_line": 689,
      "comment": "\n     * Some checks for the getDataItem(int) method.\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 60)",
        "(line 660,col 9)-(line 660,col 29)",
        "(line 661,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 25)",
        "(line 669,col 9)-(line 669,col 42)",
        "(line 670,col 9)-(line 670,col 56)",
        "(line 671,col 9)-(line 671,col 55)",
        "(line 672,col 9)-(line 672,col 21)",
        "(line 673,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 25)",
        "(line 681,col 9)-(line 681,col 21)",
        "(line 682,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testGetDataItem2()",
      "begin_line": 694,
      "end_line": 707,
      "comment": "\n     * Some checks for the getDataItem(RegularTimePeriod) method.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 60)",
        "(line 696,col 9)-(line 696,col 55)",
        "(line 699,col 9)-(line 699,col 29)",
        "(line 700,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems()",
      "begin_line": 712,
      "end_line": 744,
      "comment": "\n     * Some checks for the removeAgedItems() method.\n     ",
      "child_ranges": [
        "(line 713,col 6)-(line 713,col 67)",
        "(line 714,col 6)-(line 714,col 36)",
        "(line 715,col 6)-(line 715,col 62)",
        "(line 716,col 6)-(line 716,col 67)",
        "(line 717,col 6)-(line 717,col 39)",
        "(line 720,col 6)-(line 720,col 34)",
        "(line 721,col 6)-(line 721,col 44)",
        "(line 722,col 6)-(line 722,col 44)",
        "(line 725,col 6)-(line 725,col 37)",
        "(line 726,col 6)-(line 726,col 33)",
        "(line 727,col 6)-(line 727,col 39)",
        "(line 728,col 6)-(line 728,col 34)",
        "(line 729,col 6)-(line 729,col 44)",
        "(line 730,col 6)-(line 730,col 44)",
        "(line 733,col 6)-(line 733,col 34)",
        "(line 734,col 6)-(line 734,col 37)",
        "(line 735,col 6)-(line 735,col 39)",
        "(line 736,col 6)-(line 736,col 33)",
        "(line 737,col 6)-(line 737,col 44)",
        "(line 738,col 6)-(line 738,col 54)",
        "(line 739,col 6)-(line 739,col 44)",
        "(line 740,col 6)-(line 740,col 33)",
        "(line 741,col 6)-(line 741,col 44)",
        "(line 742,col 6)-(line 742,col 54)",
        "(line 743,col 6)-(line 743,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testRemoveAgedItems2()",
      "begin_line": 749,
      "end_line": 787,
      "comment": "\n     * Some checks for the removeAgedItems(long, boolean) method.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 36)",
        "(line 751,col 6)-(line 751,col 67)",
        "(line 752,col 6)-(line 752,col 36)",
        "(line 753,col 6)-(line 753,col 62)",
        "(line 754,col 6)-(line 754,col 67)",
        "(line 755,col 6)-(line 755,col 39)",
        "(line 758,col 6)-(line 758,col 41)",
        "(line 759,col 6)-(line 759,col 44)",
        "(line 760,col 6)-(line 760,col 44)",
        "(line 763,col 9)-(line 763,col 40)",
        "(line 764,col 9)-(line 764,col 36)",
        "(line 765,col 9)-(line 765,col 42)",
        "(line 766,col 9)-(line 766,col 76)",
        "(line 767,col 9)-(line 767,col 47)",
        "(line 768,col 9)-(line 768,col 47)",
        "(line 769,col 9)-(line 769,col 44)",
        "(line 770,col 9)-(line 770,col 47)",
        "(line 771,col 9)-(line 771,col 46)",
        "(line 774,col 9)-(line 774,col 36)",
        "(line 775,col 9)-(line 775,col 40)",
        "(line 776,col 9)-(line 776,col 40)",
        "(line 777,col 9)-(line 777,col 47)",
        "(line 778,col 9)-(line 778,col 42)",
        "(line 779,col 9)-(line 779,col 47)",
        "(line 781,col 9)-(line 781,col 76)",
        "(line 782,col 9)-(line 782,col 47)",
        "(line 783,col 9)-(line 783,col 47)",
        "(line 784,col 9)-(line 784,col 44)",
        "(line 785,col 9)-(line 785,col 47)",
        "(line 786,col 9)-(line 786,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.junit.TimeSeriesTests.testHashCode()",
      "begin_line": 792,
      "end_line": 817,
      "comment": "\n     * Some simple checks for the hashCode() method.\n     ",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 47)",
        "(line 794,col 9)-(line 794,col 47)",
        "(line 795,col 9)-(line 795,col 29)",
        "(line 796,col 9)-(line 796,col 51)",
        "(line 798,col 9)-(line 798,col 43)",
        "(line 799,col 9)-(line 799,col 43)",
        "(line 800,col 9)-(line 800,col 29)",
        "(line 801,col 9)-(line 801,col 51)",
        "(line 803,col 9)-(line 803,col 42)",
        "(line 804,col 9)-(line 804,col 42)",
        "(line 805,col 9)-(line 805,col 29)",
        "(line 806,col 9)-(line 806,col 51)",
        "(line 808,col 9)-(line 808,col 43)",
        "(line 809,col 9)-(line 809,col 43)",
        "(line 810,col 9)-(line 810,col 29)",
        "(line 811,col 9)-(line 811,col 51)",
        "(line 813,col 9)-(line 813,col 41)",
        "(line 814,col 9)-(line 814,col 41)",
        "(line 815,col 9)-(line 815,col 29)",
        "(line 816,col 9)-(line 816,col 51)"
      ]
    }
  ]
}