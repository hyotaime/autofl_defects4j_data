{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/needle/ArrowNeedle.java",
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
      "begin_line": 57,
      "end_line": 166,
      "comment": "\r\n * A needle in the shape of an arrow.\r\n "
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
        "isArrowAtTop"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \r\n     * A flag controlling whether or not there is an arrow at the top of the \r\n     * needle. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.ArrowNeedle.ArrowNeedle(boolean)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\r\n     * Constructs a new arrow needle.\r\n     *\r\n     * @param isArrowAtTop  a flag that controls whether or not there is an \r\n     *                      arrow at the top of the needle.\r\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 87,
      "end_line": 128,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 93,col 9)-(line 93,col 76)",
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 48)",
        "(line 96,col 9)-(line 96,col 40)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 43)",
        "(line 108,col 9)-(line 108,col 43)",
        "(line 109,col 9)-(line 109,col 27)",
        "(line 111,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 30)",
        "(line 120,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.equals(java.lang.Object)",
      "begin_line": 137,
      "end_line": 152,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     * \r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 45)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.ArrowNeedle.clone()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\r\n     * Returns a clone of this needle.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if the \u003ccode\u003eArrowNeedle\u003c/code\u003e \r\n     *     cannot be cloned (in theory, this should not happen).\r\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 29)"
      ]
    }
  ]
}