{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/HighLowItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighLowItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.XYItemLabelGenerator",
        "org.jfree.chart.labels.XYToolTipGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 226,
      "comment": "\r\n * A standard item label generator for plots that use data from a \r\n * {@link OHLCDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatter"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatter"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The number formatter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.HighLowItemLabelGenerator()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Creates an item label generator using the default date and number \r\n     * formats.\r\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.HighLowItemLabelGenerator(java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 99,
      "end_line": 113,
      "comment": "\r\n     * Creates a tool tip generator using the supplied date formatter.\r\n     *\r\n     * @param dateFormatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param numberFormatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 124,
      "end_line": 163,
      "comment": "\r\n     * Generates a tooltip text item for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The tooltip text.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)",
        "(line 128,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Generates a label for the specified item. The label is typically a \r\n     * formatted version of the data value, but any text can be used.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param category  the category index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.clone()",
      "begin_line": 186,
      "end_line": 200,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 189,col 56)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 209,
      "end_line": 224,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 78)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 20)"
      ]
    }
  ]
}