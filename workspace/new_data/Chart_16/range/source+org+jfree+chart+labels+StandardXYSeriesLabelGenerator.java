{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/StandardXYSeriesLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardXYSeriesLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.XYSeriesLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 162,
      "comment": "\r\n * A standard series label generator for plots that use data from \r\n * an {@link org.jfree.data.xy.XYDataset}.\r\n * \u003cbr\u003e\u003cbr\u003e\r\n * This class implements \u003ccode\u003ePublicCloneable\u003c/code\u003e by mistake but we retain\r\n * this for the sake of backward compatibility.\r\n "
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
        "DEFAULT_LABEL_FORMAT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The format pattern. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.StandardXYSeriesLabelGenerator()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Creates a default series label generator (uses \r\n     * {@link #DEFAULT_LABEL_FORMAT}).\r\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.StandardXYSeriesLabelGenerator(java.lang.String)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\r\n     * Creates a new series label generator.\r\n     * \r\n     * @param format  the format pattern (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "\r\n     * Generates a label for the specified series.  This label will be\r\n     * used for the chart legend.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     * \r\n     * @return A series label.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 10)",
        "(line 109,col 9)-(line 109,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)",
        "(line 123,col 9)-(line 123,col 60)",
        "(line 124,col 9)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.clone()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Returns an independent copy of the generator.  This is unnecessary, \r\n     * because instances are immutable anyway, but we retain this \r\n     * behaviour for backwards compatibility.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYSeriesLabelGenerator.equals(java.lang.Object)",
      "begin_line": 147,
      "end_line": 160,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 155,col 55)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    }
  ]
}