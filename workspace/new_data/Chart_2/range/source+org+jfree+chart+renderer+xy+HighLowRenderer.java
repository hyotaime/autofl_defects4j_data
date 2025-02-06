{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/xy/HighLowRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighLowRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
        "org.jfree.chart.renderer.xy.XYItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 110,
      "end_line": 520,
      "comment": "\r\n * A renderer that draws high/low/open/close markers on an {@link XYPlot}\r\n * (requires a {@link OHLCDataset}).  This renderer does not include code to\r\n * calculate the crosshair point for the plot. The example shown here is \r\n * generated by the \u003ccode\u003eHighLowChartDemo1.java\u003c/code\u003e program included in the\r\n * JFreeChart demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/HighLowRendererSample.png\"\r\n * alt\u003d\"HighLowRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "drawOpenTicks"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " A flag that controls whether the open ticks are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "drawCloseTicks"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " A flag that controls whether the close ticks are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "openTickPaint"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * The paint used for the open ticks (if \u003ccode\u003enull\u003c/code\u003e, the series\r\n     * paint is used instead).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closeTickPaint"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\r\n     * The paint used for the close ticks (if \u003ccode\u003enull\u003c/code\u003e, the series\r\n     * paint is used instead).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "tickLength"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * The tick length (in Java2D units).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.HighLowRenderer()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\r\n     * The default constructor.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 16)",
        "(line 146,col 9)-(line 146,col 34)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getDrawOpenTicks()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the flag that controls whether open ticks are drawn.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #getDrawCloseTicks()\r\n     * @see #setDrawOpenTicks(boolean)\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setDrawOpenTicks(boolean)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\r\n     * Sets the flag that controls whether open ticks are drawn, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param draw  the flag.\r\n     *\r\n     * @see #getDrawOpenTicks()\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getDrawCloseTicks()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the flag that controls whether close ticks are drawn.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #getDrawOpenTicks()\r\n     * @see #setDrawCloseTicks(boolean)\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setDrawCloseTicks(boolean)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\r\n     * Sets the flag that controls whether close ticks are drawn, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param draw  the flag.\r\n     *\r\n     * @see #getDrawCloseTicks()\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getOpenTickPaint()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the paint used to draw the ticks for the open values.\r\n     *\r\n     * @return The paint used to draw the ticks for the open values (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOpenTickPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setOpenTickPaint(java.awt.Paint)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\r\n     * Sets the paint used to draw the ticks for the open values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.  If you set\r\n     * this to \u003ccode\u003enull\u003c/code\u003e (the default), the series paint is used\r\n     * instead.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getOpenTickPaint()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 35)",
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getCloseTickPaint()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the paint used to draw the ticks for the close values.\r\n     *\r\n     * @return The paint used to draw the ticks for the close values (possibly\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setCloseTickPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setCloseTickPaint(java.awt.Paint)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\r\n     * Sets the paint used to draw the ticks for the close values and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.  If you set\r\n     * this to \u003ccode\u003enull\u003c/code\u003e (the default), the series paint is used\r\n     * instead.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getCloseTickPaint()\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 36)",
        "(line 252,col 9)-(line 252,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getTickLength()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the tick length (in Java2D units).\r\n     *\r\n     * @return The tick length.\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #setTickLength(double)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setTickLength(double)",
      "begin_line": 278,
      "end_line": 281,
      "comment": "\r\n     * Sets the tick length (in Java2D units) and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #getTickLength()\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 292,
      "end_line": 299,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 316,
      "end_line": 443,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 51)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 326,col 42)",
        "(line 329,col 9)-(line 329,col 32)",
        "(line 330,col 9)-(line 330,col 41)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 60)",
        "(line 336,col 9)-(line 336,col 57)",
        "(line 338,col 9)-(line 338,col 63)",
        "(line 339,col 9)-(line 339,col 66)",
        "(line 340,col 9)-(line 340,col 31)",
        "(line 341,col 9)-(line 341,col 33)",
        "(line 343,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 441,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.clone()",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.equals(java.lang.Object)",
      "begin_line": 463,
      "end_line": 490,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 53)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 500,
      "end_line": 505,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 35)",
        "(line 503,col 9)-(line 503,col 63)",
        "(line 504,col 9)-(line 504,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 514,
      "end_line": 518,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 36)",
        "(line 516,col 9)-(line 516,col 63)",
        "(line 517,col 9)-(line 517,col 64)"
      ]
    }
  ]
}