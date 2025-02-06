{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/XYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.general.SeriesDataset"
      ],
      "begin_line": 56,
      "end_line": 129,
      "comment": "\r\n * An interface through which data in the form of (x, y) items can be accessed.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getDomainOrder()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\r\n     * Returns the order of the domain (or X) values returned by the dataset.\r\n     * \r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getItemCount(int)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \u003cbr\u003e\u003cbr\u003e\r\n     * It is recommended that classes that implement this method should throw \r\n     * an \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the \u003ccode\u003eseries\u003c/code\u003e \r\n     * argument is outside the specified range. \r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getX(int, int)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or \r\n     * may not be returned in ascending order, that is up to the class \r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getXValue(int, int)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     * \r\n     * @return The x-value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getY(int, int)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYDataset.getYValue(int, int)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     * \r\n     * @return The y-value.\r\n     ",
      "child_ranges": []
    }
  ]
}