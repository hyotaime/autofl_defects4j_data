{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/GridArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GridArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 290,
      "comment": "\r\n * Arranges blocks in a grid within their container.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The rows. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The columns. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.GridArrangement.GridArrangement(int, int)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\r\n     * Creates a new grid arrangement.\r\n     * \r\n     * @param rows  the row count.\r\n     * @param columns  the column count.\r\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\r\n     * Adds a block and a key which can be used to determine the position of \r\n     * the block in the arrangement.  This method is called by the container \r\n     * (you don\u0027t need to call this method directly) and gives the arrangement\r\n     * an opportunity to record the details if they are required.\r\n     * \r\n     * @param block  the block.\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 100,
      "end_line": 145,
      "comment": "\r\n     * Arranges the blocks within the specified container, subject to the given\r\n     * constraint.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 69)",
        "(line 103,col 9)-(line 103,col 70)",
        "(line 104,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 155,
      "end_line": 170,
      "comment": "\r\n     * Arranges the container with no constraint on the width or height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 26)",
        "(line 157,col 9)-(line 157,col 26)",
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 43)",
        "(line 167,col 9)-(line 167,col 41)",
        "(line 168,col 9)-(line 168,col 71)",
        "(line 169,col 9)-(line 169,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 181,
      "end_line": 199,
      "comment": "\r\n     * Arranges the container with a fixed overall width and height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 61)",
        "(line 184,col 9)-(line 184,col 59)",
        "(line 185,col 9)-(line 185,col 44)",
        "(line 186,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 210,
      "end_line": 224,
      "comment": "\r\n     * Arrange with a fixed width and a height within a given range.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 68)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 216,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 235,
      "end_line": 257,
      "comment": "\r\n     * Arrange with a fixed width and a height within a given range.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 61)",
        "(line 239,col 9)-(line 239,col 73)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 26)",
        "(line 242,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 10)",
        "(line 256,col 9)-(line 256,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.clear()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Clears any cached layout information retained by the arrangement.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.equals(java.lang.Object)",
      "begin_line": 273,
      "end_line": 288,
      "comment": "\r\n     * Compares this layout manager for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object.\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 53)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 20)"
      ]
    }
  ]
}