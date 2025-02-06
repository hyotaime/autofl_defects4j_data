{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/StandardPieToolTipGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardPieToolTipGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
        "org.jfree.chart.labels.PieToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 77,
      "end_line": 166,
      "comment": "\r\n * A standard item label generator for plots that use data from a\r\n * {@link PieDataset}.\r\n * \u003cp\u003e\r\n * For the label format, use {0} where the pie section key should be inserted,\r\n * {1} for the absolute section value and {2} for the percent amount of the pie\r\n * section, e.g. \u003ccode\u003e\"{0} \u003d {1} ({2})\"\u003c/code\u003e will display as\r\n * \u003ccode\u003eapple \u003d 120 (5%)\u003c/code\u003e.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOOLTIP_FORMAT"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The default tooltip format. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.StandardPieToolTipGenerator()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.StandardPieToolTipGenerator(java.util.Locale)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\r\n     * Creates a pie tool tip generator for the specified locale, using the\r\n     * default format string.\r\n     *\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.StandardPieToolTipGenerator(java.lang.String)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\r\n     * Creates a pie tool tip generator for the default locale.\r\n     *\r\n     * @param labelFormat  the label format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.StandardPieToolTipGenerator(java.lang.String, java.util.Locale)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\r\n     * Creates a pie tool tip generator for the specified locale.\r\n     *\r\n     * @param labelFormat  the label format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.StandardPieToolTipGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param numberFormat  the format object for the values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param percentFormat  the format object for the percentages\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.generateToolTip(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\r\n     * Generates a tool tip text item for one section in a pie chart.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieToolTipGenerator.clone()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 29)"
      ]
    }
  ]
}