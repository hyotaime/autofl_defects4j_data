{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/DefaultHighLowDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultHighLowDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 61,
      "end_line": 430,
      "comment": "\r\n * A simple implementation of the {@link OHLCDataset} interface.  See also\r\n * the {@link DefaultOHLCDataset} class, which provides another implementation\r\n * that is very similar.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "date"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "high"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Storage for the high values. "
    },
    {
      "type": "field",
      "varNames": [
        "low"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Storage for the low values. "
    },
    {
      "type": "field",
      "varNames": [
        "open"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the open values. "
    },
    {
      "type": "field",
      "varNames": [
        "close"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Storage for the close values. "
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Storage for the volume values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.DefaultHighLowDataset(java.lang.Comparable, java.util.Date[], double[], double[], double[], double[], double[])",
      "begin_line": 100,
      "end_line": 118,
      "comment": "\r\n     * Constructs a new high/low/open/close dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param date  the dates (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param high  the high values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param low  the low values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param open  the open values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param close  the close values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param volume  the volume values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 44)",
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 116,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesKey(int)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the key for the series stored in this dataset.\r\n     *\r\n     * @param series  the index of the series (ignored, this dataset supports\r\n     *     only one series and this method always returns the key for series 0).\r\n     *\r\n     * @return The series key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getX(int, int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Returns the x-value for one item in a series.  The value returned is a\r\n     * \u003ccode\u003eLong\u003c/code\u003e instance generated from the underlying\r\n     * \u003ccode\u003eDate\u003c/code\u003e object.  To avoid generating a new object instance,\r\n     * you might prefer to call {@link #getXValue(int, int)}.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     * @see #getXDate(int, int)\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getXDate(int, int)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getY(int, int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the {@link XYDataset} interface) is mapped to the\r\n     * {@link #getCloseValue(int, int)} method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHigh(int, int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the high-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     *\r\n     * @see #getHighValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHighValue(int, int)",
      "begin_line": 208,
      "end_line": 215,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     *\r\n     * @see #getHigh(int, int)\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)",
        "(line 210,col 9)-(line 210,col 44)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLow(int, int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Returns the low-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     *\r\n     * @see #getLowValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLowValue(int, int)",
      "begin_line": 242,
      "end_line": 249,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     *\r\n     * @see #getLow(int, int)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 35)",
        "(line 244,col 9)-(line 244,col 42)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpen(int, int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Returns the open-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     *\r\n     * @see #getOpenValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpenValue(int, int)",
      "begin_line": 276,
      "end_line": 283,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     *\r\n     * @see #getOpen(int, int)\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 44)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getClose(int, int)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the close-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     *\r\n     * @see #getCloseValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getCloseValue(int, int)",
      "begin_line": 310,
      "end_line": 317,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     *\r\n     * @see #getClose(int, int)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 35)",
        "(line 312,col 9)-(line 312,col 46)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolume(int, int)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\r\n     * Returns the volume-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     *\r\n     * @see #getVolumeValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolumeValue(int, int)",
      "begin_line": 344,
      "end_line": 351,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     *\r\n     * @see #getVolume(int, int)\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 35)",
        "(line 346,col 9)-(line 346,col 48)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesCount()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getItemCount(int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.equals(java.lang.Object)",
      "begin_line": 382,
      "end_line": 412,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary instance.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 65)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(double[])",
      "begin_line": 422,
      "end_line": 428,
      "comment": "\r\n     * Constructs an array of Number objects from an array of doubles.\r\n     *\r\n     * @param data  the double values to convert (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @return The data as an array of Number objects.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 50)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 22)"
      ]
    }
  ]
}