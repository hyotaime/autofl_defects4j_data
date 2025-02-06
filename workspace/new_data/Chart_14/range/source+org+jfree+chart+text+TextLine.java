{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/text/TextLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 64,
      "end_line": 267,
      "comment": "\n * A sequence of {@link TextFragment} objects that together form a line of \n * text.  A sequence of text lines is managed by the {@link TextBlock} class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "fragments"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Storage for the text fragments that make up the line. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextLine.TextLine()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Creates a new empty line.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextLine.TextLine(java.lang.String)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Creates a new text line using the default font.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextLine.TextLine(java.lang.String, java.awt.Font)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Creates a new text line.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param font  the text font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 51)",
        "(line 96,col 9)-(line 96,col 61)",
        "(line 97,col 9)-(line 97,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextLine.TextLine(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 107,
      "end_line": 120,
      "comment": "\n     * Creates a new text line.\n     * \n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param font  the text font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param paint  the text color (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 118,col 9)-(line 118,col 68)",
        "(line 119,col 9)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.addFragment(org.jfree.chart.text.TextFragment)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Adds a text fragment to the text line.\n     * \n     * @param fragment  the text fragment (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.removeFragment(org.jfree.chart.text.TextFragment)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Removes a fragment from the line.\n     * \n     * @param fragment  the fragment to remove.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.draw(java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, float, float, double)",
      "begin_line": 152,
      "end_line": 167,
      "comment": "\n     * Draws the text line.\n     * \n     * @param g2  the graphics device.\n     * @param anchorX  the x-coordinate for the anchor point.\n     * @param anchorY  the y-coordinate for the anchor point.\n     * @param anchor  the point on the text line that is aligned to the anchor \n     *                point.\n     * @param rotateX  the x-coordinate for the rotation point.\n     * @param rotateY  the y-coordinate for the rotation point.\n     * @param angle  the rotation angle (in radians).\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 26)",
        "(line 157,col 9)-(line 157,col 60)",
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.calculateDimensions(java.awt.Graphics2D)",
      "begin_line": 176,
      "end_line": 187,
      "comment": "\n     * Calculates the width and height of the text line.\n     * \n     * @param g2  the graphics device.\n     * \n     * @return The width and height.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 27)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.getFirstTextFragment()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n     * Returns the first text fragment in the line.\n     * \n     * @return The first text fragment in the line.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 35)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.getLastTextFragment()",
      "begin_line": 207,
      "end_line": 214,
      "comment": "\n     * Returns the last text fragment in the line.\n     * \n     * @return The last text fragment in the line.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 35)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.calculateBaselineOffset(java.awt.Graphics2D, org.jfree.chart.text.TextAnchor)",
      "begin_line": 225,
      "end_line": 235,
      "comment": "\n     * Calculate the offsets required to translate from the specified anchor \n     * position to the left baseline position.\n     * \n     * @param g2  the graphics device.\n     * @param anchor  the anchor position.\n     * \n     * @return The offsets.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 28)",
        "(line 228,col 9)-(line 228,col 54)",
        "(line 229,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.equals(java.lang.Object)",
      "begin_line": 244,
      "end_line": 256,
      "comment": "\n     * Tests this object for equality with an arbitrary object.\n     * \n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextLine.hashCode()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns a hash code for this object.\n     * \n     * @return A hash code.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 72)"
      ]
    }
  ]
}