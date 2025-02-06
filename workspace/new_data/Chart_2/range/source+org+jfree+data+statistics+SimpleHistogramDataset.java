{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/SimpleHistogramDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleHistogramDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.xy.XYDatasetSelectionState",
        "org.jfree.data.xy.SelectableXYDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 563,
      "comment": "\r\n * A dataset used for creating simple histograms with custom defined bins.\r\n *\r\n * @see HistogramDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "bins"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The bins. "
    },
    {
      "type": "field",
      "varNames": [
        "adjustForBinSize"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\r\n     * A flag that controls whether or not the bin count is divided by the\r\n     * bin size.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.SimpleHistogramDataset(java.lang.Comparable)",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\r\n     * Creates a new histogram dataset.  Note that the\r\n     * \u003ccode\u003eadjustForBinSize\u003c/code\u003e flag defaults to \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 36)",
        "(line 101,col 9)-(line 101,col 37)",
        "(line 102,col 9)-(line 102,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getAdjustForBinSize()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns a flag that controls whether or not the bin count is divided by\r\n     * the bin size in the {@link #getXValue(int, int)} method.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setAdjustForBinSize(boolean)\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setAdjustForBinSize(boolean)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\r\n     * Sets the flag that controls whether or not the bin count is divided by\r\n     * the bin size in the {@link #getYValue(int, int)} method, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param adjust  the flag.\r\n     *\r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesCount()",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the number of series in the dataset (always 1 for this dataset).\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesKey(int)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the key for a series.  Since this dataset only stores a single\r\n     * series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series (zero-based index, ignored in this dataset).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getDomainOrder()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\r\n     * Returns the order of the domain (or X) values returned by the dataset.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getItemCount(int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n     * Returns the number of items in a series.  Since this dataset only stores\r\n     * a single series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series index (zero-based, ignored in this dataset).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addBin(org.jfree.data.statistics.SimpleHistogramBin)",
      "begin_line": 182,
      "end_line": 194,
      "comment": "\r\n     * Adds a bin to the dataset.  An exception is thrown if the bin overlaps\r\n     * with any existing bin in the dataset.\r\n     *\r\n     * @param bin  the bin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 49)",
        "(line 185,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 27)",
        "(line 193,col 9)-(line 193,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for\r\n     * the appropriate bin).  A runtime exception is thrown if the value does\r\n     * not fit into any bin.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double, boolean)",
      "begin_line": 215,
      "end_line": 232,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for\r\n     * the appropriate bin).  A runtime exception is thrown if the value does\r\n     * not fit into any bin.\r\n     *\r\n     * @param value  the value.\r\n     * @param notify  send {@link DatasetChangeEvent} to listeners?\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 31)",
        "(line 217,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservations(double[])",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\r\n     * Adds a set of values to the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #clearObservations()\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clearObservations()",
      "begin_line": 259,
      "end_line": 267,
      "comment": "\r\n     * Removes all current observation data and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #addObservations(double[])\r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 49)",
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.removeAllBins()",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\r\n     * Removes all bins and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #addBin(SimpleHistogramBin)\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getX(int, int)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or\r\n     * may not be returned in ascending order, that is up to the class\r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getXValue(int, int)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 74)",
        "(line 307,col 9)-(line 307,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getY(int, int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getYValue(int, int)",
      "begin_line": 332,
      "end_line": 341,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 74)",
        "(line 334,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartX(int, int)",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartXValue(int, int)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The start x-value.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 74)",
        "(line 366,col 9)-(line 366,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndX(int, int)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndXValue(int, int)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The end x-value.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 74)",
        "(line 392,col 9)-(line 392,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartY(int, int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartYValue(int, int)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndY(int, int)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndYValue(int, int)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.isSelected(int, int)",
      "begin_line": 454,
      "end_line": 457,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified item is selected, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 74)",
        "(line 456,col 9)-(line 456,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setSelected(int, int, boolean)",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\r\n     * Sets the selection state of the specified item and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setSelected(int, int, boolean, boolean)",
      "begin_line": 480,
      "end_line": 488,
      "comment": "\r\n     * Sets the selection state of the specified item and, if requested, sends\r\n     * a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 74)",
        "(line 484,col 9)-(line 484,col 34)",
        "(line 485,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clearSelection()",
      "begin_line": 496,
      "end_line": 509,
      "comment": "\r\n     * Clears the selection state of all items in the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 49)",
        "(line 498,col 9)-(line 498,col 32)",
        "(line 499,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.fireSelectionEvent()",
      "begin_line": 517,
      "end_line": 520,
      "comment": "\r\n     * Sends an event to all registered listeners to indicate that the\r\n     * selection has changed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.equals(java.lang.Object)",
      "begin_line": 529,
      "end_line": 547,
      "comment": "\r\n     * Compares the dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 67)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clone()",
      "begin_line": 557,
      "end_line": 561,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but maybe\r\n     *         by subclasses (if any).\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 78)",
        "(line 559,col 9)-(line 559,col 65)",
        "(line 560,col 9)-(line 560,col 21)"
      ]
    }
  ]
}