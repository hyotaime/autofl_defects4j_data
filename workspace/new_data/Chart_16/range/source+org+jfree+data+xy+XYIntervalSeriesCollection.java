{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/XYIntervalSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYIntervalSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 326,
      "comment": "\r\n * A collection of {@link XYIntervalSeries} objects.\r\n *\r\n * @since 1.0.3\r\n *\r\n * @see XYIntervalSeries\r\n "
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
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.XYIntervalSeriesCollection()",
      "begin_line": 69,
      "end_line": 71,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eXIntervalSeriesCollection\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.addSeries(org.jfree.data.xy.XYIntervalSeries)",
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
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesCount()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeries(int)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getSeriesKey(int)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getItemCount(int)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getX(int, int)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 70)",
        "(line 155,col 9)-(line 155,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartXValue(int, int)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 70)",
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndXValue(int, int)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 70)",
        "(line 183,col 9)-(line 183,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getYValue(int, int)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 70)",
        "(line 197,col 9)-(line 197,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartYValue(int, int)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 70)",
        "(line 211,col 9)-(line 211,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndYValue(int, int)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 70)",
        "(line 225,col 9)-(line 225,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getY(int, int)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartX(int, int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the start x-value for an item within a series.  \r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndX(int, int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\r\n     * Returns the end x-value for an item within a series.  \r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getStartY(int, int)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns the start y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.getEndY(int, int)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the end y-value for an item within a series.  This method\r\n     * maps directly to {@link #getY(int, int)}.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.equals(java.lang.Object)",
      "begin_line": 297,
      "end_line": 306,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean. \r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 75)",
        "(line 305,col 9)-(line 305,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYIntervalSeriesCollection.clone()",
      "begin_line": 315,
      "end_line": 324,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone of this dataset.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 317,col 61)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 58)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 21)"
      ]
    }
  ]
}