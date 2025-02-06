{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/needle/ShipNeedle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShipNeedle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.needle.MeterNeedle",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 126,
      "comment": "\r\n * A needle in the shape of a ship, for use with the \r\n * {@link org.jfree.chart.plot.CompassPlot} class.\r\n "
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
      "signature": "org.jfree.chart.needle.ShipNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 72,
      "end_line": 92,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 46)",
        "(line 76,col 9)-(line 77,col 35)",
        "(line 78,col 9)-(line 79,col 35)",
        "(line 80,col 9)-(line 80,col 26)",
        "(line 81,col 9)-(line 81,col 80)",
        "(line 82,col 9)-(line 82,col 76)",
        "(line 83,col 9)-(line 83,col 40)",
        "(line 85,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.equals(java.lang.Object)",
      "begin_line": 101,
      "end_line": 112,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     * \r\n     * @param object  the object to test.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.clone()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eShipNeedle\u003c/code\u003e \r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 29)"
      ]
    }
  ]
}