{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/CategoryItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryItemLabelGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 109,
      "comment": "\r\n * A \u003ci\u003ecategory item label generator\u003c/i\u003e is an object that can be assigned to a\r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer} and that\r\n * assumes responsibility for creating text items to be used as labels for the\r\n * items in a {@link org.jfree.chart.plot.CategoryPlot}.\r\n * \u003cp\u003e\r\n * To assist with cloning charts, classes that implement this interface should\r\n * also implement the {@link PublicCloneable} interface.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CategoryItemLabelGenerator.generateRowLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The label.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CategoryItemLabelGenerator.generateColumnLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\r\n     * Generates a label for the specified row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CategoryItemLabelGenerator.generateLabel(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\r\n     * Generates a label for the specified item. The label is typically a\r\n     * formatted version of the data value, but any text can be used.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}