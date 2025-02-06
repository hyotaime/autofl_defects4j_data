{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/ThermometerPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThermometerPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Zoomable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 150,
      "end_line": 1724,
      "comment": "\r\n * A plot that displays a single value (from a {@link ValueDataset}) in a \r\n * thermometer type display.\r\n * \u003cp\u003e\r\n * This plot supports a number of options:\r\n * \u003col\u003e\r\n * \u003cli\u003ethree sub-ranges which could be viewed as \u0027Normal\u0027, \u0027Warning\u0027 \r\n *   and \u0027Critical\u0027 ranges.\u003c/li\u003e\r\n * \u003cli\u003ethe thermometer can be run in two modes:\r\n *      \u003cul\u003e\r\n *      \u003cli\u003efixed range, or\u003c/li\u003e\r\n *      \u003cli\u003erange adjusts to current sub-range.\u003c/li\u003e\r\n *      \u003c/ul\u003e\r\n * \u003c/li\u003e\r\n * \u003cli\u003esettable units to be displayed.\u003c/li\u003e\r\n * \u003cli\u003esettable display location for the value text.\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_NONE"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " A constant for unit type \u0027None\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_FAHRENHEIT"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " A constant for unit type \u0027Fahrenheit\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_CELCIUS"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " A constant for unit type \u0027Celcius\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_KELVIN"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " A constant for unit type \u0027Kelvin\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " A constant for the value label position (no label). "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " A constant for the value label position (right of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "LEFT"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " A constant for the value label position (left of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "BULB"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " A constant for the value label position (in the thermometer bulb). "
    },
    {
      "type": "field",
      "varNames": [
        "NORMAL"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " A constant for the \u0027normal\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "WARNING"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " A constant for the \u0027warning\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "CRITICAL"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " A constant for the \u0027critical\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_RADIUS"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " \r\n     * The bulb radius. \r\n     * \r\n     * @deprecated As of 1.0.7, use {@link #getBulbRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_DIAMETER"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " \r\n     * The bulb diameter. \r\n     * \r\n     * @deprecated As of 1.0.7, use {@link #getBulbDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_RADIUS"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " \r\n     * The column radius. \r\n     * \r\n     * @deprecated As of 1.0.7, use {@link #getColumnRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_DIAMETER"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " \r\n     * The column diameter.\r\n     * \r\n     * @deprecated As of 1.0.7, use {@link #getColumnDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_RADIUS"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " \r\n     * The gap radius. \r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_DIAMETER"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " \r\n     * The gap diameter. \r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()} times two.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_GAP"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " The axis gap. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS"
      ],
      "begin_line": 235,
      "end_line": 236,
      "comment": " The unit strings. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_LOW"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Index for low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_HIGH"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " Index for high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_LOW"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Index for display low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_HIGH"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Index for display high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOWER_BOUND"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " The default lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UPPER_BOUND"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " The default upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BULB_RADIUS"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " \r\n     * The default bulb radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COLUMN_RADIUS"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " \r\n     * The default column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAP"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " \r\n     * The default gap between the outlines representing the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " The dataset for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxis"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " The range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " The lower bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " The upper bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "bulbRadius"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": " \r\n     * The value label position.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columnRadius"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " \r\n     * The column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " \r\n     * The gap between the two outlines the represent the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " \r\n     * Blank space inside the plot area around the outside of the thermometer. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerStroke"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Stroke for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerPaint"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Paint for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The display units "
    },
    {
      "type": "field",
      "varNames": [
        "valueLocation"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " The value label position. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLocation"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " The position of the axis *"
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " The font to write the value in "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Colour that the value is written in "
    },
    {
      "type": "field",
      "varNames": [
        "valueFormat"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Number format for the value "
    },
    {
      "type": "field",
      "varNames": [
        "mercuryPaint"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " The default paint for the mercury in the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "subrange"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " The display sub-range. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeInfo"
      ],
      "begin_line": 346,
      "end_line": 350,
      "comment": " The start and end values for the subranges. "
    },
    {
      "type": "field",
      "varNames": [
        "followDataInSubranges"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " \r\n     * A flag that controls whether or not the axis range adjusts to the \r\n     * sub-ranges. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useSubrangePaint"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " \r\n     * A flag that controls whether or not the mercury paint changes with \r\n     * the subranges. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "subrangePaint"
      ],
      "begin_line": 365,
      "end_line": 366,
      "comment": " Paint for each range "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorsVisible"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " A flag that controls whether the sub-range indicators are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorStroke"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " The stroke for the sub-range indicators. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeIndicatorStroke"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " The range indicator stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 378,
      "end_line": 379,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\r\n     * Creates a new thermometer plot.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 393,
      "end_line": 410,
      "comment": "\r\n     * Creates a new thermometer plot, using default attributes where necessary.\r\n     *\r\n     * @param dataset  the data set.\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 16)",
        "(line 396,col 9)-(line 396,col 40)",
        "(line 397,col 9)-(line 398,col 22)",
        "(line 399,col 9)-(line 399,col 31)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 47)",
        "(line 404,col 9)-(line 404,col 71)",
        "(line 405,col 9)-(line 405,col 39)",
        "(line 406,col 9)-(line 406,col 27)",
        "(line 407,col 9)-(line 407,col 37)",
        "(line 408,col 9)-(line 408,col 30)",
        "(line 409,col 9)-(line 409,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataset()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 431,
      "end_line": 451,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there \r\n     * is one, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 45)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 441,col 9)-(line 441,col 31)",
        "(line 442,col 9)-(line 445,col 9)",
        "(line 448,col 9)-(line 448,col 73)",
        "(line 449,col 9)-(line 449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getRangeAxis()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Returns the range axis.\r\n     *\r\n     * @return The range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 472,
      "end_line": 484,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeAxis()\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 50)",
        "(line 479,col 9)-(line 479,col 27)",
        "(line 480,col 9)-(line 480,col 37)",
        "(line 481,col 9)-(line 481,col 30)",
        "(line 482,col 9)-(line 482,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLowerBound()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\r\n     * Returns the lower bound for the thermometer.  The data value can be set \r\n     * lower than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The lower bound.\r\n     * \r\n     * @see #setLowerBound(double)\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setLowerBound(double)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\r\n     * Sets the lower bound for the thermometer.\r\n     *\r\n     * @param lower the lower bound.\r\n     * \r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 32)",
        "(line 507,col 9)-(line 507,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUpperBound()",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\r\n     * Returns the upper bound for the thermometer.  The data value can be set \r\n     * higher than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The upper bound.\r\n     * \r\n     * @see #setUpperBound(double)\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUpperBound(double)",
      "begin_line": 529,
      "end_line": 532,
      "comment": "\r\n     * Sets the upper bound for the thermometer.\r\n     *\r\n     * @param upper the upper bound.\r\n     * \r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 32)",
        "(line 531,col 9)-(line 531,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRange(double, double)",
      "begin_line": 540,
      "end_line": 544,
      "comment": "\r\n     * Sets the lower and upper bounds for the thermometer.\r\n     *\r\n     * @param lower  the lower bound.\r\n     * @param upper  the upper bound.\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 32)",
        "(line 542,col 9)-(line 542,col 32)",
        "(line 543,col 9)-(line 543,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPadding()",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\r\n     * Returns the padding for the thermometer.  This is the space inside the \r\n     * plot area.\r\n     *\r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 566,
      "end_line": 572,
      "comment": "\r\n     * Sets the padding for the thermometer and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 31)",
        "(line 571,col 9)-(line 571,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerStroke()",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\r\n     * Returns the stroke used to draw the thermometer outline.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setThermometerStroke(Stroke)\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerStroke(java.awt.Stroke)",
      "begin_line": 594,
      "end_line": 599,
      "comment": "\r\n     * Sets the stroke used to draw the thermometer outline and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param s  the new stroke (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * \r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerPaint()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\r\n     * Returns the paint used to draw the thermometer outline.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setThermometerPaint(Paint)\r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerPaint(java.awt.Paint)",
      "begin_line": 621,
      "end_line": 626,
      "comment": "\r\n     * Sets the paint used to draw the thermometer outline and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     * \r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUnits()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "\r\n     * Returns a code indicating the unit display type.  This is one of\r\n     * {@link #UNITS_NONE}, {@link #UNITS_FAHRENHEIT}, {@link #UNITS_CELCIUS} \r\n     * and {@link #UNITS_KELVIN}.\r\n     *\r\n     * @return The units type.\r\n     * \r\n     * @see #setUnits(int)\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUnits(int)",
      "begin_line": 656,
      "end_line": 663,
      "comment": "\r\n     * Sets the units to be displayed in the thermometer. Use one of the \r\n     * following constants:\r\n     *\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eUNITS_NONE : no units displayed.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_FAHRENHEIT : units displayed in Fahrenheit.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_CELCIUS : units displayed in Celcius.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_KELVIN : units displayed in Kelvin.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param u  the new unit type.\r\n     * \r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueLocation()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\r\n     * Returns a code indicating the location at which the value label is\r\n     * displayed.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #RIGHT}, \r\n     *         {@link #LEFT} and {@link #BULB}.).\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueLocation(int)",
      "begin_line": 688,
      "end_line": 696,
      "comment": "\r\n     * Sets the location at which the current value is displayed and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * The location can be one of the constants:\r\n     * \u003ccode\u003eNONE\u003c/code\u003e,\r\n     * \u003ccode\u003eRIGHT\u003c/code\u003e\r\n     * \u003ccode\u003eLEFT\u003c/code\u003e and\r\n     * \u003ccode\u003eBULB\u003c/code\u003e.\r\n     *\r\n     * @param location  the location.\r\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 695,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getAxisLocation()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\r\n     * Returns the axis location.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #LEFT} and \r\n     *         {@link #RIGHT}).\r\n     *         \r\n     * @see #setAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisLocation(int)",
      "begin_line": 720,
      "end_line": 728,
      "comment": "\r\n     * Sets the location at which the axis is displayed relative to the \r\n     * thermometer, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param location  the location (one of {@link #NONE}, {@link #LEFT} and \r\n     *         {@link #RIGHT}).\r\n     * \r\n     * @see #getAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 727,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueFont()",
      "begin_line": 737,
      "end_line": 739,
      "comment": "\r\n     * Gets the font used to display the current value.\r\n     *\r\n     * @return The font.\r\n     * \r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 738,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFont(java.awt.Font)",
      "begin_line": 748,
      "end_line": 756,
      "comment": "\r\n     * Sets the font used to display the current value.\r\n     *\r\n     * @param f  the new font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValuePaint()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\r\n     * Gets the paint used to display the current value.\r\n    *\r\n     * @return The paint.\r\n     * \r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 777,
      "end_line": 785,
      "comment": "\r\n     * Sets the paint used to display the current value and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 784,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFormat(java.text.NumberFormat)",
      "begin_line": 795,
      "end_line": 801,
      "comment": "\r\n     * Sets the formatter for the value label and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param formatter  the new formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 37)",
        "(line 800,col 9)-(line 800,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getMercuryPaint()",
      "begin_line": 810,
      "end_line": 812,
      "comment": "\r\n     * Returns the default mercury paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setMercuryPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setMercuryPaint(java.awt.Paint)",
      "begin_line": 822,
      "end_line": 828,
      "comment": "\r\n     * Sets the default mercury paint and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getMercuryPaint()\r\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 34)",
        "(line 827,col 9)-(line 827,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double)",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\r\n     * Sets information for a particular range.\r\n     *\r\n     * @param range  the range to specify information about.\r\n     * @param low  the low value for the range\r\n     * @param hi  the high value for the range\r\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double, double, double)",
      "begin_line": 850,
      "end_line": 861,
      "comment": "\r\n     * Sets the subrangeInfo attribute of the ThermometerPlot object\r\n     *\r\n     * @param range  the new rangeInfo value.\r\n     * @param rangeLow  the new rangeInfo value\r\n     * @param rangeHigh  the new rangeInfo value\r\n     * @param displayLow  the new rangeInfo value\r\n     * @param displayHigh  the new rangeInfo value\r\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 859,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrange(int, double, double)",
      "begin_line": 870,
      "end_line": 875,
      "comment": "\r\n     * Sets the bounds for a subrange.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 871,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDisplayRange(int, double, double)",
      "begin_line": 884,
      "end_line": 900,
      "comment": "\r\n     * Sets the displayed bounds for a sub range.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getSubrangePaint(int)",
      "begin_line": 911,
      "end_line": 918,
      "comment": "\r\n     * Gets the paint used for a particular subrange.\r\n     *\r\n     * @param range  the range (.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @see #setSubrangePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 917,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangePaint(int, java.awt.Paint)",
      "begin_line": 929,
      "end_line": 935,
      "comment": "\r\n     * Sets the paint to be used for a subrange and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param range  the range (0, 1 or 2).\r\n     * @param paint  the paint to be applied (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSubrangePaint(int)\r\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getFollowDataInSubranges()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\r\n     * Returns a flag that controls whether or not the thermometer axis zooms \r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setFollowDataInSubranges(boolean)",
      "begin_line": 953,
      "end_line": 956,
      "comment": "\r\n     * Sets the flag that controls whether or not the thermometer axis zooms \r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @param flag  the flag.\r\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 42)",
        "(line 955,col 9)-(line 955,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUseSubrangePaint()",
      "begin_line": 966,
      "end_line": 968,
      "comment": "\r\n     * Returns a flag that controls whether or not the mercury color changes \r\n     * for each subrange.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setUseSubrangePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUseSubrangePaint(boolean)",
      "begin_line": 977,
      "end_line": 980,
      "comment": "\r\n     * Sets the range colour change option.\r\n     *\r\n     * @param flag the new range colour change option\r\n     * \r\n     * @see #getUseSubrangePaint()\r\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 37)",
        "(line 979,col 9)-(line 979,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbRadius()",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\r\n     * Returns the bulb radius, in Java2D units.\r\n\r\n     * @return The bulb radius.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setBulbRadius(int)",
      "begin_line": 1003,
      "end_line": 1006,
      "comment": "\r\n     * Sets the bulb radius (in Java2D units) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param r  the new radius (in Java2D units).\r\n     * \r\n     * @see #getBulbRadius()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 28)",
        "(line 1005,col 9)-(line 1005,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbDiameter()",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\r\n     * Returns the bulb diameter, which is always twice the value returned\r\n     * by {@link #getBulbRadius()}.\r\n     * \r\n     * @return The bulb diameter.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnRadius()",
      "begin_line": 1029,
      "end_line": 1031,
      "comment": "\r\n     * Returns the column radius, in Java2D units.\r\n     * \r\n     * @return The column radius.\r\n     * \r\n     * @see #setColumnRadius(int)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setColumnRadius(int)",
      "begin_line": 1043,
      "end_line": 1046,
      "comment": "\r\n     * Sets the column radius (in Java2D units) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param r  the new radius.\r\n     * \r\n     * @see #getColumnRadius()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 30)",
        "(line 1045,col 9)-(line 1045,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnDiameter()",
      "begin_line": 1056,
      "end_line": 1058,
      "comment": "\r\n     * Returns the column diameter, which is always twice the value returned\r\n     * by {@link #getColumnRadius()}.\r\n     * \r\n     * @return The column diameter.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getGap()",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\r\n     * Returns the gap, in Java2D units, between the two outlines that \r\n     * represent the thermometer.\r\n     * \r\n     * @return The gap.\r\n     * \r\n     * @see #setGap(int)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setGap(int)",
      "begin_line": 1085,
      "end_line": 1088,
      "comment": "\r\n     * Sets the gap (in Java2D units) between the two outlines that represent\r\n     * the thermometer, and sends a {@link PlotChangeEvent} to all registered \r\n     * listeners.\r\n     * \r\n     * @param gap  the new gap.\r\n     * \r\n     * @see #getGap()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 23)",
        "(line 1087,col 9)-(line 1087,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1100,
      "end_line": 1292,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 67)",
        "(line 1105,col 9)-(line 1105,col 67)",
        "(line 1106,col 9)-(line 1106,col 69)",
        "(line 1107,col 9)-(line 1107,col 53)",
        "(line 1108,col 9)-(line 1108,col 53)",
        "(line 1109,col 9)-(line 1109,col 27)",
        "(line 1110,col 9)-(line 1110,col 35)",
        "(line 1111,col 9)-(line 1113,col 9)",
        "(line 1116,col 9)-(line 1116,col 45)",
        "(line 1117,col 9)-(line 1117,col 26)",
        "(line 1118,col 9)-(line 1118,col 33)",
        "(line 1121,col 9)-(line 1121,col 58)",
        "(line 1122,col 9)-(line 1122,col 36)",
        "(line 1123,col 9)-(line 1123,col 71)",
        "(line 1124,col 9)-(line 1124,col 72)",
        "(line 1125,col 9)-(line 1125,col 67)",
        "(line 1126,col 9)-(line 1126,col 72)",
        "(line 1127,col 9)-(line 1128,col 66)",
        "(line 1130,col 9)-(line 1131,col 54)",
        "(line 1133,col 9)-(line 1135,col 58)",
        "(line 1137,col 9)-(line 1137,col 52)",
        "(line 1138,col 9)-(line 1138,col 44)",
        "(line 1139,col 9)-(line 1139,col 39)",
        "(line 1141,col 9)-(line 1143,col 32)",
        "(line 1145,col 9)-(line 1149,col 52)",
        "(line 1151,col 9)-(line 1151,col 52)",
        "(line 1152,col 9)-(line 1152,col 39)",
        "(line 1153,col 9)-(line 1153,col 39)",
        "(line 1155,col 9)-(line 1272,col 9)",
        "(line 1274,col 9)-(line 1274,col 43)",
        "(line 1275,col 9)-(line 1275,col 35)",
        "(line 1278,col 9)-(line 1278,col 38)",
        "(line 1279,col 9)-(line 1280,col 62)",
        "(line 1281,col 9)-(line 1284,col 9)",
        "(line 1287,col 9)-(line 1287,col 45)",
        "(line 1288,col 9)-(line 1288,col 34)",
        "(line 1289,col 9)-(line 1289,col 34)",
        "(line 1291,col 9)-(line 1291,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoom(double)",
      "begin_line": 1301,
      "end_line": 1303,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the \r\n     * zoom operation.  In the case of a thermometer chart, it doesn\u0027t make \r\n     * sense to zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPlotType()",
      "begin_line": 1310,
      "end_line": 1312,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1319,
      "end_line": 1340,
      "comment": "\r\n     * Checks to see if a new value means the axis range needs adjusting.\r\n     *\r\n     * @param event  the dataset change event.\r\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1349,
      "end_line": 1351,
      "comment": "\r\n     * Returns the data range.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range of data displayed.\r\n     ",
      "child_ranges": [
        "(line 1350,col 8)-(line 1350,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisRange()",
      "begin_line": 1356,
      "end_line": 1365,
      "comment": "\r\n     * Sets the axis range to the current values in the rangeInfo array.\r\n     ",
      "child_ranges": [
        "(line 1357,col 9)-(line 1364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLegendItems()",
      "begin_line": 1372,
      "end_line": 1374,
      "comment": "\r\n     * Returns the legend items for the plot.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getOrientation()",
      "begin_line": 1381,
      "end_line": 1383,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     * \r\n     * @return The orientation (always {@link PlotOrientation#VERTICAL}).\r\n     ",
      "child_ranges": [
        "(line 1382,col 9)-(line 1382,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isValidNumber(double)",
      "begin_line": 1393,
      "end_line": 1395,
      "comment": "\r\n     * Determine whether a number is valid and finite.\r\n     *\r\n     * @param d  the number to be tested.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the number is valid and finite, and \r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 1394,col 9)-(line 1394,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.inSubrange(int, double)",
      "begin_line": 1405,
      "end_line": 1408,
      "comment": "\r\n     * Returns true if the value is in the specified range, and false otherwise.\r\n     *\r\n     * @param subrange  the subrange.\r\n     * @param value  the value to check.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1407,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getCurrentPaint()",
      "begin_line": 1417,
      "end_line": 1432,
      "comment": "\r\n     * Returns the mercury paint corresponding to the current data value.\r\n     * Called from the {@link #draw(Graphics2D, Rectangle2D, Point2D, \r\n     * PlotState, PlotRenderingInfo)} method.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 41)",
        "(line 1419,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1431,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equals(java.lang.Object)",
      "begin_line": 1442,
      "end_line": 1522,
      "comment": "\r\n     * Tests this plot for equality with another object.  The plot\u0027s dataset\r\n     * is not considered in the test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1443,col 9)-(line 1445,col 9)",
        "(line 1446,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1449,col 53)",
        "(line 1450,col 9)-(line 1452,col 9)",
        "(line 1453,col 9)-(line 1455,col 9)",
        "(line 1456,col 9)-(line 1458,col 9)",
        "(line 1459,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1464,col 9)",
        "(line 1465,col 9)-(line 1467,col 9)",
        "(line 1468,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1478,col 9)",
        "(line 1479,col 9)-(line 1481,col 9)",
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1496,col 9)",
        "(line 1497,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1511,col 9)",
        "(line 1512,col 9)-(line 1514,col 9)",
        "(line 1515,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1521,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equal(double[][], double[][])",
      "begin_line": 1532,
      "end_line": 1548,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     * \r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1538,col 9)",
        "(line 1539,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1547,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.clone()",
      "begin_line": 1557,
      "end_line": 1574,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1559,col 9)-(line 1559,col 64)",
        "(line 1561,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1564,col 76)",
        "(line 1565,col 9)-(line 1568,col 9)",
        "(line 1569,col 9)-(line 1569,col 68)",
        "(line 1570,col 9)-(line 1570,col 67)",
        "(line 1572,col 9)-(line 1572,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1583,
      "end_line": 1594,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1584,col 9)-(line 1584,col 36)",
        "(line 1585,col 9)-(line 1585,col 68)",
        "(line 1586,col 9)-(line 1586,col 66)",
        "(line 1587,col 9)-(line 1587,col 60)",
        "(line 1588,col 9)-(line 1588,col 62)",
        "(line 1589,col 9)-(line 1589,col 74)",
        "(line 1590,col 9)-(line 1590,col 71)",
        "(line 1591,col 9)-(line 1593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1604,
      "end_line": 1620,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 35)",
        "(line 1607,col 9)-(line 1607,col 68)",
        "(line 1608,col 9)-(line 1608,col 66)",
        "(line 1609,col 9)-(line 1609,col 60)",
        "(line 1610,col 9)-(line 1610,col 62)",
        "(line 1611,col 9)-(line 1611,col 74)",
        "(line 1612,col 9)-(line 1612,col 71)",
        "(line 1613,col 9)-(line 1613,col 42)",
        "(line 1614,col 9)-(line 1616,col 9)",
        "(line 1617,col 9)-(line 1619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1629,
      "end_line": 1632,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1645,
      "end_line": 1648,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *         \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1657,
      "end_line": 1660,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1659,col 9)-(line 1659,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1673,
      "end_line": 1678,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *         \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1675,col 9)-(line 1676,col 57)",
        "(line 1677,col 9)-(line 1677,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1688,
      "end_line": 1691,
      "comment": "\r\n     * This method does nothing.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1701,
      "end_line": 1704,
      "comment": "\r\n     * Zooms the range axes.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1703,col 9)-(line 1703,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isDomainZoomable()",
      "begin_line": 1711,
      "end_line": 1713,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1712,col 9)-(line 1712,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isRangeZoomable()",
      "begin_line": 1720,
      "end_line": 1722,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1721,col 9)-(line 1721,col 20)"
      ]
    }
  ]
}