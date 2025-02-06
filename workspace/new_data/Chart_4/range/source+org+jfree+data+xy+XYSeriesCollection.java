{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/XYSeriesCollection.java",
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
      "begin_line": 87,
      "end_line": 752,
      "comment": "\r\n * Represents a collection of {@link XYSeries} objects that can be used as a\r\n * dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The interval delegate (used to calculate the start and end x-values). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection(org.jfree.data.xy.XYSeries)",
      "begin_line": 113,
      "end_line": 122,
      "comment": "\r\n     * Constructs a dataset and populates it with a single series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 115,col 68)",
        "(line 116,col 9)-(line 116,col 49)",
        "(line 117,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainOrder()",
      "begin_line": 129,
      "end_line": 138,
      "comment": "\r\n     * Returns the order of the domain (X) values, if this is known.\r\n     *\r\n     * @return The domain order.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 43)",
        "(line 131,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(int)",
      "begin_line": 161,
      "end_line": 171,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 167,col 55)",
        "(line 168,col 9)-(line 168,col 38)",
        "(line 169,col 9)-(line 169,col 33)",
        "(line 170,col 9)-(line 170,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 179,
      "end_line": 188,
      "comment": "\r\n     * Removes a series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeAllSeries()",
      "begin_line": 194,
      "end_line": 205,
      "comment": "\r\n     * Removes all the series from the collection and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 200,col 9)",
        "(line 203,col 9)-(line 203,col 26)",
        "(line 204,col 9)-(line 204,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesCount()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns a list of all the series in the collection.\r\n     *\r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.indexOf(org.jfree.data.xy.XYSeries)",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series index.\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(int)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 271,
      "end_line": 283,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The series with the specified key.\r\n     *\r\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not found in the\r\n     *         collection.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 49)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesKey(int)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getItemCount(int)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getX(int, int)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 54)",
        "(line 326,col 9)-(line 326,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartX(int, int)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndX(int, int)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getY(int, int)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 54)",
        "(line 363,col 9)-(line 363,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartY(int, int)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndY(int, int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.isSelected(int, int)",
      "begin_line": 401,
      "end_line": 405,
      "comment": "\r\n     * Returns the selection state for the specified data item.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the item is selected, and\r\n     *     \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 39)",
        "(line 403,col 9)-(line 403,col 46)",
        "(line 404,col 9)-(line 404,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setSelected(int, int, boolean)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\r\n     * Sets the selection state for the specified data item and\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setSelected(int, int, boolean, boolean)",
      "begin_line": 432,
      "end_line": 440,
      "comment": "\r\n     * Sets the selection state for the specified data item and, if requested,\r\n     * sends a {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index.\r\n     * @param item  the item index.\r\n     * @param selected  the selection state.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 39)",
        "(line 435,col 9)-(line 435,col 46)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 439,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.clearSelection()",
      "begin_line": 447,
      "end_line": 455,
      "comment": "\r\n     * Clears the selection state for all data items.\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 43)",
        "(line 449,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.equals(java.lang.Object)",
      "begin_line": 464,
      "end_line": 476,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 59)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.clone()",
      "begin_line": 485,
      "end_line": 491,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 70)",
        "(line 487,col 9)-(line 487,col 65)",
        "(line 488,col 9)-(line 489,col 69)",
        "(line 490,col 9)-(line 490,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.hashCode()",
      "begin_line": 498,
      "end_line": 503,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 21)",
        "(line 500,col 9)-(line 500,col 67)",
        "(line 501,col 9)-(line 501,col 55)",
        "(line 502,col 9)-(line 502,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 513,
      "end_line": 534,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 544,
      "end_line": 565,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 576,
      "end_line": 602,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values).\r\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 601,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalWidth()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\r\n     * Returns the interval width. This is used to calculate the start and end\r\n     * x-values, if/when the dataset is used as an {@link IntervalXYDataset}.\r\n     *\r\n     * @return The interval width.\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalWidth(double)",
      "begin_line": 620,
      "end_line": 626,
      "comment": "\r\n     * Sets the interval width and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param width  the width (negative values not permitted).\r\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 59)",
        "(line 625,col 9)-(line 625,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalPositionFactor()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalPositionFactor(double)",
      "begin_line": 644,
      "end_line": 647,
      "comment": "\r\n     * Sets the interval position factor. This controls where the x-value is in\r\n     * relation to the interval surrounding the x-value (0.0 means the x-value\r\n     * will be positioned at the start, 0.5 in the middle, and 1.0 at the end).\r\n     *\r\n     * @param factor  the factor.\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 64)",
        "(line 646,col 9)-(line 646,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.isAutoWidth()",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return Whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setAutoWidth(boolean)",
      "begin_line": 664,
      "end_line": 667,
      "comment": "\r\n     * Sets the flag that indicates wether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 46)",
        "(line 666,col 9)-(line 666,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeBounds(boolean)",
      "begin_line": 677,
      "end_line": 698,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  ignored.\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values).\r\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 680,col 43)",
        "(line 681,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeLowerBound(boolean)",
      "begin_line": 708,
      "end_line": 724,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 35)",
        "(line 710,col 9)-(line 710,col 43)",
        "(line 711,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getRangeUpperBound(boolean)",
      "begin_line": 734,
      "end_line": 750,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 35)",
        "(line 736,col 9)-(line 736,col 43)",
        "(line 737,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 22)"
      ]
    }
  ]
}