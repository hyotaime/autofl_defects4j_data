{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/StandardCategoryItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardCategoryItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
        "org.jfree.chart.labels.CategoryItemLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 149,
      "comment": "\r\n * A standard label generator that can be used with a \r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FORMAT_STRING"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The default format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.StandardCategoryItemLabelGenerator()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\r\n     * Creates a new generator with a default number formatter.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.StandardCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\r\n     * Creates a new generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.StandardCategoryItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\r\n     * Creates a new generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param percentFormatter  the percent formatter (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * \r\n     * @since 1.0.2\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.StandardCategoryItemLabelGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\r\n     * Creates a new generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.generateLabel(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Generates the label for an item in a dataset.  Note: in the current \r\n     * dataset implementation, each row is a series, and each column contains \r\n     * values for a particular category.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategoryItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 140,
      "end_line": 148,
      "comment": "\r\n     * Tests this generator for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this generator is equal to \r\n     *     \u003ccode\u003eobj\u003c/code\u003e, and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 33)"
      ]
    }
  ]
}