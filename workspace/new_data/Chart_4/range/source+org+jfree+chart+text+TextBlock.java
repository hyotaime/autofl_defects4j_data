{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/text/TextBlock.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextBlock",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 337,
      "comment": "\n * A list of {@link TextLine} objects that form a block of text.\n *\n * @see TextUtilities#createTextBlock(String, Font, Paint)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "lines"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Storage for the lines of text. "
    },
    {
      "type": "field",
      "varNames": [
        "lineAlignment"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The alignment of the lines. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextBlock.TextBlock()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Creates a new empty text block.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.getLineAlignment()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Returns the alignment of the lines of text within the block.\n     *\n     * @return The alignment (never \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.setLineAlignment(org.jfree.chart.util.HorizontalAlignment)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * Sets the alignment of the lines of text within the block.\n     *\n     * @param alignment  the alignment (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.addLine(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Adds a line of text that will be displayed using the specified font.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.addLine(org.jfree.chart.text.TextLine)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Adds a {@link TextLine} to the block.\n     *\n     * @param line  the line.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.getLastLine()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n     * Returns the last line in the block.\n     *\n     * @return The last line in the block.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 138,col 48)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.getLines()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns an unmodifiable list containing the lines for the text block.\n     *\n     * @return A list of {@link TextLine} objects.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.calculateDimensions(java.awt.Graphics2D)",
      "begin_line": 161,
      "end_line": 172,
      "comment": "\n     * Returns the width and height of the text block.\n     *\n     * @param g2  the graphics device.\n     *\n     * @return The width and height.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 28)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.calculateBounds(java.awt.Graphics2D, float, float, org.jfree.chart.text.TextBlockAnchor, float, float, double)",
      "begin_line": 187,
      "end_line": 199,
      "comment": "\n     * Returns the bounds of the text block.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchorX  the x-coordinate for the anchor point.\n     * @param anchorY  the y-coordinate for the anchor point.\n     * @param anchor  the text block anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param rotateX  the x-coordinate for the rotation point.\n     * @param rotateY  the y-coordinate for the rotation point.\n     * @param angle  the rotation angle.\n     *\n     * @return The bounds.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 43)",
        "(line 192,col 9)-(line 192,col 80)",
        "(line 193,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 196,col 34)",
        "(line 197,col 9)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.draw(java.awt.Graphics2D, float, float, org.jfree.chart.text.TextBlockAnchor)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Draws the text block at a specific location.\n     *\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate for the anchor point.\n     * @param y  the y-coordinate for the anchor point.\n     * @param anchor  the anchor point.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.draw(java.awt.Graphics2D, float, float, org.jfree.chart.text.TextBlockAnchor, float, float, double)",
      "begin_line": 226,
      "end_line": 251,
      "comment": "\n     * Draws the text block, aligning it with the specified anchor point and\n     * rotating it about the specified rotation point.\n     *\n     * @param g2  the graphics device.\n     * @param anchorX  the x-coordinate for the anchor point.\n     * @param anchorY  the y-coordinate for the anchor point.\n     * @param anchor  the point on the text block that is aligned to the\n     *                anchor point.\n     * @param rotateX  the x-coordinate for the rotation point.\n     * @param rotateY  the x-coordinate for the rotation point.\n     * @param angle  the rotation (in radians).\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 231,col 80)",
        "(line 232,col 9)-(line 232,col 50)",
        "(line 233,col 9)-(line 233,col 29)",
        "(line 234,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.calculateOffsets(org.jfree.chart.text.TextBlockAnchor, double, double)",
      "begin_line": 264,
      "end_line": 309,
      "comment": "\n     * Calculates the x and y offsets required to align the text block with the\n     * specified anchor point.  This assumes that the top left of the text\n     * block is at (0.0, 0.0).\n     *\n     * @param anchor  the anchor position.\n     * @param width  the width of the text block.\n     * @param height  the height of the text block.\n     *\n     * @return The offsets (float[0] \u003d x offset, float[1] \u003d y offset).\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 38)",
        "(line 267,col 9)-(line 267,col 26)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 270,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 25)",
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.equals(java.lang.Object)",
      "begin_line": 318,
      "end_line": 327,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     *\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextBlock.hashCode()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Returns a hash code for this object.\n     *\n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 64)"
      ]
    }
  ]
}