{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/Block.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Block",
      "is_interface": true,
      "parent_types": [
        "org.jfree.chart.Drawable"
      ],
      "begin_line": 58,
      "end_line": 122,
      "comment": "\r\n * A block is an arbitrary item that can be drawn (in Java2D space) within a \r\n * rectangular area, has a preferred size, and can be arranged by an \r\n * {@link Arrangement} manager.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.getID()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\r\n     * Returns an ID for the block.\r\n     * \r\n     * @return An ID.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.setID(java.lang.String)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Sets the ID for the block.\r\n     * \r\n     * @param id  the ID.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.arrange(java.awt.Graphics2D)",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\r\n     * Arranges the contents of the block, with no constraints, and returns\r\n     * the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size of the block.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.getBounds()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\r\n     * Returns the current bounds of the block.\r\n     * \r\n     * @return The bounds.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.setBounds(java.awt.geom.Rectangle2D)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\r\n     * Sets the bounds of the block.\r\n     * \r\n     * @param bounds  the bounds.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Block.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\r\n     * Draws the block within the specified area.  Refer to the documentation \r\n     * for the implementing class for information about the \u003ccode\u003eparams\u003c/code\u003e\r\n     * and return value supported.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  optional parameters (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return An optional return value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    }
  ]
}