{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/DefaultMultiValueCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultMultiValueCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.statistics.MultiValueCategoryDataset",
        "org.jfree.data.RangeInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 61,
      "end_line": 404,
      "comment": "\n * A category dataset that defines multiple values for each item.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Storage for the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * The minimum range value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The maximum range value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The range of values.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.DefaultMultiValueCategoryDataset()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * Creates a new dataset.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 41)",
        "(line 89,col 9)-(line 89,col 38)",
        "(line 90,col 9)-(line 90,col 38)",
        "(line 91,col 9)-(line 91,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.add(java.util.List, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 103,
      "end_line": 158,
      "comment": "\n     * Adds a list of values to the dataset (\u003ccode\u003enull\u003c/code\u003e and Double.NaN \n     * items are automatically removed) and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param values  a list of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 32)",
        "(line 127,col 9)-(line 127,col 54)",
        "(line 129,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValues(int, int)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "\n     * Returns a list (possibly empty) of the values for the specified item.\n     * The returned list should be unmodifiable.\n     * \n     * @param row  the row index (zero-based).\n     * @param column   the column index (zero-based).\n     * \n     * @return The list of values.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 62)",
        "(line 171,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValues(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Returns a list (possibly empty) of the values for the specified item.\n     * The returned list should be unmodifiable.\n     * \n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The list of values.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 190,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 201,
      "end_line": 219,
      "comment": "\n     * Returns the average value for the specified item.\n     *\n     * @param row  the row key.\n     * @param column  the column key.\n     * \n     * @return The average value.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 57)",
        "(line 203,col 9)-(line 203,col 30)",
        "(line 204,col 9)-(line 204,col 22)",
        "(line 205,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValue(int, int)",
      "begin_line": 229,
      "end_line": 247,
      "comment": "\n     * Returns the average value for the specified item.\n     *\n     * @param row  the row index.\n     * @param column  the column index.\n     * \n     * @return The average value.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 57)",
        "(line 231,col 9)-(line 231,col 30)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the column index for a given key.\n     *\n     * @param key  the column key.\n     * \n     * @return The column index.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnKey(int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns a column key.\n     *\n     * @param column the column index (zero-based).\n     * \n     * @return The column key.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnKeys()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the column keys.\n     *\n     * @return The keys.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns the row index for a given key.\n     *\n     * @param key the row key.\n     * \n     * @return The row index.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowKey(int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns a row key.\n     *\n     * @param row the row index (zero-based).\n     * \n     * @return The row key.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowKeys()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Returns the row keys.\n     *\n     * @return The keys.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowCount()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Returns the number of rows in the table.\n     *\n     * @return The row count.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnCount()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Returns the number of columns in the table.\n     *\n     * @return The column count.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 337,
      "end_line": 343,
      "comment": "\n     * Returns the minimum y-value in the dataset.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     *                        \n     * @return The minimum value.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 35)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Returns the maximum y-value in the dataset.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     *                        \n     * @return The maximum value.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Returns the range of the values in this dataset\u0027s range.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     * @return The range.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.equals(java.lang.Object)",
      "begin_line": 379,
      "end_line": 389,
      "comment": "\n     * Tests this dataset for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 387,col 57)",
        "(line 388,col 9)-(line 388,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.clone()",
      "begin_line": 398,
      "end_line": 403,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if the dataset cannot be cloned.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 400,col 67)",
        "(line 401,col 9)-(line 401,col 56)",
        "(line 402,col 9)-(line 402,col 21)"
      ]
    }
  ]
}