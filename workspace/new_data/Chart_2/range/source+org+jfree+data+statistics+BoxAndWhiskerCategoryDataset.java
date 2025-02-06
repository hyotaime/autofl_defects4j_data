{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/statistics/BoxAndWhiskerCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerCategoryDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.category.CategoryDataset"
      ],
      "begin_line": 56,
      "end_line": 240,
      "comment": "\r\n * A category dataset that defines various medians, outliers and an average\r\n * value for each item.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMeanValue(int, int)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The mean value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMeanValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\r\n     * Returns the average value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The average value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMedianValue(int, int)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMedianValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getQ1Value(int, int)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\r\n     * Returns the q1median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The q1median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getQ1Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\r\n     * Returns the q1median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The q1median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getQ3Value(int, int)",
      "begin_line": 126,
      "end_line": 126,
      "comment": "\r\n     * Returns the q3median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The q3median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getQ3Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\r\n     * Returns the q3median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The q3median value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMinRegularValue(int, int)",
      "begin_line": 146,
      "end_line": 146,
      "comment": "\r\n     * Returns the minimum regular (non-outlier) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The minimum regular value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMinRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 156,
      "end_line": 156,
      "comment": "\r\n     * Returns the minimum regular (non-outlier) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The minimum regular value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMaxRegularValue(int, int)",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\r\n     * Returns the maximum regular (non-outlier) value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The maximum regular value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 176,
      "end_line": 176,
      "comment": "\r\n     * Returns the maximum regular (non-outlier) value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The maximum regular value.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMinOutlier(int, int)",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\r\n     * Returns the minimum outlier (non-farout) for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The minimum outlier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMinOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\r\n     * Returns the minimum outlier (non-farout) for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The minimum outlier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMaxOutlier(int, int)",
      "begin_line": 206,
      "end_line": 206,
      "comment": "\r\n     * Returns the maximum outlier (non-farout) for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The maximum outlier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getMaxOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\r\n     * Returns the maximum outlier (non-farout) for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The maximum outlier.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getOutliers(int, int)",
      "begin_line": 227,
      "end_line": 227,
      "comment": "\r\n     * Returns a list of outlier values for an item.  The list may be empty,\r\n     * but should never be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return A list of outliers for an item.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset.getOutliers(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 238,
      "end_line": 238,
      "comment": "\r\n     * Returns a list of outlier values for an item.  The list may be empty,\r\n     * but should never be \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return A list of outlier values for an item.\r\n     ",
      "child_ranges": []
    }
  ]
}