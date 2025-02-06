{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/statistics/BoxAndWhiskerXYDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerXYDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.xy.XYDataset"
      ],
      "begin_line": 66,
      "end_line": 179,
      "comment": "\r\n * An interface that defines data in the form of (x, max, min, average, median) \r\n * tuples.\r\n * \u003cP\u003e\r\n * Example: JFreeChart uses this interface to obtain data for AIMS \r\n * max-min-average-median plots.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMeanValue(int, int)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * Returns the mean for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The mean for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMedianValue(int, int)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * Returns the median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The median-value for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getQ1Value(int, int)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\r\n     * Returns the Q1 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q1 median-value for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getQ3Value(int, int)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * Returns the Q3 median-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The Q3 median-value for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMinRegularValue(int, int)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\r\n     * Returns the min-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The min-value for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMaxRegularValue(int, int)",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * Returns the max-value for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The max-value for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMinOutlier(int, int)",
      "begin_line": 135,
      "end_line": 135,
      "comment": "\r\n     * Returns the minimum value which is not a farout.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getMaxOutlier(int, int)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\r\n     * Returns the maximum value which is not a farout, ie Q3 + (interquartile \r\n     * range * farout coefficient).\r\n     * \r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return A \u003ccode\u003eNumber\u003c/code\u003e representing the maximum non-farout value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getOutliers(int, int)",
      "begin_line": 156,
      "end_line": 156,
      "comment": "\r\n     * Returns an array of outliers for the specified series and item.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The array of outliers for the specified series and item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getOutlierCoefficient()",
      "begin_line": 168,
      "end_line": 168,
      "comment": "\r\n     * Returns the value used as the outlier coefficient. The outlier \r\n     * coefficient gives an indication of the degree of certainty in an \r\n     * unskewed distribution.  Increasing the coefficient increases the number \r\n     * of values included.  Currently only used to ensure farout coefficient \r\n     * is greater than the outlier coefficient\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate \r\n     *         outliers\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerXYDataset.getFaroutCoefficient()",
      "begin_line": 177,
      "end_line": 177,
      "comment": "\r\n     * Returns the value used as the farout coefficient. The farout coefficient\r\n     * allows the calculation of which values will be off the graph.\r\n     *\r\n     * @return A \u003ccode\u003edouble\u003c/code\u003e representing the value used to calculate \r\n     *         farouts\r\n     ",
      "child_ranges": []
    }
  ]
}