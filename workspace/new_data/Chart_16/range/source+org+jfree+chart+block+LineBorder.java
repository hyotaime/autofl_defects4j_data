{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/LineBorder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LineBorder",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.BlockFrame",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 233,
      "comment": "\r\n * A line border for any {@link AbstractBlock}. \r\n * \r\n * @since 1.0.5\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The line color. "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "insets"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The insets. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LineBorder.LineBorder()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\r\n     * Creates a default border.\r\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 83,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LineBorder.LineBorder(java.awt.Paint, java.awt.Stroke, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 93,
      "end_line": 106,
      "comment": "\r\n     * Creates a new border with the specified color.\r\n     * \r\n     * @param paint  the color (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the border stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param insets  the insets (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 27)",
        "(line 104,col 9)-(line 104,col 29)",
        "(line 105,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.getPaint()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\r\n     * Returns the paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.getInsets()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\r\n     * Returns the insets.\r\n     * \r\n     * @return The insets (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.getStroke()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\r\n     * Returns the stroke.\r\n     * \r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 141,
      "end_line": 177,
      "comment": "\r\n     * Draws the border by filling in the reserved space (in black).\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 35)",
        "(line 143,col 9)-(line 143,col 36)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 52)",
        "(line 149,col 9)-(line 149,col 55)",
        "(line 150,col 9)-(line 150,col 53)",
        "(line 151,col 9)-(line 151,col 54)",
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 32)",
        "(line 155,col 9)-(line 155,col 36)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 157,col 32)",
        "(line 158,col 9)-(line 158,col 32)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 160,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.equals(java.lang.Object)",
      "begin_line": 186,
      "end_line": 204,
      "comment": "\r\n     * Tests this border for equality with an arbitrary instance.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 43)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 36)",
        "(line 215,col 9)-(line 215,col 55)",
        "(line 216,col 9)-(line 216,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LineBorder.readObject(java.io.ObjectInputStream)",
      "begin_line": 227,
      "end_line": 232,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 35)",
        "(line 230,col 9)-(line 230,col 55)",
        "(line 231,col 9)-(line 231,col 57)"
      ]
    }
  ]
}