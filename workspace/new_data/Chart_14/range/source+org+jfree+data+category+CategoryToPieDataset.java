{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/category/CategoryToPieDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryToPieDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.PieDataset",
        "org.jfree.data.general.DatasetChangeListener"
      ],
      "begin_line": 65,
      "end_line": 330,
      "comment": "\r\n * A {@link PieDataset} implementation that obtains its data from one row or \r\n * column of a {@link CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The source. "
    },
    {
      "type": "field",
      "varNames": [
        "extract"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The extract type. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The row or column index. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.CategoryToPieDataset.CategoryToPieDataset(org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, int)",
      "begin_line": 91,
      "end_line": 103,
      "comment": "\r\n     * An adaptor class that converts any {@link CategoryDataset} into a \r\n     * {@link PieDataset}, by taking the values from a single row or column.\r\n     * \u003cp\u003e\r\n     * If \u003ccode\u003esource\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the created dataset will \r\n     * be empty.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param extract  extract data from rows or columns? (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param index  the row or column index.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 29)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getUnderlyingDataset()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the underlying dataset.\r\n     * \r\n     * @return The underlying dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getExtractType()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Returns the extract type, which determines whether data is read from\r\n     * one row or one column of the underlying dataset.\r\n     * \r\n     * @return The extract type.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getExtractIndex()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the index of the row or column from which to extract the data.\r\n     * \r\n     * @return The extract index.\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getItemCount()",
      "begin_line": 145,
      "end_line": 156,
      "comment": "\r\n     * Returns the number of items (values) in the collection.  If the \r\n     * underlying dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns zero.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 23)",
        "(line 147,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getValue(int)",
      "begin_line": 168,
      "end_line": 182,
      "comment": "\r\n     * Returns a value from the dataset.\r\n     *\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not in the \r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetItemCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 29)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getKey(int)",
      "begin_line": 195,
      "end_line": 208,
      "comment": "\r\n     * Returns the key at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key.\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 33)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getIndex(java.lang.Comparable)",
      "begin_line": 218,
      "end_line": 229,
      "comment": "\r\n     * Returns the index for a given key, or \u003ccode\u003e-1\u003c/code\u003e if there is no\r\n     * such key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The index for the key, or \u003ccode\u003e-1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getKeys()",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\r\n     * Returns the keys for the dataset.\r\n     * \u003cp\u003e\r\n     * If the underlying dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns an\r\n     * empty list.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 45)",
        "(line 241,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getValue(java.lang.Comparable)",
      "begin_line": 261,
      "end_line": 273,
      "comment": "\r\n     * Returns the value for a given key.  If the key is not recognised, the \r\n     * method should return \u003ccode\u003enull\u003c/code\u003e (but note that \u003ccode\u003enull\u003c/code\u003e \r\n     * can be associated with a valid key also).\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 29)",
        "(line 263,col 9)-(line 263,col 37)",
        "(line 264,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\r\n     * Sends a {@link DatasetChangeEvent} to all registered listeners, with\r\n     * this (not the underlying) dataset as the source.\r\n     * \r\n     * @param event  the event (ignored, a new event with this dataset as the\r\n     *     source is sent to the listeners).\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.equals(java.lang.Object)",
      "begin_line": 295,
      "end_line": 328,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object, returning\r\n     * \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eobj\u003c/code\u003e is a dataset containing the same\r\n     * keys and values in the same order as this dataset.\r\n     * \r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 43)",
        "(line 303,col 9)-(line 303,col 35)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    }
  ]
}