{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 361,
      "comment": "\r\n * A collection of {@link XIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.XIntervalSeriesCollection()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.addSeries(org.jfree.data.xy.XIntervalSeries)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 39)",
        "(line 87,col 9)-(line 87,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeries(int)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getX(int, int)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 71)",
        "(line 159,col 9)-(line 159,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartXValue(int, int)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 68)",
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndXValue(int, int)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 68)",
        "(line 187,col 9)-(line 187,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 68)",
        "(line 201,col 9)-(line 201,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getY(int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 68)",
        "(line 214,col 9)-(line 214,col 71)",
        "(line 215,col 9)-(line 215,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\r\n     * Returns the start x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 68)",
        "(line 228,col 9)-(line 228,col 71)",
        "(line 229,col 9)-(line 229,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "\r\n     * Returns the end x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 68)",
        "(line 242,col 9)-(line 242,col 71)",
        "(line 243,col 9)-(line 243,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeSeries(int)",
      "begin_line": 280,
      "end_line": 289,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 69)",
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeSeries(org.jfree.data.xy.XIntervalSeries)",
      "begin_line": 299,
      "end_line": 309,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeAllSeries()",
      "begin_line": 317,
      "end_line": 327,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 325,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 336,
      "end_line": 345,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 73)",
        "(line 344,col 9)-(line 344,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.clone()",
      "begin_line": 354,
      "end_line": 359,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 356,col 60)",
        "(line 357,col 9)-(line 357,col 65)",
        "(line 358,col 9)-(line 358,col 21)"
      ]
    }
  ]
}