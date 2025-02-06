{
  "filepath": "/tmp/Chart-2b/source/org/jfree/chart/plot/dial/StandardDialFrame.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StandardDialFrame",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialFrame",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 360,
      "comment": "\n * A simple circular frame for the {@link DialPlot} class.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The outer radius, relative to the framing rectangle. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The color used for the front of the panel.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundPaint"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * The color used for the border around the window. This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * The stroke for drawing the frame outline.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.StandardDialFrame()",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eStandardDialFrame\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 101,col 43)",
        "(line 102,col 9)-(line 102,col 44)",
        "(line 103,col 9)-(line 103,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getRadius()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the radius, relative to the framing rectangle.\n     *\n     * @return The radius.\n     *\n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setRadius(double)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Sets the radius and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param radius  the radius (must be positive).\n     *\n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getBackgroundPaint()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Returns the background paint.\n     *\n     * @return The background paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 153,
      "end_line": 159,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 37)",
        "(line 158,col 9)-(line 158,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getForegroundPaint()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Returns the foreground paint.\n     *\n     * @return The foreground paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setForegroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setForegroundPaint(java.awt.Paint)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Sets the foreground paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getForegroundPaint()\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 185,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getStroke()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the stroke for the frame.\n     *\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setStroke(java.awt.Stroke)",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * Sets the stroke and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getStroke()\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 29)",
        "(line 212,col 9)-(line 212,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 223,
      "end_line": 228,
      "comment": "\n     * Returns the shape for the window for this dial.  Some dial layers will\n     * request that their drawing be clipped within this window.\n     *\n     * @param frame  the reference frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape of the dial\u0027s window.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 227,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.isClippedToWindow()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this dial layer is not\n     * clipped to the dial window.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 249,
      "end_line": 269,
      "comment": "\n     * Draws the frame.  This method is called by the {@link DialPlot} class,\n     * you shouldn\u0027t need to call it directly.\n     *\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param frame  the frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param view  the view (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 40)",
        "(line 254,col 9)-(line 255,col 36)",
        "(line 256,col 9)-(line 257,col 31)",
        "(line 259,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 260,col 38)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 263,col 9)-(line 263,col 22)",
        "(line 265,col 9)-(line 265,col 34)",
        "(line 266,col 9)-(line 266,col 42)",
        "(line 267,col 9)-(line 267,col 24)",
        "(line 268,col 9)-(line 268,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.equals(java.lang.Object)",
      "begin_line": 278,
      "end_line": 299,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 57)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.hashCode()",
      "begin_line": 306,
      "end_line": 316,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 309,col 60)",
        "(line 310,col 9)-(line 311,col 38)",
        "(line 312,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 54)",
        "(line 315,col 9)-(line 315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.clone()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     *\n     * @throws CloneNotSupportedException if any of the frame\u0027s attributes\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 337,
      "end_line": 342,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 36)",
        "(line 339,col 9)-(line 339,col 65)",
        "(line 340,col 9)-(line 340,col 65)",
        "(line 341,col 9)-(line 341,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.readObject(java.io.ObjectInputStream)",
      "begin_line": 352,
      "end_line": 358,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 35)",
        "(line 355,col 9)-(line 355,col 65)",
        "(line 356,col 9)-(line 356,col 65)",
        "(line 357,col 9)-(line 357,col 57)"
      ]
    }
  ]
}