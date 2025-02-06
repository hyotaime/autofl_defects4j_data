{
  "filepath": "/tmp/Chart-2b/source/org/jfree/data/category/IntervalCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalCategoryDataset",
      "is_interface": true,
      "parent_types": [
        "org.jfree.data.category.CategoryDataset"
      ],
      "begin_line": 57,
      "end_line": 107,
      "comment": "\r\n * A category dataset that defines a value range for each series/category\r\n * combination.  The data value (defined in the {@link CategoryDataset}\r\n * interface) is NOT required to fall within the value range specified here.\r\n * If the start value and the end value are not \u003ccode\u003enull\u003c/code\u003e, then\r\n * it is a requirement that the start value must be less than or equal to the\r\n * end value.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.IntervalCategoryDataset.getStartValue(int, int)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category (zero-based index).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.IntervalCategoryDataset.getStartValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 81,
      "end_line": 81,
      "comment": "\r\n     * Returns the start value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param category  the category key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The start value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getEndValue(Comparable, Comparable)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.IntervalCategoryDataset.getEndValue(int, int)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series (zero-based index).\r\n     * @param category  the category (zero-based index).\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(int, int)\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.data.category.IntervalCategoryDataset.getEndValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\r\n     * Returns the end value for the interval for a given series and category.\r\n     *\r\n     * @param series  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param category  the category key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The end value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getStartValue(Comparable, Comparable)\r\n     ",
      "child_ranges": []
    }
  ]
}