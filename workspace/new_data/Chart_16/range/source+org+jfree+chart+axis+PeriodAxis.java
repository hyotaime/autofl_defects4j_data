{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/PeriodAxis.java",
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
      "begin_line": 103,
      "end_line": 1182,
      "comment": "\r\n * An axis that displays a date scale based on a \r\n * {@link org.jfree.data.time.RegularTimePeriod}.  This axis works when\r\n * displayed across the bottom or top of a plot, but is broken for display at\r\n * the left or right of charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The first time period in the overall range. "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The last time period in the overall range. "
    },
    {
      "type": "field",
      "varNames": [
        "timeZone"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " \r\n     * The time zone used to convert \u0027first\u0027 and \u0027last\u0027 to absolute \r\n     * milliseconds. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "calendar"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " \r\n     * A calendar used for date manipulations in the current time zone.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeTimePeriodClass"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " \r\n     * The {@link RegularTimePeriod} subclass used to automatically determine \r\n     * the axis range. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "majorTickTimePeriodClass"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " \r\n     * Indicates the {@link RegularTimePeriod} subclass that is used to \r\n     * determine the spacing of the major tick marks.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarksVisible"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " \r\n     * A flag that indicates whether or not tick marks are visible for the \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickTimePeriodClass"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " \r\n     * Indicates the {@link RegularTimePeriod} subclass that is used to \r\n     * determine the spacing of the minor tick marks.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkInsideLength"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The length of the tick mark inside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkOutsideLength"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The length of the tick mark outside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkStroke"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The stroke used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkPaint"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The paint used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInfo"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Info for each labelling band. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String, org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param first  the first time period in the axis range \r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param last  the last time period in the axis range \r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.PeriodAxis.PeriodAxis(java.lang.String, org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod, java.util.TimeZone)",
      "begin_line": 198,
      "end_line": 219,
      "comment": "\r\n     * Creates a new axis.\r\n     * \r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param first  the first time period in the axis range \r\n     *               (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param last  the last time period in the axis range \r\n     *              (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param timeZone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 27)",
        "(line 203,col 9)-(line 203,col 27)",
        "(line 204,col 9)-(line 204,col 25)",
        "(line 205,col 9)-(line 205,col 33)",
        "(line 206,col 9)-(line 206,col 55)",
        "(line 207,col 9)-(line 207,col 57)",
        "(line 208,col 9)-(line 208,col 57)",
        "(line 209,col 9)-(line 209,col 43)",
        "(line 210,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 212,col 27)",
        "(line 213,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 215,col 45)",
        "(line 216,col 9)-(line 217,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getFirst()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns the first time period in the axis range.\r\n     * \r\n     * @return The first time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setFirst(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\r\n     * Sets the first time period in the axis range and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param first  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 27)",
        "(line 241,col 9)-(line 241,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getLast()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\r\n     * Returns the last time period in the axis range.\r\n     * \r\n     * @return The last time period (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setLast(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 259,
      "end_line": 265,
      "comment": "\r\n     * Sets the last time period in the axis range and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param last  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 25)",
        "(line 264,col 9)-(line 264,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getTimeZone()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns the time zone used to convert the periods defining the axis \r\n     * range into absolute milliseconds.\r\n     * \r\n     * @return The time zone (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setTimeZone(java.util.TimeZone)",
      "begin_line": 283,
      "end_line": 290,
      "comment": "\r\n     * Sets the time zone that is used to convert the time periods into \r\n     * absolute milliseconds.\r\n     * \r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 29)",
        "(line 288,col 9)-(line 288,col 51)",
        "(line 289,col 9)-(line 289,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getAutoRangeTimePeriodClass()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Returns the class used to create the first and last time periods for \r\n     * the axis range when the auto-range flag is set to \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setAutoRangeTimePeriodClass(java.lang.Class)",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\r\n     * Sets the class used to create the first and last time periods for the \r\n     * axis range when the auto-range flag is set to \u003ccode\u003etrue\u003c/code\u003e and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param c  the class (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 314,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMajorTickTimePeriodClass()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the class that controls the spacing of the major tick marks.\r\n     * \r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMajorTickTimePeriodClass(java.lang.Class)",
      "begin_line": 333,
      "end_line": 339,
      "comment": "\r\n     * Sets the class that controls the spacing of the major tick marks, and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param c  the class (a subclass of {@link RegularTimePeriod} is \r\n     *           expected).\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 42)",
        "(line 338,col 9)-(line 338,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.isMinorTickMarksVisible()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns the flag that controls whether or not minor tick marks\r\n     * are displayed for the axis.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarksVisible(boolean)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\r\n     * Sets the flag that controls whether or not minor tick marks\r\n     * are displayed for the axis, and sends a {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 45)",
        "(line 360,col 9)-(line 360,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickTimePeriodClass()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\r\n     * Returns the class that controls the spacing of the minor tick marks.\r\n     * \r\n     * @return The class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickTimePeriodClass(java.lang.Class)",
      "begin_line": 379,
      "end_line": 385,
      "comment": "\r\n     * Sets the class that controls the spacing of the minor tick marks, and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param c  the class (a subclass of {@link RegularTimePeriod} is \r\n     *           expected).\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 42)",
        "(line 384,col 9)-(line 384,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkStroke()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns the stroke used to display minor tick marks, if they are \r\n     * visible.\r\n     * \r\n     * @return A stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkStroke(java.awt.Stroke)",
      "begin_line": 404,
      "end_line": 410,
      "comment": "\r\n     * Sets the stroke used to display minor tick marks, if they are \r\n     * visible, and sends a {@link AxisChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 42)",
        "(line 409,col 9)-(line 409,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkPaint()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\r\n     * Returns the paint used to display minor tick marks, if they are \r\n     * visible.\r\n     * \r\n     * @return A paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkPaint(java.awt.Paint)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "\r\n     * Sets the paint used to display minor tick marks, if they are \r\n     * visible, and sends a {@link AxisChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 40)",
        "(line 434,col 9)-(line 434,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkInsideLength()",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\r\n     * Returns the inside length for the minor tick marks.\r\n     * \r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkInsideLength(float)",
      "begin_line": 452,
      "end_line": 455,
      "comment": "\r\n     * Sets the inside length of the minor tick marks and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param length  the length.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 48)",
        "(line 454,col 9)-(line 454,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getMinorTickMarkOutsideLength()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\r\n     * Returns the outside length for the minor tick marks.\r\n     * \r\n     * @return The length.\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setMinorTickMarkOutsideLength(float)",
      "begin_line": 472,
      "end_line": 475,
      "comment": "\r\n     * Sets the outside length of the minor tick marks and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param length  the length.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 49)",
        "(line 474,col 9)-(line 474,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getLabelInfo()",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\r\n     * Returns an array of label info records.\r\n     * \r\n     * @return An array.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setLabelInfo(org.jfree.chart.axis.PeriodAxisLabelInfo[])",
      "begin_line": 491,
      "end_line": 494,
      "comment": "\r\n     * Sets the array of label info records.\r\n     * \r\n     * @param info  the info.\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.getRange()",
      "begin_line": 501,
      "end_line": 505,
      "comment": "\r\n     * Returns the range for the axis.\r\n     *\r\n     * @return The axis range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 504,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 518,
      "end_line": 527,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect, \r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto \r\n     *                          range is turned off.         \r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 55)",
        "(line 521,col 9)-(line 521,col 55)",
        "(line 522,col 9)-(line 522,col 55)",
        "(line 523,col 9)-(line 524,col 48)",
        "(line 525,col 9)-(line 526,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.configure()",
      "begin_line": 533,
      "end_line": 537,
      "comment": "\r\n     * Configures the axis to work with the current plot.  Override this method\r\n     * to perform any special processing (such as auto-rescaling).\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 552,
      "end_line": 604,
      "comment": "\r\n     * Estimates the space (height or width) required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot (including axes) should \r\n     *                  be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  space already reserved.\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved \r\n     *         space).\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 566,col 9)-(line 566,col 47)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 572,col 9)-(line 572,col 65)",
        "(line 573,col 9)-(line 573,col 33)",
        "(line 574,col 9)-(line 574,col 32)",
        "(line 575,col 9)-(line 575,col 45)",
        "(line 577,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 591,col 9)",
        "(line 594,col 9)-(line 594,col 35)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 39)",
        "(line 603,col 9)-(line 603,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 620,
      "end_line": 642,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location (determines where to draw the axis).\r\n     * @param plotArea  the area within which the axes and plot should be drawn.\r\n     * @param dataArea  the area within which the data should be drawn.\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 52)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 53)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 638,col 9)-(line 639,col 38)",
        "(line 640,col 9)-(line 640,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 652,
      "end_line": 661,
      "comment": "\r\n     * Draws the tick marks for the axis.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarksHorizontal(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 672,
      "end_line": 749,
      "comment": "\r\n     * Draws the major and minor tick marks for an axis that lies at the top or \r\n     * bottom of the plot.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 37)",
        "(line 676,col 9)-(line 676,col 36)",
        "(line 677,col 9)-(line 677,col 38)",
        "(line 678,col 9)-(line 678,col 56)",
        "(line 679,col 9)-(line 679,col 58)",
        "(line 680,col 9)-(line 682,col 31)",
        "(line 683,col 9)-(line 683,col 55)",
        "(line 684,col 9)-(line 684,col 29)",
        "(line 685,col 9)-(line 685,col 30)",
        "(line 686,col 9)-(line 686,col 73)",
        "(line 687,col 9)-(line 687,col 70)",
        "(line 688,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickMarksVertical(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 759,
      "end_line": 763,
      "comment": "\r\n     * Draws the tick marks for a vertical axis.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.drawTickLabels(int, java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 776,
      "end_line": 909,
      "comment": "\r\n     * Draws the tick labels for one \"band\" of time periods.\r\n     * \r\n     * @param band  the band index (zero-based).\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge where the axis is located.\r\n     * \r\n     * @return The updated axis state.\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 28)",
        "(line 782,col 9)-(line 782,col 80)",
        "(line 783,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 39)",
        "(line 792,col 9)-(line 792,col 69)",
        "(line 793,col 9)-(line 793,col 67)",
        "(line 794,col 9)-(line 794,col 56)",
        "(line 795,col 9)-(line 795,col 58)",
        "(line 798,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 801,col 50)",
        "(line 802,col 9)-(line 803,col 66)",
        "(line 804,col 9)-(line 805,col 66)",
        "(line 806,col 9)-(line 807,col 37)",
        "(line 808,col 9)-(line 809,col 37)",
        "(line 810,col 9)-(line 810,col 58)",
        "(line 811,col 9)-(line 812,col 33)",
        "(line 813,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 820,col 62)",
        "(line 821,col 9)-(line 821,col 46)",
        "(line 823,col 9)-(line 824,col 50)",
        "(line 825,col 9)-(line 825,col 29)",
        "(line 826,col 9)-(line 826,col 25)",
        "(line 827,col 9)-(line 827,col 46)",
        "(line 828,col 9)-(line 828,col 50)",
        "(line 829,col 9)-(line 829,col 46)",
        "(line 830,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 26)",
        "(line 895,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 37)",
        "(line 908,col 9)-(line 908,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 922,
      "end_line": 927,
      "comment": "\r\n     * Calculates the positions of the ticks for the axis, storing the results\r\n     * in the tick list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the edge on which the axis is located.\r\n     * \r\n     * @return The list of ticks.\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 941,
      "end_line": 974,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the area.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 35)",
        "(line 946,col 9)-(line 946,col 71)",
        "(line 947,col 9)-(line 947,col 69)",
        "(line 948,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 986,
      "end_line": 1012,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The data value.\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 35)",
        "(line 991,col 9)-(line 991,col 25)",
        "(line 992,col 9)-(line 992,col 25)",
        "(line 993,col 9)-(line 993,col 71)",
        "(line 994,col 9)-(line 994,col 69)",
        "(line 995,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1011,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.autoAdjustRange()",
      "begin_line": 1017,
      "end_line": 1041,
      "comment": "\r\n     * Rescales the axis to ensure that all data is visible.\r\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 30)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1039,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.equals(java.lang.Object)",
      "begin_line": 1050,
      "end_line": 1093,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1091,col 9)",
        "(line 1092,col 9)-(line 1092,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.hashCode()",
      "begin_line": 1100,
      "end_line": 1107,
      "comment": "\r\n     * Returns a hash code for this object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.clone()",
      "begin_line": 1117,
      "end_line": 1126,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class is cloneable, but \r\n     *         subclasses may not be.\r\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 54)",
        "(line 1119,col 9)-(line 1119,col 58)",
        "(line 1120,col 9)-(line 1120,col 73)",
        "(line 1121,col 9)-(line 1124,col 9)",
        "(line 1125,col 9)-(line 1125,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.createInstance(java.lang.Class, java.util.Date, java.util.TimeZone)",
      "begin_line": 1139,
      "end_line": 1152,
      "comment": "\r\n     * A utility method used to create a particular subclass of the \r\n     * {@link RegularTimePeriod} class that includes the specified millisecond, \r\n     * assuming the specified time zone.\r\n     * \r\n     * @param periodClass  the class.\r\n     * @param millisecond  the time.\r\n     * @param zone  the time zone.\r\n     * \r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 1141,col 9)-(line 1141,col 40)",
        "(line 1142,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1161,
      "end_line": 1165,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 36)",
        "(line 1163,col 9)-(line 1163,col 70)",
        "(line 1164,col 9)-(line 1164,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.PeriodAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1175,
      "end_line": 1180,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 35)",
        "(line 1178,col 9)-(line 1178,col 70)",
        "(line 1179,col 9)-(line 1179,col 68)"
      ]
    }
  ]
}