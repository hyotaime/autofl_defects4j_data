{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/xy/NormalizedMatrixSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalizedMatrixSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.xy.MatrixSeries"
      ],
      "begin_line": 51,
      "end_line": 145,
      "comment": "\r\n * Represents a dense normalized matrix M[i,j] where each Mij item of the\r\n * matrix has a value (default is 0). When a matrix item is observed using\r\n * \u003ccode\u003egetItem\u003c/code\u003e method, it is normalized, that is, divided by the\r\n * total sum of all items. It can be also be scaled by setting a scale factor.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SCALE_FACTOR"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The default scale factor. "
    },
    {
      "type": "field",
      "varNames": [
        "m_scaleFactor"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\r\n     * A factor that multiplies each item in this series when observed using \r\n     * getItem method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "m_totalSum"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The sum of all items in this matrix "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.NormalizedMatrixSeries(java.lang.String, int, int)",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\r\n     * Constructor for NormalizedMatrixSeries.\r\n     *\r\n     * @param name  the series name.\r\n     * @param rows  the number of rows.\r\n     * @param columns  the number of columns.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 35)",
        "(line 81,col 9)-(line 81,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.getItem(int)",
      "begin_line": 93,
      "end_line": 101,
      "comment": "\r\n     * Returns an item.\r\n     * \r\n     * @param itemIndex  the index.\r\n     * \r\n     * @return The value.\r\n     * \r\n     * @see org.jfree.data.xy.MatrixSeries#getItem(int)\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 95,col 41)",
        "(line 97,col 9)-(line 97,col 52)",
        "(line 98,col 9)-(line 98,col 53)",
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.setScaleFactor(double)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\r\n     * Sets the factor that multiplies each item in this series when observed\r\n     * using getItem mehtod.\r\n     *\r\n     * @param factor new factor to set.\r\n     *\r\n     * @see #DEFAULT_SCALE_FACTOR\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.getScaleFactor()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\r\n     * Returns the factor that multiplies each item in this series when\r\n     * observed using getItem mehtod.\r\n     *\r\n     * @return The factor\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.update(int, int, double)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\r\n     * @see org.jfree.data.xy.MatrixSeries#update(int, int, double)\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 37)",
        "(line 133,col 9)-(line 133,col 31)",
        "(line 135,col 9)-(line 135,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.NormalizedMatrixSeries.zeroAll()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\r\n     * @see org.jfree.data.xy.MatrixSeries#zeroAll()\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 28)",
        "(line 143,col 9)-(line 143,col 24)"
      ]
    }
  ]
}