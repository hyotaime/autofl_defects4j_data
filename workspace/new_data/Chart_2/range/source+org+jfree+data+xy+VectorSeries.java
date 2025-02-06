{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/VectorSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "VectorSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.ComparableObjectSeries"
      ],
      "begin_line": 59,
      "end_line": 171,
      "comment": "\r\n * A list of (x,y, deltaX, deltaY) data items.\r\n *\r\n * @since 1.0.6\r\n *\r\n * @see VectorSeriesCollection\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.VectorSeries.VectorSeries(java.lang.Comparable)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\r\n     * Creates a new empty series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.VectorSeries.VectorSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\r\n     * Constructs a new series that contains no data.  You can specify\r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate\r\n     *                               x-values are allowed.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.add(double, double, double, double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Adds a data item to the series.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     * @param deltaX  the vector x.\r\n     * @param deltaY  the vector y.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.remove(int)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\r\n     * Removes the item at the specified index and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The item removed.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 73)",
        "(line 107,col 9)-(line 107,col 28)",
        "(line 108,col 9)-(line 108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.getXValue(int)",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\r\n     * Returns the x-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 71)",
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.getYValue(int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\r\n     * Returns the y-value for the specified item.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 66)",
        "(line 132,col 9)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.getVectorXValue(int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\r\n     * Returns the x-component of the vector for an item in the series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The x-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 66)",
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.getVectorYValue(int)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Returns the y-component of the vector for an item in the series.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The y-component of the vector.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 66)",
        "(line 156,col 9)-(line 156,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.VectorSeries.getDataItem(int)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\r\n     * Returns the data item at the specified index.\r\n     *\r\n     * @param index  the item index.\r\n     *\r\n     * @return The data item.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 40)"
      ]
    }
  ]
}