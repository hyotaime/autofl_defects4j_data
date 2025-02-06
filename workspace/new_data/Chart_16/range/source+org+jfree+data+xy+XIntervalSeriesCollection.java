{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/XIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 257,
      "comment": "\r\n * A collection of {@link XIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.XIntervalSeriesCollection()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.addSeries(org.jfree.data.xy.XIntervalSeries)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 39)",
        "(line 83,col 9)-(line 83,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeries(int)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getX(int, int)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 68)",
        "(line 153,col 9)-(line 153,col 71)",
        "(line 154,col 9)-(line 154,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getY(int, int)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 68)",
        "(line 167,col 9)-(line 167,col 71)",
        "(line 168,col 9)-(line 168,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\r\n     * Returns the start x-value for an item within a series.  \r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 68)",
        "(line 181,col 9)-(line 181,col 71)",
        "(line 182,col 9)-(line 182,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\r\n     * Returns the end x-value for an item within a series.  \r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 68)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 196,col 9)-(line 196,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean. \r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 73)",
        "(line 240,col 9)-(line 240,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.clone()",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 252,col 60)",
        "(line 253,col 9)-(line 253,col 65)",
        "(line 254,col 9)-(line 254,col 21)"
      ]
    }
  ]
}