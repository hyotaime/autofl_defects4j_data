{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/ColorBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColorBlock",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block"
      ],
      "begin_line": 60,
      "end_line": 165,
      "comment": "\r\n * A block that is filled with a single color.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.ColorBlock.ColorBlock(java.awt.Paint, double, double)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\r\n     * Creates a new block.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 77,col 9)-(line 77,col 24)",
        "(line 78,col 9)-(line 78,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.getPaint()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Returns the paint.\r\n     * \r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\r\n     * Draws the block.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 23)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.equals(java.lang.Object)",
      "begin_line": 125,
      "end_line": 137,
      "comment": "\r\n     * Tests this block for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.readObject(java.io.ObjectInputStream)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 35)",
        "(line 162,col 9)-(line 162,col 55)"
      ]
    }
  ]
}