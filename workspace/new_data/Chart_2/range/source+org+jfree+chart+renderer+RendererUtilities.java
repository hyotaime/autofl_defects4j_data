{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/renderer/RendererUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RendererUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 52,
      "end_line": 269,
      "comment": "\r\n * Utility methods related to the rendering process.\r\n *\r\n * @since 1.0.6\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItemsLowerBound(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 69,
      "end_line": 149,
      "comment": "\r\n     * Finds the lower index of the range of live items in the specified data\r\n     * series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lowest x-value in the live range.\r\n     * @param xHigh  the highest x-value in the live range.\r\n     *\r\n     * @return The index of the required item.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #findLiveItemsUpperBound(XYDataset, int, double, double)\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 53)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItemsUpperBound(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 166,
      "end_line": 243,
      "comment": "\r\n     * Finds the upper index of the range of live items in the specified data\r\n     * series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lowest x-value in the live range.\r\n     * @param xHigh  the highest x-value in the live range.\r\n     *\r\n     * @return The index of the required item.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #findLiveItemsLowerBound(XYDataset, int, double, double)\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.RendererUtilities.findLiveItems(org.jfree.data.xy.XYDataset, int, double, double)",
      "begin_line": 256,
      "end_line": 267,
      "comment": "\r\n     * Finds a range of item indices that is guaranteed to contain all the\r\n     * x-values from x0 to x1 (inclusive).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index.\r\n     * @param xLow  the lower bound of the x-value range.\r\n     * @param xHigh  the upper bound of the x-value range.\r\n     *\r\n     * @return The indices of the boundary items.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 71)",
        "(line 262,col 9)-(line 262,col 71)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 34)"
      ]
    }
  ]
}