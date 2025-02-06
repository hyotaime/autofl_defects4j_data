{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/XYSeriesCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSeriesCollection",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 530,
      "comment": "\r\n * Represents a collection of {@link XYSeries} objects that can be used as a \r\n * dataset.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The series that are included in the collection. "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The interval delegate (used to calculate the start and end x-values). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Constructs an empty dataset.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeriesCollection.XYSeriesCollection(org.jfree.data.xy.XYSeries)",
      "begin_line": 101,
      "end_line": 109,
      "comment": "\r\n     * Constructs a dataset and populates it with a single series.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e ignored).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 103,col 68)",
        "(line 104,col 9)-(line 104,col 49)",
        "(line 105,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.addSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 117,
      "end_line": 126,
      "comment": "\r\n     * Adds a series to the collection and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(int)",
      "begin_line": 134,
      "end_line": 146,
      "comment": "\r\n     * Removes a series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 38)",
        "(line 143,col 9)-(line 143,col 33)",
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeSeries(org.jfree.data.xy.XYSeries)",
      "begin_line": 154,
      "end_line": 165,
      "comment": "\r\n     * Removes a series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.removeAllSeries()",
      "begin_line": 171,
      "end_line": 182,
      "comment": "\r\n     * Removes all the series from the collection and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 26)",
        "(line 181,col 9)-(line 181,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesCount()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns a list of all the series in the collection.  \r\n     * \r\n     * @return The list (which is unmodifiable).\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.indexOf(org.jfree.data.xy.XYSeries)",
      "begin_line": 212,
      "end_line": 217,
      "comment": "\r\n     * Returns the index of the specified series, or -1 if that series is not\r\n     * present in the dataset.\r\n     * \r\n     * @param series  the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The series index.\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(int)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "\r\n     * Returns a series from the collection.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeries(java.lang.Comparable)",
      "begin_line": 248,
      "end_line": 260,
      "comment": "\r\n     * Returns a series from the collection.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The series with the specified key.\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not found in the\r\n     *         collection.\r\n     * \r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 49)",
        "(line 253,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getSeriesKey(int)",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key for a series.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getItemCount(int)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The item count.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003eseries\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetSeriesCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getX(int, int)",
      "begin_line": 301,
      "end_line": 305,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 55)",
        "(line 303,col 9)-(line 303,col 49)",
        "(line 304,col 9)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartX(int, int)",
      "begin_line": 315,
      "end_line": 317,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndX(int, int)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getY(int, int)",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param index  the index of the item of interest (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 55)",
        "(line 342,col 9)-(line 342,col 50)",
        "(line 343,col 9)-(line 343,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getStartY(int, int)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getEndY(int, int)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.equals(java.lang.Object)",
      "begin_line": 378,
      "end_line": 396,
      "comment": "\r\n     * Tests this collection for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 59)",
        "(line 395,col 9)-(line 395,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.clone()",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\r\n     * Returns a clone of this instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem.\r\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 70)",
        "(line 407,col 9)-(line 407,col 65)",
        "(line 408,col 9)-(line 409,col 69)",
        "(line 410,col 9)-(line 410,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.hashCode()",
      "begin_line": 418,
      "end_line": 421,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainLowerBound(boolean)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainUpperBound(boolean)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getDomainBounds(boolean)",
      "begin_line": 455,
      "end_line": 463,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalWidth()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\r\n     * Returns the interval width. This is used to calculate the start and end \r\n     * x-values, if/when the dataset is used as an {@link IntervalXYDataset}.  \r\n     * \r\n     * @return The interval width.\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalWidth(double)",
      "begin_line": 481,
      "end_line": 487,
      "comment": "\r\n     * Sets the interval width and sends a {@link DatasetChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param width  the width (negative values not permitted).\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 59)",
        "(line 486,col 9)-(line 486,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.getIntervalPositionFactor()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\r\n     * Returns the interval position factor.  \r\n     * \r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setIntervalPositionFactor(double)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\r\n     * Sets the interval position factor. This controls where the x-value is in\r\n     * relation to the interval surrounding the x-value (0.0 means the x-value \r\n     * will be positioned at the start, 0.5 in the middle, and 1.0 at the end).\r\n     * \r\n     * @param factor  the factor.\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 64)",
        "(line 507,col 9)-(line 507,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.isAutoWidth()",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     * \r\n     * @return Whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeriesCollection.setAutoWidth(boolean)",
      "begin_line": 525,
      "end_line": 528,
      "comment": "\r\n     * Sets the flag that indicates wether the interval width is automatically\r\n     * calculated or not. \r\n     * \r\n     * @param b  a boolean.\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 46)",
        "(line 527,col 9)-(line 527,col 29)"
      ]
    }
  ]
}