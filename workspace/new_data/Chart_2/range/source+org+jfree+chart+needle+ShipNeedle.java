{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/needle/ShipNeedle.java",
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
      "begin_line": 59,
      "end_line": 136,
      "comment": "\r\n * A needle in the shape of a ship, for use with the\r\n * {@link org.jfree.chart.plot.CompassPlot} class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " For serialization. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 73,
      "end_line": 93,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 46)",
        "(line 77,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 80,col 35)",
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 80)",
        "(line 83,col 9)-(line 83,col 76)",
        "(line 84,col 9)-(line 84,col 40)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.equals(java.lang.Object)",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     *\r\n     * @param object  the object to test.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.hashCode()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ShipNeedle.clone()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eShipNeedle\u003c/code\u003e\r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    }
  ]
}