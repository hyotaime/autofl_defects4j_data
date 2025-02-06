{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/StandardDialRange.java",
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
      "end_line": 437,
      "comment": "\n * A layer that draws a range highlight on a dial plot.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "scaleIndex"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The scale index. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The minimum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The maximum data value for the scale. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * The paint used to draw the range highlight.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "innerRadius"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * The factor (in the range 0.0 to 1.0) that determines the inside limit\n     * of the range highlight.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outerRadius"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * The factor (in the range 0.0 to 1.0) that determines the outside limit\n     * of the range highlight.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.StandardDialRange()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eStandardDialRange\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.StandardDialRange(double, double, java.awt.Paint)",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eStandardDialRange\u003c/code\u003e.\n     *\n     * @param lower  the lower bound.\n     * @param upper  the upper bound.\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 28)",
        "(line 120,col 9)-(line 120,col 32)",
        "(line 121,col 9)-(line 121,col 32)",
        "(line 122,col 9)-(line 122,col 32)",
        "(line 123,col 9)-(line 123,col 32)",
        "(line 124,col 9)-(line 124,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getScaleIndex()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the scale index.\n     *\n     * @return The scale index.\n     *\n     * @see #setScaleIndex(int)\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setScaleIndex(int)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Sets the scale index and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param index  the scale index.\n     *\n     * @see #getScaleIndex()\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 32)",
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getLowerBound()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns the lower bound (a data value) of the dial range.\n     *\n     * @return The lower bound of the dial range.\n     *\n     * @see #setLowerBound(double)\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setLowerBound(double)",
      "begin_line": 170,
      "end_line": 177,
      "comment": "\n     * Sets the lower bound of the dial range and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param bound  the lower bound.\n     *\n     * @see #getLowerBound()\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 32)",
        "(line 176,col 9)-(line 176,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getUpperBound()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Returns the upper bound of the dial range.\n     *\n     * @return The upper bound.\n     *\n     * @see #setUpperBound(double)\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setUpperBound(double)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Sets the upper bound of the dial range and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param bound  the upper bound.\n     *\n     * @see #getUpperBound()\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 204,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setBounds(double, double)",
      "begin_line": 214,
      "end_line": 222,
      "comment": "\n     * Sets the bounds for the range and sends a {@link DialLayerChangeEvent}\n     * to all registered listeners.\n     *\n     * @param lower  the lower bound.\n     * @param upper  the upper bound.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 32)",
        "(line 220,col 9)-(line 220,col 32)",
        "(line 221,col 9)-(line 221,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getPaint()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the paint used to highlight the range.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setPaint(java.awt.Paint)",
      "begin_line": 243,
      "end_line": 249,
      "comment": "\n     * Sets the paint used to highlight the range and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 27)",
        "(line 248,col 9)-(line 248,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getInnerRadius()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Returns the inner radius.\n     *\n     * @return The inner radius.\n     *\n     * @see #setInnerRadius(double)\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setInnerRadius(double)",
      "begin_line": 270,
      "end_line": 273,
      "comment": "\n     * Sets the inner radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius.\n     *\n     * @see #getInnerRadius()\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 34)",
        "(line 272,col 9)-(line 272,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.getOuterRadius()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Returns the outer radius.\n     *\n     * @return The outer radius.\n     *\n     * @see #setOuterRadius(double)\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.setOuterRadius(double)",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * Sets the outer radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius.\n     *\n     * @see #getOuterRadius()\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 34)",
        "(line 296,col 9)-(line 296,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.isClippedToWindow()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 317,
      "end_line": 342,
      "comment": "\n     * Draws the range.\n     *\n     * @param g2  the graphics target.\n     * @param plot  the plot.\n     * @param frame  the dial\u0027s reference frame (in Java2D space).\n     * @param view  the dial\u0027s view rectangle (in Java2D space).\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 321,col 52)",
        "(line 322,col 9)-(line 323,col 52)",
        "(line 325,col 9)-(line 325,col 57)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 62)",
        "(line 331,col 9)-(line 331,col 62)",
        "(line 333,col 9)-(line 334,col 49)",
        "(line 335,col 9)-(line 336,col 49)",
        "(line 338,col 9)-(line 338,col 32)",
        "(line 339,col 9)-(line 339,col 44)",
        "(line 340,col 9)-(line 340,col 26)",
        "(line 341,col 9)-(line 341,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.equals(java.lang.Object)",
      "begin_line": 351,
      "end_line": 378,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 57)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.hashCode()",
      "begin_line": 385,
      "end_line": 397,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 25)",
        "(line 387,col 9)-(line 387,col 61)",
        "(line 388,col 9)-(line 388,col 60)",
        "(line 389,col 9)-(line 389,col 56)",
        "(line 390,col 9)-(line 390,col 60)",
        "(line 391,col 9)-(line 391,col 57)",
        "(line 392,col 9)-(line 392,col 60)",
        "(line 393,col 9)-(line 393,col 57)",
        "(line 394,col 9)-(line 394,col 60)",
        "(line 395,col 9)-(line 395,col 74)",
        "(line 396,col 9)-(line 396,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.clone()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if any of the attributes of this\n     *     instance cannot be cloned.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 418,
      "end_line": 421,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 36)",
        "(line 420,col 9)-(line 420,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialRange.readObject(java.io.ObjectInputStream)",
      "begin_line": 431,
      "end_line": 435,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 35)",
        "(line 434,col 9)-(line 434,col 55)"
      ]
    }
  ]
}