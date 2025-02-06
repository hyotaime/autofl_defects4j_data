{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/DefaultMultiValueCategoryDataset.java",
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
      "begin_line": 62,
      "end_line": 406,
      "comment": "\n * A category dataset that defines multiple values for each item.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Storage for the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The minimum range value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * The maximum range value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The range of values.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.DefaultMultiValueCategoryDataset()",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * Creates a new dataset.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 41)",
        "(line 90,col 9)-(line 90,col 38)",
        "(line 91,col 9)-(line 91,col 38)",
        "(line 92,col 9)-(line 92,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.add(java.util.List, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 104,
      "end_line": 160,
      "comment": "\n     * Adds a list of values to the dataset (\u003ccode\u003enull\u003c/code\u003e and Double.NaN\n     * items are automatically removed) and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param values  a list of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 116,col 50)",
        "(line 117,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 54)",
        "(line 130,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValues(int, int)",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Returns a list (possibly empty) of the values for the specified item.\n     * The returned list should be unmodifiable.\n     *\n     * @param row  the row index (zero-based).\n     * @param column   the column index (zero-based).\n     *\n     * @return The list of values.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 62)",
        "(line 173,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValues(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * Returns a list (possibly empty) of the values for the specified item.\n     * The returned list should be unmodifiable.\n     *\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The list of values.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 192,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 203,
      "end_line": 221,
      "comment": "\n     * Returns the average value for the specified item.\n     *\n     * @param row  the row key.\n     * @param column  the column key.\n     *\n     * @return The average value.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 57)",
        "(line 205,col 9)-(line 205,col 30)",
        "(line 206,col 9)-(line 206,col 22)",
        "(line 207,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getValue(int, int)",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\n     * Returns the average value for the specified item.\n     *\n     * @param row  the row index.\n     * @param column  the column index.\n     *\n     * @return The average value.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 57)",
        "(line 233,col 9)-(line 233,col 30)",
        "(line 234,col 9)-(line 234,col 22)",
        "(line 235,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Returns the column index for a given key.\n     *\n     * @param key  the column key.\n     *\n     * @return The column index.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnKey(int)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Returns a column key.\n     *\n     * @param column the column index (zero-based).\n     *\n     * @return The column key.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnKeys()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns the column keys.\n     *\n     * @return The keys.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the row index for a given key.\n     *\n     * @param key the row key.\n     *\n     * @return The row index.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowKey(int)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns a row key.\n     *\n     * @param row the row index (zero-based).\n     *\n     * @return The row key.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowKeys()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns the row keys.\n     *\n     * @return The keys.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRowCount()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Returns the number of rows in the table.\n     *\n     * @return The row count.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getColumnCount()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns the number of columns in the table.\n     *\n     * @return The column count.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\n     * Returns the minimum y-value in the dataset.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     *\n     * @return The minimum value.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 355,
      "end_line": 361,
      "comment": "\n     * Returns the maximum y-value in the dataset.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     *\n     * @return The maximum value.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 35)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Returns the range of the values in this dataset\u0027s range.\n     *\n     * @param includeInterval a flag that determines whether or not the\n     *                        y-interval is taken into account.\n     * @return The range.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.equals(java.lang.Object)",
      "begin_line": 381,
      "end_line": 391,
      "comment": "\n     * Tests this dataset for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 389,col 57)",
        "(line 390,col 9)-(line 390,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultMultiValueCategoryDataset.clone()",
      "begin_line": 400,
      "end_line": 405,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if the dataset cannot be cloned.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 402,col 67)",
        "(line 403,col 9)-(line 403,col 56)",
        "(line 404,col 9)-(line 404,col 21)"
      ]
    }
  ]
}