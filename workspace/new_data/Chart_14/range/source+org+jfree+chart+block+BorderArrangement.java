{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/block/BorderArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BorderArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 577,
      "comment": "\r\n * An arrangement manager that lays out blocks in a similar way to\r\n * Swing\u0027s BorderLayout class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "centerBlock"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The block (if any) at the center of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "topBlock"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The block (if any) at the top of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomBlock"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The block (if any) at the bottom of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "leftBlock"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The block (if any) at the left of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "rightBlock"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The block (if any) at the right of the layout. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BorderArrangement.BorderArrangement()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 94,
      "end_line": 114,
      "comment": "\r\n     * Adds a block to the arrangement manager at the specified edge.\r\n     * \r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the edge (an instance of {@link RectangleEdge}) or \r\n     *             \u003ccode\u003enull\u003c/code\u003e for the center block.\r\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 126,
      "end_line": 174,
      "comment": "\r\n     * Arranges the items in the specified container, subject to the given \r\n     * constraint.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The block size.\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 76)",
        "(line 133,col 9)-(line 133,col 77)",
        "(line 134,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 173,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 184,
      "end_line": 258,
      "comment": "\r\n     * Performs an arrangement without constraints.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 207,col 8)",
        "(line 208,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 217,col 20)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 74)",
        "(line 227,col 9)-(line 227,col 67)",
        "(line 228,col 9)-(line 228,col 51)",
        "(line 229,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 269,
      "end_line": 280,
      "comment": "\r\n     * Performs an arrangement with a fixed width and a range for the height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     * \r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 71)",
        "(line 272,col 9)-(line 279,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)",
      "begin_line": 292,
      "end_line": 345,
      "comment": " \r\n     * Arranges the container width a fixed width and no constraint on the \r\n     * height.\r\n     * \r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param width  the fixed width.\r\n     * \r\n     * @return The container size after arranging the contents.\r\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 35)",
        "(line 295,col 9)-(line 295,col 35)",
        "(line 296,col 9)-(line 299,col 10)",
        "(line 300,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 313,col 10)",
        "(line 314,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 331,col 36)",
        "(line 332,col 9)-(line 332,col 20)",
        "(line 334,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 75)",
        "(line 344,col 9)-(line 344,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, org.jfree.data.Range, org.jfree.data.Range, java.awt.Graphics2D)",
      "begin_line": 358,
      "end_line": 444,
      "comment": "\r\n     * Performs an arrangement with range constraints on both the vertical \r\n     * and horizontal sides.\r\n     * \r\n     * @param container  the container.\r\n     * @param widthRange  the allowable range for the container width.\r\n     * @param heightRange  the allowable range for the container height.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The container size.\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 35)",
        "(line 362,col 9)-(line 362,col 35)",
        "(line 363,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 70)",
        "(line 381,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 66)",
        "(line 390,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 36)",
        "(line 400,col 9)-(line 400,col 20)",
        "(line 401,col 9)-(line 401,col 75)",
        "(line 402,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 74)",
        "(line 414,col 9)-(line 414,col 75)",
        "(line 415,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 455,
      "end_line": 532,
      "comment": "\r\n     * Arranges the items within a container.\r\n     * \r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     * \r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 35)",
        "(line 458,col 9)-(line 458,col 35)",
        "(line 459,col 9)-(line 459,col 37)",
        "(line 460,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 20)",
        "(line 470,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 52)",
        "(line 480,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)",
        "(line 490,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 20)",
        "(line 500,col 9)-(line 500,col 51)",
        "(line 501,col 9)-(line 501,col 69)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.clear()",
      "begin_line": 537,
      "end_line": 543,
      "comment": "\r\n     * Clears the layout.\r\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 32)",
        "(line 539,col 9)-(line 539,col 29)",
        "(line 540,col 9)-(line 540,col 32)",
        "(line 541,col 9)-(line 541,col 30)",
        "(line 542,col 9)-(line 542,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.equals(java.lang.Object)",
      "begin_line": 552,
      "end_line": 576,
      "comment": "\r\n     * Tests this arrangement for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 57)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 20)"
      ]
    }
  ]
}