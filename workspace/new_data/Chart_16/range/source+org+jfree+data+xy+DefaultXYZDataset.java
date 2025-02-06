{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/DefaultXYZDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultXYZDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractXYZDataset",
        "org.jfree.data.xy.XYZDataset"
      ],
      "begin_line": 59,
      "end_line": 427,
      "comment": "\r\n * A default implementation of the {@link XYZDataset} interface that stores\r\n * data values in arrays of double primitives.\r\n * \r\n * @since 1.0.2\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "seriesKeys"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * Storage for the series keys.  This list must be kept in sync with the\r\n     * seriesList.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesList"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " \r\n     * Storage for the series in the dataset.  We use a list because the\r\n     * order of the series is significant.  This list must be kept in sync \r\n     * with the seriesKeys list.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.DefaultXYZDataset()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\r\n     * Creates a new \u003ccode\u003eDefaultXYZDataset\u003c/code\u003e instance, initially \r\n     * containing no data.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)",
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getSeriesCount()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getSeriesKey(int)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\r\n     * Returns the key for a series.  \r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for the series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.indexOf(java.lang.Comparable)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns the index of the series with the specified key, or -1 if there \r\n     * is no such series in the dataset.\r\n     * \r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return The index, or -1.\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getDomainOrder()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the order of the domain (x-) values in the dataset.  In this\r\n     * implementation, we cannot guarantee that the x-values are ordered, so \r\n     * this method returns \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     * \r\n     * @return \u003ccode\u003eDomainOrder.NONE\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getItemCount(int)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * \r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getXValue(int, int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 73)",
        "(line 172,col 9)-(line 172,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getX(int, int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the x-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The x-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getXValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getYValue(int, int)",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getY(int, int)\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 73)",
        "(line 215,col 9)-(line 215,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getY(int, int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The y-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     *     \r\n     * @see #getX(int, int)\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getZValue(int, int)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\r\n     * Returns the z-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The z-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * \r\n     * @see #getZ(int, int)\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 73)",
        "(line 258,col 9)-(line 258,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.getZ(int, int)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the z-value for an item within a series.\r\n     * \r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount(series)\u003c/code\u003e).\r\n     *     \r\n     * @return The z-value.\r\n     * \r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not \r\n     *     within the specified range.\r\n     *     \r\n     * @see #getZ(int, int)\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.addSeries(java.lang.Comparable, double[][])",
      "begin_line": 293,
      "end_line": 320,
      "comment": "\r\n     * Adds a series or if a series with the same key already exists replaces\r\n     * the data for that series, then sends a {@link DatasetChangeEvent} to \r\n     * all registered listeners.\r\n     * \r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data (must be an array with length 3, containing three \r\n     *     arrays of equal length, the first containing the x-values, the\r\n     *     second containing the y-values and the third containing the \r\n     *     z-values). \r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 45)",
        "(line 311,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.removeSeries(java.lang.Comparable)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\r\n     * Removes a series from the dataset, then sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param seriesKey  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 45)",
        "(line 331,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.equals(java.lang.Object)",
      "begin_line": 353,
      "end_line": 384,
      "comment": "\r\n     * Tests this \u003ccode\u003eDefaultXYDataset\u003c/code\u003e instance for equality with an\r\n     * arbitrary object.  This method returns \u003ccode\u003etrue\u003c/code\u003e if and only if:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is not \u003ccode\u003enull\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003e\u003ccode\u003eobj\u003c/code\u003e is an instance of \r\n     *         \u003ccode\u003eDefaultXYDataset\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eboth datasets have the same number of series, each containing \r\n     *         exactly the same values.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 57)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.hashCode()",
      "begin_line": 391,
      "end_line": 396,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 19)",
        "(line 393,col 9)-(line 393,col 44)",
        "(line 394,col 9)-(line 394,col 58)",
        "(line 395,col 9)-(line 395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.DefaultXYZDataset.clone()",
      "begin_line": 407,
      "end_line": 425,
      "comment": "\r\n     * Creates an independent copy of this dataset.\r\n     * \r\n     * @return The cloned dataset.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *     dataset (for instance, if a non-cloneable object is used for a\r\n     *     series key).\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 68)",
        "(line 409,col 9)-(line 409,col 68)",
        "(line 410,col 9)-(line 410,col 65)",
        "(line 411,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 21)"
      ]
    }
  ]
}