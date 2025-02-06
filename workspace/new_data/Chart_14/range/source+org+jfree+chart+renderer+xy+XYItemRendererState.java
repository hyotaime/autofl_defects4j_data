{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/xy/XYItemRendererState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYItemRendererState",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.RendererState"
      ],
      "begin_line": 54,
      "end_line": 108,
      "comment": "\r\n * The state for an {@link XYItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "workingLine"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " \r\n     * A line object that the renderer can reuse to save instantiating a lot \r\n     * of objects. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "processVisibleItemsOnly"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " \r\n     * A flag that controls whether the plot should pass ALL data items to the\r\n     * renderer, or just the items that will be visible.\r\n     * \r\n     * @since 1.0.6\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.XYItemRendererState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\r\n     * Creates a new state.\r\n     * \r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 20)",
        "(line 77,col 9)-(line 77,col 47)",
        "(line 78,col 9)-(line 78,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.getProcessVisibleItemsOnly()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the flag that controls whether the plot passes all data\r\n     * items in each series to the renderer, or just the visible items.  The\r\n     * default value is \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #setProcessVisibleItemsOnly(boolean)\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.xy.XYItemRendererState.setProcessVisibleItemsOnly(boolean)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Sets the flag that controls whether the plot passes all data\r\n     * items in each series to the renderer, or just the visible items.\r\n     * \r\n     * @param flag  the new flag value.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)"
      ]
    }
  ]
}