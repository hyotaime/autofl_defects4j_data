{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/pie/DefaultPieDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPieDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.pie.AbstractPieDataset",
        "org.jfree.data.pie.PieDataset",
        "org.jfree.data.pie.PieDatasetSelectionState",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 425,
      "comment": "\r\n * A default implementation of the {@link PieDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.pie.DefaultPieDataset.DefaultPieDataset()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 39)",
        "(line 92,col 9)-(line 92,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.pie.DefaultPieDataset.DefaultPieDataset(org.jfree.data.KeyedValues)",
      "begin_line": 101,
      "end_line": 110,
      "comment": "\r\n     * Creates a new dataset by copying data from a {@link KeyedValues}\r\n     * instance.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 106,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getItemCount()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the number of items in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getKeys()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\r\n     * Returns the categories in the dataset.  The returned list is\r\n     * unmodifiable.\r\n     *\r\n     * @return The categories in the dataset.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getKey(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\r\n     * Returns the key for the specified item, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getIndex(java.lang.Comparable)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\r\n     * Returns the index for a key, or -1 if the key is not recognised.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getValue(int)",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\r\n     * Returns a value.\r\n     *\r\n     * @param item  the value index.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 29)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.getValue(java.lang.Comparable)",
      "begin_line": 186,
      "end_line": 192,
      "comment": "\r\n     * Returns the data value associated with a key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 78)",
        "(line 191,col 9)-(line 191,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 44)",
        "(line 206,col 9)-(line 206,col 59)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 212,col 9)-(line 212,col 79)",
        "(line 213,col 9)-(line 213,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.setValue(java.lang.Comparable, double)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this methods sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this method sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 52)",
        "(line 262,col 9)-(line 262,col 59)",
        "(line 264,col 9)-(line 264,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.remove(java.lang.Comparable)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 30)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 279,col 62)",
        "(line 280,col 9)-(line 280,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.clear()",
      "begin_line": 289,
      "end_line": 295,
      "comment": "\r\n     * Clears all data from this dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners (unless the dataset was already empty).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "\r\n     * Sorts the dataset\u0027s items by key and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 36)",
        "(line 307,col 9)-(line 307,col 62)",
        "(line 308,col 9)-(line 309,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 320,
      "end_line": 325,
      "comment": "\r\n     * Sorts the dataset\u0027s items by value and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 39)",
        "(line 322,col 9)-(line 322,col 62)",
        "(line 323,col 9)-(line 324,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.equals(java.lang.Object)",
      "begin_line": 334,
      "end_line": 370,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 43)",
        "(line 343,col 9)-(line 343,col 35)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.hashCode()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.clone()",
      "begin_line": 389,
      "end_line": 393,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException This class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 68)",
        "(line 391,col 9)-(line 391,col 54)",
        "(line 392,col 9)-(line 392,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.isSelected(java.lang.Comparable)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 74)",
        "(line 397,col 9)-(line 397,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.setSelected(java.lang.Comparable, boolean)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.setSelected(java.lang.Comparable, boolean, boolean)",
      "begin_line": 404,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 74)",
        "(line 406,col 9)-(line 406,col 35)",
        "(line 407,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.clearSelection()",
      "begin_line": 412,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 39)",
        "(line 414,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.pie.DefaultPieDataset.fireSelectionEvent()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 57)"
      ]
    }
  ]
}