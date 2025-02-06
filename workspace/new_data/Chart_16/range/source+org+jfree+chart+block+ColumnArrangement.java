{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/ColumnArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ColumnArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 379,
      "comment": "\r\n * Arranges blocks in a column layout.  This class is immutable.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalAlignment"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The horizontal alignment of blocks. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalAlignment"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The vertical alignment of blocks within each row. "
    },
    {
      "type": "field",
      "varNames": [
        "horizontalGap"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The horizontal gap between columns. "
    },
    {
      "type": "field",
      "varNames": [
        "verticalGap"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The vertical gap between items in a column. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.ColumnArrangement.ColumnArrangement()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.ColumnArrangement.ColumnArrangement(org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, double, double)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\r\n     * Creates a new instance.\r\n     * \r\n     * @param hAlign  the horizontal alignment (currently ignored).\r\n     * @param vAlign  the vertical alignment (currently ignored).\r\n     * @param hGap  the horizontal gap.\r\n     * @param vGap  the vertical gap.\r\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 34)",
        "(line 95,col 9)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\r\n     * Adds a block to be managed by this instance.  This method is usually \r\n     * called by the {@link BlockContainer}, you shouldn\u0027t need to call it \r\n     * directly.\r\n     * \r\n     * @param block  the block.\r\n     * @param key  a key that controls the position of the block.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 123,
      "end_line": 163,
      "comment": "\r\n     * Calculates and sets the bounds of all the items in the specified \r\n     * container, subject to the given constraint.  The \u003ccode\u003eGraphics2D\u003c/code\u003e\r\n     * can be used by some items (particularly items containing text) to \r\n     * calculate sizing parameters.\r\n     * \r\n     * @param container  the container whose items are being arranged.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the size constraint.\r\n     * \r\n     * @return The size of the container after arrangement of the contents.\r\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 69)",
        "(line 127,col 9)-(line 127,col 70)",
        "(line 128,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "\r\n     * Calculates and sets the bounds of all the items in the specified \r\n     * container, subject to the given constraint.  The \u003ccode\u003eGraphics2D\u003c/code\u003e\r\n     * can be used by some items (particularly items containing text) to \r\n     * calculate sizing parameters.\r\n     * \r\n     * @param container  the container whose items are being arranged.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the size constraint.\r\n     * \r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrangeNF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 195,
      "end_line": 248,
      "comment": "\r\n     * Calculates and sets the bounds of all the items in the specified \r\n     * container, subject to the given constraint.  The \u003ccode\u003eGraphics2D\u003c/code\u003e\r\n     * can be used by some items (particularly items containing text) to \r\n     * calculate sizing parameters.\r\n     * \r\n     * @param container  the container whose items are being arranged.\r\n     * @param constraint  the size constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 44)",
        "(line 200,col 9)-(line 200,col 47)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 23)",
        "(line 206,col 9)-(line 206,col 23)",
        "(line 207,col 9)-(line 207,col 30)",
        "(line 208,col 9)-(line 208,col 45)",
        "(line 209,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 250,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 45)",
        "(line 256,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrangeRF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 277,
      "end_line": 290,
      "comment": "\r\n     * Arranges the blocks in the container using a fixed height and a\r\n     * range for the width.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size of the container after arrangement.\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 56)",
        "(line 281,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 301,
      "end_line": 339,
      "comment": "\r\n     * Arranges the blocks without any constraints.  This puts all blocks\r\n     * into a single column.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 23)",
        "(line 303,col 9)-(line 303,col 28)",
        "(line 304,col 9)-(line 304,col 30)",
        "(line 305,col 9)-(line 305,col 44)",
        "(line 306,col 9)-(line 306,col 39)",
        "(line 307,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.clear()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\r\n     * Clears any cached information.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.ColumnArrangement.equals(java.lang.Object)",
      "begin_line": 355,
      "end_line": 376,
      "comment": "\r\n     * Tests this instance for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 57)",
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 20)"
      ]
    }
  ]
}