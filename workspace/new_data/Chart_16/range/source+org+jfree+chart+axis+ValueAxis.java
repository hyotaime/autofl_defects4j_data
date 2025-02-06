{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/axis/ValueAxis.java",
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
      "begin_line": 139,
      "end_line": 1659,
      "comment": "\r\n * The base class for axes that display value data, where values are measured \r\n * using the \u003ccode\u003edouble\u003c/code\u003e primitive.  The two key subclasses are \r\n * {@link DateAxis} and {@link NumberAxis}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The default auto-range value. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INVERTED"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The default inverted flag setting. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_RANGE_MINIMUM_SIZE"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The default minimum auto range. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOWER_MARGIN"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The default value for the lower margin (0.05 \u003d 5%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UPPER_MARGIN"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The default value for the upper margin (0.05 \u003d 5%). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_AUTO_TICK_UNIT_SELECTION"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The default auto-tick-unit-selection value. "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMUM_TICK_COUNT"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The maximum tick count. "
    },
    {
      "type": "field",
      "varNames": [
        "positiveArrowVisible"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " \r\n     * A flag that controls whether an arrow is drawn at the positive end of \r\n     * the axis line. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "negativeArrowVisible"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " \r\n     * A flag that controls whether an arrow is drawn at the negative end of \r\n     * the axis line. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upArrow"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The shape used for an up arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "downArrow"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The shape used for a down arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "leftArrow"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The shape used for a left arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "rightArrow"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The shape used for a right arrow. "
    },
    {
      "type": "field",
      "varNames": [
        "inverted"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " A flag that affects the orientation of the values on the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The axis range. "
    },
    {
      "type": "field",
      "varNames": [
        "autoRange"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " \r\n     * Flag that indicates whether the axis automatically scales to fit the \r\n     * chart data. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoRangeMinimumSize"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " The minimum size for the \u0027auto\u0027 axis range (excluding margins). "
    },
    {
      "type": "field",
      "varNames": [
        "defaultAutoRange"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": "\r\n     * The default range is used when the dataset is empty and the axis needs\r\n     * to determine the auto range.\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperMargin"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\r\n     * The upper margin percentage.  This indicates the amount by which the \r\n     * maximum axis value exceeds the maximum data value (as a percentage of \r\n     * the range on the axis) when the axis range is determined automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerMargin"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\r\n     * The lower margin.  This is a percentage that indicates the amount by\r\n     * which the minimum axis value is \"less than\" the minimum data value when\r\n     * the axis range is determined automatically.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedAutoRange"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": "\r\n     * If this value is positive, the amount is subtracted from the maximum\r\n     * data value to determine the lower axis range.  This can be used to\r\n     * provide a fixed \"window\" on dynamic data.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoTickUnitSelection"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " \r\n     * Flag that indicates whether or not the tick unit is selected \r\n     * automatically. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "standardTickUnits"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " The standard tick units for the axis. "
    },
    {
      "type": "field",
      "varNames": [
        "autoTickIndex"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " An index into an array of standard tick values. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalTickLabels"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " A flag indicating whether or not tick labels are rotated to vertical. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.ValueAxis.ValueAxis(java.lang.String, org.jfree.chart.axis.TickUnitSource)",
      "begin_line": 260,
      "end_line": 312,
      "comment": "\r\n     * Constructs a value axis.\r\n     *\r\n     * @param label  the axis label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param standardTickUnits  the source for standard tick units \r\n     *                           (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 21)",
        "(line 264,col 9)-(line 264,col 42)",
        "(line 265,col 9)-(line 265,col 42)",
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 268,col 44)",
        "(line 269,col 9)-(line 269,col 46)",
        "(line 271,col 9)-(line 271,col 41)",
        "(line 272,col 9)-(line 272,col 68)",
        "(line 274,col 9)-(line 274,col 48)",
        "(line 275,col 9)-(line 275,col 48)",
        "(line 277,col 9)-(line 277,col 34)",
        "(line 279,col 9)-(line 279,col 70)",
        "(line 280,col 9)-(line 280,col 51)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 26)",
        "(line 284,col 9)-(line 284,col 27)",
        "(line 285,col 9)-(line 285,col 26)",
        "(line 287,col 9)-(line 287,col 26)",
        "(line 289,col 9)-(line 289,col 35)",
        "(line 290,col 9)-(line 290,col 26)",
        "(line 291,col 9)-(line 291,col 28)",
        "(line 292,col 9)-(line 292,col 27)",
        "(line 294,col 9)-(line 294,col 28)",
        "(line 296,col 9)-(line 296,col 35)",
        "(line 297,col 9)-(line 297,col 26)",
        "(line 298,col 9)-(line 298,col 28)",
        "(line 299,col 9)-(line 299,col 27)",
        "(line 301,col 9)-(line 301,col 29)",
        "(line 303,col 9)-(line 303,col 35)",
        "(line 304,col 9)-(line 304,col 26)",
        "(line 305,col 9)-(line 305,col 27)",
        "(line 306,col 9)-(line 306,col 26)",
        "(line 308,col 9)-(line 308,col 28)",
        "(line 310,col 9)-(line 310,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isVerticalTickLabels()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the tick labels should be rotated (to \r\n     * vertical), and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setVerticalTickLabels(boolean)\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setVerticalTickLabels(boolean)",
      "begin_line": 336,
      "end_line": 341,
      "comment": "\r\n     * Sets the flag that controls whether the tick labels are displayed \r\n     * vertically (that is, rotated 90 degrees from horizontal).  If the flag \r\n     * is changed, an {@link AxisChangeEvent} is sent to all registered \r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isVerticalTickLabels()\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isPositiveArrowVisible()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns a flag that controls whether or not the axis line has an arrow \r\n     * drawn that points in the positive direction for the axis.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setPositiveArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setPositiveArrowVisible(boolean)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis lines has an arrow \r\n     * drawn that points in the positive direction for the axis, and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isPositiveArrowVisible()\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isNegativeArrowVisible()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns a flag that controls whether or not the axis line has an arrow \r\n     * drawn that points in the negative direction for the axis.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setNegativeArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setNegativeArrowVisible(boolean)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\r\n     * Sets a flag that controls whether or not the axis lines has an arrow \r\n     * drawn that points in the negative direction for the axis, and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     * \r\n     * @param visible  the flag.\r\n     * \r\n     * @see #setNegativeArrowVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 44)",
        "(line 392,col 9)-(line 392,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpArrow()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing upwards at \r\n     * the end of an axis line.\r\n     * \r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setUpArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpArrow(java.awt.Shape)",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing upwards at \r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getUpArrow()\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 29)",
        "(line 421,col 9)-(line 421,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getDownArrow()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing downwards at \r\n     * the end of an axis line.\r\n     * \r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDownArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setDownArrow(java.awt.Shape)",
      "begin_line": 445,
      "end_line": 451,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing downwards at \r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDownArrow()\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 31)",
        "(line 450,col 9)-(line 450,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLeftArrow()",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing left at the \r\n     * end of an axis line.\r\n     * \r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setLeftArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLeftArrow(java.awt.Shape)",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing left at the \r\n     * end of an axis line and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getLeftArrow()\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 31)",
        "(line 479,col 9)-(line 479,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getRightArrow()",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\r\n     * Returns a shape that can be displayed as an arrow pointing right at the \r\n     * end of an axis line.\r\n     * \r\n     * @return A shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRightArrow(Shape)\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRightArrow(java.awt.Shape)",
      "begin_line": 503,
      "end_line": 509,
      "comment": "\r\n     * Sets the shape that can be displayed as an arrow pointing rightwards at \r\n     * the end of an axis line and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param arrow  the arrow shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRightArrow()\r\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 32)",
        "(line 508,col 9)-(line 508,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.drawAxisLine(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 519,
      "end_line": 608,
      "comment": "\r\n     * Draws an axis line at the current cursor position and edge.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor position.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge.\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 31)",
        "(line 522,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 538,col 40)",
        "(line 539,col 9)-(line 539,col 42)",
        "(line 540,col 9)-(line 540,col 26)",
        "(line 542,col 9)-(line 542,col 38)",
        "(line 543,col 9)-(line 543,col 39)",
        "(line 544,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 606,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.calculateAnchorPoint(org.jfree.chart.axis.ValueTick, double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 620,
      "end_line": 644,
      "comment": "\r\n     * Calculates the anchor point for a tick label.\r\n     * \r\n     * @param tick  the tick.\r\n     * @param cursor  the cursor.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge on which the axis is drawn.\r\n     * \r\n     * @return The x and y coordinates of the anchor point.\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 54)",
        "(line 626,col 9)-(line 626,col 38)",
        "(line 627,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.drawTickMarksAndLabels(java.awt.Graphics2D, double, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 658,
      "end_line": 735,
      "comment": "\r\n     * Draws the axis line, tick marks and tick mark labels.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param cursor  the cursor.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param edge  the edge that the axis is aligned with.\r\n     * @param info  the plot rendering info.\r\n     * \r\n     * @return The width or height used to draw the axis.\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 48)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 47)",
        "(line 669,col 9)-(line 669,col 46)",
        "(line 671,col 9)-(line 671,col 61)",
        "(line 672,col 9)-(line 672,col 30)",
        "(line 673,col 9)-(line 673,col 39)",
        "(line 674,col 9)-(line 674,col 45)",
        "(line 675,col 9)-(line 706,col 9)",
        "(line 710,col 9)-(line 710,col 26)",
        "(line 711,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.reserveSpace(java.awt.Graphics2D, org.jfree.chart.plot.Plot, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 749,
      "end_line": 800,
      "comment": "\r\n     * Returns the space required to draw the axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot that the axis belongs to.\r\n     * @param plotArea  the area within which the plot should be drawn.\r\n     * @param edge  the axis location.\r\n     * @param space  the space already reserved (for other axes).\r\n     *\r\n     * @return The space required to draw the axis (including pre-reserved \r\n     *         space).\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 756,col 9)",
        "(line 759,col 9)-(line 761,col 9)",
        "(line 764,col 9)-(line 764,col 47)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 770,col 9)-(line 770,col 37)",
        "(line 771,col 9)-(line 771,col 36)",
        "(line 772,col 9)-(line 783,col 9)",
        "(line 786,col 9)-(line 786,col 65)",
        "(line 787,col 9)-(line 787,col 33)",
        "(line 788,col 9)-(line 788,col 32)",
        "(line 789,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.findMaximumTickLabelHeight(java.util.List, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 813,
      "end_line": 843,
      "comment": "\r\n     * A utility method for determining the height of the tallest tick label.\r\n     *\r\n     * @param ticks  the ticks.\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the plot and axes should be drawn.\r\n     * @param vertical  a flag that indicates whether or not the tick labels \r\n     *                  are \u0027vertical\u0027.\r\n     *\r\n     * @return The height of the tallest tick label.\r\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 54)",
        "(line 819,col 9)-(line 819,col 39)",
        "(line 820,col 9)-(line 820,col 31)",
        "(line 821,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.findMaximumTickLabelWidth(java.util.List, java.awt.Graphics2D, java.awt.geom.Rectangle2D, boolean)",
      "begin_line": 856,
      "end_line": 886,
      "comment": "\r\n     * A utility method for determining the width of the widest tick label.\r\n     *\r\n     * @param ticks  the ticks.\r\n     * @param g2  the graphics device.\r\n     * @param drawArea  the area within which the plot and axes should be drawn.\r\n     * @param vertical  a flag that indicates whether or not the tick labels \r\n     *                  are \u0027vertical\u0027.\r\n     *\r\n     * @return The width of the tallest tick label.\r\n     ",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 54)",
        "(line 862,col 9)-(line 862,col 39)",
        "(line 863,col 9)-(line 863,col 30)",
        "(line 864,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isInverted()",
      "begin_line": 899,
      "end_line": 901,
      "comment": "\r\n     * Returns a flag that controls the direction of values on the axis.\r\n     * \u003cP\u003e\r\n     * For a regular axis, values increase from left to right (for a horizontal\r\n     * axis) and bottom to top (for a vertical axis).  When the axis is\r\n     * \u0027inverted\u0027, the values increase in the opposite direction.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setInverted(boolean)\r\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setInverted(boolean)",
      "begin_line": 911,
      "end_line": 918,
      "comment": "\r\n     * Sets a flag that controls the direction of values on the axis, and\r\n     * notifies registered listeners that the axis has changed.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isInverted()\r\n     ",
      "child_ranges": [
        "(line 913,col 9)-(line 916,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isAutoRange()",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\r\n     * Returns the flag that controls whether or not the axis range is \r\n     * automatically adjusted to fit the data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setAutoRange(boolean)\r\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRange(boolean)",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\r\n     * Sets a flag that determines whether or not the axis range is\r\n     * automatically adjusted to fit the data, and notifies registered\r\n     * listeners that the axis has been modified.\r\n     *\r\n     * @param auto  the new value of the flag.\r\n     * \r\n     * @see #isAutoRange()\r\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRange(boolean, boolean)",
      "begin_line": 954,
      "end_line": 964,
      "comment": "\r\n     * Sets the auto range attribute.  If the \u003ccode\u003enotify\u003c/code\u003e flag is set, \r\n     * an {@link AxisChangeEvent} is sent to registered listeners.\r\n     *\r\n     * @param auto  the flag.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #isAutoRange()\r\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 963,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getAutoRangeMinimumSize()",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\r\n     * Returns the minimum size allowed for the axis range when it is \r\n     * automatically calculated.\r\n     *\r\n     * @return The minimum range.\r\n     * \r\n     * @see #setAutoRangeMinimumSize(double)\r\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRangeMinimumSize(double)",
      "begin_line": 986,
      "end_line": 988,
      "comment": "\r\n     * Sets the auto range minimum size and sends an {@link AxisChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param size  the size.\r\n     * \r\n     * @see #getAutoRangeMinimumSize()\r\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoRangeMinimumSize(double, boolean)",
      "begin_line": 1000,
      "end_line": 1015,
      "comment": "\r\n     * Sets the minimum size allowed for the axis range when it is \r\n     * automatically calculated.\r\n     * \u003cp\u003e\r\n     * If requested, an {@link AxisChangeEvent} is forwarded to all registered \r\n     * listeners.\r\n     *\r\n     * @param size  the new minimum.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1013,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getDefaultAutoRange()",
      "begin_line": 1026,
      "end_line": 1028,
      "comment": "\r\n     * Returns the default auto range.\r\n     * \r\n     * @return The default auto range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDefaultAutoRange(Range)\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1027,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setDefaultAutoRange(org.jfree.data.Range)",
      "begin_line": 1040,
      "end_line": 1046,
      "comment": "\r\n     * Sets the default auto range and sends an {@link AxisChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDefaultAutoRange()\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1044,col 9)-(line 1044,col 38)",
        "(line 1045,col 9)-(line 1045,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLowerMargin()",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\r\n     * Returns the lower margin for the axis, expressed as a percentage of the \r\n     * axis range.  This controls the space added to the lower end of the axis \r\n     * when the axis range is automatically calculated (it is ignored when the \r\n     * axis range is set explicitly). The default value is 0.05 (five percent).\r\n     *\r\n     * @return The lower margin.\r\n     *\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLowerMargin(double)",
      "begin_line": 1073,
      "end_line": 1079,
      "comment": "\r\n     * Sets the lower margin for the axis (as a percentage of the axis range) \r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.  This\r\n     * margin is added only when the axis range is auto-calculated - if you set \r\n     * the axis range manually, the margin is ignored.\r\n     *\r\n     * @param margin  the margin percentage (for example, 0.05 is five percent).\r\n     *\r\n     * @see #getLowerMargin()\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 34)",
        "(line 1075,col 9)-(line 1077,col 9)",
        "(line 1078,col 9)-(line 1078,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpperMargin()",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "\r\n     * Returns the upper margin for the axis, expressed as a percentage of the \r\n     * axis range.  This controls the space added to the lower end of the axis \r\n     * when the axis range is automatically calculated (it is ignored when the \r\n     * axis range is set explicitly). The default value is 0.05 (five percent).\r\n     *\r\n     * @return The upper margin.\r\n     *\r\n     * @see #setUpperMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1092,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpperMargin(double)",
      "begin_line": 1106,
      "end_line": 1112,
      "comment": "\r\n     * Sets the upper margin for the axis (as a percentage of the axis range) \r\n     * and sends an {@link AxisChangeEvent} to all registered listeners.  This \r\n     * margin is added only when the axis range is auto-calculated - if you set\r\n     * the axis range manually, the margin is ignored.\r\n     *\r\n     * @param margin  the margin percentage (for example, 0.05 is five percent).\r\n     *\r\n     * @see #getLowerMargin()\r\n     * @see #setLowerMargin(double)\r\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 34)",
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getFixedAutoRange()",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "\r\n     * Returns the fixed auto range.\r\n     *\r\n     * @return The length.\r\n     * \r\n     * @see #setFixedAutoRange(double)\r\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setFixedAutoRange(double)",
      "begin_line": 1132,
      "end_line": 1138,
      "comment": "\r\n     * Sets the fixed auto range for the axis.\r\n     *\r\n     * @param length  the range length.\r\n     * \r\n     * @see #getFixedAutoRange()\r\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 37)",
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getLowerBound()",
      "begin_line": 1147,
      "end_line": 1149,
      "comment": "\r\n     * Returns the lower bound of the axis range.\r\n     *\r\n     * @return The lower bound.\r\n     * \r\n     * @see #setLowerBound(double)\r\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1148,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setLowerBound(double)",
      "begin_line": 1159,
      "end_line": 1166,
      "comment": "\r\n     * Sets the lower bound for the axis range.  An {@link AxisChangeEvent} is \r\n     * sent to all registered listeners.\r\n     *\r\n     * @param min  the new minimum.\r\n     * \r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getUpperBound()",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "\r\n     * Returns the upper bound for the axis range.\r\n     *\r\n     * @return The upper bound.\r\n     * \r\n     * @see #setUpperBound(double)\r\n     ",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setUpperBound(double)",
      "begin_line": 1187,
      "end_line": 1194,
      "comment": "\r\n     * Sets the upper bound for the axis range, and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param max  the new maximum.\r\n     * \r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getRange()",
      "begin_line": 1203,
      "end_line": 1205,
      "comment": "\r\n     * Returns the range for the axis.\r\n     *\r\n     * @return The axis range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(org.jfree.data.Range)",
      "begin_line": 1216,
      "end_line": 1219,
      "comment": "\r\n     * Sets the range attribute and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.  As a side-effect, the auto-range flag is set to \r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 1234,
      "end_line": 1246,
      "comment": "\r\n     * Sets the range for the axis, if requested, sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.  As a side-effect, \r\n     * the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto \r\n     *                          range is turned off.         \r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     *                \r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1238,col 9)",
        "(line 1239,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1242,col 27)",
        "(line 1243,col 9)-(line 1245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRange(double, double)",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\r\n     * Sets the axis range and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.  As a side-effect, the auto-range flag is set to \r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param lower  the lower axis limit.\r\n     * @param upper  the upper axis limit.\r\n     * \r\n     * @see #getRange()\r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(org.jfree.data.Range)",
      "begin_line": 1270,
      "end_line": 1272,
      "comment": "\r\n     * Sets the range for the axis (after first adding the current margins to \r\n     * the specified range) and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 1271,col 9)-(line 1271,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(org.jfree.data.Range, boolean, boolean)",
      "begin_line": 1287,
      "end_line": 1294,
      "comment": "\r\n     * Sets the range for the axis after first adding the current margins to \r\n     * the range and, if requested, sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.  As a side-effect, the auto-range flag is set to \r\n     * \u003ccode\u003efalse\u003c/code\u003e (optional).\r\n     *\r\n     * @param range  the range (excluding margins, \u003ccode\u003enull\u003c/code\u003e not \r\n     *               permitted).\r\n     * @param turnOffAutoRange  a flag that controls whether or not the auto \r\n     *                          range is turned off.\r\n     * @param notify  a flag that controls whether or not listeners are \r\n     *                notified.\r\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1293,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeWithMargins(double, double)",
      "begin_line": 1304,
      "end_line": 1306,
      "comment": "\r\n     * Sets the axis range (after first adding the current margins to the \r\n     * range) and sends an {@link AxisChangeEvent} to all registered listeners.\r\n     * As a side-effect, the auto-range flag is set to \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param lower  the lower axis limit.\r\n     * @param upper  the upper axis limit.\r\n     ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setRangeAboutValue(double, double)",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\r\n     * Sets the axis range, where the new range is \u0027size\u0027 in length, and \r\n     * centered on \u0027value\u0027.\r\n     *\r\n     * @param value  the central value.\r\n     * @param length  the range length.\r\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.isAutoTickUnitSelection()",
      "begin_line": 1328,
      "end_line": 1330,
      "comment": "\r\n     * Returns a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.\r\n     *\r\n     * @return A flag indicating whether or not the tick unit is automatically\r\n     *         selected.\r\n     *         \r\n     * @see #setAutoTickUnitSelection(boolean)\r\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickUnitSelection(boolean)",
      "begin_line": 1341,
      "end_line": 1343,
      "comment": "\r\n     * Sets a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.  If the flag is changed, \r\n     * registered listeners are notified that the chart has changed.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1342,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickUnitSelection(boolean, boolean)",
      "begin_line": 1354,
      "end_line": 1362,
      "comment": "\r\n     * Sets a flag indicating whether or not the tick unit is automatically\r\n     * selected from a range of standard tick units.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #isAutoTickUnitSelection()\r\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1361,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getStandardTickUnits()",
      "begin_line": 1371,
      "end_line": 1373,
      "comment": "\r\n     * Returns the source for obtaining standard tick units for the axis.\r\n     *\r\n     * @return The source (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setStandardTickUnits(TickUnitSource)\r\n     ",
      "child_ranges": [
        "(line 1372,col 9)-(line 1372,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setStandardTickUnits(org.jfree.chart.axis.TickUnitSource)",
      "begin_line": 1387,
      "end_line": 1390,
      "comment": "\r\n     * Sets the source for obtaining standard tick units for the axis and sends\r\n     * an {@link AxisChangeEvent} to all registered listeners.  The axis will \r\n     * try to select the smallest tick unit from the source that does not cause\r\n     * the tick labels to overlap (see also the \r\n     * {@link #setAutoTickUnitSelection(boolean)} method.\r\n     *\r\n     * @param source  the source for standard tick units (\u003ccode\u003enull\u003c/code\u003e \r\n     *                permitted).\r\n     *                \r\n     * @see #getStandardTickUnits()\r\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 40)",
        "(line 1389,col 9)-(line 1389,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.valueToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1406,
      "end_line": 1407,
      "comment": "\r\n     * Converts a data value to a coordinate in Java2D space, assuming that the\r\n     * axis runs along one edge of the specified dataArea.\r\n     * \u003cp\u003e\r\n     * Note that it is possible for the coordinate to fall outside the area.\r\n     *\r\n     * @param value  the data value.\r\n     * @param area  the area for plotting the data.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate.\r\n     * \r\n     * @see #java2DToValue(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.lengthToJava2D(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1419,
      "end_line": 1424,
      "comment": "\r\n     * Converts a length in data coordinates into the corresponding length in \r\n     * Java2D coordinates.\r\n     * \r\n     * @param length  the length.\r\n     * @param area  the plot area.\r\n     * @param edge  the edge along which the axis lies.\r\n     * \r\n     * @return The length in Java2D coordinates.\r\n     ",
      "child_ranges": [
        "(line 1421,col 9)-(line 1421,col 53)",
        "(line 1422,col 9)-(line 1422,col 53)",
        "(line 1423,col 9)-(line 1423,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.java2DToValue(double, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 1438,
      "end_line": 1440,
      "comment": "\r\n     * Converts a coordinate in Java2D space to the corresponding data value,\r\n     * assuming that the axis runs along one edge of the specified dataArea.\r\n     *\r\n     * @param java2DValue  the coordinate in Java2D space.\r\n     * @param area  the area in which the data is plotted.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The data value.\r\n     * \r\n     * @see #valueToJava2D(double, Rectangle2D, RectangleEdge)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.autoAdjustRange()",
      "begin_line": 1448,
      "end_line": 1448,
      "comment": "\r\n     * Automatically sets the axis range to fit the range of values in the \r\n     * dataset.  Sometimes this can depend on the renderer used as well (for \r\n     * example, the renderer may \"stack\" values, requiring an axis range \r\n     * greater than otherwise necessary).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.centerRange(double)",
      "begin_line": 1456,
      "end_line": 1463,
      "comment": "\r\n     * Centers the axis range about the specified value and sends an \r\n     * {@link AxisChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the center value.\r\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 54)",
        "(line 1459,col 9)-(line 1460,col 62)",
        "(line 1461,col 9)-(line 1461,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.resizeRange(double)",
      "begin_line": 1477,
      "end_line": 1479,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about \r\n     * the central value and sends an {@link AxisChangeEvent} to all registered\r\n     * listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * \r\n     * @see #resizeRange(double, double)\r\n     ",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.resizeRange(double, double)",
      "begin_line": 1494,
      "end_line": 1504,
      "comment": "\r\n     * Increases or decreases the axis range by the specified percentage about\r\n     * the specified anchor value and sends an {@link AxisChangeEvent} to all \r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * To double the length of the axis range, use 200% (2.0).\r\n     * To halve the length of the axis range, use 50% (0.5).\r\n     *\r\n     * @param percent  the resize factor.\r\n     * @param anchorValue  the new central value after the resize.\r\n     * \r\n     * @see #resizeRange(double)\r\n     ",
      "child_ranges": [
        "(line 1495,col 9)-(line 1503,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.zoomRange(double, double)",
      "begin_line": 1512,
      "end_line": 1525,
      "comment": "\r\n     * Zooms in on the current range.\r\n     * \r\n     * @param lowerPercent  the new lower bound.\r\n     * @param upperPercent  the new upper bound.\r\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 50)",
        "(line 1514,col 9)-(line 1514,col 47)",
        "(line 1515,col 9)-(line 1515,col 30)",
        "(line 1516,col 9)-(line 1523,col 9)",
        "(line 1524,col 9)-(line 1524,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.getAutoTickIndex()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "\r\n     * Returns the auto tick index.\r\n     *\r\n     * @return The auto tick index.\r\n     * \r\n     * @see #setAutoTickIndex(int)\r\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1535,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.setAutoTickIndex(int)",
      "begin_line": 1545,
      "end_line": 1547,
      "comment": "\r\n     * Sets the auto tick index.\r\n     *\r\n     * @param index  the new value.\r\n     * \r\n     * @see #getAutoTickIndex()\r\n     ",
      "child_ranges": [
        "(line 1546,col 9)-(line 1546,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.equals(java.lang.Object)",
      "begin_line": 1556,
      "end_line": 1610,
      "comment": "\r\n     * Tests the axis for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1558,col 9)-(line 1560,col 9)",
        "(line 1561,col 9)-(line 1563,col 9)",
        "(line 1565,col 9)-(line 1565,col 41)",
        "(line 1567,col 9)-(line 1569,col 9)",
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1575,col 9)",
        "(line 1576,col 9)-(line 1578,col 9)",
        "(line 1579,col 9)-(line 1581,col 9)",
        "(line 1582,col 9)-(line 1584,col 9)",
        "(line 1585,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1593,col 9)",
        "(line 1594,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1603,col 9)",
        "(line 1604,col 9)-(line 1606,col 9)",
        "(line 1608,col 9)-(line 1608,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.clone()",
      "begin_line": 1620,
      "end_line": 1623,
      "comment": "\r\n     * Returns a clone of the object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the axis does \r\n     *         not support cloning.\r\n     ",
      "child_ranges": [
        "(line 1621,col 9)-(line 1621,col 52)",
        "(line 1622,col 9)-(line 1622,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1632,
      "end_line": 1638,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1633,col 9)-(line 1633,col 36)",
        "(line 1634,col 9)-(line 1634,col 57)",
        "(line 1635,col 9)-(line 1635,col 59)",
        "(line 1636,col 9)-(line 1636,col 59)",
        "(line 1637,col 9)-(line 1637,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.ValueAxis.readObject(java.io.ObjectInputStream)",
      "begin_line": 1648,
      "end_line": 1657,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1651,col 35)",
        "(line 1652,col 9)-(line 1652,col 57)",
        "(line 1653,col 9)-(line 1653,col 59)",
        "(line 1654,col 9)-(line 1654,col 59)",
        "(line 1655,col 9)-(line 1655,col 60)"
      ]
    }
  ]
}