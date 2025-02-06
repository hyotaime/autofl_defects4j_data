{
  "filepath": "/tmp/Chart-4b/source/org/jfree/chart/needle/MeterNeedle.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MeterNeedle",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 75,
      "end_line": 436,
      "comment": "\r\n * The base class used to represent the needle on a\r\n * {@link org.jfree.chart.plot.CompassPlot}.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "outlinePaint"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The outline paint. "
    },
    {
      "type": "field",
      "varNames": [
        "outlineStroke"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The outline stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "fillPaint"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The fill paint. "
    },
    {
      "type": "field",
      "varNames": [
        "highlightPaint"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The highlight paint. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The size. "
    },
    {
      "type": "field",
      "varNames": [
        "rotateX"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Scalar to aply to locate the rotation x point. "
    },
    {
      "type": "field",
      "varNames": [
        "rotateY"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Scalar to aply to locate the rotation y point. "
    },
    {
      "type": "field",
      "varNames": [
        "transform"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " A transform. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.MeterNeedle.MeterNeedle()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\r\n     * Creates a new needle.\r\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.needle.MeterNeedle.MeterNeedle(java.awt.Paint, java.awt.Paint, java.awt.Paint)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\r\n     * Creates a new needle.\r\n     *\r\n     * @param outline  the outline paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param fill  the fill paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param highlight  the highlight paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 120,col 40)",
        "(line 121,col 9)-(line 121,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getOutlinePaint()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\r\n     * Returns the outline paint.\r\n     *\r\n     * @return The outline paint.\r\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setOutlinePaint(java.awt.Paint)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\r\n     * Sets the outline paint.\r\n     *\r\n     * @param p  the new paint.\r\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getOutlineStroke()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the outline stroke.\r\n     *\r\n     * @return The outline stroke.\r\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setOutlineStroke(java.awt.Stroke)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\r\n     * Sets the outline stroke.\r\n     *\r\n     * @param s  the new stroke.\r\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getFillPaint()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\r\n     * Returns the fill paint.\r\n     *\r\n     * @return The fill paint.\r\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setFillPaint(java.awt.Paint)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\r\n     * Sets the fill paint.\r\n     *\r\n     * @param p  the fill paint.\r\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getHighlightPaint()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\r\n     * Returns the highlight paint.\r\n     *\r\n     * @return The highlight paint.\r\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setHighlightPaint(java.awt.Paint)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\r\n     * Sets the highlight paint.\r\n     *\r\n     * @param p  the highlight paint.\r\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getRotateX()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\r\n     * Returns the scalar used for determining the rotation x value.\r\n     *\r\n     * @return The x rotate scalar.\r\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setRotateX(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Sets the rotateX value.\r\n     *\r\n     * @param x  the new value.\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setRotateY(double)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\r\n     * Sets the rotateY value.\r\n     *\r\n     * @param y  the new value.\r\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getRotateY()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\r\n     * Returns the scalar used for determining the rotation y value.\r\n     *\r\n     * @return The y rotate scalar.\r\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double)",
      "begin_line": 257,
      "end_line": 266,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 49)",
        "(line 260,col 9)-(line 263,col 10)",
        "(line 264,col 9)-(line 264,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 276,
      "end_line": 287,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 40)",
        "(line 280,col 9)-(line 280,col 43)",
        "(line 282,col 9)-(line 282,col 64)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.drawNeedle(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, double)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\r\n     * Draws the needle.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param rotate  the rotation point.\r\n     * @param angle  the angle.\r\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.defaultDisplay(java.awt.Graphics2D, java.awt.Shape)",
      "begin_line": 307,
      "end_line": 320,
      "comment": "\r\n     * Displays a shape.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param shape  the shape.\r\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getSize()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\r\n     * Returns the size.\r\n     *\r\n     * @return The size.\r\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.setSize(int)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\r\n     * Sets the size.\r\n     *\r\n     * @param pixels  the new size.\r\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.getTransform()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\r\n     * Returns the transform.\r\n     *\r\n     * @return The transform.\r\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.equals(java.lang.Object)",
      "begin_line": 356,
      "end_line": 386,
      "comment": "\r\n     * Tests another object for equality with this object.\r\n     *\r\n     * @param obj the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 45)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.hashCode()",
      "begin_line": 393,
      "end_line": 402,
      "comment": "\r\n     * Returns a hash code for this instance.\r\n     *\r\n     * @return A hash code.\r\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 65)",
        "(line 395,col 9)-(line 395,col 69)",
        "(line 396,col 9)-(line 396,col 67)",
        "(line 397,col 9)-(line 397,col 68)",
        "(line 398,col 9)-(line 398,col 62)",
        "(line 399,col 9)-(line 399,col 62)",
        "(line 400,col 9)-(line 400,col 59)",
        "(line 401,col 9)-(line 401,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 411,
      "end_line": 417,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 413,col 64)",
        "(line 414,col 9)-(line 414,col 62)",
        "(line 415,col 9)-(line 415,col 59)",
        "(line 416,col 9)-(line 416,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.needle.MeterNeedle.readObject(java.io.ObjectInputStream)",
      "begin_line": 427,
      "end_line": 434,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 430,col 64)",
        "(line 431,col 9)-(line 431,col 62)",
        "(line 432,col 9)-(line 432,col 59)",
        "(line 433,col 9)-(line 433,col 64)"
      ]
    }
  ]
}