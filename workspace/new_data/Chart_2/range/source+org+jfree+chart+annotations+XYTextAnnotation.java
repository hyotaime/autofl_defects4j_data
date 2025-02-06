{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYTextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYTextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 89,
      "end_line": 693,
      "comment": "\r\n * A text annotation that can be placed at a particular (x, y) location on an\r\n * {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_ANCHOR"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The default text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANCHOR"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The default rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANGLE"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The default rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The text anchor (to be aligned with (x, y)). "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAngle"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\r\n     * The background paint (possibly null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\r\n     * The flag that controls the visibility of the outline.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\r\n     * The outline paint (never null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\r\n     * The outline stroke (never null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.XYTextAnnotation(java.lang.String, double, double)",
      "begin_line": 171,
      "end_line": 190,
      "comment": "\r\n     * Creates a new annotation to be displayed at the given coordinates.  The\r\n     * coordinates are specified in data space (they will be converted to\r\n     * Java2D space for display).\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 16)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 25)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 19)",
        "(line 180,col 9)-(line 180,col 19)",
        "(line 181,col 9)-(line 181,col 46)",
        "(line 182,col 9)-(line 182,col 54)",
        "(line 183,col 9)-(line 183,col 52)",
        "(line 186,col 9)-(line 186,col 36)",
        "(line 187,col 9)-(line 187,col 36)",
        "(line 188,col 9)-(line 188,col 40)",
        "(line 189,col 9)-(line 189,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getText()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setText(java.lang.String)",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getFont()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setFont(java.awt.Font)",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\r\n     * Sets the font for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 25)",
        "(line 241,col 9)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getPaint()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\r\n     * Sets the paint for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 268,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getTextAnchor()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\r\n     * Returns the text anchor.\r\n     *\r\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 291,
      "end_line": 297,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is\r\n     * aligned to the (x, y) coordinate of the annotation) and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 296,col 9)-(line 296,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAnchor()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     *\r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 318,
      "end_line": 324,
      "comment": "\r\n     * Sets the rotation anchor point and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 37)",
        "(line 323,col 9)-(line 323,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAngle()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Returns the rotation angle.\r\n     *\r\n     * @return The rotation angle.\r\n     *\r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAngle(double)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\r\n     * Sets the rotation angle and sends an {@link AnnotationChangeEvent} to\r\n     * all registered listeners.  The angle is measured clockwise in radians.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 35)",
        "(line 347,col 9)-(line 347,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getX()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Returns the x coordinate for the text anchor point (measured against the\r\n     * domain axis).\r\n     *\r\n     * @return The x coordinate (in data space).\r\n     *\r\n     * @see #setX(double)\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setX(double)",
      "begin_line": 371,
      "end_line": 374,
      "comment": "\r\n     * Sets the x coordinate for the text anchor point (measured against the\r\n     * domain axis) and sends an {@link AnnotationChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param x  the x coordinate (in data space).\r\n     *\r\n     * @see #getX()\r\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 19)",
        "(line 373,col 9)-(line 373,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getY()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\r\n     * Returns the y coordinate for the text anchor point (measured against the\r\n     * range axis).\r\n     *\r\n     * @return The y coordinate (in data space).\r\n     *\r\n     * @see #setY(double)\r\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setY(double)",
      "begin_line": 397,
      "end_line": 400,
      "comment": "\r\n     * Sets the y coordinate for the text anchor point (measured against the\r\n     * range axis) and sends an {@link AnnotationChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param y  the y coordinate.\r\n     *\r\n     * @see #getY()\r\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 19)",
        "(line 399,col 9)-(line 399,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getBackgroundPaint()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\r\n     * Returns the background paint for the annotation.\r\n     *\r\n     * @return The background paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundPaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 425,
      "end_line": 428,
      "comment": "\r\n     * Sets the background paint for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 37)",
        "(line 427,col 9)-(line 427,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getOutlinePaint()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\r\n     * Returns the outline paint for the annotation.\r\n     *\r\n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlinePaint(java.awt.Paint)",
      "begin_line": 453,
      "end_line": 459,
      "comment": "\r\n     * Sets the outline paint for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOutlinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 458,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getOutlineStroke()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\r\n     * Returns the outline stroke for the annotation.\r\n     *\r\n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 484,
      "end_line": 490,
      "comment": "\r\n     * Sets the outline stroke for the annotation and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 36)",
        "(line 489,col 9)-(line 489,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.isOutlineVisible()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlineVisible(boolean)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn and\r\n     * sends an {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 38)",
        "(line 513,col 9)-(line 513,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 528,
      "end_line": 573,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  an optional info object that will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 60)",
        "(line 534,col 9)-(line 535,col 59)",
        "(line 536,col 9)-(line 537,col 58)",
        "(line 539,col 9)-(line 540,col 46)",
        "(line 541,col 9)-(line 542,col 45)",
        "(line 544,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 550,col 30)",
        "(line 551,col 9)-(line 553,col 57)",
        "(line 554,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 32)",
        "(line 559,col 9)-(line 560,col 74)",
        "(line 561,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 567,col 42)",
        "(line 568,col 9)-(line 568,col 30)",
        "(line 569,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.equals(java.lang.Object)",
      "begin_line": 582,
      "end_line": 627,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 55)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 607,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.hashCode()",
      "begin_line": 634,
      "end_line": 648,
      "comment": "\r\n     * Returns a hash code for the object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 25)",
        "(line 636,col 9)-(line 636,col 43)",
        "(line 637,col 9)-(line 637,col 43)",
        "(line 638,col 9)-(line 638,col 74)",
        "(line 639,col 9)-(line 639,col 52)",
        "(line 640,col 9)-(line 640,col 60)",
        "(line 641,col 9)-(line 641,col 47)",
        "(line 642,col 9)-(line 642,col 60)",
        "(line 643,col 9)-(line 643,col 58)",
        "(line 644,col 9)-(line 644,col 62)",
        "(line 645,col 9)-(line 645,col 59)",
        "(line 646,col 9)-(line 646,col 60)",
        "(line 647,col 9)-(line 647,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.clone()",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 668,
      "end_line": 674,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 36)",
        "(line 670,col 9)-(line 670,col 55)",
        "(line 671,col 9)-(line 671,col 65)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 673,col 9)-(line 673,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 684,
      "end_line": 691,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 35)",
        "(line 687,col 9)-(line 687,col 55)",
        "(line 688,col 9)-(line 688,col 65)",
        "(line 689,col 9)-(line 689,col 62)",
        "(line 690,col 9)-(line 690,col 64)"
      ]
    }
  ]
}