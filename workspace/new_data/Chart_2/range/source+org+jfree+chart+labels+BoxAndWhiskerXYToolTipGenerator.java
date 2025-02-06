{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/BoxAndWhiskerXYToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoxAndWhiskerXYToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.StandardXYToolTipGenerator",
        "org.jfree.chart.labels.XYToolTipGenerator",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 79,
      "end_line": 167,
      "comment": "\r\n * An item label generator for plots that use data from a\r\n * {@link BoxAndWhiskerXYDataset}.\r\n * \u003cP\u003e\r\n * The tooltip text and item label text are composed using a\r\n * {@link java.text.MessageFormat} object, that can aggregate some or all of\r\n * the following string values into a message.\r\n * \u003ctable\u003e\r\n * \u003ctr\u003e\u003ctd\u003e0\u003c/td\u003e\u003ctd\u003eSeries Name\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e1\u003c/td\u003e\u003ctd\u003eX (value or date)\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e2\u003c/td\u003e\u003ctd\u003eMean\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e3\u003c/td\u003e\u003ctd\u003eMedian\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e4\u003c/td\u003e\u003ctd\u003eMinimum\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e5\u003c/td\u003e\u003ctd\u003eMaximum\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e6\u003c/td\u003e\u003ctd\u003eQuartile 1\u003c/td\u003e\u003c/tr\u003e\r\n * \u003ctr\u003e\u003ctd\u003e7\u003c/td\u003e\u003ctd\u003eQuartile 3\u003c/td\u003e\u003c/tr\u003e\r\n * \u003c/table\u003e\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": " The default tooltip format string. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.BoxAndWhiskerXYToolTipGenerator()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\r\n     * Creates a default item label generator.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.BoxAndWhiskerXYToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\r\n     * Creates a new item label generator.  If the date formatter is not\r\n     * \u003ccode\u003enull\u003c/code\u003e, the x-values will be formatted as dates.\r\n     *\r\n     * @param toolTipFormat  the tool tip format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                       permitted).\r\n     * @param numberFormat  the number formatter (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param dateFormat  the date formatter (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.createItemArray(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 125,
      "end_line": 148,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)",
        "(line 128,col 9)-(line 128,col 60)",
        "(line 129,col 9)-(line 129,col 46)",
        "(line 130,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 46)",
        "(line 138,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 165,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 33)"
      ]
    }
  ]
}