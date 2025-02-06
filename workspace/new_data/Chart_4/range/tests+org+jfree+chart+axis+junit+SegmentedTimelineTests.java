{
  "filepath": "/tmp/Chart-4b/tests/org/jfree/chart/axis/junit/SegmentedTimelineTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SegmentedTimelineTests",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 69,
      "end_line": 1162,
      "comment": "\n * JUnit Tests for the {@link SegmentedTimeline} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_CYCLE_START"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " These constants control test cycles in the validateXXXX methods. "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_CYCLE_END"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " These constants control test cycles in the validateXXXX methods. "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_CYCLE_INC"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " These constants control test cycles in the validateXXXX methods. "
    },
    {
      "type": "field",
      "varNames": [
        "FIVE_YEARS"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": " Number of ms in five years "
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_FORMAT"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": " Number format object for ms tests. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_FORMAT"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Date format object for Monday through Friday tests. "
    },
    {
      "type": "field",
      "varNames": [
        "DATE_TIME_FORMAT"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Date format object 9:00 AM to 4:00 PM tests. "
    },
    {
      "type": "field",
      "varNames": [
        "MS_EXCEPTIONS"
      ],
      "begin_line": 95,
      "end_line": 97,
      "comment": " Some ms exceptions for ms testing. "
    },
    {
      "type": "field",
      "varNames": [
        "MS2_BASE_TIMELINE_EXCEPTIONS"
      ],
      "begin_line": 100,
      "end_line": 102,
      "comment": " Some ms4 exceptions for ms testing. "
    },
    {
      "type": "field",
      "varNames": [
        "US_HOLIDAYS"
      ],
      "begin_line": 105,
      "end_line": 111,
      "comment": " US non-trading dates in 2000 through 2002 to test exceptions. "
    },
    {
      "type": "field",
      "varNames": [
        "FIFTEEN_MIN_EXCEPTIONS"
      ],
      "begin_line": 114,
      "end_line": 128,
      "comment": " Some test exceptions for the fifteen min timeline. "
    },
    {
      "type": "field",
      "varNames": [
        "msTimeline"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Our 1-ms test timeline using 5 included and 2 excluded segments. "
    },
    {
      "type": "field",
      "varNames": [
        "ms2Timeline"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Our 1-ms test timeline (with baseTimeline) using 2 included and 2\n     * excluded segments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ms2BaseTimeline"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Our 4-ms test base timeline for ms2Timeline using 1 included and 1\n     * excluded segments\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mondayFridayTimeline"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Our test Monday through Friday test timeline. "
    },
    {
      "type": "field",
      "varNames": [
        "fifteenMinTimeline"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Our 9:00 AM to 4:00 PM fifteen minute timeline. "
    },
    {
      "type": "field",
      "varNames": [
        "monday"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " ms from 1970-01-01 to first monday after 2001-01-01. "
    },
    {
      "type": "field",
      "varNames": [
        "monday9am"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " ms from 1970-01-01 to 9 am first monday after 2001-01-01. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.suite()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the tests as a test suite.\n     *\n     * @return The test suite.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.SegmentedTimelineTests(java.lang.String)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Constructs a new set of tests.\n     *\n     * @param name  the name of the tests.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.setUp()",
      "begin_line": 190,
      "end_line": 282,
      "comment": "\n     * Sets up the fixture, for example, open a network connection.\n     * This method is called before a test is executed.\n     *\n     * @throws Exception if there is a problem.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 57)",
        "(line 212,col 9)-(line 212,col 40)",
        "(line 228,col 9)-(line 228,col 62)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 259,col 9)-(line 259,col 63)",
        "(line 262,col 9)-(line 263,col 69)",
        "(line 266,col 9)-(line 267,col 63)",
        "(line 270,col 9)-(line 271,col 52)",
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 41)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.tearDown()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Tears down the fixture, for example, close a network connection.\n     * This method is called after a test is executed.\n     *\n     * @throws Exception if there is a problem.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsSegmentedTimeline()",
      "begin_line": 302,
      "end_line": 308,
      "comment": "\n     * Tests that the new method that created the msTimeline segmented\n     * timeline did so correctly.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 58)",
        "(line 305,col 9)-(line 305,col 56)",
        "(line 306,col 9)-(line 306,col 63)",
        "(line 307,col 9)-(line 307,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2SegmentedTimeline()",
      "begin_line": 314,
      "end_line": 321,
      "comment": "\n     * Tests that the new method that created the ms2Timeline segmented\n     * timeline did so correctly.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 59)",
        "(line 317,col 9)-(line 317,col 57)",
        "(line 318,col 9)-(line 318,col 64)",
        "(line 319,col 9)-(line 319,col 64)",
        "(line 320,col 9)-(line 320,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMondayThroughFridaySegmentedTimeline()",
      "begin_line": 327,
      "end_line": 335,
      "comment": "\n     * Tests that the factory method that creates Monday through Friday\n     * segmented timeline does so correctly.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 330,col 60)",
        "(line 331,col 9)-(line 332,col 58)",
        "(line 333,col 9)-(line 333,col 73)",
        "(line 334,col 9)-(line 334,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinSegmentedTimeline()",
      "begin_line": 341,
      "end_line": 349,
      "comment": "\n     * Tests that the factory method that creates a 15-min 9:00 AM  4:00 PM\n     * segmented axis does so correctly.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 343,col 58)",
        "(line 344,col 9)-(line 346,col 56)",
        "(line 347,col 9)-(line 347,col 72)",
        "(line 348,col 9)-(line 348,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsSegment()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Tests one segment of the ms timeline. Internal indices\n     * inside one segment as well as adjacent segments are verified.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2Segment()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Tests one segment of the ms timeline. Internal indices\n     * inside one segment as well as adjacent segments are verified.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMondayThroughFridaySegment()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * Tests one segment of the Monday through Friday timeline. Internal indices\n     * inside one segment as well as adjacent segments are verified.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinSegment()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Tests one segment of the Fifteen timeline. Internal indices\n     * inside one segment as well as adjacent segments are verified.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyOneSegment(org.jfree.chart.axis.SegmentedTimeline)",
      "begin_line": 392,
      "end_line": 458,
      "comment": "\n     * Tests one segment of the Monday through Friday timeline. Internal indices\n     * inside one segment as well as adjacent segments are verified.\n     * @param timeline the timeline to use for verifications.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsInc()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Tests the inc methods on the msTimeline.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2Inc()",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Tests the inc methods on the msTimeline.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMondayThroughFridayInc()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Tests the inc methods on the Monday through Friday timeline.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinInc()",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Tests the inc methods on the Fifteen minute timeline.\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyInc(org.jfree.chart.axis.SegmentedTimeline)",
      "begin_line": 496,
      "end_line": 549,
      "comment": "\n     * Tests the inc methods.\n     * @param timeline the timeline to use for verifications.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 548,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsIncludedAndExcludedSegments()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Tests that the msTimeline\u0027s included and excluded\n     * segments are being calculated correctly.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2IncludedAndExcludedSegments()",
      "begin_line": 567,
      "end_line": 569,
      "comment": "\n     * Tests that the ms2Timeline\u0027s included and excluded\n     * segments are being calculated correctly.\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMondayThroughFridayIncludedAndExcludedSegments()",
      "begin_line": 576,
      "end_line": 579,
      "comment": "\n     * Tests that the Monday through Friday timeline\u0027s included and excluded\n     * segments are being calculated correctly. The test is performed starting\n     * on the first monday after 1/1/2000 and for five years.\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 578,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinIncludedAndExcludedSegments()",
      "begin_line": 586,
      "end_line": 589,
      "comment": "\n     * Tests that the Fifteen-Min timeline\u0027s included and excluded\n     * segments are being calculated correctly. The test is performed starting\n     * on the first monday after 1/1/2000 and for five years.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 588,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyIncludedAndExcludedSegments(org.jfree.chart.axis.SegmentedTimeline, long)",
      "begin_line": 598,
      "end_line": 621,
      "comment": "\n     * Tests that a timeline\u0027s included and excluded segments are being\n     * calculated correctly.\n     *\n     * @param timeline the timeline to verify\n     * @param n the first segment number to start verifying\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 65)",
        "(line 604,col 9)-(line 604,col 67)",
        "(line 605,col 9)-(line 620,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsExceptionSegments()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n     * Tests methods related to exceptions methods in the msTimeline.\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2BaseTimelineExceptionSegments()",
      "begin_line": 641,
      "end_line": 644,
      "comment": "\n     * Tests methods related to exceptions methods in the ms2BaseTimeline.\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 643,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMondayThoughFridayExceptionSegments()",
      "begin_line": 651,
      "end_line": 655,
      "comment": "\n     * Tests methods related to exceptions methods in the mondayFridayTimeline.\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 654,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinExceptionSegments()",
      "begin_line": 662,
      "end_line": 665,
      "comment": "\n     * Tests methods related to exceptions methods in the fifteenMinTimeline.\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 664,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyExceptionSegments(org.jfree.chart.axis.SegmentedTimeline, java.lang.String[], java.text.Format)",
      "begin_line": 676,
      "end_line": 704,
      "comment": "\n     * Tests methods related to adding exceptions.\n     *\n     * @param timeline the timeline to verify\n     * @param exceptionString array of Strings that represent the exceptions\n     * @param fmt Format object that can parse the exceptionString strings\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 683,col 21)",
        "(line 685,col 9)-(line 685,col 33)",
        "(line 688,col 9)-(line 688,col 79)",
        "(line 689,col 9)-(line 690,col 34)",
        "(line 691,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMsTranslations()",
      "begin_line": 715,
      "end_line": 718,
      "comment": "\n     * Tests translations for 1-ms timeline\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 78)",
        "(line 717,col 9)-(line 717,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2BaseTimelineTranslations()",
      "begin_line": 725,
      "end_line": 729,
      "comment": "\n     * Tests translations for the base timeline used for the ms2Timeline\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 727,col 61)",
        "(line 728,col 9)-(line 728,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testMs2Translations()",
      "begin_line": 736,
      "end_line": 741,
      "comment": "\n     * Tests translations for the Monday through Friday timeline\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 738,col 61)",
        "(line 739,col 9)-(line 739,col 76)",
        "(line 740,col 9)-(line 740,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.textMondayThroughFridayTranslations()",
      "begin_line": 748,
      "end_line": 753,
      "comment": "\n     * Tests translations for the Monday through Friday timeline\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 750,col 29)",
        "(line 751,col 9)-(line 752,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testFifteenMinTranslations()",
      "begin_line": 760,
      "end_line": 770,
      "comment": "\n     * Tests translations for the Fifteen Min timeline\n     *\n     * @throws ParseException if there is a parsing error.\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 762,col 58)",
        "(line 763,col 9)-(line 764,col 42)",
        "(line 765,col 9)-(line 767,col 65)",
        "(line 768,col 9)-(line 769,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyTranslations(org.jfree.chart.axis.SegmentedTimeline, long)",
      "begin_line": 778,
      "end_line": 811,
      "comment": "\n     * Tests translations between timelines.\n     *\n     * @param timeline the timeline to use for verifications.\n     * @param startTest  ??.\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testSerialization()",
      "begin_line": 820,
      "end_line": 826,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 45)",
        "(line 822,col 9)-(line 822,col 46)",
        "(line 823,col 9)-(line 823,col 50)",
        "(line 824,col 9)-(line 824,col 80)",
        "(line 825,col 9)-(line 825,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifySerialization(org.jfree.chart.axis.SegmentedTimeline)",
      "begin_line": 832,
      "end_line": 850,
      "comment": "\n     * Tests serialization of an instance.\n     * @param a1 The timeline to verify the serialization\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 36)",
        "(line 835,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.verifyFillInExceptions(org.jfree.chart.axis.SegmentedTimeline, java.lang.String[], java.text.Format)",
      "begin_line": 862,
      "end_line": 901,
      "comment": "\n     * Adds an array of exceptions to the timeline. The timeline exception list\n     * is first cleared.\n     * @param timeline The timeline where the exceptions will be stored\n     * @param exceptionString The exceptions to load\n     * @param fmt The date formatter to use to parse each exceptions[i] value\n     * @throws ParseException If there is any exception parsing each\n     *         exceptions[i] value.\n     * @return An array of Dates[] containing each exception date.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 65)",
        "(line 867,col 9)-(line 867,col 64)",
        "(line 870,col 9)-(line 870,col 50)",
        "(line 871,col 9)-(line 889,col 9)",
        "(line 892,col 9)-(line 892,col 58)",
        "(line 893,col 9)-(line 893,col 18)",
        "(line 894,col 9)-(line 897,col 9)",
        "(line 899,col 9)-(line 899,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.fillInBaseTimelineExceptions(org.jfree.chart.axis.SegmentedTimeline, java.lang.String[], java.text.Format)",
      "begin_line": 912,
      "end_line": 940,
      "comment": "\n     * Adds an array of exceptions relative to the base timeline.\n     *\n     * @param timeline The timeline where the exceptions will be stored\n     * @param exceptionString The exceptions to load\n     * @param fmt The date formatter to use to parse each exceptions[i] value\n     * @throws ParseException If there is any exception parsing each\n     *                        exceptions[i] value.\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 68)",
        "(line 916,col 9)-(line 939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.fillInBaseTimelineExclusionsAsExceptions(org.jfree.chart.axis.SegmentedTimeline, long, long)",
      "begin_line": 950,
      "end_line": 976,
      "comment": "\n     * Adds new exceptions to a timeline. The exceptions are the excluded\n     * segments from its base timeline.\n     *\n     * @param timeline  the timeline.\n     * @param from  the start.\n     * @param to  the end.\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 53)",
        "(line 957,col 9)-(line 975,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testCloning()",
      "begin_line": 981,
      "end_line": 993,
      "comment": "\n     * Confirm that cloning works.\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 65)",
        "(line 983,col 9)-(line 983,col 36)",
        "(line 984,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 29)",
        "(line 991,col 9)-(line 991,col 51)",
        "(line 992,col 9)-(line 992,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testEquals()",
      "begin_line": 998,
      "end_line": 1025,
      "comment": "\n     * Confirm that the equals method can distinguish all the required fields.\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 65)",
        "(line 1001,col 9)-(line 1001,col 65)",
        "(line 1002,col 9)-(line 1002,col 34)",
        "(line 1004,col 9)-(line 1004,col 47)",
        "(line 1005,col 9)-(line 1005,col 47)",
        "(line 1006,col 9)-(line 1006,col 35)",
        "(line 1008,col 9)-(line 1008,col 47)",
        "(line 1009,col 9)-(line 1009,col 47)",
        "(line 1010,col 9)-(line 1010,col 35)",
        "(line 1012,col 9)-(line 1012,col 47)",
        "(line 1013,col 9)-(line 1013,col 47)",
        "(line 1014,col 9)-(line 1014,col 35)",
        "(line 1016,col 9)-(line 1016,col 47)",
        "(line 1017,col 9)-(line 1017,col 47)",
        "(line 1020,col 9)-(line 1020,col 31)",
        "(line 1021,col 9)-(line 1021,col 35)",
        "(line 1022,col 9)-(line 1022,col 31)",
        "(line 1023,col 9)-(line 1023,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testHashCode()",
      "begin_line": 1030,
      "end_line": 1037,
      "comment": "\n     * Two objects that are equal are required to return the same hashCode.\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 65)",
        "(line 1032,col 9)-(line 1032,col 65)",
        "(line 1033,col 9)-(line 1033,col 34)",
        "(line 1034,col 9)-(line 1034,col 31)",
        "(line 1035,col 9)-(line 1035,col 31)",
        "(line 1036,col 9)-(line 1036,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testSerialization2()",
      "begin_line": 1042,
      "end_line": 1064,
      "comment": "\n     * Serialize an instance, restore it, and check for equality.\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 65)",
        "(line 1045,col 9)-(line 1045,col 36)",
        "(line 1047,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1061,col 34)",
        "(line 1062,col 9)-(line 1062,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testBasicSegmentedTimeline()",
      "begin_line": 1073,
      "end_line": 1103,
      "comment": "\n     * Tests a basic segmented timeline.\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 64)",
        "(line 1075,col 9)-(line 1075,col 40)",
        "(line 1076,col 9)-(line 1076,col 60)",
        "(line 1077,col 9)-(line 1077,col 59)",
        "(line 1078,col 9)-(line 1078,col 59)",
        "(line 1079,col 9)-(line 1079,col 60)",
        "(line 1080,col 9)-(line 1080,col 60)",
        "(line 1081,col 9)-(line 1081,col 59)",
        "(line 1082,col 9)-(line 1082,col 59)",
        "(line 1083,col 9)-(line 1083,col 60)",
        "(line 1084,col 9)-(line 1084,col 60)",
        "(line 1085,col 9)-(line 1085,col 59)",
        "(line 1087,col 9)-(line 1087,col 60)",
        "(line 1088,col 9)-(line 1088,col 61)",
        "(line 1089,col 9)-(line 1089,col 61)",
        "(line 1090,col 9)-(line 1090,col 61)",
        "(line 1091,col 9)-(line 1091,col 61)",
        "(line 1092,col 9)-(line 1092,col 61)",
        "(line 1093,col 9)-(line 1093,col 61)",
        "(line 1094,col 9)-(line 1094,col 61)",
        "(line 1095,col 9)-(line 1095,col 61)",
        "(line 1097,col 9)-(line 1097,col 58)",
        "(line 1098,col 9)-(line 1098,col 59)",
        "(line 1099,col 9)-(line 1099,col 59)",
        "(line 1100,col 9)-(line 1100,col 59)",
        "(line 1101,col 9)-(line 1101,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.testSegmentedTimelineWithException1()",
      "begin_line": 1108,
      "end_line": 1142,
      "comment": "\n     * Tests a basic time line with one exception.\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 64)",
        "(line 1110,col 9)-(line 1110,col 40)",
        "(line 1111,col 9)-(line 1111,col 40)",
        "(line 1112,col 9)-(line 1112,col 60)",
        "(line 1113,col 9)-(line 1113,col 59)",
        "(line 1114,col 9)-(line 1114,col 59)",
        "(line 1115,col 9)-(line 1115,col 60)",
        "(line 1116,col 9)-(line 1116,col 60)",
        "(line 1117,col 9)-(line 1117,col 60)",
        "(line 1118,col 9)-(line 1118,col 60)",
        "(line 1119,col 9)-(line 1119,col 59)",
        "(line 1120,col 9)-(line 1120,col 59)",
        "(line 1121,col 9)-(line 1121,col 60)",
        "(line 1122,col 9)-(line 1122,col 60)",
        "(line 1123,col 9)-(line 1123,col 59)",
        "(line 1126,col 9)-(line 1126,col 60)",
        "(line 1127,col 9)-(line 1127,col 61)",
        "(line 1128,col 9)-(line 1128,col 61)",
        "(line 1129,col 9)-(line 1129,col 61)",
        "(line 1130,col 9)-(line 1130,col 61)",
        "(line 1131,col 9)-(line 1131,col 61)",
        "(line 1132,col 9)-(line 1132,col 61)",
        "(line 1133,col 9)-(line 1133,col 61)",
        "(line 1134,col 9)-(line 1134,col 61)",
        "(line 1136,col 9)-(line 1136,col 58)",
        "(line 1137,col 9)-(line 1137,col 59)",
        "(line 1138,col 9)-(line 1138,col 59)",
        "(line 1139,col 9)-(line 1139,col 59)",
        "(line 1140,col 9)-(line 1140,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.junit.SegmentedTimelineTests.main(java.lang.String[])",
      "begin_line": 1155,
      "end_line": 1160,
      "comment": "\n     * Only use to debug JUnit suite.\n     *\n     * @param args  ignored.\n     *\n     * @throws Exception if there is some problem.\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 73)",
        "(line 1157,col 9)-(line 1157,col 21)",
        "(line 1158,col 9)-(line 1158,col 55)",
        "(line 1159,col 9)-(line 1159,col 24)"
      ]
    }
  ]
}