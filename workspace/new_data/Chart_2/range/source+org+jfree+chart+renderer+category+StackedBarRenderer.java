{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/category/StackedBarRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StackedBarRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.category.BarRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 127,
      "end_line": 430,
      "comment": "\r\n * A stacked bar renderer for use with the {@link CategoryPlot} class.\r\n * The example shown here is generated by the\r\n * \u003ccode\u003eStackedBarChartDemo1.java\u003c/code\u003e program included in the\r\n * JFreeChart Demo Collection:\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * \u003cimg src\u003d\"../../../../../images/StackedBarRendererSample.png\"\r\n * alt\u003d\"StackedBarRendererSample.png\" /\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " A flag that controls whether the bars display values or percentages. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.StackedBarRenderer()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Creates a new renderer.  By default, the renderer has no tool tip\r\n     * generator and no URL generator.  These defaults have been chosen to\r\n     * minimise the processing required to generate a default chart.  If you\r\n     * require tool tips or URLs, then you can easily add the required\r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.StackedBarRenderer(boolean)",
      "begin_line": 153,
      "end_line": 165,
      "comment": "\r\n     * Creates a new renderer.\r\n     *\r\n     * @param renderAsPercentages  a flag that controls whether the data values\r\n     *                             are rendered as percentages.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 16)",
        "(line 155,col 9)-(line 155,col 55)",
        "(line 159,col 9)-(line 160,col 35)",
        "(line 161,col 9)-(line 161,col 44)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 163,col 9)-(line 163,col 51)",
        "(line 164,col 9)-(line 164,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.getRenderAsPercentages()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked bars add to 100%), and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRenderAsPercentages(boolean)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.setRenderAsPercentages(boolean)",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked bars add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param asPercentages  the flag.\r\n     *\r\n     * @see #getRenderAsPercentages()\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 49)",
        "(line 191,col 9)-(line 191,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.getPassCount()",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\r\n     * Returns the number of passes (\u003ccode\u003e3\u003c/code\u003e) required by this renderer.\r\n     * The first pass is used to draw the bar shadows, the second pass is used\r\n     * to draw the bars, and the third pass is used to draw the item labels\r\n     * (if visible).\r\n     *\r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 214,
      "end_line": 224,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 234,
      "end_line": 269,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 73)",
        "(line 241,col 9)-(line 241,col 62)",
        "(line 242,col 9)-(line 267,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, int)",
      "begin_line": 285,
      "end_line": 407,
      "comment": "\r\n     * Draws a stacked bar for a specific item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain (category) axis.\r\n     * @param rangeAxis  the range (value) axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)",
        "(line 295,col 9)-(line 295,col 57)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 47)",
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 60)",
        "(line 309,col 9)-(line 311,col 44)",
        "(line 313,col 9)-(line 313,col 40)",
        "(line 314,col 9)-(line 314,col 43)",
        "(line 316,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 30)",
        "(line 333,col 9)-(line 333,col 31)",
        "(line 334,col 9)-(line 334,col 41)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 30)",
        "(line 337,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 57)",
        "(line 355,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 65)",
        "(line 368,col 9)-(line 369,col 39)",
        "(line 371,col 9)-(line 371,col 31)",
        "(line 372,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 406,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.equals(java.lang.Object)",
      "begin_line": 416,
      "end_line": 428,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 59)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 33)"
      ]
    }
  ]
}