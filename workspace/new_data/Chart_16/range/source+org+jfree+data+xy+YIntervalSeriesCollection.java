{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/YIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 297,
      "comment": "\r\n * A collection of {@link YIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see YIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.YIntervalSeriesCollection()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eYIntervalSeriesCollection\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.addSeries(org.jfree.data.xy.YIntervalSeries)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 39)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeries(int)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getX(int, int)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 68)",
        "(line 155,col 9)-(line 155,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 68)",
        "(line 169,col 9)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartYValue(int, int)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 68)",
        "(line 183,col 9)-(line 183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndYValue(int, int)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 68)",
        "(line 197,col 9)-(line 197,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getY(int, int)",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 68)",
        "(line 210,col 9)-(line 210,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the start x-value for an item within a series.  This method\r\n     * maps directly to {@link #getX(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the end x-value for an item within a series.  This method\r\n     * maps directly to {@link #getX(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\r\n     * Returns the start y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 68)",
        "(line 249,col 9)-(line 249,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\r\n     * Returns the end y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 68)",
        "(line 262,col 9)-(line 262,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 272,
      "end_line": 281,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean. \r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 73)",
        "(line 280,col 9)-(line 280,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.clone()",
      "begin_line": 290,
      "end_line": 295,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 292,col 60)",
        "(line 293,col 9)-(line 293,col 65)",
        "(line 294,col 9)-(line 294,col 21)"
      ]
    }
  ]
}