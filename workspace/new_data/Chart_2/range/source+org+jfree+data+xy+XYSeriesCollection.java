{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/XYSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.data.RangeInfo",
        "org.jfree.data.xy.XYDatasetSelectionState",
        "org.jfree.data.xy.SelectableXYDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 88,
      "end_line": 771,
      "comment": "\r\n * Represents a collection of {@link XYSeries} objects that can be used as a\r\n * dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The interval delegate (used to calculate the start and end x-values). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection(org.jfree.data.xy.XYSeries)",
      "begin_line": 114,
      "end_line": 123,
      "comment": "\r\n     * Constructs a dataset and populates it with a single series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 46)",
        "(line 116,col 9)-(line 116,col 68)",
        "(line 117,col 9)-(line 117,col 49)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainOrder()",
      "begin_line": 130,
      "end_line": 139,
      "comment": "\r\n     * Returns the order of the domain (X) values, if this is known.\r\n     *\r\n     * @return The domain order.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 43)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(int)",
      "begin_line": 163,
      "end_line": 174,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 38)",
        "(line 171,col 9)-(line 171,col 33)",
        "(line 172,col 9)-(line 172,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 182,
      "end_line": 192,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeAllSeries()",
      "begin_line": 198,
      "end_line": 210,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 207,col 26)",
        "(line 208,col 9)-(line 208,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesCount()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Returns a list of all the series in the collection.\r\n     *\r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.indexOf(org.jfree.data.xy.XYSeries)",
      "begin_line": 240,
      "end_line": 245,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(int)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 276,
      "end_line": 288,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series with the specified key.\r\n     *\r\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not found in the\r\n     *         collection.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 49)",
        "(line 281,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesKey(int)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getItemCount(int)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getX(int, int)",
      "begin_line": 329,
      "end_line": 332,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 54)",
        "(line 331,col 9)-(line 331,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartX(int, int)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndX(int, int)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getY(int, int)",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 54)",
        "(line 368,col 9)-(line 368,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartY(int, int)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndY(int, int)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.isSelected(int, int)",
      "begin_line": 406,
      "end_line": 410,
      "comment": "\r\n     * Returns the selection state for the specified data item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the item is selected, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 39)",
        "(line 408,col 9)-(line 408,col 46)",
        "(line 409,col 9)-(line 409,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setSelected(int, int, boolean)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Sets the selection state for the specified data item and\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setSelected(int, int, boolean, boolean)",
      "begin_line": 437,
      "end_line": 445,
      "comment": "\r\n     * Sets the selection state for the specified data item and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 39)",
        "(line 440,col 9)-(line 440,col 46)",
        "(line 441,col 9)-(line 441,col 32)",
        "(line 442,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.clearSelection()",
      "begin_line": 452,
      "end_line": 460,
      "comment": "\r\n     * Clears the selection state for all data items.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 43)",
        "(line 454,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.fireSelectionEvent()",
      "begin_line": 467,
      "end_line": 471,
      "comment": "\r\n     * Fires an event to signal that the selection changed.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.equals(java.lang.Object)",
      "begin_line": 480,
      "end_line": 492,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 59)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.clone()",
      "begin_line": 501,
      "end_line": 507,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 70)",
        "(line 503,col 9)-(line 503,col 65)",
        "(line 504,col 9)-(line 505,col 69)",
        "(line 506,col 9)-(line 506,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.hashCode()",
      "begin_line": 514,
      "end_line": 519,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 21)",
        "(line 516,col 9)-(line 516,col 67)",
        "(line 517,col 9)-(line 517,col 55)",
        "(line 518,col 9)-(line 518,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 529,
      "end_line": 550,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 560,
      "end_line": 581,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 592,
      "end_line": 618,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values).\r\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 617,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalWidth()",
      "begin_line": 626,
      "end_line": 628,
      "comment": "\r\n     * Returns the interval width. This is used to calculate the start and end\r\n     * x-values, if/when the dataset is used as an {@link IntervalXYDataset}.\r\n     *\r\n     * @return The interval width.\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalWidth(double)",
      "begin_line": 636,
      "end_line": 643,
      "comment": "\r\n     * Sets the interval width and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param width  the width (negative values not permitted).\r\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 59)",
        "(line 641,col 9)-(line 641,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalPositionFactor()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalPositionFactor(double)",
      "begin_line": 661,
      "end_line": 665,
      "comment": "\r\n     * Sets the interval position factor. This controls where the x-value is in\r\n     * relation to the interval surrounding the x-value (0.0 means the x-value\r\n     * will be positioned at the start, 0.5 in the middle, and 1.0 at the end).\r\n     *\r\n     * @param factor  the factor.\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 64)",
        "(line 663,col 9)-(line 663,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.isAutoWidth()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return Whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setAutoWidth(boolean)",
      "begin_line": 682,
      "end_line": 686,
      "comment": "\r\n     * Sets the flag that indicates wether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 46)",
        "(line 684,col 9)-(line 684,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeBounds(boolean)",
      "begin_line": 696,
      "end_line": 717,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  ignored.\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values).\r\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 48)",
        "(line 698,col 9)-(line 698,col 48)",
        "(line 699,col 9)-(line 699,col 43)",
        "(line 700,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeLowerBound(boolean)",
      "begin_line": 727,
      "end_line": 743,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 35)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeUpperBound(boolean)",
      "begin_line": 753,
      "end_line": 769,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 35)",
        "(line 755,col 9)-(line 755,col 43)",
        "(line 756,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 22)"
      ]
    }
  ]
}