{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/StandardXYItemLabelGenerator.java",
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
      "begin_line": 74,
      "end_line": 204,
      "comment": "\r\n * A standard item label generator for plots that use data from an \r\n * {@link org.jfree.data.xy.XYDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ITEM_LABEL_FORMAT"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The default item label format. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\r\n     * Creates an item label generator using the specified formatters.\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.DateFormat)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\r\n     * Creates an item label generator using the specified formatters (a \r\n     * number formatter for the x-values and a date formatter for the \r\n     * y-values).\r\n     *\r\n     * @param formatString  the item label format string (\u003ccode\u003enull\u003c/code\u003e \r\n     *                      not permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     *                 \r\n     * @since 1.0.4\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.StandardXYItemLabelGenerator(java.lang.String, java.text.DateFormat, java.text.DateFormat)",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\r\n     * Creates a label generator using the specified date formatters.\r\n     *\r\n     * @param formatString  the label format string (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                      permitted).\r\n     * @param xFormat  the format object for the x values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     * @param yFormat  the format object for the y values (\u003ccode\u003enull\u003c/code\u003e \r\n     *                 not permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Generates the item label text for an item in a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param item  the item index (zero-based).\r\n     *\r\n     * @return The label text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.clone()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 194,
      "end_line": 202,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 33)"
      ]
    }
  ]
}