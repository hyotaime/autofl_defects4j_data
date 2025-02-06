{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/axis/MarkerAxisBand.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MarkerAxisBand",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 275,
      "comment": "\r\n * A band that can be added to a number axis to display regions.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "axis"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The axis that the band belongs to. "
    },
    {
      "type": "field",
      "varNames": [
        "topOuterGap"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The top outer gap. "
    },
    {
      "type": "field",
      "varNames": [
        "topInnerGap"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The top inner gap. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomOuterGap"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The bottom outer gap. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomInnerGap"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The bottom inner gap. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "markers"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Storage for the markers. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.MarkerAxisBand(org.jfree.chart.axis.NumberAxis, double, double, double, double, java.awt.Font)",
      "begin_line": 107,
      "end_line": 118,
      "comment": "\r\n     * Constructs a new axis band.\r\n     *\r\n     * @param axis  the owner.\r\n     * @param topOuterGap  the top outer gap.\r\n     * @param topInnerGap  the top inner gap.\r\n     * @param bottomOuterGap  the bottom outer gap.\r\n     * @param bottomInnerGap  the bottom inner gap.\r\n     * @param font  the font.\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 39)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 45)",
        "(line 115,col 9)-(line 115,col 45)",
        "(line 116,col 9)-(line 116,col 25)",
        "(line 117,col 9)-(line 117,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.addMarker(org.jfree.chart.plot.IntervalMarker)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Adds a marker to the band.\r\n     *\r\n     * @param marker  the marker.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.getHeight(java.awt.Graphics2D)",
      "begin_line": 136,
      "end_line": 148,
      "comment": "\r\n     * Returns the height of the band.\r\n     *\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The height of the band.\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 28)",
        "(line 139,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.drawStringInRect(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.Font, java.lang.String)",
      "begin_line": 158,
      "end_line": 175,
      "comment": "\r\n     * A utility method that draws a string inside a rectangle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param bounds  the rectangle.\r\n     * @param font  the font.\r\n     * @param text  the text.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 25)",
        "(line 162,col 9)-(line 162,col 49)",
        "(line 163,col 9)-(line 163,col 66)",
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 10)",
        "(line 171,col 9)-(line 174,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, double, double)",
      "begin_line": 186,
      "end_line": 224,
      "comment": "\r\n     * Draws the band.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param dataArea  the data area.\r\n     * @param x  the x-coordinate.\r\n     * @param y  the y-coordinate.\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.equals(java.lang.Object)",
      "begin_line": 234,
      "end_line": 261,
      "comment": "\r\n     * Tests this axis for equality with another object.  Note that the axis\r\n     * that the band belongs to is ignored in the test.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 51)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.axis.MarkerAxisBand.hashCode()",
      "begin_line": 268,
      "end_line": 273,
      "comment": "\r\n     * Returns a hash code for the object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 24)",
        "(line 270,col 9)-(line 270,col 52)",
        "(line 271,col 9)-(line 271,col 55)",
        "(line 272,col 9)-(line 272,col 22)"
      ]
    }
  ]
}