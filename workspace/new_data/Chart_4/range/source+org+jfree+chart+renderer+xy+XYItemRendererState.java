{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/renderer/xy/XYItemRendererState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYItemRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 64,
      "end_line": 263,
      "comment": "\r\n * The state for an {@link XYItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "firstItemIndex"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * The first item in the series that will be displayed.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastItemIndex"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * The last item in the current series that will be displayed.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workingLine"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * A line object that the renderer can reuse to save instantiating a lot\r\n     * of objects.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "processVisibleItemsOnly"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\r\n     * A flag that controls whether the plot should pass ALL data items to the\r\n     * renderer, or just the items that will be visible.\r\n     *\r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crosshairState"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * The crosshair state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "selectionState"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * The selection state for the dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @since 1.0.14\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.XYItemRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\r\n     * Creates a new state.\r\n     *\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 20)",
        "(line 115,col 9)-(line 115,col 47)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getProcessVisibleItemsOnly()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the flag that controls whether the plot passes all data\r\n     * items in each series to the renderer, or just the visible items.  The\r\n     * default value is \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #setProcessVisibleItemsOnly(boolean)\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.setProcessVisibleItemsOnly(boolean)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Sets the flag that controls whether the plot passes all data\r\n     * items in each series to the renderer, or just the visible items.\r\n     *\r\n     * @param flag  the new flag value.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getFirstItemIndex()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the first item index (this is updated with each call to\r\n     * {@link #startSeriesPass(XYDataset, int, int, int, int, int)}.\r\n     *\r\n     * @return The first item index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getLastItemIndex()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the last item index (this is updated with each call to\r\n     * {@link #startSeriesPass(XYDataset, int, int, int, int, int)}.\r\n     *\r\n     * @return The last item index.\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getCrosshairState()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\r\n     * Returns the crosshair state, if any.\r\n     *\r\n     * @return The crosshair state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #setCrosshairState(XYCrosshairState)\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.setCrosshairState(org.jfree.chart.plot.XYCrosshairState)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Sets the crosshair state.\r\n     *\r\n     * @param state  the new state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getCrosshairState()\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getSelectionState()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the selection state.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.setSelectionState(org.jfree.data.xy.XYDatasetSelectionState)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Sets the selection state.\r\n     *\r\n     * @param state  the selection state (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.startSeriesPass(org.jfree.data.xy.XYDataset, int, int, int, int, int)",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\r\n     * This method is called by the {@link XYPlot} when it starts a pass\r\n     * through the (visible) items in a series.  The default implementation\r\n     * records the first and last item indices - override this method to\r\n     * implement additional specialised behaviour.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param firstItem  the index of the first item in the series.\r\n     * @param lastItem  the index of the last item in the series.\r\n     * @param pass  the pass index.\r\n     * @param passCount  the number of passes.\r\n     *\r\n     * @see #endSeriesPass(XYDataset, int, int, int, int, int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 238,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.endSeriesPass(org.jfree.data.xy.XYDataset, int, int, int, int, int)",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\r\n     * This method is called by the {@link XYPlot} when it ends a pass\r\n     * through the (visible) items in a series.  The default implementation\r\n     * does nothing, but you can override this method to implement specialised\r\n     * behaviour.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series index.\r\n     * @param firstItem  the index of the first item in the series.\r\n     * @param lastItem  the index of the last item in the series.\r\n     * @param pass  the pass index.\r\n     * @param passCount  the number of passes.\r\n     *\r\n     * @see #startSeriesPass(XYDataset, int, int, int, int, int)\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": []
    }
  ]
}