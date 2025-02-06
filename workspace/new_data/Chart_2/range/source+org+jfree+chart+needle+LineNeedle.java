{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/needle/LineNeedle.java",
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
      "begin_line": 58,
      "end_line": 130,
      "comment": "\r\n * A needle that is represented by a line.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 72,
      "end_line": 90,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 43)",
        "(line 77,col 9)-(line 77,col 66)",
        "(line 78,col 9)-(line 78,col 68)",
        "(line 80,col 9)-(line 80,col 24)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 88,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.equals(java.lang.Object)",
      "begin_line": 99,
      "end_line": 107,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.hashCode()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.LineNeedle.clone()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eLineNeedle\u003c/code\u003e\r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)"
      ]
    }
  ]
}