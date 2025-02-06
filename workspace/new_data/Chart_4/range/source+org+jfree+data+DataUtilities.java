{
  "filepath": "/tmp/Chart-4b/source/org/jfree/data/DataUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DataUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 296,
      "comment": "\r\n * Utility methods for use with some of the data classes (but not the datasets,\r\n * see {@link DatasetUtilities}).\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.equal(double[][], double[][])",
      "begin_line": 72,
      "end_line": 88,
      "comment": "\r\n     * Tests two arrays for equality.  To be considered equal, the arrays must\r\n     * have exactly the same dimensions, and the values in each array must also\r\n     * match (two values that qre both NaN or both INF are considered equal\r\n     * in this test).\r\n     *\r\n     * @param a  the first array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param b  the second array (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.clone(double[][])",
      "begin_line": 99,
      "end_line": 112,
      "comment": "\r\n     * Returns a clone of the specified array.\r\n     *\r\n     * @param source  the source array (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A clone of the array.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 55)",
        "(line 104,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateColumnTotal(org.jfree.data.Values2D, int)",
      "begin_line": 123,
      "end_line": 136,
      "comment": "\r\n     * Returns the total of the values in one column of the supplied data\r\n     * table.\r\n     *\r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The total of the values in the specified column.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateColumnTotal(org.jfree.data.Values2D, int, int[])",
      "begin_line": 150,
      "end_line": 167,
      "comment": "\r\n     * Returns the total of the values in one column of the supplied data\r\n     * table by taking only the row numbers in the array into account.\r\n     *\r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     * @param validRows the array with valid rows (zero-based).\r\n     *\r\n     * @return The total of the valid values in the specified column.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 27)",
        "(line 156,col 9)-(line 156,col 42)",
        "(line 157,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateRowTotal(org.jfree.data.Values2D, int)",
      "begin_line": 178,
      "end_line": 191,
      "comment": "\r\n     * Returns the total of the values in one row of the supplied data\r\n     * table.\r\n     *\r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The total of the values in the specified row.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 27)",
        "(line 183,col 9)-(line 183,col 48)",
        "(line 184,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.calculateRowTotal(org.jfree.data.Values2D, int, int[])",
      "begin_line": 205,
      "end_line": 222,
      "comment": "\r\n     * Returns the total of the values in one row of the supplied data\r\n     * table by taking only the column numbers in the array into account.\r\n     *\r\n     * @param data  the table of values (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param validCols the array with valid cols (zero-based).\r\n     *\r\n     * @return The total of the valid values in the specified row.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 27)",
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.createNumberArray(double[])",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\r\n     * Constructs an array of \u003ccode\u003eNumber\u003c/code\u003e objects from an array of\r\n     * \u003ccode\u003edouble\u003c/code\u003e primitives.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ccode\u003eDouble\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 50)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.createNumberArray2D(double[][])",
      "begin_line": 251,
      "end_line": 261,
      "comment": "\r\n     * Constructs an array of arrays of \u003ccode\u003eNumber\u003c/code\u003e objects from a\r\n     * corresponding structure containing \u003ccode\u003edouble\u003c/code\u003e primitives.\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return An array of \u003ccode\u003eDouble\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 256,col 45)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DataUtilities.getCumulativePercentages(org.jfree.data.KeyedValues)",
      "begin_line": 273,
      "end_line": 294,
      "comment": "\r\n     * Returns a {@link KeyedValues} instance that contains the cumulative\r\n     * percentage values for the data in another {@link KeyedValues} instance.\r\n     * \u003cp\u003e\r\n     * The percentages are values between 0.0 and 1.0 (where 1.0 \u003d 100%).\r\n     *\r\n     * @param data  the data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The cumulative percentages.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 61)",
        "(line 278,col 9)-(line 278,col 27)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 34)",
        "(line 286,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 22)"
      ]
    }
  ]
}