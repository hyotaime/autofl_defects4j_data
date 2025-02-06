{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/MeterPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeterPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "java.io.Serializable",
        "java.lang.Cloneable"
      ],
      "begin_line": 134,
      "end_line": 1339,
      "comment": "\r\n * A plot that displays a single value in the form of a needle on a dial.\r\n * Defined ranges (for example, \u0027normal\u0027, \u0027warning\u0027 and \u0027critical\u0027) can be\r\n * highlighted on the dial.\r\n "
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
        "DEFAULT_DIAL_BACKGROUND_PAINT"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The default background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NEEDLE_PAINT"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The default needle paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_FONT"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The default value font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_PAINT"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The default value paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_METER_ANGLE"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The default meter angle. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BORDER_SIZE"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The default border size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CIRCLE_SIZE"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The default circle size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 161,
      "end_line": 162,
      "comment": " The default label font. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The dataset (contains a single value). "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The dial shape (background shape). "
    },
    {
      "type": "field",
      "varNames": [
        "meterAngle"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The dial extent (measured in degrees). "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The overall range of data values on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "tickSize"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The tick size. "
    },
    {
      "type": "field",
      "varNames": [
        "tickPaint"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The paint used to draw the ticks. "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The units displayed on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The font for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The paint for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBorder"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " A flag that controls whether or not the border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "dialOutlinePaint"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "dialBackgroundPaint"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The paint for the dial background. "
    },
    {
      "type": "field",
      "varNames": [
        "needlePaint"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The paint for the needle. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " A flag that controls whether or not the tick labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " The tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " The tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFormat"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The tick label format. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 216,
      "end_line": 218,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "intervals"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": "\r\n     * A (possibly empty) list of the {@link MeterInterval}s to be highlighted\r\n     * on the dial.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Creates a new plot with a default range of \u003ccode\u003e0\u003c/code\u003e to\r\n     * \u003ccode\u003e100\u003c/code\u003e and no value to display.\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 239,
      "end_line": 257,
      "comment": "\r\n     * Creates a new plot that displays the value from the supplied dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 16)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 46)",
        "(line 243,col 9)-(line 243,col 43)",
        "(line 244,col 9)-(line 244,col 29)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 58)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 252,col 54)",
        "(line 253,col 9)-(line 253,col 56)",
        "(line 254,col 9)-(line 254,col 75)",
        "(line 255,col 9)-(line 255,col 51)",
        "(line 256,col 9)-(line 256,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialShape()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the dial shape.  The default is {@link DialShape#CIRCLE}).\r\n     *\r\n     * @return The dial shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDialShape(DialShape)\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialShape(org.jfree.chart.plot.DialShape)",
      "begin_line": 278,
      "end_line": 284,
      "comment": "\r\n     * Sets the dial shape and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDialShape()\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 27)",
        "(line 283,col 9)-(line 283,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getMeterAngle()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns the meter angle in degrees.  This defines, in part, the shape\r\n     * of the dial.  The default is 270 degrees.\r\n     *\r\n     * @return The meter angle (in degrees).\r\n     *\r\n     * @see #setMeterAngle(int)\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setMeterAngle(int)",
      "begin_line": 306,
      "end_line": 313,
      "comment": "\r\n     * Sets the angle (in degrees) for the whole range of the dial and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param angle  the angle (in degrees, in the range 1-360).\r\n     *\r\n     * @see #getMeterAngle()\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getRange()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Returns the overall range for the dial.\r\n     *\r\n     * @return The overall range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setRange(org.jfree.data.Range)",
      "begin_line": 335,
      "end_line": 345,
      "comment": "\r\n     * Sets the range for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted and zero-length\r\n     *               ranges not permitted).\r\n     *\r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 27)",
        "(line 344,col 9)-(line 344,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickSize()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\r\n     * Returns the tick size (the interval between ticks on the dial).\r\n     *\r\n     * @return The tick size.\r\n     *\r\n     * @see #setTickSize(double)\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickSize(double)",
      "begin_line": 366,
      "end_line": 372,
      "comment": "\r\n     * Sets the tick size and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param size  the tick size (must be \u003e 0).\r\n     *\r\n     * @see #getTickSize()\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 29)",
        "(line 371,col 9)-(line 371,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickPaint()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Returns the paint used to draw the ticks around the dial.\r\n     *\r\n     * @return The paint used to draw the ticks around the dial (never\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickPaint(java.awt.Paint)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\r\n     * Sets the paint used to draw the tick labels around the dial and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickPaint()\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 31)",
        "(line 399,col 9)-(line 399,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getUnits()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\r\n     * Returns a string describing the units for the dial.\r\n     *\r\n     * @return The units (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setUnits(String)\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setUnits(java.lang.String)",
      "begin_line": 421,
      "end_line": 424,
      "comment": "\r\n     * Sets the units for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param units  the units (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 27)",
        "(line 423,col 9)-(line 423,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getNeedlePaint()",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\r\n     * Returns the paint for the needle.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNeedlePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setNeedlePaint(java.awt.Paint)",
      "begin_line": 445,
      "end_line": 451,
      "comment": "\r\n     * Sets the paint used to display the needle and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNeedlePaint()\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 33)",
        "(line 450,col 9)-(line 450,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelsVisible()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\r\n     * Returns the flag that determines whether or not tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setTickLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelsVisible(boolean)",
      "begin_line": 472,
      "end_line": 477,
      "comment": "\r\n     * Sets the flag that controls whether or not the tick labels are visible\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getTickLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFont()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\r\n     * Returns the tick label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFont(java.awt.Font)",
      "begin_line": 498,
      "end_line": 506,
      "comment": "\r\n     * Sets the tick label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelFont()\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelPaint()",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\r\n     * Returns the tick label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 527,
      "end_line": 535,
      "comment": "\r\n     * Sets the tick label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFormat()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Returns the tick label format.\r\n     *\r\n     * @return The tick label format (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFormat(NumberFormat)\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFormat(java.text.NumberFormat)",
      "begin_line": 556,
      "end_line": 562,
      "comment": "\r\n     * Sets the format for the tick labels and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param format  the format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelFormat()\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 38)",
        "(line 561,col 9)-(line 561,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValueFont()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "\r\n     * Returns the font for the value label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValueFont(java.awt.Font)",
      "begin_line": 583,
      "end_line": 589,
      "comment": "\r\n     * Sets the font used to display the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 587,col 30)",
        "(line 588,col 9)-(line 588,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValuePaint()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "\r\n     * Returns the paint for the value label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 610,
      "end_line": 616,
      "comment": "\r\n     * Sets the paint used to display the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 32)",
        "(line 615,col 9)-(line 615,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialBackgroundPaint()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\r\n     * Returns the paint for the dial background.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDialBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialBackgroundPaint(java.awt.Paint)",
      "begin_line": 637,
      "end_line": 640,
      "comment": "\r\n     * Sets the paint used to fill the dial background.  Set this to\r\n     * \u003ccode\u003enull\u003c/code\u003e for no background.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDialBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 41)",
        "(line 639,col 9)-(line 639,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDrawBorder()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\r\n     * Returns a flag that controls whether or not a rectangular border is\r\n     * drawn around the plot area.\r\n     *\r\n     * @return A flag.\r\n     *\r\n     * @see #setDrawBorder(boolean)\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDrawBorder(boolean)",
      "begin_line": 663,
      "end_line": 667,
      "comment": "\r\n     * Sets the flag that controls whether or not a rectangular border is drawn\r\n     * around the plot area and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param draw  the flag.\r\n     *\r\n     * @see #getDrawBorder()\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 31)",
        "(line 666,col 9)-(line 666,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialOutlinePaint()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "\r\n     * Returns the dial outline paint.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setDialOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialOutlinePaint(java.awt.Paint)",
      "begin_line": 688,
      "end_line": 691,
      "comment": "\r\n     * Sets the dial outline paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getDialOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 38)",
        "(line 690,col 9)-(line 690,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDataset()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 712,
      "end_line": 734,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one, and triggers a {@link PlotChangeEvent}.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 45)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 722,col 9)-(line 722,col 31)",
        "(line 723,col 9)-(line 726,col 9)",
        "(line 729,col 9)-(line 730,col 41)",
        "(line 732,col 9)-(line 732,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getIntervals()",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\r\n     * Returns an unmodifiable list of the intervals for the plot.\r\n     *\r\n     * @return A list.\r\n     *\r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.addInterval(org.jfree.chart.plot.MeterInterval)",
      "begin_line": 756,
      "end_line": 762,
      "comment": "\r\n     * Adds an interval and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param interval  the interval (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getIntervals()\r\n     * @see #clearIntervals()\r\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 37)",
        "(line 761,col 9)-(line 761,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clearIntervals()",
      "begin_line": 770,
      "end_line": 773,
      "comment": "\r\n     * Clears the intervals for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 31)",
        "(line 772,col 9)-(line 772,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getLegendItems()",
      "begin_line": 780,
      "end_line": 796,
      "comment": "\r\n     * Returns an item for each interval.\r\n     *\r\n     * @return A collection of legend items.\r\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 65)",
        "(line 782,col 9)-(line 782,col 54)",
        "(line 783,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 808,
      "end_line": 934,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 814,col 9)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 26)",
        "(line 820,col 9)-(line 821,col 38)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 829,col 9)-(line 829,col 57)",
        "(line 830,col 9)-(line 830,col 55)",
        "(line 831,col 9)-(line 831,col 56)",
        "(line 832,col 9)-(line 832,col 54)",
        "(line 833,col 9)-(line 833,col 56)",
        "(line 834,col 9)-(line 836,col 47)",
        "(line 838,col 9)-(line 838,col 50)",
        "(line 839,col 9)-(line 839,col 54)",
        "(line 840,col 9)-(line 840,col 54)",
        "(line 841,col 9)-(line 841,col 25)",
        "(line 842,col 9)-(line 842,col 25)",
        "(line 844,col 9)-(line 845,col 24)",
        "(line 847,col 9)-(line 849,col 69)",
        "(line 851,col 9)-(line 851,col 53)",
        "(line 852,col 9)-(line 852,col 53)",
        "(line 855,col 9)-(line 855,col 41)",
        "(line 856,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 932,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArcForInterval(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.MeterInterval)",
      "begin_line": 943,
      "end_line": 963,
      "comment": "\r\n     * Draws the arc to represent an interval.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the drawing area.\r\n     * @param interval  the interval.\r\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 62)",
        "(line 947,col 9)-(line 947,col 62)",
        "(line 948,col 9)-(line 948,col 56)",
        "(line 949,col 9)-(line 949,col 59)",
        "(line 950,col 9)-(line 950,col 62)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 962,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 975,
      "end_line": 997,
      "comment": "\r\n     * Draws an arc.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 978,col 51)",
        "(line 979,col 9)-(line 979,col 49)",
        "(line 980,col 9)-(line 980,col 46)",
        "(line 982,col 9)-(line 982,col 31)",
        "(line 983,col 9)-(line 983,col 31)",
        "(line 984,col 9)-(line 984,col 35)",
        "(line 985,col 9)-(line 985,col 36)",
        "(line 986,col 9)-(line 986,col 27)",
        "(line 987,col 9)-(line 987,col 29)",
        "(line 989,col 9)-(line 995,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.fillArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, boolean)",
      "begin_line": 1010,
      "end_line": 1050,
      "comment": "\r\n     * Fills an arc on the dial between the given values.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum data value.\r\n     * @param maxValue  the maximum data value.\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dial  a flag that indicates whether the arc represents the whole\r\n     *              dial.\r\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 51)",
        "(line 1017,col 9)-(line 1017,col 49)",
        "(line 1018,col 9)-(line 1018,col 46)",
        "(line 1020,col 9)-(line 1020,col 31)",
        "(line 1021,col 9)-(line 1021,col 31)",
        "(line 1022,col 9)-(line 1022,col 35)",
        "(line 1023,col 9)-(line 1023,col 36)",
        "(line 1024,col 9)-(line 1024,col 34)",
        "(line 1025,col 9)-(line 1044,col 9)",
        "(line 1046,col 9)-(line 1046,col 27)",
        "(line 1047,col 9)-(line 1048,col 26)",
        "(line 1049,col 9)-(line 1049,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.valueToAngle(double)",
      "begin_line": 1059,
      "end_line": 1063,
      "comment": "\r\n     * Translates a data value to an angle on the dial.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The angle on the dial.\r\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 51)",
        "(line 1061,col 9)-(line 1061,col 63)",
        "(line 1062,col 9)-(line 1062,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTicks(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1073,
      "end_line": 1078,
      "comment": "\r\n     * Draws the ticks that subdivide the overall range.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1077,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1087,
      "end_line": 1090,
      "comment": "\r\n     * Draws a tick.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, boolean)",
      "begin_line": 1100,
      "end_line": 1158,
      "comment": "\r\n     * Draws a tick on the dial.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the tick value.\r\n     * @param label  a flag that controls whether or not a value label is drawn.\r\n     ",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 48)",
        "(line 1105,col 9)-(line 1105,col 53)",
        "(line 1106,col 9)-(line 1106,col 53)",
        "(line 1108,col 9)-(line 1108,col 36)",
        "(line 1109,col 9)-(line 1109,col 44)",
        "(line 1111,col 9)-(line 1111,col 28)",
        "(line 1112,col 9)-(line 1112,col 28)",
        "(line 1114,col 9)-(line 1114,col 73)",
        "(line 1115,col 9)-(line 1115,col 37)",
        "(line 1117,col 9)-(line 1118,col 68)",
        "(line 1119,col 9)-(line 1120,col 68)",
        "(line 1122,col 9)-(line 1123,col 69)",
        "(line 1124,col 9)-(line 1125,col 69)",
        "(line 1127,col 9)-(line 1128,col 26)",
        "(line 1129,col 9)-(line 1129,col 22)",
        "(line 1131,col 9)-(line 1157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawValueLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1166,
      "end_line": 1181,
      "comment": "\r\n     * Draws the value label just below the center of the dial.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1167,col 35)",
        "(line 1168,col 9)-(line 1168,col 37)",
        "(line 1169,col 9)-(line 1169,col 37)",
        "(line 1170,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1177,col 44)",
        "(line 1178,col 9)-(line 1178,col 66)",
        "(line 1179,col 9)-(line 1180,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getPlotType()",
      "begin_line": 1188,
      "end_line": 1190,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1189,col 9)-(line 1189,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.zoom(double)",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the\r\n     * zoom operation.  In the case of a meter plot, it doesn\u0027t make sense to\r\n     * zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent   The zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.equals(java.lang.Object)",
      "begin_line": 1211,
      "end_line": 1277,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.  Note that the\r\n     * dataset is ignored for the purposes of testing equality.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1221,col 41)",
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1247,col 9)",
        "(line 1248,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1256,col 9)",
        "(line 1257,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1265,col 9)",
        "(line 1266,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1275,col 9)",
        "(line 1276,col 9)-(line 1276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1286,
      "end_line": 1294,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 36)",
        "(line 1288,col 9)-(line 1288,col 69)",
        "(line 1289,col 9)-(line 1289,col 66)",
        "(line 1290,col 9)-(line 1290,col 61)",
        "(line 1291,col 9)-(line 1291,col 60)",
        "(line 1292,col 9)-(line 1292,col 59)",
        "(line 1293,col 9)-(line 1293,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1304,
      "end_line": 1316,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 35)",
        "(line 1307,col 9)-(line 1307,col 69)",
        "(line 1308,col 9)-(line 1308,col 66)",
        "(line 1309,col 9)-(line 1309,col 61)",
        "(line 1310,col 9)-(line 1310,col 60)",
        "(line 1311,col 9)-(line 1311,col 59)",
        "(line 1312,col 9)-(line 1312,col 64)",
        "(line 1313,col 9)-(line 1315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clone()",
      "begin_line": 1328,
      "end_line": 1337,
      "comment": "\r\n     * Returns an independent copy (clone) of the plot.  The dataset is NOT\r\n     * cloned - both the original and the clone will have a reference to the\r\n     * same dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot cannot\r\n     *         be cloned.\r\n     ",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 52)",
        "(line 1330,col 9)-(line 1330,col 76)",
        "(line 1332,col 9)-(line 1332,col 66)",
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1336,col 21)"
      ]
    }
  ]
}