{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/MultipleXYSeriesLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultipleXYSeriesLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.XYSeriesLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 241,
      "comment": "\r\n * A series label generator for plots that use data from\r\n * an {@link org.jfree.data.xy.XYDataset}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_FORMAT"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The default item label format. "
    },
    {
      "type": "field",
      "varNames": [
        "formatPattern"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The format pattern for the initial part of the label. "
    },
    {
      "type": "field",
      "varNames": [
        "additionalFormatPattern"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The format pattern for additional labels. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesLabelLists"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Storage for the additional series labels. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.MultipleXYSeriesLabelGenerator()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.MultipleXYSeriesLabelGenerator(java.lang.String)",
      "begin_line": 93,
      "end_line": 100,
      "comment": "\r\n     * Creates a new series label generator.\r\n     *\r\n     * @param format  the format pattern (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.addSeriesLabel(int, java.lang.String)",
      "begin_line": 108,
      "end_line": 116,
      "comment": "\r\n     * Adds an extra label for the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 42)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.clearSeriesLabels(int)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\r\n     * Clears the extra labels for the specified series.\r\n     *\r\n     * @param series  the series index.\r\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 42)",
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 137,
      "end_line": 156,
      "comment": "\r\n     * Generates a label for the specified series.  This label will be\r\n     * used for the chart legend.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     *\r\n     * @return A series label.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 48)",
        "(line 142,col 9)-(line 143,col 51)",
        "(line 144,col 9)-(line 144,col 42)",
        "(line 145,col 9)-(line 145,col 65)",
        "(line 146,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 40)",
        "(line 169,col 9)-(line 169,col 60)",
        "(line 170,col 9)-(line 170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.clone()",
      "begin_line": 180,
      "end_line": 197,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 182,col 65)",
        "(line 183,col 9)-(line 183,col 47)",
        "(line 184,col 9)-(line 184,col 50)",
        "(line 185,col 9)-(line 185,col 44)",
        "(line 186,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 226,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 214,col 55)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.hashCode()",
      "begin_line": 233,
      "end_line": 239,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 25)",
        "(line 235,col 9)-(line 235,col 68)",
        "(line 236,col 9)-(line 236,col 78)",
        "(line 237,col 9)-(line 237,col 71)",
        "(line 238,col 9)-(line 238,col 22)"
      ]
    }
  ]
}