{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/AbstractPieItemLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractPieItemLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 247,
      "comment": "\r\n * A base class used for generating pie chart item labels.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "labelFormat"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The label format string. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormat"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " A number formatter for the value. "
    },
    {
      "type": "field",
      "varNames": [
        "percentFormat"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A number formatter for the percentage. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.AbstractPieItemLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 82,
      "end_line": 100,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param numberFormat  the format object for the values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param percentFormat  the format object for the percentages\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 41)",
        "(line 98,col 9)-(line 98,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getLabelFormat()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Returns the label format string.\r\n     *\r\n     * @return The label format string (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getNumberFormat()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\r\n     * Returns the number formatter.\r\n     *\r\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.getPercentFormat()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns the percent formatter.\r\n     *\r\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.createItemArray(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 145,
      "end_line": 166,
      "comment": "\r\n     * Creates the array of items that can be passed to the\r\n     * {@link MessageFormat} class for creating labels.  The returned array\r\n     * contains four values:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003eresult[0] \u003d the section key converted to a \u003ccode\u003eString\u003c/code\u003e;\u003c/li\u003e\r\n     * \u003cli\u003eresult[1] \u003d the formatted data value;\u003c/li\u003e\r\n     * \u003cli\u003eresult[2] \u003d the formatted percentage (of the total);\u003c/li\u003e\r\n     * \u003cli\u003eresult[3] \u003d the formatted total value.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The items (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 40)",
        "(line 147,col 9)-(line 147,col 74)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 45)",
        "(line 150,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 157,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 55)",
        "(line 164,col 9)-(line 164,col 52)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.generateSectionLabel(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\r\n     * Generates a label for a pie section.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 29)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.equals(java.lang.Object)",
      "begin_line": 192,
      "end_line": 213,
      "comment": "\r\n     * Tests the generator for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 201,col 54)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.hashCode()",
      "begin_line": 220,
      "end_line": 226,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 25)",
        "(line 222,col 9)-(line 222,col 66)",
        "(line 223,col 9)-(line 223,col 67)",
        "(line 224,col 9)-(line 224,col 68)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.AbstractPieItemLabelGenerator.clone()",
      "begin_line": 235,
      "end_line": 245,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 237,col 64)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 21)"
      ]
    }
  ]
}