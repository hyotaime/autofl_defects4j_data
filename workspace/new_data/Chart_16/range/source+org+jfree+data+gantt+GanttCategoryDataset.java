{
  "filepath": "/tmp/Chart-16b/source/org/jfree/data/gantt/GanttCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GanttCategoryDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.category.IntervalCategoryDataset"
      ],
      "begin_line": 50,
      "end_line": 161,
      "comment": "\r\n * An extension of the {@link IntervalCategoryDataset} interface that adds \r\n * support for multiple sub-intervals.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(int, int)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n     * Returns the percent complete for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The percent complete.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getSubIntervalCount(int, int)",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getSubIntervalCount(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\r\n     * Returns the number of sub-intervals for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return The sub-interval count.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getStartValue(int, int, int)",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval index (zero-based).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 112,
      "end_line": 113,
      "comment": "\r\n     * Returns the start value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getEndValue(int, int, int)",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 135,
      "end_line": 136,
      "comment": "\r\n     * Returns the end value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(int, int, int)",
      "begin_line": 147,
      "end_line": 147,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The percent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.gantt.GanttCategoryDataset.getPercentComplete(java.lang.Comparable, java.lang.Comparable, int)",
      "begin_line": 158,
      "end_line": 159,
      "comment": "\r\n     * Returns the percentage complete value of a sub-interval for a given item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param subinterval  the sub-interval.\r\n     *\r\n     * @return The precent complete value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}