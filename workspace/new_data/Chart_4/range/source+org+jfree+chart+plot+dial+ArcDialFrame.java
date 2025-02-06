{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/ArcDialFrame.java",
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
      "end_line": 520,
      "comment": "\n * A standard frame for the {@link DialPlot} class.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The color used for the front of the panel.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundPaint"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The color used for the border around the window. This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * The stroke for drawing the frame outline.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startAngle"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * The start angle.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "extent"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * The end angle.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "innerRadius"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The inner radius, relative to the framing rectangle. "
    },
    {
      "type": "field",
      "varNames": [
        "outerRadius"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The outer radius, relative to the framing rectangle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.ArcDialFrame()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eArcDialFrame\u003c/code\u003e that spans\n     * 180 degrees.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.ArcDialFrame(double, double)",
      "begin_line": 128,
      "end_line": 136,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eArcDialFrame\u003c/code\u003e that spans\n     * the arc specified.\n     *\n     * @param startAngle  the startAngle (in degrees).\n     * @param extent  the extent of the arc (in degrees, counter-clockwise).\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 42)",
        "(line 130,col 9)-(line 130,col 56)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 37)",
        "(line 135,col 9)-(line 135,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getBackgroundPaint()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Returns the background paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @return The background paint.\n     *\n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 162,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getForegroundPaint()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the foreground paint.\n     *\n     * @return The foreground paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setForegroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setForegroundPaint(java.awt.Paint)",
      "begin_line": 184,
      "end_line": 190,
      "comment": "\n     * Sets the foreground paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getForegroundPaint()\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 37)",
        "(line 189,col 9)-(line 189,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getStroke()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns the stroke.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setStroke(java.awt.Stroke)",
      "begin_line": 211,
      "end_line": 217,
      "comment": "\n     * Sets the stroke and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getStroke()\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 29)",
        "(line 216,col 9)-(line 216,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getInnerRadius()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns the inner radius, relative to the framing rectangle.\n     *\n     * @return The inner radius.\n     *\n     * @see #setInnerRadius(double)\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setInnerRadius(double)",
      "begin_line": 238,
      "end_line": 244,
      "comment": "\n     * Sets the inner radius and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param radius  the inner radius.\n     *\n     * @see #getInnerRadius()\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 34)",
        "(line 243,col 9)-(line 243,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getOuterRadius()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Returns the outer radius, relative to the framing rectangle.\n     *\n     * @return The outer radius.\n     *\n     * @see #setOuterRadius(double)\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setOuterRadius(double)",
      "begin_line": 265,
      "end_line": 271,
      "comment": "\n     * Sets the outer radius and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param radius  the outer radius.\n     *\n     * @see #getOuterRadius()\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getStartAngle()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Returns the start angle.\n     *\n     * @return The start angle.\n     *\n     * @see #setStartAngle(double)\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setStartAngle(double)",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * Sets the start angle and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param angle  the angle.\n     *\n     * @see #getStartAngle()\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 32)",
        "(line 294,col 9)-(line 294,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getExtent()",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Returns the extent.\n     *\n     * @return The extent.\n     *\n     * @see #setExtent(double)\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.setExtent(double)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "\n     * Sets the extent and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param extent  the extent.\n     *\n     * @see #getExtent()\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 318,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 329,
      "end_line": 347,
      "comment": "\n     * Returns the shape for the window for this dial.  Some dial layers will\n     * request that their drawing be clipped within this window.\n     *\n     * @param frame  the reference frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape of the dial\u0027s window.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 332,col 52)",
        "(line 333,col 9)-(line 334,col 52)",
        "(line 335,col 9)-(line 336,col 41)",
        "(line 337,col 9)-(line 338,col 57)",
        "(line 339,col 9)-(line 339,col 42)",
        "(line 340,col 9)-(line 340,col 47)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 342,col 9)-(line 342,col 30)",
        "(line 343,col 9)-(line 343,col 30)",
        "(line 344,col 9)-(line 344,col 22)",
        "(line 345,col 9)-(line 345,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.getOuterWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 356,
      "end_line": 377,
      "comment": "\n     * Returns the outer window.\n     *\n     * @param frame  the frame.\n     *\n     * @return The outer window.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 35)",
        "(line 358,col 9)-(line 358,col 33)",
        "(line 359,col 9)-(line 361,col 32)",
        "(line 362,col 9)-(line 364,col 32)",
        "(line 365,col 9)-(line 366,col 74)",
        "(line 367,col 9)-(line 369,col 28)",
        "(line 370,col 9)-(line 370,col 42)",
        "(line 371,col 9)-(line 371,col 47)",
        "(line 372,col 9)-(line 372,col 63)",
        "(line 373,col 9)-(line 373,col 30)",
        "(line 374,col 9)-(line 374,col 30)",
        "(line 375,col 9)-(line 375,col 22)",
        "(line 376,col 9)-(line 376,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 387,
      "end_line": 404,
      "comment": "\n     * Draws the frame.\n     *\n     * @param g2  the graphics target.\n     * @param plot  the plot.\n     * @param frame  the dial\u0027s reference frame.\n     * @param view  the dial\u0027s view rectangle.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 40)",
        "(line 391,col 9)-(line 391,col 50)",
        "(line 393,col 9)-(line 393,col 43)",
        "(line 394,col 9)-(line 394,col 38)",
        "(line 395,col 9)-(line 395,col 30)",
        "(line 396,col 9)-(line 396,col 37)",
        "(line 397,col 9)-(line 397,col 23)",
        "(line 399,col 9)-(line 399,col 34)",
        "(line 400,col 9)-(line 400,col 42)",
        "(line 401,col 9)-(line 401,col 24)",
        "(line 402,col 9)-(line 402,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.isClippedToWindow()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this dial layer is not\n     * clipped to the dial window.\n     *\n     * @return \u003ccode\u003efalse\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.equals(java.lang.Object)",
      "begin_line": 423,
      "end_line": 453,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 47)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.hashCode()",
      "begin_line": 460,
      "end_line": 476,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 25)",
        "(line 462,col 9)-(line 462,col 61)",
        "(line 463,col 9)-(line 463,col 60)",
        "(line 464,col 9)-(line 464,col 52)",
        "(line 465,col 9)-(line 465,col 60)",
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 467,col 60)",
        "(line 468,col 9)-(line 468,col 57)",
        "(line 469,col 9)-(line 469,col 60)",
        "(line 470,col 9)-(line 471,col 38)",
        "(line 472,col 9)-(line 473,col 38)",
        "(line 474,col 9)-(line 474,col 54)",
        "(line 475,col 9)-(line 475,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.clone()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if any attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 497,
      "end_line": 502,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 36)",
        "(line 499,col 9)-(line 499,col 65)",
        "(line 500,col 9)-(line 500,col 65)",
        "(line 501,col 9)-(line 501,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.ArcDialFrame.readObject(java.io.ObjectInputStream)",
      "begin_line": 512,
      "end_line": 518,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 35)",
        "(line 515,col 9)-(line 515,col 65)",
        "(line 516,col 9)-(line 516,col 65)",
        "(line 517,col 9)-(line 517,col 57)"
      ]
    }
  ]
}