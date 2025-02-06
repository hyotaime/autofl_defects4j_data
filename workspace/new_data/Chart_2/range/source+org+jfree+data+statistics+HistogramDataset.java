{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/HistogramDataset.java",
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
      "begin_line": 80,
      "end_line": 508,
      "comment": "\r\n * A dataset that can be used for creating histograms.\r\n *\r\n * @see SimpleHistogramDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " A list of maps. "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The histogram type. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.HistogramDataset.HistogramDataset()",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\r\n     * Creates a new (empty) dataset with a default type of\r\n     * {@link HistogramType}.FREQUENCY.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 36)",
        "(line 99,col 9)-(line 99,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getType()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the histogram type.\r\n     *\r\n     * @return The type (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.setType(org.jfree.data.statistics.HistogramType)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\r\n     * Sets the histogram type and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param type  the type (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 25)",
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.addSeries(java.lang.Comparable, double[], int)",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\r\n     * Adds a series to the dataset, using the specified number of bins.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param values the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param bins  the number of bins (must be at least 1).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 137,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.addSeries(java.lang.Comparable, double[], int, double, double)",
      "begin_line": 152,
      "end_line": 214,
      "comment": "\r\n     * Adds a series to the dataset. Any data value less than minimum will be\r\n     * assigned to the first bin, and any data value greater than maximum will\r\n     * be assigned to the last bin.  Values falling on the boundary of\r\n     * adjacent bins will be assigned to the higher indexed bin.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param values  the raw observations.\r\n     * @param bins  the number of bins (must be at least 1).\r\n     * @param minimum  the lower bound of the bin range.\r\n     * @param maximum  the upper bound of the bin range.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 53)",
        "(line 170,col 9)-(line 170,col 31)",
        "(line 171,col 9)-(line 171,col 21)",
        "(line 172,col 9)-(line 172,col 43)",
        "(line 173,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 32)",
        "(line 209,col 9)-(line 209,col 28)",
        "(line 210,col 9)-(line 210,col 33)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 213,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getMinimum(double[])",
      "begin_line": 224,
      "end_line": 236,
      "comment": "\r\n     * Returns the minimum value in an array of values.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted and\r\n     *                zero-length array not permitted).\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getMaximum(double[])",
      "begin_line": 246,
      "end_line": 258,
      "comment": "\r\n     * Returns the maximum value in an array of values.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted and\r\n     *                zero-length array not permitted).\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 39)",
        "(line 252,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getBins(int)",
      "begin_line": 271,
      "end_line": 274,
      "comment": "\r\n     * Returns the bins for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return A list of bins.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getTotal(int)",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\r\n     * Returns the total number of observations for a series.\r\n     *\r\n     * @param series  the series index.\r\n     *\r\n     * @return The total.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 46)",
        "(line 285,col 9)-(line 285,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getBinWidth(int)",
      "begin_line": 295,
      "end_line": 298,
      "comment": "\r\n     * Returns the bin width for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The bin width.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 46)",
        "(line 297,col 9)-(line 297,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getSeriesCount()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns the number of series in the dataset.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getSeriesKey(int)",
      "begin_line": 320,
      "end_line": 323,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The series key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 46)",
        "(line 322,col 9)-(line 322,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getItemCount(int)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\r\n     * Returns the number of data items for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getX(int, int)",
      "begin_line": 355,
      "end_line": 360,
      "comment": "\r\n     * Returns the X value for a bin.  This value won\u0027t be used for plotting\r\n     * histograms, since the renderer will ignore it.  But other renderers can\r\n     * use it (for example, you could use the dataset to create a line\r\n     * chart).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The start value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 36)",
        "(line 357,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 358,col 72)",
        "(line 359,col 9)-(line 359,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getY(int, int)",
      "begin_line": 375,
      "end_line": 393,
      "comment": "\r\n     * Returns the y-value for a bin (calculated to take into account the\r\n     * histogram type).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 36)",
        "(line 377,col 9)-(line 377,col 57)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 379,col 46)",
        "(line 381,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getStartX(int, int)",
      "begin_line": 407,
      "end_line": 411,
      "comment": "\r\n     * Returns the start value for a bin.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The start value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 36)",
        "(line 409,col 9)-(line 409,col 57)",
        "(line 410,col 9)-(line 410,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getEndX(int, int)",
      "begin_line": 425,
      "end_line": 429,
      "comment": "\r\n     * Returns the end value for a bin.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The end value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 36)",
        "(line 427,col 9)-(line 427,col 57)",
        "(line 428,col 9)-(line 428,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getStartY(int, int)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\r\n     * Returns the start y-value for a bin (which is the same as the y-value,\r\n     * this method exists only to support the general form of the\r\n     * {@link IntervalXYDataset} interface).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.getEndY(int, int)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\r\n     * Returns the end y-value for a bin (which is the same as the y-value,\r\n     * this method exists only to support the general form of the\r\n     * {@link IntervalXYDataset} interface).\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     * @param item  the item index (zero based).\r\n     *\r\n     * @return The Y value.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eseries\u003c/code\u003e is outside the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.equals(java.lang.Object)",
      "begin_line": 474,
      "end_line": 489,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 55)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.HistogramDataset.clone()",
      "begin_line": 498,
      "end_line": 506,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the object cannot be cloned.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 66)",
        "(line 500,col 9)-(line 500,col 43)",
        "(line 501,col 9)-(line 501,col 58)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 21)"
      ]
    }
  ]
}