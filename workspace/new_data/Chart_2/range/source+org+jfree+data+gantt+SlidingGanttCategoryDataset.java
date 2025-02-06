{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/gantt/SlidingGanttCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SlidingGanttCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.gantt.GanttCategoryDataset"
      ],
      "begin_line": 60,
      "end_line": 613,
      "comment": "\r\n * A {@link GanttCategoryDataset} implementation that presents a subset of the\r\n * categories in an underlying dataset.  The index of the first \"visible\"\r\n * category can be modified, which provides a means of \"sliding\" through\r\n * the categories in the underlying dataset.\r\n *\r\n * @since 1.0.10\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "firstCategoryIndex"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The index of the first category to present. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryCount"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The maximum number of categories to present. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.SlidingGanttCategoryDataset(org.jfree.data.gantt.GanttCategoryDataset, int, int)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param firstColumn  the index of the first visible column from the\r\n     *     underlying dataset.\r\n     * @param maxColumns  the maximumColumnCount.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 85,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getUnderlyingDataset()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the underlying dataset that was supplied to the constructor.\r\n     *\r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getFirstCategoryIndex()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the index of the first visible category.\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @see #setFirstCategoryIndex(int)\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.setFirstCategoryIndex(int)",
      "begin_line": 117,
      "end_line": 124,
      "comment": "\r\n     * Sets the index of the first category that should be used from the\r\n     * underlying dataset, and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param first  the index.\r\n     *\r\n     * @see #getFirstCategoryIndex()\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 40)",
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getMaximumCategoryCount()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\r\n     * Returns the maximum category count.\r\n     *\r\n     * @return The maximum category count.\r\n     *\r\n     * @see #setMaximumCategoryCount(int)\r\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.setMaximumCategoryCount(int)",
      "begin_line": 145,
      "end_line": 152,
      "comment": "\r\n     * Sets the maximum category count and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param max  the maximum.\r\n     *\r\n     * @see #getMaximumCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.lastCategoryIndex()",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\r\n     * Returns the index of the last column for this dataset, or -1.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 164,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 174,
      "end_line": 180,
      "comment": "\r\n     * Returns the index for the specified column key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The column index, or -1 if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 56)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnKey(int)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Returns the column key for a given index.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnKeys()",
      "begin_line": 202,
      "end_line": 209,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 48)",
        "(line 204,col 9)-(line 204,col 39)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key.\r\n     *\r\n     * @return The row index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowKey(int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Returns the row key for a given index.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowKeys()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getColumnCount()",
      "begin_line": 270,
      "end_line": 278,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getRowCount()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getValue(int, int)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 309,
      "end_line": 319,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 36)",
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 332,
      "end_line": 343,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 36)",
        "(line 335,col 9)-(line 335,col 42)",
        "(line 336,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 356,
      "end_line": 367,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 36)",
        "(line 359,col 9)-(line 359,col 42)",
        "(line 360,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(int, int, int)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 382,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(int, int)",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param series  the row index (zero-based).\r\n     * @param category  the column index (zero-based).\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 395,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getPercentComplete(int, int, int)",
      "begin_line": 409,
      "end_line": 412,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 411,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 425,
      "end_line": 436,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 36)",
        "(line 428,col 9)-(line 428,col 42)",
        "(line 429,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(int, int, int)",
      "begin_line": 449,
      "end_line": 452,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int, int)\r\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 451,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 464,
      "end_line": 474,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(int, int)\r\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 42)",
        "(line 467,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getSubIntervalCount(int, int)",
      "begin_line": 486,
      "end_line": 489,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 488,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 501,
      "end_line": 510,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param rowKey  the series key.\r\n     * @param columnKey  the category key.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 36)",
        "(line 503,col 9)-(line 503,col 42)",
        "(line 504,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getStartValue(int, int)",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param row  the series (zero-based index).\r\n     * @param column  the category (zero-based index).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 524,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 537,
      "end_line": 546,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param rowKey  the series key.\r\n     * @param columnKey  the category key.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 36)",
        "(line 539,col 9)-(line 539,col 42)",
        "(line 540,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.getEndValue(int, int)",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category (zero-based index).\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 558,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.equals(java.lang.Object)",
      "begin_line": 569,
      "end_line": 587,
      "comment": "\r\n     * Tests this \u003ccode\u003eSlidingCategoryDataset\u003c/code\u003e for equality with an\r\n     * arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 77)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.SlidingGanttCategoryDataset.clone()",
      "begin_line": 603,
      "end_line": 611,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the\r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return An independent copy of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 605,col 62)",
        "(line 606,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 21)"
      ]
    }
  ]
}