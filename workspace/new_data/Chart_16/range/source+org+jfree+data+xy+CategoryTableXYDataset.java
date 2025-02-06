{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/xy/CategoryTableXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryTableXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.TableXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo"
      ],
      "begin_line": 69,
      "end_line": 382,
      "comment": "\r\n * An implementation variant of the {@link TableXYDataset} where every series \r\n * shares the same x-values (required for generating stacked area charts). \r\n * This implementation uses a {@link DefaultKeyedValues2D} Object as backend \r\n * implementation and is hence more \"category oriented\" than the {@link \r\n * DefaultTableXYDataset} implementation.\r\n * \u003cp\u003e\r\n * This implementation provides no means to remove data items yet.\r\n * This is due to the lack of such facility in the DefaultKeyedValues2D class.\r\n * \u003cp\u003e\r\n * This class also implements the {@link IntervalXYDataset} interface, but this\r\n * implementation is provisional. \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * The backing data structure.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A delegate for controlling the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.CategoryTableXYDataset()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\r\n     * Creates a new empty CategoryTableXYDataset.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 87,col 61)",
        "(line 88,col 9)-(line 88,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(double, double, java.lang.String)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\r\n     * Adds a data item to this dataset and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(java.lang.Number, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\r\n     * Adds a data item to this dataset and, if requested, sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     * \r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(double, java.lang.String)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Removes a value from the dataset.\r\n     * \r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(java.lang.Number, java.lang.String, boolean)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\r\n     * Removes an item from the dataset.\r\n     * \r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 60)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesCount()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesKey(int)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount(int)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * Returns the same as {@link CategoryTableXYDataset#getItemCount()}.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getX(int, int)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartX(int, int)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndX(int, int)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getY(int, int)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartY(int, int)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndY(int, int)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 290,
      "end_line": 297,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\r\n     * Returns the interval position factor. \r\n     * \r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *  \r\n     * @param d  the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 59)",
        "(line 318,col 9)-(line 318,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalWidth()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the full interval width. \r\n     * \r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalWidth(double)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners. \r\n     * \r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 55)",
        "(line 338,col 9)-(line 338,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.isAutoWidth()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     * \r\n     * @return whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not. \r\n     * \r\n     * @param b  the flag.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 46)",
        "(line 358,col 9)-(line 358,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.equals(java.lang.Object)",
      "begin_line": 368,
      "end_line": 380,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 67)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 20)"
      ]
    }
  ]
}