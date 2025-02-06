{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/XIntervalSeriesCollection.java",
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
      "begin_line": 61,
      "end_line": 356,
      "comment": "\r\n * A collection of {@link XIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.XIntervalSeriesCollection()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.addSeries(org.jfree.data.xy.XIntervalSeries)",
      "begin_line": 80,
      "end_line": 87,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 39)",
        "(line 86,col 9)-(line 86,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeries(int)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getX(int, int)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 68)",
        "(line 156,col 9)-(line 156,col 71)",
        "(line 157,col 9)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartXValue(int, int)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 68)",
        "(line 171,col 9)-(line 171,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndXValue(int, int)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 68)",
        "(line 185,col 9)-(line 185,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 68)",
        "(line 199,col 9)-(line 199,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getY(int, int)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 68)",
        "(line 212,col 9)-(line 212,col 71)",
        "(line 213,col 9)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 224,
      "end_line": 228,
      "comment": "\r\n     * Returns the start x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 68)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 227,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\r\n     * Returns the end x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 68)",
        "(line 240,col 9)-(line 240,col 71)",
        "(line 241,col 9)-(line 241,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeSeries(int)",
      "begin_line": 278,
      "end_line": 286,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 69)",
        "(line 283,col 9)-(line 283,col 38)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeSeries(org.jfree.data.xy.XIntervalSeries)",
      "begin_line": 296,
      "end_line": 305,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.removeAllSeries()",
      "begin_line": 313,
      "end_line": 322,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 331,
      "end_line": 340,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 73)",
        "(line 339,col 9)-(line 339,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XIntervalSeriesCollection.clone()",
      "begin_line": 349,
      "end_line": 354,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 351,col 60)",
        "(line 352,col 9)-(line 352,col 65)",
        "(line 353,col 9)-(line 353,col 21)"
      ]
    }
  ]
}