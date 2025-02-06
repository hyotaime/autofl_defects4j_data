{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/text/TextUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 840,
      "comment": "\n * Some utility methods for working with text.\n "
    },
    {
      "type": "field",
      "varNames": [
        "useDrawRotatedStringWorkaround"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * A flag that controls whether or not the rotated string workaround is\n     * used.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useFontMetricsGetStringBounds"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * A flag that controls whether the FontMetrics.getStringBounds() method\n     * is used or a workaround is applied.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextUtilities.TextUtilities()",
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 114,
      "end_line": 149,
      "comment": "\n     * Creates a {@link TextBlock} from a \u003ccode\u003eString\u003c/code\u003e.  Line breaks\n     * are added where the \u003ccode\u003eString\u003c/code\u003e contains \u0027\\n\u0027 characters.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 28)",
        "(line 121,col 9)-(line 121,col 57)",
        "(line 122,col 9)-(line 122,col 22)",
        "(line 123,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint, float, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 164,
      "end_line": 169,
      "comment": "\n     * Creates a new text block from the given string, breaking the\n     * text into lines so that the \u003ccode\u003emaxWidth\u003c/code\u003e value is\n     * respected.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     * @param maxWidth  the maximum width for each line.\n     * @param measurer  the text measurer.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 168,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint, float, int, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 185,
      "end_line": 223,
      "comment": "\n     * Creates a new text block from the given string, breaking the\n     * text into lines so that the \u003ccode\u003emaxWidth\u003c/code\u003e value is\n     * respected.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     * @param maxWidth  the maximum width for each line.\n     * @param maxLines  the maximum number of lines.\n     * @param measurer  the text measurer.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 43)",
        "(line 189,col 9)-(line 189,col 65)",
        "(line 190,col 9)-(line 190,col 31)",
        "(line 191,col 9)-(line 191,col 24)",
        "(line 192,col 9)-(line 192,col 22)",
        "(line 193,col 9)-(line 193,col 35)",
        "(line 194,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.nextLineBreak(java.lang.String, int, float, java.text.BreakIterator, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 236,
      "end_line": 276,
      "comment": "\n     * Returns the character index of the next line break.\n     *\n     * @param text  the text.\n     * @param start  the start index.\n     * @param width  the target display width.\n     * @param iterator  the word break iterator.\n     * @param measurer  the text measurer.\n     *\n     * @return The index of the next line break.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 28)",
        "(line 242,col 9)-(line 242,col 16)",
        "(line 243,col 9)-(line 243,col 23)",
        "(line 244,col 9)-(line 244,col 33)",
        "(line 245,col 9)-(line 245,col 48)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.getTextBounds(java.lang.String, java.awt.Graphics2D, java.awt.FontMetrics)",
      "begin_line": 288,
      "end_line": 309,
      "comment": "\n     * Returns the bounds for the specified text.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics context (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param fm  the font metrics (not \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @return The text bounds (\u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003etext\u003c/code\u003e\n     *         argument is \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawAlignedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor)",
      "begin_line": 323,
      "end_line": 334,
      "comment": "\n     * Draws a string such that the specified anchor point is aligned to the\n     * given (x, y) location.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x coordinate (Java 2D).\n     * @param y  the y coordinate (Java 2D).\n     * @param anchor  the anchor location.\n     *\n     * @return The text bounds (adjusted for the text position).\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 58)",
        "(line 327,col 9)-(line 328,col 28)",
        "(line 330,col 9)-(line 331,col 59)",
        "(line 332,col 9)-(line 332,col 58)",
        "(line 333,col 9)-(line 333,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor, java.awt.geom.Rectangle2D)",
      "begin_line": 352,
      "end_line": 430,
      "comment": "\n     * A utility method that calculates the anchor offsets for a string.\n     * Normally, the (x, y) coordinate for drawing text is a point on the\n     * baseline at the left of the text string.  If you add these offsets to\n     * (x, y) and draw the string, then the anchor point should coincide with\n     * the (x, y) point.\n     *\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     * @param textBounds  the text bounds (if not \u003ccode\u003enull\u003c/code\u003e, this\n     *                    object will be updated by this method to match the\n     *                    string bounds).\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 38)",
        "(line 356,col 9)-(line 356,col 58)",
        "(line 357,col 9)-(line 357,col 30)",
        "(line 358,col 9)-(line 358,col 46)",
        "(line 359,col 9)-(line 359,col 71)",
        "(line 360,col 9)-(line 360,col 58)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 28)",
        "(line 363,col 9)-(line 363,col 41)",
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 45)",
        "(line 366,col 9)-(line 366,col 26)",
        "(line 367,col 9)-(line 367,col 26)",
        "(line 369,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 25)",
        "(line 427,col 9)-(line 427,col 25)",
        "(line 428,col 9)-(line 428,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.setUseDrawRotatedStringWorkaround(boolean)",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Sets the flag that controls whether or not a workaround is used for\n     * drawing rotated strings.  The related bug is on Sun\u0027s bug parade\n     * (id 4312117) and the workaround involves using a \u003ccode\u003eTextLayout\u003c/code\u003e\n     * instance to draw the text instead of calling the\n     * \u003ccode\u003edrawString()\u003c/code\u003e method in the \u003ccode\u003eGraphics2D\u003c/code\u003e class.\n     *\n     * @param use  the new flag value.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, double, float, float)",
      "begin_line": 457,
      "end_line": 460,
      "comment": "\n     * A utility method for drawing rotated text.\n     * \u003cP\u003e\n     * A common rotation is -Math.PI/2 which draws text \u0027vertically\u0027 (with the\n     * top of the characters on the left).\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param angle  the angle of the (clockwise) rotation (in radians).\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, double, float, float)",
      "begin_line": 476,
      "end_line": 504,
      "comment": "\n     * A utility method for drawing rotated text.\n     * \u003cP\u003e\n     * A common rotation is -Math.PI/2 which draws text \u0027vertically\u0027 (with the\n     * top of the characters on the left).\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param textX  the x-coordinate for the text (before rotation).\n     * @param textY  the y-coordinate for the text (before rotation).\n     * @param angle  the angle of the (clockwise) rotation (in radians).\n     * @param rotateX  the point about which the text is rotated.\n     * @param rotateY  the point about which the text is rotated.\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 484,col 50)",
        "(line 487,col 9)-(line 488,col 41)",
        "(line 489,col 9)-(line 489,col 29)",
        "(line 491,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, float, float)",
      "begin_line": 519,
      "end_line": 529,
      "comment": "\n     * Draws a string that is aligned by one anchor point and rotated about\n     * another anchor point.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate for positioning the text.\n     * @param y  the y-coordinate for positioning the text.\n     * @param textAnchor  the text anchor.\n     * @param angle  the rotation angle.\n     * @param rotationX  the x-coordinate for the rotation anchor point.\n     * @param rotationY  the y-coordinate for the rotation anchor point.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 78)",
        "(line 527,col 9)-(line 528,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, org.jfree.chart.text.TextAnchor)",
      "begin_line": 543,
      "end_line": 557,
      "comment": "\n     * Draws a string that is aligned by one anchor point and rotated about\n     * another anchor point.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate for positioning the text.\n     * @param y  the y-coordinate for positioning the text.\n     * @param textAnchor  the text anchor.\n     * @param angle  the rotation angle (in radians).\n     * @param rotationAnchor  the rotation anchor.\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 78)",
        "(line 551,col 9)-(line 552,col 32)",
        "(line 553,col 9)-(line 555,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, org.jfree.chart.text.TextAnchor)",
      "begin_line": 573,
      "end_line": 589,
      "comment": "\n     * Returns a shape that represents the bounds of the string after the\n     * specified rotation has been applied.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics device.\n     * @param x  the x coordinate for the anchor point.\n     * @param y  the y coordinate for the anchor point.\n     * @param textAnchor  the text anchor.\n     * @param angle  the angle.\n     * @param rotationAnchor  the rotation anchor.\n     *\n     * @return The bounds (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 78)",
        "(line 582,col 9)-(line 583,col 32)",
        "(line 584,col 9)-(line 586,col 78)",
        "(line 587,col 9)-(line 587,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor)",
      "begin_line": 604,
      "end_line": 678,
      "comment": "\n     * A utility method that calculates the anchor offsets for a string.\n     * Normally, the (x, y) coordinate for drawing text is a point on the\n     * baseline at the left of the text string.  If you add these offsets to\n     * (x, y) and draw the string, then the anchor point should coincide with\n     * the (x, y) point.\n     *\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 58)",
        "(line 609,col 9)-(line 609,col 30)",
        "(line 610,col 9)-(line 610,col 46)",
        "(line 611,col 9)-(line 611,col 71)",
        "(line 612,col 9)-(line 612,col 58)",
        "(line 613,col 9)-(line 613,col 43)",
        "(line 614,col 9)-(line 614,col 41)",
        "(line 615,col 9)-(line 615,col 45)",
        "(line 616,col 9)-(line 616,col 45)",
        "(line 617,col 9)-(line 617,col 26)",
        "(line 618,col 9)-(line 618,col 26)",
        "(line 620,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 25)",
        "(line 675,col 9)-(line 675,col 25)",
        "(line 676,col 9)-(line 676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveRotationAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor)",
      "begin_line": 691,
      "end_line": 773,
      "comment": "\n     * A utility method that calculates the rotation anchor offsets for a\n     * string.  These offsets are relative to the text starting coordinate\n     * (BASELINE_LEFT).\n     *\n     * @param g2  the graphics device.\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 38)",
        "(line 695,col 9)-(line 695,col 58)",
        "(line 696,col 9)-(line 696,col 69)",
        "(line 697,col 9)-(line 697,col 45)",
        "(line 698,col 9)-(line 698,col 71)",
        "(line 699,col 9)-(line 699,col 43)",
        "(line 700,col 9)-(line 700,col 41)",
        "(line 701,col 9)-(line 701,col 45)",
        "(line 702,col 9)-(line 702,col 45)",
        "(line 703,col 9)-(line 703,col 26)",
        "(line 704,col 9)-(line 704,col 26)",
        "(line 706,col 9)-(line 732,col 9)",
        "(line 734,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 25)",
        "(line 770,col 9)-(line 770,col 25)",
        "(line 771,col 9)-(line 771,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(java.lang.String, java.awt.Graphics2D, float, float, double, float, float)",
      "begin_line": 790,
      "end_line": 807,
      "comment": "\n     * Returns a shape that represents the bounds of the string after the\n     * specified rotation has been applied.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics device.\n     * @param textX  the x coordinate for the text.\n     * @param textY  the y coordinate for the text.\n     * @param angle  the angle.\n     * @param rotateX  the x coordinate for the rotation point.\n     * @param rotateY  the y coordinate for the rotation point.\n     *\n     * @return The bounds (\u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003etext\u003c/code\u003e is\n     *         \u003c/code\u003enull\u003c/code\u003e or has zero length).\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 796,col 9)",
        "(line 797,col 9)-(line 797,col 45)",
        "(line 798,col 9)-(line 798,col 71)",
        "(line 799,col 9)-(line 800,col 30)",
        "(line 801,col 9)-(line 801,col 74)",
        "(line 802,col 9)-(line 803,col 41)",
        "(line 804,col 9)-(line 804,col 71)",
        "(line 805,col 9)-(line 805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.getUseFontMetricsGetStringBounds()",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * Returns the flag that controls whether the FontMetrics.getStringBounds()\n     * method is used or not.  If you are having trouble with label alignment\n     * or positioning, try changing the value of this flag.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.setUseFontMetricsGetStringBounds(boolean)",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\n     * Sets the flag that controls whether the FontMetrics.getStringBounds()\n     * method is used or not.  If you are having trouble with label alignment\n     * or positioning, try changing the value of this flag.\n     *\n     * @param use  the flag.\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.isUseDrawRotatedStringWorkaround()",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\n     * Returns the current value of the\n     * \u003ccode\u003euseDrawRotatedStringWorkaround\u003c/code\u003e flag.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 46)"
      ]
    }
  ]
}