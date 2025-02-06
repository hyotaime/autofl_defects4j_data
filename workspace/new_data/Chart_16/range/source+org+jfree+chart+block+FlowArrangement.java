{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/FlowArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FlowArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 448,
      "comment": "\r\n * Arranges blocks in a flow layout.  This class is immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalAlignment"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The horizontal alignment of blocks. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalAlignment"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The vertical alignment of blocks within each row. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalGap"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The horizontal gap between items within rows. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalGap"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The vertical gap between rows. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.FlowArrangement.FlowArrangement()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 77)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.FlowArrangement.FlowArrangement(org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, double, double)",
      "begin_line": 91,
      "end_line": 97,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param hAlign  the horizontal alignment (currently ignored).\r\n     * @param vAlign  the vertical alignment (currently ignored).\r\n     * @param hGap  the horizontal gap.\r\n     * @param vGap  the vertical gap.\r\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 42)",
        "(line 94,col 9)-(line 94,col 40)",
        "(line 95,col 9)-(line 95,col 34)",
        "(line 96,col 9)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\r\n     * Adds a block to be managed by this instance.  This method is usually \r\n     * called by the {@link BlockContainer}, you shouldn\u0027t need to call it \r\n     * directly.\r\n     * \r\n     * @param block  the block.\r\n     * @param key  a key that controls the position of the block.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 124,
      "end_line": 164,
      "comment": "\r\n     * Calculates and sets the bounds of all the items in the specified \r\n     * container, subject to the given constraint.  The \u003ccode\u003eGraphics2D\u003c/code\u003e\r\n     * can be used by some items (particularly items containing text) to \r\n     * calculate sizing parameters.\r\n     * \r\n     * @param container  the container whose items are being arranged.\r\n     * @param constraint  the size constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size of the container after arrangement of the contents.\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 69)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 176,
      "end_line": 225,
      "comment": "\r\n     * Arranges the blocks in the container with a fixed width and no height \r\n     * constraint.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 44)",
        "(line 180,col 9)-(line 180,col 45)",
        "(line 182,col 9)-(line 182,col 23)",
        "(line 183,col 9)-(line 183,col 23)",
        "(line 184,col 9)-(line 184,col 31)",
        "(line 185,col 9)-(line 185,col 42)",
        "(line 186,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 237,
      "end_line": 250,
      "comment": "\r\n     * Arranges the blocks in the container with a fixed width and a range\r\n     * constraint on the height.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\r\n     * Arranges the blocks in the container with the overall height and width\r\n     * specified as fixed constraints.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 279,
      "end_line": 294,
      "comment": "\r\n     * Arranges the blocks with the overall width and height to fit within \r\n     * specified ranges.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 45)",
        "(line 285,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeRF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 306,
      "end_line": 319,
      "comment": "\r\n     * Arranges the blocks in the container with a range constraint on the\r\n     * width and a fixed height.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 56)",
        "(line 310,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeRN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 331,
      "end_line": 345,
      "comment": "\r\n     * Arranges the block with a range constraint on the width, and no \r\n     * constraint on the height.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 45)",
        "(line 336,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 356,
      "end_line": 393,
      "comment": "\r\n     * Arranges the blocks without any constraints.  This puts all blocks\r\n     * into a single row.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 23)",
        "(line 358,col 9)-(line 358,col 27)",
        "(line 359,col 9)-(line 359,col 31)",
        "(line 360,col 9)-(line 360,col 44)",
        "(line 361,col 9)-(line 361,col 39)",
        "(line 362,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.arrangeNF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 405,
      "end_line": 409,
      "comment": "\r\n     * Arranges the blocks with no width constraint and a fixed height \r\n     * constraint.  This puts all blocks into a single row.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.clear()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "\r\n     * Clears any cached information.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.FlowArrangement.equals(java.lang.Object)",
      "begin_line": 425,
      "end_line": 446,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 53)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 20)"
      ]
    }
  ]
}