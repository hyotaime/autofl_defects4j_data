{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/YIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "YIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 359,
      "comment": "\r\n * A collection of {@link YIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see YIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.YIntervalSeriesCollection()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eYIntervalSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.addSeries(org.jfree.data.xy.YIntervalSeries)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 30)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeries(int)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getX(int, int)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 68)",
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 68)",
        "(line 174,col 9)-(line 174,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartYValue(int, int)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 68)",
        "(line 188,col 9)-(line 188,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndYValue(int, int)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 68)",
        "(line 202,col 9)-(line 202,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getY(int, int)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 68)",
        "(line 215,col 9)-(line 215,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Returns the start x-value for an item within a series.  This method\r\n     * maps directly to {@link #getX(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\r\n     * Returns the end x-value for an item within a series.  This method\r\n     * maps directly to {@link #getX(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "\r\n     * Returns the start y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 68)",
        "(line 254,col 9)-(line 254,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 265,
      "end_line": 268,
      "comment": "\r\n     * Returns the end y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 68)",
        "(line 267,col 9)-(line 267,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.removeSeries(int)",
      "begin_line": 278,
      "end_line": 287,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 69)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.removeSeries(org.jfree.data.xy.YIntervalSeries)",
      "begin_line": 297,
      "end_line": 307,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.removeAllSeries()",
      "begin_line": 315,
      "end_line": 325,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 334,
      "end_line": 343,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 73)",
        "(line 342,col 9)-(line 342,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.YIntervalSeriesCollection.clone()",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 354,col 60)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 356,col 9)-(line 356,col 21)"
      ]
    }
  ]
}