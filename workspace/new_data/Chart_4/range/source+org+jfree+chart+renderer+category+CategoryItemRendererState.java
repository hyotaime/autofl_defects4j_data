{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/category/CategoryItemRendererState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 56,
      "end_line": 228,
      "comment": "\r\n * An object that retains temporary state information for a\r\n * {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The bar width. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRunningTotal"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The series running total. "
    },
    {
      "type": "field",
      "varNames": [
        "visibleSeries"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The array with the indices of the visible series."
    },
    {
      "type": "field",
      "varNames": [
        "crosshairState"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\r\n     * State information for crosshairs in the plot (this is updated by the\r\n     * renderer, but may be passed to several renderers in one chart).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.CategoryItemRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 81,
      "end_line": 85,
      "comment": "\r\n     * Creates a new object for recording temporary state information for a\r\n     * renderer.\r\n     *\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getBarWidth()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the bar width.\r\n     *\r\n     * @return The bar width.\r\n     *\r\n     * @see #setBarWidth(double)\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setBarWidth(double)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Sets the bar width.  The renderer calculates this value and stores it\r\n     * here - it is not intended that users can manually set the bar width.\r\n     *\r\n     * @param width  the width.\r\n     *\r\n     * @see #getBarWidth()\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getSeriesRunningTotal()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the series running total.\r\n     *\r\n     * @return The running total.\r\n     *\r\n     * @see #setSeriesRunningTotal(double)\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setSeriesRunningTotal(double)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Sets the series running total (this method is intended for the use of\r\n     * the renderer only).\r\n     *\r\n     * @param total  the new total.\r\n     *\r\n     * @see #getSeriesRunningTotal()\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getCrosshairState()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the crosshair state, if any.\r\n     *\r\n     * @return The crosshair state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setCrosshairState(CategoryCrosshairState)\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setCrosshairState(org.jfree.chart.plot.CategoryCrosshairState)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Sets the crosshair state.\r\n     *\r\n     * @param state  the new state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getCrosshairState()\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesIndex(int)",
      "begin_line": 171,
      "end_line": 183,
      "comment": "\r\n     * Returns the index of the row relative to the visible rows.  If no\r\n     * visible rows have been specified, the original row index is returned.\r\n     * If the row index is not included in the array of visible rows,\r\n     * -1 is returned.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @return The new row index or -1.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 172,col 6)-(line 174,col 6)",
        "(line 175,col 3)-(line 175,col 17)",
        "(line 176,col 3)-(line 181,col 3)",
        "(line 182,col 3)-(line 182,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesCount()",
      "begin_line": 193,
      "end_line": 198,
      "comment": "\r\n     * Returns the number of visible series or -1 if no visible series have\r\n     * been specified.\r\n     *\r\n     * @return The number or -1.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 194,col 6)-(line 196,col 6)",
        "(line 197,col 6)-(line 197,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesArray()",
      "begin_line": 207,
      "end_line": 215,
      "comment": "\r\n     * Returns a copy of the visible series array.\r\n     *\r\n     * @return The visible series array (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 58)",
        "(line 212,col 9)-(line 213,col 43)",
        "(line 214,col 9)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setVisibleSeriesArray(int[])",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Sets an array with the indices of the visible rows.\r\n     *\r\n     * @param visibleSeries the array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 43)"
      ]
    }
  ]
}