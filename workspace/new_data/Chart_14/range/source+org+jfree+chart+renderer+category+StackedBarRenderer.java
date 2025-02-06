{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/category/StackedBarRenderer.java",
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
      "begin_line": 123,
      "end_line": 406,
      "comment": "\r\n * A stacked bar renderer for use with the \r\n * {@link org.jfree.chart.plot.CategoryPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "renderAsPercentages"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " A flag that controls whether the bars display values or percentages. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.StackedBarRenderer()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Creates a new renderer.  By default, the renderer has no tool tip \r\n     * generator and no URL generator.  These defaults have been chosen to \r\n     * minimise the processing required to generate a default chart.  If you \r\n     * require tool tips or URLs, then you can easily add the required \r\n     * generators.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.StackedBarRenderer(boolean)",
      "begin_line": 150,
      "end_line": 162,
      "comment": "\r\n     * Creates a new renderer.\r\n     * \r\n     * @param renderAsPercentages  a flag that controls whether the data values\r\n     *                             are rendered as percentages.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 16)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 156,col 9)-(line 157,col 35)",
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 160,col 51)",
        "(line 161,col 9)-(line 161,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.getRenderAsPercentages()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the renderer displays each item value as\r\n     * a percentage (so that the stacked bars add to 100%), and \r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setRenderAsPercentages(boolean)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.setRenderAsPercentages(boolean)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * Sets the flag that controls whether the renderer displays each item\r\n     * value as a percentage (so that the stacked bars add to 100%), and sends\r\n     * a {@link RendererChangeEvent} to all registered listeners.\r\n     * \r\n     * @param asPercentages  the flag.\r\n     * \r\n     * @see #getRenderAsPercentages()\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 49)",
        "(line 188,col 9)-(line 188,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.getPassCount()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the number of passes (\u003ccode\u003e2\u003c/code\u003e) required by this renderer. \r\n     * The first pass is used to draw the bars, the second pass is used to\r\n     * draw the item labels (if visible).\r\n     * \r\n     * @return The number of passes required by the renderer.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is empty).\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.calculateBarWidth(org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, int, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 227,
      "end_line": 262,
      "comment": "\r\n     * Calculates the bar width and stores it in the renderer state.\r\n     * \r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param state  the renderer state.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 73)",
        "(line 234,col 9)-(line 234,col 62)",
        "(line 235,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.drawItem(java.awt.Graphics2D, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, int)",
      "begin_line": 278,
      "end_line": 383,
      "comment": "\r\n     * Draws a stacked bar for a specific item.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param state  the renderer state.\r\n     * @param dataArea  the plot area.\r\n     * @param plot  the plot.\r\n     * @param domainAxis  the domain (category) axis.\r\n     * @param rangeAxis  the range (value) axis.\r\n     * @param dataset  the data.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param pass  the pass index.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 57)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 47)",
        "(line 296,col 9)-(line 296,col 27)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 60)",
        "(line 303,col 9)-(line 305,col 44)",
        "(line 307,col 9)-(line 307,col 40)",
        "(line 308,col 9)-(line 308,col 43)",
        "(line 310,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 30)",
        "(line 327,col 9)-(line 327,col 31)",
        "(line 328,col 9)-(line 328,col 57)",
        "(line 329,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 65)",
        "(line 342,col 9)-(line 343,col 39)",
        "(line 345,col 9)-(line 345,col 31)",
        "(line 346,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.StackedBarRenderer.equals(java.lang.Object)",
      "begin_line": 392,
      "end_line": 404,
      "comment": "\r\n     * Tests this renderer for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 59)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 33)"
      ]
    }
  ]
}