{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/StandardCategorySeriesLabelGenerator.java",
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
      "begin_line": 58,
      "end_line": 166,
      "comment": "\r\n * A standard series label generator for plots that use data from \r\n * a {@link org.jfree.data.category.CategoryDataset}.\r\n "
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
        "DEFAULT_LABEL_FORMAT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The format pattern. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.StandardCategorySeriesLabelGenerator()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\r\n     * Creates a default series label generator (uses \r\n     * {@link #DEFAULT_LABEL_FORMAT}).\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.StandardCategorySeriesLabelGenerator(java.lang.String)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\r\n     * Creates a new series label generator.\r\n     * \r\n     * @param format  the format pattern (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.generateLabel(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 98,
      "end_line": 105,
      "comment": "\r\n     * Generates a label for the specified series.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     * \r\n     * @return A series label.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 103,col 50)",
        "(line 104,col 9)-(line 104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.createItemArray(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 40)",
        "(line 118,col 9)-(line 118,col 57)",
        "(line 119,col 9)-(line 119,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.clone()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.equals(java.lang.Object)",
      "begin_line": 140,
      "end_line": 153,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 148,col 61)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.hashCode()",
      "begin_line": 160,
      "end_line": 164,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 25)",
        "(line 162,col 9)-(line 162,col 68)",
        "(line 163,col 9)-(line 163,col 22)"
      ]
    }
  ]
}