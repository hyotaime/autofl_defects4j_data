{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/MultipleXYSeriesLabelGenerator.java",
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
      "begin_line": 61,
      "end_line": 226,
      "comment": "\r\n * A series label generator for plots that use data from \r\n * an {@link org.jfree.data.xy.XYDataset}.\r\n "
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
      "comment": " The format pattern for the initial part of the label. "
    },
    {
      "type": "field",
      "varNames": [
        "additionalFormatPattern"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The format pattern for additional labels. "
    },
    {
      "type": "field",
      "varNames": [
        "seriesLabelLists"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the additional series labels. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.MultipleXYSeriesLabelGenerator()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\r\n     * Creates an item label generator using default number formatters.\r\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.MultipleXYSeriesLabelGenerator(java.lang.String)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\r\n     * Creates a new series label generator.\r\n     * \r\n     * @param format  the format pattern (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 36)",
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.addSeriesLabel(int, java.lang.String)",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\r\n     * Adds an extra label for the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     * @param label  the label.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 42)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.clearSeriesLabels(int)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\r\n     * Clears the extra labels for the specified series.\r\n     * \r\n     * @param series  the series index.\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 42)",
        "(line 123,col 9)-(line 123,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.generateLabel(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 135,
      "end_line": 154,
      "comment": "\r\n     * Generates a label for the specified series.  This label will be\r\n     * used for the chart legend.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series.\r\n     * \r\n     * @return A series label.\r\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 140,col 9)-(line 141,col 51)",
        "(line 142,col 9)-(line 142,col 42)",
        "(line 143,col 9)-(line 143,col 65)",
        "(line 144,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.createItemArray(org.jfree.data.xy.XYDataset, int)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param series  the series (zero-based index).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 40)",
        "(line 167,col 9)-(line 167,col 60)",
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.clone()",
      "begin_line": 178,
      "end_line": 195,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not supported.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 180,col 65)",
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 44)",
        "(line 184,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator.equals(java.lang.Object)",
      "begin_line": 204,
      "end_line": 224,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 212,col 55)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 20)"
      ]
    }
  ]
}