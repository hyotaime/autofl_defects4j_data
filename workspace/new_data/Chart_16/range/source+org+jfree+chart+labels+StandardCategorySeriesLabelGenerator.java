{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/StandardCategorySeriesLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardCategorySeriesLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.CategorySeriesLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 153,
      "comment": "\r\n * A standard series label generator for plots that use data from \r\n * a {@link org.jfree.data.category.CategoryDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FORMAT"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The format pattern. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.StandardCategorySeriesLabelGenerator()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\r\n     * Creates a default series label generator (uses \r\n     * {@link #DEFAULT_LABEL_FORMAT}).\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.StandardCategorySeriesLabelGenerator(java.lang.String)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\r\n     * Creates a new series label generator.\r\n     * \r\n     * @param format  the format pattern (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.generateLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\r\n     * Generates a label for the specified series.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     * \r\n     * @return A series label.\r\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 101,col 50)",
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.clone()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 151,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 146,col 61)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 20)"
      ]
    }
  ]
}