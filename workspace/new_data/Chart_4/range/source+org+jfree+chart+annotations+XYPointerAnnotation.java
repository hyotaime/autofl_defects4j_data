{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/annotations/XYPointerAnnotation.java",
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
      "begin_line": 95,
      "end_line": 546,
      "comment": "\r\n * An arrow and label that can be placed on an {@link XYPlot}.  The arrow is\r\n * drawn at a user-definable angle so that it points towards the (x, y)\r\n * location for the annotation.\r\n * \u003cp\u003e\r\n * The arrow length (and its offset from the (x, y) location) is controlled by\r\n * the tip radius and the base radius attributes.  Imagine two circles around\r\n * the (x, y) coordinate: the inner circle defined by the tip radius, and the\r\n * outer circle defined by the base radius.  Now, draw the arrow starting at\r\n * some point on the outer circle (the point is determined by the angle), with\r\n * the arrow tip being drawn at a corresponding point on the inner circle.\r\n *\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIP_RADIUS"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The default tip radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BASE_RADIUS"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The default base radius (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LABEL_OFFSET"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The default label offset (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_LENGTH"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The default arrow length (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ARROW_WIDTH"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The default arrow width (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The angle of the arrow\u0027s line (in radians). "
    },
    {
      "type": "field",
      "varNames": [
        "tipRadius"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\r\n     * The radius from the (x, y) point to the tip of the arrow (in Java2D\r\n     * units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseRadius"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\r\n     * The radius from the (x, y) point to the start of the arrow line (in\r\n     * Java2D units).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arrowLength"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The length of the arrow head (in Java2D units). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowWidth"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The arrow width (in Java2D units, per side). "
    },
    {
      "type": "field",
      "varNames": [
        "arrowStroke"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The arrow stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "arrowPaint"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The arrow paint. "
    },
    {
      "type": "field",
      "varNames": [
        "labelOffset"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The radius from the base point to the anchor point for the label. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.XYPointerAnnotation(java.lang.String, double, double, double)",
      "begin_line": 154,
      "end_line": 166,
      "comment": "\r\n     * Creates a new label and arrow annotation.\r\n     *\r\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param x  the x-coordinate (measured against the chart\u0027s domain axis).\r\n     * @param y  the y-coordinate (measured against the chart\u0027s range axis).\r\n     * @param angle  the angle of the arrow\u0027s line (in radians).\r\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 27)",
        "(line 157,col 9)-(line 157,col 27)",
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 46)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 161,col 9)-(line 161,col 46)",
        "(line 162,col 9)-(line 162,col 48)",
        "(line 163,col 9)-(line 163,col 49)",
        "(line 164,col 9)-(line 164,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getAngle()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\r\n     * Returns the angle of the arrow.\r\n     *\r\n     * @return The angle (in radians).\r\n     *\r\n     * @see #setAngle(double)\r\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setAngle(double)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Sets the angle of the arrow.\r\n     *\r\n     * @param angle  the angle (in radians).\r\n     *\r\n     * @see #getAngle()\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getTipRadius()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the tip radius.\r\n     *\r\n     * @return The tip radius (in Java2D units).\r\n     *\r\n     * @see #setTipRadius(double)\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setTipRadius(double)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\r\n     * Sets the tip radius.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getTipRadius()\r\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getBaseRadius()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\r\n     * Returns the base radius.\r\n     *\r\n     * @return The base radius (in Java2D units).\r\n     *\r\n     * @see #setBaseRadius(double)\r\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setBaseRadius(double)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\r\n     * Sets the base radius.\r\n     *\r\n     * @param radius  the radius (in Java2D units).\r\n     *\r\n     * @see #getBaseRadius()\r\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getLabelOffset()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\r\n     * Returns the label offset.\r\n     *\r\n     * @return The label offset (in Java2D units).\r\n     *\r\n     * @see #setLabelOffset(double)\r\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setLabelOffset(double)",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\r\n     * Sets the label offset (from the arrow base, continuing in a straight\r\n     * line, in Java2D units).\r\n     *\r\n     * @param offset  the offset (in Java2D units).\r\n     *\r\n     * @see #getLabelOffset()\r\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowLength()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\r\n     * Returns the arrow length.\r\n     *\r\n     * @return The arrow length.\r\n     *\r\n     * @see #setArrowLength(double)\r\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowLength(double)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Sets the arrow length.\r\n     *\r\n     * @param length  the length.\r\n     *\r\n     * @see #getArrowLength()\r\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowWidth()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\r\n     * Returns the arrow width.\r\n     *\r\n     * @return The arrow width (in Java2D units).\r\n     *\r\n     * @see #setArrowWidth(double)\r\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowWidth(double)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Sets the arrow width.\r\n     *\r\n     * @param width  the width (in Java2D units).\r\n     *\r\n     * @see #getArrowWidth()\r\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowStroke()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\r\n     * Returns the stroke used to draw the arrow line.\r\n     *\r\n     * @return The arrow stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowStroke(Stroke)\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowStroke(java.awt.Stroke)",
      "begin_line": 319,
      "end_line": 324,
      "comment": "\r\n     * Sets the stroke used to draw the arrow line.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowStroke()\r\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.getArrowPaint()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\r\n     * Returns the paint used for the arrow.\r\n     *\r\n     * @return The arrow paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setArrowPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.setArrowPaint(java.awt.Paint)",
      "begin_line": 344,
      "end_line": 349,
      "comment": "\r\n     * Sets the paint used for the arrow.\r\n     *\r\n     * @param paint  the arrow paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getArrowPaint()\r\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 362,
      "end_line": 439,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  the plot rendering info.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 369,col 59)",
        "(line 370,col 9)-(line 371,col 58)",
        "(line 372,col 9)-(line 372,col 77)",
        "(line 373,col 9)-(line 373,col 75)",
        "(line 374,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 70)",
        "(line 380,col 9)-(line 380,col 70)",
        "(line 382,col 9)-(line 382,col 67)",
        "(line 383,col 9)-(line 383,col 67)",
        "(line 385,col 9)-(line 385,col 75)",
        "(line 386,col 9)-(line 386,col 75)",
        "(line 388,col 9)-(line 389,col 73)",
        "(line 390,col 9)-(line 391,col 73)",
        "(line 393,col 9)-(line 394,col 73)",
        "(line 395,col 9)-(line 396,col 73)",
        "(line 398,col 9)-(line 398,col 46)",
        "(line 399,col 9)-(line 399,col 49)",
        "(line 400,col 9)-(line 400,col 61)",
        "(line 401,col 9)-(line 401,col 63)",
        "(line 402,col 9)-(line 402,col 26)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 406,col 80)",
        "(line 407,col 9)-(line 407,col 22)",
        "(line 408,col 9)-(line 408,col 23)",
        "(line 411,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 414,col 36)",
        "(line 415,col 9)-(line 415,col 30)",
        "(line 416,col 9)-(line 418,col 57)",
        "(line 419,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 423,col 32)",
        "(line 424,col 9)-(line 426,col 37)",
        "(line 427,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 42)",
        "(line 434,col 9)-(line 434,col 30)",
        "(line 435,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.equals(java.lang.Object)",
      "begin_line": 448,
      "end_line": 481,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 61)",
        "(line 456,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.hashCode()",
      "begin_line": 488,
      "end_line": 505,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 38)",
        "(line 490,col 9)-(line 490,col 56)",
        "(line 491,col 9)-(line 491,col 60)",
        "(line 492,col 9)-(line 492,col 55)",
        "(line 493,col 9)-(line 493,col 60)",
        "(line 494,col 9)-(line 494,col 56)",
        "(line 495,col 9)-(line 495,col 60)",
        "(line 496,col 9)-(line 496,col 57)",
        "(line 497,col 9)-(line 497,col 60)",
        "(line 498,col 9)-(line 498,col 56)",
        "(line 499,col 9)-(line 499,col 60)",
        "(line 500,col 9)-(line 500,col 79)",
        "(line 501,col 9)-(line 501,col 59)",
        "(line 502,col 9)-(line 502,col 57)",
        "(line 503,col 9)-(line 503,col 60)",
        "(line 504,col 9)-(line 504,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.clone()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 525,
      "end_line": 529,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 36)",
        "(line 527,col 9)-(line 527,col 60)",
        "(line 528,col 9)-(line 528,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYPointerAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 539,
      "end_line": 544,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 35)",
        "(line 542,col 9)-(line 542,col 60)",
        "(line 543,col 9)-(line 543,col 62)"
      ]
    }
  ]
}