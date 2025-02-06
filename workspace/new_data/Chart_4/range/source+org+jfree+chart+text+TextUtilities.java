{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/text/TextUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 835,
      "comment": "\n * Some utility methods for working with text.\n "
    },
    {
      "type": "field",
      "varNames": [
        "useDrawRotatedStringWorkaround"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * A flag that controls whether or not the rotated string workaround is\n     * used.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useFontMetricsGetStringBounds"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * A flag that controls whether the FontMetrics.getStringBounds() method\n     * is used or a workaround is applied.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.text.TextUtilities.TextUtilities()",
      "begin_line": 99,
      "end_line": 100,
      "comment": "\n     * Private constructor prevents object creation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint)",
      "begin_line": 112,
      "end_line": 147,
      "comment": "\n     * Creates a {@link TextBlock} from a \u003ccode\u003eString\u003c/code\u003e.  Line breaks\n     * are added where the \u003ccode\u003eString\u003c/code\u003e contains \u0027\\n\u0027 characters.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 118,col 28)",
        "(line 119,col 9)-(line 119,col 57)",
        "(line 120,col 9)-(line 120,col 22)",
        "(line 121,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint, float, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\n     * Creates a new text block from the given string, breaking the\n     * text into lines so that the \u003ccode\u003emaxWidth\u003c/code\u003e value is\n     * respected.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     * @param maxWidth  the maximum width for each line.\n     * @param measurer  the text measurer.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 166,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.createTextBlock(java.lang.String, java.awt.Font, java.awt.Paint, float, int, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 183,
      "end_line": 221,
      "comment": "\n     * Creates a new text block from the given string, breaking the\n     * text into lines so that the \u003ccode\u003emaxWidth\u003c/code\u003e value is\n     * respected.\n     *\n     * @param text  the text.\n     * @param font  the font.\n     * @param paint  the paint.\n     * @param maxWidth  the maximum width for each line.\n     * @param maxLines  the maximum number of lines.\n     * @param measurer  the text measurer.\n     *\n     * @return A text block.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 43)",
        "(line 187,col 9)-(line 187,col 65)",
        "(line 188,col 9)-(line 188,col 31)",
        "(line 189,col 9)-(line 189,col 24)",
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.nextLineBreak(java.lang.String, int, float, java.text.BreakIterator, org.jfree.chart.text.TextMeasurer)",
      "begin_line": 234,
      "end_line": 272,
      "comment": "\n     * Returns the character index of the next line break.\n     *\n     * @param text  the text.\n     * @param start  the start index.\n     * @param width  the target display width.\n     * @param iterator  the word break iterator.\n     * @param measurer  the text measurer.\n     *\n     * @return The index of the next line break.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 28)",
        "(line 240,col 9)-(line 240,col 16)",
        "(line 241,col 9)-(line 241,col 23)",
        "(line 242,col 9)-(line 242,col 33)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.getTextBounds(java.lang.String, java.awt.Graphics2D, java.awt.FontMetrics)",
      "begin_line": 284,
      "end_line": 305,
      "comment": "\n     * Returns the bounds for the specified text.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics context (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param fm  the font metrics (not \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @return The text bounds (\u003ccode\u003enull\u003c/code\u003e if the \u003ccode\u003etext\u003c/code\u003e\n     *         argument is \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawAlignedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor)",
      "begin_line": 319,
      "end_line": 330,
      "comment": "\n     * Draws a string such that the specified anchor point is aligned to the\n     * given (x, y) location.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x coordinate (Java 2D).\n     * @param y  the y coordinate (Java 2D).\n     * @param anchor  the anchor location.\n     *\n     * @return The text bounds (adjusted for the text position).\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 58)",
        "(line 323,col 9)-(line 324,col 28)",
        "(line 326,col 9)-(line 327,col 59)",
        "(line 328,col 9)-(line 328,col 58)",
        "(line 329,col 9)-(line 329,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor, java.awt.geom.Rectangle2D)",
      "begin_line": 348,
      "end_line": 426,
      "comment": "\n     * A utility method that calculates the anchor offsets for a string.\n     * Normally, the (x, y) coordinate for drawing text is a point on the\n     * baseline at the left of the text string.  If you add these offsets to\n     * (x, y) and draw the string, then the anchor point should coincide with\n     * the (x, y) point.\n     *\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     * @param textBounds  the text bounds (if not \u003ccode\u003enull\u003c/code\u003e, this\n     *                    object will be updated by this method to match the\n     *                    string bounds).\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 58)",
        "(line 353,col 9)-(line 353,col 30)",
        "(line 354,col 9)-(line 354,col 46)",
        "(line 355,col 9)-(line 355,col 71)",
        "(line 356,col 9)-(line 356,col 58)",
        "(line 357,col 9)-(line 357,col 43)",
        "(line 358,col 9)-(line 358,col 28)",
        "(line 359,col 9)-(line 359,col 41)",
        "(line 360,col 9)-(line 360,col 45)",
        "(line 361,col 9)-(line 361,col 45)",
        "(line 362,col 9)-(line 362,col 26)",
        "(line 363,col 9)-(line 363,col 26)",
        "(line 365,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 25)",
        "(line 423,col 9)-(line 423,col 25)",
        "(line 424,col 9)-(line 424,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.setUseDrawRotatedStringWorkaround(boolean)",
      "begin_line": 437,
      "end_line": 439,
      "comment": "\n     * Sets the flag that controls whether or not a workaround is used for\n     * drawing rotated strings.  The related bug is on Sun\u0027s bug parade\n     * (id 4312117) and the workaround involves using a \u003ccode\u003eTextLayout\u003c/code\u003e\n     * instance to draw the text instead of calling the\n     * \u003ccode\u003edrawString()\u003c/code\u003e method in the \u003ccode\u003eGraphics2D\u003c/code\u003e class.\n     *\n     * @param use  the new flag value.\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, double, float, float)",
      "begin_line": 453,
      "end_line": 456,
      "comment": "\n     * A utility method for drawing rotated text.\n     * \u003cP\u003e\n     * A common rotation is -Math.PI/2 which draws text \u0027vertically\u0027 (with the\n     * top of the characters on the left).\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param angle  the angle of the (clockwise) rotation (in radians).\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, double, float, float)",
      "begin_line": 472,
      "end_line": 499,
      "comment": "\n     * A utility method for drawing rotated text.\n     * \u003cP\u003e\n     * A common rotation is -Math.PI/2 which draws text \u0027vertically\u0027 (with the\n     * top of the characters on the left).\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param textX  the x-coordinate for the text (before rotation).\n     * @param textY  the y-coordinate for the text (before rotation).\n     * @param angle  the angle of the (clockwise) rotation (in radians).\n     * @param rotateX  the point about which the text is rotated.\n     * @param rotateY  the point about which the text is rotated.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 50)",
        "(line 483,col 9)-(line 484,col 41)",
        "(line 485,col 9)-(line 485,col 29)",
        "(line 487,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, float, float)",
      "begin_line": 514,
      "end_line": 524,
      "comment": "\n     * Draws a string that is aligned by one anchor point and rotated about\n     * another anchor point.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate for positioning the text.\n     * @param y  the y-coordinate for positioning the text.\n     * @param textAnchor  the text anchor.\n     * @param angle  the rotation angle.\n     * @param rotationX  the x-coordinate for the rotation anchor point.\n     * @param rotationY  the y-coordinate for the rotation anchor point.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 78)",
        "(line 522,col 9)-(line 523,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.drawRotatedString(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, org.jfree.chart.text.TextAnchor)",
      "begin_line": 538,
      "end_line": 552,
      "comment": "\n     * Draws a string that is aligned by one anchor point and rotated about\n     * another anchor point.\n     *\n     * @param text  the text.\n     * @param g2  the graphics device.\n     * @param x  the x-coordinate for positioning the text.\n     * @param y  the y-coordinate for positioning the text.\n     * @param textAnchor  the text anchor.\n     * @param angle  the rotation angle (in radians).\n     * @param rotationAnchor  the rotation anchor.\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 78)",
        "(line 546,col 9)-(line 547,col 32)",
        "(line 548,col 9)-(line 550,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(java.lang.String, java.awt.Graphics2D, float, float, org.jfree.chart.text.TextAnchor, double, org.jfree.chart.text.TextAnchor)",
      "begin_line": 568,
      "end_line": 584,
      "comment": "\n     * Returns a shape that represents the bounds of the string after the\n     * specified rotation has been applied.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics device.\n     * @param x  the x coordinate for the anchor point.\n     * @param y  the y coordinate for the anchor point.\n     * @param textAnchor  the text anchor.\n     * @param angle  the angle.\n     * @param rotationAnchor  the rotation anchor.\n     *\n     * @return The bounds (possibly \u003ccode\u003enull\u003c/code\u003e).\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 78)",
        "(line 577,col 9)-(line 578,col 32)",
        "(line 579,col 9)-(line 581,col 78)",
        "(line 582,col 9)-(line 582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveTextBoundsAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor)",
      "begin_line": 599,
      "end_line": 673,
      "comment": "\n     * A utility method that calculates the anchor offsets for a string.\n     * Normally, the (x, y) coordinate for drawing text is a point on the\n     * baseline at the left of the text string.  If you add these offsets to\n     * (x, y) and draw the string, then the anchor point should coincide with\n     * the (x, y) point.\n     *\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 38)",
        "(line 603,col 9)-(line 603,col 58)",
        "(line 604,col 9)-(line 604,col 30)",
        "(line 605,col 9)-(line 605,col 46)",
        "(line 606,col 9)-(line 606,col 71)",
        "(line 607,col 9)-(line 607,col 58)",
        "(line 608,col 9)-(line 608,col 43)",
        "(line 609,col 9)-(line 609,col 41)",
        "(line 610,col 9)-(line 610,col 45)",
        "(line 611,col 9)-(line 611,col 45)",
        "(line 612,col 9)-(line 612,col 26)",
        "(line 613,col 9)-(line 613,col 26)",
        "(line 615,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 25)",
        "(line 670,col 9)-(line 670,col 25)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.deriveRotationAnchorOffsets(java.awt.Graphics2D, java.lang.String, org.jfree.chart.text.TextAnchor)",
      "begin_line": 686,
      "end_line": 768,
      "comment": "\n     * A utility method that calculates the rotation anchor offsets for a\n     * string.  These offsets are relative to the text starting coordinate\n     * (BASELINE_LEFT).\n     *\n     * @param g2  the graphics device.\n     * @param text  the text.\n     * @param anchor  the anchor point.\n     *\n     * @return  The offsets.\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 38)",
        "(line 690,col 9)-(line 690,col 58)",
        "(line 691,col 9)-(line 691,col 69)",
        "(line 692,col 9)-(line 692,col 45)",
        "(line 693,col 9)-(line 693,col 71)",
        "(line 694,col 9)-(line 694,col 43)",
        "(line 695,col 9)-(line 695,col 41)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 697,col 45)",
        "(line 698,col 9)-(line 698,col 26)",
        "(line 699,col 9)-(line 699,col 26)",
        "(line 701,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 25)",
        "(line 765,col 9)-(line 765,col 25)",
        "(line 766,col 9)-(line 766,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(java.lang.String, java.awt.Graphics2D, float, float, double, float, float)",
      "begin_line": 785,
      "end_line": 802,
      "comment": "\n     * Returns a shape that represents the bounds of the string after the\n     * specified rotation has been applied.\n     *\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param g2  the graphics device.\n     * @param textX  the x coordinate for the text.\n     * @param textY  the y coordinate for the text.\n     * @param angle  the angle.\n     * @param rotateX  the x coordinate for the rotation point.\n     * @param rotateY  the y coordinate for the rotation point.\n     *\n     * @return The bounds (\u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003etext\u003c/code\u003e is\n     *         \u003c/code\u003enull\u003c/code\u003e or has zero length).\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 792,col 45)",
        "(line 793,col 9)-(line 793,col 71)",
        "(line 794,col 9)-(line 795,col 30)",
        "(line 796,col 9)-(line 796,col 74)",
        "(line 797,col 9)-(line 798,col 41)",
        "(line 799,col 9)-(line 799,col 71)",
        "(line 800,col 9)-(line 800,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.getUseFontMetricsGetStringBounds()",
      "begin_line": 811,
      "end_line": 813,
      "comment": "\n     * Returns the flag that controls whether the FontMetrics.getStringBounds()\n     * method is used or not.  If you are having trouble with label alignment\n     * or positioning, try changing the value of this flag.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.setUseFontMetricsGetStringBounds(boolean)",
      "begin_line": 822,
      "end_line": 824,
      "comment": "\n     * Sets the flag that controls whether the FontMetrics.getStringBounds()\n     * method is used or not.  If you are having trouble with label alignment\n     * or positioning, try changing the value of this flag.\n     *\n     * @param use  the flag.\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.text.TextUtilities.isUseDrawRotatedStringWorkaround()",
      "begin_line": 832,
      "end_line": 834,
      "comment": "\n     * Returns the current value of the\n     * \u003ccode\u003euseDrawRotatedStringWorkaround\u003c/code\u003e flag.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 46)"
      ]
    }
  ]
}