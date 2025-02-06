{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/text/TextBox.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextBox",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 415,
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
      "end_line": 93,
      "comment": "\n     * Creates a text box.\n     *\n     * @param text  the text.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBox.TextBox(org.jfree.chart.text.TextBlock)",
      "begin_line": 100,
      "end_line": 109,
      "comment": "\n     * Creates a new text box.\n     *\n     * @param block  the text block.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 40)",
        "(line 102,col 9)-(line 102,col 51)",
        "(line 103,col 9)-(line 103,col 67)",
        "(line 104,col 9)-(line 104,col 56)",
        "(line 105,col 9)-(line 105,col 38)",
        "(line 106,col 9)-(line 106,col 33)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getOutlinePaint()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the outline paint.\n     *\n     * @return The outline paint.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setOutlinePaint(java.awt.Paint)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Sets the outline paint.\n     *\n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getOutlineStroke()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the outline stroke.\n     *\n     * @return The outline stroke.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Sets the outline stroke.\n     *\n     * @param stroke  the stroke.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getInteriorGap()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Returns the interior gap.\n     *\n     * @return The interior gap.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setInteriorGap(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Sets the interior gap.\n     *\n     * @param gap  the gap.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getBackgroundPaint()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Returns the background paint.\n     *\n     * @return The background paint.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Sets the background paint.\n     *\n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowPaint()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the shadow paint.\n     *\n     * @return The shadow paint.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowPaint(java.awt.Paint)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Sets the shadow paint.\n     *\n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowXOffset()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns the x-offset for the shadow effect.\n     *\n     * @return The offset.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowXOffset(double)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Sets the x-offset for the shadow effect.\n     *\n     * @param offset  the offset (in Java2D units).\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getShadowYOffset()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns the y-offset for the shadow effect.\n     *\n     * @return The offset.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setShadowYOffset(double)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Sets the y-offset for the shadow effect.\n     *\n     * @param offset  the offset (in Java2D units).\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getTextBlock()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns the text block.\n     *\n     * @return The text block.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.setTextBlock(org.jfree.chart.text.TextBlock)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Sets the text block.\n     *\n     * @param block  the block.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.draw(java.awt.Graphics2D, float, float, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 263,
      "end_line": 295,
      "comment": "\n     * Draws the text box.\n     *\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     * @param anchor  the anchor point.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 59)",
        "(line 265,col 9)-(line 265,col 63)",
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 268,col 79)",
        "(line 269,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 34)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 293,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.getHeight(java.awt.Graphics2D)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Returns the height of the text box.\n     *\n     * @param g2  the graphics device.\n     *\n     * @return The height (in Java2D units).\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 58)",
        "(line 306,col 9)-(line 306,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.equals(java.lang.Object)",
      "begin_line": 316,
      "end_line": 351,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.hashCode()",
      "begin_line": 358,
      "end_line": 379,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 19)",
        "(line 360,col 9)-(line 360,col 18)",
        "(line 361,col 9)-(line 361,col 80)",
        "(line 362,col 9)-(line 363,col 53)",
        "(line 364,col 9)-(line 365,col 51)",
        "(line 366,col 9)-(line 367,col 55)",
        "(line 368,col 9)-(line 369,col 51)",
        "(line 370,col 9)-(line 371,col 67)",
        "(line 372,col 9)-(line 372,col 60)",
        "(line 373,col 9)-(line 374,col 67)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 377,col 49)",
        "(line 378,col 9)-(line 378,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 388,
      "end_line": 395,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 36)",
        "(line 391,col 9)-(line 391,col 62)",
        "(line 392,col 9)-(line 392,col 64)",
        "(line 393,col 9)-(line 393,col 65)",
        "(line 394,col 9)-(line 394,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBox.readObject(java.io.ObjectInputStream)",
      "begin_line": 405,
      "end_line": 412,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 35)",
        "(line 408,col 9)-(line 408,col 62)",
        "(line 409,col 9)-(line 409,col 64)",
        "(line 410,col 9)-(line 410,col 65)",
        "(line 411,col 9)-(line 411,col 61)"
      ]
    }
  ]
}