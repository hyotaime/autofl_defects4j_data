{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYErrorRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYErrorRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer"
      ],
      "begin_line": 76,
      "end_line": 401,
      "comment": "\r\n * A line and shape renderer that can also display x and/or y-error values.  \r\n * This renderer expects an {@link IntervalXYDataset}, otherwise it reverts\r\n * to the behaviour of the super class.\r\n * \r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "drawXError"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A flag that controls whether or not the x-error bars are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "drawYError"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A flag that controls whether or not the y-error bars are drawn. "
    },
    {
      "type": "field",
      "varNames": [
        "capLength"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The length of the cap at the end of the error bars. "
    },
    {
      "type": "field",
      "varNames": [
        "errorPaint"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " \r\n     * The paint used to draw the error bars (if \u003ccode\u003enull\u003c/code\u003e we use the\r\n     * series paint).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.XYErrorRenderer()",
      "begin_line": 96,
      "end_line": 102,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYErrorRenderer\u003c/code\u003e instance.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.getDrawXError()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the flag that controls whether or not the renderer draws error\r\n     * bars for the x-values.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawXError(boolean)\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.setDrawXError(boolean)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer draws error\r\n     * bars for the x-values and, if the flag changes, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param draw  the flag value.\r\n     * \r\n     * @see #getDrawXError()\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.getDrawYError()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns the flag that controls whether or not the renderer draws error\r\n     * bars for the y-values.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setDrawYError(boolean)\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.setDrawYError(boolean)",
      "begin_line": 153,
      "end_line": 158,
      "comment": "\r\n     * Sets the flag that controls whether or not the renderer draws error\r\n     * bars for the y-values and, if the flag changes, sends a \r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param draw  the flag value.\r\n     * \r\n     * @see #getDrawYError()\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.getCapLength()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the length (in Java2D units) of the cap at the end of the error \r\n     * bars.\r\n     * \r\n     * @return The cap length.\r\n     * \r\n     * @see #setCapLength(double)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.setCapLength(double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\r\n     * Sets the length of the cap at the end of the error bars, and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param length  the length (in Java2D units).\r\n     * \r\n     * @see #getCapLength()\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.getErrorPaint()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the paint used to draw the error bars.  If this is \r\n     * \u003ccode\u003enull\u003c/code\u003e (the default), the item paint is used instead.\r\n     * \r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setErrorPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.setErrorPaint(java.awt.Paint)",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\r\n     * Sets the paint used to draw the error bars.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getErrorPaint()\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 206,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\r\n     * Returns the range required by this renderer to display all the domain\r\n     * values in the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range, or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 236,
      "end_line": 243,
      "comment": "\r\n     * Returns the range required by this renderer to display all the range\r\n     * values in the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range, or \u003ccode\u003enull\u003c/code\u003e if the dataset is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 261,
      "end_line": 343,
      "comment": "\r\n     * Draws the visual representation for one data item.\r\n     * \r\n     * @param g2  the graphics output target.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the data area.\r\n     * @param info  the plot rendering info.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param crosshairState  the crosshair state.\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 342,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 373,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.readObject(java.io.ObjectInputStream)",
      "begin_line": 383,
      "end_line": 387,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYErrorRenderer.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 396,
      "end_line": 399,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 36)",
        "(line 398,col 9)-(line 398,col 60)"
      ]
    }
  ]
}