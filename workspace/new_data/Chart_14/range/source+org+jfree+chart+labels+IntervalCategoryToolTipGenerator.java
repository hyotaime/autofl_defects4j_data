{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/IntervalCategoryToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalCategoryToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
        "org.jfree.chart.labels.CategoryToolTipGenerator",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 138,
      "comment": "\r\n * A tooltip generator for plots that use data from an \r\n * {@link IntervalCategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT_STRING"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": " The default format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator()",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\r\n     * Creates a new generator with a default number formatter.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\r\n     * Creates a new generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\r\n     * Creates a new generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 109,
      "end_line": 136,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * \u003ccode\u003eMessageFormat\u003c/code\u003e class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 112,col 54)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 22)"
      ]
    }
  ]
}