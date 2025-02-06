{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/EmptyBlock.java",
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
      "begin_line": 55,
      "end_line": 108,
      "comment": "\r\n * An empty block with a fixed size.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.EmptyBlock.EmptyBlock(double, double)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\r\n     * Creates a new block with the specified width and height.\r\n     * \r\n     * @param width  the width.\r\n     * @param height  the height.\r\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 24)",
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Draws the block.  Since the block is empty, this method does nothing.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Draws the block within the specified area.  Since the block is empty, \r\n     * this method does nothing.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.EmptyBlock.clone()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\r\n     * Returns a clone of the block.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)"
      ]
    }
  ]
}