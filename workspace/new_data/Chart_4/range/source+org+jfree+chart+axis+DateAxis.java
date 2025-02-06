{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/DateAxis.java",
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
      "begin_line": 178,
      "end_line": 1951,
      "comment": "\r\n * The base class for axes that display dates.  You will find it easier to\r\n * understand how this axis works if you bear in mind that it really\r\n * displays/measures integer (or long) data, where the integers are\r\n * milliseconds since midnight, 1-Jan-1970.  When displaying tick labels, the\r\n * millisecond values are converted back to dates using a\r\n * \u003ccode\u003eDateFormat\u003c/code\u003e instance.\r\n * \u003cP\u003e\r\n * You can also create a {@link org.jfree.chart.axis.Timeline} and supply in\r\n * the constructor to create an axis that only contains certain domain values.\r\n * For example, this allows you to create a date axis that only contains\r\n * working days.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DATE_RANGE"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The default axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_MINIMUM_SIZE_IN_MILLISECONDS"
      ],
      "begin_line": 187,
      "end_line": 188,
      "comment": " The default minimum auto range size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DATE_TICK_UNIT"
      ],
      "begin_line": 191,
      "end_line": 192,
      "comment": " The default date tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ANCHOR_DATE"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The default anchor date. "
    },
    {
      "type": "field",
      "varNames": [
        "tickUnit"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The current tick unit. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatOverride"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The override date format. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkPosition"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\r\n     * Tick marks can be displayed at the start or the middle of the time\r\n     * period.\r\n     "
    },
    {
      "type": "class_interface",
      "name": "DefaultTimeline",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Timeline",
        "java.io.Serializable"
      ],
      "begin_line": 213,
      "end_line": 318,
      "comment": "\r\n     * A timeline that includes all milliseconds (as defined by\r\n     * \u003ccode\u003ejava.util.Date\u003c/code\u003e) in the real time line.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toTimelineValue(long)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n         * Converts a millisecond into a timeline value.\r\n         *\r\n         * @param millisecond  the millisecond.\r\n         *\r\n         * @return The timeline value.\r\n         ",
      "child_ranges": [
        "(line 223,col 13)-(line 223,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toTimelineValue(java.util.Date)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n         * Converts a date into a timeline value.\r\n         *\r\n         * @param date  the domain value.\r\n         *\r\n         * @return The timeline value.\r\n         ",
      "child_ranges": [
        "(line 234,col 13)-(line 234,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.toMillisecond(long)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n         * Converts a timeline value into a millisecond (as encoded by\r\n         * \u003ccode\u003ejava.util.Date\u003c/code\u003e).\r\n         *\r\n         * @param value  the value.\r\n         *\r\n         * @return The millisecond.\r\n         ",
      "child_ranges": [
        "(line 246,col 13)-(line 246,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainValue(long)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified\r\n         * domain value.\r\n         *\r\n         * @param millisecond  the millisecond.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainValue(java.util.Date)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified\r\n         * domain value.\r\n         *\r\n         * @param date  the date.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 270,col 13)-(line 270,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainRange(long, long)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified\r\n         * domain value range.\r\n         *\r\n         * @param from  the start value.\r\n         * @param to  the end value.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 283,col 13)-(line 283,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.containsDomainRange(java.util.Date, java.util.Date)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n         * Returns \u003ccode\u003etrue\u003c/code\u003e if the timeline includes the specified\r\n         * domain value range.\r\n         *\r\n         * @param from  the start date.\r\n         * @param to  the end date.\r\n         *\r\n         * @return \u003ccode\u003etrue\u003c/code\u003e.\r\n         ",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.DefaultTimeline.equals(java.lang.Object)",
      "begin_line": 306,
      "end_line": 317,
      "comment": "\r\n         * Tests an object for equality with this instance.\r\n         *\r\n         * @param object  the object.\r\n         *\r\n         * @return A boolean.\r\n         ",
      "child_ranges": [
        "(line 307,col 13)-(line 309,col 13)",
        "(line 310,col 13)-(line 312,col 13)",
        "(line 313,col 13)-(line 315,col 13)",
        "(line 316,col 13)-(line 316,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIMELINE"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " A static default timeline shared by all standard DateAxis "
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " The time zone for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": "\r\n     * The locale for the axis (\u003ccode\u003enull\u003c/code\u003e is not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "timeline"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Our underlying timeline. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\r\n     * Creates a date axis with no label.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis(java.lang.String)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\r\n     * Creates a date axis with the specified label.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis(java.lang.String, java.util.TimeZone)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\r\n     * Creates a date axis. A timeline is specified for the axis. This allows\r\n     * special transformations to occur between a domain of values and the\r\n     * values included in the axis.\r\n     *\r\n     * @see org.jfree.chart.axis.SegmentedTimeline\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param zone  the time zone.\r\n     *\r\n     * @deprecated From 1.0.11 onwards, use {@link #DateAxis(String, TimeZone,\r\n     *         Locale)} instead, to explicitly set the locale.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.DateAxis.DateAxis(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 382,
      "end_line": 392,
      "comment": "\r\n     * Creates a date axis. A timeline is specified for the axis. This allows\r\n     * special transformations to occur between a domain of values and the\r\n     * values included in the axis.\r\n     *\r\n     * @see org.jfree.chart.axis.SegmentedTimeline\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 73)",
        "(line 384,col 9)-(line 384,col 67)",
        "(line 385,col 9)-(line 386,col 65)",
        "(line 387,col 9)-(line 387,col 51)",
        "(line 388,col 9)-(line 388,col 39)",
        "(line 389,col 9)-(line 389,col 29)",
        "(line 390,col 9)-(line 390,col 29)",
        "(line 391,col 9)-(line 391,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTimeZone()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\r\n     * Returns the time zone for the axis.\r\n     *\r\n     * @return The time zone (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @see #setTimeZone(TimeZone)\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTimeZone(java.util.TimeZone)",
      "begin_line": 417,
      "end_line": 427,
      "comment": "\r\n     * Sets the time zone for the axis and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     *\r\n     * @see #getTimeZone()\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTimeline()",
      "begin_line": 434,
      "end_line": 436,
      "comment": "\r\n     * Returns the underlying timeline used by this axis.\r\n     *\r\n     * @return The timeline.\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTimeline(org.jfree.chart.axis.Timeline)",
      "begin_line": 446,
      "end_line": 451,
      "comment": "\r\n     * Sets the underlying timeline to use for this axis.\r\n     * \u003cP\u003e\r\n     * If the timeline is changed, an {@link AxisChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param timeline  the timeline.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 450,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTickUnit()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\r\n     * Returns the tick unit for the axis.\r\n     * \u003cp\u003e\r\n     * Note: if the \u003ccode\u003eautoTickUnitSelection\u003c/code\u003e flag is\r\n     * \u003ccode\u003etrue\u003c/code\u003e the tick unit may be changed while the axis is being\r\n     * drawn, so in that case the return value from this method may be\r\n     * irrelevant if the method is called before the axis has been drawn.\r\n     *\r\n     * @return The tick unit (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickUnit(DateTickUnit)\r\n     * @see ValueAxis#isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickUnit(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Sets the tick unit for the axis.  The auto-tick-unit-selection flag is\r\n     * set to \u003ccode\u003efalse\u003c/code\u003e, and registered listeners are notified that\r\n     * the axis has been changed.\r\n     *\r\n     * @param unit  the tick unit.\r\n     *\r\n     * @see #getTickUnit()\r\n     * @see #setTickUnit(DateTickUnit, boolean, boolean)\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickUnit(org.jfree.chart.axis.DateTickUnit, boolean, boolean)",
      "begin_line": 493,
      "end_line": 504,
      "comment": "\r\n     * Sets the tick unit attribute.\r\n     *\r\n     * @param unit  the new tick unit.\r\n     * @param notify  notify registered listeners?\r\n     * @param turnOffAutoSelection  turn off auto selection?\r\n     *\r\n     * @see #getTickUnit()\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 29)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getDateFormatOverride()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\r\n     * Returns the date format override.  If this is non-null, then it will be\r\n     * used to format the dates on the axis.\r\n     *\r\n     * @return The formatter (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setDateFormatOverride(java.text.DateFormat)",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\r\n     * Sets the date format override.  If this is non-null, then it will be\r\n     * used to format the dates on the axis.\r\n     *\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 44)",
        "(line 524,col 9)-(line 524,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(org.jfree.data.Range)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\r\n     * Sets the upper and lower bounds for the axis and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect,\r\n     * the auto-range flag is set to false.\r\n     *\r\n     * @param range  the new range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 549,
      "end_line": 560,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect,\r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto\r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(java.util.Date, java.util.Date)",
      "begin_line": 569,
      "end_line": 574,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param lower  the lower bound for the axis.\r\n     * @param upper  the upper bound for the axis.\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setRange(double, double)",
      "begin_line": 583,
      "end_line": 588,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param lower  the lower bound for the axis.\r\n     * @param upper  the upper bound for the axis.\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getMinimumDate()",
      "begin_line": 598,
      "end_line": 609,
      "comment": "\r\n     * Returns the earliest date visible on the axis.\r\n     *\r\n     * @return The date.\r\n     *\r\n     * @see #setMinimumDate(Date)\r\n     * @see #getMaximumDate()\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 27)",
        "(line 600,col 9)-(line 600,col 33)",
        "(line 601,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 608,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setMinimumDate(java.util.Date)",
      "begin_line": 623,
      "end_line": 638,
      "comment": "\r\n     * Sets the minimum date visible on the axis and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  If\r\n     * \u003ccode\u003edate\u003c/code\u003e is on or after the current maximum date for\r\n     * the axis, the maximum date will be shifted to preserve the current\r\n     * length of the axis.\r\n     *\r\n     * @param date  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMinimumDate()\r\n     * @see #setMaximumDate(Date)\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 628,col 40)",
        "(line 629,col 9)-(line 629,col 43)",
        "(line 630,col 9)-(line 630,col 43)",
        "(line 631,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 60)",
        "(line 637,col 9)-(line 637,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getMaximumDate()",
      "begin_line": 648,
      "end_line": 659,
      "comment": "\r\n     * Returns the latest date visible on the axis.\r\n     *\r\n     * @return The date.\r\n     *\r\n     * @see #setMaximumDate(Date)\r\n     * @see #getMinimumDate()\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 27)",
        "(line 650,col 9)-(line 650,col 33)",
        "(line 651,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setMaximumDate(java.util.Date)",
      "begin_line": 673,
      "end_line": 688,
      "comment": "\r\n     * Sets the maximum date visible on the axis and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  If\r\n     * \u003ccode\u003emaximumDate\u003c/code\u003e is on or before the current minimum date for\r\n     * the axis, the minimum date will be shifted to preserve the current\r\n     * length of the axis.\r\n     *\r\n     * @param maximumDate  the date (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMinimumDate()\r\n     * @see #setMinimumDate(Date)\r\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 40)",
        "(line 679,col 9)-(line 679,col 43)",
        "(line 680,col 9)-(line 680,col 50)",
        "(line 681,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 67)",
        "(line 687,col 9)-(line 687,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.getTickMarkPosition()",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\r\n     * Returns the tick mark position (start, middle or end of the time period).\r\n     *\r\n     * @return The position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.setTickMarkPosition(org.jfree.chart.axis.DateTickMarkPosition)",
      "begin_line": 705,
      "end_line": 711,
      "comment": "\r\n     * Sets the tick mark position (start, middle or end of the time period)\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 41)",
        "(line 710,col 9)-(line 710,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.configure()",
      "begin_line": 717,
      "end_line": 721,
      "comment": "\r\n     * Configures the axis to work with the specified plot.  If the axis has\r\n     * auto-scaling, then sets the maximum and minimum values.\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.isHiddenValue(long)",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the axis hides this value, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param millis  the data value.\r\n     *\r\n     * @return A value.\r\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 746,
      "end_line": 781,
      "comment": "\r\n     * Translates the data value to the display coordinates (Java 2D User Space)\r\n     * of the chart.\r\n     *\r\n     * @param value  the date to be plotted.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be\r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate corresponding to the supplied data value.\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 60)",
        "(line 751,col 9)-(line 751,col 49)",
        "(line 752,col 9)-(line 752,col 79)",
        "(line 753,col 9)-(line 753,col 79)",
        "(line 754,col 9)-(line 754,col 28)",
        "(line 755,col 9)-(line 778,col 9)",
        "(line 779,col 9)-(line 779,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.dateToJava2D(java.util.Date, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 794,
      "end_line": 798,
      "comment": "\r\n     * Translates a date to Java2D coordinates, based on the range displayed by\r\n     * this axis for the specified data area.\r\n     *\r\n     * @param date  the date.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be\r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return The coordinate corresponding to the supplied date.\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 38)",
        "(line 797,col 9)-(line 797,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 812,
      "end_line": 841,
      "comment": "\r\n     * Translates a Java2D coordinate into the corresponding data value.  To\r\n     * perform this translation, you need to know the area used for plotting\r\n     * data, and which edge the axis is located on.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the rectangle (in Java2D space) where the data is to be\r\n     *              plotted.\r\n     * @param edge  the axis location.\r\n     *\r\n     * @return A data value.\r\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 49)",
        "(line 816,col 9)-(line 816,col 79)",
        "(line 817,col 9)-(line 817,col 79)",
        "(line 819,col 9)-(line 819,col 25)",
        "(line 820,col 9)-(line 820,col 25)",
        "(line 821,col 9)-(line 828,col 9)",
        "(line 830,col 9)-(line 830,col 22)",
        "(line 831,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 840,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateLowestVisibleTickValue(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "\r\n     * Calculates the value of the lowest visible tick on the axis.\r\n     *\r\n     * @param unit  date unit to use.\r\n     *\r\n     * @return The value of the lowest visible tick on the axis.\r\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateHighestVisibleTickValue(org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\r\n     * Calculates the value of the highest visible tick on the axis.\r\n     *\r\n     * @param unit  date unit to use.\r\n     *\r\n     * @return The value of the highest visible tick on the axis.\r\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.previousStandardDate(java.util.Date, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 873,
      "end_line": 1052,
      "comment": "\r\n     * Returns the previous \"standard\" date, for a given date and tick unit.\r\n     *\r\n     * @param date  the reference date.\r\n     * @param unit  the tick unit.\r\n     *\r\n     * @return The previous \"standard\" date.\r\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 25)",
        "(line 876,col 9)-(line 876,col 20)",
        "(line 877,col 9)-(line 877,col 20)",
        "(line 878,col 9)-(line 878,col 18)",
        "(line 879,col 9)-(line 879,col 17)",
        "(line 880,col 9)-(line 880,col 19)",
        "(line 881,col 9)-(line 881,col 18)",
        "(line 883,col 9)-(line 883,col 77)",
        "(line 884,col 9)-(line 884,col 31)",
        "(line 885,col 9)-(line 885,col 39)",
        "(line 886,col 9)-(line 886,col 60)",
        "(line 887,col 9)-(line 887,col 46)",
        "(line 889,col 9)-(line 889,col 48)",
        "(line 890,col 9)-(line 1050,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.calculateDateForPosition(org.jfree.data.time.RegularTimePeriod, org.jfree.chart.axis.DateTickMarkPosition)",
      "begin_line": 1063,
      "end_line": 1081,
      "comment": "\r\n     * Returns a {@link java.util.Date} corresponding to the specified position\r\n     * within a {@link RegularTimePeriod}.\r\n     *\r\n     * @param period  the period.\r\n     * @param position  the position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A date.\r\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 27)",
        "(line 1070,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1079,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.nextStandardDate(java.util.Date, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1092,
      "end_line": 1098,
      "comment": "\r\n     * Returns the first \"standard\" date (based on the specified field and\r\n     * units).\r\n     *\r\n     * @param date  the reference date.\r\n     * @param unit  the date tick unit.\r\n     *\r\n     * @return The next \"standard\" date.\r\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 57)",
        "(line 1094,col 9)-(line 1094,col 77)",
        "(line 1095,col 9)-(line 1095,col 35)",
        "(line 1096,col 9)-(line 1096,col 66)",
        "(line 1097,col 9)-(line 1097,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.createStandardDateTickUnits()",
      "begin_line": 1109,
      "end_line": 1112,
      "comment": "\r\n     * Returns a collection of standard date tick units that uses the default\r\n     * time zone.  This collection will be used by default, but you are free\r\n     * to create your own collection if you want to (see the\r\n     * {@link ValueAxis#setStandardTickUnits(TickUnitSource)} method inherited\r\n     * from the {@link ValueAxis} class).\r\n     *\r\n     * @return A collection of standard date tick units.\r\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1111,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(java.util.TimeZone)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "\r\n     * Returns a collection of standard date tick units.  This collection will\r\n     * be used by default, but you are free to create your own collection if\r\n     * you want to (see the\r\n     * {@link ValueAxis#setStandardTickUnits(TickUnitSource)} method inherited\r\n     * from the {@link ValueAxis} class).\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A collection of standard date tick units.\r\n     *\r\n     * @deprecated Since 1.0.11, use {@link #createStandardDateTickUnits(\r\n     *         TimeZone, Locale)} to explicitly set the locale as well as the\r\n     *         time zone.\r\n     ",
      "child_ranges": [
        "(line 1130,col 6)-(line 1130,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.createStandardDateTickUnits(java.util.TimeZone, java.util.Locale)",
      "begin_line": 1147,
      "end_line": 1270,
      "comment": "\r\n     * Returns a collection of standard date tick units.  This collection will\r\n     * be used by default, but you are free to create your own collection if\r\n     * you want to (see the\r\n     * {@link ValueAxis#setStandardTickUnits(TickUnitSource)} method inherited\r\n     * from the {@link ValueAxis} class).\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A collection of standard date tick units.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1152,col 9)",
        "(line 1153,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 42)",
        "(line 1159,col 9)-(line 1159,col 69)",
        "(line 1160,col 9)-(line 1160,col 65)",
        "(line 1161,col 9)-(line 1161,col 62)",
        "(line 1162,col 9)-(line 1162,col 69)",
        "(line 1163,col 9)-(line 1163,col 62)",
        "(line 1164,col 9)-(line 1164,col 65)",
        "(line 1165,col 9)-(line 1165,col 61)",
        "(line 1167,col 9)-(line 1167,col 29)",
        "(line 1168,col 9)-(line 1168,col 29)",
        "(line 1169,col 9)-(line 1169,col 29)",
        "(line 1170,col 9)-(line 1170,col 29)",
        "(line 1171,col 9)-(line 1171,col 29)",
        "(line 1172,col 9)-(line 1172,col 29)",
        "(line 1173,col 9)-(line 1173,col 29)",
        "(line 1176,col 9)-(line 1176,col 73)",
        "(line 1177,col 9)-(line 1178,col 54)",
        "(line 1179,col 9)-(line 1180,col 54)",
        "(line 1181,col 9)-(line 1182,col 54)",
        "(line 1183,col 9)-(line 1184,col 55)",
        "(line 1185,col 9)-(line 1186,col 55)",
        "(line 1187,col 9)-(line 1188,col 55)",
        "(line 1189,col 9)-(line 1190,col 55)",
        "(line 1193,col 9)-(line 1194,col 55)",
        "(line 1195,col 9)-(line 1196,col 49)",
        "(line 1197,col 9)-(line 1198,col 49)",
        "(line 1199,col 9)-(line 1200,col 49)",
        "(line 1203,col 9)-(line 1204,col 49)",
        "(line 1205,col 9)-(line 1206,col 50)",
        "(line 1207,col 9)-(line 1208,col 49)",
        "(line 1209,col 9)-(line 1210,col 49)",
        "(line 1211,col 9)-(line 1212,col 49)",
        "(line 1213,col 9)-(line 1214,col 49)",
        "(line 1215,col 9)-(line 1216,col 49)",
        "(line 1219,col 9)-(line 1220,col 49)",
        "(line 1221,col 9)-(line 1222,col 50)",
        "(line 1223,col 9)-(line 1224,col 50)",
        "(line 1225,col 9)-(line 1226,col 47)",
        "(line 1227,col 9)-(line 1228,col 47)",
        "(line 1231,col 9)-(line 1232,col 47)",
        "(line 1233,col 9)-(line 1234,col 47)",
        "(line 1235,col 9)-(line 1236,col 46)",
        "(line 1237,col 9)-(line 1238,col 46)",
        "(line 1241,col 9)-(line 1242,col 46)",
        "(line 1243,col 9)-(line 1244,col 46)",
        "(line 1245,col 9)-(line 1246,col 48)",
        "(line 1247,col 9)-(line 1248,col 48)",
        "(line 1249,col 9)-(line 1250,col 48)",
        "(line 1253,col 9)-(line 1254,col 48)",
        "(line 1255,col 9)-(line 1256,col 48)",
        "(line 1257,col 9)-(line 1258,col 47)",
        "(line 1259,col 9)-(line 1260,col 47)",
        "(line 1261,col 9)-(line 1262,col 47)",
        "(line 1263,col 9)-(line 1264,col 48)",
        "(line 1265,col 9)-(line 1266,col 48)",
        "(line 1268,col 9)-(line 1268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.autoAdjustRange()",
      "begin_line": 1275,
      "end_line": 1326,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 30)",
        "(line 1279,col 9)-(line 1281,col 9)",
        "(line 1283,col 9)-(line 1324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1337,
      "end_line": 1348,
      "comment": "\r\n     * Selects an appropriate tick value for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from an array of \u0027standard\u0027\r\n     * tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1341,col 9)-(line 1346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectHorizontalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1359,
      "end_line": 1386,
      "comment": "\r\n     * Selects an appropriate tick size for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from a collection of\r\n     * \u0027standard\u0027 tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area defined by the axes.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 23)",
        "(line 1363,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 65)",
        "(line 1367,col 9)-(line 1368,col 31)",
        "(line 1371,col 9)-(line 1371,col 58)",
        "(line 1372,col 9)-(line 1372,col 69)",
        "(line 1373,col 9)-(line 1373,col 75)",
        "(line 1374,col 9)-(line 1374,col 48)",
        "(line 1377,col 9)-(line 1377,col 71)",
        "(line 1378,col 9)-(line 1378,col 80)",
        "(line 1379,col 9)-(line 1379,col 75)",
        "(line 1380,col 9)-(line 1380,col 48)",
        "(line 1381,col 9)-(line 1381,col 66)",
        "(line 1382,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1385,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.selectVerticalAutoTickUnit(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1397,
      "end_line": 1432,
      "comment": "\r\n     * Selects an appropriate tick size for the axis.  The strategy is to\r\n     * display as many ticks as possible (selected from a collection of\r\n     * \u0027standard\u0027 tick units) without the labels overlapping.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     ",
      "child_ranges": [
        "(line 1402,col 9)-(line 1402,col 58)",
        "(line 1403,col 9)-(line 1403,col 57)",
        "(line 1406,col 9)-(line 1406,col 57)",
        "(line 1407,col 9)-(line 1408,col 69)",
        "(line 1409,col 9)-(line 1409,col 77)",
        "(line 1410,col 9)-(line 1410,col 72)",
        "(line 1411,col 9)-(line 1411,col 58)",
        "(line 1414,col 9)-(line 1415,col 75)",
        "(line 1416,col 9)-(line 1417,col 69)",
        "(line 1418,col 9)-(line 1418,col 77)",
        "(line 1419,col 9)-(line 1419,col 72)",
        "(line 1420,col 9)-(line 1420,col 49)",
        "(line 1423,col 8)-(line 1423,col 30)",
        "(line 1424,col 8)-(line 1429,col 8)",
        "(line 1430,col 8)-(line 1430,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.estimateMaximumTickLabelWidth(java.awt.Graphics2D, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1447,
      "end_line": 1485,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified\r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we\r\n     * just look at two values: the lower bound and the upper bound for the\r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 1450,col 9)-(line 1450,col 63)",
        "(line 1451,col 9)-(line 1451,col 79)",
        "(line 1453,col 9)-(line 1453,col 48)",
        "(line 1454,col 9)-(line 1454,col 58)",
        "(line 1455,col 9)-(line 1455,col 69)",
        "(line 1456,col 9)-(line 1481,col 9)",
        "(line 1483,col 9)-(line 1483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.estimateMaximumTickLabelHeight(java.awt.Graphics2D, org.jfree.chart.axis.DateTickUnit)",
      "begin_line": 1500,
      "end_line": 1538,
      "comment": "\r\n     * Estimates the maximum width of the tick labels, assuming the specified\r\n     * tick unit is used.\r\n     * \u003cP\u003e\r\n     * Rather than computing the string bounds of every tick on the axis, we\r\n     * just look at two values: the lower bound and the upper bound for the\r\n     * axis.  These two values will usually be representative.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param unit  the tick unit to use for calculation.\r\n     *\r\n     * @return The estimated maximum width of the tick labels.\r\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 63)",
        "(line 1504,col 9)-(line 1504,col 79)",
        "(line 1506,col 9)-(line 1506,col 48)",
        "(line 1507,col 9)-(line 1507,col 58)",
        "(line 1508,col 9)-(line 1508,col 69)",
        "(line 1509,col 9)-(line 1534,col 9)",
        "(line 1536,col 9)-(line 1536,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1551,
      "end_line": 1565,
      "comment": "\r\n     * Calculates the positions of the tick labels for the axis, storing the\r\n     * results in the tick label list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1556,col 9)-(line 1556,col 27)",
        "(line 1557,col 9)-(line 1562,col 9)",
        "(line 1563,col 9)-(line 1563,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.correctTickDateForPosition(java.util.Date, org.jfree.chart.axis.DateTickUnit, org.jfree.chart.axis.DateTickMarkPosition)",
      "begin_line": 1576,
      "end_line": 1589,
      "comment": "\r\n     * Corrects the given tick date for the position setting.\r\n     *\r\n     * @param time  the tick date/time.\r\n     * @param unit  the tick unit.\r\n     * @param position  the tick position.\r\n     *\r\n     * @return The adjusted time.\r\n     ",
      "child_ranges": [
        "(line 1578,col 9)-(line 1578,col 27)",
        "(line 1579,col 9)-(line 1579,col 48)",
        "(line 1580,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1588,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicksHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1600,
      "end_line": 1703,
      "comment": "\r\n     * Recalculates the ticks for the date axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the data is to be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1603,col 9)-(line 1603,col 48)",
        "(line 1605,col 9)-(line 1605,col 48)",
        "(line 1606,col 9)-(line 1606,col 34)",
        "(line 1608,col 9)-(line 1610,col 9)",
        "(line 1612,col 9)-(line 1612,col 42)",
        "(line 1613,col 9)-(line 1613,col 62)",
        "(line 1614,col 9)-(line 1614,col 42)",
        "(line 1616,col 9)-(line 1700,col 9)",
        "(line 1701,col 9)-(line 1701,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.refreshTicksVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1714,
      "end_line": 1811,
      "comment": "\r\n     * Recalculates the ticks for the date axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area in which the plot should be drawn.\r\n     * @param edge  the location of the axis.\r\n     *\r\n     * @return A list of ticks.\r\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 48)",
        "(line 1719,col 9)-(line 1719,col 48)",
        "(line 1720,col 9)-(line 1720,col 34)",
        "(line 1722,col 9)-(line 1724,col 9)",
        "(line 1725,col 9)-(line 1725,col 42)",
        "(line 1726,col 9)-(line 1726,col 62)",
        "(line 1727,col 9)-(line 1727,col 42)",
        "(line 1729,col 9)-(line 1809,col 9)",
        "(line 1810,col 9)-(line 1810,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1829,
      "end_line": 1854,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location.\r\n     * @param plotArea  the area within which the axes and data should be\r\n     *                  drawn (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the area within which the data should be drawn\r\n     *                  (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param edge  the location of the axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1834,col 9)-(line 1841,col 9)",
        "(line 1844,col 9)-(line 1845,col 43)",
        "(line 1849,col 9)-(line 1850,col 27)",
        "(line 1851,col 9)-(line 1851,col 69)",
        "(line 1852,col 9)-(line 1852,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.zoomRange(double, double)",
      "begin_line": 1862,
      "end_line": 1884,
      "comment": "\r\n     * Zooms in on the current range.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1865,col 10)",
        "(line 1866,col 9)-(line 1869,col 56)",
        "(line 1870,col 9)-(line 1870,col 30)",
        "(line 1871,col 9)-(line 1882,col 9)",
        "(line 1883,col 9)-(line 1883,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.equals(java.lang.Object)",
      "begin_line": 1893,
      "end_line": 1916,
      "comment": "\r\n     * Tests this axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1894,col 9)-(line 1896,col 9)",
        "(line 1897,col 9)-(line 1899,col 9)",
        "(line 1900,col 9)-(line 1900,col 39)",
        "(line 1901,col 9)-(line 1903,col 9)",
        "(line 1904,col 9)-(line 1907,col 9)",
        "(line 1908,col 9)-(line 1911,col 9)",
        "(line 1912,col 9)-(line 1914,col 9)",
        "(line 1915,col 9)-(line 1915,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.hashCode()",
      "begin_line": 1923,
      "end_line": 1930,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1924,col 9)-(line 1929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.DateAxis.clone()",
      "begin_line": 1940,
      "end_line": 1949,
      "comment": "\r\n     * Returns a clone of the object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1941,col 9)-(line 1941,col 50)",
        "(line 1943,col 9)-(line 1946,col 9)",
        "(line 1948,col 9)-(line 1948,col 21)"
      ]
    }
  ]
}