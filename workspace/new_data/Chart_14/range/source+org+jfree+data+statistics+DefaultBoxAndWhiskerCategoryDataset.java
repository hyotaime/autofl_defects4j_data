{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java",
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
      "end_line": 917,
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
      "comment": " \r\n     * The column index for the cell that the minimum range value comes from. \r\n     "
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
      "comment": " \r\n     * The column index for the cell that the maximum range value comes from. \r\n     "
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
      "comment": "\r\n     * Adds a list of values relating to one box-and-whisker entity to the \r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param list  a collection of values from which the various medians will \r\n     *              be calculated.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #add(BoxAndWhiskerItem, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(org.jfree.data.statistics.BoxAndWhiskerItem, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 142,
      "end_line": 191,
      "comment": "\r\n     * Adds a list of values relating to one Box and Whisker entity to the \r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param item  a box and whisker item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #add(List, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 53)",
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 150,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.remove(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 204,
      "end_line": 219,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #add(BoxAndWhiskerItem, Comparable, Comparable)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 36)",
        "(line 207,col 9)-(line 207,col 42)",
        "(line 208,col 9)-(line 208,col 50)",
        "(line 212,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeRow(int)",
      "begin_line": 231,
      "end_line": 235,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     * \r\n     * @see #removeColumn(int)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 38)",
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 234,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * \r\n     * @see #removeColumn(Comparable)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 23)",
        "(line 250,col 9)-(line 250,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeColumn(int)",
      "begin_line": 263,
      "end_line": 267,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     * \r\n     * @see #removeRow(int)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 44)",
        "(line 265,col 9)-(line 265,col 23)",
        "(line 266,col 9)-(line 266,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 279,
      "end_line": 283,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @see #removeRow(Comparable)\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 42)",
        "(line 281,col 9)-(line 281,col 23)",
        "(line 282,col 9)-(line 282,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clear()",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 26)",
        "(line 293,col 9)-(line 293,col 23)",
        "(line 294,col 9)-(line 294,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(int, int)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     * \r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * \r\n     * @return The item.\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(int, int)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #getMedianValue(int, int)\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #getMedianValue(Comparable, Comparable)\r\n     * @see #getValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(int, int)",
      "begin_line": 349,
      "end_line": 359,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The mean value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 29)",
        "(line 352,col 9)-(line 353,col 24)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 371,
      "end_line": 379,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The mean value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 29)",
        "(line 373,col 9)-(line 374,col 35)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(int, int)",
      "begin_line": 391,
      "end_line": 399,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The median value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 29)",
        "(line 393,col 9)-(line 394,col 24)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 411,
      "end_line": 419,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The median value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 29)",
        "(line 413,col 9)-(line 414,col 35)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(int, int)",
      "begin_line": 431,
      "end_line": 439,
      "comment": "\r\n     * Returns the first quartile value.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The first quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 29)",
        "(line 433,col 9)-(line 434,col 29)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 451,
      "end_line": 459,
      "comment": "\r\n     * Returns the first quartile value.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The first quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 29)",
        "(line 453,col 9)-(line 454,col 35)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(int, int)",
      "begin_line": 471,
      "end_line": 479,
      "comment": "\r\n     * Returns the third quartile value.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The third quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 29)",
        "(line 473,col 9)-(line 474,col 29)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 491,
      "end_line": 499,
      "comment": "\r\n     * Returns the third quartile value.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The third quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 29)",
        "(line 493,col 9)-(line 494,col 35)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(int)",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(int)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\r\n     * Returns a row key.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount()",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount()",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     * \r\n     * @see #getRangeUpperBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     * \r\n     * @see #getRangeLowerBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(int, int)",
      "begin_line": 648,
      "end_line": 656,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The minimum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 29)",
        "(line 650,col 9)-(line 651,col 29)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 668,
      "end_line": 676,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The minimum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 29)",
        "(line 670,col 9)-(line 671,col 35)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(int, int)",
      "begin_line": 688,
      "end_line": 696,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The maximum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 29)",
        "(line 690,col 9)-(line 691,col 29)",
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 708,
      "end_line": 716,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The maximum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 29)",
        "(line 710,col 9)-(line 711,col 35)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(int, int)",
      "begin_line": 728,
      "end_line": 736,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The minimum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 29)",
        "(line 730,col 9)-(line 731,col 29)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 748,
      "end_line": 756,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The minimum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 29)",
        "(line 750,col 9)-(line 751,col 35)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(int, int)",
      "begin_line": 768,
      "end_line": 776,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The maximum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 29)",
        "(line 770,col 9)-(line 771,col 29)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 788,
      "end_line": 796,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The maximum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 29)",
        "(line 790,col 9)-(line 791,col 35)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(int, int)",
      "begin_line": 808,
      "end_line": 816,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return A list of outlier values.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 27)",
        "(line 810,col 9)-(line 811,col 29)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 828,
      "end_line": 836,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return A list of outlier values.\r\n     * \r\n     * @see #getItem(int, int)\r\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 27)",
        "(line 830,col 9)-(line 831,col 35)",
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.updateBounds()",
      "begin_line": 842,
      "end_line": 882,
      "comment": "\r\n     * Resets the cached bounds, by iterating over the entire dataset to find\r\n     * the current bounds.\r\n     ",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 44)",
        "(line 844,col 9)-(line 844,col 39)",
        "(line 845,col 9)-(line 845,col 42)",
        "(line 846,col 9)-(line 846,col 44)",
        "(line 847,col 9)-(line 847,col 39)",
        "(line 848,col 9)-(line 848,col 42)",
        "(line 849,col 9)-(line 849,col 37)",
        "(line 850,col 9)-(line 850,col 43)",
        "(line 851,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals(java.lang.Object)",
      "begin_line": 891,
      "end_line": 901,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 899,col 9)",
        "(line 900,col 9)-(line 900,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone()",
      "begin_line": 910,
      "end_line": 915,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not possible.\r\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 912,col 70)",
        "(line 913,col 9)-(line 913,col 56)",
        "(line 914,col 9)-(line 914,col 21)"
      ]
    }
  ]
}