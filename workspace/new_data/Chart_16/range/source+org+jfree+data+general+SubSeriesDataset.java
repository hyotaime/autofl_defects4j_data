{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/SubSeriesDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SubSeriesDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.OHLCDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.general.CombinationDataset"
      ],
      "begin_line": 64,
      "end_line": 441,
      "comment": "\r\n * This class will create a dataset with one or more series from another\r\n * {@link SeriesDataset}. \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "parent"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The parent dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " maps our series into our parent\u0027s"
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SubSeriesDataset.SubSeriesDataset(org.jfree.data.general.SeriesDataset, int[])",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\r\n     * Creates a SubSeriesDataset using one or more series from \r\n     * \u003ccode\u003eparent\u003c/code\u003e.  The series to use are passed as an array of int.\r\n     *\r\n     * @param parent  underlying dataset\r\n     * @param map  int[] of series from parent to include in this Dataset\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 29)",
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.SubSeriesDataset.SubSeriesDataset(org.jfree.data.general.SeriesDataset, int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a SubSeriesDataset using one series from \u003ccode\u003eparent\u003c/code\u003e.\r\n     * The series to is passed as an int.\r\n     *\r\n     * @param parent  underlying dataset\r\n     * @param series  series from parent to include in this Dataset\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getHigh(int, int)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns the high-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The high-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getHighValue(int, int)",
      "begin_line": 126,
      "end_line": 133,
      "comment": "\r\n     * Returns the high-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The high-value.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getLow(int, int)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Returns the low-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The low-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getLowValue(int, int)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\r\n     * Returns the low-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The low-value.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 35)",
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getOpen(int, int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns the open-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The open-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getOpenValue(int, int)",
      "begin_line": 192,
      "end_line": 199,
      "comment": "\r\n     * Returns the open-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The open-value.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 194,col 44)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getClose(int, int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the close-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The close-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getCloseValue(int, int)",
      "begin_line": 225,
      "end_line": 232,
      "comment": "\r\n     * Returns the close-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The close-value.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 35)",
        "(line 227,col 9)-(line 227,col 46)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getVolume(int, int)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\r\n     * Returns the volume.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link OHLCDataset}.\r\n     *\r\n     * @param series  the series (zero based index).\r\n     * @param item  the item (zero based index).\r\n     *\r\n     * @return The volume.\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getVolumeValue(int, int)",
      "begin_line": 258,
      "end_line": 265,
      "comment": "\r\n     * Returns the volume-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The volume-value.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 35)",
        "(line 260,col 9)-(line 260,col 48)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getX(int, int)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns the X-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based);\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The X-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getY(int, int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the Y-value for the specified series and item.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The Y-value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getItemCount(int)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\r\n     * Returns the number of items in a series.\r\n     * \u003cp\u003e\r\n     * Note: throws \u003ccode\u003eClassCastException\u003c/code\u003e if the series if not from a \r\n     * {@link XYDataset}.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     *\r\n     * @return The number of items in a series.\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getSeriesCount()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The number of series in the dataset.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getSeriesKey(int)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The name of a series.\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getStartX(int, int)",
      "begin_line": 351,
      "end_line": 360,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The starting X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getEndX(int, int)",
      "begin_line": 370,
      "end_line": 379,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The ending X value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getStartY(int, int)",
      "begin_line": 389,
      "end_line": 398,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The starting Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getEndY(int, int)",
      "begin_line": 408,
      "end_line": 417,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the index of the series of interest (zero-based).\r\n     * @param item  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The ending Y value for the specified series and item.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getParent()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Returns the parent Dataset of this combination.\r\n     *\r\n     * @return The parent Dataset of this combination.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.SubSeriesDataset.getMap()",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\r\n     * Returns a map or indirect indexing form our series into parent\u0027s series.\r\n     *\r\n     * @return A map or indirect indexing form our series into parent\u0027s series.\r\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 40)"
      ]
    }
  ]
}