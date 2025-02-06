{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/block/ColorBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColorBlock",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block"
      ],
      "begin_line": 63,
      "end_line": 188,
      "comment": "\r\n * A block that is filled with a single color.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.ColorBlock.ColorBlock(java.awt.Paint, double, double)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "\r\n     * Creates a new block.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 27)",
        "(line 83,col 9)-(line 83,col 24)",
        "(line 84,col 9)-(line 84,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.getPaint()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Returns the paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\r\n     * Draws the block.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 29)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 23)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.equals(java.lang.Object)",
      "begin_line": 148,
      "end_line": 160,
      "comment": "\r\n     * Tests this block for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 43)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 171,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColorBlock.readObject(java.io.ObjectInputStream)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 35)",
        "(line 185,col 9)-(line 185,col 55)"
      ]
    }
  ]
}