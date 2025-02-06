{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/xy/NormalizedMatrixSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalizedMatrixSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.MatrixSeries"
      ],
      "begin_line": 50,
      "end_line": 150,
      "comment": "\r\n * Represents a dense normalized matrix M[i,j] where each Mij item of the\r\n * matrix has a value (default is 0). When a matrix item is observed using\r\n * \u003ccode\u003egetItem\u003c/code\u003e method, it is normalized, that is, divided by the\r\n * total sum of all items. It can be also be scaled by setting a scale factor.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SCALE_FACTOR"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The default scale factor. "
    },
    {
      "type": "field",
      "varNames": [
        "m_scaleFactor"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\r\n     * A factor that multiplies each item in this series when observed using\r\n     * getItem method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "m_totalSum"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The sum of all items in this matrix "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.NormalizedMatrixSeries(java.lang.String, int, int)",
      "begin_line": 71,
      "end_line": 81,
      "comment": "\r\n     * Constructor for NormalizedMatrixSeries.\r\n     *\r\n     * @param name  the series name.\r\n     * @param rows  the number of rows.\r\n     * @param columns  the number of columns.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 35)",
        "(line 80,col 9)-(line 80,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.getItem(int)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\r\n     * Returns an item.\r\n     *\r\n     * @param itemIndex  the index.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see org.jfree.data.xy.MatrixSeries#getItem(int)\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 96,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 97,col 53)",
        "(line 99,col 9)-(line 99,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.setScaleFactor(double)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\r\n     * Sets the factor that multiplies each item in this series when observed\r\n     * using getItem mehtod.\r\n     *\r\n     * @param factor new factor to set.\r\n     *\r\n     * @see #DEFAULT_SCALE_FACTOR\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.getScaleFactor()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns the factor that multiplies each item in this series when\r\n     * observed using getItem mehtod.\r\n     *\r\n     * @return The factor\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.update(int, int, double)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "\r\n     * Updates the value of the specified item in this matrix series.\r\n     *\r\n     * @param i the row of the item.\r\n     * @param j the column of the item.\r\n     * @param mij the new value for the item.\r\n     *\r\n     * @see #get(int, int)\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)",
        "(line 138,col 9)-(line 138,col 31)",
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.zeroAll()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\r\n     * @see org.jfree.data.xy.MatrixSeries#zeroAll()\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 28)",
        "(line 148,col 9)-(line 148,col 24)"
      ]
    }
  ]
}