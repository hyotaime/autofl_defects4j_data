{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/KeyedObjects.java",
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
      "begin_line": 56,
      "end_line": 356,
      "comment": "\r\n * A collection of (key, object) pairs.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Storage for the data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObjects.KeyedObjects()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\r\n     * Creates a new collection (initially empty).\r\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getItemCount()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\r\n     * Returns the number of items (values) in the collection.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getObject(int)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\r\n     * Returns an object from the list.\r\n     *\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 29)",
        "(line 91,col 9)-(line 91,col 61)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getKey(int)",
      "begin_line": 109,
      "end_line": 116,
      "comment": "\r\n     * Returns the key at the specified position in the list.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\r\n     *\r\n     * @see #getIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 62)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getIndex(java.lang.Comparable)",
      "begin_line": 127,
      "end_line": 141,
      "comment": "\r\n     * Returns the index for a given key, or \u003ccode\u003e-1\u003c/code\u003e.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     *\r\n     * @see #getKey(int)\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 18)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getKeys()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "\r\n     * Returns a list containing all the keys in the list.\r\n     *\r\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 48)",
        "(line 150,col 9)-(line 150,col 49)",
        "(line 151,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.getObject(java.lang.Comparable)",
      "begin_line": 168,
      "end_line": 175,
      "comment": "\r\n     * Returns the object for a given key. If the key is not recognised, the\r\n     * method should return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addObject(Comparable, Object)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 34)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.addObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Adds a new object to the collection, or overwrites an existing object.\r\n     * This is the same as the {@link #setObject(Comparable, Object)} method.\r\n     *\r\n     * @param key  the key.\r\n     * @param object  the object.\r\n     *\r\n     * @see #getObject(Comparable)\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.setObject(java.lang.Comparable, java.lang.Object)",
      "begin_line": 200,
      "end_line": 210,
      "comment": "\r\n     * Replaces an existing object, or adds a new object to the collection.\r\n     * This is the same as the {@link #addObject(Comparable, Object)}\r\n     * method.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param object  the object.\r\n     *\r\n     * @see #getObject(Comparable)\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.insertValue(int, java.lang.Comparable, java.lang.Object)",
      "begin_line": 224,
      "end_line": 242,
      "comment": "\r\n     * Inserts a new value at the specified position in the dataset or, if\r\n     * there is an existing item with the specified key, updates the value\r\n     * for that item and moves it to the specified position.\r\n     *\r\n     * @param position  the position (in the range \u003ccode\u003e0\u003c/code\u003e to\r\n     *                  \u003ccode\u003egetItemCount()\u003c/code\u003e).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 32)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 55)",
        "(line 236,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.removeValue(int)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Removes a value from the collection.\r\n     *\r\n     * @param index  the index of the item to remove.\r\n     *\r\n     * @see #removeValue(Comparable)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.removeValue(java.lang.Comparable)",
      "begin_line": 264,
      "end_line": 272,
      "comment": "\r\n     * Removes a value from the collection.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeValue(int)\r\n     *\r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.clear()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Clears all values from the collection.\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.clone()",
      "begin_line": 292,
      "end_line": 301,
      "comment": "\r\n     * Returns a clone of this object.  Keys in the list should be immutable\r\n     * and are not cloned.  Objects in the list are cloned only if they\r\n     * implement {@link PublicCloneable}.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 58)",
        "(line 294,col 9)-(line 294,col 47)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 296,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.equals(java.lang.Object)",
      "begin_line": 310,
      "end_line": 345,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 47)",
        "(line 319,col 9)-(line 319,col 35)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects.hashCode()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 62)"
      ]
    }
  ]
}