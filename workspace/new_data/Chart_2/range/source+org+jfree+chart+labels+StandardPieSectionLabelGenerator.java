{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/StandardPieSectionLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardPieSectionLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
        "org.jfree.chart.labels.PieSectionLabelGenerator",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 250,
      "comment": "\r\n * A standard item label generator for plots that use data from a\r\n * {@link PieDataset}.\r\n * \u003cp\u003e\r\n * For the label format, use {0} where the pie section key should be inserted,\r\n * {1} for the absolute section value and {2} for the percent amount of the pie\r\n * section, e.g. \u003ccode\u003e\"{0} \u003d {1} ({2})\"\u003c/code\u003e will display as\r\n * \u003ccode\u003eapple \u003d 120 (5%)\u003c/code\u003e.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SECTION_LABEL_FORMAT"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The default section label format. "
    },
    {
      "type": "field",
      "varNames": [
        "attributedLabels"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\r\n     * An optional list of attributed labels (instances of AttributedString).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.StandardPieSectionLabelGenerator()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\r\n     * Creates a new section label generator using\r\n     * {@link #DEFAULT_SECTION_LABEL_FORMAT} as the label format string, and\r\n     * platform default number and percentage formatters.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.StandardPieSectionLabelGenerator(java.util.Locale)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Creates a new instance for the specified locale.\r\n     *\r\n     * @param locale  the local (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.StandardPieSectionLabelGenerator(java.lang.String)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\r\n     * Creates a new section label generator using the specified label format\r\n     * string, and platform default number and percentage formatters.\r\n     *\r\n     * @param labelFormat  the label format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 116,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.StandardPieSectionLabelGenerator(java.lang.String, java.util.Locale)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\r\n     * Creates a new instance for the specified locale.\r\n     *\r\n     * @param labelFormat  the label format (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the local (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 129,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.StandardPieSectionLabelGenerator(java.lang.String, java.text.NumberFormat, java.text.NumberFormat)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\r\n     * Creates an item label generator using the specified number formatters.\r\n     *\r\n     * @param labelFormat  the label format string (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     * @param numberFormat  the format object for the values (\u003ccode\u003enull\u003c/code\u003e\r\n     *                      not permitted).\r\n     * @param percentFormat  the format object for the percentages\r\n     *                       (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 56)",
        "(line 145,col 9)-(line 145,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.getAttributedLabel(int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\r\n     * Returns the attributed label for a section, or \u003ccode\u003enull\u003c/code\u003e if none\r\n     * is defined.\r\n     *\r\n     * @param section  the section index.\r\n     *\r\n     * @return The attributed label.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.setAttributedLabel(int, java.text.AttributedString)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Sets the attributed label for a section.\r\n     *\r\n     * @param section  the section index.\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.generateSectionLabel(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\r\n     * Generates a label for a pie section.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.generateAttributedSectionLabel(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\r\n     * Generates an attributed label for the specified series, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if no attributed label is available (in which case,\r\n     * the string returned by\r\n     * {@link #generateSectionLabel(PieDataset, Comparable)} will\r\n     * provide the fallback).  Only certain attributes are recognised by the\r\n     * code that ultimately displays the labels:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e{@link TextAttribute#FONT}: will set the font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#POSTURE}: a value of\r\n     *     {@link TextAttribute#POSTURE_OBLIQUE} will add {@link Font#ITALIC} to\r\n     *     the current font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#WEIGHT}: a value of\r\n     *     {@link TextAttribute#WEIGHT_BOLD} will add {@link Font#BOLD} to the\r\n     *     current font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#FOREGROUND}: this will set the {@link Paint}\r\n     *     for the current\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#SUPERSCRIPT}: the values\r\n     *     {@link TextAttribute#SUPERSCRIPT_SUB} and\r\n     *     {@link TextAttribute#SUPERSCRIPT_SUPER} are recognised.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key.\r\n     *\r\n     * @return An attributed label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.equals(java.lang.Object)",
      "begin_line": 221,
      "end_line": 237,
      "comment": "\r\n     * Tests the generator for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 229,col 57)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardPieSectionLabelGenerator.clone()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Returns an independent copy of the generator.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  should not happen.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 29)"
      ]
    }
  ]
}