{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/CategoryTableXYDataset.java",
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
      "begin_line": 72,
      "end_line": 409,
      "comment": "\r\n * An implementation variant of the {@link TableXYDataset} where every series\r\n * shares the same x-values (required for generating stacked area charts).\r\n * This implementation uses a {@link DefaultKeyedValues2D} Object as backend\r\n * implementation and is hence more \"category oriented\" than the {@link\r\n * DefaultTableXYDataset} implementation.\r\n * \u003cp\u003e\r\n * This implementation provides no means to remove data items yet.\r\n * This is due to the lack of such facility in the DefaultKeyedValues2D class.\r\n * \u003cp\u003e\r\n * This class also implements the {@link IntervalXYDataset} interface, but this\r\n * implementation is provisional.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\r\n     * The backing data structure.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "intervalDelegate"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A delegate for controlling the interval width. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.CategoryTableXYDataset()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\r\n     * Creates a new empty CategoryTableXYDataset.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 53)",
        "(line 89,col 9)-(line 89,col 61)",
        "(line 90,col 9)-(line 90,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(double, double, java.lang.String)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\r\n     * Adds a data item to this dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.add(java.lang.Number, java.lang.Number, java.lang.String, boolean)",
      "begin_line": 114,
      "end_line": 120,
      "comment": "\r\n     * Adds a data item to this dataset and, if requested, sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param seriesName  the name of the series to add the data item.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 60)",
        "(line 116,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(double, java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Removes a value from the dataset.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.remove(java.lang.Number, java.lang.String, boolean)",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\r\n     * Removes an item from the dataset.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param seriesName  the series name.\r\n     * @param notify  notify listeners?\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 60)",
        "(line 141,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesCount()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the number of series in the collection.\r\n     *\r\n     * @return The series count.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getSeriesKey(int)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\r\n     * Returns the key for a series.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The key for a series.\r\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the number of x values in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getItemCount(int)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\r\n     * Returns the number of items in the specified series.\r\n     * Returns the same as {@link CategoryTableXYDataset#getItemCount()}.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getX(int, int)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\r\n     * Returns the x-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartX(int, int)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Returns the starting X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting X value.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndX(int, int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the ending X value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending X value.\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getY(int, int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the y-value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The y value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getStartY(int, int)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Returns the starting Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The starting Y value.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getEndY(int, int)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Returns the ending Y value for the specified series and item.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The ending Y value.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainLowerBound(boolean)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\r\n     * Returns the minimum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainUpperBound(boolean)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns the maximum x-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getDomainBounds(boolean)",
      "begin_line": 294,
      "end_line": 301,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s domain.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         x-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalPositionFactor()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\r\n     * Returns the interval position factor.\r\n     *\r\n     * @return The interval position factor.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalPositionFactor(double)",
      "begin_line": 320,
      "end_line": 324,
      "comment": "\r\n     * Sets the interval position factor. Must be between 0.0 and 1.0 inclusive.\r\n     * If the factor is 0.5, the gap is in the middle of the x values. If it\r\n     * is lesser than 0.5, the gap is farther to the left and if greater than\r\n     * 0.5 it gets farther to the right.\r\n     *\r\n     * @param d  the new interval position factor.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 59)",
        "(line 322,col 9)-(line 322,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.getIntervalWidth()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns the full interval width.\r\n     *\r\n     * @return The interval width to use.\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setIntervalWidth(double)",
      "begin_line": 341,
      "end_line": 345,
      "comment": "\r\n     * Sets the interval width to a fixed value, and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param d  the new interval width (must be \u003e 0).\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 55)",
        "(line 343,col 9)-(line 343,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.isAutoWidth()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\r\n     * Returns whether the interval width is automatically calculated or not.\r\n     *\r\n     * @return whether the width is automatically calculated or not.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.setAutoWidth(boolean)",
      "begin_line": 362,
      "end_line": 366,
      "comment": "\r\n     * Sets the flag that indicates whether the interval width is automatically\r\n     * calculated or not.\r\n     *\r\n     * @param b  the flag.\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 46)",
        "(line 364,col 9)-(line 364,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.equals(java.lang.Object)",
      "begin_line": 375,
      "end_line": 387,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 67)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.CategoryTableXYDataset.clone()",
      "begin_line": 397,
      "end_line": 407,
      "comment": "\r\n     * Returns an independent copy of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is some reason that cloning\r\n     *     cannot be performed.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 78)",
        "(line 399,col 9)-(line 399,col 66)",
        "(line 400,col 9)-(line 400,col 63)",
        "(line 402,col 9)-(line 402,col 73)",
        "(line 403,col 9)-(line 403,col 59)",
        "(line 404,col 9)-(line 405,col 45)",
        "(line 406,col 9)-(line 406,col 21)"
      ]
    }
  ]
}