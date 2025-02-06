{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/StandardCategoryToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardCategoryToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
        "org.jfree.chart.labels.CategoryToolTipGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 130,
      "comment": "\r\n * A standard tool tip generator that can be used with a \r\n * {@link org.jfree.chart.renderer.category.CategoryItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT_STRING"
      ],
      "begin_line": 63,
      "end_line": 64,
      "comment": " The default format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryToolTipGenerator.StandardCategoryToolTipGenerator()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\r\n     * Creates a new generator with a default number formatter.\r\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryToolTipGenerator.StandardCategoryToolTipGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\r\n     * Creates a new generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategoryToolTipGenerator.StandardCategoryToolTipGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\r\n     * Creates a new generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategoryToolTipGenerator.generateToolTip(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\r\n     * Generates the tool tip text for an item in a dataset.  Note: in the \r\n     * current dataset implementation, each row is a series, and each column \r\n     * contains values for a particular category.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The tooltip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategoryToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\r\n     * Tests this generator for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 33)"
      ]
    }
  ]
}