{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/CategoryTableXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryTableXYDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.AbstractIntervalXYDataset",
        "org.jfree.data.xy.TableXYDataset",
        "org.jfree.data.xy.IntervalXYDataset",
        "org.jfree.data.DomainInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 71,
      "end_line": 403,
      "comment": "\r\n * An implementation variant of the {@link TableXYDataset} where every series\r\n * shares the same x-values (required for generating stacked area charts).\r\n * This implementation uses a {@link DefaultKeyedValues2D} Object as backend\r\n * implementation and is hence more \"category oriented\" than the {@link\r\n * DefaultTableXYDataset} implementation.\r\n * \u003cp\u003e\r\n * This implementation provides no means to remove data items yet.\r\n * This is due to the lack of such facility in the DefaultKeyedValues2D class.\r\n * \u003cp\u003e\r\n * This class also implements the {@link IntervalXYDataset} interface, but this\r\n * implementation is provisional.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\r\n     * The backing data structure.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A delegate for controlling the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.CategoryTableXYDataset()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\r\n     * Creates a new empty CategoryTableXYDataset.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)",
        "(line 88,col 9)-(line 88,col 61)",
        "(line 89,col 9)-(line 89,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(double, double, java.lang.String)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\r\n     * Adds a data item to this dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(java.lang.Number, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\r\n     * Adds a data item to this dataset and, if requested, sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 60)",
        "(line 115,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(double, java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Removes a value from the dataset.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(java.lang.Number, java.lang.String, boolean)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\r\n     * Removes an item from the dataset.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 60)",
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesCount()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesKey(int)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount(int)",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * Returns the same as {@link CategoryTableXYDataset#getItemCount()}.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getX(int, int)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartX(int, int)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndX(int, int)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getY(int, int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartY(int, int)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndY(int, int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *\r\n     * @param d  the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 59)",
        "(line 319,col 9)-(line 319,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalWidth()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the full interval width.\r\n     *\r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalWidth(double)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 55)",
        "(line 339,col 9)-(line 339,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.isAutoWidth()",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 357,
      "end_line": 360,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  the flag.\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 46)",
        "(line 359,col 9)-(line 359,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.equals(java.lang.Object)",
      "begin_line": 369,
      "end_line": 381,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 67)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.clone()",
      "begin_line": 391,
      "end_line": 401,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some reason that cloning\r\n     *     cannot be performed.\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 78)",
        "(line 393,col 9)-(line 393,col 66)",
        "(line 394,col 9)-(line 394,col 63)",
        "(line 396,col 9)-(line 396,col 73)",
        "(line 397,col 9)-(line 397,col 59)",
        "(line 398,col 9)-(line 399,col 45)",
        "(line 400,col 9)-(line 400,col 21)"
      ]
    }
  ]
}