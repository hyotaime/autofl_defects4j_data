{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/SegmentedTimeline.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SegmentedTimeline",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Timeline",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 166,
      "end_line": 1750,
      "comment": "\r\n * A {@link Timeline} that implements a \"segmented\" timeline with included,\r\n * excluded and exception segments.\r\n * \u003cP\u003e\r\n * A Timeline will present a series of values to be used for an axis. Each\r\n * Timeline must provide transformation methods between domain values and\r\n * timeline values.\r\n * \u003cP\u003e\r\n * A timeline can be used as parameter to a\r\n * {@link org.jfree.chart.axis.DateAxis} to define the values that this axis\r\n * supports. This class implements a timeline formed by segments of equal\r\n * length (ex. days, hours, minutes) where some segments can be included in the\r\n * timeline and others excluded. Therefore timelines like \"working days\" or\r\n * \"working hours\" can be created where non-working days or non-working hours\r\n * respectively can be removed from the timeline, and therefore from the axis.\r\n * This creates a smooth plot with equal separation between all included\r\n * segments.\r\n * \u003cP\u003e\r\n * Because Timelines were created mainly for Date related axis, values are\r\n * represented as longs instead of doubles. In this case, the domain value is\r\n * just the number of milliseconds since January 1, 1970, 00:00:00 GMT as\r\n * defined by the getTime() method of {@link java.util.Date}.\r\n * \u003cP\u003e\r\n * In this class, a segment is defined as a unit of time of fixed length.\r\n * Examples of segments are: days, hours, minutes, etc. The size of a segment\r\n * is defined as the number of milliseconds in the segment. Some useful segment\r\n * sizes are defined as constants in this class: DAY_SEGMENT_SIZE,\r\n * HOUR_SEGMENT_SIZE, FIFTEEN_MINUTE_SEGMENT_SIZE and MINUTE_SEGMENT_SIZE.\r\n * \u003cP\u003e\r\n * Segments are group together to form a Segment Group. Each Segment Group will\r\n * contain a number of Segments included and a number of Segments excluded. This\r\n * Segment Group structure will repeat for the whole timeline.\r\n * \u003cP\u003e\r\n * For example, a working days SegmentedTimeline would be formed by a group of\r\n * 7 daily segments, where there are 5 included (Monday through Friday) and 2\r\n * excluded (Saturday and Sunday) segments.\r\n * \u003cP\u003e\r\n * Following is a diagram that explains the major attributes that define a\r\n * segment.  Each box is one segment and must be of fixed length (ms, second,\r\n * hour, day, etc).\r\n * \u003cp\u003e\r\n * \u003cpre\u003e\r\n * start time\r\n *   |\r\n *   v\r\n *   0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 ...\r\n * +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+...\r\n * |  |  |  |  |  |EE|EE|  |  |  |  |  |EE|EE|  |  |  |  |  |EE|EE|\r\n * +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+...\r\n *  \\____________/ \\___/            \\_/\r\n *        \\/         |               |\r\n *     included   excluded        segment\r\n *     segments   segments         size\r\n *  \\_________  _______/\r\n *            \\/\r\n *       segment group\r\n * \u003c/pre\u003e\r\n * Legend:\u003cbr\u003e\r\n * \u0026lt;space\u0026gt; \u003d Included segment\u003cbr\u003e\r\n * EE      \u003d Excluded segments in the base timeline\u003cbr\u003e\r\n * \u003cp\u003e\r\n * In the example, the following segment attributes are presented:\r\n * \u003cul\u003e\r\n * \u003cli\u003esegment size: the size of each segment in ms.\r\n * \u003cli\u003estart time: the start of the first segment of the first segment group to\r\n *     consider.\r\n * \u003cli\u003eincluded segments: the number of segments to include in the group.\r\n * \u003cli\u003eexcluded segments: the number of segments to exclude in the group.\r\n * \u003c/ul\u003e\r\n * \u003cp\u003e\r\n * Exception Segments are allowed. These exception segments are defined as\r\n * segments that would have been in the included segments of the Segment Group,\r\n * but should be excluded for special reasons. In the previous working days\r\n * SegmentedTimeline example, holidays would be considered exceptions.\r\n * \u003cP\u003e\r\n * Additionally the \u003ccode\u003estartTime\u003c/code\u003e, or start of the first Segment of\r\n * the smallest segment group needs to be defined. This startTime could be\r\n * relative to January 1, 1970, 00:00:00 GMT or any other date. This creates a\r\n * point of reference to start counting Segment Groups. For example, for the\r\n * working days SegmentedTimeline, the \u003ccode\u003estartTime\u003c/code\u003e could be\r\n * 00:00:00 GMT of the first Monday after January 1, 1970. In this class, the\r\n * constant FIRST_MONDAY_AFTER_1900 refers to a reference point of the first\r\n * Monday of the last century.\r\n * \u003cp\u003e\r\n * A SegmentedTimeline can include a baseTimeline. This combination of\r\n * timelines allows the creation of more complex timelines. For example, in\r\n * order to implement a SegmentedTimeline for an intraday stock trading\r\n * application, where the trading period is defined as 9:00 AM through 4:00 PM\r\n * Monday through Friday, two SegmentedTimelines are used. The first one (the\r\n * baseTimeline) would be a working day SegmentedTimeline (daily timeline\r\n * Monday through Friday). On top of this baseTimeline, a second one is defined\r\n * that maps the 9:00 AM to 4:00 PM period. Because the baseTimeline defines a\r\n * timeline of Monday through Friday, the resulting (combined) timeline will\r\n * expose the period 9:00 AM through 4:00 PM only on Monday through Friday,\r\n * and will remove all other intermediate intervals.\r\n * \u003cP\u003e\r\n * Two factory methods newMondayThroughFridayTimeline() and\r\n * newFifteenMinuteTimeline() are provided as examples to create special\r\n * SegmentedTimelines.\r\n *\r\n * @see org.jfree.chart.axis.DateAxis\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DAY_SEGMENT_SIZE"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Defines a day segment size in ms. "
    },
    {
      "type": "field",
      "varNames": [
        "HOUR_SEGMENT_SIZE"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Defines a one hour segment size in ms. "
    },
    {
      "type": "field",
      "varNames": [
        "FIFTEEN_MINUTE_SEGMENT_SIZE"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Defines a 15-minute segment size in ms. "
    },
    {
      "type": "field",
      "varNames": [
        "MINUTE_SEGMENT_SIZE"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " Defines a one-minute segment size in ms. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_MONDAY_AFTER_1900"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\r\n     * Utility constant that defines the startTime as the first monday after\r\n     * 1/1/1970.  This should be used when creating a SegmentedTimeline for\r\n     * Monday through Friday. See static block below for calculation of this\r\n     * constant.\r\n     *\r\n     * @deprecated As of 1.0.7.  This field doesn\u0027t take into account changes\r\n     *         to the default time zone.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NO_DST_TIME_ZONE"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\r\n     * Utility TimeZone object that has no DST and an offset equal to the\r\n     * default TimeZone. This allows easy arithmetic between days as each one\r\n     * will have equal size.\r\n     *\r\n     * @deprecated As of 1.0.7.  This field is initialised based on the\r\n     *         default time zone, and doesn\u0027t take into account subsequent\r\n     *         changes to the default.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIME_ZONE"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\r\n     * This is the default time zone where the application is running. See\r\n     * getTime() below where we make use of certain transformations between\r\n     * times in the default time zone and the no-dst time zone used for our\r\n     * calculations.\r\n     *\r\n     * @deprecated As of 1.0.7.  When the default time zone is required,\r\n     *         just call \u003ccode\u003eTimeZone.getDefault()\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendarNoDST"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": "\r\n     * This will be a utility calendar that has no DST but is shifted relative\r\n     * to the default time zone\u0027s offset.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingCalendar"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": "\r\n     * This will be a utility calendar that used the default time zone.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "segmentSize"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Segment size in ms. "
    },
    {
      "type": "field",
      "varNames": [
        "segmentsIncluded"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Number of consecutive segments to include in a segment group. "
    },
    {
      "type": "field",
      "varNames": [
        "segmentsExcluded"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Number of consecutive segments to exclude in a segment group. "
    },
    {
      "type": "field",
      "varNames": [
        "groupSegmentCount"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Number of segments in a group (segmentsIncluded + segmentsExcluded). "
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\r\n     * Start of time reference from time zero (1/1/1970).\r\n     * This is the start of segment #0.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "segmentsIncludedSize"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Consecutive ms in segmentsIncluded (segmentsIncluded * segmentSize). "
    },
    {
      "type": "field",
      "varNames": [
        "segmentsExcludedSize"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " Consecutive ms in segmentsExcluded (segmentsExcluded * segmentSize). "
    },
    {
      "type": "field",
      "varNames": [
        "segmentsGroupSize"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " ms in a segment group (segmentsIncludedSize + segmentsExcludedSize). "
    },
    {
      "type": "field",
      "varNames": [
        "exceptionSegments"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\r\n     * List of exception segments (exceptions segments that would otherwise be\r\n     * included based on the periodic (included, excluded) grouping).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseTimeline"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\r\n     * This base timeline is used to specify exceptions at a higher level. For\r\n     * example, if we are a intraday timeline and want to exclude holidays,\r\n     * instead of having to exclude all intraday segments for the holiday,\r\n     * segments from this base timeline can be excluded. This baseTimeline is\r\n     * always optional and is only a convenience method.\r\n     * \u003cp\u003e\r\n     * Additionally, all excluded segments from this baseTimeline will be\r\n     * considered exceptions at this level.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "adjustForDaylightSaving"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " A flag that controls whether or not to adjust for daylight saving. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentedTimeline(long, int, int)",
      "begin_line": 326,
      "end_line": 343,
      "comment": "\r\n     * Constructs a new segmented timeline, optionaly using another segmented\r\n     * timeline as its base. This chaining of SegmentedTimelines allows further\r\n     * segmentation into smaller timelines.\r\n     *\r\n     * If a base\r\n     *\r\n     * @param segmentSize the size of a segment in ms. This time unit will be\r\n     *        used to compute the included and excluded segments of the\r\n     *        timeline.\r\n     * @param segmentsIncluded Number of consecutive segments to include.\r\n     * @param segmentsExcluded Number of consecutive segments to exclude.\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 39)",
        "(line 331,col 9)-(line 331,col 49)",
        "(line 332,col 9)-(line 332,col 49)",
        "(line 334,col 9)-(line 334,col 79)",
        "(line 335,col 9)-(line 335,col 77)",
        "(line 336,col 9)-(line 336,col 77)",
        "(line 337,col 9)-(line 338,col 61)",
        "(line 339,col 9)-(line 339,col 58)",
        "(line 340,col 9)-(line 340,col 65)",
        "(line 341,col 9)-(line 342,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.firstMondayAfter1900()",
      "begin_line": 353,
      "end_line": 368,
      "comment": "\r\n     * Returns the milliseconds for midnight of the first Monday after\r\n     * 1-Jan-1900, ignoring daylight savings.\r\n     *\r\n     * @return The milliseconds.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 58)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 359,col 9)-(line 359,col 48)",
        "(line 360,col 9)-(line 360,col 37)",
        "(line 361,col 9)-(line 361,col 41)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 367,col 9)-(line 367,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline()",
      "begin_line": 378,
      "end_line": 383,
      "comment": "\r\n     * Factory method to create a Monday through Friday SegmentedTimeline.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003estartTime\u003c/code\u003e of the resulting timeline will be midnight\r\n     * of the first Monday after 1/1/1900.\r\n     *\r\n     * @return A fully initialized SegmentedTimeline.\r\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 380,col 60)",
        "(line 381,col 9)-(line 381,col 54)",
        "(line 382,col 9)-(line 382,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline()",
      "begin_line": 402,
      "end_line": 409,
      "comment": "\r\n     * Factory method to create a 15-min, 9:00 AM thought 4:00 PM, Monday\r\n     * through Friday SegmentedTimeline.\r\n     * \u003cP\u003e\r\n     * This timeline uses a segmentSize of FIFTEEN_MIN_SEGMENT_SIZE. The\r\n     * segment group is defined as 28 included segments (9:00 AM through\r\n     * 4:00 PM) and 68 excluded segments (4:00 PM through 9:00 AM the next day).\r\n     * \u003cP\u003e\r\n     * In order to exclude Saturdays and Sundays it uses a baseTimeline that\r\n     * only includes Monday through Friday days.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003estartTime\u003c/code\u003e of the resulting timeline will be 9:00 AM\r\n     * after the startTime of the baseTimeline. This will correspond to 9:00 AM\r\n     * of the first Monday after 1/1/1900.\r\n     *\r\n     * @return A fully initialized SegmentedTimeline.\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 404,col 53)",
        "(line 405,col 9)-(line 406,col 45)",
        "(line 407,col 9)-(line 407,col 67)",
        "(line 408,col 9)-(line 408,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getAdjustForDaylightSaving()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\r\n     * Returns the flag that controls whether or not the daylight saving\r\n     * adjustment is applied.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.setAdjustForDaylightSaving(boolean)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\r\n     * Sets the flag that controls whether or not the daylight saving adjustment\r\n     * is applied.\r\n     *\r\n     * @param adjust  the flag.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.setStartTime(long)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\r\n     * Sets the start time for the timeline. This is the beginning of segment\r\n     * zero.\r\n     *\r\n     * @param millisecond  the start time (encoded as in java.util.Date).\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getStartTime()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\r\n     * Returns the start time for the timeline. This is the beginning of\r\n     * segment zero.\r\n     *\r\n     * @return The start time.\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentsExcluded()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Returns the number of segments excluded per segment group.\r\n     *\r\n     * @return The number of segments excluded.\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentsExcludedSize()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\r\n     * Returns the size in milliseconds of the segments excluded per segment\r\n     * group.\r\n     *\r\n     * @return The size in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getGroupSegmentCount()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Returns the number of segments in a segment group. This will be equal to\r\n     * segments included plus segments excluded.\r\n     *\r\n     * @return The number of segments.\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentsGroupSize()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\r\n     * Returns the size in milliseconds of a segment group. This will be equal\r\n     * to size of the segments included plus the size of the segments excluded.\r\n     *\r\n     * @return The segment group size in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentsIncluded()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Returns the number of segments included per segment group.\r\n     *\r\n     * @return The number of segments.\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentsIncludedSize()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\r\n     * Returns the size in ms of the segments included per segment group.\r\n     *\r\n     * @return The segment size in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegmentSize()",
      "begin_line": 517,
      "end_line": 519,
      "comment": "\r\n     * Returns the size of one segment in ms.\r\n     *\r\n     * @return The segment size in milliseconds.\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getExceptionSegments()",
      "begin_line": 527,
      "end_line": 529,
      "comment": "\r\n     * Returns a list of all the exception segments. This list is not\r\n     * modifiable.\r\n     *\r\n     * @return The exception segments.\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.setExceptionSegments(java.util.List)",
      "begin_line": 536,
      "end_line": 538,
      "comment": "\r\n     * Sets the exception segments list.\r\n     *\r\n     * @param exceptionSegments  the exception segments.\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getBaseTimeline()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\r\n     * Returns our baseTimeline, or \u003ccode\u003enull\u003c/code\u003e if none.\r\n     *\r\n     * @return The base timeline.\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.setBaseTimeline(org.jfree.chart.axis.SegmentedTimeline)",
      "begin_line": 554,
      "end_line": 580,
      "comment": "\r\n     * Sets the base timeline.\r\n     *\r\n     * @param baseTimeline  the timeline.\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.toTimelineValue(long)",
      "begin_line": 591,
      "end_line": 643,
      "comment": "\r\n     * Translates a value relative to the domain value (all Dates) into a value\r\n     * relative to the segmented timeline. The values relative to the segmented\r\n     * timeline are all consecutives starting at zero at the startTime.\r\n     *\r\n     * @param millisecond  the millisecond (as encoded by java.util.Date).\r\n     *\r\n     * @return The timeline value.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 20)",
        "(line 594,col 9)-(line 594,col 60)",
        "(line 595,col 9)-(line 595,col 74)",
        "(line 596,col 9)-(line 596,col 67)",
        "(line 598,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.toTimelineValue(java.util.Date)",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\r\n     * Translates a date into a value relative to the segmented timeline. The\r\n     * values relative to the segmented timeline are all consecutives starting\r\n     * at zero at the startTime.\r\n     *\r\n     * @param date  date relative to the domain.\r\n     *\r\n     * @return The timeline value (in milliseconds).\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.toMillisecond(long)",
      "begin_line": 666,
      "end_line": 706,
      "comment": "\r\n     * Translates a value relative to the timeline into a millisecond.\r\n     *\r\n     * @param timelineValue  the timeline value (in milliseconds).\r\n     *\r\n     * @return The domain value (in milliseconds).\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 45)",
        "(line 673,col 9)-(line 673,col 40)",
        "(line 676,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getTimeFromLong(long)",
      "begin_line": 715,
      "end_line": 734,
      "comment": "\r\n     * Converts a date/time value to take account of daylight savings time.\r\n     *\r\n     * @param date  the milliseconds.\r\n     *\r\n     * @return The milliseconds.\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 27)",
        "(line 717,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.containsDomainValue(long)",
      "begin_line": 743,
      "end_line": 746,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a value is contained in the timeline.\r\n     *\r\n     * @param millisecond  the value to verify.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if value is contained in the timeline.\r\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 50)",
        "(line 745,col 9)-(line 745,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.containsDomainValue(java.util.Date)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a value is contained in the timeline.\r\n     *\r\n     * @param date  date to verify\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if value is contained in the timeline\r\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.containsDomainRange(long, long)",
      "begin_line": 769,
      "end_line": 789,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a range of values are contained in the\r\n     * timeline. This is implemented verifying that all segments are in the\r\n     * range.\r\n     *\r\n     * @param domainValueStart start of the range to verify\r\n     * @param domainValueEnd end of the range to verify\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range is contained in the timeline\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 775,col 9)",
        "(line 776,col 9)-(line 776,col 55)",
        "(line 777,col 9)-(line 777,col 32)",
        "(line 778,col 9)-(line 787,col 25)",
        "(line 788,col 9)-(line 788,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.containsDomainRange(java.util.Date, java.util.Date)",
      "begin_line": 801,
      "end_line": 805,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if a range of values are contained in the\r\n     * timeline. This is implemented verifying that all segments are in the\r\n     * range.\r\n     *\r\n     * @param dateDomainValueStart start of the range to verify\r\n     * @param dateDomainValueEnd end of the range to verify\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the range is contained in the timeline\r\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 804,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addException(long)",
      "begin_line": 819,
      "end_line": 821,
      "comment": "\r\n     * Adds a segment as an exception. An exception segment is defined as a\r\n     * segment to exclude from what would otherwise be considered a valid\r\n     * segment of the timeline.  An exception segment can not be contained\r\n     * inside an already excluded segment.  If so, no action will occur (the\r\n     * proposed exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment is identified by a domainValue into any part of the segment.\r\n     * Therefore the segmentStart \u003c\u003d domainValue \u003c\u003d segmentEnd.\r\n     *\r\n     * @param millisecond  domain value to treat as an exception\r\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addException(long, long)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Adds a segment range as an exception. An exception segment is defined as\r\n     * a segment to exclude from what would otherwise be considered a valid\r\n     * segment of the timeline.  An exception segment can not be contained\r\n     * inside an already excluded segment.  If so, no action will occur (the\r\n     * proposed exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment range is identified by a domainValue that begins a valid\r\n     * segment and ends with a domainValue that ends a valid segment.\r\n     * Therefore the range will contain all segments whose segmentStart\r\n     * \u003c\u003d domainValue and segmentEnd \u003c\u003d toDomainValue.\r\n     *\r\n     * @param fromDomainValue  start of domain range to treat as an exception\r\n     * @param toDomainValue  end of domain range to treat as an exception\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addException(java.util.Date)",
      "begin_line": 853,
      "end_line": 856,
      "comment": "\r\n     * Adds a segment as an exception. An exception segment is defined as a\r\n     * segment to exclude from what would otherwise be considered a valid\r\n     * segment of the timeline.  An exception segment can not be contained\r\n     * inside an already excluded segment.  If so, no action will occur (the\r\n     * proposed exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment is identified by a Date into any part of the segment.\r\n     *\r\n     * @param exceptionDate  Date into the segment to exclude.\r\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addExceptions(java.util.List)",
      "begin_line": 870,
      "end_line": 874,
      "comment": "\r\n     * Adds a list of dates as segment exceptions. Each exception segment is\r\n     * defined as a segment to exclude from what would otherwise be considered\r\n     * a valid segment of the timeline.  An exception segment can not be\r\n     * contained inside an already excluded segment.  If so, no action will\r\n     * occur (the proposed exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment is identified by a Date into any part of the segment.\r\n     *\r\n     * @param exceptionList  List of Date objects that identify the segments to\r\n     *                       exclude.\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addException(org.jfree.chart.axis.SegmentedTimeline.Segment)",
      "begin_line": 886,
      "end_line": 891,
      "comment": "\r\n     * Adds a segment as an exception. An exception segment is defined as a\r\n     * segment to exclude from what would otherwise be considered a valid\r\n     * segment of the timeline.  An exception segment can not be contained\r\n     * inside an already excluded segment.  This is verified inside this\r\n     * method, and if so, no action will occur (the proposed exception segment\r\n     * will be discarded).\r\n     *\r\n     * @param segment  the segment to exclude.\r\n     ",
      "child_ranges": [
        "(line 887,col 10)-(line 890,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addBaseTimelineException(long)",
      "begin_line": 909,
      "end_line": 939,
      "comment": "\r\n     * Adds a segment relative to the baseTimeline as an exception. Because a\r\n     * base segment is normally larger than our segments, this may add one or\r\n     * more segment ranges to the exception list.\r\n     * \u003cp\u003e\r\n     * An exception segment is defined as a segment\r\n     * to exclude from what would otherwise be considered a valid segment of\r\n     * the timeline.  An exception segment can not be contained inside an\r\n     * already excluded segment.  If so, no action will occur (the proposed\r\n     * exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment is identified by a domainValue into any part of the\r\n     * baseTimeline segment.\r\n     *\r\n     * @param domainValue  domain value to teat as a baseTimeline exception.\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 72)",
        "(line 912,col 9)-(line 938,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addBaseTimelineException(java.util.Date)",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\r\n     * Adds a segment relative to the baseTimeline as an exception. An\r\n     * exception segment is defined as a segment to exclude from what would\r\n     * otherwise be considered a valid segment of the timeline.  An exception\r\n     * segment can not be contained inside an already excluded segment. If so,\r\n     * no action will occure (the proposed exception segment will be discarded).\r\n     * \u003cp\u003e\r\n     * The segment is identified by a domainValue into any part of the segment.\r\n     * Therefore the segmentStart \u003c\u003d domainValue \u003c\u003d segmentEnd.\r\n     *\r\n     * @param date  date domain value to treat as a baseTimeline exception\r\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.addBaseTimelineExclusions(long, long)",
      "begin_line": 966,
      "end_line": 1013,
      "comment": "\r\n     * Adds all excluded segments from the BaseTimeline as exceptions to our\r\n     * timeline. This allows us to combine two timelines for more complex\r\n     * calculations.\r\n     *\r\n     * @param fromBaseDomainValue Start of the range where exclusions will be\r\n     *                            extracted.\r\n     * @param toBaseDomainValue End of the range to process.\r\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 80)",
        "(line 971,col 9)-(line 976,col 9)",
        "(line 979,col 9)-(line 1012,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getExceptionSegmentCount(long, long)",
      "begin_line": 1024,
      "end_line": 1042,
      "comment": "\r\n     * Returns the number of exception segments wholly contained in the\r\n     * (fromDomainValue, toDomainValue) interval.\r\n     *\r\n     * @param fromMillisecond  the beginning of the interval.\r\n     * @param toMillisecond  the end of the interval.\r\n     *\r\n     * @return Number of exception segments contained in the interval.\r\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1030,col 9)-(line 1030,col 18)",
        "(line 1031,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegment(long)",
      "begin_line": 1055,
      "end_line": 1057,
      "comment": "\r\n     * Returns a segment that contains a domainValue. If the domainValue is\r\n     * not contained in the timeline (because it is not contained in the\r\n     * baseTimeline), a Segment that contains\r\n     * \u003ccode\u003eindex + segmentSize*m\u003c/code\u003e will be returned for the smallest\r\n     * \u003ccode\u003em\u003c/code\u003e possible.\r\n     *\r\n     * @param millisecond  index into the segment\r\n     *\r\n     * @return A Segment that contains index, or the next possible Segment.\r\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getSegment(java.util.Date)",
      "begin_line": 1073,
      "end_line": 1075,
      "comment": "\r\n     * Returns a segment that contains a date. For accurate calculations,\r\n     * the calendar should use TIME_ZONE for its calculation (or any other\r\n     * similar time zone).\r\n     *\r\n     * If the date is not contained in the timeline (because it is not\r\n     * contained in the baseTimeline), a Segment that contains\r\n     * \u003ccode\u003edate + segmentSize*m\u003c/code\u003e will be returned for the smallest\r\n     * \u003ccode\u003em\u003c/code\u003e possible.\r\n     *\r\n     * @param date date into the segment\r\n     *\r\n     * @return A Segment that contains date, or the next possible Segment.\r\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.equals(java.lang.Object, java.lang.Object)",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\r\n     * Convenient method to test equality in two objects, taking into account\r\n     * nulls.\r\n     *\r\n     * @param o first object to compare\r\n     * @param p second object to compare\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if both objects are equal or both\r\n     *         \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.equals(java.lang.Object)",
      "begin_line": 1098,
      "end_line": 1113,
      "comment": "\r\n     * Returns true if we are equal to the parameter\r\n     *\r\n     * @param o Object to verify with us\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\r\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.hashCode()",
      "begin_line": 1120,
      "end_line": 1126,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 24)",
        "(line 1122,col 9)-(line 1123,col 72)",
        "(line 1124,col 9)-(line 1124,col 80)",
        "(line 1125,col 9)-(line 1125,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.binarySearchExceptionSegments(org.jfree.chart.axis.SegmentedTimeline.Segment)",
      "begin_line": 1143,
      "end_line": 1167,
      "comment": "\r\n     * Preforms a binary serach in the exceptionSegments sorted array. This\r\n     * array can contain Segments or SegmentRange objects.\r\n     *\r\n     * @param  segment the key to be searched for.\r\n     *\r\n     * @return index of the search segment, if it is contained in the list;\r\n     *         otherwise, \u003ctt\u003e(-(\u003ci\u003einsertion point\u003c/i\u003e) - 1)\u003c/tt\u003e.  The\r\n     *         \u003ci\u003einsertion point\u003c/i\u003e is defined as the point at which the\r\n     *         segment would be inserted into the list: the index of the first\r\n     *         element greater than the key, or \u003ctt\u003elist.size()\u003c/tt\u003e, if all\r\n     *         elements in the list are less than the specified segment.  Note\r\n     *         that this guarantees that the return value will be \u0026gt;\u003d 0 if\r\n     *         and only if the key is found.\r\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 20)",
        "(line 1145,col 9)-(line 1145,col 53)",
        "(line 1147,col 9)-(line 1165,col 9)",
        "(line 1166,col 9)-(line 1166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getTime(java.util.Date)",
      "begin_line": 1179,
      "end_line": 1197,
      "comment": "\r\n     * Special method that handles conversion between the Default Time Zone and\r\n     * a UTC time zone with no DST. This is needed so all days have the same\r\n     * size. This method is the prefered way of converting a Data into\r\n     * milliseconds for usage in this class.\r\n     *\r\n     * @param date Date to convert to long.\r\n     *\r\n     * @return The milliseconds.\r\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1180,col 37)",
        "(line 1181,col 9)-(line 1194,col 9)",
        "(line 1196,col 9)-(line 1196,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.getDate(long)",
      "begin_line": 1206,
      "end_line": 1209,
      "comment": "\r\n     * Converts a millisecond value into a {@link Date} object.\r\n     *\r\n     * @param value  the millisecond value.\r\n     *\r\n     * @return The date.\r\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1207,col 59)",
        "(line 1208,col 9)-(line 1208,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.clone()",
      "begin_line": 1218,
      "end_line": 1221,
      "comment": "\r\n     * Returns a clone of the timeline.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException ??.\r\n     ",
      "child_ranges": [
        "(line 1219,col 9)-(line 1219,col 68)",
        "(line 1220,col 9)-(line 1220,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Segment",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 1231,
      "end_line": 1610,
      "comment": "\r\n     * Internal class to represent a valid segment for this timeline. A segment\r\n     * is valid on a timeline if it is part of its included, excluded or\r\n     * exception segments.\r\n     * \u003cp\u003e\r\n     * Each segment will know its segment number, segmentStart, segmentEnd and\r\n     * index inside the segment.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "segmentNumber"
      ],
      "begin_line": 1234,
      "end_line": 1234,
      "comment": " The segment number. "
    },
    {
      "type": "field",
      "varNames": [
        "segmentStart"
      ],
      "begin_line": 1237,
      "end_line": 1237,
      "comment": " The segment start. "
    },
    {
      "type": "field",
      "varNames": [
        "segmentEnd"
      ],
      "begin_line": 1240,
      "end_line": 1240,
      "comment": " The segment end. "
    },
    {
      "type": "field",
      "varNames": [
        "millisecond"
      ],
      "begin_line": 1243,
      "end_line": 1243,
      "comment": " A reference point within the segment. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.Segment()",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "\r\n         * Protected constructor only used by sub-classes.\r\n         ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.Segment(long)",
      "begin_line": 1257,
      "end_line": 1264,
      "comment": "\r\n         * Creates a segment for a given point in time.\r\n         *\r\n         * @param millisecond  the millisecond (as encoded by java.util.Date).\r\n         ",
      "child_ranges": [
        "(line 1258,col 13)-(line 1258,col 69)",
        "(line 1259,col 13)-(line 1260,col 74)",
        "(line 1261,col 13)-(line 1262,col 77)",
        "(line 1263,col 13)-(line 1263,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.calculateSegmentNumber(long)",
      "begin_line": 1273,
      "end_line": 1282,
      "comment": "\r\n         * Calculates the segment number for a given millisecond.\r\n         *\r\n         * @param millis  the millisecond (as encoded by java.util.Date).\r\n         *\r\n         * @return The segment number.\r\n         ",
      "child_ranges": [
        "(line 1274,col 13)-(line 1281,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getSegmentNumber()",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": "\r\n         * Returns the segment number of this segment. Segments start at 0.\r\n         *\r\n         * @return The segment number.\r\n         ",
      "child_ranges": [
        "(line 1290,col 13)-(line 1290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getSegmentCount()",
      "begin_line": 1299,
      "end_line": 1301,
      "comment": "\r\n         * Returns always one (the number of segments contained in this\r\n         * segment).\r\n         *\r\n         * @return The segment count (always 1 for this class).\r\n         ",
      "child_ranges": [
        "(line 1300,col 13)-(line 1300,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getSegmentStart()",
      "begin_line": 1308,
      "end_line": 1310,
      "comment": "\r\n         * Gets the start of this segment in ms.\r\n         *\r\n         * @return The segment start.\r\n         ",
      "child_ranges": [
        "(line 1309,col 13)-(line 1309,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getSegmentEnd()",
      "begin_line": 1317,
      "end_line": 1319,
      "comment": "\r\n         * Gets the end of this segment in ms.\r\n         *\r\n         * @return The segment end.\r\n         ",
      "child_ranges": [
        "(line 1318,col 13)-(line 1318,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getMillisecond()",
      "begin_line": 1327,
      "end_line": 1329,
      "comment": "\r\n         * Returns the millisecond used to reference this segment (always\r\n         * between the segmentStart and segmentEnd).\r\n         *\r\n         * @return The millisecond.\r\n         ",
      "child_ranges": [
        "(line 1328,col 13)-(line 1328,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getDate()",
      "begin_line": 1337,
      "end_line": 1339,
      "comment": "\r\n         * Returns a {@link java.util.Date} that represents the reference point\r\n         * for this segment.\r\n         *\r\n         * @return The date.\r\n         ",
      "child_ranges": [
        "(line 1338,col 13)-(line 1338,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.contains(long)",
      "begin_line": 1350,
      "end_line": 1352,
      "comment": "\r\n         * Returns true if a particular millisecond is contained in this\r\n         * segment.\r\n         *\r\n         * @param millis  the millisecond to verify.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the millisecond is contained in the\r\n         *         segment.\r\n         ",
      "child_ranges": [
        "(line 1351,col 13)-(line 1351,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.contains(long, long)",
      "begin_line": 1364,
      "end_line": 1366,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if an interval is contained in this\r\n         * segment.\r\n         *\r\n         * @param from  the start of the interval.\r\n         * @param to  the end of the interval.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the interval is contained in the\r\n         *         segment.\r\n         ",
      "child_ranges": [
        "(line 1365,col 13)-(line 1365,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.contains(org.jfree.chart.axis.SegmentedTimeline.Segment)",
      "begin_line": 1376,
      "end_line": 1378,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if a segment is contained in this segment.\r\n         *\r\n         * @param segment  the segment to test for inclusion\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if the segment is contained in this\r\n         *         segment.\r\n         ",
      "child_ranges": [
        "(line 1377,col 13)-(line 1377,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.contained(long, long)",
      "begin_line": 1390,
      "end_line": 1392,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if this segment is contained in an\r\n         * interval.\r\n         *\r\n         * @param from  the start of the interval.\r\n         * @param to  the end of the interval.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if this segment is contained in the\r\n         *         interval.\r\n         ",
      "child_ranges": [
        "(line 1391,col 13)-(line 1391,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.intersect(long, long)",
      "begin_line": 1403,
      "end_line": 1410,
      "comment": "\r\n         * Returns a segment that is the intersection of this segment and the\r\n         * interval.\r\n         *\r\n         * @param from  the start of the interval.\r\n         * @param to  the end of the interval.\r\n         *\r\n         * @return A segment.\r\n         ",
      "child_ranges": [
        "(line 1404,col 13)-(line 1409,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.before(org.jfree.chart.axis.SegmentedTimeline.Segment)",
      "begin_line": 1420,
      "end_line": 1422,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if this segment is wholly before another\r\n         * segment.\r\n         *\r\n         * @param other  the other segment.\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 1421,col 13)-(line 1421,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.after(org.jfree.chart.axis.SegmentedTimeline.Segment)",
      "begin_line": 1432,
      "end_line": 1434,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if this segment is wholly after another\r\n         * segment.\r\n         *\r\n         * @param other  the other segment.\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 1433,col 13)-(line 1433,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.equals(java.lang.Object)",
      "begin_line": 1444,
      "end_line": 1455,
      "comment": "\r\n         * Tests an object (usually another \u003ccode\u003eSegment\u003c/code\u003e) for equality\r\n         * with this segment.\r\n         *\r\n         * @param object The other segment to compare with us\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if we are the same segment\r\n         ",
      "child_ranges": [
        "(line 1445,col 13)-(line 1454,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.copy()",
      "begin_line": 1463,
      "end_line": 1470,
      "comment": "\r\n         * Returns a copy of ourselves or \u003ccode\u003enull\u003c/code\u003e if there was an\r\n         * exception during cloning.\r\n         *\r\n         * @return A copy of this segment.\r\n         ",
      "child_ranges": [
        "(line 1464,col 13)-(line 1469,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.compareTo(java.lang.Object)",
      "begin_line": 1481,
      "end_line": 1492,
      "comment": "\r\n         * Will compare this Segment with another Segment (from Comparable\r\n         * interface).\r\n         *\r\n         * @param object The other Segment to compare with\r\n         *\r\n         * @return -1: this \u003c object, 0: this.equal(object) and\r\n         *         +1: this \u003e object\r\n         ",
      "child_ranges": [
        "(line 1482,col 13)-(line 1482,col 45)",
        "(line 1483,col 13)-(line 1491,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.inIncludeSegments()",
      "begin_line": 1500,
      "end_line": 1508,
      "comment": "\r\n         * Returns true if we are an included segment and we are not an\r\n         * exception.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 1501,col 13)-(line 1507,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.inExcludeSegments()",
      "begin_line": 1515,
      "end_line": 1518,
      "comment": "\r\n         * Returns true if we are an excluded segment.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 1516,col 13)-(line 1517,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.getSegmentNumberRelativeToGroup()",
      "begin_line": 1528,
      "end_line": 1535,
      "comment": "\r\n         * Calculate the segment number relative to the segment group. This\r\n         * will be a number between 0 and segmentsGroup-1. This value is\r\n         * calculated from the segmentNumber. Special care is taken for\r\n         * negative segmentNumbers.\r\n         *\r\n         * @return The segment number.\r\n         ",
      "child_ranges": [
        "(line 1529,col 13)-(line 1530,col 64)",
        "(line 1531,col 13)-(line 1533,col 13)",
        "(line 1534,col 13)-(line 1534,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.inExceptionSegments()",
      "begin_line": 1548,
      "end_line": 1550,
      "comment": "\r\n         * Returns true if we are an exception segment. This is implemented via\r\n         * a binary search on the exceptionSegments sorted list.\r\n         *\r\n         * If the segment is not listed as an exception in our list and we have\r\n         * a baseTimeline, a check is performed to see if the segment is inside\r\n         * an excluded segment from our base. If so, it is also considered an\r\n         * exception.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e if we are an exception segment.\r\n         ",
      "child_ranges": [
        "(line 1549,col 13)-(line 1549,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.inc(long)",
      "begin_line": 1558,
      "end_line": 1564,
      "comment": "\r\n         * Increments the internal attributes of this segment by a number of\r\n         * segments.\r\n         *\r\n         * @param n Number of segments to increment.\r\n         ",
      "child_ranges": [
        "(line 1559,col 13)-(line 1559,col 36)",
        "(line 1560,col 13)-(line 1560,col 60)",
        "(line 1561,col 13)-(line 1561,col 35)",
        "(line 1562,col 13)-(line 1562,col 33)",
        "(line 1563,col 13)-(line 1563,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.inc()",
      "begin_line": 1570,
      "end_line": 1572,
      "comment": "\r\n         * Increments the internal attributes of this segment by one segment.\r\n         * The exact time incremented is segmentSize.\r\n         ",
      "child_ranges": [
        "(line 1571,col 13)-(line 1571,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.dec(long)",
      "begin_line": 1580,
      "end_line": 1586,
      "comment": "\r\n         * Decrements the internal attributes of this segment by a number of\r\n         * segments.\r\n         *\r\n         * @param n Number of segments to decrement.\r\n         ",
      "child_ranges": [
        "(line 1581,col 13)-(line 1581,col 36)",
        "(line 1582,col 13)-(line 1582,col 60)",
        "(line 1583,col 13)-(line 1583,col 35)",
        "(line 1584,col 13)-(line 1584,col 33)",
        "(line 1585,col 13)-(line 1585,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.dec()",
      "begin_line": 1592,
      "end_line": 1594,
      "comment": "\r\n         * Decrements the internal attributes of this segment by one segment.\r\n         * The exact time decremented is segmentSize.\r\n         ",
      "child_ranges": [
        "(line 1593,col 13)-(line 1593,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.moveIndexToStart()",
      "begin_line": 1599,
      "end_line": 1601,
      "comment": "\r\n         * Moves the index of this segment to the beginning if the segment.\r\n         ",
      "child_ranges": [
        "(line 1600,col 13)-(line 1600,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.Segment.moveIndexToEnd()",
      "begin_line": 1606,
      "end_line": 1608,
      "comment": "\r\n         * Moves the index of this segment to the end of the segment.\r\n         ",
      "child_ranges": [
        "(line 1607,col 13)-(line 1607,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SegmentRange",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.SegmentedTimeline.Segment"
      ],
      "begin_line": 1619,
      "end_line": 1730,
      "comment": "\r\n     * Private internal class to represent a range of segments. This class is\r\n     * mainly used to store in one object a range of exception segments. This\r\n     * optimizes certain timelines that use a small segment size (like an\r\n     * intraday timeline) allowing them to express a day exception as one\r\n     * SegmentRange instead of multi Segments.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "segmentCount"
      ],
      "begin_line": 1622,
      "end_line": 1622,
      "comment": " The number of segments in the range. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.SegmentRange(long, long)",
      "begin_line": 1630,
      "end_line": 1646,
      "comment": "\r\n         * Creates a SegmentRange between a start and end domain values.\r\n         *\r\n         * @param fromMillisecond  start of the range\r\n         * @param toMillisecond  end of the range\r\n         ",
      "child_ranges": [
        "(line 1632,col 13)-(line 1632,col 56)",
        "(line 1633,col 13)-(line 1633,col 52)",
        "(line 1640,col 13)-(line 1640,col 47)",
        "(line 1641,col 13)-(line 1641,col 73)",
        "(line 1642,col 13)-(line 1642,col 51)",
        "(line 1643,col 13)-(line 1643,col 45)",
        "(line 1644,col 13)-(line 1645,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.getSegmentCount()",
      "begin_line": 1653,
      "end_line": 1655,
      "comment": "\r\n         * Returns the number of segments contained in this range.\r\n         *\r\n         * @return The segment count.\r\n         ",
      "child_ranges": [
        "(line 1654,col 13)-(line 1654,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.intersect(long, long)",
      "begin_line": 1666,
      "end_line": 1684,
      "comment": "\r\n         * Returns a segment that is the intersection of this segment and the\r\n         * interval.\r\n         *\r\n         * @param from  the start of the interval.\r\n         * @param to  the end of the interval.\r\n         *\r\n         * @return The intersection.\r\n         ",
      "child_ranges": [
        "(line 1672,col 13)-(line 1672,col 59)",
        "(line 1673,col 13)-(line 1673,col 53)",
        "(line 1678,col 13)-(line 1683,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.inIncludeSegments()",
      "begin_line": 1692,
      "end_line": 1701,
      "comment": "\r\n         * Returns true if all Segments of this SegmentRenge are an included\r\n         * segment and are not an exception.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e or \u003c/code\u003efalse\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 1693,col 13)-(line 1699,col 13)",
        "(line 1700,col 13)-(line 1700,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.inExcludeSegments()",
      "begin_line": 1708,
      "end_line": 1717,
      "comment": "\r\n         * Returns true if we are an excluded segment.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e or \u003c/code\u003efalse\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 1709,col 13)-(line 1715,col 13)",
        "(line 1716,col 13)-(line 1716,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.SegmentRange.inc(long)",
      "begin_line": 1725,
      "end_line": 1728,
      "comment": "\r\n         * Not implemented for SegmentRange. Always throws\r\n         * IllegalArgumentException.\r\n         *\r\n         * @param n Number of segments to increment.\r\n         ",
      "child_ranges": [
        "(line 1726,col 13)-(line 1727,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BaseTimelineSegmentRange",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.SegmentedTimeline.SegmentRange"
      ],
      "begin_line": 1735,
      "end_line": 1748,
      "comment": "\r\n     * Special \u003ccode\u003eSegmentRange\u003c/code\u003e that came from the BaseTimeline.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.SegmentedTimeline.BaseTimelineSegmentRange.BaseTimelineSegmentRange(long, long)",
      "begin_line": 1743,
      "end_line": 1746,
      "comment": "\r\n         * Constructor.\r\n         *\r\n         * @param fromDomainValue  the start value.\r\n         * @param toDomainValue  the end value.\r\n         ",
      "child_ranges": [
        "(line 1745,col 13)-(line 1745,col 50)"
      ]
    }
  ]
}