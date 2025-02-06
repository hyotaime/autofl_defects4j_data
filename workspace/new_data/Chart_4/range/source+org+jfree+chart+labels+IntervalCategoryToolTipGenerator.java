{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/labels/IntervalCategoryToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IntervalCategoryToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.StandardCategoryToolTipGenerator"
      ],
      "begin_line": 55,
      "end_line": 154,
      "comment": "\r\n * A tooltip generator for plots that use data from an\r\n * {@link IntervalCategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT_STRING"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " The default format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\r\n     * Creates a new generator with a default number formatter.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\r\n     * Creates a new generator with the specified number formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param formatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.IntervalCategoryToolTipGenerator(java.lang.String, java.text.DateFormat)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\r\n     * Creates a new generator with the specified date formatter.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param formatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 106,
      "end_line": 133,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * \u003ccode\u003eMessageFormat\u003c/code\u003e class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 40)",
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 110,col 60)",
        "(line 111,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.IntervalCategoryToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "\r\n     * Tests this tool tip generator for equality with an arbitrary\r\n     * object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 33)"
      ]
    }
  ]
}