{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/annotations/XYPointerAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPointerAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.XYTextAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 96,
      "end_line": 563,
      "comment": "\r\n * An arrow and label that can be placed on an {@link XYPlot}.  The arrow is\r\n * drawn at a user-definable angle so that it points towards the (x, y)\r\n * location for the annotation.\r\n * \u003cp\u003e\r\n * The arrow length (and its offset from the (x, y) location) is controlled by\r\n * the tip radius and the base radius attributes.  Imagine two circles around\r\n * the (x, y) coordinate: the inner circle defined by the tip radius, and the\r\n * outer circle defined by the base radius.  Now, draw the arrow starting at\r\n * some point on the outer circle (the point is determined by the angle), with\r\n * the arrow tip being drawn at a corresponding point on the inner circle.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIP_RADIUS"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The default tip radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BASE_RADIUS"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The default base radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OFFSET"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The default label offset (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_LENGTH"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The default arrow length (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_WIDTH"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The default arrow width (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The angle of the arrow\u0027s line (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "tipRadius"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\r\n     * The radius from the (x, y) point to the tip of the arrow (in Java2D\r\n     * units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseRadius"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\r\n     * The radius from the (x, y) point to the start of the arrow line (in\r\n     * Java2D units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrowLength"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The length of the arrow head (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowWidth"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The arrow width (in Java2D units, per side). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowStroke"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The arrow stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "arrowPaint"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The arrow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffset"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The radius from the base point to the anchor point for the label. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.XYPointerAnnotation(java.lang.String, double, double, double)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "\r\n     * Creates a new label and arrow annotation.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param x  the x-coordinate (measured against the chart\u0027s domain axis).\r\n     * @param y  the y-coordinate (measured against the chart\u0027s range axis).\r\n     * @param angle  the angle of the arrow\u0027s line (in radians).\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 27)",
        "(line 158,col 9)-(line 158,col 27)",
        "(line 159,col 9)-(line 159,col 44)",
        "(line 160,col 9)-(line 160,col 46)",
        "(line 161,col 9)-(line 161,col 48)",
        "(line 162,col 9)-(line 162,col 46)",
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 165,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getAngle()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns the angle of the arrow.\r\n     *\r\n     * @return The angle (in radians).\r\n     *\r\n     * @see #setAngle(double)\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setAngle(double)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\r\n     * Sets the angle of the arrow and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getAngle()\r\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 27)",
        "(line 190,col 9)-(line 190,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getTipRadius()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the tip radius.\r\n     *\r\n     * @return The tip radius (in Java2D units).\r\n     *\r\n     * @see #setTipRadius(double)\r\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setTipRadius(double)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\r\n     * Sets the tip radius and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getTipRadius()\r\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 32)",
        "(line 214,col 9)-(line 214,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getBaseRadius()",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\r\n     * Returns the base radius.\r\n     *\r\n     * @return The base radius (in Java2D units).\r\n     *\r\n     * @see #setBaseRadius(double)\r\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setBaseRadius(double)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\r\n     * Sets the base radius and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getBaseRadius()\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 33)",
        "(line 238,col 9)-(line 238,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getLabelOffset()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\r\n     * Returns the label offset.\r\n     *\r\n     * @return The label offset (in Java2D units).\r\n     *\r\n     * @see #setLabelOffset(double)\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setLabelOffset(double)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\r\n     * Sets the label offset (from the arrow base, continuing in a straight\r\n     * line, in Java2D units) and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 34)",
        "(line 263,col 9)-(line 263,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowLength()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Returns the arrow length.\r\n     *\r\n     * @return The arrow length.\r\n     *\r\n     * @see #setArrowLength(double)\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowLength(double)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\r\n     * Sets the arrow length and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @see #getArrowLength()\r\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 34)",
        "(line 287,col 9)-(line 287,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowWidth()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Returns the arrow width.\r\n     *\r\n     * @return The arrow width (in Java2D units).\r\n     *\r\n     * @see #setArrowWidth(double)\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowWidth(double)",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\r\n     * Sets the arrow width and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param width  the width (in Java2D units).\r\n     *\r\n     * @see #getArrowWidth()\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowStroke()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\r\n     * Returns the stroke used to draw the arrow line.\r\n     *\r\n     * @return The arrow stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowStroke(java.awt.Stroke)",
      "begin_line": 333,
      "end_line": 339,
      "comment": "\r\n     * Sets the stroke used to draw the arrow line and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowStroke()\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 34)",
        "(line 338,col 9)-(line 338,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowPaint()",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\r\n     * Returns the paint used for the arrow.\r\n     *\r\n     * @return The arrow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowPaint(java.awt.Paint)",
      "begin_line": 360,
      "end_line": 366,
      "comment": "\r\n     * Sets the paint used for the arrow and sends an\r\n     * {@link AnnotationChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the arrow paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowPaint()\r\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 32)",
        "(line 365,col 9)-(line 365,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 379,
      "end_line": 456,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 60)",
        "(line 385,col 9)-(line 386,col 59)",
        "(line 387,col 9)-(line 388,col 58)",
        "(line 389,col 9)-(line 389,col 77)",
        "(line 390,col 9)-(line 390,col 75)",
        "(line 391,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 70)",
        "(line 397,col 9)-(line 397,col 70)",
        "(line 399,col 9)-(line 399,col 67)",
        "(line 400,col 9)-(line 400,col 67)",
        "(line 402,col 9)-(line 402,col 75)",
        "(line 403,col 9)-(line 403,col 75)",
        "(line 405,col 9)-(line 406,col 73)",
        "(line 407,col 9)-(line 408,col 73)",
        "(line 410,col 9)-(line 411,col 73)",
        "(line 412,col 9)-(line 413,col 73)",
        "(line 415,col 9)-(line 415,col 46)",
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 61)",
        "(line 418,col 9)-(line 418,col 63)",
        "(line 419,col 9)-(line 419,col 26)",
        "(line 421,col 9)-(line 421,col 39)",
        "(line 422,col 9)-(line 422,col 37)",
        "(line 423,col 9)-(line 423,col 80)",
        "(line 424,col 9)-(line 424,col 22)",
        "(line 425,col 9)-(line 425,col 23)",
        "(line 428,col 9)-(line 429,col 36)",
        "(line 430,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 30)",
        "(line 433,col 9)-(line 435,col 57)",
        "(line 436,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 32)",
        "(line 441,col 9)-(line 443,col 37)",
        "(line 444,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 42)",
        "(line 451,col 9)-(line 451,col 30)",
        "(line 452,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.equals(java.lang.Object)",
      "begin_line": 465,
      "end_line": 498,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 61)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.hashCode()",
      "begin_line": 505,
      "end_line": 522,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 38)",
        "(line 507,col 9)-(line 507,col 56)",
        "(line 508,col 9)-(line 508,col 60)",
        "(line 509,col 9)-(line 509,col 55)",
        "(line 510,col 9)-(line 510,col 60)",
        "(line 511,col 9)-(line 511,col 56)",
        "(line 512,col 9)-(line 512,col 60)",
        "(line 513,col 9)-(line 513,col 57)",
        "(line 514,col 9)-(line 514,col 60)",
        "(line 515,col 9)-(line 515,col 56)",
        "(line 516,col 9)-(line 516,col 60)",
        "(line 517,col 9)-(line 517,col 79)",
        "(line 518,col 9)-(line 518,col 59)",
        "(line 519,col 9)-(line 519,col 57)",
        "(line 520,col 9)-(line 520,col 60)",
        "(line 521,col 9)-(line 521,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.clone()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 542,
      "end_line": 546,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 36)",
        "(line 544,col 9)-(line 544,col 60)",
        "(line 545,col 9)-(line 545,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 556,
      "end_line": 561,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 35)",
        "(line 559,col 9)-(line 559,col 60)",
        "(line 560,col 9)-(line 560,col 62)"
      ]
    }
  ]
}