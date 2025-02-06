{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/labels/StandardCrosshairLabelGenerator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardCrosshairLabelGenerator",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.labels.CrosshairLabelGenerator",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 158,
      "comment": "\n * A default label generator.\n *\n * @since 1.0.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "labelTemplate"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The label format string. "
    },
    {
      "type": "field",
      "varNames": [
        "numberFormat"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A number formatter for the value. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.StandardCrosshairLabelGenerator()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Creates a new instance with default attributes.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.StandardCrosshairLabelGenerator(java.lang.String, java.text.NumberFormat)",
      "begin_line": 77,
      "end_line": 90,
      "comment": "\n     * Creates a new instance with the specified attributes.\n     *\n     * @param labelTemplate  the label template (\u003ccode\u003enull\u003c/code\u003e not\n     *     permitted).\n     * @param numberFormat  the number formatter (\u003ccode\u003enull\u003c/code\u003e not\n     *     permitted).\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 43)",
        "(line 89,col 9)-(line 89,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.getLabelTemplate()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns the label template string.\n     *\n     * @return The label template string (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.getNumberFormat()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns the number formatter.\n     *\n     * @return The formatter (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.generateLabel(org.jfree.chart.plot.Crosshair)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\n     * Returns a string that can be used as the label for a crosshair.\n     *\n     * @param crosshair  the crosshair (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The label (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 119,col 39)",
        "(line 120,col 9)-(line 120,col 68)",
        "(line 121,col 9)-(line 121,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.equals(java.lang.Object)",
      "begin_line": 131,
      "end_line": 147,
      "comment": "\n     * Tests this generator for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 139,col 56)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.labels.StandardCrosshairLabelGenerator.hashCode()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return A hash code for this instance.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 45)"
      ]
    }
  ]
}