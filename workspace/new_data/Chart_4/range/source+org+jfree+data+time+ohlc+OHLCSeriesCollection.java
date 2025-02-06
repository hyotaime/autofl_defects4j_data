{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/time/ohlc/OHLCSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OHLCSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 486,
      "comment": "\r\n * A collection of {@link OHLCSeries} objects.\r\n *\r\n * @since 1.0.4\r\n *\r\n * @see OHLCSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Storage for the data series. "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.OHLCSeriesCollection()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eOHLCSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getXPosition()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value when the collection is used as an {@link XYDataset}.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 102,
      "end_line": 108,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values\r\n     * when the collection is used as an {@link XYDataset}, then sends a\r\n     * {@link DatasetChangeEvent} is sent to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 32)",
        "(line 107,col 9)-(line 107,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.addSeries(org.jfree.data.time.ohlc.OHLCSeries)",
      "begin_line": 116,
      "end_line": 123,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesCount()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeries(int)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesKey(int)",
      "begin_line": 162,
      "end_line": 165,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getItemCount(int)",
      "begin_line": 177,
      "end_line": 180,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 189,
      "end_line": 201,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 25)",
        "(line 191,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getXValue(int, int)",
      "begin_line": 211,
      "end_line": 216,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 58)",
        "(line 213,col 9)-(line 213,col 53)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 215,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(int, int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getY(int, int)",
      "begin_line": 238,
      "end_line": 242,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 241,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpenValue(int, int)",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 58)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 255,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpen(int, int)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getCloseValue(int, int)",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 58)",
        "(line 280,col 9)-(line 280,col 53)",
        "(line 281,col 9)-(line 281,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getClose(int, int)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHighValue(int, int)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 58)",
        "(line 306,col 9)-(line 306,col 53)",
        "(line 307,col 9)-(line 307,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHigh(int, int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLowValue(int, int)",
      "begin_line": 330,
      "end_line": 334,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 58)",
        "(line 332,col 9)-(line 332,col 53)",
        "(line 333,col 9)-(line 333,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLow(int, int)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolume(int, int)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e always, because this dataset doesn\u0027t record\r\n     * any volume data.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (ignored).\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolumeValue(int, int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e always, because this dataset doesn\u0027t\r\n     * record any volume data.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (ignored).\r\n     *\r\n     * @return \u003ccode\u003eDouble.NaN\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeSeries(int)",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\r\n     * Removes the series with the specified index and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the series index.\r\n     * \r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 45)",
        "(line 384,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeSeries(org.jfree.data.time.ohlc.OHLCSeries)",
      "begin_line": 400,
      "end_line": 410,
      "comment": "\r\n     * Removes the specified series from the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the series was removed, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 51)",
        "(line 405,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeAllSeries()",
      "begin_line": 418,
      "end_line": 435,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 426,col 9)-(line 429,col 9)",
        "(line 432,col 9)-(line 432,col 26)",
        "(line 433,col 9)-(line 433,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.equals(java.lang.Object)",
      "begin_line": 444,
      "end_line": 456,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 63)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.hashCode()",
      "begin_line": 463,
      "end_line": 470,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 25)",
        "(line 465,col 9)-(line 465,col 64)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.clone()",
      "begin_line": 479,
      "end_line": 484,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 481,col 55)",
        "(line 482,col 9)-(line 482,col 65)",
        "(line 483,col 9)-(line 483,col 21)"
      ]
    }
  ]
}