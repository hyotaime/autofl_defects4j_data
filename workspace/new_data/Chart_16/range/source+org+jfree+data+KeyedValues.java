{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/KeyedValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedValues",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.Values"
      ],
      "begin_line": 56,
      "end_line": 106,
      "comment": "\r\n * An ordered list of (key, value) items where the keys are unique and \r\n * non-\u003ccode\u003enull\u003c/code\u003e.\r\n *\r\n * @see Values\r\n * @see DefaultKeyedValues\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues.getKey(int)",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * Returns the key associated with the item at a given position.  Note \r\n     * that some implementations allow re-ordering of the data items, so the\r\n     * result may be transient.\r\n     *\r\n     * @param index  the item index (in the range \u003ccode\u003e0\u003c/code\u003e to \r\n     *     \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\r\n     *\r\n     * @return The key (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not in the \r\n     *     specified range.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues.getIndex(java.lang.Comparable)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\r\n     * Returns the index for a given key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues.getKeys()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * Returns the keys for the values in the collection.  Note that you can \r\n     * access the values in this collection by key or by index.  For this \r\n     * reason, the key order is important - this method should return the keys\r\n     * in order.  The returned list may be unmodifiable.\r\n     *\r\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues.getValue(java.lang.Comparable)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * Returns the value for a given key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws UnknownKeyException if the key is not recognised.\r\n     ",
      "child_ranges": []
    }
  ]
}