{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/ohlc/OHLCSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OHLCSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 55,
      "end_line": 123,
      "comment": "\r\n * A list of ({@link RegularTimePeriod}, open, high, low, close) data items.\r\n *\r\n * @since 1.0.4\r\n *\r\n * @see OHLCSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.OHLCSeries(java.lang.Comparable)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will\r\n     * be sorted into ascending order by period, and duplicate periods will\r\n     * not be allowed.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.getPeriod(int)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\r\n     * Returns the time period for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 54)",
        "(line 77,col 9)-(line 77,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.getDataItem(int)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.add(org.jfree.data.time.RegularTimePeriod, double, double, double, double)",
      "begin_line": 100,
      "end_line": 110,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param period  the period.\r\n     * @param open  the open-value.\r\n     * @param high  the high-value.\r\n     * @param low  the low-value.\r\n     * @param close  the close-value.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.remove(int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Removes the item with the specified index.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    }
  ]
}