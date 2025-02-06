{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/statistics/SimpleHistogramDataset.java",
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
      "begin_line": 68,
      "end_line": 546,
      "comment": "\r\n * A dataset used for creating simple histograms with custom defined bins.\r\n *\r\n * @see HistogramDataset\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The series key. "
    },
    {
      "type": "field",
      "varNames": [
        "bins"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The bins. "
    },
    {
      "type": "field",
      "varNames": [
        "adjustForBinSize"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * A flag that controls whether or not the bin count is divided by the\r\n     * bin size.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.SimpleHistogramDataset(java.lang.Comparable)",
      "begin_line": 94,
      "end_line": 102,
      "comment": "\r\n     * Creates a new histogram dataset.  Note that the\r\n     * \u003ccode\u003eadjustForBinSize\u003c/code\u003e flag defaults to \u003ccode\u003etrue\u003c/code\u003e.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 23)",
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 37)",
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getAdjustForBinSize()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns a flag that controls whether or not the bin count is divided by\r\n     * the bin size in the {@link #getXValue(int, int)} method.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setAdjustForBinSize(boolean)\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setAdjustForBinSize(boolean)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\r\n     * Sets the flag that controls whether or not the bin count is divided by\r\n     * the bin size in the {@link #getYValue(int, int)} method, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param adjust  the flag.\r\n     *\r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 39)",
        "(line 127,col 9)-(line 127,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesCount()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the number of series in the dataset (always 1 for this dataset).\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getSeriesKey(int)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the key for a series.  Since this dataset only stores a single\r\n     * series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series (zero-based index, ignored in this dataset).\r\n     *\r\n     * @return The key for the series.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getDomainOrder()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the order of the domain (or X) values returned by the dataset.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getItemCount(int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the number of items in a series.  Since this dataset only stores\r\n     * a single series, the \u003ccode\u003eseries\u003c/code\u003e argument is ignored.\r\n     *\r\n     * @param series  the series index (zero-based, ignored in this dataset).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addBin(org.jfree.data.statistics.SimpleHistogramBin)",
      "begin_line": 180,
      "end_line": 192,
      "comment": "\r\n     * Adds a bin to the dataset.  An exception is thrown if the bin overlaps\r\n     * with any existing bin in the dataset.\r\n     *\r\n     * @param bin  the bin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 49)",
        "(line 183,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 27)",
        "(line 191,col 9)-(line 191,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for\r\n     * the appropriate bin).  A runtime exception is thrown if the value does\r\n     * not fit into any bin.\r\n     *\r\n     * @param value  the value.\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservation(double, boolean)",
      "begin_line": 213,
      "end_line": 229,
      "comment": "\r\n     * Adds an observation to the dataset (by incrementing the item count for\r\n     * the appropriate bin).  A runtime exception is thrown if the value does\r\n     * not fit into any bin.\r\n     *\r\n     * @param value  the value.\r\n     * @param notify  send {@link DatasetChangeEvent} to listeners?\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 31)",
        "(line 215,col 9)-(line 215,col 49)",
        "(line 216,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.addObservations(double[])",
      "begin_line": 239,
      "end_line": 244,
      "comment": "\r\n     * Adds a set of values to the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param values  the values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #clearObservations()\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clearObservations()",
      "begin_line": 255,
      "end_line": 262,
      "comment": "\r\n     * Removes all current observation data and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #addObservations(double[])\r\n     * @see #removeAllBins()\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 49)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.removeAllBins()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\r\n     * Removes all bins and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @since 1.0.6\r\n     *\r\n     * @see #addBin(SimpleHistogramBin)\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getX(int, int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\r\n     * Returns the x-value for an item within a series.  The x-values may or\r\n     * may not be returned in ascending order, that is up to the class\r\n     * implementing the interface.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getXValue(int, int)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\r\n     * Returns the x-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The x-value.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 74)",
        "(line 301,col 9)-(line 301,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getY(int, int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Returns the y-value for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getYValue(int, int)",
      "begin_line": 326,
      "end_line": 335,
      "comment": "\r\n     * Returns the y-value (as a double primitive) for an item within a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y-value.\r\n     *\r\n     * @see #getAdjustForBinSize()\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 74)",
        "(line 328,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartX(int, int)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartXValue(int, int)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\r\n     * Returns the start x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The start x-value.\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 74)",
        "(line 360,col 9)-(line 360,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndX(int, int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndXValue(int, int)",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\r\n     * Returns the end x-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The end x-value.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 74)",
        "(line 386,col 9)-(line 386,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartY(int, int)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getStartYValue(int, int)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\r\n     * Returns the start y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The start y-value.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndY(int, int)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.getEndYValue(int, int)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\r\n     * Returns the end y-value (as a double primitive) for an item within a\r\n     * series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The end y-value.\r\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.isSelected(int, int)",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified item is selected, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 74)",
        "(line 450,col 9)-(line 450,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setSelected(int, int, boolean)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\r\n     * Sets the selection state of the specified item and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.setSelected(int, int, boolean, boolean)",
      "begin_line": 474,
      "end_line": 482,
      "comment": "\r\n     * Sets the selection state of the specified item and, if requested, sends\r\n     * a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 74)",
        "(line 478,col 9)-(line 478,col 34)",
        "(line 479,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clearSelection()",
      "begin_line": 490,
      "end_line": 503,
      "comment": "\r\n     * Clears the selection state of all items in the dataset and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 49)",
        "(line 492,col 9)-(line 492,col 32)",
        "(line 493,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 502,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.equals(java.lang.Object)",
      "begin_line": 512,
      "end_line": 530,
      "comment": "\r\n     * Compares the dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 67)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.SimpleHistogramDataset.clone()",
      "begin_line": 540,
      "end_line": 544,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException not thrown by this class, but maybe\r\n     *         by subclasses (if any).\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 78)",
        "(line 542,col 9)-(line 542,col 65)",
        "(line 543,col 9)-(line 543,col 21)"
      ]
    }
  ]
}