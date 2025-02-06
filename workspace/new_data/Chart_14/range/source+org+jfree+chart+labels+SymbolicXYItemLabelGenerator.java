{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/SymbolicXYItemLabelGenerator.java",
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
      "begin_line": 66,
      "end_line": 176,
      "comment": "\r\n * A standard item label generator for plots that use data from an \r\n * {@link XYDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " For serialization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 81,
      "end_line": 105,
      "comment": "\r\n     * Generates a tool tip text item for a particular item within a series.\r\n     *\r\n     * @param data  the dataset.\r\n     * @param series  the series number (zero-based index).\r\n     * @param item  the item number (zero-based index).\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 26)",
        "(line 84,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Generates a label for the specified item. The label is typically a \r\n     * formatted version of the data value, but any text can be used.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param category  the category index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.round(double, int)",
      "begin_line": 129,
      "end_line": 136,
      "comment": "\r\n    * Round a double value.\r\n    *\r\n    * @param value  the value.\r\n    * @param nb  the exponent.\r\n    *\r\n    * @return The rounded value.\r\n    ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 135,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.clone()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 164,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.SymbolicXYItemLabelGenerator.hashCode()",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 25)",
        "(line 173,col 9)-(line 173,col 22)"
      ]
    }
  ]
}