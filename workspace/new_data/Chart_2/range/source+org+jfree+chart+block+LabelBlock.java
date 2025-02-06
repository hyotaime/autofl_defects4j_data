{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/block/LabelBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LabelBlock",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.block.AbstractBlock",
        "org.jfree.chart.block.Block",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 79,
      "end_line": 449,
      "comment": "\r\n * A block containing a label.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\r\n     * The text for the label - retained in case the label needs\r\n     * regenerating (for example, to change the font).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The tool tip text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The URL text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The default color. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "contentAlignmentPoint"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\r\n     * The content alignment point.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\r\n     * The anchor point for the text.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Creates a new label block.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String, java.awt.Font)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\r\n     * Creates a new label block.\r\n     *\r\n     * @param text  the text for the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\r\n     * Creates a new label block.\r\n     *\r\n     * @param text  the text for the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 75)",
        "(line 153,col 9)-(line 153,col 25)",
        "(line 154,col 9)-(line 154,col 32)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 60)",
        "(line 157,col 9)-(line 157,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getFont()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setFont(java.awt.Font)",
      "begin_line": 178,
      "end_line": 184,
      "comment": "\r\n     * Sets the font and regenerates the label.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 25)",
        "(line 183,col 9)-(line 183,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getPaint()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\r\n     * Returns the paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setPaint(java.awt.Paint)",
      "begin_line": 204,
      "end_line": 211,
      "comment": "\r\n     * Sets the paint and regenerates the label.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 27)",
        "(line 209,col 9)-(line 210,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getToolTipText()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\r\n     * Returns the tool tip text.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setToolTipText(String)\r\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setToolTipText(java.lang.String)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\r\n     * Sets the tool tip text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getToolTipText()\r\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getURLText()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Returns the URL text.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setURLText(String)\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setURLText(java.lang.String)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Sets the URL text.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getURLText()\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getContentAlignmentPoint()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the content alignment point.\r\n     *\r\n     * @return The content alignment point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setContentAlignmentPoint(org.jfree.chart.text.TextBlockAnchor)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\r\n     * Sets the content alignment point.\r\n     *\r\n     * @param anchor  the anchor used to determine the alignment point (never\r\n     *         \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getTextAnchor()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Returns the text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @return The text anchor.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setTextAnchor(org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Sets the text anchor.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 314,
      "end_line": 319,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 30)",
        "(line 316,col 9)-(line 316,col 54)",
        "(line 317,col 9)-(line 318,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Draws the block.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 340,
      "end_line": 373,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 32)",
        "(line 342,col 9)-(line 342,col 29)",
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 347,col 9)-(line 347,col 37)",
        "(line 348,col 9)-(line 348,col 44)",
        "(line 349,col 9)-(line 349,col 32)",
        "(line 350,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 32)",
        "(line 358,col 9)-(line 358,col 30)",
        "(line 359,col 9)-(line 359,col 72)",
        "(line 360,col 9)-(line 361,col 44)",
        "(line 362,col 9)-(line 362,col 34)",
        "(line 363,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.equals(java.lang.Object)",
      "begin_line": 383,
      "end_line": 410,
      "comment": "\r\n     * Tests this \u003ccode\u003eLabelBlock\u003c/code\u003e for equality with an arbitrary\r\n     * object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 43)",
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.clone()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eLabelBlock\u003c/code\u003e instance.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.readObject(java.io.ObjectInputStream)",
      "begin_line": 443,
      "end_line": 447,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 35)",
        "(line 446,col 9)-(line 446,col 55)"
      ]
    }
  ]
}