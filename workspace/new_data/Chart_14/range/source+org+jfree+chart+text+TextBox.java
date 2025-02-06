{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/text/TextBox.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextBox",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 417,
      "comment": "\n * A box containing a text block.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "interiorGap"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The interior space. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowPaint"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The shadow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowXOffset"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The shadow x-offset. "
    },
    {
      "type": "field",
      "varNames": [
        "shadowYOffset"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The shadow y-offset. "
    },
    {
      "type": "field",
      "varNames": [
        "textBlock"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The text block. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBox.TextBox()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Creates an empty text box.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBox.TextBox(java.lang.String)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Creates a text box.\n     * \n     * @param text  the text.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBox.TextBox(org.jfree.chart.text.TextBlock)",
      "begin_line": 102,
      "end_line": 111,
      "comment": "\n     * Creates a new text box.\n     * \n     * @param block  the text block.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 40)",
        "(line 104,col 9)-(line 104,col 51)",
        "(line 105,col 9)-(line 105,col 67)",
        "(line 106,col 9)-(line 106,col 56)",
        "(line 107,col 9)-(line 107,col 38)",
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getOutlinePaint()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the outline paint.\n     * \n     * @return The outline paint.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setOutlinePaint(java.awt.Paint)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Sets the outline paint.\n     * \n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getOutlineStroke()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns the outline stroke.\n     * \n     * @return The outline stroke.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Sets the outline stroke.\n     * \n     * @param stroke  the stroke.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getInteriorGap()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Returns the interior gap.\n     * \n     * @return The interior gap.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setInteriorGap(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Sets the interior gap.\n     * \n     * @param gap  the gap.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getBackgroundPaint()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the background paint.\n     * \n     * @return The background paint.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Sets the background paint.\n     * \n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowPaint()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the shadow paint.\n     * \n     * @return The shadow paint.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowPaint(java.awt.Paint)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Sets the shadow paint.\n     * \n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowXOffset()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns the x-offset for the shadow effect.\n     * \n     * @return The offset.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowXOffset(double)",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Sets the x-offset for the shadow effect.\n     * \n     * @param offset  the offset (in Java2D units).\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowYOffset()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns the y-offset for the shadow effect.\n     * \n     * @return The offset.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowYOffset(double)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Sets the y-offset for the shadow effect.\n     * \n     * @param offset  the offset (in Java2D units).\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getTextBlock()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns the text block.\n     * \n     * @return The text block.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setTextBlock(org.jfree.chart.text.TextBlock)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Sets the text block.\n     * \n     * @param block  the block.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.draw(java.awt.Graphics2D, float, float, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 265,
      "end_line": 297,
      "comment": "\n     * Draws the text box.\n     * \n     * @param g2  the graphics device.\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     * @param anchor  the anchor point.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 59)",
        "(line 267,col 9)-(line 267,col 63)",
        "(line 268,col 9)-(line 268,col 65)",
        "(line 269,col 9)-(line 269,col 37)",
        "(line 270,col 9)-(line 270,col 79)",
        "(line 271,col 9)-(line 271,col 34)",
        "(line 272,col 9)-(line 272,col 34)",
        "(line 274,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 295,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getHeight(java.awt.Graphics2D)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Returns the height of the text box.\n     * \n     * @param g2  the graphics device.\n     * \n     * @return The height (in Java2D units).\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 58)",
        "(line 308,col 9)-(line 308,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.equals(java.lang.Object)",
      "begin_line": 318,
      "end_line": 353,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     * \n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 43)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 352,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.hashCode()",
      "begin_line": 360,
      "end_line": 381,
      "comment": "\n     * Returns a hash code for this object.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 19)",
        "(line 362,col 9)-(line 362,col 18)",
        "(line 363,col 9)-(line 363,col 80)",
        "(line 364,col 9)-(line 365,col 53)",
        "(line 366,col 9)-(line 367,col 51)",
        "(line 368,col 9)-(line 369,col 55)",
        "(line 370,col 9)-(line 371,col 51)",
        "(line 372,col 9)-(line 373,col 67)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 376,col 67)",
        "(line 377,col 9)-(line 377,col 60)",
        "(line 378,col 9)-(line 379,col 49)",
        "(line 380,col 9)-(line 380,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 390,
      "end_line": 397,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 36)",
        "(line 393,col 9)-(line 393,col 62)",
        "(line 394,col 9)-(line 394,col 64)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 396,col 9)-(line 396,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.readObject(java.io.ObjectInputStream)",
      "begin_line": 407,
      "end_line": 414,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 410,col 62)",
        "(line 411,col 9)-(line 411,col 64)",
        "(line 412,col 9)-(line 412,col 65)",
        "(line 413,col 9)-(line 413,col 61)"
      ]
    }
  ]
}