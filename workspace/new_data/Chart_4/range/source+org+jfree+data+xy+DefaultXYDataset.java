{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/DefaultXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYDataset",
        "org.jfree.data.xy.XYDataset",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 61,
      "end_line": 376,
      "comment": "\r\n * A default implementation of the {@link XYDataset} interface that stores\r\n * data values in arrays of double primitives.\r\n *\r\n * @since 1.0.2\r\n "
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
      "comment": "\r\n     * Storage for the series in the dataset.  We use a list because the\r\n     * order of the series is significant.  This list must be kept in sync\r\n     * with the seriesKeys list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultXYDataset.DefaultXYDataset()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\r\n     * Creates a new \u003ccode\u003eDefaultXYDataset\u003c/code\u003e instance, initially\r\n     * containing no data.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getSeriesCount()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getSeriesKey(int)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.indexOf(java.lang.Comparable)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the index of the series with the specified key, or -1 if there\r\n     * is no such series in the dataset.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The index, or -1.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getDomainOrder()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns the order of the domain (x-) values in the dataset.  In this\r\n     * implementation, we cannot guarantee that the x-values are ordered, so\r\n     * this method returns \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     *\r\n     * @return \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getItemCount(int)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 74)",
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getXValue(int, int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 73)",
        "(line 174,col 9)-(line 174,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getX(int, int)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The x-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getYValue(int, int)",
      "begin_line": 215,
      "end_line": 218,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 73)",
        "(line 217,col 9)-(line 217,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.getY(int, int)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not\r\n     *     within the specified range.\r\n     *\r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.addSeries(java.lang.Comparable, double[][])",
      "begin_line": 251,
      "end_line": 277,
      "comment": "\r\n     * Adds a series or if a series with the same key already exists replaces\r\n     * the data for that series, then sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data (must be an array with length 2, containing two\r\n     *     arrays of equal length, the first containing the x-values and the\r\n     *     second containing the y-values).\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 45)",
        "(line 268,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.removeSeries(java.lang.Comparable)",
      "begin_line": 286,
      "end_line": 293,
      "comment": "\r\n     * Removes a series from the dataset, then sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 45)",
        "(line 288,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.equals(java.lang.Object)",
      "begin_line": 310,
      "end_line": 336,
      "comment": "\r\n     * Tests this \u003ccode\u003eDefaultXYDataset\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of\r\n     *         \u003ccode\u003eDefaultXYDataset\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth datasets have the same number of series, each containing\r\n     *         exactly the same values.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 55)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.hashCode()",
      "begin_line": 343,
      "end_line": 348,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 19)",
        "(line 345,col 9)-(line 345,col 44)",
        "(line 346,col 9)-(line 346,col 58)",
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYDataset.clone()",
      "begin_line": 359,
      "end_line": 374,
      "comment": "\r\n     * Creates an independent copy of this dataset.\r\n     *\r\n     * @return The cloned dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *     dataset (for instance, if a non-cloneable object is used for a\r\n     *     series key).\r\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 66)",
        "(line 361,col 9)-(line 361,col 68)",
        "(line 362,col 9)-(line 362,col 65)",
        "(line 363,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 21)"
      ]
    }
  ]
}