{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/IntervalXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalXYDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 53,
      "end_line": 155,
      "comment": "\r\n * An extension of the {@link XYDataset} interface that allows an x-interval\r\n * and a y-interval to be defined.  Note that the x and y values defined\r\n * by the parent interface are NOT required to fall within these intervals.\r\n * This interface is used to support (among other things) bar plots against\r\n * numerical axes.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getStartX(int, int)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\r\n     * Returns the lower bound of the x-interval for the specified series and\r\n     * item.  If this lower bound is specified, it should be less than or\r\n     * equal to the upper bound of the interval (if one is specified).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The lower bound of the x-interval (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getStartXValue(int, int)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * Returns the lower bound of the x-interval (as a double primitive) for\r\n     * the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The lower bound of the x-interval.\r\n     *\r\n     * @see #getStartX(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getEndX(int, int)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\r\n     * Returns the upper bound of the x-interval for the specified series and\r\n     * item.  If this upper bound is specified, it should be greater than or\r\n     * equal to the lower bound of the interval (if one is specified).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The upper bound of the x-interval (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getEndXValue(int, int)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\r\n     * Returns the upper bound of the x-interval (as a double primitive) for\r\n     * the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The upper bound of the x-interval.\r\n     *\r\n     * @see #getEndX(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getStartY(int, int)",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\r\n     * Returns the lower bound of the y-interval for the specified series and\r\n     * item.  If this lower bound is specified, it should be less than or\r\n     * equal to the upper bound of the interval (if one is specified).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The lower bound of the y-interval (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getStartYValue(int, int)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\r\n     * Returns the lower bound of the y-interval (as a double primitive) for\r\n     * the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The lower bound of the y-interval.\r\n     *\r\n     * @see #getStartY(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getEndY(int, int)",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\r\n     * Returns the upper bound of the y-interval for the specified series and\r\n     * item.  If this upper bound is specified, it should be greater than or\r\n     * equal to the lower bound of the interval (if one is specified).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The upper bound of the y-interval (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.IntervalXYDataset.getEndYValue(int, int)",
      "begin_line": 153,
      "end_line": 153,
      "comment": "\r\n     * Returns the upper bound of the y-interval (as a double primitive) for\r\n     * the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The upper bound of the y-interval.\r\n     *\r\n     * @see #getEndY(int, int)\r\n     ",
      "child_ranges": []
    }
  ]
}