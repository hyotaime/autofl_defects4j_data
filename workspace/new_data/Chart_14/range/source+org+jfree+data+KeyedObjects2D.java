{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/KeyedObjects2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedObjects2D",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 522,
      "comment": "\r\n * A data structure that stores zero, one or many objects, where each object is\r\n * associated with two keys (a \u0027row\u0027 key and a \u0027column\u0027 key).\r\n "
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
        "rowKeys"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The row keys. "
    },
    {
      "type": "field",
      "varNames": [
        "columnKeys"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The column keys. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The row data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObjects2D.KeyedObjects2D()",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 49)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowCount()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Returns the row count.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnCount()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Returns the column count.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getObject(int, int)",
      "begin_line": 111,
      "end_line": 124,
      "comment": "\r\n     * Returns the object for a given row and column.\r\n     *\r\n     * @param row  the row index (in the range 0 to getRowCount() - 1).\r\n     * @param column  the column index (in the range 0 to getColumnCount() - 1).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getObject(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 29)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowKey(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\r\n     * Returns the key for a given row.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowIndex(java.lang.Comparable)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\r\n     * Returns the row index for a given key, or \u003ccode\u003e-1\u003c/code\u003e if the key\r\n     * is not recognised.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowKeys()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The row keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnKey(int)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the key for a given column.\r\n     *\r\n     * @param column  the column.\r\n     *\r\n     * @return The key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnIndex(java.lang.Comparable)",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\r\n     * Returns the column index for a given key, or \u003ccode\u003e-1\u003c/code\u003e if the key\r\n     * is not recognised.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnKeys()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The column keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getObject(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 221,
      "end_line": 246,
      "comment": "\r\n     * Returns the object for the given row and column keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003erowKey\u003ccode\u003e or \r\n     *         \u003ccode\u003ecolumnKey\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e or \r\n     *         \u003ccode\u003ecolumnKey\u003c/code\u003e is not recognised.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 47)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 56)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 65)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\r\n     * Adds an object to the table.  Performs the same function as setObject().\r\n     *\r\n     * @param object  the object.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.setObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 267,
      "end_line": 292,
      "comment": "\r\n     * Adds or updates an object.\r\n     *\r\n     * @param object  the object.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 25)",
        "(line 277,col 9)-(line 277,col 52)",
        "(line 278,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 41)",
        "(line 287,col 9)-(line 287,col 61)",
        "(line 288,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeObject(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 304,
      "end_line": 358,
      "comment": "\r\n     * Removes an object from the table by setting it to \u003ccode\u003enull\u003c/code\u003e.  If\r\n     * all the objects in the specified row and/or column are now \r\n     * \u003ccode\u003enull\u003c/code\u003e, the row and/or column is removed from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addObject(Object, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 43)",
        "(line 306,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 52)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 43)",
        "(line 318,col 9)-(line 318,col 31)",
        "(line 319,col 9)-(line 319,col 66)",
        "(line 321,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 335,col 23)",
        "(line 337,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 357,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeRow(int)",
      "begin_line": 367,
      "end_line": 370,
      "comment": "\r\n     * Removes an entire row from the table.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     * \r\n     * @see #removeColumn(int)\r\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeRow(java.lang.Comparable)",
      "begin_line": 381,
      "end_line": 388,
      "comment": "\r\n     * Removes an entire row from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e is not recognised.\r\n     * \r\n     * @see #removeColumn(Comparable)\r\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 40)",
        "(line 383,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeColumn(int)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Removes an entire column from the table.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     * \r\n     * @see #removeRow(int)\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 57)",
        "(line 399,col 9)-(line 399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeColumn(java.lang.Comparable)",
      "begin_line": 411,
      "end_line": 426,
      "comment": "\r\n     * Removes an entire column from the table.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e is not recognised.\r\n     * \r\n     * @see #removeRow(Comparable)\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 46)",
        "(line 413,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 49)",
        "(line 418,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.clear()",
      "begin_line": 433,
      "end_line": 437,
      "comment": "\r\n     * Clears all the data and associated keys.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 29)",
        "(line 435,col 9)-(line 435,col 32)",
        "(line 436,col 9)-(line 436,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.equals(java.lang.Object)",
      "begin_line": 446,
      "end_line": 486,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 51)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 37)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 40)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.hashCode()",
      "begin_line": 493,
      "end_line": 499,
      "comment": "\r\n     * Returns a hashcode for this object.\r\n     * \r\n     * @return A hashcode.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 19)",
        "(line 495,col 9)-(line 495,col 41)",
        "(line 496,col 9)-(line 496,col 58)",
        "(line 497,col 9)-(line 497,col 52)",
        "(line 498,col 9)-(line 498,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.clone()",
      "begin_line": 509,
      "end_line": 520,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 62)",
        "(line 511,col 9)-(line 511,col 68)",
        "(line 512,col 9)-(line 512,col 62)",
        "(line 513,col 9)-(line 513,col 63)",
        "(line 514,col 9)-(line 514,col 49)",
        "(line 515,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 21)"
      ]
    }
  ]
}