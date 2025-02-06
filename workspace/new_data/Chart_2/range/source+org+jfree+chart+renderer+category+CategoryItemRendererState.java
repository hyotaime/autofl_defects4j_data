{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/category/CategoryItemRendererState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 57,
      "end_line": 258,
      "comment": "\r\n * An object that retains temporary state information for a\r\n * {@link CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "barWidth"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The bar width. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRunningTotal"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The series running total. "
    },
    {
      "type": "field",
      "varNames": [
        "visibleSeries"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The array with the indices of the visible series."
    },
    {
      "type": "field",
      "varNames": [
        "crosshairState"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\r\n     * State information for crosshairs in the plot (this is updated by the\r\n     * renderer, but may be passed to several renderers in one chart).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionState"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * The selection state for the dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.CategoryItemRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 89,
      "end_line": 93,
      "comment": "\r\n     * Creates a new object for recording temporary state information for a\r\n     * renderer.\r\n     *\r\n     * @param info  the plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)",
        "(line 91,col 9)-(line 91,col 28)",
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getBarWidth()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Returns the bar width.\r\n     *\r\n     * @return The bar width.\r\n     *\r\n     * @see #setBarWidth(double)\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setBarWidth(double)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Sets the bar width.  The renderer calculates this value and stores it\r\n     * here - it is not intended that users can manually set the bar width.\r\n     *\r\n     * @param width  the width.\r\n     *\r\n     * @see #getBarWidth()\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getSeriesRunningTotal()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the series running total.\r\n     *\r\n     * @return The running total.\r\n     *\r\n     * @see #setSeriesRunningTotal(double)\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setSeriesRunningTotal(double)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Sets the series running total (this method is intended for the use of\r\n     * the renderer only).\r\n     *\r\n     * @param total  the new total.\r\n     *\r\n     * @see #getSeriesRunningTotal()\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getCrosshairState()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the crosshair state, if any.\r\n     *\r\n     * @return The crosshair state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #setCrosshairState(CategoryCrosshairState)\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setCrosshairState(org.jfree.chart.plot.CategoryCrosshairState)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Sets the crosshair state.\r\n     *\r\n     * @param state  the new state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.11\r\n     *\r\n     * @see #getCrosshairState()\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesIndex(int)",
      "begin_line": 179,
      "end_line": 191,
      "comment": "\r\n     * Returns the index of the row relative to the visible rows.  If no\r\n     * visible rows have been specified, the original row index is returned.\r\n     * If the row index is not included in the array of visible rows,\r\n     * -1 is returned.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @return The new row index or -1.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 180,col 6)-(line 182,col 6)",
        "(line 183,col 3)-(line 183,col 17)",
        "(line 184,col 3)-(line 189,col 3)",
        "(line 190,col 3)-(line 190,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesCount()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "\r\n     * Returns the number of visible series or -1 if no visible series have\r\n     * been specified.\r\n     *\r\n     * @return The number or -1.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 202,col 6)-(line 204,col 6)",
        "(line 205,col 6)-(line 205,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getVisibleSeriesArray()",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\r\n     * Returns a copy of the visible series array.\r\n     *\r\n     * @return The visible series array (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 58)",
        "(line 220,col 9)-(line 221,col 43)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setVisibleSeriesArray(int[])",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Sets an array with the indices of the visible rows.\r\n     *\r\n     * @param visibleSeries the array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.getSelectionState()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the selection state.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.CategoryItemRendererState.setSelectionState(org.jfree.data.category.CategoryDatasetSelectionState)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\r\n     * Sets the selection state.\r\n     *\r\n     * @param state  the selection state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 36)"
      ]
    }
  ]
}