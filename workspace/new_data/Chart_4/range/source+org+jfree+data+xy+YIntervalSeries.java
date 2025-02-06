{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/YIntervalSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YIntervalSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 54,
      "end_line": 159,
      "comment": "\r\n * A list of (x, y, y-low, y-high) data items.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see YIntervalSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.YIntervalSeries.YIntervalSeries(java.lang.Comparable)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will\r\n     * be sorted into ascending order by x-value, and duplicate x-values will\r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.YIntervalSeries.YIntervalSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify\r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate\r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.add(double, double, double, double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     * @param yLow  the lower bound of the y-interval.\r\n     * @param yHigh  the upper bound of the y-interval.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.getX(int)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\r\n     * Returns the x-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 72)",
        "(line 103,col 9)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.getYValue(int)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\r\n     * Returns the y-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 72)",
        "(line 115,col 9)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.getYLowValue(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\r\n     * Returns the lower bound of the Y-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The lower bound of the Y-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 72)",
        "(line 130,col 9)-(line 130,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.getYHighValue(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\r\n     * Returns the upper bound of the y-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The upper bound of the y-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 72)",
        "(line 145,col 9)-(line 145,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeries.getDataItem(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 40)"
      ]
    }
  ]
}