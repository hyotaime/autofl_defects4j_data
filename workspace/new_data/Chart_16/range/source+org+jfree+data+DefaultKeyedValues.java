{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/DefaultKeyedValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValues",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.KeyedValues",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 470,
      "comment": "\n * An ordered list of (key, value) items.  This class provides a default \n * implementation of the {@link KeyedValues} interface.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Storage for the keys. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Storage for the values. "
    },
    {
      "type": "field",
      "varNames": [
        "indexMap"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " \n     * Contains (key, Integer) mappings, where the Integer is the index for\n     * the key in the list. \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues.DefaultKeyedValues()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Creates a new collection (initially empty).\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 38)",
        "(line 101,col 9)-(line 101,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getItemCount()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the number of items (values) in the collection.\n     *\n     * @return The item count.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns a value.\n     *\n     * @param item  the item of interest (zero-based index).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKey(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns a key.\n     *\n     * @param index  the item index (zero-based).\n     *\n     * @return The row key.\n     * \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getIndex(java.lang.Comparable)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * Returns the index for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is not recognised.\n     * \n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \n     *     \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 59)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKeys()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns the keys for the values in the collection.\n     *\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(java.lang.Comparable)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Returns the value for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws UnknownKeyException if the key is not recognised.\n     * \n     * @see #getValue(int)\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 34)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     * \n     * @see #addValue(Comparable, Number)\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Adds a new value to the collection, or updates an existing value.\n     * This method passes control directly to the \n     * {@link #setValue(Comparable, Number)} method.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 37)",
        "(line 233,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value \n     * for that item and moves it to the specified position.\n     * \n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     * \n     * @since 1.0.6\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 270,
      "end_line": 292,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value \n     * for that item and moves it to the specified position.\n     * \n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @since 1.0.6\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.rebuildIndex()",
      "begin_line": 298,
      "end_line": 304,
      "comment": "\n     * Rebuilds the key to indexed-position mapping after an positioned insert\n     * or a remove operation.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 30)",
        "(line 300,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(int)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param index  the index of the item to remove (in the range \n     *     \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\n     *     \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not within\n     *     the specified range.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 32)",
        "(line 317,col 9)-(line 317,col 34)",
        "(line 318,col 9)-(line 318,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(java.lang.Comparable)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \n     *     \u003ccode\u003enull\u003c/code\u003e.\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not recognised.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 34)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clear()",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\n     * Clears all values from the collection.\n     * \n     * @since 1.0.2\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 26)",
        "(line 346,col 9)-(line 346,col 28)",
        "(line 347,col 9)-(line 347,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 355,
      "end_line": 373,
      "comment": "\n     * Sorts the items in the list by key.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 42)",
        "(line 357,col 9)-(line 357,col 69)",
        "(line 359,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 365,col 56)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 16)",
        "(line 369,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 382,
      "end_line": 399,
      "comment": "\n     * Sorts the items in the list by value.  If the list contains \n     * \u003ccode\u003enull\u003c/code\u003e values, they will sort to the end of the list, \n     * irrespective of the sort order.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 42)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 391,col 58)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 394,col 9)-(line 394,col 16)",
        "(line 395,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.equals(java.lang.Object)",
      "begin_line": 408,
      "end_line": 443,
      "comment": "\n     * Tests if this object is equal to another.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 417,col 45)",
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.hashCode()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns a hash code.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clone()",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Returns a clone.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException  this class will not throw this \n     *         exception, but subclasses might.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 70)",
        "(line 464,col 9)-(line 464,col 51)",
        "(line 465,col 9)-(line 465,col 55)",
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 467,col 21)"
      ]
    }
  ]
}