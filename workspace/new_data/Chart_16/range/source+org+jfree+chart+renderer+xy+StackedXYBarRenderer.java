{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/xy/StackedXYBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedXYBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYBarRenderer"
      ],
      "begin_line": 87,
      "end_line": 419,
      "comment": "\r\n * A bar renderer that displays the series items stacked.\r\n * The dataset used together with this renderer must be a\r\n * {@link org.jfree.data.xy.IntervalXYDataset} and a\r\n * {@link org.jfree.data.xy.TableXYDataset}. For example, the\r\n * dataset class {@link org.jfree.data.xy.CategoryTableXYDataset}\r\n * implements both interfaces.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " A flag that controls whether the bars display values or percentages. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.StackedXYBarRenderer()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.StackedXYBarRenderer(double)",
      "begin_line": 107,
      "end_line": 119,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param margin  the percentual amount of the bars that are cut away.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 22)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 113,col 9)-(line 114,col 35)",
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 118,col 9)-(line 118,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.getRenderAsPercentages()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked bars add to 100%), and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setRenderAsPercentages(boolean)\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.setRenderAsPercentages(boolean)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked bars add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param asPercentages  the flag.\r\n     * \r\n     * @see #getRenderAsPercentages()\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.getPassCount()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns \u003ccode\u003e2\u003c/code\u003e to indicate that this renderer requires two \r\n     * passes for drawing (item labels are drawn in the second pass so that \r\n     * they always appear in front of all the bars).\r\n     * \r\n     * @return \u003ccode\u003e2\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be \r\n     * passed to all subsequent calls to the drawItem() method. Here there is \r\n     * nothing to do.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return A state object.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 194,
      "end_line": 207,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the \r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, org.jfree.chart.plot.CrosshairState, int)",
      "begin_line": 227,
      "end_line": 385,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param info  collects information about the drawing.\r\n     * @param plot  the plot (can be used to obtain standard color information \r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param crosshairState  crosshair information for the plot \r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 72)",
        "(line 260,col 9)-(line 260,col 63)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 272,col 9)-(line 272,col 27)",
        "(line 273,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 34)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 282,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 30)",
        "(line 298,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 54)",
        "(line 300,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 55)",
        "(line 314,col 9)-(line 314,col 69)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 319,col 23)",
        "(line 321,col 9)-(line 321,col 65)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 80)",
        "(line 327,col 9)-(line 328,col 37)",
        "(line 329,col 9)-(line 329,col 77)",
        "(line 330,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 31)",
        "(line 337,col 9)-(line 337,col 60)",
        "(line 338,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.equals(java.lang.Object)",
      "begin_line": 394,
      "end_line": 406,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 63)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.hashCode()",
      "begin_line": 413,
      "end_line": 417,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 38)",
        "(line 415,col 9)-(line 415,col 67)",
        "(line 416,col 9)-(line 416,col 22)"
      ]
    }
  ]
}