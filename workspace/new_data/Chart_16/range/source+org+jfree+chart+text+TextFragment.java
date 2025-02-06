{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/text/TextFragment.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextFragment",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 321,
      "comment": "\n * A text item, with an associated font, that fits on a single line (see \n * {@link TextLine}).  Instances of the class are immutable.\n "
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
        "DEFAULT_FONT"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The default text color. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The text color. "
    },
    {
      "type": "field",
      "varNames": [
        "baselineOffset"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " \n     * The baseline offset (can be used to simulate subscripts and \n     * superscripts). \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextFragment.TextFragment(java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Creates a new text fragment.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextFragment.TextFragment(java.lang.String, java.awt.Font)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Creates a new text fragment.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextFragment.TextFragment(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Creates a new text fragment.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param paint  the text color (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextFragment.TextFragment(java.lang.String, java.awt.Font, java.awt.Paint, float)",
      "begin_line": 136,
      "end_line": 151,
      "comment": "\n     * Creates a new text fragment.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param paint  the text color (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param baselineOffset  the baseline offset.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 25)",
        "(line 148,col 9)-(line 148,col 25)",
        "(line 149,col 9)-(line 149,col 27)",
        "(line 150,col 9)-(line 150,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.getText()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the text.\n     * \n     * @return The text (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.getFont()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns the font.\n     * \n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.getPaint()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the text paint.\n     * \n     * @return The text paint (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.getBaselineOffset()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Returns the baseline offset.\n     * \n     * @return The baseline offset.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.draw(java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, float, float, double)",
      "begin_line": 201,
      "end_line": 211,
      "comment": "\n     * Draws the text fragment.\n     * \n     * @param g2  the graphics device.\n     * @param anchorX  the x-coordinate of the anchor point.\n     * @param anchorY  the y-coordinate of the anchor point.\n     * @param anchor  the location of the text that is aligned to the anchor \n     *                point.\n     * @param rotateX  the x-coordinate of the rotation point.\n     * @param rotateY  the y-coordinate of the rotation point.\n     * @param angle  the angle.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 30)",
        "(line 207,col 9)-(line 207,col 32)",
        "(line 208,col 9)-(line 209,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.calculateDimensions(java.awt.Graphics2D)",
      "begin_line": 220,
      "end_line": 225,
      "comment": "\n     * Calculates the dimensions of the text fragment.\n     * \n     * @param g2  the graphics device.\n     * \n     * @return The width and height of the text.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 54)",
        "(line 222,col 9)-(line 222,col 76)",
        "(line 223,col 9)-(line 223,col 74)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.calculateBaselineOffset(java.awt.Graphics2D, org.jfree.chart.text.TextAnchor)",
      "begin_line": 236,
      "end_line": 250,
      "comment": "\n     * Calculates the vertical offset between the baseline and the specified \n     * text anchor.\n     * \n     * @param g2  the graphics device.\n     * @param anchor  the anchor.\n     * \n     * @return the offset.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 28)",
        "(line 238,col 9)-(line 238,col 54)",
        "(line 239,col 9)-(line 239,col 57)",
        "(line 240,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.equals(java.lang.Object)",
      "begin_line": 259,
      "end_line": 280,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.hashCode()",
      "begin_line": 287,
      "end_line": 293,
      "comment": "\n     * Returns a hash code for this object.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 19)",
        "(line 289,col 9)-(line 289,col 64)",
        "(line 290,col 9)-(line 290,col 78)",
        "(line 291,col 9)-(line 291,col 80)",
        "(line 292,col 9)-(line 292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextFragment.readObject(java.io.ObjectInputStream)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 55)"
      ]
    }
  ]
}