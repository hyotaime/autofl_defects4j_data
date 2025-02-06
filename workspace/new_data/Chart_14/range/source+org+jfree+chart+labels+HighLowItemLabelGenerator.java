{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/labels/HighLowItemLabelGenerator.java",
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
      "begin_line": 70,
      "end_line": 235,
      "comment": "\r\n * A standard item label generator for plots that use data from a \r\n * {@link OHLCDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "dateFormatter"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The date formatter. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormatter"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The number formatter. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.HighLowItemLabelGenerator()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Creates an item label generator using the default date and number \r\n     * formats.\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.HighLowItemLabelGenerator(java.text.DateFormat, java.text.NumberFormat)",
      "begin_line": 98,
      "end_line": 110,
      "comment": "\r\n     * Creates a tool tip generator using the supplied date formatter.\r\n     *\r\n     * @param dateFormatter  the date formatter (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                       permitted).\r\n     * @param numberFormatter  the number formatter (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 43)",
        "(line 109,col 9)-(line 109,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.generateToolTip(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 121,
      "end_line": 160,
      "comment": "\r\n     * Generates a tooltip text item for a particular item within a series.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param series  the series (zero-based index).\r\n     * @param item  the item (zero-based index).\r\n     *\r\n     * @return The tooltip text.\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 29)",
        "(line 125,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int, int)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Generates a label for the specified item. The label is typically a \r\n     * formatted version of the data value, but any text can be used.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series index (zero-based).\r\n     * @param category  the category index (zero-based).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.clone()",
      "begin_line": 183,
      "end_line": 197,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 186,col 56)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 221,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param obj  the other object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 78)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.HighLowItemLabelGenerator.hashCode()",
      "begin_line": 228,
      "end_line": 233,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 68)",
        "(line 231,col 9)-(line 231,col 70)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    }
  ]
}