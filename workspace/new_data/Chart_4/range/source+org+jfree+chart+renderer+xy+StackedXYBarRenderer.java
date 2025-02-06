{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/xy/StackedXYBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedXYBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.xy.XYBarRenderer"
      ],
      "begin_line": 94,
      "end_line": 430,
      "comment": "\r\n * A bar renderer that displays the series items stacked.\r\n * The dataset used together with this renderer must be a\r\n * {@link org.jfree.data.xy.IntervalXYDataset} and a\r\n * {@link org.jfree.data.xy.TableXYDataset}. For example, the\r\n * dataset class {@link org.jfree.data.xy.CategoryTableXYDataset}\r\n * implements both interfaces.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * The example shown here is generated by the\r\n * \u003ccode\u003eStackedXYBarChartDemo2.java\u003c/code\u003e program included in the\r\n * JFreeChart demo collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/StackedXYBarRendererSample.png\"\r\n * alt\u003d\"StackedXYBarRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " A flag that controls whether the bars display values or percentages. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.StackedXYBarRenderer()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Creates a new renderer.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.StackedXYBarRenderer(double)",
      "begin_line": 114,
      "end_line": 126,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param margin  the percentual amount of the bars that are cut away.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 22)",
        "(line 116,col 9)-(line 116,col 41)",
        "(line 120,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 124,col 51)",
        "(line 125,col 9)-(line 125,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.getRenderAsPercentages()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked bars add to 100%), and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRenderAsPercentages(boolean)\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.setRenderAsPercentages(boolean)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked bars add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param asPercentages  the flag.\r\n     *\r\n     * @see #getRenderAsPercentages()\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 156,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.getPassCount()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns \u003ccode\u003e3\u003c/code\u003e to indicate that this renderer requires three\r\n     * passes for drawing (shadows are drawn in the first pass, the bars in the\r\n     * second, and item labels are drawn in the third pass so that\r\n     * they always appear in front of all the bars).\r\n     *\r\n     * @return \u003ccode\u003e2\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.data.xy.XYDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\r\n     * Initialises the renderer and returns a state object that should be\r\n     * passed to all subsequent calls to the drawItem() method. Here there is\r\n     * nothing to do.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area inside the axes.\r\n     * @param plot  the plot.\r\n     * @param data  the data.\r\n     * @param info  an optional info collection object to return data back to\r\n     *              the caller.\r\n     *\r\n     * @return A state object.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 202,
      "end_line": 215,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.xy.XYItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.XYPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.xy.XYDataset, int, int, boolean, int)",
      "begin_line": 232,
      "end_line": 396,
      "comment": "\r\n     * Draws the visual representation of a single data item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the area within which the plot is being drawn.\r\n     * @param plot  the plot (can be used to obtain standard color information\r\n     *              etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 72)",
        "(line 257,col 9)-(line 257,col 63)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 269,col 9)-(line 269,col 27)",
        "(line 270,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 34)",
        "(line 277,col 9)-(line 277,col 34)",
        "(line 279,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 30)",
        "(line 295,col 9)-(line 295,col 31)",
        "(line 296,col 9)-(line 296,col 54)",
        "(line 297,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 55)",
        "(line 311,col 9)-(line 311,col 69)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 316,col 23)",
        "(line 318,col 9)-(line 318,col 65)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 80)",
        "(line 324,col 9)-(line 325,col 37)",
        "(line 326,col 9)-(line 326,col 77)",
        "(line 327,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 31)",
        "(line 334,col 9)-(line 334,col 60)",
        "(line 335,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 41)",
        "(line 346,col 9)-(line 346,col 50)",
        "(line 347,col 9)-(line 347,col 30)",
        "(line 348,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.equals(java.lang.Object)",
      "begin_line": 405,
      "end_line": 417,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 63)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.StackedXYBarRenderer.hashCode()",
      "begin_line": 424,
      "end_line": 428,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 38)",
        "(line 426,col 9)-(line 426,col 66)",
        "(line 427,col 9)-(line 427,col 22)"
      ]
    }
  ]
}