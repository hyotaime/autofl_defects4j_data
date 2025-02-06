{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/DefaultIntervalXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIntervalXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 66,
      "end_line": 553,
      "comment": "\r\n * A dataset that defines a range (interval) for both the x-values and the\r\n * y-values.  This implementation uses six arrays to store the x, start-x,\r\n * end-x, y, start-y and end-y values.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * An alternative implementation of the {@link IntervalXYDataset} interface\r\n * is provided by the {@link XYIntervalSeriesCollection} class.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\r\n     * Storage for the series keys.  This list must be kept in sync with the\r\n     * seriesList.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\r\n     * Storage for the series in the dataset.  We use a list because the\r\n     * order of the series is significant.  This list must be kept in sync\r\n     * with the seriesKeys list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.DefaultIntervalXYDataset()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\r\n     * Creates a new \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e instance, initially\r\n     * containing no data.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getSeriesCount()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getSeriesKey(int)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getItemCount(int)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 74)",
        "(line 134,col 9)-(line 134,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getXValue(int, int)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 73)",
        "(line 156,col 9)-(line 156,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getYValue(int, int)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 73)",
        "(line 178,col 9)-(line 178,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartXValue(int, int)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\r\n     * Returns the starting x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The starting x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getStartX(int, int)\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 73)",
        "(line 200,col 9)-(line 200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndXValue(int, int)",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\r\n     * Returns the ending x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The ending x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getEndX(int, int)\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 73)",
        "(line 222,col 9)-(line 222,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartYValue(int, int)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\r\n     * Returns the starting y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The starting y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getStartY(int, int)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 73)",
        "(line 244,col 9)-(line 244,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndYValue(int, int)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Returns the ending y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The ending y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getEndY(int, int)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 73)",
        "(line 266,col 9)-(line 266,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndX(int, int)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the ending x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The ending x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndY(int, int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the ending y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The ending y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getEndYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartX(int, int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\r\n     * Returns the starting x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The starting x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartY(int, int)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\r\n     * Returns the starting y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The starting y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getStartYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getX(int, int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getY(int, int)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.addSeries(java.lang.Comparable, double[][])",
      "begin_line": 406,
      "end_line": 436,
      "comment": "\r\n     * Adds a series or if a series with the same key already exists replaces\r\n     * the data for that series, then sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data (must be an array with length 6, containing six\r\n     *     arrays of equal length, the first three containing the x-values\r\n     *     (x, xLow and xHigh) and the last three containing the y-values\r\n     *     (y, yLow and yHigh)).\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 36)",
        "(line 419,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 45)",
        "(line 426,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.equals(java.lang.Object)",
      "begin_line": 454,
      "end_line": 500,
      "comment": "\r\n     * Tests this \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e instance for equality\r\n     * with an arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and\r\n     * only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of\r\n     *         \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth datasets have the same number of series, each containing\r\n     *         exactly the same values.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 71)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.hashCode()",
      "begin_line": 507,
      "end_line": 512,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 19)",
        "(line 509,col 9)-(line 509,col 44)",
        "(line 510,col 9)-(line 510,col 58)",
        "(line 511,col 9)-(line 511,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.clone()",
      "begin_line": 522,
      "end_line": 551,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset contains a series with\r\n     *         a key that cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 524,col 59)",
        "(line 525,col 9)-(line 525,col 68)",
        "(line 526,col 9)-(line 526,col 65)",
        "(line 527,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 21)"
      ]
    }
  ]
}