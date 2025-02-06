{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/gantt/GanttCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GanttCategoryDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.category.IntervalCategoryDataset"
      ],
      "begin_line": 51,
      "end_line": 182,
      "comment": "\r\n * An extension of the {@link IntervalCategoryDataset} interface that adds\r\n * support for multiple sub-intervals.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(int, int)",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The percent complete.\r\n     *\r\n     * @see #getPercentComplete(Comparable, Comparable)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     *\r\n     * @see #getPercentComplete(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getSubIntervalCount(int, int)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(Comparable, Comparable)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     *\r\n     * @see #getSubIntervalCount(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getStartValue(int, int, int)",
      "begin_line": 112,
      "end_line": 112,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 125,
      "end_line": 126,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getEndValue(int, int, int)",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 152,
      "end_line": 153,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(int, int, int)",
      "begin_line": 166,
      "end_line": 166,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(Comparable, Comparable, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 179,
      "end_line": 180,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getPercentComplete(int, int, int)\r\n     ",
      "child_ranges": []
    }
  ]
}