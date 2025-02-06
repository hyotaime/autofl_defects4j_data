{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/Axis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Axis",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 134,
      "end_line": 1578,
      "comment": "\r\n * The base class for all axes in JFreeChart.  Subclasses are divided into\r\n * those that display values ({@link ValueAxis}) and those that display\r\n * categories ({@link CategoryAxis}).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_VISIBLE"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The default axis visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_FONT"
      ],
      "begin_line": 143,
      "end_line": 144,
      "comment": " The default axis label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_PAINT"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default axis label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_INSETS"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": " The default axis label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_PAINT"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The default axis line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_STROKE"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The default axis line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABELS_VISIBLE"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The default tick labels visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_FONT"
      ],
      "begin_line": 163,
      "end_line": 164,
      "comment": " The default tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_PAINT"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The default tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_INSETS"
      ],
      "begin_line": 170,
      "end_line": 171,
      "comment": " The default tick label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARKS_VISIBLE"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The default tick marks visible. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_STROKE"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The default tick stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_PAINT"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The default tick paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_INSIDE_LENGTH"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The default tick mark inside length. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_OUTSIDE_LENGTH"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The default tick mark outside length. "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " A flag indicating whether or not the axis is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The label for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The font for displaying the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The paint for drawing the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInsets"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The insets for the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelAngle"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The label angle. "
    },
    {
      "type": "field",
      "varNames": [
        "labelToolTip"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\r\n     * The tool tip text for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelURL"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": "\r\n     * The URL for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     *\r\n     * @since 1.2.0.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineVisible"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " A flag that controls whether or not the axis line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " The stroke used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " The paint used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": "\r\n     * A flag that indicates whether or not tick labels are visible for the\r\n     * axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " The font used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " The color used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelInsets"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " The blank space around each tick label. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarksVisible"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": "\r\n     * A flag that indicates whether or not major tick marks are visible for\r\n     * the axis.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkInsideLength"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": "\r\n     * The length of the major tick mark inside the data area (zero\r\n     * permitted).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkOutsideLength"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\r\n     * The length of the major tick mark outside the data area (zero\r\n     * permitted).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarksVisible"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": "\r\n     * A flag that indicates whether or not minor tick marks are visible for the\r\n     * axis.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkInsideLength"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": "\r\n     * The length of the minor tick mark inside the data area (zero permitted).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickMarkOutsideLength"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": "\r\n     * The length of the minor tick mark outside the data area (zero permitted).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkStroke"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " The stroke used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkPaint"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " The paint used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDimension"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " The fixed (horizontal or vertical) dimension for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": "\r\n     * A reference back to the plot that the axis is assigned to (can be\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Storage for registered listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.Axis.Axis(java.lang.String)",
      "begin_line": 307,
      "end_line": 341,
      "comment": "\r\n     * Constructs an axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 27)",
        "(line 310,col 9)-(line 310,col 44)",
        "(line 311,col 9)-(line 311,col 49)",
        "(line 312,col 9)-(line 312,col 51)",
        "(line 313,col 9)-(line 313,col 53)",
        "(line 314,col 9)-(line 314,col 30)",
        "(line 315,col 9)-(line 315,col 33)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 318,col 9)-(line 318,col 36)",
        "(line 319,col 9)-(line 319,col 53)",
        "(line 320,col 9)-(line 320,col 55)",
        "(line 322,col 9)-(line 322,col 61)",
        "(line 323,col 9)-(line 323,col 53)",
        "(line 324,col 9)-(line 324,col 55)",
        "(line 325,col 9)-(line 325,col 57)",
        "(line 327,col 9)-(line 327,col 59)",
        "(line 328,col 9)-(line 328,col 55)",
        "(line 329,col 9)-(line 329,col 53)",
        "(line 330,col 9)-(line 330,col 68)",
        "(line 331,col 9)-(line 331,col 70)",
        "(line 333,col 9)-(line 333,col 43)",
        "(line 334,col 9)-(line 334,col 46)",
        "(line 335,col 9)-(line 335,col 47)",
        "(line 337,col 9)-(line 337,col 25)",
        "(line 339,col 9)-(line 339,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isVisible()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the axis is visible, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setVisible(boolean)",
      "begin_line": 363,
      "end_line": 368,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis is visible and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isVisible()\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabel()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Returns the label for the axis.\r\n     *\r\n     * @return The label for the axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #getLabelFont()\r\n     * @see #getLabelPaint()\r\n     * @see #setLabel(String)\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabel(java.lang.String)",
      "begin_line": 393,
      "end_line": 409,
      "comment": "\r\n     * Sets the label for the axis and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param label  the new label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabel()\r\n     * @see #setLabelFont(Font)\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 37)",
        "(line 396,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelFont()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\r\n     * Returns the font for the axis label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelFont(java.awt.Font)",
      "begin_line": 430,
      "end_line": 438,
      "comment": "\r\n     * Sets the font for the axis label and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelPaint()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\r\n     * Returns the color/shade used to draw the axis label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelPaint(java.awt.Paint)",
      "begin_line": 459,
      "end_line": 465,
      "comment": "\r\n     * Sets the paint used to draw the axis label and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 32)",
        "(line 464,col 9)-(line 464,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelInsets()",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Returns the insets for the label (that is, the amount of blank space\r\n     * that should be left around the label).\r\n     *\r\n     * @return The label insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 487,
      "end_line": 489,
      "comment": "\r\n     * Sets the insets for the axis label, and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLabelInsets()\r\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelInsets(org.jfree.chart.util.RectangleInsets, boolean)",
      "begin_line": 500,
      "end_line": 510,
      "comment": "\r\n     * Sets the insets for the axis label, and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelAngle()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\r\n     * Returns the angle of the axis label.\r\n     *\r\n     * @return The angle (in radians).\r\n     *\r\n     * @see #setLabelAngle(double)\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelAngle(double)",
      "begin_line": 531,
      "end_line": 534,
      "comment": "\r\n     * Sets the angle for the label and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getLabelAngle()\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 32)",
        "(line 533,col 9)-(line 533,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelToolTip()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\r\n     * Returns the tool tip text for the axis label.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelToolTip(String)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelToolTip(java.lang.String)",
      "begin_line": 559,
      "end_line": 562,
      "comment": "\r\n     * Sets the tool tip text for the axis label and sends a .\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelToolTip()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 33)",
        "(line 561,col 9)-(line 561,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelURL()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\r\n     * Returns the URL text for the axis label.\r\n     *\r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLabelURL(String)\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelURL(java.lang.String)",
      "begin_line": 587,
      "end_line": 590,
      "comment": "\r\n     * Sets the URL for the axis label and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param url  the URL (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLabelURL()\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 28)",
        "(line 589,col 9)-(line 589,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isAxisLineVisible()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * A flag that controls whether or not the axis line is drawn.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #getAxisLinePaint()\r\n     * @see #getAxisLineStroke()\r\n     * @see #setAxisLineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineVisible(boolean)",
      "begin_line": 615,
      "end_line": 618,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis line is visible and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isAxisLineVisible()\r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #setAxisLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 39)",
        "(line 617,col 9)-(line 617,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLinePaint()",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\r\n     * Returns the paint used to draw the axis line.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 639,
      "end_line": 645,
      "comment": "\r\n     * Sets the paint used to draw the axis line and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLinePaint()\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 35)",
        "(line 644,col 9)-(line 644,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLineStroke()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\r\n     * Returns the stroke used to draw the axis line.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 666,
      "end_line": 672,
      "comment": "\r\n     * Sets the stroke used to draw the axis line and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisLineStroke()\r\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 37)",
        "(line 671,col 9)-(line 671,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickLabelsVisible()",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\r\n     * Returns a flag indicating whether or not the tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #getTickLabelFont()\r\n     * @see #getTickLabelPaint()\r\n     * @see #setTickLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelsVisible(boolean)",
      "begin_line": 698,
      "end_line": 705,
      "comment": "\r\n     * Sets the flag that determines whether or not the tick labels are\r\n     * visible and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isTickLabelsVisible()\r\n     * @see #setTickLabelFont(Font)\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 703,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isMinorTickMarksVisible()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "\r\n     * Returns the flag that indicates whether or not the minor tick marks are\r\n     * showing.\r\n     *\r\n     * @return The flag that indicates whether or not the minor tick marks are\r\n     *         showing.\r\n     *\r\n     * @see #setMinorTickMarksVisible(boolean)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setMinorTickMarksVisible(boolean)",
      "begin_line": 733,
      "end_line": 738,
      "comment": "\r\n     * Sets the flag that indicates whether or not the minor tick marks are\r\n     * showing and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isMinorTickMarksVisible()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 737,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelFont()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\r\n     * Returns the font used for the tick labels (if showing).\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelFont(java.awt.Font)",
      "begin_line": 759,
      "end_line": 770,
      "comment": "\r\n     * Sets the font for the tick labels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @see #getTickLabelFont()\r\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 768,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelPaint()",
      "begin_line": 779,
      "end_line": 781,
      "comment": "\r\n     * Returns the color/shade used for the tick labels.\r\n     *\r\n     * @return The paint used for the tick labels.\r\n     *\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 780,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 791,
      "end_line": 797,
      "comment": "\r\n     * Sets the paint used to draw tick labels (if they are showing) and\r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 36)",
        "(line 796,col 9)-(line 796,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelInsets()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\r\n     * Returns the insets for the tick labels.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 818,
      "end_line": 826,
      "comment": "\r\n     * Sets the insets for the tick labels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelInsets()\r\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickMarksVisible()",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\r\n     * Returns the flag that indicates whether or not the tick marks are\r\n     * showing.\r\n     *\r\n     * @return The flag that indicates whether or not the tick marks are\r\n     *         showing.\r\n     *\r\n     * @see #setTickMarksVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarksVisible(boolean)",
      "begin_line": 849,
      "end_line": 854,
      "comment": "\r\n     * Sets the flag that indicates whether or not the tick marks are showing\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isTickMarksVisible()\r\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 853,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkInsideLength()",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\r\n     * Returns the inside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     *\r\n     * @see #getTickMarkOutsideLength()\r\n     * @see #setTickMarkInsideLength(float)\r\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkInsideLength(float)",
      "begin_line": 876,
      "end_line": 879,
      "comment": "\r\n     * Sets the inside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     *\r\n     * @see #getTickMarkInsideLength()\r\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 43)",
        "(line 878,col 9)-(line 878,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkOutsideLength()",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\r\n     * Returns the outside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     *\r\n     * @see #getTickMarkInsideLength()\r\n     * @see #setTickMarkOutsideLength(float)\r\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkOutsideLength(float)",
      "begin_line": 901,
      "end_line": 904,
      "comment": "\r\n     * Sets the outside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     *\r\n     * @see #getTickMarkInsideLength()\r\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 44)",
        "(line 903,col 9)-(line 903,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkStroke()",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\r\n     * Returns the stroke used to draw tick marks.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickMarkStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkStroke(java.awt.Stroke)",
      "begin_line": 925,
      "end_line": 933,
      "comment": "\r\n     * Sets the stroke used to draw tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickMarkStroke()\r\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 932,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkPaint()",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\r\n     * Returns the paint used to draw tick marks (if they are showing).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickMarkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkPaint(java.awt.Paint)",
      "begin_line": 954,
      "end_line": 960,
      "comment": "\r\n     * Sets the paint used to draw tick marks and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickMarkPaint()\r\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 35)",
        "(line 959,col 9)-(line 959,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getMinorTickMarkInsideLength()",
      "begin_line": 972,
      "end_line": 974,
      "comment": "\r\n     * Returns the inside length of the minor tick marks.\r\n     *\r\n     * @return The length.\r\n     *\r\n     * @see #getMinorTickMarkOutsideLength()\r\n     * @see #setMinorTickMarkInsideLength(float)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setMinorTickMarkInsideLength(float)",
      "begin_line": 986,
      "end_line": 989,
      "comment": "\r\n     * Sets the inside length of the minor tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     *\r\n     * @see #getMinorTickMarkInsideLength()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 48)",
        "(line 988,col 9)-(line 988,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getMinorTickMarkOutsideLength()",
      "begin_line": 1001,
      "end_line": 1003,
      "comment": "\r\n     * Returns the outside length of the minor tick marks.\r\n     *\r\n     * @return The length.\r\n     *\r\n     * @see #getMinorTickMarkInsideLength()\r\n     * @see #setMinorTickMarkOutsideLength(float)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setMinorTickMarkOutsideLength(float)",
      "begin_line": 1015,
      "end_line": 1018,
      "comment": "\r\n     * Sets the outside length of the minor tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     *\r\n     * @see #getMinorTickMarkInsideLength()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 49)",
        "(line 1017,col 9)-(line 1017,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getPlot()",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": "\r\n     * Returns the plot that the axis is assigned to.  This method will return\r\n     * \u003ccode\u003enull\u003c/code\u003e if the axis is not currently assigned to a plot.\r\n     *\r\n     * @return The plot that the axis is assigned to (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(Plot)\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setPlot(org.jfree.chart.plot.Plot)",
      "begin_line": 1042,
      "end_line": 1045,
      "comment": "\r\n     * Sets a reference to the plot that the axis is assigned to.\r\n     * \u003cP\u003e\r\n     * This method is used internally, you shouldn\u0027t need to call it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     *\r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 25)",
        "(line 1044,col 9)-(line 1044,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getFixedDimension()",
      "begin_line": 1054,
      "end_line": 1056,
      "comment": "\r\n     * Returns the fixed dimension for the axis.\r\n     *\r\n     * @return The fixed dimension.\r\n     *\r\n     * @see #setFixedDimension(double)\r\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setFixedDimension(double)",
      "begin_line": 1071,
      "end_line": 1073,
      "comment": "\r\n     * Sets the fixed dimension for the axis.\r\n     * \u003cP\u003e\r\n     * This is used when combining more than one plot on a chart.  In this case,\r\n     * there may be several axes that need to have the same height or width so\r\n     * that they are aligned.  This method is used to fix a dimension for the\r\n     * axis (the context determines whether the dimension is horizontal or\r\n     * vertical).\r\n     *\r\n     * @param dimension  the fixed dimension.\r\n     *\r\n     * @see #getFixedDimension()\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.configure()",
      "begin_line": 1079,
      "end_line": 1079,
      "comment": "\r\n     * Configures the axis to work with the current plot.  Override this method\r\n     * to perform any special processing (such as auto-rescaling).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 1094,
      "end_line": 1097,
      "comment": "\r\n     * Estimates the space (height or width) required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot (including axes) should\r\n     *                  be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  space already reserved.\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved\r\n     *         space).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1113,
      "end_line": 1118,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location (determines where to draw the axis).\r\n     * @param plotArea  the area within which the axes and plot should be drawn.\r\n     * @param dataArea  the area within which the data should be drawn.\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1131,
      "end_line": 1132,
      "comment": "\r\n     * Calculates the positions of the ticks for the axis, storing the results\r\n     * in the tick list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the edge on which the axis is located.\r\n     *\r\n     * @return The list of ticks.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.createAndAddEntity(double, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1147,
      "end_line": 1177,
      "comment": "\r\n     * Created an entity for the axis.\r\n     *\r\n     * @param cursor  the initial cursor value.\r\n     * @param state  the axis state after completion of the drawing with a\r\n     *     possibly updated cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     * @param plotState  the PlotRenderingInfo from which a reference to the\r\n     *     entity collection can be obtained.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1153,col 9)",
        "(line 1154,col 9)-(line 1154,col 35)",
        "(line 1155,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1173,col 72)",
        "(line 1174,col 9)-(line 1176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.addChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\r\n     * Registers an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object that is being registered.\r\n     *\r\n     * @see #removeChangeListener(AxisChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1187,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.removeChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "\r\n     * Deregisters an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object to deregister.\r\n     *\r\n     * @see #addChangeListener(AxisChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.hasListener(java.util.EventListener)",
      "begin_line": 1210,
      "end_line": 1213,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this\r\n     * method, it exists mainly for use by unit testing code.\r\n     *\r\n     * @param listener  the listener.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 71)",
        "(line 1212,col 9)-(line 1212,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.notifyListeners(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1221,
      "end_line": 1228,
      "comment": "\r\n     * Notifies all registered listeners that the axis has changed.\r\n     * The AxisChangeEvent provides information about the change.\r\n     *\r\n     * @param event  information about the change to the axis.\r\n     ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1222,col 65)",
        "(line 1223,col 9)-(line 1227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.fireChangeEvent()",
      "begin_line": 1235,
      "end_line": 1237,
      "comment": "\r\n     * Sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelEnclosure(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1248,
      "end_line": 1271,
      "comment": "\r\n     * Returns a rectangle that encloses the axis label.  This is typically\r\n     * used for layout purposes (it gives the maximum dimensions of the label).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param edge  the edge of the plot area along which the axis is measuring.\r\n     *\r\n     * @return The enclosing rectangle.\r\n     ",
      "child_ranges": [
        "(line 1250,col 9)-(line 1250,col 54)",
        "(line 1251,col 9)-(line 1251,col 38)",
        "(line 1252,col 9)-(line 1267,col 9)",
        "(line 1269,col 9)-(line 1269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1286,
      "end_line": 1396,
      "comment": "\r\n     * Draws the axis label.\r\n     *\r\n     * @param label  the label text.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the location of the axis.\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  the plot state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Information about the axis.\r\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1293,col 9)",
        "(line 1295,col 9)-(line 1297,col 9)",
        "(line 1299,col 9)-(line 1299,col 35)",
        "(line 1300,col 9)-(line 1300,col 50)",
        "(line 1301,col 9)-(line 1301,col 25)",
        "(line 1302,col 9)-(line 1302,col 37)",
        "(line 1303,col 9)-(line 1303,col 45)",
        "(line 1304,col 9)-(line 1304,col 77)",
        "(line 1305,col 9)-(line 1305,col 29)",
        "(line 1307,col 9)-(line 1383,col 9)",
        "(line 1384,col 9)-(line 1393,col 9)",
        "(line 1394,col 9)-(line 1394,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1406,
      "end_line": 1430,
      "comment": "\r\n     * Draws an axis line at the current cursor position and edge.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 1409,col 9)-(line 1409,col 31)",
        "(line 1410,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 40)",
        "(line 1427,col 9)-(line 1427,col 42)",
        "(line 1428,col 9)-(line 1428,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.clone()",
      "begin_line": 1440,
      "end_line": 1446,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 42)",
        "(line 1443,col 9)-(line 1443,col 26)",
        "(line 1444,col 9)-(line 1444,col 53)",
        "(line 1445,col 9)-(line 1445,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.equals(java.lang.Object)",
      "begin_line": 1455,
      "end_line": 1539,
      "comment": "\r\n     * Tests this axis for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1456,col 9)-(line 1458,col 9)",
        "(line 1459,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 31)",
        "(line 1463,col 9)-(line 1465,col 9)",
        "(line 1466,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1477,col 9)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1486,col 9)",
        "(line 1487,col 9)-(line 1489,col 9)",
        "(line 1490,col 9)-(line 1492,col 9)",
        "(line 1493,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1509,col 9)",
        "(line 1510,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1518,col 9)",
        "(line 1519,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1524,col 9)",
        "(line 1525,col 9)-(line 1527,col 9)",
        "(line 1528,col 9)-(line 1530,col 9)",
        "(line 1531,col 9)-(line 1534,col 9)",
        "(line 1535,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1548,
      "end_line": 1556,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1549,col 9)-(line 1549,col 36)",
        "(line 1550,col 9)-(line 1550,col 60)",
        "(line 1551,col 9)-(line 1551,col 64)",
        "(line 1552,col 9)-(line 1552,col 65)",
        "(line 1553,col 9)-(line 1553,col 63)",
        "(line 1554,col 9)-(line 1554,col 65)",
        "(line 1555,col 9)-(line 1555,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1566,
      "end_line": 1576,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 35)",
        "(line 1569,col 9)-(line 1569,col 60)",
        "(line 1570,col 9)-(line 1570,col 64)",
        "(line 1571,col 9)-(line 1571,col 65)",
        "(line 1572,col 9)-(line 1572,col 63)",
        "(line 1573,col 9)-(line 1573,col 65)",
        "(line 1574,col 9)-(line 1574,col 63)",
        "(line 1575,col 9)-(line 1575,col 52)"
      ]
    }
  ]
}