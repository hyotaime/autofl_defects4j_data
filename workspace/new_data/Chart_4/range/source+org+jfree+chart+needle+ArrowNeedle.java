{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/needle/ArrowNeedle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArrowNeedle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.needle.MeterNeedle",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 181,
      "comment": "\r\n * A needle in the shape of an arrow.\r\n "
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
        "isArrowAtTop"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\r\n     * A flag controlling whether or not there is an arrow at the top of the\r\n     * needle.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.ArrowNeedle.ArrowNeedle(boolean)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Constructs a new arrow needle.\r\n     *\r\n     * @param isArrowAtTop  a flag that controls whether or not there is an\r\n     *                      arrow at the top of the needle.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 91,
      "end_line": 132,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 95,col 23)",
        "(line 97,col 9)-(line 97,col 76)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 100,col 9)-(line 100,col 40)",
        "(line 102,col 9)-(line 102,col 47)",
        "(line 103,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 27)",
        "(line 115,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 30)",
        "(line 124,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.equals(java.lang.Object)",
      "begin_line": 141,
      "end_line": 156,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 45)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.hashCode()",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 38)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 166,col 9)-(line 166,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.clone()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eArrowNeedle\u003c/code\u003e\r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 29)"
      ]
    }
  ]
}