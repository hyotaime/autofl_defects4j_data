{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/title/TextTitle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TextTitle",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.title.Title",
        "java.io.Serializable",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 119,
      "end_line": 778,
      "comment": "\r\n * A chart title that displays a text string with automatic wrapping as \r\n * required.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 126,
      "end_line": 127,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_PAINT"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The default text color. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The title text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The font used to display the title. "
    },
    {
      "type": "field",
      "varNames": [
        "textAlignment"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The text alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The paint used to display the title text. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The tool tip text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The URL text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The content. "
    },
    {
      "type": "field",
      "varNames": [
        "expandToFitSpace"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " \r\n     * A flag that controls whether the title expands to fit the available\r\n     * space..\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String, java.awt.Font)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the title font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String, java.awt.Font, java.awt.Paint, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 205,
      "end_line": 234,
      "comment": "\r\n     * Creates a new title.\r\n     *\r\n     * @param text  the text for the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the title font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the title paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param position  the title position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param horizontalAlignment  the horizontal alignment (\u003ccode\u003enull\u003c/code\u003e \r\n     *                             not permitted).\r\n     * @param verticalAlignment  the vertical alignment (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                           permitted).\r\n     * @param padding  the space to leave around the outside of the title.\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 73)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 223,col 25)",
        "(line 224,col 9)-(line 224,col 27)",
        "(line 228,col 9)-(line 228,col 49)",
        "(line 229,col 9)-(line 229,col 36)",
        "(line 230,col 9)-(line 230,col 28)",
        "(line 231,col 9)-(line 231,col 32)",
        "(line 232,col 9)-(line 232,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getText()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the title text.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setText(java.lang.String)",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\r\n     * Sets the title to the specified text and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getTextAlignment()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\r\n     * Returns the text alignment.  This controls how the text is aligned \r\n     * within the title\u0027s bounds, whereas the title\u0027s horizontal alignment\r\n     * controls how the title\u0027s bounding rectangle is aligned within the \r\n     * drawing space.\r\n     * \r\n     * @return The text alignment.\r\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setTextAlignment(org.jfree.chart.util.HorizontalAlignment)",
      "begin_line": 280,
      "end_line": 286,
      "comment": "\r\n     * Sets the text alignment.\r\n     * \r\n     * @param alignment  the alignment (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 39)",
        "(line 285,col 9)-(line 285,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getFont()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Returns the font used to display the title string.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setFont(java.awt.Font)",
      "begin_line": 307,
      "end_line": 315,
      "comment": "\r\n     * Sets the font used to display the title string.  Registered listeners \r\n     * are notified that the title has been modified.\r\n     *\r\n     * @param font  the new font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getPaint()",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\r\n     * Returns the paint used to display the title string.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setPaint(java.awt.Paint)",
      "begin_line": 336,
      "end_line": 344,
      "comment": "\r\n     * Sets the paint used to display the title string.  Registered listeners \r\n     * are notified that the title has been modified.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getBackgroundPaint()",
      "begin_line": 351,
      "end_line": 353,
      "comment": "\r\n     * Returns the background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 362,
      "end_line": 365,
      "comment": "\r\n     * Sets the background paint and sends a {@link TitleChangeEvent} to all \r\n     * registered listeners.  If you set this attribute to \u003ccode\u003enull\u003c/code\u003e, \r\n     * no background is painted (which makes the title background transparent).\r\n     *\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 37)",
        "(line 364,col 9)-(line 364,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getToolTipText()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\r\n     * Returns the tool tip text.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setToolTipText(java.lang.String)",
      "begin_line": 382,
      "end_line": 385,
      "comment": "\r\n     * Sets the tool tip text to the specified text and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 32)",
        "(line 384,col 9)-(line 384,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getURLText()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\r\n     * Returns the URL text.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setURLText(java.lang.String)",
      "begin_line": 402,
      "end_line": 405,
      "comment": "\r\n     * Sets the URL text to the specified text and sends a \r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 28)",
        "(line 404,col 9)-(line 404,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getExpandToFitSpace()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\r\n     * Returns the flag that controls whether or not the title expands to fit\r\n     * the available space.\r\n     * \r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setExpandToFitSpace(boolean)",
      "begin_line": 424,
      "end_line": 427,
      "comment": "\r\n     * Sets the flag that controls whether the title expands to fit the \r\n     * available space, and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     * \r\n     * @param expand  the flag.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 39)",
        "(line 426,col 9)-(line 426,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 438,
      "end_line": 479,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and \r\n     * returns the block size.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 65)",
        "(line 440,col 9)-(line 440,col 61)",
        "(line 441,col 9)-(line 441,col 62)",
        "(line 442,col 9)-(line 442,col 34)",
        "(line 443,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 478,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrangeRR(java.awt.Graphics2D, org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 492,
      "end_line": 529,
      "comment": "\r\n     * Returns the content size for the title.  This will reflect the fact that\r\n     * a text title positioned on the left or right of a chart will be rotated\r\n     * 90 degrees.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param widthRange  the width range.\r\n     * @param heightRange  the height range.\r\n     * \r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 47)",
        "(line 495,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a \r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title.\r\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 554,
      "end_line": 591,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  if this is an instance of {@link EntityBlockParams} it\r\n     *                is used to determine whether or not an \r\n     *                {@link EntityCollection} is returned by this method.\r\n     * \r\n     * @return An {@link EntityCollection} containing a chart entity for the\r\n     *         title, or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 32)",
        "(line 559,col 9)-(line 559,col 29)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 34)",
        "(line 564,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 32)",
        "(line 571,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 33)",
        "(line 576,col 9)-(line 576,col 47)",
        "(line 577,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 47)",
        "(line 585,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.drawHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 601,
      "end_line": 638,
      "comment": "\r\n     * Draws a the title horizontally within the specified area.  This method \r\n     * will be called from the {@link #draw(Graphics2D, Rectangle2D) draw} \r\n     * method.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area for the title.\r\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 59)",
        "(line 603,col 9)-(line 603,col 30)",
        "(line 604,col 9)-(line 604,col 32)",
        "(line 605,col 9)-(line 605,col 38)",
        "(line 606,col 9)-(line 606,col 23)",
        "(line 607,col 9)-(line 607,col 75)",
        "(line 608,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 23)",
        "(line 621,col 9)-(line 621,col 47)",
        "(line 622,col 9)-(line 636,col 9)",
        "(line 637,col 9)-(line 637,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.drawVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 648,
      "end_line": 685,
      "comment": "\r\n     * Draws a the title vertically within the specified area.  This method \r\n     * will be called from the {@link #draw(Graphics2D, Rectangle2D) draw} \r\n     * method.\r\n     * \r\n     * @param g2  the graphics device.\r\n     * @param area  the area for the title.\r\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 59)",
        "(line 650,col 9)-(line 650,col 30)",
        "(line 651,col 9)-(line 651,col 32)",
        "(line 652,col 9)-(line 652,col 38)",
        "(line 653,col 9)-(line 653,col 23)",
        "(line 654,col 9)-(line 654,col 69)",
        "(line 655,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 23)",
        "(line 668,col 9)-(line 668,col 47)",
        "(line 669,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.equals(java.lang.Object)",
      "begin_line": 694,
      "end_line": 721,
      "comment": "\r\n     * Tests this title for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 704,col 41)",
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.hashCode()",
      "begin_line": 728,
      "end_line": 736,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 38)",
        "(line 730,col 9)-(line 730,col 78)",
        "(line 731,col 9)-(line 731,col 78)",
        "(line 732,col 9)-(line 732,col 80)",
        "(line 733,col 9)-(line 734,col 55)",
        "(line 735,col 9)-(line 735,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.clone()",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\r\n     * Returns a clone of this object.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException never.\r\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 756,
      "end_line": 760,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 36)",
        "(line 758,col 9)-(line 758,col 55)",
        "(line 759,col 9)-(line 759,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.readObject(java.io.ObjectInputStream)",
      "begin_line": 770,
      "end_line": 776,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 35)",
        "(line 774,col 9)-(line 774,col 55)",
        "(line 775,col 9)-(line 775,col 65)"
      ]
    }
  ]
}