{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/DataUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 169,
      "comment": "\r\n * Utility methods for use with some of the data classes (but not the datasets, \r\n * see {@link DatasetUtilities}).\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateColumnTotal(org.jfree.data.Values2D, int)",
      "begin_line": 64,
      "end_line": 74,
      "comment": "\r\n     * Returns the total of the values in one column of the supplied data\r\n     * table.\r\n     * \r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The total of the values in the specified column.\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 27)",
        "(line 66,col 9)-(line 66,col 42)",
        "(line 67,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateRowTotal(org.jfree.data.Values2D, int)",
      "begin_line": 85,
      "end_line": 95,
      "comment": "\r\n     * Returns the total of the values in one row of the supplied data\r\n     * table.\r\n     * \r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * \r\n     * @return The total of the values in the specified row.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)",
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.createNumberArray(double[])",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\r\n     * Constructs an array of \u003ccode\u003eNumber\u003c/code\u003e objects from an array of \r\n     * \u003ccode\u003edouble\u003c/code\u003e primitives.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ccode\u003eDouble\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.createNumberArray2D(double[][])",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\r\n     * Constructs an array of arrays of \u003ccode\u003eNumber\u003c/code\u003e objects from a \r\n     * corresponding structure containing \u003ccode\u003edouble\u003c/code\u003e primitives.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ccode\u003eDouble\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 29)",
        "(line 129,col 9)-(line 129,col 45)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.getCumulativePercentages(org.jfree.data.KeyedValues)",
      "begin_line": 146,
      "end_line": 167,
      "comment": "\r\n     * Returns a {@link KeyedValues} instance that contains the cumulative \r\n     * percentage values for the data in another {@link KeyedValues} instance.\r\n     * \u003cp\u003e\r\n     * The percentages are values between 0.0 and 1.0 (where 1.0 \u003d 100%).\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The cumulative percentages.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 61)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 34)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    }
  ]
}