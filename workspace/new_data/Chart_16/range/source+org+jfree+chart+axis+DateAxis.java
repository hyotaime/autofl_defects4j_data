{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/DateAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DateAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 167,
      "end_line": 1813,
      "comment": "\r\n * The base class for axes that display dates.  You will find it easier to \r\n * understand how this axis works if you bear in mind that it really \r\n * displays/measures integer (or long) data, where the integers are \r\n * milliseconds since midnight, 1-Jan-1970.  When displaying tick labels, the \r\n * millisecond values are converted back to dates using a \r\n * \u003ccode\u003eDateFormat\u003c/code\u003e instance.\r\n * \u003cP\u003e\r\n * You can also create a {@link org.jfree.chart.axis.Timeline} and supply in \r\n * the constructor to create an axis that only contains certain domain values. \r\n * For example, this allows you to create a date axis that only contains \r\n * working days.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DATE_RANGE"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The default axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_MINIMUM_SIZE_IN_MILLISECONDS"
      ],
      "begin_line": 176,
      "end_line": 177,
      "comment": " The default minimum auto range size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DATE_TICK_UNIT"
      ],
      "begin_line": 180,
      "end_line": 181,
      "comment": " The default date tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ANCHOR_DATE"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The default anchor date. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The current tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatOverride"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The override date format. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkPosition"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " \r\n     * Tick marks can be displayed at the start or the middle of the time \r\n     * period. \r\n     "
    },
    {
      "type": "class_interface",
      "name": "DefaultTimeline",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Timeline",
        "java.io.Serializable"
      ],
      "begin_line": 202,
      "end_line": 307,
      "comment": "\r\n     * A timeline that includes all milliseconds (as defined by \r\n     * \u003ccode\u003ejava.util.Date\u003c/code\u003e) in the real time line.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toTimelineValue(long)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n         * Converts a millisecond into a timeline value.\r\n         *\r\n         * @param millisecond  the millisecond.\r\n         *\r\n         * @return The timeline value.\r\n         ",
      "child_ranges": [
        "(line 212,col 13)-(line 212,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toTimelineValue(java.util.Date)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n         * Converts a date into a timeline value.\r\n         *\r\n         * @param date  the domain value.\r\n         *\r\n         * @return The timeline value.\r\n         ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toMillisecond(long)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n         * Converts a timeline value into a millisecond (as encoded by \r\n         * \u003ccode\u003ejava.util.Date\u003c/code\u003e).\r\n         *\r\n         * @param value  the value.\r\n         *\r\n         * @return The millisecond.\r\n         ",
      "child_ranges": [
        "(line 235,col 13)-(line 235,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainValue(long)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified \r\n         * domain value.\r\n         *\r\n         * @param millisecond  the millisecond.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainValue(java.util.Date)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified \r\n         * domain value.\r\n         *\r\n         * @param date  the date.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainRange(long, long)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified \r\n         * domain value range.\r\n         *\r\n         * @param from  the start value.\r\n         * @param to  the end value.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainRange(java.util.Date, java.util.Date)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified \r\n         * domain value range.\r\n         *\r\n         * @param from  the start date.\r\n         * @param to  the end date.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.equals(java.lang.Object)",
      "begin_line": 295,
      "end_line": 306,
      "comment": "\r\n         * Tests an object for equality with this instance.\r\n         *\r\n         * @param object  the object.\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 296,col 13)-(line 298,col 13)",
        "(line 299,col 13)-(line 301,col 13)",
        "(line 302,col 13)-(line 304,col 13)",
        "(line 305,col 13)-(line 305,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIMELINE"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " A static default timeline shared by all standard DateAxis "
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The time zone for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "timeline"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Our underlying timeline. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Creates a date axis with no label.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis(java.lang.String)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\r\n     * Creates a date axis with the specified label.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis(java.lang.String, java.util.TimeZone)",
      "begin_line": 344,
      "end_line": 353,
      "comment": "\r\n     * Creates a date axis. A timeline is specified for the axis. This allows \r\n     * special transformations to occur between a domain of values and the \r\n     * values included in the axis.\r\n     *\r\n     * @see org.jfree.chart.axis.SegmentedTimeline\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param zone  the time zone.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 65)",
        "(line 346,col 9)-(line 346,col 67)",
        "(line 347,col 9)-(line 348,col 65)",
        "(line 349,col 9)-(line 349,col 51)",
        "(line 350,col 9)-(line 350,col 39)",
        "(line 351,col 9)-(line 351,col 29)",
        "(line 352,col 9)-(line 352,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTimeZone()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\r\n     * Returns the time zone for the axis.\r\n     * \r\n     * @return The time zone.\r\n     * \r\n     * @since 1.0.4\r\n     * @see #setTimeZone(TimeZone)\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTimeZone(java.util.TimeZone)",
      "begin_line": 376,
      "end_line": 382,
      "comment": "\r\n     * Sets the time zone for the axis and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.4\r\n     * @see #getTimeZone()\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTimeline()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\r\n     * Returns the underlying timeline used by this axis.\r\n     *\r\n     * @return The timeline.\r\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTimeline(org.jfree.chart.axis.Timeline)",
      "begin_line": 401,
      "end_line": 406,
      "comment": "\r\n     * Sets the underlying timeline to use for this axis.\r\n     * \u003cP\u003e\r\n     * If the timeline is changed, an {@link AxisChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param timeline  the timeline.\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTickUnit()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns the tick unit for the axis.\r\n     * \u003cp\u003e\r\n     * Note: if the \u003ccode\u003eautoTickUnitSelection\u003c/code\u003e flag is \r\n     * \u003ccode\u003etrue\u003c/code\u003e the tick unit may be changed while the axis is being \r\n     * drawn, so in that case the return value from this method may be\r\n     * irrelevant if the method is called before the axis has been drawn.\r\n     *\r\n     * @return The tick unit (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickUnit(DateTickUnit)\r\n     * @see ValueAxis#isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickUnit(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\r\n     * Sets the tick unit for the axis.  The auto-tick-unit-selection flag is \r\n     * set to \u003ccode\u003efalse\u003c/code\u003e, and registered listeners are notified that \r\n     * the axis has been changed.\r\n     *\r\n     * @param unit  the tick unit.\r\n     * \r\n     * @see #getTickUnit()\r\n     * @see #setTickUnit(DateTickUnit, boolean, boolean)\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickUnit(org.jfree.chart.axis.DateTickUnit, boolean, boolean)",
      "begin_line": 448,
      "end_line": 459,
      "comment": "\r\n     * Sets the tick unit attribute.\r\n     *\r\n     * @param unit  the new tick unit.\r\n     * @param notify  notify registered listeners?\r\n     * @param turnOffAutoSelection  turn off auto selection?\r\n     * \r\n     * @see #getTickUnit()\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 29)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getDateFormatOverride()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\r\n     * Returns the date format override.  If this is non-null, then it will be\r\n     * used to format the dates on the axis.\r\n     *\r\n     * @return The formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setDateFormatOverride(java.text.DateFormat)",
      "begin_line": 477,
      "end_line": 480,
      "comment": "\r\n     * Sets the date format override.  If this is non-null, then it will be \r\n     * used to format the dates on the axis.\r\n     *\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 44)",
        "(line 479,col 9)-(line 479,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(org.jfree.data.Range)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\r\n     * Sets the upper and lower bounds for the axis and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect, \r\n     * the auto-range flag is set to false.\r\n     *\r\n     * @param range  the new range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 504,
      "end_line": 515,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect, \r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto \r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(java.util.Date, java.util.Date)",
      "begin_line": 524,
      "end_line": 529,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param lower  the lower bound for the axis.\r\n     * @param upper  the upper bound for the axis.\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(double, double)",
      "begin_line": 538,
      "end_line": 543,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param lower  the lower bound for the axis.\r\n     * @param upper  the upper bound for the axis.\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getMinimumDate()",
      "begin_line": 553,
      "end_line": 564,
      "comment": "\r\n     * Returns the earliest date visible on the axis.\r\n     *\r\n     * @return The date.\r\n     * \r\n     * @see #setMinimumDate(Date)\r\n     * @see #getMaximumDate()\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 27)",
        "(line 555,col 9)-(line 555,col 33)",
        "(line 556,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setMinimumDate(java.util.Date)",
      "begin_line": 578,
      "end_line": 593,
      "comment": "\r\n     * Sets the minimum date visible on the axis and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  If \r\n     * \u003ccode\u003edate\u003c/code\u003e is on or after the current maximum date for \r\n     * the axis, the maximum date will be shifted to preserve the current\r\n     * length of the axis.\r\n     *\r\n     * @param date  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMinimumDate()\r\n     * @see #setMaximumDate(Date)\r\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 43)",
        "(line 585,col 9)-(line 585,col 43)",
        "(line 586,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 60)",
        "(line 592,col 9)-(line 592,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getMaximumDate()",
      "begin_line": 603,
      "end_line": 614,
      "comment": "\r\n     * Returns the latest date visible on the axis.\r\n     *\r\n     * @return The date.\r\n     * \r\n     * @see #setMaximumDate(Date)\r\n     * @see #getMinimumDate()\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 27)",
        "(line 605,col 9)-(line 605,col 33)",
        "(line 606,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setMaximumDate(java.util.Date)",
      "begin_line": 628,
      "end_line": 643,
      "comment": "\r\n     * Sets the maximum date visible on the axis and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  If \r\n     * \u003ccode\u003emaximumDate\u003c/code\u003e is on or before the current minimum date for \r\n     * the axis, the minimum date will be shifted to preserve the current\r\n     * length of the axis.\r\n     *\r\n     * @param maximumDate  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMinimumDate()\r\n     * @see #setMinimumDate(Date)\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 40)",
        "(line 634,col 9)-(line 634,col 43)",
        "(line 635,col 9)-(line 635,col 50)",
        "(line 636,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 67)",
        "(line 642,col 9)-(line 642,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTickMarkPosition()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\r\n     * Returns the tick mark position (start, middle or end of the time period).\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickMarkPosition(org.jfree.chart.axis.DateTickMarkPosition)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\r\n     * Sets the tick mark position (start, middle or end of the time period) \r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 41)",
        "(line 665,col 9)-(line 665,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.configure()",
      "begin_line": 672,
      "end_line": 676,
      "comment": "\r\n     * Configures the axis to work with the specified plot.  If the axis has\r\n     * auto-scaling, then sets the maximum and minimum values.\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.isHiddenValue(long)",
      "begin_line": 686,
      "end_line": 688,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the axis hides this value, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param millis  the data value.\r\n     *\r\n     * @return A value.\r\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 701,
      "end_line": 736,
      "comment": "\r\n     * Translates the data value to the display coordinates (Java 2D User Space)\r\n     * of the chart.\r\n     *\r\n     * @param value  the date to be plotted.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be \r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate corresponding to the supplied data value.\r\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 60)",
        "(line 706,col 9)-(line 706,col 49)",
        "(line 707,col 9)-(line 707,col 77)",
        "(line 708,col 9)-(line 708,col 77)",
        "(line 709,col 9)-(line 709,col 28)",
        "(line 710,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.dateToJava2D(java.util.Date, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 749,
      "end_line": 753,
      "comment": "\r\n     * Translates a date to Java2D coordinates, based on the range displayed by\r\n     * this axis for the specified data area.\r\n     *\r\n     * @param date  the date.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be\r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate corresponding to the supplied date.\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 38)",
        "(line 752,col 9)-(line 752,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 767,
      "end_line": 796,
      "comment": "\r\n     * Translates a Java2D coordinate into the corresponding data value.  To \r\n     * perform this translation, you need to know the area used for plotting \r\n     * data, and which edge the axis is located on.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be \r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return A data value.\r\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 49)",
        "(line 771,col 9)-(line 771,col 77)",
        "(line 772,col 9)-(line 772,col 77)",
        "(line 774,col 9)-(line 774,col 25)",
        "(line 775,col 9)-(line 775,col 25)",
        "(line 776,col 9)-(line 783,col 9)",
        "(line 785,col 9)-(line 785,col 22)",
        "(line 786,col 9)-(line 793,col 9)",
        "(line 795,col 9)-(line 795,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateLowestVisibleTickValue(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 805,
      "end_line": 807,
      "comment": "\r\n     * Calculates the value of the lowest visible tick on the axis.\r\n     *\r\n     * @param unit  date unit to use.\r\n     *\r\n     * @return The value of the lowest visible tick on the axis.\r\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateHighestVisibleTickValue(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\r\n     * Calculates the value of the highest visible tick on the axis.\r\n     *\r\n     * @param unit  date unit to use.\r\n     *\r\n     * @return The value of the highest visible tick on the axis.\r\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.previousStandardDate(java.util.Date, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 828,
      "end_line": 1004,
      "comment": "\r\n     * Returns the previous \"standard\" date, for a given date and tick unit.\r\n     *\r\n     * @param date  the reference date.\r\n     * @param unit  the tick unit.\r\n     *\r\n     * @return The previous \"standard\" date.\r\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 25)",
        "(line 831,col 9)-(line 831,col 20)",
        "(line 832,col 9)-(line 832,col 20)",
        "(line 833,col 9)-(line 833,col 18)",
        "(line 834,col 9)-(line 834,col 17)",
        "(line 835,col 9)-(line 835,col 19)",
        "(line 836,col 9)-(line 836,col 18)",
        "(line 838,col 9)-(line 838,col 64)",
        "(line 839,col 9)-(line 839,col 31)",
        "(line 840,col 9)-(line 840,col 36)",
        "(line 841,col 9)-(line 841,col 60)",
        "(line 842,col 9)-(line 842,col 46)",
        "(line 844,col 9)-(line 1002,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateDateForPosition(org.jfree.data.time.RegularTimePeriod, org.jfree.chart.axis.DateTickMarkPosition)",
      "begin_line": 1015,
      "end_line": 1033,
      "comment": "\r\n     * Returns a {@link java.util.Date} corresponding to the specified position\r\n     * within a {@link RegularTimePeriod}.\r\n     *\r\n     * @param period  the period.\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A date.\r\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1021,col 27)",
        "(line 1022,col 9)-(line 1030,col 9)",
        "(line 1031,col 9)-(line 1031,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.nextStandardDate(java.util.Date, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1044,
      "end_line": 1050,
      "comment": "\r\n     * Returns the first \"standard\" date (based on the specified field and \r\n     * units).\r\n     *\r\n     * @param date  the reference date.\r\n     * @param unit  the date tick unit.\r\n     *\r\n     * @return The next \"standard\" date.\r\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 57)",
        "(line 1046,col 9)-(line 1046,col 64)",
        "(line 1047,col 9)-(line 1047,col 35)",
        "(line 1048,col 9)-(line 1048,col 63)",
        "(line 1049,col 9)-(line 1049,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.createStandardDateTickUnits()",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "\r\n     * Returns a collection of standard date tick units that uses the default \r\n     * time zone.  This collection will be used by default, but you are free \r\n     * to create your own collection if you want to (see the \r\n     * {@link ValueAxis#setStandardTickUnits(TickUnitSource)} method inherited \r\n     * from the {@link ValueAxis} class).\r\n     *\r\n     * @return A collection of standard date tick units.\r\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(java.util.TimeZone)",
      "begin_line": 1076,
      "end_line": 1195,
      "comment": "\r\n     * Returns a collection of standard date tick units.  This collection will \r\n     * be used by default, but you are free to create your own collection if \r\n     * you want to (see the \r\n     * {@link ValueAxis#setStandardTickUnits(TickUnitSource)} method inherited \r\n     * from the {@link ValueAxis} class).\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return A collection of standard date tick units.\r\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1081,col 42)",
        "(line 1084,col 9)-(line 1084,col 61)",
        "(line 1085,col 9)-(line 1085,col 57)",
        "(line 1086,col 9)-(line 1086,col 54)",
        "(line 1087,col 9)-(line 1087,col 61)",
        "(line 1088,col 9)-(line 1088,col 54)",
        "(line 1089,col 9)-(line 1089,col 57)",
        "(line 1090,col 9)-(line 1090,col 53)",
        "(line 1092,col 9)-(line 1092,col 29)",
        "(line 1093,col 9)-(line 1093,col 29)",
        "(line 1094,col 9)-(line 1094,col 29)",
        "(line 1095,col 9)-(line 1095,col 29)",
        "(line 1096,col 9)-(line 1096,col 29)",
        "(line 1097,col 9)-(line 1097,col 29)",
        "(line 1098,col 9)-(line 1098,col 29)",
        "(line 1101,col 9)-(line 1101,col 69)",
        "(line 1102,col 9)-(line 1103,col 50)",
        "(line 1104,col 9)-(line 1105,col 50)",
        "(line 1106,col 9)-(line 1107,col 50)",
        "(line 1108,col 9)-(line 1109,col 51)",
        "(line 1110,col 9)-(line 1111,col 51)",
        "(line 1112,col 9)-(line 1113,col 51)",
        "(line 1114,col 9)-(line 1115,col 51)",
        "(line 1118,col 9)-(line 1119,col 51)",
        "(line 1120,col 9)-(line 1121,col 45)",
        "(line 1122,col 9)-(line 1123,col 45)",
        "(line 1124,col 9)-(line 1125,col 45)",
        "(line 1128,col 9)-(line 1129,col 45)",
        "(line 1130,col 9)-(line 1131,col 46)",
        "(line 1132,col 9)-(line 1133,col 45)",
        "(line 1134,col 9)-(line 1135,col 45)",
        "(line 1136,col 9)-(line 1137,col 45)",
        "(line 1138,col 9)-(line 1139,col 45)",
        "(line 1140,col 9)-(line 1141,col 45)",
        "(line 1144,col 9)-(line 1145,col 45)",
        "(line 1146,col 9)-(line 1147,col 46)",
        "(line 1148,col 9)-(line 1149,col 46)",
        "(line 1150,col 9)-(line 1151,col 43)",
        "(line 1152,col 9)-(line 1153,col 43)",
        "(line 1156,col 9)-(line 1157,col 43)",
        "(line 1158,col 9)-(line 1159,col 43)",
        "(line 1160,col 9)-(line 1161,col 42)",
        "(line 1162,col 9)-(line 1163,col 42)",
        "(line 1166,col 9)-(line 1167,col 42)",
        "(line 1168,col 9)-(line 1169,col 42)",
        "(line 1170,col 9)-(line 1171,col 44)",
        "(line 1172,col 9)-(line 1173,col 44)",
        "(line 1174,col 9)-(line 1175,col 44)",
        "(line 1178,col 9)-(line 1179,col 44)",
        "(line 1180,col 9)-(line 1181,col 44)",
        "(line 1182,col 9)-(line 1183,col 43)",
        "(line 1184,col 9)-(line 1185,col 43)",
        "(line 1186,col 9)-(line 1187,col 43)",
        "(line 1188,col 9)-(line 1189,col 44)",
        "(line 1190,col 9)-(line 1191,col 44)",
        "(line 1193,col 9)-(line 1193,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.autoAdjustRange()",
      "begin_line": 1200,
      "end_line": 1251,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1202,col 30)",
        "(line 1204,col 9)-(line 1206,col 9)",
        "(line 1208,col 9)-(line 1249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1262,
      "end_line": 1273,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1284,
      "end_line": 1312,
      "comment": "\r\n     * Selects an appropriate tick size for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from a collection of \r\n     * \u0027standard\u0027 tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1288,col 23)",
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1292,col 65)",
        "(line 1293,col 9)-(line 1294,col 63)",
        "(line 1297,col 9)-(line 1297,col 58)",
        "(line 1298,col 9)-(line 1298,col 69)",
        "(line 1299,col 9)-(line 1299,col 75)",
        "(line 1300,col 9)-(line 1300,col 48)",
        "(line 1303,col 9)-(line 1303,col 71)",
        "(line 1304,col 9)-(line 1304,col 80)",
        "(line 1305,col 9)-(line 1305,col 75)",
        "(line 1306,col 9)-(line 1306,col 48)",
        "(line 1307,col 9)-(line 1307,col 66)",
        "(line 1308,col 9)-(line 1310,col 9)",
        "(line 1311,col 9)-(line 1311,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1323,
      "end_line": 1358,
      "comment": "\r\n     * Selects an appropriate tick size for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from a collection of \r\n     * \u0027standard\u0027 tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1328,col 9)-(line 1328,col 58)",
        "(line 1329,col 9)-(line 1329,col 57)",
        "(line 1332,col 9)-(line 1332,col 57)",
        "(line 1333,col 9)-(line 1334,col 69)",
        "(line 1335,col 9)-(line 1335,col 77)",
        "(line 1336,col 9)-(line 1336,col 72)",
        "(line 1337,col 9)-(line 1337,col 58)",
        "(line 1340,col 9)-(line 1341,col 75)",
        "(line 1342,col 9)-(line 1343,col 69)",
        "(line 1344,col 9)-(line 1344,col 77)",
        "(line 1345,col 9)-(line 1345,col 72)",
        "(line 1346,col 9)-(line 1346,col 49)",
        "(line 1349,col 8)-(line 1349,col 30)",
        "(line 1350,col 8)-(line 1355,col 8)",
        "(line 1356,col 8)-(line 1356,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1373,
      "end_line": 1411,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified \r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we\r\n     * just look at two values: the lower bound and the upper bound for the \r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 1376,col 9)-(line 1376,col 63)",
        "(line 1377,col 9)-(line 1377,col 79)",
        "(line 1379,col 9)-(line 1379,col 48)",
        "(line 1380,col 9)-(line 1380,col 58)",
        "(line 1381,col 9)-(line 1381,col 69)",
        "(line 1382,col 9)-(line 1407,col 9)",
        "(line 1409,col 9)-(line 1409,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1426,
      "end_line": 1464,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified \r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we \r\n     * just look at two values: the lower bound and the upper bound for the \r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 63)",
        "(line 1430,col 9)-(line 1430,col 79)",
        "(line 1432,col 9)-(line 1432,col 48)",
        "(line 1433,col 9)-(line 1433,col 58)",
        "(line 1434,col 9)-(line 1434,col 69)",
        "(line 1435,col 9)-(line 1460,col 9)",
        "(line 1462,col 9)-(line 1462,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1477,
      "end_line": 1491,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the \r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1482,col 27)",
        "(line 1483,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1489,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1502,
      "end_line": 1590,
      "comment": "\r\n     * Recalculates the ticks for the date axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1506,col 48)",
        "(line 1508,col 9)-(line 1508,col 48)",
        "(line 1509,col 9)-(line 1509,col 34)",
        "(line 1511,col 9)-(line 1513,col 9)",
        "(line 1515,col 9)-(line 1515,col 42)",
        "(line 1516,col 9)-(line 1516,col 62)",
        "(line 1517,col 9)-(line 1517,col 42)",
        "(line 1519,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1588,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1601,
      "end_line": 1663,
      "comment": "\r\n     * Recalculates the ticks for the date axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1605,col 9)-(line 1605,col 48)",
        "(line 1607,col 9)-(line 1607,col 48)",
        "(line 1608,col 9)-(line 1608,col 34)",
        "(line 1610,col 9)-(line 1612,col 9)",
        "(line 1613,col 9)-(line 1613,col 42)",
        "(line 1614,col 9)-(line 1614,col 62)",
        "(line 1616,col 9)-(line 1616,col 42)",
        "(line 1617,col 9)-(line 1661,col 9)",
        "(line 1662,col 9)-(line 1662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1681,
      "end_line": 1709,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axes and data should be \r\n     *                  drawn (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn \r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1696,col 9)",
        "(line 1699,col 9)-(line 1700,col 43)",
        "(line 1704,col 9)-(line 1705,col 27)",
        "(line 1707,col 9)-(line 1707,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.zoomRange(double, double)",
      "begin_line": 1717,
      "end_line": 1739,
      "comment": "\r\n     * Zooms in on the current range.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     ",
      "child_ranges": [
        "(line 1718,col 9)-(line 1720,col 10)",
        "(line 1721,col 9)-(line 1724,col 56)",
        "(line 1725,col 9)-(line 1725,col 30)",
        "(line 1726,col 9)-(line 1737,col 9)",
        "(line 1738,col 9)-(line 1738,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.equals(java.lang.Object)",
      "begin_line": 1748,
      "end_line": 1774,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1749,col 9)-(line 1751,col 9)",
        "(line 1752,col 9)-(line 1754,col 9)",
        "(line 1755,col 9)-(line 1755,col 39)",
        "(line 1756,col 9)-(line 1758,col 9)",
        "(line 1759,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1769,col 9)",
        "(line 1770,col 9)-(line 1772,col 9)",
        "(line 1773,col 9)-(line 1773,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.hashCode()",
      "begin_line": 1781,
      "end_line": 1788,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1782,col 9)-(line 1787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.clone()",
      "begin_line": 1798,
      "end_line": 1811,
      "comment": "\r\n     * Returns a clone of the object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1800,col 9)-(line 1800,col 50)",
        "(line 1803,col 9)-(line 1806,col 9)",
        "(line 1809,col 9)-(line 1809,col 21)"
      ]
    }
  ]
}