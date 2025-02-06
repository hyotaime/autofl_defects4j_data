{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/gantt/SlidingGanttCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SlidingGanttCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.gantt.GanttCategoryDataset"
      ],
      "begin_line": 59,
      "end_line": 610,
      "comment": "\r\n * A {@link GanttCategoryDataset} implementation that presents a subset of the\r\n * categories in an underlying dataset.  The index of the first \"visible\"\r\n * category can be modified, which provides a means of \"sliding\" through\r\n * the categories in the underlying dataset.\r\n *\r\n * @since 1.0.10\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "firstCategoryIndex"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The index of the first category to present. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryCount"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The maximum number of categories to present. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.SlidingGanttCategoryDataset(org.jfree.data.gantt.GanttCategoryDataset, int, int)",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param firstColumn  the index of the first visible column from the\r\n     *     underlying dataset.\r\n     * @param maxColumns  the maximumColumnCount.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 84,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getUnderlyingDataset()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\r\n     * Returns the underlying dataset that was supplied to the constructor.\r\n     *\r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getFirstCategoryIndex()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\r\n     * Returns the index of the first visible category.\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @see #setFirstCategoryIndex(int)\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.setFirstCategoryIndex(int)",
      "begin_line": 116,
      "end_line": 122,
      "comment": "\r\n     * Sets the index of the first category that should be used from the\r\n     * underlying dataset, and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param first  the index.\r\n     *\r\n     * @see #getFirstCategoryIndex()\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getMaximumCategoryCount()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the maximum category count.\r\n     *\r\n     * @return The maximum category count.\r\n     *\r\n     * @see #setMaximumCategoryCount(int)\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.setMaximumCategoryCount(int)",
      "begin_line": 143,
      "end_line": 149,
      "comment": "\r\n     * Sets the maximum category count and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param max  the maximum.\r\n     *\r\n     * @see #getMaximumCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 40)",
        "(line 148,col 9)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex()",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\r\n     * Returns the index of the last column for this dataset, or -1.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 161,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\r\n     * Returns the index for the specified column key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The column index, or -1 if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 56)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnKey(int)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the column key for a given index.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnKeys()",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 48)",
        "(line 201,col 9)-(line 201,col 39)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key.\r\n     *\r\n     * @return The row index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowKey(int)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Returns the row key for a given index.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowKeys()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 36)",
        "(line 253,col 9)-(line 253,col 42)",
        "(line 254,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount()",
      "begin_line": 267,
      "end_line": 275,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getValue(int, int)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 306,
      "end_line": 316,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 36)",
        "(line 308,col 9)-(line 308,col 42)",
        "(line 309,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 329,
      "end_line": 340,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 36)",
        "(line 332,col 9)-(line 332,col 42)",
        "(line 333,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 353,
      "end_line": 364,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 42)",
        "(line 357,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(int, int, int)",
      "begin_line": 377,
      "end_line": 380,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 379,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(int, int)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param series  the row index (zero-based).\r\n     * @param category  the column index (zero-based).\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 392,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(int, int, int)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 408,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 422,
      "end_line": 433,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 36)",
        "(line 425,col 9)-(line 425,col 42)",
        "(line 426,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(int, int, int)",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 448,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 461,
      "end_line": 471,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(int, int)\r\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 36)",
        "(line 463,col 9)-(line 463,col 42)",
        "(line 464,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getSubIntervalCount(int, int)",
      "begin_line": 483,
      "end_line": 486,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 485,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 498,
      "end_line": 507,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param rowKey  the series key.\r\n     * @param columnKey  the category key.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 36)",
        "(line 500,col 9)-(line 500,col 42)",
        "(line 501,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(int, int)",
      "begin_line": 519,
      "end_line": 522,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param row  the series (zero-based index).\r\n     * @param column  the category (zero-based index).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 521,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 534,
      "end_line": 543,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param rowKey  the series key.\r\n     * @param columnKey  the category key.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 36)",
        "(line 536,col 9)-(line 536,col 42)",
        "(line 537,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(int, int)",
      "begin_line": 553,
      "end_line": 556,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category (zero-based index).\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 555,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.equals(java.lang.Object)",
      "begin_line": 566,
      "end_line": 584,
      "comment": "\r\n     * Tests this \u003ccode\u003eSlidingCategoryDataset\u003c/code\u003e for equality with an\r\n     * arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 77)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.clone()",
      "begin_line": 600,
      "end_line": 608,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the\r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return An independent copy of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 602,col 62)",
        "(line 603,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 21)"
      ]
    }
  ]
}