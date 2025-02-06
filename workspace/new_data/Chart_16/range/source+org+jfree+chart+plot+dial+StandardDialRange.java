{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/dial/StandardDialRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardDialRange",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 434,
      "comment": "\n * A layer that draws a range highlight on a dial plot.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "scaleIndex"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The scale index. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The minimum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The maximum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * The paint used to draw the range highlight.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "innerRadius"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " \n     * The factor (in the range 0.0 to 1.0) that determines the inside limit\n     * of the range highlight.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outerRadius"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The factor (in the range 0.0 to 1.0) that determines the outside limit \n     * of the range highlight.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.StandardDialRange()",
      "begin_line": 101,
      "end_line": 103,
      "comment": " \n     * Creates a new instance of \u003ccode\u003eStandardDialRange\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.StandardDialRange(double, double, java.awt.Paint)",
      "begin_line": 112,
      "end_line": 122,
      "comment": " \n     * Creates a new instance of \u003ccode\u003eStandardDialRange\u003c/code\u003e.\n     *\n     * @param lower  the lower bound.\n     * @param upper  the upper bound.\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 28)",
        "(line 117,col 9)-(line 117,col 32)",
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getScaleIndex()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Returns the scale index.\n     * \n     * @return The scale index.\n     * \n     * @see #setScaleIndex(int)\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setScaleIndex(int)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * Sets the scale index and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     * \n     * @param index  the scale index.\n     * \n     * @see #getScaleIndex()\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 145,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getLowerBound()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns the lower bound (a data value) of the dial range.\n     * \n     * @return The lower bound of the dial range.\n     * \n     * @see #setLowerBound(double)\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setLowerBound(double)",
      "begin_line": 167,
      "end_line": 174,
      "comment": "\n     * Sets the lower bound of the dial range and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param bound  the lower bound.\n     * \n     * @see #getLowerBound()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 32)",
        "(line 173,col 9)-(line 173,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getUpperBound()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Returns the upper bound of the dial range.\n     * \n     * @return The upper bound.\n     * \n     * @see #setUpperBound(double)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setUpperBound(double)",
      "begin_line": 195,
      "end_line": 202,
      "comment": "\n     * Sets the upper bound of the dial range and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param bound  the upper bound.\n     * \n     * @see #getUpperBound()\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 201,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setBounds(double, double)",
      "begin_line": 211,
      "end_line": 219,
      "comment": "\n     * Sets the bounds for the range and sends a {@link DialLayerChangeEvent} \n     * to all registered listeners.\n     * \n     * @param lower  the lower bound.\n     * @param upper  the upper bound.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 32)",
        "(line 217,col 9)-(line 217,col 32)",
        "(line 218,col 9)-(line 218,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getPaint()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Returns the paint used to highlight the range.\n     * \n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setPaint(java.awt.Paint)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * Sets the paint used to highlight the range and sends a \n     * {@link DialLayerChangeEvent} to all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 27)",
        "(line 245,col 9)-(line 245,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getInnerRadius()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns the inner radius.\n     * \n     * @return The inner radius.\n     * \n     * @see #setInnerRadius(double)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setInnerRadius(double)",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * Sets the inner radius and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param radius  the radius.\n     * \n     * @see #getInnerRadius()\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getOuterRadius()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Returns the outer radius.\n     * \n     * @return The outer radius.\n     * \n     * @see #setOuterRadius(double)\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setOuterRadius(double)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Sets the outer radius and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param radius  the radius.\n     * \n     * @see #getOuterRadius()\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 34)",
        "(line 293,col 9)-(line 293,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.isClippedToWindow()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be \n     * clipped within the dial window. \n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 314,
      "end_line": 339,
      "comment": "\n     * Draws the range.\n     * \n     * @param g2  the graphics target.\n     * @param plot  the plot.\n     * @param frame  the dial\u0027s reference frame (in Java2D space).\n     * @param view  the dial\u0027s view rectangle (in Java2D space).\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 318,col 52)",
        "(line 319,col 9)-(line 320,col 52)",
        "(line 322,col 9)-(line 322,col 57)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 62)",
        "(line 328,col 9)-(line 328,col 62)",
        "(line 330,col 9)-(line 331,col 49)",
        "(line 332,col 9)-(line 333,col 49)",
        "(line 335,col 9)-(line 335,col 32)",
        "(line 336,col 9)-(line 336,col 44)",
        "(line 337,col 9)-(line 337,col 26)",
        "(line 338,col 9)-(line 338,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.equals(java.lang.Object)",
      "begin_line": 348,
      "end_line": 375,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     * \n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 57)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.hashCode()",
      "begin_line": 382,
      "end_line": 394,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 25)",
        "(line 384,col 9)-(line 384,col 61)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 386,col 56)",
        "(line 387,col 9)-(line 387,col 60)",
        "(line 388,col 9)-(line 388,col 57)",
        "(line 389,col 9)-(line 389,col 60)",
        "(line 390,col 9)-(line 390,col 57)",
        "(line 391,col 9)-(line 391,col 60)",
        "(line 392,col 9)-(line 392,col 74)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.clone()",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Returns a clone of this instance.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if any of the attributes of this \n     *     instance cannot be cloned.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 415,
      "end_line": 418,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 36)",
        "(line 417,col 9)-(line 417,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.readObject(java.io.ObjectInputStream)",
      "begin_line": 428,
      "end_line": 432,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 35)",
        "(line 431,col 9)-(line 431,col 55)"
      ]
    }
  ]
}