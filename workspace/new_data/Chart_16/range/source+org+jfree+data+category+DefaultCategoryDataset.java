{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/category/DefaultCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.category.CategoryDataset",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 431,
      "comment": "\r\n * A default implementation of the {@link CategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " A storage structure for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.DefaultCategoryDataset()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new (empty) dataset.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowCount()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnCount()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(int, int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKey(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the key for the specified row.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getRowKeys()\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getRowKeys()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKey(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getColumnKeys()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 218,
      "end_line": 222,
      "comment": "\r\n     * Adds a value to the table.  Performs the same function as setValue().\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @see #getValue(Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 53)",
        "(line 221,col 9)-(line 221,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.addValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\r\n     * Adds a value to the table.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\r\n     * Adds or updates a value in the table and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 53)",
        "(line 251,col 9)-(line 251,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.setValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\r\n     * Adds or updates a value in the table and sends a \r\n     * {@link DatasetChangeEvent} to all registered listeners.\r\n     *\r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.incrementValue(double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 279,
      "end_line": 288,
      "comment": "\r\n     * Adds the specified value to an existing value in the dataset (if the \r\n     * existing value is \u003ccode\u003enull\u003c/code\u003e, it is treated as if it were 0.0).\r\n     * \r\n     * @param value  the value.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 30)",
        "(line 283,col 9)-(line 283,col 47)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\r\n     * Removes a value from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 49)",
        "(line 301,col 9)-(line 301,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(int)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     * \r\n     * @see #removeColumn(int)\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 325,
      "end_line": 328,
      "comment": "\r\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * \r\n     * @see #removeColumn(Comparable)\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 36)",
        "(line 327,col 9)-(line 327,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(int)",
      "begin_line": 338,
      "end_line": 341,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     * \r\n     * @see #removeRow(int)\r\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 44)",
        "(line 340,col 9)-(line 340,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\r\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeRow(Comparable)\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003ecolumnKey\u003c/code\u003e is not defined\r\n     *         in the dataset.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 42)",
        "(line 356,col 9)-(line 356,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clear()",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\r\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent} \r\n     * to all registered listeners.\r\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 26)",
        "(line 365,col 9)-(line 365,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.equals(java.lang.Object)",
      "begin_line": 375,
      "end_line": 406,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 53)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 37)",
        "(line 390,col 9)-(line 390,col 40)",
        "(line 391,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.hashCode()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\r\n     * Returns a hash code for the dataset.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.DefaultCategoryDataset.clone()",
      "begin_line": 425,
      "end_line": 429,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning the\r\n     *         dataset.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 78)",
        "(line 427,col 9)-(line 427,col 62)",
        "(line 428,col 9)-(line 428,col 21)"
      ]
    }
  ]
}