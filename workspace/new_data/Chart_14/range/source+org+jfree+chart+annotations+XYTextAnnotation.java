{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/annotations/XYTextAnnotation.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYTextAnnotation",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.annotations.AbstractXYAnnotation",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 503,
      "comment": "\r\n * A text annotation that can be placed at a particular (x, y) location on an \r\n * {@link XYPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FONT"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": " The default font. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_PAINT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The default paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TEXT_ANCHOR"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The default text anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANCHOR"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The default rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ROTATION_ANGLE"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The default rotation angle. "
    },
    {
      "type": "field",
      "varNames": [
        "text"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The text. "
    },
    {
      "type": "field",
      "varNames": [
        "font"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The font. "
    },
    {
      "type": "field",
      "varNames": [
        "paint"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The paint. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The x-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The y-coordinate. "
    },
    {
      "type": "field",
      "varNames": [
        "textAnchor"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The text anchor (to be aligned with (x, y)). "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAnchor"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The rotation anchor. "
    },
    {
      "type": "field",
      "varNames": [
        "rotationAngle"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The rotation angle. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.XYTextAnnotation(java.lang.String, double, double)",
      "begin_line": 140,
      "end_line": 152,
      "comment": "\r\n     * Creates a new annotation to be displayed at the given coordinates.  The\r\n     * coordinates are specified in data space (they will be converted to \r\n     * Java2D space for display).\r\n     *\r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param x  the x-coordinate (in data space).\r\n     * @param y  the y-coordinate (in data space).\r\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 25)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 147,col 19)",
        "(line 148,col 9)-(line 148,col 19)",
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 150,col 54)",
        "(line 151,col 9)-(line 151,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getText()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\r\n     * Returns the text for the annotation.\r\n     *\r\n     * @return The text (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setText(String)\r\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setText(java.lang.String)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\r\n     * Sets the text for the annotation.\r\n     * \r\n     * @param text  the text (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getText()\r\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getFont()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the font for the annotation.\r\n     *\r\n     * @return The font (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFont(Font)\r\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setFont(java.awt.Font)",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\r\n     * Sets the font for the annotation.\r\n     * \r\n     * @param font  the font (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getFont()\r\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getPaint()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\r\n     * Returns the paint for the annotation.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setPaint(Paint)\r\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setPaint(java.awt.Paint)",
      "begin_line": 222,
      "end_line": 227,
      "comment": "\r\n     * Sets the paint for the annotation.\r\n     * \r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getPaint()\r\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getTextAnchor()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the text anchor.\r\n     * \r\n     * @return The text anchor (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setTextAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setTextAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 248,
      "end_line": 253,
      "comment": "\r\n     * Sets the text anchor (the point on the text bounding rectangle that is \r\n     * aligned to the (x, y) coordinate of the annotation).\r\n     * \r\n     * @param anchor  the anchor point (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getTextAnchor()\r\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAnchor()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\r\n     * Returns the rotation anchor.\r\n     * \r\n     * @return The rotation anchor point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRotationAnchor(TextAnchor)\r\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAnchor(org.jfree.chart.text.TextAnchor)",
      "begin_line": 273,
      "end_line": 278,
      "comment": "\r\n     * Sets the rotation anchor point.\r\n     * \r\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRotationAnchor()\r\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getRotationAngle()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\r\n     * Returns the rotation angle.\r\n     * \r\n     * @return The rotation angle.\r\n     * \r\n     * @see #setRotationAngle(double)\r\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setRotationAngle(double)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\r\n     * Sets the rotation angle.  The angle is measured clockwise in radians.\r\n     * \r\n     * @param angle  the angle (in radians).\r\n     * \r\n     * @see #getRotationAngle()\r\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getX()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\r\n     * Returns the x coordinate for the text anchor point (measured against the\r\n     * domain axis).\r\n     * \r\n     * @return The x coordinate (in data space).\r\n     * \r\n     * @see #setX(double)\r\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setX(double)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\r\n     * Sets the x coordinate for the text anchor point (measured against the \r\n     * domain axis).\r\n     * \r\n     * @param x  the x coordinate (in data space).\r\n     * \r\n     * @see #getX()\r\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.getY()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Returns the y coordinate for the text anchor point (measured against the\r\n     * range axis).\r\n     * \r\n     * @return The y coordinate (in data space).\r\n     * \r\n     * @see #setY(double)\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.setY(double)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\r\n     * Sets the y coordinate for the text anchor point (measured against the\r\n     * range axis).\r\n     * \r\n     * @param y  the y coordinate.\r\n     * \r\n     * @see #getY()\r\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.draw(java.awt.Graphics2D, org.jfree.chart.plot.XYPlot, java.awt.geom.Rectangle2D, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 362,
      "end_line": 398,
      "comment": "\r\n     * Draws the annotation.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param rendererIndex  the renderer index.\r\n     * @param info  an optional info object that will be populated with\r\n     *              entity information.\r\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 60)",
        "(line 368,col 9)-(line 369,col 59)",
        "(line 370,col 9)-(line 371,col 58)",
        "(line 373,col 9)-(line 374,col 46)",
        "(line 375,col 9)-(line 376,col 45)",
        "(line 378,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 30)",
        "(line 385,col 9)-(line 385,col 32)",
        "(line 386,col 9)-(line 387,col 74)",
        "(line 388,col 9)-(line 390,col 57)",
        "(line 392,col 9)-(line 392,col 42)",
        "(line 393,col 9)-(line 393,col 30)",
        "(line 394,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.equals(java.lang.Object)",
      "begin_line": 407,
      "end_line": 443,
      "comment": "\r\n     * Tests this annotation for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 55)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.hashCode()",
      "begin_line": 450,
      "end_line": 464,
      "comment": "\r\n     * Returns a hash code for the object.\r\n     * \r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 25)",
        "(line 452,col 9)-(line 452,col 43)",
        "(line 453,col 9)-(line 453,col 43)",
        "(line 454,col 9)-(line 454,col 74)",
        "(line 455,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 456,col 60)",
        "(line 457,col 9)-(line 457,col 47)",
        "(line 458,col 9)-(line 458,col 60)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 460,col 9)-(line 460,col 62)",
        "(line 461,col 9)-(line 461,col 59)",
        "(line 462,col 9)-(line 462,col 60)",
        "(line 463,col 9)-(line 463,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.clone()",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\r\n     * Returns a clone of the annotation.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  if the annotation can\u0027t be cloned.\r\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 486,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.annotations.XYTextAnnotation.readObject(java.io.ObjectInputStream)",
      "begin_line": 497,
      "end_line": 501,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 35)",
        "(line 500,col 9)-(line 500,col 55)"
      ]
    }
  ]
}