{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYTextAnnotation.java",
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
      "begin_line": 88,
      "end_line": 669,
      "comment": "\r\n * A text annotation that can be placed at a particular (x, y) location on an\r\n * {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_ANCHOR"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The default text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANCHOR"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The default rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANGLE"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The default rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The text anchor (to be aligned with (x, y)). "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAngle"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\r\n     * The background paint (possibly null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineVisible"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\r\n     * The flag that controls the visibility of the outline.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\r\n     * The outline paint (never null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\r\n     * The outline stroke (never null).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.XYTextAnnotation(java.lang.String, double, double)",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\r\n     * Creates a new annotation to be displayed at the given coordinates.  The\r\n     * coordinates are specified in data space (they will be converted to\r\n     * Java2D space for display).\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 25)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 177,col 19)",
        "(line 178,col 9)-(line 178,col 19)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 54)",
        "(line 181,col 9)-(line 181,col 52)",
        "(line 184,col 9)-(line 184,col 36)",
        "(line 185,col 9)-(line 185,col 36)",
        "(line 186,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getText()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setText(java.lang.String)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getFont()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setFont(java.awt.Font)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\r\n     * Sets the font for the annotation.\r\n     *\r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getPaint()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 258,
      "end_line": 263,
      "comment": "\r\n     * Sets the paint for the annotation.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getTextAnchor()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\r\n     * Returns the text anchor.\r\n     *\r\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is\r\n     * aligned to the (x, y) coordinate of the annotation).\r\n     *\r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAnchor()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     *\r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 309,
      "end_line": 314,
      "comment": "\r\n     * Sets the rotation anchor point.\r\n     *\r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 313,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAngle()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\r\n     * Returns the rotation angle.\r\n     *\r\n     * @return The rotation angle.\r\n     *\r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAngle(double)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Sets the rotation angle.  The angle is measured clockwise in radians.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getX()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Returns the x coordinate for the text anchor point (measured against the\r\n     * domain axis).\r\n     *\r\n     * @return The x coordinate (in data space).\r\n     *\r\n     * @see #setX(double)\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setX(double)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\r\n     * Sets the x coordinate for the text anchor point (measured against the\r\n     * domain axis).\r\n     *\r\n     * @param x  the x coordinate (in data space).\r\n     *\r\n     * @see #getX()\r\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getY()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\r\n     * Returns the y coordinate for the text anchor point (measured against the\r\n     * range axis).\r\n     *\r\n     * @return The y coordinate (in data space).\r\n     *\r\n     * @see #setY(double)\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setY(double)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\r\n     * Sets the y coordinate for the text anchor point (measured against the\r\n     * range axis).\r\n     *\r\n     * @param y  the y coordinate.\r\n     *\r\n     * @see #getY()\r\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getBackgroundPaint()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\r\n     * Returns the background paint for the annotation.\r\n     *\r\n     * @return The background paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBackgroundPaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Sets the background paint for the annotation.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBackgroundPaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getOutlinePaint()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns the outline paint for the annotation.\r\n     *\r\n     * @return The outline paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlinePaint(Paint)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlinePaint(java.awt.Paint)",
      "begin_line": 434,
      "end_line": 439,
      "comment": "\r\n     * Sets the outline paint for the annotation.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOutlinePaint()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getOutlineStroke()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\r\n     * Returns the outline stroke for the annotation.\r\n     *\r\n     * @return The outline stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOutlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 463,
      "end_line": 468,
      "comment": "\r\n     * Sets the outline stroke for the annotation.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getOutlineStroke()\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.isOutlineVisible()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\r\n     * Returns the flag that controls whether or not the outline is drawn.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setOutlineVisible(boolean)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\r\n     * Sets the flag that controls whether or not the outline is drawn.\r\n     *\r\n     * @param visible  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 504,
      "end_line": 549,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  an optional info object that will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 60)",
        "(line 510,col 9)-(line 511,col 59)",
        "(line 512,col 9)-(line 513,col 58)",
        "(line 515,col 9)-(line 516,col 46)",
        "(line 517,col 9)-(line 518,col 45)",
        "(line 520,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 30)",
        "(line 527,col 9)-(line 529,col 57)",
        "(line 530,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 32)",
        "(line 535,col 9)-(line 536,col 74)",
        "(line 537,col 9)-(line 541,col 9)",
        "(line 543,col 9)-(line 543,col 42)",
        "(line 544,col 9)-(line 544,col 30)",
        "(line 545,col 9)-(line 547,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.equals(java.lang.Object)",
      "begin_line": 558,
      "end_line": 603,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 55)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.hashCode()",
      "begin_line": 610,
      "end_line": 624,
      "comment": "\r\n     * Returns a hash code for the object.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 611,col 25)",
        "(line 612,col 9)-(line 612,col 43)",
        "(line 613,col 9)-(line 613,col 43)",
        "(line 614,col 9)-(line 614,col 74)",
        "(line 615,col 9)-(line 615,col 52)",
        "(line 616,col 9)-(line 616,col 60)",
        "(line 617,col 9)-(line 617,col 47)",
        "(line 618,col 9)-(line 618,col 60)",
        "(line 619,col 9)-(line 619,col 58)",
        "(line 620,col 9)-(line 620,col 62)",
        "(line 621,col 9)-(line 621,col 59)",
        "(line 622,col 9)-(line 622,col 60)",
        "(line 623,col 9)-(line 623,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.clone()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 644,
      "end_line": 650,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 36)",
        "(line 646,col 9)-(line 646,col 55)",
        "(line 647,col 9)-(line 647,col 65)",
        "(line 648,col 9)-(line 648,col 62)",
        "(line 649,col 9)-(line 649,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 660,
      "end_line": 667,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 35)",
        "(line 663,col 9)-(line 663,col 55)",
        "(line 664,col 9)-(line 664,col 65)",
        "(line 665,col 9)-(line 665,col 62)",
        "(line 666,col 9)-(line 666,col 64)"
      ]
    }
  ]
}