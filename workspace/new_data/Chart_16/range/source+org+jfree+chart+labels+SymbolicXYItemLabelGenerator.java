{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/SymbolicXYItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SymbolicXYItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "org.jfree.chart.labels.XYToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 65,
      "end_line": 168,
      "comment": "\r\n * A standard item label generator for plots that use data from an \r\n * {@link XYDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " For serialization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 83,
      "end_line": 107,
      "comment": "\r\n     * Generates a tool tip text item for a particular item within a series.\r\n     *\r\n     * @param data  the dataset.\r\n     * @param series  the series number (zero-based index).\r\n     * @param item  the item number (zero-based index).\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)",
        "(line 86,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Generates a label for the specified item. The label is typically a \r\n     * formatted version of the data value, but any text can be used.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param category  the category index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.round(double, int)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "\r\n    * Round a double value.\r\n    *\r\n    * @param value  the value.\r\n    * @param nb  the exponent.\r\n    *\r\n    * @return The rounded value.\r\n    ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 36)",
        "(line 136,col 9)-(line 136,col 54)",
        "(line 137,col 9)-(line 137,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.clone()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 21)"
      ]
    }
  ]
}