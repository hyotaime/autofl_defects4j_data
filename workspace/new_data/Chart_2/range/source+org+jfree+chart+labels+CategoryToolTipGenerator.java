{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/CategoryToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryToolTipGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 72,
      "comment": "\r\n * A \u003ci\u003ecategory tool tip generator\u003c/i\u003e is an object that can be assigned to a\r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer} and that\r\n * assumes responsibility for creating text items to be used as tooltips for the\r\n * items in a {@link org.jfree.chart.plot.CategoryPlot}.\r\n * \u003cp\u003e\r\n * To assist with cloning charts, classes that implement this interface should\r\n * also implement the {@link PublicCloneable} interface.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.CategoryToolTipGenerator.generateToolTip(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\r\n     * Generates the tool tip text for an item in a dataset.  Note: in the\r\n     * current dataset implementation, each row is a series, and each column\r\n     * contains values for a particular category.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The tooltip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}