{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/axis/Axis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Axis",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 127,
      "end_line": 1373,
      "comment": "\r\n * The base class for all axes in JFreeChart.  Subclasses are divided into \r\n * those that display values ({@link ValueAxis}) and those that display \r\n * categories ({@link CategoryAxis}).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_VISIBLE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The default axis visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_FONT"
      ],
      "begin_line": 136,
      "end_line": 137,
      "comment": " The default axis label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_PAINT"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The default axis label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LABEL_INSETS"
      ],
      "begin_line": 143,
      "end_line": 144,
      "comment": " The default axis label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_PAINT"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default axis line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AXIS_LINE_STROKE"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The default axis line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABELS_VISIBLE"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The default tick labels visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_FONT"
      ],
      "begin_line": 156,
      "end_line": 157,
      "comment": " The default tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_PAINT"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The default tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_LABEL_INSETS"
      ],
      "begin_line": 163,
      "end_line": 164,
      "comment": " The default tick label insets. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARKS_VISIBLE"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The default tick marks visible. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_STROKE"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The default tick stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_PAINT"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The default tick paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_INSIDE_LENGTH"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The default tick mark inside length. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TICK_MARK_OUTSIDE_LENGTH"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The default tick mark outside length. "
    },
    {
      "type": "field",
      "varNames": [
        "visible"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " A flag indicating whether or not the axis is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The label for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFont"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The font for displaying the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelPaint"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The paint for drawing the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelInsets"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The insets for the axis label. "
    },
    {
      "type": "field",
      "varNames": [
        "labelAngle"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The label angle. "
    },
    {
      "type": "field",
      "varNames": [
        "labelToolTip"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\r\n     * The tool tip text for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "labelURL"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\r\n     * The URL for the label (\u003ccode\u003enull\u003c/code\u003e is permitted).\r\n     * \r\n     * @since 1.2.0.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineVisible"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " A flag that controls whether or not the axis line is visible. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLineStroke"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " The stroke used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLinePaint"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " The paint used for the axis line. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " \r\n     * A flag that indicates whether or not tick labels are visible for the \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " The font used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The color used to display the tick labels. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelInsets"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " The blank space around each tick label. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarksVisible"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " \r\n     * A flag that indicates whether or not tick marks are visible for the \r\n     * axis. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkInsideLength"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " The length of the tick mark inside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkOutsideLength"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " The length of the tick mark outside the data area (zero permitted). "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkStroke"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " The stroke used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "tickMarkPaint"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The paint used to draw tick marks. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDimension"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " The fixed (horizontal or vertical) dimension for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " \r\n     * A reference back to the plot that the axis is assigned to (can be \r\n     * \u003ccode\u003enull\u003c/code\u003e). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "listenerList"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " Storage for registered listeners. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.Axis.Axis(java.lang.String)",
      "begin_line": 272,
      "end_line": 302,
      "comment": "\r\n     * Constructs an axis, using default values where necessary.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 27)",
        "(line 275,col 9)-(line 275,col 44)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 277,col 51)",
        "(line 278,col 9)-(line 278,col 53)",
        "(line 279,col 9)-(line 279,col 30)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 283,col 9)-(line 283,col 36)",
        "(line 284,col 9)-(line 284,col 53)",
        "(line 285,col 9)-(line 285,col 55)",
        "(line 287,col 9)-(line 287,col 61)",
        "(line 288,col 9)-(line 288,col 53)",
        "(line 289,col 9)-(line 289,col 55)",
        "(line 290,col 9)-(line 290,col 57)",
        "(line 292,col 9)-(line 292,col 59)",
        "(line 293,col 9)-(line 293,col 55)",
        "(line 294,col 9)-(line 294,col 53)",
        "(line 295,col 9)-(line 295,col 68)",
        "(line 296,col 9)-(line 296,col 70)",
        "(line 298,col 9)-(line 298,col 25)",
        "(line 300,col 9)-(line 300,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isVisible()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the axis is visible, and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setVisible(boolean)",
      "begin_line": 324,
      "end_line": 329,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis is visible and sends \r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isVisible()\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabel()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Returns the label for the axis.\r\n     *\r\n     * @return The label for the axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #getLabelFont()\r\n     * @see #getLabelPaint()\r\n     * @see #setLabel(String)\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabel(java.lang.String)",
      "begin_line": 354,
      "end_line": 370,
      "comment": "\r\n     * Sets the label for the axis and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param label  the new label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabel()\r\n     * @see #setLabelFont(Font)\r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 37)",
        "(line 357,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelFont()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Returns the font for the axis label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelFont(java.awt.Font)",
      "begin_line": 391,
      "end_line": 399,
      "comment": "\r\n     * Sets the font for the axis label and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelFont()\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelPaint()",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns the color/shade used to draw the axis label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelPaint(java.awt.Paint)",
      "begin_line": 420,
      "end_line": 426,
      "comment": "\r\n     * Sets the paint used to draw the axis label and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 32)",
        "(line 425,col 9)-(line 425,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelInsets()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\r\n     * Returns the insets for the label (that is, the amount of blank space\r\n     * that should be left around the label).\r\n     *\r\n     * @return The label insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 448,
      "end_line": 456,
      "comment": "\r\n     * Sets the insets for the axis label, and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLabelInsets()\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelAngle()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\r\n     * Returns the angle of the axis label.\r\n     *\r\n     * @return The angle (in radians).\r\n     * \r\n     * @see #setLabelAngle(double)\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelAngle(double)",
      "begin_line": 477,
      "end_line": 480,
      "comment": "\r\n     * Sets the angle for the label and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     * \r\n     * @see #getLabelAngle()\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 32)",
        "(line 479,col 9)-(line 479,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelToolTip()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\r\n     * Returns the tool tip text for the axis label.\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelToolTip(String)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelToolTip(java.lang.String)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\r\n     * Sets the tool tip text for the axis label and sends a .\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param text  the tool tip text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelToolTip()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 33)",
        "(line 507,col 9)-(line 507,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelURL()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\r\n     * Returns the URL text for the axis label.\r\n     * \r\n     * @return The URL (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLabelURL(String)\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setLabelURL(java.lang.String)",
      "begin_line": 533,
      "end_line": 536,
      "comment": "\r\n     * Sets the URL for the axis label and sends an {@link AxisChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @param url  the URL (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getLabelURL()\r\n     * \r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 28)",
        "(line 535,col 9)-(line 535,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isAxisLineVisible()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\r\n     * A flag that controls whether or not the axis line is drawn.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #getAxisLinePaint()\r\n     * @see #getAxisLineStroke()\r\n     * @see #setAxisLineVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineVisible(boolean)",
      "begin_line": 561,
      "end_line": 564,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis line is visible and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isAxisLineVisible()\r\n     * @see #setAxisLinePaint(Paint)\r\n     * @see #setAxisLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 39)",
        "(line 563,col 9)-(line 563,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLinePaint()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\r\n     * Returns the paint used to draw the axis line.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLinePaint(java.awt.Paint)",
      "begin_line": 585,
      "end_line": 591,
      "comment": "\r\n     * Sets the paint used to draw the axis line and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLinePaint()\r\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 35)",
        "(line 590,col 9)-(line 590,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getAxisLineStroke()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\r\n     * Returns the stroke used to draw the axis line.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisLineStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setAxisLineStroke(java.awt.Stroke)",
      "begin_line": 612,
      "end_line": 618,
      "comment": "\r\n     * Sets the stroke used to draw the axis line and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisLineStroke()\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 37)",
        "(line 617,col 9)-(line 617,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickLabelsVisible()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\r\n     * Returns a flag indicating whether or not the tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #getTickLabelFont()\r\n     * @see #getTickLabelPaint()\r\n     * @see #setTickLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelsVisible(boolean)",
      "begin_line": 644,
      "end_line": 651,
      "comment": "\r\n     * Sets the flag that determines whether or not the tick labels are \r\n     * visible and sends an {@link AxisChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isTickLabelsVisible()\r\n     * @see #setTickLabelFont(Font)\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelFont()",
      "begin_line": 660,
      "end_line": 662,
      "comment": "\r\n     * Returns the font used for the tick labels (if showing).\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelFont(java.awt.Font)",
      "begin_line": 672,
      "end_line": 683,
      "comment": "\r\n     * Sets the font for the tick labels and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     * \r\n     * @see #getTickLabelFont()\r\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelPaint()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "\r\n     * Returns the color/shade used for the tick labels.\r\n     *\r\n     * @return The paint used for the tick labels.\r\n     * \r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 704,
      "end_line": 710,
      "comment": "\r\n     * Sets the paint used to draw tick labels (if they are showing) and \r\n     * sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 36)",
        "(line 709,col 9)-(line 709,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickLabelInsets()",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\r\n     * Returns the insets for the tick labels.\r\n     *\r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelInsets(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickLabelInsets(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 731,
      "end_line": 739,
      "comment": "\r\n     * Sets the insets for the tick labels and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelInsets()\r\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 738,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.isTickMarksVisible()",
      "begin_line": 750,
      "end_line": 752,
      "comment": "\r\n     * Returns the flag that indicates whether or not the tick marks are\r\n     * showing.\r\n     *\r\n     * @return The flag that indicates whether or not the tick marks are \r\n     *         showing.\r\n     *         \r\n     * @see #setTickMarksVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarksVisible(boolean)",
      "begin_line": 762,
      "end_line": 767,
      "comment": "\r\n     * Sets the flag that indicates whether or not the tick marks are showing\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isTickMarksVisible()\r\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkInsideLength()",
      "begin_line": 777,
      "end_line": 779,
      "comment": "\r\n     * Returns the inside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     * \r\n     * @see #getTickMarkOutsideLength()\r\n     * @see #setTickMarkInsideLength(float)\r\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkInsideLength(float)",
      "begin_line": 789,
      "end_line": 792,
      "comment": "\r\n     * Sets the inside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 43)",
        "(line 791,col 9)-(line 791,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkOutsideLength()",
      "begin_line": 802,
      "end_line": 804,
      "comment": "\r\n     * Returns the outside length of the tick marks.\r\n     *\r\n     * @return The length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     * @see #setTickMarkOutsideLength(float)\r\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkOutsideLength(float)",
      "begin_line": 814,
      "end_line": 817,
      "comment": "\r\n     * Sets the outside length of the tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the new length.\r\n     * \r\n     * @see #getTickMarkInsideLength()\r\n     ",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 44)",
        "(line 816,col 9)-(line 816,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkStroke()",
      "begin_line": 826,
      "end_line": 828,
      "comment": "\r\n     * Returns the stroke used to draw tick marks.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickMarkStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkStroke(java.awt.Stroke)",
      "begin_line": 838,
      "end_line": 846,
      "comment": "\r\n     * Sets the stroke used to draw tick marks and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickMarkStroke()\r\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 845,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getTickMarkPaint()",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\r\n     * Returns the paint used to draw tick marks (if they are showing).\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickMarkPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setTickMarkPaint(java.awt.Paint)",
      "begin_line": 867,
      "end_line": 873,
      "comment": "\r\n     * Sets the paint used to draw tick marks and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickMarkPaint()\r\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 35)",
        "(line 872,col 9)-(line 872,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getPlot()",
      "begin_line": 884,
      "end_line": 886,
      "comment": "\r\n     * Returns the plot that the axis is assigned to.  This method will return \r\n     * \u003ccode\u003enull\u003c/code\u003e if the axis is not currently assigned to a plot.\r\n     *\r\n     * @return The plot that the axis is assigned to (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setPlot(Plot)\r\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setPlot(org.jfree.chart.plot.Plot)",
      "begin_line": 897,
      "end_line": 900,
      "comment": "\r\n     * Sets a reference to the plot that the axis is assigned to.\r\n     * \u003cP\u003e\r\n     * This method is used internally, you shouldn\u0027t need to call it yourself.\r\n     *\r\n     * @param plot  the plot.\r\n     * \r\n     * @see #getPlot()\r\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 25)",
        "(line 899,col 9)-(line 899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getFixedDimension()",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\r\n     * Returns the fixed dimension for the axis.\r\n     *\r\n     * @return The fixed dimension.\r\n     * \r\n     * @see #setFixedDimension(double)\r\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.setFixedDimension(double)",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\r\n     * Sets the fixed dimension for the axis.\r\n     * \u003cP\u003e\r\n     * This is used when combining more than one plot on a chart.  In this case,\r\n     * there may be several axes that need to have the same height or width so\r\n     * that they are aligned.  This method is used to fix a dimension for the\r\n     * axis (the context determines whether the dimension is horizontal or\r\n     * vertical).\r\n     *\r\n     * @param dimension  the fixed dimension.\r\n     * \r\n     * @see #getFixedDimension()\r\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.configure()",
      "begin_line": 934,
      "end_line": 934,
      "comment": "\r\n     * Configures the axis to work with the current plot.  Override this method\r\n     * to perform any special processing (such as auto-rescaling).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 949,
      "end_line": 952,
      "comment": "\r\n     * Estimates the space (height or width) required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot (including axes) should \r\n     *                  be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  space already reserved.\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved \r\n     *         space).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.draw(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 968,
      "end_line": 973,
      "comment": "\r\n     * Draws the axis on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param cursor  the cursor location (determines where to draw the axis).\r\n     * @param plotArea  the area within which the axes and plot should be drawn.\r\n     * @param dataArea  the area within which the data should be drawn.\r\n     * @param edge  the axis location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot \r\n     *                   (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The axis state (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.refreshTicks(java.awt.Graphics2D, org.jfree.chart.axis.AxisState, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 986,
      "end_line": 989,
      "comment": "\r\n     * Calculates the positions of the ticks for the axis, storing the results\r\n     * in the tick list (ready for drawing).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the axis state.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the edge on which the axis is located.\r\n     * \r\n     * @return The list of ticks.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.addChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\r\n     * Registers an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object that is being registered.\r\n     * \r\n     * @see #removeChangeListener(AxisChangeListener)\r\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.removeChangeListener(org.jfree.chart.event.AxisChangeListener)",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\r\n     * Deregisters an object for notification of changes to the axis.\r\n     *\r\n     * @param listener  the object to deregister.\r\n     * \r\n     * @see #addChangeListener(AxisChangeListener)\r\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.hasListener(java.util.EventListener)",
      "begin_line": 1022,
      "end_line": 1025,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified object is registered with\r\n     * the dataset as a listener.  Most applications won\u0027t need to call this \r\n     * method, it exists mainly for use by unit testing code.\r\n     * \r\n     * @param listener  the listener.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 71)",
        "(line 1024,col 9)-(line 1024,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.notifyListeners(org.jfree.chart.event.AxisChangeEvent)",
      "begin_line": 1033,
      "end_line": 1042,
      "comment": "\r\n     * Notifies all registered listeners that the axis has changed.\r\n     * The AxisChangeEvent provides information about the change.\r\n     *\r\n     * @param event  information about the change to the axis.\r\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 65)",
        "(line 1036,col 9)-(line 1040,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.getLabelEnclosure(java.awt.Graphics2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1053,
      "end_line": 1076,
      "comment": "\r\n     * Returns a rectangle that encloses the axis label.  This is typically \r\n     * used for layout purposes (it gives the maximum dimensions of the label).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param edge  the edge of the plot area along which the axis is measuring.\r\n     *\r\n     * @return The enclosing rectangle.\r\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 54)",
        "(line 1056,col 9)-(line 1056,col 38)",
        "(line 1057,col 9)-(line 1072,col 9)",
        "(line 1074,col 9)-(line 1074,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawLabel(java.lang.String, java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1091,
      "end_line": 1201,
      "comment": "\r\n     * Draws the axis label.\r\n     *\r\n     * @param label  the label text.\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param edge  the location of the axis.\r\n     * @param state  the axis state (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  the plot state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Information about the axis.\r\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1100,col 9)-(line 1102,col 9)",
        "(line 1104,col 9)-(line 1104,col 35)",
        "(line 1105,col 9)-(line 1105,col 50)",
        "(line 1106,col 9)-(line 1106,col 25)",
        "(line 1107,col 9)-(line 1107,col 37)",
        "(line 1108,col 9)-(line 1108,col 45)",
        "(line 1109,col 9)-(line 1109,col 77)",
        "(line 1110,col 9)-(line 1110,col 29)",
        "(line 1112,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1198,col 9)",
        "(line 1199,col 9)-(line 1199,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1211,
      "end_line": 1235,
      "comment": "\r\n     * Draws an axis line at the current cursor position and edge.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 31)",
        "(line 1215,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1231,col 40)",
        "(line 1232,col 9)-(line 1232,col 42)",
        "(line 1233,col 9)-(line 1233,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.clone()",
      "begin_line": 1245,
      "end_line": 1251,
      "comment": "\r\n     * Returns a clone of the axis.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 42)",
        "(line 1248,col 9)-(line 1248,col 26)",
        "(line 1249,col 9)-(line 1249,col 53)",
        "(line 1250,col 9)-(line 1250,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.equals(java.lang.Object)",
      "begin_line": 1260,
      "end_line": 1334,
      "comment": "\r\n     * Tests this axis for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 31)",
        "(line 1268,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1273,col 9)",
        "(line 1274,col 9)-(line 1276,col 9)",
        "(line 1277,col 9)-(line 1279,col 9)",
        "(line 1280,col 9)-(line 1282,col 9)",
        "(line 1283,col 9)-(line 1285,col 9)",
        "(line 1286,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1303,col 9)",
        "(line 1304,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1310,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1326,col 9)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1333,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1343,
      "end_line": 1351,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1344,col 9)-(line 1344,col 36)",
        "(line 1345,col 9)-(line 1345,col 60)",
        "(line 1346,col 9)-(line 1346,col 64)",
        "(line 1347,col 9)-(line 1347,col 65)",
        "(line 1348,col 9)-(line 1348,col 63)",
        "(line 1349,col 9)-(line 1349,col 65)",
        "(line 1350,col 9)-(line 1350,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.Axis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1361,
      "end_line": 1371,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1363,col 9)-(line 1363,col 35)",
        "(line 1364,col 9)-(line 1364,col 60)",
        "(line 1365,col 9)-(line 1365,col 64)",
        "(line 1366,col 9)-(line 1366,col 65)",
        "(line 1367,col 9)-(line 1367,col 63)",
        "(line 1368,col 9)-(line 1368,col 65)",
        "(line 1369,col 9)-(line 1369,col 63)",
        "(line 1370,col 9)-(line 1370,col 52)"
      ]
    }
  ]
}