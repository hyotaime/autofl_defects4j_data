{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/renderer/category/CategoryItemRendererState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 52,
      "end_line": 118,
      "comment": "\r\n * An object that retains temporary state information for a \r\n * {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The bar width. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRunningTotal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The series running total. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.CategoryItemRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\r\n     * Creates a new object for recording temporary state information for a\r\n     * renderer.\r\n     * \r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)",
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getBarWidth()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Returns the bar width.\r\n     * \r\n     * @return The bar width.\r\n     * \r\n     * @see #setBarWidth(double)\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setBarWidth(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Sets the bar width.  The renderer calculates this value and stores it \r\n     * here - it is not intended that users can manually set the bar width.\r\n     * \r\n     * @param width  the width.\r\n     * \r\n     * @see #getBarWidth()\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getSeriesRunningTotal()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the series running total.\r\n     * \r\n     * @return The running total.\r\n     * \r\n     * @see #setSeriesRunningTotal(double)\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setSeriesRunningTotal(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Sets the series running total (this method is intended for the use of \r\n     * the renderer only).\r\n     * \r\n     * @param total  the new total.\r\n     * \r\n     * @see #getSeriesRunningTotal()\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)"
      ]
    }
  ]
}