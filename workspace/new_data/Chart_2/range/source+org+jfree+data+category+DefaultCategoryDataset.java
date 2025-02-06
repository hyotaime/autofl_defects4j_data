{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/category/DefaultCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.category.AbstractCategoryDataset",
        "org.jfree.data.category.CategoryDataset",
        "org.jfree.data.category.SelectableCategoryDataset",
        "org.jfree.data.category.CategoryDatasetSelectionState",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 498,
      "comment": "\r\n * A default implementation of the {@link CategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " \r\n     * A storage structure for the data.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.DefaultCategoryDataset()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\r\n     * Creates a new (empty) dataset.\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 41)",
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowCount()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnCount()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     *\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(int, int)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 121,col 24)",
        "(line 122,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKey(int)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\r\n     * Returns the key for the specified row.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getRowKeys()\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKeys()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKey(int)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKeys()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 220,
      "end_line": 229,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 222,col 27)",
        "(line 223,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 241,
      "end_line": 246,
      "comment": "\r\n     * Adds a value to the table.  Performs the same function as setValue().\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 75)",
        "(line 244,col 9)-(line 244,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\r\n     * Adds a value to the table.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\r\n     * Adds or updates a value in the table and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 75)",
        "(line 275,col 9)-(line 275,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\r\n     * Adds or updates a value in the table and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.incrementValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 304,
      "end_line": 313,
      "comment": "\r\n     * Adds the specified value to an existing value in the dataset (if the\r\n     * existing value is \u003ccode\u003enull\u003c/code\u003e, it is treated as if it were 0.0).\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 30)",
        "(line 308,col 9)-(line 308,col 47)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 326,
      "end_line": 330,
      "comment": "\r\n     * Removes a value from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     *\r\n     * @throws UnknownKeyException if either key is not in the dataset.\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 50)",
        "(line 328,col 9)-(line 328,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(int)",
      "begin_line": 340,
      "end_line": 344,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @see #removeColumn(int)\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 38)",
        "(line 342,col 9)-(line 342,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 354,
      "end_line": 358,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @see #removeColumn(Comparable)\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(int)",
      "begin_line": 368,
      "end_line": 372,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     *\r\n     * @see #removeRow(int)\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 44)",
        "(line 370,col 9)-(line 370,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 385,
      "end_line": 389,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRow(Comparable)\r\n     *\r\n     * @throws UnknownKeyException if \u003ccode\u003ecolumnKey\u003c/code\u003e is not defined\r\n     *         in the dataset.\r\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 42)",
        "(line 387,col 9)-(line 387,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clear()",
      "begin_line": 395,
      "end_line": 399,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 26)",
        "(line 397,col 9)-(line 397,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.equals(java.lang.Object)",
      "begin_line": 408,
      "end_line": 439,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 53)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 37)",
        "(line 423,col 9)-(line 423,col 40)",
        "(line 424,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.hashCode()",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\r\n     * Returns a hash code for the dataset.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clone()",
      "begin_line": 458,
      "end_line": 462,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 78)",
        "(line 460,col 9)-(line 460,col 56)",
        "(line 461,col 9)-(line 461,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.isSelected(int, int)",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 80)",
        "(line 466,col 9)-(line 466,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setSelected(int, int, boolean)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setSelected(int, int, boolean, boolean)",
      "begin_line": 473,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 80)",
        "(line 476,col 9)-(line 476,col 33)",
        "(line 477,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clearSelection()",
      "begin_line": 482,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 37)",
        "(line 484,col 9)-(line 484,col 40)",
        "(line 485,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.fireSelectionEvent()",
      "begin_line": 493,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 52)"
      ]
    }
  ]
}