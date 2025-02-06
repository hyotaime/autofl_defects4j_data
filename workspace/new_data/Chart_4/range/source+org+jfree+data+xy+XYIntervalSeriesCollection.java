{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/XYIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 383,
      "comment": "\r\n * A collection of {@link XYIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XYIntervalSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for the data series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.XYIntervalSeriesCollection()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.addSeries(org.jfree.data.xy.XYIntervalSeries)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeries(int)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getX(int, int)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 70)",
        "(line 158,col 9)-(line 158,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartXValue(int, int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 70)",
        "(line 172,col 9)-(line 172,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndXValue(int, int)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 186,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 70)",
        "(line 200,col 9)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartYValue(int, int)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 70)",
        "(line 214,col 9)-(line 214,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndYValue(int, int)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 70)",
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getY(int, int)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the start x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\r\n     * Returns the end x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeSeries(int)",
      "begin_line": 301,
      "end_line": 309,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 71)",
        "(line 306,col 9)-(line 306,col 38)",
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeSeries(org.jfree.data.xy.XYIntervalSeries)",
      "begin_line": 319,
      "end_line": 328,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeAllSeries()",
      "begin_line": 336,
      "end_line": 345,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 26)",
        "(line 344,col 9)-(line 344,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 354,
      "end_line": 363,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 75)",
        "(line 362,col 9)-(line 362,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.clone()",
      "begin_line": 372,
      "end_line": 381,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone of this dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 374,col 61)",
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 21)"
      ]
    }
  ]
}