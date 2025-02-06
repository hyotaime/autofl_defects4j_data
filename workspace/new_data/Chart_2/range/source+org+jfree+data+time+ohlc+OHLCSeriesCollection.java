{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/time/ohlc/OHLCSeriesCollection.java",
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
      "begin_line": 67,
      "end_line": 491,
      "comment": "\r\n * A collection of {@link OHLCSeries} objects.\r\n *\r\n * @since 1.0.4\r\n *\r\n * @see OHLCSeries\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Storage for the data series. "
    },
    {
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.OHLCSeriesCollection()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\r\n     * Creates a new instance of \u003ccode\u003eOHLCSeriesCollection\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getXPosition()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Returns the position within each time period that is used for the X\r\n     * value when the collection is used as an {@link XYDataset}.\r\n     *\r\n     * @return The anchor position (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.setXPosition(org.jfree.data.time.TimePeriodAnchor)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\r\n     * Sets the position within each time period that is used for the X values\r\n     * when the collection is used as an {@link XYDataset}, then sends a\r\n     * {@link DatasetChangeEvent} is sent to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.11\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 32)",
        "(line 108,col 9)-(line 108,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.addSeries(org.jfree.data.time.ohlc.OHLCSeries)",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesCount()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeries(int)",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesKey(int)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getItemCount(int)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getXValue(int, int)",
      "begin_line": 214,
      "end_line": 219,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 58)",
        "(line 216,col 9)-(line 216,col 53)",
        "(line 217,col 9)-(line 217,col 50)",
        "(line 218,col 9)-(line 218,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(int, int)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getY(int, int)",
      "begin_line": 241,
      "end_line": 245,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 58)",
        "(line 243,col 9)-(line 243,col 53)",
        "(line 244,col 9)-(line 244,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpenValue(int, int)",
      "begin_line": 255,
      "end_line": 259,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 58)",
        "(line 257,col 9)-(line 257,col 53)",
        "(line 258,col 9)-(line 258,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpen(int, int)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getCloseValue(int, int)",
      "begin_line": 281,
      "end_line": 285,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 58)",
        "(line 283,col 9)-(line 283,col 53)",
        "(line 284,col 9)-(line 284,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getClose(int, int)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHighValue(int, int)",
      "begin_line": 307,
      "end_line": 311,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 58)",
        "(line 309,col 9)-(line 309,col 53)",
        "(line 310,col 9)-(line 310,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHigh(int, int)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLowValue(int, int)",
      "begin_line": 333,
      "end_line": 337,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 58)",
        "(line 335,col 9)-(line 335,col 53)",
        "(line 336,col 9)-(line 336,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLow(int, int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolume(int, int)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e always, because this dataset doesn\u0027t record\r\n     * any volume data.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (ignored).\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolumeValue(int, int)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\r\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e always, because this dataset doesn\u0027t\r\n     * record any volume data.\r\n     *\r\n     * @param series  the series index (ignored).\r\n     * @param item  the item index (ignored).\r\n     *\r\n     * @return \u003ccode\u003eDouble.NaN\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeSeries(int)",
      "begin_line": 385,
      "end_line": 390,
      "comment": "\r\n     * Removes the series with the specified index and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the series index.\r\n     * \r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 45)",
        "(line 387,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeSeries(org.jfree.data.time.ohlc.OHLCSeries)",
      "begin_line": 403,
      "end_line": 414,
      "comment": "\r\n     * Removes the specified series from the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the series was removed, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 51)",
        "(line 408,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.removeAllSeries()",
      "begin_line": 422,
      "end_line": 440,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 430,col 9)-(line 433,col 9)",
        "(line 436,col 9)-(line 436,col 26)",
        "(line 437,col 9)-(line 437,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.equals(java.lang.Object)",
      "begin_line": 449,
      "end_line": 461,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 63)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.hashCode()",
      "begin_line": 468,
      "end_line": 475,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 25)",
        "(line 470,col 9)-(line 470,col 64)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.clone()",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 486,col 55)",
        "(line 487,col 9)-(line 487,col 65)",
        "(line 488,col 9)-(line 488,col 21)"
      ]
    }
  ]
}