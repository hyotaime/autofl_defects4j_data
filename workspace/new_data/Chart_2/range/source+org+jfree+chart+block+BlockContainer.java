{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/block/BlockContainer.java",
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
      "end_line": 282,
      "comment": "\r\n * A container for a collection of {@link Block} objects.  The container uses\r\n * an {@link Arrangement} object to handle the position of each block.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "blocks"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The blocks within the container. "
    },
    {
      "type": "field",
      "varNames": [
        "arrangement"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The object responsible for laying out the blocks. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockContainer.BlockContainer()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\r\n     * Creates a new instance with default settings.\r\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BlockContainer.BlockContainer(org.jfree.chart.block.Arrangement)",
      "begin_line": 93,
      "end_line": 99,
      "comment": "\r\n     * Creates a new instance with the specified arrangement.\r\n     *\r\n     * @param arrangement  the arrangement manager (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 39)",
        "(line 98,col 9)-(line 98,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.getArrangement()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\r\n     * Returns the arrangement (layout) manager for the container.\r\n     *\r\n     * @return The arrangement manager (never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.setArrangement(org.jfree.chart.block.Arrangement)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\r\n     * Sets the arrangement (layout) manager.\r\n     *\r\n     * @param arrangement  the arrangement (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.isEmpty()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if there are no blocks in the container, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.getBlocks()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Returns an unmodifiable list of the {@link Block} objects managed by\r\n     * this arrangement.\r\n     *\r\n     * @return A list of blocks.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.add(org.jfree.chart.block.Block)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Adds a block to the container.\r\n     *\r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\r\n     * Adds a block to the container.\r\n     *\r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 31)",
        "(line 159,col 9)-(line 159,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.clear()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\r\n     * Clears all the blocks from the container.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Draws the container and all the blocks within it.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 203,
      "end_line": 240,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  passed on to blocks within the container\r\n     *                (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return An instance of {@link EntityBlockResult}, or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 37)",
        "(line 206,col 9)-(line 206,col 44)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 61)",
        "(line 214,col 9)-(line 214,col 46)",
        "(line 215,col 9)-(line 215,col 36)",
        "(line 216,col 9)-(line 216,col 46)",
        "(line 217,col 9)-(line 217,col 47)",
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 34)",
        "(line 235,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.equals(java.lang.Object)",
      "begin_line": 249,
      "end_line": 267,
      "comment": "\r\n     * Tests this container for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 51)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BlockContainer.clone()",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\r\n     * Returns a clone of the container.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 62)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    }
  ]
}