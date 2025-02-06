{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultBoxAndWhiskerCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
        "org.jfree.data.RangeInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 74,
      "end_line": 922,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link BoxAndWhiskerCategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Storage for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueRow"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The row index for the cell that the minimum range value comes from. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueColumn"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\r\n     * The column index for the cell that the minimum range value comes from.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueRow"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The row index for the cell that the maximum range value comes from. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueColumn"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\r\n     * The column index for the cell that the maximum range value comes from.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.DefaultBoxAndWhiskerCategoryDataset()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 107,col 44)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 44)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(java.util.List, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\r\n     * Adds a list of values relating to one box-and-whisker entity to the\r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param list  a collection of values from which the various medians will\r\n     *              be calculated.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(BoxAndWhiskerItem, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(org.jfree.data.statistics.BoxAndWhiskerItem, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 142,
      "end_line": 192,
      "comment": "\r\n     * Adds a list of values relating to one Box and Whisker entity to the\r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param item  a box and whisker item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(List, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 53)",
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 150,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.remove(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 205,
      "end_line": 221,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(BoxAndWhiskerItem, Comparable, Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 36)",
        "(line 208,col 9)-(line 208,col 42)",
        "(line 209,col 9)-(line 209,col 50)",
        "(line 213,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeRow(int)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @see #removeColumn(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 38)",
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 236,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @see #removeColumn(Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 36)",
        "(line 252,col 9)-(line 252,col 23)",
        "(line 253,col 9)-(line 253,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeColumn(int)",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     *\r\n     * @see #removeRow(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 44)",
        "(line 269,col 9)-(line 269,col 23)",
        "(line 270,col 9)-(line 270,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #removeRow(Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 42)",
        "(line 286,col 9)-(line 286,col 23)",
        "(line 287,col 9)-(line 287,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clear()",
      "begin_line": 297,
      "end_line": 302,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 26)",
        "(line 299,col 9)-(line 299,col 23)",
        "(line 300,col 9)-(line 300,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(int, int)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The item.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(int, int)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getMedianValue(int, int)\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getMedianValue(Comparable, Comparable)\r\n     * @see #getValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(int, int)",
      "begin_line": 356,
      "end_line": 364,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The mean value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 29)",
        "(line 358,col 9)-(line 359,col 24)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 376,
      "end_line": 384,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The mean value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 29)",
        "(line 378,col 9)-(line 379,col 35)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(int, int)",
      "begin_line": 396,
      "end_line": 404,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The median value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)",
        "(line 398,col 9)-(line 399,col 24)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 416,
      "end_line": 424,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The median value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 29)",
        "(line 418,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(int, int)",
      "begin_line": 436,
      "end_line": 444,
      "comment": "\r\n     * Returns the first quartile value.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The first quartile value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 29)",
        "(line 438,col 9)-(line 439,col 29)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 456,
      "end_line": 464,
      "comment": "\r\n     * Returns the first quartile value.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The first quartile value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 29)",
        "(line 458,col 9)-(line 459,col 35)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(int, int)",
      "begin_line": 476,
      "end_line": 484,
      "comment": "\r\n     * Returns the third quartile value.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The third quartile value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 29)",
        "(line 478,col 9)-(line 479,col 29)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 496,
      "end_line": 504,
      "comment": "\r\n     * Returns the third quartile value.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The third quartile value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 29)",
        "(line 498,col 9)-(line 499,col 35)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(int)",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 552,
      "end_line": 555,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(int)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\r\n     * Returns a row key.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount()",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     *\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     *\r\n     * @see #getRangeUpperBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     *\r\n     * @see #getRangeLowerBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 639,
      "end_line": 641,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(int, int)",
      "begin_line": 653,
      "end_line": 661,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The minimum regular value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 29)",
        "(line 655,col 9)-(line 656,col 29)",
        "(line 657,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 660,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 673,
      "end_line": 681,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The minimum regular value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 29)",
        "(line 675,col 9)-(line 676,col 35)",
        "(line 677,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(int, int)",
      "begin_line": 693,
      "end_line": 701,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The maximum regular value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 29)",
        "(line 695,col 9)-(line 696,col 29)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 713,
      "end_line": 721,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The maximum regular value.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 29)",
        "(line 715,col 9)-(line 716,col 35)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(int, int)",
      "begin_line": 733,
      "end_line": 741,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The minimum outlier.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 29)",
        "(line 735,col 9)-(line 736,col 29)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 753,
      "end_line": 761,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The minimum outlier.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 29)",
        "(line 755,col 9)-(line 756,col 35)",
        "(line 757,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(int, int)",
      "begin_line": 773,
      "end_line": 781,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The maximum outlier.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 774,col 9)-(line 774,col 29)",
        "(line 775,col 9)-(line 776,col 29)",
        "(line 777,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 780,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 793,
      "end_line": 801,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The maximum outlier.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 29)",
        "(line 795,col 9)-(line 796,col 35)",
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(int, int)",
      "begin_line": 813,
      "end_line": 821,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return A list of outlier values.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 27)",
        "(line 815,col 9)-(line 816,col 29)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 833,
      "end_line": 841,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A list of outlier values.\r\n     *\r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 27)",
        "(line 835,col 9)-(line 836,col 35)",
        "(line 837,col 9)-(line 839,col 9)",
        "(line 840,col 9)-(line 840,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.updateBounds()",
      "begin_line": 847,
      "end_line": 887,
      "comment": "\r\n     * Resets the cached bounds, by iterating over the entire dataset to find\r\n     * the current bounds.\r\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 44)",
        "(line 849,col 9)-(line 849,col 39)",
        "(line 850,col 9)-(line 850,col 42)",
        "(line 851,col 9)-(line 851,col 44)",
        "(line 852,col 9)-(line 852,col 39)",
        "(line 853,col 9)-(line 853,col 42)",
        "(line 854,col 9)-(line 854,col 37)",
        "(line 855,col 9)-(line 855,col 43)",
        "(line 856,col 9)-(line 886,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals(java.lang.Object)",
      "begin_line": 896,
      "end_line": 906,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone()",
      "begin_line": 915,
      "end_line": 920,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not possible.\r\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 917,col 70)",
        "(line 918,col 9)-(line 918,col 56)",
        "(line 919,col 9)-(line 919,col 21)"
      ]
    }
  ]
}