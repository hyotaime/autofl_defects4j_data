{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/time/ohlc/OHLCSeriesCollection.java",
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
      "begin_line": 61,
      "end_line": 354,
      "comment": "\r\n * A collection of {@link OHLCSeries} objects.\r\n *\r\n * @since 1.0.4\r\n *\r\n * @see OHLCSeries\r\n "
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
      "type": "field",
      "varNames": [
        "xPosition"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.OHLCSeriesCollection()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " \r\n     * Creates a new instance of \u003ccode\u003eOHLCSeriesCollection\u003c/code\u003e. \r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.addSeries(org.jfree.data.time.ohlc.OHLCSeries)",
      "begin_line": 82,
      "end_line": 89,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesCount()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeries(int)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getSeriesKey(int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getItemCount(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "\r\n     * Returns the x-value for a time period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 25)",
        "(line 157,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getXValue(int, int)",
      "begin_line": 177,
      "end_line": 182,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 58)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 181,col 9)-(line 181,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getX(int, int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getY(int, int)",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The y-value.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 58)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 207,col 9)-(line 207,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpenValue(int, int)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 58)",
        "(line 220,col 9)-(line 220,col 53)",
        "(line 221,col 9)-(line 221,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getOpen(int, int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the open-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getCloseValue(int, int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 58)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 247,col 9)-(line 247,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getClose(int, int)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the close-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHighValue(int, int)",
      "begin_line": 270,
      "end_line": 274,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 58)",
        "(line 272,col 9)-(line 272,col 53)",
        "(line 273,col 9)-(line 273,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getHigh(int, int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n     * Returns the high-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLowValue(int, int)",
      "begin_line": 296,
      "end_line": 300,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 58)",
        "(line 298,col 9)-(line 298,col 53)",
        "(line 299,col 9)-(line 299,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getLow(int, int)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the low-value for an item within a series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolume(int, int)",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.getVolumeValue(int, int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.equals(java.lang.Object)",
      "begin_line": 329,
      "end_line": 338,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean. \r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 63)",
        "(line 337,col 9)-(line 337,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.ohlc.OHLCSeriesCollection.clone()",
      "begin_line": 347,
      "end_line": 352,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 350,col 65)",
        "(line 351,col 9)-(line 351,col 21)"
      ]
    }
  ]
}