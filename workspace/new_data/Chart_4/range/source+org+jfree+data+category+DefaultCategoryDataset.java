{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/category/DefaultCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.category.CategoryDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 433,
      "comment": "\r\n * A default implementation of the {@link CategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A storage structure for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.DefaultCategoryDataset()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Creates a new (empty) dataset.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowCount()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnCount()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     *\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(int, int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKey(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the key for the specified row.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getRowKeys()\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKeys()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKey(int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKeys()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 220,
      "end_line": 224,
      "comment": "\r\n     * Adds a value to the table.  Performs the same function as setValue().\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 53)",
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\r\n     * Adds a value to the table.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 250,
      "end_line": 254,
      "comment": "\r\n     * Adds or updates a value in the table and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "\r\n     * Adds or updates a value in the table and sends a\r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.incrementValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 281,
      "end_line": 290,
      "comment": "\r\n     * Adds the specified value to an existing value in the dataset (if the\r\n     * existing value is \u003ccode\u003enull\u003c/code\u003e, it is treated as if it were 0.0).\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 30)",
        "(line 285,col 9)-(line 285,col 47)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\r\n     * Removes a value from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 49)",
        "(line 303,col 9)-(line 303,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(int)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @see #removeColumn(int)\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 38)",
        "(line 316,col 9)-(line 316,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 327,
      "end_line": 330,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @see #removeColumn(Comparable)\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 36)",
        "(line 329,col 9)-(line 329,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(int)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     *\r\n     * @see #removeRow(int)\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRow(Comparable)\r\n     *\r\n     * @throws UnknownKeyException if \u003ccode\u003ecolumnKey\u003c/code\u003e is not defined\r\n     *         in the dataset.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 42)",
        "(line 358,col 9)-(line 358,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clear()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 26)",
        "(line 367,col 9)-(line 367,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.equals(java.lang.Object)",
      "begin_line": 377,
      "end_line": 408,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 53)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 37)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.hashCode()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\r\n     * Returns a hash code for the dataset.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clone()",
      "begin_line": 427,
      "end_line": 431,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 78)",
        "(line 429,col 9)-(line 429,col 62)",
        "(line 430,col 9)-(line 430,col 21)"
      ]
    }
  ]
}