{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/MeterPlot.java",
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
      "begin_line": 133,
      "end_line": 1336,
      "comment": "\r\n * A plot that displays a single value in the form of a needle on a dial.\r\n * Defined ranges (for example, \u0027normal\u0027, \u0027warning\u0027 and \u0027critical\u0027) can be\r\n * highlighted on the dial.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAL_BACKGROUND_PAINT"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The default background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NEEDLE_PAINT"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The default needle paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_FONT"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The default value font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_PAINT"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The default value paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_METER_ANGLE"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The default meter angle. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BORDER_SIZE"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The default border size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CIRCLE_SIZE"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The default circle size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 160,
      "end_line": 161,
      "comment": " The default label font. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The dataset (contains a single value). "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The dial shape (background shape). "
    },
    {
      "type": "field",
      "varNames": [
        "meterAngle"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The dial extent (measured in degrees). "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The overall range of data values on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "tickSize"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The tick size. "
    },
    {
      "type": "field",
      "varNames": [
        "tickPaint"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The paint used to draw the ticks. "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The units displayed on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The font for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The paint for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBorder"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " A flag that controls whether or not the border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "dialOutlinePaint"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "dialBackgroundPaint"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The paint for the dial background. "
    },
    {
      "type": "field",
      "varNames": [
        "needlePaint"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The paint for the needle. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " A flag that controls whether or not the tick labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFormat"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The tick label format. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 215,
      "end_line": 217,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "intervals"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": "\r\n     * A (possibly empty) list of the {@link MeterInterval}s to be highlighted\r\n     * on the dial.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Creates a new plot with a default range of \u003ccode\u003e0\u003c/code\u003e to\r\n     * \u003ccode\u003e100\u003c/code\u003e and no value to display.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 238,
      "end_line": 256,
      "comment": "\r\n     * Creates a new plot that displays the value from the supplied dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 16)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 243,col 9)-(line 243,col 29)",
        "(line 244,col 9)-(line 244,col 37)",
        "(line 245,col 9)-(line 245,col 29)",
        "(line 246,col 9)-(line 246,col 58)",
        "(line 247,col 9)-(line 247,col 38)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 249,col 9)-(line 249,col 42)",
        "(line 250,col 9)-(line 250,col 58)",
        "(line 251,col 9)-(line 251,col 54)",
        "(line 252,col 9)-(line 252,col 56)",
        "(line 253,col 9)-(line 253,col 75)",
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 255,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialShape()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the dial shape.  The default is {@link DialShape#CIRCLE}).\r\n     *\r\n     * @return The dial shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDialShape(DialShape)\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialShape(org.jfree.chart.plot.DialShape)",
      "begin_line": 277,
      "end_line": 283,
      "comment": "\r\n     * Sets the dial shape and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDialShape()\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 27)",
        "(line 282,col 9)-(line 282,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getMeterAngle()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns the meter angle in degrees.  This defines, in part, the shape\r\n     * of the dial.  The default is 270 degrees.\r\n     *\r\n     * @return The meter angle (in degrees).\r\n     *\r\n     * @see #setMeterAngle(int)\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setMeterAngle(int)",
      "begin_line": 305,
      "end_line": 312,
      "comment": "\r\n     * Sets the angle (in degrees) for the whole range of the dial and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param angle  the angle (in degrees, in the range 1-360).\r\n     *\r\n     * @see #getMeterAngle()\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getRange()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Returns the overall range for the dial.\r\n     *\r\n     * @return The overall range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setRange(org.jfree.data.Range)",
      "begin_line": 334,
      "end_line": 344,
      "comment": "\r\n     * Sets the range for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted and zero-length\r\n     *               ranges not permitted).\r\n     *\r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 27)",
        "(line 343,col 9)-(line 343,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickSize()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\r\n     * Returns the tick size (the interval between ticks on the dial).\r\n     *\r\n     * @return The tick size.\r\n     *\r\n     * @see #setTickSize(double)\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickSize(double)",
      "begin_line": 365,
      "end_line": 371,
      "comment": "\r\n     * Sets the tick size and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param size  the tick size (must be \u003e 0).\r\n     *\r\n     * @see #getTickSize()\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 29)",
        "(line 370,col 9)-(line 370,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickPaint()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns the paint used to draw the ticks around the dial.\r\n     *\r\n     * @return The paint used to draw the ticks around the dial (never\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickPaint(java.awt.Paint)",
      "begin_line": 393,
      "end_line": 399,
      "comment": "\r\n     * Sets the paint used to draw the tick labels around the dial and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickPaint()\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 31)",
        "(line 398,col 9)-(line 398,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getUnits()",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns a string describing the units for the dial.\r\n     *\r\n     * @return The units (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setUnits(String)\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setUnits(java.lang.String)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\r\n     * Sets the units for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param units  the units (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 27)",
        "(line 422,col 9)-(line 422,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getNeedlePaint()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the paint for the needle.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setNeedlePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setNeedlePaint(java.awt.Paint)",
      "begin_line": 444,
      "end_line": 450,
      "comment": "\r\n     * Sets the paint used to display the needle and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getNeedlePaint()\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 33)",
        "(line 449,col 9)-(line 449,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelsVisible()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\r\n     * Returns the flag that determines whether or not tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setTickLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelsVisible(boolean)",
      "begin_line": 471,
      "end_line": 476,
      "comment": "\r\n     * Sets the flag that controls whether or not the tick labels are visible\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #getTickLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 475,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFont()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\r\n     * Returns the tick label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFont(java.awt.Font)",
      "begin_line": 497,
      "end_line": 505,
      "comment": "\r\n     * Sets the tick label font and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelFont()\r\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelPaint()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\r\n     * Returns the tick label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 526,
      "end_line": 534,
      "comment": "\r\n     * Sets the tick label paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFormat()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\r\n     * Returns the tick label format.\r\n     *\r\n     * @return The tick label format (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTickLabelFormat(NumberFormat)\r\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFormat(java.text.NumberFormat)",
      "begin_line": 555,
      "end_line": 561,
      "comment": "\r\n     * Sets the format for the tick labels and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param format  the format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTickLabelFormat()\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 38)",
        "(line 560,col 9)-(line 560,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValueFont()",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\r\n     * Returns the font for the value label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValueFont(java.awt.Font)",
      "begin_line": 582,
      "end_line": 588,
      "comment": "\r\n     * Sets the font used to display the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 30)",
        "(line 587,col 9)-(line 587,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValuePaint()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\r\n     * Returns the paint for the value label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\r\n     * Sets the paint used to display the value label and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 32)",
        "(line 614,col 9)-(line 614,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialBackgroundPaint()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\r\n     * Returns the paint for the dial background.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDialBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialBackgroundPaint(java.awt.Paint)",
      "begin_line": 636,
      "end_line": 639,
      "comment": "\r\n     * Sets the paint used to fill the dial background.  Set this to\r\n     * \u003ccode\u003enull\u003c/code\u003e for no background.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDialBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 41)",
        "(line 638,col 9)-(line 638,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDrawBorder()",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\r\n     * Returns a flag that controls whether or not a rectangular border is\r\n     * drawn around the plot area.\r\n     *\r\n     * @return A flag.\r\n     *\r\n     * @see #setDrawBorder(boolean)\r\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDrawBorder(boolean)",
      "begin_line": 662,
      "end_line": 666,
      "comment": "\r\n     * Sets the flag that controls whether or not a rectangular border is drawn\r\n     * around the plot area and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param draw  the flag.\r\n     *\r\n     * @see #getDrawBorder()\r\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 31)",
        "(line 665,col 9)-(line 665,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialOutlinePaint()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\r\n     * Returns the dial outline paint.\r\n     *\r\n     * @return The paint.\r\n     *\r\n     * @see #setDialOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialOutlinePaint(java.awt.Paint)",
      "begin_line": 687,
      "end_line": 690,
      "comment": "\r\n     * Sets the dial outline paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint.\r\n     *\r\n     * @see #getDialOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 38)",
        "(line 689,col 9)-(line 689,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDataset()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 711,
      "end_line": 731,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there\r\n     * is one, and triggers a {@link PlotChangeEvent}.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 45)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 721,col 9)-(line 721,col 31)",
        "(line 722,col 9)-(line 725,col 9)",
        "(line 728,col 9)-(line 728,col 73)",
        "(line 729,col 9)-(line 729,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getIntervals()",
      "begin_line": 740,
      "end_line": 742,
      "comment": "\r\n     * Returns an unmodifiable list of the intervals for the plot.\r\n     *\r\n     * @return A list.\r\n     *\r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.addInterval(org.jfree.chart.plot.MeterInterval)",
      "begin_line": 753,
      "end_line": 759,
      "comment": "\r\n     * Adds an interval and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param interval  the interval (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getIntervals()\r\n     * @see #clearIntervals()\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 37)",
        "(line 758,col 9)-(line 758,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clearIntervals()",
      "begin_line": 767,
      "end_line": 770,
      "comment": "\r\n     * Clears the intervals for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 31)",
        "(line 769,col 9)-(line 769,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getLegendItems()",
      "begin_line": 777,
      "end_line": 793,
      "comment": "\r\n     * Returns an item for each interval.\r\n     *\r\n     * @return A collection of legend items.\r\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 65)",
        "(line 779,col 9)-(line 779,col 54)",
        "(line 780,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 805,
      "end_line": 931,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 814,col 9)-(line 814,col 45)",
        "(line 815,col 9)-(line 815,col 26)",
        "(line 817,col 9)-(line 818,col 38)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 826,col 9)-(line 826,col 57)",
        "(line 827,col 9)-(line 827,col 55)",
        "(line 828,col 9)-(line 828,col 56)",
        "(line 829,col 9)-(line 829,col 54)",
        "(line 830,col 9)-(line 830,col 56)",
        "(line 831,col 9)-(line 833,col 47)",
        "(line 835,col 9)-(line 835,col 50)",
        "(line 836,col 9)-(line 836,col 54)",
        "(line 837,col 9)-(line 837,col 54)",
        "(line 838,col 9)-(line 838,col 25)",
        "(line 839,col 9)-(line 839,col 25)",
        "(line 841,col 9)-(line 842,col 24)",
        "(line 844,col 9)-(line 846,col 69)",
        "(line 848,col 9)-(line 848,col 53)",
        "(line 849,col 9)-(line 849,col 53)",
        "(line 852,col 9)-(line 852,col 41)",
        "(line 853,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArcForInterval(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.MeterInterval)",
      "begin_line": 940,
      "end_line": 960,
      "comment": "\r\n     * Draws the arc to represent an interval.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the drawing area.\r\n     * @param interval  the interval.\r\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 62)",
        "(line 944,col 9)-(line 944,col 62)",
        "(line 945,col 9)-(line 945,col 56)",
        "(line 946,col 9)-(line 946,col 59)",
        "(line 947,col 9)-(line 947,col 62)",
        "(line 949,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 972,
      "end_line": 994,
      "comment": "\r\n     * Draws an arc.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 51)",
        "(line 976,col 9)-(line 976,col 49)",
        "(line 977,col 9)-(line 977,col 46)",
        "(line 979,col 9)-(line 979,col 31)",
        "(line 980,col 9)-(line 980,col 31)",
        "(line 981,col 9)-(line 981,col 35)",
        "(line 982,col 9)-(line 982,col 36)",
        "(line 983,col 9)-(line 983,col 27)",
        "(line 984,col 9)-(line 984,col 29)",
        "(line 986,col 9)-(line 992,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.fillArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, boolean)",
      "begin_line": 1007,
      "end_line": 1047,
      "comment": "\r\n     * Fills an arc on the dial between the given values.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum data value.\r\n     * @param maxValue  the maximum data value.\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dial  a flag that indicates whether the arc represents the whole\r\n     *              dial.\r\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 51)",
        "(line 1014,col 9)-(line 1014,col 49)",
        "(line 1015,col 9)-(line 1015,col 46)",
        "(line 1017,col 9)-(line 1017,col 31)",
        "(line 1018,col 9)-(line 1018,col 31)",
        "(line 1019,col 9)-(line 1019,col 35)",
        "(line 1020,col 9)-(line 1020,col 36)",
        "(line 1021,col 9)-(line 1021,col 34)",
        "(line 1022,col 9)-(line 1041,col 9)",
        "(line 1043,col 9)-(line 1043,col 27)",
        "(line 1044,col 9)-(line 1045,col 26)",
        "(line 1046,col 9)-(line 1046,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.valueToAngle(double)",
      "begin_line": 1056,
      "end_line": 1060,
      "comment": "\r\n     * Translates a data value to an angle on the dial.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The angle on the dial.\r\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 51)",
        "(line 1058,col 9)-(line 1058,col 63)",
        "(line 1059,col 9)-(line 1059,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTicks(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1070,
      "end_line": 1075,
      "comment": "\r\n     * Draws the ticks that subdivide the overall range.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1074,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1084,
      "end_line": 1087,
      "comment": "\r\n     * Draws a tick.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 1086,col 9)-(line 1086,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, boolean)",
      "begin_line": 1097,
      "end_line": 1155,
      "comment": "\r\n     * Draws a tick on the dial.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the tick value.\r\n     * @param label  a flag that controls whether or not a value label is drawn.\r\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 48)",
        "(line 1102,col 9)-(line 1102,col 53)",
        "(line 1103,col 9)-(line 1103,col 53)",
        "(line 1105,col 9)-(line 1105,col 36)",
        "(line 1106,col 9)-(line 1106,col 44)",
        "(line 1108,col 9)-(line 1108,col 28)",
        "(line 1109,col 9)-(line 1109,col 28)",
        "(line 1111,col 9)-(line 1111,col 73)",
        "(line 1112,col 9)-(line 1112,col 37)",
        "(line 1114,col 9)-(line 1115,col 68)",
        "(line 1116,col 9)-(line 1117,col 68)",
        "(line 1119,col 9)-(line 1120,col 69)",
        "(line 1121,col 9)-(line 1122,col 69)",
        "(line 1124,col 9)-(line 1125,col 26)",
        "(line 1126,col 9)-(line 1126,col 22)",
        "(line 1128,col 9)-(line 1154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawValueLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1163,
      "end_line": 1178,
      "comment": "\r\n     * Draws the value label just below the center of the dial.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 35)",
        "(line 1165,col 9)-(line 1165,col 37)",
        "(line 1166,col 9)-(line 1166,col 37)",
        "(line 1167,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1174,col 44)",
        "(line 1175,col 9)-(line 1175,col 66)",
        "(line 1176,col 9)-(line 1177,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getPlotType()",
      "begin_line": 1185,
      "end_line": 1187,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1186,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.zoom(double)",
      "begin_line": 1196,
      "end_line": 1198,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the\r\n     * zoom operation.  In the case of a meter plot, it doesn\u0027t make sense to\r\n     * zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent   The zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.equals(java.lang.Object)",
      "begin_line": 1208,
      "end_line": 1274,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.  Note that the\r\n     * dataset is ignored for the purposes of testing equality.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1211,col 9)",
        "(line 1212,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1218,col 41)",
        "(line 1219,col 9)-(line 1221,col 9)",
        "(line 1222,col 9)-(line 1224,col 9)",
        "(line 1225,col 9)-(line 1227,col 9)",
        "(line 1228,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1238,col 9)",
        "(line 1239,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1244,col 9)",
        "(line 1245,col 9)-(line 1247,col 9)",
        "(line 1248,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1253,col 9)",
        "(line 1254,col 9)-(line 1256,col 9)",
        "(line 1257,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1262,col 9)",
        "(line 1263,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1283,
      "end_line": 1291,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 36)",
        "(line 1285,col 9)-(line 1285,col 69)",
        "(line 1286,col 9)-(line 1286,col 66)",
        "(line 1287,col 9)-(line 1287,col 61)",
        "(line 1288,col 9)-(line 1288,col 60)",
        "(line 1289,col 9)-(line 1289,col 59)",
        "(line 1290,col 9)-(line 1290,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1301,
      "end_line": 1313,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 35)",
        "(line 1304,col 9)-(line 1304,col 69)",
        "(line 1305,col 9)-(line 1305,col 66)",
        "(line 1306,col 9)-(line 1306,col 61)",
        "(line 1307,col 9)-(line 1307,col 60)",
        "(line 1308,col 9)-(line 1308,col 59)",
        "(line 1309,col 9)-(line 1309,col 64)",
        "(line 1310,col 9)-(line 1312,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clone()",
      "begin_line": 1325,
      "end_line": 1334,
      "comment": "\r\n     * Returns an independent copy (clone) of the plot.  The dataset is NOT\r\n     * cloned - both the original and the clone will have a reference to the\r\n     * same dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if some component of the plot cannot\r\n     *         be cloned.\r\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1326,col 52)",
        "(line 1327,col 9)-(line 1327,col 76)",
        "(line 1329,col 9)-(line 1329,col 66)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1333,col 21)"
      ]
    }
  ]
}