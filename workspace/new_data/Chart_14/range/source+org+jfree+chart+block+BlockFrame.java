{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/BlockFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockFrame",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 74,
      "comment": "\r\n * A block frame is a type of border that can be drawn around the outside of \r\n * any {@link AbstractBlock}.  Classes that implement this interface should\r\n * implement {@link PublicCloneable} OR be immutable.\r\n * \r\n * @since 1.0.5\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockFrame.getInsets()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\r\n     * Returns the space reserved for the border.\r\n     * \r\n     * @return The space (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockFrame.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\r\n     * Draws the border by filling in the reserved space (in black).\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": []
    }
  ]
}