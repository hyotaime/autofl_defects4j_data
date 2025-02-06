{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/PeriodAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PeriodAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.ValueAxis",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 110,
      "end_line": 1234,
      "comment": "\r\n * An axis that displays a date scale based on a\r\n * {@link org.jfree.data.time.RegularTimePeriod}.  This axis works when\r\n * displayed across the bottom or top of a plot, but is broken for display at\r\n * the left or right of charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The first time period in the overall range. "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The last time period in the overall range. "
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * The time zone used to convert \u0027first\u0027 and \u0027last\u0027 to absolute\r\n     * milliseconds.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "locale"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\r\n     * The locale (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "calendar"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * A calendar used for date manipulations in the current time zone and\r\n     * locale.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeTimePeriodClass"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\r\n     * The {@link RegularTimePeriod} subclass used to automatically determine\r\n     * the axis range.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickTimePeriodClass"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\r\n     * Indicates the {@link RegularTimePeriod} subclass that is used to\r\n     * determine the spacing of the major tick marks.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarksVisible"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\r\n     * A flag that indicates whether or not tick marks are visible for the\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickTimePeriodClass"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\r\n     * Indicates the {@link RegularTimePeriod} subclass that is used to\r\n     * determine the spacing of the minor tick marks.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkInsideLength"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The length of the tick mark inside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkOutsideLength"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The length of the tick mark outside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkStroke"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The stroke used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkPaint"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The paint used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInfo"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Info for each labelling band. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String, org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param first  the first time period in the axis range\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param last  the last time period in the axis range\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String, org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod, java.util.TimeZone, java.util.Locale)",
      "begin_line": 216,
      "end_line": 243,
      "comment": "\r\n     * Creates a new axis.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param first  the first time period in the axis range\r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param last  the last time period in the axis range\r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param timeZone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 27)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 27)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 33)",
        "(line 228,col 9)-(line 228,col 29)",
        "(line 229,col 9)-(line 229,col 63)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 232,col 57)",
        "(line 233,col 9)-(line 233,col 57)",
        "(line 234,col 9)-(line 234,col 43)",
        "(line 235,col 9)-(line 236,col 47)",
        "(line 237,col 9)-(line 237,col 27)",
        "(line 238,col 9)-(line 238,col 52)",
        "(line 239,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 242,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getFirst()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Returns the first time period in the axis range.\r\n     *\r\n     * @return The first time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setFirst(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 260,
      "end_line": 267,
      "comment": "\r\n     * Sets the first time period in the axis range and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param first  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 27)",
        "(line 265,col 9)-(line 265,col 38)",
        "(line 266,col 9)-(line 266,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getLast()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\r\n     * Returns the last time period in the axis range.\r\n     *\r\n     * @return The last time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setLast(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 284,
      "end_line": 291,
      "comment": "\r\n     * Sets the last time period in the axis range and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param last  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 25)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 290,col 9)-(line 290,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getTimeZone()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\r\n     * Returns the time zone used to convert the periods defining the axis\r\n     * range into absolute milliseconds.\r\n     *\r\n     * @return The time zone (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setTimeZone(java.util.TimeZone)",
      "begin_line": 309,
      "end_line": 318,
      "comment": "\r\n     * Sets the time zone that is used to convert the time periods into\r\n     * absolute milliseconds.\r\n     *\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 317,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getLocale()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the locale for this axis.\r\n     *\r\n     * @return The locale (never (\u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getAutoRangeTimePeriodClass()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\r\n     * Returns the class used to create the first and last time periods for\r\n     * the axis range when the auto-range flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setAutoRangeTimePeriodClass(java.lang.Class)",
      "begin_line": 348,
      "end_line": 354,
      "comment": "\r\n     * Sets the class used to create the first and last time periods for the\r\n     * axis range when the auto-range flag is set to \u003ccode\u003etrue\u003c/code\u003e and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param c  the class (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 42)",
        "(line 353,col 9)-(line 353,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMajorTickTimePeriodClass()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\r\n     * Returns the class that controls the spacing of the major tick marks.\r\n     *\r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMajorTickTimePeriodClass(java.lang.Class)",
      "begin_line": 372,
      "end_line": 378,
      "comment": "\r\n     * Sets the class that controls the spacing of the major tick marks, and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param c  the class (a subclass of {@link RegularTimePeriod} is\r\n     *           expected).\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 42)",
        "(line 377,col 9)-(line 377,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.isMinorTickMarksVisible()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns the flag that controls whether or not minor tick marks\r\n     * are displayed for the axis.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarksVisible(boolean)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Sets the flag that controls whether or not minor tick marks\r\n     * are displayed for the axis, and sends a {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 45)",
        "(line 399,col 9)-(line 399,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickTimePeriodClass()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\r\n     * Returns the class that controls the spacing of the minor tick marks.\r\n     *\r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickTimePeriodClass(java.lang.Class)",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\r\n     * Sets the class that controls the spacing of the minor tick marks, and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param c  the class (a subclass of {@link RegularTimePeriod} is\r\n     *           expected).\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 42)",
        "(line 423,col 9)-(line 423,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkStroke()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the stroke used to display minor tick marks, if they are\r\n     * visible.\r\n     *\r\n     * @return A stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkStroke(java.awt.Stroke)",
      "begin_line": 443,
      "end_line": 449,
      "comment": "\r\n     * Sets the stroke used to display minor tick marks, if they are\r\n     * visible, and sends a {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 42)",
        "(line 448,col 9)-(line 448,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkPaint()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\r\n     * Returns the paint used to display minor tick marks, if they are\r\n     * visible.\r\n     *\r\n     * @return A paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkPaint(java.awt.Paint)",
      "begin_line": 468,
      "end_line": 474,
      "comment": "\r\n     * Sets the paint used to display minor tick marks, if they are\r\n     * visible, and sends a {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 40)",
        "(line 473,col 9)-(line 473,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkInsideLength()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\r\n     * Returns the inside length for the minor tick marks.\r\n     *\r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkInsideLength(float)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\r\n     * Sets the inside length of the minor tick marks and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the length.\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 48)",
        "(line 493,col 9)-(line 493,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkOutsideLength()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\r\n     * Returns the outside length for the minor tick marks.\r\n     *\r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkOutsideLength(float)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "\r\n     * Sets the outside length of the minor tick marks and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the length.\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 49)",
        "(line 513,col 9)-(line 513,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getLabelInfo()",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\r\n     * Returns an array of label info records.\r\n     *\r\n     * @return An array.\r\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setLabelInfo(org.jfree.chart.axis.PeriodAxisLabelInfo[])",
      "begin_line": 531,
      "end_line": 534,
      "comment": "\r\n     * Sets the array of label info records and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param info  the info.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 30)",
        "(line 533,col 9)-(line 533,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getRange()",
      "begin_line": 541,
      "end_line": 545,
      "comment": "\r\n     * Returns the range for the axis.\r\n     *\r\n     * @return The axis range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 544,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 558,
      "end_line": 569,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect,\r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto\r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 55)",
        "(line 561,col 9)-(line 561,col 55)",
        "(line 562,col 9)-(line 563,col 61)",
        "(line 564,col 9)-(line 565,col 61)",
        "(line 566,col 9)-(line 568,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.configure()",
      "begin_line": 575,
      "end_line": 579,
      "comment": "\r\n     * Configures the axis to work with the current plot.  Override this method\r\n     * to perform any special processing (such as auto-rescaling).\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 594,
      "end_line": 646,
      "comment": "\r\n     * Estimates the space (height or width) required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot (including axes) should\r\n     *                  be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  space already reserved.\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved\r\n     *         space).\r\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 600,col 9)",
        "(line 603,col 9)-(line 605,col 9)",
        "(line 608,col 9)-(line 608,col 47)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 614,col 9)-(line 614,col 65)",
        "(line 615,col 9)-(line 615,col 33)",
        "(line 616,col 9)-(line 616,col 32)",
        "(line 617,col 9)-(line 617,col 45)",
        "(line 619,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 633,col 9)",
        "(line 636,col 9)-(line 636,col 35)",
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 39)",
        "(line 645,col 9)-(line 645,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 662,
      "end_line": 685,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location (determines where to draw the axis).\r\n     * @param plotArea  the area within which the axes and plot should be drawn.\r\n     * @param dataArea  the area within which the data should be drawn.\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 666,col 9)-(line 666,col 52)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 677,col 9)",
        "(line 681,col 9)-(line 682,col 38)",
        "(line 683,col 9)-(line 683,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 695,
      "end_line": 704,
      "comment": "\r\n     * Draws the tick marks for the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 703,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarksHorizontal(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 715,
      "end_line": 793,
      "comment": "\r\n     * Draws the major and minor tick marks for an axis that lies at the top or\r\n     * bottom of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 37)",
        "(line 719,col 9)-(line 719,col 36)",
        "(line 720,col 9)-(line 720,col 38)",
        "(line 721,col 9)-(line 721,col 56)",
        "(line 722,col 9)-(line 722,col 58)",
        "(line 723,col 9)-(line 724,col 67)",
        "(line 725,col 9)-(line 725,col 42)",
        "(line 726,col 9)-(line 726,col 29)",
        "(line 727,col 9)-(line 727,col 30)",
        "(line 728,col 9)-(line 728,col 60)",
        "(line 729,col 9)-(line 729,col 61)",
        "(line 730,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarksVertical(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 803,
      "end_line": 807,
      "comment": "\r\n     * Draws the tick marks for a vertical axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickLabels(int, java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 820,
      "end_line": 953,
      "comment": "\r\n     * Draws the tick labels for one \"band\" of time periods.\r\n     *\r\n     * @param band  the band index (zero-based).\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge where the axis is located.\r\n     *\r\n     * @return The updated axis state.\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 28)",
        "(line 826,col 9)-(line 826,col 80)",
        "(line 827,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 39)",
        "(line 836,col 9)-(line 836,col 56)",
        "(line 837,col 9)-(line 837,col 54)",
        "(line 838,col 9)-(line 838,col 56)",
        "(line 839,col 9)-(line 839,col 58)",
        "(line 842,col 9)-(line 843,col 63)",
        "(line 844,col 9)-(line 845,col 63)",
        "(line 846,col 9)-(line 847,col 53)",
        "(line 848,col 9)-(line 849,col 53)",
        "(line 850,col 9)-(line 851,col 37)",
        "(line 852,col 9)-(line 853,col 37)",
        "(line 854,col 9)-(line 854,col 58)",
        "(line 855,col 9)-(line 856,col 33)",
        "(line 857,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 864,col 49)",
        "(line 865,col 9)-(line 865,col 46)",
        "(line 867,col 9)-(line 868,col 63)",
        "(line 869,col 9)-(line 869,col 29)",
        "(line 870,col 9)-(line 870,col 25)",
        "(line 871,col 9)-(line 871,col 46)",
        "(line 872,col 9)-(line 872,col 50)",
        "(line 873,col 9)-(line 873,col 46)",
        "(line 874,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 26)",
        "(line 939,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 951,col 37)",
        "(line 952,col 9)-(line 952,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 966,
      "end_line": 969,
      "comment": "\r\n     * Calculates the positions of the ticks for the axis, storing the results\r\n     * in the tick list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the edge on which the axis is located.\r\n     *\r\n     * @return The list of ticks.\r\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 983,
      "end_line": 1015,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the area.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 35)",
        "(line 987,col 9)-(line 987,col 58)",
        "(line 988,col 9)-(line 988,col 56)",
        "(line 989,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1027,
      "end_line": 1052,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 35)",
        "(line 1031,col 9)-(line 1031,col 25)",
        "(line 1032,col 9)-(line 1032,col 25)",
        "(line 1033,col 9)-(line 1033,col 58)",
        "(line 1034,col 9)-(line 1034,col 56)",
        "(line 1035,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.autoAdjustRange()",
      "begin_line": 1057,
      "end_line": 1081,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 30)",
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1079,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.equals(java.lang.Object)",
      "begin_line": 1090,
      "end_line": 1136,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1097,col 9)-(line 1097,col 43)",
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1106,col 9)",
        "(line 1107,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1113,col 9)",
        "(line 1114,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1128,col 9)",
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1135,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.hashCode()",
      "begin_line": 1143,
      "end_line": 1150,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.clone()",
      "begin_line": 1160,
      "end_line": 1169,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class is cloneable, but\r\n     *         subclasses may not be.\r\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1161,col 54)",
        "(line 1162,col 9)-(line 1162,col 58)",
        "(line 1163,col 9)-(line 1163,col 73)",
        "(line 1164,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.createInstance(java.lang.Class, java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 1183,
      "end_line": 1204,
      "comment": "\r\n     * A utility method used to create a particular subclass of the\r\n     * {@link RegularTimePeriod} class that includes the specified millisecond,\r\n     * assuming the specified time zone.\r\n     *\r\n     * @param periodClass  the class.\r\n     * @param millisecond  the time.\r\n     * @param zone  the time zone.\r\n     * @param locale  the locale.\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 40)",
        "(line 1186,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1213,
      "end_line": 1217,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 36)",
        "(line 1215,col 9)-(line 1215,col 70)",
        "(line 1216,col 9)-(line 1216,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1227,
      "end_line": 1232,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 35)",
        "(line 1230,col 9)-(line 1230,col 70)",
        "(line 1231,col 9)-(line 1231,col 68)"
      ]
    }
  ]
}