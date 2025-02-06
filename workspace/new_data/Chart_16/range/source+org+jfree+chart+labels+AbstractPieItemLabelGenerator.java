{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/labels/AbstractPieItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPieItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 233,
      "comment": "\r\n * A base class used for generating pie chart item labels.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFormat"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The label format string. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormat"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " A number formatter for the value. "
    },
    {
      "type": "field",
      "varNames": [
        "percentFormat"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " A number formatter for the percentage. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.AbstractPieItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 80,
      "end_line": 99,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param numberFormat  the format object for the values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param percentFormat  the format object for the percentages\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 39)",
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getLabelFormat()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the label format string.\r\n     * \r\n     * @return The label format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getNumberFormat()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\r\n     * Returns the number formatter.\r\n     *\r\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getPercentFormat()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Returns the percent formatter.\r\n     *\r\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.createItemArray(org.jfree.data.general.PieDataset, java.lang.Comparable)",
      "begin_line": 144,
      "end_line": 165,
      "comment": "\r\n     * Creates the array of items that can be passed to the \r\n     * {@link MessageFormat} class for creating labels.  The returned array\r\n     * contains four values:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eresult[0] \u003d the section key converted to a \u003ccode\u003eString\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eresult[1] \u003d the formatted data value;\u003c/li\u003e\r\n     * \u003cli\u003eresult[2] \u003d the formatted percentage (of the total);\u003c/li\u003e\r\n     * \u003cli\u003eresult[3] \u003d the formatted total value.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 40)",
        "(line 146,col 9)-(line 146,col 74)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 45)",
        "(line 149,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 52)",
        "(line 164,col 9)-(line 164,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.generateSectionLabel(org.jfree.data.general.PieDataset, java.lang.Comparable)",
      "begin_line": 175,
      "end_line": 182,
      "comment": "\r\n     * Generates a label for a pie section.\r\n     * \r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 29)",
        "(line 177,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 191,
      "end_line": 212,
      "comment": "\r\n     * Tests the generator for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 200,col 50)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.clone()",
      "begin_line": 221,
      "end_line": 231,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 223,col 60)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 21)"
      ]
    }
  ]
}