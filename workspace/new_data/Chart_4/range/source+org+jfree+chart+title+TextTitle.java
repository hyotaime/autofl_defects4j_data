{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/title/TextTitle.java",
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
      "begin_line": 126,
      "end_line": 924,
      "comment": "\r\n * A chart title that displays a text string with automatic wrapping as\r\n * required.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 133,
      "end_line": 134,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_PAINT"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The default text color. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The title text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The font used to display the title. "
    },
    {
      "type": "field",
      "varNames": [
        "textAlignment"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The text alignment. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The paint used to display the title text. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The background paint. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipText"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The tool tip text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "urlText"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The URL text (can be \u003ccode\u003enull\u003c/code\u003e). "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The content. "
    },
    {
      "type": "field",
      "varNames": [
        "expandToFitSpace"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": "\r\n     * A flag that controls whether the title expands to fit the available\r\n     * space..\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumLinesToDisplay"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\r\n     * The maximum number of lines to display.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String)",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String, java.awt.Font)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\r\n     * Creates a new title, using default attributes where necessary.\r\n     *\r\n     * @param text  the title text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the title font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.title.TextTitle.TextTitle(java.lang.String, java.awt.Font, java.awt.Paint, org.jfree.chart.util.RectangleEdge, org.jfree.chart.util.HorizontalAlignment, org.jfree.chart.util.VerticalAlignment, org.jfree.chart.util.RectangleInsets)",
      "begin_line": 219,
      "end_line": 248,
      "comment": "\r\n     * Creates a new title.\r\n     *\r\n     * @param text  the text for the title (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param font  the title font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param paint  the title paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param position  the title position (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param horizontalAlignment  the horizontal alignment (\u003ccode\u003enull\u003c/code\u003e\r\n     *                             not permitted).\r\n     * @param verticalAlignment  the vertical alignment (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                           permitted).\r\n     * @param padding  the space to leave around the outside of the title.\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 73)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 25)",
        "(line 237,col 9)-(line 237,col 25)",
        "(line 238,col 9)-(line 238,col 27)",
        "(line 242,col 9)-(line 242,col 49)",
        "(line 243,col 9)-(line 243,col 36)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 245,col 32)",
        "(line 246,col 9)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getText()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the title text.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setText(java.lang.String)",
      "begin_line": 267,
      "end_line": 275,
      "comment": "\r\n     * Sets the title to the specified text and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getTextAlignment()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\r\n     * Returns the text alignment.  This controls how the text is aligned\r\n     * within the title\u0027s bounds, whereas the title\u0027s horizontal alignment\r\n     * controls how the title\u0027s bounding rectangle is aligned within the\r\n     * drawing space.\r\n     *\r\n     * @return The text alignment.\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setTextAlignment(org.jfree.chart.util.HorizontalAlignment)",
      "begin_line": 295,
      "end_line": 301,
      "comment": "\r\n     * Sets the text alignment and sends a {@link TitleChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param alignment  the alignment (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 39)",
        "(line 300,col 9)-(line 300,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getFont()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the font used to display the title string.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setFont(java.awt.Font)",
      "begin_line": 322,
      "end_line": 330,
      "comment": "\r\n     * Sets the font used to display the title string.  Registered listeners\r\n     * are notified that the title has been modified.\r\n     *\r\n     * @param font  the new font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getPaint()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\r\n     * Returns the paint used to display the title string.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setPaint(java.awt.Paint)",
      "begin_line": 351,
      "end_line": 359,
      "comment": "\r\n     * Sets the paint used to display the title string.  Registered listeners\r\n     * are notified that the title has been modified.\r\n     *\r\n     * @param paint  the new paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getBackgroundPaint()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\r\n     * Returns the background paint.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 377,
      "end_line": 380,
      "comment": "\r\n     * Sets the background paint and sends a {@link TitleChangeEvent} to all\r\n     * registered listeners.  If you set this attribute to \u003ccode\u003enull\u003c/code\u003e,\r\n     * no background is painted (which makes the title background transparent).\r\n     *\r\n     * @param paint  the background paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 379,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getToolTipText()",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\r\n     * Returns the tool tip text.\r\n     *\r\n     * @return The tool tip text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setToolTipText(java.lang.String)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Sets the tool tip text to the specified text and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 32)",
        "(line 399,col 9)-(line 399,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getURLText()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\r\n     * Returns the URL text.\r\n     *\r\n     * @return The URL text (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setURLText(java.lang.String)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\r\n     * Sets the URL text to the specified text and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 28)",
        "(line 419,col 9)-(line 419,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getExpandToFitSpace()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\r\n     * Returns the flag that controls whether or not the title expands to fit\r\n     * the available space.\r\n     *\r\n     * @return The flag.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setExpandToFitSpace(boolean)",
      "begin_line": 439,
      "end_line": 442,
      "comment": "\r\n     * Sets the flag that controls whether the title expands to fit the\r\n     * available space, and sends a {@link TitleChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param expand  the flag.\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 39)",
        "(line 441,col 9)-(line 441,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.getMaximumLinesToDisplay()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\r\n     * Returns the maximum number of lines to display.\r\n     *\r\n     * @return The maximum.\r\n     *\r\n     * @since 1.0.10\r\n     *\r\n     * @see #setMaximumLinesToDisplay(int)\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.setMaximumLinesToDisplay(int)",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\r\n     * Sets the maximum number of lines to display and sends a\r\n     * {@link TitleChangeEvent} to all registered listeners.\r\n     *\r\n     * @param max  the maximum.\r\n     *\r\n     * @since 1.0.10.\r\n     *\r\n     * @see #getMaximumLinesToDisplay()\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 41)",
        "(line 469,col 9)-(line 469,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrange(java.awt.Graphics2D, org.jfree.chart.block.RectangleConstraint)",
      "begin_line": 481,
      "end_line": 522,
      "comment": "\r\n     * Arranges the contents of the block, within the given constraints, and\r\n     * returns the block size.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param constraint  the constraint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The block size (in Java2D units, never \u003ccode\u003enull\u003c/code\u003e).\r\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 65)",
        "(line 483,col 9)-(line 483,col 61)",
        "(line 484,col 9)-(line 484,col 62)",
        "(line 485,col 9)-(line 485,col 34)",
        "(line 486,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 521,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrangeNN(java.awt.Graphics2D)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "\r\n     * Arranges the content for this title assuming no bounds on the width\r\n     * or the height, and returns the required size.  This will reflect the\r\n     * fact that a text title positioned on the left or right of a chart will\r\n     * be rotated by 90 degrees.\r\n     *\r\n     * @param g2  the graphics target.\r\n     *\r\n     * @return The content size.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 52)",
        "(line 538,col 9)-(line 538,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrangeFN(java.awt.Graphics2D, double)",
      "begin_line": 554,
      "end_line": 592,
      "comment": "\r\n     * Arranges the content for this title assuming a fixed width and no bounds\r\n     * on the height, and returns the required size.  This will reflect the\r\n     * fact that a text title positioned on the left or right of a chart will\r\n     * be rotated by 90 degrees.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param w  the width.\r\n     *\r\n     * @return The content size.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 47)",
        "(line 556,col 9)-(line 591,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrangeRN(java.awt.Graphics2D, org.jfree.data.Range)",
      "begin_line": 607,
      "end_line": 614,
      "comment": "\r\n     * Arranges the content for this title assuming a range constraint for the\r\n     * width and no bounds on the height, and returns the required size.  This\r\n     * will reflect the fact that a text title positioned on the left or right\r\n     * of a chart will be rotated by 90 degrees.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param widthRange  the range for the width.\r\n     *\r\n     * @return The content size.\r\n     *\r\n     * @since 1.0.9\r\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 33)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 612,col 55)",
        "(line 613,col 9)-(line 613,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.arrangeRR(java.awt.Graphics2D, org.jfree.data.Range, org.jfree.data.Range)",
      "begin_line": 627,
      "end_line": 666,
      "comment": "\r\n     * Returns the content size for the title.  This will reflect the fact that\r\n     * a text title positioned on the left or right of a chart will be rotated\r\n     * 90 degrees.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param widthRange  the width range.\r\n     * @param heightRange  the height range.\r\n     *\r\n     * @return The content size.\r\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 47)",
        "(line 630,col 9)-(line 665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\r\n     * Draws the title on a Java 2D graphics device (such as the screen or a\r\n     * printer).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area allocated for the title.\r\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.lang.Object)",
      "begin_line": 691,
      "end_line": 729,
      "comment": "\r\n     * Draws the block within the specified area.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * @param params  if this is an instance of {@link EntityBlockParams} it\r\n     *                is used to determine whether or not an\r\n     *                {@link EntityCollection} is returned by this method.\r\n     *\r\n     * @return An {@link EntityCollection} containing a chart entity for the\r\n     *         title, or \u003ccode\u003enull\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 695,col 32)",
        "(line 696,col 9)-(line 696,col 29)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 34)",
        "(line 701,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 32)",
        "(line 709,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 33)",
        "(line 714,col 9)-(line 714,col 47)",
        "(line 715,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 47)",
        "(line 723,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.drawHorizontal(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 739,
      "end_line": 776,
      "comment": "\r\n     * Draws a the title horizontally within the specified area.  This method\r\n     * will be called from the {@link #draw(Graphics2D, Rectangle2D) draw}\r\n     * method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area for the title.\r\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 59)",
        "(line 741,col 9)-(line 741,col 30)",
        "(line 742,col 9)-(line 742,col 32)",
        "(line 743,col 9)-(line 743,col 38)",
        "(line 744,col 9)-(line 744,col 23)",
        "(line 745,col 9)-(line 745,col 75)",
        "(line 746,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 23)",
        "(line 759,col 9)-(line 759,col 47)",
        "(line 760,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.drawVertical(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 786,
      "end_line": 823,
      "comment": "\r\n     * Draws a the title vertically within the specified area.  This method\r\n     * will be called from the {@link #draw(Graphics2D, Rectangle2D) draw}\r\n     * method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area for the title.\r\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 59)",
        "(line 788,col 9)-(line 788,col 30)",
        "(line 789,col 9)-(line 789,col 32)",
        "(line 790,col 9)-(line 790,col 38)",
        "(line 791,col 9)-(line 791,col 23)",
        "(line 792,col 9)-(line 792,col 69)",
        "(line 793,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 23)",
        "(line 806,col 9)-(line 806,col 47)",
        "(line 807,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.equals(java.lang.Object)",
      "begin_line": 832,
      "end_line": 868,
      "comment": "\r\n     * Tests this title for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 41)",
        "(line 840,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 857,col 9)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.hashCode()",
      "begin_line": 875,
      "end_line": 883,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 38)",
        "(line 877,col 9)-(line 877,col 78)",
        "(line 878,col 9)-(line 878,col 78)",
        "(line 879,col 9)-(line 879,col 80)",
        "(line 880,col 9)-(line 881,col 55)",
        "(line 882,col 9)-(line 882,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.clone()",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\r\n     * Returns a clone of this object.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException never.\r\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 903,
      "end_line": 907,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 36)",
        "(line 905,col 9)-(line 905,col 55)",
        "(line 906,col 9)-(line 906,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.title.TextTitle.readObject(java.io.ObjectInputStream)",
      "begin_line": 917,
      "end_line": 922,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 35)",
        "(line 920,col 9)-(line 920,col 55)",
        "(line 921,col 9)-(line 921,col 65)"
      ]
    }
  ]
}