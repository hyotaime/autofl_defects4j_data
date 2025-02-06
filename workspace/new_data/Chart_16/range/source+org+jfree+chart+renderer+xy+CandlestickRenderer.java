{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/CandlestickRenderer.java",
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
      "begin_line": 127,
      "end_line": 939,
      "comment": "\r\n * A renderer that draws candlesticks on an {@link XYPlot} (requires a \r\n * {@link OHLCDataset}).\r\n * \u003cP\u003e\r\n * This renderer does not include code to calculate the crosshair point for the \r\n * plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_AVERAGE"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The average width method. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_SMALLEST"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The smallest width method. "
    },
    {
      "type": "field",
      "varNames": [
        "WIDTHMETHOD_INTERVALDATA"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The interval data method. "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthMethod"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The method of automatically calculating the candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthFactor"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " \r\n     * The number (generally between 0.0 and 1.0) by which the available space \r\n     * automatically calculated for the candles will be multiplied to determine\r\n     * the actual width to use. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "autoWidthGap"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The minimum gap between one candle and the next "
    },
    {
      "type": "field",
      "varNames": [
        "candleWidth"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCandleWidthInMilliseconds"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The maximum candlewidth in milliseconds. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCandleWidth"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Temporary storage for the maximum candle width. "
    },
    {
      "type": "field",
      "varNames": [
        "upPaint"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " \r\n     * The paint used to fill the candle when the price moved up from open to \r\n     * close. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "downPaint"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " \r\n     * The paint used to fill the candle when the price moved down from open \r\n     * to close. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "drawVolume"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " A flag controlling whether or not volume bars are drawn on the chart. "
    },
    {
      "type": "field",
      "varNames": [
        "volumePaint"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " \r\n     * The paint used to fill the volume bars (if they are visible).  Once \r\n     * initialised, this field should never be set to \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxVolume"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Temporary storage for the maximum volume. "
    },
    {
      "type": "field",
      "varNames": [
        "useOutlinePaint"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " \r\n     * A flag that controls whether or not the renderer\u0027s outline paint is\r\n     * used to draw the outline of the candlestick.  The default value is\r\n     * \u003ccode\u003efalse\u003c/code\u003e to avoid a change of behaviour for existing code.\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer(double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the candle width if you prefer the width to be calculated \r\n     * automatically.\r\n     *\r\n     * @param candleWidth  The candle width.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.CandlestickRenderer(double, boolean, org.jfree.chart.labels.XYToolTipGenerator)",
      "begin_line": 233,
      "end_line": 244,
      "comment": "\r\n     * Creates a new renderer for candlestick charts.\r\n     * \u003cP\u003e\r\n     * Use -1 for the candle width if you prefer the width to be calculated \r\n     * automatically.\r\n     *\r\n     * @param candleWidth  the candle width.\r\n     * @param drawVolume  a flag indicating whether or not volume bars should \r\n     *                    be drawn.\r\n     * @param toolTipGenerator  the tool tip generator. \u003ccode\u003enull\u003c/code\u003e is \r\n     *                          none.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 16)",
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 237,col 39)",
        "(line 238,col 9)-(line 238,col 37)",
        "(line 239,col 9)-(line 239,col 38)",
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getCandleWidth()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the width of each candle.\r\n     *\r\n     * @return The candle width.\r\n     * \r\n     * @see #setCandleWidth(double)\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setCandleWidth(double)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\r\n     * Sets the candle width.\r\n     * \u003cP\u003e\r\n     * If you set the width to a negative value, the renderer will calculate\r\n     * the candle width automatically based on the space available on the chart.\r\n     *\r\n     * @param width  The width.\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getMaxCandleWidthInMilliseconds()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Returns the maximum width (in milliseconds) of each candle.\r\n     *\r\n     * @return The maximum candle width in milliseconds.\r\n     * \r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setMaxCandleWidthInMilliseconds(double)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\r\n     * Sets the maximum candle width (in milliseconds).  \r\n     *\r\n     * @param millis  The maximum width.\r\n     * \r\n     * @see #getMaxCandleWidthInMilliseconds()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 51)",
        "(line 300,col 9)-(line 300,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthMethod()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the method of automatically calculating the candle width.\r\n     *\r\n     * @return The method of automatically calculating the candle width.\r\n     * \r\n     * @see #setAutoWidthMethod(int)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthMethod(int)",
      "begin_line": 339,
      "end_line": 344,
      "comment": "\r\n     * Sets the method of automatically calculating the candle width.\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_AVERAGE\u003c/code\u003e: Divides the entire display (ignoring \r\n     * scale factor) by the number of items, and uses this as the available \r\n     * width.\u003cbr\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_SMALLEST\u003c/code\u003e: Checks the interval between each \r\n     * item, and uses the smallest as the available width.\u003cbr\u003e\r\n     * \u003ccode\u003eWIDTHMETHOD_INTERVALDATA\u003c/code\u003e: Assumes that the dataset supports\r\n     * the IntervalXYDataset interface, and uses the startXValue - endXValue as \r\n     * the available width.\r\n     * \u003cbr\u003e\r\n     *\r\n     * @param autoWidthMethod  The method of automatically calculating the \r\n     * candle width.\r\n     *\r\n     * @see #WIDTHMETHOD_AVERAGE\r\n     * @see #WIDTHMETHOD_SMALLEST\r\n     * @see #WIDTHMETHOD_INTERVALDATA\r\n     * @see #getAutoWidthMethod()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthFactor()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns the factor by which the available space automatically \r\n     * calculated for the candles will be multiplied to determine the actual \r\n     * width to use.\r\n     *\r\n     * @return The width factor (generally between 0.0 and 1.0).\r\n     * \r\n     * @see #setAutoWidthFactor(double)\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthFactor(double)",
      "begin_line": 371,
      "end_line": 376,
      "comment": "\r\n     * Sets the factor by which the available space automatically calculated \r\n     * for the candles will be multiplied to determine the actual width to use.\r\n     *\r\n     * @param autoWidthFactor The width factor (generally between 0.0 and 1.0).\r\n     * \r\n     * @see #getAutoWidthFactor()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthGap(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getAutoWidthGap()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns the amount of space to leave on the left and right of each \r\n     * candle when automatically calculating widths.\r\n     *\r\n     * @return The gap.\r\n     * \r\n     * @see #setAutoWidthGap(double)\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setAutoWidthGap(double)",
      "begin_line": 402,
      "end_line": 407,
      "comment": "\r\n     * Sets the amount of space to leave on the left and right of each candle \r\n     * when automatically calculating widths.\r\n     *\r\n     * @param autoWidthGap The gap.\r\n     * \r\n     * @see #getAutoWidthGap()\r\n     * @see #setCandleWidth(double)\r\n     * @see #setAutoWidthMethod(int)\r\n     * @see #setAutoWidthFactor(double)\r\n     * @see #setMaxCandleWidthInMilliseconds(double)\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getUpPaint()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\r\n     * Returns the paint used to fill candles when the price moves up from open\r\n     * to close.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setUpPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setUpPaint(java.awt.Paint)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\r\n     * Sets the paint used to fill candles when the price moves up from open\r\n     * to close and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getUpPaint()\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 29)",
        "(line 432,col 9)-(line 432,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getDownPaint()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\r\n     * Returns the paint used to fill candles when the price moves down from\r\n     * open to close.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDownPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setDownPaint(java.awt.Paint)",
      "begin_line": 454,
      "end_line": 457,
      "comment": "\r\n     * Sets the paint used to fill candles when the price moves down from open\r\n     * to close and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param paint  The paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 31)",
        "(line 456,col 9)-(line 456,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getDrawVolume()",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\r\n     * Returns a flag indicating whether or not volume bars are drawn on the\r\n     * chart.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDrawVolume(boolean)\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setDrawVolume(boolean)",
      "begin_line": 482,
      "end_line": 487,
      "comment": "\r\n     * Sets a flag that controls whether or not volume bars are drawn in the\r\n     * background and sends a {@link RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #getDrawVolume()\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getVolumePaint()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Returns the paint that is used to fill the volume bars if they are\r\n     * visible.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setVolumePaint(Paint)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setVolumePaint(java.awt.Paint)",
      "begin_line": 514,
      "end_line": 520,
      "comment": "\r\n     * Sets the paint used to fill the volume bars, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getVolumePaint()\r\n     * @see #getDrawVolume()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 33)",
        "(line 519,col 9)-(line 519,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.getUseOutlinePaint()",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\r\n     * Returns the flag that controls whether or not the renderer\u0027s outline\r\n     * paint is used to draw the candlestick outline.  The default value is\r\n     * \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setUseOutlinePaint(boolean)\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.setUseOutlinePaint(boolean)",
      "begin_line": 548,
      "end_line": 553,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer\u0027s outline\r\n     * paint is used to draw the candlestick outline, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param use  the new flag value.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getUseOutlinePaint()\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 571,
      "end_line": 606,
      "comment": "\r\n     * Initialises the renderer then returns the number of \u0027passes\u0027 through the\r\n     * data that the renderer will require (usually just one).  This method \r\n     * will be called before the first item is rendered, giving the renderer \r\n     * an opportunity to initialise any state information it wants to maintain.\r\n     * The renderer can do nothing if it chooses.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param dataset  the data.\r\n     * @param info  an optional info collection object to return data back to \r\n     *              the caller.\r\n     *\r\n     * @return The number of passes the renderer requires.\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 46)",
        "(line 579,col 9)-(line 579,col 41)",
        "(line 580,col 9)-(line 580,col 59)",
        "(line 581,col 9)-(line 581,col 54)",
        "(line 582,col 9)-(line 582,col 60)",
        "(line 583,col 9)-(line 583,col 60)",
        "(line 584,col 9)-(line 584,col 50)",
        "(line 589,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 605,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 626,
      "end_line": 847,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects info about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 22)",
        "(line 640,col 9)-(line 640,col 60)",
        "(line 641,col 9)-(line 649,col 9)",
        "(line 652,col 9)-(line 652,col 41)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 657,col 9)-(line 657,col 56)",
        "(line 659,col 9)-(line 659,col 55)",
        "(line 660,col 9)-(line 660,col 62)",
        "(line 661,col 9)-(line 661,col 60)",
        "(line 662,col 9)-(line 662,col 62)",
        "(line 663,col 9)-(line 663,col 64)",
        "(line 665,col 9)-(line 665,col 60)",
        "(line 666,col 9)-(line 666,col 70)",
        "(line 668,col 9)-(line 668,col 53)",
        "(line 669,col 9)-(line 669,col 71)",
        "(line 670,col 9)-(line 670,col 69)",
        "(line 671,col 9)-(line 671,col 71)",
        "(line 672,col 9)-(line 672,col 73)",
        "(line 674,col 9)-(line 674,col 27)",
        "(line 675,col 9)-(line 675,col 26)",
        "(line 676,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 734,col 45)",
        "(line 735,col 9)-(line 735,col 34)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 47)",
        "(line 741,col 9)-(line 741,col 24)",
        "(line 743,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 782,col 9)",
        "(line 784,col 9)-(line 784,col 58)",
        "(line 785,col 9)-(line 785,col 58)",
        "(line 786,col 9)-(line 786,col 54)",
        "(line 787,col 9)-(line 787,col 54)",
        "(line 790,col 9)-(line 797,col 9)",
        "(line 800,col 9)-(line 807,col 9)",
        "(line 810,col 9)-(line 810,col 26)",
        "(line 811,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 22)",
        "(line 845,col 9)-(line 845,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.equals(java.lang.Object)",
      "begin_line": 856,
      "end_line": 896,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 862,col 9)",
        "(line 863,col 9)-(line 863,col 61)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 882,col 9)",
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.clone()",
      "begin_line": 905,
      "end_line": 907,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 916,
      "end_line": 921,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 36)",
        "(line 918,col 9)-(line 918,col 57)",
        "(line 919,col 9)-(line 919,col 59)",
        "(line 920,col 9)-(line 920,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.CandlestickRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 931,
      "end_line": 937,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 35)",
        "(line 934,col 9)-(line 934,col 57)",
        "(line 935,col 9)-(line 935,col 59)",
        "(line 936,col 9)-(line 936,col 61)"
      ]
    }
  ]
}