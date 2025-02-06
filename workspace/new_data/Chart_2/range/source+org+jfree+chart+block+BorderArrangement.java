{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/block/BorderArrangement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BorderArrangement",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.Arrangement",
        "java.io.Serializable"
      ],
      "begin_line": 63,
      "end_line": 534,
      "comment": "\r\n * An arrangement manager that lays out blocks in a similar way to\r\n * Swing\u0027s BorderLayout class.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "centerBlock"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The block (if any) at the center of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "topBlock"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The block (if any) at the top of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "bottomBlock"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The block (if any) at the bottom of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "leftBlock"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The block (if any) at the left of the layout. "
    },
    {
      "type": "field",
      "varNames": [
        "rightBlock"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The block (if any) at the right of the layout. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.BorderArrangement.BorderArrangement()",
      "begin_line": 86,
      "end_line": 87,
      "comment": "\r\n     * Creates a new instance.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.add(org.jfree.chart.block.Block, java.lang.Object)",
      "begin_line": 96,
      "end_line": 116,
      "comment": "\r\n     * Adds a block to the arrangement manager at the specified edge.\r\n     *\r\n     * @param block  the block (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the edge (an instance of {@link RectangleEdge}) or\r\n     *             \u003ccode\u003enull\u003c/code\u003e for the center block.\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrange(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 128,
      "end_line": 172,
      "comment": "\r\n     * Arranges the items in the specified container, subject to the given\r\n     * constraint.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The block size.\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 132,col 60)",
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 76)",
        "(line 135,col 9)-(line 135,col 77)",
        "(line 136,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 171,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeNN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D)",
      "begin_line": 182,
      "end_line": 241,
      "comment": "\r\n     * Performs an arrangement without constraints.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 35)",
        "(line 184,col 9)-(line 184,col 35)",
        "(line 185,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 200,col 8)",
        "(line 201,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 36)",
        "(line 208,col 9)-(line 208,col 20)",
        "(line 210,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 74)",
        "(line 217,col 9)-(line 217,col 67)",
        "(line 218,col 9)-(line 218,col 51)",
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFR(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 252,
      "end_line": 263,
      "comment": "\r\n     * Performs an arrangement with a fixed width and a range for the height.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 71)",
        "(line 255,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFN(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, double)",
      "begin_line": 275,
      "end_line": 324,
      "comment": "\r\n     * Arranges the container width a fixed width and no constraint on the\r\n     * height.\r\n     *\r\n     * @param container  the container.\r\n     * @param g2  the graphics device.\r\n     * @param width  the fixed width.\r\n     *\r\n     * @return The container size after arranging the contents.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)",
        "(line 278,col 9)-(line 278,col 35)",
        "(line 279,col 9)-(line 281,col 43)",
        "(line 282,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 54)",
        "(line 295,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 36)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 314,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 75)",
        "(line 323,col 9)-(line 323,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeRR(org.jfree.chart.block.BlockContainer, org.jfree.data.Range, org.jfree.data.Range, java.awt.Graphics2D)",
      "begin_line": 337,
      "end_line": 411,
      "comment": "\r\n     * Performs an arrangement with range constraints on both the vertical\r\n     * and horizontal sides.\r\n     *\r\n     * @param container  the container.\r\n     * @param widthRange  the allowable range for the container width.\r\n     * @param heightRange  the allowable range for the container height.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size.\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 341,col 35)",
        "(line 342,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 66)",
        "(line 366,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 36)",
        "(line 375,col 9)-(line 375,col 20)",
        "(line 376,col 9)-(line 376,col 75)",
        "(line 377,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 74)",
        "(line 388,col 9)-(line 388,col 75)",
        "(line 389,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.arrangeFF(org.jfree.chart.block.BlockContainer, java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 422,
      "end_line": 489,
      "comment": "\r\n     * Arranges the items within a container.\r\n     *\r\n     * @param container  the container.\r\n     * @param constraint  the constraint.\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The container size after the arrangement.\r\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 35)",
        "(line 425,col 9)-(line 425,col 35)",
        "(line 426,col 9)-(line 426,col 37)",
        "(line 427,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 20)",
        "(line 436,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 52)",
        "(line 444,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 20)",
        "(line 453,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 20)",
        "(line 462,col 9)-(line 462,col 51)",
        "(line 463,col 9)-(line 463,col 69)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.clear()",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\r\n     * Clears the layout.\r\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 32)",
        "(line 496,col 9)-(line 496,col 29)",
        "(line 497,col 9)-(line 497,col 32)",
        "(line 498,col 9)-(line 498,col 30)",
        "(line 499,col 9)-(line 499,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.BorderArrangement.equals(java.lang.Object)",
      "begin_line": 509,
      "end_line": 533,
      "comment": "\r\n     * Tests this arrangement for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 57)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 20)"
      ]
    }
  ]
}