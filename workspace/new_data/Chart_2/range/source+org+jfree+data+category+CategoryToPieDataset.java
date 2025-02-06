{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/category/CategoryToPieDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryToPieDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.pie.AbstractPieDataset",
        "org.jfree.data.pie.PieDataset",
        "org.jfree.data.event.DatasetChangeListener"
      ],
      "begin_line": 67,
      "end_line": 334,
      "comment": "\r\n * A {@link PieDataset} implementation that obtains its data from one row or\r\n * column of a {@link CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The source. "
    },
    {
      "type": "field",
      "varNames": [
        "extract"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The extract type. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The row or column index. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.category.CategoryToPieDataset.CategoryToPieDataset(org.jfree.data.category.CategoryDataset, org.jfree.chart.util.TableOrder, int)",
      "begin_line": 94,
      "end_line": 106,
      "comment": "\r\n     * An adaptor class that converts any {@link CategoryDataset} into a\r\n     * {@link PieDataset}, by taking the values from a single row or column.\r\n     * \u003cp\u003e\r\n     * If \u003ccode\u003esource\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the created dataset will\r\n     * be empty.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param extract  extract data from rows or columns? (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param index  the row or column index.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 29)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 31)",
        "(line 105,col 9)-(line 105,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getUnderlyingDataset()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the underlying dataset.\r\n     *\r\n     * @return The underlying dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getExtractType()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the extract type, which determines whether data is read from\r\n     * one row or one column of the underlying dataset.\r\n     *\r\n     * @return The extract type.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getExtractIndex()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Returns the index of the row or column from which to extract the data.\r\n     *\r\n     * @return The extract index.\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getItemCount()",
      "begin_line": 148,
      "end_line": 159,
      "comment": "\r\n     * Returns the number of items (values) in the collection.  If the\r\n     * underlying dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns zero.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getValue(int)",
      "begin_line": 171,
      "end_line": 185,
      "comment": "\r\n     * Returns a value from the dataset.\r\n     *\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not in the\r\n     *     range \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetItemCount() - 1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 29)",
        "(line 173,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getKey(int)",
      "begin_line": 198,
      "end_line": 211,
      "comment": "\r\n     * Returns the key at the specified index.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 33)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getIndex(java.lang.Comparable)",
      "begin_line": 221,
      "end_line": 232,
      "comment": "\r\n     * Returns the index for a given key, or \u003ccode\u003e-1\u003c/code\u003e if there is no\r\n     * such key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The index for the key, or \u003ccode\u003e-1\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 24)",
        "(line 223,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getKeys()",
      "begin_line": 242,
      "end_line": 253,
      "comment": "\r\n     * Returns the keys for the dataset.\r\n     * \u003cp\u003e\r\n     * If the underlying dataset is \u003ccode\u003enull\u003c/code\u003e, this method returns an\r\n     * empty list.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 45)",
        "(line 244,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.getValue(java.lang.Comparable)",
      "begin_line": 264,
      "end_line": 276,
      "comment": "\r\n     * Returns the value for a given key.  If the key is not recognised, the\r\n     * method should return \u003ccode\u003enull\u003c/code\u003e (but note that \u003ccode\u003enull\u003c/code\u003e\r\n     * can be associated with a valid key also).\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 29)",
        "(line 266,col 9)-(line 266,col 37)",
        "(line 267,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.datasetChanged(org.jfree.data.event.DatasetChangeEvent)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\r\n     * Sends a {@link DatasetChangeEvent} to all registered listeners, with\r\n     * this (not the underlying) dataset as the source.\r\n     *\r\n     * @param event  the event (ignored, a new event with this dataset as the\r\n     *     source is sent to the listeners).\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.CategoryToPieDataset.equals(java.lang.Object)",
      "begin_line": 299,
      "end_line": 332,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object, returning\r\n     * \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eobj\u003c/code\u003e is a dataset containing the same\r\n     * keys and values in the same order as this dataset.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 43)",
        "(line 307,col 9)-(line 307,col 35)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 20)"
      ]
    }
  ]
}