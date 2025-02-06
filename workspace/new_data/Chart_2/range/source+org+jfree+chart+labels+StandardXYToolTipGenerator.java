{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/StandardXYToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
        "org.jfree.chart.labels.XYToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 197,
      "comment": "\r\n * A standard tool tip generator for use with an\r\n * {@link org.jfree.chart.renderer.xy.XYItemRenderer}.\r\n "
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
        "DEFAULT_TOOL_TIP_FORMAT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The default tooltip format. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\r\n     * Returns a tool tip generator that formats the x-values as dates and the\r\n     * y-values as numbers.\r\n     *\r\n     * @return A tool tip generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\r\n     * Creates a tool tip generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\r\n     * Creates a tool tip generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\r\n     * Creates a tool tip generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\r\n     * Creates a tool tip generator using the specified formatters (a\r\n     * number formatter for the x-values and a date formatter for the\r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     *\r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 149,
      "end_line": 154,
      "comment": "\r\n     * Creates a tool tip generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Generates the tool tip text for an item in a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The tooltip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 176,
      "end_line": 184,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.clone()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 29)"
      ]
    }
  ]
}