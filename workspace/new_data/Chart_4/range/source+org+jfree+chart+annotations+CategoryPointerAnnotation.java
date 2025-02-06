{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/CategoryPointerAnnotation.java",
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
      "begin_line": 86,
      "end_line": 525,
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
      "begin_line": 179,
      "end_line": 181,
      "comment": "\r\n     * Sets the angle of the arrow.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getAngle()\r\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getTipRadius()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\r\n     * Returns the tip radius.\r\n     *\r\n     * @return The tip radius (in Java2D units).\r\n     *\r\n     * @see #setTipRadius(double)\r\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setTipRadius(double)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\r\n     * Sets the tip radius.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getTipRadius()\r\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getBaseRadius()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\r\n     * Returns the base radius.\r\n     *\r\n     * @return The base radius (in Java2D units).\r\n     *\r\n     * @see #setBaseRadius(double)\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setBaseRadius(double)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\r\n     * Sets the base radius.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getBaseRadius()\r\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getLabelOffset()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the label offset.\r\n     *\r\n     * @return The label offset (in Java2D units).\r\n     *\r\n     * @see #setLabelOffset(double)\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setLabelOffset(double)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Sets the label offset (from the arrow base, continuing in a straight\r\n     * line, in Java2D units).\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowLength()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\r\n     * Returns the arrow length.\r\n     *\r\n     * @return The arrow length.\r\n     *\r\n     * @see #setArrowLength(double)\r\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowLength(double)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Sets the arrow length.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @see #getArrowLength()\r\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowWidth()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the arrow width.\r\n     *\r\n     * @return The arrow width (in Java2D units).\r\n     *\r\n     * @see #setArrowWidth(double)\r\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowWidth(double)",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\r\n     * Sets the arrow width.\r\n     *\r\n     * @param width  the width (in Java2D units).\r\n     *\r\n     * @see #getArrowWidth()\r\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowStroke()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\r\n     * Returns the stroke used to draw the arrow line.\r\n     *\r\n     * @return The arrow stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowStroke(java.awt.Stroke)",
      "begin_line": 312,
      "end_line": 317,
      "comment": "\r\n     * Sets the stroke used to draw the arrow line.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowStroke()\r\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.getArrowPaint()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\r\n     * Returns the paint used for the arrow.\r\n     *\r\n     * @return The arrow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.setArrowPaint(java.awt.Paint)",
      "begin_line": 337,
      "end_line": 342,
      "comment": "\r\n     * Sets the paint used for the arrow.\r\n     *\r\n     * @param paint  the arrow paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowPaint()\r\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 353,
      "end_line": 414,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 60)",
        "(line 357,col 9)-(line 358,col 59)",
        "(line 359,col 9)-(line 360,col 58)",
        "(line 361,col 9)-(line 361,col 52)",
        "(line 362,col 9)-(line 362,col 61)",
        "(line 363,col 9)-(line 363,col 48)",
        "(line 364,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 79)",
        "(line 367,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 70)",
        "(line 373,col 9)-(line 373,col 70)",
        "(line 375,col 9)-(line 375,col 67)",
        "(line 376,col 9)-(line 376,col 67)",
        "(line 378,col 9)-(line 378,col 75)",
        "(line 379,col 9)-(line 379,col 75)",
        "(line 381,col 9)-(line 382,col 69)",
        "(line 383,col 9)-(line 384,col 69)",
        "(line 386,col 9)-(line 387,col 69)",
        "(line 388,col 9)-(line 389,col 69)",
        "(line 391,col 9)-(line 391,col 46)",
        "(line 392,col 9)-(line 392,col 49)",
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 63)",
        "(line 395,col 9)-(line 395,col 26)",
        "(line 397,col 9)-(line 397,col 39)",
        "(line 398,col 9)-(line 398,col 37)",
        "(line 399,col 9)-(line 399,col 68)",
        "(line 400,col 9)-(line 400,col 22)",
        "(line 401,col 9)-(line 401,col 23)",
        "(line 404,col 9)-(line 404,col 30)",
        "(line 405,col 9)-(line 405,col 32)",
        "(line 406,col 9)-(line 407,col 74)",
        "(line 408,col 9)-(line 409,col 74)",
        "(line 410,col 37)-(line 411,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.equals(java.lang.Object)",
      "begin_line": 423,
      "end_line": 460,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 73)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.hashCode()",
      "begin_line": 467,
      "end_line": 484,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 25)",
        "(line 469,col 9)-(line 469,col 56)",
        "(line 470,col 9)-(line 470,col 60)",
        "(line 471,col 9)-(line 471,col 55)",
        "(line 472,col 9)-(line 472,col 60)",
        "(line 473,col 9)-(line 473,col 56)",
        "(line 474,col 9)-(line 474,col 60)",
        "(line 475,col 9)-(line 475,col 57)",
        "(line 476,col 9)-(line 476,col 60)",
        "(line 477,col 9)-(line 477,col 56)",
        "(line 478,col 9)-(line 478,col 60)",
        "(line 479,col 9)-(line 479,col 79)",
        "(line 480,col 9)-(line 480,col 59)",
        "(line 481,col 9)-(line 481,col 57)",
        "(line 482,col 9)-(line 482,col 60)",
        "(line 483,col 9)-(line 483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.clone()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 504,
      "end_line": 508,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 36)",
        "(line 506,col 9)-(line 506,col 60)",
        "(line 507,col 9)-(line 507,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.CategoryPointerAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 518,
      "end_line": 523,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 35)",
        "(line 521,col 9)-(line 521,col 60)",
        "(line 522,col 9)-(line 522,col 62)"
      ]
    }
  ]
}