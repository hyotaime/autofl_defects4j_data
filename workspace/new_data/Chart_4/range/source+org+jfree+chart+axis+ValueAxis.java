{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/axis/ValueAxis.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ValueAxis",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.axis.Axis",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 148,
      "end_line": 1751,
      "comment": "\r\n * The base class for axes that display value data, where values are measured\r\n * using the \u003ccode\u003edouble\u003c/code\u003e primitive.  The two key subclasses are\r\n * {@link DateAxis} and {@link NumberAxis}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The default axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The default auto-range value. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERTED"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The default inverted flag setting. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_MINIMUM_SIZE"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The default minimum auto range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOWER_MARGIN"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The default value for the lower margin (0.05 \u003d 5%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UPPER_MARGIN"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The default value for the upper margin (0.05 \u003d 5%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_TICK_UNIT_SELECTION"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The default auto-tick-unit-selection value. "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_TICK_COUNT"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The maximum tick count. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveArrowVisible"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": "\r\n     * A flag that controls whether an arrow is drawn at the positive end of\r\n     * the axis line.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "negativeArrowVisible"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\r\n     * A flag that controls whether an arrow is drawn at the negative end of\r\n     * the axis line.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upArrow"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The shape used for an up arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "downArrow"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The shape used for a down arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "leftArrow"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The shape used for a left arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "rightArrow"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The shape used for a right arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "inverted"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " A flag that affects the orientation of the values on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "autoRange"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\r\n     * Flag that indicates whether the axis automatically scales to fit the\r\n     * chart data.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeMinimumSize"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The minimum size for the \u0027auto\u0027 axis range (excluding margins). "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAutoRange"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * The default range is used when the dataset is empty and the axis needs\r\n     * to determine the auto range.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperMargin"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\r\n     * The upper margin percentage.  This indicates the amount by which the\r\n     * maximum axis value exceeds the maximum data value (as a percentage of\r\n     * the range on the axis) when the axis range is determined automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerMargin"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": "\r\n     * The lower margin.  This is a percentage that indicates the amount by\r\n     * which the minimum axis value is \"less than\" the minimum data value when\r\n     * the axis range is determined automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedAutoRange"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": "\r\n     * If this value is positive, the amount is subtracted from the maximum\r\n     * data value to determine the lower axis range.  This can be used to\r\n     * provide a fixed \"window\" on dynamic data.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoTickUnitSelection"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": "\r\n     * Flag that indicates whether or not the tick unit is selected\r\n     * automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "standardTickUnits"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The standard tick units for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "autoTickIndex"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " An index into an array of standard tick values. "
    },
    {
      "type": "field",
      "varNames": [
        "minorTickCount"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": "\r\n     * The number of minor ticks per major tick unit.  This is an override\r\n     * field, if the value is \u003e 0 it is used, otherwise the axis refers to the\r\n     * minorTickCount in the current tickUnit.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "verticalTickLabels"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": " A flag indicating whether or not tick labels are rotated to vertical. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ValueAxis.ValueAxis(java.lang.String, org.jfree.chart.axis.TickUnitSource)",
      "begin_line": 275,
      "end_line": 328,
      "comment": "\r\n     * Constructs a value axis.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param standardTickUnits  the source for standard tick units\r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 21)",
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 42)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 46)",
        "(line 286,col 9)-(line 286,col 41)",
        "(line 287,col 9)-(line 287,col 68)",
        "(line 289,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 292,col 9)-(line 292,col 34)",
        "(line 294,col 9)-(line 294,col 70)",
        "(line 295,col 9)-(line 295,col 51)",
        "(line 297,col 9)-(line 297,col 35)",
        "(line 298,col 9)-(line 298,col 26)",
        "(line 299,col 9)-(line 299,col 27)",
        "(line 300,col 9)-(line 300,col 26)",
        "(line 302,col 9)-(line 302,col 26)",
        "(line 304,col 9)-(line 304,col 35)",
        "(line 305,col 9)-(line 305,col 26)",
        "(line 306,col 9)-(line 306,col 28)",
        "(line 307,col 9)-(line 307,col 27)",
        "(line 309,col 9)-(line 309,col 28)",
        "(line 311,col 9)-(line 311,col 35)",
        "(line 312,col 9)-(line 312,col 26)",
        "(line 313,col 9)-(line 313,col 28)",
        "(line 314,col 9)-(line 314,col 27)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 318,col 9)-(line 318,col 35)",
        "(line 319,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 320,col 27)",
        "(line 321,col 9)-(line 321,col 26)",
        "(line 323,col 9)-(line 323,col 28)",
        "(line 325,col 9)-(line 325,col 40)",
        "(line 326,col 9)-(line 326,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isVerticalTickLabels()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the tick labels should be rotated (to\r\n     * vertical), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setVerticalTickLabels(boolean)\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setVerticalTickLabels(boolean)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\r\n     * Sets the flag that controls whether the tick labels are displayed\r\n     * vertically (that is, rotated 90 degrees from horizontal).  If the flag\r\n     * is changed, an {@link AxisChangeEvent} is sent to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isVerticalTickLabels()\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isPositiveArrowVisible()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\r\n     * Returns a flag that controls whether or not the axis line has an arrow\r\n     * drawn that points in the positive direction for the axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setPositiveArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setPositiveArrowVisible(boolean)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis lines has an arrow\r\n     * drawn that points in the positive direction for the axis, and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isPositiveArrowVisible()\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 44)",
        "(line 382,col 9)-(line 382,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isNegativeArrowVisible()",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\r\n     * Returns a flag that controls whether or not the axis line has an arrow\r\n     * drawn that points in the negative direction for the axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setNegativeArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setNegativeArrowVisible(boolean)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis lines has an arrow\r\n     * drawn that points in the negative direction for the axis, and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #setNegativeArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 44)",
        "(line 408,col 9)-(line 408,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpArrow()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing upwards at\r\n     * the end of an axis line.\r\n     *\r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setUpArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpArrow(java.awt.Shape)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing upwards at\r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getUpArrow()\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 29)",
        "(line 437,col 9)-(line 437,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getDownArrow()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing downwards at\r\n     * the end of an axis line.\r\n     *\r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDownArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setDownArrow(java.awt.Shape)",
      "begin_line": 461,
      "end_line": 467,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing downwards at\r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDownArrow()\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 31)",
        "(line 466,col 9)-(line 466,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLeftArrow()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing left at the\r\n     * end of an axis line.\r\n     *\r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLeftArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLeftArrow(java.awt.Shape)",
      "begin_line": 490,
      "end_line": 496,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing left at the\r\n     * end of an axis line and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLeftArrow()\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 31)",
        "(line 495,col 9)-(line 495,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getRightArrow()",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing right at the\r\n     * end of an axis line.\r\n     *\r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRightArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRightArrow(java.awt.Shape)",
      "begin_line": 519,
      "end_line": 525,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing rightwards at\r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRightArrow()\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 32)",
        "(line 524,col 9)-(line 524,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 535,
      "end_line": 624,
      "comment": "\r\n     * Draws an axis line at the current cursor position and edge.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 31)",
        "(line 538,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 40)",
        "(line 555,col 9)-(line 555,col 42)",
        "(line 556,col 9)-(line 556,col 26)",
        "(line 558,col 9)-(line 558,col 38)",
        "(line 559,col 9)-(line 559,col 39)",
        "(line 560,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.calculateAnchorPoint(org.jfree.chart.axis.ValueTick, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 636,
      "end_line": 660,
      "comment": "\r\n     * Calculates the anchor point for a tick label.\r\n     *\r\n     * @param tick  the tick.\r\n     * @param cursor  the cursor.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge on which the axis is drawn.\r\n     *\r\n     * @return The x and y coordinates of the anchor point.\r\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 54)",
        "(line 642,col 9)-(line 642,col 38)",
        "(line 643,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.drawTickMarksAndLabels(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 674,
      "end_line": 757,
      "comment": "\r\n     * Draws the axis line, tick marks and tick mark labels.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge that the axis is aligned with.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @return The width or height used to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 48)",
        "(line 680,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 684,col 61)",
        "(line 685,col 9)-(line 685,col 30)",
        "(line 686,col 9)-(line 686,col 39)",
        "(line 687,col 9)-(line 687,col 45)",
        "(line 688,col 9)-(line 728,col 9)",
        "(line 732,col 9)-(line 732,col 26)",
        "(line 733,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 771,
      "end_line": 822,
      "comment": "\r\n     * Returns the space required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  the space already reserved (for other axes).\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved\r\n     *         space).\r\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 778,col 9)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 786,col 9)-(line 786,col 47)",
        "(line 787,col 9)-(line 789,col 9)",
        "(line 792,col 9)-(line 792,col 37)",
        "(line 793,col 9)-(line 793,col 36)",
        "(line 794,col 9)-(line 805,col 9)",
        "(line 808,col 9)-(line 808,col 65)",
        "(line 809,col 9)-(line 809,col 33)",
        "(line 810,col 9)-(line 810,col 32)",
        "(line 811,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 820,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.findMaximumTickLabelHeight(java.util.List, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 835,
      "end_line": 865,
      "comment": "\r\n     * A utility method for determining the height of the tallest tick label.\r\n     *\r\n     * @param ticks  the ticks.\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the plot and axes should be drawn.\r\n     * @param vertical  a flag that indicates whether or not the tick labels\r\n     *                  are \u0027vertical\u0027.\r\n     *\r\n     * @return The height of the tallest tick label.\r\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 54)",
        "(line 841,col 9)-(line 841,col 39)",
        "(line 842,col 9)-(line 842,col 31)",
        "(line 843,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.findMaximumTickLabelWidth(java.util.List, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 878,
      "end_line": 908,
      "comment": "\r\n     * A utility method for determining the width of the widest tick label.\r\n     *\r\n     * @param ticks  the ticks.\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the plot and axes should be drawn.\r\n     * @param vertical  a flag that indicates whether or not the tick labels\r\n     *                  are \u0027vertical\u0027.\r\n     *\r\n     * @return The width of the tallest tick label.\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 54)",
        "(line 884,col 9)-(line 884,col 39)",
        "(line 885,col 9)-(line 885,col 30)",
        "(line 886,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isInverted()",
      "begin_line": 921,
      "end_line": 923,
      "comment": "\r\n     * Returns a flag that controls the direction of values on the axis.\r\n     * \u003cP\u003e\r\n     * For a regular axis, values increase from left to right (for a horizontal\r\n     * axis) and bottom to top (for a vertical axis).  When the axis is\r\n     * \u0027inverted\u0027, the values increase in the opposite direction.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setInverted(boolean)\r\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setInverted(boolean)",
      "begin_line": 933,
      "end_line": 940,
      "comment": "\r\n     * Sets a flag that controls the direction of values on the axis, and\r\n     * notifies registered listeners that the axis has changed.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isInverted()\r\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 938,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isAutoRange()",
      "begin_line": 950,
      "end_line": 952,
      "comment": "\r\n     * Returns the flag that controls whether or not the axis range is\r\n     * automatically adjusted to fit the data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setAutoRange(boolean)\r\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 951,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRange(boolean)",
      "begin_line": 963,
      "end_line": 965,
      "comment": "\r\n     * Sets a flag that determines whether or not the axis range is\r\n     * automatically adjusted to fit the data, and notifies registered\r\n     * listeners that the axis has been modified.\r\n     *\r\n     * @param auto  the new value of the flag.\r\n     *\r\n     * @see #isAutoRange()\r\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRange(boolean, boolean)",
      "begin_line": 976,
      "end_line": 986,
      "comment": "\r\n     * Sets the auto range attribute.  If the \u003ccode\u003enotify\u003c/code\u003e flag is set,\r\n     * an {@link AxisChangeEvent} is sent to registered listeners.\r\n     *\r\n     * @param auto  the flag.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #isAutoRange()\r\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 985,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getAutoRangeMinimumSize()",
      "begin_line": 996,
      "end_line": 998,
      "comment": "\r\n     * Returns the minimum size allowed for the axis range when it is\r\n     * automatically calculated.\r\n     *\r\n     * @return The minimum range.\r\n     *\r\n     * @see #setAutoRangeMinimumSize(double)\r\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRangeMinimumSize(double)",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\r\n     * Sets the auto range minimum size and sends an {@link AxisChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param size  the size.\r\n     *\r\n     * @see #getAutoRangeMinimumSize()\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRangeMinimumSize(double, boolean)",
      "begin_line": 1022,
      "end_line": 1037,
      "comment": "\r\n     * Sets the minimum size allowed for the axis range when it is\r\n     * automatically calculated.\r\n     * \u003cp\u003e\r\n     * If requested, an {@link AxisChangeEvent} is forwarded to all registered\r\n     * listeners.\r\n     *\r\n     * @param size  the new minimum.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1035,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getDefaultAutoRange()",
      "begin_line": 1048,
      "end_line": 1050,
      "comment": "\r\n     * Returns the default auto range.\r\n     *\r\n     * @return The default auto range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDefaultAutoRange(Range)\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setDefaultAutoRange(org.jfree.data.Range)",
      "begin_line": 1062,
      "end_line": 1068,
      "comment": "\r\n     * Sets the default auto range and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDefaultAutoRange()\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 38)",
        "(line 1067,col 9)-(line 1067,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLowerMargin()",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "\r\n     * Returns the lower margin for the axis, expressed as a percentage of the\r\n     * axis range.  This controls the space added to the lower end of the axis\r\n     * when the axis range is automatically calculated (it is ignored when the\r\n     * axis range is set explicitly). The default value is 0.05 (five percent).\r\n     *\r\n     * @return The lower margin.\r\n     *\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLowerMargin(double)",
      "begin_line": 1095,
      "end_line": 1101,
      "comment": "\r\n     * Sets the lower margin for the axis (as a percentage of the axis range)\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.  This\r\n     * margin is added only when the axis range is auto-calculated - if you set\r\n     * the axis range manually, the margin is ignored.\r\n     *\r\n     * @param margin  the margin percentage (for example, 0.05 is five percent).\r\n     *\r\n     * @see #getLowerMargin()\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1096,col 34)",
        "(line 1097,col 9)-(line 1099,col 9)",
        "(line 1100,col 9)-(line 1100,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpperMargin()",
      "begin_line": 1113,
      "end_line": 1115,
      "comment": "\r\n     * Returns the upper margin for the axis, expressed as a percentage of the\r\n     * axis range.  This controls the space added to the lower end of the axis\r\n     * when the axis range is automatically calculated (it is ignored when the\r\n     * axis range is set explicitly). The default value is 0.05 (five percent).\r\n     *\r\n     * @return The upper margin.\r\n     *\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpperMargin(double)",
      "begin_line": 1128,
      "end_line": 1134,
      "comment": "\r\n     * Sets the upper margin for the axis (as a percentage of the axis range)\r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.  This\r\n     * margin is added only when the axis range is auto-calculated - if you set\r\n     * the axis range manually, the margin is ignored.\r\n     *\r\n     * @param margin  the margin percentage (for example, 0.05 is five percent).\r\n     *\r\n     * @see #getLowerMargin()\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 34)",
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getFixedAutoRange()",
      "begin_line": 1143,
      "end_line": 1145,
      "comment": "\r\n     * Returns the fixed auto range.\r\n     *\r\n     * @return The length.\r\n     *\r\n     * @see #setFixedAutoRange(double)\r\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setFixedAutoRange(double)",
      "begin_line": 1154,
      "end_line": 1160,
      "comment": "\r\n     * Sets the fixed auto range for the axis.\r\n     *\r\n     * @param length  the range length.\r\n     *\r\n     * @see #getFixedAutoRange()\r\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1155,col 37)",
        "(line 1156,col 9)-(line 1158,col 9)",
        "(line 1159,col 9)-(line 1159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLowerBound()",
      "begin_line": 1169,
      "end_line": 1171,
      "comment": "\r\n     * Returns the lower bound of the axis range.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #setLowerBound(double)\r\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLowerBound(double)",
      "begin_line": 1181,
      "end_line": 1188,
      "comment": "\r\n     * Sets the lower bound for the axis range.  An {@link AxisChangeEvent} is\r\n     * sent to all registered listeners.\r\n     *\r\n     * @param min  the new minimum.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpperBound()",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "\r\n     * Returns the upper bound for the axis range.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #setUpperBound(double)\r\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpperBound(double)",
      "begin_line": 1209,
      "end_line": 1216,
      "comment": "\r\n     * Sets the upper bound for the axis range, and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param max  the new maximum.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getRange()",
      "begin_line": 1225,
      "end_line": 1227,
      "comment": "\r\n     * Returns the range for the axis.\r\n     *\r\n     * @return The axis range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(org.jfree.data.Range)",
      "begin_line": 1238,
      "end_line": 1241,
      "comment": "\r\n     * Sets the range attribute and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.  As a side-effect, the auto-range flag is set to\r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 1240,col 9)-(line 1240,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 1256,
      "end_line": 1268,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect,\r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto\r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1264,col 27)",
        "(line 1265,col 9)-(line 1267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(double, double)",
      "begin_line": 1281,
      "end_line": 1283,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.  As a side-effect, the auto-range flag is set to\r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param lower  the lower axis limit.\r\n     * @param upper  the upper axis limit.\r\n     *\r\n     * @see #getRange()\r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(org.jfree.data.Range)",
      "begin_line": 1292,
      "end_line": 1294,
      "comment": "\r\n     * Sets the range for the axis (after first adding the current margins to\r\n     * the specified range) and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 1309,
      "end_line": 1316,
      "comment": "\r\n     * Sets the range for the axis after first adding the current margins to\r\n     * the range and, if requested, sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.  As a side-effect, the auto-range flag is set to\r\n     * \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (excluding margins, \u003ccode\u003enull\u003c/code\u003e not\r\n     *               permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto\r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1313,col 9)",
        "(line 1314,col 9)-(line 1315,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(double, double)",
      "begin_line": 1326,
      "end_line": 1328,
      "comment": "\r\n     * Sets the axis range (after first adding the current margins to the\r\n     * range) and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * As a side-effect, the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param lower  the lower axis limit.\r\n     * @param upper  the upper axis limit.\r\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeAboutValue(double, double)",
      "begin_line": 1337,
      "end_line": 1339,
      "comment": "\r\n     * Sets the axis range, where the new range is \u0027size\u0027 in length, and\r\n     * centered on \u0027value\u0027.\r\n     *\r\n     * @param value  the central value.\r\n     * @param length  the range length.\r\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isAutoTickUnitSelection()",
      "begin_line": 1350,
      "end_line": 1352,
      "comment": "\r\n     * Returns a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.\r\n     *\r\n     * @return A flag indicating whether or not the tick unit is automatically\r\n     *         selected.\r\n     *\r\n     * @see #setAutoTickUnitSelection(boolean)\r\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickUnitSelection(boolean)",
      "begin_line": 1363,
      "end_line": 1365,
      "comment": "\r\n     * Sets a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.  If the flag is changed,\r\n     * registered listeners are notified that the chart has changed.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 1364,col 9)-(line 1364,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickUnitSelection(boolean, boolean)",
      "begin_line": 1376,
      "end_line": 1384,
      "comment": "\r\n     * Sets a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getStandardTickUnits()",
      "begin_line": 1393,
      "end_line": 1395,
      "comment": "\r\n     * Returns the source for obtaining standard tick units for the axis.\r\n     *\r\n     * @return The source (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 1394,col 9)-(line 1394,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setStandardTickUnits(org.jfree.chart.axis.TickUnitSource)",
      "begin_line": 1409,
      "end_line": 1412,
      "comment": "\r\n     * Sets the source for obtaining standard tick units for the axis and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.  The axis will\r\n     * try to select the smallest tick unit from the source that does not cause\r\n     * the tick labels to overlap (see also the\r\n     * {@link #setAutoTickUnitSelection(boolean)} method.\r\n     *\r\n     * @param source  the source for standard tick units (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     *\r\n     * @see #getStandardTickUnits()\r\n     ",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 40)",
        "(line 1411,col 9)-(line 1411,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getMinorTickCount()",
      "begin_line": 1423,
      "end_line": 1425,
      "comment": "\r\n     * Returns the number of minor tick marks to display.\r\n     * \r\n     * @return The number of minor tick marks to display.\r\n     * \r\n     * @see #setMinorTickCount(int)\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1424,col 9)-(line 1424,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setMinorTickCount(int)",
      "begin_line": 1437,
      "end_line": 1440,
      "comment": "\r\n     * Sets the number of minor tick marks to display, and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param count  the count.\r\n     * \r\n     * @see #getMinorTickCount()\r\n     *\r\n     * @since 1.0.12\r\n     ",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 36)",
        "(line 1439,col 9)-(line 1439,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1456,
      "end_line": 1457,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the area.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     *\r\n     * @see #java2DToValue(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.lengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1469,
      "end_line": 1474,
      "comment": "\r\n     * Converts a length in data coordinates into the corresponding length in\r\n     * Java2D coordinates.\r\n     *\r\n     * @param length  the length.\r\n     * @param area  the plot area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The length in Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 53)",
        "(line 1472,col 9)-(line 1472,col 53)",
        "(line 1473,col 9)-(line 1473,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1488,
      "end_line": 1490,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The data value.\r\n     *\r\n     * @see #valueToJava2D(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.autoAdjustRange()",
      "begin_line": 1498,
      "end_line": 1498,
      "comment": "\r\n     * Automatically sets the axis range to fit the range of values in the\r\n     * dataset.  Sometimes this can depend on the renderer used as well (for\r\n     * example, the renderer may \"stack\" values, requiring an axis range\r\n     * greater than otherwise necessary).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.centerRange(double)",
      "begin_line": 1506,
      "end_line": 1513,
      "comment": "\r\n     * Centers the axis range about the specified value and sends an\r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the center value.\r\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1508,col 54)",
        "(line 1509,col 9)-(line 1510,col 62)",
        "(line 1511,col 9)-(line 1511,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.resizeRange(double)",
      "begin_line": 1527,
      "end_line": 1529,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the central value and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     *\r\n     * @see #resizeRange(double, double)\r\n     ",
      "child_ranges": [
        "(line 1528,col 9)-(line 1528,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.resizeRange(double, double)",
      "begin_line": 1544,
      "end_line": 1554,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the specified anchor value and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * @param anchorValue  the new central value after the resize.\r\n     *\r\n     * @see #resizeRange(double)\r\n     ",
      "child_ranges": [
        "(line 1545,col 9)-(line 1553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.resizeRange2(double, double)",
      "begin_line": 1571,
      "end_line": 1582,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the specified anchor value and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * @param anchorValue  the new central value after the resize.\r\n     *\r\n     * @see #resizeRange(double)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.zoomRange(double, double)",
      "begin_line": 1590,
      "end_line": 1603,
      "comment": "\r\n     * Zooms in on the current range.\r\n     *\r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     ",
      "child_ranges": [
        "(line 1591,col 9)-(line 1591,col 50)",
        "(line 1592,col 9)-(line 1592,col 47)",
        "(line 1593,col 9)-(line 1593,col 30)",
        "(line 1594,col 9)-(line 1601,col 9)",
        "(line 1602,col 9)-(line 1602,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.pan(double)",
      "begin_line": 1612,
      "end_line": 1619,
      "comment": "\r\n     * Slides the axis range by the specified percentage.\r\n     *\r\n     * @param percent  the percentage.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1613,col 33)",
        "(line 1614,col 9)-(line 1614,col 42)",
        "(line 1615,col 9)-(line 1615,col 38)",
        "(line 1616,col 9)-(line 1616,col 51)",
        "(line 1617,col 9)-(line 1617,col 51)",
        "(line 1618,col 9)-(line 1618,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getAutoTickIndex()",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\r\n     * Returns the auto tick index.\r\n     *\r\n     * @return The auto tick index.\r\n     *\r\n     * @see #setAutoTickIndex(int)\r\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickIndex(int)",
      "begin_line": 1639,
      "end_line": 1641,
      "comment": "\r\n     * Sets the auto tick index.\r\n     *\r\n     * @param index  the new value.\r\n     *\r\n     * @see #getAutoTickIndex()\r\n     ",
      "child_ranges": [
        "(line 1640,col 9)-(line 1640,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.equals(java.lang.Object)",
      "begin_line": 1650,
      "end_line": 1703,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1653,col 9)",
        "(line 1654,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1657,col 41)",
        "(line 1658,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1666,col 9)",
        "(line 1668,col 9)-(line 1670,col 9)",
        "(line 1671,col 9)-(line 1673,col 9)",
        "(line 1674,col 9)-(line 1676,col 9)",
        "(line 1677,col 9)-(line 1679,col 9)",
        "(line 1680,col 9)-(line 1682,col 9)",
        "(line 1683,col 9)-(line 1685,col 9)",
        "(line 1686,col 9)-(line 1688,col 9)",
        "(line 1689,col 9)-(line 1691,col 9)",
        "(line 1692,col 9)-(line 1695,col 9)",
        "(line 1696,col 9)-(line 1698,col 9)",
        "(line 1699,col 9)-(line 1701,col 9)",
        "(line 1702,col 9)-(line 1702,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.clone()",
      "begin_line": 1713,
      "end_line": 1716,
      "comment": "\r\n     * Returns a clone of the object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the axis does\r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1714,col 52)",
        "(line 1715,col 9)-(line 1715,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1725,
      "end_line": 1731,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 36)",
        "(line 1727,col 9)-(line 1727,col 57)",
        "(line 1728,col 9)-(line 1728,col 59)",
        "(line 1729,col 9)-(line 1729,col 59)",
        "(line 1730,col 9)-(line 1730,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1741,
      "end_line": 1749,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1744,col 9)-(line 1744,col 35)",
        "(line 1745,col 9)-(line 1745,col 57)",
        "(line 1746,col 9)-(line 1746,col 59)",
        "(line 1747,col 9)-(line 1747,col 59)",
        "(line 1748,col 9)-(line 1748,col 60)"
      ]
    }
  ]
}