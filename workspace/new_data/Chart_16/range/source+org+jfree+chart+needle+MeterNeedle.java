{
  "filepath": "/tmp/Chart-16b/source/org/jfree/chart/needle/MeterNeedle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeterNeedle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 73,
      "end_line": 418,
      "comment": "\r\n * The base class used to represent the needle on a \r\n * {@link org.jfree.chart.plot.CompassPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The fill paint. "
    },
    {
      "type": "field",
      "varNames": [
        "highlightPaint"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The highlight paint. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The size. "
    },
    {
      "type": "field",
      "varNames": [
        "rotateX"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Scalar to aply to locate the rotation x point. "
    },
    {
      "type": "field",
      "varNames": [
        "rotateY"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Scalar to aply to locate the rotation y point. "
    },
    {
      "type": "field",
      "varNames": [
        "transform"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " A transform. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.MeterNeedle.MeterNeedle()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\r\n     * Creates a new needle.\r\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.MeterNeedle.MeterNeedle(java.awt.Paint, java.awt.Paint, java.awt.Paint)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "\r\n     * Creates a new needle.\r\n     *\r\n     * @param outline  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fill  the fill paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param highlight  the highlight paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 40)",
        "(line 119,col 9)-(line 119,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getOutlinePaint()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The outline paint.\r\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setOutlinePaint(java.awt.Paint)",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\r\n     * Sets the outline paint.\r\n     *\r\n     * @param p  the new paint.\r\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getOutlineStroke()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The outline stroke.\r\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\r\n     * Sets the outline stroke.\r\n     *\r\n     * @param s  the new stroke.\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getFillPaint()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the fill paint.\r\n     *\r\n     * @return The fill paint.\r\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setFillPaint(java.awt.Paint)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\r\n     * Sets the fill paint.\r\n     *\r\n     * @param p  the fill paint.\r\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getHighlightPaint()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\r\n     * Returns the highlight paint.\r\n     *\r\n     * @return The highlight paint.\r\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setHighlightPaint(java.awt.Paint)",
      "begin_line": 196,
      "end_line": 200,
      "comment": "\r\n     * Sets the highlight paint.\r\n     *\r\n     * @param p  the highlight paint.\r\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getRotateX()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\r\n     * Returns the scalar used for determining the rotation x value.\r\n     *\r\n     * @return The x rotate scalar.\r\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setRotateX(double)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\r\n     * Sets the rotateX value.\r\n     *\r\n     * @param x  the new value.\r\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setRotateY(double)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\r\n     * Sets the rotateY value.\r\n     *\r\n     * @param y  the new value.\r\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getRotateY()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\r\n     * Returns the scalar used for determining the rotation y value.\r\n     *\r\n     * @return The y rotate scalar.\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double)",
      "begin_line": 255,
      "end_line": 264,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 49)",
        "(line 258,col 9)-(line 261,col 10)",
        "(line 262,col 9)-(line 262,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 274,
      "end_line": 285,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 40)",
        "(line 278,col 9)-(line 278,col 43)",
        "(line 280,col 9)-(line 280,col 64)",
        "(line 282,col 9)-(line 282,col 33)",
        "(line 283,col 9)-(line 283,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.defaultDisplay(java.awt.Graphics2D, java.awt.Shape)",
      "begin_line": 305,
      "end_line": 318,
      "comment": "\r\n     * Displays a shape.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param shape  the shape.\r\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getSize()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\r\n     * Returns the size.\r\n     *\r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setSize(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\r\n     * Sets the size.\r\n     *\r\n     * @param pixels  the new size.\r\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getTransform()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\r\n     * Returns the transform.\r\n     *\r\n     * @return The transform.\r\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.equals(java.lang.Object)",
      "begin_line": 354,
      "end_line": 384,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     *\r\n     * @param obj the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 45)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 393,
      "end_line": 399,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 36)",
        "(line 395,col 9)-(line 395,col 64)",
        "(line 396,col 9)-(line 396,col 62)",
        "(line 397,col 9)-(line 397,col 59)",
        "(line 398,col 9)-(line 398,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.readObject(java.io.ObjectInputStream)",
      "begin_line": 409,
      "end_line": 416,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 35)",
        "(line 412,col 9)-(line 412,col 64)",
        "(line 413,col 9)-(line 413,col 62)",
        "(line 414,col 9)-(line 414,col 59)",
        "(line 415,col 9)-(line 415,col 64)"
      ]
    }
  ]
}