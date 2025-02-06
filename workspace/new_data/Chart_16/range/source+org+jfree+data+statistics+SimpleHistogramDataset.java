{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/SimpleHistogramDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleHistogramDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 475,
      "comment": "\r\n * A dataset used for creating simple histograms with custom defined bins.\r\n * \r\n * @see HistogramDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "bins"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The bins. "
    },
    {
      "type": "field",
      "varNames": [
        "adjustForBinSize"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " \r\n     * A flag that controls whether or not the bin count is divided by the \r\n     * bin size. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.SimpleHistogramDataset(java.lang.Comparable)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\r\n     * Creates a new histogram dataset.  Note that the \r\n     * \u003ccode\u003eadjustForBinSize\u003c/code\u003e flag defaults to \u003ccode\u003etrue\u003c/code\u003e.\r\n     * \r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 23)",
        "(line 95,col 9)-(line 95,col 36)",
        "(line 96,col 9)-(line 96,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getAdjustForBinSize()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns a flag that controls whether or not the bin count is divided by \r\n     * the bin size in the {@link #getXValue(int, int)} method.\r\n     * \r\n     * @return A boolean.\r\n     * \r\n     * @see #setAdjustForBinSize(boolean)\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setAdjustForBinSize(boolean)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\r\n     * Sets the flag that controls whether or not the bin count is divided by \r\n     * the bin size in the {@link #getYValue(int, int)} method, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param adjust  the flag.\r\n     * \r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesCount()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the number of series in the dataset (always 1 for this dataset).\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesKey(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\r\n     * Returns the key for a series.  Since this dataset only stores a single\r\n     * series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series (zero-based index, ignored in this dataset).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getDomainOrder()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the order of the domain (or X) values returned by the dataset.\r\n     * \r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getItemCount(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the number of items in a series.  Since this dataset only stores\r\n     * a single series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series index (zero-based, ignored in this dataset).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addBin(org.jfree.data.statistics.SimpleHistogramBin)",
      "begin_line": 175,
      "end_line": 187,
      "comment": "\r\n     * Adds a bin to the dataset.  An exception is thrown if the bin overlaps \r\n     * with any existing bin in the dataset.\r\n     * \r\n     * @param bin  the bin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 49)",
        "(line 178,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for \r\n     * the appropriate bin).  A runtime exception is thrown if the value does \r\n     * not fit into any bin.\r\n     * \r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double, boolean)",
      "begin_line": 208,
      "end_line": 224,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for \r\n     * the appropriate bin).  A runtime exception is thrown if the value does \r\n     * not fit into any bin.\r\n     * \r\n     * @param value  the value.\r\n     * @param notify  send {@link DatasetChangeEvent} to listeners?\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 210,col 49)",
        "(line 211,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservations(double[])",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\r\n     * Adds a set of values to the dataset and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #clearObservations()\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clearObservations()",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\r\n     * Removes all current observation data and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #addObservations(double[])\r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 49)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.removeAllBins()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\r\n     * Removes all bins and sends a {@link DatasetChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @since 1.0.6\r\n     * \r\n     * @see #addBin(SimpleHistogramBin)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 36)",
        "(line 269,col 9)-(line 269,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getX(int, int)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or \r\n     * may not be returned in ascending order, that is up to the class \r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getXValue(int, int)",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 74)",
        "(line 296,col 9)-(line 296,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getY(int, int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getYValue(int, int)",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The y-value.\r\n     * \r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 74)",
        "(line 323,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartX(int, int)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartXValue(int, int)",
      "begin_line": 353,
      "end_line": 356,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     * \r\n     * @return The start x-value.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 74)",
        "(line 355,col 9)-(line 355,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndX(int, int)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndXValue(int, int)",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The end x-value.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 74)",
        "(line 381,col 9)-(line 381,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartY(int, int)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartYValue(int, int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndY(int, int)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndYValue(int, int)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a \r\n     * series.\r\n     * \r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     * \r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.equals(java.lang.Object)",
      "begin_line": 441,
      "end_line": 459,
      "comment": "\r\n     * Compares the dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 67)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clone()",
      "begin_line": 469,
      "end_line": 473,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but maybe \r\n     *         by subclasses (if any).\r\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 78)",
        "(line 471,col 9)-(line 471,col 65)",
        "(line 472,col 9)-(line 472,col 21)"
      ]
    }
  ]
}