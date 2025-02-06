{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/HighLowRenderer.java",
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
      "begin_line": 100,
      "end_line": 446,
      "comment": "\r\n * A renderer that draws high/low/open/close markers on an {@link XYPlot} \r\n * (requires a {@link OHLCDataset}).  This renderer does not include code to \r\n * calculate the crosshair point for the plot.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "drawOpenTicks"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " A flag that controls whether the open ticks are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "drawCloseTicks"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " A flag that controls whether the close ticks are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "openTickPaint"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " \r\n     * The paint used for the open ticks (if \u003ccode\u003enull\u003c/code\u003e, the series\r\n     * paint is used instead).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closeTickPaint"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " \r\n     * The paint used for the close ticks (if \u003ccode\u003enull\u003c/code\u003e, the series\r\n     * paint is used instead).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.HighLowRenderer()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\r\n     * The default constructor.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 16)",
        "(line 132,col 9)-(line 132,col 34)",
        "(line 133,col 9)-(line 133,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getDrawOpenTicks()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Returns the flag that controls whether open ticks are drawn.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setDrawOpenTicks(boolean)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\r\n     * Sets the flag that controls whether open ticks are drawn, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param draw  the flag.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getDrawCloseTicks()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the flag that controls whether close ticks are drawn.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setDrawCloseTicks(boolean)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\r\n     * Sets the flag that controls whether close ticks are drawn, and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param draw  the flag.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)",
        "(line 173,col 9)-(line 173,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getOpenTickPaint()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\r\n     * Returns the paint used to draw the ticks for the open values.\r\n     * \r\n     * @return The paint used to draw the ticks for the open values (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setOpenTickPaint(java.awt.Paint)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\r\n     * Sets the paint used to draw the ticks for the open values and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  If you set\r\n     * this to \u003ccode\u003enull\u003c/code\u003e (the default), the series paint is used \r\n     * instead.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 35)",
        "(line 196,col 9)-(line 196,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.getCloseTickPaint()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\r\n     * Returns the paint used to draw the ticks for the close values.\r\n     * \r\n     * @return The paint used to draw the ticks for the close values (possibly \r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.setCloseTickPaint(java.awt.Paint)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\r\n     * Sets the paint used to draw the ticks for the close values and sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.  If you set\r\n     * this to \u003ccode\u003enull\u003c/code\u003e (the default), the series paint is used \r\n     * instead.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 36)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 240,
      "end_line": 372,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color \r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 258,col 42)",
        "(line 261,col 9)-(line 261,col 32)",
        "(line 262,col 9)-(line 262,col 41)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 268,col 57)",
        "(line 270,col 9)-(line 270,col 53)",
        "(line 271,col 9)-(line 271,col 56)",
        "(line 272,col 9)-(line 272,col 31)",
        "(line 273,col 9)-(line 273,col 33)",
        "(line 275,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.clone()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\r\n     * Returns a clone of the renderer.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the renderer cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.equals(java.lang.Object)",
      "begin_line": 392,
      "end_line": 416,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 53)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 426,
      "end_line": 431,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 35)",
        "(line 429,col 9)-(line 429,col 63)",
        "(line 430,col 9)-(line 430,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.HighLowRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 440,
      "end_line": 444,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 36)",
        "(line 442,col 9)-(line 442,col 63)",
        "(line 443,col 9)-(line 443,col 64)"
      ]
    }
  ]
}