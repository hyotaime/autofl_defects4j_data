{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/DialCap.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialCap",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 342,
      "comment": "\n * A regular dial layer that can be used to draw a cap over the center of\n * the dial (the base of the dial pointer(s)).\n *\n * @since 1.0.7\n "
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
        "radius"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The radius of the cap, as a percentage of the framing rectangle.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The fill paint.  This field is transient because it requires special\n     * handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The paint used to draw the cap outline (this should never be\n     * \u003ccode\u003enull\u003c/code\u003e).  This field is transient because it requires\n     * special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The stroke used to draw the cap outline (this should never be\n     * \u003ccode\u003enull\u003c/code\u003e).   This field is transient because it requires\n     * special handling for serialization.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialCap.DialCap()",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eStandardDialBackground\u003c/code\u003e.  The\n     * default background paint is \u003ccode\u003eColor.white\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 27)",
        "(line 105,col 9)-(line 105,col 37)",
        "(line 106,col 9)-(line 106,col 40)",
        "(line 107,col 9)-(line 107,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.getRadius()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Returns the radius of the cap, as a percentage of the dial\u0027s framing\n     * rectangle.\n     *\n     * @return The radius.\n     *\n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.setRadius(double)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Sets the radius of the cap, as a percentage of the dial\u0027s framing\n     * rectangle, and sends a {@link DialLayerChangeEvent} to all registered\n     * listeners.\n     *\n     * @param radius  the radius (must be greater than zero).\n     *\n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.getFillPaint()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Returns the paint used to fill the cap.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setFillPaint(Paint)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.setFillPaint(java.awt.Paint)",
      "begin_line": 158,
      "end_line": 164,
      "comment": "\n     * Sets the paint for the cap background and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getFillPaint()\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 31)",
        "(line 163,col 9)-(line 163,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.getOutlinePaint()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the paint used to draw the outline of the cap.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setOutlinePaint(Paint)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.setOutlinePaint(java.awt.Paint)",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Sets the paint used to draw the outline of the cap and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getOutlinePaint()\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 34)",
        "(line 190,col 9)-(line 190,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.getOutlineStroke()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns the stroke used to draw the outline of the cap.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setOutlineStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 212,
      "end_line": 218,
      "comment": "\n     * Sets the stroke used to draw the outline of the cap and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getOutlineStroke()\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 217,col 9)-(line 217,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.isClippedToWindow()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 240,
      "end_line": 254,
      "comment": "\n     * Draws the background to the specified graphics device.  If the dial\n     * frame specifies a window, the clipping region will already have been\n     * set to this window before this method is called.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (ignored here).\n     * @param frame  the dial frame (ignored here).\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 36)",
        "(line 245,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 248,col 31)",
        "(line 249,col 9)-(line 249,col 19)",
        "(line 250,col 9)-(line 250,col 39)",
        "(line 251,col 9)-(line 251,col 41)",
        "(line 252,col 9)-(line 252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.equals(java.lang.Object)",
      "begin_line": 263,
      "end_line": 284,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.hashCode()",
      "begin_line": 291,
      "end_line": 298,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 25)",
        "(line 293,col 9)-(line 293,col 78)",
        "(line 294,col 9)-(line 295,col 35)",
        "(line 296,col 9)-(line 296,col 61)",
        "(line 297,col 9)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.clone()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if some attribute of the cap cannot\n     *     be cloned.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 319,
      "end_line": 324,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 36)",
        "(line 321,col 9)-(line 321,col 59)",
        "(line 322,col 9)-(line 322,col 62)",
        "(line 323,col 9)-(line 323,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialCap.readObject(java.io.ObjectInputStream)",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 35)",
        "(line 337,col 9)-(line 337,col 59)",
        "(line 338,col 9)-(line 338,col 62)",
        "(line 339,col 9)-(line 339,col 64)"
      ]
    }
  ]
}