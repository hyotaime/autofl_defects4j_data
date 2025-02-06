{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/KeyedObjects.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedObjects",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 388,
      "comment": "\r\n * A collection of (key, object) pairs.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObjects.KeyedObjects()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Creates a new collection (initially empty).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getItemCount()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\r\n     * Returns the number of items (values) in the collection.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getObject(int)",
      "begin_line": 94,
      "end_line": 101,
      "comment": "\r\n     * Returns an object from the list.\r\n     *\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 96,col 61)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getKey(int)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\r\n     * Returns the key at the specified position in the list.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\r\n     *\r\n     * @see #getIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 62)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getIndex(java.lang.Comparable)",
      "begin_line": 132,
      "end_line": 146,
      "comment": "\r\n     * Returns the index for a given key, or \u003ccode\u003e-1\u003c/code\u003e.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     *\r\n     * @see #getKey(int)\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 18)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getKeys()",
      "begin_line": 153,
      "end_line": 161,
      "comment": "\r\n     * Returns a list containing all the keys in the list.\r\n     *\r\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 48)",
        "(line 155,col 9)-(line 155,col 49)",
        "(line 156,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getObject(java.lang.Comparable)",
      "begin_line": 172,
      "end_line": 179,
      "comment": "\r\n     * Returns the object for a given key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addObject(Comparable, Object)\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.addObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Adds a new object to the collection, or overwrites an existing object.\r\n     * This is the same as the {@link #setObject(Comparable, Object)} method.\r\n     *\r\n     * @param key  the key.\r\n     * @param object  the object.\r\n     *\r\n     * @see #getObject(Comparable)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.setObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\r\n     * Replaces an existing object, or adds a new object to the collection.\r\n     * This is the same as the {@link #addObject(Comparable, Object)}\r\n     * method.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param object  the object.\r\n     *\r\n     * @see #getObject(Comparable)\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 37)",
        "(line 206,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.insertValue(int, java.lang.Comparable, java.lang.Object)",
      "begin_line": 228,
      "end_line": 246,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.\r\n     *\r\n     * @param position  the position (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *                  \u003ccode\u003egetItemCount()\u003c/code\u003e).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 32)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 55)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.removeValue(int)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\r\n     * Removes a value from the collection.\r\n     *\r\n     * @param index  the index of the item to remove.\r\n     *\r\n     * @see #removeValue(Comparable)\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.removeValue(java.lang.Comparable)",
      "begin_line": 268,
      "end_line": 276,
      "comment": "\r\n     * Removes a value from the collection.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeValue(int)\r\n     *\r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 34)",
        "(line 271,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.clear()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\r\n     * Clears all values from the collection.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 294,
      "end_line": 298,
      "comment": "\r\n     * Sorts the items in the list by key.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 296,col 57)",
        "(line 297,col 9)-(line 297,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.sortByObjects(org.jfree.chart.util.SortOrder)",
      "begin_line": 309,
      "end_line": 313,
      "comment": "\r\n     * Sorts the items in the list by value.  If the list contains\r\n     * \u003ccode\u003enull\u003c/code\u003e values, they will sort to the end of the list,\r\n     * irrespective of the sort order.\r\n     *\r\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.clone()",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\r\n     * Returns a clone of this object.  Keys in the list should be immutable\r\n     * and are not cloned.  Objects in the list are cloned only if they\r\n     * implement {@link PublicCloneable}.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 58)",
        "(line 326,col 9)-(line 326,col 47)",
        "(line 327,col 9)-(line 327,col 49)",
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.equals(java.lang.Object)",
      "begin_line": 342,
      "end_line": 377,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 47)",
        "(line 351,col 9)-(line 351,col 35)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.hashCode()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 62)"
      ]
    }
  ]
}