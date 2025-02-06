{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/CandlestickRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CandlestickRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 137,
      "end_line": 973,
      "comment": "\r\n * A renderer that draws candlesticks on an {@link XYPlot} (requires a\r\n * {@link OHLCDataset}).  The example shown here is generated\r\n * by the \u003ccode\u003eCandlestickChartDemo1.java\u003c/code\u003e program included in the\r\n * JFreeChart demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/CandlestickRendererSample.png\"\r\n * alt\u003d\"CandlestickRendererSample.png\" /\u003e\r\n * \u003cP\u003e\r\n * This renderer does not include code to calculate the crosshair point for the\r\n * plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_AVERAGE"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The average width method. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_SMALLEST"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The smallest width method. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_INTERVALDATA"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The interval data method. "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthMethod"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The method of automatically calculating the candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthFactor"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\r\n     * The number (generally between 0.0 and 1.0) by which the available space\r\n     * automatically calculated for the candles will be multiplied to determine\r\n     * the actual width to use.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthGap"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The minimum gap between one candle and the next "
    },
    {
      "type": "field",
      "varNames": [
        "candleWidth"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCandleWidthInMilliseconds"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The maximum candlewidth in milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCandleWidth"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Temporary storage for the maximum candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "upPaint"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": "\r\n     * The paint used to fill the candle when the price moved up from open to\r\n     * close.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "downPaint"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\r\n     * The paint used to fill the candle when the price moved down from open\r\n     * to close.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawVolume"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " A flag controlling whether or not volume bars are drawn on the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "volumePaint"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\r\n     * The paint used to fill the volume bars (if they are visible).  Once\r\n     * initialised, this field should never be set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxVolume"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Temporary storage for the maximum volume. "
    },
    {
      "type": "field",
      "varNames": [
        "useOutlinePaint"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\r\n     * A flag that controls whether or not the renderer\u0027s outline paint is\r\n     * used to draw the outline of the candlestick.  The default value is\r\n     * \u003ccode\u003efalse\u003c/code\u003e to avoid a change of behaviour for existing code.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer(double)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the candle width if you prefer the width to be calculated\r\n     * automatically.\r\n     *\r\n     * @param candleWidth  The candle width.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer(double, boolean, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 240,
      "end_line": 251,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the candle width if you prefer the width to be calculated\r\n     * automatically.\r\n     *\r\n     * @param candleWidth  the candle width.\r\n     * @param drawVolume  a flag indicating whether or not volume bars should\r\n     *                    be drawn.\r\n     * @param toolTipGenerator  the tool tip generator. \u003ccode\u003enull\u003c/code\u003e is\r\n     *                          none.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 16)",
        "(line 243,col 9)-(line 243,col 50)",
        "(line 244,col 9)-(line 244,col 39)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 38)",
        "(line 247,col 9)-(line 247,col 35)",
        "(line 248,col 9)-(line 248,col 35)",
        "(line 249,col 9)-(line 249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getCandleWidth()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the width of each candle.\r\n     *\r\n     * @return The candle width.\r\n     *\r\n     * @see #setCandleWidth(double)\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setCandleWidth(double)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\r\n     * Sets the candle width and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.\r\n     * \u003cP\u003e\r\n     * If you set the width to a negative value, the renderer will calculate\r\n     * the candle width automatically based on the space available on the chart.\r\n     *\r\n     * @param width  The width.\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getMaxCandleWidthInMilliseconds()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns the maximum width (in milliseconds) of each candle.\r\n     *\r\n     * @return The maximum candle width in milliseconds.\r\n     *\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setMaxCandleWidthInMilliseconds(double)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\r\n     * Sets the maximum candle width (in milliseconds) and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param millis  The maximum width.\r\n     *\r\n     * @see #getMaxCandleWidthInMilliseconds()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 51)",
        "(line 309,col 9)-(line 309,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthMethod()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\r\n     * Returns the method of automatically calculating the candle width.\r\n     *\r\n     * @return The method of automatically calculating the candle width.\r\n     *\r\n     * @see #setAutoWidthMethod(int)\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthMethod(int)",
      "begin_line": 349,
      "end_line": 354,
      "comment": "\r\n     * Sets the method of automatically calculating the candle width and\r\n     * sends a {@link RendererChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_AVERAGE\u003c/code\u003e: Divides the entire display (ignoring\r\n     * scale factor) by the number of items, and uses this as the available\r\n     * width.\u003cbr\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_SMALLEST\u003c/code\u003e: Checks the interval between each\r\n     * item, and uses the smallest as the available width.\u003cbr\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_INTERVALDATA\u003c/code\u003e: Assumes that the dataset supports\r\n     * the IntervalXYDataset interface, and uses the startXValue - endXValue as\r\n     * the available width.\r\n     * \u003cbr\u003e\r\n     *\r\n     * @param autoWidthMethod  The method of automatically calculating the\r\n     * candle width.\r\n     *\r\n     * @see #WIDTHMETHOD_AVERAGE\r\n     * @see #WIDTHMETHOD_SMALLEST\r\n     * @see #WIDTHMETHOD_INTERVALDATA\r\n     * @see #getAutoWidthMethod()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthFactor()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\r\n     * Returns the factor by which the available space automatically\r\n     * calculated for the candles will be multiplied to determine the actual\r\n     * width to use.\r\n     *\r\n     * @return The width factor (generally between 0.0 and 1.0).\r\n     *\r\n     * @see #setAutoWidthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthFactor(double)",
      "begin_line": 381,
      "end_line": 386,
      "comment": "\r\n     * Sets the factor by which the available space automatically calculated\r\n     * for the candles will be multiplied to determine the actual width to use.\r\n     *\r\n     * @param autoWidthFactor The width factor (generally between 0.0 and 1.0).\r\n     *\r\n     * @see #getAutoWidthFactor()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthGap()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\r\n     * Returns the amount of space to leave on the left and right of each\r\n     * candle when automatically calculating widths.\r\n     *\r\n     * @return The gap.\r\n     *\r\n     * @see #setAutoWidthGap(double)\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthGap(double)",
      "begin_line": 413,
      "end_line": 418,
      "comment": "\r\n     * Sets the amount of space to leave on the left and right of each candle\r\n     * when automatically calculating widths and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param autoWidthGap The gap.\r\n     *\r\n     * @see #getAutoWidthGap()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getUpPaint()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Returns the paint used to fill candles when the price moves up from open\r\n     * to close.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setUpPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setUpPaint(java.awt.Paint)",
      "begin_line": 441,
      "end_line": 444,
      "comment": "\r\n     * Sets the paint used to fill candles when the price moves up from open\r\n     * to close and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getUpPaint()\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 29)",
        "(line 443,col 9)-(line 443,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getDownPaint()",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\r\n     * Returns the paint used to fill candles when the price moves down from\r\n     * open to close.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDownPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setDownPaint(java.awt.Paint)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\r\n     * Sets the paint used to fill candles when the price moves down from open\r\n     * to close and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  The paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 31)",
        "(line 467,col 9)-(line 467,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getDrawVolume()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Returns a flag indicating whether or not volume bars are drawn on the\r\n     * chart.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setDrawVolume(boolean)\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setDrawVolume(boolean)",
      "begin_line": 493,
      "end_line": 498,
      "comment": "\r\n     * Sets a flag that controls whether or not volume bars are drawn in the\r\n     * background and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #getDrawVolume()\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 497,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getVolumePaint()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\r\n     * Returns the paint that is used to fill the volume bars if they are\r\n     * visible.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setVolumePaint(Paint)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setVolumePaint(java.awt.Paint)",
      "begin_line": 525,
      "end_line": 531,
      "comment": "\r\n     * Sets the paint used to fill the volume bars, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getVolumePaint()\r\n     * @see #getDrawVolume()\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 33)",
        "(line 530,col 9)-(line 530,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getUseOutlinePaint()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Returns the flag that controls whether or not the renderer\u0027s outline\r\n     * paint is used to draw the candlestick outline.  The default value is\r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setUseOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setUseOutlinePaint(boolean)",
      "begin_line": 559,
      "end_line": 564,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer\u0027s outline\r\n     * paint is used to draw the candlestick outline, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param use  the new flag value.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getUseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 563,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 595,
      "end_line": 630,
      "comment": "\r\n     * Initialises the renderer then returns the number of \u0027passes\u0027 through the\r\n     * data that the renderer will require (usually just one).  This method\r\n     * will be called before the first item is rendered, giving the renderer\r\n     * an opportunity to initialise any state information it wants to maintain.\r\n     * The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return The number of passes the renderer requires.\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 46)",
        "(line 603,col 9)-(line 603,col 41)",
        "(line 604,col 9)-(line 604,col 59)",
        "(line 605,col 9)-(line 605,col 54)",
        "(line 606,col 9)-(line 606,col 60)",
        "(line 607,col 9)-(line 607,col 60)",
        "(line 608,col 9)-(line 608,col 50)",
        "(line 613,col 9)-(line 627,col 9)",
        "(line 629,col 9)-(line 629,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 650,
      "end_line": 873,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param selected  is the item selected?\r\n     * @param pass  the pass index.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 22)",
        "(line 656,col 9)-(line 656,col 60)",
        "(line 657,col 9)-(line 665,col 9)",
        "(line 668,col 9)-(line 668,col 41)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 673,col 9)-(line 673,col 56)",
        "(line 675,col 9)-(line 675,col 55)",
        "(line 676,col 9)-(line 676,col 62)",
        "(line 677,col 9)-(line 677,col 60)",
        "(line 678,col 9)-(line 678,col 62)",
        "(line 679,col 9)-(line 679,col 64)",
        "(line 681,col 9)-(line 681,col 60)",
        "(line 682,col 9)-(line 682,col 70)",
        "(line 684,col 9)-(line 684,col 53)",
        "(line 685,col 9)-(line 685,col 71)",
        "(line 686,col 9)-(line 686,col 69)",
        "(line 687,col 9)-(line 687,col 71)",
        "(line 688,col 9)-(line 688,col 73)",
        "(line 690,col 9)-(line 690,col 27)",
        "(line 691,col 9)-(line 691,col 26)",
        "(line 692,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 750,col 55)",
        "(line 751,col 9)-(line 751,col 34)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 57)",
        "(line 757,col 9)-(line 757,col 24)",
        "(line 759,col 9)-(line 790,col 9)",
        "(line 792,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 799,col 58)",
        "(line 800,col 9)-(line 800,col 58)",
        "(line 801,col 9)-(line 801,col 54)",
        "(line 802,col 9)-(line 802,col 54)",
        "(line 805,col 9)-(line 812,col 9)",
        "(line 815,col 9)-(line 822,col 9)",
        "(line 825,col 9)-(line 825,col 32)",
        "(line 826,col 9)-(line 826,col 35)",
        "(line 827,col 9)-(line 827,col 49)",
        "(line 828,col 9)-(line 828,col 46)",
        "(line 829,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 864,col 9)",
        "(line 865,col 9)-(line 865,col 22)",
        "(line 868,col 9)-(line 871,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.equals(java.lang.Object)",
      "begin_line": 882,
      "end_line": 922,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 61)",
        "(line 890,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.clone()",
      "begin_line": 931,
      "end_line": 933,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 942,
      "end_line": 947,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 36)",
        "(line 944,col 9)-(line 944,col 57)",
        "(line 945,col 9)-(line 945,col 59)",
        "(line 946,col 9)-(line 946,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 957,
      "end_line": 963,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 35)",
        "(line 960,col 9)-(line 960,col 57)",
        "(line 961,col 9)-(line 961,col 59)",
        "(line 962,col 9)-(line 962,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 965,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 970,col 75)"
      ]
    }
  ]
}