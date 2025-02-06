{
  "filepath": "/tmp/Chart-2b/tests/org/jfree/data/general/junit/TestIntervalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TestIntervalCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.category.IntervalCategoryDataset",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 456,
      "comment": "\n * A test implementation of the {@link IntervalCategoryDataset} interface.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A storage structure for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.TestIntervalCategoryDataset()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Creates a new (empty) dataset.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getRowCount()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Returns the number of rows in the table.\n     *\n     * @return The row count.\n     *\n     * @see #getColumnCount()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getColumnCount()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Returns the number of columns in the table.\n     *\n     * @return The column count.\n     *\n     * @see #getRowCount()\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getValue(int, int)",
      "begin_line": 105,
      "end_line": 112,
      "comment": "\n     * Returns a value from the table.\n     *\n     * @param row  the row index (zero-based).\n     * @param column  the column index (zero-based).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #addValue(Number, Comparable, Comparable)\n     * @see #removeValue(Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 24)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getRowKey(int)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the key for the specified row.\n     *\n     * @param row  the row index (zero-based).\n     *\n     * @return The row key.\n     *\n     * @see #getRowIndex(Comparable)\n     * @see #getRowKeys()\n     * @see #getColumnKey(int)\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Returns the row index for a given key.\n     *\n     * @param key  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The row index.\n     *\n     * @see #getRowKey(int)\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getRowKeys()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns the row keys.\n     *\n     * @return The keys.\n     *\n     * @see #getRowKey(int)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getColumnKey(int)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns a column key.\n     *\n     * @param column  the column index (zero-based).\n     *\n     * @return The column key.\n     *\n     * @see #getColumnIndex(Comparable)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * Returns the column index for a given key.\n     *\n     * @param key  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The column index.\n     *\n     * @see #getColumnKey(int)\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getColumnKeys()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the column keys.\n     *\n     * @return The keys.\n     *\n     * @see #getColumnKey(int)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 204,
      "end_line": 211,
      "comment": "\n     * Returns the value for a pair of keys.\n     *\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws UnknownKeyException if either key is not defined in the dataset.\n     *\n     * @see #addValue(Number, Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 206,col 27)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.addItem(java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 223,
      "end_line": 228,
      "comment": "\n     * Adds a value to the table.  Performs the same function as setValue().\n     *\n     * @param value  the value.\n     * @param rowKey  the row key.\n     * @param columnKey  the column key.\n     *\n     * @see #getValue(Comparable, Comparable)\n     * @see #removeValue(Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 74)",
        "(line 226,col 9)-(line 226,col 53)",
        "(line 227,col 9)-(line 227,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.addItem(double, double, double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n     * Adds a value to the table.\n     *\n     * @param value  the value.\n     * @param rowKey  the row key.\n     * @param columnKey  the column key.\n     *\n     * @see #getValue(Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 242,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.setItem(java.lang.Number, java.lang.Number, java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 255,
      "end_line": 260,
      "comment": "\n     * Adds or updates a value in the table and sends a\n     * {@link DatasetChangeEvent} to all registered listeners.\n     *\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getValue(Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 74)",
        "(line 258,col 9)-(line 258,col 53)",
        "(line 259,col 9)-(line 259,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.setItem(double, double, double, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * Adds or updates a value in the table and sends a\n     * {@link DatasetChangeEvent} to all registered listeners.\n     *\n     * @param value  the value.\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getValue(Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 275,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.removeItem(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * Removes a value from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param rowKey  the row key.\n     * @param columnKey  the column key.\n     *\n     * @see #addValue(Number, Comparable, Comparable)\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 50)",
        "(line 289,col 9)-(line 289,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.removeRow(int)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param rowIndex  the row index.\n     *\n     * @see #removeColumn(int)\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 38)",
        "(line 302,col 9)-(line 302,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.removeRow(java.lang.Comparable)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Removes a row from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param rowKey  the row key.\n     *\n     * @see #removeColumn(Comparable)\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 36)",
        "(line 315,col 9)-(line 315,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.removeColumn(int)",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param columnIndex  the column index.\n     *\n     * @see #removeRow(int)\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 44)",
        "(line 328,col 9)-(line 328,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.removeColumn(java.lang.Comparable)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Removes a column from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     *\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #removeRow(Comparable)\n     *\n     * @throws UnknownKeyException if \u003ccode\u003ecolumnKey\u003c/code\u003e is not defined\n     *         in the dataset.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 42)",
        "(line 344,col 9)-(line 344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.clear()",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n     * Clears all data from the dataset and sends a {@link DatasetChangeEvent}\n     * to all registered listeners.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 26)",
        "(line 353,col 9)-(line 353,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.equals(java.lang.Object)",
      "begin_line": 363,
      "end_line": 394,
      "comment": "\n     * Tests this dataset for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 77)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 37)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.hashCode()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Returns a hash code for the dataset.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.clone()",
      "begin_line": 413,
      "end_line": 418,
      "comment": "\n     * Returns a clone of the dataset.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if there is a problem cloning the\n     *         dataset.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 415,col 30)",
        "(line 416,col 9)-(line 416,col 56)",
        "(line 417,col 9)-(line 417,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getStartValue(int, int)",
      "begin_line": 420,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 422,col 26)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 429,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 431,col 26)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getEndValue(int, int)",
      "begin_line": 438,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 440,col 26)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.junit.TestIntervalCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 447,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 449,col 26)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 36)"
      ]
    }
  ]
}