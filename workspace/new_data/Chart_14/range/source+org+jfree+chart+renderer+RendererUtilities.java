{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/renderer/RendererUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RendererUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 247,
      "comment": "\r\n * Utility methods related to the rendering process.\r\n * \r\n * @since 1.0.6\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItemsLowerBound(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 68,
      "end_line": 140,
      "comment": "\r\n     * Finds the lower index of the range of live items in the specified data\r\n     * series.  \r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lowest x-value in the live range.\r\n     * @param xHigh  the highest x-value in the live range.\r\n     * \r\n     * @return The index of the required item.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #findLiveItemsUpperBound(XYDataset, int, double, double)\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 53)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItemsUpperBound(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 156,
      "end_line": 224,
      "comment": "\r\n     * Finds the index of the item in the specified series that...\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lowest x-value in the live range.\r\n     * @param xHigh  the highest x-value in the live range.\r\n     *\r\n     * @return The index of the required item.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #findLiveItemsLowerBound(XYDataset, int, double, double)\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 53)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItems(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\r\n     * Finds a range of item indices that is guaranteed to contain all the\r\n     * x-values from x0 to x1 (inclusive).\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lower bound of the x-value range.\r\n     * @param xHigh  the upper bound of the x-value range.\r\n     * \r\n     * @return The indices of the boundary items.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 71)",
        "(line 243,col 9)-(line 243,col 71)",
        "(line 244,col 9)-(line 244,col 34)"
      ]
    }
  ]
}