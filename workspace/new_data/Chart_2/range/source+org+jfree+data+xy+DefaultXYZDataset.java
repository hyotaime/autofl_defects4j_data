{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/DefaultXYZDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultXYZDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYZDataset",
        "org.jfree.data.xy.XYZDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 62,
      "end_line": 432,
      "comment": "\r\n * A default implementation of the {@link XYZDataset} interface that stores\r\n * data values in arrays of double primitives.\r\n *\r\n * @since 1.0.2\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\r\n     * Storage for the series keys.  This list must be kept in sync with the\r\n     * seriesList.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * Storage for the series in the dataset.  We use a list because the\r\n     * order of the series is significant.  This list must be kept in sync\r\n     * with the seriesKeys list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.DefaultXYZDataset()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\r\n     * Creates a new \u003ccode\u003eDefaultXYZDataset\u003c/code\u003e instance, initially\r\n     * containing no data.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getSeriesCount()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getSeriesKey(int)",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.indexOf(java.lang.Comparable)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns the index of the series with the specified key, or -1 if there\r\n     * is no such series in the dataset.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The index, or -1.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getDomainOrder()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the order of the domain (x-) values in the dataset.  In this\r\n     * implementation, we cannot guarantee that the x-values are ordered, so\r\n     * this method returns \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     *\r\n     * @return \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getItemCount(int)",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 74)",
        "(line 153,col 9)-(line 153,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getXValue(int, int)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 73)",
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getX(int, int)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getYValue(int, int)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 73)",
        "(line 218,col 9)-(line 218,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getY(int, int)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getZValue(int, int)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\r\n     * Returns the z-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The z-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getZ(int, int)\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 73)",
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getZ(int, int)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\r\n     * Returns the z-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The z-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getZ(int, int)\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.addSeries(java.lang.Comparable, double[][])",
      "begin_line": 296,
      "end_line": 324,
      "comment": "\r\n     * Adds a series or if a series with the same key already exists replaces\r\n     * the data for that series, then sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data (must be an array with length 3, containing three\r\n     *     arrays of equal length, the first containing the x-values, the\r\n     *     second containing the y-values and the third containing the\r\n     *     z-values).\r\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 45)",
        "(line 314,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.removeSeries(java.lang.Comparable)",
      "begin_line": 333,
      "end_line": 341,
      "comment": "\r\n     * Removes a series from the dataset, then sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 45)",
        "(line 335,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.equals(java.lang.Object)",
      "begin_line": 358,
      "end_line": 389,
      "comment": "\r\n     * Tests this \u003ccode\u003eDefaultXYDataset\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of\r\n     *         \u003ccode\u003eDefaultXYDataset\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth datasets have the same number of series, each containing\r\n     *         exactly the same values.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 57)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.hashCode()",
      "begin_line": 396,
      "end_line": 401,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 19)",
        "(line 398,col 9)-(line 398,col 44)",
        "(line 399,col 9)-(line 399,col 58)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.clone()",
      "begin_line": 412,
      "end_line": 430,
      "comment": "\r\n     * Creates an independent copy of this dataset.\r\n     *\r\n     * @return The cloned dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *     dataset (for instance, if a non-cloneable object is used for a\r\n     *     series key).\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 68)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 415,col 65)",
        "(line 416,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 21)"
      ]
    }
  ]
}