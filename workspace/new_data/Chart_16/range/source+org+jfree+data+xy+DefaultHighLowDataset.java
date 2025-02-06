{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/DefaultHighLowDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultHighLowDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset"
      ],
      "begin_line": 58,
      "end_line": 427,
      "comment": "\r\n * A simple implementation of the {@link OHLCDataset} interface.  See also\r\n * the {@link DefaultOHLCDataset} class, which provides another implementation\r\n * that is very similar.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "date"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "high"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Storage for the high values. "
    },
    {
      "type": "field",
      "varNames": [
        "low"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Storage for the low values. "
    },
    {
      "type": "field",
      "varNames": [
        "open"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Storage for the open values. "
    },
    {
      "type": "field",
      "varNames": [
        "close"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the close values. "
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Storage for the volume values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.DefaultHighLowDataset(java.lang.Comparable, java.util.Date[], double[], double[], double[], double[], double[])",
      "begin_line": 97,
      "end_line": 115,
      "comment": "\r\n     * Constructs a new high/low/open/close dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     * @param date  the dates (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param high  the high values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param low  the low values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param open  the open values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param close  the close values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param volume  the volume values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 35)",
        "(line 108,col 9)-(line 108,col 25)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 42)",
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 113,col 9)-(line 113,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesKey(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the key for the series stored in this dataset.\r\n     *\r\n     * @param series  the index of the series (ignored, this dataset supports \r\n     *     only one series and this method always returns the key for series 0).\r\n     * \r\n     * @return The series key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getX(int, int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the x-value for one item in a series.  The value returned is a \r\n     * \u003ccode\u003eLong\u003c/code\u003e instance generated from the underlying \r\n     * \u003ccode\u003eDate\u003c/code\u003e object.  To avoid generating a new object instance,\r\n     * you might prefer to call {@link #getXValue(int, int)}.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     * @see #getXDate(int, int)\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getXDate(int, int)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     * \r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getY(int, int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the {@link XYDataset} interface) is mapped to the \r\n     * {@link #getCloseValue(int, int)} method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     * \r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHigh(int, int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the high-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     * \r\n     * @see #getHighValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHighValue(int, int)",
      "begin_line": 205,
      "end_line": 212,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The high-value.\r\n     * \r\n     * @see #getHigh(int, int)\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 35)",
        "(line 207,col 9)-(line 207,col 44)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLow(int, int)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the low-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     * \r\n     * @see #getLowValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLowValue(int, int)",
      "begin_line": 239,
      "end_line": 246,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The low-value.\r\n     * \r\n     * @see #getLow(int, int)\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 42)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpen(int, int)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the open-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     * \r\n     * @see #getOpenValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpenValue(int, int)",
      "begin_line": 273,
      "end_line": 280,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The open-value.\r\n     * \r\n     * @see #getOpen(int, int)\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 35)",
        "(line 275,col 9)-(line 275,col 44)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getClose(int, int)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\r\n     * Returns the close-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     * \r\n     * @see #getCloseValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getCloseValue(int, int)",
      "begin_line": 307,
      "end_line": 314,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The close-value.\r\n     * \r\n     * @see #getClose(int, int)\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 35)",
        "(line 309,col 9)-(line 309,col 46)",
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolume(int, int)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the volume-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     * \r\n     * @see #getVolumeValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolumeValue(int, int)",
      "begin_line": 341,
      "end_line": 348,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The volume-value.\r\n     * \r\n     * @see #getVolume(int, int)\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 35)",
        "(line 343,col 9)-(line 343,col 48)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesCount()",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getItemCount(int)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.equals(java.lang.Object)",
      "begin_line": 379,
      "end_line": 409,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 65)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(double[])",
      "begin_line": 419,
      "end_line": 425,
      "comment": "\r\n     * Constructs an array of Number objects from an array of doubles.\r\n     *\r\n     * @param data  the double values to convert (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     *\r\n     * @return The data as an array of Number objects.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 50)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 22)"
      ]
    }
  ]
}