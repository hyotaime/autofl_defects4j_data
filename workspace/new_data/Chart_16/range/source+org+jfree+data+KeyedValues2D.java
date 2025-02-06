{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/KeyedValues2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedValues2D",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.Values2D"
      ],
      "begin_line": 50,
      "end_line": 118,
      "comment": "\r\n * An extension of the {@link Values2D} interface where a unique key is \r\n * associated with the row and column indices.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getRowKey(int)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\r\n     * Returns the row key for a given index.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getRowIndex(java.lang.Comparable)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key.\r\n     *\r\n     * @return The row index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getRowKeys()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getColumnKey(int)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\r\n     * Returns the column key for a given index.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     * \r\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erow\u003c/code\u003e is out of bounds.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getColumnIndex(java.lang.Comparable)",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key.\r\n     *\r\n     * @return The column index, or \u003ccode\u003e-1\u003c/code\u003e if the key is unrecognised.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getColumnKeys()",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedValues2D.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\r\n     * Returns the value associated with the specified keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @throws UnknownKeyException if either key is not recognised.\r\n     ",
      "child_ranges": []
    }
  ]
}