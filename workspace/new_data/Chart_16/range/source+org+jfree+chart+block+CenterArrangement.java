{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/CenterArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CenterArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 330,
      "comment": "\r\n * Arranges a block in the center of its container.  This class is immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " For serialization. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.CenterArrangement.CenterArrangement()",
      "begin_line": 64,
      "end_line": 65,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\r\n     * Adds a block to be managed by this instance.  This method is usually \r\n     * called by the {@link BlockContainer}, you shouldn\u0027t need to call it \r\n     * directly.\r\n     * \r\n     * @param block  the block.\r\n     * @param key  a key that controls the position of the block.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 92,
      "end_line": 132,
      "comment": "\r\n     * Calculates and sets the bounds of all the items in the specified \r\n     * container, subject to the given constraint.  The \u003ccode\u003eGraphics2D\u003c/code\u003e\r\n     * can be used by some items (particularly items containing text) to \r\n     * calculate sizing parameters.\r\n     * \r\n     * @param container  the container whose items are being arranged.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the size constraint.\r\n     * \r\n     * @return The size of the container after arrangement of the contents.\r\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 69)",
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 144,
      "end_line": 155,
      "comment": "\r\n     * Arranges the blocks in the container with a fixed width and no height \r\n     * constraint.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 40)",
        "(line 149,col 9)-(line 149,col 59)",
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 152,col 40)",
        "(line 153,col 9)-(line 153,col 28)",
        "(line 154,col 9)-(line 154,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 167,
      "end_line": 179,
      "comment": "\r\n     * Arranges the blocks in the container with a fixed with and a range\r\n     * constraint on the height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 56)",
        "(line 171,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 191,
      "end_line": 196,
      "comment": "\r\n     * Arranges the blocks in the container with the overall height and width\r\n     * specified as fixed constraints.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 208,
      "end_line": 222,
      "comment": "\r\n     * Arranges the blocks with the overall width and height to fit within \r\n     * specified ranges.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 45)",
        "(line 214,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeRF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 234,
      "end_line": 246,
      "comment": "\r\n     * Arranges the blocks in the container with a range constraint on the\r\n     * width and a fixed height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 56)",
        "(line 238,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeRN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 258,
      "end_line": 271,
      "comment": "\r\n     * Arranges the block with a range constraint on the width, and no \r\n     * constraint on the height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 45)",
        "(line 263,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "\r\n     * Arranges the blocks without any constraints.  This puts all blocks\r\n     * into a single row.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 40)",
        "(line 285,col 9)-(line 285,col 59)",
        "(line 286,col 9)-(line 286,col 73)",
        "(line 287,col 9)-(line 287,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.arrangeNF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 300,
      "end_line": 304,
      "comment": "\r\n     * Arranges the blocks with no width constraint and a fixed height \r\n     * constraint.  This puts all blocks into a single row.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.clear()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * Clears any cached information.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.CenterArrangement.equals(java.lang.Object)",
      "begin_line": 320,
      "end_line": 328,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    }
  ]
}