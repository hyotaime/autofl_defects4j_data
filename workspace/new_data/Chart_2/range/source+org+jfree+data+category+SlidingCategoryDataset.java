{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/category/SlidingCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SlidingCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.category.CategoryDataset"
      ],
      "begin_line": 61,
      "end_line": 353,
      "comment": "\r\n * A {@link CategoryDataset} implementation that presents a subset of the\r\n * categories in an underlying dataset.  The index of the first \"visible\"\r\n * category can be modified, which provides a means of \"sliding\" through\r\n * the categories in the underlying dataset.\r\n *\r\n * @since 1.0.10\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "underlying"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The underlying dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "firstCategoryIndex"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The index of the first category to present. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumCategoryCount"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The maximum number of categories to present. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.SlidingCategoryDataset(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 82,
      "end_line": 87,
      "comment": "\r\n     * Creates a new instance.\r\n     *\r\n     * @param underlying  the underlying dataset (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param firstColumn  the index of the first visible column from the\r\n     *     underlying dataset.\r\n     * @param maxColumns  the maximumColumnCount.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 37)",
        "(line 85,col 9)-(line 85,col 46)",
        "(line 86,col 9)-(line 86,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getUnderlyingDataset()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the underlying dataset that was supplied to the constructor.\r\n     *\r\n     * @return The underlying dataset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getFirstCategoryIndex()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Returns the index of the first visible category.\r\n     *\r\n     * @return The index.\r\n     *\r\n     * @see #setFirstCategoryIndex(int)\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.setFirstCategoryIndex(int)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\r\n     * Sets the index of the first category that should be used from the\r\n     * underlying dataset, and sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param first  the index.\r\n     *\r\n     * @see #getFirstCategoryIndex()\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getMaximumCategoryCount()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\r\n     * Returns the maximum category count.\r\n     *\r\n     * @return The maximum category count.\r\n     *\r\n     * @see #setMaximumCategoryCount(int)\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.setMaximumCategoryCount(int)",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\r\n     * Sets the maximum category count and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param max  the maximum.\r\n     *\r\n     * @see #getMaximumCategoryCount()\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 40)",
        "(line 151,col 9)-(line 151,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.lastCategoryIndex()",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\r\n     * Returns the index of the last column for this dataset, or -1.\r\n     *\r\n     * @return The index.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 165,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 175,
      "end_line": 181,
      "comment": "\r\n     * Returns the index for the specified column key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The column index, or -1 if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 56)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getColumnKey(int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the column key for a given index.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getColumnKeys()",
      "begin_line": 203,
      "end_line": 210,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 48)",
        "(line 205,col 9)-(line 205,col 39)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key.\r\n     *\r\n     * @return The row index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getRowKey(int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Returns the row key for a given index.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getRowKeys()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 255,
      "end_line": 264,
      "comment": "\r\n     * Returns the value for a pair of keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if either key is not defined in the dataset.\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 36)",
        "(line 257,col 9)-(line 257,col 42)",
        "(line 258,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getColumnCount()",
      "begin_line": 271,
      "end_line": 279,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 39)",
        "(line 273,col 9)-(line 278,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getRowCount()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.getValue(int, int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Returns a value from the table.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.equals(java.lang.Object)",
      "begin_line": 310,
      "end_line": 328,
      "comment": "\r\n     * Tests this \u003ccode\u003eSlidingCategoryDataset\u003c/code\u003e for equality with an\r\n     * arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 67)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.SlidingCategoryDataset.clone()",
      "begin_line": 344,
      "end_line": 351,
      "comment": "\r\n     * Returns an independent copy of the dataset.  Note that:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003ethe underlying dataset is only cloned if it implements the\r\n     * {@link PublicCloneable} interface;\u003c/li\u003e\r\n     * \u003cli\u003ethe listeners registered with this dataset are not carried over to\r\n     * the cloned dataset.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return An independent copy of the dataset.\r\n     *\r\n     * @throws CloneNotSupportedException if the dataset cannot be cloned for\r\n     *         any reason.\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 78)",
        "(line 346,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 21)"
      ]
    }
  ]
}