{
  "filepath": "/tmp/Chart-14b/source/org/jfree/chart/util/ShapeUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShapeUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 597,
      "comment": "\n * Utility methods for {@link Shape} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ShapeUtilities.ShapeUtilities()",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Prevents instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.clone(java.awt.Shape)",
      "begin_line": 101,
      "end_line": 112,
      "comment": "\n     * Returns a clone of the specified shape, or \u003ccode\u003enull\u003c/code\u003e.  At the \n     * current time, this method supports cloning for instances of \n     * \u003ccode\u003eLine2D\u003c/code\u003e, \u003ccode\u003eRectangularShape\u003c/code\u003e, \u003ccode\u003eArea\u003c/code\u003e \n     * and \u003ccode\u003eGeneralPath\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003eRectangularShape\u003c/code\u003e includes \u003ccode\u003eArc2D\u003c/code\u003e, \n     * \u003ccode\u003eEllipse2D\u003c/code\u003e, \u003ccode\u003eRectangle2D\u003c/code\u003e, \n     * \u003ccode\u003eRoundRectangle2D\u003c/code\u003e.\n     * \n     * @param shape  the shape to clone (\u003ccode\u003enull\u003c/code\u003e permitted, \n     *               returns \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @return A clone or \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 28)",
        "(line 111,col 9)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.Shape, java.awt.Shape)",
      "begin_line": 127,
      "end_line": 147,
      "comment": "\n     * Tests two shapes for equality.  If both shapes are \u003ccode\u003enull\u003c/code\u003e, \n     * this method will return \u003ccode\u003etrue\u003c/code\u003e. \n     * \u003cp\u003e\n     * In the current implementation, the following shapes are supported: \n     * \u003ccode\u003eEllipse2D\u003c/code\u003e, \u003ccode\u003eLine2D\u003c/code\u003e and \u003ccode\u003eRectangle2D\u003c/code\u003e \n     * (implicit).\n     * \n     * @param s1  the first shape (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param s2  the second shape (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Line2D, java.awt.geom.Line2D)",
      "begin_line": 158,
      "end_line": 172,
      "comment": "\n     * Compares two lines are returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or \n     * both \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param l1  the first line (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param l2  the second line (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Ellipse2D, java.awt.geom.Ellipse2D)",
      "begin_line": 183,
      "end_line": 194,
      "comment": "\n     * Compares two ellipses and returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or \n     * both \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param e1  the first ellipse (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param e2  the second ellipse (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Arc2D, java.awt.geom.Arc2D)",
      "begin_line": 205,
      "end_line": 225,
      "comment": "\n     * Compares two arcs and returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or \n     * both \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param a1  the first arc (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param a2  the second arc (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.Polygon, java.awt.Polygon)",
      "begin_line": 236,
      "end_line": 253,
      "comment": "\n     * Tests two polygons for equality.  If both are \u003ccode\u003enull\u003c/code\u003e this \n     * method returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @param p1  polygon 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param p2  polygon 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.GeneralPath, java.awt.geom.GeneralPath)",
      "begin_line": 264,
      "end_line": 296,
      "comment": "\n     * Tests two polygons for equality.  If both are \u003ccode\u003enull\u003c/code\u003e this \n     * method returns \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @param p1  path 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param p2  path 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 58)",
        "(line 275,col 9)-(line 275,col 58)",
        "(line 276,col 9)-(line 276,col 36)",
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 278,col 64)",
        "(line 279,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createTranslatedShape(java.awt.Shape, double, double)",
      "begin_line": 307,
      "end_line": 316,
      "comment": "\n     * Creates and returns a translated shape.\n     * \n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param transX  the x translation (in Java2D space).\n     * @param transY  the y translation (in Java2D space).\n     * \n     * @return The translated shape.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 312,col 9)",
        "(line 313,col 9)-(line 314,col 32)",
        "(line 315,col 9)-(line 315,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Translates a shape to a new location such that the anchor point \n     * (relative to the rectangular bounds of the shape) aligns with the \n     * specified (x, y) coordinate in Java2D space.\n     *  \n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param locationX  the x-coordinate (in Java2D space).\n     * @param locationY  the y-coordinate (in Java2D space).\n     * \n     * @return A new and translated shape.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 341,col 24)",
        "(line 342,col 9)-(line 343,col 80)",
        "(line 344,col 9)-(line 344,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.rotateShape(java.awt.Shape, double, float, float)",
      "begin_line": 358,
      "end_line": 366,
      "comment": "\n     * Rotates a shape about the specified coordinates.\n     * \n     * @param base  the shape (\u003ccode\u003enull\u003c/code\u003e permitted, returns \n     *              \u003ccode\u003enull\u003c/code\u003e).\n     * @param angle  the angle (in radians).\n     * @param x  the x coordinate for the rotation point (in Java2D space).\n     * @param y  the y coordinate for the rotation point (in Java2D space).\n     * \n     * @return the rotated shape.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 80)",
        "(line 364,col 9)-(line 364,col 59)",
        "(line 365,col 9)-(line 365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.drawRotatedShape(java.awt.Graphics2D, java.awt.Shape, double, float, float)",
      "begin_line": 377,
      "end_line": 386,
      "comment": "\n     * Draws a shape with the specified rotation about \u003ccode\u003e(x, y)\u003c/code\u003e.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param angle  the angle (in radians).\n     * @param x  the x coordinate for the rotation point.\n     * @param y  the y coordinate for the rotation point.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 50)",
        "(line 381,col 9)-(line 381,col 80)",
        "(line 382,col 9)-(line 382,col 29)",
        "(line 383,col 9)-(line 383,col 23)",
        "(line 384,col 9)-(line 384,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " A useful constant used internally. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDiagonalCross(float, float)",
      "begin_line": 399,
      "end_line": 415,
      "comment": "\n     * Creates a diagonal cross shape.\n     * \n     * @param l  the length of each \u0027arm\u0027.\n     * @param t  the thickness.\n     * \n     * @return A diagonal cross shape.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 43)",
        "(line 401,col 9)-(line 401,col 34)",
        "(line 402,col 9)-(line 402,col 34)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 404,col 9)-(line 404,col 33)",
        "(line 405,col 9)-(line 405,col 33)",
        "(line 406,col 9)-(line 406,col 35)",
        "(line 407,col 9)-(line 407,col 32)",
        "(line 408,col 9)-(line 408,col 32)",
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 410,col 33)",
        "(line 411,col 9)-(line 411,col 33)",
        "(line 412,col 9)-(line 412,col 36)",
        "(line 413,col 9)-(line 413,col 23)",
        "(line 414,col 9)-(line 414,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createRegularCross(float, float)",
      "begin_line": 425,
      "end_line": 441,
      "comment": "\n     * Creates a diagonal cross shape.\n     * \n     * @param l  the length of each \u0027arm\u0027.\n     * @param t  the thickness.\n     * \n     * @return A diagonal cross shape.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 43)",
        "(line 427,col 9)-(line 427,col 25)",
        "(line 428,col 9)-(line 428,col 25)",
        "(line 429,col 9)-(line 429,col 25)",
        "(line 430,col 9)-(line 430,col 24)",
        "(line 431,col 9)-(line 431,col 24)",
        "(line 432,col 9)-(line 432,col 24)",
        "(line 433,col 9)-(line 433,col 25)",
        "(line 434,col 9)-(line 434,col 25)",
        "(line 435,col 9)-(line 435,col 25)",
        "(line 436,col 9)-(line 436,col 26)",
        "(line 437,col 9)-(line 437,col 26)",
        "(line 438,col 9)-(line 438,col 26)",
        "(line 439,col 9)-(line 439,col 23)",
        "(line 440,col 9)-(line 440,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDiamond(float)",
      "begin_line": 450,
      "end_line": 458,
      "comment": "\n     * Creates a diamond shape.\n     * \n     * @param s  the size factor (equal to half the height of the diamond).\n     * \n     * @return A diamond shape.\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 43)",
        "(line 452,col 9)-(line 452,col 28)",
        "(line 453,col 9)-(line 453,col 27)",
        "(line 454,col 9)-(line 454,col 27)",
        "(line 455,col 9)-(line 455,col 28)",
        "(line 456,col 9)-(line 456,col 23)",
        "(line 457,col 9)-(line 457,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createUpTriangle(float)",
      "begin_line": 467,
      "end_line": 474,
      "comment": "\n     * Creates a triangle shape that points upwards.\n     * \n     * @param s  the size factor (equal to half the height of the triangle).\n     * \n     * @return A triangle shape.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 43)",
        "(line 469,col 9)-(line 469,col 28)",
        "(line 470,col 9)-(line 470,col 24)",
        "(line 471,col 9)-(line 471,col 25)",
        "(line 472,col 9)-(line 472,col 23)",
        "(line 473,col 9)-(line 473,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDownTriangle(float)",
      "begin_line": 483,
      "end_line": 490,
      "comment": "\n     * Creates a triangle shape that points downwards.\n     * \n     * @param s  the size factor (equal to half the height of the triangle).\n     * \n     * @return A triangle shape.\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 43)",
        "(line 485,col 9)-(line 485,col 27)",
        "(line 486,col 9)-(line 486,col 25)",
        "(line 487,col 9)-(line 487,col 26)",
        "(line 488,col 9)-(line 488,col 23)",
        "(line 489,col 9)-(line 489,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createLineRegion(java.awt.geom.Line2D, float)",
      "begin_line": 502,
      "end_line": 527,
      "comment": "\n     * Creates a region surrounding a line segment by \u0027widening\u0027 the line \n     * segment.  A typical use for this method is the creation of a \n     * \u0027clickable\u0027 region for a line that is displayed on-screen.\n     * \n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param width  the width of the region.\n     * \n     * @return A region that surrounds the line.\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 47)",
        "(line 504,col 9)-(line 504,col 40)",
        "(line 505,col 9)-(line 505,col 40)",
        "(line 506,col 9)-(line 506,col 40)",
        "(line 507,col 9)-(line 507,col 40)",
        "(line 508,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.getPointInRectangle(double, double, java.awt.geom.Rectangle2D)",
      "begin_line": 542,
      "end_line": 549,
      "comment": "\n     * Returns a point based on (x, y) but constrained to be within the bounds \n     * of a given rectangle.\n     *\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     * @param area  the constraining rectangle (\u003ccode\u003enull\u003c/code\u003e not \n     *              permitted).\n     *\n     * @return A point within the rectangle.\n     * \n     * @throws NullPointerException if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 66)",
        "(line 546,col 9)-(line 546,col 66)",
        "(line 547,col 9)-(line 547,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.contains(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 560,
      "end_line": 573,
      "comment": "\n     * Checks, whether the given rectangle1 fully contains rectangle 2\n     * (even if rectangle 2 has a height or width of zero!).\n     *\n     * @param rect1  the first rectangle.\n     * @param rect2  the second rectangle.\n     * \n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 33)",
        "(line 563,col 9)-(line 563,col 33)",
        "(line 564,col 9)-(line 564,col 32)",
        "(line 565,col 9)-(line 565,col 32)",
        "(line 566,col 9)-(line 566,col 36)",
        "(line 567,col 9)-(line 567,col 37)",
        "(line 569,col 9)-(line 571,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.intersects(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 585,
      "end_line": 596,
      "comment": "\n     * Checks, whether the given rectangle1 fully contains rectangle 2\n     * (even if rectangle 2 has a height or width of zero!).\n     *\n     * @param rect1  the first rectangle.\n     * @param rect2  the second rectangle.\n     *\n     * @return A boolean.\n     ",
      "child_ranges": [
        "(line 587,col 7)-(line 587,col 31)",
        "(line 588,col 7)-(line 588,col 31)",
        "(line 590,col 7)-(line 590,col 30)",
        "(line 591,col 7)-(line 591,col 38)",
        "(line 592,col 7)-(line 592,col 30)",
        "(line 593,col 7)-(line 593,col 40)",
        "(line 594,col 7)-(line 595,col 46)"
      ]
    }
  ]
}