{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/PieSectionLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PieSectionLabelGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 109,
      "comment": "\r\n * Interface for a label generator for plots that use data from\r\n * a {@link PieDataset}.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.PieSectionLabelGenerator.generateSectionLabel(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\r\n     * Generates a label for a pie section.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the section key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.PieSectionLabelGenerator.generateAttributedSectionLabel(org.jfree.data.pie.PieDataset, java.lang.Comparable)",
      "begin_line": 106,
      "end_line": 107,
      "comment": "\r\n     * Generates an attributed label for the specified series, or\r\n     * \u003ccode\u003enull\u003c/code\u003e if no attributed label is available (in which case,\r\n     * the string returned by\r\n     * {@link #generateSectionLabel(PieDataset, Comparable)} will\r\n     * provide the fallback).  Only certain attributes are recognised by the\r\n     * code that ultimately displays the labels:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e{@link TextAttribute#FONT}: will set the font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#POSTURE}: a value of\r\n     *     {@link TextAttribute#POSTURE_OBLIQUE} will add {@link Font#ITALIC} to\r\n     *     the current font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#WEIGHT}: a value of\r\n     *     {@link TextAttribute#WEIGHT_BOLD} will add {@link Font#BOLD} to the\r\n     *     current font;\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#FOREGROUND}: this will set the {@link Paint}\r\n     *     for the current\u003c/li\u003e\r\n     * \u003cli\u003e{@link TextAttribute#SUPERSCRIPT}: the values\r\n     *     {@link TextAttribute#SUPERSCRIPT_SUB} and\r\n     *     {@link TextAttribute#SUPERSCRIPT_SUPER} are recognised.\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param key  the key.\r\n     *\r\n     * @return An attributed label (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}