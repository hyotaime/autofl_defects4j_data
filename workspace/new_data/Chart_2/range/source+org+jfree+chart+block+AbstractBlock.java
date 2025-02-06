{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/block/AbstractBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractBlock",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 631,
      "comment": "\r\n * A convenience class for creating new classes that implement\r\n * the {@link Block} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The id for the block. "
    },
    {
      "type": "field",
      "varNames": [
        "margin"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The margin around the outside of the block. "
    },
    {
      "type": "field",
      "varNames": [
        "frame"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The frame (or border) for the block. "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The padding between the block content and the border. "
    },
    {
      "type": "field",
      "varNames": [
        "width"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\r\n     * The natural width of the block (may be overridden if there are\r\n     * constraints in sizing).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "height"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\r\n     * The natural height of the block (may be overridden if there are\r\n     * constraints in sizing).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bounds"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\r\n     * The current bounds for the block (position of the block in Java2D space).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.AbstractBlock.AbstractBlock()",
      "begin_line": 109,
      "end_line": 117,
      "comment": "\r\n     * Creates a new block.\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 23)",
        "(line 111,col 9)-(line 111,col 25)",
        "(line 112,col 9)-(line 112,col 26)",
        "(line 113,col 9)-(line 113,col 46)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 115,col 9)-(line 115,col 38)",
        "(line 116,col 9)-(line 116,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getID()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\r\n     * Returns the id.\r\n     *\r\n     * @return The id (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setID(String)\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setID(java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\r\n     * Sets the id for the block.\r\n     *\r\n     * @param id  the id (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getID()\r\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getWidth()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\r\n     * Returns the natural width of the block, if this is known in advance.\r\n     * The actual width of the block may be overridden if layout constraints\r\n     * make this necessary.\r\n     *\r\n     * @return The width.\r\n     *\r\n     * @see #setWidth(double)\r\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setWidth(double)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Sets the natural width of the block, if this is known in advance.\r\n     *\r\n     * @param width  the width (in Java2D units)\r\n     *\r\n     * @see #getWidth()\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getHeight()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\r\n     * Returns the natural height of the block, if this is known in advance.\r\n     * The actual height of the block may be overridden if layout constraints\r\n     * make this necessary.\r\n     *\r\n     * @return The height.\r\n     *\r\n     * @see #setHeight(double)\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setHeight(double)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Sets the natural width of the block, if this is known in advance.\r\n     *\r\n     * @param height  the width (in Java2D units)\r\n     *\r\n     * @see #getHeight()\r\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getMargin()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\r\n     * Returns the margin.\r\n     *\r\n     * @return The margin (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getMargin()\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setMargin(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\r\n     * Sets the margin (use {@link RectangleInsets#ZERO_INSETS} for no\r\n     * padding).\r\n     *\r\n     * @param margin  the margin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getMargin()\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setMargin(double, double, double, double)",
      "begin_line": 225,
      "end_line": 228,
      "comment": "\r\n     * Sets the margin.\r\n     *\r\n     * @param top  the top margin.\r\n     * @param left  the left margin.\r\n     * @param bottom  the bottom margin.\r\n     * @param right  the right margin.\r\n     *\r\n     * @see #getMargin()\r\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getFrame()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Returns the current frame (border).\r\n     *\r\n     * @return The frame.\r\n     *\r\n     * @since 1.0.5\r\n     * @see #setFrame(BlockFrame)\r\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setFrame(org.jfree.chart.block.BlockFrame)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\r\n     * Sets the frame (or border).\r\n     *\r\n     * @param frame  the frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     * @see #getFrame()\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getPadding()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the padding.\r\n     *\r\n     * @return The padding (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPadding(RectangleInsets)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setPadding(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\r\n     * Sets the padding (use {@link RectangleInsets#ZERO_INSETS} for no\r\n     * padding).\r\n     *\r\n     * @param padding  the padding (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPadding()\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setPadding(double, double, double, double)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\r\n     * Sets the padding.\r\n     *\r\n     * @param top  the top padding.\r\n     * @param left  the left padding.\r\n     * @param bottom  the bottom padding.\r\n     * @param right  the right padding.\r\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getContentXOffset()",
      "begin_line": 303,
      "end_line": 306,
      "comment": "\r\n     * Returns the x-offset for the content within the block.\r\n     *\r\n     * @return The x-offset.\r\n     *\r\n     * @see #getContentYOffset()\r\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 305,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getContentYOffset()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\r\n     * Returns the y-offset for the content within the block.\r\n     *\r\n     * @return The y-offset.\r\n     *\r\n     * @see #getContentXOffset()\r\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 317,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.arrange(java.awt.Graphics2D)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\r\n     * Arranges the contents of the block, with no constraints, and returns\r\n     * the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 58)",
        "(line 343,col 9)-(line 343,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.getBounds()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\r\n     * Returns the current bounds of the block.\r\n     *\r\n     * @return The bounds.\r\n     *\r\n     * @see #setBounds(Rectangle2D)\r\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.setBounds(java.awt.geom.Rectangle2D)",
      "begin_line": 364,
      "end_line": 369,
      "comment": "\r\n     * Sets the bounds of the block.\r\n     *\r\n     * @param bounds  the bounds (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getBounds()\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimToContentWidth(double)",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\r\n     * Calculate the width available for content after subtracting\r\n     * the margin, border and padding space from the specified fixed\r\n     * width.\r\n     *\r\n     * @param fixedWidth  the fixed width.\r\n     *\r\n     * @return The available space.\r\n     *\r\n     * @see #trimToContentHeight(double)\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 58)",
        "(line 384,col 9)-(line 384,col 58)",
        "(line 385,col 9)-(line 385,col 48)",
        "(line 386,col 9)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimToContentHeight(double)",
      "begin_line": 400,
      "end_line": 405,
      "comment": "\r\n     * Calculate the height available for content after subtracting\r\n     * the margin, border and padding space from the specified fixed\r\n     * height.\r\n     *\r\n     * @param fixedHeight  the fixed height.\r\n     *\r\n     * @return The available space.\r\n     *\r\n     * @see #trimToContentWidth(double)\r\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 60)",
        "(line 402,col 9)-(line 402,col 59)",
        "(line 403,col 9)-(line 403,col 49)",
        "(line 404,col 9)-(line 404,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.toContentConstraint(org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 415,
      "end_line": 434,
      "comment": "\r\n     * Returns a constraint for the content of this block that will result in\r\n     * the bounds of the block matching the specified constraint.\r\n     *\r\n     * @param c  the outer constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The content constraint.\r\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 32)",
        "(line 423,col 9)-(line 423,col 37)",
        "(line 424,col 9)-(line 424,col 33)",
        "(line 425,col 9)-(line 425,col 38)",
        "(line 426,col 9)-(line 426,col 42)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 428,col 43)",
        "(line 429,col 9)-(line 429,col 44)",
        "(line 430,col 9)-(line 433,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimToContentWidth(org.jfree.data.Range)",
      "begin_line": 436,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 32)",
        "(line 441,col 9)-(line 441,col 53)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimToContentHeight(org.jfree.data.Range)",
      "begin_line": 451,
      "end_line": 464,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 32)",
        "(line 456,col 9)-(line 456,col 53)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.calculateTotalWidth(double)",
      "begin_line": 473,
      "end_line": 479,
      "comment": "\r\n     * Adds the margin, border and padding to the specified content width.\r\n     *\r\n     * @param contentWidth  the content width.\r\n     *\r\n     * @return The adjusted width.\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 37)",
        "(line 475,col 9)-(line 475,col 50)",
        "(line 476,col 9)-(line 476,col 60)",
        "(line 477,col 9)-(line 477,col 49)",
        "(line 478,col 9)-(line 478,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.calculateTotalHeight(double)",
      "begin_line": 488,
      "end_line": 494,
      "comment": "\r\n     * Adds the margin, border and padding to the specified content height.\r\n     *\r\n     * @param contentHeight  the content height.\r\n     *\r\n     * @return The adjusted height.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 38)",
        "(line 490,col 9)-(line 490,col 51)",
        "(line 491,col 9)-(line 491,col 61)",
        "(line 492,col 9)-(line 492,col 50)",
        "(line 493,col 9)-(line 493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimMargin(java.awt.geom.Rectangle2D)",
      "begin_line": 504,
      "end_line": 508,
      "comment": "\r\n     * Reduces the specified area by the amount of space consumed\r\n     * by the margin.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The trimmed area.\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 31)",
        "(line 507,col 9)-(line 507,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimBorder(java.awt.geom.Rectangle2D)",
      "begin_line": 518,
      "end_line": 522,
      "comment": "\r\n     * Reduces the specified area by the amount of space consumed\r\n     * by the border.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The trimmed area.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 42)",
        "(line 521,col 9)-(line 521,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.trimPadding(java.awt.geom.Rectangle2D)",
      "begin_line": 532,
      "end_line": 536,
      "comment": "\r\n     * Reduces the specified area by the amount of space consumed\r\n     * by the padding.\r\n     *\r\n     * @param area  the area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The trimmed area.\r\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 32)",
        "(line 535,col 9)-(line 535,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.drawBorder(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\r\n     * Draws the border around the perimeter of the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.equals(java.lang.Object)",
      "begin_line": 555,
      "end_line": 585,
      "comment": "\r\n     * Tests this block for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.clone()",
      "begin_line": 595,
      "end_line": 603,
      "comment": "\r\n     * Returns a clone of this block.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem creating the\r\n     *         clone.\r\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 60)",
        "(line 597,col 9)-(line 597,col 71)",
        "(line 598,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 36)",
        "(line 614,col 9)-(line 614,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.AbstractBlock.readObject(java.io.ObjectInputStream)",
      "begin_line": 625,
      "end_line": 629,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 35)",
        "(line 628,col 9)-(line 628,col 70)"
      ]
    }
  ]
}