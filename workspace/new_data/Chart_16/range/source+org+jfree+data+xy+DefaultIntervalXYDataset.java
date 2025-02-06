{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/DefaultIntervalXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultIntervalXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset"
      ],
      "begin_line": 62,
      "end_line": 546,
      "comment": "\r\n * A dataset that defines a range (interval) for both the x-values and the\r\n * y-values.  This implementation uses six arrays to store the x, start-x,\r\n * end-x, y, start-y and end-y values.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * An alternative implementation of the {@link IntervalXYDataset} interface\r\n * is provided by the {@link XYIntervalSeriesCollection} class.\r\n * \r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\r\n     * Storage for the series keys.  This list must be kept in sync with the\r\n     * seriesList.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " \r\n     * Storage for the series in the dataset.  We use a list because the\r\n     * order of the series is significant.  This list must be kept in sync \r\n     * with the seriesKeys list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.DefaultIntervalXYDataset()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\r\n     * Creates a new \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e instance, initially \r\n     * containing no data.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getSeriesCount()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getSeriesKey(int)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\r\n     * Returns the key for a series.  \r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getItemCount(int)",
      "begin_line": 124,
      "end_line": 130,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * \r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 74)",
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getXValue(int, int)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 73)",
        "(line 151,col 9)-(line 151,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getYValue(int, int)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 73)",
        "(line 173,col 9)-(line 173,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartXValue(int, int)",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\r\n     * Returns the starting x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The starting x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getStartX(int, int)\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndXValue(int, int)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\r\n     * Returns the ending x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The ending x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getEndX(int, int)\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 73)",
        "(line 217,col 9)-(line 217,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartYValue(int, int)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\r\n     * Returns the starting y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The starting y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getStartY(int, int)\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 73)",
        "(line 239,col 9)-(line 239,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndYValue(int, int)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\r\n     * Returns the ending y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The ending y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getEndY(int, int)\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 73)",
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndX(int, int)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\r\n     * Returns the ending x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The ending x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getEndXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getEndY(int, int)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns the ending y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The ending y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getEndYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartX(int, int)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\r\n     * Returns the starting x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The starting x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getStartXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getStartY(int, int)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Returns the starting y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The starting y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getStartYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getX(int, int)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.getY(int, int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getYValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.addSeries(java.lang.Comparable, double[][])",
      "begin_line": 400,
      "end_line": 429,
      "comment": "\r\n     * Adds a series or if a series with the same key already exists replaces\r\n     * the data for that series, then sends a {@link DatasetChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data (must be an array with length 6, containing six \r\n     *     arrays of equal length, the first containing the x-values and the\r\n     *     second containing the y-values). \r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 45)",
        "(line 420,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.equals(java.lang.Object)",
      "begin_line": 447,
      "end_line": 493,
      "comment": "\r\n     * Tests this \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e instance for equality \r\n     * with an arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and \r\n     * only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \r\n     *         \u003ccode\u003eDefaultIntervalXYDataset\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth datasets have the same number of series, each containing \r\n     *         exactly the same values.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 71)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.hashCode()",
      "begin_line": 500,
      "end_line": 505,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 19)",
        "(line 502,col 9)-(line 502,col 44)",
        "(line 503,col 9)-(line 503,col 58)",
        "(line 504,col 9)-(line 504,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultIntervalXYDataset.clone()",
      "begin_line": 515,
      "end_line": 544,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the dataset contains a series with\r\n     *         a key that cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 517,col 59)",
        "(line 518,col 9)-(line 518,col 68)",
        "(line 519,col 9)-(line 519,col 65)",
        "(line 520,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 21)"
      ]
    }
  ]
}