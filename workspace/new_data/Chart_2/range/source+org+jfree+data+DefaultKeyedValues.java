{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/DefaultKeyedValues.java",
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
      "end_line": 469,
      "comment": "\n * An ordered list of (key, value) items.  This class provides a default\n * implementation of the {@link KeyedValues} interface.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Storage for the keys. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Storage for the values. "
    },
    {
      "type": "field",
      "varNames": [
        "indexMap"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Contains (key, Integer) mappings, where the Integer is the index for\n     * the key in the list.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues.DefaultKeyedValues()",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Creates a new collection (initially empty).\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 36)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getItemCount()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns the number of items (values) in the collection.\n     *\n     * @return The item count.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Returns a value.\n     *\n     * @param item  the item of interest (zero-based index).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKey(int)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns a key.\n     *\n     * @param index  the item index (zero-based).\n     *\n     * @return The row key.\n     *\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getIndex(java.lang.Comparable)",
      "begin_line": 148,
      "end_line": 157,
      "comment": "\n     * Returns the index for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is not recognised.\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\n     *     \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 59)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKeys()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns the keys for the values in the collection.\n     *\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(java.lang.Comparable)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "\n     * Returns the value for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws UnknownKeyException if the key is not recognised.\n     *\n     * @see #getValue(int)\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 34)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, double)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     *\n     * @see #addValue(Comparable, Number)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Adds a new value to the collection, or updates an existing value.\n     * This method passes control directly to the\n     * {@link #setValue(Comparable, Number)} method.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 227,
      "end_line": 241,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value\n     * for that item and moves it to the specified position.\n     *\n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     *\n     * @since 1.0.6\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 269,
      "end_line": 291,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value\n     * for that item and moves it to the specified position.\n     *\n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @since 1.0.6\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.rebuildIndex()",
      "begin_line": 297,
      "end_line": 303,
      "comment": "\n     * Rebuilds the key to indexed-position mapping after an positioned insert\n     * or a remove operation.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 30)",
        "(line 299,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(int)",
      "begin_line": 314,
      "end_line": 318,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param index  the index of the item to remove (in the range\n     *     \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\n     *\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not within\n     *     the specified range.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 32)",
        "(line 316,col 9)-(line 316,col 34)",
        "(line 317,col 9)-(line 317,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(java.lang.Comparable)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is\n     *     \u003ccode\u003enull\u003c/code\u003e.\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not recognised.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 34)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clear()",
      "begin_line": 343,
      "end_line": 347,
      "comment": "\n     * Clears all values from the collection.\n     *\n     * @since 1.0.2\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 26)",
        "(line 345,col 9)-(line 345,col 28)",
        "(line 346,col 9)-(line 346,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 354,
      "end_line": 372,
      "comment": "\n     * Sorts the items in the list by key.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 42)",
        "(line 356,col 9)-(line 356,col 69)",
        "(line 358,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 364,col 56)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 16)",
        "(line 368,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 381,
      "end_line": 398,
      "comment": "\n     * Sorts the items in the list by value.  If the list contains\n     * \u003ccode\u003enull\u003c/code\u003e values, they will sort to the end of the list,\n     * irrespective of the sort order.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 42)",
        "(line 383,col 9)-(line 383,col 69)",
        "(line 384,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 390,col 58)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 393,col 9)-(line 393,col 16)",
        "(line 394,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.equals(java.lang.Object)",
      "begin_line": 407,
      "end_line": 442,
      "comment": "\n     * Tests if this object is equal to another.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 45)",
        "(line 417,col 9)-(line 417,col 35)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.hashCode()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Returns a hash code.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clone()",
      "begin_line": 461,
      "end_line": 467,
      "comment": "\n     * Returns a clone.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException  this class will not throw this\n     *         exception, but subclasses might.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 70)",
        "(line 463,col 9)-(line 463,col 51)",
        "(line 464,col 9)-(line 464,col 55)",
        "(line 465,col 9)-(line 465,col 57)",
        "(line 466,col 9)-(line 466,col 21)"
      ]
    }
  ]
}