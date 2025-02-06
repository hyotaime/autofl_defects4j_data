{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/block/EmptyBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmptyBlock",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 129,
      "comment": "\r\n * An empty block with a fixed size.\r\n "
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
      "type": "constructor",
      "signature": "org.jfree.chart.block.EmptyBlock.EmptyBlock(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\r\n     * Creates a new block with the specified width and height.\r\n     *\r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 24)",
        "(line 73,col 9)-(line 73,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 87,col 51)",
        "(line 88,col 9)-(line 88,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Draws the block.  Since the block is empty, there is nothing to draw\r\n     * except the optional border.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\r\n     * Draws the block within the specified area.  Since the block is empty,\r\n     * there is nothing to draw except the optional border.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)",
        "(line 114,col 9)-(line 114,col 29)",
        "(line 115,col 9)-(line 115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.clone()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\r\n     * Returns a clone of the block.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)"
      ]
    }
  ]
}