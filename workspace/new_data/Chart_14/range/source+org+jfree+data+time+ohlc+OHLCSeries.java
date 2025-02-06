{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/ohlc/OHLCSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OHLCSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 54,
      "end_line": 111,
      "comment": "\r\n * A list of (RegularTimePeriod, open, high, low, close) data items.\r\n *\r\n * @since 1.0.4\r\n *\r\n * @see OHLCSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.OHLCSeries(java.lang.Comparable)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will \r\n     * be sorted into ascending order by period, and duplicate periods will \r\n     * not be allowed.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.getPeriod(int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\r\n     * Returns the time period for the specified item.\r\n     * \r\n     * @param index  the item index.\r\n     * \r\n     * @return The time period.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 60)",
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.getDataItem(int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     * \r\n     * @param index  the item index.\r\n     * \r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeries.add(org.jfree.data.time.RegularTimePeriod, double, double, double, double)",
      "begin_line": 99,
      "end_line": 109,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param period  the period.\r\n     * @param open  the open-value.\r\n     * @param high  the high-value.\r\n     * @param low  the low-value.\r\n     * @param close  the close-value.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 70)"
      ]
    }
  ]
}