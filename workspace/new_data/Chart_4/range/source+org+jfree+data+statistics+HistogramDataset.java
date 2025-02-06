{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/statistics/HistogramDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HistogramDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 506,
      "comment": "\r\n * A dataset that can be used for creating histograms.\r\n *\r\n * @see SimpleHistogramDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " A list of maps. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The histogram type. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.HistogramDataset.HistogramDataset()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\r\n     * Creates a new (empty) dataset with a default type of\r\n     * {@link HistogramType}.FREQUENCY.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 98,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getType()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the histogram type.\r\n     *\r\n     * @return The type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.setType(org.jfree.data.statistics.HistogramType)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\r\n     * Sets the histogram type and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param type  the type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 25)",
        "(line 121,col 9)-(line 121,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.addSeries(java.lang.Comparable, double[], int)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\r\n     * Adds a series to the dataset, using the specified number of bins.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param values the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param bins  the number of bins (must be at least 1).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 44)",
        "(line 135,col 9)-(line 135,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.addSeries(java.lang.Comparable, double[], int, double, double)",
      "begin_line": 150,
      "end_line": 212,
      "comment": "\r\n     * Adds a series to the dataset. Any data value less than minimum will be\r\n     * assigned to the first bin, and any data value greater than maximum will\r\n     * be assigned to the last bin.  Values falling on the boundary of\r\n     * adjacent bins will be assigned to the higher indexed bin.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param values  the raw observations.\r\n     * @param bins  the number of bins (must be at least 1).\r\n     * @param minimum  the lower bound of the bin range.\r\n     * @param maximum  the upper bound of the bin range.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 170,col 43)",
        "(line 171,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 207,col 28)",
        "(line 208,col 9)-(line 208,col 33)",
        "(line 209,col 9)-(line 209,col 61)",
        "(line 210,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getMinimum(double[])",
      "begin_line": 222,
      "end_line": 234,
      "comment": "\r\n     * Returns the minimum value in an array of values.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted and\r\n     *                zero-length array not permitted).\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getMaximum(double[])",
      "begin_line": 244,
      "end_line": 256,
      "comment": "\r\n     * Returns the maximum value in an array of values.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted and\r\n     *                zero-length array not permitted).\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getBins(int)",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\r\n     * Returns the bins for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return A list of bins.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 46)",
        "(line 271,col 9)-(line 271,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getTotal(int)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\r\n     * Returns the total number of observations for a series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 46)",
        "(line 283,col 9)-(line 283,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getBinWidth(int)",
      "begin_line": 293,
      "end_line": 296,
      "comment": "\r\n     * Returns the bin width for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The bin width.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 46)",
        "(line 295,col 9)-(line 295,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getSeriesCount()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getSeriesKey(int)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 46)",
        "(line 320,col 9)-(line 320,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getItemCount(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Returns the number of data items for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getX(int, int)",
      "begin_line": 353,
      "end_line": 358,
      "comment": "\r\n     * Returns the X value for a bin.  This value won\u0027t be used for plotting\r\n     * histograms, since the renderer will ignore it.  But other renderers can\r\n     * use it (for example, you could use the dataset to create a line\r\n     * chart).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The start value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 36)",
        "(line 355,col 9)-(line 355,col 57)",
        "(line 356,col 9)-(line 356,col 72)",
        "(line 357,col 9)-(line 357,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getY(int, int)",
      "begin_line": 373,
      "end_line": 391,
      "comment": "\r\n     * Returns the y-value for a bin (calculated to take into account the\r\n     * histogram type).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 57)",
        "(line 376,col 9)-(line 376,col 40)",
        "(line 377,col 9)-(line 377,col 46)",
        "(line 379,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getStartX(int, int)",
      "begin_line": 405,
      "end_line": 409,
      "comment": "\r\n     * Returns the start value for a bin.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The start value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 407,col 57)",
        "(line 408,col 9)-(line 408,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getEndX(int, int)",
      "begin_line": 423,
      "end_line": 427,
      "comment": "\r\n     * Returns the end value for a bin.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The end value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 36)",
        "(line 425,col 9)-(line 425,col 57)",
        "(line 426,col 9)-(line 426,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getStartY(int, int)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\r\n     * Returns the start y-value for a bin (which is the same as the y-value,\r\n     * this method exists only to support the general form of the\r\n     * {@link IntervalXYDataset} interface).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getEndY(int, int)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\r\n     * Returns the end y-value for a bin (which is the same as the y-value,\r\n     * this method exists only to support the general form of the\r\n     * {@link IntervalXYDataset} interface).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The Y value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.equals(java.lang.Object)",
      "begin_line": 472,
      "end_line": 487,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 55)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.clone()",
      "begin_line": 496,
      "end_line": 504,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 66)",
        "(line 498,col 9)-(line 498,col 43)",
        "(line 499,col 9)-(line 499,col 58)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 21)"
      ]
    }
  ]
}