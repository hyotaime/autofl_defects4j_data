{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/block/GridArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GridArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 450,
      "comment": "\r\n * Arranges blocks in a grid within their container.\r\n "
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
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The rows. "
    },
    {
      "type": "field",
      "varNames": [
        "columns"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The columns. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.GridArrangement.GridArrangement(int, int)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\r\n     * Creates a new grid arrangement.\r\n     *\r\n     * @param rows  the row count.\r\n     * @param columns  the column count.\r\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Adds a block and a key which can be used to determine the position of\r\n     * the block in the arrangement.  This method is called by the container\r\n     * (you don\u0027t need to call this method directly) and gives the arrangement\r\n     * an opportunity to record the details if they are required.\r\n     *\r\n     * @param block  the block.\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 102,
      "end_line": 146,
      "comment": "\r\n     * Arranges the blocks within the specified container, subject to the given\r\n     * constraint.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 69)",
        "(line 105,col 9)-(line 105,col 70)",
        "(line 106,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 156,
      "end_line": 173,
      "comment": "\r\n     * Arranges the container with no constraint on the width or height.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 26)",
        "(line 158,col 9)-(line 158,col 26)",
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 160,col 46)",
        "(line 161,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 41)",
        "(line 171,col 9)-(line 171,col 71)",
        "(line 172,col 9)-(line 172,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 184,
      "end_line": 203,
      "comment": "\r\n     * Arranges the container with a fixed overall width and height.\r\n     *\r\n     * @param container  the container (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The size following the arrangement.\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 60)",
        "(line 187,col 9)-(line 187,col 59)",
        "(line 188,col 9)-(line 188,col 44)",
        "(line 189,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 214,
      "end_line": 228,
      "comment": "\r\n     * Arrange with a fixed width and a height within a given range.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 68)",
        "(line 218,col 9)-(line 218,col 50)",
        "(line 220,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeRF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 239,
      "end_line": 253,
      "comment": "\r\n     * Arrange with a fixed height and a width within a given range.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 67)",
        "(line 243,col 9)-(line 243,col 50)",
        "(line 245,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeRN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 264,
      "end_line": 278,
      "comment": "\r\n     * Arrange with a fixed width and no height constraint.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 67)",
        "(line 268,col 9)-(line 268,col 50)",
        "(line 270,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeNR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 289,
      "end_line": 303,
      "comment": "\r\n     * Arrange with a fixed height and no width constraint.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 68)",
        "(line 293,col 9)-(line 293,col 50)",
        "(line 295,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 314,
      "end_line": 351,
      "comment": "\r\n     * Arrange with ranges for both the width and height constraints.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 72)",
        "(line 319,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 362,
      "end_line": 384,
      "comment": "\r\n     * Arrange with a fixed width and a height within a given range.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 64)",
        "(line 367,col 9)-(line 367,col 44)",
        "(line 368,col 9)-(line 368,col 26)",
        "(line 369,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 76)",
        "(line 383,col 9)-(line 383,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.arrangeNF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 395,
      "end_line": 417,
      "comment": "\r\n     * Arrange with a fixed height and no constraint for the width.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The size of the arrangement.\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 59)",
        "(line 399,col 9)-(line 399,col 66)",
        "(line 400,col 9)-(line 400,col 44)",
        "(line 401,col 9)-(line 401,col 26)",
        "(line 402,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 78)",
        "(line 416,col 9)-(line 416,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.clear()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\r\n     * Clears any cached layout information retained by the arrangement.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.GridArrangement.equals(java.lang.Object)",
      "begin_line": 433,
      "end_line": 448,
      "comment": "\r\n     * Compares this layout manager for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 53)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 20)"
      ]
    }
  ]
}