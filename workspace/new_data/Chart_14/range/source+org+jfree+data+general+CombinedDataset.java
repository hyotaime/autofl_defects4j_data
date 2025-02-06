{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/general/CombinedDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.XYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.general.CombinationDataset"
      ],
      "begin_line": 70,
      "end_line": 629,
      "comment": "\r\n * This class can combine instances of {@link XYDataset}, {@link OHLCDataset} \r\n * and {@link IntervalXYDataset} together exposing the union of all the series \r\n * under one dataset.  \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "datasetInfo"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the datasets we combine. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.CombinedDataset.CombinedDataset()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Default constructor for an empty combination.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.CombinedDataset.CombinedDataset(org.jfree.data.general.SeriesDataset[])",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Creates a CombinedDataset initialized with an array of SeriesDatasets.\r\n     *\r\n     * @param data  array of SeriesDataset that contains the SeriesDatasets to \r\n     *              combine.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.add(org.jfree.data.general.SeriesDataset)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\r\n     * Adds one SeriesDataset to the combination. Listeners are notified of the\r\n     * change.\r\n     *\r\n     * @param data  the SeriesDataset to add.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 70)",
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.add(org.jfree.data.general.SeriesDataset[])",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\r\n     * Adds an array of SeriesDataset\u0027s to the combination. Listeners are\r\n     * notified of the change.\r\n     *\r\n     * @param data  array of SeriesDataset to add\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 70)",
        "(line 120,col 9)-(line 120,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.add(org.jfree.data.general.SeriesDataset, int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Adds one series from a SeriesDataset to the combination. Listeners are\r\n     * notified of the change.\r\n     *\r\n     * @param data  the SeriesDataset where series is contained\r\n     * @param series  series to add\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.fastAdd(org.jfree.data.general.SeriesDataset)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\r\n     * Fast add of a SeriesDataset. Does not notify listeners of the change.\r\n     *\r\n     * @param data  SeriesDataset to add\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getSeriesCount()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The number of series in the dataset.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getSeriesKey(int)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getX(int, int)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\r\n     * Returns the X-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from \r\n     * a {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The X-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 48)",
        "(line 188,col 9)-(line 188,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getY(int, int)",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\r\n     * Returns the Y-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from \r\n     * a {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The Y-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 48)",
        "(line 204,col 9)-(line 204,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getItemCount(int)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from \r\n     * a {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     *\r\n     * @return The number of items in a series.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 48)",
        "(line 219,col 9)-(line 219,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getHigh(int, int)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\r\n     * Returns the high-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from a\r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The high-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 48)",
        "(line 239,col 9)-(line 239,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getHighValue(int, int)",
      "begin_line": 251,
      "end_line": 258,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getLow(int, int)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\r\n     * Returns the low-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from a\r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The low-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 48)",
        "(line 273,col 9)-(line 273,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getLowValue(int, int)",
      "begin_line": 285,
      "end_line": 292,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 35)",
        "(line 287,col 9)-(line 287,col 42)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getOpen(int, int)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\r\n     * Returns the open-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from a\r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The open-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 48)",
        "(line 307,col 9)-(line 307,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getOpenValue(int, int)",
      "begin_line": 319,
      "end_line": 326,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 321,col 44)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getClose(int, int)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\r\n     * Returns the close-value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from a\r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The close-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 48)",
        "(line 341,col 9)-(line 341,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getCloseValue(int, int)",
      "begin_line": 353,
      "end_line": 360,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 46)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getVolume(int, int)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\r\n     * Returns the volume value for the specified series and item.\r\n     * \u003cP\u003e\r\n     * Note:  throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series is not from a\r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The volume value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 48)",
        "(line 375,col 9)-(line 375,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getVolumeValue(int, int)",
      "begin_line": 387,
      "end_line": 394,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The volume-value.\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 35)",
        "(line 389,col 9)-(line 389,col 48)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getStartX(int, int)",
      "begin_line": 408,
      "end_line": 416,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 48)",
        "(line 410,col 9)-(line 415,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getEndX(int, int)",
      "begin_line": 426,
      "end_line": 434,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 48)",
        "(line 428,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getStartY(int, int)",
      "begin_line": 444,
      "end_line": 452,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 48)",
        "(line 446,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getEndY(int, int)",
      "begin_line": 462,
      "end_line": 470,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 48)",
        "(line 464,col 9)-(line 469,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getParent()",
      "begin_line": 483,
      "end_line": 504,
      "comment": "\r\n     * Returns the parent Dataset of this combination. If there is more than\r\n     * one parent, or a child is found that is not a CombinationDataset, then\r\n     * returns \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @return The parent Dataset of this combination or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getMap()",
      "begin_line": 516,
      "end_line": 533,
      "comment": "\r\n     * Returns a map or indirect indexing form our series into parent\u0027s series.\r\n     * Prior to calling this method, the client should check getParent() to make\r\n     * sure the CombinationDataset uses the same parent. If not, the map\r\n     * returned by this method will be invalid or null.\r\n     *\r\n     * @return A map or indirect indexing form our series into parent\u0027s series.\r\n     *\r\n     * @see #getParent()\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 25)",
        "(line 519,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getChildPosition(org.jfree.data.general.Dataset)",
      "begin_line": 546,
      "end_line": 567,
      "comment": "\r\n     * Returns the child position.\r\n     *\r\n     * @param child  the child dataset.\r\n     *\r\n     * @return The position.\r\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 18)",
        "(line 549,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.getDatasetInfo(int)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\r\n     * Returns the DatasetInfo object associated with the series.\r\n     *\r\n     * @param series  the index of the series.\r\n     *\r\n     * @return The DatasetInfo object associated with the series.\r\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.CombinedDataset.joinMap(int[], int[])",
      "begin_line": 592,
      "end_line": 603,
      "comment": "\r\n     * Joins two map arrays (int[]) together.\r\n     *\r\n     * @param a  the first array.\r\n     * @param b  the second array.\r\n     *\r\n     * @return A copy of { a[], b[] }.\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 600,col 52)",
        "(line 601,col 9)-(line 601,col 59)",
        "(line 602,col 9)-(line 602,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DatasetInfo",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 609,
      "end_line": 627,
      "comment": "\r\n     * Private class to store as pairs (SeriesDataset, series) for all combined\r\n     * series.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 612,
      "end_line": 612,
      "comment": " The dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "series"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": " The series. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.CombinedDataset.DatasetInfo.DatasetInfo(org.jfree.data.general.SeriesDataset, int)",
      "begin_line": 623,
      "end_line": 626,
      "comment": "\r\n         * Creates a new dataset info record.\r\n         *\r\n         * @param data  the dataset.\r\n         * @param series  the series.\r\n         ",
      "child_ranges": [
        "(line 624,col 13)-(line 624,col 29)",
        "(line 625,col 13)-(line 625,col 33)"
      ]
    }
  ]
}