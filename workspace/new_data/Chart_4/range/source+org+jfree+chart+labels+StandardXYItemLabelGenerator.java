{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/labels/StandardXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 215,
      "comment": "\r\n * A standard item label generator for plots that use data from an\r\n * {@link org.jfree.data.xy.XYDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_LABEL_FORMAT"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The default item label format. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 90,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     *\r\n     * @since 1.0.14\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 103,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\r\n     * Creates an item label generator using the specified formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\r\n     * Creates an item label generator using the specified formatters (a\r\n     * number formatter for the x-values and a date formatter for the\r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\r\n     * Creates a label generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Generates the item label text for an item in a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The label text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.clone()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 33)"
      ]
    }
  ]
}