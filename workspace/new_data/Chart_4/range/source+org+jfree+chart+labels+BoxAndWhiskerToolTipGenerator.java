{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/labels/BoxAndWhiskerToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
        "org.jfree.chart.labels.CategoryToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 148,
      "comment": "\r\n * An item label generator for plots that use data from a\r\n * {@link BoxAndWhiskerCategoryDataset}.\r\n * \u003cP\u003e\r\n * The tooltip text and item label text are composed using a\r\n * {@link java.text.MessageFormat} object, that can aggregate some or all of\r\n * the following string values into a message.\r\n * \u003ctable\u003e\r\n * \u003ctr\u003e\u003ctd\u003e0\u003c/td\u003e\u003ctd\u003eSeries Name\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e1\u003c/td\u003e\u003ctd\u003eX (value or date)\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e2\u003c/td\u003e\u003ctd\u003eMean\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e3\u003c/td\u003e\u003ctd\u003eMedian\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e4\u003c/td\u003e\u003ctd\u003eMinimum\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e5\u003c/td\u003e\u003ctd\u003eMaximum\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e6\u003c/td\u003e\u003ctd\u003eQuartile 1\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e7\u003c/td\u003e\u003ctd\u003eQuartile 3\u003c/td\u003e\u003c/tr\u003e\r\n * \u003c/table\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": " The default tooltip format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.BoxAndWhiskerToolTipGenerator()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Creates a default tool tip generator.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.BoxAndWhiskerToolTipGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\r\n     * Creates a tool tip formatter.\r\n     *\r\n     * @param format  the tool tip format string.\r\n     * @param formatter  the formatter.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int, int)",
      "begin_line": 111,
      "end_line": 129,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 40)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 115,col 50)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 117,col 40)",
        "(line 118,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 21)"
      ]
    }
  ]
}