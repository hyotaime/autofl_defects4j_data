{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/plot/dial/StandardDialFrame.java",
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
      "end_line": 357,
      "comment": "\n * A simple circular frame for the {@link DialPlot} class.\n * \n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The outer radius, relative to the framing rectangle. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundPaint"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The color used for the front of the panel.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundPaint"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * The color used for the border around the window. This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stroke"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The stroke for drawing the frame outline.  This field is transient\n     * because it requires special handling for serialization.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.StandardDialFrame()",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eStandardDialFrame\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 42)",
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 99,col 44)",
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getRadius()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns the radius, relative to the framing rectangle.\n     *\n     * @return The radius. \n     * \n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setRadius(double)",
      "begin_line": 122,
      "end_line": 129,
      "comment": "\n     * Sets the radius and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     *\n     * @param radius  the radius (must be positive).\n     * \n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getBackgroundPaint()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns the background paint.\n     * \n     * @return The background paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setBackgroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setBackgroundPaint(java.awt.Paint)",
      "begin_line": 150,
      "end_line": 156,
      "comment": "\n     * Sets the background paint and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getBackgroundPaint()\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 37)",
        "(line 155,col 9)-(line 155,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getForegroundPaint()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns the foreground paint.\n     * \n     * @return The foreground paint (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setForegroundPaint(Paint)\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setForegroundPaint(java.awt.Paint)",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * Sets the foreground paint and sends a {@link DialLayerChangeEvent} to \n     * all registered listeners.\n     * \n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getForegroundPaint()\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getStroke()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Returns the stroke for the frame.\n     * \n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @see #setStroke(Stroke)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.setStroke(java.awt.Stroke)",
      "begin_line": 204,
      "end_line": 210,
      "comment": "\n     * Sets the stroke and sends a {@link DialLayerChangeEvent} to all \n     * registered listeners.\n     * \n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @see #getStroke()\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 29)",
        "(line 209,col 9)-(line 209,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.getWindow(java.awt.geom.Rectangle2D)",
      "begin_line": 220,
      "end_line": 225,
      "comment": "\n     * Returns the shape for the window for this dial.  Some dial layers will\n     * request that their drawing be clipped within this window.\n     *\n     * @param frame  the reference frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The shape of the dial\u0027s window.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 224,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.isClippedToWindow()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this dial layer is not\n     * clipped to the dial window.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 246,
      "end_line": 266,
      "comment": "\n     * Draws the frame.  This method is called by the {@link DialPlot} class,\n     * you shouldn\u0027t need to call it directly.\n     *\n     * @param g2  the graphics target (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param frame  the frame (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param view  the view (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 40)",
        "(line 251,col 9)-(line 252,col 36)",
        "(line 253,col 9)-(line 254,col 31)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 29)",
        "(line 259,col 9)-(line 259,col 42)",
        "(line 260,col 9)-(line 260,col 22)",
        "(line 262,col 9)-(line 262,col 34)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 264,col 24)",
        "(line 265,col 9)-(line 265,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.equals(java.lang.Object)",
      "begin_line": 275,
      "end_line": 296,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 57)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.hashCode()",
      "begin_line": 303,
      "end_line": 313,
      "comment": "\n     * Returns a hash code for this instance.\n     * \n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 25)",
        "(line 305,col 9)-(line 305,col 57)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 307,col 9)-(line 308,col 38)",
        "(line 309,col 9)-(line 310,col 38)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.clone()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException if any of the frame\u0027s attributes \n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 334,
      "end_line": 339,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 36)",
        "(line 336,col 9)-(line 336,col 65)",
        "(line 337,col 9)-(line 337,col 65)",
        "(line 338,col 9)-(line 338,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.StandardDialFrame.readObject(java.io.ObjectInputStream)",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 35)",
        "(line 352,col 9)-(line 352,col 65)",
        "(line 353,col 9)-(line 353,col 65)",
        "(line 354,col 9)-(line 354,col 57)"
      ]
    }
  ]
}