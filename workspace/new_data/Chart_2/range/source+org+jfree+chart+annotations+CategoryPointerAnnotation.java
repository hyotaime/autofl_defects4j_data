{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/CategoryPointerAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CategoryPointerAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.CategoryTextAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 87,
      "end_line": 540,
      "comment": "\r\n * An arrow and label that can be placed on a {@link CategoryPlot}.  The arrow\r\n * is drawn at a user-definable angle so that it points towards the (category,\r\n * value) location for the annotation.\r\n * \u003cp\u003e\r\n * The arrow length (and its offset from the (category, value) location) is\r\n * controlled by the tip radius and the base radius attributes.  Imagine two\r\n * circles around the (category, value) coordinate: the inner circle defined by\r\n * the tip radius, and the outer circle defined by the base radius.  Now, draw\r\n * the arrow starting at some point on the outer circle (the point is\r\n * determined by the angle), with the arrow tip being drawn at a corresponding\r\n * point on the inner circle.\r\n *\r\n * @since 1.0.3\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIP_RADIUS"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The default tip radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BASE_RADIUS"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The default base radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OFFSET"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The default label offset (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_LENGTH"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The default arrow length (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_WIDTH"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The default arrow width (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The angle of the arrow\u0027s line (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "tipRadius"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\r\n     * The radius from the (x, y) point to the tip of the arrow (in Java2D\r\n     * units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseRadius"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\r\n     * The radius from the (x, y) point to the start of the arrow line (in\r\n     * Java2D units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrowLength"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The length of the arrow head (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowWidth"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The arrow width (in Java2D units, per side). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowStroke"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The arrow stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "arrowPaint"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The arrow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffset"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The radius from the base point to the anchor point for the label. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.CategoryPointerAnnotation(java.lang.String, java.lang.Comparable, double, double)",
      "begin_line": 146,
      "end_line": 159,
      "comment": "\r\n     * Creates a new label and arrow annotation.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param key  the category key.\r\n     * @param value  the y-value (measured against the chart\u0027s range axis).\r\n     * @param angle  the angle of the arrow\u0027s line (in radians).\r\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 27)",
        "(line 151,col 9)-(line 151,col 44)",
        "(line 152,col 9)-(line 152,col 46)",
        "(line 153,col 9)-(line 153,col 48)",
        "(line 154,col 9)-(line 154,col 46)",
        "(line 155,col 9)-(line 155,col 48)",
        "(line 156,col 9)-(line 156,col 49)",
        "(line 157,col 9)-(line 157,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getAngle()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\r\n     * Returns the angle of the arrow.\r\n     *\r\n     * @return The angle (in radians).\r\n     *\r\n     * @see #setAngle(double)\r\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setAngle(double)",
      "begin_line": 180,
      "end_line": 183,
      "comment": "\r\n     * Sets the angle of the arrow and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getAngle()\r\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 27)",
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getTipRadius()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\r\n     * Returns the tip radius.\r\n     *\r\n     * @return The tip radius (in Java2D units).\r\n     *\r\n     * @see #setTipRadius(double)\r\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setTipRadius(double)",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\r\n     * Sets the tip radius and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getTipRadius()\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 32)",
        "(line 206,col 9)-(line 206,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getBaseRadius()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Returns the base radius.\r\n     *\r\n     * @return The base radius (in Java2D units).\r\n     *\r\n     * @see #setBaseRadius(double)\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setBaseRadius(double)",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\r\n     * Sets the base radius and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getBaseRadius()\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 33)",
        "(line 230,col 9)-(line 230,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getLabelOffset()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\r\n     * Returns the label offset.\r\n     *\r\n     * @return The label offset (in Java2D units).\r\n     *\r\n     * @see #setLabelOffset(double)\r\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setLabelOffset(double)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\r\n     * Sets the label offset (from the arrow base, continuing in a straight\r\n     * line, in Java2D units) and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowLength()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\r\n     * Returns the arrow length.\r\n     *\r\n     * @return The arrow length.\r\n     *\r\n     * @see #setArrowLength(double)\r\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowLength(double)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\r\n     * Sets the arrow length and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @see #getArrowLength()\r\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowWidth()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\r\n     * Returns the arrow width.\r\n     *\r\n     * @return The arrow width (in Java2D units).\r\n     *\r\n     * @see #setArrowWidth(double)\r\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowWidth(double)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\r\n     * Sets the arrow width and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param width  the width (in Java2D units).\r\n     *\r\n     * @see #getArrowWidth()\r\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 32)",
        "(line 302,col 9)-(line 302,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowStroke()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\r\n     * Returns the stroke used to draw the arrow line.\r\n     *\r\n     * @return The arrow stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowStroke(java.awt.Stroke)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\r\n     * Sets the stroke used to draw the arrow line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowStroke()\r\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 34)",
        "(line 329,col 9)-(line 329,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowPaint()",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\r\n     * Returns the paint used for the arrow.\r\n     *\r\n     * @return The arrow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowPaint(java.awt.Paint)",
      "begin_line": 351,
      "end_line": 357,
      "comment": "\r\n     * Sets the paint used for the arrow and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the arrow paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowPaint()\r\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 32)",
        "(line 356,col 9)-(line 356,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 368,
      "end_line": 429,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 60)",
        "(line 372,col 9)-(line 373,col 59)",
        "(line 374,col 9)-(line 375,col 58)",
        "(line 376,col 9)-(line 376,col 52)",
        "(line 377,col 9)-(line 377,col 61)",
        "(line 378,col 9)-(line 378,col 48)",
        "(line 379,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 381,col 79)",
        "(line 382,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 70)",
        "(line 388,col 9)-(line 388,col 70)",
        "(line 390,col 9)-(line 390,col 67)",
        "(line 391,col 9)-(line 391,col 67)",
        "(line 393,col 9)-(line 393,col 75)",
        "(line 394,col 9)-(line 394,col 75)",
        "(line 396,col 9)-(line 397,col 69)",
        "(line 398,col 9)-(line 399,col 69)",
        "(line 401,col 9)-(line 402,col 69)",
        "(line 403,col 9)-(line 404,col 69)",
        "(line 406,col 9)-(line 406,col 46)",
        "(line 407,col 9)-(line 407,col 49)",
        "(line 408,col 9)-(line 408,col 61)",
        "(line 409,col 9)-(line 409,col 63)",
        "(line 410,col 9)-(line 410,col 26)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 37)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 415,col 9)-(line 415,col 22)",
        "(line 416,col 9)-(line 416,col 23)",
        "(line 419,col 9)-(line 419,col 30)",
        "(line 420,col 9)-(line 420,col 32)",
        "(line 421,col 9)-(line 422,col 74)",
        "(line 423,col 9)-(line 424,col 74)",
        "(line 425,col 37)-(line 426,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.equals(java.lang.Object)",
      "begin_line": 438,
      "end_line": 475,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 449,col 73)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.hashCode()",
      "begin_line": 482,
      "end_line": 499,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 25)",
        "(line 484,col 9)-(line 484,col 56)",
        "(line 485,col 9)-(line 485,col 60)",
        "(line 486,col 9)-(line 486,col 55)",
        "(line 487,col 9)-(line 487,col 60)",
        "(line 488,col 9)-(line 488,col 56)",
        "(line 489,col 9)-(line 489,col 60)",
        "(line 490,col 9)-(line 490,col 57)",
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 56)",
        "(line 493,col 9)-(line 493,col 60)",
        "(line 494,col 9)-(line 494,col 79)",
        "(line 495,col 9)-(line 495,col 59)",
        "(line 496,col 9)-(line 496,col 57)",
        "(line 497,col 9)-(line 497,col 60)",
        "(line 498,col 9)-(line 498,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.clone()",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 519,
      "end_line": 523,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 36)",
        "(line 521,col 9)-(line 521,col 60)",
        "(line 522,col 9)-(line 522,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 533,
      "end_line": 538,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 35)",
        "(line 536,col 9)-(line 536,col 60)",
        "(line 537,col 9)-(line 537,col 62)"
      ]
    }
  ]
}