{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/general/DefaultPieDataset.java",
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
      "end_line": 371,
      "comment": "\r\n * A default implementation of the {@link PieDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultPieDataset.DefaultPieDataset()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Constructs a new dataset, initially empty.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DefaultPieDataset.DefaultPieDataset(org.jfree.data.KeyedValues)",
      "begin_line": 95,
      "end_line": 103,
      "comment": "\r\n     * Creates a new dataset by copying data from a {@link KeyedValues}\r\n     * instance.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getItemCount()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\r\n     * Returns the number of items in the dataset.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getKeys()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns the categories in the dataset.  The returned list is\r\n     * unmodifiable.\r\n     *\r\n     * @return The categories in the dataset.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getKey(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the key for the specified item, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param item  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is not in the\r\n     *     specified range.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getIndex(java.lang.Comparable)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the index for a key, or -1 if the key is not recognised.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getValue(int)",
      "begin_line": 160,
      "end_line": 168,
      "comment": "\r\n     * Returns a value.\r\n     *\r\n     * @param item  the value index.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 29)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.getValue(java.lang.Comparable)",
      "begin_line": 179,
      "end_line": 184,
      "comment": "\r\n     * Returns the data value associated with a key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 39)",
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.setValue(java.lang.Comparable, double)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Sets the data value for a key and sends a {@link DatasetChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this methods sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.  After the change\r\n     * is made, this methods sends a {@link DatasetChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param position  the position (in the range 0 to getItemCount()).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.6\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 52)",
        "(line 247,col 9)-(line 247,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.remove(java.lang.Comparable)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\r\n     * Removes an item from the dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 35)",
        "(line 261,col 9)-(line 261,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.clear()",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\r\n     * Clears all data from this dataset and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners (unless the dataset was already empty).\r\n     *\r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\r\n     * Sorts the dataset\u0027s items by key and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 36)",
        "(line 287,col 9)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\r\n     * Sorts the dataset\u0027s items by value and sends a {@link DatasetChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 38)",
        "(line 300,col 9)-(line 300,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.equals(java.lang.Object)",
      "begin_line": 310,
      "end_line": 346,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 43)",
        "(line 319,col 9)-(line 319,col 35)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.hashCode()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DefaultPieDataset.clone()",
      "begin_line": 365,
      "end_line": 369,
      "comment": "\r\n     * Returns a clone of the dataset.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException This class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 68)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 368,col 21)"
      ]
    }
  ]
}