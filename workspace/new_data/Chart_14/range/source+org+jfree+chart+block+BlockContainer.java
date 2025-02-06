{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/BlockContainer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BlockContainer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 284,
      "comment": "\r\n * A container for a collection of {@link Block} objects.  The container uses \r\n * an {@link Arrangement} object to handle the position of each block.\r\n "
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
        "blocks"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The blocks within the container. "
    },
    {
      "type": "field",
      "varNames": [
        "arrangement"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The object responsible for laying out the blocks. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockContainer.BlockContainer()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\r\n     * Creates a new instance with default settings.\r\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockContainer.BlockContainer(org.jfree.chart.block.Arrangement)",
      "begin_line": 95,
      "end_line": 101,
      "comment": "\r\n     * Creates a new instance with the specified arrangement.\r\n     * \r\n     * @param arrangement  the arrangement manager (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                     permitted).\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.getArrangement()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\r\n     * Returns the arrangement (layout) manager for the container.\r\n     * \r\n     * @return The arrangement manager (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.setArrangement(org.jfree.chart.block.Arrangement)",
      "begin_line": 117,
      "end_line": 122,
      "comment": "\r\n     * Sets the arrangement (layout) manager.\r\n     * \r\n     * @param arrangement  the arrangement (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.isEmpty()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if there are no blocks in the container, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.getBlocks()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\r\n     * Returns an unmodifiable list of the {@link Block} objects managed by \r\n     * this arrangement.\r\n     * \r\n     * @return A list of blocks.\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.add(org.jfree.chart.block.Block)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Adds a block to the container.\r\n     * \r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\r\n     * Adds a block to the container.\r\n     * \r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 31)",
        "(line 161,col 9)-(line 161,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.clear()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\r\n     * Clears all the blocks from the container.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 28)",
        "(line 169,col 9)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\r\n     * Draws the container and all the blocks within it.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 205,
      "end_line": 242,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  passed on to blocks within the container \r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return An instance of {@link EntityBlockResult}, or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 37)",
        "(line 208,col 9)-(line 208,col 44)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 216,col 46)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 218,col 46)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 220,col 51)",
        "(line 221,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 34)",
        "(line 237,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.equals(java.lang.Object)",
      "begin_line": 251,
      "end_line": 269,
      "comment": "\r\n     * Tests this container for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 51)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.clone()",
      "begin_line": 278,
      "end_line": 282,
      "comment": "\r\n     * Returns a clone of the container.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 62)",
        "(line 281,col 9)-(line 281,col 21)"
      ]
    }
  ]
}