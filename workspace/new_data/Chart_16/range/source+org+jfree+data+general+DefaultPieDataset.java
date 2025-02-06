{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/general/DefaultPieDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultPieDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.general.PieDataset",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 373,
      "comment": "\r\n * A default implementation of the {@link PieDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultPieDataset.DefaultPieDataset()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultPieDataset.DefaultPieDataset(org.jfree.data.KeyedValues)",
      "begin_line": 97,
      "end_line": 105,
      "comment": "\r\n     * Creates a new dataset by copying data from a {@link KeyedValues} \r\n     * instance.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getItemCount()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\r\n     * Returns the number of items in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getKeys()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns the categories in the dataset.  The returned list is \r\n     * unmodifiable.\r\n     *\r\n     * @return The categories in the dataset.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getKey(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Returns the key for the specified item, or \u003ccode\u003enull\u003c/code\u003e. \r\n     *\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key, or \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getIndex(java.lang.Comparable)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Returns the index for a key, or -1 if the key is not recognised.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getValue(int)",
      "begin_line": 162,
      "end_line": 170,
      "comment": "\r\n     * Returns a value.\r\n     *\r\n     * @param item  the value index.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getValue(java.lang.Comparable)",
      "begin_line": 181,
      "end_line": 186,
      "comment": "\r\n     * Returns the data value associated with a key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 39)",
        "(line 200,col 9)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.setValue(java.lang.Comparable, double)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value \r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this methods sends a {@link DatasetChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value \r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this methods sends a {@link DatasetChangeEvent} to all \r\n     * registered listeners.\r\n     * \r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 52)",
        "(line 249,col 9)-(line 249,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.remove(java.lang.Comparable)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.clear()",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\r\n     * Clears all data from this dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners (unless the dataset was already empty).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\r\n     * Sorts the dataset\u0027s items by key and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 36)",
        "(line 289,col 9)-(line 289,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\r\n     * Sorts the dataset\u0027s items by value and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 38)",
        "(line 302,col 9)-(line 302,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.equals(java.lang.Object)",
      "begin_line": 312,
      "end_line": 348,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 321,col 35)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.hashCode()",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.clone()",
      "begin_line": 367,
      "end_line": 371,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException This class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 68)",
        "(line 369,col 9)-(line 369,col 60)",
        "(line 370,col 9)-(line 370,col 21)"
      ]
    }
  ]
}