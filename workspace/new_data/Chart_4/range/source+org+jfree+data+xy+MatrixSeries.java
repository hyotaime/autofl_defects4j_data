{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/xy/MatrixSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MatrixSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 237,
      "comment": "\r\n * Represents a dense matrix M[i,j] where each Mij item of the matrix has a\r\n * value (default is 0).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Series matrix values "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.MatrixSeries.MatrixSeries(java.lang.String, int, int)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\r\n     * Constructs a new matrix series.\r\n     * \u003cp\u003e\r\n     * By default, all matrix items are initialzed to 0.\r\n     * \u003c/p\u003e\r\n     *\r\n     * @param name  series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rows  the number of rows.\r\n     * @param columns  the number of columns.\r\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)",
        "(line 78,col 9)-(line 78,col 46)",
        "(line 79,col 9)-(line 79,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getColumnsCount()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the number of columns in this matrix series.\r\n     *\r\n     * @return The number of columns in this matrix series.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getItem(int)",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\r\n     * Return the matrix item at the specified index.  Note that this method\r\n     * creates a new \u003ccode\u003eDouble\u003c/code\u003e instance every time it is called.\r\n     *\r\n     * @param itemIndex item index.\r\n     *\r\n     * @return The matrix item at the specified index.\r\n     *\r\n     * @see #get(int, int)\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 38)",
        "(line 104,col 9)-(line 104,col 41)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 108,col 9)-(line 108,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getItemColumn(int)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\r\n     * Returns the column of the specified item.\r\n     *\r\n     * @param itemIndex the index of the item.\r\n     *\r\n     * @return The column of the specified item.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getItemCount()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getItemRow(int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\r\n     * Returns the row of the specified item.\r\n     *\r\n     * @param itemIndex the index of the item.\r\n     *\r\n     * @return The row of the specified item.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.getRowCount()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\r\n     * Returns the number of rows in this matrix series.\r\n     *\r\n     * @return The number of rows in this matrix series.\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.get(int, int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the value of the specified item in this matrix series.\r\n     *\r\n     * @param i the row of the item.\r\n     * @param j the column of the item.\r\n     *\r\n     * @return The value of the specified item in this matrix series.\r\n     *\r\n     * @see #getItem(int)\r\n     * @see #update(int, int, double)\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.update(int, int, double)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\r\n     * Updates the value of the specified item in this matrix series.\r\n     *\r\n     * @param i the row of the item.\r\n     * @param j the column of the item.\r\n     * @param mij the new value for the item.\r\n     *\r\n     * @see #get(int, int)\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 30)",
        "(line 185,col 9)-(line 185,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.zeroAll()",
      "begin_line": 194,
      "end_line": 204,
      "comment": "\r\n     * Sets all matrix values to zero and sends a\r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered\r\n     * listeners.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 33)",
        "(line 196,col 9)-(line 196,col 40)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.MatrixSeries.equals(java.lang.Object)",
      "begin_line": 213,
      "end_line": 235,
      "comment": "\r\n     * Tests this object instance for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 47)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 33)"
      ]
    }
  ]
}