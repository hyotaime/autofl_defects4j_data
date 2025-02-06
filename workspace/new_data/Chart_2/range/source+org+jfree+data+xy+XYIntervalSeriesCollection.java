{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYIntervalSeriesCollection.java",
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
      "begin_line": 64,
      "end_line": 388,
      "comment": "\r\n * A collection of {@link XYIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XYIntervalSeries\r\n "
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
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.XYIntervalSeriesCollection()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.addSeries(org.jfree.data.xy.XYIntervalSeries)",
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
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeries(int)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getX(int, int)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 70)",
        "(line 160,col 9)-(line 160,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartXValue(int, int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 70)",
        "(line 174,col 9)-(line 174,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndXValue(int, int)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 70)",
        "(line 188,col 9)-(line 188,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 202,col 9)-(line 202,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartYValue(int, int)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 70)",
        "(line 216,col 9)-(line 216,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndYValue(int, int)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 70)",
        "(line 230,col 9)-(line 230,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getY(int, int)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Returns the start x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the end x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeSeries(int)",
      "begin_line": 303,
      "end_line": 312,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 71)",
        "(line 308,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 309,col 33)",
        "(line 310,col 9)-(line 310,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeSeries(org.jfree.data.xy.XYIntervalSeries)",
      "begin_line": 322,
      "end_line": 332,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.removeAllSeries()",
      "begin_line": 340,
      "end_line": 350,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.10\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 26)",
        "(line 348,col 9)-(line 348,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 359,
      "end_line": 368,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 75)",
        "(line 367,col 9)-(line 367,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.clone()",
      "begin_line": 377,
      "end_line": 386,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone of this dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 379,col 61)",
        "(line 380,col 9)-(line 380,col 43)",
        "(line 381,col 9)-(line 381,col 58)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 21)"
      ]
    }
  ]
}