{
  "filepath": "/tmp/Chart-14b/source/org/jfree/data/statistics/Regression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Regression",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 227,
      "comment": "\r\n * A utility class for fitting regression curves to data.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Regression.getOLSRegression(double[][])",
      "begin_line": 62,
      "end_line": 94,
      "comment": "\r\n     * Returns the parameters \u0027a\u0027 and \u0027b\u0027 for an equation y \u003d a + bx, fitted to\r\n     * the data using ordinary least squares regression.  The result is \r\n     * returned as a double[], where result[0] --\u003e a, and result[1] --\u003e b.\r\n     *\r\n     * @param data  the data.\r\n     *\r\n     * @return The parameters.\r\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 24)",
        "(line 70,col 9)-(line 70,col 24)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 47)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 85,col 9)-(line 85,col 31)",
        "(line 86,col 9)-(line 86,col 31)",
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 90,col 44)",
        "(line 92,col 9)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Regression.getOLSRegression(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 106,
      "end_line": 138,
      "comment": "\r\n     * Returns the parameters \u0027a\u0027 and \u0027b\u0027 for an equation y \u003d a + bx, fitted to \r\n     * the data using ordinary least squares regression. The result is returned \r\n     * as a double[], where result[0] --\u003e a, and result[1] --\u003e b.\r\n     *\r\n     * @param data  the data.\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The parameters.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 42)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 24)",
        "(line 114,col 9)-(line 114,col 24)",
        "(line 115,col 9)-(line 115,col 25)",
        "(line 116,col 9)-(line 116,col 25)",
        "(line 117,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 47)",
        "(line 128,col 9)-(line 128,col 47)",
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 132,col 9)-(line 132,col 40)",
        "(line 133,col 9)-(line 133,col 30)",
        "(line 134,col 9)-(line 134,col 44)",
        "(line 136,col 9)-(line 136,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Regression.getPowerRegression(double[][])",
      "begin_line": 149,
      "end_line": 181,
      "comment": "\r\n     * Returns the parameters \u0027a\u0027 and \u0027b\u0027 for an equation y \u003d ax^b, fitted to \r\n     * the data using a power regression equation.  The result is returned as \r\n     * an array, where double[0] --\u003e a, and double[1] --\u003e b.\r\n     *\r\n     * @param data  the data.\r\n     *\r\n     * @return The parameters.\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 28)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 157,col 24)",
        "(line 158,col 9)-(line 158,col 25)",
        "(line 159,col 9)-(line 159,col 25)",
        "(line 160,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 47)",
        "(line 171,col 9)-(line 171,col 47)",
        "(line 172,col 9)-(line 172,col 31)",
        "(line 173,col 9)-(line 173,col 31)",
        "(line 175,col 9)-(line 175,col 40)",
        "(line 176,col 9)-(line 176,col 30)",
        "(line 177,col 9)-(line 177,col 69)",
        "(line 179,col 9)-(line 179,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.Regression.getPowerRegression(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 193,
      "end_line": 225,
      "comment": "\r\n     * Returns the parameters \u0027a\u0027 and \u0027b\u0027 for an equation y \u003d ax^b, fitted to \r\n     * the data using a power regression equation.  The result is returned as \r\n     * an array, where double[0] --\u003e a, and double[1] --\u003e b.\r\n     *\r\n     * @param data  the data.\r\n     * @param series  the series to fit the regression line against.\r\n     *\r\n     * @return The parameters.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 24)",
        "(line 201,col 9)-(line 201,col 24)",
        "(line 202,col 9)-(line 202,col 25)",
        "(line 203,col 9)-(line 203,col 25)",
        "(line 204,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 47)",
        "(line 215,col 9)-(line 215,col 47)",
        "(line 216,col 9)-(line 216,col 31)",
        "(line 217,col 9)-(line 217,col 31)",
        "(line 219,col 9)-(line 219,col 40)",
        "(line 220,col 9)-(line 220,col 30)",
        "(line 221,col 9)-(line 221,col 69)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    }
  ]
}