{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/plot/dial/DialTextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DialTextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.dial.AbstractDialLayer",
        "org.jfree.chart.plot.dial.DialLayer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 71,
      "end_line": 409,
      "comment": "\n * A text annotation for a {@link DialPlot}.\n *\n * @since 1.0.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "label"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The label text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * The paint for the label.  This field is transient because it requires\n     * special handling for serialization.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "angle"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The angle that defines the anchor point for the annotation. "
    },
    {
      "type": "field",
      "varNames": [
        "radius"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The radius that defines the anchor point for the annotation. "
    },
    {
      "type": "field",
      "varNames": [
        "anchor"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The text anchor to be aligned to the annotation\u0027s anchor point. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.DialTextAnnotation(java.lang.String)",
      "begin_line": 103,
      "end_line": 113,
      "comment": "\n     * Creates a new instance of \u003ccode\u003eDialTextAnnotation\u003c/code\u003e.\n     *\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 27)",
        "(line 108,col 9)-(line 108,col 26)",
        "(line 109,col 9)-(line 109,col 54)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 27)",
        "(line 112,col 9)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getLabel()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the label text.\n     *\n     * @return The label text (never \u003ccode\u003enull\u003c/code).\n     *\n     * @see #setLabel(String)\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setLabel(java.lang.String)",
      "begin_line": 134,
      "end_line": 140,
      "comment": "\n     * Sets the label and sends a {@link DialLayerChangeEvent} to all\n     * registered listeners.\n     *\n     * @param label  the label (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getLabel()\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getFont()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns the font used to display the label.\n     *\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setFont(Font)\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setFont(java.awt.Font)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * Sets the font used to display the label and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getFont()\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 25)",
        "(line 166,col 9)-(line 166,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getPaint()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the paint used to display the label.\n     *\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @see #setPaint(Paint)\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 188,
      "end_line": 194,
      "comment": "\n     * Sets the paint used to display the label and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getPaint()\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 27)",
        "(line 193,col 9)-(line 193,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getAngle()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the angle used to calculate the anchor point.\n     *\n     * @return The angle (in degrees).\n     *\n     * @see #setAngle(double)\n     * @see #getRadius()\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setAngle(double)",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * Sets the angle used to calculate the anchor point and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param angle  the angle (in degrees).\n     *\n     * @see #getAngle()\n     * @see #setRadius(double)\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 27)",
        "(line 219,col 9)-(line 219,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getRadius()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the radius used to calculate the anchor point.  This is\n     * specified as a percentage relative to the dial\u0027s framing rectangle.\n     *\n     * @return The radius.\n     *\n     * @see #setRadius(double)\n     * @see #getAngle()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setRadius(double)",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Sets the radius used to calculate the anchor point and sends a\n     * {@link DialLayerChangeEvent} to all registered listeners.\n     *\n     * @param radius  the radius (as a percentage of the dial\u0027s framing\n     *                rectangle).\n     *\n     * @see #getRadius()\n     * @see #setAngle(double)\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.getAnchor()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the text anchor point that will be aligned to the position\n     * specified by {@link #getAngle()} and {@link #getRadius()}.\n     *\n     * @return The anchor point.\n     *\n     * @see #setAnchor(TextAnchor)\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.setAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 274,
      "end_line": 280,
      "comment": "\n     * Sets the text anchor point and sends a {@link DialLayerChangeEvent} to\n     * all registered listeners.\n     *\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @see #getAnchor()\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 29)",
        "(line 279,col 9)-(line 279,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.isClippedToWindow()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this layer should be\n     * clipped within the dial window.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.dial.DialPlot, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 302,
      "end_line": 315,
      "comment": "\n     * Draws the background to the specified graphics device.  If the dial\n     * frame specifies a window, the clipping region will already have been\n     * set to this window before this method is called.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param plot  the plot (ignored here).\n     * @param frame  the dial frame (ignored here).\n     * @param view  the view rectangle (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 307,col 29)",
        "(line 308,col 9)-(line 308,col 69)",
        "(line 309,col 9)-(line 309,col 41)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 30)",
        "(line 312,col 9)-(line 313,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.equals(java.lang.Object)",
      "begin_line": 324,
      "end_line": 351,
      "comment": "\n     * Tests this instance for equality with an arbitrary object.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 59)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.hashCode()",
      "begin_line": 358,
      "end_line": 369,
      "comment": "\n     * Returns a hash code for this instance.\n     *\n     * @return The hash code.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 25)",
        "(line 360,col 9)-(line 360,col 74)",
        "(line 361,col 9)-(line 361,col 52)",
        "(line 362,col 9)-(line 362,col 53)",
        "(line 363,col 9)-(line 363,col 54)",
        "(line 364,col 9)-(line 364,col 56)",
        "(line 365,col 9)-(line 365,col 60)",
        "(line 366,col 9)-(line 366,col 52)",
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 368,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.clone()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Returns a clone of this instance.\n     *\n     * @return The clone.\n     *\n     * @throws CloneNotSupportedException if some attribute of this instance\n     *     cannot be cloned.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 390,
      "end_line": 393,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the output stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 36)",
        "(line 392,col 9)-(line 392,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.dial.DialTextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 403,
      "end_line": 407,
      "comment": "\n     * Provides serialization support.\n     *\n     * @param stream  the input stream.\n     *\n     * @throws IOException  if there is an I/O error.\n     * @throws ClassNotFoundException  if there is a classpath problem.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 35)",
        "(line 406,col 9)-(line 406,col 55)"
      ]
    }
  ]
}