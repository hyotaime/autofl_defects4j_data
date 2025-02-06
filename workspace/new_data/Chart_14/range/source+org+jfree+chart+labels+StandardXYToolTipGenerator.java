{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/StandardXYToolTipGenerator.java",
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
      "end_line": 199,
      "comment": "\r\n * A standard tool tip generator for use with an \r\n * {@link org.jfree.chart.renderer.xy.XYItemRenderer}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOL_TIP_FORMAT"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The default tooltip format. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.getTimeSeriesInstance()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\r\n     * Returns a tool tip generator that formats the x-values as dates and the \r\n     * y-values as numbers.\r\n     * \r\n     * @return A tool tip generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 77,col 70)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\r\n     * Creates a tool tip generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 85,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\r\n     * Creates a tool tip generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\r\n     * Creates a tool tip generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\r\n     * Creates a tool tip generator using the specified formatters (a \r\n     * number formatter for the x-values and a date formatter for the \r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     *                 \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.StandardXYToolTipGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\r\n     * Creates a tool tip generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Generates the tool tip text for an item in a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The tooltip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.equals(java.lang.Object)",
      "begin_line": 178,
      "end_line": 186,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYToolTipGenerator.clone()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 29)"
      ]
    }
  ]
}