{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/MeanAndStandardDeviation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeanAndStandardDeviation",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 179,
      "comment": "\r\n * A simple data structure that holds a mean value and a standard deviation \r\n * value.  This is used in the \r\n * {@link org.jfree.data.statistics.DefaultStatisticalCategoryDataset} class.\r\n "
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
        "mean"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The mean. "
    },
    {
      "type": "field",
      "varNames": [
        "standardDeviation"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The standard deviation. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.MeanAndStandardDeviation(double, double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new mean and standard deviation record.\r\n     * \r\n     * @param mean  the mean.\r\n     * @param standardDeviation  the standard deviation.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.MeanAndStandardDeviation(java.lang.Number, java.lang.Number)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\r\n     * Creates a new mean and standard deviation record.\r\n     *\r\n     * @param mean  the mean (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param standardDeviation  the standard deviation (\u003ccode\u003enull\u003c/code\u003e\r\n     *                           permitted.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)",
        "(line 86,col 9)-(line 86,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.getMean()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the mean.\r\n     *\r\n     * @return The mean.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.getMeanValue()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "\r\n     * Returns the mean as a double primitive.  If the underlying mean is\r\n     * \u003ccode\u003enull\u003c/code\u003e, this method will return \u003ccode\u003eDouble.NaN\u003c/code\u003e.\r\n     * \r\n     * @return The mean.\r\n     * \r\n     * @see #getMean()\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.getStandardDeviation()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\r\n     * Returns the standard deviation.\r\n     *\r\n     * @return The standard deviation.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.getStandardDeviationValue()",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\r\n     * Returns the standard deviation as a double primitive.  If the underlying\r\n     * standard deviation is \u003ccode\u003enull\u003c/code\u003e, this method will return \r\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\r\n     * \r\n     * @return The standard deviation.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.equals(java.lang.Object)",
      "begin_line": 149,
      "end_line": 166,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 71)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.MeanAndStandardDeviation.toString()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns a string representing this instance.\r\n     * \r\n     * @return A string.\r\n     * \r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 69)"
      ]
    }
  ]
}