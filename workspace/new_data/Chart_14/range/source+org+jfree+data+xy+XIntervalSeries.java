{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/XIntervalSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XIntervalSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 53,
      "end_line": 128,
      "comment": "\r\n * A list of (x, x-low, x-high, y) data items.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XIntervalSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XIntervalSeries.XIntervalSeries(java.lang.Comparable)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will \r\n     * be sorted into ascending order by x-value, and duplicate x-values will \r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XIntervalSeries.XIntervalSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify \r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the \r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate \r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeries.add(double, double, double, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     * @param xLow  the lower bound of the y-interval.\r\n     * @param xHigh  the upper bound of the y-interval.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeries.getX(int)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\r\n     * Returns the x-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 72)",
        "(line 102,col 9)-(line 102,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeries.getYValue(int)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\r\n     * Returns the y-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 72)",
        "(line 114,col 9)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeries.getDataItem(int)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     * \r\n     * @param index  the item index.\r\n     * \r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 40)"
      ]
    }
  ]
}