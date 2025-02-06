{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/DialBackground.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialBackground",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 272,
      "comment": "\n * A regular dial layer that can be used to draw the background for a dial.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The background paint.  This field is transient because serialization\n     * requires special handling.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gradientPaintTransformer"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The transformer used when the background paint is an instance of\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialBackground.DialBackground()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialBackground\u003c/code\u003e.  The\n     * default background paint is \u003ccode\u003eColor.white\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialBackground.DialBackground(java.awt.Paint)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialBackground\u003c/code\u003e.  The\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is\n     *     \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 27)",
        "(line 106,col 9)-(line 106,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.getPaint()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the paint used to fill the background.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.setPaint(java.awt.Paint)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Sets the paint for the dial background and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.getGradientPaintTransformer()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns the transformer used to adjust the coordinates of any\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e instance used for the background paint.\n     *\n     * @return The transformer (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setGradientPaintTransformer(GradientPaintTransformer)\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer)",
      "begin_line": 157,
      "end_line": 163,
      "comment": "\n     * Sets the transformer used to adjust the coordinates of any\n     * \u003ccode\u003eGradientPaint\u003c/code\u003e instance used for the background paint, and\n     * sends a {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param t  the transformer (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getGradientPaintTransformer()\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 42)",
        "(line 162,col 9)-(line 162,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.isClippedToWindow()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 185,
      "end_line": 195,
      "comment": "\n     * Draws the background to the specified graphics device.  If the dial\n     * frame specifies a window, the clipping region will already have been\n     * set to this window before this method is called.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (ignored here).\n     * @param frame  the dial frame (ignored here).\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 29)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.equals(java.lang.Object)",
      "begin_line": 204,
      "end_line": 220,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.hashCode()",
      "begin_line": 227,
      "end_line": 232,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 25)",
        "(line 229,col 9)-(line 229,col 74)",
        "(line 230,col 9)-(line 230,col 72)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.clone()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return The clone.\n     *\n     * @throws CloneNotSupportedException if some attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 36)",
        "(line 255,col 9)-(line 255,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialBackground.readObject(java.io.ObjectInputStream)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 35)",
        "(line 269,col 9)-(line 269,col 55)"
      ]
    }
  ]
}