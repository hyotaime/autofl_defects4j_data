{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/ThermometerPlot.java",
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
      "begin_line": 152,
      "end_line": 1729,
      "comment": "\r\n * A plot that displays a single value (from a {@link ValueDataset}) in a\r\n * thermometer type display.\r\n * \u003cp\u003e\r\n * This plot supports a number of options:\r\n * \u003col\u003e\r\n * \u003cli\u003ethree sub-ranges which could be viewed as \u0027Normal\u0027, \u0027Warning\u0027\r\n *   and \u0027Critical\u0027 ranges.\u003c/li\u003e\r\n * \u003cli\u003ethe thermometer can be run in two modes:\r\n *      \u003cul\u003e\r\n *      \u003cli\u003efixed range, or\u003c/li\u003e\r\n *      \u003cli\u003erange adjusts to current sub-range.\u003c/li\u003e\r\n *      \u003c/ul\u003e\r\n * \u003c/li\u003e\r\n * \u003cli\u003esettable units to be displayed.\u003c/li\u003e\r\n * \u003cli\u003esettable display location for the value text.\u003c/li\u003e\r\n * \u003c/ol\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_NONE"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " A constant for unit type \u0027None\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_FAHRENHEIT"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " A constant for unit type \u0027Fahrenheit\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_CELCIUS"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " A constant for unit type \u0027Celcius\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS_KELVIN"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " A constant for unit type \u0027Kelvin\u0027. "
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " A constant for the value label position (no label). "
    },
    {
      "type": "field",
      "varNames": [
        "RIGHT"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " A constant for the value label position (right of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "LEFT"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " A constant for the value label position (left of the thermometer). "
    },
    {
      "type": "field",
      "varNames": [
        "BULB"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " A constant for the value label position (in the thermometer bulb). "
    },
    {
      "type": "field",
      "varNames": [
        "NORMAL"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " A constant for the \u0027normal\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "WARNING"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " A constant for the \u0027warning\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "CRITICAL"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " A constant for the \u0027critical\u0027 range. "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_RADIUS"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\r\n     * The bulb radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getBulbRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BULB_DIAMETER"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": "\r\n     * The bulb diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getBulbDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_RADIUS"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\r\n     * The column radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getColumnRadius()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "COLUMN_DIAMETER"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": "\r\n     * The column diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getColumnDiameter()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_RADIUS"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\r\n     * The gap radius.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()}.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GAP_DIAMETER"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": "\r\n     * The gap diameter.\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #getGap()} times two.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AXIS_GAP"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " The axis gap. "
    },
    {
      "type": "field",
      "varNames": [
        "UNITS"
      ],
      "begin_line": 237,
      "end_line": 238,
      "comment": " The unit strings. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_LOW"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " Index for low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "RANGE_HIGH"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " Index for high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_LOW"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": " Index for display low value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DISPLAY_HIGH"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Index for display high value in subrangeInfo matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LOWER_BOUND"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " The default lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UPPER_BOUND"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": " The default upper bound. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BULB_RADIUS"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": "\r\n     * The default bulb radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COLUMN_RADIUS"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\r\n     * The default column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GAP"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": "\r\n     * The default gap between the outlines representing the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " The dataset for the plot. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxis"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " The range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " The lower bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The upper bound for the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "bulbRadius"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": "\r\n     * The value label position.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "columnRadius"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": "\r\n     * The column radius.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gap"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": "\r\n     * The gap between the two outlines the represent the thermometer.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": "\r\n     * Blank space inside the plot area around the outside of the thermometer.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerStroke"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Stroke for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "thermometerPaint"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Paint for drawing the thermometer "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " The display units "
    },
    {
      "type": "field",
      "varNames": [
        "valueLocation"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " The value label position. "
    },
    {
      "type": "field",
      "varNames": [
        "axisLocation"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " The position of the axis *"
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " The font to write the value in "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Colour that the value is written in "
    },
    {
      "type": "field",
      "varNames": [
        "valueFormat"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Number format for the value "
    },
    {
      "type": "field",
      "varNames": [
        "mercuryPaint"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " The default paint for the mercury in the thermometer. "
    },
    {
      "type": "field",
      "varNames": [
        "subrange"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " The display sub-range. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeInfo"
      ],
      "begin_line": 348,
      "end_line": 352,
      "comment": " The start and end values for the subranges. "
    },
    {
      "type": "field",
      "varNames": [
        "followDataInSubranges"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": "\r\n     * A flag that controls whether or not the axis range adjusts to the\r\n     * sub-ranges.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useSubrangePaint"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": "\r\n     * A flag that controls whether or not the mercury paint changes with\r\n     * the subranges.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "subrangePaint"
      ],
      "begin_line": 367,
      "end_line": 368,
      "comment": " Paint for each range "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorsVisible"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " A flag that controls whether the sub-range indicators are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "subrangeIndicatorStroke"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " The stroke for the sub-range indicators. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeIndicatorStroke"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " The range indicator stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 380,
      "end_line": 382,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\r\n     * Creates a new thermometer plot.\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.ThermometerPlot.ThermometerPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 396,
      "end_line": 413,
      "comment": "\r\n     * Creates a new thermometer plot, using default attributes where necessary.\r\n     *\r\n     * @param dataset  the data set.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 16)",
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 401,col 22)",
        "(line 402,col 9)-(line 402,col 31)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 47)",
        "(line 407,col 9)-(line 407,col 71)",
        "(line 408,col 9)-(line 408,col 39)",
        "(line 409,col 9)-(line 409,col 27)",
        "(line 410,col 9)-(line 410,col 37)",
        "(line 411,col 9)-(line 411,col 30)",
        "(line 412,col 9)-(line 412,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataset()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 434,
      "end_line": 456,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 45)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 444,col 9)-(line 444,col 31)",
        "(line 445,col 9)-(line 448,col 9)",
        "(line 451,col 9)-(line 452,col 41)",
        "(line 454,col 9)-(line 454,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getRangeAxis()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\r\n     * Returns the range axis.\r\n     *\r\n     * @return The range axis (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxis(ValueAxis)\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 477,
      "end_line": 489,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 50)",
        "(line 484,col 9)-(line 484,col 27)",
        "(line 485,col 9)-(line 485,col 37)",
        "(line 486,col 9)-(line 486,col 30)",
        "(line 487,col 9)-(line 487,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLowerBound()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Returns the lower bound for the thermometer.  The data value can be set\r\n     * lower than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The lower bound.\r\n     *\r\n     * @see #setLowerBound(double)\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setLowerBound(double)",
      "begin_line": 510,
      "end_line": 513,
      "comment": "\r\n     * Sets the lower bound for the thermometer.\r\n     *\r\n     * @param lower the lower bound.\r\n     *\r\n     * @see #getLowerBound()\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 32)",
        "(line 512,col 9)-(line 512,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUpperBound()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\r\n     * Returns the upper bound for the thermometer.  The data value can be set\r\n     * higher than this, but it will not be shown in the thermometer.\r\n     *\r\n     * @return The upper bound.\r\n     *\r\n     * @see #setUpperBound(double)\r\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUpperBound(double)",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\r\n     * Sets the upper bound for the thermometer.\r\n     *\r\n     * @param upper the upper bound.\r\n     *\r\n     * @see #getUpperBound()\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 32)",
        "(line 536,col 9)-(line 536,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setRange(double, double)",
      "begin_line": 545,
      "end_line": 549,
      "comment": "\r\n     * Sets the lower and upper bounds for the thermometer.\r\n     *\r\n     * @param lower  the lower bound.\r\n     * @param upper  the upper bound.\r\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 32)",
        "(line 547,col 9)-(line 547,col 32)",
        "(line 548,col 9)-(line 548,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPadding()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\r\n     * Returns the padding for the thermometer.  This is the space inside the\r\n     * plot area.\r\n     *\r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 571,
      "end_line": 577,
      "comment": "\r\n     * Sets the padding for the thermometer and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 31)",
        "(line 576,col 9)-(line 576,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerStroke()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\r\n     * Returns the stroke used to draw the thermometer outline.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setThermometerStroke(Stroke)\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerStroke(java.awt.Stroke)",
      "begin_line": 599,
      "end_line": 604,
      "comment": "\r\n     * Sets the stroke used to draw the thermometer outline and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param s  the new stroke (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getThermometerPaint()",
      "begin_line": 614,
      "end_line": 616,
      "comment": "\r\n     * Returns the paint used to draw the thermometer outline.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setThermometerPaint(Paint)\r\n     * @see #getThermometerStroke()\r\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setThermometerPaint(java.awt.Paint)",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\r\n     * Sets the paint used to draw the thermometer outline and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     *\r\n     * @see #getThermometerPaint()\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUnits()",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\r\n     * Returns a code indicating the unit display type.  This is one of\r\n     * {@link #UNITS_NONE}, {@link #UNITS_FAHRENHEIT}, {@link #UNITS_CELCIUS}\r\n     * and {@link #UNITS_KELVIN}.\r\n     *\r\n     * @return The units type.\r\n     *\r\n     * @see #setUnits(int)\r\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUnits(int)",
      "begin_line": 661,
      "end_line": 668,
      "comment": "\r\n     * Sets the units to be displayed in the thermometer. Use one of the\r\n     * following constants:\r\n     *\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eUNITS_NONE : no units displayed.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_FAHRENHEIT : units displayed in Fahrenheit.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_CELCIUS : units displayed in Celcius.\u003c/li\u003e\r\n     * \u003cli\u003eUNITS_KELVIN : units displayed in Kelvin.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param u  the new unit type.\r\n     *\r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueLocation()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "\r\n     * Returns a code indicating the location at which the value label is\r\n     * displayed.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #RIGHT},\r\n     *         {@link #LEFT} and {@link #BULB}.).\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueLocation(int)",
      "begin_line": 693,
      "end_line": 701,
      "comment": "\r\n     * Sets the location at which the current value is displayed and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * The location can be one of the constants:\r\n     * \u003ccode\u003eNONE\u003c/code\u003e,\r\n     * \u003ccode\u003eRIGHT\u003c/code\u003e\r\n     * \u003ccode\u003eLEFT\u003c/code\u003e and\r\n     * \u003ccode\u003eBULB\u003c/code\u003e.\r\n     *\r\n     * @param location  the location.\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getAxisLocation()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\r\n     * Returns the axis location.\r\n     *\r\n     * @return The location (one of {@link #NONE}, {@link #LEFT} and\r\n     *         {@link #RIGHT}).\r\n     *\r\n     * @see #setAxisLocation(int)\r\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisLocation(int)",
      "begin_line": 725,
      "end_line": 733,
      "comment": "\r\n     * Sets the location at which the axis is displayed relative to the\r\n     * thermometer, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param location  the location (one of {@link #NONE}, {@link #LEFT} and\r\n     *         {@link #RIGHT}).\r\n     *\r\n     * @see #getAxisLocation()\r\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValueFont()",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\r\n     * Gets the font used to display the current value.\r\n     *\r\n     * @return The font.\r\n     *\r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFont(java.awt.Font)",
      "begin_line": 753,
      "end_line": 761,
      "comment": "\r\n     * Sets the font used to display the current value.\r\n     *\r\n     * @param f  the new font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 760,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getValuePaint()",
      "begin_line": 770,
      "end_line": 772,
      "comment": "\r\n     * Gets the paint used to display the current value.\r\n    *\r\n     * @return The paint.\r\n     *\r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 782,
      "end_line": 790,
      "comment": "\r\n     * Sets the paint used to display the current value and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 789,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setValueFormat(java.text.NumberFormat)",
      "begin_line": 800,
      "end_line": 806,
      "comment": "\r\n     * Sets the formatter for the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param formatter  the new formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 37)",
        "(line 805,col 9)-(line 805,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getMercuryPaint()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\r\n     * Returns the default mercury paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setMercuryPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setMercuryPaint(java.awt.Paint)",
      "begin_line": 827,
      "end_line": 833,
      "comment": "\r\n     * Sets the default mercury paint and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMercuryPaint()\r\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 34)",
        "(line 832,col 9)-(line 832,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double)",
      "begin_line": 842,
      "end_line": 844,
      "comment": "\r\n     * Sets information for a particular range.\r\n     *\r\n     * @param range  the range to specify information about.\r\n     * @param low  the low value for the range\r\n     * @param hi  the high value for the range\r\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangeInfo(int, double, double, double, double)",
      "begin_line": 855,
      "end_line": 866,
      "comment": "\r\n     * Sets the subrangeInfo attribute of the ThermometerPlot object\r\n     *\r\n     * @param range  the new rangeInfo value.\r\n     * @param rangeLow  the new rangeInfo value\r\n     * @param rangeHigh  the new rangeInfo value\r\n     * @param displayLow  the new rangeInfo value\r\n     * @param displayHigh  the new rangeInfo value\r\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 864,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrange(int, double, double)",
      "begin_line": 875,
      "end_line": 880,
      "comment": "\r\n     * Sets the bounds for a subrange.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 879,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setDisplayRange(int, double, double)",
      "begin_line": 889,
      "end_line": 905,
      "comment": "\r\n     * Sets the displayed bounds for a sub range.\r\n     *\r\n     * @param range  the range type.\r\n     * @param low  the low value.\r\n     * @param high  the high value.\r\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 903,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getSubrangePaint(int)",
      "begin_line": 916,
      "end_line": 923,
      "comment": "\r\n     * Gets the paint used for a particular subrange.\r\n     *\r\n     * @param range  the range (.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setSubrangePaint(int, Paint)\r\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 922,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setSubrangePaint(int, java.awt.Paint)",
      "begin_line": 934,
      "end_line": 940,
      "comment": "\r\n     * Sets the paint to be used for a subrange and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param range  the range (0, 1 or 2).\r\n     * @param paint  the paint to be applied (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSubrangePaint(int)\r\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getFollowDataInSubranges()",
      "begin_line": 948,
      "end_line": 950,
      "comment": "\r\n     * Returns a flag that controls whether or not the thermometer axis zooms\r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setFollowDataInSubranges(boolean)",
      "begin_line": 958,
      "end_line": 961,
      "comment": "\r\n     * Sets the flag that controls whether or not the thermometer axis zooms\r\n     * to display the subrange within which the data value falls.\r\n     *\r\n     * @param flag  the flag.\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 42)",
        "(line 960,col 9)-(line 960,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getUseSubrangePaint()",
      "begin_line": 971,
      "end_line": 973,
      "comment": "\r\n     * Returns a flag that controls whether or not the mercury color changes\r\n     * for each subrange.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setUseSubrangePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setUseSubrangePaint(boolean)",
      "begin_line": 982,
      "end_line": 985,
      "comment": "\r\n     * Sets the range colour change option.\r\n     *\r\n     * @param flag the new range colour change option\r\n     *\r\n     * @see #getUseSubrangePaint()\r\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 37)",
        "(line 984,col 9)-(line 984,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbRadius()",
      "begin_line": 994,
      "end_line": 996,
      "comment": "\r\n     * Returns the bulb radius, in Java2D units.\r\n\r\n     * @return The bulb radius.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setBulbRadius(int)",
      "begin_line": 1008,
      "end_line": 1011,
      "comment": "\r\n     * Sets the bulb radius (in Java2D units) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param r  the new radius (in Java2D units).\r\n     *\r\n     * @see #getBulbRadius()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 28)",
        "(line 1010,col 9)-(line 1010,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getBulbDiameter()",
      "begin_line": 1021,
      "end_line": 1023,
      "comment": "\r\n     * Returns the bulb diameter, which is always twice the value returned\r\n     * by {@link #getBulbRadius()}.\r\n     *\r\n     * @return The bulb diameter.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnRadius()",
      "begin_line": 1034,
      "end_line": 1036,
      "comment": "\r\n     * Returns the column radius, in Java2D units.\r\n     *\r\n     * @return The column radius.\r\n     *\r\n     * @see #setColumnRadius(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setColumnRadius(int)",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": "\r\n     * Sets the column radius (in Java2D units) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param r  the new radius.\r\n     *\r\n     * @see #getColumnRadius()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 30)",
        "(line 1050,col 9)-(line 1050,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getColumnDiameter()",
      "begin_line": 1061,
      "end_line": 1063,
      "comment": "\r\n     * Returns the column diameter, which is always twice the value returned\r\n     * by {@link #getColumnRadius()}.\r\n     *\r\n     * @return The column diameter.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1062,col 9)-(line 1062,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getGap()",
      "begin_line": 1075,
      "end_line": 1077,
      "comment": "\r\n     * Returns the gap, in Java2D units, between the two outlines that\r\n     * represent the thermometer.\r\n     *\r\n     * @return The gap.\r\n     *\r\n     * @see #setGap(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setGap(int)",
      "begin_line": 1090,
      "end_line": 1093,
      "comment": "\r\n     * Sets the gap (in Java2D units) between the two outlines that represent\r\n     * the thermometer, and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param gap  the new gap.\r\n     *\r\n     * @see #getGap()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1091,col 23)",
        "(line 1092,col 9)-(line 1092,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1105,
      "end_line": 1297,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 67)",
        "(line 1110,col 9)-(line 1110,col 67)",
        "(line 1111,col 9)-(line 1111,col 69)",
        "(line 1112,col 9)-(line 1112,col 53)",
        "(line 1113,col 9)-(line 1113,col 53)",
        "(line 1114,col 9)-(line 1114,col 27)",
        "(line 1115,col 9)-(line 1115,col 35)",
        "(line 1116,col 9)-(line 1118,col 9)",
        "(line 1121,col 9)-(line 1121,col 45)",
        "(line 1122,col 9)-(line 1122,col 26)",
        "(line 1123,col 9)-(line 1123,col 33)",
        "(line 1126,col 9)-(line 1126,col 58)",
        "(line 1127,col 9)-(line 1127,col 36)",
        "(line 1128,col 9)-(line 1128,col 71)",
        "(line 1129,col 9)-(line 1129,col 72)",
        "(line 1130,col 9)-(line 1130,col 67)",
        "(line 1131,col 9)-(line 1131,col 72)",
        "(line 1132,col 9)-(line 1133,col 66)",
        "(line 1135,col 9)-(line 1136,col 54)",
        "(line 1138,col 9)-(line 1140,col 58)",
        "(line 1142,col 9)-(line 1142,col 52)",
        "(line 1143,col 9)-(line 1143,col 44)",
        "(line 1144,col 9)-(line 1144,col 39)",
        "(line 1146,col 9)-(line 1148,col 32)",
        "(line 1150,col 9)-(line 1154,col 52)",
        "(line 1156,col 9)-(line 1156,col 52)",
        "(line 1157,col 9)-(line 1157,col 39)",
        "(line 1158,col 9)-(line 1158,col 39)",
        "(line 1160,col 9)-(line 1277,col 9)",
        "(line 1279,col 9)-(line 1279,col 43)",
        "(line 1280,col 9)-(line 1280,col 35)",
        "(line 1283,col 9)-(line 1283,col 38)",
        "(line 1284,col 9)-(line 1285,col 62)",
        "(line 1286,col 9)-(line 1289,col 9)",
        "(line 1292,col 9)-(line 1292,col 45)",
        "(line 1293,col 9)-(line 1293,col 34)",
        "(line 1294,col 9)-(line 1294,col 34)",
        "(line 1296,col 9)-(line 1296,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoom(double)",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the\r\n     * zoom operation.  In the case of a thermometer chart, it doesn\u0027t make\r\n     * sense to zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent  the zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getPlotType()",
      "begin_line": 1315,
      "end_line": 1317,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 1324,
      "end_line": 1345,
      "comment": "\r\n     * Checks to see if a new value means the axis range needs adjusting.\r\n     *\r\n     * @param event  the dataset change event.\r\n     ",
      "child_ranges": [
        "(line 1325,col 9)-(line 1343,col 9)",
        "(line 1344,col 9)-(line 1344,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1354,
      "end_line": 1356,
      "comment": "\r\n     * Returns the data range.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range of data displayed.\r\n     ",
      "child_ranges": [
        "(line 1355,col 8)-(line 1355,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.setAxisRange()",
      "begin_line": 1361,
      "end_line": 1370,
      "comment": "\r\n     * Sets the axis range to the current values in the rangeInfo array.\r\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getLegendItems()",
      "begin_line": 1377,
      "end_line": 1379,
      "comment": "\r\n     * Returns the legend items for the plot.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1378,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getOrientation()",
      "begin_line": 1386,
      "end_line": 1388,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (always {@link PlotOrientation#VERTICAL}).\r\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isValidNumber(double)",
      "begin_line": 1398,
      "end_line": 1400,
      "comment": "\r\n     * Determine whether a number is valid and finite.\r\n     *\r\n     * @param d  the number to be tested.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the number is valid and finite, and\r\n     *         \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.inSubrange(int, double)",
      "begin_line": 1410,
      "end_line": 1413,
      "comment": "\r\n     * Returns true if the value is in the specified range, and false otherwise.\r\n     *\r\n     * @param subrange  the subrange.\r\n     * @param value  the value to check.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1412,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.getCurrentPaint()",
      "begin_line": 1422,
      "end_line": 1437,
      "comment": "\r\n     * Returns the mercury paint corresponding to the current data value.\r\n     * Called from the {@link #draw(Graphics2D, Rectangle2D, Point2D,\r\n     * PlotState, PlotRenderingInfo)} method.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1423,col 41)",
        "(line 1424,col 9)-(line 1435,col 9)",
        "(line 1436,col 9)-(line 1436,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equals(java.lang.Object)",
      "begin_line": 1447,
      "end_line": 1527,
      "comment": "\r\n     * Tests this plot for equality with another object.  The plot\u0027s dataset\r\n     * is not considered in the test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 1448,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1453,col 9)",
        "(line 1454,col 9)-(line 1454,col 53)",
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1463,col 9)",
        "(line 1464,col 9)-(line 1466,col 9)",
        "(line 1467,col 9)-(line 1469,col 9)",
        "(line 1470,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1480,col 9)",
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
        "(line 1517,col 9)-(line 1519,col 9)",
        "(line 1520,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.equal(double[][], double[][])",
      "begin_line": 1537,
      "end_line": 1553,
      "comment": "\r\n     * Tests two double[][] arrays for equality.\r\n     *\r\n     * @param array1  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param array2  the second arrray (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1538,col 9)-(line 1540,col 9)",
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1551,col 9)",
        "(line 1552,col 9)-(line 1552,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.clone()",
      "begin_line": 1562,
      "end_line": 1579,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the plot cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 1564,col 9)-(line 1564,col 64)",
        "(line 1566,col 9)-(line 1568,col 9)",
        "(line 1569,col 9)-(line 1569,col 76)",
        "(line 1570,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1574,col 68)",
        "(line 1575,col 9)-(line 1575,col 67)",
        "(line 1577,col 9)-(line 1577,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1588,
      "end_line": 1599,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1589,col 9)-(line 1589,col 36)",
        "(line 1590,col 9)-(line 1590,col 68)",
        "(line 1591,col 9)-(line 1591,col 66)",
        "(line 1592,col 9)-(line 1592,col 60)",
        "(line 1593,col 9)-(line 1593,col 62)",
        "(line 1594,col 9)-(line 1594,col 74)",
        "(line 1595,col 9)-(line 1595,col 71)",
        "(line 1596,col 9)-(line 1598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1609,
      "end_line": 1625,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1611,col 9)-(line 1611,col 35)",
        "(line 1612,col 9)-(line 1612,col 68)",
        "(line 1613,col 9)-(line 1613,col 66)",
        "(line 1614,col 9)-(line 1614,col 60)",
        "(line 1615,col 9)-(line 1615,col 62)",
        "(line 1616,col 9)-(line 1616,col 74)",
        "(line 1617,col 9)-(line 1617,col 71)",
        "(line 1618,col 9)-(line 1618,col 42)",
        "(line 1619,col 9)-(line 1621,col 9)",
        "(line 1622,col 9)-(line 1624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1634,
      "end_line": 1637,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1650,
      "end_line": 1653,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1662,
      "end_line": 1665,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1664,col 9)-(line 1664,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 1678,
      "end_line": 1683,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 1680,col 9)-(line 1681,col 57)",
        "(line 1682,col 9)-(line 1682,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1693,
      "end_line": 1696,
      "comment": "\r\n     * This method does nothing.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 1706,
      "end_line": 1709,
      "comment": "\r\n     * Zooms the range axes.\r\n     *\r\n     * @param lowerPercent  the lower percent.\r\n     * @param upperPercent  the upper percent.\r\n     * @param state  the plot state.\r\n     * @param source  the source point.\r\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isDomainZoomable()",
      "begin_line": 1716,
      "end_line": 1718,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.ThermometerPlot.isRangeZoomable()",
      "begin_line": 1725,
      "end_line": 1727,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1726,col 20)"
      ]
    }
  ]
}