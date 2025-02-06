{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYIntervalSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYIntervalSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 54,
      "end_line": 192,
      "comment": "\r\n * A list of (x, x-low, x-high, y, y-low, y-high) data items.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XYIntervalSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYIntervalSeries.XYIntervalSeries(java.lang.Comparable)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will\r\n     * be sorted into ascending order by x-value, and duplicate x-values will\r\n     * be allowed (these defaults can be modified with another constructor).\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYIntervalSeries.XYIntervalSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify\r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate\r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.add(double, double, double, double, double, double)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param xLow  the lower bound of the x-interval.\r\n     * @param xHigh  the upper bound of the x-interval.\r\n     * @param y  the y-value.\r\n     * @param yLow  the lower bound of the y-interval.\r\n     * @param yHigh  the upper bound of the y-interval.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getX(int)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\r\n     * Returns the x-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 74)",
        "(line 106,col 9)-(line 106,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getXLowValue(int)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\r\n     * Returns the lower bound of the x-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The lower bound of the x-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 74)",
        "(line 121,col 9)-(line 121,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getXHighValue(int)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\r\n     * Returns the upper bound of the x-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The upper bound of the x-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 74)",
        "(line 136,col 9)-(line 136,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getYValue(int)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\r\n     * Returns the y-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 74)",
        "(line 148,col 9)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getYLowValue(int)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\r\n     * Returns the lower bound of the Y-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The lower bound of the Y-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 74)",
        "(line 163,col 9)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getYHighValue(int)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * Returns the upper bound of the y-interval for the specified item in the\r\n     * series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The upper bound of the y-interval.\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 74)",
        "(line 178,col 9)-(line 178,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeries.getDataItem(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 40)"
      ]
    }
  ]
}