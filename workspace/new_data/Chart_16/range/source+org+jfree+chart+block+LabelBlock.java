{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/block/LabelBlock.java",
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
      "begin_line": 77,
      "end_line": 373,
      "comment": "\r\n * A block containing a label.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " \r\n     * The text for the label - retained in case the label needs \r\n     * regenerating (for example, to change the font). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The label. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The tool tip text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The URL text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The default color. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The paint. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\r\n     * Creates a new label block.\r\n     * \r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String, java.awt.Font)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\r\n     * Creates a new label block.\r\n     * \r\n     * @param text  the text for the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.block.LabelBlock.LabelBlock(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 130,
      "end_line": 137,
      "comment": "\r\n     * Creates a new label block.\r\n     *\r\n     * @param text  the text for the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 25)",
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 75)",
        "(line 134,col 9)-(line 134,col 25)",
        "(line 135,col 9)-(line 135,col 32)",
        "(line 136,col 9)-(line 136,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getFont()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\r\n     * Returns the font.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setFont(java.awt.Font)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\r\n     * Sets the font and regenerates the label.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 25)",
        "(line 162,col 9)-(line 162,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getPaint()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\r\n     * Returns the paint.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setPaint(java.awt.Paint)",
      "begin_line": 183,
      "end_line": 190,
      "comment": "\r\n     * Sets the paint and regenerates the label.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 189,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getToolTipText()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the tool tip text.\r\n     * \r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setToolTipText(String)\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setToolTipText(java.lang.String)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\r\n     * Sets the tool tip text.\r\n     * \r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getToolTipText()\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.getURLText()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\r\n     * Returns the URL text.\r\n     * \r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setURLText(String)\r\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.setURLText(java.lang.String)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\r\n     * Sets the URL text.\r\n     * \r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getURLText()\r\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 30)",
        "(line 247,col 9)-(line 247,col 54)",
        "(line 248,col 9)-(line 249,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Draws the block.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 271,
      "end_line": 303,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  ignored (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return Always \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 273,col 29)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 278,col 9)-(line 278,col 37)",
        "(line 279,col 9)-(line 279,col 44)",
        "(line 280,col 9)-(line 280,col 32)",
        "(line 281,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 32)",
        "(line 289,col 9)-(line 289,col 30)",
        "(line 290,col 9)-(line 291,col 42)",
        "(line 292,col 9)-(line 292,col 34)",
        "(line 293,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.equals(java.lang.Object)",
      "begin_line": 313,
      "end_line": 334,
      "comment": "\r\n     * Tests this \u003ccode\u003eLabelBlock\u003c/code\u003e for equality with an arbitrary \r\n     * object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.clone()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns a clone of this \u003ccode\u003eLabelBlock\u003c/code\u003e instance.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a problem cloning.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 36)",
        "(line 356,col 9)-(line 356,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.block.LabelBlock.readObject(java.io.ObjectInputStream)",
      "begin_line": 367,
      "end_line": 371,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 35)",
        "(line 370,col 9)-(line 370,col 55)"
      ]
    }
  ]
}