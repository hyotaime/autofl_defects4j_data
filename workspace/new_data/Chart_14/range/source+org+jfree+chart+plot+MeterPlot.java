{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/MeterPlot.java",
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
      "begin_line": 132,
      "end_line": 1334,
      "comment": "\r\n * A plot that displays a single value in the form of a needle on a dial.  \r\n * Defined ranges (for example, \u0027normal\u0027, \u0027warning\u0027 and \u0027critical\u0027) can be\r\n * highlighted on the dial.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAL_BACKGROUND_PAINT"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The default background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NEEDLE_PAINT"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The default needle paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_FONT"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The default value font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALUE_PAINT"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The default value paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_METER_ANGLE"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The default meter angle. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BORDER_SIZE"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The default border size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CIRCLE_SIZE"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The default circle size. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FONT"
      ],
      "begin_line": 159,
      "end_line": 160,
      "comment": " The default label font. "
    },
    {
      "type": "field",
      "varNames": [
        "dataset"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The dataset (contains a single value). "
    },
    {
      "type": "field",
      "varNames": [
        "shape"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The dial shape (background shape). "
    },
    {
      "type": "field",
      "varNames": [
        "meterAngle"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The dial extent (measured in degrees). "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The overall range of data values on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "tickSize"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The tick size. "
    },
    {
      "type": "field",
      "varNames": [
        "tickPaint"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The paint used to draw the ticks. "
    },
    {
      "type": "field",
      "varNames": [
        "units"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The units displayed on the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valueFont"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The font for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "valuePaint"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The paint for the value displayed in the center of the dial. "
    },
    {
      "type": "field",
      "varNames": [
        "drawBorder"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " A flag that controls whether or not the border is drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "dialOutlinePaint"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "dialBackgroundPaint"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " The paint for the dial background. "
    },
    {
      "type": "field",
      "varNames": [
        "needlePaint"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " The paint for the needle. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelsVisible"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " A flag that controls whether or not the tick labels are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFont"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " The tick label font. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelPaint"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The tick label paint. "
    },
    {
      "type": "field",
      "varNames": [
        "tickLabelFormat"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The tick label format. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 214,
      "end_line": 215,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "intervals"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " \r\n     * A (possibly empty) list of the {@link MeterInterval}s to be highlighted \r\n     * on the dial. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Creates a new plot with a default range of \u003ccode\u003e0\u003c/code\u003e to \r\n     * \u003ccode\u003e100\u003c/code\u003e and no value to display.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.MeterPlot.MeterPlot(org.jfree.data.general.ValueDataset)",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\r\n     * Creates a new plot that displays the value from the supplied dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 16)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 46)",
        "(line 240,col 9)-(line 240,col 43)",
        "(line 241,col 9)-(line 241,col 29)",
        "(line 242,col 9)-(line 242,col 37)",
        "(line 243,col 9)-(line 243,col 29)",
        "(line 244,col 9)-(line 244,col 58)",
        "(line 245,col 9)-(line 245,col 38)",
        "(line 246,col 9)-(line 246,col 58)",
        "(line 247,col 9)-(line 247,col 42)",
        "(line 248,col 9)-(line 248,col 58)",
        "(line 249,col 9)-(line 249,col 54)",
        "(line 250,col 9)-(line 250,col 56)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 253,col 9)-(line 253,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialShape()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\r\n     * Returns the dial shape.  The default is {@link DialShape#CIRCLE}).\r\n     * \r\n     * @return The dial shape (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDialShape(DialShape)\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialShape(org.jfree.chart.plot.DialShape)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\r\n     * Sets the dial shape and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDialShape()\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 27)",
        "(line 280,col 9)-(line 280,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getMeterAngle()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns the meter angle in degrees.  This defines, in part, the shape\r\n     * of the dial.  The default is 270 degrees.\r\n     *\r\n     * @return The meter angle (in degrees).\r\n     * \r\n     * @see #setMeterAngle(int)\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setMeterAngle(int)",
      "begin_line": 303,
      "end_line": 310,
      "comment": "\r\n     * Sets the angle (in degrees) for the whole range of the dial and sends \r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param angle  the angle (in degrees, in the range 1-360).\r\n     * \r\n     * @see #getMeterAngle()\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 32)",
        "(line 309,col 9)-(line 309,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getRange()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\r\n     * Returns the overall range for the dial.\r\n     * \r\n     * @return The overall range (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRange(Range)\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setRange(org.jfree.data.Range)",
      "begin_line": 332,
      "end_line": 342,
      "comment": "\r\n     * Sets the range for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param range  the range (\u003ccode\u003enull\u003c/code\u003e not permitted and zero-length\r\n     *               ranges not permitted).\r\n     *             \r\n     * @see #getRange()\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 27)",
        "(line 341,col 9)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickSize()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns the tick size (the interval between ticks on the dial).\r\n     * \r\n     * @return The tick size.\r\n     * \r\n     * @see #setTickSize(double)\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickSize(double)",
      "begin_line": 363,
      "end_line": 369,
      "comment": "\r\n     * Sets the tick size and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param size  the tick size (must be \u003e 0).\r\n     * \r\n     * @see #getTickSize()\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 29)",
        "(line 368,col 9)-(line 368,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickPaint()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Returns the paint used to draw the ticks around the dial. \r\n     * \r\n     * @return The paint used to draw the ticks around the dial (never \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *         \r\n     * @see #setTickPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickPaint(java.awt.Paint)",
      "begin_line": 391,
      "end_line": 397,
      "comment": "\r\n     * Sets the paint used to draw the tick labels around the dial and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickPaint()\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 31)",
        "(line 396,col 9)-(line 396,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getUnits()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\r\n     * Returns a string describing the units for the dial.\r\n     * \r\n     * @return The units (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setUnits(String)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setUnits(java.lang.String)",
      "begin_line": 418,
      "end_line": 421,
      "comment": "\r\n     * Sets the units for the dial and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @param units  the units (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getUnits()\r\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 27)",
        "(line 420,col 9)-(line 420,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getNeedlePaint()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\r\n     * Returns the paint for the needle.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setNeedlePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setNeedlePaint(java.awt.Paint)",
      "begin_line": 442,
      "end_line": 448,
      "comment": "\r\n     * Sets the paint used to display the needle and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getNeedlePaint()\r\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 33)",
        "(line 447,col 9)-(line 447,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelsVisible()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\r\n     * Returns the flag that determines whether or not tick labels are visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setTickLabelsVisible(boolean)\r\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelsVisible(boolean)",
      "begin_line": 469,
      "end_line": 474,
      "comment": "\r\n     * Sets the flag that controls whether or not the tick labels are visible\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #getTickLabelsVisible()\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFont()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\r\n     * Returns the tick label font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelFont(Font)\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFont(java.awt.Font)",
      "begin_line": 495,
      "end_line": 503,
      "comment": "\r\n     * Sets the tick label font and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelFont()\r\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelPaint()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\r\n     * Returns the tick label paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelPaint(java.awt.Paint)",
      "begin_line": 524,
      "end_line": 532,
      "comment": "\r\n     * Sets the tick label paint and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelPaint()\r\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 531,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getTickLabelFormat()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\r\n     * Returns the tick label format.\r\n     * \r\n     * @return The tick label format (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTickLabelFormat(NumberFormat)\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setTickLabelFormat(java.text.NumberFormat)",
      "begin_line": 553,
      "end_line": 559,
      "comment": "\r\n     * Sets the format for the tick labels and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param format  the format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTickLabelFormat()\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 38)",
        "(line 558,col 9)-(line 558,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValueFont()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\r\n     * Returns the font for the value label.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setValueFont(Font)\r\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValueFont(java.awt.Font)",
      "begin_line": 580,
      "end_line": 586,
      "comment": "\r\n     * Sets the font used to display the value label and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValueFont()\r\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 30)",
        "(line 585,col 9)-(line 585,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getValuePaint()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "\r\n     * Returns the paint for the value label.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setValuePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setValuePaint(java.awt.Paint)",
      "begin_line": 607,
      "end_line": 613,
      "comment": "\r\n     * Sets the paint used to display the value label and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValuePaint()\r\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 32)",
        "(line 612,col 9)-(line 612,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialBackgroundPaint()",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\r\n     * Returns the paint for the dial background.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDialBackgroundPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialBackgroundPaint(java.awt.Paint)",
      "begin_line": 634,
      "end_line": 637,
      "comment": "\r\n     * Sets the paint used to fill the dial background.  Set this to \r\n     * \u003ccode\u003enull\u003c/code\u003e for no background.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDialBackgroundPaint()\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 41)",
        "(line 636,col 9)-(line 636,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDrawBorder()",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\r\n     * Returns a flag that controls whether or not a rectangular border is \r\n     * drawn around the plot area.\r\n     *\r\n     * @return A flag.\r\n     * \r\n     * @see #setDrawBorder(boolean)\r\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDrawBorder(boolean)",
      "begin_line": 660,
      "end_line": 664,
      "comment": "\r\n     * Sets the flag that controls whether or not a rectangular border is drawn\r\n     * around the plot area and sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param draw  the flag.\r\n     * \r\n     * @see #getDrawBorder()\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 31)",
        "(line 663,col 9)-(line 663,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDialOutlinePaint()",
      "begin_line": 673,
      "end_line": 675,
      "comment": "\r\n     * Returns the dial outline paint.\r\n     *\r\n     * @return The paint.\r\n     * \r\n     * @see #setDialOutlinePaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDialOutlinePaint(java.awt.Paint)",
      "begin_line": 685,
      "end_line": 688,
      "comment": "\r\n     * Sets the dial outline paint and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param paint  the paint.\r\n     * \r\n     * @see #getDialOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 38)",
        "(line 687,col 9)-(line 687,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getDataset()",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\r\n     * Returns the dataset for the plot.\r\n     * \r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(ValueDataset)\r\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.setDataset(org.jfree.data.general.ValueDataset)",
      "begin_line": 709,
      "end_line": 729,
      "comment": "\r\n     * Sets the dataset for the plot, replacing the existing dataset if there \r\n     * is one, and triggers a {@link PlotChangeEvent}.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 45)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 719,col 9)-(line 719,col 31)",
        "(line 720,col 9)-(line 723,col 9)",
        "(line 726,col 9)-(line 726,col 73)",
        "(line 727,col 9)-(line 727,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getIntervals()",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\r\n     * Returns an unmodifiable list of the intervals for the plot.\r\n     * \r\n     * @return A list.\r\n     * \r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.addInterval(org.jfree.chart.plot.MeterInterval)",
      "begin_line": 751,
      "end_line": 757,
      "comment": "\r\n     * Adds an interval and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param interval  the interval (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getIntervals()\r\n     * @see #clearIntervals()\r\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 37)",
        "(line 756,col 9)-(line 756,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clearIntervals()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "\r\n     * Clears the intervals for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \r\n     * @see #addInterval(MeterInterval)\r\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 31)",
        "(line 767,col 9)-(line 767,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getLegendItems()",
      "begin_line": 775,
      "end_line": 791,
      "comment": "\r\n     * Returns an item for each interval.\r\n     *\r\n     * @return A collection of legend items.\r\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 65)",
        "(line 777,col 9)-(line 777,col 54)",
        "(line 778,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 803,
      "end_line": 929,
      "comment": "\r\n     * Draws the plot on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area within which the plot should be drawn.\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param parentState  the state from the parent plot, if there is one.\r\n     * @param info  collects info about the drawing.\r\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 809,col 9)",
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 813,col 26)",
        "(line 815,col 9)-(line 816,col 38)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 824,col 9)-(line 824,col 57)",
        "(line 825,col 9)-(line 825,col 55)",
        "(line 826,col 9)-(line 826,col 56)",
        "(line 827,col 9)-(line 827,col 54)",
        "(line 828,col 9)-(line 828,col 56)",
        "(line 829,col 9)-(line 831,col 47)",
        "(line 833,col 9)-(line 833,col 50)",
        "(line 834,col 9)-(line 834,col 54)",
        "(line 835,col 9)-(line 835,col 54)",
        "(line 836,col 9)-(line 836,col 25)",
        "(line 837,col 9)-(line 837,col 25)",
        "(line 839,col 9)-(line 840,col 24)",
        "(line 842,col 9)-(line 844,col 69)",
        "(line 846,col 9)-(line 846,col 53)",
        "(line 847,col 9)-(line 847,col 53)",
        "(line 850,col 9)-(line 850,col 41)",
        "(line 851,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 927,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArcForInterval(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.MeterInterval)",
      "begin_line": 938,
      "end_line": 958,
      "comment": "\r\n     * Draws the arc to represent an interval.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the drawing area.\r\n     * @param interval  the interval.\r\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 62)",
        "(line 942,col 9)-(line 942,col 62)",
        "(line 943,col 9)-(line 943,col 56)",
        "(line 944,col 9)-(line 944,col 59)",
        "(line 945,col 9)-(line 945,col 62)",
        "(line 947,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 970,
      "end_line": 992,
      "comment": "\r\n     * Draws an arc.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     * @param paint  the paint.\r\n     * @param stroke  the stroke.\r\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 51)",
        "(line 974,col 9)-(line 974,col 49)",
        "(line 975,col 9)-(line 975,col 46)",
        "(line 977,col 9)-(line 977,col 31)",
        "(line 978,col 9)-(line 978,col 31)",
        "(line 979,col 9)-(line 979,col 35)",
        "(line 980,col 9)-(line 980,col 36)",
        "(line 981,col 9)-(line 981,col 27)",
        "(line 982,col 9)-(line 982,col 29)",
        "(line 984,col 9)-(line 990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.fillArc(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double, java.awt.Paint, boolean)",
      "begin_line": 1005,
      "end_line": 1045,
      "comment": "\r\n     * Fills an arc on the dial between the given values.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     * @param minValue  the minimum data value.\r\n     * @param maxValue  the maximum data value.\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dial  a flag that indicates whether the arc represents the whole \r\n     *              dial.\r\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1011,col 51)",
        "(line 1012,col 9)-(line 1012,col 49)",
        "(line 1013,col 9)-(line 1013,col 46)",
        "(line 1015,col 9)-(line 1015,col 31)",
        "(line 1016,col 9)-(line 1016,col 31)",
        "(line 1017,col 9)-(line 1017,col 35)",
        "(line 1018,col 9)-(line 1018,col 36)",
        "(line 1019,col 9)-(line 1019,col 34)",
        "(line 1020,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 27)",
        "(line 1042,col 9)-(line 1043,col 26)",
        "(line 1044,col 9)-(line 1044,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.valueToAngle(double)",
      "begin_line": 1054,
      "end_line": 1058,
      "comment": "\r\n     * Translates a data value to an angle on the dial.\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @return The angle on the dial.\r\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1055,col 51)",
        "(line 1056,col 9)-(line 1056,col 63)",
        "(line 1057,col 9)-(line 1057,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTicks(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 1068,
      "end_line": 1073,
      "comment": "\r\n     * Draws the ticks that subdivide the overall range.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param minValue  the minimum value.\r\n     * @param maxValue  the maximum value.\r\n     ",
      "child_ranges": [
        "(line 1070,col 9)-(line 1072,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double)",
      "begin_line": 1082,
      "end_line": 1085,
      "comment": "\r\n     * Draws a tick.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawTick(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, boolean)",
      "begin_line": 1095,
      "end_line": 1153,
      "comment": "\r\n     * Draws a tick on the dial.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param meterArea  the meter area.\r\n     * @param value  the tick value.\r\n     * @param label  a flag that controls whether or not a value label is drawn.\r\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1098,col 48)",
        "(line 1100,col 9)-(line 1100,col 53)",
        "(line 1101,col 9)-(line 1101,col 53)",
        "(line 1103,col 9)-(line 1103,col 36)",
        "(line 1104,col 9)-(line 1104,col 44)",
        "(line 1106,col 9)-(line 1106,col 28)",
        "(line 1107,col 9)-(line 1107,col 28)",
        "(line 1109,col 9)-(line 1109,col 73)",
        "(line 1110,col 9)-(line 1110,col 37)",
        "(line 1112,col 9)-(line 1113,col 68)",
        "(line 1114,col 9)-(line 1115,col 68)",
        "(line 1117,col 9)-(line 1118,col 69)",
        "(line 1119,col 9)-(line 1120,col 69)",
        "(line 1122,col 9)-(line 1123,col 26)",
        "(line 1124,col 9)-(line 1124,col 22)",
        "(line 1126,col 9)-(line 1152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.drawValueLabel(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 1161,
      "end_line": 1176,
      "comment": "\r\n     * Draws the value label just below the center of the dial.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area.\r\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 35)",
        "(line 1163,col 9)-(line 1163,col 37)",
        "(line 1164,col 9)-(line 1164,col 37)",
        "(line 1165,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 44)",
        "(line 1173,col 9)-(line 1173,col 66)",
        "(line 1174,col 9)-(line 1175,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.getPlotType()",
      "begin_line": 1183,
      "end_line": 1185,
      "comment": "\r\n     * Returns a short string describing the type of plot.\r\n     *\r\n     * @return A string describing the type of plot.\r\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.zoom(double)",
      "begin_line": 1194,
      "end_line": 1196,
      "comment": "\r\n     * A zoom method that does nothing.  Plots are required to support the \r\n     * zoom operation.  In the case of a meter plot, it doesn\u0027t make sense to \r\n     * zoom in or out, so the method is empty.\r\n     *\r\n     * @param percent   The zoom percentage.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.equals(java.lang.Object)",
      "begin_line": 1206,
      "end_line": 1272,
      "comment": "\r\n     * Tests the plot for equality with an arbitrary object.  Note that the \r\n     * dataset is ignored for the purposes of testing equality.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1210,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 41)",
        "(line 1217,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1222,col 9)",
        "(line 1223,col 9)-(line 1225,col 9)",
        "(line 1226,col 9)-(line 1229,col 9)",
        "(line 1230,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1248,col 9)",
        "(line 1249,col 9)-(line 1251,col 9)",
        "(line 1252,col 9)-(line 1254,col 9)",
        "(line 1255,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1260,col 9)",
        "(line 1261,col 9)-(line 1264,col 9)",
        "(line 1265,col 9)-(line 1267,col 9)",
        "(line 1268,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 1281,
      "end_line": 1289,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 36)",
        "(line 1283,col 9)-(line 1283,col 69)",
        "(line 1284,col 9)-(line 1284,col 66)",
        "(line 1285,col 9)-(line 1285,col 61)",
        "(line 1286,col 9)-(line 1286,col 60)",
        "(line 1287,col 9)-(line 1287,col 59)",
        "(line 1288,col 9)-(line 1288,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 1299,
      "end_line": 1311,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 35)",
        "(line 1302,col 9)-(line 1302,col 69)",
        "(line 1303,col 9)-(line 1303,col 66)",
        "(line 1304,col 9)-(line 1304,col 61)",
        "(line 1305,col 9)-(line 1305,col 60)",
        "(line 1306,col 9)-(line 1306,col 59)",
        "(line 1307,col 9)-(line 1307,col 64)",
        "(line 1308,col 9)-(line 1310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.MeterPlot.clone()",
      "begin_line": 1323,
      "end_line": 1332,
      "comment": " \r\n     * Returns an independent copy (clone) of the plot.  The dataset is NOT \r\n     * cloned - both the original and the clone will have a reference to the\r\n     * same dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if some component of the plot cannot\r\n     *         be cloned.\r\n     ",
      "child_ranges": [
        "(line 1324,col 9)-(line 1324,col 52)",
        "(line 1325,col 9)-(line 1325,col 76)",
        "(line 1327,col 9)-(line 1327,col 66)",
        "(line 1328,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1331,col 21)"
      ]
    }
  ]
}