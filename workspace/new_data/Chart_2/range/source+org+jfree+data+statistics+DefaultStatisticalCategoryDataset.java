{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/DefaultStatisticalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultStatisticalCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.statistics.StatisticalCategoryDataset",
        "org.jfree.data.RangeInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 71,
      "end_line": 733,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link StatisticalCategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Storage for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueRow"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The row index for the minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueColumn"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The column index for the minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueIncStdDev"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The minimum range value including the standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueIncStdDevRow"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * The row index for the minimum range value (including the standard\r\n     * deviation).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueIncStdDevColumn"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * The column index for the minimum range value (including the standard\r\n     * deviation).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueRow"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The row index for the maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueColumn"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The column index for the maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueIncStdDev"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The maximum range value including the standard deviation. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueIncStdDevRow"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\r\n     * The row index for the maximum range value (including the standard\r\n     * deviation).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueIncStdDevColumn"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * The column index for the maximum range value (including the standard\r\n     * deviation).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.DefaultStatisticalCategoryDataset()",
      "begin_line": 128,
      "end_line": 142,
      "comment": "\r\n     * Creates a new dataset.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 44)",
        "(line 131,col 9)-(line 131,col 39)",
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 39)",
        "(line 135,col 9)-(line 135,col 42)",
        "(line 136,col 9)-(line 136,col 53)",
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 51)",
        "(line 139,col 9)-(line 139,col 53)",
        "(line 140,col 9)-(line 140,col 48)",
        "(line 141,col 9)-(line 141,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getMeanValue(int, int)",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The mean value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)",
        "(line 154,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getValue(int, int)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\r\n     * Returns the value for an item (for this dataset, the mean value is\r\n     * returned).\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Returns the value for an item (for this dataset, the mean value is\r\n     * returned).\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getMeanValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 196,
      "end_line": 204,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The mean value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 199,col 55)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getStdDevValue(int, int)",
      "begin_line": 214,
      "end_line": 222,
      "comment": "\r\n     * Returns the standard deviation value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The standard deviation (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 29)",
        "(line 216,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getStdDevValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 232,
      "end_line": 240,
      "comment": "\r\n     * Returns the standard deviation value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The standard deviation (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 235,col 55)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getColumnKey(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getColumnKeys()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 281,
      "end_line": 284,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRowKey(int)",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\r\n     * Returns a row key.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRowKeys()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRowCount()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getColumnCount()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     *\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.add(double, double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 336,
      "end_line": 339,
      "comment": "\r\n     * Adds a mean and standard deviation to the table.\r\n     *\r\n     * @param mean  the mean.\r\n     * @param standardDeviation  the standard deviation.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.add(java.lang.Number, java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 349,
      "end_line": 418,
      "comment": "\r\n     * Adds a mean and standard deviation to the table.\r\n     *\r\n     * @param mean  the mean.\r\n     * @param standardDeviation  the standard deviation.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 352,col 41)",
        "(line 353,col 9)-(line 353,col 53)",
        "(line 355,col 9)-(line 355,col 30)",
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 52)",
        "(line 366,col 9)-(line 366,col 46)",
        "(line 367,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.remove(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 431,
      "end_line": 454,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #add(double, double, Comparable, Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 36)",
        "(line 434,col 9)-(line 434,col 42)",
        "(line 435,col 9)-(line 435,col 50)",
        "(line 439,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.removeRow(int)",
      "begin_line": 467,
      "end_line": 472,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @see #removeColumn(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 38)",
        "(line 469,col 9)-(line 469,col 23)",
        "(line 470,col 9)-(line 470,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeColumn(Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 486,col 23)",
        "(line 487,col 9)-(line 487,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.removeColumn(int)",
      "begin_line": 501,
      "end_line": 506,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     *\r\n     * @see #removeRow(int)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 44)",
        "(line 503,col 9)-(line 503,col 23)",
        "(line 504,col 9)-(line 504,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 518,
      "end_line": 523,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRow(Comparable)\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 42)",
        "(line 520,col 9)-(line 520,col 23)",
        "(line 521,col 9)-(line 521,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.clear()",
      "begin_line": 531,
      "end_line": 536,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 26)",
        "(line 533,col 9)-(line 533,col 23)",
        "(line 534,col 9)-(line 534,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.updateBounds()",
      "begin_line": 541,
      "end_line": 631,
      "comment": "\r\n     * Iterate over all the data items and update the cached bound values.\r\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 44)",
        "(line 543,col 9)-(line 543,col 39)",
        "(line 544,col 9)-(line 544,col 42)",
        "(line 545,col 9)-(line 545,col 44)",
        "(line 546,col 9)-(line 546,col 39)",
        "(line 547,col 9)-(line 547,col 42)",
        "(line 548,col 9)-(line 548,col 53)",
        "(line 549,col 9)-(line 549,col 48)",
        "(line 550,col 9)-(line 550,col 51)",
        "(line 551,col 9)-(line 551,col 53)",
        "(line 552,col 9)-(line 552,col 48)",
        "(line 553,col 9)-(line 553,col 51)",
        "(line 555,col 9)-(line 555,col 47)",
        "(line 556,col 9)-(line 556,col 53)",
        "(line 557,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 643,
      "end_line": 650,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The minimum value.\r\n     *\r\n     * @see #getRangeUpperBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 662,
      "end_line": 669,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The maximum value.\r\n     *\r\n     * @see #getRangeLowerBound(boolean)\r\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 679,
      "end_line": 696,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range.\r\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 28)",
        "(line 681,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.equals(java.lang.Object)",
      "begin_line": 705,
      "end_line": 718,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 713,col 58)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 717,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultStatisticalCategoryDataset.clone()",
      "begin_line": 727,
      "end_line": 732,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     *\r\n     * @return A clone of this dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning cannot be completed.\r\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 729,col 68)",
        "(line 730,col 9)-(line 730,col 56)",
        "(line 731,col 9)-(line 731,col 21)"
      ]
    }
  ]
}