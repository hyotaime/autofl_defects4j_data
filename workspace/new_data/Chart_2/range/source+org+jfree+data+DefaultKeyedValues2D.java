{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/DefaultKeyedValues2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValues2D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.KeyedValues2D",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 582,
      "comment": "\r\n * A data structure that stores zero, one or many values, where each value\r\n * is associated with two keys (a \u0027row\u0027 key and a \u0027column\u0027 key).  The keys\r\n * should be (a) instances of {@link Comparable} and (b) immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "rowKeys"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The row keys. "
    },
    {
      "type": "field",
      "varNames": [
        "columnKeys"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The column keys. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The row data. "
    },
    {
      "type": "field",
      "varNames": [
        "sortRowKeys"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " If the row keys should be sorted by their comparable order. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues2D.DefaultKeyedValues2D()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues2D.DefaultKeyedValues2D(boolean)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     *\r\n     * @param sortRowKeys  if the row keys should be sorted.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 49)",
        "(line 106,col 9)-(line 106,col 52)",
        "(line 107,col 9)-(line 107,col 46)",
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowCount()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\r\n     * Returns the row count.\r\n     *\r\n     * @return The row count.\r\n     *\r\n     * @see #getColumnCount()\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnCount()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the column count.\r\n     *\r\n     * @return The column count.\r\n     *\r\n     * @see #getRowCount()\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getValue(int, int)",
      "begin_line": 143,
      "end_line": 156,
      "comment": "\r\n     * Returns the value for a given row and column.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #getValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 77)",
        "(line 146,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowKey(int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the key for a given row.\r\n     *\r\n     * @param row  the row index (in the range 0 to {@link #getRowCount()} - 1).\r\n     *\r\n     * @return The row key.\r\n     *\r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getColumnKey(int)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowIndex(java.lang.Comparable)",
      "begin_line": 182,
      "end_line": 192,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     *\r\n     * @see #getRowKey(int)\r\n     * @see #getColumnIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowKeys()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Returns the row keys in an unmodifiable list.\r\n     *\r\n     * @return The row keys.\r\n     *\r\n     * @see #getColumnKeys()\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnKey(int)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the key for a given column.\r\n     *\r\n     * @param column  the column (in the range 0 to {@link #getColumnCount()}\r\n     *     - 1).\r\n     *\r\n     * @return The key.\r\n     *\r\n     * @see #getColumnIndex(Comparable)\r\n     * @see #getRowKey(int)\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnIndex(java.lang.Comparable)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     *\r\n     * @see #getColumnKey(int)\r\n     * @see #getRowIndex(Comparable)\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnKeys()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Returns the column keys in an unmodifiable list.\r\n     *\r\n     * @return The column keys.\r\n     *\r\n     * @see #getRowKeys()\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 261,
      "end_line": 288,
      "comment": "\r\n     * Returns the value for the given row and column keys.  This method will\r\n     * throw an {@link UnknownKeyException} if either key is not defined in the\r\n     * data structure.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 279,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 301,
      "end_line": 305,
      "comment": "\r\n     * Adds a value to the table.  Performs the same function as\r\n     * #setValue(Number, Comparable, Comparable).\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 317,
      "end_line": 344,
      "comment": "\r\n     * Adds or updates a value.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 321,col 43)",
        "(line 323,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 39)",
        "(line 340,col 9)-(line 340,col 61)",
        "(line 341,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 356,
      "end_line": 402,
      "comment": "\r\n     * Removes a value from the table by setting it to \u003ccode\u003enull\u003c/code\u003e.  If\r\n     * all the values in the specified row and/or column are now\r\n     * \u003ccode\u003enull\u003c/code\u003e, the row and/or column is removed from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 42)",
        "(line 360,col 9)-(line 360,col 31)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 78)",
        "(line 364,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 375,col 9)",
        "(line 378,col 9)-(line 378,col 23)",
        "(line 381,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeRow(int)",
      "begin_line": 412,
      "end_line": 415,
      "comment": "\r\n     * Removes a row.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     *\r\n     * @see #removeRow(Comparable)\r\n     * @see #removeColumn(int)\r\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 38)",
        "(line 414,col 9)-(line 414,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeRow(java.lang.Comparable)",
      "begin_line": 428,
      "end_line": 439,
      "comment": "\r\n     * Removes a row from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #removeRow(int)\r\n     * @see #removeColumn(Comparable)\r\n     *\r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e is not defined in the\r\n     *         table.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 40)",
        "(line 433,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeColumn(int)",
      "begin_line": 449,
      "end_line": 452,
      "comment": "\r\n     * Removes a column.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     *\r\n     * @see #removeColumn(Comparable)\r\n     * @see #removeRow(int)\r\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 57)",
        "(line 451,col 9)-(line 451,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeColumn(java.lang.Comparable)",
      "begin_line": 467,
      "end_line": 483,
      "comment": "\r\n     * Removes a column from the table.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws UnknownKeyException if the table does not contain a column with\r\n     *     the specified key.\r\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnKey\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #removeColumn(int)\r\n     * @see #removeRow(Comparable)\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 49)",
        "(line 475,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.clear()",
      "begin_line": 488,
      "end_line": 492,
      "comment": "\r\n     * Clears all the data and associated keys.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 29)",
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.equals(java.lang.Object)",
      "begin_line": 501,
      "end_line": 547,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param o  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 47)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 37)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 40)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.hashCode()",
      "begin_line": 554,
      "end_line": 560,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 19)",
        "(line 556,col 9)-(line 556,col 41)",
        "(line 557,col 9)-(line 557,col 58)",
        "(line 558,col 9)-(line 558,col 52)",
        "(line 559,col 9)-(line 559,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.clone()",
      "begin_line": 570,
      "end_line": 580,
      "comment": "\r\n     * Returns a clone.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this class will not throw this\r\n     *         exception, but subclasses (if any) might.\r\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 74)",
        "(line 574,col 9)-(line 574,col 68)",
        "(line 575,col 9)-(line 575,col 62)",
        "(line 578,col 9)-(line 578,col 65)",
        "(line 579,col 9)-(line 579,col 21)"
      ]
    }
  ]
}