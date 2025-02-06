{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/annotations/XYPointerAnnotation.java",
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
      "begin_line": 92,
      "end_line": 534,
      "comment": "\r\n * An arrow and label that can be placed on an \r\n * {@link org.jfree.chart.plot.XYPlot}.  The arrow is drawn at a user-definable \r\n * angle so that it points towards the (x, y) location for the annotation.  \r\n * \u003cp\u003e\r\n * The arrow length (and its offset from the (x, y) location) is controlled by \r\n * the tip radius and the base radius attributes.  Imagine two circles around \r\n * the (x, y) coordinate: the inner circle defined by the tip radius, and the \r\n * outer circle defined by the base radius.  Now, draw the arrow starting at \r\n * some point on the outer circle (the point is determined by the angle), with \r\n * the arrow tip being drawn at a corresponding point on the inner circle.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIP_RADIUS"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The default tip radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BASE_RADIUS"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The default base radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OFFSET"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The default label offset (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_LENGTH"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The default arrow length (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_WIDTH"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The default arrow width (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The angle of the arrow\u0027s line (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "tipRadius"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \r\n     * The radius from the (x, y) point to the tip of the arrow (in Java2D \r\n     * units). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseRadius"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " \r\n     * The radius from the (x, y) point to the start of the arrow line (in \r\n     * Java2D units). \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrowLength"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The length of the arrow head (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowWidth"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The arrow width (in Java2D units, per side). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowStroke"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The arrow stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "arrowPaint"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The arrow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffset"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The radius from the base point to the anchor point for the label. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.XYPointerAnnotation(java.lang.String, double, double, double)",
      "begin_line": 152,
      "end_line": 164,
      "comment": "\r\n     * Creates a new label and arrow annotation.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param x  the x-coordinate (measured against the chart\u0027s domain axis).\r\n     * @param y  the y-coordinate (measured against the chart\u0027s range axis).\r\n     * @param angle  the angle of the arrow\u0027s line (in radians).\r\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 27)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 157,col 9)-(line 157,col 46)",
        "(line 158,col 9)-(line 158,col 48)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 161,col 9)-(line 161,col 49)",
        "(line 162,col 9)-(line 162,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getAngle()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the angle of the arrow.\r\n     * \r\n     * @return The angle (in radians).\r\n     * \r\n     * @see #setAngle(double)\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setAngle(double)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\r\n     * Sets the angle of the arrow.\r\n     * \r\n     * @param angle  the angle (in radians).\r\n     * \r\n     * @see #getAngle()\r\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getTipRadius()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the tip radius.\r\n     * \r\n     * @return The tip radius (in Java2D units).\r\n     * \r\n     * @see #setTipRadius(double)\r\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setTipRadius(double)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Sets the tip radius.\r\n     * \r\n     * @param radius  the radius (in Java2D units).\r\n     * \r\n     * @see #getTipRadius()\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getBaseRadius()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\r\n     * Returns the base radius.\r\n     * \r\n     * @return The base radius (in Java2D units).\r\n     * \r\n     * @see #setBaseRadius(double)\r\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setBaseRadius(double)",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\r\n     * Sets the base radius.\r\n     * \r\n     * @param radius  the radius (in Java2D units).\r\n     * \r\n     * @see #getBaseRadius()\r\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getLabelOffset()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\r\n     * Returns the label offset.\r\n     * \r\n     * @return The label offset (in Java2D units).\r\n     * \r\n     * @see #setLabelOffset(double)\r\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setLabelOffset(double)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\r\n     * Sets the label offset (from the arrow base, continuing in a straight \r\n     * line, in Java2D units).\r\n     * \r\n     * @param offset  the offset (in Java2D units).\r\n     * \r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowLength()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Returns the arrow length.\r\n     * \r\n     * @return The arrow length.\r\n     * \r\n     * @see #setArrowLength(double)\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowLength(double)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\r\n     * Sets the arrow length.\r\n     * \r\n     * @param length  the length.\r\n     * \r\n     * @see #getArrowLength()\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowWidth()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\r\n     * Returns the arrow width.\r\n     * \r\n     * @return The arrow width (in Java2D units).\r\n     * \r\n     * @see #setArrowWidth(double)\r\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowWidth(double)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Sets the arrow width.\r\n     * \r\n     * @param width  the width (in Java2D units).\r\n     * \r\n     * @see #getArrowWidth()\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowStroke()",
      "begin_line": 306,
      "end_line": 308,
      "comment": " \r\n     * Returns the stroke used to draw the arrow line.\r\n     * \r\n     * @return The arrow stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setArrowStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowStroke(java.awt.Stroke)",
      "begin_line": 317,
      "end_line": 322,
      "comment": " \r\n     * Sets the stroke used to draw the arrow line.\r\n     * \r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getArrowStroke()\r\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowPaint()",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\r\n     * Returns the paint used for the arrow.\r\n     * \r\n     * @return The arrow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setArrowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowPaint(java.awt.Paint)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "\r\n     * Sets the paint used for the arrow.\r\n     * \r\n     * @param paint  the arrow paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getArrowPaint()\r\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 360,
      "end_line": 424,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 367,col 59)",
        "(line 368,col 9)-(line 369,col 58)",
        "(line 370,col 9)-(line 370,col 77)",
        "(line 371,col 9)-(line 371,col 75)",
        "(line 372,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 70)",
        "(line 378,col 9)-(line 378,col 70)",
        "(line 380,col 9)-(line 380,col 67)",
        "(line 381,col 9)-(line 381,col 67)",
        "(line 383,col 9)-(line 383,col 75)",
        "(line 384,col 9)-(line 384,col 75)",
        "(line 386,col 9)-(line 387,col 69)",
        "(line 388,col 9)-(line 389,col 69)",
        "(line 391,col 9)-(line 392,col 69)",
        "(line 393,col 9)-(line 394,col 69)",
        "(line 396,col 9)-(line 396,col 46)",
        "(line 397,col 9)-(line 397,col 49)",
        "(line 398,col 9)-(line 398,col 61)",
        "(line 399,col 9)-(line 399,col 63)",
        "(line 400,col 9)-(line 400,col 26)",
        "(line 402,col 9)-(line 402,col 39)",
        "(line 403,col 9)-(line 403,col 37)",
        "(line 404,col 9)-(line 404,col 68)",
        "(line 405,col 9)-(line 405,col 22)",
        "(line 406,col 9)-(line 406,col 23)",
        "(line 409,col 9)-(line 409,col 30)",
        "(line 410,col 9)-(line 410,col 32)",
        "(line 411,col 9)-(line 412,col 74)",
        "(line 413,col 9)-(line 414,col 74)",
        "(line 415,col 9)-(line 416,col 69)",
        "(line 418,col 9)-(line 418,col 42)",
        "(line 419,col 9)-(line 419,col 30)",
        "(line 420,col 9)-(line 422,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.equals(java.lang.Object)",
      "begin_line": 433,
      "end_line": 469,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 61)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.hashCode()",
      "begin_line": 476,
      "end_line": 493,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 38)",
        "(line 478,col 9)-(line 478,col 56)",
        "(line 479,col 9)-(line 479,col 60)",
        "(line 480,col 9)-(line 480,col 55)",
        "(line 481,col 9)-(line 481,col 60)",
        "(line 482,col 9)-(line 482,col 56)",
        "(line 483,col 9)-(line 483,col 60)",
        "(line 484,col 9)-(line 484,col 57)",
        "(line 485,col 9)-(line 485,col 60)",
        "(line 486,col 9)-(line 486,col 56)",
        "(line 487,col 9)-(line 487,col 60)",
        "(line 488,col 9)-(line 488,col 79)",
        "(line 489,col 9)-(line 489,col 59)",
        "(line 490,col 9)-(line 490,col 57)",
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.clone()",
      "begin_line": 502,
      "end_line": 504,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 513,
      "end_line": 517,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 36)",
        "(line 515,col 9)-(line 515,col 60)",
        "(line 516,col 9)-(line 516,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 527,
      "end_line": 532,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 35)",
        "(line 530,col 9)-(line 530,col 60)",
        "(line 531,col 9)-(line 531,col 62)"
      ]
    }
  ]
}