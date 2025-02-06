{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/DefaultHighLowDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultHighLowDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "org.jfree.data.xy.SelectableXYDataset",
        "org.jfree.data.xy.XYDatasetSelectionState",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 62,
      "end_line": 464,
      "comment": "\r\n * A simple implementation of the {@link OHLCDataset} interface.  See also\r\n * the {@link DefaultOHLCDataset} class, which provides another implementation\r\n * that is very similar.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKey"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "date"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Storage for the dates. "
    },
    {
      "type": "field",
      "varNames": [
        "high"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Storage for the high values. "
    },
    {
      "type": "field",
      "varNames": [
        "low"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Storage for the low values. "
    },
    {
      "type": "field",
      "varNames": [
        "open"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Storage for the open values. "
    },
    {
      "type": "field",
      "varNames": [
        "close"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Storage for the close values. "
    },
    {
      "type": "field",
      "varNames": [
        "volume"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Storage for the volume values. "
    },
    {
      "type": "field",
      "varNames": [
        "selected"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.DefaultHighLowDataset(java.lang.Comparable, java.util.Date[], double[], double[], double[], double[], double[])",
      "begin_line": 104,
      "end_line": 124,
      "comment": "\r\n     * Constructs a new high/low/open/close dataset.\r\n     * \u003cp\u003e\r\n     * The current implementation allows only one series in the dataset.\r\n     * This may be extended in a future version.\r\n     *\r\n     * @param seriesKey  the key for the series (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param date  the dates (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param high  the high values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param low  the low values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param open  the open values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param close  the close values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param volume  the volume values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 35)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 54)",
        "(line 117,col 9)-(line 117,col 44)",
        "(line 118,col 9)-(line 118,col 42)",
        "(line 119,col 9)-(line 119,col 44)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 48)",
        "(line 123,col 9)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesKey(int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns the key for the series stored in this dataset.\r\n     *\r\n     * @param series  the index of the series (ignored, this dataset supports\r\n     *     only one series and this method always returns the key for series 0).\r\n     *\r\n     * @return The series key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getX(int, int)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the x-value for one item in a series.  The value returned is a\r\n     * \u003ccode\u003eLong\u003c/code\u003e instance generated from the underlying\r\n     * \u003ccode\u003eDate\u003c/code\u003e object.  To avoid generating a new object instance,\r\n     * you might prefer to call {@link #getXValue(int, int)}.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     * @see #getXDate(int, int)\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getXDate(int, int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the x-value for one item in a series, as a Date.\r\n     * \u003cp\u003e\r\n     * This method is provided for convenience only.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The x-value as a Date.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getY(int, int)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the y-value for one item in a series.\r\n     * \u003cp\u003e\r\n     * This method (from the {@link XYDataset} interface) is mapped to the\r\n     * {@link #getCloseValue(int, int)} method.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHigh(int, int)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the high-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     *\r\n     * @see #getHighValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getHighValue(int, int)",
      "begin_line": 214,
      "end_line": 221,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The high-value.\r\n     *\r\n     * @see #getHigh(int, int)\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 35)",
        "(line 216,col 9)-(line 216,col 41)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLow(int, int)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n     * Returns the low-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     *\r\n     * @see #getLowValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getLowValue(int, int)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The low-value.\r\n     *\r\n     * @see #getLow(int, int)\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 35)",
        "(line 250,col 9)-(line 250,col 42)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpen(int, int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Returns the open-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     *\r\n     * @see #getOpenValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getOpenValue(int, int)",
      "begin_line": 282,
      "end_line": 289,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The open-value.\r\n     *\r\n     * @see #getOpen(int, int)\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 35)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getClose(int, int)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Returns the close-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     *\r\n     * @see #getCloseValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getCloseValue(int, int)",
      "begin_line": 316,
      "end_line": 323,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The close-value.\r\n     *\r\n     * @see #getClose(int, int)\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 46)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolume(int, int)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the volume-value for one item in a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     *\r\n     * @see #getVolumeValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getVolumeValue(int, int)",
      "begin_line": 350,
      "end_line": 357,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The volume-value.\r\n     *\r\n     * @see #getVolume(int, int)\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 35)",
        "(line 352,col 9)-(line 352,col 48)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getSeriesCount()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     * \u003cp\u003e\r\n     * This implementation only allows one series.\r\n     *\r\n     * @return The number of series.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.getItemCount(int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the index (zero-based) of the series.\r\n     *\r\n     * @return The number of items in the specified series.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.equals(java.lang.Object)",
      "begin_line": 388,
      "end_line": 418,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary instance.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.createNumberArray(double[])",
      "begin_line": 428,
      "end_line": 434,
      "comment": "\r\n     * Constructs an array of Number objects from an array of doubles.\r\n     *\r\n     * @param data  the double values to convert (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @return The data as an array of Number objects.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 50)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.isSelected(int, int)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.setSelected(int, int, boolean)",
      "begin_line": 440,
      "end_line": 442,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.setSelected(int, int, boolean, boolean)",
      "begin_line": 444,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 39)",
        "(line 450,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.fireSelectionEvent()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultHighLowDataset.clearSelection()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 42)",
        "(line 461,col 9)-(line 461,col 29)"
      ]
    }
  ]
}