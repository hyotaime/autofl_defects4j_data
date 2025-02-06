{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/ThermometerPlot.java",
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
      "begin_line": 151,
      "end_line": 1726,
      "comment": "\r\n * A plot that displays a single value (from a {@link ValueDataset}) in a\r\n * thermometer type display.\r\n * \u003cp\u003e\r\n * This plot supports a number of options:\r\n * \u003col\u003e\r\n * \u003cli\u003ethree sub-ranges which could be viewed as \u0027Normal\u0027, \u0027Warning\u0027\r\n *   and \u0027Critical\u0027 ranges.\u003c/li\u003e\r\n * \u003cli\u003ethe thermometer can be run in two modes:\r\n *      \u003cul\u003e\r\n *      \u003cli\u003efixed range, or\u003c/li\u003e\r\n *      \u003cli\u003erange adjusts to current sub-range.\u003c/li\u003e\r\n *      \u003c/ul\u003e\r\n * \u003c/li\u003e\r\n * \u003cli\u003esettable units to be displayed.\u003c/li\u003e\r\n * \u003cli\u003esettable display location for the value text.\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_NONE"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " A constant for unit type \u0027None\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_FAHRENHEIT"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " A constant for unit type \u0027Fahrenheit\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_CELCIUS"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " A constant for unit type \u0027Celcius\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_KELVIN"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " A constant for unit type \u0027Kelvin\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " A constant for the value label position (no label). "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " A constant for the value label position (right of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "LEFT"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " A constant for the value label position (left of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "BULB"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " A constant for the value label position (in the thermometer bulb). "
    },
    {
      "type": "field",
      "varNames": [
        "NORMAL"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " A constant for the \u0027normal\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "WARNING"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " A constant for the \u0027warning\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "CRITICAL"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " A constant for the \u0027critical\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_RADIUS"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\r\n     * The bulb radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getBulbRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_DIAMETER"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\r\n     * The bulb diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getBulbDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_RADIUS"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": "\r\n     * The column radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getColumnRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_DIAMETER"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\r\n     * The column diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getColumnDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_RADIUS"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * The gap radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_DIAMETER"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\r\n     * The gap diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()} times two.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_GAP"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " The axis gap. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS"
      ],
      "begin_line": 236,
      "end_line": 237,
      "comment": " The unit strings. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_LOW"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Index for low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_HIGH"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Index for high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_LOW"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Index for display low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_HIGH"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Index for display high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOWER_BOUND"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": " The default lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UPPER_BOUND"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " The default upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BULB_RADIUS"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": "\r\n     * The default bulb radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COLUMN_RADIUS"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\r\n     * The default column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAP"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": "\r\n     * The default gap between the outlines representing the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " The dataset for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxis"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " The range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " The lower bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 288,
      "end_line": 288,
      "comment": " The upper bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "bulbRadius"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": "\r\n     * The value label position.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columnRadius"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": "\r\n     * The column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": "\r\n     * The gap between the two outlines the represent the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": "\r\n     * Blank space inside the plot area around the outside of the thermometer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerStroke"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Stroke for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerPaint"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Paint for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " The display units "
    },
    {
      "type": "field",
      "varNames": [
        "valueLocation"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " The value label position. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLocation"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " The position of the axis *"
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " The font to write the value in "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " Colour that the value is written in "
    },
    {
      "type": "field",
      "varNames": [
        "valueFormat"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Number format for the value "
    },
    {
      "type": "field",
      "varNames": [
        "mercuryPaint"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " The default paint for the mercury in the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "subrange"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The display sub-range. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeInfo"
      ],
      "begin_line": 347,
      "end_line": 351,
      "comment": " The start and end values for the subranges. "
    },
    {
      "type": "field",
      "varNames": [
        "followDataInSubranges"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": "\r\n     * A flag that controls whether or not the axis range adjusts to the\r\n     * sub-ranges.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useSubrangePaint"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": "\r\n     * A flag that controls whether or not the mercury paint changes with\r\n     * the subranges.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "subrangePaint"
      ],
      "begin_line": 366,
      "end_line": 367,
      "comment": " Paint for each range "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorsVisible"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " A flag that controls whether the sub-range indicators are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorStroke"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " The stroke for the sub-range indicators. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeIndicatorStroke"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " The range indicator stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 379,
      "end_line": 381,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Creates a new thermometer plot.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 395,
      "end_line": 412,
      "comment": "\r\n     * Creates a new thermometer plot, using default attributes where necessary.\r\n     *\r\n     * @param dataset  the data set.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 16)",
        "(line 398,col 9)-(line 398,col 40)",
        "(line 399,col 9)-(line 400,col 22)",
        "(line 401,col 9)-(line 401,col 31)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 47)",
        "(line 406,col 9)-(line 406,col 71)",
        "(line 407,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 27)",
        "(line 409,col 9)-(line 409,col 37)",
        "(line 410,col 9)-(line 410,col 30)",
        "(line 411,col 9)-(line 411,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataset()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 433,
      "end_line": 453,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 45)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 443,col 9)-(line 443,col 31)",
        "(line 444,col 9)-(line 447,col 9)",
        "(line 450,col 9)-(line 450,col 73)",
        "(line 451,col 9)-(line 451,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getRangeAxis()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\r\n     * Returns the range axis.\r\n     *\r\n     * @return The range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 474,
      "end_line": 486,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 50)",
        "(line 481,col 9)-(line 481,col 27)",
        "(line 482,col 9)-(line 482,col 37)",
        "(line 483,col 9)-(line 483,col 30)",
        "(line 484,col 9)-(line 484,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLowerBound()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\r\n     * Returns the lower bound for the thermometer.  The data value can be set\r\n     * lower than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #setLowerBound(double)\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setLowerBound(double)",
      "begin_line": 507,
      "end_line": 510,
      "comment": "\r\n     * Sets the lower bound for the thermometer.\r\n     *\r\n     * @param lower the lower bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 32)",
        "(line 509,col 9)-(line 509,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUpperBound()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\r\n     * Returns the upper bound for the thermometer.  The data value can be set\r\n     * higher than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #setUpperBound(double)\r\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUpperBound(double)",
      "begin_line": 531,
      "end_line": 534,
      "comment": "\r\n     * Sets the upper bound for the thermometer.\r\n     *\r\n     * @param upper the upper bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 32)",
        "(line 533,col 9)-(line 533,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRange(double, double)",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\r\n     * Sets the lower and upper bounds for the thermometer.\r\n     *\r\n     * @param lower  the lower bound.\r\n     * @param upper  the upper bound.\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 32)",
        "(line 544,col 9)-(line 544,col 32)",
        "(line 545,col 9)-(line 545,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPadding()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\r\n     * Returns the padding for the thermometer.  This is the space inside the\r\n     * plot area.\r\n     *\r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 568,
      "end_line": 574,
      "comment": "\r\n     * Sets the padding for the thermometer and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 31)",
        "(line 573,col 9)-(line 573,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerStroke()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\r\n     * Returns the stroke used to draw the thermometer outline.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setThermometerStroke(Stroke)\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerStroke(java.awt.Stroke)",
      "begin_line": 596,
      "end_line": 601,
      "comment": "\r\n     * Sets the stroke used to draw the thermometer outline and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param s  the new stroke (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerPaint()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\r\n     * Returns the paint used to draw the thermometer outline.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setThermometerPaint(Paint)\r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerPaint(java.awt.Paint)",
      "begin_line": 623,
      "end_line": 628,
      "comment": "\r\n     * Sets the paint used to draw the thermometer outline and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 627,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUnits()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\r\n     * Returns a code indicating the unit display type.  This is one of\r\n     * {@link #UNITS_NONE}, {@link #UNITS_FAHRENHEIT}, {@link #UNITS_CELCIUS}\r\n     * and {@link #UNITS_KELVIN}.\r\n     *\r\n     * @return The units type.\r\n     *\r\n     * @see #setUnits(int)\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUnits(int)",
      "begin_line": 658,
      "end_line": 665,
      "comment": "\r\n     * Sets the units to be displayed in the thermometer. Use one of the\r\n     * following constants:\r\n     *\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eUNITS_NONE : no units displayed.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_FAHRENHEIT : units displayed in Fahrenheit.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_CELCIUS : units displayed in Celcius.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_KELVIN : units displayed in Kelvin.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param u  the new unit type.\r\n     *\r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueLocation()",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\r\n     * Returns a code indicating the location at which the value label is\r\n     * displayed.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #RIGHT},\r\n     *         {@link #LEFT} and {@link #BULB}.).\r\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueLocation(int)",
      "begin_line": 690,
      "end_line": 698,
      "comment": "\r\n     * Sets the location at which the current value is displayed and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * The location can be one of the constants:\r\n     * \u003ccode\u003eNONE\u003c/code\u003e,\r\n     * \u003ccode\u003eRIGHT\u003c/code\u003e\r\n     * \u003ccode\u003eLEFT\u003c/code\u003e and\r\n     * \u003ccode\u003eBULB\u003c/code\u003e.\r\n     *\r\n     * @param location  the location.\r\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getAxisLocation()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\r\n     * Returns the axis location.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #LEFT} and\r\n     *         {@link #RIGHT}).\r\n     *\r\n     * @see #setAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisLocation(int)",
      "begin_line": 722,
      "end_line": 730,
      "comment": "\r\n     * Sets the location at which the axis is displayed relative to the\r\n     * thermometer, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param location  the location (one of {@link #NONE}, {@link #LEFT} and\r\n     *         {@link #RIGHT}).\r\n     *\r\n     * @see #getAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueFont()",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\r\n     * Gets the font used to display the current value.\r\n     *\r\n     * @return The font.\r\n     *\r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFont(java.awt.Font)",
      "begin_line": 750,
      "end_line": 758,
      "comment": "\r\n     * Sets the font used to display the current value.\r\n     *\r\n     * @param f  the new font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 757,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValuePaint()",
      "begin_line": 767,
      "end_line": 769,
      "comment": "\r\n     * Gets the paint used to display the current value.\r\n    *\r\n     * @return The paint.\r\n     *\r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 779,
      "end_line": 787,
      "comment": "\r\n     * Sets the paint used to display the current value and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 786,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFormat(java.text.NumberFormat)",
      "begin_line": 797,
      "end_line": 803,
      "comment": "\r\n     * Sets the formatter for the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param formatter  the new formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 37)",
        "(line 802,col 9)-(line 802,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getMercuryPaint()",
      "begin_line": 812,
      "end_line": 814,
      "comment": "\r\n     * Returns the default mercury paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setMercuryPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setMercuryPaint(java.awt.Paint)",
      "begin_line": 824,
      "end_line": 830,
      "comment": "\r\n     * Sets the default mercury paint and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMercuryPaint()\r\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 34)",
        "(line 829,col 9)-(line 829,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double)",
      "begin_line": 839,
      "end_line": 841,
      "comment": "\r\n     * Sets information for a particular range.\r\n     *\r\n     * @param range  the range to specify information about.\r\n     * @param low  the low value for the range\r\n     * @param hi  the high value for the range\r\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double, double, double)",
      "begin_line": 852,
      "end_line": 863,
      "comment": "\r\n     * Sets the subrangeInfo attribute of the ThermometerPlot object\r\n     *\r\n     * @param range  the new rangeInfo value.\r\n     * @param rangeLow  the new rangeInfo value\r\n     * @param rangeHigh  the new rangeInfo value\r\n     * @param displayLow  the new rangeInfo value\r\n     * @param displayHigh  the new rangeInfo value\r\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 861,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrange(int, double, double)",
      "begin_line": 872,
      "end_line": 877,
      "comment": "\r\n     * Sets the bounds for a subrange.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 876,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDisplayRange(int, double, double)",
      "begin_line": 886,
      "end_line": 902,
      "comment": "\r\n     * Sets the displayed bounds for a sub range.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 900,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getSubrangePaint(int)",
      "begin_line": 913,
      "end_line": 920,
      "comment": "\r\n     * Gets the paint used for a particular subrange.\r\n     *\r\n     * @param range  the range (.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setSubrangePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 919,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangePaint(int, java.awt.Paint)",
      "begin_line": 931,
      "end_line": 937,
      "comment": "\r\n     * Sets the paint to be used for a subrange and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param range  the range (0, 1 or 2).\r\n     * @param paint  the paint to be applied (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubrangePaint(int)\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getFollowDataInSubranges()",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\r\n     * Returns a flag that controls whether or not the thermometer axis zooms\r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setFollowDataInSubranges(boolean)",
      "begin_line": 955,
      "end_line": 958,
      "comment": "\r\n     * Sets the flag that controls whether or not the thermometer axis zooms\r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @param flag  the flag.\r\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 42)",
        "(line 957,col 9)-(line 957,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUseSubrangePaint()",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\r\n     * Returns a flag that controls whether or not the mercury color changes\r\n     * for each subrange.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setUseSubrangePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUseSubrangePaint(boolean)",
      "begin_line": 979,
      "end_line": 982,
      "comment": "\r\n     * Sets the range colour change option.\r\n     *\r\n     * @param flag the new range colour change option\r\n     *\r\n     * @see #getUseSubrangePaint()\r\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 37)",
        "(line 981,col 9)-(line 981,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbRadius()",
      "begin_line": 991,
      "end_line": 993,
      "comment": "\r\n     * Returns the bulb radius, in Java2D units.\r\n\r\n     * @return The bulb radius.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 992,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setBulbRadius(int)",
      "begin_line": 1005,
      "end_line": 1008,
      "comment": "\r\n     * Sets the bulb radius (in Java2D units) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param r  the new radius (in Java2D units).\r\n     *\r\n     * @see #getBulbRadius()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 28)",
        "(line 1007,col 9)-(line 1007,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbDiameter()",
      "begin_line": 1018,
      "end_line": 1020,
      "comment": "\r\n     * Returns the bulb diameter, which is always twice the value returned\r\n     * by {@link #getBulbRadius()}.\r\n     *\r\n     * @return The bulb diameter.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnRadius()",
      "begin_line": 1031,
      "end_line": 1033,
      "comment": "\r\n     * Returns the column radius, in Java2D units.\r\n     *\r\n     * @return The column radius.\r\n     *\r\n     * @see #setColumnRadius(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1032,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setColumnRadius(int)",
      "begin_line": 1045,
      "end_line": 1048,
      "comment": "\r\n     * Sets the column radius (in Java2D units) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param r  the new radius.\r\n     *\r\n     * @see #getColumnRadius()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 30)",
        "(line 1047,col 9)-(line 1047,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnDiameter()",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\r\n     * Returns the column diameter, which is always twice the value returned\r\n     * by {@link #getColumnRadius()}.\r\n     *\r\n     * @return The column diameter.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getGap()",
      "begin_line": 1072,
      "end_line": 1074,
      "comment": "\r\n     * Returns the gap, in Java2D units, between the two outlines that\r\n     * represent the thermometer.\r\n     *\r\n     * @return The gap.\r\n     *\r\n     * @see #setGap(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1073,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setGap(int)",
      "begin_line": 1087,
      "end_line": 1090,
      "comment": "\r\n     * Sets the gap (in Java2D units) between the two outlines that represent\r\n     * the thermometer, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param gap  the new gap.\r\n     *\r\n     * @see #getGap()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 23)",
        "(line 1089,col 9)-(line 1089,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1102,
      "end_line": 1294,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1106,col 9)-(line 1106,col 67)",
        "(line 1107,col 9)-(line 1107,col 67)",
        "(line 1108,col 9)-(line 1108,col 69)",
        "(line 1109,col 9)-(line 1109,col 53)",
        "(line 1110,col 9)-(line 1110,col 53)",
        "(line 1111,col 9)-(line 1111,col 27)",
        "(line 1112,col 9)-(line 1112,col 35)",
        "(line 1113,col 9)-(line 1115,col 9)",
        "(line 1118,col 9)-(line 1118,col 45)",
        "(line 1119,col 9)-(line 1119,col 26)",
        "(line 1120,col 9)-(line 1120,col 33)",
        "(line 1123,col 9)-(line 1123,col 58)",
        "(line 1124,col 9)-(line 1124,col 36)",
        "(line 1125,col 9)-(line 1125,col 71)",
        "(line 1126,col 9)-(line 1126,col 72)",
        "(line 1127,col 9)-(line 1127,col 67)",
        "(line 1128,col 9)-(line 1128,col 72)",
        "(line 1129,col 9)-(line 1130,col 66)",
        "(line 1132,col 9)-(line 1133,col 54)",
        "(line 1135,col 9)-(line 1137,col 58)",
        "(line 1139,col 9)-(line 1139,col 52)",
        "(line 1140,col 9)-(line 1140,col 44)",
        "(line 1141,col 9)-(line 1141,col 39)",
        "(line 1143,col 9)-(line 1145,col 32)",
        "(line 1147,col 9)-(line 1151,col 52)",
        "(line 1153,col 9)-(line 1153,col 52)",
        "(line 1154,col 9)-(line 1154,col 39)",
        "(line 1155,col 9)-(line 1155,col 39)",
        "(line 1157,col 9)-(line 1274,col 9)",
        "(line 1276,col 9)-(line 1276,col 43)",
        "(line 1277,col 9)-(line 1277,col 35)",
        "(line 1280,col 9)-(line 1280,col 38)",
        "(line 1281,col 9)-(line 1282,col 62)",
        "(line 1283,col 9)-(line 1286,col 9)",
        "(line 1289,col 9)-(line 1289,col 45)",
        "(line 1290,col 9)-(line 1290,col 34)",
        "(line 1291,col 9)-(line 1291,col 34)",
        "(line 1293,col 9)-(line 1293,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoom(double)",
      "begin_line": 1303,
      "end_line": 1305,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the\r\n     * zoom operation.  In the case of a thermometer chart, it doesn\u0027t make\r\n     * sense to zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPlotType()",
      "begin_line": 1312,
      "end_line": 1314,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1313,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 1321,
      "end_line": 1342,
      "comment": "\r\n     * Checks to see if a new value means the axis range needs adjusting.\r\n     *\r\n     * @param event  the dataset change event.\r\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1351,
      "end_line": 1353,
      "comment": "\r\n     * Returns the data range.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range of data displayed.\r\n     ",
      "child_ranges": [
        "(line 1352,col 8)-(line 1352,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisRange()",
      "begin_line": 1358,
      "end_line": 1367,
      "comment": "\r\n     * Sets the axis range to the current values in the rangeInfo array.\r\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLegendItems()",
      "begin_line": 1374,
      "end_line": 1376,
      "comment": "\r\n     * Returns the legend items for the plot.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getOrientation()",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (always {@link PlotOrientation#VERTICAL}).\r\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isValidNumber(double)",
      "begin_line": 1395,
      "end_line": 1397,
      "comment": "\r\n     * Determine whether a number is valid and finite.\r\n     *\r\n     * @param d  the number to be tested.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the number is valid and finite, and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.inSubrange(int, double)",
      "begin_line": 1407,
      "end_line": 1410,
      "comment": "\r\n     * Returns true if the value is in the specified range, and false otherwise.\r\n     *\r\n     * @param subrange  the subrange.\r\n     * @param value  the value to check.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1408,col 9)-(line 1409,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getCurrentPaint()",
      "begin_line": 1419,
      "end_line": 1434,
      "comment": "\r\n     * Returns the mercury paint corresponding to the current data value.\r\n     * Called from the {@link #draw(Graphics2D, Rectangle2D, Point2D,\r\n     * PlotState, PlotRenderingInfo)} method.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 41)",
        "(line 1421,col 9)-(line 1432,col 9)",
        "(line 1433,col 9)-(line 1433,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equals(java.lang.Object)",
      "begin_line": 1444,
      "end_line": 1524,
      "comment": "\r\n     * Tests this plot for equality with another object.  The plot\u0027s dataset\r\n     * is not considered in the test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1447,col 9)",
        "(line 1448,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 53)",
        "(line 1452,col 9)-(line 1454,col 9)",
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1463,col 9)",
        "(line 1464,col 9)-(line 1466,col 9)",
        "(line 1467,col 9)-(line 1469,col 9)",
        "(line 1470,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1477,col 9)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1486,col 9)",
        "(line 1487,col 9)-(line 1489,col 9)",
        "(line 1490,col 9)-(line 1492,col 9)",
        "(line 1493,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1507,col 9)",
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1513,col 9)",
        "(line 1514,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equal(double[][], double[][])",
      "begin_line": 1534,
      "end_line": 1550,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     *\r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.clone()",
      "begin_line": 1559,
      "end_line": 1576,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1561,col 9)-(line 1561,col 64)",
        "(line 1563,col 9)-(line 1565,col 9)",
        "(line 1566,col 9)-(line 1566,col 76)",
        "(line 1567,col 9)-(line 1570,col 9)",
        "(line 1571,col 9)-(line 1571,col 68)",
        "(line 1572,col 9)-(line 1572,col 67)",
        "(line 1574,col 9)-(line 1574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1585,
      "end_line": 1596,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 36)",
        "(line 1587,col 9)-(line 1587,col 68)",
        "(line 1588,col 9)-(line 1588,col 66)",
        "(line 1589,col 9)-(line 1589,col 60)",
        "(line 1590,col 9)-(line 1590,col 62)",
        "(line 1591,col 9)-(line 1591,col 74)",
        "(line 1592,col 9)-(line 1592,col 71)",
        "(line 1593,col 9)-(line 1595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1606,
      "end_line": 1622,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1608,col 35)",
        "(line 1609,col 9)-(line 1609,col 68)",
        "(line 1610,col 9)-(line 1610,col 66)",
        "(line 1611,col 9)-(line 1611,col 60)",
        "(line 1612,col 9)-(line 1612,col 62)",
        "(line 1613,col 9)-(line 1613,col 74)",
        "(line 1614,col 9)-(line 1614,col 71)",
        "(line 1615,col 9)-(line 1615,col 42)",
        "(line 1616,col 9)-(line 1618,col 9)",
        "(line 1619,col 9)-(line 1621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1631,
      "end_line": 1634,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1647,
      "end_line": 1650,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1659,
      "end_line": 1662,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1661,col 9)-(line 1661,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1675,
      "end_line": 1680,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1677,col 9)-(line 1678,col 57)",
        "(line 1679,col 9)-(line 1679,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1690,
      "end_line": 1693,
      "comment": "\r\n     * This method does nothing.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1703,
      "end_line": 1706,
      "comment": "\r\n     * Zooms the range axes.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1705,col 9)-(line 1705,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isDomainZoomable()",
      "begin_line": 1713,
      "end_line": 1715,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1714,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isRangeZoomable()",
      "begin_line": 1722,
      "end_line": 1724,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1723,col 9)-(line 1723,col 20)"
      ]
    }
  ]
}