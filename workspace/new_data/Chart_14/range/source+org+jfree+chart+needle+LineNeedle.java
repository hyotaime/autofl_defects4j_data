{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/needle/LineNeedle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineNeedle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.needle.MeterNeedle",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 123,
      "comment": "\r\n * A needle that is represented by a line.\r\n "
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
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 71,
      "end_line": 89,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)",
        "(line 76,col 9)-(line 76,col 66)",
        "(line 77,col 9)-(line 77,col 68)",
        "(line 79,col 9)-(line 79,col 24)",
        "(line 81,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.equals(java.lang.Object)",
      "begin_line": 98,
      "end_line": 109,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     * \r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.clone()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eLineNeedle\u003c/code\u003e \r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    }
  ]
}