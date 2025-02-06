{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/plot/dial/ArcDialFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArcDialFrame",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialFrame",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 518,
      "comment": "\n * A standard frame for the {@link DialPlot} class.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The color used for the front of the panel.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundPaint"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * The color used for the border around the window. This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * The stroke for drawing the frame outline.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The start angle.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "extent"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The end angle.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "innerRadius"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The inner radius, relative to the framing rectangle. "
    },
    {
      "type": "field",
      "varNames": [
        "outerRadius"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The outer radius, relative to the framing rectangle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.ArcDialFrame()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " \n     * Creates a new instance of \u003ccode\u003eArcDialFrame\u003c/code\u003e that spans\n     * 180 degrees. \n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.ArcDialFrame(double, double)",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eArcDialFrame\u003c/code\u003e that spans\n     * the arc specified.\n     *\n     * @param startAngle  the startAngle (in degrees).\n     * @param extent  the extent of the arc (in degrees, counter-clockwise).\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 42)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 132,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getBackgroundPaint()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Returns the background paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @return The background paint.\n     * \n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 154,
      "end_line": 160,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 37)",
        "(line 159,col 9)-(line 159,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getForegroundPaint()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the foreground paint.\n     * \n     * @return The foreground paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setForegroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setForegroundPaint(java.awt.Paint)",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * Sets the foreground paint and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getForegroundPaint()\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 186,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getStroke()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the stroke.\n     * \n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setStroke(java.awt.Stroke)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Sets the stroke and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getStroke()\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 29)",
        "(line 213,col 9)-(line 213,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getInnerRadius()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns the inner radius, relative to the framing rectangle.\n     *\n     * @return The inner radius. \n     * \n     * @see #setInnerRadius(double)\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setInnerRadius(double)",
      "begin_line": 235,
      "end_line": 241,
      "comment": "\n     * Sets the inner radius and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     *\n     * @param radius  the inner radius.\n     * \n     * @see #getInnerRadius()\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 34)",
        "(line 240,col 9)-(line 240,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getOuterRadius()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the outer radius, relative to the framing rectangle.\n     *\n     * @return The outer radius.\n     * \n     * @see #setOuterRadius(double)\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setOuterRadius(double)",
      "begin_line": 262,
      "end_line": 268,
      "comment": "\n     * Sets the outer radius and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     *\n     * @param radius  the outer radius.\n     * \n     * @see #getOuterRadius()\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 34)",
        "(line 267,col 9)-(line 267,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getStartAngle()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns the start angle.\n     * \n     * @return The start angle.\n     * \n     * @see #setStartAngle(double)\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setStartAngle(double)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * Sets the start angle and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param angle  the angle.\n     * \n     * @see #getStartAngle()\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 32)",
        "(line 291,col 9)-(line 291,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getExtent()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * Returns the extent.\n     * \n     * @return The extent.\n     * \n     * @see #setExtent(double)\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setExtent(double)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Sets the extent and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param extent  the extent.\n     * \n     * @see #getExtent()\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 326,
      "end_line": 344,
      "comment": "\n     * Returns the shape for the window for this dial.  Some dial layers will\n     * request that their drawing be clipped within this window.\n     *\n     * @param frame  the reference frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape of the dial\u0027s window.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 329,col 52)",
        "(line 330,col 9)-(line 331,col 52)",
        "(line 332,col 9)-(line 333,col 28)",
        "(line 334,col 9)-(line 335,col 58)",
        "(line 336,col 9)-(line 336,col 42)",
        "(line 337,col 9)-(line 337,col 47)",
        "(line 338,col 9)-(line 338,col 63)",
        "(line 339,col 9)-(line 339,col 30)",
        "(line 340,col 9)-(line 340,col 30)",
        "(line 341,col 9)-(line 341,col 22)",
        "(line 342,col 9)-(line 342,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getOuterWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 353,
      "end_line": 374,
      "comment": "\n     * Returns the outer window.\n     * \n     * @param frame  the frame.\n     * \n     * @return The outer window.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 33)",
        "(line 356,col 9)-(line 358,col 32)",
        "(line 359,col 9)-(line 361,col 32)",
        "(line 362,col 9)-(line 363,col 74)",
        "(line 364,col 9)-(line 366,col 28)",
        "(line 367,col 9)-(line 367,col 42)",
        "(line 368,col 9)-(line 368,col 47)",
        "(line 369,col 9)-(line 369,col 63)",
        "(line 370,col 9)-(line 370,col 30)",
        "(line 371,col 9)-(line 371,col 30)",
        "(line 372,col 9)-(line 372,col 22)",
        "(line 373,col 9)-(line 373,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 384,
      "end_line": 402,
      "comment": "\n     * Draws the frame.\n     * \n     * @param g2  the graphics target.\n     * @param plot  the plot.\n     * @param frame  the dial\u0027s reference frame.\n     * @param view  the dial\u0027s view rectangle.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 388,col 50)",
        "(line 390,col 9)-(line 390,col 43)",
        "(line 391,col 9)-(line 391,col 38)",
        "(line 392,col 9)-(line 392,col 30)",
        "(line 393,col 9)-(line 393,col 37)",
        "(line 394,col 9)-(line 394,col 23)",
        "(line 396,col 9)-(line 396,col 34)",
        "(line 397,col 9)-(line 397,col 42)",
        "(line 398,col 9)-(line 398,col 24)",
        "(line 399,col 9)-(line 399,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.isClippedToWindow()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this dial layer is not\n     * clipped to the dial window.\n     *\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.equals(java.lang.Object)",
      "begin_line": 421,
      "end_line": 451,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 47)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.hashCode()",
      "begin_line": 458,
      "end_line": 474,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 25)",
        "(line 460,col 9)-(line 460,col 61)",
        "(line 461,col 9)-(line 461,col 60)",
        "(line 462,col 9)-(line 462,col 52)",
        "(line 463,col 9)-(line 463,col 60)",
        "(line 464,col 9)-(line 464,col 57)",
        "(line 465,col 9)-(line 465,col 60)",
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 467,col 60)",
        "(line 468,col 9)-(line 469,col 38)",
        "(line 470,col 9)-(line 471,col 38)",
        "(line 472,col 9)-(line 472,col 54)",
        "(line 473,col 9)-(line 473,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.clone()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if any attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 495,
      "end_line": 500,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 36)",
        "(line 497,col 9)-(line 497,col 65)",
        "(line 498,col 9)-(line 498,col 65)",
        "(line 499,col 9)-(line 499,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.readObject(java.io.ObjectInputStream)",
      "begin_line": 510,
      "end_line": 516,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 35)",
        "(line 513,col 9)-(line 513,col 65)",
        "(line 514,col 9)-(line 514,col 65)",
        "(line 515,col 9)-(line 515,col 57)"
      ]
    }
  ]
}