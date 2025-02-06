{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/block/Arrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Arrangement",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 86,
      "comment": "\r\n * An object that is responsible for arranging a collection of {@link Block}s\r\n * within a {@link BlockContainer}.\r\n "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Arrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\r\n     * Adds a block and a key which can be used to determine the position of\r\n     * the block in the arrangement.  This method is called by the container\r\n     * (you don\u0027t need to call this method directly) and gives the arrangement\r\n     * an opportunity to record the details if they are required.\r\n     *\r\n     * @param block  the block.\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Arrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\r\n     * Arranges the blocks within the specified container, subject to the given\r\n     * constraint.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.Arrangement.clear()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\r\n     * Clears any cached layout information retained by the arrangement.\r\n     ",
      "child_ranges": []
    }
  ]
}